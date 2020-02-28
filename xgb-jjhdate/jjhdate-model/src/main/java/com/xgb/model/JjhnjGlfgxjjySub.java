package com.xgb.model;

import java.math.BigDecimal;

public class JjhnjGlfgxjjySub {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Long masterid;

    private String guanlianfang;

    private String guanxi;

    private BigDecimal tigongjine;

    private BigDecimal tigongyue;

    private BigDecimal goumaijine;

    private BigDecimal goumaiyue;

    public JjhnjGlfgxjjySub(Long id, String instanceid, String organizationid, Short status, Long masterid, String guanlianfang, String guanxi, BigDecimal tigongjine, BigDecimal tigongyue, BigDecimal goumaijine, BigDecimal goumaiyue) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.masterid = masterid;
        this.guanlianfang = guanlianfang;
        this.guanxi = guanxi;
        this.tigongjine = tigongjine;
        this.tigongyue = tigongyue;
        this.goumaijine = goumaijine;
        this.goumaiyue = goumaiyue;
    }

    public JjhnjGlfgxjjySub() {
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

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Long getMasterid() {
        return masterid;
    }

    public void setMasterid(Long masterid) {
        this.masterid = masterid;
    }

    public String getGuanlianfang() {
        return guanlianfang;
    }

    public void setGuanlianfang(String guanlianfang) {
        this.guanlianfang = guanlianfang == null ? null : guanlianfang.trim();
    }

    public String getGuanxi() {
        return guanxi;
    }

    public void setGuanxi(String guanxi) {
        this.guanxi = guanxi == null ? null : guanxi.trim();
    }

    public BigDecimal getTigongjine() {
        return tigongjine;
    }

    public void setTigongjine(BigDecimal tigongjine) {
        this.tigongjine = tigongjine;
    }

    public BigDecimal getTigongyue() {
        return tigongyue;
    }

    public void setTigongyue(BigDecimal tigongyue) {
        this.tigongyue = tigongyue;
    }

    public BigDecimal getGoumaijine() {
        return goumaijine;
    }

    public void setGoumaijine(BigDecimal goumaijine) {
        this.goumaijine = goumaijine;
    }

    public BigDecimal getGoumaiyue() {
        return goumaiyue;
    }

    public void setGoumaiyue(BigDecimal goumaiyue) {
        this.goumaiyue = goumaiyue;
    }
}