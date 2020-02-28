package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JjhNjReport1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JjhNjReport1Example() {
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

        public Criteria andJijinhuimingchengIsNull() {
            addCriterion("JIJINHUIMINGCHENG is null");
            return (Criteria) this;
        }

        public Criteria andJijinhuimingchengIsNotNull() {
            addCriterion("JIJINHUIMINGCHENG is not null");
            return (Criteria) this;
        }

        public Criteria andJijinhuimingchengEqualTo(String value) {
            addCriterion("JIJINHUIMINGCHENG =", value, "jijinhuimingcheng");
            return (Criteria) this;
        }

        public Criteria andJijinhuimingchengNotEqualTo(String value) {
            addCriterion("JIJINHUIMINGCHENG <>", value, "jijinhuimingcheng");
            return (Criteria) this;
        }

        public Criteria andJijinhuimingchengGreaterThan(String value) {
            addCriterion("JIJINHUIMINGCHENG >", value, "jijinhuimingcheng");
            return (Criteria) this;
        }

        public Criteria andJijinhuimingchengGreaterThanOrEqualTo(String value) {
            addCriterion("JIJINHUIMINGCHENG >=", value, "jijinhuimingcheng");
            return (Criteria) this;
        }

        public Criteria andJijinhuimingchengLessThan(String value) {
            addCriterion("JIJINHUIMINGCHENG <", value, "jijinhuimingcheng");
            return (Criteria) this;
        }

        public Criteria andJijinhuimingchengLessThanOrEqualTo(String value) {
            addCriterion("JIJINHUIMINGCHENG <=", value, "jijinhuimingcheng");
            return (Criteria) this;
        }

        public Criteria andJijinhuimingchengLike(String value) {
            addCriterion("JIJINHUIMINGCHENG like", value, "jijinhuimingcheng");
            return (Criteria) this;
        }

        public Criteria andJijinhuimingchengNotLike(String value) {
            addCriterion("JIJINHUIMINGCHENG not like", value, "jijinhuimingcheng");
            return (Criteria) this;
        }

        public Criteria andJijinhuimingchengIn(List<String> values) {
            addCriterion("JIJINHUIMINGCHENG in", values, "jijinhuimingcheng");
            return (Criteria) this;
        }

        public Criteria andJijinhuimingchengNotIn(List<String> values) {
            addCriterion("JIJINHUIMINGCHENG not in", values, "jijinhuimingcheng");
            return (Criteria) this;
        }

        public Criteria andJijinhuimingchengBetween(String value1, String value2) {
            addCriterion("JIJINHUIMINGCHENG between", value1, value2, "jijinhuimingcheng");
            return (Criteria) this;
        }

        public Criteria andJijinhuimingchengNotBetween(String value1, String value2) {
            addCriterion("JIJINHUIMINGCHENG not between", value1, value2, "jijinhuimingcheng");
            return (Criteria) this;
        }

        public Criteria andNianduIsNull() {
            addCriterion("NIANDU is null");
            return (Criteria) this;
        }

        public Criteria andNianduIsNotNull() {
            addCriterion("NIANDU is not null");
            return (Criteria) this;
        }

        public Criteria andNianduEqualTo(String value) {
            addCriterion("NIANDU =", value, "niandu");
            return (Criteria) this;
        }

        public Criteria andNianduNotEqualTo(String value) {
            addCriterion("NIANDU <>", value, "niandu");
            return (Criteria) this;
        }

        public Criteria andNianduGreaterThan(String value) {
            addCriterion("NIANDU >", value, "niandu");
            return (Criteria) this;
        }

        public Criteria andNianduGreaterThanOrEqualTo(String value) {
            addCriterion("NIANDU >=", value, "niandu");
            return (Criteria) this;
        }

        public Criteria andNianduLessThan(String value) {
            addCriterion("NIANDU <", value, "niandu");
            return (Criteria) this;
        }

        public Criteria andNianduLessThanOrEqualTo(String value) {
            addCriterion("NIANDU <=", value, "niandu");
            return (Criteria) this;
        }

        public Criteria andNianduLike(String value) {
            addCriterion("NIANDU like", value, "niandu");
            return (Criteria) this;
        }

        public Criteria andNianduNotLike(String value) {
            addCriterion("NIANDU not like", value, "niandu");
            return (Criteria) this;
        }

        public Criteria andNianduIn(List<String> values) {
            addCriterion("NIANDU in", values, "niandu");
            return (Criteria) this;
        }

        public Criteria andNianduNotIn(List<String> values) {
            addCriterion("NIANDU not in", values, "niandu");
            return (Criteria) this;
        }

        public Criteria andNianduBetween(String value1, String value2) {
            addCriterion("NIANDU between", value1, value2, "niandu");
            return (Criteria) this;
        }

        public Criteria andNianduNotBetween(String value1, String value2) {
            addCriterion("NIANDU not between", value1, value2, "niandu");
            return (Criteria) this;
        }

        public Criteria andNianfenIsNull() {
            addCriterion("NIANFEN is null");
            return (Criteria) this;
        }

        public Criteria andNianfenIsNotNull() {
            addCriterion("NIANFEN is not null");
            return (Criteria) this;
        }

        public Criteria andNianfenEqualTo(String value) {
            addCriterion("NIANFEN =", value, "nianfen");
            return (Criteria) this;
        }

        public Criteria andNianfenNotEqualTo(String value) {
            addCriterion("NIANFEN <>", value, "nianfen");
            return (Criteria) this;
        }

        public Criteria andNianfenGreaterThan(String value) {
            addCriterion("NIANFEN >", value, "nianfen");
            return (Criteria) this;
        }

        public Criteria andNianfenGreaterThanOrEqualTo(String value) {
            addCriterion("NIANFEN >=", value, "nianfen");
            return (Criteria) this;
        }

        public Criteria andNianfenLessThan(String value) {
            addCriterion("NIANFEN <", value, "nianfen");
            return (Criteria) this;
        }

        public Criteria andNianfenLessThanOrEqualTo(String value) {
            addCriterion("NIANFEN <=", value, "nianfen");
            return (Criteria) this;
        }

        public Criteria andNianfenLike(String value) {
            addCriterion("NIANFEN like", value, "nianfen");
            return (Criteria) this;
        }

        public Criteria andNianfenNotLike(String value) {
            addCriterion("NIANFEN not like", value, "nianfen");
            return (Criteria) this;
        }

        public Criteria andNianfenIn(List<String> values) {
            addCriterion("NIANFEN in", values, "nianfen");
            return (Criteria) this;
        }

        public Criteria andNianfenNotIn(List<String> values) {
            addCriterion("NIANFEN not in", values, "nianfen");
            return (Criteria) this;
        }

        public Criteria andNianfenBetween(String value1, String value2) {
            addCriterion("NIANFEN between", value1, value2, "nianfen");
            return (Criteria) this;
        }

        public Criteria andNianfenNotBetween(String value1, String value2) {
            addCriterion("NIANFEN not between", value1, value2, "nianfen");
            return (Criteria) this;
        }

        public Criteria andShouqianIsNull() {
            addCriterion("SHOUQIAN is null");
            return (Criteria) this;
        }

        public Criteria andShouqianIsNotNull() {
            addCriterion("SHOUQIAN is not null");
            return (Criteria) this;
        }

        public Criteria andShouqianEqualTo(String value) {
            addCriterion("SHOUQIAN =", value, "shouqian");
            return (Criteria) this;
        }

        public Criteria andShouqianNotEqualTo(String value) {
            addCriterion("SHOUQIAN <>", value, "shouqian");
            return (Criteria) this;
        }

        public Criteria andShouqianGreaterThan(String value) {
            addCriterion("SHOUQIAN >", value, "shouqian");
            return (Criteria) this;
        }

        public Criteria andShouqianGreaterThanOrEqualTo(String value) {
            addCriterion("SHOUQIAN >=", value, "shouqian");
            return (Criteria) this;
        }

        public Criteria andShouqianLessThan(String value) {
            addCriterion("SHOUQIAN <", value, "shouqian");
            return (Criteria) this;
        }

        public Criteria andShouqianLessThanOrEqualTo(String value) {
            addCriterion("SHOUQIAN <=", value, "shouqian");
            return (Criteria) this;
        }

        public Criteria andShouqianLike(String value) {
            addCriterion("SHOUQIAN like", value, "shouqian");
            return (Criteria) this;
        }

        public Criteria andShouqianNotLike(String value) {
            addCriterion("SHOUQIAN not like", value, "shouqian");
            return (Criteria) this;
        }

        public Criteria andShouqianIn(List<String> values) {
            addCriterion("SHOUQIAN in", values, "shouqian");
            return (Criteria) this;
        }

        public Criteria andShouqianNotIn(List<String> values) {
            addCriterion("SHOUQIAN not in", values, "shouqian");
            return (Criteria) this;
        }

        public Criteria andShouqianBetween(String value1, String value2) {
            addCriterion("SHOUQIAN between", value1, value2, "shouqian");
            return (Criteria) this;
        }

        public Criteria andShouqianNotBetween(String value1, String value2) {
            addCriterion("SHOUQIAN not between", value1, value2, "shouqian");
            return (Criteria) this;
        }

        public Criteria andBenjijinhuiIsNull() {
            addCriterion("BENJIJINHUI is null");
            return (Criteria) this;
        }

        public Criteria andBenjijinhuiIsNotNull() {
            addCriterion("BENJIJINHUI is not null");
            return (Criteria) this;
        }

        public Criteria andBenjijinhuiEqualTo(String value) {
            addCriterion("BENJIJINHUI =", value, "benjijinhui");
            return (Criteria) this;
        }

        public Criteria andBenjijinhuiNotEqualTo(String value) {
            addCriterion("BENJIJINHUI <>", value, "benjijinhui");
            return (Criteria) this;
        }

        public Criteria andBenjijinhuiGreaterThan(String value) {
            addCriterion("BENJIJINHUI >", value, "benjijinhui");
            return (Criteria) this;
        }

        public Criteria andBenjijinhuiGreaterThanOrEqualTo(String value) {
            addCriterion("BENJIJINHUI >=", value, "benjijinhui");
            return (Criteria) this;
        }

        public Criteria andBenjijinhuiLessThan(String value) {
            addCriterion("BENJIJINHUI <", value, "benjijinhui");
            return (Criteria) this;
        }

        public Criteria andBenjijinhuiLessThanOrEqualTo(String value) {
            addCriterion("BENJIJINHUI <=", value, "benjijinhui");
            return (Criteria) this;
        }

        public Criteria andBenjijinhuiLike(String value) {
            addCriterion("BENJIJINHUI like", value, "benjijinhui");
            return (Criteria) this;
        }

        public Criteria andBenjijinhuiNotLike(String value) {
            addCriterion("BENJIJINHUI not like", value, "benjijinhui");
            return (Criteria) this;
        }

        public Criteria andBenjijinhuiIn(List<String> values) {
            addCriterion("BENJIJINHUI in", values, "benjijinhui");
            return (Criteria) this;
        }

        public Criteria andBenjijinhuiNotIn(List<String> values) {
            addCriterion("BENJIJINHUI not in", values, "benjijinhui");
            return (Criteria) this;
        }

        public Criteria andBenjijinhuiBetween(String value1, String value2) {
            addCriterion("BENJIJINHUI between", value1, value2, "benjijinhui");
            return (Criteria) this;
        }

        public Criteria andBenjijinhuiNotBetween(String value1, String value2) {
            addCriterion("BENJIJINHUI not between", value1, value2, "benjijinhui");
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

        public Criteria andYuanshijijinshueIsNull() {
            addCriterion("YUANSHIJIJINSHUE is null");
            return (Criteria) this;
        }

        public Criteria andYuanshijijinshueIsNotNull() {
            addCriterion("YUANSHIJIJINSHUE is not null");
            return (Criteria) this;
        }

        public Criteria andYuanshijijinshueEqualTo(BigDecimal value) {
            addCriterion("YUANSHIJIJINSHUE =", value, "yuanshijijinshue");
            return (Criteria) this;
        }

        public Criteria andYuanshijijinshueNotEqualTo(BigDecimal value) {
            addCriterion("YUANSHIJIJINSHUE <>", value, "yuanshijijinshue");
            return (Criteria) this;
        }

        public Criteria andYuanshijijinshueGreaterThan(BigDecimal value) {
            addCriterion("YUANSHIJIJINSHUE >", value, "yuanshijijinshue");
            return (Criteria) this;
        }

        public Criteria andYuanshijijinshueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YUANSHIJIJINSHUE >=", value, "yuanshijijinshue");
            return (Criteria) this;
        }

        public Criteria andYuanshijijinshueLessThan(BigDecimal value) {
            addCriterion("YUANSHIJIJINSHUE <", value, "yuanshijijinshue");
            return (Criteria) this;
        }

        public Criteria andYuanshijijinshueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YUANSHIJIJINSHUE <=", value, "yuanshijijinshue");
            return (Criteria) this;
        }

        public Criteria andYuanshijijinshueIn(List<BigDecimal> values) {
            addCriterion("YUANSHIJIJINSHUE in", values, "yuanshijijinshue");
            return (Criteria) this;
        }

        public Criteria andYuanshijijinshueNotIn(List<BigDecimal> values) {
            addCriterion("YUANSHIJIJINSHUE not in", values, "yuanshijijinshue");
            return (Criteria) this;
        }

        public Criteria andYuanshijijinshueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YUANSHIJIJINSHUE between", value1, value2, "yuanshijijinshue");
            return (Criteria) this;
        }

        public Criteria andYuanshijijinshueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YUANSHIJIJINSHUE not between", value1, value2, "yuanshijijinshue");
            return (Criteria) this;
        }

        public Criteria andJijinhuizhusuoIsNull() {
            addCriterion("JIJINHUIZHUSUO is null");
            return (Criteria) this;
        }

        public Criteria andJijinhuizhusuoIsNotNull() {
            addCriterion("JIJINHUIZHUSUO is not null");
            return (Criteria) this;
        }

        public Criteria andJijinhuizhusuoEqualTo(String value) {
            addCriterion("JIJINHUIZHUSUO =", value, "jijinhuizhusuo");
            return (Criteria) this;
        }

        public Criteria andJijinhuizhusuoNotEqualTo(String value) {
            addCriterion("JIJINHUIZHUSUO <>", value, "jijinhuizhusuo");
            return (Criteria) this;
        }

        public Criteria andJijinhuizhusuoGreaterThan(String value) {
            addCriterion("JIJINHUIZHUSUO >", value, "jijinhuizhusuo");
            return (Criteria) this;
        }

        public Criteria andJijinhuizhusuoGreaterThanOrEqualTo(String value) {
            addCriterion("JIJINHUIZHUSUO >=", value, "jijinhuizhusuo");
            return (Criteria) this;
        }

        public Criteria andJijinhuizhusuoLessThan(String value) {
            addCriterion("JIJINHUIZHUSUO <", value, "jijinhuizhusuo");
            return (Criteria) this;
        }

        public Criteria andJijinhuizhusuoLessThanOrEqualTo(String value) {
            addCriterion("JIJINHUIZHUSUO <=", value, "jijinhuizhusuo");
            return (Criteria) this;
        }

        public Criteria andJijinhuizhusuoLike(String value) {
            addCriterion("JIJINHUIZHUSUO like", value, "jijinhuizhusuo");
            return (Criteria) this;
        }

        public Criteria andJijinhuizhusuoNotLike(String value) {
            addCriterion("JIJINHUIZHUSUO not like", value, "jijinhuizhusuo");
            return (Criteria) this;
        }

        public Criteria andJijinhuizhusuoIn(List<String> values) {
            addCriterion("JIJINHUIZHUSUO in", values, "jijinhuizhusuo");
            return (Criteria) this;
        }

        public Criteria andJijinhuizhusuoNotIn(List<String> values) {
            addCriterion("JIJINHUIZHUSUO not in", values, "jijinhuizhusuo");
            return (Criteria) this;
        }

        public Criteria andJijinhuizhusuoBetween(String value1, String value2) {
            addCriterion("JIJINHUIZHUSUO between", value1, value2, "jijinhuizhusuo");
            return (Criteria) this;
        }

        public Criteria andJijinhuizhusuoNotBetween(String value1, String value2) {
            addCriterion("JIJINHUIZHUSUO not between", value1, value2, "jijinhuizhusuo");
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

        public Criteria andLianxidianhuayiIsNull() {
            addCriterion("LIANXIDIANHUAYI is null");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuayiIsNotNull() {
            addCriterion("LIANXIDIANHUAYI is not null");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuayiEqualTo(String value) {
            addCriterion("LIANXIDIANHUAYI =", value, "lianxidianhuayi");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuayiNotEqualTo(String value) {
            addCriterion("LIANXIDIANHUAYI <>", value, "lianxidianhuayi");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuayiGreaterThan(String value) {
            addCriterion("LIANXIDIANHUAYI >", value, "lianxidianhuayi");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuayiGreaterThanOrEqualTo(String value) {
            addCriterion("LIANXIDIANHUAYI >=", value, "lianxidianhuayi");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuayiLessThan(String value) {
            addCriterion("LIANXIDIANHUAYI <", value, "lianxidianhuayi");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuayiLessThanOrEqualTo(String value) {
            addCriterion("LIANXIDIANHUAYI <=", value, "lianxidianhuayi");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuayiLike(String value) {
            addCriterion("LIANXIDIANHUAYI like", value, "lianxidianhuayi");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuayiNotLike(String value) {
            addCriterion("LIANXIDIANHUAYI not like", value, "lianxidianhuayi");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuayiIn(List<String> values) {
            addCriterion("LIANXIDIANHUAYI in", values, "lianxidianhuayi");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuayiNotIn(List<String> values) {
            addCriterion("LIANXIDIANHUAYI not in", values, "lianxidianhuayi");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuayiBetween(String value1, String value2) {
            addCriterion("LIANXIDIANHUAYI between", value1, value2, "lianxidianhuayi");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuayiNotBetween(String value1, String value2) {
            addCriterion("LIANXIDIANHUAYI not between", value1, value2, "lianxidianhuayi");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangdizhiIsNull() {
            addCriterion("DIANZIYOUXIANGDIZHI is null");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangdizhiIsNotNull() {
            addCriterion("DIANZIYOUXIANGDIZHI is not null");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangdizhiEqualTo(String value) {
            addCriterion("DIANZIYOUXIANGDIZHI =", value, "dianziyouxiangdizhi");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangdizhiNotEqualTo(String value) {
            addCriterion("DIANZIYOUXIANGDIZHI <>", value, "dianziyouxiangdizhi");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangdizhiGreaterThan(String value) {
            addCriterion("DIANZIYOUXIANGDIZHI >", value, "dianziyouxiangdizhi");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangdizhiGreaterThanOrEqualTo(String value) {
            addCriterion("DIANZIYOUXIANGDIZHI >=", value, "dianziyouxiangdizhi");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangdizhiLessThan(String value) {
            addCriterion("DIANZIYOUXIANGDIZHI <", value, "dianziyouxiangdizhi");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangdizhiLessThanOrEqualTo(String value) {
            addCriterion("DIANZIYOUXIANGDIZHI <=", value, "dianziyouxiangdizhi");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangdizhiLike(String value) {
            addCriterion("DIANZIYOUXIANGDIZHI like", value, "dianziyouxiangdizhi");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangdizhiNotLike(String value) {
            addCriterion("DIANZIYOUXIANGDIZHI not like", value, "dianziyouxiangdizhi");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangdizhiIn(List<String> values) {
            addCriterion("DIANZIYOUXIANGDIZHI in", values, "dianziyouxiangdizhi");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangdizhiNotIn(List<String> values) {
            addCriterion("DIANZIYOUXIANGDIZHI not in", values, "dianziyouxiangdizhi");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangdizhiBetween(String value1, String value2) {
            addCriterion("DIANZIYOUXIANGDIZHI between", value1, value2, "dianziyouxiangdizhi");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangdizhiNotBetween(String value1, String value2) {
            addCriterion("DIANZIYOUXIANGDIZHI not between", value1, value2, "dianziyouxiangdizhi");
            return (Criteria) this;
        }

        public Criteria andDianhuaerIsNull() {
            addCriterion("DIANHUAER is null");
            return (Criteria) this;
        }

        public Criteria andDianhuaerIsNotNull() {
            addCriterion("DIANHUAER is not null");
            return (Criteria) this;
        }

        public Criteria andDianhuaerEqualTo(String value) {
            addCriterion("DIANHUAER =", value, "dianhuaer");
            return (Criteria) this;
        }

        public Criteria andDianhuaerNotEqualTo(String value) {
            addCriterion("DIANHUAER <>", value, "dianhuaer");
            return (Criteria) this;
        }

        public Criteria andDianhuaerGreaterThan(String value) {
            addCriterion("DIANHUAER >", value, "dianhuaer");
            return (Criteria) this;
        }

        public Criteria andDianhuaerGreaterThanOrEqualTo(String value) {
            addCriterion("DIANHUAER >=", value, "dianhuaer");
            return (Criteria) this;
        }

        public Criteria andDianhuaerLessThan(String value) {
            addCriterion("DIANHUAER <", value, "dianhuaer");
            return (Criteria) this;
        }

        public Criteria andDianhuaerLessThanOrEqualTo(String value) {
            addCriterion("DIANHUAER <=", value, "dianhuaer");
            return (Criteria) this;
        }

        public Criteria andDianhuaerLike(String value) {
            addCriterion("DIANHUAER like", value, "dianhuaer");
            return (Criteria) this;
        }

        public Criteria andDianhuaerNotLike(String value) {
            addCriterion("DIANHUAER not like", value, "dianhuaer");
            return (Criteria) this;
        }

        public Criteria andDianhuaerIn(List<String> values) {
            addCriterion("DIANHUAER in", values, "dianhuaer");
            return (Criteria) this;
        }

        public Criteria andDianhuaerNotIn(List<String> values) {
            addCriterion("DIANHUAER not in", values, "dianhuaer");
            return (Criteria) this;
        }

        public Criteria andDianhuaerBetween(String value1, String value2) {
            addCriterion("DIANHUAER between", value1, value2, "dianhuaer");
            return (Criteria) this;
        }

        public Criteria andDianhuaerNotBetween(String value1, String value2) {
            addCriterion("DIANHUAER not between", value1, value2, "dianhuaer");
            return (Criteria) this;
        }

        public Criteria andHulianwangzhongwenmingIsNull() {
            addCriterion("HULIANWANGZHONGWENMING is null");
            return (Criteria) this;
        }

        public Criteria andHulianwangzhongwenmingIsNotNull() {
            addCriterion("HULIANWANGZHONGWENMING is not null");
            return (Criteria) this;
        }

        public Criteria andHulianwangzhongwenmingEqualTo(String value) {
            addCriterion("HULIANWANGZHONGWENMING =", value, "hulianwangzhongwenming");
            return (Criteria) this;
        }

        public Criteria andHulianwangzhongwenmingNotEqualTo(String value) {
            addCriterion("HULIANWANGZHONGWENMING <>", value, "hulianwangzhongwenming");
            return (Criteria) this;
        }

        public Criteria andHulianwangzhongwenmingGreaterThan(String value) {
            addCriterion("HULIANWANGZHONGWENMING >", value, "hulianwangzhongwenming");
            return (Criteria) this;
        }

        public Criteria andHulianwangzhongwenmingGreaterThanOrEqualTo(String value) {
            addCriterion("HULIANWANGZHONGWENMING >=", value, "hulianwangzhongwenming");
            return (Criteria) this;
        }

        public Criteria andHulianwangzhongwenmingLessThan(String value) {
            addCriterion("HULIANWANGZHONGWENMING <", value, "hulianwangzhongwenming");
            return (Criteria) this;
        }

        public Criteria andHulianwangzhongwenmingLessThanOrEqualTo(String value) {
            addCriterion("HULIANWANGZHONGWENMING <=", value, "hulianwangzhongwenming");
            return (Criteria) this;
        }

        public Criteria andHulianwangzhongwenmingLike(String value) {
            addCriterion("HULIANWANGZHONGWENMING like", value, "hulianwangzhongwenming");
            return (Criteria) this;
        }

        public Criteria andHulianwangzhongwenmingNotLike(String value) {
            addCriterion("HULIANWANGZHONGWENMING not like", value, "hulianwangzhongwenming");
            return (Criteria) this;
        }

        public Criteria andHulianwangzhongwenmingIn(List<String> values) {
            addCriterion("HULIANWANGZHONGWENMING in", values, "hulianwangzhongwenming");
            return (Criteria) this;
        }

        public Criteria andHulianwangzhongwenmingNotIn(List<String> values) {
            addCriterion("HULIANWANGZHONGWENMING not in", values, "hulianwangzhongwenming");
            return (Criteria) this;
        }

        public Criteria andHulianwangzhongwenmingBetween(String value1, String value2) {
            addCriterion("HULIANWANGZHONGWENMING between", value1, value2, "hulianwangzhongwenming");
            return (Criteria) this;
        }

        public Criteria andHulianwangzhongwenmingNotBetween(String value1, String value2) {
            addCriterion("HULIANWANGZHONGWENMING not between", value1, value2, "hulianwangzhongwenming");
            return (Criteria) this;
        }

        public Criteria andHulianwangwangzhiIsNull() {
            addCriterion("HULIANWANGWANGZHI is null");
            return (Criteria) this;
        }

        public Criteria andHulianwangwangzhiIsNotNull() {
            addCriterion("HULIANWANGWANGZHI is not null");
            return (Criteria) this;
        }

        public Criteria andHulianwangwangzhiEqualTo(String value) {
            addCriterion("HULIANWANGWANGZHI =", value, "hulianwangwangzhi");
            return (Criteria) this;
        }

        public Criteria andHulianwangwangzhiNotEqualTo(String value) {
            addCriterion("HULIANWANGWANGZHI <>", value, "hulianwangwangzhi");
            return (Criteria) this;
        }

        public Criteria andHulianwangwangzhiGreaterThan(String value) {
            addCriterion("HULIANWANGWANGZHI >", value, "hulianwangwangzhi");
            return (Criteria) this;
        }

        public Criteria andHulianwangwangzhiGreaterThanOrEqualTo(String value) {
            addCriterion("HULIANWANGWANGZHI >=", value, "hulianwangwangzhi");
            return (Criteria) this;
        }

        public Criteria andHulianwangwangzhiLessThan(String value) {
            addCriterion("HULIANWANGWANGZHI <", value, "hulianwangwangzhi");
            return (Criteria) this;
        }

        public Criteria andHulianwangwangzhiLessThanOrEqualTo(String value) {
            addCriterion("HULIANWANGWANGZHI <=", value, "hulianwangwangzhi");
            return (Criteria) this;
        }

        public Criteria andHulianwangwangzhiLike(String value) {
            addCriterion("HULIANWANGWANGZHI like", value, "hulianwangwangzhi");
            return (Criteria) this;
        }

        public Criteria andHulianwangwangzhiNotLike(String value) {
            addCriterion("HULIANWANGWANGZHI not like", value, "hulianwangwangzhi");
            return (Criteria) this;
        }

        public Criteria andHulianwangwangzhiIn(List<String> values) {
            addCriterion("HULIANWANGWANGZHI in", values, "hulianwangwangzhi");
            return (Criteria) this;
        }

        public Criteria andHulianwangwangzhiNotIn(List<String> values) {
            addCriterion("HULIANWANGWANGZHI not in", values, "hulianwangwangzhi");
            return (Criteria) this;
        }

        public Criteria andHulianwangwangzhiBetween(String value1, String value2) {
            addCriterion("HULIANWANGWANGZHI between", value1, value2, "hulianwangwangzhi");
            return (Criteria) this;
        }

        public Criteria andHulianwangwangzhiNotBetween(String value1, String value2) {
            addCriterion("HULIANWANGWANGZHI not between", value1, value2, "hulianwangwangzhi");
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

        public Criteria andLishirenshuEqualTo(Long value) {
            addCriterion("LISHIRENSHU =", value, "lishirenshu");
            return (Criteria) this;
        }

        public Criteria andLishirenshuNotEqualTo(Long value) {
            addCriterion("LISHIRENSHU <>", value, "lishirenshu");
            return (Criteria) this;
        }

        public Criteria andLishirenshuGreaterThan(Long value) {
            addCriterion("LISHIRENSHU >", value, "lishirenshu");
            return (Criteria) this;
        }

        public Criteria andLishirenshuGreaterThanOrEqualTo(Long value) {
            addCriterion("LISHIRENSHU >=", value, "lishirenshu");
            return (Criteria) this;
        }

        public Criteria andLishirenshuLessThan(Long value) {
            addCriterion("LISHIRENSHU <", value, "lishirenshu");
            return (Criteria) this;
        }

        public Criteria andLishirenshuLessThanOrEqualTo(Long value) {
            addCriterion("LISHIRENSHU <=", value, "lishirenshu");
            return (Criteria) this;
        }

        public Criteria andLishirenshuIn(List<Long> values) {
            addCriterion("LISHIRENSHU in", values, "lishirenshu");
            return (Criteria) this;
        }

        public Criteria andLishirenshuNotIn(List<Long> values) {
            addCriterion("LISHIRENSHU not in", values, "lishirenshu");
            return (Criteria) this;
        }

        public Criteria andLishirenshuBetween(Long value1, Long value2) {
            addCriterion("LISHIRENSHU between", value1, value2, "lishirenshu");
            return (Criteria) this;
        }

        public Criteria andLishirenshuNotBetween(Long value1, Long value2) {
            addCriterion("LISHIRENSHU not between", value1, value2, "lishirenshu");
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

        public Criteria andJianshirenshuEqualTo(Long value) {
            addCriterion("JIANSHIRENSHU =", value, "jianshirenshu");
            return (Criteria) this;
        }

        public Criteria andJianshirenshuNotEqualTo(Long value) {
            addCriterion("JIANSHIRENSHU <>", value, "jianshirenshu");
            return (Criteria) this;
        }

        public Criteria andJianshirenshuGreaterThan(Long value) {
            addCriterion("JIANSHIRENSHU >", value, "jianshirenshu");
            return (Criteria) this;
        }

        public Criteria andJianshirenshuGreaterThanOrEqualTo(Long value) {
            addCriterion("JIANSHIRENSHU >=", value, "jianshirenshu");
            return (Criteria) this;
        }

        public Criteria andJianshirenshuLessThan(Long value) {
            addCriterion("JIANSHIRENSHU <", value, "jianshirenshu");
            return (Criteria) this;
        }

        public Criteria andJianshirenshuLessThanOrEqualTo(Long value) {
            addCriterion("JIANSHIRENSHU <=", value, "jianshirenshu");
            return (Criteria) this;
        }

        public Criteria andJianshirenshuIn(List<Long> values) {
            addCriterion("JIANSHIRENSHU in", values, "jianshirenshu");
            return (Criteria) this;
        }

        public Criteria andJianshirenshuNotIn(List<Long> values) {
            addCriterion("JIANSHIRENSHU not in", values, "jianshirenshu");
            return (Criteria) this;
        }

        public Criteria andJianshirenshuBetween(Long value1, Long value2) {
            addCriterion("JIANSHIRENSHU between", value1, value2, "jianshirenshu");
            return (Criteria) this;
        }

        public Criteria andJianshirenshuNotBetween(Long value1, Long value2) {
            addCriterion("JIANSHIRENSHU not between", value1, value2, "jianshirenshu");
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

        public Criteria andFuzerenshuEqualTo(Long value) {
            addCriterion("FUZERENSHU =", value, "fuzerenshu");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuNotEqualTo(Long value) {
            addCriterion("FUZERENSHU <>", value, "fuzerenshu");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuGreaterThan(Long value) {
            addCriterion("FUZERENSHU >", value, "fuzerenshu");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuGreaterThanOrEqualTo(Long value) {
            addCriterion("FUZERENSHU >=", value, "fuzerenshu");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuLessThan(Long value) {
            addCriterion("FUZERENSHU <", value, "fuzerenshu");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuLessThanOrEqualTo(Long value) {
            addCriterion("FUZERENSHU <=", value, "fuzerenshu");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuIn(List<Long> values) {
            addCriterion("FUZERENSHU in", values, "fuzerenshu");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuNotIn(List<Long> values) {
            addCriterion("FUZERENSHU not in", values, "fuzerenshu");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuBetween(Long value1, Long value2) {
            addCriterion("FUZERENSHU between", value1, value2, "fuzerenshu");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuNotBetween(Long value1, Long value2) {
            addCriterion("FUZERENSHU not between", value1, value2, "fuzerenshu");
            return (Criteria) this;
        }

        public Criteria andGongzuorenyuanshuIsNull() {
            addCriterion("GONGZUORENYUANSHU is null");
            return (Criteria) this;
        }

        public Criteria andGongzuorenyuanshuIsNotNull() {
            addCriterion("GONGZUORENYUANSHU is not null");
            return (Criteria) this;
        }

        public Criteria andGongzuorenyuanshuEqualTo(Long value) {
            addCriterion("GONGZUORENYUANSHU =", value, "gongzuorenyuanshu");
            return (Criteria) this;
        }

        public Criteria andGongzuorenyuanshuNotEqualTo(Long value) {
            addCriterion("GONGZUORENYUANSHU <>", value, "gongzuorenyuanshu");
            return (Criteria) this;
        }

        public Criteria andGongzuorenyuanshuGreaterThan(Long value) {
            addCriterion("GONGZUORENYUANSHU >", value, "gongzuorenyuanshu");
            return (Criteria) this;
        }

        public Criteria andGongzuorenyuanshuGreaterThanOrEqualTo(Long value) {
            addCriterion("GONGZUORENYUANSHU >=", value, "gongzuorenyuanshu");
            return (Criteria) this;
        }

        public Criteria andGongzuorenyuanshuLessThan(Long value) {
            addCriterion("GONGZUORENYUANSHU <", value, "gongzuorenyuanshu");
            return (Criteria) this;
        }

        public Criteria andGongzuorenyuanshuLessThanOrEqualTo(Long value) {
            addCriterion("GONGZUORENYUANSHU <=", value, "gongzuorenyuanshu");
            return (Criteria) this;
        }

        public Criteria andGongzuorenyuanshuIn(List<Long> values) {
            addCriterion("GONGZUORENYUANSHU in", values, "gongzuorenyuanshu");
            return (Criteria) this;
        }

        public Criteria andGongzuorenyuanshuNotIn(List<Long> values) {
            addCriterion("GONGZUORENYUANSHU not in", values, "gongzuorenyuanshu");
            return (Criteria) this;
        }

        public Criteria andGongzuorenyuanshuBetween(Long value1, Long value2) {
            addCriterion("GONGZUORENYUANSHU between", value1, value2, "gongzuorenyuanshu");
            return (Criteria) this;
        }

        public Criteria andGongzuorenyuanshuNotBetween(Long value1, Long value2) {
            addCriterion("GONGZUORENYUANSHU not between", value1, value2, "gongzuorenyuanshu");
            return (Criteria) this;
        }

        public Criteria andKanwuqingkuangIsNull() {
            addCriterion("KANWUQINGKUANG is null");
            return (Criteria) this;
        }

        public Criteria andKanwuqingkuangIsNotNull() {
            addCriterion("KANWUQINGKUANG is not null");
            return (Criteria) this;
        }

        public Criteria andKanwuqingkuangEqualTo(Long value) {
            addCriterion("KANWUQINGKUANG =", value, "kanwuqingkuang");
            return (Criteria) this;
        }

        public Criteria andKanwuqingkuangNotEqualTo(Long value) {
            addCriterion("KANWUQINGKUANG <>", value, "kanwuqingkuang");
            return (Criteria) this;
        }

        public Criteria andKanwuqingkuangGreaterThan(Long value) {
            addCriterion("KANWUQINGKUANG >", value, "kanwuqingkuang");
            return (Criteria) this;
        }

        public Criteria andKanwuqingkuangGreaterThanOrEqualTo(Long value) {
            addCriterion("KANWUQINGKUANG >=", value, "kanwuqingkuang");
            return (Criteria) this;
        }

        public Criteria andKanwuqingkuangLessThan(Long value) {
            addCriterion("KANWUQINGKUANG <", value, "kanwuqingkuang");
            return (Criteria) this;
        }

        public Criteria andKanwuqingkuangLessThanOrEqualTo(Long value) {
            addCriterion("KANWUQINGKUANG <=", value, "kanwuqingkuang");
            return (Criteria) this;
        }

        public Criteria andKanwuqingkuangIn(List<Long> values) {
            addCriterion("KANWUQINGKUANG in", values, "kanwuqingkuang");
            return (Criteria) this;
        }

        public Criteria andKanwuqingkuangNotIn(List<Long> values) {
            addCriterion("KANWUQINGKUANG not in", values, "kanwuqingkuang");
            return (Criteria) this;
        }

        public Criteria andKanwuqingkuangBetween(Long value1, Long value2) {
            addCriterion("KANWUQINGKUANG between", value1, value2, "kanwuqingkuang");
            return (Criteria) this;
        }

        public Criteria andKanwuqingkuangNotBetween(Long value1, Long value2) {
            addCriterion("KANWUQINGKUANG not between", value1, value2, "kanwuqingkuang");
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

        public Criteria andFenzhijigoushuEqualTo(Long value) {
            addCriterion("FENZHIJIGOUSHU =", value, "fenzhijigoushu");
            return (Criteria) this;
        }

        public Criteria andFenzhijigoushuNotEqualTo(Long value) {
            addCriterion("FENZHIJIGOUSHU <>", value, "fenzhijigoushu");
            return (Criteria) this;
        }

        public Criteria andFenzhijigoushuGreaterThan(Long value) {
            addCriterion("FENZHIJIGOUSHU >", value, "fenzhijigoushu");
            return (Criteria) this;
        }

        public Criteria andFenzhijigoushuGreaterThanOrEqualTo(Long value) {
            addCriterion("FENZHIJIGOUSHU >=", value, "fenzhijigoushu");
            return (Criteria) this;
        }

        public Criteria andFenzhijigoushuLessThan(Long value) {
            addCriterion("FENZHIJIGOUSHU <", value, "fenzhijigoushu");
            return (Criteria) this;
        }

        public Criteria andFenzhijigoushuLessThanOrEqualTo(Long value) {
            addCriterion("FENZHIJIGOUSHU <=", value, "fenzhijigoushu");
            return (Criteria) this;
        }

        public Criteria andFenzhijigoushuIn(List<Long> values) {
            addCriterion("FENZHIJIGOUSHU in", values, "fenzhijigoushu");
            return (Criteria) this;
        }

        public Criteria andFenzhijigoushuNotIn(List<Long> values) {
            addCriterion("FENZHIJIGOUSHU not in", values, "fenzhijigoushu");
            return (Criteria) this;
        }

        public Criteria andFenzhijigoushuBetween(Long value1, Long value2) {
            addCriterion("FENZHIJIGOUSHU between", value1, value2, "fenzhijigoushu");
            return (Criteria) this;
        }

        public Criteria andFenzhijigoushuNotBetween(Long value1, Long value2) {
            addCriterion("FENZHIJIGOUSHU not between", value1, value2, "fenzhijigoushu");
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

        public Criteria andZhiyuanzherenshuEqualTo(Long value) {
            addCriterion("ZHIYUANZHERENSHU =", value, "zhiyuanzherenshu");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzherenshuNotEqualTo(Long value) {
            addCriterion("ZHIYUANZHERENSHU <>", value, "zhiyuanzherenshu");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzherenshuGreaterThan(Long value) {
            addCriterion("ZHIYUANZHERENSHU >", value, "zhiyuanzherenshu");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzherenshuGreaterThanOrEqualTo(Long value) {
            addCriterion("ZHIYUANZHERENSHU >=", value, "zhiyuanzherenshu");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzherenshuLessThan(Long value) {
            addCriterion("ZHIYUANZHERENSHU <", value, "zhiyuanzherenshu");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzherenshuLessThanOrEqualTo(Long value) {
            addCriterion("ZHIYUANZHERENSHU <=", value, "zhiyuanzherenshu");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzherenshuIn(List<Long> values) {
            addCriterion("ZHIYUANZHERENSHU in", values, "zhiyuanzherenshu");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzherenshuNotIn(List<Long> values) {
            addCriterion("ZHIYUANZHERENSHU not in", values, "zhiyuanzherenshu");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzherenshuBetween(Long value1, Long value2) {
            addCriterion("ZHIYUANZHERENSHU between", value1, value2, "zhiyuanzherenshu");
            return (Criteria) this;
        }

        public Criteria andZhiyuanzherenshuNotBetween(Long value1, Long value2) {
            addCriterion("ZHIYUANZHERENSHU not between", value1, value2, "zhiyuanzherenshu");
            return (Criteria) this;
        }

        public Criteria andLeijilaodongshijianIsNull() {
            addCriterion("LEIJILAODONGSHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijilaodongshijianIsNotNull() {
            addCriterion("LEIJILAODONGSHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijilaodongshijianEqualTo(BigDecimal value) {
            addCriterion("LEIJILAODONGSHIJIAN =", value, "leijilaodongshijian");
            return (Criteria) this;
        }

        public Criteria andLeijilaodongshijianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJILAODONGSHIJIAN <>", value, "leijilaodongshijian");
            return (Criteria) this;
        }

        public Criteria andLeijilaodongshijianGreaterThan(BigDecimal value) {
            addCriterion("LEIJILAODONGSHIJIAN >", value, "leijilaodongshijian");
            return (Criteria) this;
        }

        public Criteria andLeijilaodongshijianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJILAODONGSHIJIAN >=", value, "leijilaodongshijian");
            return (Criteria) this;
        }

        public Criteria andLeijilaodongshijianLessThan(BigDecimal value) {
            addCriterion("LEIJILAODONGSHIJIAN <", value, "leijilaodongshijian");
            return (Criteria) this;
        }

        public Criteria andLeijilaodongshijianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJILAODONGSHIJIAN <=", value, "leijilaodongshijian");
            return (Criteria) this;
        }

        public Criteria andLeijilaodongshijianIn(List<BigDecimal> values) {
            addCriterion("LEIJILAODONGSHIJIAN in", values, "leijilaodongshijian");
            return (Criteria) this;
        }

        public Criteria andLeijilaodongshijianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJILAODONGSHIJIAN not in", values, "leijilaodongshijian");
            return (Criteria) this;
        }

        public Criteria andLeijilaodongshijianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJILAODONGSHIJIAN between", value1, value2, "leijilaodongshijian");
            return (Criteria) this;
        }

        public Criteria andLeijilaodongshijianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJILAODONGSHIJIAN not between", value1, value2, "leijilaodongshijian");
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

        public Criteria andDaibiaojigoushuEqualTo(Long value) {
            addCriterion("DAIBIAOJIGOUSHU =", value, "daibiaojigoushu");
            return (Criteria) this;
        }

        public Criteria andDaibiaojigoushuNotEqualTo(Long value) {
            addCriterion("DAIBIAOJIGOUSHU <>", value, "daibiaojigoushu");
            return (Criteria) this;
        }

        public Criteria andDaibiaojigoushuGreaterThan(Long value) {
            addCriterion("DAIBIAOJIGOUSHU >", value, "daibiaojigoushu");
            return (Criteria) this;
        }

        public Criteria andDaibiaojigoushuGreaterThanOrEqualTo(Long value) {
            addCriterion("DAIBIAOJIGOUSHU >=", value, "daibiaojigoushu");
            return (Criteria) this;
        }

        public Criteria andDaibiaojigoushuLessThan(Long value) {
            addCriterion("DAIBIAOJIGOUSHU <", value, "daibiaojigoushu");
            return (Criteria) this;
        }

        public Criteria andDaibiaojigoushuLessThanOrEqualTo(Long value) {
            addCriterion("DAIBIAOJIGOUSHU <=", value, "daibiaojigoushu");
            return (Criteria) this;
        }

        public Criteria andDaibiaojigoushuIn(List<Long> values) {
            addCriterion("DAIBIAOJIGOUSHU in", values, "daibiaojigoushu");
            return (Criteria) this;
        }

        public Criteria andDaibiaojigoushuNotIn(List<Long> values) {
            addCriterion("DAIBIAOJIGOUSHU not in", values, "daibiaojigoushu");
            return (Criteria) this;
        }

        public Criteria andDaibiaojigoushuBetween(Long value1, Long value2) {
            addCriterion("DAIBIAOJIGOUSHU between", value1, value2, "daibiaojigoushu");
            return (Criteria) this;
        }

        public Criteria andDaibiaojigoushuNotBetween(Long value1, Long value2) {
            addCriterion("DAIBIAOJIGOUSHU not between", value1, value2, "daibiaojigoushu");
            return (Criteria) this;
        }

        public Criteria andYinzhangguanlizhiduIsNull() {
            addCriterion("YINZHANGGUANLIZHIDU is null");
            return (Criteria) this;
        }

        public Criteria andYinzhangguanlizhiduIsNotNull() {
            addCriterion("YINZHANGGUANLIZHIDU is not null");
            return (Criteria) this;
        }

        public Criteria andYinzhangguanlizhiduEqualTo(String value) {
            addCriterion("YINZHANGGUANLIZHIDU =", value, "yinzhangguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andYinzhangguanlizhiduNotEqualTo(String value) {
            addCriterion("YINZHANGGUANLIZHIDU <>", value, "yinzhangguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andYinzhangguanlizhiduGreaterThan(String value) {
            addCriterion("YINZHANGGUANLIZHIDU >", value, "yinzhangguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andYinzhangguanlizhiduGreaterThanOrEqualTo(String value) {
            addCriterion("YINZHANGGUANLIZHIDU >=", value, "yinzhangguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andYinzhangguanlizhiduLessThan(String value) {
            addCriterion("YINZHANGGUANLIZHIDU <", value, "yinzhangguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andYinzhangguanlizhiduLessThanOrEqualTo(String value) {
            addCriterion("YINZHANGGUANLIZHIDU <=", value, "yinzhangguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andYinzhangguanlizhiduLike(String value) {
            addCriterion("YINZHANGGUANLIZHIDU like", value, "yinzhangguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andYinzhangguanlizhiduNotLike(String value) {
            addCriterion("YINZHANGGUANLIZHIDU not like", value, "yinzhangguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andYinzhangguanlizhiduIn(List<String> values) {
            addCriterion("YINZHANGGUANLIZHIDU in", values, "yinzhangguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andYinzhangguanlizhiduNotIn(List<String> values) {
            addCriterion("YINZHANGGUANLIZHIDU not in", values, "yinzhangguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andYinzhangguanlizhiduBetween(String value1, String value2) {
            addCriterion("YINZHANGGUANLIZHIDU between", value1, value2, "yinzhangguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andYinzhangguanlizhiduNotBetween(String value1, String value2) {
            addCriterion("YINZHANGGUANLIZHIDU not between", value1, value2, "yinzhangguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiIsNull() {
            addCriterion("YINZHANGBAOGUANDI is null");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiIsNotNull() {
            addCriterion("YINZHANGBAOGUANDI is not null");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiEqualTo(String value) {
            addCriterion("YINZHANGBAOGUANDI =", value, "yinzhangbaoguandi");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiNotEqualTo(String value) {
            addCriterion("YINZHANGBAOGUANDI <>", value, "yinzhangbaoguandi");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiGreaterThan(String value) {
            addCriterion("YINZHANGBAOGUANDI >", value, "yinzhangbaoguandi");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiGreaterThanOrEqualTo(String value) {
            addCriterion("YINZHANGBAOGUANDI >=", value, "yinzhangbaoguandi");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiLessThan(String value) {
            addCriterion("YINZHANGBAOGUANDI <", value, "yinzhangbaoguandi");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiLessThanOrEqualTo(String value) {
            addCriterion("YINZHANGBAOGUANDI <=", value, "yinzhangbaoguandi");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiLike(String value) {
            addCriterion("YINZHANGBAOGUANDI like", value, "yinzhangbaoguandi");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiNotLike(String value) {
            addCriterion("YINZHANGBAOGUANDI not like", value, "yinzhangbaoguandi");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiIn(List<String> values) {
            addCriterion("YINZHANGBAOGUANDI in", values, "yinzhangbaoguandi");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiNotIn(List<String> values) {
            addCriterion("YINZHANGBAOGUANDI not in", values, "yinzhangbaoguandi");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiBetween(String value1, String value2) {
            addCriterion("YINZHANGBAOGUANDI between", value1, value2, "yinzhangbaoguandi");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiNotBetween(String value1, String value2) {
            addCriterion("YINZHANGBAOGUANDI not between", value1, value2, "yinzhangbaoguandi");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiqitajutiIsNull() {
            addCriterion("YINZHANGBAOGUANDIQITAJUTI is null");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiqitajutiIsNotNull() {
            addCriterion("YINZHANGBAOGUANDIQITAJUTI is not null");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiqitajutiEqualTo(String value) {
            addCriterion("YINZHANGBAOGUANDIQITAJUTI =", value, "yinzhangbaoguandiqitajuti");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiqitajutiNotEqualTo(String value) {
            addCriterion("YINZHANGBAOGUANDIQITAJUTI <>", value, "yinzhangbaoguandiqitajuti");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiqitajutiGreaterThan(String value) {
            addCriterion("YINZHANGBAOGUANDIQITAJUTI >", value, "yinzhangbaoguandiqitajuti");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiqitajutiGreaterThanOrEqualTo(String value) {
            addCriterion("YINZHANGBAOGUANDIQITAJUTI >=", value, "yinzhangbaoguandiqitajuti");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiqitajutiLessThan(String value) {
            addCriterion("YINZHANGBAOGUANDIQITAJUTI <", value, "yinzhangbaoguandiqitajuti");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiqitajutiLessThanOrEqualTo(String value) {
            addCriterion("YINZHANGBAOGUANDIQITAJUTI <=", value, "yinzhangbaoguandiqitajuti");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiqitajutiLike(String value) {
            addCriterion("YINZHANGBAOGUANDIQITAJUTI like", value, "yinzhangbaoguandiqitajuti");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiqitajutiNotLike(String value) {
            addCriterion("YINZHANGBAOGUANDIQITAJUTI not like", value, "yinzhangbaoguandiqitajuti");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiqitajutiIn(List<String> values) {
            addCriterion("YINZHANGBAOGUANDIQITAJUTI in", values, "yinzhangbaoguandiqitajuti");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiqitajutiNotIn(List<String> values) {
            addCriterion("YINZHANGBAOGUANDIQITAJUTI not in", values, "yinzhangbaoguandiqitajuti");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiqitajutiBetween(String value1, String value2) {
            addCriterion("YINZHANGBAOGUANDIQITAJUTI between", value1, value2, "yinzhangbaoguandiqitajuti");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiqitajutiNotBetween(String value1, String value2) {
            addCriterion("YINZHANGBAOGUANDIQITAJUTI not between", value1, value2, "yinzhangbaoguandiqitajuti");
            return (Criteria) this;
        }

        public Criteria andFarenzhengshubaoguandiIsNull() {
            addCriterion("FARENZHENGSHUBAOGUANDI is null");
            return (Criteria) this;
        }

        public Criteria andFarenzhengshubaoguandiIsNotNull() {
            addCriterion("FARENZHENGSHUBAOGUANDI is not null");
            return (Criteria) this;
        }

        public Criteria andFarenzhengshubaoguandiEqualTo(String value) {
            addCriterion("FARENZHENGSHUBAOGUANDI =", value, "farenzhengshubaoguandi");
            return (Criteria) this;
        }

        public Criteria andFarenzhengshubaoguandiNotEqualTo(String value) {
            addCriterion("FARENZHENGSHUBAOGUANDI <>", value, "farenzhengshubaoguandi");
            return (Criteria) this;
        }

        public Criteria andFarenzhengshubaoguandiGreaterThan(String value) {
            addCriterion("FARENZHENGSHUBAOGUANDI >", value, "farenzhengshubaoguandi");
            return (Criteria) this;
        }

        public Criteria andFarenzhengshubaoguandiGreaterThanOrEqualTo(String value) {
            addCriterion("FARENZHENGSHUBAOGUANDI >=", value, "farenzhengshubaoguandi");
            return (Criteria) this;
        }

        public Criteria andFarenzhengshubaoguandiLessThan(String value) {
            addCriterion("FARENZHENGSHUBAOGUANDI <", value, "farenzhengshubaoguandi");
            return (Criteria) this;
        }

        public Criteria andFarenzhengshubaoguandiLessThanOrEqualTo(String value) {
            addCriterion("FARENZHENGSHUBAOGUANDI <=", value, "farenzhengshubaoguandi");
            return (Criteria) this;
        }

        public Criteria andFarenzhengshubaoguandiLike(String value) {
            addCriterion("FARENZHENGSHUBAOGUANDI like", value, "farenzhengshubaoguandi");
            return (Criteria) this;
        }

        public Criteria andFarenzhengshubaoguandiNotLike(String value) {
            addCriterion("FARENZHENGSHUBAOGUANDI not like", value, "farenzhengshubaoguandi");
            return (Criteria) this;
        }

        public Criteria andFarenzhengshubaoguandiIn(List<String> values) {
            addCriterion("FARENZHENGSHUBAOGUANDI in", values, "farenzhengshubaoguandi");
            return (Criteria) this;
        }

        public Criteria andFarenzhengshubaoguandiNotIn(List<String> values) {
            addCriterion("FARENZHENGSHUBAOGUANDI not in", values, "farenzhengshubaoguandi");
            return (Criteria) this;
        }

        public Criteria andFarenzhengshubaoguandiBetween(String value1, String value2) {
            addCriterion("FARENZHENGSHUBAOGUANDI between", value1, value2, "farenzhengshubaoguandi");
            return (Criteria) this;
        }

        public Criteria andFarenzhengshubaoguandiNotBetween(String value1, String value2) {
            addCriterion("FARENZHENGSHUBAOGUANDI not between", value1, value2, "farenzhengshubaoguandi");
            return (Criteria) this;
        }

        public Criteria andZhengshubaoguandiqitajutiIsNull() {
            addCriterion("ZHENGSHUBAOGUANDIQITAJUTI is null");
            return (Criteria) this;
        }

        public Criteria andZhengshubaoguandiqitajutiIsNotNull() {
            addCriterion("ZHENGSHUBAOGUANDIQITAJUTI is not null");
            return (Criteria) this;
        }

        public Criteria andZhengshubaoguandiqitajutiEqualTo(String value) {
            addCriterion("ZHENGSHUBAOGUANDIQITAJUTI =", value, "zhengshubaoguandiqitajuti");
            return (Criteria) this;
        }

        public Criteria andZhengshubaoguandiqitajutiNotEqualTo(String value) {
            addCriterion("ZHENGSHUBAOGUANDIQITAJUTI <>", value, "zhengshubaoguandiqitajuti");
            return (Criteria) this;
        }

        public Criteria andZhengshubaoguandiqitajutiGreaterThan(String value) {
            addCriterion("ZHENGSHUBAOGUANDIQITAJUTI >", value, "zhengshubaoguandiqitajuti");
            return (Criteria) this;
        }

        public Criteria andZhengshubaoguandiqitajutiGreaterThanOrEqualTo(String value) {
            addCriterion("ZHENGSHUBAOGUANDIQITAJUTI >=", value, "zhengshubaoguandiqitajuti");
            return (Criteria) this;
        }

        public Criteria andZhengshubaoguandiqitajutiLessThan(String value) {
            addCriterion("ZHENGSHUBAOGUANDIQITAJUTI <", value, "zhengshubaoguandiqitajuti");
            return (Criteria) this;
        }

        public Criteria andZhengshubaoguandiqitajutiLessThanOrEqualTo(String value) {
            addCriterion("ZHENGSHUBAOGUANDIQITAJUTI <=", value, "zhengshubaoguandiqitajuti");
            return (Criteria) this;
        }

        public Criteria andZhengshubaoguandiqitajutiLike(String value) {
            addCriterion("ZHENGSHUBAOGUANDIQITAJUTI like", value, "zhengshubaoguandiqitajuti");
            return (Criteria) this;
        }

        public Criteria andZhengshubaoguandiqitajutiNotLike(String value) {
            addCriterion("ZHENGSHUBAOGUANDIQITAJUTI not like", value, "zhengshubaoguandiqitajuti");
            return (Criteria) this;
        }

        public Criteria andZhengshubaoguandiqitajutiIn(List<String> values) {
            addCriterion("ZHENGSHUBAOGUANDIQITAJUTI in", values, "zhengshubaoguandiqitajuti");
            return (Criteria) this;
        }

        public Criteria andZhengshubaoguandiqitajutiNotIn(List<String> values) {
            addCriterion("ZHENGSHUBAOGUANDIQITAJUTI not in", values, "zhengshubaoguandiqitajuti");
            return (Criteria) this;
        }

        public Criteria andZhengshubaoguandiqitajutiBetween(String value1, String value2) {
            addCriterion("ZHENGSHUBAOGUANDIQITAJUTI between", value1, value2, "zhengshubaoguandiqitajuti");
            return (Criteria) this;
        }

        public Criteria andZhengshubaoguandiqitajutiNotBetween(String value1, String value2) {
            addCriterion("ZHENGSHUBAOGUANDIQITAJUTI not between", value1, value2, "zhengshubaoguandiqitajuti");
            return (Criteria) this;
        }

        public Criteria andJijinhuileixingIsNull() {
            addCriterion("JIJINHUILEIXING is null");
            return (Criteria) this;
        }

        public Criteria andJijinhuileixingIsNotNull() {
            addCriterion("JIJINHUILEIXING is not null");
            return (Criteria) this;
        }

        public Criteria andJijinhuileixingEqualTo(Short value) {
            addCriterion("JIJINHUILEIXING =", value, "jijinhuileixing");
            return (Criteria) this;
        }

        public Criteria andJijinhuileixingNotEqualTo(Short value) {
            addCriterion("JIJINHUILEIXING <>", value, "jijinhuileixing");
            return (Criteria) this;
        }

        public Criteria andJijinhuileixingGreaterThan(Short value) {
            addCriterion("JIJINHUILEIXING >", value, "jijinhuileixing");
            return (Criteria) this;
        }

        public Criteria andJijinhuileixingGreaterThanOrEqualTo(Short value) {
            addCriterion("JIJINHUILEIXING >=", value, "jijinhuileixing");
            return (Criteria) this;
        }

        public Criteria andJijinhuileixingLessThan(Short value) {
            addCriterion("JIJINHUILEIXING <", value, "jijinhuileixing");
            return (Criteria) this;
        }

        public Criteria andJijinhuileixingLessThanOrEqualTo(Short value) {
            addCriterion("JIJINHUILEIXING <=", value, "jijinhuileixing");
            return (Criteria) this;
        }

        public Criteria andJijinhuileixingIn(List<Short> values) {
            addCriterion("JIJINHUILEIXING in", values, "jijinhuileixing");
            return (Criteria) this;
        }

        public Criteria andJijinhuileixingNotIn(List<Short> values) {
            addCriterion("JIJINHUILEIXING not in", values, "jijinhuileixing");
            return (Criteria) this;
        }

        public Criteria andJijinhuileixingBetween(Short value1, Short value2) {
            addCriterion("JIJINHUILEIXING between", value1, value2, "jijinhuileixing");
            return (Criteria) this;
        }

        public Criteria andJijinhuileixingNotBetween(Short value1, Short value2) {
            addCriterion("JIJINHUILEIXING not between", value1, value2, "jijinhuileixing");
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

        public Criteria andFadingdaibiaorenxingmingIsNull() {
            addCriterion("FADINGDAIBIAORENXINGMING is null");
            return (Criteria) this;
        }

        public Criteria andFadingdaibiaorenxingmingIsNotNull() {
            addCriterion("FADINGDAIBIAORENXINGMING is not null");
            return (Criteria) this;
        }

        public Criteria andFadingdaibiaorenxingmingEqualTo(String value) {
            addCriterion("FADINGDAIBIAORENXINGMING =", value, "fadingdaibiaorenxingming");
            return (Criteria) this;
        }

        public Criteria andFadingdaibiaorenxingmingNotEqualTo(String value) {
            addCriterion("FADINGDAIBIAORENXINGMING <>", value, "fadingdaibiaorenxingming");
            return (Criteria) this;
        }

        public Criteria andFadingdaibiaorenxingmingGreaterThan(String value) {
            addCriterion("FADINGDAIBIAORENXINGMING >", value, "fadingdaibiaorenxingming");
            return (Criteria) this;
        }

        public Criteria andFadingdaibiaorenxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("FADINGDAIBIAORENXINGMING >=", value, "fadingdaibiaorenxingming");
            return (Criteria) this;
        }

        public Criteria andFadingdaibiaorenxingmingLessThan(String value) {
            addCriterion("FADINGDAIBIAORENXINGMING <", value, "fadingdaibiaorenxingming");
            return (Criteria) this;
        }

        public Criteria andFadingdaibiaorenxingmingLessThanOrEqualTo(String value) {
            addCriterion("FADINGDAIBIAORENXINGMING <=", value, "fadingdaibiaorenxingming");
            return (Criteria) this;
        }

        public Criteria andFadingdaibiaorenxingmingLike(String value) {
            addCriterion("FADINGDAIBIAORENXINGMING like", value, "fadingdaibiaorenxingming");
            return (Criteria) this;
        }

        public Criteria andFadingdaibiaorenxingmingNotLike(String value) {
            addCriterion("FADINGDAIBIAORENXINGMING not like", value, "fadingdaibiaorenxingming");
            return (Criteria) this;
        }

        public Criteria andFadingdaibiaorenxingmingIn(List<String> values) {
            addCriterion("FADINGDAIBIAORENXINGMING in", values, "fadingdaibiaorenxingming");
            return (Criteria) this;
        }

        public Criteria andFadingdaibiaorenxingmingNotIn(List<String> values) {
            addCriterion("FADINGDAIBIAORENXINGMING not in", values, "fadingdaibiaorenxingming");
            return (Criteria) this;
        }

        public Criteria andFadingdaibiaorenxingmingBetween(String value1, String value2) {
            addCriterion("FADINGDAIBIAORENXINGMING between", value1, value2, "fadingdaibiaorenxingming");
            return (Criteria) this;
        }

        public Criteria andFadingdaibiaorenxingmingNotBetween(String value1, String value2) {
            addCriterion("FADINGDAIBIAORENXINGMING not between", value1, value2, "fadingdaibiaorenxingming");
            return (Criteria) this;
        }

        public Criteria andGongzuobaogaopilumeitiIsNull() {
            addCriterion("GONGZUOBAOGAOPILUMEITI is null");
            return (Criteria) this;
        }

        public Criteria andGongzuobaogaopilumeitiIsNotNull() {
            addCriterion("GONGZUOBAOGAOPILUMEITI is not null");
            return (Criteria) this;
        }

        public Criteria andGongzuobaogaopilumeitiEqualTo(String value) {
            addCriterion("GONGZUOBAOGAOPILUMEITI =", value, "gongzuobaogaopilumeiti");
            return (Criteria) this;
        }

        public Criteria andGongzuobaogaopilumeitiNotEqualTo(String value) {
            addCriterion("GONGZUOBAOGAOPILUMEITI <>", value, "gongzuobaogaopilumeiti");
            return (Criteria) this;
        }

        public Criteria andGongzuobaogaopilumeitiGreaterThan(String value) {
            addCriterion("GONGZUOBAOGAOPILUMEITI >", value, "gongzuobaogaopilumeiti");
            return (Criteria) this;
        }

        public Criteria andGongzuobaogaopilumeitiGreaterThanOrEqualTo(String value) {
            addCriterion("GONGZUOBAOGAOPILUMEITI >=", value, "gongzuobaogaopilumeiti");
            return (Criteria) this;
        }

        public Criteria andGongzuobaogaopilumeitiLessThan(String value) {
            addCriterion("GONGZUOBAOGAOPILUMEITI <", value, "gongzuobaogaopilumeiti");
            return (Criteria) this;
        }

        public Criteria andGongzuobaogaopilumeitiLessThanOrEqualTo(String value) {
            addCriterion("GONGZUOBAOGAOPILUMEITI <=", value, "gongzuobaogaopilumeiti");
            return (Criteria) this;
        }

        public Criteria andGongzuobaogaopilumeitiLike(String value) {
            addCriterion("GONGZUOBAOGAOPILUMEITI like", value, "gongzuobaogaopilumeiti");
            return (Criteria) this;
        }

        public Criteria andGongzuobaogaopilumeitiNotLike(String value) {
            addCriterion("GONGZUOBAOGAOPILUMEITI not like", value, "gongzuobaogaopilumeiti");
            return (Criteria) this;
        }

        public Criteria andGongzuobaogaopilumeitiIn(List<String> values) {
            addCriterion("GONGZUOBAOGAOPILUMEITI in", values, "gongzuobaogaopilumeiti");
            return (Criteria) this;
        }

        public Criteria andGongzuobaogaopilumeitiNotIn(List<String> values) {
            addCriterion("GONGZUOBAOGAOPILUMEITI not in", values, "gongzuobaogaopilumeiti");
            return (Criteria) this;
        }

        public Criteria andGongzuobaogaopilumeitiBetween(String value1, String value2) {
            addCriterion("GONGZUOBAOGAOPILUMEITI between", value1, value2, "gongzuobaogaopilumeiti");
            return (Criteria) this;
        }

        public Criteria andGongzuobaogaopilumeitiNotBetween(String value1, String value2) {
            addCriterion("GONGZUOBAOGAOPILUMEITI not between", value1, value2, "gongzuobaogaopilumeiti");
            return (Criteria) this;
        }

        public Criteria andQitapilumeitiIsNull() {
            addCriterion("QITAPILUMEITI is null");
            return (Criteria) this;
        }

        public Criteria andQitapilumeitiIsNotNull() {
            addCriterion("QITAPILUMEITI is not null");
            return (Criteria) this;
        }

        public Criteria andQitapilumeitiEqualTo(String value) {
            addCriterion("QITAPILUMEITI =", value, "qitapilumeiti");
            return (Criteria) this;
        }

        public Criteria andQitapilumeitiNotEqualTo(String value) {
            addCriterion("QITAPILUMEITI <>", value, "qitapilumeiti");
            return (Criteria) this;
        }

        public Criteria andQitapilumeitiGreaterThan(String value) {
            addCriterion("QITAPILUMEITI >", value, "qitapilumeiti");
            return (Criteria) this;
        }

        public Criteria andQitapilumeitiGreaterThanOrEqualTo(String value) {
            addCriterion("QITAPILUMEITI >=", value, "qitapilumeiti");
            return (Criteria) this;
        }

        public Criteria andQitapilumeitiLessThan(String value) {
            addCriterion("QITAPILUMEITI <", value, "qitapilumeiti");
            return (Criteria) this;
        }

        public Criteria andQitapilumeitiLessThanOrEqualTo(String value) {
            addCriterion("QITAPILUMEITI <=", value, "qitapilumeiti");
            return (Criteria) this;
        }

        public Criteria andQitapilumeitiLike(String value) {
            addCriterion("QITAPILUMEITI like", value, "qitapilumeiti");
            return (Criteria) this;
        }

        public Criteria andQitapilumeitiNotLike(String value) {
            addCriterion("QITAPILUMEITI not like", value, "qitapilumeiti");
            return (Criteria) this;
        }

        public Criteria andQitapilumeitiIn(List<String> values) {
            addCriterion("QITAPILUMEITI in", values, "qitapilumeiti");
            return (Criteria) this;
        }

        public Criteria andQitapilumeitiNotIn(List<String> values) {
            addCriterion("QITAPILUMEITI not in", values, "qitapilumeiti");
            return (Criteria) this;
        }

        public Criteria andQitapilumeitiBetween(String value1, String value2) {
            addCriterion("QITAPILUMEITI between", value1, value2, "qitapilumeiti");
            return (Criteria) this;
        }

        public Criteria andQitapilumeitiNotBetween(String value1, String value2) {
            addCriterion("QITAPILUMEITI not between", value1, value2, "qitapilumeiti");
            return (Criteria) this;
        }

        public Criteria andEnglishnameIsNull() {
            addCriterion("ENGLISHNAME is null");
            return (Criteria) this;
        }

        public Criteria andEnglishnameIsNotNull() {
            addCriterion("ENGLISHNAME is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishnameEqualTo(String value) {
            addCriterion("ENGLISHNAME =", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameNotEqualTo(String value) {
            addCriterion("ENGLISHNAME <>", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameGreaterThan(String value) {
            addCriterion("ENGLISHNAME >", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameGreaterThanOrEqualTo(String value) {
            addCriterion("ENGLISHNAME >=", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameLessThan(String value) {
            addCriterion("ENGLISHNAME <", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameLessThanOrEqualTo(String value) {
            addCriterion("ENGLISHNAME <=", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameLike(String value) {
            addCriterion("ENGLISHNAME like", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameNotLike(String value) {
            addCriterion("ENGLISHNAME not like", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameIn(List<String> values) {
            addCriterion("ENGLISHNAME in", values, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameNotIn(List<String> values) {
            addCriterion("ENGLISHNAME not in", values, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameBetween(String value1, String value2) {
            addCriterion("ENGLISHNAME between", value1, value2, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameNotBetween(String value1, String value2) {
            addCriterion("ENGLISHNAME not between", value1, value2, "englishname");
            return (Criteria) this;
        }

        public Criteria andAuditnumIsNull() {
            addCriterion("AUDITNUM is null");
            return (Criteria) this;
        }

        public Criteria andAuditnumIsNotNull() {
            addCriterion("AUDITNUM is not null");
            return (Criteria) this;
        }

        public Criteria andAuditnumEqualTo(Integer value) {
            addCriterion("AUDITNUM =", value, "auditnum");
            return (Criteria) this;
        }

        public Criteria andAuditnumNotEqualTo(Integer value) {
            addCriterion("AUDITNUM <>", value, "auditnum");
            return (Criteria) this;
        }

        public Criteria andAuditnumGreaterThan(Integer value) {
            addCriterion("AUDITNUM >", value, "auditnum");
            return (Criteria) this;
        }

        public Criteria andAuditnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("AUDITNUM >=", value, "auditnum");
            return (Criteria) this;
        }

        public Criteria andAuditnumLessThan(Integer value) {
            addCriterion("AUDITNUM <", value, "auditnum");
            return (Criteria) this;
        }

        public Criteria andAuditnumLessThanOrEqualTo(Integer value) {
            addCriterion("AUDITNUM <=", value, "auditnum");
            return (Criteria) this;
        }

        public Criteria andAuditnumIn(List<Integer> values) {
            addCriterion("AUDITNUM in", values, "auditnum");
            return (Criteria) this;
        }

        public Criteria andAuditnumNotIn(List<Integer> values) {
            addCriterion("AUDITNUM not in", values, "auditnum");
            return (Criteria) this;
        }

        public Criteria andAuditnumBetween(Integer value1, Integer value2) {
            addCriterion("AUDITNUM between", value1, value2, "auditnum");
            return (Criteria) this;
        }

        public Criteria andAuditnumNotBetween(Integer value1, Integer value2) {
            addCriterion("AUDITNUM not between", value1, value2, "auditnum");
            return (Criteria) this;
        }

        public Criteria andInstanceSyIsNull() {
            addCriterion("INSTANCE_SY is null");
            return (Criteria) this;
        }

        public Criteria andInstanceSyIsNotNull() {
            addCriterion("INSTANCE_SY is not null");
            return (Criteria) this;
        }

        public Criteria andInstanceSyEqualTo(String value) {
            addCriterion("INSTANCE_SY =", value, "instanceSy");
            return (Criteria) this;
        }

        public Criteria andInstanceSyNotEqualTo(String value) {
            addCriterion("INSTANCE_SY <>", value, "instanceSy");
            return (Criteria) this;
        }

        public Criteria andInstanceSyGreaterThan(String value) {
            addCriterion("INSTANCE_SY >", value, "instanceSy");
            return (Criteria) this;
        }

        public Criteria andInstanceSyGreaterThanOrEqualTo(String value) {
            addCriterion("INSTANCE_SY >=", value, "instanceSy");
            return (Criteria) this;
        }

        public Criteria andInstanceSyLessThan(String value) {
            addCriterion("INSTANCE_SY <", value, "instanceSy");
            return (Criteria) this;
        }

        public Criteria andInstanceSyLessThanOrEqualTo(String value) {
            addCriterion("INSTANCE_SY <=", value, "instanceSy");
            return (Criteria) this;
        }

        public Criteria andInstanceSyLike(String value) {
            addCriterion("INSTANCE_SY like", value, "instanceSy");
            return (Criteria) this;
        }

        public Criteria andInstanceSyNotLike(String value) {
            addCriterion("INSTANCE_SY not like", value, "instanceSy");
            return (Criteria) this;
        }

        public Criteria andInstanceSyIn(List<String> values) {
            addCriterion("INSTANCE_SY in", values, "instanceSy");
            return (Criteria) this;
        }

        public Criteria andInstanceSyNotIn(List<String> values) {
            addCriterion("INSTANCE_SY not in", values, "instanceSy");
            return (Criteria) this;
        }

        public Criteria andInstanceSyBetween(String value1, String value2) {
            addCriterion("INSTANCE_SY between", value1, value2, "instanceSy");
            return (Criteria) this;
        }

        public Criteria andInstanceSyNotBetween(String value1, String value2) {
            addCriterion("INSTANCE_SY not between", value1, value2, "instanceSy");
            return (Criteria) this;
        }

        public Criteria andZhuanzhirenshuIsNull() {
            addCriterion("ZHUANZHIRENSHU is null");
            return (Criteria) this;
        }

        public Criteria andZhuanzhirenshuIsNotNull() {
            addCriterion("ZHUANZHIRENSHU is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanzhirenshuEqualTo(Long value) {
            addCriterion("ZHUANZHIRENSHU =", value, "zhuanzhirenshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhirenshuNotEqualTo(Long value) {
            addCriterion("ZHUANZHIRENSHU <>", value, "zhuanzhirenshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhirenshuGreaterThan(Long value) {
            addCriterion("ZHUANZHIRENSHU >", value, "zhuanzhirenshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhirenshuGreaterThanOrEqualTo(Long value) {
            addCriterion("ZHUANZHIRENSHU >=", value, "zhuanzhirenshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhirenshuLessThan(Long value) {
            addCriterion("ZHUANZHIRENSHU <", value, "zhuanzhirenshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhirenshuLessThanOrEqualTo(Long value) {
            addCriterion("ZHUANZHIRENSHU <=", value, "zhuanzhirenshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhirenshuIn(List<Long> values) {
            addCriterion("ZHUANZHIRENSHU in", values, "zhuanzhirenshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhirenshuNotIn(List<Long> values) {
            addCriterion("ZHUANZHIRENSHU not in", values, "zhuanzhirenshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhirenshuBetween(Long value1, Long value2) {
            addCriterion("ZHUANZHIRENSHU between", value1, value2, "zhuanzhirenshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhirenshuNotBetween(Long value1, Long value2) {
            addCriterion("ZHUANZHIRENSHU not between", value1, value2, "zhuanzhirenshu");
            return (Criteria) this;
        }

        public Criteria andDangyuanshuIsNull() {
            addCriterion("DANGYUANSHU is null");
            return (Criteria) this;
        }

        public Criteria andDangyuanshuIsNotNull() {
            addCriterion("DANGYUANSHU is not null");
            return (Criteria) this;
        }

        public Criteria andDangyuanshuEqualTo(Long value) {
            addCriterion("DANGYUANSHU =", value, "dangyuanshu");
            return (Criteria) this;
        }

        public Criteria andDangyuanshuNotEqualTo(Long value) {
            addCriterion("DANGYUANSHU <>", value, "dangyuanshu");
            return (Criteria) this;
        }

        public Criteria andDangyuanshuGreaterThan(Long value) {
            addCriterion("DANGYUANSHU >", value, "dangyuanshu");
            return (Criteria) this;
        }

        public Criteria andDangyuanshuGreaterThanOrEqualTo(Long value) {
            addCriterion("DANGYUANSHU >=", value, "dangyuanshu");
            return (Criteria) this;
        }

        public Criteria andDangyuanshuLessThan(Long value) {
            addCriterion("DANGYUANSHU <", value, "dangyuanshu");
            return (Criteria) this;
        }

        public Criteria andDangyuanshuLessThanOrEqualTo(Long value) {
            addCriterion("DANGYUANSHU <=", value, "dangyuanshu");
            return (Criteria) this;
        }

        public Criteria andDangyuanshuIn(List<Long> values) {
            addCriterion("DANGYUANSHU in", values, "dangyuanshu");
            return (Criteria) this;
        }

        public Criteria andDangyuanshuNotIn(List<Long> values) {
            addCriterion("DANGYUANSHU not in", values, "dangyuanshu");
            return (Criteria) this;
        }

        public Criteria andDangyuanshuBetween(Long value1, Long value2) {
            addCriterion("DANGYUANSHU between", value1, value2, "dangyuanshu");
            return (Criteria) this;
        }

        public Criteria andDangyuanshuNotBetween(Long value1, Long value2) {
            addCriterion("DANGYUANSHU not between", value1, value2, "dangyuanshu");
            return (Criteria) this;
        }

        public Criteria andDangjianIsNull() {
            addCriterion("DANGJIAN is null");
            return (Criteria) this;
        }

        public Criteria andDangjianIsNotNull() {
            addCriterion("DANGJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andDangjianEqualTo(Short value) {
            addCriterion("DANGJIAN =", value, "dangjian");
            return (Criteria) this;
        }

        public Criteria andDangjianNotEqualTo(Short value) {
            addCriterion("DANGJIAN <>", value, "dangjian");
            return (Criteria) this;
        }

        public Criteria andDangjianGreaterThan(Short value) {
            addCriterion("DANGJIAN >", value, "dangjian");
            return (Criteria) this;
        }

        public Criteria andDangjianGreaterThanOrEqualTo(Short value) {
            addCriterion("DANGJIAN >=", value, "dangjian");
            return (Criteria) this;
        }

        public Criteria andDangjianLessThan(Short value) {
            addCriterion("DANGJIAN <", value, "dangjian");
            return (Criteria) this;
        }

        public Criteria andDangjianLessThanOrEqualTo(Short value) {
            addCriterion("DANGJIAN <=", value, "dangjian");
            return (Criteria) this;
        }

        public Criteria andDangjianIn(List<Short> values) {
            addCriterion("DANGJIAN in", values, "dangjian");
            return (Criteria) this;
        }

        public Criteria andDangjianNotIn(List<Short> values) {
            addCriterion("DANGJIAN not in", values, "dangjian");
            return (Criteria) this;
        }

        public Criteria andDangjianBetween(Short value1, Short value2) {
            addCriterion("DANGJIAN between", value1, value2, "dangjian");
            return (Criteria) this;
        }

        public Criteria andDangjianNotBetween(Short value1, Short value2) {
            addCriterion("DANGJIAN not between", value1, value2, "dangjian");
            return (Criteria) this;
        }

        public Criteria andQuhaoyiIsNull() {
            addCriterion("QUHAOYI is null");
            return (Criteria) this;
        }

        public Criteria andQuhaoyiIsNotNull() {
            addCriterion("QUHAOYI is not null");
            return (Criteria) this;
        }

        public Criteria andQuhaoyiEqualTo(String value) {
            addCriterion("QUHAOYI =", value, "quhaoyi");
            return (Criteria) this;
        }

        public Criteria andQuhaoyiNotEqualTo(String value) {
            addCriterion("QUHAOYI <>", value, "quhaoyi");
            return (Criteria) this;
        }

        public Criteria andQuhaoyiGreaterThan(String value) {
            addCriterion("QUHAOYI >", value, "quhaoyi");
            return (Criteria) this;
        }

        public Criteria andQuhaoyiGreaterThanOrEqualTo(String value) {
            addCriterion("QUHAOYI >=", value, "quhaoyi");
            return (Criteria) this;
        }

        public Criteria andQuhaoyiLessThan(String value) {
            addCriterion("QUHAOYI <", value, "quhaoyi");
            return (Criteria) this;
        }

        public Criteria andQuhaoyiLessThanOrEqualTo(String value) {
            addCriterion("QUHAOYI <=", value, "quhaoyi");
            return (Criteria) this;
        }

        public Criteria andQuhaoyiLike(String value) {
            addCriterion("QUHAOYI like", value, "quhaoyi");
            return (Criteria) this;
        }

        public Criteria andQuhaoyiNotLike(String value) {
            addCriterion("QUHAOYI not like", value, "quhaoyi");
            return (Criteria) this;
        }

        public Criteria andQuhaoyiIn(List<String> values) {
            addCriterion("QUHAOYI in", values, "quhaoyi");
            return (Criteria) this;
        }

        public Criteria andQuhaoyiNotIn(List<String> values) {
            addCriterion("QUHAOYI not in", values, "quhaoyi");
            return (Criteria) this;
        }

        public Criteria andQuhaoyiBetween(String value1, String value2) {
            addCriterion("QUHAOYI between", value1, value2, "quhaoyi");
            return (Criteria) this;
        }

        public Criteria andQuhaoyiNotBetween(String value1, String value2) {
            addCriterion("QUHAOYI not between", value1, value2, "quhaoyi");
            return (Criteria) this;
        }

        public Criteria andQuhaoerIsNull() {
            addCriterion("QUHAOER is null");
            return (Criteria) this;
        }

        public Criteria andQuhaoerIsNotNull() {
            addCriterion("QUHAOER is not null");
            return (Criteria) this;
        }

        public Criteria andQuhaoerEqualTo(String value) {
            addCriterion("QUHAOER =", value, "quhaoer");
            return (Criteria) this;
        }

        public Criteria andQuhaoerNotEqualTo(String value) {
            addCriterion("QUHAOER <>", value, "quhaoer");
            return (Criteria) this;
        }

        public Criteria andQuhaoerGreaterThan(String value) {
            addCriterion("QUHAOER >", value, "quhaoer");
            return (Criteria) this;
        }

        public Criteria andQuhaoerGreaterThanOrEqualTo(String value) {
            addCriterion("QUHAOER >=", value, "quhaoer");
            return (Criteria) this;
        }

        public Criteria andQuhaoerLessThan(String value) {
            addCriterion("QUHAOER <", value, "quhaoer");
            return (Criteria) this;
        }

        public Criteria andQuhaoerLessThanOrEqualTo(String value) {
            addCriterion("QUHAOER <=", value, "quhaoer");
            return (Criteria) this;
        }

        public Criteria andQuhaoerLike(String value) {
            addCriterion("QUHAOER like", value, "quhaoer");
            return (Criteria) this;
        }

        public Criteria andQuhaoerNotLike(String value) {
            addCriterion("QUHAOER not like", value, "quhaoer");
            return (Criteria) this;
        }

        public Criteria andQuhaoerIn(List<String> values) {
            addCriterion("QUHAOER in", values, "quhaoer");
            return (Criteria) this;
        }

        public Criteria andQuhaoerNotIn(List<String> values) {
            addCriterion("QUHAOER not in", values, "quhaoer");
            return (Criteria) this;
        }

        public Criteria andQuhaoerBetween(String value1, String value2) {
            addCriterion("QUHAOER between", value1, value2, "quhaoer");
            return (Criteria) this;
        }

        public Criteria andQuhaoerNotBetween(String value1, String value2) {
            addCriterion("QUHAOER not between", value1, value2, "quhaoer");
            return (Criteria) this;
        }

        public Criteria andGuojiarenyuanIsNull() {
            addCriterion("GUOJIARENYUAN is null");
            return (Criteria) this;
        }

        public Criteria andGuojiarenyuanIsNotNull() {
            addCriterion("GUOJIARENYUAN is not null");
            return (Criteria) this;
        }

        public Criteria andGuojiarenyuanEqualTo(Long value) {
            addCriterion("GUOJIARENYUAN =", value, "guojiarenyuan");
            return (Criteria) this;
        }

        public Criteria andGuojiarenyuanNotEqualTo(Long value) {
            addCriterion("GUOJIARENYUAN <>", value, "guojiarenyuan");
            return (Criteria) this;
        }

        public Criteria andGuojiarenyuanGreaterThan(Long value) {
            addCriterion("GUOJIARENYUAN >", value, "guojiarenyuan");
            return (Criteria) this;
        }

        public Criteria andGuojiarenyuanGreaterThanOrEqualTo(Long value) {
            addCriterion("GUOJIARENYUAN >=", value, "guojiarenyuan");
            return (Criteria) this;
        }

        public Criteria andGuojiarenyuanLessThan(Long value) {
            addCriterion("GUOJIARENYUAN <", value, "guojiarenyuan");
            return (Criteria) this;
        }

        public Criteria andGuojiarenyuanLessThanOrEqualTo(Long value) {
            addCriterion("GUOJIARENYUAN <=", value, "guojiarenyuan");
            return (Criteria) this;
        }

        public Criteria andGuojiarenyuanIn(List<Long> values) {
            addCriterion("GUOJIARENYUAN in", values, "guojiarenyuan");
            return (Criteria) this;
        }

        public Criteria andGuojiarenyuanNotIn(List<Long> values) {
            addCriterion("GUOJIARENYUAN not in", values, "guojiarenyuan");
            return (Criteria) this;
        }

        public Criteria andGuojiarenyuanBetween(Long value1, Long value2) {
            addCriterion("GUOJIARENYUAN between", value1, value2, "guojiarenyuan");
            return (Criteria) this;
        }

        public Criteria andGuojiarenyuanNotBetween(Long value1, Long value2) {
            addCriterion("GUOJIARENYUAN not between", value1, value2, "guojiarenyuan");
            return (Criteria) this;
        }

        public Criteria andShengbujiIsNull() {
            addCriterion("SHENGBUJI is null");
            return (Criteria) this;
        }

        public Criteria andShengbujiIsNotNull() {
            addCriterion("SHENGBUJI is not null");
            return (Criteria) this;
        }

        public Criteria andShengbujiEqualTo(Long value) {
            addCriterion("SHENGBUJI =", value, "shengbuji");
            return (Criteria) this;
        }

        public Criteria andShengbujiNotEqualTo(Long value) {
            addCriterion("SHENGBUJI <>", value, "shengbuji");
            return (Criteria) this;
        }

        public Criteria andShengbujiGreaterThan(Long value) {
            addCriterion("SHENGBUJI >", value, "shengbuji");
            return (Criteria) this;
        }

        public Criteria andShengbujiGreaterThanOrEqualTo(Long value) {
            addCriterion("SHENGBUJI >=", value, "shengbuji");
            return (Criteria) this;
        }

        public Criteria andShengbujiLessThan(Long value) {
            addCriterion("SHENGBUJI <", value, "shengbuji");
            return (Criteria) this;
        }

        public Criteria andShengbujiLessThanOrEqualTo(Long value) {
            addCriterion("SHENGBUJI <=", value, "shengbuji");
            return (Criteria) this;
        }

        public Criteria andShengbujiIn(List<Long> values) {
            addCriterion("SHENGBUJI in", values, "shengbuji");
            return (Criteria) this;
        }

        public Criteria andShengbujiNotIn(List<Long> values) {
            addCriterion("SHENGBUJI not in", values, "shengbuji");
            return (Criteria) this;
        }

        public Criteria andShengbujiBetween(Long value1, Long value2) {
            addCriterion("SHENGBUJI between", value1, value2, "shengbuji");
            return (Criteria) this;
        }

        public Criteria andShengbujiNotBetween(Long value1, Long value2) {
            addCriterion("SHENGBUJI not between", value1, value2, "shengbuji");
            return (Criteria) this;
        }

        public Criteria andZongzhiIsNull() {
            addCriterion("ZONGZHI is null");
            return (Criteria) this;
        }

        public Criteria andZongzhiIsNotNull() {
            addCriterion("ZONGZHI is not null");
            return (Criteria) this;
        }

        public Criteria andZongzhiEqualTo(String value) {
            addCriterion("ZONGZHI =", value, "zongzhi");
            return (Criteria) this;
        }

        public Criteria andZongzhiNotEqualTo(String value) {
            addCriterion("ZONGZHI <>", value, "zongzhi");
            return (Criteria) this;
        }

        public Criteria andZongzhiGreaterThan(String value) {
            addCriterion("ZONGZHI >", value, "zongzhi");
            return (Criteria) this;
        }

        public Criteria andZongzhiGreaterThanOrEqualTo(String value) {
            addCriterion("ZONGZHI >=", value, "zongzhi");
            return (Criteria) this;
        }

        public Criteria andZongzhiLessThan(String value) {
            addCriterion("ZONGZHI <", value, "zongzhi");
            return (Criteria) this;
        }

        public Criteria andZongzhiLessThanOrEqualTo(String value) {
            addCriterion("ZONGZHI <=", value, "zongzhi");
            return (Criteria) this;
        }

        public Criteria andZongzhiLike(String value) {
            addCriterion("ZONGZHI like", value, "zongzhi");
            return (Criteria) this;
        }

        public Criteria andZongzhiNotLike(String value) {
            addCriterion("ZONGZHI not like", value, "zongzhi");
            return (Criteria) this;
        }

        public Criteria andZongzhiIn(List<String> values) {
            addCriterion("ZONGZHI in", values, "zongzhi");
            return (Criteria) this;
        }

        public Criteria andZongzhiNotIn(List<String> values) {
            addCriterion("ZONGZHI not in", values, "zongzhi");
            return (Criteria) this;
        }

        public Criteria andZongzhiBetween(String value1, String value2) {
            addCriterion("ZONGZHI between", value1, value2, "zongzhi");
            return (Criteria) this;
        }

        public Criteria andZongzhiNotBetween(String value1, String value2) {
            addCriterion("ZONGZHI not between", value1, value2, "zongzhi");
            return (Criteria) this;
        }

        public Criteria andNashuirenshibiehaoIsNull() {
            addCriterion("NASHUIRENSHIBIEHAO is null");
            return (Criteria) this;
        }

        public Criteria andNashuirenshibiehaoIsNotNull() {
            addCriterion("NASHUIRENSHIBIEHAO is not null");
            return (Criteria) this;
        }

        public Criteria andNashuirenshibiehaoEqualTo(String value) {
            addCriterion("NASHUIRENSHIBIEHAO =", value, "nashuirenshibiehao");
            return (Criteria) this;
        }

        public Criteria andNashuirenshibiehaoNotEqualTo(String value) {
            addCriterion("NASHUIRENSHIBIEHAO <>", value, "nashuirenshibiehao");
            return (Criteria) this;
        }

        public Criteria andNashuirenshibiehaoGreaterThan(String value) {
            addCriterion("NASHUIRENSHIBIEHAO >", value, "nashuirenshibiehao");
            return (Criteria) this;
        }

        public Criteria andNashuirenshibiehaoGreaterThanOrEqualTo(String value) {
            addCriterion("NASHUIRENSHIBIEHAO >=", value, "nashuirenshibiehao");
            return (Criteria) this;
        }

        public Criteria andNashuirenshibiehaoLessThan(String value) {
            addCriterion("NASHUIRENSHIBIEHAO <", value, "nashuirenshibiehao");
            return (Criteria) this;
        }

        public Criteria andNashuirenshibiehaoLessThanOrEqualTo(String value) {
            addCriterion("NASHUIRENSHIBIEHAO <=", value, "nashuirenshibiehao");
            return (Criteria) this;
        }

        public Criteria andNashuirenshibiehaoLike(String value) {
            addCriterion("NASHUIRENSHIBIEHAO like", value, "nashuirenshibiehao");
            return (Criteria) this;
        }

        public Criteria andNashuirenshibiehaoNotLike(String value) {
            addCriterion("NASHUIRENSHIBIEHAO not like", value, "nashuirenshibiehao");
            return (Criteria) this;
        }

        public Criteria andNashuirenshibiehaoIn(List<String> values) {
            addCriterion("NASHUIRENSHIBIEHAO in", values, "nashuirenshibiehao");
            return (Criteria) this;
        }

        public Criteria andNashuirenshibiehaoNotIn(List<String> values) {
            addCriterion("NASHUIRENSHIBIEHAO not in", values, "nashuirenshibiehao");
            return (Criteria) this;
        }

        public Criteria andNashuirenshibiehaoBetween(String value1, String value2) {
            addCriterion("NASHUIRENSHIBIEHAO between", value1, value2, "nashuirenshibiehao");
            return (Criteria) this;
        }

        public Criteria andNashuirenshibiehaoNotBetween(String value1, String value2) {
            addCriterion("NASHUIRENSHIBIEHAO not between", value1, value2, "nashuirenshibiehao");
            return (Criteria) this;
        }

        public Criteria andMishuzhangdianhuaIsNull() {
            addCriterion("MISHUZHANGDIANHUA is null");
            return (Criteria) this;
        }

        public Criteria andMishuzhangdianhuaIsNotNull() {
            addCriterion("MISHUZHANGDIANHUA is not null");
            return (Criteria) this;
        }

        public Criteria andMishuzhangdianhuaEqualTo(String value) {
            addCriterion("MISHUZHANGDIANHUA =", value, "mishuzhangdianhua");
            return (Criteria) this;
        }

        public Criteria andMishuzhangdianhuaNotEqualTo(String value) {
            addCriterion("MISHUZHANGDIANHUA <>", value, "mishuzhangdianhua");
            return (Criteria) this;
        }

        public Criteria andMishuzhangdianhuaGreaterThan(String value) {
            addCriterion("MISHUZHANGDIANHUA >", value, "mishuzhangdianhua");
            return (Criteria) this;
        }

        public Criteria andMishuzhangdianhuaGreaterThanOrEqualTo(String value) {
            addCriterion("MISHUZHANGDIANHUA >=", value, "mishuzhangdianhua");
            return (Criteria) this;
        }

        public Criteria andMishuzhangdianhuaLessThan(String value) {
            addCriterion("MISHUZHANGDIANHUA <", value, "mishuzhangdianhua");
            return (Criteria) this;
        }

        public Criteria andMishuzhangdianhuaLessThanOrEqualTo(String value) {
            addCriterion("MISHUZHANGDIANHUA <=", value, "mishuzhangdianhua");
            return (Criteria) this;
        }

        public Criteria andMishuzhangdianhuaLike(String value) {
            addCriterion("MISHUZHANGDIANHUA like", value, "mishuzhangdianhua");
            return (Criteria) this;
        }

        public Criteria andMishuzhangdianhuaNotLike(String value) {
            addCriterion("MISHUZHANGDIANHUA not like", value, "mishuzhangdianhua");
            return (Criteria) this;
        }

        public Criteria andMishuzhangdianhuaIn(List<String> values) {
            addCriterion("MISHUZHANGDIANHUA in", values, "mishuzhangdianhua");
            return (Criteria) this;
        }

        public Criteria andMishuzhangdianhuaNotIn(List<String> values) {
            addCriterion("MISHUZHANGDIANHUA not in", values, "mishuzhangdianhua");
            return (Criteria) this;
        }

        public Criteria andMishuzhangdianhuaBetween(String value1, String value2) {
            addCriterion("MISHUZHANGDIANHUA between", value1, value2, "mishuzhangdianhua");
            return (Criteria) this;
        }

        public Criteria andMishuzhangdianhuaNotBetween(String value1, String value2) {
            addCriterion("MISHUZHANGDIANHUA not between", value1, value2, "mishuzhangdianhua");
            return (Criteria) this;
        }

        public Criteria andMishuzhangyidongdianhuaIsNull() {
            addCriterion("MISHUZHANGYIDONGDIANHUA is null");
            return (Criteria) this;
        }

        public Criteria andMishuzhangyidongdianhuaIsNotNull() {
            addCriterion("MISHUZHANGYIDONGDIANHUA is not null");
            return (Criteria) this;
        }

        public Criteria andMishuzhangyidongdianhuaEqualTo(String value) {
            addCriterion("MISHUZHANGYIDONGDIANHUA =", value, "mishuzhangyidongdianhua");
            return (Criteria) this;
        }

        public Criteria andMishuzhangyidongdianhuaNotEqualTo(String value) {
            addCriterion("MISHUZHANGYIDONGDIANHUA <>", value, "mishuzhangyidongdianhua");
            return (Criteria) this;
        }

        public Criteria andMishuzhangyidongdianhuaGreaterThan(String value) {
            addCriterion("MISHUZHANGYIDONGDIANHUA >", value, "mishuzhangyidongdianhua");
            return (Criteria) this;
        }

        public Criteria andMishuzhangyidongdianhuaGreaterThanOrEqualTo(String value) {
            addCriterion("MISHUZHANGYIDONGDIANHUA >=", value, "mishuzhangyidongdianhua");
            return (Criteria) this;
        }

        public Criteria andMishuzhangyidongdianhuaLessThan(String value) {
            addCriterion("MISHUZHANGYIDONGDIANHUA <", value, "mishuzhangyidongdianhua");
            return (Criteria) this;
        }

        public Criteria andMishuzhangyidongdianhuaLessThanOrEqualTo(String value) {
            addCriterion("MISHUZHANGYIDONGDIANHUA <=", value, "mishuzhangyidongdianhua");
            return (Criteria) this;
        }

        public Criteria andMishuzhangyidongdianhuaLike(String value) {
            addCriterion("MISHUZHANGYIDONGDIANHUA like", value, "mishuzhangyidongdianhua");
            return (Criteria) this;
        }

        public Criteria andMishuzhangyidongdianhuaNotLike(String value) {
            addCriterion("MISHUZHANGYIDONGDIANHUA not like", value, "mishuzhangyidongdianhua");
            return (Criteria) this;
        }

        public Criteria andMishuzhangyidongdianhuaIn(List<String> values) {
            addCriterion("MISHUZHANGYIDONGDIANHUA in", values, "mishuzhangyidongdianhua");
            return (Criteria) this;
        }

        public Criteria andMishuzhangyidongdianhuaNotIn(List<String> values) {
            addCriterion("MISHUZHANGYIDONGDIANHUA not in", values, "mishuzhangyidongdianhua");
            return (Criteria) this;
        }

        public Criteria andMishuzhangyidongdianhuaBetween(String value1, String value2) {
            addCriterion("MISHUZHANGYIDONGDIANHUA between", value1, value2, "mishuzhangyidongdianhua");
            return (Criteria) this;
        }

        public Criteria andMishuzhangyidongdianhuaNotBetween(String value1, String value2) {
            addCriterion("MISHUZHANGYIDONGDIANHUA not between", value1, value2, "mishuzhangyidongdianhua");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingIsNull() {
            addCriterion("LIANXIRENXINGMING is null");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingIsNotNull() {
            addCriterion("LIANXIRENXINGMING is not null");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingEqualTo(String value) {
            addCriterion("LIANXIRENXINGMING =", value, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingNotEqualTo(String value) {
            addCriterion("LIANXIRENXINGMING <>", value, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingGreaterThan(String value) {
            addCriterion("LIANXIRENXINGMING >", value, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("LIANXIRENXINGMING >=", value, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingLessThan(String value) {
            addCriterion("LIANXIRENXINGMING <", value, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingLessThanOrEqualTo(String value) {
            addCriterion("LIANXIRENXINGMING <=", value, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingLike(String value) {
            addCriterion("LIANXIRENXINGMING like", value, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingNotLike(String value) {
            addCriterion("LIANXIRENXINGMING not like", value, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingIn(List<String> values) {
            addCriterion("LIANXIRENXINGMING in", values, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingNotIn(List<String> values) {
            addCriterion("LIANXIRENXINGMING not in", values, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingBetween(String value1, String value2) {
            addCriterion("LIANXIRENXINGMING between", value1, value2, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingNotBetween(String value1, String value2) {
            addCriterion("LIANXIRENXINGMING not between", value1, value2, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenzhiwuIsNull() {
            addCriterion("LIANXIRENZHIWU is null");
            return (Criteria) this;
        }

        public Criteria andLianxirenzhiwuIsNotNull() {
            addCriterion("LIANXIRENZHIWU is not null");
            return (Criteria) this;
        }

        public Criteria andLianxirenzhiwuEqualTo(String value) {
            addCriterion("LIANXIRENZHIWU =", value, "lianxirenzhiwu");
            return (Criteria) this;
        }

        public Criteria andLianxirenzhiwuNotEqualTo(String value) {
            addCriterion("LIANXIRENZHIWU <>", value, "lianxirenzhiwu");
            return (Criteria) this;
        }

        public Criteria andLianxirenzhiwuGreaterThan(String value) {
            addCriterion("LIANXIRENZHIWU >", value, "lianxirenzhiwu");
            return (Criteria) this;
        }

        public Criteria andLianxirenzhiwuGreaterThanOrEqualTo(String value) {
            addCriterion("LIANXIRENZHIWU >=", value, "lianxirenzhiwu");
            return (Criteria) this;
        }

        public Criteria andLianxirenzhiwuLessThan(String value) {
            addCriterion("LIANXIRENZHIWU <", value, "lianxirenzhiwu");
            return (Criteria) this;
        }

        public Criteria andLianxirenzhiwuLessThanOrEqualTo(String value) {
            addCriterion("LIANXIRENZHIWU <=", value, "lianxirenzhiwu");
            return (Criteria) this;
        }

        public Criteria andLianxirenzhiwuLike(String value) {
            addCriterion("LIANXIRENZHIWU like", value, "lianxirenzhiwu");
            return (Criteria) this;
        }

        public Criteria andLianxirenzhiwuNotLike(String value) {
            addCriterion("LIANXIRENZHIWU not like", value, "lianxirenzhiwu");
            return (Criteria) this;
        }

        public Criteria andLianxirenzhiwuIn(List<String> values) {
            addCriterion("LIANXIRENZHIWU in", values, "lianxirenzhiwu");
            return (Criteria) this;
        }

        public Criteria andLianxirenzhiwuNotIn(List<String> values) {
            addCriterion("LIANXIRENZHIWU not in", values, "lianxirenzhiwu");
            return (Criteria) this;
        }

        public Criteria andLianxirenzhiwuBetween(String value1, String value2) {
            addCriterion("LIANXIRENZHIWU between", value1, value2, "lianxirenzhiwu");
            return (Criteria) this;
        }

        public Criteria andLianxirenzhiwuNotBetween(String value1, String value2) {
            addCriterion("LIANXIRENZHIWU not between", value1, value2, "lianxirenzhiwu");
            return (Criteria) this;
        }

        public Criteria andYidongdianhuaIsNull() {
            addCriterion("YIDONGDIANHUA is null");
            return (Criteria) this;
        }

        public Criteria andYidongdianhuaIsNotNull() {
            addCriterion("YIDONGDIANHUA is not null");
            return (Criteria) this;
        }

        public Criteria andYidongdianhuaEqualTo(String value) {
            addCriterion("YIDONGDIANHUA =", value, "yidongdianhua");
            return (Criteria) this;
        }

        public Criteria andYidongdianhuaNotEqualTo(String value) {
            addCriterion("YIDONGDIANHUA <>", value, "yidongdianhua");
            return (Criteria) this;
        }

        public Criteria andYidongdianhuaGreaterThan(String value) {
            addCriterion("YIDONGDIANHUA >", value, "yidongdianhua");
            return (Criteria) this;
        }

        public Criteria andYidongdianhuaGreaterThanOrEqualTo(String value) {
            addCriterion("YIDONGDIANHUA >=", value, "yidongdianhua");
            return (Criteria) this;
        }

        public Criteria andYidongdianhuaLessThan(String value) {
            addCriterion("YIDONGDIANHUA <", value, "yidongdianhua");
            return (Criteria) this;
        }

        public Criteria andYidongdianhuaLessThanOrEqualTo(String value) {
            addCriterion("YIDONGDIANHUA <=", value, "yidongdianhua");
            return (Criteria) this;
        }

        public Criteria andYidongdianhuaLike(String value) {
            addCriterion("YIDONGDIANHUA like", value, "yidongdianhua");
            return (Criteria) this;
        }

        public Criteria andYidongdianhuaNotLike(String value) {
            addCriterion("YIDONGDIANHUA not like", value, "yidongdianhua");
            return (Criteria) this;
        }

        public Criteria andYidongdianhuaIn(List<String> values) {
            addCriterion("YIDONGDIANHUA in", values, "yidongdianhua");
            return (Criteria) this;
        }

        public Criteria andYidongdianhuaNotIn(List<String> values) {
            addCriterion("YIDONGDIANHUA not in", values, "yidongdianhua");
            return (Criteria) this;
        }

        public Criteria andYidongdianhuaBetween(String value1, String value2) {
            addCriterion("YIDONGDIANHUA between", value1, value2, "yidongdianhua");
            return (Criteria) this;
        }

        public Criteria andYidongdianhuaNotBetween(String value1, String value2) {
            addCriterion("YIDONGDIANHUA not between", value1, value2, "yidongdianhua");
            return (Criteria) this;
        }

        public Criteria andZhuanxiangjijinshueIsNull() {
            addCriterion("ZHUANXIANGJIJINSHUE is null");
            return (Criteria) this;
        }

        public Criteria andZhuanxiangjijinshueIsNotNull() {
            addCriterion("ZHUANXIANGJIJINSHUE is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanxiangjijinshueEqualTo(BigDecimal value) {
            addCriterion("ZHUANXIANGJIJINSHUE =", value, "zhuanxiangjijinshue");
            return (Criteria) this;
        }

        public Criteria andZhuanxiangjijinshueNotEqualTo(BigDecimal value) {
            addCriterion("ZHUANXIANGJIJINSHUE <>", value, "zhuanxiangjijinshue");
            return (Criteria) this;
        }

        public Criteria andZhuanxiangjijinshueGreaterThan(BigDecimal value) {
            addCriterion("ZHUANXIANGJIJINSHUE >", value, "zhuanxiangjijinshue");
            return (Criteria) this;
        }

        public Criteria andZhuanxiangjijinshueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHUANXIANGJIJINSHUE >=", value, "zhuanxiangjijinshue");
            return (Criteria) this;
        }

        public Criteria andZhuanxiangjijinshueLessThan(BigDecimal value) {
            addCriterion("ZHUANXIANGJIJINSHUE <", value, "zhuanxiangjijinshue");
            return (Criteria) this;
        }

        public Criteria andZhuanxiangjijinshueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHUANXIANGJIJINSHUE <=", value, "zhuanxiangjijinshue");
            return (Criteria) this;
        }

        public Criteria andZhuanxiangjijinshueIn(List<BigDecimal> values) {
            addCriterion("ZHUANXIANGJIJINSHUE in", values, "zhuanxiangjijinshue");
            return (Criteria) this;
        }

        public Criteria andZhuanxiangjijinshueNotIn(List<BigDecimal> values) {
            addCriterion("ZHUANXIANGJIJINSHUE not in", values, "zhuanxiangjijinshue");
            return (Criteria) this;
        }

        public Criteria andZhuanxiangjijinshueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHUANXIANGJIJINSHUE between", value1, value2, "zhuanxiangjijinshue");
            return (Criteria) this;
        }

        public Criteria andZhuanxiangjijinshueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHUANXIANGJIJINSHUE not between", value1, value2, "zhuanxiangjijinshue");
            return (Criteria) this;
        }

        public Criteria andShifouquIsNull() {
            addCriterion("SHIFOUQU is null");
            return (Criteria) this;
        }

        public Criteria andShifouquIsNotNull() {
            addCriterion("SHIFOUQU is not null");
            return (Criteria) this;
        }

        public Criteria andShifouquEqualTo(Short value) {
            addCriterion("SHIFOUQU =", value, "shifouqu");
            return (Criteria) this;
        }

        public Criteria andShifouquNotEqualTo(Short value) {
            addCriterion("SHIFOUQU <>", value, "shifouqu");
            return (Criteria) this;
        }

        public Criteria andShifouquGreaterThan(Short value) {
            addCriterion("SHIFOUQU >", value, "shifouqu");
            return (Criteria) this;
        }

        public Criteria andShifouquGreaterThanOrEqualTo(Short value) {
            addCriterion("SHIFOUQU >=", value, "shifouqu");
            return (Criteria) this;
        }

        public Criteria andShifouquLessThan(Short value) {
            addCriterion("SHIFOUQU <", value, "shifouqu");
            return (Criteria) this;
        }

        public Criteria andShifouquLessThanOrEqualTo(Short value) {
            addCriterion("SHIFOUQU <=", value, "shifouqu");
            return (Criteria) this;
        }

        public Criteria andShifouquIn(List<Short> values) {
            addCriterion("SHIFOUQU in", values, "shifouqu");
            return (Criteria) this;
        }

        public Criteria andShifouquNotIn(List<Short> values) {
            addCriterion("SHIFOUQU not in", values, "shifouqu");
            return (Criteria) this;
        }

        public Criteria andShifouquBetween(Short value1, Short value2) {
            addCriterion("SHIFOUQU between", value1, value2, "shifouqu");
            return (Criteria) this;
        }

        public Criteria andShifouquNotBetween(Short value1, Short value2) {
            addCriterion("SHIFOUQU not between", value1, value2, "shifouqu");
            return (Criteria) this;
        }

        public Criteria andShifouqu1IsNull() {
            addCriterion("SHIFOUQU1 is null");
            return (Criteria) this;
        }

        public Criteria andShifouqu1IsNotNull() {
            addCriterion("SHIFOUQU1 is not null");
            return (Criteria) this;
        }

        public Criteria andShifouqu1EqualTo(Short value) {
            addCriterion("SHIFOUQU1 =", value, "shifouqu1");
            return (Criteria) this;
        }

        public Criteria andShifouqu1NotEqualTo(Short value) {
            addCriterion("SHIFOUQU1 <>", value, "shifouqu1");
            return (Criteria) this;
        }

        public Criteria andShifouqu1GreaterThan(Short value) {
            addCriterion("SHIFOUQU1 >", value, "shifouqu1");
            return (Criteria) this;
        }

        public Criteria andShifouqu1GreaterThanOrEqualTo(Short value) {
            addCriterion("SHIFOUQU1 >=", value, "shifouqu1");
            return (Criteria) this;
        }

        public Criteria andShifouqu1LessThan(Short value) {
            addCriterion("SHIFOUQU1 <", value, "shifouqu1");
            return (Criteria) this;
        }

        public Criteria andShifouqu1LessThanOrEqualTo(Short value) {
            addCriterion("SHIFOUQU1 <=", value, "shifouqu1");
            return (Criteria) this;
        }

        public Criteria andShifouqu1In(List<Short> values) {
            addCriterion("SHIFOUQU1 in", values, "shifouqu1");
            return (Criteria) this;
        }

        public Criteria andShifouqu1NotIn(List<Short> values) {
            addCriterion("SHIFOUQU1 not in", values, "shifouqu1");
            return (Criteria) this;
        }

        public Criteria andShifouqu1Between(Short value1, Short value2) {
            addCriterion("SHIFOUQU1 between", value1, value2, "shifouqu1");
            return (Criteria) this;
        }

        public Criteria andShifouqu1NotBetween(Short value1, Short value2) {
            addCriterion("SHIFOUQU1 not between", value1, value2, "shifouqu1");
            return (Criteria) this;
        }

        public Criteria andShifouqu2IsNull() {
            addCriterion("SHIFOUQU2 is null");
            return (Criteria) this;
        }

        public Criteria andShifouqu2IsNotNull() {
            addCriterion("SHIFOUQU2 is not null");
            return (Criteria) this;
        }

        public Criteria andShifouqu2EqualTo(Short value) {
            addCriterion("SHIFOUQU2 =", value, "shifouqu2");
            return (Criteria) this;
        }

        public Criteria andShifouqu2NotEqualTo(Short value) {
            addCriterion("SHIFOUQU2 <>", value, "shifouqu2");
            return (Criteria) this;
        }

        public Criteria andShifouqu2GreaterThan(Short value) {
            addCriterion("SHIFOUQU2 >", value, "shifouqu2");
            return (Criteria) this;
        }

        public Criteria andShifouqu2GreaterThanOrEqualTo(Short value) {
            addCriterion("SHIFOUQU2 >=", value, "shifouqu2");
            return (Criteria) this;
        }

        public Criteria andShifouqu2LessThan(Short value) {
            addCriterion("SHIFOUQU2 <", value, "shifouqu2");
            return (Criteria) this;
        }

        public Criteria andShifouqu2LessThanOrEqualTo(Short value) {
            addCriterion("SHIFOUQU2 <=", value, "shifouqu2");
            return (Criteria) this;
        }

        public Criteria andShifouqu2In(List<Short> values) {
            addCriterion("SHIFOUQU2 in", values, "shifouqu2");
            return (Criteria) this;
        }

        public Criteria andShifouqu2NotIn(List<Short> values) {
            addCriterion("SHIFOUQU2 not in", values, "shifouqu2");
            return (Criteria) this;
        }

        public Criteria andShifouqu2Between(Short value1, Short value2) {
            addCriterion("SHIFOUQU2 between", value1, value2, "shifouqu2");
            return (Criteria) this;
        }

        public Criteria andShifouqu2NotBetween(Short value1, Short value2) {
            addCriterion("SHIFOUQU2 not between", value1, value2, "shifouqu2");
            return (Criteria) this;
        }

        public Criteria andYouhuishijianIsNull() {
            addCriterion("YOUHUISHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andYouhuishijianIsNotNull() {
            addCriterion("YOUHUISHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andYouhuishijianEqualTo(Date value) {
            addCriterion("YOUHUISHIJIAN =", value, "youhuishijian");
            return (Criteria) this;
        }

        public Criteria andYouhuishijianNotEqualTo(Date value) {
            addCriterion("YOUHUISHIJIAN <>", value, "youhuishijian");
            return (Criteria) this;
        }

        public Criteria andYouhuishijianGreaterThan(Date value) {
            addCriterion("YOUHUISHIJIAN >", value, "youhuishijian");
            return (Criteria) this;
        }

        public Criteria andYouhuishijianGreaterThanOrEqualTo(Date value) {
            addCriterion("YOUHUISHIJIAN >=", value, "youhuishijian");
            return (Criteria) this;
        }

        public Criteria andYouhuishijianLessThan(Date value) {
            addCriterion("YOUHUISHIJIAN <", value, "youhuishijian");
            return (Criteria) this;
        }

        public Criteria andYouhuishijianLessThanOrEqualTo(Date value) {
            addCriterion("YOUHUISHIJIAN <=", value, "youhuishijian");
            return (Criteria) this;
        }

        public Criteria andYouhuishijianIn(List<Date> values) {
            addCriterion("YOUHUISHIJIAN in", values, "youhuishijian");
            return (Criteria) this;
        }

        public Criteria andYouhuishijianNotIn(List<Date> values) {
            addCriterion("YOUHUISHIJIAN not in", values, "youhuishijian");
            return (Criteria) this;
        }

        public Criteria andYouhuishijianBetween(Date value1, Date value2) {
            addCriterion("YOUHUISHIJIAN between", value1, value2, "youhuishijian");
            return (Criteria) this;
        }

        public Criteria andYouhuishijianNotBetween(Date value1, Date value2) {
            addCriterion("YOUHUISHIJIAN not between", value1, value2, "youhuishijian");
            return (Criteria) this;
        }

        public Criteria andYouhuishijian1IsNull() {
            addCriterion("YOUHUISHIJIAN1 is null");
            return (Criteria) this;
        }

        public Criteria andYouhuishijian1IsNotNull() {
            addCriterion("YOUHUISHIJIAN1 is not null");
            return (Criteria) this;
        }

        public Criteria andYouhuishijian1EqualTo(Date value) {
            addCriterion("YOUHUISHIJIAN1 =", value, "youhuishijian1");
            return (Criteria) this;
        }

        public Criteria andYouhuishijian1NotEqualTo(Date value) {
            addCriterion("YOUHUISHIJIAN1 <>", value, "youhuishijian1");
            return (Criteria) this;
        }

        public Criteria andYouhuishijian1GreaterThan(Date value) {
            addCriterion("YOUHUISHIJIAN1 >", value, "youhuishijian1");
            return (Criteria) this;
        }

        public Criteria andYouhuishijian1GreaterThanOrEqualTo(Date value) {
            addCriterion("YOUHUISHIJIAN1 >=", value, "youhuishijian1");
            return (Criteria) this;
        }

        public Criteria andYouhuishijian1LessThan(Date value) {
            addCriterion("YOUHUISHIJIAN1 <", value, "youhuishijian1");
            return (Criteria) this;
        }

        public Criteria andYouhuishijian1LessThanOrEqualTo(Date value) {
            addCriterion("YOUHUISHIJIAN1 <=", value, "youhuishijian1");
            return (Criteria) this;
        }

        public Criteria andYouhuishijian1In(List<Date> values) {
            addCriterion("YOUHUISHIJIAN1 in", values, "youhuishijian1");
            return (Criteria) this;
        }

        public Criteria andYouhuishijian1NotIn(List<Date> values) {
            addCriterion("YOUHUISHIJIAN1 not in", values, "youhuishijian1");
            return (Criteria) this;
        }

        public Criteria andYouhuishijian1Between(Date value1, Date value2) {
            addCriterion("YOUHUISHIJIAN1 between", value1, value2, "youhuishijian1");
            return (Criteria) this;
        }

        public Criteria andYouhuishijian1NotBetween(Date value1, Date value2) {
            addCriterion("YOUHUISHIJIAN1 not between", value1, value2, "youhuishijian1");
            return (Criteria) this;
        }

        public Criteria andYouhuishijian2IsNull() {
            addCriterion("YOUHUISHIJIAN2 is null");
            return (Criteria) this;
        }

        public Criteria andYouhuishijian2IsNotNull() {
            addCriterion("YOUHUISHIJIAN2 is not null");
            return (Criteria) this;
        }

        public Criteria andYouhuishijian2EqualTo(Date value) {
            addCriterion("YOUHUISHIJIAN2 =", value, "youhuishijian2");
            return (Criteria) this;
        }

        public Criteria andYouhuishijian2NotEqualTo(Date value) {
            addCriterion("YOUHUISHIJIAN2 <>", value, "youhuishijian2");
            return (Criteria) this;
        }

        public Criteria andYouhuishijian2GreaterThan(Date value) {
            addCriterion("YOUHUISHIJIAN2 >", value, "youhuishijian2");
            return (Criteria) this;
        }

        public Criteria andYouhuishijian2GreaterThanOrEqualTo(Date value) {
            addCriterion("YOUHUISHIJIAN2 >=", value, "youhuishijian2");
            return (Criteria) this;
        }

        public Criteria andYouhuishijian2LessThan(Date value) {
            addCriterion("YOUHUISHIJIAN2 <", value, "youhuishijian2");
            return (Criteria) this;
        }

        public Criteria andYouhuishijian2LessThanOrEqualTo(Date value) {
            addCriterion("YOUHUISHIJIAN2 <=", value, "youhuishijian2");
            return (Criteria) this;
        }

        public Criteria andYouhuishijian2In(List<Date> values) {
            addCriterion("YOUHUISHIJIAN2 in", values, "youhuishijian2");
            return (Criteria) this;
        }

        public Criteria andYouhuishijian2NotIn(List<Date> values) {
            addCriterion("YOUHUISHIJIAN2 not in", values, "youhuishijian2");
            return (Criteria) this;
        }

        public Criteria andYouhuishijian2Between(Date value1, Date value2) {
            addCriterion("YOUHUISHIJIAN2 between", value1, value2, "youhuishijian2");
            return (Criteria) this;
        }

        public Criteria andYouhuishijian2NotBetween(Date value1, Date value2) {
            addCriterion("YOUHUISHIJIAN2 not between", value1, value2, "youhuishijian2");
            return (Criteria) this;
        }

        public Criteria andPizhuibumenIsNull() {
            addCriterion("PIZHUIBUMEN is null");
            return (Criteria) this;
        }

        public Criteria andPizhuibumenIsNotNull() {
            addCriterion("PIZHUIBUMEN is not null");
            return (Criteria) this;
        }

        public Criteria andPizhuibumenEqualTo(String value) {
            addCriterion("PIZHUIBUMEN =", value, "pizhuibumen");
            return (Criteria) this;
        }

        public Criteria andPizhuibumenNotEqualTo(String value) {
            addCriterion("PIZHUIBUMEN <>", value, "pizhuibumen");
            return (Criteria) this;
        }

        public Criteria andPizhuibumenGreaterThan(String value) {
            addCriterion("PIZHUIBUMEN >", value, "pizhuibumen");
            return (Criteria) this;
        }

        public Criteria andPizhuibumenGreaterThanOrEqualTo(String value) {
            addCriterion("PIZHUIBUMEN >=", value, "pizhuibumen");
            return (Criteria) this;
        }

        public Criteria andPizhuibumenLessThan(String value) {
            addCriterion("PIZHUIBUMEN <", value, "pizhuibumen");
            return (Criteria) this;
        }

        public Criteria andPizhuibumenLessThanOrEqualTo(String value) {
            addCriterion("PIZHUIBUMEN <=", value, "pizhuibumen");
            return (Criteria) this;
        }

        public Criteria andPizhuibumenLike(String value) {
            addCriterion("PIZHUIBUMEN like", value, "pizhuibumen");
            return (Criteria) this;
        }

        public Criteria andPizhuibumenNotLike(String value) {
            addCriterion("PIZHUIBUMEN not like", value, "pizhuibumen");
            return (Criteria) this;
        }

        public Criteria andPizhuibumenIn(List<String> values) {
            addCriterion("PIZHUIBUMEN in", values, "pizhuibumen");
            return (Criteria) this;
        }

        public Criteria andPizhuibumenNotIn(List<String> values) {
            addCriterion("PIZHUIBUMEN not in", values, "pizhuibumen");
            return (Criteria) this;
        }

        public Criteria andPizhuibumenBetween(String value1, String value2) {
            addCriterion("PIZHUIBUMEN between", value1, value2, "pizhuibumen");
            return (Criteria) this;
        }

        public Criteria andPizhuibumenNotBetween(String value1, String value2) {
            addCriterion("PIZHUIBUMEN not between", value1, value2, "pizhuibumen");
            return (Criteria) this;
        }

        public Criteria andPizhuibumen1IsNull() {
            addCriterion("PIZHUIBUMEN1 is null");
            return (Criteria) this;
        }

        public Criteria andPizhuibumen1IsNotNull() {
            addCriterion("PIZHUIBUMEN1 is not null");
            return (Criteria) this;
        }

        public Criteria andPizhuibumen1EqualTo(String value) {
            addCriterion("PIZHUIBUMEN1 =", value, "pizhuibumen1");
            return (Criteria) this;
        }

        public Criteria andPizhuibumen1NotEqualTo(String value) {
            addCriterion("PIZHUIBUMEN1 <>", value, "pizhuibumen1");
            return (Criteria) this;
        }

        public Criteria andPizhuibumen1GreaterThan(String value) {
            addCriterion("PIZHUIBUMEN1 >", value, "pizhuibumen1");
            return (Criteria) this;
        }

        public Criteria andPizhuibumen1GreaterThanOrEqualTo(String value) {
            addCriterion("PIZHUIBUMEN1 >=", value, "pizhuibumen1");
            return (Criteria) this;
        }

        public Criteria andPizhuibumen1LessThan(String value) {
            addCriterion("PIZHUIBUMEN1 <", value, "pizhuibumen1");
            return (Criteria) this;
        }

        public Criteria andPizhuibumen1LessThanOrEqualTo(String value) {
            addCriterion("PIZHUIBUMEN1 <=", value, "pizhuibumen1");
            return (Criteria) this;
        }

        public Criteria andPizhuibumen1Like(String value) {
            addCriterion("PIZHUIBUMEN1 like", value, "pizhuibumen1");
            return (Criteria) this;
        }

        public Criteria andPizhuibumen1NotLike(String value) {
            addCriterion("PIZHUIBUMEN1 not like", value, "pizhuibumen1");
            return (Criteria) this;
        }

        public Criteria andPizhuibumen1In(List<String> values) {
            addCriterion("PIZHUIBUMEN1 in", values, "pizhuibumen1");
            return (Criteria) this;
        }

        public Criteria andPizhuibumen1NotIn(List<String> values) {
            addCriterion("PIZHUIBUMEN1 not in", values, "pizhuibumen1");
            return (Criteria) this;
        }

        public Criteria andPizhuibumen1Between(String value1, String value2) {
            addCriterion("PIZHUIBUMEN1 between", value1, value2, "pizhuibumen1");
            return (Criteria) this;
        }

        public Criteria andPizhuibumen1NotBetween(String value1, String value2) {
            addCriterion("PIZHUIBUMEN1 not between", value1, value2, "pizhuibumen1");
            return (Criteria) this;
        }

        public Criteria andPizhuibumen2IsNull() {
            addCriterion("PIZHUIBUMEN2 is null");
            return (Criteria) this;
        }

        public Criteria andPizhuibumen2IsNotNull() {
            addCriterion("PIZHUIBUMEN2 is not null");
            return (Criteria) this;
        }

        public Criteria andPizhuibumen2EqualTo(String value) {
            addCriterion("PIZHUIBUMEN2 =", value, "pizhuibumen2");
            return (Criteria) this;
        }

        public Criteria andPizhuibumen2NotEqualTo(String value) {
            addCriterion("PIZHUIBUMEN2 <>", value, "pizhuibumen2");
            return (Criteria) this;
        }

        public Criteria andPizhuibumen2GreaterThan(String value) {
            addCriterion("PIZHUIBUMEN2 >", value, "pizhuibumen2");
            return (Criteria) this;
        }

        public Criteria andPizhuibumen2GreaterThanOrEqualTo(String value) {
            addCriterion("PIZHUIBUMEN2 >=", value, "pizhuibumen2");
            return (Criteria) this;
        }

        public Criteria andPizhuibumen2LessThan(String value) {
            addCriterion("PIZHUIBUMEN2 <", value, "pizhuibumen2");
            return (Criteria) this;
        }

        public Criteria andPizhuibumen2LessThanOrEqualTo(String value) {
            addCriterion("PIZHUIBUMEN2 <=", value, "pizhuibumen2");
            return (Criteria) this;
        }

        public Criteria andPizhuibumen2Like(String value) {
            addCriterion("PIZHUIBUMEN2 like", value, "pizhuibumen2");
            return (Criteria) this;
        }

        public Criteria andPizhuibumen2NotLike(String value) {
            addCriterion("PIZHUIBUMEN2 not like", value, "pizhuibumen2");
            return (Criteria) this;
        }

        public Criteria andPizhuibumen2In(List<String> values) {
            addCriterion("PIZHUIBUMEN2 in", values, "pizhuibumen2");
            return (Criteria) this;
        }

        public Criteria andPizhuibumen2NotIn(List<String> values) {
            addCriterion("PIZHUIBUMEN2 not in", values, "pizhuibumen2");
            return (Criteria) this;
        }

        public Criteria andPizhuibumen2Between(String value1, String value2) {
            addCriterion("PIZHUIBUMEN2 between", value1, value2, "pizhuibumen2");
            return (Criteria) this;
        }

        public Criteria andPizhuibumen2NotBetween(String value1, String value2) {
            addCriterion("PIZHUIBUMEN2 not between", value1, value2, "pizhuibumen2");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhaoIsNull() {
            addCriterion("PIZHUIWENHAO is null");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhaoIsNotNull() {
            addCriterion("PIZHUIWENHAO is not null");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhaoEqualTo(String value) {
            addCriterion("PIZHUIWENHAO =", value, "pizhuiwenhao");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhaoNotEqualTo(String value) {
            addCriterion("PIZHUIWENHAO <>", value, "pizhuiwenhao");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhaoGreaterThan(String value) {
            addCriterion("PIZHUIWENHAO >", value, "pizhuiwenhao");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhaoGreaterThanOrEqualTo(String value) {
            addCriterion("PIZHUIWENHAO >=", value, "pizhuiwenhao");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhaoLessThan(String value) {
            addCriterion("PIZHUIWENHAO <", value, "pizhuiwenhao");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhaoLessThanOrEqualTo(String value) {
            addCriterion("PIZHUIWENHAO <=", value, "pizhuiwenhao");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhaoLike(String value) {
            addCriterion("PIZHUIWENHAO like", value, "pizhuiwenhao");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhaoNotLike(String value) {
            addCriterion("PIZHUIWENHAO not like", value, "pizhuiwenhao");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhaoIn(List<String> values) {
            addCriterion("PIZHUIWENHAO in", values, "pizhuiwenhao");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhaoNotIn(List<String> values) {
            addCriterion("PIZHUIWENHAO not in", values, "pizhuiwenhao");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhaoBetween(String value1, String value2) {
            addCriterion("PIZHUIWENHAO between", value1, value2, "pizhuiwenhao");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhaoNotBetween(String value1, String value2) {
            addCriterion("PIZHUIWENHAO not between", value1, value2, "pizhuiwenhao");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhao1IsNull() {
            addCriterion("PIZHUIWENHAO1 is null");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhao1IsNotNull() {
            addCriterion("PIZHUIWENHAO1 is not null");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhao1EqualTo(String value) {
            addCriterion("PIZHUIWENHAO1 =", value, "pizhuiwenhao1");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhao1NotEqualTo(String value) {
            addCriterion("PIZHUIWENHAO1 <>", value, "pizhuiwenhao1");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhao1GreaterThan(String value) {
            addCriterion("PIZHUIWENHAO1 >", value, "pizhuiwenhao1");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhao1GreaterThanOrEqualTo(String value) {
            addCriterion("PIZHUIWENHAO1 >=", value, "pizhuiwenhao1");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhao1LessThan(String value) {
            addCriterion("PIZHUIWENHAO1 <", value, "pizhuiwenhao1");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhao1LessThanOrEqualTo(String value) {
            addCriterion("PIZHUIWENHAO1 <=", value, "pizhuiwenhao1");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhao1Like(String value) {
            addCriterion("PIZHUIWENHAO1 like", value, "pizhuiwenhao1");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhao1NotLike(String value) {
            addCriterion("PIZHUIWENHAO1 not like", value, "pizhuiwenhao1");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhao1In(List<String> values) {
            addCriterion("PIZHUIWENHAO1 in", values, "pizhuiwenhao1");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhao1NotIn(List<String> values) {
            addCriterion("PIZHUIWENHAO1 not in", values, "pizhuiwenhao1");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhao1Between(String value1, String value2) {
            addCriterion("PIZHUIWENHAO1 between", value1, value2, "pizhuiwenhao1");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhao1NotBetween(String value1, String value2) {
            addCriterion("PIZHUIWENHAO1 not between", value1, value2, "pizhuiwenhao1");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhao2IsNull() {
            addCriterion("PIZHUIWENHAO2 is null");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhao2IsNotNull() {
            addCriterion("PIZHUIWENHAO2 is not null");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhao2EqualTo(String value) {
            addCriterion("PIZHUIWENHAO2 =", value, "pizhuiwenhao2");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhao2NotEqualTo(String value) {
            addCriterion("PIZHUIWENHAO2 <>", value, "pizhuiwenhao2");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhao2GreaterThan(String value) {
            addCriterion("PIZHUIWENHAO2 >", value, "pizhuiwenhao2");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhao2GreaterThanOrEqualTo(String value) {
            addCriterion("PIZHUIWENHAO2 >=", value, "pizhuiwenhao2");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhao2LessThan(String value) {
            addCriterion("PIZHUIWENHAO2 <", value, "pizhuiwenhao2");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhao2LessThanOrEqualTo(String value) {
            addCriterion("PIZHUIWENHAO2 <=", value, "pizhuiwenhao2");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhao2Like(String value) {
            addCriterion("PIZHUIWENHAO2 like", value, "pizhuiwenhao2");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhao2NotLike(String value) {
            addCriterion("PIZHUIWENHAO2 not like", value, "pizhuiwenhao2");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhao2In(List<String> values) {
            addCriterion("PIZHUIWENHAO2 in", values, "pizhuiwenhao2");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhao2NotIn(List<String> values) {
            addCriterion("PIZHUIWENHAO2 not in", values, "pizhuiwenhao2");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhao2Between(String value1, String value2) {
            addCriterion("PIZHUIWENHAO2 between", value1, value2, "pizhuiwenhao2");
            return (Criteria) this;
        }

        public Criteria andPizhuiwenhao2NotBetween(String value1, String value2) {
            addCriterion("PIZHUIWENHAO2 not between", value1, value2, "pizhuiwenhao2");
            return (Criteria) this;
        }

        public Criteria andShiwusuomingchengIsNull() {
            addCriterion("SHIWUSUOMINGCHENG is null");
            return (Criteria) this;
        }

        public Criteria andShiwusuomingchengIsNotNull() {
            addCriterion("SHIWUSUOMINGCHENG is not null");
            return (Criteria) this;
        }

        public Criteria andShiwusuomingchengEqualTo(String value) {
            addCriterion("SHIWUSUOMINGCHENG =", value, "shiwusuomingcheng");
            return (Criteria) this;
        }

        public Criteria andShiwusuomingchengNotEqualTo(String value) {
            addCriterion("SHIWUSUOMINGCHENG <>", value, "shiwusuomingcheng");
            return (Criteria) this;
        }

        public Criteria andShiwusuomingchengGreaterThan(String value) {
            addCriterion("SHIWUSUOMINGCHENG >", value, "shiwusuomingcheng");
            return (Criteria) this;
        }

        public Criteria andShiwusuomingchengGreaterThanOrEqualTo(String value) {
            addCriterion("SHIWUSUOMINGCHENG >=", value, "shiwusuomingcheng");
            return (Criteria) this;
        }

        public Criteria andShiwusuomingchengLessThan(String value) {
            addCriterion("SHIWUSUOMINGCHENG <", value, "shiwusuomingcheng");
            return (Criteria) this;
        }

        public Criteria andShiwusuomingchengLessThanOrEqualTo(String value) {
            addCriterion("SHIWUSUOMINGCHENG <=", value, "shiwusuomingcheng");
            return (Criteria) this;
        }

        public Criteria andShiwusuomingchengLike(String value) {
            addCriterion("SHIWUSUOMINGCHENG like", value, "shiwusuomingcheng");
            return (Criteria) this;
        }

        public Criteria andShiwusuomingchengNotLike(String value) {
            addCriterion("SHIWUSUOMINGCHENG not like", value, "shiwusuomingcheng");
            return (Criteria) this;
        }

        public Criteria andShiwusuomingchengIn(List<String> values) {
            addCriterion("SHIWUSUOMINGCHENG in", values, "shiwusuomingcheng");
            return (Criteria) this;
        }

        public Criteria andShiwusuomingchengNotIn(List<String> values) {
            addCriterion("SHIWUSUOMINGCHENG not in", values, "shiwusuomingcheng");
            return (Criteria) this;
        }

        public Criteria andShiwusuomingchengBetween(String value1, String value2) {
            addCriterion("SHIWUSUOMINGCHENG between", value1, value2, "shiwusuomingcheng");
            return (Criteria) this;
        }

        public Criteria andShiwusuomingchengNotBetween(String value1, String value2) {
            addCriterion("SHIWUSUOMINGCHENG not between", value1, value2, "shiwusuomingcheng");
            return (Criteria) this;
        }

        public Criteria andShenjiyijianleixingIsNull() {
            addCriterion("SHENJIYIJIANLEIXING is null");
            return (Criteria) this;
        }

        public Criteria andShenjiyijianleixingIsNotNull() {
            addCriterion("SHENJIYIJIANLEIXING is not null");
            return (Criteria) this;
        }

        public Criteria andShenjiyijianleixingEqualTo(String value) {
            addCriterion("SHENJIYIJIANLEIXING =", value, "shenjiyijianleixing");
            return (Criteria) this;
        }

        public Criteria andShenjiyijianleixingNotEqualTo(String value) {
            addCriterion("SHENJIYIJIANLEIXING <>", value, "shenjiyijianleixing");
            return (Criteria) this;
        }

        public Criteria andShenjiyijianleixingGreaterThan(String value) {
            addCriterion("SHENJIYIJIANLEIXING >", value, "shenjiyijianleixing");
            return (Criteria) this;
        }

        public Criteria andShenjiyijianleixingGreaterThanOrEqualTo(String value) {
            addCriterion("SHENJIYIJIANLEIXING >=", value, "shenjiyijianleixing");
            return (Criteria) this;
        }

        public Criteria andShenjiyijianleixingLessThan(String value) {
            addCriterion("SHENJIYIJIANLEIXING <", value, "shenjiyijianleixing");
            return (Criteria) this;
        }

        public Criteria andShenjiyijianleixingLessThanOrEqualTo(String value) {
            addCriterion("SHENJIYIJIANLEIXING <=", value, "shenjiyijianleixing");
            return (Criteria) this;
        }

        public Criteria andShenjiyijianleixingLike(String value) {
            addCriterion("SHENJIYIJIANLEIXING like", value, "shenjiyijianleixing");
            return (Criteria) this;
        }

        public Criteria andShenjiyijianleixingNotLike(String value) {
            addCriterion("SHENJIYIJIANLEIXING not like", value, "shenjiyijianleixing");
            return (Criteria) this;
        }

        public Criteria andShenjiyijianleixingIn(List<String> values) {
            addCriterion("SHENJIYIJIANLEIXING in", values, "shenjiyijianleixing");
            return (Criteria) this;
        }

        public Criteria andShenjiyijianleixingNotIn(List<String> values) {
            addCriterion("SHENJIYIJIANLEIXING not in", values, "shenjiyijianleixing");
            return (Criteria) this;
        }

        public Criteria andShenjiyijianleixingBetween(String value1, String value2) {
            addCriterion("SHENJIYIJIANLEIXING between", value1, value2, "shenjiyijianleixing");
            return (Criteria) this;
        }

        public Criteria andShenjiyijianleixingNotBetween(String value1, String value2) {
            addCriterion("SHENJIYIJIANLEIXING not between", value1, value2, "shenjiyijianleixing");
            return (Criteria) this;
        }

        public Criteria andBaogaoriqiIsNull() {
            addCriterion("BAOGAORIQI is null");
            return (Criteria) this;
        }

        public Criteria andBaogaoriqiIsNotNull() {
            addCriterion("BAOGAORIQI is not null");
            return (Criteria) this;
        }

        public Criteria andBaogaoriqiEqualTo(Date value) {
            addCriterion("BAOGAORIQI =", value, "baogaoriqi");
            return (Criteria) this;
        }

        public Criteria andBaogaoriqiNotEqualTo(Date value) {
            addCriterion("BAOGAORIQI <>", value, "baogaoriqi");
            return (Criteria) this;
        }

        public Criteria andBaogaoriqiGreaterThan(Date value) {
            addCriterion("BAOGAORIQI >", value, "baogaoriqi");
            return (Criteria) this;
        }

        public Criteria andBaogaoriqiGreaterThanOrEqualTo(Date value) {
            addCriterion("BAOGAORIQI >=", value, "baogaoriqi");
            return (Criteria) this;
        }

        public Criteria andBaogaoriqiLessThan(Date value) {
            addCriterion("BAOGAORIQI <", value, "baogaoriqi");
            return (Criteria) this;
        }

        public Criteria andBaogaoriqiLessThanOrEqualTo(Date value) {
            addCriterion("BAOGAORIQI <=", value, "baogaoriqi");
            return (Criteria) this;
        }

        public Criteria andBaogaoriqiIn(List<Date> values) {
            addCriterion("BAOGAORIQI in", values, "baogaoriqi");
            return (Criteria) this;
        }

        public Criteria andBaogaoriqiNotIn(List<Date> values) {
            addCriterion("BAOGAORIQI not in", values, "baogaoriqi");
            return (Criteria) this;
        }

        public Criteria andBaogaoriqiBetween(Date value1, Date value2) {
            addCriterion("BAOGAORIQI between", value1, value2, "baogaoriqi");
            return (Criteria) this;
        }

        public Criteria andBaogaoriqiNotBetween(Date value1, Date value2) {
            addCriterion("BAOGAORIQI not between", value1, value2, "baogaoriqi");
            return (Criteria) this;
        }

        public Criteria andBaogaobianhaoIsNull() {
            addCriterion("BAOGAOBIANHAO is null");
            return (Criteria) this;
        }

        public Criteria andBaogaobianhaoIsNotNull() {
            addCriterion("BAOGAOBIANHAO is not null");
            return (Criteria) this;
        }

        public Criteria andBaogaobianhaoEqualTo(String value) {
            addCriterion("BAOGAOBIANHAO =", value, "baogaobianhao");
            return (Criteria) this;
        }

        public Criteria andBaogaobianhaoNotEqualTo(String value) {
            addCriterion("BAOGAOBIANHAO <>", value, "baogaobianhao");
            return (Criteria) this;
        }

        public Criteria andBaogaobianhaoGreaterThan(String value) {
            addCriterion("BAOGAOBIANHAO >", value, "baogaobianhao");
            return (Criteria) this;
        }

        public Criteria andBaogaobianhaoGreaterThanOrEqualTo(String value) {
            addCriterion("BAOGAOBIANHAO >=", value, "baogaobianhao");
            return (Criteria) this;
        }

        public Criteria andBaogaobianhaoLessThan(String value) {
            addCriterion("BAOGAOBIANHAO <", value, "baogaobianhao");
            return (Criteria) this;
        }

        public Criteria andBaogaobianhaoLessThanOrEqualTo(String value) {
            addCriterion("BAOGAOBIANHAO <=", value, "baogaobianhao");
            return (Criteria) this;
        }

        public Criteria andBaogaobianhaoLike(String value) {
            addCriterion("BAOGAOBIANHAO like", value, "baogaobianhao");
            return (Criteria) this;
        }

        public Criteria andBaogaobianhaoNotLike(String value) {
            addCriterion("BAOGAOBIANHAO not like", value, "baogaobianhao");
            return (Criteria) this;
        }

        public Criteria andBaogaobianhaoIn(List<String> values) {
            addCriterion("BAOGAOBIANHAO in", values, "baogaobianhao");
            return (Criteria) this;
        }

        public Criteria andBaogaobianhaoNotIn(List<String> values) {
            addCriterion("BAOGAOBIANHAO not in", values, "baogaobianhao");
            return (Criteria) this;
        }

        public Criteria andBaogaobianhaoBetween(String value1, String value2) {
            addCriterion("BAOGAOBIANHAO between", value1, value2, "baogaobianhao");
            return (Criteria) this;
        }

        public Criteria andBaogaobianhaoNotBetween(String value1, String value2) {
            addCriterion("BAOGAOBIANHAO not between", value1, value2, "baogaobianhao");
            return (Criteria) this;
        }

        public Criteria andQitaIsNull() {
            addCriterion("QITA is null");
            return (Criteria) this;
        }

        public Criteria andQitaIsNotNull() {
            addCriterion("QITA is not null");
            return (Criteria) this;
        }

        public Criteria andQitaEqualTo(String value) {
            addCriterion("QITA =", value, "qita");
            return (Criteria) this;
        }

        public Criteria andQitaNotEqualTo(String value) {
            addCriterion("QITA <>", value, "qita");
            return (Criteria) this;
        }

        public Criteria andQitaGreaterThan(String value) {
            addCriterion("QITA >", value, "qita");
            return (Criteria) this;
        }

        public Criteria andQitaGreaterThanOrEqualTo(String value) {
            addCriterion("QITA >=", value, "qita");
            return (Criteria) this;
        }

        public Criteria andQitaLessThan(String value) {
            addCriterion("QITA <", value, "qita");
            return (Criteria) this;
        }

        public Criteria andQitaLessThanOrEqualTo(String value) {
            addCriterion("QITA <=", value, "qita");
            return (Criteria) this;
        }

        public Criteria andQitaLike(String value) {
            addCriterion("QITA like", value, "qita");
            return (Criteria) this;
        }

        public Criteria andQitaNotLike(String value) {
            addCriterion("QITA not like", value, "qita");
            return (Criteria) this;
        }

        public Criteria andQitaIn(List<String> values) {
            addCriterion("QITA in", values, "qita");
            return (Criteria) this;
        }

        public Criteria andQitaNotIn(List<String> values) {
            addCriterion("QITA not in", values, "qita");
            return (Criteria) this;
        }

        public Criteria andQitaBetween(String value1, String value2) {
            addCriterion("QITA between", value1, value2, "qita");
            return (Criteria) this;
        }

        public Criteria andQitaNotBetween(String value1, String value2) {
            addCriterion("QITA not between", value1, value2, "qita");
            return (Criteria) this;
        }

        public Criteria andShifoucishanIsNull() {
            addCriterion("SHIFOUCISHAN is null");
            return (Criteria) this;
        }

        public Criteria andShifoucishanIsNotNull() {
            addCriterion("SHIFOUCISHAN is not null");
            return (Criteria) this;
        }

        public Criteria andShifoucishanEqualTo(Short value) {
            addCriterion("SHIFOUCISHAN =", value, "shifoucishan");
            return (Criteria) this;
        }

        public Criteria andShifoucishanNotEqualTo(Short value) {
            addCriterion("SHIFOUCISHAN <>", value, "shifoucishan");
            return (Criteria) this;
        }

        public Criteria andShifoucishanGreaterThan(Short value) {
            addCriterion("SHIFOUCISHAN >", value, "shifoucishan");
            return (Criteria) this;
        }

        public Criteria andShifoucishanGreaterThanOrEqualTo(Short value) {
            addCriterion("SHIFOUCISHAN >=", value, "shifoucishan");
            return (Criteria) this;
        }

        public Criteria andShifoucishanLessThan(Short value) {
            addCriterion("SHIFOUCISHAN <", value, "shifoucishan");
            return (Criteria) this;
        }

        public Criteria andShifoucishanLessThanOrEqualTo(Short value) {
            addCriterion("SHIFOUCISHAN <=", value, "shifoucishan");
            return (Criteria) this;
        }

        public Criteria andShifoucishanIn(List<Short> values) {
            addCriterion("SHIFOUCISHAN in", values, "shifoucishan");
            return (Criteria) this;
        }

        public Criteria andShifoucishanNotIn(List<Short> values) {
            addCriterion("SHIFOUCISHAN not in", values, "shifoucishan");
            return (Criteria) this;
        }

        public Criteria andShifoucishanBetween(Short value1, Short value2) {
            addCriterion("SHIFOUCISHAN between", value1, value2, "shifoucishan");
            return (Criteria) this;
        }

        public Criteria andShifoucishanNotBetween(Short value1, Short value2) {
            addCriterion("SHIFOUCISHAN not between", value1, value2, "shifoucishan");
            return (Criteria) this;
        }

        public Criteria andShifoumujuanIsNull() {
            addCriterion("SHIFOUMUJUAN is null");
            return (Criteria) this;
        }

        public Criteria andShifoumujuanIsNotNull() {
            addCriterion("SHIFOUMUJUAN is not null");
            return (Criteria) this;
        }

        public Criteria andShifoumujuanEqualTo(Short value) {
            addCriterion("SHIFOUMUJUAN =", value, "shifoumujuan");
            return (Criteria) this;
        }

        public Criteria andShifoumujuanNotEqualTo(Short value) {
            addCriterion("SHIFOUMUJUAN <>", value, "shifoumujuan");
            return (Criteria) this;
        }

        public Criteria andShifoumujuanGreaterThan(Short value) {
            addCriterion("SHIFOUMUJUAN >", value, "shifoumujuan");
            return (Criteria) this;
        }

        public Criteria andShifoumujuanGreaterThanOrEqualTo(Short value) {
            addCriterion("SHIFOUMUJUAN >=", value, "shifoumujuan");
            return (Criteria) this;
        }

        public Criteria andShifoumujuanLessThan(Short value) {
            addCriterion("SHIFOUMUJUAN <", value, "shifoumujuan");
            return (Criteria) this;
        }

        public Criteria andShifoumujuanLessThanOrEqualTo(Short value) {
            addCriterion("SHIFOUMUJUAN <=", value, "shifoumujuan");
            return (Criteria) this;
        }

        public Criteria andShifoumujuanIn(List<Short> values) {
            addCriterion("SHIFOUMUJUAN in", values, "shifoumujuan");
            return (Criteria) this;
        }

        public Criteria andShifoumujuanNotIn(List<Short> values) {
            addCriterion("SHIFOUMUJUAN not in", values, "shifoumujuan");
            return (Criteria) this;
        }

        public Criteria andShifoumujuanBetween(Short value1, Short value2) {
            addCriterion("SHIFOUMUJUAN between", value1, value2, "shifoumujuan");
            return (Criteria) this;
        }

        public Criteria andShifoumujuanNotBetween(Short value1, Short value2) {
            addCriterion("SHIFOUMUJUAN not between", value1, value2, "shifoumujuan");
            return (Criteria) this;
        }

        public Criteria andCishandateIsNull() {
            addCriterion("CISHANDATE is null");
            return (Criteria) this;
        }

        public Criteria andCishandateIsNotNull() {
            addCriterion("CISHANDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCishandateEqualTo(Date value) {
            addCriterion("CISHANDATE =", value, "cishandate");
            return (Criteria) this;
        }

        public Criteria andCishandateNotEqualTo(Date value) {
            addCriterion("CISHANDATE <>", value, "cishandate");
            return (Criteria) this;
        }

        public Criteria andCishandateGreaterThan(Date value) {
            addCriterion("CISHANDATE >", value, "cishandate");
            return (Criteria) this;
        }

        public Criteria andCishandateGreaterThanOrEqualTo(Date value) {
            addCriterion("CISHANDATE >=", value, "cishandate");
            return (Criteria) this;
        }

        public Criteria andCishandateLessThan(Date value) {
            addCriterion("CISHANDATE <", value, "cishandate");
            return (Criteria) this;
        }

        public Criteria andCishandateLessThanOrEqualTo(Date value) {
            addCriterion("CISHANDATE <=", value, "cishandate");
            return (Criteria) this;
        }

        public Criteria andCishandateIn(List<Date> values) {
            addCriterion("CISHANDATE in", values, "cishandate");
            return (Criteria) this;
        }

        public Criteria andCishandateNotIn(List<Date> values) {
            addCriterion("CISHANDATE not in", values, "cishandate");
            return (Criteria) this;
        }

        public Criteria andCishandateBetween(Date value1, Date value2) {
            addCriterion("CISHANDATE between", value1, value2, "cishandate");
            return (Criteria) this;
        }

        public Criteria andCishandateNotBetween(Date value1, Date value2) {
            addCriterion("CISHANDATE not between", value1, value2, "cishandate");
            return (Criteria) this;
        }

        public Criteria andMujuandateIsNull() {
            addCriterion("MUJUANDATE is null");
            return (Criteria) this;
        }

        public Criteria andMujuandateIsNotNull() {
            addCriterion("MUJUANDATE is not null");
            return (Criteria) this;
        }

        public Criteria andMujuandateEqualTo(Date value) {
            addCriterion("MUJUANDATE =", value, "mujuandate");
            return (Criteria) this;
        }

        public Criteria andMujuandateNotEqualTo(Date value) {
            addCriterion("MUJUANDATE <>", value, "mujuandate");
            return (Criteria) this;
        }

        public Criteria andMujuandateGreaterThan(Date value) {
            addCriterion("MUJUANDATE >", value, "mujuandate");
            return (Criteria) this;
        }

        public Criteria andMujuandateGreaterThanOrEqualTo(Date value) {
            addCriterion("MUJUANDATE >=", value, "mujuandate");
            return (Criteria) this;
        }

        public Criteria andMujuandateLessThan(Date value) {
            addCriterion("MUJUANDATE <", value, "mujuandate");
            return (Criteria) this;
        }

        public Criteria andMujuandateLessThanOrEqualTo(Date value) {
            addCriterion("MUJUANDATE <=", value, "mujuandate");
            return (Criteria) this;
        }

        public Criteria andMujuandateIn(List<Date> values) {
            addCriterion("MUJUANDATE in", values, "mujuandate");
            return (Criteria) this;
        }

        public Criteria andMujuandateNotIn(List<Date> values) {
            addCriterion("MUJUANDATE not in", values, "mujuandate");
            return (Criteria) this;
        }

        public Criteria andMujuandateBetween(Date value1, Date value2) {
            addCriterion("MUJUANDATE between", value1, value2, "mujuandate");
            return (Criteria) this;
        }

        public Criteria andMujuandateNotBetween(Date value1, Date value2) {
            addCriterion("MUJUANDATE not between", value1, value2, "mujuandate");
            return (Criteria) this;
        }

        public Criteria andSpokenameIsNull() {
            addCriterion("SPOKENAME is null");
            return (Criteria) this;
        }

        public Criteria andSpokenameIsNotNull() {
            addCriterion("SPOKENAME is not null");
            return (Criteria) this;
        }

        public Criteria andSpokenameEqualTo(String value) {
            addCriterion("SPOKENAME =", value, "spokename");
            return (Criteria) this;
        }

        public Criteria andSpokenameNotEqualTo(String value) {
            addCriterion("SPOKENAME <>", value, "spokename");
            return (Criteria) this;
        }

        public Criteria andSpokenameGreaterThan(String value) {
            addCriterion("SPOKENAME >", value, "spokename");
            return (Criteria) this;
        }

        public Criteria andSpokenameGreaterThanOrEqualTo(String value) {
            addCriterion("SPOKENAME >=", value, "spokename");
            return (Criteria) this;
        }

        public Criteria andSpokenameLessThan(String value) {
            addCriterion("SPOKENAME <", value, "spokename");
            return (Criteria) this;
        }

        public Criteria andSpokenameLessThanOrEqualTo(String value) {
            addCriterion("SPOKENAME <=", value, "spokename");
            return (Criteria) this;
        }

        public Criteria andSpokenameLike(String value) {
            addCriterion("SPOKENAME like", value, "spokename");
            return (Criteria) this;
        }

        public Criteria andSpokenameNotLike(String value) {
            addCriterion("SPOKENAME not like", value, "spokename");
            return (Criteria) this;
        }

        public Criteria andSpokenameIn(List<String> values) {
            addCriterion("SPOKENAME in", values, "spokename");
            return (Criteria) this;
        }

        public Criteria andSpokenameNotIn(List<String> values) {
            addCriterion("SPOKENAME not in", values, "spokename");
            return (Criteria) this;
        }

        public Criteria andSpokenameBetween(String value1, String value2) {
            addCriterion("SPOKENAME between", value1, value2, "spokename");
            return (Criteria) this;
        }

        public Criteria andSpokenameNotBetween(String value1, String value2) {
            addCriterion("SPOKENAME not between", value1, value2, "spokename");
            return (Criteria) this;
        }

        public Criteria andSpoketelIsNull() {
            addCriterion("SPOKETEL is null");
            return (Criteria) this;
        }

        public Criteria andSpoketelIsNotNull() {
            addCriterion("SPOKETEL is not null");
            return (Criteria) this;
        }

        public Criteria andSpoketelEqualTo(String value) {
            addCriterion("SPOKETEL =", value, "spoketel");
            return (Criteria) this;
        }

        public Criteria andSpoketelNotEqualTo(String value) {
            addCriterion("SPOKETEL <>", value, "spoketel");
            return (Criteria) this;
        }

        public Criteria andSpoketelGreaterThan(String value) {
            addCriterion("SPOKETEL >", value, "spoketel");
            return (Criteria) this;
        }

        public Criteria andSpoketelGreaterThanOrEqualTo(String value) {
            addCriterion("SPOKETEL >=", value, "spoketel");
            return (Criteria) this;
        }

        public Criteria andSpoketelLessThan(String value) {
            addCriterion("SPOKETEL <", value, "spoketel");
            return (Criteria) this;
        }

        public Criteria andSpoketelLessThanOrEqualTo(String value) {
            addCriterion("SPOKETEL <=", value, "spoketel");
            return (Criteria) this;
        }

        public Criteria andSpoketelLike(String value) {
            addCriterion("SPOKETEL like", value, "spoketel");
            return (Criteria) this;
        }

        public Criteria andSpoketelNotLike(String value) {
            addCriterion("SPOKETEL not like", value, "spoketel");
            return (Criteria) this;
        }

        public Criteria andSpoketelIn(List<String> values) {
            addCriterion("SPOKETEL in", values, "spoketel");
            return (Criteria) this;
        }

        public Criteria andSpoketelNotIn(List<String> values) {
            addCriterion("SPOKETEL not in", values, "spoketel");
            return (Criteria) this;
        }

        public Criteria andSpoketelBetween(String value1, String value2) {
            addCriterion("SPOKETEL between", value1, value2, "spoketel");
            return (Criteria) this;
        }

        public Criteria andSpoketelNotBetween(String value1, String value2) {
            addCriterion("SPOKETEL not between", value1, value2, "spoketel");
            return (Criteria) this;
        }

        public Criteria andSpokephoneIsNull() {
            addCriterion("SPOKEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andSpokephoneIsNotNull() {
            addCriterion("SPOKEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andSpokephoneEqualTo(String value) {
            addCriterion("SPOKEPHONE =", value, "spokephone");
            return (Criteria) this;
        }

        public Criteria andSpokephoneNotEqualTo(String value) {
            addCriterion("SPOKEPHONE <>", value, "spokephone");
            return (Criteria) this;
        }

        public Criteria andSpokephoneGreaterThan(String value) {
            addCriterion("SPOKEPHONE >", value, "spokephone");
            return (Criteria) this;
        }

        public Criteria andSpokephoneGreaterThanOrEqualTo(String value) {
            addCriterion("SPOKEPHONE >=", value, "spokephone");
            return (Criteria) this;
        }

        public Criteria andSpokephoneLessThan(String value) {
            addCriterion("SPOKEPHONE <", value, "spokephone");
            return (Criteria) this;
        }

        public Criteria andSpokephoneLessThanOrEqualTo(String value) {
            addCriterion("SPOKEPHONE <=", value, "spokephone");
            return (Criteria) this;
        }

        public Criteria andSpokephoneLike(String value) {
            addCriterion("SPOKEPHONE like", value, "spokephone");
            return (Criteria) this;
        }

        public Criteria andSpokephoneNotLike(String value) {
            addCriterion("SPOKEPHONE not like", value, "spokephone");
            return (Criteria) this;
        }

        public Criteria andSpokephoneIn(List<String> values) {
            addCriterion("SPOKEPHONE in", values, "spokephone");
            return (Criteria) this;
        }

        public Criteria andSpokephoneNotIn(List<String> values) {
            addCriterion("SPOKEPHONE not in", values, "spokephone");
            return (Criteria) this;
        }

        public Criteria andSpokephoneBetween(String value1, String value2) {
            addCriterion("SPOKEPHONE between", value1, value2, "spokephone");
            return (Criteria) this;
        }

        public Criteria andSpokephoneNotBetween(String value1, String value2) {
            addCriterion("SPOKEPHONE not between", value1, value2, "spokephone");
            return (Criteria) this;
        }

        public Criteria andSpokemailIsNull() {
            addCriterion("SPOKEMAIL is null");
            return (Criteria) this;
        }

        public Criteria andSpokemailIsNotNull() {
            addCriterion("SPOKEMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andSpokemailEqualTo(String value) {
            addCriterion("SPOKEMAIL =", value, "spokemail");
            return (Criteria) this;
        }

        public Criteria andSpokemailNotEqualTo(String value) {
            addCriterion("SPOKEMAIL <>", value, "spokemail");
            return (Criteria) this;
        }

        public Criteria andSpokemailGreaterThan(String value) {
            addCriterion("SPOKEMAIL >", value, "spokemail");
            return (Criteria) this;
        }

        public Criteria andSpokemailGreaterThanOrEqualTo(String value) {
            addCriterion("SPOKEMAIL >=", value, "spokemail");
            return (Criteria) this;
        }

        public Criteria andSpokemailLessThan(String value) {
            addCriterion("SPOKEMAIL <", value, "spokemail");
            return (Criteria) this;
        }

        public Criteria andSpokemailLessThanOrEqualTo(String value) {
            addCriterion("SPOKEMAIL <=", value, "spokemail");
            return (Criteria) this;
        }

        public Criteria andSpokemailLike(String value) {
            addCriterion("SPOKEMAIL like", value, "spokemail");
            return (Criteria) this;
        }

        public Criteria andSpokemailNotLike(String value) {
            addCriterion("SPOKEMAIL not like", value, "spokemail");
            return (Criteria) this;
        }

        public Criteria andSpokemailIn(List<String> values) {
            addCriterion("SPOKEMAIL in", values, "spokemail");
            return (Criteria) this;
        }

        public Criteria andSpokemailNotIn(List<String> values) {
            addCriterion("SPOKEMAIL not in", values, "spokemail");
            return (Criteria) this;
        }

        public Criteria andSpokemailBetween(String value1, String value2) {
            addCriterion("SPOKEMAIL between", value1, value2, "spokemail");
            return (Criteria) this;
        }

        public Criteria andSpokemailNotBetween(String value1, String value2) {
            addCriterion("SPOKEMAIL not between", value1, value2, "spokemail");
            return (Criteria) this;
        }

        public Criteria andWebchatpublicIsNull() {
            addCriterion("WEBCHATPUBLIC is null");
            return (Criteria) this;
        }

        public Criteria andWebchatpublicIsNotNull() {
            addCriterion("WEBCHATPUBLIC is not null");
            return (Criteria) this;
        }

        public Criteria andWebchatpublicEqualTo(String value) {
            addCriterion("WEBCHATPUBLIC =", value, "webchatpublic");
            return (Criteria) this;
        }

        public Criteria andWebchatpublicNotEqualTo(String value) {
            addCriterion("WEBCHATPUBLIC <>", value, "webchatpublic");
            return (Criteria) this;
        }

        public Criteria andWebchatpublicGreaterThan(String value) {
            addCriterion("WEBCHATPUBLIC >", value, "webchatpublic");
            return (Criteria) this;
        }

        public Criteria andWebchatpublicGreaterThanOrEqualTo(String value) {
            addCriterion("WEBCHATPUBLIC >=", value, "webchatpublic");
            return (Criteria) this;
        }

        public Criteria andWebchatpublicLessThan(String value) {
            addCriterion("WEBCHATPUBLIC <", value, "webchatpublic");
            return (Criteria) this;
        }

        public Criteria andWebchatpublicLessThanOrEqualTo(String value) {
            addCriterion("WEBCHATPUBLIC <=", value, "webchatpublic");
            return (Criteria) this;
        }

        public Criteria andWebchatpublicLike(String value) {
            addCriterion("WEBCHATPUBLIC like", value, "webchatpublic");
            return (Criteria) this;
        }

        public Criteria andWebchatpublicNotLike(String value) {
            addCriterion("WEBCHATPUBLIC not like", value, "webchatpublic");
            return (Criteria) this;
        }

        public Criteria andWebchatpublicIn(List<String> values) {
            addCriterion("WEBCHATPUBLIC in", values, "webchatpublic");
            return (Criteria) this;
        }

        public Criteria andWebchatpublicNotIn(List<String> values) {
            addCriterion("WEBCHATPUBLIC not in", values, "webchatpublic");
            return (Criteria) this;
        }

        public Criteria andWebchatpublicBetween(String value1, String value2) {
            addCriterion("WEBCHATPUBLIC between", value1, value2, "webchatpublic");
            return (Criteria) this;
        }

        public Criteria andWebchatpublicNotBetween(String value1, String value2) {
            addCriterion("WEBCHATPUBLIC not between", value1, value2, "webchatpublic");
            return (Criteria) this;
        }

        public Criteria andLianxirentelIsNull() {
            addCriterion("LIANXIRENTEL is null");
            return (Criteria) this;
        }

        public Criteria andLianxirentelIsNotNull() {
            addCriterion("LIANXIRENTEL is not null");
            return (Criteria) this;
        }

        public Criteria andLianxirentelEqualTo(String value) {
            addCriterion("LIANXIRENTEL =", value, "lianxirentel");
            return (Criteria) this;
        }

        public Criteria andLianxirentelNotEqualTo(String value) {
            addCriterion("LIANXIRENTEL <>", value, "lianxirentel");
            return (Criteria) this;
        }

        public Criteria andLianxirentelGreaterThan(String value) {
            addCriterion("LIANXIRENTEL >", value, "lianxirentel");
            return (Criteria) this;
        }

        public Criteria andLianxirentelGreaterThanOrEqualTo(String value) {
            addCriterion("LIANXIRENTEL >=", value, "lianxirentel");
            return (Criteria) this;
        }

        public Criteria andLianxirentelLessThan(String value) {
            addCriterion("LIANXIRENTEL <", value, "lianxirentel");
            return (Criteria) this;
        }

        public Criteria andLianxirentelLessThanOrEqualTo(String value) {
            addCriterion("LIANXIRENTEL <=", value, "lianxirentel");
            return (Criteria) this;
        }

        public Criteria andLianxirentelLike(String value) {
            addCriterion("LIANXIRENTEL like", value, "lianxirentel");
            return (Criteria) this;
        }

        public Criteria andLianxirentelNotLike(String value) {
            addCriterion("LIANXIRENTEL not like", value, "lianxirentel");
            return (Criteria) this;
        }

        public Criteria andLianxirentelIn(List<String> values) {
            addCriterion("LIANXIRENTEL in", values, "lianxirentel");
            return (Criteria) this;
        }

        public Criteria andLianxirentelNotIn(List<String> values) {
            addCriterion("LIANXIRENTEL not in", values, "lianxirentel");
            return (Criteria) this;
        }

        public Criteria andLianxirentelBetween(String value1, String value2) {
            addCriterion("LIANXIRENTEL between", value1, value2, "lianxirentel");
            return (Criteria) this;
        }

        public Criteria andLianxirentelNotBetween(String value1, String value2) {
            addCriterion("LIANXIRENTEL not between", value1, value2, "lianxirentel");
            return (Criteria) this;
        }

        public Criteria andLianxirenphoneIsNull() {
            addCriterion("LIANXIRENPHONE is null");
            return (Criteria) this;
        }

        public Criteria andLianxirenphoneIsNotNull() {
            addCriterion("LIANXIRENPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andLianxirenphoneEqualTo(String value) {
            addCriterion("LIANXIRENPHONE =", value, "lianxirenphone");
            return (Criteria) this;
        }

        public Criteria andLianxirenphoneNotEqualTo(String value) {
            addCriterion("LIANXIRENPHONE <>", value, "lianxirenphone");
            return (Criteria) this;
        }

        public Criteria andLianxirenphoneGreaterThan(String value) {
            addCriterion("LIANXIRENPHONE >", value, "lianxirenphone");
            return (Criteria) this;
        }

        public Criteria andLianxirenphoneGreaterThanOrEqualTo(String value) {
            addCriterion("LIANXIRENPHONE >=", value, "lianxirenphone");
            return (Criteria) this;
        }

        public Criteria andLianxirenphoneLessThan(String value) {
            addCriterion("LIANXIRENPHONE <", value, "lianxirenphone");
            return (Criteria) this;
        }

        public Criteria andLianxirenphoneLessThanOrEqualTo(String value) {
            addCriterion("LIANXIRENPHONE <=", value, "lianxirenphone");
            return (Criteria) this;
        }

        public Criteria andLianxirenphoneLike(String value) {
            addCriterion("LIANXIRENPHONE like", value, "lianxirenphone");
            return (Criteria) this;
        }

        public Criteria andLianxirenphoneNotLike(String value) {
            addCriterion("LIANXIRENPHONE not like", value, "lianxirenphone");
            return (Criteria) this;
        }

        public Criteria andLianxirenphoneIn(List<String> values) {
            addCriterion("LIANXIRENPHONE in", values, "lianxirenphone");
            return (Criteria) this;
        }

        public Criteria andLianxirenphoneNotIn(List<String> values) {
            addCriterion("LIANXIRENPHONE not in", values, "lianxirenphone");
            return (Criteria) this;
        }

        public Criteria andLianxirenphoneBetween(String value1, String value2) {
            addCriterion("LIANXIRENPHONE between", value1, value2, "lianxirenphone");
            return (Criteria) this;
        }

        public Criteria andLianxirenphoneNotBetween(String value1, String value2) {
            addCriterion("LIANXIRENPHONE not between", value1, value2, "lianxirenphone");
            return (Criteria) this;
        }

        public Criteria andLianxirenmailIsNull() {
            addCriterion("LIANXIRENMAIL is null");
            return (Criteria) this;
        }

        public Criteria andLianxirenmailIsNotNull() {
            addCriterion("LIANXIRENMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andLianxirenmailEqualTo(String value) {
            addCriterion("LIANXIRENMAIL =", value, "lianxirenmail");
            return (Criteria) this;
        }

        public Criteria andLianxirenmailNotEqualTo(String value) {
            addCriterion("LIANXIRENMAIL <>", value, "lianxirenmail");
            return (Criteria) this;
        }

        public Criteria andLianxirenmailGreaterThan(String value) {
            addCriterion("LIANXIRENMAIL >", value, "lianxirenmail");
            return (Criteria) this;
        }

        public Criteria andLianxirenmailGreaterThanOrEqualTo(String value) {
            addCriterion("LIANXIRENMAIL >=", value, "lianxirenmail");
            return (Criteria) this;
        }

        public Criteria andLianxirenmailLessThan(String value) {
            addCriterion("LIANXIRENMAIL <", value, "lianxirenmail");
            return (Criteria) this;
        }

        public Criteria andLianxirenmailLessThanOrEqualTo(String value) {
            addCriterion("LIANXIRENMAIL <=", value, "lianxirenmail");
            return (Criteria) this;
        }

        public Criteria andLianxirenmailLike(String value) {
            addCriterion("LIANXIRENMAIL like", value, "lianxirenmail");
            return (Criteria) this;
        }

        public Criteria andLianxirenmailNotLike(String value) {
            addCriterion("LIANXIRENMAIL not like", value, "lianxirenmail");
            return (Criteria) this;
        }

        public Criteria andLianxirenmailIn(List<String> values) {
            addCriterion("LIANXIRENMAIL in", values, "lianxirenmail");
            return (Criteria) this;
        }

        public Criteria andLianxirenmailNotIn(List<String> values) {
            addCriterion("LIANXIRENMAIL not in", values, "lianxirenmail");
            return (Criteria) this;
        }

        public Criteria andLianxirenmailBetween(String value1, String value2) {
            addCriterion("LIANXIRENMAIL between", value1, value2, "lianxirenmail");
            return (Criteria) this;
        }

        public Criteria andLianxirenmailNotBetween(String value1, String value2) {
            addCriterion("LIANXIRENMAIL not between", value1, value2, "lianxirenmail");
            return (Criteria) this;
        }

        public Criteria andMishuzhangmailIsNull() {
            addCriterion("MISHUZHANGMAIL is null");
            return (Criteria) this;
        }

        public Criteria andMishuzhangmailIsNotNull() {
            addCriterion("MISHUZHANGMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andMishuzhangmailEqualTo(String value) {
            addCriterion("MISHUZHANGMAIL =", value, "mishuzhangmail");
            return (Criteria) this;
        }

        public Criteria andMishuzhangmailNotEqualTo(String value) {
            addCriterion("MISHUZHANGMAIL <>", value, "mishuzhangmail");
            return (Criteria) this;
        }

        public Criteria andMishuzhangmailGreaterThan(String value) {
            addCriterion("MISHUZHANGMAIL >", value, "mishuzhangmail");
            return (Criteria) this;
        }

        public Criteria andMishuzhangmailGreaterThanOrEqualTo(String value) {
            addCriterion("MISHUZHANGMAIL >=", value, "mishuzhangmail");
            return (Criteria) this;
        }

        public Criteria andMishuzhangmailLessThan(String value) {
            addCriterion("MISHUZHANGMAIL <", value, "mishuzhangmail");
            return (Criteria) this;
        }

        public Criteria andMishuzhangmailLessThanOrEqualTo(String value) {
            addCriterion("MISHUZHANGMAIL <=", value, "mishuzhangmail");
            return (Criteria) this;
        }

        public Criteria andMishuzhangmailLike(String value) {
            addCriterion("MISHUZHANGMAIL like", value, "mishuzhangmail");
            return (Criteria) this;
        }

        public Criteria andMishuzhangmailNotLike(String value) {
            addCriterion("MISHUZHANGMAIL not like", value, "mishuzhangmail");
            return (Criteria) this;
        }

        public Criteria andMishuzhangmailIn(List<String> values) {
            addCriterion("MISHUZHANGMAIL in", values, "mishuzhangmail");
            return (Criteria) this;
        }

        public Criteria andMishuzhangmailNotIn(List<String> values) {
            addCriterion("MISHUZHANGMAIL not in", values, "mishuzhangmail");
            return (Criteria) this;
        }

        public Criteria andMishuzhangmailBetween(String value1, String value2) {
            addCriterion("MISHUZHANGMAIL between", value1, value2, "mishuzhangmail");
            return (Criteria) this;
        }

        public Criteria andMishuzhangmailNotBetween(String value1, String value2) {
            addCriterion("MISHUZHANGMAIL not between", value1, value2, "mishuzhangmail");
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