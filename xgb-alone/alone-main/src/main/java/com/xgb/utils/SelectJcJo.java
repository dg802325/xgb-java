package com.xgb.utils;

import com.xgb.common.GbaseUtils;
import com.xgb.model.jojc;
import com.xgb.util.MyTools;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectJcJo {

    public static Connection conn = GbaseUtils.getConnection();


    public static jojc selectByXintitle(jojc jj,String name) {
        Integer userId = null;
        if (MyTools.isNotEmpty(name)) {

            String sql = "select user_id from jc_user where username = '" + name + "'";
            Statement stmt = null;
            ResultSet rs = null;
            try {
                stmt = conn.createStatement();
                rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    jj.setSqlId(rs.getInt("user_id"));
                    return jj;
                }
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }
}
