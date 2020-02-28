package com.xgb.model;

public class JjhnjXxgk {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Short isgongkai;

    public JjhnjXxgk(Long id, String instanceid, String organizationid, Short status, Short isgongkai) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.isgongkai = isgongkai;
    }

    public JjhnjXxgk() {
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

    public Short getIsgongkai() {
        return isgongkai;
    }

    public void setIsgongkai(Short isgongkai) {
        this.isgongkai = isgongkai;
    }
}