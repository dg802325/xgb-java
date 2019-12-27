package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MfNianjianJbxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MfNianjianJbxxExample() {
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

        public Criteria andMingchengIsNull() {
            addCriterion("MINGCHENG is null");
            return (Criteria) this;
        }

        public Criteria andMingchengIsNotNull() {
            addCriterion("MINGCHENG is not null");
            return (Criteria) this;
        }

        public Criteria andMingchengEqualTo(String value) {
            addCriterion("MINGCHENG =", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengNotEqualTo(String value) {
            addCriterion("MINGCHENG <>", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengGreaterThan(String value) {
            addCriterion("MINGCHENG >", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengGreaterThanOrEqualTo(String value) {
            addCriterion("MINGCHENG >=", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengLessThan(String value) {
            addCriterion("MINGCHENG <", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengLessThanOrEqualTo(String value) {
            addCriterion("MINGCHENG <=", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengLike(String value) {
            addCriterion("MINGCHENG like", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengNotLike(String value) {
            addCriterion("MINGCHENG not like", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengIn(List<String> values) {
            addCriterion("MINGCHENG in", values, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengNotIn(List<String> values) {
            addCriterion("MINGCHENG not in", values, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengBetween(String value1, String value2) {
            addCriterion("MINGCHENG between", value1, value2, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengNotBetween(String value1, String value2) {
            addCriterion("MINGCHENG not between", value1, value2, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andDengjizhenghaoIsNull() {
            addCriterion("DENGJIZHENGHAO is null");
            return (Criteria) this;
        }

        public Criteria andDengjizhenghaoIsNotNull() {
            addCriterion("DENGJIZHENGHAO is not null");
            return (Criteria) this;
        }

        public Criteria andDengjizhenghaoEqualTo(String value) {
            addCriterion("DENGJIZHENGHAO =", value, "dengjizhenghao");
            return (Criteria) this;
        }

        public Criteria andDengjizhenghaoNotEqualTo(String value) {
            addCriterion("DENGJIZHENGHAO <>", value, "dengjizhenghao");
            return (Criteria) this;
        }

        public Criteria andDengjizhenghaoGreaterThan(String value) {
            addCriterion("DENGJIZHENGHAO >", value, "dengjizhenghao");
            return (Criteria) this;
        }

        public Criteria andDengjizhenghaoGreaterThanOrEqualTo(String value) {
            addCriterion("DENGJIZHENGHAO >=", value, "dengjizhenghao");
            return (Criteria) this;
        }

        public Criteria andDengjizhenghaoLessThan(String value) {
            addCriterion("DENGJIZHENGHAO <", value, "dengjizhenghao");
            return (Criteria) this;
        }

        public Criteria andDengjizhenghaoLessThanOrEqualTo(String value) {
            addCriterion("DENGJIZHENGHAO <=", value, "dengjizhenghao");
            return (Criteria) this;
        }

        public Criteria andDengjizhenghaoLike(String value) {
            addCriterion("DENGJIZHENGHAO like", value, "dengjizhenghao");
            return (Criteria) this;
        }

        public Criteria andDengjizhenghaoNotLike(String value) {
            addCriterion("DENGJIZHENGHAO not like", value, "dengjizhenghao");
            return (Criteria) this;
        }

        public Criteria andDengjizhenghaoIn(List<String> values) {
            addCriterion("DENGJIZHENGHAO in", values, "dengjizhenghao");
            return (Criteria) this;
        }

        public Criteria andDengjizhenghaoNotIn(List<String> values) {
            addCriterion("DENGJIZHENGHAO not in", values, "dengjizhenghao");
            return (Criteria) this;
        }

        public Criteria andDengjizhenghaoBetween(String value1, String value2) {
            addCriterion("DENGJIZHENGHAO between", value1, value2, "dengjizhenghao");
            return (Criteria) this;
        }

        public Criteria andDengjizhenghaoNotBetween(String value1, String value2) {
            addCriterion("DENGJIZHENGHAO not between", value1, value2, "dengjizhenghao");
            return (Criteria) this;
        }

        public Criteria andZuzhijigoudaimaIsNull() {
            addCriterion("ZUZHIJIGOUDAIMA is null");
            return (Criteria) this;
        }

        public Criteria andZuzhijigoudaimaIsNotNull() {
            addCriterion("ZUZHIJIGOUDAIMA is not null");
            return (Criteria) this;
        }

        public Criteria andZuzhijigoudaimaEqualTo(String value) {
            addCriterion("ZUZHIJIGOUDAIMA =", value, "zuzhijigoudaima");
            return (Criteria) this;
        }

        public Criteria andZuzhijigoudaimaNotEqualTo(String value) {
            addCriterion("ZUZHIJIGOUDAIMA <>", value, "zuzhijigoudaima");
            return (Criteria) this;
        }

        public Criteria andZuzhijigoudaimaGreaterThan(String value) {
            addCriterion("ZUZHIJIGOUDAIMA >", value, "zuzhijigoudaima");
            return (Criteria) this;
        }

        public Criteria andZuzhijigoudaimaGreaterThanOrEqualTo(String value) {
            addCriterion("ZUZHIJIGOUDAIMA >=", value, "zuzhijigoudaima");
            return (Criteria) this;
        }

        public Criteria andZuzhijigoudaimaLessThan(String value) {
            addCriterion("ZUZHIJIGOUDAIMA <", value, "zuzhijigoudaima");
            return (Criteria) this;
        }

        public Criteria andZuzhijigoudaimaLessThanOrEqualTo(String value) {
            addCriterion("ZUZHIJIGOUDAIMA <=", value, "zuzhijigoudaima");
            return (Criteria) this;
        }

        public Criteria andZuzhijigoudaimaLike(String value) {
            addCriterion("ZUZHIJIGOUDAIMA like", value, "zuzhijigoudaima");
            return (Criteria) this;
        }

        public Criteria andZuzhijigoudaimaNotLike(String value) {
            addCriterion("ZUZHIJIGOUDAIMA not like", value, "zuzhijigoudaima");
            return (Criteria) this;
        }

        public Criteria andZuzhijigoudaimaIn(List<String> values) {
            addCriterion("ZUZHIJIGOUDAIMA in", values, "zuzhijigoudaima");
            return (Criteria) this;
        }

        public Criteria andZuzhijigoudaimaNotIn(List<String> values) {
            addCriterion("ZUZHIJIGOUDAIMA not in", values, "zuzhijigoudaima");
            return (Criteria) this;
        }

        public Criteria andZuzhijigoudaimaBetween(String value1, String value2) {
            addCriterion("ZUZHIJIGOUDAIMA between", value1, value2, "zuzhijigoudaima");
            return (Criteria) this;
        }

        public Criteria andZuzhijigoudaimaNotBetween(String value1, String value2) {
            addCriterion("ZUZHIJIGOUDAIMA not between", value1, value2, "zuzhijigoudaima");
            return (Criteria) this;
        }

        public Criteria andZhiyexukezhenghaoIsNull() {
            addCriterion("ZHIYEXUKEZHENGHAO is null");
            return (Criteria) this;
        }

        public Criteria andZhiyexukezhenghaoIsNotNull() {
            addCriterion("ZHIYEXUKEZHENGHAO is not null");
            return (Criteria) this;
        }

        public Criteria andZhiyexukezhenghaoEqualTo(String value) {
            addCriterion("ZHIYEXUKEZHENGHAO =", value, "zhiyexukezhenghao");
            return (Criteria) this;
        }

        public Criteria andZhiyexukezhenghaoNotEqualTo(String value) {
            addCriterion("ZHIYEXUKEZHENGHAO <>", value, "zhiyexukezhenghao");
            return (Criteria) this;
        }

        public Criteria andZhiyexukezhenghaoGreaterThan(String value) {
            addCriterion("ZHIYEXUKEZHENGHAO >", value, "zhiyexukezhenghao");
            return (Criteria) this;
        }

        public Criteria andZhiyexukezhenghaoGreaterThanOrEqualTo(String value) {
            addCriterion("ZHIYEXUKEZHENGHAO >=", value, "zhiyexukezhenghao");
            return (Criteria) this;
        }

        public Criteria andZhiyexukezhenghaoLessThan(String value) {
            addCriterion("ZHIYEXUKEZHENGHAO <", value, "zhiyexukezhenghao");
            return (Criteria) this;
        }

        public Criteria andZhiyexukezhenghaoLessThanOrEqualTo(String value) {
            addCriterion("ZHIYEXUKEZHENGHAO <=", value, "zhiyexukezhenghao");
            return (Criteria) this;
        }

        public Criteria andZhiyexukezhenghaoLike(String value) {
            addCriterion("ZHIYEXUKEZHENGHAO like", value, "zhiyexukezhenghao");
            return (Criteria) this;
        }

        public Criteria andZhiyexukezhenghaoNotLike(String value) {
            addCriterion("ZHIYEXUKEZHENGHAO not like", value, "zhiyexukezhenghao");
            return (Criteria) this;
        }

        public Criteria andZhiyexukezhenghaoIn(List<String> values) {
            addCriterion("ZHIYEXUKEZHENGHAO in", values, "zhiyexukezhenghao");
            return (Criteria) this;
        }

        public Criteria andZhiyexukezhenghaoNotIn(List<String> values) {
            addCriterion("ZHIYEXUKEZHENGHAO not in", values, "zhiyexukezhenghao");
            return (Criteria) this;
        }

        public Criteria andZhiyexukezhenghaoBetween(String value1, String value2) {
            addCriterion("ZHIYEXUKEZHENGHAO between", value1, value2, "zhiyexukezhenghao");
            return (Criteria) this;
        }

        public Criteria andZhiyexukezhenghaoNotBetween(String value1, String value2) {
            addCriterion("ZHIYEXUKEZHENGHAO not between", value1, value2, "zhiyexukezhenghao");
            return (Criteria) this;
        }

        public Criteria andChenglishijianIsNull() {
            addCriterion("CHENGLISHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andChenglishijianIsNotNull() {
            addCriterion("CHENGLISHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andChenglishijianEqualTo(Date value) {
            addCriterion("CHENGLISHIJIAN =", value, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andChenglishijianNotEqualTo(Date value) {
            addCriterion("CHENGLISHIJIAN <>", value, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andChenglishijianGreaterThan(Date value) {
            addCriterion("CHENGLISHIJIAN >", value, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andChenglishijianGreaterThanOrEqualTo(Date value) {
            addCriterion("CHENGLISHIJIAN >=", value, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andChenglishijianLessThan(Date value) {
            addCriterion("CHENGLISHIJIAN <", value, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andChenglishijianLessThanOrEqualTo(Date value) {
            addCriterion("CHENGLISHIJIAN <=", value, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andChenglishijianIn(List<Date> values) {
            addCriterion("CHENGLISHIJIAN in", values, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andChenglishijianNotIn(List<Date> values) {
            addCriterion("CHENGLISHIJIAN not in", values, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andChenglishijianBetween(Date value1, Date value2) {
            addCriterion("CHENGLISHIJIAN between", value1, value2, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andChenglishijianNotBetween(Date value1, Date value2) {
            addCriterion("CHENGLISHIJIAN not between", value1, value2, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andKaibanzijinIsNull() {
            addCriterion("KAIBANZIJIN is null");
            return (Criteria) this;
        }

        public Criteria andKaibanzijinIsNotNull() {
            addCriterion("KAIBANZIJIN is not null");
            return (Criteria) this;
        }

        public Criteria andKaibanzijinEqualTo(BigDecimal value) {
            addCriterion("KAIBANZIJIN =", value, "kaibanzijin");
            return (Criteria) this;
        }

        public Criteria andKaibanzijinNotEqualTo(BigDecimal value) {
            addCriterion("KAIBANZIJIN <>", value, "kaibanzijin");
            return (Criteria) this;
        }

        public Criteria andKaibanzijinGreaterThan(BigDecimal value) {
            addCriterion("KAIBANZIJIN >", value, "kaibanzijin");
            return (Criteria) this;
        }

        public Criteria andKaibanzijinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("KAIBANZIJIN >=", value, "kaibanzijin");
            return (Criteria) this;
        }

        public Criteria andKaibanzijinLessThan(BigDecimal value) {
            addCriterion("KAIBANZIJIN <", value, "kaibanzijin");
            return (Criteria) this;
        }

        public Criteria andKaibanzijinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("KAIBANZIJIN <=", value, "kaibanzijin");
            return (Criteria) this;
        }

        public Criteria andKaibanzijinIn(List<BigDecimal> values) {
            addCriterion("KAIBANZIJIN in", values, "kaibanzijin");
            return (Criteria) this;
        }

        public Criteria andKaibanzijinNotIn(List<BigDecimal> values) {
            addCriterion("KAIBANZIJIN not in", values, "kaibanzijin");
            return (Criteria) this;
        }

        public Criteria andKaibanzijinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KAIBANZIJIN between", value1, value2, "kaibanzijin");
            return (Criteria) this;
        }

        public Criteria andKaibanzijinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KAIBANZIJIN not between", value1, value2, "kaibanzijin");
            return (Criteria) this;
        }

        public Criteria andZhusuoIsNull() {
            addCriterion("ZHUSUO is null");
            return (Criteria) this;
        }

        public Criteria andZhusuoIsNotNull() {
            addCriterion("ZHUSUO is not null");
            return (Criteria) this;
        }

        public Criteria andZhusuoEqualTo(String value) {
            addCriterion("ZHUSUO =", value, "zhusuo");
            return (Criteria) this;
        }

        public Criteria andZhusuoNotEqualTo(String value) {
            addCriterion("ZHUSUO <>", value, "zhusuo");
            return (Criteria) this;
        }

        public Criteria andZhusuoGreaterThan(String value) {
            addCriterion("ZHUSUO >", value, "zhusuo");
            return (Criteria) this;
        }

        public Criteria andZhusuoGreaterThanOrEqualTo(String value) {
            addCriterion("ZHUSUO >=", value, "zhusuo");
            return (Criteria) this;
        }

        public Criteria andZhusuoLessThan(String value) {
            addCriterion("ZHUSUO <", value, "zhusuo");
            return (Criteria) this;
        }

        public Criteria andZhusuoLessThanOrEqualTo(String value) {
            addCriterion("ZHUSUO <=", value, "zhusuo");
            return (Criteria) this;
        }

        public Criteria andZhusuoLike(String value) {
            addCriterion("ZHUSUO like", value, "zhusuo");
            return (Criteria) this;
        }

        public Criteria andZhusuoNotLike(String value) {
            addCriterion("ZHUSUO not like", value, "zhusuo");
            return (Criteria) this;
        }

        public Criteria andZhusuoIn(List<String> values) {
            addCriterion("ZHUSUO in", values, "zhusuo");
            return (Criteria) this;
        }

        public Criteria andZhusuoNotIn(List<String> values) {
            addCriterion("ZHUSUO not in", values, "zhusuo");
            return (Criteria) this;
        }

        public Criteria andZhusuoBetween(String value1, String value2) {
            addCriterion("ZHUSUO between", value1, value2, "zhusuo");
            return (Criteria) this;
        }

        public Criteria andZhusuoNotBetween(String value1, String value2) {
            addCriterion("ZHUSUO not between", value1, value2, "zhusuo");
            return (Criteria) this;
        }

        public Criteria andZhusuoxiangxiIsNull() {
            addCriterion("ZHUSUOXIANGXI is null");
            return (Criteria) this;
        }

        public Criteria andZhusuoxiangxiIsNotNull() {
            addCriterion("ZHUSUOXIANGXI is not null");
            return (Criteria) this;
        }

        public Criteria andZhusuoxiangxiEqualTo(String value) {
            addCriterion("ZHUSUOXIANGXI =", value, "zhusuoxiangxi");
            return (Criteria) this;
        }

        public Criteria andZhusuoxiangxiNotEqualTo(String value) {
            addCriterion("ZHUSUOXIANGXI <>", value, "zhusuoxiangxi");
            return (Criteria) this;
        }

        public Criteria andZhusuoxiangxiGreaterThan(String value) {
            addCriterion("ZHUSUOXIANGXI >", value, "zhusuoxiangxi");
            return (Criteria) this;
        }

        public Criteria andZhusuoxiangxiGreaterThanOrEqualTo(String value) {
            addCriterion("ZHUSUOXIANGXI >=", value, "zhusuoxiangxi");
            return (Criteria) this;
        }

        public Criteria andZhusuoxiangxiLessThan(String value) {
            addCriterion("ZHUSUOXIANGXI <", value, "zhusuoxiangxi");
            return (Criteria) this;
        }

        public Criteria andZhusuoxiangxiLessThanOrEqualTo(String value) {
            addCriterion("ZHUSUOXIANGXI <=", value, "zhusuoxiangxi");
            return (Criteria) this;
        }

        public Criteria andZhusuoxiangxiLike(String value) {
            addCriterion("ZHUSUOXIANGXI like", value, "zhusuoxiangxi");
            return (Criteria) this;
        }

        public Criteria andZhusuoxiangxiNotLike(String value) {
            addCriterion("ZHUSUOXIANGXI not like", value, "zhusuoxiangxi");
            return (Criteria) this;
        }

        public Criteria andZhusuoxiangxiIn(List<String> values) {
            addCriterion("ZHUSUOXIANGXI in", values, "zhusuoxiangxi");
            return (Criteria) this;
        }

        public Criteria andZhusuoxiangxiNotIn(List<String> values) {
            addCriterion("ZHUSUOXIANGXI not in", values, "zhusuoxiangxi");
            return (Criteria) this;
        }

        public Criteria andZhusuoxiangxiBetween(String value1, String value2) {
            addCriterion("ZHUSUOXIANGXI between", value1, value2, "zhusuoxiangxi");
            return (Criteria) this;
        }

        public Criteria andZhusuoxiangxiNotBetween(String value1, String value2) {
            addCriterion("ZHUSUOXIANGXI not between", value1, value2, "zhusuoxiangxi");
            return (Criteria) this;
        }

        public Criteria andYouzhengbianmaIsNull() {
            addCriterion("YOUZHENGBIANMA is null");
            return (Criteria) this;
        }

        public Criteria andYouzhengbianmaIsNotNull() {
            addCriterion("YOUZHENGBIANMA is not null");
            return (Criteria) this;
        }

        public Criteria andYouzhengbianmaEqualTo(String value) {
            addCriterion("YOUZHENGBIANMA =", value, "youzhengbianma");
            return (Criteria) this;
        }

        public Criteria andYouzhengbianmaNotEqualTo(String value) {
            addCriterion("YOUZHENGBIANMA <>", value, "youzhengbianma");
            return (Criteria) this;
        }

        public Criteria andYouzhengbianmaGreaterThan(String value) {
            addCriterion("YOUZHENGBIANMA >", value, "youzhengbianma");
            return (Criteria) this;
        }

        public Criteria andYouzhengbianmaGreaterThanOrEqualTo(String value) {
            addCriterion("YOUZHENGBIANMA >=", value, "youzhengbianma");
            return (Criteria) this;
        }

        public Criteria andYouzhengbianmaLessThan(String value) {
            addCriterion("YOUZHENGBIANMA <", value, "youzhengbianma");
            return (Criteria) this;
        }

        public Criteria andYouzhengbianmaLessThanOrEqualTo(String value) {
            addCriterion("YOUZHENGBIANMA <=", value, "youzhengbianma");
            return (Criteria) this;
        }

        public Criteria andYouzhengbianmaLike(String value) {
            addCriterion("YOUZHENGBIANMA like", value, "youzhengbianma");
            return (Criteria) this;
        }

        public Criteria andYouzhengbianmaNotLike(String value) {
            addCriterion("YOUZHENGBIANMA not like", value, "youzhengbianma");
            return (Criteria) this;
        }

        public Criteria andYouzhengbianmaIn(List<String> values) {
            addCriterion("YOUZHENGBIANMA in", values, "youzhengbianma");
            return (Criteria) this;
        }

        public Criteria andYouzhengbianmaNotIn(List<String> values) {
            addCriterion("YOUZHENGBIANMA not in", values, "youzhengbianma");
            return (Criteria) this;
        }

        public Criteria andYouzhengbianmaBetween(String value1, String value2) {
            addCriterion("YOUZHENGBIANMA between", value1, value2, "youzhengbianma");
            return (Criteria) this;
        }

        public Criteria andYouzhengbianmaNotBetween(String value1, String value2) {
            addCriterion("YOUZHENGBIANMA not between", value1, value2, "youzhengbianma");
            return (Criteria) this;
        }

        public Criteria andZhusuolaiyuanIsNull() {
            addCriterion("ZHUSUOLAIYUAN is null");
            return (Criteria) this;
        }

        public Criteria andZhusuolaiyuanIsNotNull() {
            addCriterion("ZHUSUOLAIYUAN is not null");
            return (Criteria) this;
        }

        public Criteria andZhusuolaiyuanEqualTo(String value) {
            addCriterion("ZHUSUOLAIYUAN =", value, "zhusuolaiyuan");
            return (Criteria) this;
        }

        public Criteria andZhusuolaiyuanNotEqualTo(String value) {
            addCriterion("ZHUSUOLAIYUAN <>", value, "zhusuolaiyuan");
            return (Criteria) this;
        }

        public Criteria andZhusuolaiyuanGreaterThan(String value) {
            addCriterion("ZHUSUOLAIYUAN >", value, "zhusuolaiyuan");
            return (Criteria) this;
        }

        public Criteria andZhusuolaiyuanGreaterThanOrEqualTo(String value) {
            addCriterion("ZHUSUOLAIYUAN >=", value, "zhusuolaiyuan");
            return (Criteria) this;
        }

        public Criteria andZhusuolaiyuanLessThan(String value) {
            addCriterion("ZHUSUOLAIYUAN <", value, "zhusuolaiyuan");
            return (Criteria) this;
        }

        public Criteria andZhusuolaiyuanLessThanOrEqualTo(String value) {
            addCriterion("ZHUSUOLAIYUAN <=", value, "zhusuolaiyuan");
            return (Criteria) this;
        }

        public Criteria andZhusuolaiyuanLike(String value) {
            addCriterion("ZHUSUOLAIYUAN like", value, "zhusuolaiyuan");
            return (Criteria) this;
        }

        public Criteria andZhusuolaiyuanNotLike(String value) {
            addCriterion("ZHUSUOLAIYUAN not like", value, "zhusuolaiyuan");
            return (Criteria) this;
        }

        public Criteria andZhusuolaiyuanIn(List<String> values) {
            addCriterion("ZHUSUOLAIYUAN in", values, "zhusuolaiyuan");
            return (Criteria) this;
        }

        public Criteria andZhusuolaiyuanNotIn(List<String> values) {
            addCriterion("ZHUSUOLAIYUAN not in", values, "zhusuolaiyuan");
            return (Criteria) this;
        }

        public Criteria andZhusuolaiyuanBetween(String value1, String value2) {
            addCriterion("ZHUSUOLAIYUAN between", value1, value2, "zhusuolaiyuan");
            return (Criteria) this;
        }

        public Criteria andZhusuolaiyuanNotBetween(String value1, String value2) {
            addCriterion("ZHUSUOLAIYUAN not between", value1, value2, "zhusuolaiyuan");
            return (Criteria) this;
        }

        public Criteria andZulindaoqiriIsNull() {
            addCriterion("ZULINDAOQIRI is null");
            return (Criteria) this;
        }

        public Criteria andZulindaoqiriIsNotNull() {
            addCriterion("ZULINDAOQIRI is not null");
            return (Criteria) this;
        }

        public Criteria andZulindaoqiriEqualTo(Date value) {
            addCriterion("ZULINDAOQIRI =", value, "zulindaoqiri");
            return (Criteria) this;
        }

        public Criteria andZulindaoqiriNotEqualTo(Date value) {
            addCriterion("ZULINDAOQIRI <>", value, "zulindaoqiri");
            return (Criteria) this;
        }

        public Criteria andZulindaoqiriGreaterThan(Date value) {
            addCriterion("ZULINDAOQIRI >", value, "zulindaoqiri");
            return (Criteria) this;
        }

        public Criteria andZulindaoqiriGreaterThanOrEqualTo(Date value) {
            addCriterion("ZULINDAOQIRI >=", value, "zulindaoqiri");
            return (Criteria) this;
        }

        public Criteria andZulindaoqiriLessThan(Date value) {
            addCriterion("ZULINDAOQIRI <", value, "zulindaoqiri");
            return (Criteria) this;
        }

        public Criteria andZulindaoqiriLessThanOrEqualTo(Date value) {
            addCriterion("ZULINDAOQIRI <=", value, "zulindaoqiri");
            return (Criteria) this;
        }

        public Criteria andZulindaoqiriIn(List<Date> values) {
            addCriterion("ZULINDAOQIRI in", values, "zulindaoqiri");
            return (Criteria) this;
        }

        public Criteria andZulindaoqiriNotIn(List<Date> values) {
            addCriterion("ZULINDAOQIRI not in", values, "zulindaoqiri");
            return (Criteria) this;
        }

        public Criteria andZulindaoqiriBetween(Date value1, Date value2) {
            addCriterion("ZULINDAOQIRI between", value1, value2, "zulindaoqiri");
            return (Criteria) this;
        }

        public Criteria andZulindaoqiriNotBetween(Date value1, Date value2) {
            addCriterion("ZULINDAOQIRI not between", value1, value2, "zulindaoqiri");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaIsNull() {
            addCriterion("LIANXIDIANHUA is null");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaIsNotNull() {
            addCriterion("LIANXIDIANHUA is not null");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaEqualTo(String value) {
            addCriterion("LIANXIDIANHUA =", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaNotEqualTo(String value) {
            addCriterion("LIANXIDIANHUA <>", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaGreaterThan(String value) {
            addCriterion("LIANXIDIANHUA >", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaGreaterThanOrEqualTo(String value) {
            addCriterion("LIANXIDIANHUA >=", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaLessThan(String value) {
            addCriterion("LIANXIDIANHUA <", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaLessThanOrEqualTo(String value) {
            addCriterion("LIANXIDIANHUA <=", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaLike(String value) {
            addCriterion("LIANXIDIANHUA like", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaNotLike(String value) {
            addCriterion("LIANXIDIANHUA not like", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaIn(List<String> values) {
            addCriterion("LIANXIDIANHUA in", values, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaNotIn(List<String> values) {
            addCriterion("LIANXIDIANHUA not in", values, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaBetween(String value1, String value2) {
            addCriterion("LIANXIDIANHUA between", value1, value2, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaNotBetween(String value1, String value2) {
            addCriterion("LIANXIDIANHUA not between", value1, value2, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andShoujidianhuaIsNull() {
            addCriterion("SHOUJIDIANHUA is null");
            return (Criteria) this;
        }

        public Criteria andShoujidianhuaIsNotNull() {
            addCriterion("SHOUJIDIANHUA is not null");
            return (Criteria) this;
        }

        public Criteria andShoujidianhuaEqualTo(String value) {
            addCriterion("SHOUJIDIANHUA =", value, "shoujidianhua");
            return (Criteria) this;
        }

        public Criteria andShoujidianhuaNotEqualTo(String value) {
            addCriterion("SHOUJIDIANHUA <>", value, "shoujidianhua");
            return (Criteria) this;
        }

        public Criteria andShoujidianhuaGreaterThan(String value) {
            addCriterion("SHOUJIDIANHUA >", value, "shoujidianhua");
            return (Criteria) this;
        }

        public Criteria andShoujidianhuaGreaterThanOrEqualTo(String value) {
            addCriterion("SHOUJIDIANHUA >=", value, "shoujidianhua");
            return (Criteria) this;
        }

        public Criteria andShoujidianhuaLessThan(String value) {
            addCriterion("SHOUJIDIANHUA <", value, "shoujidianhua");
            return (Criteria) this;
        }

        public Criteria andShoujidianhuaLessThanOrEqualTo(String value) {
            addCriterion("SHOUJIDIANHUA <=", value, "shoujidianhua");
            return (Criteria) this;
        }

        public Criteria andShoujidianhuaLike(String value) {
            addCriterion("SHOUJIDIANHUA like", value, "shoujidianhua");
            return (Criteria) this;
        }

        public Criteria andShoujidianhuaNotLike(String value) {
            addCriterion("SHOUJIDIANHUA not like", value, "shoujidianhua");
            return (Criteria) this;
        }

        public Criteria andShoujidianhuaIn(List<String> values) {
            addCriterion("SHOUJIDIANHUA in", values, "shoujidianhua");
            return (Criteria) this;
        }

        public Criteria andShoujidianhuaNotIn(List<String> values) {
            addCriterion("SHOUJIDIANHUA not in", values, "shoujidianhua");
            return (Criteria) this;
        }

        public Criteria andShoujidianhuaBetween(String value1, String value2) {
            addCriterion("SHOUJIDIANHUA between", value1, value2, "shoujidianhua");
            return (Criteria) this;
        }

        public Criteria andShoujidianhuaNotBetween(String value1, String value2) {
            addCriterion("SHOUJIDIANHUA not between", value1, value2, "shoujidianhua");
            return (Criteria) this;
        }

        public Criteria andChuanzhenIsNull() {
            addCriterion("CHUANZHEN is null");
            return (Criteria) this;
        }

        public Criteria andChuanzhenIsNotNull() {
            addCriterion("CHUANZHEN is not null");
            return (Criteria) this;
        }

        public Criteria andChuanzhenEqualTo(String value) {
            addCriterion("CHUANZHEN =", value, "chuanzhen");
            return (Criteria) this;
        }

        public Criteria andChuanzhenNotEqualTo(String value) {
            addCriterion("CHUANZHEN <>", value, "chuanzhen");
            return (Criteria) this;
        }

        public Criteria andChuanzhenGreaterThan(String value) {
            addCriterion("CHUANZHEN >", value, "chuanzhen");
            return (Criteria) this;
        }

        public Criteria andChuanzhenGreaterThanOrEqualTo(String value) {
            addCriterion("CHUANZHEN >=", value, "chuanzhen");
            return (Criteria) this;
        }

        public Criteria andChuanzhenLessThan(String value) {
            addCriterion("CHUANZHEN <", value, "chuanzhen");
            return (Criteria) this;
        }

        public Criteria andChuanzhenLessThanOrEqualTo(String value) {
            addCriterion("CHUANZHEN <=", value, "chuanzhen");
            return (Criteria) this;
        }

        public Criteria andChuanzhenLike(String value) {
            addCriterion("CHUANZHEN like", value, "chuanzhen");
            return (Criteria) this;
        }

        public Criteria andChuanzhenNotLike(String value) {
            addCriterion("CHUANZHEN not like", value, "chuanzhen");
            return (Criteria) this;
        }

        public Criteria andChuanzhenIn(List<String> values) {
            addCriterion("CHUANZHEN in", values, "chuanzhen");
            return (Criteria) this;
        }

        public Criteria andChuanzhenNotIn(List<String> values) {
            addCriterion("CHUANZHEN not in", values, "chuanzhen");
            return (Criteria) this;
        }

        public Criteria andChuanzhenBetween(String value1, String value2) {
            addCriterion("CHUANZHEN between", value1, value2, "chuanzhen");
            return (Criteria) this;
        }

        public Criteria andChuanzhenNotBetween(String value1, String value2) {
            addCriterion("CHUANZHEN not between", value1, value2, "chuanzhen");
            return (Criteria) this;
        }

        public Criteria andWangzhandizhiIsNull() {
            addCriterion("WANGZHANDIZHI is null");
            return (Criteria) this;
        }

        public Criteria andWangzhandizhiIsNotNull() {
            addCriterion("WANGZHANDIZHI is not null");
            return (Criteria) this;
        }

        public Criteria andWangzhandizhiEqualTo(String value) {
            addCriterion("WANGZHANDIZHI =", value, "wangzhandizhi");
            return (Criteria) this;
        }

        public Criteria andWangzhandizhiNotEqualTo(String value) {
            addCriterion("WANGZHANDIZHI <>", value, "wangzhandizhi");
            return (Criteria) this;
        }

        public Criteria andWangzhandizhiGreaterThan(String value) {
            addCriterion("WANGZHANDIZHI >", value, "wangzhandizhi");
            return (Criteria) this;
        }

        public Criteria andWangzhandizhiGreaterThanOrEqualTo(String value) {
            addCriterion("WANGZHANDIZHI >=", value, "wangzhandizhi");
            return (Criteria) this;
        }

        public Criteria andWangzhandizhiLessThan(String value) {
            addCriterion("WANGZHANDIZHI <", value, "wangzhandizhi");
            return (Criteria) this;
        }

        public Criteria andWangzhandizhiLessThanOrEqualTo(String value) {
            addCriterion("WANGZHANDIZHI <=", value, "wangzhandizhi");
            return (Criteria) this;
        }

        public Criteria andWangzhandizhiLike(String value) {
            addCriterion("WANGZHANDIZHI like", value, "wangzhandizhi");
            return (Criteria) this;
        }

        public Criteria andWangzhandizhiNotLike(String value) {
            addCriterion("WANGZHANDIZHI not like", value, "wangzhandizhi");
            return (Criteria) this;
        }

        public Criteria andWangzhandizhiIn(List<String> values) {
            addCriterion("WANGZHANDIZHI in", values, "wangzhandizhi");
            return (Criteria) this;
        }

        public Criteria andWangzhandizhiNotIn(List<String> values) {
            addCriterion("WANGZHANDIZHI not in", values, "wangzhandizhi");
            return (Criteria) this;
        }

        public Criteria andWangzhandizhiBetween(String value1, String value2) {
            addCriterion("WANGZHANDIZHI between", value1, value2, "wangzhandizhi");
            return (Criteria) this;
        }

        public Criteria andWangzhandizhiNotBetween(String value1, String value2) {
            addCriterion("WANGZHANDIZHI not between", value1, value2, "wangzhandizhi");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangIsNull() {
            addCriterion("DIANZIYOUXIANG is null");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangIsNotNull() {
            addCriterion("DIANZIYOUXIANG is not null");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangEqualTo(String value) {
            addCriterion("DIANZIYOUXIANG =", value, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangNotEqualTo(String value) {
            addCriterion("DIANZIYOUXIANG <>", value, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangGreaterThan(String value) {
            addCriterion("DIANZIYOUXIANG >", value, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangGreaterThanOrEqualTo(String value) {
            addCriterion("DIANZIYOUXIANG >=", value, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangLessThan(String value) {
            addCriterion("DIANZIYOUXIANG <", value, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangLessThanOrEqualTo(String value) {
            addCriterion("DIANZIYOUXIANG <=", value, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangLike(String value) {
            addCriterion("DIANZIYOUXIANG like", value, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangNotLike(String value) {
            addCriterion("DIANZIYOUXIANG not like", value, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangIn(List<String> values) {
            addCriterion("DIANZIYOUXIANG in", values, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangNotIn(List<String> values) {
            addCriterion("DIANZIYOUXIANG not in", values, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangBetween(String value1, String value2) {
            addCriterion("DIANZIYOUXIANG between", value1, value2, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangNotBetween(String value1, String value2) {
            addCriterion("DIANZIYOUXIANG not between", value1, value2, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andFadingdaibiaorenIsNull() {
            addCriterion("FADINGDAIBIAOREN is null");
            return (Criteria) this;
        }

        public Criteria andFadingdaibiaorenIsNotNull() {
            addCriterion("FADINGDAIBIAOREN is not null");
            return (Criteria) this;
        }

        public Criteria andFadingdaibiaorenEqualTo(String value) {
            addCriterion("FADINGDAIBIAOREN =", value, "fadingdaibiaoren");
            return (Criteria) this;
        }

        public Criteria andFadingdaibiaorenNotEqualTo(String value) {
            addCriterion("FADINGDAIBIAOREN <>", value, "fadingdaibiaoren");
            return (Criteria) this;
        }

        public Criteria andFadingdaibiaorenGreaterThan(String value) {
            addCriterion("FADINGDAIBIAOREN >", value, "fadingdaibiaoren");
            return (Criteria) this;
        }

        public Criteria andFadingdaibiaorenGreaterThanOrEqualTo(String value) {
            addCriterion("FADINGDAIBIAOREN >=", value, "fadingdaibiaoren");
            return (Criteria) this;
        }

        public Criteria andFadingdaibiaorenLessThan(String value) {
            addCriterion("FADINGDAIBIAOREN <", value, "fadingdaibiaoren");
            return (Criteria) this;
        }

        public Criteria andFadingdaibiaorenLessThanOrEqualTo(String value) {
            addCriterion("FADINGDAIBIAOREN <=", value, "fadingdaibiaoren");
            return (Criteria) this;
        }

        public Criteria andFadingdaibiaorenLike(String value) {
            addCriterion("FADINGDAIBIAOREN like", value, "fadingdaibiaoren");
            return (Criteria) this;
        }

        public Criteria andFadingdaibiaorenNotLike(String value) {
            addCriterion("FADINGDAIBIAOREN not like", value, "fadingdaibiaoren");
            return (Criteria) this;
        }

        public Criteria andFadingdaibiaorenIn(List<String> values) {
            addCriterion("FADINGDAIBIAOREN in", values, "fadingdaibiaoren");
            return (Criteria) this;
        }

        public Criteria andFadingdaibiaorenNotIn(List<String> values) {
            addCriterion("FADINGDAIBIAOREN not in", values, "fadingdaibiaoren");
            return (Criteria) this;
        }

        public Criteria andFadingdaibiaorenBetween(String value1, String value2) {
            addCriterion("FADINGDAIBIAOREN between", value1, value2, "fadingdaibiaoren");
            return (Criteria) this;
        }

        public Criteria andFadingdaibiaorenNotBetween(String value1, String value2) {
            addCriterion("FADINGDAIBIAOREN not between", value1, value2, "fadingdaibiaoren");
            return (Criteria) this;
        }

        public Criteria andFarenzhiwuIsNull() {
            addCriterion("FARENZHIWU is null");
            return (Criteria) this;
        }

        public Criteria andFarenzhiwuIsNotNull() {
            addCriterion("FARENZHIWU is not null");
            return (Criteria) this;
        }

        public Criteria andFarenzhiwuEqualTo(String value) {
            addCriterion("FARENZHIWU =", value, "farenzhiwu");
            return (Criteria) this;
        }

        public Criteria andFarenzhiwuNotEqualTo(String value) {
            addCriterion("FARENZHIWU <>", value, "farenzhiwu");
            return (Criteria) this;
        }

        public Criteria andFarenzhiwuGreaterThan(String value) {
            addCriterion("FARENZHIWU >", value, "farenzhiwu");
            return (Criteria) this;
        }

        public Criteria andFarenzhiwuGreaterThanOrEqualTo(String value) {
            addCriterion("FARENZHIWU >=", value, "farenzhiwu");
            return (Criteria) this;
        }

        public Criteria andFarenzhiwuLessThan(String value) {
            addCriterion("FARENZHIWU <", value, "farenzhiwu");
            return (Criteria) this;
        }

        public Criteria andFarenzhiwuLessThanOrEqualTo(String value) {
            addCriterion("FARENZHIWU <=", value, "farenzhiwu");
            return (Criteria) this;
        }

        public Criteria andFarenzhiwuLike(String value) {
            addCriterion("FARENZHIWU like", value, "farenzhiwu");
            return (Criteria) this;
        }

        public Criteria andFarenzhiwuNotLike(String value) {
            addCriterion("FARENZHIWU not like", value, "farenzhiwu");
            return (Criteria) this;
        }

        public Criteria andFarenzhiwuIn(List<String> values) {
            addCriterion("FARENZHIWU in", values, "farenzhiwu");
            return (Criteria) this;
        }

        public Criteria andFarenzhiwuNotIn(List<String> values) {
            addCriterion("FARENZHIWU not in", values, "farenzhiwu");
            return (Criteria) this;
        }

        public Criteria andFarenzhiwuBetween(String value1, String value2) {
            addCriterion("FARENZHIWU between", value1, value2, "farenzhiwu");
            return (Criteria) this;
        }

        public Criteria andFarenzhiwuNotBetween(String value1, String value2) {
            addCriterion("FARENZHIWU not between", value1, value2, "farenzhiwu");
            return (Criteria) this;
        }

        public Criteria andChuzizheyiIsNull() {
            addCriterion("CHUZIZHEYI is null");
            return (Criteria) this;
        }

        public Criteria andChuzizheyiIsNotNull() {
            addCriterion("CHUZIZHEYI is not null");
            return (Criteria) this;
        }

        public Criteria andChuzizheyiEqualTo(String value) {
            addCriterion("CHUZIZHEYI =", value, "chuzizheyi");
            return (Criteria) this;
        }

        public Criteria andChuzizheyiNotEqualTo(String value) {
            addCriterion("CHUZIZHEYI <>", value, "chuzizheyi");
            return (Criteria) this;
        }

        public Criteria andChuzizheyiGreaterThan(String value) {
            addCriterion("CHUZIZHEYI >", value, "chuzizheyi");
            return (Criteria) this;
        }

        public Criteria andChuzizheyiGreaterThanOrEqualTo(String value) {
            addCriterion("CHUZIZHEYI >=", value, "chuzizheyi");
            return (Criteria) this;
        }

        public Criteria andChuzizheyiLessThan(String value) {
            addCriterion("CHUZIZHEYI <", value, "chuzizheyi");
            return (Criteria) this;
        }

        public Criteria andChuzizheyiLessThanOrEqualTo(String value) {
            addCriterion("CHUZIZHEYI <=", value, "chuzizheyi");
            return (Criteria) this;
        }

        public Criteria andChuzizheyiLike(String value) {
            addCriterion("CHUZIZHEYI like", value, "chuzizheyi");
            return (Criteria) this;
        }

        public Criteria andChuzizheyiNotLike(String value) {
            addCriterion("CHUZIZHEYI not like", value, "chuzizheyi");
            return (Criteria) this;
        }

        public Criteria andChuzizheyiIn(List<String> values) {
            addCriterion("CHUZIZHEYI in", values, "chuzizheyi");
            return (Criteria) this;
        }

        public Criteria andChuzizheyiNotIn(List<String> values) {
            addCriterion("CHUZIZHEYI not in", values, "chuzizheyi");
            return (Criteria) this;
        }

        public Criteria andChuzizheyiBetween(String value1, String value2) {
            addCriterion("CHUZIZHEYI between", value1, value2, "chuzizheyi");
            return (Criteria) this;
        }

        public Criteria andChuzizheyiNotBetween(String value1, String value2) {
            addCriterion("CHUZIZHEYI not between", value1, value2, "chuzizheyi");
            return (Criteria) this;
        }

        public Criteria andJineyiIsNull() {
            addCriterion("JINEYI is null");
            return (Criteria) this;
        }

        public Criteria andJineyiIsNotNull() {
            addCriterion("JINEYI is not null");
            return (Criteria) this;
        }

        public Criteria andJineyiEqualTo(BigDecimal value) {
            addCriterion("JINEYI =", value, "jineyi");
            return (Criteria) this;
        }

        public Criteria andJineyiNotEqualTo(BigDecimal value) {
            addCriterion("JINEYI <>", value, "jineyi");
            return (Criteria) this;
        }

        public Criteria andJineyiGreaterThan(BigDecimal value) {
            addCriterion("JINEYI >", value, "jineyi");
            return (Criteria) this;
        }

        public Criteria andJineyiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JINEYI >=", value, "jineyi");
            return (Criteria) this;
        }

        public Criteria andJineyiLessThan(BigDecimal value) {
            addCriterion("JINEYI <", value, "jineyi");
            return (Criteria) this;
        }

        public Criteria andJineyiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JINEYI <=", value, "jineyi");
            return (Criteria) this;
        }

        public Criteria andJineyiIn(List<BigDecimal> values) {
            addCriterion("JINEYI in", values, "jineyi");
            return (Criteria) this;
        }

        public Criteria andJineyiNotIn(List<BigDecimal> values) {
            addCriterion("JINEYI not in", values, "jineyi");
            return (Criteria) this;
        }

        public Criteria andJineyiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JINEYI between", value1, value2, "jineyi");
            return (Criteria) this;
        }

        public Criteria andJineyiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JINEYI not between", value1, value2, "jineyi");
            return (Criteria) this;
        }

        public Criteria andChuzizheerIsNull() {
            addCriterion("CHUZIZHEER is null");
            return (Criteria) this;
        }

        public Criteria andChuzizheerIsNotNull() {
            addCriterion("CHUZIZHEER is not null");
            return (Criteria) this;
        }

        public Criteria andChuzizheerEqualTo(String value) {
            addCriterion("CHUZIZHEER =", value, "chuzizheer");
            return (Criteria) this;
        }

        public Criteria andChuzizheerNotEqualTo(String value) {
            addCriterion("CHUZIZHEER <>", value, "chuzizheer");
            return (Criteria) this;
        }

        public Criteria andChuzizheerGreaterThan(String value) {
            addCriterion("CHUZIZHEER >", value, "chuzizheer");
            return (Criteria) this;
        }

        public Criteria andChuzizheerGreaterThanOrEqualTo(String value) {
            addCriterion("CHUZIZHEER >=", value, "chuzizheer");
            return (Criteria) this;
        }

        public Criteria andChuzizheerLessThan(String value) {
            addCriterion("CHUZIZHEER <", value, "chuzizheer");
            return (Criteria) this;
        }

        public Criteria andChuzizheerLessThanOrEqualTo(String value) {
            addCriterion("CHUZIZHEER <=", value, "chuzizheer");
            return (Criteria) this;
        }

        public Criteria andChuzizheerLike(String value) {
            addCriterion("CHUZIZHEER like", value, "chuzizheer");
            return (Criteria) this;
        }

        public Criteria andChuzizheerNotLike(String value) {
            addCriterion("CHUZIZHEER not like", value, "chuzizheer");
            return (Criteria) this;
        }

        public Criteria andChuzizheerIn(List<String> values) {
            addCriterion("CHUZIZHEER in", values, "chuzizheer");
            return (Criteria) this;
        }

        public Criteria andChuzizheerNotIn(List<String> values) {
            addCriterion("CHUZIZHEER not in", values, "chuzizheer");
            return (Criteria) this;
        }

        public Criteria andChuzizheerBetween(String value1, String value2) {
            addCriterion("CHUZIZHEER between", value1, value2, "chuzizheer");
            return (Criteria) this;
        }

        public Criteria andChuzizheerNotBetween(String value1, String value2) {
            addCriterion("CHUZIZHEER not between", value1, value2, "chuzizheer");
            return (Criteria) this;
        }

        public Criteria andJineerIsNull() {
            addCriterion("JINEER is null");
            return (Criteria) this;
        }

        public Criteria andJineerIsNotNull() {
            addCriterion("JINEER is not null");
            return (Criteria) this;
        }

        public Criteria andJineerEqualTo(BigDecimal value) {
            addCriterion("JINEER =", value, "jineer");
            return (Criteria) this;
        }

        public Criteria andJineerNotEqualTo(BigDecimal value) {
            addCriterion("JINEER <>", value, "jineer");
            return (Criteria) this;
        }

        public Criteria andJineerGreaterThan(BigDecimal value) {
            addCriterion("JINEER >", value, "jineer");
            return (Criteria) this;
        }

        public Criteria andJineerGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JINEER >=", value, "jineer");
            return (Criteria) this;
        }

        public Criteria andJineerLessThan(BigDecimal value) {
            addCriterion("JINEER <", value, "jineer");
            return (Criteria) this;
        }

        public Criteria andJineerLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JINEER <=", value, "jineer");
            return (Criteria) this;
        }

        public Criteria andJineerIn(List<BigDecimal> values) {
            addCriterion("JINEER in", values, "jineer");
            return (Criteria) this;
        }

        public Criteria andJineerNotIn(List<BigDecimal> values) {
            addCriterion("JINEER not in", values, "jineer");
            return (Criteria) this;
        }

        public Criteria andJineerBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JINEER between", value1, value2, "jineer");
            return (Criteria) this;
        }

        public Criteria andJineerNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JINEER not between", value1, value2, "jineer");
            return (Criteria) this;
        }

        public Criteria andChuzizhesanIsNull() {
            addCriterion("CHUZIZHESAN is null");
            return (Criteria) this;
        }

        public Criteria andChuzizhesanIsNotNull() {
            addCriterion("CHUZIZHESAN is not null");
            return (Criteria) this;
        }

        public Criteria andChuzizhesanEqualTo(String value) {
            addCriterion("CHUZIZHESAN =", value, "chuzizhesan");
            return (Criteria) this;
        }

        public Criteria andChuzizhesanNotEqualTo(String value) {
            addCriterion("CHUZIZHESAN <>", value, "chuzizhesan");
            return (Criteria) this;
        }

        public Criteria andChuzizhesanGreaterThan(String value) {
            addCriterion("CHUZIZHESAN >", value, "chuzizhesan");
            return (Criteria) this;
        }

        public Criteria andChuzizhesanGreaterThanOrEqualTo(String value) {
            addCriterion("CHUZIZHESAN >=", value, "chuzizhesan");
            return (Criteria) this;
        }

        public Criteria andChuzizhesanLessThan(String value) {
            addCriterion("CHUZIZHESAN <", value, "chuzizhesan");
            return (Criteria) this;
        }

        public Criteria andChuzizhesanLessThanOrEqualTo(String value) {
            addCriterion("CHUZIZHESAN <=", value, "chuzizhesan");
            return (Criteria) this;
        }

        public Criteria andChuzizhesanLike(String value) {
            addCriterion("CHUZIZHESAN like", value, "chuzizhesan");
            return (Criteria) this;
        }

        public Criteria andChuzizhesanNotLike(String value) {
            addCriterion("CHUZIZHESAN not like", value, "chuzizhesan");
            return (Criteria) this;
        }

        public Criteria andChuzizhesanIn(List<String> values) {
            addCriterion("CHUZIZHESAN in", values, "chuzizhesan");
            return (Criteria) this;
        }

        public Criteria andChuzizhesanNotIn(List<String> values) {
            addCriterion("CHUZIZHESAN not in", values, "chuzizhesan");
            return (Criteria) this;
        }

        public Criteria andChuzizhesanBetween(String value1, String value2) {
            addCriterion("CHUZIZHESAN between", value1, value2, "chuzizhesan");
            return (Criteria) this;
        }

        public Criteria andChuzizhesanNotBetween(String value1, String value2) {
            addCriterion("CHUZIZHESAN not between", value1, value2, "chuzizhesan");
            return (Criteria) this;
        }

        public Criteria andJinesanIsNull() {
            addCriterion("JINESAN is null");
            return (Criteria) this;
        }

        public Criteria andJinesanIsNotNull() {
            addCriterion("JINESAN is not null");
            return (Criteria) this;
        }

        public Criteria andJinesanEqualTo(BigDecimal value) {
            addCriterion("JINESAN =", value, "jinesan");
            return (Criteria) this;
        }

        public Criteria andJinesanNotEqualTo(BigDecimal value) {
            addCriterion("JINESAN <>", value, "jinesan");
            return (Criteria) this;
        }

        public Criteria andJinesanGreaterThan(BigDecimal value) {
            addCriterion("JINESAN >", value, "jinesan");
            return (Criteria) this;
        }

        public Criteria andJinesanGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JINESAN >=", value, "jinesan");
            return (Criteria) this;
        }

        public Criteria andJinesanLessThan(BigDecimal value) {
            addCriterion("JINESAN <", value, "jinesan");
            return (Criteria) this;
        }

        public Criteria andJinesanLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JINESAN <=", value, "jinesan");
            return (Criteria) this;
        }

        public Criteria andJinesanIn(List<BigDecimal> values) {
            addCriterion("JINESAN in", values, "jinesan");
            return (Criteria) this;
        }

        public Criteria andJinesanNotIn(List<BigDecimal> values) {
            addCriterion("JINESAN not in", values, "jinesan");
            return (Criteria) this;
        }

        public Criteria andJinesanBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JINESAN between", value1, value2, "jinesan");
            return (Criteria) this;
        }

        public Criteria andJinesanNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JINESAN not between", value1, value2, "jinesan");
            return (Criteria) this;
        }

        public Criteria andChuzizhesiIsNull() {
            addCriterion("CHUZIZHESI is null");
            return (Criteria) this;
        }

        public Criteria andChuzizhesiIsNotNull() {
            addCriterion("CHUZIZHESI is not null");
            return (Criteria) this;
        }

        public Criteria andChuzizhesiEqualTo(String value) {
            addCriterion("CHUZIZHESI =", value, "chuzizhesi");
            return (Criteria) this;
        }

        public Criteria andChuzizhesiNotEqualTo(String value) {
            addCriterion("CHUZIZHESI <>", value, "chuzizhesi");
            return (Criteria) this;
        }

        public Criteria andChuzizhesiGreaterThan(String value) {
            addCriterion("CHUZIZHESI >", value, "chuzizhesi");
            return (Criteria) this;
        }

        public Criteria andChuzizhesiGreaterThanOrEqualTo(String value) {
            addCriterion("CHUZIZHESI >=", value, "chuzizhesi");
            return (Criteria) this;
        }

        public Criteria andChuzizhesiLessThan(String value) {
            addCriterion("CHUZIZHESI <", value, "chuzizhesi");
            return (Criteria) this;
        }

        public Criteria andChuzizhesiLessThanOrEqualTo(String value) {
            addCriterion("CHUZIZHESI <=", value, "chuzizhesi");
            return (Criteria) this;
        }

        public Criteria andChuzizhesiLike(String value) {
            addCriterion("CHUZIZHESI like", value, "chuzizhesi");
            return (Criteria) this;
        }

        public Criteria andChuzizhesiNotLike(String value) {
            addCriterion("CHUZIZHESI not like", value, "chuzizhesi");
            return (Criteria) this;
        }

        public Criteria andChuzizhesiIn(List<String> values) {
            addCriterion("CHUZIZHESI in", values, "chuzizhesi");
            return (Criteria) this;
        }

        public Criteria andChuzizhesiNotIn(List<String> values) {
            addCriterion("CHUZIZHESI not in", values, "chuzizhesi");
            return (Criteria) this;
        }

        public Criteria andChuzizhesiBetween(String value1, String value2) {
            addCriterion("CHUZIZHESI between", value1, value2, "chuzizhesi");
            return (Criteria) this;
        }

        public Criteria andChuzizhesiNotBetween(String value1, String value2) {
            addCriterion("CHUZIZHESI not between", value1, value2, "chuzizhesi");
            return (Criteria) this;
        }

        public Criteria andJinesiIsNull() {
            addCriterion("JINESI is null");
            return (Criteria) this;
        }

        public Criteria andJinesiIsNotNull() {
            addCriterion("JINESI is not null");
            return (Criteria) this;
        }

        public Criteria andJinesiEqualTo(BigDecimal value) {
            addCriterion("JINESI =", value, "jinesi");
            return (Criteria) this;
        }

        public Criteria andJinesiNotEqualTo(BigDecimal value) {
            addCriterion("JINESI <>", value, "jinesi");
            return (Criteria) this;
        }

        public Criteria andJinesiGreaterThan(BigDecimal value) {
            addCriterion("JINESI >", value, "jinesi");
            return (Criteria) this;
        }

        public Criteria andJinesiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JINESI >=", value, "jinesi");
            return (Criteria) this;
        }

        public Criteria andJinesiLessThan(BigDecimal value) {
            addCriterion("JINESI <", value, "jinesi");
            return (Criteria) this;
        }

        public Criteria andJinesiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JINESI <=", value, "jinesi");
            return (Criteria) this;
        }

        public Criteria andJinesiIn(List<BigDecimal> values) {
            addCriterion("JINESI in", values, "jinesi");
            return (Criteria) this;
        }

        public Criteria andJinesiNotIn(List<BigDecimal> values) {
            addCriterion("JINESI not in", values, "jinesi");
            return (Criteria) this;
        }

        public Criteria andJinesiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JINESI between", value1, value2, "jinesi");
            return (Criteria) this;
        }

        public Criteria andJinesiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JINESI not between", value1, value2, "jinesi");
            return (Criteria) this;
        }

        public Criteria andChuzizhewuIsNull() {
            addCriterion("CHUZIZHEWU is null");
            return (Criteria) this;
        }

        public Criteria andChuzizhewuIsNotNull() {
            addCriterion("CHUZIZHEWU is not null");
            return (Criteria) this;
        }

        public Criteria andChuzizhewuEqualTo(String value) {
            addCriterion("CHUZIZHEWU =", value, "chuzizhewu");
            return (Criteria) this;
        }

        public Criteria andChuzizhewuNotEqualTo(String value) {
            addCriterion("CHUZIZHEWU <>", value, "chuzizhewu");
            return (Criteria) this;
        }

        public Criteria andChuzizhewuGreaterThan(String value) {
            addCriterion("CHUZIZHEWU >", value, "chuzizhewu");
            return (Criteria) this;
        }

        public Criteria andChuzizhewuGreaterThanOrEqualTo(String value) {
            addCriterion("CHUZIZHEWU >=", value, "chuzizhewu");
            return (Criteria) this;
        }

        public Criteria andChuzizhewuLessThan(String value) {
            addCriterion("CHUZIZHEWU <", value, "chuzizhewu");
            return (Criteria) this;
        }

        public Criteria andChuzizhewuLessThanOrEqualTo(String value) {
            addCriterion("CHUZIZHEWU <=", value, "chuzizhewu");
            return (Criteria) this;
        }

        public Criteria andChuzizhewuLike(String value) {
            addCriterion("CHUZIZHEWU like", value, "chuzizhewu");
            return (Criteria) this;
        }

        public Criteria andChuzizhewuNotLike(String value) {
            addCriterion("CHUZIZHEWU not like", value, "chuzizhewu");
            return (Criteria) this;
        }

        public Criteria andChuzizhewuIn(List<String> values) {
            addCriterion("CHUZIZHEWU in", values, "chuzizhewu");
            return (Criteria) this;
        }

        public Criteria andChuzizhewuNotIn(List<String> values) {
            addCriterion("CHUZIZHEWU not in", values, "chuzizhewu");
            return (Criteria) this;
        }

        public Criteria andChuzizhewuBetween(String value1, String value2) {
            addCriterion("CHUZIZHEWU between", value1, value2, "chuzizhewu");
            return (Criteria) this;
        }

        public Criteria andChuzizhewuNotBetween(String value1, String value2) {
            addCriterion("CHUZIZHEWU not between", value1, value2, "chuzizhewu");
            return (Criteria) this;
        }

        public Criteria andJinewuIsNull() {
            addCriterion("JINEWU is null");
            return (Criteria) this;
        }

        public Criteria andJinewuIsNotNull() {
            addCriterion("JINEWU is not null");
            return (Criteria) this;
        }

        public Criteria andJinewuEqualTo(BigDecimal value) {
            addCriterion("JINEWU =", value, "jinewu");
            return (Criteria) this;
        }

        public Criteria andJinewuNotEqualTo(BigDecimal value) {
            addCriterion("JINEWU <>", value, "jinewu");
            return (Criteria) this;
        }

        public Criteria andJinewuGreaterThan(BigDecimal value) {
            addCriterion("JINEWU >", value, "jinewu");
            return (Criteria) this;
        }

        public Criteria andJinewuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JINEWU >=", value, "jinewu");
            return (Criteria) this;
        }

        public Criteria andJinewuLessThan(BigDecimal value) {
            addCriterion("JINEWU <", value, "jinewu");
            return (Criteria) this;
        }

        public Criteria andJinewuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JINEWU <=", value, "jinewu");
            return (Criteria) this;
        }

        public Criteria andJinewuIn(List<BigDecimal> values) {
            addCriterion("JINEWU in", values, "jinewu");
            return (Criteria) this;
        }

        public Criteria andJinewuNotIn(List<BigDecimal> values) {
            addCriterion("JINEWU not in", values, "jinewu");
            return (Criteria) this;
        }

        public Criteria andJinewuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JINEWU between", value1, value2, "jinewu");
            return (Criteria) this;
        }

        public Criteria andJinewuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JINEWU not between", value1, value2, "jinewu");
            return (Criteria) this;
        }

        public Criteria andDongshichangxingmingIsNull() {
            addCriterion("DONGSHICHANGXINGMING is null");
            return (Criteria) this;
        }

        public Criteria andDongshichangxingmingIsNotNull() {
            addCriterion("DONGSHICHANGXINGMING is not null");
            return (Criteria) this;
        }

        public Criteria andDongshichangxingmingEqualTo(String value) {
            addCriterion("DONGSHICHANGXINGMING =", value, "dongshichangxingming");
            return (Criteria) this;
        }

        public Criteria andDongshichangxingmingNotEqualTo(String value) {
            addCriterion("DONGSHICHANGXINGMING <>", value, "dongshichangxingming");
            return (Criteria) this;
        }

        public Criteria andDongshichangxingmingGreaterThan(String value) {
            addCriterion("DONGSHICHANGXINGMING >", value, "dongshichangxingming");
            return (Criteria) this;
        }

        public Criteria andDongshichangxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("DONGSHICHANGXINGMING >=", value, "dongshichangxingming");
            return (Criteria) this;
        }

        public Criteria andDongshichangxingmingLessThan(String value) {
            addCriterion("DONGSHICHANGXINGMING <", value, "dongshichangxingming");
            return (Criteria) this;
        }

        public Criteria andDongshichangxingmingLessThanOrEqualTo(String value) {
            addCriterion("DONGSHICHANGXINGMING <=", value, "dongshichangxingming");
            return (Criteria) this;
        }

        public Criteria andDongshichangxingmingLike(String value) {
            addCriterion("DONGSHICHANGXINGMING like", value, "dongshichangxingming");
            return (Criteria) this;
        }

        public Criteria andDongshichangxingmingNotLike(String value) {
            addCriterion("DONGSHICHANGXINGMING not like", value, "dongshichangxingming");
            return (Criteria) this;
        }

        public Criteria andDongshichangxingmingIn(List<String> values) {
            addCriterion("DONGSHICHANGXINGMING in", values, "dongshichangxingming");
            return (Criteria) this;
        }

        public Criteria andDongshichangxingmingNotIn(List<String> values) {
            addCriterion("DONGSHICHANGXINGMING not in", values, "dongshichangxingming");
            return (Criteria) this;
        }

        public Criteria andDongshichangxingmingBetween(String value1, String value2) {
            addCriterion("DONGSHICHANGXINGMING between", value1, value2, "dongshichangxingming");
            return (Criteria) this;
        }

        public Criteria andDongshichangxingmingNotBetween(String value1, String value2) {
            addCriterion("DONGSHICHANGXINGMING not between", value1, value2, "dongshichangxingming");
            return (Criteria) this;
        }

        public Criteria andDongshirenshuIsNull() {
            addCriterion("DONGSHIRENSHU is null");
            return (Criteria) this;
        }

        public Criteria andDongshirenshuIsNotNull() {
            addCriterion("DONGSHIRENSHU is not null");
            return (Criteria) this;
        }

        public Criteria andDongshirenshuEqualTo(Integer value) {
            addCriterion("DONGSHIRENSHU =", value, "dongshirenshu");
            return (Criteria) this;
        }

        public Criteria andDongshirenshuNotEqualTo(Integer value) {
            addCriterion("DONGSHIRENSHU <>", value, "dongshirenshu");
            return (Criteria) this;
        }

        public Criteria andDongshirenshuGreaterThan(Integer value) {
            addCriterion("DONGSHIRENSHU >", value, "dongshirenshu");
            return (Criteria) this;
        }

        public Criteria andDongshirenshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("DONGSHIRENSHU >=", value, "dongshirenshu");
            return (Criteria) this;
        }

        public Criteria andDongshirenshuLessThan(Integer value) {
            addCriterion("DONGSHIRENSHU <", value, "dongshirenshu");
            return (Criteria) this;
        }

        public Criteria andDongshirenshuLessThanOrEqualTo(Integer value) {
            addCriterion("DONGSHIRENSHU <=", value, "dongshirenshu");
            return (Criteria) this;
        }

        public Criteria andDongshirenshuIn(List<Integer> values) {
            addCriterion("DONGSHIRENSHU in", values, "dongshirenshu");
            return (Criteria) this;
        }

        public Criteria andDongshirenshuNotIn(List<Integer> values) {
            addCriterion("DONGSHIRENSHU not in", values, "dongshirenshu");
            return (Criteria) this;
        }

        public Criteria andDongshirenshuBetween(Integer value1, Integer value2) {
            addCriterion("DONGSHIRENSHU between", value1, value2, "dongshirenshu");
            return (Criteria) this;
        }

        public Criteria andDongshirenshuNotBetween(Integer value1, Integer value2) {
            addCriterion("DONGSHIRENSHU not between", value1, value2, "dongshirenshu");
            return (Criteria) this;
        }

        public Criteria andJianshirenshuIsNull() {
            addCriterion("JIANSHIRENSHU is null");
            return (Criteria) this;
        }

        public Criteria andJianshirenshuIsNotNull() {
            addCriterion("JIANSHIRENSHU is not null");
            return (Criteria) this;
        }

        public Criteria andJianshirenshuEqualTo(Integer value) {
            addCriterion("JIANSHIRENSHU =", value, "jianshirenshu");
            return (Criteria) this;
        }

        public Criteria andJianshirenshuNotEqualTo(Integer value) {
            addCriterion("JIANSHIRENSHU <>", value, "jianshirenshu");
            return (Criteria) this;
        }

        public Criteria andJianshirenshuGreaterThan(Integer value) {
            addCriterion("JIANSHIRENSHU >", value, "jianshirenshu");
            return (Criteria) this;
        }

        public Criteria andJianshirenshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("JIANSHIRENSHU >=", value, "jianshirenshu");
            return (Criteria) this;
        }

        public Criteria andJianshirenshuLessThan(Integer value) {
            addCriterion("JIANSHIRENSHU <", value, "jianshirenshu");
            return (Criteria) this;
        }

        public Criteria andJianshirenshuLessThanOrEqualTo(Integer value) {
            addCriterion("JIANSHIRENSHU <=", value, "jianshirenshu");
            return (Criteria) this;
        }

        public Criteria andJianshirenshuIn(List<Integer> values) {
            addCriterion("JIANSHIRENSHU in", values, "jianshirenshu");
            return (Criteria) this;
        }

        public Criteria andJianshirenshuNotIn(List<Integer> values) {
            addCriterion("JIANSHIRENSHU not in", values, "jianshirenshu");
            return (Criteria) this;
        }

        public Criteria andJianshirenshuBetween(Integer value1, Integer value2) {
            addCriterion("JIANSHIRENSHU between", value1, value2, "jianshirenshu");
            return (Criteria) this;
        }

        public Criteria andJianshirenshuNotBetween(Integer value1, Integer value2) {
            addCriterion("JIANSHIRENSHU not between", value1, value2, "jianshirenshu");
            return (Criteria) this;
        }

        public Criteria andGongzuorenyuanzongshuIsNull() {
            addCriterion("GONGZUORENYUANZONGSHU is null");
            return (Criteria) this;
        }

        public Criteria andGongzuorenyuanzongshuIsNotNull() {
            addCriterion("GONGZUORENYUANZONGSHU is not null");
            return (Criteria) this;
        }

        public Criteria andGongzuorenyuanzongshuEqualTo(Integer value) {
            addCriterion("GONGZUORENYUANZONGSHU =", value, "gongzuorenyuanzongshu");
            return (Criteria) this;
        }

        public Criteria andGongzuorenyuanzongshuNotEqualTo(Integer value) {
            addCriterion("GONGZUORENYUANZONGSHU <>", value, "gongzuorenyuanzongshu");
            return (Criteria) this;
        }

        public Criteria andGongzuorenyuanzongshuGreaterThan(Integer value) {
            addCriterion("GONGZUORENYUANZONGSHU >", value, "gongzuorenyuanzongshu");
            return (Criteria) this;
        }

        public Criteria andGongzuorenyuanzongshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("GONGZUORENYUANZONGSHU >=", value, "gongzuorenyuanzongshu");
            return (Criteria) this;
        }

        public Criteria andGongzuorenyuanzongshuLessThan(Integer value) {
            addCriterion("GONGZUORENYUANZONGSHU <", value, "gongzuorenyuanzongshu");
            return (Criteria) this;
        }

        public Criteria andGongzuorenyuanzongshuLessThanOrEqualTo(Integer value) {
            addCriterion("GONGZUORENYUANZONGSHU <=", value, "gongzuorenyuanzongshu");
            return (Criteria) this;
        }

        public Criteria andGongzuorenyuanzongshuIn(List<Integer> values) {
            addCriterion("GONGZUORENYUANZONGSHU in", values, "gongzuorenyuanzongshu");
            return (Criteria) this;
        }

        public Criteria andGongzuorenyuanzongshuNotIn(List<Integer> values) {
            addCriterion("GONGZUORENYUANZONGSHU not in", values, "gongzuorenyuanzongshu");
            return (Criteria) this;
        }

        public Criteria andGongzuorenyuanzongshuBetween(Integer value1, Integer value2) {
            addCriterion("GONGZUORENYUANZONGSHU between", value1, value2, "gongzuorenyuanzongshu");
            return (Criteria) this;
        }

        public Criteria andGongzuorenyuanzongshuNotBetween(Integer value1, Integer value2) {
            addCriterion("GONGZUORENYUANZONGSHU not between", value1, value2, "gongzuorenyuanzongshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhirenyuanshuIsNull() {
            addCriterion("ZHUANZHIRENYUANSHU is null");
            return (Criteria) this;
        }

        public Criteria andZhuanzhirenyuanshuIsNotNull() {
            addCriterion("ZHUANZHIRENYUANSHU is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanzhirenyuanshuEqualTo(Integer value) {
            addCriterion("ZHUANZHIRENYUANSHU =", value, "zhuanzhirenyuanshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhirenyuanshuNotEqualTo(Integer value) {
            addCriterion("ZHUANZHIRENYUANSHU <>", value, "zhuanzhirenyuanshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhirenyuanshuGreaterThan(Integer value) {
            addCriterion("ZHUANZHIRENYUANSHU >", value, "zhuanzhirenyuanshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhirenyuanshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZHUANZHIRENYUANSHU >=", value, "zhuanzhirenyuanshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhirenyuanshuLessThan(Integer value) {
            addCriterion("ZHUANZHIRENYUANSHU <", value, "zhuanzhirenyuanshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhirenyuanshuLessThanOrEqualTo(Integer value) {
            addCriterion("ZHUANZHIRENYUANSHU <=", value, "zhuanzhirenyuanshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhirenyuanshuIn(List<Integer> values) {
            addCriterion("ZHUANZHIRENYUANSHU in", values, "zhuanzhirenyuanshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhirenyuanshuNotIn(List<Integer> values) {
            addCriterion("ZHUANZHIRENYUANSHU not in", values, "zhuanzhirenyuanshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhirenyuanshuBetween(Integer value1, Integer value2) {
            addCriterion("ZHUANZHIRENYUANSHU between", value1, value2, "zhuanzhirenyuanshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhirenyuanshuNotBetween(Integer value1, Integer value2) {
            addCriterion("ZHUANZHIRENYUANSHU not between", value1, value2, "zhuanzhirenyuanshu");
            return (Criteria) this;
        }

        public Criteria andJianzhirenyuanshuIsNull() {
            addCriterion("JIANZHIRENYUANSHU is null");
            return (Criteria) this;
        }

        public Criteria andJianzhirenyuanshuIsNotNull() {
            addCriterion("JIANZHIRENYUANSHU is not null");
            return (Criteria) this;
        }

        public Criteria andJianzhirenyuanshuEqualTo(Integer value) {
            addCriterion("JIANZHIRENYUANSHU =", value, "jianzhirenyuanshu");
            return (Criteria) this;
        }

        public Criteria andJianzhirenyuanshuNotEqualTo(Integer value) {
            addCriterion("JIANZHIRENYUANSHU <>", value, "jianzhirenyuanshu");
            return (Criteria) this;
        }

        public Criteria andJianzhirenyuanshuGreaterThan(Integer value) {
            addCriterion("JIANZHIRENYUANSHU >", value, "jianzhirenyuanshu");
            return (Criteria) this;
        }

        public Criteria andJianzhirenyuanshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("JIANZHIRENYUANSHU >=", value, "jianzhirenyuanshu");
            return (Criteria) this;
        }

        public Criteria andJianzhirenyuanshuLessThan(Integer value) {
            addCriterion("JIANZHIRENYUANSHU <", value, "jianzhirenyuanshu");
            return (Criteria) this;
        }

        public Criteria andJianzhirenyuanshuLessThanOrEqualTo(Integer value) {
            addCriterion("JIANZHIRENYUANSHU <=", value, "jianzhirenyuanshu");
            return (Criteria) this;
        }

        public Criteria andJianzhirenyuanshuIn(List<Integer> values) {
            addCriterion("JIANZHIRENYUANSHU in", values, "jianzhirenyuanshu");
            return (Criteria) this;
        }

        public Criteria andJianzhirenyuanshuNotIn(List<Integer> values) {
            addCriterion("JIANZHIRENYUANSHU not in", values, "jianzhirenyuanshu");
            return (Criteria) this;
        }

        public Criteria andJianzhirenyuanshuBetween(Integer value1, Integer value2) {
            addCriterion("JIANZHIRENYUANSHU between", value1, value2, "jianzhirenyuanshu");
            return (Criteria) this;
        }

        public Criteria andJianzhirenyuanshuNotBetween(Integer value1, Integer value2) {
            addCriterion("JIANZHIRENYUANSHU not between", value1, value2, "jianzhirenyuanshu");
            return (Criteria) this;
        }

        public Criteria andLifanpinrenshuIsNull() {
            addCriterion("LIFANPINRENSHU is null");
            return (Criteria) this;
        }

        public Criteria andLifanpinrenshuIsNotNull() {
            addCriterion("LIFANPINRENSHU is not null");
            return (Criteria) this;
        }

        public Criteria andLifanpinrenshuEqualTo(Integer value) {
            addCriterion("LIFANPINRENSHU =", value, "lifanpinrenshu");
            return (Criteria) this;
        }

        public Criteria andLifanpinrenshuNotEqualTo(Integer value) {
            addCriterion("LIFANPINRENSHU <>", value, "lifanpinrenshu");
            return (Criteria) this;
        }

        public Criteria andLifanpinrenshuGreaterThan(Integer value) {
            addCriterion("LIFANPINRENSHU >", value, "lifanpinrenshu");
            return (Criteria) this;
        }

        public Criteria andLifanpinrenshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIFANPINRENSHU >=", value, "lifanpinrenshu");
            return (Criteria) this;
        }

        public Criteria andLifanpinrenshuLessThan(Integer value) {
            addCriterion("LIFANPINRENSHU <", value, "lifanpinrenshu");
            return (Criteria) this;
        }

        public Criteria andLifanpinrenshuLessThanOrEqualTo(Integer value) {
            addCriterion("LIFANPINRENSHU <=", value, "lifanpinrenshu");
            return (Criteria) this;
        }

        public Criteria andLifanpinrenshuIn(List<Integer> values) {
            addCriterion("LIFANPINRENSHU in", values, "lifanpinrenshu");
            return (Criteria) this;
        }

        public Criteria andLifanpinrenshuNotIn(List<Integer> values) {
            addCriterion("LIFANPINRENSHU not in", values, "lifanpinrenshu");
            return (Criteria) this;
        }

        public Criteria andLifanpinrenshuBetween(Integer value1, Integer value2) {
            addCriterion("LIFANPINRENSHU between", value1, value2, "lifanpinrenshu");
            return (Criteria) this;
        }

        public Criteria andLifanpinrenshuNotBetween(Integer value1, Integer value2) {
            addCriterion("LIFANPINRENSHU not between", value1, value2, "lifanpinrenshu");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzheshuIsNull() {
            addCriterion("ZHIYUANZHESHU is null");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzheshuIsNotNull() {
            addCriterion("ZHIYUANZHESHU is not null");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzheshuEqualTo(Integer value) {
            addCriterion("ZHIYUANZHESHU =", value, "zhiyuanzheshu");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzheshuNotEqualTo(Integer value) {
            addCriterion("ZHIYUANZHESHU <>", value, "zhiyuanzheshu");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzheshuGreaterThan(Integer value) {
            addCriterion("ZHIYUANZHESHU >", value, "zhiyuanzheshu");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzheshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZHIYUANZHESHU >=", value, "zhiyuanzheshu");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzheshuLessThan(Integer value) {
            addCriterion("ZHIYUANZHESHU <", value, "zhiyuanzheshu");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzheshuLessThanOrEqualTo(Integer value) {
            addCriterion("ZHIYUANZHESHU <=", value, "zhiyuanzheshu");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzheshuIn(List<Integer> values) {
            addCriterion("ZHIYUANZHESHU in", values, "zhiyuanzheshu");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzheshuNotIn(List<Integer> values) {
            addCriterion("ZHIYUANZHESHU not in", values, "zhiyuanzheshu");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzheshuBetween(Integer value1, Integer value2) {
            addCriterion("ZHIYUANZHESHU between", value1, value2, "zhiyuanzheshu");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzheshuNotBetween(Integer value1, Integer value2) {
            addCriterion("ZHIYUANZHESHU not between", value1, value2, "zhiyuanzheshu");
            return (Criteria) this;
        }

        public Criteria andZhiyuanlaodongshijianIsNull() {
            addCriterion("ZHIYUANLAODONGSHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andZhiyuanlaodongshijianIsNotNull() {
            addCriterion("ZHIYUANLAODONGSHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andZhiyuanlaodongshijianEqualTo(Integer value) {
            addCriterion("ZHIYUANLAODONGSHIJIAN =", value, "zhiyuanlaodongshijian");
            return (Criteria) this;
        }

        public Criteria andZhiyuanlaodongshijianNotEqualTo(Integer value) {
            addCriterion("ZHIYUANLAODONGSHIJIAN <>", value, "zhiyuanlaodongshijian");
            return (Criteria) this;
        }

        public Criteria andZhiyuanlaodongshijianGreaterThan(Integer value) {
            addCriterion("ZHIYUANLAODONGSHIJIAN >", value, "zhiyuanlaodongshijian");
            return (Criteria) this;
        }

        public Criteria andZhiyuanlaodongshijianGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZHIYUANLAODONGSHIJIAN >=", value, "zhiyuanlaodongshijian");
            return (Criteria) this;
        }

        public Criteria andZhiyuanlaodongshijianLessThan(Integer value) {
            addCriterion("ZHIYUANLAODONGSHIJIAN <", value, "zhiyuanlaodongshijian");
            return (Criteria) this;
        }

        public Criteria andZhiyuanlaodongshijianLessThanOrEqualTo(Integer value) {
            addCriterion("ZHIYUANLAODONGSHIJIAN <=", value, "zhiyuanlaodongshijian");
            return (Criteria) this;
        }

        public Criteria andZhiyuanlaodongshijianIn(List<Integer> values) {
            addCriterion("ZHIYUANLAODONGSHIJIAN in", values, "zhiyuanlaodongshijian");
            return (Criteria) this;
        }

        public Criteria andZhiyuanlaodongshijianNotIn(List<Integer> values) {
            addCriterion("ZHIYUANLAODONGSHIJIAN not in", values, "zhiyuanlaodongshijian");
            return (Criteria) this;
        }

        public Criteria andZhiyuanlaodongshijianBetween(Integer value1, Integer value2) {
            addCriterion("ZHIYUANLAODONGSHIJIAN between", value1, value2, "zhiyuanlaodongshijian");
            return (Criteria) this;
        }

        public Criteria andZhiyuanlaodongshijianNotBetween(Integer value1, Integer value2) {
            addCriterion("ZHIYUANLAODONGSHIJIAN not between", value1, value2, "zhiyuanlaodongshijian");
            return (Criteria) this;
        }

        public Criteria andDangyuanrenshuIsNull() {
            addCriterion("DANGYUANRENSHU is null");
            return (Criteria) this;
        }

        public Criteria andDangyuanrenshuIsNotNull() {
            addCriterion("DANGYUANRENSHU is not null");
            return (Criteria) this;
        }

        public Criteria andDangyuanrenshuEqualTo(Integer value) {
            addCriterion("DANGYUANRENSHU =", value, "dangyuanrenshu");
            return (Criteria) this;
        }

        public Criteria andDangyuanrenshuNotEqualTo(Integer value) {
            addCriterion("DANGYUANRENSHU <>", value, "dangyuanrenshu");
            return (Criteria) this;
        }

        public Criteria andDangyuanrenshuGreaterThan(Integer value) {
            addCriterion("DANGYUANRENSHU >", value, "dangyuanrenshu");
            return (Criteria) this;
        }

        public Criteria andDangyuanrenshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("DANGYUANRENSHU >=", value, "dangyuanrenshu");
            return (Criteria) this;
        }

        public Criteria andDangyuanrenshuLessThan(Integer value) {
            addCriterion("DANGYUANRENSHU <", value, "dangyuanrenshu");
            return (Criteria) this;
        }

        public Criteria andDangyuanrenshuLessThanOrEqualTo(Integer value) {
            addCriterion("DANGYUANRENSHU <=", value, "dangyuanrenshu");
            return (Criteria) this;
        }

        public Criteria andDangyuanrenshuIn(List<Integer> values) {
            addCriterion("DANGYUANRENSHU in", values, "dangyuanrenshu");
            return (Criteria) this;
        }

        public Criteria andDangyuanrenshuNotIn(List<Integer> values) {
            addCriterion("DANGYUANRENSHU not in", values, "dangyuanrenshu");
            return (Criteria) this;
        }

        public Criteria andDangyuanrenshuBetween(Integer value1, Integer value2) {
            addCriterion("DANGYUANRENSHU between", value1, value2, "dangyuanrenshu");
            return (Criteria) this;
        }

        public Criteria andDangyuanrenshuNotBetween(Integer value1, Integer value2) {
            addCriterion("DANGYUANRENSHU not between", value1, value2, "dangyuanrenshu");
            return (Criteria) this;
        }

        public Criteria andDangjianqingkuangIsNull() {
            addCriterion("DANGJIANQINGKUANG is null");
            return (Criteria) this;
        }

        public Criteria andDangjianqingkuangIsNotNull() {
            addCriterion("DANGJIANQINGKUANG is not null");
            return (Criteria) this;
        }

        public Criteria andDangjianqingkuangEqualTo(String value) {
            addCriterion("DANGJIANQINGKUANG =", value, "dangjianqingkuang");
            return (Criteria) this;
        }

        public Criteria andDangjianqingkuangNotEqualTo(String value) {
            addCriterion("DANGJIANQINGKUANG <>", value, "dangjianqingkuang");
            return (Criteria) this;
        }

        public Criteria andDangjianqingkuangGreaterThan(String value) {
            addCriterion("DANGJIANQINGKUANG >", value, "dangjianqingkuang");
            return (Criteria) this;
        }

        public Criteria andDangjianqingkuangGreaterThanOrEqualTo(String value) {
            addCriterion("DANGJIANQINGKUANG >=", value, "dangjianqingkuang");
            return (Criteria) this;
        }

        public Criteria andDangjianqingkuangLessThan(String value) {
            addCriterion("DANGJIANQINGKUANG <", value, "dangjianqingkuang");
            return (Criteria) this;
        }

        public Criteria andDangjianqingkuangLessThanOrEqualTo(String value) {
            addCriterion("DANGJIANQINGKUANG <=", value, "dangjianqingkuang");
            return (Criteria) this;
        }

        public Criteria andDangjianqingkuangLike(String value) {
            addCriterion("DANGJIANQINGKUANG like", value, "dangjianqingkuang");
            return (Criteria) this;
        }

        public Criteria andDangjianqingkuangNotLike(String value) {
            addCriterion("DANGJIANQINGKUANG not like", value, "dangjianqingkuang");
            return (Criteria) this;
        }

        public Criteria andDangjianqingkuangIn(List<String> values) {
            addCriterion("DANGJIANQINGKUANG in", values, "dangjianqingkuang");
            return (Criteria) this;
        }

        public Criteria andDangjianqingkuangNotIn(List<String> values) {
            addCriterion("DANGJIANQINGKUANG not in", values, "dangjianqingkuang");
            return (Criteria) this;
        }

        public Criteria andDangjianqingkuangBetween(String value1, String value2) {
            addCriterion("DANGJIANQINGKUANG between", value1, value2, "dangjianqingkuang");
            return (Criteria) this;
        }

        public Criteria andDangjianqingkuangNotBetween(String value1, String value2) {
            addCriterion("DANGJIANQINGKUANG not between", value1, value2, "dangjianqingkuang");
            return (Criteria) this;
        }

        public Criteria andNeishejigoushuIsNull() {
            addCriterion("NEISHEJIGOUSHU is null");
            return (Criteria) this;
        }

        public Criteria andNeishejigoushuIsNotNull() {
            addCriterion("NEISHEJIGOUSHU is not null");
            return (Criteria) this;
        }

        public Criteria andNeishejigoushuEqualTo(Integer value) {
            addCriterion("NEISHEJIGOUSHU =", value, "neishejigoushu");
            return (Criteria) this;
        }

        public Criteria andNeishejigoushuNotEqualTo(Integer value) {
            addCriterion("NEISHEJIGOUSHU <>", value, "neishejigoushu");
            return (Criteria) this;
        }

        public Criteria andNeishejigoushuGreaterThan(Integer value) {
            addCriterion("NEISHEJIGOUSHU >", value, "neishejigoushu");
            return (Criteria) this;
        }

        public Criteria andNeishejigoushuGreaterThanOrEqualTo(Integer value) {
            addCriterion("NEISHEJIGOUSHU >=", value, "neishejigoushu");
            return (Criteria) this;
        }

        public Criteria andNeishejigoushuLessThan(Integer value) {
            addCriterion("NEISHEJIGOUSHU <", value, "neishejigoushu");
            return (Criteria) this;
        }

        public Criteria andNeishejigoushuLessThanOrEqualTo(Integer value) {
            addCriterion("NEISHEJIGOUSHU <=", value, "neishejigoushu");
            return (Criteria) this;
        }

        public Criteria andNeishejigoushuIn(List<Integer> values) {
            addCriterion("NEISHEJIGOUSHU in", values, "neishejigoushu");
            return (Criteria) this;
        }

        public Criteria andNeishejigoushuNotIn(List<Integer> values) {
            addCriterion("NEISHEJIGOUSHU not in", values, "neishejigoushu");
            return (Criteria) this;
        }

        public Criteria andNeishejigoushuBetween(Integer value1, Integer value2) {
            addCriterion("NEISHEJIGOUSHU between", value1, value2, "neishejigoushu");
            return (Criteria) this;
        }

        public Criteria andNeishejigoushuNotBetween(Integer value1, Integer value2) {
            addCriterion("NEISHEJIGOUSHU not between", value1, value2, "neishejigoushu");
            return (Criteria) this;
        }

        public Criteria andGongkaikanwushuIsNull() {
            addCriterion("GONGKAIKANWUSHU is null");
            return (Criteria) this;
        }

        public Criteria andGongkaikanwushuIsNotNull() {
            addCriterion("GONGKAIKANWUSHU is not null");
            return (Criteria) this;
        }

        public Criteria andGongkaikanwushuEqualTo(Integer value) {
            addCriterion("GONGKAIKANWUSHU =", value, "gongkaikanwushu");
            return (Criteria) this;
        }

        public Criteria andGongkaikanwushuNotEqualTo(Integer value) {
            addCriterion("GONGKAIKANWUSHU <>", value, "gongkaikanwushu");
            return (Criteria) this;
        }

        public Criteria andGongkaikanwushuGreaterThan(Integer value) {
            addCriterion("GONGKAIKANWUSHU >", value, "gongkaikanwushu");
            return (Criteria) this;
        }

        public Criteria andGongkaikanwushuGreaterThanOrEqualTo(Integer value) {
            addCriterion("GONGKAIKANWUSHU >=", value, "gongkaikanwushu");
            return (Criteria) this;
        }

        public Criteria andGongkaikanwushuLessThan(Integer value) {
            addCriterion("GONGKAIKANWUSHU <", value, "gongkaikanwushu");
            return (Criteria) this;
        }

        public Criteria andGongkaikanwushuLessThanOrEqualTo(Integer value) {
            addCriterion("GONGKAIKANWUSHU <=", value, "gongkaikanwushu");
            return (Criteria) this;
        }

        public Criteria andGongkaikanwushuIn(List<Integer> values) {
            addCriterion("GONGKAIKANWUSHU in", values, "gongkaikanwushu");
            return (Criteria) this;
        }

        public Criteria andGongkaikanwushuNotIn(List<Integer> values) {
            addCriterion("GONGKAIKANWUSHU not in", values, "gongkaikanwushu");
            return (Criteria) this;
        }

        public Criteria andGongkaikanwushuBetween(Integer value1, Integer value2) {
            addCriterion("GONGKAIKANWUSHU between", value1, value2, "gongkaikanwushu");
            return (Criteria) this;
        }

        public Criteria andGongkaikanwushuNotBetween(Integer value1, Integer value2) {
            addCriterion("GONGKAIKANWUSHU not between", value1, value2, "gongkaikanwushu");
            return (Criteria) this;
        }

        public Criteria andNeibuziliaoshuIsNull() {
            addCriterion("NEIBUZILIAOSHU is null");
            return (Criteria) this;
        }

        public Criteria andNeibuziliaoshuIsNotNull() {
            addCriterion("NEIBUZILIAOSHU is not null");
            return (Criteria) this;
        }

        public Criteria andNeibuziliaoshuEqualTo(Integer value) {
            addCriterion("NEIBUZILIAOSHU =", value, "neibuziliaoshu");
            return (Criteria) this;
        }

        public Criteria andNeibuziliaoshuNotEqualTo(Integer value) {
            addCriterion("NEIBUZILIAOSHU <>", value, "neibuziliaoshu");
            return (Criteria) this;
        }

        public Criteria andNeibuziliaoshuGreaterThan(Integer value) {
            addCriterion("NEIBUZILIAOSHU >", value, "neibuziliaoshu");
            return (Criteria) this;
        }

        public Criteria andNeibuziliaoshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("NEIBUZILIAOSHU >=", value, "neibuziliaoshu");
            return (Criteria) this;
        }

        public Criteria andNeibuziliaoshuLessThan(Integer value) {
            addCriterion("NEIBUZILIAOSHU <", value, "neibuziliaoshu");
            return (Criteria) this;
        }

        public Criteria andNeibuziliaoshuLessThanOrEqualTo(Integer value) {
            addCriterion("NEIBUZILIAOSHU <=", value, "neibuziliaoshu");
            return (Criteria) this;
        }

        public Criteria andNeibuziliaoshuIn(List<Integer> values) {
            addCriterion("NEIBUZILIAOSHU in", values, "neibuziliaoshu");
            return (Criteria) this;
        }

        public Criteria andNeibuziliaoshuNotIn(List<Integer> values) {
            addCriterion("NEIBUZILIAOSHU not in", values, "neibuziliaoshu");
            return (Criteria) this;
        }

        public Criteria andNeibuziliaoshuBetween(Integer value1, Integer value2) {
            addCriterion("NEIBUZILIAOSHU between", value1, value2, "neibuziliaoshu");
            return (Criteria) this;
        }

        public Criteria andNeibuziliaoshuNotBetween(Integer value1, Integer value2) {
            addCriterion("NEIBUZILIAOSHU not between", value1, value2, "neibuziliaoshu");
            return (Criteria) this;
        }

        public Criteria andYewuzhuguandanweiIsNull() {
            addCriterion("YEWUZHUGUANDANWEI is null");
            return (Criteria) this;
        }

        public Criteria andYewuzhuguandanweiIsNotNull() {
            addCriterion("YEWUZHUGUANDANWEI is not null");
            return (Criteria) this;
        }

        public Criteria andYewuzhuguandanweiEqualTo(String value) {
            addCriterion("YEWUZHUGUANDANWEI =", value, "yewuzhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andYewuzhuguandanweiNotEqualTo(String value) {
            addCriterion("YEWUZHUGUANDANWEI <>", value, "yewuzhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andYewuzhuguandanweiGreaterThan(String value) {
            addCriterion("YEWUZHUGUANDANWEI >", value, "yewuzhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andYewuzhuguandanweiGreaterThanOrEqualTo(String value) {
            addCriterion("YEWUZHUGUANDANWEI >=", value, "yewuzhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andYewuzhuguandanweiLessThan(String value) {
            addCriterion("YEWUZHUGUANDANWEI <", value, "yewuzhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andYewuzhuguandanweiLessThanOrEqualTo(String value) {
            addCriterion("YEWUZHUGUANDANWEI <=", value, "yewuzhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andYewuzhuguandanweiLike(String value) {
            addCriterion("YEWUZHUGUANDANWEI like", value, "yewuzhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andYewuzhuguandanweiNotLike(String value) {
            addCriterion("YEWUZHUGUANDANWEI not like", value, "yewuzhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andYewuzhuguandanweiIn(List<String> values) {
            addCriterion("YEWUZHUGUANDANWEI in", values, "yewuzhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andYewuzhuguandanweiNotIn(List<String> values) {
            addCriterion("YEWUZHUGUANDANWEI not in", values, "yewuzhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andYewuzhuguandanweiBetween(String value1, String value2) {
            addCriterion("YEWUZHUGUANDANWEI between", value1, value2, "yewuzhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andYewuzhuguandanweiNotBetween(String value1, String value2) {
            addCriterion("YEWUZHUGUANDANWEI not between", value1, value2, "yewuzhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andDianhuaIsNull() {
            addCriterion("DIANHUA is null");
            return (Criteria) this;
        }

        public Criteria andDianhuaIsNotNull() {
            addCriterion("DIANHUA is not null");
            return (Criteria) this;
        }

        public Criteria andDianhuaEqualTo(String value) {
            addCriterion("DIANHUA =", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaNotEqualTo(String value) {
            addCriterion("DIANHUA <>", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaGreaterThan(String value) {
            addCriterion("DIANHUA >", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaGreaterThanOrEqualTo(String value) {
            addCriterion("DIANHUA >=", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaLessThan(String value) {
            addCriterion("DIANHUA <", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaLessThanOrEqualTo(String value) {
            addCriterion("DIANHUA <=", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaLike(String value) {
            addCriterion("DIANHUA like", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaNotLike(String value) {
            addCriterion("DIANHUA not like", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaIn(List<String> values) {
            addCriterion("DIANHUA in", values, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaNotIn(List<String> values) {
            addCriterion("DIANHUA not in", values, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaBetween(String value1, String value2) {
            addCriterion("DIANHUA between", value1, value2, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaNotBetween(String value1, String value2) {
            addCriterion("DIANHUA not between", value1, value2, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiIsNull() {
            addCriterion("DANWEIXINGZHI is null");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiIsNotNull() {
            addCriterion("DANWEIXINGZHI is not null");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiEqualTo(String value) {
            addCriterion("DANWEIXINGZHI =", value, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiNotEqualTo(String value) {
            addCriterion("DANWEIXINGZHI <>", value, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiGreaterThan(String value) {
            addCriterion("DANWEIXINGZHI >", value, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiGreaterThanOrEqualTo(String value) {
            addCriterion("DANWEIXINGZHI >=", value, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiLessThan(String value) {
            addCriterion("DANWEIXINGZHI <", value, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiLessThanOrEqualTo(String value) {
            addCriterion("DANWEIXINGZHI <=", value, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiLike(String value) {
            addCriterion("DANWEIXINGZHI like", value, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiNotLike(String value) {
            addCriterion("DANWEIXINGZHI not like", value, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiIn(List<String> values) {
            addCriterion("DANWEIXINGZHI in", values, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiNotIn(List<String> values) {
            addCriterion("DANWEIXINGZHI not in", values, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiBetween(String value1, String value2) {
            addCriterion("DANWEIXINGZHI between", value1, value2, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiNotBetween(String value1, String value2) {
            addCriterion("DANWEIXINGZHI not between", value1, value2, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andYewufanweiIsNull() {
            addCriterion("YEWUFANWEI is null");
            return (Criteria) this;
        }

        public Criteria andYewufanweiIsNotNull() {
            addCriterion("YEWUFANWEI is not null");
            return (Criteria) this;
        }

        public Criteria andYewufanweiEqualTo(String value) {
            addCriterion("YEWUFANWEI =", value, "yewufanwei");
            return (Criteria) this;
        }

        public Criteria andYewufanweiNotEqualTo(String value) {
            addCriterion("YEWUFANWEI <>", value, "yewufanwei");
            return (Criteria) this;
        }

        public Criteria andYewufanweiGreaterThan(String value) {
            addCriterion("YEWUFANWEI >", value, "yewufanwei");
            return (Criteria) this;
        }

        public Criteria andYewufanweiGreaterThanOrEqualTo(String value) {
            addCriterion("YEWUFANWEI >=", value, "yewufanwei");
            return (Criteria) this;
        }

        public Criteria andYewufanweiLessThan(String value) {
            addCriterion("YEWUFANWEI <", value, "yewufanwei");
            return (Criteria) this;
        }

        public Criteria andYewufanweiLessThanOrEqualTo(String value) {
            addCriterion("YEWUFANWEI <=", value, "yewufanwei");
            return (Criteria) this;
        }

        public Criteria andYewufanweiLike(String value) {
            addCriterion("YEWUFANWEI like", value, "yewufanwei");
            return (Criteria) this;
        }

        public Criteria andYewufanweiNotLike(String value) {
            addCriterion("YEWUFANWEI not like", value, "yewufanwei");
            return (Criteria) this;
        }

        public Criteria andYewufanweiIn(List<String> values) {
            addCriterion("YEWUFANWEI in", values, "yewufanwei");
            return (Criteria) this;
        }

        public Criteria andYewufanweiNotIn(List<String> values) {
            addCriterion("YEWUFANWEI not in", values, "yewufanwei");
            return (Criteria) this;
        }

        public Criteria andYewufanweiBetween(String value1, String value2) {
            addCriterion("YEWUFANWEI between", value1, value2, "yewufanwei");
            return (Criteria) this;
        }

        public Criteria andYewufanweiNotBetween(String value1, String value2) {
            addCriterion("YEWUFANWEI not between", value1, value2, "yewufanwei");
            return (Criteria) this;
        }

        public Criteria andXingyefenleiIsNull() {
            addCriterion("XINGYEFENLEI is null");
            return (Criteria) this;
        }

        public Criteria andXingyefenleiIsNotNull() {
            addCriterion("XINGYEFENLEI is not null");
            return (Criteria) this;
        }

        public Criteria andXingyefenleiEqualTo(String value) {
            addCriterion("XINGYEFENLEI =", value, "xingyefenlei");
            return (Criteria) this;
        }

        public Criteria andXingyefenleiNotEqualTo(String value) {
            addCriterion("XINGYEFENLEI <>", value, "xingyefenlei");
            return (Criteria) this;
        }

        public Criteria andXingyefenleiGreaterThan(String value) {
            addCriterion("XINGYEFENLEI >", value, "xingyefenlei");
            return (Criteria) this;
        }

        public Criteria andXingyefenleiGreaterThanOrEqualTo(String value) {
            addCriterion("XINGYEFENLEI >=", value, "xingyefenlei");
            return (Criteria) this;
        }

        public Criteria andXingyefenleiLessThan(String value) {
            addCriterion("XINGYEFENLEI <", value, "xingyefenlei");
            return (Criteria) this;
        }

        public Criteria andXingyefenleiLessThanOrEqualTo(String value) {
            addCriterion("XINGYEFENLEI <=", value, "xingyefenlei");
            return (Criteria) this;
        }

        public Criteria andXingyefenleiLike(String value) {
            addCriterion("XINGYEFENLEI like", value, "xingyefenlei");
            return (Criteria) this;
        }

        public Criteria andXingyefenleiNotLike(String value) {
            addCriterion("XINGYEFENLEI not like", value, "xingyefenlei");
            return (Criteria) this;
        }

        public Criteria andXingyefenleiIn(List<String> values) {
            addCriterion("XINGYEFENLEI in", values, "xingyefenlei");
            return (Criteria) this;
        }

        public Criteria andXingyefenleiNotIn(List<String> values) {
            addCriterion("XINGYEFENLEI not in", values, "xingyefenlei");
            return (Criteria) this;
        }

        public Criteria andXingyefenleiBetween(String value1, String value2) {
            addCriterion("XINGYEFENLEI between", value1, value2, "xingyefenlei");
            return (Criteria) this;
        }

        public Criteria andXingyefenleiNotBetween(String value1, String value2) {
            addCriterion("XINGYEFENLEI not between", value1, value2, "xingyefenlei");
            return (Criteria) this;
        }

        public Criteria andFarenxingbieIsNull() {
            addCriterion("FARENXINGBIE is null");
            return (Criteria) this;
        }

        public Criteria andFarenxingbieIsNotNull() {
            addCriterion("FARENXINGBIE is not null");
            return (Criteria) this;
        }

        public Criteria andFarenxingbieEqualTo(String value) {
            addCriterion("FARENXINGBIE =", value, "farenxingbie");
            return (Criteria) this;
        }

        public Criteria andFarenxingbieNotEqualTo(String value) {
            addCriterion("FARENXINGBIE <>", value, "farenxingbie");
            return (Criteria) this;
        }

        public Criteria andFarenxingbieGreaterThan(String value) {
            addCriterion("FARENXINGBIE >", value, "farenxingbie");
            return (Criteria) this;
        }

        public Criteria andFarenxingbieGreaterThanOrEqualTo(String value) {
            addCriterion("FARENXINGBIE >=", value, "farenxingbie");
            return (Criteria) this;
        }

        public Criteria andFarenxingbieLessThan(String value) {
            addCriterion("FARENXINGBIE <", value, "farenxingbie");
            return (Criteria) this;
        }

        public Criteria andFarenxingbieLessThanOrEqualTo(String value) {
            addCriterion("FARENXINGBIE <=", value, "farenxingbie");
            return (Criteria) this;
        }

        public Criteria andFarenxingbieLike(String value) {
            addCriterion("FARENXINGBIE like", value, "farenxingbie");
            return (Criteria) this;
        }

        public Criteria andFarenxingbieNotLike(String value) {
            addCriterion("FARENXINGBIE not like", value, "farenxingbie");
            return (Criteria) this;
        }

        public Criteria andFarenxingbieIn(List<String> values) {
            addCriterion("FARENXINGBIE in", values, "farenxingbie");
            return (Criteria) this;
        }

        public Criteria andFarenxingbieNotIn(List<String> values) {
            addCriterion("FARENXINGBIE not in", values, "farenxingbie");
            return (Criteria) this;
        }

        public Criteria andFarenxingbieBetween(String value1, String value2) {
            addCriterion("FARENXINGBIE between", value1, value2, "farenxingbie");
            return (Criteria) this;
        }

        public Criteria andFarenxingbieNotBetween(String value1, String value2) {
            addCriterion("FARENXINGBIE not between", value1, value2, "farenxingbie");
            return (Criteria) this;
        }

        public Criteria andFarenshengriIsNull() {
            addCriterion("FARENSHENGRI is null");
            return (Criteria) this;
        }

        public Criteria andFarenshengriIsNotNull() {
            addCriterion("FARENSHENGRI is not null");
            return (Criteria) this;
        }

        public Criteria andFarenshengriEqualTo(Date value) {
            addCriterion("FARENSHENGRI =", value, "farenshengri");
            return (Criteria) this;
        }

        public Criteria andFarenshengriNotEqualTo(Date value) {
            addCriterion("FARENSHENGRI <>", value, "farenshengri");
            return (Criteria) this;
        }

        public Criteria andFarenshengriGreaterThan(Date value) {
            addCriterion("FARENSHENGRI >", value, "farenshengri");
            return (Criteria) this;
        }

        public Criteria andFarenshengriGreaterThanOrEqualTo(Date value) {
            addCriterion("FARENSHENGRI >=", value, "farenshengri");
            return (Criteria) this;
        }

        public Criteria andFarenshengriLessThan(Date value) {
            addCriterion("FARENSHENGRI <", value, "farenshengri");
            return (Criteria) this;
        }

        public Criteria andFarenshengriLessThanOrEqualTo(Date value) {
            addCriterion("FARENSHENGRI <=", value, "farenshengri");
            return (Criteria) this;
        }

        public Criteria andFarenshengriIn(List<Date> values) {
            addCriterion("FARENSHENGRI in", values, "farenshengri");
            return (Criteria) this;
        }

        public Criteria andFarenshengriNotIn(List<Date> values) {
            addCriterion("FARENSHENGRI not in", values, "farenshengri");
            return (Criteria) this;
        }

        public Criteria andFarenshengriBetween(Date value1, Date value2) {
            addCriterion("FARENSHENGRI between", value1, value2, "farenshengri");
            return (Criteria) this;
        }

        public Criteria andFarenshengriNotBetween(Date value1, Date value2) {
            addCriterion("FARENSHENGRI not between", value1, value2, "farenshengri");
            return (Criteria) this;
        }

        public Criteria andFarenmianmaoIsNull() {
            addCriterion("FARENMIANMAO is null");
            return (Criteria) this;
        }

        public Criteria andFarenmianmaoIsNotNull() {
            addCriterion("FARENMIANMAO is not null");
            return (Criteria) this;
        }

        public Criteria andFarenmianmaoEqualTo(String value) {
            addCriterion("FARENMIANMAO =", value, "farenmianmao");
            return (Criteria) this;
        }

        public Criteria andFarenmianmaoNotEqualTo(String value) {
            addCriterion("FARENMIANMAO <>", value, "farenmianmao");
            return (Criteria) this;
        }

        public Criteria andFarenmianmaoGreaterThan(String value) {
            addCriterion("FARENMIANMAO >", value, "farenmianmao");
            return (Criteria) this;
        }

        public Criteria andFarenmianmaoGreaterThanOrEqualTo(String value) {
            addCriterion("FARENMIANMAO >=", value, "farenmianmao");
            return (Criteria) this;
        }

        public Criteria andFarenmianmaoLessThan(String value) {
            addCriterion("FARENMIANMAO <", value, "farenmianmao");
            return (Criteria) this;
        }

        public Criteria andFarenmianmaoLessThanOrEqualTo(String value) {
            addCriterion("FARENMIANMAO <=", value, "farenmianmao");
            return (Criteria) this;
        }

        public Criteria andFarenmianmaoLike(String value) {
            addCriterion("FARENMIANMAO like", value, "farenmianmao");
            return (Criteria) this;
        }

        public Criteria andFarenmianmaoNotLike(String value) {
            addCriterion("FARENMIANMAO not like", value, "farenmianmao");
            return (Criteria) this;
        }

        public Criteria andFarenmianmaoIn(List<String> values) {
            addCriterion("FARENMIANMAO in", values, "farenmianmao");
            return (Criteria) this;
        }

        public Criteria andFarenmianmaoNotIn(List<String> values) {
            addCriterion("FARENMIANMAO not in", values, "farenmianmao");
            return (Criteria) this;
        }

        public Criteria andFarenmianmaoBetween(String value1, String value2) {
            addCriterion("FARENMIANMAO between", value1, value2, "farenmianmao");
            return (Criteria) this;
        }

        public Criteria andFarenmianmaoNotBetween(String value1, String value2) {
            addCriterion("FARENMIANMAO not between", value1, value2, "farenmianmao");
            return (Criteria) this;
        }

        public Criteria andFarenxueliIsNull() {
            addCriterion("FARENXUELI is null");
            return (Criteria) this;
        }

        public Criteria andFarenxueliIsNotNull() {
            addCriterion("FARENXUELI is not null");
            return (Criteria) this;
        }

        public Criteria andFarenxueliEqualTo(String value) {
            addCriterion("FARENXUELI =", value, "farenxueli");
            return (Criteria) this;
        }

        public Criteria andFarenxueliNotEqualTo(String value) {
            addCriterion("FARENXUELI <>", value, "farenxueli");
            return (Criteria) this;
        }

        public Criteria andFarenxueliGreaterThan(String value) {
            addCriterion("FARENXUELI >", value, "farenxueli");
            return (Criteria) this;
        }

        public Criteria andFarenxueliGreaterThanOrEqualTo(String value) {
            addCriterion("FARENXUELI >=", value, "farenxueli");
            return (Criteria) this;
        }

        public Criteria andFarenxueliLessThan(String value) {
            addCriterion("FARENXUELI <", value, "farenxueli");
            return (Criteria) this;
        }

        public Criteria andFarenxueliLessThanOrEqualTo(String value) {
            addCriterion("FARENXUELI <=", value, "farenxueli");
            return (Criteria) this;
        }

        public Criteria andFarenxueliLike(String value) {
            addCriterion("FARENXUELI like", value, "farenxueli");
            return (Criteria) this;
        }

        public Criteria andFarenxueliNotLike(String value) {
            addCriterion("FARENXUELI not like", value, "farenxueli");
            return (Criteria) this;
        }

        public Criteria andFarenxueliIn(List<String> values) {
            addCriterion("FARENXUELI in", values, "farenxueli");
            return (Criteria) this;
        }

        public Criteria andFarenxueliNotIn(List<String> values) {
            addCriterion("FARENXUELI not in", values, "farenxueli");
            return (Criteria) this;
        }

        public Criteria andFarenxueliBetween(String value1, String value2) {
            addCriterion("FARENXUELI between", value1, value2, "farenxueli");
            return (Criteria) this;
        }

        public Criteria andFarenxueliNotBetween(String value1, String value2) {
            addCriterion("FARENXUELI not between", value1, value2, "farenxueli");
            return (Criteria) this;
        }

        public Criteria andDongshichangxingbieIsNull() {
            addCriterion("DONGSHICHANGXINGBIE is null");
            return (Criteria) this;
        }

        public Criteria andDongshichangxingbieIsNotNull() {
            addCriterion("DONGSHICHANGXINGBIE is not null");
            return (Criteria) this;
        }

        public Criteria andDongshichangxingbieEqualTo(String value) {
            addCriterion("DONGSHICHANGXINGBIE =", value, "dongshichangxingbie");
            return (Criteria) this;
        }

        public Criteria andDongshichangxingbieNotEqualTo(String value) {
            addCriterion("DONGSHICHANGXINGBIE <>", value, "dongshichangxingbie");
            return (Criteria) this;
        }

        public Criteria andDongshichangxingbieGreaterThan(String value) {
            addCriterion("DONGSHICHANGXINGBIE >", value, "dongshichangxingbie");
            return (Criteria) this;
        }

        public Criteria andDongshichangxingbieGreaterThanOrEqualTo(String value) {
            addCriterion("DONGSHICHANGXINGBIE >=", value, "dongshichangxingbie");
            return (Criteria) this;
        }

        public Criteria andDongshichangxingbieLessThan(String value) {
            addCriterion("DONGSHICHANGXINGBIE <", value, "dongshichangxingbie");
            return (Criteria) this;
        }

        public Criteria andDongshichangxingbieLessThanOrEqualTo(String value) {
            addCriterion("DONGSHICHANGXINGBIE <=", value, "dongshichangxingbie");
            return (Criteria) this;
        }

        public Criteria andDongshichangxingbieLike(String value) {
            addCriterion("DONGSHICHANGXINGBIE like", value, "dongshichangxingbie");
            return (Criteria) this;
        }

        public Criteria andDongshichangxingbieNotLike(String value) {
            addCriterion("DONGSHICHANGXINGBIE not like", value, "dongshichangxingbie");
            return (Criteria) this;
        }

        public Criteria andDongshichangxingbieIn(List<String> values) {
            addCriterion("DONGSHICHANGXINGBIE in", values, "dongshichangxingbie");
            return (Criteria) this;
        }

        public Criteria andDongshichangxingbieNotIn(List<String> values) {
            addCriterion("DONGSHICHANGXINGBIE not in", values, "dongshichangxingbie");
            return (Criteria) this;
        }

        public Criteria andDongshichangxingbieBetween(String value1, String value2) {
            addCriterion("DONGSHICHANGXINGBIE between", value1, value2, "dongshichangxingbie");
            return (Criteria) this;
        }

        public Criteria andDongshichangxingbieNotBetween(String value1, String value2) {
            addCriterion("DONGSHICHANGXINGBIE not between", value1, value2, "dongshichangxingbie");
            return (Criteria) this;
        }

        public Criteria andDongshichangshengriIsNull() {
            addCriterion("DONGSHICHANGSHENGRI is null");
            return (Criteria) this;
        }

        public Criteria andDongshichangshengriIsNotNull() {
            addCriterion("DONGSHICHANGSHENGRI is not null");
            return (Criteria) this;
        }

        public Criteria andDongshichangshengriEqualTo(Date value) {
            addCriterion("DONGSHICHANGSHENGRI =", value, "dongshichangshengri");
            return (Criteria) this;
        }

        public Criteria andDongshichangshengriNotEqualTo(Date value) {
            addCriterion("DONGSHICHANGSHENGRI <>", value, "dongshichangshengri");
            return (Criteria) this;
        }

        public Criteria andDongshichangshengriGreaterThan(Date value) {
            addCriterion("DONGSHICHANGSHENGRI >", value, "dongshichangshengri");
            return (Criteria) this;
        }

        public Criteria andDongshichangshengriGreaterThanOrEqualTo(Date value) {
            addCriterion("DONGSHICHANGSHENGRI >=", value, "dongshichangshengri");
            return (Criteria) this;
        }

        public Criteria andDongshichangshengriLessThan(Date value) {
            addCriterion("DONGSHICHANGSHENGRI <", value, "dongshichangshengri");
            return (Criteria) this;
        }

        public Criteria andDongshichangshengriLessThanOrEqualTo(Date value) {
            addCriterion("DONGSHICHANGSHENGRI <=", value, "dongshichangshengri");
            return (Criteria) this;
        }

        public Criteria andDongshichangshengriIn(List<Date> values) {
            addCriterion("DONGSHICHANGSHENGRI in", values, "dongshichangshengri");
            return (Criteria) this;
        }

        public Criteria andDongshichangshengriNotIn(List<Date> values) {
            addCriterion("DONGSHICHANGSHENGRI not in", values, "dongshichangshengri");
            return (Criteria) this;
        }

        public Criteria andDongshichangshengriBetween(Date value1, Date value2) {
            addCriterion("DONGSHICHANGSHENGRI between", value1, value2, "dongshichangshengri");
            return (Criteria) this;
        }

        public Criteria andDongshichangshengriNotBetween(Date value1, Date value2) {
            addCriterion("DONGSHICHANGSHENGRI not between", value1, value2, "dongshichangshengri");
            return (Criteria) this;
        }

        public Criteria andDongshichangmianmaoIsNull() {
            addCriterion("DONGSHICHANGMIANMAO is null");
            return (Criteria) this;
        }

        public Criteria andDongshichangmianmaoIsNotNull() {
            addCriterion("DONGSHICHANGMIANMAO is not null");
            return (Criteria) this;
        }

        public Criteria andDongshichangmianmaoEqualTo(String value) {
            addCriterion("DONGSHICHANGMIANMAO =", value, "dongshichangmianmao");
            return (Criteria) this;
        }

        public Criteria andDongshichangmianmaoNotEqualTo(String value) {
            addCriterion("DONGSHICHANGMIANMAO <>", value, "dongshichangmianmao");
            return (Criteria) this;
        }

        public Criteria andDongshichangmianmaoGreaterThan(String value) {
            addCriterion("DONGSHICHANGMIANMAO >", value, "dongshichangmianmao");
            return (Criteria) this;
        }

        public Criteria andDongshichangmianmaoGreaterThanOrEqualTo(String value) {
            addCriterion("DONGSHICHANGMIANMAO >=", value, "dongshichangmianmao");
            return (Criteria) this;
        }

        public Criteria andDongshichangmianmaoLessThan(String value) {
            addCriterion("DONGSHICHANGMIANMAO <", value, "dongshichangmianmao");
            return (Criteria) this;
        }

        public Criteria andDongshichangmianmaoLessThanOrEqualTo(String value) {
            addCriterion("DONGSHICHANGMIANMAO <=", value, "dongshichangmianmao");
            return (Criteria) this;
        }

        public Criteria andDongshichangmianmaoLike(String value) {
            addCriterion("DONGSHICHANGMIANMAO like", value, "dongshichangmianmao");
            return (Criteria) this;
        }

        public Criteria andDongshichangmianmaoNotLike(String value) {
            addCriterion("DONGSHICHANGMIANMAO not like", value, "dongshichangmianmao");
            return (Criteria) this;
        }

        public Criteria andDongshichangmianmaoIn(List<String> values) {
            addCriterion("DONGSHICHANGMIANMAO in", values, "dongshichangmianmao");
            return (Criteria) this;
        }

        public Criteria andDongshichangmianmaoNotIn(List<String> values) {
            addCriterion("DONGSHICHANGMIANMAO not in", values, "dongshichangmianmao");
            return (Criteria) this;
        }

        public Criteria andDongshichangmianmaoBetween(String value1, String value2) {
            addCriterion("DONGSHICHANGMIANMAO between", value1, value2, "dongshichangmianmao");
            return (Criteria) this;
        }

        public Criteria andDongshichangmianmaoNotBetween(String value1, String value2) {
            addCriterion("DONGSHICHANGMIANMAO not between", value1, value2, "dongshichangmianmao");
            return (Criteria) this;
        }

        public Criteria andDongshichangxueliIsNull() {
            addCriterion("DONGSHICHANGXUELI is null");
            return (Criteria) this;
        }

        public Criteria andDongshichangxueliIsNotNull() {
            addCriterion("DONGSHICHANGXUELI is not null");
            return (Criteria) this;
        }

        public Criteria andDongshichangxueliEqualTo(String value) {
            addCriterion("DONGSHICHANGXUELI =", value, "dongshichangxueli");
            return (Criteria) this;
        }

        public Criteria andDongshichangxueliNotEqualTo(String value) {
            addCriterion("DONGSHICHANGXUELI <>", value, "dongshichangxueli");
            return (Criteria) this;
        }

        public Criteria andDongshichangxueliGreaterThan(String value) {
            addCriterion("DONGSHICHANGXUELI >", value, "dongshichangxueli");
            return (Criteria) this;
        }

        public Criteria andDongshichangxueliGreaterThanOrEqualTo(String value) {
            addCriterion("DONGSHICHANGXUELI >=", value, "dongshichangxueli");
            return (Criteria) this;
        }

        public Criteria andDongshichangxueliLessThan(String value) {
            addCriterion("DONGSHICHANGXUELI <", value, "dongshichangxueli");
            return (Criteria) this;
        }

        public Criteria andDongshichangxueliLessThanOrEqualTo(String value) {
            addCriterion("DONGSHICHANGXUELI <=", value, "dongshichangxueli");
            return (Criteria) this;
        }

        public Criteria andDongshichangxueliLike(String value) {
            addCriterion("DONGSHICHANGXUELI like", value, "dongshichangxueli");
            return (Criteria) this;
        }

        public Criteria andDongshichangxueliNotLike(String value) {
            addCriterion("DONGSHICHANGXUELI not like", value, "dongshichangxueli");
            return (Criteria) this;
        }

        public Criteria andDongshichangxueliIn(List<String> values) {
            addCriterion("DONGSHICHANGXUELI in", values, "dongshichangxueli");
            return (Criteria) this;
        }

        public Criteria andDongshichangxueliNotIn(List<String> values) {
            addCriterion("DONGSHICHANGXUELI not in", values, "dongshichangxueli");
            return (Criteria) this;
        }

        public Criteria andDongshichangxueliBetween(String value1, String value2) {
            addCriterion("DONGSHICHANGXUELI between", value1, value2, "dongshichangxueli");
            return (Criteria) this;
        }

        public Criteria andDongshichangxueliNotBetween(String value1, String value2) {
            addCriterion("DONGSHICHANGXUELI not between", value1, value2, "dongshichangxueli");
            return (Criteria) this;
        }

        public Criteria andDongshichangzhuanzhiIsNull() {
            addCriterion("DONGSHICHANGZHUANZHI is null");
            return (Criteria) this;
        }

        public Criteria andDongshichangzhuanzhiIsNotNull() {
            addCriterion("DONGSHICHANGZHUANZHI is not null");
            return (Criteria) this;
        }

        public Criteria andDongshichangzhuanzhiEqualTo(String value) {
            addCriterion("DONGSHICHANGZHUANZHI =", value, "dongshichangzhuanzhi");
            return (Criteria) this;
        }

        public Criteria andDongshichangzhuanzhiNotEqualTo(String value) {
            addCriterion("DONGSHICHANGZHUANZHI <>", value, "dongshichangzhuanzhi");
            return (Criteria) this;
        }

        public Criteria andDongshichangzhuanzhiGreaterThan(String value) {
            addCriterion("DONGSHICHANGZHUANZHI >", value, "dongshichangzhuanzhi");
            return (Criteria) this;
        }

        public Criteria andDongshichangzhuanzhiGreaterThanOrEqualTo(String value) {
            addCriterion("DONGSHICHANGZHUANZHI >=", value, "dongshichangzhuanzhi");
            return (Criteria) this;
        }

        public Criteria andDongshichangzhuanzhiLessThan(String value) {
            addCriterion("DONGSHICHANGZHUANZHI <", value, "dongshichangzhuanzhi");
            return (Criteria) this;
        }

        public Criteria andDongshichangzhuanzhiLessThanOrEqualTo(String value) {
            addCriterion("DONGSHICHANGZHUANZHI <=", value, "dongshichangzhuanzhi");
            return (Criteria) this;
        }

        public Criteria andDongshichangzhuanzhiLike(String value) {
            addCriterion("DONGSHICHANGZHUANZHI like", value, "dongshichangzhuanzhi");
            return (Criteria) this;
        }

        public Criteria andDongshichangzhuanzhiNotLike(String value) {
            addCriterion("DONGSHICHANGZHUANZHI not like", value, "dongshichangzhuanzhi");
            return (Criteria) this;
        }

        public Criteria andDongshichangzhuanzhiIn(List<String> values) {
            addCriterion("DONGSHICHANGZHUANZHI in", values, "dongshichangzhuanzhi");
            return (Criteria) this;
        }

        public Criteria andDongshichangzhuanzhiNotIn(List<String> values) {
            addCriterion("DONGSHICHANGZHUANZHI not in", values, "dongshichangzhuanzhi");
            return (Criteria) this;
        }

        public Criteria andDongshichangzhuanzhiBetween(String value1, String value2) {
            addCriterion("DONGSHICHANGZHUANZHI between", value1, value2, "dongshichangzhuanzhi");
            return (Criteria) this;
        }

        public Criteria andDongshichangzhuanzhiNotBetween(String value1, String value2) {
            addCriterion("DONGSHICHANGZHUANZHI not between", value1, value2, "dongshichangzhuanzhi");
            return (Criteria) this;
        }

        public Criteria andDongshichangdanweiIsNull() {
            addCriterion("DONGSHICHANGDANWEI is null");
            return (Criteria) this;
        }

        public Criteria andDongshichangdanweiIsNotNull() {
            addCriterion("DONGSHICHANGDANWEI is not null");
            return (Criteria) this;
        }

        public Criteria andDongshichangdanweiEqualTo(String value) {
            addCriterion("DONGSHICHANGDANWEI =", value, "dongshichangdanwei");
            return (Criteria) this;
        }

        public Criteria andDongshichangdanweiNotEqualTo(String value) {
            addCriterion("DONGSHICHANGDANWEI <>", value, "dongshichangdanwei");
            return (Criteria) this;
        }

        public Criteria andDongshichangdanweiGreaterThan(String value) {
            addCriterion("DONGSHICHANGDANWEI >", value, "dongshichangdanwei");
            return (Criteria) this;
        }

        public Criteria andDongshichangdanweiGreaterThanOrEqualTo(String value) {
            addCriterion("DONGSHICHANGDANWEI >=", value, "dongshichangdanwei");
            return (Criteria) this;
        }

        public Criteria andDongshichangdanweiLessThan(String value) {
            addCriterion("DONGSHICHANGDANWEI <", value, "dongshichangdanwei");
            return (Criteria) this;
        }

        public Criteria andDongshichangdanweiLessThanOrEqualTo(String value) {
            addCriterion("DONGSHICHANGDANWEI <=", value, "dongshichangdanwei");
            return (Criteria) this;
        }

        public Criteria andDongshichangdanweiLike(String value) {
            addCriterion("DONGSHICHANGDANWEI like", value, "dongshichangdanwei");
            return (Criteria) this;
        }

        public Criteria andDongshichangdanweiNotLike(String value) {
            addCriterion("DONGSHICHANGDANWEI not like", value, "dongshichangdanwei");
            return (Criteria) this;
        }

        public Criteria andDongshichangdanweiIn(List<String> values) {
            addCriterion("DONGSHICHANGDANWEI in", values, "dongshichangdanwei");
            return (Criteria) this;
        }

        public Criteria andDongshichangdanweiNotIn(List<String> values) {
            addCriterion("DONGSHICHANGDANWEI not in", values, "dongshichangdanwei");
            return (Criteria) this;
        }

        public Criteria andDongshichangdanweiBetween(String value1, String value2) {
            addCriterion("DONGSHICHANGDANWEI between", value1, value2, "dongshichangdanwei");
            return (Criteria) this;
        }

        public Criteria andDongshichangdanweiNotBetween(String value1, String value2) {
            addCriterion("DONGSHICHANGDANWEI not between", value1, value2, "dongshichangdanwei");
            return (Criteria) this;
        }

        public Criteria andDongshichangdianhuaIsNull() {
            addCriterion("DONGSHICHANGDIANHUA is null");
            return (Criteria) this;
        }

        public Criteria andDongshichangdianhuaIsNotNull() {
            addCriterion("DONGSHICHANGDIANHUA is not null");
            return (Criteria) this;
        }

        public Criteria andDongshichangdianhuaEqualTo(String value) {
            addCriterion("DONGSHICHANGDIANHUA =", value, "dongshichangdianhua");
            return (Criteria) this;
        }

        public Criteria andDongshichangdianhuaNotEqualTo(String value) {
            addCriterion("DONGSHICHANGDIANHUA <>", value, "dongshichangdianhua");
            return (Criteria) this;
        }

        public Criteria andDongshichangdianhuaGreaterThan(String value) {
            addCriterion("DONGSHICHANGDIANHUA >", value, "dongshichangdianhua");
            return (Criteria) this;
        }

        public Criteria andDongshichangdianhuaGreaterThanOrEqualTo(String value) {
            addCriterion("DONGSHICHANGDIANHUA >=", value, "dongshichangdianhua");
            return (Criteria) this;
        }

        public Criteria andDongshichangdianhuaLessThan(String value) {
            addCriterion("DONGSHICHANGDIANHUA <", value, "dongshichangdianhua");
            return (Criteria) this;
        }

        public Criteria andDongshichangdianhuaLessThanOrEqualTo(String value) {
            addCriterion("DONGSHICHANGDIANHUA <=", value, "dongshichangdianhua");
            return (Criteria) this;
        }

        public Criteria andDongshichangdianhuaLike(String value) {
            addCriterion("DONGSHICHANGDIANHUA like", value, "dongshichangdianhua");
            return (Criteria) this;
        }

        public Criteria andDongshichangdianhuaNotLike(String value) {
            addCriterion("DONGSHICHANGDIANHUA not like", value, "dongshichangdianhua");
            return (Criteria) this;
        }

        public Criteria andDongshichangdianhuaIn(List<String> values) {
            addCriterion("DONGSHICHANGDIANHUA in", values, "dongshichangdianhua");
            return (Criteria) this;
        }

        public Criteria andDongshichangdianhuaNotIn(List<String> values) {
            addCriterion("DONGSHICHANGDIANHUA not in", values, "dongshichangdianhua");
            return (Criteria) this;
        }

        public Criteria andDongshichangdianhuaBetween(String value1, String value2) {
            addCriterion("DONGSHICHANGDIANHUA between", value1, value2, "dongshichangdianhua");
            return (Criteria) this;
        }

        public Criteria andDongshichangdianhuaNotBetween(String value1, String value2) {
            addCriterion("DONGSHICHANGDIANHUA not between", value1, value2, "dongshichangdianhua");
            return (Criteria) this;
        }

        public Criteria andDongshichangshoujiIsNull() {
            addCriterion("DONGSHICHANGSHOUJI is null");
            return (Criteria) this;
        }

        public Criteria andDongshichangshoujiIsNotNull() {
            addCriterion("DONGSHICHANGSHOUJI is not null");
            return (Criteria) this;
        }

        public Criteria andDongshichangshoujiEqualTo(String value) {
            addCriterion("DONGSHICHANGSHOUJI =", value, "dongshichangshouji");
            return (Criteria) this;
        }

        public Criteria andDongshichangshoujiNotEqualTo(String value) {
            addCriterion("DONGSHICHANGSHOUJI <>", value, "dongshichangshouji");
            return (Criteria) this;
        }

        public Criteria andDongshichangshoujiGreaterThan(String value) {
            addCriterion("DONGSHICHANGSHOUJI >", value, "dongshichangshouji");
            return (Criteria) this;
        }

        public Criteria andDongshichangshoujiGreaterThanOrEqualTo(String value) {
            addCriterion("DONGSHICHANGSHOUJI >=", value, "dongshichangshouji");
            return (Criteria) this;
        }

        public Criteria andDongshichangshoujiLessThan(String value) {
            addCriterion("DONGSHICHANGSHOUJI <", value, "dongshichangshouji");
            return (Criteria) this;
        }

        public Criteria andDongshichangshoujiLessThanOrEqualTo(String value) {
            addCriterion("DONGSHICHANGSHOUJI <=", value, "dongshichangshouji");
            return (Criteria) this;
        }

        public Criteria andDongshichangshoujiLike(String value) {
            addCriterion("DONGSHICHANGSHOUJI like", value, "dongshichangshouji");
            return (Criteria) this;
        }

        public Criteria andDongshichangshoujiNotLike(String value) {
            addCriterion("DONGSHICHANGSHOUJI not like", value, "dongshichangshouji");
            return (Criteria) this;
        }

        public Criteria andDongshichangshoujiIn(List<String> values) {
            addCriterion("DONGSHICHANGSHOUJI in", values, "dongshichangshouji");
            return (Criteria) this;
        }

        public Criteria andDongshichangshoujiNotIn(List<String> values) {
            addCriterion("DONGSHICHANGSHOUJI not in", values, "dongshichangshouji");
            return (Criteria) this;
        }

        public Criteria andDongshichangshoujiBetween(String value1, String value2) {
            addCriterion("DONGSHICHANGSHOUJI between", value1, value2, "dongshichangshouji");
            return (Criteria) this;
        }

        public Criteria andDongshichangshoujiNotBetween(String value1, String value2) {
            addCriterion("DONGSHICHANGSHOUJI not between", value1, value2, "dongshichangshouji");
            return (Criteria) this;
        }

        public Criteria andFuzerenxingmingIsNull() {
            addCriterion("FUZERENXINGMING is null");
            return (Criteria) this;
        }

        public Criteria andFuzerenxingmingIsNotNull() {
            addCriterion("FUZERENXINGMING is not null");
            return (Criteria) this;
        }

        public Criteria andFuzerenxingmingEqualTo(String value) {
            addCriterion("FUZERENXINGMING =", value, "fuzerenxingming");
            return (Criteria) this;
        }

        public Criteria andFuzerenxingmingNotEqualTo(String value) {
            addCriterion("FUZERENXINGMING <>", value, "fuzerenxingming");
            return (Criteria) this;
        }

        public Criteria andFuzerenxingmingGreaterThan(String value) {
            addCriterion("FUZERENXINGMING >", value, "fuzerenxingming");
            return (Criteria) this;
        }

        public Criteria andFuzerenxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("FUZERENXINGMING >=", value, "fuzerenxingming");
            return (Criteria) this;
        }

        public Criteria andFuzerenxingmingLessThan(String value) {
            addCriterion("FUZERENXINGMING <", value, "fuzerenxingming");
            return (Criteria) this;
        }

        public Criteria andFuzerenxingmingLessThanOrEqualTo(String value) {
            addCriterion("FUZERENXINGMING <=", value, "fuzerenxingming");
            return (Criteria) this;
        }

        public Criteria andFuzerenxingmingLike(String value) {
            addCriterion("FUZERENXINGMING like", value, "fuzerenxingming");
            return (Criteria) this;
        }

        public Criteria andFuzerenxingmingNotLike(String value) {
            addCriterion("FUZERENXINGMING not like", value, "fuzerenxingming");
            return (Criteria) this;
        }

        public Criteria andFuzerenxingmingIn(List<String> values) {
            addCriterion("FUZERENXINGMING in", values, "fuzerenxingming");
            return (Criteria) this;
        }

        public Criteria andFuzerenxingmingNotIn(List<String> values) {
            addCriterion("FUZERENXINGMING not in", values, "fuzerenxingming");
            return (Criteria) this;
        }

        public Criteria andFuzerenxingmingBetween(String value1, String value2) {
            addCriterion("FUZERENXINGMING between", value1, value2, "fuzerenxingming");
            return (Criteria) this;
        }

        public Criteria andFuzerenxingmingNotBetween(String value1, String value2) {
            addCriterion("FUZERENXINGMING not between", value1, value2, "fuzerenxingming");
            return (Criteria) this;
        }

        public Criteria andFuzerenxingbieIsNull() {
            addCriterion("FUZERENXINGBIE is null");
            return (Criteria) this;
        }

        public Criteria andFuzerenxingbieIsNotNull() {
            addCriterion("FUZERENXINGBIE is not null");
            return (Criteria) this;
        }

        public Criteria andFuzerenxingbieEqualTo(String value) {
            addCriterion("FUZERENXINGBIE =", value, "fuzerenxingbie");
            return (Criteria) this;
        }

        public Criteria andFuzerenxingbieNotEqualTo(String value) {
            addCriterion("FUZERENXINGBIE <>", value, "fuzerenxingbie");
            return (Criteria) this;
        }

        public Criteria andFuzerenxingbieGreaterThan(String value) {
            addCriterion("FUZERENXINGBIE >", value, "fuzerenxingbie");
            return (Criteria) this;
        }

        public Criteria andFuzerenxingbieGreaterThanOrEqualTo(String value) {
            addCriterion("FUZERENXINGBIE >=", value, "fuzerenxingbie");
            return (Criteria) this;
        }

        public Criteria andFuzerenxingbieLessThan(String value) {
            addCriterion("FUZERENXINGBIE <", value, "fuzerenxingbie");
            return (Criteria) this;
        }

        public Criteria andFuzerenxingbieLessThanOrEqualTo(String value) {
            addCriterion("FUZERENXINGBIE <=", value, "fuzerenxingbie");
            return (Criteria) this;
        }

        public Criteria andFuzerenxingbieLike(String value) {
            addCriterion("FUZERENXINGBIE like", value, "fuzerenxingbie");
            return (Criteria) this;
        }

        public Criteria andFuzerenxingbieNotLike(String value) {
            addCriterion("FUZERENXINGBIE not like", value, "fuzerenxingbie");
            return (Criteria) this;
        }

        public Criteria andFuzerenxingbieIn(List<String> values) {
            addCriterion("FUZERENXINGBIE in", values, "fuzerenxingbie");
            return (Criteria) this;
        }

        public Criteria andFuzerenxingbieNotIn(List<String> values) {
            addCriterion("FUZERENXINGBIE not in", values, "fuzerenxingbie");
            return (Criteria) this;
        }

        public Criteria andFuzerenxingbieBetween(String value1, String value2) {
            addCriterion("FUZERENXINGBIE between", value1, value2, "fuzerenxingbie");
            return (Criteria) this;
        }

        public Criteria andFuzerenxingbieNotBetween(String value1, String value2) {
            addCriterion("FUZERENXINGBIE not between", value1, value2, "fuzerenxingbie");
            return (Criteria) this;
        }

        public Criteria andFuzerenshengriIsNull() {
            addCriterion("FUZERENSHENGRI is null");
            return (Criteria) this;
        }

        public Criteria andFuzerenshengriIsNotNull() {
            addCriterion("FUZERENSHENGRI is not null");
            return (Criteria) this;
        }

        public Criteria andFuzerenshengriEqualTo(Date value) {
            addCriterion("FUZERENSHENGRI =", value, "fuzerenshengri");
            return (Criteria) this;
        }

        public Criteria andFuzerenshengriNotEqualTo(Date value) {
            addCriterion("FUZERENSHENGRI <>", value, "fuzerenshengri");
            return (Criteria) this;
        }

        public Criteria andFuzerenshengriGreaterThan(Date value) {
            addCriterion("FUZERENSHENGRI >", value, "fuzerenshengri");
            return (Criteria) this;
        }

        public Criteria andFuzerenshengriGreaterThanOrEqualTo(Date value) {
            addCriterion("FUZERENSHENGRI >=", value, "fuzerenshengri");
            return (Criteria) this;
        }

        public Criteria andFuzerenshengriLessThan(Date value) {
            addCriterion("FUZERENSHENGRI <", value, "fuzerenshengri");
            return (Criteria) this;
        }

        public Criteria andFuzerenshengriLessThanOrEqualTo(Date value) {
            addCriterion("FUZERENSHENGRI <=", value, "fuzerenshengri");
            return (Criteria) this;
        }

        public Criteria andFuzerenshengriIn(List<Date> values) {
            addCriterion("FUZERENSHENGRI in", values, "fuzerenshengri");
            return (Criteria) this;
        }

        public Criteria andFuzerenshengriNotIn(List<Date> values) {
            addCriterion("FUZERENSHENGRI not in", values, "fuzerenshengri");
            return (Criteria) this;
        }

        public Criteria andFuzerenshengriBetween(Date value1, Date value2) {
            addCriterion("FUZERENSHENGRI between", value1, value2, "fuzerenshengri");
            return (Criteria) this;
        }

        public Criteria andFuzerenshengriNotBetween(Date value1, Date value2) {
            addCriterion("FUZERENSHENGRI not between", value1, value2, "fuzerenshengri");
            return (Criteria) this;
        }

        public Criteria andFuzerenmianmaoIsNull() {
            addCriterion("FUZERENMIANMAO is null");
            return (Criteria) this;
        }

        public Criteria andFuzerenmianmaoIsNotNull() {
            addCriterion("FUZERENMIANMAO is not null");
            return (Criteria) this;
        }

        public Criteria andFuzerenmianmaoEqualTo(String value) {
            addCriterion("FUZERENMIANMAO =", value, "fuzerenmianmao");
            return (Criteria) this;
        }

        public Criteria andFuzerenmianmaoNotEqualTo(String value) {
            addCriterion("FUZERENMIANMAO <>", value, "fuzerenmianmao");
            return (Criteria) this;
        }

        public Criteria andFuzerenmianmaoGreaterThan(String value) {
            addCriterion("FUZERENMIANMAO >", value, "fuzerenmianmao");
            return (Criteria) this;
        }

        public Criteria andFuzerenmianmaoGreaterThanOrEqualTo(String value) {
            addCriterion("FUZERENMIANMAO >=", value, "fuzerenmianmao");
            return (Criteria) this;
        }

        public Criteria andFuzerenmianmaoLessThan(String value) {
            addCriterion("FUZERENMIANMAO <", value, "fuzerenmianmao");
            return (Criteria) this;
        }

        public Criteria andFuzerenmianmaoLessThanOrEqualTo(String value) {
            addCriterion("FUZERENMIANMAO <=", value, "fuzerenmianmao");
            return (Criteria) this;
        }

        public Criteria andFuzerenmianmaoLike(String value) {
            addCriterion("FUZERENMIANMAO like", value, "fuzerenmianmao");
            return (Criteria) this;
        }

        public Criteria andFuzerenmianmaoNotLike(String value) {
            addCriterion("FUZERENMIANMAO not like", value, "fuzerenmianmao");
            return (Criteria) this;
        }

        public Criteria andFuzerenmianmaoIn(List<String> values) {
            addCriterion("FUZERENMIANMAO in", values, "fuzerenmianmao");
            return (Criteria) this;
        }

        public Criteria andFuzerenmianmaoNotIn(List<String> values) {
            addCriterion("FUZERENMIANMAO not in", values, "fuzerenmianmao");
            return (Criteria) this;
        }

        public Criteria andFuzerenmianmaoBetween(String value1, String value2) {
            addCriterion("FUZERENMIANMAO between", value1, value2, "fuzerenmianmao");
            return (Criteria) this;
        }

        public Criteria andFuzerenmianmaoNotBetween(String value1, String value2) {
            addCriterion("FUZERENMIANMAO not between", value1, value2, "fuzerenmianmao");
            return (Criteria) this;
        }

        public Criteria andFuzerenxueliIsNull() {
            addCriterion("FUZERENXUELI is null");
            return (Criteria) this;
        }

        public Criteria andFuzerenxueliIsNotNull() {
            addCriterion("FUZERENXUELI is not null");
            return (Criteria) this;
        }

        public Criteria andFuzerenxueliEqualTo(String value) {
            addCriterion("FUZERENXUELI =", value, "fuzerenxueli");
            return (Criteria) this;
        }

        public Criteria andFuzerenxueliNotEqualTo(String value) {
            addCriterion("FUZERENXUELI <>", value, "fuzerenxueli");
            return (Criteria) this;
        }

        public Criteria andFuzerenxueliGreaterThan(String value) {
            addCriterion("FUZERENXUELI >", value, "fuzerenxueli");
            return (Criteria) this;
        }

        public Criteria andFuzerenxueliGreaterThanOrEqualTo(String value) {
            addCriterion("FUZERENXUELI >=", value, "fuzerenxueli");
            return (Criteria) this;
        }

        public Criteria andFuzerenxueliLessThan(String value) {
            addCriterion("FUZERENXUELI <", value, "fuzerenxueli");
            return (Criteria) this;
        }

        public Criteria andFuzerenxueliLessThanOrEqualTo(String value) {
            addCriterion("FUZERENXUELI <=", value, "fuzerenxueli");
            return (Criteria) this;
        }

        public Criteria andFuzerenxueliLike(String value) {
            addCriterion("FUZERENXUELI like", value, "fuzerenxueli");
            return (Criteria) this;
        }

        public Criteria andFuzerenxueliNotLike(String value) {
            addCriterion("FUZERENXUELI not like", value, "fuzerenxueli");
            return (Criteria) this;
        }

        public Criteria andFuzerenxueliIn(List<String> values) {
            addCriterion("FUZERENXUELI in", values, "fuzerenxueli");
            return (Criteria) this;
        }

        public Criteria andFuzerenxueliNotIn(List<String> values) {
            addCriterion("FUZERENXUELI not in", values, "fuzerenxueli");
            return (Criteria) this;
        }

        public Criteria andFuzerenxueliBetween(String value1, String value2) {
            addCriterion("FUZERENXUELI between", value1, value2, "fuzerenxueli");
            return (Criteria) this;
        }

        public Criteria andFuzerenxueliNotBetween(String value1, String value2) {
            addCriterion("FUZERENXUELI not between", value1, value2, "fuzerenxueli");
            return (Criteria) this;
        }

        public Criteria andFuzerenzhuanzhiIsNull() {
            addCriterion("FUZERENZHUANZHI is null");
            return (Criteria) this;
        }

        public Criteria andFuzerenzhuanzhiIsNotNull() {
            addCriterion("FUZERENZHUANZHI is not null");
            return (Criteria) this;
        }

        public Criteria andFuzerenzhuanzhiEqualTo(String value) {
            addCriterion("FUZERENZHUANZHI =", value, "fuzerenzhuanzhi");
            return (Criteria) this;
        }

        public Criteria andFuzerenzhuanzhiNotEqualTo(String value) {
            addCriterion("FUZERENZHUANZHI <>", value, "fuzerenzhuanzhi");
            return (Criteria) this;
        }

        public Criteria andFuzerenzhuanzhiGreaterThan(String value) {
            addCriterion("FUZERENZHUANZHI >", value, "fuzerenzhuanzhi");
            return (Criteria) this;
        }

        public Criteria andFuzerenzhuanzhiGreaterThanOrEqualTo(String value) {
            addCriterion("FUZERENZHUANZHI >=", value, "fuzerenzhuanzhi");
            return (Criteria) this;
        }

        public Criteria andFuzerenzhuanzhiLessThan(String value) {
            addCriterion("FUZERENZHUANZHI <", value, "fuzerenzhuanzhi");
            return (Criteria) this;
        }

        public Criteria andFuzerenzhuanzhiLessThanOrEqualTo(String value) {
            addCriterion("FUZERENZHUANZHI <=", value, "fuzerenzhuanzhi");
            return (Criteria) this;
        }

        public Criteria andFuzerenzhuanzhiLike(String value) {
            addCriterion("FUZERENZHUANZHI like", value, "fuzerenzhuanzhi");
            return (Criteria) this;
        }

        public Criteria andFuzerenzhuanzhiNotLike(String value) {
            addCriterion("FUZERENZHUANZHI not like", value, "fuzerenzhuanzhi");
            return (Criteria) this;
        }

        public Criteria andFuzerenzhuanzhiIn(List<String> values) {
            addCriterion("FUZERENZHUANZHI in", values, "fuzerenzhuanzhi");
            return (Criteria) this;
        }

        public Criteria andFuzerenzhuanzhiNotIn(List<String> values) {
            addCriterion("FUZERENZHUANZHI not in", values, "fuzerenzhuanzhi");
            return (Criteria) this;
        }

        public Criteria andFuzerenzhuanzhiBetween(String value1, String value2) {
            addCriterion("FUZERENZHUANZHI between", value1, value2, "fuzerenzhuanzhi");
            return (Criteria) this;
        }

        public Criteria andFuzerenzhuanzhiNotBetween(String value1, String value2) {
            addCriterion("FUZERENZHUANZHI not between", value1, value2, "fuzerenzhuanzhi");
            return (Criteria) this;
        }

        public Criteria andFuzerendianhuaIsNull() {
            addCriterion("FUZERENDIANHUA is null");
            return (Criteria) this;
        }

        public Criteria andFuzerendianhuaIsNotNull() {
            addCriterion("FUZERENDIANHUA is not null");
            return (Criteria) this;
        }

        public Criteria andFuzerendianhuaEqualTo(String value) {
            addCriterion("FUZERENDIANHUA =", value, "fuzerendianhua");
            return (Criteria) this;
        }

        public Criteria andFuzerendianhuaNotEqualTo(String value) {
            addCriterion("FUZERENDIANHUA <>", value, "fuzerendianhua");
            return (Criteria) this;
        }

        public Criteria andFuzerendianhuaGreaterThan(String value) {
            addCriterion("FUZERENDIANHUA >", value, "fuzerendianhua");
            return (Criteria) this;
        }

        public Criteria andFuzerendianhuaGreaterThanOrEqualTo(String value) {
            addCriterion("FUZERENDIANHUA >=", value, "fuzerendianhua");
            return (Criteria) this;
        }

        public Criteria andFuzerendianhuaLessThan(String value) {
            addCriterion("FUZERENDIANHUA <", value, "fuzerendianhua");
            return (Criteria) this;
        }

        public Criteria andFuzerendianhuaLessThanOrEqualTo(String value) {
            addCriterion("FUZERENDIANHUA <=", value, "fuzerendianhua");
            return (Criteria) this;
        }

        public Criteria andFuzerendianhuaLike(String value) {
            addCriterion("FUZERENDIANHUA like", value, "fuzerendianhua");
            return (Criteria) this;
        }

        public Criteria andFuzerendianhuaNotLike(String value) {
            addCriterion("FUZERENDIANHUA not like", value, "fuzerendianhua");
            return (Criteria) this;
        }

        public Criteria andFuzerendianhuaIn(List<String> values) {
            addCriterion("FUZERENDIANHUA in", values, "fuzerendianhua");
            return (Criteria) this;
        }

        public Criteria andFuzerendianhuaNotIn(List<String> values) {
            addCriterion("FUZERENDIANHUA not in", values, "fuzerendianhua");
            return (Criteria) this;
        }

        public Criteria andFuzerendianhuaBetween(String value1, String value2) {
            addCriterion("FUZERENDIANHUA between", value1, value2, "fuzerendianhua");
            return (Criteria) this;
        }

        public Criteria andFuzerendianhuaNotBetween(String value1, String value2) {
            addCriterion("FUZERENDIANHUA not between", value1, value2, "fuzerendianhua");
            return (Criteria) this;
        }

        public Criteria andFuzerenchuanzhenIsNull() {
            addCriterion("FUZERENCHUANZHEN is null");
            return (Criteria) this;
        }

        public Criteria andFuzerenchuanzhenIsNotNull() {
            addCriterion("FUZERENCHUANZHEN is not null");
            return (Criteria) this;
        }

        public Criteria andFuzerenchuanzhenEqualTo(String value) {
            addCriterion("FUZERENCHUANZHEN =", value, "fuzerenchuanzhen");
            return (Criteria) this;
        }

        public Criteria andFuzerenchuanzhenNotEqualTo(String value) {
            addCriterion("FUZERENCHUANZHEN <>", value, "fuzerenchuanzhen");
            return (Criteria) this;
        }

        public Criteria andFuzerenchuanzhenGreaterThan(String value) {
            addCriterion("FUZERENCHUANZHEN >", value, "fuzerenchuanzhen");
            return (Criteria) this;
        }

        public Criteria andFuzerenchuanzhenGreaterThanOrEqualTo(String value) {
            addCriterion("FUZERENCHUANZHEN >=", value, "fuzerenchuanzhen");
            return (Criteria) this;
        }

        public Criteria andFuzerenchuanzhenLessThan(String value) {
            addCriterion("FUZERENCHUANZHEN <", value, "fuzerenchuanzhen");
            return (Criteria) this;
        }

        public Criteria andFuzerenchuanzhenLessThanOrEqualTo(String value) {
            addCriterion("FUZERENCHUANZHEN <=", value, "fuzerenchuanzhen");
            return (Criteria) this;
        }

        public Criteria andFuzerenchuanzhenLike(String value) {
            addCriterion("FUZERENCHUANZHEN like", value, "fuzerenchuanzhen");
            return (Criteria) this;
        }

        public Criteria andFuzerenchuanzhenNotLike(String value) {
            addCriterion("FUZERENCHUANZHEN not like", value, "fuzerenchuanzhen");
            return (Criteria) this;
        }

        public Criteria andFuzerenchuanzhenIn(List<String> values) {
            addCriterion("FUZERENCHUANZHEN in", values, "fuzerenchuanzhen");
            return (Criteria) this;
        }

        public Criteria andFuzerenchuanzhenNotIn(List<String> values) {
            addCriterion("FUZERENCHUANZHEN not in", values, "fuzerenchuanzhen");
            return (Criteria) this;
        }

        public Criteria andFuzerenchuanzhenBetween(String value1, String value2) {
            addCriterion("FUZERENCHUANZHEN between", value1, value2, "fuzerenchuanzhen");
            return (Criteria) this;
        }

        public Criteria andFuzerenchuanzhenNotBetween(String value1, String value2) {
            addCriterion("FUZERENCHUANZHEN not between", value1, value2, "fuzerenchuanzhen");
            return (Criteria) this;
        }

        public Criteria andFuzerenshoujiIsNull() {
            addCriterion("FUZERENSHOUJI is null");
            return (Criteria) this;
        }

        public Criteria andFuzerenshoujiIsNotNull() {
            addCriterion("FUZERENSHOUJI is not null");
            return (Criteria) this;
        }

        public Criteria andFuzerenshoujiEqualTo(String value) {
            addCriterion("FUZERENSHOUJI =", value, "fuzerenshouji");
            return (Criteria) this;
        }

        public Criteria andFuzerenshoujiNotEqualTo(String value) {
            addCriterion("FUZERENSHOUJI <>", value, "fuzerenshouji");
            return (Criteria) this;
        }

        public Criteria andFuzerenshoujiGreaterThan(String value) {
            addCriterion("FUZERENSHOUJI >", value, "fuzerenshouji");
            return (Criteria) this;
        }

        public Criteria andFuzerenshoujiGreaterThanOrEqualTo(String value) {
            addCriterion("FUZERENSHOUJI >=", value, "fuzerenshouji");
            return (Criteria) this;
        }

        public Criteria andFuzerenshoujiLessThan(String value) {
            addCriterion("FUZERENSHOUJI <", value, "fuzerenshouji");
            return (Criteria) this;
        }

        public Criteria andFuzerenshoujiLessThanOrEqualTo(String value) {
            addCriterion("FUZERENSHOUJI <=", value, "fuzerenshouji");
            return (Criteria) this;
        }

        public Criteria andFuzerenshoujiLike(String value) {
            addCriterion("FUZERENSHOUJI like", value, "fuzerenshouji");
            return (Criteria) this;
        }

        public Criteria andFuzerenshoujiNotLike(String value) {
            addCriterion("FUZERENSHOUJI not like", value, "fuzerenshouji");
            return (Criteria) this;
        }

        public Criteria andFuzerenshoujiIn(List<String> values) {
            addCriterion("FUZERENSHOUJI in", values, "fuzerenshouji");
            return (Criteria) this;
        }

        public Criteria andFuzerenshoujiNotIn(List<String> values) {
            addCriterion("FUZERENSHOUJI not in", values, "fuzerenshouji");
            return (Criteria) this;
        }

        public Criteria andFuzerenshoujiBetween(String value1, String value2) {
            addCriterion("FUZERENSHOUJI between", value1, value2, "fuzerenshouji");
            return (Criteria) this;
        }

        public Criteria andFuzerenshoujiNotBetween(String value1, String value2) {
            addCriterion("FUZERENSHOUJI not between", value1, value2, "fuzerenshouji");
            return (Criteria) this;
        }

        public Criteria andLituixiuzongshuIsNull() {
            addCriterion("LITUIXIUZONGSHU is null");
            return (Criteria) this;
        }

        public Criteria andLituixiuzongshuIsNotNull() {
            addCriterion("LITUIXIUZONGSHU is not null");
            return (Criteria) this;
        }

        public Criteria andLituixiuzongshuEqualTo(Integer value) {
            addCriterion("LITUIXIUZONGSHU =", value, "lituixiuzongshu");
            return (Criteria) this;
        }

        public Criteria andLituixiuzongshuNotEqualTo(Integer value) {
            addCriterion("LITUIXIUZONGSHU <>", value, "lituixiuzongshu");
            return (Criteria) this;
        }

        public Criteria andLituixiuzongshuGreaterThan(Integer value) {
            addCriterion("LITUIXIUZONGSHU >", value, "lituixiuzongshu");
            return (Criteria) this;
        }

        public Criteria andLituixiuzongshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("LITUIXIUZONGSHU >=", value, "lituixiuzongshu");
            return (Criteria) this;
        }

        public Criteria andLituixiuzongshuLessThan(Integer value) {
            addCriterion("LITUIXIUZONGSHU <", value, "lituixiuzongshu");
            return (Criteria) this;
        }

        public Criteria andLituixiuzongshuLessThanOrEqualTo(Integer value) {
            addCriterion("LITUIXIUZONGSHU <=", value, "lituixiuzongshu");
            return (Criteria) this;
        }

        public Criteria andLituixiuzongshuIn(List<Integer> values) {
            addCriterion("LITUIXIUZONGSHU in", values, "lituixiuzongshu");
            return (Criteria) this;
        }

        public Criteria andLituixiuzongshuNotIn(List<Integer> values) {
            addCriterion("LITUIXIUZONGSHU not in", values, "lituixiuzongshu");
            return (Criteria) this;
        }

        public Criteria andLituixiuzongshuBetween(Integer value1, Integer value2) {
            addCriterion("LITUIXIUZONGSHU between", value1, value2, "lituixiuzongshu");
            return (Criteria) this;
        }

        public Criteria andLituixiuzongshuNotBetween(Integer value1, Integer value2) {
            addCriterion("LITUIXIUZONGSHU not between", value1, value2, "lituixiuzongshu");
            return (Criteria) this;
        }

        public Criteria andLishengbujiIsNull() {
            addCriterion("LISHENGBUJI is null");
            return (Criteria) this;
        }

        public Criteria andLishengbujiIsNotNull() {
            addCriterion("LISHENGBUJI is not null");
            return (Criteria) this;
        }

        public Criteria andLishengbujiEqualTo(Integer value) {
            addCriterion("LISHENGBUJI =", value, "lishengbuji");
            return (Criteria) this;
        }

        public Criteria andLishengbujiNotEqualTo(Integer value) {
            addCriterion("LISHENGBUJI <>", value, "lishengbuji");
            return (Criteria) this;
        }

        public Criteria andLishengbujiGreaterThan(Integer value) {
            addCriterion("LISHENGBUJI >", value, "lishengbuji");
            return (Criteria) this;
        }

        public Criteria andLishengbujiGreaterThanOrEqualTo(Integer value) {
            addCriterion("LISHENGBUJI >=", value, "lishengbuji");
            return (Criteria) this;
        }

        public Criteria andLishengbujiLessThan(Integer value) {
            addCriterion("LISHENGBUJI <", value, "lishengbuji");
            return (Criteria) this;
        }

        public Criteria andLishengbujiLessThanOrEqualTo(Integer value) {
            addCriterion("LISHENGBUJI <=", value, "lishengbuji");
            return (Criteria) this;
        }

        public Criteria andLishengbujiIn(List<Integer> values) {
            addCriterion("LISHENGBUJI in", values, "lishengbuji");
            return (Criteria) this;
        }

        public Criteria andLishengbujiNotIn(List<Integer> values) {
            addCriterion("LISHENGBUJI not in", values, "lishengbuji");
            return (Criteria) this;
        }

        public Criteria andLishengbujiBetween(Integer value1, Integer value2) {
            addCriterion("LISHENGBUJI between", value1, value2, "lishengbuji");
            return (Criteria) this;
        }

        public Criteria andLishengbujiNotBetween(Integer value1, Integer value2) {
            addCriterion("LISHENGBUJI not between", value1, value2, "lishengbuji");
            return (Criteria) this;
        }

        public Criteria andLilaolingIsNull() {
            addCriterion("LILAOLING is null");
            return (Criteria) this;
        }

        public Criteria andLilaolingIsNotNull() {
            addCriterion("LILAOLING is not null");
            return (Criteria) this;
        }

        public Criteria andLilaolingEqualTo(Integer value) {
            addCriterion("LILAOLING =", value, "lilaoling");
            return (Criteria) this;
        }

        public Criteria andLilaolingNotEqualTo(Integer value) {
            addCriterion("LILAOLING <>", value, "lilaoling");
            return (Criteria) this;
        }

        public Criteria andLilaolingGreaterThan(Integer value) {
            addCriterion("LILAOLING >", value, "lilaoling");
            return (Criteria) this;
        }

        public Criteria andLilaolingGreaterThanOrEqualTo(Integer value) {
            addCriterion("LILAOLING >=", value, "lilaoling");
            return (Criteria) this;
        }

        public Criteria andLilaolingLessThan(Integer value) {
            addCriterion("LILAOLING <", value, "lilaoling");
            return (Criteria) this;
        }

        public Criteria andLilaolingLessThanOrEqualTo(Integer value) {
            addCriterion("LILAOLING <=", value, "lilaoling");
            return (Criteria) this;
        }

        public Criteria andLilaolingIn(List<Integer> values) {
            addCriterion("LILAOLING in", values, "lilaoling");
            return (Criteria) this;
        }

        public Criteria andLilaolingNotIn(List<Integer> values) {
            addCriterion("LILAOLING not in", values, "lilaoling");
            return (Criteria) this;
        }

        public Criteria andLilaolingBetween(Integer value1, Integer value2) {
            addCriterion("LILAOLING between", value1, value2, "lilaoling");
            return (Criteria) this;
        }

        public Criteria andLilaolingNotBetween(Integer value1, Integer value2) {
            addCriterion("LILAOLING not between", value1, value2, "lilaoling");
            return (Criteria) this;
        }

        public Criteria andQuantinianlingIsNull() {
            addCriterion("QUANTINIANLING is null");
            return (Criteria) this;
        }

        public Criteria andQuantinianlingIsNotNull() {
            addCriterion("QUANTINIANLING is not null");
            return (Criteria) this;
        }

        public Criteria andQuantinianlingEqualTo(Integer value) {
            addCriterion("QUANTINIANLING =", value, "quantinianling");
            return (Criteria) this;
        }

        public Criteria andQuantinianlingNotEqualTo(Integer value) {
            addCriterion("QUANTINIANLING <>", value, "quantinianling");
            return (Criteria) this;
        }

        public Criteria andQuantinianlingGreaterThan(Integer value) {
            addCriterion("QUANTINIANLING >", value, "quantinianling");
            return (Criteria) this;
        }

        public Criteria andQuantinianlingGreaterThanOrEqualTo(Integer value) {
            addCriterion("QUANTINIANLING >=", value, "quantinianling");
            return (Criteria) this;
        }

        public Criteria andQuantinianlingLessThan(Integer value) {
            addCriterion("QUANTINIANLING <", value, "quantinianling");
            return (Criteria) this;
        }

        public Criteria andQuantinianlingLessThanOrEqualTo(Integer value) {
            addCriterion("QUANTINIANLING <=", value, "quantinianling");
            return (Criteria) this;
        }

        public Criteria andQuantinianlingIn(List<Integer> values) {
            addCriterion("QUANTINIANLING in", values, "quantinianling");
            return (Criteria) this;
        }

        public Criteria andQuantinianlingNotIn(List<Integer> values) {
            addCriterion("QUANTINIANLING not in", values, "quantinianling");
            return (Criteria) this;
        }

        public Criteria andQuantinianlingBetween(Integer value1, Integer value2) {
            addCriterion("QUANTINIANLING between", value1, value2, "quantinianling");
            return (Criteria) this;
        }

        public Criteria andQuantinianlingNotBetween(Integer value1, Integer value2) {
            addCriterion("QUANTINIANLING not between", value1, value2, "quantinianling");
            return (Criteria) this;
        }

        public Criteria andQuantinvxingIsNull() {
            addCriterion("QUANTINVXING is null");
            return (Criteria) this;
        }

        public Criteria andQuantinvxingIsNotNull() {
            addCriterion("QUANTINVXING is not null");
            return (Criteria) this;
        }

        public Criteria andQuantinvxingEqualTo(Integer value) {
            addCriterion("QUANTINVXING =", value, "quantinvxing");
            return (Criteria) this;
        }

        public Criteria andQuantinvxingNotEqualTo(Integer value) {
            addCriterion("QUANTINVXING <>", value, "quantinvxing");
            return (Criteria) this;
        }

        public Criteria andQuantinvxingGreaterThan(Integer value) {
            addCriterion("QUANTINVXING >", value, "quantinvxing");
            return (Criteria) this;
        }

        public Criteria andQuantinvxingGreaterThanOrEqualTo(Integer value) {
            addCriterion("QUANTINVXING >=", value, "quantinvxing");
            return (Criteria) this;
        }

        public Criteria andQuantinvxingLessThan(Integer value) {
            addCriterion("QUANTINVXING <", value, "quantinvxing");
            return (Criteria) this;
        }

        public Criteria andQuantinvxingLessThanOrEqualTo(Integer value) {
            addCriterion("QUANTINVXING <=", value, "quantinvxing");
            return (Criteria) this;
        }

        public Criteria andQuantinvxingIn(List<Integer> values) {
            addCriterion("QUANTINVXING in", values, "quantinvxing");
            return (Criteria) this;
        }

        public Criteria andQuantinvxingNotIn(List<Integer> values) {
            addCriterion("QUANTINVXING not in", values, "quantinvxing");
            return (Criteria) this;
        }

        public Criteria andQuantinvxingBetween(Integer value1, Integer value2) {
            addCriterion("QUANTINVXING between", value1, value2, "quantinvxing");
            return (Criteria) this;
        }

        public Criteria andQuantinvxingNotBetween(Integer value1, Integer value2) {
            addCriterion("QUANTINVXING not between", value1, value2, "quantinvxing");
            return (Criteria) this;
        }

        public Criteria andQuantibenkeIsNull() {
            addCriterion("QUANTIBENKE is null");
            return (Criteria) this;
        }

        public Criteria andQuantibenkeIsNotNull() {
            addCriterion("QUANTIBENKE is not null");
            return (Criteria) this;
        }

        public Criteria andQuantibenkeEqualTo(Integer value) {
            addCriterion("QUANTIBENKE =", value, "quantibenke");
            return (Criteria) this;
        }

        public Criteria andQuantibenkeNotEqualTo(Integer value) {
            addCriterion("QUANTIBENKE <>", value, "quantibenke");
            return (Criteria) this;
        }

        public Criteria andQuantibenkeGreaterThan(Integer value) {
            addCriterion("QUANTIBENKE >", value, "quantibenke");
            return (Criteria) this;
        }

        public Criteria andQuantibenkeGreaterThanOrEqualTo(Integer value) {
            addCriterion("QUANTIBENKE >=", value, "quantibenke");
            return (Criteria) this;
        }

        public Criteria andQuantibenkeLessThan(Integer value) {
            addCriterion("QUANTIBENKE <", value, "quantibenke");
            return (Criteria) this;
        }

        public Criteria andQuantibenkeLessThanOrEqualTo(Integer value) {
            addCriterion("QUANTIBENKE <=", value, "quantibenke");
            return (Criteria) this;
        }

        public Criteria andQuantibenkeIn(List<Integer> values) {
            addCriterion("QUANTIBENKE in", values, "quantibenke");
            return (Criteria) this;
        }

        public Criteria andQuantibenkeNotIn(List<Integer> values) {
            addCriterion("QUANTIBENKE not in", values, "quantibenke");
            return (Criteria) this;
        }

        public Criteria andQuantibenkeBetween(Integer value1, Integer value2) {
            addCriterion("QUANTIBENKE between", value1, value2, "quantibenke");
            return (Criteria) this;
        }

        public Criteria andQuantibenkeNotBetween(Integer value1, Integer value2) {
            addCriterion("QUANTIBENKE not between", value1, value2, "quantibenke");
            return (Criteria) this;
        }

        public Criteria andQuantidangyuanIsNull() {
            addCriterion("QUANTIDANGYUAN is null");
            return (Criteria) this;
        }

        public Criteria andQuantidangyuanIsNotNull() {
            addCriterion("QUANTIDANGYUAN is not null");
            return (Criteria) this;
        }

        public Criteria andQuantidangyuanEqualTo(Integer value) {
            addCriterion("QUANTIDANGYUAN =", value, "quantidangyuan");
            return (Criteria) this;
        }

        public Criteria andQuantidangyuanNotEqualTo(Integer value) {
            addCriterion("QUANTIDANGYUAN <>", value, "quantidangyuan");
            return (Criteria) this;
        }

        public Criteria andQuantidangyuanGreaterThan(Integer value) {
            addCriterion("QUANTIDANGYUAN >", value, "quantidangyuan");
            return (Criteria) this;
        }

        public Criteria andQuantidangyuanGreaterThanOrEqualTo(Integer value) {
            addCriterion("QUANTIDANGYUAN >=", value, "quantidangyuan");
            return (Criteria) this;
        }

        public Criteria andQuantidangyuanLessThan(Integer value) {
            addCriterion("QUANTIDANGYUAN <", value, "quantidangyuan");
            return (Criteria) this;
        }

        public Criteria andQuantidangyuanLessThanOrEqualTo(Integer value) {
            addCriterion("QUANTIDANGYUAN <=", value, "quantidangyuan");
            return (Criteria) this;
        }

        public Criteria andQuantidangyuanIn(List<Integer> values) {
            addCriterion("QUANTIDANGYUAN in", values, "quantidangyuan");
            return (Criteria) this;
        }

        public Criteria andQuantidangyuanNotIn(List<Integer> values) {
            addCriterion("QUANTIDANGYUAN not in", values, "quantidangyuan");
            return (Criteria) this;
        }

        public Criteria andQuantidangyuanBetween(Integer value1, Integer value2) {
            addCriterion("QUANTIDANGYUAN between", value1, value2, "quantidangyuan");
            return (Criteria) this;
        }

        public Criteria andQuantidangyuanNotBetween(Integer value1, Integer value2) {
            addCriterion("QUANTIDANGYUAN not between", value1, value2, "quantidangyuan");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinianlingIsNull() {
            addCriterion("ZHUANZHINIANLING is null");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinianlingIsNotNull() {
            addCriterion("ZHUANZHINIANLING is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinianlingEqualTo(Integer value) {
            addCriterion("ZHUANZHINIANLING =", value, "zhuanzhinianling");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinianlingNotEqualTo(Integer value) {
            addCriterion("ZHUANZHINIANLING <>", value, "zhuanzhinianling");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinianlingGreaterThan(Integer value) {
            addCriterion("ZHUANZHINIANLING >", value, "zhuanzhinianling");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinianlingGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZHUANZHINIANLING >=", value, "zhuanzhinianling");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinianlingLessThan(Integer value) {
            addCriterion("ZHUANZHINIANLING <", value, "zhuanzhinianling");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinianlingLessThanOrEqualTo(Integer value) {
            addCriterion("ZHUANZHINIANLING <=", value, "zhuanzhinianling");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinianlingIn(List<Integer> values) {
            addCriterion("ZHUANZHINIANLING in", values, "zhuanzhinianling");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinianlingNotIn(List<Integer> values) {
            addCriterion("ZHUANZHINIANLING not in", values, "zhuanzhinianling");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinianlingBetween(Integer value1, Integer value2) {
            addCriterion("ZHUANZHINIANLING between", value1, value2, "zhuanzhinianling");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinianlingNotBetween(Integer value1, Integer value2) {
            addCriterion("ZHUANZHINIANLING not between", value1, value2, "zhuanzhinianling");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinvxingIsNull() {
            addCriterion("ZHUANZHINVXING is null");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinvxingIsNotNull() {
            addCriterion("ZHUANZHINVXING is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinvxingEqualTo(Integer value) {
            addCriterion("ZHUANZHINVXING =", value, "zhuanzhinvxing");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinvxingNotEqualTo(Integer value) {
            addCriterion("ZHUANZHINVXING <>", value, "zhuanzhinvxing");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinvxingGreaterThan(Integer value) {
            addCriterion("ZHUANZHINVXING >", value, "zhuanzhinvxing");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinvxingGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZHUANZHINVXING >=", value, "zhuanzhinvxing");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinvxingLessThan(Integer value) {
            addCriterion("ZHUANZHINVXING <", value, "zhuanzhinvxing");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinvxingLessThanOrEqualTo(Integer value) {
            addCriterion("ZHUANZHINVXING <=", value, "zhuanzhinvxing");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinvxingIn(List<Integer> values) {
            addCriterion("ZHUANZHINVXING in", values, "zhuanzhinvxing");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinvxingNotIn(List<Integer> values) {
            addCriterion("ZHUANZHINVXING not in", values, "zhuanzhinvxing");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinvxingBetween(Integer value1, Integer value2) {
            addCriterion("ZHUANZHINVXING between", value1, value2, "zhuanzhinvxing");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinvxingNotBetween(Integer value1, Integer value2) {
            addCriterion("ZHUANZHINVXING not between", value1, value2, "zhuanzhinvxing");
            return (Criteria) this;
        }

        public Criteria andZhuanzhibenkeIsNull() {
            addCriterion("ZHUANZHIBENKE is null");
            return (Criteria) this;
        }

        public Criteria andZhuanzhibenkeIsNotNull() {
            addCriterion("ZHUANZHIBENKE is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanzhibenkeEqualTo(Integer value) {
            addCriterion("ZHUANZHIBENKE =", value, "zhuanzhibenke");
            return (Criteria) this;
        }

        public Criteria andZhuanzhibenkeNotEqualTo(Integer value) {
            addCriterion("ZHUANZHIBENKE <>", value, "zhuanzhibenke");
            return (Criteria) this;
        }

        public Criteria andZhuanzhibenkeGreaterThan(Integer value) {
            addCriterion("ZHUANZHIBENKE >", value, "zhuanzhibenke");
            return (Criteria) this;
        }

        public Criteria andZhuanzhibenkeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZHUANZHIBENKE >=", value, "zhuanzhibenke");
            return (Criteria) this;
        }

        public Criteria andZhuanzhibenkeLessThan(Integer value) {
            addCriterion("ZHUANZHIBENKE <", value, "zhuanzhibenke");
            return (Criteria) this;
        }

        public Criteria andZhuanzhibenkeLessThanOrEqualTo(Integer value) {
            addCriterion("ZHUANZHIBENKE <=", value, "zhuanzhibenke");
            return (Criteria) this;
        }

        public Criteria andZhuanzhibenkeIn(List<Integer> values) {
            addCriterion("ZHUANZHIBENKE in", values, "zhuanzhibenke");
            return (Criteria) this;
        }

        public Criteria andZhuanzhibenkeNotIn(List<Integer> values) {
            addCriterion("ZHUANZHIBENKE not in", values, "zhuanzhibenke");
            return (Criteria) this;
        }

        public Criteria andZhuanzhibenkeBetween(Integer value1, Integer value2) {
            addCriterion("ZHUANZHIBENKE between", value1, value2, "zhuanzhibenke");
            return (Criteria) this;
        }

        public Criteria andZhuanzhibenkeNotBetween(Integer value1, Integer value2) {
            addCriterion("ZHUANZHIBENKE not between", value1, value2, "zhuanzhibenke");
            return (Criteria) this;
        }

        public Criteria andZhuanzhidangyuanIsNull() {
            addCriterion("ZHUANZHIDANGYUAN is null");
            return (Criteria) this;
        }

        public Criteria andZhuanzhidangyuanIsNotNull() {
            addCriterion("ZHUANZHIDANGYUAN is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanzhidangyuanEqualTo(Integer value) {
            addCriterion("ZHUANZHIDANGYUAN =", value, "zhuanzhidangyuan");
            return (Criteria) this;
        }

        public Criteria andZhuanzhidangyuanNotEqualTo(Integer value) {
            addCriterion("ZHUANZHIDANGYUAN <>", value, "zhuanzhidangyuan");
            return (Criteria) this;
        }

        public Criteria andZhuanzhidangyuanGreaterThan(Integer value) {
            addCriterion("ZHUANZHIDANGYUAN >", value, "zhuanzhidangyuan");
            return (Criteria) this;
        }

        public Criteria andZhuanzhidangyuanGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZHUANZHIDANGYUAN >=", value, "zhuanzhidangyuan");
            return (Criteria) this;
        }

        public Criteria andZhuanzhidangyuanLessThan(Integer value) {
            addCriterion("ZHUANZHIDANGYUAN <", value, "zhuanzhidangyuan");
            return (Criteria) this;
        }

        public Criteria andZhuanzhidangyuanLessThanOrEqualTo(Integer value) {
            addCriterion("ZHUANZHIDANGYUAN <=", value, "zhuanzhidangyuan");
            return (Criteria) this;
        }

        public Criteria andZhuanzhidangyuanIn(List<Integer> values) {
            addCriterion("ZHUANZHIDANGYUAN in", values, "zhuanzhidangyuan");
            return (Criteria) this;
        }

        public Criteria andZhuanzhidangyuanNotIn(List<Integer> values) {
            addCriterion("ZHUANZHIDANGYUAN not in", values, "zhuanzhidangyuan");
            return (Criteria) this;
        }

        public Criteria andZhuanzhidangyuanBetween(Integer value1, Integer value2) {
            addCriterion("ZHUANZHIDANGYUAN between", value1, value2, "zhuanzhidangyuan");
            return (Criteria) this;
        }

        public Criteria andZhuanzhidangyuanNotBetween(Integer value1, Integer value2) {
            addCriterion("ZHUANZHIDANGYUAN not between", value1, value2, "zhuanzhidangyuan");
            return (Criteria) this;
        }

        public Criteria andLaodongshijianIsNull() {
            addCriterion("LAODONGSHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andLaodongshijianIsNotNull() {
            addCriterion("LAODONGSHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLaodongshijianEqualTo(Integer value) {
            addCriterion("LAODONGSHIJIAN =", value, "laodongshijian");
            return (Criteria) this;
        }

        public Criteria andLaodongshijianNotEqualTo(Integer value) {
            addCriterion("LAODONGSHIJIAN <>", value, "laodongshijian");
            return (Criteria) this;
        }

        public Criteria andLaodongshijianGreaterThan(Integer value) {
            addCriterion("LAODONGSHIJIAN >", value, "laodongshijian");
            return (Criteria) this;
        }

        public Criteria andLaodongshijianGreaterThanOrEqualTo(Integer value) {
            addCriterion("LAODONGSHIJIAN >=", value, "laodongshijian");
            return (Criteria) this;
        }

        public Criteria andLaodongshijianLessThan(Integer value) {
            addCriterion("LAODONGSHIJIAN <", value, "laodongshijian");
            return (Criteria) this;
        }

        public Criteria andLaodongshijianLessThanOrEqualTo(Integer value) {
            addCriterion("LAODONGSHIJIAN <=", value, "laodongshijian");
            return (Criteria) this;
        }

        public Criteria andLaodongshijianIn(List<Integer> values) {
            addCriterion("LAODONGSHIJIAN in", values, "laodongshijian");
            return (Criteria) this;
        }

        public Criteria andLaodongshijianNotIn(List<Integer> values) {
            addCriterion("LAODONGSHIJIAN not in", values, "laodongshijian");
            return (Criteria) this;
        }

        public Criteria andLaodongshijianBetween(Integer value1, Integer value2) {
            addCriterion("LAODONGSHIJIAN between", value1, value2, "laodongshijian");
            return (Criteria) this;
        }

        public Criteria andLaodongshijianNotBetween(Integer value1, Integer value2) {
            addCriterion("LAODONGSHIJIAN not between", value1, value2, "laodongshijian");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuIsNull() {
            addCriterion("HUODONGCISHU is null");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuIsNotNull() {
            addCriterion("HUODONGCISHU is not null");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuEqualTo(Integer value) {
            addCriterion("HUODONGCISHU =", value, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuNotEqualTo(Integer value) {
            addCriterion("HUODONGCISHU <>", value, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuGreaterThan(Integer value) {
            addCriterion("HUODONGCISHU >", value, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("HUODONGCISHU >=", value, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuLessThan(Integer value) {
            addCriterion("HUODONGCISHU <", value, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuLessThanOrEqualTo(Integer value) {
            addCriterion("HUODONGCISHU <=", value, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuIn(List<Integer> values) {
            addCriterion("HUODONGCISHU in", values, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuNotIn(List<Integer> values) {
            addCriterion("HUODONGCISHU not in", values, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuBetween(Integer value1, Integer value2) {
            addCriterion("HUODONGCISHU between", value1, value2, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuNotBetween(Integer value1, Integer value2) {
            addCriterion("HUODONGCISHU not between", value1, value2, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andJubancishuIsNull() {
            addCriterion("JUBANCISHU is null");
            return (Criteria) this;
        }

        public Criteria andJubancishuIsNotNull() {
            addCriterion("JUBANCISHU is not null");
            return (Criteria) this;
        }

        public Criteria andJubancishuEqualTo(Integer value) {
            addCriterion("JUBANCISHU =", value, "jubancishu");
            return (Criteria) this;
        }

        public Criteria andJubancishuNotEqualTo(Integer value) {
            addCriterion("JUBANCISHU <>", value, "jubancishu");
            return (Criteria) this;
        }

        public Criteria andJubancishuGreaterThan(Integer value) {
            addCriterion("JUBANCISHU >", value, "jubancishu");
            return (Criteria) this;
        }

        public Criteria andJubancishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("JUBANCISHU >=", value, "jubancishu");
            return (Criteria) this;
        }

        public Criteria andJubancishuLessThan(Integer value) {
            addCriterion("JUBANCISHU <", value, "jubancishu");
            return (Criteria) this;
        }

        public Criteria andJubancishuLessThanOrEqualTo(Integer value) {
            addCriterion("JUBANCISHU <=", value, "jubancishu");
            return (Criteria) this;
        }

        public Criteria andJubancishuIn(List<Integer> values) {
            addCriterion("JUBANCISHU in", values, "jubancishu");
            return (Criteria) this;
        }

        public Criteria andJubancishuNotIn(List<Integer> values) {
            addCriterion("JUBANCISHU not in", values, "jubancishu");
            return (Criteria) this;
        }

        public Criteria andJubancishuBetween(Integer value1, Integer value2) {
            addCriterion("JUBANCISHU between", value1, value2, "jubancishu");
            return (Criteria) this;
        }

        public Criteria andJubancishuNotBetween(Integer value1, Integer value2) {
            addCriterion("JUBANCISHU not between", value1, value2, "jubancishu");
            return (Criteria) this;
        }

        public Criteria andGongyizhichuIsNull() {
            addCriterion("GONGYIZHICHU is null");
            return (Criteria) this;
        }

        public Criteria andGongyizhichuIsNotNull() {
            addCriterion("GONGYIZHICHU is not null");
            return (Criteria) this;
        }

        public Criteria andGongyizhichuEqualTo(BigDecimal value) {
            addCriterion("GONGYIZHICHU =", value, "gongyizhichu");
            return (Criteria) this;
        }

        public Criteria andGongyizhichuNotEqualTo(BigDecimal value) {
            addCriterion("GONGYIZHICHU <>", value, "gongyizhichu");
            return (Criteria) this;
        }

        public Criteria andGongyizhichuGreaterThan(BigDecimal value) {
            addCriterion("GONGYIZHICHU >", value, "gongyizhichu");
            return (Criteria) this;
        }

        public Criteria andGongyizhichuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GONGYIZHICHU >=", value, "gongyizhichu");
            return (Criteria) this;
        }

        public Criteria andGongyizhichuLessThan(BigDecimal value) {
            addCriterion("GONGYIZHICHU <", value, "gongyizhichu");
            return (Criteria) this;
        }

        public Criteria andGongyizhichuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GONGYIZHICHU <=", value, "gongyizhichu");
            return (Criteria) this;
        }

        public Criteria andGongyizhichuIn(List<BigDecimal> values) {
            addCriterion("GONGYIZHICHU in", values, "gongyizhichu");
            return (Criteria) this;
        }

        public Criteria andGongyizhichuNotIn(List<BigDecimal> values) {
            addCriterion("GONGYIZHICHU not in", values, "gongyizhichu");
            return (Criteria) this;
        }

        public Criteria andGongyizhichuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GONGYIZHICHU between", value1, value2, "gongyizhichu");
            return (Criteria) this;
        }

        public Criteria andGongyizhichuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GONGYIZHICHU not between", value1, value2, "gongyizhichu");
            return (Criteria) this;
        }

        public Criteria andXiangmuIsNull() {
            addCriterion("XIANGMU is null");
            return (Criteria) this;
        }

        public Criteria andXiangmuIsNotNull() {
            addCriterion("XIANGMU is not null");
            return (Criteria) this;
        }

        public Criteria andXiangmuEqualTo(Integer value) {
            addCriterion("XIANGMU =", value, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andXiangmuNotEqualTo(Integer value) {
            addCriterion("XIANGMU <>", value, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andXiangmuGreaterThan(Integer value) {
            addCriterion("XIANGMU >", value, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andXiangmuGreaterThanOrEqualTo(Integer value) {
            addCriterion("XIANGMU >=", value, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andXiangmuLessThan(Integer value) {
            addCriterion("XIANGMU <", value, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andXiangmuLessThanOrEqualTo(Integer value) {
            addCriterion("XIANGMU <=", value, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andXiangmuIn(List<Integer> values) {
            addCriterion("XIANGMU in", values, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andXiangmuNotIn(List<Integer> values) {
            addCriterion("XIANGMU not in", values, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andXiangmuBetween(Integer value1, Integer value2) {
            addCriterion("XIANGMU between", value1, value2, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andXiangmuNotBetween(Integer value1, Integer value2) {
            addCriterion("XIANGMU not between", value1, value2, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andHuiyiIsNull() {
            addCriterion("HUIYI is null");
            return (Criteria) this;
        }

        public Criteria andHuiyiIsNotNull() {
            addCriterion("HUIYI is not null");
            return (Criteria) this;
        }

        public Criteria andHuiyiEqualTo(Integer value) {
            addCriterion("HUIYI =", value, "huiyi");
            return (Criteria) this;
        }

        public Criteria andHuiyiNotEqualTo(Integer value) {
            addCriterion("HUIYI <>", value, "huiyi");
            return (Criteria) this;
        }

        public Criteria andHuiyiGreaterThan(Integer value) {
            addCriterion("HUIYI >", value, "huiyi");
            return (Criteria) this;
        }

        public Criteria andHuiyiGreaterThanOrEqualTo(Integer value) {
            addCriterion("HUIYI >=", value, "huiyi");
            return (Criteria) this;
        }

        public Criteria andHuiyiLessThan(Integer value) {
            addCriterion("HUIYI <", value, "huiyi");
            return (Criteria) this;
        }

        public Criteria andHuiyiLessThanOrEqualTo(Integer value) {
            addCriterion("HUIYI <=", value, "huiyi");
            return (Criteria) this;
        }

        public Criteria andHuiyiIn(List<Integer> values) {
            addCriterion("HUIYI in", values, "huiyi");
            return (Criteria) this;
        }

        public Criteria andHuiyiNotIn(List<Integer> values) {
            addCriterion("HUIYI not in", values, "huiyi");
            return (Criteria) this;
        }

        public Criteria andHuiyiBetween(Integer value1, Integer value2) {
            addCriterion("HUIYI between", value1, value2, "huiyi");
            return (Criteria) this;
        }

        public Criteria andHuiyiNotBetween(Integer value1, Integer value2) {
            addCriterion("HUIYI not between", value1, value2, "huiyi");
            return (Criteria) this;
        }

        public Criteria andZuzhiIsNull() {
            addCriterion("ZUZHI is null");
            return (Criteria) this;
        }

        public Criteria andZuzhiIsNotNull() {
            addCriterion("ZUZHI is not null");
            return (Criteria) this;
        }

        public Criteria andZuzhiEqualTo(Integer value) {
            addCriterion("ZUZHI =", value, "zuzhi");
            return (Criteria) this;
        }

        public Criteria andZuzhiNotEqualTo(Integer value) {
            addCriterion("ZUZHI <>", value, "zuzhi");
            return (Criteria) this;
        }

        public Criteria andZuzhiGreaterThan(Integer value) {
            addCriterion("ZUZHI >", value, "zuzhi");
            return (Criteria) this;
        }

        public Criteria andZuzhiGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZUZHI >=", value, "zuzhi");
            return (Criteria) this;
        }

        public Criteria andZuzhiLessThan(Integer value) {
            addCriterion("ZUZHI <", value, "zuzhi");
            return (Criteria) this;
        }

        public Criteria andZuzhiLessThanOrEqualTo(Integer value) {
            addCriterion("ZUZHI <=", value, "zuzhi");
            return (Criteria) this;
        }

        public Criteria andZuzhiIn(List<Integer> values) {
            addCriterion("ZUZHI in", values, "zuzhi");
            return (Criteria) this;
        }

        public Criteria andZuzhiNotIn(List<Integer> values) {
            addCriterion("ZUZHI not in", values, "zuzhi");
            return (Criteria) this;
        }

        public Criteria andZuzhiBetween(Integer value1, Integer value2) {
            addCriterion("ZUZHI between", value1, value2, "zuzhi");
            return (Criteria) this;
        }

        public Criteria andZuzhiNotBetween(Integer value1, Integer value2) {
            addCriterion("ZUZHI not between", value1, value2, "zuzhi");
            return (Criteria) this;
        }

        public Criteria andFangwenIsNull() {
            addCriterion("FANGWEN is null");
            return (Criteria) this;
        }

        public Criteria andFangwenIsNotNull() {
            addCriterion("FANGWEN is not null");
            return (Criteria) this;
        }

        public Criteria andFangwenEqualTo(Integer value) {
            addCriterion("FANGWEN =", value, "fangwen");
            return (Criteria) this;
        }

        public Criteria andFangwenNotEqualTo(Integer value) {
            addCriterion("FANGWEN <>", value, "fangwen");
            return (Criteria) this;
        }

        public Criteria andFangwenGreaterThan(Integer value) {
            addCriterion("FANGWEN >", value, "fangwen");
            return (Criteria) this;
        }

        public Criteria andFangwenGreaterThanOrEqualTo(Integer value) {
            addCriterion("FANGWEN >=", value, "fangwen");
            return (Criteria) this;
        }

        public Criteria andFangwenLessThan(Integer value) {
            addCriterion("FANGWEN <", value, "fangwen");
            return (Criteria) this;
        }

        public Criteria andFangwenLessThanOrEqualTo(Integer value) {
            addCriterion("FANGWEN <=", value, "fangwen");
            return (Criteria) this;
        }

        public Criteria andFangwenIn(List<Integer> values) {
            addCriterion("FANGWEN in", values, "fangwen");
            return (Criteria) this;
        }

        public Criteria andFangwenNotIn(List<Integer> values) {
            addCriterion("FANGWEN not in", values, "fangwen");
            return (Criteria) this;
        }

        public Criteria andFangwenBetween(Integer value1, Integer value2) {
            addCriterion("FANGWEN between", value1, value2, "fangwen");
            return (Criteria) this;
        }

        public Criteria andFangwenNotBetween(Integer value1, Integer value2) {
            addCriterion("FANGWEN not between", value1, value2, "fangwen");
            return (Criteria) this;
        }

        public Criteria andBiaozhanghuodongIsNull() {
            addCriterion("BIAOZHANGHUODONG is null");
            return (Criteria) this;
        }

        public Criteria andBiaozhanghuodongIsNotNull() {
            addCriterion("BIAOZHANGHUODONG is not null");
            return (Criteria) this;
        }

        public Criteria andBiaozhanghuodongEqualTo(Integer value) {
            addCriterion("BIAOZHANGHUODONG =", value, "biaozhanghuodong");
            return (Criteria) this;
        }

        public Criteria andBiaozhanghuodongNotEqualTo(Integer value) {
            addCriterion("BIAOZHANGHUODONG <>", value, "biaozhanghuodong");
            return (Criteria) this;
        }

        public Criteria andBiaozhanghuodongGreaterThan(Integer value) {
            addCriterion("BIAOZHANGHUODONG >", value, "biaozhanghuodong");
            return (Criteria) this;
        }

        public Criteria andBiaozhanghuodongGreaterThanOrEqualTo(Integer value) {
            addCriterion("BIAOZHANGHUODONG >=", value, "biaozhanghuodong");
            return (Criteria) this;
        }

        public Criteria andBiaozhanghuodongLessThan(Integer value) {
            addCriterion("BIAOZHANGHUODONG <", value, "biaozhanghuodong");
            return (Criteria) this;
        }

        public Criteria andBiaozhanghuodongLessThanOrEqualTo(Integer value) {
            addCriterion("BIAOZHANGHUODONG <=", value, "biaozhanghuodong");
            return (Criteria) this;
        }

        public Criteria andBiaozhanghuodongIn(List<Integer> values) {
            addCriterion("BIAOZHANGHUODONG in", values, "biaozhanghuodong");
            return (Criteria) this;
        }

        public Criteria andBiaozhanghuodongNotIn(List<Integer> values) {
            addCriterion("BIAOZHANGHUODONG not in", values, "biaozhanghuodong");
            return (Criteria) this;
        }

        public Criteria andBiaozhanghuodongBetween(Integer value1, Integer value2) {
            addCriterion("BIAOZHANGHUODONG between", value1, value2, "biaozhanghuodong");
            return (Criteria) this;
        }

        public Criteria andBiaozhanghuodongNotBetween(Integer value1, Integer value2) {
            addCriterion("BIAOZHANGHUODONG not between", value1, value2, "biaozhanghuodong");
            return (Criteria) this;
        }

        public Criteria andShouhuifeiIsNull() {
            addCriterion("SHOUHUIFEI is null");
            return (Criteria) this;
        }

        public Criteria andShouhuifeiIsNotNull() {
            addCriterion("SHOUHUIFEI is not null");
            return (Criteria) this;
        }

        public Criteria andShouhuifeiEqualTo(String value) {
            addCriterion("SHOUHUIFEI =", value, "shouhuifei");
            return (Criteria) this;
        }

        public Criteria andShouhuifeiNotEqualTo(String value) {
            addCriterion("SHOUHUIFEI <>", value, "shouhuifei");
            return (Criteria) this;
        }

        public Criteria andShouhuifeiGreaterThan(String value) {
            addCriterion("SHOUHUIFEI >", value, "shouhuifei");
            return (Criteria) this;
        }

        public Criteria andShouhuifeiGreaterThanOrEqualTo(String value) {
            addCriterion("SHOUHUIFEI >=", value, "shouhuifei");
            return (Criteria) this;
        }

        public Criteria andShouhuifeiLessThan(String value) {
            addCriterion("SHOUHUIFEI <", value, "shouhuifei");
            return (Criteria) this;
        }

        public Criteria andShouhuifeiLessThanOrEqualTo(String value) {
            addCriterion("SHOUHUIFEI <=", value, "shouhuifei");
            return (Criteria) this;
        }

        public Criteria andShouhuifeiLike(String value) {
            addCriterion("SHOUHUIFEI like", value, "shouhuifei");
            return (Criteria) this;
        }

        public Criteria andShouhuifeiNotLike(String value) {
            addCriterion("SHOUHUIFEI not like", value, "shouhuifei");
            return (Criteria) this;
        }

        public Criteria andShouhuifeiIn(List<String> values) {
            addCriterion("SHOUHUIFEI in", values, "shouhuifei");
            return (Criteria) this;
        }

        public Criteria andShouhuifeiNotIn(List<String> values) {
            addCriterion("SHOUHUIFEI not in", values, "shouhuifei");
            return (Criteria) this;
        }

        public Criteria andShouhuifeiBetween(String value1, String value2) {
            addCriterion("SHOUHUIFEI between", value1, value2, "shouhuifei");
            return (Criteria) this;
        }

        public Criteria andShouhuifeiNotBetween(String value1, String value2) {
            addCriterion("SHOUHUIFEI not between", value1, value2, "shouhuifei");
            return (Criteria) this;
        }

        public Criteria andHeshubangongIsNull() {
            addCriterion("HESHUBANGONG is null");
            return (Criteria) this;
        }

        public Criteria andHeshubangongIsNotNull() {
            addCriterion("HESHUBANGONG is not null");
            return (Criteria) this;
        }

        public Criteria andHeshubangongEqualTo(String value) {
            addCriterion("HESHUBANGONG =", value, "heshubangong");
            return (Criteria) this;
        }

        public Criteria andHeshubangongNotEqualTo(String value) {
            addCriterion("HESHUBANGONG <>", value, "heshubangong");
            return (Criteria) this;
        }

        public Criteria andHeshubangongGreaterThan(String value) {
            addCriterion("HESHUBANGONG >", value, "heshubangong");
            return (Criteria) this;
        }

        public Criteria andHeshubangongGreaterThanOrEqualTo(String value) {
            addCriterion("HESHUBANGONG >=", value, "heshubangong");
            return (Criteria) this;
        }

        public Criteria andHeshubangongLessThan(String value) {
            addCriterion("HESHUBANGONG <", value, "heshubangong");
            return (Criteria) this;
        }

        public Criteria andHeshubangongLessThanOrEqualTo(String value) {
            addCriterion("HESHUBANGONG <=", value, "heshubangong");
            return (Criteria) this;
        }

        public Criteria andHeshubangongLike(String value) {
            addCriterion("HESHUBANGONG like", value, "heshubangong");
            return (Criteria) this;
        }

        public Criteria andHeshubangongNotLike(String value) {
            addCriterion("HESHUBANGONG not like", value, "heshubangong");
            return (Criteria) this;
        }

        public Criteria andHeshubangongIn(List<String> values) {
            addCriterion("HESHUBANGONG in", values, "heshubangong");
            return (Criteria) this;
        }

        public Criteria andHeshubangongNotIn(List<String> values) {
            addCriterion("HESHUBANGONG not in", values, "heshubangong");
            return (Criteria) this;
        }

        public Criteria andHeshubangongBetween(String value1, String value2) {
            addCriterion("HESHUBANGONG between", value1, value2, "heshubangong");
            return (Criteria) this;
        }

        public Criteria andHeshubangongNotBetween(String value1, String value2) {
            addCriterion("HESHUBANGONG not between", value1, value2, "heshubangong");
            return (Criteria) this;
        }

        public Criteria andLishidanweizhiwuIsNull() {
            addCriterion("LISHIDANWEIZHIWU is null");
            return (Criteria) this;
        }

        public Criteria andLishidanweizhiwuIsNotNull() {
            addCriterion("LISHIDANWEIZHIWU is not null");
            return (Criteria) this;
        }

        public Criteria andLishidanweizhiwuEqualTo(String value) {
            addCriterion("LISHIDANWEIZHIWU =", value, "lishidanweizhiwu");
            return (Criteria) this;
        }

        public Criteria andLishidanweizhiwuNotEqualTo(String value) {
            addCriterion("LISHIDANWEIZHIWU <>", value, "lishidanweizhiwu");
            return (Criteria) this;
        }

        public Criteria andLishidanweizhiwuGreaterThan(String value) {
            addCriterion("LISHIDANWEIZHIWU >", value, "lishidanweizhiwu");
            return (Criteria) this;
        }

        public Criteria andLishidanweizhiwuGreaterThanOrEqualTo(String value) {
            addCriterion("LISHIDANWEIZHIWU >=", value, "lishidanweizhiwu");
            return (Criteria) this;
        }

        public Criteria andLishidanweizhiwuLessThan(String value) {
            addCriterion("LISHIDANWEIZHIWU <", value, "lishidanweizhiwu");
            return (Criteria) this;
        }

        public Criteria andLishidanweizhiwuLessThanOrEqualTo(String value) {
            addCriterion("LISHIDANWEIZHIWU <=", value, "lishidanweizhiwu");
            return (Criteria) this;
        }

        public Criteria andLishidanweizhiwuLike(String value) {
            addCriterion("LISHIDANWEIZHIWU like", value, "lishidanweizhiwu");
            return (Criteria) this;
        }

        public Criteria andLishidanweizhiwuNotLike(String value) {
            addCriterion("LISHIDANWEIZHIWU not like", value, "lishidanweizhiwu");
            return (Criteria) this;
        }

        public Criteria andLishidanweizhiwuIn(List<String> values) {
            addCriterion("LISHIDANWEIZHIWU in", values, "lishidanweizhiwu");
            return (Criteria) this;
        }

        public Criteria andLishidanweizhiwuNotIn(List<String> values) {
            addCriterion("LISHIDANWEIZHIWU not in", values, "lishidanweizhiwu");
            return (Criteria) this;
        }

        public Criteria andLishidanweizhiwuBetween(String value1, String value2) {
            addCriterion("LISHIDANWEIZHIWU between", value1, value2, "lishidanweizhiwu");
            return (Criteria) this;
        }

        public Criteria andLishidanweizhiwuNotBetween(String value1, String value2) {
            addCriterion("LISHIDANWEIZHIWU not between", value1, value2, "lishidanweizhiwu");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1IsNull() {
            addCriterion("TJNJJIEGUO1 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1IsNotNull() {
            addCriterion("TJNJJIEGUO1 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1EqualTo(String value) {
            addCriterion("TJNJJIEGUO1 =", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1NotEqualTo(String value) {
            addCriterion("TJNJJIEGUO1 <>", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1GreaterThan(String value) {
            addCriterion("TJNJJIEGUO1 >", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1GreaterThanOrEqualTo(String value) {
            addCriterion("TJNJJIEGUO1 >=", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1LessThan(String value) {
            addCriterion("TJNJJIEGUO1 <", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1LessThanOrEqualTo(String value) {
            addCriterion("TJNJJIEGUO1 <=", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1Like(String value) {
            addCriterion("TJNJJIEGUO1 like", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1NotLike(String value) {
            addCriterion("TJNJJIEGUO1 not like", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1In(List<String> values) {
            addCriterion("TJNJJIEGUO1 in", values, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1NotIn(List<String> values) {
            addCriterion("TJNJJIEGUO1 not in", values, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1Between(String value1, String value2) {
            addCriterion("TJNJJIEGUO1 between", value1, value2, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1NotBetween(String value1, String value2) {
            addCriterion("TJNJJIEGUO1 not between", value1, value2, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2IsNull() {
            addCriterion("TJNJJIEGUO2 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2IsNotNull() {
            addCriterion("TJNJJIEGUO2 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2EqualTo(String value) {
            addCriterion("TJNJJIEGUO2 =", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2NotEqualTo(String value) {
            addCriterion("TJNJJIEGUO2 <>", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2GreaterThan(String value) {
            addCriterion("TJNJJIEGUO2 >", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2GreaterThanOrEqualTo(String value) {
            addCriterion("TJNJJIEGUO2 >=", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2LessThan(String value) {
            addCriterion("TJNJJIEGUO2 <", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2LessThanOrEqualTo(String value) {
            addCriterion("TJNJJIEGUO2 <=", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2Like(String value) {
            addCriterion("TJNJJIEGUO2 like", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2NotLike(String value) {
            addCriterion("TJNJJIEGUO2 not like", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2In(List<String> values) {
            addCriterion("TJNJJIEGUO2 in", values, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2NotIn(List<String> values) {
            addCriterion("TJNJJIEGUO2 not in", values, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2Between(String value1, String value2) {
            addCriterion("TJNJJIEGUO2 between", value1, value2, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2NotBetween(String value1, String value2) {
            addCriterion("TJNJJIEGUO2 not between", value1, value2, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1IsNull() {
            addCriterion("TJNJYIJIAN1 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1IsNotNull() {
            addCriterion("TJNJYIJIAN1 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1EqualTo(String value) {
            addCriterion("TJNJYIJIAN1 =", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1NotEqualTo(String value) {
            addCriterion("TJNJYIJIAN1 <>", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1GreaterThan(String value) {
            addCriterion("TJNJYIJIAN1 >", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1GreaterThanOrEqualTo(String value) {
            addCriterion("TJNJYIJIAN1 >=", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1LessThan(String value) {
            addCriterion("TJNJYIJIAN1 <", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1LessThanOrEqualTo(String value) {
            addCriterion("TJNJYIJIAN1 <=", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1Like(String value) {
            addCriterion("TJNJYIJIAN1 like", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1NotLike(String value) {
            addCriterion("TJNJYIJIAN1 not like", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1In(List<String> values) {
            addCriterion("TJNJYIJIAN1 in", values, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1NotIn(List<String> values) {
            addCriterion("TJNJYIJIAN1 not in", values, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1Between(String value1, String value2) {
            addCriterion("TJNJYIJIAN1 between", value1, value2, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1NotBetween(String value1, String value2) {
            addCriterion("TJNJYIJIAN1 not between", value1, value2, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2IsNull() {
            addCriterion("TJNJYIJIAN2 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2IsNotNull() {
            addCriterion("TJNJYIJIAN2 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2EqualTo(String value) {
            addCriterion("TJNJYIJIAN2 =", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2NotEqualTo(String value) {
            addCriterion("TJNJYIJIAN2 <>", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2GreaterThan(String value) {
            addCriterion("TJNJYIJIAN2 >", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2GreaterThanOrEqualTo(String value) {
            addCriterion("TJNJYIJIAN2 >=", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2LessThan(String value) {
            addCriterion("TJNJYIJIAN2 <", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2LessThanOrEqualTo(String value) {
            addCriterion("TJNJYIJIAN2 <=", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2Like(String value) {
            addCriterion("TJNJYIJIAN2 like", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2NotLike(String value) {
            addCriterion("TJNJYIJIAN2 not like", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2In(List<String> values) {
            addCriterion("TJNJYIJIAN2 in", values, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2NotIn(List<String> values) {
            addCriterion("TJNJYIJIAN2 not in", values, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2Between(String value1, String value2) {
            addCriterion("TJNJYIJIAN2 between", value1, value2, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2NotBetween(String value1, String value2) {
            addCriterion("TJNJYIJIAN2 not between", value1, value2, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1IsNull() {
            addCriterion("TJNJXINGMING1 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1IsNotNull() {
            addCriterion("TJNJXINGMING1 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1EqualTo(String value) {
            addCriterion("TJNJXINGMING1 =", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1NotEqualTo(String value) {
            addCriterion("TJNJXINGMING1 <>", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1GreaterThan(String value) {
            addCriterion("TJNJXINGMING1 >", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1GreaterThanOrEqualTo(String value) {
            addCriterion("TJNJXINGMING1 >=", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1LessThan(String value) {
            addCriterion("TJNJXINGMING1 <", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1LessThanOrEqualTo(String value) {
            addCriterion("TJNJXINGMING1 <=", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1Like(String value) {
            addCriterion("TJNJXINGMING1 like", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1NotLike(String value) {
            addCriterion("TJNJXINGMING1 not like", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1In(List<String> values) {
            addCriterion("TJNJXINGMING1 in", values, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1NotIn(List<String> values) {
            addCriterion("TJNJXINGMING1 not in", values, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1Between(String value1, String value2) {
            addCriterion("TJNJXINGMING1 between", value1, value2, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1NotBetween(String value1, String value2) {
            addCriterion("TJNJXINGMING1 not between", value1, value2, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2IsNull() {
            addCriterion("TJNJXINGMING2 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2IsNotNull() {
            addCriterion("TJNJXINGMING2 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2EqualTo(String value) {
            addCriterion("TJNJXINGMING2 =", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2NotEqualTo(String value) {
            addCriterion("TJNJXINGMING2 <>", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2GreaterThan(String value) {
            addCriterion("TJNJXINGMING2 >", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2GreaterThanOrEqualTo(String value) {
            addCriterion("TJNJXINGMING2 >=", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2LessThan(String value) {
            addCriterion("TJNJXINGMING2 <", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2LessThanOrEqualTo(String value) {
            addCriterion("TJNJXINGMING2 <=", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2Like(String value) {
            addCriterion("TJNJXINGMING2 like", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2NotLike(String value) {
            addCriterion("TJNJXINGMING2 not like", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2In(List<String> values) {
            addCriterion("TJNJXINGMING2 in", values, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2NotIn(List<String> values) {
            addCriterion("TJNJXINGMING2 not in", values, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2Between(String value1, String value2) {
            addCriterion("TJNJXINGMING2 between", value1, value2, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2NotBetween(String value1, String value2) {
            addCriterion("TJNJXINGMING2 not between", value1, value2, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1IsNull() {
            addCriterion("TJNJSHIJIAN1 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1IsNotNull() {
            addCriterion("TJNJSHIJIAN1 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1EqualTo(Date value) {
            addCriterion("TJNJSHIJIAN1 =", value, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1NotEqualTo(Date value) {
            addCriterion("TJNJSHIJIAN1 <>", value, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1GreaterThan(Date value) {
            addCriterion("TJNJSHIJIAN1 >", value, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1GreaterThanOrEqualTo(Date value) {
            addCriterion("TJNJSHIJIAN1 >=", value, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1LessThan(Date value) {
            addCriterion("TJNJSHIJIAN1 <", value, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1LessThanOrEqualTo(Date value) {
            addCriterion("TJNJSHIJIAN1 <=", value, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1In(List<Date> values) {
            addCriterion("TJNJSHIJIAN1 in", values, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1NotIn(List<Date> values) {
            addCriterion("TJNJSHIJIAN1 not in", values, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1Between(Date value1, Date value2) {
            addCriterion("TJNJSHIJIAN1 between", value1, value2, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1NotBetween(Date value1, Date value2) {
            addCriterion("TJNJSHIJIAN1 not between", value1, value2, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2IsNull() {
            addCriterion("TJNJSHIJIAN2 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2IsNotNull() {
            addCriterion("TJNJSHIJIAN2 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2EqualTo(Date value) {
            addCriterion("TJNJSHIJIAN2 =", value, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2NotEqualTo(Date value) {
            addCriterion("TJNJSHIJIAN2 <>", value, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2GreaterThan(Date value) {
            addCriterion("TJNJSHIJIAN2 >", value, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2GreaterThanOrEqualTo(Date value) {
            addCriterion("TJNJSHIJIAN2 >=", value, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2LessThan(Date value) {
            addCriterion("TJNJSHIJIAN2 <", value, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2LessThanOrEqualTo(Date value) {
            addCriterion("TJNJSHIJIAN2 <=", value, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2In(List<Date> values) {
            addCriterion("TJNJSHIJIAN2 in", values, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2NotIn(List<Date> values) {
            addCriterion("TJNJSHIJIAN2 not in", values, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2Between(Date value1, Date value2) {
            addCriterion("TJNJSHIJIAN2 between", value1, value2, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2NotBetween(Date value1, Date value2) {
            addCriterion("TJNJSHIJIAN2 not between", value1, value2, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andLingqubaochouIsNull() {
            addCriterion("LINGQUBAOCHOU is null");
            return (Criteria) this;
        }

        public Criteria andLingqubaochouIsNotNull() {
            addCriterion("LINGQUBAOCHOU is not null");
            return (Criteria) this;
        }

        public Criteria andLingqubaochouEqualTo(Integer value) {
            addCriterion("LINGQUBAOCHOU =", value, "lingqubaochou");
            return (Criteria) this;
        }

        public Criteria andLingqubaochouNotEqualTo(Integer value) {
            addCriterion("LINGQUBAOCHOU <>", value, "lingqubaochou");
            return (Criteria) this;
        }

        public Criteria andLingqubaochouGreaterThan(Integer value) {
            addCriterion("LINGQUBAOCHOU >", value, "lingqubaochou");
            return (Criteria) this;
        }

        public Criteria andLingqubaochouGreaterThanOrEqualTo(Integer value) {
            addCriterion("LINGQUBAOCHOU >=", value, "lingqubaochou");
            return (Criteria) this;
        }

        public Criteria andLingqubaochouLessThan(Integer value) {
            addCriterion("LINGQUBAOCHOU <", value, "lingqubaochou");
            return (Criteria) this;
        }

        public Criteria andLingqubaochouLessThanOrEqualTo(Integer value) {
            addCriterion("LINGQUBAOCHOU <=", value, "lingqubaochou");
            return (Criteria) this;
        }

        public Criteria andLingqubaochouIn(List<Integer> values) {
            addCriterion("LINGQUBAOCHOU in", values, "lingqubaochou");
            return (Criteria) this;
        }

        public Criteria andLingqubaochouNotIn(List<Integer> values) {
            addCriterion("LINGQUBAOCHOU not in", values, "lingqubaochou");
            return (Criteria) this;
        }

        public Criteria andLingqubaochouBetween(Integer value1, Integer value2) {
            addCriterion("LINGQUBAOCHOU between", value1, value2, "lingqubaochou");
            return (Criteria) this;
        }

        public Criteria andLingqubaochouNotBetween(Integer value1, Integer value2) {
            addCriterion("LINGQUBAOCHOU not between", value1, value2, "lingqubaochou");
            return (Criteria) this;
        }

        public Criteria andGongwuyuanzaizhiIsNull() {
            addCriterion("GONGWUYUANZAIZHI is null");
            return (Criteria) this;
        }

        public Criteria andGongwuyuanzaizhiIsNotNull() {
            addCriterion("GONGWUYUANZAIZHI is not null");
            return (Criteria) this;
        }

        public Criteria andGongwuyuanzaizhiEqualTo(Integer value) {
            addCriterion("GONGWUYUANZAIZHI =", value, "gongwuyuanzaizhi");
            return (Criteria) this;
        }

        public Criteria andGongwuyuanzaizhiNotEqualTo(Integer value) {
            addCriterion("GONGWUYUANZAIZHI <>", value, "gongwuyuanzaizhi");
            return (Criteria) this;
        }

        public Criteria andGongwuyuanzaizhiGreaterThan(Integer value) {
            addCriterion("GONGWUYUANZAIZHI >", value, "gongwuyuanzaizhi");
            return (Criteria) this;
        }

        public Criteria andGongwuyuanzaizhiGreaterThanOrEqualTo(Integer value) {
            addCriterion("GONGWUYUANZAIZHI >=", value, "gongwuyuanzaizhi");
            return (Criteria) this;
        }

        public Criteria andGongwuyuanzaizhiLessThan(Integer value) {
            addCriterion("GONGWUYUANZAIZHI <", value, "gongwuyuanzaizhi");
            return (Criteria) this;
        }

        public Criteria andGongwuyuanzaizhiLessThanOrEqualTo(Integer value) {
            addCriterion("GONGWUYUANZAIZHI <=", value, "gongwuyuanzaizhi");
            return (Criteria) this;
        }

        public Criteria andGongwuyuanzaizhiIn(List<Integer> values) {
            addCriterion("GONGWUYUANZAIZHI in", values, "gongwuyuanzaizhi");
            return (Criteria) this;
        }

        public Criteria andGongwuyuanzaizhiNotIn(List<Integer> values) {
            addCriterion("GONGWUYUANZAIZHI not in", values, "gongwuyuanzaizhi");
            return (Criteria) this;
        }

        public Criteria andGongwuyuanzaizhiBetween(Integer value1, Integer value2) {
            addCriterion("GONGWUYUANZAIZHI between", value1, value2, "gongwuyuanzaizhi");
            return (Criteria) this;
        }

        public Criteria andGongwuyuanzaizhiNotBetween(Integer value1, Integer value2) {
            addCriterion("GONGWUYUANZAIZHI not between", value1, value2, "gongwuyuanzaizhi");
            return (Criteria) this;
        }

        public Criteria andZaizhijujiIsNull() {
            addCriterion("ZAIZHIJUJI is null");
            return (Criteria) this;
        }

        public Criteria andZaizhijujiIsNotNull() {
            addCriterion("ZAIZHIJUJI is not null");
            return (Criteria) this;
        }

        public Criteria andZaizhijujiEqualTo(Integer value) {
            addCriterion("ZAIZHIJUJI =", value, "zaizhijuji");
            return (Criteria) this;
        }

        public Criteria andZaizhijujiNotEqualTo(Integer value) {
            addCriterion("ZAIZHIJUJI <>", value, "zaizhijuji");
            return (Criteria) this;
        }

        public Criteria andZaizhijujiGreaterThan(Integer value) {
            addCriterion("ZAIZHIJUJI >", value, "zaizhijuji");
            return (Criteria) this;
        }

        public Criteria andZaizhijujiGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZAIZHIJUJI >=", value, "zaizhijuji");
            return (Criteria) this;
        }

        public Criteria andZaizhijujiLessThan(Integer value) {
            addCriterion("ZAIZHIJUJI <", value, "zaizhijuji");
            return (Criteria) this;
        }

        public Criteria andZaizhijujiLessThanOrEqualTo(Integer value) {
            addCriterion("ZAIZHIJUJI <=", value, "zaizhijuji");
            return (Criteria) this;
        }

        public Criteria andZaizhijujiIn(List<Integer> values) {
            addCriterion("ZAIZHIJUJI in", values, "zaizhijuji");
            return (Criteria) this;
        }

        public Criteria andZaizhijujiNotIn(List<Integer> values) {
            addCriterion("ZAIZHIJUJI not in", values, "zaizhijuji");
            return (Criteria) this;
        }

        public Criteria andZaizhijujiBetween(Integer value1, Integer value2) {
            addCriterion("ZAIZHIJUJI between", value1, value2, "zaizhijuji");
            return (Criteria) this;
        }

        public Criteria andZaizhijujiNotBetween(Integer value1, Integer value2) {
            addCriterion("ZAIZHIJUJI not between", value1, value2, "zaizhijuji");
            return (Criteria) this;
        }

        public Criteria andZaizhichujiIsNull() {
            addCriterion("ZAIZHICHUJI is null");
            return (Criteria) this;
        }

        public Criteria andZaizhichujiIsNotNull() {
            addCriterion("ZAIZHICHUJI is not null");
            return (Criteria) this;
        }

        public Criteria andZaizhichujiEqualTo(Integer value) {
            addCriterion("ZAIZHICHUJI =", value, "zaizhichuji");
            return (Criteria) this;
        }

        public Criteria andZaizhichujiNotEqualTo(Integer value) {
            addCriterion("ZAIZHICHUJI <>", value, "zaizhichuji");
            return (Criteria) this;
        }

        public Criteria andZaizhichujiGreaterThan(Integer value) {
            addCriterion("ZAIZHICHUJI >", value, "zaizhichuji");
            return (Criteria) this;
        }

        public Criteria andZaizhichujiGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZAIZHICHUJI >=", value, "zaizhichuji");
            return (Criteria) this;
        }

        public Criteria andZaizhichujiLessThan(Integer value) {
            addCriterion("ZAIZHICHUJI <", value, "zaizhichuji");
            return (Criteria) this;
        }

        public Criteria andZaizhichujiLessThanOrEqualTo(Integer value) {
            addCriterion("ZAIZHICHUJI <=", value, "zaizhichuji");
            return (Criteria) this;
        }

        public Criteria andZaizhichujiIn(List<Integer> values) {
            addCriterion("ZAIZHICHUJI in", values, "zaizhichuji");
            return (Criteria) this;
        }

        public Criteria andZaizhichujiNotIn(List<Integer> values) {
            addCriterion("ZAIZHICHUJI not in", values, "zaizhichuji");
            return (Criteria) this;
        }

        public Criteria andZaizhichujiBetween(Integer value1, Integer value2) {
            addCriterion("ZAIZHICHUJI between", value1, value2, "zaizhichuji");
            return (Criteria) this;
        }

        public Criteria andZaizhichujiNotBetween(Integer value1, Integer value2) {
            addCriterion("ZAIZHICHUJI not between", value1, value2, "zaizhichuji");
            return (Criteria) this;
        }

        public Criteria andGongwuyuanlituixiuIsNull() {
            addCriterion("GONGWUYUANLITUIXIU is null");
            return (Criteria) this;
        }

        public Criteria andGongwuyuanlituixiuIsNotNull() {
            addCriterion("GONGWUYUANLITUIXIU is not null");
            return (Criteria) this;
        }

        public Criteria andGongwuyuanlituixiuEqualTo(Integer value) {
            addCriterion("GONGWUYUANLITUIXIU =", value, "gongwuyuanlituixiu");
            return (Criteria) this;
        }

        public Criteria andGongwuyuanlituixiuNotEqualTo(Integer value) {
            addCriterion("GONGWUYUANLITUIXIU <>", value, "gongwuyuanlituixiu");
            return (Criteria) this;
        }

        public Criteria andGongwuyuanlituixiuGreaterThan(Integer value) {
            addCriterion("GONGWUYUANLITUIXIU >", value, "gongwuyuanlituixiu");
            return (Criteria) this;
        }

        public Criteria andGongwuyuanlituixiuGreaterThanOrEqualTo(Integer value) {
            addCriterion("GONGWUYUANLITUIXIU >=", value, "gongwuyuanlituixiu");
            return (Criteria) this;
        }

        public Criteria andGongwuyuanlituixiuLessThan(Integer value) {
            addCriterion("GONGWUYUANLITUIXIU <", value, "gongwuyuanlituixiu");
            return (Criteria) this;
        }

        public Criteria andGongwuyuanlituixiuLessThanOrEqualTo(Integer value) {
            addCriterion("GONGWUYUANLITUIXIU <=", value, "gongwuyuanlituixiu");
            return (Criteria) this;
        }

        public Criteria andGongwuyuanlituixiuIn(List<Integer> values) {
            addCriterion("GONGWUYUANLITUIXIU in", values, "gongwuyuanlituixiu");
            return (Criteria) this;
        }

        public Criteria andGongwuyuanlituixiuNotIn(List<Integer> values) {
            addCriterion("GONGWUYUANLITUIXIU not in", values, "gongwuyuanlituixiu");
            return (Criteria) this;
        }

        public Criteria andGongwuyuanlituixiuBetween(Integer value1, Integer value2) {
            addCriterion("GONGWUYUANLITUIXIU between", value1, value2, "gongwuyuanlituixiu");
            return (Criteria) this;
        }

        public Criteria andGongwuyuanlituixiuNotBetween(Integer value1, Integer value2) {
            addCriterion("GONGWUYUANLITUIXIU not between", value1, value2, "gongwuyuanlituixiu");
            return (Criteria) this;
        }

        public Criteria andLituixiujujiIsNull() {
            addCriterion("LITUIXIUJUJI is null");
            return (Criteria) this;
        }

        public Criteria andLituixiujujiIsNotNull() {
            addCriterion("LITUIXIUJUJI is not null");
            return (Criteria) this;
        }

        public Criteria andLituixiujujiEqualTo(Integer value) {
            addCriterion("LITUIXIUJUJI =", value, "lituixiujuji");
            return (Criteria) this;
        }

        public Criteria andLituixiujujiNotEqualTo(Integer value) {
            addCriterion("LITUIXIUJUJI <>", value, "lituixiujuji");
            return (Criteria) this;
        }

        public Criteria andLituixiujujiGreaterThan(Integer value) {
            addCriterion("LITUIXIUJUJI >", value, "lituixiujuji");
            return (Criteria) this;
        }

        public Criteria andLituixiujujiGreaterThanOrEqualTo(Integer value) {
            addCriterion("LITUIXIUJUJI >=", value, "lituixiujuji");
            return (Criteria) this;
        }

        public Criteria andLituixiujujiLessThan(Integer value) {
            addCriterion("LITUIXIUJUJI <", value, "lituixiujuji");
            return (Criteria) this;
        }

        public Criteria andLituixiujujiLessThanOrEqualTo(Integer value) {
            addCriterion("LITUIXIUJUJI <=", value, "lituixiujuji");
            return (Criteria) this;
        }

        public Criteria andLituixiujujiIn(List<Integer> values) {
            addCriterion("LITUIXIUJUJI in", values, "lituixiujuji");
            return (Criteria) this;
        }

        public Criteria andLituixiujujiNotIn(List<Integer> values) {
            addCriterion("LITUIXIUJUJI not in", values, "lituixiujuji");
            return (Criteria) this;
        }

        public Criteria andLituixiujujiBetween(Integer value1, Integer value2) {
            addCriterion("LITUIXIUJUJI between", value1, value2, "lituixiujuji");
            return (Criteria) this;
        }

        public Criteria andLituixiujujiNotBetween(Integer value1, Integer value2) {
            addCriterion("LITUIXIUJUJI not between", value1, value2, "lituixiujuji");
            return (Criteria) this;
        }

        public Criteria andLituixiuchujiIsNull() {
            addCriterion("LITUIXIUCHUJI is null");
            return (Criteria) this;
        }

        public Criteria andLituixiuchujiIsNotNull() {
            addCriterion("LITUIXIUCHUJI is not null");
            return (Criteria) this;
        }

        public Criteria andLituixiuchujiEqualTo(Integer value) {
            addCriterion("LITUIXIUCHUJI =", value, "lituixiuchuji");
            return (Criteria) this;
        }

        public Criteria andLituixiuchujiNotEqualTo(Integer value) {
            addCriterion("LITUIXIUCHUJI <>", value, "lituixiuchuji");
            return (Criteria) this;
        }

        public Criteria andLituixiuchujiGreaterThan(Integer value) {
            addCriterion("LITUIXIUCHUJI >", value, "lituixiuchuji");
            return (Criteria) this;
        }

        public Criteria andLituixiuchujiGreaterThanOrEqualTo(Integer value) {
            addCriterion("LITUIXIUCHUJI >=", value, "lituixiuchuji");
            return (Criteria) this;
        }

        public Criteria andLituixiuchujiLessThan(Integer value) {
            addCriterion("LITUIXIUCHUJI <", value, "lituixiuchuji");
            return (Criteria) this;
        }

        public Criteria andLituixiuchujiLessThanOrEqualTo(Integer value) {
            addCriterion("LITUIXIUCHUJI <=", value, "lituixiuchuji");
            return (Criteria) this;
        }

        public Criteria andLituixiuchujiIn(List<Integer> values) {
            addCriterion("LITUIXIUCHUJI in", values, "lituixiuchuji");
            return (Criteria) this;
        }

        public Criteria andLituixiuchujiNotIn(List<Integer> values) {
            addCriterion("LITUIXIUCHUJI not in", values, "lituixiuchuji");
            return (Criteria) this;
        }

        public Criteria andLituixiuchujiBetween(Integer value1, Integer value2) {
            addCriterion("LITUIXIUCHUJI between", value1, value2, "lituixiuchuji");
            return (Criteria) this;
        }

        public Criteria andLituixiuchujiNotBetween(Integer value1, Integer value2) {
            addCriterion("LITUIXIUCHUJI not between", value1, value2, "lituixiuchuji");
            return (Criteria) this;
        }

        public Criteria andMujizijinshuIsNull() {
            addCriterion("MUJIZIJINSHU is null");
            return (Criteria) this;
        }

        public Criteria andMujizijinshuIsNotNull() {
            addCriterion("MUJIZIJINSHU is not null");
            return (Criteria) this;
        }

        public Criteria andMujizijinshuEqualTo(BigDecimal value) {
            addCriterion("MUJIZIJINSHU =", value, "mujizijinshu");
            return (Criteria) this;
        }

        public Criteria andMujizijinshuNotEqualTo(BigDecimal value) {
            addCriterion("MUJIZIJINSHU <>", value, "mujizijinshu");
            return (Criteria) this;
        }

        public Criteria andMujizijinshuGreaterThan(BigDecimal value) {
            addCriterion("MUJIZIJINSHU >", value, "mujizijinshu");
            return (Criteria) this;
        }

        public Criteria andMujizijinshuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MUJIZIJINSHU >=", value, "mujizijinshu");
            return (Criteria) this;
        }

        public Criteria andMujizijinshuLessThan(BigDecimal value) {
            addCriterion("MUJIZIJINSHU <", value, "mujizijinshu");
            return (Criteria) this;
        }

        public Criteria andMujizijinshuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MUJIZIJINSHU <=", value, "mujizijinshu");
            return (Criteria) this;
        }

        public Criteria andMujizijinshuIn(List<BigDecimal> values) {
            addCriterion("MUJIZIJINSHU in", values, "mujizijinshu");
            return (Criteria) this;
        }

        public Criteria andMujizijinshuNotIn(List<BigDecimal> values) {
            addCriterion("MUJIZIJINSHU not in", values, "mujizijinshu");
            return (Criteria) this;
        }

        public Criteria andMujizijinshuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MUJIZIJINSHU between", value1, value2, "mujizijinshu");
            return (Criteria) this;
        }

        public Criteria andMujizijinshuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MUJIZIJINSHU not between", value1, value2, "mujizijinshu");
            return (Criteria) this;
        }

        public Criteria andXinarenshuIsNull() {
            addCriterion("XINARENSHU is null");
            return (Criteria) this;
        }

        public Criteria andXinarenshuIsNotNull() {
            addCriterion("XINARENSHU is not null");
            return (Criteria) this;
        }

        public Criteria andXinarenshuEqualTo(Integer value) {
            addCriterion("XINARENSHU =", value, "xinarenshu");
            return (Criteria) this;
        }

        public Criteria andXinarenshuNotEqualTo(Integer value) {
            addCriterion("XINARENSHU <>", value, "xinarenshu");
            return (Criteria) this;
        }

        public Criteria andXinarenshuGreaterThan(Integer value) {
            addCriterion("XINARENSHU >", value, "xinarenshu");
            return (Criteria) this;
        }

        public Criteria andXinarenshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("XINARENSHU >=", value, "xinarenshu");
            return (Criteria) this;
        }

        public Criteria andXinarenshuLessThan(Integer value) {
            addCriterion("XINARENSHU <", value, "xinarenshu");
            return (Criteria) this;
        }

        public Criteria andXinarenshuLessThanOrEqualTo(Integer value) {
            addCriterion("XINARENSHU <=", value, "xinarenshu");
            return (Criteria) this;
        }

        public Criteria andXinarenshuIn(List<Integer> values) {
            addCriterion("XINARENSHU in", values, "xinarenshu");
            return (Criteria) this;
        }

        public Criteria andXinarenshuNotIn(List<Integer> values) {
            addCriterion("XINARENSHU not in", values, "xinarenshu");
            return (Criteria) this;
        }

        public Criteria andXinarenshuBetween(Integer value1, Integer value2) {
            addCriterion("XINARENSHU between", value1, value2, "xinarenshu");
            return (Criteria) this;
        }

        public Criteria andXinarenshuNotBetween(Integer value1, Integer value2) {
            addCriterion("XINARENSHU not between", value1, value2, "xinarenshu");
            return (Criteria) this;
        }

        public Criteria andZhengxiedaibiaoshuIsNull() {
            addCriterion("ZHENGXIEDAIBIAOSHU is null");
            return (Criteria) this;
        }

        public Criteria andZhengxiedaibiaoshuIsNotNull() {
            addCriterion("ZHENGXIEDAIBIAOSHU is not null");
            return (Criteria) this;
        }

        public Criteria andZhengxiedaibiaoshuEqualTo(Integer value) {
            addCriterion("ZHENGXIEDAIBIAOSHU =", value, "zhengxiedaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andZhengxiedaibiaoshuNotEqualTo(Integer value) {
            addCriterion("ZHENGXIEDAIBIAOSHU <>", value, "zhengxiedaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andZhengxiedaibiaoshuGreaterThan(Integer value) {
            addCriterion("ZHENGXIEDAIBIAOSHU >", value, "zhengxiedaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andZhengxiedaibiaoshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZHENGXIEDAIBIAOSHU >=", value, "zhengxiedaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andZhengxiedaibiaoshuLessThan(Integer value) {
            addCriterion("ZHENGXIEDAIBIAOSHU <", value, "zhengxiedaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andZhengxiedaibiaoshuLessThanOrEqualTo(Integer value) {
            addCriterion("ZHENGXIEDAIBIAOSHU <=", value, "zhengxiedaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andZhengxiedaibiaoshuIn(List<Integer> values) {
            addCriterion("ZHENGXIEDAIBIAOSHU in", values, "zhengxiedaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andZhengxiedaibiaoshuNotIn(List<Integer> values) {
            addCriterion("ZHENGXIEDAIBIAOSHU not in", values, "zhengxiedaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andZhengxiedaibiaoshuBetween(Integer value1, Integer value2) {
            addCriterion("ZHENGXIEDAIBIAOSHU between", value1, value2, "zhengxiedaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andZhengxiedaibiaoshuNotBetween(Integer value1, Integer value2) {
            addCriterion("ZHENGXIEDAIBIAOSHU not between", value1, value2, "zhengxiedaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andTigongjianyishuIsNull() {
            addCriterion("TIGONGJIANYISHU is null");
            return (Criteria) this;
        }

        public Criteria andTigongjianyishuIsNotNull() {
            addCriterion("TIGONGJIANYISHU is not null");
            return (Criteria) this;
        }

        public Criteria andTigongjianyishuEqualTo(Integer value) {
            addCriterion("TIGONGJIANYISHU =", value, "tigongjianyishu");
            return (Criteria) this;
        }

        public Criteria andTigongjianyishuNotEqualTo(Integer value) {
            addCriterion("TIGONGJIANYISHU <>", value, "tigongjianyishu");
            return (Criteria) this;
        }

        public Criteria andTigongjianyishuGreaterThan(Integer value) {
            addCriterion("TIGONGJIANYISHU >", value, "tigongjianyishu");
            return (Criteria) this;
        }

        public Criteria andTigongjianyishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIGONGJIANYISHU >=", value, "tigongjianyishu");
            return (Criteria) this;
        }

        public Criteria andTigongjianyishuLessThan(Integer value) {
            addCriterion("TIGONGJIANYISHU <", value, "tigongjianyishu");
            return (Criteria) this;
        }

        public Criteria andTigongjianyishuLessThanOrEqualTo(Integer value) {
            addCriterion("TIGONGJIANYISHU <=", value, "tigongjianyishu");
            return (Criteria) this;
        }

        public Criteria andTigongjianyishuIn(List<Integer> values) {
            addCriterion("TIGONGJIANYISHU in", values, "tigongjianyishu");
            return (Criteria) this;
        }

        public Criteria andTigongjianyishuNotIn(List<Integer> values) {
            addCriterion("TIGONGJIANYISHU not in", values, "tigongjianyishu");
            return (Criteria) this;
        }

        public Criteria andTigongjianyishuBetween(Integer value1, Integer value2) {
            addCriterion("TIGONGJIANYISHU between", value1, value2, "tigongjianyishu");
            return (Criteria) this;
        }

        public Criteria andTigongjianyishuNotBetween(Integer value1, Integer value2) {
            addCriterion("TIGONGJIANYISHU not between", value1, value2, "tigongjianyishu");
            return (Criteria) this;
        }

        public Criteria andZengjiajiuyeshuIsNull() {
            addCriterion("ZENGJIAJIUYESHU is null");
            return (Criteria) this;
        }

        public Criteria andZengjiajiuyeshuIsNotNull() {
            addCriterion("ZENGJIAJIUYESHU is not null");
            return (Criteria) this;
        }

        public Criteria andZengjiajiuyeshuEqualTo(Integer value) {
            addCriterion("ZENGJIAJIUYESHU =", value, "zengjiajiuyeshu");
            return (Criteria) this;
        }

        public Criteria andZengjiajiuyeshuNotEqualTo(Integer value) {
            addCriterion("ZENGJIAJIUYESHU <>", value, "zengjiajiuyeshu");
            return (Criteria) this;
        }

        public Criteria andZengjiajiuyeshuGreaterThan(Integer value) {
            addCriterion("ZENGJIAJIUYESHU >", value, "zengjiajiuyeshu");
            return (Criteria) this;
        }

        public Criteria andZengjiajiuyeshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZENGJIAJIUYESHU >=", value, "zengjiajiuyeshu");
            return (Criteria) this;
        }

        public Criteria andZengjiajiuyeshuLessThan(Integer value) {
            addCriterion("ZENGJIAJIUYESHU <", value, "zengjiajiuyeshu");
            return (Criteria) this;
        }

        public Criteria andZengjiajiuyeshuLessThanOrEqualTo(Integer value) {
            addCriterion("ZENGJIAJIUYESHU <=", value, "zengjiajiuyeshu");
            return (Criteria) this;
        }

        public Criteria andZengjiajiuyeshuIn(List<Integer> values) {
            addCriterion("ZENGJIAJIUYESHU in", values, "zengjiajiuyeshu");
            return (Criteria) this;
        }

        public Criteria andZengjiajiuyeshuNotIn(List<Integer> values) {
            addCriterion("ZENGJIAJIUYESHU not in", values, "zengjiajiuyeshu");
            return (Criteria) this;
        }

        public Criteria andZengjiajiuyeshuBetween(Integer value1, Integer value2) {
            addCriterion("ZENGJIAJIUYESHU between", value1, value2, "zengjiajiuyeshu");
            return (Criteria) this;
        }

        public Criteria andZengjiajiuyeshuNotBetween(Integer value1, Integer value2) {
            addCriterion("ZENGJIAJIUYESHU not between", value1, value2, "zengjiajiuyeshu");
            return (Criteria) this;
        }

        public Criteria andFuwurenciIsNull() {
            addCriterion("FUWURENCI is null");
            return (Criteria) this;
        }

        public Criteria andFuwurenciIsNotNull() {
            addCriterion("FUWURENCI is not null");
            return (Criteria) this;
        }

        public Criteria andFuwurenciEqualTo(Integer value) {
            addCriterion("FUWURENCI =", value, "fuwurenci");
            return (Criteria) this;
        }

        public Criteria andFuwurenciNotEqualTo(Integer value) {
            addCriterion("FUWURENCI <>", value, "fuwurenci");
            return (Criteria) this;
        }

        public Criteria andFuwurenciGreaterThan(Integer value) {
            addCriterion("FUWURENCI >", value, "fuwurenci");
            return (Criteria) this;
        }

        public Criteria andFuwurenciGreaterThanOrEqualTo(Integer value) {
            addCriterion("FUWURENCI >=", value, "fuwurenci");
            return (Criteria) this;
        }

        public Criteria andFuwurenciLessThan(Integer value) {
            addCriterion("FUWURENCI <", value, "fuwurenci");
            return (Criteria) this;
        }

        public Criteria andFuwurenciLessThanOrEqualTo(Integer value) {
            addCriterion("FUWURENCI <=", value, "fuwurenci");
            return (Criteria) this;
        }

        public Criteria andFuwurenciIn(List<Integer> values) {
            addCriterion("FUWURENCI in", values, "fuwurenci");
            return (Criteria) this;
        }

        public Criteria andFuwurenciNotIn(List<Integer> values) {
            addCriterion("FUWURENCI not in", values, "fuwurenci");
            return (Criteria) this;
        }

        public Criteria andFuwurenciBetween(Integer value1, Integer value2) {
            addCriterion("FUWURENCI between", value1, value2, "fuwurenci");
            return (Criteria) this;
        }

        public Criteria andFuwurenciNotBetween(Integer value1, Integer value2) {
            addCriterion("FUWURENCI not between", value1, value2, "fuwurenci");
            return (Criteria) this;
        }

        public Criteria andZipingfenshuIsNull() {
            addCriterion("ZIPINGFENSHU is null");
            return (Criteria) this;
        }

        public Criteria andZipingfenshuIsNotNull() {
            addCriterion("ZIPINGFENSHU is not null");
            return (Criteria) this;
        }

        public Criteria andZipingfenshuEqualTo(Integer value) {
            addCriterion("ZIPINGFENSHU =", value, "zipingfenshu");
            return (Criteria) this;
        }

        public Criteria andZipingfenshuNotEqualTo(Integer value) {
            addCriterion("ZIPINGFENSHU <>", value, "zipingfenshu");
            return (Criteria) this;
        }

        public Criteria andZipingfenshuGreaterThan(Integer value) {
            addCriterion("ZIPINGFENSHU >", value, "zipingfenshu");
            return (Criteria) this;
        }

        public Criteria andZipingfenshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZIPINGFENSHU >=", value, "zipingfenshu");
            return (Criteria) this;
        }

        public Criteria andZipingfenshuLessThan(Integer value) {
            addCriterion("ZIPINGFENSHU <", value, "zipingfenshu");
            return (Criteria) this;
        }

        public Criteria andZipingfenshuLessThanOrEqualTo(Integer value) {
            addCriterion("ZIPINGFENSHU <=", value, "zipingfenshu");
            return (Criteria) this;
        }

        public Criteria andZipingfenshuIn(List<Integer> values) {
            addCriterion("ZIPINGFENSHU in", values, "zipingfenshu");
            return (Criteria) this;
        }

        public Criteria andZipingfenshuNotIn(List<Integer> values) {
            addCriterion("ZIPINGFENSHU not in", values, "zipingfenshu");
            return (Criteria) this;
        }

        public Criteria andZipingfenshuBetween(Integer value1, Integer value2) {
            addCriterion("ZIPINGFENSHU between", value1, value2, "zipingfenshu");
            return (Criteria) this;
        }

        public Criteria andZipingfenshuNotBetween(Integer value1, Integer value2) {
            addCriterion("ZIPINGFENSHU not between", value1, value2, "zipingfenshu");
            return (Criteria) this;
        }

        public Criteria andZipingdengjiIsNull() {
            addCriterion("ZIPINGDENGJI is null");
            return (Criteria) this;
        }

        public Criteria andZipingdengjiIsNotNull() {
            addCriterion("ZIPINGDENGJI is not null");
            return (Criteria) this;
        }

        public Criteria andZipingdengjiEqualTo(String value) {
            addCriterion("ZIPINGDENGJI =", value, "zipingdengji");
            return (Criteria) this;
        }

        public Criteria andZipingdengjiNotEqualTo(String value) {
            addCriterion("ZIPINGDENGJI <>", value, "zipingdengji");
            return (Criteria) this;
        }

        public Criteria andZipingdengjiGreaterThan(String value) {
            addCriterion("ZIPINGDENGJI >", value, "zipingdengji");
            return (Criteria) this;
        }

        public Criteria andZipingdengjiGreaterThanOrEqualTo(String value) {
            addCriterion("ZIPINGDENGJI >=", value, "zipingdengji");
            return (Criteria) this;
        }

        public Criteria andZipingdengjiLessThan(String value) {
            addCriterion("ZIPINGDENGJI <", value, "zipingdengji");
            return (Criteria) this;
        }

        public Criteria andZipingdengjiLessThanOrEqualTo(String value) {
            addCriterion("ZIPINGDENGJI <=", value, "zipingdengji");
            return (Criteria) this;
        }

        public Criteria andZipingdengjiLike(String value) {
            addCriterion("ZIPINGDENGJI like", value, "zipingdengji");
            return (Criteria) this;
        }

        public Criteria andZipingdengjiNotLike(String value) {
            addCriterion("ZIPINGDENGJI not like", value, "zipingdengji");
            return (Criteria) this;
        }

        public Criteria andZipingdengjiIn(List<String> values) {
            addCriterion("ZIPINGDENGJI in", values, "zipingdengji");
            return (Criteria) this;
        }

        public Criteria andZipingdengjiNotIn(List<String> values) {
            addCriterion("ZIPINGDENGJI not in", values, "zipingdengji");
            return (Criteria) this;
        }

        public Criteria andZipingdengjiBetween(String value1, String value2) {
            addCriterion("ZIPINGDENGJI between", value1, value2, "zipingdengji");
            return (Criteria) this;
        }

        public Criteria andZipingdengjiNotBetween(String value1, String value2) {
            addCriterion("ZIPINGDENGJI not between", value1, value2, "zipingdengji");
            return (Criteria) this;
        }

        public Criteria andPaiqianzhidaoIsNull() {
            addCriterion("PAIQIANZHIDAO is null");
            return (Criteria) this;
        }

        public Criteria andPaiqianzhidaoIsNotNull() {
            addCriterion("PAIQIANZHIDAO is not null");
            return (Criteria) this;
        }

        public Criteria andPaiqianzhidaoEqualTo(String value) {
            addCriterion("PAIQIANZHIDAO =", value, "paiqianzhidao");
            return (Criteria) this;
        }

        public Criteria andPaiqianzhidaoNotEqualTo(String value) {
            addCriterion("PAIQIANZHIDAO <>", value, "paiqianzhidao");
            return (Criteria) this;
        }

        public Criteria andPaiqianzhidaoGreaterThan(String value) {
            addCriterion("PAIQIANZHIDAO >", value, "paiqianzhidao");
            return (Criteria) this;
        }

        public Criteria andPaiqianzhidaoGreaterThanOrEqualTo(String value) {
            addCriterion("PAIQIANZHIDAO >=", value, "paiqianzhidao");
            return (Criteria) this;
        }

        public Criteria andPaiqianzhidaoLessThan(String value) {
            addCriterion("PAIQIANZHIDAO <", value, "paiqianzhidao");
            return (Criteria) this;
        }

        public Criteria andPaiqianzhidaoLessThanOrEqualTo(String value) {
            addCriterion("PAIQIANZHIDAO <=", value, "paiqianzhidao");
            return (Criteria) this;
        }

        public Criteria andPaiqianzhidaoLike(String value) {
            addCriterion("PAIQIANZHIDAO like", value, "paiqianzhidao");
            return (Criteria) this;
        }

        public Criteria andPaiqianzhidaoNotLike(String value) {
            addCriterion("PAIQIANZHIDAO not like", value, "paiqianzhidao");
            return (Criteria) this;
        }

        public Criteria andPaiqianzhidaoIn(List<String> values) {
            addCriterion("PAIQIANZHIDAO in", values, "paiqianzhidao");
            return (Criteria) this;
        }

        public Criteria andPaiqianzhidaoNotIn(List<String> values) {
            addCriterion("PAIQIANZHIDAO not in", values, "paiqianzhidao");
            return (Criteria) this;
        }

        public Criteria andPaiqianzhidaoBetween(String value1, String value2) {
            addCriterion("PAIQIANZHIDAO between", value1, value2, "paiqianzhidao");
            return (Criteria) this;
        }

        public Criteria andPaiqianzhidaoNotBetween(String value1, String value2) {
            addCriterion("PAIQIANZHIDAO not between", value1, value2, "paiqianzhidao");
            return (Criteria) this;
        }

        public Criteria andGongzuoqingkuangIsNull() {
            addCriterion("GONGZUOQINGKUANG is null");
            return (Criteria) this;
        }

        public Criteria andGongzuoqingkuangIsNotNull() {
            addCriterion("GONGZUOQINGKUANG is not null");
            return (Criteria) this;
        }

        public Criteria andGongzuoqingkuangEqualTo(String value) {
            addCriterion("GONGZUOQINGKUANG =", value, "gongzuoqingkuang");
            return (Criteria) this;
        }

        public Criteria andGongzuoqingkuangNotEqualTo(String value) {
            addCriterion("GONGZUOQINGKUANG <>", value, "gongzuoqingkuang");
            return (Criteria) this;
        }

        public Criteria andGongzuoqingkuangGreaterThan(String value) {
            addCriterion("GONGZUOQINGKUANG >", value, "gongzuoqingkuang");
            return (Criteria) this;
        }

        public Criteria andGongzuoqingkuangGreaterThanOrEqualTo(String value) {
            addCriterion("GONGZUOQINGKUANG >=", value, "gongzuoqingkuang");
            return (Criteria) this;
        }

        public Criteria andGongzuoqingkuangLessThan(String value) {
            addCriterion("GONGZUOQINGKUANG <", value, "gongzuoqingkuang");
            return (Criteria) this;
        }

        public Criteria andGongzuoqingkuangLessThanOrEqualTo(String value) {
            addCriterion("GONGZUOQINGKUANG <=", value, "gongzuoqingkuang");
            return (Criteria) this;
        }

        public Criteria andGongzuoqingkuangLike(String value) {
            addCriterion("GONGZUOQINGKUANG like", value, "gongzuoqingkuang");
            return (Criteria) this;
        }

        public Criteria andGongzuoqingkuangNotLike(String value) {
            addCriterion("GONGZUOQINGKUANG not like", value, "gongzuoqingkuang");
            return (Criteria) this;
        }

        public Criteria andGongzuoqingkuangIn(List<String> values) {
            addCriterion("GONGZUOQINGKUANG in", values, "gongzuoqingkuang");
            return (Criteria) this;
        }

        public Criteria andGongzuoqingkuangNotIn(List<String> values) {
            addCriterion("GONGZUOQINGKUANG not in", values, "gongzuoqingkuang");
            return (Criteria) this;
        }

        public Criteria andGongzuoqingkuangBetween(String value1, String value2) {
            addCriterion("GONGZUOQINGKUANG between", value1, value2, "gongzuoqingkuang");
            return (Criteria) this;
        }

        public Criteria andGongzuoqingkuangNotBetween(String value1, String value2) {
            addCriterion("GONGZUOQINGKUANG not between", value1, value2, "gongzuoqingkuang");
            return (Criteria) this;
        }

        public Criteria andQitazuzhiIsNull() {
            addCriterion("QITAZUZHI is null");
            return (Criteria) this;
        }

        public Criteria andQitazuzhiIsNotNull() {
            addCriterion("QITAZUZHI is not null");
            return (Criteria) this;
        }

        public Criteria andQitazuzhiEqualTo(String value) {
            addCriterion("QITAZUZHI =", value, "qitazuzhi");
            return (Criteria) this;
        }

        public Criteria andQitazuzhiNotEqualTo(String value) {
            addCriterion("QITAZUZHI <>", value, "qitazuzhi");
            return (Criteria) this;
        }

        public Criteria andQitazuzhiGreaterThan(String value) {
            addCriterion("QITAZUZHI >", value, "qitazuzhi");
            return (Criteria) this;
        }

        public Criteria andQitazuzhiGreaterThanOrEqualTo(String value) {
            addCriterion("QITAZUZHI >=", value, "qitazuzhi");
            return (Criteria) this;
        }

        public Criteria andQitazuzhiLessThan(String value) {
            addCriterion("QITAZUZHI <", value, "qitazuzhi");
            return (Criteria) this;
        }

        public Criteria andQitazuzhiLessThanOrEqualTo(String value) {
            addCriterion("QITAZUZHI <=", value, "qitazuzhi");
            return (Criteria) this;
        }

        public Criteria andQitazuzhiLike(String value) {
            addCriterion("QITAZUZHI like", value, "qitazuzhi");
            return (Criteria) this;
        }

        public Criteria andQitazuzhiNotLike(String value) {
            addCriterion("QITAZUZHI not like", value, "qitazuzhi");
            return (Criteria) this;
        }

        public Criteria andQitazuzhiIn(List<String> values) {
            addCriterion("QITAZUZHI in", values, "qitazuzhi");
            return (Criteria) this;
        }

        public Criteria andQitazuzhiNotIn(List<String> values) {
            addCriterion("QITAZUZHI not in", values, "qitazuzhi");
            return (Criteria) this;
        }

        public Criteria andQitazuzhiBetween(String value1, String value2) {
            addCriterion("QITAZUZHI between", value1, value2, "qitazuzhi");
            return (Criteria) this;
        }

        public Criteria andQitazuzhiNotBetween(String value1, String value2) {
            addCriterion("QITAZUZHI not between", value1, value2, "qitazuzhi");
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