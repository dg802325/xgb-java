package com.xgb.model;

import java.math.BigDecimal;
import java.util.Date;

public class JjhNjReportGqstqkItem {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Long masterid;

    private Object mingcheng;

    private Date shelishijian;

    private Object daibiaoren;

    private String dengjileixing;

    private BigDecimal stzhucezijin;

    private BigDecimal rjzhucezijin;

    private BigDecimal jjhchuzie;

    private String chigubili;

    private String tzjjhbili;

    private Object jjhguanxi;

    private Object hesuanfangfa;

    private BigDecimal qichuyue;

    private BigDecimal benqizengjia;

    private BigDecimal benqijianshao;

    private BigDecimal qimoyue;

    private Short xuhao;

    public JjhNjReportGqstqkItem(Long id, String instanceid, String organizationid, Short status, Long masterid, Object mingcheng, Date shelishijian, Object daibiaoren, String dengjileixing, BigDecimal stzhucezijin, BigDecimal rjzhucezijin, BigDecimal jjhchuzie, String chigubili, String tzjjhbili, Object jjhguanxi, Object hesuanfangfa, BigDecimal qichuyue, BigDecimal benqizengjia, BigDecimal benqijianshao, BigDecimal qimoyue, Short xuhao) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.masterid = masterid;
        this.mingcheng = mingcheng;
        this.shelishijian = shelishijian;
        this.daibiaoren = daibiaoren;
        this.dengjileixing = dengjileixing;
        this.stzhucezijin = stzhucezijin;
        this.rjzhucezijin = rjzhucezijin;
        this.jjhchuzie = jjhchuzie;
        this.chigubili = chigubili;
        this.tzjjhbili = tzjjhbili;
        this.jjhguanxi = jjhguanxi;
        this.hesuanfangfa = hesuanfangfa;
        this.qichuyue = qichuyue;
        this.benqizengjia = benqizengjia;
        this.benqijianshao = benqijianshao;
        this.qimoyue = qimoyue;
        this.xuhao = xuhao;
    }

    public JjhNjReportGqstqkItem() {
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

    public Object getMingcheng() {
        return mingcheng;
    }

    public void setMingcheng(Object mingcheng) {
        this.mingcheng = mingcheng;
    }

    public Date getShelishijian() {
        return shelishijian;
    }

    public void setShelishijian(Date shelishijian) {
        this.shelishijian = shelishijian;
    }

    public Object getDaibiaoren() {
        return daibiaoren;
    }

    public void setDaibiaoren(Object daibiaoren) {
        this.daibiaoren = daibiaoren;
    }

    public String getDengjileixing() {
        return dengjileixing;
    }

    public void setDengjileixing(String dengjileixing) {
        this.dengjileixing = dengjileixing == null ? null : dengjileixing.trim();
    }

    public BigDecimal getStzhucezijin() {
        return stzhucezijin;
    }

    public void setStzhucezijin(BigDecimal stzhucezijin) {
        this.stzhucezijin = stzhucezijin;
    }

    public BigDecimal getRjzhucezijin() {
        return rjzhucezijin;
    }

    public void setRjzhucezijin(BigDecimal rjzhucezijin) {
        this.rjzhucezijin = rjzhucezijin;
    }

    public BigDecimal getJjhchuzie() {
        return jjhchuzie;
    }

    public void setJjhchuzie(BigDecimal jjhchuzie) {
        this.jjhchuzie = jjhchuzie;
    }

    public String getChigubili() {
        return chigubili;
    }

    public void setChigubili(String chigubili) {
        this.chigubili = chigubili == null ? null : chigubili.trim();
    }

    public String getTzjjhbili() {
        return tzjjhbili;
    }

    public void setTzjjhbili(String tzjjhbili) {
        this.tzjjhbili = tzjjhbili == null ? null : tzjjhbili.trim();
    }

    public Object getJjhguanxi() {
        return jjhguanxi;
    }

    public void setJjhguanxi(Object jjhguanxi) {
        this.jjhguanxi = jjhguanxi;
    }

    public Object getHesuanfangfa() {
        return hesuanfangfa;
    }

    public void setHesuanfangfa(Object hesuanfangfa) {
        this.hesuanfangfa = hesuanfangfa;
    }

    public BigDecimal getQichuyue() {
        return qichuyue;
    }

    public void setQichuyue(BigDecimal qichuyue) {
        this.qichuyue = qichuyue;
    }

    public BigDecimal getBenqizengjia() {
        return benqizengjia;
    }

    public void setBenqizengjia(BigDecimal benqizengjia) {
        this.benqizengjia = benqizengjia;
    }

    public BigDecimal getBenqijianshao() {
        return benqijianshao;
    }

    public void setBenqijianshao(BigDecimal benqijianshao) {
        this.benqijianshao = benqijianshao;
    }

    public BigDecimal getQimoyue() {
        return qimoyue;
    }

    public void setQimoyue(BigDecimal qimoyue) {
        this.qimoyue = qimoyue;
    }

    public Short getXuhao() {
        return xuhao;
    }

    public void setXuhao(Short xuhao) {
        this.xuhao = xuhao;
    }
}