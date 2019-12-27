package com.xgb.model;

import java.math.BigDecimal;

public class StNjServiceCostInx {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Long masterid;

    private BigDecimal fuwushoufeizonge;

    private String shifouqiangzhi;

    private BigDecimal qiangzhishejijine;

    private String shifouliyong;

    private BigDecimal liyongshejijine;

    private BigDecimal zixingjianmianhuifei;

    private String jianmianhuifeijutiqingkuang;

    private BigDecimal zhenggaijine;

    private String zhenggaijinejutiqingkuang;

    private String wuciqingkuang;

    public StNjServiceCostInx(Long id, String instanceid, String organizationid, Short status, Long masterid, BigDecimal fuwushoufeizonge, String shifouqiangzhi, BigDecimal qiangzhishejijine, String shifouliyong, BigDecimal liyongshejijine, BigDecimal zixingjianmianhuifei, String jianmianhuifeijutiqingkuang, BigDecimal zhenggaijine, String zhenggaijinejutiqingkuang, String wuciqingkuang) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.masterid = masterid;
        this.fuwushoufeizonge = fuwushoufeizonge;
        this.shifouqiangzhi = shifouqiangzhi;
        this.qiangzhishejijine = qiangzhishejijine;
        this.shifouliyong = shifouliyong;
        this.liyongshejijine = liyongshejijine;
        this.zixingjianmianhuifei = zixingjianmianhuifei;
        this.jianmianhuifeijutiqingkuang = jianmianhuifeijutiqingkuang;
        this.zhenggaijine = zhenggaijine;
        this.zhenggaijinejutiqingkuang = zhenggaijinejutiqingkuang;
        this.wuciqingkuang = wuciqingkuang;
    }

    public StNjServiceCostInx() {
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

    public BigDecimal getFuwushoufeizonge() {
        return fuwushoufeizonge;
    }

    public void setFuwushoufeizonge(BigDecimal fuwushoufeizonge) {
        this.fuwushoufeizonge = fuwushoufeizonge;
    }

    public String getShifouqiangzhi() {
        return shifouqiangzhi;
    }

    public void setShifouqiangzhi(String shifouqiangzhi) {
        this.shifouqiangzhi = shifouqiangzhi == null ? null : shifouqiangzhi.trim();
    }

    public BigDecimal getQiangzhishejijine() {
        return qiangzhishejijine;
    }

    public void setQiangzhishejijine(BigDecimal qiangzhishejijine) {
        this.qiangzhishejijine = qiangzhishejijine;
    }

    public String getShifouliyong() {
        return shifouliyong;
    }

    public void setShifouliyong(String shifouliyong) {
        this.shifouliyong = shifouliyong == null ? null : shifouliyong.trim();
    }

    public BigDecimal getLiyongshejijine() {
        return liyongshejijine;
    }

    public void setLiyongshejijine(BigDecimal liyongshejijine) {
        this.liyongshejijine = liyongshejijine;
    }

    public BigDecimal getZixingjianmianhuifei() {
        return zixingjianmianhuifei;
    }

    public void setZixingjianmianhuifei(BigDecimal zixingjianmianhuifei) {
        this.zixingjianmianhuifei = zixingjianmianhuifei;
    }

    public String getJianmianhuifeijutiqingkuang() {
        return jianmianhuifeijutiqingkuang;
    }

    public void setJianmianhuifeijutiqingkuang(String jianmianhuifeijutiqingkuang) {
        this.jianmianhuifeijutiqingkuang = jianmianhuifeijutiqingkuang == null ? null : jianmianhuifeijutiqingkuang.trim();
    }

    public BigDecimal getZhenggaijine() {
        return zhenggaijine;
    }

    public void setZhenggaijine(BigDecimal zhenggaijine) {
        this.zhenggaijine = zhenggaijine;
    }

    public String getZhenggaijinejutiqingkuang() {
        return zhenggaijinejutiqingkuang;
    }

    public void setZhenggaijinejutiqingkuang(String zhenggaijinejutiqingkuang) {
        this.zhenggaijinejutiqingkuang = zhenggaijinejutiqingkuang == null ? null : zhenggaijinejutiqingkuang.trim();
    }

    public String getWuciqingkuang() {
        return wuciqingkuang;
    }

    public void setWuciqingkuang(String wuciqingkuang) {
        this.wuciqingkuang = wuciqingkuang == null ? null : wuciqingkuang.trim();
    }
}