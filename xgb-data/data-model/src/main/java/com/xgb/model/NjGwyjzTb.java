package com.xgb.model;

import java.util.Date;

public class NjGwyjzTb {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private String danweimingcheng;

    private String qianzi;

    private Date tianbiaoshijian;

    public NjGwyjzTb(Long id, String instanceid, String organizationid, Short status, String danweimingcheng, String qianzi, Date tianbiaoshijian) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.danweimingcheng = danweimingcheng;
        this.qianzi = qianzi;
        this.tianbiaoshijian = tianbiaoshijian;
    }

    public NjGwyjzTb() {
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

    public String getDanweimingcheng() {
        return danweimingcheng;
    }

    public void setDanweimingcheng(String danweimingcheng) {
        this.danweimingcheng = danweimingcheng == null ? null : danweimingcheng.trim();
    }

    public String getQianzi() {
        return qianzi;
    }

    public void setQianzi(String qianzi) {
        this.qianzi = qianzi == null ? null : qianzi.trim();
    }

    public Date getTianbiaoshijian() {
        return tianbiaoshijian;
    }

    public void setTianbiaoshijian(Date tianbiaoshijian) {
        this.tianbiaoshijian = tianbiaoshijian;
    }
}