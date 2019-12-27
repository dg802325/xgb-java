package com.xgb.model;

import java.math.BigDecimal;

public class StNjAppraiseCost {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Long masterid;

    private Long xuhao;

    private String biaozhangxiangmu;

    private BigDecimal shoufeibiaozhu;

    private String sheliyiju;

    private String zichaqingliyijian;

    private BigDecimal biaozhangshoufeizonge;

    private String shifouqiangzhidabiao;

    private BigDecimal qiangzhishejijine;

    private BigDecimal zixingjianmianhuifei;

    private String jianmianhuifeijutiqingkuang;

    private BigDecimal zhenggaijine;

    private String zhenggaijinejutiqingkuang;

    private BigDecimal heji;

    public StNjAppraiseCost(Long id, String instanceid, String organizationid, Short status, Long masterid, Long xuhao, String biaozhangxiangmu, BigDecimal shoufeibiaozhu, String sheliyiju, String zichaqingliyijian, BigDecimal biaozhangshoufeizonge, String shifouqiangzhidabiao, BigDecimal qiangzhishejijine, BigDecimal zixingjianmianhuifei, String jianmianhuifeijutiqingkuang, BigDecimal zhenggaijine, String zhenggaijinejutiqingkuang, BigDecimal heji) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.masterid = masterid;
        this.xuhao = xuhao;
        this.biaozhangxiangmu = biaozhangxiangmu;
        this.shoufeibiaozhu = shoufeibiaozhu;
        this.sheliyiju = sheliyiju;
        this.zichaqingliyijian = zichaqingliyijian;
        this.biaozhangshoufeizonge = biaozhangshoufeizonge;
        this.shifouqiangzhidabiao = shifouqiangzhidabiao;
        this.qiangzhishejijine = qiangzhishejijine;
        this.zixingjianmianhuifei = zixingjianmianhuifei;
        this.jianmianhuifeijutiqingkuang = jianmianhuifeijutiqingkuang;
        this.zhenggaijine = zhenggaijine;
        this.zhenggaijinejutiqingkuang = zhenggaijinejutiqingkuang;
        this.heji = heji;
    }

    public StNjAppraiseCost() {
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

    public Long getXuhao() {
        return xuhao;
    }

    public void setXuhao(Long xuhao) {
        this.xuhao = xuhao;
    }

    public String getBiaozhangxiangmu() {
        return biaozhangxiangmu;
    }

    public void setBiaozhangxiangmu(String biaozhangxiangmu) {
        this.biaozhangxiangmu = biaozhangxiangmu == null ? null : biaozhangxiangmu.trim();
    }

    public BigDecimal getShoufeibiaozhu() {
        return shoufeibiaozhu;
    }

    public void setShoufeibiaozhu(BigDecimal shoufeibiaozhu) {
        this.shoufeibiaozhu = shoufeibiaozhu;
    }

    public String getSheliyiju() {
        return sheliyiju;
    }

    public void setSheliyiju(String sheliyiju) {
        this.sheliyiju = sheliyiju == null ? null : sheliyiju.trim();
    }

    public String getZichaqingliyijian() {
        return zichaqingliyijian;
    }

    public void setZichaqingliyijian(String zichaqingliyijian) {
        this.zichaqingliyijian = zichaqingliyijian == null ? null : zichaqingliyijian.trim();
    }

    public BigDecimal getBiaozhangshoufeizonge() {
        return biaozhangshoufeizonge;
    }

    public void setBiaozhangshoufeizonge(BigDecimal biaozhangshoufeizonge) {
        this.biaozhangshoufeizonge = biaozhangshoufeizonge;
    }

    public String getShifouqiangzhidabiao() {
        return shifouqiangzhidabiao;
    }

    public void setShifouqiangzhidabiao(String shifouqiangzhidabiao) {
        this.shifouqiangzhidabiao = shifouqiangzhidabiao == null ? null : shifouqiangzhidabiao.trim();
    }

    public BigDecimal getQiangzhishejijine() {
        return qiangzhishejijine;
    }

    public void setQiangzhishejijine(BigDecimal qiangzhishejijine) {
        this.qiangzhishejijine = qiangzhishejijine;
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

    public BigDecimal getHeji() {
        return heji;
    }

    public void setHeji(BigDecimal heji) {
        this.heji = heji;
    }
}