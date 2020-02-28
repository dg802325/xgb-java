package com.xgb.model;

import java.math.BigDecimal;

public class JjhnjWtlcTest002 {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private BigDecimal weituojineheji;

    private BigDecimal shijishouyiheji;

    private BigDecimal shouhuijineheji;

    public JjhnjWtlcTest002(Long id, String instanceid, String organizationid, Short status, BigDecimal weituojineheji, BigDecimal shijishouyiheji, BigDecimal shouhuijineheji) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.weituojineheji = weituojineheji;
        this.shijishouyiheji = shijishouyiheji;
        this.shouhuijineheji = shouhuijineheji;
    }

    public JjhnjWtlcTest002() {
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

    public BigDecimal getWeituojineheji() {
        return weituojineheji;
    }

    public void setWeituojineheji(BigDecimal weituojineheji) {
        this.weituojineheji = weituojineheji;
    }

    public BigDecimal getShijishouyiheji() {
        return shijishouyiheji;
    }

    public void setShijishouyiheji(BigDecimal shijishouyiheji) {
        this.shijishouyiheji = shijishouyiheji;
    }

    public BigDecimal getShouhuijineheji() {
        return shouhuijineheji;
    }

    public void setShouhuijineheji(BigDecimal shouhuijineheji) {
        this.shouhuijineheji = shouhuijineheji;
    }
}