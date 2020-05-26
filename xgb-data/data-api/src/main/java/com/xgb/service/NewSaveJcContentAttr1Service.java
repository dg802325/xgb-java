package com.xgb.service;

import com.xgb.common.GbaseUtils;
import com.xgb.model.JcContentAttr1;
import com.xgb.util.MyTools;

import java.sql.*;
import java.util.List;

public class NewSaveJcContentAttr1Service extends BaseService {

    public static Integer save(List<JcContentAttr1> jcContentAttr1s){
        String sql = "insert into jc_content_attr_1(content_id,attr_name,attr_value) value(?,?,?)";
        PreparedStatement ps = null;
        ResultSet rs = null;
        int len = 0;
        try {
            conn.setAutoCommit(false);
            ps = (PreparedStatement) conn.prepareStatement(sql);
            for(JcContentAttr1 jcContentAttr1:jcContentAttr1s){
                ps.setInt(1,jcContentAttr1.getContentId());
                ps.setString(2,jcContentAttr1.getAttrName());
                ps.setString(3,jcContentAttr1.getAttrValue());
                ps.addBatch();
                len++;
            }
            ps.executeBatch();
            conn.commit();
            ps.clearBatch();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }finally {
        }
        return len;
    }

    public static Integer update(List<JcContentAttr1> jcContentAttr1s){
//        String sql = "update set jc_content_attr_1(content_id,attr_name,attr_value) value(?,?,?)";
        String sql = "update jc_content_attr_1 set attr_value = ? where content_id = ? and attr_name = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        int len = 0;
        try {
            conn.setAutoCommit(false);
            //Statement.RETURN_GENERATED_KEYS:获取自动增加的id号
            for(JcContentAttr1 jcContentAttr1:jcContentAttr1s){
                ps = (PreparedStatement) conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1,jcContentAttr1.getAttrValue());
                ps.setInt(2,jcContentAttr1.getContentId());
                ps.setString(3,jcContentAttr1.getAttrName());
                ps.executeUpdate();
                len++;
            }
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }finally {
        }
        return len;
    }

}
