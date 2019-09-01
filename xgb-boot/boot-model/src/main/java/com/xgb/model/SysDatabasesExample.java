package com.xgb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysDatabasesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysDatabasesExample() {
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

        public Criteria andDatabaseUrlIsNull() {
            addCriterion("DATABASE_URL is null");
            return (Criteria) this;
        }

        public Criteria andDatabaseUrlIsNotNull() {
            addCriterion("DATABASE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andDatabaseUrlEqualTo(String value) {
            addCriterion("DATABASE_URL =", value, "databaseUrl");
            return (Criteria) this;
        }

        public Criteria andDatabaseUrlNotEqualTo(String value) {
            addCriterion("DATABASE_URL <>", value, "databaseUrl");
            return (Criteria) this;
        }

        public Criteria andDatabaseUrlGreaterThan(String value) {
            addCriterion("DATABASE_URL >", value, "databaseUrl");
            return (Criteria) this;
        }

        public Criteria andDatabaseUrlGreaterThanOrEqualTo(String value) {
            addCriterion("DATABASE_URL >=", value, "databaseUrl");
            return (Criteria) this;
        }

        public Criteria andDatabaseUrlLessThan(String value) {
            addCriterion("DATABASE_URL <", value, "databaseUrl");
            return (Criteria) this;
        }

        public Criteria andDatabaseUrlLessThanOrEqualTo(String value) {
            addCriterion("DATABASE_URL <=", value, "databaseUrl");
            return (Criteria) this;
        }

        public Criteria andDatabaseUrlLike(String value) {
            addCriterion("DATABASE_URL like", value, "databaseUrl");
            return (Criteria) this;
        }

        public Criteria andDatabaseUrlNotLike(String value) {
            addCriterion("DATABASE_URL not like", value, "databaseUrl");
            return (Criteria) this;
        }

        public Criteria andDatabaseUrlIn(List<String> values) {
            addCriterion("DATABASE_URL in", values, "databaseUrl");
            return (Criteria) this;
        }

        public Criteria andDatabaseUrlNotIn(List<String> values) {
            addCriterion("DATABASE_URL not in", values, "databaseUrl");
            return (Criteria) this;
        }

        public Criteria andDatabaseUrlBetween(String value1, String value2) {
            addCriterion("DATABASE_URL between", value1, value2, "databaseUrl");
            return (Criteria) this;
        }

        public Criteria andDatabaseUrlNotBetween(String value1, String value2) {
            addCriterion("DATABASE_URL not between", value1, value2, "databaseUrl");
            return (Criteria) this;
        }

        public Criteria andDatabasePortNumberIsNull() {
            addCriterion("DATABASE_PORT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andDatabasePortNumberIsNotNull() {
            addCriterion("DATABASE_PORT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andDatabasePortNumberEqualTo(String value) {
            addCriterion("DATABASE_PORT_NUMBER =", value, "databasePortNumber");
            return (Criteria) this;
        }

        public Criteria andDatabasePortNumberNotEqualTo(String value) {
            addCriterion("DATABASE_PORT_NUMBER <>", value, "databasePortNumber");
            return (Criteria) this;
        }

        public Criteria andDatabasePortNumberGreaterThan(String value) {
            addCriterion("DATABASE_PORT_NUMBER >", value, "databasePortNumber");
            return (Criteria) this;
        }

        public Criteria andDatabasePortNumberGreaterThanOrEqualTo(String value) {
            addCriterion("DATABASE_PORT_NUMBER >=", value, "databasePortNumber");
            return (Criteria) this;
        }

        public Criteria andDatabasePortNumberLessThan(String value) {
            addCriterion("DATABASE_PORT_NUMBER <", value, "databasePortNumber");
            return (Criteria) this;
        }

        public Criteria andDatabasePortNumberLessThanOrEqualTo(String value) {
            addCriterion("DATABASE_PORT_NUMBER <=", value, "databasePortNumber");
            return (Criteria) this;
        }

        public Criteria andDatabasePortNumberLike(String value) {
            addCriterion("DATABASE_PORT_NUMBER like", value, "databasePortNumber");
            return (Criteria) this;
        }

        public Criteria andDatabasePortNumberNotLike(String value) {
            addCriterion("DATABASE_PORT_NUMBER not like", value, "databasePortNumber");
            return (Criteria) this;
        }

        public Criteria andDatabasePortNumberIn(List<String> values) {
            addCriterion("DATABASE_PORT_NUMBER in", values, "databasePortNumber");
            return (Criteria) this;
        }

        public Criteria andDatabasePortNumberNotIn(List<String> values) {
            addCriterion("DATABASE_PORT_NUMBER not in", values, "databasePortNumber");
            return (Criteria) this;
        }

        public Criteria andDatabasePortNumberBetween(String value1, String value2) {
            addCriterion("DATABASE_PORT_NUMBER between", value1, value2, "databasePortNumber");
            return (Criteria) this;
        }

        public Criteria andDatabasePortNumberNotBetween(String value1, String value2) {
            addCriterion("DATABASE_PORT_NUMBER not between", value1, value2, "databasePortNumber");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameIsNull() {
            addCriterion("DATABASE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameIsNotNull() {
            addCriterion("DATABASE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameEqualTo(String value) {
            addCriterion("DATABASE_NAME =", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameNotEqualTo(String value) {
            addCriterion("DATABASE_NAME <>", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameGreaterThan(String value) {
            addCriterion("DATABASE_NAME >", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("DATABASE_NAME >=", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameLessThan(String value) {
            addCriterion("DATABASE_NAME <", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameLessThanOrEqualTo(String value) {
            addCriterion("DATABASE_NAME <=", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameLike(String value) {
            addCriterion("DATABASE_NAME like", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameNotLike(String value) {
            addCriterion("DATABASE_NAME not like", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameIn(List<String> values) {
            addCriterion("DATABASE_NAME in", values, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameNotIn(List<String> values) {
            addCriterion("DATABASE_NAME not in", values, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameBetween(String value1, String value2) {
            addCriterion("DATABASE_NAME between", value1, value2, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameNotBetween(String value1, String value2) {
            addCriterion("DATABASE_NAME not between", value1, value2, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseTypeIsNull() {
            addCriterion("DATABASE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDatabaseTypeIsNotNull() {
            addCriterion("DATABASE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDatabaseTypeEqualTo(String value) {
            addCriterion("DATABASE_TYPE =", value, "databaseType");
            return (Criteria) this;
        }

        public Criteria andDatabaseTypeNotEqualTo(String value) {
            addCriterion("DATABASE_TYPE <>", value, "databaseType");
            return (Criteria) this;
        }

        public Criteria andDatabaseTypeGreaterThan(String value) {
            addCriterion("DATABASE_TYPE >", value, "databaseType");
            return (Criteria) this;
        }

        public Criteria andDatabaseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DATABASE_TYPE >=", value, "databaseType");
            return (Criteria) this;
        }

        public Criteria andDatabaseTypeLessThan(String value) {
            addCriterion("DATABASE_TYPE <", value, "databaseType");
            return (Criteria) this;
        }

        public Criteria andDatabaseTypeLessThanOrEqualTo(String value) {
            addCriterion("DATABASE_TYPE <=", value, "databaseType");
            return (Criteria) this;
        }

        public Criteria andDatabaseTypeLike(String value) {
            addCriterion("DATABASE_TYPE like", value, "databaseType");
            return (Criteria) this;
        }

        public Criteria andDatabaseTypeNotLike(String value) {
            addCriterion("DATABASE_TYPE not like", value, "databaseType");
            return (Criteria) this;
        }

        public Criteria andDatabaseTypeIn(List<String> values) {
            addCriterion("DATABASE_TYPE in", values, "databaseType");
            return (Criteria) this;
        }

        public Criteria andDatabaseTypeNotIn(List<String> values) {
            addCriterion("DATABASE_TYPE not in", values, "databaseType");
            return (Criteria) this;
        }

        public Criteria andDatabaseTypeBetween(String value1, String value2) {
            addCriterion("DATABASE_TYPE between", value1, value2, "databaseType");
            return (Criteria) this;
        }

        public Criteria andDatabaseTypeNotBetween(String value1, String value2) {
            addCriterion("DATABASE_TYPE not between", value1, value2, "databaseType");
            return (Criteria) this;
        }

        public Criteria andDatabaseLoginNameIsNull() {
            addCriterion("DATABASE_LOGIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDatabaseLoginNameIsNotNull() {
            addCriterion("DATABASE_LOGIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDatabaseLoginNameEqualTo(String value) {
            addCriterion("DATABASE_LOGIN_NAME =", value, "databaseLoginName");
            return (Criteria) this;
        }

        public Criteria andDatabaseLoginNameNotEqualTo(String value) {
            addCriterion("DATABASE_LOGIN_NAME <>", value, "databaseLoginName");
            return (Criteria) this;
        }

        public Criteria andDatabaseLoginNameGreaterThan(String value) {
            addCriterion("DATABASE_LOGIN_NAME >", value, "databaseLoginName");
            return (Criteria) this;
        }

        public Criteria andDatabaseLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("DATABASE_LOGIN_NAME >=", value, "databaseLoginName");
            return (Criteria) this;
        }

        public Criteria andDatabaseLoginNameLessThan(String value) {
            addCriterion("DATABASE_LOGIN_NAME <", value, "databaseLoginName");
            return (Criteria) this;
        }

        public Criteria andDatabaseLoginNameLessThanOrEqualTo(String value) {
            addCriterion("DATABASE_LOGIN_NAME <=", value, "databaseLoginName");
            return (Criteria) this;
        }

        public Criteria andDatabaseLoginNameLike(String value) {
            addCriterion("DATABASE_LOGIN_NAME like", value, "databaseLoginName");
            return (Criteria) this;
        }

        public Criteria andDatabaseLoginNameNotLike(String value) {
            addCriterion("DATABASE_LOGIN_NAME not like", value, "databaseLoginName");
            return (Criteria) this;
        }

        public Criteria andDatabaseLoginNameIn(List<String> values) {
            addCriterion("DATABASE_LOGIN_NAME in", values, "databaseLoginName");
            return (Criteria) this;
        }

        public Criteria andDatabaseLoginNameNotIn(List<String> values) {
            addCriterion("DATABASE_LOGIN_NAME not in", values, "databaseLoginName");
            return (Criteria) this;
        }

        public Criteria andDatabaseLoginNameBetween(String value1, String value2) {
            addCriterion("DATABASE_LOGIN_NAME between", value1, value2, "databaseLoginName");
            return (Criteria) this;
        }

        public Criteria andDatabaseLoginNameNotBetween(String value1, String value2) {
            addCriterion("DATABASE_LOGIN_NAME not between", value1, value2, "databaseLoginName");
            return (Criteria) this;
        }

        public Criteria andDatabaseLoginPasswordIsNull() {
            addCriterion("DATABASE_LOGIN_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andDatabaseLoginPasswordIsNotNull() {
            addCriterion("DATABASE_LOGIN_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andDatabaseLoginPasswordEqualTo(String value) {
            addCriterion("DATABASE_LOGIN_PASSWORD =", value, "databaseLoginPassword");
            return (Criteria) this;
        }

        public Criteria andDatabaseLoginPasswordNotEqualTo(String value) {
            addCriterion("DATABASE_LOGIN_PASSWORD <>", value, "databaseLoginPassword");
            return (Criteria) this;
        }

        public Criteria andDatabaseLoginPasswordGreaterThan(String value) {
            addCriterion("DATABASE_LOGIN_PASSWORD >", value, "databaseLoginPassword");
            return (Criteria) this;
        }

        public Criteria andDatabaseLoginPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("DATABASE_LOGIN_PASSWORD >=", value, "databaseLoginPassword");
            return (Criteria) this;
        }

        public Criteria andDatabaseLoginPasswordLessThan(String value) {
            addCriterion("DATABASE_LOGIN_PASSWORD <", value, "databaseLoginPassword");
            return (Criteria) this;
        }

        public Criteria andDatabaseLoginPasswordLessThanOrEqualTo(String value) {
            addCriterion("DATABASE_LOGIN_PASSWORD <=", value, "databaseLoginPassword");
            return (Criteria) this;
        }

        public Criteria andDatabaseLoginPasswordLike(String value) {
            addCriterion("DATABASE_LOGIN_PASSWORD like", value, "databaseLoginPassword");
            return (Criteria) this;
        }

        public Criteria andDatabaseLoginPasswordNotLike(String value) {
            addCriterion("DATABASE_LOGIN_PASSWORD not like", value, "databaseLoginPassword");
            return (Criteria) this;
        }

        public Criteria andDatabaseLoginPasswordIn(List<String> values) {
            addCriterion("DATABASE_LOGIN_PASSWORD in", values, "databaseLoginPassword");
            return (Criteria) this;
        }

        public Criteria andDatabaseLoginPasswordNotIn(List<String> values) {
            addCriterion("DATABASE_LOGIN_PASSWORD not in", values, "databaseLoginPassword");
            return (Criteria) this;
        }

        public Criteria andDatabaseLoginPasswordBetween(String value1, String value2) {
            addCriterion("DATABASE_LOGIN_PASSWORD between", value1, value2, "databaseLoginPassword");
            return (Criteria) this;
        }

        public Criteria andDatabaseLoginPasswordNotBetween(String value1, String value2) {
            addCriterion("DATABASE_LOGIN_PASSWORD not between", value1, value2, "databaseLoginPassword");
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

        public Criteria andIsDelIsNull() {
            addCriterion("IS_DEL is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("IS_DEL is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(String value) {
            addCriterion("IS_DEL =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(String value) {
            addCriterion("IS_DEL <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(String value) {
            addCriterion("IS_DEL >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DEL >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(String value) {
            addCriterion("IS_DEL <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(String value) {
            addCriterion("IS_DEL <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLike(String value) {
            addCriterion("IS_DEL like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotLike(String value) {
            addCriterion("IS_DEL not like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<String> values) {
            addCriterion("IS_DEL in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<String> values) {
            addCriterion("IS_DEL not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(String value1, String value2) {
            addCriterion("IS_DEL between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(String value1, String value2) {
            addCriterion("IS_DEL not between", value1, value2, "isDel");
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

        public Criteria andOperationIpIsNull() {
            addCriterion("OPERATION_IP is null");
            return (Criteria) this;
        }

        public Criteria andOperationIpIsNotNull() {
            addCriterion("OPERATION_IP is not null");
            return (Criteria) this;
        }

        public Criteria andOperationIpEqualTo(String value) {
            addCriterion("OPERATION_IP =", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpNotEqualTo(String value) {
            addCriterion("OPERATION_IP <>", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpGreaterThan(String value) {
            addCriterion("OPERATION_IP >", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATION_IP >=", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpLessThan(String value) {
            addCriterion("OPERATION_IP <", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpLessThanOrEqualTo(String value) {
            addCriterion("OPERATION_IP <=", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpLike(String value) {
            addCriterion("OPERATION_IP like", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpNotLike(String value) {
            addCriterion("OPERATION_IP not like", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpIn(List<String> values) {
            addCriterion("OPERATION_IP in", values, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpNotIn(List<String> values) {
            addCriterion("OPERATION_IP not in", values, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpBetween(String value1, String value2) {
            addCriterion("OPERATION_IP between", value1, value2, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpNotBetween(String value1, String value2) {
            addCriterion("OPERATION_IP not between", value1, value2, "operationIp");
            return (Criteria) this;
        }

        public Criteria andDirectoryPrefixIsNull() {
            addCriterion("DIRECTORY_PREFIX is null");
            return (Criteria) this;
        }

        public Criteria andDirectoryPrefixIsNotNull() {
            addCriterion("DIRECTORY_PREFIX is not null");
            return (Criteria) this;
        }

        public Criteria andDirectoryPrefixEqualTo(String value) {
            addCriterion("DIRECTORY_PREFIX =", value, "directoryPrefix");
            return (Criteria) this;
        }

        public Criteria andDirectoryPrefixNotEqualTo(String value) {
            addCriterion("DIRECTORY_PREFIX <>", value, "directoryPrefix");
            return (Criteria) this;
        }

        public Criteria andDirectoryPrefixGreaterThan(String value) {
            addCriterion("DIRECTORY_PREFIX >", value, "directoryPrefix");
            return (Criteria) this;
        }

        public Criteria andDirectoryPrefixGreaterThanOrEqualTo(String value) {
            addCriterion("DIRECTORY_PREFIX >=", value, "directoryPrefix");
            return (Criteria) this;
        }

        public Criteria andDirectoryPrefixLessThan(String value) {
            addCriterion("DIRECTORY_PREFIX <", value, "directoryPrefix");
            return (Criteria) this;
        }

        public Criteria andDirectoryPrefixLessThanOrEqualTo(String value) {
            addCriterion("DIRECTORY_PREFIX <=", value, "directoryPrefix");
            return (Criteria) this;
        }

        public Criteria andDirectoryPrefixLike(String value) {
            addCriterion("DIRECTORY_PREFIX like", value, "directoryPrefix");
            return (Criteria) this;
        }

        public Criteria andDirectoryPrefixNotLike(String value) {
            addCriterion("DIRECTORY_PREFIX not like", value, "directoryPrefix");
            return (Criteria) this;
        }

        public Criteria andDirectoryPrefixIn(List<String> values) {
            addCriterion("DIRECTORY_PREFIX in", values, "directoryPrefix");
            return (Criteria) this;
        }

        public Criteria andDirectoryPrefixNotIn(List<String> values) {
            addCriterion("DIRECTORY_PREFIX not in", values, "directoryPrefix");
            return (Criteria) this;
        }

        public Criteria andDirectoryPrefixBetween(String value1, String value2) {
            addCriterion("DIRECTORY_PREFIX between", value1, value2, "directoryPrefix");
            return (Criteria) this;
        }

        public Criteria andDirectoryPrefixNotBetween(String value1, String value2) {
            addCriterion("DIRECTORY_PREFIX not between", value1, value2, "directoryPrefix");
            return (Criteria) this;
        }

        public Criteria andPacketTypeIsNull() {
            addCriterion("PACKET_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPacketTypeIsNotNull() {
            addCriterion("PACKET_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPacketTypeEqualTo(String value) {
            addCriterion("PACKET_TYPE =", value, "packetType");
            return (Criteria) this;
        }

        public Criteria andPacketTypeNotEqualTo(String value) {
            addCriterion("PACKET_TYPE <>", value, "packetType");
            return (Criteria) this;
        }

        public Criteria andPacketTypeGreaterThan(String value) {
            addCriterion("PACKET_TYPE >", value, "packetType");
            return (Criteria) this;
        }

        public Criteria andPacketTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PACKET_TYPE >=", value, "packetType");
            return (Criteria) this;
        }

        public Criteria andPacketTypeLessThan(String value) {
            addCriterion("PACKET_TYPE <", value, "packetType");
            return (Criteria) this;
        }

        public Criteria andPacketTypeLessThanOrEqualTo(String value) {
            addCriterion("PACKET_TYPE <=", value, "packetType");
            return (Criteria) this;
        }

        public Criteria andPacketTypeLike(String value) {
            addCriterion("PACKET_TYPE like", value, "packetType");
            return (Criteria) this;
        }

        public Criteria andPacketTypeNotLike(String value) {
            addCriterion("PACKET_TYPE not like", value, "packetType");
            return (Criteria) this;
        }

        public Criteria andPacketTypeIn(List<String> values) {
            addCriterion("PACKET_TYPE in", values, "packetType");
            return (Criteria) this;
        }

        public Criteria andPacketTypeNotIn(List<String> values) {
            addCriterion("PACKET_TYPE not in", values, "packetType");
            return (Criteria) this;
        }

        public Criteria andPacketTypeBetween(String value1, String value2) {
            addCriterion("PACKET_TYPE between", value1, value2, "packetType");
            return (Criteria) this;
        }

        public Criteria andPacketTypeNotBetween(String value1, String value2) {
            addCriterion("PACKET_TYPE not between", value1, value2, "packetType");
            return (Criteria) this;
        }

        public Criteria andPacketAddressIsNull() {
            addCriterion("PACKET_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andPacketAddressIsNotNull() {
            addCriterion("PACKET_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andPacketAddressEqualTo(String value) {
            addCriterion("PACKET_ADDRESS =", value, "packetAddress");
            return (Criteria) this;
        }

        public Criteria andPacketAddressNotEqualTo(String value) {
            addCriterion("PACKET_ADDRESS <>", value, "packetAddress");
            return (Criteria) this;
        }

        public Criteria andPacketAddressGreaterThan(String value) {
            addCriterion("PACKET_ADDRESS >", value, "packetAddress");
            return (Criteria) this;
        }

        public Criteria andPacketAddressGreaterThanOrEqualTo(String value) {
            addCriterion("PACKET_ADDRESS >=", value, "packetAddress");
            return (Criteria) this;
        }

        public Criteria andPacketAddressLessThan(String value) {
            addCriterion("PACKET_ADDRESS <", value, "packetAddress");
            return (Criteria) this;
        }

        public Criteria andPacketAddressLessThanOrEqualTo(String value) {
            addCriterion("PACKET_ADDRESS <=", value, "packetAddress");
            return (Criteria) this;
        }

        public Criteria andPacketAddressLike(String value) {
            addCriterion("PACKET_ADDRESS like", value, "packetAddress");
            return (Criteria) this;
        }

        public Criteria andPacketAddressNotLike(String value) {
            addCriterion("PACKET_ADDRESS not like", value, "packetAddress");
            return (Criteria) this;
        }

        public Criteria andPacketAddressIn(List<String> values) {
            addCriterion("PACKET_ADDRESS in", values, "packetAddress");
            return (Criteria) this;
        }

        public Criteria andPacketAddressNotIn(List<String> values) {
            addCriterion("PACKET_ADDRESS not in", values, "packetAddress");
            return (Criteria) this;
        }

        public Criteria andPacketAddressBetween(String value1, String value2) {
            addCriterion("PACKET_ADDRESS between", value1, value2, "packetAddress");
            return (Criteria) this;
        }

        public Criteria andPacketAddressNotBetween(String value1, String value2) {
            addCriterion("PACKET_ADDRESS not between", value1, value2, "packetAddress");
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