package com.xgb.model;

public class JjhNjReportQtnsjgItem {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Long masterid;

    private Short status;

    private Long xuhao;

    private Object mingcheng;

    private Object fuzeren;

    private Object zhusuo;

    public JjhNjReportQtnsjgItem(Long id, String instanceid, String organizationid, Long masterid, Short status, Long xuhao, Object mingcheng, Object fuzeren, Object zhusuo) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.masterid = masterid;
        this.status = status;
        this.xuhao = xuhao;
        this.mingcheng = mingcheng;
        this.fuzeren = fuzeren;
        this.zhusuo = zhusuo;
    }

    public JjhNjReportQtnsjgItem() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInstanceid() {
        return instanceid;
    }

    public void setInstanceid(String instanceid) {
        this.instanceid = instanceid == null ? null : instanceid.trim();
    }

    public String getOrganizationid() {
        return organizationid;
    }

    public void setOrganizationid(String organizationid) {
        this.organizationid = organizationid == null ? null : organizationid.trim();
    }

    public Long getMasterid() {
        return masterid;
    }

    public void setMasterid(Long masterid) {
        this.masterid = masterid;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Long getXuhao() {
        return xuhao;
    }

    public void setXuhao(Long xuhao) {
        this.xuhao = xuhao;
    }

    public Object getMingcheng() {
        return mingcheng;
    }

    public void setMingcheng(Object mingcheng) {
        this.mingcheng = mingcheng;
    }

    public Object getFuzeren() {
        return fuzeren;
    }

    public void setFuzeren(Object fuzeren) {
        this.fuzeren = fuzeren;
    }

    public Object getZhusuo() {
        return zhusuo;
    }

    public void setZhusuo(Object zhusuo) {
        this.zhusuo = zhusuo;
    }
}