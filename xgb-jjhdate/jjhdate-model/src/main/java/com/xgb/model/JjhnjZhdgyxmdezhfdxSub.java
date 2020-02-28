package com.xgb.model;

import java.math.BigDecimal;

public class JjhnjZhdgyxmdezhfdxSub {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private Long masterid;

    private String xiangmumingcheng;

    private String daezhifuduixiang;

    private BigDecimal zhifujine;

    private String bili;

    private String yongtu;

    public JjhnjZhdgyxmdezhfdxSub(Long id, String instanceid, String organizationid, Short status, Long masterid, String xiangmumingcheng, String daezhifuduixiang, BigDecimal zhifujine, String bili, String yongtu) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.masterid = masterid;
        this.xiangmumingcheng = xiangmumingcheng;
        this.daezhifuduixiang = daezhifuduixiang;
        this.zhifujine = zhifujine;
        this.bili = bili;
        this.yongtu = yongtu;
    }

    public JjhnjZhdgyxmdezhfdxSub() {
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

    public String getDaezhifuduixiang() {
        return daezhifuduixiang;
    }

    public void setDaezhifuduixiang(String daezhifuduixiang) {
        this.daezhifuduixiang = daezhifuduixiang == null ? null : daezhifuduixiang.trim();
    }

    public BigDecimal getZhifujine() {
        return zhifujine;
    }

    public void setZhifujine(BigDecimal zhifujine) {
        this.zhifujine = zhifujine;
    }

    public String getBili() {
        return bili;
    }

    public void setBili(String bili) {
        this.bili = bili == null ? null : bili.trim();
    }

    public String getYongtu() {
        return yongtu;
    }

    public void setYongtu(String yongtu) {
        this.yongtu = yongtu == null ? null : yongtu.trim();
    }
}