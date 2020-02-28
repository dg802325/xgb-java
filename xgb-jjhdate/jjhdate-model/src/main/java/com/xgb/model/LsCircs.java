package com.xgb.model;

import java.math.BigDecimal;
import java.util.Date;

public class LsCircs {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Long masterid;

    private String xuhao;

    private String xingming;

    private Date shengri;

    private Integer huiyicishu;

    private String zi;

    private String zhi;

    private BigDecimal jintie;

    private Short xingbie;

    private Date beianshijian;

    private String baochoushiyou;

    private String ifdang;

    private Short iftuili;

    private Long zhengzhimianmao;

    public LsCircs(Long id, String instanceid, String organizationid, Short status, Long masterid, String xuhao, String xingming, Date shengri, Integer huiyicishu, String zi, String zhi, BigDecimal jintie, Short xingbie, Date beianshijian, String baochoushiyou, String ifdang, Short iftuili, Long zhengzhimianmao) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.masterid = masterid;
        this.xuhao = xuhao;
        this.xingming = xingming;
        this.shengri = shengri;
        this.huiyicishu = huiyicishu;
        this.zi = zi;
        this.zhi = zhi;
        this.jintie = jintie;
        this.xingbie = xingbie;
        this.beianshijian = beianshijian;
        this.baochoushiyou = baochoushiyou;
        this.ifdang = ifdang;
        this.iftuili = iftuili;
        this.zhengzhimianmao = zhengzhimianmao;
    }

    public LsCircs() {
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

    public String getXuhao() {
        return xuhao;
    }

    public void setXuhao(String xuhao) {
        this.xuhao = xuhao == null ? null : xuhao.trim();
    }

    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming == null ? null : xingming.trim();
    }

    public Date getShengri() {
        return shengri;
    }

    public void setShengri(Date shengri) {
        this.shengri = shengri;
    }

    public Integer getHuiyicishu() {
        return huiyicishu;
    }

    public void setHuiyicishu(Integer huiyicishu) {
        this.huiyicishu = huiyicishu;
    }

    public String getZi() {
        return zi;
    }

    public void setZi(String zi) {
        this.zi = zi == null ? null : zi.trim();
    }

    public String getZhi() {
        return zhi;
    }

    public void setZhi(String zhi) {
        this.zhi = zhi == null ? null : zhi.trim();
    }

    public BigDecimal getJintie() {
        return jintie;
    }

    public void setJintie(BigDecimal jintie) {
        this.jintie = jintie;
    }

    public Short getXingbie() {
        return xingbie;
    }

    public void setXingbie(Short xingbie) {
        this.xingbie = xingbie;
    }

    public Date getBeianshijian() {
        return beianshijian;
    }

    public void setBeianshijian(Date beianshijian) {
        this.beianshijian = beianshijian;
    }

    public String getBaochoushiyou() {
        return baochoushiyou;
    }

    public void setBaochoushiyou(String baochoushiyou) {
        this.baochoushiyou = baochoushiyou == null ? null : baochoushiyou.trim();
    }

    public String getIfdang() {
        return ifdang;
    }

    public void setIfdang(String ifdang) {
        this.ifdang = ifdang == null ? null : ifdang.trim();
    }

    public Short getIftuili() {
        return iftuili;
    }

    public void setIftuili(Short iftuili) {
        this.iftuili = iftuili;
    }

    public Long getZhengzhimianmao() {
        return zhengzhimianmao;
    }

    public void setZhengzhimianmao(Long zhengzhimianmao) {
        this.zhengzhimianmao = zhengzhimianmao;
    }
}