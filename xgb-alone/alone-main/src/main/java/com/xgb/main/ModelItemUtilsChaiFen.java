package com.xgb.main;

import com.xgb.common.GbaseUtils;
import com.xgb.service.NewJcContentExtService;
import com.xgb.service.NewJcContentService;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ModelItemUtilsChaiFen {

    public static void main(String[] args) {
        List<JcContentAttr1> attr = getAttr();
        List<String> list = new ArrayList<>();
        for(JcContentAttr1 jca :attr){
            Integer contentId = jca.getContentId();
            JcContent jcContent = selectByName(contentId);
            jcContent.setContentId(null);
            jcContent.setModelId(279);
            jcContent = NewJcContentService.save(jcContent);
            JcContentExt jcContentExt = saveJcContentExt(jcContent, "10");
            list.add("update jc_content_attr_1 set content_id = "+jcContent.getContentId() + " where content_id = " + contentId);
        }
        for(String s : list){
            System.out.println(s+";");
        }
    }

    public static List<JcContentAttr1> getAttr(){
        String sql = "select content_id from jc_content_attr_1 where content_id in (select content_id from jc_content where model_id = 217 and parent_id is not null and sort_date < '2020-01-01') group by content_id";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        JcContentAttr1 jcContent = null;
        List<JcContentAttr1> lists = null;
        try{
            conn = GbaseUtils.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs != null) {
                lists = new ArrayList<JcContentAttr1>();
                // 遍历
                while (rs.next()) {
                    jcContent = new JcContentAttr1();
                    jcContent.setContentId(rs.getInt(1));
                    lists.add(jcContent);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }finally {
            GbaseUtils.release(conn,null,rs);
        }
        return lists;
    }

    public static JcContent selectByName(Integer contentId){
        String sql = "select * from jc_content where content_id = " + contentId;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        JcContent jcContent = null;
        try{
            conn = GbaseUtils.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs != null) {
                if (rs.next()) {
                    jcContent = new JcContent();
                    jcContent.setContentId(rs.getInt(1));
                    jcContent.setChannelId(rs.getInt(2));
                    jcContent.setUserId(rs.getInt(3));
                    jcContent.setTypeId(rs.getInt(4));
                    jcContent.setModelId(rs.getInt(5));
                    jcContent.setSiteId(rs.getInt(6));
                    jcContent.setSortDate(rs.getDate(7));
                    jcContent.setTopLevel(rs.getInt(8));
                    jcContent.setHasTitleImg(new BigDecimal(rs.getInt(9)));
                    jcContent.setIsRecommend(new BigDecimal(rs.getInt(10)));
                    jcContent.setStatus(rs.getInt(11));
                    jcContent.setViewsDay(rs.getInt(12));
                    jcContent.setCommentsDay(rs.getInt(13));
                    jcContent.setDownloadsDay(rs.getInt(14));
                    jcContent.setUpsDay(rs.getInt(15));
                    jcContent.setScore(rs.getInt(16));
                    jcContent.setRecommendLevel(rs.getInt(17));
                    jcContent.setParentId(rs.getInt(18));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }finally {
            GbaseUtils.release(conn,null,rs);
        }
        return jcContent;
    }

    //存jcContentExt
    public static JcContentExt saveJcContentExt(JcContent jcContent, String name){
        JcContentExt jcContentExt = new JcContentExt();
        jcContentExt.setContentId(jcContent.getContentId());
        jcContentExt.setTitle(name);
        jcContentExt.setIsBold(new BigDecimal(0));
        jcContentExt.setNeedRegenerate(new BigDecimal(1));
        jcContentExt.setReleaseDate(jcContent.getSortDate());
        jcContentExt = NewJcContentExtService.save(jcContentExt);
        return jcContentExt;
    }

}
