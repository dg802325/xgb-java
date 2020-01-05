/*
 * TOP SECRET
 * Copyright 2006-2015 Transsion.com All right reserved. This software is the
 * confidential and proprietary information of Transsion.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Transsion.com.
 */
package com.xgb.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/** 
 * ClassName:FileUtil <br/> 
 * Date: 2019年7月26日 下午11:05:05 <br/>
 * @author   @author 295841112@qq.com
 * @Blog
 * @version  
 * @see       
 */
public class FileUtils {
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
            if (!MyTools.isEmpty(line)) {
                fileList.add(line);
            }
        }
        br.close();
        fr.close();
        return fileList;
    }
    /**
     * 判断目录是否存在 不存在则创建目录
     *
     * @param path
     */
    public static void CreatFileDir(String path)  {
        try {
            File file = new File(path);
            if(file.getParentFile().isDirectory()){//判断上级目录是否是目录
                if(!file.exists()){   //如果文件目录不存在
                    file.mkdirs();  //创建文件目录
                }
            }else{
                throw new Exception("传入目录非标准目录名");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除目录（文件夹）以及目录下的文件
     *
     * @param dir
     *            被删除目录的文件路径
     * @return 目录删除成功返回true,否则返回false
     */
    public static boolean deleteDirectory(String dir) {
        try {
            // 如果dir不以文件分隔符结尾，自动添加文件分隔符
            if (!dir.endsWith(File.separator)) {
                dir = dir + File.separator;
            }
            File dirFile = new File(dir);
            // 如果dir对应的文件不存在，或者不是一个目录，则退出
            if (!dirFile.exists() || !dirFile.isDirectory()) {
                System.out.println("删除目录失败" + dir + "目录不存在！");
                return false;
            }
            boolean flag = true;
            // 删除文件夹下的所有文件(包括子目录)
            File[] files = dirFile.listFiles();
            for (int i = 0; i < files.length; i++) {
                // 删除子文件
                if (files[i].isFile()) {
                    flag = deleteFile(files[i].getAbsolutePath());
                    if (!flag) {
                        break;
                    }
                }
                // 删除子目录
                else {
                    flag = deleteDirectory(files[i].getAbsolutePath());
                    if (!flag) {
                        break;
                    }
                }
            }
            if (!flag) {
                System.out.println("删除目录失败");
                return false;
            }
            // 删除当前目录
            if (dirFile.delete()) {
                System.out.println("删除目录" + dir + "成功！");
                return true;
            } else {
                System.out.println("删除目录" + dir + "失败！");
                return false;
            }
        }catch (Exception e){
            return true;
        }
    }

    /**
     * 删除单个文件
     *
     * @param fileName
     *            被删除文件的文件名
     * @return 单个文件删除成功返回true,否则返回false
     */
    public static boolean deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.isFile() && file.exists()) {
            file.delete();
            System.out.println("删除单个文件" + fileName + "成功！");
            return true;
        } else {
            System.out.println("删除单个文件" + fileName + "失败！");
            return false;
        }
    }

}
