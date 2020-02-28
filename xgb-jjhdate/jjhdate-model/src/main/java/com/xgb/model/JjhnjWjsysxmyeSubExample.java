package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JjhnjWjsysxmyeSubExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JjhnjWjsysxmyeSubExample() {
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

        public Criteria andNianchuyue1IsNull() {
            addCriterion("NIANCHUYUE1 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuyue1IsNotNull() {
            addCriterion("NIANCHUYUE1 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuyue1EqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE1 =", value, "nianchuyue1");
            return (Criteria) this;
        }

        public Criteria andNianchuyue1NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE1 <>", value, "nianchuyue1");
            return (Criteria) this;
        }

        public Criteria andNianchuyue1GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUYUE1 >", value, "nianchuyue1");
            return (Criteria) this;
        }

        public Criteria andNianchuyue1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE1 >=", value, "nianchuyue1");
            return (Criteria) this;
        }

        public Criteria andNianchuyue1LessThan(BigDecimal value) {
            addCriterion("NIANCHUYUE1 <", value, "nianchuyue1");
            return (Criteria) this;
        }

        public Criteria andNianchuyue1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE1 <=", value, "nianchuyue1");
            return (Criteria) this;
        }

        public Criteria andNianchuyue1In(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE1 in", values, "nianchuyue1");
            return (Criteria) this;
        }

        public Criteria andNianchuyue1NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE1 not in", values, "nianchuyue1");
            return (Criteria) this;
        }

        public Criteria andNianchuyue1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE1 between", value1, value2, "nianchuyue1");
            return (Criteria) this;
        }

        public Criteria andNianchuyue1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE1 not between", value1, value2, "nianchuyue1");
            return (Criteria) this;
        }

        public Criteria andNianchubili1IsNull() {
            addCriterion("NIANCHUBILI1 is null");
            return (Criteria) this;
        }

        public Criteria andNianchubili1IsNotNull() {
            addCriterion("NIANCHUBILI1 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchubili1EqualTo(String value) {
            addCriterion("NIANCHUBILI1 =", value, "nianchubili1");
            return (Criteria) this;
        }

        public Criteria andNianchubili1NotEqualTo(String value) {
            addCriterion("NIANCHUBILI1 <>", value, "nianchubili1");
            return (Criteria) this;
        }

        public Criteria andNianchubili1GreaterThan(String value) {
            addCriterion("NIANCHUBILI1 >", value, "nianchubili1");
            return (Criteria) this;
        }

        public Criteria andNianchubili1GreaterThanOrEqualTo(String value) {
            addCriterion("NIANCHUBILI1 >=", value, "nianchubili1");
            return (Criteria) this;
        }

        public Criteria andNianchubili1LessThan(String value) {
            addCriterion("NIANCHUBILI1 <", value, "nianchubili1");
            return (Criteria) this;
        }

        public Criteria andNianchubili1LessThanOrEqualTo(String value) {
            addCriterion("NIANCHUBILI1 <=", value, "nianchubili1");
            return (Criteria) this;
        }

        public Criteria andNianchubili1Like(String value) {
            addCriterion("NIANCHUBILI1 like", value, "nianchubili1");
            return (Criteria) this;
        }

        public Criteria andNianchubili1NotLike(String value) {
            addCriterion("NIANCHUBILI1 not like", value, "nianchubili1");
            return (Criteria) this;
        }

        public Criteria andNianchubili1In(List<String> values) {
            addCriterion("NIANCHUBILI1 in", values, "nianchubili1");
            return (Criteria) this;
        }

        public Criteria andNianchubili1NotIn(List<String> values) {
            addCriterion("NIANCHUBILI1 not in", values, "nianchubili1");
            return (Criteria) this;
        }

        public Criteria andNianchubili1Between(String value1, String value2) {
            addCriterion("NIANCHUBILI1 between", value1, value2, "nianchubili1");
            return (Criteria) this;
        }

        public Criteria andNianchubili1NotBetween(String value1, String value2) {
            addCriterion("NIANCHUBILI1 not between", value1, value2, "nianchubili1");
            return (Criteria) this;
        }

        public Criteria andNianmoyue1IsNull() {
            addCriterion("NIANMOYUE1 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoyue1IsNotNull() {
            addCriterion("NIANMOYUE1 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoyue1EqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE1 =", value, "nianmoyue1");
            return (Criteria) this;
        }

        public Criteria andNianmoyue1NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE1 <>", value, "nianmoyue1");
            return (Criteria) this;
        }

        public Criteria andNianmoyue1GreaterThan(BigDecimal value) {
            addCriterion("NIANMOYUE1 >", value, "nianmoyue1");
            return (Criteria) this;
        }

        public Criteria andNianmoyue1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE1 >=", value, "nianmoyue1");
            return (Criteria) this;
        }

        public Criteria andNianmoyue1LessThan(BigDecimal value) {
            addCriterion("NIANMOYUE1 <", value, "nianmoyue1");
            return (Criteria) this;
        }

        public Criteria andNianmoyue1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE1 <=", value, "nianmoyue1");
            return (Criteria) this;
        }

        public Criteria andNianmoyue1In(List<BigDecimal> values) {
            addCriterion("NIANMOYUE1 in", values, "nianmoyue1");
            return (Criteria) this;
        }

        public Criteria andNianmoyue1NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOYUE1 not in", values, "nianmoyue1");
            return (Criteria) this;
        }

        public Criteria andNianmoyue1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE1 between", value1, value2, "nianmoyue1");
            return (Criteria) this;
        }

        public Criteria andNianmoyue1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE1 not between", value1, value2, "nianmoyue1");
            return (Criteria) this;
        }

        public Criteria andNianmobili1IsNull() {
            addCriterion("NIANMOBILI1 is null");
            return (Criteria) this;
        }

        public Criteria andNianmobili1IsNotNull() {
            addCriterion("NIANMOBILI1 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmobili1EqualTo(String value) {
            addCriterion("NIANMOBILI1 =", value, "nianmobili1");
            return (Criteria) this;
        }

        public Criteria andNianmobili1NotEqualTo(String value) {
            addCriterion("NIANMOBILI1 <>", value, "nianmobili1");
            return (Criteria) this;
        }

        public Criteria andNianmobili1GreaterThan(String value) {
            addCriterion("NIANMOBILI1 >", value, "nianmobili1");
            return (Criteria) this;
        }

        public Criteria andNianmobili1GreaterThanOrEqualTo(String value) {
            addCriterion("NIANMOBILI1 >=", value, "nianmobili1");
            return (Criteria) this;
        }

        public Criteria andNianmobili1LessThan(String value) {
            addCriterion("NIANMOBILI1 <", value, "nianmobili1");
            return (Criteria) this;
        }

        public Criteria andNianmobili1LessThanOrEqualTo(String value) {
            addCriterion("NIANMOBILI1 <=", value, "nianmobili1");
            return (Criteria) this;
        }

        public Criteria andNianmobili1Like(String value) {
            addCriterion("NIANMOBILI1 like", value, "nianmobili1");
            return (Criteria) this;
        }

        public Criteria andNianmobili1NotLike(String value) {
            addCriterion("NIANMOBILI1 not like", value, "nianmobili1");
            return (Criteria) this;
        }

        public Criteria andNianmobili1In(List<String> values) {
            addCriterion("NIANMOBILI1 in", values, "nianmobili1");
            return (Criteria) this;
        }

        public Criteria andNianmobili1NotIn(List<String> values) {
            addCriterion("NIANMOBILI1 not in", values, "nianmobili1");
            return (Criteria) this;
        }

        public Criteria andNianmobili1Between(String value1, String value2) {
            addCriterion("NIANMOBILI1 between", value1, value2, "nianmobili1");
            return (Criteria) this;
        }

        public Criteria andNianmobili1NotBetween(String value1, String value2) {
            addCriterion("NIANMOBILI1 not between", value1, value2, "nianmobili1");
            return (Criteria) this;
        }

        public Criteria andNianchuyue2IsNull() {
            addCriterion("NIANCHUYUE2 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuyue2IsNotNull() {
            addCriterion("NIANCHUYUE2 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuyue2EqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE2 =", value, "nianchuyue2");
            return (Criteria) this;
        }

        public Criteria andNianchuyue2NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE2 <>", value, "nianchuyue2");
            return (Criteria) this;
        }

        public Criteria andNianchuyue2GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUYUE2 >", value, "nianchuyue2");
            return (Criteria) this;
        }

        public Criteria andNianchuyue2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE2 >=", value, "nianchuyue2");
            return (Criteria) this;
        }

        public Criteria andNianchuyue2LessThan(BigDecimal value) {
            addCriterion("NIANCHUYUE2 <", value, "nianchuyue2");
            return (Criteria) this;
        }

        public Criteria andNianchuyue2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE2 <=", value, "nianchuyue2");
            return (Criteria) this;
        }

        public Criteria andNianchuyue2In(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE2 in", values, "nianchuyue2");
            return (Criteria) this;
        }

        public Criteria andNianchuyue2NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE2 not in", values, "nianchuyue2");
            return (Criteria) this;
        }

        public Criteria andNianchuyue2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE2 between", value1, value2, "nianchuyue2");
            return (Criteria) this;
        }

        public Criteria andNianchuyue2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE2 not between", value1, value2, "nianchuyue2");
            return (Criteria) this;
        }

        public Criteria andNianchubili2IsNull() {
            addCriterion("NIANCHUBILI2 is null");
            return (Criteria) this;
        }

        public Criteria andNianchubili2IsNotNull() {
            addCriterion("NIANCHUBILI2 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchubili2EqualTo(String value) {
            addCriterion("NIANCHUBILI2 =", value, "nianchubili2");
            return (Criteria) this;
        }

        public Criteria andNianchubili2NotEqualTo(String value) {
            addCriterion("NIANCHUBILI2 <>", value, "nianchubili2");
            return (Criteria) this;
        }

        public Criteria andNianchubili2GreaterThan(String value) {
            addCriterion("NIANCHUBILI2 >", value, "nianchubili2");
            return (Criteria) this;
        }

        public Criteria andNianchubili2GreaterThanOrEqualTo(String value) {
            addCriterion("NIANCHUBILI2 >=", value, "nianchubili2");
            return (Criteria) this;
        }

        public Criteria andNianchubili2LessThan(String value) {
            addCriterion("NIANCHUBILI2 <", value, "nianchubili2");
            return (Criteria) this;
        }

        public Criteria andNianchubili2LessThanOrEqualTo(String value) {
            addCriterion("NIANCHUBILI2 <=", value, "nianchubili2");
            return (Criteria) this;
        }

        public Criteria andNianchubili2Like(String value) {
            addCriterion("NIANCHUBILI2 like", value, "nianchubili2");
            return (Criteria) this;
        }

        public Criteria andNianchubili2NotLike(String value) {
            addCriterion("NIANCHUBILI2 not like", value, "nianchubili2");
            return (Criteria) this;
        }

        public Criteria andNianchubili2In(List<String> values) {
            addCriterion("NIANCHUBILI2 in", values, "nianchubili2");
            return (Criteria) this;
        }

        public Criteria andNianchubili2NotIn(List<String> values) {
            addCriterion("NIANCHUBILI2 not in", values, "nianchubili2");
            return (Criteria) this;
        }

        public Criteria andNianchubili2Between(String value1, String value2) {
            addCriterion("NIANCHUBILI2 between", value1, value2, "nianchubili2");
            return (Criteria) this;
        }

        public Criteria andNianchubili2NotBetween(String value1, String value2) {
            addCriterion("NIANCHUBILI2 not between", value1, value2, "nianchubili2");
            return (Criteria) this;
        }

        public Criteria andNianmoyue2IsNull() {
            addCriterion("NIANMOYUE2 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoyue2IsNotNull() {
            addCriterion("NIANMOYUE2 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoyue2EqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE2 =", value, "nianmoyue2");
            return (Criteria) this;
        }

        public Criteria andNianmoyue2NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE2 <>", value, "nianmoyue2");
            return (Criteria) this;
        }

        public Criteria andNianmoyue2GreaterThan(BigDecimal value) {
            addCriterion("NIANMOYUE2 >", value, "nianmoyue2");
            return (Criteria) this;
        }

        public Criteria andNianmoyue2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE2 >=", value, "nianmoyue2");
            return (Criteria) this;
        }

        public Criteria andNianmoyue2LessThan(BigDecimal value) {
            addCriterion("NIANMOYUE2 <", value, "nianmoyue2");
            return (Criteria) this;
        }

        public Criteria andNianmoyue2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE2 <=", value, "nianmoyue2");
            return (Criteria) this;
        }

        public Criteria andNianmoyue2In(List<BigDecimal> values) {
            addCriterion("NIANMOYUE2 in", values, "nianmoyue2");
            return (Criteria) this;
        }

        public Criteria andNianmoyue2NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOYUE2 not in", values, "nianmoyue2");
            return (Criteria) this;
        }

        public Criteria andNianmoyue2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE2 between", value1, value2, "nianmoyue2");
            return (Criteria) this;
        }

        public Criteria andNianmoyue2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE2 not between", value1, value2, "nianmoyue2");
            return (Criteria) this;
        }

        public Criteria andNianmobili2IsNull() {
            addCriterion("NIANMOBILI2 is null");
            return (Criteria) this;
        }

        public Criteria andNianmobili2IsNotNull() {
            addCriterion("NIANMOBILI2 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmobili2EqualTo(String value) {
            addCriterion("NIANMOBILI2 =", value, "nianmobili2");
            return (Criteria) this;
        }

        public Criteria andNianmobili2NotEqualTo(String value) {
            addCriterion("NIANMOBILI2 <>", value, "nianmobili2");
            return (Criteria) this;
        }

        public Criteria andNianmobili2GreaterThan(String value) {
            addCriterion("NIANMOBILI2 >", value, "nianmobili2");
            return (Criteria) this;
        }

        public Criteria andNianmobili2GreaterThanOrEqualTo(String value) {
            addCriterion("NIANMOBILI2 >=", value, "nianmobili2");
            return (Criteria) this;
        }

        public Criteria andNianmobili2LessThan(String value) {
            addCriterion("NIANMOBILI2 <", value, "nianmobili2");
            return (Criteria) this;
        }

        public Criteria andNianmobili2LessThanOrEqualTo(String value) {
            addCriterion("NIANMOBILI2 <=", value, "nianmobili2");
            return (Criteria) this;
        }

        public Criteria andNianmobili2Like(String value) {
            addCriterion("NIANMOBILI2 like", value, "nianmobili2");
            return (Criteria) this;
        }

        public Criteria andNianmobili2NotLike(String value) {
            addCriterion("NIANMOBILI2 not like", value, "nianmobili2");
            return (Criteria) this;
        }

        public Criteria andNianmobili2In(List<String> values) {
            addCriterion("NIANMOBILI2 in", values, "nianmobili2");
            return (Criteria) this;
        }

        public Criteria andNianmobili2NotIn(List<String> values) {
            addCriterion("NIANMOBILI2 not in", values, "nianmobili2");
            return (Criteria) this;
        }

        public Criteria andNianmobili2Between(String value1, String value2) {
            addCriterion("NIANMOBILI2 between", value1, value2, "nianmobili2");
            return (Criteria) this;
        }

        public Criteria andNianmobili2NotBetween(String value1, String value2) {
            addCriterion("NIANMOBILI2 not between", value1, value2, "nianmobili2");
            return (Criteria) this;
        }

        public Criteria andNianchuyue3IsNull() {
            addCriterion("NIANCHUYUE3 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuyue3IsNotNull() {
            addCriterion("NIANCHUYUE3 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuyue3EqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE3 =", value, "nianchuyue3");
            return (Criteria) this;
        }

        public Criteria andNianchuyue3NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE3 <>", value, "nianchuyue3");
            return (Criteria) this;
        }

        public Criteria andNianchuyue3GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUYUE3 >", value, "nianchuyue3");
            return (Criteria) this;
        }

        public Criteria andNianchuyue3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE3 >=", value, "nianchuyue3");
            return (Criteria) this;
        }

        public Criteria andNianchuyue3LessThan(BigDecimal value) {
            addCriterion("NIANCHUYUE3 <", value, "nianchuyue3");
            return (Criteria) this;
        }

        public Criteria andNianchuyue3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE3 <=", value, "nianchuyue3");
            return (Criteria) this;
        }

        public Criteria andNianchuyue3In(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE3 in", values, "nianchuyue3");
            return (Criteria) this;
        }

        public Criteria andNianchuyue3NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE3 not in", values, "nianchuyue3");
            return (Criteria) this;
        }

        public Criteria andNianchuyue3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE3 between", value1, value2, "nianchuyue3");
            return (Criteria) this;
        }

        public Criteria andNianchuyue3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE3 not between", value1, value2, "nianchuyue3");
            return (Criteria) this;
        }

        public Criteria andNianchubili3IsNull() {
            addCriterion("NIANCHUBILI3 is null");
            return (Criteria) this;
        }

        public Criteria andNianchubili3IsNotNull() {
            addCriterion("NIANCHUBILI3 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchubili3EqualTo(String value) {
            addCriterion("NIANCHUBILI3 =", value, "nianchubili3");
            return (Criteria) this;
        }

        public Criteria andNianchubili3NotEqualTo(String value) {
            addCriterion("NIANCHUBILI3 <>", value, "nianchubili3");
            return (Criteria) this;
        }

        public Criteria andNianchubili3GreaterThan(String value) {
            addCriterion("NIANCHUBILI3 >", value, "nianchubili3");
            return (Criteria) this;
        }

        public Criteria andNianchubili3GreaterThanOrEqualTo(String value) {
            addCriterion("NIANCHUBILI3 >=", value, "nianchubili3");
            return (Criteria) this;
        }

        public Criteria andNianchubili3LessThan(String value) {
            addCriterion("NIANCHUBILI3 <", value, "nianchubili3");
            return (Criteria) this;
        }

        public Criteria andNianchubili3LessThanOrEqualTo(String value) {
            addCriterion("NIANCHUBILI3 <=", value, "nianchubili3");
            return (Criteria) this;
        }

        public Criteria andNianchubili3Like(String value) {
            addCriterion("NIANCHUBILI3 like", value, "nianchubili3");
            return (Criteria) this;
        }

        public Criteria andNianchubili3NotLike(String value) {
            addCriterion("NIANCHUBILI3 not like", value, "nianchubili3");
            return (Criteria) this;
        }

        public Criteria andNianchubili3In(List<String> values) {
            addCriterion("NIANCHUBILI3 in", values, "nianchubili3");
            return (Criteria) this;
        }

        public Criteria andNianchubili3NotIn(List<String> values) {
            addCriterion("NIANCHUBILI3 not in", values, "nianchubili3");
            return (Criteria) this;
        }

        public Criteria andNianchubili3Between(String value1, String value2) {
            addCriterion("NIANCHUBILI3 between", value1, value2, "nianchubili3");
            return (Criteria) this;
        }

        public Criteria andNianchubili3NotBetween(String value1, String value2) {
            addCriterion("NIANCHUBILI3 not between", value1, value2, "nianchubili3");
            return (Criteria) this;
        }

        public Criteria andNianmoyue3IsNull() {
            addCriterion("NIANMOYUE3 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoyue3IsNotNull() {
            addCriterion("NIANMOYUE3 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoyue3EqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE3 =", value, "nianmoyue3");
            return (Criteria) this;
        }

        public Criteria andNianmoyue3NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE3 <>", value, "nianmoyue3");
            return (Criteria) this;
        }

        public Criteria andNianmoyue3GreaterThan(BigDecimal value) {
            addCriterion("NIANMOYUE3 >", value, "nianmoyue3");
            return (Criteria) this;
        }

        public Criteria andNianmoyue3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE3 >=", value, "nianmoyue3");
            return (Criteria) this;
        }

        public Criteria andNianmoyue3LessThan(BigDecimal value) {
            addCriterion("NIANMOYUE3 <", value, "nianmoyue3");
            return (Criteria) this;
        }

        public Criteria andNianmoyue3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE3 <=", value, "nianmoyue3");
            return (Criteria) this;
        }

        public Criteria andNianmoyue3In(List<BigDecimal> values) {
            addCriterion("NIANMOYUE3 in", values, "nianmoyue3");
            return (Criteria) this;
        }

        public Criteria andNianmoyue3NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOYUE3 not in", values, "nianmoyue3");
            return (Criteria) this;
        }

        public Criteria andNianmoyue3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE3 between", value1, value2, "nianmoyue3");
            return (Criteria) this;
        }

        public Criteria andNianmoyue3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE3 not between", value1, value2, "nianmoyue3");
            return (Criteria) this;
        }

        public Criteria andNianmobili3IsNull() {
            addCriterion("NIANMOBILI3 is null");
            return (Criteria) this;
        }

        public Criteria andNianmobili3IsNotNull() {
            addCriterion("NIANMOBILI3 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmobili3EqualTo(String value) {
            addCriterion("NIANMOBILI3 =", value, "nianmobili3");
            return (Criteria) this;
        }

        public Criteria andNianmobili3NotEqualTo(String value) {
            addCriterion("NIANMOBILI3 <>", value, "nianmobili3");
            return (Criteria) this;
        }

        public Criteria andNianmobili3GreaterThan(String value) {
            addCriterion("NIANMOBILI3 >", value, "nianmobili3");
            return (Criteria) this;
        }

        public Criteria andNianmobili3GreaterThanOrEqualTo(String value) {
            addCriterion("NIANMOBILI3 >=", value, "nianmobili3");
            return (Criteria) this;
        }

        public Criteria andNianmobili3LessThan(String value) {
            addCriterion("NIANMOBILI3 <", value, "nianmobili3");
            return (Criteria) this;
        }

        public Criteria andNianmobili3LessThanOrEqualTo(String value) {
            addCriterion("NIANMOBILI3 <=", value, "nianmobili3");
            return (Criteria) this;
        }

        public Criteria andNianmobili3Like(String value) {
            addCriterion("NIANMOBILI3 like", value, "nianmobili3");
            return (Criteria) this;
        }

        public Criteria andNianmobili3NotLike(String value) {
            addCriterion("NIANMOBILI3 not like", value, "nianmobili3");
            return (Criteria) this;
        }

        public Criteria andNianmobili3In(List<String> values) {
            addCriterion("NIANMOBILI3 in", values, "nianmobili3");
            return (Criteria) this;
        }

        public Criteria andNianmobili3NotIn(List<String> values) {
            addCriterion("NIANMOBILI3 not in", values, "nianmobili3");
            return (Criteria) this;
        }

        public Criteria andNianmobili3Between(String value1, String value2) {
            addCriterion("NIANMOBILI3 between", value1, value2, "nianmobili3");
            return (Criteria) this;
        }

        public Criteria andNianmobili3NotBetween(String value1, String value2) {
            addCriterion("NIANMOBILI3 not between", value1, value2, "nianmobili3");
            return (Criteria) this;
        }

        public Criteria andNianchuyue4IsNull() {
            addCriterion("NIANCHUYUE4 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuyue4IsNotNull() {
            addCriterion("NIANCHUYUE4 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuyue4EqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE4 =", value, "nianchuyue4");
            return (Criteria) this;
        }

        public Criteria andNianchuyue4NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE4 <>", value, "nianchuyue4");
            return (Criteria) this;
        }

        public Criteria andNianchuyue4GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUYUE4 >", value, "nianchuyue4");
            return (Criteria) this;
        }

        public Criteria andNianchuyue4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE4 >=", value, "nianchuyue4");
            return (Criteria) this;
        }

        public Criteria andNianchuyue4LessThan(BigDecimal value) {
            addCriterion("NIANCHUYUE4 <", value, "nianchuyue4");
            return (Criteria) this;
        }

        public Criteria andNianchuyue4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE4 <=", value, "nianchuyue4");
            return (Criteria) this;
        }

        public Criteria andNianchuyue4In(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE4 in", values, "nianchuyue4");
            return (Criteria) this;
        }

        public Criteria andNianchuyue4NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE4 not in", values, "nianchuyue4");
            return (Criteria) this;
        }

        public Criteria andNianchuyue4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE4 between", value1, value2, "nianchuyue4");
            return (Criteria) this;
        }

        public Criteria andNianchuyue4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE4 not between", value1, value2, "nianchuyue4");
            return (Criteria) this;
        }

        public Criteria andNianchubili4IsNull() {
            addCriterion("NIANCHUBILI4 is null");
            return (Criteria) this;
        }

        public Criteria andNianchubili4IsNotNull() {
            addCriterion("NIANCHUBILI4 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchubili4EqualTo(String value) {
            addCriterion("NIANCHUBILI4 =", value, "nianchubili4");
            return (Criteria) this;
        }

        public Criteria andNianchubili4NotEqualTo(String value) {
            addCriterion("NIANCHUBILI4 <>", value, "nianchubili4");
            return (Criteria) this;
        }

        public Criteria andNianchubili4GreaterThan(String value) {
            addCriterion("NIANCHUBILI4 >", value, "nianchubili4");
            return (Criteria) this;
        }

        public Criteria andNianchubili4GreaterThanOrEqualTo(String value) {
            addCriterion("NIANCHUBILI4 >=", value, "nianchubili4");
            return (Criteria) this;
        }

        public Criteria andNianchubili4LessThan(String value) {
            addCriterion("NIANCHUBILI4 <", value, "nianchubili4");
            return (Criteria) this;
        }

        public Criteria andNianchubili4LessThanOrEqualTo(String value) {
            addCriterion("NIANCHUBILI4 <=", value, "nianchubili4");
            return (Criteria) this;
        }

        public Criteria andNianchubili4Like(String value) {
            addCriterion("NIANCHUBILI4 like", value, "nianchubili4");
            return (Criteria) this;
        }

        public Criteria andNianchubili4NotLike(String value) {
            addCriterion("NIANCHUBILI4 not like", value, "nianchubili4");
            return (Criteria) this;
        }

        public Criteria andNianchubili4In(List<String> values) {
            addCriterion("NIANCHUBILI4 in", values, "nianchubili4");
            return (Criteria) this;
        }

        public Criteria andNianchubili4NotIn(List<String> values) {
            addCriterion("NIANCHUBILI4 not in", values, "nianchubili4");
            return (Criteria) this;
        }

        public Criteria andNianchubili4Between(String value1, String value2) {
            addCriterion("NIANCHUBILI4 between", value1, value2, "nianchubili4");
            return (Criteria) this;
        }

        public Criteria andNianchubili4NotBetween(String value1, String value2) {
            addCriterion("NIANCHUBILI4 not between", value1, value2, "nianchubili4");
            return (Criteria) this;
        }

        public Criteria andNianmoyue4IsNull() {
            addCriterion("NIANMOYUE4 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoyue4IsNotNull() {
            addCriterion("NIANMOYUE4 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoyue4EqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE4 =", value, "nianmoyue4");
            return (Criteria) this;
        }

        public Criteria andNianmoyue4NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE4 <>", value, "nianmoyue4");
            return (Criteria) this;
        }

        public Criteria andNianmoyue4GreaterThan(BigDecimal value) {
            addCriterion("NIANMOYUE4 >", value, "nianmoyue4");
            return (Criteria) this;
        }

        public Criteria andNianmoyue4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE4 >=", value, "nianmoyue4");
            return (Criteria) this;
        }

        public Criteria andNianmoyue4LessThan(BigDecimal value) {
            addCriterion("NIANMOYUE4 <", value, "nianmoyue4");
            return (Criteria) this;
        }

        public Criteria andNianmoyue4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE4 <=", value, "nianmoyue4");
            return (Criteria) this;
        }

        public Criteria andNianmoyue4In(List<BigDecimal> values) {
            addCriterion("NIANMOYUE4 in", values, "nianmoyue4");
            return (Criteria) this;
        }

        public Criteria andNianmoyue4NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOYUE4 not in", values, "nianmoyue4");
            return (Criteria) this;
        }

        public Criteria andNianmoyue4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE4 between", value1, value2, "nianmoyue4");
            return (Criteria) this;
        }

        public Criteria andNianmoyue4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE4 not between", value1, value2, "nianmoyue4");
            return (Criteria) this;
        }

        public Criteria andNianmobili4IsNull() {
            addCriterion("NIANMOBILI4 is null");
            return (Criteria) this;
        }

        public Criteria andNianmobili4IsNotNull() {
            addCriterion("NIANMOBILI4 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmobili4EqualTo(String value) {
            addCriterion("NIANMOBILI4 =", value, "nianmobili4");
            return (Criteria) this;
        }

        public Criteria andNianmobili4NotEqualTo(String value) {
            addCriterion("NIANMOBILI4 <>", value, "nianmobili4");
            return (Criteria) this;
        }

        public Criteria andNianmobili4GreaterThan(String value) {
            addCriterion("NIANMOBILI4 >", value, "nianmobili4");
            return (Criteria) this;
        }

        public Criteria andNianmobili4GreaterThanOrEqualTo(String value) {
            addCriterion("NIANMOBILI4 >=", value, "nianmobili4");
            return (Criteria) this;
        }

        public Criteria andNianmobili4LessThan(String value) {
            addCriterion("NIANMOBILI4 <", value, "nianmobili4");
            return (Criteria) this;
        }

        public Criteria andNianmobili4LessThanOrEqualTo(String value) {
            addCriterion("NIANMOBILI4 <=", value, "nianmobili4");
            return (Criteria) this;
        }

        public Criteria andNianmobili4Like(String value) {
            addCriterion("NIANMOBILI4 like", value, "nianmobili4");
            return (Criteria) this;
        }

        public Criteria andNianmobili4NotLike(String value) {
            addCriterion("NIANMOBILI4 not like", value, "nianmobili4");
            return (Criteria) this;
        }

        public Criteria andNianmobili4In(List<String> values) {
            addCriterion("NIANMOBILI4 in", values, "nianmobili4");
            return (Criteria) this;
        }

        public Criteria andNianmobili4NotIn(List<String> values) {
            addCriterion("NIANMOBILI4 not in", values, "nianmobili4");
            return (Criteria) this;
        }

        public Criteria andNianmobili4Between(String value1, String value2) {
            addCriterion("NIANMOBILI4 between", value1, value2, "nianmobili4");
            return (Criteria) this;
        }

        public Criteria andNianmobili4NotBetween(String value1, String value2) {
            addCriterion("NIANMOBILI4 not between", value1, value2, "nianmobili4");
            return (Criteria) this;
        }

        public Criteria andNianchuyue5IsNull() {
            addCriterion("NIANCHUYUE5 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuyue5IsNotNull() {
            addCriterion("NIANCHUYUE5 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuyue5EqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE5 =", value, "nianchuyue5");
            return (Criteria) this;
        }

        public Criteria andNianchuyue5NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE5 <>", value, "nianchuyue5");
            return (Criteria) this;
        }

        public Criteria andNianchuyue5GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUYUE5 >", value, "nianchuyue5");
            return (Criteria) this;
        }

        public Criteria andNianchuyue5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE5 >=", value, "nianchuyue5");
            return (Criteria) this;
        }

        public Criteria andNianchuyue5LessThan(BigDecimal value) {
            addCriterion("NIANCHUYUE5 <", value, "nianchuyue5");
            return (Criteria) this;
        }

        public Criteria andNianchuyue5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE5 <=", value, "nianchuyue5");
            return (Criteria) this;
        }

        public Criteria andNianchuyue5In(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE5 in", values, "nianchuyue5");
            return (Criteria) this;
        }

        public Criteria andNianchuyue5NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE5 not in", values, "nianchuyue5");
            return (Criteria) this;
        }

        public Criteria andNianchuyue5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE5 between", value1, value2, "nianchuyue5");
            return (Criteria) this;
        }

        public Criteria andNianchuyue5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE5 not between", value1, value2, "nianchuyue5");
            return (Criteria) this;
        }

        public Criteria andNianchubili5IsNull() {
            addCriterion("NIANCHUBILI5 is null");
            return (Criteria) this;
        }

        public Criteria andNianchubili5IsNotNull() {
            addCriterion("NIANCHUBILI5 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchubili5EqualTo(String value) {
            addCriterion("NIANCHUBILI5 =", value, "nianchubili5");
            return (Criteria) this;
        }

        public Criteria andNianchubili5NotEqualTo(String value) {
            addCriterion("NIANCHUBILI5 <>", value, "nianchubili5");
            return (Criteria) this;
        }

        public Criteria andNianchubili5GreaterThan(String value) {
            addCriterion("NIANCHUBILI5 >", value, "nianchubili5");
            return (Criteria) this;
        }

        public Criteria andNianchubili5GreaterThanOrEqualTo(String value) {
            addCriterion("NIANCHUBILI5 >=", value, "nianchubili5");
            return (Criteria) this;
        }

        public Criteria andNianchubili5LessThan(String value) {
            addCriterion("NIANCHUBILI5 <", value, "nianchubili5");
            return (Criteria) this;
        }

        public Criteria andNianchubili5LessThanOrEqualTo(String value) {
            addCriterion("NIANCHUBILI5 <=", value, "nianchubili5");
            return (Criteria) this;
        }

        public Criteria andNianchubili5Like(String value) {
            addCriterion("NIANCHUBILI5 like", value, "nianchubili5");
            return (Criteria) this;
        }

        public Criteria andNianchubili5NotLike(String value) {
            addCriterion("NIANCHUBILI5 not like", value, "nianchubili5");
            return (Criteria) this;
        }

        public Criteria andNianchubili5In(List<String> values) {
            addCriterion("NIANCHUBILI5 in", values, "nianchubili5");
            return (Criteria) this;
        }

        public Criteria andNianchubili5NotIn(List<String> values) {
            addCriterion("NIANCHUBILI5 not in", values, "nianchubili5");
            return (Criteria) this;
        }

        public Criteria andNianchubili5Between(String value1, String value2) {
            addCriterion("NIANCHUBILI5 between", value1, value2, "nianchubili5");
            return (Criteria) this;
        }

        public Criteria andNianchubili5NotBetween(String value1, String value2) {
            addCriterion("NIANCHUBILI5 not between", value1, value2, "nianchubili5");
            return (Criteria) this;
        }

        public Criteria andNianmoyue5IsNull() {
            addCriterion("NIANMOYUE5 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoyue5IsNotNull() {
            addCriterion("NIANMOYUE5 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoyue5EqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE5 =", value, "nianmoyue5");
            return (Criteria) this;
        }

        public Criteria andNianmoyue5NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE5 <>", value, "nianmoyue5");
            return (Criteria) this;
        }

        public Criteria andNianmoyue5GreaterThan(BigDecimal value) {
            addCriterion("NIANMOYUE5 >", value, "nianmoyue5");
            return (Criteria) this;
        }

        public Criteria andNianmoyue5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE5 >=", value, "nianmoyue5");
            return (Criteria) this;
        }

        public Criteria andNianmoyue5LessThan(BigDecimal value) {
            addCriterion("NIANMOYUE5 <", value, "nianmoyue5");
            return (Criteria) this;
        }

        public Criteria andNianmoyue5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE5 <=", value, "nianmoyue5");
            return (Criteria) this;
        }

        public Criteria andNianmoyue5In(List<BigDecimal> values) {
            addCriterion("NIANMOYUE5 in", values, "nianmoyue5");
            return (Criteria) this;
        }

        public Criteria andNianmoyue5NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOYUE5 not in", values, "nianmoyue5");
            return (Criteria) this;
        }

        public Criteria andNianmoyue5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE5 between", value1, value2, "nianmoyue5");
            return (Criteria) this;
        }

        public Criteria andNianmoyue5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE5 not between", value1, value2, "nianmoyue5");
            return (Criteria) this;
        }

        public Criteria andNianmobili5IsNull() {
            addCriterion("NIANMOBILI5 is null");
            return (Criteria) this;
        }

        public Criteria andNianmobili5IsNotNull() {
            addCriterion("NIANMOBILI5 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmobili5EqualTo(String value) {
            addCriterion("NIANMOBILI5 =", value, "nianmobili5");
            return (Criteria) this;
        }

        public Criteria andNianmobili5NotEqualTo(String value) {
            addCriterion("NIANMOBILI5 <>", value, "nianmobili5");
            return (Criteria) this;
        }

        public Criteria andNianmobili5GreaterThan(String value) {
            addCriterion("NIANMOBILI5 >", value, "nianmobili5");
            return (Criteria) this;
        }

        public Criteria andNianmobili5GreaterThanOrEqualTo(String value) {
            addCriterion("NIANMOBILI5 >=", value, "nianmobili5");
            return (Criteria) this;
        }

        public Criteria andNianmobili5LessThan(String value) {
            addCriterion("NIANMOBILI5 <", value, "nianmobili5");
            return (Criteria) this;
        }

        public Criteria andNianmobili5LessThanOrEqualTo(String value) {
            addCriterion("NIANMOBILI5 <=", value, "nianmobili5");
            return (Criteria) this;
        }

        public Criteria andNianmobili5Like(String value) {
            addCriterion("NIANMOBILI5 like", value, "nianmobili5");
            return (Criteria) this;
        }

        public Criteria andNianmobili5NotLike(String value) {
            addCriterion("NIANMOBILI5 not like", value, "nianmobili5");
            return (Criteria) this;
        }

        public Criteria andNianmobili5In(List<String> values) {
            addCriterion("NIANMOBILI5 in", values, "nianmobili5");
            return (Criteria) this;
        }

        public Criteria andNianmobili5NotIn(List<String> values) {
            addCriterion("NIANMOBILI5 not in", values, "nianmobili5");
            return (Criteria) this;
        }

        public Criteria andNianmobili5Between(String value1, String value2) {
            addCriterion("NIANMOBILI5 between", value1, value2, "nianmobili5");
            return (Criteria) this;
        }

        public Criteria andNianmobili5NotBetween(String value1, String value2) {
            addCriterion("NIANMOBILI5 not between", value1, value2, "nianmobili5");
            return (Criteria) this;
        }

        public Criteria andNianchuyue6IsNull() {
            addCriterion("NIANCHUYUE6 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuyue6IsNotNull() {
            addCriterion("NIANCHUYUE6 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuyue6EqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE6 =", value, "nianchuyue6");
            return (Criteria) this;
        }

        public Criteria andNianchuyue6NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE6 <>", value, "nianchuyue6");
            return (Criteria) this;
        }

        public Criteria andNianchuyue6GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUYUE6 >", value, "nianchuyue6");
            return (Criteria) this;
        }

        public Criteria andNianchuyue6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE6 >=", value, "nianchuyue6");
            return (Criteria) this;
        }

        public Criteria andNianchuyue6LessThan(BigDecimal value) {
            addCriterion("NIANCHUYUE6 <", value, "nianchuyue6");
            return (Criteria) this;
        }

        public Criteria andNianchuyue6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE6 <=", value, "nianchuyue6");
            return (Criteria) this;
        }

        public Criteria andNianchuyue6In(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE6 in", values, "nianchuyue6");
            return (Criteria) this;
        }

        public Criteria andNianchuyue6NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE6 not in", values, "nianchuyue6");
            return (Criteria) this;
        }

        public Criteria andNianchuyue6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE6 between", value1, value2, "nianchuyue6");
            return (Criteria) this;
        }

        public Criteria andNianchuyue6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE6 not between", value1, value2, "nianchuyue6");
            return (Criteria) this;
        }

        public Criteria andNianchubili6IsNull() {
            addCriterion("NIANCHUBILI6 is null");
            return (Criteria) this;
        }

        public Criteria andNianchubili6IsNotNull() {
            addCriterion("NIANCHUBILI6 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchubili6EqualTo(String value) {
            addCriterion("NIANCHUBILI6 =", value, "nianchubili6");
            return (Criteria) this;
        }

        public Criteria andNianchubili6NotEqualTo(String value) {
            addCriterion("NIANCHUBILI6 <>", value, "nianchubili6");
            return (Criteria) this;
        }

        public Criteria andNianchubili6GreaterThan(String value) {
            addCriterion("NIANCHUBILI6 >", value, "nianchubili6");
            return (Criteria) this;
        }

        public Criteria andNianchubili6GreaterThanOrEqualTo(String value) {
            addCriterion("NIANCHUBILI6 >=", value, "nianchubili6");
            return (Criteria) this;
        }

        public Criteria andNianchubili6LessThan(String value) {
            addCriterion("NIANCHUBILI6 <", value, "nianchubili6");
            return (Criteria) this;
        }

        public Criteria andNianchubili6LessThanOrEqualTo(String value) {
            addCriterion("NIANCHUBILI6 <=", value, "nianchubili6");
            return (Criteria) this;
        }

        public Criteria andNianchubili6Like(String value) {
            addCriterion("NIANCHUBILI6 like", value, "nianchubili6");
            return (Criteria) this;
        }

        public Criteria andNianchubili6NotLike(String value) {
            addCriterion("NIANCHUBILI6 not like", value, "nianchubili6");
            return (Criteria) this;
        }

        public Criteria andNianchubili6In(List<String> values) {
            addCriterion("NIANCHUBILI6 in", values, "nianchubili6");
            return (Criteria) this;
        }

        public Criteria andNianchubili6NotIn(List<String> values) {
            addCriterion("NIANCHUBILI6 not in", values, "nianchubili6");
            return (Criteria) this;
        }

        public Criteria andNianchubili6Between(String value1, String value2) {
            addCriterion("NIANCHUBILI6 between", value1, value2, "nianchubili6");
            return (Criteria) this;
        }

        public Criteria andNianchubili6NotBetween(String value1, String value2) {
            addCriterion("NIANCHUBILI6 not between", value1, value2, "nianchubili6");
            return (Criteria) this;
        }

        public Criteria andNianmoyue6IsNull() {
            addCriterion("NIANMOYUE6 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoyue6IsNotNull() {
            addCriterion("NIANMOYUE6 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoyue6EqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE6 =", value, "nianmoyue6");
            return (Criteria) this;
        }

        public Criteria andNianmoyue6NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE6 <>", value, "nianmoyue6");
            return (Criteria) this;
        }

        public Criteria andNianmoyue6GreaterThan(BigDecimal value) {
            addCriterion("NIANMOYUE6 >", value, "nianmoyue6");
            return (Criteria) this;
        }

        public Criteria andNianmoyue6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE6 >=", value, "nianmoyue6");
            return (Criteria) this;
        }

        public Criteria andNianmoyue6LessThan(BigDecimal value) {
            addCriterion("NIANMOYUE6 <", value, "nianmoyue6");
            return (Criteria) this;
        }

        public Criteria andNianmoyue6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE6 <=", value, "nianmoyue6");
            return (Criteria) this;
        }

        public Criteria andNianmoyue6In(List<BigDecimal> values) {
            addCriterion("NIANMOYUE6 in", values, "nianmoyue6");
            return (Criteria) this;
        }

        public Criteria andNianmoyue6NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOYUE6 not in", values, "nianmoyue6");
            return (Criteria) this;
        }

        public Criteria andNianmoyue6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE6 between", value1, value2, "nianmoyue6");
            return (Criteria) this;
        }

        public Criteria andNianmoyue6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE6 not between", value1, value2, "nianmoyue6");
            return (Criteria) this;
        }

        public Criteria andNianmobili6IsNull() {
            addCriterion("NIANMOBILI6 is null");
            return (Criteria) this;
        }

        public Criteria andNianmobili6IsNotNull() {
            addCriterion("NIANMOBILI6 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmobili6EqualTo(String value) {
            addCriterion("NIANMOBILI6 =", value, "nianmobili6");
            return (Criteria) this;
        }

        public Criteria andNianmobili6NotEqualTo(String value) {
            addCriterion("NIANMOBILI6 <>", value, "nianmobili6");
            return (Criteria) this;
        }

        public Criteria andNianmobili6GreaterThan(String value) {
            addCriterion("NIANMOBILI6 >", value, "nianmobili6");
            return (Criteria) this;
        }

        public Criteria andNianmobili6GreaterThanOrEqualTo(String value) {
            addCriterion("NIANMOBILI6 >=", value, "nianmobili6");
            return (Criteria) this;
        }

        public Criteria andNianmobili6LessThan(String value) {
            addCriterion("NIANMOBILI6 <", value, "nianmobili6");
            return (Criteria) this;
        }

        public Criteria andNianmobili6LessThanOrEqualTo(String value) {
            addCriterion("NIANMOBILI6 <=", value, "nianmobili6");
            return (Criteria) this;
        }

        public Criteria andNianmobili6Like(String value) {
            addCriterion("NIANMOBILI6 like", value, "nianmobili6");
            return (Criteria) this;
        }

        public Criteria andNianmobili6NotLike(String value) {
            addCriterion("NIANMOBILI6 not like", value, "nianmobili6");
            return (Criteria) this;
        }

        public Criteria andNianmobili6In(List<String> values) {
            addCriterion("NIANMOBILI6 in", values, "nianmobili6");
            return (Criteria) this;
        }

        public Criteria andNianmobili6NotIn(List<String> values) {
            addCriterion("NIANMOBILI6 not in", values, "nianmobili6");
            return (Criteria) this;
        }

        public Criteria andNianmobili6Between(String value1, String value2) {
            addCriterion("NIANMOBILI6 between", value1, value2, "nianmobili6");
            return (Criteria) this;
        }

        public Criteria andNianmobili6NotBetween(String value1, String value2) {
            addCriterion("NIANMOBILI6 not between", value1, value2, "nianmobili6");
            return (Criteria) this;
        }

        public Criteria andNianchuyue7IsNull() {
            addCriterion("NIANCHUYUE7 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuyue7IsNotNull() {
            addCriterion("NIANCHUYUE7 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuyue7EqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE7 =", value, "nianchuyue7");
            return (Criteria) this;
        }

        public Criteria andNianchuyue7NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE7 <>", value, "nianchuyue7");
            return (Criteria) this;
        }

        public Criteria andNianchuyue7GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUYUE7 >", value, "nianchuyue7");
            return (Criteria) this;
        }

        public Criteria andNianchuyue7GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE7 >=", value, "nianchuyue7");
            return (Criteria) this;
        }

        public Criteria andNianchuyue7LessThan(BigDecimal value) {
            addCriterion("NIANCHUYUE7 <", value, "nianchuyue7");
            return (Criteria) this;
        }

        public Criteria andNianchuyue7LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE7 <=", value, "nianchuyue7");
            return (Criteria) this;
        }

        public Criteria andNianchuyue7In(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE7 in", values, "nianchuyue7");
            return (Criteria) this;
        }

        public Criteria andNianchuyue7NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE7 not in", values, "nianchuyue7");
            return (Criteria) this;
        }

        public Criteria andNianchuyue7Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE7 between", value1, value2, "nianchuyue7");
            return (Criteria) this;
        }

        public Criteria andNianchuyue7NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE7 not between", value1, value2, "nianchuyue7");
            return (Criteria) this;
        }

        public Criteria andNianchubili7IsNull() {
            addCriterion("NIANCHUBILI7 is null");
            return (Criteria) this;
        }

        public Criteria andNianchubili7IsNotNull() {
            addCriterion("NIANCHUBILI7 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchubili7EqualTo(String value) {
            addCriterion("NIANCHUBILI7 =", value, "nianchubili7");
            return (Criteria) this;
        }

        public Criteria andNianchubili7NotEqualTo(String value) {
            addCriterion("NIANCHUBILI7 <>", value, "nianchubili7");
            return (Criteria) this;
        }

        public Criteria andNianchubili7GreaterThan(String value) {
            addCriterion("NIANCHUBILI7 >", value, "nianchubili7");
            return (Criteria) this;
        }

        public Criteria andNianchubili7GreaterThanOrEqualTo(String value) {
            addCriterion("NIANCHUBILI7 >=", value, "nianchubili7");
            return (Criteria) this;
        }

        public Criteria andNianchubili7LessThan(String value) {
            addCriterion("NIANCHUBILI7 <", value, "nianchubili7");
            return (Criteria) this;
        }

        public Criteria andNianchubili7LessThanOrEqualTo(String value) {
            addCriterion("NIANCHUBILI7 <=", value, "nianchubili7");
            return (Criteria) this;
        }

        public Criteria andNianchubili7Like(String value) {
            addCriterion("NIANCHUBILI7 like", value, "nianchubili7");
            return (Criteria) this;
        }

        public Criteria andNianchubili7NotLike(String value) {
            addCriterion("NIANCHUBILI7 not like", value, "nianchubili7");
            return (Criteria) this;
        }

        public Criteria andNianchubili7In(List<String> values) {
            addCriterion("NIANCHUBILI7 in", values, "nianchubili7");
            return (Criteria) this;
        }

        public Criteria andNianchubili7NotIn(List<String> values) {
            addCriterion("NIANCHUBILI7 not in", values, "nianchubili7");
            return (Criteria) this;
        }

        public Criteria andNianchubili7Between(String value1, String value2) {
            addCriterion("NIANCHUBILI7 between", value1, value2, "nianchubili7");
            return (Criteria) this;
        }

        public Criteria andNianchubili7NotBetween(String value1, String value2) {
            addCriterion("NIANCHUBILI7 not between", value1, value2, "nianchubili7");
            return (Criteria) this;
        }

        public Criteria andNianmoyue7IsNull() {
            addCriterion("NIANMOYUE7 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoyue7IsNotNull() {
            addCriterion("NIANMOYUE7 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoyue7EqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE7 =", value, "nianmoyue7");
            return (Criteria) this;
        }

        public Criteria andNianmoyue7NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE7 <>", value, "nianmoyue7");
            return (Criteria) this;
        }

        public Criteria andNianmoyue7GreaterThan(BigDecimal value) {
            addCriterion("NIANMOYUE7 >", value, "nianmoyue7");
            return (Criteria) this;
        }

        public Criteria andNianmoyue7GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE7 >=", value, "nianmoyue7");
            return (Criteria) this;
        }

        public Criteria andNianmoyue7LessThan(BigDecimal value) {
            addCriterion("NIANMOYUE7 <", value, "nianmoyue7");
            return (Criteria) this;
        }

        public Criteria andNianmoyue7LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE7 <=", value, "nianmoyue7");
            return (Criteria) this;
        }

        public Criteria andNianmoyue7In(List<BigDecimal> values) {
            addCriterion("NIANMOYUE7 in", values, "nianmoyue7");
            return (Criteria) this;
        }

        public Criteria andNianmoyue7NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOYUE7 not in", values, "nianmoyue7");
            return (Criteria) this;
        }

        public Criteria andNianmoyue7Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE7 between", value1, value2, "nianmoyue7");
            return (Criteria) this;
        }

        public Criteria andNianmoyue7NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE7 not between", value1, value2, "nianmoyue7");
            return (Criteria) this;
        }

        public Criteria andNianmobili7IsNull() {
            addCriterion("NIANMOBILI7 is null");
            return (Criteria) this;
        }

        public Criteria andNianmobili7IsNotNull() {
            addCriterion("NIANMOBILI7 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmobili7EqualTo(String value) {
            addCriterion("NIANMOBILI7 =", value, "nianmobili7");
            return (Criteria) this;
        }

        public Criteria andNianmobili7NotEqualTo(String value) {
            addCriterion("NIANMOBILI7 <>", value, "nianmobili7");
            return (Criteria) this;
        }

        public Criteria andNianmobili7GreaterThan(String value) {
            addCriterion("NIANMOBILI7 >", value, "nianmobili7");
            return (Criteria) this;
        }

        public Criteria andNianmobili7GreaterThanOrEqualTo(String value) {
            addCriterion("NIANMOBILI7 >=", value, "nianmobili7");
            return (Criteria) this;
        }

        public Criteria andNianmobili7LessThan(String value) {
            addCriterion("NIANMOBILI7 <", value, "nianmobili7");
            return (Criteria) this;
        }

        public Criteria andNianmobili7LessThanOrEqualTo(String value) {
            addCriterion("NIANMOBILI7 <=", value, "nianmobili7");
            return (Criteria) this;
        }

        public Criteria andNianmobili7Like(String value) {
            addCriterion("NIANMOBILI7 like", value, "nianmobili7");
            return (Criteria) this;
        }

        public Criteria andNianmobili7NotLike(String value) {
            addCriterion("NIANMOBILI7 not like", value, "nianmobili7");
            return (Criteria) this;
        }

        public Criteria andNianmobili7In(List<String> values) {
            addCriterion("NIANMOBILI7 in", values, "nianmobili7");
            return (Criteria) this;
        }

        public Criteria andNianmobili7NotIn(List<String> values) {
            addCriterion("NIANMOBILI7 not in", values, "nianmobili7");
            return (Criteria) this;
        }

        public Criteria andNianmobili7Between(String value1, String value2) {
            addCriterion("NIANMOBILI7 between", value1, value2, "nianmobili7");
            return (Criteria) this;
        }

        public Criteria andNianmobili7NotBetween(String value1, String value2) {
            addCriterion("NIANMOBILI7 not between", value1, value2, "nianmobili7");
            return (Criteria) this;
        }

        public Criteria andNianchuyue8IsNull() {
            addCriterion("NIANCHUYUE8 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuyue8IsNotNull() {
            addCriterion("NIANCHUYUE8 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuyue8EqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE8 =", value, "nianchuyue8");
            return (Criteria) this;
        }

        public Criteria andNianchuyue8NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE8 <>", value, "nianchuyue8");
            return (Criteria) this;
        }

        public Criteria andNianchuyue8GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUYUE8 >", value, "nianchuyue8");
            return (Criteria) this;
        }

        public Criteria andNianchuyue8GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE8 >=", value, "nianchuyue8");
            return (Criteria) this;
        }

        public Criteria andNianchuyue8LessThan(BigDecimal value) {
            addCriterion("NIANCHUYUE8 <", value, "nianchuyue8");
            return (Criteria) this;
        }

        public Criteria andNianchuyue8LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE8 <=", value, "nianchuyue8");
            return (Criteria) this;
        }

        public Criteria andNianchuyue8In(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE8 in", values, "nianchuyue8");
            return (Criteria) this;
        }

        public Criteria andNianchuyue8NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE8 not in", values, "nianchuyue8");
            return (Criteria) this;
        }

        public Criteria andNianchuyue8Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE8 between", value1, value2, "nianchuyue8");
            return (Criteria) this;
        }

        public Criteria andNianchuyue8NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE8 not between", value1, value2, "nianchuyue8");
            return (Criteria) this;
        }

        public Criteria andNianchubili8IsNull() {
            addCriterion("NIANCHUBILI8 is null");
            return (Criteria) this;
        }

        public Criteria andNianchubili8IsNotNull() {
            addCriterion("NIANCHUBILI8 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchubili8EqualTo(String value) {
            addCriterion("NIANCHUBILI8 =", value, "nianchubili8");
            return (Criteria) this;
        }

        public Criteria andNianchubili8NotEqualTo(String value) {
            addCriterion("NIANCHUBILI8 <>", value, "nianchubili8");
            return (Criteria) this;
        }

        public Criteria andNianchubili8GreaterThan(String value) {
            addCriterion("NIANCHUBILI8 >", value, "nianchubili8");
            return (Criteria) this;
        }

        public Criteria andNianchubili8GreaterThanOrEqualTo(String value) {
            addCriterion("NIANCHUBILI8 >=", value, "nianchubili8");
            return (Criteria) this;
        }

        public Criteria andNianchubili8LessThan(String value) {
            addCriterion("NIANCHUBILI8 <", value, "nianchubili8");
            return (Criteria) this;
        }

        public Criteria andNianchubili8LessThanOrEqualTo(String value) {
            addCriterion("NIANCHUBILI8 <=", value, "nianchubili8");
            return (Criteria) this;
        }

        public Criteria andNianchubili8Like(String value) {
            addCriterion("NIANCHUBILI8 like", value, "nianchubili8");
            return (Criteria) this;
        }

        public Criteria andNianchubili8NotLike(String value) {
            addCriterion("NIANCHUBILI8 not like", value, "nianchubili8");
            return (Criteria) this;
        }

        public Criteria andNianchubili8In(List<String> values) {
            addCriterion("NIANCHUBILI8 in", values, "nianchubili8");
            return (Criteria) this;
        }

        public Criteria andNianchubili8NotIn(List<String> values) {
            addCriterion("NIANCHUBILI8 not in", values, "nianchubili8");
            return (Criteria) this;
        }

        public Criteria andNianchubili8Between(String value1, String value2) {
            addCriterion("NIANCHUBILI8 between", value1, value2, "nianchubili8");
            return (Criteria) this;
        }

        public Criteria andNianchubili8NotBetween(String value1, String value2) {
            addCriterion("NIANCHUBILI8 not between", value1, value2, "nianchubili8");
            return (Criteria) this;
        }

        public Criteria andNianmoyue8IsNull() {
            addCriterion("NIANMOYUE8 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoyue8IsNotNull() {
            addCriterion("NIANMOYUE8 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoyue8EqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE8 =", value, "nianmoyue8");
            return (Criteria) this;
        }

        public Criteria andNianmoyue8NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE8 <>", value, "nianmoyue8");
            return (Criteria) this;
        }

        public Criteria andNianmoyue8GreaterThan(BigDecimal value) {
            addCriterion("NIANMOYUE8 >", value, "nianmoyue8");
            return (Criteria) this;
        }

        public Criteria andNianmoyue8GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE8 >=", value, "nianmoyue8");
            return (Criteria) this;
        }

        public Criteria andNianmoyue8LessThan(BigDecimal value) {
            addCriterion("NIANMOYUE8 <", value, "nianmoyue8");
            return (Criteria) this;
        }

        public Criteria andNianmoyue8LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE8 <=", value, "nianmoyue8");
            return (Criteria) this;
        }

        public Criteria andNianmoyue8In(List<BigDecimal> values) {
            addCriterion("NIANMOYUE8 in", values, "nianmoyue8");
            return (Criteria) this;
        }

        public Criteria andNianmoyue8NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOYUE8 not in", values, "nianmoyue8");
            return (Criteria) this;
        }

        public Criteria andNianmoyue8Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE8 between", value1, value2, "nianmoyue8");
            return (Criteria) this;
        }

        public Criteria andNianmoyue8NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE8 not between", value1, value2, "nianmoyue8");
            return (Criteria) this;
        }

        public Criteria andNianmobili8IsNull() {
            addCriterion("NIANMOBILI8 is null");
            return (Criteria) this;
        }

        public Criteria andNianmobili8IsNotNull() {
            addCriterion("NIANMOBILI8 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmobili8EqualTo(String value) {
            addCriterion("NIANMOBILI8 =", value, "nianmobili8");
            return (Criteria) this;
        }

        public Criteria andNianmobili8NotEqualTo(String value) {
            addCriterion("NIANMOBILI8 <>", value, "nianmobili8");
            return (Criteria) this;
        }

        public Criteria andNianmobili8GreaterThan(String value) {
            addCriterion("NIANMOBILI8 >", value, "nianmobili8");
            return (Criteria) this;
        }

        public Criteria andNianmobili8GreaterThanOrEqualTo(String value) {
            addCriterion("NIANMOBILI8 >=", value, "nianmobili8");
            return (Criteria) this;
        }

        public Criteria andNianmobili8LessThan(String value) {
            addCriterion("NIANMOBILI8 <", value, "nianmobili8");
            return (Criteria) this;
        }

        public Criteria andNianmobili8LessThanOrEqualTo(String value) {
            addCriterion("NIANMOBILI8 <=", value, "nianmobili8");
            return (Criteria) this;
        }

        public Criteria andNianmobili8Like(String value) {
            addCriterion("NIANMOBILI8 like", value, "nianmobili8");
            return (Criteria) this;
        }

        public Criteria andNianmobili8NotLike(String value) {
            addCriterion("NIANMOBILI8 not like", value, "nianmobili8");
            return (Criteria) this;
        }

        public Criteria andNianmobili8In(List<String> values) {
            addCriterion("NIANMOBILI8 in", values, "nianmobili8");
            return (Criteria) this;
        }

        public Criteria andNianmobili8NotIn(List<String> values) {
            addCriterion("NIANMOBILI8 not in", values, "nianmobili8");
            return (Criteria) this;
        }

        public Criteria andNianmobili8Between(String value1, String value2) {
            addCriterion("NIANMOBILI8 between", value1, value2, "nianmobili8");
            return (Criteria) this;
        }

        public Criteria andNianmobili8NotBetween(String value1, String value2) {
            addCriterion("NIANMOBILI8 not between", value1, value2, "nianmobili8");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyue1IsNull() {
            addCriterion("NIANCHUHEJIYUE1 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyue1IsNotNull() {
            addCriterion("NIANCHUHEJIYUE1 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyue1EqualTo(BigDecimal value) {
            addCriterion("NIANCHUHEJIYUE1 =", value, "nianchuhejiyue1");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyue1NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUHEJIYUE1 <>", value, "nianchuhejiyue1");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyue1GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUHEJIYUE1 >", value, "nianchuhejiyue1");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyue1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUHEJIYUE1 >=", value, "nianchuhejiyue1");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyue1LessThan(BigDecimal value) {
            addCriterion("NIANCHUHEJIYUE1 <", value, "nianchuhejiyue1");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyue1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUHEJIYUE1 <=", value, "nianchuhejiyue1");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyue1In(List<BigDecimal> values) {
            addCriterion("NIANCHUHEJIYUE1 in", values, "nianchuhejiyue1");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyue1NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUHEJIYUE1 not in", values, "nianchuhejiyue1");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyue1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUHEJIYUE1 between", value1, value2, "nianchuhejiyue1");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyue1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUHEJIYUE1 not between", value1, value2, "nianchuhejiyue1");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibili1IsNull() {
            addCriterion("NIANCHUHEJIBILI1 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibili1IsNotNull() {
            addCriterion("NIANCHUHEJIBILI1 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibili1EqualTo(String value) {
            addCriterion("NIANCHUHEJIBILI1 =", value, "nianchuhejibili1");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibili1NotEqualTo(String value) {
            addCriterion("NIANCHUHEJIBILI1 <>", value, "nianchuhejibili1");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibili1GreaterThan(String value) {
            addCriterion("NIANCHUHEJIBILI1 >", value, "nianchuhejibili1");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibili1GreaterThanOrEqualTo(String value) {
            addCriterion("NIANCHUHEJIBILI1 >=", value, "nianchuhejibili1");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibili1LessThan(String value) {
            addCriterion("NIANCHUHEJIBILI1 <", value, "nianchuhejibili1");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibili1LessThanOrEqualTo(String value) {
            addCriterion("NIANCHUHEJIBILI1 <=", value, "nianchuhejibili1");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibili1Like(String value) {
            addCriterion("NIANCHUHEJIBILI1 like", value, "nianchuhejibili1");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibili1NotLike(String value) {
            addCriterion("NIANCHUHEJIBILI1 not like", value, "nianchuhejibili1");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibili1In(List<String> values) {
            addCriterion("NIANCHUHEJIBILI1 in", values, "nianchuhejibili1");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibili1NotIn(List<String> values) {
            addCriterion("NIANCHUHEJIBILI1 not in", values, "nianchuhejibili1");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibili1Between(String value1, String value2) {
            addCriterion("NIANCHUHEJIBILI1 between", value1, value2, "nianchuhejibili1");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibili1NotBetween(String value1, String value2) {
            addCriterion("NIANCHUHEJIBILI1 not between", value1, value2, "nianchuhejibili1");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyue1IsNull() {
            addCriterion("NIANMOHEJIYUE1 is null");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyue1IsNotNull() {
            addCriterion("NIANMOHEJIYUE1 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyue1EqualTo(BigDecimal value) {
            addCriterion("NIANMOHEJIYUE1 =", value, "nianmohejiyue1");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyue1NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOHEJIYUE1 <>", value, "nianmohejiyue1");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyue1GreaterThan(BigDecimal value) {
            addCriterion("NIANMOHEJIYUE1 >", value, "nianmohejiyue1");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyue1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOHEJIYUE1 >=", value, "nianmohejiyue1");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyue1LessThan(BigDecimal value) {
            addCriterion("NIANMOHEJIYUE1 <", value, "nianmohejiyue1");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyue1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOHEJIYUE1 <=", value, "nianmohejiyue1");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyue1In(List<BigDecimal> values) {
            addCriterion("NIANMOHEJIYUE1 in", values, "nianmohejiyue1");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyue1NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOHEJIYUE1 not in", values, "nianmohejiyue1");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyue1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOHEJIYUE1 between", value1, value2, "nianmohejiyue1");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyue1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOHEJIYUE1 not between", value1, value2, "nianmohejiyue1");
            return (Criteria) this;
        }

        public Criteria andNianmohejibili1IsNull() {
            addCriterion("NIANMOHEJIBILI1 is null");
            return (Criteria) this;
        }

        public Criteria andNianmohejibili1IsNotNull() {
            addCriterion("NIANMOHEJIBILI1 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmohejibili1EqualTo(String value) {
            addCriterion("NIANMOHEJIBILI1 =", value, "nianmohejibili1");
            return (Criteria) this;
        }

        public Criteria andNianmohejibili1NotEqualTo(String value) {
            addCriterion("NIANMOHEJIBILI1 <>", value, "nianmohejibili1");
            return (Criteria) this;
        }

        public Criteria andNianmohejibili1GreaterThan(String value) {
            addCriterion("NIANMOHEJIBILI1 >", value, "nianmohejibili1");
            return (Criteria) this;
        }

        public Criteria andNianmohejibili1GreaterThanOrEqualTo(String value) {
            addCriterion("NIANMOHEJIBILI1 >=", value, "nianmohejibili1");
            return (Criteria) this;
        }

        public Criteria andNianmohejibili1LessThan(String value) {
            addCriterion("NIANMOHEJIBILI1 <", value, "nianmohejibili1");
            return (Criteria) this;
        }

        public Criteria andNianmohejibili1LessThanOrEqualTo(String value) {
            addCriterion("NIANMOHEJIBILI1 <=", value, "nianmohejibili1");
            return (Criteria) this;
        }

        public Criteria andNianmohejibili1Like(String value) {
            addCriterion("NIANMOHEJIBILI1 like", value, "nianmohejibili1");
            return (Criteria) this;
        }

        public Criteria andNianmohejibili1NotLike(String value) {
            addCriterion("NIANMOHEJIBILI1 not like", value, "nianmohejibili1");
            return (Criteria) this;
        }

        public Criteria andNianmohejibili1In(List<String> values) {
            addCriterion("NIANMOHEJIBILI1 in", values, "nianmohejibili1");
            return (Criteria) this;
        }

        public Criteria andNianmohejibili1NotIn(List<String> values) {
            addCriterion("NIANMOHEJIBILI1 not in", values, "nianmohejibili1");
            return (Criteria) this;
        }

        public Criteria andNianmohejibili1Between(String value1, String value2) {
            addCriterion("NIANMOHEJIBILI1 between", value1, value2, "nianmohejibili1");
            return (Criteria) this;
        }

        public Criteria andNianmohejibili1NotBetween(String value1, String value2) {
            addCriterion("NIANMOHEJIBILI1 not between", value1, value2, "nianmohejibili1");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue1IsNull() {
            addCriterion("NIANCHUQITAYUE1 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue1IsNotNull() {
            addCriterion("NIANCHUQITAYUE1 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue1EqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE1 =", value, "nianchuqitayue1");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue1NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE1 <>", value, "nianchuqitayue1");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue1GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE1 >", value, "nianchuqitayue1");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE1 >=", value, "nianchuqitayue1");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue1LessThan(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE1 <", value, "nianchuqitayue1");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE1 <=", value, "nianchuqitayue1");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue1In(List<BigDecimal> values) {
            addCriterion("NIANCHUQITAYUE1 in", values, "nianchuqitayue1");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue1NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUQITAYUE1 not in", values, "nianchuqitayue1");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUQITAYUE1 between", value1, value2, "nianchuqitayue1");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUQITAYUE1 not between", value1, value2, "nianchuqitayue1");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili1IsNull() {
            addCriterion("NIANCHUQITABILI1 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili1IsNotNull() {
            addCriterion("NIANCHUQITABILI1 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili1EqualTo(String value) {
            addCriterion("NIANCHUQITABILI1 =", value, "nianchuqitabili1");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili1NotEqualTo(String value) {
            addCriterion("NIANCHUQITABILI1 <>", value, "nianchuqitabili1");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili1GreaterThan(String value) {
            addCriterion("NIANCHUQITABILI1 >", value, "nianchuqitabili1");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili1GreaterThanOrEqualTo(String value) {
            addCriterion("NIANCHUQITABILI1 >=", value, "nianchuqitabili1");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili1LessThan(String value) {
            addCriterion("NIANCHUQITABILI1 <", value, "nianchuqitabili1");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili1LessThanOrEqualTo(String value) {
            addCriterion("NIANCHUQITABILI1 <=", value, "nianchuqitabili1");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili1Like(String value) {
            addCriterion("NIANCHUQITABILI1 like", value, "nianchuqitabili1");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili1NotLike(String value) {
            addCriterion("NIANCHUQITABILI1 not like", value, "nianchuqitabili1");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili1In(List<String> values) {
            addCriterion("NIANCHUQITABILI1 in", values, "nianchuqitabili1");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili1NotIn(List<String> values) {
            addCriterion("NIANCHUQITABILI1 not in", values, "nianchuqitabili1");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili1Between(String value1, String value2) {
            addCriterion("NIANCHUQITABILI1 between", value1, value2, "nianchuqitabili1");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili1NotBetween(String value1, String value2) {
            addCriterion("NIANCHUQITABILI1 not between", value1, value2, "nianchuqitabili1");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue1IsNull() {
            addCriterion("NIANMOQITAYUE1 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue1IsNotNull() {
            addCriterion("NIANMOQITAYUE1 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue1EqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE1 =", value, "nianmoqitayue1");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue1NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE1 <>", value, "nianmoqitayue1");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue1GreaterThan(BigDecimal value) {
            addCriterion("NIANMOQITAYUE1 >", value, "nianmoqitayue1");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE1 >=", value, "nianmoqitayue1");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue1LessThan(BigDecimal value) {
            addCriterion("NIANMOQITAYUE1 <", value, "nianmoqitayue1");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE1 <=", value, "nianmoqitayue1");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue1In(List<BigDecimal> values) {
            addCriterion("NIANMOQITAYUE1 in", values, "nianmoqitayue1");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue1NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOQITAYUE1 not in", values, "nianmoqitayue1");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOQITAYUE1 between", value1, value2, "nianmoqitayue1");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOQITAYUE1 not between", value1, value2, "nianmoqitayue1");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili1IsNull() {
            addCriterion("NIANMOQITABILI1 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili1IsNotNull() {
            addCriterion("NIANMOQITABILI1 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili1EqualTo(String value) {
            addCriterion("NIANMOQITABILI1 =", value, "nianmoqitabili1");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili1NotEqualTo(String value) {
            addCriterion("NIANMOQITABILI1 <>", value, "nianmoqitabili1");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili1GreaterThan(String value) {
            addCriterion("NIANMOQITABILI1 >", value, "nianmoqitabili1");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili1GreaterThanOrEqualTo(String value) {
            addCriterion("NIANMOQITABILI1 >=", value, "nianmoqitabili1");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili1LessThan(String value) {
            addCriterion("NIANMOQITABILI1 <", value, "nianmoqitabili1");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili1LessThanOrEqualTo(String value) {
            addCriterion("NIANMOQITABILI1 <=", value, "nianmoqitabili1");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili1Like(String value) {
            addCriterion("NIANMOQITABILI1 like", value, "nianmoqitabili1");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili1NotLike(String value) {
            addCriterion("NIANMOQITABILI1 not like", value, "nianmoqitabili1");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili1In(List<String> values) {
            addCriterion("NIANMOQITABILI1 in", values, "nianmoqitabili1");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili1NotIn(List<String> values) {
            addCriterion("NIANMOQITABILI1 not in", values, "nianmoqitabili1");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili1Between(String value1, String value2) {
            addCriterion("NIANMOQITABILI1 between", value1, value2, "nianmoqitabili1");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili1NotBetween(String value1, String value2) {
            addCriterion("NIANMOQITABILI1 not between", value1, value2, "nianmoqitabili1");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue2IsNull() {
            addCriterion("NIANCHUQITAYUE2 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue2IsNotNull() {
            addCriterion("NIANCHUQITAYUE2 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue2EqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE2 =", value, "nianchuqitayue2");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue2NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE2 <>", value, "nianchuqitayue2");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue2GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE2 >", value, "nianchuqitayue2");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE2 >=", value, "nianchuqitayue2");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue2LessThan(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE2 <", value, "nianchuqitayue2");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE2 <=", value, "nianchuqitayue2");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue2In(List<BigDecimal> values) {
            addCriterion("NIANCHUQITAYUE2 in", values, "nianchuqitayue2");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue2NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUQITAYUE2 not in", values, "nianchuqitayue2");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUQITAYUE2 between", value1, value2, "nianchuqitayue2");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUQITAYUE2 not between", value1, value2, "nianchuqitayue2");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili2IsNull() {
            addCriterion("NIANCHUQITABILI2 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili2IsNotNull() {
            addCriterion("NIANCHUQITABILI2 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili2EqualTo(String value) {
            addCriterion("NIANCHUQITABILI2 =", value, "nianchuqitabili2");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili2NotEqualTo(String value) {
            addCriterion("NIANCHUQITABILI2 <>", value, "nianchuqitabili2");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili2GreaterThan(String value) {
            addCriterion("NIANCHUQITABILI2 >", value, "nianchuqitabili2");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili2GreaterThanOrEqualTo(String value) {
            addCriterion("NIANCHUQITABILI2 >=", value, "nianchuqitabili2");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili2LessThan(String value) {
            addCriterion("NIANCHUQITABILI2 <", value, "nianchuqitabili2");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili2LessThanOrEqualTo(String value) {
            addCriterion("NIANCHUQITABILI2 <=", value, "nianchuqitabili2");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili2Like(String value) {
            addCriterion("NIANCHUQITABILI2 like", value, "nianchuqitabili2");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili2NotLike(String value) {
            addCriterion("NIANCHUQITABILI2 not like", value, "nianchuqitabili2");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili2In(List<String> values) {
            addCriterion("NIANCHUQITABILI2 in", values, "nianchuqitabili2");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili2NotIn(List<String> values) {
            addCriterion("NIANCHUQITABILI2 not in", values, "nianchuqitabili2");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili2Between(String value1, String value2) {
            addCriterion("NIANCHUQITABILI2 between", value1, value2, "nianchuqitabili2");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili2NotBetween(String value1, String value2) {
            addCriterion("NIANCHUQITABILI2 not between", value1, value2, "nianchuqitabili2");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue2IsNull() {
            addCriterion("NIANMOQITAYUE2 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue2IsNotNull() {
            addCriterion("NIANMOQITAYUE2 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue2EqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE2 =", value, "nianmoqitayue2");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue2NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE2 <>", value, "nianmoqitayue2");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue2GreaterThan(BigDecimal value) {
            addCriterion("NIANMOQITAYUE2 >", value, "nianmoqitayue2");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE2 >=", value, "nianmoqitayue2");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue2LessThan(BigDecimal value) {
            addCriterion("NIANMOQITAYUE2 <", value, "nianmoqitayue2");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE2 <=", value, "nianmoqitayue2");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue2In(List<BigDecimal> values) {
            addCriterion("NIANMOQITAYUE2 in", values, "nianmoqitayue2");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue2NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOQITAYUE2 not in", values, "nianmoqitayue2");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOQITAYUE2 between", value1, value2, "nianmoqitayue2");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOQITAYUE2 not between", value1, value2, "nianmoqitayue2");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili2IsNull() {
            addCriterion("NIANMOQITABILI2 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili2IsNotNull() {
            addCriterion("NIANMOQITABILI2 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili2EqualTo(String value) {
            addCriterion("NIANMOQITABILI2 =", value, "nianmoqitabili2");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili2NotEqualTo(String value) {
            addCriterion("NIANMOQITABILI2 <>", value, "nianmoqitabili2");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili2GreaterThan(String value) {
            addCriterion("NIANMOQITABILI2 >", value, "nianmoqitabili2");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili2GreaterThanOrEqualTo(String value) {
            addCriterion("NIANMOQITABILI2 >=", value, "nianmoqitabili2");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili2LessThan(String value) {
            addCriterion("NIANMOQITABILI2 <", value, "nianmoqitabili2");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili2LessThanOrEqualTo(String value) {
            addCriterion("NIANMOQITABILI2 <=", value, "nianmoqitabili2");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili2Like(String value) {
            addCriterion("NIANMOQITABILI2 like", value, "nianmoqitabili2");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili2NotLike(String value) {
            addCriterion("NIANMOQITABILI2 not like", value, "nianmoqitabili2");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili2In(List<String> values) {
            addCriterion("NIANMOQITABILI2 in", values, "nianmoqitabili2");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili2NotIn(List<String> values) {
            addCriterion("NIANMOQITABILI2 not in", values, "nianmoqitabili2");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili2Between(String value1, String value2) {
            addCriterion("NIANMOQITABILI2 between", value1, value2, "nianmoqitabili2");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili2NotBetween(String value1, String value2) {
            addCriterion("NIANMOQITABILI2 not between", value1, value2, "nianmoqitabili2");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue3IsNull() {
            addCriterion("NIANCHUQITAYUE3 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue3IsNotNull() {
            addCriterion("NIANCHUQITAYUE3 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue3EqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE3 =", value, "nianchuqitayue3");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue3NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE3 <>", value, "nianchuqitayue3");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue3GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE3 >", value, "nianchuqitayue3");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE3 >=", value, "nianchuqitayue3");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue3LessThan(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE3 <", value, "nianchuqitayue3");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE3 <=", value, "nianchuqitayue3");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue3In(List<BigDecimal> values) {
            addCriterion("NIANCHUQITAYUE3 in", values, "nianchuqitayue3");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue3NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUQITAYUE3 not in", values, "nianchuqitayue3");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUQITAYUE3 between", value1, value2, "nianchuqitayue3");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUQITAYUE3 not between", value1, value2, "nianchuqitayue3");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili3IsNull() {
            addCriterion("NIANCHUQITABILI3 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili3IsNotNull() {
            addCriterion("NIANCHUQITABILI3 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili3EqualTo(String value) {
            addCriterion("NIANCHUQITABILI3 =", value, "nianchuqitabili3");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili3NotEqualTo(String value) {
            addCriterion("NIANCHUQITABILI3 <>", value, "nianchuqitabili3");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili3GreaterThan(String value) {
            addCriterion("NIANCHUQITABILI3 >", value, "nianchuqitabili3");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili3GreaterThanOrEqualTo(String value) {
            addCriterion("NIANCHUQITABILI3 >=", value, "nianchuqitabili3");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili3LessThan(String value) {
            addCriterion("NIANCHUQITABILI3 <", value, "nianchuqitabili3");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili3LessThanOrEqualTo(String value) {
            addCriterion("NIANCHUQITABILI3 <=", value, "nianchuqitabili3");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili3Like(String value) {
            addCriterion("NIANCHUQITABILI3 like", value, "nianchuqitabili3");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili3NotLike(String value) {
            addCriterion("NIANCHUQITABILI3 not like", value, "nianchuqitabili3");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili3In(List<String> values) {
            addCriterion("NIANCHUQITABILI3 in", values, "nianchuqitabili3");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili3NotIn(List<String> values) {
            addCriterion("NIANCHUQITABILI3 not in", values, "nianchuqitabili3");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili3Between(String value1, String value2) {
            addCriterion("NIANCHUQITABILI3 between", value1, value2, "nianchuqitabili3");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili3NotBetween(String value1, String value2) {
            addCriterion("NIANCHUQITABILI3 not between", value1, value2, "nianchuqitabili3");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue3IsNull() {
            addCriterion("NIANMOQITAYUE3 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue3IsNotNull() {
            addCriterion("NIANMOQITAYUE3 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue3EqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE3 =", value, "nianmoqitayue3");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue3NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE3 <>", value, "nianmoqitayue3");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue3GreaterThan(BigDecimal value) {
            addCriterion("NIANMOQITAYUE3 >", value, "nianmoqitayue3");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE3 >=", value, "nianmoqitayue3");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue3LessThan(BigDecimal value) {
            addCriterion("NIANMOQITAYUE3 <", value, "nianmoqitayue3");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE3 <=", value, "nianmoqitayue3");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue3In(List<BigDecimal> values) {
            addCriterion("NIANMOQITAYUE3 in", values, "nianmoqitayue3");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue3NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOQITAYUE3 not in", values, "nianmoqitayue3");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOQITAYUE3 between", value1, value2, "nianmoqitayue3");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOQITAYUE3 not between", value1, value2, "nianmoqitayue3");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili3IsNull() {
            addCriterion("NIANMOQITABILI3 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili3IsNotNull() {
            addCriterion("NIANMOQITABILI3 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili3EqualTo(String value) {
            addCriterion("NIANMOQITABILI3 =", value, "nianmoqitabili3");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili3NotEqualTo(String value) {
            addCriterion("NIANMOQITABILI3 <>", value, "nianmoqitabili3");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili3GreaterThan(String value) {
            addCriterion("NIANMOQITABILI3 >", value, "nianmoqitabili3");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili3GreaterThanOrEqualTo(String value) {
            addCriterion("NIANMOQITABILI3 >=", value, "nianmoqitabili3");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili3LessThan(String value) {
            addCriterion("NIANMOQITABILI3 <", value, "nianmoqitabili3");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili3LessThanOrEqualTo(String value) {
            addCriterion("NIANMOQITABILI3 <=", value, "nianmoqitabili3");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili3Like(String value) {
            addCriterion("NIANMOQITABILI3 like", value, "nianmoqitabili3");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili3NotLike(String value) {
            addCriterion("NIANMOQITABILI3 not like", value, "nianmoqitabili3");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili3In(List<String> values) {
            addCriterion("NIANMOQITABILI3 in", values, "nianmoqitabili3");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili3NotIn(List<String> values) {
            addCriterion("NIANMOQITABILI3 not in", values, "nianmoqitabili3");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili3Between(String value1, String value2) {
            addCriterion("NIANMOQITABILI3 between", value1, value2, "nianmoqitabili3");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili3NotBetween(String value1, String value2) {
            addCriterion("NIANMOQITABILI3 not between", value1, value2, "nianmoqitabili3");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue4IsNull() {
            addCriterion("NIANCHUQITAYUE4 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue4IsNotNull() {
            addCriterion("NIANCHUQITAYUE4 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue4EqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE4 =", value, "nianchuqitayue4");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue4NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE4 <>", value, "nianchuqitayue4");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue4GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE4 >", value, "nianchuqitayue4");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE4 >=", value, "nianchuqitayue4");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue4LessThan(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE4 <", value, "nianchuqitayue4");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE4 <=", value, "nianchuqitayue4");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue4In(List<BigDecimal> values) {
            addCriterion("NIANCHUQITAYUE4 in", values, "nianchuqitayue4");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue4NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUQITAYUE4 not in", values, "nianchuqitayue4");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUQITAYUE4 between", value1, value2, "nianchuqitayue4");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUQITAYUE4 not between", value1, value2, "nianchuqitayue4");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili4IsNull() {
            addCriterion("NIANCHUQITABILI4 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili4IsNotNull() {
            addCriterion("NIANCHUQITABILI4 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili4EqualTo(String value) {
            addCriterion("NIANCHUQITABILI4 =", value, "nianchuqitabili4");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili4NotEqualTo(String value) {
            addCriterion("NIANCHUQITABILI4 <>", value, "nianchuqitabili4");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili4GreaterThan(String value) {
            addCriterion("NIANCHUQITABILI4 >", value, "nianchuqitabili4");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili4GreaterThanOrEqualTo(String value) {
            addCriterion("NIANCHUQITABILI4 >=", value, "nianchuqitabili4");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili4LessThan(String value) {
            addCriterion("NIANCHUQITABILI4 <", value, "nianchuqitabili4");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili4LessThanOrEqualTo(String value) {
            addCriterion("NIANCHUQITABILI4 <=", value, "nianchuqitabili4");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili4Like(String value) {
            addCriterion("NIANCHUQITABILI4 like", value, "nianchuqitabili4");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili4NotLike(String value) {
            addCriterion("NIANCHUQITABILI4 not like", value, "nianchuqitabili4");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili4In(List<String> values) {
            addCriterion("NIANCHUQITABILI4 in", values, "nianchuqitabili4");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili4NotIn(List<String> values) {
            addCriterion("NIANCHUQITABILI4 not in", values, "nianchuqitabili4");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili4Between(String value1, String value2) {
            addCriterion("NIANCHUQITABILI4 between", value1, value2, "nianchuqitabili4");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili4NotBetween(String value1, String value2) {
            addCriterion("NIANCHUQITABILI4 not between", value1, value2, "nianchuqitabili4");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue4IsNull() {
            addCriterion("NIANMOQITAYUE4 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue4IsNotNull() {
            addCriterion("NIANMOQITAYUE4 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue4EqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE4 =", value, "nianmoqitayue4");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue4NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE4 <>", value, "nianmoqitayue4");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue4GreaterThan(BigDecimal value) {
            addCriterion("NIANMOQITAYUE4 >", value, "nianmoqitayue4");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE4 >=", value, "nianmoqitayue4");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue4LessThan(BigDecimal value) {
            addCriterion("NIANMOQITAYUE4 <", value, "nianmoqitayue4");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE4 <=", value, "nianmoqitayue4");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue4In(List<BigDecimal> values) {
            addCriterion("NIANMOQITAYUE4 in", values, "nianmoqitayue4");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue4NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOQITAYUE4 not in", values, "nianmoqitayue4");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOQITAYUE4 between", value1, value2, "nianmoqitayue4");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOQITAYUE4 not between", value1, value2, "nianmoqitayue4");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili4IsNull() {
            addCriterion("NIANMOQITABILI4 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili4IsNotNull() {
            addCriterion("NIANMOQITABILI4 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili4EqualTo(String value) {
            addCriterion("NIANMOQITABILI4 =", value, "nianmoqitabili4");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili4NotEqualTo(String value) {
            addCriterion("NIANMOQITABILI4 <>", value, "nianmoqitabili4");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili4GreaterThan(String value) {
            addCriterion("NIANMOQITABILI4 >", value, "nianmoqitabili4");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili4GreaterThanOrEqualTo(String value) {
            addCriterion("NIANMOQITABILI4 >=", value, "nianmoqitabili4");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili4LessThan(String value) {
            addCriterion("NIANMOQITABILI4 <", value, "nianmoqitabili4");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili4LessThanOrEqualTo(String value) {
            addCriterion("NIANMOQITABILI4 <=", value, "nianmoqitabili4");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili4Like(String value) {
            addCriterion("NIANMOQITABILI4 like", value, "nianmoqitabili4");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili4NotLike(String value) {
            addCriterion("NIANMOQITABILI4 not like", value, "nianmoqitabili4");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili4In(List<String> values) {
            addCriterion("NIANMOQITABILI4 in", values, "nianmoqitabili4");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili4NotIn(List<String> values) {
            addCriterion("NIANMOQITABILI4 not in", values, "nianmoqitabili4");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili4Between(String value1, String value2) {
            addCriterion("NIANMOQITABILI4 between", value1, value2, "nianmoqitabili4");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili4NotBetween(String value1, String value2) {
            addCriterion("NIANMOQITABILI4 not between", value1, value2, "nianmoqitabili4");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue5IsNull() {
            addCriterion("NIANCHUQITAYUE5 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue5IsNotNull() {
            addCriterion("NIANCHUQITAYUE5 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue5EqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE5 =", value, "nianchuqitayue5");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue5NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE5 <>", value, "nianchuqitayue5");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue5GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE5 >", value, "nianchuqitayue5");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE5 >=", value, "nianchuqitayue5");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue5LessThan(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE5 <", value, "nianchuqitayue5");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE5 <=", value, "nianchuqitayue5");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue5In(List<BigDecimal> values) {
            addCriterion("NIANCHUQITAYUE5 in", values, "nianchuqitayue5");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue5NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUQITAYUE5 not in", values, "nianchuqitayue5");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUQITAYUE5 between", value1, value2, "nianchuqitayue5");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUQITAYUE5 not between", value1, value2, "nianchuqitayue5");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili5IsNull() {
            addCriterion("NIANCHUQITABILI5 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili5IsNotNull() {
            addCriterion("NIANCHUQITABILI5 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili5EqualTo(String value) {
            addCriterion("NIANCHUQITABILI5 =", value, "nianchuqitabili5");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili5NotEqualTo(String value) {
            addCriterion("NIANCHUQITABILI5 <>", value, "nianchuqitabili5");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili5GreaterThan(String value) {
            addCriterion("NIANCHUQITABILI5 >", value, "nianchuqitabili5");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili5GreaterThanOrEqualTo(String value) {
            addCriterion("NIANCHUQITABILI5 >=", value, "nianchuqitabili5");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili5LessThan(String value) {
            addCriterion("NIANCHUQITABILI5 <", value, "nianchuqitabili5");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili5LessThanOrEqualTo(String value) {
            addCriterion("NIANCHUQITABILI5 <=", value, "nianchuqitabili5");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili5Like(String value) {
            addCriterion("NIANCHUQITABILI5 like", value, "nianchuqitabili5");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili5NotLike(String value) {
            addCriterion("NIANCHUQITABILI5 not like", value, "nianchuqitabili5");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili5In(List<String> values) {
            addCriterion("NIANCHUQITABILI5 in", values, "nianchuqitabili5");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili5NotIn(List<String> values) {
            addCriterion("NIANCHUQITABILI5 not in", values, "nianchuqitabili5");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili5Between(String value1, String value2) {
            addCriterion("NIANCHUQITABILI5 between", value1, value2, "nianchuqitabili5");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili5NotBetween(String value1, String value2) {
            addCriterion("NIANCHUQITABILI5 not between", value1, value2, "nianchuqitabili5");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue5IsNull() {
            addCriterion("NIANMOQITAYUE5 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue5IsNotNull() {
            addCriterion("NIANMOQITAYUE5 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue5EqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE5 =", value, "nianmoqitayue5");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue5NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE5 <>", value, "nianmoqitayue5");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue5GreaterThan(BigDecimal value) {
            addCriterion("NIANMOQITAYUE5 >", value, "nianmoqitayue5");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE5 >=", value, "nianmoqitayue5");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue5LessThan(BigDecimal value) {
            addCriterion("NIANMOQITAYUE5 <", value, "nianmoqitayue5");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE5 <=", value, "nianmoqitayue5");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue5In(List<BigDecimal> values) {
            addCriterion("NIANMOQITAYUE5 in", values, "nianmoqitayue5");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue5NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOQITAYUE5 not in", values, "nianmoqitayue5");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOQITAYUE5 between", value1, value2, "nianmoqitayue5");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOQITAYUE5 not between", value1, value2, "nianmoqitayue5");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili5IsNull() {
            addCriterion("NIANMOQITABILI5 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili5IsNotNull() {
            addCriterion("NIANMOQITABILI5 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili5EqualTo(String value) {
            addCriterion("NIANMOQITABILI5 =", value, "nianmoqitabili5");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili5NotEqualTo(String value) {
            addCriterion("NIANMOQITABILI5 <>", value, "nianmoqitabili5");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili5GreaterThan(String value) {
            addCriterion("NIANMOQITABILI5 >", value, "nianmoqitabili5");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili5GreaterThanOrEqualTo(String value) {
            addCriterion("NIANMOQITABILI5 >=", value, "nianmoqitabili5");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili5LessThan(String value) {
            addCriterion("NIANMOQITABILI5 <", value, "nianmoqitabili5");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili5LessThanOrEqualTo(String value) {
            addCriterion("NIANMOQITABILI5 <=", value, "nianmoqitabili5");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili5Like(String value) {
            addCriterion("NIANMOQITABILI5 like", value, "nianmoqitabili5");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili5NotLike(String value) {
            addCriterion("NIANMOQITABILI5 not like", value, "nianmoqitabili5");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili5In(List<String> values) {
            addCriterion("NIANMOQITABILI5 in", values, "nianmoqitabili5");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili5NotIn(List<String> values) {
            addCriterion("NIANMOQITABILI5 not in", values, "nianmoqitabili5");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili5Between(String value1, String value2) {
            addCriterion("NIANMOQITABILI5 between", value1, value2, "nianmoqitabili5");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili5NotBetween(String value1, String value2) {
            addCriterion("NIANMOQITABILI5 not between", value1, value2, "nianmoqitabili5");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue6IsNull() {
            addCriterion("NIANCHUQITAYUE6 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue6IsNotNull() {
            addCriterion("NIANCHUQITAYUE6 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue6EqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE6 =", value, "nianchuqitayue6");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue6NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE6 <>", value, "nianchuqitayue6");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue6GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE6 >", value, "nianchuqitayue6");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE6 >=", value, "nianchuqitayue6");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue6LessThan(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE6 <", value, "nianchuqitayue6");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE6 <=", value, "nianchuqitayue6");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue6In(List<BigDecimal> values) {
            addCriterion("NIANCHUQITAYUE6 in", values, "nianchuqitayue6");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue6NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUQITAYUE6 not in", values, "nianchuqitayue6");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUQITAYUE6 between", value1, value2, "nianchuqitayue6");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUQITAYUE6 not between", value1, value2, "nianchuqitayue6");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili6IsNull() {
            addCriterion("NIANCHUQITABILI6 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili6IsNotNull() {
            addCriterion("NIANCHUQITABILI6 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili6EqualTo(String value) {
            addCriterion("NIANCHUQITABILI6 =", value, "nianchuqitabili6");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili6NotEqualTo(String value) {
            addCriterion("NIANCHUQITABILI6 <>", value, "nianchuqitabili6");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili6GreaterThan(String value) {
            addCriterion("NIANCHUQITABILI6 >", value, "nianchuqitabili6");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili6GreaterThanOrEqualTo(String value) {
            addCriterion("NIANCHUQITABILI6 >=", value, "nianchuqitabili6");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili6LessThan(String value) {
            addCriterion("NIANCHUQITABILI6 <", value, "nianchuqitabili6");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili6LessThanOrEqualTo(String value) {
            addCriterion("NIANCHUQITABILI6 <=", value, "nianchuqitabili6");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili6Like(String value) {
            addCriterion("NIANCHUQITABILI6 like", value, "nianchuqitabili6");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili6NotLike(String value) {
            addCriterion("NIANCHUQITABILI6 not like", value, "nianchuqitabili6");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili6In(List<String> values) {
            addCriterion("NIANCHUQITABILI6 in", values, "nianchuqitabili6");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili6NotIn(List<String> values) {
            addCriterion("NIANCHUQITABILI6 not in", values, "nianchuqitabili6");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili6Between(String value1, String value2) {
            addCriterion("NIANCHUQITABILI6 between", value1, value2, "nianchuqitabili6");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili6NotBetween(String value1, String value2) {
            addCriterion("NIANCHUQITABILI6 not between", value1, value2, "nianchuqitabili6");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue6IsNull() {
            addCriterion("NIANMOQITAYUE6 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue6IsNotNull() {
            addCriterion("NIANMOQITAYUE6 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue6EqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE6 =", value, "nianmoqitayue6");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue6NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE6 <>", value, "nianmoqitayue6");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue6GreaterThan(BigDecimal value) {
            addCriterion("NIANMOQITAYUE6 >", value, "nianmoqitayue6");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE6 >=", value, "nianmoqitayue6");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue6LessThan(BigDecimal value) {
            addCriterion("NIANMOQITAYUE6 <", value, "nianmoqitayue6");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE6 <=", value, "nianmoqitayue6");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue6In(List<BigDecimal> values) {
            addCriterion("NIANMOQITAYUE6 in", values, "nianmoqitayue6");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue6NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOQITAYUE6 not in", values, "nianmoqitayue6");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOQITAYUE6 between", value1, value2, "nianmoqitayue6");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOQITAYUE6 not between", value1, value2, "nianmoqitayue6");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili6IsNull() {
            addCriterion("NIANMOQITABILI6 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili6IsNotNull() {
            addCriterion("NIANMOQITABILI6 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili6EqualTo(String value) {
            addCriterion("NIANMOQITABILI6 =", value, "nianmoqitabili6");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili6NotEqualTo(String value) {
            addCriterion("NIANMOQITABILI6 <>", value, "nianmoqitabili6");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili6GreaterThan(String value) {
            addCriterion("NIANMOQITABILI6 >", value, "nianmoqitabili6");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili6GreaterThanOrEqualTo(String value) {
            addCriterion("NIANMOQITABILI6 >=", value, "nianmoqitabili6");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili6LessThan(String value) {
            addCriterion("NIANMOQITABILI6 <", value, "nianmoqitabili6");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili6LessThanOrEqualTo(String value) {
            addCriterion("NIANMOQITABILI6 <=", value, "nianmoqitabili6");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili6Like(String value) {
            addCriterion("NIANMOQITABILI6 like", value, "nianmoqitabili6");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili6NotLike(String value) {
            addCriterion("NIANMOQITABILI6 not like", value, "nianmoqitabili6");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili6In(List<String> values) {
            addCriterion("NIANMOQITABILI6 in", values, "nianmoqitabili6");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili6NotIn(List<String> values) {
            addCriterion("NIANMOQITABILI6 not in", values, "nianmoqitabili6");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili6Between(String value1, String value2) {
            addCriterion("NIANMOQITABILI6 between", value1, value2, "nianmoqitabili6");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili6NotBetween(String value1, String value2) {
            addCriterion("NIANMOQITABILI6 not between", value1, value2, "nianmoqitabili6");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue7IsNull() {
            addCriterion("NIANCHUQITAYUE7 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue7IsNotNull() {
            addCriterion("NIANCHUQITAYUE7 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue7EqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE7 =", value, "nianchuqitayue7");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue7NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE7 <>", value, "nianchuqitayue7");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue7GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE7 >", value, "nianchuqitayue7");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue7GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE7 >=", value, "nianchuqitayue7");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue7LessThan(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE7 <", value, "nianchuqitayue7");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue7LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE7 <=", value, "nianchuqitayue7");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue7In(List<BigDecimal> values) {
            addCriterion("NIANCHUQITAYUE7 in", values, "nianchuqitayue7");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue7NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUQITAYUE7 not in", values, "nianchuqitayue7");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue7Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUQITAYUE7 between", value1, value2, "nianchuqitayue7");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue7NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUQITAYUE7 not between", value1, value2, "nianchuqitayue7");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili7IsNull() {
            addCriterion("NIANCHUQITABILI7 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili7IsNotNull() {
            addCriterion("NIANCHUQITABILI7 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili7EqualTo(String value) {
            addCriterion("NIANCHUQITABILI7 =", value, "nianchuqitabili7");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili7NotEqualTo(String value) {
            addCriterion("NIANCHUQITABILI7 <>", value, "nianchuqitabili7");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili7GreaterThan(String value) {
            addCriterion("NIANCHUQITABILI7 >", value, "nianchuqitabili7");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili7GreaterThanOrEqualTo(String value) {
            addCriterion("NIANCHUQITABILI7 >=", value, "nianchuqitabili7");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili7LessThan(String value) {
            addCriterion("NIANCHUQITABILI7 <", value, "nianchuqitabili7");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili7LessThanOrEqualTo(String value) {
            addCriterion("NIANCHUQITABILI7 <=", value, "nianchuqitabili7");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili7Like(String value) {
            addCriterion("NIANCHUQITABILI7 like", value, "nianchuqitabili7");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili7NotLike(String value) {
            addCriterion("NIANCHUQITABILI7 not like", value, "nianchuqitabili7");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili7In(List<String> values) {
            addCriterion("NIANCHUQITABILI7 in", values, "nianchuqitabili7");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili7NotIn(List<String> values) {
            addCriterion("NIANCHUQITABILI7 not in", values, "nianchuqitabili7");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili7Between(String value1, String value2) {
            addCriterion("NIANCHUQITABILI7 between", value1, value2, "nianchuqitabili7");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili7NotBetween(String value1, String value2) {
            addCriterion("NIANCHUQITABILI7 not between", value1, value2, "nianchuqitabili7");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue7IsNull() {
            addCriterion("NIANMOQITAYUE7 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue7IsNotNull() {
            addCriterion("NIANMOQITAYUE7 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue7EqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE7 =", value, "nianmoqitayue7");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue7NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE7 <>", value, "nianmoqitayue7");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue7GreaterThan(BigDecimal value) {
            addCriterion("NIANMOQITAYUE7 >", value, "nianmoqitayue7");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue7GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE7 >=", value, "nianmoqitayue7");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue7LessThan(BigDecimal value) {
            addCriterion("NIANMOQITAYUE7 <", value, "nianmoqitayue7");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue7LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE7 <=", value, "nianmoqitayue7");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue7In(List<BigDecimal> values) {
            addCriterion("NIANMOQITAYUE7 in", values, "nianmoqitayue7");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue7NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOQITAYUE7 not in", values, "nianmoqitayue7");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue7Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOQITAYUE7 between", value1, value2, "nianmoqitayue7");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue7NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOQITAYUE7 not between", value1, value2, "nianmoqitayue7");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili7IsNull() {
            addCriterion("NIANMOQITABILI7 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili7IsNotNull() {
            addCriterion("NIANMOQITABILI7 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili7EqualTo(String value) {
            addCriterion("NIANMOQITABILI7 =", value, "nianmoqitabili7");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili7NotEqualTo(String value) {
            addCriterion("NIANMOQITABILI7 <>", value, "nianmoqitabili7");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili7GreaterThan(String value) {
            addCriterion("NIANMOQITABILI7 >", value, "nianmoqitabili7");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili7GreaterThanOrEqualTo(String value) {
            addCriterion("NIANMOQITABILI7 >=", value, "nianmoqitabili7");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili7LessThan(String value) {
            addCriterion("NIANMOQITABILI7 <", value, "nianmoqitabili7");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili7LessThanOrEqualTo(String value) {
            addCriterion("NIANMOQITABILI7 <=", value, "nianmoqitabili7");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili7Like(String value) {
            addCriterion("NIANMOQITABILI7 like", value, "nianmoqitabili7");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili7NotLike(String value) {
            addCriterion("NIANMOQITABILI7 not like", value, "nianmoqitabili7");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili7In(List<String> values) {
            addCriterion("NIANMOQITABILI7 in", values, "nianmoqitabili7");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili7NotIn(List<String> values) {
            addCriterion("NIANMOQITABILI7 not in", values, "nianmoqitabili7");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili7Between(String value1, String value2) {
            addCriterion("NIANMOQITABILI7 between", value1, value2, "nianmoqitabili7");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili7NotBetween(String value1, String value2) {
            addCriterion("NIANMOQITABILI7 not between", value1, value2, "nianmoqitabili7");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue8IsNull() {
            addCriterion("NIANCHUQITAYUE8 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue8IsNotNull() {
            addCriterion("NIANCHUQITAYUE8 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue8EqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE8 =", value, "nianchuqitayue8");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue8NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE8 <>", value, "nianchuqitayue8");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue8GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE8 >", value, "nianchuqitayue8");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue8GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE8 >=", value, "nianchuqitayue8");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue8LessThan(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE8 <", value, "nianchuqitayue8");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue8LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUQITAYUE8 <=", value, "nianchuqitayue8");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue8In(List<BigDecimal> values) {
            addCriterion("NIANCHUQITAYUE8 in", values, "nianchuqitayue8");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue8NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUQITAYUE8 not in", values, "nianchuqitayue8");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue8Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUQITAYUE8 between", value1, value2, "nianchuqitayue8");
            return (Criteria) this;
        }

        public Criteria andNianchuqitayue8NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUQITAYUE8 not between", value1, value2, "nianchuqitayue8");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili8IsNull() {
            addCriterion("NIANCHUQITABILI8 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili8IsNotNull() {
            addCriterion("NIANCHUQITABILI8 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili8EqualTo(String value) {
            addCriterion("NIANCHUQITABILI8 =", value, "nianchuqitabili8");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili8NotEqualTo(String value) {
            addCriterion("NIANCHUQITABILI8 <>", value, "nianchuqitabili8");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili8GreaterThan(String value) {
            addCriterion("NIANCHUQITABILI8 >", value, "nianchuqitabili8");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili8GreaterThanOrEqualTo(String value) {
            addCriterion("NIANCHUQITABILI8 >=", value, "nianchuqitabili8");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili8LessThan(String value) {
            addCriterion("NIANCHUQITABILI8 <", value, "nianchuqitabili8");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili8LessThanOrEqualTo(String value) {
            addCriterion("NIANCHUQITABILI8 <=", value, "nianchuqitabili8");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili8Like(String value) {
            addCriterion("NIANCHUQITABILI8 like", value, "nianchuqitabili8");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili8NotLike(String value) {
            addCriterion("NIANCHUQITABILI8 not like", value, "nianchuqitabili8");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili8In(List<String> values) {
            addCriterion("NIANCHUQITABILI8 in", values, "nianchuqitabili8");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili8NotIn(List<String> values) {
            addCriterion("NIANCHUQITABILI8 not in", values, "nianchuqitabili8");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili8Between(String value1, String value2) {
            addCriterion("NIANCHUQITABILI8 between", value1, value2, "nianchuqitabili8");
            return (Criteria) this;
        }

        public Criteria andNianchuqitabili8NotBetween(String value1, String value2) {
            addCriterion("NIANCHUQITABILI8 not between", value1, value2, "nianchuqitabili8");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue8IsNull() {
            addCriterion("NIANMOQITAYUE8 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue8IsNotNull() {
            addCriterion("NIANMOQITAYUE8 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue8EqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE8 =", value, "nianmoqitayue8");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue8NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE8 <>", value, "nianmoqitayue8");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue8GreaterThan(BigDecimal value) {
            addCriterion("NIANMOQITAYUE8 >", value, "nianmoqitayue8");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue8GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE8 >=", value, "nianmoqitayue8");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue8LessThan(BigDecimal value) {
            addCriterion("NIANMOQITAYUE8 <", value, "nianmoqitayue8");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue8LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOQITAYUE8 <=", value, "nianmoqitayue8");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue8In(List<BigDecimal> values) {
            addCriterion("NIANMOQITAYUE8 in", values, "nianmoqitayue8");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue8NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOQITAYUE8 not in", values, "nianmoqitayue8");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue8Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOQITAYUE8 between", value1, value2, "nianmoqitayue8");
            return (Criteria) this;
        }

        public Criteria andNianmoqitayue8NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOQITAYUE8 not between", value1, value2, "nianmoqitayue8");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili8IsNull() {
            addCriterion("NIANMOQITABILI8 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili8IsNotNull() {
            addCriterion("NIANMOQITABILI8 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili8EqualTo(String value) {
            addCriterion("NIANMOQITABILI8 =", value, "nianmoqitabili8");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili8NotEqualTo(String value) {
            addCriterion("NIANMOQITABILI8 <>", value, "nianmoqitabili8");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili8GreaterThan(String value) {
            addCriterion("NIANMOQITABILI8 >", value, "nianmoqitabili8");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili8GreaterThanOrEqualTo(String value) {
            addCriterion("NIANMOQITABILI8 >=", value, "nianmoqitabili8");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili8LessThan(String value) {
            addCriterion("NIANMOQITABILI8 <", value, "nianmoqitabili8");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili8LessThanOrEqualTo(String value) {
            addCriterion("NIANMOQITABILI8 <=", value, "nianmoqitabili8");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili8Like(String value) {
            addCriterion("NIANMOQITABILI8 like", value, "nianmoqitabili8");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili8NotLike(String value) {
            addCriterion("NIANMOQITABILI8 not like", value, "nianmoqitabili8");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili8In(List<String> values) {
            addCriterion("NIANMOQITABILI8 in", values, "nianmoqitabili8");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili8NotIn(List<String> values) {
            addCriterion("NIANMOQITABILI8 not in", values, "nianmoqitabili8");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili8Between(String value1, String value2) {
            addCriterion("NIANMOQITABILI8 between", value1, value2, "nianmoqitabili8");
            return (Criteria) this;
        }

        public Criteria andNianmoqitabili8NotBetween(String value1, String value2) {
            addCriterion("NIANMOQITABILI8 not between", value1, value2, "nianmoqitabili8");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyue2IsNull() {
            addCriterion("NIANCHUHEJIYUE2 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyue2IsNotNull() {
            addCriterion("NIANCHUHEJIYUE2 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyue2EqualTo(BigDecimal value) {
            addCriterion("NIANCHUHEJIYUE2 =", value, "nianchuhejiyue2");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyue2NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUHEJIYUE2 <>", value, "nianchuhejiyue2");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyue2GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUHEJIYUE2 >", value, "nianchuhejiyue2");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyue2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUHEJIYUE2 >=", value, "nianchuhejiyue2");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyue2LessThan(BigDecimal value) {
            addCriterion("NIANCHUHEJIYUE2 <", value, "nianchuhejiyue2");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyue2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUHEJIYUE2 <=", value, "nianchuhejiyue2");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyue2In(List<BigDecimal> values) {
            addCriterion("NIANCHUHEJIYUE2 in", values, "nianchuhejiyue2");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyue2NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUHEJIYUE2 not in", values, "nianchuhejiyue2");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyue2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUHEJIYUE2 between", value1, value2, "nianchuhejiyue2");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyue2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUHEJIYUE2 not between", value1, value2, "nianchuhejiyue2");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibili2IsNull() {
            addCriterion("NIANCHUHEJIBILI2 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibili2IsNotNull() {
            addCriterion("NIANCHUHEJIBILI2 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibili2EqualTo(String value) {
            addCriterion("NIANCHUHEJIBILI2 =", value, "nianchuhejibili2");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibili2NotEqualTo(String value) {
            addCriterion("NIANCHUHEJIBILI2 <>", value, "nianchuhejibili2");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibili2GreaterThan(String value) {
            addCriterion("NIANCHUHEJIBILI2 >", value, "nianchuhejibili2");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibili2GreaterThanOrEqualTo(String value) {
            addCriterion("NIANCHUHEJIBILI2 >=", value, "nianchuhejibili2");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibili2LessThan(String value) {
            addCriterion("NIANCHUHEJIBILI2 <", value, "nianchuhejibili2");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibili2LessThanOrEqualTo(String value) {
            addCriterion("NIANCHUHEJIBILI2 <=", value, "nianchuhejibili2");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibili2Like(String value) {
            addCriterion("NIANCHUHEJIBILI2 like", value, "nianchuhejibili2");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibili2NotLike(String value) {
            addCriterion("NIANCHUHEJIBILI2 not like", value, "nianchuhejibili2");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibili2In(List<String> values) {
            addCriterion("NIANCHUHEJIBILI2 in", values, "nianchuhejibili2");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibili2NotIn(List<String> values) {
            addCriterion("NIANCHUHEJIBILI2 not in", values, "nianchuhejibili2");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibili2Between(String value1, String value2) {
            addCriterion("NIANCHUHEJIBILI2 between", value1, value2, "nianchuhejibili2");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibili2NotBetween(String value1, String value2) {
            addCriterion("NIANCHUHEJIBILI2 not between", value1, value2, "nianchuhejibili2");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyue2IsNull() {
            addCriterion("NIANMOHEJIYUE2 is null");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyue2IsNotNull() {
            addCriterion("NIANMOHEJIYUE2 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyue2EqualTo(BigDecimal value) {
            addCriterion("NIANMOHEJIYUE2 =", value, "nianmohejiyue2");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyue2NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOHEJIYUE2 <>", value, "nianmohejiyue2");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyue2GreaterThan(BigDecimal value) {
            addCriterion("NIANMOHEJIYUE2 >", value, "nianmohejiyue2");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyue2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOHEJIYUE2 >=", value, "nianmohejiyue2");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyue2LessThan(BigDecimal value) {
            addCriterion("NIANMOHEJIYUE2 <", value, "nianmohejiyue2");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyue2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOHEJIYUE2 <=", value, "nianmohejiyue2");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyue2In(List<BigDecimal> values) {
            addCriterion("NIANMOHEJIYUE2 in", values, "nianmohejiyue2");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyue2NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOHEJIYUE2 not in", values, "nianmohejiyue2");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyue2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOHEJIYUE2 between", value1, value2, "nianmohejiyue2");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyue2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOHEJIYUE2 not between", value1, value2, "nianmohejiyue2");
            return (Criteria) this;
        }

        public Criteria andNianmohejibili2IsNull() {
            addCriterion("NIANMOHEJIBILI2 is null");
            return (Criteria) this;
        }

        public Criteria andNianmohejibili2IsNotNull() {
            addCriterion("NIANMOHEJIBILI2 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmohejibili2EqualTo(String value) {
            addCriterion("NIANMOHEJIBILI2 =", value, "nianmohejibili2");
            return (Criteria) this;
        }

        public Criteria andNianmohejibili2NotEqualTo(String value) {
            addCriterion("NIANMOHEJIBILI2 <>", value, "nianmohejibili2");
            return (Criteria) this;
        }

        public Criteria andNianmohejibili2GreaterThan(String value) {
            addCriterion("NIANMOHEJIBILI2 >", value, "nianmohejibili2");
            return (Criteria) this;
        }

        public Criteria andNianmohejibili2GreaterThanOrEqualTo(String value) {
            addCriterion("NIANMOHEJIBILI2 >=", value, "nianmohejibili2");
            return (Criteria) this;
        }

        public Criteria andNianmohejibili2LessThan(String value) {
            addCriterion("NIANMOHEJIBILI2 <", value, "nianmohejibili2");
            return (Criteria) this;
        }

        public Criteria andNianmohejibili2LessThanOrEqualTo(String value) {
            addCriterion("NIANMOHEJIBILI2 <=", value, "nianmohejibili2");
            return (Criteria) this;
        }

        public Criteria andNianmohejibili2Like(String value) {
            addCriterion("NIANMOHEJIBILI2 like", value, "nianmohejibili2");
            return (Criteria) this;
        }

        public Criteria andNianmohejibili2NotLike(String value) {
            addCriterion("NIANMOHEJIBILI2 not like", value, "nianmohejibili2");
            return (Criteria) this;
        }

        public Criteria andNianmohejibili2In(List<String> values) {
            addCriterion("NIANMOHEJIBILI2 in", values, "nianmohejibili2");
            return (Criteria) this;
        }

        public Criteria andNianmohejibili2NotIn(List<String> values) {
            addCriterion("NIANMOHEJIBILI2 not in", values, "nianmohejibili2");
            return (Criteria) this;
        }

        public Criteria andNianmohejibili2Between(String value1, String value2) {
            addCriterion("NIANMOHEJIBILI2 between", value1, value2, "nianmohejibili2");
            return (Criteria) this;
        }

        public Criteria andNianmohejibili2NotBetween(String value1, String value2) {
            addCriterion("NIANMOHEJIBILI2 not between", value1, value2, "nianmohejibili2");
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