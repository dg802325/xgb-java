package com.xgb.controller;

import com.xgb.common.SessionUtil;
import com.xgb.lang.HttpKit;
import com.xgb.lang.R;
import com.xgb.model.SysDatabases;
import com.xgb.model.SysMabtaisPlus;
import com.xgb.mybatisplus.MybatisUtils;
import com.xgb.service.SysDatabasesService;
import com.xgb.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/admin/")
@RestController
public class MysqlController {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private MybatisUtils mybatisUtils;
    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysDatabasesService sysDatabasesService;

    @GetMapping("databaseList")
    public R getDatabaseList(){
        String sysUserId = SessionUtil.getSysUserId();
        List<SysDatabases> sysDatabasesByCreateId = sysDatabasesService.getSysDatabasesByCreateId(sysUserId);
        Map<String,Object> map = new HashMap<>();
        map.put("databases",sysDatabasesByCreateId);
        return R.ok(map,"查询成功");
    }


    /**
     * 连接mysql
     */
    @GetMapping("connectionMysql")
    public R connectionMysql() {
        logger.info("------request-address----------------：/admin/connectionMysql");
        Map<String,Object> parentMap = new HashMap<String,Object>();
        String username = "root";
        String password = "root";
        String jdbcDriver = "com.mysql.jdbc.Driver";
        String dbUrl = "jdbc:mysql://localhost:3306/xgb?useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&serverTimezone=Asia/Shanghai";
        Connection connection = mybatisUtils.getConnection(jdbcDriver, dbUrl, username, password);
        List<SysMabtaisPlus> tables = mybatisUtils.getTables(connection);
        if(tables.size()>0){
            parentMap.put("tables",tables);
            return R.ok(parentMap,"查询成功");
        }
        return R.error(999,"查询失败");
    }

    public static void main(String[] args) {
        String username = "root";
        String password = "root";
        String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost:3306/xgb?useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&serverTimezone=Asia/Shanghai";
        Connection conn = null;
        Statement stmt = null;
        try {
            // 注册 JDBC 驱动
            Class.forName(JDBC_DRIVER);
            // 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL, username, password);
            List<String> tables = getTables(conn);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                //关闭jdbc连接
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static List<String> getTables(Connection conn) throws SQLException {
        List<String> lists = new ArrayList<>();
        DatabaseMetaData dbMetData = conn.getMetaData();
        ResultSet rs = dbMetData.getTables(null, null, null, new String[] { "TABLE" });
        while (rs.next()) {
            String tableName = rs.getString("TABLE_NAME");
            System.out.println("表名：" + rs.getString("TABLE_NAME"));
            System.out.println("表类型：" + rs.getString("TABLE_TYPE"));
            System.out.println("表所属数据库：" + rs.getString("TABLE_CAT"));
            System.out.println("表备注：" + rs.getString("REMARKS"));
            lists.add(tableName);
        }
        return lists;
    }
}