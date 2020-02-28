package com.xgb.model;

import java.math.BigDecimal;

public class JjhNjZbCsxt {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Short huodongshu;

    private String lingyu;

    private BigDecimal jine;

    private Short shifoucishan;

    private BigDecimal hejiweituo;

    private BigDecimal hejishoutuo;

    public JjhNjZbCsxt(Long id, String instanceid, String organizationid, Short status, Short huodongshu, String lingyu, BigDecimal jine, Short shifoucishan, BigDecimal hejiweituo, BigDecimal hejishoutuo) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.huodongshu = huodongshu;
        this.lingyu = lingyu;
        this.jine = jine;
        this.shifoucishan = shifoucishan;
        this.hejiweituo = hejiweituo;
        this.hejishoutuo = hejishoutuo;
    }

    public JjhNjZbCsxt() {
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

    public Short getHuodongshu() {
        return huodongshu;
    }

    public void setHuodongshu(Short huodongshu) {
        this.huodongshu = huodongshu;
    }

    public String getLingyu() {
        return lingyu;
    }

    public void setLingyu(String lingyu) {
        this.lingyu = lingyu == null ? null : lingyu.trim();
    }

    public BigDecimal getJine() {
        return jine;
    }

    public void setJine(BigDecimal jine) {
        this.jine = jine;
    }

    public Short getShifoucishan() {
        return shifoucishan;
    }

    public void setShifoucishan(Short shifoucishan) {
        this.shifoucishan = shifoucishan;
    }

    public BigDecimal getHejiweituo() {
        return hejiweituo;
    }

    public void setHejiweituo(BigDecimal hejiweituo) {
        this.hejiweituo = hejiweituo;
    }

    public BigDecimal getHejishoutuo() {
        return hejishoutuo;
    }

    public void setHejishoutuo(BigDecimal hejishoutuo) {
        this.hejishoutuo = hejishoutuo;
    }
}