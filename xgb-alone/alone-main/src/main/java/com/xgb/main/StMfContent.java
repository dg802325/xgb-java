package com.xgb.main;

import com.xgb.common.DbBase;
import com.xgb.common.GbaseUtils;
import com.xgb.common.Utils;
import com.xgb.entity.TableColumnInfo;
import com.xgb.service.NewEntityGenerator;
import com.xgb.service.StZhuGenerator;
import com.xgb.util.JDBCUtils;
import oracle.jdbc.OracleConnection;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StMfContent extends DbBase {

    public static void main(String[] args) {
        List<TableColumnInfo> lists = new ArrayList<TableColumnInfo>();
        Connection connection = null;
        //连接数据库
        String tableName = "FORM_CONSULTATION_CASE";//表名  一个
            connection = JDBCUtils.getConnection(ORACLE_DRIVER,ORACLE_URL, ORACLE_USERNAME,ORACLE_PASSWORD);//Oracle
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
        System.out.println(lists);
        getCode(tableName,lists);
    }

    public static boolean getCode(String tableName,List<TableColumnInfo> lists){
        String path= Utils.getResourceBasePath()+"/xgb-alone/alone-main/config";
        StZhuGenerator.genGeratorCode(path,tableName,lists);
        return false;
    }
}
