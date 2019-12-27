package com.xgb.model;

public class MjzzDictionary {
    private Long id;

    private Long parentid;

    private Long deptid;

    private String userid;

    private String name;

    private Integer lev;

    private String val;

    private Integer ind;

    private Short status;

    private String typename;

    private Short type;

    public MjzzDictionary(Long id, Long parentid, Long deptid, String userid, String name, Integer lev, String val, Integer ind, Short status, String typename, Short type) {
        this.id = id;
        this.parentid = parentid;
        this.deptid = deptid;
        this.userid = userid;
        this.name = name;
        this.lev = lev;
        this.val = val;
        this.ind = ind;
        this.status = status;
        this.typename = typename;
        this.type = type;
    }

    public MjzzDictionary() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    public Long getDeptid() {
        return deptid;
    }

    public void setDeptid(Long deptid) {
        this.deptid = deptid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getLev() {
        return lev;
    }

    public void setLev(Integer lev) {
        this.lev = lev;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val == null ? null : val.trim();
    }

    public Integer getInd() {
        return ind;
    }

    public void setInd(Integer ind) {
        this.ind = ind;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }
}