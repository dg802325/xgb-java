package com.xgb.model;

import java.util.Date;

public class FormConsultationCase {
    private Long id;

    private String instanceid;

    private String application;

    private String catalog;

    private String orgid;

    private String orgidentity;

    private String orgname;

    private String proposer;

    private Long proposeid;

    private Long userid;

    private Long deptid;

    private Date createtime;

    private Date lastmodifytime;

    private Date starttime;

    private Date endtime;

    private Short createtype;

    private Short casetype;

    private Long region;

    private Short finished;

    private Short casestate;

    private String propertyA;

    private String propertyB;

    private String propertyC;

    private String propertyD;

    private String propertyE;

    private Short hasnewmsg;

    private Short unitType;

    private Short acceptResult;

    private Long managerorgid;

    private Short auditType;

    private Short isAllowEdit;

    private Long temp;

    private String tempA;

    private String tempB;

    public FormConsultationCase(Long id, String instanceid, String application, String catalog, String orgid, String orgidentity, String orgname, String proposer, Long proposeid, Long userid, Long deptid, Date createtime, Date lastmodifytime, Date starttime, Date endtime, Short createtype, Short casetype, Long region, Short finished, Short casestate, String propertyA, String propertyB, String propertyC, String propertyD, String propertyE, Short hasnewmsg, Short unitType, Short acceptResult, Long managerorgid, Short auditType, Short isAllowEdit, Long temp, String tempA, String tempB) {
        this.id = id;
        this.instanceid = instanceid;
        this.application = application;
        this.catalog = catalog;
        this.orgid = orgid;
        this.orgidentity = orgidentity;
        this.orgname = orgname;
        this.proposer = proposer;
        this.proposeid = proposeid;
        this.userid = userid;
        this.deptid = deptid;
        this.createtime = createtime;
        this.lastmodifytime = lastmodifytime;
        this.starttime = starttime;
        this.endtime = endtime;
        this.createtype = createtype;
        this.casetype = casetype;
        this.region = region;
        this.finished = finished;
        this.casestate = casestate;
        this.propertyA = propertyA;
        this.propertyB = propertyB;
        this.propertyC = propertyC;
        this.propertyD = propertyD;
        this.propertyE = propertyE;
        this.hasnewmsg = hasnewmsg;
        this.unitType = unitType;
        this.acceptResult = acceptResult;
        this.managerorgid = managerorgid;
        this.auditType = auditType;
        this.isAllowEdit = isAllowEdit;
        this.temp = temp;
        this.tempA = tempA;
        this.tempB = tempB;
    }

    public FormConsultationCase() {
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

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application == null ? null : application.trim();
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog == null ? null : catalog.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getOrgidentity() {
        return orgidentity;
    }

    public void setOrgidentity(String orgidentity) {
        this.orgidentity = orgidentity == null ? null : orgidentity.trim();
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname == null ? null : orgname.trim();
    }

    public String getProposer() {
        return proposer;
    }

    public void setProposer(String proposer) {
        this.proposer = proposer == null ? null : proposer.trim();
    }

    public Long getProposeid() {
        return proposeid;
    }

    public void setProposeid(Long proposeid) {
        this.proposeid = proposeid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getDeptid() {
        return deptid;
    }

    public void setDeptid(Long deptid) {
        this.deptid = deptid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLastmodifytime() {
        return lastmodifytime;
    }

    public void setLastmodifytime(Date lastmodifytime) {
        this.lastmodifytime = lastmodifytime;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Short getCreatetype() {
        return createtype;
    }

    public void setCreatetype(Short createtype) {
        this.createtype = createtype;
    }

    public Short getCasetype() {
        return casetype;
    }

    public void setCasetype(Short casetype) {
        this.casetype = casetype;
    }

    public Long getRegion() {
        return region;
    }

    public void setRegion(Long region) {
        this.region = region;
    }

    public Short getFinished() {
        return finished;
    }

    public void setFinished(Short finished) {
        this.finished = finished;
    }

    public Short getCasestate() {
        return casestate;
    }

    public void setCasestate(Short casestate) {
        this.casestate = casestate;
    }

    public String getPropertyA() {
        return propertyA;
    }

    public void setPropertyA(String propertyA) {
        this.propertyA = propertyA == null ? null : propertyA.trim();
    }

    public String getPropertyB() {
        return propertyB;
    }

    public void setPropertyB(String propertyB) {
        this.propertyB = propertyB == null ? null : propertyB.trim();
    }

    public String getPropertyC() {
        return propertyC;
    }

    public void setPropertyC(String propertyC) {
        this.propertyC = propertyC == null ? null : propertyC.trim();
    }

    public String getPropertyD() {
        return propertyD;
    }

    public void setPropertyD(String propertyD) {
        this.propertyD = propertyD == null ? null : propertyD.trim();
    }

    public String getPropertyE() {
        return propertyE;
    }

    public void setPropertyE(String propertyE) {
        this.propertyE = propertyE == null ? null : propertyE.trim();
    }

    public Short getHasnewmsg() {
        return hasnewmsg;
    }

    public void setHasnewmsg(Short hasnewmsg) {
        this.hasnewmsg = hasnewmsg;
    }

    public Short getUnitType() {
        return unitType;
    }

    public void setUnitType(Short unitType) {
        this.unitType = unitType;
    }

    public Short getAcceptResult() {
        return acceptResult;
    }

    public void setAcceptResult(Short acceptResult) {
        this.acceptResult = acceptResult;
    }

    public Long getManagerorgid() {
        return managerorgid;
    }

    public void setManagerorgid(Long managerorgid) {
        this.managerorgid = managerorgid;
    }

    public Short getAuditType() {
        return auditType;
    }

    public void setAuditType(Short auditType) {
        this.auditType = auditType;
    }

    public Short getIsAllowEdit() {
        return isAllowEdit;
    }

    public void setIsAllowEdit(Short isAllowEdit) {
        this.isAllowEdit = isAllowEdit;
    }

    public Long getTemp() {
        return temp;
    }

    public void setTemp(Long temp) {
        this.temp = temp;
    }

    public String getTempA() {
        return tempA;
    }

    public void setTempA(String tempA) {
        this.tempA = tempA == null ? null : tempA.trim();
    }

    public String getTempB() {
        return tempB;
    }

    public void setTempB(String tempB) {
        this.tempB = tempB == null ? null : tempB.trim();
    }
}