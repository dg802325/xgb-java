package com.xgb.model;

import java.util.Date;

public class LsCybaZb {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Long masterid;

    private String xuhao;

    private String xingming;

    private Date chushengnianyue;

    private String neizhiwu;

    private String lishi;

    private String jizhiwu;

    private String qianzi;

    public LsCybaZb(Long id, String instanceid, String organizationid, Short status, Long masterid, String xuhao, String xingming, Date chushengnianyue, String neizhiwu, String lishi, String jizhiwu, String qianzi) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.masterid = masterid;
        this.xuhao = xuhao;
        this.xingming = xingming;
        this.chushengnianyue = chushengnianyue;
        this.neizhiwu = neizhiwu;
        this.lishi = lishi;
        this.jizhiwu = jizhiwu;
        this.qianzi = qianzi;
    }

    public LsCybaZb() {
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

    public Date getChushengnianyue() {
        return chushengnianyue;
    }

    public void setChushengnianyue(Date chushengnianyue) {
        this.chushengnianyue = chushengnianyue;
    }

    public String getNeizhiwu() {
        return neizhiwu;
    }

    public void setNeizhiwu(String neizhiwu) {
        this.neizhiwu = neizhiwu == null ? null : neizhiwu.trim();
    }

    public String getLishi() {
        return lishi;
    }

    public void setLishi(String lishi) {
        this.lishi = lishi == null ? null : lishi.trim();
    }

    public String getJizhiwu() {
        return jizhiwu;
    }

    public void setJizhiwu(String jizhiwu) {
        this.jizhiwu = jizhiwu == null ? null : jizhiwu.trim();
    }

    public String getQianzi() {
        return qianzi;
    }

    public void setQianzi(String qianzi) {
        this.qianzi = qianzi == null ? null : qianzi.trim();
    }
}