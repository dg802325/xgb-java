package com.xgb.model;

import java.math.BigDecimal;

public class JjhnjWtlcTest002Sub {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Long masterid;

    private String shoutuoren;

    private String faren;

    private BigDecimal weituojine;

    private String weituoqixian;

    private String baochou;

    private String shijishouyi;

    private BigDecimal shouhuijine;

    private Short iszizhi;

    public JjhnjWtlcTest002Sub(Long id, String instanceid, String organizationid, Short status, Long masterid, String shoutuoren, String faren, BigDecimal weituojine, String weituoqixian, String baochou, String shijishouyi, BigDecimal shouhuijine, Short iszizhi) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.masterid = masterid;
        this.shoutuoren = shoutuoren;
        this.faren = faren;
        this.weituojine = weituojine;
        this.weituoqixian = weituoqixian;
        this.baochou = baochou;
        this.shijishouyi = shijishouyi;
        this.shouhuijine = shouhuijine;
        this.iszizhi = iszizhi;
    }

    public JjhnjWtlcTest002Sub() {
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

    public String getShoutuoren() {
        return shoutuoren;
    }

    public void setShoutuoren(String shoutuoren) {
        this.shoutuoren = shoutuoren == null ? null : shoutuoren.trim();
    }

    public String getFaren() {
        return faren;
    }

    public void setFaren(String faren) {
        this.faren = faren == null ? null : faren.trim();
    }

    public BigDecimal getWeituojine() {
        return weituojine;
    }

    public void setWeituojine(BigDecimal weituojine) {
        this.weituojine = weituojine;
    }

    public String getWeituoqixian() {
        return weituoqixian;
    }

    public void setWeituoqixian(String weituoqixian) {
        this.weituoqixian = weituoqixian == null ? null : weituoqixian.trim();
    }

    public String getBaochou() {
        return baochou;
    }

    public void setBaochou(String baochou) {
        this.baochou = baochou == null ? null : baochou.trim();
    }

    public String getShijishouyi() {
        return shijishouyi;
    }

    public void setShijishouyi(String shijishouyi) {
        this.shijishouyi = shijishouyi == null ? null : shijishouyi.trim();
    }

    public BigDecimal getShouhuijine() {
        return shouhuijine;
    }

    public void setShouhuijine(BigDecimal shouhuijine) {
        this.shouhuijine = shouhuijine;
    }

    public Short getIszizhi() {
        return iszizhi;
    }

    public void setIszizhi(Short iszizhi) {
        this.iszizhi = iszizhi;
    }
}