package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JjhNjReportGqstqkItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JjhNjReportGqstqkItemExample() {
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

        public Criteria andMingchengIsNull() {
            addCriterion("MINGCHENG is null");
            return (Criteria) this;
        }

        public Criteria andMingchengIsNotNull() {
            addCriterion("MINGCHENG is not null");
            return (Criteria) this;
        }

        public Criteria andMingchengEqualTo(Object value) {
            addCriterion("MINGCHENG =", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengNotEqualTo(Object value) {
            addCriterion("MINGCHENG <>", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengGreaterThan(Object value) {
            addCriterion("MINGCHENG >", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengGreaterThanOrEqualTo(Object value) {
            addCriterion("MINGCHENG >=", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengLessThan(Object value) {
            addCriterion("MINGCHENG <", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengLessThanOrEqualTo(Object value) {
            addCriterion("MINGCHENG <=", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengIn(List<Object> values) {
            addCriterion("MINGCHENG in", values, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengNotIn(List<Object> values) {
            addCriterion("MINGCHENG not in", values, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengBetween(Object value1, Object value2) {
            addCriterion("MINGCHENG between", value1, value2, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengNotBetween(Object value1, Object value2) {
            addCriterion("MINGCHENG not between", value1, value2, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andShelishijianIsNull() {
            addCriterion("SHELISHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andShelishijianIsNotNull() {
            addCriterion("SHELISHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andShelishijianEqualTo(Date value) {
            addCriterion("SHELISHIJIAN =", value, "shelishijian");
            return (Criteria) this;
        }

        public Criteria andShelishijianNotEqualTo(Date value) {
            addCriterion("SHELISHIJIAN <>", value, "shelishijian");
            return (Criteria) this;
        }

        public Criteria andShelishijianGreaterThan(Date value) {
            addCriterion("SHELISHIJIAN >", value, "shelishijian");
            return (Criteria) this;
        }

        public Criteria andShelishijianGreaterThanOrEqualTo(Date value) {
            addCriterion("SHELISHIJIAN >=", value, "shelishijian");
            return (Criteria) this;
        }

        public Criteria andShelishijianLessThan(Date value) {
            addCriterion("SHELISHIJIAN <", value, "shelishijian");
            return (Criteria) this;
        }

        public Criteria andShelishijianLessThanOrEqualTo(Date value) {
            addCriterion("SHELISHIJIAN <=", value, "shelishijian");
            return (Criteria) this;
        }

        public Criteria andShelishijianIn(List<Date> values) {
            addCriterion("SHELISHIJIAN in", values, "shelishijian");
            return (Criteria) this;
        }

        public Criteria andShelishijianNotIn(List<Date> values) {
            addCriterion("SHELISHIJIAN not in", values, "shelishijian");
            return (Criteria) this;
        }

        public Criteria andShelishijianBetween(Date value1, Date value2) {
            addCriterion("SHELISHIJIAN between", value1, value2, "shelishijian");
            return (Criteria) this;
        }

        public Criteria andShelishijianNotBetween(Date value1, Date value2) {
            addCriterion("SHELISHIJIAN not between", value1, value2, "shelishijian");
            return (Criteria) this;
        }

        public Criteria andDaibiaorenIsNull() {
            addCriterion("DAIBIAOREN is null");
            return (Criteria) this;
        }

        public Criteria andDaibiaorenIsNotNull() {
            addCriterion("DAIBIAOREN is not null");
            return (Criteria) this;
        }

        public Criteria andDaibiaorenEqualTo(Object value) {
            addCriterion("DAIBIAOREN =", value, "daibiaoren");
            return (Criteria) this;
        }

        public Criteria andDaibiaorenNotEqualTo(Object value) {
            addCriterion("DAIBIAOREN <>", value, "daibiaoren");
            return (Criteria) this;
        }

        public Criteria andDaibiaorenGreaterThan(Object value) {
            addCriterion("DAIBIAOREN >", value, "daibiaoren");
            return (Criteria) this;
        }

        public Criteria andDaibiaorenGreaterThanOrEqualTo(Object value) {
            addCriterion("DAIBIAOREN >=", value, "daibiaoren");
            return (Criteria) this;
        }

        public Criteria andDaibiaorenLessThan(Object value) {
            addCriterion("DAIBIAOREN <", value, "daibiaoren");
            return (Criteria) this;
        }

        public Criteria andDaibiaorenLessThanOrEqualTo(Object value) {
            addCriterion("DAIBIAOREN <=", value, "daibiaoren");
            return (Criteria) this;
        }

        public Criteria andDaibiaorenIn(List<Object> values) {
            addCriterion("DAIBIAOREN in", values, "daibiaoren");
            return (Criteria) this;
        }

        public Criteria andDaibiaorenNotIn(List<Object> values) {
            addCriterion("DAIBIAOREN not in", values, "daibiaoren");
            return (Criteria) this;
        }

        public Criteria andDaibiaorenBetween(Object value1, Object value2) {
            addCriterion("DAIBIAOREN between", value1, value2, "daibiaoren");
            return (Criteria) this;
        }

        public Criteria andDaibiaorenNotBetween(Object value1, Object value2) {
            addCriterion("DAIBIAOREN not between", value1, value2, "daibiaoren");
            return (Criteria) this;
        }

        public Criteria andDengjileixingIsNull() {
            addCriterion("DENGJILEIXING is null");
            return (Criteria) this;
        }

        public Criteria andDengjileixingIsNotNull() {
            addCriterion("DENGJILEIXING is not null");
            return (Criteria) this;
        }

        public Criteria andDengjileixingEqualTo(String value) {
            addCriterion("DENGJILEIXING =", value, "dengjileixing");
            return (Criteria) this;
        }

        public Criteria andDengjileixingNotEqualTo(String value) {
            addCriterion("DENGJILEIXING <>", value, "dengjileixing");
            return (Criteria) this;
        }

        public Criteria andDengjileixingGreaterThan(String value) {
            addCriterion("DENGJILEIXING >", value, "dengjileixing");
            return (Criteria) this;
        }

        public Criteria andDengjileixingGreaterThanOrEqualTo(String value) {
            addCriterion("DENGJILEIXING >=", value, "dengjileixing");
            return (Criteria) this;
        }

        public Criteria andDengjileixingLessThan(String value) {
            addCriterion("DENGJILEIXING <", value, "dengjileixing");
            return (Criteria) this;
        }

        public Criteria andDengjileixingLessThanOrEqualTo(String value) {
            addCriterion("DENGJILEIXING <=", value, "dengjileixing");
            return (Criteria) this;
        }

        public Criteria andDengjileixingLike(String value) {
            addCriterion("DENGJILEIXING like", value, "dengjileixing");
            return (Criteria) this;
        }

        public Criteria andDengjileixingNotLike(String value) {
            addCriterion("DENGJILEIXING not like", value, "dengjileixing");
            return (Criteria) this;
        }

        public Criteria andDengjileixingIn(List<String> values) {
            addCriterion("DENGJILEIXING in", values, "dengjileixing");
            return (Criteria) this;
        }

        public Criteria andDengjileixingNotIn(List<String> values) {
            addCriterion("DENGJILEIXING not in", values, "dengjileixing");
            return (Criteria) this;
        }

        public Criteria andDengjileixingBetween(String value1, String value2) {
            addCriterion("DENGJILEIXING between", value1, value2, "dengjileixing");
            return (Criteria) this;
        }

        public Criteria andDengjileixingNotBetween(String value1, String value2) {
            addCriterion("DENGJILEIXING not between", value1, value2, "dengjileixing");
            return (Criteria) this;
        }

        public Criteria andStzhucezijinIsNull() {
            addCriterion("STZHUCEZIJIN is null");
            return (Criteria) this;
        }

        public Criteria andStzhucezijinIsNotNull() {
            addCriterion("STZHUCEZIJIN is not null");
            return (Criteria) this;
        }

        public Criteria andStzhucezijinEqualTo(BigDecimal value) {
            addCriterion("STZHUCEZIJIN =", value, "stzhucezijin");
            return (Criteria) this;
        }

        public Criteria andStzhucezijinNotEqualTo(BigDecimal value) {
            addCriterion("STZHUCEZIJIN <>", value, "stzhucezijin");
            return (Criteria) this;
        }

        public Criteria andStzhucezijinGreaterThan(BigDecimal value) {
            addCriterion("STZHUCEZIJIN >", value, "stzhucezijin");
            return (Criteria) this;
        }

        public Criteria andStzhucezijinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STZHUCEZIJIN >=", value, "stzhucezijin");
            return (Criteria) this;
        }

        public Criteria andStzhucezijinLessThan(BigDecimal value) {
            addCriterion("STZHUCEZIJIN <", value, "stzhucezijin");
            return (Criteria) this;
        }

        public Criteria andStzhucezijinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STZHUCEZIJIN <=", value, "stzhucezijin");
            return (Criteria) this;
        }

        public Criteria andStzhucezijinIn(List<BigDecimal> values) {
            addCriterion("STZHUCEZIJIN in", values, "stzhucezijin");
            return (Criteria) this;
        }

        public Criteria andStzhucezijinNotIn(List<BigDecimal> values) {
            addCriterion("STZHUCEZIJIN not in", values, "stzhucezijin");
            return (Criteria) this;
        }

        public Criteria andStzhucezijinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STZHUCEZIJIN between", value1, value2, "stzhucezijin");
            return (Criteria) this;
        }

        public Criteria andStzhucezijinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STZHUCEZIJIN not between", value1, value2, "stzhucezijin");
            return (Criteria) this;
        }

        public Criteria andRjzhucezijinIsNull() {
            addCriterion("RJZHUCEZIJIN is null");
            return (Criteria) this;
        }

        public Criteria andRjzhucezijinIsNotNull() {
            addCriterion("RJZHUCEZIJIN is not null");
            return (Criteria) this;
        }

        public Criteria andRjzhucezijinEqualTo(BigDecimal value) {
            addCriterion("RJZHUCEZIJIN =", value, "rjzhucezijin");
            return (Criteria) this;
        }

        public Criteria andRjzhucezijinNotEqualTo(BigDecimal value) {
            addCriterion("RJZHUCEZIJIN <>", value, "rjzhucezijin");
            return (Criteria) this;
        }

        public Criteria andRjzhucezijinGreaterThan(BigDecimal value) {
            addCriterion("RJZHUCEZIJIN >", value, "rjzhucezijin");
            return (Criteria) this;
        }

        public Criteria andRjzhucezijinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RJZHUCEZIJIN >=", value, "rjzhucezijin");
            return (Criteria) this;
        }

        public Criteria andRjzhucezijinLessThan(BigDecimal value) {
            addCriterion("RJZHUCEZIJIN <", value, "rjzhucezijin");
            return (Criteria) this;
        }

        public Criteria andRjzhucezijinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RJZHUCEZIJIN <=", value, "rjzhucezijin");
            return (Criteria) this;
        }

        public Criteria andRjzhucezijinIn(List<BigDecimal> values) {
            addCriterion("RJZHUCEZIJIN in", values, "rjzhucezijin");
            return (Criteria) this;
        }

        public Criteria andRjzhucezijinNotIn(List<BigDecimal> values) {
            addCriterion("RJZHUCEZIJIN not in", values, "rjzhucezijin");
            return (Criteria) this;
        }

        public Criteria andRjzhucezijinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RJZHUCEZIJIN between", value1, value2, "rjzhucezijin");
            return (Criteria) this;
        }

        public Criteria andRjzhucezijinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RJZHUCEZIJIN not between", value1, value2, "rjzhucezijin");
            return (Criteria) this;
        }

        public Criteria andJjhchuzieIsNull() {
            addCriterion("JJHCHUZIE is null");
            return (Criteria) this;
        }

        public Criteria andJjhchuzieIsNotNull() {
            addCriterion("JJHCHUZIE is not null");
            return (Criteria) this;
        }

        public Criteria andJjhchuzieEqualTo(BigDecimal value) {
            addCriterion("JJHCHUZIE =", value, "jjhchuzie");
            return (Criteria) this;
        }

        public Criteria andJjhchuzieNotEqualTo(BigDecimal value) {
            addCriterion("JJHCHUZIE <>", value, "jjhchuzie");
            return (Criteria) this;
        }

        public Criteria andJjhchuzieGreaterThan(BigDecimal value) {
            addCriterion("JJHCHUZIE >", value, "jjhchuzie");
            return (Criteria) this;
        }

        public Criteria andJjhchuzieGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JJHCHUZIE >=", value, "jjhchuzie");
            return (Criteria) this;
        }

        public Criteria andJjhchuzieLessThan(BigDecimal value) {
            addCriterion("JJHCHUZIE <", value, "jjhchuzie");
            return (Criteria) this;
        }

        public Criteria andJjhchuzieLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JJHCHUZIE <=", value, "jjhchuzie");
            return (Criteria) this;
        }

        public Criteria andJjhchuzieIn(List<BigDecimal> values) {
            addCriterion("JJHCHUZIE in", values, "jjhchuzie");
            return (Criteria) this;
        }

        public Criteria andJjhchuzieNotIn(List<BigDecimal> values) {
            addCriterion("JJHCHUZIE not in", values, "jjhchuzie");
            return (Criteria) this;
        }

        public Criteria andJjhchuzieBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JJHCHUZIE between", value1, value2, "jjhchuzie");
            return (Criteria) this;
        }

        public Criteria andJjhchuzieNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JJHCHUZIE not between", value1, value2, "jjhchuzie");
            return (Criteria) this;
        }

        public Criteria andChigubiliIsNull() {
            addCriterion("CHIGUBILI is null");
            return (Criteria) this;
        }

        public Criteria andChigubiliIsNotNull() {
            addCriterion("CHIGUBILI is not null");
            return (Criteria) this;
        }

        public Criteria andChigubiliEqualTo(String value) {
            addCriterion("CHIGUBILI =", value, "chigubili");
            return (Criteria) this;
        }

        public Criteria andChigubiliNotEqualTo(String value) {
            addCriterion("CHIGUBILI <>", value, "chigubili");
            return (Criteria) this;
        }

        public Criteria andChigubiliGreaterThan(String value) {
            addCriterion("CHIGUBILI >", value, "chigubili");
            return (Criteria) this;
        }

        public Criteria andChigubiliGreaterThanOrEqualTo(String value) {
            addCriterion("CHIGUBILI >=", value, "chigubili");
            return (Criteria) this;
        }

        public Criteria andChigubiliLessThan(String value) {
            addCriterion("CHIGUBILI <", value, "chigubili");
            return (Criteria) this;
        }

        public Criteria andChigubiliLessThanOrEqualTo(String value) {
            addCriterion("CHIGUBILI <=", value, "chigubili");
            return (Criteria) this;
        }

        public Criteria andChigubiliLike(String value) {
            addCriterion("CHIGUBILI like", value, "chigubili");
            return (Criteria) this;
        }

        public Criteria andChigubiliNotLike(String value) {
            addCriterion("CHIGUBILI not like", value, "chigubili");
            return (Criteria) this;
        }

        public Criteria andChigubiliIn(List<String> values) {
            addCriterion("CHIGUBILI in", values, "chigubili");
            return (Criteria) this;
        }

        public Criteria andChigubiliNotIn(List<String> values) {
            addCriterion("CHIGUBILI not in", values, "chigubili");
            return (Criteria) this;
        }

        public Criteria andChigubiliBetween(String value1, String value2) {
            addCriterion("CHIGUBILI between", value1, value2, "chigubili");
            return (Criteria) this;
        }

        public Criteria andChigubiliNotBetween(String value1, String value2) {
            addCriterion("CHIGUBILI not between", value1, value2, "chigubili");
            return (Criteria) this;
        }

        public Criteria andTzjjhbiliIsNull() {
            addCriterion("TZJJHBILI is null");
            return (Criteria) this;
        }

        public Criteria andTzjjhbiliIsNotNull() {
            addCriterion("TZJJHBILI is not null");
            return (Criteria) this;
        }

        public Criteria andTzjjhbiliEqualTo(String value) {
            addCriterion("TZJJHBILI =", value, "tzjjhbili");
            return (Criteria) this;
        }

        public Criteria andTzjjhbiliNotEqualTo(String value) {
            addCriterion("TZJJHBILI <>", value, "tzjjhbili");
            return (Criteria) this;
        }

        public Criteria andTzjjhbiliGreaterThan(String value) {
            addCriterion("TZJJHBILI >", value, "tzjjhbili");
            return (Criteria) this;
        }

        public Criteria andTzjjhbiliGreaterThanOrEqualTo(String value) {
            addCriterion("TZJJHBILI >=", value, "tzjjhbili");
            return (Criteria) this;
        }

        public Criteria andTzjjhbiliLessThan(String value) {
            addCriterion("TZJJHBILI <", value, "tzjjhbili");
            return (Criteria) this;
        }

        public Criteria andTzjjhbiliLessThanOrEqualTo(String value) {
            addCriterion("TZJJHBILI <=", value, "tzjjhbili");
            return (Criteria) this;
        }

        public Criteria andTzjjhbiliLike(String value) {
            addCriterion("TZJJHBILI like", value, "tzjjhbili");
            return (Criteria) this;
        }

        public Criteria andTzjjhbiliNotLike(String value) {
            addCriterion("TZJJHBILI not like", value, "tzjjhbili");
            return (Criteria) this;
        }

        public Criteria andTzjjhbiliIn(List<String> values) {
            addCriterion("TZJJHBILI in", values, "tzjjhbili");
            return (Criteria) this;
        }

        public Criteria andTzjjhbiliNotIn(List<String> values) {
            addCriterion("TZJJHBILI not in", values, "tzjjhbili");
            return (Criteria) this;
        }

        public Criteria andTzjjhbiliBetween(String value1, String value2) {
            addCriterion("TZJJHBILI between", value1, value2, "tzjjhbili");
            return (Criteria) this;
        }

        public Criteria andTzjjhbiliNotBetween(String value1, String value2) {
            addCriterion("TZJJHBILI not between", value1, value2, "tzjjhbili");
            return (Criteria) this;
        }

        public Criteria andJjhguanxiIsNull() {
            addCriterion("JJHGUANXI is null");
            return (Criteria) this;
        }

        public Criteria andJjhguanxiIsNotNull() {
            addCriterion("JJHGUANXI is not null");
            return (Criteria) this;
        }

        public Criteria andJjhguanxiEqualTo(Object value) {
            addCriterion("JJHGUANXI =", value, "jjhguanxi");
            return (Criteria) this;
        }

        public Criteria andJjhguanxiNotEqualTo(Object value) {
            addCriterion("JJHGUANXI <>", value, "jjhguanxi");
            return (Criteria) this;
        }

        public Criteria andJjhguanxiGreaterThan(Object value) {
            addCriterion("JJHGUANXI >", value, "jjhguanxi");
            return (Criteria) this;
        }

        public Criteria andJjhguanxiGreaterThanOrEqualTo(Object value) {
            addCriterion("JJHGUANXI >=", value, "jjhguanxi");
            return (Criteria) this;
        }

        public Criteria andJjhguanxiLessThan(Object value) {
            addCriterion("JJHGUANXI <", value, "jjhguanxi");
            return (Criteria) this;
        }

        public Criteria andJjhguanxiLessThanOrEqualTo(Object value) {
            addCriterion("JJHGUANXI <=", value, "jjhguanxi");
            return (Criteria) this;
        }

        public Criteria andJjhguanxiIn(List<Object> values) {
            addCriterion("JJHGUANXI in", values, "jjhguanxi");
            return (Criteria) this;
        }

        public Criteria andJjhguanxiNotIn(List<Object> values) {
            addCriterion("JJHGUANXI not in", values, "jjhguanxi");
            return (Criteria) this;
        }

        public Criteria andJjhguanxiBetween(Object value1, Object value2) {
            addCriterion("JJHGUANXI between", value1, value2, "jjhguanxi");
            return (Criteria) this;
        }

        public Criteria andJjhguanxiNotBetween(Object value1, Object value2) {
            addCriterion("JJHGUANXI not between", value1, value2, "jjhguanxi");
            return (Criteria) this;
        }

        public Criteria andHesuanfangfaIsNull() {
            addCriterion("HESUANFANGFA is null");
            return (Criteria) this;
        }

        public Criteria andHesuanfangfaIsNotNull() {
            addCriterion("HESUANFANGFA is not null");
            return (Criteria) this;
        }

        public Criteria andHesuanfangfaEqualTo(Object value) {
            addCriterion("HESUANFANGFA =", value, "hesuanfangfa");
            return (Criteria) this;
        }

        public Criteria andHesuanfangfaNotEqualTo(Object value) {
            addCriterion("HESUANFANGFA <>", value, "hesuanfangfa");
            return (Criteria) this;
        }

        public Criteria andHesuanfangfaGreaterThan(Object value) {
            addCriterion("HESUANFANGFA >", value, "hesuanfangfa");
            return (Criteria) this;
        }

        public Criteria andHesuanfangfaGreaterThanOrEqualTo(Object value) {
            addCriterion("HESUANFANGFA >=", value, "hesuanfangfa");
            return (Criteria) this;
        }

        public Criteria andHesuanfangfaLessThan(Object value) {
            addCriterion("HESUANFANGFA <", value, "hesuanfangfa");
            return (Criteria) this;
        }

        public Criteria andHesuanfangfaLessThanOrEqualTo(Object value) {
            addCriterion("HESUANFANGFA <=", value, "hesuanfangfa");
            return (Criteria) this;
        }

        public Criteria andHesuanfangfaIn(List<Object> values) {
            addCriterion("HESUANFANGFA in", values, "hesuanfangfa");
            return (Criteria) this;
        }

        public Criteria andHesuanfangfaNotIn(List<Object> values) {
            addCriterion("HESUANFANGFA not in", values, "hesuanfangfa");
            return (Criteria) this;
        }

        public Criteria andHesuanfangfaBetween(Object value1, Object value2) {
            addCriterion("HESUANFANGFA between", value1, value2, "hesuanfangfa");
            return (Criteria) this;
        }

        public Criteria andHesuanfangfaNotBetween(Object value1, Object value2) {
            addCriterion("HESUANFANGFA not between", value1, value2, "hesuanfangfa");
            return (Criteria) this;
        }

        public Criteria andQichuyueIsNull() {
            addCriterion("QICHUYUE is null");
            return (Criteria) this;
        }

        public Criteria andQichuyueIsNotNull() {
            addCriterion("QICHUYUE is not null");
            return (Criteria) this;
        }

        public Criteria andQichuyueEqualTo(BigDecimal value) {
            addCriterion("QICHUYUE =", value, "qichuyue");
            return (Criteria) this;
        }

        public Criteria andQichuyueNotEqualTo(BigDecimal value) {
            addCriterion("QICHUYUE <>", value, "qichuyue");
            return (Criteria) this;
        }

        public Criteria andQichuyueGreaterThan(BigDecimal value) {
            addCriterion("QICHUYUE >", value, "qichuyue");
            return (Criteria) this;
        }

        public Criteria andQichuyueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QICHUYUE >=", value, "qichuyue");
            return (Criteria) this;
        }

        public Criteria andQichuyueLessThan(BigDecimal value) {
            addCriterion("QICHUYUE <", value, "qichuyue");
            return (Criteria) this;
        }

        public Criteria andQichuyueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QICHUYUE <=", value, "qichuyue");
            return (Criteria) this;
        }

        public Criteria andQichuyueIn(List<BigDecimal> values) {
            addCriterion("QICHUYUE in", values, "qichuyue");
            return (Criteria) this;
        }

        public Criteria andQichuyueNotIn(List<BigDecimal> values) {
            addCriterion("QICHUYUE not in", values, "qichuyue");
            return (Criteria) this;
        }

        public Criteria andQichuyueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QICHUYUE between", value1, value2, "qichuyue");
            return (Criteria) this;
        }

        public Criteria andQichuyueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QICHUYUE not between", value1, value2, "qichuyue");
            return (Criteria) this;
        }

        public Criteria andBenqizengjiaIsNull() {
            addCriterion("BENQIZENGJIA is null");
            return (Criteria) this;
        }

        public Criteria andBenqizengjiaIsNotNull() {
            addCriterion("BENQIZENGJIA is not null");
            return (Criteria) this;
        }

        public Criteria andBenqizengjiaEqualTo(BigDecimal value) {
            addCriterion("BENQIZENGJIA =", value, "benqizengjia");
            return (Criteria) this;
        }

        public Criteria andBenqizengjiaNotEqualTo(BigDecimal value) {
            addCriterion("BENQIZENGJIA <>", value, "benqizengjia");
            return (Criteria) this;
        }

        public Criteria andBenqizengjiaGreaterThan(BigDecimal value) {
            addCriterion("BENQIZENGJIA >", value, "benqizengjia");
            return (Criteria) this;
        }

        public Criteria andBenqizengjiaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BENQIZENGJIA >=", value, "benqizengjia");
            return (Criteria) this;
        }

        public Criteria andBenqizengjiaLessThan(BigDecimal value) {
            addCriterion("BENQIZENGJIA <", value, "benqizengjia");
            return (Criteria) this;
        }

        public Criteria andBenqizengjiaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BENQIZENGJIA <=", value, "benqizengjia");
            return (Criteria) this;
        }

        public Criteria andBenqizengjiaIn(List<BigDecimal> values) {
            addCriterion("BENQIZENGJIA in", values, "benqizengjia");
            return (Criteria) this;
        }

        public Criteria andBenqizengjiaNotIn(List<BigDecimal> values) {
            addCriterion("BENQIZENGJIA not in", values, "benqizengjia");
            return (Criteria) this;
        }

        public Criteria andBenqizengjiaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BENQIZENGJIA between", value1, value2, "benqizengjia");
            return (Criteria) this;
        }

        public Criteria andBenqizengjiaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BENQIZENGJIA not between", value1, value2, "benqizengjia");
            return (Criteria) this;
        }

        public Criteria andBenqijianshaoIsNull() {
            addCriterion("BENQIJIANSHAO is null");
            return (Criteria) this;
        }

        public Criteria andBenqijianshaoIsNotNull() {
            addCriterion("BENQIJIANSHAO is not null");
            return (Criteria) this;
        }

        public Criteria andBenqijianshaoEqualTo(BigDecimal value) {
            addCriterion("BENQIJIANSHAO =", value, "benqijianshao");
            return (Criteria) this;
        }

        public Criteria andBenqijianshaoNotEqualTo(BigDecimal value) {
            addCriterion("BENQIJIANSHAO <>", value, "benqijianshao");
            return (Criteria) this;
        }

        public Criteria andBenqijianshaoGreaterThan(BigDecimal value) {
            addCriterion("BENQIJIANSHAO >", value, "benqijianshao");
            return (Criteria) this;
        }

        public Criteria andBenqijianshaoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BENQIJIANSHAO >=", value, "benqijianshao");
            return (Criteria) this;
        }

        public Criteria andBenqijianshaoLessThan(BigDecimal value) {
            addCriterion("BENQIJIANSHAO <", value, "benqijianshao");
            return (Criteria) this;
        }

        public Criteria andBenqijianshaoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BENQIJIANSHAO <=", value, "benqijianshao");
            return (Criteria) this;
        }

        public Criteria andBenqijianshaoIn(List<BigDecimal> values) {
            addCriterion("BENQIJIANSHAO in", values, "benqijianshao");
            return (Criteria) this;
        }

        public Criteria andBenqijianshaoNotIn(List<BigDecimal> values) {
            addCriterion("BENQIJIANSHAO not in", values, "benqijianshao");
            return (Criteria) this;
        }

        public Criteria andBenqijianshaoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BENQIJIANSHAO between", value1, value2, "benqijianshao");
            return (Criteria) this;
        }

        public Criteria andBenqijianshaoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BENQIJIANSHAO not between", value1, value2, "benqijianshao");
            return (Criteria) this;
        }

        public Criteria andQimoyueIsNull() {
            addCriterion("QIMOYUE is null");
            return (Criteria) this;
        }

        public Criteria andQimoyueIsNotNull() {
            addCriterion("QIMOYUE is not null");
            return (Criteria) this;
        }

        public Criteria andQimoyueEqualTo(BigDecimal value) {
            addCriterion("QIMOYUE =", value, "qimoyue");
            return (Criteria) this;
        }

        public Criteria andQimoyueNotEqualTo(BigDecimal value) {
            addCriterion("QIMOYUE <>", value, "qimoyue");
            return (Criteria) this;
        }

        public Criteria andQimoyueGreaterThan(BigDecimal value) {
            addCriterion("QIMOYUE >", value, "qimoyue");
            return (Criteria) this;
        }

        public Criteria andQimoyueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOYUE >=", value, "qimoyue");
            return (Criteria) this;
        }

        public Criteria andQimoyueLessThan(BigDecimal value) {
            addCriterion("QIMOYUE <", value, "qimoyue");
            return (Criteria) this;
        }

        public Criteria andQimoyueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOYUE <=", value, "qimoyue");
            return (Criteria) this;
        }

        public Criteria andQimoyueIn(List<BigDecimal> values) {
            addCriterion("QIMOYUE in", values, "qimoyue");
            return (Criteria) this;
        }

        public Criteria andQimoyueNotIn(List<BigDecimal> values) {
            addCriterion("QIMOYUE not in", values, "qimoyue");
            return (Criteria) this;
        }

        public Criteria andQimoyueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOYUE between", value1, value2, "qimoyue");
            return (Criteria) this;
        }

        public Criteria andQimoyueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOYUE not between", value1, value2, "qimoyue");
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

        public Criteria andXuhaoEqualTo(Short value) {
            addCriterion("XUHAO =", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoNotEqualTo(Short value) {
            addCriterion("XUHAO <>", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoGreaterThan(Short value) {
            addCriterion("XUHAO >", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoGreaterThanOrEqualTo(Short value) {
            addCriterion("XUHAO >=", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoLessThan(Short value) {
            addCriterion("XUHAO <", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoLessThanOrEqualTo(Short value) {
            addCriterion("XUHAO <=", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoIn(List<Short> values) {
            addCriterion("XUHAO in", values, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoNotIn(List<Short> values) {
            addCriterion("XUHAO not in", values, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoBetween(Short value1, Short value2) {
            addCriterion("XUHAO between", value1, value2, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoNotBetween(Short value1, Short value2) {
            addCriterion("XUHAO not between", value1, value2, "xuhao");
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