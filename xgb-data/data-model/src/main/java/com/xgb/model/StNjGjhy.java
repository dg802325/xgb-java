package com.xgb.model;

import java.util.Date;

public class StNjGjhy {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private String tjnjjieguo1;

    private String tjnjjieguo2;

    private String tjnjyijian1;

    private String tjnjyijian2;

    private String tjnjxingming1;

    private String tjnjxingming2;

    private Date tjnjshijian1;

    private Date tjnjshijian2;

    public StNjGjhy(Long id, String instanceid, String organizationid, Short status, String tjnjjieguo1, String tjnjjieguo2, String tjnjyijian1, String tjnjyijian2, String tjnjxingming1, String tjnjxingming2, Date tjnjshijian1, Date tjnjshijian2) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.tjnjjieguo1 = tjnjjieguo1;
        this.tjnjjieguo2 = tjnjjieguo2;
        this.tjnjyijian1 = tjnjyijian1;
        this.tjnjyijian2 = tjnjyijian2;
        this.tjnjxingming1 = tjnjxingming1;
        this.tjnjxingming2 = tjnjxingming2;
        this.tjnjshijian1 = tjnjshijian1;
        this.tjnjshijian2 = tjnjshijian2;
    }

    public StNjGjhy() {
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