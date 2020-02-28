package com.xgb.model;

import java.math.BigDecimal;

public class JjhnjZhdgyhdshzSub {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Long masterid;

    private String xiangmumingcheng;

    private BigDecimal shouru;

    private BigDecimal zhijiekuanwu;

    private BigDecimal xiangmurenyuangongzi;

    private BigDecimal bangongfeiyong;

    private BigDecimal zichanshiyongfeiyong;

    private BigDecimal xuanchuanfeiyong;

    private BigDecimal chalvfei;

    private BigDecimal qitafeiyong;

    private BigDecimal xiaoji;

    private BigDecimal zongji;

    public JjhnjZhdgyhdshzSub(Long id, String instanceid, String organizationid, Short status, Long masterid, String xiangmumingcheng, BigDecimal shouru, BigDecimal zhijiekuanwu, BigDecimal xiangmurenyuangongzi, BigDecimal bangongfeiyong, BigDecimal zichanshiyongfeiyong, BigDecimal xuanchuanfeiyong, BigDecimal chalvfei, BigDecimal qitafeiyong, BigDecimal xiaoji, BigDecimal zongji) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.masterid = masterid;
        this.xiangmumingcheng = xiangmumingcheng;
        this.shouru = shouru;
        this.zhijiekuanwu = zhijiekuanwu;
        this.xiangmurenyuangongzi = xiangmurenyuangongzi;
        this.bangongfeiyong = bangongfeiyong;
        this.zichanshiyongfeiyong = zichanshiyongfeiyong;
        this.xuanchuanfeiyong = xuanchuanfeiyong;
        this.chalvfei = chalvfei;
        this.qitafeiyong = qitafeiyong;
        this.xiaoji = xiaoji;
        this.zongji = zongji;
    }

    public JjhnjZhdgyhdshzSub() {
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

    public BigDecimal getZhijiekuanwu() {
        return zhijiekuanwu;
    }

    public void setZhijiekuanwu(BigDecimal zhijiekuanwu) {
        this.zhijiekuanwu = zhijiekuanwu;
    }

    public BigDecimal getXiangmurenyuangongzi() {
        return xiangmurenyuangongzi;
    }

    public void setXiangmurenyuangongzi(BigDecimal xiangmurenyuangongzi) {
        this.xiangmurenyuangongzi = xiangmurenyuangongzi;
    }

    public BigDecimal getBangongfeiyong() {
        return bangongfeiyong;
    }

    public void setBangongfeiyong(BigDecimal bangongfeiyong) {
        this.bangongfeiyong = bangongfeiyong;
    }

    public BigDecimal getZichanshiyongfeiyong() {
        return zichanshiyongfeiyong;
    }

    public void setZichanshiyongfeiyong(BigDecimal zichanshiyongfeiyong) {
        this.zichanshiyongfeiyong = zichanshiyongfeiyong;
    }

    public BigDecimal getXuanchuanfeiyong() {
        return xuanchuanfeiyong;
    }

    public void setXuanchuanfeiyong(BigDecimal xuanchuanfeiyong) {
        this.xuanchuanfeiyong = xuanchuanfeiyong;
    }

    public BigDecimal getChalvfei() {
        return chalvfei;
    }

    public void setChalvfei(BigDecimal chalvfei) {
        this.chalvfei = chalvfei;
    }

    public BigDecimal getQitafeiyong() {
        return qitafeiyong;
    }

    public void setQitafeiyong(BigDecimal qitafeiyong) {
        this.qitafeiyong = qitafeiyong;
    }

    public BigDecimal getXiaoji() {
        return xiaoji;
    }

    public void setXiaoji(BigDecimal xiaoji) {
        this.xiaoji = xiaoji;
    }

    public BigDecimal getZongji() {
        return zongji;
    }

    public void setZongji(BigDecimal zongji) {
        this.zongji = zongji;
    }
}