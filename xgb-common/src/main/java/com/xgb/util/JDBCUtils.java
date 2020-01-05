package com.xgb.util;

import com.xgb.entity.TableInfo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCUtils {

    /**
     * 建立数据库连接
     * @param jdbcDriver
     * @param dbUrl
     * @param username
     * @param password
     * @return
     */
    public static Connection getConnection(String jdbcDriver, String dbUrl, String username, String password){
        Connection conn = null;
        try {
            //连接驱动
            Class.forName(jdbcDriver);
            conn = DriverManager.getConnection(dbUrl, username, password);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * 关闭数据库连接
     * @param conn
     */
    public static void closeConn(Connection conn){
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 根据连接获取数据库表 的基础信息
     * @param conn
     * @return
     * @throws SQLException
     */
    public static List<TableInfo> getTables(Connection conn) throws SQLException {
        List<TableInfo> lists = new ArrayList<TableInfo>();
        DatabaseMetaData dbMetData = null;
        dbMetData = conn.getMetaData();
        ResultSet rs = dbMetData.getTables(null, null, null, new String[] { "TABLE" });
        while (rs.next()) {
            TableInfo tableInfo = new TableInfo();
            tableInfo.setTableName(rs.getString("TABLE_NAME"));
            tableInfo.setTableType(rs.getString("TABLE_TYPE"));
            tableInfo.setTableCat(rs.getString("TABLE_CAT"));
            tableInfo.setTableRemark(rs.getString("REMARKS"));
            lists.add(tableInfo);
        }
        return lists;
    }

    /**
     * 根据数据库库类型获得对应的Driver
     * @param sqlType
     * @return
     */
    public static String getDriver(String sqlType){
        if(sqlType.equals("MYSQL")){
            return "com.mysql.jdbc.Driver";
        }else {
            return "未找到对应的类型";
        }
    }

    /**
     * 根据参数拼接 dbUrl
     * @param sqlType
     * @param databaseUrl
     * @param portNumber
     * @param dataName
     * @return
     */
    public static String getSqlType(String sqlType, String databaseUrl, String portNumber, String dataName){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("jdbc:");
        if("MYSQL".equals(sqlType)){
            stringBuffer.append("mysql://");
        }else {
            return "未找到对应的类型";
        }
        stringBuffer.append(databaseUrl);
        stringBuffer.append(":"+portNumber);
        stringBuffer.append("/"+dataName+"?useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&serverTimezone=Asia/Shanghai");
        return stringBuffer.toString();
    }
}
