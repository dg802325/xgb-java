package com.xgb.model;

import java.util.Date;

public class LshGzry {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Long masterid;

    private String xuhao;

    private String xingming;

    private String zhengzhimianmao;

    private String bumenzhiwu;

    private Date shengri;

    private String xueli;

    private Short xingbie;

    private String dangzhibu;

    public LshGzry(Long id, String instanceid, String organizationid, Short status, Long masterid, String xuhao, String xingming, String zhengzhimianmao, String bumenzhiwu, Date shengri, String xueli, Short xingbie, String dangzhibu) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.masterid = masterid;
        this.xuhao = xuhao;
        this.xingming = xingming;
        this.zhengzhimianmao = zhengzhimianmao;
        this.bumenzhiwu = bumenzhiwu;
        this.shengri = shengri;
        this.xueli = xueli;
        this.xingbie = xingbie;
        this.dangzhibu = dangzhibu;
    }

    public LshGzry() {
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

    public String getZhengzhimianmao() {
        return zhengzhimianmao;
    }

    public void setZhengzhimianmao(String zhengzhimianmao) {
        this.zhengzhimianmao = zhengzhimianmao == null ? null : zhengzhimianmao.trim();
    }

    public String getBumenzhiwu() {
        return bumenzhiwu;
    }

    public void setBumenzhiwu(String bumenzhiwu) {
        this.bumenzhiwu = bumenzhiwu == null ? null : bumenzhiwu.trim();
    }

    public Date getShengri() {
        return shengri;
    }

    public void setShengri(Date shengri) {
        this.shengri = shengri;
    }

    public String getXueli() {
        return xueli;
    }

    public void setXueli(String xueli) {
        this.xueli = xueli == null ? null : xueli.trim();
    }

    public Short getXingbie() {
        return xingbie;
    }

    public void setXingbie(Short xingbie) {
        this.xingbie = xingbie;
    }

    public String getDangzhibu() {
        return dangzhibu;
    }

    public void setDangzhibu(String dangzhibu) {
        this.dangzhibu = dangzhibu == null ? null : dangzhibu.trim();
    }
}