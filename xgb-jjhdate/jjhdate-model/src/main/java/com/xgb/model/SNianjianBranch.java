package com.xgb.model;

public class SNianjianBranch {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Integer fenzhishu;

    private Integer xinshefenzhishu;

    private Integer banlixinshefenzhishu;

    private Integer zhuxiaofenzhishu;

    private Integer banlizhuxiaofenzhishu;

    private Integer daibiaoshu;

    private Integer xinshedaibiaoshu;

    private Integer banlixinshedaibiaoshu;

    private Integer zhuxiaodaibiaoshu;

    private Integer banlizhuxiaodaibiaoshu;

    private Integer jijinshu;

    private Integer xinshejijinshu;

    private Integer banlixinshejijinshu;

    private Integer zhuxiaojijinshu;

    private Integer banlizhuxiaojijinshu;

    private Integer banshishu;

    private Integer xinshebanshishu;

    private Integer banlixinshebanshishu;

    private Integer zhuxiaobanshishu;

    private Integer banlizhuxiaobanshishu;

    private Integer shitishu;

    private Integer xinsheshitishu;

    private Integer zhuxiaoshitishu;

    private Integer banlixinsheshitishu;

    private Integer banlizhuxiaoshitishu;

    private Integer neisheshu;

    private Integer xinsheneisheshu;

    private Integer zhuxiaoneisheshu;

    public SNianjianBranch(Long id, String instanceid, String organizationid, Short status, Integer fenzhishu, Integer xinshefenzhishu, Integer banlixinshefenzhishu, Integer zhuxiaofenzhishu, Integer banlizhuxiaofenzhishu, Integer daibiaoshu, Integer xinshedaibiaoshu, Integer banlixinshedaibiaoshu, Integer zhuxiaodaibiaoshu, Integer banlizhuxiaodaibiaoshu, Integer jijinshu, Integer xinshejijinshu, Integer banlixinshejijinshu, Integer zhuxiaojijinshu, Integer banlizhuxiaojijinshu, Integer banshishu, Integer xinshebanshishu, Integer banlixinshebanshishu, Integer zhuxiaobanshishu, Integer banlizhuxiaobanshishu, Integer shitishu, Integer xinsheshitishu, Integer zhuxiaoshitishu, Integer banlixinsheshitishu, Integer banlizhuxiaoshitishu, Integer neisheshu, Integer xinsheneisheshu, Integer zhuxiaoneisheshu) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.fenzhishu = fenzhishu;
        this.xinshefenzhishu = xinshefenzhishu;
        this.banlixinshefenzhishu = banlixinshefenzhishu;
        this.zhuxiaofenzhishu = zhuxiaofenzhishu;
        this.banlizhuxiaofenzhishu = banlizhuxiaofenzhishu;
        this.daibiaoshu = daibiaoshu;
        this.xinshedaibiaoshu = xinshedaibiaoshu;
        this.banlixinshedaibiaoshu = banlixinshedaibiaoshu;
        this.zhuxiaodaibiaoshu = zhuxiaodaibiaoshu;
        this.banlizhuxiaodaibiaoshu = banlizhuxiaodaibiaoshu;
        this.jijinshu = jijinshu;
        this.xinshejijinshu = xinshejijinshu;
        this.banlixinshejijinshu = banlixinshejijinshu;
        this.zhuxiaojijinshu = zhuxiaojijinshu;
        this.banlizhuxiaojijinshu = banlizhuxiaojijinshu;
        this.banshishu = banshishu;
        this.xinshebanshishu = xinshebanshishu;
        this.banlixinshebanshishu = banlixinshebanshishu;
        this.zhuxiaobanshishu = zhuxiaobanshishu;
        this.banlizhuxiaobanshishu = banlizhuxiaobanshishu;
        this.shitishu = shitishu;
        this.xinsheshitishu = xinsheshitishu;
        this.zhuxiaoshitishu = zhuxiaoshitishu;
        this.banlixinsheshitishu = banlixinsheshitishu;
        this.banlizhuxiaoshitishu = banlizhuxiaoshitishu;
        this.neisheshu = neisheshu;
        this.xinsheneisheshu = xinsheneisheshu;
        this.zhuxiaoneisheshu = zhuxiaoneisheshu;
    }

    public SNianjianBranch() {
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

    public Integer getFenzhishu() {
        return fenzhishu;
    }

    public void setFenzhishu(Integer fenzhishu) {
        this.fenzhishu = fenzhishu;
    }

    public Integer getXinshefenzhishu() {
        return xinshefenzhishu;
    }

    public void setXinshefenzhishu(Integer xinshefenzhishu) {
        this.xinshefenzhishu = xinshefenzhishu;
    }

    public Integer getBanlixinshefenzhishu() {
        return banlixinshefenzhishu;
    }

    public void setBanlixinshefenzhishu(Integer banlixinshefenzhishu) {
        this.banlixinshefenzhishu = banlixinshefenzhishu;
    }

    public Integer getZhuxiaofenzhishu() {
        return zhuxiaofenzhishu;
    }

    public void setZhuxiaofenzhishu(Integer zhuxiaofenzhishu) {
        this.zhuxiaofenzhishu = zhuxiaofenzhishu;
    }

    public Integer getBanlizhuxiaofenzhishu() {
        return banlizhuxiaofenzhishu;
    }

    public void setBanlizhuxiaofenzhishu(Integer banlizhuxiaofenzhishu) {
        this.banlizhuxiaofenzhishu = banlizhuxiaofenzhishu;
    }

    public Integer getDaibiaoshu() {
        return daibiaoshu;
    }

    public void setDaibiaoshu(Integer daibiaoshu) {
        this.daibiaoshu = daibiaoshu;
    }

    public Integer getXinshedaibiaoshu() {
        return xinshedaibiaoshu;
    }

    public void setXinshedaibiaoshu(Integer xinshedaibiaoshu) {
        this.xinshedaibiaoshu = xinshedaibiaoshu;
    }

    public Integer getBanlixinshedaibiaoshu() {
        return banlixinshedaibiaoshu;
    }

    public void setBanlixinshedaibiaoshu(Integer banlixinshedaibiaoshu) {
        this.banlixinshedaibiaoshu = banlixinshedaibiaoshu;
    }

    public Integer getZhuxiaodaibiaoshu() {
        return zhuxiaodaibiaoshu;
    }

    public void setZhuxiaodaibiaoshu(Integer zhuxiaodaibiaoshu) {
        this.zhuxiaodaibiaoshu = zhuxiaodaibiaoshu;
    }

    public Integer getBanlizhuxiaodaibiaoshu() {
        return banlizhuxiaodaibiaoshu;
    }

    public void setBanlizhuxiaodaibiaoshu(Integer banlizhuxiaodaibiaoshu) {
        this.banlizhuxiaodaibiaoshu = banlizhuxiaodaibiaoshu;
    }

    public Integer getJijinshu() {
        return jijinshu;
    }

    public void setJijinshu(Integer jijinshu) {
        this.jijinshu = jijinshu;
    }

    public Integer getXinshejijinshu() {
        return xinshejijinshu;
    }

    public void setXinshejijinshu(Integer xinshejijinshu) {
        this.xinshejijinshu = xinshejijinshu;
    }

    public Integer getBanlixinshejijinshu() {
        return banlixinshejijinshu;
    }

    public void setBanlixinshejijinshu(Integer banlixinshejijinshu) {
        this.banlixinshejijinshu = banlixinshejijinshu;
    }

    public Integer getZhuxiaojijinshu() {
        return zhuxiaojijinshu;
    }

    public void setZhuxiaojijinshu(Integer zhuxiaojijinshu) {
        this.zhuxiaojijinshu = zhuxiaojijinshu;
    }

    public Integer getBanlizhuxiaojijinshu() {
        return banlizhuxiaojijinshu;
    }

    public void setBanlizhuxiaojijinshu(Integer banlizhuxiaojijinshu) {
        this.banlizhuxiaojijinshu = banlizhuxiaojijinshu;
    }

    public Integer getBanshishu() {
        return banshishu;
    }

    public void setBanshishu(Integer banshishu) {
        this.banshishu = banshishu;
    }

    public Integer getXinshebanshishu() {
        return xinshebanshishu;
    }

    public void setXinshebanshishu(Integer xinshebanshishu) {
        this.xinshebanshishu = xinshebanshishu;
    }

    public Integer getBanlixinshebanshishu() {
        return banlixinshebanshishu;
    }

    public void setBanlixinshebanshishu(Integer banlixinshebanshishu) {
        this.banlixinshebanshishu = banlixinshebanshishu;
    }

    public Integer getZhuxiaobanshishu() {
        return zhuxiaobanshishu;
    }

    public void setZhuxiaobanshishu(Integer zhuxiaobanshishu) {
        this.zhuxiaobanshishu = zhuxiaobanshishu;
    }

    public Integer getBanlizhuxiaobanshishu() {
        return banlizhuxiaobanshishu;
    }

    public void setBanlizhuxiaobanshishu(Integer banlizhuxiaobanshishu) {
        this.banlizhuxiaobanshishu = banlizhuxiaobanshishu;
    }

    public Integer getShitishu() {
        return shitishu;
    }

    public void setShitishu(Integer shitishu) {
        this.shitishu = shitishu;
    }

    public Integer getXinsheshitishu() {
        return xinsheshitishu;
    }

    public void setXinsheshitishu(Integer xinsheshitishu) {
        this.xinsheshitishu = xinsheshitishu;
    }

    public Integer getZhuxiaoshitishu() {
        return zhuxiaoshitishu;
    }

    public void setZhuxiaoshitishu(Integer zhuxiaoshitishu) {
        this.zhuxiaoshitishu = zhuxiaoshitishu;
    }

    public Integer getBanlixinsheshitishu() {
        return banlixinsheshitishu;
    }

    public void setBanlixinsheshitishu(Integer banlixinsheshitishu) {
        this.banlixinsheshitishu = banlixinsheshitishu;
    }

    public Integer getBanlizhuxiaoshitishu() {
        return banlizhuxiaoshitishu;
    }

    public void setBanlizhuxiaoshitishu(Integer banlizhuxiaoshitishu) {
        this.banlizhuxiaoshitishu = banlizhuxiaoshitishu;
    }

    public Integer getNeisheshu() {
        return neisheshu;
    }

    public void setNeisheshu(Integer neisheshu) {
        this.neisheshu = neisheshu;
    }

    public Integer getXinsheneisheshu() {
        return xinsheneisheshu;
    }

    public void setXinsheneisheshu(Integer xinsheneisheshu) {
        this.xinsheneisheshu = xinsheneisheshu;
    }

    public Integer getZhuxiaoneisheshu() {
        return zhuxiaoneisheshu;
    }

    public void setZhuxiaoneisheshu(Integer zhuxiaoneisheshu) {
        this.zhuxiaoneisheshu = zhuxiaoneisheshu;
    }
}