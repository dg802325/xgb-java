package com.xgb.model;

import java.util.Date;

public class StnjYwhdTb {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Date tianbiaoshijian;

    public StnjYwhdTb(Long id, String instanceid, String organizationid, Short status, Date tianbiaoshijian) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.tianbiaoshijian = tianbiaoshijian;
    }

    public StnjYwhdTb() {
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

    public Date getTianbiaoshijian() {
        return tianbiaoshijian;
    }

    public void setTianbiaoshijian(Date tianbiaoshijian) {
        this.tianbiaoshijian = tianbiaoshijian;
    }
}