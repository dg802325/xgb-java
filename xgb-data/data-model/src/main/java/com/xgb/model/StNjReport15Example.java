package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StNjReport15Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StNjReport15Example() {
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

        public Criteria andXianjin1IsNull() {
            addCriterion("XIANJIN1 is null");
            return (Criteria) this;
        }

        public Criteria andXianjin1IsNotNull() {
            addCriterion("XIANJIN1 is not null");
            return (Criteria) this;
        }

        public Criteria andXianjin1EqualTo(BigDecimal value) {
            addCriterion("XIANJIN1 =", value, "xianjin1");
            return (Criteria) this;
        }

        public Criteria andXianjin1NotEqualTo(BigDecimal value) {
            addCriterion("XIANJIN1 <>", value, "xianjin1");
            return (Criteria) this;
        }

        public Criteria andXianjin1GreaterThan(BigDecimal value) {
            addCriterion("XIANJIN1 >", value, "xianjin1");
            return (Criteria) this;
        }

        public Criteria andXianjin1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJIN1 >=", value, "xianjin1");
            return (Criteria) this;
        }

        public Criteria andXianjin1LessThan(BigDecimal value) {
            addCriterion("XIANJIN1 <", value, "xianjin1");
            return (Criteria) this;
        }

        public Criteria andXianjin1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJIN1 <=", value, "xianjin1");
            return (Criteria) this;
        }

        public Criteria andXianjin1In(List<BigDecimal> values) {
            addCriterion("XIANJIN1 in", values, "xianjin1");
            return (Criteria) this;
        }

        public Criteria andXianjin1NotIn(List<BigDecimal> values) {
            addCriterion("XIANJIN1 not in", values, "xianjin1");
            return (Criteria) this;
        }

        public Criteria andXianjin1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJIN1 between", value1, value2, "xianjin1");
            return (Criteria) this;
        }

        public Criteria andXianjin1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJIN1 not between", value1, value2, "xianjin1");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe1IsNull() {
            addCriterion("FEIXIANJINZHEHE1 is null");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe1IsNotNull() {
            addCriterion("FEIXIANJINZHEHE1 is not null");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe1EqualTo(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE1 =", value, "feixianjinzhehe1");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe1NotEqualTo(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE1 <>", value, "feixianjinzhehe1");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe1GreaterThan(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE1 >", value, "feixianjinzhehe1");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE1 >=", value, "feixianjinzhehe1");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe1LessThan(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE1 <", value, "feixianjinzhehe1");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE1 <=", value, "feixianjinzhehe1");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe1In(List<BigDecimal> values) {
            addCriterion("FEIXIANJINZHEHE1 in", values, "feixianjinzhehe1");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe1NotIn(List<BigDecimal> values) {
            addCriterion("FEIXIANJINZHEHE1 not in", values, "feixianjinzhehe1");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEIXIANJINZHEHE1 between", value1, value2, "feixianjinzhehe1");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEIXIANJINZHEHE1 not between", value1, value2, "feixianjinzhehe1");
            return (Criteria) this;
        }

        public Criteria andHeji1IsNull() {
            addCriterion("HEJI1 is null");
            return (Criteria) this;
        }

        public Criteria andHeji1IsNotNull() {
            addCriterion("HEJI1 is not null");
            return (Criteria) this;
        }

        public Criteria andHeji1EqualTo(BigDecimal value) {
            addCriterion("HEJI1 =", value, "heji1");
            return (Criteria) this;
        }

        public Criteria andHeji1NotEqualTo(BigDecimal value) {
            addCriterion("HEJI1 <>", value, "heji1");
            return (Criteria) this;
        }

        public Criteria andHeji1GreaterThan(BigDecimal value) {
            addCriterion("HEJI1 >", value, "heji1");
            return (Criteria) this;
        }

        public Criteria andHeji1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJI1 >=", value, "heji1");
            return (Criteria) this;
        }

        public Criteria andHeji1LessThan(BigDecimal value) {
            addCriterion("HEJI1 <", value, "heji1");
            return (Criteria) this;
        }

        public Criteria andHeji1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJI1 <=", value, "heji1");
            return (Criteria) this;
        }

        public Criteria andHeji1In(List<BigDecimal> values) {
            addCriterion("HEJI1 in", values, "heji1");
            return (Criteria) this;
        }

        public Criteria andHeji1NotIn(List<BigDecimal> values) {
            addCriterion("HEJI1 not in", values, "heji1");
            return (Criteria) this;
        }

        public Criteria andHeji1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJI1 between", value1, value2, "heji1");
            return (Criteria) this;
        }

        public Criteria andHeji1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJI1 not between", value1, value2, "heji1");
            return (Criteria) this;
        }

        public Criteria andXianjin2IsNull() {
            addCriterion("XIANJIN2 is null");
            return (Criteria) this;
        }

        public Criteria andXianjin2IsNotNull() {
            addCriterion("XIANJIN2 is not null");
            return (Criteria) this;
        }

        public Criteria andXianjin2EqualTo(BigDecimal value) {
            addCriterion("XIANJIN2 =", value, "xianjin2");
            return (Criteria) this;
        }

        public Criteria andXianjin2NotEqualTo(BigDecimal value) {
            addCriterion("XIANJIN2 <>", value, "xianjin2");
            return (Criteria) this;
        }

        public Criteria andXianjin2GreaterThan(BigDecimal value) {
            addCriterion("XIANJIN2 >", value, "xianjin2");
            return (Criteria) this;
        }

        public Criteria andXianjin2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJIN2 >=", value, "xianjin2");
            return (Criteria) this;
        }

        public Criteria andXianjin2LessThan(BigDecimal value) {
            addCriterion("XIANJIN2 <", value, "xianjin2");
            return (Criteria) this;
        }

        public Criteria andXianjin2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJIN2 <=", value, "xianjin2");
            return (Criteria) this;
        }

        public Criteria andXianjin2In(List<BigDecimal> values) {
            addCriterion("XIANJIN2 in", values, "xianjin2");
            return (Criteria) this;
        }

        public Criteria andXianjin2NotIn(List<BigDecimal> values) {
            addCriterion("XIANJIN2 not in", values, "xianjin2");
            return (Criteria) this;
        }

        public Criteria andXianjin2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJIN2 between", value1, value2, "xianjin2");
            return (Criteria) this;
        }

        public Criteria andXianjin2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJIN2 not between", value1, value2, "xianjin2");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe2IsNull() {
            addCriterion("FEIXIANJINZHEHE2 is null");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe2IsNotNull() {
            addCriterion("FEIXIANJINZHEHE2 is not null");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe2EqualTo(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE2 =", value, "feixianjinzhehe2");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe2NotEqualTo(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE2 <>", value, "feixianjinzhehe2");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe2GreaterThan(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE2 >", value, "feixianjinzhehe2");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE2 >=", value, "feixianjinzhehe2");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe2LessThan(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE2 <", value, "feixianjinzhehe2");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE2 <=", value, "feixianjinzhehe2");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe2In(List<BigDecimal> values) {
            addCriterion("FEIXIANJINZHEHE2 in", values, "feixianjinzhehe2");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe2NotIn(List<BigDecimal> values) {
            addCriterion("FEIXIANJINZHEHE2 not in", values, "feixianjinzhehe2");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEIXIANJINZHEHE2 between", value1, value2, "feixianjinzhehe2");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEIXIANJINZHEHE2 not between", value1, value2, "feixianjinzhehe2");
            return (Criteria) this;
        }

        public Criteria andHeji2IsNull() {
            addCriterion("HEJI2 is null");
            return (Criteria) this;
        }

        public Criteria andHeji2IsNotNull() {
            addCriterion("HEJI2 is not null");
            return (Criteria) this;
        }

        public Criteria andHeji2EqualTo(BigDecimal value) {
            addCriterion("HEJI2 =", value, "heji2");
            return (Criteria) this;
        }

        public Criteria andHeji2NotEqualTo(BigDecimal value) {
            addCriterion("HEJI2 <>", value, "heji2");
            return (Criteria) this;
        }

        public Criteria andHeji2GreaterThan(BigDecimal value) {
            addCriterion("HEJI2 >", value, "heji2");
            return (Criteria) this;
        }

        public Criteria andHeji2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJI2 >=", value, "heji2");
            return (Criteria) this;
        }

        public Criteria andHeji2LessThan(BigDecimal value) {
            addCriterion("HEJI2 <", value, "heji2");
            return (Criteria) this;
        }

        public Criteria andHeji2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJI2 <=", value, "heji2");
            return (Criteria) this;
        }

        public Criteria andHeji2In(List<BigDecimal> values) {
            addCriterion("HEJI2 in", values, "heji2");
            return (Criteria) this;
        }

        public Criteria andHeji2NotIn(List<BigDecimal> values) {
            addCriterion("HEJI2 not in", values, "heji2");
            return (Criteria) this;
        }

        public Criteria andHeji2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJI2 between", value1, value2, "heji2");
            return (Criteria) this;
        }

        public Criteria andHeji2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJI2 not between", value1, value2, "heji2");
            return (Criteria) this;
        }

        public Criteria andXianjin3IsNull() {
            addCriterion("XIANJIN3 is null");
            return (Criteria) this;
        }

        public Criteria andXianjin3IsNotNull() {
            addCriterion("XIANJIN3 is not null");
            return (Criteria) this;
        }

        public Criteria andXianjin3EqualTo(BigDecimal value) {
            addCriterion("XIANJIN3 =", value, "xianjin3");
            return (Criteria) this;
        }

        public Criteria andXianjin3NotEqualTo(BigDecimal value) {
            addCriterion("XIANJIN3 <>", value, "xianjin3");
            return (Criteria) this;
        }

        public Criteria andXianjin3GreaterThan(BigDecimal value) {
            addCriterion("XIANJIN3 >", value, "xianjin3");
            return (Criteria) this;
        }

        public Criteria andXianjin3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJIN3 >=", value, "xianjin3");
            return (Criteria) this;
        }

        public Criteria andXianjin3LessThan(BigDecimal value) {
            addCriterion("XIANJIN3 <", value, "xianjin3");
            return (Criteria) this;
        }

        public Criteria andXianjin3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJIN3 <=", value, "xianjin3");
            return (Criteria) this;
        }

        public Criteria andXianjin3In(List<BigDecimal> values) {
            addCriterion("XIANJIN3 in", values, "xianjin3");
            return (Criteria) this;
        }

        public Criteria andXianjin3NotIn(List<BigDecimal> values) {
            addCriterion("XIANJIN3 not in", values, "xianjin3");
            return (Criteria) this;
        }

        public Criteria andXianjin3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJIN3 between", value1, value2, "xianjin3");
            return (Criteria) this;
        }

        public Criteria andXianjin3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJIN3 not between", value1, value2, "xianjin3");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe3IsNull() {
            addCriterion("FEIXIANJINZHEHE3 is null");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe3IsNotNull() {
            addCriterion("FEIXIANJINZHEHE3 is not null");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe3EqualTo(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE3 =", value, "feixianjinzhehe3");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe3NotEqualTo(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE3 <>", value, "feixianjinzhehe3");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe3GreaterThan(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE3 >", value, "feixianjinzhehe3");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE3 >=", value, "feixianjinzhehe3");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe3LessThan(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE3 <", value, "feixianjinzhehe3");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE3 <=", value, "feixianjinzhehe3");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe3In(List<BigDecimal> values) {
            addCriterion("FEIXIANJINZHEHE3 in", values, "feixianjinzhehe3");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe3NotIn(List<BigDecimal> values) {
            addCriterion("FEIXIANJINZHEHE3 not in", values, "feixianjinzhehe3");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEIXIANJINZHEHE3 between", value1, value2, "feixianjinzhehe3");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEIXIANJINZHEHE3 not between", value1, value2, "feixianjinzhehe3");
            return (Criteria) this;
        }

        public Criteria andHeji3IsNull() {
            addCriterion("HEJI3 is null");
            return (Criteria) this;
        }

        public Criteria andHeji3IsNotNull() {
            addCriterion("HEJI3 is not null");
            return (Criteria) this;
        }

        public Criteria andHeji3EqualTo(BigDecimal value) {
            addCriterion("HEJI3 =", value, "heji3");
            return (Criteria) this;
        }

        public Criteria andHeji3NotEqualTo(BigDecimal value) {
            addCriterion("HEJI3 <>", value, "heji3");
            return (Criteria) this;
        }

        public Criteria andHeji3GreaterThan(BigDecimal value) {
            addCriterion("HEJI3 >", value, "heji3");
            return (Criteria) this;
        }

        public Criteria andHeji3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJI3 >=", value, "heji3");
            return (Criteria) this;
        }

        public Criteria andHeji3LessThan(BigDecimal value) {
            addCriterion("HEJI3 <", value, "heji3");
            return (Criteria) this;
        }

        public Criteria andHeji3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJI3 <=", value, "heji3");
            return (Criteria) this;
        }

        public Criteria andHeji3In(List<BigDecimal> values) {
            addCriterion("HEJI3 in", values, "heji3");
            return (Criteria) this;
        }

        public Criteria andHeji3NotIn(List<BigDecimal> values) {
            addCriterion("HEJI3 not in", values, "heji3");
            return (Criteria) this;
        }

        public Criteria andHeji3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJI3 between", value1, value2, "heji3");
            return (Criteria) this;
        }

        public Criteria andHeji3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJI3 not between", value1, value2, "heji3");
            return (Criteria) this;
        }

        public Criteria andXianjin4IsNull() {
            addCriterion("XIANJIN4 is null");
            return (Criteria) this;
        }

        public Criteria andXianjin4IsNotNull() {
            addCriterion("XIANJIN4 is not null");
            return (Criteria) this;
        }

        public Criteria andXianjin4EqualTo(BigDecimal value) {
            addCriterion("XIANJIN4 =", value, "xianjin4");
            return (Criteria) this;
        }

        public Criteria andXianjin4NotEqualTo(BigDecimal value) {
            addCriterion("XIANJIN4 <>", value, "xianjin4");
            return (Criteria) this;
        }

        public Criteria andXianjin4GreaterThan(BigDecimal value) {
            addCriterion("XIANJIN4 >", value, "xianjin4");
            return (Criteria) this;
        }

        public Criteria andXianjin4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJIN4 >=", value, "xianjin4");
            return (Criteria) this;
        }

        public Criteria andXianjin4LessThan(BigDecimal value) {
            addCriterion("XIANJIN4 <", value, "xianjin4");
            return (Criteria) this;
        }

        public Criteria andXianjin4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJIN4 <=", value, "xianjin4");
            return (Criteria) this;
        }

        public Criteria andXianjin4In(List<BigDecimal> values) {
            addCriterion("XIANJIN4 in", values, "xianjin4");
            return (Criteria) this;
        }

        public Criteria andXianjin4NotIn(List<BigDecimal> values) {
            addCriterion("XIANJIN4 not in", values, "xianjin4");
            return (Criteria) this;
        }

        public Criteria andXianjin4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJIN4 between", value1, value2, "xianjin4");
            return (Criteria) this;
        }

        public Criteria andXianjin4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJIN4 not between", value1, value2, "xianjin4");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe4IsNull() {
            addCriterion("FEIXIANJINZHEHE4 is null");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe4IsNotNull() {
            addCriterion("FEIXIANJINZHEHE4 is not null");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe4EqualTo(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE4 =", value, "feixianjinzhehe4");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe4NotEqualTo(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE4 <>", value, "feixianjinzhehe4");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe4GreaterThan(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE4 >", value, "feixianjinzhehe4");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE4 >=", value, "feixianjinzhehe4");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe4LessThan(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE4 <", value, "feixianjinzhehe4");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE4 <=", value, "feixianjinzhehe4");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe4In(List<BigDecimal> values) {
            addCriterion("FEIXIANJINZHEHE4 in", values, "feixianjinzhehe4");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe4NotIn(List<BigDecimal> values) {
            addCriterion("FEIXIANJINZHEHE4 not in", values, "feixianjinzhehe4");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEIXIANJINZHEHE4 between", value1, value2, "feixianjinzhehe4");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEIXIANJINZHEHE4 not between", value1, value2, "feixianjinzhehe4");
            return (Criteria) this;
        }

        public Criteria andHeji4IsNull() {
            addCriterion("HEJI4 is null");
            return (Criteria) this;
        }

        public Criteria andHeji4IsNotNull() {
            addCriterion("HEJI4 is not null");
            return (Criteria) this;
        }

        public Criteria andHeji4EqualTo(BigDecimal value) {
            addCriterion("HEJI4 =", value, "heji4");
            return (Criteria) this;
        }

        public Criteria andHeji4NotEqualTo(BigDecimal value) {
            addCriterion("HEJI4 <>", value, "heji4");
            return (Criteria) this;
        }

        public Criteria andHeji4GreaterThan(BigDecimal value) {
            addCriterion("HEJI4 >", value, "heji4");
            return (Criteria) this;
        }

        public Criteria andHeji4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJI4 >=", value, "heji4");
            return (Criteria) this;
        }

        public Criteria andHeji4LessThan(BigDecimal value) {
            addCriterion("HEJI4 <", value, "heji4");
            return (Criteria) this;
        }

        public Criteria andHeji4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJI4 <=", value, "heji4");
            return (Criteria) this;
        }

        public Criteria andHeji4In(List<BigDecimal> values) {
            addCriterion("HEJI4 in", values, "heji4");
            return (Criteria) this;
        }

        public Criteria andHeji4NotIn(List<BigDecimal> values) {
            addCriterion("HEJI4 not in", values, "heji4");
            return (Criteria) this;
        }

        public Criteria andHeji4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJI4 between", value1, value2, "heji4");
            return (Criteria) this;
        }

        public Criteria andHeji4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJI4 not between", value1, value2, "heji4");
            return (Criteria) this;
        }

        public Criteria andXianjin5IsNull() {
            addCriterion("XIANJIN5 is null");
            return (Criteria) this;
        }

        public Criteria andXianjin5IsNotNull() {
            addCriterion("XIANJIN5 is not null");
            return (Criteria) this;
        }

        public Criteria andXianjin5EqualTo(BigDecimal value) {
            addCriterion("XIANJIN5 =", value, "xianjin5");
            return (Criteria) this;
        }

        public Criteria andXianjin5NotEqualTo(BigDecimal value) {
            addCriterion("XIANJIN5 <>", value, "xianjin5");
            return (Criteria) this;
        }

        public Criteria andXianjin5GreaterThan(BigDecimal value) {
            addCriterion("XIANJIN5 >", value, "xianjin5");
            return (Criteria) this;
        }

        public Criteria andXianjin5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJIN5 >=", value, "xianjin5");
            return (Criteria) this;
        }

        public Criteria andXianjin5LessThan(BigDecimal value) {
            addCriterion("XIANJIN5 <", value, "xianjin5");
            return (Criteria) this;
        }

        public Criteria andXianjin5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJIN5 <=", value, "xianjin5");
            return (Criteria) this;
        }

        public Criteria andXianjin5In(List<BigDecimal> values) {
            addCriterion("XIANJIN5 in", values, "xianjin5");
            return (Criteria) this;
        }

        public Criteria andXianjin5NotIn(List<BigDecimal> values) {
            addCriterion("XIANJIN5 not in", values, "xianjin5");
            return (Criteria) this;
        }

        public Criteria andXianjin5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJIN5 between", value1, value2, "xianjin5");
            return (Criteria) this;
        }

        public Criteria andXianjin5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJIN5 not between", value1, value2, "xianjin5");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe5IsNull() {
            addCriterion("FEIXIANJINZHEHE5 is null");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe5IsNotNull() {
            addCriterion("FEIXIANJINZHEHE5 is not null");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe5EqualTo(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE5 =", value, "feixianjinzhehe5");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe5NotEqualTo(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE5 <>", value, "feixianjinzhehe5");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe5GreaterThan(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE5 >", value, "feixianjinzhehe5");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE5 >=", value, "feixianjinzhehe5");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe5LessThan(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE5 <", value, "feixianjinzhehe5");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE5 <=", value, "feixianjinzhehe5");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe5In(List<BigDecimal> values) {
            addCriterion("FEIXIANJINZHEHE5 in", values, "feixianjinzhehe5");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe5NotIn(List<BigDecimal> values) {
            addCriterion("FEIXIANJINZHEHE5 not in", values, "feixianjinzhehe5");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEIXIANJINZHEHE5 between", value1, value2, "feixianjinzhehe5");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEIXIANJINZHEHE5 not between", value1, value2, "feixianjinzhehe5");
            return (Criteria) this;
        }

        public Criteria andHeji5IsNull() {
            addCriterion("HEJI5 is null");
            return (Criteria) this;
        }

        public Criteria andHeji5IsNotNull() {
            addCriterion("HEJI5 is not null");
            return (Criteria) this;
        }

        public Criteria andHeji5EqualTo(BigDecimal value) {
            addCriterion("HEJI5 =", value, "heji5");
            return (Criteria) this;
        }

        public Criteria andHeji5NotEqualTo(BigDecimal value) {
            addCriterion("HEJI5 <>", value, "heji5");
            return (Criteria) this;
        }

        public Criteria andHeji5GreaterThan(BigDecimal value) {
            addCriterion("HEJI5 >", value, "heji5");
            return (Criteria) this;
        }

        public Criteria andHeji5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJI5 >=", value, "heji5");
            return (Criteria) this;
        }

        public Criteria andHeji5LessThan(BigDecimal value) {
            addCriterion("HEJI5 <", value, "heji5");
            return (Criteria) this;
        }

        public Criteria andHeji5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJI5 <=", value, "heji5");
            return (Criteria) this;
        }

        public Criteria andHeji5In(List<BigDecimal> values) {
            addCriterion("HEJI5 in", values, "heji5");
            return (Criteria) this;
        }

        public Criteria andHeji5NotIn(List<BigDecimal> values) {
            addCriterion("HEJI5 not in", values, "heji5");
            return (Criteria) this;
        }

        public Criteria andHeji5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJI5 between", value1, value2, "heji5");
            return (Criteria) this;
        }

        public Criteria andHeji5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJI5 not between", value1, value2, "heji5");
            return (Criteria) this;
        }

        public Criteria andXianjin6IsNull() {
            addCriterion("XIANJIN6 is null");
            return (Criteria) this;
        }

        public Criteria andXianjin6IsNotNull() {
            addCriterion("XIANJIN6 is not null");
            return (Criteria) this;
        }

        public Criteria andXianjin6EqualTo(BigDecimal value) {
            addCriterion("XIANJIN6 =", value, "xianjin6");
            return (Criteria) this;
        }

        public Criteria andXianjin6NotEqualTo(BigDecimal value) {
            addCriterion("XIANJIN6 <>", value, "xianjin6");
            return (Criteria) this;
        }

        public Criteria andXianjin6GreaterThan(BigDecimal value) {
            addCriterion("XIANJIN6 >", value, "xianjin6");
            return (Criteria) this;
        }

        public Criteria andXianjin6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJIN6 >=", value, "xianjin6");
            return (Criteria) this;
        }

        public Criteria andXianjin6LessThan(BigDecimal value) {
            addCriterion("XIANJIN6 <", value, "xianjin6");
            return (Criteria) this;
        }

        public Criteria andXianjin6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJIN6 <=", value, "xianjin6");
            return (Criteria) this;
        }

        public Criteria andXianjin6In(List<BigDecimal> values) {
            addCriterion("XIANJIN6 in", values, "xianjin6");
            return (Criteria) this;
        }

        public Criteria andXianjin6NotIn(List<BigDecimal> values) {
            addCriterion("XIANJIN6 not in", values, "xianjin6");
            return (Criteria) this;
        }

        public Criteria andXianjin6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJIN6 between", value1, value2, "xianjin6");
            return (Criteria) this;
        }

        public Criteria andXianjin6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJIN6 not between", value1, value2, "xianjin6");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe6IsNull() {
            addCriterion("FEIXIANJINZHEHE6 is null");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe6IsNotNull() {
            addCriterion("FEIXIANJINZHEHE6 is not null");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe6EqualTo(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE6 =", value, "feixianjinzhehe6");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe6NotEqualTo(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE6 <>", value, "feixianjinzhehe6");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe6GreaterThan(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE6 >", value, "feixianjinzhehe6");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE6 >=", value, "feixianjinzhehe6");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe6LessThan(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE6 <", value, "feixianjinzhehe6");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE6 <=", value, "feixianjinzhehe6");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe6In(List<BigDecimal> values) {
            addCriterion("FEIXIANJINZHEHE6 in", values, "feixianjinzhehe6");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe6NotIn(List<BigDecimal> values) {
            addCriterion("FEIXIANJINZHEHE6 not in", values, "feixianjinzhehe6");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEIXIANJINZHEHE6 between", value1, value2, "feixianjinzhehe6");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEIXIANJINZHEHE6 not between", value1, value2, "feixianjinzhehe6");
            return (Criteria) this;
        }

        public Criteria andHeji6IsNull() {
            addCriterion("HEJI6 is null");
            return (Criteria) this;
        }

        public Criteria andHeji6IsNotNull() {
            addCriterion("HEJI6 is not null");
            return (Criteria) this;
        }

        public Criteria andHeji6EqualTo(BigDecimal value) {
            addCriterion("HEJI6 =", value, "heji6");
            return (Criteria) this;
        }

        public Criteria andHeji6NotEqualTo(BigDecimal value) {
            addCriterion("HEJI6 <>", value, "heji6");
            return (Criteria) this;
        }

        public Criteria andHeji6GreaterThan(BigDecimal value) {
            addCriterion("HEJI6 >", value, "heji6");
            return (Criteria) this;
        }

        public Criteria andHeji6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJI6 >=", value, "heji6");
            return (Criteria) this;
        }

        public Criteria andHeji6LessThan(BigDecimal value) {
            addCriterion("HEJI6 <", value, "heji6");
            return (Criteria) this;
        }

        public Criteria andHeji6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJI6 <=", value, "heji6");
            return (Criteria) this;
        }

        public Criteria andHeji6In(List<BigDecimal> values) {
            addCriterion("HEJI6 in", values, "heji6");
            return (Criteria) this;
        }

        public Criteria andHeji6NotIn(List<BigDecimal> values) {
            addCriterion("HEJI6 not in", values, "heji6");
            return (Criteria) this;
        }

        public Criteria andHeji6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJI6 between", value1, value2, "heji6");
            return (Criteria) this;
        }

        public Criteria andHeji6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJI6 not between", value1, value2, "heji6");
            return (Criteria) this;
        }

        public Criteria andXianjin7IsNull() {
            addCriterion("XIANJIN7 is null");
            return (Criteria) this;
        }

        public Criteria andXianjin7IsNotNull() {
            addCriterion("XIANJIN7 is not null");
            return (Criteria) this;
        }

        public Criteria andXianjin7EqualTo(BigDecimal value) {
            addCriterion("XIANJIN7 =", value, "xianjin7");
            return (Criteria) this;
        }

        public Criteria andXianjin7NotEqualTo(BigDecimal value) {
            addCriterion("XIANJIN7 <>", value, "xianjin7");
            return (Criteria) this;
        }

        public Criteria andXianjin7GreaterThan(BigDecimal value) {
            addCriterion("XIANJIN7 >", value, "xianjin7");
            return (Criteria) this;
        }

        public Criteria andXianjin7GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJIN7 >=", value, "xianjin7");
            return (Criteria) this;
        }

        public Criteria andXianjin7LessThan(BigDecimal value) {
            addCriterion("XIANJIN7 <", value, "xianjin7");
            return (Criteria) this;
        }

        public Criteria andXianjin7LessThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJIN7 <=", value, "xianjin7");
            return (Criteria) this;
        }

        public Criteria andXianjin7In(List<BigDecimal> values) {
            addCriterion("XIANJIN7 in", values, "xianjin7");
            return (Criteria) this;
        }

        public Criteria andXianjin7NotIn(List<BigDecimal> values) {
            addCriterion("XIANJIN7 not in", values, "xianjin7");
            return (Criteria) this;
        }

        public Criteria andXianjin7Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJIN7 between", value1, value2, "xianjin7");
            return (Criteria) this;
        }

        public Criteria andXianjin7NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJIN7 not between", value1, value2, "xianjin7");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe7IsNull() {
            addCriterion("FEIXIANJINZHEHE7 is null");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe7IsNotNull() {
            addCriterion("FEIXIANJINZHEHE7 is not null");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe7EqualTo(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE7 =", value, "feixianjinzhehe7");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe7NotEqualTo(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE7 <>", value, "feixianjinzhehe7");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe7GreaterThan(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE7 >", value, "feixianjinzhehe7");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe7GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE7 >=", value, "feixianjinzhehe7");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe7LessThan(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE7 <", value, "feixianjinzhehe7");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe7LessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEIXIANJINZHEHE7 <=", value, "feixianjinzhehe7");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe7In(List<BigDecimal> values) {
            addCriterion("FEIXIANJINZHEHE7 in", values, "feixianjinzhehe7");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe7NotIn(List<BigDecimal> values) {
            addCriterion("FEIXIANJINZHEHE7 not in", values, "feixianjinzhehe7");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe7Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEIXIANJINZHEHE7 between", value1, value2, "feixianjinzhehe7");
            return (Criteria) this;
        }

        public Criteria andFeixianjinzhehe7NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEIXIANJINZHEHE7 not between", value1, value2, "feixianjinzhehe7");
            return (Criteria) this;
        }

        public Criteria andHeji7IsNull() {
            addCriterion("HEJI7 is null");
            return (Criteria) this;
        }

        public Criteria andHeji7IsNotNull() {
            addCriterion("HEJI7 is not null");
            return (Criteria) this;
        }

        public Criteria andHeji7EqualTo(BigDecimal value) {
            addCriterion("HEJI7 =", value, "heji7");
            return (Criteria) this;
        }

        public Criteria andHeji7NotEqualTo(BigDecimal value) {
            addCriterion("HEJI7 <>", value, "heji7");
            return (Criteria) this;
        }

        public Criteria andHeji7GreaterThan(BigDecimal value) {
            addCriterion("HEJI7 >", value, "heji7");
            return (Criteria) this;
        }

        public Criteria andHeji7GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJI7 >=", value, "heji7");
            return (Criteria) this;
        }

        public Criteria andHeji7LessThan(BigDecimal value) {
            addCriterion("HEJI7 <", value, "heji7");
            return (Criteria) this;
        }

        public Criteria andHeji7LessThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJI7 <=", value, "heji7");
            return (Criteria) this;
        }

        public Criteria andHeji7In(List<BigDecimal> values) {
            addCriterion("HEJI7 in", values, "heji7");
            return (Criteria) this;
        }

        public Criteria andHeji7NotIn(List<BigDecimal> values) {
            addCriterion("HEJI7 not in", values, "heji7");
            return (Criteria) this;
        }

        public Criteria andHeji7Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJI7 between", value1, value2, "heji7");
            return (Criteria) this;
        }

        public Criteria andHeji7NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJI7 not between", value1, value2, "heji7");
            return (Criteria) this;
        }

        public Criteria andZhuyaoyongtuheshiyongqingkuangIsNull() {
            addCriterion("ZHUYAOYONGTUHESHIYONGQINGKUANG is null");
            return (Criteria) this;
        }

        public Criteria andZhuyaoyongtuheshiyongqingkuangIsNotNull() {
            addCriterion("ZHUYAOYONGTUHESHIYONGQINGKUANG is not null");
            return (Criteria) this;
        }

        public Criteria andZhuyaoyongtuheshiyongqingkuangEqualTo(String value) {
            addCriterion("ZHUYAOYONGTUHESHIYONGQINGKUANG =", value, "zhuyaoyongtuheshiyongqingkuang");
            return (Criteria) this;
        }

        public Criteria andZhuyaoyongtuheshiyongqingkuangNotEqualTo(String value) {
            addCriterion("ZHUYAOYONGTUHESHIYONGQINGKUANG <>", value, "zhuyaoyongtuheshiyongqingkuang");
            return (Criteria) this;
        }

        public Criteria andZhuyaoyongtuheshiyongqingkuangGreaterThan(String value) {
            addCriterion("ZHUYAOYONGTUHESHIYONGQINGKUANG >", value, "zhuyaoyongtuheshiyongqingkuang");
            return (Criteria) this;
        }

        public Criteria andZhuyaoyongtuheshiyongqingkuangGreaterThanOrEqualTo(String value) {
            addCriterion("ZHUYAOYONGTUHESHIYONGQINGKUANG >=", value, "zhuyaoyongtuheshiyongqingkuang");
            return (Criteria) this;
        }

        public Criteria andZhuyaoyongtuheshiyongqingkuangLessThan(String value) {
            addCriterion("ZHUYAOYONGTUHESHIYONGQINGKUANG <", value, "zhuyaoyongtuheshiyongqingkuang");
            return (Criteria) this;
        }

        public Criteria andZhuyaoyongtuheshiyongqingkuangLessThanOrEqualTo(String value) {
            addCriterion("ZHUYAOYONGTUHESHIYONGQINGKUANG <=", value, "zhuyaoyongtuheshiyongqingkuang");
            return (Criteria) this;
        }

        public Criteria andZhuyaoyongtuheshiyongqingkuangLike(String value) {
            addCriterion("ZHUYAOYONGTUHESHIYONGQINGKUANG like", value, "zhuyaoyongtuheshiyongqingkuang");
            return (Criteria) this;
        }

        public Criteria andZhuyaoyongtuheshiyongqingkuangNotLike(String value) {
            addCriterion("ZHUYAOYONGTUHESHIYONGQINGKUANG not like", value, "zhuyaoyongtuheshiyongqingkuang");
            return (Criteria) this;
        }

        public Criteria andZhuyaoyongtuheshiyongqingkuangIn(List<String> values) {
            addCriterion("ZHUYAOYONGTUHESHIYONGQINGKUANG in", values, "zhuyaoyongtuheshiyongqingkuang");
            return (Criteria) this;
        }

        public Criteria andZhuyaoyongtuheshiyongqingkuangNotIn(List<String> values) {
            addCriterion("ZHUYAOYONGTUHESHIYONGQINGKUANG not in", values, "zhuyaoyongtuheshiyongqingkuang");
            return (Criteria) this;
        }

        public Criteria andZhuyaoyongtuheshiyongqingkuangBetween(String value1, String value2) {
            addCriterion("ZHUYAOYONGTUHESHIYONGQINGKUANG between", value1, value2, "zhuyaoyongtuheshiyongqingkuang");
            return (Criteria) this;
        }

        public Criteria andZhuyaoyongtuheshiyongqingkuangNotBetween(String value1, String value2) {
            addCriterion("ZHUYAOYONGTUHESHIYONGQINGKUANG not between", value1, value2, "zhuyaoyongtuheshiyongqingkuang");
            return (Criteria) this;
        }

        public Criteria andShouru06IsNull() {
            addCriterion("SHOURU06 is null");
            return (Criteria) this;
        }

        public Criteria andShouru06IsNotNull() {
            addCriterion("SHOURU06 is not null");
            return (Criteria) this;
        }

        public Criteria andShouru06EqualTo(BigDecimal value) {
            addCriterion("SHOURU06 =", value, "shouru06");
            return (Criteria) this;
        }

        public Criteria andShouru06NotEqualTo(BigDecimal value) {
            addCriterion("SHOURU06 <>", value, "shouru06");
            return (Criteria) this;
        }

        public Criteria andShouru06GreaterThan(BigDecimal value) {
            addCriterion("SHOURU06 >", value, "shouru06");
            return (Criteria) this;
        }

        public Criteria andShouru06GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOURU06 >=", value, "shouru06");
            return (Criteria) this;
        }

        public Criteria andShouru06LessThan(BigDecimal value) {
            addCriterion("SHOURU06 <", value, "shouru06");
            return (Criteria) this;
        }

        public Criteria andShouru06LessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOURU06 <=", value, "shouru06");
            return (Criteria) this;
        }

        public Criteria andShouru06In(List<BigDecimal> values) {
            addCriterion("SHOURU06 in", values, "shouru06");
            return (Criteria) this;
        }

        public Criteria andShouru06NotIn(List<BigDecimal> values) {
            addCriterion("SHOURU06 not in", values, "shouru06");
            return (Criteria) this;
        }

        public Criteria andShouru06Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOURU06 between", value1, value2, "shouru06");
            return (Criteria) this;
        }

        public Criteria andShouru06NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOURU06 not between", value1, value2, "shouru06");
            return (Criteria) this;
        }

        public Criteria andShouru07IsNull() {
            addCriterion("SHOURU07 is null");
            return (Criteria) this;
        }

        public Criteria andShouru07IsNotNull() {
            addCriterion("SHOURU07 is not null");
            return (Criteria) this;
        }

        public Criteria andShouru07EqualTo(BigDecimal value) {
            addCriterion("SHOURU07 =", value, "shouru07");
            return (Criteria) this;
        }

        public Criteria andShouru07NotEqualTo(BigDecimal value) {
            addCriterion("SHOURU07 <>", value, "shouru07");
            return (Criteria) this;
        }

        public Criteria andShouru07GreaterThan(BigDecimal value) {
            addCriterion("SHOURU07 >", value, "shouru07");
            return (Criteria) this;
        }

        public Criteria andShouru07GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOURU07 >=", value, "shouru07");
            return (Criteria) this;
        }

        public Criteria andShouru07LessThan(BigDecimal value) {
            addCriterion("SHOURU07 <", value, "shouru07");
            return (Criteria) this;
        }

        public Criteria andShouru07LessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOURU07 <=", value, "shouru07");
            return (Criteria) this;
        }

        public Criteria andShouru07In(List<BigDecimal> values) {
            addCriterion("SHOURU07 in", values, "shouru07");
            return (Criteria) this;
        }

        public Criteria andShouru07NotIn(List<BigDecimal> values) {
            addCriterion("SHOURU07 not in", values, "shouru07");
            return (Criteria) this;
        }

        public Criteria andShouru07Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOURU07 between", value1, value2, "shouru07");
            return (Criteria) this;
        }

        public Criteria andShouru07NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOURU07 not between", value1, value2, "shouru07");
            return (Criteria) this;
        }

        public Criteria andShouru08IsNull() {
            addCriterion("SHOURU08 is null");
            return (Criteria) this;
        }

        public Criteria andShouru08IsNotNull() {
            addCriterion("SHOURU08 is not null");
            return (Criteria) this;
        }

        public Criteria andShouru08EqualTo(BigDecimal value) {
            addCriterion("SHOURU08 =", value, "shouru08");
            return (Criteria) this;
        }

        public Criteria andShouru08NotEqualTo(BigDecimal value) {
            addCriterion("SHOURU08 <>", value, "shouru08");
            return (Criteria) this;
        }

        public Criteria andShouru08GreaterThan(BigDecimal value) {
            addCriterion("SHOURU08 >", value, "shouru08");
            return (Criteria) this;
        }

        public Criteria andShouru08GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOURU08 >=", value, "shouru08");
            return (Criteria) this;
        }

        public Criteria andShouru08LessThan(BigDecimal value) {
            addCriterion("SHOURU08 <", value, "shouru08");
            return (Criteria) this;
        }

        public Criteria andShouru08LessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOURU08 <=", value, "shouru08");
            return (Criteria) this;
        }

        public Criteria andShouru08In(List<BigDecimal> values) {
            addCriterion("SHOURU08 in", values, "shouru08");
            return (Criteria) this;
        }

        public Criteria andShouru08NotIn(List<BigDecimal> values) {
            addCriterion("SHOURU08 not in", values, "shouru08");
            return (Criteria) this;
        }

        public Criteria andShouru08Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOURU08 between", value1, value2, "shouru08");
            return (Criteria) this;
        }

        public Criteria andShouru08NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOURU08 not between", value1, value2, "shouru08");
            return (Criteria) this;
        }

        public Criteria andZhichu06IsNull() {
            addCriterion("ZHICHU06 is null");
            return (Criteria) this;
        }

        public Criteria andZhichu06IsNotNull() {
            addCriterion("ZHICHU06 is not null");
            return (Criteria) this;
        }

        public Criteria andZhichu06EqualTo(BigDecimal value) {
            addCriterion("ZHICHU06 =", value, "zhichu06");
            return (Criteria) this;
        }

        public Criteria andZhichu06NotEqualTo(BigDecimal value) {
            addCriterion("ZHICHU06 <>", value, "zhichu06");
            return (Criteria) this;
        }

        public Criteria andZhichu06GreaterThan(BigDecimal value) {
            addCriterion("ZHICHU06 >", value, "zhichu06");
            return (Criteria) this;
        }

        public Criteria andZhichu06GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHICHU06 >=", value, "zhichu06");
            return (Criteria) this;
        }

        public Criteria andZhichu06LessThan(BigDecimal value) {
            addCriterion("ZHICHU06 <", value, "zhichu06");
            return (Criteria) this;
        }

        public Criteria andZhichu06LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHICHU06 <=", value, "zhichu06");
            return (Criteria) this;
        }

        public Criteria andZhichu06In(List<BigDecimal> values) {
            addCriterion("ZHICHU06 in", values, "zhichu06");
            return (Criteria) this;
        }

        public Criteria andZhichu06NotIn(List<BigDecimal> values) {
            addCriterion("ZHICHU06 not in", values, "zhichu06");
            return (Criteria) this;
        }

        public Criteria andZhichu06Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHICHU06 between", value1, value2, "zhichu06");
            return (Criteria) this;
        }

        public Criteria andZhichu06NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHICHU06 not between", value1, value2, "zhichu06");
            return (Criteria) this;
        }

        public Criteria andZhichu07IsNull() {
            addCriterion("ZHICHU07 is null");
            return (Criteria) this;
        }

        public Criteria andZhichu07IsNotNull() {
            addCriterion("ZHICHU07 is not null");
            return (Criteria) this;
        }

        public Criteria andZhichu07EqualTo(BigDecimal value) {
            addCriterion("ZHICHU07 =", value, "zhichu07");
            return (Criteria) this;
        }

        public Criteria andZhichu07NotEqualTo(BigDecimal value) {
            addCriterion("ZHICHU07 <>", value, "zhichu07");
            return (Criteria) this;
        }

        public Criteria andZhichu07GreaterThan(BigDecimal value) {
            addCriterion("ZHICHU07 >", value, "zhichu07");
            return (Criteria) this;
        }

        public Criteria andZhichu07GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHICHU07 >=", value, "zhichu07");
            return (Criteria) this;
        }

        public Criteria andZhichu07LessThan(BigDecimal value) {
            addCriterion("ZHICHU07 <", value, "zhichu07");
            return (Criteria) this;
        }

        public Criteria andZhichu07LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHICHU07 <=", value, "zhichu07");
            return (Criteria) this;
        }

        public Criteria andZhichu07In(List<BigDecimal> values) {
            addCriterion("ZHICHU07 in", values, "zhichu07");
            return (Criteria) this;
        }

        public Criteria andZhichu07NotIn(List<BigDecimal> values) {
            addCriterion("ZHICHU07 not in", values, "zhichu07");
            return (Criteria) this;
        }

        public Criteria andZhichu07Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHICHU07 between", value1, value2, "zhichu07");
            return (Criteria) this;
        }

        public Criteria andZhichu07NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHICHU07 not between", value1, value2, "zhichu07");
            return (Criteria) this;
        }

        public Criteria andZhichu08IsNull() {
            addCriterion("ZHICHU08 is null");
            return (Criteria) this;
        }

        public Criteria andZhichu08IsNotNull() {
            addCriterion("ZHICHU08 is not null");
            return (Criteria) this;
        }

        public Criteria andZhichu08EqualTo(BigDecimal value) {
            addCriterion("ZHICHU08 =", value, "zhichu08");
            return (Criteria) this;
        }

        public Criteria andZhichu08NotEqualTo(BigDecimal value) {
            addCriterion("ZHICHU08 <>", value, "zhichu08");
            return (Criteria) this;
        }

        public Criteria andZhichu08GreaterThan(BigDecimal value) {
            addCriterion("ZHICHU08 >", value, "zhichu08");
            return (Criteria) this;
        }

        public Criteria andZhichu08GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHICHU08 >=", value, "zhichu08");
            return (Criteria) this;
        }

        public Criteria andZhichu08LessThan(BigDecimal value) {
            addCriterion("ZHICHU08 <", value, "zhichu08");
            return (Criteria) this;
        }

        public Criteria andZhichu08LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHICHU08 <=", value, "zhichu08");
            return (Criteria) this;
        }

        public Criteria andZhichu08In(List<BigDecimal> values) {
            addCriterion("ZHICHU08 in", values, "zhichu08");
            return (Criteria) this;
        }

        public Criteria andZhichu08NotIn(List<BigDecimal> values) {
            addCriterion("ZHICHU08 not in", values, "zhichu08");
            return (Criteria) this;
        }

        public Criteria andZhichu08Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHICHU08 between", value1, value2, "zhichu08");
            return (Criteria) this;
        }

        public Criteria andZhichu08NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHICHU08 not between", value1, value2, "zhichu08");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu06IsNull() {
            addCriterion("GONGYIZHICHU06 is null");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu06IsNotNull() {
            addCriterion("GONGYIZHICHU06 is not null");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu06EqualTo(BigDecimal value) {
            addCriterion("GONGYIZHICHU06 =", value, "gongyizhichu06");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu06NotEqualTo(BigDecimal value) {
            addCriterion("GONGYIZHICHU06 <>", value, "gongyizhichu06");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu06GreaterThan(BigDecimal value) {
            addCriterion("GONGYIZHICHU06 >", value, "gongyizhichu06");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu06GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GONGYIZHICHU06 >=", value, "gongyizhichu06");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu06LessThan(BigDecimal value) {
            addCriterion("GONGYIZHICHU06 <", value, "gongyizhichu06");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu06LessThanOrEqualTo(BigDecimal value) {
            addCriterion("GONGYIZHICHU06 <=", value, "gongyizhichu06");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu06In(List<BigDecimal> values) {
            addCriterion("GONGYIZHICHU06 in", values, "gongyizhichu06");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu06NotIn(List<BigDecimal> values) {
            addCriterion("GONGYIZHICHU06 not in", values, "gongyizhichu06");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu06Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("GONGYIZHICHU06 between", value1, value2, "gongyizhichu06");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu06NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GONGYIZHICHU06 not between", value1, value2, "gongyizhichu06");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu07IsNull() {
            addCriterion("GONGYIZHICHU07 is null");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu07IsNotNull() {
            addCriterion("GONGYIZHICHU07 is not null");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu07EqualTo(BigDecimal value) {
            addCriterion("GONGYIZHICHU07 =", value, "gongyizhichu07");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu07NotEqualTo(BigDecimal value) {
            addCriterion("GONGYIZHICHU07 <>", value, "gongyizhichu07");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu07GreaterThan(BigDecimal value) {
            addCriterion("GONGYIZHICHU07 >", value, "gongyizhichu07");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu07GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GONGYIZHICHU07 >=", value, "gongyizhichu07");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu07LessThan(BigDecimal value) {
            addCriterion("GONGYIZHICHU07 <", value, "gongyizhichu07");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu07LessThanOrEqualTo(BigDecimal value) {
            addCriterion("GONGYIZHICHU07 <=", value, "gongyizhichu07");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu07In(List<BigDecimal> values) {
            addCriterion("GONGYIZHICHU07 in", values, "gongyizhichu07");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu07NotIn(List<BigDecimal> values) {
            addCriterion("GONGYIZHICHU07 not in", values, "gongyizhichu07");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu07Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("GONGYIZHICHU07 between", value1, value2, "gongyizhichu07");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu07NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GONGYIZHICHU07 not between", value1, value2, "gongyizhichu07");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu08IsNull() {
            addCriterion("GONGYIZHICHU08 is null");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu08IsNotNull() {
            addCriterion("GONGYIZHICHU08 is not null");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu08EqualTo(BigDecimal value) {
            addCriterion("GONGYIZHICHU08 =", value, "gongyizhichu08");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu08NotEqualTo(BigDecimal value) {
            addCriterion("GONGYIZHICHU08 <>", value, "gongyizhichu08");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu08GreaterThan(BigDecimal value) {
            addCriterion("GONGYIZHICHU08 >", value, "gongyizhichu08");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu08GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GONGYIZHICHU08 >=", value, "gongyizhichu08");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu08LessThan(BigDecimal value) {
            addCriterion("GONGYIZHICHU08 <", value, "gongyizhichu08");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu08LessThanOrEqualTo(BigDecimal value) {
            addCriterion("GONGYIZHICHU08 <=", value, "gongyizhichu08");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu08In(List<BigDecimal> values) {
            addCriterion("GONGYIZHICHU08 in", values, "gongyizhichu08");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu08NotIn(List<BigDecimal> values) {
            addCriterion("GONGYIZHICHU08 not in", values, "gongyizhichu08");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu08Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("GONGYIZHICHU08 between", value1, value2, "gongyizhichu08");
            return (Criteria) this;
        }

        public Criteria andGongyizhichu08NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GONGYIZHICHU08 not between", value1, value2, "gongyizhichu08");
            return (Criteria) this;
        }

        public Criteria andShangnianbili06IsNull() {
            addCriterion("SHANGNIANBILI06 is null");
            return (Criteria) this;
        }

        public Criteria andShangnianbili06IsNotNull() {
            addCriterion("SHANGNIANBILI06 is not null");
            return (Criteria) this;
        }

        public Criteria andShangnianbili06EqualTo(String value) {
            addCriterion("SHANGNIANBILI06 =", value, "shangnianbili06");
            return (Criteria) this;
        }

        public Criteria andShangnianbili06NotEqualTo(String value) {
            addCriterion("SHANGNIANBILI06 <>", value, "shangnianbili06");
            return (Criteria) this;
        }

        public Criteria andShangnianbili06GreaterThan(String value) {
            addCriterion("SHANGNIANBILI06 >", value, "shangnianbili06");
            return (Criteria) this;
        }

        public Criteria andShangnianbili06GreaterThanOrEqualTo(String value) {
            addCriterion("SHANGNIANBILI06 >=", value, "shangnianbili06");
            return (Criteria) this;
        }

        public Criteria andShangnianbili06LessThan(String value) {
            addCriterion("SHANGNIANBILI06 <", value, "shangnianbili06");
            return (Criteria) this;
        }

        public Criteria andShangnianbili06LessThanOrEqualTo(String value) {
            addCriterion("SHANGNIANBILI06 <=", value, "shangnianbili06");
            return (Criteria) this;
        }

        public Criteria andShangnianbili06Like(String value) {
            addCriterion("SHANGNIANBILI06 like", value, "shangnianbili06");
            return (Criteria) this;
        }

        public Criteria andShangnianbili06NotLike(String value) {
            addCriterion("SHANGNIANBILI06 not like", value, "shangnianbili06");
            return (Criteria) this;
        }

        public Criteria andShangnianbili06In(List<String> values) {
            addCriterion("SHANGNIANBILI06 in", values, "shangnianbili06");
            return (Criteria) this;
        }

        public Criteria andShangnianbili06NotIn(List<String> values) {
            addCriterion("SHANGNIANBILI06 not in", values, "shangnianbili06");
            return (Criteria) this;
        }

        public Criteria andShangnianbili06Between(String value1, String value2) {
            addCriterion("SHANGNIANBILI06 between", value1, value2, "shangnianbili06");
            return (Criteria) this;
        }

        public Criteria andShangnianbili06NotBetween(String value1, String value2) {
            addCriterion("SHANGNIANBILI06 not between", value1, value2, "shangnianbili06");
            return (Criteria) this;
        }

        public Criteria andShangnianbili07IsNull() {
            addCriterion("SHANGNIANBILI07 is null");
            return (Criteria) this;
        }

        public Criteria andShangnianbili07IsNotNull() {
            addCriterion("SHANGNIANBILI07 is not null");
            return (Criteria) this;
        }

        public Criteria andShangnianbili07EqualTo(String value) {
            addCriterion("SHANGNIANBILI07 =", value, "shangnianbili07");
            return (Criteria) this;
        }

        public Criteria andShangnianbili07NotEqualTo(String value) {
            addCriterion("SHANGNIANBILI07 <>", value, "shangnianbili07");
            return (Criteria) this;
        }

        public Criteria andShangnianbili07GreaterThan(String value) {
            addCriterion("SHANGNIANBILI07 >", value, "shangnianbili07");
            return (Criteria) this;
        }

        public Criteria andShangnianbili07GreaterThanOrEqualTo(String value) {
            addCriterion("SHANGNIANBILI07 >=", value, "shangnianbili07");
            return (Criteria) this;
        }

        public Criteria andShangnianbili07LessThan(String value) {
            addCriterion("SHANGNIANBILI07 <", value, "shangnianbili07");
            return (Criteria) this;
        }

        public Criteria andShangnianbili07LessThanOrEqualTo(String value) {
            addCriterion("SHANGNIANBILI07 <=", value, "shangnianbili07");
            return (Criteria) this;
        }

        public Criteria andShangnianbili07Like(String value) {
            addCriterion("SHANGNIANBILI07 like", value, "shangnianbili07");
            return (Criteria) this;
        }

        public Criteria andShangnianbili07NotLike(String value) {
            addCriterion("SHANGNIANBILI07 not like", value, "shangnianbili07");
            return (Criteria) this;
        }

        public Criteria andShangnianbili07In(List<String> values) {
            addCriterion("SHANGNIANBILI07 in", values, "shangnianbili07");
            return (Criteria) this;
        }

        public Criteria andShangnianbili07NotIn(List<String> values) {
            addCriterion("SHANGNIANBILI07 not in", values, "shangnianbili07");
            return (Criteria) this;
        }

        public Criteria andShangnianbili07Between(String value1, String value2) {
            addCriterion("SHANGNIANBILI07 between", value1, value2, "shangnianbili07");
            return (Criteria) this;
        }

        public Criteria andShangnianbili07NotBetween(String value1, String value2) {
            addCriterion("SHANGNIANBILI07 not between", value1, value2, "shangnianbili07");
            return (Criteria) this;
        }

        public Criteria andShangnianbili08IsNull() {
            addCriterion("SHANGNIANBILI08 is null");
            return (Criteria) this;
        }

        public Criteria andShangnianbili08IsNotNull() {
            addCriterion("SHANGNIANBILI08 is not null");
            return (Criteria) this;
        }

        public Criteria andShangnianbili08EqualTo(String value) {
            addCriterion("SHANGNIANBILI08 =", value, "shangnianbili08");
            return (Criteria) this;
        }

        public Criteria andShangnianbili08NotEqualTo(String value) {
            addCriterion("SHANGNIANBILI08 <>", value, "shangnianbili08");
            return (Criteria) this;
        }

        public Criteria andShangnianbili08GreaterThan(String value) {
            addCriterion("SHANGNIANBILI08 >", value, "shangnianbili08");
            return (Criteria) this;
        }

        public Criteria andShangnianbili08GreaterThanOrEqualTo(String value) {
            addCriterion("SHANGNIANBILI08 >=", value, "shangnianbili08");
            return (Criteria) this;
        }

        public Criteria andShangnianbili08LessThan(String value) {
            addCriterion("SHANGNIANBILI08 <", value, "shangnianbili08");
            return (Criteria) this;
        }

        public Criteria andShangnianbili08LessThanOrEqualTo(String value) {
            addCriterion("SHANGNIANBILI08 <=", value, "shangnianbili08");
            return (Criteria) this;
        }

        public Criteria andShangnianbili08Like(String value) {
            addCriterion("SHANGNIANBILI08 like", value, "shangnianbili08");
            return (Criteria) this;
        }

        public Criteria andShangnianbili08NotLike(String value) {
            addCriterion("SHANGNIANBILI08 not like", value, "shangnianbili08");
            return (Criteria) this;
        }

        public Criteria andShangnianbili08In(List<String> values) {
            addCriterion("SHANGNIANBILI08 in", values, "shangnianbili08");
            return (Criteria) this;
        }

        public Criteria andShangnianbili08NotIn(List<String> values) {
            addCriterion("SHANGNIANBILI08 not in", values, "shangnianbili08");
            return (Criteria) this;
        }

        public Criteria andShangnianbili08Between(String value1, String value2) {
            addCriterion("SHANGNIANBILI08 between", value1, value2, "shangnianbili08");
            return (Criteria) this;
        }

        public Criteria andShangnianbili08NotBetween(String value1, String value2) {
            addCriterion("SHANGNIANBILI08 not between", value1, value2, "shangnianbili08");
            return (Criteria) this;
        }

        public Criteria andBennianbili06IsNull() {
            addCriterion("BENNIANBILI06 is null");
            return (Criteria) this;
        }

        public Criteria andBennianbili06IsNotNull() {
            addCriterion("BENNIANBILI06 is not null");
            return (Criteria) this;
        }

        public Criteria andBennianbili06EqualTo(String value) {
            addCriterion("BENNIANBILI06 =", value, "bennianbili06");
            return (Criteria) this;
        }

        public Criteria andBennianbili06NotEqualTo(String value) {
            addCriterion("BENNIANBILI06 <>", value, "bennianbili06");
            return (Criteria) this;
        }

        public Criteria andBennianbili06GreaterThan(String value) {
            addCriterion("BENNIANBILI06 >", value, "bennianbili06");
            return (Criteria) this;
        }

        public Criteria andBennianbili06GreaterThanOrEqualTo(String value) {
            addCriterion("BENNIANBILI06 >=", value, "bennianbili06");
            return (Criteria) this;
        }

        public Criteria andBennianbili06LessThan(String value) {
            addCriterion("BENNIANBILI06 <", value, "bennianbili06");
            return (Criteria) this;
        }

        public Criteria andBennianbili06LessThanOrEqualTo(String value) {
            addCriterion("BENNIANBILI06 <=", value, "bennianbili06");
            return (Criteria) this;
        }

        public Criteria andBennianbili06Like(String value) {
            addCriterion("BENNIANBILI06 like", value, "bennianbili06");
            return (Criteria) this;
        }

        public Criteria andBennianbili06NotLike(String value) {
            addCriterion("BENNIANBILI06 not like", value, "bennianbili06");
            return (Criteria) this;
        }

        public Criteria andBennianbili06In(List<String> values) {
            addCriterion("BENNIANBILI06 in", values, "bennianbili06");
            return (Criteria) this;
        }

        public Criteria andBennianbili06NotIn(List<String> values) {
            addCriterion("BENNIANBILI06 not in", values, "bennianbili06");
            return (Criteria) this;
        }

        public Criteria andBennianbili06Between(String value1, String value2) {
            addCriterion("BENNIANBILI06 between", value1, value2, "bennianbili06");
            return (Criteria) this;
        }

        public Criteria andBennianbili06NotBetween(String value1, String value2) {
            addCriterion("BENNIANBILI06 not between", value1, value2, "bennianbili06");
            return (Criteria) this;
        }

        public Criteria andBennianbili07IsNull() {
            addCriterion("BENNIANBILI07 is null");
            return (Criteria) this;
        }

        public Criteria andBennianbili07IsNotNull() {
            addCriterion("BENNIANBILI07 is not null");
            return (Criteria) this;
        }

        public Criteria andBennianbili07EqualTo(String value) {
            addCriterion("BENNIANBILI07 =", value, "bennianbili07");
            return (Criteria) this;
        }

        public Criteria andBennianbili07NotEqualTo(String value) {
            addCriterion("BENNIANBILI07 <>", value, "bennianbili07");
            return (Criteria) this;
        }

        public Criteria andBennianbili07GreaterThan(String value) {
            addCriterion("BENNIANBILI07 >", value, "bennianbili07");
            return (Criteria) this;
        }

        public Criteria andBennianbili07GreaterThanOrEqualTo(String value) {
            addCriterion("BENNIANBILI07 >=", value, "bennianbili07");
            return (Criteria) this;
        }

        public Criteria andBennianbili07LessThan(String value) {
            addCriterion("BENNIANBILI07 <", value, "bennianbili07");
            return (Criteria) this;
        }

        public Criteria andBennianbili07LessThanOrEqualTo(String value) {
            addCriterion("BENNIANBILI07 <=", value, "bennianbili07");
            return (Criteria) this;
        }

        public Criteria andBennianbili07Like(String value) {
            addCriterion("BENNIANBILI07 like", value, "bennianbili07");
            return (Criteria) this;
        }

        public Criteria andBennianbili07NotLike(String value) {
            addCriterion("BENNIANBILI07 not like", value, "bennianbili07");
            return (Criteria) this;
        }

        public Criteria andBennianbili07In(List<String> values) {
            addCriterion("BENNIANBILI07 in", values, "bennianbili07");
            return (Criteria) this;
        }

        public Criteria andBennianbili07NotIn(List<String> values) {
            addCriterion("BENNIANBILI07 not in", values, "bennianbili07");
            return (Criteria) this;
        }

        public Criteria andBennianbili07Between(String value1, String value2) {
            addCriterion("BENNIANBILI07 between", value1, value2, "bennianbili07");
            return (Criteria) this;
        }

        public Criteria andBennianbili07NotBetween(String value1, String value2) {
            addCriterion("BENNIANBILI07 not between", value1, value2, "bennianbili07");
            return (Criteria) this;
        }

        public Criteria andBennianbili08IsNull() {
            addCriterion("BENNIANBILI08 is null");
            return (Criteria) this;
        }

        public Criteria andBennianbili08IsNotNull() {
            addCriterion("BENNIANBILI08 is not null");
            return (Criteria) this;
        }

        public Criteria andBennianbili08EqualTo(String value) {
            addCriterion("BENNIANBILI08 =", value, "bennianbili08");
            return (Criteria) this;
        }

        public Criteria andBennianbili08NotEqualTo(String value) {
            addCriterion("BENNIANBILI08 <>", value, "bennianbili08");
            return (Criteria) this;
        }

        public Criteria andBennianbili08GreaterThan(String value) {
            addCriterion("BENNIANBILI08 >", value, "bennianbili08");
            return (Criteria) this;
        }

        public Criteria andBennianbili08GreaterThanOrEqualTo(String value) {
            addCriterion("BENNIANBILI08 >=", value, "bennianbili08");
            return (Criteria) this;
        }

        public Criteria andBennianbili08LessThan(String value) {
            addCriterion("BENNIANBILI08 <", value, "bennianbili08");
            return (Criteria) this;
        }

        public Criteria andBennianbili08LessThanOrEqualTo(String value) {
            addCriterion("BENNIANBILI08 <=", value, "bennianbili08");
            return (Criteria) this;
        }

        public Criteria andBennianbili08Like(String value) {
            addCriterion("BENNIANBILI08 like", value, "bennianbili08");
            return (Criteria) this;
        }

        public Criteria andBennianbili08NotLike(String value) {
            addCriterion("BENNIANBILI08 not like", value, "bennianbili08");
            return (Criteria) this;
        }

        public Criteria andBennianbili08In(List<String> values) {
            addCriterion("BENNIANBILI08 in", values, "bennianbili08");
            return (Criteria) this;
        }

        public Criteria andBennianbili08NotIn(List<String> values) {
            addCriterion("BENNIANBILI08 not in", values, "bennianbili08");
            return (Criteria) this;
        }

        public Criteria andBennianbili08Between(String value1, String value2) {
            addCriterion("BENNIANBILI08 between", value1, value2, "bennianbili08");
            return (Criteria) this;
        }

        public Criteria andBennianbili08NotBetween(String value1, String value2) {
            addCriterion("BENNIANBILI08 not between", value1, value2, "bennianbili08");
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

        public Criteria andJuanzenghetongIsNull() {
            addCriterion("JUANZENGHETONG is null");
            return (Criteria) this;
        }

        public Criteria andJuanzenghetongIsNotNull() {
            addCriterion("JUANZENGHETONG is not null");
            return (Criteria) this;
        }

        public Criteria andJuanzenghetongEqualTo(String value) {
            addCriterion("JUANZENGHETONG =", value, "juanzenghetong");
            return (Criteria) this;
        }

        public Criteria andJuanzenghetongNotEqualTo(String value) {
            addCriterion("JUANZENGHETONG <>", value, "juanzenghetong");
            return (Criteria) this;
        }

        public Criteria andJuanzenghetongGreaterThan(String value) {
            addCriterion("JUANZENGHETONG >", value, "juanzenghetong");
            return (Criteria) this;
        }

        public Criteria andJuanzenghetongGreaterThanOrEqualTo(String value) {
            addCriterion("JUANZENGHETONG >=", value, "juanzenghetong");
            return (Criteria) this;
        }

        public Criteria andJuanzenghetongLessThan(String value) {
            addCriterion("JUANZENGHETONG <", value, "juanzenghetong");
            return (Criteria) this;
        }

        public Criteria andJuanzenghetongLessThanOrEqualTo(String value) {
            addCriterion("JUANZENGHETONG <=", value, "juanzenghetong");
            return (Criteria) this;
        }

        public Criteria andJuanzenghetongLike(String value) {
            addCriterion("JUANZENGHETONG like", value, "juanzenghetong");
            return (Criteria) this;
        }

        public Criteria andJuanzenghetongNotLike(String value) {
            addCriterion("JUANZENGHETONG not like", value, "juanzenghetong");
            return (Criteria) this;
        }

        public Criteria andJuanzenghetongIn(List<String> values) {
            addCriterion("JUANZENGHETONG in", values, "juanzenghetong");
            return (Criteria) this;
        }

        public Criteria andJuanzenghetongNotIn(List<String> values) {
            addCriterion("JUANZENGHETONG not in", values, "juanzenghetong");
            return (Criteria) this;
        }

        public Criteria andJuanzenghetongBetween(String value1, String value2) {
            addCriterion("JUANZENGHETONG between", value1, value2, "juanzenghetong");
            return (Criteria) this;
        }

        public Criteria andJuanzenghetongNotBetween(String value1, String value2) {
            addCriterion("JUANZENGHETONG not between", value1, value2, "juanzenghetong");
            return (Criteria) this;
        }

        public Criteria andJuanzengshuIsNull() {
            addCriterion("JUANZENGSHU is null");
            return (Criteria) this;
        }

        public Criteria andJuanzengshuIsNotNull() {
            addCriterion("JUANZENGSHU is not null");
            return (Criteria) this;
        }

        public Criteria andJuanzengshuEqualTo(Long value) {
            addCriterion("JUANZENGSHU =", value, "juanzengshu");
            return (Criteria) this;
        }

        public Criteria andJuanzengshuNotEqualTo(Long value) {
            addCriterion("JUANZENGSHU <>", value, "juanzengshu");
            return (Criteria) this;
        }

        public Criteria andJuanzengshuGreaterThan(Long value) {
            addCriterion("JUANZENGSHU >", value, "juanzengshu");
            return (Criteria) this;
        }

        public Criteria andJuanzengshuGreaterThanOrEqualTo(Long value) {
            addCriterion("JUANZENGSHU >=", value, "juanzengshu");
            return (Criteria) this;
        }

        public Criteria andJuanzengshuLessThan(Long value) {
            addCriterion("JUANZENGSHU <", value, "juanzengshu");
            return (Criteria) this;
        }

        public Criteria andJuanzengshuLessThanOrEqualTo(Long value) {
            addCriterion("JUANZENGSHU <=", value, "juanzengshu");
            return (Criteria) this;
        }

        public Criteria andJuanzengshuIn(List<Long> values) {
            addCriterion("JUANZENGSHU in", values, "juanzengshu");
            return (Criteria) this;
        }

        public Criteria andJuanzengshuNotIn(List<Long> values) {
            addCriterion("JUANZENGSHU not in", values, "juanzengshu");
            return (Criteria) this;
        }

        public Criteria andJuanzengshuBetween(Long value1, Long value2) {
            addCriterion("JUANZENGSHU between", value1, value2, "juanzengshu");
            return (Criteria) this;
        }

        public Criteria andJuanzengshuNotBetween(Long value1, Long value2) {
            addCriterion("JUANZENGSHU not between", value1, value2, "juanzengshu");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangIsNull() {
            addCriterion("WUCIQINGKUANG is null");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangIsNotNull() {
            addCriterion("WUCIQINGKUANG is not null");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangEqualTo(String value) {
            addCriterion("WUCIQINGKUANG =", value, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangNotEqualTo(String value) {
            addCriterion("WUCIQINGKUANG <>", value, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangGreaterThan(String value) {
            addCriterion("WUCIQINGKUANG >", value, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangGreaterThanOrEqualTo(String value) {
            addCriterion("WUCIQINGKUANG >=", value, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangLessThan(String value) {
            addCriterion("WUCIQINGKUANG <", value, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangLessThanOrEqualTo(String value) {
            addCriterion("WUCIQINGKUANG <=", value, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangLike(String value) {
            addCriterion("WUCIQINGKUANG like", value, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangNotLike(String value) {
            addCriterion("WUCIQINGKUANG not like", value, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangIn(List<String> values) {
            addCriterion("WUCIQINGKUANG in", values, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangNotIn(List<String> values) {
            addCriterion("WUCIQINGKUANG not in", values, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangBetween(String value1, String value2) {
            addCriterion("WUCIQINGKUANG between", value1, value2, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangNotBetween(String value1, String value2) {
            addCriterion("WUCIQINGKUANG not between", value1, value2, "wuciqingkuang");
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