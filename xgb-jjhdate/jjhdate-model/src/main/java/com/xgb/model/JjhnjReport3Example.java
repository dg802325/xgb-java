package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JjhnjReport3Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JjhnjReport3Example() {
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

        public Criteria andBianzhidanweiIsNull() {
            addCriterion("BIANZHIDANWEI is null");
            return (Criteria) this;
        }

        public Criteria andBianzhidanweiIsNotNull() {
            addCriterion("BIANZHIDANWEI is not null");
            return (Criteria) this;
        }

        public Criteria andBianzhidanweiEqualTo(String value) {
            addCriterion("BIANZHIDANWEI =", value, "bianzhidanwei");
            return (Criteria) this;
        }

        public Criteria andBianzhidanweiNotEqualTo(String value) {
            addCriterion("BIANZHIDANWEI <>", value, "bianzhidanwei");
            return (Criteria) this;
        }

        public Criteria andBianzhidanweiGreaterThan(String value) {
            addCriterion("BIANZHIDANWEI >", value, "bianzhidanwei");
            return (Criteria) this;
        }

        public Criteria andBianzhidanweiGreaterThanOrEqualTo(String value) {
            addCriterion("BIANZHIDANWEI >=", value, "bianzhidanwei");
            return (Criteria) this;
        }

        public Criteria andBianzhidanweiLessThan(String value) {
            addCriterion("BIANZHIDANWEI <", value, "bianzhidanwei");
            return (Criteria) this;
        }

        public Criteria andBianzhidanweiLessThanOrEqualTo(String value) {
            addCriterion("BIANZHIDANWEI <=", value, "bianzhidanwei");
            return (Criteria) this;
        }

        public Criteria andBianzhidanweiLike(String value) {
            addCriterion("BIANZHIDANWEI like", value, "bianzhidanwei");
            return (Criteria) this;
        }

        public Criteria andBianzhidanweiNotLike(String value) {
            addCriterion("BIANZHIDANWEI not like", value, "bianzhidanwei");
            return (Criteria) this;
        }

        public Criteria andBianzhidanweiIn(List<String> values) {
            addCriterion("BIANZHIDANWEI in", values, "bianzhidanwei");
            return (Criteria) this;
        }

        public Criteria andBianzhidanweiNotIn(List<String> values) {
            addCriterion("BIANZHIDANWEI not in", values, "bianzhidanwei");
            return (Criteria) this;
        }

        public Criteria andBianzhidanweiBetween(String value1, String value2) {
            addCriterion("BIANZHIDANWEI between", value1, value2, "bianzhidanwei");
            return (Criteria) this;
        }

        public Criteria andBianzhidanweiNotBetween(String value1, String value2) {
            addCriterion("BIANZHIDANWEI not between", value1, value2, "bianzhidanwei");
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

        public Criteria andNianchushu1IsNull() {
            addCriterion("NIANCHUSHU1 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu1IsNotNull() {
            addCriterion("NIANCHUSHU1 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu1EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU1 =", value, "nianchushu1");
            return (Criteria) this;
        }

        public Criteria andNianchushu1NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU1 <>", value, "nianchushu1");
            return (Criteria) this;
        }

        public Criteria andNianchushu1GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU1 >", value, "nianchushu1");
            return (Criteria) this;
        }

        public Criteria andNianchushu1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU1 >=", value, "nianchushu1");
            return (Criteria) this;
        }

        public Criteria andNianchushu1LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU1 <", value, "nianchushu1");
            return (Criteria) this;
        }

        public Criteria andNianchushu1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU1 <=", value, "nianchushu1");
            return (Criteria) this;
        }

        public Criteria andNianchushu1In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU1 in", values, "nianchushu1");
            return (Criteria) this;
        }

        public Criteria andNianchushu1NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU1 not in", values, "nianchushu1");
            return (Criteria) this;
        }

        public Criteria andNianchushu1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU1 between", value1, value2, "nianchushu1");
            return (Criteria) this;
        }

        public Criteria andNianchushu1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU1 not between", value1, value2, "nianchushu1");
            return (Criteria) this;
        }

        public Criteria andQimoshu1IsNull() {
            addCriterion("QIMOSHU1 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu1IsNotNull() {
            addCriterion("QIMOSHU1 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu1EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU1 =", value, "qimoshu1");
            return (Criteria) this;
        }

        public Criteria andQimoshu1NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU1 <>", value, "qimoshu1");
            return (Criteria) this;
        }

        public Criteria andQimoshu1GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU1 >", value, "qimoshu1");
            return (Criteria) this;
        }

        public Criteria andQimoshu1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU1 >=", value, "qimoshu1");
            return (Criteria) this;
        }

        public Criteria andQimoshu1LessThan(BigDecimal value) {
            addCriterion("QIMOSHU1 <", value, "qimoshu1");
            return (Criteria) this;
        }

        public Criteria andQimoshu1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU1 <=", value, "qimoshu1");
            return (Criteria) this;
        }

        public Criteria andQimoshu1In(List<BigDecimal> values) {
            addCriterion("QIMOSHU1 in", values, "qimoshu1");
            return (Criteria) this;
        }

        public Criteria andQimoshu1NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU1 not in", values, "qimoshu1");
            return (Criteria) this;
        }

        public Criteria andQimoshu1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU1 between", value1, value2, "qimoshu1");
            return (Criteria) this;
        }

        public Criteria andQimoshu1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU1 not between", value1, value2, "qimoshu1");
            return (Criteria) this;
        }

        public Criteria andNianchushu23IsNull() {
            addCriterion("NIANCHUSHU23 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu23IsNotNull() {
            addCriterion("NIANCHUSHU23 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu23EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU23 =", value, "nianchushu23");
            return (Criteria) this;
        }

        public Criteria andNianchushu23NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU23 <>", value, "nianchushu23");
            return (Criteria) this;
        }

        public Criteria andNianchushu23GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU23 >", value, "nianchushu23");
            return (Criteria) this;
        }

        public Criteria andNianchushu23GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU23 >=", value, "nianchushu23");
            return (Criteria) this;
        }

        public Criteria andNianchushu23LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU23 <", value, "nianchushu23");
            return (Criteria) this;
        }

        public Criteria andNianchushu23LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU23 <=", value, "nianchushu23");
            return (Criteria) this;
        }

        public Criteria andNianchushu23In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU23 in", values, "nianchushu23");
            return (Criteria) this;
        }

        public Criteria andNianchushu23NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU23 not in", values, "nianchushu23");
            return (Criteria) this;
        }

        public Criteria andNianchushu23Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU23 between", value1, value2, "nianchushu23");
            return (Criteria) this;
        }

        public Criteria andNianchushu23NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU23 not between", value1, value2, "nianchushu23");
            return (Criteria) this;
        }

        public Criteria andQimoshu22IsNull() {
            addCriterion("QIMOSHU22 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu22IsNotNull() {
            addCriterion("QIMOSHU22 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu22EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU22 =", value, "qimoshu22");
            return (Criteria) this;
        }

        public Criteria andQimoshu22NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU22 <>", value, "qimoshu22");
            return (Criteria) this;
        }

        public Criteria andQimoshu22GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU22 >", value, "qimoshu22");
            return (Criteria) this;
        }

        public Criteria andQimoshu22GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU22 >=", value, "qimoshu22");
            return (Criteria) this;
        }

        public Criteria andQimoshu22LessThan(BigDecimal value) {
            addCriterion("QIMOSHU22 <", value, "qimoshu22");
            return (Criteria) this;
        }

        public Criteria andQimoshu22LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU22 <=", value, "qimoshu22");
            return (Criteria) this;
        }

        public Criteria andQimoshu22In(List<BigDecimal> values) {
            addCriterion("QIMOSHU22 in", values, "qimoshu22");
            return (Criteria) this;
        }

        public Criteria andQimoshu22NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU22 not in", values, "qimoshu22");
            return (Criteria) this;
        }

        public Criteria andQimoshu22Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU22 between", value1, value2, "qimoshu22");
            return (Criteria) this;
        }

        public Criteria andQimoshu22NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU22 not between", value1, value2, "qimoshu22");
            return (Criteria) this;
        }

        public Criteria andNianchushu2IsNull() {
            addCriterion("NIANCHUSHU2 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu2IsNotNull() {
            addCriterion("NIANCHUSHU2 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu2EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU2 =", value, "nianchushu2");
            return (Criteria) this;
        }

        public Criteria andNianchushu2NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU2 <>", value, "nianchushu2");
            return (Criteria) this;
        }

        public Criteria andNianchushu2GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU2 >", value, "nianchushu2");
            return (Criteria) this;
        }

        public Criteria andNianchushu2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU2 >=", value, "nianchushu2");
            return (Criteria) this;
        }

        public Criteria andNianchushu2LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU2 <", value, "nianchushu2");
            return (Criteria) this;
        }

        public Criteria andNianchushu2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU2 <=", value, "nianchushu2");
            return (Criteria) this;
        }

        public Criteria andNianchushu2In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU2 in", values, "nianchushu2");
            return (Criteria) this;
        }

        public Criteria andNianchushu2NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU2 not in", values, "nianchushu2");
            return (Criteria) this;
        }

        public Criteria andNianchushu2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU2 between", value1, value2, "nianchushu2");
            return (Criteria) this;
        }

        public Criteria andNianchushu2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU2 not between", value1, value2, "nianchushu2");
            return (Criteria) this;
        }

        public Criteria andQimoshu2IsNull() {
            addCriterion("QIMOSHU2 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu2IsNotNull() {
            addCriterion("QIMOSHU2 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu2EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU2 =", value, "qimoshu2");
            return (Criteria) this;
        }

        public Criteria andQimoshu2NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU2 <>", value, "qimoshu2");
            return (Criteria) this;
        }

        public Criteria andQimoshu2GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU2 >", value, "qimoshu2");
            return (Criteria) this;
        }

        public Criteria andQimoshu2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU2 >=", value, "qimoshu2");
            return (Criteria) this;
        }

        public Criteria andQimoshu2LessThan(BigDecimal value) {
            addCriterion("QIMOSHU2 <", value, "qimoshu2");
            return (Criteria) this;
        }

        public Criteria andQimoshu2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU2 <=", value, "qimoshu2");
            return (Criteria) this;
        }

        public Criteria andQimoshu2In(List<BigDecimal> values) {
            addCriterion("QIMOSHU2 in", values, "qimoshu2");
            return (Criteria) this;
        }

        public Criteria andQimoshu2NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU2 not in", values, "qimoshu2");
            return (Criteria) this;
        }

        public Criteria andQimoshu2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU2 between", value1, value2, "qimoshu2");
            return (Criteria) this;
        }

        public Criteria andQimoshu2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU2 not between", value1, value2, "qimoshu2");
            return (Criteria) this;
        }

        public Criteria andNianchushu24IsNull() {
            addCriterion("NIANCHUSHU24 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu24IsNotNull() {
            addCriterion("NIANCHUSHU24 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu24EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU24 =", value, "nianchushu24");
            return (Criteria) this;
        }

        public Criteria andNianchushu24NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU24 <>", value, "nianchushu24");
            return (Criteria) this;
        }

        public Criteria andNianchushu24GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU24 >", value, "nianchushu24");
            return (Criteria) this;
        }

        public Criteria andNianchushu24GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU24 >=", value, "nianchushu24");
            return (Criteria) this;
        }

        public Criteria andNianchushu24LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU24 <", value, "nianchushu24");
            return (Criteria) this;
        }

        public Criteria andNianchushu24LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU24 <=", value, "nianchushu24");
            return (Criteria) this;
        }

        public Criteria andNianchushu24In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU24 in", values, "nianchushu24");
            return (Criteria) this;
        }

        public Criteria andNianchushu24NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU24 not in", values, "nianchushu24");
            return (Criteria) this;
        }

        public Criteria andNianchushu24Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU24 between", value1, value2, "nianchushu24");
            return (Criteria) this;
        }

        public Criteria andNianchushu24NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU24 not between", value1, value2, "nianchushu24");
            return (Criteria) this;
        }

        public Criteria andQimoshu23IsNull() {
            addCriterion("QIMOSHU23 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu23IsNotNull() {
            addCriterion("QIMOSHU23 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu23EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU23 =", value, "qimoshu23");
            return (Criteria) this;
        }

        public Criteria andQimoshu23NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU23 <>", value, "qimoshu23");
            return (Criteria) this;
        }

        public Criteria andQimoshu23GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU23 >", value, "qimoshu23");
            return (Criteria) this;
        }

        public Criteria andQimoshu23GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU23 >=", value, "qimoshu23");
            return (Criteria) this;
        }

        public Criteria andQimoshu23LessThan(BigDecimal value) {
            addCriterion("QIMOSHU23 <", value, "qimoshu23");
            return (Criteria) this;
        }

        public Criteria andQimoshu23LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU23 <=", value, "qimoshu23");
            return (Criteria) this;
        }

        public Criteria andQimoshu23In(List<BigDecimal> values) {
            addCriterion("QIMOSHU23 in", values, "qimoshu23");
            return (Criteria) this;
        }

        public Criteria andQimoshu23NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU23 not in", values, "qimoshu23");
            return (Criteria) this;
        }

        public Criteria andQimoshu23Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU23 between", value1, value2, "qimoshu23");
            return (Criteria) this;
        }

        public Criteria andQimoshu23NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU23 not between", value1, value2, "qimoshu23");
            return (Criteria) this;
        }

        public Criteria andNianchushu3IsNull() {
            addCriterion("NIANCHUSHU3 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu3IsNotNull() {
            addCriterion("NIANCHUSHU3 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu3EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU3 =", value, "nianchushu3");
            return (Criteria) this;
        }

        public Criteria andNianchushu3NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU3 <>", value, "nianchushu3");
            return (Criteria) this;
        }

        public Criteria andNianchushu3GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU3 >", value, "nianchushu3");
            return (Criteria) this;
        }

        public Criteria andNianchushu3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU3 >=", value, "nianchushu3");
            return (Criteria) this;
        }

        public Criteria andNianchushu3LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU3 <", value, "nianchushu3");
            return (Criteria) this;
        }

        public Criteria andNianchushu3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU3 <=", value, "nianchushu3");
            return (Criteria) this;
        }

        public Criteria andNianchushu3In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU3 in", values, "nianchushu3");
            return (Criteria) this;
        }

        public Criteria andNianchushu3NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU3 not in", values, "nianchushu3");
            return (Criteria) this;
        }

        public Criteria andNianchushu3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU3 between", value1, value2, "nianchushu3");
            return (Criteria) this;
        }

        public Criteria andNianchushu3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU3 not between", value1, value2, "nianchushu3");
            return (Criteria) this;
        }

        public Criteria andQimoshu3IsNull() {
            addCriterion("QIMOSHU3 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu3IsNotNull() {
            addCriterion("QIMOSHU3 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu3EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU3 =", value, "qimoshu3");
            return (Criteria) this;
        }

        public Criteria andQimoshu3NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU3 <>", value, "qimoshu3");
            return (Criteria) this;
        }

        public Criteria andQimoshu3GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU3 >", value, "qimoshu3");
            return (Criteria) this;
        }

        public Criteria andQimoshu3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU3 >=", value, "qimoshu3");
            return (Criteria) this;
        }

        public Criteria andQimoshu3LessThan(BigDecimal value) {
            addCriterion("QIMOSHU3 <", value, "qimoshu3");
            return (Criteria) this;
        }

        public Criteria andQimoshu3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU3 <=", value, "qimoshu3");
            return (Criteria) this;
        }

        public Criteria andQimoshu3In(List<BigDecimal> values) {
            addCriterion("QIMOSHU3 in", values, "qimoshu3");
            return (Criteria) this;
        }

        public Criteria andQimoshu3NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU3 not in", values, "qimoshu3");
            return (Criteria) this;
        }

        public Criteria andQimoshu3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU3 between", value1, value2, "qimoshu3");
            return (Criteria) this;
        }

        public Criteria andQimoshu3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU3 not between", value1, value2, "qimoshu3");
            return (Criteria) this;
        }

        public Criteria andNianchushu25IsNull() {
            addCriterion("NIANCHUSHU25 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu25IsNotNull() {
            addCriterion("NIANCHUSHU25 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu25EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU25 =", value, "nianchushu25");
            return (Criteria) this;
        }

        public Criteria andNianchushu25NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU25 <>", value, "nianchushu25");
            return (Criteria) this;
        }

        public Criteria andNianchushu25GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU25 >", value, "nianchushu25");
            return (Criteria) this;
        }

        public Criteria andNianchushu25GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU25 >=", value, "nianchushu25");
            return (Criteria) this;
        }

        public Criteria andNianchushu25LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU25 <", value, "nianchushu25");
            return (Criteria) this;
        }

        public Criteria andNianchushu25LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU25 <=", value, "nianchushu25");
            return (Criteria) this;
        }

        public Criteria andNianchushu25In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU25 in", values, "nianchushu25");
            return (Criteria) this;
        }

        public Criteria andNianchushu25NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU25 not in", values, "nianchushu25");
            return (Criteria) this;
        }

        public Criteria andNianchushu25Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU25 between", value1, value2, "nianchushu25");
            return (Criteria) this;
        }

        public Criteria andNianchushu25NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU25 not between", value1, value2, "nianchushu25");
            return (Criteria) this;
        }

        public Criteria andQimoshu24IsNull() {
            addCriterion("QIMOSHU24 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu24IsNotNull() {
            addCriterion("QIMOSHU24 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu24EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU24 =", value, "qimoshu24");
            return (Criteria) this;
        }

        public Criteria andQimoshu24NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU24 <>", value, "qimoshu24");
            return (Criteria) this;
        }

        public Criteria andQimoshu24GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU24 >", value, "qimoshu24");
            return (Criteria) this;
        }

        public Criteria andQimoshu24GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU24 >=", value, "qimoshu24");
            return (Criteria) this;
        }

        public Criteria andQimoshu24LessThan(BigDecimal value) {
            addCriterion("QIMOSHU24 <", value, "qimoshu24");
            return (Criteria) this;
        }

        public Criteria andQimoshu24LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU24 <=", value, "qimoshu24");
            return (Criteria) this;
        }

        public Criteria andQimoshu24In(List<BigDecimal> values) {
            addCriterion("QIMOSHU24 in", values, "qimoshu24");
            return (Criteria) this;
        }

        public Criteria andQimoshu24NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU24 not in", values, "qimoshu24");
            return (Criteria) this;
        }

        public Criteria andQimoshu24Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU24 between", value1, value2, "qimoshu24");
            return (Criteria) this;
        }

        public Criteria andQimoshu24NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU24 not between", value1, value2, "qimoshu24");
            return (Criteria) this;
        }

        public Criteria andNianchushu4IsNull() {
            addCriterion("NIANCHUSHU4 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu4IsNotNull() {
            addCriterion("NIANCHUSHU4 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu4EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU4 =", value, "nianchushu4");
            return (Criteria) this;
        }

        public Criteria andNianchushu4NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU4 <>", value, "nianchushu4");
            return (Criteria) this;
        }

        public Criteria andNianchushu4GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU4 >", value, "nianchushu4");
            return (Criteria) this;
        }

        public Criteria andNianchushu4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU4 >=", value, "nianchushu4");
            return (Criteria) this;
        }

        public Criteria andNianchushu4LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU4 <", value, "nianchushu4");
            return (Criteria) this;
        }

        public Criteria andNianchushu4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU4 <=", value, "nianchushu4");
            return (Criteria) this;
        }

        public Criteria andNianchushu4In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU4 in", values, "nianchushu4");
            return (Criteria) this;
        }

        public Criteria andNianchushu4NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU4 not in", values, "nianchushu4");
            return (Criteria) this;
        }

        public Criteria andNianchushu4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU4 between", value1, value2, "nianchushu4");
            return (Criteria) this;
        }

        public Criteria andNianchushu4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU4 not between", value1, value2, "nianchushu4");
            return (Criteria) this;
        }

        public Criteria andQimoshu4IsNull() {
            addCriterion("QIMOSHU4 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu4IsNotNull() {
            addCriterion("QIMOSHU4 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu4EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU4 =", value, "qimoshu4");
            return (Criteria) this;
        }

        public Criteria andQimoshu4NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU4 <>", value, "qimoshu4");
            return (Criteria) this;
        }

        public Criteria andQimoshu4GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU4 >", value, "qimoshu4");
            return (Criteria) this;
        }

        public Criteria andQimoshu4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU4 >=", value, "qimoshu4");
            return (Criteria) this;
        }

        public Criteria andQimoshu4LessThan(BigDecimal value) {
            addCriterion("QIMOSHU4 <", value, "qimoshu4");
            return (Criteria) this;
        }

        public Criteria andQimoshu4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU4 <=", value, "qimoshu4");
            return (Criteria) this;
        }

        public Criteria andQimoshu4In(List<BigDecimal> values) {
            addCriterion("QIMOSHU4 in", values, "qimoshu4");
            return (Criteria) this;
        }

        public Criteria andQimoshu4NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU4 not in", values, "qimoshu4");
            return (Criteria) this;
        }

        public Criteria andQimoshu4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU4 between", value1, value2, "qimoshu4");
            return (Criteria) this;
        }

        public Criteria andQimoshu4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU4 not between", value1, value2, "qimoshu4");
            return (Criteria) this;
        }

        public Criteria andNianchushu26IsNull() {
            addCriterion("NIANCHUSHU26 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu26IsNotNull() {
            addCriterion("NIANCHUSHU26 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu26EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU26 =", value, "nianchushu26");
            return (Criteria) this;
        }

        public Criteria andNianchushu26NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU26 <>", value, "nianchushu26");
            return (Criteria) this;
        }

        public Criteria andNianchushu26GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU26 >", value, "nianchushu26");
            return (Criteria) this;
        }

        public Criteria andNianchushu26GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU26 >=", value, "nianchushu26");
            return (Criteria) this;
        }

        public Criteria andNianchushu26LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU26 <", value, "nianchushu26");
            return (Criteria) this;
        }

        public Criteria andNianchushu26LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU26 <=", value, "nianchushu26");
            return (Criteria) this;
        }

        public Criteria andNianchushu26In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU26 in", values, "nianchushu26");
            return (Criteria) this;
        }

        public Criteria andNianchushu26NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU26 not in", values, "nianchushu26");
            return (Criteria) this;
        }

        public Criteria andNianchushu26Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU26 between", value1, value2, "nianchushu26");
            return (Criteria) this;
        }

        public Criteria andNianchushu26NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU26 not between", value1, value2, "nianchushu26");
            return (Criteria) this;
        }

        public Criteria andQimoshu25IsNull() {
            addCriterion("QIMOSHU25 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu25IsNotNull() {
            addCriterion("QIMOSHU25 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu25EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU25 =", value, "qimoshu25");
            return (Criteria) this;
        }

        public Criteria andQimoshu25NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU25 <>", value, "qimoshu25");
            return (Criteria) this;
        }

        public Criteria andQimoshu25GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU25 >", value, "qimoshu25");
            return (Criteria) this;
        }

        public Criteria andQimoshu25GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU25 >=", value, "qimoshu25");
            return (Criteria) this;
        }

        public Criteria andQimoshu25LessThan(BigDecimal value) {
            addCriterion("QIMOSHU25 <", value, "qimoshu25");
            return (Criteria) this;
        }

        public Criteria andQimoshu25LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU25 <=", value, "qimoshu25");
            return (Criteria) this;
        }

        public Criteria andQimoshu25In(List<BigDecimal> values) {
            addCriterion("QIMOSHU25 in", values, "qimoshu25");
            return (Criteria) this;
        }

        public Criteria andQimoshu25NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU25 not in", values, "qimoshu25");
            return (Criteria) this;
        }

        public Criteria andQimoshu25Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU25 between", value1, value2, "qimoshu25");
            return (Criteria) this;
        }

        public Criteria andQimoshu25NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU25 not between", value1, value2, "qimoshu25");
            return (Criteria) this;
        }

        public Criteria andNianchushu5IsNull() {
            addCriterion("NIANCHUSHU5 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu5IsNotNull() {
            addCriterion("NIANCHUSHU5 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu5EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU5 =", value, "nianchushu5");
            return (Criteria) this;
        }

        public Criteria andNianchushu5NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU5 <>", value, "nianchushu5");
            return (Criteria) this;
        }

        public Criteria andNianchushu5GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU5 >", value, "nianchushu5");
            return (Criteria) this;
        }

        public Criteria andNianchushu5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU5 >=", value, "nianchushu5");
            return (Criteria) this;
        }

        public Criteria andNianchushu5LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU5 <", value, "nianchushu5");
            return (Criteria) this;
        }

        public Criteria andNianchushu5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU5 <=", value, "nianchushu5");
            return (Criteria) this;
        }

        public Criteria andNianchushu5In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU5 in", values, "nianchushu5");
            return (Criteria) this;
        }

        public Criteria andNianchushu5NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU5 not in", values, "nianchushu5");
            return (Criteria) this;
        }

        public Criteria andNianchushu5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU5 between", value1, value2, "nianchushu5");
            return (Criteria) this;
        }

        public Criteria andNianchushu5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU5 not between", value1, value2, "nianchushu5");
            return (Criteria) this;
        }

        public Criteria andQimoshu5IsNull() {
            addCriterion("QIMOSHU5 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu5IsNotNull() {
            addCriterion("QIMOSHU5 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu5EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU5 =", value, "qimoshu5");
            return (Criteria) this;
        }

        public Criteria andQimoshu5NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU5 <>", value, "qimoshu5");
            return (Criteria) this;
        }

        public Criteria andQimoshu5GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU5 >", value, "qimoshu5");
            return (Criteria) this;
        }

        public Criteria andQimoshu5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU5 >=", value, "qimoshu5");
            return (Criteria) this;
        }

        public Criteria andQimoshu5LessThan(BigDecimal value) {
            addCriterion("QIMOSHU5 <", value, "qimoshu5");
            return (Criteria) this;
        }

        public Criteria andQimoshu5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU5 <=", value, "qimoshu5");
            return (Criteria) this;
        }

        public Criteria andQimoshu5In(List<BigDecimal> values) {
            addCriterion("QIMOSHU5 in", values, "qimoshu5");
            return (Criteria) this;
        }

        public Criteria andQimoshu5NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU5 not in", values, "qimoshu5");
            return (Criteria) this;
        }

        public Criteria andQimoshu5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU5 between", value1, value2, "qimoshu5");
            return (Criteria) this;
        }

        public Criteria andQimoshu5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU5 not between", value1, value2, "qimoshu5");
            return (Criteria) this;
        }

        public Criteria andNianchushu27IsNull() {
            addCriterion("NIANCHUSHU27 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu27IsNotNull() {
            addCriterion("NIANCHUSHU27 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu27EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU27 =", value, "nianchushu27");
            return (Criteria) this;
        }

        public Criteria andNianchushu27NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU27 <>", value, "nianchushu27");
            return (Criteria) this;
        }

        public Criteria andNianchushu27GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU27 >", value, "nianchushu27");
            return (Criteria) this;
        }

        public Criteria andNianchushu27GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU27 >=", value, "nianchushu27");
            return (Criteria) this;
        }

        public Criteria andNianchushu27LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU27 <", value, "nianchushu27");
            return (Criteria) this;
        }

        public Criteria andNianchushu27LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU27 <=", value, "nianchushu27");
            return (Criteria) this;
        }

        public Criteria andNianchushu27In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU27 in", values, "nianchushu27");
            return (Criteria) this;
        }

        public Criteria andNianchushu27NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU27 not in", values, "nianchushu27");
            return (Criteria) this;
        }

        public Criteria andNianchushu27Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU27 between", value1, value2, "nianchushu27");
            return (Criteria) this;
        }

        public Criteria andNianchushu27NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU27 not between", value1, value2, "nianchushu27");
            return (Criteria) this;
        }

        public Criteria andQimoshu26IsNull() {
            addCriterion("QIMOSHU26 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu26IsNotNull() {
            addCriterion("QIMOSHU26 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu26EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU26 =", value, "qimoshu26");
            return (Criteria) this;
        }

        public Criteria andQimoshu26NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU26 <>", value, "qimoshu26");
            return (Criteria) this;
        }

        public Criteria andQimoshu26GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU26 >", value, "qimoshu26");
            return (Criteria) this;
        }

        public Criteria andQimoshu26GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU26 >=", value, "qimoshu26");
            return (Criteria) this;
        }

        public Criteria andQimoshu26LessThan(BigDecimal value) {
            addCriterion("QIMOSHU26 <", value, "qimoshu26");
            return (Criteria) this;
        }

        public Criteria andQimoshu26LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU26 <=", value, "qimoshu26");
            return (Criteria) this;
        }

        public Criteria andQimoshu26In(List<BigDecimal> values) {
            addCriterion("QIMOSHU26 in", values, "qimoshu26");
            return (Criteria) this;
        }

        public Criteria andQimoshu26NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU26 not in", values, "qimoshu26");
            return (Criteria) this;
        }

        public Criteria andQimoshu26Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU26 between", value1, value2, "qimoshu26");
            return (Criteria) this;
        }

        public Criteria andQimoshu26NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU26 not between", value1, value2, "qimoshu26");
            return (Criteria) this;
        }

        public Criteria andNianchushu6IsNull() {
            addCriterion("NIANCHUSHU6 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu6IsNotNull() {
            addCriterion("NIANCHUSHU6 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu6EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU6 =", value, "nianchushu6");
            return (Criteria) this;
        }

        public Criteria andNianchushu6NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU6 <>", value, "nianchushu6");
            return (Criteria) this;
        }

        public Criteria andNianchushu6GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU6 >", value, "nianchushu6");
            return (Criteria) this;
        }

        public Criteria andNianchushu6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU6 >=", value, "nianchushu6");
            return (Criteria) this;
        }

        public Criteria andNianchushu6LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU6 <", value, "nianchushu6");
            return (Criteria) this;
        }

        public Criteria andNianchushu6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU6 <=", value, "nianchushu6");
            return (Criteria) this;
        }

        public Criteria andNianchushu6In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU6 in", values, "nianchushu6");
            return (Criteria) this;
        }

        public Criteria andNianchushu6NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU6 not in", values, "nianchushu6");
            return (Criteria) this;
        }

        public Criteria andNianchushu6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU6 between", value1, value2, "nianchushu6");
            return (Criteria) this;
        }

        public Criteria andNianchushu6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU6 not between", value1, value2, "nianchushu6");
            return (Criteria) this;
        }

        public Criteria andQimoshu6IsNull() {
            addCriterion("QIMOSHU6 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu6IsNotNull() {
            addCriterion("QIMOSHU6 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu6EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU6 =", value, "qimoshu6");
            return (Criteria) this;
        }

        public Criteria andQimoshu6NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU6 <>", value, "qimoshu6");
            return (Criteria) this;
        }

        public Criteria andQimoshu6GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU6 >", value, "qimoshu6");
            return (Criteria) this;
        }

        public Criteria andQimoshu6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU6 >=", value, "qimoshu6");
            return (Criteria) this;
        }

        public Criteria andQimoshu6LessThan(BigDecimal value) {
            addCriterion("QIMOSHU6 <", value, "qimoshu6");
            return (Criteria) this;
        }

        public Criteria andQimoshu6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU6 <=", value, "qimoshu6");
            return (Criteria) this;
        }

        public Criteria andQimoshu6In(List<BigDecimal> values) {
            addCriterion("QIMOSHU6 in", values, "qimoshu6");
            return (Criteria) this;
        }

        public Criteria andQimoshu6NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU6 not in", values, "qimoshu6");
            return (Criteria) this;
        }

        public Criteria andQimoshu6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU6 between", value1, value2, "qimoshu6");
            return (Criteria) this;
        }

        public Criteria andQimoshu6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU6 not between", value1, value2, "qimoshu6");
            return (Criteria) this;
        }

        public Criteria andNianchushu28IsNull() {
            addCriterion("NIANCHUSHU28 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu28IsNotNull() {
            addCriterion("NIANCHUSHU28 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu28EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU28 =", value, "nianchushu28");
            return (Criteria) this;
        }

        public Criteria andNianchushu28NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU28 <>", value, "nianchushu28");
            return (Criteria) this;
        }

        public Criteria andNianchushu28GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU28 >", value, "nianchushu28");
            return (Criteria) this;
        }

        public Criteria andNianchushu28GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU28 >=", value, "nianchushu28");
            return (Criteria) this;
        }

        public Criteria andNianchushu28LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU28 <", value, "nianchushu28");
            return (Criteria) this;
        }

        public Criteria andNianchushu28LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU28 <=", value, "nianchushu28");
            return (Criteria) this;
        }

        public Criteria andNianchushu28In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU28 in", values, "nianchushu28");
            return (Criteria) this;
        }

        public Criteria andNianchushu28NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU28 not in", values, "nianchushu28");
            return (Criteria) this;
        }

        public Criteria andNianchushu28Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU28 between", value1, value2, "nianchushu28");
            return (Criteria) this;
        }

        public Criteria andNianchushu28NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU28 not between", value1, value2, "nianchushu28");
            return (Criteria) this;
        }

        public Criteria andQimoshu27IsNull() {
            addCriterion("QIMOSHU27 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu27IsNotNull() {
            addCriterion("QIMOSHU27 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu27EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU27 =", value, "qimoshu27");
            return (Criteria) this;
        }

        public Criteria andQimoshu27NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU27 <>", value, "qimoshu27");
            return (Criteria) this;
        }

        public Criteria andQimoshu27GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU27 >", value, "qimoshu27");
            return (Criteria) this;
        }

        public Criteria andQimoshu27GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU27 >=", value, "qimoshu27");
            return (Criteria) this;
        }

        public Criteria andQimoshu27LessThan(BigDecimal value) {
            addCriterion("QIMOSHU27 <", value, "qimoshu27");
            return (Criteria) this;
        }

        public Criteria andQimoshu27LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU27 <=", value, "qimoshu27");
            return (Criteria) this;
        }

        public Criteria andQimoshu27In(List<BigDecimal> values) {
            addCriterion("QIMOSHU27 in", values, "qimoshu27");
            return (Criteria) this;
        }

        public Criteria andQimoshu27NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU27 not in", values, "qimoshu27");
            return (Criteria) this;
        }

        public Criteria andQimoshu27Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU27 between", value1, value2, "qimoshu27");
            return (Criteria) this;
        }

        public Criteria andQimoshu27NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU27 not between", value1, value2, "qimoshu27");
            return (Criteria) this;
        }

        public Criteria andNianchushu7IsNull() {
            addCriterion("NIANCHUSHU7 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu7IsNotNull() {
            addCriterion("NIANCHUSHU7 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu7EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU7 =", value, "nianchushu7");
            return (Criteria) this;
        }

        public Criteria andNianchushu7NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU7 <>", value, "nianchushu7");
            return (Criteria) this;
        }

        public Criteria andNianchushu7GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU7 >", value, "nianchushu7");
            return (Criteria) this;
        }

        public Criteria andNianchushu7GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU7 >=", value, "nianchushu7");
            return (Criteria) this;
        }

        public Criteria andNianchushu7LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU7 <", value, "nianchushu7");
            return (Criteria) this;
        }

        public Criteria andNianchushu7LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU7 <=", value, "nianchushu7");
            return (Criteria) this;
        }

        public Criteria andNianchushu7In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU7 in", values, "nianchushu7");
            return (Criteria) this;
        }

        public Criteria andNianchushu7NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU7 not in", values, "nianchushu7");
            return (Criteria) this;
        }

        public Criteria andNianchushu7Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU7 between", value1, value2, "nianchushu7");
            return (Criteria) this;
        }

        public Criteria andNianchushu7NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU7 not between", value1, value2, "nianchushu7");
            return (Criteria) this;
        }

        public Criteria andQimoshu7IsNull() {
            addCriterion("QIMOSHU7 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu7IsNotNull() {
            addCriterion("QIMOSHU7 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu7EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU7 =", value, "qimoshu7");
            return (Criteria) this;
        }

        public Criteria andQimoshu7NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU7 <>", value, "qimoshu7");
            return (Criteria) this;
        }

        public Criteria andQimoshu7GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU7 >", value, "qimoshu7");
            return (Criteria) this;
        }

        public Criteria andQimoshu7GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU7 >=", value, "qimoshu7");
            return (Criteria) this;
        }

        public Criteria andQimoshu7LessThan(BigDecimal value) {
            addCriterion("QIMOSHU7 <", value, "qimoshu7");
            return (Criteria) this;
        }

        public Criteria andQimoshu7LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU7 <=", value, "qimoshu7");
            return (Criteria) this;
        }

        public Criteria andQimoshu7In(List<BigDecimal> values) {
            addCriterion("QIMOSHU7 in", values, "qimoshu7");
            return (Criteria) this;
        }

        public Criteria andQimoshu7NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU7 not in", values, "qimoshu7");
            return (Criteria) this;
        }

        public Criteria andQimoshu7Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU7 between", value1, value2, "qimoshu7");
            return (Criteria) this;
        }

        public Criteria andQimoshu7NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU7 not between", value1, value2, "qimoshu7");
            return (Criteria) this;
        }

        public Criteria andNianchushu29IsNull() {
            addCriterion("NIANCHUSHU29 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu29IsNotNull() {
            addCriterion("NIANCHUSHU29 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu29EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU29 =", value, "nianchushu29");
            return (Criteria) this;
        }

        public Criteria andNianchushu29NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU29 <>", value, "nianchushu29");
            return (Criteria) this;
        }

        public Criteria andNianchushu29GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU29 >", value, "nianchushu29");
            return (Criteria) this;
        }

        public Criteria andNianchushu29GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU29 >=", value, "nianchushu29");
            return (Criteria) this;
        }

        public Criteria andNianchushu29LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU29 <", value, "nianchushu29");
            return (Criteria) this;
        }

        public Criteria andNianchushu29LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU29 <=", value, "nianchushu29");
            return (Criteria) this;
        }

        public Criteria andNianchushu29In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU29 in", values, "nianchushu29");
            return (Criteria) this;
        }

        public Criteria andNianchushu29NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU29 not in", values, "nianchushu29");
            return (Criteria) this;
        }

        public Criteria andNianchushu29Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU29 between", value1, value2, "nianchushu29");
            return (Criteria) this;
        }

        public Criteria andNianchushu29NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU29 not between", value1, value2, "nianchushu29");
            return (Criteria) this;
        }

        public Criteria andQimoshu28IsNull() {
            addCriterion("QIMOSHU28 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu28IsNotNull() {
            addCriterion("QIMOSHU28 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu28EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU28 =", value, "qimoshu28");
            return (Criteria) this;
        }

        public Criteria andQimoshu28NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU28 <>", value, "qimoshu28");
            return (Criteria) this;
        }

        public Criteria andQimoshu28GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU28 >", value, "qimoshu28");
            return (Criteria) this;
        }

        public Criteria andQimoshu28GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU28 >=", value, "qimoshu28");
            return (Criteria) this;
        }

        public Criteria andQimoshu28LessThan(BigDecimal value) {
            addCriterion("QIMOSHU28 <", value, "qimoshu28");
            return (Criteria) this;
        }

        public Criteria andQimoshu28LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU28 <=", value, "qimoshu28");
            return (Criteria) this;
        }

        public Criteria andQimoshu28In(List<BigDecimal> values) {
            addCriterion("QIMOSHU28 in", values, "qimoshu28");
            return (Criteria) this;
        }

        public Criteria andQimoshu28NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU28 not in", values, "qimoshu28");
            return (Criteria) this;
        }

        public Criteria andQimoshu28Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU28 between", value1, value2, "qimoshu28");
            return (Criteria) this;
        }

        public Criteria andQimoshu28NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU28 not between", value1, value2, "qimoshu28");
            return (Criteria) this;
        }

        public Criteria andNianchushu8IsNull() {
            addCriterion("NIANCHUSHU8 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu8IsNotNull() {
            addCriterion("NIANCHUSHU8 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu8EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU8 =", value, "nianchushu8");
            return (Criteria) this;
        }

        public Criteria andNianchushu8NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU8 <>", value, "nianchushu8");
            return (Criteria) this;
        }

        public Criteria andNianchushu8GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU8 >", value, "nianchushu8");
            return (Criteria) this;
        }

        public Criteria andNianchushu8GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU8 >=", value, "nianchushu8");
            return (Criteria) this;
        }

        public Criteria andNianchushu8LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU8 <", value, "nianchushu8");
            return (Criteria) this;
        }

        public Criteria andNianchushu8LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU8 <=", value, "nianchushu8");
            return (Criteria) this;
        }

        public Criteria andNianchushu8In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU8 in", values, "nianchushu8");
            return (Criteria) this;
        }

        public Criteria andNianchushu8NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU8 not in", values, "nianchushu8");
            return (Criteria) this;
        }

        public Criteria andNianchushu8Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU8 between", value1, value2, "nianchushu8");
            return (Criteria) this;
        }

        public Criteria andNianchushu8NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU8 not between", value1, value2, "nianchushu8");
            return (Criteria) this;
        }

        public Criteria andQimoshu8IsNull() {
            addCriterion("QIMOSHU8 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu8IsNotNull() {
            addCriterion("QIMOSHU8 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu8EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU8 =", value, "qimoshu8");
            return (Criteria) this;
        }

        public Criteria andQimoshu8NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU8 <>", value, "qimoshu8");
            return (Criteria) this;
        }

        public Criteria andQimoshu8GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU8 >", value, "qimoshu8");
            return (Criteria) this;
        }

        public Criteria andQimoshu8GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU8 >=", value, "qimoshu8");
            return (Criteria) this;
        }

        public Criteria andQimoshu8LessThan(BigDecimal value) {
            addCriterion("QIMOSHU8 <", value, "qimoshu8");
            return (Criteria) this;
        }

        public Criteria andQimoshu8LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU8 <=", value, "qimoshu8");
            return (Criteria) this;
        }

        public Criteria andQimoshu8In(List<BigDecimal> values) {
            addCriterion("QIMOSHU8 in", values, "qimoshu8");
            return (Criteria) this;
        }

        public Criteria andQimoshu8NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU8 not in", values, "qimoshu8");
            return (Criteria) this;
        }

        public Criteria andQimoshu8Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU8 between", value1, value2, "qimoshu8");
            return (Criteria) this;
        }

        public Criteria andQimoshu8NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU8 not between", value1, value2, "qimoshu8");
            return (Criteria) this;
        }

        public Criteria andNianchushu30IsNull() {
            addCriterion("NIANCHUSHU30 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu30IsNotNull() {
            addCriterion("NIANCHUSHU30 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu30EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU30 =", value, "nianchushu30");
            return (Criteria) this;
        }

        public Criteria andNianchushu30NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU30 <>", value, "nianchushu30");
            return (Criteria) this;
        }

        public Criteria andNianchushu30GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU30 >", value, "nianchushu30");
            return (Criteria) this;
        }

        public Criteria andNianchushu30GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU30 >=", value, "nianchushu30");
            return (Criteria) this;
        }

        public Criteria andNianchushu30LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU30 <", value, "nianchushu30");
            return (Criteria) this;
        }

        public Criteria andNianchushu30LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU30 <=", value, "nianchushu30");
            return (Criteria) this;
        }

        public Criteria andNianchushu30In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU30 in", values, "nianchushu30");
            return (Criteria) this;
        }

        public Criteria andNianchushu30NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU30 not in", values, "nianchushu30");
            return (Criteria) this;
        }

        public Criteria andNianchushu30Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU30 between", value1, value2, "nianchushu30");
            return (Criteria) this;
        }

        public Criteria andNianchushu30NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU30 not between", value1, value2, "nianchushu30");
            return (Criteria) this;
        }

        public Criteria andNianchushu9IsNull() {
            addCriterion("NIANCHUSHU9 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu9IsNotNull() {
            addCriterion("NIANCHUSHU9 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu9EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU9 =", value, "nianchushu9");
            return (Criteria) this;
        }

        public Criteria andNianchushu9NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU9 <>", value, "nianchushu9");
            return (Criteria) this;
        }

        public Criteria andNianchushu9GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU9 >", value, "nianchushu9");
            return (Criteria) this;
        }

        public Criteria andNianchushu9GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU9 >=", value, "nianchushu9");
            return (Criteria) this;
        }

        public Criteria andNianchushu9LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU9 <", value, "nianchushu9");
            return (Criteria) this;
        }

        public Criteria andNianchushu9LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU9 <=", value, "nianchushu9");
            return (Criteria) this;
        }

        public Criteria andNianchushu9In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU9 in", values, "nianchushu9");
            return (Criteria) this;
        }

        public Criteria andNianchushu9NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU9 not in", values, "nianchushu9");
            return (Criteria) this;
        }

        public Criteria andNianchushu9Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU9 between", value1, value2, "nianchushu9");
            return (Criteria) this;
        }

        public Criteria andNianchushu9NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU9 not between", value1, value2, "nianchushu9");
            return (Criteria) this;
        }

        public Criteria andQimoshu9IsNull() {
            addCriterion("QIMOSHU9 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu9IsNotNull() {
            addCriterion("QIMOSHU9 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu9EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU9 =", value, "qimoshu9");
            return (Criteria) this;
        }

        public Criteria andQimoshu9NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU9 <>", value, "qimoshu9");
            return (Criteria) this;
        }

        public Criteria andQimoshu9GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU9 >", value, "qimoshu9");
            return (Criteria) this;
        }

        public Criteria andQimoshu9GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU9 >=", value, "qimoshu9");
            return (Criteria) this;
        }

        public Criteria andQimoshu9LessThan(BigDecimal value) {
            addCriterion("QIMOSHU9 <", value, "qimoshu9");
            return (Criteria) this;
        }

        public Criteria andQimoshu9LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU9 <=", value, "qimoshu9");
            return (Criteria) this;
        }

        public Criteria andQimoshu9In(List<BigDecimal> values) {
            addCriterion("QIMOSHU9 in", values, "qimoshu9");
            return (Criteria) this;
        }

        public Criteria andQimoshu9NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU9 not in", values, "qimoshu9");
            return (Criteria) this;
        }

        public Criteria andQimoshu9Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU9 between", value1, value2, "qimoshu9");
            return (Criteria) this;
        }

        public Criteria andQimoshu9NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU9 not between", value1, value2, "qimoshu9");
            return (Criteria) this;
        }

        public Criteria andNianchushu31IsNull() {
            addCriterion("NIANCHUSHU31 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu31IsNotNull() {
            addCriterion("NIANCHUSHU31 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu31EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU31 =", value, "nianchushu31");
            return (Criteria) this;
        }

        public Criteria andNianchushu31NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU31 <>", value, "nianchushu31");
            return (Criteria) this;
        }

        public Criteria andNianchushu31GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU31 >", value, "nianchushu31");
            return (Criteria) this;
        }

        public Criteria andNianchushu31GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU31 >=", value, "nianchushu31");
            return (Criteria) this;
        }

        public Criteria andNianchushu31LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU31 <", value, "nianchushu31");
            return (Criteria) this;
        }

        public Criteria andNianchushu31LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU31 <=", value, "nianchushu31");
            return (Criteria) this;
        }

        public Criteria andNianchushu31In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU31 in", values, "nianchushu31");
            return (Criteria) this;
        }

        public Criteria andNianchushu31NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU31 not in", values, "nianchushu31");
            return (Criteria) this;
        }

        public Criteria andNianchushu31Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU31 between", value1, value2, "nianchushu31");
            return (Criteria) this;
        }

        public Criteria andNianchushu31NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU31 not between", value1, value2, "nianchushu31");
            return (Criteria) this;
        }

        public Criteria andQimoshu29IsNull() {
            addCriterion("QIMOSHU29 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu29IsNotNull() {
            addCriterion("QIMOSHU29 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu29EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU29 =", value, "qimoshu29");
            return (Criteria) this;
        }

        public Criteria andQimoshu29NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU29 <>", value, "qimoshu29");
            return (Criteria) this;
        }

        public Criteria andQimoshu29GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU29 >", value, "qimoshu29");
            return (Criteria) this;
        }

        public Criteria andQimoshu29GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU29 >=", value, "qimoshu29");
            return (Criteria) this;
        }

        public Criteria andQimoshu29LessThan(BigDecimal value) {
            addCriterion("QIMOSHU29 <", value, "qimoshu29");
            return (Criteria) this;
        }

        public Criteria andQimoshu29LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU29 <=", value, "qimoshu29");
            return (Criteria) this;
        }

        public Criteria andQimoshu29In(List<BigDecimal> values) {
            addCriterion("QIMOSHU29 in", values, "qimoshu29");
            return (Criteria) this;
        }

        public Criteria andQimoshu29NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU29 not in", values, "qimoshu29");
            return (Criteria) this;
        }

        public Criteria andQimoshu29Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU29 between", value1, value2, "qimoshu29");
            return (Criteria) this;
        }

        public Criteria andQimoshu29NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU29 not between", value1, value2, "qimoshu29");
            return (Criteria) this;
        }

        public Criteria andNianchushu32IsNull() {
            addCriterion("NIANCHUSHU32 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu32IsNotNull() {
            addCriterion("NIANCHUSHU32 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu32EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU32 =", value, "nianchushu32");
            return (Criteria) this;
        }

        public Criteria andNianchushu32NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU32 <>", value, "nianchushu32");
            return (Criteria) this;
        }

        public Criteria andNianchushu32GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU32 >", value, "nianchushu32");
            return (Criteria) this;
        }

        public Criteria andNianchushu32GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU32 >=", value, "nianchushu32");
            return (Criteria) this;
        }

        public Criteria andNianchushu32LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU32 <", value, "nianchushu32");
            return (Criteria) this;
        }

        public Criteria andNianchushu32LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU32 <=", value, "nianchushu32");
            return (Criteria) this;
        }

        public Criteria andNianchushu32In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU32 in", values, "nianchushu32");
            return (Criteria) this;
        }

        public Criteria andNianchushu32NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU32 not in", values, "nianchushu32");
            return (Criteria) this;
        }

        public Criteria andNianchushu32Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU32 between", value1, value2, "nianchushu32");
            return (Criteria) this;
        }

        public Criteria andNianchushu32NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU32 not between", value1, value2, "nianchushu32");
            return (Criteria) this;
        }

        public Criteria andQimoshu30IsNull() {
            addCriterion("QIMOSHU30 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu30IsNotNull() {
            addCriterion("QIMOSHU30 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu30EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU30 =", value, "qimoshu30");
            return (Criteria) this;
        }

        public Criteria andQimoshu30NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU30 <>", value, "qimoshu30");
            return (Criteria) this;
        }

        public Criteria andQimoshu30GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU30 >", value, "qimoshu30");
            return (Criteria) this;
        }

        public Criteria andQimoshu30GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU30 >=", value, "qimoshu30");
            return (Criteria) this;
        }

        public Criteria andQimoshu30LessThan(BigDecimal value) {
            addCriterion("QIMOSHU30 <", value, "qimoshu30");
            return (Criteria) this;
        }

        public Criteria andQimoshu30LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU30 <=", value, "qimoshu30");
            return (Criteria) this;
        }

        public Criteria andQimoshu30In(List<BigDecimal> values) {
            addCriterion("QIMOSHU30 in", values, "qimoshu30");
            return (Criteria) this;
        }

        public Criteria andQimoshu30NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU30 not in", values, "qimoshu30");
            return (Criteria) this;
        }

        public Criteria andQimoshu30Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU30 between", value1, value2, "qimoshu30");
            return (Criteria) this;
        }

        public Criteria andQimoshu30NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU30 not between", value1, value2, "qimoshu30");
            return (Criteria) this;
        }

        public Criteria andNianchushu10IsNull() {
            addCriterion("NIANCHUSHU10 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu10IsNotNull() {
            addCriterion("NIANCHUSHU10 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu10EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU10 =", value, "nianchushu10");
            return (Criteria) this;
        }

        public Criteria andNianchushu10NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU10 <>", value, "nianchushu10");
            return (Criteria) this;
        }

        public Criteria andNianchushu10GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU10 >", value, "nianchushu10");
            return (Criteria) this;
        }

        public Criteria andNianchushu10GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU10 >=", value, "nianchushu10");
            return (Criteria) this;
        }

        public Criteria andNianchushu10LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU10 <", value, "nianchushu10");
            return (Criteria) this;
        }

        public Criteria andNianchushu10LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU10 <=", value, "nianchushu10");
            return (Criteria) this;
        }

        public Criteria andNianchushu10In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU10 in", values, "nianchushu10");
            return (Criteria) this;
        }

        public Criteria andNianchushu10NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU10 not in", values, "nianchushu10");
            return (Criteria) this;
        }

        public Criteria andNianchushu10Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU10 between", value1, value2, "nianchushu10");
            return (Criteria) this;
        }

        public Criteria andNianchushu10NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU10 not between", value1, value2, "nianchushu10");
            return (Criteria) this;
        }

        public Criteria andQimoshu10IsNull() {
            addCriterion("QIMOSHU10 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu10IsNotNull() {
            addCriterion("QIMOSHU10 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu10EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU10 =", value, "qimoshu10");
            return (Criteria) this;
        }

        public Criteria andQimoshu10NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU10 <>", value, "qimoshu10");
            return (Criteria) this;
        }

        public Criteria andQimoshu10GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU10 >", value, "qimoshu10");
            return (Criteria) this;
        }

        public Criteria andQimoshu10GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU10 >=", value, "qimoshu10");
            return (Criteria) this;
        }

        public Criteria andQimoshu10LessThan(BigDecimal value) {
            addCriterion("QIMOSHU10 <", value, "qimoshu10");
            return (Criteria) this;
        }

        public Criteria andQimoshu10LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU10 <=", value, "qimoshu10");
            return (Criteria) this;
        }

        public Criteria andQimoshu10In(List<BigDecimal> values) {
            addCriterion("QIMOSHU10 in", values, "qimoshu10");
            return (Criteria) this;
        }

        public Criteria andQimoshu10NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU10 not in", values, "qimoshu10");
            return (Criteria) this;
        }

        public Criteria andQimoshu10Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU10 between", value1, value2, "qimoshu10");
            return (Criteria) this;
        }

        public Criteria andQimoshu10NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU10 not between", value1, value2, "qimoshu10");
            return (Criteria) this;
        }

        public Criteria andNianchushu11IsNull() {
            addCriterion("NIANCHUSHU11 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu11IsNotNull() {
            addCriterion("NIANCHUSHU11 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu11EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU11 =", value, "nianchushu11");
            return (Criteria) this;
        }

        public Criteria andNianchushu11NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU11 <>", value, "nianchushu11");
            return (Criteria) this;
        }

        public Criteria andNianchushu11GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU11 >", value, "nianchushu11");
            return (Criteria) this;
        }

        public Criteria andNianchushu11GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU11 >=", value, "nianchushu11");
            return (Criteria) this;
        }

        public Criteria andNianchushu11LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU11 <", value, "nianchushu11");
            return (Criteria) this;
        }

        public Criteria andNianchushu11LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU11 <=", value, "nianchushu11");
            return (Criteria) this;
        }

        public Criteria andNianchushu11In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU11 in", values, "nianchushu11");
            return (Criteria) this;
        }

        public Criteria andNianchushu11NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU11 not in", values, "nianchushu11");
            return (Criteria) this;
        }

        public Criteria andNianchushu11Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU11 between", value1, value2, "nianchushu11");
            return (Criteria) this;
        }

        public Criteria andNianchushu11NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU11 not between", value1, value2, "nianchushu11");
            return (Criteria) this;
        }

        public Criteria andQimoshu11IsNull() {
            addCriterion("QIMOSHU11 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu11IsNotNull() {
            addCriterion("QIMOSHU11 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu11EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU11 =", value, "qimoshu11");
            return (Criteria) this;
        }

        public Criteria andQimoshu11NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU11 <>", value, "qimoshu11");
            return (Criteria) this;
        }

        public Criteria andQimoshu11GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU11 >", value, "qimoshu11");
            return (Criteria) this;
        }

        public Criteria andQimoshu11GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU11 >=", value, "qimoshu11");
            return (Criteria) this;
        }

        public Criteria andQimoshu11LessThan(BigDecimal value) {
            addCriterion("QIMOSHU11 <", value, "qimoshu11");
            return (Criteria) this;
        }

        public Criteria andQimoshu11LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU11 <=", value, "qimoshu11");
            return (Criteria) this;
        }

        public Criteria andQimoshu11In(List<BigDecimal> values) {
            addCriterion("QIMOSHU11 in", values, "qimoshu11");
            return (Criteria) this;
        }

        public Criteria andQimoshu11NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU11 not in", values, "qimoshu11");
            return (Criteria) this;
        }

        public Criteria andQimoshu11Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU11 between", value1, value2, "qimoshu11");
            return (Criteria) this;
        }

        public Criteria andQimoshu11NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU11 not between", value1, value2, "qimoshu11");
            return (Criteria) this;
        }

        public Criteria andNianchushu33IsNull() {
            addCriterion("NIANCHUSHU33 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu33IsNotNull() {
            addCriterion("NIANCHUSHU33 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu33EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU33 =", value, "nianchushu33");
            return (Criteria) this;
        }

        public Criteria andNianchushu33NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU33 <>", value, "nianchushu33");
            return (Criteria) this;
        }

        public Criteria andNianchushu33GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU33 >", value, "nianchushu33");
            return (Criteria) this;
        }

        public Criteria andNianchushu33GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU33 >=", value, "nianchushu33");
            return (Criteria) this;
        }

        public Criteria andNianchushu33LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU33 <", value, "nianchushu33");
            return (Criteria) this;
        }

        public Criteria andNianchushu33LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU33 <=", value, "nianchushu33");
            return (Criteria) this;
        }

        public Criteria andNianchushu33In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU33 in", values, "nianchushu33");
            return (Criteria) this;
        }

        public Criteria andNianchushu33NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU33 not in", values, "nianchushu33");
            return (Criteria) this;
        }

        public Criteria andNianchushu33Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU33 between", value1, value2, "nianchushu33");
            return (Criteria) this;
        }

        public Criteria andNianchushu33NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU33 not between", value1, value2, "nianchushu33");
            return (Criteria) this;
        }

        public Criteria andQimoshu31IsNull() {
            addCriterion("QIMOSHU31 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu31IsNotNull() {
            addCriterion("QIMOSHU31 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu31EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU31 =", value, "qimoshu31");
            return (Criteria) this;
        }

        public Criteria andQimoshu31NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU31 <>", value, "qimoshu31");
            return (Criteria) this;
        }

        public Criteria andQimoshu31GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU31 >", value, "qimoshu31");
            return (Criteria) this;
        }

        public Criteria andQimoshu31GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU31 >=", value, "qimoshu31");
            return (Criteria) this;
        }

        public Criteria andQimoshu31LessThan(BigDecimal value) {
            addCriterion("QIMOSHU31 <", value, "qimoshu31");
            return (Criteria) this;
        }

        public Criteria andQimoshu31LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU31 <=", value, "qimoshu31");
            return (Criteria) this;
        }

        public Criteria andQimoshu31In(List<BigDecimal> values) {
            addCriterion("QIMOSHU31 in", values, "qimoshu31");
            return (Criteria) this;
        }

        public Criteria andQimoshu31NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU31 not in", values, "qimoshu31");
            return (Criteria) this;
        }

        public Criteria andQimoshu31Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU31 between", value1, value2, "qimoshu31");
            return (Criteria) this;
        }

        public Criteria andQimoshu31NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU31 not between", value1, value2, "qimoshu31");
            return (Criteria) this;
        }

        public Criteria andNianchushu12IsNull() {
            addCriterion("NIANCHUSHU12 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu12IsNotNull() {
            addCriterion("NIANCHUSHU12 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu12EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU12 =", value, "nianchushu12");
            return (Criteria) this;
        }

        public Criteria andNianchushu12NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU12 <>", value, "nianchushu12");
            return (Criteria) this;
        }

        public Criteria andNianchushu12GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU12 >", value, "nianchushu12");
            return (Criteria) this;
        }

        public Criteria andNianchushu12GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU12 >=", value, "nianchushu12");
            return (Criteria) this;
        }

        public Criteria andNianchushu12LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU12 <", value, "nianchushu12");
            return (Criteria) this;
        }

        public Criteria andNianchushu12LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU12 <=", value, "nianchushu12");
            return (Criteria) this;
        }

        public Criteria andNianchushu12In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU12 in", values, "nianchushu12");
            return (Criteria) this;
        }

        public Criteria andNianchushu12NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU12 not in", values, "nianchushu12");
            return (Criteria) this;
        }

        public Criteria andNianchushu12Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU12 between", value1, value2, "nianchushu12");
            return (Criteria) this;
        }

        public Criteria andNianchushu12NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU12 not between", value1, value2, "nianchushu12");
            return (Criteria) this;
        }

        public Criteria andNianchushu34IsNull() {
            addCriterion("NIANCHUSHU34 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu34IsNotNull() {
            addCriterion("NIANCHUSHU34 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu34EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU34 =", value, "nianchushu34");
            return (Criteria) this;
        }

        public Criteria andNianchushu34NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU34 <>", value, "nianchushu34");
            return (Criteria) this;
        }

        public Criteria andNianchushu34GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU34 >", value, "nianchushu34");
            return (Criteria) this;
        }

        public Criteria andNianchushu34GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU34 >=", value, "nianchushu34");
            return (Criteria) this;
        }

        public Criteria andNianchushu34LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU34 <", value, "nianchushu34");
            return (Criteria) this;
        }

        public Criteria andNianchushu34LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU34 <=", value, "nianchushu34");
            return (Criteria) this;
        }

        public Criteria andNianchushu34In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU34 in", values, "nianchushu34");
            return (Criteria) this;
        }

        public Criteria andNianchushu34NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU34 not in", values, "nianchushu34");
            return (Criteria) this;
        }

        public Criteria andNianchushu34Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU34 between", value1, value2, "nianchushu34");
            return (Criteria) this;
        }

        public Criteria andNianchushu34NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU34 not between", value1, value2, "nianchushu34");
            return (Criteria) this;
        }

        public Criteria andQimoshu32IsNull() {
            addCriterion("QIMOSHU32 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu32IsNotNull() {
            addCriterion("QIMOSHU32 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu32EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU32 =", value, "qimoshu32");
            return (Criteria) this;
        }

        public Criteria andQimoshu32NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU32 <>", value, "qimoshu32");
            return (Criteria) this;
        }

        public Criteria andQimoshu32GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU32 >", value, "qimoshu32");
            return (Criteria) this;
        }

        public Criteria andQimoshu32GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU32 >=", value, "qimoshu32");
            return (Criteria) this;
        }

        public Criteria andQimoshu32LessThan(BigDecimal value) {
            addCriterion("QIMOSHU32 <", value, "qimoshu32");
            return (Criteria) this;
        }

        public Criteria andQimoshu32LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU32 <=", value, "qimoshu32");
            return (Criteria) this;
        }

        public Criteria andQimoshu32In(List<BigDecimal> values) {
            addCriterion("QIMOSHU32 in", values, "qimoshu32");
            return (Criteria) this;
        }

        public Criteria andQimoshu32NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU32 not in", values, "qimoshu32");
            return (Criteria) this;
        }

        public Criteria andQimoshu32Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU32 between", value1, value2, "qimoshu32");
            return (Criteria) this;
        }

        public Criteria andQimoshu32NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU32 not between", value1, value2, "qimoshu32");
            return (Criteria) this;
        }

        public Criteria andNianchushu35IsNull() {
            addCriterion("NIANCHUSHU35 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu35IsNotNull() {
            addCriterion("NIANCHUSHU35 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu35EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU35 =", value, "nianchushu35");
            return (Criteria) this;
        }

        public Criteria andNianchushu35NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU35 <>", value, "nianchushu35");
            return (Criteria) this;
        }

        public Criteria andNianchushu35GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU35 >", value, "nianchushu35");
            return (Criteria) this;
        }

        public Criteria andNianchushu35GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU35 >=", value, "nianchushu35");
            return (Criteria) this;
        }

        public Criteria andNianchushu35LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU35 <", value, "nianchushu35");
            return (Criteria) this;
        }

        public Criteria andNianchushu35LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU35 <=", value, "nianchushu35");
            return (Criteria) this;
        }

        public Criteria andNianchushu35In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU35 in", values, "nianchushu35");
            return (Criteria) this;
        }

        public Criteria andNianchushu35NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU35 not in", values, "nianchushu35");
            return (Criteria) this;
        }

        public Criteria andNianchushu35Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU35 between", value1, value2, "nianchushu35");
            return (Criteria) this;
        }

        public Criteria andNianchushu35NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU35 not between", value1, value2, "nianchushu35");
            return (Criteria) this;
        }

        public Criteria andQimoshu33IsNull() {
            addCriterion("QIMOSHU33 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu33IsNotNull() {
            addCriterion("QIMOSHU33 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu33EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU33 =", value, "qimoshu33");
            return (Criteria) this;
        }

        public Criteria andQimoshu33NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU33 <>", value, "qimoshu33");
            return (Criteria) this;
        }

        public Criteria andQimoshu33GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU33 >", value, "qimoshu33");
            return (Criteria) this;
        }

        public Criteria andQimoshu33GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU33 >=", value, "qimoshu33");
            return (Criteria) this;
        }

        public Criteria andQimoshu33LessThan(BigDecimal value) {
            addCriterion("QIMOSHU33 <", value, "qimoshu33");
            return (Criteria) this;
        }

        public Criteria andQimoshu33LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU33 <=", value, "qimoshu33");
            return (Criteria) this;
        }

        public Criteria andQimoshu33In(List<BigDecimal> values) {
            addCriterion("QIMOSHU33 in", values, "qimoshu33");
            return (Criteria) this;
        }

        public Criteria andQimoshu33NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU33 not in", values, "qimoshu33");
            return (Criteria) this;
        }

        public Criteria andQimoshu33Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU33 between", value1, value2, "qimoshu33");
            return (Criteria) this;
        }

        public Criteria andQimoshu33NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU33 not between", value1, value2, "qimoshu33");
            return (Criteria) this;
        }

        public Criteria andNianchushu36IsNull() {
            addCriterion("NIANCHUSHU36 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu36IsNotNull() {
            addCriterion("NIANCHUSHU36 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu36EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU36 =", value, "nianchushu36");
            return (Criteria) this;
        }

        public Criteria andNianchushu36NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU36 <>", value, "nianchushu36");
            return (Criteria) this;
        }

        public Criteria andNianchushu36GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU36 >", value, "nianchushu36");
            return (Criteria) this;
        }

        public Criteria andNianchushu36GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU36 >=", value, "nianchushu36");
            return (Criteria) this;
        }

        public Criteria andNianchushu36LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU36 <", value, "nianchushu36");
            return (Criteria) this;
        }

        public Criteria andNianchushu36LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU36 <=", value, "nianchushu36");
            return (Criteria) this;
        }

        public Criteria andNianchushu36In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU36 in", values, "nianchushu36");
            return (Criteria) this;
        }

        public Criteria andNianchushu36NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU36 not in", values, "nianchushu36");
            return (Criteria) this;
        }

        public Criteria andNianchushu36Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU36 between", value1, value2, "nianchushu36");
            return (Criteria) this;
        }

        public Criteria andNianchushu36NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU36 not between", value1, value2, "nianchushu36");
            return (Criteria) this;
        }

        public Criteria andQimoshu34IsNull() {
            addCriterion("QIMOSHU34 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu34IsNotNull() {
            addCriterion("QIMOSHU34 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu34EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU34 =", value, "qimoshu34");
            return (Criteria) this;
        }

        public Criteria andQimoshu34NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU34 <>", value, "qimoshu34");
            return (Criteria) this;
        }

        public Criteria andQimoshu34GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU34 >", value, "qimoshu34");
            return (Criteria) this;
        }

        public Criteria andQimoshu34GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU34 >=", value, "qimoshu34");
            return (Criteria) this;
        }

        public Criteria andQimoshu34LessThan(BigDecimal value) {
            addCriterion("QIMOSHU34 <", value, "qimoshu34");
            return (Criteria) this;
        }

        public Criteria andQimoshu34LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU34 <=", value, "qimoshu34");
            return (Criteria) this;
        }

        public Criteria andQimoshu34In(List<BigDecimal> values) {
            addCriterion("QIMOSHU34 in", values, "qimoshu34");
            return (Criteria) this;
        }

        public Criteria andQimoshu34NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU34 not in", values, "qimoshu34");
            return (Criteria) this;
        }

        public Criteria andQimoshu34Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU34 between", value1, value2, "qimoshu34");
            return (Criteria) this;
        }

        public Criteria andQimoshu34NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU34 not between", value1, value2, "qimoshu34");
            return (Criteria) this;
        }

        public Criteria andNianchushu13IsNull() {
            addCriterion("NIANCHUSHU13 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu13IsNotNull() {
            addCriterion("NIANCHUSHU13 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu13EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU13 =", value, "nianchushu13");
            return (Criteria) this;
        }

        public Criteria andNianchushu13NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU13 <>", value, "nianchushu13");
            return (Criteria) this;
        }

        public Criteria andNianchushu13GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU13 >", value, "nianchushu13");
            return (Criteria) this;
        }

        public Criteria andNianchushu13GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU13 >=", value, "nianchushu13");
            return (Criteria) this;
        }

        public Criteria andNianchushu13LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU13 <", value, "nianchushu13");
            return (Criteria) this;
        }

        public Criteria andNianchushu13LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU13 <=", value, "nianchushu13");
            return (Criteria) this;
        }

        public Criteria andNianchushu13In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU13 in", values, "nianchushu13");
            return (Criteria) this;
        }

        public Criteria andNianchushu13NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU13 not in", values, "nianchushu13");
            return (Criteria) this;
        }

        public Criteria andNianchushu13Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU13 between", value1, value2, "nianchushu13");
            return (Criteria) this;
        }

        public Criteria andNianchushu13NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU13 not between", value1, value2, "nianchushu13");
            return (Criteria) this;
        }

        public Criteria andQimoshu12IsNull() {
            addCriterion("QIMOSHU12 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu12IsNotNull() {
            addCriterion("QIMOSHU12 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu12EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU12 =", value, "qimoshu12");
            return (Criteria) this;
        }

        public Criteria andQimoshu12NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU12 <>", value, "qimoshu12");
            return (Criteria) this;
        }

        public Criteria andQimoshu12GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU12 >", value, "qimoshu12");
            return (Criteria) this;
        }

        public Criteria andQimoshu12GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU12 >=", value, "qimoshu12");
            return (Criteria) this;
        }

        public Criteria andQimoshu12LessThan(BigDecimal value) {
            addCriterion("QIMOSHU12 <", value, "qimoshu12");
            return (Criteria) this;
        }

        public Criteria andQimoshu12LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU12 <=", value, "qimoshu12");
            return (Criteria) this;
        }

        public Criteria andQimoshu12In(List<BigDecimal> values) {
            addCriterion("QIMOSHU12 in", values, "qimoshu12");
            return (Criteria) this;
        }

        public Criteria andQimoshu12NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU12 not in", values, "qimoshu12");
            return (Criteria) this;
        }

        public Criteria andQimoshu12Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU12 between", value1, value2, "qimoshu12");
            return (Criteria) this;
        }

        public Criteria andQimoshu12NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU12 not between", value1, value2, "qimoshu12");
            return (Criteria) this;
        }

        public Criteria andNianchushu14IsNull() {
            addCriterion("NIANCHUSHU14 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu14IsNotNull() {
            addCriterion("NIANCHUSHU14 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu14EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU14 =", value, "nianchushu14");
            return (Criteria) this;
        }

        public Criteria andNianchushu14NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU14 <>", value, "nianchushu14");
            return (Criteria) this;
        }

        public Criteria andNianchushu14GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU14 >", value, "nianchushu14");
            return (Criteria) this;
        }

        public Criteria andNianchushu14GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU14 >=", value, "nianchushu14");
            return (Criteria) this;
        }

        public Criteria andNianchushu14LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU14 <", value, "nianchushu14");
            return (Criteria) this;
        }

        public Criteria andNianchushu14LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU14 <=", value, "nianchushu14");
            return (Criteria) this;
        }

        public Criteria andNianchushu14In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU14 in", values, "nianchushu14");
            return (Criteria) this;
        }

        public Criteria andNianchushu14NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU14 not in", values, "nianchushu14");
            return (Criteria) this;
        }

        public Criteria andNianchushu14Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU14 between", value1, value2, "nianchushu14");
            return (Criteria) this;
        }

        public Criteria andNianchushu14NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU14 not between", value1, value2, "nianchushu14");
            return (Criteria) this;
        }

        public Criteria andQimoshu13IsNull() {
            addCriterion("QIMOSHU13 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu13IsNotNull() {
            addCriterion("QIMOSHU13 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu13EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU13 =", value, "qimoshu13");
            return (Criteria) this;
        }

        public Criteria andQimoshu13NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU13 <>", value, "qimoshu13");
            return (Criteria) this;
        }

        public Criteria andQimoshu13GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU13 >", value, "qimoshu13");
            return (Criteria) this;
        }

        public Criteria andQimoshu13GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU13 >=", value, "qimoshu13");
            return (Criteria) this;
        }

        public Criteria andQimoshu13LessThan(BigDecimal value) {
            addCriterion("QIMOSHU13 <", value, "qimoshu13");
            return (Criteria) this;
        }

        public Criteria andQimoshu13LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU13 <=", value, "qimoshu13");
            return (Criteria) this;
        }

        public Criteria andQimoshu13In(List<BigDecimal> values) {
            addCriterion("QIMOSHU13 in", values, "qimoshu13");
            return (Criteria) this;
        }

        public Criteria andQimoshu13NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU13 not in", values, "qimoshu13");
            return (Criteria) this;
        }

        public Criteria andQimoshu13Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU13 between", value1, value2, "qimoshu13");
            return (Criteria) this;
        }

        public Criteria andQimoshu13NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU13 not between", value1, value2, "qimoshu13");
            return (Criteria) this;
        }

        public Criteria andNianchushu15IsNull() {
            addCriterion("NIANCHUSHU15 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu15IsNotNull() {
            addCriterion("NIANCHUSHU15 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu15EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU15 =", value, "nianchushu15");
            return (Criteria) this;
        }

        public Criteria andNianchushu15NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU15 <>", value, "nianchushu15");
            return (Criteria) this;
        }

        public Criteria andNianchushu15GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU15 >", value, "nianchushu15");
            return (Criteria) this;
        }

        public Criteria andNianchushu15GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU15 >=", value, "nianchushu15");
            return (Criteria) this;
        }

        public Criteria andNianchushu15LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU15 <", value, "nianchushu15");
            return (Criteria) this;
        }

        public Criteria andNianchushu15LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU15 <=", value, "nianchushu15");
            return (Criteria) this;
        }

        public Criteria andNianchushu15In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU15 in", values, "nianchushu15");
            return (Criteria) this;
        }

        public Criteria andNianchushu15NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU15 not in", values, "nianchushu15");
            return (Criteria) this;
        }

        public Criteria andNianchushu15Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU15 between", value1, value2, "nianchushu15");
            return (Criteria) this;
        }

        public Criteria andNianchushu15NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU15 not between", value1, value2, "nianchushu15");
            return (Criteria) this;
        }

        public Criteria andQimoshu14IsNull() {
            addCriterion("QIMOSHU14 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu14IsNotNull() {
            addCriterion("QIMOSHU14 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu14EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU14 =", value, "qimoshu14");
            return (Criteria) this;
        }

        public Criteria andQimoshu14NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU14 <>", value, "qimoshu14");
            return (Criteria) this;
        }

        public Criteria andQimoshu14GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU14 >", value, "qimoshu14");
            return (Criteria) this;
        }

        public Criteria andQimoshu14GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU14 >=", value, "qimoshu14");
            return (Criteria) this;
        }

        public Criteria andQimoshu14LessThan(BigDecimal value) {
            addCriterion("QIMOSHU14 <", value, "qimoshu14");
            return (Criteria) this;
        }

        public Criteria andQimoshu14LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU14 <=", value, "qimoshu14");
            return (Criteria) this;
        }

        public Criteria andQimoshu14In(List<BigDecimal> values) {
            addCriterion("QIMOSHU14 in", values, "qimoshu14");
            return (Criteria) this;
        }

        public Criteria andQimoshu14NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU14 not in", values, "qimoshu14");
            return (Criteria) this;
        }

        public Criteria andQimoshu14Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU14 between", value1, value2, "qimoshu14");
            return (Criteria) this;
        }

        public Criteria andQimoshu14NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU14 not between", value1, value2, "qimoshu14");
            return (Criteria) this;
        }

        public Criteria andNianchushu37IsNull() {
            addCriterion("NIANCHUSHU37 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu37IsNotNull() {
            addCriterion("NIANCHUSHU37 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu37EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU37 =", value, "nianchushu37");
            return (Criteria) this;
        }

        public Criteria andNianchushu37NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU37 <>", value, "nianchushu37");
            return (Criteria) this;
        }

        public Criteria andNianchushu37GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU37 >", value, "nianchushu37");
            return (Criteria) this;
        }

        public Criteria andNianchushu37GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU37 >=", value, "nianchushu37");
            return (Criteria) this;
        }

        public Criteria andNianchushu37LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU37 <", value, "nianchushu37");
            return (Criteria) this;
        }

        public Criteria andNianchushu37LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU37 <=", value, "nianchushu37");
            return (Criteria) this;
        }

        public Criteria andNianchushu37In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU37 in", values, "nianchushu37");
            return (Criteria) this;
        }

        public Criteria andNianchushu37NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU37 not in", values, "nianchushu37");
            return (Criteria) this;
        }

        public Criteria andNianchushu37Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU37 between", value1, value2, "nianchushu37");
            return (Criteria) this;
        }

        public Criteria andNianchushu37NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU37 not between", value1, value2, "nianchushu37");
            return (Criteria) this;
        }

        public Criteria andQimoshu35IsNull() {
            addCriterion("QIMOSHU35 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu35IsNotNull() {
            addCriterion("QIMOSHU35 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu35EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU35 =", value, "qimoshu35");
            return (Criteria) this;
        }

        public Criteria andQimoshu35NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU35 <>", value, "qimoshu35");
            return (Criteria) this;
        }

        public Criteria andQimoshu35GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU35 >", value, "qimoshu35");
            return (Criteria) this;
        }

        public Criteria andQimoshu35GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU35 >=", value, "qimoshu35");
            return (Criteria) this;
        }

        public Criteria andQimoshu35LessThan(BigDecimal value) {
            addCriterion("QIMOSHU35 <", value, "qimoshu35");
            return (Criteria) this;
        }

        public Criteria andQimoshu35LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU35 <=", value, "qimoshu35");
            return (Criteria) this;
        }

        public Criteria andQimoshu35In(List<BigDecimal> values) {
            addCriterion("QIMOSHU35 in", values, "qimoshu35");
            return (Criteria) this;
        }

        public Criteria andQimoshu35NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU35 not in", values, "qimoshu35");
            return (Criteria) this;
        }

        public Criteria andQimoshu35Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU35 between", value1, value2, "qimoshu35");
            return (Criteria) this;
        }

        public Criteria andQimoshu35NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU35 not between", value1, value2, "qimoshu35");
            return (Criteria) this;
        }

        public Criteria andNianchushu16IsNull() {
            addCriterion("NIANCHUSHU16 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu16IsNotNull() {
            addCriterion("NIANCHUSHU16 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu16EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU16 =", value, "nianchushu16");
            return (Criteria) this;
        }

        public Criteria andNianchushu16NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU16 <>", value, "nianchushu16");
            return (Criteria) this;
        }

        public Criteria andNianchushu16GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU16 >", value, "nianchushu16");
            return (Criteria) this;
        }

        public Criteria andNianchushu16GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU16 >=", value, "nianchushu16");
            return (Criteria) this;
        }

        public Criteria andNianchushu16LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU16 <", value, "nianchushu16");
            return (Criteria) this;
        }

        public Criteria andNianchushu16LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU16 <=", value, "nianchushu16");
            return (Criteria) this;
        }

        public Criteria andNianchushu16In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU16 in", values, "nianchushu16");
            return (Criteria) this;
        }

        public Criteria andNianchushu16NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU16 not in", values, "nianchushu16");
            return (Criteria) this;
        }

        public Criteria andNianchushu16Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU16 between", value1, value2, "nianchushu16");
            return (Criteria) this;
        }

        public Criteria andNianchushu16NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU16 not between", value1, value2, "nianchushu16");
            return (Criteria) this;
        }

        public Criteria andQimoshu15IsNull() {
            addCriterion("QIMOSHU15 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu15IsNotNull() {
            addCriterion("QIMOSHU15 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu15EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU15 =", value, "qimoshu15");
            return (Criteria) this;
        }

        public Criteria andQimoshu15NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU15 <>", value, "qimoshu15");
            return (Criteria) this;
        }

        public Criteria andQimoshu15GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU15 >", value, "qimoshu15");
            return (Criteria) this;
        }

        public Criteria andQimoshu15GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU15 >=", value, "qimoshu15");
            return (Criteria) this;
        }

        public Criteria andQimoshu15LessThan(BigDecimal value) {
            addCriterion("QIMOSHU15 <", value, "qimoshu15");
            return (Criteria) this;
        }

        public Criteria andQimoshu15LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU15 <=", value, "qimoshu15");
            return (Criteria) this;
        }

        public Criteria andQimoshu15In(List<BigDecimal> values) {
            addCriterion("QIMOSHU15 in", values, "qimoshu15");
            return (Criteria) this;
        }

        public Criteria andQimoshu15NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU15 not in", values, "qimoshu15");
            return (Criteria) this;
        }

        public Criteria andQimoshu15Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU15 between", value1, value2, "qimoshu15");
            return (Criteria) this;
        }

        public Criteria andQimoshu15NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU15 not between", value1, value2, "qimoshu15");
            return (Criteria) this;
        }

        public Criteria andNianchushu17IsNull() {
            addCriterion("NIANCHUSHU17 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu17IsNotNull() {
            addCriterion("NIANCHUSHU17 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu17EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU17 =", value, "nianchushu17");
            return (Criteria) this;
        }

        public Criteria andNianchushu17NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU17 <>", value, "nianchushu17");
            return (Criteria) this;
        }

        public Criteria andNianchushu17GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU17 >", value, "nianchushu17");
            return (Criteria) this;
        }

        public Criteria andNianchushu17GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU17 >=", value, "nianchushu17");
            return (Criteria) this;
        }

        public Criteria andNianchushu17LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU17 <", value, "nianchushu17");
            return (Criteria) this;
        }

        public Criteria andNianchushu17LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU17 <=", value, "nianchushu17");
            return (Criteria) this;
        }

        public Criteria andNianchushu17In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU17 in", values, "nianchushu17");
            return (Criteria) this;
        }

        public Criteria andNianchushu17NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU17 not in", values, "nianchushu17");
            return (Criteria) this;
        }

        public Criteria andNianchushu17Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU17 between", value1, value2, "nianchushu17");
            return (Criteria) this;
        }

        public Criteria andNianchushu17NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU17 not between", value1, value2, "nianchushu17");
            return (Criteria) this;
        }

        public Criteria andQimoshu16IsNull() {
            addCriterion("QIMOSHU16 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu16IsNotNull() {
            addCriterion("QIMOSHU16 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu16EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU16 =", value, "qimoshu16");
            return (Criteria) this;
        }

        public Criteria andQimoshu16NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU16 <>", value, "qimoshu16");
            return (Criteria) this;
        }

        public Criteria andQimoshu16GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU16 >", value, "qimoshu16");
            return (Criteria) this;
        }

        public Criteria andQimoshu16GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU16 >=", value, "qimoshu16");
            return (Criteria) this;
        }

        public Criteria andQimoshu16LessThan(BigDecimal value) {
            addCriterion("QIMOSHU16 <", value, "qimoshu16");
            return (Criteria) this;
        }

        public Criteria andQimoshu16LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU16 <=", value, "qimoshu16");
            return (Criteria) this;
        }

        public Criteria andQimoshu16In(List<BigDecimal> values) {
            addCriterion("QIMOSHU16 in", values, "qimoshu16");
            return (Criteria) this;
        }

        public Criteria andQimoshu16NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU16 not in", values, "qimoshu16");
            return (Criteria) this;
        }

        public Criteria andQimoshu16Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU16 between", value1, value2, "qimoshu16");
            return (Criteria) this;
        }

        public Criteria andQimoshu16NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU16 not between", value1, value2, "qimoshu16");
            return (Criteria) this;
        }

        public Criteria andNianchushu38IsNull() {
            addCriterion("NIANCHUSHU38 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu38IsNotNull() {
            addCriterion("NIANCHUSHU38 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu38EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU38 =", value, "nianchushu38");
            return (Criteria) this;
        }

        public Criteria andNianchushu38NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU38 <>", value, "nianchushu38");
            return (Criteria) this;
        }

        public Criteria andNianchushu38GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU38 >", value, "nianchushu38");
            return (Criteria) this;
        }

        public Criteria andNianchushu38GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU38 >=", value, "nianchushu38");
            return (Criteria) this;
        }

        public Criteria andNianchushu38LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU38 <", value, "nianchushu38");
            return (Criteria) this;
        }

        public Criteria andNianchushu38LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU38 <=", value, "nianchushu38");
            return (Criteria) this;
        }

        public Criteria andNianchushu38In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU38 in", values, "nianchushu38");
            return (Criteria) this;
        }

        public Criteria andNianchushu38NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU38 not in", values, "nianchushu38");
            return (Criteria) this;
        }

        public Criteria andNianchushu38Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU38 between", value1, value2, "nianchushu38");
            return (Criteria) this;
        }

        public Criteria andNianchushu38NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU38 not between", value1, value2, "nianchushu38");
            return (Criteria) this;
        }

        public Criteria andQimoshu36IsNull() {
            addCriterion("QIMOSHU36 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu36IsNotNull() {
            addCriterion("QIMOSHU36 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu36EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU36 =", value, "qimoshu36");
            return (Criteria) this;
        }

        public Criteria andQimoshu36NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU36 <>", value, "qimoshu36");
            return (Criteria) this;
        }

        public Criteria andQimoshu36GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU36 >", value, "qimoshu36");
            return (Criteria) this;
        }

        public Criteria andQimoshu36GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU36 >=", value, "qimoshu36");
            return (Criteria) this;
        }

        public Criteria andQimoshu36LessThan(BigDecimal value) {
            addCriterion("QIMOSHU36 <", value, "qimoshu36");
            return (Criteria) this;
        }

        public Criteria andQimoshu36LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU36 <=", value, "qimoshu36");
            return (Criteria) this;
        }

        public Criteria andQimoshu36In(List<BigDecimal> values) {
            addCriterion("QIMOSHU36 in", values, "qimoshu36");
            return (Criteria) this;
        }

        public Criteria andQimoshu36NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU36 not in", values, "qimoshu36");
            return (Criteria) this;
        }

        public Criteria andQimoshu36Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU36 between", value1, value2, "qimoshu36");
            return (Criteria) this;
        }

        public Criteria andQimoshu36NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU36 not between", value1, value2, "qimoshu36");
            return (Criteria) this;
        }

        public Criteria andNianchushu18IsNull() {
            addCriterion("NIANCHUSHU18 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu18IsNotNull() {
            addCriterion("NIANCHUSHU18 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu18EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU18 =", value, "nianchushu18");
            return (Criteria) this;
        }

        public Criteria andNianchushu18NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU18 <>", value, "nianchushu18");
            return (Criteria) this;
        }

        public Criteria andNianchushu18GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU18 >", value, "nianchushu18");
            return (Criteria) this;
        }

        public Criteria andNianchushu18GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU18 >=", value, "nianchushu18");
            return (Criteria) this;
        }

        public Criteria andNianchushu18LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU18 <", value, "nianchushu18");
            return (Criteria) this;
        }

        public Criteria andNianchushu18LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU18 <=", value, "nianchushu18");
            return (Criteria) this;
        }

        public Criteria andNianchushu18In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU18 in", values, "nianchushu18");
            return (Criteria) this;
        }

        public Criteria andNianchushu18NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU18 not in", values, "nianchushu18");
            return (Criteria) this;
        }

        public Criteria andNianchushu18Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU18 between", value1, value2, "nianchushu18");
            return (Criteria) this;
        }

        public Criteria andNianchushu18NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU18 not between", value1, value2, "nianchushu18");
            return (Criteria) this;
        }

        public Criteria andQimoshu17IsNull() {
            addCriterion("QIMOSHU17 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu17IsNotNull() {
            addCriterion("QIMOSHU17 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu17EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU17 =", value, "qimoshu17");
            return (Criteria) this;
        }

        public Criteria andQimoshu17NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU17 <>", value, "qimoshu17");
            return (Criteria) this;
        }

        public Criteria andQimoshu17GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU17 >", value, "qimoshu17");
            return (Criteria) this;
        }

        public Criteria andQimoshu17GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU17 >=", value, "qimoshu17");
            return (Criteria) this;
        }

        public Criteria andQimoshu17LessThan(BigDecimal value) {
            addCriterion("QIMOSHU17 <", value, "qimoshu17");
            return (Criteria) this;
        }

        public Criteria andQimoshu17LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU17 <=", value, "qimoshu17");
            return (Criteria) this;
        }

        public Criteria andQimoshu17In(List<BigDecimal> values) {
            addCriterion("QIMOSHU17 in", values, "qimoshu17");
            return (Criteria) this;
        }

        public Criteria andQimoshu17NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU17 not in", values, "qimoshu17");
            return (Criteria) this;
        }

        public Criteria andQimoshu17Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU17 between", value1, value2, "qimoshu17");
            return (Criteria) this;
        }

        public Criteria andQimoshu17NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU17 not between", value1, value2, "qimoshu17");
            return (Criteria) this;
        }

        public Criteria andNianchushu19IsNull() {
            addCriterion("NIANCHUSHU19 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu19IsNotNull() {
            addCriterion("NIANCHUSHU19 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu19EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU19 =", value, "nianchushu19");
            return (Criteria) this;
        }

        public Criteria andNianchushu19NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU19 <>", value, "nianchushu19");
            return (Criteria) this;
        }

        public Criteria andNianchushu19GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU19 >", value, "nianchushu19");
            return (Criteria) this;
        }

        public Criteria andNianchushu19GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU19 >=", value, "nianchushu19");
            return (Criteria) this;
        }

        public Criteria andNianchushu19LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU19 <", value, "nianchushu19");
            return (Criteria) this;
        }

        public Criteria andNianchushu19LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU19 <=", value, "nianchushu19");
            return (Criteria) this;
        }

        public Criteria andNianchushu19In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU19 in", values, "nianchushu19");
            return (Criteria) this;
        }

        public Criteria andNianchushu19NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU19 not in", values, "nianchushu19");
            return (Criteria) this;
        }

        public Criteria andNianchushu19Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU19 between", value1, value2, "nianchushu19");
            return (Criteria) this;
        }

        public Criteria andNianchushu19NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU19 not between", value1, value2, "nianchushu19");
            return (Criteria) this;
        }

        public Criteria andQimoshu18IsNull() {
            addCriterion("QIMOSHU18 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu18IsNotNull() {
            addCriterion("QIMOSHU18 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu18EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU18 =", value, "qimoshu18");
            return (Criteria) this;
        }

        public Criteria andQimoshu18NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU18 <>", value, "qimoshu18");
            return (Criteria) this;
        }

        public Criteria andQimoshu18GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU18 >", value, "qimoshu18");
            return (Criteria) this;
        }

        public Criteria andQimoshu18GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU18 >=", value, "qimoshu18");
            return (Criteria) this;
        }

        public Criteria andQimoshu18LessThan(BigDecimal value) {
            addCriterion("QIMOSHU18 <", value, "qimoshu18");
            return (Criteria) this;
        }

        public Criteria andQimoshu18LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU18 <=", value, "qimoshu18");
            return (Criteria) this;
        }

        public Criteria andQimoshu18In(List<BigDecimal> values) {
            addCriterion("QIMOSHU18 in", values, "qimoshu18");
            return (Criteria) this;
        }

        public Criteria andQimoshu18NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU18 not in", values, "qimoshu18");
            return (Criteria) this;
        }

        public Criteria andQimoshu18Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU18 between", value1, value2, "qimoshu18");
            return (Criteria) this;
        }

        public Criteria andQimoshu18NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU18 not between", value1, value2, "qimoshu18");
            return (Criteria) this;
        }

        public Criteria andNianchushu20IsNull() {
            addCriterion("NIANCHUSHU20 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu20IsNotNull() {
            addCriterion("NIANCHUSHU20 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu20EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU20 =", value, "nianchushu20");
            return (Criteria) this;
        }

        public Criteria andNianchushu20NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU20 <>", value, "nianchushu20");
            return (Criteria) this;
        }

        public Criteria andNianchushu20GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU20 >", value, "nianchushu20");
            return (Criteria) this;
        }

        public Criteria andNianchushu20GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU20 >=", value, "nianchushu20");
            return (Criteria) this;
        }

        public Criteria andNianchushu20LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU20 <", value, "nianchushu20");
            return (Criteria) this;
        }

        public Criteria andNianchushu20LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU20 <=", value, "nianchushu20");
            return (Criteria) this;
        }

        public Criteria andNianchushu20In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU20 in", values, "nianchushu20");
            return (Criteria) this;
        }

        public Criteria andNianchushu20NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU20 not in", values, "nianchushu20");
            return (Criteria) this;
        }

        public Criteria andNianchushu20Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU20 between", value1, value2, "nianchushu20");
            return (Criteria) this;
        }

        public Criteria andNianchushu20NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU20 not between", value1, value2, "nianchushu20");
            return (Criteria) this;
        }

        public Criteria andQimoshu19IsNull() {
            addCriterion("QIMOSHU19 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu19IsNotNull() {
            addCriterion("QIMOSHU19 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu19EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU19 =", value, "qimoshu19");
            return (Criteria) this;
        }

        public Criteria andQimoshu19NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU19 <>", value, "qimoshu19");
            return (Criteria) this;
        }

        public Criteria andQimoshu19GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU19 >", value, "qimoshu19");
            return (Criteria) this;
        }

        public Criteria andQimoshu19GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU19 >=", value, "qimoshu19");
            return (Criteria) this;
        }

        public Criteria andQimoshu19LessThan(BigDecimal value) {
            addCriterion("QIMOSHU19 <", value, "qimoshu19");
            return (Criteria) this;
        }

        public Criteria andQimoshu19LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU19 <=", value, "qimoshu19");
            return (Criteria) this;
        }

        public Criteria andQimoshu19In(List<BigDecimal> values) {
            addCriterion("QIMOSHU19 in", values, "qimoshu19");
            return (Criteria) this;
        }

        public Criteria andQimoshu19NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU19 not in", values, "qimoshu19");
            return (Criteria) this;
        }

        public Criteria andQimoshu19Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU19 between", value1, value2, "qimoshu19");
            return (Criteria) this;
        }

        public Criteria andQimoshu19NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU19 not between", value1, value2, "qimoshu19");
            return (Criteria) this;
        }

        public Criteria andNianchushu39IsNull() {
            addCriterion("NIANCHUSHU39 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu39IsNotNull() {
            addCriterion("NIANCHUSHU39 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu39EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU39 =", value, "nianchushu39");
            return (Criteria) this;
        }

        public Criteria andNianchushu39NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU39 <>", value, "nianchushu39");
            return (Criteria) this;
        }

        public Criteria andNianchushu39GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU39 >", value, "nianchushu39");
            return (Criteria) this;
        }

        public Criteria andNianchushu39GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU39 >=", value, "nianchushu39");
            return (Criteria) this;
        }

        public Criteria andNianchushu39LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU39 <", value, "nianchushu39");
            return (Criteria) this;
        }

        public Criteria andNianchushu39LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU39 <=", value, "nianchushu39");
            return (Criteria) this;
        }

        public Criteria andNianchushu39In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU39 in", values, "nianchushu39");
            return (Criteria) this;
        }

        public Criteria andNianchushu39NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU39 not in", values, "nianchushu39");
            return (Criteria) this;
        }

        public Criteria andNianchushu39Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU39 between", value1, value2, "nianchushu39");
            return (Criteria) this;
        }

        public Criteria andNianchushu39NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU39 not between", value1, value2, "nianchushu39");
            return (Criteria) this;
        }

        public Criteria andQimoshu37IsNull() {
            addCriterion("QIMOSHU37 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu37IsNotNull() {
            addCriterion("QIMOSHU37 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu37EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU37 =", value, "qimoshu37");
            return (Criteria) this;
        }

        public Criteria andQimoshu37NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU37 <>", value, "qimoshu37");
            return (Criteria) this;
        }

        public Criteria andQimoshu37GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU37 >", value, "qimoshu37");
            return (Criteria) this;
        }

        public Criteria andQimoshu37GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU37 >=", value, "qimoshu37");
            return (Criteria) this;
        }

        public Criteria andQimoshu37LessThan(BigDecimal value) {
            addCriterion("QIMOSHU37 <", value, "qimoshu37");
            return (Criteria) this;
        }

        public Criteria andQimoshu37LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU37 <=", value, "qimoshu37");
            return (Criteria) this;
        }

        public Criteria andQimoshu37In(List<BigDecimal> values) {
            addCriterion("QIMOSHU37 in", values, "qimoshu37");
            return (Criteria) this;
        }

        public Criteria andQimoshu37NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU37 not in", values, "qimoshu37");
            return (Criteria) this;
        }

        public Criteria andQimoshu37Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU37 between", value1, value2, "qimoshu37");
            return (Criteria) this;
        }

        public Criteria andQimoshu37NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU37 not between", value1, value2, "qimoshu37");
            return (Criteria) this;
        }

        public Criteria andNianchushu40IsNull() {
            addCriterion("NIANCHUSHU40 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu40IsNotNull() {
            addCriterion("NIANCHUSHU40 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu40EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU40 =", value, "nianchushu40");
            return (Criteria) this;
        }

        public Criteria andNianchushu40NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU40 <>", value, "nianchushu40");
            return (Criteria) this;
        }

        public Criteria andNianchushu40GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU40 >", value, "nianchushu40");
            return (Criteria) this;
        }

        public Criteria andNianchushu40GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU40 >=", value, "nianchushu40");
            return (Criteria) this;
        }

        public Criteria andNianchushu40LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU40 <", value, "nianchushu40");
            return (Criteria) this;
        }

        public Criteria andNianchushu40LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU40 <=", value, "nianchushu40");
            return (Criteria) this;
        }

        public Criteria andNianchushu40In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU40 in", values, "nianchushu40");
            return (Criteria) this;
        }

        public Criteria andNianchushu40NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU40 not in", values, "nianchushu40");
            return (Criteria) this;
        }

        public Criteria andNianchushu40Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU40 between", value1, value2, "nianchushu40");
            return (Criteria) this;
        }

        public Criteria andNianchushu40NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU40 not between", value1, value2, "nianchushu40");
            return (Criteria) this;
        }

        public Criteria andQimoshu38IsNull() {
            addCriterion("QIMOSHU38 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu38IsNotNull() {
            addCriterion("QIMOSHU38 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu38EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU38 =", value, "qimoshu38");
            return (Criteria) this;
        }

        public Criteria andQimoshu38NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU38 <>", value, "qimoshu38");
            return (Criteria) this;
        }

        public Criteria andQimoshu38GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU38 >", value, "qimoshu38");
            return (Criteria) this;
        }

        public Criteria andQimoshu38GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU38 >=", value, "qimoshu38");
            return (Criteria) this;
        }

        public Criteria andQimoshu38LessThan(BigDecimal value) {
            addCriterion("QIMOSHU38 <", value, "qimoshu38");
            return (Criteria) this;
        }

        public Criteria andQimoshu38LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU38 <=", value, "qimoshu38");
            return (Criteria) this;
        }

        public Criteria andQimoshu38In(List<BigDecimal> values) {
            addCriterion("QIMOSHU38 in", values, "qimoshu38");
            return (Criteria) this;
        }

        public Criteria andQimoshu38NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU38 not in", values, "qimoshu38");
            return (Criteria) this;
        }

        public Criteria andQimoshu38Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU38 between", value1, value2, "qimoshu38");
            return (Criteria) this;
        }

        public Criteria andQimoshu38NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU38 not between", value1, value2, "qimoshu38");
            return (Criteria) this;
        }

        public Criteria andNianchushu21IsNull() {
            addCriterion("NIANCHUSHU21 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu21IsNotNull() {
            addCriterion("NIANCHUSHU21 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu21EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU21 =", value, "nianchushu21");
            return (Criteria) this;
        }

        public Criteria andNianchushu21NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU21 <>", value, "nianchushu21");
            return (Criteria) this;
        }

        public Criteria andNianchushu21GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU21 >", value, "nianchushu21");
            return (Criteria) this;
        }

        public Criteria andNianchushu21GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU21 >=", value, "nianchushu21");
            return (Criteria) this;
        }

        public Criteria andNianchushu21LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU21 <", value, "nianchushu21");
            return (Criteria) this;
        }

        public Criteria andNianchushu21LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU21 <=", value, "nianchushu21");
            return (Criteria) this;
        }

        public Criteria andNianchushu21In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU21 in", values, "nianchushu21");
            return (Criteria) this;
        }

        public Criteria andNianchushu21NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU21 not in", values, "nianchushu21");
            return (Criteria) this;
        }

        public Criteria andNianchushu21Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU21 between", value1, value2, "nianchushu21");
            return (Criteria) this;
        }

        public Criteria andNianchushu21NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU21 not between", value1, value2, "nianchushu21");
            return (Criteria) this;
        }

        public Criteria andQimoshu20IsNull() {
            addCriterion("QIMOSHU20 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu20IsNotNull() {
            addCriterion("QIMOSHU20 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu20EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU20 =", value, "qimoshu20");
            return (Criteria) this;
        }

        public Criteria andQimoshu20NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU20 <>", value, "qimoshu20");
            return (Criteria) this;
        }

        public Criteria andQimoshu20GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU20 >", value, "qimoshu20");
            return (Criteria) this;
        }

        public Criteria andQimoshu20GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU20 >=", value, "qimoshu20");
            return (Criteria) this;
        }

        public Criteria andQimoshu20LessThan(BigDecimal value) {
            addCriterion("QIMOSHU20 <", value, "qimoshu20");
            return (Criteria) this;
        }

        public Criteria andQimoshu20LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU20 <=", value, "qimoshu20");
            return (Criteria) this;
        }

        public Criteria andQimoshu20In(List<BigDecimal> values) {
            addCriterion("QIMOSHU20 in", values, "qimoshu20");
            return (Criteria) this;
        }

        public Criteria andQimoshu20NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU20 not in", values, "qimoshu20");
            return (Criteria) this;
        }

        public Criteria andQimoshu20Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU20 between", value1, value2, "qimoshu20");
            return (Criteria) this;
        }

        public Criteria andQimoshu20NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU20 not between", value1, value2, "qimoshu20");
            return (Criteria) this;
        }

        public Criteria andNianchushu41IsNull() {
            addCriterion("NIANCHUSHU41 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu41IsNotNull() {
            addCriterion("NIANCHUSHU41 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu41EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU41 =", value, "nianchushu41");
            return (Criteria) this;
        }

        public Criteria andNianchushu41NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU41 <>", value, "nianchushu41");
            return (Criteria) this;
        }

        public Criteria andNianchushu41GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU41 >", value, "nianchushu41");
            return (Criteria) this;
        }

        public Criteria andNianchushu41GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU41 >=", value, "nianchushu41");
            return (Criteria) this;
        }

        public Criteria andNianchushu41LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU41 <", value, "nianchushu41");
            return (Criteria) this;
        }

        public Criteria andNianchushu41LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU41 <=", value, "nianchushu41");
            return (Criteria) this;
        }

        public Criteria andNianchushu41In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU41 in", values, "nianchushu41");
            return (Criteria) this;
        }

        public Criteria andNianchushu41NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU41 not in", values, "nianchushu41");
            return (Criteria) this;
        }

        public Criteria andNianchushu41Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU41 between", value1, value2, "nianchushu41");
            return (Criteria) this;
        }

        public Criteria andNianchushu41NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU41 not between", value1, value2, "nianchushu41");
            return (Criteria) this;
        }

        public Criteria andQimoshu39IsNull() {
            addCriterion("QIMOSHU39 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu39IsNotNull() {
            addCriterion("QIMOSHU39 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu39EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU39 =", value, "qimoshu39");
            return (Criteria) this;
        }

        public Criteria andQimoshu39NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU39 <>", value, "qimoshu39");
            return (Criteria) this;
        }

        public Criteria andQimoshu39GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU39 >", value, "qimoshu39");
            return (Criteria) this;
        }

        public Criteria andQimoshu39GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU39 >=", value, "qimoshu39");
            return (Criteria) this;
        }

        public Criteria andQimoshu39LessThan(BigDecimal value) {
            addCriterion("QIMOSHU39 <", value, "qimoshu39");
            return (Criteria) this;
        }

        public Criteria andQimoshu39LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU39 <=", value, "qimoshu39");
            return (Criteria) this;
        }

        public Criteria andQimoshu39In(List<BigDecimal> values) {
            addCriterion("QIMOSHU39 in", values, "qimoshu39");
            return (Criteria) this;
        }

        public Criteria andQimoshu39NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU39 not in", values, "qimoshu39");
            return (Criteria) this;
        }

        public Criteria andQimoshu39Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU39 between", value1, value2, "qimoshu39");
            return (Criteria) this;
        }

        public Criteria andQimoshu39NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU39 not between", value1, value2, "qimoshu39");
            return (Criteria) this;
        }

        public Criteria andNianchushu22IsNull() {
            addCriterion("NIANCHUSHU22 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu22IsNotNull() {
            addCriterion("NIANCHUSHU22 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu22EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU22 =", value, "nianchushu22");
            return (Criteria) this;
        }

        public Criteria andNianchushu22NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU22 <>", value, "nianchushu22");
            return (Criteria) this;
        }

        public Criteria andNianchushu22GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU22 >", value, "nianchushu22");
            return (Criteria) this;
        }

        public Criteria andNianchushu22GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU22 >=", value, "nianchushu22");
            return (Criteria) this;
        }

        public Criteria andNianchushu22LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU22 <", value, "nianchushu22");
            return (Criteria) this;
        }

        public Criteria andNianchushu22LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU22 <=", value, "nianchushu22");
            return (Criteria) this;
        }

        public Criteria andNianchushu22In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU22 in", values, "nianchushu22");
            return (Criteria) this;
        }

        public Criteria andNianchushu22NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU22 not in", values, "nianchushu22");
            return (Criteria) this;
        }

        public Criteria andNianchushu22Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU22 between", value1, value2, "nianchushu22");
            return (Criteria) this;
        }

        public Criteria andNianchushu22NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU22 not between", value1, value2, "nianchushu22");
            return (Criteria) this;
        }

        public Criteria andQimoshu21IsNull() {
            addCriterion("QIMOSHU21 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu21IsNotNull() {
            addCriterion("QIMOSHU21 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu21EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU21 =", value, "qimoshu21");
            return (Criteria) this;
        }

        public Criteria andQimoshu21NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU21 <>", value, "qimoshu21");
            return (Criteria) this;
        }

        public Criteria andQimoshu21GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU21 >", value, "qimoshu21");
            return (Criteria) this;
        }

        public Criteria andQimoshu21GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU21 >=", value, "qimoshu21");
            return (Criteria) this;
        }

        public Criteria andQimoshu21LessThan(BigDecimal value) {
            addCriterion("QIMOSHU21 <", value, "qimoshu21");
            return (Criteria) this;
        }

        public Criteria andQimoshu21LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU21 <=", value, "qimoshu21");
            return (Criteria) this;
        }

        public Criteria andQimoshu21In(List<BigDecimal> values) {
            addCriterion("QIMOSHU21 in", values, "qimoshu21");
            return (Criteria) this;
        }

        public Criteria andQimoshu21NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU21 not in", values, "qimoshu21");
            return (Criteria) this;
        }

        public Criteria andQimoshu21Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU21 between", value1, value2, "qimoshu21");
            return (Criteria) this;
        }

        public Criteria andQimoshu21NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU21 not between", value1, value2, "qimoshu21");
            return (Criteria) this;
        }

        public Criteria andNianchushu42IsNull() {
            addCriterion("NIANCHUSHU42 is null");
            return (Criteria) this;
        }

        public Criteria andNianchushu42IsNotNull() {
            addCriterion("NIANCHUSHU42 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchushu42EqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU42 =", value, "nianchushu42");
            return (Criteria) this;
        }

        public Criteria andNianchushu42NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU42 <>", value, "nianchushu42");
            return (Criteria) this;
        }

        public Criteria andNianchushu42GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUSHU42 >", value, "nianchushu42");
            return (Criteria) this;
        }

        public Criteria andNianchushu42GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU42 >=", value, "nianchushu42");
            return (Criteria) this;
        }

        public Criteria andNianchushu42LessThan(BigDecimal value) {
            addCriterion("NIANCHUSHU42 <", value, "nianchushu42");
            return (Criteria) this;
        }

        public Criteria andNianchushu42LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUSHU42 <=", value, "nianchushu42");
            return (Criteria) this;
        }

        public Criteria andNianchushu42In(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU42 in", values, "nianchushu42");
            return (Criteria) this;
        }

        public Criteria andNianchushu42NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUSHU42 not in", values, "nianchushu42");
            return (Criteria) this;
        }

        public Criteria andNianchushu42Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU42 between", value1, value2, "nianchushu42");
            return (Criteria) this;
        }

        public Criteria andNianchushu42NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUSHU42 not between", value1, value2, "nianchushu42");
            return (Criteria) this;
        }

        public Criteria andQimoshu40IsNull() {
            addCriterion("QIMOSHU40 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu40IsNotNull() {
            addCriterion("QIMOSHU40 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu40EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU40 =", value, "qimoshu40");
            return (Criteria) this;
        }

        public Criteria andQimoshu40NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU40 <>", value, "qimoshu40");
            return (Criteria) this;
        }

        public Criteria andQimoshu40GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU40 >", value, "qimoshu40");
            return (Criteria) this;
        }

        public Criteria andQimoshu40GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU40 >=", value, "qimoshu40");
            return (Criteria) this;
        }

        public Criteria andQimoshu40LessThan(BigDecimal value) {
            addCriterion("QIMOSHU40 <", value, "qimoshu40");
            return (Criteria) this;
        }

        public Criteria andQimoshu40LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU40 <=", value, "qimoshu40");
            return (Criteria) this;
        }

        public Criteria andQimoshu40In(List<BigDecimal> values) {
            addCriterion("QIMOSHU40 in", values, "qimoshu40");
            return (Criteria) this;
        }

        public Criteria andQimoshu40NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU40 not in", values, "qimoshu40");
            return (Criteria) this;
        }

        public Criteria andQimoshu40Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU40 between", value1, value2, "qimoshu40");
            return (Criteria) this;
        }

        public Criteria andQimoshu40NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU40 not between", value1, value2, "qimoshu40");
            return (Criteria) this;
        }

        public Criteria andQimoshu42IsNull() {
            addCriterion("QIMOSHU42 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu42IsNotNull() {
            addCriterion("QIMOSHU42 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu42EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU42 =", value, "qimoshu42");
            return (Criteria) this;
        }

        public Criteria andQimoshu42NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU42 <>", value, "qimoshu42");
            return (Criteria) this;
        }

        public Criteria andQimoshu42GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU42 >", value, "qimoshu42");
            return (Criteria) this;
        }

        public Criteria andQimoshu42GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU42 >=", value, "qimoshu42");
            return (Criteria) this;
        }

        public Criteria andQimoshu42LessThan(BigDecimal value) {
            addCriterion("QIMOSHU42 <", value, "qimoshu42");
            return (Criteria) this;
        }

        public Criteria andQimoshu42LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU42 <=", value, "qimoshu42");
            return (Criteria) this;
        }

        public Criteria andQimoshu42In(List<BigDecimal> values) {
            addCriterion("QIMOSHU42 in", values, "qimoshu42");
            return (Criteria) this;
        }

        public Criteria andQimoshu42NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU42 not in", values, "qimoshu42");
            return (Criteria) this;
        }

        public Criteria andQimoshu42Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU42 between", value1, value2, "qimoshu42");
            return (Criteria) this;
        }

        public Criteria andQimoshu42NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU42 not between", value1, value2, "qimoshu42");
            return (Criteria) this;
        }

        public Criteria andQimoshu41IsNull() {
            addCriterion("QIMOSHU41 is null");
            return (Criteria) this;
        }

        public Criteria andQimoshu41IsNotNull() {
            addCriterion("QIMOSHU41 is not null");
            return (Criteria) this;
        }

        public Criteria andQimoshu41EqualTo(BigDecimal value) {
            addCriterion("QIMOSHU41 =", value, "qimoshu41");
            return (Criteria) this;
        }

        public Criteria andQimoshu41NotEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU41 <>", value, "qimoshu41");
            return (Criteria) this;
        }

        public Criteria andQimoshu41GreaterThan(BigDecimal value) {
            addCriterion("QIMOSHU41 >", value, "qimoshu41");
            return (Criteria) this;
        }

        public Criteria andQimoshu41GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU41 >=", value, "qimoshu41");
            return (Criteria) this;
        }

        public Criteria andQimoshu41LessThan(BigDecimal value) {
            addCriterion("QIMOSHU41 <", value, "qimoshu41");
            return (Criteria) this;
        }

        public Criteria andQimoshu41LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIMOSHU41 <=", value, "qimoshu41");
            return (Criteria) this;
        }

        public Criteria andQimoshu41In(List<BigDecimal> values) {
            addCriterion("QIMOSHU41 in", values, "qimoshu41");
            return (Criteria) this;
        }

        public Criteria andQimoshu41NotIn(List<BigDecimal> values) {
            addCriterion("QIMOSHU41 not in", values, "qimoshu41");
            return (Criteria) this;
        }

        public Criteria andQimoshu41Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU41 between", value1, value2, "qimoshu41");
            return (Criteria) this;
        }

        public Criteria andQimoshu41NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIMOSHU41 not between", value1, value2, "qimoshu41");
            return (Criteria) this;
        }

        public Criteria andYueIsNull() {
            addCriterion("YUE is null");
            return (Criteria) this;
        }

        public Criteria andYueIsNotNull() {
            addCriterion("YUE is not null");
            return (Criteria) this;
        }

        public Criteria andYueEqualTo(String value) {
            addCriterion("YUE =", value, "yue");
            return (Criteria) this;
        }

        public Criteria andYueNotEqualTo(String value) {
            addCriterion("YUE <>", value, "yue");
            return (Criteria) this;
        }

        public Criteria andYueGreaterThan(String value) {
            addCriterion("YUE >", value, "yue");
            return (Criteria) this;
        }

        public Criteria andYueGreaterThanOrEqualTo(String value) {
            addCriterion("YUE >=", value, "yue");
            return (Criteria) this;
        }

        public Criteria andYueLessThan(String value) {
            addCriterion("YUE <", value, "yue");
            return (Criteria) this;
        }

        public Criteria andYueLessThanOrEqualTo(String value) {
            addCriterion("YUE <=", value, "yue");
            return (Criteria) this;
        }

        public Criteria andYueLike(String value) {
            addCriterion("YUE like", value, "yue");
            return (Criteria) this;
        }

        public Criteria andYueNotLike(String value) {
            addCriterion("YUE not like", value, "yue");
            return (Criteria) this;
        }

        public Criteria andYueIn(List<String> values) {
            addCriterion("YUE in", values, "yue");
            return (Criteria) this;
        }

        public Criteria andYueNotIn(List<String> values) {
            addCriterion("YUE not in", values, "yue");
            return (Criteria) this;
        }

        public Criteria andYueBetween(String value1, String value2) {
            addCriterion("YUE between", value1, value2, "yue");
            return (Criteria) this;
        }

        public Criteria andYueNotBetween(String value1, String value2) {
            addCriterion("YUE not between", value1, value2, "yue");
            return (Criteria) this;
        }

        public Criteria andRiIsNull() {
            addCriterion("RI is null");
            return (Criteria) this;
        }

        public Criteria andRiIsNotNull() {
            addCriterion("RI is not null");
            return (Criteria) this;
        }

        public Criteria andRiEqualTo(String value) {
            addCriterion("RI =", value, "ri");
            return (Criteria) this;
        }

        public Criteria andRiNotEqualTo(String value) {
            addCriterion("RI <>", value, "ri");
            return (Criteria) this;
        }

        public Criteria andRiGreaterThan(String value) {
            addCriterion("RI >", value, "ri");
            return (Criteria) this;
        }

        public Criteria andRiGreaterThanOrEqualTo(String value) {
            addCriterion("RI >=", value, "ri");
            return (Criteria) this;
        }

        public Criteria andRiLessThan(String value) {
            addCriterion("RI <", value, "ri");
            return (Criteria) this;
        }

        public Criteria andRiLessThanOrEqualTo(String value) {
            addCriterion("RI <=", value, "ri");
            return (Criteria) this;
        }

        public Criteria andRiLike(String value) {
            addCriterion("RI like", value, "ri");
            return (Criteria) this;
        }

        public Criteria andRiNotLike(String value) {
            addCriterion("RI not like", value, "ri");
            return (Criteria) this;
        }

        public Criteria andRiIn(List<String> values) {
            addCriterion("RI in", values, "ri");
            return (Criteria) this;
        }

        public Criteria andRiNotIn(List<String> values) {
            addCriterion("RI not in", values, "ri");
            return (Criteria) this;
        }

        public Criteria andRiBetween(String value1, String value2) {
            addCriterion("RI between", value1, value2, "ri");
            return (Criteria) this;
        }

        public Criteria andRiNotBetween(String value1, String value2) {
            addCriterion("RI not between", value1, value2, "ri");
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