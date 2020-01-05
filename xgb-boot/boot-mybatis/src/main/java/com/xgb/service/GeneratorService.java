package com.xgb.service;

import com.xgb.entity.JDBCGenerator;
import com.xgb.entity.TableColumnInfo;
import com.xgb.model.SysDatabases;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GeneratorService {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    public Boolean generator(Connection connection, List<String> strings, JDBCGenerator jdbcGenerator, SysDatabases sysDatabases,String path){
        //循环表名一个一个生成
        for (String tableName:strings){
            DatabaseMetaData databaseMetaData = null;
            FileOutputStream ftp = null;
            ResultSet rs = null;
            String code = null;
            try {
                databaseMetaData = connection.getMetaData();
                rs = databaseMetaData.getColumns(null, "%", tableName, "%");
                List<TableColumnInfo> lists = new ArrayList<TableColumnInfo>();
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
                genCode(lists,jdbcGenerator,sysDatabases,path);
            } catch (SQLException e) {
                e.printStackTrace();
                logger.error("生成失败");
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }

    /**
     * 通过数据库表名, 生成代码 如表名为 gen_test_demo 将生成 Demo & DemoMapper & DemoService & DemoServiceImpl & DemoController
     *
     * @param lists 表数组
     */
    public static Boolean genCode(List<TableColumnInfo> lists, JDBCGenerator jdbcGenerator, SysDatabases sysDatabases, String path) {
        //根据generator判断要生成的东西
        //生成Model
//        if("true".equals(jdbcGenerator.getIsModel())){
//           new ModelGenerator().genGeratorCode(lists,jdbcGenerator,sysDatabases,path);
//        }
//        //生成ModelExample
//        if("true".equals(jdbcGenerator.getIsModelExample())){
//            new ModelExampleGenerator().genGeratorCode(lists,jdbcGenerator,sysDatabases,path);
//        }
//        //生成Mapper
//        if ("true".equals(jdbcGenerator.getIsMapper())){
//            new MapperGenerator().genGeratorCode(lists,jdbcGenerator,sysDatabases,path);
//        }
////            //生成Mapperxml
//        if ("true".equals(jdbcGenerator.getIsMapperXml())){
//            new MapperXmlGenerator().genGeratorCode(lists,jdbcGenerator,sysDatabases,path);
//        }
////            //生成SqlMapper
//        if ("true".equals(jdbcGenerator.getIsSqlMapper())){
//            new SqlMapperGenerator().genGeratorCode(lists,jdbcGenerator,sysDatabases,path);
//        }
////            //生成SqlMapperXml
//        if ("true".equals(jdbcGenerator.getIsSqlMapperXml())){
//            new SqlMapperXmlGenerator().genGeratorCode(lists,jdbcGenerator,sysDatabases,path);
//        }
////            //生成Service
//        if ("true".equals(jdbcGenerator.getIsService())){
//            new ServiceGenerator().genGeratorCode(lists,jdbcGenerator,sysDatabases,path);
//        }
////            //生成Controller
//        if ("true".equals(jdbcGenerator.getIsController())){
//            new ControllerGenerator().genGeratorCode(lists,jdbcGenerator,sysDatabases,path);
//        }
////            //生成VueList
//        if ("true".equals(jdbcGenerator.getIsVueList())){
//            new VueListGenerator().genGeratorCode(lists,jdbcGenerator,sysDatabases,path);
//        }
//        //记录权限/vue路径等信息  必生成
//        if("true".equals(jdbcGenerator.getIsVueList())||"true".equals(jdbcGenerator.getIsController())){
//            new AboutGenerator().genGeratorCode(lists,jdbcGenerator,sysDatabases,path);
//        }
        return true;

    }


}
