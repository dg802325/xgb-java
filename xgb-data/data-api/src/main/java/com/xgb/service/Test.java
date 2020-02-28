package com.xgb.service;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.xgb.common.GbaseUtils;
import com.xgb.model.Content202Entity;
import com.xgb.model.JcContentAttr1;
import com.xgb.util.DateUtils;
import com.xgb.util.MyTools;
import com.xgb.util.StringUtils;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Test extends BaseService {


    public static void main(String[] args) {
        Connection conn = GbaseUtils.getConnection();
        String sql = "select * from jc_content_attr_1";
        List<JcContentAttr1> lists = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;
        JcContentAttr1 jcContentAttr1 = null;
        System.out.println("开始查询");
        try{
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            if (rs != null) {
                if(MyTools.isNotEmpty(rs.next())){
                    while(rs.next()){
                        jcContentAttr1 = new JcContentAttr1();
                        jcContentAttr1.setContentId(rs.getInt("content_id"));
                        jcContentAttr1.setAttrName(rs.getString("attr_name"));
                        jcContentAttr1.setAttrValue(rs.getString("attr_value"));
                        lists.add(jcContentAttr1);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            GbaseUtils.release(conn,stmt,rs);
        }
        System.out.println("查询结束");
        System.out.println(lists);
        List<JcContentAttr1> newList = new ArrayList<>();
        List<String> string = getString();
        int size = lists.size();
        for (int i = 0; i < size; i++) {
            if(string.contains(lists.get(i).getAttrName())){
                if(lists.get(i).getAttrValue().indexOf("-")<1){
                    System.out.println(lists.get(i).toString());
                    System.out.println(DateUtils.dateToyyyyMMdd(dateToString(lists.get(i).getAttrValue())));
                    lists.get(i).setAttrValue(DateUtils.dateToyyyyMMdd(dateToString(lists.get(i).getAttrValue())));
                    newList.add(lists.get(i));
                }
            }
        }
        System.out.println(newList);
        Integer integer = updateDate(newList);
        if(integer>0){
            System.out.println("成功");
        }else {
            System.out.println("失败");
        }
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
