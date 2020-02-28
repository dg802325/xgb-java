package com.xgb.service;

import com.xgb.model.Content202Entity;
import com.xgb.util.MyTools;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NewJcShzzDetailService extends BaseService {


    public static Content202Entity selectByXinYongDaima(String code){
        Content202Entity content202Entity = new Content202Entity();
        Integer userId = null;
        if(MyTools.isNotEmpty(code)){
            String sql = "select id,djjgxzqhdm,code,type from jc_shzz_detail where code = '"+code+"'";
            Statement stmt = null;
            ResultSet rs = null;
            try{
                stmt = conn.createStatement();
                rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    content202Entity.setContentId(rs.getInt("id")+"");
                    content202Entity.setType(rs.getString("type"));
                    content202Entity.setStxcode(rs.getString("code"));
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
