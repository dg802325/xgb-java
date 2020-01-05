package com.xgb.controller;

import com.xgb.common.GbaseUtils;
import com.xgb.model.JcDict;
import com.xgb.model.SjzdNode;
import com.xgb.model.SjzdNodeExample;
import com.xgb.service.OldService;
import com.xgb.util.MyTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;
import java.util.List;

@RestController
public class SaveDictController {

    public Connection conn = GbaseUtils.getConnection();

    @Autowired
    private OldService oldService;

    @GetMapping("/deleteDict")
    public String delete(){
        SjzdNodeExample sjzdNodeExample = new SjzdNodeExample();
        sjzdNodeExample.createCriteria().andParentidEqualTo(0);
        List<SjzdNode> sjzdNodes = oldService.selectByExample(sjzdNodeExample);
        sjzdNodes.forEach(i->{
            String nodeTypename = i.getNodeTypename();
            Integer integer = deleteDict(nodeTypename);
            if(integer>0){
                System.out.println("删除成功type=" + i.getNodeTypename());
            }else {
                System.out.println("删除失败type=" + i.getNodeTypename());
            }
        });
        return "成功";
    }

    @GetMapping("/saveDict")
    public String saveDict(){
        SjzdNodeExample sjzdNodeExample = new SjzdNodeExample();
        sjzdNodeExample.createCriteria().andParentidEqualTo(0);
        List<SjzdNode> sjzdNodes = oldService.selectByExample(sjzdNodeExample);
        sjzdNodes.forEach(sjzdNode -> {
            //保存一级字典
            JcDict jcDict = new JcDict();
            jcDict.setName(sjzdNode.getNodeName());
            jcDict.setPriority(10);
            jcDict.setValue(sjzdNode.getNodeValue());
            jcDict.setDescription(sjzdNode.getNodeTypename());
            jcDict.setType(0);
            jcDict.setParentId(null);
            Integer parentId = saveDict(jcDict);
            //获得2级字典
            SjzdNodeExample sjzdNodeExample1 = new SjzdNodeExample();
            sjzdNodeExample1.createCriteria().andParentidEqualTo(sjzdNode.getId());
            List<SjzdNode> sjzdNodes1 = oldService.selectByExample(sjzdNodeExample1);
            sjzdNodes1.forEach(sjzdNode1 -> {
                //保存二级字典
                if(!sjzdNode1.getNodeTypename().equals(sjzdNode1.getNodeValue())){
                    JcDict jcDict2 = new JcDict();
                    jcDict2.setName(sjzdNode1.getNodeName());
                    jcDict2.setPriority(10);
                    jcDict2.setValue(sjzdNode1.getNodeValue());
                    jcDict2.setDescription(sjzdNode1.getNodeTypename());
                    jcDict2.setType(0);
                    jcDict2.setParentId(parentId);
                    saveDict(jcDict2);
                }
            });
        });
        return "成功";
    }

    public Integer deleteDict(String noteType){
        if(MyTools.isNotEmpty(noteType)){
            String sql = "delete from jc_dict where description = ?";
            PreparedStatement ps = null;
            ResultSet rs = null;
            try {
                conn.setAutoCommit(false);
                ps = (PreparedStatement) conn.prepareStatement(sql);
                ps.setString(1,noteType);
                ps.executeUpdate();
                conn.commit();
            } catch (SQLException e) {
                e.printStackTrace();
                return 0;
            }
            return 1;
        }
       return 0;
    }

    public Integer saveDict(JcDict jcDict){
        String sql = "insert into jc_dict(name,priority,value,description,type,parent_id) value(?,?,?,?,?,?)";
        PreparedStatement ps = null;
        ResultSet rs = null;
        Integer id = null;
        try {
            conn.setAutoCommit(false);
            //Statement.RETURN_GENERATED_KEYS:获取自动增加的id号
            ps = (PreparedStatement) conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            if(MyTools.isNotEmpty(jcDict.getName())){
                ps.setString(1,jcDict.getName());
            }else {
                ps.setString(1," ");
            }
            ps.setInt(2,jcDict.getPriority());
            ps.setString(3,jcDict.getValue());
            ps.setString(4,jcDict.getDescription());
            ps.setInt(5,jcDict.getType());
            if(MyTools.isNotEmpty(jcDict.getParentId())){
                ps.setInt(6,jcDict.getParentId());
            }else {
                ps.setNull(6,Types.INTEGER);
            }
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            if(rs.next())
                id = rs.getInt(1);
            conn.commit();
        } catch ( SQLException e) {
            e.printStackTrace();
            return null;
        }
        return id;
    }
}
