package com.xgb.model;

import java.util.Date;

public class MjzzUser {
    private Long id;

    private String name;

    private String username;

    private String password;

    private String dept;

    private String idcard;

    private String address;

    private String telephone;

    private String fax;

    private String workdept;

    private String residence;

    private String email;

    private String postcode;

    private String othercontact;

    private String registered;

    private Long managerdept;

    private String organization;

    private String serialnumber;

    private Date constitutedate;

    private String corporation;

    private String corptelephone;

    private Short type;

    private Short status;

    private Long typedeptid;

    private Long manageorg;

    private String organizationId;

    private Short mfType;

    private Long region;

    private Date registedate;

    private Short area;

    private Short usertype;

    private String orgIdentity;

    private String unitType;

    private Date lastLogginginTime;

    private Long logginginCount;

    private String temp;

    private String xinyongdaima;

    public MjzzUser(Long id, String name, String username, String password, String dept, String idcard, String address, String telephone, String fax, String workdept, String residence, String email, String postcode, String othercontact, String registered, Long managerdept, String organization, String serialnumber, Date constitutedate, String corporation, String corptelephone, Short type, Short status, Long typedeptid, Long manageorg, String organizationId, Short mfType, Long region, Date registedate, Short area, Short usertype, String orgIdentity, String unitType, Date lastLogginginTime, Long logginginCount, String temp, String xinyongdaima) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.dept = dept;
        this.idcard = idcard;
        this.address = address;
        this.telephone = telephone;
        this.fax = fax;
        this.workdept = workdept;
        this.residence = residence;
        this.email = email;
        this.postcode = postcode;
        this.othercontact = othercontact;
        this.registered = registered;
        this.managerdept = managerdept;
        this.organization = organization;
        this.serialnumber = serialnumber;
        this.constitutedate = constitutedate;
        this.corporation = corporation;
        this.corptelephone = corptelephone;
        this.type = type;
        this.status = status;
        this.typedeptid = typedeptid;
        this.manageorg = manageorg;
        this.organizationId = organizationId;
        this.mfType = mfType;
        this.region = region;
        this.registedate = registedate;
        this.area = area;
        this.usertype = usertype;
        this.orgIdentity = orgIdentity;
        this.unitType = unitType;
        this.lastLogginginTime = lastLogginginTime;
        this.logginginCount = logginginCount;
        this.temp = temp;
        this.xinyongdaima = xinyongdaima;
    }

    public MjzzUser() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getWorkdept() {
        return workdept;
    }

    public void setWorkdept(String workdept) {
        this.workdept = workdept == null ? null : workdept.trim();
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence == null ? null : residence.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public String getOthercontact() {
        return othercontact;
    }

    public void setOthercontact(String othercontact) {
        this.othercontact = othercontact == null ? null : othercontact.trim();
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered == null ? null : registered.trim();
    }

    public Long getManagerdept() {
        return managerdept;
    }

    public void setManagerdept(Long managerdept) {
        this.managerdept = managerdept;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber == null ? null : serialnumber.trim();
    }

    public Date getConstitutedate() {
        return constitutedate;
    }

    public void setConstitutedate(Date constitutedate) {
        this.constitutedate = constitutedate;
    }

    public String getCorporation() {
        return corporation;
    }

    public void setCorporation(String corporation) {
        this.corporation = corporation == null ? null : corporation.trim();
    }

    public String getCorptelephone() {
        return corptelephone;
    }

    public void setCorptelephone(String corptelephone) {
        this.corptelephone = corptelephone == null ? null : corptelephone.trim();
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Long getTypedeptid() {
        return typedeptid;
    }

    public void setTypedeptid(Long typedeptid) {
        this.typedeptid = typedeptid;
    }

    public Long getManageorg() {
        return manageorg;
    }

    public void setManageorg(Long manageorg) {
        this.manageorg = manageorg;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }

    public Short getMfType() {
        return mfType;
    }

    public void setMfType(Short mfType) {
        this.mfType = mfType;
    }

    public Long getRegion() {
        return region;
    }

    public void setRegion(Long region) {
        this.region = region;
    }

    public Date getRegistedate() {
        return registedate;
    }

    public void setRegistedate(Date registedate) {
        this.registedate = registedate;
    }

    public Short getArea() {
        return area;
    }

    public void setArea(Short area) {
        this.area = area;
    }

    public Short getUsertype() {
        return usertype;
    }

    public void setUsertype(Short usertype) {
        this.usertype = usertype;
    }

    public String getOrgIdentity() {
        return orgIdentity;
    }

    public void setOrgIdentity(String orgIdentity) {
        this.orgIdentity = orgIdentity == null ? null : orgIdentity.trim();
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType == null ? null : unitType.trim();
    }

    public Date getLastLogginginTime() {
        return lastLogginginTime;
    }

    public void setLastLogginginTime(Date lastLogginginTime) {
        this.lastLogginginTime = lastLogginginTime;
    }

    public Long getLogginginCount() {
        return logginginCount;
    }

    public void setLogginginCount(Long logginginCount) {
        this.logginginCount = logginginCount;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp == null ? null : temp.trim();
    }

    public String getXinyongdaima() {
        return xinyongdaima;
    }

    public void setXinyongdaima(String xinyongdaima) {
        this.xinyongdaima = xinyongdaima == null ? null : xinyongdaima.trim();
    }
}