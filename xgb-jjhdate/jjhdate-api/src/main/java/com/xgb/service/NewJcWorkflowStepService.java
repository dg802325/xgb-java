//package com.xgb.service;
//
//import com.xgb.model.JcWorkflowStep;
//
//import java.sql.*;
//
//public class NewJcWorkflowStepService extends BaseService {
//
//    public static JcWorkflowStep save(JcWorkflowStep jcWorkflowStep){
//        String sql = "insert into jc_workflow_step(workflow_id,content_id,node_id,owner_id,value,user_id,history,start_date,finish_date,prev_node_id,status) value(?,?,?,?,?,?,?,?,?,?,?);";
//        PreparedStatement ps = null;
//        ResultSet rs = null;
//        Integer id = null;
//        try {
//            conn.setAutoCommit(false);
//            //Statement.RETURN_GENERATED_KEYS:获取自动增加的id号
//            ps = (PreparedStatement) conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            ps.setInt(1,jcWorkflowStep.getWorkflowId());
//            ps.setInt(2,jcWorkflowStep.getContentId());
//            ps.setInt(3,jcWorkflowStep.getNodeId());
//            ps.setInt(4,jcWorkflowStep.getOwnerId());
//            ps.setString(5,jcWorkflowStep.getValue());
//            ps.setInt(6,jcWorkflowStep.getUserId());
//            ps.setInt(7,jcWorkflowStep.getHistory());
//            ps.setDate(8,new Date(jcWorkflowStep.getStartDate().getTime()));
//            ps.setDate(9,new Date(jcWorkflowStep.getFinishDate().getTime()));
//            ps.setInt(10,jcWorkflowStep.getNodeId());
//            ps.setString(11,jcWorkflowStep.getStatus());
//            ps.executeUpdate();
//            rs = ps.getGeneratedKeys();
//            if(rs.next())
//                jcWorkflowStep.setId(rs.getInt(1));
//            conn.commit();
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return null;
//        }
//        return jcWorkflowStep;
//    }
//}
