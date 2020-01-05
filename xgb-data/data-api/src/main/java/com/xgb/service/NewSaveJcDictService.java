package com.xgb.service;

import com.xgb.common.GbaseUtils;
import com.xgb.model.JcContentAttr1;
import com.xgb.model.JcDict;
import com.xgb.util.MyTools;

import java.sql.*;
import java.util.List;

public class NewSaveJcDictService extends BaseService {

    public static Integer save(JcDict jcDict){
        String sql = " insert into jc_dict(name,priority,value,description,type,parent_id,) value(?,?,?,?,?,?,);";
        PreparedStatement ps = null;
        ResultSet rs = null;
        int len = 0;
        try {
            conn.setAutoCommit(false);
            //Statement.RETURN_GENERATED_KEYS:获取自动增加的id号
            ps = (PreparedStatement) conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,jcDict.getName());
            ps.setInt(2,jcDict.getPriority());
            ps.setString(3,jcDict.getValue());
            if(MyTools.isNotEmpty(jcDict.getParentId())){
                ps.setString(4,jcDict.getDescription());
            }else {
                ps.setNull(4,Types.VARCHAR);
            }
            if(MyTools.isNotEmpty(jcDict.getParentId())){
                ps.setInt(5,jcDict.getType());
            }else {
                ps.setNull(5,Types.INTEGER);
            }
            if(MyTools.isNotEmpty(jcDict.getParentId())){
                ps.setInt(6,jcDict.getParentId());
            }else {
                ps.setNull(6,Types.INTEGER);
            }
            ps.executeUpdate();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }finally {
        }
        return len;
    }
}
