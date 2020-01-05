package com.xgb.controller;

import com.xgb.code.ResultCode;
import com.xgb.entity.FastDFS;
import com.xgb.service.FastDFSClientService;
import com.xgb.util.MyTools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.util.Base64Utils;
import org.springframework.util.unit.DataSize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.MultipartConfigElement;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

//@Slf4j
@Controller
@RequestMapping("/fastdfs")
public class   FastDFSController {
    private static Logger logger = LoggerFactory.getLogger(FastDFSController.class);
    @Autowired
    public FastDFSClientService fastDFSClientService;


    /**
     * 文本内容直接生成 fastDSF文件保存
     *
     * @param content base64编码
     * @param ext
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/upload/text", method = RequestMethod.POST)
    public FastDFS upload(String content, String ext) {
        FastDFS FastDFS = new FastDFS();
        if (MyTools.isOneEmpty(content, ext)) {
            FastDFS.setCode(ResultCode.ERROR.getCode());
            FastDFS.setMessage("请求参数不全!");
            logger.warn("上传文本的内容，扩展名不能为空!");
        } else {
            String msgObj = null;
            try {
                msgObj = new String(Base64Utils.decodeFromString(content), StandardCharsets.UTF_8.name());
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                logger.error("待上传的文本内容解码出错! " + e.getMessage());
                FastDFS.setCode(ResultCode.ERROR.getCode());
                FastDFS.setMessage("待上传的文本内容解码出错! " + e.getMessage());
            }
            String url = fastDFSClientService.uploadFile(msgObj, ext);
            FastDFS.setUrl(fastDFSClientService.getResAccessUrl(url)); // 资源全路径
            FastDFS.setCode(ResultCode.SUCCESS.getCode()); //成功
            FastDFS.setMessage("上传文件成功!");
            logger.debug("上传文件成功:" + url);
        }
        return FastDFS;
    }


    /**
     * 文件上传
     *
     * @param file
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/upload/file", method = RequestMethod.POST)
    public FastDFS upload(MultipartFile file) {
        FastDFS FastDFS = new FastDFS();
        if (MyTools.isEmpty(file)) {
            FastDFS.setCode(ResultCode.ERROR.getCode());
            FastDFS.setMessage("上传文件不能为空!");
            logger.warn("上传文件不能为空!");
        } else {
            try {
                String url = fastDFSClientService.uploadFile(file);   // 资源存储路径
                FastDFS.setUrl(fastDFSClientService.getResAccessUrl(url)); // 资源全路径
                FastDFS.setCode(ResultCode.SUCCESS.getCode());
                FastDFS.setMessage("上传文件成功!");
                logger.debug("上传文件成功:" + url);
            } catch (IOException e) {
                logger.error("上传文件异常！" + e.getMessage());
                FastDFS.setCode(ResultCode.ERROR.getCode()); // 上传文件异常
                FastDFS.setMessage("上传文件异常!" + e.getMessage()); // 上传文件异常
            }
        }
        return FastDFS;
    }


    /**
     * 删除文件
     *
     * @param url
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public FastDFS delete(String url) {
        FastDFS FastDFS = new FastDFS();
        if (MyTools.isEmpty(url)) {
            FastDFS.setCode(ResultCode.ERROR.getCode());
            FastDFS.setMessage("请求参数不全!");
            logger.warn("上传文本的内容，扩展名不能为空!");
        } else {
            try {
                fastDFSClientService.deleteFile(url);
                FastDFS.setCode(ResultCode.SUCCESS.getCode()); //成功
                FastDFS.setMessage("文件删除成功!");
                logger.debug("已删除文件:" + url);
            } catch (Exception e) {
                logger.error("删除文件异常！" + e.getMessage());
                FastDFS.setCode(ResultCode.ERROR.getCode());
                FastDFS.setMessage("删除文件异常！" + e.getMessage());
            }
        }
        return FastDFS;
    }

    /**
     * 查看文件
     *
     * @param url
     * @return
     */
    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public void show(String url, HttpServletResponse response) {
        OutputStream output = null;
        try {
            String contentType = Files.probeContentType(new File(url).toPath());
            response.setContentType(contentType);
            output = response.getOutputStream();
            URL resUrl = new URL(fastDFSClientService.getResAccessUrl(url));
            HttpURLConnection conn = (HttpURLConnection) resUrl.openConnection();
            InputStream inputStream = conn.getInputStream();
            byte[] bts = new byte[8192];
            int len = -1;
            while ((len = inputStream.read(bts)) != -1) {
                output.write(bts, 0, len);
            }
        } catch (Exception e) {
            logger.error("资源获取异常！" + e.getMessage());
        } finally {
            try {
                output.close();
            } catch (IOException e) {
            }
        }
    }

    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //上传临时文件路径
        factory.setLocation("/usr/tmp");
        //单个文件最大
        factory.setMaxFileSize(DataSize.parse(("100MB"))); //KB,MB
        /// 设置总上传数据总大小
        factory.setMaxRequestSize(DataSize.parse("500MB"));
        return factory.createMultipartConfig();
    }
}