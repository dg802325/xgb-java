package com.xgb.model;

public class SjzdNode {
    private Integer id;

    private Integer parentid;

    private String nodeName;

    private String nodeTypename;

    private Integer nodeLevel;

    private String nodeValue;

    private Integer nodeIndex;

    private Long institutionid;

    private Short state;

    public SjzdNode(Integer id, Integer parentid, String nodeName, String nodeTypename, Integer nodeLevel, String nodeValue, Integer nodeIndex, Long institutionid, Short state) {
        this.id = id;
        this.parentid = parentid;
        this.nodeName = nodeName;
        this.nodeTypename = nodeTypename;
        this.nodeLevel = nodeLevel;
        this.nodeValue = nodeValue;
        this.nodeIndex = nodeIndex;
        this.institutionid = institutionid;
        this.state = state;
    }

    public SjzdNode() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName == null ? null : nodeName.trim();
    }

    public String getNodeTypename() {
        return nodeTypename;
    }

    public void setNodeTypename(String nodeTypename) {
        this.nodeTypename = nodeTypename == null ? null : nodeTypename.trim();
    }

    public Integer getNodeLevel() {
        return nodeLevel;
    }

    public void setNodeLevel(Integer nodeLevel) {
        this.nodeLevel = nodeLevel;
    }

    public String getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(String nodeValue) {
        this.nodeValue = nodeValue == null ? null : nodeValue.trim();
    }

    public Integer getNodeIndex() {
        return nodeIndex;
    }

    public void setNodeIndex(Integer nodeIndex) {
        this.nodeIndex = nodeIndex;
    }

    public Long getInstitutionid() {
        return institutionid;
    }

    public void setInstitutionid(Long institutionid) {
        this.institutionid = institutionid;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }
}