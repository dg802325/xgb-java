package com.xgb.model;

public class StNjQgothercase19Sub {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Long masterid;

    private String qitaqingkuang;

    public StNjQgothercase19Sub(Long id, String instanceid, String organizationid, Short status, Long masterid, String qitaqingkuang) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.masterid = masterid;
        this.qitaqingkuang = qitaqingkuang;
    }

    public StNjQgothercase19Sub() {
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

    public String getQitaqingkuang() {
        return qitaqingkuang;
    }

    public void setQitaqingkuang(String qitaqingkuang) {
        this.qitaqingkuang = qitaqingkuang == null ? null : qitaqingkuang.trim();
    }
}