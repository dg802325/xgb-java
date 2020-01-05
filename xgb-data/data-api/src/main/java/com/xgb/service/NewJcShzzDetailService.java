package com.xgb.service;

import com.xgb.common.GbaseUtils;
import com.xgb.model.Content202Entity;
import com.xgb.model.JcUser;
import com.xgb.util.MyTools;

import java.sql.*;

public class NewJcShzzDetailService extends BaseService {

    public static void main(String[] args) {
    }

    public static Content202Entity selectByXinYongDaima(String xinyongdaima){
        Content202Entity content202Entity = new Content202Entity();
        Integer userId = null;
        if(MyTools.isNotEmpty(xinyongdaima)){
            content202Entity.setStxcode(xinyongdaima);
            String sql = "select id,djjgxzqhdm,type from jc_shzz_detail where code = '"+xinyongdaima+"'";
            Statement stmt = null;
            ResultSet rs = null;
            try{
                stmt = conn.createStatement();
                rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    content202Entity.setContentId(rs.getInt("id")+"");
                    content202Entity.setType(rs.getString("type"));
                    String xzqu = rs.getString("djjgxzqhdm");
                    String sql2 = "select user_id from jc_user_attr where attr_value = '"+content202Entity.getContentId()+"'";//查询userid
                    rs = stmt.executeQuery(sql2);
                    if (rs.next()) {
                        content202Entity.setUserId(rs.getInt("user_id"));
                    }
                    String sql3 = "select id from jc_dict where value = '"+xzqu+"'";
                    rs = stmt.executeQuery(sql3);
                    if (rs.next()) {
                        content202Entity.setShzzXzqh(rs.getInt("id")+"");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
        return content202Entity;
    }
}
