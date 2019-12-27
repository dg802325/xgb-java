package com.xgb.model;

import java.util.Date;

public class MfGwyjzZb {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Long masterid;

    private String xuhao;

    private String xingming;

    private Date chushengnianyue;

    private String danweizhiwu;

    private String gongzuodanwei;

    private String zaizhizhuangtai;

    private String lingchouqingkuang;

    private String pizhundanwei;

    private Date pizhunshijian;

    private String zhiwu;

    private String xingbie;

    private String shetuanzhiwu;

    public MfGwyjzZb(Long id, String instanceid, String organizationid, Short status, Long masterid, String xuhao, String xingming, Date chushengnianyue, String danweizhiwu, String gongzuodanwei, String zaizhizhuangtai, String lingchouqingkuang, String pizhundanwei, Date pizhunshijian, String zhiwu, String xingbie, String shetuanzhiwu) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.masterid = masterid;
        this.xuhao = xuhao;
        this.xingming = xingming;
        this.chushengnianyue = chushengnianyue;
        this.danweizhiwu = danweizhiwu;
        this.gongzuodanwei = gongzuodanwei;
        this.zaizhizhuangtai = zaizhizhuangtai;
        this.lingchouqingkuang = lingchouqingkuang;
        this.pizhundanwei = pizhundanwei;
        this.pizhunshijian = pizhunshijian;
        this.zhiwu = zhiwu;
        this.xingbie = xingbie;
        this.shetuanzhiwu = shetuanzhiwu;
    }

    public MfGwyjzZb() {
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

    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming == null ? null : xingming.trim();
    }

    public Date getChushengnianyue() {
        return chushengnianyue;
    }

    public void setChushengnianyue(Date chushengnianyue) {
        this.chushengnianyue = chushengnianyue;
    }

    public String getDanweizhiwu() {
        return danweizhiwu;
    }

    public void setDanweizhiwu(String danweizhiwu) {
        this.danweizhiwu = danweizhiwu == null ? null : danweizhiwu.trim();
    }

    public String getGongzuodanwei() {
        return gongzuodanwei;
    }

    public void setGongzuodanwei(String gongzuodanwei) {
        this.gongzuodanwei = gongzuodanwei == null ? null : gongzuodanwei.trim();
    }

    public String getZaizhizhuangtai() {
        return zaizhizhuangtai;
    }

    public void setZaizhizhuangtai(String zaizhizhuangtai) {
        this.zaizhizhuangtai = zaizhizhuangtai == null ? null : zaizhizhuangtai.trim();
    }

    public String getLingchouqingkuang() {
        return lingchouqingkuang;
    }

    public void setLingchouqingkuang(String lingchouqingkuang) {
        this.lingchouqingkuang = lingchouqingkuang == null ? null : lingchouqingkuang.trim();
    }

    public String getPizhundanwei() {
        return pizhundanwei;
    }

    public void setPizhundanwei(String pizhundanwei) {
        this.pizhundanwei = pizhundanwei == null ? null : pizhundanwei.trim();
    }

    public Date getPizhunshijian() {
        return pizhunshijian;
    }

    public void setPizhunshijian(Date pizhunshijian) {
        this.pizhunshijian = pizhunshijian;
    }

    public String getZhiwu() {
        return zhiwu;
    }

    public void setZhiwu(String zhiwu) {
        this.zhiwu = zhiwu == null ? null : zhiwu.trim();
    }

    public String getXingbie() {
        return xingbie;
    }

    public void setXingbie(String xingbie) {
        this.xingbie = xingbie == null ? null : xingbie.trim();
    }

    public String getShetuanzhiwu() {
        return shetuanzhiwu;
    }

    public void setShetuanzhiwu(String shetuanzhiwu) {
        this.shetuanzhiwu = shetuanzhiwu == null ? null : shetuanzhiwu.trim();
    }
}