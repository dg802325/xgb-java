package com.xgb.model;

import java.util.Date;

public class Stnianjianreport9Sub {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Long masterid;

    private String xuhao;

    private String zhanghu;

    private String mingcheng;

    private String fuzeren;

    private Date dengjishijian;

    private String zhusuo;

    private String dengjizhenghao;

    private String yinhangjizhanghao;

    public Stnianjianreport9Sub(Long id, String instanceid, String organizationid, Short status, Long masterid, String xuhao, String zhanghu, String mingcheng, String fuzeren, Date dengjishijian, String zhusuo, String dengjizhenghao, String yinhangjizhanghao) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.masterid = masterid;
        this.xuhao = xuhao;
        this.zhanghu = zhanghu;
        this.mingcheng = mingcheng;
        this.fuzeren = fuzeren;
        this.dengjishijian = dengjishijian;
        this.zhusuo = zhusuo;
        this.dengjizhenghao = dengjizhenghao;
        this.yinhangjizhanghao = yinhangjizhanghao;
    }

    public Stnianjianreport9Sub() {
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

    public String getXuhao() {
        return xuhao;
    }

    public void setXuhao(String xuhao) {
        this.xuhao = xuhao == null ? null : xuhao.trim();
    }

    public String getZhanghu() {
        return zhanghu;
    }

    public void setZhanghu(String zhanghu) {
        this.zhanghu = zhanghu == null ? null : zhanghu.trim();
    }

    public String getMingcheng() {
        return mingcheng;
    }

    public void setMingcheng(String mingcheng) {
        this.mingcheng = mingcheng == null ? null : mingcheng.trim();
    }

    public String getFuzeren() {
        return fuzeren;
    }

    public void setFuzeren(String fuzeren) {
        this.fuzeren = fuzeren == null ? null : fuzeren.trim();
    }

    public Date getDengjishijian() {
        return dengjishijian;
    }

    public void setDengjishijian(Date dengjishijian) {
        this.dengjishijian = dengjishijian;
    }

    public String getZhusuo() {
        return zhusuo;
    }

    public void setZhusuo(String zhusuo) {
        this.zhusuo = zhusuo == null ? null : zhusuo.trim();
    }

    public String getDengjizhenghao() {
        return dengjizhenghao;
    }

    public void setDengjizhenghao(String dengjizhenghao) {
        this.dengjizhenghao = dengjizhenghao == null ? null : dengjizhenghao.trim();
    }

    public String getYinhangjizhanghao() {
        return yinhangjizhanghao;
    }

    public void setYinhangjizhanghao(String yinhangjizhanghao) {
        this.yinhangjizhanghao = yinhangjizhanghao == null ? null : yinhangjizhanghao.trim();
    }
}