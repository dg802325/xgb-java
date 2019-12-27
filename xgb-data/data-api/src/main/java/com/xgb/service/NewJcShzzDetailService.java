package com.xgb.service;

import com.xgb.common.GbaseUtils;
import com.xgb.model.JcUser;
import com.xgb.util.MyTools;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NewJcShzzDetailService {

    public static void main(String[] args) {
        Integer integer = selectByXinYongDaima("53120000MJY089130M");
        System.out.println(integer);
    }

    public static Integer selectByXinYongDaima(String xinyongdaima){
        String sql = "select id from jc_shzz_detail where code = ?";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        JcUser jcUser = null;
        Integer userId = null;
        try{
            conn = GbaseUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1,xinyongdaima);
            rs = ps.executeQuery();
            if (rs != null) {
                jcUser = new JcUser();
                if(MyTools.isNotEmpty(rs.next())){
                    int jcShzzDetailId = rs.getInt(1);
                    String sql2 = "select user_id from jc_user_attr where attr_value = ?";
                    ps = conn.prepareStatement(sql2);
                    ps.setString(1,jcShzzDetailId+"");
                    rs = ps.executeQuery();
                    if (rs != null) {
                        jcUser = new JcUser();
                        if (MyTools.isNotEmpty(rs.next())) {
                            userId = rs.getInt(1);
                        }
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return userId;
    }
}
