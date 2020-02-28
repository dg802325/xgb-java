package com.xgb.model;

public class JjhnjYzhdqk {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Short alltimes;

    private Short shifouyuanzang;

    private String xianext;

    public JjhnjYzhdqk(Long id, String instanceid, String organizationid, Short status, Short alltimes, Short shifouyuanzang, String xianext) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.alltimes = alltimes;
        this.shifouyuanzang = shifouyuanzang;
        this.xianext = xianext;
    }

    public JjhnjYzhdqk() {
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

    public Short getAlltimes() {
        return alltimes;
    }

    public void setAlltimes(Short alltimes) {
        this.alltimes = alltimes;
    }

    public Short getShifouyuanzang() {
        return shifouyuanzang;
    }

    public void setShifouyuanzang(Short shifouyuanzang) {
        this.shifouyuanzang = shifouyuanzang;
    }

    public String getXianext() {
        return xianext;
    }

    public void setXianext(String xianext) {
        this.xianext = xianext == null ? null : xianext.trim();
    }
}