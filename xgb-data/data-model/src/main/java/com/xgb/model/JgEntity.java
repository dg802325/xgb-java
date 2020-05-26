package com.xgb.model;

public class JgEntity {

    private Integer contentId;
    private String name;
    private Integer modelId;
    private String fuzeren;
    private String phone;
    private String address;

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public String getFuzeren() {
        return fuzeren;
    }

    public void setFuzeren(String fuzeren) {
        this.fuzeren = fuzeren;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "JgEntity{" +
                "contentId=" + contentId +
                ", name='" + name + '\'' +
                ", modelId=" + modelId +
                ", fuzeren='" + fuzeren + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
