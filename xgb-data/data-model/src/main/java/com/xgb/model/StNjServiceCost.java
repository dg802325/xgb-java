package com.xgb.model;

import java.math.BigDecimal;

public class StNjServiceCost {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Long masterid;

    private String shoufeixiangmu;

    private BigDecimal shoufeibiaozhu;

    private String sheliyiju;

    private BigDecimal heji;

    private String shifoulishihuitongguo;

    private String zichaqingliyijian;

    private BigDecimal fuwushoufeizonge;

    private String shifouqiangzhi;

    private BigDecimal qiangzhishejijine;

    private String shifouliyong;

    private BigDecimal liyongshejijine;

    private BigDecimal zixingjianmianhuifei;

    private String jianmianhuifeijutiqingkuang;

    private BigDecimal zhenggaijine;

    private String zhenggaijinejutiqingkuang;

    private Long xuhao;

    public StNjServiceCost(Long id, String instanceid, String organizationid, Short status, Long masterid, String shoufeixiangmu, BigDecimal shoufeibiaozhu, String sheliyiju, BigDecimal heji, String shifoulishihuitongguo, String zichaqingliyijian, BigDecimal fuwushoufeizonge, String shifouqiangzhi, BigDecimal qiangzhishejijine, String shifouliyong, BigDecimal liyongshejijine, BigDecimal zixingjianmianhuifei, String jianmianhuifeijutiqingkuang, BigDecimal zhenggaijine, String zhenggaijinejutiqingkuang, Long xuhao) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.masterid = masterid;
        this.shoufeixiangmu = shoufeixiangmu;
        this.shoufeibiaozhu = shoufeibiaozhu;
        this.sheliyiju = sheliyiju;
        this.heji = heji;
        this.shifoulishihuitongguo = shifoulishihuitongguo;
        this.zichaqingliyijian = zichaqingliyijian;
        this.fuwushoufeizonge = fuwushoufeizonge;
        this.shifouqiangzhi = shifouqiangzhi;
        this.qiangzhishejijine = qiangzhishejijine;
        this.shifouliyong = shifouliyong;
        this.liyongshejijine = liyongshejijine;
        this.zixingjianmianhuifei = zixingjianmianhuifei;
        this.jianmianhuifeijutiqingkuang = jianmianhuifeijutiqingkuang;
        this.zhenggaijine = zhenggaijine;
        this.zhenggaijinejutiqingkuang = zhenggaijinejutiqingkuang;
        this.xuhao = xuhao;
    }

    public StNjServiceCost() {
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

    public String getShoufeixiangmu() {
        return shoufeixiangmu;
    }

    public void setShoufeixiangmu(String shoufeixiangmu) {
        this.shoufeixiangmu = shoufeixiangmu == null ? null : shoufeixiangmu.trim();
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

    public BigDecimal getHeji() {
        return heji;
    }

    public void setHeji(BigDecimal heji) {
        this.heji = heji;
    }

    public String getShifoulishihuitongguo() {
        return shifoulishihuitongguo;
    }

    public void setShifoulishihuitongguo(String shifoulishihuitongguo) {
        this.shifoulishihuitongguo = shifoulishihuitongguo == null ? null : shifoulishihuitongguo.trim();
    }

    public String getZichaqingliyijian() {
        return zichaqingliyijian;
    }

    public void setZichaqingliyijian(String zichaqingliyijian) {
        this.zichaqingliyijian = zichaqingliyijian == null ? null : zichaqingliyijian.trim();
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

    public Long getXuhao() {
        return xuhao;
    }

    public void setXuhao(Long xuhao) {
        this.xuhao = xuhao;
    }
}