package com.xgb.entity;

/**
 * @Auther: 邓根  数据库列表文件
 * @Date: 2019/9/2 16:44
 * @Description:
 */
public class TableColumnInfo {
    private String columnName; //列名
    private String typeName; //类型
    private String remarks; //备注

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
