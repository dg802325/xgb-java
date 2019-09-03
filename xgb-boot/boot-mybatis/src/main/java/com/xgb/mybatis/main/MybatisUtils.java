package com.xgb.mybatis.main;

import com.xgb.dao.SysDatabasesMapper;
import com.xgb.model.Generator;
import com.xgb.model.SysDatabases;
import com.xgb.model.SysMabtaisPlus;
import com.xgb.model.TableInformation;
import com.xgb.mybatis.service.CodeGeneratorManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 邓根
 * @Date: 2019/8/28 16:48
 * @Description:
 */
@Service
public class MybatisUtils {

    protected Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private SysDatabasesMapper sysDatabasesMapper;

    public Connection getConnection(String jdbcDriver, String dbUrl, String username, String password){
        Connection conn = null;
        try {
            //连接驱动
            Class.forName(jdbcDriver);
            conn = DriverManager.getConnection(dbUrl, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void closeConn(Connection conn){
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<SysMabtaisPlus> getTables(Connection conn) throws SQLException {
        List<SysMabtaisPlus> lists = new ArrayList<>();
        DatabaseMetaData dbMetData = null;
            dbMetData = conn.getMetaData();
            ResultSet rs = dbMetData.getTables(null, null, null, new String[] { "TABLE" });
            while (rs.next()) {
                SysMabtaisPlus sysMabtaisPlus = new SysMabtaisPlus();
                sysMabtaisPlus.setTableName(rs.getString("TABLE_NAME"));
                sysMabtaisPlus.setTableType(rs.getString("TABLE_TYPE"));
                sysMabtaisPlus.setTableCat(rs.getString("TABLE_CAT"));
                sysMabtaisPlus.setTableRemark(rs.getString("REMARKS"));
                lists.add(sysMabtaisPlus);
            }
        return lists;
    }

    public String getDriver(String sqlType){
        if(sqlType.equals("MYSQL")){
            return "com.mysql.jdbc.Driver";
        }else {
            return "未找到对应的类型";
        }
    }

    public String getSqlType(String sqlType,String databaseUrl,String portNumber,String dataName){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("jdbc:");
        if("MYSQL".equals(sqlType)){
            stringBuffer.append("mysql://");
        }else {
            return "未找到对应的类型";
        }
        stringBuffer.append(databaseUrl);
        stringBuffer.append(":"+portNumber);
        stringBuffer.append("/"+dataName+"?useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&serverTimezone=Asia/Shanghai");
        return stringBuffer.toString();
    }

    public String generatorCode(Generator generator) throws SQLException {
        System.out.println(generator.getDataId());
        System.out.println(generator.getTableName());
        SysDatabases sysDatabases = sysDatabasesMapper.selectByPrimaryKey(generator.getDataId());
        String dbUrl = getSqlType(sysDatabases.getDatabaseType(), sysDatabases.getDatabaseUrl(), sysDatabases.getDatabasePortNumber(),sysDatabases.getDatabaseName());
        String driver = getDriver(sysDatabases.getDatabaseType());
        Connection connection = getConnection(driver, dbUrl, sysDatabases.getDatabaseLoginName(), sysDatabases.getDatabaseLoginPassword());
        DatabaseMetaData databaseMetaData = connection.getMetaData();
        ResultSet rs = databaseMetaData.getColumns(null, "%", generator.getTableName(), "%");
        List<TableInformation> lists = new ArrayList<>();
        while(rs.next()){
            TableInformation tableInformation = new TableInformation();
            //列名
            tableInformation.setColumnName(rs.getString("COLUMN_NAME"));
            //类型
            tableInformation.setTypeName(rs.getString("TYPE_NAME"));
            //注释
            tableInformation.setRemarks(rs.getString("REMARKS"));
            lists.add(tableInformation);
        }
        CodeGeneratorManager cgm = new CodeGeneratorManager();
        cgm.genCode(lists,generator,sysDatabases);
        return "";
    }
}
