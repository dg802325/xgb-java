package com.xgb.main;

import com.xgb.common.DbBase;
import com.xgb.common.GbaseUtils;
import com.xgb.common.Utils;
import com.xgb.entity.TableColumnInfo;
import com.xgb.service.NewEntityGenerator;
import com.xgb.service.OldEntityGenerator;
import com.xgb.service.OldEntityServiceGenerator;
import com.xgb.service.OldPiPeiGenerator;
import com.xgb.util.JDBCUtils;
import oracle.jdbc.OracleConnection;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class mainAction extends DbBase {


    public static void main(String[] args) {
        List<TableColumnInfo> lists = new ArrayList<TableColumnInfo>();
        Connection connection = null;
        //连接数据库
        String tableName = "MJZZ_USER";//表名  一个
//        String[] tableNames = {"ST_DJQK_4","ST_NJ_REPORT11","ST_NJ_REPORT11_SUB1","ST_NJ_JIESHOUJIANDU","ST_NJ_JIESHOUJIANDU","JJH_NJ_REPORT6","JJHNJ_REPORT4","ST_NJ_REPORT16","ST_NJ_REPORT16_SUB1","ST_NJ_GJHY","ST_NJ_REPORT16_SUB2","ST_NJ_REPORT17_SUB1","ST_NJ_CGFW","ST_NJ_REPORT17_SUB2","ST_NJ_REPROT14","ST_NJ_REPORT14_SUB","ST_NJ_JBGYHD","ST_NJ_JBGYHD_SUB","ST_NJ_APPRAISE_COST","ST_NJ_APPRAISE_COST_INX","ST_NJ_REPROT140","ST_NJ_REPROT140_SUB","ST_NJ_GYHDZC","ST_NJ_GYHDZC_SUB","ST_NJ_REPROT13","ST_NJ_REPORT13_SUB","ST_NJ_ADMINISTRAT_COST","ST_NJ_ADMINISTRAT_COST_INX","STNJ_SFQK_JYFW","STNJ_SFQK_JYFW_SUB","NJ_GWYJZ_TB","NJ_GWYJZ_SUB","MF_GWY_JZ_TB","MF_GWYJZ_ZB","ST_NJ_QGADVISE","STNJ_YWHD_TB","STNJ_YWHD_SUB","ST_NJ_SERVICE_COST_INX","ST_NJ_SERVICE_COST","JJHNJ_GYHDMX","JJHNJ_GYHDMX_SUB"};
//        for(String tableName:tableNames){
//                    String type = "G"; //Gbase 数据库
            String type = "O"; // Oracle数据库
            if("G".equals(type)){
                connection = JDBCUtils.getConnection(GBASE_DRIVER,GBASE_URL, GBASE_USERNAME,GBASE_PASSWORD);//Gbase
            }else if("O".equals(type)){
                connection = JDBCUtils.getConnection(ORACLE_DRIVER,ORACLE_URL, ORACLE_USERNAME,ORACLE_PASSWORD);//Oracle
            }
            //设置可以读取REMARKS
            if (connection instanceof OracleConnection) {//设置Oracle数据库的表注释可读
                ((OracleConnection) connection).setRemarksReporting(true);//设置连接属性,使得可获取到表的REMARK(备注)
            }
            DatabaseMetaData databaseMetaData = null;
            ResultSet rs = null;
            try {
                databaseMetaData = connection.getMetaData();
                rs = databaseMetaData.getColumns(null, "%", tableName, "%");
                while(rs.next()){
                    TableColumnInfo tableColumnInfo = new TableColumnInfo();
                    //列名
                    tableColumnInfo.setColumnName(rs.getString("COLUMN_NAME"));
                    //类型
                    tableColumnInfo.setTypeName(rs.getString("TYPE_NAME"));
                    //注释
                    tableColumnInfo.setRemarks(rs.getString("REMARKS"));
                    lists.add(tableColumnInfo);
                }
                //生成逻辑
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                GbaseUtils.release(connection,null,rs);
            }
            getCode(tableName,lists,type);
//        }
    }

    public static boolean getCode(String tableName,List<TableColumnInfo> lists,String type){
        String path= Utils.getResourceBasePath()+"/xgb-alone/alone-main/config";
        if("G".equals(type)){
//            NewEntityGenerator.genGeratorCode(path,tableName,lists);
        }else if("O".equals(type)){
            OldEntityServiceGenerator.genGeratorCode(path,tableName,lists);
            OldEntityGenerator.genGeratorCode(path,tableName,lists);
            OldPiPeiGenerator.genGeratorCode(path,tableName,lists);
        }
        return false;
    }



}
