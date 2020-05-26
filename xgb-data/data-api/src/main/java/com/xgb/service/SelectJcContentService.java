package com.xgb.service;

import com.xgb.model.Content202Entity;
import com.xgb.model.JcContentAttr1;
import com.xgb.model.NewContent;
import com.xgb.util.MyTools;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class SelectJcContentService extends BaseService {


    public static NewContent selectJcContent(Content202Entity content202Entity){
            String sql = "select content_id as id from jc_content where model_id = 202 and parent_id is null and sort_date < '2018-12-30' and  user_id = '"+content202Entity.getUserId()+"'";
            Statement stmt = null;
            ResultSet rs = null;
            NewContent newContent = new NewContent();
            try{
                stmt = conn.createStatement();
                rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    newContent.setId(rs.getInt("id")+"");
                    return newContent;
                }
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
        }
        return null;
    }

    public static NewContent selectZiJcContent(Integer modelId, Integer parentId){
        String sql = "select content_id as id from jc_content where model_id = "+ modelId +" and parent_id = "+parentId;
        Statement stmt = null;
        ResultSet rs = null;
        NewContent newContent = new NewContent();
        try{
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                newContent.setId(rs.getInt("id")+"");
                return newContent;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    public static NewContent selectMfJcContent(Content202Entity content202Entity){
        String sql = "select content_id as id from jc_content where model_id = 261 and parent_id is null and sort_date < '2018-12-30' and  user_id = "+content202Entity.getUserId();
        Statement stmt = null;
        ResultSet rs = null;
        NewContent newContent = new NewContent();
        try{
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                newContent.setId(rs.getInt("id")+"");
                return newContent;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    public static NewContent selectAttrIsNull(JcContentAttr1 jcContentAttr1){
        String sql = "select content_id from jc_content_attr_1 where content_id = "+ jcContentAttr1.getContentId()+" and attr_name = '"+ jcContentAttr1.getAttrName() +"'";
        Statement stmt = null;
        ResultSet rs = null;
        NewContent newContent = new NewContent();
        try{
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                newContent.setId(rs.getInt("content_id")+"");
                return newContent;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }
}
