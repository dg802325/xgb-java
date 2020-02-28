package com.xgb.model;

import java.util.ArrayList;
import java.util.List;

public class JjhNjMlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JjhNjMlExample() {
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

        public Criteria andInstanceSyIsNull() {
            addCriterion("INSTANCE_SY is null");
            return (Criteria) this;
        }

        public Criteria andInstanceSyIsNotNull() {
            addCriterion("INSTANCE_SY is not null");
            return (Criteria) this;
        }

        public Criteria andInstanceSyEqualTo(String value) {
            addCriterion("INSTANCE_SY =", value, "instanceSy");
            return (Criteria) this;
        }

        public Criteria andInstanceSyNotEqualTo(String value) {
            addCriterion("INSTANCE_SY <>", value, "instanceSy");
            return (Criteria) this;
        }

        public Criteria andInstanceSyGreaterThan(String value) {
            addCriterion("INSTANCE_SY >", value, "instanceSy");
            return (Criteria) this;
        }

        public Criteria andInstanceSyGreaterThanOrEqualTo(String value) {
            addCriterion("INSTANCE_SY >=", value, "instanceSy");
            return (Criteria) this;
        }

        public Criteria andInstanceSyLessThan(String value) {
            addCriterion("INSTANCE_SY <", value, "instanceSy");
            return (Criteria) this;
        }

        public Criteria andInstanceSyLessThanOrEqualTo(String value) {
            addCriterion("INSTANCE_SY <=", value, "instanceSy");
            return (Criteria) this;
        }

        public Criteria andInstanceSyLike(String value) {
            addCriterion("INSTANCE_SY like", value, "instanceSy");
            return (Criteria) this;
        }

        public Criteria andInstanceSyNotLike(String value) {
            addCriterion("INSTANCE_SY not like", value, "instanceSy");
            return (Criteria) this;
        }

        public Criteria andInstanceSyIn(List<String> values) {
            addCriterion("INSTANCE_SY in", values, "instanceSy");
            return (Criteria) this;
        }

        public Criteria andInstanceSyNotIn(List<String> values) {
            addCriterion("INSTANCE_SY not in", values, "instanceSy");
            return (Criteria) this;
        }

        public Criteria andInstanceSyBetween(String value1, String value2) {
            addCriterion("INSTANCE_SY between", value1, value2, "instanceSy");
            return (Criteria) this;
        }

        public Criteria andInstanceSyNotBetween(String value1, String value2) {
            addCriterion("INSTANCE_SY not between", value1, value2, "instanceSy");
            return (Criteria) this;
        }

        public Criteria andShenhecishuIsNull() {
            addCriterion("SHENHECISHU is null");
            return (Criteria) this;
        }

        public Criteria andShenhecishuIsNotNull() {
            addCriterion("SHENHECISHU is not null");
            return (Criteria) this;
        }

        public Criteria andShenhecishuEqualTo(Integer value) {
            addCriterion("SHENHECISHU =", value, "shenhecishu");
            return (Criteria) this;
        }

        public Criteria andShenhecishuNotEqualTo(Integer value) {
            addCriterion("SHENHECISHU <>", value, "shenhecishu");
            return (Criteria) this;
        }

        public Criteria andShenhecishuGreaterThan(Integer value) {
            addCriterion("SHENHECISHU >", value, "shenhecishu");
            return (Criteria) this;
        }

        public Criteria andShenhecishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHENHECISHU >=", value, "shenhecishu");
            return (Criteria) this;
        }

        public Criteria andShenhecishuLessThan(Integer value) {
            addCriterion("SHENHECISHU <", value, "shenhecishu");
            return (Criteria) this;
        }

        public Criteria andShenhecishuLessThanOrEqualTo(Integer value) {
            addCriterion("SHENHECISHU <=", value, "shenhecishu");
            return (Criteria) this;
        }

        public Criteria andShenhecishuIn(List<Integer> values) {
            addCriterion("SHENHECISHU in", values, "shenhecishu");
            return (Criteria) this;
        }

        public Criteria andShenhecishuNotIn(List<Integer> values) {
            addCriterion("SHENHECISHU not in", values, "shenhecishu");
            return (Criteria) this;
        }

        public Criteria andShenhecishuBetween(Integer value1, Integer value2) {
            addCriterion("SHENHECISHU between", value1, value2, "shenhecishu");
            return (Criteria) this;
        }

        public Criteria andShenhecishuNotBetween(Integer value1, Integer value2) {
            addCriterion("SHENHECISHU not between", value1, value2, "shenhecishu");
            return (Criteria) this;
        }

        public Criteria andJijinhuimingchengIsNull() {
            addCriterion("JIJINHUIMINGCHENG is null");
            return (Criteria) this;
        }

        public Criteria andJijinhuimingchengIsNotNull() {
            addCriterion("JIJINHUIMINGCHENG is not null");
            return (Criteria) this;
        }

        public Criteria andJijinhuimingchengEqualTo(String value) {
            addCriterion("JIJINHUIMINGCHENG =", value, "jijinhuimingcheng");
            return (Criteria) this;
        }

        public Criteria andJijinhuimingchengNotEqualTo(String value) {
            addCriterion("JIJINHUIMINGCHENG <>", value, "jijinhuimingcheng");
            return (Criteria) this;
        }

        public Criteria andJijinhuimingchengGreaterThan(String value) {
            addCriterion("JIJINHUIMINGCHENG >", value, "jijinhuimingcheng");
            return (Criteria) this;
        }

        public Criteria andJijinhuimingchengGreaterThanOrEqualTo(String value) {
            addCriterion("JIJINHUIMINGCHENG >=", value, "jijinhuimingcheng");
            return (Criteria) this;
        }

        public Criteria andJijinhuimingchengLessThan(String value) {
            addCriterion("JIJINHUIMINGCHENG <", value, "jijinhuimingcheng");
            return (Criteria) this;
        }

        public Criteria andJijinhuimingchengLessThanOrEqualTo(String value) {
            addCriterion("JIJINHUIMINGCHENG <=", value, "jijinhuimingcheng");
            return (Criteria) this;
        }

        public Criteria andJijinhuimingchengLike(String value) {
            addCriterion("JIJINHUIMINGCHENG like", value, "jijinhuimingcheng");
            return (Criteria) this;
        }

        public Criteria andJijinhuimingchengNotLike(String value) {
            addCriterion("JIJINHUIMINGCHENG not like", value, "jijinhuimingcheng");
            return (Criteria) this;
        }

        public Criteria andJijinhuimingchengIn(List<String> values) {
            addCriterion("JIJINHUIMINGCHENG in", values, "jijinhuimingcheng");
            return (Criteria) this;
        }

        public Criteria andJijinhuimingchengNotIn(List<String> values) {
            addCriterion("JIJINHUIMINGCHENG not in", values, "jijinhuimingcheng");
            return (Criteria) this;
        }

        public Criteria andJijinhuimingchengBetween(String value1, String value2) {
            addCriterion("JIJINHUIMINGCHENG between", value1, value2, "jijinhuimingcheng");
            return (Criteria) this;
        }

        public Criteria andJijinhuimingchengNotBetween(String value1, String value2) {
            addCriterion("JIJINHUIMINGCHENG not between", value1, value2, "jijinhuimingcheng");
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

        public Criteria andNianfenIsNull() {
            addCriterion("NIANFEN is null");
            return (Criteria) this;
        }

        public Criteria andNianfenIsNotNull() {
            addCriterion("NIANFEN is not null");
            return (Criteria) this;
        }

        public Criteria andNianfenEqualTo(String value) {
            addCriterion("NIANFEN =", value, "nianfen");
            return (Criteria) this;
        }

        public Criteria andNianfenNotEqualTo(String value) {
            addCriterion("NIANFEN <>", value, "nianfen");
            return (Criteria) this;
        }

        public Criteria andNianfenGreaterThan(String value) {
            addCriterion("NIANFEN >", value, "nianfen");
            return (Criteria) this;
        }

        public Criteria andNianfenGreaterThanOrEqualTo(String value) {
            addCriterion("NIANFEN >=", value, "nianfen");
            return (Criteria) this;
        }

        public Criteria andNianfenLessThan(String value) {
            addCriterion("NIANFEN <", value, "nianfen");
            return (Criteria) this;
        }

        public Criteria andNianfenLessThanOrEqualTo(String value) {
            addCriterion("NIANFEN <=", value, "nianfen");
            return (Criteria) this;
        }

        public Criteria andNianfenLike(String value) {
            addCriterion("NIANFEN like", value, "nianfen");
            return (Criteria) this;
        }

        public Criteria andNianfenNotLike(String value) {
            addCriterion("NIANFEN not like", value, "nianfen");
            return (Criteria) this;
        }

        public Criteria andNianfenIn(List<String> values) {
            addCriterion("NIANFEN in", values, "nianfen");
            return (Criteria) this;
        }

        public Criteria andNianfenNotIn(List<String> values) {
            addCriterion("NIANFEN not in", values, "nianfen");
            return (Criteria) this;
        }

        public Criteria andNianfenBetween(String value1, String value2) {
            addCriterion("NIANFEN between", value1, value2, "nianfen");
            return (Criteria) this;
        }

        public Criteria andNianfenNotBetween(String value1, String value2) {
            addCriterion("NIANFEN not between", value1, value2, "nianfen");
            return (Criteria) this;
        }

        public Criteria andShouqianIsNull() {
            addCriterion("SHOUQIAN is null");
            return (Criteria) this;
        }

        public Criteria andShouqianIsNotNull() {
            addCriterion("SHOUQIAN is not null");
            return (Criteria) this;
        }

        public Criteria andShouqianEqualTo(String value) {
            addCriterion("SHOUQIAN =", value, "shouqian");
            return (Criteria) this;
        }

        public Criteria andShouqianNotEqualTo(String value) {
            addCriterion("SHOUQIAN <>", value, "shouqian");
            return (Criteria) this;
        }

        public Criteria andShouqianGreaterThan(String value) {
            addCriterion("SHOUQIAN >", value, "shouqian");
            return (Criteria) this;
        }

        public Criteria andShouqianGreaterThanOrEqualTo(String value) {
            addCriterion("SHOUQIAN >=", value, "shouqian");
            return (Criteria) this;
        }

        public Criteria andShouqianLessThan(String value) {
            addCriterion("SHOUQIAN <", value, "shouqian");
            return (Criteria) this;
        }

        public Criteria andShouqianLessThanOrEqualTo(String value) {
            addCriterion("SHOUQIAN <=", value, "shouqian");
            return (Criteria) this;
        }

        public Criteria andShouqianLike(String value) {
            addCriterion("SHOUQIAN like", value, "shouqian");
            return (Criteria) this;
        }

        public Criteria andShouqianNotLike(String value) {
            addCriterion("SHOUQIAN not like", value, "shouqian");
            return (Criteria) this;
        }

        public Criteria andShouqianIn(List<String> values) {
            addCriterion("SHOUQIAN in", values, "shouqian");
            return (Criteria) this;
        }

        public Criteria andShouqianNotIn(List<String> values) {
            addCriterion("SHOUQIAN not in", values, "shouqian");
            return (Criteria) this;
        }

        public Criteria andShouqianBetween(String value1, String value2) {
            addCriterion("SHOUQIAN between", value1, value2, "shouqian");
            return (Criteria) this;
        }

        public Criteria andShouqianNotBetween(String value1, String value2) {
            addCriterion("SHOUQIAN not between", value1, value2, "shouqian");
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