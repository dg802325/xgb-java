package com.xgb.service;

import com.xgb.common.GbaseUtils;
import com.xgb.util.MyTools;

import java.sql.*;

public class Test {

    public static void main(String[] args) {
        Connection conn = GbaseUtils.getConnection();
        String sql = "select * from jc_shzz_detail where code = '53120000MJY089130M'";
//        PreparedStatement ps = null;
        Statement stmt = null;
        ResultSet rs = null;
        Integer jcShzzDetailId =null;
        try{
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            if (rs != null) {
                if(MyTools.isNotEmpty(rs.next())){
                    while(rs.next()){
                        jcShzzDetailId = rs.getInt("id");
                    }
                }
            }
            System.out.println(jcShzzDetailId);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            GbaseUtils.release(conn,stmt,rs);
        }

    }

}
