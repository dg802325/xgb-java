package com.xgb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MfGwyJzTbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MfGwyJzTbExample() {
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

        public Criteria andDanweimingchengIsNull() {
            addCriterion("DANWEIMINGCHENG is null");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengIsNotNull() {
            addCriterion("DANWEIMINGCHENG is not null");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengEqualTo(String value) {
            addCriterion("DANWEIMINGCHENG =", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengNotEqualTo(String value) {
            addCriterion("DANWEIMINGCHENG <>", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengGreaterThan(String value) {
            addCriterion("DANWEIMINGCHENG >", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengGreaterThanOrEqualTo(String value) {
            addCriterion("DANWEIMINGCHENG >=", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengLessThan(String value) {
            addCriterion("DANWEIMINGCHENG <", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengLessThanOrEqualTo(String value) {
            addCriterion("DANWEIMINGCHENG <=", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengLike(String value) {
            addCriterion("DANWEIMINGCHENG like", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengNotLike(String value) {
            addCriterion("DANWEIMINGCHENG not like", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengIn(List<String> values) {
            addCriterion("DANWEIMINGCHENG in", values, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengNotIn(List<String> values) {
            addCriterion("DANWEIMINGCHENG not in", values, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengBetween(String value1, String value2) {
            addCriterion("DANWEIMINGCHENG between", value1, value2, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengNotBetween(String value1, String value2) {
            addCriterion("DANWEIMINGCHENG not between", value1, value2, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andQianziIsNull() {
            addCriterion("QIANZI is null");
            return (Criteria) this;
        }

        public Criteria andQianziIsNotNull() {
            addCriterion("QIANZI is not null");
            return (Criteria) this;
        }

        public Criteria andQianziEqualTo(String value) {
            addCriterion("QIANZI =", value, "qianzi");
            return (Criteria) this;
        }

        public Criteria andQianziNotEqualTo(String value) {
            addCriterion("QIANZI <>", value, "qianzi");
            return (Criteria) this;
        }

        public Criteria andQianziGreaterThan(String value) {
            addCriterion("QIANZI >", value, "qianzi");
            return (Criteria) this;
        }

        public Criteria andQianziGreaterThanOrEqualTo(String value) {
            addCriterion("QIANZI >=", value, "qianzi");
            return (Criteria) this;
        }

        public Criteria andQianziLessThan(String value) {
            addCriterion("QIANZI <", value, "qianzi");
            return (Criteria) this;
        }

        public Criteria andQianziLessThanOrEqualTo(String value) {
            addCriterion("QIANZI <=", value, "qianzi");
            return (Criteria) this;
        }

        public Criteria andQianziLike(String value) {
            addCriterion("QIANZI like", value, "qianzi");
            return (Criteria) this;
        }

        public Criteria andQianziNotLike(String value) {
            addCriterion("QIANZI not like", value, "qianzi");
            return (Criteria) this;
        }

        public Criteria andQianziIn(List<String> values) {
            addCriterion("QIANZI in", values, "qianzi");
            return (Criteria) this;
        }

        public Criteria andQianziNotIn(List<String> values) {
            addCriterion("QIANZI not in", values, "qianzi");
            return (Criteria) this;
        }

        public Criteria andQianziBetween(String value1, String value2) {
            addCriterion("QIANZI between", value1, value2, "qianzi");
            return (Criteria) this;
        }

        public Criteria andQianziNotBetween(String value1, String value2) {
            addCriterion("QIANZI not between", value1, value2, "qianzi");
            return (Criteria) this;
        }

        public Criteria andTianbiaoshijianIsNull() {
            addCriterion("TIANBIAOSHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andTianbiaoshijianIsNotNull() {
            addCriterion("TIANBIAOSHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andTianbiaoshijianEqualTo(Date value) {
            addCriterion("TIANBIAOSHIJIAN =", value, "tianbiaoshijian");
            return (Criteria) this;
        }

        public Criteria andTianbiaoshijianNotEqualTo(Date value) {
            addCriterion("TIANBIAOSHIJIAN <>", value, "tianbiaoshijian");
            return (Criteria) this;
        }

        public Criteria andTianbiaoshijianGreaterThan(Date value) {
            addCriterion("TIANBIAOSHIJIAN >", value, "tianbiaoshijian");
            return (Criteria) this;
        }

        public Criteria andTianbiaoshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("TIANBIAOSHIJIAN >=", value, "tianbiaoshijian");
            return (Criteria) this;
        }

        public Criteria andTianbiaoshijianLessThan(Date value) {
            addCriterion("TIANBIAOSHIJIAN <", value, "tianbiaoshijian");
            return (Criteria) this;
        }

        public Criteria andTianbiaoshijianLessThanOrEqualTo(Date value) {
            addCriterion("TIANBIAOSHIJIAN <=", value, "tianbiaoshijian");
            return (Criteria) this;
        }

        public Criteria andTianbiaoshijianIn(List<Date> values) {
            addCriterion("TIANBIAOSHIJIAN in", values, "tianbiaoshijian");
            return (Criteria) this;
        }

        public Criteria andTianbiaoshijianNotIn(List<Date> values) {
            addCriterion("TIANBIAOSHIJIAN not in", values, "tianbiaoshijian");
            return (Criteria) this;
        }

        public Criteria andTianbiaoshijianBetween(Date value1, Date value2) {
            addCriterion("TIANBIAOSHIJIAN between", value1, value2, "tianbiaoshijian");
            return (Criteria) this;
        }

        public Criteria andTianbiaoshijianNotBetween(Date value1, Date value2) {
            addCriterion("TIANBIAOSHIJIAN not between", value1, value2, "tianbiaoshijian");
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