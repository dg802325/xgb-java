package com.xgb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JjhnjJshjdgltabExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JjhnjJshjdgltabExample() {
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

        public Criteria andNianjianjielun1IsNull() {
            addCriterion("NIANJIANJIELUN1 is null");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun1IsNotNull() {
            addCriterion("NIANJIANJIELUN1 is not null");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun1EqualTo(String value) {
            addCriterion("NIANJIANJIELUN1 =", value, "nianjianjielun1");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun1NotEqualTo(String value) {
            addCriterion("NIANJIANJIELUN1 <>", value, "nianjianjielun1");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun1GreaterThan(String value) {
            addCriterion("NIANJIANJIELUN1 >", value, "nianjianjielun1");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun1GreaterThanOrEqualTo(String value) {
            addCriterion("NIANJIANJIELUN1 >=", value, "nianjianjielun1");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun1LessThan(String value) {
            addCriterion("NIANJIANJIELUN1 <", value, "nianjianjielun1");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun1LessThanOrEqualTo(String value) {
            addCriterion("NIANJIANJIELUN1 <=", value, "nianjianjielun1");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun1Like(String value) {
            addCriterion("NIANJIANJIELUN1 like", value, "nianjianjielun1");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun1NotLike(String value) {
            addCriterion("NIANJIANJIELUN1 not like", value, "nianjianjielun1");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun1In(List<String> values) {
            addCriterion("NIANJIANJIELUN1 in", values, "nianjianjielun1");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun1NotIn(List<String> values) {
            addCriterion("NIANJIANJIELUN1 not in", values, "nianjianjielun1");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun1Between(String value1, String value2) {
            addCriterion("NIANJIANJIELUN1 between", value1, value2, "nianjianjielun1");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun1NotBetween(String value1, String value2) {
            addCriterion("NIANJIANJIELUN1 not between", value1, value2, "nianjianjielun1");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun2IsNull() {
            addCriterion("NIANJIANJIELUN2 is null");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun2IsNotNull() {
            addCriterion("NIANJIANJIELUN2 is not null");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun2EqualTo(String value) {
            addCriterion("NIANJIANJIELUN2 =", value, "nianjianjielun2");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun2NotEqualTo(String value) {
            addCriterion("NIANJIANJIELUN2 <>", value, "nianjianjielun2");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun2GreaterThan(String value) {
            addCriterion("NIANJIANJIELUN2 >", value, "nianjianjielun2");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun2GreaterThanOrEqualTo(String value) {
            addCriterion("NIANJIANJIELUN2 >=", value, "nianjianjielun2");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun2LessThan(String value) {
            addCriterion("NIANJIANJIELUN2 <", value, "nianjianjielun2");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun2LessThanOrEqualTo(String value) {
            addCriterion("NIANJIANJIELUN2 <=", value, "nianjianjielun2");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun2Like(String value) {
            addCriterion("NIANJIANJIELUN2 like", value, "nianjianjielun2");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun2NotLike(String value) {
            addCriterion("NIANJIANJIELUN2 not like", value, "nianjianjielun2");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun2In(List<String> values) {
            addCriterion("NIANJIANJIELUN2 in", values, "nianjianjielun2");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun2NotIn(List<String> values) {
            addCriterion("NIANJIANJIELUN2 not in", values, "nianjianjielun2");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun2Between(String value1, String value2) {
            addCriterion("NIANJIANJIELUN2 between", value1, value2, "nianjianjielun2");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun2NotBetween(String value1, String value2) {
            addCriterion("NIANJIANJIELUN2 not between", value1, value2, "nianjianjielun2");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun3IsNull() {
            addCriterion("NIANJIANJIELUN3 is null");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun3IsNotNull() {
            addCriterion("NIANJIANJIELUN3 is not null");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun3EqualTo(String value) {
            addCriterion("NIANJIANJIELUN3 =", value, "nianjianjielun3");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun3NotEqualTo(String value) {
            addCriterion("NIANJIANJIELUN3 <>", value, "nianjianjielun3");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun3GreaterThan(String value) {
            addCriterion("NIANJIANJIELUN3 >", value, "nianjianjielun3");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun3GreaterThanOrEqualTo(String value) {
            addCriterion("NIANJIANJIELUN3 >=", value, "nianjianjielun3");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun3LessThan(String value) {
            addCriterion("NIANJIANJIELUN3 <", value, "nianjianjielun3");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun3LessThanOrEqualTo(String value) {
            addCriterion("NIANJIANJIELUN3 <=", value, "nianjianjielun3");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun3Like(String value) {
            addCriterion("NIANJIANJIELUN3 like", value, "nianjianjielun3");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun3NotLike(String value) {
            addCriterion("NIANJIANJIELUN3 not like", value, "nianjianjielun3");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun3In(List<String> values) {
            addCriterion("NIANJIANJIELUN3 in", values, "nianjianjielun3");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun3NotIn(List<String> values) {
            addCriterion("NIANJIANJIELUN3 not in", values, "nianjianjielun3");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun3Between(String value1, String value2) {
            addCriterion("NIANJIANJIELUN3 between", value1, value2, "nianjianjielun3");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun3NotBetween(String value1, String value2) {
            addCriterion("NIANJIANJIELUN3 not between", value1, value2, "nianjianjielun3");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun4IsNull() {
            addCriterion("NIANJIANJIELUN4 is null");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun4IsNotNull() {
            addCriterion("NIANJIANJIELUN4 is not null");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun4EqualTo(String value) {
            addCriterion("NIANJIANJIELUN4 =", value, "nianjianjielun4");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun4NotEqualTo(String value) {
            addCriterion("NIANJIANJIELUN4 <>", value, "nianjianjielun4");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun4GreaterThan(String value) {
            addCriterion("NIANJIANJIELUN4 >", value, "nianjianjielun4");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun4GreaterThanOrEqualTo(String value) {
            addCriterion("NIANJIANJIELUN4 >=", value, "nianjianjielun4");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun4LessThan(String value) {
            addCriterion("NIANJIANJIELUN4 <", value, "nianjianjielun4");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun4LessThanOrEqualTo(String value) {
            addCriterion("NIANJIANJIELUN4 <=", value, "nianjianjielun4");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun4Like(String value) {
            addCriterion("NIANJIANJIELUN4 like", value, "nianjianjielun4");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun4NotLike(String value) {
            addCriterion("NIANJIANJIELUN4 not like", value, "nianjianjielun4");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun4In(List<String> values) {
            addCriterion("NIANJIANJIELUN4 in", values, "nianjianjielun4");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun4NotIn(List<String> values) {
            addCriterion("NIANJIANJIELUN4 not in", values, "nianjianjielun4");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun4Between(String value1, String value2) {
            addCriterion("NIANJIANJIELUN4 between", value1, value2, "nianjianjielun4");
            return (Criteria) this;
        }

        public Criteria andNianjianjielun4NotBetween(String value1, String value2) {
            addCriterion("NIANJIANJIELUN4 not between", value1, value2, "nianjianjielun4");
            return (Criteria) this;
        }

        public Criteria andDengjiIsNull() {
            addCriterion("DENGJI is null");
            return (Criteria) this;
        }

        public Criteria andDengjiIsNotNull() {
            addCriterion("DENGJI is not null");
            return (Criteria) this;
        }

        public Criteria andDengjiEqualTo(String value) {
            addCriterion("DENGJI =", value, "dengji");
            return (Criteria) this;
        }

        public Criteria andDengjiNotEqualTo(String value) {
            addCriterion("DENGJI <>", value, "dengji");
            return (Criteria) this;
        }

        public Criteria andDengjiGreaterThan(String value) {
            addCriterion("DENGJI >", value, "dengji");
            return (Criteria) this;
        }

        public Criteria andDengjiGreaterThanOrEqualTo(String value) {
            addCriterion("DENGJI >=", value, "dengji");
            return (Criteria) this;
        }

        public Criteria andDengjiLessThan(String value) {
            addCriterion("DENGJI <", value, "dengji");
            return (Criteria) this;
        }

        public Criteria andDengjiLessThanOrEqualTo(String value) {
            addCriterion("DENGJI <=", value, "dengji");
            return (Criteria) this;
        }

        public Criteria andDengjiLike(String value) {
            addCriterion("DENGJI like", value, "dengji");
            return (Criteria) this;
        }

        public Criteria andDengjiNotLike(String value) {
            addCriterion("DENGJI not like", value, "dengji");
            return (Criteria) this;
        }

        public Criteria andDengjiIn(List<String> values) {
            addCriterion("DENGJI in", values, "dengji");
            return (Criteria) this;
        }

        public Criteria andDengjiNotIn(List<String> values) {
            addCriterion("DENGJI not in", values, "dengji");
            return (Criteria) this;
        }

        public Criteria andDengjiBetween(String value1, String value2) {
            addCriterion("DENGJI between", value1, value2, "dengji");
            return (Criteria) this;
        }

        public Criteria andDengjiNotBetween(String value1, String value2) {
            addCriterion("DENGJI not between", value1, value2, "dengji");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqikaishiIsNull() {
            addCriterion("YOUXIAOQIKAISHI is null");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqikaishiIsNotNull() {
            addCriterion("YOUXIAOQIKAISHI is not null");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqikaishiEqualTo(String value) {
            addCriterion("YOUXIAOQIKAISHI =", value, "youxiaoqikaishi");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqikaishiNotEqualTo(String value) {
            addCriterion("YOUXIAOQIKAISHI <>", value, "youxiaoqikaishi");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqikaishiGreaterThan(String value) {
            addCriterion("YOUXIAOQIKAISHI >", value, "youxiaoqikaishi");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqikaishiGreaterThanOrEqualTo(String value) {
            addCriterion("YOUXIAOQIKAISHI >=", value, "youxiaoqikaishi");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqikaishiLessThan(String value) {
            addCriterion("YOUXIAOQIKAISHI <", value, "youxiaoqikaishi");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqikaishiLessThanOrEqualTo(String value) {
            addCriterion("YOUXIAOQIKAISHI <=", value, "youxiaoqikaishi");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqikaishiLike(String value) {
            addCriterion("YOUXIAOQIKAISHI like", value, "youxiaoqikaishi");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqikaishiNotLike(String value) {
            addCriterion("YOUXIAOQIKAISHI not like", value, "youxiaoqikaishi");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqikaishiIn(List<String> values) {
            addCriterion("YOUXIAOQIKAISHI in", values, "youxiaoqikaishi");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqikaishiNotIn(List<String> values) {
            addCriterion("YOUXIAOQIKAISHI not in", values, "youxiaoqikaishi");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqikaishiBetween(String value1, String value2) {
            addCriterion("YOUXIAOQIKAISHI between", value1, value2, "youxiaoqikaishi");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqikaishiNotBetween(String value1, String value2) {
            addCriterion("YOUXIAOQIKAISHI not between", value1, value2, "youxiaoqikaishi");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqijieshuIsNull() {
            addCriterion("YOUXIAOQIJIESHU is null");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqijieshuIsNotNull() {
            addCriterion("YOUXIAOQIJIESHU is not null");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqijieshuEqualTo(String value) {
            addCriterion("YOUXIAOQIJIESHU =", value, "youxiaoqijieshu");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqijieshuNotEqualTo(String value) {
            addCriterion("YOUXIAOQIJIESHU <>", value, "youxiaoqijieshu");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqijieshuGreaterThan(String value) {
            addCriterion("YOUXIAOQIJIESHU >", value, "youxiaoqijieshu");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqijieshuGreaterThanOrEqualTo(String value) {
            addCriterion("YOUXIAOQIJIESHU >=", value, "youxiaoqijieshu");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqijieshuLessThan(String value) {
            addCriterion("YOUXIAOQIJIESHU <", value, "youxiaoqijieshu");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqijieshuLessThanOrEqualTo(String value) {
            addCriterion("YOUXIAOQIJIESHU <=", value, "youxiaoqijieshu");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqijieshuLike(String value) {
            addCriterion("YOUXIAOQIJIESHU like", value, "youxiaoqijieshu");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqijieshuNotLike(String value) {
            addCriterion("YOUXIAOQIJIESHU not like", value, "youxiaoqijieshu");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqijieshuIn(List<String> values) {
            addCriterion("YOUXIAOQIJIESHU in", values, "youxiaoqijieshu");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqijieshuNotIn(List<String> values) {
            addCriterion("YOUXIAOQIJIESHU not in", values, "youxiaoqijieshu");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqijieshuBetween(String value1, String value2) {
            addCriterion("YOUXIAOQIJIESHU between", value1, value2, "youxiaoqijieshu");
            return (Criteria) this;
        }

        public Criteria andYouxiaoqijieshuNotBetween(String value1, String value2) {
            addCriterion("YOUXIAOQIJIESHU not between", value1, value2, "youxiaoqijieshu");
            return (Criteria) this;
        }

        public Criteria andShishuishouyouhuiIsNull() {
            addCriterion("SHISHUISHOUYOUHUI is null");
            return (Criteria) this;
        }

        public Criteria andShishuishouyouhuiIsNotNull() {
            addCriterion("SHISHUISHOUYOUHUI is not null");
            return (Criteria) this;
        }

        public Criteria andShishuishouyouhuiEqualTo(String value) {
            addCriterion("SHISHUISHOUYOUHUI =", value, "shishuishouyouhui");
            return (Criteria) this;
        }

        public Criteria andShishuishouyouhuiNotEqualTo(String value) {
            addCriterion("SHISHUISHOUYOUHUI <>", value, "shishuishouyouhui");
            return (Criteria) this;
        }

        public Criteria andShishuishouyouhuiGreaterThan(String value) {
            addCriterion("SHISHUISHOUYOUHUI >", value, "shishuishouyouhui");
            return (Criteria) this;
        }

        public Criteria andShishuishouyouhuiGreaterThanOrEqualTo(String value) {
            addCriterion("SHISHUISHOUYOUHUI >=", value, "shishuishouyouhui");
            return (Criteria) this;
        }

        public Criteria andShishuishouyouhuiLessThan(String value) {
            addCriterion("SHISHUISHOUYOUHUI <", value, "shishuishouyouhui");
            return (Criteria) this;
        }

        public Criteria andShishuishouyouhuiLessThanOrEqualTo(String value) {
            addCriterion("SHISHUISHOUYOUHUI <=", value, "shishuishouyouhui");
            return (Criteria) this;
        }

        public Criteria andShishuishouyouhuiLike(String value) {
            addCriterion("SHISHUISHOUYOUHUI like", value, "shishuishouyouhui");
            return (Criteria) this;
        }

        public Criteria andShishuishouyouhuiNotLike(String value) {
            addCriterion("SHISHUISHOUYOUHUI not like", value, "shishuishouyouhui");
            return (Criteria) this;
        }

        public Criteria andShishuishouyouhuiIn(List<String> values) {
            addCriterion("SHISHUISHOUYOUHUI in", values, "shishuishouyouhui");
            return (Criteria) this;
        }

        public Criteria andShishuishouyouhuiNotIn(List<String> values) {
            addCriterion("SHISHUISHOUYOUHUI not in", values, "shishuishouyouhui");
            return (Criteria) this;
        }

        public Criteria andShishuishouyouhuiBetween(String value1, String value2) {
            addCriterion("SHISHUISHOUYOUHUI between", value1, value2, "shishuishouyouhui");
            return (Criteria) this;
        }

        public Criteria andShishuishouyouhuiNotBetween(String value1, String value2) {
            addCriterion("SHISHUISHOUYOUHUI not between", value1, value2, "shishuishouyouhui");
            return (Criteria) this;
        }

        public Criteria andFoushuishouyouhuiIsNull() {
            addCriterion("FOUSHUISHOUYOUHUI is null");
            return (Criteria) this;
        }

        public Criteria andFoushuishouyouhuiIsNotNull() {
            addCriterion("FOUSHUISHOUYOUHUI is not null");
            return (Criteria) this;
        }

        public Criteria andFoushuishouyouhuiEqualTo(String value) {
            addCriterion("FOUSHUISHOUYOUHUI =", value, "foushuishouyouhui");
            return (Criteria) this;
        }

        public Criteria andFoushuishouyouhuiNotEqualTo(String value) {
            addCriterion("FOUSHUISHOUYOUHUI <>", value, "foushuishouyouhui");
            return (Criteria) this;
        }

        public Criteria andFoushuishouyouhuiGreaterThan(String value) {
            addCriterion("FOUSHUISHOUYOUHUI >", value, "foushuishouyouhui");
            return (Criteria) this;
        }

        public Criteria andFoushuishouyouhuiGreaterThanOrEqualTo(String value) {
            addCriterion("FOUSHUISHOUYOUHUI >=", value, "foushuishouyouhui");
            return (Criteria) this;
        }

        public Criteria andFoushuishouyouhuiLessThan(String value) {
            addCriterion("FOUSHUISHOUYOUHUI <", value, "foushuishouyouhui");
            return (Criteria) this;
        }

        public Criteria andFoushuishouyouhuiLessThanOrEqualTo(String value) {
            addCriterion("FOUSHUISHOUYOUHUI <=", value, "foushuishouyouhui");
            return (Criteria) this;
        }

        public Criteria andFoushuishouyouhuiLike(String value) {
            addCriterion("FOUSHUISHOUYOUHUI like", value, "foushuishouyouhui");
            return (Criteria) this;
        }

        public Criteria andFoushuishouyouhuiNotLike(String value) {
            addCriterion("FOUSHUISHOUYOUHUI not like", value, "foushuishouyouhui");
            return (Criteria) this;
        }

        public Criteria andFoushuishouyouhuiIn(List<String> values) {
            addCriterion("FOUSHUISHOUYOUHUI in", values, "foushuishouyouhui");
            return (Criteria) this;
        }

        public Criteria andFoushuishouyouhuiNotIn(List<String> values) {
            addCriterion("FOUSHUISHOUYOUHUI not in", values, "foushuishouyouhui");
            return (Criteria) this;
        }

        public Criteria andFoushuishouyouhuiBetween(String value1, String value2) {
            addCriterion("FOUSHUISHOUYOUHUI between", value1, value2, "foushuishouyouhui");
            return (Criteria) this;
        }

        public Criteria andFoushuishouyouhuiNotBetween(String value1, String value2) {
            addCriterion("FOUSHUISHOUYOUHUI not between", value1, value2, "foushuishouyouhui");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing1IsNull() {
            addCriterion("YOUHUILEIXING1 is null");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing1IsNotNull() {
            addCriterion("YOUHUILEIXING1 is not null");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing1EqualTo(String value) {
            addCriterion("YOUHUILEIXING1 =", value, "youhuileixing1");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing1NotEqualTo(String value) {
            addCriterion("YOUHUILEIXING1 <>", value, "youhuileixing1");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing1GreaterThan(String value) {
            addCriterion("YOUHUILEIXING1 >", value, "youhuileixing1");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing1GreaterThanOrEqualTo(String value) {
            addCriterion("YOUHUILEIXING1 >=", value, "youhuileixing1");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing1LessThan(String value) {
            addCriterion("YOUHUILEIXING1 <", value, "youhuileixing1");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing1LessThanOrEqualTo(String value) {
            addCriterion("YOUHUILEIXING1 <=", value, "youhuileixing1");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing1Like(String value) {
            addCriterion("YOUHUILEIXING1 like", value, "youhuileixing1");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing1NotLike(String value) {
            addCriterion("YOUHUILEIXING1 not like", value, "youhuileixing1");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing1In(List<String> values) {
            addCriterion("YOUHUILEIXING1 in", values, "youhuileixing1");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing1NotIn(List<String> values) {
            addCriterion("YOUHUILEIXING1 not in", values, "youhuileixing1");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing1Between(String value1, String value2) {
            addCriterion("YOUHUILEIXING1 between", value1, value2, "youhuileixing1");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing1NotBetween(String value1, String value2) {
            addCriterion("YOUHUILEIXING1 not between", value1, value2, "youhuileixing1");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing2IsNull() {
            addCriterion("YOUHUILEIXING2 is null");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing2IsNotNull() {
            addCriterion("YOUHUILEIXING2 is not null");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing2EqualTo(String value) {
            addCriterion("YOUHUILEIXING2 =", value, "youhuileixing2");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing2NotEqualTo(String value) {
            addCriterion("YOUHUILEIXING2 <>", value, "youhuileixing2");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing2GreaterThan(String value) {
            addCriterion("YOUHUILEIXING2 >", value, "youhuileixing2");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing2GreaterThanOrEqualTo(String value) {
            addCriterion("YOUHUILEIXING2 >=", value, "youhuileixing2");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing2LessThan(String value) {
            addCriterion("YOUHUILEIXING2 <", value, "youhuileixing2");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing2LessThanOrEqualTo(String value) {
            addCriterion("YOUHUILEIXING2 <=", value, "youhuileixing2");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing2Like(String value) {
            addCriterion("YOUHUILEIXING2 like", value, "youhuileixing2");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing2NotLike(String value) {
            addCriterion("YOUHUILEIXING2 not like", value, "youhuileixing2");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing2In(List<String> values) {
            addCriterion("YOUHUILEIXING2 in", values, "youhuileixing2");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing2NotIn(List<String> values) {
            addCriterion("YOUHUILEIXING2 not in", values, "youhuileixing2");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing2Between(String value1, String value2) {
            addCriterion("YOUHUILEIXING2 between", value1, value2, "youhuileixing2");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing2NotBetween(String value1, String value2) {
            addCriterion("YOUHUILEIXING2 not between", value1, value2, "youhuileixing2");
            return (Criteria) this;
        }

        public Criteria andShijianjipizhunbumenIsNull() {
            addCriterion("SHIJIANJIPIZHUNBUMEN is null");
            return (Criteria) this;
        }

        public Criteria andShijianjipizhunbumenIsNotNull() {
            addCriterion("SHIJIANJIPIZHUNBUMEN is not null");
            return (Criteria) this;
        }

        public Criteria andShijianjipizhunbumenEqualTo(String value) {
            addCriterion("SHIJIANJIPIZHUNBUMEN =", value, "shijianjipizhunbumen");
            return (Criteria) this;
        }

        public Criteria andShijianjipizhunbumenNotEqualTo(String value) {
            addCriterion("SHIJIANJIPIZHUNBUMEN <>", value, "shijianjipizhunbumen");
            return (Criteria) this;
        }

        public Criteria andShijianjipizhunbumenGreaterThan(String value) {
            addCriterion("SHIJIANJIPIZHUNBUMEN >", value, "shijianjipizhunbumen");
            return (Criteria) this;
        }

        public Criteria andShijianjipizhunbumenGreaterThanOrEqualTo(String value) {
            addCriterion("SHIJIANJIPIZHUNBUMEN >=", value, "shijianjipizhunbumen");
            return (Criteria) this;
        }

        public Criteria andShijianjipizhunbumenLessThan(String value) {
            addCriterion("SHIJIANJIPIZHUNBUMEN <", value, "shijianjipizhunbumen");
            return (Criteria) this;
        }

        public Criteria andShijianjipizhunbumenLessThanOrEqualTo(String value) {
            addCriterion("SHIJIANJIPIZHUNBUMEN <=", value, "shijianjipizhunbumen");
            return (Criteria) this;
        }

        public Criteria andShijianjipizhunbumenLike(String value) {
            addCriterion("SHIJIANJIPIZHUNBUMEN like", value, "shijianjipizhunbumen");
            return (Criteria) this;
        }

        public Criteria andShijianjipizhunbumenNotLike(String value) {
            addCriterion("SHIJIANJIPIZHUNBUMEN not like", value, "shijianjipizhunbumen");
            return (Criteria) this;
        }

        public Criteria andShijianjipizhunbumenIn(List<String> values) {
            addCriterion("SHIJIANJIPIZHUNBUMEN in", values, "shijianjipizhunbumen");
            return (Criteria) this;
        }

        public Criteria andShijianjipizhunbumenNotIn(List<String> values) {
            addCriterion("SHIJIANJIPIZHUNBUMEN not in", values, "shijianjipizhunbumen");
            return (Criteria) this;
        }

        public Criteria andShijianjipizhunbumenBetween(String value1, String value2) {
            addCriterion("SHIJIANJIPIZHUNBUMEN between", value1, value2, "shijianjipizhunbumen");
            return (Criteria) this;
        }

        public Criteria andShijianjipizhunbumenNotBetween(String value1, String value2) {
            addCriterion("SHIJIANJIPIZHUNBUMEN not between", value1, value2, "shijianjipizhunbumen");
            return (Criteria) this;
        }

        public Criteria andShixingzhengchufaIsNull() {
            addCriterion("SHIXINGZHENGCHUFA is null");
            return (Criteria) this;
        }

        public Criteria andShixingzhengchufaIsNotNull() {
            addCriterion("SHIXINGZHENGCHUFA is not null");
            return (Criteria) this;
        }

        public Criteria andShixingzhengchufaEqualTo(String value) {
            addCriterion("SHIXINGZHENGCHUFA =", value, "shixingzhengchufa");
            return (Criteria) this;
        }

        public Criteria andShixingzhengchufaNotEqualTo(String value) {
            addCriterion("SHIXINGZHENGCHUFA <>", value, "shixingzhengchufa");
            return (Criteria) this;
        }

        public Criteria andShixingzhengchufaGreaterThan(String value) {
            addCriterion("SHIXINGZHENGCHUFA >", value, "shixingzhengchufa");
            return (Criteria) this;
        }

        public Criteria andShixingzhengchufaGreaterThanOrEqualTo(String value) {
            addCriterion("SHIXINGZHENGCHUFA >=", value, "shixingzhengchufa");
            return (Criteria) this;
        }

        public Criteria andShixingzhengchufaLessThan(String value) {
            addCriterion("SHIXINGZHENGCHUFA <", value, "shixingzhengchufa");
            return (Criteria) this;
        }

        public Criteria andShixingzhengchufaLessThanOrEqualTo(String value) {
            addCriterion("SHIXINGZHENGCHUFA <=", value, "shixingzhengchufa");
            return (Criteria) this;
        }

        public Criteria andShixingzhengchufaLike(String value) {
            addCriterion("SHIXINGZHENGCHUFA like", value, "shixingzhengchufa");
            return (Criteria) this;
        }

        public Criteria andShixingzhengchufaNotLike(String value) {
            addCriterion("SHIXINGZHENGCHUFA not like", value, "shixingzhengchufa");
            return (Criteria) this;
        }

        public Criteria andShixingzhengchufaIn(List<String> values) {
            addCriterion("SHIXINGZHENGCHUFA in", values, "shixingzhengchufa");
            return (Criteria) this;
        }

        public Criteria andShixingzhengchufaNotIn(List<String> values) {
            addCriterion("SHIXINGZHENGCHUFA not in", values, "shixingzhengchufa");
            return (Criteria) this;
        }

        public Criteria andShixingzhengchufaBetween(String value1, String value2) {
            addCriterion("SHIXINGZHENGCHUFA between", value1, value2, "shixingzhengchufa");
            return (Criteria) this;
        }

        public Criteria andShixingzhengchufaNotBetween(String value1, String value2) {
            addCriterion("SHIXINGZHENGCHUFA not between", value1, value2, "shixingzhengchufa");
            return (Criteria) this;
        }

        public Criteria andFouxingzhengchufaIsNull() {
            addCriterion("FOUXINGZHENGCHUFA is null");
            return (Criteria) this;
        }

        public Criteria andFouxingzhengchufaIsNotNull() {
            addCriterion("FOUXINGZHENGCHUFA is not null");
            return (Criteria) this;
        }

        public Criteria andFouxingzhengchufaEqualTo(String value) {
            addCriterion("FOUXINGZHENGCHUFA =", value, "fouxingzhengchufa");
            return (Criteria) this;
        }

        public Criteria andFouxingzhengchufaNotEqualTo(String value) {
            addCriterion("FOUXINGZHENGCHUFA <>", value, "fouxingzhengchufa");
            return (Criteria) this;
        }

        public Criteria andFouxingzhengchufaGreaterThan(String value) {
            addCriterion("FOUXINGZHENGCHUFA >", value, "fouxingzhengchufa");
            return (Criteria) this;
        }

        public Criteria andFouxingzhengchufaGreaterThanOrEqualTo(String value) {
            addCriterion("FOUXINGZHENGCHUFA >=", value, "fouxingzhengchufa");
            return (Criteria) this;
        }

        public Criteria andFouxingzhengchufaLessThan(String value) {
            addCriterion("FOUXINGZHENGCHUFA <", value, "fouxingzhengchufa");
            return (Criteria) this;
        }

        public Criteria andFouxingzhengchufaLessThanOrEqualTo(String value) {
            addCriterion("FOUXINGZHENGCHUFA <=", value, "fouxingzhengchufa");
            return (Criteria) this;
        }

        public Criteria andFouxingzhengchufaLike(String value) {
            addCriterion("FOUXINGZHENGCHUFA like", value, "fouxingzhengchufa");
            return (Criteria) this;
        }

        public Criteria andFouxingzhengchufaNotLike(String value) {
            addCriterion("FOUXINGZHENGCHUFA not like", value, "fouxingzhengchufa");
            return (Criteria) this;
        }

        public Criteria andFouxingzhengchufaIn(List<String> values) {
            addCriterion("FOUXINGZHENGCHUFA in", values, "fouxingzhengchufa");
            return (Criteria) this;
        }

        public Criteria andFouxingzhengchufaNotIn(List<String> values) {
            addCriterion("FOUXINGZHENGCHUFA not in", values, "fouxingzhengchufa");
            return (Criteria) this;
        }

        public Criteria andFouxingzhengchufaBetween(String value1, String value2) {
            addCriterion("FOUXINGZHENGCHUFA between", value1, value2, "fouxingzhengchufa");
            return (Criteria) this;
        }

        public Criteria andFouxingzhengchufaNotBetween(String value1, String value2) {
            addCriterion("FOUXINGZHENGCHUFA not between", value1, value2, "fouxingzhengchufa");
            return (Criteria) this;
        }

        public Criteria andShifasongIsNull() {
            addCriterion("SHIFASONG is null");
            return (Criteria) this;
        }

        public Criteria andShifasongIsNotNull() {
            addCriterion("SHIFASONG is not null");
            return (Criteria) this;
        }

        public Criteria andShifasongEqualTo(String value) {
            addCriterion("SHIFASONG =", value, "shifasong");
            return (Criteria) this;
        }

        public Criteria andShifasongNotEqualTo(String value) {
            addCriterion("SHIFASONG <>", value, "shifasong");
            return (Criteria) this;
        }

        public Criteria andShifasongGreaterThan(String value) {
            addCriterion("SHIFASONG >", value, "shifasong");
            return (Criteria) this;
        }

        public Criteria andShifasongGreaterThanOrEqualTo(String value) {
            addCriterion("SHIFASONG >=", value, "shifasong");
            return (Criteria) this;
        }

        public Criteria andShifasongLessThan(String value) {
            addCriterion("SHIFASONG <", value, "shifasong");
            return (Criteria) this;
        }

        public Criteria andShifasongLessThanOrEqualTo(String value) {
            addCriterion("SHIFASONG <=", value, "shifasong");
            return (Criteria) this;
        }

        public Criteria andShifasongLike(String value) {
            addCriterion("SHIFASONG like", value, "shifasong");
            return (Criteria) this;
        }

        public Criteria andShifasongNotLike(String value) {
            addCriterion("SHIFASONG not like", value, "shifasong");
            return (Criteria) this;
        }

        public Criteria andShifasongIn(List<String> values) {
            addCriterion("SHIFASONG in", values, "shifasong");
            return (Criteria) this;
        }

        public Criteria andShifasongNotIn(List<String> values) {
            addCriterion("SHIFASONG not in", values, "shifasong");
            return (Criteria) this;
        }

        public Criteria andShifasongBetween(String value1, String value2) {
            addCriterion("SHIFASONG between", value1, value2, "shifasong");
            return (Criteria) this;
        }

        public Criteria andShifasongNotBetween(String value1, String value2) {
            addCriterion("SHIFASONG not between", value1, value2, "shifasong");
            return (Criteria) this;
        }

        public Criteria andFoufasongIsNull() {
            addCriterion("FOUFASONG is null");
            return (Criteria) this;
        }

        public Criteria andFoufasongIsNotNull() {
            addCriterion("FOUFASONG is not null");
            return (Criteria) this;
        }

        public Criteria andFoufasongEqualTo(String value) {
            addCriterion("FOUFASONG =", value, "foufasong");
            return (Criteria) this;
        }

        public Criteria andFoufasongNotEqualTo(String value) {
            addCriterion("FOUFASONG <>", value, "foufasong");
            return (Criteria) this;
        }

        public Criteria andFoufasongGreaterThan(String value) {
            addCriterion("FOUFASONG >", value, "foufasong");
            return (Criteria) this;
        }

        public Criteria andFoufasongGreaterThanOrEqualTo(String value) {
            addCriterion("FOUFASONG >=", value, "foufasong");
            return (Criteria) this;
        }

        public Criteria andFoufasongLessThan(String value) {
            addCriterion("FOUFASONG <", value, "foufasong");
            return (Criteria) this;
        }

        public Criteria andFoufasongLessThanOrEqualTo(String value) {
            addCriterion("FOUFASONG <=", value, "foufasong");
            return (Criteria) this;
        }

        public Criteria andFoufasongLike(String value) {
            addCriterion("FOUFASONG like", value, "foufasong");
            return (Criteria) this;
        }

        public Criteria andFoufasongNotLike(String value) {
            addCriterion("FOUFASONG not like", value, "foufasong");
            return (Criteria) this;
        }

        public Criteria andFoufasongIn(List<String> values) {
            addCriterion("FOUFASONG in", values, "foufasong");
            return (Criteria) this;
        }

        public Criteria andFoufasongNotIn(List<String> values) {
            addCriterion("FOUFASONG not in", values, "foufasong");
            return (Criteria) this;
        }

        public Criteria andFoufasongBetween(String value1, String value2) {
            addCriterion("FOUFASONG between", value1, value2, "foufasong");
            return (Criteria) this;
        }

        public Criteria andFoufasongNotBetween(String value1, String value2) {
            addCriterion("FOUFASONG not between", value1, value2, "foufasong");
            return (Criteria) this;
        }

        public Criteria andZhenggaicuoshiIsNull() {
            addCriterion("ZHENGGAICUOSHI is null");
            return (Criteria) this;
        }

        public Criteria andZhenggaicuoshiIsNotNull() {
            addCriterion("ZHENGGAICUOSHI is not null");
            return (Criteria) this;
        }

        public Criteria andZhenggaicuoshiEqualTo(String value) {
            addCriterion("ZHENGGAICUOSHI =", value, "zhenggaicuoshi");
            return (Criteria) this;
        }

        public Criteria andZhenggaicuoshiNotEqualTo(String value) {
            addCriterion("ZHENGGAICUOSHI <>", value, "zhenggaicuoshi");
            return (Criteria) this;
        }

        public Criteria andZhenggaicuoshiGreaterThan(String value) {
            addCriterion("ZHENGGAICUOSHI >", value, "zhenggaicuoshi");
            return (Criteria) this;
        }

        public Criteria andZhenggaicuoshiGreaterThanOrEqualTo(String value) {
            addCriterion("ZHENGGAICUOSHI >=", value, "zhenggaicuoshi");
            return (Criteria) this;
        }

        public Criteria andZhenggaicuoshiLessThan(String value) {
            addCriterion("ZHENGGAICUOSHI <", value, "zhenggaicuoshi");
            return (Criteria) this;
        }

        public Criteria andZhenggaicuoshiLessThanOrEqualTo(String value) {
            addCriterion("ZHENGGAICUOSHI <=", value, "zhenggaicuoshi");
            return (Criteria) this;
        }

        public Criteria andZhenggaicuoshiLike(String value) {
            addCriterion("ZHENGGAICUOSHI like", value, "zhenggaicuoshi");
            return (Criteria) this;
        }

        public Criteria andZhenggaicuoshiNotLike(String value) {
            addCriterion("ZHENGGAICUOSHI not like", value, "zhenggaicuoshi");
            return (Criteria) this;
        }

        public Criteria andZhenggaicuoshiIn(List<String> values) {
            addCriterion("ZHENGGAICUOSHI in", values, "zhenggaicuoshi");
            return (Criteria) this;
        }

        public Criteria andZhenggaicuoshiNotIn(List<String> values) {
            addCriterion("ZHENGGAICUOSHI not in", values, "zhenggaicuoshi");
            return (Criteria) this;
        }

        public Criteria andZhenggaicuoshiBetween(String value1, String value2) {
            addCriterion("ZHENGGAICUOSHI between", value1, value2, "zhenggaicuoshi");
            return (Criteria) this;
        }

        public Criteria andZhenggaicuoshiNotBetween(String value1, String value2) {
            addCriterion("ZHENGGAICUOSHI not between", value1, value2, "zhenggaicuoshi");
            return (Criteria) this;
        }

        public Criteria andWeicanjiapingguIsNull() {
            addCriterion("WEICANJIAPINGGU is null");
            return (Criteria) this;
        }

        public Criteria andWeicanjiapingguIsNotNull() {
            addCriterion("WEICANJIAPINGGU is not null");
            return (Criteria) this;
        }

        public Criteria andWeicanjiapingguEqualTo(String value) {
            addCriterion("WEICANJIAPINGGU =", value, "weicanjiapinggu");
            return (Criteria) this;
        }

        public Criteria andWeicanjiapingguNotEqualTo(String value) {
            addCriterion("WEICANJIAPINGGU <>", value, "weicanjiapinggu");
            return (Criteria) this;
        }

        public Criteria andWeicanjiapingguGreaterThan(String value) {
            addCriterion("WEICANJIAPINGGU >", value, "weicanjiapinggu");
            return (Criteria) this;
        }

        public Criteria andWeicanjiapingguGreaterThanOrEqualTo(String value) {
            addCriterion("WEICANJIAPINGGU >=", value, "weicanjiapinggu");
            return (Criteria) this;
        }

        public Criteria andWeicanjiapingguLessThan(String value) {
            addCriterion("WEICANJIAPINGGU <", value, "weicanjiapinggu");
            return (Criteria) this;
        }

        public Criteria andWeicanjiapingguLessThanOrEqualTo(String value) {
            addCriterion("WEICANJIAPINGGU <=", value, "weicanjiapinggu");
            return (Criteria) this;
        }

        public Criteria andWeicanjiapingguLike(String value) {
            addCriterion("WEICANJIAPINGGU like", value, "weicanjiapinggu");
            return (Criteria) this;
        }

        public Criteria andWeicanjiapingguNotLike(String value) {
            addCriterion("WEICANJIAPINGGU not like", value, "weicanjiapinggu");
            return (Criteria) this;
        }

        public Criteria andWeicanjiapingguIn(List<String> values) {
            addCriterion("WEICANJIAPINGGU in", values, "weicanjiapinggu");
            return (Criteria) this;
        }

        public Criteria andWeicanjiapingguNotIn(List<String> values) {
            addCriterion("WEICANJIAPINGGU not in", values, "weicanjiapinggu");
            return (Criteria) this;
        }

        public Criteria andWeicanjiapingguBetween(String value1, String value2) {
            addCriterion("WEICANJIAPINGGU between", value1, value2, "weicanjiapinggu");
            return (Criteria) this;
        }

        public Criteria andWeicanjiapingguNotBetween(String value1, String value2) {
            addCriterion("WEICANJIAPINGGU not between", value1, value2, "weicanjiapinggu");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing3IsNull() {
            addCriterion("YOUHUILEIXING3 is null");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing3IsNotNull() {
            addCriterion("YOUHUILEIXING3 is not null");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing3EqualTo(String value) {
            addCriterion("YOUHUILEIXING3 =", value, "youhuileixing3");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing3NotEqualTo(String value) {
            addCriterion("YOUHUILEIXING3 <>", value, "youhuileixing3");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing3GreaterThan(String value) {
            addCriterion("YOUHUILEIXING3 >", value, "youhuileixing3");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing3GreaterThanOrEqualTo(String value) {
            addCriterion("YOUHUILEIXING3 >=", value, "youhuileixing3");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing3LessThan(String value) {
            addCriterion("YOUHUILEIXING3 <", value, "youhuileixing3");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing3LessThanOrEqualTo(String value) {
            addCriterion("YOUHUILEIXING3 <=", value, "youhuileixing3");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing3Like(String value) {
            addCriterion("YOUHUILEIXING3 like", value, "youhuileixing3");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing3NotLike(String value) {
            addCriterion("YOUHUILEIXING3 not like", value, "youhuileixing3");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing3In(List<String> values) {
            addCriterion("YOUHUILEIXING3 in", values, "youhuileixing3");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing3NotIn(List<String> values) {
            addCriterion("YOUHUILEIXING3 not in", values, "youhuileixing3");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing3Between(String value1, String value2) {
            addCriterion("YOUHUILEIXING3 between", value1, value2, "youhuileixing3");
            return (Criteria) this;
        }

        public Criteria andYouhuileixing3NotBetween(String value1, String value2) {
            addCriterion("YOUHUILEIXING3 not between", value1, value2, "youhuileixing3");
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

        public Criteria andTongzhishuIsNull() {
            addCriterion("TONGZHISHU is null");
            return (Criteria) this;
        }

        public Criteria andTongzhishuIsNotNull() {
            addCriterion("TONGZHISHU is not null");
            return (Criteria) this;
        }

        public Criteria andTongzhishuEqualTo(String value) {
            addCriterion("TONGZHISHU =", value, "tongzhishu");
            return (Criteria) this;
        }

        public Criteria andTongzhishuNotEqualTo(String value) {
            addCriterion("TONGZHISHU <>", value, "tongzhishu");
            return (Criteria) this;
        }

        public Criteria andTongzhishuGreaterThan(String value) {
            addCriterion("TONGZHISHU >", value, "tongzhishu");
            return (Criteria) this;
        }

        public Criteria andTongzhishuGreaterThanOrEqualTo(String value) {
            addCriterion("TONGZHISHU >=", value, "tongzhishu");
            return (Criteria) this;
        }

        public Criteria andTongzhishuLessThan(String value) {
            addCriterion("TONGZHISHU <", value, "tongzhishu");
            return (Criteria) this;
        }

        public Criteria andTongzhishuLessThanOrEqualTo(String value) {
            addCriterion("TONGZHISHU <=", value, "tongzhishu");
            return (Criteria) this;
        }

        public Criteria andTongzhishuLike(String value) {
            addCriterion("TONGZHISHU like", value, "tongzhishu");
            return (Criteria) this;
        }

        public Criteria andTongzhishuNotLike(String value) {
            addCriterion("TONGZHISHU not like", value, "tongzhishu");
            return (Criteria) this;
        }

        public Criteria andTongzhishuIn(List<String> values) {
            addCriterion("TONGZHISHU in", values, "tongzhishu");
            return (Criteria) this;
        }

        public Criteria andTongzhishuNotIn(List<String> values) {
            addCriterion("TONGZHISHU not in", values, "tongzhishu");
            return (Criteria) this;
        }

        public Criteria andTongzhishuBetween(String value1, String value2) {
            addCriterion("TONGZHISHU between", value1, value2, "tongzhishu");
            return (Criteria) this;
        }

        public Criteria andTongzhishuNotBetween(String value1, String value2) {
            addCriterion("TONGZHISHU not between", value1, value2, "tongzhishu");
            return (Criteria) this;
        }

        public Criteria andJianyishuIsNull() {
            addCriterion("JIANYISHU is null");
            return (Criteria) this;
        }

        public Criteria andJianyishuIsNotNull() {
            addCriterion("JIANYISHU is not null");
            return (Criteria) this;
        }

        public Criteria andJianyishuEqualTo(String value) {
            addCriterion("JIANYISHU =", value, "jianyishu");
            return (Criteria) this;
        }

        public Criteria andJianyishuNotEqualTo(String value) {
            addCriterion("JIANYISHU <>", value, "jianyishu");
            return (Criteria) this;
        }

        public Criteria andJianyishuGreaterThan(String value) {
            addCriterion("JIANYISHU >", value, "jianyishu");
            return (Criteria) this;
        }

        public Criteria andJianyishuGreaterThanOrEqualTo(String value) {
            addCriterion("JIANYISHU >=", value, "jianyishu");
            return (Criteria) this;
        }

        public Criteria andJianyishuLessThan(String value) {
            addCriterion("JIANYISHU <", value, "jianyishu");
            return (Criteria) this;
        }

        public Criteria andJianyishuLessThanOrEqualTo(String value) {
            addCriterion("JIANYISHU <=", value, "jianyishu");
            return (Criteria) this;
        }

        public Criteria andJianyishuLike(String value) {
            addCriterion("JIANYISHU like", value, "jianyishu");
            return (Criteria) this;
        }

        public Criteria andJianyishuNotLike(String value) {
            addCriterion("JIANYISHU not like", value, "jianyishu");
            return (Criteria) this;
        }

        public Criteria andJianyishuIn(List<String> values) {
            addCriterion("JIANYISHU in", values, "jianyishu");
            return (Criteria) this;
        }

        public Criteria andJianyishuNotIn(List<String> values) {
            addCriterion("JIANYISHU not in", values, "jianyishu");
            return (Criteria) this;
        }

        public Criteria andJianyishuBetween(String value1, String value2) {
            addCriterion("JIANYISHU between", value1, value2, "jianyishu");
            return (Criteria) this;
        }

        public Criteria andJianyishuNotBetween(String value1, String value2) {
            addCriterion("JIANYISHU not between", value1, value2, "jianyishu");
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