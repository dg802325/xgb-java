package com.xgb.model;

/**
 * @Auther: 邓根
 * @Date: 2019/9/2 14:03
 * @Description:
 */
public class Generator {

    private String dataId;
    private String tableName;
    private String isModel;
    private String isMapper;
    private String isMapperXml;
    private String isSqlMapper;
    private String isSqlMapperXml;
    private String isService;
    private String isController;
    private String isVueList;

    public String getIsModel() {
        return isModel;
    }

    public void setIsModel(String isModel) {
        this.isModel = isModel;
    }

    public String getIsMapper() {
        return isMapper;
    }

    public void setIsMapper(String isMapper) {
        this.isMapper = isMapper;
    }

    public String getIsMapperXml() {
        return isMapperXml;
    }

    public void setIsMapperXml(String isMapperXml) {
        this.isMapperXml = isMapperXml;
    }

    public String getIsSqlMapper() {
        return isSqlMapper;
    }

    public void setIsSqlMapper(String isSqlMapper) {
        this.isSqlMapper = isSqlMapper;
    }

    public String getIsSqlMapperXml() {
        return isSqlMapperXml;
    }

    public void setIsSqlMapperXml(String isSqlMapperXml) {
        this.isSqlMapperXml = isSqlMapperXml;
    }

    public String getIsService() {
        return isService;
    }

    public void setIsService(String isService) {
        this.isService = isService;
    }

    public String getIsController() {
        return isController;
    }

    public void setIsController(String isController) {
        this.isController = isController;
    }

    public String getIsVueList() {
        return isVueList;
    }

    public void setIsVueList(String isVueList) {
        this.isVueList = isVueList;
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
