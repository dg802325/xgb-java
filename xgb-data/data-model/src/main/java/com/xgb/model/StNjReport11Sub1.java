package com.xgb.model;

import java.util.Date;

public class StNjReport11Sub1 {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Long masterid;

    private String xuhao;

    private String mingcheng;

    private String fuzeren;

    private Date beianshijian;

    private String zhusuo;

    private String tjnjjieguo1;

    private String tjnjjieguo2;

    private String tjnjyijian1;

    private String tjnjyijian2;

    private String tjnjxingming1;

    private String tjnjxingming2;

    private Date tjnjshijian1;

    private Date tjnjshijian2;

    public StNjReport11Sub1(Long id, String instanceid, String organizationid, Short status, Long masterid, String xuhao, String mingcheng, String fuzeren, Date beianshijian, String zhusuo, String tjnjjieguo1, String tjnjjieguo2, String tjnjyijian1, String tjnjyijian2, String tjnjxingming1, String tjnjxingming2, Date tjnjshijian1, Date tjnjshijian2) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.masterid = masterid;
        this.xuhao = xuhao;
        this.mingcheng = mingcheng;
        this.fuzeren = fuzeren;
        this.beianshijian = beianshijian;
        this.zhusuo = zhusuo;
        this.tjnjjieguo1 = tjnjjieguo1;
        this.tjnjjieguo2 = tjnjjieguo2;
        this.tjnjyijian1 = tjnjyijian1;
        this.tjnjyijian2 = tjnjyijian2;
        this.tjnjxingming1 = tjnjxingming1;
        this.tjnjxingming2 = tjnjxingming2;
        this.tjnjshijian1 = tjnjshijian1;
        this.tjnjshijian2 = tjnjshijian2;
    }

    public StNjReport11Sub1() {
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

    public Date getBeianshijian() {
        return beianshijian;
    }

    public void setBeianshijian(Date beianshijian) {
        this.beianshijian = beianshijian;
    }

    public String getZhusuo() {
        return zhusuo;
    }

    public void setZhusuo(String zhusuo) {
        this.zhusuo = zhusuo == null ? null : zhusuo.trim();
    }

    public String getTjnjjieguo1() {
        return tjnjjieguo1;
    }

    public void setTjnjjieguo1(String tjnjjieguo1) {
        this.tjnjjieguo1 = tjnjjieguo1 == null ? null : tjnjjieguo1.trim();
    }

    public String getTjnjjieguo2() {
        return tjnjjieguo2;
    }

    public void setTjnjjieguo2(String tjnjjieguo2) {
        this.tjnjjieguo2 = tjnjjieguo2 == null ? null : tjnjjieguo2.trim();
    }

    public String getTjnjyijian1() {
        return tjnjyijian1;
    }

    public void setTjnjyijian1(String tjnjyijian1) {
        this.tjnjyijian1 = tjnjyijian1 == null ? null : tjnjyijian1.trim();
    }

    public String getTjnjyijian2() {
        return tjnjyijian2;
    }

    public void setTjnjyijian2(String tjnjyijian2) {
        this.tjnjyijian2 = tjnjyijian2 == null ? null : tjnjyijian2.trim();
    }

    public String getTjnjxingming1() {
        return tjnjxingming1;
    }

    public void setTjnjxingming1(String tjnjxingming1) {
        this.tjnjxingming1 = tjnjxingming1 == null ? null : tjnjxingming1.trim();
    }

    public String getTjnjxingming2() {
        return tjnjxingming2;
    }

    public void setTjnjxingming2(String tjnjxingming2) {
        this.tjnjxingming2 = tjnjxingming2 == null ? null : tjnjxingming2.trim();
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
}