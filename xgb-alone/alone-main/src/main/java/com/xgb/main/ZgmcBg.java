package com.xgb.main;

import com.xgb.common.GbaseUtils;
import com.xgb.model.Shzz;
import com.xgb.util.MyTools;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.xgb.utils.SelectJcJo.conn;

public class ZgmcBg {

    public static void main(String[] args) {
        String file = "E:\\work\\文档\\jhsql.xlsx";
        List<Shzz> shzzes = new ArrayList<>();
        try {
            shzzes = getExcelResourceList(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Connection conn = GbaseUtils.getConnection();
        System.out.println(shzzes);
        for (Shzz shzz : shzzes) {
            Integer save = save(conn, shzz);
            System.out.println(save);
        }
        System.out.println("执行完成");
    }

    public static List<Shzz> getExcelResourceList(String excelUrl) throws IOException {
        List<Shzz> list = new ArrayList<Shzz>();
        //创建Excel，读取文件内容
        Workbook workbook = null;
        try {
            workbook = WorkbookFactory.create(new FileInputStream(excelUrl));
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
        //两种方式读取工作表
//         Sheet sheet=workbook.getSheet("Sheet0");
        Sheet sheet=workbook.getSheetAt(0);
        //获取sheet中最后一行行号
        int lastRowNum=sheet.getLastRowNum();
        for (int i=0;i<=lastRowNum;i++){
            Row row=sheet.getRow(i);
            //获取当前行最后单元格列号ot
            int lastCellNum=row.getLastCellNum();
            for (int j=0;j<lastCellNum;j=j+lastCellNum){
                Shzz jj = new Shzz();
                jj.setId(j+"");
                jj.setName(row.getCell(0).getStringCellValue());
                jj.setZgmc(row.getCell(1).getStringCellValue());
                list.add(jj);
            }
        }
        return list;
    }



    public static Integer save(Connection conn,Shzz shzz){

        String sql = "insert into jc_department_zgmc_bg(old_zgdwmc,new_zgdwmc,create_date,status) value(?,?,?,?);";
        PreparedStatement ps = null;
        ResultSet rs = null;
        int len = 0;
        try {
            conn.setAutoCommit(false);
            //Statement.RETURN_GENERATED_KEYS:获取自动增加的id号
            ps = (PreparedStatement) conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,shzz.getName());
            ps.setString(2,shzz.getZgmc());
            ps.setDate(3, new Date(new java.util.Date().getTime()));
            ps.setInt(4,1);
            ps.executeUpdate();
            len ++;
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }finally {
        }
        return len;
    }
}
