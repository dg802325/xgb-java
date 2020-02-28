package com.xgb.model;

public class JjhNjMl {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private String instanceSy;

    private Integer shenhecishu;

    private String jijinhuimingcheng;

    private String niandu;

    private String nianfen;

    private String shouqian;

    public JjhNjMl(Long id, String instanceid, String organizationid, Short status, String instanceSy, Integer shenhecishu, String jijinhuimingcheng, String niandu, String nianfen, String shouqian) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.instanceSy = instanceSy;
        this.shenhecishu = shenhecishu;
        this.jijinhuimingcheng = jijinhuimingcheng;
        this.niandu = niandu;
        this.nianfen = nianfen;
        this.shouqian = shouqian;
    }

    public JjhNjMl() {
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

    public String getInstanceSy() {
        return instanceSy;
    }

    public void setInstanceSy(String instanceSy) {
        this.instanceSy = instanceSy == null ? null : instanceSy.trim();
    }

    public Integer getShenhecishu() {
        return shenhecishu;
    }

    public void setShenhecishu(Integer shenhecishu) {
        this.shenhecishu = shenhecishu;
    }

    public String getJijinhuimingcheng() {
        return jijinhuimingcheng;
    }

    public void setJijinhuimingcheng(String jijinhuimingcheng) {
        this.jijinhuimingcheng = jijinhuimingcheng == null ? null : jijinhuimingcheng.trim();
    }

    public String getNiandu() {
        return niandu;
    }

    public void setNiandu(String niandu) {
        this.niandu = niandu == null ? null : niandu.trim();
    }

    public String getNianfen() {
        return nianfen;
    }

    public void setNianfen(String nianfen) {
        this.nianfen = nianfen == null ? null : nianfen.trim();
    }

    public String getShouqian() {
        return shouqian;
    }

    public void setShouqian(String shouqian) {
        this.shouqian = shouqian == null ? null : shouqian.trim();
    }
}