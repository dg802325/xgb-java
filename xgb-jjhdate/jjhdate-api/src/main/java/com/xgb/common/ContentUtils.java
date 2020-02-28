package com.xgb.common;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ContentUtils {


    public static String saveContent(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // 获得Connection对象
            conn = GbaseUtils.getConnection();
            // 编写SQL语句
            String sql = "insert into jc_content()";

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 释放资源
            GbaseUtils.release(conn, stmt, rs);
        }
        return "success";
    }

    public static void main(String[] args) {
        String s = saveContent();

    }
}
