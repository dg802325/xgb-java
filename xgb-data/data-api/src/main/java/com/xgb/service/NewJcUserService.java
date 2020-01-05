package com.xgb.service;

import com.xgb.common.GbaseUtils;
import com.xgb.model.JcUser;
import com.xgb.util.MyTools;

import java.sql.*;

public class NewJcUserService extends BaseService {

    public static void main(String[] args) {
        String name = "天津上市公司协会";
        JcUser jcUser = selectByName(name);
        System.out.println(jcUser);
    }


    public static JcUser selectByName(String name){
        String sql = "select * from jc_user where username = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        JcUser jcUser = null;
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1,name);
            rs = ps.executeQuery();
            if (rs != null) {
                jcUser = new JcUser();
                // 遍历
                while (rs.next()) {
                    jcUser.setUserId(rs.getInt(1));
                    jcUser.setGroupId(rs.getInt(2));
                    jcUser.setUsername(rs.getString(3));
                    jcUser.setEmail(rs.getString(4));
                    jcUser.setRegisterTime(rs.getTimestamp(5));
                    jcUser.setLastLoginIp(rs.getString(6));
                    jcUser.setLoginCount(rs.getInt(7));
                    jcUser.setRank(rs.getInt(8));
                    jcUser.setUploadTotal(rs.getBigDecimal(9));
                    jcUser.setUploadSize(rs.getInt(10));
                    System.out.println(rs.getObject(11));
                    System.out.println();
                    if(rs.getObject(11).toString().equals("0")){
                        jcUser.setUploadDate(null);
                    }else{
                        jcUser.setUploadDate(rs.getTimestamp(11));
                    }
                    jcUser.setIsAdmin(rs.getBigDecimal(12));
                    jcUser.setIsSelfAdmin(rs.getBigDecimal(13));
                    jcUser.setIsDisabled(rs.getBigDecimal(14));
                    jcUser.setSessionId(rs.getString(15));
                    if(MyTools.isEmpty(rs.getInt(16))){
                        jcUser.setDepartId(null);
                    }else{
                        jcUser.setDepartId(rs.getInt(16));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return jcUser;
    }
}
