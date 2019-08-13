package com.xgb.model;

public class ExcelEntiy {

    private String id;
    private String industryCategory;
    private String classificationName;
    private String businessType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIndustryCategory() {
        return industryCategory;
    }

    public void setIndustryCategory(String industryCategory) {
        this.industryCategory = industryCategory;
    }

    public String getClassificationName() {
        return classificationName;
    }

    public void setClassificationName(String classificationName) {
        this.classificationName = classificationName;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    @Override
    public String toString() {
        return "ExcelEntiy{" +
                "id='" + id + '\'' +
                ", industryCategory='" + industryCategory + '\'' +
                ", classificationName='" + classificationName + '\'' +
                ", businessType='" + businessType + '\'' +
                '}';
    }
}
