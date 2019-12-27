package com.xgb.model;

import java.util.ArrayList;
import java.util.List;

public class SjzdNodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SjzdNodeExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("PARENTID is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("PARENTID is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("PARENTID =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("PARENTID <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("PARENTID >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PARENTID >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("PARENTID <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("PARENTID <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("PARENTID in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("PARENTID not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("PARENTID between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("PARENTID not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andNodeNameIsNull() {
            addCriterion("NODE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNodeNameIsNotNull() {
            addCriterion("NODE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNodeNameEqualTo(String value) {
            addCriterion("NODE_NAME =", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameNotEqualTo(String value) {
            addCriterion("NODE_NAME <>", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameGreaterThan(String value) {
            addCriterion("NODE_NAME >", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameGreaterThanOrEqualTo(String value) {
            addCriterion("NODE_NAME >=", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameLessThan(String value) {
            addCriterion("NODE_NAME <", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameLessThanOrEqualTo(String value) {
            addCriterion("NODE_NAME <=", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameLike(String value) {
            addCriterion("NODE_NAME like", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameNotLike(String value) {
            addCriterion("NODE_NAME not like", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameIn(List<String> values) {
            addCriterion("NODE_NAME in", values, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameNotIn(List<String> values) {
            addCriterion("NODE_NAME not in", values, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameBetween(String value1, String value2) {
            addCriterion("NODE_NAME between", value1, value2, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameNotBetween(String value1, String value2) {
            addCriterion("NODE_NAME not between", value1, value2, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeTypenameIsNull() {
            addCriterion("NODE_TYPENAME is null");
            return (Criteria) this;
        }

        public Criteria andNodeTypenameIsNotNull() {
            addCriterion("NODE_TYPENAME is not null");
            return (Criteria) this;
        }

        public Criteria andNodeTypenameEqualTo(String value) {
            addCriterion("NODE_TYPENAME =", value, "nodeTypename");
            return (Criteria) this;
        }

        public Criteria andNodeTypenameNotEqualTo(String value) {
            addCriterion("NODE_TYPENAME <>", value, "nodeTypename");
            return (Criteria) this;
        }

        public Criteria andNodeTypenameGreaterThan(String value) {
            addCriterion("NODE_TYPENAME >", value, "nodeTypename");
            return (Criteria) this;
        }

        public Criteria andNodeTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("NODE_TYPENAME >=", value, "nodeTypename");
            return (Criteria) this;
        }

        public Criteria andNodeTypenameLessThan(String value) {
            addCriterion("NODE_TYPENAME <", value, "nodeTypename");
            return (Criteria) this;
        }

        public Criteria andNodeTypenameLessThanOrEqualTo(String value) {
            addCriterion("NODE_TYPENAME <=", value, "nodeTypename");
            return (Criteria) this;
        }

        public Criteria andNodeTypenameLike(String value) {
            addCriterion("NODE_TYPENAME like", value, "nodeTypename");
            return (Criteria) this;
        }

        public Criteria andNodeTypenameNotLike(String value) {
            addCriterion("NODE_TYPENAME not like", value, "nodeTypename");
            return (Criteria) this;
        }

        public Criteria andNodeTypenameIn(List<String> values) {
            addCriterion("NODE_TYPENAME in", values, "nodeTypename");
            return (Criteria) this;
        }

        public Criteria andNodeTypenameNotIn(List<String> values) {
            addCriterion("NODE_TYPENAME not in", values, "nodeTypename");
            return (Criteria) this;
        }

        public Criteria andNodeTypenameBetween(String value1, String value2) {
            addCriterion("NODE_TYPENAME between", value1, value2, "nodeTypename");
            return (Criteria) this;
        }

        public Criteria andNodeTypenameNotBetween(String value1, String value2) {
            addCriterion("NODE_TYPENAME not between", value1, value2, "nodeTypename");
            return (Criteria) this;
        }

        public Criteria andNodeLevelIsNull() {
            addCriterion("NODE_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andNodeLevelIsNotNull() {
            addCriterion("NODE_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andNodeLevelEqualTo(Integer value) {
            addCriterion("NODE_LEVEL =", value, "nodeLevel");
            return (Criteria) this;
        }

        public Criteria andNodeLevelNotEqualTo(Integer value) {
            addCriterion("NODE_LEVEL <>", value, "nodeLevel");
            return (Criteria) this;
        }

        public Criteria andNodeLevelGreaterThan(Integer value) {
            addCriterion("NODE_LEVEL >", value, "nodeLevel");
            return (Criteria) this;
        }

        public Criteria andNodeLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("NODE_LEVEL >=", value, "nodeLevel");
            return (Criteria) this;
        }

        public Criteria andNodeLevelLessThan(Integer value) {
            addCriterion("NODE_LEVEL <", value, "nodeLevel");
            return (Criteria) this;
        }

        public Criteria andNodeLevelLessThanOrEqualTo(Integer value) {
            addCriterion("NODE_LEVEL <=", value, "nodeLevel");
            return (Criteria) this;
        }

        public Criteria andNodeLevelIn(List<Integer> values) {
            addCriterion("NODE_LEVEL in", values, "nodeLevel");
            return (Criteria) this;
        }

        public Criteria andNodeLevelNotIn(List<Integer> values) {
            addCriterion("NODE_LEVEL not in", values, "nodeLevel");
            return (Criteria) this;
        }

        public Criteria andNodeLevelBetween(Integer value1, Integer value2) {
            addCriterion("NODE_LEVEL between", value1, value2, "nodeLevel");
            return (Criteria) this;
        }

        public Criteria andNodeLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("NODE_LEVEL not between", value1, value2, "nodeLevel");
            return (Criteria) this;
        }

        public Criteria andNodeValueIsNull() {
            addCriterion("NODE_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andNodeValueIsNotNull() {
            addCriterion("NODE_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andNodeValueEqualTo(String value) {
            addCriterion("NODE_VALUE =", value, "nodeValue");
            return (Criteria) this;
        }

        public Criteria andNodeValueNotEqualTo(String value) {
            addCriterion("NODE_VALUE <>", value, "nodeValue");
            return (Criteria) this;
        }

        public Criteria andNodeValueGreaterThan(String value) {
            addCriterion("NODE_VALUE >", value, "nodeValue");
            return (Criteria) this;
        }

        public Criteria andNodeValueGreaterThanOrEqualTo(String value) {
            addCriterion("NODE_VALUE >=", value, "nodeValue");
            return (Criteria) this;
        }

        public Criteria andNodeValueLessThan(String value) {
            addCriterion("NODE_VALUE <", value, "nodeValue");
            return (Criteria) this;
        }

        public Criteria andNodeValueLessThanOrEqualTo(String value) {
            addCriterion("NODE_VALUE <=", value, "nodeValue");
            return (Criteria) this;
        }

        public Criteria andNodeValueLike(String value) {
            addCriterion("NODE_VALUE like", value, "nodeValue");
            return (Criteria) this;
        }

        public Criteria andNodeValueNotLike(String value) {
            addCriterion("NODE_VALUE not like", value, "nodeValue");
            return (Criteria) this;
        }

        public Criteria andNodeValueIn(List<String> values) {
            addCriterion("NODE_VALUE in", values, "nodeValue");
            return (Criteria) this;
        }

        public Criteria andNodeValueNotIn(List<String> values) {
            addCriterion("NODE_VALUE not in", values, "nodeValue");
            return (Criteria) this;
        }

        public Criteria andNodeValueBetween(String value1, String value2) {
            addCriterion("NODE_VALUE between", value1, value2, "nodeValue");
            return (Criteria) this;
        }

        public Criteria andNodeValueNotBetween(String value1, String value2) {
            addCriterion("NODE_VALUE not between", value1, value2, "nodeValue");
            return (Criteria) this;
        }

        public Criteria andNodeIndexIsNull() {
            addCriterion("NODE_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andNodeIndexIsNotNull() {
            addCriterion("NODE_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andNodeIndexEqualTo(Integer value) {
            addCriterion("NODE_INDEX =", value, "nodeIndex");
            return (Criteria) this;
        }

        public Criteria andNodeIndexNotEqualTo(Integer value) {
            addCriterion("NODE_INDEX <>", value, "nodeIndex");
            return (Criteria) this;
        }

        public Criteria andNodeIndexGreaterThan(Integer value) {
            addCriterion("NODE_INDEX >", value, "nodeIndex");
            return (Criteria) this;
        }

        public Criteria andNodeIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("NODE_INDEX >=", value, "nodeIndex");
            return (Criteria) this;
        }

        public Criteria andNodeIndexLessThan(Integer value) {
            addCriterion("NODE_INDEX <", value, "nodeIndex");
            return (Criteria) this;
        }

        public Criteria andNodeIndexLessThanOrEqualTo(Integer value) {
            addCriterion("NODE_INDEX <=", value, "nodeIndex");
            return (Criteria) this;
        }

        public Criteria andNodeIndexIn(List<Integer> values) {
            addCriterion("NODE_INDEX in", values, "nodeIndex");
            return (Criteria) this;
        }

        public Criteria andNodeIndexNotIn(List<Integer> values) {
            addCriterion("NODE_INDEX not in", values, "nodeIndex");
            return (Criteria) this;
        }

        public Criteria andNodeIndexBetween(Integer value1, Integer value2) {
            addCriterion("NODE_INDEX between", value1, value2, "nodeIndex");
            return (Criteria) this;
        }

        public Criteria andNodeIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("NODE_INDEX not between", value1, value2, "nodeIndex");
            return (Criteria) this;
        }

        public Criteria andInstitutionidIsNull() {
            addCriterion("INSTITUTIONID is null");
            return (Criteria) this;
        }

        public Criteria andInstitutionidIsNotNull() {
            addCriterion("INSTITUTIONID is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutionidEqualTo(Long value) {
            addCriterion("INSTITUTIONID =", value, "institutionid");
            return (Criteria) this;
        }

        public Criteria andInstitutionidNotEqualTo(Long value) {
            addCriterion("INSTITUTIONID <>", value, "institutionid");
            return (Criteria) this;
        }

        public Criteria andInstitutionidGreaterThan(Long value) {
            addCriterion("INSTITUTIONID >", value, "institutionid");
            return (Criteria) this;
        }

        public Criteria andInstitutionidGreaterThanOrEqualTo(Long value) {
            addCriterion("INSTITUTIONID >=", value, "institutionid");
            return (Criteria) this;
        }

        public Criteria andInstitutionidLessThan(Long value) {
            addCriterion("INSTITUTIONID <", value, "institutionid");
            return (Criteria) this;
        }

        public Criteria andInstitutionidLessThanOrEqualTo(Long value) {
            addCriterion("INSTITUTIONID <=", value, "institutionid");
            return (Criteria) this;
        }

        public Criteria andInstitutionidIn(List<Long> values) {
            addCriterion("INSTITUTIONID in", values, "institutionid");
            return (Criteria) this;
        }

        public Criteria andInstitutionidNotIn(List<Long> values) {
            addCriterion("INSTITUTIONID not in", values, "institutionid");
            return (Criteria) this;
        }

        public Criteria andInstitutionidBetween(Long value1, Long value2) {
            addCriterion("INSTITUTIONID between", value1, value2, "institutionid");
            return (Criteria) this;
        }

        public Criteria andInstitutionidNotBetween(Long value1, Long value2) {
            addCriterion("INSTITUTIONID not between", value1, value2, "institutionid");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Short value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Short value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Short value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Short value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Short value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Short value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Short> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Short> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Short value1, Short value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Short value1, Short value2) {
            addCriterion("STATE not between", value1, value2, "state");
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