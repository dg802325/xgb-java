package com.xgb.model;

public class StnjYwhdSub {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Long masterid;

    private String yewuhuodong;

    public StnjYwhdSub(Long id, String instanceid, String organizationid, Short status, Long masterid, String yewuhuodong) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.masterid = masterid;
        this.yewuhuodong = yewuhuodong;
    }

    public StnjYwhdSub() {
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

    public String getYewuhuodong() {
        return yewuhuodong;
    }

    public void setYewuhuodong(String yewuhuodong) {
        this.yewuhuodong = yewuhuodong == null ? null : yewuhuodong.trim();
    }
}