package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JjhnjReport2Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JjhnjReport2Example() {
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

        public Criteria andZhehe1IsNull() {
            addCriterion("ZHEHE1 is null");
            return (Criteria) this;
        }

        public Criteria andZhehe1IsNotNull() {
            addCriterion("ZHEHE1 is not null");
            return (Criteria) this;
        }

        public Criteria andZhehe1EqualTo(BigDecimal value) {
            addCriterion("ZHEHE1 =", value, "zhehe1");
            return (Criteria) this;
        }

        public Criteria andZhehe1NotEqualTo(BigDecimal value) {
            addCriterion("ZHEHE1 <>", value, "zhehe1");
            return (Criteria) this;
        }

        public Criteria andZhehe1GreaterThan(BigDecimal value) {
            addCriterion("ZHEHE1 >", value, "zhehe1");
            return (Criteria) this;
        }

        public Criteria andZhehe1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHEHE1 >=", value, "zhehe1");
            return (Criteria) this;
        }

        public Criteria andZhehe1LessThan(BigDecimal value) {
            addCriterion("ZHEHE1 <", value, "zhehe1");
            return (Criteria) this;
        }

        public Criteria andZhehe1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHEHE1 <=", value, "zhehe1");
            return (Criteria) this;
        }

        public Criteria andZhehe1In(List<BigDecimal> values) {
            addCriterion("ZHEHE1 in", values, "zhehe1");
            return (Criteria) this;
        }

        public Criteria andZhehe1NotIn(List<BigDecimal> values) {
            addCriterion("ZHEHE1 not in", values, "zhehe1");
            return (Criteria) this;
        }

        public Criteria andZhehe1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHEHE1 between", value1, value2, "zhehe1");
            return (Criteria) this;
        }

        public Criteria andZhehe1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHEHE1 not between", value1, value2, "zhehe1");
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

        public Criteria andZhehe2IsNull() {
            addCriterion("ZHEHE2 is null");
            return (Criteria) this;
        }

        public Criteria andZhehe2IsNotNull() {
            addCriterion("ZHEHE2 is not null");
            return (Criteria) this;
        }

        public Criteria andZhehe2EqualTo(BigDecimal value) {
            addCriterion("ZHEHE2 =", value, "zhehe2");
            return (Criteria) this;
        }

        public Criteria andZhehe2NotEqualTo(BigDecimal value) {
            addCriterion("ZHEHE2 <>", value, "zhehe2");
            return (Criteria) this;
        }

        public Criteria andZhehe2GreaterThan(BigDecimal value) {
            addCriterion("ZHEHE2 >", value, "zhehe2");
            return (Criteria) this;
        }

        public Criteria andZhehe2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHEHE2 >=", value, "zhehe2");
            return (Criteria) this;
        }

        public Criteria andZhehe2LessThan(BigDecimal value) {
            addCriterion("ZHEHE2 <", value, "zhehe2");
            return (Criteria) this;
        }

        public Criteria andZhehe2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHEHE2 <=", value, "zhehe2");
            return (Criteria) this;
        }

        public Criteria andZhehe2In(List<BigDecimal> values) {
            addCriterion("ZHEHE2 in", values, "zhehe2");
            return (Criteria) this;
        }

        public Criteria andZhehe2NotIn(List<BigDecimal> values) {
            addCriterion("ZHEHE2 not in", values, "zhehe2");
            return (Criteria) this;
        }

        public Criteria andZhehe2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHEHE2 between", value1, value2, "zhehe2");
            return (Criteria) this;
        }

        public Criteria andZhehe2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHEHE2 not between", value1, value2, "zhehe2");
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

        public Criteria andZhehe3IsNull() {
            addCriterion("ZHEHE3 is null");
            return (Criteria) this;
        }

        public Criteria andZhehe3IsNotNull() {
            addCriterion("ZHEHE3 is not null");
            return (Criteria) this;
        }

        public Criteria andZhehe3EqualTo(BigDecimal value) {
            addCriterion("ZHEHE3 =", value, "zhehe3");
            return (Criteria) this;
        }

        public Criteria andZhehe3NotEqualTo(BigDecimal value) {
            addCriterion("ZHEHE3 <>", value, "zhehe3");
            return (Criteria) this;
        }

        public Criteria andZhehe3GreaterThan(BigDecimal value) {
            addCriterion("ZHEHE3 >", value, "zhehe3");
            return (Criteria) this;
        }

        public Criteria andZhehe3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHEHE3 >=", value, "zhehe3");
            return (Criteria) this;
        }

        public Criteria andZhehe3LessThan(BigDecimal value) {
            addCriterion("ZHEHE3 <", value, "zhehe3");
            return (Criteria) this;
        }

        public Criteria andZhehe3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHEHE3 <=", value, "zhehe3");
            return (Criteria) this;
        }

        public Criteria andZhehe3In(List<BigDecimal> values) {
            addCriterion("ZHEHE3 in", values, "zhehe3");
            return (Criteria) this;
        }

        public Criteria andZhehe3NotIn(List<BigDecimal> values) {
            addCriterion("ZHEHE3 not in", values, "zhehe3");
            return (Criteria) this;
        }

        public Criteria andZhehe3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHEHE3 between", value1, value2, "zhehe3");
            return (Criteria) this;
        }

        public Criteria andZhehe3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHEHE3 not between", value1, value2, "zhehe3");
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

        public Criteria andZhehe4IsNull() {
            addCriterion("ZHEHE4 is null");
            return (Criteria) this;
        }

        public Criteria andZhehe4IsNotNull() {
            addCriterion("ZHEHE4 is not null");
            return (Criteria) this;
        }

        public Criteria andZhehe4EqualTo(BigDecimal value) {
            addCriterion("ZHEHE4 =", value, "zhehe4");
            return (Criteria) this;
        }

        public Criteria andZhehe4NotEqualTo(BigDecimal value) {
            addCriterion("ZHEHE4 <>", value, "zhehe4");
            return (Criteria) this;
        }

        public Criteria andZhehe4GreaterThan(BigDecimal value) {
            addCriterion("ZHEHE4 >", value, "zhehe4");
            return (Criteria) this;
        }

        public Criteria andZhehe4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHEHE4 >=", value, "zhehe4");
            return (Criteria) this;
        }

        public Criteria andZhehe4LessThan(BigDecimal value) {
            addCriterion("ZHEHE4 <", value, "zhehe4");
            return (Criteria) this;
        }

        public Criteria andZhehe4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHEHE4 <=", value, "zhehe4");
            return (Criteria) this;
        }

        public Criteria andZhehe4In(List<BigDecimal> values) {
            addCriterion("ZHEHE4 in", values, "zhehe4");
            return (Criteria) this;
        }

        public Criteria andZhehe4NotIn(List<BigDecimal> values) {
            addCriterion("ZHEHE4 not in", values, "zhehe4");
            return (Criteria) this;
        }

        public Criteria andZhehe4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHEHE4 between", value1, value2, "zhehe4");
            return (Criteria) this;
        }

        public Criteria andZhehe4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHEHE4 not between", value1, value2, "zhehe4");
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

        public Criteria andZhehe5IsNull() {
            addCriterion("ZHEHE5 is null");
            return (Criteria) this;
        }

        public Criteria andZhehe5IsNotNull() {
            addCriterion("ZHEHE5 is not null");
            return (Criteria) this;
        }

        public Criteria andZhehe5EqualTo(BigDecimal value) {
            addCriterion("ZHEHE5 =", value, "zhehe5");
            return (Criteria) this;
        }

        public Criteria andZhehe5NotEqualTo(BigDecimal value) {
            addCriterion("ZHEHE5 <>", value, "zhehe5");
            return (Criteria) this;
        }

        public Criteria andZhehe5GreaterThan(BigDecimal value) {
            addCriterion("ZHEHE5 >", value, "zhehe5");
            return (Criteria) this;
        }

        public Criteria andZhehe5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHEHE5 >=", value, "zhehe5");
            return (Criteria) this;
        }

        public Criteria andZhehe5LessThan(BigDecimal value) {
            addCriterion("ZHEHE5 <", value, "zhehe5");
            return (Criteria) this;
        }

        public Criteria andZhehe5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHEHE5 <=", value, "zhehe5");
            return (Criteria) this;
        }

        public Criteria andZhehe5In(List<BigDecimal> values) {
            addCriterion("ZHEHE5 in", values, "zhehe5");
            return (Criteria) this;
        }

        public Criteria andZhehe5NotIn(List<BigDecimal> values) {
            addCriterion("ZHEHE5 not in", values, "zhehe5");
            return (Criteria) this;
        }

        public Criteria andZhehe5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHEHE5 between", value1, value2, "zhehe5");
            return (Criteria) this;
        }

        public Criteria andZhehe5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHEHE5 not between", value1, value2, "zhehe5");
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

        public Criteria andZhehe6IsNull() {
            addCriterion("ZHEHE6 is null");
            return (Criteria) this;
        }

        public Criteria andZhehe6IsNotNull() {
            addCriterion("ZHEHE6 is not null");
            return (Criteria) this;
        }

        public Criteria andZhehe6EqualTo(BigDecimal value) {
            addCriterion("ZHEHE6 =", value, "zhehe6");
            return (Criteria) this;
        }

        public Criteria andZhehe6NotEqualTo(BigDecimal value) {
            addCriterion("ZHEHE6 <>", value, "zhehe6");
            return (Criteria) this;
        }

        public Criteria andZhehe6GreaterThan(BigDecimal value) {
            addCriterion("ZHEHE6 >", value, "zhehe6");
            return (Criteria) this;
        }

        public Criteria andZhehe6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHEHE6 >=", value, "zhehe6");
            return (Criteria) this;
        }

        public Criteria andZhehe6LessThan(BigDecimal value) {
            addCriterion("ZHEHE6 <", value, "zhehe6");
            return (Criteria) this;
        }

        public Criteria andZhehe6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHEHE6 <=", value, "zhehe6");
            return (Criteria) this;
        }

        public Criteria andZhehe6In(List<BigDecimal> values) {
            addCriterion("ZHEHE6 in", values, "zhehe6");
            return (Criteria) this;
        }

        public Criteria andZhehe6NotIn(List<BigDecimal> values) {
            addCriterion("ZHEHE6 not in", values, "zhehe6");
            return (Criteria) this;
        }

        public Criteria andZhehe6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHEHE6 between", value1, value2, "zhehe6");
            return (Criteria) this;
        }

        public Criteria andZhehe6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHEHE6 not between", value1, value2, "zhehe6");
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

        public Criteria andZhehe7IsNull() {
            addCriterion("ZHEHE7 is null");
            return (Criteria) this;
        }

        public Criteria andZhehe7IsNotNull() {
            addCriterion("ZHEHE7 is not null");
            return (Criteria) this;
        }

        public Criteria andZhehe7EqualTo(BigDecimal value) {
            addCriterion("ZHEHE7 =", value, "zhehe7");
            return (Criteria) this;
        }

        public Criteria andZhehe7NotEqualTo(BigDecimal value) {
            addCriterion("ZHEHE7 <>", value, "zhehe7");
            return (Criteria) this;
        }

        public Criteria andZhehe7GreaterThan(BigDecimal value) {
            addCriterion("ZHEHE7 >", value, "zhehe7");
            return (Criteria) this;
        }

        public Criteria andZhehe7GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHEHE7 >=", value, "zhehe7");
            return (Criteria) this;
        }

        public Criteria andZhehe7LessThan(BigDecimal value) {
            addCriterion("ZHEHE7 <", value, "zhehe7");
            return (Criteria) this;
        }

        public Criteria andZhehe7LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHEHE7 <=", value, "zhehe7");
            return (Criteria) this;
        }

        public Criteria andZhehe7In(List<BigDecimal> values) {
            addCriterion("ZHEHE7 in", values, "zhehe7");
            return (Criteria) this;
        }

        public Criteria andZhehe7NotIn(List<BigDecimal> values) {
            addCriterion("ZHEHE7 not in", values, "zhehe7");
            return (Criteria) this;
        }

        public Criteria andZhehe7Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHEHE7 between", value1, value2, "zhehe7");
            return (Criteria) this;
        }

        public Criteria andZhehe7NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHEHE7 not between", value1, value2, "zhehe7");
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

        public Criteria andXianjin8IsNull() {
            addCriterion("XIANJIN8 is null");
            return (Criteria) this;
        }

        public Criteria andXianjin8IsNotNull() {
            addCriterion("XIANJIN8 is not null");
            return (Criteria) this;
        }

        public Criteria andXianjin8EqualTo(BigDecimal value) {
            addCriterion("XIANJIN8 =", value, "xianjin8");
            return (Criteria) this;
        }

        public Criteria andXianjin8NotEqualTo(BigDecimal value) {
            addCriterion("XIANJIN8 <>", value, "xianjin8");
            return (Criteria) this;
        }

        public Criteria andXianjin8GreaterThan(BigDecimal value) {
            addCriterion("XIANJIN8 >", value, "xianjin8");
            return (Criteria) this;
        }

        public Criteria andXianjin8GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJIN8 >=", value, "xianjin8");
            return (Criteria) this;
        }

        public Criteria andXianjin8LessThan(BigDecimal value) {
            addCriterion("XIANJIN8 <", value, "xianjin8");
            return (Criteria) this;
        }

        public Criteria andXianjin8LessThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJIN8 <=", value, "xianjin8");
            return (Criteria) this;
        }

        public Criteria andXianjin8In(List<BigDecimal> values) {
            addCriterion("XIANJIN8 in", values, "xianjin8");
            return (Criteria) this;
        }

        public Criteria andXianjin8NotIn(List<BigDecimal> values) {
            addCriterion("XIANJIN8 not in", values, "xianjin8");
            return (Criteria) this;
        }

        public Criteria andXianjin8Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJIN8 between", value1, value2, "xianjin8");
            return (Criteria) this;
        }

        public Criteria andXianjin8NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJIN8 not between", value1, value2, "xianjin8");
            return (Criteria) this;
        }

        public Criteria andZhehe8IsNull() {
            addCriterion("ZHEHE8 is null");
            return (Criteria) this;
        }

        public Criteria andZhehe8IsNotNull() {
            addCriterion("ZHEHE8 is not null");
            return (Criteria) this;
        }

        public Criteria andZhehe8EqualTo(BigDecimal value) {
            addCriterion("ZHEHE8 =", value, "zhehe8");
            return (Criteria) this;
        }

        public Criteria andZhehe8NotEqualTo(BigDecimal value) {
            addCriterion("ZHEHE8 <>", value, "zhehe8");
            return (Criteria) this;
        }

        public Criteria andZhehe8GreaterThan(BigDecimal value) {
            addCriterion("ZHEHE8 >", value, "zhehe8");
            return (Criteria) this;
        }

        public Criteria andZhehe8GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHEHE8 >=", value, "zhehe8");
            return (Criteria) this;
        }

        public Criteria andZhehe8LessThan(BigDecimal value) {
            addCriterion("ZHEHE8 <", value, "zhehe8");
            return (Criteria) this;
        }

        public Criteria andZhehe8LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHEHE8 <=", value, "zhehe8");
            return (Criteria) this;
        }

        public Criteria andZhehe8In(List<BigDecimal> values) {
            addCriterion("ZHEHE8 in", values, "zhehe8");
            return (Criteria) this;
        }

        public Criteria andZhehe8NotIn(List<BigDecimal> values) {
            addCriterion("ZHEHE8 not in", values, "zhehe8");
            return (Criteria) this;
        }

        public Criteria andZhehe8Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHEHE8 between", value1, value2, "zhehe8");
            return (Criteria) this;
        }

        public Criteria andZhehe8NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHEHE8 not between", value1, value2, "zhehe8");
            return (Criteria) this;
        }

        public Criteria andHeji8IsNull() {
            addCriterion("HEJI8 is null");
            return (Criteria) this;
        }

        public Criteria andHeji8IsNotNull() {
            addCriterion("HEJI8 is not null");
            return (Criteria) this;
        }

        public Criteria andHeji8EqualTo(BigDecimal value) {
            addCriterion("HEJI8 =", value, "heji8");
            return (Criteria) this;
        }

        public Criteria andHeji8NotEqualTo(BigDecimal value) {
            addCriterion("HEJI8 <>", value, "heji8");
            return (Criteria) this;
        }

        public Criteria andHeji8GreaterThan(BigDecimal value) {
            addCriterion("HEJI8 >", value, "heji8");
            return (Criteria) this;
        }

        public Criteria andHeji8GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJI8 >=", value, "heji8");
            return (Criteria) this;
        }

        public Criteria andHeji8LessThan(BigDecimal value) {
            addCriterion("HEJI8 <", value, "heji8");
            return (Criteria) this;
        }

        public Criteria andHeji8LessThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJI8 <=", value, "heji8");
            return (Criteria) this;
        }

        public Criteria andHeji8In(List<BigDecimal> values) {
            addCriterion("HEJI8 in", values, "heji8");
            return (Criteria) this;
        }

        public Criteria andHeji8NotIn(List<BigDecimal> values) {
            addCriterion("HEJI8 not in", values, "heji8");
            return (Criteria) this;
        }

        public Criteria andHeji8Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJI8 between", value1, value2, "heji8");
            return (Criteria) this;
        }

        public Criteria andHeji8NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJI8 not between", value1, value2, "heji8");
            return (Criteria) this;
        }

        public Criteria andHuodongxiangshuIsNull() {
            addCriterion("HUODONGXIANGSHU is null");
            return (Criteria) this;
        }

        public Criteria andHuodongxiangshuIsNotNull() {
            addCriterion("HUODONGXIANGSHU is not null");
            return (Criteria) this;
        }

        public Criteria andHuodongxiangshuEqualTo(Integer value) {
            addCriterion("HUODONGXIANGSHU =", value, "huodongxiangshu");
            return (Criteria) this;
        }

        public Criteria andHuodongxiangshuNotEqualTo(Integer value) {
            addCriterion("HUODONGXIANGSHU <>", value, "huodongxiangshu");
            return (Criteria) this;
        }

        public Criteria andHuodongxiangshuGreaterThan(Integer value) {
            addCriterion("HUODONGXIANGSHU >", value, "huodongxiangshu");
            return (Criteria) this;
        }

        public Criteria andHuodongxiangshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("HUODONGXIANGSHU >=", value, "huodongxiangshu");
            return (Criteria) this;
        }

        public Criteria andHuodongxiangshuLessThan(Integer value) {
            addCriterion("HUODONGXIANGSHU <", value, "huodongxiangshu");
            return (Criteria) this;
        }

        public Criteria andHuodongxiangshuLessThanOrEqualTo(Integer value) {
            addCriterion("HUODONGXIANGSHU <=", value, "huodongxiangshu");
            return (Criteria) this;
        }

        public Criteria andHuodongxiangshuIn(List<Integer> values) {
            addCriterion("HUODONGXIANGSHU in", values, "huodongxiangshu");
            return (Criteria) this;
        }

        public Criteria andHuodongxiangshuNotIn(List<Integer> values) {
            addCriterion("HUODONGXIANGSHU not in", values, "huodongxiangshu");
            return (Criteria) this;
        }

        public Criteria andHuodongxiangshuBetween(Integer value1, Integer value2) {
            addCriterion("HUODONGXIANGSHU between", value1, value2, "huodongxiangshu");
            return (Criteria) this;
        }

        public Criteria andHuodongxiangshuNotBetween(Integer value1, Integer value2) {
            addCriterion("HUODONGXIANGSHU not between", value1, value2, "huodongxiangshu");
            return (Criteria) this;
        }

        public Criteria andYanxuxiangshuIsNull() {
            addCriterion("YANXUXIANGSHU is null");
            return (Criteria) this;
        }

        public Criteria andYanxuxiangshuIsNotNull() {
            addCriterion("YANXUXIANGSHU is not null");
            return (Criteria) this;
        }

        public Criteria andYanxuxiangshuEqualTo(Integer value) {
            addCriterion("YANXUXIANGSHU =", value, "yanxuxiangshu");
            return (Criteria) this;
        }

        public Criteria andYanxuxiangshuNotEqualTo(Integer value) {
            addCriterion("YANXUXIANGSHU <>", value, "yanxuxiangshu");
            return (Criteria) this;
        }

        public Criteria andYanxuxiangshuGreaterThan(Integer value) {
            addCriterion("YANXUXIANGSHU >", value, "yanxuxiangshu");
            return (Criteria) this;
        }

        public Criteria andYanxuxiangshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("YANXUXIANGSHU >=", value, "yanxuxiangshu");
            return (Criteria) this;
        }

        public Criteria andYanxuxiangshuLessThan(Integer value) {
            addCriterion("YANXUXIANGSHU <", value, "yanxuxiangshu");
            return (Criteria) this;
        }

        public Criteria andYanxuxiangshuLessThanOrEqualTo(Integer value) {
            addCriterion("YANXUXIANGSHU <=", value, "yanxuxiangshu");
            return (Criteria) this;
        }

        public Criteria andYanxuxiangshuIn(List<Integer> values) {
            addCriterion("YANXUXIANGSHU in", values, "yanxuxiangshu");
            return (Criteria) this;
        }

        public Criteria andYanxuxiangshuNotIn(List<Integer> values) {
            addCriterion("YANXUXIANGSHU not in", values, "yanxuxiangshu");
            return (Criteria) this;
        }

        public Criteria andYanxuxiangshuBetween(Integer value1, Integer value2) {
            addCriterion("YANXUXIANGSHU between", value1, value2, "yanxuxiangshu");
            return (Criteria) this;
        }

        public Criteria andYanxuxiangshuNotBetween(Integer value1, Integer value2) {
            addCriterion("YANXUXIANGSHU not between", value1, value2, "yanxuxiangshu");
            return (Criteria) this;
        }

        public Criteria andXianjin9IsNull() {
            addCriterion("XIANJIN9 is null");
            return (Criteria) this;
        }

        public Criteria andXianjin9IsNotNull() {
            addCriterion("XIANJIN9 is not null");
            return (Criteria) this;
        }

        public Criteria andXianjin9EqualTo(BigDecimal value) {
            addCriterion("XIANJIN9 =", value, "xianjin9");
            return (Criteria) this;
        }

        public Criteria andXianjin9NotEqualTo(BigDecimal value) {
            addCriterion("XIANJIN9 <>", value, "xianjin9");
            return (Criteria) this;
        }

        public Criteria andXianjin9GreaterThan(BigDecimal value) {
            addCriterion("XIANJIN9 >", value, "xianjin9");
            return (Criteria) this;
        }

        public Criteria andXianjin9GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJIN9 >=", value, "xianjin9");
            return (Criteria) this;
        }

        public Criteria andXianjin9LessThan(BigDecimal value) {
            addCriterion("XIANJIN9 <", value, "xianjin9");
            return (Criteria) this;
        }

        public Criteria andXianjin9LessThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJIN9 <=", value, "xianjin9");
            return (Criteria) this;
        }

        public Criteria andXianjin9In(List<BigDecimal> values) {
            addCriterion("XIANJIN9 in", values, "xianjin9");
            return (Criteria) this;
        }

        public Criteria andXianjin9NotIn(List<BigDecimal> values) {
            addCriterion("XIANJIN9 not in", values, "xianjin9");
            return (Criteria) this;
        }

        public Criteria andXianjin9Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJIN9 between", value1, value2, "xianjin9");
            return (Criteria) this;
        }

        public Criteria andXianjin9NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJIN9 not between", value1, value2, "xianjin9");
            return (Criteria) this;
        }

        public Criteria andZhehe9IsNull() {
            addCriterion("ZHEHE9 is null");
            return (Criteria) this;
        }

        public Criteria andZhehe9IsNotNull() {
            addCriterion("ZHEHE9 is not null");
            return (Criteria) this;
        }

        public Criteria andZhehe9EqualTo(BigDecimal value) {
            addCriterion("ZHEHE9 =", value, "zhehe9");
            return (Criteria) this;
        }

        public Criteria andZhehe9NotEqualTo(BigDecimal value) {
            addCriterion("ZHEHE9 <>", value, "zhehe9");
            return (Criteria) this;
        }

        public Criteria andZhehe9GreaterThan(BigDecimal value) {
            addCriterion("ZHEHE9 >", value, "zhehe9");
            return (Criteria) this;
        }

        public Criteria andZhehe9GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHEHE9 >=", value, "zhehe9");
            return (Criteria) this;
        }

        public Criteria andZhehe9LessThan(BigDecimal value) {
            addCriterion("ZHEHE9 <", value, "zhehe9");
            return (Criteria) this;
        }

        public Criteria andZhehe9LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHEHE9 <=", value, "zhehe9");
            return (Criteria) this;
        }

        public Criteria andZhehe9In(List<BigDecimal> values) {
            addCriterion("ZHEHE9 in", values, "zhehe9");
            return (Criteria) this;
        }

        public Criteria andZhehe9NotIn(List<BigDecimal> values) {
            addCriterion("ZHEHE9 not in", values, "zhehe9");
            return (Criteria) this;
        }

        public Criteria andZhehe9Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHEHE9 between", value1, value2, "zhehe9");
            return (Criteria) this;
        }

        public Criteria andZhehe9NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHEHE9 not between", value1, value2, "zhehe9");
            return (Criteria) this;
        }

        public Criteria andHeji9IsNull() {
            addCriterion("HEJI9 is null");
            return (Criteria) this;
        }

        public Criteria andHeji9IsNotNull() {
            addCriterion("HEJI9 is not null");
            return (Criteria) this;
        }

        public Criteria andHeji9EqualTo(BigDecimal value) {
            addCriterion("HEJI9 =", value, "heji9");
            return (Criteria) this;
        }

        public Criteria andHeji9NotEqualTo(BigDecimal value) {
            addCriterion("HEJI9 <>", value, "heji9");
            return (Criteria) this;
        }

        public Criteria andHeji9GreaterThan(BigDecimal value) {
            addCriterion("HEJI9 >", value, "heji9");
            return (Criteria) this;
        }

        public Criteria andHeji9GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJI9 >=", value, "heji9");
            return (Criteria) this;
        }

        public Criteria andHeji9LessThan(BigDecimal value) {
            addCriterion("HEJI9 <", value, "heji9");
            return (Criteria) this;
        }

        public Criteria andHeji9LessThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJI9 <=", value, "heji9");
            return (Criteria) this;
        }

        public Criteria andHeji9In(List<BigDecimal> values) {
            addCriterion("HEJI9 in", values, "heji9");
            return (Criteria) this;
        }

        public Criteria andHeji9NotIn(List<BigDecimal> values) {
            addCriterion("HEJI9 not in", values, "heji9");
            return (Criteria) this;
        }

        public Criteria andHeji9Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJI9 between", value1, value2, "heji9");
            return (Criteria) this;
        }

        public Criteria andHeji9NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJI9 not between", value1, value2, "heji9");
            return (Criteria) this;
        }

        public Criteria andXianjin10IsNull() {
            addCriterion("XIANJIN10 is null");
            return (Criteria) this;
        }

        public Criteria andXianjin10IsNotNull() {
            addCriterion("XIANJIN10 is not null");
            return (Criteria) this;
        }

        public Criteria andXianjin10EqualTo(BigDecimal value) {
            addCriterion("XIANJIN10 =", value, "xianjin10");
            return (Criteria) this;
        }

        public Criteria andXianjin10NotEqualTo(BigDecimal value) {
            addCriterion("XIANJIN10 <>", value, "xianjin10");
            return (Criteria) this;
        }

        public Criteria andXianjin10GreaterThan(BigDecimal value) {
            addCriterion("XIANJIN10 >", value, "xianjin10");
            return (Criteria) this;
        }

        public Criteria andXianjin10GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJIN10 >=", value, "xianjin10");
            return (Criteria) this;
        }

        public Criteria andXianjin10LessThan(BigDecimal value) {
            addCriterion("XIANJIN10 <", value, "xianjin10");
            return (Criteria) this;
        }

        public Criteria andXianjin10LessThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJIN10 <=", value, "xianjin10");
            return (Criteria) this;
        }

        public Criteria andXianjin10In(List<BigDecimal> values) {
            addCriterion("XIANJIN10 in", values, "xianjin10");
            return (Criteria) this;
        }

        public Criteria andXianjin10NotIn(List<BigDecimal> values) {
            addCriterion("XIANJIN10 not in", values, "xianjin10");
            return (Criteria) this;
        }

        public Criteria andXianjin10Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJIN10 between", value1, value2, "xianjin10");
            return (Criteria) this;
        }

        public Criteria andXianjin10NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJIN10 not between", value1, value2, "xianjin10");
            return (Criteria) this;
        }

        public Criteria andZhehe10IsNull() {
            addCriterion("ZHEHE10 is null");
            return (Criteria) this;
        }

        public Criteria andZhehe10IsNotNull() {
            addCriterion("ZHEHE10 is not null");
            return (Criteria) this;
        }

        public Criteria andZhehe10EqualTo(BigDecimal value) {
            addCriterion("ZHEHE10 =", value, "zhehe10");
            return (Criteria) this;
        }

        public Criteria andZhehe10NotEqualTo(BigDecimal value) {
            addCriterion("ZHEHE10 <>", value, "zhehe10");
            return (Criteria) this;
        }

        public Criteria andZhehe10GreaterThan(BigDecimal value) {
            addCriterion("ZHEHE10 >", value, "zhehe10");
            return (Criteria) this;
        }

        public Criteria andZhehe10GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHEHE10 >=", value, "zhehe10");
            return (Criteria) this;
        }

        public Criteria andZhehe10LessThan(BigDecimal value) {
            addCriterion("ZHEHE10 <", value, "zhehe10");
            return (Criteria) this;
        }

        public Criteria andZhehe10LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHEHE10 <=", value, "zhehe10");
            return (Criteria) this;
        }

        public Criteria andZhehe10In(List<BigDecimal> values) {
            addCriterion("ZHEHE10 in", values, "zhehe10");
            return (Criteria) this;
        }

        public Criteria andZhehe10NotIn(List<BigDecimal> values) {
            addCriterion("ZHEHE10 not in", values, "zhehe10");
            return (Criteria) this;
        }

        public Criteria andZhehe10Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHEHE10 between", value1, value2, "zhehe10");
            return (Criteria) this;
        }

        public Criteria andZhehe10NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHEHE10 not between", value1, value2, "zhehe10");
            return (Criteria) this;
        }

        public Criteria andHeji10IsNull() {
            addCriterion("HEJI10 is null");
            return (Criteria) this;
        }

        public Criteria andHeji10IsNotNull() {
            addCriterion("HEJI10 is not null");
            return (Criteria) this;
        }

        public Criteria andHeji10EqualTo(BigDecimal value) {
            addCriterion("HEJI10 =", value, "heji10");
            return (Criteria) this;
        }

        public Criteria andHeji10NotEqualTo(BigDecimal value) {
            addCriterion("HEJI10 <>", value, "heji10");
            return (Criteria) this;
        }

        public Criteria andHeji10GreaterThan(BigDecimal value) {
            addCriterion("HEJI10 >", value, "heji10");
            return (Criteria) this;
        }

        public Criteria andHeji10GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJI10 >=", value, "heji10");
            return (Criteria) this;
        }

        public Criteria andHeji10LessThan(BigDecimal value) {
            addCriterion("HEJI10 <", value, "heji10");
            return (Criteria) this;
        }

        public Criteria andHeji10LessThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJI10 <=", value, "heji10");
            return (Criteria) this;
        }

        public Criteria andHeji10In(List<BigDecimal> values) {
            addCriterion("HEJI10 in", values, "heji10");
            return (Criteria) this;
        }

        public Criteria andHeji10NotIn(List<BigDecimal> values) {
            addCriterion("HEJI10 not in", values, "heji10");
            return (Criteria) this;
        }

        public Criteria andHeji10Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJI10 between", value1, value2, "heji10");
            return (Criteria) this;
        }

        public Criteria andHeji10NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJI10 not between", value1, value2, "heji10");
            return (Criteria) this;
        }

        public Criteria andXianjin11IsNull() {
            addCriterion("XIANJIN11 is null");
            return (Criteria) this;
        }

        public Criteria andXianjin11IsNotNull() {
            addCriterion("XIANJIN11 is not null");
            return (Criteria) this;
        }

        public Criteria andXianjin11EqualTo(BigDecimal value) {
            addCriterion("XIANJIN11 =", value, "xianjin11");
            return (Criteria) this;
        }

        public Criteria andXianjin11NotEqualTo(BigDecimal value) {
            addCriterion("XIANJIN11 <>", value, "xianjin11");
            return (Criteria) this;
        }

        public Criteria andXianjin11GreaterThan(BigDecimal value) {
            addCriterion("XIANJIN11 >", value, "xianjin11");
            return (Criteria) this;
        }

        public Criteria andXianjin11GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJIN11 >=", value, "xianjin11");
            return (Criteria) this;
        }

        public Criteria andXianjin11LessThan(BigDecimal value) {
            addCriterion("XIANJIN11 <", value, "xianjin11");
            return (Criteria) this;
        }

        public Criteria andXianjin11LessThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJIN11 <=", value, "xianjin11");
            return (Criteria) this;
        }

        public Criteria andXianjin11In(List<BigDecimal> values) {
            addCriterion("XIANJIN11 in", values, "xianjin11");
            return (Criteria) this;
        }

        public Criteria andXianjin11NotIn(List<BigDecimal> values) {
            addCriterion("XIANJIN11 not in", values, "xianjin11");
            return (Criteria) this;
        }

        public Criteria andXianjin11Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJIN11 between", value1, value2, "xianjin11");
            return (Criteria) this;
        }

        public Criteria andXianjin11NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJIN11 not between", value1, value2, "xianjin11");
            return (Criteria) this;
        }

        public Criteria andZhehe11IsNull() {
            addCriterion("ZHEHE11 is null");
            return (Criteria) this;
        }

        public Criteria andZhehe11IsNotNull() {
            addCriterion("ZHEHE11 is not null");
            return (Criteria) this;
        }

        public Criteria andZhehe11EqualTo(BigDecimal value) {
            addCriterion("ZHEHE11 =", value, "zhehe11");
            return (Criteria) this;
        }

        public Criteria andZhehe11NotEqualTo(BigDecimal value) {
            addCriterion("ZHEHE11 <>", value, "zhehe11");
            return (Criteria) this;
        }

        public Criteria andZhehe11GreaterThan(BigDecimal value) {
            addCriterion("ZHEHE11 >", value, "zhehe11");
            return (Criteria) this;
        }

        public Criteria andZhehe11GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHEHE11 >=", value, "zhehe11");
            return (Criteria) this;
        }

        public Criteria andZhehe11LessThan(BigDecimal value) {
            addCriterion("ZHEHE11 <", value, "zhehe11");
            return (Criteria) this;
        }

        public Criteria andZhehe11LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHEHE11 <=", value, "zhehe11");
            return (Criteria) this;
        }

        public Criteria andZhehe11In(List<BigDecimal> values) {
            addCriterion("ZHEHE11 in", values, "zhehe11");
            return (Criteria) this;
        }

        public Criteria andZhehe11NotIn(List<BigDecimal> values) {
            addCriterion("ZHEHE11 not in", values, "zhehe11");
            return (Criteria) this;
        }

        public Criteria andZhehe11Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHEHE11 between", value1, value2, "zhehe11");
            return (Criteria) this;
        }

        public Criteria andZhehe11NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHEHE11 not between", value1, value2, "zhehe11");
            return (Criteria) this;
        }

        public Criteria andHeji11IsNull() {
            addCriterion("HEJI11 is null");
            return (Criteria) this;
        }

        public Criteria andHeji11IsNotNull() {
            addCriterion("HEJI11 is not null");
            return (Criteria) this;
        }

        public Criteria andHeji11EqualTo(BigDecimal value) {
            addCriterion("HEJI11 =", value, "heji11");
            return (Criteria) this;
        }

        public Criteria andHeji11NotEqualTo(BigDecimal value) {
            addCriterion("HEJI11 <>", value, "heji11");
            return (Criteria) this;
        }

        public Criteria andHeji11GreaterThan(BigDecimal value) {
            addCriterion("HEJI11 >", value, "heji11");
            return (Criteria) this;
        }

        public Criteria andHeji11GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJI11 >=", value, "heji11");
            return (Criteria) this;
        }

        public Criteria andHeji11LessThan(BigDecimal value) {
            addCriterion("HEJI11 <", value, "heji11");
            return (Criteria) this;
        }

        public Criteria andHeji11LessThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJI11 <=", value, "heji11");
            return (Criteria) this;
        }

        public Criteria andHeji11In(List<BigDecimal> values) {
            addCriterion("HEJI11 in", values, "heji11");
            return (Criteria) this;
        }

        public Criteria andHeji11NotIn(List<BigDecimal> values) {
            addCriterion("HEJI11 not in", values, "heji11");
            return (Criteria) this;
        }

        public Criteria andHeji11Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJI11 between", value1, value2, "heji11");
            return (Criteria) this;
        }

        public Criteria andHeji11NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJI11 not between", value1, value2, "heji11");
            return (Criteria) this;
        }

        public Criteria andXianjin12IsNull() {
            addCriterion("XIANJIN12 is null");
            return (Criteria) this;
        }

        public Criteria andXianjin12IsNotNull() {
            addCriterion("XIANJIN12 is not null");
            return (Criteria) this;
        }

        public Criteria andXianjin12EqualTo(BigDecimal value) {
            addCriterion("XIANJIN12 =", value, "xianjin12");
            return (Criteria) this;
        }

        public Criteria andXianjin12NotEqualTo(BigDecimal value) {
            addCriterion("XIANJIN12 <>", value, "xianjin12");
            return (Criteria) this;
        }

        public Criteria andXianjin12GreaterThan(BigDecimal value) {
            addCriterion("XIANJIN12 >", value, "xianjin12");
            return (Criteria) this;
        }

        public Criteria andXianjin12GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJIN12 >=", value, "xianjin12");
            return (Criteria) this;
        }

        public Criteria andXianjin12LessThan(BigDecimal value) {
            addCriterion("XIANJIN12 <", value, "xianjin12");
            return (Criteria) this;
        }

        public Criteria andXianjin12LessThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJIN12 <=", value, "xianjin12");
            return (Criteria) this;
        }

        public Criteria andXianjin12In(List<BigDecimal> values) {
            addCriterion("XIANJIN12 in", values, "xianjin12");
            return (Criteria) this;
        }

        public Criteria andXianjin12NotIn(List<BigDecimal> values) {
            addCriterion("XIANJIN12 not in", values, "xianjin12");
            return (Criteria) this;
        }

        public Criteria andXianjin12Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJIN12 between", value1, value2, "xianjin12");
            return (Criteria) this;
        }

        public Criteria andXianjin12NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJIN12 not between", value1, value2, "xianjin12");
            return (Criteria) this;
        }

        public Criteria andZhehe12IsNull() {
            addCriterion("ZHEHE12 is null");
            return (Criteria) this;
        }

        public Criteria andZhehe12IsNotNull() {
            addCriterion("ZHEHE12 is not null");
            return (Criteria) this;
        }

        public Criteria andZhehe12EqualTo(BigDecimal value) {
            addCriterion("ZHEHE12 =", value, "zhehe12");
            return (Criteria) this;
        }

        public Criteria andZhehe12NotEqualTo(BigDecimal value) {
            addCriterion("ZHEHE12 <>", value, "zhehe12");
            return (Criteria) this;
        }

        public Criteria andZhehe12GreaterThan(BigDecimal value) {
            addCriterion("ZHEHE12 >", value, "zhehe12");
            return (Criteria) this;
        }

        public Criteria andZhehe12GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHEHE12 >=", value, "zhehe12");
            return (Criteria) this;
        }

        public Criteria andZhehe12LessThan(BigDecimal value) {
            addCriterion("ZHEHE12 <", value, "zhehe12");
            return (Criteria) this;
        }

        public Criteria andZhehe12LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHEHE12 <=", value, "zhehe12");
            return (Criteria) this;
        }

        public Criteria andZhehe12In(List<BigDecimal> values) {
            addCriterion("ZHEHE12 in", values, "zhehe12");
            return (Criteria) this;
        }

        public Criteria andZhehe12NotIn(List<BigDecimal> values) {
            addCriterion("ZHEHE12 not in", values, "zhehe12");
            return (Criteria) this;
        }

        public Criteria andZhehe12Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHEHE12 between", value1, value2, "zhehe12");
            return (Criteria) this;
        }

        public Criteria andZhehe12NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHEHE12 not between", value1, value2, "zhehe12");
            return (Criteria) this;
        }

        public Criteria andHeji12IsNull() {
            addCriterion("HEJI12 is null");
            return (Criteria) this;
        }

        public Criteria andHeji12IsNotNull() {
            addCriterion("HEJI12 is not null");
            return (Criteria) this;
        }

        public Criteria andHeji12EqualTo(BigDecimal value) {
            addCriterion("HEJI12 =", value, "heji12");
            return (Criteria) this;
        }

        public Criteria andHeji12NotEqualTo(BigDecimal value) {
            addCriterion("HEJI12 <>", value, "heji12");
            return (Criteria) this;
        }

        public Criteria andHeji12GreaterThan(BigDecimal value) {
            addCriterion("HEJI12 >", value, "heji12");
            return (Criteria) this;
        }

        public Criteria andHeji12GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJI12 >=", value, "heji12");
            return (Criteria) this;
        }

        public Criteria andHeji12LessThan(BigDecimal value) {
            addCriterion("HEJI12 <", value, "heji12");
            return (Criteria) this;
        }

        public Criteria andHeji12LessThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJI12 <=", value, "heji12");
            return (Criteria) this;
        }

        public Criteria andHeji12In(List<BigDecimal> values) {
            addCriterion("HEJI12 in", values, "heji12");
            return (Criteria) this;
        }

        public Criteria andHeji12NotIn(List<BigDecimal> values) {
            addCriterion("HEJI12 not in", values, "heji12");
            return (Criteria) this;
        }

        public Criteria andHeji12Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJI12 between", value1, value2, "heji12");
            return (Criteria) this;
        }

        public Criteria andHeji12NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJI12 not between", value1, value2, "heji12");
            return (Criteria) this;
        }

        public Criteria andXianjin13IsNull() {
            addCriterion("XIANJIN13 is null");
            return (Criteria) this;
        }

        public Criteria andXianjin13IsNotNull() {
            addCriterion("XIANJIN13 is not null");
            return (Criteria) this;
        }

        public Criteria andXianjin13EqualTo(BigDecimal value) {
            addCriterion("XIANJIN13 =", value, "xianjin13");
            return (Criteria) this;
        }

        public Criteria andXianjin13NotEqualTo(BigDecimal value) {
            addCriterion("XIANJIN13 <>", value, "xianjin13");
            return (Criteria) this;
        }

        public Criteria andXianjin13GreaterThan(BigDecimal value) {
            addCriterion("XIANJIN13 >", value, "xianjin13");
            return (Criteria) this;
        }

        public Criteria andXianjin13GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJIN13 >=", value, "xianjin13");
            return (Criteria) this;
        }

        public Criteria andXianjin13LessThan(BigDecimal value) {
            addCriterion("XIANJIN13 <", value, "xianjin13");
            return (Criteria) this;
        }

        public Criteria andXianjin13LessThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJIN13 <=", value, "xianjin13");
            return (Criteria) this;
        }

        public Criteria andXianjin13In(List<BigDecimal> values) {
            addCriterion("XIANJIN13 in", values, "xianjin13");
            return (Criteria) this;
        }

        public Criteria andXianjin13NotIn(List<BigDecimal> values) {
            addCriterion("XIANJIN13 not in", values, "xianjin13");
            return (Criteria) this;
        }

        public Criteria andXianjin13Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJIN13 between", value1, value2, "xianjin13");
            return (Criteria) this;
        }

        public Criteria andXianjin13NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJIN13 not between", value1, value2, "xianjin13");
            return (Criteria) this;
        }

        public Criteria andZhehe13IsNull() {
            addCriterion("ZHEHE13 is null");
            return (Criteria) this;
        }

        public Criteria andZhehe13IsNotNull() {
            addCriterion("ZHEHE13 is not null");
            return (Criteria) this;
        }

        public Criteria andZhehe13EqualTo(BigDecimal value) {
            addCriterion("ZHEHE13 =", value, "zhehe13");
            return (Criteria) this;
        }

        public Criteria andZhehe13NotEqualTo(BigDecimal value) {
            addCriterion("ZHEHE13 <>", value, "zhehe13");
            return (Criteria) this;
        }

        public Criteria andZhehe13GreaterThan(BigDecimal value) {
            addCriterion("ZHEHE13 >", value, "zhehe13");
            return (Criteria) this;
        }

        public Criteria andZhehe13GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHEHE13 >=", value, "zhehe13");
            return (Criteria) this;
        }

        public Criteria andZhehe13LessThan(BigDecimal value) {
            addCriterion("ZHEHE13 <", value, "zhehe13");
            return (Criteria) this;
        }

        public Criteria andZhehe13LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHEHE13 <=", value, "zhehe13");
            return (Criteria) this;
        }

        public Criteria andZhehe13In(List<BigDecimal> values) {
            addCriterion("ZHEHE13 in", values, "zhehe13");
            return (Criteria) this;
        }

        public Criteria andZhehe13NotIn(List<BigDecimal> values) {
            addCriterion("ZHEHE13 not in", values, "zhehe13");
            return (Criteria) this;
        }

        public Criteria andZhehe13Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHEHE13 between", value1, value2, "zhehe13");
            return (Criteria) this;
        }

        public Criteria andZhehe13NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHEHE13 not between", value1, value2, "zhehe13");
            return (Criteria) this;
        }

        public Criteria andHeji13IsNull() {
            addCriterion("HEJI13 is null");
            return (Criteria) this;
        }

        public Criteria andHeji13IsNotNull() {
            addCriterion("HEJI13 is not null");
            return (Criteria) this;
        }

        public Criteria andHeji13EqualTo(BigDecimal value) {
            addCriterion("HEJI13 =", value, "heji13");
            return (Criteria) this;
        }

        public Criteria andHeji13NotEqualTo(BigDecimal value) {
            addCriterion("HEJI13 <>", value, "heji13");
            return (Criteria) this;
        }

        public Criteria andHeji13GreaterThan(BigDecimal value) {
            addCriterion("HEJI13 >", value, "heji13");
            return (Criteria) this;
        }

        public Criteria andHeji13GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJI13 >=", value, "heji13");
            return (Criteria) this;
        }

        public Criteria andHeji13LessThan(BigDecimal value) {
            addCriterion("HEJI13 <", value, "heji13");
            return (Criteria) this;
        }

        public Criteria andHeji13LessThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJI13 <=", value, "heji13");
            return (Criteria) this;
        }

        public Criteria andHeji13In(List<BigDecimal> values) {
            addCriterion("HEJI13 in", values, "heji13");
            return (Criteria) this;
        }

        public Criteria andHeji13NotIn(List<BigDecimal> values) {
            addCriterion("HEJI13 not in", values, "heji13");
            return (Criteria) this;
        }

        public Criteria andHeji13Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJI13 between", value1, value2, "heji13");
            return (Criteria) this;
        }

        public Criteria andHeji13NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJI13 not between", value1, value2, "heji13");
            return (Criteria) this;
        }

        public Criteria andXianjin14IsNull() {
            addCriterion("XIANJIN14 is null");
            return (Criteria) this;
        }

        public Criteria andXianjin14IsNotNull() {
            addCriterion("XIANJIN14 is not null");
            return (Criteria) this;
        }

        public Criteria andXianjin14EqualTo(BigDecimal value) {
            addCriterion("XIANJIN14 =", value, "xianjin14");
            return (Criteria) this;
        }

        public Criteria andXianjin14NotEqualTo(BigDecimal value) {
            addCriterion("XIANJIN14 <>", value, "xianjin14");
            return (Criteria) this;
        }

        public Criteria andXianjin14GreaterThan(BigDecimal value) {
            addCriterion("XIANJIN14 >", value, "xianjin14");
            return (Criteria) this;
        }

        public Criteria andXianjin14GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJIN14 >=", value, "xianjin14");
            return (Criteria) this;
        }

        public Criteria andXianjin14LessThan(BigDecimal value) {
            addCriterion("XIANJIN14 <", value, "xianjin14");
            return (Criteria) this;
        }

        public Criteria andXianjin14LessThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJIN14 <=", value, "xianjin14");
            return (Criteria) this;
        }

        public Criteria andXianjin14In(List<BigDecimal> values) {
            addCriterion("XIANJIN14 in", values, "xianjin14");
            return (Criteria) this;
        }

        public Criteria andXianjin14NotIn(List<BigDecimal> values) {
            addCriterion("XIANJIN14 not in", values, "xianjin14");
            return (Criteria) this;
        }

        public Criteria andXianjin14Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJIN14 between", value1, value2, "xianjin14");
            return (Criteria) this;
        }

        public Criteria andXianjin14NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJIN14 not between", value1, value2, "xianjin14");
            return (Criteria) this;
        }

        public Criteria andZhehe14IsNull() {
            addCriterion("ZHEHE14 is null");
            return (Criteria) this;
        }

        public Criteria andZhehe14IsNotNull() {
            addCriterion("ZHEHE14 is not null");
            return (Criteria) this;
        }

        public Criteria andZhehe14EqualTo(BigDecimal value) {
            addCriterion("ZHEHE14 =", value, "zhehe14");
            return (Criteria) this;
        }

        public Criteria andZhehe14NotEqualTo(BigDecimal value) {
            addCriterion("ZHEHE14 <>", value, "zhehe14");
            return (Criteria) this;
        }

        public Criteria andZhehe14GreaterThan(BigDecimal value) {
            addCriterion("ZHEHE14 >", value, "zhehe14");
            return (Criteria) this;
        }

        public Criteria andZhehe14GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHEHE14 >=", value, "zhehe14");
            return (Criteria) this;
        }

        public Criteria andZhehe14LessThan(BigDecimal value) {
            addCriterion("ZHEHE14 <", value, "zhehe14");
            return (Criteria) this;
        }

        public Criteria andZhehe14LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHEHE14 <=", value, "zhehe14");
            return (Criteria) this;
        }

        public Criteria andZhehe14In(List<BigDecimal> values) {
            addCriterion("ZHEHE14 in", values, "zhehe14");
            return (Criteria) this;
        }

        public Criteria andZhehe14NotIn(List<BigDecimal> values) {
            addCriterion("ZHEHE14 not in", values, "zhehe14");
            return (Criteria) this;
        }

        public Criteria andZhehe14Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHEHE14 between", value1, value2, "zhehe14");
            return (Criteria) this;
        }

        public Criteria andZhehe14NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHEHE14 not between", value1, value2, "zhehe14");
            return (Criteria) this;
        }

        public Criteria andHeji14IsNull() {
            addCriterion("HEJI14 is null");
            return (Criteria) this;
        }

        public Criteria andHeji14IsNotNull() {
            addCriterion("HEJI14 is not null");
            return (Criteria) this;
        }

        public Criteria andHeji14EqualTo(BigDecimal value) {
            addCriterion("HEJI14 =", value, "heji14");
            return (Criteria) this;
        }

        public Criteria andHeji14NotEqualTo(BigDecimal value) {
            addCriterion("HEJI14 <>", value, "heji14");
            return (Criteria) this;
        }

        public Criteria andHeji14GreaterThan(BigDecimal value) {
            addCriterion("HEJI14 >", value, "heji14");
            return (Criteria) this;
        }

        public Criteria andHeji14GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJI14 >=", value, "heji14");
            return (Criteria) this;
        }

        public Criteria andHeji14LessThan(BigDecimal value) {
            addCriterion("HEJI14 <", value, "heji14");
            return (Criteria) this;
        }

        public Criteria andHeji14LessThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJI14 <=", value, "heji14");
            return (Criteria) this;
        }

        public Criteria andHeji14In(List<BigDecimal> values) {
            addCriterion("HEJI14 in", values, "heji14");
            return (Criteria) this;
        }

        public Criteria andHeji14NotIn(List<BigDecimal> values) {
            addCriterion("HEJI14 not in", values, "heji14");
            return (Criteria) this;
        }

        public Criteria andHeji14Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJI14 between", value1, value2, "heji14");
            return (Criteria) this;
        }

        public Criteria andHeji14NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJI14 not between", value1, value2, "heji14");
            return (Criteria) this;
        }

        public Criteria andXianjin15IsNull() {
            addCriterion("XIANJIN15 is null");
            return (Criteria) this;
        }

        public Criteria andXianjin15IsNotNull() {
            addCriterion("XIANJIN15 is not null");
            return (Criteria) this;
        }

        public Criteria andXianjin15EqualTo(BigDecimal value) {
            addCriterion("XIANJIN15 =", value, "xianjin15");
            return (Criteria) this;
        }

        public Criteria andXianjin15NotEqualTo(BigDecimal value) {
            addCriterion("XIANJIN15 <>", value, "xianjin15");
            return (Criteria) this;
        }

        public Criteria andXianjin15GreaterThan(BigDecimal value) {
            addCriterion("XIANJIN15 >", value, "xianjin15");
            return (Criteria) this;
        }

        public Criteria andXianjin15GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJIN15 >=", value, "xianjin15");
            return (Criteria) this;
        }

        public Criteria andXianjin15LessThan(BigDecimal value) {
            addCriterion("XIANJIN15 <", value, "xianjin15");
            return (Criteria) this;
        }

        public Criteria andXianjin15LessThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJIN15 <=", value, "xianjin15");
            return (Criteria) this;
        }

        public Criteria andXianjin15In(List<BigDecimal> values) {
            addCriterion("XIANJIN15 in", values, "xianjin15");
            return (Criteria) this;
        }

        public Criteria andXianjin15NotIn(List<BigDecimal> values) {
            addCriterion("XIANJIN15 not in", values, "xianjin15");
            return (Criteria) this;
        }

        public Criteria andXianjin15Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJIN15 between", value1, value2, "xianjin15");
            return (Criteria) this;
        }

        public Criteria andXianjin15NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJIN15 not between", value1, value2, "xianjin15");
            return (Criteria) this;
        }

        public Criteria andZhehe15IsNull() {
            addCriterion("ZHEHE15 is null");
            return (Criteria) this;
        }

        public Criteria andZhehe15IsNotNull() {
            addCriterion("ZHEHE15 is not null");
            return (Criteria) this;
        }

        public Criteria andZhehe15EqualTo(BigDecimal value) {
            addCriterion("ZHEHE15 =", value, "zhehe15");
            return (Criteria) this;
        }

        public Criteria andZhehe15NotEqualTo(BigDecimal value) {
            addCriterion("ZHEHE15 <>", value, "zhehe15");
            return (Criteria) this;
        }

        public Criteria andZhehe15GreaterThan(BigDecimal value) {
            addCriterion("ZHEHE15 >", value, "zhehe15");
            return (Criteria) this;
        }

        public Criteria andZhehe15GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHEHE15 >=", value, "zhehe15");
            return (Criteria) this;
        }

        public Criteria andZhehe15LessThan(BigDecimal value) {
            addCriterion("ZHEHE15 <", value, "zhehe15");
            return (Criteria) this;
        }

        public Criteria andZhehe15LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHEHE15 <=", value, "zhehe15");
            return (Criteria) this;
        }

        public Criteria andZhehe15In(List<BigDecimal> values) {
            addCriterion("ZHEHE15 in", values, "zhehe15");
            return (Criteria) this;
        }

        public Criteria andZhehe15NotIn(List<BigDecimal> values) {
            addCriterion("ZHEHE15 not in", values, "zhehe15");
            return (Criteria) this;
        }

        public Criteria andZhehe15Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHEHE15 between", value1, value2, "zhehe15");
            return (Criteria) this;
        }

        public Criteria andZhehe15NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHEHE15 not between", value1, value2, "zhehe15");
            return (Criteria) this;
        }

        public Criteria andHeji15IsNull() {
            addCriterion("HEJI15 is null");
            return (Criteria) this;
        }

        public Criteria andHeji15IsNotNull() {
            addCriterion("HEJI15 is not null");
            return (Criteria) this;
        }

        public Criteria andHeji15EqualTo(BigDecimal value) {
            addCriterion("HEJI15 =", value, "heji15");
            return (Criteria) this;
        }

        public Criteria andHeji15NotEqualTo(BigDecimal value) {
            addCriterion("HEJI15 <>", value, "heji15");
            return (Criteria) this;
        }

        public Criteria andHeji15GreaterThan(BigDecimal value) {
            addCriterion("HEJI15 >", value, "heji15");
            return (Criteria) this;
        }

        public Criteria andHeji15GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJI15 >=", value, "heji15");
            return (Criteria) this;
        }

        public Criteria andHeji15LessThan(BigDecimal value) {
            addCriterion("HEJI15 <", value, "heji15");
            return (Criteria) this;
        }

        public Criteria andHeji15LessThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJI15 <=", value, "heji15");
            return (Criteria) this;
        }

        public Criteria andHeji15In(List<BigDecimal> values) {
            addCriterion("HEJI15 in", values, "heji15");
            return (Criteria) this;
        }

        public Criteria andHeji15NotIn(List<BigDecimal> values) {
            addCriterion("HEJI15 not in", values, "heji15");
            return (Criteria) this;
        }

        public Criteria andHeji15Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJI15 between", value1, value2, "heji15");
            return (Criteria) this;
        }

        public Criteria andHeji15NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJI15 not between", value1, value2, "heji15");
            return (Criteria) this;
        }

        public Criteria andZongshouruIsNull() {
            addCriterion("ZONGSHOURU is null");
            return (Criteria) this;
        }

        public Criteria andZongshouruIsNotNull() {
            addCriterion("ZONGSHOURU is not null");
            return (Criteria) this;
        }

        public Criteria andZongshouruEqualTo(BigDecimal value) {
            addCriterion("ZONGSHOURU =", value, "zongshouru");
            return (Criteria) this;
        }

        public Criteria andZongshouruNotEqualTo(BigDecimal value) {
            addCriterion("ZONGSHOURU <>", value, "zongshouru");
            return (Criteria) this;
        }

        public Criteria andZongshouruGreaterThan(BigDecimal value) {
            addCriterion("ZONGSHOURU >", value, "zongshouru");
            return (Criteria) this;
        }

        public Criteria andZongshouruGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZONGSHOURU >=", value, "zongshouru");
            return (Criteria) this;
        }

        public Criteria andZongshouruLessThan(BigDecimal value) {
            addCriterion("ZONGSHOURU <", value, "zongshouru");
            return (Criteria) this;
        }

        public Criteria andZongshouruLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZONGSHOURU <=", value, "zongshouru");
            return (Criteria) this;
        }

        public Criteria andZongshouruIn(List<BigDecimal> values) {
            addCriterion("ZONGSHOURU in", values, "zongshouru");
            return (Criteria) this;
        }

        public Criteria andZongshouruNotIn(List<BigDecimal> values) {
            addCriterion("ZONGSHOURU not in", values, "zongshouru");
            return (Criteria) this;
        }

        public Criteria andZongshouruBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZONGSHOURU between", value1, value2, "zongshouru");
            return (Criteria) this;
        }

        public Criteria andZongshouruNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZONGSHOURU not between", value1, value2, "zongshouru");
            return (Criteria) this;
        }

        public Criteria andZongzhichuIsNull() {
            addCriterion("ZONGZHICHU is null");
            return (Criteria) this;
        }

        public Criteria andZongzhichuIsNotNull() {
            addCriterion("ZONGZHICHU is not null");
            return (Criteria) this;
        }

        public Criteria andZongzhichuEqualTo(BigDecimal value) {
            addCriterion("ZONGZHICHU =", value, "zongzhichu");
            return (Criteria) this;
        }

        public Criteria andZongzhichuNotEqualTo(BigDecimal value) {
            addCriterion("ZONGZHICHU <>", value, "zongzhichu");
            return (Criteria) this;
        }

        public Criteria andZongzhichuGreaterThan(BigDecimal value) {
            addCriterion("ZONGZHICHU >", value, "zongzhichu");
            return (Criteria) this;
        }

        public Criteria andZongzhichuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZONGZHICHU >=", value, "zongzhichu");
            return (Criteria) this;
        }

        public Criteria andZongzhichuLessThan(BigDecimal value) {
            addCriterion("ZONGZHICHU <", value, "zongzhichu");
            return (Criteria) this;
        }

        public Criteria andZongzhichuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZONGZHICHU <=", value, "zongzhichu");
            return (Criteria) this;
        }

        public Criteria andZongzhichuIn(List<BigDecimal> values) {
            addCriterion("ZONGZHICHU in", values, "zongzhichu");
            return (Criteria) this;
        }

        public Criteria andZongzhichuNotIn(List<BigDecimal> values) {
            addCriterion("ZONGZHICHU not in", values, "zongzhichu");
            return (Criteria) this;
        }

        public Criteria andZongzhichuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZONGZHICHU between", value1, value2, "zongzhichu");
            return (Criteria) this;
        }

        public Criteria andZongzhichuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZONGZHICHU not between", value1, value2, "zongzhichu");
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

        public Criteria andFulizhichuIsNull() {
            addCriterion("FULIZHICHU is null");
            return (Criteria) this;
        }

        public Criteria andFulizhichuIsNotNull() {
            addCriterion("FULIZHICHU is not null");
            return (Criteria) this;
        }

        public Criteria andFulizhichuEqualTo(BigDecimal value) {
            addCriterion("FULIZHICHU =", value, "fulizhichu");
            return (Criteria) this;
        }

        public Criteria andFulizhichuNotEqualTo(BigDecimal value) {
            addCriterion("FULIZHICHU <>", value, "fulizhichu");
            return (Criteria) this;
        }

        public Criteria andFulizhichuGreaterThan(BigDecimal value) {
            addCriterion("FULIZHICHU >", value, "fulizhichu");
            return (Criteria) this;
        }

        public Criteria andFulizhichuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FULIZHICHU >=", value, "fulizhichu");
            return (Criteria) this;
        }

        public Criteria andFulizhichuLessThan(BigDecimal value) {
            addCriterion("FULIZHICHU <", value, "fulizhichu");
            return (Criteria) this;
        }

        public Criteria andFulizhichuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FULIZHICHU <=", value, "fulizhichu");
            return (Criteria) this;
        }

        public Criteria andFulizhichuIn(List<BigDecimal> values) {
            addCriterion("FULIZHICHU in", values, "fulizhichu");
            return (Criteria) this;
        }

        public Criteria andFulizhichuNotIn(List<BigDecimal> values) {
            addCriterion("FULIZHICHU not in", values, "fulizhichu");
            return (Criteria) this;
        }

        public Criteria andFulizhichuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FULIZHICHU between", value1, value2, "fulizhichu");
            return (Criteria) this;
        }

        public Criteria andFulizhichuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FULIZHICHU not between", value1, value2, "fulizhichu");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichuIsNull() {
            addCriterion("XINGZHENGZHICHU is null");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichuIsNotNull() {
            addCriterion("XINGZHENGZHICHU is not null");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichuEqualTo(BigDecimal value) {
            addCriterion("XINGZHENGZHICHU =", value, "xingzhengzhichu");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichuNotEqualTo(BigDecimal value) {
            addCriterion("XINGZHENGZHICHU <>", value, "xingzhengzhichu");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichuGreaterThan(BigDecimal value) {
            addCriterion("XINGZHENGZHICHU >", value, "xingzhengzhichu");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XINGZHENGZHICHU >=", value, "xingzhengzhichu");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichuLessThan(BigDecimal value) {
            addCriterion("XINGZHENGZHICHU <", value, "xingzhengzhichu");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XINGZHENGZHICHU <=", value, "xingzhengzhichu");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichuIn(List<BigDecimal> values) {
            addCriterion("XINGZHENGZHICHU in", values, "xingzhengzhichu");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichuNotIn(List<BigDecimal> values) {
            addCriterion("XINGZHENGZHICHU not in", values, "xingzhengzhichu");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XINGZHENGZHICHU between", value1, value2, "xingzhengzhichu");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XINGZHENGZHICHU not between", value1, value2, "xingzhengzhichu");
            return (Criteria) this;
        }

        public Criteria andGongyibiliIsNull() {
            addCriterion("GONGYIBILI is null");
            return (Criteria) this;
        }

        public Criteria andGongyibiliIsNotNull() {
            addCriterion("GONGYIBILI is not null");
            return (Criteria) this;
        }

        public Criteria andGongyibiliEqualTo(BigDecimal value) {
            addCriterion("GONGYIBILI =", value, "gongyibili");
            return (Criteria) this;
        }

        public Criteria andGongyibiliNotEqualTo(BigDecimal value) {
            addCriterion("GONGYIBILI <>", value, "gongyibili");
            return (Criteria) this;
        }

        public Criteria andGongyibiliGreaterThan(BigDecimal value) {
            addCriterion("GONGYIBILI >", value, "gongyibili");
            return (Criteria) this;
        }

        public Criteria andGongyibiliGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GONGYIBILI >=", value, "gongyibili");
            return (Criteria) this;
        }

        public Criteria andGongyibiliLessThan(BigDecimal value) {
            addCriterion("GONGYIBILI <", value, "gongyibili");
            return (Criteria) this;
        }

        public Criteria andGongyibiliLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GONGYIBILI <=", value, "gongyibili");
            return (Criteria) this;
        }

        public Criteria andGongyibiliIn(List<BigDecimal> values) {
            addCriterion("GONGYIBILI in", values, "gongyibili");
            return (Criteria) this;
        }

        public Criteria andGongyibiliNotIn(List<BigDecimal> values) {
            addCriterion("GONGYIBILI not in", values, "gongyibili");
            return (Criteria) this;
        }

        public Criteria andGongyibiliBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GONGYIBILI between", value1, value2, "gongyibili");
            return (Criteria) this;
        }

        public Criteria andGongyibiliNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GONGYIBILI not between", value1, value2, "gongyibili");
            return (Criteria) this;
        }

        public Criteria andFulibiliIsNull() {
            addCriterion("FULIBILI is null");
            return (Criteria) this;
        }

        public Criteria andFulibiliIsNotNull() {
            addCriterion("FULIBILI is not null");
            return (Criteria) this;
        }

        public Criteria andFulibiliEqualTo(BigDecimal value) {
            addCriterion("FULIBILI =", value, "fulibili");
            return (Criteria) this;
        }

        public Criteria andFulibiliNotEqualTo(BigDecimal value) {
            addCriterion("FULIBILI <>", value, "fulibili");
            return (Criteria) this;
        }

        public Criteria andFulibiliGreaterThan(BigDecimal value) {
            addCriterion("FULIBILI >", value, "fulibili");
            return (Criteria) this;
        }

        public Criteria andFulibiliGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FULIBILI >=", value, "fulibili");
            return (Criteria) this;
        }

        public Criteria andFulibiliLessThan(BigDecimal value) {
            addCriterion("FULIBILI <", value, "fulibili");
            return (Criteria) this;
        }

        public Criteria andFulibiliLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FULIBILI <=", value, "fulibili");
            return (Criteria) this;
        }

        public Criteria andFulibiliIn(List<BigDecimal> values) {
            addCriterion("FULIBILI in", values, "fulibili");
            return (Criteria) this;
        }

        public Criteria andFulibiliNotIn(List<BigDecimal> values) {
            addCriterion("FULIBILI not in", values, "fulibili");
            return (Criteria) this;
        }

        public Criteria andFulibiliBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FULIBILI between", value1, value2, "fulibili");
            return (Criteria) this;
        }

        public Criteria andFulibiliNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FULIBILI not between", value1, value2, "fulibili");
            return (Criteria) this;
        }

        public Criteria andGongjiIsNull() {
            addCriterion("GONGJI is null");
            return (Criteria) this;
        }

        public Criteria andGongjiIsNotNull() {
            addCriterion("GONGJI is not null");
            return (Criteria) this;
        }

        public Criteria andGongjiEqualTo(Integer value) {
            addCriterion("GONGJI =", value, "gongji");
            return (Criteria) this;
        }

        public Criteria andGongjiNotEqualTo(Integer value) {
            addCriterion("GONGJI <>", value, "gongji");
            return (Criteria) this;
        }

        public Criteria andGongjiGreaterThan(Integer value) {
            addCriterion("GONGJI >", value, "gongji");
            return (Criteria) this;
        }

        public Criteria andGongjiGreaterThanOrEqualTo(Integer value) {
            addCriterion("GONGJI >=", value, "gongji");
            return (Criteria) this;
        }

        public Criteria andGongjiLessThan(Integer value) {
            addCriterion("GONGJI <", value, "gongji");
            return (Criteria) this;
        }

        public Criteria andGongjiLessThanOrEqualTo(Integer value) {
            addCriterion("GONGJI <=", value, "gongji");
            return (Criteria) this;
        }

        public Criteria andGongjiIn(List<Integer> values) {
            addCriterion("GONGJI in", values, "gongji");
            return (Criteria) this;
        }

        public Criteria andGongjiNotIn(List<Integer> values) {
            addCriterion("GONGJI not in", values, "gongji");
            return (Criteria) this;
        }

        public Criteria andGongjiBetween(Integer value1, Integer value2) {
            addCriterion("GONGJI between", value1, value2, "gongji");
            return (Criteria) this;
        }

        public Criteria andGongjiNotBetween(Integer value1, Integer value2) {
            addCriterion("GONGJI not between", value1, value2, "gongji");
            return (Criteria) this;
        }

        public Criteria andShouruhejiIsNull() {
            addCriterion("SHOURUHEJI is null");
            return (Criteria) this;
        }

        public Criteria andShouruhejiIsNotNull() {
            addCriterion("SHOURUHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andShouruhejiEqualTo(BigDecimal value) {
            addCriterion("SHOURUHEJI =", value, "shouruheji");
            return (Criteria) this;
        }

        public Criteria andShouruhejiNotEqualTo(BigDecimal value) {
            addCriterion("SHOURUHEJI <>", value, "shouruheji");
            return (Criteria) this;
        }

        public Criteria andShouruhejiGreaterThan(BigDecimal value) {
            addCriterion("SHOURUHEJI >", value, "shouruheji");
            return (Criteria) this;
        }

        public Criteria andShouruhejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOURUHEJI >=", value, "shouruheji");
            return (Criteria) this;
        }

        public Criteria andShouruhejiLessThan(BigDecimal value) {
            addCriterion("SHOURUHEJI <", value, "shouruheji");
            return (Criteria) this;
        }

        public Criteria andShouruhejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOURUHEJI <=", value, "shouruheji");
            return (Criteria) this;
        }

        public Criteria andShouruhejiIn(List<BigDecimal> values) {
            addCriterion("SHOURUHEJI in", values, "shouruheji");
            return (Criteria) this;
        }

        public Criteria andShouruhejiNotIn(List<BigDecimal> values) {
            addCriterion("SHOURUHEJI not in", values, "shouruheji");
            return (Criteria) this;
        }

        public Criteria andShouruhejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOURUHEJI between", value1, value2, "shouruheji");
            return (Criteria) this;
        }

        public Criteria andShouruhejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOURUHEJI not between", value1, value2, "shouruheji");
            return (Criteria) this;
        }

        public Criteria andHouzongshouruIsNull() {
            addCriterion("HOUZONGSHOURU is null");
            return (Criteria) this;
        }

        public Criteria andHouzongshouruIsNotNull() {
            addCriterion("HOUZONGSHOURU is not null");
            return (Criteria) this;
        }

        public Criteria andHouzongshouruEqualTo(BigDecimal value) {
            addCriterion("HOUZONGSHOURU =", value, "houzongshouru");
            return (Criteria) this;
        }

        public Criteria andHouzongshouruNotEqualTo(BigDecimal value) {
            addCriterion("HOUZONGSHOURU <>", value, "houzongshouru");
            return (Criteria) this;
        }

        public Criteria andHouzongshouruGreaterThan(BigDecimal value) {
            addCriterion("HOUZONGSHOURU >", value, "houzongshouru");
            return (Criteria) this;
        }

        public Criteria andHouzongshouruGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HOUZONGSHOURU >=", value, "houzongshouru");
            return (Criteria) this;
        }

        public Criteria andHouzongshouruLessThan(BigDecimal value) {
            addCriterion("HOUZONGSHOURU <", value, "houzongshouru");
            return (Criteria) this;
        }

        public Criteria andHouzongshouruLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HOUZONGSHOURU <=", value, "houzongshouru");
            return (Criteria) this;
        }

        public Criteria andHouzongshouruIn(List<BigDecimal> values) {
            addCriterion("HOUZONGSHOURU in", values, "houzongshouru");
            return (Criteria) this;
        }

        public Criteria andHouzongshouruNotIn(List<BigDecimal> values) {
            addCriterion("HOUZONGSHOURU not in", values, "houzongshouru");
            return (Criteria) this;
        }

        public Criteria andHouzongshouruBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOUZONGSHOURU between", value1, value2, "houzongshouru");
            return (Criteria) this;
        }

        public Criteria andHouzongshouruNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOUZONGSHOURU not between", value1, value2, "houzongshouru");
            return (Criteria) this;
        }

        public Criteria andHougongyizhichuIsNull() {
            addCriterion("HOUGONGYIZHICHU is null");
            return (Criteria) this;
        }

        public Criteria andHougongyizhichuIsNotNull() {
            addCriterion("HOUGONGYIZHICHU is not null");
            return (Criteria) this;
        }

        public Criteria andHougongyizhichuEqualTo(BigDecimal value) {
            addCriterion("HOUGONGYIZHICHU =", value, "hougongyizhichu");
            return (Criteria) this;
        }

        public Criteria andHougongyizhichuNotEqualTo(BigDecimal value) {
            addCriterion("HOUGONGYIZHICHU <>", value, "hougongyizhichu");
            return (Criteria) this;
        }

        public Criteria andHougongyizhichuGreaterThan(BigDecimal value) {
            addCriterion("HOUGONGYIZHICHU >", value, "hougongyizhichu");
            return (Criteria) this;
        }

        public Criteria andHougongyizhichuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HOUGONGYIZHICHU >=", value, "hougongyizhichu");
            return (Criteria) this;
        }

        public Criteria andHougongyizhichuLessThan(BigDecimal value) {
            addCriterion("HOUGONGYIZHICHU <", value, "hougongyizhichu");
            return (Criteria) this;
        }

        public Criteria andHougongyizhichuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HOUGONGYIZHICHU <=", value, "hougongyizhichu");
            return (Criteria) this;
        }

        public Criteria andHougongyizhichuIn(List<BigDecimal> values) {
            addCriterion("HOUGONGYIZHICHU in", values, "hougongyizhichu");
            return (Criteria) this;
        }

        public Criteria andHougongyizhichuNotIn(List<BigDecimal> values) {
            addCriterion("HOUGONGYIZHICHU not in", values, "hougongyizhichu");
            return (Criteria) this;
        }

        public Criteria andHougongyizhichuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOUGONGYIZHICHU between", value1, value2, "hougongyizhichu");
            return (Criteria) this;
        }

        public Criteria andHougongyizhichuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOUGONGYIZHICHU not between", value1, value2, "hougongyizhichu");
            return (Criteria) this;
        }

        public Criteria andHougongyibiliIsNull() {
            addCriterion("HOUGONGYIBILI is null");
            return (Criteria) this;
        }

        public Criteria andHougongyibiliIsNotNull() {
            addCriterion("HOUGONGYIBILI is not null");
            return (Criteria) this;
        }

        public Criteria andHougongyibiliEqualTo(BigDecimal value) {
            addCriterion("HOUGONGYIBILI =", value, "hougongyibili");
            return (Criteria) this;
        }

        public Criteria andHougongyibiliNotEqualTo(BigDecimal value) {
            addCriterion("HOUGONGYIBILI <>", value, "hougongyibili");
            return (Criteria) this;
        }

        public Criteria andHougongyibiliGreaterThan(BigDecimal value) {
            addCriterion("HOUGONGYIBILI >", value, "hougongyibili");
            return (Criteria) this;
        }

        public Criteria andHougongyibiliGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HOUGONGYIBILI >=", value, "hougongyibili");
            return (Criteria) this;
        }

        public Criteria andHougongyibiliLessThan(BigDecimal value) {
            addCriterion("HOUGONGYIBILI <", value, "hougongyibili");
            return (Criteria) this;
        }

        public Criteria andHougongyibiliLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HOUGONGYIBILI <=", value, "hougongyibili");
            return (Criteria) this;
        }

        public Criteria andHougongyibiliIn(List<BigDecimal> values) {
            addCriterion("HOUGONGYIBILI in", values, "hougongyibili");
            return (Criteria) this;
        }

        public Criteria andHougongyibiliNotIn(List<BigDecimal> values) {
            addCriterion("HOUGONGYIBILI not in", values, "hougongyibili");
            return (Criteria) this;
        }

        public Criteria andHougongyibiliBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOUGONGYIBILI between", value1, value2, "hougongyibili");
            return (Criteria) this;
        }

        public Criteria andHougongyibiliNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOUGONGYIBILI not between", value1, value2, "hougongyibili");
            return (Criteria) this;
        }

        public Criteria andQitazhichuIsNull() {
            addCriterion("QITAZHICHU is null");
            return (Criteria) this;
        }

        public Criteria andQitazhichuIsNotNull() {
            addCriterion("QITAZHICHU is not null");
            return (Criteria) this;
        }

        public Criteria andQitazhichuEqualTo(BigDecimal value) {
            addCriterion("QITAZHICHU =", value, "qitazhichu");
            return (Criteria) this;
        }

        public Criteria andQitazhichuNotEqualTo(BigDecimal value) {
            addCriterion("QITAZHICHU <>", value, "qitazhichu");
            return (Criteria) this;
        }

        public Criteria andQitazhichuGreaterThan(BigDecimal value) {
            addCriterion("QITAZHICHU >", value, "qitazhichu");
            return (Criteria) this;
        }

        public Criteria andQitazhichuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QITAZHICHU >=", value, "qitazhichu");
            return (Criteria) this;
        }

        public Criteria andQitazhichuLessThan(BigDecimal value) {
            addCriterion("QITAZHICHU <", value, "qitazhichu");
            return (Criteria) this;
        }

        public Criteria andQitazhichuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QITAZHICHU <=", value, "qitazhichu");
            return (Criteria) this;
        }

        public Criteria andQitazhichuIn(List<BigDecimal> values) {
            addCriterion("QITAZHICHU in", values, "qitazhichu");
            return (Criteria) this;
        }

        public Criteria andQitazhichuNotIn(List<BigDecimal> values) {
            addCriterion("QITAZHICHU not in", values, "qitazhichu");
            return (Criteria) this;
        }

        public Criteria andQitazhichuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QITAZHICHU between", value1, value2, "qitazhichu");
            return (Criteria) this;
        }

        public Criteria andQitazhichuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QITAZHICHU not between", value1, value2, "qitazhichu");
            return (Criteria) this;
        }

        public Criteria andLiangniangongyibiliIsNull() {
            addCriterion("LIANGNIANGONGYIBILI is null");
            return (Criteria) this;
        }

        public Criteria andLiangniangongyibiliIsNotNull() {
            addCriterion("LIANGNIANGONGYIBILI is not null");
            return (Criteria) this;
        }

        public Criteria andLiangniangongyibiliEqualTo(BigDecimal value) {
            addCriterion("LIANGNIANGONGYIBILI =", value, "liangniangongyibili");
            return (Criteria) this;
        }

        public Criteria andLiangniangongyibiliNotEqualTo(BigDecimal value) {
            addCriterion("LIANGNIANGONGYIBILI <>", value, "liangniangongyibili");
            return (Criteria) this;
        }

        public Criteria andLiangniangongyibiliGreaterThan(BigDecimal value) {
            addCriterion("LIANGNIANGONGYIBILI >", value, "liangniangongyibili");
            return (Criteria) this;
        }

        public Criteria andLiangniangongyibiliGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIANGNIANGONGYIBILI >=", value, "liangniangongyibili");
            return (Criteria) this;
        }

        public Criteria andLiangniangongyibiliLessThan(BigDecimal value) {
            addCriterion("LIANGNIANGONGYIBILI <", value, "liangniangongyibili");
            return (Criteria) this;
        }

        public Criteria andLiangniangongyibiliLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIANGNIANGONGYIBILI <=", value, "liangniangongyibili");
            return (Criteria) this;
        }

        public Criteria andLiangniangongyibiliIn(List<BigDecimal> values) {
            addCriterion("LIANGNIANGONGYIBILI in", values, "liangniangongyibili");
            return (Criteria) this;
        }

        public Criteria andLiangniangongyibiliNotIn(List<BigDecimal> values) {
            addCriterion("LIANGNIANGONGYIBILI not in", values, "liangniangongyibili");
            return (Criteria) this;
        }

        public Criteria andLiangniangongyibiliBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIANGNIANGONGYIBILI between", value1, value2, "liangniangongyibili");
            return (Criteria) this;
        }

        public Criteria andLiangniangongyibiliNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIANGNIANGONGYIBILI not between", value1, value2, "liangniangongyibili");
            return (Criteria) this;
        }

        public Criteria andSanniangongyibiliIsNull() {
            addCriterion("SANNIANGONGYIBILI is null");
            return (Criteria) this;
        }

        public Criteria andSanniangongyibiliIsNotNull() {
            addCriterion("SANNIANGONGYIBILI is not null");
            return (Criteria) this;
        }

        public Criteria andSanniangongyibiliEqualTo(BigDecimal value) {
            addCriterion("SANNIANGONGYIBILI =", value, "sanniangongyibili");
            return (Criteria) this;
        }

        public Criteria andSanniangongyibiliNotEqualTo(BigDecimal value) {
            addCriterion("SANNIANGONGYIBILI <>", value, "sanniangongyibili");
            return (Criteria) this;
        }

        public Criteria andSanniangongyibiliGreaterThan(BigDecimal value) {
            addCriterion("SANNIANGONGYIBILI >", value, "sanniangongyibili");
            return (Criteria) this;
        }

        public Criteria andSanniangongyibiliGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SANNIANGONGYIBILI >=", value, "sanniangongyibili");
            return (Criteria) this;
        }

        public Criteria andSanniangongyibiliLessThan(BigDecimal value) {
            addCriterion("SANNIANGONGYIBILI <", value, "sanniangongyibili");
            return (Criteria) this;
        }

        public Criteria andSanniangongyibiliLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SANNIANGONGYIBILI <=", value, "sanniangongyibili");
            return (Criteria) this;
        }

        public Criteria andSanniangongyibiliIn(List<BigDecimal> values) {
            addCriterion("SANNIANGONGYIBILI in", values, "sanniangongyibili");
            return (Criteria) this;
        }

        public Criteria andSanniangongyibiliNotIn(List<BigDecimal> values) {
            addCriterion("SANNIANGONGYIBILI not in", values, "sanniangongyibili");
            return (Criteria) this;
        }

        public Criteria andSanniangongyibiliBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SANNIANGONGYIBILI between", value1, value2, "sanniangongyibili");
            return (Criteria) this;
        }

        public Criteria andSanniangongyibiliNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SANNIANGONGYIBILI not between", value1, value2, "sanniangongyibili");
            return (Criteria) this;
        }

        public Criteria andZongshourushangnianIsNull() {
            addCriterion("ZONGSHOURUSHANGNIAN is null");
            return (Criteria) this;
        }

        public Criteria andZongshourushangnianIsNotNull() {
            addCriterion("ZONGSHOURUSHANGNIAN is not null");
            return (Criteria) this;
        }

        public Criteria andZongshourushangnianEqualTo(BigDecimal value) {
            addCriterion("ZONGSHOURUSHANGNIAN =", value, "zongshourushangnian");
            return (Criteria) this;
        }

        public Criteria andZongshourushangnianNotEqualTo(BigDecimal value) {
            addCriterion("ZONGSHOURUSHANGNIAN <>", value, "zongshourushangnian");
            return (Criteria) this;
        }

        public Criteria andZongshourushangnianGreaterThan(BigDecimal value) {
            addCriterion("ZONGSHOURUSHANGNIAN >", value, "zongshourushangnian");
            return (Criteria) this;
        }

        public Criteria andZongshourushangnianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZONGSHOURUSHANGNIAN >=", value, "zongshourushangnian");
            return (Criteria) this;
        }

        public Criteria andZongshourushangnianLessThan(BigDecimal value) {
            addCriterion("ZONGSHOURUSHANGNIAN <", value, "zongshourushangnian");
            return (Criteria) this;
        }

        public Criteria andZongshourushangnianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZONGSHOURUSHANGNIAN <=", value, "zongshourushangnian");
            return (Criteria) this;
        }

        public Criteria andZongshourushangnianIn(List<BigDecimal> values) {
            addCriterion("ZONGSHOURUSHANGNIAN in", values, "zongshourushangnian");
            return (Criteria) this;
        }

        public Criteria andZongshourushangnianNotIn(List<BigDecimal> values) {
            addCriterion("ZONGSHOURUSHANGNIAN not in", values, "zongshourushangnian");
            return (Criteria) this;
        }

        public Criteria andZongshourushangnianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZONGSHOURUSHANGNIAN between", value1, value2, "zongshourushangnian");
            return (Criteria) this;
        }

        public Criteria andZongshourushangnianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZONGSHOURUSHANGNIAN not between", value1, value2, "zongshourushangnian");
            return (Criteria) this;
        }

        public Criteria andZongshouruqiannianIsNull() {
            addCriterion("ZONGSHOURUQIANNIAN is null");
            return (Criteria) this;
        }

        public Criteria andZongshouruqiannianIsNotNull() {
            addCriterion("ZONGSHOURUQIANNIAN is not null");
            return (Criteria) this;
        }

        public Criteria andZongshouruqiannianEqualTo(BigDecimal value) {
            addCriterion("ZONGSHOURUQIANNIAN =", value, "zongshouruqiannian");
            return (Criteria) this;
        }

        public Criteria andZongshouruqiannianNotEqualTo(BigDecimal value) {
            addCriterion("ZONGSHOURUQIANNIAN <>", value, "zongshouruqiannian");
            return (Criteria) this;
        }

        public Criteria andZongshouruqiannianGreaterThan(BigDecimal value) {
            addCriterion("ZONGSHOURUQIANNIAN >", value, "zongshouruqiannian");
            return (Criteria) this;
        }

        public Criteria andZongshouruqiannianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZONGSHOURUQIANNIAN >=", value, "zongshouruqiannian");
            return (Criteria) this;
        }

        public Criteria andZongshouruqiannianLessThan(BigDecimal value) {
            addCriterion("ZONGSHOURUQIANNIAN <", value, "zongshouruqiannian");
            return (Criteria) this;
        }

        public Criteria andZongshouruqiannianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZONGSHOURUQIANNIAN <=", value, "zongshouruqiannian");
            return (Criteria) this;
        }

        public Criteria andZongshouruqiannianIn(List<BigDecimal> values) {
            addCriterion("ZONGSHOURUQIANNIAN in", values, "zongshouruqiannian");
            return (Criteria) this;
        }

        public Criteria andZongshouruqiannianNotIn(List<BigDecimal> values) {
            addCriterion("ZONGSHOURUQIANNIAN not in", values, "zongshouruqiannian");
            return (Criteria) this;
        }

        public Criteria andZongshouruqiannianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZONGSHOURUQIANNIAN between", value1, value2, "zongshouruqiannian");
            return (Criteria) this;
        }

        public Criteria andZongshouruqiannianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZONGSHOURUQIANNIAN not between", value1, value2, "zongshouruqiannian");
            return (Criteria) this;
        }

        public Criteria andFulizhichushangnianIsNull() {
            addCriterion("FULIZHICHUSHANGNIAN is null");
            return (Criteria) this;
        }

        public Criteria andFulizhichushangnianIsNotNull() {
            addCriterion("FULIZHICHUSHANGNIAN is not null");
            return (Criteria) this;
        }

        public Criteria andFulizhichushangnianEqualTo(BigDecimal value) {
            addCriterion("FULIZHICHUSHANGNIAN =", value, "fulizhichushangnian");
            return (Criteria) this;
        }

        public Criteria andFulizhichushangnianNotEqualTo(BigDecimal value) {
            addCriterion("FULIZHICHUSHANGNIAN <>", value, "fulizhichushangnian");
            return (Criteria) this;
        }

        public Criteria andFulizhichushangnianGreaterThan(BigDecimal value) {
            addCriterion("FULIZHICHUSHANGNIAN >", value, "fulizhichushangnian");
            return (Criteria) this;
        }

        public Criteria andFulizhichushangnianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FULIZHICHUSHANGNIAN >=", value, "fulizhichushangnian");
            return (Criteria) this;
        }

        public Criteria andFulizhichushangnianLessThan(BigDecimal value) {
            addCriterion("FULIZHICHUSHANGNIAN <", value, "fulizhichushangnian");
            return (Criteria) this;
        }

        public Criteria andFulizhichushangnianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FULIZHICHUSHANGNIAN <=", value, "fulizhichushangnian");
            return (Criteria) this;
        }

        public Criteria andFulizhichushangnianIn(List<BigDecimal> values) {
            addCriterion("FULIZHICHUSHANGNIAN in", values, "fulizhichushangnian");
            return (Criteria) this;
        }

        public Criteria andFulizhichushangnianNotIn(List<BigDecimal> values) {
            addCriterion("FULIZHICHUSHANGNIAN not in", values, "fulizhichushangnian");
            return (Criteria) this;
        }

        public Criteria andFulizhichushangnianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FULIZHICHUSHANGNIAN between", value1, value2, "fulizhichushangnian");
            return (Criteria) this;
        }

        public Criteria andFulizhichushangnianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FULIZHICHUSHANGNIAN not between", value1, value2, "fulizhichushangnian");
            return (Criteria) this;
        }

        public Criteria andGongyizhichuqiannianIsNull() {
            addCriterion("GONGYIZHICHUQIANNIAN is null");
            return (Criteria) this;
        }

        public Criteria andGongyizhichuqiannianIsNotNull() {
            addCriterion("GONGYIZHICHUQIANNIAN is not null");
            return (Criteria) this;
        }

        public Criteria andGongyizhichuqiannianEqualTo(BigDecimal value) {
            addCriterion("GONGYIZHICHUQIANNIAN =", value, "gongyizhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andGongyizhichuqiannianNotEqualTo(BigDecimal value) {
            addCriterion("GONGYIZHICHUQIANNIAN <>", value, "gongyizhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andGongyizhichuqiannianGreaterThan(BigDecimal value) {
            addCriterion("GONGYIZHICHUQIANNIAN >", value, "gongyizhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andGongyizhichuqiannianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GONGYIZHICHUQIANNIAN >=", value, "gongyizhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andGongyizhichuqiannianLessThan(BigDecimal value) {
            addCriterion("GONGYIZHICHUQIANNIAN <", value, "gongyizhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andGongyizhichuqiannianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GONGYIZHICHUQIANNIAN <=", value, "gongyizhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andGongyizhichuqiannianIn(List<BigDecimal> values) {
            addCriterion("GONGYIZHICHUQIANNIAN in", values, "gongyizhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andGongyizhichuqiannianNotIn(List<BigDecimal> values) {
            addCriterion("GONGYIZHICHUQIANNIAN not in", values, "gongyizhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andGongyizhichuqiannianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GONGYIZHICHUQIANNIAN between", value1, value2, "gongyizhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andGongyizhichuqiannianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GONGYIZHICHUQIANNIAN not between", value1, value2, "gongyizhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andGongyizhichushangnianIsNull() {
            addCriterion("GONGYIZHICHUSHANGNIAN is null");
            return (Criteria) this;
        }

        public Criteria andGongyizhichushangnianIsNotNull() {
            addCriterion("GONGYIZHICHUSHANGNIAN is not null");
            return (Criteria) this;
        }

        public Criteria andGongyizhichushangnianEqualTo(BigDecimal value) {
            addCriterion("GONGYIZHICHUSHANGNIAN =", value, "gongyizhichushangnian");
            return (Criteria) this;
        }

        public Criteria andGongyizhichushangnianNotEqualTo(BigDecimal value) {
            addCriterion("GONGYIZHICHUSHANGNIAN <>", value, "gongyizhichushangnian");
            return (Criteria) this;
        }

        public Criteria andGongyizhichushangnianGreaterThan(BigDecimal value) {
            addCriterion("GONGYIZHICHUSHANGNIAN >", value, "gongyizhichushangnian");
            return (Criteria) this;
        }

        public Criteria andGongyizhichushangnianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GONGYIZHICHUSHANGNIAN >=", value, "gongyizhichushangnian");
            return (Criteria) this;
        }

        public Criteria andGongyizhichushangnianLessThan(BigDecimal value) {
            addCriterion("GONGYIZHICHUSHANGNIAN <", value, "gongyizhichushangnian");
            return (Criteria) this;
        }

        public Criteria andGongyizhichushangnianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GONGYIZHICHUSHANGNIAN <=", value, "gongyizhichushangnian");
            return (Criteria) this;
        }

        public Criteria andGongyizhichushangnianIn(List<BigDecimal> values) {
            addCriterion("GONGYIZHICHUSHANGNIAN in", values, "gongyizhichushangnian");
            return (Criteria) this;
        }

        public Criteria andGongyizhichushangnianNotIn(List<BigDecimal> values) {
            addCriterion("GONGYIZHICHUSHANGNIAN not in", values, "gongyizhichushangnian");
            return (Criteria) this;
        }

        public Criteria andGongyizhichushangnianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GONGYIZHICHUSHANGNIAN between", value1, value2, "gongyizhichushangnian");
            return (Criteria) this;
        }

        public Criteria andGongyizhichushangnianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GONGYIZHICHUSHANGNIAN not between", value1, value2, "gongyizhichushangnian");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichushangnianIsNull() {
            addCriterion("XINGZHENGZHICHUSHANGNIAN is null");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichushangnianIsNotNull() {
            addCriterion("XINGZHENGZHICHUSHANGNIAN is not null");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichushangnianEqualTo(BigDecimal value) {
            addCriterion("XINGZHENGZHICHUSHANGNIAN =", value, "xingzhengzhichushangnian");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichushangnianNotEqualTo(BigDecimal value) {
            addCriterion("XINGZHENGZHICHUSHANGNIAN <>", value, "xingzhengzhichushangnian");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichushangnianGreaterThan(BigDecimal value) {
            addCriterion("XINGZHENGZHICHUSHANGNIAN >", value, "xingzhengzhichushangnian");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichushangnianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XINGZHENGZHICHUSHANGNIAN >=", value, "xingzhengzhichushangnian");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichushangnianLessThan(BigDecimal value) {
            addCriterion("XINGZHENGZHICHUSHANGNIAN <", value, "xingzhengzhichushangnian");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichushangnianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XINGZHENGZHICHUSHANGNIAN <=", value, "xingzhengzhichushangnian");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichushangnianIn(List<BigDecimal> values) {
            addCriterion("XINGZHENGZHICHUSHANGNIAN in", values, "xingzhengzhichushangnian");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichushangnianNotIn(List<BigDecimal> values) {
            addCriterion("XINGZHENGZHICHUSHANGNIAN not in", values, "xingzhengzhichushangnian");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichushangnianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XINGZHENGZHICHUSHANGNIAN between", value1, value2, "xingzhengzhichushangnian");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichushangnianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XINGZHENGZHICHUSHANGNIAN not between", value1, value2, "xingzhengzhichushangnian");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichuqiannianIsNull() {
            addCriterion("XINGZHENGZHICHUQIANNIAN is null");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichuqiannianIsNotNull() {
            addCriterion("XINGZHENGZHICHUQIANNIAN is not null");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichuqiannianEqualTo(BigDecimal value) {
            addCriterion("XINGZHENGZHICHUQIANNIAN =", value, "xingzhengzhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichuqiannianNotEqualTo(BigDecimal value) {
            addCriterion("XINGZHENGZHICHUQIANNIAN <>", value, "xingzhengzhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichuqiannianGreaterThan(BigDecimal value) {
            addCriterion("XINGZHENGZHICHUQIANNIAN >", value, "xingzhengzhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichuqiannianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XINGZHENGZHICHUQIANNIAN >=", value, "xingzhengzhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichuqiannianLessThan(BigDecimal value) {
            addCriterion("XINGZHENGZHICHUQIANNIAN <", value, "xingzhengzhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichuqiannianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XINGZHENGZHICHUQIANNIAN <=", value, "xingzhengzhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichuqiannianIn(List<BigDecimal> values) {
            addCriterion("XINGZHENGZHICHUQIANNIAN in", values, "xingzhengzhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichuqiannianNotIn(List<BigDecimal> values) {
            addCriterion("XINGZHENGZHICHUQIANNIAN not in", values, "xingzhengzhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichuqiannianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XINGZHENGZHICHUQIANNIAN between", value1, value2, "xingzhengzhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andXingzhengzhichuqiannianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XINGZHENGZHICHUQIANNIAN not between", value1, value2, "xingzhengzhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andFulizhichuqiannianIsNull() {
            addCriterion("FULIZHICHUQIANNIAN is null");
            return (Criteria) this;
        }

        public Criteria andFulizhichuqiannianIsNotNull() {
            addCriterion("FULIZHICHUQIANNIAN is not null");
            return (Criteria) this;
        }

        public Criteria andFulizhichuqiannianEqualTo(BigDecimal value) {
            addCriterion("FULIZHICHUQIANNIAN =", value, "fulizhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andFulizhichuqiannianNotEqualTo(BigDecimal value) {
            addCriterion("FULIZHICHUQIANNIAN <>", value, "fulizhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andFulizhichuqiannianGreaterThan(BigDecimal value) {
            addCriterion("FULIZHICHUQIANNIAN >", value, "fulizhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andFulizhichuqiannianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FULIZHICHUQIANNIAN >=", value, "fulizhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andFulizhichuqiannianLessThan(BigDecimal value) {
            addCriterion("FULIZHICHUQIANNIAN <", value, "fulizhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andFulizhichuqiannianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FULIZHICHUQIANNIAN <=", value, "fulizhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andFulizhichuqiannianIn(List<BigDecimal> values) {
            addCriterion("FULIZHICHUQIANNIAN in", values, "fulizhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andFulizhichuqiannianNotIn(List<BigDecimal> values) {
            addCriterion("FULIZHICHUQIANNIAN not in", values, "fulizhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andFulizhichuqiannianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FULIZHICHUQIANNIAN between", value1, value2, "fulizhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andFulizhichuqiannianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FULIZHICHUQIANNIAN not between", value1, value2, "fulizhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andLiangnianfulibiliIsNull() {
            addCriterion("LIANGNIANFULIBILI is null");
            return (Criteria) this;
        }

        public Criteria andLiangnianfulibiliIsNotNull() {
            addCriterion("LIANGNIANFULIBILI is not null");
            return (Criteria) this;
        }

        public Criteria andLiangnianfulibiliEqualTo(BigDecimal value) {
            addCriterion("LIANGNIANFULIBILI =", value, "liangnianfulibili");
            return (Criteria) this;
        }

        public Criteria andLiangnianfulibiliNotEqualTo(BigDecimal value) {
            addCriterion("LIANGNIANFULIBILI <>", value, "liangnianfulibili");
            return (Criteria) this;
        }

        public Criteria andLiangnianfulibiliGreaterThan(BigDecimal value) {
            addCriterion("LIANGNIANFULIBILI >", value, "liangnianfulibili");
            return (Criteria) this;
        }

        public Criteria andLiangnianfulibiliGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIANGNIANFULIBILI >=", value, "liangnianfulibili");
            return (Criteria) this;
        }

        public Criteria andLiangnianfulibiliLessThan(BigDecimal value) {
            addCriterion("LIANGNIANFULIBILI <", value, "liangnianfulibili");
            return (Criteria) this;
        }

        public Criteria andLiangnianfulibiliLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIANGNIANFULIBILI <=", value, "liangnianfulibili");
            return (Criteria) this;
        }

        public Criteria andLiangnianfulibiliIn(List<BigDecimal> values) {
            addCriterion("LIANGNIANFULIBILI in", values, "liangnianfulibili");
            return (Criteria) this;
        }

        public Criteria andLiangnianfulibiliNotIn(List<BigDecimal> values) {
            addCriterion("LIANGNIANFULIBILI not in", values, "liangnianfulibili");
            return (Criteria) this;
        }

        public Criteria andLiangnianfulibiliBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIANGNIANFULIBILI between", value1, value2, "liangnianfulibili");
            return (Criteria) this;
        }

        public Criteria andLiangnianfulibiliNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIANGNIANFULIBILI not between", value1, value2, "liangnianfulibili");
            return (Criteria) this;
        }

        public Criteria andSannianfulibiliIsNull() {
            addCriterion("SANNIANFULIBILI is null");
            return (Criteria) this;
        }

        public Criteria andSannianfulibiliIsNotNull() {
            addCriterion("SANNIANFULIBILI is not null");
            return (Criteria) this;
        }

        public Criteria andSannianfulibiliEqualTo(BigDecimal value) {
            addCriterion("SANNIANFULIBILI =", value, "sannianfulibili");
            return (Criteria) this;
        }

        public Criteria andSannianfulibiliNotEqualTo(BigDecimal value) {
            addCriterion("SANNIANFULIBILI <>", value, "sannianfulibili");
            return (Criteria) this;
        }

        public Criteria andSannianfulibiliGreaterThan(BigDecimal value) {
            addCriterion("SANNIANFULIBILI >", value, "sannianfulibili");
            return (Criteria) this;
        }

        public Criteria andSannianfulibiliGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SANNIANFULIBILI >=", value, "sannianfulibili");
            return (Criteria) this;
        }

        public Criteria andSannianfulibiliLessThan(BigDecimal value) {
            addCriterion("SANNIANFULIBILI <", value, "sannianfulibili");
            return (Criteria) this;
        }

        public Criteria andSannianfulibiliLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SANNIANFULIBILI <=", value, "sannianfulibili");
            return (Criteria) this;
        }

        public Criteria andSannianfulibiliIn(List<BigDecimal> values) {
            addCriterion("SANNIANFULIBILI in", values, "sannianfulibili");
            return (Criteria) this;
        }

        public Criteria andSannianfulibiliNotIn(List<BigDecimal> values) {
            addCriterion("SANNIANFULIBILI not in", values, "sannianfulibili");
            return (Criteria) this;
        }

        public Criteria andSannianfulibiliBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SANNIANFULIBILI between", value1, value2, "sannianfulibili");
            return (Criteria) this;
        }

        public Criteria andSannianfulibiliNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SANNIANFULIBILI not between", value1, value2, "sannianfulibili");
            return (Criteria) this;
        }

        public Criteria andZongzhichuqiannianIsNull() {
            addCriterion("ZONGZHICHUQIANNIAN is null");
            return (Criteria) this;
        }

        public Criteria andZongzhichuqiannianIsNotNull() {
            addCriterion("ZONGZHICHUQIANNIAN is not null");
            return (Criteria) this;
        }

        public Criteria andZongzhichuqiannianEqualTo(BigDecimal value) {
            addCriterion("ZONGZHICHUQIANNIAN =", value, "zongzhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andZongzhichuqiannianNotEqualTo(BigDecimal value) {
            addCriterion("ZONGZHICHUQIANNIAN <>", value, "zongzhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andZongzhichuqiannianGreaterThan(BigDecimal value) {
            addCriterion("ZONGZHICHUQIANNIAN >", value, "zongzhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andZongzhichuqiannianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZONGZHICHUQIANNIAN >=", value, "zongzhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andZongzhichuqiannianLessThan(BigDecimal value) {
            addCriterion("ZONGZHICHUQIANNIAN <", value, "zongzhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andZongzhichuqiannianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZONGZHICHUQIANNIAN <=", value, "zongzhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andZongzhichuqiannianIn(List<BigDecimal> values) {
            addCriterion("ZONGZHICHUQIANNIAN in", values, "zongzhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andZongzhichuqiannianNotIn(List<BigDecimal> values) {
            addCriterion("ZONGZHICHUQIANNIAN not in", values, "zongzhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andZongzhichuqiannianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZONGZHICHUQIANNIAN between", value1, value2, "zongzhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andZongzhichuqiannianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZONGZHICHUQIANNIAN not between", value1, value2, "zongzhichuqiannian");
            return (Criteria) this;
        }

        public Criteria andZongzhichushangnianIsNull() {
            addCriterion("ZONGZHICHUSHANGNIAN is null");
            return (Criteria) this;
        }

        public Criteria andZongzhichushangnianIsNotNull() {
            addCriterion("ZONGZHICHUSHANGNIAN is not null");
            return (Criteria) this;
        }

        public Criteria andZongzhichushangnianEqualTo(BigDecimal value) {
            addCriterion("ZONGZHICHUSHANGNIAN =", value, "zongzhichushangnian");
            return (Criteria) this;
        }

        public Criteria andZongzhichushangnianNotEqualTo(BigDecimal value) {
            addCriterion("ZONGZHICHUSHANGNIAN <>", value, "zongzhichushangnian");
            return (Criteria) this;
        }

        public Criteria andZongzhichushangnianGreaterThan(BigDecimal value) {
            addCriterion("ZONGZHICHUSHANGNIAN >", value, "zongzhichushangnian");
            return (Criteria) this;
        }

        public Criteria andZongzhichushangnianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZONGZHICHUSHANGNIAN >=", value, "zongzhichushangnian");
            return (Criteria) this;
        }

        public Criteria andZongzhichushangnianLessThan(BigDecimal value) {
            addCriterion("ZONGZHICHUSHANGNIAN <", value, "zongzhichushangnian");
            return (Criteria) this;
        }

        public Criteria andZongzhichushangnianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZONGZHICHUSHANGNIAN <=", value, "zongzhichushangnian");
            return (Criteria) this;
        }

        public Criteria andZongzhichushangnianIn(List<BigDecimal> values) {
            addCriterion("ZONGZHICHUSHANGNIAN in", values, "zongzhichushangnian");
            return (Criteria) this;
        }

        public Criteria andZongzhichushangnianNotIn(List<BigDecimal> values) {
            addCriterion("ZONGZHICHUSHANGNIAN not in", values, "zongzhichushangnian");
            return (Criteria) this;
        }

        public Criteria andZongzhichushangnianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZONGZHICHUSHANGNIAN between", value1, value2, "zongzhichushangnian");
            return (Criteria) this;
        }

        public Criteria andZongzhichushangnianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZONGZHICHUSHANGNIAN not between", value1, value2, "zongzhichushangnian");
            return (Criteria) this;
        }

        public Criteria andIfcharityIsNull() {
            addCriterion("IFCHARITY is null");
            return (Criteria) this;
        }

        public Criteria andIfcharityIsNotNull() {
            addCriterion("IFCHARITY is not null");
            return (Criteria) this;
        }

        public Criteria andIfcharityEqualTo(Short value) {
            addCriterion("IFCHARITY =", value, "ifcharity");
            return (Criteria) this;
        }

        public Criteria andIfcharityNotEqualTo(Short value) {
            addCriterion("IFCHARITY <>", value, "ifcharity");
            return (Criteria) this;
        }

        public Criteria andIfcharityGreaterThan(Short value) {
            addCriterion("IFCHARITY >", value, "ifcharity");
            return (Criteria) this;
        }

        public Criteria andIfcharityGreaterThanOrEqualTo(Short value) {
            addCriterion("IFCHARITY >=", value, "ifcharity");
            return (Criteria) this;
        }

        public Criteria andIfcharityLessThan(Short value) {
            addCriterion("IFCHARITY <", value, "ifcharity");
            return (Criteria) this;
        }

        public Criteria andIfcharityLessThanOrEqualTo(Short value) {
            addCriterion("IFCHARITY <=", value, "ifcharity");
            return (Criteria) this;
        }

        public Criteria andIfcharityIn(List<Short> values) {
            addCriterion("IFCHARITY in", values, "ifcharity");
            return (Criteria) this;
        }

        public Criteria andIfcharityNotIn(List<Short> values) {
            addCriterion("IFCHARITY not in", values, "ifcharity");
            return (Criteria) this;
        }

        public Criteria andIfcharityBetween(Short value1, Short value2) {
            addCriterion("IFCHARITY between", value1, value2, "ifcharity");
            return (Criteria) this;
        }

        public Criteria andIfcharityNotBetween(Short value1, Short value2) {
            addCriterion("IFCHARITY not between", value1, value2, "ifcharity");
            return (Criteria) this;
        }

        public Criteria andIfcollectIsNull() {
            addCriterion("IFCOLLECT is null");
            return (Criteria) this;
        }

        public Criteria andIfcollectIsNotNull() {
            addCriterion("IFCOLLECT is not null");
            return (Criteria) this;
        }

        public Criteria andIfcollectEqualTo(Short value) {
            addCriterion("IFCOLLECT =", value, "ifcollect");
            return (Criteria) this;
        }

        public Criteria andIfcollectNotEqualTo(Short value) {
            addCriterion("IFCOLLECT <>", value, "ifcollect");
            return (Criteria) this;
        }

        public Criteria andIfcollectGreaterThan(Short value) {
            addCriterion("IFCOLLECT >", value, "ifcollect");
            return (Criteria) this;
        }

        public Criteria andIfcollectGreaterThanOrEqualTo(Short value) {
            addCriterion("IFCOLLECT >=", value, "ifcollect");
            return (Criteria) this;
        }

        public Criteria andIfcollectLessThan(Short value) {
            addCriterion("IFCOLLECT <", value, "ifcollect");
            return (Criteria) this;
        }

        public Criteria andIfcollectLessThanOrEqualTo(Short value) {
            addCriterion("IFCOLLECT <=", value, "ifcollect");
            return (Criteria) this;
        }

        public Criteria andIfcollectIn(List<Short> values) {
            addCriterion("IFCOLLECT in", values, "ifcollect");
            return (Criteria) this;
        }

        public Criteria andIfcollectNotIn(List<Short> values) {
            addCriterion("IFCOLLECT not in", values, "ifcollect");
            return (Criteria) this;
        }

        public Criteria andIfcollectBetween(Short value1, Short value2) {
            addCriterion("IFCOLLECT between", value1, value2, "ifcollect");
            return (Criteria) this;
        }

        public Criteria andIfcollectNotBetween(Short value1, Short value2) {
            addCriterion("IFCOLLECT not between", value1, value2, "ifcollect");
            return (Criteria) this;
        }

        public Criteria andCsFlagIsNull() {
            addCriterion("CS_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCsFlagIsNotNull() {
            addCriterion("CS_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCsFlagEqualTo(Short value) {
            addCriterion("CS_FLAG =", value, "csFlag");
            return (Criteria) this;
        }

        public Criteria andCsFlagNotEqualTo(Short value) {
            addCriterion("CS_FLAG <>", value, "csFlag");
            return (Criteria) this;
        }

        public Criteria andCsFlagGreaterThan(Short value) {
            addCriterion("CS_FLAG >", value, "csFlag");
            return (Criteria) this;
        }

        public Criteria andCsFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("CS_FLAG >=", value, "csFlag");
            return (Criteria) this;
        }

        public Criteria andCsFlagLessThan(Short value) {
            addCriterion("CS_FLAG <", value, "csFlag");
            return (Criteria) this;
        }

        public Criteria andCsFlagLessThanOrEqualTo(Short value) {
            addCriterion("CS_FLAG <=", value, "csFlag");
            return (Criteria) this;
        }

        public Criteria andCsFlagIn(List<Short> values) {
            addCriterion("CS_FLAG in", values, "csFlag");
            return (Criteria) this;
        }

        public Criteria andCsFlagNotIn(List<Short> values) {
            addCriterion("CS_FLAG not in", values, "csFlag");
            return (Criteria) this;
        }

        public Criteria andCsFlagBetween(Short value1, Short value2) {
            addCriterion("CS_FLAG between", value1, value2, "csFlag");
            return (Criteria) this;
        }

        public Criteria andCsFlagNotBetween(Short value1, Short value2) {
            addCriterion("CS_FLAG not between", value1, value2, "csFlag");
            return (Criteria) this;
        }

        public Criteria andMjFlagIsNull() {
            addCriterion("MJ_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andMjFlagIsNotNull() {
            addCriterion("MJ_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andMjFlagEqualTo(Short value) {
            addCriterion("MJ_FLAG =", value, "mjFlag");
            return (Criteria) this;
        }

        public Criteria andMjFlagNotEqualTo(Short value) {
            addCriterion("MJ_FLAG <>", value, "mjFlag");
            return (Criteria) this;
        }

        public Criteria andMjFlagGreaterThan(Short value) {
            addCriterion("MJ_FLAG >", value, "mjFlag");
            return (Criteria) this;
        }

        public Criteria andMjFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("MJ_FLAG >=", value, "mjFlag");
            return (Criteria) this;
        }

        public Criteria andMjFlagLessThan(Short value) {
            addCriterion("MJ_FLAG <", value, "mjFlag");
            return (Criteria) this;
        }

        public Criteria andMjFlagLessThanOrEqualTo(Short value) {
            addCriterion("MJ_FLAG <=", value, "mjFlag");
            return (Criteria) this;
        }

        public Criteria andMjFlagIn(List<Short> values) {
            addCriterion("MJ_FLAG in", values, "mjFlag");
            return (Criteria) this;
        }

        public Criteria andMjFlagNotIn(List<Short> values) {
            addCriterion("MJ_FLAG not in", values, "mjFlag");
            return (Criteria) this;
        }

        public Criteria andMjFlagBetween(Short value1, Short value2) {
            addCriterion("MJ_FLAG between", value1, value2, "mjFlag");
            return (Criteria) this;
        }

        public Criteria andMjFlagNotBetween(Short value1, Short value2) {
            addCriterion("MJ_FLAG not between", value1, value2, "mjFlag");
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