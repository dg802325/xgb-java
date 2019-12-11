package com.xgb.service;

import com.github.tobato.fastdfs.domain.FileInfo;
import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.exception.FdfsUnsupportStorePathException;
import com.github.tobato.fastdfs.proto.storage.DownloadCallback;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import com.github.tobato.fastdfs.service.TrackerClient;
import com.xgb.util.UUIDUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * FastDFS文件上传下载包装类
 */
//@Slf4j
@Service
public class FastDFSClientService {
    private static Logger logger = LoggerFactory.getLogger(FastDFSClientService.class);
    @Autowired
    private FastFileStorageClient storageClient;

    @Resource
    protected TrackerClient trackerClient;

    @Value("${fdfs.protocol}")
    private String protocol;

    @Value("${fdfs.resHost}")
    private String resHost;

    @Value("${fdfs.storagePort}")
    private String storagePort;

    /**
     * 上传文件
     *
     * @param file 文件对象
     * @return 文件访问地址
     * @throws IOException
     */
    public String uploadFile(MultipartFile file) throws IOException {
        StorePath storePath = storageClient.uploadFile(file.getInputStream(), file.getSize(), FilenameUtils.getExtension(file.getOriginalFilename()), null);
        String fileUrl = storePath.getFullPath();
        logger.trace("上传文件访问地址：" + fileUrl);
        return fileUrl;
    }

    /**
     * 将一段字符串生成一个文件上传
     *
     * @param content       文件内容
     * @param fileExtension
     * @return
     */
    public String uploadFile(String content, String fileExtension) {
        byte[] buff = content.getBytes(Charset.forName("UTF-8"));
        ByteArrayInputStream stream = new ByteArrayInputStream(buff);
        StorePath storePath = storageClient.uploadFile(stream, buff.length, fileExtension, null);
        String fileUrl = storePath.getFullPath();
        logger.trace("上传文件访问地址：" + fileUrl);
        return fileUrl;
    }

    // 封装完整URL地址
    public String getResAccessUrl(String storeUrl) {
        String fileUrl = protocol+"://" + resHost + ":" + storagePort + "/" + storeUrl;
        return fileUrl;
    }

    /**
     * 打开文件流
     *
     * @param storeUrl fastDFS中的url
     * @return
     */
    public File download(String storeUrl) {
        StorePath storePath = StorePath.praseFromUrl(storeUrl);
        DownloadCallback<File> callback = new DownloadCallback<File>() {
            @Override
            public File recv(InputStream ins) throws IOException {
                String tempFilename = UUIDUtils.nextID("fast-downtmp");
                String suffixName = ".tmp";
                File dest = File.createTempFile(tempFilename, suffixName);
                logger.debug("download to: " + dest.getAbsolutePath());
                FileUtils.copyInputStreamToFile(ins, dest);
                return dest;
            }
        };
        File file = storageClient.downloadFile(storePath.getGroup(), storePath.getPath(), callback);
        return file;
    }

    /**
     * 删除文件
     *
     * @param fileUrl 文件访问地址
     * @return
     */
    public void deleteFile(String fileUrl) {
        if (StringUtils.isEmpty(fileUrl)) {
            return;
        }
        StorePath storePath = StorePath.praseFromUrl(fileUrl);
        storageClient.deleteFile(storePath.getGroup(), storePath.getPath());
    }

    /**
     * @param fileUrl 通过访问地址获取文件信息
     * @return
     */
    public FileInfo getFileByUrl(String fileUrl) {
        if (StringUtils.isEmpty(fileUrl)) {
            return null;
        }
        FileInfo file = null;
        try {
            StorePath storePath = StorePath.praseFromUrl(fileUrl);
            file = storageClient.queryFileInfo(storePath.getGroup(), storePath.getPath());
            System.out.println(file.getFileSize());
            System.out.println(file);
        } catch (FdfsUnsupportStorePathException e) {
            logger.warn(e.getMessage());
        }
        return file;
    }
}