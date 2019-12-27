package com.xgb.model;

import java.math.BigDecimal;
import java.util.Date;

public class StNjReport16Sub1 {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Long masterid;

    private String xuhao;

    private String guojizuzhi;

    private String xiangmumingcheng;

    private String pizhunjiguan;

    private String hezuodanwei;

    private BigDecimal jingnei;

    private BigDecimal jingwai;

    private String xiangmuleibie;

    private Date shishikaishishijian;

    private String shishidi;

    private Date shishijieshushijian;

    private String tjnjjieguo1;

    private String tjnjjieguo2;

    private String tjnjyijian1;

    private String tjnjyijian2;

    private String tjnjxingming1;

    private String tjnjxingming2;

    private Date tjnjshijian1;

    private Date tjnjshijian2;

    private String wuciqingkuang;

    public StNjReport16Sub1(Long id, String instanceid, String organizationid, Short status, Long masterid, String xuhao, String guojizuzhi, String xiangmumingcheng, String pizhunjiguan, String hezuodanwei, BigDecimal jingnei, BigDecimal jingwai, String xiangmuleibie, Date shishikaishishijian, String shishidi, Date shishijieshushijian, String tjnjjieguo1, String tjnjjieguo2, String tjnjyijian1, String tjnjyijian2, String tjnjxingming1, String tjnjxingming2, Date tjnjshijian1, Date tjnjshijian2, String wuciqingkuang) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.masterid = masterid;
        this.xuhao = xuhao;
        this.guojizuzhi = guojizuzhi;
        this.xiangmumingcheng = xiangmumingcheng;
        this.pizhunjiguan = pizhunjiguan;
        this.hezuodanwei = hezuodanwei;
        this.jingnei = jingnei;
        this.jingwai = jingwai;
        this.xiangmuleibie = xiangmuleibie;
        this.shishikaishishijian = shishikaishishijian;
        this.shishidi = shishidi;
        this.shishijieshushijian = shishijieshushijian;
        this.tjnjjieguo1 = tjnjjieguo1;
        this.tjnjjieguo2 = tjnjjieguo2;
        this.tjnjyijian1 = tjnjyijian1;
        this.tjnjyijian2 = tjnjyijian2;
        this.tjnjxingming1 = tjnjxingming1;
        this.tjnjxingming2 = tjnjxingming2;
        this.tjnjshijian1 = tjnjshijian1;
        this.tjnjshijian2 = tjnjshijian2;
        this.wuciqingkuang = wuciqingkuang;
    }

    public StNjReport16Sub1() {
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

    public String getGuojizuzhi() {
        return guojizuzhi;
    }

    public void setGuojizuzhi(String guojizuzhi) {
        this.guojizuzhi = guojizuzhi == null ? null : guojizuzhi.trim();
    }

    public String getXiangmumingcheng() {
        return xiangmumingcheng;
    }

    public void setXiangmumingcheng(String xiangmumingcheng) {
        this.xiangmumingcheng = xiangmumingcheng == null ? null : xiangmumingcheng.trim();
    }

    public String getPizhunjiguan() {
        return pizhunjiguan;
    }

    public void setPizhunjiguan(String pizhunjiguan) {
        this.pizhunjiguan = pizhunjiguan == null ? null : pizhunjiguan.trim();
    }

    public String getHezuodanwei() {
        return hezuodanwei;
    }

    public void setHezuodanwei(String hezuodanwei) {
        this.hezuodanwei = hezuodanwei == null ? null : hezuodanwei.trim();
    }

    public BigDecimal getJingnei() {
        return jingnei;
    }

    public void setJingnei(BigDecimal jingnei) {
        this.jingnei = jingnei;
    }

    public BigDecimal getJingwai() {
        return jingwai;
    }

    public void setJingwai(BigDecimal jingwai) {
        this.jingwai = jingwai;
    }

    public String getXiangmuleibie() {
        return xiangmuleibie;
    }

    public void setXiangmuleibie(String xiangmuleibie) {
        this.xiangmuleibie = xiangmuleibie == null ? null : xiangmuleibie.trim();
    }

    public Date getShishikaishishijian() {
        return shishikaishishijian;
    }

    public void setShishikaishishijian(Date shishikaishishijian) {
        this.shishikaishishijian = shishikaishishijian;
    }

    public String getShishidi() {
        return shishidi;
    }

    public void setShishidi(String shishidi) {
        this.shishidi = shishidi == null ? null : shishidi.trim();
    }

    public Date getShishijieshushijian() {
        return shishijieshushijian;
    }

    public void setShishijieshushijian(Date shishijieshushijian) {
        this.shishijieshushijian = shishijieshushijian;
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

    public String getWuciqingkuang() {
        return wuciqingkuang;
    }

    public void setWuciqingkuang(String wuciqingkuang) {
        this.wuciqingkuang = wuciqingkuang == null ? null : wuciqingkuang.trim();
    }
}