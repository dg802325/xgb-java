package com.xgb.service;

import com.xgb.common.GbaseUtils;
import com.xgb.model.JcContentAttr1;
import com.xgb.util.DateUtils;
import com.xgb.util.MyTools;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class UpdateBeiAn extends BaseService {


    public static void main(String[] args) {
        Connection conn = GbaseUtils.getConnection();
        String sql = "select content_id from jc_content where channel_id = 31";
        List<Integer> lists = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;
        System.out.println("开始查询");
        try{
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            if (rs != null) {
                if(MyTools.isNotEmpty(rs.next())){
                    while(rs.next()){
                        int id = rs.getInt("content_id");
                        lists.add(id);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            GbaseUtils.release(conn,stmt,rs);
        }
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        JcContentAttr1 jc1 = null;
        for(Integer i :lists){
            //加入第一个字段
            jc1 = new JcContentAttr1();
            jc1.setContentId(i);
            jc1.setAttrName("isBeiAnCxtj");
            jc1.setAttrValue("1");
            jcContentAttr1s.add(jc1);
            //加入第二个
            jc1 = new JcContentAttr1();
            jc1.setContentId(i);
            jc1.setAttrName("zgdwAuditStatus");
            jc1.setAttrValue("0");
            jcContentAttr1s.add(jc1);
            //加入第三个
            jc1 = new JcContentAttr1();
            jc1.setContentId(i);
            jc1.setAttrName("gljgAuditStatus");
            jc1.setAttrValue("0");
            jcContentAttr1s.add(jc1);
            //加入第四个
            jc1 = new JcContentAttr1();
            jc1.setContentId(i);
            jc1.setAttrName("zgdwAuditResult");
            jc1.setAttrValue("1");
            jcContentAttr1s.add(jc1);
            //加入第五个
            jc1 = new JcContentAttr1();
            jc1.setContentId(i);
            jc1.setAttrName("gljgAuditResult");
            jc1.setAttrValue("1");
            jcContentAttr1s.add(jc1);
        }
        System.out.println(lists);
        NewSaveJcContentAttr1Service.save(jcContentAttr1s);
    }

    public static Date dateToString(String oldDate){
//        Date date = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US).parse("Wed Jul 31 00:00:00 CST 2019");
        Date parse = null;
        try {
            parse = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US).parse(oldDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(parse);
        return parse;
    }



    public static List<String> getString(){
        List<String> strings = new ArrayList<>();
        strings.add("bgmcpzsj");
        strings.add("bghddypzsj");
        strings.add("bgywfwpzsj");
        strings.add("bgzspzsj");
        strings.add("bgzczjpzsj");
        strings.add("bgfddbpzsj");
        strings.add("bgywzgdwpzsj");
        strings.add("xgzcpzsj");
        strings.add("fzrbgbapzsj");
        return strings;
    }

    public static Integer updateDate(List<JcContentAttr1> lists){
        Connection conn = GbaseUtils.getConnection();
        String sql = "UPDATE jc_content_attr_1 SET attr_value=? WHERE content_id=? AND attr_name=?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        int len = 0;
        try {
            conn.setAutoCommit(false);
            //Statement.RETURN_GENERATED_KEYS:获取自动增加的id号
            for(JcContentAttr1 jcContentAttr1:lists){
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
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            GbaseUtils.release(conn,null,rs);
        }
        return len;
    }

}
