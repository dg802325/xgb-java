package com.xgb.model;

import java.util.Date;

public class JjhnjGyhdmx {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Integer huodongshu;

    private Date tjnjshijian1;

    private Date tjnjshijian2;

    private String wuciqingkuang;

    public JjhnjGyhdmx(Long id, String instanceid, String organizationid, Short status, Integer huodongshu, Date tjnjshijian1, Date tjnjshijian2, String wuciqingkuang) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.huodongshu = huodongshu;
        this.tjnjshijian1 = tjnjshijian1;
        this.tjnjshijian2 = tjnjshijian2;
        this.wuciqingkuang = wuciqingkuang;
    }

    public JjhnjGyhdmx() {
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

    public Integer getHuodongshu() {
        return huodongshu;
    }

    public void setHuodongshu(Integer huodongshu) {
        this.huodongshu = huodongshu;
    }

    public Date getTjnjshijian1() {
        return tjnjshijian1;
    }

    public void setTjnjshijian1(Date tjnjshijian1) {
        this.tjnjshijian1 = tjnjshijian1;
    }

    public Date getTjnjshijian2() {
        return tjnjshijian2;
    }

    public void setTjnjshijian2(Date tjnjshijian2) {
        this.tjnjshijian2 = tjnjshijian2;
    }

    public String getWuciqingkuang() {
        return wuciqingkuang;
    }

    public void setWuciqingkuang(String wuciqingkuang) {
        this.wuciqingkuang = wuciqingkuang == null ? null : wuciqingkuang.trim();
    }
}