package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StNjInner4Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StNjInner4Example() {
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

        public Criteria andBiangengmingchengIsNull() {
            addCriterion("BIANGENGMINGCHENG is null");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengIsNotNull() {
            addCriterion("BIANGENGMINGCHENG is not null");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengEqualTo(String value) {
            addCriterion("BIANGENGMINGCHENG =", value, "biangengmingcheng");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengNotEqualTo(String value) {
            addCriterion("BIANGENGMINGCHENG <>", value, "biangengmingcheng");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengGreaterThan(String value) {
            addCriterion("BIANGENGMINGCHENG >", value, "biangengmingcheng");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengGreaterThanOrEqualTo(String value) {
            addCriterion("BIANGENGMINGCHENG >=", value, "biangengmingcheng");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengLessThan(String value) {
            addCriterion("BIANGENGMINGCHENG <", value, "biangengmingcheng");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengLessThanOrEqualTo(String value) {
            addCriterion("BIANGENGMINGCHENG <=", value, "biangengmingcheng");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengLike(String value) {
            addCriterion("BIANGENGMINGCHENG like", value, "biangengmingcheng");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengNotLike(String value) {
            addCriterion("BIANGENGMINGCHENG not like", value, "biangengmingcheng");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengIn(List<String> values) {
            addCriterion("BIANGENGMINGCHENG in", values, "biangengmingcheng");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengNotIn(List<String> values) {
            addCriterion("BIANGENGMINGCHENG not in", values, "biangengmingcheng");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengBetween(String value1, String value2) {
            addCriterion("BIANGENGMINGCHENG between", value1, value2, "biangengmingcheng");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengNotBetween(String value1, String value2) {
            addCriterion("BIANGENGMINGCHENG not between", value1, value2, "biangengmingcheng");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengbanliIsNull() {
            addCriterion("BIANGENGMINGCHENGBANLI is null");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengbanliIsNotNull() {
            addCriterion("BIANGENGMINGCHENGBANLI is not null");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengbanliEqualTo(String value) {
            addCriterion("BIANGENGMINGCHENGBANLI =", value, "biangengmingchengbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengbanliNotEqualTo(String value) {
            addCriterion("BIANGENGMINGCHENGBANLI <>", value, "biangengmingchengbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengbanliGreaterThan(String value) {
            addCriterion("BIANGENGMINGCHENGBANLI >", value, "biangengmingchengbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengbanliGreaterThanOrEqualTo(String value) {
            addCriterion("BIANGENGMINGCHENGBANLI >=", value, "biangengmingchengbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengbanliLessThan(String value) {
            addCriterion("BIANGENGMINGCHENGBANLI <", value, "biangengmingchengbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengbanliLessThanOrEqualTo(String value) {
            addCriterion("BIANGENGMINGCHENGBANLI <=", value, "biangengmingchengbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengbanliLike(String value) {
            addCriterion("BIANGENGMINGCHENGBANLI like", value, "biangengmingchengbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengbanliNotLike(String value) {
            addCriterion("BIANGENGMINGCHENGBANLI not like", value, "biangengmingchengbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengbanliIn(List<String> values) {
            addCriterion("BIANGENGMINGCHENGBANLI in", values, "biangengmingchengbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengbanliNotIn(List<String> values) {
            addCriterion("BIANGENGMINGCHENGBANLI not in", values, "biangengmingchengbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengbanliBetween(String value1, String value2) {
            addCriterion("BIANGENGMINGCHENGBANLI between", value1, value2, "biangengmingchengbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengbanliNotBetween(String value1, String value2) {
            addCriterion("BIANGENGMINGCHENGBANLI not between", value1, value2, "biangengmingchengbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengshijianIsNull() {
            addCriterion("BIANGENGMINGCHENGSHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengshijianIsNotNull() {
            addCriterion("BIANGENGMINGCHENGSHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengshijianEqualTo(Date value) {
            addCriterion("BIANGENGMINGCHENGSHIJIAN =", value, "biangengmingchengshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengshijianNotEqualTo(Date value) {
            addCriterion("BIANGENGMINGCHENGSHIJIAN <>", value, "biangengmingchengshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengshijianGreaterThan(Date value) {
            addCriterion("BIANGENGMINGCHENGSHIJIAN >", value, "biangengmingchengshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("BIANGENGMINGCHENGSHIJIAN >=", value, "biangengmingchengshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengshijianLessThan(Date value) {
            addCriterion("BIANGENGMINGCHENGSHIJIAN <", value, "biangengmingchengshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengshijianLessThanOrEqualTo(Date value) {
            addCriterion("BIANGENGMINGCHENGSHIJIAN <=", value, "biangengmingchengshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengshijianIn(List<Date> values) {
            addCriterion("BIANGENGMINGCHENGSHIJIAN in", values, "biangengmingchengshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengshijianNotIn(List<Date> values) {
            addCriterion("BIANGENGMINGCHENGSHIJIAN not in", values, "biangengmingchengshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengshijianBetween(Date value1, Date value2) {
            addCriterion("BIANGENGMINGCHENGSHIJIAN between", value1, value2, "biangengmingchengshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengmingchengshijianNotBetween(Date value1, Date value2) {
            addCriterion("BIANGENGMINGCHENGSHIJIAN not between", value1, value2, "biangengmingchengshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyuIsNull() {
            addCriterion("BIANGENGDIYU is null");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyuIsNotNull() {
            addCriterion("BIANGENGDIYU is not null");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyuEqualTo(String value) {
            addCriterion("BIANGENGDIYU =", value, "biangengdiyu");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyuNotEqualTo(String value) {
            addCriterion("BIANGENGDIYU <>", value, "biangengdiyu");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyuGreaterThan(String value) {
            addCriterion("BIANGENGDIYU >", value, "biangengdiyu");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyuGreaterThanOrEqualTo(String value) {
            addCriterion("BIANGENGDIYU >=", value, "biangengdiyu");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyuLessThan(String value) {
            addCriterion("BIANGENGDIYU <", value, "biangengdiyu");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyuLessThanOrEqualTo(String value) {
            addCriterion("BIANGENGDIYU <=", value, "biangengdiyu");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyuLike(String value) {
            addCriterion("BIANGENGDIYU like", value, "biangengdiyu");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyuNotLike(String value) {
            addCriterion("BIANGENGDIYU not like", value, "biangengdiyu");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyuIn(List<String> values) {
            addCriterion("BIANGENGDIYU in", values, "biangengdiyu");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyuNotIn(List<String> values) {
            addCriterion("BIANGENGDIYU not in", values, "biangengdiyu");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyuBetween(String value1, String value2) {
            addCriterion("BIANGENGDIYU between", value1, value2, "biangengdiyu");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyuNotBetween(String value1, String value2) {
            addCriterion("BIANGENGDIYU not between", value1, value2, "biangengdiyu");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyubanliIsNull() {
            addCriterion("BIANGENGDIYUBANLI is null");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyubanliIsNotNull() {
            addCriterion("BIANGENGDIYUBANLI is not null");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyubanliEqualTo(String value) {
            addCriterion("BIANGENGDIYUBANLI =", value, "biangengdiyubanli");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyubanliNotEqualTo(String value) {
            addCriterion("BIANGENGDIYUBANLI <>", value, "biangengdiyubanli");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyubanliGreaterThan(String value) {
            addCriterion("BIANGENGDIYUBANLI >", value, "biangengdiyubanli");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyubanliGreaterThanOrEqualTo(String value) {
            addCriterion("BIANGENGDIYUBANLI >=", value, "biangengdiyubanli");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyubanliLessThan(String value) {
            addCriterion("BIANGENGDIYUBANLI <", value, "biangengdiyubanli");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyubanliLessThanOrEqualTo(String value) {
            addCriterion("BIANGENGDIYUBANLI <=", value, "biangengdiyubanli");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyubanliLike(String value) {
            addCriterion("BIANGENGDIYUBANLI like", value, "biangengdiyubanli");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyubanliNotLike(String value) {
            addCriterion("BIANGENGDIYUBANLI not like", value, "biangengdiyubanli");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyubanliIn(List<String> values) {
            addCriterion("BIANGENGDIYUBANLI in", values, "biangengdiyubanli");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyubanliNotIn(List<String> values) {
            addCriterion("BIANGENGDIYUBANLI not in", values, "biangengdiyubanli");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyubanliBetween(String value1, String value2) {
            addCriterion("BIANGENGDIYUBANLI between", value1, value2, "biangengdiyubanli");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyubanliNotBetween(String value1, String value2) {
            addCriterion("BIANGENGDIYUBANLI not between", value1, value2, "biangengdiyubanli");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyushijianIsNull() {
            addCriterion("BIANGENGDIYUSHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyushijianIsNotNull() {
            addCriterion("BIANGENGDIYUSHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyushijianEqualTo(Date value) {
            addCriterion("BIANGENGDIYUSHIJIAN =", value, "biangengdiyushijian");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyushijianNotEqualTo(Date value) {
            addCriterion("BIANGENGDIYUSHIJIAN <>", value, "biangengdiyushijian");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyushijianGreaterThan(Date value) {
            addCriterion("BIANGENGDIYUSHIJIAN >", value, "biangengdiyushijian");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyushijianGreaterThanOrEqualTo(Date value) {
            addCriterion("BIANGENGDIYUSHIJIAN >=", value, "biangengdiyushijian");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyushijianLessThan(Date value) {
            addCriterion("BIANGENGDIYUSHIJIAN <", value, "biangengdiyushijian");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyushijianLessThanOrEqualTo(Date value) {
            addCriterion("BIANGENGDIYUSHIJIAN <=", value, "biangengdiyushijian");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyushijianIn(List<Date> values) {
            addCriterion("BIANGENGDIYUSHIJIAN in", values, "biangengdiyushijian");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyushijianNotIn(List<Date> values) {
            addCriterion("BIANGENGDIYUSHIJIAN not in", values, "biangengdiyushijian");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyushijianBetween(Date value1, Date value2) {
            addCriterion("BIANGENGDIYUSHIJIAN between", value1, value2, "biangengdiyushijian");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyushijianNotBetween(Date value1, Date value2) {
            addCriterion("BIANGENGDIYUSHIJIAN not between", value1, value2, "biangengdiyushijian");
            return (Criteria) this;
        }

        public Criteria andBiangengyewuIsNull() {
            addCriterion("BIANGENGYEWU is null");
            return (Criteria) this;
        }

        public Criteria andBiangengyewuIsNotNull() {
            addCriterion("BIANGENGYEWU is not null");
            return (Criteria) this;
        }

        public Criteria andBiangengyewuEqualTo(String value) {
            addCriterion("BIANGENGYEWU =", value, "biangengyewu");
            return (Criteria) this;
        }

        public Criteria andBiangengyewuNotEqualTo(String value) {
            addCriterion("BIANGENGYEWU <>", value, "biangengyewu");
            return (Criteria) this;
        }

        public Criteria andBiangengyewuGreaterThan(String value) {
            addCriterion("BIANGENGYEWU >", value, "biangengyewu");
            return (Criteria) this;
        }

        public Criteria andBiangengyewuGreaterThanOrEqualTo(String value) {
            addCriterion("BIANGENGYEWU >=", value, "biangengyewu");
            return (Criteria) this;
        }

        public Criteria andBiangengyewuLessThan(String value) {
            addCriterion("BIANGENGYEWU <", value, "biangengyewu");
            return (Criteria) this;
        }

        public Criteria andBiangengyewuLessThanOrEqualTo(String value) {
            addCriterion("BIANGENGYEWU <=", value, "biangengyewu");
            return (Criteria) this;
        }

        public Criteria andBiangengyewuLike(String value) {
            addCriterion("BIANGENGYEWU like", value, "biangengyewu");
            return (Criteria) this;
        }

        public Criteria andBiangengyewuNotLike(String value) {
            addCriterion("BIANGENGYEWU not like", value, "biangengyewu");
            return (Criteria) this;
        }

        public Criteria andBiangengyewuIn(List<String> values) {
            addCriterion("BIANGENGYEWU in", values, "biangengyewu");
            return (Criteria) this;
        }

        public Criteria andBiangengyewuNotIn(List<String> values) {
            addCriterion("BIANGENGYEWU not in", values, "biangengyewu");
            return (Criteria) this;
        }

        public Criteria andBiangengyewuBetween(String value1, String value2) {
            addCriterion("BIANGENGYEWU between", value1, value2, "biangengyewu");
            return (Criteria) this;
        }

        public Criteria andBiangengyewuNotBetween(String value1, String value2) {
            addCriterion("BIANGENGYEWU not between", value1, value2, "biangengyewu");
            return (Criteria) this;
        }

        public Criteria andBiangengyewubanliIsNull() {
            addCriterion("BIANGENGYEWUBANLI is null");
            return (Criteria) this;
        }

        public Criteria andBiangengyewubanliIsNotNull() {
            addCriterion("BIANGENGYEWUBANLI is not null");
            return (Criteria) this;
        }

        public Criteria andBiangengyewubanliEqualTo(String value) {
            addCriterion("BIANGENGYEWUBANLI =", value, "biangengyewubanli");
            return (Criteria) this;
        }

        public Criteria andBiangengyewubanliNotEqualTo(String value) {
            addCriterion("BIANGENGYEWUBANLI <>", value, "biangengyewubanli");
            return (Criteria) this;
        }

        public Criteria andBiangengyewubanliGreaterThan(String value) {
            addCriterion("BIANGENGYEWUBANLI >", value, "biangengyewubanli");
            return (Criteria) this;
        }

        public Criteria andBiangengyewubanliGreaterThanOrEqualTo(String value) {
            addCriterion("BIANGENGYEWUBANLI >=", value, "biangengyewubanli");
            return (Criteria) this;
        }

        public Criteria andBiangengyewubanliLessThan(String value) {
            addCriterion("BIANGENGYEWUBANLI <", value, "biangengyewubanli");
            return (Criteria) this;
        }

        public Criteria andBiangengyewubanliLessThanOrEqualTo(String value) {
            addCriterion("BIANGENGYEWUBANLI <=", value, "biangengyewubanli");
            return (Criteria) this;
        }

        public Criteria andBiangengyewubanliLike(String value) {
            addCriterion("BIANGENGYEWUBANLI like", value, "biangengyewubanli");
            return (Criteria) this;
        }

        public Criteria andBiangengyewubanliNotLike(String value) {
            addCriterion("BIANGENGYEWUBANLI not like", value, "biangengyewubanli");
            return (Criteria) this;
        }

        public Criteria andBiangengyewubanliIn(List<String> values) {
            addCriterion("BIANGENGYEWUBANLI in", values, "biangengyewubanli");
            return (Criteria) this;
        }

        public Criteria andBiangengyewubanliNotIn(List<String> values) {
            addCriterion("BIANGENGYEWUBANLI not in", values, "biangengyewubanli");
            return (Criteria) this;
        }

        public Criteria andBiangengyewubanliBetween(String value1, String value2) {
            addCriterion("BIANGENGYEWUBANLI between", value1, value2, "biangengyewubanli");
            return (Criteria) this;
        }

        public Criteria andBiangengyewubanliNotBetween(String value1, String value2) {
            addCriterion("BIANGENGYEWUBANLI not between", value1, value2, "biangengyewubanli");
            return (Criteria) this;
        }

        public Criteria andBiangengyewushijianIsNull() {
            addCriterion("BIANGENGYEWUSHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andBiangengyewushijianIsNotNull() {
            addCriterion("BIANGENGYEWUSHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andBiangengyewushijianEqualTo(Date value) {
            addCriterion("BIANGENGYEWUSHIJIAN =", value, "biangengyewushijian");
            return (Criteria) this;
        }

        public Criteria andBiangengyewushijianNotEqualTo(Date value) {
            addCriterion("BIANGENGYEWUSHIJIAN <>", value, "biangengyewushijian");
            return (Criteria) this;
        }

        public Criteria andBiangengyewushijianGreaterThan(Date value) {
            addCriterion("BIANGENGYEWUSHIJIAN >", value, "biangengyewushijian");
            return (Criteria) this;
        }

        public Criteria andBiangengyewushijianGreaterThanOrEqualTo(Date value) {
            addCriterion("BIANGENGYEWUSHIJIAN >=", value, "biangengyewushijian");
            return (Criteria) this;
        }

        public Criteria andBiangengyewushijianLessThan(Date value) {
            addCriterion("BIANGENGYEWUSHIJIAN <", value, "biangengyewushijian");
            return (Criteria) this;
        }

        public Criteria andBiangengyewushijianLessThanOrEqualTo(Date value) {
            addCriterion("BIANGENGYEWUSHIJIAN <=", value, "biangengyewushijian");
            return (Criteria) this;
        }

        public Criteria andBiangengyewushijianIn(List<Date> values) {
            addCriterion("BIANGENGYEWUSHIJIAN in", values, "biangengyewushijian");
            return (Criteria) this;
        }

        public Criteria andBiangengyewushijianNotIn(List<Date> values) {
            addCriterion("BIANGENGYEWUSHIJIAN not in", values, "biangengyewushijian");
            return (Criteria) this;
        }

        public Criteria andBiangengyewushijianBetween(Date value1, Date value2) {
            addCriterion("BIANGENGYEWUSHIJIAN between", value1, value2, "biangengyewushijian");
            return (Criteria) this;
        }

        public Criteria andBiangengyewushijianNotBetween(Date value1, Date value2) {
            addCriterion("BIANGENGYEWUSHIJIAN not between", value1, value2, "biangengyewushijian");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuoIsNull() {
            addCriterion("BIANGENGZHUSUO is null");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuoIsNotNull() {
            addCriterion("BIANGENGZHUSUO is not null");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuoEqualTo(String value) {
            addCriterion("BIANGENGZHUSUO =", value, "biangengzhusuo");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuoNotEqualTo(String value) {
            addCriterion("BIANGENGZHUSUO <>", value, "biangengzhusuo");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuoGreaterThan(String value) {
            addCriterion("BIANGENGZHUSUO >", value, "biangengzhusuo");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuoGreaterThanOrEqualTo(String value) {
            addCriterion("BIANGENGZHUSUO >=", value, "biangengzhusuo");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuoLessThan(String value) {
            addCriterion("BIANGENGZHUSUO <", value, "biangengzhusuo");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuoLessThanOrEqualTo(String value) {
            addCriterion("BIANGENGZHUSUO <=", value, "biangengzhusuo");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuoLike(String value) {
            addCriterion("BIANGENGZHUSUO like", value, "biangengzhusuo");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuoNotLike(String value) {
            addCriterion("BIANGENGZHUSUO not like", value, "biangengzhusuo");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuoIn(List<String> values) {
            addCriterion("BIANGENGZHUSUO in", values, "biangengzhusuo");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuoNotIn(List<String> values) {
            addCriterion("BIANGENGZHUSUO not in", values, "biangengzhusuo");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuoBetween(String value1, String value2) {
            addCriterion("BIANGENGZHUSUO between", value1, value2, "biangengzhusuo");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuoNotBetween(String value1, String value2) {
            addCriterion("BIANGENGZHUSUO not between", value1, value2, "biangengzhusuo");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuobanliIsNull() {
            addCriterion("BIANGENGZHUSUOBANLI is null");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuobanliIsNotNull() {
            addCriterion("BIANGENGZHUSUOBANLI is not null");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuobanliEqualTo(String value) {
            addCriterion("BIANGENGZHUSUOBANLI =", value, "biangengzhusuobanli");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuobanliNotEqualTo(String value) {
            addCriterion("BIANGENGZHUSUOBANLI <>", value, "biangengzhusuobanli");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuobanliGreaterThan(String value) {
            addCriterion("BIANGENGZHUSUOBANLI >", value, "biangengzhusuobanli");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuobanliGreaterThanOrEqualTo(String value) {
            addCriterion("BIANGENGZHUSUOBANLI >=", value, "biangengzhusuobanli");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuobanliLessThan(String value) {
            addCriterion("BIANGENGZHUSUOBANLI <", value, "biangengzhusuobanli");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuobanliLessThanOrEqualTo(String value) {
            addCriterion("BIANGENGZHUSUOBANLI <=", value, "biangengzhusuobanli");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuobanliLike(String value) {
            addCriterion("BIANGENGZHUSUOBANLI like", value, "biangengzhusuobanli");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuobanliNotLike(String value) {
            addCriterion("BIANGENGZHUSUOBANLI not like", value, "biangengzhusuobanli");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuobanliIn(List<String> values) {
            addCriterion("BIANGENGZHUSUOBANLI in", values, "biangengzhusuobanli");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuobanliNotIn(List<String> values) {
            addCriterion("BIANGENGZHUSUOBANLI not in", values, "biangengzhusuobanli");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuobanliBetween(String value1, String value2) {
            addCriterion("BIANGENGZHUSUOBANLI between", value1, value2, "biangengzhusuobanli");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuobanliNotBetween(String value1, String value2) {
            addCriterion("BIANGENGZHUSUOBANLI not between", value1, value2, "biangengzhusuobanli");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuoshijianIsNull() {
            addCriterion("BIANGENGZHUSUOSHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuoshijianIsNotNull() {
            addCriterion("BIANGENGZHUSUOSHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuoshijianEqualTo(Date value) {
            addCriterion("BIANGENGZHUSUOSHIJIAN =", value, "biangengzhusuoshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuoshijianNotEqualTo(Date value) {
            addCriterion("BIANGENGZHUSUOSHIJIAN <>", value, "biangengzhusuoshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuoshijianGreaterThan(Date value) {
            addCriterion("BIANGENGZHUSUOSHIJIAN >", value, "biangengzhusuoshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuoshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("BIANGENGZHUSUOSHIJIAN >=", value, "biangengzhusuoshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuoshijianLessThan(Date value) {
            addCriterion("BIANGENGZHUSUOSHIJIAN <", value, "biangengzhusuoshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuoshijianLessThanOrEqualTo(Date value) {
            addCriterion("BIANGENGZHUSUOSHIJIAN <=", value, "biangengzhusuoshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuoshijianIn(List<Date> values) {
            addCriterion("BIANGENGZHUSUOSHIJIAN in", values, "biangengzhusuoshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuoshijianNotIn(List<Date> values) {
            addCriterion("BIANGENGZHUSUOSHIJIAN not in", values, "biangengzhusuoshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuoshijianBetween(Date value1, Date value2) {
            addCriterion("BIANGENGZHUSUOSHIJIAN between", value1, value2, "biangengzhusuoshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuoshijianNotBetween(Date value1, Date value2) {
            addCriterion("BIANGENGZHUSUOSHIJIAN not between", value1, value2, "biangengzhusuoshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinIsNull() {
            addCriterion("BIANGENGZIJIN is null");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinIsNotNull() {
            addCriterion("BIANGENGZIJIN is not null");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinEqualTo(String value) {
            addCriterion("BIANGENGZIJIN =", value, "biangengzijin");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinNotEqualTo(String value) {
            addCriterion("BIANGENGZIJIN <>", value, "biangengzijin");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinGreaterThan(String value) {
            addCriterion("BIANGENGZIJIN >", value, "biangengzijin");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinGreaterThanOrEqualTo(String value) {
            addCriterion("BIANGENGZIJIN >=", value, "biangengzijin");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinLessThan(String value) {
            addCriterion("BIANGENGZIJIN <", value, "biangengzijin");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinLessThanOrEqualTo(String value) {
            addCriterion("BIANGENGZIJIN <=", value, "biangengzijin");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinLike(String value) {
            addCriterion("BIANGENGZIJIN like", value, "biangengzijin");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinNotLike(String value) {
            addCriterion("BIANGENGZIJIN not like", value, "biangengzijin");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinIn(List<String> values) {
            addCriterion("BIANGENGZIJIN in", values, "biangengzijin");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinNotIn(List<String> values) {
            addCriterion("BIANGENGZIJIN not in", values, "biangengzijin");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinBetween(String value1, String value2) {
            addCriterion("BIANGENGZIJIN between", value1, value2, "biangengzijin");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinNotBetween(String value1, String value2) {
            addCriterion("BIANGENGZIJIN not between", value1, value2, "biangengzijin");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinbanliIsNull() {
            addCriterion("BIANGENGZIJINBANLI is null");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinbanliIsNotNull() {
            addCriterion("BIANGENGZIJINBANLI is not null");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinbanliEqualTo(String value) {
            addCriterion("BIANGENGZIJINBANLI =", value, "biangengzijinbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinbanliNotEqualTo(String value) {
            addCriterion("BIANGENGZIJINBANLI <>", value, "biangengzijinbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinbanliGreaterThan(String value) {
            addCriterion("BIANGENGZIJINBANLI >", value, "biangengzijinbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinbanliGreaterThanOrEqualTo(String value) {
            addCriterion("BIANGENGZIJINBANLI >=", value, "biangengzijinbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinbanliLessThan(String value) {
            addCriterion("BIANGENGZIJINBANLI <", value, "biangengzijinbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinbanliLessThanOrEqualTo(String value) {
            addCriterion("BIANGENGZIJINBANLI <=", value, "biangengzijinbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinbanliLike(String value) {
            addCriterion("BIANGENGZIJINBANLI like", value, "biangengzijinbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinbanliNotLike(String value) {
            addCriterion("BIANGENGZIJINBANLI not like", value, "biangengzijinbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinbanliIn(List<String> values) {
            addCriterion("BIANGENGZIJINBANLI in", values, "biangengzijinbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinbanliNotIn(List<String> values) {
            addCriterion("BIANGENGZIJINBANLI not in", values, "biangengzijinbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinbanliBetween(String value1, String value2) {
            addCriterion("BIANGENGZIJINBANLI between", value1, value2, "biangengzijinbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinbanliNotBetween(String value1, String value2) {
            addCriterion("BIANGENGZIJINBANLI not between", value1, value2, "biangengzijinbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinshijianIsNull() {
            addCriterion("BIANGENGZIJINSHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinshijianIsNotNull() {
            addCriterion("BIANGENGZIJINSHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinshijianEqualTo(Date value) {
            addCriterion("BIANGENGZIJINSHIJIAN =", value, "biangengzijinshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinshijianNotEqualTo(Date value) {
            addCriterion("BIANGENGZIJINSHIJIAN <>", value, "biangengzijinshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinshijianGreaterThan(Date value) {
            addCriterion("BIANGENGZIJINSHIJIAN >", value, "biangengzijinshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("BIANGENGZIJINSHIJIAN >=", value, "biangengzijinshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinshijianLessThan(Date value) {
            addCriterion("BIANGENGZIJINSHIJIAN <", value, "biangengzijinshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinshijianLessThanOrEqualTo(Date value) {
            addCriterion("BIANGENGZIJINSHIJIAN <=", value, "biangengzijinshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinshijianIn(List<Date> values) {
            addCriterion("BIANGENGZIJINSHIJIAN in", values, "biangengzijinshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinshijianNotIn(List<Date> values) {
            addCriterion("BIANGENGZIJINSHIJIAN not in", values, "biangengzijinshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinshijianBetween(Date value1, Date value2) {
            addCriterion("BIANGENGZIJINSHIJIAN between", value1, value2, "biangengzijinshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengzijinshijianNotBetween(Date value1, Date value2) {
            addCriterion("BIANGENGZIJINSHIJIAN not between", value1, value2, "biangengzijinshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenIsNull() {
            addCriterion("BIANGENGFAREN is null");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenIsNotNull() {
            addCriterion("BIANGENGFAREN is not null");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenEqualTo(String value) {
            addCriterion("BIANGENGFAREN =", value, "biangengfaren");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenNotEqualTo(String value) {
            addCriterion("BIANGENGFAREN <>", value, "biangengfaren");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenGreaterThan(String value) {
            addCriterion("BIANGENGFAREN >", value, "biangengfaren");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenGreaterThanOrEqualTo(String value) {
            addCriterion("BIANGENGFAREN >=", value, "biangengfaren");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenLessThan(String value) {
            addCriterion("BIANGENGFAREN <", value, "biangengfaren");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenLessThanOrEqualTo(String value) {
            addCriterion("BIANGENGFAREN <=", value, "biangengfaren");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenLike(String value) {
            addCriterion("BIANGENGFAREN like", value, "biangengfaren");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenNotLike(String value) {
            addCriterion("BIANGENGFAREN not like", value, "biangengfaren");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenIn(List<String> values) {
            addCriterion("BIANGENGFAREN in", values, "biangengfaren");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenNotIn(List<String> values) {
            addCriterion("BIANGENGFAREN not in", values, "biangengfaren");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenBetween(String value1, String value2) {
            addCriterion("BIANGENGFAREN between", value1, value2, "biangengfaren");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenNotBetween(String value1, String value2) {
            addCriterion("BIANGENGFAREN not between", value1, value2, "biangengfaren");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenbanliIsNull() {
            addCriterion("BIANGENGFARENBANLI is null");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenbanliIsNotNull() {
            addCriterion("BIANGENGFARENBANLI is not null");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenbanliEqualTo(String value) {
            addCriterion("BIANGENGFARENBANLI =", value, "biangengfarenbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenbanliNotEqualTo(String value) {
            addCriterion("BIANGENGFARENBANLI <>", value, "biangengfarenbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenbanliGreaterThan(String value) {
            addCriterion("BIANGENGFARENBANLI >", value, "biangengfarenbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenbanliGreaterThanOrEqualTo(String value) {
            addCriterion("BIANGENGFARENBANLI >=", value, "biangengfarenbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenbanliLessThan(String value) {
            addCriterion("BIANGENGFARENBANLI <", value, "biangengfarenbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenbanliLessThanOrEqualTo(String value) {
            addCriterion("BIANGENGFARENBANLI <=", value, "biangengfarenbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenbanliLike(String value) {
            addCriterion("BIANGENGFARENBANLI like", value, "biangengfarenbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenbanliNotLike(String value) {
            addCriterion("BIANGENGFARENBANLI not like", value, "biangengfarenbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenbanliIn(List<String> values) {
            addCriterion("BIANGENGFARENBANLI in", values, "biangengfarenbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenbanliNotIn(List<String> values) {
            addCriterion("BIANGENGFARENBANLI not in", values, "biangengfarenbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenbanliBetween(String value1, String value2) {
            addCriterion("BIANGENGFARENBANLI between", value1, value2, "biangengfarenbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenbanliNotBetween(String value1, String value2) {
            addCriterion("BIANGENGFARENBANLI not between", value1, value2, "biangengfarenbanli");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenshijianIsNull() {
            addCriterion("BIANGENGFARENSHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenshijianIsNotNull() {
            addCriterion("BIANGENGFARENSHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenshijianEqualTo(Date value) {
            addCriterion("BIANGENGFARENSHIJIAN =", value, "biangengfarenshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenshijianNotEqualTo(Date value) {
            addCriterion("BIANGENGFARENSHIJIAN <>", value, "biangengfarenshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenshijianGreaterThan(Date value) {
            addCriterion("BIANGENGFARENSHIJIAN >", value, "biangengfarenshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("BIANGENGFARENSHIJIAN >=", value, "biangengfarenshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenshijianLessThan(Date value) {
            addCriterion("BIANGENGFARENSHIJIAN <", value, "biangengfarenshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenshijianLessThanOrEqualTo(Date value) {
            addCriterion("BIANGENGFARENSHIJIAN <=", value, "biangengfarenshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenshijianIn(List<Date> values) {
            addCriterion("BIANGENGFARENSHIJIAN in", values, "biangengfarenshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenshijianNotIn(List<Date> values) {
            addCriterion("BIANGENGFARENSHIJIAN not in", values, "biangengfarenshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenshijianBetween(Date value1, Date value2) {
            addCriterion("BIANGENGFARENSHIJIAN between", value1, value2, "biangengfarenshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengfarenshijianNotBetween(Date value1, Date value2) {
            addCriterion("BIANGENGFARENSHIJIAN not between", value1, value2, "biangengfarenshijian");
            return (Criteria) this;
        }

        public Criteria andBiangengzhuguandanweiIsNull() {
            addCriterion("BIANGENGZHUGUANDANWEI is null");
            return (Criteria) this;
        }

        public Criteria andBiangengzhuguandanweiIsNotNull() {
            addCriterion("BIANGENGZHUGUANDANWEI is not null");
            return (Criteria) this;
        }

        public Criteria andBiangengzhuguandanweiEqualTo(String value) {
            addCriterion("BIANGENGZHUGUANDANWEI =", value, "biangengzhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andBiangengzhuguandanweiNotEqualTo(String value) {
            addCriterion("BIANGENGZHUGUANDANWEI <>", value, "biangengzhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andBiangengzhuguandanweiGreaterThan(String value) {
            addCriterion("BIANGENGZHUGUANDANWEI >", value, "biangengzhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andBiangengzhuguandanweiGreaterThanOrEqualTo(String value) {
            addCriterion("BIANGENGZHUGUANDANWEI >=", value, "biangengzhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andBiangengzhuguandanweiLessThan(String value) {
            addCriterion("BIANGENGZHUGUANDANWEI <", value, "biangengzhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andBiangengzhuguandanweiLessThanOrEqualTo(String value) {
            addCriterion("BIANGENGZHUGUANDANWEI <=", value, "biangengzhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andBiangengzhuguandanweiLike(String value) {
            addCriterion("BIANGENGZHUGUANDANWEI like", value, "biangengzhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andBiangengzhuguandanweiNotLike(String value) {
            addCriterion("BIANGENGZHUGUANDANWEI not like", value, "biangengzhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andBiangengzhuguandanweiIn(List<String> values) {
            addCriterion("BIANGENGZHUGUANDANWEI in", values, "biangengzhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andBiangengzhuguandanweiNotIn(List<String> values) {
            addCriterion("BIANGENGZHUGUANDANWEI not in", values, "biangengzhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andBiangengzhuguandanweiBetween(String value1, String value2) {
            addCriterion("BIANGENGZHUGUANDANWEI between", value1, value2, "biangengzhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andBiangengzhuguandanweiNotBetween(String value1, String value2) {
            addCriterion("BIANGENGZHUGUANDANWEI not between", value1, value2, "biangengzhuguandanwei");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanweibanliIsNull() {
            addCriterion("BIANZHUGUANDANWEIBANLI is null");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanweibanliIsNotNull() {
            addCriterion("BIANZHUGUANDANWEIBANLI is not null");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanweibanliEqualTo(String value) {
            addCriterion("BIANZHUGUANDANWEIBANLI =", value, "bianzhuguandanweibanli");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanweibanliNotEqualTo(String value) {
            addCriterion("BIANZHUGUANDANWEIBANLI <>", value, "bianzhuguandanweibanli");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanweibanliGreaterThan(String value) {
            addCriterion("BIANZHUGUANDANWEIBANLI >", value, "bianzhuguandanweibanli");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanweibanliGreaterThanOrEqualTo(String value) {
            addCriterion("BIANZHUGUANDANWEIBANLI >=", value, "bianzhuguandanweibanli");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanweibanliLessThan(String value) {
            addCriterion("BIANZHUGUANDANWEIBANLI <", value, "bianzhuguandanweibanli");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanweibanliLessThanOrEqualTo(String value) {
            addCriterion("BIANZHUGUANDANWEIBANLI <=", value, "bianzhuguandanweibanli");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanweibanliLike(String value) {
            addCriterion("BIANZHUGUANDANWEIBANLI like", value, "bianzhuguandanweibanli");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanweibanliNotLike(String value) {
            addCriterion("BIANZHUGUANDANWEIBANLI not like", value, "bianzhuguandanweibanli");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanweibanliIn(List<String> values) {
            addCriterion("BIANZHUGUANDANWEIBANLI in", values, "bianzhuguandanweibanli");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanweibanliNotIn(List<String> values) {
            addCriterion("BIANZHUGUANDANWEIBANLI not in", values, "bianzhuguandanweibanli");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanweibanliBetween(String value1, String value2) {
            addCriterion("BIANZHUGUANDANWEIBANLI between", value1, value2, "bianzhuguandanweibanli");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanweibanliNotBetween(String value1, String value2) {
            addCriterion("BIANZHUGUANDANWEIBANLI not between", value1, value2, "bianzhuguandanweibanli");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanweishijianIsNull() {
            addCriterion("BIANZHUGUANDANWEISHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanweishijianIsNotNull() {
            addCriterion("BIANZHUGUANDANWEISHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanweishijianEqualTo(Date value) {
            addCriterion("BIANZHUGUANDANWEISHIJIAN =", value, "bianzhuguandanweishijian");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanweishijianNotEqualTo(Date value) {
            addCriterion("BIANZHUGUANDANWEISHIJIAN <>", value, "bianzhuguandanweishijian");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanweishijianGreaterThan(Date value) {
            addCriterion("BIANZHUGUANDANWEISHIJIAN >", value, "bianzhuguandanweishijian");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanweishijianGreaterThanOrEqualTo(Date value) {
            addCriterion("BIANZHUGUANDANWEISHIJIAN >=", value, "bianzhuguandanweishijian");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanweishijianLessThan(Date value) {
            addCriterion("BIANZHUGUANDANWEISHIJIAN <", value, "bianzhuguandanweishijian");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanweishijianLessThanOrEqualTo(Date value) {
            addCriterion("BIANZHUGUANDANWEISHIJIAN <=", value, "bianzhuguandanweishijian");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanweishijianIn(List<Date> values) {
            addCriterion("BIANZHUGUANDANWEISHIJIAN in", values, "bianzhuguandanweishijian");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanweishijianNotIn(List<Date> values) {
            addCriterion("BIANZHUGUANDANWEISHIJIAN not in", values, "bianzhuguandanweishijian");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanweishijianBetween(Date value1, Date value2) {
            addCriterion("BIANZHUGUANDANWEISHIJIAN between", value1, value2, "bianzhuguandanweishijian");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanweishijianNotBetween(Date value1, Date value2) {
            addCriterion("BIANZHUGUANDANWEISHIJIAN not between", value1, value2, "bianzhuguandanweishijian");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengIsNull() {
            addCriterion("XIUGAIZHANGCHENG is null");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengIsNotNull() {
            addCriterion("XIUGAIZHANGCHENG is not null");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengEqualTo(String value) {
            addCriterion("XIUGAIZHANGCHENG =", value, "xiugaizhangcheng");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengNotEqualTo(String value) {
            addCriterion("XIUGAIZHANGCHENG <>", value, "xiugaizhangcheng");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengGreaterThan(String value) {
            addCriterion("XIUGAIZHANGCHENG >", value, "xiugaizhangcheng");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengGreaterThanOrEqualTo(String value) {
            addCriterion("XIUGAIZHANGCHENG >=", value, "xiugaizhangcheng");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengLessThan(String value) {
            addCriterion("XIUGAIZHANGCHENG <", value, "xiugaizhangcheng");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengLessThanOrEqualTo(String value) {
            addCriterion("XIUGAIZHANGCHENG <=", value, "xiugaizhangcheng");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengLike(String value) {
            addCriterion("XIUGAIZHANGCHENG like", value, "xiugaizhangcheng");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengNotLike(String value) {
            addCriterion("XIUGAIZHANGCHENG not like", value, "xiugaizhangcheng");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengIn(List<String> values) {
            addCriterion("XIUGAIZHANGCHENG in", values, "xiugaizhangcheng");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengNotIn(List<String> values) {
            addCriterion("XIUGAIZHANGCHENG not in", values, "xiugaizhangcheng");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengBetween(String value1, String value2) {
            addCriterion("XIUGAIZHANGCHENG between", value1, value2, "xiugaizhangcheng");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengNotBetween(String value1, String value2) {
            addCriterion("XIUGAIZHANGCHENG not between", value1, value2, "xiugaizhangcheng");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengbanliIsNull() {
            addCriterion("XIUGAIZHANGCHENGBANLI is null");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengbanliIsNotNull() {
            addCriterion("XIUGAIZHANGCHENGBANLI is not null");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengbanliEqualTo(String value) {
            addCriterion("XIUGAIZHANGCHENGBANLI =", value, "xiugaizhangchengbanli");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengbanliNotEqualTo(String value) {
            addCriterion("XIUGAIZHANGCHENGBANLI <>", value, "xiugaizhangchengbanli");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengbanliGreaterThan(String value) {
            addCriterion("XIUGAIZHANGCHENGBANLI >", value, "xiugaizhangchengbanli");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengbanliGreaterThanOrEqualTo(String value) {
            addCriterion("XIUGAIZHANGCHENGBANLI >=", value, "xiugaizhangchengbanli");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengbanliLessThan(String value) {
            addCriterion("XIUGAIZHANGCHENGBANLI <", value, "xiugaizhangchengbanli");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengbanliLessThanOrEqualTo(String value) {
            addCriterion("XIUGAIZHANGCHENGBANLI <=", value, "xiugaizhangchengbanli");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengbanliLike(String value) {
            addCriterion("XIUGAIZHANGCHENGBANLI like", value, "xiugaizhangchengbanli");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengbanliNotLike(String value) {
            addCriterion("XIUGAIZHANGCHENGBANLI not like", value, "xiugaizhangchengbanli");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengbanliIn(List<String> values) {
            addCriterion("XIUGAIZHANGCHENGBANLI in", values, "xiugaizhangchengbanli");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengbanliNotIn(List<String> values) {
            addCriterion("XIUGAIZHANGCHENGBANLI not in", values, "xiugaizhangchengbanli");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengbanliBetween(String value1, String value2) {
            addCriterion("XIUGAIZHANGCHENGBANLI between", value1, value2, "xiugaizhangchengbanli");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengbanliNotBetween(String value1, String value2) {
            addCriterion("XIUGAIZHANGCHENGBANLI not between", value1, value2, "xiugaizhangchengbanli");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengshijianIsNull() {
            addCriterion("XIUGAIZHANGCHENGSHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengshijianIsNotNull() {
            addCriterion("XIUGAIZHANGCHENGSHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengshijianEqualTo(Date value) {
            addCriterion("XIUGAIZHANGCHENGSHIJIAN =", value, "xiugaizhangchengshijian");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengshijianNotEqualTo(Date value) {
            addCriterion("XIUGAIZHANGCHENGSHIJIAN <>", value, "xiugaizhangchengshijian");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengshijianGreaterThan(Date value) {
            addCriterion("XIUGAIZHANGCHENGSHIJIAN >", value, "xiugaizhangchengshijian");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("XIUGAIZHANGCHENGSHIJIAN >=", value, "xiugaizhangchengshijian");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengshijianLessThan(Date value) {
            addCriterion("XIUGAIZHANGCHENGSHIJIAN <", value, "xiugaizhangchengshijian");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengshijianLessThanOrEqualTo(Date value) {
            addCriterion("XIUGAIZHANGCHENGSHIJIAN <=", value, "xiugaizhangchengshijian");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengshijianIn(List<Date> values) {
            addCriterion("XIUGAIZHANGCHENGSHIJIAN in", values, "xiugaizhangchengshijian");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengshijianNotIn(List<Date> values) {
            addCriterion("XIUGAIZHANGCHENGSHIJIAN not in", values, "xiugaizhangchengshijian");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengshijianBetween(Date value1, Date value2) {
            addCriterion("XIUGAIZHANGCHENGSHIJIAN between", value1, value2, "xiugaizhangchengshijian");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangchengshijianNotBetween(Date value1, Date value2) {
            addCriterion("XIUGAIZHANGCHENGSHIJIAN not between", value1, value2, "xiugaizhangchengshijian");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangengIsNull() {
            addCriterion("FUZERENBIANGENG is null");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangengIsNotNull() {
            addCriterion("FUZERENBIANGENG is not null");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangengEqualTo(String value) {
            addCriterion("FUZERENBIANGENG =", value, "fuzerenbiangeng");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangengNotEqualTo(String value) {
            addCriterion("FUZERENBIANGENG <>", value, "fuzerenbiangeng");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangengGreaterThan(String value) {
            addCriterion("FUZERENBIANGENG >", value, "fuzerenbiangeng");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangengGreaterThanOrEqualTo(String value) {
            addCriterion("FUZERENBIANGENG >=", value, "fuzerenbiangeng");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangengLessThan(String value) {
            addCriterion("FUZERENBIANGENG <", value, "fuzerenbiangeng");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangengLessThanOrEqualTo(String value) {
            addCriterion("FUZERENBIANGENG <=", value, "fuzerenbiangeng");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangengLike(String value) {
            addCriterion("FUZERENBIANGENG like", value, "fuzerenbiangeng");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangengNotLike(String value) {
            addCriterion("FUZERENBIANGENG not like", value, "fuzerenbiangeng");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangengIn(List<String> values) {
            addCriterion("FUZERENBIANGENG in", values, "fuzerenbiangeng");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangengNotIn(List<String> values) {
            addCriterion("FUZERENBIANGENG not in", values, "fuzerenbiangeng");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangengBetween(String value1, String value2) {
            addCriterion("FUZERENBIANGENG between", value1, value2, "fuzerenbiangeng");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangengNotBetween(String value1, String value2) {
            addCriterion("FUZERENBIANGENG not between", value1, value2, "fuzerenbiangeng");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangengbanliIsNull() {
            addCriterion("FUZERENBIANGENGBANLI is null");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangengbanliIsNotNull() {
            addCriterion("FUZERENBIANGENGBANLI is not null");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangengbanliEqualTo(String value) {
            addCriterion("FUZERENBIANGENGBANLI =", value, "fuzerenbiangengbanli");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangengbanliNotEqualTo(String value) {
            addCriterion("FUZERENBIANGENGBANLI <>", value, "fuzerenbiangengbanli");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangengbanliGreaterThan(String value) {
            addCriterion("FUZERENBIANGENGBANLI >", value, "fuzerenbiangengbanli");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangengbanliGreaterThanOrEqualTo(String value) {
            addCriterion("FUZERENBIANGENGBANLI >=", value, "fuzerenbiangengbanli");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangengbanliLessThan(String value) {
            addCriterion("FUZERENBIANGENGBANLI <", value, "fuzerenbiangengbanli");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangengbanliLessThanOrEqualTo(String value) {
            addCriterion("FUZERENBIANGENGBANLI <=", value, "fuzerenbiangengbanli");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangengbanliLike(String value) {
            addCriterion("FUZERENBIANGENGBANLI like", value, "fuzerenbiangengbanli");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangengbanliNotLike(String value) {
            addCriterion("FUZERENBIANGENGBANLI not like", value, "fuzerenbiangengbanli");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangengbanliIn(List<String> values) {
            addCriterion("FUZERENBIANGENGBANLI in", values, "fuzerenbiangengbanli");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangengbanliNotIn(List<String> values) {
            addCriterion("FUZERENBIANGENGBANLI not in", values, "fuzerenbiangengbanli");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangengbanliBetween(String value1, String value2) {
            addCriterion("FUZERENBIANGENGBANLI between", value1, value2, "fuzerenbiangengbanli");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangengbanliNotBetween(String value1, String value2) {
            addCriterion("FUZERENBIANGENGBANLI not between", value1, value2, "fuzerenbiangengbanli");
            return (Criteria) this;
        }

        public Criteria andFuzerenbianshijianIsNull() {
            addCriterion("FUZERENBIANSHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andFuzerenbianshijianIsNotNull() {
            addCriterion("FUZERENBIANSHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andFuzerenbianshijianEqualTo(Date value) {
            addCriterion("FUZERENBIANSHIJIAN =", value, "fuzerenbianshijian");
            return (Criteria) this;
        }

        public Criteria andFuzerenbianshijianNotEqualTo(Date value) {
            addCriterion("FUZERENBIANSHIJIAN <>", value, "fuzerenbianshijian");
            return (Criteria) this;
        }

        public Criteria andFuzerenbianshijianGreaterThan(Date value) {
            addCriterion("FUZERENBIANSHIJIAN >", value, "fuzerenbianshijian");
            return (Criteria) this;
        }

        public Criteria andFuzerenbianshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("FUZERENBIANSHIJIAN >=", value, "fuzerenbianshijian");
            return (Criteria) this;
        }

        public Criteria andFuzerenbianshijianLessThan(Date value) {
            addCriterion("FUZERENBIANSHIJIAN <", value, "fuzerenbianshijian");
            return (Criteria) this;
        }

        public Criteria andFuzerenbianshijianLessThanOrEqualTo(Date value) {
            addCriterion("FUZERENBIANSHIJIAN <=", value, "fuzerenbianshijian");
            return (Criteria) this;
        }

        public Criteria andFuzerenbianshijianIn(List<Date> values) {
            addCriterion("FUZERENBIANSHIJIAN in", values, "fuzerenbianshijian");
            return (Criteria) this;
        }

        public Criteria andFuzerenbianshijianNotIn(List<Date> values) {
            addCriterion("FUZERENBIANSHIJIAN not in", values, "fuzerenbianshijian");
            return (Criteria) this;
        }

        public Criteria andFuzerenbianshijianBetween(Date value1, Date value2) {
            addCriterion("FUZERENBIANSHIJIAN between", value1, value2, "fuzerenbianshijian");
            return (Criteria) this;
        }

        public Criteria andFuzerenbianshijianNotBetween(Date value1, Date value2) {
            addCriterion("FUZERENBIANSHIJIAN not between", value1, value2, "fuzerenbianshijian");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuinianjieIsNull() {
            addCriterion("HUIYUANDAHUINIANJIE is null");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuinianjieIsNotNull() {
            addCriterion("HUIYUANDAHUINIANJIE is not null");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuinianjieEqualTo(Integer value) {
            addCriterion("HUIYUANDAHUINIANJIE =", value, "huiyuandahuinianjie");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuinianjieNotEqualTo(Integer value) {
            addCriterion("HUIYUANDAHUINIANJIE <>", value, "huiyuandahuinianjie");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuinianjieGreaterThan(Integer value) {
            addCriterion("HUIYUANDAHUINIANJIE >", value, "huiyuandahuinianjie");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuinianjieGreaterThanOrEqualTo(Integer value) {
            addCriterion("HUIYUANDAHUINIANJIE >=", value, "huiyuandahuinianjie");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuinianjieLessThan(Integer value) {
            addCriterion("HUIYUANDAHUINIANJIE <", value, "huiyuandahuinianjie");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuinianjieLessThanOrEqualTo(Integer value) {
            addCriterion("HUIYUANDAHUINIANJIE <=", value, "huiyuandahuinianjie");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuinianjieIn(List<Integer> values) {
            addCriterion("HUIYUANDAHUINIANJIE in", values, "huiyuandahuinianjie");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuinianjieNotIn(List<Integer> values) {
            addCriterion("HUIYUANDAHUINIANJIE not in", values, "huiyuandahuinianjie");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuinianjieBetween(Integer value1, Integer value2) {
            addCriterion("HUIYUANDAHUINIANJIE between", value1, value2, "huiyuandahuinianjie");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuinianjieNotBetween(Integer value1, Integer value2) {
            addCriterion("HUIYUANDAHUINIANJIE not between", value1, value2, "huiyuandahuinianjie");
            return (Criteria) this;
        }

        public Criteria andHuanjiedahuishijianIsNull() {
            addCriterion("HUANJIEDAHUISHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andHuanjiedahuishijianIsNotNull() {
            addCriterion("HUANJIEDAHUISHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andHuanjiedahuishijianEqualTo(Date value) {
            addCriterion("HUANJIEDAHUISHIJIAN =", value, "huanjiedahuishijian");
            return (Criteria) this;
        }

        public Criteria andHuanjiedahuishijianNotEqualTo(Date value) {
            addCriterion("HUANJIEDAHUISHIJIAN <>", value, "huanjiedahuishijian");
            return (Criteria) this;
        }

        public Criteria andHuanjiedahuishijianGreaterThan(Date value) {
            addCriterion("HUANJIEDAHUISHIJIAN >", value, "huanjiedahuishijian");
            return (Criteria) this;
        }

        public Criteria andHuanjiedahuishijianGreaterThanOrEqualTo(Date value) {
            addCriterion("HUANJIEDAHUISHIJIAN >=", value, "huanjiedahuishijian");
            return (Criteria) this;
        }

        public Criteria andHuanjiedahuishijianLessThan(Date value) {
            addCriterion("HUANJIEDAHUISHIJIAN <", value, "huanjiedahuishijian");
            return (Criteria) this;
        }

        public Criteria andHuanjiedahuishijianLessThanOrEqualTo(Date value) {
            addCriterion("HUANJIEDAHUISHIJIAN <=", value, "huanjiedahuishijian");
            return (Criteria) this;
        }

        public Criteria andHuanjiedahuishijianIn(List<Date> values) {
            addCriterion("HUANJIEDAHUISHIJIAN in", values, "huanjiedahuishijian");
            return (Criteria) this;
        }

        public Criteria andHuanjiedahuishijianNotIn(List<Date> values) {
            addCriterion("HUANJIEDAHUISHIJIAN not in", values, "huanjiedahuishijian");
            return (Criteria) this;
        }

        public Criteria andHuanjiedahuishijianBetween(Date value1, Date value2) {
            addCriterion("HUANJIEDAHUISHIJIAN between", value1, value2, "huanjiedahuishijian");
            return (Criteria) this;
        }

        public Criteria andHuanjiedahuishijianNotBetween(Date value1, Date value2) {
            addCriterion("HUANJIEDAHUISHIJIAN not between", value1, value2, "huanjiedahuishijian");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuinianciIsNull() {
            addCriterion("HUIYUANDAHUINIANCI is null");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuinianciIsNotNull() {
            addCriterion("HUIYUANDAHUINIANCI is not null");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuinianciEqualTo(Integer value) {
            addCriterion("HUIYUANDAHUINIANCI =", value, "huiyuandahuinianci");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuinianciNotEqualTo(Integer value) {
            addCriterion("HUIYUANDAHUINIANCI <>", value, "huiyuandahuinianci");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuinianciGreaterThan(Integer value) {
            addCriterion("HUIYUANDAHUINIANCI >", value, "huiyuandahuinianci");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuinianciGreaterThanOrEqualTo(Integer value) {
            addCriterion("HUIYUANDAHUINIANCI >=", value, "huiyuandahuinianci");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuinianciLessThan(Integer value) {
            addCriterion("HUIYUANDAHUINIANCI <", value, "huiyuandahuinianci");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuinianciLessThanOrEqualTo(Integer value) {
            addCriterion("HUIYUANDAHUINIANCI <=", value, "huiyuandahuinianci");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuinianciIn(List<Integer> values) {
            addCriterion("HUIYUANDAHUINIANCI in", values, "huiyuandahuinianci");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuinianciNotIn(List<Integer> values) {
            addCriterion("HUIYUANDAHUINIANCI not in", values, "huiyuandahuinianci");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuinianciBetween(Integer value1, Integer value2) {
            addCriterion("HUIYUANDAHUINIANCI between", value1, value2, "huiyuandahuinianci");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuinianciNotBetween(Integer value1, Integer value2) {
            addCriterion("HUIYUANDAHUINIANCI not between", value1, value2, "huiyuandahuinianci");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuishijianIsNull() {
            addCriterion("HUIYUANDAHUISHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuishijianIsNotNull() {
            addCriterion("HUIYUANDAHUISHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuishijianEqualTo(Date value) {
            addCriterion("HUIYUANDAHUISHIJIAN =", value, "huiyuandahuishijian");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuishijianNotEqualTo(Date value) {
            addCriterion("HUIYUANDAHUISHIJIAN <>", value, "huiyuandahuishijian");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuishijianGreaterThan(Date value) {
            addCriterion("HUIYUANDAHUISHIJIAN >", value, "huiyuandahuishijian");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuishijianGreaterThanOrEqualTo(Date value) {
            addCriterion("HUIYUANDAHUISHIJIAN >=", value, "huiyuandahuishijian");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuishijianLessThan(Date value) {
            addCriterion("HUIYUANDAHUISHIJIAN <", value, "huiyuandahuishijian");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuishijianLessThanOrEqualTo(Date value) {
            addCriterion("HUIYUANDAHUISHIJIAN <=", value, "huiyuandahuishijian");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuishijianIn(List<Date> values) {
            addCriterion("HUIYUANDAHUISHIJIAN in", values, "huiyuandahuishijian");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuishijianNotIn(List<Date> values) {
            addCriterion("HUIYUANDAHUISHIJIAN not in", values, "huiyuandahuishijian");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuishijianBetween(Date value1, Date value2) {
            addCriterion("HUIYUANDAHUISHIJIAN between", value1, value2, "huiyuandahuishijian");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuishijianNotBetween(Date value1, Date value2) {
            addCriterion("HUIYUANDAHUISHIJIAN not between", value1, value2, "huiyuandahuishijian");
            return (Criteria) this;
        }

        public Criteria andLishihuinianIsNull() {
            addCriterion("LISHIHUINIAN is null");
            return (Criteria) this;
        }

        public Criteria andLishihuinianIsNotNull() {
            addCriterion("LISHIHUINIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLishihuinianEqualTo(String value) {
            addCriterion("LISHIHUINIAN =", value, "lishihuinian");
            return (Criteria) this;
        }

        public Criteria andLishihuinianNotEqualTo(String value) {
            addCriterion("LISHIHUINIAN <>", value, "lishihuinian");
            return (Criteria) this;
        }

        public Criteria andLishihuinianGreaterThan(String value) {
            addCriterion("LISHIHUINIAN >", value, "lishihuinian");
            return (Criteria) this;
        }

        public Criteria andLishihuinianGreaterThanOrEqualTo(String value) {
            addCriterion("LISHIHUINIAN >=", value, "lishihuinian");
            return (Criteria) this;
        }

        public Criteria andLishihuinianLessThan(String value) {
            addCriterion("LISHIHUINIAN <", value, "lishihuinian");
            return (Criteria) this;
        }

        public Criteria andLishihuinianLessThanOrEqualTo(String value) {
            addCriterion("LISHIHUINIAN <=", value, "lishihuinian");
            return (Criteria) this;
        }

        public Criteria andLishihuinianLike(String value) {
            addCriterion("LISHIHUINIAN like", value, "lishihuinian");
            return (Criteria) this;
        }

        public Criteria andLishihuinianNotLike(String value) {
            addCriterion("LISHIHUINIAN not like", value, "lishihuinian");
            return (Criteria) this;
        }

        public Criteria andLishihuinianIn(List<String> values) {
            addCriterion("LISHIHUINIAN in", values, "lishihuinian");
            return (Criteria) this;
        }

        public Criteria andLishihuinianNotIn(List<String> values) {
            addCriterion("LISHIHUINIAN not in", values, "lishihuinian");
            return (Criteria) this;
        }

        public Criteria andLishihuinianBetween(String value1, String value2) {
            addCriterion("LISHIHUINIAN between", value1, value2, "lishihuinian");
            return (Criteria) this;
        }

        public Criteria andLishihuinianNotBetween(String value1, String value2) {
            addCriterion("LISHIHUINIAN not between", value1, value2, "lishihuinian");
            return (Criteria) this;
        }

        public Criteria andLishihuiciIsNull() {
            addCriterion("LISHIHUICI is null");
            return (Criteria) this;
        }

        public Criteria andLishihuiciIsNotNull() {
            addCriterion("LISHIHUICI is not null");
            return (Criteria) this;
        }

        public Criteria andLishihuiciEqualTo(Integer value) {
            addCriterion("LISHIHUICI =", value, "lishihuici");
            return (Criteria) this;
        }

        public Criteria andLishihuiciNotEqualTo(Integer value) {
            addCriterion("LISHIHUICI <>", value, "lishihuici");
            return (Criteria) this;
        }

        public Criteria andLishihuiciGreaterThan(Integer value) {
            addCriterion("LISHIHUICI >", value, "lishihuici");
            return (Criteria) this;
        }

        public Criteria andLishihuiciGreaterThanOrEqualTo(Integer value) {
            addCriterion("LISHIHUICI >=", value, "lishihuici");
            return (Criteria) this;
        }

        public Criteria andLishihuiciLessThan(Integer value) {
            addCriterion("LISHIHUICI <", value, "lishihuici");
            return (Criteria) this;
        }

        public Criteria andLishihuiciLessThanOrEqualTo(Integer value) {
            addCriterion("LISHIHUICI <=", value, "lishihuici");
            return (Criteria) this;
        }

        public Criteria andLishihuiciIn(List<Integer> values) {
            addCriterion("LISHIHUICI in", values, "lishihuici");
            return (Criteria) this;
        }

        public Criteria andLishihuiciNotIn(List<Integer> values) {
            addCriterion("LISHIHUICI not in", values, "lishihuici");
            return (Criteria) this;
        }

        public Criteria andLishihuiciBetween(Integer value1, Integer value2) {
            addCriterion("LISHIHUICI between", value1, value2, "lishihuici");
            return (Criteria) this;
        }

        public Criteria andLishihuiciNotBetween(Integer value1, Integer value2) {
            addCriterion("LISHIHUICI not between", value1, value2, "lishihuici");
            return (Criteria) this;
        }

        public Criteria andLishihuibennianciIsNull() {
            addCriterion("LISHIHUIBENNIANCI is null");
            return (Criteria) this;
        }

        public Criteria andLishihuibennianciIsNotNull() {
            addCriterion("LISHIHUIBENNIANCI is not null");
            return (Criteria) this;
        }

        public Criteria andLishihuibennianciEqualTo(Integer value) {
            addCriterion("LISHIHUIBENNIANCI =", value, "lishihuibennianci");
            return (Criteria) this;
        }

        public Criteria andLishihuibennianciNotEqualTo(Integer value) {
            addCriterion("LISHIHUIBENNIANCI <>", value, "lishihuibennianci");
            return (Criteria) this;
        }

        public Criteria andLishihuibennianciGreaterThan(Integer value) {
            addCriterion("LISHIHUIBENNIANCI >", value, "lishihuibennianci");
            return (Criteria) this;
        }

        public Criteria andLishihuibennianciGreaterThanOrEqualTo(Integer value) {
            addCriterion("LISHIHUIBENNIANCI >=", value, "lishihuibennianci");
            return (Criteria) this;
        }

        public Criteria andLishihuibennianciLessThan(Integer value) {
            addCriterion("LISHIHUIBENNIANCI <", value, "lishihuibennianci");
            return (Criteria) this;
        }

        public Criteria andLishihuibennianciLessThanOrEqualTo(Integer value) {
            addCriterion("LISHIHUIBENNIANCI <=", value, "lishihuibennianci");
            return (Criteria) this;
        }

        public Criteria andLishihuibennianciIn(List<Integer> values) {
            addCriterion("LISHIHUIBENNIANCI in", values, "lishihuibennianci");
            return (Criteria) this;
        }

        public Criteria andLishihuibennianciNotIn(List<Integer> values) {
            addCriterion("LISHIHUIBENNIANCI not in", values, "lishihuibennianci");
            return (Criteria) this;
        }

        public Criteria andLishihuibennianciBetween(Integer value1, Integer value2) {
            addCriterion("LISHIHUIBENNIANCI between", value1, value2, "lishihuibennianci");
            return (Criteria) this;
        }

        public Criteria andLishihuibennianciNotBetween(Integer value1, Integer value2) {
            addCriterion("LISHIHUIBENNIANCI not between", value1, value2, "lishihuibennianci");
            return (Criteria) this;
        }

        public Criteria andChanglishihuinianIsNull() {
            addCriterion("CHANGLISHIHUINIAN is null");
            return (Criteria) this;
        }

        public Criteria andChanglishihuinianIsNotNull() {
            addCriterion("CHANGLISHIHUINIAN is not null");
            return (Criteria) this;
        }

        public Criteria andChanglishihuinianEqualTo(String value) {
            addCriterion("CHANGLISHIHUINIAN =", value, "changlishihuinian");
            return (Criteria) this;
        }

        public Criteria andChanglishihuinianNotEqualTo(String value) {
            addCriterion("CHANGLISHIHUINIAN <>", value, "changlishihuinian");
            return (Criteria) this;
        }

        public Criteria andChanglishihuinianGreaterThan(String value) {
            addCriterion("CHANGLISHIHUINIAN >", value, "changlishihuinian");
            return (Criteria) this;
        }

        public Criteria andChanglishihuinianGreaterThanOrEqualTo(String value) {
            addCriterion("CHANGLISHIHUINIAN >=", value, "changlishihuinian");
            return (Criteria) this;
        }

        public Criteria andChanglishihuinianLessThan(String value) {
            addCriterion("CHANGLISHIHUINIAN <", value, "changlishihuinian");
            return (Criteria) this;
        }

        public Criteria andChanglishihuinianLessThanOrEqualTo(String value) {
            addCriterion("CHANGLISHIHUINIAN <=", value, "changlishihuinian");
            return (Criteria) this;
        }

        public Criteria andChanglishihuinianLike(String value) {
            addCriterion("CHANGLISHIHUINIAN like", value, "changlishihuinian");
            return (Criteria) this;
        }

        public Criteria andChanglishihuinianNotLike(String value) {
            addCriterion("CHANGLISHIHUINIAN not like", value, "changlishihuinian");
            return (Criteria) this;
        }

        public Criteria andChanglishihuinianIn(List<String> values) {
            addCriterion("CHANGLISHIHUINIAN in", values, "changlishihuinian");
            return (Criteria) this;
        }

        public Criteria andChanglishihuinianNotIn(List<String> values) {
            addCriterion("CHANGLISHIHUINIAN not in", values, "changlishihuinian");
            return (Criteria) this;
        }

        public Criteria andChanglishihuinianBetween(String value1, String value2) {
            addCriterion("CHANGLISHIHUINIAN between", value1, value2, "changlishihuinian");
            return (Criteria) this;
        }

        public Criteria andChanglishihuinianNotBetween(String value1, String value2) {
            addCriterion("CHANGLISHIHUINIAN not between", value1, value2, "changlishihuinian");
            return (Criteria) this;
        }

        public Criteria andChanglishihuiciIsNull() {
            addCriterion("CHANGLISHIHUICI is null");
            return (Criteria) this;
        }

        public Criteria andChanglishihuiciIsNotNull() {
            addCriterion("CHANGLISHIHUICI is not null");
            return (Criteria) this;
        }

        public Criteria andChanglishihuiciEqualTo(Integer value) {
            addCriterion("CHANGLISHIHUICI =", value, "changlishihuici");
            return (Criteria) this;
        }

        public Criteria andChanglishihuiciNotEqualTo(Integer value) {
            addCriterion("CHANGLISHIHUICI <>", value, "changlishihuici");
            return (Criteria) this;
        }

        public Criteria andChanglishihuiciGreaterThan(Integer value) {
            addCriterion("CHANGLISHIHUICI >", value, "changlishihuici");
            return (Criteria) this;
        }

        public Criteria andChanglishihuiciGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHANGLISHIHUICI >=", value, "changlishihuici");
            return (Criteria) this;
        }

        public Criteria andChanglishihuiciLessThan(Integer value) {
            addCriterion("CHANGLISHIHUICI <", value, "changlishihuici");
            return (Criteria) this;
        }

        public Criteria andChanglishihuiciLessThanOrEqualTo(Integer value) {
            addCriterion("CHANGLISHIHUICI <=", value, "changlishihuici");
            return (Criteria) this;
        }

        public Criteria andChanglishihuiciIn(List<Integer> values) {
            addCriterion("CHANGLISHIHUICI in", values, "changlishihuici");
            return (Criteria) this;
        }

        public Criteria andChanglishihuiciNotIn(List<Integer> values) {
            addCriterion("CHANGLISHIHUICI not in", values, "changlishihuici");
            return (Criteria) this;
        }

        public Criteria andChanglishihuiciBetween(Integer value1, Integer value2) {
            addCriterion("CHANGLISHIHUICI between", value1, value2, "changlishihuici");
            return (Criteria) this;
        }

        public Criteria andChanglishihuiciNotBetween(Integer value1, Integer value2) {
            addCriterion("CHANGLISHIHUICI not between", value1, value2, "changlishihuici");
            return (Criteria) this;
        }

        public Criteria andChanglishihuibennianciIsNull() {
            addCriterion("CHANGLISHIHUIBENNIANCI is null");
            return (Criteria) this;
        }

        public Criteria andChanglishihuibennianciIsNotNull() {
            addCriterion("CHANGLISHIHUIBENNIANCI is not null");
            return (Criteria) this;
        }

        public Criteria andChanglishihuibennianciEqualTo(Integer value) {
            addCriterion("CHANGLISHIHUIBENNIANCI =", value, "changlishihuibennianci");
            return (Criteria) this;
        }

        public Criteria andChanglishihuibennianciNotEqualTo(Integer value) {
            addCriterion("CHANGLISHIHUIBENNIANCI <>", value, "changlishihuibennianci");
            return (Criteria) this;
        }

        public Criteria andChanglishihuibennianciGreaterThan(Integer value) {
            addCriterion("CHANGLISHIHUIBENNIANCI >", value, "changlishihuibennianci");
            return (Criteria) this;
        }

        public Criteria andChanglishihuibennianciGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHANGLISHIHUIBENNIANCI >=", value, "changlishihuibennianci");
            return (Criteria) this;
        }

        public Criteria andChanglishihuibennianciLessThan(Integer value) {
            addCriterion("CHANGLISHIHUIBENNIANCI <", value, "changlishihuibennianci");
            return (Criteria) this;
        }

        public Criteria andChanglishihuibennianciLessThanOrEqualTo(Integer value) {
            addCriterion("CHANGLISHIHUIBENNIANCI <=", value, "changlishihuibennianci");
            return (Criteria) this;
        }

        public Criteria andChanglishihuibennianciIn(List<Integer> values) {
            addCriterion("CHANGLISHIHUIBENNIANCI in", values, "changlishihuibennianci");
            return (Criteria) this;
        }

        public Criteria andChanglishihuibennianciNotIn(List<Integer> values) {
            addCriterion("CHANGLISHIHUIBENNIANCI not in", values, "changlishihuibennianci");
            return (Criteria) this;
        }

        public Criteria andChanglishihuibennianciBetween(Integer value1, Integer value2) {
            addCriterion("CHANGLISHIHUIBENNIANCI between", value1, value2, "changlishihuibennianci");
            return (Criteria) this;
        }

        public Criteria andChanglishihuibennianciNotBetween(Integer value1, Integer value2) {
            addCriterion("CHANGLISHIHUIBENNIANCI not between", value1, value2, "changlishihuibennianci");
            return (Criteria) this;
        }

        public Criteria andJigouzhiduIsNull() {
            addCriterion("JIGOUZHIDU is null");
            return (Criteria) this;
        }

        public Criteria andJigouzhiduIsNotNull() {
            addCriterion("JIGOUZHIDU is not null");
            return (Criteria) this;
        }

        public Criteria andJigouzhiduEqualTo(String value) {
            addCriterion("JIGOUZHIDU =", value, "jigouzhidu");
            return (Criteria) this;
        }

        public Criteria andJigouzhiduNotEqualTo(String value) {
            addCriterion("JIGOUZHIDU <>", value, "jigouzhidu");
            return (Criteria) this;
        }

        public Criteria andJigouzhiduGreaterThan(String value) {
            addCriterion("JIGOUZHIDU >", value, "jigouzhidu");
            return (Criteria) this;
        }

        public Criteria andJigouzhiduGreaterThanOrEqualTo(String value) {
            addCriterion("JIGOUZHIDU >=", value, "jigouzhidu");
            return (Criteria) this;
        }

        public Criteria andJigouzhiduLessThan(String value) {
            addCriterion("JIGOUZHIDU <", value, "jigouzhidu");
            return (Criteria) this;
        }

        public Criteria andJigouzhiduLessThanOrEqualTo(String value) {
            addCriterion("JIGOUZHIDU <=", value, "jigouzhidu");
            return (Criteria) this;
        }

        public Criteria andJigouzhiduLike(String value) {
            addCriterion("JIGOUZHIDU like", value, "jigouzhidu");
            return (Criteria) this;
        }

        public Criteria andJigouzhiduNotLike(String value) {
            addCriterion("JIGOUZHIDU not like", value, "jigouzhidu");
            return (Criteria) this;
        }

        public Criteria andJigouzhiduIn(List<String> values) {
            addCriterion("JIGOUZHIDU in", values, "jigouzhidu");
            return (Criteria) this;
        }

        public Criteria andJigouzhiduNotIn(List<String> values) {
            addCriterion("JIGOUZHIDU not in", values, "jigouzhidu");
            return (Criteria) this;
        }

        public Criteria andJigouzhiduBetween(String value1, String value2) {
            addCriterion("JIGOUZHIDU between", value1, value2, "jigouzhidu");
            return (Criteria) this;
        }

        public Criteria andJigouzhiduNotBetween(String value1, String value2) {
            addCriterion("JIGOUZHIDU not between", value1, value2, "jigouzhidu");
            return (Criteria) this;
        }

        public Criteria andZhengshuzhiduIsNull() {
            addCriterion("ZHENGSHUZHIDU is null");
            return (Criteria) this;
        }

        public Criteria andZhengshuzhiduIsNotNull() {
            addCriterion("ZHENGSHUZHIDU is not null");
            return (Criteria) this;
        }

        public Criteria andZhengshuzhiduEqualTo(String value) {
            addCriterion("ZHENGSHUZHIDU =", value, "zhengshuzhidu");
            return (Criteria) this;
        }

        public Criteria andZhengshuzhiduNotEqualTo(String value) {
            addCriterion("ZHENGSHUZHIDU <>", value, "zhengshuzhidu");
            return (Criteria) this;
        }

        public Criteria andZhengshuzhiduGreaterThan(String value) {
            addCriterion("ZHENGSHUZHIDU >", value, "zhengshuzhidu");
            return (Criteria) this;
        }

        public Criteria andZhengshuzhiduGreaterThanOrEqualTo(String value) {
            addCriterion("ZHENGSHUZHIDU >=", value, "zhengshuzhidu");
            return (Criteria) this;
        }

        public Criteria andZhengshuzhiduLessThan(String value) {
            addCriterion("ZHENGSHUZHIDU <", value, "zhengshuzhidu");
            return (Criteria) this;
        }

        public Criteria andZhengshuzhiduLessThanOrEqualTo(String value) {
            addCriterion("ZHENGSHUZHIDU <=", value, "zhengshuzhidu");
            return (Criteria) this;
        }

        public Criteria andZhengshuzhiduLike(String value) {
            addCriterion("ZHENGSHUZHIDU like", value, "zhengshuzhidu");
            return (Criteria) this;
        }

        public Criteria andZhengshuzhiduNotLike(String value) {
            addCriterion("ZHENGSHUZHIDU not like", value, "zhengshuzhidu");
            return (Criteria) this;
        }

        public Criteria andZhengshuzhiduIn(List<String> values) {
            addCriterion("ZHENGSHUZHIDU in", values, "zhengshuzhidu");
            return (Criteria) this;
        }

        public Criteria andZhengshuzhiduNotIn(List<String> values) {
            addCriterion("ZHENGSHUZHIDU not in", values, "zhengshuzhidu");
            return (Criteria) this;
        }

        public Criteria andZhengshuzhiduBetween(String value1, String value2) {
            addCriterion("ZHENGSHUZHIDU between", value1, value2, "zhengshuzhidu");
            return (Criteria) this;
        }

        public Criteria andZhengshuzhiduNotBetween(String value1, String value2) {
            addCriterion("ZHENGSHUZHIDU not between", value1, value2, "zhengshuzhidu");
            return (Criteria) this;
        }

        public Criteria andYinzhangzhiduIsNull() {
            addCriterion("YINZHANGZHIDU is null");
            return (Criteria) this;
        }

        public Criteria andYinzhangzhiduIsNotNull() {
            addCriterion("YINZHANGZHIDU is not null");
            return (Criteria) this;
        }

        public Criteria andYinzhangzhiduEqualTo(String value) {
            addCriterion("YINZHANGZHIDU =", value, "yinzhangzhidu");
            return (Criteria) this;
        }

        public Criteria andYinzhangzhiduNotEqualTo(String value) {
            addCriterion("YINZHANGZHIDU <>", value, "yinzhangzhidu");
            return (Criteria) this;
        }

        public Criteria andYinzhangzhiduGreaterThan(String value) {
            addCriterion("YINZHANGZHIDU >", value, "yinzhangzhidu");
            return (Criteria) this;
        }

        public Criteria andYinzhangzhiduGreaterThanOrEqualTo(String value) {
            addCriterion("YINZHANGZHIDU >=", value, "yinzhangzhidu");
            return (Criteria) this;
        }

        public Criteria andYinzhangzhiduLessThan(String value) {
            addCriterion("YINZHANGZHIDU <", value, "yinzhangzhidu");
            return (Criteria) this;
        }

        public Criteria andYinzhangzhiduLessThanOrEqualTo(String value) {
            addCriterion("YINZHANGZHIDU <=", value, "yinzhangzhidu");
            return (Criteria) this;
        }

        public Criteria andYinzhangzhiduLike(String value) {
            addCriterion("YINZHANGZHIDU like", value, "yinzhangzhidu");
            return (Criteria) this;
        }

        public Criteria andYinzhangzhiduNotLike(String value) {
            addCriterion("YINZHANGZHIDU not like", value, "yinzhangzhidu");
            return (Criteria) this;
        }

        public Criteria andYinzhangzhiduIn(List<String> values) {
            addCriterion("YINZHANGZHIDU in", values, "yinzhangzhidu");
            return (Criteria) this;
        }

        public Criteria andYinzhangzhiduNotIn(List<String> values) {
            addCriterion("YINZHANGZHIDU not in", values, "yinzhangzhidu");
            return (Criteria) this;
        }

        public Criteria andYinzhangzhiduBetween(String value1, String value2) {
            addCriterion("YINZHANGZHIDU between", value1, value2, "yinzhangzhidu");
            return (Criteria) this;
        }

        public Criteria andYinzhangzhiduNotBetween(String value1, String value2) {
            addCriterion("YINZHANGZHIDU not between", value1, value2, "yinzhangzhidu");
            return (Criteria) this;
        }

        public Criteria andRenshizhiduIsNull() {
            addCriterion("RENSHIZHIDU is null");
            return (Criteria) this;
        }

        public Criteria andRenshizhiduIsNotNull() {
            addCriterion("RENSHIZHIDU is not null");
            return (Criteria) this;
        }

        public Criteria andRenshizhiduEqualTo(String value) {
            addCriterion("RENSHIZHIDU =", value, "renshizhidu");
            return (Criteria) this;
        }

        public Criteria andRenshizhiduNotEqualTo(String value) {
            addCriterion("RENSHIZHIDU <>", value, "renshizhidu");
            return (Criteria) this;
        }

        public Criteria andRenshizhiduGreaterThan(String value) {
            addCriterion("RENSHIZHIDU >", value, "renshizhidu");
            return (Criteria) this;
        }

        public Criteria andRenshizhiduGreaterThanOrEqualTo(String value) {
            addCriterion("RENSHIZHIDU >=", value, "renshizhidu");
            return (Criteria) this;
        }

        public Criteria andRenshizhiduLessThan(String value) {
            addCriterion("RENSHIZHIDU <", value, "renshizhidu");
            return (Criteria) this;
        }

        public Criteria andRenshizhiduLessThanOrEqualTo(String value) {
            addCriterion("RENSHIZHIDU <=", value, "renshizhidu");
            return (Criteria) this;
        }

        public Criteria andRenshizhiduLike(String value) {
            addCriterion("RENSHIZHIDU like", value, "renshizhidu");
            return (Criteria) this;
        }

        public Criteria andRenshizhiduNotLike(String value) {
            addCriterion("RENSHIZHIDU not like", value, "renshizhidu");
            return (Criteria) this;
        }

        public Criteria andRenshizhiduIn(List<String> values) {
            addCriterion("RENSHIZHIDU in", values, "renshizhidu");
            return (Criteria) this;
        }

        public Criteria andRenshizhiduNotIn(List<String> values) {
            addCriterion("RENSHIZHIDU not in", values, "renshizhidu");
            return (Criteria) this;
        }

        public Criteria andRenshizhiduBetween(String value1, String value2) {
            addCriterion("RENSHIZHIDU between", value1, value2, "renshizhidu");
            return (Criteria) this;
        }

        public Criteria andRenshizhiduNotBetween(String value1, String value2) {
            addCriterion("RENSHIZHIDU not between", value1, value2, "renshizhidu");
            return (Criteria) this;
        }

        public Criteria andHetongrenshuIsNull() {
            addCriterion("HETONGRENSHU is null");
            return (Criteria) this;
        }

        public Criteria andHetongrenshuIsNotNull() {
            addCriterion("HETONGRENSHU is not null");
            return (Criteria) this;
        }

        public Criteria andHetongrenshuEqualTo(Integer value) {
            addCriterion("HETONGRENSHU =", value, "hetongrenshu");
            return (Criteria) this;
        }

        public Criteria andHetongrenshuNotEqualTo(Integer value) {
            addCriterion("HETONGRENSHU <>", value, "hetongrenshu");
            return (Criteria) this;
        }

        public Criteria andHetongrenshuGreaterThan(Integer value) {
            addCriterion("HETONGRENSHU >", value, "hetongrenshu");
            return (Criteria) this;
        }

        public Criteria andHetongrenshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("HETONGRENSHU >=", value, "hetongrenshu");
            return (Criteria) this;
        }

        public Criteria andHetongrenshuLessThan(Integer value) {
            addCriterion("HETONGRENSHU <", value, "hetongrenshu");
            return (Criteria) this;
        }

        public Criteria andHetongrenshuLessThanOrEqualTo(Integer value) {
            addCriterion("HETONGRENSHU <=", value, "hetongrenshu");
            return (Criteria) this;
        }

        public Criteria andHetongrenshuIn(List<Integer> values) {
            addCriterion("HETONGRENSHU in", values, "hetongrenshu");
            return (Criteria) this;
        }

        public Criteria andHetongrenshuNotIn(List<Integer> values) {
            addCriterion("HETONGRENSHU not in", values, "hetongrenshu");
            return (Criteria) this;
        }

        public Criteria andHetongrenshuBetween(Integer value1, Integer value2) {
            addCriterion("HETONGRENSHU between", value1, value2, "hetongrenshu");
            return (Criteria) this;
        }

        public Criteria andHetongrenshuNotBetween(Integer value1, Integer value2) {
            addCriterion("HETONGRENSHU not between", value1, value2, "hetongrenshu");
            return (Criteria) this;
        }

        public Criteria andShiyebaoxianIsNull() {
            addCriterion("SHIYEBAOXIAN is null");
            return (Criteria) this;
        }

        public Criteria andShiyebaoxianIsNotNull() {
            addCriterion("SHIYEBAOXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andShiyebaoxianEqualTo(Integer value) {
            addCriterion("SHIYEBAOXIAN =", value, "shiyebaoxian");
            return (Criteria) this;
        }

        public Criteria andShiyebaoxianNotEqualTo(Integer value) {
            addCriterion("SHIYEBAOXIAN <>", value, "shiyebaoxian");
            return (Criteria) this;
        }

        public Criteria andShiyebaoxianGreaterThan(Integer value) {
            addCriterion("SHIYEBAOXIAN >", value, "shiyebaoxian");
            return (Criteria) this;
        }

        public Criteria andShiyebaoxianGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHIYEBAOXIAN >=", value, "shiyebaoxian");
            return (Criteria) this;
        }

        public Criteria andShiyebaoxianLessThan(Integer value) {
            addCriterion("SHIYEBAOXIAN <", value, "shiyebaoxian");
            return (Criteria) this;
        }

        public Criteria andShiyebaoxianLessThanOrEqualTo(Integer value) {
            addCriterion("SHIYEBAOXIAN <=", value, "shiyebaoxian");
            return (Criteria) this;
        }

        public Criteria andShiyebaoxianIn(List<Integer> values) {
            addCriterion("SHIYEBAOXIAN in", values, "shiyebaoxian");
            return (Criteria) this;
        }

        public Criteria andShiyebaoxianNotIn(List<Integer> values) {
            addCriterion("SHIYEBAOXIAN not in", values, "shiyebaoxian");
            return (Criteria) this;
        }

        public Criteria andShiyebaoxianBetween(Integer value1, Integer value2) {
            addCriterion("SHIYEBAOXIAN between", value1, value2, "shiyebaoxian");
            return (Criteria) this;
        }

        public Criteria andShiyebaoxianNotBetween(Integer value1, Integer value2) {
            addCriterion("SHIYEBAOXIAN not between", value1, value2, "shiyebaoxian");
            return (Criteria) this;
        }

        public Criteria andYanglaobaoxianIsNull() {
            addCriterion("YANGLAOBAOXIAN is null");
            return (Criteria) this;
        }

        public Criteria andYanglaobaoxianIsNotNull() {
            addCriterion("YANGLAOBAOXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andYanglaobaoxianEqualTo(Integer value) {
            addCriterion("YANGLAOBAOXIAN =", value, "yanglaobaoxian");
            return (Criteria) this;
        }

        public Criteria andYanglaobaoxianNotEqualTo(Integer value) {
            addCriterion("YANGLAOBAOXIAN <>", value, "yanglaobaoxian");
            return (Criteria) this;
        }

        public Criteria andYanglaobaoxianGreaterThan(Integer value) {
            addCriterion("YANGLAOBAOXIAN >", value, "yanglaobaoxian");
            return (Criteria) this;
        }

        public Criteria andYanglaobaoxianGreaterThanOrEqualTo(Integer value) {
            addCriterion("YANGLAOBAOXIAN >=", value, "yanglaobaoxian");
            return (Criteria) this;
        }

        public Criteria andYanglaobaoxianLessThan(Integer value) {
            addCriterion("YANGLAOBAOXIAN <", value, "yanglaobaoxian");
            return (Criteria) this;
        }

        public Criteria andYanglaobaoxianLessThanOrEqualTo(Integer value) {
            addCriterion("YANGLAOBAOXIAN <=", value, "yanglaobaoxian");
            return (Criteria) this;
        }

        public Criteria andYanglaobaoxianIn(List<Integer> values) {
            addCriterion("YANGLAOBAOXIAN in", values, "yanglaobaoxian");
            return (Criteria) this;
        }

        public Criteria andYanglaobaoxianNotIn(List<Integer> values) {
            addCriterion("YANGLAOBAOXIAN not in", values, "yanglaobaoxian");
            return (Criteria) this;
        }

        public Criteria andYanglaobaoxianBetween(Integer value1, Integer value2) {
            addCriterion("YANGLAOBAOXIAN between", value1, value2, "yanglaobaoxian");
            return (Criteria) this;
        }

        public Criteria andYanglaobaoxianNotBetween(Integer value1, Integer value2) {
            addCriterion("YANGLAOBAOXIAN not between", value1, value2, "yanglaobaoxian");
            return (Criteria) this;
        }

        public Criteria andYiliaobaoxianIsNull() {
            addCriterion("YILIAOBAOXIAN is null");
            return (Criteria) this;
        }

        public Criteria andYiliaobaoxianIsNotNull() {
            addCriterion("YILIAOBAOXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andYiliaobaoxianEqualTo(Integer value) {
            addCriterion("YILIAOBAOXIAN =", value, "yiliaobaoxian");
            return (Criteria) this;
        }

        public Criteria andYiliaobaoxianNotEqualTo(Integer value) {
            addCriterion("YILIAOBAOXIAN <>", value, "yiliaobaoxian");
            return (Criteria) this;
        }

        public Criteria andYiliaobaoxianGreaterThan(Integer value) {
            addCriterion("YILIAOBAOXIAN >", value, "yiliaobaoxian");
            return (Criteria) this;
        }

        public Criteria andYiliaobaoxianGreaterThanOrEqualTo(Integer value) {
            addCriterion("YILIAOBAOXIAN >=", value, "yiliaobaoxian");
            return (Criteria) this;
        }

        public Criteria andYiliaobaoxianLessThan(Integer value) {
            addCriterion("YILIAOBAOXIAN <", value, "yiliaobaoxian");
            return (Criteria) this;
        }

        public Criteria andYiliaobaoxianLessThanOrEqualTo(Integer value) {
            addCriterion("YILIAOBAOXIAN <=", value, "yiliaobaoxian");
            return (Criteria) this;
        }

        public Criteria andYiliaobaoxianIn(List<Integer> values) {
            addCriterion("YILIAOBAOXIAN in", values, "yiliaobaoxian");
            return (Criteria) this;
        }

        public Criteria andYiliaobaoxianNotIn(List<Integer> values) {
            addCriterion("YILIAOBAOXIAN not in", values, "yiliaobaoxian");
            return (Criteria) this;
        }

        public Criteria andYiliaobaoxianBetween(Integer value1, Integer value2) {
            addCriterion("YILIAOBAOXIAN between", value1, value2, "yiliaobaoxian");
            return (Criteria) this;
        }

        public Criteria andYiliaobaoxianNotBetween(Integer value1, Integer value2) {
            addCriterion("YILIAOBAOXIAN not between", value1, value2, "yiliaobaoxian");
            return (Criteria) this;
        }

        public Criteria andGongshangbaoxianIsNull() {
            addCriterion("GONGSHANGBAOXIAN is null");
            return (Criteria) this;
        }

        public Criteria andGongshangbaoxianIsNotNull() {
            addCriterion("GONGSHANGBAOXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andGongshangbaoxianEqualTo(Integer value) {
            addCriterion("GONGSHANGBAOXIAN =", value, "gongshangbaoxian");
            return (Criteria) this;
        }

        public Criteria andGongshangbaoxianNotEqualTo(Integer value) {
            addCriterion("GONGSHANGBAOXIAN <>", value, "gongshangbaoxian");
            return (Criteria) this;
        }

        public Criteria andGongshangbaoxianGreaterThan(Integer value) {
            addCriterion("GONGSHANGBAOXIAN >", value, "gongshangbaoxian");
            return (Criteria) this;
        }

        public Criteria andGongshangbaoxianGreaterThanOrEqualTo(Integer value) {
            addCriterion("GONGSHANGBAOXIAN >=", value, "gongshangbaoxian");
            return (Criteria) this;
        }

        public Criteria andGongshangbaoxianLessThan(Integer value) {
            addCriterion("GONGSHANGBAOXIAN <", value, "gongshangbaoxian");
            return (Criteria) this;
        }

        public Criteria andGongshangbaoxianLessThanOrEqualTo(Integer value) {
            addCriterion("GONGSHANGBAOXIAN <=", value, "gongshangbaoxian");
            return (Criteria) this;
        }

        public Criteria andGongshangbaoxianIn(List<Integer> values) {
            addCriterion("GONGSHANGBAOXIAN in", values, "gongshangbaoxian");
            return (Criteria) this;
        }

        public Criteria andGongshangbaoxianNotIn(List<Integer> values) {
            addCriterion("GONGSHANGBAOXIAN not in", values, "gongshangbaoxian");
            return (Criteria) this;
        }

        public Criteria andGongshangbaoxianBetween(Integer value1, Integer value2) {
            addCriterion("GONGSHANGBAOXIAN between", value1, value2, "gongshangbaoxian");
            return (Criteria) this;
        }

        public Criteria andGongshangbaoxianNotBetween(Integer value1, Integer value2) {
            addCriterion("GONGSHANGBAOXIAN not between", value1, value2, "gongshangbaoxian");
            return (Criteria) this;
        }

        public Criteria andShengyubaoxianIsNull() {
            addCriterion("SHENGYUBAOXIAN is null");
            return (Criteria) this;
        }

        public Criteria andShengyubaoxianIsNotNull() {
            addCriterion("SHENGYUBAOXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andShengyubaoxianEqualTo(Integer value) {
            addCriterion("SHENGYUBAOXIAN =", value, "shengyubaoxian");
            return (Criteria) this;
        }

        public Criteria andShengyubaoxianNotEqualTo(Integer value) {
            addCriterion("SHENGYUBAOXIAN <>", value, "shengyubaoxian");
            return (Criteria) this;
        }

        public Criteria andShengyubaoxianGreaterThan(Integer value) {
            addCriterion("SHENGYUBAOXIAN >", value, "shengyubaoxian");
            return (Criteria) this;
        }

        public Criteria andShengyubaoxianGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHENGYUBAOXIAN >=", value, "shengyubaoxian");
            return (Criteria) this;
        }

        public Criteria andShengyubaoxianLessThan(Integer value) {
            addCriterion("SHENGYUBAOXIAN <", value, "shengyubaoxian");
            return (Criteria) this;
        }

        public Criteria andShengyubaoxianLessThanOrEqualTo(Integer value) {
            addCriterion("SHENGYUBAOXIAN <=", value, "shengyubaoxian");
            return (Criteria) this;
        }

        public Criteria andShengyubaoxianIn(List<Integer> values) {
            addCriterion("SHENGYUBAOXIAN in", values, "shengyubaoxian");
            return (Criteria) this;
        }

        public Criteria andShengyubaoxianNotIn(List<Integer> values) {
            addCriterion("SHENGYUBAOXIAN not in", values, "shengyubaoxian");
            return (Criteria) this;
        }

        public Criteria andShengyubaoxianBetween(Integer value1, Integer value2) {
            addCriterion("SHENGYUBAOXIAN between", value1, value2, "shengyubaoxian");
            return (Criteria) this;
        }

        public Criteria andShengyubaoxianNotBetween(Integer value1, Integer value2) {
            addCriterion("SHENGYUBAOXIAN not between", value1, value2, "shengyubaoxian");
            return (Criteria) this;
        }

        public Criteria andKaihuyinxingIsNull() {
            addCriterion("KAIHUYINXING is null");
            return (Criteria) this;
        }

        public Criteria andKaihuyinxingIsNotNull() {
            addCriterion("KAIHUYINXING is not null");
            return (Criteria) this;
        }

        public Criteria andKaihuyinxingEqualTo(String value) {
            addCriterion("KAIHUYINXING =", value, "kaihuyinxing");
            return (Criteria) this;
        }

        public Criteria andKaihuyinxingNotEqualTo(String value) {
            addCriterion("KAIHUYINXING <>", value, "kaihuyinxing");
            return (Criteria) this;
        }

        public Criteria andKaihuyinxingGreaterThan(String value) {
            addCriterion("KAIHUYINXING >", value, "kaihuyinxing");
            return (Criteria) this;
        }

        public Criteria andKaihuyinxingGreaterThanOrEqualTo(String value) {
            addCriterion("KAIHUYINXING >=", value, "kaihuyinxing");
            return (Criteria) this;
        }

        public Criteria andKaihuyinxingLessThan(String value) {
            addCriterion("KAIHUYINXING <", value, "kaihuyinxing");
            return (Criteria) this;
        }

        public Criteria andKaihuyinxingLessThanOrEqualTo(String value) {
            addCriterion("KAIHUYINXING <=", value, "kaihuyinxing");
            return (Criteria) this;
        }

        public Criteria andKaihuyinxingLike(String value) {
            addCriterion("KAIHUYINXING like", value, "kaihuyinxing");
            return (Criteria) this;
        }

        public Criteria andKaihuyinxingNotLike(String value) {
            addCriterion("KAIHUYINXING not like", value, "kaihuyinxing");
            return (Criteria) this;
        }

        public Criteria andKaihuyinxingIn(List<String> values) {
            addCriterion("KAIHUYINXING in", values, "kaihuyinxing");
            return (Criteria) this;
        }

        public Criteria andKaihuyinxingNotIn(List<String> values) {
            addCriterion("KAIHUYINXING not in", values, "kaihuyinxing");
            return (Criteria) this;
        }

        public Criteria andKaihuyinxingBetween(String value1, String value2) {
            addCriterion("KAIHUYINXING between", value1, value2, "kaihuyinxing");
            return (Criteria) this;
        }

        public Criteria andKaihuyinxingNotBetween(String value1, String value2) {
            addCriterion("KAIHUYINXING not between", value1, value2, "kaihuyinxing");
            return (Criteria) this;
        }

        public Criteria andYinxingzhanghaoIsNull() {
            addCriterion("YINXINGZHANGHAO is null");
            return (Criteria) this;
        }

        public Criteria andYinxingzhanghaoIsNotNull() {
            addCriterion("YINXINGZHANGHAO is not null");
            return (Criteria) this;
        }

        public Criteria andYinxingzhanghaoEqualTo(String value) {
            addCriterion("YINXINGZHANGHAO =", value, "yinxingzhanghao");
            return (Criteria) this;
        }

        public Criteria andYinxingzhanghaoNotEqualTo(String value) {
            addCriterion("YINXINGZHANGHAO <>", value, "yinxingzhanghao");
            return (Criteria) this;
        }

        public Criteria andYinxingzhanghaoGreaterThan(String value) {
            addCriterion("YINXINGZHANGHAO >", value, "yinxingzhanghao");
            return (Criteria) this;
        }

        public Criteria andYinxingzhanghaoGreaterThanOrEqualTo(String value) {
            addCriterion("YINXINGZHANGHAO >=", value, "yinxingzhanghao");
            return (Criteria) this;
        }

        public Criteria andYinxingzhanghaoLessThan(String value) {
            addCriterion("YINXINGZHANGHAO <", value, "yinxingzhanghao");
            return (Criteria) this;
        }

        public Criteria andYinxingzhanghaoLessThanOrEqualTo(String value) {
            addCriterion("YINXINGZHANGHAO <=", value, "yinxingzhanghao");
            return (Criteria) this;
        }

        public Criteria andYinxingzhanghaoLike(String value) {
            addCriterion("YINXINGZHANGHAO like", value, "yinxingzhanghao");
            return (Criteria) this;
        }

        public Criteria andYinxingzhanghaoNotLike(String value) {
            addCriterion("YINXINGZHANGHAO not like", value, "yinxingzhanghao");
            return (Criteria) this;
        }

        public Criteria andYinxingzhanghaoIn(List<String> values) {
            addCriterion("YINXINGZHANGHAO in", values, "yinxingzhanghao");
            return (Criteria) this;
        }

        public Criteria andYinxingzhanghaoNotIn(List<String> values) {
            addCriterion("YINXINGZHANGHAO not in", values, "yinxingzhanghao");
            return (Criteria) this;
        }

        public Criteria andYinxingzhanghaoBetween(String value1, String value2) {
            addCriterion("YINXINGZHANGHAO between", value1, value2, "yinxingzhanghao");
            return (Criteria) this;
        }

        public Criteria andYinxingzhanghaoNotBetween(String value1, String value2) {
            addCriterion("YINXINGZHANGHAO not between", value1, value2, "yinxingzhanghao");
            return (Criteria) this;
        }

        public Criteria andWaibikaihuyinxingIsNull() {
            addCriterion("WAIBIKAIHUYINXING is null");
            return (Criteria) this;
        }

        public Criteria andWaibikaihuyinxingIsNotNull() {
            addCriterion("WAIBIKAIHUYINXING is not null");
            return (Criteria) this;
        }

        public Criteria andWaibikaihuyinxingEqualTo(String value) {
            addCriterion("WAIBIKAIHUYINXING =", value, "waibikaihuyinxing");
            return (Criteria) this;
        }

        public Criteria andWaibikaihuyinxingNotEqualTo(String value) {
            addCriterion("WAIBIKAIHUYINXING <>", value, "waibikaihuyinxing");
            return (Criteria) this;
        }

        public Criteria andWaibikaihuyinxingGreaterThan(String value) {
            addCriterion("WAIBIKAIHUYINXING >", value, "waibikaihuyinxing");
            return (Criteria) this;
        }

        public Criteria andWaibikaihuyinxingGreaterThanOrEqualTo(String value) {
            addCriterion("WAIBIKAIHUYINXING >=", value, "waibikaihuyinxing");
            return (Criteria) this;
        }

        public Criteria andWaibikaihuyinxingLessThan(String value) {
            addCriterion("WAIBIKAIHUYINXING <", value, "waibikaihuyinxing");
            return (Criteria) this;
        }

        public Criteria andWaibikaihuyinxingLessThanOrEqualTo(String value) {
            addCriterion("WAIBIKAIHUYINXING <=", value, "waibikaihuyinxing");
            return (Criteria) this;
        }

        public Criteria andWaibikaihuyinxingLike(String value) {
            addCriterion("WAIBIKAIHUYINXING like", value, "waibikaihuyinxing");
            return (Criteria) this;
        }

        public Criteria andWaibikaihuyinxingNotLike(String value) {
            addCriterion("WAIBIKAIHUYINXING not like", value, "waibikaihuyinxing");
            return (Criteria) this;
        }

        public Criteria andWaibikaihuyinxingIn(List<String> values) {
            addCriterion("WAIBIKAIHUYINXING in", values, "waibikaihuyinxing");
            return (Criteria) this;
        }

        public Criteria andWaibikaihuyinxingNotIn(List<String> values) {
            addCriterion("WAIBIKAIHUYINXING not in", values, "waibikaihuyinxing");
            return (Criteria) this;
        }

        public Criteria andWaibikaihuyinxingBetween(String value1, String value2) {
            addCriterion("WAIBIKAIHUYINXING between", value1, value2, "waibikaihuyinxing");
            return (Criteria) this;
        }

        public Criteria andWaibikaihuyinxingNotBetween(String value1, String value2) {
            addCriterion("WAIBIKAIHUYINXING not between", value1, value2, "waibikaihuyinxing");
            return (Criteria) this;
        }

        public Criteria andWaibiyinxingzhanghaoIsNull() {
            addCriterion("WAIBIYINXINGZHANGHAO is null");
            return (Criteria) this;
        }

        public Criteria andWaibiyinxingzhanghaoIsNotNull() {
            addCriterion("WAIBIYINXINGZHANGHAO is not null");
            return (Criteria) this;
        }

        public Criteria andWaibiyinxingzhanghaoEqualTo(String value) {
            addCriterion("WAIBIYINXINGZHANGHAO =", value, "waibiyinxingzhanghao");
            return (Criteria) this;
        }

        public Criteria andWaibiyinxingzhanghaoNotEqualTo(String value) {
            addCriterion("WAIBIYINXINGZHANGHAO <>", value, "waibiyinxingzhanghao");
            return (Criteria) this;
        }

        public Criteria andWaibiyinxingzhanghaoGreaterThan(String value) {
            addCriterion("WAIBIYINXINGZHANGHAO >", value, "waibiyinxingzhanghao");
            return (Criteria) this;
        }

        public Criteria andWaibiyinxingzhanghaoGreaterThanOrEqualTo(String value) {
            addCriterion("WAIBIYINXINGZHANGHAO >=", value, "waibiyinxingzhanghao");
            return (Criteria) this;
        }

        public Criteria andWaibiyinxingzhanghaoLessThan(String value) {
            addCriterion("WAIBIYINXINGZHANGHAO <", value, "waibiyinxingzhanghao");
            return (Criteria) this;
        }

        public Criteria andWaibiyinxingzhanghaoLessThanOrEqualTo(String value) {
            addCriterion("WAIBIYINXINGZHANGHAO <=", value, "waibiyinxingzhanghao");
            return (Criteria) this;
        }

        public Criteria andWaibiyinxingzhanghaoLike(String value) {
            addCriterion("WAIBIYINXINGZHANGHAO like", value, "waibiyinxingzhanghao");
            return (Criteria) this;
        }

        public Criteria andWaibiyinxingzhanghaoNotLike(String value) {
            addCriterion("WAIBIYINXINGZHANGHAO not like", value, "waibiyinxingzhanghao");
            return (Criteria) this;
        }

        public Criteria andWaibiyinxingzhanghaoIn(List<String> values) {
            addCriterion("WAIBIYINXINGZHANGHAO in", values, "waibiyinxingzhanghao");
            return (Criteria) this;
        }

        public Criteria andWaibiyinxingzhanghaoNotIn(List<String> values) {
            addCriterion("WAIBIYINXINGZHANGHAO not in", values, "waibiyinxingzhanghao");
            return (Criteria) this;
        }

        public Criteria andWaibiyinxingzhanghaoBetween(String value1, String value2) {
            addCriterion("WAIBIYINXINGZHANGHAO between", value1, value2, "waibiyinxingzhanghao");
            return (Criteria) this;
        }

        public Criteria andWaibiyinxingzhanghaoNotBetween(String value1, String value2) {
            addCriterion("WAIBIYINXINGZHANGHAO not between", value1, value2, "waibiyinxingzhanghao");
            return (Criteria) this;
        }

        public Criteria andCaizhengdengjiIsNull() {
            addCriterion("CAIZHENGDENGJI is null");
            return (Criteria) this;
        }

        public Criteria andCaizhengdengjiIsNotNull() {
            addCriterion("CAIZHENGDENGJI is not null");
            return (Criteria) this;
        }

        public Criteria andCaizhengdengjiEqualTo(String value) {
            addCriterion("CAIZHENGDENGJI =", value, "caizhengdengji");
            return (Criteria) this;
        }

        public Criteria andCaizhengdengjiNotEqualTo(String value) {
            addCriterion("CAIZHENGDENGJI <>", value, "caizhengdengji");
            return (Criteria) this;
        }

        public Criteria andCaizhengdengjiGreaterThan(String value) {
            addCriterion("CAIZHENGDENGJI >", value, "caizhengdengji");
            return (Criteria) this;
        }

        public Criteria andCaizhengdengjiGreaterThanOrEqualTo(String value) {
            addCriterion("CAIZHENGDENGJI >=", value, "caizhengdengji");
            return (Criteria) this;
        }

        public Criteria andCaizhengdengjiLessThan(String value) {
            addCriterion("CAIZHENGDENGJI <", value, "caizhengdengji");
            return (Criteria) this;
        }

        public Criteria andCaizhengdengjiLessThanOrEqualTo(String value) {
            addCriterion("CAIZHENGDENGJI <=", value, "caizhengdengji");
            return (Criteria) this;
        }

        public Criteria andCaizhengdengjiLike(String value) {
            addCriterion("CAIZHENGDENGJI like", value, "caizhengdengji");
            return (Criteria) this;
        }

        public Criteria andCaizhengdengjiNotLike(String value) {
            addCriterion("CAIZHENGDENGJI not like", value, "caizhengdengji");
            return (Criteria) this;
        }

        public Criteria andCaizhengdengjiIn(List<String> values) {
            addCriterion("CAIZHENGDENGJI in", values, "caizhengdengji");
            return (Criteria) this;
        }

        public Criteria andCaizhengdengjiNotIn(List<String> values) {
            addCriterion("CAIZHENGDENGJI not in", values, "caizhengdengji");
            return (Criteria) this;
        }

        public Criteria andCaizhengdengjiBetween(String value1, String value2) {
            addCriterion("CAIZHENGDENGJI between", value1, value2, "caizhengdengji");
            return (Criteria) this;
        }

        public Criteria andCaizhengdengjiNotBetween(String value1, String value2) {
            addCriterion("CAIZHENGDENGJI not between", value1, value2, "caizhengdengji");
            return (Criteria) this;
        }

        public Criteria andCaihuirenyuanshuIsNull() {
            addCriterion("CAIHUIRENYUANSHU is null");
            return (Criteria) this;
        }

        public Criteria andCaihuirenyuanshuIsNotNull() {
            addCriterion("CAIHUIRENYUANSHU is not null");
            return (Criteria) this;
        }

        public Criteria andCaihuirenyuanshuEqualTo(Integer value) {
            addCriterion("CAIHUIRENYUANSHU =", value, "caihuirenyuanshu");
            return (Criteria) this;
        }

        public Criteria andCaihuirenyuanshuNotEqualTo(Integer value) {
            addCriterion("CAIHUIRENYUANSHU <>", value, "caihuirenyuanshu");
            return (Criteria) this;
        }

        public Criteria andCaihuirenyuanshuGreaterThan(Integer value) {
            addCriterion("CAIHUIRENYUANSHU >", value, "caihuirenyuanshu");
            return (Criteria) this;
        }

        public Criteria andCaihuirenyuanshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("CAIHUIRENYUANSHU >=", value, "caihuirenyuanshu");
            return (Criteria) this;
        }

        public Criteria andCaihuirenyuanshuLessThan(Integer value) {
            addCriterion("CAIHUIRENYUANSHU <", value, "caihuirenyuanshu");
            return (Criteria) this;
        }

        public Criteria andCaihuirenyuanshuLessThanOrEqualTo(Integer value) {
            addCriterion("CAIHUIRENYUANSHU <=", value, "caihuirenyuanshu");
            return (Criteria) this;
        }

        public Criteria andCaihuirenyuanshuIn(List<Integer> values) {
            addCriterion("CAIHUIRENYUANSHU in", values, "caihuirenyuanshu");
            return (Criteria) this;
        }

        public Criteria andCaihuirenyuanshuNotIn(List<Integer> values) {
            addCriterion("CAIHUIRENYUANSHU not in", values, "caihuirenyuanshu");
            return (Criteria) this;
        }

        public Criteria andCaihuirenyuanshuBetween(Integer value1, Integer value2) {
            addCriterion("CAIHUIRENYUANSHU between", value1, value2, "caihuirenyuanshu");
            return (Criteria) this;
        }

        public Criteria andCaihuirenyuanshuNotBetween(Integer value1, Integer value2) {
            addCriterion("CAIHUIRENYUANSHU not between", value1, value2, "caihuirenyuanshu");
            return (Criteria) this;
        }

        public Criteria andZhiyezigerenshuIsNull() {
            addCriterion("ZHIYEZIGERENSHU is null");
            return (Criteria) this;
        }

        public Criteria andZhiyezigerenshuIsNotNull() {
            addCriterion("ZHIYEZIGERENSHU is not null");
            return (Criteria) this;
        }

        public Criteria andZhiyezigerenshuEqualTo(Integer value) {
            addCriterion("ZHIYEZIGERENSHU =", value, "zhiyezigerenshu");
            return (Criteria) this;
        }

        public Criteria andZhiyezigerenshuNotEqualTo(Integer value) {
            addCriterion("ZHIYEZIGERENSHU <>", value, "zhiyezigerenshu");
            return (Criteria) this;
        }

        public Criteria andZhiyezigerenshuGreaterThan(Integer value) {
            addCriterion("ZHIYEZIGERENSHU >", value, "zhiyezigerenshu");
            return (Criteria) this;
        }

        public Criteria andZhiyezigerenshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZHIYEZIGERENSHU >=", value, "zhiyezigerenshu");
            return (Criteria) this;
        }

        public Criteria andZhiyezigerenshuLessThan(Integer value) {
            addCriterion("ZHIYEZIGERENSHU <", value, "zhiyezigerenshu");
            return (Criteria) this;
        }

        public Criteria andZhiyezigerenshuLessThanOrEqualTo(Integer value) {
            addCriterion("ZHIYEZIGERENSHU <=", value, "zhiyezigerenshu");
            return (Criteria) this;
        }

        public Criteria andZhiyezigerenshuIn(List<Integer> values) {
            addCriterion("ZHIYEZIGERENSHU in", values, "zhiyezigerenshu");
            return (Criteria) this;
        }

        public Criteria andZhiyezigerenshuNotIn(List<Integer> values) {
            addCriterion("ZHIYEZIGERENSHU not in", values, "zhiyezigerenshu");
            return (Criteria) this;
        }

        public Criteria andZhiyezigerenshuBetween(Integer value1, Integer value2) {
            addCriterion("ZHIYEZIGERENSHU between", value1, value2, "zhiyezigerenshu");
            return (Criteria) this;
        }

        public Criteria andZhiyezigerenshuNotBetween(Integer value1, Integer value2) {
            addCriterion("ZHIYEZIGERENSHU not between", value1, value2, "zhiyezigerenshu");
            return (Criteria) this;
        }

        public Criteria andPiaojuzhongleiqitaIsNull() {
            addCriterion("PIAOJUZHONGLEIQITA is null");
            return (Criteria) this;
        }

        public Criteria andPiaojuzhongleiqitaIsNotNull() {
            addCriterion("PIAOJUZHONGLEIQITA is not null");
            return (Criteria) this;
        }

        public Criteria andPiaojuzhongleiqitaEqualTo(String value) {
            addCriterion("PIAOJUZHONGLEIQITA =", value, "piaojuzhongleiqita");
            return (Criteria) this;
        }

        public Criteria andPiaojuzhongleiqitaNotEqualTo(String value) {
            addCriterion("PIAOJUZHONGLEIQITA <>", value, "piaojuzhongleiqita");
            return (Criteria) this;
        }

        public Criteria andPiaojuzhongleiqitaGreaterThan(String value) {
            addCriterion("PIAOJUZHONGLEIQITA >", value, "piaojuzhongleiqita");
            return (Criteria) this;
        }

        public Criteria andPiaojuzhongleiqitaGreaterThanOrEqualTo(String value) {
            addCriterion("PIAOJUZHONGLEIQITA >=", value, "piaojuzhongleiqita");
            return (Criteria) this;
        }

        public Criteria andPiaojuzhongleiqitaLessThan(String value) {
            addCriterion("PIAOJUZHONGLEIQITA <", value, "piaojuzhongleiqita");
            return (Criteria) this;
        }

        public Criteria andPiaojuzhongleiqitaLessThanOrEqualTo(String value) {
            addCriterion("PIAOJUZHONGLEIQITA <=", value, "piaojuzhongleiqita");
            return (Criteria) this;
        }

        public Criteria andPiaojuzhongleiqitaLike(String value) {
            addCriterion("PIAOJUZHONGLEIQITA like", value, "piaojuzhongleiqita");
            return (Criteria) this;
        }

        public Criteria andPiaojuzhongleiqitaNotLike(String value) {
            addCriterion("PIAOJUZHONGLEIQITA not like", value, "piaojuzhongleiqita");
            return (Criteria) this;
        }

        public Criteria andPiaojuzhongleiqitaIn(List<String> values) {
            addCriterion("PIAOJUZHONGLEIQITA in", values, "piaojuzhongleiqita");
            return (Criteria) this;
        }

        public Criteria andPiaojuzhongleiqitaNotIn(List<String> values) {
            addCriterion("PIAOJUZHONGLEIQITA not in", values, "piaojuzhongleiqita");
            return (Criteria) this;
        }

        public Criteria andPiaojuzhongleiqitaBetween(String value1, String value2) {
            addCriterion("PIAOJUZHONGLEIQITA between", value1, value2, "piaojuzhongleiqita");
            return (Criteria) this;
        }

        public Criteria andPiaojuzhongleiqitaNotBetween(String value1, String value2) {
            addCriterion("PIAOJUZHONGLEIQITA not between", value1, value2, "piaojuzhongleiqita");
            return (Criteria) this;
        }

        public Criteria andCaiwuruanjianIsNull() {
            addCriterion("CAIWURUANJIAN is null");
            return (Criteria) this;
        }

        public Criteria andCaiwuruanjianIsNotNull() {
            addCriterion("CAIWURUANJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andCaiwuruanjianEqualTo(String value) {
            addCriterion("CAIWURUANJIAN =", value, "caiwuruanjian");
            return (Criteria) this;
        }

        public Criteria andCaiwuruanjianNotEqualTo(String value) {
            addCriterion("CAIWURUANJIAN <>", value, "caiwuruanjian");
            return (Criteria) this;
        }

        public Criteria andCaiwuruanjianGreaterThan(String value) {
            addCriterion("CAIWURUANJIAN >", value, "caiwuruanjian");
            return (Criteria) this;
        }

        public Criteria andCaiwuruanjianGreaterThanOrEqualTo(String value) {
            addCriterion("CAIWURUANJIAN >=", value, "caiwuruanjian");
            return (Criteria) this;
        }

        public Criteria andCaiwuruanjianLessThan(String value) {
            addCriterion("CAIWURUANJIAN <", value, "caiwuruanjian");
            return (Criteria) this;
        }

        public Criteria andCaiwuruanjianLessThanOrEqualTo(String value) {
            addCriterion("CAIWURUANJIAN <=", value, "caiwuruanjian");
            return (Criteria) this;
        }

        public Criteria andCaiwuruanjianLike(String value) {
            addCriterion("CAIWURUANJIAN like", value, "caiwuruanjian");
            return (Criteria) this;
        }

        public Criteria andCaiwuruanjianNotLike(String value) {
            addCriterion("CAIWURUANJIAN not like", value, "caiwuruanjian");
            return (Criteria) this;
        }

        public Criteria andCaiwuruanjianIn(List<String> values) {
            addCriterion("CAIWURUANJIAN in", values, "caiwuruanjian");
            return (Criteria) this;
        }

        public Criteria andCaiwuruanjianNotIn(List<String> values) {
            addCriterion("CAIWURUANJIAN not in", values, "caiwuruanjian");
            return (Criteria) this;
        }

        public Criteria andCaiwuruanjianBetween(String value1, String value2) {
            addCriterion("CAIWURUANJIAN between", value1, value2, "caiwuruanjian");
            return (Criteria) this;
        }

        public Criteria andCaiwuruanjianNotBetween(String value1, String value2) {
            addCriterion("CAIWURUANJIAN not between", value1, value2, "caiwuruanjian");
            return (Criteria) this;
        }

        public Criteria andZhengshubaoguandiIsNull() {
            addCriterion("ZHENGSHUBAOGUANDI is null");
            return (Criteria) this;
        }

        public Criteria andZhengshubaoguandiIsNotNull() {
            addCriterion("ZHENGSHUBAOGUANDI is not null");
            return (Criteria) this;
        }

        public Criteria andZhengshubaoguandiEqualTo(String value) {
            addCriterion("ZHENGSHUBAOGUANDI =", value, "zhengshubaoguandi");
            return (Criteria) this;
        }

        public Criteria andZhengshubaoguandiNotEqualTo(String value) {
            addCriterion("ZHENGSHUBAOGUANDI <>", value, "zhengshubaoguandi");
            return (Criteria) this;
        }

        public Criteria andZhengshubaoguandiGreaterThan(String value) {
            addCriterion("ZHENGSHUBAOGUANDI >", value, "zhengshubaoguandi");
            return (Criteria) this;
        }

        public Criteria andZhengshubaoguandiGreaterThanOrEqualTo(String value) {
            addCriterion("ZHENGSHUBAOGUANDI >=", value, "zhengshubaoguandi");
            return (Criteria) this;
        }

        public Criteria andZhengshubaoguandiLessThan(String value) {
            addCriterion("ZHENGSHUBAOGUANDI <", value, "zhengshubaoguandi");
            return (Criteria) this;
        }

        public Criteria andZhengshubaoguandiLessThanOrEqualTo(String value) {
            addCriterion("ZHENGSHUBAOGUANDI <=", value, "zhengshubaoguandi");
            return (Criteria) this;
        }

        public Criteria andZhengshubaoguandiLike(String value) {
            addCriterion("ZHENGSHUBAOGUANDI like", value, "zhengshubaoguandi");
            return (Criteria) this;
        }

        public Criteria andZhengshubaoguandiNotLike(String value) {
            addCriterion("ZHENGSHUBAOGUANDI not like", value, "zhengshubaoguandi");
            return (Criteria) this;
        }

        public Criteria andZhengshubaoguandiIn(List<String> values) {
            addCriterion("ZHENGSHUBAOGUANDI in", values, "zhengshubaoguandi");
            return (Criteria) this;
        }

        public Criteria andZhengshubaoguandiNotIn(List<String> values) {
            addCriterion("ZHENGSHUBAOGUANDI not in", values, "zhengshubaoguandi");
            return (Criteria) this;
        }

        public Criteria andZhengshubaoguandiBetween(String value1, String value2) {
            addCriterion("ZHENGSHUBAOGUANDI between", value1, value2, "zhengshubaoguandi");
            return (Criteria) this;
        }

        public Criteria andZhengshubaoguandiNotBetween(String value1, String value2) {
            addCriterion("ZHENGSHUBAOGUANDI not between", value1, value2, "zhengshubaoguandi");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiIsNull() {
            addCriterion("YINZHANGBAOGUANDI is null");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiIsNotNull() {
            addCriterion("YINZHANGBAOGUANDI is not null");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiEqualTo(String value) {
            addCriterion("YINZHANGBAOGUANDI =", value, "yinzhangbaoguandi");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiNotEqualTo(String value) {
            addCriterion("YINZHANGBAOGUANDI <>", value, "yinzhangbaoguandi");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiGreaterThan(String value) {
            addCriterion("YINZHANGBAOGUANDI >", value, "yinzhangbaoguandi");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiGreaterThanOrEqualTo(String value) {
            addCriterion("YINZHANGBAOGUANDI >=", value, "yinzhangbaoguandi");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiLessThan(String value) {
            addCriterion("YINZHANGBAOGUANDI <", value, "yinzhangbaoguandi");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiLessThanOrEqualTo(String value) {
            addCriterion("YINZHANGBAOGUANDI <=", value, "yinzhangbaoguandi");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiLike(String value) {
            addCriterion("YINZHANGBAOGUANDI like", value, "yinzhangbaoguandi");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiNotLike(String value) {
            addCriterion("YINZHANGBAOGUANDI not like", value, "yinzhangbaoguandi");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiIn(List<String> values) {
            addCriterion("YINZHANGBAOGUANDI in", values, "yinzhangbaoguandi");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiNotIn(List<String> values) {
            addCriterion("YINZHANGBAOGUANDI not in", values, "yinzhangbaoguandi");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiBetween(String value1, String value2) {
            addCriterion("YINZHANGBAOGUANDI between", value1, value2, "yinzhangbaoguandi");
            return (Criteria) this;
        }

        public Criteria andYinzhangbaoguandiNotBetween(String value1, String value2) {
            addCriterion("YINZHANGBAOGUANDI not between", value1, value2, "yinzhangbaoguandi");
            return (Criteria) this;
        }

        public Criteria andGuoshuiIsNull() {
            addCriterion("GUOSHUI is null");
            return (Criteria) this;
        }

        public Criteria andGuoshuiIsNotNull() {
            addCriterion("GUOSHUI is not null");
            return (Criteria) this;
        }

        public Criteria andGuoshuiEqualTo(Object value) {
            addCriterion("GUOSHUI =", value, "guoshui");
            return (Criteria) this;
        }

        public Criteria andGuoshuiNotEqualTo(Object value) {
            addCriterion("GUOSHUI <>", value, "guoshui");
            return (Criteria) this;
        }

        public Criteria andGuoshuiGreaterThan(Object value) {
            addCriterion("GUOSHUI >", value, "guoshui");
            return (Criteria) this;
        }

        public Criteria andGuoshuiGreaterThanOrEqualTo(Object value) {
            addCriterion("GUOSHUI >=", value, "guoshui");
            return (Criteria) this;
        }

        public Criteria andGuoshuiLessThan(Object value) {
            addCriterion("GUOSHUI <", value, "guoshui");
            return (Criteria) this;
        }

        public Criteria andGuoshuiLessThanOrEqualTo(Object value) {
            addCriterion("GUOSHUI <=", value, "guoshui");
            return (Criteria) this;
        }

        public Criteria andGuoshuiIn(List<Object> values) {
            addCriterion("GUOSHUI in", values, "guoshui");
            return (Criteria) this;
        }

        public Criteria andGuoshuiNotIn(List<Object> values) {
            addCriterion("GUOSHUI not in", values, "guoshui");
            return (Criteria) this;
        }

        public Criteria andGuoshuiBetween(Object value1, Object value2) {
            addCriterion("GUOSHUI between", value1, value2, "guoshui");
            return (Criteria) this;
        }

        public Criteria andGuoshuiNotBetween(Object value1, Object value2) {
            addCriterion("GUOSHUI not between", value1, value2, "guoshui");
            return (Criteria) this;
        }

        public Criteria andDishuiIsNull() {
            addCriterion("DISHUI is null");
            return (Criteria) this;
        }

        public Criteria andDishuiIsNotNull() {
            addCriterion("DISHUI is not null");
            return (Criteria) this;
        }

        public Criteria andDishuiEqualTo(Object value) {
            addCriterion("DISHUI =", value, "dishui");
            return (Criteria) this;
        }

        public Criteria andDishuiNotEqualTo(Object value) {
            addCriterion("DISHUI <>", value, "dishui");
            return (Criteria) this;
        }

        public Criteria andDishuiGreaterThan(Object value) {
            addCriterion("DISHUI >", value, "dishui");
            return (Criteria) this;
        }

        public Criteria andDishuiGreaterThanOrEqualTo(Object value) {
            addCriterion("DISHUI >=", value, "dishui");
            return (Criteria) this;
        }

        public Criteria andDishuiLessThan(Object value) {
            addCriterion("DISHUI <", value, "dishui");
            return (Criteria) this;
        }

        public Criteria andDishuiLessThanOrEqualTo(Object value) {
            addCriterion("DISHUI <=", value, "dishui");
            return (Criteria) this;
        }

        public Criteria andDishuiIn(List<Object> values) {
            addCriterion("DISHUI in", values, "dishui");
            return (Criteria) this;
        }

        public Criteria andDishuiNotIn(List<Object> values) {
            addCriterion("DISHUI not in", values, "dishui");
            return (Criteria) this;
        }

        public Criteria andDishuiBetween(Object value1, Object value2) {
            addCriterion("DISHUI between", value1, value2, "dishui");
            return (Criteria) this;
        }

        public Criteria andDishuiNotBetween(Object value1, Object value2) {
            addCriterion("DISHUI not between", value1, value2, "dishui");
            return (Criteria) this;
        }

        public Criteria andWeidengjiIsNull() {
            addCriterion("WEIDENGJI is null");
            return (Criteria) this;
        }

        public Criteria andWeidengjiIsNotNull() {
            addCriterion("WEIDENGJI is not null");
            return (Criteria) this;
        }

        public Criteria andWeidengjiEqualTo(Object value) {
            addCriterion("WEIDENGJI =", value, "weidengji");
            return (Criteria) this;
        }

        public Criteria andWeidengjiNotEqualTo(Object value) {
            addCriterion("WEIDENGJI <>", value, "weidengji");
            return (Criteria) this;
        }

        public Criteria andWeidengjiGreaterThan(Object value) {
            addCriterion("WEIDENGJI >", value, "weidengji");
            return (Criteria) this;
        }

        public Criteria andWeidengjiGreaterThanOrEqualTo(Object value) {
            addCriterion("WEIDENGJI >=", value, "weidengji");
            return (Criteria) this;
        }

        public Criteria andWeidengjiLessThan(Object value) {
            addCriterion("WEIDENGJI <", value, "weidengji");
            return (Criteria) this;
        }

        public Criteria andWeidengjiLessThanOrEqualTo(Object value) {
            addCriterion("WEIDENGJI <=", value, "weidengji");
            return (Criteria) this;
        }

        public Criteria andWeidengjiIn(List<Object> values) {
            addCriterion("WEIDENGJI in", values, "weidengji");
            return (Criteria) this;
        }

        public Criteria andWeidengjiNotIn(List<Object> values) {
            addCriterion("WEIDENGJI not in", values, "weidengji");
            return (Criteria) this;
        }

        public Criteria andWeidengjiBetween(Object value1, Object value2) {
            addCriterion("WEIDENGJI between", value1, value2, "weidengji");
            return (Criteria) this;
        }

        public Criteria andWeidengjiNotBetween(Object value1, Object value2) {
            addCriterion("WEIDENGJI not between", value1, value2, "weidengji");
            return (Criteria) this;
        }

        public Criteria andYinqianshoujuIsNull() {
            addCriterion("YINQIANSHOUJU is null");
            return (Criteria) this;
        }

        public Criteria andYinqianshoujuIsNotNull() {
            addCriterion("YINQIANSHOUJU is not null");
            return (Criteria) this;
        }

        public Criteria andYinqianshoujuEqualTo(Object value) {
            addCriterion("YINQIANSHOUJU =", value, "yinqianshouju");
            return (Criteria) this;
        }

        public Criteria andYinqianshoujuNotEqualTo(Object value) {
            addCriterion("YINQIANSHOUJU <>", value, "yinqianshouju");
            return (Criteria) this;
        }

        public Criteria andYinqianshoujuGreaterThan(Object value) {
            addCriterion("YINQIANSHOUJU >", value, "yinqianshouju");
            return (Criteria) this;
        }

        public Criteria andYinqianshoujuGreaterThanOrEqualTo(Object value) {
            addCriterion("YINQIANSHOUJU >=", value, "yinqianshouju");
            return (Criteria) this;
        }

        public Criteria andYinqianshoujuLessThan(Object value) {
            addCriterion("YINQIANSHOUJU <", value, "yinqianshouju");
            return (Criteria) this;
        }

        public Criteria andYinqianshoujuLessThanOrEqualTo(Object value) {
            addCriterion("YINQIANSHOUJU <=", value, "yinqianshouju");
            return (Criteria) this;
        }

        public Criteria andYinqianshoujuIn(List<Object> values) {
            addCriterion("YINQIANSHOUJU in", values, "yinqianshouju");
            return (Criteria) this;
        }

        public Criteria andYinqianshoujuNotIn(List<Object> values) {
            addCriterion("YINQIANSHOUJU not in", values, "yinqianshouju");
            return (Criteria) this;
        }

        public Criteria andYinqianshoujuBetween(Object value1, Object value2) {
            addCriterion("YINQIANSHOUJU between", value1, value2, "yinqianshouju");
            return (Criteria) this;
        }

        public Criteria andYinqianshoujuNotBetween(Object value1, Object value2) {
            addCriterion("YINQIANSHOUJU not between", value1, value2, "yinqianshouju");
            return (Criteria) this;
        }

        public Criteria andHuifeishoujuIsNull() {
            addCriterion("HUIFEISHOUJU is null");
            return (Criteria) this;
        }

        public Criteria andHuifeishoujuIsNotNull() {
            addCriterion("HUIFEISHOUJU is not null");
            return (Criteria) this;
        }

        public Criteria andHuifeishoujuEqualTo(Object value) {
            addCriterion("HUIFEISHOUJU =", value, "huifeishouju");
            return (Criteria) this;
        }

        public Criteria andHuifeishoujuNotEqualTo(Object value) {
            addCriterion("HUIFEISHOUJU <>", value, "huifeishouju");
            return (Criteria) this;
        }

        public Criteria andHuifeishoujuGreaterThan(Object value) {
            addCriterion("HUIFEISHOUJU >", value, "huifeishouju");
            return (Criteria) this;
        }

        public Criteria andHuifeishoujuGreaterThanOrEqualTo(Object value) {
            addCriterion("HUIFEISHOUJU >=", value, "huifeishouju");
            return (Criteria) this;
        }

        public Criteria andHuifeishoujuLessThan(Object value) {
            addCriterion("HUIFEISHOUJU <", value, "huifeishouju");
            return (Criteria) this;
        }

        public Criteria andHuifeishoujuLessThanOrEqualTo(Object value) {
            addCriterion("HUIFEISHOUJU <=", value, "huifeishouju");
            return (Criteria) this;
        }

        public Criteria andHuifeishoujuIn(List<Object> values) {
            addCriterion("HUIFEISHOUJU in", values, "huifeishouju");
            return (Criteria) this;
        }

        public Criteria andHuifeishoujuNotIn(List<Object> values) {
            addCriterion("HUIFEISHOUJU not in", values, "huifeishouju");
            return (Criteria) this;
        }

        public Criteria andHuifeishoujuBetween(Object value1, Object value2) {
            addCriterion("HUIFEISHOUJU between", value1, value2, "huifeishouju");
            return (Criteria) this;
        }

        public Criteria andHuifeishoujuNotBetween(Object value1, Object value2) {
            addCriterion("HUIFEISHOUJU not between", value1, value2, "huifeishouju");
            return (Criteria) this;
        }

        public Criteria andJuanzengshoujuIsNull() {
            addCriterion("JUANZENGSHOUJU is null");
            return (Criteria) this;
        }

        public Criteria andJuanzengshoujuIsNotNull() {
            addCriterion("JUANZENGSHOUJU is not null");
            return (Criteria) this;
        }

        public Criteria andJuanzengshoujuEqualTo(Object value) {
            addCriterion("JUANZENGSHOUJU =", value, "juanzengshouju");
            return (Criteria) this;
        }

        public Criteria andJuanzengshoujuNotEqualTo(Object value) {
            addCriterion("JUANZENGSHOUJU <>", value, "juanzengshouju");
            return (Criteria) this;
        }

        public Criteria andJuanzengshoujuGreaterThan(Object value) {
            addCriterion("JUANZENGSHOUJU >", value, "juanzengshouju");
            return (Criteria) this;
        }

        public Criteria andJuanzengshoujuGreaterThanOrEqualTo(Object value) {
            addCriterion("JUANZENGSHOUJU >=", value, "juanzengshouju");
            return (Criteria) this;
        }

        public Criteria andJuanzengshoujuLessThan(Object value) {
            addCriterion("JUANZENGSHOUJU <", value, "juanzengshouju");
            return (Criteria) this;
        }

        public Criteria andJuanzengshoujuLessThanOrEqualTo(Object value) {
            addCriterion("JUANZENGSHOUJU <=", value, "juanzengshouju");
            return (Criteria) this;
        }

        public Criteria andJuanzengshoujuIn(List<Object> values) {
            addCriterion("JUANZENGSHOUJU in", values, "juanzengshouju");
            return (Criteria) this;
        }

        public Criteria andJuanzengshoujuNotIn(List<Object> values) {
            addCriterion("JUANZENGSHOUJU not in", values, "juanzengshouju");
            return (Criteria) this;
        }

        public Criteria andJuanzengshoujuBetween(Object value1, Object value2) {
            addCriterion("JUANZENGSHOUJU between", value1, value2, "juanzengshouju");
            return (Criteria) this;
        }

        public Criteria andJuanzengshoujuNotBetween(Object value1, Object value2) {
            addCriterion("JUANZENGSHOUJU not between", value1, value2, "juanzengshouju");
            return (Criteria) this;
        }

        public Criteria andShuiwufapiaoIsNull() {
            addCriterion("SHUIWUFAPIAO is null");
            return (Criteria) this;
        }

        public Criteria andShuiwufapiaoIsNotNull() {
            addCriterion("SHUIWUFAPIAO is not null");
            return (Criteria) this;
        }

        public Criteria andShuiwufapiaoEqualTo(Object value) {
            addCriterion("SHUIWUFAPIAO =", value, "shuiwufapiao");
            return (Criteria) this;
        }

        public Criteria andShuiwufapiaoNotEqualTo(Object value) {
            addCriterion("SHUIWUFAPIAO <>", value, "shuiwufapiao");
            return (Criteria) this;
        }

        public Criteria andShuiwufapiaoGreaterThan(Object value) {
            addCriterion("SHUIWUFAPIAO >", value, "shuiwufapiao");
            return (Criteria) this;
        }

        public Criteria andShuiwufapiaoGreaterThanOrEqualTo(Object value) {
            addCriterion("SHUIWUFAPIAO >=", value, "shuiwufapiao");
            return (Criteria) this;
        }

        public Criteria andShuiwufapiaoLessThan(Object value) {
            addCriterion("SHUIWUFAPIAO <", value, "shuiwufapiao");
            return (Criteria) this;
        }

        public Criteria andShuiwufapiaoLessThanOrEqualTo(Object value) {
            addCriterion("SHUIWUFAPIAO <=", value, "shuiwufapiao");
            return (Criteria) this;
        }

        public Criteria andShuiwufapiaoIn(List<Object> values) {
            addCriterion("SHUIWUFAPIAO in", values, "shuiwufapiao");
            return (Criteria) this;
        }

        public Criteria andShuiwufapiaoNotIn(List<Object> values) {
            addCriterion("SHUIWUFAPIAO not in", values, "shuiwufapiao");
            return (Criteria) this;
        }

        public Criteria andShuiwufapiaoBetween(Object value1, Object value2) {
            addCriterion("SHUIWUFAPIAO between", value1, value2, "shuiwufapiao");
            return (Criteria) this;
        }

        public Criteria andShuiwufapiaoNotBetween(Object value1, Object value2) {
            addCriterion("SHUIWUFAPIAO not between", value1, value2, "shuiwufapiao");
            return (Criteria) this;
        }

        public Criteria andQitapiaojuIsNull() {
            addCriterion("QITAPIAOJU is null");
            return (Criteria) this;
        }

        public Criteria andQitapiaojuIsNotNull() {
            addCriterion("QITAPIAOJU is not null");
            return (Criteria) this;
        }

        public Criteria andQitapiaojuEqualTo(Object value) {
            addCriterion("QITAPIAOJU =", value, "qitapiaoju");
            return (Criteria) this;
        }

        public Criteria andQitapiaojuNotEqualTo(Object value) {
            addCriterion("QITAPIAOJU <>", value, "qitapiaoju");
            return (Criteria) this;
        }

        public Criteria andQitapiaojuGreaterThan(Object value) {
            addCriterion("QITAPIAOJU >", value, "qitapiaoju");
            return (Criteria) this;
        }

        public Criteria andQitapiaojuGreaterThanOrEqualTo(Object value) {
            addCriterion("QITAPIAOJU >=", value, "qitapiaoju");
            return (Criteria) this;
        }

        public Criteria andQitapiaojuLessThan(Object value) {
            addCriterion("QITAPIAOJU <", value, "qitapiaoju");
            return (Criteria) this;
        }

        public Criteria andQitapiaojuLessThanOrEqualTo(Object value) {
            addCriterion("QITAPIAOJU <=", value, "qitapiaoju");
            return (Criteria) this;
        }

        public Criteria andQitapiaojuIn(List<Object> values) {
            addCriterion("QITAPIAOJU in", values, "qitapiaoju");
            return (Criteria) this;
        }

        public Criteria andQitapiaojuNotIn(List<Object> values) {
            addCriterion("QITAPIAOJU not in", values, "qitapiaoju");
            return (Criteria) this;
        }

        public Criteria andQitapiaojuBetween(Object value1, Object value2) {
            addCriterion("QITAPIAOJU between", value1, value2, "qitapiaoju");
            return (Criteria) this;
        }

        public Criteria andQitapiaojuNotBetween(Object value1, Object value2) {
            addCriterion("QITAPIAOJU not between", value1, value2, "qitapiaoju");
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

        public Criteria andNianduEqualTo(Object value) {
            addCriterion("NIANDU =", value, "niandu");
            return (Criteria) this;
        }

        public Criteria andNianduNotEqualTo(Object value) {
            addCriterion("NIANDU <>", value, "niandu");
            return (Criteria) this;
        }

        public Criteria andNianduGreaterThan(Object value) {
            addCriterion("NIANDU >", value, "niandu");
            return (Criteria) this;
        }

        public Criteria andNianduGreaterThanOrEqualTo(Object value) {
            addCriterion("NIANDU >=", value, "niandu");
            return (Criteria) this;
        }

        public Criteria andNianduLessThan(Object value) {
            addCriterion("NIANDU <", value, "niandu");
            return (Criteria) this;
        }

        public Criteria andNianduLessThanOrEqualTo(Object value) {
            addCriterion("NIANDU <=", value, "niandu");
            return (Criteria) this;
        }

        public Criteria andNianduIn(List<Object> values) {
            addCriterion("NIANDU in", values, "niandu");
            return (Criteria) this;
        }

        public Criteria andNianduNotIn(List<Object> values) {
            addCriterion("NIANDU not in", values, "niandu");
            return (Criteria) this;
        }

        public Criteria andNianduBetween(Object value1, Object value2) {
            addCriterion("NIANDU between", value1, value2, "niandu");
            return (Criteria) this;
        }

        public Criteria andNianduNotBetween(Object value1, Object value2) {
            addCriterion("NIANDU not between", value1, value2, "niandu");
            return (Criteria) this;
        }

        public Criteria andBgzongzhiIsNull() {
            addCriterion("BGZONGZHI is null");
            return (Criteria) this;
        }

        public Criteria andBgzongzhiIsNotNull() {
            addCriterion("BGZONGZHI is not null");
            return (Criteria) this;
        }

        public Criteria andBgzongzhiEqualTo(String value) {
            addCriterion("BGZONGZHI =", value, "bgzongzhi");
            return (Criteria) this;
        }

        public Criteria andBgzongzhiNotEqualTo(String value) {
            addCriterion("BGZONGZHI <>", value, "bgzongzhi");
            return (Criteria) this;
        }

        public Criteria andBgzongzhiGreaterThan(String value) {
            addCriterion("BGZONGZHI >", value, "bgzongzhi");
            return (Criteria) this;
        }

        public Criteria andBgzongzhiGreaterThanOrEqualTo(String value) {
            addCriterion("BGZONGZHI >=", value, "bgzongzhi");
            return (Criteria) this;
        }

        public Criteria andBgzongzhiLessThan(String value) {
            addCriterion("BGZONGZHI <", value, "bgzongzhi");
            return (Criteria) this;
        }

        public Criteria andBgzongzhiLessThanOrEqualTo(String value) {
            addCriterion("BGZONGZHI <=", value, "bgzongzhi");
            return (Criteria) this;
        }

        public Criteria andBgzongzhiLike(String value) {
            addCriterion("BGZONGZHI like", value, "bgzongzhi");
            return (Criteria) this;
        }

        public Criteria andBgzongzhiNotLike(String value) {
            addCriterion("BGZONGZHI not like", value, "bgzongzhi");
            return (Criteria) this;
        }

        public Criteria andBgzongzhiIn(List<String> values) {
            addCriterion("BGZONGZHI in", values, "bgzongzhi");
            return (Criteria) this;
        }

        public Criteria andBgzongzhiNotIn(List<String> values) {
            addCriterion("BGZONGZHI not in", values, "bgzongzhi");
            return (Criteria) this;
        }

        public Criteria andBgzongzhiBetween(String value1, String value2) {
            addCriterion("BGZONGZHI between", value1, value2, "bgzongzhi");
            return (Criteria) this;
        }

        public Criteria andBgzongzhiNotBetween(String value1, String value2) {
            addCriterion("BGZONGZHI not between", value1, value2, "bgzongzhi");
            return (Criteria) this;
        }

        public Criteria andBgzongzhibanliIsNull() {
            addCriterion("BGZONGZHIBANLI is null");
            return (Criteria) this;
        }

        public Criteria andBgzongzhibanliIsNotNull() {
            addCriterion("BGZONGZHIBANLI is not null");
            return (Criteria) this;
        }

        public Criteria andBgzongzhibanliEqualTo(String value) {
            addCriterion("BGZONGZHIBANLI =", value, "bgzongzhibanli");
            return (Criteria) this;
        }

        public Criteria andBgzongzhibanliNotEqualTo(String value) {
            addCriterion("BGZONGZHIBANLI <>", value, "bgzongzhibanli");
            return (Criteria) this;
        }

        public Criteria andBgzongzhibanliGreaterThan(String value) {
            addCriterion("BGZONGZHIBANLI >", value, "bgzongzhibanli");
            return (Criteria) this;
        }

        public Criteria andBgzongzhibanliGreaterThanOrEqualTo(String value) {
            addCriterion("BGZONGZHIBANLI >=", value, "bgzongzhibanli");
            return (Criteria) this;
        }

        public Criteria andBgzongzhibanliLessThan(String value) {
            addCriterion("BGZONGZHIBANLI <", value, "bgzongzhibanli");
            return (Criteria) this;
        }

        public Criteria andBgzongzhibanliLessThanOrEqualTo(String value) {
            addCriterion("BGZONGZHIBANLI <=", value, "bgzongzhibanli");
            return (Criteria) this;
        }

        public Criteria andBgzongzhibanliLike(String value) {
            addCriterion("BGZONGZHIBANLI like", value, "bgzongzhibanli");
            return (Criteria) this;
        }

        public Criteria andBgzongzhibanliNotLike(String value) {
            addCriterion("BGZONGZHIBANLI not like", value, "bgzongzhibanli");
            return (Criteria) this;
        }

        public Criteria andBgzongzhibanliIn(List<String> values) {
            addCriterion("BGZONGZHIBANLI in", values, "bgzongzhibanli");
            return (Criteria) this;
        }

        public Criteria andBgzongzhibanliNotIn(List<String> values) {
            addCriterion("BGZONGZHIBANLI not in", values, "bgzongzhibanli");
            return (Criteria) this;
        }

        public Criteria andBgzongzhibanliBetween(String value1, String value2) {
            addCriterion("BGZONGZHIBANLI between", value1, value2, "bgzongzhibanli");
            return (Criteria) this;
        }

        public Criteria andBgzongzhibanliNotBetween(String value1, String value2) {
            addCriterion("BGZONGZHIBANLI not between", value1, value2, "bgzongzhibanli");
            return (Criteria) this;
        }

        public Criteria andBgzongzhishijianIsNull() {
            addCriterion("BGZONGZHISHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andBgzongzhishijianIsNotNull() {
            addCriterion("BGZONGZHISHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andBgzongzhishijianEqualTo(Date value) {
            addCriterion("BGZONGZHISHIJIAN =", value, "bgzongzhishijian");
            return (Criteria) this;
        }

        public Criteria andBgzongzhishijianNotEqualTo(Date value) {
            addCriterion("BGZONGZHISHIJIAN <>", value, "bgzongzhishijian");
            return (Criteria) this;
        }

        public Criteria andBgzongzhishijianGreaterThan(Date value) {
            addCriterion("BGZONGZHISHIJIAN >", value, "bgzongzhishijian");
            return (Criteria) this;
        }

        public Criteria andBgzongzhishijianGreaterThanOrEqualTo(Date value) {
            addCriterion("BGZONGZHISHIJIAN >=", value, "bgzongzhishijian");
            return (Criteria) this;
        }

        public Criteria andBgzongzhishijianLessThan(Date value) {
            addCriterion("BGZONGZHISHIJIAN <", value, "bgzongzhishijian");
            return (Criteria) this;
        }

        public Criteria andBgzongzhishijianLessThanOrEqualTo(Date value) {
            addCriterion("BGZONGZHISHIJIAN <=", value, "bgzongzhishijian");
            return (Criteria) this;
        }

        public Criteria andBgzongzhishijianIn(List<Date> values) {
            addCriterion("BGZONGZHISHIJIAN in", values, "bgzongzhishijian");
            return (Criteria) this;
        }

        public Criteria andBgzongzhishijianNotIn(List<Date> values) {
            addCriterion("BGZONGZHISHIJIAN not in", values, "bgzongzhishijian");
            return (Criteria) this;
        }

        public Criteria andBgzongzhishijianBetween(Date value1, Date value2) {
            addCriterion("BGZONGZHISHIJIAN between", value1, value2, "bgzongzhishijian");
            return (Criteria) this;
        }

        public Criteria andBgzongzhishijianNotBetween(Date value1, Date value2) {
            addCriterion("BGZONGZHISHIJIAN not between", value1, value2, "bgzongzhishijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengIsNull() {
            addCriterion("BGFENZHIMINGCHENG is null");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengIsNotNull() {
            addCriterion("BGFENZHIMINGCHENG is not null");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengEqualTo(String value) {
            addCriterion("BGFENZHIMINGCHENG =", value, "bgfenzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengNotEqualTo(String value) {
            addCriterion("BGFENZHIMINGCHENG <>", value, "bgfenzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengGreaterThan(String value) {
            addCriterion("BGFENZHIMINGCHENG >", value, "bgfenzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengGreaterThanOrEqualTo(String value) {
            addCriterion("BGFENZHIMINGCHENG >=", value, "bgfenzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengLessThan(String value) {
            addCriterion("BGFENZHIMINGCHENG <", value, "bgfenzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengLessThanOrEqualTo(String value) {
            addCriterion("BGFENZHIMINGCHENG <=", value, "bgfenzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengLike(String value) {
            addCriterion("BGFENZHIMINGCHENG like", value, "bgfenzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengNotLike(String value) {
            addCriterion("BGFENZHIMINGCHENG not like", value, "bgfenzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengIn(List<String> values) {
            addCriterion("BGFENZHIMINGCHENG in", values, "bgfenzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengNotIn(List<String> values) {
            addCriterion("BGFENZHIMINGCHENG not in", values, "bgfenzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengBetween(String value1, String value2) {
            addCriterion("BGFENZHIMINGCHENG between", value1, value2, "bgfenzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengNotBetween(String value1, String value2) {
            addCriterion("BGFENZHIMINGCHENG not between", value1, value2, "bgfenzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengbanliIsNull() {
            addCriterion("BGFENZHIMINGCHENGBANLI is null");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengbanliIsNotNull() {
            addCriterion("BGFENZHIMINGCHENGBANLI is not null");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengbanliEqualTo(String value) {
            addCriterion("BGFENZHIMINGCHENGBANLI =", value, "bgfenzhimingchengbanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengbanliNotEqualTo(String value) {
            addCriterion("BGFENZHIMINGCHENGBANLI <>", value, "bgfenzhimingchengbanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengbanliGreaterThan(String value) {
            addCriterion("BGFENZHIMINGCHENGBANLI >", value, "bgfenzhimingchengbanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengbanliGreaterThanOrEqualTo(String value) {
            addCriterion("BGFENZHIMINGCHENGBANLI >=", value, "bgfenzhimingchengbanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengbanliLessThan(String value) {
            addCriterion("BGFENZHIMINGCHENGBANLI <", value, "bgfenzhimingchengbanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengbanliLessThanOrEqualTo(String value) {
            addCriterion("BGFENZHIMINGCHENGBANLI <=", value, "bgfenzhimingchengbanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengbanliLike(String value) {
            addCriterion("BGFENZHIMINGCHENGBANLI like", value, "bgfenzhimingchengbanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengbanliNotLike(String value) {
            addCriterion("BGFENZHIMINGCHENGBANLI not like", value, "bgfenzhimingchengbanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengbanliIn(List<String> values) {
            addCriterion("BGFENZHIMINGCHENGBANLI in", values, "bgfenzhimingchengbanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengbanliNotIn(List<String> values) {
            addCriterion("BGFENZHIMINGCHENGBANLI not in", values, "bgfenzhimingchengbanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengbanliBetween(String value1, String value2) {
            addCriterion("BGFENZHIMINGCHENGBANLI between", value1, value2, "bgfenzhimingchengbanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengbanliNotBetween(String value1, String value2) {
            addCriterion("BGFENZHIMINGCHENGBANLI not between", value1, value2, "bgfenzhimingchengbanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengshijianIsNull() {
            addCriterion("BGFENZHIMINGCHENGSHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengshijianIsNotNull() {
            addCriterion("BGFENZHIMINGCHENGSHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengshijianEqualTo(Date value) {
            addCriterion("BGFENZHIMINGCHENGSHIJIAN =", value, "bgfenzhimingchengshijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengshijianNotEqualTo(Date value) {
            addCriterion("BGFENZHIMINGCHENGSHIJIAN <>", value, "bgfenzhimingchengshijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengshijianGreaterThan(Date value) {
            addCriterion("BGFENZHIMINGCHENGSHIJIAN >", value, "bgfenzhimingchengshijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("BGFENZHIMINGCHENGSHIJIAN >=", value, "bgfenzhimingchengshijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengshijianLessThan(Date value) {
            addCriterion("BGFENZHIMINGCHENGSHIJIAN <", value, "bgfenzhimingchengshijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengshijianLessThanOrEqualTo(Date value) {
            addCriterion("BGFENZHIMINGCHENGSHIJIAN <=", value, "bgfenzhimingchengshijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengshijianIn(List<Date> values) {
            addCriterion("BGFENZHIMINGCHENGSHIJIAN in", values, "bgfenzhimingchengshijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengshijianNotIn(List<Date> values) {
            addCriterion("BGFENZHIMINGCHENGSHIJIAN not in", values, "bgfenzhimingchengshijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengshijianBetween(Date value1, Date value2) {
            addCriterion("BGFENZHIMINGCHENGSHIJIAN between", value1, value2, "bgfenzhimingchengshijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhimingchengshijianNotBetween(Date value1, Date value2) {
            addCriterion("BGFENZHIMINGCHENGSHIJIAN not between", value1, value2, "bgfenzhimingchengshijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewufanweiIsNull() {
            addCriterion("BGFENZHIYEWUFANWEI is null");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewufanweiIsNotNull() {
            addCriterion("BGFENZHIYEWUFANWEI is not null");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewufanweiEqualTo(String value) {
            addCriterion("BGFENZHIYEWUFANWEI =", value, "bgfenzhiyewufanwei");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewufanweiNotEqualTo(String value) {
            addCriterion("BGFENZHIYEWUFANWEI <>", value, "bgfenzhiyewufanwei");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewufanweiGreaterThan(String value) {
            addCriterion("BGFENZHIYEWUFANWEI >", value, "bgfenzhiyewufanwei");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewufanweiGreaterThanOrEqualTo(String value) {
            addCriterion("BGFENZHIYEWUFANWEI >=", value, "bgfenzhiyewufanwei");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewufanweiLessThan(String value) {
            addCriterion("BGFENZHIYEWUFANWEI <", value, "bgfenzhiyewufanwei");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewufanweiLessThanOrEqualTo(String value) {
            addCriterion("BGFENZHIYEWUFANWEI <=", value, "bgfenzhiyewufanwei");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewufanweiLike(String value) {
            addCriterion("BGFENZHIYEWUFANWEI like", value, "bgfenzhiyewufanwei");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewufanweiNotLike(String value) {
            addCriterion("BGFENZHIYEWUFANWEI not like", value, "bgfenzhiyewufanwei");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewufanweiIn(List<String> values) {
            addCriterion("BGFENZHIYEWUFANWEI in", values, "bgfenzhiyewufanwei");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewufanweiNotIn(List<String> values) {
            addCriterion("BGFENZHIYEWUFANWEI not in", values, "bgfenzhiyewufanwei");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewufanweiBetween(String value1, String value2) {
            addCriterion("BGFENZHIYEWUFANWEI between", value1, value2, "bgfenzhiyewufanwei");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewufanweiNotBetween(String value1, String value2) {
            addCriterion("BGFENZHIYEWUFANWEI not between", value1, value2, "bgfenzhiyewufanwei");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewubanliIsNull() {
            addCriterion("BGFENZHIYEWUBANLI is null");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewubanliIsNotNull() {
            addCriterion("BGFENZHIYEWUBANLI is not null");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewubanliEqualTo(String value) {
            addCriterion("BGFENZHIYEWUBANLI =", value, "bgfenzhiyewubanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewubanliNotEqualTo(String value) {
            addCriterion("BGFENZHIYEWUBANLI <>", value, "bgfenzhiyewubanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewubanliGreaterThan(String value) {
            addCriterion("BGFENZHIYEWUBANLI >", value, "bgfenzhiyewubanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewubanliGreaterThanOrEqualTo(String value) {
            addCriterion("BGFENZHIYEWUBANLI >=", value, "bgfenzhiyewubanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewubanliLessThan(String value) {
            addCriterion("BGFENZHIYEWUBANLI <", value, "bgfenzhiyewubanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewubanliLessThanOrEqualTo(String value) {
            addCriterion("BGFENZHIYEWUBANLI <=", value, "bgfenzhiyewubanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewubanliLike(String value) {
            addCriterion("BGFENZHIYEWUBANLI like", value, "bgfenzhiyewubanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewubanliNotLike(String value) {
            addCriterion("BGFENZHIYEWUBANLI not like", value, "bgfenzhiyewubanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewubanliIn(List<String> values) {
            addCriterion("BGFENZHIYEWUBANLI in", values, "bgfenzhiyewubanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewubanliNotIn(List<String> values) {
            addCriterion("BGFENZHIYEWUBANLI not in", values, "bgfenzhiyewubanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewubanliBetween(String value1, String value2) {
            addCriterion("BGFENZHIYEWUBANLI between", value1, value2, "bgfenzhiyewubanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewubanliNotBetween(String value1, String value2) {
            addCriterion("BGFENZHIYEWUBANLI not between", value1, value2, "bgfenzhiyewubanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewushijianIsNull() {
            addCriterion("BGFENZHIYEWUSHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewushijianIsNotNull() {
            addCriterion("BGFENZHIYEWUSHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewushijianEqualTo(Date value) {
            addCriterion("BGFENZHIYEWUSHIJIAN =", value, "bgfenzhiyewushijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewushijianNotEqualTo(Date value) {
            addCriterion("BGFENZHIYEWUSHIJIAN <>", value, "bgfenzhiyewushijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewushijianGreaterThan(Date value) {
            addCriterion("BGFENZHIYEWUSHIJIAN >", value, "bgfenzhiyewushijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewushijianGreaterThanOrEqualTo(Date value) {
            addCriterion("BGFENZHIYEWUSHIJIAN >=", value, "bgfenzhiyewushijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewushijianLessThan(Date value) {
            addCriterion("BGFENZHIYEWUSHIJIAN <", value, "bgfenzhiyewushijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewushijianLessThanOrEqualTo(Date value) {
            addCriterion("BGFENZHIYEWUSHIJIAN <=", value, "bgfenzhiyewushijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewushijianIn(List<Date> values) {
            addCriterion("BGFENZHIYEWUSHIJIAN in", values, "bgfenzhiyewushijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewushijianNotIn(List<Date> values) {
            addCriterion("BGFENZHIYEWUSHIJIAN not in", values, "bgfenzhiyewushijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewushijianBetween(Date value1, Date value2) {
            addCriterion("BGFENZHIYEWUSHIJIAN between", value1, value2, "bgfenzhiyewushijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhiyewushijianNotBetween(Date value1, Date value2) {
            addCriterion("BGFENZHIYEWUSHIJIAN not between", value1, value2, "bgfenzhiyewushijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenIsNull() {
            addCriterion("BGFENZHIFUZEREN is null");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenIsNotNull() {
            addCriterion("BGFENZHIFUZEREN is not null");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenEqualTo(String value) {
            addCriterion("BGFENZHIFUZEREN =", value, "bgfenzhifuzeren");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenNotEqualTo(String value) {
            addCriterion("BGFENZHIFUZEREN <>", value, "bgfenzhifuzeren");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenGreaterThan(String value) {
            addCriterion("BGFENZHIFUZEREN >", value, "bgfenzhifuzeren");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenGreaterThanOrEqualTo(String value) {
            addCriterion("BGFENZHIFUZEREN >=", value, "bgfenzhifuzeren");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenLessThan(String value) {
            addCriterion("BGFENZHIFUZEREN <", value, "bgfenzhifuzeren");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenLessThanOrEqualTo(String value) {
            addCriterion("BGFENZHIFUZEREN <=", value, "bgfenzhifuzeren");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenLike(String value) {
            addCriterion("BGFENZHIFUZEREN like", value, "bgfenzhifuzeren");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenNotLike(String value) {
            addCriterion("BGFENZHIFUZEREN not like", value, "bgfenzhifuzeren");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenIn(List<String> values) {
            addCriterion("BGFENZHIFUZEREN in", values, "bgfenzhifuzeren");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenNotIn(List<String> values) {
            addCriterion("BGFENZHIFUZEREN not in", values, "bgfenzhifuzeren");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenBetween(String value1, String value2) {
            addCriterion("BGFENZHIFUZEREN between", value1, value2, "bgfenzhifuzeren");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenNotBetween(String value1, String value2) {
            addCriterion("BGFENZHIFUZEREN not between", value1, value2, "bgfenzhifuzeren");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenbanliIsNull() {
            addCriterion("BGFENZHIFUZERENBANLI is null");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenbanliIsNotNull() {
            addCriterion("BGFENZHIFUZERENBANLI is not null");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenbanliEqualTo(String value) {
            addCriterion("BGFENZHIFUZERENBANLI =", value, "bgfenzhifuzerenbanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenbanliNotEqualTo(String value) {
            addCriterion("BGFENZHIFUZERENBANLI <>", value, "bgfenzhifuzerenbanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenbanliGreaterThan(String value) {
            addCriterion("BGFENZHIFUZERENBANLI >", value, "bgfenzhifuzerenbanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenbanliGreaterThanOrEqualTo(String value) {
            addCriterion("BGFENZHIFUZERENBANLI >=", value, "bgfenzhifuzerenbanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenbanliLessThan(String value) {
            addCriterion("BGFENZHIFUZERENBANLI <", value, "bgfenzhifuzerenbanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenbanliLessThanOrEqualTo(String value) {
            addCriterion("BGFENZHIFUZERENBANLI <=", value, "bgfenzhifuzerenbanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenbanliLike(String value) {
            addCriterion("BGFENZHIFUZERENBANLI like", value, "bgfenzhifuzerenbanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenbanliNotLike(String value) {
            addCriterion("BGFENZHIFUZERENBANLI not like", value, "bgfenzhifuzerenbanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenbanliIn(List<String> values) {
            addCriterion("BGFENZHIFUZERENBANLI in", values, "bgfenzhifuzerenbanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenbanliNotIn(List<String> values) {
            addCriterion("BGFENZHIFUZERENBANLI not in", values, "bgfenzhifuzerenbanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenbanliBetween(String value1, String value2) {
            addCriterion("BGFENZHIFUZERENBANLI between", value1, value2, "bgfenzhifuzerenbanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenbanliNotBetween(String value1, String value2) {
            addCriterion("BGFENZHIFUZERENBANLI not between", value1, value2, "bgfenzhifuzerenbanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenshijianIsNull() {
            addCriterion("BGFENZHIFUZERENSHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenshijianIsNotNull() {
            addCriterion("BGFENZHIFUZERENSHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenshijianEqualTo(Date value) {
            addCriterion("BGFENZHIFUZERENSHIJIAN =", value, "bgfenzhifuzerenshijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenshijianNotEqualTo(Date value) {
            addCriterion("BGFENZHIFUZERENSHIJIAN <>", value, "bgfenzhifuzerenshijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenshijianGreaterThan(Date value) {
            addCriterion("BGFENZHIFUZERENSHIJIAN >", value, "bgfenzhifuzerenshijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("BGFENZHIFUZERENSHIJIAN >=", value, "bgfenzhifuzerenshijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenshijianLessThan(Date value) {
            addCriterion("BGFENZHIFUZERENSHIJIAN <", value, "bgfenzhifuzerenshijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenshijianLessThanOrEqualTo(Date value) {
            addCriterion("BGFENZHIFUZERENSHIJIAN <=", value, "bgfenzhifuzerenshijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenshijianIn(List<Date> values) {
            addCriterion("BGFENZHIFUZERENSHIJIAN in", values, "bgfenzhifuzerenshijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenshijianNotIn(List<Date> values) {
            addCriterion("BGFENZHIFUZERENSHIJIAN not in", values, "bgfenzhifuzerenshijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenshijianBetween(Date value1, Date value2) {
            addCriterion("BGFENZHIFUZERENSHIJIAN between", value1, value2, "bgfenzhifuzerenshijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhifuzerenshijianNotBetween(Date value1, Date value2) {
            addCriterion("BGFENZHIFUZERENSHIJIAN not between", value1, value2, "bgfenzhifuzerenshijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuoIsNull() {
            addCriterion("BGFENZHIZHUSUO is null");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuoIsNotNull() {
            addCriterion("BGFENZHIZHUSUO is not null");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuoEqualTo(String value) {
            addCriterion("BGFENZHIZHUSUO =", value, "bgfenzhizhusuo");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuoNotEqualTo(String value) {
            addCriterion("BGFENZHIZHUSUO <>", value, "bgfenzhizhusuo");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuoGreaterThan(String value) {
            addCriterion("BGFENZHIZHUSUO >", value, "bgfenzhizhusuo");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuoGreaterThanOrEqualTo(String value) {
            addCriterion("BGFENZHIZHUSUO >=", value, "bgfenzhizhusuo");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuoLessThan(String value) {
            addCriterion("BGFENZHIZHUSUO <", value, "bgfenzhizhusuo");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuoLessThanOrEqualTo(String value) {
            addCriterion("BGFENZHIZHUSUO <=", value, "bgfenzhizhusuo");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuoLike(String value) {
            addCriterion("BGFENZHIZHUSUO like", value, "bgfenzhizhusuo");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuoNotLike(String value) {
            addCriterion("BGFENZHIZHUSUO not like", value, "bgfenzhizhusuo");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuoIn(List<String> values) {
            addCriterion("BGFENZHIZHUSUO in", values, "bgfenzhizhusuo");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuoNotIn(List<String> values) {
            addCriterion("BGFENZHIZHUSUO not in", values, "bgfenzhizhusuo");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuoBetween(String value1, String value2) {
            addCriterion("BGFENZHIZHUSUO between", value1, value2, "bgfenzhizhusuo");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuoNotBetween(String value1, String value2) {
            addCriterion("BGFENZHIZHUSUO not between", value1, value2, "bgfenzhizhusuo");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuobanliIsNull() {
            addCriterion("BGFENZHIZHUSUOBANLI is null");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuobanliIsNotNull() {
            addCriterion("BGFENZHIZHUSUOBANLI is not null");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuobanliEqualTo(String value) {
            addCriterion("BGFENZHIZHUSUOBANLI =", value, "bgfenzhizhusuobanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuobanliNotEqualTo(String value) {
            addCriterion("BGFENZHIZHUSUOBANLI <>", value, "bgfenzhizhusuobanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuobanliGreaterThan(String value) {
            addCriterion("BGFENZHIZHUSUOBANLI >", value, "bgfenzhizhusuobanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuobanliGreaterThanOrEqualTo(String value) {
            addCriterion("BGFENZHIZHUSUOBANLI >=", value, "bgfenzhizhusuobanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuobanliLessThan(String value) {
            addCriterion("BGFENZHIZHUSUOBANLI <", value, "bgfenzhizhusuobanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuobanliLessThanOrEqualTo(String value) {
            addCriterion("BGFENZHIZHUSUOBANLI <=", value, "bgfenzhizhusuobanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuobanliLike(String value) {
            addCriterion("BGFENZHIZHUSUOBANLI like", value, "bgfenzhizhusuobanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuobanliNotLike(String value) {
            addCriterion("BGFENZHIZHUSUOBANLI not like", value, "bgfenzhizhusuobanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuobanliIn(List<String> values) {
            addCriterion("BGFENZHIZHUSUOBANLI in", values, "bgfenzhizhusuobanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuobanliNotIn(List<String> values) {
            addCriterion("BGFENZHIZHUSUOBANLI not in", values, "bgfenzhizhusuobanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuobanliBetween(String value1, String value2) {
            addCriterion("BGFENZHIZHUSUOBANLI between", value1, value2, "bgfenzhizhusuobanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuobanliNotBetween(String value1, String value2) {
            addCriterion("BGFENZHIZHUSUOBANLI not between", value1, value2, "bgfenzhizhusuobanli");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuoshijianIsNull() {
            addCriterion("BGFENZHIZHUSUOSHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuoshijianIsNotNull() {
            addCriterion("BGFENZHIZHUSUOSHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuoshijianEqualTo(Date value) {
            addCriterion("BGFENZHIZHUSUOSHIJIAN =", value, "bgfenzhizhusuoshijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuoshijianNotEqualTo(Date value) {
            addCriterion("BGFENZHIZHUSUOSHIJIAN <>", value, "bgfenzhizhusuoshijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuoshijianGreaterThan(Date value) {
            addCriterion("BGFENZHIZHUSUOSHIJIAN >", value, "bgfenzhizhusuoshijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuoshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("BGFENZHIZHUSUOSHIJIAN >=", value, "bgfenzhizhusuoshijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuoshijianLessThan(Date value) {
            addCriterion("BGFENZHIZHUSUOSHIJIAN <", value, "bgfenzhizhusuoshijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuoshijianLessThanOrEqualTo(Date value) {
            addCriterion("BGFENZHIZHUSUOSHIJIAN <=", value, "bgfenzhizhusuoshijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuoshijianIn(List<Date> values) {
            addCriterion("BGFENZHIZHUSUOSHIJIAN in", values, "bgfenzhizhusuoshijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuoshijianNotIn(List<Date> values) {
            addCriterion("BGFENZHIZHUSUOSHIJIAN not in", values, "bgfenzhizhusuoshijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuoshijianBetween(Date value1, Date value2) {
            addCriterion("BGFENZHIZHUSUOSHIJIAN between", value1, value2, "bgfenzhizhusuoshijian");
            return (Criteria) this;
        }

        public Criteria andBgfenzhizhusuoshijianNotBetween(Date value1, Date value2) {
            addCriterion("BGFENZHIZHUSUOSHIJIAN not between", value1, value2, "bgfenzhizhusuoshijian");
            return (Criteria) this;
        }

        public Criteria andXingmingyiIsNull() {
            addCriterion("XINGMINGYI is null");
            return (Criteria) this;
        }

        public Criteria andXingmingyiIsNotNull() {
            addCriterion("XINGMINGYI is not null");
            return (Criteria) this;
        }

        public Criteria andXingmingyiEqualTo(String value) {
            addCriterion("XINGMINGYI =", value, "xingmingyi");
            return (Criteria) this;
        }

        public Criteria andXingmingyiNotEqualTo(String value) {
            addCriterion("XINGMINGYI <>", value, "xingmingyi");
            return (Criteria) this;
        }

        public Criteria andXingmingyiGreaterThan(String value) {
            addCriterion("XINGMINGYI >", value, "xingmingyi");
            return (Criteria) this;
        }

        public Criteria andXingmingyiGreaterThanOrEqualTo(String value) {
            addCriterion("XINGMINGYI >=", value, "xingmingyi");
            return (Criteria) this;
        }

        public Criteria andXingmingyiLessThan(String value) {
            addCriterion("XINGMINGYI <", value, "xingmingyi");
            return (Criteria) this;
        }

        public Criteria andXingmingyiLessThanOrEqualTo(String value) {
            addCriterion("XINGMINGYI <=", value, "xingmingyi");
            return (Criteria) this;
        }

        public Criteria andXingmingyiLike(String value) {
            addCriterion("XINGMINGYI like", value, "xingmingyi");
            return (Criteria) this;
        }

        public Criteria andXingmingyiNotLike(String value) {
            addCriterion("XINGMINGYI not like", value, "xingmingyi");
            return (Criteria) this;
        }

        public Criteria andXingmingyiIn(List<String> values) {
            addCriterion("XINGMINGYI in", values, "xingmingyi");
            return (Criteria) this;
        }

        public Criteria andXingmingyiNotIn(List<String> values) {
            addCriterion("XINGMINGYI not in", values, "xingmingyi");
            return (Criteria) this;
        }

        public Criteria andXingmingyiBetween(String value1, String value2) {
            addCriterion("XINGMINGYI between", value1, value2, "xingmingyi");
            return (Criteria) this;
        }

        public Criteria andXingmingyiNotBetween(String value1, String value2) {
            addCriterion("XINGMINGYI not between", value1, value2, "xingmingyi");
            return (Criteria) this;
        }

        public Criteria andGangweiyiIsNull() {
            addCriterion("GANGWEIYI is null");
            return (Criteria) this;
        }

        public Criteria andGangweiyiIsNotNull() {
            addCriterion("GANGWEIYI is not null");
            return (Criteria) this;
        }

        public Criteria andGangweiyiEqualTo(String value) {
            addCriterion("GANGWEIYI =", value, "gangweiyi");
            return (Criteria) this;
        }

        public Criteria andGangweiyiNotEqualTo(String value) {
            addCriterion("GANGWEIYI <>", value, "gangweiyi");
            return (Criteria) this;
        }

        public Criteria andGangweiyiGreaterThan(String value) {
            addCriterion("GANGWEIYI >", value, "gangweiyi");
            return (Criteria) this;
        }

        public Criteria andGangweiyiGreaterThanOrEqualTo(String value) {
            addCriterion("GANGWEIYI >=", value, "gangweiyi");
            return (Criteria) this;
        }

        public Criteria andGangweiyiLessThan(String value) {
            addCriterion("GANGWEIYI <", value, "gangweiyi");
            return (Criteria) this;
        }

        public Criteria andGangweiyiLessThanOrEqualTo(String value) {
            addCriterion("GANGWEIYI <=", value, "gangweiyi");
            return (Criteria) this;
        }

        public Criteria andGangweiyiLike(String value) {
            addCriterion("GANGWEIYI like", value, "gangweiyi");
            return (Criteria) this;
        }

        public Criteria andGangweiyiNotLike(String value) {
            addCriterion("GANGWEIYI not like", value, "gangweiyi");
            return (Criteria) this;
        }

        public Criteria andGangweiyiIn(List<String> values) {
            addCriterion("GANGWEIYI in", values, "gangweiyi");
            return (Criteria) this;
        }

        public Criteria andGangweiyiNotIn(List<String> values) {
            addCriterion("GANGWEIYI not in", values, "gangweiyi");
            return (Criteria) this;
        }

        public Criteria andGangweiyiBetween(String value1, String value2) {
            addCriterion("GANGWEIYI between", value1, value2, "gangweiyi");
            return (Criteria) this;
        }

        public Criteria andGangweiyiNotBetween(String value1, String value2) {
            addCriterion("GANGWEIYI not between", value1, value2, "gangweiyi");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengyiIsNull() {
            addCriterion("KUAIJIZHENGYI is null");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengyiIsNotNull() {
            addCriterion("KUAIJIZHENGYI is not null");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengyiEqualTo(String value) {
            addCriterion("KUAIJIZHENGYI =", value, "kuaijizhengyi");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengyiNotEqualTo(String value) {
            addCriterion("KUAIJIZHENGYI <>", value, "kuaijizhengyi");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengyiGreaterThan(String value) {
            addCriterion("KUAIJIZHENGYI >", value, "kuaijizhengyi");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengyiGreaterThanOrEqualTo(String value) {
            addCriterion("KUAIJIZHENGYI >=", value, "kuaijizhengyi");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengyiLessThan(String value) {
            addCriterion("KUAIJIZHENGYI <", value, "kuaijizhengyi");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengyiLessThanOrEqualTo(String value) {
            addCriterion("KUAIJIZHENGYI <=", value, "kuaijizhengyi");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengyiLike(String value) {
            addCriterion("KUAIJIZHENGYI like", value, "kuaijizhengyi");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengyiNotLike(String value) {
            addCriterion("KUAIJIZHENGYI not like", value, "kuaijizhengyi");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengyiIn(List<String> values) {
            addCriterion("KUAIJIZHENGYI in", values, "kuaijizhengyi");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengyiNotIn(List<String> values) {
            addCriterion("KUAIJIZHENGYI not in", values, "kuaijizhengyi");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengyiBetween(String value1, String value2) {
            addCriterion("KUAIJIZHENGYI between", value1, value2, "kuaijizhengyi");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengyiNotBetween(String value1, String value2) {
            addCriterion("KUAIJIZHENGYI not between", value1, value2, "kuaijizhengyi");
            return (Criteria) this;
        }

        public Criteria andJishuzigeyiIsNull() {
            addCriterion("JISHUZIGEYI is null");
            return (Criteria) this;
        }

        public Criteria andJishuzigeyiIsNotNull() {
            addCriterion("JISHUZIGEYI is not null");
            return (Criteria) this;
        }

        public Criteria andJishuzigeyiEqualTo(String value) {
            addCriterion("JISHUZIGEYI =", value, "jishuzigeyi");
            return (Criteria) this;
        }

        public Criteria andJishuzigeyiNotEqualTo(String value) {
            addCriterion("JISHUZIGEYI <>", value, "jishuzigeyi");
            return (Criteria) this;
        }

        public Criteria andJishuzigeyiGreaterThan(String value) {
            addCriterion("JISHUZIGEYI >", value, "jishuzigeyi");
            return (Criteria) this;
        }

        public Criteria andJishuzigeyiGreaterThanOrEqualTo(String value) {
            addCriterion("JISHUZIGEYI >=", value, "jishuzigeyi");
            return (Criteria) this;
        }

        public Criteria andJishuzigeyiLessThan(String value) {
            addCriterion("JISHUZIGEYI <", value, "jishuzigeyi");
            return (Criteria) this;
        }

        public Criteria andJishuzigeyiLessThanOrEqualTo(String value) {
            addCriterion("JISHUZIGEYI <=", value, "jishuzigeyi");
            return (Criteria) this;
        }

        public Criteria andJishuzigeyiLike(String value) {
            addCriterion("JISHUZIGEYI like", value, "jishuzigeyi");
            return (Criteria) this;
        }

        public Criteria andJishuzigeyiNotLike(String value) {
            addCriterion("JISHUZIGEYI not like", value, "jishuzigeyi");
            return (Criteria) this;
        }

        public Criteria andJishuzigeyiIn(List<String> values) {
            addCriterion("JISHUZIGEYI in", values, "jishuzigeyi");
            return (Criteria) this;
        }

        public Criteria andJishuzigeyiNotIn(List<String> values) {
            addCriterion("JISHUZIGEYI not in", values, "jishuzigeyi");
            return (Criteria) this;
        }

        public Criteria andJishuzigeyiBetween(String value1, String value2) {
            addCriterion("JISHUZIGEYI between", value1, value2, "jishuzigeyi");
            return (Criteria) this;
        }

        public Criteria andJishuzigeyiNotBetween(String value1, String value2) {
            addCriterion("JISHUZIGEYI not between", value1, value2, "jishuzigeyi");
            return (Criteria) this;
        }

        public Criteria andXingmingerIsNull() {
            addCriterion("XINGMINGER is null");
            return (Criteria) this;
        }

        public Criteria andXingmingerIsNotNull() {
            addCriterion("XINGMINGER is not null");
            return (Criteria) this;
        }

        public Criteria andXingmingerEqualTo(String value) {
            addCriterion("XINGMINGER =", value, "xingminger");
            return (Criteria) this;
        }

        public Criteria andXingmingerNotEqualTo(String value) {
            addCriterion("XINGMINGER <>", value, "xingminger");
            return (Criteria) this;
        }

        public Criteria andXingmingerGreaterThan(String value) {
            addCriterion("XINGMINGER >", value, "xingminger");
            return (Criteria) this;
        }

        public Criteria andXingmingerGreaterThanOrEqualTo(String value) {
            addCriterion("XINGMINGER >=", value, "xingminger");
            return (Criteria) this;
        }

        public Criteria andXingmingerLessThan(String value) {
            addCriterion("XINGMINGER <", value, "xingminger");
            return (Criteria) this;
        }

        public Criteria andXingmingerLessThanOrEqualTo(String value) {
            addCriterion("XINGMINGER <=", value, "xingminger");
            return (Criteria) this;
        }

        public Criteria andXingmingerLike(String value) {
            addCriterion("XINGMINGER like", value, "xingminger");
            return (Criteria) this;
        }

        public Criteria andXingmingerNotLike(String value) {
            addCriterion("XINGMINGER not like", value, "xingminger");
            return (Criteria) this;
        }

        public Criteria andXingmingerIn(List<String> values) {
            addCriterion("XINGMINGER in", values, "xingminger");
            return (Criteria) this;
        }

        public Criteria andXingmingerNotIn(List<String> values) {
            addCriterion("XINGMINGER not in", values, "xingminger");
            return (Criteria) this;
        }

        public Criteria andXingmingerBetween(String value1, String value2) {
            addCriterion("XINGMINGER between", value1, value2, "xingminger");
            return (Criteria) this;
        }

        public Criteria andXingmingerNotBetween(String value1, String value2) {
            addCriterion("XINGMINGER not between", value1, value2, "xingminger");
            return (Criteria) this;
        }

        public Criteria andGangweierIsNull() {
            addCriterion("GANGWEIER is null");
            return (Criteria) this;
        }

        public Criteria andGangweierIsNotNull() {
            addCriterion("GANGWEIER is not null");
            return (Criteria) this;
        }

        public Criteria andGangweierEqualTo(String value) {
            addCriterion("GANGWEIER =", value, "gangweier");
            return (Criteria) this;
        }

        public Criteria andGangweierNotEqualTo(String value) {
            addCriterion("GANGWEIER <>", value, "gangweier");
            return (Criteria) this;
        }

        public Criteria andGangweierGreaterThan(String value) {
            addCriterion("GANGWEIER >", value, "gangweier");
            return (Criteria) this;
        }

        public Criteria andGangweierGreaterThanOrEqualTo(String value) {
            addCriterion("GANGWEIER >=", value, "gangweier");
            return (Criteria) this;
        }

        public Criteria andGangweierLessThan(String value) {
            addCriterion("GANGWEIER <", value, "gangweier");
            return (Criteria) this;
        }

        public Criteria andGangweierLessThanOrEqualTo(String value) {
            addCriterion("GANGWEIER <=", value, "gangweier");
            return (Criteria) this;
        }

        public Criteria andGangweierLike(String value) {
            addCriterion("GANGWEIER like", value, "gangweier");
            return (Criteria) this;
        }

        public Criteria andGangweierNotLike(String value) {
            addCriterion("GANGWEIER not like", value, "gangweier");
            return (Criteria) this;
        }

        public Criteria andGangweierIn(List<String> values) {
            addCriterion("GANGWEIER in", values, "gangweier");
            return (Criteria) this;
        }

        public Criteria andGangweierNotIn(List<String> values) {
            addCriterion("GANGWEIER not in", values, "gangweier");
            return (Criteria) this;
        }

        public Criteria andGangweierBetween(String value1, String value2) {
            addCriterion("GANGWEIER between", value1, value2, "gangweier");
            return (Criteria) this;
        }

        public Criteria andGangweierNotBetween(String value1, String value2) {
            addCriterion("GANGWEIER not between", value1, value2, "gangweier");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengerIsNull() {
            addCriterion("KUAIJIZHENGER is null");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengerIsNotNull() {
            addCriterion("KUAIJIZHENGER is not null");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengerEqualTo(String value) {
            addCriterion("KUAIJIZHENGER =", value, "kuaijizhenger");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengerNotEqualTo(String value) {
            addCriterion("KUAIJIZHENGER <>", value, "kuaijizhenger");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengerGreaterThan(String value) {
            addCriterion("KUAIJIZHENGER >", value, "kuaijizhenger");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengerGreaterThanOrEqualTo(String value) {
            addCriterion("KUAIJIZHENGER >=", value, "kuaijizhenger");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengerLessThan(String value) {
            addCriterion("KUAIJIZHENGER <", value, "kuaijizhenger");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengerLessThanOrEqualTo(String value) {
            addCriterion("KUAIJIZHENGER <=", value, "kuaijizhenger");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengerLike(String value) {
            addCriterion("KUAIJIZHENGER like", value, "kuaijizhenger");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengerNotLike(String value) {
            addCriterion("KUAIJIZHENGER not like", value, "kuaijizhenger");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengerIn(List<String> values) {
            addCriterion("KUAIJIZHENGER in", values, "kuaijizhenger");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengerNotIn(List<String> values) {
            addCriterion("KUAIJIZHENGER not in", values, "kuaijizhenger");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengerBetween(String value1, String value2) {
            addCriterion("KUAIJIZHENGER between", value1, value2, "kuaijizhenger");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengerNotBetween(String value1, String value2) {
            addCriterion("KUAIJIZHENGER not between", value1, value2, "kuaijizhenger");
            return (Criteria) this;
        }

        public Criteria andJishuzigeerIsNull() {
            addCriterion("JISHUZIGEER is null");
            return (Criteria) this;
        }

        public Criteria andJishuzigeerIsNotNull() {
            addCriterion("JISHUZIGEER is not null");
            return (Criteria) this;
        }

        public Criteria andJishuzigeerEqualTo(String value) {
            addCriterion("JISHUZIGEER =", value, "jishuzigeer");
            return (Criteria) this;
        }

        public Criteria andJishuzigeerNotEqualTo(String value) {
            addCriterion("JISHUZIGEER <>", value, "jishuzigeer");
            return (Criteria) this;
        }

        public Criteria andJishuzigeerGreaterThan(String value) {
            addCriterion("JISHUZIGEER >", value, "jishuzigeer");
            return (Criteria) this;
        }

        public Criteria andJishuzigeerGreaterThanOrEqualTo(String value) {
            addCriterion("JISHUZIGEER >=", value, "jishuzigeer");
            return (Criteria) this;
        }

        public Criteria andJishuzigeerLessThan(String value) {
            addCriterion("JISHUZIGEER <", value, "jishuzigeer");
            return (Criteria) this;
        }

        public Criteria andJishuzigeerLessThanOrEqualTo(String value) {
            addCriterion("JISHUZIGEER <=", value, "jishuzigeer");
            return (Criteria) this;
        }

        public Criteria andJishuzigeerLike(String value) {
            addCriterion("JISHUZIGEER like", value, "jishuzigeer");
            return (Criteria) this;
        }

        public Criteria andJishuzigeerNotLike(String value) {
            addCriterion("JISHUZIGEER not like", value, "jishuzigeer");
            return (Criteria) this;
        }

        public Criteria andJishuzigeerIn(List<String> values) {
            addCriterion("JISHUZIGEER in", values, "jishuzigeer");
            return (Criteria) this;
        }

        public Criteria andJishuzigeerNotIn(List<String> values) {
            addCriterion("JISHUZIGEER not in", values, "jishuzigeer");
            return (Criteria) this;
        }

        public Criteria andJishuzigeerBetween(String value1, String value2) {
            addCriterion("JISHUZIGEER between", value1, value2, "jishuzigeer");
            return (Criteria) this;
        }

        public Criteria andJishuzigeerNotBetween(String value1, String value2) {
            addCriterion("JISHUZIGEER not between", value1, value2, "jishuzigeer");
            return (Criteria) this;
        }

        public Criteria andXingmingsanIsNull() {
            addCriterion("XINGMINGSAN is null");
            return (Criteria) this;
        }

        public Criteria andXingmingsanIsNotNull() {
            addCriterion("XINGMINGSAN is not null");
            return (Criteria) this;
        }

        public Criteria andXingmingsanEqualTo(String value) {
            addCriterion("XINGMINGSAN =", value, "xingmingsan");
            return (Criteria) this;
        }

        public Criteria andXingmingsanNotEqualTo(String value) {
            addCriterion("XINGMINGSAN <>", value, "xingmingsan");
            return (Criteria) this;
        }

        public Criteria andXingmingsanGreaterThan(String value) {
            addCriterion("XINGMINGSAN >", value, "xingmingsan");
            return (Criteria) this;
        }

        public Criteria andXingmingsanGreaterThanOrEqualTo(String value) {
            addCriterion("XINGMINGSAN >=", value, "xingmingsan");
            return (Criteria) this;
        }

        public Criteria andXingmingsanLessThan(String value) {
            addCriterion("XINGMINGSAN <", value, "xingmingsan");
            return (Criteria) this;
        }

        public Criteria andXingmingsanLessThanOrEqualTo(String value) {
            addCriterion("XINGMINGSAN <=", value, "xingmingsan");
            return (Criteria) this;
        }

        public Criteria andXingmingsanLike(String value) {
            addCriterion("XINGMINGSAN like", value, "xingmingsan");
            return (Criteria) this;
        }

        public Criteria andXingmingsanNotLike(String value) {
            addCriterion("XINGMINGSAN not like", value, "xingmingsan");
            return (Criteria) this;
        }

        public Criteria andXingmingsanIn(List<String> values) {
            addCriterion("XINGMINGSAN in", values, "xingmingsan");
            return (Criteria) this;
        }

        public Criteria andXingmingsanNotIn(List<String> values) {
            addCriterion("XINGMINGSAN not in", values, "xingmingsan");
            return (Criteria) this;
        }

        public Criteria andXingmingsanBetween(String value1, String value2) {
            addCriterion("XINGMINGSAN between", value1, value2, "xingmingsan");
            return (Criteria) this;
        }

        public Criteria andXingmingsanNotBetween(String value1, String value2) {
            addCriterion("XINGMINGSAN not between", value1, value2, "xingmingsan");
            return (Criteria) this;
        }

        public Criteria andGangweisanIsNull() {
            addCriterion("GANGWEISAN is null");
            return (Criteria) this;
        }

        public Criteria andGangweisanIsNotNull() {
            addCriterion("GANGWEISAN is not null");
            return (Criteria) this;
        }

        public Criteria andGangweisanEqualTo(String value) {
            addCriterion("GANGWEISAN =", value, "gangweisan");
            return (Criteria) this;
        }

        public Criteria andGangweisanNotEqualTo(String value) {
            addCriterion("GANGWEISAN <>", value, "gangweisan");
            return (Criteria) this;
        }

        public Criteria andGangweisanGreaterThan(String value) {
            addCriterion("GANGWEISAN >", value, "gangweisan");
            return (Criteria) this;
        }

        public Criteria andGangweisanGreaterThanOrEqualTo(String value) {
            addCriterion("GANGWEISAN >=", value, "gangweisan");
            return (Criteria) this;
        }

        public Criteria andGangweisanLessThan(String value) {
            addCriterion("GANGWEISAN <", value, "gangweisan");
            return (Criteria) this;
        }

        public Criteria andGangweisanLessThanOrEqualTo(String value) {
            addCriterion("GANGWEISAN <=", value, "gangweisan");
            return (Criteria) this;
        }

        public Criteria andGangweisanLike(String value) {
            addCriterion("GANGWEISAN like", value, "gangweisan");
            return (Criteria) this;
        }

        public Criteria andGangweisanNotLike(String value) {
            addCriterion("GANGWEISAN not like", value, "gangweisan");
            return (Criteria) this;
        }

        public Criteria andGangweisanIn(List<String> values) {
            addCriterion("GANGWEISAN in", values, "gangweisan");
            return (Criteria) this;
        }

        public Criteria andGangweisanNotIn(List<String> values) {
            addCriterion("GANGWEISAN not in", values, "gangweisan");
            return (Criteria) this;
        }

        public Criteria andGangweisanBetween(String value1, String value2) {
            addCriterion("GANGWEISAN between", value1, value2, "gangweisan");
            return (Criteria) this;
        }

        public Criteria andGangweisanNotBetween(String value1, String value2) {
            addCriterion("GANGWEISAN not between", value1, value2, "gangweisan");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengsanIsNull() {
            addCriterion("KUAIJIZHENGSAN is null");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengsanIsNotNull() {
            addCriterion("KUAIJIZHENGSAN is not null");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengsanEqualTo(String value) {
            addCriterion("KUAIJIZHENGSAN =", value, "kuaijizhengsan");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengsanNotEqualTo(String value) {
            addCriterion("KUAIJIZHENGSAN <>", value, "kuaijizhengsan");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengsanGreaterThan(String value) {
            addCriterion("KUAIJIZHENGSAN >", value, "kuaijizhengsan");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengsanGreaterThanOrEqualTo(String value) {
            addCriterion("KUAIJIZHENGSAN >=", value, "kuaijizhengsan");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengsanLessThan(String value) {
            addCriterion("KUAIJIZHENGSAN <", value, "kuaijizhengsan");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengsanLessThanOrEqualTo(String value) {
            addCriterion("KUAIJIZHENGSAN <=", value, "kuaijizhengsan");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengsanLike(String value) {
            addCriterion("KUAIJIZHENGSAN like", value, "kuaijizhengsan");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengsanNotLike(String value) {
            addCriterion("KUAIJIZHENGSAN not like", value, "kuaijizhengsan");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengsanIn(List<String> values) {
            addCriterion("KUAIJIZHENGSAN in", values, "kuaijizhengsan");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengsanNotIn(List<String> values) {
            addCriterion("KUAIJIZHENGSAN not in", values, "kuaijizhengsan");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengsanBetween(String value1, String value2) {
            addCriterion("KUAIJIZHENGSAN between", value1, value2, "kuaijizhengsan");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengsanNotBetween(String value1, String value2) {
            addCriterion("KUAIJIZHENGSAN not between", value1, value2, "kuaijizhengsan");
            return (Criteria) this;
        }

        public Criteria andJishuzigesanIsNull() {
            addCriterion("JISHUZIGESAN is null");
            return (Criteria) this;
        }

        public Criteria andJishuzigesanIsNotNull() {
            addCriterion("JISHUZIGESAN is not null");
            return (Criteria) this;
        }

        public Criteria andJishuzigesanEqualTo(String value) {
            addCriterion("JISHUZIGESAN =", value, "jishuzigesan");
            return (Criteria) this;
        }

        public Criteria andJishuzigesanNotEqualTo(String value) {
            addCriterion("JISHUZIGESAN <>", value, "jishuzigesan");
            return (Criteria) this;
        }

        public Criteria andJishuzigesanGreaterThan(String value) {
            addCriterion("JISHUZIGESAN >", value, "jishuzigesan");
            return (Criteria) this;
        }

        public Criteria andJishuzigesanGreaterThanOrEqualTo(String value) {
            addCriterion("JISHUZIGESAN >=", value, "jishuzigesan");
            return (Criteria) this;
        }

        public Criteria andJishuzigesanLessThan(String value) {
            addCriterion("JISHUZIGESAN <", value, "jishuzigesan");
            return (Criteria) this;
        }

        public Criteria andJishuzigesanLessThanOrEqualTo(String value) {
            addCriterion("JISHUZIGESAN <=", value, "jishuzigesan");
            return (Criteria) this;
        }

        public Criteria andJishuzigesanLike(String value) {
            addCriterion("JISHUZIGESAN like", value, "jishuzigesan");
            return (Criteria) this;
        }

        public Criteria andJishuzigesanNotLike(String value) {
            addCriterion("JISHUZIGESAN not like", value, "jishuzigesan");
            return (Criteria) this;
        }

        public Criteria andJishuzigesanIn(List<String> values) {
            addCriterion("JISHUZIGESAN in", values, "jishuzigesan");
            return (Criteria) this;
        }

        public Criteria andJishuzigesanNotIn(List<String> values) {
            addCriterion("JISHUZIGESAN not in", values, "jishuzigesan");
            return (Criteria) this;
        }

        public Criteria andJishuzigesanBetween(String value1, String value2) {
            addCriterion("JISHUZIGESAN between", value1, value2, "jishuzigesan");
            return (Criteria) this;
        }

        public Criteria andJishuzigesanNotBetween(String value1, String value2) {
            addCriterion("JISHUZIGESAN not between", value1, value2, "jishuzigesan");
            return (Criteria) this;
        }

        public Criteria andXingmingsiIsNull() {
            addCriterion("XINGMINGSI is null");
            return (Criteria) this;
        }

        public Criteria andXingmingsiIsNotNull() {
            addCriterion("XINGMINGSI is not null");
            return (Criteria) this;
        }

        public Criteria andXingmingsiEqualTo(String value) {
            addCriterion("XINGMINGSI =", value, "xingmingsi");
            return (Criteria) this;
        }

        public Criteria andXingmingsiNotEqualTo(String value) {
            addCriterion("XINGMINGSI <>", value, "xingmingsi");
            return (Criteria) this;
        }

        public Criteria andXingmingsiGreaterThan(String value) {
            addCriterion("XINGMINGSI >", value, "xingmingsi");
            return (Criteria) this;
        }

        public Criteria andXingmingsiGreaterThanOrEqualTo(String value) {
            addCriterion("XINGMINGSI >=", value, "xingmingsi");
            return (Criteria) this;
        }

        public Criteria andXingmingsiLessThan(String value) {
            addCriterion("XINGMINGSI <", value, "xingmingsi");
            return (Criteria) this;
        }

        public Criteria andXingmingsiLessThanOrEqualTo(String value) {
            addCriterion("XINGMINGSI <=", value, "xingmingsi");
            return (Criteria) this;
        }

        public Criteria andXingmingsiLike(String value) {
            addCriterion("XINGMINGSI like", value, "xingmingsi");
            return (Criteria) this;
        }

        public Criteria andXingmingsiNotLike(String value) {
            addCriterion("XINGMINGSI not like", value, "xingmingsi");
            return (Criteria) this;
        }

        public Criteria andXingmingsiIn(List<String> values) {
            addCriterion("XINGMINGSI in", values, "xingmingsi");
            return (Criteria) this;
        }

        public Criteria andXingmingsiNotIn(List<String> values) {
            addCriterion("XINGMINGSI not in", values, "xingmingsi");
            return (Criteria) this;
        }

        public Criteria andXingmingsiBetween(String value1, String value2) {
            addCriterion("XINGMINGSI between", value1, value2, "xingmingsi");
            return (Criteria) this;
        }

        public Criteria andXingmingsiNotBetween(String value1, String value2) {
            addCriterion("XINGMINGSI not between", value1, value2, "xingmingsi");
            return (Criteria) this;
        }

        public Criteria andGangweisiIsNull() {
            addCriterion("GANGWEISI is null");
            return (Criteria) this;
        }

        public Criteria andGangweisiIsNotNull() {
            addCriterion("GANGWEISI is not null");
            return (Criteria) this;
        }

        public Criteria andGangweisiEqualTo(String value) {
            addCriterion("GANGWEISI =", value, "gangweisi");
            return (Criteria) this;
        }

        public Criteria andGangweisiNotEqualTo(String value) {
            addCriterion("GANGWEISI <>", value, "gangweisi");
            return (Criteria) this;
        }

        public Criteria andGangweisiGreaterThan(String value) {
            addCriterion("GANGWEISI >", value, "gangweisi");
            return (Criteria) this;
        }

        public Criteria andGangweisiGreaterThanOrEqualTo(String value) {
            addCriterion("GANGWEISI >=", value, "gangweisi");
            return (Criteria) this;
        }

        public Criteria andGangweisiLessThan(String value) {
            addCriterion("GANGWEISI <", value, "gangweisi");
            return (Criteria) this;
        }

        public Criteria andGangweisiLessThanOrEqualTo(String value) {
            addCriterion("GANGWEISI <=", value, "gangweisi");
            return (Criteria) this;
        }

        public Criteria andGangweisiLike(String value) {
            addCriterion("GANGWEISI like", value, "gangweisi");
            return (Criteria) this;
        }

        public Criteria andGangweisiNotLike(String value) {
            addCriterion("GANGWEISI not like", value, "gangweisi");
            return (Criteria) this;
        }

        public Criteria andGangweisiIn(List<String> values) {
            addCriterion("GANGWEISI in", values, "gangweisi");
            return (Criteria) this;
        }

        public Criteria andGangweisiNotIn(List<String> values) {
            addCriterion("GANGWEISI not in", values, "gangweisi");
            return (Criteria) this;
        }

        public Criteria andGangweisiBetween(String value1, String value2) {
            addCriterion("GANGWEISI between", value1, value2, "gangweisi");
            return (Criteria) this;
        }

        public Criteria andGangweisiNotBetween(String value1, String value2) {
            addCriterion("GANGWEISI not between", value1, value2, "gangweisi");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengsiIsNull() {
            addCriterion("KUAIJIZHENGSI is null");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengsiIsNotNull() {
            addCriterion("KUAIJIZHENGSI is not null");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengsiEqualTo(String value) {
            addCriterion("KUAIJIZHENGSI =", value, "kuaijizhengsi");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengsiNotEqualTo(String value) {
            addCriterion("KUAIJIZHENGSI <>", value, "kuaijizhengsi");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengsiGreaterThan(String value) {
            addCriterion("KUAIJIZHENGSI >", value, "kuaijizhengsi");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengsiGreaterThanOrEqualTo(String value) {
            addCriterion("KUAIJIZHENGSI >=", value, "kuaijizhengsi");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengsiLessThan(String value) {
            addCriterion("KUAIJIZHENGSI <", value, "kuaijizhengsi");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengsiLessThanOrEqualTo(String value) {
            addCriterion("KUAIJIZHENGSI <=", value, "kuaijizhengsi");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengsiLike(String value) {
            addCriterion("KUAIJIZHENGSI like", value, "kuaijizhengsi");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengsiNotLike(String value) {
            addCriterion("KUAIJIZHENGSI not like", value, "kuaijizhengsi");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengsiIn(List<String> values) {
            addCriterion("KUAIJIZHENGSI in", values, "kuaijizhengsi");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengsiNotIn(List<String> values) {
            addCriterion("KUAIJIZHENGSI not in", values, "kuaijizhengsi");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengsiBetween(String value1, String value2) {
            addCriterion("KUAIJIZHENGSI between", value1, value2, "kuaijizhengsi");
            return (Criteria) this;
        }

        public Criteria andKuaijizhengsiNotBetween(String value1, String value2) {
            addCriterion("KUAIJIZHENGSI not between", value1, value2, "kuaijizhengsi");
            return (Criteria) this;
        }

        public Criteria andJishuzigesiIsNull() {
            addCriterion("JISHUZIGESI is null");
            return (Criteria) this;
        }

        public Criteria andJishuzigesiIsNotNull() {
            addCriterion("JISHUZIGESI is not null");
            return (Criteria) this;
        }

        public Criteria andJishuzigesiEqualTo(String value) {
            addCriterion("JISHUZIGESI =", value, "jishuzigesi");
            return (Criteria) this;
        }

        public Criteria andJishuzigesiNotEqualTo(String value) {
            addCriterion("JISHUZIGESI <>", value, "jishuzigesi");
            return (Criteria) this;
        }

        public Criteria andJishuzigesiGreaterThan(String value) {
            addCriterion("JISHUZIGESI >", value, "jishuzigesi");
            return (Criteria) this;
        }

        public Criteria andJishuzigesiGreaterThanOrEqualTo(String value) {
            addCriterion("JISHUZIGESI >=", value, "jishuzigesi");
            return (Criteria) this;
        }

        public Criteria andJishuzigesiLessThan(String value) {
            addCriterion("JISHUZIGESI <", value, "jishuzigesi");
            return (Criteria) this;
        }

        public Criteria andJishuzigesiLessThanOrEqualTo(String value) {
            addCriterion("JISHUZIGESI <=", value, "jishuzigesi");
            return (Criteria) this;
        }

        public Criteria andJishuzigesiLike(String value) {
            addCriterion("JISHUZIGESI like", value, "jishuzigesi");
            return (Criteria) this;
        }

        public Criteria andJishuzigesiNotLike(String value) {
            addCriterion("JISHUZIGESI not like", value, "jishuzigesi");
            return (Criteria) this;
        }

        public Criteria andJishuzigesiIn(List<String> values) {
            addCriterion("JISHUZIGESI in", values, "jishuzigesi");
            return (Criteria) this;
        }

        public Criteria andJishuzigesiNotIn(List<String> values) {
            addCriterion("JISHUZIGESI not in", values, "jishuzigesi");
            return (Criteria) this;
        }

        public Criteria andJishuzigesiBetween(String value1, String value2) {
            addCriterion("JISHUZIGESI between", value1, value2, "jishuzigesi");
            return (Criteria) this;
        }

        public Criteria andJishuzigesiNotBetween(String value1, String value2) {
            addCriterion("JISHUZIGESI not between", value1, value2, "jishuzigesi");
            return (Criteria) this;
        }

        public Criteria andGongjijinIsNull() {
            addCriterion("GONGJIJIN is null");
            return (Criteria) this;
        }

        public Criteria andGongjijinIsNotNull() {
            addCriterion("GONGJIJIN is not null");
            return (Criteria) this;
        }

        public Criteria andGongjijinEqualTo(Integer value) {
            addCriterion("GONGJIJIN =", value, "gongjijin");
            return (Criteria) this;
        }

        public Criteria andGongjijinNotEqualTo(Integer value) {
            addCriterion("GONGJIJIN <>", value, "gongjijin");
            return (Criteria) this;
        }

        public Criteria andGongjijinGreaterThan(Integer value) {
            addCriterion("GONGJIJIN >", value, "gongjijin");
            return (Criteria) this;
        }

        public Criteria andGongjijinGreaterThanOrEqualTo(Integer value) {
            addCriterion("GONGJIJIN >=", value, "gongjijin");
            return (Criteria) this;
        }

        public Criteria andGongjijinLessThan(Integer value) {
            addCriterion("GONGJIJIN <", value, "gongjijin");
            return (Criteria) this;
        }

        public Criteria andGongjijinLessThanOrEqualTo(Integer value) {
            addCriterion("GONGJIJIN <=", value, "gongjijin");
            return (Criteria) this;
        }

        public Criteria andGongjijinIn(List<Integer> values) {
            addCriterion("GONGJIJIN in", values, "gongjijin");
            return (Criteria) this;
        }

        public Criteria andGongjijinNotIn(List<Integer> values) {
            addCriterion("GONGJIJIN not in", values, "gongjijin");
            return (Criteria) this;
        }

        public Criteria andGongjijinBetween(Integer value1, Integer value2) {
            addCriterion("GONGJIJIN between", value1, value2, "gongjijin");
            return (Criteria) this;
        }

        public Criteria andGongjijinNotBetween(Integer value1, Integer value2) {
            addCriterion("GONGJIJIN not between", value1, value2, "gongjijin");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongziIsNull() {
            addCriterion("ZHUANZHIGONGZI is null");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongziIsNotNull() {
            addCriterion("ZHUANZHIGONGZI is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongziEqualTo(BigDecimal value) {
            addCriterion("ZHUANZHIGONGZI =", value, "zhuanzhigongzi");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongziNotEqualTo(BigDecimal value) {
            addCriterion("ZHUANZHIGONGZI <>", value, "zhuanzhigongzi");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongziGreaterThan(BigDecimal value) {
            addCriterion("ZHUANZHIGONGZI >", value, "zhuanzhigongzi");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongziGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHUANZHIGONGZI >=", value, "zhuanzhigongzi");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongziLessThan(BigDecimal value) {
            addCriterion("ZHUANZHIGONGZI <", value, "zhuanzhigongzi");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongziLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHUANZHIGONGZI <=", value, "zhuanzhigongzi");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongziIn(List<BigDecimal> values) {
            addCriterion("ZHUANZHIGONGZI in", values, "zhuanzhigongzi");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongziNotIn(List<BigDecimal> values) {
            addCriterion("ZHUANZHIGONGZI not in", values, "zhuanzhigongzi");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongziBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHUANZHIGONGZI between", value1, value2, "zhuanzhigongzi");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongziNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHUANZHIGONGZI not between", value1, value2, "zhuanzhigongzi");
            return (Criteria) this;
        }

        public Criteria andZhaokaishijianIsNull() {
            addCriterion("ZHAOKAISHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andZhaokaishijianIsNotNull() {
            addCriterion("ZHAOKAISHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andZhaokaishijianEqualTo(String value) {
            addCriterion("ZHAOKAISHIJIAN =", value, "zhaokaishijian");
            return (Criteria) this;
        }

        public Criteria andZhaokaishijianNotEqualTo(String value) {
            addCriterion("ZHAOKAISHIJIAN <>", value, "zhaokaishijian");
            return (Criteria) this;
        }

        public Criteria andZhaokaishijianGreaterThan(String value) {
            addCriterion("ZHAOKAISHIJIAN >", value, "zhaokaishijian");
            return (Criteria) this;
        }

        public Criteria andZhaokaishijianGreaterThanOrEqualTo(String value) {
            addCriterion("ZHAOKAISHIJIAN >=", value, "zhaokaishijian");
            return (Criteria) this;
        }

        public Criteria andZhaokaishijianLessThan(String value) {
            addCriterion("ZHAOKAISHIJIAN <", value, "zhaokaishijian");
            return (Criteria) this;
        }

        public Criteria andZhaokaishijianLessThanOrEqualTo(String value) {
            addCriterion("ZHAOKAISHIJIAN <=", value, "zhaokaishijian");
            return (Criteria) this;
        }

        public Criteria andZhaokaishijianLike(String value) {
            addCriterion("ZHAOKAISHIJIAN like", value, "zhaokaishijian");
            return (Criteria) this;
        }

        public Criteria andZhaokaishijianNotLike(String value) {
            addCriterion("ZHAOKAISHIJIAN not like", value, "zhaokaishijian");
            return (Criteria) this;
        }

        public Criteria andZhaokaishijianIn(List<String> values) {
            addCriterion("ZHAOKAISHIJIAN in", values, "zhaokaishijian");
            return (Criteria) this;
        }

        public Criteria andZhaokaishijianNotIn(List<String> values) {
            addCriterion("ZHAOKAISHIJIAN not in", values, "zhaokaishijian");
            return (Criteria) this;
        }

        public Criteria andZhaokaishijianBetween(String value1, String value2) {
            addCriterion("ZHAOKAISHIJIAN between", value1, value2, "zhaokaishijian");
            return (Criteria) this;
        }

        public Criteria andZhaokaishijianNotBetween(String value1, String value2) {
            addCriterion("ZHAOKAISHIJIAN not between", value1, value2, "zhaokaishijian");
            return (Criteria) this;
        }

        public Criteria andBiangengmingcheng2IsNull() {
            addCriterion("BIANGENGMINGCHENG2 is null");
            return (Criteria) this;
        }

        public Criteria andBiangengmingcheng2IsNotNull() {
            addCriterion("BIANGENGMINGCHENG2 is not null");
            return (Criteria) this;
        }

        public Criteria andBiangengmingcheng2EqualTo(String value) {
            addCriterion("BIANGENGMINGCHENG2 =", value, "biangengmingcheng2");
            return (Criteria) this;
        }

        public Criteria andBiangengmingcheng2NotEqualTo(String value) {
            addCriterion("BIANGENGMINGCHENG2 <>", value, "biangengmingcheng2");
            return (Criteria) this;
        }

        public Criteria andBiangengmingcheng2GreaterThan(String value) {
            addCriterion("BIANGENGMINGCHENG2 >", value, "biangengmingcheng2");
            return (Criteria) this;
        }

        public Criteria andBiangengmingcheng2GreaterThanOrEqualTo(String value) {
            addCriterion("BIANGENGMINGCHENG2 >=", value, "biangengmingcheng2");
            return (Criteria) this;
        }

        public Criteria andBiangengmingcheng2LessThan(String value) {
            addCriterion("BIANGENGMINGCHENG2 <", value, "biangengmingcheng2");
            return (Criteria) this;
        }

        public Criteria andBiangengmingcheng2LessThanOrEqualTo(String value) {
            addCriterion("BIANGENGMINGCHENG2 <=", value, "biangengmingcheng2");
            return (Criteria) this;
        }

        public Criteria andBiangengmingcheng2Like(String value) {
            addCriterion("BIANGENGMINGCHENG2 like", value, "biangengmingcheng2");
            return (Criteria) this;
        }

        public Criteria andBiangengmingcheng2NotLike(String value) {
            addCriterion("BIANGENGMINGCHENG2 not like", value, "biangengmingcheng2");
            return (Criteria) this;
        }

        public Criteria andBiangengmingcheng2In(List<String> values) {
            addCriterion("BIANGENGMINGCHENG2 in", values, "biangengmingcheng2");
            return (Criteria) this;
        }

        public Criteria andBiangengmingcheng2NotIn(List<String> values) {
            addCriterion("BIANGENGMINGCHENG2 not in", values, "biangengmingcheng2");
            return (Criteria) this;
        }

        public Criteria andBiangengmingcheng2Between(String value1, String value2) {
            addCriterion("BIANGENGMINGCHENG2 between", value1, value2, "biangengmingcheng2");
            return (Criteria) this;
        }

        public Criteria andBiangengmingcheng2NotBetween(String value1, String value2) {
            addCriterion("BIANGENGMINGCHENG2 not between", value1, value2, "biangengmingcheng2");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyu2IsNull() {
            addCriterion("BIANGENGDIYU2 is null");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyu2IsNotNull() {
            addCriterion("BIANGENGDIYU2 is not null");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyu2EqualTo(String value) {
            addCriterion("BIANGENGDIYU2 =", value, "biangengdiyu2");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyu2NotEqualTo(String value) {
            addCriterion("BIANGENGDIYU2 <>", value, "biangengdiyu2");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyu2GreaterThan(String value) {
            addCriterion("BIANGENGDIYU2 >", value, "biangengdiyu2");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyu2GreaterThanOrEqualTo(String value) {
            addCriterion("BIANGENGDIYU2 >=", value, "biangengdiyu2");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyu2LessThan(String value) {
            addCriterion("BIANGENGDIYU2 <", value, "biangengdiyu2");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyu2LessThanOrEqualTo(String value) {
            addCriterion("BIANGENGDIYU2 <=", value, "biangengdiyu2");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyu2Like(String value) {
            addCriterion("BIANGENGDIYU2 like", value, "biangengdiyu2");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyu2NotLike(String value) {
            addCriterion("BIANGENGDIYU2 not like", value, "biangengdiyu2");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyu2In(List<String> values) {
            addCriterion("BIANGENGDIYU2 in", values, "biangengdiyu2");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyu2NotIn(List<String> values) {
            addCriterion("BIANGENGDIYU2 not in", values, "biangengdiyu2");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyu2Between(String value1, String value2) {
            addCriterion("BIANGENGDIYU2 between", value1, value2, "biangengdiyu2");
            return (Criteria) this;
        }

        public Criteria andBiangengdiyu2NotBetween(String value1, String value2) {
            addCriterion("BIANGENGDIYU2 not between", value1, value2, "biangengdiyu2");
            return (Criteria) this;
        }

        public Criteria andBiangengyewu2IsNull() {
            addCriterion("BIANGENGYEWU2 is null");
            return (Criteria) this;
        }

        public Criteria andBiangengyewu2IsNotNull() {
            addCriterion("BIANGENGYEWU2 is not null");
            return (Criteria) this;
        }

        public Criteria andBiangengyewu2EqualTo(String value) {
            addCriterion("BIANGENGYEWU2 =", value, "biangengyewu2");
            return (Criteria) this;
        }

        public Criteria andBiangengyewu2NotEqualTo(String value) {
            addCriterion("BIANGENGYEWU2 <>", value, "biangengyewu2");
            return (Criteria) this;
        }

        public Criteria andBiangengyewu2GreaterThan(String value) {
            addCriterion("BIANGENGYEWU2 >", value, "biangengyewu2");
            return (Criteria) this;
        }

        public Criteria andBiangengyewu2GreaterThanOrEqualTo(String value) {
            addCriterion("BIANGENGYEWU2 >=", value, "biangengyewu2");
            return (Criteria) this;
        }

        public Criteria andBiangengyewu2LessThan(String value) {
            addCriterion("BIANGENGYEWU2 <", value, "biangengyewu2");
            return (Criteria) this;
        }

        public Criteria andBiangengyewu2LessThanOrEqualTo(String value) {
            addCriterion("BIANGENGYEWU2 <=", value, "biangengyewu2");
            return (Criteria) this;
        }

        public Criteria andBiangengyewu2Like(String value) {
            addCriterion("BIANGENGYEWU2 like", value, "biangengyewu2");
            return (Criteria) this;
        }

        public Criteria andBiangengyewu2NotLike(String value) {
            addCriterion("BIANGENGYEWU2 not like", value, "biangengyewu2");
            return (Criteria) this;
        }

        public Criteria andBiangengyewu2In(List<String> values) {
            addCriterion("BIANGENGYEWU2 in", values, "biangengyewu2");
            return (Criteria) this;
        }

        public Criteria andBiangengyewu2NotIn(List<String> values) {
            addCriterion("BIANGENGYEWU2 not in", values, "biangengyewu2");
            return (Criteria) this;
        }

        public Criteria andBiangengyewu2Between(String value1, String value2) {
            addCriterion("BIANGENGYEWU2 between", value1, value2, "biangengyewu2");
            return (Criteria) this;
        }

        public Criteria andBiangengyewu2NotBetween(String value1, String value2) {
            addCriterion("BIANGENGYEWU2 not between", value1, value2, "biangengyewu2");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuo2IsNull() {
            addCriterion("BIANGENGZHUSUO2 is null");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuo2IsNotNull() {
            addCriterion("BIANGENGZHUSUO2 is not null");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuo2EqualTo(String value) {
            addCriterion("BIANGENGZHUSUO2 =", value, "biangengzhusuo2");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuo2NotEqualTo(String value) {
            addCriterion("BIANGENGZHUSUO2 <>", value, "biangengzhusuo2");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuo2GreaterThan(String value) {
            addCriterion("BIANGENGZHUSUO2 >", value, "biangengzhusuo2");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuo2GreaterThanOrEqualTo(String value) {
            addCriterion("BIANGENGZHUSUO2 >=", value, "biangengzhusuo2");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuo2LessThan(String value) {
            addCriterion("BIANGENGZHUSUO2 <", value, "biangengzhusuo2");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuo2LessThanOrEqualTo(String value) {
            addCriterion("BIANGENGZHUSUO2 <=", value, "biangengzhusuo2");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuo2Like(String value) {
            addCriterion("BIANGENGZHUSUO2 like", value, "biangengzhusuo2");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuo2NotLike(String value) {
            addCriterion("BIANGENGZHUSUO2 not like", value, "biangengzhusuo2");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuo2In(List<String> values) {
            addCriterion("BIANGENGZHUSUO2 in", values, "biangengzhusuo2");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuo2NotIn(List<String> values) {
            addCriterion("BIANGENGZHUSUO2 not in", values, "biangengzhusuo2");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuo2Between(String value1, String value2) {
            addCriterion("BIANGENGZHUSUO2 between", value1, value2, "biangengzhusuo2");
            return (Criteria) this;
        }

        public Criteria andBiangengzhusuo2NotBetween(String value1, String value2) {
            addCriterion("BIANGENGZHUSUO2 not between", value1, value2, "biangengzhusuo2");
            return (Criteria) this;
        }

        public Criteria andBiangengzijin2IsNull() {
            addCriterion("BIANGENGZIJIN2 is null");
            return (Criteria) this;
        }

        public Criteria andBiangengzijin2IsNotNull() {
            addCriterion("BIANGENGZIJIN2 is not null");
            return (Criteria) this;
        }

        public Criteria andBiangengzijin2EqualTo(String value) {
            addCriterion("BIANGENGZIJIN2 =", value, "biangengzijin2");
            return (Criteria) this;
        }

        public Criteria andBiangengzijin2NotEqualTo(String value) {
            addCriterion("BIANGENGZIJIN2 <>", value, "biangengzijin2");
            return (Criteria) this;
        }

        public Criteria andBiangengzijin2GreaterThan(String value) {
            addCriterion("BIANGENGZIJIN2 >", value, "biangengzijin2");
            return (Criteria) this;
        }

        public Criteria andBiangengzijin2GreaterThanOrEqualTo(String value) {
            addCriterion("BIANGENGZIJIN2 >=", value, "biangengzijin2");
            return (Criteria) this;
        }

        public Criteria andBiangengzijin2LessThan(String value) {
            addCriterion("BIANGENGZIJIN2 <", value, "biangengzijin2");
            return (Criteria) this;
        }

        public Criteria andBiangengzijin2LessThanOrEqualTo(String value) {
            addCriterion("BIANGENGZIJIN2 <=", value, "biangengzijin2");
            return (Criteria) this;
        }

        public Criteria andBiangengzijin2Like(String value) {
            addCriterion("BIANGENGZIJIN2 like", value, "biangengzijin2");
            return (Criteria) this;
        }

        public Criteria andBiangengzijin2NotLike(String value) {
            addCriterion("BIANGENGZIJIN2 not like", value, "biangengzijin2");
            return (Criteria) this;
        }

        public Criteria andBiangengzijin2In(List<String> values) {
            addCriterion("BIANGENGZIJIN2 in", values, "biangengzijin2");
            return (Criteria) this;
        }

        public Criteria andBiangengzijin2NotIn(List<String> values) {
            addCriterion("BIANGENGZIJIN2 not in", values, "biangengzijin2");
            return (Criteria) this;
        }

        public Criteria andBiangengzijin2Between(String value1, String value2) {
            addCriterion("BIANGENGZIJIN2 between", value1, value2, "biangengzijin2");
            return (Criteria) this;
        }

        public Criteria andBiangengzijin2NotBetween(String value1, String value2) {
            addCriterion("BIANGENGZIJIN2 not between", value1, value2, "biangengzijin2");
            return (Criteria) this;
        }

        public Criteria andBiangengfaren2IsNull() {
            addCriterion("BIANGENGFAREN2 is null");
            return (Criteria) this;
        }

        public Criteria andBiangengfaren2IsNotNull() {
            addCriterion("BIANGENGFAREN2 is not null");
            return (Criteria) this;
        }

        public Criteria andBiangengfaren2EqualTo(String value) {
            addCriterion("BIANGENGFAREN2 =", value, "biangengfaren2");
            return (Criteria) this;
        }

        public Criteria andBiangengfaren2NotEqualTo(String value) {
            addCriterion("BIANGENGFAREN2 <>", value, "biangengfaren2");
            return (Criteria) this;
        }

        public Criteria andBiangengfaren2GreaterThan(String value) {
            addCriterion("BIANGENGFAREN2 >", value, "biangengfaren2");
            return (Criteria) this;
        }

        public Criteria andBiangengfaren2GreaterThanOrEqualTo(String value) {
            addCriterion("BIANGENGFAREN2 >=", value, "biangengfaren2");
            return (Criteria) this;
        }

        public Criteria andBiangengfaren2LessThan(String value) {
            addCriterion("BIANGENGFAREN2 <", value, "biangengfaren2");
            return (Criteria) this;
        }

        public Criteria andBiangengfaren2LessThanOrEqualTo(String value) {
            addCriterion("BIANGENGFAREN2 <=", value, "biangengfaren2");
            return (Criteria) this;
        }

        public Criteria andBiangengfaren2Like(String value) {
            addCriterion("BIANGENGFAREN2 like", value, "biangengfaren2");
            return (Criteria) this;
        }

        public Criteria andBiangengfaren2NotLike(String value) {
            addCriterion("BIANGENGFAREN2 not like", value, "biangengfaren2");
            return (Criteria) this;
        }

        public Criteria andBiangengfaren2In(List<String> values) {
            addCriterion("BIANGENGFAREN2 in", values, "biangengfaren2");
            return (Criteria) this;
        }

        public Criteria andBiangengfaren2NotIn(List<String> values) {
            addCriterion("BIANGENGFAREN2 not in", values, "biangengfaren2");
            return (Criteria) this;
        }

        public Criteria andBiangengfaren2Between(String value1, String value2) {
            addCriterion("BIANGENGFAREN2 between", value1, value2, "biangengfaren2");
            return (Criteria) this;
        }

        public Criteria andBiangengfaren2NotBetween(String value1, String value2) {
            addCriterion("BIANGENGFAREN2 not between", value1, value2, "biangengfaren2");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanwei2IsNull() {
            addCriterion("BIANZHUGUANDANWEI2 is null");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanwei2IsNotNull() {
            addCriterion("BIANZHUGUANDANWEI2 is not null");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanwei2EqualTo(String value) {
            addCriterion("BIANZHUGUANDANWEI2 =", value, "bianzhuguandanwei2");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanwei2NotEqualTo(String value) {
            addCriterion("BIANZHUGUANDANWEI2 <>", value, "bianzhuguandanwei2");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanwei2GreaterThan(String value) {
            addCriterion("BIANZHUGUANDANWEI2 >", value, "bianzhuguandanwei2");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanwei2GreaterThanOrEqualTo(String value) {
            addCriterion("BIANZHUGUANDANWEI2 >=", value, "bianzhuguandanwei2");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanwei2LessThan(String value) {
            addCriterion("BIANZHUGUANDANWEI2 <", value, "bianzhuguandanwei2");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanwei2LessThanOrEqualTo(String value) {
            addCriterion("BIANZHUGUANDANWEI2 <=", value, "bianzhuguandanwei2");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanwei2Like(String value) {
            addCriterion("BIANZHUGUANDANWEI2 like", value, "bianzhuguandanwei2");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanwei2NotLike(String value) {
            addCriterion("BIANZHUGUANDANWEI2 not like", value, "bianzhuguandanwei2");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanwei2In(List<String> values) {
            addCriterion("BIANZHUGUANDANWEI2 in", values, "bianzhuguandanwei2");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanwei2NotIn(List<String> values) {
            addCriterion("BIANZHUGUANDANWEI2 not in", values, "bianzhuguandanwei2");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanwei2Between(String value1, String value2) {
            addCriterion("BIANZHUGUANDANWEI2 between", value1, value2, "bianzhuguandanwei2");
            return (Criteria) this;
        }

        public Criteria andBianzhuguandanwei2NotBetween(String value1, String value2) {
            addCriterion("BIANZHUGUANDANWEI2 not between", value1, value2, "bianzhuguandanwei2");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangeng2IsNull() {
            addCriterion("FUZERENBIANGENG2 is null");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangeng2IsNotNull() {
            addCriterion("FUZERENBIANGENG2 is not null");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangeng2EqualTo(String value) {
            addCriterion("FUZERENBIANGENG2 =", value, "fuzerenbiangeng2");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangeng2NotEqualTo(String value) {
            addCriterion("FUZERENBIANGENG2 <>", value, "fuzerenbiangeng2");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangeng2GreaterThan(String value) {
            addCriterion("FUZERENBIANGENG2 >", value, "fuzerenbiangeng2");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangeng2GreaterThanOrEqualTo(String value) {
            addCriterion("FUZERENBIANGENG2 >=", value, "fuzerenbiangeng2");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangeng2LessThan(String value) {
            addCriterion("FUZERENBIANGENG2 <", value, "fuzerenbiangeng2");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangeng2LessThanOrEqualTo(String value) {
            addCriterion("FUZERENBIANGENG2 <=", value, "fuzerenbiangeng2");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangeng2Like(String value) {
            addCriterion("FUZERENBIANGENG2 like", value, "fuzerenbiangeng2");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangeng2NotLike(String value) {
            addCriterion("FUZERENBIANGENG2 not like", value, "fuzerenbiangeng2");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangeng2In(List<String> values) {
            addCriterion("FUZERENBIANGENG2 in", values, "fuzerenbiangeng2");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangeng2NotIn(List<String> values) {
            addCriterion("FUZERENBIANGENG2 not in", values, "fuzerenbiangeng2");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangeng2Between(String value1, String value2) {
            addCriterion("FUZERENBIANGENG2 between", value1, value2, "fuzerenbiangeng2");
            return (Criteria) this;
        }

        public Criteria andFuzerenbiangeng2NotBetween(String value1, String value2) {
            addCriterion("FUZERENBIANGENG2 not between", value1, value2, "fuzerenbiangeng2");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangcheng2IsNull() {
            addCriterion("XIUGAIZHANGCHENG2 is null");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangcheng2IsNotNull() {
            addCriterion("XIUGAIZHANGCHENG2 is not null");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangcheng2EqualTo(String value) {
            addCriterion("XIUGAIZHANGCHENG2 =", value, "xiugaizhangcheng2");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangcheng2NotEqualTo(String value) {
            addCriterion("XIUGAIZHANGCHENG2 <>", value, "xiugaizhangcheng2");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangcheng2GreaterThan(String value) {
            addCriterion("XIUGAIZHANGCHENG2 >", value, "xiugaizhangcheng2");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangcheng2GreaterThanOrEqualTo(String value) {
            addCriterion("XIUGAIZHANGCHENG2 >=", value, "xiugaizhangcheng2");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangcheng2LessThan(String value) {
            addCriterion("XIUGAIZHANGCHENG2 <", value, "xiugaizhangcheng2");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangcheng2LessThanOrEqualTo(String value) {
            addCriterion("XIUGAIZHANGCHENG2 <=", value, "xiugaizhangcheng2");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangcheng2Like(String value) {
            addCriterion("XIUGAIZHANGCHENG2 like", value, "xiugaizhangcheng2");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangcheng2NotLike(String value) {
            addCriterion("XIUGAIZHANGCHENG2 not like", value, "xiugaizhangcheng2");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangcheng2In(List<String> values) {
            addCriterion("XIUGAIZHANGCHENG2 in", values, "xiugaizhangcheng2");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangcheng2NotIn(List<String> values) {
            addCriterion("XIUGAIZHANGCHENG2 not in", values, "xiugaizhangcheng2");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangcheng2Between(String value1, String value2) {
            addCriterion("XIUGAIZHANGCHENG2 between", value1, value2, "xiugaizhangcheng2");
            return (Criteria) this;
        }

        public Criteria andXiugaizhangcheng2NotBetween(String value1, String value2) {
            addCriterion("XIUGAIZHANGCHENG2 not between", value1, value2, "xiugaizhangcheng2");
            return (Criteria) this;
        }

        public Criteria andDanganzhiduIsNull() {
            addCriterion("DANGANZHIDU is null");
            return (Criteria) this;
        }

        public Criteria andDanganzhiduIsNotNull() {
            addCriterion("DANGANZHIDU is not null");
            return (Criteria) this;
        }

        public Criteria andDanganzhiduEqualTo(String value) {
            addCriterion("DANGANZHIDU =", value, "danganzhidu");
            return (Criteria) this;
        }

        public Criteria andDanganzhiduNotEqualTo(String value) {
            addCriterion("DANGANZHIDU <>", value, "danganzhidu");
            return (Criteria) this;
        }

        public Criteria andDanganzhiduGreaterThan(String value) {
            addCriterion("DANGANZHIDU >", value, "danganzhidu");
            return (Criteria) this;
        }

        public Criteria andDanganzhiduGreaterThanOrEqualTo(String value) {
            addCriterion("DANGANZHIDU >=", value, "danganzhidu");
            return (Criteria) this;
        }

        public Criteria andDanganzhiduLessThan(String value) {
            addCriterion("DANGANZHIDU <", value, "danganzhidu");
            return (Criteria) this;
        }

        public Criteria andDanganzhiduLessThanOrEqualTo(String value) {
            addCriterion("DANGANZHIDU <=", value, "danganzhidu");
            return (Criteria) this;
        }

        public Criteria andDanganzhiduLike(String value) {
            addCriterion("DANGANZHIDU like", value, "danganzhidu");
            return (Criteria) this;
        }

        public Criteria andDanganzhiduNotLike(String value) {
            addCriterion("DANGANZHIDU not like", value, "danganzhidu");
            return (Criteria) this;
        }

        public Criteria andDanganzhiduIn(List<String> values) {
            addCriterion("DANGANZHIDU in", values, "danganzhidu");
            return (Criteria) this;
        }

        public Criteria andDanganzhiduNotIn(List<String> values) {
            addCriterion("DANGANZHIDU not in", values, "danganzhidu");
            return (Criteria) this;
        }

        public Criteria andDanganzhiduBetween(String value1, String value2) {
            addCriterion("DANGANZHIDU between", value1, value2, "danganzhidu");
            return (Criteria) this;
        }

        public Criteria andDanganzhiduNotBetween(String value1, String value2) {
            addCriterion("DANGANZHIDU not between", value1, value2, "danganzhidu");
            return (Criteria) this;
        }

        public Criteria andDanganbaoguandiIsNull() {
            addCriterion("DANGANBAOGUANDI is null");
            return (Criteria) this;
        }

        public Criteria andDanganbaoguandiIsNotNull() {
            addCriterion("DANGANBAOGUANDI is not null");
            return (Criteria) this;
        }

        public Criteria andDanganbaoguandiEqualTo(String value) {
            addCriterion("DANGANBAOGUANDI =", value, "danganbaoguandi");
            return (Criteria) this;
        }

        public Criteria andDanganbaoguandiNotEqualTo(String value) {
            addCriterion("DANGANBAOGUANDI <>", value, "danganbaoguandi");
            return (Criteria) this;
        }

        public Criteria andDanganbaoguandiGreaterThan(String value) {
            addCriterion("DANGANBAOGUANDI >", value, "danganbaoguandi");
            return (Criteria) this;
        }

        public Criteria andDanganbaoguandiGreaterThanOrEqualTo(String value) {
            addCriterion("DANGANBAOGUANDI >=", value, "danganbaoguandi");
            return (Criteria) this;
        }

        public Criteria andDanganbaoguandiLessThan(String value) {
            addCriterion("DANGANBAOGUANDI <", value, "danganbaoguandi");
            return (Criteria) this;
        }

        public Criteria andDanganbaoguandiLessThanOrEqualTo(String value) {
            addCriterion("DANGANBAOGUANDI <=", value, "danganbaoguandi");
            return (Criteria) this;
        }

        public Criteria andDanganbaoguandiLike(String value) {
            addCriterion("DANGANBAOGUANDI like", value, "danganbaoguandi");
            return (Criteria) this;
        }

        public Criteria andDanganbaoguandiNotLike(String value) {
            addCriterion("DANGANBAOGUANDI not like", value, "danganbaoguandi");
            return (Criteria) this;
        }

        public Criteria andDanganbaoguandiIn(List<String> values) {
            addCriterion("DANGANBAOGUANDI in", values, "danganbaoguandi");
            return (Criteria) this;
        }

        public Criteria andDanganbaoguandiNotIn(List<String> values) {
            addCriterion("DANGANBAOGUANDI not in", values, "danganbaoguandi");
            return (Criteria) this;
        }

        public Criteria andDanganbaoguandiBetween(String value1, String value2) {
            addCriterion("DANGANBAOGUANDI between", value1, value2, "danganbaoguandi");
            return (Criteria) this;
        }

        public Criteria andDanganbaoguandiNotBetween(String value1, String value2) {
            addCriterion("DANGANBAOGUANDI not between", value1, value2, "danganbaoguandi");
            return (Criteria) this;
        }

        public Criteria andXinchouguanlizhiduIsNull() {
            addCriterion("XINCHOUGUANLIZHIDU is null");
            return (Criteria) this;
        }

        public Criteria andXinchouguanlizhiduIsNotNull() {
            addCriterion("XINCHOUGUANLIZHIDU is not null");
            return (Criteria) this;
        }

        public Criteria andXinchouguanlizhiduEqualTo(String value) {
            addCriterion("XINCHOUGUANLIZHIDU =", value, "xinchouguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andXinchouguanlizhiduNotEqualTo(String value) {
            addCriterion("XINCHOUGUANLIZHIDU <>", value, "xinchouguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andXinchouguanlizhiduGreaterThan(String value) {
            addCriterion("XINCHOUGUANLIZHIDU >", value, "xinchouguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andXinchouguanlizhiduGreaterThanOrEqualTo(String value) {
            addCriterion("XINCHOUGUANLIZHIDU >=", value, "xinchouguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andXinchouguanlizhiduLessThan(String value) {
            addCriterion("XINCHOUGUANLIZHIDU <", value, "xinchouguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andXinchouguanlizhiduLessThanOrEqualTo(String value) {
            addCriterion("XINCHOUGUANLIZHIDU <=", value, "xinchouguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andXinchouguanlizhiduLike(String value) {
            addCriterion("XINCHOUGUANLIZHIDU like", value, "xinchouguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andXinchouguanlizhiduNotLike(String value) {
            addCriterion("XINCHOUGUANLIZHIDU not like", value, "xinchouguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andXinchouguanlizhiduIn(List<String> values) {
            addCriterion("XINCHOUGUANLIZHIDU in", values, "xinchouguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andXinchouguanlizhiduNotIn(List<String> values) {
            addCriterion("XINCHOUGUANLIZHIDU not in", values, "xinchouguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andXinchouguanlizhiduBetween(String value1, String value2) {
            addCriterion("XINCHOUGUANLIZHIDU between", value1, value2, "xinchouguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andXinchouguanlizhiduNotBetween(String value1, String value2) {
            addCriterion("XINCHOUGUANLIZHIDU not between", value1, value2, "xinchouguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andXinchouguanlizhidu2IsNull() {
            addCriterion("XINCHOUGUANLIZHIDU2 is null");
            return (Criteria) this;
        }

        public Criteria andXinchouguanlizhidu2IsNotNull() {
            addCriterion("XINCHOUGUANLIZHIDU2 is not null");
            return (Criteria) this;
        }

        public Criteria andXinchouguanlizhidu2EqualTo(String value) {
            addCriterion("XINCHOUGUANLIZHIDU2 =", value, "xinchouguanlizhidu2");
            return (Criteria) this;
        }

        public Criteria andXinchouguanlizhidu2NotEqualTo(String value) {
            addCriterion("XINCHOUGUANLIZHIDU2 <>", value, "xinchouguanlizhidu2");
            return (Criteria) this;
        }

        public Criteria andXinchouguanlizhidu2GreaterThan(String value) {
            addCriterion("XINCHOUGUANLIZHIDU2 >", value, "xinchouguanlizhidu2");
            return (Criteria) this;
        }

        public Criteria andXinchouguanlizhidu2GreaterThanOrEqualTo(String value) {
            addCriterion("XINCHOUGUANLIZHIDU2 >=", value, "xinchouguanlizhidu2");
            return (Criteria) this;
        }

        public Criteria andXinchouguanlizhidu2LessThan(String value) {
            addCriterion("XINCHOUGUANLIZHIDU2 <", value, "xinchouguanlizhidu2");
            return (Criteria) this;
        }

        public Criteria andXinchouguanlizhidu2LessThanOrEqualTo(String value) {
            addCriterion("XINCHOUGUANLIZHIDU2 <=", value, "xinchouguanlizhidu2");
            return (Criteria) this;
        }

        public Criteria andXinchouguanlizhidu2Like(String value) {
            addCriterion("XINCHOUGUANLIZHIDU2 like", value, "xinchouguanlizhidu2");
            return (Criteria) this;
        }

        public Criteria andXinchouguanlizhidu2NotLike(String value) {
            addCriterion("XINCHOUGUANLIZHIDU2 not like", value, "xinchouguanlizhidu2");
            return (Criteria) this;
        }

        public Criteria andXinchouguanlizhidu2In(List<String> values) {
            addCriterion("XINCHOUGUANLIZHIDU2 in", values, "xinchouguanlizhidu2");
            return (Criteria) this;
        }

        public Criteria andXinchouguanlizhidu2NotIn(List<String> values) {
            addCriterion("XINCHOUGUANLIZHIDU2 not in", values, "xinchouguanlizhidu2");
            return (Criteria) this;
        }

        public Criteria andXinchouguanlizhidu2Between(String value1, String value2) {
            addCriterion("XINCHOUGUANLIZHIDU2 between", value1, value2, "xinchouguanlizhidu2");
            return (Criteria) this;
        }

        public Criteria andXinchouguanlizhidu2NotBetween(String value1, String value2) {
            addCriterion("XINCHOUGUANLIZHIDU2 not between", value1, value2, "xinchouguanlizhidu2");
            return (Criteria) this;
        }

        public Criteria andJiangchengzhiduIsNull() {
            addCriterion("JIANGCHENGZHIDU is null");
            return (Criteria) this;
        }

        public Criteria andJiangchengzhiduIsNotNull() {
            addCriterion("JIANGCHENGZHIDU is not null");
            return (Criteria) this;
        }

        public Criteria andJiangchengzhiduEqualTo(String value) {
            addCriterion("JIANGCHENGZHIDU =", value, "jiangchengzhidu");
            return (Criteria) this;
        }

        public Criteria andJiangchengzhiduNotEqualTo(String value) {
            addCriterion("JIANGCHENGZHIDU <>", value, "jiangchengzhidu");
            return (Criteria) this;
        }

        public Criteria andJiangchengzhiduGreaterThan(String value) {
            addCriterion("JIANGCHENGZHIDU >", value, "jiangchengzhidu");
            return (Criteria) this;
        }

        public Criteria andJiangchengzhiduGreaterThanOrEqualTo(String value) {
            addCriterion("JIANGCHENGZHIDU >=", value, "jiangchengzhidu");
            return (Criteria) this;
        }

        public Criteria andJiangchengzhiduLessThan(String value) {
            addCriterion("JIANGCHENGZHIDU <", value, "jiangchengzhidu");
            return (Criteria) this;
        }

        public Criteria andJiangchengzhiduLessThanOrEqualTo(String value) {
            addCriterion("JIANGCHENGZHIDU <=", value, "jiangchengzhidu");
            return (Criteria) this;
        }

        public Criteria andJiangchengzhiduLike(String value) {
            addCriterion("JIANGCHENGZHIDU like", value, "jiangchengzhidu");
            return (Criteria) this;
        }

        public Criteria andJiangchengzhiduNotLike(String value) {
            addCriterion("JIANGCHENGZHIDU not like", value, "jiangchengzhidu");
            return (Criteria) this;
        }

        public Criteria andJiangchengzhiduIn(List<String> values) {
            addCriterion("JIANGCHENGZHIDU in", values, "jiangchengzhidu");
            return (Criteria) this;
        }

        public Criteria andJiangchengzhiduNotIn(List<String> values) {
            addCriterion("JIANGCHENGZHIDU not in", values, "jiangchengzhidu");
            return (Criteria) this;
        }

        public Criteria andJiangchengzhiduBetween(String value1, String value2) {
            addCriterion("JIANGCHENGZHIDU between", value1, value2, "jiangchengzhidu");
            return (Criteria) this;
        }

        public Criteria andJiangchengzhiduNotBetween(String value1, String value2) {
            addCriterion("JIANGCHENGZHIDU not between", value1, value2, "jiangchengzhidu");
            return (Criteria) this;
        }

        public Criteria andYewupeixunzhiduIsNull() {
            addCriterion("YEWUPEIXUNZHIDU is null");
            return (Criteria) this;
        }

        public Criteria andYewupeixunzhiduIsNotNull() {
            addCriterion("YEWUPEIXUNZHIDU is not null");
            return (Criteria) this;
        }

        public Criteria andYewupeixunzhiduEqualTo(String value) {
            addCriterion("YEWUPEIXUNZHIDU =", value, "yewupeixunzhidu");
            return (Criteria) this;
        }

        public Criteria andYewupeixunzhiduNotEqualTo(String value) {
            addCriterion("YEWUPEIXUNZHIDU <>", value, "yewupeixunzhidu");
            return (Criteria) this;
        }

        public Criteria andYewupeixunzhiduGreaterThan(String value) {
            addCriterion("YEWUPEIXUNZHIDU >", value, "yewupeixunzhidu");
            return (Criteria) this;
        }

        public Criteria andYewupeixunzhiduGreaterThanOrEqualTo(String value) {
            addCriterion("YEWUPEIXUNZHIDU >=", value, "yewupeixunzhidu");
            return (Criteria) this;
        }

        public Criteria andYewupeixunzhiduLessThan(String value) {
            addCriterion("YEWUPEIXUNZHIDU <", value, "yewupeixunzhidu");
            return (Criteria) this;
        }

        public Criteria andYewupeixunzhiduLessThanOrEqualTo(String value) {
            addCriterion("YEWUPEIXUNZHIDU <=", value, "yewupeixunzhidu");
            return (Criteria) this;
        }

        public Criteria andYewupeixunzhiduLike(String value) {
            addCriterion("YEWUPEIXUNZHIDU like", value, "yewupeixunzhidu");
            return (Criteria) this;
        }

        public Criteria andYewupeixunzhiduNotLike(String value) {
            addCriterion("YEWUPEIXUNZHIDU not like", value, "yewupeixunzhidu");
            return (Criteria) this;
        }

        public Criteria andYewupeixunzhiduIn(List<String> values) {
            addCriterion("YEWUPEIXUNZHIDU in", values, "yewupeixunzhidu");
            return (Criteria) this;
        }

        public Criteria andYewupeixunzhiduNotIn(List<String> values) {
            addCriterion("YEWUPEIXUNZHIDU not in", values, "yewupeixunzhidu");
            return (Criteria) this;
        }

        public Criteria andYewupeixunzhiduBetween(String value1, String value2) {
            addCriterion("YEWUPEIXUNZHIDU between", value1, value2, "yewupeixunzhidu");
            return (Criteria) this;
        }

        public Criteria andYewupeixunzhiduNotBetween(String value1, String value2) {
            addCriterion("YEWUPEIXUNZHIDU not between", value1, value2, "yewupeixunzhidu");
            return (Criteria) this;
        }

        public Criteria andCaiwuguanlizhiduIsNull() {
            addCriterion("CAIWUGUANLIZHIDU is null");
            return (Criteria) this;
        }

        public Criteria andCaiwuguanlizhiduIsNotNull() {
            addCriterion("CAIWUGUANLIZHIDU is not null");
            return (Criteria) this;
        }

        public Criteria andCaiwuguanlizhiduEqualTo(String value) {
            addCriterion("CAIWUGUANLIZHIDU =", value, "caiwuguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andCaiwuguanlizhiduNotEqualTo(String value) {
            addCriterion("CAIWUGUANLIZHIDU <>", value, "caiwuguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andCaiwuguanlizhiduGreaterThan(String value) {
            addCriterion("CAIWUGUANLIZHIDU >", value, "caiwuguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andCaiwuguanlizhiduGreaterThanOrEqualTo(String value) {
            addCriterion("CAIWUGUANLIZHIDU >=", value, "caiwuguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andCaiwuguanlizhiduLessThan(String value) {
            addCriterion("CAIWUGUANLIZHIDU <", value, "caiwuguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andCaiwuguanlizhiduLessThanOrEqualTo(String value) {
            addCriterion("CAIWUGUANLIZHIDU <=", value, "caiwuguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andCaiwuguanlizhiduLike(String value) {
            addCriterion("CAIWUGUANLIZHIDU like", value, "caiwuguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andCaiwuguanlizhiduNotLike(String value) {
            addCriterion("CAIWUGUANLIZHIDU not like", value, "caiwuguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andCaiwuguanlizhiduIn(List<String> values) {
            addCriterion("CAIWUGUANLIZHIDU in", values, "caiwuguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andCaiwuguanlizhiduNotIn(List<String> values) {
            addCriterion("CAIWUGUANLIZHIDU not in", values, "caiwuguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andCaiwuguanlizhiduBetween(String value1, String value2) {
            addCriterion("CAIWUGUANLIZHIDU between", value1, value2, "caiwuguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andCaiwuguanlizhiduNotBetween(String value1, String value2) {
            addCriterion("CAIWUGUANLIZHIDU not between", value1, value2, "caiwuguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andGuziguanlizhiduIsNull() {
            addCriterion("GUZIGUANLIZHIDU is null");
            return (Criteria) this;
        }

        public Criteria andGuziguanlizhiduIsNotNull() {
            addCriterion("GUZIGUANLIZHIDU is not null");
            return (Criteria) this;
        }

        public Criteria andGuziguanlizhiduEqualTo(String value) {
            addCriterion("GUZIGUANLIZHIDU =", value, "guziguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andGuziguanlizhiduNotEqualTo(String value) {
            addCriterion("GUZIGUANLIZHIDU <>", value, "guziguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andGuziguanlizhiduGreaterThan(String value) {
            addCriterion("GUZIGUANLIZHIDU >", value, "guziguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andGuziguanlizhiduGreaterThanOrEqualTo(String value) {
            addCriterion("GUZIGUANLIZHIDU >=", value, "guziguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andGuziguanlizhiduLessThan(String value) {
            addCriterion("GUZIGUANLIZHIDU <", value, "guziguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andGuziguanlizhiduLessThanOrEqualTo(String value) {
            addCriterion("GUZIGUANLIZHIDU <=", value, "guziguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andGuziguanlizhiduLike(String value) {
            addCriterion("GUZIGUANLIZHIDU like", value, "guziguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andGuziguanlizhiduNotLike(String value) {
            addCriterion("GUZIGUANLIZHIDU not like", value, "guziguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andGuziguanlizhiduIn(List<String> values) {
            addCriterion("GUZIGUANLIZHIDU in", values, "guziguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andGuziguanlizhiduNotIn(List<String> values) {
            addCriterion("GUZIGUANLIZHIDU not in", values, "guziguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andGuziguanlizhiduBetween(String value1, String value2) {
            addCriterion("GUZIGUANLIZHIDU between", value1, value2, "guziguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andGuziguanlizhiduNotBetween(String value1, String value2) {
            addCriterion("GUZIGUANLIZHIDU not between", value1, value2, "guziguanlizhidu");
            return (Criteria) this;
        }

        public Criteria andZhixingkuaijizhiduIsNull() {
            addCriterion("ZHIXINGKUAIJIZHIDU is null");
            return (Criteria) this;
        }

        public Criteria andZhixingkuaijizhiduIsNotNull() {
            addCriterion("ZHIXINGKUAIJIZHIDU is not null");
            return (Criteria) this;
        }

        public Criteria andZhixingkuaijizhiduEqualTo(String value) {
            addCriterion("ZHIXINGKUAIJIZHIDU =", value, "zhixingkuaijizhidu");
            return (Criteria) this;
        }

        public Criteria andZhixingkuaijizhiduNotEqualTo(String value) {
            addCriterion("ZHIXINGKUAIJIZHIDU <>", value, "zhixingkuaijizhidu");
            return (Criteria) this;
        }

        public Criteria andZhixingkuaijizhiduGreaterThan(String value) {
            addCriterion("ZHIXINGKUAIJIZHIDU >", value, "zhixingkuaijizhidu");
            return (Criteria) this;
        }

        public Criteria andZhixingkuaijizhiduGreaterThanOrEqualTo(String value) {
            addCriterion("ZHIXINGKUAIJIZHIDU >=", value, "zhixingkuaijizhidu");
            return (Criteria) this;
        }

        public Criteria andZhixingkuaijizhiduLessThan(String value) {
            addCriterion("ZHIXINGKUAIJIZHIDU <", value, "zhixingkuaijizhidu");
            return (Criteria) this;
        }

        public Criteria andZhixingkuaijizhiduLessThanOrEqualTo(String value) {
            addCriterion("ZHIXINGKUAIJIZHIDU <=", value, "zhixingkuaijizhidu");
            return (Criteria) this;
        }

        public Criteria andZhixingkuaijizhiduLike(String value) {
            addCriterion("ZHIXINGKUAIJIZHIDU like", value, "zhixingkuaijizhidu");
            return (Criteria) this;
        }

        public Criteria andZhixingkuaijizhiduNotLike(String value) {
            addCriterion("ZHIXINGKUAIJIZHIDU not like", value, "zhixingkuaijizhidu");
            return (Criteria) this;
        }

        public Criteria andZhixingkuaijizhiduIn(List<String> values) {
            addCriterion("ZHIXINGKUAIJIZHIDU in", values, "zhixingkuaijizhidu");
            return (Criteria) this;
        }

        public Criteria andZhixingkuaijizhiduNotIn(List<String> values) {
            addCriterion("ZHIXINGKUAIJIZHIDU not in", values, "zhixingkuaijizhidu");
            return (Criteria) this;
        }

        public Criteria andZhixingkuaijizhiduBetween(String value1, String value2) {
            addCriterion("ZHIXINGKUAIJIZHIDU between", value1, value2, "zhixingkuaijizhidu");
            return (Criteria) this;
        }

        public Criteria andZhixingkuaijizhiduNotBetween(String value1, String value2) {
            addCriterion("ZHIXINGKUAIJIZHIDU not between", value1, value2, "zhixingkuaijizhidu");
            return (Criteria) this;
        }

        public Criteria andQitapiaoju2IsNull() {
            addCriterion("QITAPIAOJU2 is null");
            return (Criteria) this;
        }

        public Criteria andQitapiaoju2IsNotNull() {
            addCriterion("QITAPIAOJU2 is not null");
            return (Criteria) this;
        }

        public Criteria andQitapiaoju2EqualTo(String value) {
            addCriterion("QITAPIAOJU2 =", value, "qitapiaoju2");
            return (Criteria) this;
        }

        public Criteria andQitapiaoju2NotEqualTo(String value) {
            addCriterion("QITAPIAOJU2 <>", value, "qitapiaoju2");
            return (Criteria) this;
        }

        public Criteria andQitapiaoju2GreaterThan(String value) {
            addCriterion("QITAPIAOJU2 >", value, "qitapiaoju2");
            return (Criteria) this;
        }

        public Criteria andQitapiaoju2GreaterThanOrEqualTo(String value) {
            addCriterion("QITAPIAOJU2 >=", value, "qitapiaoju2");
            return (Criteria) this;
        }

        public Criteria andQitapiaoju2LessThan(String value) {
            addCriterion("QITAPIAOJU2 <", value, "qitapiaoju2");
            return (Criteria) this;
        }

        public Criteria andQitapiaoju2LessThanOrEqualTo(String value) {
            addCriterion("QITAPIAOJU2 <=", value, "qitapiaoju2");
            return (Criteria) this;
        }

        public Criteria andQitapiaoju2Like(String value) {
            addCriterion("QITAPIAOJU2 like", value, "qitapiaoju2");
            return (Criteria) this;
        }

        public Criteria andQitapiaoju2NotLike(String value) {
            addCriterion("QITAPIAOJU2 not like", value, "qitapiaoju2");
            return (Criteria) this;
        }

        public Criteria andQitapiaoju2In(List<String> values) {
            addCriterion("QITAPIAOJU2 in", values, "qitapiaoju2");
            return (Criteria) this;
        }

        public Criteria andQitapiaoju2NotIn(List<String> values) {
            addCriterion("QITAPIAOJU2 not in", values, "qitapiaoju2");
            return (Criteria) this;
        }

        public Criteria andQitapiaoju2Between(String value1, String value2) {
            addCriterion("QITAPIAOJU2 between", value1, value2, "qitapiaoju2");
            return (Criteria) this;
        }

        public Criteria andQitapiaoju2NotBetween(String value1, String value2) {
            addCriterion("QITAPIAOJU2 not between", value1, value2, "qitapiaoju2");
            return (Criteria) this;
        }

        public Criteria andPiaojuzhongleiqita2IsNull() {
            addCriterion("PIAOJUZHONGLEIQITA2 is null");
            return (Criteria) this;
        }

        public Criteria andPiaojuzhongleiqita2IsNotNull() {
            addCriterion("PIAOJUZHONGLEIQITA2 is not null");
            return (Criteria) this;
        }

        public Criteria andPiaojuzhongleiqita2EqualTo(String value) {
            addCriterion("PIAOJUZHONGLEIQITA2 =", value, "piaojuzhongleiqita2");
            return (Criteria) this;
        }

        public Criteria andPiaojuzhongleiqita2NotEqualTo(String value) {
            addCriterion("PIAOJUZHONGLEIQITA2 <>", value, "piaojuzhongleiqita2");
            return (Criteria) this;
        }

        public Criteria andPiaojuzhongleiqita2GreaterThan(String value) {
            addCriterion("PIAOJUZHONGLEIQITA2 >", value, "piaojuzhongleiqita2");
            return (Criteria) this;
        }

        public Criteria andPiaojuzhongleiqita2GreaterThanOrEqualTo(String value) {
            addCriterion("PIAOJUZHONGLEIQITA2 >=", value, "piaojuzhongleiqita2");
            return (Criteria) this;
        }

        public Criteria andPiaojuzhongleiqita2LessThan(String value) {
            addCriterion("PIAOJUZHONGLEIQITA2 <", value, "piaojuzhongleiqita2");
            return (Criteria) this;
        }

        public Criteria andPiaojuzhongleiqita2LessThanOrEqualTo(String value) {
            addCriterion("PIAOJUZHONGLEIQITA2 <=", value, "piaojuzhongleiqita2");
            return (Criteria) this;
        }

        public Criteria andPiaojuzhongleiqita2Like(String value) {
            addCriterion("PIAOJUZHONGLEIQITA2 like", value, "piaojuzhongleiqita2");
            return (Criteria) this;
        }

        public Criteria andPiaojuzhongleiqita2NotLike(String value) {
            addCriterion("PIAOJUZHONGLEIQITA2 not like", value, "piaojuzhongleiqita2");
            return (Criteria) this;
        }

        public Criteria andPiaojuzhongleiqita2In(List<String> values) {
            addCriterion("PIAOJUZHONGLEIQITA2 in", values, "piaojuzhongleiqita2");
            return (Criteria) this;
        }

        public Criteria andPiaojuzhongleiqita2NotIn(List<String> values) {
            addCriterion("PIAOJUZHONGLEIQITA2 not in", values, "piaojuzhongleiqita2");
            return (Criteria) this;
        }

        public Criteria andPiaojuzhongleiqita2Between(String value1, String value2) {
            addCriterion("PIAOJUZHONGLEIQITA2 between", value1, value2, "piaojuzhongleiqita2");
            return (Criteria) this;
        }

        public Criteria andPiaojuzhongleiqita2NotBetween(String value1, String value2) {
            addCriterion("PIAOJUZHONGLEIQITA2 not between", value1, value2, "piaojuzhongleiqita2");
            return (Criteria) this;
        }

        public Criteria andZhongyangdanweiIsNull() {
            addCriterion("ZHONGYANGDANWEI is null");
            return (Criteria) this;
        }

        public Criteria andZhongyangdanweiIsNotNull() {
            addCriterion("ZHONGYANGDANWEI is not null");
            return (Criteria) this;
        }

        public Criteria andZhongyangdanweiEqualTo(String value) {
            addCriterion("ZHONGYANGDANWEI =", value, "zhongyangdanwei");
            return (Criteria) this;
        }

        public Criteria andZhongyangdanweiNotEqualTo(String value) {
            addCriterion("ZHONGYANGDANWEI <>", value, "zhongyangdanwei");
            return (Criteria) this;
        }

        public Criteria andZhongyangdanweiGreaterThan(String value) {
            addCriterion("ZHONGYANGDANWEI >", value, "zhongyangdanwei");
            return (Criteria) this;
        }

        public Criteria andZhongyangdanweiGreaterThanOrEqualTo(String value) {
            addCriterion("ZHONGYANGDANWEI >=", value, "zhongyangdanwei");
            return (Criteria) this;
        }

        public Criteria andZhongyangdanweiLessThan(String value) {
            addCriterion("ZHONGYANGDANWEI <", value, "zhongyangdanwei");
            return (Criteria) this;
        }

        public Criteria andZhongyangdanweiLessThanOrEqualTo(String value) {
            addCriterion("ZHONGYANGDANWEI <=", value, "zhongyangdanwei");
            return (Criteria) this;
        }

        public Criteria andZhongyangdanweiLike(String value) {
            addCriterion("ZHONGYANGDANWEI like", value, "zhongyangdanwei");
            return (Criteria) this;
        }

        public Criteria andZhongyangdanweiNotLike(String value) {
            addCriterion("ZHONGYANGDANWEI not like", value, "zhongyangdanwei");
            return (Criteria) this;
        }

        public Criteria andZhongyangdanweiIn(List<String> values) {
            addCriterion("ZHONGYANGDANWEI in", values, "zhongyangdanwei");
            return (Criteria) this;
        }

        public Criteria andZhongyangdanweiNotIn(List<String> values) {
            addCriterion("ZHONGYANGDANWEI not in", values, "zhongyangdanwei");
            return (Criteria) this;
        }

        public Criteria andZhongyangdanweiBetween(String value1, String value2) {
            addCriterion("ZHONGYANGDANWEI between", value1, value2, "zhongyangdanwei");
            return (Criteria) this;
        }

        public Criteria andZhongyangdanweiNotBetween(String value1, String value2) {
            addCriterion("ZHONGYANGDANWEI not between", value1, value2, "zhongyangdanwei");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan1IsNull() {
            addCriterion("FAFANGJIGUAN1 is null");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan1IsNotNull() {
            addCriterion("FAFANGJIGUAN1 is not null");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan1EqualTo(String value) {
            addCriterion("FAFANGJIGUAN1 =", value, "fafangjiguan1");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan1NotEqualTo(String value) {
            addCriterion("FAFANGJIGUAN1 <>", value, "fafangjiguan1");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan1GreaterThan(String value) {
            addCriterion("FAFANGJIGUAN1 >", value, "fafangjiguan1");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan1GreaterThanOrEqualTo(String value) {
            addCriterion("FAFANGJIGUAN1 >=", value, "fafangjiguan1");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan1LessThan(String value) {
            addCriterion("FAFANGJIGUAN1 <", value, "fafangjiguan1");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan1LessThanOrEqualTo(String value) {
            addCriterion("FAFANGJIGUAN1 <=", value, "fafangjiguan1");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan1Like(String value) {
            addCriterion("FAFANGJIGUAN1 like", value, "fafangjiguan1");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan1NotLike(String value) {
            addCriterion("FAFANGJIGUAN1 not like", value, "fafangjiguan1");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan1In(List<String> values) {
            addCriterion("FAFANGJIGUAN1 in", values, "fafangjiguan1");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan1NotIn(List<String> values) {
            addCriterion("FAFANGJIGUAN1 not in", values, "fafangjiguan1");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan1Between(String value1, String value2) {
            addCriterion("FAFANGJIGUAN1 between", value1, value2, "fafangjiguan1");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan1NotBetween(String value1, String value2) {
            addCriterion("FAFANGJIGUAN1 not between", value1, value2, "fafangjiguan1");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan2IsNull() {
            addCriterion("FAFANGJIGUAN2 is null");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan2IsNotNull() {
            addCriterion("FAFANGJIGUAN2 is not null");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan2EqualTo(String value) {
            addCriterion("FAFANGJIGUAN2 =", value, "fafangjiguan2");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan2NotEqualTo(String value) {
            addCriterion("FAFANGJIGUAN2 <>", value, "fafangjiguan2");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan2GreaterThan(String value) {
            addCriterion("FAFANGJIGUAN2 >", value, "fafangjiguan2");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan2GreaterThanOrEqualTo(String value) {
            addCriterion("FAFANGJIGUAN2 >=", value, "fafangjiguan2");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan2LessThan(String value) {
            addCriterion("FAFANGJIGUAN2 <", value, "fafangjiguan2");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan2LessThanOrEqualTo(String value) {
            addCriterion("FAFANGJIGUAN2 <=", value, "fafangjiguan2");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan2Like(String value) {
            addCriterion("FAFANGJIGUAN2 like", value, "fafangjiguan2");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan2NotLike(String value) {
            addCriterion("FAFANGJIGUAN2 not like", value, "fafangjiguan2");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan2In(List<String> values) {
            addCriterion("FAFANGJIGUAN2 in", values, "fafangjiguan2");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan2NotIn(List<String> values) {
            addCriterion("FAFANGJIGUAN2 not in", values, "fafangjiguan2");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan2Between(String value1, String value2) {
            addCriterion("FAFANGJIGUAN2 between", value1, value2, "fafangjiguan2");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan2NotBetween(String value1, String value2) {
            addCriterion("FAFANGJIGUAN2 not between", value1, value2, "fafangjiguan2");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan3IsNull() {
            addCriterion("FAFANGJIGUAN3 is null");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan3IsNotNull() {
            addCriterion("FAFANGJIGUAN3 is not null");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan3EqualTo(String value) {
            addCriterion("FAFANGJIGUAN3 =", value, "fafangjiguan3");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan3NotEqualTo(String value) {
            addCriterion("FAFANGJIGUAN3 <>", value, "fafangjiguan3");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan3GreaterThan(String value) {
            addCriterion("FAFANGJIGUAN3 >", value, "fafangjiguan3");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan3GreaterThanOrEqualTo(String value) {
            addCriterion("FAFANGJIGUAN3 >=", value, "fafangjiguan3");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan3LessThan(String value) {
            addCriterion("FAFANGJIGUAN3 <", value, "fafangjiguan3");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan3LessThanOrEqualTo(String value) {
            addCriterion("FAFANGJIGUAN3 <=", value, "fafangjiguan3");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan3Like(String value) {
            addCriterion("FAFANGJIGUAN3 like", value, "fafangjiguan3");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan3NotLike(String value) {
            addCriterion("FAFANGJIGUAN3 not like", value, "fafangjiguan3");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan3In(List<String> values) {
            addCriterion("FAFANGJIGUAN3 in", values, "fafangjiguan3");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan3NotIn(List<String> values) {
            addCriterion("FAFANGJIGUAN3 not in", values, "fafangjiguan3");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan3Between(String value1, String value2) {
            addCriterion("FAFANGJIGUAN3 between", value1, value2, "fafangjiguan3");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan3NotBetween(String value1, String value2) {
            addCriterion("FAFANGJIGUAN3 not between", value1, value2, "fafangjiguan3");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan4IsNull() {
            addCriterion("FAFANGJIGUAN4 is null");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan4IsNotNull() {
            addCriterion("FAFANGJIGUAN4 is not null");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan4EqualTo(String value) {
            addCriterion("FAFANGJIGUAN4 =", value, "fafangjiguan4");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan4NotEqualTo(String value) {
            addCriterion("FAFANGJIGUAN4 <>", value, "fafangjiguan4");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan4GreaterThan(String value) {
            addCriterion("FAFANGJIGUAN4 >", value, "fafangjiguan4");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan4GreaterThanOrEqualTo(String value) {
            addCriterion("FAFANGJIGUAN4 >=", value, "fafangjiguan4");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan4LessThan(String value) {
            addCriterion("FAFANGJIGUAN4 <", value, "fafangjiguan4");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan4LessThanOrEqualTo(String value) {
            addCriterion("FAFANGJIGUAN4 <=", value, "fafangjiguan4");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan4Like(String value) {
            addCriterion("FAFANGJIGUAN4 like", value, "fafangjiguan4");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan4NotLike(String value) {
            addCriterion("FAFANGJIGUAN4 not like", value, "fafangjiguan4");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan4In(List<String> values) {
            addCriterion("FAFANGJIGUAN4 in", values, "fafangjiguan4");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan4NotIn(List<String> values) {
            addCriterion("FAFANGJIGUAN4 not in", values, "fafangjiguan4");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan4Between(String value1, String value2) {
            addCriterion("FAFANGJIGUAN4 between", value1, value2, "fafangjiguan4");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan4NotBetween(String value1, String value2) {
            addCriterion("FAFANGJIGUAN4 not between", value1, value2, "fafangjiguan4");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan5IsNull() {
            addCriterion("FAFANGJIGUAN5 is null");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan5IsNotNull() {
            addCriterion("FAFANGJIGUAN5 is not null");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan5EqualTo(String value) {
            addCriterion("FAFANGJIGUAN5 =", value, "fafangjiguan5");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan5NotEqualTo(String value) {
            addCriterion("FAFANGJIGUAN5 <>", value, "fafangjiguan5");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan5GreaterThan(String value) {
            addCriterion("FAFANGJIGUAN5 >", value, "fafangjiguan5");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan5GreaterThanOrEqualTo(String value) {
            addCriterion("FAFANGJIGUAN5 >=", value, "fafangjiguan5");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan5LessThan(String value) {
            addCriterion("FAFANGJIGUAN5 <", value, "fafangjiguan5");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan5LessThanOrEqualTo(String value) {
            addCriterion("FAFANGJIGUAN5 <=", value, "fafangjiguan5");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan5Like(String value) {
            addCriterion("FAFANGJIGUAN5 like", value, "fafangjiguan5");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan5NotLike(String value) {
            addCriterion("FAFANGJIGUAN5 not like", value, "fafangjiguan5");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan5In(List<String> values) {
            addCriterion("FAFANGJIGUAN5 in", values, "fafangjiguan5");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan5NotIn(List<String> values) {
            addCriterion("FAFANGJIGUAN5 not in", values, "fafangjiguan5");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan5Between(String value1, String value2) {
            addCriterion("FAFANGJIGUAN5 between", value1, value2, "fafangjiguan5");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan5NotBetween(String value1, String value2) {
            addCriterion("FAFANGJIGUAN5 not between", value1, value2, "fafangjiguan5");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan6IsNull() {
            addCriterion("FAFANGJIGUAN6 is null");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan6IsNotNull() {
            addCriterion("FAFANGJIGUAN6 is not null");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan6EqualTo(String value) {
            addCriterion("FAFANGJIGUAN6 =", value, "fafangjiguan6");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan6NotEqualTo(String value) {
            addCriterion("FAFANGJIGUAN6 <>", value, "fafangjiguan6");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan6GreaterThan(String value) {
            addCriterion("FAFANGJIGUAN6 >", value, "fafangjiguan6");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan6GreaterThanOrEqualTo(String value) {
            addCriterion("FAFANGJIGUAN6 >=", value, "fafangjiguan6");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan6LessThan(String value) {
            addCriterion("FAFANGJIGUAN6 <", value, "fafangjiguan6");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan6LessThanOrEqualTo(String value) {
            addCriterion("FAFANGJIGUAN6 <=", value, "fafangjiguan6");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan6Like(String value) {
            addCriterion("FAFANGJIGUAN6 like", value, "fafangjiguan6");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan6NotLike(String value) {
            addCriterion("FAFANGJIGUAN6 not like", value, "fafangjiguan6");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan6In(List<String> values) {
            addCriterion("FAFANGJIGUAN6 in", values, "fafangjiguan6");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan6NotIn(List<String> values) {
            addCriterion("FAFANGJIGUAN6 not in", values, "fafangjiguan6");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan6Between(String value1, String value2) {
            addCriterion("FAFANGJIGUAN6 between", value1, value2, "fafangjiguan6");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan6NotBetween(String value1, String value2) {
            addCriterion("FAFANGJIGUAN6 not between", value1, value2, "fafangjiguan6");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan7IsNull() {
            addCriterion("FAFANGJIGUAN7 is null");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan7IsNotNull() {
            addCriterion("FAFANGJIGUAN7 is not null");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan7EqualTo(String value) {
            addCriterion("FAFANGJIGUAN7 =", value, "fafangjiguan7");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan7NotEqualTo(String value) {
            addCriterion("FAFANGJIGUAN7 <>", value, "fafangjiguan7");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan7GreaterThan(String value) {
            addCriterion("FAFANGJIGUAN7 >", value, "fafangjiguan7");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan7GreaterThanOrEqualTo(String value) {
            addCriterion("FAFANGJIGUAN7 >=", value, "fafangjiguan7");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan7LessThan(String value) {
            addCriterion("FAFANGJIGUAN7 <", value, "fafangjiguan7");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan7LessThanOrEqualTo(String value) {
            addCriterion("FAFANGJIGUAN7 <=", value, "fafangjiguan7");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan7Like(String value) {
            addCriterion("FAFANGJIGUAN7 like", value, "fafangjiguan7");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan7NotLike(String value) {
            addCriterion("FAFANGJIGUAN7 not like", value, "fafangjiguan7");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan7In(List<String> values) {
            addCriterion("FAFANGJIGUAN7 in", values, "fafangjiguan7");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan7NotIn(List<String> values) {
            addCriterion("FAFANGJIGUAN7 not in", values, "fafangjiguan7");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan7Between(String value1, String value2) {
            addCriterion("FAFANGJIGUAN7 between", value1, value2, "fafangjiguan7");
            return (Criteria) this;
        }

        public Criteria andFafangjiguan7NotBetween(String value1, String value2) {
            addCriterion("FAFANGJIGUAN7 not between", value1, value2, "fafangjiguan7");
            return (Criteria) this;
        }

        public Criteria andRenminbikaihumingchengIsNull() {
            addCriterion("RENMINBIKAIHUMINGCHENG is null");
            return (Criteria) this;
        }

        public Criteria andRenminbikaihumingchengIsNotNull() {
            addCriterion("RENMINBIKAIHUMINGCHENG is not null");
            return (Criteria) this;
        }

        public Criteria andRenminbikaihumingchengEqualTo(String value) {
            addCriterion("RENMINBIKAIHUMINGCHENG =", value, "renminbikaihumingcheng");
            return (Criteria) this;
        }

        public Criteria andRenminbikaihumingchengNotEqualTo(String value) {
            addCriterion("RENMINBIKAIHUMINGCHENG <>", value, "renminbikaihumingcheng");
            return (Criteria) this;
        }

        public Criteria andRenminbikaihumingchengGreaterThan(String value) {
            addCriterion("RENMINBIKAIHUMINGCHENG >", value, "renminbikaihumingcheng");
            return (Criteria) this;
        }

        public Criteria andRenminbikaihumingchengGreaterThanOrEqualTo(String value) {
            addCriterion("RENMINBIKAIHUMINGCHENG >=", value, "renminbikaihumingcheng");
            return (Criteria) this;
        }

        public Criteria andRenminbikaihumingchengLessThan(String value) {
            addCriterion("RENMINBIKAIHUMINGCHENG <", value, "renminbikaihumingcheng");
            return (Criteria) this;
        }

        public Criteria andRenminbikaihumingchengLessThanOrEqualTo(String value) {
            addCriterion("RENMINBIKAIHUMINGCHENG <=", value, "renminbikaihumingcheng");
            return (Criteria) this;
        }

        public Criteria andRenminbikaihumingchengLike(String value) {
            addCriterion("RENMINBIKAIHUMINGCHENG like", value, "renminbikaihumingcheng");
            return (Criteria) this;
        }

        public Criteria andRenminbikaihumingchengNotLike(String value) {
            addCriterion("RENMINBIKAIHUMINGCHENG not like", value, "renminbikaihumingcheng");
            return (Criteria) this;
        }

        public Criteria andRenminbikaihumingchengIn(List<String> values) {
            addCriterion("RENMINBIKAIHUMINGCHENG in", values, "renminbikaihumingcheng");
            return (Criteria) this;
        }

        public Criteria andRenminbikaihumingchengNotIn(List<String> values) {
            addCriterion("RENMINBIKAIHUMINGCHENG not in", values, "renminbikaihumingcheng");
            return (Criteria) this;
        }

        public Criteria andRenminbikaihumingchengBetween(String value1, String value2) {
            addCriterion("RENMINBIKAIHUMINGCHENG between", value1, value2, "renminbikaihumingcheng");
            return (Criteria) this;
        }

        public Criteria andRenminbikaihumingchengNotBetween(String value1, String value2) {
            addCriterion("RENMINBIKAIHUMINGCHENG not between", value1, value2, "renminbikaihumingcheng");
            return (Criteria) this;
        }

        public Criteria andWaibikaihumingchengIsNull() {
            addCriterion("WAIBIKAIHUMINGCHENG is null");
            return (Criteria) this;
        }

        public Criteria andWaibikaihumingchengIsNotNull() {
            addCriterion("WAIBIKAIHUMINGCHENG is not null");
            return (Criteria) this;
        }

        public Criteria andWaibikaihumingchengEqualTo(String value) {
            addCriterion("WAIBIKAIHUMINGCHENG =", value, "waibikaihumingcheng");
            return (Criteria) this;
        }

        public Criteria andWaibikaihumingchengNotEqualTo(String value) {
            addCriterion("WAIBIKAIHUMINGCHENG <>", value, "waibikaihumingcheng");
            return (Criteria) this;
        }

        public Criteria andWaibikaihumingchengGreaterThan(String value) {
            addCriterion("WAIBIKAIHUMINGCHENG >", value, "waibikaihumingcheng");
            return (Criteria) this;
        }

        public Criteria andWaibikaihumingchengGreaterThanOrEqualTo(String value) {
            addCriterion("WAIBIKAIHUMINGCHENG >=", value, "waibikaihumingcheng");
            return (Criteria) this;
        }

        public Criteria andWaibikaihumingchengLessThan(String value) {
            addCriterion("WAIBIKAIHUMINGCHENG <", value, "waibikaihumingcheng");
            return (Criteria) this;
        }

        public Criteria andWaibikaihumingchengLessThanOrEqualTo(String value) {
            addCriterion("WAIBIKAIHUMINGCHENG <=", value, "waibikaihumingcheng");
            return (Criteria) this;
        }

        public Criteria andWaibikaihumingchengLike(String value) {
            addCriterion("WAIBIKAIHUMINGCHENG like", value, "waibikaihumingcheng");
            return (Criteria) this;
        }

        public Criteria andWaibikaihumingchengNotLike(String value) {
            addCriterion("WAIBIKAIHUMINGCHENG not like", value, "waibikaihumingcheng");
            return (Criteria) this;
        }

        public Criteria andWaibikaihumingchengIn(List<String> values) {
            addCriterion("WAIBIKAIHUMINGCHENG in", values, "waibikaihumingcheng");
            return (Criteria) this;
        }

        public Criteria andWaibikaihumingchengNotIn(List<String> values) {
            addCriterion("WAIBIKAIHUMINGCHENG not in", values, "waibikaihumingcheng");
            return (Criteria) this;
        }

        public Criteria andWaibikaihumingchengBetween(String value1, String value2) {
            addCriterion("WAIBIKAIHUMINGCHENG between", value1, value2, "waibikaihumingcheng");
            return (Criteria) this;
        }

        public Criteria andWaibikaihumingchengNotBetween(String value1, String value2) {
            addCriterion("WAIBIKAIHUMINGCHENG not between", value1, value2, "waibikaihumingcheng");
            return (Criteria) this;
        }

        public Criteria andCaiwuhesuanshifouduliIsNull() {
            addCriterion("CAIWUHESUANSHIFOUDULI is null");
            return (Criteria) this;
        }

        public Criteria andCaiwuhesuanshifouduliIsNotNull() {
            addCriterion("CAIWUHESUANSHIFOUDULI is not null");
            return (Criteria) this;
        }

        public Criteria andCaiwuhesuanshifouduliEqualTo(String value) {
            addCriterion("CAIWUHESUANSHIFOUDULI =", value, "caiwuhesuanshifouduli");
            return (Criteria) this;
        }

        public Criteria andCaiwuhesuanshifouduliNotEqualTo(String value) {
            addCriterion("CAIWUHESUANSHIFOUDULI <>", value, "caiwuhesuanshifouduli");
            return (Criteria) this;
        }

        public Criteria andCaiwuhesuanshifouduliGreaterThan(String value) {
            addCriterion("CAIWUHESUANSHIFOUDULI >", value, "caiwuhesuanshifouduli");
            return (Criteria) this;
        }

        public Criteria andCaiwuhesuanshifouduliGreaterThanOrEqualTo(String value) {
            addCriterion("CAIWUHESUANSHIFOUDULI >=", value, "caiwuhesuanshifouduli");
            return (Criteria) this;
        }

        public Criteria andCaiwuhesuanshifouduliLessThan(String value) {
            addCriterion("CAIWUHESUANSHIFOUDULI <", value, "caiwuhesuanshifouduli");
            return (Criteria) this;
        }

        public Criteria andCaiwuhesuanshifouduliLessThanOrEqualTo(String value) {
            addCriterion("CAIWUHESUANSHIFOUDULI <=", value, "caiwuhesuanshifouduli");
            return (Criteria) this;
        }

        public Criteria andCaiwuhesuanshifouduliLike(String value) {
            addCriterion("CAIWUHESUANSHIFOUDULI like", value, "caiwuhesuanshifouduli");
            return (Criteria) this;
        }

        public Criteria andCaiwuhesuanshifouduliNotLike(String value) {
            addCriterion("CAIWUHESUANSHIFOUDULI not like", value, "caiwuhesuanshifouduli");
            return (Criteria) this;
        }

        public Criteria andCaiwuhesuanshifouduliIn(List<String> values) {
            addCriterion("CAIWUHESUANSHIFOUDULI in", values, "caiwuhesuanshifouduli");
            return (Criteria) this;
        }

        public Criteria andCaiwuhesuanshifouduliNotIn(List<String> values) {
            addCriterion("CAIWUHESUANSHIFOUDULI not in", values, "caiwuhesuanshifouduli");
            return (Criteria) this;
        }

        public Criteria andCaiwuhesuanshifouduliBetween(String value1, String value2) {
            addCriterion("CAIWUHESUANSHIFOUDULI between", value1, value2, "caiwuhesuanshifouduli");
            return (Criteria) this;
        }

        public Criteria andCaiwuhesuanshifouduliNotBetween(String value1, String value2) {
            addCriterion("CAIWUHESUANSHIFOUDULI not between", value1, value2, "caiwuhesuanshifouduli");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1IsNull() {
            addCriterion("TJNJJIEGUO1 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1IsNotNull() {
            addCriterion("TJNJJIEGUO1 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1EqualTo(String value) {
            addCriterion("TJNJJIEGUO1 =", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1NotEqualTo(String value) {
            addCriterion("TJNJJIEGUO1 <>", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1GreaterThan(String value) {
            addCriterion("TJNJJIEGUO1 >", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1GreaterThanOrEqualTo(String value) {
            addCriterion("TJNJJIEGUO1 >=", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1LessThan(String value) {
            addCriterion("TJNJJIEGUO1 <", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1LessThanOrEqualTo(String value) {
            addCriterion("TJNJJIEGUO1 <=", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1Like(String value) {
            addCriterion("TJNJJIEGUO1 like", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1NotLike(String value) {
            addCriterion("TJNJJIEGUO1 not like", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1In(List<String> values) {
            addCriterion("TJNJJIEGUO1 in", values, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1NotIn(List<String> values) {
            addCriterion("TJNJJIEGUO1 not in", values, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1Between(String value1, String value2) {
            addCriterion("TJNJJIEGUO1 between", value1, value2, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1NotBetween(String value1, String value2) {
            addCriterion("TJNJJIEGUO1 not between", value1, value2, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2IsNull() {
            addCriterion("TJNJJIEGUO2 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2IsNotNull() {
            addCriterion("TJNJJIEGUO2 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2EqualTo(String value) {
            addCriterion("TJNJJIEGUO2 =", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2NotEqualTo(String value) {
            addCriterion("TJNJJIEGUO2 <>", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2GreaterThan(String value) {
            addCriterion("TJNJJIEGUO2 >", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2GreaterThanOrEqualTo(String value) {
            addCriterion("TJNJJIEGUO2 >=", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2LessThan(String value) {
            addCriterion("TJNJJIEGUO2 <", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2LessThanOrEqualTo(String value) {
            addCriterion("TJNJJIEGUO2 <=", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2Like(String value) {
            addCriterion("TJNJJIEGUO2 like", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2NotLike(String value) {
            addCriterion("TJNJJIEGUO2 not like", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2In(List<String> values) {
            addCriterion("TJNJJIEGUO2 in", values, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2NotIn(List<String> values) {
            addCriterion("TJNJJIEGUO2 not in", values, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2Between(String value1, String value2) {
            addCriterion("TJNJJIEGUO2 between", value1, value2, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2NotBetween(String value1, String value2) {
            addCriterion("TJNJJIEGUO2 not between", value1, value2, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1IsNull() {
            addCriterion("TJNJYIJIAN1 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1IsNotNull() {
            addCriterion("TJNJYIJIAN1 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1EqualTo(String value) {
            addCriterion("TJNJYIJIAN1 =", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1NotEqualTo(String value) {
            addCriterion("TJNJYIJIAN1 <>", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1GreaterThan(String value) {
            addCriterion("TJNJYIJIAN1 >", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1GreaterThanOrEqualTo(String value) {
            addCriterion("TJNJYIJIAN1 >=", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1LessThan(String value) {
            addCriterion("TJNJYIJIAN1 <", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1LessThanOrEqualTo(String value) {
            addCriterion("TJNJYIJIAN1 <=", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1Like(String value) {
            addCriterion("TJNJYIJIAN1 like", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1NotLike(String value) {
            addCriterion("TJNJYIJIAN1 not like", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1In(List<String> values) {
            addCriterion("TJNJYIJIAN1 in", values, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1NotIn(List<String> values) {
            addCriterion("TJNJYIJIAN1 not in", values, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1Between(String value1, String value2) {
            addCriterion("TJNJYIJIAN1 between", value1, value2, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1NotBetween(String value1, String value2) {
            addCriterion("TJNJYIJIAN1 not between", value1, value2, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2IsNull() {
            addCriterion("TJNJYIJIAN2 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2IsNotNull() {
            addCriterion("TJNJYIJIAN2 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2EqualTo(String value) {
            addCriterion("TJNJYIJIAN2 =", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2NotEqualTo(String value) {
            addCriterion("TJNJYIJIAN2 <>", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2GreaterThan(String value) {
            addCriterion("TJNJYIJIAN2 >", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2GreaterThanOrEqualTo(String value) {
            addCriterion("TJNJYIJIAN2 >=", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2LessThan(String value) {
            addCriterion("TJNJYIJIAN2 <", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2LessThanOrEqualTo(String value) {
            addCriterion("TJNJYIJIAN2 <=", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2Like(String value) {
            addCriterion("TJNJYIJIAN2 like", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2NotLike(String value) {
            addCriterion("TJNJYIJIAN2 not like", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2In(List<String> values) {
            addCriterion("TJNJYIJIAN2 in", values, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2NotIn(List<String> values) {
            addCriterion("TJNJYIJIAN2 not in", values, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2Between(String value1, String value2) {
            addCriterion("TJNJYIJIAN2 between", value1, value2, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2NotBetween(String value1, String value2) {
            addCriterion("TJNJYIJIAN2 not between", value1, value2, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1IsNull() {
            addCriterion("TJNJXINGMING1 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1IsNotNull() {
            addCriterion("TJNJXINGMING1 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1EqualTo(String value) {
            addCriterion("TJNJXINGMING1 =", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1NotEqualTo(String value) {
            addCriterion("TJNJXINGMING1 <>", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1GreaterThan(String value) {
            addCriterion("TJNJXINGMING1 >", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1GreaterThanOrEqualTo(String value) {
            addCriterion("TJNJXINGMING1 >=", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1LessThan(String value) {
            addCriterion("TJNJXINGMING1 <", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1LessThanOrEqualTo(String value) {
            addCriterion("TJNJXINGMING1 <=", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1Like(String value) {
            addCriterion("TJNJXINGMING1 like", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1NotLike(String value) {
            addCriterion("TJNJXINGMING1 not like", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1In(List<String> values) {
            addCriterion("TJNJXINGMING1 in", values, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1NotIn(List<String> values) {
            addCriterion("TJNJXINGMING1 not in", values, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1Between(String value1, String value2) {
            addCriterion("TJNJXINGMING1 between", value1, value2, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1NotBetween(String value1, String value2) {
            addCriterion("TJNJXINGMING1 not between", value1, value2, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2IsNull() {
            addCriterion("TJNJXINGMING2 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2IsNotNull() {
            addCriterion("TJNJXINGMING2 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2EqualTo(String value) {
            addCriterion("TJNJXINGMING2 =", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2NotEqualTo(String value) {
            addCriterion("TJNJXINGMING2 <>", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2GreaterThan(String value) {
            addCriterion("TJNJXINGMING2 >", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2GreaterThanOrEqualTo(String value) {
            addCriterion("TJNJXINGMING2 >=", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2LessThan(String value) {
            addCriterion("TJNJXINGMING2 <", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2LessThanOrEqualTo(String value) {
            addCriterion("TJNJXINGMING2 <=", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2Like(String value) {
            addCriterion("TJNJXINGMING2 like", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2NotLike(String value) {
            addCriterion("TJNJXINGMING2 not like", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2In(List<String> values) {
            addCriterion("TJNJXINGMING2 in", values, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2NotIn(List<String> values) {
            addCriterion("TJNJXINGMING2 not in", values, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2Between(String value1, String value2) {
            addCriterion("TJNJXINGMING2 between", value1, value2, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2NotBetween(String value1, String value2) {
            addCriterion("TJNJXINGMING2 not between", value1, value2, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1IsNull() {
            addCriterion("TJNJSHIJIAN1 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1IsNotNull() {
            addCriterion("TJNJSHIJIAN1 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1EqualTo(Date value) {
            addCriterion("TJNJSHIJIAN1 =", value, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1NotEqualTo(Date value) {
            addCriterion("TJNJSHIJIAN1 <>", value, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1GreaterThan(Date value) {
            addCriterion("TJNJSHIJIAN1 >", value, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1GreaterThanOrEqualTo(Date value) {
            addCriterion("TJNJSHIJIAN1 >=", value, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1LessThan(Date value) {
            addCriterion("TJNJSHIJIAN1 <", value, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1LessThanOrEqualTo(Date value) {
            addCriterion("TJNJSHIJIAN1 <=", value, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1In(List<Date> values) {
            addCriterion("TJNJSHIJIAN1 in", values, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1NotIn(List<Date> values) {
            addCriterion("TJNJSHIJIAN1 not in", values, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1Between(Date value1, Date value2) {
            addCriterion("TJNJSHIJIAN1 between", value1, value2, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1NotBetween(Date value1, Date value2) {
            addCriterion("TJNJSHIJIAN1 not between", value1, value2, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2IsNull() {
            addCriterion("TJNJSHIJIAN2 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2IsNotNull() {
            addCriterion("TJNJSHIJIAN2 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2EqualTo(Date value) {
            addCriterion("TJNJSHIJIAN2 =", value, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2NotEqualTo(Date value) {
            addCriterion("TJNJSHIJIAN2 <>", value, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2GreaterThan(Date value) {
            addCriterion("TJNJSHIJIAN2 >", value, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2GreaterThanOrEqualTo(Date value) {
            addCriterion("TJNJSHIJIAN2 >=", value, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2LessThan(Date value) {
            addCriterion("TJNJSHIJIAN2 <", value, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2LessThanOrEqualTo(Date value) {
            addCriterion("TJNJSHIJIAN2 <=", value, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2In(List<Date> values) {
            addCriterion("TJNJSHIJIAN2 in", values, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2NotIn(List<Date> values) {
            addCriterion("TJNJSHIJIAN2 not in", values, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2Between(Date value1, Date value2) {
            addCriterion("TJNJSHIJIAN2 between", value1, value2, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2NotBetween(Date value1, Date value2) {
            addCriterion("TJNJSHIJIAN2 not between", value1, value2, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andQitazhiduIsNull() {
            addCriterion("QITAZHIDU is null");
            return (Criteria) this;
        }

        public Criteria andQitazhiduIsNotNull() {
            addCriterion("QITAZHIDU is not null");
            return (Criteria) this;
        }

        public Criteria andQitazhiduEqualTo(String value) {
            addCriterion("QITAZHIDU =", value, "qitazhidu");
            return (Criteria) this;
        }

        public Criteria andQitazhiduNotEqualTo(String value) {
            addCriterion("QITAZHIDU <>", value, "qitazhidu");
            return (Criteria) this;
        }

        public Criteria andQitazhiduGreaterThan(String value) {
            addCriterion("QITAZHIDU >", value, "qitazhidu");
            return (Criteria) this;
        }

        public Criteria andQitazhiduGreaterThanOrEqualTo(String value) {
            addCriterion("QITAZHIDU >=", value, "qitazhidu");
            return (Criteria) this;
        }

        public Criteria andQitazhiduLessThan(String value) {
            addCriterion("QITAZHIDU <", value, "qitazhidu");
            return (Criteria) this;
        }

        public Criteria andQitazhiduLessThanOrEqualTo(String value) {
            addCriterion("QITAZHIDU <=", value, "qitazhidu");
            return (Criteria) this;
        }

        public Criteria andQitazhiduLike(String value) {
            addCriterion("QITAZHIDU like", value, "qitazhidu");
            return (Criteria) this;
        }

        public Criteria andQitazhiduNotLike(String value) {
            addCriterion("QITAZHIDU not like", value, "qitazhidu");
            return (Criteria) this;
        }

        public Criteria andQitazhiduIn(List<String> values) {
            addCriterion("QITAZHIDU in", values, "qitazhidu");
            return (Criteria) this;
        }

        public Criteria andQitazhiduNotIn(List<String> values) {
            addCriterion("QITAZHIDU not in", values, "qitazhidu");
            return (Criteria) this;
        }

        public Criteria andQitazhiduBetween(String value1, String value2) {
            addCriterion("QITAZHIDU between", value1, value2, "qitazhidu");
            return (Criteria) this;
        }

        public Criteria andQitazhiduNotBetween(String value1, String value2) {
            addCriterion("QITAZHIDU not between", value1, value2, "qitazhidu");
            return (Criteria) this;
        }

        public Criteria andBiangenglishijianshiIsNull() {
            addCriterion("BIANGENGLISHIJIANSHI is null");
            return (Criteria) this;
        }

        public Criteria andBiangenglishijianshiIsNotNull() {
            addCriterion("BIANGENGLISHIJIANSHI is not null");
            return (Criteria) this;
        }

        public Criteria andBiangenglishijianshiEqualTo(String value) {
            addCriterion("BIANGENGLISHIJIANSHI =", value, "biangenglishijianshi");
            return (Criteria) this;
        }

        public Criteria andBiangenglishijianshiNotEqualTo(String value) {
            addCriterion("BIANGENGLISHIJIANSHI <>", value, "biangenglishijianshi");
            return (Criteria) this;
        }

        public Criteria andBiangenglishijianshiGreaterThan(String value) {
            addCriterion("BIANGENGLISHIJIANSHI >", value, "biangenglishijianshi");
            return (Criteria) this;
        }

        public Criteria andBiangenglishijianshiGreaterThanOrEqualTo(String value) {
            addCriterion("BIANGENGLISHIJIANSHI >=", value, "biangenglishijianshi");
            return (Criteria) this;
        }

        public Criteria andBiangenglishijianshiLessThan(String value) {
            addCriterion("BIANGENGLISHIJIANSHI <", value, "biangenglishijianshi");
            return (Criteria) this;
        }

        public Criteria andBiangenglishijianshiLessThanOrEqualTo(String value) {
            addCriterion("BIANGENGLISHIJIANSHI <=", value, "biangenglishijianshi");
            return (Criteria) this;
        }

        public Criteria andBiangenglishijianshiLike(String value) {
            addCriterion("BIANGENGLISHIJIANSHI like", value, "biangenglishijianshi");
            return (Criteria) this;
        }

        public Criteria andBiangenglishijianshiNotLike(String value) {
            addCriterion("BIANGENGLISHIJIANSHI not like", value, "biangenglishijianshi");
            return (Criteria) this;
        }

        public Criteria andBiangenglishijianshiIn(List<String> values) {
            addCriterion("BIANGENGLISHIJIANSHI in", values, "biangenglishijianshi");
            return (Criteria) this;
        }

        public Criteria andBiangenglishijianshiNotIn(List<String> values) {
            addCriterion("BIANGENGLISHIJIANSHI not in", values, "biangenglishijianshi");
            return (Criteria) this;
        }

        public Criteria andBiangenglishijianshiBetween(String value1, String value2) {
            addCriterion("BIANGENGLISHIJIANSHI between", value1, value2, "biangenglishijianshi");
            return (Criteria) this;
        }

        public Criteria andBiangenglishijianshiNotBetween(String value1, String value2) {
            addCriterion("BIANGENGLISHIJIANSHI not between", value1, value2, "biangenglishijianshi");
            return (Criteria) this;
        }

        public Criteria andBiangenglishibanliIsNull() {
            addCriterion("BIANGENGLISHIBANLI is null");
            return (Criteria) this;
        }

        public Criteria andBiangenglishibanliIsNotNull() {
            addCriterion("BIANGENGLISHIBANLI is not null");
            return (Criteria) this;
        }

        public Criteria andBiangenglishibanliEqualTo(String value) {
            addCriterion("BIANGENGLISHIBANLI =", value, "biangenglishibanli");
            return (Criteria) this;
        }

        public Criteria andBiangenglishibanliNotEqualTo(String value) {
            addCriterion("BIANGENGLISHIBANLI <>", value, "biangenglishibanli");
            return (Criteria) this;
        }

        public Criteria andBiangenglishibanliGreaterThan(String value) {
            addCriterion("BIANGENGLISHIBANLI >", value, "biangenglishibanli");
            return (Criteria) this;
        }

        public Criteria andBiangenglishibanliGreaterThanOrEqualTo(String value) {
            addCriterion("BIANGENGLISHIBANLI >=", value, "biangenglishibanli");
            return (Criteria) this;
        }

        public Criteria andBiangenglishibanliLessThan(String value) {
            addCriterion("BIANGENGLISHIBANLI <", value, "biangenglishibanli");
            return (Criteria) this;
        }

        public Criteria andBiangenglishibanliLessThanOrEqualTo(String value) {
            addCriterion("BIANGENGLISHIBANLI <=", value, "biangenglishibanli");
            return (Criteria) this;
        }

        public Criteria andBiangenglishibanliLike(String value) {
            addCriterion("BIANGENGLISHIBANLI like", value, "biangenglishibanli");
            return (Criteria) this;
        }

        public Criteria andBiangenglishibanliNotLike(String value) {
            addCriterion("BIANGENGLISHIBANLI not like", value, "biangenglishibanli");
            return (Criteria) this;
        }

        public Criteria andBiangenglishibanliIn(List<String> values) {
            addCriterion("BIANGENGLISHIBANLI in", values, "biangenglishibanli");
            return (Criteria) this;
        }

        public Criteria andBiangenglishibanliNotIn(List<String> values) {
            addCriterion("BIANGENGLISHIBANLI not in", values, "biangenglishibanli");
            return (Criteria) this;
        }

        public Criteria andBiangenglishibanliBetween(String value1, String value2) {
            addCriterion("BIANGENGLISHIBANLI between", value1, value2, "biangenglishibanli");
            return (Criteria) this;
        }

        public Criteria andBiangenglishibanliNotBetween(String value1, String value2) {
            addCriterion("BIANGENGLISHIBANLI not between", value1, value2, "biangenglishibanli");
            return (Criteria) this;
        }

        public Criteria andBiangenglishishijianIsNull() {
            addCriterion("BIANGENGLISHISHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andBiangenglishishijianIsNotNull() {
            addCriterion("BIANGENGLISHISHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andBiangenglishishijianEqualTo(Date value) {
            addCriterion("BIANGENGLISHISHIJIAN =", value, "biangenglishishijian");
            return (Criteria) this;
        }

        public Criteria andBiangenglishishijianNotEqualTo(Date value) {
            addCriterion("BIANGENGLISHISHIJIAN <>", value, "biangenglishishijian");
            return (Criteria) this;
        }

        public Criteria andBiangenglishishijianGreaterThan(Date value) {
            addCriterion("BIANGENGLISHISHIJIAN >", value, "biangenglishishijian");
            return (Criteria) this;
        }

        public Criteria andBiangenglishishijianGreaterThanOrEqualTo(Date value) {
            addCriterion("BIANGENGLISHISHIJIAN >=", value, "biangenglishishijian");
            return (Criteria) this;
        }

        public Criteria andBiangenglishishijianLessThan(Date value) {
            addCriterion("BIANGENGLISHISHIJIAN <", value, "biangenglishishijian");
            return (Criteria) this;
        }

        public Criteria andBiangenglishishijianLessThanOrEqualTo(Date value) {
            addCriterion("BIANGENGLISHISHIJIAN <=", value, "biangenglishishijian");
            return (Criteria) this;
        }

        public Criteria andBiangenglishishijianIn(List<Date> values) {
            addCriterion("BIANGENGLISHISHIJIAN in", values, "biangenglishishijian");
            return (Criteria) this;
        }

        public Criteria andBiangenglishishijianNotIn(List<Date> values) {
            addCriterion("BIANGENGLISHISHIJIAN not in", values, "biangenglishishijian");
            return (Criteria) this;
        }

        public Criteria andBiangenglishishijianBetween(Date value1, Date value2) {
            addCriterion("BIANGENGLISHISHIJIAN between", value1, value2, "biangenglishishijian");
            return (Criteria) this;
        }

        public Criteria andBiangenglishishijianNotBetween(Date value1, Date value2) {
            addCriterion("BIANGENGLISHISHIJIAN not between", value1, value2, "biangenglishishijian");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongzuorenshuIsNull() {
            addCriterion("ZHUANZHIGONGZUORENSHU is null");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongzuorenshuIsNotNull() {
            addCriterion("ZHUANZHIGONGZUORENSHU is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongzuorenshuEqualTo(Integer value) {
            addCriterion("ZHUANZHIGONGZUORENSHU =", value, "zhuanzhigongzuorenshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongzuorenshuNotEqualTo(Integer value) {
            addCriterion("ZHUANZHIGONGZUORENSHU <>", value, "zhuanzhigongzuorenshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongzuorenshuGreaterThan(Integer value) {
            addCriterion("ZHUANZHIGONGZUORENSHU >", value, "zhuanzhigongzuorenshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongzuorenshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZHUANZHIGONGZUORENSHU >=", value, "zhuanzhigongzuorenshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongzuorenshuLessThan(Integer value) {
            addCriterion("ZHUANZHIGONGZUORENSHU <", value, "zhuanzhigongzuorenshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongzuorenshuLessThanOrEqualTo(Integer value) {
            addCriterion("ZHUANZHIGONGZUORENSHU <=", value, "zhuanzhigongzuorenshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongzuorenshuIn(List<Integer> values) {
            addCriterion("ZHUANZHIGONGZUORENSHU in", values, "zhuanzhigongzuorenshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongzuorenshuNotIn(List<Integer> values) {
            addCriterion("ZHUANZHIGONGZUORENSHU not in", values, "zhuanzhigongzuorenshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongzuorenshuBetween(Integer value1, Integer value2) {
            addCriterion("ZHUANZHIGONGZUORENSHU between", value1, value2, "zhuanzhigongzuorenshu");
            return (Criteria) this;
        }

        public Criteria andZhuanzhigongzuorenshuNotBetween(Integer value1, Integer value2) {
            addCriterion("ZHUANZHIGONGZUORENSHU not between", value1, value2, "zhuanzhigongzuorenshu");
            return (Criteria) this;
        }

        public Criteria andShifougongkaiIsNull() {
            addCriterion("SHIFOUGONGKAI is null");
            return (Criteria) this;
        }

        public Criteria andShifougongkaiIsNotNull() {
            addCriterion("SHIFOUGONGKAI is not null");
            return (Criteria) this;
        }

        public Criteria andShifougongkaiEqualTo(String value) {
            addCriterion("SHIFOUGONGKAI =", value, "shifougongkai");
            return (Criteria) this;
        }

        public Criteria andShifougongkaiNotEqualTo(String value) {
            addCriterion("SHIFOUGONGKAI <>", value, "shifougongkai");
            return (Criteria) this;
        }

        public Criteria andShifougongkaiGreaterThan(String value) {
            addCriterion("SHIFOUGONGKAI >", value, "shifougongkai");
            return (Criteria) this;
        }

        public Criteria andShifougongkaiGreaterThanOrEqualTo(String value) {
            addCriterion("SHIFOUGONGKAI >=", value, "shifougongkai");
            return (Criteria) this;
        }

        public Criteria andShifougongkaiLessThan(String value) {
            addCriterion("SHIFOUGONGKAI <", value, "shifougongkai");
            return (Criteria) this;
        }

        public Criteria andShifougongkaiLessThanOrEqualTo(String value) {
            addCriterion("SHIFOUGONGKAI <=", value, "shifougongkai");
            return (Criteria) this;
        }

        public Criteria andShifougongkaiLike(String value) {
            addCriterion("SHIFOUGONGKAI like", value, "shifougongkai");
            return (Criteria) this;
        }

        public Criteria andShifougongkaiNotLike(String value) {
            addCriterion("SHIFOUGONGKAI not like", value, "shifougongkai");
            return (Criteria) this;
        }

        public Criteria andShifougongkaiIn(List<String> values) {
            addCriterion("SHIFOUGONGKAI in", values, "shifougongkai");
            return (Criteria) this;
        }

        public Criteria andShifougongkaiNotIn(List<String> values) {
            addCriterion("SHIFOUGONGKAI not in", values, "shifougongkai");
            return (Criteria) this;
        }

        public Criteria andShifougongkaiBetween(String value1, String value2) {
            addCriterion("SHIFOUGONGKAI between", value1, value2, "shifougongkai");
            return (Criteria) this;
        }

        public Criteria andShifougongkaiNotBetween(String value1, String value2) {
            addCriterion("SHIFOUGONGKAI not between", value1, value2, "shifougongkai");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan1IsNull() {
            addCriterion("GUANFANGWANGZHAN1 is null");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan1IsNotNull() {
            addCriterion("GUANFANGWANGZHAN1 is not null");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan1EqualTo(Object value) {
            addCriterion("GUANFANGWANGZHAN1 =", value, "guanfangwangzhan1");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan1NotEqualTo(Object value) {
            addCriterion("GUANFANGWANGZHAN1 <>", value, "guanfangwangzhan1");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan1GreaterThan(Object value) {
            addCriterion("GUANFANGWANGZHAN1 >", value, "guanfangwangzhan1");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan1GreaterThanOrEqualTo(Object value) {
            addCriterion("GUANFANGWANGZHAN1 >=", value, "guanfangwangzhan1");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan1LessThan(Object value) {
            addCriterion("GUANFANGWANGZHAN1 <", value, "guanfangwangzhan1");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan1LessThanOrEqualTo(Object value) {
            addCriterion("GUANFANGWANGZHAN1 <=", value, "guanfangwangzhan1");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan1In(List<Object> values) {
            addCriterion("GUANFANGWANGZHAN1 in", values, "guanfangwangzhan1");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan1NotIn(List<Object> values) {
            addCriterion("GUANFANGWANGZHAN1 not in", values, "guanfangwangzhan1");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan1Between(Object value1, Object value2) {
            addCriterion("GUANFANGWANGZHAN1 between", value1, value2, "guanfangwangzhan1");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan1NotBetween(Object value1, Object value2) {
            addCriterion("GUANFANGWANGZHAN1 not between", value1, value2, "guanfangwangzhan1");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai1IsNull() {
            addCriterion("WEIXINPINGTAI1 is null");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai1IsNotNull() {
            addCriterion("WEIXINPINGTAI1 is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai1EqualTo(Object value) {
            addCriterion("WEIXINPINGTAI1 =", value, "weixinpingtai1");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai1NotEqualTo(Object value) {
            addCriterion("WEIXINPINGTAI1 <>", value, "weixinpingtai1");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai1GreaterThan(Object value) {
            addCriterion("WEIXINPINGTAI1 >", value, "weixinpingtai1");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai1GreaterThanOrEqualTo(Object value) {
            addCriterion("WEIXINPINGTAI1 >=", value, "weixinpingtai1");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai1LessThan(Object value) {
            addCriterion("WEIXINPINGTAI1 <", value, "weixinpingtai1");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai1LessThanOrEqualTo(Object value) {
            addCriterion("WEIXINPINGTAI1 <=", value, "weixinpingtai1");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai1In(List<Object> values) {
            addCriterion("WEIXINPINGTAI1 in", values, "weixinpingtai1");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai1NotIn(List<Object> values) {
            addCriterion("WEIXINPINGTAI1 not in", values, "weixinpingtai1");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai1Between(Object value1, Object value2) {
            addCriterion("WEIXINPINGTAI1 between", value1, value2, "weixinpingtai1");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai1NotBetween(Object value1, Object value2) {
            addCriterion("WEIXINPINGTAI1 not between", value1, value2, "weixinpingtai1");
            return (Criteria) this;
        }

        public Criteria andWeibo1IsNull() {
            addCriterion("WEIBO1 is null");
            return (Criteria) this;
        }

        public Criteria andWeibo1IsNotNull() {
            addCriterion("WEIBO1 is not null");
            return (Criteria) this;
        }

        public Criteria andWeibo1EqualTo(Object value) {
            addCriterion("WEIBO1 =", value, "weibo1");
            return (Criteria) this;
        }

        public Criteria andWeibo1NotEqualTo(Object value) {
            addCriterion("WEIBO1 <>", value, "weibo1");
            return (Criteria) this;
        }

        public Criteria andWeibo1GreaterThan(Object value) {
            addCriterion("WEIBO1 >", value, "weibo1");
            return (Criteria) this;
        }

        public Criteria andWeibo1GreaterThanOrEqualTo(Object value) {
            addCriterion("WEIBO1 >=", value, "weibo1");
            return (Criteria) this;
        }

        public Criteria andWeibo1LessThan(Object value) {
            addCriterion("WEIBO1 <", value, "weibo1");
            return (Criteria) this;
        }

        public Criteria andWeibo1LessThanOrEqualTo(Object value) {
            addCriterion("WEIBO1 <=", value, "weibo1");
            return (Criteria) this;
        }

        public Criteria andWeibo1In(List<Object> values) {
            addCriterion("WEIBO1 in", values, "weibo1");
            return (Criteria) this;
        }

        public Criteria andWeibo1NotIn(List<Object> values) {
            addCriterion("WEIBO1 not in", values, "weibo1");
            return (Criteria) this;
        }

        public Criteria andWeibo1Between(Object value1, Object value2) {
            addCriterion("WEIBO1 between", value1, value2, "weibo1");
            return (Criteria) this;
        }

        public Criteria andWeibo1NotBetween(Object value1, Object value2) {
            addCriterion("WEIBO1 not between", value1, value2, "weibo1");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan1IsNull() {
            addCriterion("ZAZHIQIKAN1 is null");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan1IsNotNull() {
            addCriterion("ZAZHIQIKAN1 is not null");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan1EqualTo(Object value) {
            addCriterion("ZAZHIQIKAN1 =", value, "zazhiqikan1");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan1NotEqualTo(Object value) {
            addCriterion("ZAZHIQIKAN1 <>", value, "zazhiqikan1");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan1GreaterThan(Object value) {
            addCriterion("ZAZHIQIKAN1 >", value, "zazhiqikan1");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan1GreaterThanOrEqualTo(Object value) {
            addCriterion("ZAZHIQIKAN1 >=", value, "zazhiqikan1");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan1LessThan(Object value) {
            addCriterion("ZAZHIQIKAN1 <", value, "zazhiqikan1");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan1LessThanOrEqualTo(Object value) {
            addCriterion("ZAZHIQIKAN1 <=", value, "zazhiqikan1");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan1In(List<Object> values) {
            addCriterion("ZAZHIQIKAN1 in", values, "zazhiqikan1");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan1NotIn(List<Object> values) {
            addCriterion("ZAZHIQIKAN1 not in", values, "zazhiqikan1");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan1Between(Object value1, Object value2) {
            addCriterion("ZAZHIQIKAN1 between", value1, value2, "zazhiqikan1");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan1NotBetween(Object value1, Object value2) {
            addCriterion("ZAZHIQIKAN1 not between", value1, value2, "zazhiqikan1");
            return (Criteria) this;
        }

        public Criteria andQitafangshi1IsNull() {
            addCriterion("QITAFANGSHI1 is null");
            return (Criteria) this;
        }

        public Criteria andQitafangshi1IsNotNull() {
            addCriterion("QITAFANGSHI1 is not null");
            return (Criteria) this;
        }

        public Criteria andQitafangshi1EqualTo(Object value) {
            addCriterion("QITAFANGSHI1 =", value, "qitafangshi1");
            return (Criteria) this;
        }

        public Criteria andQitafangshi1NotEqualTo(Object value) {
            addCriterion("QITAFANGSHI1 <>", value, "qitafangshi1");
            return (Criteria) this;
        }

        public Criteria andQitafangshi1GreaterThan(Object value) {
            addCriterion("QITAFANGSHI1 >", value, "qitafangshi1");
            return (Criteria) this;
        }

        public Criteria andQitafangshi1GreaterThanOrEqualTo(Object value) {
            addCriterion("QITAFANGSHI1 >=", value, "qitafangshi1");
            return (Criteria) this;
        }

        public Criteria andQitafangshi1LessThan(Object value) {
            addCriterion("QITAFANGSHI1 <", value, "qitafangshi1");
            return (Criteria) this;
        }

        public Criteria andQitafangshi1LessThanOrEqualTo(Object value) {
            addCriterion("QITAFANGSHI1 <=", value, "qitafangshi1");
            return (Criteria) this;
        }

        public Criteria andQitafangshi1In(List<Object> values) {
            addCriterion("QITAFANGSHI1 in", values, "qitafangshi1");
            return (Criteria) this;
        }

        public Criteria andQitafangshi1NotIn(List<Object> values) {
            addCriterion("QITAFANGSHI1 not in", values, "qitafangshi1");
            return (Criteria) this;
        }

        public Criteria andQitafangshi1Between(Object value1, Object value2) {
            addCriterion("QITAFANGSHI1 between", value1, value2, "qitafangshi1");
            return (Criteria) this;
        }

        public Criteria andQitafangshi1NotBetween(Object value1, Object value2) {
            addCriterion("QITAFANGSHI1 not between", value1, value2, "qitafangshi1");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan2IsNull() {
            addCriterion("GUANFANGWANGZHAN2 is null");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan2IsNotNull() {
            addCriterion("GUANFANGWANGZHAN2 is not null");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan2EqualTo(Object value) {
            addCriterion("GUANFANGWANGZHAN2 =", value, "guanfangwangzhan2");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan2NotEqualTo(Object value) {
            addCriterion("GUANFANGWANGZHAN2 <>", value, "guanfangwangzhan2");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan2GreaterThan(Object value) {
            addCriterion("GUANFANGWANGZHAN2 >", value, "guanfangwangzhan2");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan2GreaterThanOrEqualTo(Object value) {
            addCriterion("GUANFANGWANGZHAN2 >=", value, "guanfangwangzhan2");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan2LessThan(Object value) {
            addCriterion("GUANFANGWANGZHAN2 <", value, "guanfangwangzhan2");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan2LessThanOrEqualTo(Object value) {
            addCriterion("GUANFANGWANGZHAN2 <=", value, "guanfangwangzhan2");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan2In(List<Object> values) {
            addCriterion("GUANFANGWANGZHAN2 in", values, "guanfangwangzhan2");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan2NotIn(List<Object> values) {
            addCriterion("GUANFANGWANGZHAN2 not in", values, "guanfangwangzhan2");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan2Between(Object value1, Object value2) {
            addCriterion("GUANFANGWANGZHAN2 between", value1, value2, "guanfangwangzhan2");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan2NotBetween(Object value1, Object value2) {
            addCriterion("GUANFANGWANGZHAN2 not between", value1, value2, "guanfangwangzhan2");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai2IsNull() {
            addCriterion("WEIXINPINGTAI2 is null");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai2IsNotNull() {
            addCriterion("WEIXINPINGTAI2 is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai2EqualTo(Object value) {
            addCriterion("WEIXINPINGTAI2 =", value, "weixinpingtai2");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai2NotEqualTo(Object value) {
            addCriterion("WEIXINPINGTAI2 <>", value, "weixinpingtai2");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai2GreaterThan(Object value) {
            addCriterion("WEIXINPINGTAI2 >", value, "weixinpingtai2");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai2GreaterThanOrEqualTo(Object value) {
            addCriterion("WEIXINPINGTAI2 >=", value, "weixinpingtai2");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai2LessThan(Object value) {
            addCriterion("WEIXINPINGTAI2 <", value, "weixinpingtai2");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai2LessThanOrEqualTo(Object value) {
            addCriterion("WEIXINPINGTAI2 <=", value, "weixinpingtai2");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai2In(List<Object> values) {
            addCriterion("WEIXINPINGTAI2 in", values, "weixinpingtai2");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai2NotIn(List<Object> values) {
            addCriterion("WEIXINPINGTAI2 not in", values, "weixinpingtai2");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai2Between(Object value1, Object value2) {
            addCriterion("WEIXINPINGTAI2 between", value1, value2, "weixinpingtai2");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai2NotBetween(Object value1, Object value2) {
            addCriterion("WEIXINPINGTAI2 not between", value1, value2, "weixinpingtai2");
            return (Criteria) this;
        }

        public Criteria andWeibo2IsNull() {
            addCriterion("WEIBO2 is null");
            return (Criteria) this;
        }

        public Criteria andWeibo2IsNotNull() {
            addCriterion("WEIBO2 is not null");
            return (Criteria) this;
        }

        public Criteria andWeibo2EqualTo(Object value) {
            addCriterion("WEIBO2 =", value, "weibo2");
            return (Criteria) this;
        }

        public Criteria andWeibo2NotEqualTo(Object value) {
            addCriterion("WEIBO2 <>", value, "weibo2");
            return (Criteria) this;
        }

        public Criteria andWeibo2GreaterThan(Object value) {
            addCriterion("WEIBO2 >", value, "weibo2");
            return (Criteria) this;
        }

        public Criteria andWeibo2GreaterThanOrEqualTo(Object value) {
            addCriterion("WEIBO2 >=", value, "weibo2");
            return (Criteria) this;
        }

        public Criteria andWeibo2LessThan(Object value) {
            addCriterion("WEIBO2 <", value, "weibo2");
            return (Criteria) this;
        }

        public Criteria andWeibo2LessThanOrEqualTo(Object value) {
            addCriterion("WEIBO2 <=", value, "weibo2");
            return (Criteria) this;
        }

        public Criteria andWeibo2In(List<Object> values) {
            addCriterion("WEIBO2 in", values, "weibo2");
            return (Criteria) this;
        }

        public Criteria andWeibo2NotIn(List<Object> values) {
            addCriterion("WEIBO2 not in", values, "weibo2");
            return (Criteria) this;
        }

        public Criteria andWeibo2Between(Object value1, Object value2) {
            addCriterion("WEIBO2 between", value1, value2, "weibo2");
            return (Criteria) this;
        }

        public Criteria andWeibo2NotBetween(Object value1, Object value2) {
            addCriterion("WEIBO2 not between", value1, value2, "weibo2");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan2IsNull() {
            addCriterion("ZAZHIQIKAN2 is null");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan2IsNotNull() {
            addCriterion("ZAZHIQIKAN2 is not null");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan2EqualTo(Object value) {
            addCriterion("ZAZHIQIKAN2 =", value, "zazhiqikan2");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan2NotEqualTo(Object value) {
            addCriterion("ZAZHIQIKAN2 <>", value, "zazhiqikan2");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan2GreaterThan(Object value) {
            addCriterion("ZAZHIQIKAN2 >", value, "zazhiqikan2");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan2GreaterThanOrEqualTo(Object value) {
            addCriterion("ZAZHIQIKAN2 >=", value, "zazhiqikan2");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan2LessThan(Object value) {
            addCriterion("ZAZHIQIKAN2 <", value, "zazhiqikan2");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan2LessThanOrEqualTo(Object value) {
            addCriterion("ZAZHIQIKAN2 <=", value, "zazhiqikan2");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan2In(List<Object> values) {
            addCriterion("ZAZHIQIKAN2 in", values, "zazhiqikan2");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan2NotIn(List<Object> values) {
            addCriterion("ZAZHIQIKAN2 not in", values, "zazhiqikan2");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan2Between(Object value1, Object value2) {
            addCriterion("ZAZHIQIKAN2 between", value1, value2, "zazhiqikan2");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan2NotBetween(Object value1, Object value2) {
            addCriterion("ZAZHIQIKAN2 not between", value1, value2, "zazhiqikan2");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuiIsNull() {
            addCriterion("HUIYUANDAHUI is null");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuiIsNotNull() {
            addCriterion("HUIYUANDAHUI is not null");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuiEqualTo(Object value) {
            addCriterion("HUIYUANDAHUI =", value, "huiyuandahui");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuiNotEqualTo(Object value) {
            addCriterion("HUIYUANDAHUI <>", value, "huiyuandahui");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuiGreaterThan(Object value) {
            addCriterion("HUIYUANDAHUI >", value, "huiyuandahui");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuiGreaterThanOrEqualTo(Object value) {
            addCriterion("HUIYUANDAHUI >=", value, "huiyuandahui");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuiLessThan(Object value) {
            addCriterion("HUIYUANDAHUI <", value, "huiyuandahui");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuiLessThanOrEqualTo(Object value) {
            addCriterion("HUIYUANDAHUI <=", value, "huiyuandahui");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuiIn(List<Object> values) {
            addCriterion("HUIYUANDAHUI in", values, "huiyuandahui");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuiNotIn(List<Object> values) {
            addCriterion("HUIYUANDAHUI not in", values, "huiyuandahui");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuiBetween(Object value1, Object value2) {
            addCriterion("HUIYUANDAHUI between", value1, value2, "huiyuandahui");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuiNotBetween(Object value1, Object value2) {
            addCriterion("HUIYUANDAHUI not between", value1, value2, "huiyuandahui");
            return (Criteria) this;
        }

        public Criteria andGongzuoqqqunIsNull() {
            addCriterion("GONGZUOQQQUN is null");
            return (Criteria) this;
        }

        public Criteria andGongzuoqqqunIsNotNull() {
            addCriterion("GONGZUOQQQUN is not null");
            return (Criteria) this;
        }

        public Criteria andGongzuoqqqunEqualTo(Object value) {
            addCriterion("GONGZUOQQQUN =", value, "gongzuoqqqun");
            return (Criteria) this;
        }

        public Criteria andGongzuoqqqunNotEqualTo(Object value) {
            addCriterion("GONGZUOQQQUN <>", value, "gongzuoqqqun");
            return (Criteria) this;
        }

        public Criteria andGongzuoqqqunGreaterThan(Object value) {
            addCriterion("GONGZUOQQQUN >", value, "gongzuoqqqun");
            return (Criteria) this;
        }

        public Criteria andGongzuoqqqunGreaterThanOrEqualTo(Object value) {
            addCriterion("GONGZUOQQQUN >=", value, "gongzuoqqqun");
            return (Criteria) this;
        }

        public Criteria andGongzuoqqqunLessThan(Object value) {
            addCriterion("GONGZUOQQQUN <", value, "gongzuoqqqun");
            return (Criteria) this;
        }

        public Criteria andGongzuoqqqunLessThanOrEqualTo(Object value) {
            addCriterion("GONGZUOQQQUN <=", value, "gongzuoqqqun");
            return (Criteria) this;
        }

        public Criteria andGongzuoqqqunIn(List<Object> values) {
            addCriterion("GONGZUOQQQUN in", values, "gongzuoqqqun");
            return (Criteria) this;
        }

        public Criteria andGongzuoqqqunNotIn(List<Object> values) {
            addCriterion("GONGZUOQQQUN not in", values, "gongzuoqqqun");
            return (Criteria) this;
        }

        public Criteria andGongzuoqqqunBetween(Object value1, Object value2) {
            addCriterion("GONGZUOQQQUN between", value1, value2, "gongzuoqqqun");
            return (Criteria) this;
        }

        public Criteria andGongzuoqqqunNotBetween(Object value1, Object value2) {
            addCriterion("GONGZUOQQQUN not between", value1, value2, "gongzuoqqqun");
            return (Criteria) this;
        }

        public Criteria andDuanxinpingtaiIsNull() {
            addCriterion("DUANXINPINGTAI is null");
            return (Criteria) this;
        }

        public Criteria andDuanxinpingtaiIsNotNull() {
            addCriterion("DUANXINPINGTAI is not null");
            return (Criteria) this;
        }

        public Criteria andDuanxinpingtaiEqualTo(Object value) {
            addCriterion("DUANXINPINGTAI =", value, "duanxinpingtai");
            return (Criteria) this;
        }

        public Criteria andDuanxinpingtaiNotEqualTo(Object value) {
            addCriterion("DUANXINPINGTAI <>", value, "duanxinpingtai");
            return (Criteria) this;
        }

        public Criteria andDuanxinpingtaiGreaterThan(Object value) {
            addCriterion("DUANXINPINGTAI >", value, "duanxinpingtai");
            return (Criteria) this;
        }

        public Criteria andDuanxinpingtaiGreaterThanOrEqualTo(Object value) {
            addCriterion("DUANXINPINGTAI >=", value, "duanxinpingtai");
            return (Criteria) this;
        }

        public Criteria andDuanxinpingtaiLessThan(Object value) {
            addCriterion("DUANXINPINGTAI <", value, "duanxinpingtai");
            return (Criteria) this;
        }

        public Criteria andDuanxinpingtaiLessThanOrEqualTo(Object value) {
            addCriterion("DUANXINPINGTAI <=", value, "duanxinpingtai");
            return (Criteria) this;
        }

        public Criteria andDuanxinpingtaiIn(List<Object> values) {
            addCriterion("DUANXINPINGTAI in", values, "duanxinpingtai");
            return (Criteria) this;
        }

        public Criteria andDuanxinpingtaiNotIn(List<Object> values) {
            addCriterion("DUANXINPINGTAI not in", values, "duanxinpingtai");
            return (Criteria) this;
        }

        public Criteria andDuanxinpingtaiBetween(Object value1, Object value2) {
            addCriterion("DUANXINPINGTAI between", value1, value2, "duanxinpingtai");
            return (Criteria) this;
        }

        public Criteria andDuanxinpingtaiNotBetween(Object value1, Object value2) {
            addCriterion("DUANXINPINGTAI not between", value1, value2, "duanxinpingtai");
            return (Criteria) this;
        }

        public Criteria andQitafangshi2IsNull() {
            addCriterion("QITAFANGSHI2 is null");
            return (Criteria) this;
        }

        public Criteria andQitafangshi2IsNotNull() {
            addCriterion("QITAFANGSHI2 is not null");
            return (Criteria) this;
        }

        public Criteria andQitafangshi2EqualTo(Object value) {
            addCriterion("QITAFANGSHI2 =", value, "qitafangshi2");
            return (Criteria) this;
        }

        public Criteria andQitafangshi2NotEqualTo(Object value) {
            addCriterion("QITAFANGSHI2 <>", value, "qitafangshi2");
            return (Criteria) this;
        }

        public Criteria andQitafangshi2GreaterThan(Object value) {
            addCriterion("QITAFANGSHI2 >", value, "qitafangshi2");
            return (Criteria) this;
        }

        public Criteria andQitafangshi2GreaterThanOrEqualTo(Object value) {
            addCriterion("QITAFANGSHI2 >=", value, "qitafangshi2");
            return (Criteria) this;
        }

        public Criteria andQitafangshi2LessThan(Object value) {
            addCriterion("QITAFANGSHI2 <", value, "qitafangshi2");
            return (Criteria) this;
        }

        public Criteria andQitafangshi2LessThanOrEqualTo(Object value) {
            addCriterion("QITAFANGSHI2 <=", value, "qitafangshi2");
            return (Criteria) this;
        }

        public Criteria andQitafangshi2In(List<Object> values) {
            addCriterion("QITAFANGSHI2 in", values, "qitafangshi2");
            return (Criteria) this;
        }

        public Criteria andQitafangshi2NotIn(List<Object> values) {
            addCriterion("QITAFANGSHI2 not in", values, "qitafangshi2");
            return (Criteria) this;
        }

        public Criteria andQitafangshi2Between(Object value1, Object value2) {
            addCriterion("QITAFANGSHI2 between", value1, value2, "qitafangshi2");
            return (Criteria) this;
        }

        public Criteria andQitafangshi2NotBetween(Object value1, Object value2) {
            addCriterion("QITAFANGSHI2 not between", value1, value2, "qitafangshi2");
            return (Criteria) this;
        }

        public Criteria andQitafangshi22IsNull() {
            addCriterion("QITAFANGSHI22 is null");
            return (Criteria) this;
        }

        public Criteria andQitafangshi22IsNotNull() {
            addCriterion("QITAFANGSHI22 is not null");
            return (Criteria) this;
        }

        public Criteria andQitafangshi22EqualTo(Object value) {
            addCriterion("QITAFANGSHI22 =", value, "qitafangshi22");
            return (Criteria) this;
        }

        public Criteria andQitafangshi22NotEqualTo(Object value) {
            addCriterion("QITAFANGSHI22 <>", value, "qitafangshi22");
            return (Criteria) this;
        }

        public Criteria andQitafangshi22GreaterThan(Object value) {
            addCriterion("QITAFANGSHI22 >", value, "qitafangshi22");
            return (Criteria) this;
        }

        public Criteria andQitafangshi22GreaterThanOrEqualTo(Object value) {
            addCriterion("QITAFANGSHI22 >=", value, "qitafangshi22");
            return (Criteria) this;
        }

        public Criteria andQitafangshi22LessThan(Object value) {
            addCriterion("QITAFANGSHI22 <", value, "qitafangshi22");
            return (Criteria) this;
        }

        public Criteria andQitafangshi22LessThanOrEqualTo(Object value) {
            addCriterion("QITAFANGSHI22 <=", value, "qitafangshi22");
            return (Criteria) this;
        }

        public Criteria andQitafangshi22In(List<Object> values) {
            addCriterion("QITAFANGSHI22 in", values, "qitafangshi22");
            return (Criteria) this;
        }

        public Criteria andQitafangshi22NotIn(List<Object> values) {
            addCriterion("QITAFANGSHI22 not in", values, "qitafangshi22");
            return (Criteria) this;
        }

        public Criteria andQitafangshi22Between(Object value1, Object value2) {
            addCriterion("QITAFANGSHI22 between", value1, value2, "qitafangshi22");
            return (Criteria) this;
        }

        public Criteria andQitafangshi22NotBetween(Object value1, Object value2) {
            addCriterion("QITAFANGSHI22 not between", value1, value2, "qitafangshi22");
            return (Criteria) this;
        }

        public Criteria andQitafangshi11IsNull() {
            addCriterion("QITAFANGSHI11 is null");
            return (Criteria) this;
        }

        public Criteria andQitafangshi11IsNotNull() {
            addCriterion("QITAFANGSHI11 is not null");
            return (Criteria) this;
        }

        public Criteria andQitafangshi11EqualTo(Object value) {
            addCriterion("QITAFANGSHI11 =", value, "qitafangshi11");
            return (Criteria) this;
        }

        public Criteria andQitafangshi11NotEqualTo(Object value) {
            addCriterion("QITAFANGSHI11 <>", value, "qitafangshi11");
            return (Criteria) this;
        }

        public Criteria andQitafangshi11GreaterThan(Object value) {
            addCriterion("QITAFANGSHI11 >", value, "qitafangshi11");
            return (Criteria) this;
        }

        public Criteria andQitafangshi11GreaterThanOrEqualTo(Object value) {
            addCriterion("QITAFANGSHI11 >=", value, "qitafangshi11");
            return (Criteria) this;
        }

        public Criteria andQitafangshi11LessThan(Object value) {
            addCriterion("QITAFANGSHI11 <", value, "qitafangshi11");
            return (Criteria) this;
        }

        public Criteria andQitafangshi11LessThanOrEqualTo(Object value) {
            addCriterion("QITAFANGSHI11 <=", value, "qitafangshi11");
            return (Criteria) this;
        }

        public Criteria andQitafangshi11In(List<Object> values) {
            addCriterion("QITAFANGSHI11 in", values, "qitafangshi11");
            return (Criteria) this;
        }

        public Criteria andQitafangshi11NotIn(List<Object> values) {
            addCriterion("QITAFANGSHI11 not in", values, "qitafangshi11");
            return (Criteria) this;
        }

        public Criteria andQitafangshi11Between(Object value1, Object value2) {
            addCriterion("QITAFANGSHI11 between", value1, value2, "qitafangshi11");
            return (Criteria) this;
        }

        public Criteria andQitafangshi11NotBetween(Object value1, Object value2) {
            addCriterion("QITAFANGSHI11 not between", value1, value2, "qitafangshi11");
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