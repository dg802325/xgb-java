package com.xgb.model;

import java.util.Date;

public class JjhnjJshjdglSub {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Long masterid;

    private String chufazhonglei;

    private String chufashishijiguan;

    private Date chufashijian;

    private String weifaxingwei;

    public JjhnjJshjdglSub(Long id, String instanceid, String organizationid, Short status, Long masterid, String chufazhonglei, String chufashishijiguan, Date chufashijian, String weifaxingwei) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.masterid = masterid;
        this.chufazhonglei = chufazhonglei;
        this.chufashishijiguan = chufashishijiguan;
        this.chufashijian = chufashijian;
        this.weifaxingwei = weifaxingwei;
    }

    public JjhnjJshjdglSub() {
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

    public String getChufazhonglei() {
        return chufazhonglei;
    }

    public void setChufazhonglei(String chufazhonglei) {
        this.chufazhonglei = chufazhonglei == null ? null : chufazhonglei.trim();
    }

    public String getChufashishijiguan() {
        return chufashishijiguan;
    }

    public void setChufashishijiguan(String chufashishijiguan) {
        this.chufashishijiguan = chufashishijiguan == null ? null : chufashishijiguan.trim();
    }

    public Date getChufashijian() {
        return chufashijian;
    }

    public void setChufashijian(Date chufashijian) {
        this.chufashijian = chufashijian;
    }

    public String getWeifaxingwei() {
        return weifaxingwei;
    }

    public void setWeifaxingwei(String weifaxingwei) {
        this.weifaxingwei = weifaxingwei == null ? null : weifaxingwei.trim();
    }
}