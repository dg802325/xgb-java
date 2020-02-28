package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LshCircsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LshCircsExample() {
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

        public Criteria andChengyuanxuhaoIsNull() {
            addCriterion("CHENGYUANXUHAO is null");
            return (Criteria) this;
        }

        public Criteria andChengyuanxuhaoIsNotNull() {
            addCriterion("CHENGYUANXUHAO is not null");
            return (Criteria) this;
        }

        public Criteria andChengyuanxuhaoEqualTo(String value) {
            addCriterion("CHENGYUANXUHAO =", value, "chengyuanxuhao");
            return (Criteria) this;
        }

        public Criteria andChengyuanxuhaoNotEqualTo(String value) {
            addCriterion("CHENGYUANXUHAO <>", value, "chengyuanxuhao");
            return (Criteria) this;
        }

        public Criteria andChengyuanxuhaoGreaterThan(String value) {
            addCriterion("CHENGYUANXUHAO >", value, "chengyuanxuhao");
            return (Criteria) this;
        }

        public Criteria andChengyuanxuhaoGreaterThanOrEqualTo(String value) {
            addCriterion("CHENGYUANXUHAO >=", value, "chengyuanxuhao");
            return (Criteria) this;
        }

        public Criteria andChengyuanxuhaoLessThan(String value) {
            addCriterion("CHENGYUANXUHAO <", value, "chengyuanxuhao");
            return (Criteria) this;
        }

        public Criteria andChengyuanxuhaoLessThanOrEqualTo(String value) {
            addCriterion("CHENGYUANXUHAO <=", value, "chengyuanxuhao");
            return (Criteria) this;
        }

        public Criteria andChengyuanxuhaoLike(String value) {
            addCriterion("CHENGYUANXUHAO like", value, "chengyuanxuhao");
            return (Criteria) this;
        }

        public Criteria andChengyuanxuhaoNotLike(String value) {
            addCriterion("CHENGYUANXUHAO not like", value, "chengyuanxuhao");
            return (Criteria) this;
        }

        public Criteria andChengyuanxuhaoIn(List<String> values) {
            addCriterion("CHENGYUANXUHAO in", values, "chengyuanxuhao");
            return (Criteria) this;
        }

        public Criteria andChengyuanxuhaoNotIn(List<String> values) {
            addCriterion("CHENGYUANXUHAO not in", values, "chengyuanxuhao");
            return (Criteria) this;
        }

        public Criteria andChengyuanxuhaoBetween(String value1, String value2) {
            addCriterion("CHENGYUANXUHAO between", value1, value2, "chengyuanxuhao");
            return (Criteria) this;
        }

        public Criteria andChengyuanxuhaoNotBetween(String value1, String value2) {
            addCriterion("CHENGYUANXUHAO not between", value1, value2, "chengyuanxuhao");
            return (Criteria) this;
        }

        public Criteria andChengyuanxingmingIsNull() {
            addCriterion("CHENGYUANXINGMING is null");
            return (Criteria) this;
        }

        public Criteria andChengyuanxingmingIsNotNull() {
            addCriterion("CHENGYUANXINGMING is not null");
            return (Criteria) this;
        }

        public Criteria andChengyuanxingmingEqualTo(String value) {
            addCriterion("CHENGYUANXINGMING =", value, "chengyuanxingming");
            return (Criteria) this;
        }

        public Criteria andChengyuanxingmingNotEqualTo(String value) {
            addCriterion("CHENGYUANXINGMING <>", value, "chengyuanxingming");
            return (Criteria) this;
        }

        public Criteria andChengyuanxingmingGreaterThan(String value) {
            addCriterion("CHENGYUANXINGMING >", value, "chengyuanxingming");
            return (Criteria) this;
        }

        public Criteria andChengyuanxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("CHENGYUANXINGMING >=", value, "chengyuanxingming");
            return (Criteria) this;
        }

        public Criteria andChengyuanxingmingLessThan(String value) {
            addCriterion("CHENGYUANXINGMING <", value, "chengyuanxingming");
            return (Criteria) this;
        }

        public Criteria andChengyuanxingmingLessThanOrEqualTo(String value) {
            addCriterion("CHENGYUANXINGMING <=", value, "chengyuanxingming");
            return (Criteria) this;
        }

        public Criteria andChengyuanxingmingLike(String value) {
            addCriterion("CHENGYUANXINGMING like", value, "chengyuanxingming");
            return (Criteria) this;
        }

        public Criteria andChengyuanxingmingNotLike(String value) {
            addCriterion("CHENGYUANXINGMING not like", value, "chengyuanxingming");
            return (Criteria) this;
        }

        public Criteria andChengyuanxingmingIn(List<String> values) {
            addCriterion("CHENGYUANXINGMING in", values, "chengyuanxingming");
            return (Criteria) this;
        }

        public Criteria andChengyuanxingmingNotIn(List<String> values) {
            addCriterion("CHENGYUANXINGMING not in", values, "chengyuanxingming");
            return (Criteria) this;
        }

        public Criteria andChengyuanxingmingBetween(String value1, String value2) {
            addCriterion("CHENGYUANXINGMING between", value1, value2, "chengyuanxingming");
            return (Criteria) this;
        }

        public Criteria andChengyuanxingmingNotBetween(String value1, String value2) {
            addCriterion("CHENGYUANXINGMING not between", value1, value2, "chengyuanxingming");
            return (Criteria) this;
        }

        public Criteria andShengriIsNull() {
            addCriterion("SHENGRI is null");
            return (Criteria) this;
        }

        public Criteria andShengriIsNotNull() {
            addCriterion("SHENGRI is not null");
            return (Criteria) this;
        }

        public Criteria andShengriEqualTo(Date value) {
            addCriterion("SHENGRI =", value, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriNotEqualTo(Date value) {
            addCriterion("SHENGRI <>", value, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriGreaterThan(Date value) {
            addCriterion("SHENGRI >", value, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriGreaterThanOrEqualTo(Date value) {
            addCriterion("SHENGRI >=", value, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriLessThan(Date value) {
            addCriterion("SHENGRI <", value, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriLessThanOrEqualTo(Date value) {
            addCriterion("SHENGRI <=", value, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriIn(List<Date> values) {
            addCriterion("SHENGRI in", values, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriNotIn(List<Date> values) {
            addCriterion("SHENGRI not in", values, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriBetween(Date value1, Date value2) {
            addCriterion("SHENGRI between", value1, value2, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriNotBetween(Date value1, Date value2) {
            addCriterion("SHENGRI not between", value1, value2, "shengri");
            return (Criteria) this;
        }

        public Criteria andZhiwuIsNull() {
            addCriterion("ZHIWU is null");
            return (Criteria) this;
        }

        public Criteria andZhiwuIsNotNull() {
            addCriterion("ZHIWU is not null");
            return (Criteria) this;
        }

        public Criteria andZhiwuEqualTo(String value) {
            addCriterion("ZHIWU =", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuNotEqualTo(String value) {
            addCriterion("ZHIWU <>", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuGreaterThan(String value) {
            addCriterion("ZHIWU >", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuGreaterThanOrEqualTo(String value) {
            addCriterion("ZHIWU >=", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuLessThan(String value) {
            addCriterion("ZHIWU <", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuLessThanOrEqualTo(String value) {
            addCriterion("ZHIWU <=", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuLike(String value) {
            addCriterion("ZHIWU like", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuNotLike(String value) {
            addCriterion("ZHIWU not like", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuIn(List<String> values) {
            addCriterion("ZHIWU in", values, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuNotIn(List<String> values) {
            addCriterion("ZHIWU not in", values, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuBetween(String value1, String value2) {
            addCriterion("ZHIWU between", value1, value2, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuNotBetween(String value1, String value2) {
            addCriterion("ZHIWU not between", value1, value2, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andHuiyicishuIsNull() {
            addCriterion("HUIYICISHU is null");
            return (Criteria) this;
        }

        public Criteria andHuiyicishuIsNotNull() {
            addCriterion("HUIYICISHU is not null");
            return (Criteria) this;
        }

        public Criteria andHuiyicishuEqualTo(Integer value) {
            addCriterion("HUIYICISHU =", value, "huiyicishu");
            return (Criteria) this;
        }

        public Criteria andHuiyicishuNotEqualTo(Integer value) {
            addCriterion("HUIYICISHU <>", value, "huiyicishu");
            return (Criteria) this;
        }

        public Criteria andHuiyicishuGreaterThan(Integer value) {
            addCriterion("HUIYICISHU >", value, "huiyicishu");
            return (Criteria) this;
        }

        public Criteria andHuiyicishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("HUIYICISHU >=", value, "huiyicishu");
            return (Criteria) this;
        }

        public Criteria andHuiyicishuLessThan(Integer value) {
            addCriterion("HUIYICISHU <", value, "huiyicishu");
            return (Criteria) this;
        }

        public Criteria andHuiyicishuLessThanOrEqualTo(Integer value) {
            addCriterion("HUIYICISHU <=", value, "huiyicishu");
            return (Criteria) this;
        }

        public Criteria andHuiyicishuIn(List<Integer> values) {
            addCriterion("HUIYICISHU in", values, "huiyicishu");
            return (Criteria) this;
        }

        public Criteria andHuiyicishuNotIn(List<Integer> values) {
            addCriterion("HUIYICISHU not in", values, "huiyicishu");
            return (Criteria) this;
        }

        public Criteria andHuiyicishuBetween(Integer value1, Integer value2) {
            addCriterion("HUIYICISHU between", value1, value2, "huiyicishu");
            return (Criteria) this;
        }

        public Criteria andHuiyicishuNotBetween(Integer value1, Integer value2) {
            addCriterion("HUIYICISHU not between", value1, value2, "huiyicishu");
            return (Criteria) this;
        }

        public Criteria andBaochouIsNull() {
            addCriterion("BAOCHOU is null");
            return (Criteria) this;
        }

        public Criteria andBaochouIsNotNull() {
            addCriterion("BAOCHOU is not null");
            return (Criteria) this;
        }

        public Criteria andBaochouEqualTo(BigDecimal value) {
            addCriterion("BAOCHOU =", value, "baochou");
            return (Criteria) this;
        }

        public Criteria andBaochouNotEqualTo(BigDecimal value) {
            addCriterion("BAOCHOU <>", value, "baochou");
            return (Criteria) this;
        }

        public Criteria andBaochouGreaterThan(BigDecimal value) {
            addCriterion("BAOCHOU >", value, "baochou");
            return (Criteria) this;
        }

        public Criteria andBaochouGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BAOCHOU >=", value, "baochou");
            return (Criteria) this;
        }

        public Criteria andBaochouLessThan(BigDecimal value) {
            addCriterion("BAOCHOU <", value, "baochou");
            return (Criteria) this;
        }

        public Criteria andBaochouLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BAOCHOU <=", value, "baochou");
            return (Criteria) this;
        }

        public Criteria andBaochouIn(List<BigDecimal> values) {
            addCriterion("BAOCHOU in", values, "baochou");
            return (Criteria) this;
        }

        public Criteria andBaochouNotIn(List<BigDecimal> values) {
            addCriterion("BAOCHOU not in", values, "baochou");
            return (Criteria) this;
        }

        public Criteria andBaochouBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BAOCHOU between", value1, value2, "baochou");
            return (Criteria) this;
        }

        public Criteria andBaochouNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BAOCHOU not between", value1, value2, "baochou");
            return (Criteria) this;
        }

        public Criteria andJintieIsNull() {
            addCriterion("JINTIE is null");
            return (Criteria) this;
        }

        public Criteria andJintieIsNotNull() {
            addCriterion("JINTIE is not null");
            return (Criteria) this;
        }

        public Criteria andJintieEqualTo(BigDecimal value) {
            addCriterion("JINTIE =", value, "jintie");
            return (Criteria) this;
        }

        public Criteria andJintieNotEqualTo(BigDecimal value) {
            addCriterion("JINTIE <>", value, "jintie");
            return (Criteria) this;
        }

        public Criteria andJintieGreaterThan(BigDecimal value) {
            addCriterion("JINTIE >", value, "jintie");
            return (Criteria) this;
        }

        public Criteria andJintieGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JINTIE >=", value, "jintie");
            return (Criteria) this;
        }

        public Criteria andJintieLessThan(BigDecimal value) {
            addCriterion("JINTIE <", value, "jintie");
            return (Criteria) this;
        }

        public Criteria andJintieLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JINTIE <=", value, "jintie");
            return (Criteria) this;
        }

        public Criteria andJintieIn(List<BigDecimal> values) {
            addCriterion("JINTIE in", values, "jintie");
            return (Criteria) this;
        }

        public Criteria andJintieNotIn(List<BigDecimal> values) {
            addCriterion("JINTIE not in", values, "jintie");
            return (Criteria) this;
        }

        public Criteria andJintieBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JINTIE between", value1, value2, "jintie");
            return (Criteria) this;
        }

        public Criteria andJintieNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JINTIE not between", value1, value2, "jintie");
            return (Criteria) this;
        }

        public Criteria andXingbieIsNull() {
            addCriterion("XINGBIE is null");
            return (Criteria) this;
        }

        public Criteria andXingbieIsNotNull() {
            addCriterion("XINGBIE is not null");
            return (Criteria) this;
        }

        public Criteria andXingbieEqualTo(Short value) {
            addCriterion("XINGBIE =", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieNotEqualTo(Short value) {
            addCriterion("XINGBIE <>", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieGreaterThan(Short value) {
            addCriterion("XINGBIE >", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieGreaterThanOrEqualTo(Short value) {
            addCriterion("XINGBIE >=", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieLessThan(Short value) {
            addCriterion("XINGBIE <", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieLessThanOrEqualTo(Short value) {
            addCriterion("XINGBIE <=", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieIn(List<Short> values) {
            addCriterion("XINGBIE in", values, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieNotIn(List<Short> values) {
            addCriterion("XINGBIE not in", values, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieBetween(Short value1, Short value2) {
            addCriterion("XINGBIE between", value1, value2, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieNotBetween(Short value1, Short value2) {
            addCriterion("XINGBIE not between", value1, value2, "xingbie");
            return (Criteria) this;
        }

        public Criteria andBeianshijianIsNull() {
            addCriterion("BEIANSHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andBeianshijianIsNotNull() {
            addCriterion("BEIANSHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andBeianshijianEqualTo(Date value) {
            addCriterion("BEIANSHIJIAN =", value, "beianshijian");
            return (Criteria) this;
        }

        public Criteria andBeianshijianNotEqualTo(Date value) {
            addCriterion("BEIANSHIJIAN <>", value, "beianshijian");
            return (Criteria) this;
        }

        public Criteria andBeianshijianGreaterThan(Date value) {
            addCriterion("BEIANSHIJIAN >", value, "beianshijian");
            return (Criteria) this;
        }

        public Criteria andBeianshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("BEIANSHIJIAN >=", value, "beianshijian");
            return (Criteria) this;
        }

        public Criteria andBeianshijianLessThan(Date value) {
            addCriterion("BEIANSHIJIAN <", value, "beianshijian");
            return (Criteria) this;
        }

        public Criteria andBeianshijianLessThanOrEqualTo(Date value) {
            addCriterion("BEIANSHIJIAN <=", value, "beianshijian");
            return (Criteria) this;
        }

        public Criteria andBeianshijianIn(List<Date> values) {
            addCriterion("BEIANSHIJIAN in", values, "beianshijian");
            return (Criteria) this;
        }

        public Criteria andBeianshijianNotIn(List<Date> values) {
            addCriterion("BEIANSHIJIAN not in", values, "beianshijian");
            return (Criteria) this;
        }

        public Criteria andBeianshijianBetween(Date value1, Date value2) {
            addCriterion("BEIANSHIJIAN between", value1, value2, "beianshijian");
            return (Criteria) this;
        }

        public Criteria andBeianshijianNotBetween(Date value1, Date value2) {
            addCriterion("BEIANSHIJIAN not between", value1, value2, "beianshijian");
            return (Criteria) this;
        }

        public Criteria andBaochoushiyouIsNull() {
            addCriterion("BAOCHOUSHIYOU is null");
            return (Criteria) this;
        }

        public Criteria andBaochoushiyouIsNotNull() {
            addCriterion("BAOCHOUSHIYOU is not null");
            return (Criteria) this;
        }

        public Criteria andBaochoushiyouEqualTo(String value) {
            addCriterion("BAOCHOUSHIYOU =", value, "baochoushiyou");
            return (Criteria) this;
        }

        public Criteria andBaochoushiyouNotEqualTo(String value) {
            addCriterion("BAOCHOUSHIYOU <>", value, "baochoushiyou");
            return (Criteria) this;
        }

        public Criteria andBaochoushiyouGreaterThan(String value) {
            addCriterion("BAOCHOUSHIYOU >", value, "baochoushiyou");
            return (Criteria) this;
        }

        public Criteria andBaochoushiyouGreaterThanOrEqualTo(String value) {
            addCriterion("BAOCHOUSHIYOU >=", value, "baochoushiyou");
            return (Criteria) this;
        }

        public Criteria andBaochoushiyouLessThan(String value) {
            addCriterion("BAOCHOUSHIYOU <", value, "baochoushiyou");
            return (Criteria) this;
        }

        public Criteria andBaochoushiyouLessThanOrEqualTo(String value) {
            addCriterion("BAOCHOUSHIYOU <=", value, "baochoushiyou");
            return (Criteria) this;
        }

        public Criteria andBaochoushiyouLike(String value) {
            addCriterion("BAOCHOUSHIYOU like", value, "baochoushiyou");
            return (Criteria) this;
        }

        public Criteria andBaochoushiyouNotLike(String value) {
            addCriterion("BAOCHOUSHIYOU not like", value, "baochoushiyou");
            return (Criteria) this;
        }

        public Criteria andBaochoushiyouIn(List<String> values) {
            addCriterion("BAOCHOUSHIYOU in", values, "baochoushiyou");
            return (Criteria) this;
        }

        public Criteria andBaochoushiyouNotIn(List<String> values) {
            addCriterion("BAOCHOUSHIYOU not in", values, "baochoushiyou");
            return (Criteria) this;
        }

        public Criteria andBaochoushiyouBetween(String value1, String value2) {
            addCriterion("BAOCHOUSHIYOU between", value1, value2, "baochoushiyou");
            return (Criteria) this;
        }

        public Criteria andBaochoushiyouNotBetween(String value1, String value2) {
            addCriterion("BAOCHOUSHIYOU not between", value1, value2, "baochoushiyou");
            return (Criteria) this;
        }

        public Criteria andZiIsNull() {
            addCriterion("ZI is null");
            return (Criteria) this;
        }

        public Criteria andZiIsNotNull() {
            addCriterion("ZI is not null");
            return (Criteria) this;
        }

        public Criteria andZiEqualTo(Date value) {
            addCriterion("ZI =", value, "zi");
            return (Criteria) this;
        }

        public Criteria andZiNotEqualTo(Date value) {
            addCriterion("ZI <>", value, "zi");
            return (Criteria) this;
        }

        public Criteria andZiGreaterThan(Date value) {
            addCriterion("ZI >", value, "zi");
            return (Criteria) this;
        }

        public Criteria andZiGreaterThanOrEqualTo(Date value) {
            addCriterion("ZI >=", value, "zi");
            return (Criteria) this;
        }

        public Criteria andZiLessThan(Date value) {
            addCriterion("ZI <", value, "zi");
            return (Criteria) this;
        }

        public Criteria andZiLessThanOrEqualTo(Date value) {
            addCriterion("ZI <=", value, "zi");
            return (Criteria) this;
        }

        public Criteria andZiIn(List<Date> values) {
            addCriterion("ZI in", values, "zi");
            return (Criteria) this;
        }

        public Criteria andZiNotIn(List<Date> values) {
            addCriterion("ZI not in", values, "zi");
            return (Criteria) this;
        }

        public Criteria andZiBetween(Date value1, Date value2) {
            addCriterion("ZI between", value1, value2, "zi");
            return (Criteria) this;
        }

        public Criteria andZiNotBetween(Date value1, Date value2) {
            addCriterion("ZI not between", value1, value2, "zi");
            return (Criteria) this;
        }

        public Criteria andZhiIsNull() {
            addCriterion("ZHI is null");
            return (Criteria) this;
        }

        public Criteria andZhiIsNotNull() {
            addCriterion("ZHI is not null");
            return (Criteria) this;
        }

        public Criteria andZhiEqualTo(Date value) {
            addCriterion("ZHI =", value, "zhi");
            return (Criteria) this;
        }

        public Criteria andZhiNotEqualTo(Date value) {
            addCriterion("ZHI <>", value, "zhi");
            return (Criteria) this;
        }

        public Criteria andZhiGreaterThan(Date value) {
            addCriterion("ZHI >", value, "zhi");
            return (Criteria) this;
        }

        public Criteria andZhiGreaterThanOrEqualTo(Date value) {
            addCriterion("ZHI >=", value, "zhi");
            return (Criteria) this;
        }

        public Criteria andZhiLessThan(Date value) {
            addCriterion("ZHI <", value, "zhi");
            return (Criteria) this;
        }

        public Criteria andZhiLessThanOrEqualTo(Date value) {
            addCriterion("ZHI <=", value, "zhi");
            return (Criteria) this;
        }

        public Criteria andZhiIn(List<Date> values) {
            addCriterion("ZHI in", values, "zhi");
            return (Criteria) this;
        }

        public Criteria andZhiNotIn(List<Date> values) {
            addCriterion("ZHI not in", values, "zhi");
            return (Criteria) this;
        }

        public Criteria andZhiBetween(Date value1, Date value2) {
            addCriterion("ZHI between", value1, value2, "zhi");
            return (Criteria) this;
        }

        public Criteria andZhiNotBetween(Date value1, Date value2) {
            addCriterion("ZHI not between", value1, value2, "zhi");
            return (Criteria) this;
        }

        public Criteria andIfdangIsNull() {
            addCriterion("IFDANG is null");
            return (Criteria) this;
        }

        public Criteria andIfdangIsNotNull() {
            addCriterion("IFDANG is not null");
            return (Criteria) this;
        }

        public Criteria andIfdangEqualTo(String value) {
            addCriterion("IFDANG =", value, "ifdang");
            return (Criteria) this;
        }

        public Criteria andIfdangNotEqualTo(String value) {
            addCriterion("IFDANG <>", value, "ifdang");
            return (Criteria) this;
        }

        public Criteria andIfdangGreaterThan(String value) {
            addCriterion("IFDANG >", value, "ifdang");
            return (Criteria) this;
        }

        public Criteria andIfdangGreaterThanOrEqualTo(String value) {
            addCriterion("IFDANG >=", value, "ifdang");
            return (Criteria) this;
        }

        public Criteria andIfdangLessThan(String value) {
            addCriterion("IFDANG <", value, "ifdang");
            return (Criteria) this;
        }

        public Criteria andIfdangLessThanOrEqualTo(String value) {
            addCriterion("IFDANG <=", value, "ifdang");
            return (Criteria) this;
        }

        public Criteria andIfdangLike(String value) {
            addCriterion("IFDANG like", value, "ifdang");
            return (Criteria) this;
        }

        public Criteria andIfdangNotLike(String value) {
            addCriterion("IFDANG not like", value, "ifdang");
            return (Criteria) this;
        }

        public Criteria andIfdangIn(List<String> values) {
            addCriterion("IFDANG in", values, "ifdang");
            return (Criteria) this;
        }

        public Criteria andIfdangNotIn(List<String> values) {
            addCriterion("IFDANG not in", values, "ifdang");
            return (Criteria) this;
        }

        public Criteria andIfdangBetween(String value1, String value2) {
            addCriterion("IFDANG between", value1, value2, "ifdang");
            return (Criteria) this;
        }

        public Criteria andIfdangNotBetween(String value1, String value2) {
            addCriterion("IFDANG not between", value1, value2, "ifdang");
            return (Criteria) this;
        }

        public Criteria andIftuiliIsNull() {
            addCriterion("IFTUILI is null");
            return (Criteria) this;
        }

        public Criteria andIftuiliIsNotNull() {
            addCriterion("IFTUILI is not null");
            return (Criteria) this;
        }

        public Criteria andIftuiliEqualTo(Short value) {
            addCriterion("IFTUILI =", value, "iftuili");
            return (Criteria) this;
        }

        public Criteria andIftuiliNotEqualTo(Short value) {
            addCriterion("IFTUILI <>", value, "iftuili");
            return (Criteria) this;
        }

        public Criteria andIftuiliGreaterThan(Short value) {
            addCriterion("IFTUILI >", value, "iftuili");
            return (Criteria) this;
        }

        public Criteria andIftuiliGreaterThanOrEqualTo(Short value) {
            addCriterion("IFTUILI >=", value, "iftuili");
            return (Criteria) this;
        }

        public Criteria andIftuiliLessThan(Short value) {
            addCriterion("IFTUILI <", value, "iftuili");
            return (Criteria) this;
        }

        public Criteria andIftuiliLessThanOrEqualTo(Short value) {
            addCriterion("IFTUILI <=", value, "iftuili");
            return (Criteria) this;
        }

        public Criteria andIftuiliIn(List<Short> values) {
            addCriterion("IFTUILI in", values, "iftuili");
            return (Criteria) this;
        }

        public Criteria andIftuiliNotIn(List<Short> values) {
            addCriterion("IFTUILI not in", values, "iftuili");
            return (Criteria) this;
        }

        public Criteria andIftuiliBetween(Short value1, Short value2) {
            addCriterion("IFTUILI between", value1, value2, "iftuili");
            return (Criteria) this;
        }

        public Criteria andIftuiliNotBetween(Short value1, Short value2) {
            addCriterion("IFTUILI not between", value1, value2, "iftuili");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoIsNull() {
            addCriterion("ZHENGZHIMIANMAO is null");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoIsNotNull() {
            addCriterion("ZHENGZHIMIANMAO is not null");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoEqualTo(Long value) {
            addCriterion("ZHENGZHIMIANMAO =", value, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoNotEqualTo(Long value) {
            addCriterion("ZHENGZHIMIANMAO <>", value, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoGreaterThan(Long value) {
            addCriterion("ZHENGZHIMIANMAO >", value, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoGreaterThanOrEqualTo(Long value) {
            addCriterion("ZHENGZHIMIANMAO >=", value, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoLessThan(Long value) {
            addCriterion("ZHENGZHIMIANMAO <", value, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoLessThanOrEqualTo(Long value) {
            addCriterion("ZHENGZHIMIANMAO <=", value, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoIn(List<Long> values) {
            addCriterion("ZHENGZHIMIANMAO in", values, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoNotIn(List<Long> values) {
            addCriterion("ZHENGZHIMIANMAO not in", values, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoBetween(Long value1, Long value2) {
            addCriterion("ZHENGZHIMIANMAO between", value1, value2, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoNotBetween(Long value1, Long value2) {
            addCriterion("ZHENGZHIMIANMAO not between", value1, value2, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("SORT is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("SORT is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Long value) {
            addCriterion("SORT =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Long value) {
            addCriterion("SORT <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Long value) {
            addCriterion("SORT >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Long value) {
            addCriterion("SORT >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Long value) {
            addCriterion("SORT <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Long value) {
            addCriterion("SORT <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Long> values) {
            addCriterion("SORT in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Long> values) {
            addCriterion("SORT not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Long value1, Long value2) {
            addCriterion("SORT between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Long value1, Long value2) {
            addCriterion("SORT not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andGidIsNull() {
            addCriterion("GID is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("GID is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(Long value) {
            addCriterion("GID =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(Long value) {
            addCriterion("GID <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(Long value) {
            addCriterion("GID >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(Long value) {
            addCriterion("GID >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(Long value) {
            addCriterion("GID <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(Long value) {
            addCriterion("GID <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<Long> values) {
            addCriterion("GID in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<Long> values) {
            addCriterion("GID not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(Long value1, Long value2) {
            addCriterion("GID between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(Long value1, Long value2) {
            addCriterion("GID not between", value1, value2, "gid");
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