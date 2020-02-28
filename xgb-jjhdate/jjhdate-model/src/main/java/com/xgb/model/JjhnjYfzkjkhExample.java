package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JjhnjYfzkjkhExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JjhnjYfzkjkhExample() {
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

        public Criteria andNianchuhuaizhang1IsNull() {
            addCriterion("NIANCHUHUAIZHANG1 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang1IsNotNull() {
            addCriterion("NIANCHUHUAIZHANG1 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang1EqualTo(BigDecimal value) {
            addCriterion("NIANCHUHUAIZHANG1 =", value, "nianchuhuaizhang1");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang1NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUHUAIZHANG1 <>", value, "nianchuhuaizhang1");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang1GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUHUAIZHANG1 >", value, "nianchuhuaizhang1");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUHUAIZHANG1 >=", value, "nianchuhuaizhang1");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang1LessThan(BigDecimal value) {
            addCriterion("NIANCHUHUAIZHANG1 <", value, "nianchuhuaizhang1");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUHUAIZHANG1 <=", value, "nianchuhuaizhang1");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang1In(List<BigDecimal> values) {
            addCriterion("NIANCHUHUAIZHANG1 in", values, "nianchuhuaizhang1");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang1NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUHUAIZHANG1 not in", values, "nianchuhuaizhang1");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUHUAIZHANG1 between", value1, value2, "nianchuhuaizhang1");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUHUAIZHANG1 not between", value1, value2, "nianchuhuaizhang1");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi1IsNull() {
            addCriterion("NIANCHUJIAZHI1 is null");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi1IsNotNull() {
            addCriterion("NIANCHUJIAZHI1 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi1EqualTo(BigDecimal value) {
            addCriterion("NIANCHUJIAZHI1 =", value, "nianchujiazhi1");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi1NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUJIAZHI1 <>", value, "nianchujiazhi1");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi1GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUJIAZHI1 >", value, "nianchujiazhi1");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUJIAZHI1 >=", value, "nianchujiazhi1");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi1LessThan(BigDecimal value) {
            addCriterion("NIANCHUJIAZHI1 <", value, "nianchujiazhi1");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUJIAZHI1 <=", value, "nianchujiazhi1");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi1In(List<BigDecimal> values) {
            addCriterion("NIANCHUJIAZHI1 in", values, "nianchujiazhi1");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi1NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUJIAZHI1 not in", values, "nianchujiazhi1");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUJIAZHI1 between", value1, value2, "nianchujiazhi1");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUJIAZHI1 not between", value1, value2, "nianchujiazhi1");
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

        public Criteria andNianmohuaizhang1IsNull() {
            addCriterion("NIANMOHUAIZHANG1 is null");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang1IsNotNull() {
            addCriterion("NIANMOHUAIZHANG1 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang1EqualTo(BigDecimal value) {
            addCriterion("NIANMOHUAIZHANG1 =", value, "nianmohuaizhang1");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang1NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOHUAIZHANG1 <>", value, "nianmohuaizhang1");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang1GreaterThan(BigDecimal value) {
            addCriterion("NIANMOHUAIZHANG1 >", value, "nianmohuaizhang1");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOHUAIZHANG1 >=", value, "nianmohuaizhang1");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang1LessThan(BigDecimal value) {
            addCriterion("NIANMOHUAIZHANG1 <", value, "nianmohuaizhang1");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOHUAIZHANG1 <=", value, "nianmohuaizhang1");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang1In(List<BigDecimal> values) {
            addCriterion("NIANMOHUAIZHANG1 in", values, "nianmohuaizhang1");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang1NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOHUAIZHANG1 not in", values, "nianmohuaizhang1");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOHUAIZHANG1 between", value1, value2, "nianmohuaizhang1");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOHUAIZHANG1 not between", value1, value2, "nianmohuaizhang1");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi1IsNull() {
            addCriterion("NIANMOJIAZHI1 is null");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi1IsNotNull() {
            addCriterion("NIANMOJIAZHI1 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi1EqualTo(BigDecimal value) {
            addCriterion("NIANMOJIAZHI1 =", value, "nianmojiazhi1");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi1NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOJIAZHI1 <>", value, "nianmojiazhi1");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi1GreaterThan(BigDecimal value) {
            addCriterion("NIANMOJIAZHI1 >", value, "nianmojiazhi1");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOJIAZHI1 >=", value, "nianmojiazhi1");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi1LessThan(BigDecimal value) {
            addCriterion("NIANMOJIAZHI1 <", value, "nianmojiazhi1");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOJIAZHI1 <=", value, "nianmojiazhi1");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi1In(List<BigDecimal> values) {
            addCriterion("NIANMOJIAZHI1 in", values, "nianmojiazhi1");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi1NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOJIAZHI1 not in", values, "nianmojiazhi1");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOJIAZHI1 between", value1, value2, "nianmojiazhi1");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOJIAZHI1 not between", value1, value2, "nianmojiazhi1");
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

        public Criteria andNianchuhuaizhang2IsNull() {
            addCriterion("NIANCHUHUAIZHANG2 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang2IsNotNull() {
            addCriterion("NIANCHUHUAIZHANG2 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang2EqualTo(BigDecimal value) {
            addCriterion("NIANCHUHUAIZHANG2 =", value, "nianchuhuaizhang2");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang2NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUHUAIZHANG2 <>", value, "nianchuhuaizhang2");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang2GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUHUAIZHANG2 >", value, "nianchuhuaizhang2");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUHUAIZHANG2 >=", value, "nianchuhuaizhang2");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang2LessThan(BigDecimal value) {
            addCriterion("NIANCHUHUAIZHANG2 <", value, "nianchuhuaizhang2");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUHUAIZHANG2 <=", value, "nianchuhuaizhang2");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang2In(List<BigDecimal> values) {
            addCriterion("NIANCHUHUAIZHANG2 in", values, "nianchuhuaizhang2");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang2NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUHUAIZHANG2 not in", values, "nianchuhuaizhang2");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUHUAIZHANG2 between", value1, value2, "nianchuhuaizhang2");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUHUAIZHANG2 not between", value1, value2, "nianchuhuaizhang2");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi2IsNull() {
            addCriterion("NIANCHUJIAZHI2 is null");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi2IsNotNull() {
            addCriterion("NIANCHUJIAZHI2 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi2EqualTo(BigDecimal value) {
            addCriterion("NIANCHUJIAZHI2 =", value, "nianchujiazhi2");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi2NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUJIAZHI2 <>", value, "nianchujiazhi2");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi2GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUJIAZHI2 >", value, "nianchujiazhi2");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUJIAZHI2 >=", value, "nianchujiazhi2");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi2LessThan(BigDecimal value) {
            addCriterion("NIANCHUJIAZHI2 <", value, "nianchujiazhi2");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUJIAZHI2 <=", value, "nianchujiazhi2");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi2In(List<BigDecimal> values) {
            addCriterion("NIANCHUJIAZHI2 in", values, "nianchujiazhi2");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi2NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUJIAZHI2 not in", values, "nianchujiazhi2");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUJIAZHI2 between", value1, value2, "nianchujiazhi2");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUJIAZHI2 not between", value1, value2, "nianchujiazhi2");
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

        public Criteria andNianmohuaizhang2IsNull() {
            addCriterion("NIANMOHUAIZHANG2 is null");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang2IsNotNull() {
            addCriterion("NIANMOHUAIZHANG2 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang2EqualTo(BigDecimal value) {
            addCriterion("NIANMOHUAIZHANG2 =", value, "nianmohuaizhang2");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang2NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOHUAIZHANG2 <>", value, "nianmohuaizhang2");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang2GreaterThan(BigDecimal value) {
            addCriterion("NIANMOHUAIZHANG2 >", value, "nianmohuaizhang2");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOHUAIZHANG2 >=", value, "nianmohuaizhang2");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang2LessThan(BigDecimal value) {
            addCriterion("NIANMOHUAIZHANG2 <", value, "nianmohuaizhang2");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOHUAIZHANG2 <=", value, "nianmohuaizhang2");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang2In(List<BigDecimal> values) {
            addCriterion("NIANMOHUAIZHANG2 in", values, "nianmohuaizhang2");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang2NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOHUAIZHANG2 not in", values, "nianmohuaizhang2");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOHUAIZHANG2 between", value1, value2, "nianmohuaizhang2");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOHUAIZHANG2 not between", value1, value2, "nianmohuaizhang2");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi2IsNull() {
            addCriterion("NIANMOJIAZHI2 is null");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi2IsNotNull() {
            addCriterion("NIANMOJIAZHI2 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi2EqualTo(BigDecimal value) {
            addCriterion("NIANMOJIAZHI2 =", value, "nianmojiazhi2");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi2NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOJIAZHI2 <>", value, "nianmojiazhi2");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi2GreaterThan(BigDecimal value) {
            addCriterion("NIANMOJIAZHI2 >", value, "nianmojiazhi2");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOJIAZHI2 >=", value, "nianmojiazhi2");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi2LessThan(BigDecimal value) {
            addCriterion("NIANMOJIAZHI2 <", value, "nianmojiazhi2");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOJIAZHI2 <=", value, "nianmojiazhi2");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi2In(List<BigDecimal> values) {
            addCriterion("NIANMOJIAZHI2 in", values, "nianmojiazhi2");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi2NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOJIAZHI2 not in", values, "nianmojiazhi2");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOJIAZHI2 between", value1, value2, "nianmojiazhi2");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOJIAZHI2 not between", value1, value2, "nianmojiazhi2");
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

        public Criteria andNianchuhuaizhang3IsNull() {
            addCriterion("NIANCHUHUAIZHANG3 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang3IsNotNull() {
            addCriterion("NIANCHUHUAIZHANG3 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang3EqualTo(BigDecimal value) {
            addCriterion("NIANCHUHUAIZHANG3 =", value, "nianchuhuaizhang3");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang3NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUHUAIZHANG3 <>", value, "nianchuhuaizhang3");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang3GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUHUAIZHANG3 >", value, "nianchuhuaizhang3");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUHUAIZHANG3 >=", value, "nianchuhuaizhang3");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang3LessThan(BigDecimal value) {
            addCriterion("NIANCHUHUAIZHANG3 <", value, "nianchuhuaizhang3");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUHUAIZHANG3 <=", value, "nianchuhuaizhang3");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang3In(List<BigDecimal> values) {
            addCriterion("NIANCHUHUAIZHANG3 in", values, "nianchuhuaizhang3");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang3NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUHUAIZHANG3 not in", values, "nianchuhuaizhang3");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUHUAIZHANG3 between", value1, value2, "nianchuhuaizhang3");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUHUAIZHANG3 not between", value1, value2, "nianchuhuaizhang3");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi3IsNull() {
            addCriterion("NIANCHUJIAZHI3 is null");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi3IsNotNull() {
            addCriterion("NIANCHUJIAZHI3 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi3EqualTo(BigDecimal value) {
            addCriterion("NIANCHUJIAZHI3 =", value, "nianchujiazhi3");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi3NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUJIAZHI3 <>", value, "nianchujiazhi3");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi3GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUJIAZHI3 >", value, "nianchujiazhi3");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUJIAZHI3 >=", value, "nianchujiazhi3");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi3LessThan(BigDecimal value) {
            addCriterion("NIANCHUJIAZHI3 <", value, "nianchujiazhi3");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUJIAZHI3 <=", value, "nianchujiazhi3");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi3In(List<BigDecimal> values) {
            addCriterion("NIANCHUJIAZHI3 in", values, "nianchujiazhi3");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi3NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUJIAZHI3 not in", values, "nianchujiazhi3");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUJIAZHI3 between", value1, value2, "nianchujiazhi3");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUJIAZHI3 not between", value1, value2, "nianchujiazhi3");
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

        public Criteria andNianmohuaizhang3IsNull() {
            addCriterion("NIANMOHUAIZHANG3 is null");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang3IsNotNull() {
            addCriterion("NIANMOHUAIZHANG3 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang3EqualTo(BigDecimal value) {
            addCriterion("NIANMOHUAIZHANG3 =", value, "nianmohuaizhang3");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang3NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOHUAIZHANG3 <>", value, "nianmohuaizhang3");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang3GreaterThan(BigDecimal value) {
            addCriterion("NIANMOHUAIZHANG3 >", value, "nianmohuaizhang3");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOHUAIZHANG3 >=", value, "nianmohuaizhang3");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang3LessThan(BigDecimal value) {
            addCriterion("NIANMOHUAIZHANG3 <", value, "nianmohuaizhang3");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOHUAIZHANG3 <=", value, "nianmohuaizhang3");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang3In(List<BigDecimal> values) {
            addCriterion("NIANMOHUAIZHANG3 in", values, "nianmohuaizhang3");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang3NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOHUAIZHANG3 not in", values, "nianmohuaizhang3");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOHUAIZHANG3 between", value1, value2, "nianmohuaizhang3");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOHUAIZHANG3 not between", value1, value2, "nianmohuaizhang3");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi3IsNull() {
            addCriterion("NIANMOJIAZHI3 is null");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi3IsNotNull() {
            addCriterion("NIANMOJIAZHI3 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi3EqualTo(BigDecimal value) {
            addCriterion("NIANMOJIAZHI3 =", value, "nianmojiazhi3");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi3NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOJIAZHI3 <>", value, "nianmojiazhi3");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi3GreaterThan(BigDecimal value) {
            addCriterion("NIANMOJIAZHI3 >", value, "nianmojiazhi3");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOJIAZHI3 >=", value, "nianmojiazhi3");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi3LessThan(BigDecimal value) {
            addCriterion("NIANMOJIAZHI3 <", value, "nianmojiazhi3");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOJIAZHI3 <=", value, "nianmojiazhi3");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi3In(List<BigDecimal> values) {
            addCriterion("NIANMOJIAZHI3 in", values, "nianmojiazhi3");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi3NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOJIAZHI3 not in", values, "nianmojiazhi3");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOJIAZHI3 between", value1, value2, "nianmojiazhi3");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOJIAZHI3 not between", value1, value2, "nianmojiazhi3");
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

        public Criteria andNianchuhuaizhang4IsNull() {
            addCriterion("NIANCHUHUAIZHANG4 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang4IsNotNull() {
            addCriterion("NIANCHUHUAIZHANG4 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang4EqualTo(BigDecimal value) {
            addCriterion("NIANCHUHUAIZHANG4 =", value, "nianchuhuaizhang4");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang4NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUHUAIZHANG4 <>", value, "nianchuhuaizhang4");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang4GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUHUAIZHANG4 >", value, "nianchuhuaizhang4");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUHUAIZHANG4 >=", value, "nianchuhuaizhang4");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang4LessThan(BigDecimal value) {
            addCriterion("NIANCHUHUAIZHANG4 <", value, "nianchuhuaizhang4");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUHUAIZHANG4 <=", value, "nianchuhuaizhang4");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang4In(List<BigDecimal> values) {
            addCriterion("NIANCHUHUAIZHANG4 in", values, "nianchuhuaizhang4");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang4NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUHUAIZHANG4 not in", values, "nianchuhuaizhang4");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUHUAIZHANG4 between", value1, value2, "nianchuhuaizhang4");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhang4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUHUAIZHANG4 not between", value1, value2, "nianchuhuaizhang4");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi4IsNull() {
            addCriterion("NIANCHUJIAZHI4 is null");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi4IsNotNull() {
            addCriterion("NIANCHUJIAZHI4 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi4EqualTo(BigDecimal value) {
            addCriterion("NIANCHUJIAZHI4 =", value, "nianchujiazhi4");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi4NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUJIAZHI4 <>", value, "nianchujiazhi4");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi4GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUJIAZHI4 >", value, "nianchujiazhi4");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUJIAZHI4 >=", value, "nianchujiazhi4");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi4LessThan(BigDecimal value) {
            addCriterion("NIANCHUJIAZHI4 <", value, "nianchujiazhi4");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUJIAZHI4 <=", value, "nianchujiazhi4");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi4In(List<BigDecimal> values) {
            addCriterion("NIANCHUJIAZHI4 in", values, "nianchujiazhi4");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi4NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUJIAZHI4 not in", values, "nianchujiazhi4");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUJIAZHI4 between", value1, value2, "nianchujiazhi4");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhi4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUJIAZHI4 not between", value1, value2, "nianchujiazhi4");
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

        public Criteria andNianmohuaizhang4IsNull() {
            addCriterion("NIANMOHUAIZHANG4 is null");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang4IsNotNull() {
            addCriterion("NIANMOHUAIZHANG4 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang4EqualTo(BigDecimal value) {
            addCriterion("NIANMOHUAIZHANG4 =", value, "nianmohuaizhang4");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang4NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOHUAIZHANG4 <>", value, "nianmohuaizhang4");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang4GreaterThan(BigDecimal value) {
            addCriterion("NIANMOHUAIZHANG4 >", value, "nianmohuaizhang4");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOHUAIZHANG4 >=", value, "nianmohuaizhang4");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang4LessThan(BigDecimal value) {
            addCriterion("NIANMOHUAIZHANG4 <", value, "nianmohuaizhang4");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOHUAIZHANG4 <=", value, "nianmohuaizhang4");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang4In(List<BigDecimal> values) {
            addCriterion("NIANMOHUAIZHANG4 in", values, "nianmohuaizhang4");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang4NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOHUAIZHANG4 not in", values, "nianmohuaizhang4");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOHUAIZHANG4 between", value1, value2, "nianmohuaizhang4");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhang4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOHUAIZHANG4 not between", value1, value2, "nianmohuaizhang4");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi4IsNull() {
            addCriterion("NIANMOJIAZHI4 is null");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi4IsNotNull() {
            addCriterion("NIANMOJIAZHI4 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi4EqualTo(BigDecimal value) {
            addCriterion("NIANMOJIAZHI4 =", value, "nianmojiazhi4");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi4NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOJIAZHI4 <>", value, "nianmojiazhi4");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi4GreaterThan(BigDecimal value) {
            addCriterion("NIANMOJIAZHI4 >", value, "nianmojiazhi4");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOJIAZHI4 >=", value, "nianmojiazhi4");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi4LessThan(BigDecimal value) {
            addCriterion("NIANMOJIAZHI4 <", value, "nianmojiazhi4");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOJIAZHI4 <=", value, "nianmojiazhi4");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi4In(List<BigDecimal> values) {
            addCriterion("NIANMOJIAZHI4 in", values, "nianmojiazhi4");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi4NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOJIAZHI4 not in", values, "nianmojiazhi4");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOJIAZHI4 between", value1, value2, "nianmojiazhi4");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhi4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOJIAZHI4 not between", value1, value2, "nianmojiazhi4");
            return (Criteria) this;
        }

        public Criteria andNianchuyueheji1IsNull() {
            addCriterion("NIANCHUYUEHEJI1 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuyueheji1IsNotNull() {
            addCriterion("NIANCHUYUEHEJI1 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuyueheji1EqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUEHEJI1 =", value, "nianchuyueheji1");
            return (Criteria) this;
        }

        public Criteria andNianchuyueheji1NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUEHEJI1 <>", value, "nianchuyueheji1");
            return (Criteria) this;
        }

        public Criteria andNianchuyueheji1GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUYUEHEJI1 >", value, "nianchuyueheji1");
            return (Criteria) this;
        }

        public Criteria andNianchuyueheji1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUEHEJI1 >=", value, "nianchuyueheji1");
            return (Criteria) this;
        }

        public Criteria andNianchuyueheji1LessThan(BigDecimal value) {
            addCriterion("NIANCHUYUEHEJI1 <", value, "nianchuyueheji1");
            return (Criteria) this;
        }

        public Criteria andNianchuyueheji1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUEHEJI1 <=", value, "nianchuyueheji1");
            return (Criteria) this;
        }

        public Criteria andNianchuyueheji1In(List<BigDecimal> values) {
            addCriterion("NIANCHUYUEHEJI1 in", values, "nianchuyueheji1");
            return (Criteria) this;
        }

        public Criteria andNianchuyueheji1NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUYUEHEJI1 not in", values, "nianchuyueheji1");
            return (Criteria) this;
        }

        public Criteria andNianchuyueheji1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUEHEJI1 between", value1, value2, "nianchuyueheji1");
            return (Criteria) this;
        }

        public Criteria andNianchuyueheji1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUEHEJI1 not between", value1, value2, "nianchuyueheji1");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhangheji1IsNull() {
            addCriterion("NIANCHUHUAIZHANGHEJI1 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhangheji1IsNotNull() {
            addCriterion("NIANCHUHUAIZHANGHEJI1 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhangheji1EqualTo(BigDecimal value) {
            addCriterion("NIANCHUHUAIZHANGHEJI1 =", value, "nianchuhuaizhangheji1");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhangheji1NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUHUAIZHANGHEJI1 <>", value, "nianchuhuaizhangheji1");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhangheji1GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUHUAIZHANGHEJI1 >", value, "nianchuhuaizhangheji1");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhangheji1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUHUAIZHANGHEJI1 >=", value, "nianchuhuaizhangheji1");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhangheji1LessThan(BigDecimal value) {
            addCriterion("NIANCHUHUAIZHANGHEJI1 <", value, "nianchuhuaizhangheji1");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhangheji1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUHUAIZHANGHEJI1 <=", value, "nianchuhuaizhangheji1");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhangheji1In(List<BigDecimal> values) {
            addCriterion("NIANCHUHUAIZHANGHEJI1 in", values, "nianchuhuaizhangheji1");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhangheji1NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUHUAIZHANGHEJI1 not in", values, "nianchuhuaizhangheji1");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhangheji1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUHUAIZHANGHEJI1 between", value1, value2, "nianchuhuaizhangheji1");
            return (Criteria) this;
        }

        public Criteria andNianchuhuaizhangheji1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUHUAIZHANGHEJI1 not between", value1, value2, "nianchuhuaizhangheji1");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhiheji1IsNull() {
            addCriterion("NIANCHUJIAZHIHEJI1 is null");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhiheji1IsNotNull() {
            addCriterion("NIANCHUJIAZHIHEJI1 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhiheji1EqualTo(BigDecimal value) {
            addCriterion("NIANCHUJIAZHIHEJI1 =", value, "nianchujiazhiheji1");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhiheji1NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUJIAZHIHEJI1 <>", value, "nianchujiazhiheji1");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhiheji1GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUJIAZHIHEJI1 >", value, "nianchujiazhiheji1");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhiheji1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUJIAZHIHEJI1 >=", value, "nianchujiazhiheji1");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhiheji1LessThan(BigDecimal value) {
            addCriterion("NIANCHUJIAZHIHEJI1 <", value, "nianchujiazhiheji1");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhiheji1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUJIAZHIHEJI1 <=", value, "nianchujiazhiheji1");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhiheji1In(List<BigDecimal> values) {
            addCriterion("NIANCHUJIAZHIHEJI1 in", values, "nianchujiazhiheji1");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhiheji1NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUJIAZHIHEJI1 not in", values, "nianchujiazhiheji1");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhiheji1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUJIAZHIHEJI1 between", value1, value2, "nianchujiazhiheji1");
            return (Criteria) this;
        }

        public Criteria andNianchujiazhiheji1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUJIAZHIHEJI1 not between", value1, value2, "nianchujiazhiheji1");
            return (Criteria) this;
        }

        public Criteria andNianmoyueheji1IsNull() {
            addCriterion("NIANMOYUEHEJI1 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoyueheji1IsNotNull() {
            addCriterion("NIANMOYUEHEJI1 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoyueheji1EqualTo(BigDecimal value) {
            addCriterion("NIANMOYUEHEJI1 =", value, "nianmoyueheji1");
            return (Criteria) this;
        }

        public Criteria andNianmoyueheji1NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUEHEJI1 <>", value, "nianmoyueheji1");
            return (Criteria) this;
        }

        public Criteria andNianmoyueheji1GreaterThan(BigDecimal value) {
            addCriterion("NIANMOYUEHEJI1 >", value, "nianmoyueheji1");
            return (Criteria) this;
        }

        public Criteria andNianmoyueheji1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUEHEJI1 >=", value, "nianmoyueheji1");
            return (Criteria) this;
        }

        public Criteria andNianmoyueheji1LessThan(BigDecimal value) {
            addCriterion("NIANMOYUEHEJI1 <", value, "nianmoyueheji1");
            return (Criteria) this;
        }

        public Criteria andNianmoyueheji1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUEHEJI1 <=", value, "nianmoyueheji1");
            return (Criteria) this;
        }

        public Criteria andNianmoyueheji1In(List<BigDecimal> values) {
            addCriterion("NIANMOYUEHEJI1 in", values, "nianmoyueheji1");
            return (Criteria) this;
        }

        public Criteria andNianmoyueheji1NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOYUEHEJI1 not in", values, "nianmoyueheji1");
            return (Criteria) this;
        }

        public Criteria andNianmoyueheji1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUEHEJI1 between", value1, value2, "nianmoyueheji1");
            return (Criteria) this;
        }

        public Criteria andNianmoyueheji1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUEHEJI1 not between", value1, value2, "nianmoyueheji1");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhangheji1IsNull() {
            addCriterion("NIANMOHUAIZHANGHEJI1 is null");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhangheji1IsNotNull() {
            addCriterion("NIANMOHUAIZHANGHEJI1 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhangheji1EqualTo(BigDecimal value) {
            addCriterion("NIANMOHUAIZHANGHEJI1 =", value, "nianmohuaizhangheji1");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhangheji1NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOHUAIZHANGHEJI1 <>", value, "nianmohuaizhangheji1");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhangheji1GreaterThan(BigDecimal value) {
            addCriterion("NIANMOHUAIZHANGHEJI1 >", value, "nianmohuaizhangheji1");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhangheji1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOHUAIZHANGHEJI1 >=", value, "nianmohuaizhangheji1");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhangheji1LessThan(BigDecimal value) {
            addCriterion("NIANMOHUAIZHANGHEJI1 <", value, "nianmohuaizhangheji1");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhangheji1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOHUAIZHANGHEJI1 <=", value, "nianmohuaizhangheji1");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhangheji1In(List<BigDecimal> values) {
            addCriterion("NIANMOHUAIZHANGHEJI1 in", values, "nianmohuaizhangheji1");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhangheji1NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOHUAIZHANGHEJI1 not in", values, "nianmohuaizhangheji1");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhangheji1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOHUAIZHANGHEJI1 between", value1, value2, "nianmohuaizhangheji1");
            return (Criteria) this;
        }

        public Criteria andNianmohuaizhangheji1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOHUAIZHANGHEJI1 not between", value1, value2, "nianmohuaizhangheji1");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhiheji1IsNull() {
            addCriterion("NIANMOJIAZHIHEJI1 is null");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhiheji1IsNotNull() {
            addCriterion("NIANMOJIAZHIHEJI1 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhiheji1EqualTo(BigDecimal value) {
            addCriterion("NIANMOJIAZHIHEJI1 =", value, "nianmojiazhiheji1");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhiheji1NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOJIAZHIHEJI1 <>", value, "nianmojiazhiheji1");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhiheji1GreaterThan(BigDecimal value) {
            addCriterion("NIANMOJIAZHIHEJI1 >", value, "nianmojiazhiheji1");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhiheji1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOJIAZHIHEJI1 >=", value, "nianmojiazhiheji1");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhiheji1LessThan(BigDecimal value) {
            addCriterion("NIANMOJIAZHIHEJI1 <", value, "nianmojiazhiheji1");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhiheji1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOJIAZHIHEJI1 <=", value, "nianmojiazhiheji1");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhiheji1In(List<BigDecimal> values) {
            addCriterion("NIANMOJIAZHIHEJI1 in", values, "nianmojiazhiheji1");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhiheji1NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOJIAZHIHEJI1 not in", values, "nianmojiazhiheji1");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhiheji1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOJIAZHIHEJI1 between", value1, value2, "nianmojiazhiheji1");
            return (Criteria) this;
        }

        public Criteria andNianmojiazhiheji1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOJIAZHIHEJI1 not between", value1, value2, "nianmojiazhiheji1");
            return (Criteria) this;
        }

        public Criteria andNianchuyueheji2IsNull() {
            addCriterion("NIANCHUYUEHEJI2 is null");
            return (Criteria) this;
        }

        public Criteria andNianchuyueheji2IsNotNull() {
            addCriterion("NIANCHUYUEHEJI2 is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuyueheji2EqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUEHEJI2 =", value, "nianchuyueheji2");
            return (Criteria) this;
        }

        public Criteria andNianchuyueheji2NotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUEHEJI2 <>", value, "nianchuyueheji2");
            return (Criteria) this;
        }

        public Criteria andNianchuyueheji2GreaterThan(BigDecimal value) {
            addCriterion("NIANCHUYUEHEJI2 >", value, "nianchuyueheji2");
            return (Criteria) this;
        }

        public Criteria andNianchuyueheji2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUEHEJI2 >=", value, "nianchuyueheji2");
            return (Criteria) this;
        }

        public Criteria andNianchuyueheji2LessThan(BigDecimal value) {
            addCriterion("NIANCHUYUEHEJI2 <", value, "nianchuyueheji2");
            return (Criteria) this;
        }

        public Criteria andNianchuyueheji2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUEHEJI2 <=", value, "nianchuyueheji2");
            return (Criteria) this;
        }

        public Criteria andNianchuyueheji2In(List<BigDecimal> values) {
            addCriterion("NIANCHUYUEHEJI2 in", values, "nianchuyueheji2");
            return (Criteria) this;
        }

        public Criteria andNianchuyueheji2NotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUYUEHEJI2 not in", values, "nianchuyueheji2");
            return (Criteria) this;
        }

        public Criteria andNianchuyueheji2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUEHEJI2 between", value1, value2, "nianchuyueheji2");
            return (Criteria) this;
        }

        public Criteria andNianchuyueheji2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUEHEJI2 not between", value1, value2, "nianchuyueheji2");
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

        public Criteria andNianmoyueheji2IsNull() {
            addCriterion("NIANMOYUEHEJI2 is null");
            return (Criteria) this;
        }

        public Criteria andNianmoyueheji2IsNotNull() {
            addCriterion("NIANMOYUEHEJI2 is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoyueheji2EqualTo(BigDecimal value) {
            addCriterion("NIANMOYUEHEJI2 =", value, "nianmoyueheji2");
            return (Criteria) this;
        }

        public Criteria andNianmoyueheji2NotEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUEHEJI2 <>", value, "nianmoyueheji2");
            return (Criteria) this;
        }

        public Criteria andNianmoyueheji2GreaterThan(BigDecimal value) {
            addCriterion("NIANMOYUEHEJI2 >", value, "nianmoyueheji2");
            return (Criteria) this;
        }

        public Criteria andNianmoyueheji2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUEHEJI2 >=", value, "nianmoyueheji2");
            return (Criteria) this;
        }

        public Criteria andNianmoyueheji2LessThan(BigDecimal value) {
            addCriterion("NIANMOYUEHEJI2 <", value, "nianmoyueheji2");
            return (Criteria) this;
        }

        public Criteria andNianmoyueheji2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUEHEJI2 <=", value, "nianmoyueheji2");
            return (Criteria) this;
        }

        public Criteria andNianmoyueheji2In(List<BigDecimal> values) {
            addCriterion("NIANMOYUEHEJI2 in", values, "nianmoyueheji2");
            return (Criteria) this;
        }

        public Criteria andNianmoyueheji2NotIn(List<BigDecimal> values) {
            addCriterion("NIANMOYUEHEJI2 not in", values, "nianmoyueheji2");
            return (Criteria) this;
        }

        public Criteria andNianmoyueheji2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUEHEJI2 between", value1, value2, "nianmoyueheji2");
            return (Criteria) this;
        }

        public Criteria andNianmoyueheji2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUEHEJI2 not between", value1, value2, "nianmoyueheji2");
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