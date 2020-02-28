package com.xgb.model;

import java.math.BigDecimal;

public class JjhnjGyhdmx {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private BigDecimal huodongshu;

    private BigDecimal zongzhichu;

    public JjhnjGyhdmx(Long id, String instanceid, String organizationid, Short status, BigDecimal huodongshu, BigDecimal zongzhichu) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.huodongshu = huodongshu;
        this.zongzhichu = zongzhichu;
    }

    public JjhnjGyhdmx() {
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

    public BigDecimal getHuodongshu() {
        return huodongshu;
    }

    public void setHuodongshu(BigDecimal huodongshu) {
        this.huodongshu = huodongshu;
    }

    public BigDecimal getZongzhichu() {
        return zongzhichu;
    }

    public void setZongzhichu(BigDecimal zongzhichu) {
        this.zongzhichu = zongzhichu;
    }
}