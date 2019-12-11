package com.xgb.controller;

import com.xgb.common.SessionUtil;
import com.xgb.entity.R;
import com.xgb.model.FastDFSVO;
import com.xgb.model.SysOss;
import com.xgb.service.SysOssService;
import com.xgb.utils.MasterKeyID;
import com.xgb.util.MyTools;
import com.xgb.util.UUIDUtils;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import net.coobird.thumbnailator.Thumbnails;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
@Controller
@RequestMapping("/admin/")
public class SysOssController {

    protected static final Logger logger = LoggerFactory.getLogger(SysOssController.class);

    @Autowired
    private SysOssService sysOssService;

    @Value("${boot.oss.url}")
    public String fastUrl;

    /**
     * 上传文件记录文件信息
     *
     * @param file
     */
    @ResponseBody
    @PostMapping("/upload/file")
    public R uploadResource(MultipartFile file) {
        logger.info("------request-address-----------------：/admin/upload/file");
        String fileUrl = "";
        try {
            // 创建临时文件
            String fileName = file.getOriginalFilename();
            String suffixName = MyUtils.getFileSuffix(fileName);
            File tmpFile = File.createTempFile(MasterKeyID.nextID("fastTemp"), "." + suffixName);//创建临时文件
            file.transferTo(tmpFile);
            BufferedImage bufferedImage = ImageIO.read(tmpFile); // 通过临时文件获取图片流
            if (bufferedImage != null) {
                // 如果文件是图片，对图片进行压缩 只压缩大小，不压缩尺寸
                Thumbnails.of(tmpFile).scale(1f).outputQuality(0.25f).toFile(tmpFile);
            }
            // 请求参数
            MultiValueMap<String, Object> requestEntity = new LinkedMultiValueMap<>();
            FileSystemResource resource = new FileSystemResource(tmpFile);
            requestEntity.add("file", resource);
            // 发送请求
            HttpEntity<MultiValueMap<String, Object>> httpEntity = new HttpEntity<>(requestEntity, null);
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<FastDFSVO> responseEntity = restTemplate.exchange(fastUrl + "/upload/file", HttpMethod.POST, httpEntity, FastDFSVO.class);
            FastDFSVO result = responseEntity.getBody();
            fileUrl = result.getUrl();
            FileUtils.forceDelete(tmpFile); // 删除临时文件
            Map<String, Object> map = new HashMap<>();
            map.put("fileUrl", fileUrl);
            //获得当前登录人
            String sysUserId = SessionUtil.getSysUserId();
            //返回成功前  保存图片信息
            SysOss sysOss = new SysOss();
            sysOss.setId(UUIDUtils.getUUID());
            sysOss.setCreateId(sysUserId);
            sysOss.setCreateTime(new Date());
            sysOss.setOosUrl(fileUrl);
            sysOss.setOosName(fileName);
            sysOss.setOosSuffix(suffixName);
            sysOss.setOosType(getOssType(suffixName));
            int insert = sysOssService.insert(sysOss);
            if(insert>0){
                return R.ok(map, "上传成功");
            }else {
                return R.error(999,"上传成功，保存信息失败");
            }
        } catch (Exception e) {
            return R.error(999, "上传失败");
        }
    }

    public String getOssType(String ossType){
        //图片数组
        String img[] = { "bmp", "jpg", "jpeg", "png", "tiff", "gif", "pcx", "tga", "exif", "fpx", "svg", "psd","cdr", "pcd", "dxf", "ufo", "eps", "ai", "raw", "wmf" };
        boolean isImg = Arrays.asList(img).contains(ossType);
        //文档数组
        String document[] = { "txt", "doc", "docx", "xls", "htm", "html", "jsp", "rtf", "wpd", "pdf", "ppt" };
        boolean isDocument = Arrays.asList(document).contains(ossType);
        //创建视频类型数组
        String video[] = { "mp4", "avi", "mov", "wmv", "asf", "navi", "3gp", "mkv", "f4v", "rmvb", "webm" };
        boolean isVideo = Arrays.asList(video).contains(ossType);
        //创建音乐类型数组
        String music[] = { "mp3", "wma", "wav", "mod", "ra", "cd", "md", "asf", "aac", "vqf", "ape", "mid", "ogg","m4a", "vqf" };
        boolean isMusic = Arrays.asList(music).contains(ossType);
        if(isImg){
            return "图片";
        }else if(isDocument){
            return "文档";
        }else if(isVideo){
            return "视频";
        }else if(isMusic){
            return "音乐";
        }
        return "未知类型";
    }
}
