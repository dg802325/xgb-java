package com.xgb.model;

public class JjhnjCsbaIndex {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Short ismujuan;

    private Long hulianwangmujuan1;

    private Long yidimujuan1;

    private Long mujuanzongji1;

    public JjhnjCsbaIndex(Long id, String instanceid, String organizationid, Short status, Short ismujuan, Long hulianwangmujuan1, Long yidimujuan1, Long mujuanzongji1) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.ismujuan = ismujuan;
        this.hulianwangmujuan1 = hulianwangmujuan1;
        this.yidimujuan1 = yidimujuan1;
        this.mujuanzongji1 = mujuanzongji1;
    }

    public JjhnjCsbaIndex() {
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

    public Short getIsmujuan() {
        return ismujuan;
    }

    public void setIsmujuan(Short ismujuan) {
        this.ismujuan = ismujuan;
    }

    public Long getHulianwangmujuan1() {
        return hulianwangmujuan1;
    }

    public void setHulianwangmujuan1(Long hulianwangmujuan1) {
        this.hulianwangmujuan1 = hulianwangmujuan1;
    }

    public Long getYidimujuan1() {
        return yidimujuan1;
    }

    public void setYidimujuan1(Long yidimujuan1) {
        this.yidimujuan1 = yidimujuan1;
    }

    public Long getMujuanzongji1() {
        return mujuanzongji1;
    }

    public void setMujuanzongji1(Long mujuanzongji1) {
        this.mujuanzongji1 = mujuanzongji1;
    }
}