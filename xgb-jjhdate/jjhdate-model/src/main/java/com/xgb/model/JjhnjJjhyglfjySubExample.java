package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JjhnjJjhyglfjySubExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JjhnjJjhyglfjySubExample() {
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

        public Criteria andGuanlianfangIsNull() {
            addCriterion("GUANLIANFANG is null");
            return (Criteria) this;
        }

        public Criteria andGuanlianfangIsNotNull() {
            addCriterion("GUANLIANFANG is not null");
            return (Criteria) this;
        }

        public Criteria andGuanlianfangEqualTo(String value) {
            addCriterion("GUANLIANFANG =", value, "guanlianfang");
            return (Criteria) this;
        }

        public Criteria andGuanlianfangNotEqualTo(String value) {
            addCriterion("GUANLIANFANG <>", value, "guanlianfang");
            return (Criteria) this;
        }

        public Criteria andGuanlianfangGreaterThan(String value) {
            addCriterion("GUANLIANFANG >", value, "guanlianfang");
            return (Criteria) this;
        }

        public Criteria andGuanlianfangGreaterThanOrEqualTo(String value) {
            addCriterion("GUANLIANFANG >=", value, "guanlianfang");
            return (Criteria) this;
        }

        public Criteria andGuanlianfangLessThan(String value) {
            addCriterion("GUANLIANFANG <", value, "guanlianfang");
            return (Criteria) this;
        }

        public Criteria andGuanlianfangLessThanOrEqualTo(String value) {
            addCriterion("GUANLIANFANG <=", value, "guanlianfang");
            return (Criteria) this;
        }

        public Criteria andGuanlianfangLike(String value) {
            addCriterion("GUANLIANFANG like", value, "guanlianfang");
            return (Criteria) this;
        }

        public Criteria andGuanlianfangNotLike(String value) {
            addCriterion("GUANLIANFANG not like", value, "guanlianfang");
            return (Criteria) this;
        }

        public Criteria andGuanlianfangIn(List<String> values) {
            addCriterion("GUANLIANFANG in", values, "guanlianfang");
            return (Criteria) this;
        }

        public Criteria andGuanlianfangNotIn(List<String> values) {
            addCriterion("GUANLIANFANG not in", values, "guanlianfang");
            return (Criteria) this;
        }

        public Criteria andGuanlianfangBetween(String value1, String value2) {
            addCriterion("GUANLIANFANG between", value1, value2, "guanlianfang");
            return (Criteria) this;
        }

        public Criteria andGuanlianfangNotBetween(String value1, String value2) {
            addCriterion("GUANLIANFANG not between", value1, value2, "guanlianfang");
            return (Criteria) this;
        }

        public Criteria andTigongjineIsNull() {
            addCriterion("TIGONGJINE is null");
            return (Criteria) this;
        }

        public Criteria andTigongjineIsNotNull() {
            addCriterion("TIGONGJINE is not null");
            return (Criteria) this;
        }

        public Criteria andTigongjineEqualTo(BigDecimal value) {
            addCriterion("TIGONGJINE =", value, "tigongjine");
            return (Criteria) this;
        }

        public Criteria andTigongjineNotEqualTo(BigDecimal value) {
            addCriterion("TIGONGJINE <>", value, "tigongjine");
            return (Criteria) this;
        }

        public Criteria andTigongjineGreaterThan(BigDecimal value) {
            addCriterion("TIGONGJINE >", value, "tigongjine");
            return (Criteria) this;
        }

        public Criteria andTigongjineGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TIGONGJINE >=", value, "tigongjine");
            return (Criteria) this;
        }

        public Criteria andTigongjineLessThan(BigDecimal value) {
            addCriterion("TIGONGJINE <", value, "tigongjine");
            return (Criteria) this;
        }

        public Criteria andTigongjineLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TIGONGJINE <=", value, "tigongjine");
            return (Criteria) this;
        }

        public Criteria andTigongjineIn(List<BigDecimal> values) {
            addCriterion("TIGONGJINE in", values, "tigongjine");
            return (Criteria) this;
        }

        public Criteria andTigongjineNotIn(List<BigDecimal> values) {
            addCriterion("TIGONGJINE not in", values, "tigongjine");
            return (Criteria) this;
        }

        public Criteria andTigongjineBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TIGONGJINE between", value1, value2, "tigongjine");
            return (Criteria) this;
        }

        public Criteria andTigongjineNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TIGONGJINE not between", value1, value2, "tigongjine");
            return (Criteria) this;
        }

        public Criteria andTigongyueIsNull() {
            addCriterion("TIGONGYUE is null");
            return (Criteria) this;
        }

        public Criteria andTigongyueIsNotNull() {
            addCriterion("TIGONGYUE is not null");
            return (Criteria) this;
        }

        public Criteria andTigongyueEqualTo(BigDecimal value) {
            addCriterion("TIGONGYUE =", value, "tigongyue");
            return (Criteria) this;
        }

        public Criteria andTigongyueNotEqualTo(BigDecimal value) {
            addCriterion("TIGONGYUE <>", value, "tigongyue");
            return (Criteria) this;
        }

        public Criteria andTigongyueGreaterThan(BigDecimal value) {
            addCriterion("TIGONGYUE >", value, "tigongyue");
            return (Criteria) this;
        }

        public Criteria andTigongyueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TIGONGYUE >=", value, "tigongyue");
            return (Criteria) this;
        }

        public Criteria andTigongyueLessThan(BigDecimal value) {
            addCriterion("TIGONGYUE <", value, "tigongyue");
            return (Criteria) this;
        }

        public Criteria andTigongyueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TIGONGYUE <=", value, "tigongyue");
            return (Criteria) this;
        }

        public Criteria andTigongyueIn(List<BigDecimal> values) {
            addCriterion("TIGONGYUE in", values, "tigongyue");
            return (Criteria) this;
        }

        public Criteria andTigongyueNotIn(List<BigDecimal> values) {
            addCriterion("TIGONGYUE not in", values, "tigongyue");
            return (Criteria) this;
        }

        public Criteria andTigongyueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TIGONGYUE between", value1, value2, "tigongyue");
            return (Criteria) this;
        }

        public Criteria andTigongyueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TIGONGYUE not between", value1, value2, "tigongyue");
            return (Criteria) this;
        }

        public Criteria andGoumaijineIsNull() {
            addCriterion("GOUMAIJINE is null");
            return (Criteria) this;
        }

        public Criteria andGoumaijineIsNotNull() {
            addCriterion("GOUMAIJINE is not null");
            return (Criteria) this;
        }

        public Criteria andGoumaijineEqualTo(BigDecimal value) {
            addCriterion("GOUMAIJINE =", value, "goumaijine");
            return (Criteria) this;
        }

        public Criteria andGoumaijineNotEqualTo(BigDecimal value) {
            addCriterion("GOUMAIJINE <>", value, "goumaijine");
            return (Criteria) this;
        }

        public Criteria andGoumaijineGreaterThan(BigDecimal value) {
            addCriterion("GOUMAIJINE >", value, "goumaijine");
            return (Criteria) this;
        }

        public Criteria andGoumaijineGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GOUMAIJINE >=", value, "goumaijine");
            return (Criteria) this;
        }

        public Criteria andGoumaijineLessThan(BigDecimal value) {
            addCriterion("GOUMAIJINE <", value, "goumaijine");
            return (Criteria) this;
        }

        public Criteria andGoumaijineLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GOUMAIJINE <=", value, "goumaijine");
            return (Criteria) this;
        }

        public Criteria andGoumaijineIn(List<BigDecimal> values) {
            addCriterion("GOUMAIJINE in", values, "goumaijine");
            return (Criteria) this;
        }

        public Criteria andGoumaijineNotIn(List<BigDecimal> values) {
            addCriterion("GOUMAIJINE not in", values, "goumaijine");
            return (Criteria) this;
        }

        public Criteria andGoumaijineBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOUMAIJINE between", value1, value2, "goumaijine");
            return (Criteria) this;
        }

        public Criteria andGoumaijineNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOUMAIJINE not between", value1, value2, "goumaijine");
            return (Criteria) this;
        }

        public Criteria andGoumaiyueIsNull() {
            addCriterion("GOUMAIYUE is null");
            return (Criteria) this;
        }

        public Criteria andGoumaiyueIsNotNull() {
            addCriterion("GOUMAIYUE is not null");
            return (Criteria) this;
        }

        public Criteria andGoumaiyueEqualTo(BigDecimal value) {
            addCriterion("GOUMAIYUE =", value, "goumaiyue");
            return (Criteria) this;
        }

        public Criteria andGoumaiyueNotEqualTo(BigDecimal value) {
            addCriterion("GOUMAIYUE <>", value, "goumaiyue");
            return (Criteria) this;
        }

        public Criteria andGoumaiyueGreaterThan(BigDecimal value) {
            addCriterion("GOUMAIYUE >", value, "goumaiyue");
            return (Criteria) this;
        }

        public Criteria andGoumaiyueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GOUMAIYUE >=", value, "goumaiyue");
            return (Criteria) this;
        }

        public Criteria andGoumaiyueLessThan(BigDecimal value) {
            addCriterion("GOUMAIYUE <", value, "goumaiyue");
            return (Criteria) this;
        }

        public Criteria andGoumaiyueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GOUMAIYUE <=", value, "goumaiyue");
            return (Criteria) this;
        }

        public Criteria andGoumaiyueIn(List<BigDecimal> values) {
            addCriterion("GOUMAIYUE in", values, "goumaiyue");
            return (Criteria) this;
        }

        public Criteria andGoumaiyueNotIn(List<BigDecimal> values) {
            addCriterion("GOUMAIYUE not in", values, "goumaiyue");
            return (Criteria) this;
        }

        public Criteria andGoumaiyueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOUMAIYUE between", value1, value2, "goumaiyue");
            return (Criteria) this;
        }

        public Criteria andGoumaiyueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOUMAIYUE not between", value1, value2, "goumaiyue");
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