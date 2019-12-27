package com.xgb.model;

import java.math.BigDecimal;

public class JjhnjGyhdmxSub {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Long masterid;

    private String xuhao;

    private String xiangmumingcheng;

    private BigDecimal shouru;

    private BigDecimal zhichu;

    private String zi;

    private String zhi;

    private String jianshu;

    private String wuciqingkuang;

    public JjhnjGyhdmxSub(Long id, String instanceid, String organizationid, Short status, Long masterid, String xuhao, String xiangmumingcheng, BigDecimal shouru, BigDecimal zhichu, String zi, String zhi, String jianshu, String wuciqingkuang) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.masterid = masterid;
        this.xuhao = xuhao;
        this.xiangmumingcheng = xiangmumingcheng;
        this.shouru = shouru;
        this.zhichu = zhichu;
        this.zi = zi;
        this.zhi = zhi;
        this.jianshu = jianshu;
        this.wuciqingkuang = wuciqingkuang;
    }

    public JjhnjGyhdmxSub() {
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

    public String getXiangmumingcheng() {
        return xiangmumingcheng;
    }

    public void setXiangmumingcheng(String xiangmumingcheng) {
        this.xiangmumingcheng = xiangmumingcheng == null ? null : xiangmumingcheng.trim();
    }

    public BigDecimal getShouru() {
        return shouru;
    }

    public void setShouru(BigDecimal shouru) {
        this.shouru = shouru;
    }

    public BigDecimal getZhichu() {
        return zhichu;
    }

    public void setZhichu(BigDecimal zhichu) {
        this.zhichu = zhichu;
    }

    public String getZi() {
        return zi;
    }

    public void setZi(String zi) {
        this.zi = zi == null ? null : zi.trim();
    }

    public String getZhi() {
        return zhi;
    }

    public void setZhi(String zhi) {
        this.zhi = zhi == null ? null : zhi.trim();
    }

    public String getJianshu() {
        return jianshu;
    }

    public void setJianshu(String jianshu) {
        this.jianshu = jianshu == null ? null : jianshu.trim();
    }

    public String getWuciqingkuang() {
        return wuciqingkuang;
    }

    public void setWuciqingkuang(String wuciqingkuang) {
        this.wuciqingkuang = wuciqingkuang == null ? null : wuciqingkuang.trim();
    }
}