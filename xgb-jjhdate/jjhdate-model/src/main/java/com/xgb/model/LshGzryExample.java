package com.xgb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LshGzryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LshGzryExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andInstanceidIsNull() {
            addCriterion("INSTANCEID is null");
            return (Criteria) this;
        }

        public Criteria andInstanceidIsNotNull() {
            addCriterion("INSTANCEID is not null");
            return (Criteria) this;
        }

        public Criteria andInstanceidEqualTo(String value) {
            addCriterion("INSTANCEID =", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidNotEqualTo(String value) {
            addCriterion("INSTANCEID <>", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidGreaterThan(String value) {
            addCriterion("INSTANCEID >", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidGreaterThanOrEqualTo(String value) {
            addCriterion("INSTANCEID >=", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidLessThan(String value) {
            addCriterion("INSTANCEID <", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidLessThanOrEqualTo(String value) {
            addCriterion("INSTANCEID <=", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidLike(String value) {
            addCriterion("INSTANCEID like", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidNotLike(String value) {
            addCriterion("INSTANCEID not like", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidIn(List<String> values) {
            addCriterion("INSTANCEID in", values, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidNotIn(List<String> values) {
            addCriterion("INSTANCEID not in", values, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidBetween(String value1, String value2) {
            addCriterion("INSTANCEID between", value1, value2, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidNotBetween(String value1, String value2) {
            addCriterion("INSTANCEID not between", value1, value2, "instanceid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidIsNull() {
            addCriterion("ORGANIZATIONID is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationidIsNotNull() {
            addCriterion("ORGANIZATIONID is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationidEqualTo(String value) {
            addCriterion("ORGANIZATIONID =", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotEqualTo(String value) {
            addCriterion("ORGANIZATIONID <>", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidGreaterThan(String value) {
            addCriterion("ORGANIZATIONID >", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANIZATIONID >=", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidLessThan(String value) {
            addCriterion("ORGANIZATIONID <", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidLessThanOrEqualTo(String value) {
            addCriterion("ORGANIZATIONID <=", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidLike(String value) {
            addCriterion("ORGANIZATIONID like", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotLike(String value) {
            addCriterion("ORGANIZATIONID not like", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidIn(List<String> values) {
            addCriterion("ORGANIZATIONID in", values, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotIn(List<String> values) {
            addCriterion("ORGANIZATIONID not in", values, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidBetween(String value1, String value2) {
            addCriterion("ORGANIZATIONID between", value1, value2, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotBetween(String value1, String value2) {
            addCriterion("ORGANIZATIONID not between", value1, value2, "organizationid");
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

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andMasteridIsNull() {
            addCriterion("MASTERID is null");
            return (Criteria) this;
        }

        public Criteria andMasteridIsNotNull() {
            addCriterion("MASTERID is not null");
            return (Criteria) this;
        }

        public Criteria andMasteridEqualTo(Long value) {
            addCriterion("MASTERID =", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridNotEqualTo(Long value) {
            addCriterion("MASTERID <>", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridGreaterThan(Long value) {
            addCriterion("MASTERID >", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridGreaterThanOrEqualTo(Long value) {
            addCriterion("MASTERID >=", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridLessThan(Long value) {
            addCriterion("MASTERID <", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridLessThanOrEqualTo(Long value) {
            addCriterion("MASTERID <=", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridIn(List<Long> values) {
            addCriterion("MASTERID in", values, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridNotIn(List<Long> values) {
            addCriterion("MASTERID not in", values, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridBetween(Long value1, Long value2) {
            addCriterion("MASTERID between", value1, value2, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridNotBetween(Long value1, Long value2) {
            addCriterion("MASTERID not between", value1, value2, "masterid");
            return (Criteria) this;
        }

        public Criteria andXuhaoIsNull() {
            addCriterion("XUHAO is null");
            return (Criteria) this;
        }

        public Criteria andXuhaoIsNotNull() {
            addCriterion("XUHAO is not null");
            return (Criteria) this;
        }

        public Criteria andXuhaoEqualTo(String value) {
            addCriterion("XUHAO =", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoNotEqualTo(String value) {
            addCriterion("XUHAO <>", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoGreaterThan(String value) {
            addCriterion("XUHAO >", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoGreaterThanOrEqualTo(String value) {
            addCriterion("XUHAO >=", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoLessThan(String value) {
            addCriterion("XUHAO <", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoLessThanOrEqualTo(String value) {
            addCriterion("XUHAO <=", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoLike(String value) {
            addCriterion("XUHAO like", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoNotLike(String value) {
            addCriterion("XUHAO not like", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoIn(List<String> values) {
            addCriterion("XUHAO in", values, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoNotIn(List<String> values) {
            addCriterion("XUHAO not in", values, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoBetween(String value1, String value2) {
            addCriterion("XUHAO between", value1, value2, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoNotBetween(String value1, String value2) {
            addCriterion("XUHAO not between", value1, value2, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXingmingIsNull() {
            addCriterion("XINGMING is null");
            return (Criteria) this;
        }

        public Criteria andXingmingIsNotNull() {
            addCriterion("XINGMING is not null");
            return (Criteria) this;
        }

        public Criteria andXingmingEqualTo(String value) {
            addCriterion("XINGMING =", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotEqualTo(String value) {
            addCriterion("XINGMING <>", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingGreaterThan(String value) {
            addCriterion("XINGMING >", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingGreaterThanOrEqualTo(String value) {
            addCriterion("XINGMING >=", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingLessThan(String value) {
            addCriterion("XINGMING <", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingLessThanOrEqualTo(String value) {
            addCriterion("XINGMING <=", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingLike(String value) {
            addCriterion("XINGMING like", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotLike(String value) {
            addCriterion("XINGMING not like", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingIn(List<String> values) {
            addCriterion("XINGMING in", values, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotIn(List<String> values) {
            addCriterion("XINGMING not in", values, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingBetween(String value1, String value2) {
            addCriterion("XINGMING between", value1, value2, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotBetween(String value1, String value2) {
            addCriterion("XINGMING not between", value1, value2, "xingming");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoIsNull() {
            addCriterion("ZHENGZHIMIANMAO is null");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoIsNotNull() {
            addCriterion("ZHENGZHIMIANMAO is not null");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoEqualTo(String value) {
            addCriterion("ZHENGZHIMIANMAO =", value, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoNotEqualTo(String value) {
            addCriterion("ZHENGZHIMIANMAO <>", value, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoGreaterThan(String value) {
            addCriterion("ZHENGZHIMIANMAO >", value, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoGreaterThanOrEqualTo(String value) {
            addCriterion("ZHENGZHIMIANMAO >=", value, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoLessThan(String value) {
            addCriterion("ZHENGZHIMIANMAO <", value, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoLessThanOrEqualTo(String value) {
            addCriterion("ZHENGZHIMIANMAO <=", value, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoLike(String value) {
            addCriterion("ZHENGZHIMIANMAO like", value, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoNotLike(String value) {
            addCriterion("ZHENGZHIMIANMAO not like", value, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoIn(List<String> values) {
            addCriterion("ZHENGZHIMIANMAO in", values, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoNotIn(List<String> values) {
            addCriterion("ZHENGZHIMIANMAO not in", values, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoBetween(String value1, String value2) {
            addCriterion("ZHENGZHIMIANMAO between", value1, value2, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoNotBetween(String value1, String value2) {
            addCriterion("ZHENGZHIMIANMAO not between", value1, value2, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andBumenzhiwuIsNull() {
            addCriterion("BUMENZHIWU is null");
            return (Criteria) this;
        }

        public Criteria andBumenzhiwuIsNotNull() {
            addCriterion("BUMENZHIWU is not null");
            return (Criteria) this;
        }

        public Criteria andBumenzhiwuEqualTo(String value) {
            addCriterion("BUMENZHIWU =", value, "bumenzhiwu");
            return (Criteria) this;
        }

        public Criteria andBumenzhiwuNotEqualTo(String value) {
            addCriterion("BUMENZHIWU <>", value, "bumenzhiwu");
            return (Criteria) this;
        }

        public Criteria andBumenzhiwuGreaterThan(String value) {
            addCriterion("BUMENZHIWU >", value, "bumenzhiwu");
            return (Criteria) this;
        }

        public Criteria andBumenzhiwuGreaterThanOrEqualTo(String value) {
            addCriterion("BUMENZHIWU >=", value, "bumenzhiwu");
            return (Criteria) this;
        }

        public Criteria andBumenzhiwuLessThan(String value) {
            addCriterion("BUMENZHIWU <", value, "bumenzhiwu");
            return (Criteria) this;
        }

        public Criteria andBumenzhiwuLessThanOrEqualTo(String value) {
            addCriterion("BUMENZHIWU <=", value, "bumenzhiwu");
            return (Criteria) this;
        }

        public Criteria andBumenzhiwuLike(String value) {
            addCriterion("BUMENZHIWU like", value, "bumenzhiwu");
            return (Criteria) this;
        }

        public Criteria andBumenzhiwuNotLike(String value) {
            addCriterion("BUMENZHIWU not like", value, "bumenzhiwu");
            return (Criteria) this;
        }

        public Criteria andBumenzhiwuIn(List<String> values) {
            addCriterion("BUMENZHIWU in", values, "bumenzhiwu");
            return (Criteria) this;
        }

        public Criteria andBumenzhiwuNotIn(List<String> values) {
            addCriterion("BUMENZHIWU not in", values, "bumenzhiwu");
            return (Criteria) this;
        }

        public Criteria andBumenzhiwuBetween(String value1, String value2) {
            addCriterion("BUMENZHIWU between", value1, value2, "bumenzhiwu");
            return (Criteria) this;
        }

        public Criteria andBumenzhiwuNotBetween(String value1, String value2) {
            addCriterion("BUMENZHIWU not between", value1, value2, "bumenzhiwu");
            return (Criteria) this;
        }

        public Criteria andShengriIsNull() {
            addCriterion("SHENGRI is null");
            return (Criteria) this;
        }

        public Criteria andShengriIsNotNull() {
            addCriterion("SHENGRI is not null");
            return (Criteria) this;
        }

        public Criteria andShengriEqualTo(Date value) {
            addCriterion("SHENGRI =", value, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriNotEqualTo(Date value) {
            addCriterion("SHENGRI <>", value, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriGreaterThan(Date value) {
            addCriterion("SHENGRI >", value, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriGreaterThanOrEqualTo(Date value) {
            addCriterion("SHENGRI >=", value, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriLessThan(Date value) {
            addCriterion("SHENGRI <", value, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriLessThanOrEqualTo(Date value) {
            addCriterion("SHENGRI <=", value, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriIn(List<Date> values) {
            addCriterion("SHENGRI in", values, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriNotIn(List<Date> values) {
            addCriterion("SHENGRI not in", values, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriBetween(Date value1, Date value2) {
            addCriterion("SHENGRI between", value1, value2, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriNotBetween(Date value1, Date value2) {
            addCriterion("SHENGRI not between", value1, value2, "shengri");
            return (Criteria) this;
        }

        public Criteria andXueliIsNull() {
            addCriterion("XUELI is null");
            return (Criteria) this;
        }

        public Criteria andXueliIsNotNull() {
            addCriterion("XUELI is not null");
            return (Criteria) this;
        }

        public Criteria andXueliEqualTo(String value) {
            addCriterion("XUELI =", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotEqualTo(String value) {
            addCriterion("XUELI <>", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliGreaterThan(String value) {
            addCriterion("XUELI >", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliGreaterThanOrEqualTo(String value) {
            addCriterion("XUELI >=", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLessThan(String value) {
            addCriterion("XUELI <", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLessThanOrEqualTo(String value) {
            addCriterion("XUELI <=", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLike(String value) {
            addCriterion("XUELI like", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotLike(String value) {
            addCriterion("XUELI not like", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliIn(List<String> values) {
            addCriterion("XUELI in", values, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotIn(List<String> values) {
            addCriterion("XUELI not in", values, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliBetween(String value1, String value2) {
            addCriterion("XUELI between", value1, value2, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotBetween(String value1, String value2) {
            addCriterion("XUELI not between", value1, value2, "xueli");
            return (Criteria) this;
        }

        public Criteria andXingbieIsNull() {
            addCriterion("XINGBIE is null");
            return (Criteria) this;
        }

        public Criteria andXingbieIsNotNull() {
            addCriterion("XINGBIE is not null");
            return (Criteria) this;
        }

        public Criteria andXingbieEqualTo(Short value) {
            addCriterion("XINGBIE =", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieNotEqualTo(Short value) {
            addCriterion("XINGBIE <>", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieGreaterThan(Short value) {
            addCriterion("XINGBIE >", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieGreaterThanOrEqualTo(Short value) {
            addCriterion("XINGBIE >=", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieLessThan(Short value) {
            addCriterion("XINGBIE <", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieLessThanOrEqualTo(Short value) {
            addCriterion("XINGBIE <=", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieIn(List<Short> values) {
            addCriterion("XINGBIE in", values, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieNotIn(List<Short> values) {
            addCriterion("XINGBIE not in", values, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieBetween(Short value1, Short value2) {
            addCriterion("XINGBIE between", value1, value2, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieNotBetween(Short value1, Short value2) {
            addCriterion("XINGBIE not between", value1, value2, "xingbie");
            return (Criteria) this;
        }

        public Criteria andDangzhibuIsNull() {
            addCriterion("DANGZHIBU is null");
            return (Criteria) this;
        }

        public Criteria andDangzhibuIsNotNull() {
            addCriterion("DANGZHIBU is not null");
            return (Criteria) this;
        }

        public Criteria andDangzhibuEqualTo(String value) {
            addCriterion("DANGZHIBU =", value, "dangzhibu");
            return (Criteria) this;
        }

        public Criteria andDangzhibuNotEqualTo(String value) {
            addCriterion("DANGZHIBU <>", value, "dangzhibu");
            return (Criteria) this;
        }

        public Criteria andDangzhibuGreaterThan(String value) {
            addCriterion("DANGZHIBU >", value, "dangzhibu");
            return (Criteria) this;
        }

        public Criteria andDangzhibuGreaterThanOrEqualTo(String value) {
            addCriterion("DANGZHIBU >=", value, "dangzhibu");
            return (Criteria) this;
        }

        public Criteria andDangzhibuLessThan(String value) {
            addCriterion("DANGZHIBU <", value, "dangzhibu");
            return (Criteria) this;
        }

        public Criteria andDangzhibuLessThanOrEqualTo(String value) {
            addCriterion("DANGZHIBU <=", value, "dangzhibu");
            return (Criteria) this;
        }

        public Criteria andDangzhibuLike(String value) {
            addCriterion("DANGZHIBU like", value, "dangzhibu");
            return (Criteria) this;
        }

        public Criteria andDangzhibuNotLike(String value) {
            addCriterion("DANGZHIBU not like", value, "dangzhibu");
            return (Criteria) this;
        }

        public Criteria andDangzhibuIn(List<String> values) {
            addCriterion("DANGZHIBU in", values, "dangzhibu");
            return (Criteria) this;
        }

        public Criteria andDangzhibuNotIn(List<String> values) {
            addCriterion("DANGZHIBU not in", values, "dangzhibu");
            return (Criteria) this;
        }

        public Criteria andDangzhibuBetween(String value1, String value2) {
            addCriterion("DANGZHIBU between", value1, value2, "dangzhibu");
            return (Criteria) this;
        }

        public Criteria andDangzhibuNotBetween(String value1, String value2) {
            addCriterion("DANGZHIBU not between", value1, value2, "dangzhibu");
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