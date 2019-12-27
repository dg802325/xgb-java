package com.xgb.model;

import java.util.Date;

public class StNjReport11 {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private String xinshejigou;

    private String xinshebanli;

    private String chexiaojigou;

    private String chexiaobanli;

    private String zhusuo28;

    private String niandu;

    private Date tjnjshijian1;

    private Date tjnjshijian2;

    private String tjnjjieguo1;

    private String tjnjjieguo2;

    private String tjnjyijian1;

    private String tjnjyijian2;

    private String tjnjxingming1;

    private String tjnjxingming2;

    public StNjReport11(Long id, String instanceid, String organizationid, Short status, String xinshejigou, String xinshebanli, String chexiaojigou, String chexiaobanli, String zhusuo28, String niandu, Date tjnjshijian1, Date tjnjshijian2, String tjnjjieguo1, String tjnjjieguo2, String tjnjyijian1, String tjnjyijian2, String tjnjxingming1, String tjnjxingming2) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.xinshejigou = xinshejigou;
        this.xinshebanli = xinshebanli;
        this.chexiaojigou = chexiaojigou;
        this.chexiaobanli = chexiaobanli;
        this.zhusuo28 = zhusuo28;
        this.niandu = niandu;
        this.tjnjshijian1 = tjnjshijian1;
        this.tjnjshijian2 = tjnjshijian2;
        this.tjnjjieguo1 = tjnjjieguo1;
        this.tjnjjieguo2 = tjnjjieguo2;
        this.tjnjyijian1 = tjnjyijian1;
        this.tjnjyijian2 = tjnjyijian2;
        this.tjnjxingming1 = tjnjxingming1;
        this.tjnjxingming2 = tjnjxingming2;
    }

    public StNjReport11() {
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

    public String getXinshejigou() {
        return xinshejigou;
    }

    public void setXinshejigou(String xinshejigou) {
        this.xinshejigou = xinshejigou == null ? null : xinshejigou.trim();
    }

    public String getXinshebanli() {
        return xinshebanli;
    }

    public void setXinshebanli(String xinshebanli) {
        this.xinshebanli = xinshebanli == null ? null : xinshebanli.trim();
    }

    public String getChexiaojigou() {
        return chexiaojigou;
    }

    public void setChexiaojigou(String chexiaojigou) {
        this.chexiaojigou = chexiaojigou == null ? null : chexiaojigou.trim();
    }

    public String getChexiaobanli() {
        return chexiaobanli;
    }

    public void setChexiaobanli(String chexiaobanli) {
        this.chexiaobanli = chexiaobanli == null ? null : chexiaobanli.trim();
    }

    public String getZhusuo28() {
        return zhusuo28;
    }

    public void setZhusuo28(String zhusuo28) {
        this.zhusuo28 = zhusuo28 == null ? null : zhusuo28.trim();
    }

    public String getNiandu() {
        return niandu;
    }

    public void setNiandu(String niandu) {
        this.niandu = niandu == null ? null : niandu.trim();
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
}