package com.xgb.model;

import java.math.BigDecimal;

public class StNjAdministratCost {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Long masterid;

    private String shoufeixiangmu;

    private Double shoufeibiaozhu;

    private String sheliyiju;

    private Double heji;

    private String zichaqingliyijian;

    private Double xingzhengshoufeizonge;

    private String shifoushanzigenggai;

    private Double shanzishejijine;

    private Double zixingjianmianshoufei;

    private String jianmianshoufeijutiqingkuang;

    private BigDecimal zhenggaijine;

    private String zhenggaijinejutiqingkuang;

    private Long xuhao;

    public StNjAdministratCost(Long id, String instanceid, String organizationid, Short status, Long masterid, String shoufeixiangmu, Double shoufeibiaozhu, String sheliyiju, Double heji, String zichaqingliyijian, Double xingzhengshoufeizonge, String shifoushanzigenggai, Double shanzishejijine, Double zixingjianmianshoufei, String jianmianshoufeijutiqingkuang, BigDecimal zhenggaijine, String zhenggaijinejutiqingkuang, Long xuhao) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.masterid = masterid;
        this.shoufeixiangmu = shoufeixiangmu;
        this.shoufeibiaozhu = shoufeibiaozhu;
        this.sheliyiju = sheliyiju;
        this.heji = heji;
        this.zichaqingliyijian = zichaqingliyijian;
        this.xingzhengshoufeizonge = xingzhengshoufeizonge;
        this.shifoushanzigenggai = shifoushanzigenggai;
        this.shanzishejijine = shanzishejijine;
        this.zixingjianmianshoufei = zixingjianmianshoufei;
        this.jianmianshoufeijutiqingkuang = jianmianshoufeijutiqingkuang;
        this.zhenggaijine = zhenggaijine;
        this.zhenggaijinejutiqingkuang = zhenggaijinejutiqingkuang;
        this.xuhao = xuhao;
    }

    public StNjAdministratCost() {
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

    public Double getShoufeibiaozhu() {
        return shoufeibiaozhu;
    }

    public void setShoufeibiaozhu(Double shoufeibiaozhu) {
        this.shoufeibiaozhu = shoufeibiaozhu;
    }

    public String getSheliyiju() {
        return sheliyiju;
    }

    public void setSheliyiju(String sheliyiju) {
        this.sheliyiju = sheliyiju == null ? null : sheliyiju.trim();
    }

    public Double getHeji() {
        return heji;
    }

    public void setHeji(Double heji) {
        this.heji = heji;
    }

    public String getZichaqingliyijian() {
        return zichaqingliyijian;
    }

    public void setZichaqingliyijian(String zichaqingliyijian) {
        this.zichaqingliyijian = zichaqingliyijian == null ? null : zichaqingliyijian.trim();
    }

    public Double getXingzhengshoufeizonge() {
        return xingzhengshoufeizonge;
    }

    public void setXingzhengshoufeizonge(Double xingzhengshoufeizonge) {
        this.xingzhengshoufeizonge = xingzhengshoufeizonge;
    }

    public String getShifoushanzigenggai() {
        return shifoushanzigenggai;
    }

    public void setShifoushanzigenggai(String shifoushanzigenggai) {
        this.shifoushanzigenggai = shifoushanzigenggai == null ? null : shifoushanzigenggai.trim();
    }

    public Double getShanzishejijine() {
        return shanzishejijine;
    }

    public void setShanzishejijine(Double shanzishejijine) {
        this.shanzishejijine = shanzishejijine;
    }

    public Double getZixingjianmianshoufei() {
        return zixingjianmianshoufei;
    }

    public void setZixingjianmianshoufei(Double zixingjianmianshoufei) {
        this.zixingjianmianshoufei = zixingjianmianshoufei;
    }

    public String getJianmianshoufeijutiqingkuang() {
        return jianmianshoufeijutiqingkuang;
    }

    public void setJianmianshoufeijutiqingkuang(String jianmianshoufeijutiqingkuang) {
        this.jianmianshoufeijutiqingkuang = jianmianshoufeijutiqingkuang == null ? null : jianmianshoufeijutiqingkuang.trim();
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