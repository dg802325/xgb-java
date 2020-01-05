package com.xgb.service;

import com.xgb.common.GbaseUtils;
import com.xgb.model.JcContent;
import com.xgb.model.JcUser;
import com.xgb.util.MyTools;
import java.sql.*;

public class NewJcContentService extends BaseService {

    public static Integer save(JcContent jcContent){
        String sql = "insert into jc_content(channel_id,user_id,type_id,model_id,site_id,sort_date,top_level,has_title_img,is_recommend,status,views_day,comments_day,downloads_day,ups_day,score,recommend_level,parent_id) value(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = null;
        ResultSet rs = null;
        Integer id = null;
        try {
            conn.setAutoCommit(false);
            //Statement.RETURN_GENERATED_KEYS:获取自动增加的id号
            ps = (PreparedStatement) conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,jcContent.getChannelId());
            ps.setInt(2,jcContent.getUserId());
            ps.setInt(3,jcContent.getTypeId());
            ps.setInt(4,jcContent.getModelId());
            ps.setInt(5,jcContent.getSiteId());
            if(MyTools.isNotEmpty(jcContent.getSortDate())){
                ps.setDate(6, new java.sql.Date(jcContent.getSortDate().getTime()));
            }else {

            }
            ps.setInt(7,jcContent.getTopLevel());
            ps.setBigDecimal(8,jcContent.getHasTitleImg());
            ps.setBigDecimal(9,jcContent.getIsRecommend());
            ps.setInt(10,jcContent.getStatus());
            ps.setInt(11,jcContent.getViewsDay());
            ps.setInt(12,jcContent.getCommentsDay());
            ps.setInt(13,jcContent.getDownloadsDay());
            ps.setInt(14,jcContent.getUpsDay());
            ps.setInt(15,jcContent.getScore());
            ps.setInt(16,jcContent.getRecommendLevel());
            if(MyTools.isEmpty(jcContent.getParentId())){
                ps.setNull(17, Types.INTEGER);
            }else{
                ps.setInt(17,jcContent.getParentId());
            }
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            if(rs.next())
                id = rs.getInt(1);
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return id;
    }
}
