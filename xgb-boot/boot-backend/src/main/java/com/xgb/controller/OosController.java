package com.xgb.controller;

import com.xgb.lang.R;
import com.xgb.model.FastDFSVO;
import com.xgb.utils.MasterKeyID;
import com.xgb.utils.MyUtils;
import org.apache.commons.io.FileUtils;
import org.omg.CORBA.OBJ_ADAPTER;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.support.StandardMultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Controller
public class OosController {

    @Value("${boot.oss.url}")
    public String fastUrl;

    /**
     * 上传图片
     *
     * @param request
     */
    @ResponseBody
    @RequestMapping(value = "/admin/upload/pictureUrl", method = RequestMethod.POST)
    public R uploadResource(StandardMultipartHttpServletRequest request) {
        Map<String, MultipartFile> fileMap = request.getFileMap();
        for(String keys : fileMap.keySet()){
            MultipartFile file = fileMap.get(keys);
            String fileUrl = "";
            try {
                // 创建临时文件
                String fileName = file.getOriginalFilename();
                String suffixName = MyUtils.getFileSuffix(fileName);
                File tmpFile = File.createTempFile(MasterKeyID.nextID("fastTemp"), "." + suffixName);//创建临时文件
                file.transferTo(tmpFile);
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
                map.put("url", fileUrl);
                return R.ok("data",map, "上传成功");
            } catch (Exception e) {
                return R.error(999, "上传失败");
            }
        }
        return R.error(998,"上传失败");
    }
}
