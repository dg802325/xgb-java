package com.xgb.main;

import com.xgb.common.GbaseUtils;
import com.xgb.common.OracleUtils;
import com.xgb.config.SpringUtil;
import com.xgb.model.*;
import com.xgb.service.NewSaveJcContentAttr1Service;
import com.xgb.service.OldService;
import com.xgb.util.MyTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MainAction {

    public static Connection gbaseConn = GbaseUtils.getConnection();

    public static Connection oracleConn = OracleUtils.getConnection();

    @Autowired
    private OldService oldService;

    public static void main(String[] args) {
        List<JgEntity> list = getList();
        int wu = 0;
        for(JgEntity je :list){
            if(MyTools.isNotEmpty(je.getName())){
                if(je.getName().equals("无")){
                    wu++;
                }
            }
        }
        System.out.println("查询出无：" + wu);
        System.out.println("查询出"+list.size());
        System.out.println("执行完gbase");
        list = updateList(list);
        System.out.println("更新完"+list.size());

        System.out.println("执行完oracle");
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        for(JgEntity je :list){
            System.out.println(je.toString());
            JcContentAttr1 jc = null;
            if(MyTools.isNotEmpty(je.getFuzeren())){
                jc = new JcContentAttr1();
                jc.setContentId(je.getContentId());
                jc.setAttrName("lxrfzr");
                jc.setAttrValue(je.getFuzeren());
                jcContentAttr1s.add(jc);
            }

            if(MyTools.isNotEmpty(je.getPhone())){
                jc = new JcContentAttr1();
                jc.setContentId(je.getContentId());
                jc.setAttrName("phone");
                jc.setAttrValue(je.getPhone());
                jcContentAttr1s.add(jc);
            }

            if(MyTools.isNotEmpty(je.getAddress())){
                jc = new JcContentAttr1();
                jc.setContentId(je.getContentId());
                jc.setAttrName("address");
                jc.setAttrValue(je.getAddress());
                jcContentAttr1s.add(jc);
            }
        }
        System.out.println("总数量"+jcContentAttr1s.size());
        NewSaveJcContentAttr1Service.save(jcContentAttr1s);
        System.out.println("保存完毕");
    }

    public static List<JgEntity> getList(){
        String sql = "select content_id as id from jc_content where model_id = 208 and channel_id = 103";
        Statement stmt = null;
        ResultSet rs = null;
        List<JgEntity> lists = new ArrayList<>();
        try{
            stmt = gbaseConn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                JgEntity je = new JgEntity();
                je.setContentId(rs.getInt("id"));
                sql = "select title as name from jc_content_ext where content_id = "+ je.getContentId();
                Statement stmt1 = gbaseConn.createStatement();
                ResultSet rs1 = stmt1.executeQuery(sql);
                if(rs1.next()){
                    je.setName(rs1.getString("name"));
                }
                lists.add(je);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return lists;
    }

    public static List<JgEntity> updateList(List<JgEntity> lists){
        List<JgEntity> newLists = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;
        for(JgEntity jes:lists){
            if(!"无".equals(jes.getName())){
                try{
                   String sql = "select FUZEREN AS fzr,TJNJYIJIAN1 AS phone,ZHUSUO AS address from MJZZ.ST_NJ_REPORT11_SUB1 where MINGCHENG = '"+jes.getName()+"'";
                    stmt = oracleConn.createStatement();
                    rs = stmt.executeQuery(sql);
                    if(rs.next()){
                        jes.setFuzeren(rs.getString("fzr"));
                        jes.setPhone(rs.getString("phone"));
                        jes.setAddress(rs.getString("address"));
                    }
                    newLists.add(jes);
                } catch (SQLException e) {
                    e.printStackTrace();
                    return null;
                }
            }
            try {
                if(stmt!=null){
                    stmt.close();
                }
                if(rs!=null){
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return newLists;
    }

}
