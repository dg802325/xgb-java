package com.xgb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysOssExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysOssExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOosUrlIsNull() {
            addCriterion("OOS_URL is null");
            return (Criteria) this;
        }

        public Criteria andOosUrlIsNotNull() {
            addCriterion("OOS_URL is not null");
            return (Criteria) this;
        }

        public Criteria andOosUrlEqualTo(String value) {
            addCriterion("OOS_URL =", value, "oosUrl");
            return (Criteria) this;
        }

        public Criteria andOosUrlNotEqualTo(String value) {
            addCriterion("OOS_URL <>", value, "oosUrl");
            return (Criteria) this;
        }

        public Criteria andOosUrlGreaterThan(String value) {
            addCriterion("OOS_URL >", value, "oosUrl");
            return (Criteria) this;
        }

        public Criteria andOosUrlGreaterThanOrEqualTo(String value) {
            addCriterion("OOS_URL >=", value, "oosUrl");
            return (Criteria) this;
        }

        public Criteria andOosUrlLessThan(String value) {
            addCriterion("OOS_URL <", value, "oosUrl");
            return (Criteria) this;
        }

        public Criteria andOosUrlLessThanOrEqualTo(String value) {
            addCriterion("OOS_URL <=", value, "oosUrl");
            return (Criteria) this;
        }

        public Criteria andOosUrlLike(String value) {
            addCriterion("OOS_URL like", value, "oosUrl");
            return (Criteria) this;
        }

        public Criteria andOosUrlNotLike(String value) {
            addCriterion("OOS_URL not like", value, "oosUrl");
            return (Criteria) this;
        }

        public Criteria andOosUrlIn(List<String> values) {
            addCriterion("OOS_URL in", values, "oosUrl");
            return (Criteria) this;
        }

        public Criteria andOosUrlNotIn(List<String> values) {
            addCriterion("OOS_URL not in", values, "oosUrl");
            return (Criteria) this;
        }

        public Criteria andOosUrlBetween(String value1, String value2) {
            addCriterion("OOS_URL between", value1, value2, "oosUrl");
            return (Criteria) this;
        }

        public Criteria andOosUrlNotBetween(String value1, String value2) {
            addCriterion("OOS_URL not between", value1, value2, "oosUrl");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("CREATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("CREATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(String value) {
            addCriterion("CREATE_ID =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(String value) {
            addCriterion("CREATE_ID <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(String value) {
            addCriterion("CREATE_ID >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_ID >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(String value) {
            addCriterion("CREATE_ID <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(String value) {
            addCriterion("CREATE_ID <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLike(String value) {
            addCriterion("CREATE_ID like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotLike(String value) {
            addCriterion("CREATE_ID not like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<String> values) {
            addCriterion("CREATE_ID in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<String> values) {
            addCriterion("CREATE_ID not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(String value1, String value2) {
            addCriterion("CREATE_ID between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(String value1, String value2) {
            addCriterion("CREATE_ID not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNull() {
            addCriterion("UPDATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNotNull() {
            addCriterion("UPDATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdEqualTo(String value) {
            addCriterion("UPDATE_ID =", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotEqualTo(String value) {
            addCriterion("UPDATE_ID <>", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThan(String value) {
            addCriterion("UPDATE_ID >", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_ID >=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThan(String value) {
            addCriterion("UPDATE_ID <", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_ID <=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLike(String value) {
            addCriterion("UPDATE_ID like", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotLike(String value) {
            addCriterion("UPDATE_ID not like", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIn(List<String> values) {
            addCriterion("UPDATE_ID in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotIn(List<String> values) {
            addCriterion("UPDATE_ID not in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdBetween(String value1, String value2) {
            addCriterion("UPDATE_ID between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotBetween(String value1, String value2) {
            addCriterion("UPDATE_ID not between", value1, value2, "updateId");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOosNameIsNull() {
            addCriterion("OOS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOosNameIsNotNull() {
            addCriterion("OOS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOosNameEqualTo(String value) {
            addCriterion("OOS_NAME =", value, "oosName");
            return (Criteria) this;
        }

        public Criteria andOosNameNotEqualTo(String value) {
            addCriterion("OOS_NAME <>", value, "oosName");
            return (Criteria) this;
        }

        public Criteria andOosNameGreaterThan(String value) {
            addCriterion("OOS_NAME >", value, "oosName");
            return (Criteria) this;
        }

        public Criteria andOosNameGreaterThanOrEqualTo(String value) {
            addCriterion("OOS_NAME >=", value, "oosName");
            return (Criteria) this;
        }

        public Criteria andOosNameLessThan(String value) {
            addCriterion("OOS_NAME <", value, "oosName");
            return (Criteria) this;
        }

        public Criteria andOosNameLessThanOrEqualTo(String value) {
            addCriterion("OOS_NAME <=", value, "oosName");
            return (Criteria) this;
        }

        public Criteria andOosNameLike(String value) {
            addCriterion("OOS_NAME like", value, "oosName");
            return (Criteria) this;
        }

        public Criteria andOosNameNotLike(String value) {
            addCriterion("OOS_NAME not like", value, "oosName");
            return (Criteria) this;
        }

        public Criteria andOosNameIn(List<String> values) {
            addCriterion("OOS_NAME in", values, "oosName");
            return (Criteria) this;
        }

        public Criteria andOosNameNotIn(List<String> values) {
            addCriterion("OOS_NAME not in", values, "oosName");
            return (Criteria) this;
        }

        public Criteria andOosNameBetween(String value1, String value2) {
            addCriterion("OOS_NAME between", value1, value2, "oosName");
            return (Criteria) this;
        }

        public Criteria andOosNameNotBetween(String value1, String value2) {
            addCriterion("OOS_NAME not between", value1, value2, "oosName");
            return (Criteria) this;
        }

        public Criteria andOosSuffixIsNull() {
            addCriterion("OOS_SUFFIX is null");
            return (Criteria) this;
        }

        public Criteria andOosSuffixIsNotNull() {
            addCriterion("OOS_SUFFIX is not null");
            return (Criteria) this;
        }

        public Criteria andOosSuffixEqualTo(String value) {
            addCriterion("OOS_SUFFIX =", value, "oosSuffix");
            return (Criteria) this;
        }

        public Criteria andOosSuffixNotEqualTo(String value) {
            addCriterion("OOS_SUFFIX <>", value, "oosSuffix");
            return (Criteria) this;
        }

        public Criteria andOosSuffixGreaterThan(String value) {
            addCriterion("OOS_SUFFIX >", value, "oosSuffix");
            return (Criteria) this;
        }

        public Criteria andOosSuffixGreaterThanOrEqualTo(String value) {
            addCriterion("OOS_SUFFIX >=", value, "oosSuffix");
            return (Criteria) this;
        }

        public Criteria andOosSuffixLessThan(String value) {
            addCriterion("OOS_SUFFIX <", value, "oosSuffix");
            return (Criteria) this;
        }

        public Criteria andOosSuffixLessThanOrEqualTo(String value) {
            addCriterion("OOS_SUFFIX <=", value, "oosSuffix");
            return (Criteria) this;
        }

        public Criteria andOosSuffixLike(String value) {
            addCriterion("OOS_SUFFIX like", value, "oosSuffix");
            return (Criteria) this;
        }

        public Criteria andOosSuffixNotLike(String value) {
            addCriterion("OOS_SUFFIX not like", value, "oosSuffix");
            return (Criteria) this;
        }

        public Criteria andOosSuffixIn(List<String> values) {
            addCriterion("OOS_SUFFIX in", values, "oosSuffix");
            return (Criteria) this;
        }

        public Criteria andOosSuffixNotIn(List<String> values) {
            addCriterion("OOS_SUFFIX not in", values, "oosSuffix");
            return (Criteria) this;
        }

        public Criteria andOosSuffixBetween(String value1, String value2) {
            addCriterion("OOS_SUFFIX between", value1, value2, "oosSuffix");
            return (Criteria) this;
        }

        public Criteria andOosSuffixNotBetween(String value1, String value2) {
            addCriterion("OOS_SUFFIX not between", value1, value2, "oosSuffix");
            return (Criteria) this;
        }

        public Criteria andOosTypeIsNull() {
            addCriterion("OOS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOosTypeIsNotNull() {
            addCriterion("OOS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOosTypeEqualTo(String value) {
            addCriterion("OOS_TYPE =", value, "oosType");
            return (Criteria) this;
        }

        public Criteria andOosTypeNotEqualTo(String value) {
            addCriterion("OOS_TYPE <>", value, "oosType");
            return (Criteria) this;
        }

        public Criteria andOosTypeGreaterThan(String value) {
            addCriterion("OOS_TYPE >", value, "oosType");
            return (Criteria) this;
        }

        public Criteria andOosTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OOS_TYPE >=", value, "oosType");
            return (Criteria) this;
        }

        public Criteria andOosTypeLessThan(String value) {
            addCriterion("OOS_TYPE <", value, "oosType");
            return (Criteria) this;
        }

        public Criteria andOosTypeLessThanOrEqualTo(String value) {
            addCriterion("OOS_TYPE <=", value, "oosType");
            return (Criteria) this;
        }

        public Criteria andOosTypeLike(String value) {
            addCriterion("OOS_TYPE like", value, "oosType");
            return (Criteria) this;
        }

        public Criteria andOosTypeNotLike(String value) {
            addCriterion("OOS_TYPE not like", value, "oosType");
            return (Criteria) this;
        }

        public Criteria andOosTypeIn(List<String> values) {
            addCriterion("OOS_TYPE in", values, "oosType");
            return (Criteria) this;
        }

        public Criteria andOosTypeNotIn(List<String> values) {
            addCriterion("OOS_TYPE not in", values, "oosType");
            return (Criteria) this;
        }

        public Criteria andOosTypeBetween(String value1, String value2) {
            addCriterion("OOS_TYPE between", value1, value2, "oosType");
            return (Criteria) this;
        }

        public Criteria andOosTypeNotBetween(String value1, String value2) {
            addCriterion("OOS_TYPE not between", value1, value2, "oosType");
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