package com.xgb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JjhnjJshjdglSubExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JjhnjJshjdglSubExample() {
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

        public Criteria andChufashishijiguanIsNull() {
            addCriterion("CHUFASHISHIJIGUAN is null");
            return (Criteria) this;
        }

        public Criteria andChufashishijiguanIsNotNull() {
            addCriterion("CHUFASHISHIJIGUAN is not null");
            return (Criteria) this;
        }

        public Criteria andChufashishijiguanEqualTo(String value) {
            addCriterion("CHUFASHISHIJIGUAN =", value, "chufashishijiguan");
            return (Criteria) this;
        }

        public Criteria andChufashishijiguanNotEqualTo(String value) {
            addCriterion("CHUFASHISHIJIGUAN <>", value, "chufashishijiguan");
            return (Criteria) this;
        }

        public Criteria andChufashishijiguanGreaterThan(String value) {
            addCriterion("CHUFASHISHIJIGUAN >", value, "chufashishijiguan");
            return (Criteria) this;
        }

        public Criteria andChufashishijiguanGreaterThanOrEqualTo(String value) {
            addCriterion("CHUFASHISHIJIGUAN >=", value, "chufashishijiguan");
            return (Criteria) this;
        }

        public Criteria andChufashishijiguanLessThan(String value) {
            addCriterion("CHUFASHISHIJIGUAN <", value, "chufashishijiguan");
            return (Criteria) this;
        }

        public Criteria andChufashishijiguanLessThanOrEqualTo(String value) {
            addCriterion("CHUFASHISHIJIGUAN <=", value, "chufashishijiguan");
            return (Criteria) this;
        }

        public Criteria andChufashishijiguanLike(String value) {
            addCriterion("CHUFASHISHIJIGUAN like", value, "chufashishijiguan");
            return (Criteria) this;
        }

        public Criteria andChufashishijiguanNotLike(String value) {
            addCriterion("CHUFASHISHIJIGUAN not like", value, "chufashishijiguan");
            return (Criteria) this;
        }

        public Criteria andChufashishijiguanIn(List<String> values) {
            addCriterion("CHUFASHISHIJIGUAN in", values, "chufashishijiguan");
            return (Criteria) this;
        }

        public Criteria andChufashishijiguanNotIn(List<String> values) {
            addCriterion("CHUFASHISHIJIGUAN not in", values, "chufashishijiguan");
            return (Criteria) this;
        }

        public Criteria andChufashishijiguanBetween(String value1, String value2) {
            addCriterion("CHUFASHISHIJIGUAN between", value1, value2, "chufashishijiguan");
            return (Criteria) this;
        }

        public Criteria andChufashishijiguanNotBetween(String value1, String value2) {
            addCriterion("CHUFASHISHIJIGUAN not between", value1, value2, "chufashishijiguan");
            return (Criteria) this;
        }

        public Criteria andChufashijianIsNull() {
            addCriterion("CHUFASHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andChufashijianIsNotNull() {
            addCriterion("CHUFASHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andChufashijianEqualTo(Date value) {
            addCriterion("CHUFASHIJIAN =", value, "chufashijian");
            return (Criteria) this;
        }

        public Criteria andChufashijianNotEqualTo(Date value) {
            addCriterion("CHUFASHIJIAN <>", value, "chufashijian");
            return (Criteria) this;
        }

        public Criteria andChufashijianGreaterThan(Date value) {
            addCriterion("CHUFASHIJIAN >", value, "chufashijian");
            return (Criteria) this;
        }

        public Criteria andChufashijianGreaterThanOrEqualTo(Date value) {
            addCriterion("CHUFASHIJIAN >=", value, "chufashijian");
            return (Criteria) this;
        }

        public Criteria andChufashijianLessThan(Date value) {
            addCriterion("CHUFASHIJIAN <", value, "chufashijian");
            return (Criteria) this;
        }

        public Criteria andChufashijianLessThanOrEqualTo(Date value) {
            addCriterion("CHUFASHIJIAN <=", value, "chufashijian");
            return (Criteria) this;
        }

        public Criteria andChufashijianIn(List<Date> values) {
            addCriterion("CHUFASHIJIAN in", values, "chufashijian");
            return (Criteria) this;
        }

        public Criteria andChufashijianNotIn(List<Date> values) {
            addCriterion("CHUFASHIJIAN not in", values, "chufashijian");
            return (Criteria) this;
        }

        public Criteria andChufashijianBetween(Date value1, Date value2) {
            addCriterion("CHUFASHIJIAN between", value1, value2, "chufashijian");
            return (Criteria) this;
        }

        public Criteria andChufashijianNotBetween(Date value1, Date value2) {
            addCriterion("CHUFASHIJIAN not between", value1, value2, "chufashijian");
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