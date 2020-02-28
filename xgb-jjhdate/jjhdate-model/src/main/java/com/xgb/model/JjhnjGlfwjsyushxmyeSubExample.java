package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JjhnjGlfwjsyushxmyeSubExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JjhnjGlfwjsyushxmyeSubExample() {
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

        public Criteria andNianchuyue9IsNull() {
            addCriterion("NIANCHUYUE9 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuyue9IsNotNull() {
            addCriterion("NIANCHUYUE9 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuyue9EqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE9 =", value, "nianchuyue9");
            return (Criteria) this;
        }

        public Criteria andNianchuyue9NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE9 <>", value, "nianchuyue9");
            return (Criteria) this;
        }

        public Criteria andNianchuyue9GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUYUE9 >", value, "nianchuyue9");
            return (Criteria) this;
        }

        public Criteria andNianchuyue9GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE9 >=", value, "nianchuyue9");
            return (Criteria) this;
        }

        public Criteria andNianchuyue9LessThan(BigDecimal value) {
            addCriterion("NIANCHUYUE9 <", value, "nianchuyue9");
            return (Criteria) this;
        }

        public Criteria andNianchuyue9LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE9 <=", value, "nianchuyue9");
            return (Criteria) this;
        }

        public Criteria andNianchuyue9In(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE9 in", values, "nianchuyue9");
            return (Criteria) this;
        }

        public Criteria andNianchuyue9NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE9 not in", values, "nianchuyue9");
            return (Criteria) this;
        }

        public Criteria andNianchuyue9Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE9 between", value1, value2, "nianchuyue9");
            return (Criteria) this;
        }

        public Criteria andNianchuyue9NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE9 not between", value1, value2, "nianchuyue9");
            return (Criteria) this;
        }

        public Criteria andNianchubili9IsNull() {
            addCriterion("NIANCHUBILI9 is null");
            return (Criteria) this;
        }

        public Criteria andNianchubili9IsNotNull() {
            addCriterion("NIANCHUBILI9 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchubili9EqualTo(String value) {
            addCriterion("NIANCHUBILI9 =", value, "nianchubili9");
            return (Criteria) this;
        }

        public Criteria andNianchubili9NotEqualTo(String value) {
            addCriterion("NIANCHUBILI9 <>", value, "nianchubili9");
            return (Criteria) this;
        }

        public Criteria andNianchubili9GreaterThan(String value) {
            addCriterion("NIANCHUBILI9 >", value, "nianchubili9");
            return (Criteria) this;
        }

        public Criteria andNianchubili9GreaterThanOrEqualTo(String value) {
            addCriterion("NIANCHUBILI9 >=", value, "nianchubili9");
            return (Criteria) this;
        }

        public Criteria andNianchubili9LessThan(String value) {
            addCriterion("NIANCHUBILI9 <", value, "nianchubili9");
            return (Criteria) this;
        }

        public Criteria andNianchubili9LessThanOrEqualTo(String value) {
            addCriterion("NIANCHUBILI9 <=", value, "nianchubili9");
            return (Criteria) this;
        }

        public Criteria andNianchubili9Like(String value) {
            addCriterion("NIANCHUBILI9 like", value, "nianchubili9");
            return (Criteria) this;
        }

        public Criteria andNianchubili9NotLike(String value) {
            addCriterion("NIANCHUBILI9 not like", value, "nianchubili9");
            return (Criteria) this;
        }

        public Criteria andNianchubili9In(List<String> values) {
            addCriterion("NIANCHUBILI9 in", values, "nianchubili9");
            return (Criteria) this;
        }

        public Criteria andNianchubili9NotIn(List<String> values) {
            addCriterion("NIANCHUBILI9 not in", values, "nianchubili9");
            return (Criteria) this;
        }

        public Criteria andNianchubili9Between(String value1, String value2) {
            addCriterion("NIANCHUBILI9 between", value1, value2, "nianchubili9");
            return (Criteria) this;
        }

        public Criteria andNianchubili9NotBetween(String value1, String value2) {
            addCriterion("NIANCHUBILI9 not between", value1, value2, "nianchubili9");
            return (Criteria) this;
        }

        public Criteria andNianmoyue9IsNull() {
            addCriterion("NIANMOYUE9 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoyue9IsNotNull() {
            addCriterion("NIANMOYUE9 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoyue9EqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE9 =", value, "nianmoyue9");
            return (Criteria) this;
        }

        public Criteria andNianmoyue9NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE9 <>", value, "nianmoyue9");
            return (Criteria) this;
        }

        public Criteria andNianmoyue9GreaterThan(BigDecimal value) {
            addCriterion("NIANMOYUE9 >", value, "nianmoyue9");
            return (Criteria) this;
        }

        public Criteria andNianmoyue9GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE9 >=", value, "nianmoyue9");
            return (Criteria) this;
        }

        public Criteria andNianmoyue9LessThan(BigDecimal value) {
            addCriterion("NIANMOYUE9 <", value, "nianmoyue9");
            return (Criteria) this;
        }

        public Criteria andNianmoyue9LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE9 <=", value, "nianmoyue9");
            return (Criteria) this;
        }

        public Criteria andNianmoyue9In(List<BigDecimal> values) {
            addCriterion("NIANMOYUE9 in", values, "nianmoyue9");
            return (Criteria) this;
        }

        public Criteria andNianmoyue9NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOYUE9 not in", values, "nianmoyue9");
            return (Criteria) this;
        }

        public Criteria andNianmoyue9Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE9 between", value1, value2, "nianmoyue9");
            return (Criteria) this;
        }

        public Criteria andNianmoyue9NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE9 not between", value1, value2, "nianmoyue9");
            return (Criteria) this;
        }

        public Criteria andNianmobili9IsNull() {
            addCriterion("NIANMOBILI9 is null");
            return (Criteria) this;
        }

        public Criteria andNianmobili9IsNotNull() {
            addCriterion("NIANMOBILI9 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmobili9EqualTo(String value) {
            addCriterion("NIANMOBILI9 =", value, "nianmobili9");
            return (Criteria) this;
        }

        public Criteria andNianmobili9NotEqualTo(String value) {
            addCriterion("NIANMOBILI9 <>", value, "nianmobili9");
            return (Criteria) this;
        }

        public Criteria andNianmobili9GreaterThan(String value) {
            addCriterion("NIANMOBILI9 >", value, "nianmobili9");
            return (Criteria) this;
        }

        public Criteria andNianmobili9GreaterThanOrEqualTo(String value) {
            addCriterion("NIANMOBILI9 >=", value, "nianmobili9");
            return (Criteria) this;
        }

        public Criteria andNianmobili9LessThan(String value) {
            addCriterion("NIANMOBILI9 <", value, "nianmobili9");
            return (Criteria) this;
        }

        public Criteria andNianmobili9LessThanOrEqualTo(String value) {
            addCriterion("NIANMOBILI9 <=", value, "nianmobili9");
            return (Criteria) this;
        }

        public Criteria andNianmobili9Like(String value) {
            addCriterion("NIANMOBILI9 like", value, "nianmobili9");
            return (Criteria) this;
        }

        public Criteria andNianmobili9NotLike(String value) {
            addCriterion("NIANMOBILI9 not like", value, "nianmobili9");
            return (Criteria) this;
        }

        public Criteria andNianmobili9In(List<String> values) {
            addCriterion("NIANMOBILI9 in", values, "nianmobili9");
            return (Criteria) this;
        }

        public Criteria andNianmobili9NotIn(List<String> values) {
            addCriterion("NIANMOBILI9 not in", values, "nianmobili9");
            return (Criteria) this;
        }

        public Criteria andNianmobili9Between(String value1, String value2) {
            addCriterion("NIANMOBILI9 between", value1, value2, "nianmobili9");
            return (Criteria) this;
        }

        public Criteria andNianmobili9NotBetween(String value1, String value2) {
            addCriterion("NIANMOBILI9 not between", value1, value2, "nianmobili9");
            return (Criteria) this;
        }

        public Criteria andNianchuyue10IsNull() {
            addCriterion("NIANCHUYUE10 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuyue10IsNotNull() {
            addCriterion("NIANCHUYUE10 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuyue10EqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE10 =", value, "nianchuyue10");
            return (Criteria) this;
        }

        public Criteria andNianchuyue10NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE10 <>", value, "nianchuyue10");
            return (Criteria) this;
        }

        public Criteria andNianchuyue10GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUYUE10 >", value, "nianchuyue10");
            return (Criteria) this;
        }

        public Criteria andNianchuyue10GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE10 >=", value, "nianchuyue10");
            return (Criteria) this;
        }

        public Criteria andNianchuyue10LessThan(BigDecimal value) {
            addCriterion("NIANCHUYUE10 <", value, "nianchuyue10");
            return (Criteria) this;
        }

        public Criteria andNianchuyue10LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE10 <=", value, "nianchuyue10");
            return (Criteria) this;
        }

        public Criteria andNianchuyue10In(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE10 in", values, "nianchuyue10");
            return (Criteria) this;
        }

        public Criteria andNianchuyue10NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE10 not in", values, "nianchuyue10");
            return (Criteria) this;
        }

        public Criteria andNianchuyue10Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE10 between", value1, value2, "nianchuyue10");
            return (Criteria) this;
        }

        public Criteria andNianchuyue10NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE10 not between", value1, value2, "nianchuyue10");
            return (Criteria) this;
        }

        public Criteria andNianchubili10IsNull() {
            addCriterion("NIANCHUBILI10 is null");
            return (Criteria) this;
        }

        public Criteria andNianchubili10IsNotNull() {
            addCriterion("NIANCHUBILI10 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchubili10EqualTo(String value) {
            addCriterion("NIANCHUBILI10 =", value, "nianchubili10");
            return (Criteria) this;
        }

        public Criteria andNianchubili10NotEqualTo(String value) {
            addCriterion("NIANCHUBILI10 <>", value, "nianchubili10");
            return (Criteria) this;
        }

        public Criteria andNianchubili10GreaterThan(String value) {
            addCriterion("NIANCHUBILI10 >", value, "nianchubili10");
            return (Criteria) this;
        }

        public Criteria andNianchubili10GreaterThanOrEqualTo(String value) {
            addCriterion("NIANCHUBILI10 >=", value, "nianchubili10");
            return (Criteria) this;
        }

        public Criteria andNianchubili10LessThan(String value) {
            addCriterion("NIANCHUBILI10 <", value, "nianchubili10");
            return (Criteria) this;
        }

        public Criteria andNianchubili10LessThanOrEqualTo(String value) {
            addCriterion("NIANCHUBILI10 <=", value, "nianchubili10");
            return (Criteria) this;
        }

        public Criteria andNianchubili10Like(String value) {
            addCriterion("NIANCHUBILI10 like", value, "nianchubili10");
            return (Criteria) this;
        }

        public Criteria andNianchubili10NotLike(String value) {
            addCriterion("NIANCHUBILI10 not like", value, "nianchubili10");
            return (Criteria) this;
        }

        public Criteria andNianchubili10In(List<String> values) {
            addCriterion("NIANCHUBILI10 in", values, "nianchubili10");
            return (Criteria) this;
        }

        public Criteria andNianchubili10NotIn(List<String> values) {
            addCriterion("NIANCHUBILI10 not in", values, "nianchubili10");
            return (Criteria) this;
        }

        public Criteria andNianchubili10Between(String value1, String value2) {
            addCriterion("NIANCHUBILI10 between", value1, value2, "nianchubili10");
            return (Criteria) this;
        }

        public Criteria andNianchubili10NotBetween(String value1, String value2) {
            addCriterion("NIANCHUBILI10 not between", value1, value2, "nianchubili10");
            return (Criteria) this;
        }

        public Criteria andNianmoyue10IsNull() {
            addCriterion("NIANMOYUE10 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoyue10IsNotNull() {
            addCriterion("NIANMOYUE10 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoyue10EqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE10 =", value, "nianmoyue10");
            return (Criteria) this;
        }

        public Criteria andNianmoyue10NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE10 <>", value, "nianmoyue10");
            return (Criteria) this;
        }

        public Criteria andNianmoyue10GreaterThan(BigDecimal value) {
            addCriterion("NIANMOYUE10 >", value, "nianmoyue10");
            return (Criteria) this;
        }

        public Criteria andNianmoyue10GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE10 >=", value, "nianmoyue10");
            return (Criteria) this;
        }

        public Criteria andNianmoyue10LessThan(BigDecimal value) {
            addCriterion("NIANMOYUE10 <", value, "nianmoyue10");
            return (Criteria) this;
        }

        public Criteria andNianmoyue10LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE10 <=", value, "nianmoyue10");
            return (Criteria) this;
        }

        public Criteria andNianmoyue10In(List<BigDecimal> values) {
            addCriterion("NIANMOYUE10 in", values, "nianmoyue10");
            return (Criteria) this;
        }

        public Criteria andNianmoyue10NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOYUE10 not in", values, "nianmoyue10");
            return (Criteria) this;
        }

        public Criteria andNianmoyue10Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE10 between", value1, value2, "nianmoyue10");
            return (Criteria) this;
        }

        public Criteria andNianmoyue10NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE10 not between", value1, value2, "nianmoyue10");
            return (Criteria) this;
        }

        public Criteria andNianmobili10IsNull() {
            addCriterion("NIANMOBILI10 is null");
            return (Criteria) this;
        }

        public Criteria andNianmobili10IsNotNull() {
            addCriterion("NIANMOBILI10 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmobili10EqualTo(String value) {
            addCriterion("NIANMOBILI10 =", value, "nianmobili10");
            return (Criteria) this;
        }

        public Criteria andNianmobili10NotEqualTo(String value) {
            addCriterion("NIANMOBILI10 <>", value, "nianmobili10");
            return (Criteria) this;
        }

        public Criteria andNianmobili10GreaterThan(String value) {
            addCriterion("NIANMOBILI10 >", value, "nianmobili10");
            return (Criteria) this;
        }

        public Criteria andNianmobili10GreaterThanOrEqualTo(String value) {
            addCriterion("NIANMOBILI10 >=", value, "nianmobili10");
            return (Criteria) this;
        }

        public Criteria andNianmobili10LessThan(String value) {
            addCriterion("NIANMOBILI10 <", value, "nianmobili10");
            return (Criteria) this;
        }

        public Criteria andNianmobili10LessThanOrEqualTo(String value) {
            addCriterion("NIANMOBILI10 <=", value, "nianmobili10");
            return (Criteria) this;
        }

        public Criteria andNianmobili10Like(String value) {
            addCriterion("NIANMOBILI10 like", value, "nianmobili10");
            return (Criteria) this;
        }

        public Criteria andNianmobili10NotLike(String value) {
            addCriterion("NIANMOBILI10 not like", value, "nianmobili10");
            return (Criteria) this;
        }

        public Criteria andNianmobili10In(List<String> values) {
            addCriterion("NIANMOBILI10 in", values, "nianmobili10");
            return (Criteria) this;
        }

        public Criteria andNianmobili10NotIn(List<String> values) {
            addCriterion("NIANMOBILI10 not in", values, "nianmobili10");
            return (Criteria) this;
        }

        public Criteria andNianmobili10Between(String value1, String value2) {
            addCriterion("NIANMOBILI10 between", value1, value2, "nianmobili10");
            return (Criteria) this;
        }

        public Criteria andNianmobili10NotBetween(String value1, String value2) {
            addCriterion("NIANMOBILI10 not between", value1, value2, "nianmobili10");
            return (Criteria) this;
        }

        public Criteria andNianchuyue11IsNull() {
            addCriterion("NIANCHUYUE11 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuyue11IsNotNull() {
            addCriterion("NIANCHUYUE11 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuyue11EqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE11 =", value, "nianchuyue11");
            return (Criteria) this;
        }

        public Criteria andNianchuyue11NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE11 <>", value, "nianchuyue11");
            return (Criteria) this;
        }

        public Criteria andNianchuyue11GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUYUE11 >", value, "nianchuyue11");
            return (Criteria) this;
        }

        public Criteria andNianchuyue11GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE11 >=", value, "nianchuyue11");
            return (Criteria) this;
        }

        public Criteria andNianchuyue11LessThan(BigDecimal value) {
            addCriterion("NIANCHUYUE11 <", value, "nianchuyue11");
            return (Criteria) this;
        }

        public Criteria andNianchuyue11LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE11 <=", value, "nianchuyue11");
            return (Criteria) this;
        }

        public Criteria andNianchuyue11In(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE11 in", values, "nianchuyue11");
            return (Criteria) this;
        }

        public Criteria andNianchuyue11NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE11 not in", values, "nianchuyue11");
            return (Criteria) this;
        }

        public Criteria andNianchuyue11Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE11 between", value1, value2, "nianchuyue11");
            return (Criteria) this;
        }

        public Criteria andNianchuyue11NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE11 not between", value1, value2, "nianchuyue11");
            return (Criteria) this;
        }

        public Criteria andNianchubili11IsNull() {
            addCriterion("NIANCHUBILI11 is null");
            return (Criteria) this;
        }

        public Criteria andNianchubili11IsNotNull() {
            addCriterion("NIANCHUBILI11 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchubili11EqualTo(String value) {
            addCriterion("NIANCHUBILI11 =", value, "nianchubili11");
            return (Criteria) this;
        }

        public Criteria andNianchubili11NotEqualTo(String value) {
            addCriterion("NIANCHUBILI11 <>", value, "nianchubili11");
            return (Criteria) this;
        }

        public Criteria andNianchubili11GreaterThan(String value) {
            addCriterion("NIANCHUBILI11 >", value, "nianchubili11");
            return (Criteria) this;
        }

        public Criteria andNianchubili11GreaterThanOrEqualTo(String value) {
            addCriterion("NIANCHUBILI11 >=", value, "nianchubili11");
            return (Criteria) this;
        }

        public Criteria andNianchubili11LessThan(String value) {
            addCriterion("NIANCHUBILI11 <", value, "nianchubili11");
            return (Criteria) this;
        }

        public Criteria andNianchubili11LessThanOrEqualTo(String value) {
            addCriterion("NIANCHUBILI11 <=", value, "nianchubili11");
            return (Criteria) this;
        }

        public Criteria andNianchubili11Like(String value) {
            addCriterion("NIANCHUBILI11 like", value, "nianchubili11");
            return (Criteria) this;
        }

        public Criteria andNianchubili11NotLike(String value) {
            addCriterion("NIANCHUBILI11 not like", value, "nianchubili11");
            return (Criteria) this;
        }

        public Criteria andNianchubili11In(List<String> values) {
            addCriterion("NIANCHUBILI11 in", values, "nianchubili11");
            return (Criteria) this;
        }

        public Criteria andNianchubili11NotIn(List<String> values) {
            addCriterion("NIANCHUBILI11 not in", values, "nianchubili11");
            return (Criteria) this;
        }

        public Criteria andNianchubili11Between(String value1, String value2) {
            addCriterion("NIANCHUBILI11 between", value1, value2, "nianchubili11");
            return (Criteria) this;
        }

        public Criteria andNianchubili11NotBetween(String value1, String value2) {
            addCriterion("NIANCHUBILI11 not between", value1, value2, "nianchubili11");
            return (Criteria) this;
        }

        public Criteria andNianmoyue11IsNull() {
            addCriterion("NIANMOYUE11 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoyue11IsNotNull() {
            addCriterion("NIANMOYUE11 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoyue11EqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE11 =", value, "nianmoyue11");
            return (Criteria) this;
        }

        public Criteria andNianmoyue11NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE11 <>", value, "nianmoyue11");
            return (Criteria) this;
        }

        public Criteria andNianmoyue11GreaterThan(BigDecimal value) {
            addCriterion("NIANMOYUE11 >", value, "nianmoyue11");
            return (Criteria) this;
        }

        public Criteria andNianmoyue11GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE11 >=", value, "nianmoyue11");
            return (Criteria) this;
        }

        public Criteria andNianmoyue11LessThan(BigDecimal value) {
            addCriterion("NIANMOYUE11 <", value, "nianmoyue11");
            return (Criteria) this;
        }

        public Criteria andNianmoyue11LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE11 <=", value, "nianmoyue11");
            return (Criteria) this;
        }

        public Criteria andNianmoyue11In(List<BigDecimal> values) {
            addCriterion("NIANMOYUE11 in", values, "nianmoyue11");
            return (Criteria) this;
        }

        public Criteria andNianmoyue11NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOYUE11 not in", values, "nianmoyue11");
            return (Criteria) this;
        }

        public Criteria andNianmoyue11Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE11 between", value1, value2, "nianmoyue11");
            return (Criteria) this;
        }

        public Criteria andNianmoyue11NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE11 not between", value1, value2, "nianmoyue11");
            return (Criteria) this;
        }

        public Criteria andNianmobili11IsNull() {
            addCriterion("NIANMOBILI11 is null");
            return (Criteria) this;
        }

        public Criteria andNianmobili11IsNotNull() {
            addCriterion("NIANMOBILI11 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmobili11EqualTo(String value) {
            addCriterion("NIANMOBILI11 =", value, "nianmobili11");
            return (Criteria) this;
        }

        public Criteria andNianmobili11NotEqualTo(String value) {
            addCriterion("NIANMOBILI11 <>", value, "nianmobili11");
            return (Criteria) this;
        }

        public Criteria andNianmobili11GreaterThan(String value) {
            addCriterion("NIANMOBILI11 >", value, "nianmobili11");
            return (Criteria) this;
        }

        public Criteria andNianmobili11GreaterThanOrEqualTo(String value) {
            addCriterion("NIANMOBILI11 >=", value, "nianmobili11");
            return (Criteria) this;
        }

        public Criteria andNianmobili11LessThan(String value) {
            addCriterion("NIANMOBILI11 <", value, "nianmobili11");
            return (Criteria) this;
        }

        public Criteria andNianmobili11LessThanOrEqualTo(String value) {
            addCriterion("NIANMOBILI11 <=", value, "nianmobili11");
            return (Criteria) this;
        }

        public Criteria andNianmobili11Like(String value) {
            addCriterion("NIANMOBILI11 like", value, "nianmobili11");
            return (Criteria) this;
        }

        public Criteria andNianmobili11NotLike(String value) {
            addCriterion("NIANMOBILI11 not like", value, "nianmobili11");
            return (Criteria) this;
        }

        public Criteria andNianmobili11In(List<String> values) {
            addCriterion("NIANMOBILI11 in", values, "nianmobili11");
            return (Criteria) this;
        }

        public Criteria andNianmobili11NotIn(List<String> values) {
            addCriterion("NIANMOBILI11 not in", values, "nianmobili11");
            return (Criteria) this;
        }

        public Criteria andNianmobili11Between(String value1, String value2) {
            addCriterion("NIANMOBILI11 between", value1, value2, "nianmobili11");
            return (Criteria) this;
        }

        public Criteria andNianmobili11NotBetween(String value1, String value2) {
            addCriterion("NIANMOBILI11 not between", value1, value2, "nianmobili11");
            return (Criteria) this;
        }

        public Criteria andNianchuyue12IsNull() {
            addCriterion("NIANCHUYUE12 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuyue12IsNotNull() {
            addCriterion("NIANCHUYUE12 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuyue12EqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE12 =", value, "nianchuyue12");
            return (Criteria) this;
        }

        public Criteria andNianchuyue12NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE12 <>", value, "nianchuyue12");
            return (Criteria) this;
        }

        public Criteria andNianchuyue12GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUYUE12 >", value, "nianchuyue12");
            return (Criteria) this;
        }

        public Criteria andNianchuyue12GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE12 >=", value, "nianchuyue12");
            return (Criteria) this;
        }

        public Criteria andNianchuyue12LessThan(BigDecimal value) {
            addCriterion("NIANCHUYUE12 <", value, "nianchuyue12");
            return (Criteria) this;
        }

        public Criteria andNianchuyue12LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE12 <=", value, "nianchuyue12");
            return (Criteria) this;
        }

        public Criteria andNianchuyue12In(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE12 in", values, "nianchuyue12");
            return (Criteria) this;
        }

        public Criteria andNianchuyue12NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE12 not in", values, "nianchuyue12");
            return (Criteria) this;
        }

        public Criteria andNianchuyue12Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE12 between", value1, value2, "nianchuyue12");
            return (Criteria) this;
        }

        public Criteria andNianchuyue12NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE12 not between", value1, value2, "nianchuyue12");
            return (Criteria) this;
        }

        public Criteria andNianchubili12IsNull() {
            addCriterion("NIANCHUBILI12 is null");
            return (Criteria) this;
        }

        public Criteria andNianchubili12IsNotNull() {
            addCriterion("NIANCHUBILI12 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchubili12EqualTo(String value) {
            addCriterion("NIANCHUBILI12 =", value, "nianchubili12");
            return (Criteria) this;
        }

        public Criteria andNianchubili12NotEqualTo(String value) {
            addCriterion("NIANCHUBILI12 <>", value, "nianchubili12");
            return (Criteria) this;
        }

        public Criteria andNianchubili12GreaterThan(String value) {
            addCriterion("NIANCHUBILI12 >", value, "nianchubili12");
            return (Criteria) this;
        }

        public Criteria andNianchubili12GreaterThanOrEqualTo(String value) {
            addCriterion("NIANCHUBILI12 >=", value, "nianchubili12");
            return (Criteria) this;
        }

        public Criteria andNianchubili12LessThan(String value) {
            addCriterion("NIANCHUBILI12 <", value, "nianchubili12");
            return (Criteria) this;
        }

        public Criteria andNianchubili12LessThanOrEqualTo(String value) {
            addCriterion("NIANCHUBILI12 <=", value, "nianchubili12");
            return (Criteria) this;
        }

        public Criteria andNianchubili12Like(String value) {
            addCriterion("NIANCHUBILI12 like", value, "nianchubili12");
            return (Criteria) this;
        }

        public Criteria andNianchubili12NotLike(String value) {
            addCriterion("NIANCHUBILI12 not like", value, "nianchubili12");
            return (Criteria) this;
        }

        public Criteria andNianchubili12In(List<String> values) {
            addCriterion("NIANCHUBILI12 in", values, "nianchubili12");
            return (Criteria) this;
        }

        public Criteria andNianchubili12NotIn(List<String> values) {
            addCriterion("NIANCHUBILI12 not in", values, "nianchubili12");
            return (Criteria) this;
        }

        public Criteria andNianchubili12Between(String value1, String value2) {
            addCriterion("NIANCHUBILI12 between", value1, value2, "nianchubili12");
            return (Criteria) this;
        }

        public Criteria andNianchubili12NotBetween(String value1, String value2) {
            addCriterion("NIANCHUBILI12 not between", value1, value2, "nianchubili12");
            return (Criteria) this;
        }

        public Criteria andNianmoyue12IsNull() {
            addCriterion("NIANMOYUE12 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoyue12IsNotNull() {
            addCriterion("NIANMOYUE12 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoyue12EqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE12 =", value, "nianmoyue12");
            return (Criteria) this;
        }

        public Criteria andNianmoyue12NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE12 <>", value, "nianmoyue12");
            return (Criteria) this;
        }

        public Criteria andNianmoyue12GreaterThan(BigDecimal value) {
            addCriterion("NIANMOYUE12 >", value, "nianmoyue12");
            return (Criteria) this;
        }

        public Criteria andNianmoyue12GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE12 >=", value, "nianmoyue12");
            return (Criteria) this;
        }

        public Criteria andNianmoyue12LessThan(BigDecimal value) {
            addCriterion("NIANMOYUE12 <", value, "nianmoyue12");
            return (Criteria) this;
        }

        public Criteria andNianmoyue12LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE12 <=", value, "nianmoyue12");
            return (Criteria) this;
        }

        public Criteria andNianmoyue12In(List<BigDecimal> values) {
            addCriterion("NIANMOYUE12 in", values, "nianmoyue12");
            return (Criteria) this;
        }

        public Criteria andNianmoyue12NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOYUE12 not in", values, "nianmoyue12");
            return (Criteria) this;
        }

        public Criteria andNianmoyue12Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE12 between", value1, value2, "nianmoyue12");
            return (Criteria) this;
        }

        public Criteria andNianmoyue12NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE12 not between", value1, value2, "nianmoyue12");
            return (Criteria) this;
        }

        public Criteria andNianmobili12IsNull() {
            addCriterion("NIANMOBILI12 is null");
            return (Criteria) this;
        }

        public Criteria andNianmobili12IsNotNull() {
            addCriterion("NIANMOBILI12 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmobili12EqualTo(String value) {
            addCriterion("NIANMOBILI12 =", value, "nianmobili12");
            return (Criteria) this;
        }

        public Criteria andNianmobili12NotEqualTo(String value) {
            addCriterion("NIANMOBILI12 <>", value, "nianmobili12");
            return (Criteria) this;
        }

        public Criteria andNianmobili12GreaterThan(String value) {
            addCriterion("NIANMOBILI12 >", value, "nianmobili12");
            return (Criteria) this;
        }

        public Criteria andNianmobili12GreaterThanOrEqualTo(String value) {
            addCriterion("NIANMOBILI12 >=", value, "nianmobili12");
            return (Criteria) this;
        }

        public Criteria andNianmobili12LessThan(String value) {
            addCriterion("NIANMOBILI12 <", value, "nianmobili12");
            return (Criteria) this;
        }

        public Criteria andNianmobili12LessThanOrEqualTo(String value) {
            addCriterion("NIANMOBILI12 <=", value, "nianmobili12");
            return (Criteria) this;
        }

        public Criteria andNianmobili12Like(String value) {
            addCriterion("NIANMOBILI12 like", value, "nianmobili12");
            return (Criteria) this;
        }

        public Criteria andNianmobili12NotLike(String value) {
            addCriterion("NIANMOBILI12 not like", value, "nianmobili12");
            return (Criteria) this;
        }

        public Criteria andNianmobili12In(List<String> values) {
            addCriterion("NIANMOBILI12 in", values, "nianmobili12");
            return (Criteria) this;
        }

        public Criteria andNianmobili12NotIn(List<String> values) {
            addCriterion("NIANMOBILI12 not in", values, "nianmobili12");
            return (Criteria) this;
        }

        public Criteria andNianmobili12Between(String value1, String value2) {
            addCriterion("NIANMOBILI12 between", value1, value2, "nianmobili12");
            return (Criteria) this;
        }

        public Criteria andNianmobili12NotBetween(String value1, String value2) {
            addCriterion("NIANMOBILI12 not between", value1, value2, "nianmobili12");
            return (Criteria) this;
        }

        public Criteria andNianchuyue13IsNull() {
            addCriterion("NIANCHUYUE13 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuyue13IsNotNull() {
            addCriterion("NIANCHUYUE13 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuyue13EqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE13 =", value, "nianchuyue13");
            return (Criteria) this;
        }

        public Criteria andNianchuyue13NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE13 <>", value, "nianchuyue13");
            return (Criteria) this;
        }

        public Criteria andNianchuyue13GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUYUE13 >", value, "nianchuyue13");
            return (Criteria) this;
        }

        public Criteria andNianchuyue13GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE13 >=", value, "nianchuyue13");
            return (Criteria) this;
        }

        public Criteria andNianchuyue13LessThan(BigDecimal value) {
            addCriterion("NIANCHUYUE13 <", value, "nianchuyue13");
            return (Criteria) this;
        }

        public Criteria andNianchuyue13LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE13 <=", value, "nianchuyue13");
            return (Criteria) this;
        }

        public Criteria andNianchuyue13In(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE13 in", values, "nianchuyue13");
            return (Criteria) this;
        }

        public Criteria andNianchuyue13NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE13 not in", values, "nianchuyue13");
            return (Criteria) this;
        }

        public Criteria andNianchuyue13Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE13 between", value1, value2, "nianchuyue13");
            return (Criteria) this;
        }

        public Criteria andNianchuyue13NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE13 not between", value1, value2, "nianchuyue13");
            return (Criteria) this;
        }

        public Criteria andNianchubili13IsNull() {
            addCriterion("NIANCHUBILI13 is null");
            return (Criteria) this;
        }

        public Criteria andNianchubili13IsNotNull() {
            addCriterion("NIANCHUBILI13 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchubili13EqualTo(String value) {
            addCriterion("NIANCHUBILI13 =", value, "nianchubili13");
            return (Criteria) this;
        }

        public Criteria andNianchubili13NotEqualTo(String value) {
            addCriterion("NIANCHUBILI13 <>", value, "nianchubili13");
            return (Criteria) this;
        }

        public Criteria andNianchubili13GreaterThan(String value) {
            addCriterion("NIANCHUBILI13 >", value, "nianchubili13");
            return (Criteria) this;
        }

        public Criteria andNianchubili13GreaterThanOrEqualTo(String value) {
            addCriterion("NIANCHUBILI13 >=", value, "nianchubili13");
            return (Criteria) this;
        }

        public Criteria andNianchubili13LessThan(String value) {
            addCriterion("NIANCHUBILI13 <", value, "nianchubili13");
            return (Criteria) this;
        }

        public Criteria andNianchubili13LessThanOrEqualTo(String value) {
            addCriterion("NIANCHUBILI13 <=", value, "nianchubili13");
            return (Criteria) this;
        }

        public Criteria andNianchubili13Like(String value) {
            addCriterion("NIANCHUBILI13 like", value, "nianchubili13");
            return (Criteria) this;
        }

        public Criteria andNianchubili13NotLike(String value) {
            addCriterion("NIANCHUBILI13 not like", value, "nianchubili13");
            return (Criteria) this;
        }

        public Criteria andNianchubili13In(List<String> values) {
            addCriterion("NIANCHUBILI13 in", values, "nianchubili13");
            return (Criteria) this;
        }

        public Criteria andNianchubili13NotIn(List<String> values) {
            addCriterion("NIANCHUBILI13 not in", values, "nianchubili13");
            return (Criteria) this;
        }

        public Criteria andNianchubili13Between(String value1, String value2) {
            addCriterion("NIANCHUBILI13 between", value1, value2, "nianchubili13");
            return (Criteria) this;
        }

        public Criteria andNianchubili13NotBetween(String value1, String value2) {
            addCriterion("NIANCHUBILI13 not between", value1, value2, "nianchubili13");
            return (Criteria) this;
        }

        public Criteria andNianmoyue13IsNull() {
            addCriterion("NIANMOYUE13 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoyue13IsNotNull() {
            addCriterion("NIANMOYUE13 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoyue13EqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE13 =", value, "nianmoyue13");
            return (Criteria) this;
        }

        public Criteria andNianmoyue13NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE13 <>", value, "nianmoyue13");
            return (Criteria) this;
        }

        public Criteria andNianmoyue13GreaterThan(BigDecimal value) {
            addCriterion("NIANMOYUE13 >", value, "nianmoyue13");
            return (Criteria) this;
        }

        public Criteria andNianmoyue13GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE13 >=", value, "nianmoyue13");
            return (Criteria) this;
        }

        public Criteria andNianmoyue13LessThan(BigDecimal value) {
            addCriterion("NIANMOYUE13 <", value, "nianmoyue13");
            return (Criteria) this;
        }

        public Criteria andNianmoyue13LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE13 <=", value, "nianmoyue13");
            return (Criteria) this;
        }

        public Criteria andNianmoyue13In(List<BigDecimal> values) {
            addCriterion("NIANMOYUE13 in", values, "nianmoyue13");
            return (Criteria) this;
        }

        public Criteria andNianmoyue13NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOYUE13 not in", values, "nianmoyue13");
            return (Criteria) this;
        }

        public Criteria andNianmoyue13Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE13 between", value1, value2, "nianmoyue13");
            return (Criteria) this;
        }

        public Criteria andNianmoyue13NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE13 not between", value1, value2, "nianmoyue13");
            return (Criteria) this;
        }

        public Criteria andNianmobili13IsNull() {
            addCriterion("NIANMOBILI13 is null");
            return (Criteria) this;
        }

        public Criteria andNianmobili13IsNotNull() {
            addCriterion("NIANMOBILI13 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmobili13EqualTo(String value) {
            addCriterion("NIANMOBILI13 =", value, "nianmobili13");
            return (Criteria) this;
        }

        public Criteria andNianmobili13NotEqualTo(String value) {
            addCriterion("NIANMOBILI13 <>", value, "nianmobili13");
            return (Criteria) this;
        }

        public Criteria andNianmobili13GreaterThan(String value) {
            addCriterion("NIANMOBILI13 >", value, "nianmobili13");
            return (Criteria) this;
        }

        public Criteria andNianmobili13GreaterThanOrEqualTo(String value) {
            addCriterion("NIANMOBILI13 >=", value, "nianmobili13");
            return (Criteria) this;
        }

        public Criteria andNianmobili13LessThan(String value) {
            addCriterion("NIANMOBILI13 <", value, "nianmobili13");
            return (Criteria) this;
        }

        public Criteria andNianmobili13LessThanOrEqualTo(String value) {
            addCriterion("NIANMOBILI13 <=", value, "nianmobili13");
            return (Criteria) this;
        }

        public Criteria andNianmobili13Like(String value) {
            addCriterion("NIANMOBILI13 like", value, "nianmobili13");
            return (Criteria) this;
        }

        public Criteria andNianmobili13NotLike(String value) {
            addCriterion("NIANMOBILI13 not like", value, "nianmobili13");
            return (Criteria) this;
        }

        public Criteria andNianmobili13In(List<String> values) {
            addCriterion("NIANMOBILI13 in", values, "nianmobili13");
            return (Criteria) this;
        }

        public Criteria andNianmobili13NotIn(List<String> values) {
            addCriterion("NIANMOBILI13 not in", values, "nianmobili13");
            return (Criteria) this;
        }

        public Criteria andNianmobili13Between(String value1, String value2) {
            addCriterion("NIANMOBILI13 between", value1, value2, "nianmobili13");
            return (Criteria) this;
        }

        public Criteria andNianmobili13NotBetween(String value1, String value2) {
            addCriterion("NIANMOBILI13 not between", value1, value2, "nianmobili13");
            return (Criteria) this;
        }

        public Criteria andNianchuyue14IsNull() {
            addCriterion("NIANCHUYUE14 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuyue14IsNotNull() {
            addCriterion("NIANCHUYUE14 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuyue14EqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE14 =", value, "nianchuyue14");
            return (Criteria) this;
        }

        public Criteria andNianchuyue14NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE14 <>", value, "nianchuyue14");
            return (Criteria) this;
        }

        public Criteria andNianchuyue14GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUYUE14 >", value, "nianchuyue14");
            return (Criteria) this;
        }

        public Criteria andNianchuyue14GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE14 >=", value, "nianchuyue14");
            return (Criteria) this;
        }

        public Criteria andNianchuyue14LessThan(BigDecimal value) {
            addCriterion("NIANCHUYUE14 <", value, "nianchuyue14");
            return (Criteria) this;
        }

        public Criteria andNianchuyue14LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE14 <=", value, "nianchuyue14");
            return (Criteria) this;
        }

        public Criteria andNianchuyue14In(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE14 in", values, "nianchuyue14");
            return (Criteria) this;
        }

        public Criteria andNianchuyue14NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE14 not in", values, "nianchuyue14");
            return (Criteria) this;
        }

        public Criteria andNianchuyue14Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE14 between", value1, value2, "nianchuyue14");
            return (Criteria) this;
        }

        public Criteria andNianchuyue14NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE14 not between", value1, value2, "nianchuyue14");
            return (Criteria) this;
        }

        public Criteria andNianchubili14IsNull() {
            addCriterion("NIANCHUBILI14 is null");
            return (Criteria) this;
        }

        public Criteria andNianchubili14IsNotNull() {
            addCriterion("NIANCHUBILI14 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchubili14EqualTo(String value) {
            addCriterion("NIANCHUBILI14 =", value, "nianchubili14");
            return (Criteria) this;
        }

        public Criteria andNianchubili14NotEqualTo(String value) {
            addCriterion("NIANCHUBILI14 <>", value, "nianchubili14");
            return (Criteria) this;
        }

        public Criteria andNianchubili14GreaterThan(String value) {
            addCriterion("NIANCHUBILI14 >", value, "nianchubili14");
            return (Criteria) this;
        }

        public Criteria andNianchubili14GreaterThanOrEqualTo(String value) {
            addCriterion("NIANCHUBILI14 >=", value, "nianchubili14");
            return (Criteria) this;
        }

        public Criteria andNianchubili14LessThan(String value) {
            addCriterion("NIANCHUBILI14 <", value, "nianchubili14");
            return (Criteria) this;
        }

        public Criteria andNianchubili14LessThanOrEqualTo(String value) {
            addCriterion("NIANCHUBILI14 <=", value, "nianchubili14");
            return (Criteria) this;
        }

        public Criteria andNianchubili14Like(String value) {
            addCriterion("NIANCHUBILI14 like", value, "nianchubili14");
            return (Criteria) this;
        }

        public Criteria andNianchubili14NotLike(String value) {
            addCriterion("NIANCHUBILI14 not like", value, "nianchubili14");
            return (Criteria) this;
        }

        public Criteria andNianchubili14In(List<String> values) {
            addCriterion("NIANCHUBILI14 in", values, "nianchubili14");
            return (Criteria) this;
        }

        public Criteria andNianchubili14NotIn(List<String> values) {
            addCriterion("NIANCHUBILI14 not in", values, "nianchubili14");
            return (Criteria) this;
        }

        public Criteria andNianchubili14Between(String value1, String value2) {
            addCriterion("NIANCHUBILI14 between", value1, value2, "nianchubili14");
            return (Criteria) this;
        }

        public Criteria andNianchubili14NotBetween(String value1, String value2) {
            addCriterion("NIANCHUBILI14 not between", value1, value2, "nianchubili14");
            return (Criteria) this;
        }

        public Criteria andNianmoyue14IsNull() {
            addCriterion("NIANMOYUE14 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoyue14IsNotNull() {
            addCriterion("NIANMOYUE14 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoyue14EqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE14 =", value, "nianmoyue14");
            return (Criteria) this;
        }

        public Criteria andNianmoyue14NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE14 <>", value, "nianmoyue14");
            return (Criteria) this;
        }

        public Criteria andNianmoyue14GreaterThan(BigDecimal value) {
            addCriterion("NIANMOYUE14 >", value, "nianmoyue14");
            return (Criteria) this;
        }

        public Criteria andNianmoyue14GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE14 >=", value, "nianmoyue14");
            return (Criteria) this;
        }

        public Criteria andNianmoyue14LessThan(BigDecimal value) {
            addCriterion("NIANMOYUE14 <", value, "nianmoyue14");
            return (Criteria) this;
        }

        public Criteria andNianmoyue14LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE14 <=", value, "nianmoyue14");
            return (Criteria) this;
        }

        public Criteria andNianmoyue14In(List<BigDecimal> values) {
            addCriterion("NIANMOYUE14 in", values, "nianmoyue14");
            return (Criteria) this;
        }

        public Criteria andNianmoyue14NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOYUE14 not in", values, "nianmoyue14");
            return (Criteria) this;
        }

        public Criteria andNianmoyue14Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE14 between", value1, value2, "nianmoyue14");
            return (Criteria) this;
        }

        public Criteria andNianmoyue14NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE14 not between", value1, value2, "nianmoyue14");
            return (Criteria) this;
        }

        public Criteria andNianmobili14IsNull() {
            addCriterion("NIANMOBILI14 is null");
            return (Criteria) this;
        }

        public Criteria andNianmobili14IsNotNull() {
            addCriterion("NIANMOBILI14 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmobili14EqualTo(String value) {
            addCriterion("NIANMOBILI14 =", value, "nianmobili14");
            return (Criteria) this;
        }

        public Criteria andNianmobili14NotEqualTo(String value) {
            addCriterion("NIANMOBILI14 <>", value, "nianmobili14");
            return (Criteria) this;
        }

        public Criteria andNianmobili14GreaterThan(String value) {
            addCriterion("NIANMOBILI14 >", value, "nianmobili14");
            return (Criteria) this;
        }

        public Criteria andNianmobili14GreaterThanOrEqualTo(String value) {
            addCriterion("NIANMOBILI14 >=", value, "nianmobili14");
            return (Criteria) this;
        }

        public Criteria andNianmobili14LessThan(String value) {
            addCriterion("NIANMOBILI14 <", value, "nianmobili14");
            return (Criteria) this;
        }

        public Criteria andNianmobili14LessThanOrEqualTo(String value) {
            addCriterion("NIANMOBILI14 <=", value, "nianmobili14");
            return (Criteria) this;
        }

        public Criteria andNianmobili14Like(String value) {
            addCriterion("NIANMOBILI14 like", value, "nianmobili14");
            return (Criteria) this;
        }

        public Criteria andNianmobili14NotLike(String value) {
            addCriterion("NIANMOBILI14 not like", value, "nianmobili14");
            return (Criteria) this;
        }

        public Criteria andNianmobili14In(List<String> values) {
            addCriterion("NIANMOBILI14 in", values, "nianmobili14");
            return (Criteria) this;
        }

        public Criteria andNianmobili14NotIn(List<String> values) {
            addCriterion("NIANMOBILI14 not in", values, "nianmobili14");
            return (Criteria) this;
        }

        public Criteria andNianmobili14Between(String value1, String value2) {
            addCriterion("NIANMOBILI14 between", value1, value2, "nianmobili14");
            return (Criteria) this;
        }

        public Criteria andNianmobili14NotBetween(String value1, String value2) {
            addCriterion("NIANMOBILI14 not between", value1, value2, "nianmobili14");
            return (Criteria) this;
        }

        public Criteria andNianchuyue15IsNull() {
            addCriterion("NIANCHUYUE15 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuyue15IsNotNull() {
            addCriterion("NIANCHUYUE15 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuyue15EqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE15 =", value, "nianchuyue15");
            return (Criteria) this;
        }

        public Criteria andNianchuyue15NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE15 <>", value, "nianchuyue15");
            return (Criteria) this;
        }

        public Criteria andNianchuyue15GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUYUE15 >", value, "nianchuyue15");
            return (Criteria) this;
        }

        public Criteria andNianchuyue15GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE15 >=", value, "nianchuyue15");
            return (Criteria) this;
        }

        public Criteria andNianchuyue15LessThan(BigDecimal value) {
            addCriterion("NIANCHUYUE15 <", value, "nianchuyue15");
            return (Criteria) this;
        }

        public Criteria andNianchuyue15LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE15 <=", value, "nianchuyue15");
            return (Criteria) this;
        }

        public Criteria andNianchuyue15In(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE15 in", values, "nianchuyue15");
            return (Criteria) this;
        }

        public Criteria andNianchuyue15NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE15 not in", values, "nianchuyue15");
            return (Criteria) this;
        }

        public Criteria andNianchuyue15Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE15 between", value1, value2, "nianchuyue15");
            return (Criteria) this;
        }

        public Criteria andNianchuyue15NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE15 not between", value1, value2, "nianchuyue15");
            return (Criteria) this;
        }

        public Criteria andNianchubili15IsNull() {
            addCriterion("NIANCHUBILI15 is null");
            return (Criteria) this;
        }

        public Criteria andNianchubili15IsNotNull() {
            addCriterion("NIANCHUBILI15 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchubili15EqualTo(String value) {
            addCriterion("NIANCHUBILI15 =", value, "nianchubili15");
            return (Criteria) this;
        }

        public Criteria andNianchubili15NotEqualTo(String value) {
            addCriterion("NIANCHUBILI15 <>", value, "nianchubili15");
            return (Criteria) this;
        }

        public Criteria andNianchubili15GreaterThan(String value) {
            addCriterion("NIANCHUBILI15 >", value, "nianchubili15");
            return (Criteria) this;
        }

        public Criteria andNianchubili15GreaterThanOrEqualTo(String value) {
            addCriterion("NIANCHUBILI15 >=", value, "nianchubili15");
            return (Criteria) this;
        }

        public Criteria andNianchubili15LessThan(String value) {
            addCriterion("NIANCHUBILI15 <", value, "nianchubili15");
            return (Criteria) this;
        }

        public Criteria andNianchubili15LessThanOrEqualTo(String value) {
            addCriterion("NIANCHUBILI15 <=", value, "nianchubili15");
            return (Criteria) this;
        }

        public Criteria andNianchubili15Like(String value) {
            addCriterion("NIANCHUBILI15 like", value, "nianchubili15");
            return (Criteria) this;
        }

        public Criteria andNianchubili15NotLike(String value) {
            addCriterion("NIANCHUBILI15 not like", value, "nianchubili15");
            return (Criteria) this;
        }

        public Criteria andNianchubili15In(List<String> values) {
            addCriterion("NIANCHUBILI15 in", values, "nianchubili15");
            return (Criteria) this;
        }

        public Criteria andNianchubili15NotIn(List<String> values) {
            addCriterion("NIANCHUBILI15 not in", values, "nianchubili15");
            return (Criteria) this;
        }

        public Criteria andNianchubili15Between(String value1, String value2) {
            addCriterion("NIANCHUBILI15 between", value1, value2, "nianchubili15");
            return (Criteria) this;
        }

        public Criteria andNianchubili15NotBetween(String value1, String value2) {
            addCriterion("NIANCHUBILI15 not between", value1, value2, "nianchubili15");
            return (Criteria) this;
        }

        public Criteria andNianmoyue15IsNull() {
            addCriterion("NIANMOYUE15 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoyue15IsNotNull() {
            addCriterion("NIANMOYUE15 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoyue15EqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE15 =", value, "nianmoyue15");
            return (Criteria) this;
        }

        public Criteria andNianmoyue15NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE15 <>", value, "nianmoyue15");
            return (Criteria) this;
        }

        public Criteria andNianmoyue15GreaterThan(BigDecimal value) {
            addCriterion("NIANMOYUE15 >", value, "nianmoyue15");
            return (Criteria) this;
        }

        public Criteria andNianmoyue15GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE15 >=", value, "nianmoyue15");
            return (Criteria) this;
        }

        public Criteria andNianmoyue15LessThan(BigDecimal value) {
            addCriterion("NIANMOYUE15 <", value, "nianmoyue15");
            return (Criteria) this;
        }

        public Criteria andNianmoyue15LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE15 <=", value, "nianmoyue15");
            return (Criteria) this;
        }

        public Criteria andNianmoyue15In(List<BigDecimal> values) {
            addCriterion("NIANMOYUE15 in", values, "nianmoyue15");
            return (Criteria) this;
        }

        public Criteria andNianmoyue15NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOYUE15 not in", values, "nianmoyue15");
            return (Criteria) this;
        }

        public Criteria andNianmoyue15Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE15 between", value1, value2, "nianmoyue15");
            return (Criteria) this;
        }

        public Criteria andNianmoyue15NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE15 not between", value1, value2, "nianmoyue15");
            return (Criteria) this;
        }

        public Criteria andNianmobili15IsNull() {
            addCriterion("NIANMOBILI15 is null");
            return (Criteria) this;
        }

        public Criteria andNianmobili15IsNotNull() {
            addCriterion("NIANMOBILI15 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmobili15EqualTo(String value) {
            addCriterion("NIANMOBILI15 =", value, "nianmobili15");
            return (Criteria) this;
        }

        public Criteria andNianmobili15NotEqualTo(String value) {
            addCriterion("NIANMOBILI15 <>", value, "nianmobili15");
            return (Criteria) this;
        }

        public Criteria andNianmobili15GreaterThan(String value) {
            addCriterion("NIANMOBILI15 >", value, "nianmobili15");
            return (Criteria) this;
        }

        public Criteria andNianmobili15GreaterThanOrEqualTo(String value) {
            addCriterion("NIANMOBILI15 >=", value, "nianmobili15");
            return (Criteria) this;
        }

        public Criteria andNianmobili15LessThan(String value) {
            addCriterion("NIANMOBILI15 <", value, "nianmobili15");
            return (Criteria) this;
        }

        public Criteria andNianmobili15LessThanOrEqualTo(String value) {
            addCriterion("NIANMOBILI15 <=", value, "nianmobili15");
            return (Criteria) this;
        }

        public Criteria andNianmobili15Like(String value) {
            addCriterion("NIANMOBILI15 like", value, "nianmobili15");
            return (Criteria) this;
        }

        public Criteria andNianmobili15NotLike(String value) {
            addCriterion("NIANMOBILI15 not like", value, "nianmobili15");
            return (Criteria) this;
        }

        public Criteria andNianmobili15In(List<String> values) {
            addCriterion("NIANMOBILI15 in", values, "nianmobili15");
            return (Criteria) this;
        }

        public Criteria andNianmobili15NotIn(List<String> values) {
            addCriterion("NIANMOBILI15 not in", values, "nianmobili15");
            return (Criteria) this;
        }

        public Criteria andNianmobili15Between(String value1, String value2) {
            addCriterion("NIANMOBILI15 between", value1, value2, "nianmobili15");
            return (Criteria) this;
        }

        public Criteria andNianmobili15NotBetween(String value1, String value2) {
            addCriterion("NIANMOBILI15 not between", value1, value2, "nianmobili15");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyueIsNull() {
            addCriterion("NIANCHUHEJIYUE is null");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyueIsNotNull() {
            addCriterion("NIANCHUHEJIYUE is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyueEqualTo(BigDecimal value) {
            addCriterion("NIANCHUHEJIYUE =", value, "nianchuhejiyue");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyueNotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUHEJIYUE <>", value, "nianchuhejiyue");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyueGreaterThan(BigDecimal value) {
            addCriterion("NIANCHUHEJIYUE >", value, "nianchuhejiyue");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUHEJIYUE >=", value, "nianchuhejiyue");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyueLessThan(BigDecimal value) {
            addCriterion("NIANCHUHEJIYUE <", value, "nianchuhejiyue");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUHEJIYUE <=", value, "nianchuhejiyue");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyueIn(List<BigDecimal> values) {
            addCriterion("NIANCHUHEJIYUE in", values, "nianchuhejiyue");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyueNotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUHEJIYUE not in", values, "nianchuhejiyue");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUHEJIYUE between", value1, value2, "nianchuhejiyue");
            return (Criteria) this;
        }

        public Criteria andNianchuhejiyueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUHEJIYUE not between", value1, value2, "nianchuhejiyue");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibiliIsNull() {
            addCriterion("NIANCHUHEJIBILI is null");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibiliIsNotNull() {
            addCriterion("NIANCHUHEJIBILI is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibiliEqualTo(String value) {
            addCriterion("NIANCHUHEJIBILI =", value, "nianchuhejibili");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibiliNotEqualTo(String value) {
            addCriterion("NIANCHUHEJIBILI <>", value, "nianchuhejibili");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibiliGreaterThan(String value) {
            addCriterion("NIANCHUHEJIBILI >", value, "nianchuhejibili");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibiliGreaterThanOrEqualTo(String value) {
            addCriterion("NIANCHUHEJIBILI >=", value, "nianchuhejibili");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibiliLessThan(String value) {
            addCriterion("NIANCHUHEJIBILI <", value, "nianchuhejibili");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibiliLessThanOrEqualTo(String value) {
            addCriterion("NIANCHUHEJIBILI <=", value, "nianchuhejibili");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibiliLike(String value) {
            addCriterion("NIANCHUHEJIBILI like", value, "nianchuhejibili");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibiliNotLike(String value) {
            addCriterion("NIANCHUHEJIBILI not like", value, "nianchuhejibili");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibiliIn(List<String> values) {
            addCriterion("NIANCHUHEJIBILI in", values, "nianchuhejibili");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibiliNotIn(List<String> values) {
            addCriterion("NIANCHUHEJIBILI not in", values, "nianchuhejibili");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibiliBetween(String value1, String value2) {
            addCriterion("NIANCHUHEJIBILI between", value1, value2, "nianchuhejibili");
            return (Criteria) this;
        }

        public Criteria andNianchuhejibiliNotBetween(String value1, String value2) {
            addCriterion("NIANCHUHEJIBILI not between", value1, value2, "nianchuhejibili");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyueIsNull() {
            addCriterion("NIANMOHEJIYUE is null");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyueIsNotNull() {
            addCriterion("NIANMOHEJIYUE is not null");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyueEqualTo(BigDecimal value) {
            addCriterion("NIANMOHEJIYUE =", value, "nianmohejiyue");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyueNotEqualTo(BigDecimal value) {
            addCriterion("NIANMOHEJIYUE <>", value, "nianmohejiyue");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyueGreaterThan(BigDecimal value) {
            addCriterion("NIANMOHEJIYUE >", value, "nianmohejiyue");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOHEJIYUE >=", value, "nianmohejiyue");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyueLessThan(BigDecimal value) {
            addCriterion("NIANMOHEJIYUE <", value, "nianmohejiyue");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOHEJIYUE <=", value, "nianmohejiyue");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyueIn(List<BigDecimal> values) {
            addCriterion("NIANMOHEJIYUE in", values, "nianmohejiyue");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyueNotIn(List<BigDecimal> values) {
            addCriterion("NIANMOHEJIYUE not in", values, "nianmohejiyue");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOHEJIYUE between", value1, value2, "nianmohejiyue");
            return (Criteria) this;
        }

        public Criteria andNianmohejiyueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOHEJIYUE not between", value1, value2, "nianmohejiyue");
            return (Criteria) this;
        }

        public Criteria andNianmohejibiliIsNull() {
            addCriterion("NIANMOHEJIBILI is null");
            return (Criteria) this;
        }

        public Criteria andNianmohejibiliIsNotNull() {
            addCriterion("NIANMOHEJIBILI is not null");
            return (Criteria) this;
        }

        public Criteria andNianmohejibiliEqualTo(String value) {
            addCriterion("NIANMOHEJIBILI =", value, "nianmohejibili");
            return (Criteria) this;
        }

        public Criteria andNianmohejibiliNotEqualTo(String value) {
            addCriterion("NIANMOHEJIBILI <>", value, "nianmohejibili");
            return (Criteria) this;
        }

        public Criteria andNianmohejibiliGreaterThan(String value) {
            addCriterion("NIANMOHEJIBILI >", value, "nianmohejibili");
            return (Criteria) this;
        }

        public Criteria andNianmohejibiliGreaterThanOrEqualTo(String value) {
            addCriterion("NIANMOHEJIBILI >=", value, "nianmohejibili");
            return (Criteria) this;
        }

        public Criteria andNianmohejibiliLessThan(String value) {
            addCriterion("NIANMOHEJIBILI <", value, "nianmohejibili");
            return (Criteria) this;
        }

        public Criteria andNianmohejibiliLessThanOrEqualTo(String value) {
            addCriterion("NIANMOHEJIBILI <=", value, "nianmohejibili");
            return (Criteria) this;
        }

        public Criteria andNianmohejibiliLike(String value) {
            addCriterion("NIANMOHEJIBILI like", value, "nianmohejibili");
            return (Criteria) this;
        }

        public Criteria andNianmohejibiliNotLike(String value) {
            addCriterion("NIANMOHEJIBILI not like", value, "nianmohejibili");
            return (Criteria) this;
        }

        public Criteria andNianmohejibiliIn(List<String> values) {
            addCriterion("NIANMOHEJIBILI in", values, "nianmohejibili");
            return (Criteria) this;
        }

        public Criteria andNianmohejibiliNotIn(List<String> values) {
            addCriterion("NIANMOHEJIBILI not in", values, "nianmohejibili");
            return (Criteria) this;
        }

        public Criteria andNianmohejibiliBetween(String value1, String value2) {
            addCriterion("NIANMOHEJIBILI between", value1, value2, "nianmohejibili");
            return (Criteria) this;
        }

        public Criteria andNianmohejibiliNotBetween(String value1, String value2) {
            addCriterion("NIANMOHEJIBILI not between", value1, value2, "nianmohejibili");
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