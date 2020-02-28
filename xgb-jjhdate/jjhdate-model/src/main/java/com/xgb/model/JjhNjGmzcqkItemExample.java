package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JjhNjGmzcqkItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JjhNjGmzcqkItemExample() {
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

        public Criteria andXuhaoIsNull() {
            addCriterion("XUHAO is null");
            return (Criteria) this;
        }

        public Criteria andXuhaoIsNotNull() {
            addCriterion("XUHAO is not null");
            return (Criteria) this;
        }

        public Criteria andXuhaoEqualTo(Long value) {
            addCriterion("XUHAO =", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoNotEqualTo(Long value) {
            addCriterion("XUHAO <>", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoGreaterThan(Long value) {
            addCriterion("XUHAO >", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoGreaterThanOrEqualTo(Long value) {
            addCriterion("XUHAO >=", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoLessThan(Long value) {
            addCriterion("XUHAO <", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoLessThanOrEqualTo(Long value) {
            addCriterion("XUHAO <=", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoIn(List<Long> values) {
            addCriterion("XUHAO in", values, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoNotIn(List<Long> values) {
            addCriterion("XUHAO not in", values, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoBetween(Long value1, Long value2) {
            addCriterion("XUHAO between", value1, value2, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoNotBetween(Long value1, Long value2) {
            addCriterion("XUHAO not between", value1, value2, "xuhao");
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

        public Criteria andShijishouyiIsNull() {
            addCriterion("SHIJISHOUYI is null");
            return (Criteria) this;
        }

        public Criteria andShijishouyiIsNotNull() {
            addCriterion("SHIJISHOUYI is not null");
            return (Criteria) this;
        }

        public Criteria andShijishouyiEqualTo(BigDecimal value) {
            addCriterion("SHIJISHOUYI =", value, "shijishouyi");
            return (Criteria) this;
        }

        public Criteria andShijishouyiNotEqualTo(BigDecimal value) {
            addCriterion("SHIJISHOUYI <>", value, "shijishouyi");
            return (Criteria) this;
        }

        public Criteria andShijishouyiGreaterThan(BigDecimal value) {
            addCriterion("SHIJISHOUYI >", value, "shijishouyi");
            return (Criteria) this;
        }

        public Criteria andShijishouyiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHIJISHOUYI >=", value, "shijishouyi");
            return (Criteria) this;
        }

        public Criteria andShijishouyiLessThan(BigDecimal value) {
            addCriterion("SHIJISHOUYI <", value, "shijishouyi");
            return (Criteria) this;
        }

        public Criteria andShijishouyiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHIJISHOUYI <=", value, "shijishouyi");
            return (Criteria) this;
        }

        public Criteria andShijishouyiIn(List<BigDecimal> values) {
            addCriterion("SHIJISHOUYI in", values, "shijishouyi");
            return (Criteria) this;
        }

        public Criteria andShijishouyiNotIn(List<BigDecimal> values) {
            addCriterion("SHIJISHOUYI not in", values, "shijishouyi");
            return (Criteria) this;
        }

        public Criteria andShijishouyiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHIJISHOUYI between", value1, value2, "shijishouyi");
            return (Criteria) this;
        }

        public Criteria andShijishouyiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHIJISHOUYI not between", value1, value2, "shijishouyi");
            return (Criteria) this;
        }

        public Criteria andShijishouhuiIsNull() {
            addCriterion("SHIJISHOUHUI is null");
            return (Criteria) this;
        }

        public Criteria andShijishouhuiIsNotNull() {
            addCriterion("SHIJISHOUHUI is not null");
            return (Criteria) this;
        }

        public Criteria andShijishouhuiEqualTo(BigDecimal value) {
            addCriterion("SHIJISHOUHUI =", value, "shijishouhui");
            return (Criteria) this;
        }

        public Criteria andShijishouhuiNotEqualTo(BigDecimal value) {
            addCriterion("SHIJISHOUHUI <>", value, "shijishouhui");
            return (Criteria) this;
        }

        public Criteria andShijishouhuiGreaterThan(BigDecimal value) {
            addCriterion("SHIJISHOUHUI >", value, "shijishouhui");
            return (Criteria) this;
        }

        public Criteria andShijishouhuiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHIJISHOUHUI >=", value, "shijishouhui");
            return (Criteria) this;
        }

        public Criteria andShijishouhuiLessThan(BigDecimal value) {
            addCriterion("SHIJISHOUHUI <", value, "shijishouhui");
            return (Criteria) this;
        }

        public Criteria andShijishouhuiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHIJISHOUHUI <=", value, "shijishouhui");
            return (Criteria) this;
        }

        public Criteria andShijishouhuiIn(List<BigDecimal> values) {
            addCriterion("SHIJISHOUHUI in", values, "shijishouhui");
            return (Criteria) this;
        }

        public Criteria andShijishouhuiNotIn(List<BigDecimal> values) {
            addCriterion("SHIJISHOUHUI not in", values, "shijishouhui");
            return (Criteria) this;
        }

        public Criteria andShijishouhuiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHIJISHOUHUI between", value1, value2, "shijishouhui");
            return (Criteria) this;
        }

        public Criteria andShijishouhuiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHIJISHOUHUI not between", value1, value2, "shijishouhui");
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