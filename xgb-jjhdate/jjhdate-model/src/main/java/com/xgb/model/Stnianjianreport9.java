package com.xgb.model;

public class Stnianjianreport9 {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private String niandu1;

    private Integer chenglijigoushu;

    private Integer chenglishouxushu;

    private String niandu2;

    private Integer zhuxiaojigoushu;

    private Integer zhuxiaoshouxushu;

    public Stnianjianreport9(Long id, String instanceid, String organizationid, Short status, String niandu1, Integer chenglijigoushu, Integer chenglishouxushu, String niandu2, Integer zhuxiaojigoushu, Integer zhuxiaoshouxushu) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.niandu1 = niandu1;
        this.chenglijigoushu = chenglijigoushu;
        this.chenglishouxushu = chenglishouxushu;
        this.niandu2 = niandu2;
        this.zhuxiaojigoushu = zhuxiaojigoushu;
        this.zhuxiaoshouxushu = zhuxiaoshouxushu;
    }

    public Stnianjianreport9() {
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

    public String getNiandu1() {
        return niandu1;
    }

    public void setNiandu1(String niandu1) {
        this.niandu1 = niandu1 == null ? null : niandu1.trim();
    }

    public Integer getChenglijigoushu() {
        return chenglijigoushu;
    }

    public void setChenglijigoushu(Integer chenglijigoushu) {
        this.chenglijigoushu = chenglijigoushu;
    }

    public Integer getChenglishouxushu() {
        return chenglishouxushu;
    }

    public void setChenglishouxushu(Integer chenglishouxushu) {
        this.chenglishouxushu = chenglishouxushu;
    }

    public String getNiandu2() {
        return niandu2;
    }

    public void setNiandu2(String niandu2) {
        this.niandu2 = niandu2 == null ? null : niandu2.trim();
    }

    public Integer getZhuxiaojigoushu() {
        return zhuxiaojigoushu;
    }

    public void setZhuxiaojigoushu(Integer zhuxiaojigoushu) {
        this.zhuxiaojigoushu = zhuxiaojigoushu;
    }

    public Integer getZhuxiaoshouxushu() {
        return zhuxiaoshouxushu;
    }

    public void setZhuxiaoshouxushu(Integer zhuxiaoshouxushu) {
        this.zhuxiaoshouxushu = zhuxiaoshouxushu;
    }
}