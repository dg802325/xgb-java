package com.xgb.service;

import com.xgb.main.JcContentExt;
import com.xgb.util.MyTools;

import java.sql.*;

public class NewJcContentExtService extends BaseService {

    public static JcContentExt save(JcContentExt jcContentExt){
        String sql = "insert into jc_content_ext(content_id,title,short_title,author,origin,origin_url,description,media_path,media_type,title_color,is_bold,title_img,content_img,type_img,link,tpl_content,need_regenerate,tpl_mobile_content,toplevel_date,pigeonhole_date,release_date) value(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        PreparedStatement ps = null;
        ResultSet rs = null;
        Integer id = null;
        try {
            conn.setAutoCommit(false);
            //Statement.RETURN_GENERATED_KEYS:获取自动增加的id号
            ps = (PreparedStatement) conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,jcContentExt.getContentId());
            if(MyTools.isEmpty(jcContentExt.getTitle())){
                ps.setNull(2,Types.VARCHAR);
            }else {
                ps.setString(2,jcContentExt.getTitle());
            }
            if(MyTools.isEmpty(jcContentExt.getShortTitle())){
                ps.setNull(3,Types.VARCHAR);
            }else {
                ps.setString(3,jcContentExt.getShortTitle());
            }
            if(MyTools.isEmpty(jcContentExt.getAuthor())){
                ps.setNull(4,Types.VARCHAR);
            }else {
                ps.setString(4,jcContentExt.getAuthor());
            }
            if(MyTools.isEmpty(jcContentExt.getOrigin())){
                ps.setNull(5,Types.VARCHAR);
            }else {
                ps.setString(5,jcContentExt.getOrigin());
            }
            if(MyTools.isEmpty(jcContentExt.getOriginUrl())){
                ps.setNull(6,Types.VARCHAR);
            }else {
                ps.setString(6,jcContentExt.getOriginUrl());
            }
            if(MyTools.isEmpty(jcContentExt.getDescription())){
                ps.setNull(7,Types.VARCHAR);
            }else {
                ps.setString(7,jcContentExt.getDescription());
            }
            if(MyTools.isEmpty(jcContentExt.getMediaPath())){
                ps.setNull(8,Types.VARCHAR);
            }else {
                ps.setString(8,jcContentExt.getMediaPath());
            }
            if(MyTools.isEmpty(jcContentExt.getMediaType())){
                ps.setNull(9,Types.VARCHAR);
            }else {
                ps.setString(9,jcContentExt.getMediaType());
            }
            if(MyTools.isEmpty(jcContentExt.getTitleColor())){
                ps.setNull(10,Types.VARCHAR);
            }else {
                ps.setString(10,jcContentExt.getTitleColor());
            }
            ps.setBigDecimal(11,jcContentExt.getIsBold());
            if(MyTools.isEmpty(jcContentExt.getTitleImg())){
                ps.setNull(12,Types.VARCHAR);
            }else {
                ps.setString(12,jcContentExt.getTitleImg());
            }
            if(MyTools.isEmpty(jcContentExt.getContentImg())){
                ps.setNull(13,Types.VARCHAR);
            }else {
                ps.setString(13,jcContentExt.getContentImg());
            }
            if(MyTools.isEmpty(jcContentExt.getTypeImg())){
                ps.setNull(14,Types.VARCHAR);
            }else {
                ps.setString(14,jcContentExt.getTypeImg());
            }
            if(MyTools.isEmpty(jcContentExt.getLink())){
                ps.setNull(15,Types.VARCHAR);
            }else {
                ps.setString(15,jcContentExt.getLink());
            }
            if(MyTools.isEmpty(jcContentExt.getTplContent())){
                ps.setNull(16,Types.VARCHAR);
            }else {
                ps.setString(16,jcContentExt.getTplContent());
            }
            ps.setBigDecimal(17,jcContentExt.getNeedRegenerate());
            if(MyTools.isEmpty(jcContentExt.getTplMobileContent())){
                ps.setNull(18,Types.VARCHAR);
            }else {
                ps.setString(18,jcContentExt.getTplMobileContent());
            }
            if(MyTools.isEmpty(jcContentExt.getToplevelDate())){
                ps.setNull(19,Types.DATE);
            }else {
                ps.setDate(19,new Date(jcContentExt.getToplevelDate().getTime()));
            }
            if(MyTools.isEmpty(jcContentExt.getPigeonholeDate())){
                ps.setNull(20,Types.DATE);
            }else {
                ps.setDate(20,new Date(jcContentExt.getPigeonholeDate().getTime()));
            }
            ps.setDate(21,new Date(jcContentExt.getReleaseDate().getTime()));
            ps.executeUpdate();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }finally {
        }
        return jcContentExt;
    }
}
