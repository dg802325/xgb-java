package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JjhnjWtlcTest002Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JjhnjWtlcTest002Example() {
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

        public Criteria andWeituojinehejiIsNull() {
            addCriterion("WEITUOJINEHEJI is null");
            return (Criteria) this;
        }

        public Criteria andWeituojinehejiIsNotNull() {
            addCriterion("WEITUOJINEHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andWeituojinehejiEqualTo(BigDecimal value) {
            addCriterion("WEITUOJINEHEJI =", value, "weituojineheji");
            return (Criteria) this;
        }

        public Criteria andWeituojinehejiNotEqualTo(BigDecimal value) {
            addCriterion("WEITUOJINEHEJI <>", value, "weituojineheji");
            return (Criteria) this;
        }

        public Criteria andWeituojinehejiGreaterThan(BigDecimal value) {
            addCriterion("WEITUOJINEHEJI >", value, "weituojineheji");
            return (Criteria) this;
        }

        public Criteria andWeituojinehejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WEITUOJINEHEJI >=", value, "weituojineheji");
            return (Criteria) this;
        }

        public Criteria andWeituojinehejiLessThan(BigDecimal value) {
            addCriterion("WEITUOJINEHEJI <", value, "weituojineheji");
            return (Criteria) this;
        }

        public Criteria andWeituojinehejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WEITUOJINEHEJI <=", value, "weituojineheji");
            return (Criteria) this;
        }

        public Criteria andWeituojinehejiIn(List<BigDecimal> values) {
            addCriterion("WEITUOJINEHEJI in", values, "weituojineheji");
            return (Criteria) this;
        }

        public Criteria andWeituojinehejiNotIn(List<BigDecimal> values) {
            addCriterion("WEITUOJINEHEJI not in", values, "weituojineheji");
            return (Criteria) this;
        }

        public Criteria andWeituojinehejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEITUOJINEHEJI between", value1, value2, "weituojineheji");
            return (Criteria) this;
        }

        public Criteria andWeituojinehejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEITUOJINEHEJI not between", value1, value2, "weituojineheji");
            return (Criteria) this;
        }

        public Criteria andShijishouyihejiIsNull() {
            addCriterion("SHIJISHOUYIHEJI is null");
            return (Criteria) this;
        }

        public Criteria andShijishouyihejiIsNotNull() {
            addCriterion("SHIJISHOUYIHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andShijishouyihejiEqualTo(BigDecimal value) {
            addCriterion("SHIJISHOUYIHEJI =", value, "shijishouyiheji");
            return (Criteria) this;
        }

        public Criteria andShijishouyihejiNotEqualTo(BigDecimal value) {
            addCriterion("SHIJISHOUYIHEJI <>", value, "shijishouyiheji");
            return (Criteria) this;
        }

        public Criteria andShijishouyihejiGreaterThan(BigDecimal value) {
            addCriterion("SHIJISHOUYIHEJI >", value, "shijishouyiheji");
            return (Criteria) this;
        }

        public Criteria andShijishouyihejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHIJISHOUYIHEJI >=", value, "shijishouyiheji");
            return (Criteria) this;
        }

        public Criteria andShijishouyihejiLessThan(BigDecimal value) {
            addCriterion("SHIJISHOUYIHEJI <", value, "shijishouyiheji");
            return (Criteria) this;
        }

        public Criteria andShijishouyihejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHIJISHOUYIHEJI <=", value, "shijishouyiheji");
            return (Criteria) this;
        }

        public Criteria andShijishouyihejiIn(List<BigDecimal> values) {
            addCriterion("SHIJISHOUYIHEJI in", values, "shijishouyiheji");
            return (Criteria) this;
        }

        public Criteria andShijishouyihejiNotIn(List<BigDecimal> values) {
            addCriterion("SHIJISHOUYIHEJI not in", values, "shijishouyiheji");
            return (Criteria) this;
        }

        public Criteria andShijishouyihejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHIJISHOUYIHEJI between", value1, value2, "shijishouyiheji");
            return (Criteria) this;
        }

        public Criteria andShijishouyihejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHIJISHOUYIHEJI not between", value1, value2, "shijishouyiheji");
            return (Criteria) this;
        }

        public Criteria andShouhuijinehejiIsNull() {
            addCriterion("SHOUHUIJINEHEJI is null");
            return (Criteria) this;
        }

        public Criteria andShouhuijinehejiIsNotNull() {
            addCriterion("SHOUHUIJINEHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andShouhuijinehejiEqualTo(BigDecimal value) {
            addCriterion("SHOUHUIJINEHEJI =", value, "shouhuijineheji");
            return (Criteria) this;
        }

        public Criteria andShouhuijinehejiNotEqualTo(BigDecimal value) {
            addCriterion("SHOUHUIJINEHEJI <>", value, "shouhuijineheji");
            return (Criteria) this;
        }

        public Criteria andShouhuijinehejiGreaterThan(BigDecimal value) {
            addCriterion("SHOUHUIJINEHEJI >", value, "shouhuijineheji");
            return (Criteria) this;
        }

        public Criteria andShouhuijinehejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOUHUIJINEHEJI >=", value, "shouhuijineheji");
            return (Criteria) this;
        }

        public Criteria andShouhuijinehejiLessThan(BigDecimal value) {
            addCriterion("SHOUHUIJINEHEJI <", value, "shouhuijineheji");
            return (Criteria) this;
        }

        public Criteria andShouhuijinehejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOUHUIJINEHEJI <=", value, "shouhuijineheji");
            return (Criteria) this;
        }

        public Criteria andShouhuijinehejiIn(List<BigDecimal> values) {
            addCriterion("SHOUHUIJINEHEJI in", values, "shouhuijineheji");
            return (Criteria) this;
        }

        public Criteria andShouhuijinehejiNotIn(List<BigDecimal> values) {
            addCriterion("SHOUHUIJINEHEJI not in", values, "shouhuijineheji");
            return (Criteria) this;
        }

        public Criteria andShouhuijinehejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOUHUIJINEHEJI between", value1, value2, "shouhuijineheji");
            return (Criteria) this;
        }

        public Criteria andShouhuijinehejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOUHUIJINEHEJI not between", value1, value2, "shouhuijineheji");
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