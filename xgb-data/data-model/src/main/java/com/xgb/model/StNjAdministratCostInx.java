package com.xgb.model;

import java.math.BigDecimal;

public class StNjAdministratCostInx {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Long masterid;

    private BigDecimal xingzhengshoufeizonge;

    private String shifoushanzigenggai;

    private BigDecimal shanzishejijine;

    private BigDecimal zixingjianmianshoufei;

    private String jianmianshoufeijutiqingkuang;

    private BigDecimal zhenggaijine;

    private String zhenggaijinejutiqingkuang;

    private String wuciqingkuang;

    public StNjAdministratCostInx(Long id, String instanceid, String organizationid, Short status, Long masterid, BigDecimal xingzhengshoufeizonge, String shifoushanzigenggai, BigDecimal shanzishejijine, BigDecimal zixingjianmianshoufei, String jianmianshoufeijutiqingkuang, BigDecimal zhenggaijine, String zhenggaijinejutiqingkuang, String wuciqingkuang) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.masterid = masterid;
        this.xingzhengshoufeizonge = xingzhengshoufeizonge;
        this.shifoushanzigenggai = shifoushanzigenggai;
        this.shanzishejijine = shanzishejijine;
        this.zixingjianmianshoufei = zixingjianmianshoufei;
        this.jianmianshoufeijutiqingkuang = jianmianshoufeijutiqingkuang;
        this.zhenggaijine = zhenggaijine;
        this.zhenggaijinejutiqingkuang = zhenggaijinejutiqingkuang;
        this.wuciqingkuang = wuciqingkuang;
    }

    public StNjAdministratCostInx() {
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

    public BigDecimal getXingzhengshoufeizonge() {
        return xingzhengshoufeizonge;
    }

    public void setXingzhengshoufeizonge(BigDecimal xingzhengshoufeizonge) {
        this.xingzhengshoufeizonge = xingzhengshoufeizonge;
    }

    public String getShifoushanzigenggai() {
        return shifoushanzigenggai;
    }

    public void setShifoushanzigenggai(String shifoushanzigenggai) {
        this.shifoushanzigenggai = shifoushanzigenggai == null ? null : shifoushanzigenggai.trim();
    }

    public BigDecimal getShanzishejijine() {
        return shanzishejijine;
    }

    public void setShanzishejijine(BigDecimal shanzishejijine) {
        this.shanzishejijine = shanzishejijine;
    }

    public BigDecimal getZixingjianmianshoufei() {
        return zixingjianmianshoufei;
    }

    public void setZixingjianmianshoufei(BigDecimal zixingjianmianshoufei) {
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

    public String getWuciqingkuang() {
        return wuciqingkuang;
    }

    public void setWuciqingkuang(String wuciqingkuang) {
        this.wuciqingkuang = wuciqingkuang == null ? null : wuciqingkuang.trim();
    }
}