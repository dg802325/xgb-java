package com.xgb.model;

/**
 * @Auther: 邓根
 * @Date: 2019/9/2 16:44
 * @Description:
 */
public class TableInformation {

    private String columnName;
    private String typeName;
    private String remarks;

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
