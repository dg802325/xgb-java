package com.xgb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StNjJieshoujianduExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StNjJieshoujianduExample() {
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

        public Criteria andZhenggai1IsNull() {
            addCriterion("ZHENGGAI1 is null");
            return (Criteria) this;
        }

        public Criteria andZhenggai1IsNotNull() {
            addCriterion("ZHENGGAI1 is not null");
            return (Criteria) this;
        }

        public Criteria andZhenggai1EqualTo(String value) {
            addCriterion("ZHENGGAI1 =", value, "zhenggai1");
            return (Criteria) this;
        }

        public Criteria andZhenggai1NotEqualTo(String value) {
            addCriterion("ZHENGGAI1 <>", value, "zhenggai1");
            return (Criteria) this;
        }

        public Criteria andZhenggai1GreaterThan(String value) {
            addCriterion("ZHENGGAI1 >", value, "zhenggai1");
            return (Criteria) this;
        }

        public Criteria andZhenggai1GreaterThanOrEqualTo(String value) {
            addCriterion("ZHENGGAI1 >=", value, "zhenggai1");
            return (Criteria) this;
        }

        public Criteria andZhenggai1LessThan(String value) {
            addCriterion("ZHENGGAI1 <", value, "zhenggai1");
            return (Criteria) this;
        }

        public Criteria andZhenggai1LessThanOrEqualTo(String value) {
            addCriterion("ZHENGGAI1 <=", value, "zhenggai1");
            return (Criteria) this;
        }

        public Criteria andZhenggai1Like(String value) {
            addCriterion("ZHENGGAI1 like", value, "zhenggai1");
            return (Criteria) this;
        }

        public Criteria andZhenggai1NotLike(String value) {
            addCriterion("ZHENGGAI1 not like", value, "zhenggai1");
            return (Criteria) this;
        }

        public Criteria andZhenggai1In(List<String> values) {
            addCriterion("ZHENGGAI1 in", values, "zhenggai1");
            return (Criteria) this;
        }

        public Criteria andZhenggai1NotIn(List<String> values) {
            addCriterion("ZHENGGAI1 not in", values, "zhenggai1");
            return (Criteria) this;
        }

        public Criteria andZhenggai1Between(String value1, String value2) {
            addCriterion("ZHENGGAI1 between", value1, value2, "zhenggai1");
            return (Criteria) this;
        }

        public Criteria andZhenggai1NotBetween(String value1, String value2) {
            addCriterion("ZHENGGAI1 not between", value1, value2, "zhenggai1");
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

        public Criteria andZhenggai2IsNull() {
            addCriterion("ZHENGGAI2 is null");
            return (Criteria) this;
        }

        public Criteria andZhenggai2IsNotNull() {
            addCriterion("ZHENGGAI2 is not null");
            return (Criteria) this;
        }

        public Criteria andZhenggai2EqualTo(String value) {
            addCriterion("ZHENGGAI2 =", value, "zhenggai2");
            return (Criteria) this;
        }

        public Criteria andZhenggai2NotEqualTo(String value) {
            addCriterion("ZHENGGAI2 <>", value, "zhenggai2");
            return (Criteria) this;
        }

        public Criteria andZhenggai2GreaterThan(String value) {
            addCriterion("ZHENGGAI2 >", value, "zhenggai2");
            return (Criteria) this;
        }

        public Criteria andZhenggai2GreaterThanOrEqualTo(String value) {
            addCriterion("ZHENGGAI2 >=", value, "zhenggai2");
            return (Criteria) this;
        }

        public Criteria andZhenggai2LessThan(String value) {
            addCriterion("ZHENGGAI2 <", value, "zhenggai2");
            return (Criteria) this;
        }

        public Criteria andZhenggai2LessThanOrEqualTo(String value) {
            addCriterion("ZHENGGAI2 <=", value, "zhenggai2");
            return (Criteria) this;
        }

        public Criteria andZhenggai2Like(String value) {
            addCriterion("ZHENGGAI2 like", value, "zhenggai2");
            return (Criteria) this;
        }

        public Criteria andZhenggai2NotLike(String value) {
            addCriterion("ZHENGGAI2 not like", value, "zhenggai2");
            return (Criteria) this;
        }

        public Criteria andZhenggai2In(List<String> values) {
            addCriterion("ZHENGGAI2 in", values, "zhenggai2");
            return (Criteria) this;
        }

        public Criteria andZhenggai2NotIn(List<String> values) {
            addCriterion("ZHENGGAI2 not in", values, "zhenggai2");
            return (Criteria) this;
        }

        public Criteria andZhenggai2Between(String value1, String value2) {
            addCriterion("ZHENGGAI2 between", value1, value2, "zhenggai2");
            return (Criteria) this;
        }

        public Criteria andZhenggai2NotBetween(String value1, String value2) {
            addCriterion("ZHENGGAI2 not between", value1, value2, "zhenggai2");
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

        public Criteria andZhenggai3IsNull() {
            addCriterion("ZHENGGAI3 is null");
            return (Criteria) this;
        }

        public Criteria andZhenggai3IsNotNull() {
            addCriterion("ZHENGGAI3 is not null");
            return (Criteria) this;
        }

        public Criteria andZhenggai3EqualTo(String value) {
            addCriterion("ZHENGGAI3 =", value, "zhenggai3");
            return (Criteria) this;
        }

        public Criteria andZhenggai3NotEqualTo(String value) {
            addCriterion("ZHENGGAI3 <>", value, "zhenggai3");
            return (Criteria) this;
        }

        public Criteria andZhenggai3GreaterThan(String value) {
            addCriterion("ZHENGGAI3 >", value, "zhenggai3");
            return (Criteria) this;
        }

        public Criteria andZhenggai3GreaterThanOrEqualTo(String value) {
            addCriterion("ZHENGGAI3 >=", value, "zhenggai3");
            return (Criteria) this;
        }

        public Criteria andZhenggai3LessThan(String value) {
            addCriterion("ZHENGGAI3 <", value, "zhenggai3");
            return (Criteria) this;
        }

        public Criteria andZhenggai3LessThanOrEqualTo(String value) {
            addCriterion("ZHENGGAI3 <=", value, "zhenggai3");
            return (Criteria) this;
        }

        public Criteria andZhenggai3Like(String value) {
            addCriterion("ZHENGGAI3 like", value, "zhenggai3");
            return (Criteria) this;
        }

        public Criteria andZhenggai3NotLike(String value) {
            addCriterion("ZHENGGAI3 not like", value, "zhenggai3");
            return (Criteria) this;
        }

        public Criteria andZhenggai3In(List<String> values) {
            addCriterion("ZHENGGAI3 in", values, "zhenggai3");
            return (Criteria) this;
        }

        public Criteria andZhenggai3NotIn(List<String> values) {
            addCriterion("ZHENGGAI3 not in", values, "zhenggai3");
            return (Criteria) this;
        }

        public Criteria andZhenggai3Between(String value1, String value2) {
            addCriterion("ZHENGGAI3 between", value1, value2, "zhenggai3");
            return (Criteria) this;
        }

        public Criteria andZhenggai3NotBetween(String value1, String value2) {
            addCriterion("ZHENGGAI3 not between", value1, value2, "zhenggai3");
            return (Criteria) this;
        }

        public Criteria andRadiobuttonIsNull() {
            addCriterion("RADIOBUTTON is null");
            return (Criteria) this;
        }

        public Criteria andRadiobuttonIsNotNull() {
            addCriterion("RADIOBUTTON is not null");
            return (Criteria) this;
        }

        public Criteria andRadiobuttonEqualTo(String value) {
            addCriterion("RADIOBUTTON =", value, "radiobutton");
            return (Criteria) this;
        }

        public Criteria andRadiobuttonNotEqualTo(String value) {
            addCriterion("RADIOBUTTON <>", value, "radiobutton");
            return (Criteria) this;
        }

        public Criteria andRadiobuttonGreaterThan(String value) {
            addCriterion("RADIOBUTTON >", value, "radiobutton");
            return (Criteria) this;
        }

        public Criteria andRadiobuttonGreaterThanOrEqualTo(String value) {
            addCriterion("RADIOBUTTON >=", value, "radiobutton");
            return (Criteria) this;
        }

        public Criteria andRadiobuttonLessThan(String value) {
            addCriterion("RADIOBUTTON <", value, "radiobutton");
            return (Criteria) this;
        }

        public Criteria andRadiobuttonLessThanOrEqualTo(String value) {
            addCriterion("RADIOBUTTON <=", value, "radiobutton");
            return (Criteria) this;
        }

        public Criteria andRadiobuttonLike(String value) {
            addCriterion("RADIOBUTTON like", value, "radiobutton");
            return (Criteria) this;
        }

        public Criteria andRadiobuttonNotLike(String value) {
            addCriterion("RADIOBUTTON not like", value, "radiobutton");
            return (Criteria) this;
        }

        public Criteria andRadiobuttonIn(List<String> values) {
            addCriterion("RADIOBUTTON in", values, "radiobutton");
            return (Criteria) this;
        }

        public Criteria andRadiobuttonNotIn(List<String> values) {
            addCriterion("RADIOBUTTON not in", values, "radiobutton");
            return (Criteria) this;
        }

        public Criteria andRadiobuttonBetween(String value1, String value2) {
            addCriterion("RADIOBUTTON between", value1, value2, "radiobutton");
            return (Criteria) this;
        }

        public Criteria andRadiobuttonNotBetween(String value1, String value2) {
            addCriterion("RADIOBUTTON not between", value1, value2, "radiobutton");
            return (Criteria) this;
        }

        public Criteria andPinggunianIsNull() {
            addCriterion("PINGGUNIAN is null");
            return (Criteria) this;
        }

        public Criteria andPinggunianIsNotNull() {
            addCriterion("PINGGUNIAN is not null");
            return (Criteria) this;
        }

        public Criteria andPinggunianEqualTo(String value) {
            addCriterion("PINGGUNIAN =", value, "pinggunian");
            return (Criteria) this;
        }

        public Criteria andPinggunianNotEqualTo(String value) {
            addCriterion("PINGGUNIAN <>", value, "pinggunian");
            return (Criteria) this;
        }

        public Criteria andPinggunianGreaterThan(String value) {
            addCriterion("PINGGUNIAN >", value, "pinggunian");
            return (Criteria) this;
        }

        public Criteria andPinggunianGreaterThanOrEqualTo(String value) {
            addCriterion("PINGGUNIAN >=", value, "pinggunian");
            return (Criteria) this;
        }

        public Criteria andPinggunianLessThan(String value) {
            addCriterion("PINGGUNIAN <", value, "pinggunian");
            return (Criteria) this;
        }

        public Criteria andPinggunianLessThanOrEqualTo(String value) {
            addCriterion("PINGGUNIAN <=", value, "pinggunian");
            return (Criteria) this;
        }

        public Criteria andPinggunianLike(String value) {
            addCriterion("PINGGUNIAN like", value, "pinggunian");
            return (Criteria) this;
        }

        public Criteria andPinggunianNotLike(String value) {
            addCriterion("PINGGUNIAN not like", value, "pinggunian");
            return (Criteria) this;
        }

        public Criteria andPinggunianIn(List<String> values) {
            addCriterion("PINGGUNIAN in", values, "pinggunian");
            return (Criteria) this;
        }

        public Criteria andPinggunianNotIn(List<String> values) {
            addCriterion("PINGGUNIAN not in", values, "pinggunian");
            return (Criteria) this;
        }

        public Criteria andPinggunianBetween(String value1, String value2) {
            addCriterion("PINGGUNIAN between", value1, value2, "pinggunian");
            return (Criteria) this;
        }

        public Criteria andPinggunianNotBetween(String value1, String value2) {
            addCriterion("PINGGUNIAN not between", value1, value2, "pinggunian");
            return (Criteria) this;
        }

        public Criteria andPingguyueIsNull() {
            addCriterion("PINGGUYUE is null");
            return (Criteria) this;
        }

        public Criteria andPingguyueIsNotNull() {
            addCriterion("PINGGUYUE is not null");
            return (Criteria) this;
        }

        public Criteria andPingguyueEqualTo(String value) {
            addCriterion("PINGGUYUE =", value, "pingguyue");
            return (Criteria) this;
        }

        public Criteria andPingguyueNotEqualTo(String value) {
            addCriterion("PINGGUYUE <>", value, "pingguyue");
            return (Criteria) this;
        }

        public Criteria andPingguyueGreaterThan(String value) {
            addCriterion("PINGGUYUE >", value, "pingguyue");
            return (Criteria) this;
        }

        public Criteria andPingguyueGreaterThanOrEqualTo(String value) {
            addCriterion("PINGGUYUE >=", value, "pingguyue");
            return (Criteria) this;
        }

        public Criteria andPingguyueLessThan(String value) {
            addCriterion("PINGGUYUE <", value, "pingguyue");
            return (Criteria) this;
        }

        public Criteria andPingguyueLessThanOrEqualTo(String value) {
            addCriterion("PINGGUYUE <=", value, "pingguyue");
            return (Criteria) this;
        }

        public Criteria andPingguyueLike(String value) {
            addCriterion("PINGGUYUE like", value, "pingguyue");
            return (Criteria) this;
        }

        public Criteria andPingguyueNotLike(String value) {
            addCriterion("PINGGUYUE not like", value, "pingguyue");
            return (Criteria) this;
        }

        public Criteria andPingguyueIn(List<String> values) {
            addCriterion("PINGGUYUE in", values, "pingguyue");
            return (Criteria) this;
        }

        public Criteria andPingguyueNotIn(List<String> values) {
            addCriterion("PINGGUYUE not in", values, "pingguyue");
            return (Criteria) this;
        }

        public Criteria andPingguyueBetween(String value1, String value2) {
            addCriterion("PINGGUYUE between", value1, value2, "pingguyue");
            return (Criteria) this;
        }

        public Criteria andPingguyueNotBetween(String value1, String value2) {
            addCriterion("PINGGUYUE not between", value1, value2, "pingguyue");
            return (Criteria) this;
        }

        public Criteria andPingguriIsNull() {
            addCriterion("PINGGURI is null");
            return (Criteria) this;
        }

        public Criteria andPingguriIsNotNull() {
            addCriterion("PINGGURI is not null");
            return (Criteria) this;
        }

        public Criteria andPingguriEqualTo(String value) {
            addCriterion("PINGGURI =", value, "pingguri");
            return (Criteria) this;
        }

        public Criteria andPingguriNotEqualTo(String value) {
            addCriterion("PINGGURI <>", value, "pingguri");
            return (Criteria) this;
        }

        public Criteria andPingguriGreaterThan(String value) {
            addCriterion("PINGGURI >", value, "pingguri");
            return (Criteria) this;
        }

        public Criteria andPingguriGreaterThanOrEqualTo(String value) {
            addCriterion("PINGGURI >=", value, "pingguri");
            return (Criteria) this;
        }

        public Criteria andPingguriLessThan(String value) {
            addCriterion("PINGGURI <", value, "pingguri");
            return (Criteria) this;
        }

        public Criteria andPingguriLessThanOrEqualTo(String value) {
            addCriterion("PINGGURI <=", value, "pingguri");
            return (Criteria) this;
        }

        public Criteria andPingguriLike(String value) {
            addCriterion("PINGGURI like", value, "pingguri");
            return (Criteria) this;
        }

        public Criteria andPingguriNotLike(String value) {
            addCriterion("PINGGURI not like", value, "pingguri");
            return (Criteria) this;
        }

        public Criteria andPingguriIn(List<String> values) {
            addCriterion("PINGGURI in", values, "pingguri");
            return (Criteria) this;
        }

        public Criteria andPingguriNotIn(List<String> values) {
            addCriterion("PINGGURI not in", values, "pingguri");
            return (Criteria) this;
        }

        public Criteria andPingguriBetween(String value1, String value2) {
            addCriterion("PINGGURI between", value1, value2, "pingguri");
            return (Criteria) this;
        }

        public Criteria andPingguriNotBetween(String value1, String value2) {
            addCriterion("PINGGURI not between", value1, value2, "pingguri");
            return (Criteria) this;
        }

        public Criteria andPinggujieguoIsNull() {
            addCriterion("PINGGUJIEGUO is null");
            return (Criteria) this;
        }

        public Criteria andPinggujieguoIsNotNull() {
            addCriterion("PINGGUJIEGUO is not null");
            return (Criteria) this;
        }

        public Criteria andPinggujieguoEqualTo(String value) {
            addCriterion("PINGGUJIEGUO =", value, "pinggujieguo");
            return (Criteria) this;
        }

        public Criteria andPinggujieguoNotEqualTo(String value) {
            addCriterion("PINGGUJIEGUO <>", value, "pinggujieguo");
            return (Criteria) this;
        }

        public Criteria andPinggujieguoGreaterThan(String value) {
            addCriterion("PINGGUJIEGUO >", value, "pinggujieguo");
            return (Criteria) this;
        }

        public Criteria andPinggujieguoGreaterThanOrEqualTo(String value) {
            addCriterion("PINGGUJIEGUO >=", value, "pinggujieguo");
            return (Criteria) this;
        }

        public Criteria andPinggujieguoLessThan(String value) {
            addCriterion("PINGGUJIEGUO <", value, "pinggujieguo");
            return (Criteria) this;
        }

        public Criteria andPinggujieguoLessThanOrEqualTo(String value) {
            addCriterion("PINGGUJIEGUO <=", value, "pinggujieguo");
            return (Criteria) this;
        }

        public Criteria andPinggujieguoLike(String value) {
            addCriterion("PINGGUJIEGUO like", value, "pinggujieguo");
            return (Criteria) this;
        }

        public Criteria andPinggujieguoNotLike(String value) {
            addCriterion("PINGGUJIEGUO not like", value, "pinggujieguo");
            return (Criteria) this;
        }

        public Criteria andPinggujieguoIn(List<String> values) {
            addCriterion("PINGGUJIEGUO in", values, "pinggujieguo");
            return (Criteria) this;
        }

        public Criteria andPinggujieguoNotIn(List<String> values) {
            addCriterion("PINGGUJIEGUO not in", values, "pinggujieguo");
            return (Criteria) this;
        }

        public Criteria andPinggujieguoBetween(String value1, String value2) {
            addCriterion("PINGGUJIEGUO between", value1, value2, "pinggujieguo");
            return (Criteria) this;
        }

        public Criteria andPinggujieguoNotBetween(String value1, String value2) {
            addCriterion("PINGGUJIEGUO not between", value1, value2, "pinggujieguo");
            return (Criteria) this;
        }

        public Criteria andNian2IsNull() {
            addCriterion("NIAN2 is null");
            return (Criteria) this;
        }

        public Criteria andNian2IsNotNull() {
            addCriterion("NIAN2 is not null");
            return (Criteria) this;
        }

        public Criteria andNian2EqualTo(String value) {
            addCriterion("NIAN2 =", value, "nian2");
            return (Criteria) this;
        }

        public Criteria andNian2NotEqualTo(String value) {
            addCriterion("NIAN2 <>", value, "nian2");
            return (Criteria) this;
        }

        public Criteria andNian2GreaterThan(String value) {
            addCriterion("NIAN2 >", value, "nian2");
            return (Criteria) this;
        }

        public Criteria andNian2GreaterThanOrEqualTo(String value) {
            addCriterion("NIAN2 >=", value, "nian2");
            return (Criteria) this;
        }

        public Criteria andNian2LessThan(String value) {
            addCriterion("NIAN2 <", value, "nian2");
            return (Criteria) this;
        }

        public Criteria andNian2LessThanOrEqualTo(String value) {
            addCriterion("NIAN2 <=", value, "nian2");
            return (Criteria) this;
        }

        public Criteria andNian2Like(String value) {
            addCriterion("NIAN2 like", value, "nian2");
            return (Criteria) this;
        }

        public Criteria andNian2NotLike(String value) {
            addCriterion("NIAN2 not like", value, "nian2");
            return (Criteria) this;
        }

        public Criteria andNian2In(List<String> values) {
            addCriterion("NIAN2 in", values, "nian2");
            return (Criteria) this;
        }

        public Criteria andNian2NotIn(List<String> values) {
            addCriterion("NIAN2 not in", values, "nian2");
            return (Criteria) this;
        }

        public Criteria andNian2Between(String value1, String value2) {
            addCriterion("NIAN2 between", value1, value2, "nian2");
            return (Criteria) this;
        }

        public Criteria andNian2NotBetween(String value1, String value2) {
            addCriterion("NIAN2 not between", value1, value2, "nian2");
            return (Criteria) this;
        }

        public Criteria andYue2IsNull() {
            addCriterion("YUE2 is null");
            return (Criteria) this;
        }

        public Criteria andYue2IsNotNull() {
            addCriterion("YUE2 is not null");
            return (Criteria) this;
        }

        public Criteria andYue2EqualTo(String value) {
            addCriterion("YUE2 =", value, "yue2");
            return (Criteria) this;
        }

        public Criteria andYue2NotEqualTo(String value) {
            addCriterion("YUE2 <>", value, "yue2");
            return (Criteria) this;
        }

        public Criteria andYue2GreaterThan(String value) {
            addCriterion("YUE2 >", value, "yue2");
            return (Criteria) this;
        }

        public Criteria andYue2GreaterThanOrEqualTo(String value) {
            addCriterion("YUE2 >=", value, "yue2");
            return (Criteria) this;
        }

        public Criteria andYue2LessThan(String value) {
            addCriterion("YUE2 <", value, "yue2");
            return (Criteria) this;
        }

        public Criteria andYue2LessThanOrEqualTo(String value) {
            addCriterion("YUE2 <=", value, "yue2");
            return (Criteria) this;
        }

        public Criteria andYue2Like(String value) {
            addCriterion("YUE2 like", value, "yue2");
            return (Criteria) this;
        }

        public Criteria andYue2NotLike(String value) {
            addCriterion("YUE2 not like", value, "yue2");
            return (Criteria) this;
        }

        public Criteria andYue2In(List<String> values) {
            addCriterion("YUE2 in", values, "yue2");
            return (Criteria) this;
        }

        public Criteria andYue2NotIn(List<String> values) {
            addCriterion("YUE2 not in", values, "yue2");
            return (Criteria) this;
        }

        public Criteria andYue2Between(String value1, String value2) {
            addCriterion("YUE2 between", value1, value2, "yue2");
            return (Criteria) this;
        }

        public Criteria andYue2NotBetween(String value1, String value2) {
            addCriterion("YUE2 not between", value1, value2, "yue2");
            return (Criteria) this;
        }

        public Criteria andRi2IsNull() {
            addCriterion("RI2 is null");
            return (Criteria) this;
        }

        public Criteria andRi2IsNotNull() {
            addCriterion("RI2 is not null");
            return (Criteria) this;
        }

        public Criteria andRi2EqualTo(String value) {
            addCriterion("RI2 =", value, "ri2");
            return (Criteria) this;
        }

        public Criteria andRi2NotEqualTo(String value) {
            addCriterion("RI2 <>", value, "ri2");
            return (Criteria) this;
        }

        public Criteria andRi2GreaterThan(String value) {
            addCriterion("RI2 >", value, "ri2");
            return (Criteria) this;
        }

        public Criteria andRi2GreaterThanOrEqualTo(String value) {
            addCriterion("RI2 >=", value, "ri2");
            return (Criteria) this;
        }

        public Criteria andRi2LessThan(String value) {
            addCriterion("RI2 <", value, "ri2");
            return (Criteria) this;
        }

        public Criteria andRi2LessThanOrEqualTo(String value) {
            addCriterion("RI2 <=", value, "ri2");
            return (Criteria) this;
        }

        public Criteria andRi2Like(String value) {
            addCriterion("RI2 like", value, "ri2");
            return (Criteria) this;
        }

        public Criteria andRi2NotLike(String value) {
            addCriterion("RI2 not like", value, "ri2");
            return (Criteria) this;
        }

        public Criteria andRi2In(List<String> values) {
            addCriterion("RI2 in", values, "ri2");
            return (Criteria) this;
        }

        public Criteria andRi2NotIn(List<String> values) {
            addCriterion("RI2 not in", values, "ri2");
            return (Criteria) this;
        }

        public Criteria andRi2Between(String value1, String value2) {
            addCriterion("RI2 between", value1, value2, "ri2");
            return (Criteria) this;
        }

        public Criteria andRi2NotBetween(String value1, String value2) {
            addCriterion("RI2 not between", value1, value2, "ri2");
            return (Criteria) this;
        }

        public Criteria andRadiobutton2IsNull() {
            addCriterion("RADIOBUTTON2 is null");
            return (Criteria) this;
        }

        public Criteria andRadiobutton2IsNotNull() {
            addCriterion("RADIOBUTTON2 is not null");
            return (Criteria) this;
        }

        public Criteria andRadiobutton2EqualTo(String value) {
            addCriterion("RADIOBUTTON2 =", value, "radiobutton2");
            return (Criteria) this;
        }

        public Criteria andRadiobutton2NotEqualTo(String value) {
            addCriterion("RADIOBUTTON2 <>", value, "radiobutton2");
            return (Criteria) this;
        }

        public Criteria andRadiobutton2GreaterThan(String value) {
            addCriterion("RADIOBUTTON2 >", value, "radiobutton2");
            return (Criteria) this;
        }

        public Criteria andRadiobutton2GreaterThanOrEqualTo(String value) {
            addCriterion("RADIOBUTTON2 >=", value, "radiobutton2");
            return (Criteria) this;
        }

        public Criteria andRadiobutton2LessThan(String value) {
            addCriterion("RADIOBUTTON2 <", value, "radiobutton2");
            return (Criteria) this;
        }

        public Criteria andRadiobutton2LessThanOrEqualTo(String value) {
            addCriterion("RADIOBUTTON2 <=", value, "radiobutton2");
            return (Criteria) this;
        }

        public Criteria andRadiobutton2Like(String value) {
            addCriterion("RADIOBUTTON2 like", value, "radiobutton2");
            return (Criteria) this;
        }

        public Criteria andRadiobutton2NotLike(String value) {
            addCriterion("RADIOBUTTON2 not like", value, "radiobutton2");
            return (Criteria) this;
        }

        public Criteria andRadiobutton2In(List<String> values) {
            addCriterion("RADIOBUTTON2 in", values, "radiobutton2");
            return (Criteria) this;
        }

        public Criteria andRadiobutton2NotIn(List<String> values) {
            addCriterion("RADIOBUTTON2 not in", values, "radiobutton2");
            return (Criteria) this;
        }

        public Criteria andRadiobutton2Between(String value1, String value2) {
            addCriterion("RADIOBUTTON2 between", value1, value2, "radiobutton2");
            return (Criteria) this;
        }

        public Criteria andRadiobutton2NotBetween(String value1, String value2) {
            addCriterion("RADIOBUTTON2 not between", value1, value2, "radiobutton2");
            return (Criteria) this;
        }

        public Criteria andShenjijigou1IsNull() {
            addCriterion("SHENJIJIGOU1 is null");
            return (Criteria) this;
        }

        public Criteria andShenjijigou1IsNotNull() {
            addCriterion("SHENJIJIGOU1 is not null");
            return (Criteria) this;
        }

        public Criteria andShenjijigou1EqualTo(String value) {
            addCriterion("SHENJIJIGOU1 =", value, "shenjijigou1");
            return (Criteria) this;
        }

        public Criteria andShenjijigou1NotEqualTo(String value) {
            addCriterion("SHENJIJIGOU1 <>", value, "shenjijigou1");
            return (Criteria) this;
        }

        public Criteria andShenjijigou1GreaterThan(String value) {
            addCriterion("SHENJIJIGOU1 >", value, "shenjijigou1");
            return (Criteria) this;
        }

        public Criteria andShenjijigou1GreaterThanOrEqualTo(String value) {
            addCriterion("SHENJIJIGOU1 >=", value, "shenjijigou1");
            return (Criteria) this;
        }

        public Criteria andShenjijigou1LessThan(String value) {
            addCriterion("SHENJIJIGOU1 <", value, "shenjijigou1");
            return (Criteria) this;
        }

        public Criteria andShenjijigou1LessThanOrEqualTo(String value) {
            addCriterion("SHENJIJIGOU1 <=", value, "shenjijigou1");
            return (Criteria) this;
        }

        public Criteria andShenjijigou1Like(String value) {
            addCriterion("SHENJIJIGOU1 like", value, "shenjijigou1");
            return (Criteria) this;
        }

        public Criteria andShenjijigou1NotLike(String value) {
            addCriterion("SHENJIJIGOU1 not like", value, "shenjijigou1");
            return (Criteria) this;
        }

        public Criteria andShenjijigou1In(List<String> values) {
            addCriterion("SHENJIJIGOU1 in", values, "shenjijigou1");
            return (Criteria) this;
        }

        public Criteria andShenjijigou1NotIn(List<String> values) {
            addCriterion("SHENJIJIGOU1 not in", values, "shenjijigou1");
            return (Criteria) this;
        }

        public Criteria andShenjijigou1Between(String value1, String value2) {
            addCriterion("SHENJIJIGOU1 between", value1, value2, "shenjijigou1");
            return (Criteria) this;
        }

        public Criteria andShenjijigou1NotBetween(String value1, String value2) {
            addCriterion("SHENJIJIGOU1 not between", value1, value2, "shenjijigou1");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu1IsNull() {
            addCriterion("BAOGAOYONGTU1 is null");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu1IsNotNull() {
            addCriterion("BAOGAOYONGTU1 is not null");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu1EqualTo(String value) {
            addCriterion("BAOGAOYONGTU1 =", value, "baogaoyongtu1");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu1NotEqualTo(String value) {
            addCriterion("BAOGAOYONGTU1 <>", value, "baogaoyongtu1");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu1GreaterThan(String value) {
            addCriterion("BAOGAOYONGTU1 >", value, "baogaoyongtu1");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu1GreaterThanOrEqualTo(String value) {
            addCriterion("BAOGAOYONGTU1 >=", value, "baogaoyongtu1");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu1LessThan(String value) {
            addCriterion("BAOGAOYONGTU1 <", value, "baogaoyongtu1");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu1LessThanOrEqualTo(String value) {
            addCriterion("BAOGAOYONGTU1 <=", value, "baogaoyongtu1");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu1Like(String value) {
            addCriterion("BAOGAOYONGTU1 like", value, "baogaoyongtu1");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu1NotLike(String value) {
            addCriterion("BAOGAOYONGTU1 not like", value, "baogaoyongtu1");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu1In(List<String> values) {
            addCriterion("BAOGAOYONGTU1 in", values, "baogaoyongtu1");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu1NotIn(List<String> values) {
            addCriterion("BAOGAOYONGTU1 not in", values, "baogaoyongtu1");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu1Between(String value1, String value2) {
            addCriterion("BAOGAOYONGTU1 between", value1, value2, "baogaoyongtu1");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu1NotBetween(String value1, String value2) {
            addCriterion("BAOGAOYONGTU1 not between", value1, value2, "baogaoyongtu1");
            return (Criteria) this;
        }

        public Criteria andRadiobutton3IsNull() {
            addCriterion("RADIOBUTTON3 is null");
            return (Criteria) this;
        }

        public Criteria andRadiobutton3IsNotNull() {
            addCriterion("RADIOBUTTON3 is not null");
            return (Criteria) this;
        }

        public Criteria andRadiobutton3EqualTo(String value) {
            addCriterion("RADIOBUTTON3 =", value, "radiobutton3");
            return (Criteria) this;
        }

        public Criteria andRadiobutton3NotEqualTo(String value) {
            addCriterion("RADIOBUTTON3 <>", value, "radiobutton3");
            return (Criteria) this;
        }

        public Criteria andRadiobutton3GreaterThan(String value) {
            addCriterion("RADIOBUTTON3 >", value, "radiobutton3");
            return (Criteria) this;
        }

        public Criteria andRadiobutton3GreaterThanOrEqualTo(String value) {
            addCriterion("RADIOBUTTON3 >=", value, "radiobutton3");
            return (Criteria) this;
        }

        public Criteria andRadiobutton3LessThan(String value) {
            addCriterion("RADIOBUTTON3 <", value, "radiobutton3");
            return (Criteria) this;
        }

        public Criteria andRadiobutton3LessThanOrEqualTo(String value) {
            addCriterion("RADIOBUTTON3 <=", value, "radiobutton3");
            return (Criteria) this;
        }

        public Criteria andRadiobutton3Like(String value) {
            addCriterion("RADIOBUTTON3 like", value, "radiobutton3");
            return (Criteria) this;
        }

        public Criteria andRadiobutton3NotLike(String value) {
            addCriterion("RADIOBUTTON3 not like", value, "radiobutton3");
            return (Criteria) this;
        }

        public Criteria andRadiobutton3In(List<String> values) {
            addCriterion("RADIOBUTTON3 in", values, "radiobutton3");
            return (Criteria) this;
        }

        public Criteria andRadiobutton3NotIn(List<String> values) {
            addCriterion("RADIOBUTTON3 not in", values, "radiobutton3");
            return (Criteria) this;
        }

        public Criteria andRadiobutton3Between(String value1, String value2) {
            addCriterion("RADIOBUTTON3 between", value1, value2, "radiobutton3");
            return (Criteria) this;
        }

        public Criteria andRadiobutton3NotBetween(String value1, String value2) {
            addCriterion("RADIOBUTTON3 not between", value1, value2, "radiobutton3");
            return (Criteria) this;
        }

        public Criteria andShenjijigou2IsNull() {
            addCriterion("SHENJIJIGOU2 is null");
            return (Criteria) this;
        }

        public Criteria andShenjijigou2IsNotNull() {
            addCriterion("SHENJIJIGOU2 is not null");
            return (Criteria) this;
        }

        public Criteria andShenjijigou2EqualTo(String value) {
            addCriterion("SHENJIJIGOU2 =", value, "shenjijigou2");
            return (Criteria) this;
        }

        public Criteria andShenjijigou2NotEqualTo(String value) {
            addCriterion("SHENJIJIGOU2 <>", value, "shenjijigou2");
            return (Criteria) this;
        }

        public Criteria andShenjijigou2GreaterThan(String value) {
            addCriterion("SHENJIJIGOU2 >", value, "shenjijigou2");
            return (Criteria) this;
        }

        public Criteria andShenjijigou2GreaterThanOrEqualTo(String value) {
            addCriterion("SHENJIJIGOU2 >=", value, "shenjijigou2");
            return (Criteria) this;
        }

        public Criteria andShenjijigou2LessThan(String value) {
            addCriterion("SHENJIJIGOU2 <", value, "shenjijigou2");
            return (Criteria) this;
        }

        public Criteria andShenjijigou2LessThanOrEqualTo(String value) {
            addCriterion("SHENJIJIGOU2 <=", value, "shenjijigou2");
            return (Criteria) this;
        }

        public Criteria andShenjijigou2Like(String value) {
            addCriterion("SHENJIJIGOU2 like", value, "shenjijigou2");
            return (Criteria) this;
        }

        public Criteria andShenjijigou2NotLike(String value) {
            addCriterion("SHENJIJIGOU2 not like", value, "shenjijigou2");
            return (Criteria) this;
        }

        public Criteria andShenjijigou2In(List<String> values) {
            addCriterion("SHENJIJIGOU2 in", values, "shenjijigou2");
            return (Criteria) this;
        }

        public Criteria andShenjijigou2NotIn(List<String> values) {
            addCriterion("SHENJIJIGOU2 not in", values, "shenjijigou2");
            return (Criteria) this;
        }

        public Criteria andShenjijigou2Between(String value1, String value2) {
            addCriterion("SHENJIJIGOU2 between", value1, value2, "shenjijigou2");
            return (Criteria) this;
        }

        public Criteria andShenjijigou2NotBetween(String value1, String value2) {
            addCriterion("SHENJIJIGOU2 not between", value1, value2, "shenjijigou2");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu2IsNull() {
            addCriterion("BAOGAOYONGTU2 is null");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu2IsNotNull() {
            addCriterion("BAOGAOYONGTU2 is not null");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu2EqualTo(String value) {
            addCriterion("BAOGAOYONGTU2 =", value, "baogaoyongtu2");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu2NotEqualTo(String value) {
            addCriterion("BAOGAOYONGTU2 <>", value, "baogaoyongtu2");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu2GreaterThan(String value) {
            addCriterion("BAOGAOYONGTU2 >", value, "baogaoyongtu2");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu2GreaterThanOrEqualTo(String value) {
            addCriterion("BAOGAOYONGTU2 >=", value, "baogaoyongtu2");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu2LessThan(String value) {
            addCriterion("BAOGAOYONGTU2 <", value, "baogaoyongtu2");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu2LessThanOrEqualTo(String value) {
            addCriterion("BAOGAOYONGTU2 <=", value, "baogaoyongtu2");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu2Like(String value) {
            addCriterion("BAOGAOYONGTU2 like", value, "baogaoyongtu2");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu2NotLike(String value) {
            addCriterion("BAOGAOYONGTU2 not like", value, "baogaoyongtu2");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu2In(List<String> values) {
            addCriterion("BAOGAOYONGTU2 in", values, "baogaoyongtu2");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu2NotIn(List<String> values) {
            addCriterion("BAOGAOYONGTU2 not in", values, "baogaoyongtu2");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu2Between(String value1, String value2) {
            addCriterion("BAOGAOYONGTU2 between", value1, value2, "baogaoyongtu2");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu2NotBetween(String value1, String value2) {
            addCriterion("BAOGAOYONGTU2 not between", value1, value2, "baogaoyongtu2");
            return (Criteria) this;
        }

        public Criteria andRadiobutton4IsNull() {
            addCriterion("RADIOBUTTON4 is null");
            return (Criteria) this;
        }

        public Criteria andRadiobutton4IsNotNull() {
            addCriterion("RADIOBUTTON4 is not null");
            return (Criteria) this;
        }

        public Criteria andRadiobutton4EqualTo(String value) {
            addCriterion("RADIOBUTTON4 =", value, "radiobutton4");
            return (Criteria) this;
        }

        public Criteria andRadiobutton4NotEqualTo(String value) {
            addCriterion("RADIOBUTTON4 <>", value, "radiobutton4");
            return (Criteria) this;
        }

        public Criteria andRadiobutton4GreaterThan(String value) {
            addCriterion("RADIOBUTTON4 >", value, "radiobutton4");
            return (Criteria) this;
        }

        public Criteria andRadiobutton4GreaterThanOrEqualTo(String value) {
            addCriterion("RADIOBUTTON4 >=", value, "radiobutton4");
            return (Criteria) this;
        }

        public Criteria andRadiobutton4LessThan(String value) {
            addCriterion("RADIOBUTTON4 <", value, "radiobutton4");
            return (Criteria) this;
        }

        public Criteria andRadiobutton4LessThanOrEqualTo(String value) {
            addCriterion("RADIOBUTTON4 <=", value, "radiobutton4");
            return (Criteria) this;
        }

        public Criteria andRadiobutton4Like(String value) {
            addCriterion("RADIOBUTTON4 like", value, "radiobutton4");
            return (Criteria) this;
        }

        public Criteria andRadiobutton4NotLike(String value) {
            addCriterion("RADIOBUTTON4 not like", value, "radiobutton4");
            return (Criteria) this;
        }

        public Criteria andRadiobutton4In(List<String> values) {
            addCriterion("RADIOBUTTON4 in", values, "radiobutton4");
            return (Criteria) this;
        }

        public Criteria andRadiobutton4NotIn(List<String> values) {
            addCriterion("RADIOBUTTON4 not in", values, "radiobutton4");
            return (Criteria) this;
        }

        public Criteria andRadiobutton4Between(String value1, String value2) {
            addCriterion("RADIOBUTTON4 between", value1, value2, "radiobutton4");
            return (Criteria) this;
        }

        public Criteria andRadiobutton4NotBetween(String value1, String value2) {
            addCriterion("RADIOBUTTON4 not between", value1, value2, "radiobutton4");
            return (Criteria) this;
        }

        public Criteria andShenjijigou3IsNull() {
            addCriterion("SHENJIJIGOU3 is null");
            return (Criteria) this;
        }

        public Criteria andShenjijigou3IsNotNull() {
            addCriterion("SHENJIJIGOU3 is not null");
            return (Criteria) this;
        }

        public Criteria andShenjijigou3EqualTo(String value) {
            addCriterion("SHENJIJIGOU3 =", value, "shenjijigou3");
            return (Criteria) this;
        }

        public Criteria andShenjijigou3NotEqualTo(String value) {
            addCriterion("SHENJIJIGOU3 <>", value, "shenjijigou3");
            return (Criteria) this;
        }

        public Criteria andShenjijigou3GreaterThan(String value) {
            addCriterion("SHENJIJIGOU3 >", value, "shenjijigou3");
            return (Criteria) this;
        }

        public Criteria andShenjijigou3GreaterThanOrEqualTo(String value) {
            addCriterion("SHENJIJIGOU3 >=", value, "shenjijigou3");
            return (Criteria) this;
        }

        public Criteria andShenjijigou3LessThan(String value) {
            addCriterion("SHENJIJIGOU3 <", value, "shenjijigou3");
            return (Criteria) this;
        }

        public Criteria andShenjijigou3LessThanOrEqualTo(String value) {
            addCriterion("SHENJIJIGOU3 <=", value, "shenjijigou3");
            return (Criteria) this;
        }

        public Criteria andShenjijigou3Like(String value) {
            addCriterion("SHENJIJIGOU3 like", value, "shenjijigou3");
            return (Criteria) this;
        }

        public Criteria andShenjijigou3NotLike(String value) {
            addCriterion("SHENJIJIGOU3 not like", value, "shenjijigou3");
            return (Criteria) this;
        }

        public Criteria andShenjijigou3In(List<String> values) {
            addCriterion("SHENJIJIGOU3 in", values, "shenjijigou3");
            return (Criteria) this;
        }

        public Criteria andShenjijigou3NotIn(List<String> values) {
            addCriterion("SHENJIJIGOU3 not in", values, "shenjijigou3");
            return (Criteria) this;
        }

        public Criteria andShenjijigou3Between(String value1, String value2) {
            addCriterion("SHENJIJIGOU3 between", value1, value2, "shenjijigou3");
            return (Criteria) this;
        }

        public Criteria andShenjijigou3NotBetween(String value1, String value2) {
            addCriterion("SHENJIJIGOU3 not between", value1, value2, "shenjijigou3");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu3IsNull() {
            addCriterion("BAOGAOYONGTU3 is null");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu3IsNotNull() {
            addCriterion("BAOGAOYONGTU3 is not null");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu3EqualTo(String value) {
            addCriterion("BAOGAOYONGTU3 =", value, "baogaoyongtu3");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu3NotEqualTo(String value) {
            addCriterion("BAOGAOYONGTU3 <>", value, "baogaoyongtu3");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu3GreaterThan(String value) {
            addCriterion("BAOGAOYONGTU3 >", value, "baogaoyongtu3");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu3GreaterThanOrEqualTo(String value) {
            addCriterion("BAOGAOYONGTU3 >=", value, "baogaoyongtu3");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu3LessThan(String value) {
            addCriterion("BAOGAOYONGTU3 <", value, "baogaoyongtu3");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu3LessThanOrEqualTo(String value) {
            addCriterion("BAOGAOYONGTU3 <=", value, "baogaoyongtu3");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu3Like(String value) {
            addCriterion("BAOGAOYONGTU3 like", value, "baogaoyongtu3");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu3NotLike(String value) {
            addCriterion("BAOGAOYONGTU3 not like", value, "baogaoyongtu3");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu3In(List<String> values) {
            addCriterion("BAOGAOYONGTU3 in", values, "baogaoyongtu3");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu3NotIn(List<String> values) {
            addCriterion("BAOGAOYONGTU3 not in", values, "baogaoyongtu3");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu3Between(String value1, String value2) {
            addCriterion("BAOGAOYONGTU3 between", value1, value2, "baogaoyongtu3");
            return (Criteria) this;
        }

        public Criteria andBaogaoyongtu3NotBetween(String value1, String value2) {
            addCriterion("BAOGAOYONGTU3 not between", value1, value2, "baogaoyongtu3");
            return (Criteria) this;
        }

        public Criteria andRadiobutton5IsNull() {
            addCriterion("RADIOBUTTON5 is null");
            return (Criteria) this;
        }

        public Criteria andRadiobutton5IsNotNull() {
            addCriterion("RADIOBUTTON5 is not null");
            return (Criteria) this;
        }

        public Criteria andRadiobutton5EqualTo(String value) {
            addCriterion("RADIOBUTTON5 =", value, "radiobutton5");
            return (Criteria) this;
        }

        public Criteria andRadiobutton5NotEqualTo(String value) {
            addCriterion("RADIOBUTTON5 <>", value, "radiobutton5");
            return (Criteria) this;
        }

        public Criteria andRadiobutton5GreaterThan(String value) {
            addCriterion("RADIOBUTTON5 >", value, "radiobutton5");
            return (Criteria) this;
        }

        public Criteria andRadiobutton5GreaterThanOrEqualTo(String value) {
            addCriterion("RADIOBUTTON5 >=", value, "radiobutton5");
            return (Criteria) this;
        }

        public Criteria andRadiobutton5LessThan(String value) {
            addCriterion("RADIOBUTTON5 <", value, "radiobutton5");
            return (Criteria) this;
        }

        public Criteria andRadiobutton5LessThanOrEqualTo(String value) {
            addCriterion("RADIOBUTTON5 <=", value, "radiobutton5");
            return (Criteria) this;
        }

        public Criteria andRadiobutton5Like(String value) {
            addCriterion("RADIOBUTTON5 like", value, "radiobutton5");
            return (Criteria) this;
        }

        public Criteria andRadiobutton5NotLike(String value) {
            addCriterion("RADIOBUTTON5 not like", value, "radiobutton5");
            return (Criteria) this;
        }

        public Criteria andRadiobutton5In(List<String> values) {
            addCriterion("RADIOBUTTON5 in", values, "radiobutton5");
            return (Criteria) this;
        }

        public Criteria andRadiobutton5NotIn(List<String> values) {
            addCriterion("RADIOBUTTON5 not in", values, "radiobutton5");
            return (Criteria) this;
        }

        public Criteria andRadiobutton5Between(String value1, String value2) {
            addCriterion("RADIOBUTTON5 between", value1, value2, "radiobutton5");
            return (Criteria) this;
        }

        public Criteria andRadiobutton5NotBetween(String value1, String value2) {
            addCriterion("RADIOBUTTON5 not between", value1, value2, "radiobutton5");
            return (Criteria) this;
        }

        public Criteria andNian3IsNull() {
            addCriterion("NIAN3 is null");
            return (Criteria) this;
        }

        public Criteria andNian3IsNotNull() {
            addCriterion("NIAN3 is not null");
            return (Criteria) this;
        }

        public Criteria andNian3EqualTo(String value) {
            addCriterion("NIAN3 =", value, "nian3");
            return (Criteria) this;
        }

        public Criteria andNian3NotEqualTo(String value) {
            addCriterion("NIAN3 <>", value, "nian3");
            return (Criteria) this;
        }

        public Criteria andNian3GreaterThan(String value) {
            addCriterion("NIAN3 >", value, "nian3");
            return (Criteria) this;
        }

        public Criteria andNian3GreaterThanOrEqualTo(String value) {
            addCriterion("NIAN3 >=", value, "nian3");
            return (Criteria) this;
        }

        public Criteria andNian3LessThan(String value) {
            addCriterion("NIAN3 <", value, "nian3");
            return (Criteria) this;
        }

        public Criteria andNian3LessThanOrEqualTo(String value) {
            addCriterion("NIAN3 <=", value, "nian3");
            return (Criteria) this;
        }

        public Criteria andNian3Like(String value) {
            addCriterion("NIAN3 like", value, "nian3");
            return (Criteria) this;
        }

        public Criteria andNian3NotLike(String value) {
            addCriterion("NIAN3 not like", value, "nian3");
            return (Criteria) this;
        }

        public Criteria andNian3In(List<String> values) {
            addCriterion("NIAN3 in", values, "nian3");
            return (Criteria) this;
        }

        public Criteria andNian3NotIn(List<String> values) {
            addCriterion("NIAN3 not in", values, "nian3");
            return (Criteria) this;
        }

        public Criteria andNian3Between(String value1, String value2) {
            addCriterion("NIAN3 between", value1, value2, "nian3");
            return (Criteria) this;
        }

        public Criteria andNian3NotBetween(String value1, String value2) {
            addCriterion("NIAN3 not between", value1, value2, "nian3");
            return (Criteria) this;
        }

        public Criteria andYue3IsNull() {
            addCriterion("YUE3 is null");
            return (Criteria) this;
        }

        public Criteria andYue3IsNotNull() {
            addCriterion("YUE3 is not null");
            return (Criteria) this;
        }

        public Criteria andYue3EqualTo(String value) {
            addCriterion("YUE3 =", value, "yue3");
            return (Criteria) this;
        }

        public Criteria andYue3NotEqualTo(String value) {
            addCriterion("YUE3 <>", value, "yue3");
            return (Criteria) this;
        }

        public Criteria andYue3GreaterThan(String value) {
            addCriterion("YUE3 >", value, "yue3");
            return (Criteria) this;
        }

        public Criteria andYue3GreaterThanOrEqualTo(String value) {
            addCriterion("YUE3 >=", value, "yue3");
            return (Criteria) this;
        }

        public Criteria andYue3LessThan(String value) {
            addCriterion("YUE3 <", value, "yue3");
            return (Criteria) this;
        }

        public Criteria andYue3LessThanOrEqualTo(String value) {
            addCriterion("YUE3 <=", value, "yue3");
            return (Criteria) this;
        }

        public Criteria andYue3Like(String value) {
            addCriterion("YUE3 like", value, "yue3");
            return (Criteria) this;
        }

        public Criteria andYue3NotLike(String value) {
            addCriterion("YUE3 not like", value, "yue3");
            return (Criteria) this;
        }

        public Criteria andYue3In(List<String> values) {
            addCriterion("YUE3 in", values, "yue3");
            return (Criteria) this;
        }

        public Criteria andYue3NotIn(List<String> values) {
            addCriterion("YUE3 not in", values, "yue3");
            return (Criteria) this;
        }

        public Criteria andYue3Between(String value1, String value2) {
            addCriterion("YUE3 between", value1, value2, "yue3");
            return (Criteria) this;
        }

        public Criteria andYue3NotBetween(String value1, String value2) {
            addCriterion("YUE3 not between", value1, value2, "yue3");
            return (Criteria) this;
        }

        public Criteria andRi3IsNull() {
            addCriterion("RI3 is null");
            return (Criteria) this;
        }

        public Criteria andRi3IsNotNull() {
            addCriterion("RI3 is not null");
            return (Criteria) this;
        }

        public Criteria andRi3EqualTo(String value) {
            addCriterion("RI3 =", value, "ri3");
            return (Criteria) this;
        }

        public Criteria andRi3NotEqualTo(String value) {
            addCriterion("RI3 <>", value, "ri3");
            return (Criteria) this;
        }

        public Criteria andRi3GreaterThan(String value) {
            addCriterion("RI3 >", value, "ri3");
            return (Criteria) this;
        }

        public Criteria andRi3GreaterThanOrEqualTo(String value) {
            addCriterion("RI3 >=", value, "ri3");
            return (Criteria) this;
        }

        public Criteria andRi3LessThan(String value) {
            addCriterion("RI3 <", value, "ri3");
            return (Criteria) this;
        }

        public Criteria andRi3LessThanOrEqualTo(String value) {
            addCriterion("RI3 <=", value, "ri3");
            return (Criteria) this;
        }

        public Criteria andRi3Like(String value) {
            addCriterion("RI3 like", value, "ri3");
            return (Criteria) this;
        }

        public Criteria andRi3NotLike(String value) {
            addCriterion("RI3 not like", value, "ri3");
            return (Criteria) this;
        }

        public Criteria andRi3In(List<String> values) {
            addCriterion("RI3 in", values, "ri3");
            return (Criteria) this;
        }

        public Criteria andRi3NotIn(List<String> values) {
            addCriterion("RI3 not in", values, "ri3");
            return (Criteria) this;
        }

        public Criteria andRi3Between(String value1, String value2) {
            addCriterion("RI3 between", value1, value2, "ri3");
            return (Criteria) this;
        }

        public Criteria andRi3NotBetween(String value1, String value2) {
            addCriterion("RI3 not between", value1, value2, "ri3");
            return (Criteria) this;
        }

        public Criteria andChufazhongleiIsNull() {
            addCriterion("CHUFAZHONGLEI is null");
            return (Criteria) this;
        }

        public Criteria andChufazhongleiIsNotNull() {
            addCriterion("CHUFAZHONGLEI is not null");
            return (Criteria) this;
        }

        public Criteria andChufazhongleiEqualTo(String value) {
            addCriterion("CHUFAZHONGLEI =", value, "chufazhonglei");
            return (Criteria) this;
        }

        public Criteria andChufazhongleiNotEqualTo(String value) {
            addCriterion("CHUFAZHONGLEI <>", value, "chufazhonglei");
            return (Criteria) this;
        }

        public Criteria andChufazhongleiGreaterThan(String value) {
            addCriterion("CHUFAZHONGLEI >", value, "chufazhonglei");
            return (Criteria) this;
        }

        public Criteria andChufazhongleiGreaterThanOrEqualTo(String value) {
            addCriterion("CHUFAZHONGLEI >=", value, "chufazhonglei");
            return (Criteria) this;
        }

        public Criteria andChufazhongleiLessThan(String value) {
            addCriterion("CHUFAZHONGLEI <", value, "chufazhonglei");
            return (Criteria) this;
        }

        public Criteria andChufazhongleiLessThanOrEqualTo(String value) {
            addCriterion("CHUFAZHONGLEI <=", value, "chufazhonglei");
            return (Criteria) this;
        }

        public Criteria andChufazhongleiLike(String value) {
            addCriterion("CHUFAZHONGLEI like", value, "chufazhonglei");
            return (Criteria) this;
        }

        public Criteria andChufazhongleiNotLike(String value) {
            addCriterion("CHUFAZHONGLEI not like", value, "chufazhonglei");
            return (Criteria) this;
        }

        public Criteria andChufazhongleiIn(List<String> values) {
            addCriterion("CHUFAZHONGLEI in", values, "chufazhonglei");
            return (Criteria) this;
        }

        public Criteria andChufazhongleiNotIn(List<String> values) {
            addCriterion("CHUFAZHONGLEI not in", values, "chufazhonglei");
            return (Criteria) this;
        }

        public Criteria andChufazhongleiBetween(String value1, String value2) {
            addCriterion("CHUFAZHONGLEI between", value1, value2, "chufazhonglei");
            return (Criteria) this;
        }

        public Criteria andChufazhongleiNotBetween(String value1, String value2) {
            addCriterion("CHUFAZHONGLEI not between", value1, value2, "chufazhonglei");
            return (Criteria) this;
        }

        public Criteria andShishijiguanIsNull() {
            addCriterion("SHISHIJIGUAN is null");
            return (Criteria) this;
        }

        public Criteria andShishijiguanIsNotNull() {
            addCriterion("SHISHIJIGUAN is not null");
            return (Criteria) this;
        }

        public Criteria andShishijiguanEqualTo(String value) {
            addCriterion("SHISHIJIGUAN =", value, "shishijiguan");
            return (Criteria) this;
        }

        public Criteria andShishijiguanNotEqualTo(String value) {
            addCriterion("SHISHIJIGUAN <>", value, "shishijiguan");
            return (Criteria) this;
        }

        public Criteria andShishijiguanGreaterThan(String value) {
            addCriterion("SHISHIJIGUAN >", value, "shishijiguan");
            return (Criteria) this;
        }

        public Criteria andShishijiguanGreaterThanOrEqualTo(String value) {
            addCriterion("SHISHIJIGUAN >=", value, "shishijiguan");
            return (Criteria) this;
        }

        public Criteria andShishijiguanLessThan(String value) {
            addCriterion("SHISHIJIGUAN <", value, "shishijiguan");
            return (Criteria) this;
        }

        public Criteria andShishijiguanLessThanOrEqualTo(String value) {
            addCriterion("SHISHIJIGUAN <=", value, "shishijiguan");
            return (Criteria) this;
        }

        public Criteria andShishijiguanLike(String value) {
            addCriterion("SHISHIJIGUAN like", value, "shishijiguan");
            return (Criteria) this;
        }

        public Criteria andShishijiguanNotLike(String value) {
            addCriterion("SHISHIJIGUAN not like", value, "shishijiguan");
            return (Criteria) this;
        }

        public Criteria andShishijiguanIn(List<String> values) {
            addCriterion("SHISHIJIGUAN in", values, "shishijiguan");
            return (Criteria) this;
        }

        public Criteria andShishijiguanNotIn(List<String> values) {
            addCriterion("SHISHIJIGUAN not in", values, "shishijiguan");
            return (Criteria) this;
        }

        public Criteria andShishijiguanBetween(String value1, String value2) {
            addCriterion("SHISHIJIGUAN between", value1, value2, "shishijiguan");
            return (Criteria) this;
        }

        public Criteria andShishijiguanNotBetween(String value1, String value2) {
            addCriterion("SHISHIJIGUAN not between", value1, value2, "shishijiguan");
            return (Criteria) this;
        }

        public Criteria andWeifaxingweiIsNull() {
            addCriterion("WEIFAXINGWEI is null");
            return (Criteria) this;
        }

        public Criteria andWeifaxingweiIsNotNull() {
            addCriterion("WEIFAXINGWEI is not null");
            return (Criteria) this;
        }

        public Criteria andWeifaxingweiEqualTo(String value) {
            addCriterion("WEIFAXINGWEI =", value, "weifaxingwei");
            return (Criteria) this;
        }

        public Criteria andWeifaxingweiNotEqualTo(String value) {
            addCriterion("WEIFAXINGWEI <>", value, "weifaxingwei");
            return (Criteria) this;
        }

        public Criteria andWeifaxingweiGreaterThan(String value) {
            addCriterion("WEIFAXINGWEI >", value, "weifaxingwei");
            return (Criteria) this;
        }

        public Criteria andWeifaxingweiGreaterThanOrEqualTo(String value) {
            addCriterion("WEIFAXINGWEI >=", value, "weifaxingwei");
            return (Criteria) this;
        }

        public Criteria andWeifaxingweiLessThan(String value) {
            addCriterion("WEIFAXINGWEI <", value, "weifaxingwei");
            return (Criteria) this;
        }

        public Criteria andWeifaxingweiLessThanOrEqualTo(String value) {
            addCriterion("WEIFAXINGWEI <=", value, "weifaxingwei");
            return (Criteria) this;
        }

        public Criteria andWeifaxingweiLike(String value) {
            addCriterion("WEIFAXINGWEI like", value, "weifaxingwei");
            return (Criteria) this;
        }

        public Criteria andWeifaxingweiNotLike(String value) {
            addCriterion("WEIFAXINGWEI not like", value, "weifaxingwei");
            return (Criteria) this;
        }

        public Criteria andWeifaxingweiIn(List<String> values) {
            addCriterion("WEIFAXINGWEI in", values, "weifaxingwei");
            return (Criteria) this;
        }

        public Criteria andWeifaxingweiNotIn(List<String> values) {
            addCriterion("WEIFAXINGWEI not in", values, "weifaxingwei");
            return (Criteria) this;
        }

        public Criteria andWeifaxingweiBetween(String value1, String value2) {
            addCriterion("WEIFAXINGWEI between", value1, value2, "weifaxingwei");
            return (Criteria) this;
        }

        public Criteria andWeifaxingweiNotBetween(String value1, String value2) {
            addCriterion("WEIFAXINGWEI not between", value1, value2, "weifaxingwei");
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

        public Criteria andShuiqiankouchuIsNull() {
            addCriterion("SHUIQIANKOUCHU is null");
            return (Criteria) this;
        }

        public Criteria andShuiqiankouchuIsNotNull() {
            addCriterion("SHUIQIANKOUCHU is not null");
            return (Criteria) this;
        }

        public Criteria andShuiqiankouchuEqualTo(String value) {
            addCriterion("SHUIQIANKOUCHU =", value, "shuiqiankouchu");
            return (Criteria) this;
        }

        public Criteria andShuiqiankouchuNotEqualTo(String value) {
            addCriterion("SHUIQIANKOUCHU <>", value, "shuiqiankouchu");
            return (Criteria) this;
        }

        public Criteria andShuiqiankouchuGreaterThan(String value) {
            addCriterion("SHUIQIANKOUCHU >", value, "shuiqiankouchu");
            return (Criteria) this;
        }

        public Criteria andShuiqiankouchuGreaterThanOrEqualTo(String value) {
            addCriterion("SHUIQIANKOUCHU >=", value, "shuiqiankouchu");
            return (Criteria) this;
        }

        public Criteria andShuiqiankouchuLessThan(String value) {
            addCriterion("SHUIQIANKOUCHU <", value, "shuiqiankouchu");
            return (Criteria) this;
        }

        public Criteria andShuiqiankouchuLessThanOrEqualTo(String value) {
            addCriterion("SHUIQIANKOUCHU <=", value, "shuiqiankouchu");
            return (Criteria) this;
        }

        public Criteria andShuiqiankouchuLike(String value) {
            addCriterion("SHUIQIANKOUCHU like", value, "shuiqiankouchu");
            return (Criteria) this;
        }

        public Criteria andShuiqiankouchuNotLike(String value) {
            addCriterion("SHUIQIANKOUCHU not like", value, "shuiqiankouchu");
            return (Criteria) this;
        }

        public Criteria andShuiqiankouchuIn(List<String> values) {
            addCriterion("SHUIQIANKOUCHU in", values, "shuiqiankouchu");
            return (Criteria) this;
        }

        public Criteria andShuiqiankouchuNotIn(List<String> values) {
            addCriterion("SHUIQIANKOUCHU not in", values, "shuiqiankouchu");
            return (Criteria) this;
        }

        public Criteria andShuiqiankouchuBetween(String value1, String value2) {
            addCriterion("SHUIQIANKOUCHU between", value1, value2, "shuiqiankouchu");
            return (Criteria) this;
        }

        public Criteria andShuiqiankouchuNotBetween(String value1, String value2) {
            addCriterion("SHUIQIANKOUCHU not between", value1, value2, "shuiqiankouchu");
            return (Criteria) this;
        }

        public Criteria andMianshuizigeIsNull() {
            addCriterion("MIANSHUIZIGE is null");
            return (Criteria) this;
        }

        public Criteria andMianshuizigeIsNotNull() {
            addCriterion("MIANSHUIZIGE is not null");
            return (Criteria) this;
        }

        public Criteria andMianshuizigeEqualTo(String value) {
            addCriterion("MIANSHUIZIGE =", value, "mianshuizige");
            return (Criteria) this;
        }

        public Criteria andMianshuizigeNotEqualTo(String value) {
            addCriterion("MIANSHUIZIGE <>", value, "mianshuizige");
            return (Criteria) this;
        }

        public Criteria andMianshuizigeGreaterThan(String value) {
            addCriterion("MIANSHUIZIGE >", value, "mianshuizige");
            return (Criteria) this;
        }

        public Criteria andMianshuizigeGreaterThanOrEqualTo(String value) {
            addCriterion("MIANSHUIZIGE >=", value, "mianshuizige");
            return (Criteria) this;
        }

        public Criteria andMianshuizigeLessThan(String value) {
            addCriterion("MIANSHUIZIGE <", value, "mianshuizige");
            return (Criteria) this;
        }

        public Criteria andMianshuizigeLessThanOrEqualTo(String value) {
            addCriterion("MIANSHUIZIGE <=", value, "mianshuizige");
            return (Criteria) this;
        }

        public Criteria andMianshuizigeLike(String value) {
            addCriterion("MIANSHUIZIGE like", value, "mianshuizige");
            return (Criteria) this;
        }

        public Criteria andMianshuizigeNotLike(String value) {
            addCriterion("MIANSHUIZIGE not like", value, "mianshuizige");
            return (Criteria) this;
        }

        public Criteria andMianshuizigeIn(List<String> values) {
            addCriterion("MIANSHUIZIGE in", values, "mianshuizige");
            return (Criteria) this;
        }

        public Criteria andMianshuizigeNotIn(List<String> values) {
            addCriterion("MIANSHUIZIGE not in", values, "mianshuizige");
            return (Criteria) this;
        }

        public Criteria andMianshuizigeBetween(String value1, String value2) {
            addCriterion("MIANSHUIZIGE between", value1, value2, "mianshuizige");
            return (Criteria) this;
        }

        public Criteria andMianshuizigeNotBetween(String value1, String value2) {
            addCriterion("MIANSHUIZIGE not between", value1, value2, "mianshuizige");
            return (Criteria) this;
        }

        public Criteria andKouchunianIsNull() {
            addCriterion("KOUCHUNIAN is null");
            return (Criteria) this;
        }

        public Criteria andKouchunianIsNotNull() {
            addCriterion("KOUCHUNIAN is not null");
            return (Criteria) this;
        }

        public Criteria andKouchunianEqualTo(String value) {
            addCriterion("KOUCHUNIAN =", value, "kouchunian");
            return (Criteria) this;
        }

        public Criteria andKouchunianNotEqualTo(String value) {
            addCriterion("KOUCHUNIAN <>", value, "kouchunian");
            return (Criteria) this;
        }

        public Criteria andKouchunianGreaterThan(String value) {
            addCriterion("KOUCHUNIAN >", value, "kouchunian");
            return (Criteria) this;
        }

        public Criteria andKouchunianGreaterThanOrEqualTo(String value) {
            addCriterion("KOUCHUNIAN >=", value, "kouchunian");
            return (Criteria) this;
        }

        public Criteria andKouchunianLessThan(String value) {
            addCriterion("KOUCHUNIAN <", value, "kouchunian");
            return (Criteria) this;
        }

        public Criteria andKouchunianLessThanOrEqualTo(String value) {
            addCriterion("KOUCHUNIAN <=", value, "kouchunian");
            return (Criteria) this;
        }

        public Criteria andKouchunianLike(String value) {
            addCriterion("KOUCHUNIAN like", value, "kouchunian");
            return (Criteria) this;
        }

        public Criteria andKouchunianNotLike(String value) {
            addCriterion("KOUCHUNIAN not like", value, "kouchunian");
            return (Criteria) this;
        }

        public Criteria andKouchunianIn(List<String> values) {
            addCriterion("KOUCHUNIAN in", values, "kouchunian");
            return (Criteria) this;
        }

        public Criteria andKouchunianNotIn(List<String> values) {
            addCriterion("KOUCHUNIAN not in", values, "kouchunian");
            return (Criteria) this;
        }

        public Criteria andKouchunianBetween(String value1, String value2) {
            addCriterion("KOUCHUNIAN between", value1, value2, "kouchunian");
            return (Criteria) this;
        }

        public Criteria andKouchunianNotBetween(String value1, String value2) {
            addCriterion("KOUCHUNIAN not between", value1, value2, "kouchunian");
            return (Criteria) this;
        }

        public Criteria andMianshuinianIsNull() {
            addCriterion("MIANSHUINIAN is null");
            return (Criteria) this;
        }

        public Criteria andMianshuinianIsNotNull() {
            addCriterion("MIANSHUINIAN is not null");
            return (Criteria) this;
        }

        public Criteria andMianshuinianEqualTo(String value) {
            addCriterion("MIANSHUINIAN =", value, "mianshuinian");
            return (Criteria) this;
        }

        public Criteria andMianshuinianNotEqualTo(String value) {
            addCriterion("MIANSHUINIAN <>", value, "mianshuinian");
            return (Criteria) this;
        }

        public Criteria andMianshuinianGreaterThan(String value) {
            addCriterion("MIANSHUINIAN >", value, "mianshuinian");
            return (Criteria) this;
        }

        public Criteria andMianshuinianGreaterThanOrEqualTo(String value) {
            addCriterion("MIANSHUINIAN >=", value, "mianshuinian");
            return (Criteria) this;
        }

        public Criteria andMianshuinianLessThan(String value) {
            addCriterion("MIANSHUINIAN <", value, "mianshuinian");
            return (Criteria) this;
        }

        public Criteria andMianshuinianLessThanOrEqualTo(String value) {
            addCriterion("MIANSHUINIAN <=", value, "mianshuinian");
            return (Criteria) this;
        }

        public Criteria andMianshuinianLike(String value) {
            addCriterion("MIANSHUINIAN like", value, "mianshuinian");
            return (Criteria) this;
        }

        public Criteria andMianshuinianNotLike(String value) {
            addCriterion("MIANSHUINIAN not like", value, "mianshuinian");
            return (Criteria) this;
        }

        public Criteria andMianshuinianIn(List<String> values) {
            addCriterion("MIANSHUINIAN in", values, "mianshuinian");
            return (Criteria) this;
        }

        public Criteria andMianshuinianNotIn(List<String> values) {
            addCriterion("MIANSHUINIAN not in", values, "mianshuinian");
            return (Criteria) this;
        }

        public Criteria andMianshuinianBetween(String value1, String value2) {
            addCriterion("MIANSHUINIAN between", value1, value2, "mianshuinian");
            return (Criteria) this;
        }

        public Criteria andMianshuinianNotBetween(String value1, String value2) {
            addCriterion("MIANSHUINIAN not between", value1, value2, "mianshuinian");
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