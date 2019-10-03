package com.xgb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HlbCompanyAuthenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HlbCompanyAuthenExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("COMPANY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("COMPANY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("COMPANY_NAME =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("COMPANY_NAME <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("COMPANY_NAME >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("COMPANY_NAME <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("COMPANY_NAME like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("COMPANY_NAME not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("COMPANY_NAME in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("COMPANY_NAME not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andShowNameIsNull() {
            addCriterion("SHOW_NAME is null");
            return (Criteria) this;
        }

        public Criteria andShowNameIsNotNull() {
            addCriterion("SHOW_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andShowNameEqualTo(String value) {
            addCriterion("SHOW_NAME =", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameNotEqualTo(String value) {
            addCriterion("SHOW_NAME <>", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameGreaterThan(String value) {
            addCriterion("SHOW_NAME >", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameGreaterThanOrEqualTo(String value) {
            addCriterion("SHOW_NAME >=", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameLessThan(String value) {
            addCriterion("SHOW_NAME <", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameLessThanOrEqualTo(String value) {
            addCriterion("SHOW_NAME <=", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameLike(String value) {
            addCriterion("SHOW_NAME like", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameNotLike(String value) {
            addCriterion("SHOW_NAME not like", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameIn(List<String> values) {
            addCriterion("SHOW_NAME in", values, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameNotIn(List<String> values) {
            addCriterion("SHOW_NAME not in", values, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameBetween(String value1, String value2) {
            addCriterion("SHOW_NAME between", value1, value2, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameNotBetween(String value1, String value2) {
            addCriterion("SHOW_NAME not between", value1, value2, "showName");
            return (Criteria) this;
        }

        public Criteria andWebSiteIsNull() {
            addCriterion("WEB_SITE is null");
            return (Criteria) this;
        }

        public Criteria andWebSiteIsNotNull() {
            addCriterion("WEB_SITE is not null");
            return (Criteria) this;
        }

        public Criteria andWebSiteEqualTo(String value) {
            addCriterion("WEB_SITE =", value, "webSite");
            return (Criteria) this;
        }

        public Criteria andWebSiteNotEqualTo(String value) {
            addCriterion("WEB_SITE <>", value, "webSite");
            return (Criteria) this;
        }

        public Criteria andWebSiteGreaterThan(String value) {
            addCriterion("WEB_SITE >", value, "webSite");
            return (Criteria) this;
        }

        public Criteria andWebSiteGreaterThanOrEqualTo(String value) {
            addCriterion("WEB_SITE >=", value, "webSite");
            return (Criteria) this;
        }

        public Criteria andWebSiteLessThan(String value) {
            addCriterion("WEB_SITE <", value, "webSite");
            return (Criteria) this;
        }

        public Criteria andWebSiteLessThanOrEqualTo(String value) {
            addCriterion("WEB_SITE <=", value, "webSite");
            return (Criteria) this;
        }

        public Criteria andWebSiteLike(String value) {
            addCriterion("WEB_SITE like", value, "webSite");
            return (Criteria) this;
        }

        public Criteria andWebSiteNotLike(String value) {
            addCriterion("WEB_SITE not like", value, "webSite");
            return (Criteria) this;
        }

        public Criteria andWebSiteIn(List<String> values) {
            addCriterion("WEB_SITE in", values, "webSite");
            return (Criteria) this;
        }

        public Criteria andWebSiteNotIn(List<String> values) {
            addCriterion("WEB_SITE not in", values, "webSite");
            return (Criteria) this;
        }

        public Criteria andWebSiteBetween(String value1, String value2) {
            addCriterion("WEB_SITE between", value1, value2, "webSite");
            return (Criteria) this;
        }

        public Criteria andWebSiteNotBetween(String value1, String value2) {
            addCriterion("WEB_SITE not between", value1, value2, "webSite");
            return (Criteria) this;
        }

        public Criteria andAccessUrlIsNull() {
            addCriterion("ACCESS_URL is null");
            return (Criteria) this;
        }

        public Criteria andAccessUrlIsNotNull() {
            addCriterion("ACCESS_URL is not null");
            return (Criteria) this;
        }

        public Criteria andAccessUrlEqualTo(String value) {
            addCriterion("ACCESS_URL =", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlNotEqualTo(String value) {
            addCriterion("ACCESS_URL <>", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlGreaterThan(String value) {
            addCriterion("ACCESS_URL >", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESS_URL >=", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlLessThan(String value) {
            addCriterion("ACCESS_URL <", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlLessThanOrEqualTo(String value) {
            addCriterion("ACCESS_URL <=", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlLike(String value) {
            addCriterion("ACCESS_URL like", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlNotLike(String value) {
            addCriterion("ACCESS_URL not like", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlIn(List<String> values) {
            addCriterion("ACCESS_URL in", values, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlNotIn(List<String> values) {
            addCriterion("ACCESS_URL not in", values, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlBetween(String value1, String value2) {
            addCriterion("ACCESS_URL between", value1, value2, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlNotBetween(String value1, String value2) {
            addCriterion("ACCESS_URL not between", value1, value2, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeIsNull() {
            addCriterion("MERCHANT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeIsNotNull() {
            addCriterion("MERCHANT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeEqualTo(String value) {
            addCriterion("MERCHANT_TYPE =", value, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeNotEqualTo(String value) {
            addCriterion("MERCHANT_TYPE <>", value, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeGreaterThan(String value) {
            addCriterion("MERCHANT_TYPE >", value, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANT_TYPE >=", value, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeLessThan(String value) {
            addCriterion("MERCHANT_TYPE <", value, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeLessThanOrEqualTo(String value) {
            addCriterion("MERCHANT_TYPE <=", value, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeLike(String value) {
            addCriterion("MERCHANT_TYPE like", value, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeNotLike(String value) {
            addCriterion("MERCHANT_TYPE not like", value, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeIn(List<String> values) {
            addCriterion("MERCHANT_TYPE in", values, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeNotIn(List<String> values) {
            addCriterion("MERCHANT_TYPE not in", values, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeBetween(String value1, String value2) {
            addCriterion("MERCHANT_TYPE between", value1, value2, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeNotBetween(String value1, String value2) {
            addCriterion("MERCHANT_TYPE not between", value1, value2, "merchantType");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNull() {
            addCriterion("LEGAL_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNotNull() {
            addCriterion("LEGAL_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonEqualTo(String value) {
            addCriterion("LEGAL_PERSON =", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotEqualTo(String value) {
            addCriterion("LEGAL_PERSON <>", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThan(String value) {
            addCriterion("LEGAL_PERSON >", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSON >=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThan(String value) {
            addCriterion("LEGAL_PERSON <", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSON <=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLike(String value) {
            addCriterion("LEGAL_PERSON like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotLike(String value) {
            addCriterion("LEGAL_PERSON not like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIn(List<String> values) {
            addCriterion("LEGAL_PERSON in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotIn(List<String> values) {
            addCriterion("LEGAL_PERSON not in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSON between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSON not between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdIsNull() {
            addCriterion("LEGAL_PERSON_ID is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdIsNotNull() {
            addCriterion("LEGAL_PERSON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdEqualTo(String value) {
            addCriterion("LEGAL_PERSON_ID =", value, "legalPersonId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdNotEqualTo(String value) {
            addCriterion("LEGAL_PERSON_ID <>", value, "legalPersonId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdGreaterThan(String value) {
            addCriterion("LEGAL_PERSON_ID >", value, "legalPersonId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSON_ID >=", value, "legalPersonId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdLessThan(String value) {
            addCriterion("LEGAL_PERSON_ID <", value, "legalPersonId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSON_ID <=", value, "legalPersonId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdLike(String value) {
            addCriterion("LEGAL_PERSON_ID like", value, "legalPersonId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdNotLike(String value) {
            addCriterion("LEGAL_PERSON_ID not like", value, "legalPersonId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdIn(List<String> values) {
            addCriterion("LEGAL_PERSON_ID in", values, "legalPersonId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdNotIn(List<String> values) {
            addCriterion("LEGAL_PERSON_ID not in", values, "legalPersonId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSON_ID between", value1, value2, "legalPersonId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdNotBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSON_ID not between", value1, value2, "legalPersonId");
            return (Criteria) this;
        }

        public Criteria andOrgNumIsNull() {
            addCriterion("ORG_NUM is null");
            return (Criteria) this;
        }

        public Criteria andOrgNumIsNotNull() {
            addCriterion("ORG_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNumEqualTo(String value) {
            addCriterion("ORG_NUM =", value, "orgNum");
            return (Criteria) this;
        }

        public Criteria andOrgNumNotEqualTo(String value) {
            addCriterion("ORG_NUM <>", value, "orgNum");
            return (Criteria) this;
        }

        public Criteria andOrgNumGreaterThan(String value) {
            addCriterion("ORG_NUM >", value, "orgNum");
            return (Criteria) this;
        }

        public Criteria andOrgNumGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_NUM >=", value, "orgNum");
            return (Criteria) this;
        }

        public Criteria andOrgNumLessThan(String value) {
            addCriterion("ORG_NUM <", value, "orgNum");
            return (Criteria) this;
        }

        public Criteria andOrgNumLessThanOrEqualTo(String value) {
            addCriterion("ORG_NUM <=", value, "orgNum");
            return (Criteria) this;
        }

        public Criteria andOrgNumLike(String value) {
            addCriterion("ORG_NUM like", value, "orgNum");
            return (Criteria) this;
        }

        public Criteria andOrgNumNotLike(String value) {
            addCriterion("ORG_NUM not like", value, "orgNum");
            return (Criteria) this;
        }

        public Criteria andOrgNumIn(List<String> values) {
            addCriterion("ORG_NUM in", values, "orgNum");
            return (Criteria) this;
        }

        public Criteria andOrgNumNotIn(List<String> values) {
            addCriterion("ORG_NUM not in", values, "orgNum");
            return (Criteria) this;
        }

        public Criteria andOrgNumBetween(String value1, String value2) {
            addCriterion("ORG_NUM between", value1, value2, "orgNum");
            return (Criteria) this;
        }

        public Criteria andOrgNumNotBetween(String value1, String value2) {
            addCriterion("ORG_NUM not between", value1, value2, "orgNum");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIsNull() {
            addCriterion("BUSINESS_LICENSE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIsNotNull() {
            addCriterion("BUSINESS_LICENSE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE =", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE <>", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseGreaterThan(String value) {
            addCriterion("BUSINESS_LICENSE >", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE >=", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLessThan(String value) {
            addCriterion("BUSINESS_LICENSE <", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE <=", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLike(String value) {
            addCriterion("BUSINESS_LICENSE like", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotLike(String value) {
            addCriterion("BUSINESS_LICENSE not like", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIn(List<String> values) {
            addCriterion("BUSINESS_LICENSE in", values, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotIn(List<String> values) {
            addCriterion("BUSINESS_LICENSE not in", values, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseBetween(String value1, String value2) {
            addCriterion("BUSINESS_LICENSE between", value1, value2, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_LICENSE not between", value1, value2, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNull() {
            addCriterion("PROVINCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("PROVINCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(String value) {
            addCriterion("PROVINCE_ID =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(String value) {
            addCriterion("PROVINCE_ID <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(String value) {
            addCriterion("PROVINCE_ID >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE_ID >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(String value) {
            addCriterion("PROVINCE_ID <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE_ID <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLike(String value) {
            addCriterion("PROVINCE_ID like", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotLike(String value) {
            addCriterion("PROVINCE_ID not like", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<String> values) {
            addCriterion("PROVINCE_ID in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<String> values) {
            addCriterion("PROVINCE_ID not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(String value1, String value2) {
            addCriterion("PROVINCE_ID between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(String value1, String value2) {
            addCriterion("PROVINCE_ID not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("CITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("CITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(String value) {
            addCriterion("CITY_ID =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(String value) {
            addCriterion("CITY_ID <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(String value) {
            addCriterion("CITY_ID >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_ID >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(String value) {
            addCriterion("CITY_ID <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(String value) {
            addCriterion("CITY_ID <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLike(String value) {
            addCriterion("CITY_ID like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotLike(String value) {
            addCriterion("CITY_ID not like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<String> values) {
            addCriterion("CITY_ID in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<String> values) {
            addCriterion("CITY_ID not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(String value1, String value2) {
            addCriterion("CITY_ID between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(String value1, String value2) {
            addCriterion("CITY_ID not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(String value) {
            addCriterion("AREA_ID =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(String value) {
            addCriterion("AREA_ID <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(String value) {
            addCriterion("AREA_ID >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_ID >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(String value) {
            addCriterion("AREA_ID <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(String value) {
            addCriterion("AREA_ID <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLike(String value) {
            addCriterion("AREA_ID like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotLike(String value) {
            addCriterion("AREA_ID not like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<String> values) {
            addCriterion("AREA_ID in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<String> values) {
            addCriterion("AREA_ID not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(String value1, String value2) {
            addCriterion("AREA_ID between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(String value1, String value2) {
            addCriterion("AREA_ID not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIsNull() {
            addCriterion("REGION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIsNotNull() {
            addCriterion("REGION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRegionCodeEqualTo(String value) {
            addCriterion("REGION_CODE =", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotEqualTo(String value) {
            addCriterion("REGION_CODE <>", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThan(String value) {
            addCriterion("REGION_CODE >", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("REGION_CODE >=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThan(String value) {
            addCriterion("REGION_CODE <", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThanOrEqualTo(String value) {
            addCriterion("REGION_CODE <=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLike(String value) {
            addCriterion("REGION_CODE like", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotLike(String value) {
            addCriterion("REGION_CODE not like", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIn(List<String> values) {
            addCriterion("REGION_CODE in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotIn(List<String> values) {
            addCriterion("REGION_CODE not in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeBetween(String value1, String value2) {
            addCriterion("REGION_CODE between", value1, value2, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotBetween(String value1, String value2) {
            addCriterion("REGION_CODE not between", value1, value2, "regionCode");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNull() {
            addCriterion("LINKMAN is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("LINKMAN is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("LINKMAN =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("LINKMAN <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("LINKMAN >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("LINKMAN >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("LINKMAN <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("LINKMAN <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("LINKMAN like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("LINKMAN not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("LINKMAN in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("LINKMAN not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("LINKMAN between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("LINKMAN not between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneIsNull() {
            addCriterion("LINK_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneIsNotNull() {
            addCriterion("LINK_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneEqualTo(String value) {
            addCriterion("LINK_PHONE =", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotEqualTo(String value) {
            addCriterion("LINK_PHONE <>", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneGreaterThan(String value) {
            addCriterion("LINK_PHONE >", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("LINK_PHONE >=", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneLessThan(String value) {
            addCriterion("LINK_PHONE <", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneLessThanOrEqualTo(String value) {
            addCriterion("LINK_PHONE <=", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneLike(String value) {
            addCriterion("LINK_PHONE like", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotLike(String value) {
            addCriterion("LINK_PHONE not like", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneIn(List<String> values) {
            addCriterion("LINK_PHONE in", values, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotIn(List<String> values) {
            addCriterion("LINK_PHONE not in", values, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneBetween(String value1, String value2) {
            addCriterion("LINK_PHONE between", value1, value2, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotBetween(String value1, String value2) {
            addCriterion("LINK_PHONE not between", value1, value2, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andBindMobileIsNull() {
            addCriterion("BIND_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andBindMobileIsNotNull() {
            addCriterion("BIND_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andBindMobileEqualTo(String value) {
            addCriterion("BIND_MOBILE =", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileNotEqualTo(String value) {
            addCriterion("BIND_MOBILE <>", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileGreaterThan(String value) {
            addCriterion("BIND_MOBILE >", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileGreaterThanOrEqualTo(String value) {
            addCriterion("BIND_MOBILE >=", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileLessThan(String value) {
            addCriterion("BIND_MOBILE <", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileLessThanOrEqualTo(String value) {
            addCriterion("BIND_MOBILE <=", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileLike(String value) {
            addCriterion("BIND_MOBILE like", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileNotLike(String value) {
            addCriterion("BIND_MOBILE not like", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileIn(List<String> values) {
            addCriterion("BIND_MOBILE in", values, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileNotIn(List<String> values) {
            addCriterion("BIND_MOBILE not in", values, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileBetween(String value1, String value2) {
            addCriterion("BIND_MOBILE between", value1, value2, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileNotBetween(String value1, String value2) {
            addCriterion("BIND_MOBILE not between", value1, value2, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andServicePhoneIsNull() {
            addCriterion("SERVICE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andServicePhoneIsNotNull() {
            addCriterion("SERVICE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andServicePhoneEqualTo(String value) {
            addCriterion("SERVICE_PHONE =", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotEqualTo(String value) {
            addCriterion("SERVICE_PHONE <>", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneGreaterThan(String value) {
            addCriterion("SERVICE_PHONE >", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_PHONE >=", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneLessThan(String value) {
            addCriterion("SERVICE_PHONE <", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_PHONE <=", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneLike(String value) {
            addCriterion("SERVICE_PHONE like", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotLike(String value) {
            addCriterion("SERVICE_PHONE not like", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneIn(List<String> values) {
            addCriterion("SERVICE_PHONE in", values, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotIn(List<String> values) {
            addCriterion("SERVICE_PHONE not in", values, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneBetween(String value1, String value2) {
            addCriterion("SERVICE_PHONE between", value1, value2, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotBetween(String value1, String value2) {
            addCriterion("SERVICE_PHONE not between", value1, value2, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNull() {
            addCriterion("BANK_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNotNull() {
            addCriterion("BANK_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBankCodeEqualTo(String value) {
            addCriterion("BANK_CODE =", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotEqualTo(String value) {
            addCriterion("BANK_CODE <>", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThan(String value) {
            addCriterion("BANK_CODE >", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_CODE >=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThan(String value) {
            addCriterion("BANK_CODE <", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThanOrEqualTo(String value) {
            addCriterion("BANK_CODE <=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLike(String value) {
            addCriterion("BANK_CODE like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotLike(String value) {
            addCriterion("BANK_CODE not like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeIn(List<String> values) {
            addCriterion("BANK_CODE in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotIn(List<String> values) {
            addCriterion("BANK_CODE not in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeBetween(String value1, String value2) {
            addCriterion("BANK_CODE between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotBetween(String value1, String value2) {
            addCriterion("BANK_CODE not between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("ACCOUNT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("ACCOUNT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("ACCOUNT_NAME =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("ACCOUNT_NAME <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("ACCOUNT_NAME >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_NAME >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("ACCOUNT_NAME <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_NAME <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("ACCOUNT_NAME like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("ACCOUNT_NAME not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("ACCOUNT_NAME in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("ACCOUNT_NAME not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("ACCOUNT_NAME between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_NAME not between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNoIsNull() {
            addCriterion("ACCOUNT_NO is null");
            return (Criteria) this;
        }

        public Criteria andAccountNoIsNotNull() {
            addCriterion("ACCOUNT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNoEqualTo(String value) {
            addCriterion("ACCOUNT_NO =", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotEqualTo(String value) {
            addCriterion("ACCOUNT_NO <>", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoGreaterThan(String value) {
            addCriterion("ACCOUNT_NO >", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_NO >=", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLessThan(String value) {
            addCriterion("ACCOUNT_NO <", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_NO <=", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLike(String value) {
            addCriterion("ACCOUNT_NO like", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotLike(String value) {
            addCriterion("ACCOUNT_NO not like", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoIn(List<String> values) {
            addCriterion("ACCOUNT_NO in", values, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotIn(List<String> values) {
            addCriterion("ACCOUNT_NO not in", values, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoBetween(String value1, String value2) {
            addCriterion("ACCOUNT_NO between", value1, value2, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_NO not between", value1, value2, "accountNo");
            return (Criteria) this;
        }

        public Criteria andSettleBankTypeIsNull() {
            addCriterion("SETTLE_BANK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSettleBankTypeIsNotNull() {
            addCriterion("SETTLE_BANK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSettleBankTypeEqualTo(String value) {
            addCriterion("SETTLE_BANK_TYPE =", value, "settleBankType");
            return (Criteria) this;
        }

        public Criteria andSettleBankTypeNotEqualTo(String value) {
            addCriterion("SETTLE_BANK_TYPE <>", value, "settleBankType");
            return (Criteria) this;
        }

        public Criteria andSettleBankTypeGreaterThan(String value) {
            addCriterion("SETTLE_BANK_TYPE >", value, "settleBankType");
            return (Criteria) this;
        }

        public Criteria andSettleBankTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLE_BANK_TYPE >=", value, "settleBankType");
            return (Criteria) this;
        }

        public Criteria andSettleBankTypeLessThan(String value) {
            addCriterion("SETTLE_BANK_TYPE <", value, "settleBankType");
            return (Criteria) this;
        }

        public Criteria andSettleBankTypeLessThanOrEqualTo(String value) {
            addCriterion("SETTLE_BANK_TYPE <=", value, "settleBankType");
            return (Criteria) this;
        }

        public Criteria andSettleBankTypeLike(String value) {
            addCriterion("SETTLE_BANK_TYPE like", value, "settleBankType");
            return (Criteria) this;
        }

        public Criteria andSettleBankTypeNotLike(String value) {
            addCriterion("SETTLE_BANK_TYPE not like", value, "settleBankType");
            return (Criteria) this;
        }

        public Criteria andSettleBankTypeIn(List<String> values) {
            addCriterion("SETTLE_BANK_TYPE in", values, "settleBankType");
            return (Criteria) this;
        }

        public Criteria andSettleBankTypeNotIn(List<String> values) {
            addCriterion("SETTLE_BANK_TYPE not in", values, "settleBankType");
            return (Criteria) this;
        }

        public Criteria andSettleBankTypeBetween(String value1, String value2) {
            addCriterion("SETTLE_BANK_TYPE between", value1, value2, "settleBankType");
            return (Criteria) this;
        }

        public Criteria andSettleBankTypeNotBetween(String value1, String value2) {
            addCriterion("SETTLE_BANK_TYPE not between", value1, value2, "settleBankType");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodIsNull() {
            addCriterion("SETTLEMENT_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodIsNotNull() {
            addCriterion("SETTLEMENT_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodEqualTo(String value) {
            addCriterion("SETTLEMENT_PERIOD =", value, "settlementPeriod");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodNotEqualTo(String value) {
            addCriterion("SETTLEMENT_PERIOD <>", value, "settlementPeriod");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodGreaterThan(String value) {
            addCriterion("SETTLEMENT_PERIOD >", value, "settlementPeriod");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_PERIOD >=", value, "settlementPeriod");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodLessThan(String value) {
            addCriterion("SETTLEMENT_PERIOD <", value, "settlementPeriod");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodLessThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_PERIOD <=", value, "settlementPeriod");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodLike(String value) {
            addCriterion("SETTLEMENT_PERIOD like", value, "settlementPeriod");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodNotLike(String value) {
            addCriterion("SETTLEMENT_PERIOD not like", value, "settlementPeriod");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodIn(List<String> values) {
            addCriterion("SETTLEMENT_PERIOD in", values, "settlementPeriod");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodNotIn(List<String> values) {
            addCriterion("SETTLEMENT_PERIOD not in", values, "settlementPeriod");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_PERIOD between", value1, value2, "settlementPeriod");
            return (Criteria) this;
        }

        public Criteria andSettlementPeriodNotBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_PERIOD not between", value1, value2, "settlementPeriod");
            return (Criteria) this;
        }

        public Criteria andSettlementModeIsNull() {
            addCriterion("SETTLEMENT_MODE is null");
            return (Criteria) this;
        }

        public Criteria andSettlementModeIsNotNull() {
            addCriterion("SETTLEMENT_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementModeEqualTo(String value) {
            addCriterion("SETTLEMENT_MODE =", value, "settlementMode");
            return (Criteria) this;
        }

        public Criteria andSettlementModeNotEqualTo(String value) {
            addCriterion("SETTLEMENT_MODE <>", value, "settlementMode");
            return (Criteria) this;
        }

        public Criteria andSettlementModeGreaterThan(String value) {
            addCriterion("SETTLEMENT_MODE >", value, "settlementMode");
            return (Criteria) this;
        }

        public Criteria andSettlementModeGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_MODE >=", value, "settlementMode");
            return (Criteria) this;
        }

        public Criteria andSettlementModeLessThan(String value) {
            addCriterion("SETTLEMENT_MODE <", value, "settlementMode");
            return (Criteria) this;
        }

        public Criteria andSettlementModeLessThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_MODE <=", value, "settlementMode");
            return (Criteria) this;
        }

        public Criteria andSettlementModeLike(String value) {
            addCriterion("SETTLEMENT_MODE like", value, "settlementMode");
            return (Criteria) this;
        }

        public Criteria andSettlementModeNotLike(String value) {
            addCriterion("SETTLEMENT_MODE not like", value, "settlementMode");
            return (Criteria) this;
        }

        public Criteria andSettlementModeIn(List<String> values) {
            addCriterion("SETTLEMENT_MODE in", values, "settlementMode");
            return (Criteria) this;
        }

        public Criteria andSettlementModeNotIn(List<String> values) {
            addCriterion("SETTLEMENT_MODE not in", values, "settlementMode");
            return (Criteria) this;
        }

        public Criteria andSettlementModeBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_MODE between", value1, value2, "settlementMode");
            return (Criteria) this;
        }

        public Criteria andSettlementModeNotBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_MODE not between", value1, value2, "settlementMode");
            return (Criteria) this;
        }

        public Criteria andSettlementRemarkIsNull() {
            addCriterion("SETTLEMENT_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andSettlementRemarkIsNotNull() {
            addCriterion("SETTLEMENT_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementRemarkEqualTo(String value) {
            addCriterion("SETTLEMENT_REMARK =", value, "settlementRemark");
            return (Criteria) this;
        }

        public Criteria andSettlementRemarkNotEqualTo(String value) {
            addCriterion("SETTLEMENT_REMARK <>", value, "settlementRemark");
            return (Criteria) this;
        }

        public Criteria andSettlementRemarkGreaterThan(String value) {
            addCriterion("SETTLEMENT_REMARK >", value, "settlementRemark");
            return (Criteria) this;
        }

        public Criteria andSettlementRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_REMARK >=", value, "settlementRemark");
            return (Criteria) this;
        }

        public Criteria andSettlementRemarkLessThan(String value) {
            addCriterion("SETTLEMENT_REMARK <", value, "settlementRemark");
            return (Criteria) this;
        }

        public Criteria andSettlementRemarkLessThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_REMARK <=", value, "settlementRemark");
            return (Criteria) this;
        }

        public Criteria andSettlementRemarkLike(String value) {
            addCriterion("SETTLEMENT_REMARK like", value, "settlementRemark");
            return (Criteria) this;
        }

        public Criteria andSettlementRemarkNotLike(String value) {
            addCriterion("SETTLEMENT_REMARK not like", value, "settlementRemark");
            return (Criteria) this;
        }

        public Criteria andSettlementRemarkIn(List<String> values) {
            addCriterion("SETTLEMENT_REMARK in", values, "settlementRemark");
            return (Criteria) this;
        }

        public Criteria andSettlementRemarkNotIn(List<String> values) {
            addCriterion("SETTLEMENT_REMARK not in", values, "settlementRemark");
            return (Criteria) this;
        }

        public Criteria andSettlementRemarkBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_REMARK between", value1, value2, "settlementRemark");
            return (Criteria) this;
        }

        public Criteria andSettlementRemarkNotBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_REMARK not between", value1, value2, "settlementRemark");
            return (Criteria) this;
        }

        public Criteria andMerchantCategoryIsNull() {
            addCriterion("MERCHANT_CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andMerchantCategoryIsNotNull() {
            addCriterion("MERCHANT_CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantCategoryEqualTo(String value) {
            addCriterion("MERCHANT_CATEGORY =", value, "merchantCategory");
            return (Criteria) this;
        }

        public Criteria andMerchantCategoryNotEqualTo(String value) {
            addCriterion("MERCHANT_CATEGORY <>", value, "merchantCategory");
            return (Criteria) this;
        }

        public Criteria andMerchantCategoryGreaterThan(String value) {
            addCriterion("MERCHANT_CATEGORY >", value, "merchantCategory");
            return (Criteria) this;
        }

        public Criteria andMerchantCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANT_CATEGORY >=", value, "merchantCategory");
            return (Criteria) this;
        }

        public Criteria andMerchantCategoryLessThan(String value) {
            addCriterion("MERCHANT_CATEGORY <", value, "merchantCategory");
            return (Criteria) this;
        }

        public Criteria andMerchantCategoryLessThanOrEqualTo(String value) {
            addCriterion("MERCHANT_CATEGORY <=", value, "merchantCategory");
            return (Criteria) this;
        }

        public Criteria andMerchantCategoryLike(String value) {
            addCriterion("MERCHANT_CATEGORY like", value, "merchantCategory");
            return (Criteria) this;
        }

        public Criteria andMerchantCategoryNotLike(String value) {
            addCriterion("MERCHANT_CATEGORY not like", value, "merchantCategory");
            return (Criteria) this;
        }

        public Criteria andMerchantCategoryIn(List<String> values) {
            addCriterion("MERCHANT_CATEGORY in", values, "merchantCategory");
            return (Criteria) this;
        }

        public Criteria andMerchantCategoryNotIn(List<String> values) {
            addCriterion("MERCHANT_CATEGORY not in", values, "merchantCategory");
            return (Criteria) this;
        }

        public Criteria andMerchantCategoryBetween(String value1, String value2) {
            addCriterion("MERCHANT_CATEGORY between", value1, value2, "merchantCategory");
            return (Criteria) this;
        }

        public Criteria andMerchantCategoryNotBetween(String value1, String value2) {
            addCriterion("MERCHANT_CATEGORY not between", value1, value2, "merchantCategory");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeCodeIsNull() {
            addCriterion("INDUSTRY_TYPE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeCodeIsNotNull() {
            addCriterion("INDUSTRY_TYPE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeCodeEqualTo(String value) {
            addCriterion("INDUSTRY_TYPE_CODE =", value, "industryTypeCode");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeCodeNotEqualTo(String value) {
            addCriterion("INDUSTRY_TYPE_CODE <>", value, "industryTypeCode");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeCodeGreaterThan(String value) {
            addCriterion("INDUSTRY_TYPE_CODE >", value, "industryTypeCode");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("INDUSTRY_TYPE_CODE >=", value, "industryTypeCode");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeCodeLessThan(String value) {
            addCriterion("INDUSTRY_TYPE_CODE <", value, "industryTypeCode");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("INDUSTRY_TYPE_CODE <=", value, "industryTypeCode");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeCodeLike(String value) {
            addCriterion("INDUSTRY_TYPE_CODE like", value, "industryTypeCode");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeCodeNotLike(String value) {
            addCriterion("INDUSTRY_TYPE_CODE not like", value, "industryTypeCode");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeCodeIn(List<String> values) {
            addCriterion("INDUSTRY_TYPE_CODE in", values, "industryTypeCode");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeCodeNotIn(List<String> values) {
            addCriterion("INDUSTRY_TYPE_CODE not in", values, "industryTypeCode");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeCodeBetween(String value1, String value2) {
            addCriterion("INDUSTRY_TYPE_CODE between", value1, value2, "industryTypeCode");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeCodeNotBetween(String value1, String value2) {
            addCriterion("INDUSTRY_TYPE_CODE not between", value1, value2, "industryTypeCode");
            return (Criteria) this;
        }

        public Criteria andAuthorizationFlagIsNull() {
            addCriterion("AUTHORIZATION_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizationFlagIsNotNull() {
            addCriterion("AUTHORIZATION_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizationFlagEqualTo(String value) {
            addCriterion("AUTHORIZATION_FLAG =", value, "authorizationFlag");
            return (Criteria) this;
        }

        public Criteria andAuthorizationFlagNotEqualTo(String value) {
            addCriterion("AUTHORIZATION_FLAG <>", value, "authorizationFlag");
            return (Criteria) this;
        }

        public Criteria andAuthorizationFlagGreaterThan(String value) {
            addCriterion("AUTHORIZATION_FLAG >", value, "authorizationFlag");
            return (Criteria) this;
        }

        public Criteria andAuthorizationFlagGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHORIZATION_FLAG >=", value, "authorizationFlag");
            return (Criteria) this;
        }

        public Criteria andAuthorizationFlagLessThan(String value) {
            addCriterion("AUTHORIZATION_FLAG <", value, "authorizationFlag");
            return (Criteria) this;
        }

        public Criteria andAuthorizationFlagLessThanOrEqualTo(String value) {
            addCriterion("AUTHORIZATION_FLAG <=", value, "authorizationFlag");
            return (Criteria) this;
        }

        public Criteria andAuthorizationFlagLike(String value) {
            addCriterion("AUTHORIZATION_FLAG like", value, "authorizationFlag");
            return (Criteria) this;
        }

        public Criteria andAuthorizationFlagNotLike(String value) {
            addCriterion("AUTHORIZATION_FLAG not like", value, "authorizationFlag");
            return (Criteria) this;
        }

        public Criteria andAuthorizationFlagIn(List<String> values) {
            addCriterion("AUTHORIZATION_FLAG in", values, "authorizationFlag");
            return (Criteria) this;
        }

        public Criteria andAuthorizationFlagNotIn(List<String> values) {
            addCriterion("AUTHORIZATION_FLAG not in", values, "authorizationFlag");
            return (Criteria) this;
        }

        public Criteria andAuthorizationFlagBetween(String value1, String value2) {
            addCriterion("AUTHORIZATION_FLAG between", value1, value2, "authorizationFlag");
            return (Criteria) this;
        }

        public Criteria andAuthorizationFlagNotBetween(String value1, String value2) {
            addCriterion("AUTHORIZATION_FLAG not between", value1, value2, "authorizationFlag");
            return (Criteria) this;
        }

        public Criteria andUnionPayQrCodeIsNull() {
            addCriterion("UNION_PAY_QR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUnionPayQrCodeIsNotNull() {
            addCriterion("UNION_PAY_QR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUnionPayQrCodeEqualTo(String value) {
            addCriterion("UNION_PAY_QR_CODE =", value, "unionPayQrCode");
            return (Criteria) this;
        }

        public Criteria andUnionPayQrCodeNotEqualTo(String value) {
            addCriterion("UNION_PAY_QR_CODE <>", value, "unionPayQrCode");
            return (Criteria) this;
        }

        public Criteria andUnionPayQrCodeGreaterThan(String value) {
            addCriterion("UNION_PAY_QR_CODE >", value, "unionPayQrCode");
            return (Criteria) this;
        }

        public Criteria andUnionPayQrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("UNION_PAY_QR_CODE >=", value, "unionPayQrCode");
            return (Criteria) this;
        }

        public Criteria andUnionPayQrCodeLessThan(String value) {
            addCriterion("UNION_PAY_QR_CODE <", value, "unionPayQrCode");
            return (Criteria) this;
        }

        public Criteria andUnionPayQrCodeLessThanOrEqualTo(String value) {
            addCriterion("UNION_PAY_QR_CODE <=", value, "unionPayQrCode");
            return (Criteria) this;
        }

        public Criteria andUnionPayQrCodeLike(String value) {
            addCriterion("UNION_PAY_QR_CODE like", value, "unionPayQrCode");
            return (Criteria) this;
        }

        public Criteria andUnionPayQrCodeNotLike(String value) {
            addCriterion("UNION_PAY_QR_CODE not like", value, "unionPayQrCode");
            return (Criteria) this;
        }

        public Criteria andUnionPayQrCodeIn(List<String> values) {
            addCriterion("UNION_PAY_QR_CODE in", values, "unionPayQrCode");
            return (Criteria) this;
        }

        public Criteria andUnionPayQrCodeNotIn(List<String> values) {
            addCriterion("UNION_PAY_QR_CODE not in", values, "unionPayQrCode");
            return (Criteria) this;
        }

        public Criteria andUnionPayQrCodeBetween(String value1, String value2) {
            addCriterion("UNION_PAY_QR_CODE between", value1, value2, "unionPayQrCode");
            return (Criteria) this;
        }

        public Criteria andUnionPayQrCodeNotBetween(String value1, String value2) {
            addCriterion("UNION_PAY_QR_CODE not between", value1, value2, "unionPayQrCode");
            return (Criteria) this;
        }

        public Criteria andNeedPosFunctionIsNull() {
            addCriterion("NEED_POS_FUNCTION is null");
            return (Criteria) this;
        }

        public Criteria andNeedPosFunctionIsNotNull() {
            addCriterion("NEED_POS_FUNCTION is not null");
            return (Criteria) this;
        }

        public Criteria andNeedPosFunctionEqualTo(String value) {
            addCriterion("NEED_POS_FUNCTION =", value, "needPosFunction");
            return (Criteria) this;
        }

        public Criteria andNeedPosFunctionNotEqualTo(String value) {
            addCriterion("NEED_POS_FUNCTION <>", value, "needPosFunction");
            return (Criteria) this;
        }

        public Criteria andNeedPosFunctionGreaterThan(String value) {
            addCriterion("NEED_POS_FUNCTION >", value, "needPosFunction");
            return (Criteria) this;
        }

        public Criteria andNeedPosFunctionGreaterThanOrEqualTo(String value) {
            addCriterion("NEED_POS_FUNCTION >=", value, "needPosFunction");
            return (Criteria) this;
        }

        public Criteria andNeedPosFunctionLessThan(String value) {
            addCriterion("NEED_POS_FUNCTION <", value, "needPosFunction");
            return (Criteria) this;
        }

        public Criteria andNeedPosFunctionLessThanOrEqualTo(String value) {
            addCriterion("NEED_POS_FUNCTION <=", value, "needPosFunction");
            return (Criteria) this;
        }

        public Criteria andNeedPosFunctionLike(String value) {
            addCriterion("NEED_POS_FUNCTION like", value, "needPosFunction");
            return (Criteria) this;
        }

        public Criteria andNeedPosFunctionNotLike(String value) {
            addCriterion("NEED_POS_FUNCTION not like", value, "needPosFunction");
            return (Criteria) this;
        }

        public Criteria andNeedPosFunctionIn(List<String> values) {
            addCriterion("NEED_POS_FUNCTION in", values, "needPosFunction");
            return (Criteria) this;
        }

        public Criteria andNeedPosFunctionNotIn(List<String> values) {
            addCriterion("NEED_POS_FUNCTION not in", values, "needPosFunction");
            return (Criteria) this;
        }

        public Criteria andNeedPosFunctionBetween(String value1, String value2) {
            addCriterion("NEED_POS_FUNCTION between", value1, value2, "needPosFunction");
            return (Criteria) this;
        }

        public Criteria andNeedPosFunctionNotBetween(String value1, String value2) {
            addCriterion("NEED_POS_FUNCTION not between", value1, value2, "needPosFunction");
            return (Criteria) this;
        }

        public Criteria andIdCardStartDateIsNull() {
            addCriterion("ID_CARD_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andIdCardStartDateIsNotNull() {
            addCriterion("ID_CARD_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardStartDateEqualTo(String value) {
            addCriterion("ID_CARD_START_DATE =", value, "idCardStartDate");
            return (Criteria) this;
        }

        public Criteria andIdCardStartDateNotEqualTo(String value) {
            addCriterion("ID_CARD_START_DATE <>", value, "idCardStartDate");
            return (Criteria) this;
        }

        public Criteria andIdCardStartDateGreaterThan(String value) {
            addCriterion("ID_CARD_START_DATE >", value, "idCardStartDate");
            return (Criteria) this;
        }

        public Criteria andIdCardStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("ID_CARD_START_DATE >=", value, "idCardStartDate");
            return (Criteria) this;
        }

        public Criteria andIdCardStartDateLessThan(String value) {
            addCriterion("ID_CARD_START_DATE <", value, "idCardStartDate");
            return (Criteria) this;
        }

        public Criteria andIdCardStartDateLessThanOrEqualTo(String value) {
            addCriterion("ID_CARD_START_DATE <=", value, "idCardStartDate");
            return (Criteria) this;
        }

        public Criteria andIdCardStartDateLike(String value) {
            addCriterion("ID_CARD_START_DATE like", value, "idCardStartDate");
            return (Criteria) this;
        }

        public Criteria andIdCardStartDateNotLike(String value) {
            addCriterion("ID_CARD_START_DATE not like", value, "idCardStartDate");
            return (Criteria) this;
        }

        public Criteria andIdCardStartDateIn(List<String> values) {
            addCriterion("ID_CARD_START_DATE in", values, "idCardStartDate");
            return (Criteria) this;
        }

        public Criteria andIdCardStartDateNotIn(List<String> values) {
            addCriterion("ID_CARD_START_DATE not in", values, "idCardStartDate");
            return (Criteria) this;
        }

        public Criteria andIdCardStartDateBetween(String value1, String value2) {
            addCriterion("ID_CARD_START_DATE between", value1, value2, "idCardStartDate");
            return (Criteria) this;
        }

        public Criteria andIdCardStartDateNotBetween(String value1, String value2) {
            addCriterion("ID_CARD_START_DATE not between", value1, value2, "idCardStartDate");
            return (Criteria) this;
        }

        public Criteria andIdCardEndDateIsNull() {
            addCriterion("ID_CARD_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andIdCardEndDateIsNotNull() {
            addCriterion("ID_CARD_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEndDateEqualTo(String value) {
            addCriterion("ID_CARD_END_DATE =", value, "idCardEndDate");
            return (Criteria) this;
        }

        public Criteria andIdCardEndDateNotEqualTo(String value) {
            addCriterion("ID_CARD_END_DATE <>", value, "idCardEndDate");
            return (Criteria) this;
        }

        public Criteria andIdCardEndDateGreaterThan(String value) {
            addCriterion("ID_CARD_END_DATE >", value, "idCardEndDate");
            return (Criteria) this;
        }

        public Criteria andIdCardEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("ID_CARD_END_DATE >=", value, "idCardEndDate");
            return (Criteria) this;
        }

        public Criteria andIdCardEndDateLessThan(String value) {
            addCriterion("ID_CARD_END_DATE <", value, "idCardEndDate");
            return (Criteria) this;
        }

        public Criteria andIdCardEndDateLessThanOrEqualTo(String value) {
            addCriterion("ID_CARD_END_DATE <=", value, "idCardEndDate");
            return (Criteria) this;
        }

        public Criteria andIdCardEndDateLike(String value) {
            addCriterion("ID_CARD_END_DATE like", value, "idCardEndDate");
            return (Criteria) this;
        }

        public Criteria andIdCardEndDateNotLike(String value) {
            addCriterion("ID_CARD_END_DATE not like", value, "idCardEndDate");
            return (Criteria) this;
        }

        public Criteria andIdCardEndDateIn(List<String> values) {
            addCriterion("ID_CARD_END_DATE in", values, "idCardEndDate");
            return (Criteria) this;
        }

        public Criteria andIdCardEndDateNotIn(List<String> values) {
            addCriterion("ID_CARD_END_DATE not in", values, "idCardEndDate");
            return (Criteria) this;
        }

        public Criteria andIdCardEndDateBetween(String value1, String value2) {
            addCriterion("ID_CARD_END_DATE between", value1, value2, "idCardEndDate");
            return (Criteria) this;
        }

        public Criteria andIdCardEndDateNotBetween(String value1, String value2) {
            addCriterion("ID_CARD_END_DATE not between", value1, value2, "idCardEndDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateStartIsNull() {
            addCriterion("BUSINESS_DATE_START is null");
            return (Criteria) this;
        }

        public Criteria andBusinessDateStartIsNotNull() {
            addCriterion("BUSINESS_DATE_START is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessDateStartEqualTo(Date value) {
            addCriterion("BUSINESS_DATE_START =", value, "businessDateStart");
            return (Criteria) this;
        }

        public Criteria andBusinessDateStartNotEqualTo(Date value) {
            addCriterion("BUSINESS_DATE_START <>", value, "businessDateStart");
            return (Criteria) this;
        }

        public Criteria andBusinessDateStartGreaterThan(Date value) {
            addCriterion("BUSINESS_DATE_START >", value, "businessDateStart");
            return (Criteria) this;
        }

        public Criteria andBusinessDateStartGreaterThanOrEqualTo(Date value) {
            addCriterion("BUSINESS_DATE_START >=", value, "businessDateStart");
            return (Criteria) this;
        }

        public Criteria andBusinessDateStartLessThan(Date value) {
            addCriterion("BUSINESS_DATE_START <", value, "businessDateStart");
            return (Criteria) this;
        }

        public Criteria andBusinessDateStartLessThanOrEqualTo(Date value) {
            addCriterion("BUSINESS_DATE_START <=", value, "businessDateStart");
            return (Criteria) this;
        }

        public Criteria andBusinessDateStartIn(List<Date> values) {
            addCriterion("BUSINESS_DATE_START in", values, "businessDateStart");
            return (Criteria) this;
        }

        public Criteria andBusinessDateStartNotIn(List<Date> values) {
            addCriterion("BUSINESS_DATE_START not in", values, "businessDateStart");
            return (Criteria) this;
        }

        public Criteria andBusinessDateStartBetween(Date value1, Date value2) {
            addCriterion("BUSINESS_DATE_START between", value1, value2, "businessDateStart");
            return (Criteria) this;
        }

        public Criteria andBusinessDateStartNotBetween(Date value1, Date value2) {
            addCriterion("BUSINESS_DATE_START not between", value1, value2, "businessDateStart");
            return (Criteria) this;
        }

        public Criteria andBusinessDateLimitIsNull() {
            addCriterion("BUSINESS_DATE_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andBusinessDateLimitIsNotNull() {
            addCriterion("BUSINESS_DATE_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessDateLimitEqualTo(Date value) {
            addCriterion("BUSINESS_DATE_LIMIT =", value, "businessDateLimit");
            return (Criteria) this;
        }

        public Criteria andBusinessDateLimitNotEqualTo(Date value) {
            addCriterion("BUSINESS_DATE_LIMIT <>", value, "businessDateLimit");
            return (Criteria) this;
        }

        public Criteria andBusinessDateLimitGreaterThan(Date value) {
            addCriterion("BUSINESS_DATE_LIMIT >", value, "businessDateLimit");
            return (Criteria) this;
        }

        public Criteria andBusinessDateLimitGreaterThanOrEqualTo(Date value) {
            addCriterion("BUSINESS_DATE_LIMIT >=", value, "businessDateLimit");
            return (Criteria) this;
        }

        public Criteria andBusinessDateLimitLessThan(Date value) {
            addCriterion("BUSINESS_DATE_LIMIT <", value, "businessDateLimit");
            return (Criteria) this;
        }

        public Criteria andBusinessDateLimitLessThanOrEqualTo(Date value) {
            addCriterion("BUSINESS_DATE_LIMIT <=", value, "businessDateLimit");
            return (Criteria) this;
        }

        public Criteria andBusinessDateLimitIn(List<Date> values) {
            addCriterion("BUSINESS_DATE_LIMIT in", values, "businessDateLimit");
            return (Criteria) this;
        }

        public Criteria andBusinessDateLimitNotIn(List<Date> values) {
            addCriterion("BUSINESS_DATE_LIMIT not in", values, "businessDateLimit");
            return (Criteria) this;
        }

        public Criteria andBusinessDateLimitBetween(Date value1, Date value2) {
            addCriterion("BUSINESS_DATE_LIMIT between", value1, value2, "businessDateLimit");
            return (Criteria) this;
        }

        public Criteria andBusinessDateLimitNotBetween(Date value1, Date value2) {
            addCriterion("BUSINESS_DATE_LIMIT not between", value1, value2, "businessDateLimit");
            return (Criteria) this;
        }

        public Criteria andAccountIdCardIsNull() {
            addCriterion("ACCOUNT_ID_CARD is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdCardIsNotNull() {
            addCriterion("ACCOUNT_ID_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdCardEqualTo(String value) {
            addCriterion("ACCOUNT_ID_CARD =", value, "accountIdCard");
            return (Criteria) this;
        }

        public Criteria andAccountIdCardNotEqualTo(String value) {
            addCriterion("ACCOUNT_ID_CARD <>", value, "accountIdCard");
            return (Criteria) this;
        }

        public Criteria andAccountIdCardGreaterThan(String value) {
            addCriterion("ACCOUNT_ID_CARD >", value, "accountIdCard");
            return (Criteria) this;
        }

        public Criteria andAccountIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_ID_CARD >=", value, "accountIdCard");
            return (Criteria) this;
        }

        public Criteria andAccountIdCardLessThan(String value) {
            addCriterion("ACCOUNT_ID_CARD <", value, "accountIdCard");
            return (Criteria) this;
        }

        public Criteria andAccountIdCardLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_ID_CARD <=", value, "accountIdCard");
            return (Criteria) this;
        }

        public Criteria andAccountIdCardLike(String value) {
            addCriterion("ACCOUNT_ID_CARD like", value, "accountIdCard");
            return (Criteria) this;
        }

        public Criteria andAccountIdCardNotLike(String value) {
            addCriterion("ACCOUNT_ID_CARD not like", value, "accountIdCard");
            return (Criteria) this;
        }

        public Criteria andAccountIdCardIn(List<String> values) {
            addCriterion("ACCOUNT_ID_CARD in", values, "accountIdCard");
            return (Criteria) this;
        }

        public Criteria andAccountIdCardNotIn(List<String> values) {
            addCriterion("ACCOUNT_ID_CARD not in", values, "accountIdCard");
            return (Criteria) this;
        }

        public Criteria andAccountIdCardBetween(String value1, String value2) {
            addCriterion("ACCOUNT_ID_CARD between", value1, value2, "accountIdCard");
            return (Criteria) this;
        }

        public Criteria andAccountIdCardNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_ID_CARD not between", value1, value2, "accountIdCard");
            return (Criteria) this;
        }

        public Criteria andMccIsNull() {
            addCriterion("MCC is null");
            return (Criteria) this;
        }

        public Criteria andMccIsNotNull() {
            addCriterion("MCC is not null");
            return (Criteria) this;
        }

        public Criteria andMccEqualTo(String value) {
            addCriterion("MCC =", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccNotEqualTo(String value) {
            addCriterion("MCC <>", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccGreaterThan(String value) {
            addCriterion("MCC >", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccGreaterThanOrEqualTo(String value) {
            addCriterion("MCC >=", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccLessThan(String value) {
            addCriterion("MCC <", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccLessThanOrEqualTo(String value) {
            addCriterion("MCC <=", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccLike(String value) {
            addCriterion("MCC like", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccNotLike(String value) {
            addCriterion("MCC not like", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccIn(List<String> values) {
            addCriterion("MCC in", values, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccNotIn(List<String> values) {
            addCriterion("MCC not in", values, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccBetween(String value1, String value2) {
            addCriterion("MCC between", value1, value2, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccNotBetween(String value1, String value2) {
            addCriterion("MCC not between", value1, value2, "mcc");
            return (Criteria) this;
        }

        public Criteria andAgreeprotocolIsNull() {
            addCriterion("AGREEPROTOCOL is null");
            return (Criteria) this;
        }

        public Criteria andAgreeprotocolIsNotNull() {
            addCriterion("AGREEPROTOCOL is not null");
            return (Criteria) this;
        }

        public Criteria andAgreeprotocolEqualTo(String value) {
            addCriterion("AGREEPROTOCOL =", value, "agreeprotocol");
            return (Criteria) this;
        }

        public Criteria andAgreeprotocolNotEqualTo(String value) {
            addCriterion("AGREEPROTOCOL <>", value, "agreeprotocol");
            return (Criteria) this;
        }

        public Criteria andAgreeprotocolGreaterThan(String value) {
            addCriterion("AGREEPROTOCOL >", value, "agreeprotocol");
            return (Criteria) this;
        }

        public Criteria andAgreeprotocolGreaterThanOrEqualTo(String value) {
            addCriterion("AGREEPROTOCOL >=", value, "agreeprotocol");
            return (Criteria) this;
        }

        public Criteria andAgreeprotocolLessThan(String value) {
            addCriterion("AGREEPROTOCOL <", value, "agreeprotocol");
            return (Criteria) this;
        }

        public Criteria andAgreeprotocolLessThanOrEqualTo(String value) {
            addCriterion("AGREEPROTOCOL <=", value, "agreeprotocol");
            return (Criteria) this;
        }

        public Criteria andAgreeprotocolLike(String value) {
            addCriterion("AGREEPROTOCOL like", value, "agreeprotocol");
            return (Criteria) this;
        }

        public Criteria andAgreeprotocolNotLike(String value) {
            addCriterion("AGREEPROTOCOL not like", value, "agreeprotocol");
            return (Criteria) this;
        }

        public Criteria andAgreeprotocolIn(List<String> values) {
            addCriterion("AGREEPROTOCOL in", values, "agreeprotocol");
            return (Criteria) this;
        }

        public Criteria andAgreeprotocolNotIn(List<String> values) {
            addCriterion("AGREEPROTOCOL not in", values, "agreeprotocol");
            return (Criteria) this;
        }

        public Criteria andAgreeprotocolBetween(String value1, String value2) {
            addCriterion("AGREEPROTOCOL between", value1, value2, "agreeprotocol");
            return (Criteria) this;
        }

        public Criteria andAgreeprotocolNotBetween(String value1, String value2) {
            addCriterion("AGREEPROTOCOL not between", value1, value2, "agreeprotocol");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlIsNull() {
            addCriterion("CALLBACK_URL is null");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlIsNotNull() {
            addCriterion("CALLBACK_URL is not null");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlEqualTo(String value) {
            addCriterion("CALLBACK_URL =", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlNotEqualTo(String value) {
            addCriterion("CALLBACK_URL <>", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlGreaterThan(String value) {
            addCriterion("CALLBACK_URL >", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlGreaterThanOrEqualTo(String value) {
            addCriterion("CALLBACK_URL >=", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlLessThan(String value) {
            addCriterion("CALLBACK_URL <", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlLessThanOrEqualTo(String value) {
            addCriterion("CALLBACK_URL <=", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlLike(String value) {
            addCriterion("CALLBACK_URL like", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlNotLike(String value) {
            addCriterion("CALLBACK_URL not like", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlIn(List<String> values) {
            addCriterion("CALLBACK_URL in", values, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlNotIn(List<String> values) {
            addCriterion("CALLBACK_URL not in", values, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlBetween(String value1, String value2) {
            addCriterion("CALLBACK_URL between", value1, value2, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlNotBetween(String value1, String value2) {
            addCriterion("CALLBACK_URL not between", value1, value2, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andSettleModeIsNull() {
            addCriterion("SETTLE_MODE is null");
            return (Criteria) this;
        }

        public Criteria andSettleModeIsNotNull() {
            addCriterion("SETTLE_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andSettleModeEqualTo(String value) {
            addCriterion("SETTLE_MODE =", value, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeNotEqualTo(String value) {
            addCriterion("SETTLE_MODE <>", value, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeGreaterThan(String value) {
            addCriterion("SETTLE_MODE >", value, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLE_MODE >=", value, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeLessThan(String value) {
            addCriterion("SETTLE_MODE <", value, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeLessThanOrEqualTo(String value) {
            addCriterion("SETTLE_MODE <=", value, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeLike(String value) {
            addCriterion("SETTLE_MODE like", value, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeNotLike(String value) {
            addCriterion("SETTLE_MODE not like", value, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeIn(List<String> values) {
            addCriterion("SETTLE_MODE in", values, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeNotIn(List<String> values) {
            addCriterion("SETTLE_MODE not in", values, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeBetween(String value1, String value2) {
            addCriterion("SETTLE_MODE between", value1, value2, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeNotBetween(String value1, String value2) {
            addCriterion("SETTLE_MODE not between", value1, value2, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettlementAuthIsNull() {
            addCriterion("SETTLEMENT_AUTH is null");
            return (Criteria) this;
        }

        public Criteria andSettlementAuthIsNotNull() {
            addCriterion("SETTLEMENT_AUTH is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementAuthEqualTo(String value) {
            addCriterion("SETTLEMENT_AUTH =", value, "settlementAuth");
            return (Criteria) this;
        }

        public Criteria andSettlementAuthNotEqualTo(String value) {
            addCriterion("SETTLEMENT_AUTH <>", value, "settlementAuth");
            return (Criteria) this;
        }

        public Criteria andSettlementAuthGreaterThan(String value) {
            addCriterion("SETTLEMENT_AUTH >", value, "settlementAuth");
            return (Criteria) this;
        }

        public Criteria andSettlementAuthGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_AUTH >=", value, "settlementAuth");
            return (Criteria) this;
        }

        public Criteria andSettlementAuthLessThan(String value) {
            addCriterion("SETTLEMENT_AUTH <", value, "settlementAuth");
            return (Criteria) this;
        }

        public Criteria andSettlementAuthLessThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_AUTH <=", value, "settlementAuth");
            return (Criteria) this;
        }

        public Criteria andSettlementAuthLike(String value) {
            addCriterion("SETTLEMENT_AUTH like", value, "settlementAuth");
            return (Criteria) this;
        }

        public Criteria andSettlementAuthNotLike(String value) {
            addCriterion("SETTLEMENT_AUTH not like", value, "settlementAuth");
            return (Criteria) this;
        }

        public Criteria andSettlementAuthIn(List<String> values) {
            addCriterion("SETTLEMENT_AUTH in", values, "settlementAuth");
            return (Criteria) this;
        }

        public Criteria andSettlementAuthNotIn(List<String> values) {
            addCriterion("SETTLEMENT_AUTH not in", values, "settlementAuth");
            return (Criteria) this;
        }

        public Criteria andSettlementAuthBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_AUTH between", value1, value2, "settlementAuth");
            return (Criteria) this;
        }

        public Criteria andSettlementAuthNotBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_AUTH not between", value1, value2, "settlementAuth");
            return (Criteria) this;
        }

        public Criteria andPostalAddressIsNull() {
            addCriterion("POSTAL_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andPostalAddressIsNotNull() {
            addCriterion("POSTAL_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andPostalAddressEqualTo(String value) {
            addCriterion("POSTAL_ADDRESS =", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressNotEqualTo(String value) {
            addCriterion("POSTAL_ADDRESS <>", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressGreaterThan(String value) {
            addCriterion("POSTAL_ADDRESS >", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressGreaterThanOrEqualTo(String value) {
            addCriterion("POSTAL_ADDRESS >=", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressLessThan(String value) {
            addCriterion("POSTAL_ADDRESS <", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressLessThanOrEqualTo(String value) {
            addCriterion("POSTAL_ADDRESS <=", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressLike(String value) {
            addCriterion("POSTAL_ADDRESS like", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressNotLike(String value) {
            addCriterion("POSTAL_ADDRESS not like", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressIn(List<String> values) {
            addCriterion("POSTAL_ADDRESS in", values, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressNotIn(List<String> values) {
            addCriterion("POSTAL_ADDRESS not in", values, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressBetween(String value1, String value2) {
            addCriterion("POSTAL_ADDRESS between", value1, value2, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressNotBetween(String value1, String value2) {
            addCriterion("POSTAL_ADDRESS not between", value1, value2, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andMicroBizTypeIsNull() {
            addCriterion("MICRO_BIZ_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMicroBizTypeIsNotNull() {
            addCriterion("MICRO_BIZ_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMicroBizTypeEqualTo(String value) {
            addCriterion("MICRO_BIZ_TYPE =", value, "microBizType");
            return (Criteria) this;
        }

        public Criteria andMicroBizTypeNotEqualTo(String value) {
            addCriterion("MICRO_BIZ_TYPE <>", value, "microBizType");
            return (Criteria) this;
        }

        public Criteria andMicroBizTypeGreaterThan(String value) {
            addCriterion("MICRO_BIZ_TYPE >", value, "microBizType");
            return (Criteria) this;
        }

        public Criteria andMicroBizTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MICRO_BIZ_TYPE >=", value, "microBizType");
            return (Criteria) this;
        }

        public Criteria andMicroBizTypeLessThan(String value) {
            addCriterion("MICRO_BIZ_TYPE <", value, "microBizType");
            return (Criteria) this;
        }

        public Criteria andMicroBizTypeLessThanOrEqualTo(String value) {
            addCriterion("MICRO_BIZ_TYPE <=", value, "microBizType");
            return (Criteria) this;
        }

        public Criteria andMicroBizTypeLike(String value) {
            addCriterion("MICRO_BIZ_TYPE like", value, "microBizType");
            return (Criteria) this;
        }

        public Criteria andMicroBizTypeNotLike(String value) {
            addCriterion("MICRO_BIZ_TYPE not like", value, "microBizType");
            return (Criteria) this;
        }

        public Criteria andMicroBizTypeIn(List<String> values) {
            addCriterion("MICRO_BIZ_TYPE in", values, "microBizType");
            return (Criteria) this;
        }

        public Criteria andMicroBizTypeNotIn(List<String> values) {
            addCriterion("MICRO_BIZ_TYPE not in", values, "microBizType");
            return (Criteria) this;
        }

        public Criteria andMicroBizTypeBetween(String value1, String value2) {
            addCriterion("MICRO_BIZ_TYPE between", value1, value2, "microBizType");
            return (Criteria) this;
        }

        public Criteria andMicroBizTypeNotBetween(String value1, String value2) {
            addCriterion("MICRO_BIZ_TYPE not between", value1, value2, "microBizType");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNull() {
            addCriterion("CERT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNotNull() {
            addCriterion("CERT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCertTypeEqualTo(String value) {
            addCriterion("CERT_TYPE =", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotEqualTo(String value) {
            addCriterion("CERT_TYPE <>", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThan(String value) {
            addCriterion("CERT_TYPE >", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CERT_TYPE >=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThan(String value) {
            addCriterion("CERT_TYPE <", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThanOrEqualTo(String value) {
            addCriterion("CERT_TYPE <=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLike(String value) {
            addCriterion("CERT_TYPE like", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotLike(String value) {
            addCriterion("CERT_TYPE not like", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeIn(List<String> values) {
            addCriterion("CERT_TYPE in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotIn(List<String> values) {
            addCriterion("CERT_TYPE not in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeBetween(String value1, String value2) {
            addCriterion("CERT_TYPE between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotBetween(String value1, String value2) {
            addCriterion("CERT_TYPE not between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andLinkManIdIsNull() {
            addCriterion("LINK_MAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andLinkManIdIsNotNull() {
            addCriterion("LINK_MAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLinkManIdEqualTo(String value) {
            addCriterion("LINK_MAN_ID =", value, "linkManId");
            return (Criteria) this;
        }

        public Criteria andLinkManIdNotEqualTo(String value) {
            addCriterion("LINK_MAN_ID <>", value, "linkManId");
            return (Criteria) this;
        }

        public Criteria andLinkManIdGreaterThan(String value) {
            addCriterion("LINK_MAN_ID >", value, "linkManId");
            return (Criteria) this;
        }

        public Criteria andLinkManIdGreaterThanOrEqualTo(String value) {
            addCriterion("LINK_MAN_ID >=", value, "linkManId");
            return (Criteria) this;
        }

        public Criteria andLinkManIdLessThan(String value) {
            addCriterion("LINK_MAN_ID <", value, "linkManId");
            return (Criteria) this;
        }

        public Criteria andLinkManIdLessThanOrEqualTo(String value) {
            addCriterion("LINK_MAN_ID <=", value, "linkManId");
            return (Criteria) this;
        }

        public Criteria andLinkManIdLike(String value) {
            addCriterion("LINK_MAN_ID like", value, "linkManId");
            return (Criteria) this;
        }

        public Criteria andLinkManIdNotLike(String value) {
            addCriterion("LINK_MAN_ID not like", value, "linkManId");
            return (Criteria) this;
        }

        public Criteria andLinkManIdIn(List<String> values) {
            addCriterion("LINK_MAN_ID in", values, "linkManId");
            return (Criteria) this;
        }

        public Criteria andLinkManIdNotIn(List<String> values) {
            addCriterion("LINK_MAN_ID not in", values, "linkManId");
            return (Criteria) this;
        }

        public Criteria andLinkManIdBetween(String value1, String value2) {
            addCriterion("LINK_MAN_ID between", value1, value2, "linkManId");
            return (Criteria) this;
        }

        public Criteria andLinkManIdNotBetween(String value1, String value2) {
            addCriterion("LINK_MAN_ID not between", value1, value2, "linkManId");
            return (Criteria) this;
        }

        public Criteria andNeedAuthorizeIsNull() {
            addCriterion("NEED_AUTHORIZE is null");
            return (Criteria) this;
        }

        public Criteria andNeedAuthorizeIsNotNull() {
            addCriterion("NEED_AUTHORIZE is not null");
            return (Criteria) this;
        }

        public Criteria andNeedAuthorizeEqualTo(String value) {
            addCriterion("NEED_AUTHORIZE =", value, "needAuthorize");
            return (Criteria) this;
        }

        public Criteria andNeedAuthorizeNotEqualTo(String value) {
            addCriterion("NEED_AUTHORIZE <>", value, "needAuthorize");
            return (Criteria) this;
        }

        public Criteria andNeedAuthorizeGreaterThan(String value) {
            addCriterion("NEED_AUTHORIZE >", value, "needAuthorize");
            return (Criteria) this;
        }

        public Criteria andNeedAuthorizeGreaterThanOrEqualTo(String value) {
            addCriterion("NEED_AUTHORIZE >=", value, "needAuthorize");
            return (Criteria) this;
        }

        public Criteria andNeedAuthorizeLessThan(String value) {
            addCriterion("NEED_AUTHORIZE <", value, "needAuthorize");
            return (Criteria) this;
        }

        public Criteria andNeedAuthorizeLessThanOrEqualTo(String value) {
            addCriterion("NEED_AUTHORIZE <=", value, "needAuthorize");
            return (Criteria) this;
        }

        public Criteria andNeedAuthorizeLike(String value) {
            addCriterion("NEED_AUTHORIZE like", value, "needAuthorize");
            return (Criteria) this;
        }

        public Criteria andNeedAuthorizeNotLike(String value) {
            addCriterion("NEED_AUTHORIZE not like", value, "needAuthorize");
            return (Criteria) this;
        }

        public Criteria andNeedAuthorizeIn(List<String> values) {
            addCriterion("NEED_AUTHORIZE in", values, "needAuthorize");
            return (Criteria) this;
        }

        public Criteria andNeedAuthorizeNotIn(List<String> values) {
            addCriterion("NEED_AUTHORIZE not in", values, "needAuthorize");
            return (Criteria) this;
        }

        public Criteria andNeedAuthorizeBetween(String value1, String value2) {
            addCriterion("NEED_AUTHORIZE between", value1, value2, "needAuthorize");
            return (Criteria) this;
        }

        public Criteria andNeedAuthorizeNotBetween(String value1, String value2) {
            addCriterion("NEED_AUTHORIZE not between", value1, value2, "needAuthorize");
            return (Criteria) this;
        }

        public Criteria andSpecialSignNameIsNull() {
            addCriterion("SPECIAL_SIGN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSpecialSignNameIsNotNull() {
            addCriterion("SPECIAL_SIGN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialSignNameEqualTo(String value) {
            addCriterion("SPECIAL_SIGN_NAME =", value, "specialSignName");
            return (Criteria) this;
        }

        public Criteria andSpecialSignNameNotEqualTo(String value) {
            addCriterion("SPECIAL_SIGN_NAME <>", value, "specialSignName");
            return (Criteria) this;
        }

        public Criteria andSpecialSignNameGreaterThan(String value) {
            addCriterion("SPECIAL_SIGN_NAME >", value, "specialSignName");
            return (Criteria) this;
        }

        public Criteria andSpecialSignNameGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIAL_SIGN_NAME >=", value, "specialSignName");
            return (Criteria) this;
        }

        public Criteria andSpecialSignNameLessThan(String value) {
            addCriterion("SPECIAL_SIGN_NAME <", value, "specialSignName");
            return (Criteria) this;
        }

        public Criteria andSpecialSignNameLessThanOrEqualTo(String value) {
            addCriterion("SPECIAL_SIGN_NAME <=", value, "specialSignName");
            return (Criteria) this;
        }

        public Criteria andSpecialSignNameLike(String value) {
            addCriterion("SPECIAL_SIGN_NAME like", value, "specialSignName");
            return (Criteria) this;
        }

        public Criteria andSpecialSignNameNotLike(String value) {
            addCriterion("SPECIAL_SIGN_NAME not like", value, "specialSignName");
            return (Criteria) this;
        }

        public Criteria andSpecialSignNameIn(List<String> values) {
            addCriterion("SPECIAL_SIGN_NAME in", values, "specialSignName");
            return (Criteria) this;
        }

        public Criteria andSpecialSignNameNotIn(List<String> values) {
            addCriterion("SPECIAL_SIGN_NAME not in", values, "specialSignName");
            return (Criteria) this;
        }

        public Criteria andSpecialSignNameBetween(String value1, String value2) {
            addCriterion("SPECIAL_SIGN_NAME between", value1, value2, "specialSignName");
            return (Criteria) this;
        }

        public Criteria andSpecialSignNameNotBetween(String value1, String value2) {
            addCriterion("SPECIAL_SIGN_NAME not between", value1, value2, "specialSignName");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("CREATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("CREATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(String value) {
            addCriterion("CREATE_ID =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(String value) {
            addCriterion("CREATE_ID <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(String value) {
            addCriterion("CREATE_ID >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_ID >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(String value) {
            addCriterion("CREATE_ID <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(String value) {
            addCriterion("CREATE_ID <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLike(String value) {
            addCriterion("CREATE_ID like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotLike(String value) {
            addCriterion("CREATE_ID not like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<String> values) {
            addCriterion("CREATE_ID in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<String> values) {
            addCriterion("CREATE_ID not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(String value1, String value2) {
            addCriterion("CREATE_ID between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(String value1, String value2) {
            addCriterion("CREATE_ID not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNull() {
            addCriterion("UPDATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNotNull() {
            addCriterion("UPDATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdEqualTo(String value) {
            addCriterion("UPDATE_ID =", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotEqualTo(String value) {
            addCriterion("UPDATE_ID <>", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThan(String value) {
            addCriterion("UPDATE_ID >", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_ID >=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThan(String value) {
            addCriterion("UPDATE_ID <", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_ID <=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLike(String value) {
            addCriterion("UPDATE_ID like", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotLike(String value) {
            addCriterion("UPDATE_ID not like", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIn(List<String> values) {
            addCriterion("UPDATE_ID in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotIn(List<String> values) {
            addCriterion("UPDATE_ID not in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdBetween(String value1, String value2) {
            addCriterion("UPDATE_ID between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotBetween(String value1, String value2) {
            addCriterion("UPDATE_ID not between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}