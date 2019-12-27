package com.xgb.main;

import com.xgb.common.GbaseUtils;
import com.xgb.common.Utils;
import com.xgb.entity.TableColumnInfo;
import com.xgb.model.JcModelItem;
import com.xgb.service.NewEntityGenerator;
import com.xgb.service.NewModelItemGenerator;
import com.xgb.util.DateUtils;
import com.xgb.util.MyTools;
import com.xgb.util.StringUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModelItemUtils {

    public static void main(String[] args) {
        Integer modelId = 202;
        List<JcModelItem> jcModelItems = selectByName(modelId);
        System.out.println(jcModelItems);
        String path= Utils.getResourceBasePath()+"/xgb-alone/alone-main/config";
        NewModelItemGenerator.genGeratorCode(path,"St202",jcModelItems);
    }

    public static List<JcModelItem> selectByName(Integer modelId){
        String sql = "select * from jc_model_item where model_id = ?";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        JcModelItem jcModelItem = null;
        List<JcModelItem> lists = null;
        try{
            conn = GbaseUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1,modelId);
            rs = ps.executeQuery();
            if (rs != null) {
                lists = new ArrayList<JcModelItem>();
                // 遍历
                while (rs.next()) {
                      jcModelItem = new JcModelItem();
                      jcModelItem.setModelitemId(rs.getInt(1));
                      jcModelItem.setModelId(rs.getInt(2));
                      jcModelItem.setField(rs.getString(3));
                      jcModelItem.setItemLabel(rs.getString(4));
                      jcModelItem.setPriority(rs.getInt(5));
                      jcModelItem.setDefValue(rs.getString(6));
                      jcModelItem.setOptValue(rs.getString(7));
                      jcModelItem.setTextSize(rs.getString(8));
                      jcModelItem.setAreaRows(rs.getString(9));
                      jcModelItem.setAreaCols(rs.getString(10));
                      jcModelItem.setHelp(rs.getString(11));
                      jcModelItem.setHelpPosition(rs.getString(12));
                      jcModelItem.setDataType(rs.getInt(13));
                      jcModelItem.setIsSingle(rs.getBigDecimal(14));
                      jcModelItem.setIsChannel(rs.getBigDecimal(15));
                      jcModelItem.setIsCustom(rs.getBigDecimal(16));
                      jcModelItem.setIsDisplay(rs.getBigDecimal(17));
                      jcModelItem.setIsRequired(rs.getBigDecimal(18));
                      jcModelItem.setImageHeight(rs.getInt(19));
                      jcModelItem.setImageHeight(rs.getInt(20));
                      lists.add(jcModelItem);
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



}
