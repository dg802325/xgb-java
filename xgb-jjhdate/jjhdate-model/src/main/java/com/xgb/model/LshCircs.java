package com.xgb.model;

import java.math.BigDecimal;
import java.util.Date;

public class LshCircs {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Long masterid;

    private String chengyuanxuhao;

    private String chengyuanxingming;

    private Date shengri;

    private String zhiwu;

    private Integer huiyicishu;

    private BigDecimal baochou;

    private BigDecimal jintie;

    private Short xingbie;

    private Date beianshijian;

    private String baochoushiyou;

    private Date zi;

    private Date zhi;

    private String ifdang;

    private Short iftuili;

    private Long zhengzhimianmao;

    private Long sort;

    private Long gid;

    public LshCircs(Long id, String instanceid, String organizationid, Short status, Long masterid, String chengyuanxuhao, String chengyuanxingming, Date shengri, String zhiwu, Integer huiyicishu, BigDecimal baochou, BigDecimal jintie, Short xingbie, Date beianshijian, String baochoushiyou, Date zi, Date zhi, String ifdang, Short iftuili, Long zhengzhimianmao, Long sort, Long gid) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.masterid = masterid;
        this.chengyuanxuhao = chengyuanxuhao;
        this.chengyuanxingming = chengyuanxingming;
        this.shengri = shengri;
        this.zhiwu = zhiwu;
        this.huiyicishu = huiyicishu;
        this.baochou = baochou;
        this.jintie = jintie;
        this.xingbie = xingbie;
        this.beianshijian = beianshijian;
        this.baochoushiyou = baochoushiyou;
        this.zi = zi;
        this.zhi = zhi;
        this.ifdang = ifdang;
        this.iftuili = iftuili;
        this.zhengzhimianmao = zhengzhimianmao;
        this.sort = sort;
        this.gid = gid;
    }

    public LshCircs() {
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

    public String getChengyuanxuhao() {
        return chengyuanxuhao;
    }

    public void setChengyuanxuhao(String chengyuanxuhao) {
        this.chengyuanxuhao = chengyuanxuhao == null ? null : chengyuanxuhao.trim();
    }

    public String getChengyuanxingming() {
        return chengyuanxingming;
    }

    public void setChengyuanxingming(String chengyuanxingming) {
        this.chengyuanxingming = chengyuanxingming == null ? null : chengyuanxingming.trim();
    }

    public Date getShengri() {
        return shengri;
    }

    public void setShengri(Date shengri) {
        this.shengri = shengri;
    }

    public String getZhiwu() {
        return zhiwu;
    }

    public void setZhiwu(String zhiwu) {
        this.zhiwu = zhiwu == null ? null : zhiwu.trim();
    }

    public Integer getHuiyicishu() {
        return huiyicishu;
    }

    public void setHuiyicishu(Integer huiyicishu) {
        this.huiyicishu = huiyicishu;
    }

    public BigDecimal getBaochou() {
        return baochou;
    }

    public void setBaochou(BigDecimal baochou) {
        this.baochou = baochou;
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

    public Date getZi() {
        return zi;
    }

    public void setZi(Date zi) {
        this.zi = zi;
    }

    public Date getZhi() {
        return zhi;
    }

    public void setZhi(Date zhi) {
        this.zhi = zhi;
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

    public Long getSort() {
        return sort;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }

    public Long getGid() {
        return gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }
}