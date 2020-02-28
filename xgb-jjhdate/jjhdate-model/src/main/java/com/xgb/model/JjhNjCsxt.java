package com.xgb.model;

public class JjhNjCsxt {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Long masterid;

    private String xuhao;

    private String mingcheng;

    private String wietuo;

    private String yongtu;

    private String gongtongshoutuofang;

    private Long xintuotaiwuyue;

    public JjhNjCsxt(Long id, String instanceid, String organizationid, Short status, Long masterid, String xuhao, String mingcheng, String wietuo, String yongtu, String gongtongshoutuofang, Long xintuotaiwuyue) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.masterid = masterid;
        this.xuhao = xuhao;
        this.mingcheng = mingcheng;
        this.wietuo = wietuo;
        this.yongtu = yongtu;
        this.gongtongshoutuofang = gongtongshoutuofang;
        this.xintuotaiwuyue = xintuotaiwuyue;
    }

    public JjhNjCsxt() {
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

    public String getWietuo() {
        return wietuo;
    }

    public void setWietuo(String wietuo) {
        this.wietuo = wietuo == null ? null : wietuo.trim();
    }

    public String getYongtu() {
        return yongtu;
    }

    public void setYongtu(String yongtu) {
        this.yongtu = yongtu == null ? null : yongtu.trim();
    }

    public String getGongtongshoutuofang() {
        return gongtongshoutuofang;
    }

    public void setGongtongshoutuofang(String gongtongshoutuofang) {
        this.gongtongshoutuofang = gongtongshoutuofang == null ? null : gongtongshoutuofang.trim();
    }

    public Long getXintuotaiwuyue() {
        return xintuotaiwuyue;
    }

    public void setXintuotaiwuyue(Long xintuotaiwuyue) {
        this.xintuotaiwuyue = xintuotaiwuyue;
    }
}