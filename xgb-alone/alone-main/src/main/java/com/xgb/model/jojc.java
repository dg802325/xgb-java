package com.xgb.model;

public class jojc {

    private String id;
    private String oldName;
    private String newName;
    private Integer sqlId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public Integer getSqlId() {
        return sqlId;
    }

    public void setSqlId(Integer sqlId) {
        this.sqlId = sqlId;
    }

    @Override
    public String toString() {
        return "jojc{" +
                "id=" + id +
                ", oldName='" + oldName + '\'' +
                ", newName='" + newName + '\'' +
                ", sqlId=" + sqlId +
                '}';
    }
}
