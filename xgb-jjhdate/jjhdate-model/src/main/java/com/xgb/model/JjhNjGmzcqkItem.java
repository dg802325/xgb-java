package com.xgb.model;

import java.math.BigDecimal;

public class JjhNjGmzcqkItem {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Long masterid;

    private Short status;

    private Long xuhao;

    private Object mingcheng;

    private BigDecimal goumaijine;

    private BigDecimal shijishouyi;

    private BigDecimal shijishouhui;

    public JjhNjGmzcqkItem(Long id, String instanceid, String organizationid, Long masterid, Short status, Long xuhao, Object mingcheng, BigDecimal goumaijine, BigDecimal shijishouyi, BigDecimal shijishouhui) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.masterid = masterid;
        this.status = status;
        this.xuhao = xuhao;
        this.mingcheng = mingcheng;
        this.goumaijine = goumaijine;
        this.shijishouyi = shijishouyi;
        this.shijishouhui = shijishouhui;
    }

    public JjhNjGmzcqkItem() {
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

    public BigDecimal getGoumaijine() {
        return goumaijine;
    }

    public void setGoumaijine(BigDecimal goumaijine) {
        this.goumaijine = goumaijine;
    }

    public BigDecimal getShijishouyi() {
        return shijishouyi;
    }

    public void setShijishouyi(BigDecimal shijishouyi) {
        this.shijishouyi = shijishouyi;
    }

    public BigDecimal getShijishouhui() {
        return shijishouhui;
    }

    public void setShijishouhui(BigDecimal shijishouhui) {
        this.shijishouhui = shijishouhui;
    }
}