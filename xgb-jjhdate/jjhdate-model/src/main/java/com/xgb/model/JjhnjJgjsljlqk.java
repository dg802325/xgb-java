package com.xgb.model;

public class JjhnjJgjsljlqk {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Short alltimes;

    private Short shifoudadao;

    public JjhnjJgjsljlqk(Long id, String instanceid, String organizationid, Short status, Short alltimes, Short shifoudadao) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.alltimes = alltimes;
        this.shifoudadao = shifoudadao;
    }

    public JjhnjJgjsljlqk() {
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

    public Short getShifoudadao() {
        return shifoudadao;
    }

    public void setShifoudadao(Short shifoudadao) {
        this.shifoudadao = shifoudadao;
    }
}