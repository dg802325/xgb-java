package com.xgb.service;

import com.xgb.common.GbaseUtils;
import com.xgb.model.JcContentAttr1;
import com.xgb.util.MyTools;

import java.sql.*;
import java.util.List;

public class NewSaveJcContentAttr1Service {

    public static Integer save(List<JcContentAttr1> jcContentAttr1s){
        String sql = "insert into jc_content_attr_1(content_id,attr_name,attr_value) value(?,?,?)";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int len = 0;
        try {
            conn = GbaseUtils.getConnection();
            conn.setAutoCommit(false);
            //Statement.RETURN_GENERATED_KEYS:获取自动增加的id号
            for(JcContentAttr1 jcContentAttr1:jcContentAttr1s){
                ps = (PreparedStatement) conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1,jcContentAttr1.getContentId());
                ps.setString(2,jcContentAttr1.getAttrName());
                ps.setString(3,jcContentAttr1.getAttrValue());
                ps.executeUpdate();
                len++;
            }
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }finally {
            GbaseUtils.release(conn,ps,rs);
        }
        return len;
    }
}
