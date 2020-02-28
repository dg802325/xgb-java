package com.xgb.model;

import java.math.BigDecimal;

public class JjhnjYewhddaejzpageSub {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Long masterid;

    private String juanzengren;

    private String bennianjuanzenge;

    private String yongtu;

    private BigDecimal juankuan;

    private String juankuanyongtu;

    private BigDecimal juanwu;

    private String juanwuyongtu;

    public JjhnjYewhddaejzpageSub(Long id, String instanceid, String organizationid, Short status, Long masterid, String juanzengren, String bennianjuanzenge, String yongtu, BigDecimal juankuan, String juankuanyongtu, BigDecimal juanwu, String juanwuyongtu) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.masterid = masterid;
        this.juanzengren = juanzengren;
        this.bennianjuanzenge = bennianjuanzenge;
        this.yongtu = yongtu;
        this.juankuan = juankuan;
        this.juankuanyongtu = juankuanyongtu;
        this.juanwu = juanwu;
        this.juanwuyongtu = juanwuyongtu;
    }

    public JjhnjYewhddaejzpageSub() {
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

    public String getJuanzengren() {
        return juanzengren;
    }

    public void setJuanzengren(String juanzengren) {
        this.juanzengren = juanzengren == null ? null : juanzengren.trim();
    }

    public String getBennianjuanzenge() {
        return bennianjuanzenge;
    }

    public void setBennianjuanzenge(String bennianjuanzenge) {
        this.bennianjuanzenge = bennianjuanzenge == null ? null : bennianjuanzenge.trim();
    }

    public String getYongtu() {
        return yongtu;
    }

    public void setYongtu(String yongtu) {
        this.yongtu = yongtu == null ? null : yongtu.trim();
    }

    public BigDecimal getJuankuan() {
        return juankuan;
    }

    public void setJuankuan(BigDecimal juankuan) {
        this.juankuan = juankuan;
    }

    public String getJuankuanyongtu() {
        return juankuanyongtu;
    }

    public void setJuankuanyongtu(String juankuanyongtu) {
        this.juankuanyongtu = juankuanyongtu == null ? null : juankuanyongtu.trim();
    }

    public BigDecimal getJuanwu() {
        return juanwu;
    }

    public void setJuanwu(BigDecimal juanwu) {
        this.juanwu = juanwu;
    }

    public String getJuanwuyongtu() {
        return juanwuyongtu;
    }

    public void setJuanwuyongtu(String juanwuyongtu) {
        this.juanwuyongtu = juanwuyongtu == null ? null : juanwuyongtu.trim();
    }
}