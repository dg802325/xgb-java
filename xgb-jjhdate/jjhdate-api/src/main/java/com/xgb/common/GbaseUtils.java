package com.xgb.common;

import java.sql.*;

public class GbaseUtils {


    static {
        // 这里的代码只执行一次！！！注册驱动就要一次！！！
        try {
            Class.forName(Constant.GBASE_DRIVER);
        } catch (ClassNotFoundException e) {
            // 报错说明要么权限定类名写错，要么没有给MySQL的驱动包！
            e.printStackTrace();
        }

    }

    /**
     * 获得连接对象
     */
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(Constant.GBASE_URL, Constant.GBASE_USERNAME, Constant.GBASE_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * 释放资源
     */
    public static void release(Connection conn, Statement stmt, ResultSet rs) {
        if (rs != null)
            try {
                rs.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }

        if (stmt != null)
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        if (conn != null)
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

    }

}
