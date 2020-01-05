package com.xgb.entity;

/**
 * @Auther: 邓根
 * @Date: 2019/8/28 10:56
 * @Description:
 */
public class TableInfo {
    private String tableName;//表名
    private String tableType;//表类型
    private String tableCat;//表所属数据库
    private String tableRemark;//表备注

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    public String getTableCat() {
        return tableCat;
    }

    public void setTableCat(String tableCat) {
        this.tableCat = tableCat;
    }

    public String getTableRemark() {
        return tableRemark;
    }

    public void setTableRemark(String tableRemark) {
        this.tableRemark = tableRemark;
    }
}
