package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StNjReport3Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StNjReport3Example() {
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

        public Criteria andJigoudaimaIsNull() {
            addCriterion("JIGOUDAIMA is null");
            return (Criteria) this;
        }

        public Criteria andJigoudaimaIsNotNull() {
            addCriterion("JIGOUDAIMA is not null");
            return (Criteria) this;
        }

        public Criteria andJigoudaimaEqualTo(String value) {
            addCriterion("JIGOUDAIMA =", value, "jigoudaima");
            return (Criteria) this;
        }

        public Criteria andJigoudaimaNotEqualTo(String value) {
            addCriterion("JIGOUDAIMA <>", value, "jigoudaima");
            return (Criteria) this;
        }

        public Criteria andJigoudaimaGreaterThan(String value) {
            addCriterion("JIGOUDAIMA >", value, "jigoudaima");
            return (Criteria) this;
        }

        public Criteria andJigoudaimaGreaterThanOrEqualTo(String value) {
            addCriterion("JIGOUDAIMA >=", value, "jigoudaima");
            return (Criteria) this;
        }

        public Criteria andJigoudaimaLessThan(String value) {
            addCriterion("JIGOUDAIMA <", value, "jigoudaima");
            return (Criteria) this;
        }

        public Criteria andJigoudaimaLessThanOrEqualTo(String value) {
            addCriterion("JIGOUDAIMA <=", value, "jigoudaima");
            return (Criteria) this;
        }

        public Criteria andJigoudaimaLike(String value) {
            addCriterion("JIGOUDAIMA like", value, "jigoudaima");
            return (Criteria) this;
        }

        public Criteria andJigoudaimaNotLike(String value) {
            addCriterion("JIGOUDAIMA not like", value, "jigoudaima");
            return (Criteria) this;
        }

        public Criteria andJigoudaimaIn(List<String> values) {
            addCriterion("JIGOUDAIMA in", values, "jigoudaima");
            return (Criteria) this;
        }

        public Criteria andJigoudaimaNotIn(List<String> values) {
            addCriterion("JIGOUDAIMA not in", values, "jigoudaima");
            return (Criteria) this;
        }

        public Criteria andJigoudaimaBetween(String value1, String value2) {
            addCriterion("JIGOUDAIMA between", value1, value2, "jigoudaima");
            return (Criteria) this;
        }

        public Criteria andJigoudaimaNotBetween(String value1, String value2) {
            addCriterion("JIGOUDAIMA not between", value1, value2, "jigoudaima");
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

        public Criteria andZhucezijinIsNull() {
            addCriterion("ZHUCEZIJIN is null");
            return (Criteria) this;
        }

        public Criteria andZhucezijinIsNotNull() {
            addCriterion("ZHUCEZIJIN is not null");
            return (Criteria) this;
        }

        public Criteria andZhucezijinEqualTo(BigDecimal value) {
            addCriterion("ZHUCEZIJIN =", value, "zhucezijin");
            return (Criteria) this;
        }

        public Criteria andZhucezijinNotEqualTo(BigDecimal value) {
            addCriterion("ZHUCEZIJIN <>", value, "zhucezijin");
            return (Criteria) this;
        }

        public Criteria andZhucezijinGreaterThan(BigDecimal value) {
            addCriterion("ZHUCEZIJIN >", value, "zhucezijin");
            return (Criteria) this;
        }

        public Criteria andZhucezijinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHUCEZIJIN >=", value, "zhucezijin");
            return (Criteria) this;
        }

        public Criteria andZhucezijinLessThan(BigDecimal value) {
            addCriterion("ZHUCEZIJIN <", value, "zhucezijin");
            return (Criteria) this;
        }

        public Criteria andZhucezijinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHUCEZIJIN <=", value, "zhucezijin");
            return (Criteria) this;
        }

        public Criteria andZhucezijinIn(List<BigDecimal> values) {
            addCriterion("ZHUCEZIJIN in", values, "zhucezijin");
            return (Criteria) this;
        }

        public Criteria andZhucezijinNotIn(List<BigDecimal> values) {
            addCriterion("ZHUCEZIJIN not in", values, "zhucezijin");
            return (Criteria) this;
        }

        public Criteria andZhucezijinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHUCEZIJIN between", value1, value2, "zhucezijin");
            return (Criteria) this;
        }

        public Criteria andZhucezijinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHUCEZIJIN not between", value1, value2, "zhucezijin");
            return (Criteria) this;
        }

        public Criteria andYoubianIsNull() {
            addCriterion("YOUBIAN is null");
            return (Criteria) this;
        }

        public Criteria andYoubianIsNotNull() {
            addCriterion("YOUBIAN is not null");
            return (Criteria) this;
        }

        public Criteria andYoubianEqualTo(String value) {
            addCriterion("YOUBIAN =", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianNotEqualTo(String value) {
            addCriterion("YOUBIAN <>", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianGreaterThan(String value) {
            addCriterion("YOUBIAN >", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianGreaterThanOrEqualTo(String value) {
            addCriterion("YOUBIAN >=", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianLessThan(String value) {
            addCriterion("YOUBIAN <", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianLessThanOrEqualTo(String value) {
            addCriterion("YOUBIAN <=", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianLike(String value) {
            addCriterion("YOUBIAN like", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianNotLike(String value) {
            addCriterion("YOUBIAN not like", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianIn(List<String> values) {
            addCriterion("YOUBIAN in", values, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianNotIn(List<String> values) {
            addCriterion("YOUBIAN not in", values, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianBetween(String value1, String value2) {
            addCriterion("YOUBIAN between", value1, value2, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianNotBetween(String value1, String value2) {
            addCriterion("YOUBIAN not between", value1, value2, "youbian");
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

        public Criteria andWangzhiIsNull() {
            addCriterion("WANGZHI is null");
            return (Criteria) this;
        }

        public Criteria andWangzhiIsNotNull() {
            addCriterion("WANGZHI is not null");
            return (Criteria) this;
        }

        public Criteria andWangzhiEqualTo(String value) {
            addCriterion("WANGZHI =", value, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiNotEqualTo(String value) {
            addCriterion("WANGZHI <>", value, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiGreaterThan(String value) {
            addCriterion("WANGZHI >", value, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiGreaterThanOrEqualTo(String value) {
            addCriterion("WANGZHI >=", value, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiLessThan(String value) {
            addCriterion("WANGZHI <", value, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiLessThanOrEqualTo(String value) {
            addCriterion("WANGZHI <=", value, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiLike(String value) {
            addCriterion("WANGZHI like", value, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiNotLike(String value) {
            addCriterion("WANGZHI not like", value, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiIn(List<String> values) {
            addCriterion("WANGZHI in", values, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiNotIn(List<String> values) {
            addCriterion("WANGZHI not in", values, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiBetween(String value1, String value2) {
            addCriterion("WANGZHI between", value1, value2, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiNotBetween(String value1, String value2) {
            addCriterion("WANGZHI not between", value1, value2, "wangzhi");
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

        public Criteria andDanweihuiyuanshuIsNull() {
            addCriterion("DANWEIHUIYUANSHU is null");
            return (Criteria) this;
        }

        public Criteria andDanweihuiyuanshuIsNotNull() {
            addCriterion("DANWEIHUIYUANSHU is not null");
            return (Criteria) this;
        }

        public Criteria andDanweihuiyuanshuEqualTo(Integer value) {
            addCriterion("DANWEIHUIYUANSHU =", value, "danweihuiyuanshu");
            return (Criteria) this;
        }

        public Criteria andDanweihuiyuanshuNotEqualTo(Integer value) {
            addCriterion("DANWEIHUIYUANSHU <>", value, "danweihuiyuanshu");
            return (Criteria) this;
        }

        public Criteria andDanweihuiyuanshuGreaterThan(Integer value) {
            addCriterion("DANWEIHUIYUANSHU >", value, "danweihuiyuanshu");
            return (Criteria) this;
        }

        public Criteria andDanweihuiyuanshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("DANWEIHUIYUANSHU >=", value, "danweihuiyuanshu");
            return (Criteria) this;
        }

        public Criteria andDanweihuiyuanshuLessThan(Integer value) {
            addCriterion("DANWEIHUIYUANSHU <", value, "danweihuiyuanshu");
            return (Criteria) this;
        }

        public Criteria andDanweihuiyuanshuLessThanOrEqualTo(Integer value) {
            addCriterion("DANWEIHUIYUANSHU <=", value, "danweihuiyuanshu");
            return (Criteria) this;
        }

        public Criteria andDanweihuiyuanshuIn(List<Integer> values) {
            addCriterion("DANWEIHUIYUANSHU in", values, "danweihuiyuanshu");
            return (Criteria) this;
        }

        public Criteria andDanweihuiyuanshuNotIn(List<Integer> values) {
            addCriterion("DANWEIHUIYUANSHU not in", values, "danweihuiyuanshu");
            return (Criteria) this;
        }

        public Criteria andDanweihuiyuanshuBetween(Integer value1, Integer value2) {
            addCriterion("DANWEIHUIYUANSHU between", value1, value2, "danweihuiyuanshu");
            return (Criteria) this;
        }

        public Criteria andDanweihuiyuanshuNotBetween(Integer value1, Integer value2) {
            addCriterion("DANWEIHUIYUANSHU not between", value1, value2, "danweihuiyuanshu");
            return (Criteria) this;
        }

        public Criteria andGerenhuiyuanshuIsNull() {
            addCriterion("GERENHUIYUANSHU is null");
            return (Criteria) this;
        }

        public Criteria andGerenhuiyuanshuIsNotNull() {
            addCriterion("GERENHUIYUANSHU is not null");
            return (Criteria) this;
        }

        public Criteria andGerenhuiyuanshuEqualTo(Integer value) {
            addCriterion("GERENHUIYUANSHU =", value, "gerenhuiyuanshu");
            return (Criteria) this;
        }

        public Criteria andGerenhuiyuanshuNotEqualTo(Integer value) {
            addCriterion("GERENHUIYUANSHU <>", value, "gerenhuiyuanshu");
            return (Criteria) this;
        }

        public Criteria andGerenhuiyuanshuGreaterThan(Integer value) {
            addCriterion("GERENHUIYUANSHU >", value, "gerenhuiyuanshu");
            return (Criteria) this;
        }

        public Criteria andGerenhuiyuanshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("GERENHUIYUANSHU >=", value, "gerenhuiyuanshu");
            return (Criteria) this;
        }

        public Criteria andGerenhuiyuanshuLessThan(Integer value) {
            addCriterion("GERENHUIYUANSHU <", value, "gerenhuiyuanshu");
            return (Criteria) this;
        }

        public Criteria andGerenhuiyuanshuLessThanOrEqualTo(Integer value) {
            addCriterion("GERENHUIYUANSHU <=", value, "gerenhuiyuanshu");
            return (Criteria) this;
        }

        public Criteria andGerenhuiyuanshuIn(List<Integer> values) {
            addCriterion("GERENHUIYUANSHU in", values, "gerenhuiyuanshu");
            return (Criteria) this;
        }

        public Criteria andGerenhuiyuanshuNotIn(List<Integer> values) {
            addCriterion("GERENHUIYUANSHU not in", values, "gerenhuiyuanshu");
            return (Criteria) this;
        }

        public Criteria andGerenhuiyuanshuBetween(Integer value1, Integer value2) {
            addCriterion("GERENHUIYUANSHU between", value1, value2, "gerenhuiyuanshu");
            return (Criteria) this;
        }

        public Criteria andGerenhuiyuanshuNotBetween(Integer value1, Integer value2) {
            addCriterion("GERENHUIYUANSHU not between", value1, value2, "gerenhuiyuanshu");
            return (Criteria) this;
        }

        public Criteria andFarenxingmingIsNull() {
            addCriterion("FARENXINGMING is null");
            return (Criteria) this;
        }

        public Criteria andFarenxingmingIsNotNull() {
            addCriterion("FARENXINGMING is not null");
            return (Criteria) this;
        }

        public Criteria andFarenxingmingEqualTo(String value) {
            addCriterion("FARENXINGMING =", value, "farenxingming");
            return (Criteria) this;
        }

        public Criteria andFarenxingmingNotEqualTo(String value) {
            addCriterion("FARENXINGMING <>", value, "farenxingming");
            return (Criteria) this;
        }

        public Criteria andFarenxingmingGreaterThan(String value) {
            addCriterion("FARENXINGMING >", value, "farenxingming");
            return (Criteria) this;
        }

        public Criteria andFarenxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("FARENXINGMING >=", value, "farenxingming");
            return (Criteria) this;
        }

        public Criteria andFarenxingmingLessThan(String value) {
            addCriterion("FARENXINGMING <", value, "farenxingming");
            return (Criteria) this;
        }

        public Criteria andFarenxingmingLessThanOrEqualTo(String value) {
            addCriterion("FARENXINGMING <=", value, "farenxingming");
            return (Criteria) this;
        }

        public Criteria andFarenxingmingLike(String value) {
            addCriterion("FARENXINGMING like", value, "farenxingming");
            return (Criteria) this;
        }

        public Criteria andFarenxingmingNotLike(String value) {
            addCriterion("FARENXINGMING not like", value, "farenxingming");
            return (Criteria) this;
        }

        public Criteria andFarenxingmingIn(List<String> values) {
            addCriterion("FARENXINGMING in", values, "farenxingming");
            return (Criteria) this;
        }

        public Criteria andFarenxingmingNotIn(List<String> values) {
            addCriterion("FARENXINGMING not in", values, "farenxingming");
            return (Criteria) this;
        }

        public Criteria andFarenxingmingBetween(String value1, String value2) {
            addCriterion("FARENXINGMING between", value1, value2, "farenxingming");
            return (Criteria) this;
        }

        public Criteria andFarenxingmingNotBetween(String value1, String value2) {
            addCriterion("FARENXINGMING not between", value1, value2, "farenxingming");
            return (Criteria) this;
        }

        public Criteria andLishichangxingmingIsNull() {
            addCriterion("LISHICHANGXINGMING is null");
            return (Criteria) this;
        }

        public Criteria andLishichangxingmingIsNotNull() {
            addCriterion("LISHICHANGXINGMING is not null");
            return (Criteria) this;
        }

        public Criteria andLishichangxingmingEqualTo(String value) {
            addCriterion("LISHICHANGXINGMING =", value, "lishichangxingming");
            return (Criteria) this;
        }

        public Criteria andLishichangxingmingNotEqualTo(String value) {
            addCriterion("LISHICHANGXINGMING <>", value, "lishichangxingming");
            return (Criteria) this;
        }

        public Criteria andLishichangxingmingGreaterThan(String value) {
            addCriterion("LISHICHANGXINGMING >", value, "lishichangxingming");
            return (Criteria) this;
        }

        public Criteria andLishichangxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("LISHICHANGXINGMING >=", value, "lishichangxingming");
            return (Criteria) this;
        }

        public Criteria andLishichangxingmingLessThan(String value) {
            addCriterion("LISHICHANGXINGMING <", value, "lishichangxingming");
            return (Criteria) this;
        }

        public Criteria andLishichangxingmingLessThanOrEqualTo(String value) {
            addCriterion("LISHICHANGXINGMING <=", value, "lishichangxingming");
            return (Criteria) this;
        }

        public Criteria andLishichangxingmingLike(String value) {
            addCriterion("LISHICHANGXINGMING like", value, "lishichangxingming");
            return (Criteria) this;
        }

        public Criteria andLishichangxingmingNotLike(String value) {
            addCriterion("LISHICHANGXINGMING not like", value, "lishichangxingming");
            return (Criteria) this;
        }

        public Criteria andLishichangxingmingIn(List<String> values) {
            addCriterion("LISHICHANGXINGMING in", values, "lishichangxingming");
            return (Criteria) this;
        }

        public Criteria andLishichangxingmingNotIn(List<String> values) {
            addCriterion("LISHICHANGXINGMING not in", values, "lishichangxingming");
            return (Criteria) this;
        }

        public Criteria andLishichangxingmingBetween(String value1, String value2) {
            addCriterion("LISHICHANGXINGMING between", value1, value2, "lishichangxingming");
            return (Criteria) this;
        }

        public Criteria andLishichangxingmingNotBetween(String value1, String value2) {
            addCriterion("LISHICHANGXINGMING not between", value1, value2, "lishichangxingming");
            return (Criteria) this;
        }

        public Criteria andLishirenshuIsNull() {
            addCriterion("LISHIRENSHU is null");
            return (Criteria) this;
        }

        public Criteria andLishirenshuIsNotNull() {
            addCriterion("LISHIRENSHU is not null");
            return (Criteria) this;
        }

        public Criteria andLishirenshuEqualTo(Integer value) {
            addCriterion("LISHIRENSHU =", value, "lishirenshu");
            return (Criteria) this;
        }

        public Criteria andLishirenshuNotEqualTo(Integer value) {
            addCriterion("LISHIRENSHU <>", value, "lishirenshu");
            return (Criteria) this;
        }

        public Criteria andLishirenshuGreaterThan(Integer value) {
            addCriterion("LISHIRENSHU >", value, "lishirenshu");
            return (Criteria) this;
        }

        public Criteria andLishirenshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("LISHIRENSHU >=", value, "lishirenshu");
            return (Criteria) this;
        }

        public Criteria andLishirenshuLessThan(Integer value) {
            addCriterion("LISHIRENSHU <", value, "lishirenshu");
            return (Criteria) this;
        }

        public Criteria andLishirenshuLessThanOrEqualTo(Integer value) {
            addCriterion("LISHIRENSHU <=", value, "lishirenshu");
            return (Criteria) this;
        }

        public Criteria andLishirenshuIn(List<Integer> values) {
            addCriterion("LISHIRENSHU in", values, "lishirenshu");
            return (Criteria) this;
        }

        public Criteria andLishirenshuNotIn(List<Integer> values) {
            addCriterion("LISHIRENSHU not in", values, "lishirenshu");
            return (Criteria) this;
        }

        public Criteria andLishirenshuBetween(Integer value1, Integer value2) {
            addCriterion("LISHIRENSHU between", value1, value2, "lishirenshu");
            return (Criteria) this;
        }

        public Criteria andLishirenshuNotBetween(Integer value1, Integer value2) {
            addCriterion("LISHIRENSHU not between", value1, value2, "lishirenshu");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuIsNull() {
            addCriterion("FUZERENSHU is null");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuIsNotNull() {
            addCriterion("FUZERENSHU is not null");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuEqualTo(Integer value) {
            addCriterion("FUZERENSHU =", value, "fuzerenshu");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuNotEqualTo(Integer value) {
            addCriterion("FUZERENSHU <>", value, "fuzerenshu");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuGreaterThan(Integer value) {
            addCriterion("FUZERENSHU >", value, "fuzerenshu");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("FUZERENSHU >=", value, "fuzerenshu");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuLessThan(Integer value) {
            addCriterion("FUZERENSHU <", value, "fuzerenshu");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuLessThanOrEqualTo(Integer value) {
            addCriterion("FUZERENSHU <=", value, "fuzerenshu");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuIn(List<Integer> values) {
            addCriterion("FUZERENSHU in", values, "fuzerenshu");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuNotIn(List<Integer> values) {
            addCriterion("FUZERENSHU not in", values, "fuzerenshu");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuBetween(Integer value1, Integer value2) {
            addCriterion("FUZERENSHU between", value1, value2, "fuzerenshu");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuNotBetween(Integer value1, Integer value2) {
            addCriterion("FUZERENSHU not between", value1, value2, "fuzerenshu");
            return (Criteria) this;
        }

        public Criteria andMishuchangxingmingIsNull() {
            addCriterion("MISHUCHANGXINGMING is null");
            return (Criteria) this;
        }

        public Criteria andMishuchangxingmingIsNotNull() {
            addCriterion("MISHUCHANGXINGMING is not null");
            return (Criteria) this;
        }

        public Criteria andMishuchangxingmingEqualTo(String value) {
            addCriterion("MISHUCHANGXINGMING =", value, "mishuchangxingming");
            return (Criteria) this;
        }

        public Criteria andMishuchangxingmingNotEqualTo(String value) {
            addCriterion("MISHUCHANGXINGMING <>", value, "mishuchangxingming");
            return (Criteria) this;
        }

        public Criteria andMishuchangxingmingGreaterThan(String value) {
            addCriterion("MISHUCHANGXINGMING >", value, "mishuchangxingming");
            return (Criteria) this;
        }

        public Criteria andMishuchangxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("MISHUCHANGXINGMING >=", value, "mishuchangxingming");
            return (Criteria) this;
        }

        public Criteria andMishuchangxingmingLessThan(String value) {
            addCriterion("MISHUCHANGXINGMING <", value, "mishuchangxingming");
            return (Criteria) this;
        }

        public Criteria andMishuchangxingmingLessThanOrEqualTo(String value) {
            addCriterion("MISHUCHANGXINGMING <=", value, "mishuchangxingming");
            return (Criteria) this;
        }

        public Criteria andMishuchangxingmingLike(String value) {
            addCriterion("MISHUCHANGXINGMING like", value, "mishuchangxingming");
            return (Criteria) this;
        }

        public Criteria andMishuchangxingmingNotLike(String value) {
            addCriterion("MISHUCHANGXINGMING not like", value, "mishuchangxingming");
            return (Criteria) this;
        }

        public Criteria andMishuchangxingmingIn(List<String> values) {
            addCriterion("MISHUCHANGXINGMING in", values, "mishuchangxingming");
            return (Criteria) this;
        }

        public Criteria andMishuchangxingmingNotIn(List<String> values) {
            addCriterion("MISHUCHANGXINGMING not in", values, "mishuchangxingming");
            return (Criteria) this;
        }

        public Criteria andMishuchangxingmingBetween(String value1, String value2) {
            addCriterion("MISHUCHANGXINGMING between", value1, value2, "mishuchangxingming");
            return (Criteria) this;
        }

        public Criteria andMishuchangxingmingNotBetween(String value1, String value2) {
            addCriterion("MISHUCHANGXINGMING not between", value1, value2, "mishuchangxingming");
            return (Criteria) this;
        }

        public Criteria andChangwulishirenshuIsNull() {
            addCriterion("CHANGWULISHIRENSHU is null");
            return (Criteria) this;
        }

        public Criteria andChangwulishirenshuIsNotNull() {
            addCriterion("CHANGWULISHIRENSHU is not null");
            return (Criteria) this;
        }

        public Criteria andChangwulishirenshuEqualTo(Integer value) {
            addCriterion("CHANGWULISHIRENSHU =", value, "changwulishirenshu");
            return (Criteria) this;
        }

        public Criteria andChangwulishirenshuNotEqualTo(Integer value) {
            addCriterion("CHANGWULISHIRENSHU <>", value, "changwulishirenshu");
            return (Criteria) this;
        }

        public Criteria andChangwulishirenshuGreaterThan(Integer value) {
            addCriterion("CHANGWULISHIRENSHU >", value, "changwulishirenshu");
            return (Criteria) this;
        }

        public Criteria andChangwulishirenshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHANGWULISHIRENSHU >=", value, "changwulishirenshu");
            return (Criteria) this;
        }

        public Criteria andChangwulishirenshuLessThan(Integer value) {
            addCriterion("CHANGWULISHIRENSHU <", value, "changwulishirenshu");
            return (Criteria) this;
        }

        public Criteria andChangwulishirenshuLessThanOrEqualTo(Integer value) {
            addCriterion("CHANGWULISHIRENSHU <=", value, "changwulishirenshu");
            return (Criteria) this;
        }

        public Criteria andChangwulishirenshuIn(List<Integer> values) {
            addCriterion("CHANGWULISHIRENSHU in", values, "changwulishirenshu");
            return (Criteria) this;
        }

        public Criteria andChangwulishirenshuNotIn(List<Integer> values) {
            addCriterion("CHANGWULISHIRENSHU not in", values, "changwulishirenshu");
            return (Criteria) this;
        }

        public Criteria andChangwulishirenshuBetween(Integer value1, Integer value2) {
            addCriterion("CHANGWULISHIRENSHU between", value1, value2, "changwulishirenshu");
            return (Criteria) this;
        }

        public Criteria andChangwulishirenshuNotBetween(Integer value1, Integer value2) {
            addCriterion("CHANGWULISHIRENSHU not between", value1, value2, "changwulishirenshu");
            return (Criteria) this;
        }

        public Criteria andGongshengrenshuIsNull() {
            addCriterion("GONGSHENGRENSHU is null");
            return (Criteria) this;
        }

        public Criteria andGongshengrenshuIsNotNull() {
            addCriterion("GONGSHENGRENSHU is not null");
            return (Criteria) this;
        }

        public Criteria andGongshengrenshuEqualTo(Integer value) {
            addCriterion("GONGSHENGRENSHU =", value, "gongshengrenshu");
            return (Criteria) this;
        }

        public Criteria andGongshengrenshuNotEqualTo(Integer value) {
            addCriterion("GONGSHENGRENSHU <>", value, "gongshengrenshu");
            return (Criteria) this;
        }

        public Criteria andGongshengrenshuGreaterThan(Integer value) {
            addCriterion("GONGSHENGRENSHU >", value, "gongshengrenshu");
            return (Criteria) this;
        }

        public Criteria andGongshengrenshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("GONGSHENGRENSHU >=", value, "gongshengrenshu");
            return (Criteria) this;
        }

        public Criteria andGongshengrenshuLessThan(Integer value) {
            addCriterion("GONGSHENGRENSHU <", value, "gongshengrenshu");
            return (Criteria) this;
        }

        public Criteria andGongshengrenshuLessThanOrEqualTo(Integer value) {
            addCriterion("GONGSHENGRENSHU <=", value, "gongshengrenshu");
            return (Criteria) this;
        }

        public Criteria andGongshengrenshuIn(List<Integer> values) {
            addCriterion("GONGSHENGRENSHU in", values, "gongshengrenshu");
            return (Criteria) this;
        }

        public Criteria andGongshengrenshuNotIn(List<Integer> values) {
            addCriterion("GONGSHENGRENSHU not in", values, "gongshengrenshu");
            return (Criteria) this;
        }

        public Criteria andGongshengrenshuBetween(Integer value1, Integer value2) {
            addCriterion("GONGSHENGRENSHU between", value1, value2, "gongshengrenshu");
            return (Criteria) this;
        }

        public Criteria andGongshengrenshuNotBetween(Integer value1, Integer value2) {
            addCriterion("GONGSHENGRENSHU not between", value1, value2, "gongshengrenshu");
            return (Criteria) this;
        }

        public Criteria andGongdirenshuIsNull() {
            addCriterion("GONGDIRENSHU is null");
            return (Criteria) this;
        }

        public Criteria andGongdirenshuIsNotNull() {
            addCriterion("GONGDIRENSHU is not null");
            return (Criteria) this;
        }

        public Criteria andGongdirenshuEqualTo(Integer value) {
            addCriterion("GONGDIRENSHU =", value, "gongdirenshu");
            return (Criteria) this;
        }

        public Criteria andGongdirenshuNotEqualTo(Integer value) {
            addCriterion("GONGDIRENSHU <>", value, "gongdirenshu");
            return (Criteria) this;
        }

        public Criteria andGongdirenshuGreaterThan(Integer value) {
            addCriterion("GONGDIRENSHU >", value, "gongdirenshu");
            return (Criteria) this;
        }

        public Criteria andGongdirenshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("GONGDIRENSHU >=", value, "gongdirenshu");
            return (Criteria) this;
        }

        public Criteria andGongdirenshuLessThan(Integer value) {
            addCriterion("GONGDIRENSHU <", value, "gongdirenshu");
            return (Criteria) this;
        }

        public Criteria andGongdirenshuLessThanOrEqualTo(Integer value) {
            addCriterion("GONGDIRENSHU <=", value, "gongdirenshu");
            return (Criteria) this;
        }

        public Criteria andGongdirenshuIn(List<Integer> values) {
            addCriterion("GONGDIRENSHU in", values, "gongdirenshu");
            return (Criteria) this;
        }

        public Criteria andGongdirenshuNotIn(List<Integer> values) {
            addCriterion("GONGDIRENSHU not in", values, "gongdirenshu");
            return (Criteria) this;
        }

        public Criteria andGongdirenshuBetween(Integer value1, Integer value2) {
            addCriterion("GONGDIRENSHU between", value1, value2, "gongdirenshu");
            return (Criteria) this;
        }

        public Criteria andGongdirenshuNotBetween(Integer value1, Integer value2) {
            addCriterion("GONGDIRENSHU not between", value1, value2, "gongdirenshu");
            return (Criteria) this;
        }

        public Criteria andGongxianrenshuIsNull() {
            addCriterion("GONGXIANRENSHU is null");
            return (Criteria) this;
        }

        public Criteria andGongxianrenshuIsNotNull() {
            addCriterion("GONGXIANRENSHU is not null");
            return (Criteria) this;
        }

        public Criteria andGongxianrenshuEqualTo(Integer value) {
            addCriterion("GONGXIANRENSHU =", value, "gongxianrenshu");
            return (Criteria) this;
        }

        public Criteria andGongxianrenshuNotEqualTo(Integer value) {
            addCriterion("GONGXIANRENSHU <>", value, "gongxianrenshu");
            return (Criteria) this;
        }

        public Criteria andGongxianrenshuGreaterThan(Integer value) {
            addCriterion("GONGXIANRENSHU >", value, "gongxianrenshu");
            return (Criteria) this;
        }

        public Criteria andGongxianrenshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("GONGXIANRENSHU >=", value, "gongxianrenshu");
            return (Criteria) this;
        }

        public Criteria andGongxianrenshuLessThan(Integer value) {
            addCriterion("GONGXIANRENSHU <", value, "gongxianrenshu");
            return (Criteria) this;
        }

        public Criteria andGongxianrenshuLessThanOrEqualTo(Integer value) {
            addCriterion("GONGXIANRENSHU <=", value, "gongxianrenshu");
            return (Criteria) this;
        }

        public Criteria andGongxianrenshuIn(List<Integer> values) {
            addCriterion("GONGXIANRENSHU in", values, "gongxianrenshu");
            return (Criteria) this;
        }

        public Criteria andGongxianrenshuNotIn(List<Integer> values) {
            addCriterion("GONGXIANRENSHU not in", values, "gongxianrenshu");
            return (Criteria) this;
        }

        public Criteria andGongxianrenshuBetween(Integer value1, Integer value2) {
            addCriterion("GONGXIANRENSHU between", value1, value2, "gongxianrenshu");
            return (Criteria) this;
        }

        public Criteria andGongxianrenshuNotBetween(Integer value1, Integer value2) {
            addCriterion("GONGXIANRENSHU not between", value1, value2, "gongxianrenshu");
            return (Criteria) this;
        }

        public Criteria andLizongshuIsNull() {
            addCriterion("LIZONGSHU is null");
            return (Criteria) this;
        }

        public Criteria andLizongshuIsNotNull() {
            addCriterion("LIZONGSHU is not null");
            return (Criteria) this;
        }

        public Criteria andLizongshuEqualTo(Integer value) {
            addCriterion("LIZONGSHU =", value, "lizongshu");
            return (Criteria) this;
        }

        public Criteria andLizongshuNotEqualTo(Integer value) {
            addCriterion("LIZONGSHU <>", value, "lizongshu");
            return (Criteria) this;
        }

        public Criteria andLizongshuGreaterThan(Integer value) {
            addCriterion("LIZONGSHU >", value, "lizongshu");
            return (Criteria) this;
        }

        public Criteria andLizongshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIZONGSHU >=", value, "lizongshu");
            return (Criteria) this;
        }

        public Criteria andLizongshuLessThan(Integer value) {
            addCriterion("LIZONGSHU <", value, "lizongshu");
            return (Criteria) this;
        }

        public Criteria andLizongshuLessThanOrEqualTo(Integer value) {
            addCriterion("LIZONGSHU <=", value, "lizongshu");
            return (Criteria) this;
        }

        public Criteria andLizongshuIn(List<Integer> values) {
            addCriterion("LIZONGSHU in", values, "lizongshu");
            return (Criteria) this;
        }

        public Criteria andLizongshuNotIn(List<Integer> values) {
            addCriterion("LIZONGSHU not in", values, "lizongshu");
            return (Criteria) this;
        }

        public Criteria andLizongshuBetween(Integer value1, Integer value2) {
            addCriterion("LIZONGSHU between", value1, value2, "lizongshu");
            return (Criteria) this;
        }

        public Criteria andLizongshuNotBetween(Integer value1, Integer value2) {
            addCriterion("LIZONGSHU not between", value1, value2, "lizongshu");
            return (Criteria) this;
        }

        public Criteria andLishengshuIsNull() {
            addCriterion("LISHENGSHU is null");
            return (Criteria) this;
        }

        public Criteria andLishengshuIsNotNull() {
            addCriterion("LISHENGSHU is not null");
            return (Criteria) this;
        }

        public Criteria andLishengshuEqualTo(Integer value) {
            addCriterion("LISHENGSHU =", value, "lishengshu");
            return (Criteria) this;
        }

        public Criteria andLishengshuNotEqualTo(Integer value) {
            addCriterion("LISHENGSHU <>", value, "lishengshu");
            return (Criteria) this;
        }

        public Criteria andLishengshuGreaterThan(Integer value) {
            addCriterion("LISHENGSHU >", value, "lishengshu");
            return (Criteria) this;
        }

        public Criteria andLishengshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("LISHENGSHU >=", value, "lishengshu");
            return (Criteria) this;
        }

        public Criteria andLishengshuLessThan(Integer value) {
            addCriterion("LISHENGSHU <", value, "lishengshu");
            return (Criteria) this;
        }

        public Criteria andLishengshuLessThanOrEqualTo(Integer value) {
            addCriterion("LISHENGSHU <=", value, "lishengshu");
            return (Criteria) this;
        }

        public Criteria andLishengshuIn(List<Integer> values) {
            addCriterion("LISHENGSHU in", values, "lishengshu");
            return (Criteria) this;
        }

        public Criteria andLishengshuNotIn(List<Integer> values) {
            addCriterion("LISHENGSHU not in", values, "lishengshu");
            return (Criteria) this;
        }

        public Criteria andLishengshuBetween(Integer value1, Integer value2) {
            addCriterion("LISHENGSHU between", value1, value2, "lishengshu");
            return (Criteria) this;
        }

        public Criteria andLishengshuNotBetween(Integer value1, Integer value2) {
            addCriterion("LISHENGSHU not between", value1, value2, "lishengshu");
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

        public Criteria andZhuanzhigongzuorenshuIsNull() {
            addCriterion("ZHUANZHIGONGZUORENSHU is null");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongzuorenshuIsNotNull() {
            addCriterion("ZHUANZHIGONGZUORENSHU is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongzuorenshuEqualTo(Integer value) {
            addCriterion("ZHUANZHIGONGZUORENSHU =", value, "zhuanzhigongzuorenshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongzuorenshuNotEqualTo(Integer value) {
            addCriterion("ZHUANZHIGONGZUORENSHU <>", value, "zhuanzhigongzuorenshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongzuorenshuGreaterThan(Integer value) {
            addCriterion("ZHUANZHIGONGZUORENSHU >", value, "zhuanzhigongzuorenshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongzuorenshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZHUANZHIGONGZUORENSHU >=", value, "zhuanzhigongzuorenshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongzuorenshuLessThan(Integer value) {
            addCriterion("ZHUANZHIGONGZUORENSHU <", value, "zhuanzhigongzuorenshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongzuorenshuLessThanOrEqualTo(Integer value) {
            addCriterion("ZHUANZHIGONGZUORENSHU <=", value, "zhuanzhigongzuorenshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongzuorenshuIn(List<Integer> values) {
            addCriterion("ZHUANZHIGONGZUORENSHU in", values, "zhuanzhigongzuorenshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongzuorenshuNotIn(List<Integer> values) {
            addCriterion("ZHUANZHIGONGZUORENSHU not in", values, "zhuanzhigongzuorenshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongzuorenshuBetween(Integer value1, Integer value2) {
            addCriterion("ZHUANZHIGONGZUORENSHU between", value1, value2, "zhuanzhigongzuorenshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongzuorenshuNotBetween(Integer value1, Integer value2) {
            addCriterion("ZHUANZHIGONGZUORENSHU not between", value1, value2, "zhuanzhigongzuorenshu");
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

        public Criteria andZhiyuanzherenshuIsNull() {
            addCriterion("ZHIYUANZHERENSHU is null");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzherenshuIsNotNull() {
            addCriterion("ZHIYUANZHERENSHU is not null");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzherenshuEqualTo(BigDecimal value) {
            addCriterion("ZHIYUANZHERENSHU =", value, "zhiyuanzherenshu");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzherenshuNotEqualTo(BigDecimal value) {
            addCriterion("ZHIYUANZHERENSHU <>", value, "zhiyuanzherenshu");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzherenshuGreaterThan(BigDecimal value) {
            addCriterion("ZHIYUANZHERENSHU >", value, "zhiyuanzherenshu");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzherenshuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHIYUANZHERENSHU >=", value, "zhiyuanzherenshu");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzherenshuLessThan(BigDecimal value) {
            addCriterion("ZHIYUANZHERENSHU <", value, "zhiyuanzherenshu");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzherenshuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHIYUANZHERENSHU <=", value, "zhiyuanzherenshu");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzherenshuIn(List<BigDecimal> values) {
            addCriterion("ZHIYUANZHERENSHU in", values, "zhiyuanzherenshu");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzherenshuNotIn(List<BigDecimal> values) {
            addCriterion("ZHIYUANZHERENSHU not in", values, "zhiyuanzherenshu");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzherenshuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHIYUANZHERENSHU between", value1, value2, "zhiyuanzherenshu");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzherenshuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHIYUANZHERENSHU not between", value1, value2, "zhiyuanzherenshu");
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

        public Criteria andZhiyuanlaodongshijianEqualTo(BigDecimal value) {
            addCriterion("ZHIYUANLAODONGSHIJIAN =", value, "zhiyuanlaodongshijian");
            return (Criteria) this;
        }

        public Criteria andZhiyuanlaodongshijianNotEqualTo(BigDecimal value) {
            addCriterion("ZHIYUANLAODONGSHIJIAN <>", value, "zhiyuanlaodongshijian");
            return (Criteria) this;
        }

        public Criteria andZhiyuanlaodongshijianGreaterThan(BigDecimal value) {
            addCriterion("ZHIYUANLAODONGSHIJIAN >", value, "zhiyuanlaodongshijian");
            return (Criteria) this;
        }

        public Criteria andZhiyuanlaodongshijianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHIYUANLAODONGSHIJIAN >=", value, "zhiyuanlaodongshijian");
            return (Criteria) this;
        }

        public Criteria andZhiyuanlaodongshijianLessThan(BigDecimal value) {
            addCriterion("ZHIYUANLAODONGSHIJIAN <", value, "zhiyuanlaodongshijian");
            return (Criteria) this;
        }

        public Criteria andZhiyuanlaodongshijianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHIYUANLAODONGSHIJIAN <=", value, "zhiyuanlaodongshijian");
            return (Criteria) this;
        }

        public Criteria andZhiyuanlaodongshijianIn(List<BigDecimal> values) {
            addCriterion("ZHIYUANLAODONGSHIJIAN in", values, "zhiyuanlaodongshijian");
            return (Criteria) this;
        }

        public Criteria andZhiyuanlaodongshijianNotIn(List<BigDecimal> values) {
            addCriterion("ZHIYUANLAODONGSHIJIAN not in", values, "zhiyuanlaodongshijian");
            return (Criteria) this;
        }

        public Criteria andZhiyuanlaodongshijianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHIYUANLAODONGSHIJIAN between", value1, value2, "zhiyuanlaodongshijian");
            return (Criteria) this;
        }

        public Criteria andZhiyuanlaodongshijianNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andFenzhijigoushuIsNull() {
            addCriterion("FENZHIJIGOUSHU is null");
            return (Criteria) this;
        }

        public Criteria andFenzhijigoushuIsNotNull() {
            addCriterion("FENZHIJIGOUSHU is not null");
            return (Criteria) this;
        }

        public Criteria andFenzhijigoushuEqualTo(Integer value) {
            addCriterion("FENZHIJIGOUSHU =", value, "fenzhijigoushu");
            return (Criteria) this;
        }

        public Criteria andFenzhijigoushuNotEqualTo(Integer value) {
            addCriterion("FENZHIJIGOUSHU <>", value, "fenzhijigoushu");
            return (Criteria) this;
        }

        public Criteria andFenzhijigoushuGreaterThan(Integer value) {
            addCriterion("FENZHIJIGOUSHU >", value, "fenzhijigoushu");
            return (Criteria) this;
        }

        public Criteria andFenzhijigoushuGreaterThanOrEqualTo(Integer value) {
            addCriterion("FENZHIJIGOUSHU >=", value, "fenzhijigoushu");
            return (Criteria) this;
        }

        public Criteria andFenzhijigoushuLessThan(Integer value) {
            addCriterion("FENZHIJIGOUSHU <", value, "fenzhijigoushu");
            return (Criteria) this;
        }

        public Criteria andFenzhijigoushuLessThanOrEqualTo(Integer value) {
            addCriterion("FENZHIJIGOUSHU <=", value, "fenzhijigoushu");
            return (Criteria) this;
        }

        public Criteria andFenzhijigoushuIn(List<Integer> values) {
            addCriterion("FENZHIJIGOUSHU in", values, "fenzhijigoushu");
            return (Criteria) this;
        }

        public Criteria andFenzhijigoushuNotIn(List<Integer> values) {
            addCriterion("FENZHIJIGOUSHU not in", values, "fenzhijigoushu");
            return (Criteria) this;
        }

        public Criteria andFenzhijigoushuBetween(Integer value1, Integer value2) {
            addCriterion("FENZHIJIGOUSHU between", value1, value2, "fenzhijigoushu");
            return (Criteria) this;
        }

        public Criteria andFenzhijigoushuNotBetween(Integer value1, Integer value2) {
            addCriterion("FENZHIJIGOUSHU not between", value1, value2, "fenzhijigoushu");
            return (Criteria) this;
        }

        public Criteria andDaibiaojigoushuIsNull() {
            addCriterion("DAIBIAOJIGOUSHU is null");
            return (Criteria) this;
        }

        public Criteria andDaibiaojigoushuIsNotNull() {
            addCriterion("DAIBIAOJIGOUSHU is not null");
            return (Criteria) this;
        }

        public Criteria andDaibiaojigoushuEqualTo(Integer value) {
            addCriterion("DAIBIAOJIGOUSHU =", value, "daibiaojigoushu");
            return (Criteria) this;
        }

        public Criteria andDaibiaojigoushuNotEqualTo(Integer value) {
            addCriterion("DAIBIAOJIGOUSHU <>", value, "daibiaojigoushu");
            return (Criteria) this;
        }

        public Criteria andDaibiaojigoushuGreaterThan(Integer value) {
            addCriterion("DAIBIAOJIGOUSHU >", value, "daibiaojigoushu");
            return (Criteria) this;
        }

        public Criteria andDaibiaojigoushuGreaterThanOrEqualTo(Integer value) {
            addCriterion("DAIBIAOJIGOUSHU >=", value, "daibiaojigoushu");
            return (Criteria) this;
        }

        public Criteria andDaibiaojigoushuLessThan(Integer value) {
            addCriterion("DAIBIAOJIGOUSHU <", value, "daibiaojigoushu");
            return (Criteria) this;
        }

        public Criteria andDaibiaojigoushuLessThanOrEqualTo(Integer value) {
            addCriterion("DAIBIAOJIGOUSHU <=", value, "daibiaojigoushu");
            return (Criteria) this;
        }

        public Criteria andDaibiaojigoushuIn(List<Integer> values) {
            addCriterion("DAIBIAOJIGOUSHU in", values, "daibiaojigoushu");
            return (Criteria) this;
        }

        public Criteria andDaibiaojigoushuNotIn(List<Integer> values) {
            addCriterion("DAIBIAOJIGOUSHU not in", values, "daibiaojigoushu");
            return (Criteria) this;
        }

        public Criteria andDaibiaojigoushuBetween(Integer value1, Integer value2) {
            addCriterion("DAIBIAOJIGOUSHU between", value1, value2, "daibiaojigoushu");
            return (Criteria) this;
        }

        public Criteria andDaibiaojigoushuNotBetween(Integer value1, Integer value2) {
            addCriterion("DAIBIAOJIGOUSHU not between", value1, value2, "daibiaojigoushu");
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

        public Criteria andZhuanxiangjigoushuIsNull() {
            addCriterion("ZHUANXIANGJIGOUSHU is null");
            return (Criteria) this;
        }

        public Criteria andZhuanxiangjigoushuIsNotNull() {
            addCriterion("ZHUANXIANGJIGOUSHU is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanxiangjigoushuEqualTo(Integer value) {
            addCriterion("ZHUANXIANGJIGOUSHU =", value, "zhuanxiangjigoushu");
            return (Criteria) this;
        }

        public Criteria andZhuanxiangjigoushuNotEqualTo(Integer value) {
            addCriterion("ZHUANXIANGJIGOUSHU <>", value, "zhuanxiangjigoushu");
            return (Criteria) this;
        }

        public Criteria andZhuanxiangjigoushuGreaterThan(Integer value) {
            addCriterion("ZHUANXIANGJIGOUSHU >", value, "zhuanxiangjigoushu");
            return (Criteria) this;
        }

        public Criteria andZhuanxiangjigoushuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZHUANXIANGJIGOUSHU >=", value, "zhuanxiangjigoushu");
            return (Criteria) this;
        }

        public Criteria andZhuanxiangjigoushuLessThan(Integer value) {
            addCriterion("ZHUANXIANGJIGOUSHU <", value, "zhuanxiangjigoushu");
            return (Criteria) this;
        }

        public Criteria andZhuanxiangjigoushuLessThanOrEqualTo(Integer value) {
            addCriterion("ZHUANXIANGJIGOUSHU <=", value, "zhuanxiangjigoushu");
            return (Criteria) this;
        }

        public Criteria andZhuanxiangjigoushuIn(List<Integer> values) {
            addCriterion("ZHUANXIANGJIGOUSHU in", values, "zhuanxiangjigoushu");
            return (Criteria) this;
        }

        public Criteria andZhuanxiangjigoushuNotIn(List<Integer> values) {
            addCriterion("ZHUANXIANGJIGOUSHU not in", values, "zhuanxiangjigoushu");
            return (Criteria) this;
        }

        public Criteria andZhuanxiangjigoushuBetween(Integer value1, Integer value2) {
            addCriterion("ZHUANXIANGJIGOUSHU between", value1, value2, "zhuanxiangjigoushu");
            return (Criteria) this;
        }

        public Criteria andZhuanxiangjigoushuNotBetween(Integer value1, Integer value2) {
            addCriterion("ZHUANXIANGJIGOUSHU not between", value1, value2, "zhuanxiangjigoushu");
            return (Criteria) this;
        }

        public Criteria andJingyingxingshitishuIsNull() {
            addCriterion("JINGYINGXINGSHITISHU is null");
            return (Criteria) this;
        }

        public Criteria andJingyingxingshitishuIsNotNull() {
            addCriterion("JINGYINGXINGSHITISHU is not null");
            return (Criteria) this;
        }

        public Criteria andJingyingxingshitishuEqualTo(Integer value) {
            addCriterion("JINGYINGXINGSHITISHU =", value, "jingyingxingshitishu");
            return (Criteria) this;
        }

        public Criteria andJingyingxingshitishuNotEqualTo(Integer value) {
            addCriterion("JINGYINGXINGSHITISHU <>", value, "jingyingxingshitishu");
            return (Criteria) this;
        }

        public Criteria andJingyingxingshitishuGreaterThan(Integer value) {
            addCriterion("JINGYINGXINGSHITISHU >", value, "jingyingxingshitishu");
            return (Criteria) this;
        }

        public Criteria andJingyingxingshitishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("JINGYINGXINGSHITISHU >=", value, "jingyingxingshitishu");
            return (Criteria) this;
        }

        public Criteria andJingyingxingshitishuLessThan(Integer value) {
            addCriterion("JINGYINGXINGSHITISHU <", value, "jingyingxingshitishu");
            return (Criteria) this;
        }

        public Criteria andJingyingxingshitishuLessThanOrEqualTo(Integer value) {
            addCriterion("JINGYINGXINGSHITISHU <=", value, "jingyingxingshitishu");
            return (Criteria) this;
        }

        public Criteria andJingyingxingshitishuIn(List<Integer> values) {
            addCriterion("JINGYINGXINGSHITISHU in", values, "jingyingxingshitishu");
            return (Criteria) this;
        }

        public Criteria andJingyingxingshitishuNotIn(List<Integer> values) {
            addCriterion("JINGYINGXINGSHITISHU not in", values, "jingyingxingshitishu");
            return (Criteria) this;
        }

        public Criteria andJingyingxingshitishuBetween(Integer value1, Integer value2) {
            addCriterion("JINGYINGXINGSHITISHU between", value1, value2, "jingyingxingshitishu");
            return (Criteria) this;
        }

        public Criteria andJingyingxingshitishuNotBetween(Integer value1, Integer value2) {
            addCriterion("JINGYINGXINGSHITISHU not between", value1, value2, "jingyingxingshitishu");
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

        public Criteria andNeibukanwushuIsNull() {
            addCriterion("NEIBUKANWUSHU is null");
            return (Criteria) this;
        }

        public Criteria andNeibukanwushuIsNotNull() {
            addCriterion("NEIBUKANWUSHU is not null");
            return (Criteria) this;
        }

        public Criteria andNeibukanwushuEqualTo(Integer value) {
            addCriterion("NEIBUKANWUSHU =", value, "neibukanwushu");
            return (Criteria) this;
        }

        public Criteria andNeibukanwushuNotEqualTo(Integer value) {
            addCriterion("NEIBUKANWUSHU <>", value, "neibukanwushu");
            return (Criteria) this;
        }

        public Criteria andNeibukanwushuGreaterThan(Integer value) {
            addCriterion("NEIBUKANWUSHU >", value, "neibukanwushu");
            return (Criteria) this;
        }

        public Criteria andNeibukanwushuGreaterThanOrEqualTo(Integer value) {
            addCriterion("NEIBUKANWUSHU >=", value, "neibukanwushu");
            return (Criteria) this;
        }

        public Criteria andNeibukanwushuLessThan(Integer value) {
            addCriterion("NEIBUKANWUSHU <", value, "neibukanwushu");
            return (Criteria) this;
        }

        public Criteria andNeibukanwushuLessThanOrEqualTo(Integer value) {
            addCriterion("NEIBUKANWUSHU <=", value, "neibukanwushu");
            return (Criteria) this;
        }

        public Criteria andNeibukanwushuIn(List<Integer> values) {
            addCriterion("NEIBUKANWUSHU in", values, "neibukanwushu");
            return (Criteria) this;
        }

        public Criteria andNeibukanwushuNotIn(List<Integer> values) {
            addCriterion("NEIBUKANWUSHU not in", values, "neibukanwushu");
            return (Criteria) this;
        }

        public Criteria andNeibukanwushuBetween(Integer value1, Integer value2) {
            addCriterion("NEIBUKANWUSHU between", value1, value2, "neibukanwushu");
            return (Criteria) this;
        }

        public Criteria andNeibukanwushuNotBetween(Integer value1, Integer value2) {
            addCriterion("NEIBUKANWUSHU not between", value1, value2, "neibukanwushu");
            return (Criteria) this;
        }

        public Criteria andZhihuibiaozhunshijianIsNull() {
            addCriterion("ZHIHUIBIAOZHUNSHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andZhihuibiaozhunshijianIsNotNull() {
            addCriterion("ZHIHUIBIAOZHUNSHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andZhihuibiaozhunshijianEqualTo(Date value) {
            addCriterion("ZHIHUIBIAOZHUNSHIJIAN =", value, "zhihuibiaozhunshijian");
            return (Criteria) this;
        }

        public Criteria andZhihuibiaozhunshijianNotEqualTo(Date value) {
            addCriterion("ZHIHUIBIAOZHUNSHIJIAN <>", value, "zhihuibiaozhunshijian");
            return (Criteria) this;
        }

        public Criteria andZhihuibiaozhunshijianGreaterThan(Date value) {
            addCriterion("ZHIHUIBIAOZHUNSHIJIAN >", value, "zhihuibiaozhunshijian");
            return (Criteria) this;
        }

        public Criteria andZhihuibiaozhunshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("ZHIHUIBIAOZHUNSHIJIAN >=", value, "zhihuibiaozhunshijian");
            return (Criteria) this;
        }

        public Criteria andZhihuibiaozhunshijianLessThan(Date value) {
            addCriterion("ZHIHUIBIAOZHUNSHIJIAN <", value, "zhihuibiaozhunshijian");
            return (Criteria) this;
        }

        public Criteria andZhihuibiaozhunshijianLessThanOrEqualTo(Date value) {
            addCriterion("ZHIHUIBIAOZHUNSHIJIAN <=", value, "zhihuibiaozhunshijian");
            return (Criteria) this;
        }

        public Criteria andZhihuibiaozhunshijianIn(List<Date> values) {
            addCriterion("ZHIHUIBIAOZHUNSHIJIAN in", values, "zhihuibiaozhunshijian");
            return (Criteria) this;
        }

        public Criteria andZhihuibiaozhunshijianNotIn(List<Date> values) {
            addCriterion("ZHIHUIBIAOZHUNSHIJIAN not in", values, "zhihuibiaozhunshijian");
            return (Criteria) this;
        }

        public Criteria andZhihuibiaozhunshijianBetween(Date value1, Date value2) {
            addCriterion("ZHIHUIBIAOZHUNSHIJIAN between", value1, value2, "zhihuibiaozhunshijian");
            return (Criteria) this;
        }

        public Criteria andZhihuibiaozhunshijianNotBetween(Date value1, Date value2) {
            addCriterion("ZHIHUIBIAOZHUNSHIJIAN not between", value1, value2, "zhihuibiaozhunshijian");
            return (Criteria) this;
        }

        public Criteria andTonghuibiaozhunhuiyimingchengIsNull() {
            addCriterion("TONGHUIBIAOZHUNHUIYIMINGCHENG is null");
            return (Criteria) this;
        }

        public Criteria andTonghuibiaozhunhuiyimingchengIsNotNull() {
            addCriterion("TONGHUIBIAOZHUNHUIYIMINGCHENG is not null");
            return (Criteria) this;
        }

        public Criteria andTonghuibiaozhunhuiyimingchengEqualTo(String value) {
            addCriterion("TONGHUIBIAOZHUNHUIYIMINGCHENG =", value, "tonghuibiaozhunhuiyimingcheng");
            return (Criteria) this;
        }

        public Criteria andTonghuibiaozhunhuiyimingchengNotEqualTo(String value) {
            addCriterion("TONGHUIBIAOZHUNHUIYIMINGCHENG <>", value, "tonghuibiaozhunhuiyimingcheng");
            return (Criteria) this;
        }

        public Criteria andTonghuibiaozhunhuiyimingchengGreaterThan(String value) {
            addCriterion("TONGHUIBIAOZHUNHUIYIMINGCHENG >", value, "tonghuibiaozhunhuiyimingcheng");
            return (Criteria) this;
        }

        public Criteria andTonghuibiaozhunhuiyimingchengGreaterThanOrEqualTo(String value) {
            addCriterion("TONGHUIBIAOZHUNHUIYIMINGCHENG >=", value, "tonghuibiaozhunhuiyimingcheng");
            return (Criteria) this;
        }

        public Criteria andTonghuibiaozhunhuiyimingchengLessThan(String value) {
            addCriterion("TONGHUIBIAOZHUNHUIYIMINGCHENG <", value, "tonghuibiaozhunhuiyimingcheng");
            return (Criteria) this;
        }

        public Criteria andTonghuibiaozhunhuiyimingchengLessThanOrEqualTo(String value) {
            addCriterion("TONGHUIBIAOZHUNHUIYIMINGCHENG <=", value, "tonghuibiaozhunhuiyimingcheng");
            return (Criteria) this;
        }

        public Criteria andTonghuibiaozhunhuiyimingchengLike(String value) {
            addCriterion("TONGHUIBIAOZHUNHUIYIMINGCHENG like", value, "tonghuibiaozhunhuiyimingcheng");
            return (Criteria) this;
        }

        public Criteria andTonghuibiaozhunhuiyimingchengNotLike(String value) {
            addCriterion("TONGHUIBIAOZHUNHUIYIMINGCHENG not like", value, "tonghuibiaozhunhuiyimingcheng");
            return (Criteria) this;
        }

        public Criteria andTonghuibiaozhunhuiyimingchengIn(List<String> values) {
            addCriterion("TONGHUIBIAOZHUNHUIYIMINGCHENG in", values, "tonghuibiaozhunhuiyimingcheng");
            return (Criteria) this;
        }

        public Criteria andTonghuibiaozhunhuiyimingchengNotIn(List<String> values) {
            addCriterion("TONGHUIBIAOZHUNHUIYIMINGCHENG not in", values, "tonghuibiaozhunhuiyimingcheng");
            return (Criteria) this;
        }

        public Criteria andTonghuibiaozhunhuiyimingchengBetween(String value1, String value2) {
            addCriterion("TONGHUIBIAOZHUNHUIYIMINGCHENG between", value1, value2, "tonghuibiaozhunhuiyimingcheng");
            return (Criteria) this;
        }

        public Criteria andTonghuibiaozhunhuiyimingchengNotBetween(String value1, String value2) {
            addCriterion("TONGHUIBIAOZHUNHUIYIMINGCHENG not between", value1, value2, "tonghuibiaozhunhuiyimingcheng");
            return (Criteria) this;
        }

        public Criteria andZhuguandanweiIsNull() {
            addCriterion("ZHUGUANDANWEI is null");
            return (Criteria) this;
        }

        public Criteria andZhuguandanweiIsNotNull() {
            addCriterion("ZHUGUANDANWEI is not null");
            return (Criteria) this;
        }

        public Criteria andZhuguandanweiEqualTo(String value) {
            addCriterion("ZHUGUANDANWEI =", value, "zhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andZhuguandanweiNotEqualTo(String value) {
            addCriterion("ZHUGUANDANWEI <>", value, "zhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andZhuguandanweiGreaterThan(String value) {
            addCriterion("ZHUGUANDANWEI >", value, "zhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andZhuguandanweiGreaterThanOrEqualTo(String value) {
            addCriterion("ZHUGUANDANWEI >=", value, "zhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andZhuguandanweiLessThan(String value) {
            addCriterion("ZHUGUANDANWEI <", value, "zhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andZhuguandanweiLessThanOrEqualTo(String value) {
            addCriterion("ZHUGUANDANWEI <=", value, "zhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andZhuguandanweiLike(String value) {
            addCriterion("ZHUGUANDANWEI like", value, "zhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andZhuguandanweiNotLike(String value) {
            addCriterion("ZHUGUANDANWEI not like", value, "zhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andZhuguandanweiIn(List<String> values) {
            addCriterion("ZHUGUANDANWEI in", values, "zhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andZhuguandanweiNotIn(List<String> values) {
            addCriterion("ZHUGUANDANWEI not in", values, "zhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andZhuguandanweiBetween(String value1, String value2) {
            addCriterion("ZHUGUANDANWEI between", value1, value2, "zhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andZhuguandanweiNotBetween(String value1, String value2) {
            addCriterion("ZHUGUANDANWEI not between", value1, value2, "zhuguandanwei");
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

        public Criteria andMishuchangweiIsNull() {
            addCriterion("MISHUCHANGWEI is null");
            return (Criteria) this;
        }

        public Criteria andMishuchangweiIsNotNull() {
            addCriterion("MISHUCHANGWEI is not null");
            return (Criteria) this;
        }

        public Criteria andMishuchangweiEqualTo(String value) {
            addCriterion("MISHUCHANGWEI =", value, "mishuchangwei");
            return (Criteria) this;
        }

        public Criteria andMishuchangweiNotEqualTo(String value) {
            addCriterion("MISHUCHANGWEI <>", value, "mishuchangwei");
            return (Criteria) this;
        }

        public Criteria andMishuchangweiGreaterThan(String value) {
            addCriterion("MISHUCHANGWEI >", value, "mishuchangwei");
            return (Criteria) this;
        }

        public Criteria andMishuchangweiGreaterThanOrEqualTo(String value) {
            addCriterion("MISHUCHANGWEI >=", value, "mishuchangwei");
            return (Criteria) this;
        }

        public Criteria andMishuchangweiLessThan(String value) {
            addCriterion("MISHUCHANGWEI <", value, "mishuchangwei");
            return (Criteria) this;
        }

        public Criteria andMishuchangweiLessThanOrEqualTo(String value) {
            addCriterion("MISHUCHANGWEI <=", value, "mishuchangwei");
            return (Criteria) this;
        }

        public Criteria andMishuchangweiLike(String value) {
            addCriterion("MISHUCHANGWEI like", value, "mishuchangwei");
            return (Criteria) this;
        }

        public Criteria andMishuchangweiNotLike(String value) {
            addCriterion("MISHUCHANGWEI not like", value, "mishuchangwei");
            return (Criteria) this;
        }

        public Criteria andMishuchangweiIn(List<String> values) {
            addCriterion("MISHUCHANGWEI in", values, "mishuchangwei");
            return (Criteria) this;
        }

        public Criteria andMishuchangweiNotIn(List<String> values) {
            addCriterion("MISHUCHANGWEI not in", values, "mishuchangwei");
            return (Criteria) this;
        }

        public Criteria andMishuchangweiBetween(String value1, String value2) {
            addCriterion("MISHUCHANGWEI between", value1, value2, "mishuchangwei");
            return (Criteria) this;
        }

        public Criteria andMishuchangweiNotBetween(String value1, String value2) {
            addCriterion("MISHUCHANGWEI not between", value1, value2, "mishuchangwei");
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

        public Criteria andHuifeibiaozhunIsNull() {
            addCriterion("HUIFEIBIAOZHUN is null");
            return (Criteria) this;
        }

        public Criteria andHuifeibiaozhunIsNotNull() {
            addCriterion("HUIFEIBIAOZHUN is not null");
            return (Criteria) this;
        }

        public Criteria andHuifeibiaozhunEqualTo(String value) {
            addCriterion("HUIFEIBIAOZHUN =", value, "huifeibiaozhun");
            return (Criteria) this;
        }

        public Criteria andHuifeibiaozhunNotEqualTo(String value) {
            addCriterion("HUIFEIBIAOZHUN <>", value, "huifeibiaozhun");
            return (Criteria) this;
        }

        public Criteria andHuifeibiaozhunGreaterThan(String value) {
            addCriterion("HUIFEIBIAOZHUN >", value, "huifeibiaozhun");
            return (Criteria) this;
        }

        public Criteria andHuifeibiaozhunGreaterThanOrEqualTo(String value) {
            addCriterion("HUIFEIBIAOZHUN >=", value, "huifeibiaozhun");
            return (Criteria) this;
        }

        public Criteria andHuifeibiaozhunLessThan(String value) {
            addCriterion("HUIFEIBIAOZHUN <", value, "huifeibiaozhun");
            return (Criteria) this;
        }

        public Criteria andHuifeibiaozhunLessThanOrEqualTo(String value) {
            addCriterion("HUIFEIBIAOZHUN <=", value, "huifeibiaozhun");
            return (Criteria) this;
        }

        public Criteria andHuifeibiaozhunLike(String value) {
            addCriterion("HUIFEIBIAOZHUN like", value, "huifeibiaozhun");
            return (Criteria) this;
        }

        public Criteria andHuifeibiaozhunNotLike(String value) {
            addCriterion("HUIFEIBIAOZHUN not like", value, "huifeibiaozhun");
            return (Criteria) this;
        }

        public Criteria andHuifeibiaozhunIn(List<String> values) {
            addCriterion("HUIFEIBIAOZHUN in", values, "huifeibiaozhun");
            return (Criteria) this;
        }

        public Criteria andHuifeibiaozhunNotIn(List<String> values) {
            addCriterion("HUIFEIBIAOZHUN not in", values, "huifeibiaozhun");
            return (Criteria) this;
        }

        public Criteria andHuifeibiaozhunBetween(String value1, String value2) {
            addCriterion("HUIFEIBIAOZHUN between", value1, value2, "huifeibiaozhun");
            return (Criteria) this;
        }

        public Criteria andHuifeibiaozhunNotBetween(String value1, String value2) {
            addCriterion("HUIFEIBIAOZHUN not between", value1, value2, "huifeibiaozhun");
            return (Criteria) this;
        }

        public Criteria andMinzhengbumenIsNull() {
            addCriterion("MINZHENGBUMEN is null");
            return (Criteria) this;
        }

        public Criteria andMinzhengbumenIsNotNull() {
            addCriterion("MINZHENGBUMEN is not null");
            return (Criteria) this;
        }

        public Criteria andMinzhengbumenEqualTo(String value) {
            addCriterion("MINZHENGBUMEN =", value, "minzhengbumen");
            return (Criteria) this;
        }

        public Criteria andMinzhengbumenNotEqualTo(String value) {
            addCriterion("MINZHENGBUMEN <>", value, "minzhengbumen");
            return (Criteria) this;
        }

        public Criteria andMinzhengbumenGreaterThan(String value) {
            addCriterion("MINZHENGBUMEN >", value, "minzhengbumen");
            return (Criteria) this;
        }

        public Criteria andMinzhengbumenGreaterThanOrEqualTo(String value) {
            addCriterion("MINZHENGBUMEN >=", value, "minzhengbumen");
            return (Criteria) this;
        }

        public Criteria andMinzhengbumenLessThan(String value) {
            addCriterion("MINZHENGBUMEN <", value, "minzhengbumen");
            return (Criteria) this;
        }

        public Criteria andMinzhengbumenLessThanOrEqualTo(String value) {
            addCriterion("MINZHENGBUMEN <=", value, "minzhengbumen");
            return (Criteria) this;
        }

        public Criteria andMinzhengbumenLike(String value) {
            addCriterion("MINZHENGBUMEN like", value, "minzhengbumen");
            return (Criteria) this;
        }

        public Criteria andMinzhengbumenNotLike(String value) {
            addCriterion("MINZHENGBUMEN not like", value, "minzhengbumen");
            return (Criteria) this;
        }

        public Criteria andMinzhengbumenIn(List<String> values) {
            addCriterion("MINZHENGBUMEN in", values, "minzhengbumen");
            return (Criteria) this;
        }

        public Criteria andMinzhengbumenNotIn(List<String> values) {
            addCriterion("MINZHENGBUMEN not in", values, "minzhengbumen");
            return (Criteria) this;
        }

        public Criteria andMinzhengbumenBetween(String value1, String value2) {
            addCriterion("MINZHENGBUMEN between", value1, value2, "minzhengbumen");
            return (Criteria) this;
        }

        public Criteria andMinzhengbumenNotBetween(String value1, String value2) {
            addCriterion("MINZHENGBUMEN not between", value1, value2, "minzhengbumen");
            return (Criteria) this;
        }

        public Criteria andCaizhengbumenIsNull() {
            addCriterion("CAIZHENGBUMEN is null");
            return (Criteria) this;
        }

        public Criteria andCaizhengbumenIsNotNull() {
            addCriterion("CAIZHENGBUMEN is not null");
            return (Criteria) this;
        }

        public Criteria andCaizhengbumenEqualTo(String value) {
            addCriterion("CAIZHENGBUMEN =", value, "caizhengbumen");
            return (Criteria) this;
        }

        public Criteria andCaizhengbumenNotEqualTo(String value) {
            addCriterion("CAIZHENGBUMEN <>", value, "caizhengbumen");
            return (Criteria) this;
        }

        public Criteria andCaizhengbumenGreaterThan(String value) {
            addCriterion("CAIZHENGBUMEN >", value, "caizhengbumen");
            return (Criteria) this;
        }

        public Criteria andCaizhengbumenGreaterThanOrEqualTo(String value) {
            addCriterion("CAIZHENGBUMEN >=", value, "caizhengbumen");
            return (Criteria) this;
        }

        public Criteria andCaizhengbumenLessThan(String value) {
            addCriterion("CAIZHENGBUMEN <", value, "caizhengbumen");
            return (Criteria) this;
        }

        public Criteria andCaizhengbumenLessThanOrEqualTo(String value) {
            addCriterion("CAIZHENGBUMEN <=", value, "caizhengbumen");
            return (Criteria) this;
        }

        public Criteria andCaizhengbumenLike(String value) {
            addCriterion("CAIZHENGBUMEN like", value, "caizhengbumen");
            return (Criteria) this;
        }

        public Criteria andCaizhengbumenNotLike(String value) {
            addCriterion("CAIZHENGBUMEN not like", value, "caizhengbumen");
            return (Criteria) this;
        }

        public Criteria andCaizhengbumenIn(List<String> values) {
            addCriterion("CAIZHENGBUMEN in", values, "caizhengbumen");
            return (Criteria) this;
        }

        public Criteria andCaizhengbumenNotIn(List<String> values) {
            addCriterion("CAIZHENGBUMEN not in", values, "caizhengbumen");
            return (Criteria) this;
        }

        public Criteria andCaizhengbumenBetween(String value1, String value2) {
            addCriterion("CAIZHENGBUMEN between", value1, value2, "caizhengbumen");
            return (Criteria) this;
        }

        public Criteria andCaizhengbumenNotBetween(String value1, String value2) {
            addCriterion("CAIZHENGBUMEN not between", value1, value2, "caizhengbumen");
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

        public Criteria andShoujiIsNull() {
            addCriterion("SHOUJI is null");
            return (Criteria) this;
        }

        public Criteria andShoujiIsNotNull() {
            addCriterion("SHOUJI is not null");
            return (Criteria) this;
        }

        public Criteria andShoujiEqualTo(String value) {
            addCriterion("SHOUJI =", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotEqualTo(String value) {
            addCriterion("SHOUJI <>", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiGreaterThan(String value) {
            addCriterion("SHOUJI >", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiGreaterThanOrEqualTo(String value) {
            addCriterion("SHOUJI >=", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiLessThan(String value) {
            addCriterion("SHOUJI <", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiLessThanOrEqualTo(String value) {
            addCriterion("SHOUJI <=", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiLike(String value) {
            addCriterion("SHOUJI like", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotLike(String value) {
            addCriterion("SHOUJI not like", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiIn(List<String> values) {
            addCriterion("SHOUJI in", values, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotIn(List<String> values) {
            addCriterion("SHOUJI not in", values, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiBetween(String value1, String value2) {
            addCriterion("SHOUJI between", value1, value2, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotBetween(String value1, String value2) {
            addCriterion("SHOUJI not between", value1, value2, "shouji");
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

        public Criteria andXingbieEqualTo(String value) {
            addCriterion("XINGBIE =", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieNotEqualTo(String value) {
            addCriterion("XINGBIE <>", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieGreaterThan(String value) {
            addCriterion("XINGBIE >", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieGreaterThanOrEqualTo(String value) {
            addCriterion("XINGBIE >=", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieLessThan(String value) {
            addCriterion("XINGBIE <", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieLessThanOrEqualTo(String value) {
            addCriterion("XINGBIE <=", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieLike(String value) {
            addCriterion("XINGBIE like", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieNotLike(String value) {
            addCriterion("XINGBIE not like", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieIn(List<String> values) {
            addCriterion("XINGBIE in", values, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieNotIn(List<String> values) {
            addCriterion("XINGBIE not in", values, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieBetween(String value1, String value2) {
            addCriterion("XINGBIE between", value1, value2, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieNotBetween(String value1, String value2) {
            addCriterion("XINGBIE not between", value1, value2, "xingbie");
            return (Criteria) this;
        }

        public Criteria andChushengnianyueIsNull() {
            addCriterion("CHUSHENGNIANYUE is null");
            return (Criteria) this;
        }

        public Criteria andChushengnianyueIsNotNull() {
            addCriterion("CHUSHENGNIANYUE is not null");
            return (Criteria) this;
        }

        public Criteria andChushengnianyueEqualTo(Date value) {
            addCriterion("CHUSHENGNIANYUE =", value, "chushengnianyue");
            return (Criteria) this;
        }

        public Criteria andChushengnianyueNotEqualTo(Date value) {
            addCriterion("CHUSHENGNIANYUE <>", value, "chushengnianyue");
            return (Criteria) this;
        }

        public Criteria andChushengnianyueGreaterThan(Date value) {
            addCriterion("CHUSHENGNIANYUE >", value, "chushengnianyue");
            return (Criteria) this;
        }

        public Criteria andChushengnianyueGreaterThanOrEqualTo(Date value) {
            addCriterion("CHUSHENGNIANYUE >=", value, "chushengnianyue");
            return (Criteria) this;
        }

        public Criteria andChushengnianyueLessThan(Date value) {
            addCriterion("CHUSHENGNIANYUE <", value, "chushengnianyue");
            return (Criteria) this;
        }

        public Criteria andChushengnianyueLessThanOrEqualTo(Date value) {
            addCriterion("CHUSHENGNIANYUE <=", value, "chushengnianyue");
            return (Criteria) this;
        }

        public Criteria andChushengnianyueIn(List<Date> values) {
            addCriterion("CHUSHENGNIANYUE in", values, "chushengnianyue");
            return (Criteria) this;
        }

        public Criteria andChushengnianyueNotIn(List<Date> values) {
            addCriterion("CHUSHENGNIANYUE not in", values, "chushengnianyue");
            return (Criteria) this;
        }

        public Criteria andChushengnianyueBetween(Date value1, Date value2) {
            addCriterion("CHUSHENGNIANYUE between", value1, value2, "chushengnianyue");
            return (Criteria) this;
        }

        public Criteria andChushengnianyueNotBetween(Date value1, Date value2) {
            addCriterion("CHUSHENGNIANYUE not between", value1, value2, "chushengnianyue");
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

        public Criteria andXingbie2IsNull() {
            addCriterion("XINGBIE2 is null");
            return (Criteria) this;
        }

        public Criteria andXingbie2IsNotNull() {
            addCriterion("XINGBIE2 is not null");
            return (Criteria) this;
        }

        public Criteria andXingbie2EqualTo(String value) {
            addCriterion("XINGBIE2 =", value, "xingbie2");
            return (Criteria) this;
        }

        public Criteria andXingbie2NotEqualTo(String value) {
            addCriterion("XINGBIE2 <>", value, "xingbie2");
            return (Criteria) this;
        }

        public Criteria andXingbie2GreaterThan(String value) {
            addCriterion("XINGBIE2 >", value, "xingbie2");
            return (Criteria) this;
        }

        public Criteria andXingbie2GreaterThanOrEqualTo(String value) {
            addCriterion("XINGBIE2 >=", value, "xingbie2");
            return (Criteria) this;
        }

        public Criteria andXingbie2LessThan(String value) {
            addCriterion("XINGBIE2 <", value, "xingbie2");
            return (Criteria) this;
        }

        public Criteria andXingbie2LessThanOrEqualTo(String value) {
            addCriterion("XINGBIE2 <=", value, "xingbie2");
            return (Criteria) this;
        }

        public Criteria andXingbie2Like(String value) {
            addCriterion("XINGBIE2 like", value, "xingbie2");
            return (Criteria) this;
        }

        public Criteria andXingbie2NotLike(String value) {
            addCriterion("XINGBIE2 not like", value, "xingbie2");
            return (Criteria) this;
        }

        public Criteria andXingbie2In(List<String> values) {
            addCriterion("XINGBIE2 in", values, "xingbie2");
            return (Criteria) this;
        }

        public Criteria andXingbie2NotIn(List<String> values) {
            addCriterion("XINGBIE2 not in", values, "xingbie2");
            return (Criteria) this;
        }

        public Criteria andXingbie2Between(String value1, String value2) {
            addCriterion("XINGBIE2 between", value1, value2, "xingbie2");
            return (Criteria) this;
        }

        public Criteria andXingbie2NotBetween(String value1, String value2) {
            addCriterion("XINGBIE2 not between", value1, value2, "xingbie2");
            return (Criteria) this;
        }

        public Criteria andChushengnianyue2IsNull() {
            addCriterion("CHUSHENGNIANYUE2 is null");
            return (Criteria) this;
        }

        public Criteria andChushengnianyue2IsNotNull() {
            addCriterion("CHUSHENGNIANYUE2 is not null");
            return (Criteria) this;
        }

        public Criteria andChushengnianyue2EqualTo(Date value) {
            addCriterion("CHUSHENGNIANYUE2 =", value, "chushengnianyue2");
            return (Criteria) this;
        }

        public Criteria andChushengnianyue2NotEqualTo(Date value) {
            addCriterion("CHUSHENGNIANYUE2 <>", value, "chushengnianyue2");
            return (Criteria) this;
        }

        public Criteria andChushengnianyue2GreaterThan(Date value) {
            addCriterion("CHUSHENGNIANYUE2 >", value, "chushengnianyue2");
            return (Criteria) this;
        }

        public Criteria andChushengnianyue2GreaterThanOrEqualTo(Date value) {
            addCriterion("CHUSHENGNIANYUE2 >=", value, "chushengnianyue2");
            return (Criteria) this;
        }

        public Criteria andChushengnianyue2LessThan(Date value) {
            addCriterion("CHUSHENGNIANYUE2 <", value, "chushengnianyue2");
            return (Criteria) this;
        }

        public Criteria andChushengnianyue2LessThanOrEqualTo(Date value) {
            addCriterion("CHUSHENGNIANYUE2 <=", value, "chushengnianyue2");
            return (Criteria) this;
        }

        public Criteria andChushengnianyue2In(List<Date> values) {
            addCriterion("CHUSHENGNIANYUE2 in", values, "chushengnianyue2");
            return (Criteria) this;
        }

        public Criteria andChushengnianyue2NotIn(List<Date> values) {
            addCriterion("CHUSHENGNIANYUE2 not in", values, "chushengnianyue2");
            return (Criteria) this;
        }

        public Criteria andChushengnianyue2Between(Date value1, Date value2) {
            addCriterion("CHUSHENGNIANYUE2 between", value1, value2, "chushengnianyue2");
            return (Criteria) this;
        }

        public Criteria andChushengnianyue2NotBetween(Date value1, Date value2) {
            addCriterion("CHUSHENGNIANYUE2 not between", value1, value2, "chushengnianyue2");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmao2IsNull() {
            addCriterion("ZHENGZHIMIANMAO2 is null");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmao2IsNotNull() {
            addCriterion("ZHENGZHIMIANMAO2 is not null");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmao2EqualTo(String value) {
            addCriterion("ZHENGZHIMIANMAO2 =", value, "zhengzhimianmao2");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmao2NotEqualTo(String value) {
            addCriterion("ZHENGZHIMIANMAO2 <>", value, "zhengzhimianmao2");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmao2GreaterThan(String value) {
            addCriterion("ZHENGZHIMIANMAO2 >", value, "zhengzhimianmao2");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmao2GreaterThanOrEqualTo(String value) {
            addCriterion("ZHENGZHIMIANMAO2 >=", value, "zhengzhimianmao2");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmao2LessThan(String value) {
            addCriterion("ZHENGZHIMIANMAO2 <", value, "zhengzhimianmao2");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmao2LessThanOrEqualTo(String value) {
            addCriterion("ZHENGZHIMIANMAO2 <=", value, "zhengzhimianmao2");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmao2Like(String value) {
            addCriterion("ZHENGZHIMIANMAO2 like", value, "zhengzhimianmao2");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmao2NotLike(String value) {
            addCriterion("ZHENGZHIMIANMAO2 not like", value, "zhengzhimianmao2");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmao2In(List<String> values) {
            addCriterion("ZHENGZHIMIANMAO2 in", values, "zhengzhimianmao2");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmao2NotIn(List<String> values) {
            addCriterion("ZHENGZHIMIANMAO2 not in", values, "zhengzhimianmao2");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmao2Between(String value1, String value2) {
            addCriterion("ZHENGZHIMIANMAO2 between", value1, value2, "zhengzhimianmao2");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmao2NotBetween(String value1, String value2) {
            addCriterion("ZHENGZHIMIANMAO2 not between", value1, value2, "zhengzhimianmao2");
            return (Criteria) this;
        }

        public Criteria andXueli2IsNull() {
            addCriterion("XUELI2 is null");
            return (Criteria) this;
        }

        public Criteria andXueli2IsNotNull() {
            addCriterion("XUELI2 is not null");
            return (Criteria) this;
        }

        public Criteria andXueli2EqualTo(String value) {
            addCriterion("XUELI2 =", value, "xueli2");
            return (Criteria) this;
        }

        public Criteria andXueli2NotEqualTo(String value) {
            addCriterion("XUELI2 <>", value, "xueli2");
            return (Criteria) this;
        }

        public Criteria andXueli2GreaterThan(String value) {
            addCriterion("XUELI2 >", value, "xueli2");
            return (Criteria) this;
        }

        public Criteria andXueli2GreaterThanOrEqualTo(String value) {
            addCriterion("XUELI2 >=", value, "xueli2");
            return (Criteria) this;
        }

        public Criteria andXueli2LessThan(String value) {
            addCriterion("XUELI2 <", value, "xueli2");
            return (Criteria) this;
        }

        public Criteria andXueli2LessThanOrEqualTo(String value) {
            addCriterion("XUELI2 <=", value, "xueli2");
            return (Criteria) this;
        }

        public Criteria andXueli2Like(String value) {
            addCriterion("XUELI2 like", value, "xueli2");
            return (Criteria) this;
        }

        public Criteria andXueli2NotLike(String value) {
            addCriterion("XUELI2 not like", value, "xueli2");
            return (Criteria) this;
        }

        public Criteria andXueli2In(List<String> values) {
            addCriterion("XUELI2 in", values, "xueli2");
            return (Criteria) this;
        }

        public Criteria andXueli2NotIn(List<String> values) {
            addCriterion("XUELI2 not in", values, "xueli2");
            return (Criteria) this;
        }

        public Criteria andXueli2Between(String value1, String value2) {
            addCriterion("XUELI2 between", value1, value2, "xueli2");
            return (Criteria) this;
        }

        public Criteria andXueli2NotBetween(String value1, String value2) {
            addCriterion("XUELI2 not between", value1, value2, "xueli2");
            return (Criteria) this;
        }

        public Criteria andLianxidianhua2IsNull() {
            addCriterion("LIANXIDIANHUA2 is null");
            return (Criteria) this;
        }

        public Criteria andLianxidianhua2IsNotNull() {
            addCriterion("LIANXIDIANHUA2 is not null");
            return (Criteria) this;
        }

        public Criteria andLianxidianhua2EqualTo(String value) {
            addCriterion("LIANXIDIANHUA2 =", value, "lianxidianhua2");
            return (Criteria) this;
        }

        public Criteria andLianxidianhua2NotEqualTo(String value) {
            addCriterion("LIANXIDIANHUA2 <>", value, "lianxidianhua2");
            return (Criteria) this;
        }

        public Criteria andLianxidianhua2GreaterThan(String value) {
            addCriterion("LIANXIDIANHUA2 >", value, "lianxidianhua2");
            return (Criteria) this;
        }

        public Criteria andLianxidianhua2GreaterThanOrEqualTo(String value) {
            addCriterion("LIANXIDIANHUA2 >=", value, "lianxidianhua2");
            return (Criteria) this;
        }

        public Criteria andLianxidianhua2LessThan(String value) {
            addCriterion("LIANXIDIANHUA2 <", value, "lianxidianhua2");
            return (Criteria) this;
        }

        public Criteria andLianxidianhua2LessThanOrEqualTo(String value) {
            addCriterion("LIANXIDIANHUA2 <=", value, "lianxidianhua2");
            return (Criteria) this;
        }

        public Criteria andLianxidianhua2Like(String value) {
            addCriterion("LIANXIDIANHUA2 like", value, "lianxidianhua2");
            return (Criteria) this;
        }

        public Criteria andLianxidianhua2NotLike(String value) {
            addCriterion("LIANXIDIANHUA2 not like", value, "lianxidianhua2");
            return (Criteria) this;
        }

        public Criteria andLianxidianhua2In(List<String> values) {
            addCriterion("LIANXIDIANHUA2 in", values, "lianxidianhua2");
            return (Criteria) this;
        }

        public Criteria andLianxidianhua2NotIn(List<String> values) {
            addCriterion("LIANXIDIANHUA2 not in", values, "lianxidianhua2");
            return (Criteria) this;
        }

        public Criteria andLianxidianhua2Between(String value1, String value2) {
            addCriterion("LIANXIDIANHUA2 between", value1, value2, "lianxidianhua2");
            return (Criteria) this;
        }

        public Criteria andLianxidianhua2NotBetween(String value1, String value2) {
            addCriterion("LIANXIDIANHUA2 not between", value1, value2, "lianxidianhua2");
            return (Criteria) this;
        }

        public Criteria andXingbie3IsNull() {
            addCriterion("XINGBIE3 is null");
            return (Criteria) this;
        }

        public Criteria andXingbie3IsNotNull() {
            addCriterion("XINGBIE3 is not null");
            return (Criteria) this;
        }

        public Criteria andXingbie3EqualTo(String value) {
            addCriterion("XINGBIE3 =", value, "xingbie3");
            return (Criteria) this;
        }

        public Criteria andXingbie3NotEqualTo(String value) {
            addCriterion("XINGBIE3 <>", value, "xingbie3");
            return (Criteria) this;
        }

        public Criteria andXingbie3GreaterThan(String value) {
            addCriterion("XINGBIE3 >", value, "xingbie3");
            return (Criteria) this;
        }

        public Criteria andXingbie3GreaterThanOrEqualTo(String value) {
            addCriterion("XINGBIE3 >=", value, "xingbie3");
            return (Criteria) this;
        }

        public Criteria andXingbie3LessThan(String value) {
            addCriterion("XINGBIE3 <", value, "xingbie3");
            return (Criteria) this;
        }

        public Criteria andXingbie3LessThanOrEqualTo(String value) {
            addCriterion("XINGBIE3 <=", value, "xingbie3");
            return (Criteria) this;
        }

        public Criteria andXingbie3Like(String value) {
            addCriterion("XINGBIE3 like", value, "xingbie3");
            return (Criteria) this;
        }

        public Criteria andXingbie3NotLike(String value) {
            addCriterion("XINGBIE3 not like", value, "xingbie3");
            return (Criteria) this;
        }

        public Criteria andXingbie3In(List<String> values) {
            addCriterion("XINGBIE3 in", values, "xingbie3");
            return (Criteria) this;
        }

        public Criteria andXingbie3NotIn(List<String> values) {
            addCriterion("XINGBIE3 not in", values, "xingbie3");
            return (Criteria) this;
        }

        public Criteria andXingbie3Between(String value1, String value2) {
            addCriterion("XINGBIE3 between", value1, value2, "xingbie3");
            return (Criteria) this;
        }

        public Criteria andXingbie3NotBetween(String value1, String value2) {
            addCriterion("XINGBIE3 not between", value1, value2, "xingbie3");
            return (Criteria) this;
        }

        public Criteria andChushengnianyue3IsNull() {
            addCriterion("CHUSHENGNIANYUE3 is null");
            return (Criteria) this;
        }

        public Criteria andChushengnianyue3IsNotNull() {
            addCriterion("CHUSHENGNIANYUE3 is not null");
            return (Criteria) this;
        }

        public Criteria andChushengnianyue3EqualTo(Date value) {
            addCriterion("CHUSHENGNIANYUE3 =", value, "chushengnianyue3");
            return (Criteria) this;
        }

        public Criteria andChushengnianyue3NotEqualTo(Date value) {
            addCriterion("CHUSHENGNIANYUE3 <>", value, "chushengnianyue3");
            return (Criteria) this;
        }

        public Criteria andChushengnianyue3GreaterThan(Date value) {
            addCriterion("CHUSHENGNIANYUE3 >", value, "chushengnianyue3");
            return (Criteria) this;
        }

        public Criteria andChushengnianyue3GreaterThanOrEqualTo(Date value) {
            addCriterion("CHUSHENGNIANYUE3 >=", value, "chushengnianyue3");
            return (Criteria) this;
        }

        public Criteria andChushengnianyue3LessThan(Date value) {
            addCriterion("CHUSHENGNIANYUE3 <", value, "chushengnianyue3");
            return (Criteria) this;
        }

        public Criteria andChushengnianyue3LessThanOrEqualTo(Date value) {
            addCriterion("CHUSHENGNIANYUE3 <=", value, "chushengnianyue3");
            return (Criteria) this;
        }

        public Criteria andChushengnianyue3In(List<Date> values) {
            addCriterion("CHUSHENGNIANYUE3 in", values, "chushengnianyue3");
            return (Criteria) this;
        }

        public Criteria andChushengnianyue3NotIn(List<Date> values) {
            addCriterion("CHUSHENGNIANYUE3 not in", values, "chushengnianyue3");
            return (Criteria) this;
        }

        public Criteria andChushengnianyue3Between(Date value1, Date value2) {
            addCriterion("CHUSHENGNIANYUE3 between", value1, value2, "chushengnianyue3");
            return (Criteria) this;
        }

        public Criteria andChushengnianyue3NotBetween(Date value1, Date value2) {
            addCriterion("CHUSHENGNIANYUE3 not between", value1, value2, "chushengnianyue3");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmao3IsNull() {
            addCriterion("ZHENGZHIMIANMAO3 is null");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmao3IsNotNull() {
            addCriterion("ZHENGZHIMIANMAO3 is not null");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmao3EqualTo(String value) {
            addCriterion("ZHENGZHIMIANMAO3 =", value, "zhengzhimianmao3");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmao3NotEqualTo(String value) {
            addCriterion("ZHENGZHIMIANMAO3 <>", value, "zhengzhimianmao3");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmao3GreaterThan(String value) {
            addCriterion("ZHENGZHIMIANMAO3 >", value, "zhengzhimianmao3");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmao3GreaterThanOrEqualTo(String value) {
            addCriterion("ZHENGZHIMIANMAO3 >=", value, "zhengzhimianmao3");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmao3LessThan(String value) {
            addCriterion("ZHENGZHIMIANMAO3 <", value, "zhengzhimianmao3");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmao3LessThanOrEqualTo(String value) {
            addCriterion("ZHENGZHIMIANMAO3 <=", value, "zhengzhimianmao3");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmao3Like(String value) {
            addCriterion("ZHENGZHIMIANMAO3 like", value, "zhengzhimianmao3");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmao3NotLike(String value) {
            addCriterion("ZHENGZHIMIANMAO3 not like", value, "zhengzhimianmao3");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmao3In(List<String> values) {
            addCriterion("ZHENGZHIMIANMAO3 in", values, "zhengzhimianmao3");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmao3NotIn(List<String> values) {
            addCriterion("ZHENGZHIMIANMAO3 not in", values, "zhengzhimianmao3");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmao3Between(String value1, String value2) {
            addCriterion("ZHENGZHIMIANMAO3 between", value1, value2, "zhengzhimianmao3");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmao3NotBetween(String value1, String value2) {
            addCriterion("ZHENGZHIMIANMAO3 not between", value1, value2, "zhengzhimianmao3");
            return (Criteria) this;
        }

        public Criteria andXueli3IsNull() {
            addCriterion("XUELI3 is null");
            return (Criteria) this;
        }

        public Criteria andXueli3IsNotNull() {
            addCriterion("XUELI3 is not null");
            return (Criteria) this;
        }

        public Criteria andXueli3EqualTo(String value) {
            addCriterion("XUELI3 =", value, "xueli3");
            return (Criteria) this;
        }

        public Criteria andXueli3NotEqualTo(String value) {
            addCriterion("XUELI3 <>", value, "xueli3");
            return (Criteria) this;
        }

        public Criteria andXueli3GreaterThan(String value) {
            addCriterion("XUELI3 >", value, "xueli3");
            return (Criteria) this;
        }

        public Criteria andXueli3GreaterThanOrEqualTo(String value) {
            addCriterion("XUELI3 >=", value, "xueli3");
            return (Criteria) this;
        }

        public Criteria andXueli3LessThan(String value) {
            addCriterion("XUELI3 <", value, "xueli3");
            return (Criteria) this;
        }

        public Criteria andXueli3LessThanOrEqualTo(String value) {
            addCriterion("XUELI3 <=", value, "xueli3");
            return (Criteria) this;
        }

        public Criteria andXueli3Like(String value) {
            addCriterion("XUELI3 like", value, "xueli3");
            return (Criteria) this;
        }

        public Criteria andXueli3NotLike(String value) {
            addCriterion("XUELI3 not like", value, "xueli3");
            return (Criteria) this;
        }

        public Criteria andXueli3In(List<String> values) {
            addCriterion("XUELI3 in", values, "xueli3");
            return (Criteria) this;
        }

        public Criteria andXueli3NotIn(List<String> values) {
            addCriterion("XUELI3 not in", values, "xueli3");
            return (Criteria) this;
        }

        public Criteria andXueli3Between(String value1, String value2) {
            addCriterion("XUELI3 between", value1, value2, "xueli3");
            return (Criteria) this;
        }

        public Criteria andXueli3NotBetween(String value1, String value2) {
            addCriterion("XUELI3 not between", value1, value2, "xueli3");
            return (Criteria) this;
        }

        public Criteria andChanshengfangshiIsNull() {
            addCriterion("CHANSHENGFANGSHI is null");
            return (Criteria) this;
        }

        public Criteria andChanshengfangshiIsNotNull() {
            addCriterion("CHANSHENGFANGSHI is not null");
            return (Criteria) this;
        }

        public Criteria andChanshengfangshiEqualTo(String value) {
            addCriterion("CHANSHENGFANGSHI =", value, "chanshengfangshi");
            return (Criteria) this;
        }

        public Criteria andChanshengfangshiNotEqualTo(String value) {
            addCriterion("CHANSHENGFANGSHI <>", value, "chanshengfangshi");
            return (Criteria) this;
        }

        public Criteria andChanshengfangshiGreaterThan(String value) {
            addCriterion("CHANSHENGFANGSHI >", value, "chanshengfangshi");
            return (Criteria) this;
        }

        public Criteria andChanshengfangshiGreaterThanOrEqualTo(String value) {
            addCriterion("CHANSHENGFANGSHI >=", value, "chanshengfangshi");
            return (Criteria) this;
        }

        public Criteria andChanshengfangshiLessThan(String value) {
            addCriterion("CHANSHENGFANGSHI <", value, "chanshengfangshi");
            return (Criteria) this;
        }

        public Criteria andChanshengfangshiLessThanOrEqualTo(String value) {
            addCriterion("CHANSHENGFANGSHI <=", value, "chanshengfangshi");
            return (Criteria) this;
        }

        public Criteria andChanshengfangshiLike(String value) {
            addCriterion("CHANSHENGFANGSHI like", value, "chanshengfangshi");
            return (Criteria) this;
        }

        public Criteria andChanshengfangshiNotLike(String value) {
            addCriterion("CHANSHENGFANGSHI not like", value, "chanshengfangshi");
            return (Criteria) this;
        }

        public Criteria andChanshengfangshiIn(List<String> values) {
            addCriterion("CHANSHENGFANGSHI in", values, "chanshengfangshi");
            return (Criteria) this;
        }

        public Criteria andChanshengfangshiNotIn(List<String> values) {
            addCriterion("CHANSHENGFANGSHI not in", values, "chanshengfangshi");
            return (Criteria) this;
        }

        public Criteria andChanshengfangshiBetween(String value1, String value2) {
            addCriterion("CHANSHENGFANGSHI between", value1, value2, "chanshengfangshi");
            return (Criteria) this;
        }

        public Criteria andChanshengfangshiNotBetween(String value1, String value2) {
            addCriterion("CHANSHENGFANGSHI not between", value1, value2, "chanshengfangshi");
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

        public Criteria andQuantinianlingEqualTo(String value) {
            addCriterion("QUANTINIANLING =", value, "quantinianling");
            return (Criteria) this;
        }

        public Criteria andQuantinianlingNotEqualTo(String value) {
            addCriterion("QUANTINIANLING <>", value, "quantinianling");
            return (Criteria) this;
        }

        public Criteria andQuantinianlingGreaterThan(String value) {
            addCriterion("QUANTINIANLING >", value, "quantinianling");
            return (Criteria) this;
        }

        public Criteria andQuantinianlingGreaterThanOrEqualTo(String value) {
            addCriterion("QUANTINIANLING >=", value, "quantinianling");
            return (Criteria) this;
        }

        public Criteria andQuantinianlingLessThan(String value) {
            addCriterion("QUANTINIANLING <", value, "quantinianling");
            return (Criteria) this;
        }

        public Criteria andQuantinianlingLessThanOrEqualTo(String value) {
            addCriterion("QUANTINIANLING <=", value, "quantinianling");
            return (Criteria) this;
        }

        public Criteria andQuantinianlingLike(String value) {
            addCriterion("QUANTINIANLING like", value, "quantinianling");
            return (Criteria) this;
        }

        public Criteria andQuantinianlingNotLike(String value) {
            addCriterion("QUANTINIANLING not like", value, "quantinianling");
            return (Criteria) this;
        }

        public Criteria andQuantinianlingIn(List<String> values) {
            addCriterion("QUANTINIANLING in", values, "quantinianling");
            return (Criteria) this;
        }

        public Criteria andQuantinianlingNotIn(List<String> values) {
            addCriterion("QUANTINIANLING not in", values, "quantinianling");
            return (Criteria) this;
        }

        public Criteria andQuantinianlingBetween(String value1, String value2) {
            addCriterion("QUANTINIANLING between", value1, value2, "quantinianling");
            return (Criteria) this;
        }

        public Criteria andQuantinianlingNotBetween(String value1, String value2) {
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

        public Criteria andQuantinvxingEqualTo(String value) {
            addCriterion("QUANTINVXING =", value, "quantinvxing");
            return (Criteria) this;
        }

        public Criteria andQuantinvxingNotEqualTo(String value) {
            addCriterion("QUANTINVXING <>", value, "quantinvxing");
            return (Criteria) this;
        }

        public Criteria andQuantinvxingGreaterThan(String value) {
            addCriterion("QUANTINVXING >", value, "quantinvxing");
            return (Criteria) this;
        }

        public Criteria andQuantinvxingGreaterThanOrEqualTo(String value) {
            addCriterion("QUANTINVXING >=", value, "quantinvxing");
            return (Criteria) this;
        }

        public Criteria andQuantinvxingLessThan(String value) {
            addCriterion("QUANTINVXING <", value, "quantinvxing");
            return (Criteria) this;
        }

        public Criteria andQuantinvxingLessThanOrEqualTo(String value) {
            addCriterion("QUANTINVXING <=", value, "quantinvxing");
            return (Criteria) this;
        }

        public Criteria andQuantinvxingLike(String value) {
            addCriterion("QUANTINVXING like", value, "quantinvxing");
            return (Criteria) this;
        }

        public Criteria andQuantinvxingNotLike(String value) {
            addCriterion("QUANTINVXING not like", value, "quantinvxing");
            return (Criteria) this;
        }

        public Criteria andQuantinvxingIn(List<String> values) {
            addCriterion("QUANTINVXING in", values, "quantinvxing");
            return (Criteria) this;
        }

        public Criteria andQuantinvxingNotIn(List<String> values) {
            addCriterion("QUANTINVXING not in", values, "quantinvxing");
            return (Criteria) this;
        }

        public Criteria andQuantinvxingBetween(String value1, String value2) {
            addCriterion("QUANTINVXING between", value1, value2, "quantinvxing");
            return (Criteria) this;
        }

        public Criteria andQuantinvxingNotBetween(String value1, String value2) {
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

        public Criteria andQuantibenkeEqualTo(String value) {
            addCriterion("QUANTIBENKE =", value, "quantibenke");
            return (Criteria) this;
        }

        public Criteria andQuantibenkeNotEqualTo(String value) {
            addCriterion("QUANTIBENKE <>", value, "quantibenke");
            return (Criteria) this;
        }

        public Criteria andQuantibenkeGreaterThan(String value) {
            addCriterion("QUANTIBENKE >", value, "quantibenke");
            return (Criteria) this;
        }

        public Criteria andQuantibenkeGreaterThanOrEqualTo(String value) {
            addCriterion("QUANTIBENKE >=", value, "quantibenke");
            return (Criteria) this;
        }

        public Criteria andQuantibenkeLessThan(String value) {
            addCriterion("QUANTIBENKE <", value, "quantibenke");
            return (Criteria) this;
        }

        public Criteria andQuantibenkeLessThanOrEqualTo(String value) {
            addCriterion("QUANTIBENKE <=", value, "quantibenke");
            return (Criteria) this;
        }

        public Criteria andQuantibenkeLike(String value) {
            addCriterion("QUANTIBENKE like", value, "quantibenke");
            return (Criteria) this;
        }

        public Criteria andQuantibenkeNotLike(String value) {
            addCriterion("QUANTIBENKE not like", value, "quantibenke");
            return (Criteria) this;
        }

        public Criteria andQuantibenkeIn(List<String> values) {
            addCriterion("QUANTIBENKE in", values, "quantibenke");
            return (Criteria) this;
        }

        public Criteria andQuantibenkeNotIn(List<String> values) {
            addCriterion("QUANTIBENKE not in", values, "quantibenke");
            return (Criteria) this;
        }

        public Criteria andQuantibenkeBetween(String value1, String value2) {
            addCriterion("QUANTIBENKE between", value1, value2, "quantibenke");
            return (Criteria) this;
        }

        public Criteria andQuantibenkeNotBetween(String value1, String value2) {
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

        public Criteria andQuantidangyuanEqualTo(String value) {
            addCriterion("QUANTIDANGYUAN =", value, "quantidangyuan");
            return (Criteria) this;
        }

        public Criteria andQuantidangyuanNotEqualTo(String value) {
            addCriterion("QUANTIDANGYUAN <>", value, "quantidangyuan");
            return (Criteria) this;
        }

        public Criteria andQuantidangyuanGreaterThan(String value) {
            addCriterion("QUANTIDANGYUAN >", value, "quantidangyuan");
            return (Criteria) this;
        }

        public Criteria andQuantidangyuanGreaterThanOrEqualTo(String value) {
            addCriterion("QUANTIDANGYUAN >=", value, "quantidangyuan");
            return (Criteria) this;
        }

        public Criteria andQuantidangyuanLessThan(String value) {
            addCriterion("QUANTIDANGYUAN <", value, "quantidangyuan");
            return (Criteria) this;
        }

        public Criteria andQuantidangyuanLessThanOrEqualTo(String value) {
            addCriterion("QUANTIDANGYUAN <=", value, "quantidangyuan");
            return (Criteria) this;
        }

        public Criteria andQuantidangyuanLike(String value) {
            addCriterion("QUANTIDANGYUAN like", value, "quantidangyuan");
            return (Criteria) this;
        }

        public Criteria andQuantidangyuanNotLike(String value) {
            addCriterion("QUANTIDANGYUAN not like", value, "quantidangyuan");
            return (Criteria) this;
        }

        public Criteria andQuantidangyuanIn(List<String> values) {
            addCriterion("QUANTIDANGYUAN in", values, "quantidangyuan");
            return (Criteria) this;
        }

        public Criteria andQuantidangyuanNotIn(List<String> values) {
            addCriterion("QUANTIDANGYUAN not in", values, "quantidangyuan");
            return (Criteria) this;
        }

        public Criteria andQuantidangyuanBetween(String value1, String value2) {
            addCriterion("QUANTIDANGYUAN between", value1, value2, "quantidangyuan");
            return (Criteria) this;
        }

        public Criteria andQuantidangyuanNotBetween(String value1, String value2) {
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

        public Criteria andZhuanzhinianlingEqualTo(String value) {
            addCriterion("ZHUANZHINIANLING =", value, "zhuanzhinianling");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinianlingNotEqualTo(String value) {
            addCriterion("ZHUANZHINIANLING <>", value, "zhuanzhinianling");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinianlingGreaterThan(String value) {
            addCriterion("ZHUANZHINIANLING >", value, "zhuanzhinianling");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinianlingGreaterThanOrEqualTo(String value) {
            addCriterion("ZHUANZHINIANLING >=", value, "zhuanzhinianling");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinianlingLessThan(String value) {
            addCriterion("ZHUANZHINIANLING <", value, "zhuanzhinianling");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinianlingLessThanOrEqualTo(String value) {
            addCriterion("ZHUANZHINIANLING <=", value, "zhuanzhinianling");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinianlingLike(String value) {
            addCriterion("ZHUANZHINIANLING like", value, "zhuanzhinianling");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinianlingNotLike(String value) {
            addCriterion("ZHUANZHINIANLING not like", value, "zhuanzhinianling");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinianlingIn(List<String> values) {
            addCriterion("ZHUANZHINIANLING in", values, "zhuanzhinianling");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinianlingNotIn(List<String> values) {
            addCriterion("ZHUANZHINIANLING not in", values, "zhuanzhinianling");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinianlingBetween(String value1, String value2) {
            addCriterion("ZHUANZHINIANLING between", value1, value2, "zhuanzhinianling");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinianlingNotBetween(String value1, String value2) {
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

        public Criteria andZhuanzhinvxingEqualTo(String value) {
            addCriterion("ZHUANZHINVXING =", value, "zhuanzhinvxing");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinvxingNotEqualTo(String value) {
            addCriterion("ZHUANZHINVXING <>", value, "zhuanzhinvxing");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinvxingGreaterThan(String value) {
            addCriterion("ZHUANZHINVXING >", value, "zhuanzhinvxing");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinvxingGreaterThanOrEqualTo(String value) {
            addCriterion("ZHUANZHINVXING >=", value, "zhuanzhinvxing");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinvxingLessThan(String value) {
            addCriterion("ZHUANZHINVXING <", value, "zhuanzhinvxing");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinvxingLessThanOrEqualTo(String value) {
            addCriterion("ZHUANZHINVXING <=", value, "zhuanzhinvxing");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinvxingLike(String value) {
            addCriterion("ZHUANZHINVXING like", value, "zhuanzhinvxing");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinvxingNotLike(String value) {
            addCriterion("ZHUANZHINVXING not like", value, "zhuanzhinvxing");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinvxingIn(List<String> values) {
            addCriterion("ZHUANZHINVXING in", values, "zhuanzhinvxing");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinvxingNotIn(List<String> values) {
            addCriterion("ZHUANZHINVXING not in", values, "zhuanzhinvxing");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinvxingBetween(String value1, String value2) {
            addCriterion("ZHUANZHINVXING between", value1, value2, "zhuanzhinvxing");
            return (Criteria) this;
        }

        public Criteria andZhuanzhinvxingNotBetween(String value1, String value2) {
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

        public Criteria andZhuanzhibenkeEqualTo(String value) {
            addCriterion("ZHUANZHIBENKE =", value, "zhuanzhibenke");
            return (Criteria) this;
        }

        public Criteria andZhuanzhibenkeNotEqualTo(String value) {
            addCriterion("ZHUANZHIBENKE <>", value, "zhuanzhibenke");
            return (Criteria) this;
        }

        public Criteria andZhuanzhibenkeGreaterThan(String value) {
            addCriterion("ZHUANZHIBENKE >", value, "zhuanzhibenke");
            return (Criteria) this;
        }

        public Criteria andZhuanzhibenkeGreaterThanOrEqualTo(String value) {
            addCriterion("ZHUANZHIBENKE >=", value, "zhuanzhibenke");
            return (Criteria) this;
        }

        public Criteria andZhuanzhibenkeLessThan(String value) {
            addCriterion("ZHUANZHIBENKE <", value, "zhuanzhibenke");
            return (Criteria) this;
        }

        public Criteria andZhuanzhibenkeLessThanOrEqualTo(String value) {
            addCriterion("ZHUANZHIBENKE <=", value, "zhuanzhibenke");
            return (Criteria) this;
        }

        public Criteria andZhuanzhibenkeLike(String value) {
            addCriterion("ZHUANZHIBENKE like", value, "zhuanzhibenke");
            return (Criteria) this;
        }

        public Criteria andZhuanzhibenkeNotLike(String value) {
            addCriterion("ZHUANZHIBENKE not like", value, "zhuanzhibenke");
            return (Criteria) this;
        }

        public Criteria andZhuanzhibenkeIn(List<String> values) {
            addCriterion("ZHUANZHIBENKE in", values, "zhuanzhibenke");
            return (Criteria) this;
        }

        public Criteria andZhuanzhibenkeNotIn(List<String> values) {
            addCriterion("ZHUANZHIBENKE not in", values, "zhuanzhibenke");
            return (Criteria) this;
        }

        public Criteria andZhuanzhibenkeBetween(String value1, String value2) {
            addCriterion("ZHUANZHIBENKE between", value1, value2, "zhuanzhibenke");
            return (Criteria) this;
        }

        public Criteria andZhuanzhibenkeNotBetween(String value1, String value2) {
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

        public Criteria andZhuanzhidangyuanEqualTo(String value) {
            addCriterion("ZHUANZHIDANGYUAN =", value, "zhuanzhidangyuan");
            return (Criteria) this;
        }

        public Criteria andZhuanzhidangyuanNotEqualTo(String value) {
            addCriterion("ZHUANZHIDANGYUAN <>", value, "zhuanzhidangyuan");
            return (Criteria) this;
        }

        public Criteria andZhuanzhidangyuanGreaterThan(String value) {
            addCriterion("ZHUANZHIDANGYUAN >", value, "zhuanzhidangyuan");
            return (Criteria) this;
        }

        public Criteria andZhuanzhidangyuanGreaterThanOrEqualTo(String value) {
            addCriterion("ZHUANZHIDANGYUAN >=", value, "zhuanzhidangyuan");
            return (Criteria) this;
        }

        public Criteria andZhuanzhidangyuanLessThan(String value) {
            addCriterion("ZHUANZHIDANGYUAN <", value, "zhuanzhidangyuan");
            return (Criteria) this;
        }

        public Criteria andZhuanzhidangyuanLessThanOrEqualTo(String value) {
            addCriterion("ZHUANZHIDANGYUAN <=", value, "zhuanzhidangyuan");
            return (Criteria) this;
        }

        public Criteria andZhuanzhidangyuanLike(String value) {
            addCriterion("ZHUANZHIDANGYUAN like", value, "zhuanzhidangyuan");
            return (Criteria) this;
        }

        public Criteria andZhuanzhidangyuanNotLike(String value) {
            addCriterion("ZHUANZHIDANGYUAN not like", value, "zhuanzhidangyuan");
            return (Criteria) this;
        }

        public Criteria andZhuanzhidangyuanIn(List<String> values) {
            addCriterion("ZHUANZHIDANGYUAN in", values, "zhuanzhidangyuan");
            return (Criteria) this;
        }

        public Criteria andZhuanzhidangyuanNotIn(List<String> values) {
            addCriterion("ZHUANZHIDANGYUAN not in", values, "zhuanzhidangyuan");
            return (Criteria) this;
        }

        public Criteria andZhuanzhidangyuanBetween(String value1, String value2) {
            addCriterion("ZHUANZHIDANGYUAN between", value1, value2, "zhuanzhidangyuan");
            return (Criteria) this;
        }

        public Criteria andZhuanzhidangyuanNotBetween(String value1, String value2) {
            addCriterion("ZHUANZHIDANGYUAN not between", value1, value2, "zhuanzhidangyuan");
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

        public Criteria andHuodongcishuEqualTo(String value) {
            addCriterion("HUODONGCISHU =", value, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuNotEqualTo(String value) {
            addCriterion("HUODONGCISHU <>", value, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuGreaterThan(String value) {
            addCriterion("HUODONGCISHU >", value, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuGreaterThanOrEqualTo(String value) {
            addCriterion("HUODONGCISHU >=", value, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuLessThan(String value) {
            addCriterion("HUODONGCISHU <", value, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuLessThanOrEqualTo(String value) {
            addCriterion("HUODONGCISHU <=", value, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuLike(String value) {
            addCriterion("HUODONGCISHU like", value, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuNotLike(String value) {
            addCriterion("HUODONGCISHU not like", value, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuIn(List<String> values) {
            addCriterion("HUODONGCISHU in", values, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuNotIn(List<String> values) {
            addCriterion("HUODONGCISHU not in", values, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuBetween(String value1, String value2) {
            addCriterion("HUODONGCISHU between", value1, value2, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuNotBetween(String value1, String value2) {
            addCriterion("HUODONGCISHU not between", value1, value2, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andJuanzengshouruIsNull() {
            addCriterion("JUANZENGSHOURU is null");
            return (Criteria) this;
        }

        public Criteria andJuanzengshouruIsNotNull() {
            addCriterion("JUANZENGSHOURU is not null");
            return (Criteria) this;
        }

        public Criteria andJuanzengshouruEqualTo(String value) {
            addCriterion("JUANZENGSHOURU =", value, "juanzengshouru");
            return (Criteria) this;
        }

        public Criteria andJuanzengshouruNotEqualTo(String value) {
            addCriterion("JUANZENGSHOURU <>", value, "juanzengshouru");
            return (Criteria) this;
        }

        public Criteria andJuanzengshouruGreaterThan(String value) {
            addCriterion("JUANZENGSHOURU >", value, "juanzengshouru");
            return (Criteria) this;
        }

        public Criteria andJuanzengshouruGreaterThanOrEqualTo(String value) {
            addCriterion("JUANZENGSHOURU >=", value, "juanzengshouru");
            return (Criteria) this;
        }

        public Criteria andJuanzengshouruLessThan(String value) {
            addCriterion("JUANZENGSHOURU <", value, "juanzengshouru");
            return (Criteria) this;
        }

        public Criteria andJuanzengshouruLessThanOrEqualTo(String value) {
            addCriterion("JUANZENGSHOURU <=", value, "juanzengshouru");
            return (Criteria) this;
        }

        public Criteria andJuanzengshouruLike(String value) {
            addCriterion("JUANZENGSHOURU like", value, "juanzengshouru");
            return (Criteria) this;
        }

        public Criteria andJuanzengshouruNotLike(String value) {
            addCriterion("JUANZENGSHOURU not like", value, "juanzengshouru");
            return (Criteria) this;
        }

        public Criteria andJuanzengshouruIn(List<String> values) {
            addCriterion("JUANZENGSHOURU in", values, "juanzengshouru");
            return (Criteria) this;
        }

        public Criteria andJuanzengshouruNotIn(List<String> values) {
            addCriterion("JUANZENGSHOURU not in", values, "juanzengshouru");
            return (Criteria) this;
        }

        public Criteria andJuanzengshouruBetween(String value1, String value2) {
            addCriterion("JUANZENGSHOURU between", value1, value2, "juanzengshouru");
            return (Criteria) this;
        }

        public Criteria andJuanzengshouruNotBetween(String value1, String value2) {
            addCriterion("JUANZENGSHOURU not between", value1, value2, "juanzengshouru");
            return (Criteria) this;
        }

        public Criteria andHuodongzhichuIsNull() {
            addCriterion("HUODONGZHICHU is null");
            return (Criteria) this;
        }

        public Criteria andHuodongzhichuIsNotNull() {
            addCriterion("HUODONGZHICHU is not null");
            return (Criteria) this;
        }

        public Criteria andHuodongzhichuEqualTo(String value) {
            addCriterion("HUODONGZHICHU =", value, "huodongzhichu");
            return (Criteria) this;
        }

        public Criteria andHuodongzhichuNotEqualTo(String value) {
            addCriterion("HUODONGZHICHU <>", value, "huodongzhichu");
            return (Criteria) this;
        }

        public Criteria andHuodongzhichuGreaterThan(String value) {
            addCriterion("HUODONGZHICHU >", value, "huodongzhichu");
            return (Criteria) this;
        }

        public Criteria andHuodongzhichuGreaterThanOrEqualTo(String value) {
            addCriterion("HUODONGZHICHU >=", value, "huodongzhichu");
            return (Criteria) this;
        }

        public Criteria andHuodongzhichuLessThan(String value) {
            addCriterion("HUODONGZHICHU <", value, "huodongzhichu");
            return (Criteria) this;
        }

        public Criteria andHuodongzhichuLessThanOrEqualTo(String value) {
            addCriterion("HUODONGZHICHU <=", value, "huodongzhichu");
            return (Criteria) this;
        }

        public Criteria andHuodongzhichuLike(String value) {
            addCriterion("HUODONGZHICHU like", value, "huodongzhichu");
            return (Criteria) this;
        }

        public Criteria andHuodongzhichuNotLike(String value) {
            addCriterion("HUODONGZHICHU not like", value, "huodongzhichu");
            return (Criteria) this;
        }

        public Criteria andHuodongzhichuIn(List<String> values) {
            addCriterion("HUODONGZHICHU in", values, "huodongzhichu");
            return (Criteria) this;
        }

        public Criteria andHuodongzhichuNotIn(List<String> values) {
            addCriterion("HUODONGZHICHU not in", values, "huodongzhichu");
            return (Criteria) this;
        }

        public Criteria andHuodongzhichuBetween(String value1, String value2) {
            addCriterion("HUODONGZHICHU between", value1, value2, "huodongzhichu");
            return (Criteria) this;
        }

        public Criteria andHuodongzhichuNotBetween(String value1, String value2) {
            addCriterion("HUODONGZHICHU not between", value1, value2, "huodongzhichu");
            return (Criteria) this;
        }

        public Criteria andFuwuxinnongcunIsNull() {
            addCriterion("FUWUXINNONGCUN is null");
            return (Criteria) this;
        }

        public Criteria andFuwuxinnongcunIsNotNull() {
            addCriterion("FUWUXINNONGCUN is not null");
            return (Criteria) this;
        }

        public Criteria andFuwuxinnongcunEqualTo(String value) {
            addCriterion("FUWUXINNONGCUN =", value, "fuwuxinnongcun");
            return (Criteria) this;
        }

        public Criteria andFuwuxinnongcunNotEqualTo(String value) {
            addCriterion("FUWUXINNONGCUN <>", value, "fuwuxinnongcun");
            return (Criteria) this;
        }

        public Criteria andFuwuxinnongcunGreaterThan(String value) {
            addCriterion("FUWUXINNONGCUN >", value, "fuwuxinnongcun");
            return (Criteria) this;
        }

        public Criteria andFuwuxinnongcunGreaterThanOrEqualTo(String value) {
            addCriterion("FUWUXINNONGCUN >=", value, "fuwuxinnongcun");
            return (Criteria) this;
        }

        public Criteria andFuwuxinnongcunLessThan(String value) {
            addCriterion("FUWUXINNONGCUN <", value, "fuwuxinnongcun");
            return (Criteria) this;
        }

        public Criteria andFuwuxinnongcunLessThanOrEqualTo(String value) {
            addCriterion("FUWUXINNONGCUN <=", value, "fuwuxinnongcun");
            return (Criteria) this;
        }

        public Criteria andFuwuxinnongcunLike(String value) {
            addCriterion("FUWUXINNONGCUN like", value, "fuwuxinnongcun");
            return (Criteria) this;
        }

        public Criteria andFuwuxinnongcunNotLike(String value) {
            addCriterion("FUWUXINNONGCUN not like", value, "fuwuxinnongcun");
            return (Criteria) this;
        }

        public Criteria andFuwuxinnongcunIn(List<String> values) {
            addCriterion("FUWUXINNONGCUN in", values, "fuwuxinnongcun");
            return (Criteria) this;
        }

        public Criteria andFuwuxinnongcunNotIn(List<String> values) {
            addCriterion("FUWUXINNONGCUN not in", values, "fuwuxinnongcun");
            return (Criteria) this;
        }

        public Criteria andFuwuxinnongcunBetween(String value1, String value2) {
            addCriterion("FUWUXINNONGCUN between", value1, value2, "fuwuxinnongcun");
            return (Criteria) this;
        }

        public Criteria andFuwuxinnongcunNotBetween(String value1, String value2) {
            addCriterion("FUWUXINNONGCUN not between", value1, value2, "fuwuxinnongcun");
            return (Criteria) this;
        }

        public Criteria andQitagongyixiangmuIsNull() {
            addCriterion("QITAGONGYIXIANGMU is null");
            return (Criteria) this;
        }

        public Criteria andQitagongyixiangmuIsNotNull() {
            addCriterion("QITAGONGYIXIANGMU is not null");
            return (Criteria) this;
        }

        public Criteria andQitagongyixiangmuEqualTo(String value) {
            addCriterion("QITAGONGYIXIANGMU =", value, "qitagongyixiangmu");
            return (Criteria) this;
        }

        public Criteria andQitagongyixiangmuNotEqualTo(String value) {
            addCriterion("QITAGONGYIXIANGMU <>", value, "qitagongyixiangmu");
            return (Criteria) this;
        }

        public Criteria andQitagongyixiangmuGreaterThan(String value) {
            addCriterion("QITAGONGYIXIANGMU >", value, "qitagongyixiangmu");
            return (Criteria) this;
        }

        public Criteria andQitagongyixiangmuGreaterThanOrEqualTo(String value) {
            addCriterion("QITAGONGYIXIANGMU >=", value, "qitagongyixiangmu");
            return (Criteria) this;
        }

        public Criteria andQitagongyixiangmuLessThan(String value) {
            addCriterion("QITAGONGYIXIANGMU <", value, "qitagongyixiangmu");
            return (Criteria) this;
        }

        public Criteria andQitagongyixiangmuLessThanOrEqualTo(String value) {
            addCriterion("QITAGONGYIXIANGMU <=", value, "qitagongyixiangmu");
            return (Criteria) this;
        }

        public Criteria andQitagongyixiangmuLike(String value) {
            addCriterion("QITAGONGYIXIANGMU like", value, "qitagongyixiangmu");
            return (Criteria) this;
        }

        public Criteria andQitagongyixiangmuNotLike(String value) {
            addCriterion("QITAGONGYIXIANGMU not like", value, "qitagongyixiangmu");
            return (Criteria) this;
        }

        public Criteria andQitagongyixiangmuIn(List<String> values) {
            addCriterion("QITAGONGYIXIANGMU in", values, "qitagongyixiangmu");
            return (Criteria) this;
        }

        public Criteria andQitagongyixiangmuNotIn(List<String> values) {
            addCriterion("QITAGONGYIXIANGMU not in", values, "qitagongyixiangmu");
            return (Criteria) this;
        }

        public Criteria andQitagongyixiangmuBetween(String value1, String value2) {
            addCriterion("QITAGONGYIXIANGMU between", value1, value2, "qitagongyixiangmu");
            return (Criteria) this;
        }

        public Criteria andQitagongyixiangmuNotBetween(String value1, String value2) {
            addCriterion("QITAGONGYIXIANGMU not between", value1, value2, "qitagongyixiangmu");
            return (Criteria) this;
        }

        public Criteria andGuojihezuoIsNull() {
            addCriterion("GUOJIHEZUO is null");
            return (Criteria) this;
        }

        public Criteria andGuojihezuoIsNotNull() {
            addCriterion("GUOJIHEZUO is not null");
            return (Criteria) this;
        }

        public Criteria andGuojihezuoEqualTo(String value) {
            addCriterion("GUOJIHEZUO =", value, "guojihezuo");
            return (Criteria) this;
        }

        public Criteria andGuojihezuoNotEqualTo(String value) {
            addCriterion("GUOJIHEZUO <>", value, "guojihezuo");
            return (Criteria) this;
        }

        public Criteria andGuojihezuoGreaterThan(String value) {
            addCriterion("GUOJIHEZUO >", value, "guojihezuo");
            return (Criteria) this;
        }

        public Criteria andGuojihezuoGreaterThanOrEqualTo(String value) {
            addCriterion("GUOJIHEZUO >=", value, "guojihezuo");
            return (Criteria) this;
        }

        public Criteria andGuojihezuoLessThan(String value) {
            addCriterion("GUOJIHEZUO <", value, "guojihezuo");
            return (Criteria) this;
        }

        public Criteria andGuojihezuoLessThanOrEqualTo(String value) {
            addCriterion("GUOJIHEZUO <=", value, "guojihezuo");
            return (Criteria) this;
        }

        public Criteria andGuojihezuoLike(String value) {
            addCriterion("GUOJIHEZUO like", value, "guojihezuo");
            return (Criteria) this;
        }

        public Criteria andGuojihezuoNotLike(String value) {
            addCriterion("GUOJIHEZUO not like", value, "guojihezuo");
            return (Criteria) this;
        }

        public Criteria andGuojihezuoIn(List<String> values) {
            addCriterion("GUOJIHEZUO in", values, "guojihezuo");
            return (Criteria) this;
        }

        public Criteria andGuojihezuoNotIn(List<String> values) {
            addCriterion("GUOJIHEZUO not in", values, "guojihezuo");
            return (Criteria) this;
        }

        public Criteria andGuojihezuoBetween(String value1, String value2) {
            addCriterion("GUOJIHEZUO between", value1, value2, "guojihezuo");
            return (Criteria) this;
        }

        public Criteria andGuojihezuoNotBetween(String value1, String value2) {
            addCriterion("GUOJIHEZUO not between", value1, value2, "guojihezuo");
            return (Criteria) this;
        }

        public Criteria andGuojihuiyiIsNull() {
            addCriterion("GUOJIHUIYI is null");
            return (Criteria) this;
        }

        public Criteria andGuojihuiyiIsNotNull() {
            addCriterion("GUOJIHUIYI is not null");
            return (Criteria) this;
        }

        public Criteria andGuojihuiyiEqualTo(String value) {
            addCriterion("GUOJIHUIYI =", value, "guojihuiyi");
            return (Criteria) this;
        }

        public Criteria andGuojihuiyiNotEqualTo(String value) {
            addCriterion("GUOJIHUIYI <>", value, "guojihuiyi");
            return (Criteria) this;
        }

        public Criteria andGuojihuiyiGreaterThan(String value) {
            addCriterion("GUOJIHUIYI >", value, "guojihuiyi");
            return (Criteria) this;
        }

        public Criteria andGuojihuiyiGreaterThanOrEqualTo(String value) {
            addCriterion("GUOJIHUIYI >=", value, "guojihuiyi");
            return (Criteria) this;
        }

        public Criteria andGuojihuiyiLessThan(String value) {
            addCriterion("GUOJIHUIYI <", value, "guojihuiyi");
            return (Criteria) this;
        }

        public Criteria andGuojihuiyiLessThanOrEqualTo(String value) {
            addCriterion("GUOJIHUIYI <=", value, "guojihuiyi");
            return (Criteria) this;
        }

        public Criteria andGuojihuiyiLike(String value) {
            addCriterion("GUOJIHUIYI like", value, "guojihuiyi");
            return (Criteria) this;
        }

        public Criteria andGuojihuiyiNotLike(String value) {
            addCriterion("GUOJIHUIYI not like", value, "guojihuiyi");
            return (Criteria) this;
        }

        public Criteria andGuojihuiyiIn(List<String> values) {
            addCriterion("GUOJIHUIYI in", values, "guojihuiyi");
            return (Criteria) this;
        }

        public Criteria andGuojihuiyiNotIn(List<String> values) {
            addCriterion("GUOJIHUIYI not in", values, "guojihuiyi");
            return (Criteria) this;
        }

        public Criteria andGuojihuiyiBetween(String value1, String value2) {
            addCriterion("GUOJIHUIYI between", value1, value2, "guojihuiyi");
            return (Criteria) this;
        }

        public Criteria andGuojihuiyiNotBetween(String value1, String value2) {
            addCriterion("GUOJIHUIYI not between", value1, value2, "guojihuiyi");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhiIsNull() {
            addCriterion("GUOJIZUZHI is null");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhiIsNotNull() {
            addCriterion("GUOJIZUZHI is not null");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhiEqualTo(String value) {
            addCriterion("GUOJIZUZHI =", value, "guojizuzhi");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhiNotEqualTo(String value) {
            addCriterion("GUOJIZUZHI <>", value, "guojizuzhi");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhiGreaterThan(String value) {
            addCriterion("GUOJIZUZHI >", value, "guojizuzhi");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhiGreaterThanOrEqualTo(String value) {
            addCriterion("GUOJIZUZHI >=", value, "guojizuzhi");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhiLessThan(String value) {
            addCriterion("GUOJIZUZHI <", value, "guojizuzhi");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhiLessThanOrEqualTo(String value) {
            addCriterion("GUOJIZUZHI <=", value, "guojizuzhi");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhiLike(String value) {
            addCriterion("GUOJIZUZHI like", value, "guojizuzhi");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhiNotLike(String value) {
            addCriterion("GUOJIZUZHI not like", value, "guojizuzhi");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhiIn(List<String> values) {
            addCriterion("GUOJIZUZHI in", values, "guojizuzhi");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhiNotIn(List<String> values) {
            addCriterion("GUOJIZUZHI not in", values, "guojizuzhi");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhiBetween(String value1, String value2) {
            addCriterion("GUOJIZUZHI between", value1, value2, "guojizuzhi");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhiNotBetween(String value1, String value2) {
            addCriterion("GUOJIZUZHI not between", value1, value2, "guojizuzhi");
            return (Criteria) this;
        }

        public Criteria andChuguofangwenIsNull() {
            addCriterion("CHUGUOFANGWEN is null");
            return (Criteria) this;
        }

        public Criteria andChuguofangwenIsNotNull() {
            addCriterion("CHUGUOFANGWEN is not null");
            return (Criteria) this;
        }

        public Criteria andChuguofangwenEqualTo(String value) {
            addCriterion("CHUGUOFANGWEN =", value, "chuguofangwen");
            return (Criteria) this;
        }

        public Criteria andChuguofangwenNotEqualTo(String value) {
            addCriterion("CHUGUOFANGWEN <>", value, "chuguofangwen");
            return (Criteria) this;
        }

        public Criteria andChuguofangwenGreaterThan(String value) {
            addCriterion("CHUGUOFANGWEN >", value, "chuguofangwen");
            return (Criteria) this;
        }

        public Criteria andChuguofangwenGreaterThanOrEqualTo(String value) {
            addCriterion("CHUGUOFANGWEN >=", value, "chuguofangwen");
            return (Criteria) this;
        }

        public Criteria andChuguofangwenLessThan(String value) {
            addCriterion("CHUGUOFANGWEN <", value, "chuguofangwen");
            return (Criteria) this;
        }

        public Criteria andChuguofangwenLessThanOrEqualTo(String value) {
            addCriterion("CHUGUOFANGWEN <=", value, "chuguofangwen");
            return (Criteria) this;
        }

        public Criteria andChuguofangwenLike(String value) {
            addCriterion("CHUGUOFANGWEN like", value, "chuguofangwen");
            return (Criteria) this;
        }

        public Criteria andChuguofangwenNotLike(String value) {
            addCriterion("CHUGUOFANGWEN not like", value, "chuguofangwen");
            return (Criteria) this;
        }

        public Criteria andChuguofangwenIn(List<String> values) {
            addCriterion("CHUGUOFANGWEN in", values, "chuguofangwen");
            return (Criteria) this;
        }

        public Criteria andChuguofangwenNotIn(List<String> values) {
            addCriterion("CHUGUOFANGWEN not in", values, "chuguofangwen");
            return (Criteria) this;
        }

        public Criteria andChuguofangwenBetween(String value1, String value2) {
            addCriterion("CHUGUOFANGWEN between", value1, value2, "chuguofangwen");
            return (Criteria) this;
        }

        public Criteria andChuguofangwenNotBetween(String value1, String value2) {
            addCriterion("CHUGUOFANGWEN not between", value1, value2, "chuguofangwen");
            return (Criteria) this;
        }

        public Criteria andJieshoukuanwuIsNull() {
            addCriterion("JIESHOUKUANWU is null");
            return (Criteria) this;
        }

        public Criteria andJieshoukuanwuIsNotNull() {
            addCriterion("JIESHOUKUANWU is not null");
            return (Criteria) this;
        }

        public Criteria andJieshoukuanwuEqualTo(String value) {
            addCriterion("JIESHOUKUANWU =", value, "jieshoukuanwu");
            return (Criteria) this;
        }

        public Criteria andJieshoukuanwuNotEqualTo(String value) {
            addCriterion("JIESHOUKUANWU <>", value, "jieshoukuanwu");
            return (Criteria) this;
        }

        public Criteria andJieshoukuanwuGreaterThan(String value) {
            addCriterion("JIESHOUKUANWU >", value, "jieshoukuanwu");
            return (Criteria) this;
        }

        public Criteria andJieshoukuanwuGreaterThanOrEqualTo(String value) {
            addCriterion("JIESHOUKUANWU >=", value, "jieshoukuanwu");
            return (Criteria) this;
        }

        public Criteria andJieshoukuanwuLessThan(String value) {
            addCriterion("JIESHOUKUANWU <", value, "jieshoukuanwu");
            return (Criteria) this;
        }

        public Criteria andJieshoukuanwuLessThanOrEqualTo(String value) {
            addCriterion("JIESHOUKUANWU <=", value, "jieshoukuanwu");
            return (Criteria) this;
        }

        public Criteria andJieshoukuanwuLike(String value) {
            addCriterion("JIESHOUKUANWU like", value, "jieshoukuanwu");
            return (Criteria) this;
        }

        public Criteria andJieshoukuanwuNotLike(String value) {
            addCriterion("JIESHOUKUANWU not like", value, "jieshoukuanwu");
            return (Criteria) this;
        }

        public Criteria andJieshoukuanwuIn(List<String> values) {
            addCriterion("JIESHOUKUANWU in", values, "jieshoukuanwu");
            return (Criteria) this;
        }

        public Criteria andJieshoukuanwuNotIn(List<String> values) {
            addCriterion("JIESHOUKUANWU not in", values, "jieshoukuanwu");
            return (Criteria) this;
        }

        public Criteria andJieshoukuanwuBetween(String value1, String value2) {
            addCriterion("JIESHOUKUANWU between", value1, value2, "jieshoukuanwu");
            return (Criteria) this;
        }

        public Criteria andJieshoukuanwuNotBetween(String value1, String value2) {
            addCriterion("JIESHOUKUANWU not between", value1, value2, "jieshoukuanwu");
            return (Criteria) this;
        }

        public Criteria andZuzhijuanzengIsNull() {
            addCriterion("ZUZHIJUANZENG is null");
            return (Criteria) this;
        }

        public Criteria andZuzhijuanzengIsNotNull() {
            addCriterion("ZUZHIJUANZENG is not null");
            return (Criteria) this;
        }

        public Criteria andZuzhijuanzengEqualTo(String value) {
            addCriterion("ZUZHIJUANZENG =", value, "zuzhijuanzeng");
            return (Criteria) this;
        }

        public Criteria andZuzhijuanzengNotEqualTo(String value) {
            addCriterion("ZUZHIJUANZENG <>", value, "zuzhijuanzeng");
            return (Criteria) this;
        }

        public Criteria andZuzhijuanzengGreaterThan(String value) {
            addCriterion("ZUZHIJUANZENG >", value, "zuzhijuanzeng");
            return (Criteria) this;
        }

        public Criteria andZuzhijuanzengGreaterThanOrEqualTo(String value) {
            addCriterion("ZUZHIJUANZENG >=", value, "zuzhijuanzeng");
            return (Criteria) this;
        }

        public Criteria andZuzhijuanzengLessThan(String value) {
            addCriterion("ZUZHIJUANZENG <", value, "zuzhijuanzeng");
            return (Criteria) this;
        }

        public Criteria andZuzhijuanzengLessThanOrEqualTo(String value) {
            addCriterion("ZUZHIJUANZENG <=", value, "zuzhijuanzeng");
            return (Criteria) this;
        }

        public Criteria andZuzhijuanzengLike(String value) {
            addCriterion("ZUZHIJUANZENG like", value, "zuzhijuanzeng");
            return (Criteria) this;
        }

        public Criteria andZuzhijuanzengNotLike(String value) {
            addCriterion("ZUZHIJUANZENG not like", value, "zuzhijuanzeng");
            return (Criteria) this;
        }

        public Criteria andZuzhijuanzengIn(List<String> values) {
            addCriterion("ZUZHIJUANZENG in", values, "zuzhijuanzeng");
            return (Criteria) this;
        }

        public Criteria andZuzhijuanzengNotIn(List<String> values) {
            addCriterion("ZUZHIJUANZENG not in", values, "zuzhijuanzeng");
            return (Criteria) this;
        }

        public Criteria andZuzhijuanzengBetween(String value1, String value2) {
            addCriterion("ZUZHIJUANZENG between", value1, value2, "zuzhijuanzeng");
            return (Criteria) this;
        }

        public Criteria andZuzhijuanzengNotBetween(String value1, String value2) {
            addCriterion("ZUZHIJUANZENG not between", value1, value2, "zuzhijuanzeng");
            return (Criteria) this;
        }

        public Criteria andKaizhanfuwuIsNull() {
            addCriterion("KAIZHANFUWU is null");
            return (Criteria) this;
        }

        public Criteria andKaizhanfuwuIsNotNull() {
            addCriterion("KAIZHANFUWU is not null");
            return (Criteria) this;
        }

        public Criteria andKaizhanfuwuEqualTo(String value) {
            addCriterion("KAIZHANFUWU =", value, "kaizhanfuwu");
            return (Criteria) this;
        }

        public Criteria andKaizhanfuwuNotEqualTo(String value) {
            addCriterion("KAIZHANFUWU <>", value, "kaizhanfuwu");
            return (Criteria) this;
        }

        public Criteria andKaizhanfuwuGreaterThan(String value) {
            addCriterion("KAIZHANFUWU >", value, "kaizhanfuwu");
            return (Criteria) this;
        }

        public Criteria andKaizhanfuwuGreaterThanOrEqualTo(String value) {
            addCriterion("KAIZHANFUWU >=", value, "kaizhanfuwu");
            return (Criteria) this;
        }

        public Criteria andKaizhanfuwuLessThan(String value) {
            addCriterion("KAIZHANFUWU <", value, "kaizhanfuwu");
            return (Criteria) this;
        }

        public Criteria andKaizhanfuwuLessThanOrEqualTo(String value) {
            addCriterion("KAIZHANFUWU <=", value, "kaizhanfuwu");
            return (Criteria) this;
        }

        public Criteria andKaizhanfuwuLike(String value) {
            addCriterion("KAIZHANFUWU like", value, "kaizhanfuwu");
            return (Criteria) this;
        }

        public Criteria andKaizhanfuwuNotLike(String value) {
            addCriterion("KAIZHANFUWU not like", value, "kaizhanfuwu");
            return (Criteria) this;
        }

        public Criteria andKaizhanfuwuIn(List<String> values) {
            addCriterion("KAIZHANFUWU in", values, "kaizhanfuwu");
            return (Criteria) this;
        }

        public Criteria andKaizhanfuwuNotIn(List<String> values) {
            addCriterion("KAIZHANFUWU not in", values, "kaizhanfuwu");
            return (Criteria) this;
        }

        public Criteria andKaizhanfuwuBetween(String value1, String value2) {
            addCriterion("KAIZHANFUWU between", value1, value2, "kaizhanfuwu");
            return (Criteria) this;
        }

        public Criteria andKaizhanfuwuNotBetween(String value1, String value2) {
            addCriterion("KAIZHANFUWU not between", value1, value2, "kaizhanfuwu");
            return (Criteria) this;
        }

        public Criteria andZuzhifuwuIsNull() {
            addCriterion("ZUZHIFUWU is null");
            return (Criteria) this;
        }

        public Criteria andZuzhifuwuIsNotNull() {
            addCriterion("ZUZHIFUWU is not null");
            return (Criteria) this;
        }

        public Criteria andZuzhifuwuEqualTo(String value) {
            addCriterion("ZUZHIFUWU =", value, "zuzhifuwu");
            return (Criteria) this;
        }

        public Criteria andZuzhifuwuNotEqualTo(String value) {
            addCriterion("ZUZHIFUWU <>", value, "zuzhifuwu");
            return (Criteria) this;
        }

        public Criteria andZuzhifuwuGreaterThan(String value) {
            addCriterion("ZUZHIFUWU >", value, "zuzhifuwu");
            return (Criteria) this;
        }

        public Criteria andZuzhifuwuGreaterThanOrEqualTo(String value) {
            addCriterion("ZUZHIFUWU >=", value, "zuzhifuwu");
            return (Criteria) this;
        }

        public Criteria andZuzhifuwuLessThan(String value) {
            addCriterion("ZUZHIFUWU <", value, "zuzhifuwu");
            return (Criteria) this;
        }

        public Criteria andZuzhifuwuLessThanOrEqualTo(String value) {
            addCriterion("ZUZHIFUWU <=", value, "zuzhifuwu");
            return (Criteria) this;
        }

        public Criteria andZuzhifuwuLike(String value) {
            addCriterion("ZUZHIFUWU like", value, "zuzhifuwu");
            return (Criteria) this;
        }

        public Criteria andZuzhifuwuNotLike(String value) {
            addCriterion("ZUZHIFUWU not like", value, "zuzhifuwu");
            return (Criteria) this;
        }

        public Criteria andZuzhifuwuIn(List<String> values) {
            addCriterion("ZUZHIFUWU in", values, "zuzhifuwu");
            return (Criteria) this;
        }

        public Criteria andZuzhifuwuNotIn(List<String> values) {
            addCriterion("ZUZHIFUWU not in", values, "zuzhifuwu");
            return (Criteria) this;
        }

        public Criteria andZuzhifuwuBetween(String value1, String value2) {
            addCriterion("ZUZHIFUWU between", value1, value2, "zuzhifuwu");
            return (Criteria) this;
        }

        public Criteria andZuzhifuwuNotBetween(String value1, String value2) {
            addCriterion("ZUZHIFUWU not between", value1, value2, "zuzhifuwu");
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

        public Criteria andFuwushoufeiIsNull() {
            addCriterion("FUWUSHOUFEI is null");
            return (Criteria) this;
        }

        public Criteria andFuwushoufeiIsNotNull() {
            addCriterion("FUWUSHOUFEI is not null");
            return (Criteria) this;
        }

        public Criteria andFuwushoufeiEqualTo(String value) {
            addCriterion("FUWUSHOUFEI =", value, "fuwushoufei");
            return (Criteria) this;
        }

        public Criteria andFuwushoufeiNotEqualTo(String value) {
            addCriterion("FUWUSHOUFEI <>", value, "fuwushoufei");
            return (Criteria) this;
        }

        public Criteria andFuwushoufeiGreaterThan(String value) {
            addCriterion("FUWUSHOUFEI >", value, "fuwushoufei");
            return (Criteria) this;
        }

        public Criteria andFuwushoufeiGreaterThanOrEqualTo(String value) {
            addCriterion("FUWUSHOUFEI >=", value, "fuwushoufei");
            return (Criteria) this;
        }

        public Criteria andFuwushoufeiLessThan(String value) {
            addCriterion("FUWUSHOUFEI <", value, "fuwushoufei");
            return (Criteria) this;
        }

        public Criteria andFuwushoufeiLessThanOrEqualTo(String value) {
            addCriterion("FUWUSHOUFEI <=", value, "fuwushoufei");
            return (Criteria) this;
        }

        public Criteria andFuwushoufeiLike(String value) {
            addCriterion("FUWUSHOUFEI like", value, "fuwushoufei");
            return (Criteria) this;
        }

        public Criteria andFuwushoufeiNotLike(String value) {
            addCriterion("FUWUSHOUFEI not like", value, "fuwushoufei");
            return (Criteria) this;
        }

        public Criteria andFuwushoufeiIn(List<String> values) {
            addCriterion("FUWUSHOUFEI in", values, "fuwushoufei");
            return (Criteria) this;
        }

        public Criteria andFuwushoufeiNotIn(List<String> values) {
            addCriterion("FUWUSHOUFEI not in", values, "fuwushoufei");
            return (Criteria) this;
        }

        public Criteria andFuwushoufeiBetween(String value1, String value2) {
            addCriterion("FUWUSHOUFEI between", value1, value2, "fuwushoufei");
            return (Criteria) this;
        }

        public Criteria andFuwushoufeiNotBetween(String value1, String value2) {
            addCriterion("FUWUSHOUFEI not between", value1, value2, "fuwushoufei");
            return (Criteria) this;
        }

        public Criteria andDabiaohuodongIsNull() {
            addCriterion("DABIAOHUODONG is null");
            return (Criteria) this;
        }

        public Criteria andDabiaohuodongIsNotNull() {
            addCriterion("DABIAOHUODONG is not null");
            return (Criteria) this;
        }

        public Criteria andDabiaohuodongEqualTo(String value) {
            addCriterion("DABIAOHUODONG =", value, "dabiaohuodong");
            return (Criteria) this;
        }

        public Criteria andDabiaohuodongNotEqualTo(String value) {
            addCriterion("DABIAOHUODONG <>", value, "dabiaohuodong");
            return (Criteria) this;
        }

        public Criteria andDabiaohuodongGreaterThan(String value) {
            addCriterion("DABIAOHUODONG >", value, "dabiaohuodong");
            return (Criteria) this;
        }

        public Criteria andDabiaohuodongGreaterThanOrEqualTo(String value) {
            addCriterion("DABIAOHUODONG >=", value, "dabiaohuodong");
            return (Criteria) this;
        }

        public Criteria andDabiaohuodongLessThan(String value) {
            addCriterion("DABIAOHUODONG <", value, "dabiaohuodong");
            return (Criteria) this;
        }

        public Criteria andDabiaohuodongLessThanOrEqualTo(String value) {
            addCriterion("DABIAOHUODONG <=", value, "dabiaohuodong");
            return (Criteria) this;
        }

        public Criteria andDabiaohuodongLike(String value) {
            addCriterion("DABIAOHUODONG like", value, "dabiaohuodong");
            return (Criteria) this;
        }

        public Criteria andDabiaohuodongNotLike(String value) {
            addCriterion("DABIAOHUODONG not like", value, "dabiaohuodong");
            return (Criteria) this;
        }

        public Criteria andDabiaohuodongIn(List<String> values) {
            addCriterion("DABIAOHUODONG in", values, "dabiaohuodong");
            return (Criteria) this;
        }

        public Criteria andDabiaohuodongNotIn(List<String> values) {
            addCriterion("DABIAOHUODONG not in", values, "dabiaohuodong");
            return (Criteria) this;
        }

        public Criteria andDabiaohuodongBetween(String value1, String value2) {
            addCriterion("DABIAOHUODONG between", value1, value2, "dabiaohuodong");
            return (Criteria) this;
        }

        public Criteria andDabiaohuodongNotBetween(String value1, String value2) {
            addCriterion("DABIAOHUODONG not between", value1, value2, "dabiaohuodong");
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

        public Criteria andZhiwujibieIsNull() {
            addCriterion("ZHIWUJIBIE is null");
            return (Criteria) this;
        }

        public Criteria andZhiwujibieIsNotNull() {
            addCriterion("ZHIWUJIBIE is not null");
            return (Criteria) this;
        }

        public Criteria andZhiwujibieEqualTo(String value) {
            addCriterion("ZHIWUJIBIE =", value, "zhiwujibie");
            return (Criteria) this;
        }

        public Criteria andZhiwujibieNotEqualTo(String value) {
            addCriterion("ZHIWUJIBIE <>", value, "zhiwujibie");
            return (Criteria) this;
        }

        public Criteria andZhiwujibieGreaterThan(String value) {
            addCriterion("ZHIWUJIBIE >", value, "zhiwujibie");
            return (Criteria) this;
        }

        public Criteria andZhiwujibieGreaterThanOrEqualTo(String value) {
            addCriterion("ZHIWUJIBIE >=", value, "zhiwujibie");
            return (Criteria) this;
        }

        public Criteria andZhiwujibieLessThan(String value) {
            addCriterion("ZHIWUJIBIE <", value, "zhiwujibie");
            return (Criteria) this;
        }

        public Criteria andZhiwujibieLessThanOrEqualTo(String value) {
            addCriterion("ZHIWUJIBIE <=", value, "zhiwujibie");
            return (Criteria) this;
        }

        public Criteria andZhiwujibieLike(String value) {
            addCriterion("ZHIWUJIBIE like", value, "zhiwujibie");
            return (Criteria) this;
        }

        public Criteria andZhiwujibieNotLike(String value) {
            addCriterion("ZHIWUJIBIE not like", value, "zhiwujibie");
            return (Criteria) this;
        }

        public Criteria andZhiwujibieIn(List<String> values) {
            addCriterion("ZHIWUJIBIE in", values, "zhiwujibie");
            return (Criteria) this;
        }

        public Criteria andZhiwujibieNotIn(List<String> values) {
            addCriterion("ZHIWUJIBIE not in", values, "zhiwujibie");
            return (Criteria) this;
        }

        public Criteria andZhiwujibieBetween(String value1, String value2) {
            addCriterion("ZHIWUJIBIE between", value1, value2, "zhiwujibie");
            return (Criteria) this;
        }

        public Criteria andZhiwujibieNotBetween(String value1, String value2) {
            addCriterion("ZHIWUJIBIE not between", value1, value2, "zhiwujibie");
            return (Criteria) this;
        }

        public Criteria andLuntanhuodongIsNull() {
            addCriterion("LUNTANHUODONG is null");
            return (Criteria) this;
        }

        public Criteria andLuntanhuodongIsNotNull() {
            addCriterion("LUNTANHUODONG is not null");
            return (Criteria) this;
        }

        public Criteria andLuntanhuodongEqualTo(Integer value) {
            addCriterion("LUNTANHUODONG =", value, "luntanhuodong");
            return (Criteria) this;
        }

        public Criteria andLuntanhuodongNotEqualTo(Integer value) {
            addCriterion("LUNTANHUODONG <>", value, "luntanhuodong");
            return (Criteria) this;
        }

        public Criteria andLuntanhuodongGreaterThan(Integer value) {
            addCriterion("LUNTANHUODONG >", value, "luntanhuodong");
            return (Criteria) this;
        }

        public Criteria andLuntanhuodongGreaterThanOrEqualTo(Integer value) {
            addCriterion("LUNTANHUODONG >=", value, "luntanhuodong");
            return (Criteria) this;
        }

        public Criteria andLuntanhuodongLessThan(Integer value) {
            addCriterion("LUNTANHUODONG <", value, "luntanhuodong");
            return (Criteria) this;
        }

        public Criteria andLuntanhuodongLessThanOrEqualTo(Integer value) {
            addCriterion("LUNTANHUODONG <=", value, "luntanhuodong");
            return (Criteria) this;
        }

        public Criteria andLuntanhuodongIn(List<Integer> values) {
            addCriterion("LUNTANHUODONG in", values, "luntanhuodong");
            return (Criteria) this;
        }

        public Criteria andLuntanhuodongNotIn(List<Integer> values) {
            addCriterion("LUNTANHUODONG not in", values, "luntanhuodong");
            return (Criteria) this;
        }

        public Criteria andLuntanhuodongBetween(Integer value1, Integer value2) {
            addCriterion("LUNTANHUODONG between", value1, value2, "luntanhuodong");
            return (Criteria) this;
        }

        public Criteria andLuntanhuodongNotBetween(Integer value1, Integer value2) {
            addCriterion("LUNTANHUODONG not between", value1, value2, "luntanhuodong");
            return (Criteria) this;
        }

        public Criteria andGongyihuodongIsNull() {
            addCriterion("GONGYIHUODONG is null");
            return (Criteria) this;
        }

        public Criteria andGongyihuodongIsNotNull() {
            addCriterion("GONGYIHUODONG is not null");
            return (Criteria) this;
        }

        public Criteria andGongyihuodongEqualTo(Integer value) {
            addCriterion("GONGYIHUODONG =", value, "gongyihuodong");
            return (Criteria) this;
        }

        public Criteria andGongyihuodongNotEqualTo(Integer value) {
            addCriterion("GONGYIHUODONG <>", value, "gongyihuodong");
            return (Criteria) this;
        }

        public Criteria andGongyihuodongGreaterThan(Integer value) {
            addCriterion("GONGYIHUODONG >", value, "gongyihuodong");
            return (Criteria) this;
        }

        public Criteria andGongyihuodongGreaterThanOrEqualTo(Integer value) {
            addCriterion("GONGYIHUODONG >=", value, "gongyihuodong");
            return (Criteria) this;
        }

        public Criteria andGongyihuodongLessThan(Integer value) {
            addCriterion("GONGYIHUODONG <", value, "gongyihuodong");
            return (Criteria) this;
        }

        public Criteria andGongyihuodongLessThanOrEqualTo(Integer value) {
            addCriterion("GONGYIHUODONG <=", value, "gongyihuodong");
            return (Criteria) this;
        }

        public Criteria andGongyihuodongIn(List<Integer> values) {
            addCriterion("GONGYIHUODONG in", values, "gongyihuodong");
            return (Criteria) this;
        }

        public Criteria andGongyihuodongNotIn(List<Integer> values) {
            addCriterion("GONGYIHUODONG not in", values, "gongyihuodong");
            return (Criteria) this;
        }

        public Criteria andGongyihuodongBetween(Integer value1, Integer value2) {
            addCriterion("GONGYIHUODONG between", value1, value2, "gongyihuodong");
            return (Criteria) this;
        }

        public Criteria andGongyihuodongNotBetween(Integer value1, Integer value2) {
            addCriterion("GONGYIHUODONG not between", value1, value2, "gongyihuodong");
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

        public Criteria andHuiyihuodongIsNull() {
            addCriterion("HUIYIHUODONG is null");
            return (Criteria) this;
        }

        public Criteria andHuiyihuodongIsNotNull() {
            addCriterion("HUIYIHUODONG is not null");
            return (Criteria) this;
        }

        public Criteria andHuiyihuodongEqualTo(Integer value) {
            addCriterion("HUIYIHUODONG =", value, "huiyihuodong");
            return (Criteria) this;
        }

        public Criteria andHuiyihuodongNotEqualTo(Integer value) {
            addCriterion("HUIYIHUODONG <>", value, "huiyihuodong");
            return (Criteria) this;
        }

        public Criteria andHuiyihuodongGreaterThan(Integer value) {
            addCriterion("HUIYIHUODONG >", value, "huiyihuodong");
            return (Criteria) this;
        }

        public Criteria andHuiyihuodongGreaterThanOrEqualTo(Integer value) {
            addCriterion("HUIYIHUODONG >=", value, "huiyihuodong");
            return (Criteria) this;
        }

        public Criteria andHuiyihuodongLessThan(Integer value) {
            addCriterion("HUIYIHUODONG <", value, "huiyihuodong");
            return (Criteria) this;
        }

        public Criteria andHuiyihuodongLessThanOrEqualTo(Integer value) {
            addCriterion("HUIYIHUODONG <=", value, "huiyihuodong");
            return (Criteria) this;
        }

        public Criteria andHuiyihuodongIn(List<Integer> values) {
            addCriterion("HUIYIHUODONG in", values, "huiyihuodong");
            return (Criteria) this;
        }

        public Criteria andHuiyihuodongNotIn(List<Integer> values) {
            addCriterion("HUIYIHUODONG not in", values, "huiyihuodong");
            return (Criteria) this;
        }

        public Criteria andHuiyihuodongBetween(Integer value1, Integer value2) {
            addCriterion("HUIYIHUODONG between", value1, value2, "huiyihuodong");
            return (Criteria) this;
        }

        public Criteria andHuiyihuodongNotBetween(Integer value1, Integer value2) {
            addCriterion("HUIYIHUODONG not between", value1, value2, "huiyihuodong");
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

        public Criteria andQishiyishangIsNull() {
            addCriterion("QISHIYISHANG is null");
            return (Criteria) this;
        }

        public Criteria andQishiyishangIsNotNull() {
            addCriterion("QISHIYISHANG is not null");
            return (Criteria) this;
        }

        public Criteria andQishiyishangEqualTo(Integer value) {
            addCriterion("QISHIYISHANG =", value, "qishiyishang");
            return (Criteria) this;
        }

        public Criteria andQishiyishangNotEqualTo(Integer value) {
            addCriterion("QISHIYISHANG <>", value, "qishiyishang");
            return (Criteria) this;
        }

        public Criteria andQishiyishangGreaterThan(Integer value) {
            addCriterion("QISHIYISHANG >", value, "qishiyishang");
            return (Criteria) this;
        }

        public Criteria andQishiyishangGreaterThanOrEqualTo(Integer value) {
            addCriterion("QISHIYISHANG >=", value, "qishiyishang");
            return (Criteria) this;
        }

        public Criteria andQishiyishangLessThan(Integer value) {
            addCriterion("QISHIYISHANG <", value, "qishiyishang");
            return (Criteria) this;
        }

        public Criteria andQishiyishangLessThanOrEqualTo(Integer value) {
            addCriterion("QISHIYISHANG <=", value, "qishiyishang");
            return (Criteria) this;
        }

        public Criteria andQishiyishangIn(List<Integer> values) {
            addCriterion("QISHIYISHANG in", values, "qishiyishang");
            return (Criteria) this;
        }

        public Criteria andQishiyishangNotIn(List<Integer> values) {
            addCriterion("QISHIYISHANG not in", values, "qishiyishang");
            return (Criteria) this;
        }

        public Criteria andQishiyishangBetween(Integer value1, Integer value2) {
            addCriterion("QISHIYISHANG between", value1, value2, "qishiyishang");
            return (Criteria) this;
        }

        public Criteria andQishiyishangNotBetween(Integer value1, Integer value2) {
            addCriterion("QISHIYISHANG not between", value1, value2, "qishiyishang");
            return (Criteria) this;
        }

        public Criteria andXianchuyixiaIsNull() {
            addCriterion("XIANCHUYIXIA is null");
            return (Criteria) this;
        }

        public Criteria andXianchuyixiaIsNotNull() {
            addCriterion("XIANCHUYIXIA is not null");
            return (Criteria) this;
        }

        public Criteria andXianchuyixiaEqualTo(Integer value) {
            addCriterion("XIANCHUYIXIA =", value, "xianchuyixia");
            return (Criteria) this;
        }

        public Criteria andXianchuyixiaNotEqualTo(Integer value) {
            addCriterion("XIANCHUYIXIA <>", value, "xianchuyixia");
            return (Criteria) this;
        }

        public Criteria andXianchuyixiaGreaterThan(Integer value) {
            addCriterion("XIANCHUYIXIA >", value, "xianchuyixia");
            return (Criteria) this;
        }

        public Criteria andXianchuyixiaGreaterThanOrEqualTo(Integer value) {
            addCriterion("XIANCHUYIXIA >=", value, "xianchuyixia");
            return (Criteria) this;
        }

        public Criteria andXianchuyixiaLessThan(Integer value) {
            addCriterion("XIANCHUYIXIA <", value, "xianchuyixia");
            return (Criteria) this;
        }

        public Criteria andXianchuyixiaLessThanOrEqualTo(Integer value) {
            addCriterion("XIANCHUYIXIA <=", value, "xianchuyixia");
            return (Criteria) this;
        }

        public Criteria andXianchuyixiaIn(List<Integer> values) {
            addCriterion("XIANCHUYIXIA in", values, "xianchuyixia");
            return (Criteria) this;
        }

        public Criteria andXianchuyixiaNotIn(List<Integer> values) {
            addCriterion("XIANCHUYIXIA not in", values, "xianchuyixia");
            return (Criteria) this;
        }

        public Criteria andXianchuyixiaBetween(Integer value1, Integer value2) {
            addCriterion("XIANCHUYIXIA between", value1, value2, "xianchuyixia");
            return (Criteria) this;
        }

        public Criteria andXianchuyixiaNotBetween(Integer value1, Integer value2) {
            addCriterion("XIANCHUYIXIA not between", value1, value2, "xianchuyixia");
            return (Criteria) this;
        }

        public Criteria andLishengzerenIsNull() {
            addCriterion("LISHENGZEREN is null");
            return (Criteria) this;
        }

        public Criteria andLishengzerenIsNotNull() {
            addCriterion("LISHENGZEREN is not null");
            return (Criteria) this;
        }

        public Criteria andLishengzerenEqualTo(Integer value) {
            addCriterion("LISHENGZEREN =", value, "lishengzeren");
            return (Criteria) this;
        }

        public Criteria andLishengzerenNotEqualTo(Integer value) {
            addCriterion("LISHENGZEREN <>", value, "lishengzeren");
            return (Criteria) this;
        }

        public Criteria andLishengzerenGreaterThan(Integer value) {
            addCriterion("LISHENGZEREN >", value, "lishengzeren");
            return (Criteria) this;
        }

        public Criteria andLishengzerenGreaterThanOrEqualTo(Integer value) {
            addCriterion("LISHENGZEREN >=", value, "lishengzeren");
            return (Criteria) this;
        }

        public Criteria andLishengzerenLessThan(Integer value) {
            addCriterion("LISHENGZEREN <", value, "lishengzeren");
            return (Criteria) this;
        }

        public Criteria andLishengzerenLessThanOrEqualTo(Integer value) {
            addCriterion("LISHENGZEREN <=", value, "lishengzeren");
            return (Criteria) this;
        }

        public Criteria andLishengzerenIn(List<Integer> values) {
            addCriterion("LISHENGZEREN in", values, "lishengzeren");
            return (Criteria) this;
        }

        public Criteria andLishengzerenNotIn(List<Integer> values) {
            addCriterion("LISHENGZEREN not in", values, "lishengzeren");
            return (Criteria) this;
        }

        public Criteria andLishengzerenBetween(Integer value1, Integer value2) {
            addCriterion("LISHENGZEREN between", value1, value2, "lishengzeren");
            return (Criteria) this;
        }

        public Criteria andLishengzerenNotBetween(Integer value1, Integer value2) {
            addCriterion("LISHENGZEREN not between", value1, value2, "lishengzeren");
            return (Criteria) this;
        }

        public Criteria andLiditingzerenIsNull() {
            addCriterion("LIDITINGZEREN is null");
            return (Criteria) this;
        }

        public Criteria andLiditingzerenIsNotNull() {
            addCriterion("LIDITINGZEREN is not null");
            return (Criteria) this;
        }

        public Criteria andLiditingzerenEqualTo(Integer value) {
            addCriterion("LIDITINGZEREN =", value, "liditingzeren");
            return (Criteria) this;
        }

        public Criteria andLiditingzerenNotEqualTo(Integer value) {
            addCriterion("LIDITINGZEREN <>", value, "liditingzeren");
            return (Criteria) this;
        }

        public Criteria andLiditingzerenGreaterThan(Integer value) {
            addCriterion("LIDITINGZEREN >", value, "liditingzeren");
            return (Criteria) this;
        }

        public Criteria andLiditingzerenGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIDITINGZEREN >=", value, "liditingzeren");
            return (Criteria) this;
        }

        public Criteria andLiditingzerenLessThan(Integer value) {
            addCriterion("LIDITINGZEREN <", value, "liditingzeren");
            return (Criteria) this;
        }

        public Criteria andLiditingzerenLessThanOrEqualTo(Integer value) {
            addCriterion("LIDITINGZEREN <=", value, "liditingzeren");
            return (Criteria) this;
        }

        public Criteria andLiditingzerenIn(List<Integer> values) {
            addCriterion("LIDITINGZEREN in", values, "liditingzeren");
            return (Criteria) this;
        }

        public Criteria andLiditingzerenNotIn(List<Integer> values) {
            addCriterion("LIDITINGZEREN not in", values, "liditingzeren");
            return (Criteria) this;
        }

        public Criteria andLiditingzerenBetween(Integer value1, Integer value2) {
            addCriterion("LIDITINGZEREN between", value1, value2, "liditingzeren");
            return (Criteria) this;
        }

        public Criteria andLiditingzerenNotBetween(Integer value1, Integer value2) {
            addCriterion("LIDITINGZEREN not between", value1, value2, "liditingzeren");
            return (Criteria) this;
        }

        public Criteria andLixianchuzerenIsNull() {
            addCriterion("LIXIANCHUZEREN is null");
            return (Criteria) this;
        }

        public Criteria andLixianchuzerenIsNotNull() {
            addCriterion("LIXIANCHUZEREN is not null");
            return (Criteria) this;
        }

        public Criteria andLixianchuzerenEqualTo(Integer value) {
            addCriterion("LIXIANCHUZEREN =", value, "lixianchuzeren");
            return (Criteria) this;
        }

        public Criteria andLixianchuzerenNotEqualTo(Integer value) {
            addCriterion("LIXIANCHUZEREN <>", value, "lixianchuzeren");
            return (Criteria) this;
        }

        public Criteria andLixianchuzerenGreaterThan(Integer value) {
            addCriterion("LIXIANCHUZEREN >", value, "lixianchuzeren");
            return (Criteria) this;
        }

        public Criteria andLixianchuzerenGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIXIANCHUZEREN >=", value, "lixianchuzeren");
            return (Criteria) this;
        }

        public Criteria andLixianchuzerenLessThan(Integer value) {
            addCriterion("LIXIANCHUZEREN <", value, "lixianchuzeren");
            return (Criteria) this;
        }

        public Criteria andLixianchuzerenLessThanOrEqualTo(Integer value) {
            addCriterion("LIXIANCHUZEREN <=", value, "lixianchuzeren");
            return (Criteria) this;
        }

        public Criteria andLixianchuzerenIn(List<Integer> values) {
            addCriterion("LIXIANCHUZEREN in", values, "lixianchuzeren");
            return (Criteria) this;
        }

        public Criteria andLixianchuzerenNotIn(List<Integer> values) {
            addCriterion("LIXIANCHUZEREN not in", values, "lixianchuzeren");
            return (Criteria) this;
        }

        public Criteria andLixianchuzerenBetween(Integer value1, Integer value2) {
            addCriterion("LIXIANCHUZEREN between", value1, value2, "lixianchuzeren");
            return (Criteria) this;
        }

        public Criteria andLixianchuzerenNotBetween(Integer value1, Integer value2) {
            addCriterion("LIXIANCHUZEREN not between", value1, value2, "lixianchuzeren");
            return (Criteria) this;
        }

        public Criteria andLishenglishiIsNull() {
            addCriterion("LISHENGLISHI is null");
            return (Criteria) this;
        }

        public Criteria andLishenglishiIsNotNull() {
            addCriterion("LISHENGLISHI is not null");
            return (Criteria) this;
        }

        public Criteria andLishenglishiEqualTo(Integer value) {
            addCriterion("LISHENGLISHI =", value, "lishenglishi");
            return (Criteria) this;
        }

        public Criteria andLishenglishiNotEqualTo(Integer value) {
            addCriterion("LISHENGLISHI <>", value, "lishenglishi");
            return (Criteria) this;
        }

        public Criteria andLishenglishiGreaterThan(Integer value) {
            addCriterion("LISHENGLISHI >", value, "lishenglishi");
            return (Criteria) this;
        }

        public Criteria andLishenglishiGreaterThanOrEqualTo(Integer value) {
            addCriterion("LISHENGLISHI >=", value, "lishenglishi");
            return (Criteria) this;
        }

        public Criteria andLishenglishiLessThan(Integer value) {
            addCriterion("LISHENGLISHI <", value, "lishenglishi");
            return (Criteria) this;
        }

        public Criteria andLishenglishiLessThanOrEqualTo(Integer value) {
            addCriterion("LISHENGLISHI <=", value, "lishenglishi");
            return (Criteria) this;
        }

        public Criteria andLishenglishiIn(List<Integer> values) {
            addCriterion("LISHENGLISHI in", values, "lishenglishi");
            return (Criteria) this;
        }

        public Criteria andLishenglishiNotIn(List<Integer> values) {
            addCriterion("LISHENGLISHI not in", values, "lishenglishi");
            return (Criteria) this;
        }

        public Criteria andLishenglishiBetween(Integer value1, Integer value2) {
            addCriterion("LISHENGLISHI between", value1, value2, "lishenglishi");
            return (Criteria) this;
        }

        public Criteria andLishenglishiNotBetween(Integer value1, Integer value2) {
            addCriterion("LISHENGLISHI not between", value1, value2, "lishenglishi");
            return (Criteria) this;
        }

        public Criteria andLiditinglishiIsNull() {
            addCriterion("LIDITINGLISHI is null");
            return (Criteria) this;
        }

        public Criteria andLiditinglishiIsNotNull() {
            addCriterion("LIDITINGLISHI is not null");
            return (Criteria) this;
        }

        public Criteria andLiditinglishiEqualTo(Integer value) {
            addCriterion("LIDITINGLISHI =", value, "liditinglishi");
            return (Criteria) this;
        }

        public Criteria andLiditinglishiNotEqualTo(Integer value) {
            addCriterion("LIDITINGLISHI <>", value, "liditinglishi");
            return (Criteria) this;
        }

        public Criteria andLiditinglishiGreaterThan(Integer value) {
            addCriterion("LIDITINGLISHI >", value, "liditinglishi");
            return (Criteria) this;
        }

        public Criteria andLiditinglishiGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIDITINGLISHI >=", value, "liditinglishi");
            return (Criteria) this;
        }

        public Criteria andLiditinglishiLessThan(Integer value) {
            addCriterion("LIDITINGLISHI <", value, "liditinglishi");
            return (Criteria) this;
        }

        public Criteria andLiditinglishiLessThanOrEqualTo(Integer value) {
            addCriterion("LIDITINGLISHI <=", value, "liditinglishi");
            return (Criteria) this;
        }

        public Criteria andLiditinglishiIn(List<Integer> values) {
            addCriterion("LIDITINGLISHI in", values, "liditinglishi");
            return (Criteria) this;
        }

        public Criteria andLiditinglishiNotIn(List<Integer> values) {
            addCriterion("LIDITINGLISHI not in", values, "liditinglishi");
            return (Criteria) this;
        }

        public Criteria andLiditinglishiBetween(Integer value1, Integer value2) {
            addCriterion("LIDITINGLISHI between", value1, value2, "liditinglishi");
            return (Criteria) this;
        }

        public Criteria andLiditinglishiNotBetween(Integer value1, Integer value2) {
            addCriterion("LIDITINGLISHI not between", value1, value2, "liditinglishi");
            return (Criteria) this;
        }

        public Criteria andLixianchulishiIsNull() {
            addCriterion("LIXIANCHULISHI is null");
            return (Criteria) this;
        }

        public Criteria andLixianchulishiIsNotNull() {
            addCriterion("LIXIANCHULISHI is not null");
            return (Criteria) this;
        }

        public Criteria andLixianchulishiEqualTo(Integer value) {
            addCriterion("LIXIANCHULISHI =", value, "lixianchulishi");
            return (Criteria) this;
        }

        public Criteria andLixianchulishiNotEqualTo(Integer value) {
            addCriterion("LIXIANCHULISHI <>", value, "lixianchulishi");
            return (Criteria) this;
        }

        public Criteria andLixianchulishiGreaterThan(Integer value) {
            addCriterion("LIXIANCHULISHI >", value, "lixianchulishi");
            return (Criteria) this;
        }

        public Criteria andLixianchulishiGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIXIANCHULISHI >=", value, "lixianchulishi");
            return (Criteria) this;
        }

        public Criteria andLixianchulishiLessThan(Integer value) {
            addCriterion("LIXIANCHULISHI <", value, "lixianchulishi");
            return (Criteria) this;
        }

        public Criteria andLixianchulishiLessThanOrEqualTo(Integer value) {
            addCriterion("LIXIANCHULISHI <=", value, "lixianchulishi");
            return (Criteria) this;
        }

        public Criteria andLixianchulishiIn(List<Integer> values) {
            addCriterion("LIXIANCHULISHI in", values, "lixianchulishi");
            return (Criteria) this;
        }

        public Criteria andLixianchulishiNotIn(List<Integer> values) {
            addCriterion("LIXIANCHULISHI not in", values, "lixianchulishi");
            return (Criteria) this;
        }

        public Criteria andLixianchulishiBetween(Integer value1, Integer value2) {
            addCriterion("LIXIANCHULISHI between", value1, value2, "lixianchulishi");
            return (Criteria) this;
        }

        public Criteria andLixianchulishiNotBetween(Integer value1, Integer value2) {
            addCriterion("LIXIANCHULISHI not between", value1, value2, "lixianchulishi");
            return (Criteria) this;
        }

        public Criteria andLibeianIsNull() {
            addCriterion("LIBEIAN is null");
            return (Criteria) this;
        }

        public Criteria andLibeianIsNotNull() {
            addCriterion("LIBEIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLibeianEqualTo(String value) {
            addCriterion("LIBEIAN =", value, "libeian");
            return (Criteria) this;
        }

        public Criteria andLibeianNotEqualTo(String value) {
            addCriterion("LIBEIAN <>", value, "libeian");
            return (Criteria) this;
        }

        public Criteria andLibeianGreaterThan(String value) {
            addCriterion("LIBEIAN >", value, "libeian");
            return (Criteria) this;
        }

        public Criteria andLibeianGreaterThanOrEqualTo(String value) {
            addCriterion("LIBEIAN >=", value, "libeian");
            return (Criteria) this;
        }

        public Criteria andLibeianLessThan(String value) {
            addCriterion("LIBEIAN <", value, "libeian");
            return (Criteria) this;
        }

        public Criteria andLibeianLessThanOrEqualTo(String value) {
            addCriterion("LIBEIAN <=", value, "libeian");
            return (Criteria) this;
        }

        public Criteria andLibeianLike(String value) {
            addCriterion("LIBEIAN like", value, "libeian");
            return (Criteria) this;
        }

        public Criteria andLibeianNotLike(String value) {
            addCriterion("LIBEIAN not like", value, "libeian");
            return (Criteria) this;
        }

        public Criteria andLibeianIn(List<String> values) {
            addCriterion("LIBEIAN in", values, "libeian");
            return (Criteria) this;
        }

        public Criteria andLibeianNotIn(List<String> values) {
            addCriterion("LIBEIAN not in", values, "libeian");
            return (Criteria) this;
        }

        public Criteria andLibeianBetween(String value1, String value2) {
            addCriterion("LIBEIAN between", value1, value2, "libeian");
            return (Criteria) this;
        }

        public Criteria andLibeianNotBetween(String value1, String value2) {
            addCriterion("LIBEIAN not between", value1, value2, "libeian");
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

        public Criteria andHangyebumenIsNull() {
            addCriterion("HANGYEBUMEN is null");
            return (Criteria) this;
        }

        public Criteria andHangyebumenIsNotNull() {
            addCriterion("HANGYEBUMEN is not null");
            return (Criteria) this;
        }

        public Criteria andHangyebumenEqualTo(String value) {
            addCriterion("HANGYEBUMEN =", value, "hangyebumen");
            return (Criteria) this;
        }

        public Criteria andHangyebumenNotEqualTo(String value) {
            addCriterion("HANGYEBUMEN <>", value, "hangyebumen");
            return (Criteria) this;
        }

        public Criteria andHangyebumenGreaterThan(String value) {
            addCriterion("HANGYEBUMEN >", value, "hangyebumen");
            return (Criteria) this;
        }

        public Criteria andHangyebumenGreaterThanOrEqualTo(String value) {
            addCriterion("HANGYEBUMEN >=", value, "hangyebumen");
            return (Criteria) this;
        }

        public Criteria andHangyebumenLessThan(String value) {
            addCriterion("HANGYEBUMEN <", value, "hangyebumen");
            return (Criteria) this;
        }

        public Criteria andHangyebumenLessThanOrEqualTo(String value) {
            addCriterion("HANGYEBUMEN <=", value, "hangyebumen");
            return (Criteria) this;
        }

        public Criteria andHangyebumenLike(String value) {
            addCriterion("HANGYEBUMEN like", value, "hangyebumen");
            return (Criteria) this;
        }

        public Criteria andHangyebumenNotLike(String value) {
            addCriterion("HANGYEBUMEN not like", value, "hangyebumen");
            return (Criteria) this;
        }

        public Criteria andHangyebumenIn(List<String> values) {
            addCriterion("HANGYEBUMEN in", values, "hangyebumen");
            return (Criteria) this;
        }

        public Criteria andHangyebumenNotIn(List<String> values) {
            addCriterion("HANGYEBUMEN not in", values, "hangyebumen");
            return (Criteria) this;
        }

        public Criteria andHangyebumenBetween(String value1, String value2) {
            addCriterion("HANGYEBUMEN between", value1, value2, "hangyebumen");
            return (Criteria) this;
        }

        public Criteria andHangyebumenNotBetween(String value1, String value2) {
            addCriterion("HANGYEBUMEN not between", value1, value2, "hangyebumen");
            return (Criteria) this;
        }

        public Criteria andDangjianbumenIsNull() {
            addCriterion("DANGJIANBUMEN is null");
            return (Criteria) this;
        }

        public Criteria andDangjianbumenIsNotNull() {
            addCriterion("DANGJIANBUMEN is not null");
            return (Criteria) this;
        }

        public Criteria andDangjianbumenEqualTo(String value) {
            addCriterion("DANGJIANBUMEN =", value, "dangjianbumen");
            return (Criteria) this;
        }

        public Criteria andDangjianbumenNotEqualTo(String value) {
            addCriterion("DANGJIANBUMEN <>", value, "dangjianbumen");
            return (Criteria) this;
        }

        public Criteria andDangjianbumenGreaterThan(String value) {
            addCriterion("DANGJIANBUMEN >", value, "dangjianbumen");
            return (Criteria) this;
        }

        public Criteria andDangjianbumenGreaterThanOrEqualTo(String value) {
            addCriterion("DANGJIANBUMEN >=", value, "dangjianbumen");
            return (Criteria) this;
        }

        public Criteria andDangjianbumenLessThan(String value) {
            addCriterion("DANGJIANBUMEN <", value, "dangjianbumen");
            return (Criteria) this;
        }

        public Criteria andDangjianbumenLessThanOrEqualTo(String value) {
            addCriterion("DANGJIANBUMEN <=", value, "dangjianbumen");
            return (Criteria) this;
        }

        public Criteria andDangjianbumenLike(String value) {
            addCriterion("DANGJIANBUMEN like", value, "dangjianbumen");
            return (Criteria) this;
        }

        public Criteria andDangjianbumenNotLike(String value) {
            addCriterion("DANGJIANBUMEN not like", value, "dangjianbumen");
            return (Criteria) this;
        }

        public Criteria andDangjianbumenIn(List<String> values) {
            addCriterion("DANGJIANBUMEN in", values, "dangjianbumen");
            return (Criteria) this;
        }

        public Criteria andDangjianbumenNotIn(List<String> values) {
            addCriterion("DANGJIANBUMEN not in", values, "dangjianbumen");
            return (Criteria) this;
        }

        public Criteria andDangjianbumenBetween(String value1, String value2) {
            addCriterion("DANGJIANBUMEN between", value1, value2, "dangjianbumen");
            return (Criteria) this;
        }

        public Criteria andDangjianbumenNotBetween(String value1, String value2) {
            addCriterion("DANGJIANBUMEN not between", value1, value2, "dangjianbumen");
            return (Criteria) this;
        }

        public Criteria andFarendianhuaIsNull() {
            addCriterion("FARENDIANHUA is null");
            return (Criteria) this;
        }

        public Criteria andFarendianhuaIsNotNull() {
            addCriterion("FARENDIANHUA is not null");
            return (Criteria) this;
        }

        public Criteria andFarendianhuaEqualTo(String value) {
            addCriterion("FARENDIANHUA =", value, "farendianhua");
            return (Criteria) this;
        }

        public Criteria andFarendianhuaNotEqualTo(String value) {
            addCriterion("FARENDIANHUA <>", value, "farendianhua");
            return (Criteria) this;
        }

        public Criteria andFarendianhuaGreaterThan(String value) {
            addCriterion("FARENDIANHUA >", value, "farendianhua");
            return (Criteria) this;
        }

        public Criteria andFarendianhuaGreaterThanOrEqualTo(String value) {
            addCriterion("FARENDIANHUA >=", value, "farendianhua");
            return (Criteria) this;
        }

        public Criteria andFarendianhuaLessThan(String value) {
            addCriterion("FARENDIANHUA <", value, "farendianhua");
            return (Criteria) this;
        }

        public Criteria andFarendianhuaLessThanOrEqualTo(String value) {
            addCriterion("FARENDIANHUA <=", value, "farendianhua");
            return (Criteria) this;
        }

        public Criteria andFarendianhuaLike(String value) {
            addCriterion("FARENDIANHUA like", value, "farendianhua");
            return (Criteria) this;
        }

        public Criteria andFarendianhuaNotLike(String value) {
            addCriterion("FARENDIANHUA not like", value, "farendianhua");
            return (Criteria) this;
        }

        public Criteria andFarendianhuaIn(List<String> values) {
            addCriterion("FARENDIANHUA in", values, "farendianhua");
            return (Criteria) this;
        }

        public Criteria andFarendianhuaNotIn(List<String> values) {
            addCriterion("FARENDIANHUA not in", values, "farendianhua");
            return (Criteria) this;
        }

        public Criteria andFarendianhuaBetween(String value1, String value2) {
            addCriterion("FARENDIANHUA between", value1, value2, "farendianhua");
            return (Criteria) this;
        }

        public Criteria andFarendianhuaNotBetween(String value1, String value2) {
            addCriterion("FARENDIANHUA not between", value1, value2, "farendianhua");
            return (Criteria) this;
        }

        public Criteria andRenzhiriqi1IsNull() {
            addCriterion("RENZHIRIQI1 is null");
            return (Criteria) this;
        }

        public Criteria andRenzhiriqi1IsNotNull() {
            addCriterion("RENZHIRIQI1 is not null");
            return (Criteria) this;
        }

        public Criteria andRenzhiriqi1EqualTo(Date value) {
            addCriterion("RENZHIRIQI1 =", value, "renzhiriqi1");
            return (Criteria) this;
        }

        public Criteria andRenzhiriqi1NotEqualTo(Date value) {
            addCriterion("RENZHIRIQI1 <>", value, "renzhiriqi1");
            return (Criteria) this;
        }

        public Criteria andRenzhiriqi1GreaterThan(Date value) {
            addCriterion("RENZHIRIQI1 >", value, "renzhiriqi1");
            return (Criteria) this;
        }

        public Criteria andRenzhiriqi1GreaterThanOrEqualTo(Date value) {
            addCriterion("RENZHIRIQI1 >=", value, "renzhiriqi1");
            return (Criteria) this;
        }

        public Criteria andRenzhiriqi1LessThan(Date value) {
            addCriterion("RENZHIRIQI1 <", value, "renzhiriqi1");
            return (Criteria) this;
        }

        public Criteria andRenzhiriqi1LessThanOrEqualTo(Date value) {
            addCriterion("RENZHIRIQI1 <=", value, "renzhiriqi1");
            return (Criteria) this;
        }

        public Criteria andRenzhiriqi1In(List<Date> values) {
            addCriterion("RENZHIRIQI1 in", values, "renzhiriqi1");
            return (Criteria) this;
        }

        public Criteria andRenzhiriqi1NotIn(List<Date> values) {
            addCriterion("RENZHIRIQI1 not in", values, "renzhiriqi1");
            return (Criteria) this;
        }

        public Criteria andRenzhiriqi1Between(Date value1, Date value2) {
            addCriterion("RENZHIRIQI1 between", value1, value2, "renzhiriqi1");
            return (Criteria) this;
        }

        public Criteria andRenzhiriqi1NotBetween(Date value1, Date value2) {
            addCriterion("RENZHIRIQI1 not between", value1, value2, "renzhiriqi1");
            return (Criteria) this;
        }

        public Criteria andRenzhiriqi2IsNull() {
            addCriterion("RENZHIRIQI2 is null");
            return (Criteria) this;
        }

        public Criteria andRenzhiriqi2IsNotNull() {
            addCriterion("RENZHIRIQI2 is not null");
            return (Criteria) this;
        }

        public Criteria andRenzhiriqi2EqualTo(Date value) {
            addCriterion("RENZHIRIQI2 =", value, "renzhiriqi2");
            return (Criteria) this;
        }

        public Criteria andRenzhiriqi2NotEqualTo(Date value) {
            addCriterion("RENZHIRIQI2 <>", value, "renzhiriqi2");
            return (Criteria) this;
        }

        public Criteria andRenzhiriqi2GreaterThan(Date value) {
            addCriterion("RENZHIRIQI2 >", value, "renzhiriqi2");
            return (Criteria) this;
        }

        public Criteria andRenzhiriqi2GreaterThanOrEqualTo(Date value) {
            addCriterion("RENZHIRIQI2 >=", value, "renzhiriqi2");
            return (Criteria) this;
        }

        public Criteria andRenzhiriqi2LessThan(Date value) {
            addCriterion("RENZHIRIQI2 <", value, "renzhiriqi2");
            return (Criteria) this;
        }

        public Criteria andRenzhiriqi2LessThanOrEqualTo(Date value) {
            addCriterion("RENZHIRIQI2 <=", value, "renzhiriqi2");
            return (Criteria) this;
        }

        public Criteria andRenzhiriqi2In(List<Date> values) {
            addCriterion("RENZHIRIQI2 in", values, "renzhiriqi2");
            return (Criteria) this;
        }

        public Criteria andRenzhiriqi2NotIn(List<Date> values) {
            addCriterion("RENZHIRIQI2 not in", values, "renzhiriqi2");
            return (Criteria) this;
        }

        public Criteria andRenzhiriqi2Between(Date value1, Date value2) {
            addCriterion("RENZHIRIQI2 between", value1, value2, "renzhiriqi2");
            return (Criteria) this;
        }

        public Criteria andRenzhiriqi2NotBetween(Date value1, Date value2) {
            addCriterion("RENZHIRIQI2 not between", value1, value2, "renzhiriqi2");
            return (Criteria) this;
        }

        public Criteria andFayanrenxingmingIsNull() {
            addCriterion("FAYANRENXINGMING is null");
            return (Criteria) this;
        }

        public Criteria andFayanrenxingmingIsNotNull() {
            addCriterion("FAYANRENXINGMING is not null");
            return (Criteria) this;
        }

        public Criteria andFayanrenxingmingEqualTo(String value) {
            addCriterion("FAYANRENXINGMING =", value, "fayanrenxingming");
            return (Criteria) this;
        }

        public Criteria andFayanrenxingmingNotEqualTo(String value) {
            addCriterion("FAYANRENXINGMING <>", value, "fayanrenxingming");
            return (Criteria) this;
        }

        public Criteria andFayanrenxingmingGreaterThan(String value) {
            addCriterion("FAYANRENXINGMING >", value, "fayanrenxingming");
            return (Criteria) this;
        }

        public Criteria andFayanrenxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("FAYANRENXINGMING >=", value, "fayanrenxingming");
            return (Criteria) this;
        }

        public Criteria andFayanrenxingmingLessThan(String value) {
            addCriterion("FAYANRENXINGMING <", value, "fayanrenxingming");
            return (Criteria) this;
        }

        public Criteria andFayanrenxingmingLessThanOrEqualTo(String value) {
            addCriterion("FAYANRENXINGMING <=", value, "fayanrenxingming");
            return (Criteria) this;
        }

        public Criteria andFayanrenxingmingLike(String value) {
            addCriterion("FAYANRENXINGMING like", value, "fayanrenxingming");
            return (Criteria) this;
        }

        public Criteria andFayanrenxingmingNotLike(String value) {
            addCriterion("FAYANRENXINGMING not like", value, "fayanrenxingming");
            return (Criteria) this;
        }

        public Criteria andFayanrenxingmingIn(List<String> values) {
            addCriterion("FAYANRENXINGMING in", values, "fayanrenxingming");
            return (Criteria) this;
        }

        public Criteria andFayanrenxingmingNotIn(List<String> values) {
            addCriterion("FAYANRENXINGMING not in", values, "fayanrenxingming");
            return (Criteria) this;
        }

        public Criteria andFayanrenxingmingBetween(String value1, String value2) {
            addCriterion("FAYANRENXINGMING between", value1, value2, "fayanrenxingming");
            return (Criteria) this;
        }

        public Criteria andFayanrenxingmingNotBetween(String value1, String value2) {
            addCriterion("FAYANRENXINGMING not between", value1, value2, "fayanrenxingming");
            return (Criteria) this;
        }

        public Criteria andFayanrendianhuaIsNull() {
            addCriterion("FAYANRENDIANHUA is null");
            return (Criteria) this;
        }

        public Criteria andFayanrendianhuaIsNotNull() {
            addCriterion("FAYANRENDIANHUA is not null");
            return (Criteria) this;
        }

        public Criteria andFayanrendianhuaEqualTo(String value) {
            addCriterion("FAYANRENDIANHUA =", value, "fayanrendianhua");
            return (Criteria) this;
        }

        public Criteria andFayanrendianhuaNotEqualTo(String value) {
            addCriterion("FAYANRENDIANHUA <>", value, "fayanrendianhua");
            return (Criteria) this;
        }

        public Criteria andFayanrendianhuaGreaterThan(String value) {
            addCriterion("FAYANRENDIANHUA >", value, "fayanrendianhua");
            return (Criteria) this;
        }

        public Criteria andFayanrendianhuaGreaterThanOrEqualTo(String value) {
            addCriterion("FAYANRENDIANHUA >=", value, "fayanrendianhua");
            return (Criteria) this;
        }

        public Criteria andFayanrendianhuaLessThan(String value) {
            addCriterion("FAYANRENDIANHUA <", value, "fayanrendianhua");
            return (Criteria) this;
        }

        public Criteria andFayanrendianhuaLessThanOrEqualTo(String value) {
            addCriterion("FAYANRENDIANHUA <=", value, "fayanrendianhua");
            return (Criteria) this;
        }

        public Criteria andFayanrendianhuaLike(String value) {
            addCriterion("FAYANRENDIANHUA like", value, "fayanrendianhua");
            return (Criteria) this;
        }

        public Criteria andFayanrendianhuaNotLike(String value) {
            addCriterion("FAYANRENDIANHUA not like", value, "fayanrendianhua");
            return (Criteria) this;
        }

        public Criteria andFayanrendianhuaIn(List<String> values) {
            addCriterion("FAYANRENDIANHUA in", values, "fayanrendianhua");
            return (Criteria) this;
        }

        public Criteria andFayanrendianhuaNotIn(List<String> values) {
            addCriterion("FAYANRENDIANHUA not in", values, "fayanrendianhua");
            return (Criteria) this;
        }

        public Criteria andFayanrendianhuaBetween(String value1, String value2) {
            addCriterion("FAYANRENDIANHUA between", value1, value2, "fayanrendianhua");
            return (Criteria) this;
        }

        public Criteria andFayanrendianhuaNotBetween(String value1, String value2) {
            addCriterion("FAYANRENDIANHUA not between", value1, value2, "fayanrendianhua");
            return (Criteria) this;
        }

        public Criteria andFayanrenshoujiIsNull() {
            addCriterion("FAYANRENSHOUJI is null");
            return (Criteria) this;
        }

        public Criteria andFayanrenshoujiIsNotNull() {
            addCriterion("FAYANRENSHOUJI is not null");
            return (Criteria) this;
        }

        public Criteria andFayanrenshoujiEqualTo(String value) {
            addCriterion("FAYANRENSHOUJI =", value, "fayanrenshouji");
            return (Criteria) this;
        }

        public Criteria andFayanrenshoujiNotEqualTo(String value) {
            addCriterion("FAYANRENSHOUJI <>", value, "fayanrenshouji");
            return (Criteria) this;
        }

        public Criteria andFayanrenshoujiGreaterThan(String value) {
            addCriterion("FAYANRENSHOUJI >", value, "fayanrenshouji");
            return (Criteria) this;
        }

        public Criteria andFayanrenshoujiGreaterThanOrEqualTo(String value) {
            addCriterion("FAYANRENSHOUJI >=", value, "fayanrenshouji");
            return (Criteria) this;
        }

        public Criteria andFayanrenshoujiLessThan(String value) {
            addCriterion("FAYANRENSHOUJI <", value, "fayanrenshouji");
            return (Criteria) this;
        }

        public Criteria andFayanrenshoujiLessThanOrEqualTo(String value) {
            addCriterion("FAYANRENSHOUJI <=", value, "fayanrenshouji");
            return (Criteria) this;
        }

        public Criteria andFayanrenshoujiLike(String value) {
            addCriterion("FAYANRENSHOUJI like", value, "fayanrenshouji");
            return (Criteria) this;
        }

        public Criteria andFayanrenshoujiNotLike(String value) {
            addCriterion("FAYANRENSHOUJI not like", value, "fayanrenshouji");
            return (Criteria) this;
        }

        public Criteria andFayanrenshoujiIn(List<String> values) {
            addCriterion("FAYANRENSHOUJI in", values, "fayanrenshouji");
            return (Criteria) this;
        }

        public Criteria andFayanrenshoujiNotIn(List<String> values) {
            addCriterion("FAYANRENSHOUJI not in", values, "fayanrenshouji");
            return (Criteria) this;
        }

        public Criteria andFayanrenshoujiBetween(String value1, String value2) {
            addCriterion("FAYANRENSHOUJI between", value1, value2, "fayanrenshouji");
            return (Criteria) this;
        }

        public Criteria andFayanrenshoujiNotBetween(String value1, String value2) {
            addCriterion("FAYANRENSHOUJI not between", value1, value2, "fayanrenshouji");
            return (Criteria) this;
        }

        public Criteria andFayanrenyouxiangIsNull() {
            addCriterion("FAYANRENYOUXIANG is null");
            return (Criteria) this;
        }

        public Criteria andFayanrenyouxiangIsNotNull() {
            addCriterion("FAYANRENYOUXIANG is not null");
            return (Criteria) this;
        }

        public Criteria andFayanrenyouxiangEqualTo(String value) {
            addCriterion("FAYANRENYOUXIANG =", value, "fayanrenyouxiang");
            return (Criteria) this;
        }

        public Criteria andFayanrenyouxiangNotEqualTo(String value) {
            addCriterion("FAYANRENYOUXIANG <>", value, "fayanrenyouxiang");
            return (Criteria) this;
        }

        public Criteria andFayanrenyouxiangGreaterThan(String value) {
            addCriterion("FAYANRENYOUXIANG >", value, "fayanrenyouxiang");
            return (Criteria) this;
        }

        public Criteria andFayanrenyouxiangGreaterThanOrEqualTo(String value) {
            addCriterion("FAYANRENYOUXIANG >=", value, "fayanrenyouxiang");
            return (Criteria) this;
        }

        public Criteria andFayanrenyouxiangLessThan(String value) {
            addCriterion("FAYANRENYOUXIANG <", value, "fayanrenyouxiang");
            return (Criteria) this;
        }

        public Criteria andFayanrenyouxiangLessThanOrEqualTo(String value) {
            addCriterion("FAYANRENYOUXIANG <=", value, "fayanrenyouxiang");
            return (Criteria) this;
        }

        public Criteria andFayanrenyouxiangLike(String value) {
            addCriterion("FAYANRENYOUXIANG like", value, "fayanrenyouxiang");
            return (Criteria) this;
        }

        public Criteria andFayanrenyouxiangNotLike(String value) {
            addCriterion("FAYANRENYOUXIANG not like", value, "fayanrenyouxiang");
            return (Criteria) this;
        }

        public Criteria andFayanrenyouxiangIn(List<String> values) {
            addCriterion("FAYANRENYOUXIANG in", values, "fayanrenyouxiang");
            return (Criteria) this;
        }

        public Criteria andFayanrenyouxiangNotIn(List<String> values) {
            addCriterion("FAYANRENYOUXIANG not in", values, "fayanrenyouxiang");
            return (Criteria) this;
        }

        public Criteria andFayanrenyouxiangBetween(String value1, String value2) {
            addCriterion("FAYANRENYOUXIANG between", value1, value2, "fayanrenyouxiang");
            return (Criteria) this;
        }

        public Criteria andFayanrenyouxiangNotBetween(String value1, String value2) {
            addCriterion("FAYANRENYOUXIANG not between", value1, value2, "fayanrenyouxiang");
            return (Criteria) this;
        }

        public Criteria andQuntuanxinxiIsNull() {
            addCriterion("QUNTUANXINXI is null");
            return (Criteria) this;
        }

        public Criteria andQuntuanxinxiIsNotNull() {
            addCriterion("QUNTUANXINXI is not null");
            return (Criteria) this;
        }

        public Criteria andQuntuanxinxiEqualTo(String value) {
            addCriterion("QUNTUANXINXI =", value, "quntuanxinxi");
            return (Criteria) this;
        }

        public Criteria andQuntuanxinxiNotEqualTo(String value) {
            addCriterion("QUNTUANXINXI <>", value, "quntuanxinxi");
            return (Criteria) this;
        }

        public Criteria andQuntuanxinxiGreaterThan(String value) {
            addCriterion("QUNTUANXINXI >", value, "quntuanxinxi");
            return (Criteria) this;
        }

        public Criteria andQuntuanxinxiGreaterThanOrEqualTo(String value) {
            addCriterion("QUNTUANXINXI >=", value, "quntuanxinxi");
            return (Criteria) this;
        }

        public Criteria andQuntuanxinxiLessThan(String value) {
            addCriterion("QUNTUANXINXI <", value, "quntuanxinxi");
            return (Criteria) this;
        }

        public Criteria andQuntuanxinxiLessThanOrEqualTo(String value) {
            addCriterion("QUNTUANXINXI <=", value, "quntuanxinxi");
            return (Criteria) this;
        }

        public Criteria andQuntuanxinxiLike(String value) {
            addCriterion("QUNTUANXINXI like", value, "quntuanxinxi");
            return (Criteria) this;
        }

        public Criteria andQuntuanxinxiNotLike(String value) {
            addCriterion("QUNTUANXINXI not like", value, "quntuanxinxi");
            return (Criteria) this;
        }

        public Criteria andQuntuanxinxiIn(List<String> values) {
            addCriterion("QUNTUANXINXI in", values, "quntuanxinxi");
            return (Criteria) this;
        }

        public Criteria andQuntuanxinxiNotIn(List<String> values) {
            addCriterion("QUNTUANXINXI not in", values, "quntuanxinxi");
            return (Criteria) this;
        }

        public Criteria andQuntuanxinxiBetween(String value1, String value2) {
            addCriterion("QUNTUANXINXI between", value1, value2, "quntuanxinxi");
            return (Criteria) this;
        }

        public Criteria andQuntuanxinxiNotBetween(String value1, String value2) {
            addCriterion("QUNTUANXINXI not between", value1, value2, "quntuanxinxi");
            return (Criteria) this;
        }

        public Criteria andWeituoshouquanIsNull() {
            addCriterion("WEITUOSHOUQUAN is null");
            return (Criteria) this;
        }

        public Criteria andWeituoshouquanIsNotNull() {
            addCriterion("WEITUOSHOUQUAN is not null");
            return (Criteria) this;
        }

        public Criteria andWeituoshouquanEqualTo(Integer value) {
            addCriterion("WEITUOSHOUQUAN =", value, "weituoshouquan");
            return (Criteria) this;
        }

        public Criteria andWeituoshouquanNotEqualTo(Integer value) {
            addCriterion("WEITUOSHOUQUAN <>", value, "weituoshouquan");
            return (Criteria) this;
        }

        public Criteria andWeituoshouquanGreaterThan(Integer value) {
            addCriterion("WEITUOSHOUQUAN >", value, "weituoshouquan");
            return (Criteria) this;
        }

        public Criteria andWeituoshouquanGreaterThanOrEqualTo(Integer value) {
            addCriterion("WEITUOSHOUQUAN >=", value, "weituoshouquan");
            return (Criteria) this;
        }

        public Criteria andWeituoshouquanLessThan(Integer value) {
            addCriterion("WEITUOSHOUQUAN <", value, "weituoshouquan");
            return (Criteria) this;
        }

        public Criteria andWeituoshouquanLessThanOrEqualTo(Integer value) {
            addCriterion("WEITUOSHOUQUAN <=", value, "weituoshouquan");
            return (Criteria) this;
        }

        public Criteria andWeituoshouquanIn(List<Integer> values) {
            addCriterion("WEITUOSHOUQUAN in", values, "weituoshouquan");
            return (Criteria) this;
        }

        public Criteria andWeituoshouquanNotIn(List<Integer> values) {
            addCriterion("WEITUOSHOUQUAN not in", values, "weituoshouquan");
            return (Criteria) this;
        }

        public Criteria andWeituoshouquanBetween(Integer value1, Integer value2) {
            addCriterion("WEITUOSHOUQUAN between", value1, value2, "weituoshouquan");
            return (Criteria) this;
        }

        public Criteria andWeituoshouquanNotBetween(Integer value1, Integer value2) {
            addCriterion("WEITUOSHOUQUAN not between", value1, value2, "weituoshouquan");
            return (Criteria) this;
        }

        public Criteria andZizhipingshenIsNull() {
            addCriterion("ZIZHIPINGSHEN is null");
            return (Criteria) this;
        }

        public Criteria andZizhipingshenIsNotNull() {
            addCriterion("ZIZHIPINGSHEN is not null");
            return (Criteria) this;
        }

        public Criteria andZizhipingshenEqualTo(Integer value) {
            addCriterion("ZIZHIPINGSHEN =", value, "zizhipingshen");
            return (Criteria) this;
        }

        public Criteria andZizhipingshenNotEqualTo(Integer value) {
            addCriterion("ZIZHIPINGSHEN <>", value, "zizhipingshen");
            return (Criteria) this;
        }

        public Criteria andZizhipingshenGreaterThan(Integer value) {
            addCriterion("ZIZHIPINGSHEN >", value, "zizhipingshen");
            return (Criteria) this;
        }

        public Criteria andZizhipingshenGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZIZHIPINGSHEN >=", value, "zizhipingshen");
            return (Criteria) this;
        }

        public Criteria andZizhipingshenLessThan(Integer value) {
            addCriterion("ZIZHIPINGSHEN <", value, "zizhipingshen");
            return (Criteria) this;
        }

        public Criteria andZizhipingshenLessThanOrEqualTo(Integer value) {
            addCriterion("ZIZHIPINGSHEN <=", value, "zizhipingshen");
            return (Criteria) this;
        }

        public Criteria andZizhipingshenIn(List<Integer> values) {
            addCriterion("ZIZHIPINGSHEN in", values, "zizhipingshen");
            return (Criteria) this;
        }

        public Criteria andZizhipingshenNotIn(List<Integer> values) {
            addCriterion("ZIZHIPINGSHEN not in", values, "zizhipingshen");
            return (Criteria) this;
        }

        public Criteria andZizhipingshenBetween(Integer value1, Integer value2) {
            addCriterion("ZIZHIPINGSHEN between", value1, value2, "zizhipingshen");
            return (Criteria) this;
        }

        public Criteria andZizhipingshenNotBetween(Integer value1, Integer value2) {
            addCriterion("ZIZHIPINGSHEN not between", value1, value2, "zizhipingshen");
            return (Criteria) this;
        }

        public Criteria andMishudanweizhiwuIsNull() {
            addCriterion("MISHUDANWEIZHIWU is null");
            return (Criteria) this;
        }

        public Criteria andMishudanweizhiwuIsNotNull() {
            addCriterion("MISHUDANWEIZHIWU is not null");
            return (Criteria) this;
        }

        public Criteria andMishudanweizhiwuEqualTo(String value) {
            addCriterion("MISHUDANWEIZHIWU =", value, "mishudanweizhiwu");
            return (Criteria) this;
        }

        public Criteria andMishudanweizhiwuNotEqualTo(String value) {
            addCriterion("MISHUDANWEIZHIWU <>", value, "mishudanweizhiwu");
            return (Criteria) this;
        }

        public Criteria andMishudanweizhiwuGreaterThan(String value) {
            addCriterion("MISHUDANWEIZHIWU >", value, "mishudanweizhiwu");
            return (Criteria) this;
        }

        public Criteria andMishudanweizhiwuGreaterThanOrEqualTo(String value) {
            addCriterion("MISHUDANWEIZHIWU >=", value, "mishudanweizhiwu");
            return (Criteria) this;
        }

        public Criteria andMishudanweizhiwuLessThan(String value) {
            addCriterion("MISHUDANWEIZHIWU <", value, "mishudanweizhiwu");
            return (Criteria) this;
        }

        public Criteria andMishudanweizhiwuLessThanOrEqualTo(String value) {
            addCriterion("MISHUDANWEIZHIWU <=", value, "mishudanweizhiwu");
            return (Criteria) this;
        }

        public Criteria andMishudanweizhiwuLike(String value) {
            addCriterion("MISHUDANWEIZHIWU like", value, "mishudanweizhiwu");
            return (Criteria) this;
        }

        public Criteria andMishudanweizhiwuNotLike(String value) {
            addCriterion("MISHUDANWEIZHIWU not like", value, "mishudanweizhiwu");
            return (Criteria) this;
        }

        public Criteria andMishudanweizhiwuIn(List<String> values) {
            addCriterion("MISHUDANWEIZHIWU in", values, "mishudanweizhiwu");
            return (Criteria) this;
        }

        public Criteria andMishudanweizhiwuNotIn(List<String> values) {
            addCriterion("MISHUDANWEIZHIWU not in", values, "mishudanweizhiwu");
            return (Criteria) this;
        }

        public Criteria andMishudanweizhiwuBetween(String value1, String value2) {
            addCriterion("MISHUDANWEIZHIWU between", value1, value2, "mishudanweizhiwu");
            return (Criteria) this;
        }

        public Criteria andMishudanweizhiwuNotBetween(String value1, String value2) {
            addCriterion("MISHUDANWEIZHIWU not between", value1, value2, "mishudanweizhiwu");
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