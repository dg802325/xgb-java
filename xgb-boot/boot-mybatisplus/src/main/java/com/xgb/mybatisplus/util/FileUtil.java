/*
 * TOP SECRET
 * Copyright 2006-2015 Transsion.com All right reserved. This software is the
 * confidential and proprietary information of Transsion.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Transsion.com.
 */
package com.xgb.mybatisplus.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/** 
 * ClassName:FileUtil <br/> 
 * Date: 2019年7月26日 下午11:05:05 <br/>
 * @author   @author 295841112@qq.com
 * @Blog     http://www.lovexgb.com(域名是有了，就是不知道多会会用。。。。)
 * @version  
 * @see       
 */
public class FileUtil {
    /**
     * 将文件读入的list中返回，每个element包含一行内容
     * 
     * @param filePath
     * @return
     * @throws IOException
     */
    public static List<String> readFile2List(String filePath) throws IOException {
        FileReader fr = new FileReader(filePath);
        return readFile2List(fr);
    }
    /**
     * 将文件读入的list中返回，每个element包含一行内容
     * 
     * @param fr
     * @return
     * @throws IOException
     */
    public static List<String> readFile2List(InputStreamReader fr) throws IOException {
        List<String> fileList = new ArrayList<String>();
        BufferedReader br = new BufferedReader(fr);
        String line = null;
        while ((line = br.readLine()) != null) {
            if (!StringUtils.isEmpty(line)) {
                fileList.add(line);
            }
        }
        br.close();
        fr.close();
        return fileList;
    }
}
