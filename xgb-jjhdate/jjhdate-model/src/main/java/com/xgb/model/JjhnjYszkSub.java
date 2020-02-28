package com.xgb.model;

import java.math.BigDecimal;

public class JjhnjYszkSub {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Long masterid;

    private String xiangmu;

    private BigDecimal nianchuyue;

    private BigDecimal zengjiae;

    private BigDecimal jianshaoe;

    private BigDecimal nianmoyue;

    private String kehu;

    public JjhnjYszkSub(Long id, String instanceid, String organizationid, Short status, Long masterid, String xiangmu, BigDecimal nianchuyue, BigDecimal zengjiae, BigDecimal jianshaoe, BigDecimal nianmoyue, String kehu) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.masterid = masterid;
        this.xiangmu = xiangmu;
        this.nianchuyue = nianchuyue;
        this.zengjiae = zengjiae;
        this.jianshaoe = jianshaoe;
        this.nianmoyue = nianmoyue;
        this.kehu = kehu;
    }

    public JjhnjYszkSub() {
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

    public String getXiangmu() {
        return xiangmu;
    }

    public void setXiangmu(String xiangmu) {
        this.xiangmu = xiangmu == null ? null : xiangmu.trim();
    }

    public BigDecimal getNianchuyue() {
        return nianchuyue;
    }

    public void setNianchuyue(BigDecimal nianchuyue) {
        this.nianchuyue = nianchuyue;
    }

    public BigDecimal getZengjiae() {
        return zengjiae;
    }

    public void setZengjiae(BigDecimal zengjiae) {
        this.zengjiae = zengjiae;
    }

    public BigDecimal getJianshaoe() {
        return jianshaoe;
    }

    public void setJianshaoe(BigDecimal jianshaoe) {
        this.jianshaoe = jianshaoe;
    }

    public BigDecimal getNianmoyue() {
        return nianmoyue;
    }

    public void setNianmoyue(BigDecimal nianmoyue) {
        this.nianmoyue = nianmoyue;
    }

    public String getKehu() {
        return kehu;
    }

    public void setKehu(String kehu) {
        this.kehu = kehu == null ? null : kehu.trim();
    }
}