package com.xgb.common;

import com.xgb.util.MyTools;

import java.io.BufferedWriter;
import java.io.IOException;

public class Utils {

    public static String getResourceBasePath() {
        return System.getProperty("user.dir");
    }

    public static void writeTxt(BufferedWriter writer, String s){
        try {
            writer.write(s);
        } catch (IOException e) {
            System.out.println("写入失败");
        }
    }


    public static void  close(BufferedWriter writer){
        if(MyTools.isNotEmpty(writer)){
            try {
                writer.flush();
                writer.close();
            } catch (IOException e) {
                System.out.println("关闭失败");
            }
        }
    }
}
