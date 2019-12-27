package com.xgb.model;

import java.math.BigDecimal;

public class StNjGyhdzcSub {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private String mingcheng;

    private BigDecimal kuanwu;

    private BigDecimal renyuanfeiyong;

    private BigDecimal bangongfeiyong;

    private BigDecimal shiyongfeiyong;

    private BigDecimal chouzifeiyong;

    private BigDecimal qitafeiyong;

    private BigDecimal zongji;

    private Long masterid;

    public StNjGyhdzcSub(Long id, String instanceid, String organizationid, Short status, String mingcheng, BigDecimal kuanwu, BigDecimal renyuanfeiyong, BigDecimal bangongfeiyong, BigDecimal shiyongfeiyong, BigDecimal chouzifeiyong, BigDecimal qitafeiyong, BigDecimal zongji, Long masterid) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.mingcheng = mingcheng;
        this.kuanwu = kuanwu;
        this.renyuanfeiyong = renyuanfeiyong;
        this.bangongfeiyong = bangongfeiyong;
        this.shiyongfeiyong = shiyongfeiyong;
        this.chouzifeiyong = chouzifeiyong;
        this.qitafeiyong = qitafeiyong;
        this.zongji = zongji;
        this.masterid = masterid;
    }

    public StNjGyhdzcSub() {
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

    public String getMingcheng() {
        return mingcheng;
    }

    public void setMingcheng(String mingcheng) {
        this.mingcheng = mingcheng == null ? null : mingcheng.trim();
    }

    public BigDecimal getKuanwu() {
        return kuanwu;
    }

    public void setKuanwu(BigDecimal kuanwu) {
        this.kuanwu = kuanwu;
    }

    public BigDecimal getRenyuanfeiyong() {
        return renyuanfeiyong;
    }

    public void setRenyuanfeiyong(BigDecimal renyuanfeiyong) {
        this.renyuanfeiyong = renyuanfeiyong;
    }

    public BigDecimal getBangongfeiyong() {
        return bangongfeiyong;
    }

    public void setBangongfeiyong(BigDecimal bangongfeiyong) {
        this.bangongfeiyong = bangongfeiyong;
    }

    public BigDecimal getShiyongfeiyong() {
        return shiyongfeiyong;
    }

    public void setShiyongfeiyong(BigDecimal shiyongfeiyong) {
        this.shiyongfeiyong = shiyongfeiyong;
    }

    public BigDecimal getChouzifeiyong() {
        return chouzifeiyong;
    }

    public void setChouzifeiyong(BigDecimal chouzifeiyong) {
        this.chouzifeiyong = chouzifeiyong;
    }

    public BigDecimal getQitafeiyong() {
        return qitafeiyong;
    }

    public void setQitafeiyong(BigDecimal qitafeiyong) {
        this.qitafeiyong = qitafeiyong;
    }

    public BigDecimal getZongji() {
        return zongji;
    }

    public void setZongji(BigDecimal zongji) {
        this.zongji = zongji;
    }

    public Long getMasterid() {
        return masterid;
    }

    public void setMasterid(Long masterid) {
        this.masterid = masterid;
    }
}