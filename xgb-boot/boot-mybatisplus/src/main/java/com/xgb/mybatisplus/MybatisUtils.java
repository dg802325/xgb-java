package com.xgb.mybatisplus;

import com.xgb.model.SysMabtaisPlus;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 邓根
 * @Date: 2019/8/28 16:48
 * @Description:
 */
@Service
public class MybatisUtils {
    public Connection getConnection(String jdbcDriver, String dbUrl, String username, String password){
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

    public void closeConn(Connection conn){
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<SysMabtaisPlus> getTables(Connection conn) {
        List<SysMabtaisPlus> lists = new ArrayList<>();
        DatabaseMetaData dbMetData = null;
        try {
            dbMetData = conn.getMetaData();
            ResultSet rs = dbMetData.getTables(null, null, null, new String[] { "TABLE" });
            while (rs.next()) {
                SysMabtaisPlus sysMabtaisPlus = new SysMabtaisPlus();
                sysMabtaisPlus.setTableName(rs.getString("TABLE_NAME"));
                sysMabtaisPlus.setTableType(rs.getString("TABLE_TYPE"));
                sysMabtaisPlus.setTableCat(rs.getString("TABLE_CAT"));
                sysMabtaisPlus.setTableRemark(rs.getString("REMARKS"));
                lists.add(sysMabtaisPlus);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lists;
    }
}
