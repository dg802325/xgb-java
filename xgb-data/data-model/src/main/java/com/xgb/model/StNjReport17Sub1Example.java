package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StNjReport17Sub1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StNjReport17Sub1Example() {
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

        public Criteria andGuojizuzhileixingIsNull() {
            addCriterion("GUOJIZUZHILEIXING is null");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhileixingIsNotNull() {
            addCriterion("GUOJIZUZHILEIXING is not null");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhileixingEqualTo(String value) {
            addCriterion("GUOJIZUZHILEIXING =", value, "guojizuzhileixing");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhileixingNotEqualTo(String value) {
            addCriterion("GUOJIZUZHILEIXING <>", value, "guojizuzhileixing");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhileixingGreaterThan(String value) {
            addCriterion("GUOJIZUZHILEIXING >", value, "guojizuzhileixing");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhileixingGreaterThanOrEqualTo(String value) {
            addCriterion("GUOJIZUZHILEIXING >=", value, "guojizuzhileixing");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhileixingLessThan(String value) {
            addCriterion("GUOJIZUZHILEIXING <", value, "guojizuzhileixing");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhileixingLessThanOrEqualTo(String value) {
            addCriterion("GUOJIZUZHILEIXING <=", value, "guojizuzhileixing");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhileixingLike(String value) {
            addCriterion("GUOJIZUZHILEIXING like", value, "guojizuzhileixing");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhileixingNotLike(String value) {
            addCriterion("GUOJIZUZHILEIXING not like", value, "guojizuzhileixing");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhileixingIn(List<String> values) {
            addCriterion("GUOJIZUZHILEIXING in", values, "guojizuzhileixing");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhileixingNotIn(List<String> values) {
            addCriterion("GUOJIZUZHILEIXING not in", values, "guojizuzhileixing");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhileixingBetween(String value1, String value2) {
            addCriterion("GUOJIZUZHILEIXING between", value1, value2, "guojizuzhileixing");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhileixingNotBetween(String value1, String value2) {
            addCriterion("GUOJIZUZHILEIXING not between", value1, value2, "guojizuzhileixing");
            return (Criteria) this;
        }

        public Criteria andZhiwuleixingIsNull() {
            addCriterion("ZHIWULEIXING is null");
            return (Criteria) this;
        }

        public Criteria andZhiwuleixingIsNotNull() {
            addCriterion("ZHIWULEIXING is not null");
            return (Criteria) this;
        }

        public Criteria andZhiwuleixingEqualTo(String value) {
            addCriterion("ZHIWULEIXING =", value, "zhiwuleixing");
            return (Criteria) this;
        }

        public Criteria andZhiwuleixingNotEqualTo(String value) {
            addCriterion("ZHIWULEIXING <>", value, "zhiwuleixing");
            return (Criteria) this;
        }

        public Criteria andZhiwuleixingGreaterThan(String value) {
            addCriterion("ZHIWULEIXING >", value, "zhiwuleixing");
            return (Criteria) this;
        }

        public Criteria andZhiwuleixingGreaterThanOrEqualTo(String value) {
            addCriterion("ZHIWULEIXING >=", value, "zhiwuleixing");
            return (Criteria) this;
        }

        public Criteria andZhiwuleixingLessThan(String value) {
            addCriterion("ZHIWULEIXING <", value, "zhiwuleixing");
            return (Criteria) this;
        }

        public Criteria andZhiwuleixingLessThanOrEqualTo(String value) {
            addCriterion("ZHIWULEIXING <=", value, "zhiwuleixing");
            return (Criteria) this;
        }

        public Criteria andZhiwuleixingLike(String value) {
            addCriterion("ZHIWULEIXING like", value, "zhiwuleixing");
            return (Criteria) this;
        }

        public Criteria andZhiwuleixingNotLike(String value) {
            addCriterion("ZHIWULEIXING not like", value, "zhiwuleixing");
            return (Criteria) this;
        }

        public Criteria andZhiwuleixingIn(List<String> values) {
            addCriterion("ZHIWULEIXING in", values, "zhiwuleixing");
            return (Criteria) this;
        }

        public Criteria andZhiwuleixingNotIn(List<String> values) {
            addCriterion("ZHIWULEIXING not in", values, "zhiwuleixing");
            return (Criteria) this;
        }

        public Criteria andZhiwuleixingBetween(String value1, String value2) {
            addCriterion("ZHIWULEIXING between", value1, value2, "zhiwuleixing");
            return (Criteria) this;
        }

        public Criteria andZhiwuleixingNotBetween(String value1, String value2) {
            addCriterion("ZHIWULEIXING not between", value1, value2, "zhiwuleixing");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhimingchengIsNull() {
            addCriterion("GUOJIZUZHIMINGCHENG is null");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhimingchengIsNotNull() {
            addCriterion("GUOJIZUZHIMINGCHENG is not null");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhimingchengEqualTo(String value) {
            addCriterion("GUOJIZUZHIMINGCHENG =", value, "guojizuzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhimingchengNotEqualTo(String value) {
            addCriterion("GUOJIZUZHIMINGCHENG <>", value, "guojizuzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhimingchengGreaterThan(String value) {
            addCriterion("GUOJIZUZHIMINGCHENG >", value, "guojizuzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhimingchengGreaterThanOrEqualTo(String value) {
            addCriterion("GUOJIZUZHIMINGCHENG >=", value, "guojizuzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhimingchengLessThan(String value) {
            addCriterion("GUOJIZUZHIMINGCHENG <", value, "guojizuzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhimingchengLessThanOrEqualTo(String value) {
            addCriterion("GUOJIZUZHIMINGCHENG <=", value, "guojizuzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhimingchengLike(String value) {
            addCriterion("GUOJIZUZHIMINGCHENG like", value, "guojizuzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhimingchengNotLike(String value) {
            addCriterion("GUOJIZUZHIMINGCHENG not like", value, "guojizuzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhimingchengIn(List<String> values) {
            addCriterion("GUOJIZUZHIMINGCHENG in", values, "guojizuzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhimingchengNotIn(List<String> values) {
            addCriterion("GUOJIZUZHIMINGCHENG not in", values, "guojizuzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhimingchengBetween(String value1, String value2) {
            addCriterion("GUOJIZUZHIMINGCHENG between", value1, value2, "guojizuzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhimingchengNotBetween(String value1, String value2) {
            addCriterion("GUOJIZUZHIMINGCHENG not between", value1, value2, "guojizuzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andCanjiashijianIsNull() {
            addCriterion("CANJIASHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andCanjiashijianIsNotNull() {
            addCriterion("CANJIASHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andCanjiashijianEqualTo(Date value) {
            addCriterion("CANJIASHIJIAN =", value, "canjiashijian");
            return (Criteria) this;
        }

        public Criteria andCanjiashijianNotEqualTo(Date value) {
            addCriterion("CANJIASHIJIAN <>", value, "canjiashijian");
            return (Criteria) this;
        }

        public Criteria andCanjiashijianGreaterThan(Date value) {
            addCriterion("CANJIASHIJIAN >", value, "canjiashijian");
            return (Criteria) this;
        }

        public Criteria andCanjiashijianGreaterThanOrEqualTo(Date value) {
            addCriterion("CANJIASHIJIAN >=", value, "canjiashijian");
            return (Criteria) this;
        }

        public Criteria andCanjiashijianLessThan(Date value) {
            addCriterion("CANJIASHIJIAN <", value, "canjiashijian");
            return (Criteria) this;
        }

        public Criteria andCanjiashijianLessThanOrEqualTo(Date value) {
            addCriterion("CANJIASHIJIAN <=", value, "canjiashijian");
            return (Criteria) this;
        }

        public Criteria andCanjiashijianIn(List<Date> values) {
            addCriterion("CANJIASHIJIAN in", values, "canjiashijian");
            return (Criteria) this;
        }

        public Criteria andCanjiashijianNotIn(List<Date> values) {
            addCriterion("CANJIASHIJIAN not in", values, "canjiashijian");
            return (Criteria) this;
        }

        public Criteria andCanjiashijianBetween(Date value1, Date value2) {
            addCriterion("CANJIASHIJIAN between", value1, value2, "canjiashijian");
            return (Criteria) this;
        }

        public Criteria andCanjiashijianNotBetween(Date value1, Date value2) {
            addCriterion("CANJIASHIJIAN not between", value1, value2, "canjiashijian");
            return (Criteria) this;
        }

        public Criteria andJiaonahuifeishueIsNull() {
            addCriterion("JIAONAHUIFEISHUE is null");
            return (Criteria) this;
        }

        public Criteria andJiaonahuifeishueIsNotNull() {
            addCriterion("JIAONAHUIFEISHUE is not null");
            return (Criteria) this;
        }

        public Criteria andJiaonahuifeishueEqualTo(BigDecimal value) {
            addCriterion("JIAONAHUIFEISHUE =", value, "jiaonahuifeishue");
            return (Criteria) this;
        }

        public Criteria andJiaonahuifeishueNotEqualTo(BigDecimal value) {
            addCriterion("JIAONAHUIFEISHUE <>", value, "jiaonahuifeishue");
            return (Criteria) this;
        }

        public Criteria andJiaonahuifeishueGreaterThan(BigDecimal value) {
            addCriterion("JIAONAHUIFEISHUE >", value, "jiaonahuifeishue");
            return (Criteria) this;
        }

        public Criteria andJiaonahuifeishueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JIAONAHUIFEISHUE >=", value, "jiaonahuifeishue");
            return (Criteria) this;
        }

        public Criteria andJiaonahuifeishueLessThan(BigDecimal value) {
            addCriterion("JIAONAHUIFEISHUE <", value, "jiaonahuifeishue");
            return (Criteria) this;
        }

        public Criteria andJiaonahuifeishueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JIAONAHUIFEISHUE <=", value, "jiaonahuifeishue");
            return (Criteria) this;
        }

        public Criteria andJiaonahuifeishueIn(List<BigDecimal> values) {
            addCriterion("JIAONAHUIFEISHUE in", values, "jiaonahuifeishue");
            return (Criteria) this;
        }

        public Criteria andJiaonahuifeishueNotIn(List<BigDecimal> values) {
            addCriterion("JIAONAHUIFEISHUE not in", values, "jiaonahuifeishue");
            return (Criteria) this;
        }

        public Criteria andJiaonahuifeishueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JIAONAHUIFEISHUE between", value1, value2, "jiaonahuifeishue");
            return (Criteria) this;
        }

        public Criteria andJiaonahuifeishueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JIAONAHUIFEISHUE not between", value1, value2, "jiaonahuifeishue");
            return (Criteria) this;
        }

        public Criteria andRenzhiqishishijianIsNull() {
            addCriterion("RENZHIQISHISHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andRenzhiqishishijianIsNotNull() {
            addCriterion("RENZHIQISHISHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andRenzhiqishishijianEqualTo(Date value) {
            addCriterion("RENZHIQISHISHIJIAN =", value, "renzhiqishishijian");
            return (Criteria) this;
        }

        public Criteria andRenzhiqishishijianNotEqualTo(Date value) {
            addCriterion("RENZHIQISHISHIJIAN <>", value, "renzhiqishishijian");
            return (Criteria) this;
        }

        public Criteria andRenzhiqishishijianGreaterThan(Date value) {
            addCriterion("RENZHIQISHISHIJIAN >", value, "renzhiqishishijian");
            return (Criteria) this;
        }

        public Criteria andRenzhiqishishijianGreaterThanOrEqualTo(Date value) {
            addCriterion("RENZHIQISHISHIJIAN >=", value, "renzhiqishishijian");
            return (Criteria) this;
        }

        public Criteria andRenzhiqishishijianLessThan(Date value) {
            addCriterion("RENZHIQISHISHIJIAN <", value, "renzhiqishishijian");
            return (Criteria) this;
        }

        public Criteria andRenzhiqishishijianLessThanOrEqualTo(Date value) {
            addCriterion("RENZHIQISHISHIJIAN <=", value, "renzhiqishishijian");
            return (Criteria) this;
        }

        public Criteria andRenzhiqishishijianIn(List<Date> values) {
            addCriterion("RENZHIQISHISHIJIAN in", values, "renzhiqishishijian");
            return (Criteria) this;
        }

        public Criteria andRenzhiqishishijianNotIn(List<Date> values) {
            addCriterion("RENZHIQISHISHIJIAN not in", values, "renzhiqishishijian");
            return (Criteria) this;
        }

        public Criteria andRenzhiqishishijianBetween(Date value1, Date value2) {
            addCriterion("RENZHIQISHISHIJIAN between", value1, value2, "renzhiqishishijian");
            return (Criteria) this;
        }

        public Criteria andRenzhiqishishijianNotBetween(Date value1, Date value2) {
            addCriterion("RENZHIQISHISHIJIAN not between", value1, value2, "renzhiqishishijian");
            return (Criteria) this;
        }

        public Criteria andRenzhizhongzhishijianIsNull() {
            addCriterion("RENZHIZHONGZHISHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andRenzhizhongzhishijianIsNotNull() {
            addCriterion("RENZHIZHONGZHISHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andRenzhizhongzhishijianEqualTo(Date value) {
            addCriterion("RENZHIZHONGZHISHIJIAN =", value, "renzhizhongzhishijian");
            return (Criteria) this;
        }

        public Criteria andRenzhizhongzhishijianNotEqualTo(Date value) {
            addCriterion("RENZHIZHONGZHISHIJIAN <>", value, "renzhizhongzhishijian");
            return (Criteria) this;
        }

        public Criteria andRenzhizhongzhishijianGreaterThan(Date value) {
            addCriterion("RENZHIZHONGZHISHIJIAN >", value, "renzhizhongzhishijian");
            return (Criteria) this;
        }

        public Criteria andRenzhizhongzhishijianGreaterThanOrEqualTo(Date value) {
            addCriterion("RENZHIZHONGZHISHIJIAN >=", value, "renzhizhongzhishijian");
            return (Criteria) this;
        }

        public Criteria andRenzhizhongzhishijianLessThan(Date value) {
            addCriterion("RENZHIZHONGZHISHIJIAN <", value, "renzhizhongzhishijian");
            return (Criteria) this;
        }

        public Criteria andRenzhizhongzhishijianLessThanOrEqualTo(Date value) {
            addCriterion("RENZHIZHONGZHISHIJIAN <=", value, "renzhizhongzhishijian");
            return (Criteria) this;
        }

        public Criteria andRenzhizhongzhishijianIn(List<Date> values) {
            addCriterion("RENZHIZHONGZHISHIJIAN in", values, "renzhizhongzhishijian");
            return (Criteria) this;
        }

        public Criteria andRenzhizhongzhishijianNotIn(List<Date> values) {
            addCriterion("RENZHIZHONGZHISHIJIAN not in", values, "renzhizhongzhishijian");
            return (Criteria) this;
        }

        public Criteria andRenzhizhongzhishijianBetween(Date value1, Date value2) {
            addCriterion("RENZHIZHONGZHISHIJIAN between", value1, value2, "renzhizhongzhishijian");
            return (Criteria) this;
        }

        public Criteria andRenzhizhongzhishijianNotBetween(Date value1, Date value2) {
            addCriterion("RENZHIZHONGZHISHIJIAN not between", value1, value2, "renzhizhongzhishijian");
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

        public Criteria andZiduan3IsNull() {
            addCriterion("ZIDUAN3 is null");
            return (Criteria) this;
        }

        public Criteria andZiduan3IsNotNull() {
            addCriterion("ZIDUAN3 is not null");
            return (Criteria) this;
        }

        public Criteria andZiduan3EqualTo(String value) {
            addCriterion("ZIDUAN3 =", value, "ziduan3");
            return (Criteria) this;
        }

        public Criteria andZiduan3NotEqualTo(String value) {
            addCriterion("ZIDUAN3 <>", value, "ziduan3");
            return (Criteria) this;
        }

        public Criteria andZiduan3GreaterThan(String value) {
            addCriterion("ZIDUAN3 >", value, "ziduan3");
            return (Criteria) this;
        }

        public Criteria andZiduan3GreaterThanOrEqualTo(String value) {
            addCriterion("ZIDUAN3 >=", value, "ziduan3");
            return (Criteria) this;
        }

        public Criteria andZiduan3LessThan(String value) {
            addCriterion("ZIDUAN3 <", value, "ziduan3");
            return (Criteria) this;
        }

        public Criteria andZiduan3LessThanOrEqualTo(String value) {
            addCriterion("ZIDUAN3 <=", value, "ziduan3");
            return (Criteria) this;
        }

        public Criteria andZiduan3Like(String value) {
            addCriterion("ZIDUAN3 like", value, "ziduan3");
            return (Criteria) this;
        }

        public Criteria andZiduan3NotLike(String value) {
            addCriterion("ZIDUAN3 not like", value, "ziduan3");
            return (Criteria) this;
        }

        public Criteria andZiduan3In(List<String> values) {
            addCriterion("ZIDUAN3 in", values, "ziduan3");
            return (Criteria) this;
        }

        public Criteria andZiduan3NotIn(List<String> values) {
            addCriterion("ZIDUAN3 not in", values, "ziduan3");
            return (Criteria) this;
        }

        public Criteria andZiduan3Between(String value1, String value2) {
            addCriterion("ZIDUAN3 between", value1, value2, "ziduan3");
            return (Criteria) this;
        }

        public Criteria andZiduan3NotBetween(String value1, String value2) {
            addCriterion("ZIDUAN3 not between", value1, value2, "ziduan3");
            return (Criteria) this;
        }

        public Criteria andZiduan4IsNull() {
            addCriterion("ZIDUAN4 is null");
            return (Criteria) this;
        }

        public Criteria andZiduan4IsNotNull() {
            addCriterion("ZIDUAN4 is not null");
            return (Criteria) this;
        }

        public Criteria andZiduan4EqualTo(String value) {
            addCriterion("ZIDUAN4 =", value, "ziduan4");
            return (Criteria) this;
        }

        public Criteria andZiduan4NotEqualTo(String value) {
            addCriterion("ZIDUAN4 <>", value, "ziduan4");
            return (Criteria) this;
        }

        public Criteria andZiduan4GreaterThan(String value) {
            addCriterion("ZIDUAN4 >", value, "ziduan4");
            return (Criteria) this;
        }

        public Criteria andZiduan4GreaterThanOrEqualTo(String value) {
            addCriterion("ZIDUAN4 >=", value, "ziduan4");
            return (Criteria) this;
        }

        public Criteria andZiduan4LessThan(String value) {
            addCriterion("ZIDUAN4 <", value, "ziduan4");
            return (Criteria) this;
        }

        public Criteria andZiduan4LessThanOrEqualTo(String value) {
            addCriterion("ZIDUAN4 <=", value, "ziduan4");
            return (Criteria) this;
        }

        public Criteria andZiduan4Like(String value) {
            addCriterion("ZIDUAN4 like", value, "ziduan4");
            return (Criteria) this;
        }

        public Criteria andZiduan4NotLike(String value) {
            addCriterion("ZIDUAN4 not like", value, "ziduan4");
            return (Criteria) this;
        }

        public Criteria andZiduan4In(List<String> values) {
            addCriterion("ZIDUAN4 in", values, "ziduan4");
            return (Criteria) this;
        }

        public Criteria andZiduan4NotIn(List<String> values) {
            addCriterion("ZIDUAN4 not in", values, "ziduan4");
            return (Criteria) this;
        }

        public Criteria andZiduan4Between(String value1, String value2) {
            addCriterion("ZIDUAN4 between", value1, value2, "ziduan4");
            return (Criteria) this;
        }

        public Criteria andZiduan4NotBetween(String value1, String value2) {
            addCriterion("ZIDUAN4 not between", value1, value2, "ziduan4");
            return (Criteria) this;
        }

        public Criteria andZiduan5IsNull() {
            addCriterion("ZIDUAN5 is null");
            return (Criteria) this;
        }

        public Criteria andZiduan5IsNotNull() {
            addCriterion("ZIDUAN5 is not null");
            return (Criteria) this;
        }

        public Criteria andZiduan5EqualTo(String value) {
            addCriterion("ZIDUAN5 =", value, "ziduan5");
            return (Criteria) this;
        }

        public Criteria andZiduan5NotEqualTo(String value) {
            addCriterion("ZIDUAN5 <>", value, "ziduan5");
            return (Criteria) this;
        }

        public Criteria andZiduan5GreaterThan(String value) {
            addCriterion("ZIDUAN5 >", value, "ziduan5");
            return (Criteria) this;
        }

        public Criteria andZiduan5GreaterThanOrEqualTo(String value) {
            addCriterion("ZIDUAN5 >=", value, "ziduan5");
            return (Criteria) this;
        }

        public Criteria andZiduan5LessThan(String value) {
            addCriterion("ZIDUAN5 <", value, "ziduan5");
            return (Criteria) this;
        }

        public Criteria andZiduan5LessThanOrEqualTo(String value) {
            addCriterion("ZIDUAN5 <=", value, "ziduan5");
            return (Criteria) this;
        }

        public Criteria andZiduan5Like(String value) {
            addCriterion("ZIDUAN5 like", value, "ziduan5");
            return (Criteria) this;
        }

        public Criteria andZiduan5NotLike(String value) {
            addCriterion("ZIDUAN5 not like", value, "ziduan5");
            return (Criteria) this;
        }

        public Criteria andZiduan5In(List<String> values) {
            addCriterion("ZIDUAN5 in", values, "ziduan5");
            return (Criteria) this;
        }

        public Criteria andZiduan5NotIn(List<String> values) {
            addCriterion("ZIDUAN5 not in", values, "ziduan5");
            return (Criteria) this;
        }

        public Criteria andZiduan5Between(String value1, String value2) {
            addCriterion("ZIDUAN5 between", value1, value2, "ziduan5");
            return (Criteria) this;
        }

        public Criteria andZiduan5NotBetween(String value1, String value2) {
            addCriterion("ZIDUAN5 not between", value1, value2, "ziduan5");
            return (Criteria) this;
        }

        public Criteria andZiduan6IsNull() {
            addCriterion("ZIDUAN6 is null");
            return (Criteria) this;
        }

        public Criteria andZiduan6IsNotNull() {
            addCriterion("ZIDUAN6 is not null");
            return (Criteria) this;
        }

        public Criteria andZiduan6EqualTo(String value) {
            addCriterion("ZIDUAN6 =", value, "ziduan6");
            return (Criteria) this;
        }

        public Criteria andZiduan6NotEqualTo(String value) {
            addCriterion("ZIDUAN6 <>", value, "ziduan6");
            return (Criteria) this;
        }

        public Criteria andZiduan6GreaterThan(String value) {
            addCriterion("ZIDUAN6 >", value, "ziduan6");
            return (Criteria) this;
        }

        public Criteria andZiduan6GreaterThanOrEqualTo(String value) {
            addCriterion("ZIDUAN6 >=", value, "ziduan6");
            return (Criteria) this;
        }

        public Criteria andZiduan6LessThan(String value) {
            addCriterion("ZIDUAN6 <", value, "ziduan6");
            return (Criteria) this;
        }

        public Criteria andZiduan6LessThanOrEqualTo(String value) {
            addCriterion("ZIDUAN6 <=", value, "ziduan6");
            return (Criteria) this;
        }

        public Criteria andZiduan6Like(String value) {
            addCriterion("ZIDUAN6 like", value, "ziduan6");
            return (Criteria) this;
        }

        public Criteria andZiduan6NotLike(String value) {
            addCriterion("ZIDUAN6 not like", value, "ziduan6");
            return (Criteria) this;
        }

        public Criteria andZiduan6In(List<String> values) {
            addCriterion("ZIDUAN6 in", values, "ziduan6");
            return (Criteria) this;
        }

        public Criteria andZiduan6NotIn(List<String> values) {
            addCriterion("ZIDUAN6 not in", values, "ziduan6");
            return (Criteria) this;
        }

        public Criteria andZiduan6Between(String value1, String value2) {
            addCriterion("ZIDUAN6 between", value1, value2, "ziduan6");
            return (Criteria) this;
        }

        public Criteria andZiduan6NotBetween(String value1, String value2) {
            addCriterion("ZIDUAN6 not between", value1, value2, "ziduan6");
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