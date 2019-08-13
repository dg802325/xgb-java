package controller;

import com.xgb.error.ApiResultCodeEnum;
import com.xgb.model.FastDFSVO;
import com.xgb.utils.MyUtils;
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
import service.FastDFSClientService;

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
    public FastDFSVO upload(String content, String ext) {
        FastDFSVO fastDFSVO = new FastDFSVO();
        if (MyUtils.isOneEmpty(content, ext)) {
            fastDFSVO.setCode(ApiResultCodeEnum.ERROR.getCode());
            fastDFSVO.setMessage("请求参数不全!");
            logger.warn("上传文本的内容，扩展名不能为空!");
        } else {
            String msgObj = null;
            try {
                msgObj = new String(Base64Utils.decodeFromString(content), StandardCharsets.UTF_8.name());
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                logger.error("待上传的文本内容解码出错! " + e.getMessage());
                fastDFSVO.setCode(ApiResultCodeEnum.ERROR.getCode());
                fastDFSVO.setMessage("待上传的文本内容解码出错! " + e.getMessage());
            }
            String url = fastDFSClientService.uploadFile(msgObj, ext);
            fastDFSVO.setUrl(fastDFSClientService.getResAccessUrl(url)); // 资源全路径
            fastDFSVO.setCode(ApiResultCodeEnum.SUCCESS.getCode()); //成功
            fastDFSVO.setMessage("上传文件成功!");
            logger.debug("上传文件成功:" + url);
        }
        return fastDFSVO;
    }


    /**
     * 文件上传
     *
     * @param file
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/upload/file", method = RequestMethod.POST)
    public FastDFSVO upload(MultipartFile file) {
        FastDFSVO fastDFSVO = new FastDFSVO();
        if (MyUtils.isEmpty(file)) {
            fastDFSVO.setCode(ApiResultCodeEnum.ERROR.getCode());
            fastDFSVO.setMessage("上传文件不能为空!");
            logger.warn("上传文件不能为空!");
        } else {
            try {
                String url = fastDFSClientService.uploadFile(file);   // 资源存储路径
                fastDFSVO.setUrl(fastDFSClientService.getResAccessUrl(url)); // 资源全路径
                fastDFSVO.setCode(ApiResultCodeEnum.SUCCESS.getCode());
                fastDFSVO.setMessage("上传文件成功!");
                logger.debug("上传文件成功:" + url);
            } catch (IOException e) {
                logger.error("上传文件异常！" + e.getMessage());
                fastDFSVO.setCode(ApiResultCodeEnum.ERROR.getCode()); // 上传文件异常
                fastDFSVO.setMessage("上传文件异常!" + e.getMessage()); // 上传文件异常
            }
        }
        return fastDFSVO;
    }


    /**
     * 删除文件
     *
     * @param url
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public FastDFSVO delete(String url) {
        FastDFSVO fastDFSVO = new FastDFSVO();
        if (MyUtils.isEmpty(url)) {
            fastDFSVO.setCode(ApiResultCodeEnum.ERROR.getCode());
            fastDFSVO.setMessage("请求参数不全!");
            logger.warn("上传文本的内容，扩展名不能为空!");
        } else {
            try {
                fastDFSClientService.deleteFile(url);
                fastDFSVO.setCode(ApiResultCodeEnum.SUCCESS.getCode()); //成功
                fastDFSVO.setMessage("文件删除成功!");
                logger.debug("已删除文件:" + url);
            } catch (Exception e) {
                logger.error("删除文件异常！" + e.getMessage());
                fastDFSVO.setCode(ApiResultCodeEnum.ERROR.getCode());
                fastDFSVO.setMessage("删除文件异常！" + e.getMessage());
            }
        }
        return fastDFSVO;
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