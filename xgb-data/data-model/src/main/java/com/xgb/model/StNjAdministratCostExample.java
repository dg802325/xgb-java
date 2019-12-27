package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StNjAdministratCostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StNjAdministratCostExample() {
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

        public Criteria andShoufeixiangmuIsNull() {
            addCriterion("SHOUFEIXIANGMU is null");
            return (Criteria) this;
        }

        public Criteria andShoufeixiangmuIsNotNull() {
            addCriterion("SHOUFEIXIANGMU is not null");
            return (Criteria) this;
        }

        public Criteria andShoufeixiangmuEqualTo(String value) {
            addCriterion("SHOUFEIXIANGMU =", value, "shoufeixiangmu");
            return (Criteria) this;
        }

        public Criteria andShoufeixiangmuNotEqualTo(String value) {
            addCriterion("SHOUFEIXIANGMU <>", value, "shoufeixiangmu");
            return (Criteria) this;
        }

        public Criteria andShoufeixiangmuGreaterThan(String value) {
            addCriterion("SHOUFEIXIANGMU >", value, "shoufeixiangmu");
            return (Criteria) this;
        }

        public Criteria andShoufeixiangmuGreaterThanOrEqualTo(String value) {
            addCriterion("SHOUFEIXIANGMU >=", value, "shoufeixiangmu");
            return (Criteria) this;
        }

        public Criteria andShoufeixiangmuLessThan(String value) {
            addCriterion("SHOUFEIXIANGMU <", value, "shoufeixiangmu");
            return (Criteria) this;
        }

        public Criteria andShoufeixiangmuLessThanOrEqualTo(String value) {
            addCriterion("SHOUFEIXIANGMU <=", value, "shoufeixiangmu");
            return (Criteria) this;
        }

        public Criteria andShoufeixiangmuLike(String value) {
            addCriterion("SHOUFEIXIANGMU like", value, "shoufeixiangmu");
            return (Criteria) this;
        }

        public Criteria andShoufeixiangmuNotLike(String value) {
            addCriterion("SHOUFEIXIANGMU not like", value, "shoufeixiangmu");
            return (Criteria) this;
        }

        public Criteria andShoufeixiangmuIn(List<String> values) {
            addCriterion("SHOUFEIXIANGMU in", values, "shoufeixiangmu");
            return (Criteria) this;
        }

        public Criteria andShoufeixiangmuNotIn(List<String> values) {
            addCriterion("SHOUFEIXIANGMU not in", values, "shoufeixiangmu");
            return (Criteria) this;
        }

        public Criteria andShoufeixiangmuBetween(String value1, String value2) {
            addCriterion("SHOUFEIXIANGMU between", value1, value2, "shoufeixiangmu");
            return (Criteria) this;
        }

        public Criteria andShoufeixiangmuNotBetween(String value1, String value2) {
            addCriterion("SHOUFEIXIANGMU not between", value1, value2, "shoufeixiangmu");
            return (Criteria) this;
        }

        public Criteria andShoufeibiaozhuIsNull() {
            addCriterion("SHOUFEIBIAOZHU is null");
            return (Criteria) this;
        }

        public Criteria andShoufeibiaozhuIsNotNull() {
            addCriterion("SHOUFEIBIAOZHU is not null");
            return (Criteria) this;
        }

        public Criteria andShoufeibiaozhuEqualTo(Double value) {
            addCriterion("SHOUFEIBIAOZHU =", value, "shoufeibiaozhu");
            return (Criteria) this;
        }

        public Criteria andShoufeibiaozhuNotEqualTo(Double value) {
            addCriterion("SHOUFEIBIAOZHU <>", value, "shoufeibiaozhu");
            return (Criteria) this;
        }

        public Criteria andShoufeibiaozhuGreaterThan(Double value) {
            addCriterion("SHOUFEIBIAOZHU >", value, "shoufeibiaozhu");
            return (Criteria) this;
        }

        public Criteria andShoufeibiaozhuGreaterThanOrEqualTo(Double value) {
            addCriterion("SHOUFEIBIAOZHU >=", value, "shoufeibiaozhu");
            return (Criteria) this;
        }

        public Criteria andShoufeibiaozhuLessThan(Double value) {
            addCriterion("SHOUFEIBIAOZHU <", value, "shoufeibiaozhu");
            return (Criteria) this;
        }

        public Criteria andShoufeibiaozhuLessThanOrEqualTo(Double value) {
            addCriterion("SHOUFEIBIAOZHU <=", value, "shoufeibiaozhu");
            return (Criteria) this;
        }

        public Criteria andShoufeibiaozhuIn(List<Double> values) {
            addCriterion("SHOUFEIBIAOZHU in", values, "shoufeibiaozhu");
            return (Criteria) this;
        }

        public Criteria andShoufeibiaozhuNotIn(List<Double> values) {
            addCriterion("SHOUFEIBIAOZHU not in", values, "shoufeibiaozhu");
            return (Criteria) this;
        }

        public Criteria andShoufeibiaozhuBetween(Double value1, Double value2) {
            addCriterion("SHOUFEIBIAOZHU between", value1, value2, "shoufeibiaozhu");
            return (Criteria) this;
        }

        public Criteria andShoufeibiaozhuNotBetween(Double value1, Double value2) {
            addCriterion("SHOUFEIBIAOZHU not between", value1, value2, "shoufeibiaozhu");
            return (Criteria) this;
        }

        public Criteria andSheliyijuIsNull() {
            addCriterion("SHELIYIJU is null");
            return (Criteria) this;
        }

        public Criteria andSheliyijuIsNotNull() {
            addCriterion("SHELIYIJU is not null");
            return (Criteria) this;
        }

        public Criteria andSheliyijuEqualTo(String value) {
            addCriterion("SHELIYIJU =", value, "sheliyiju");
            return (Criteria) this;
        }

        public Criteria andSheliyijuNotEqualTo(String value) {
            addCriterion("SHELIYIJU <>", value, "sheliyiju");
            return (Criteria) this;
        }

        public Criteria andSheliyijuGreaterThan(String value) {
            addCriterion("SHELIYIJU >", value, "sheliyiju");
            return (Criteria) this;
        }

        public Criteria andSheliyijuGreaterThanOrEqualTo(String value) {
            addCriterion("SHELIYIJU >=", value, "sheliyiju");
            return (Criteria) this;
        }

        public Criteria andSheliyijuLessThan(String value) {
            addCriterion("SHELIYIJU <", value, "sheliyiju");
            return (Criteria) this;
        }

        public Criteria andSheliyijuLessThanOrEqualTo(String value) {
            addCriterion("SHELIYIJU <=", value, "sheliyiju");
            return (Criteria) this;
        }

        public Criteria andSheliyijuLike(String value) {
            addCriterion("SHELIYIJU like", value, "sheliyiju");
            return (Criteria) this;
        }

        public Criteria andSheliyijuNotLike(String value) {
            addCriterion("SHELIYIJU not like", value, "sheliyiju");
            return (Criteria) this;
        }

        public Criteria andSheliyijuIn(List<String> values) {
            addCriterion("SHELIYIJU in", values, "sheliyiju");
            return (Criteria) this;
        }

        public Criteria andSheliyijuNotIn(List<String> values) {
            addCriterion("SHELIYIJU not in", values, "sheliyiju");
            return (Criteria) this;
        }

        public Criteria andSheliyijuBetween(String value1, String value2) {
            addCriterion("SHELIYIJU between", value1, value2, "sheliyiju");
            return (Criteria) this;
        }

        public Criteria andSheliyijuNotBetween(String value1, String value2) {
            addCriterion("SHELIYIJU not between", value1, value2, "sheliyiju");
            return (Criteria) this;
        }

        public Criteria andHejiIsNull() {
            addCriterion("HEJI is null");
            return (Criteria) this;
        }

        public Criteria andHejiIsNotNull() {
            addCriterion("HEJI is not null");
            return (Criteria) this;
        }

        public Criteria andHejiEqualTo(Double value) {
            addCriterion("HEJI =", value, "heji");
            return (Criteria) this;
        }

        public Criteria andHejiNotEqualTo(Double value) {
            addCriterion("HEJI <>", value, "heji");
            return (Criteria) this;
        }

        public Criteria andHejiGreaterThan(Double value) {
            addCriterion("HEJI >", value, "heji");
            return (Criteria) this;
        }

        public Criteria andHejiGreaterThanOrEqualTo(Double value) {
            addCriterion("HEJI >=", value, "heji");
            return (Criteria) this;
        }

        public Criteria andHejiLessThan(Double value) {
            addCriterion("HEJI <", value, "heji");
            return (Criteria) this;
        }

        public Criteria andHejiLessThanOrEqualTo(Double value) {
            addCriterion("HEJI <=", value, "heji");
            return (Criteria) this;
        }

        public Criteria andHejiIn(List<Double> values) {
            addCriterion("HEJI in", values, "heji");
            return (Criteria) this;
        }

        public Criteria andHejiNotIn(List<Double> values) {
            addCriterion("HEJI not in", values, "heji");
            return (Criteria) this;
        }

        public Criteria andHejiBetween(Double value1, Double value2) {
            addCriterion("HEJI between", value1, value2, "heji");
            return (Criteria) this;
        }

        public Criteria andHejiNotBetween(Double value1, Double value2) {
            addCriterion("HEJI not between", value1, value2, "heji");
            return (Criteria) this;
        }

        public Criteria andZichaqingliyijianIsNull() {
            addCriterion("ZICHAQINGLIYIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andZichaqingliyijianIsNotNull() {
            addCriterion("ZICHAQINGLIYIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andZichaqingliyijianEqualTo(String value) {
            addCriterion("ZICHAQINGLIYIJIAN =", value, "zichaqingliyijian");
            return (Criteria) this;
        }

        public Criteria andZichaqingliyijianNotEqualTo(String value) {
            addCriterion("ZICHAQINGLIYIJIAN <>", value, "zichaqingliyijian");
            return (Criteria) this;
        }

        public Criteria andZichaqingliyijianGreaterThan(String value) {
            addCriterion("ZICHAQINGLIYIJIAN >", value, "zichaqingliyijian");
            return (Criteria) this;
        }

        public Criteria andZichaqingliyijianGreaterThanOrEqualTo(String value) {
            addCriterion("ZICHAQINGLIYIJIAN >=", value, "zichaqingliyijian");
            return (Criteria) this;
        }

        public Criteria andZichaqingliyijianLessThan(String value) {
            addCriterion("ZICHAQINGLIYIJIAN <", value, "zichaqingliyijian");
            return (Criteria) this;
        }

        public Criteria andZichaqingliyijianLessThanOrEqualTo(String value) {
            addCriterion("ZICHAQINGLIYIJIAN <=", value, "zichaqingliyijian");
            return (Criteria) this;
        }

        public Criteria andZichaqingliyijianLike(String value) {
            addCriterion("ZICHAQINGLIYIJIAN like", value, "zichaqingliyijian");
            return (Criteria) this;
        }

        public Criteria andZichaqingliyijianNotLike(String value) {
            addCriterion("ZICHAQINGLIYIJIAN not like", value, "zichaqingliyijian");
            return (Criteria) this;
        }

        public Criteria andZichaqingliyijianIn(List<String> values) {
            addCriterion("ZICHAQINGLIYIJIAN in", values, "zichaqingliyijian");
            return (Criteria) this;
        }

        public Criteria andZichaqingliyijianNotIn(List<String> values) {
            addCriterion("ZICHAQINGLIYIJIAN not in", values, "zichaqingliyijian");
            return (Criteria) this;
        }

        public Criteria andZichaqingliyijianBetween(String value1, String value2) {
            addCriterion("ZICHAQINGLIYIJIAN between", value1, value2, "zichaqingliyijian");
            return (Criteria) this;
        }

        public Criteria andZichaqingliyijianNotBetween(String value1, String value2) {
            addCriterion("ZICHAQINGLIYIJIAN not between", value1, value2, "zichaqingliyijian");
            return (Criteria) this;
        }

        public Criteria andXingzhengshoufeizongeIsNull() {
            addCriterion("XINGZHENGSHOUFEIZONGE is null");
            return (Criteria) this;
        }

        public Criteria andXingzhengshoufeizongeIsNotNull() {
            addCriterion("XINGZHENGSHOUFEIZONGE is not null");
            return (Criteria) this;
        }

        public Criteria andXingzhengshoufeizongeEqualTo(Double value) {
            addCriterion("XINGZHENGSHOUFEIZONGE =", value, "xingzhengshoufeizonge");
            return (Criteria) this;
        }

        public Criteria andXingzhengshoufeizongeNotEqualTo(Double value) {
            addCriterion("XINGZHENGSHOUFEIZONGE <>", value, "xingzhengshoufeizonge");
            return (Criteria) this;
        }

        public Criteria andXingzhengshoufeizongeGreaterThan(Double value) {
            addCriterion("XINGZHENGSHOUFEIZONGE >", value, "xingzhengshoufeizonge");
            return (Criteria) this;
        }

        public Criteria andXingzhengshoufeizongeGreaterThanOrEqualTo(Double value) {
            addCriterion("XINGZHENGSHOUFEIZONGE >=", value, "xingzhengshoufeizonge");
            return (Criteria) this;
        }

        public Criteria andXingzhengshoufeizongeLessThan(Double value) {
            addCriterion("XINGZHENGSHOUFEIZONGE <", value, "xingzhengshoufeizonge");
            return (Criteria) this;
        }

        public Criteria andXingzhengshoufeizongeLessThanOrEqualTo(Double value) {
            addCriterion("XINGZHENGSHOUFEIZONGE <=", value, "xingzhengshoufeizonge");
            return (Criteria) this;
        }

        public Criteria andXingzhengshoufeizongeIn(List<Double> values) {
            addCriterion("XINGZHENGSHOUFEIZONGE in", values, "xingzhengshoufeizonge");
            return (Criteria) this;
        }

        public Criteria andXingzhengshoufeizongeNotIn(List<Double> values) {
            addCriterion("XINGZHENGSHOUFEIZONGE not in", values, "xingzhengshoufeizonge");
            return (Criteria) this;
        }

        public Criteria andXingzhengshoufeizongeBetween(Double value1, Double value2) {
            addCriterion("XINGZHENGSHOUFEIZONGE between", value1, value2, "xingzhengshoufeizonge");
            return (Criteria) this;
        }

        public Criteria andXingzhengshoufeizongeNotBetween(Double value1, Double value2) {
            addCriterion("XINGZHENGSHOUFEIZONGE not between", value1, value2, "xingzhengshoufeizonge");
            return (Criteria) this;
        }

        public Criteria andShifoushanzigenggaiIsNull() {
            addCriterion("SHIFOUSHANZIGENGGAI is null");
            return (Criteria) this;
        }

        public Criteria andShifoushanzigenggaiIsNotNull() {
            addCriterion("SHIFOUSHANZIGENGGAI is not null");
            return (Criteria) this;
        }

        public Criteria andShifoushanzigenggaiEqualTo(String value) {
            addCriterion("SHIFOUSHANZIGENGGAI =", value, "shifoushanzigenggai");
            return (Criteria) this;
        }

        public Criteria andShifoushanzigenggaiNotEqualTo(String value) {
            addCriterion("SHIFOUSHANZIGENGGAI <>", value, "shifoushanzigenggai");
            return (Criteria) this;
        }

        public Criteria andShifoushanzigenggaiGreaterThan(String value) {
            addCriterion("SHIFOUSHANZIGENGGAI >", value, "shifoushanzigenggai");
            return (Criteria) this;
        }

        public Criteria andShifoushanzigenggaiGreaterThanOrEqualTo(String value) {
            addCriterion("SHIFOUSHANZIGENGGAI >=", value, "shifoushanzigenggai");
            return (Criteria) this;
        }

        public Criteria andShifoushanzigenggaiLessThan(String value) {
            addCriterion("SHIFOUSHANZIGENGGAI <", value, "shifoushanzigenggai");
            return (Criteria) this;
        }

        public Criteria andShifoushanzigenggaiLessThanOrEqualTo(String value) {
            addCriterion("SHIFOUSHANZIGENGGAI <=", value, "shifoushanzigenggai");
            return (Criteria) this;
        }

        public Criteria andShifoushanzigenggaiLike(String value) {
            addCriterion("SHIFOUSHANZIGENGGAI like", value, "shifoushanzigenggai");
            return (Criteria) this;
        }

        public Criteria andShifoushanzigenggaiNotLike(String value) {
            addCriterion("SHIFOUSHANZIGENGGAI not like", value, "shifoushanzigenggai");
            return (Criteria) this;
        }

        public Criteria andShifoushanzigenggaiIn(List<String> values) {
            addCriterion("SHIFOUSHANZIGENGGAI in", values, "shifoushanzigenggai");
            return (Criteria) this;
        }

        public Criteria andShifoushanzigenggaiNotIn(List<String> values) {
            addCriterion("SHIFOUSHANZIGENGGAI not in", values, "shifoushanzigenggai");
            return (Criteria) this;
        }

        public Criteria andShifoushanzigenggaiBetween(String value1, String value2) {
            addCriterion("SHIFOUSHANZIGENGGAI between", value1, value2, "shifoushanzigenggai");
            return (Criteria) this;
        }

        public Criteria andShifoushanzigenggaiNotBetween(String value1, String value2) {
            addCriterion("SHIFOUSHANZIGENGGAI not between", value1, value2, "shifoushanzigenggai");
            return (Criteria) this;
        }

        public Criteria andShanzishejijineIsNull() {
            addCriterion("SHANZISHEJIJINE is null");
            return (Criteria) this;
        }

        public Criteria andShanzishejijineIsNotNull() {
            addCriterion("SHANZISHEJIJINE is not null");
            return (Criteria) this;
        }

        public Criteria andShanzishejijineEqualTo(Double value) {
            addCriterion("SHANZISHEJIJINE =", value, "shanzishejijine");
            return (Criteria) this;
        }

        public Criteria andShanzishejijineNotEqualTo(Double value) {
            addCriterion("SHANZISHEJIJINE <>", value, "shanzishejijine");
            return (Criteria) this;
        }

        public Criteria andShanzishejijineGreaterThan(Double value) {
            addCriterion("SHANZISHEJIJINE >", value, "shanzishejijine");
            return (Criteria) this;
        }

        public Criteria andShanzishejijineGreaterThanOrEqualTo(Double value) {
            addCriterion("SHANZISHEJIJINE >=", value, "shanzishejijine");
            return (Criteria) this;
        }

        public Criteria andShanzishejijineLessThan(Double value) {
            addCriterion("SHANZISHEJIJINE <", value, "shanzishejijine");
            return (Criteria) this;
        }

        public Criteria andShanzishejijineLessThanOrEqualTo(Double value) {
            addCriterion("SHANZISHEJIJINE <=", value, "shanzishejijine");
            return (Criteria) this;
        }

        public Criteria andShanzishejijineIn(List<Double> values) {
            addCriterion("SHANZISHEJIJINE in", values, "shanzishejijine");
            return (Criteria) this;
        }

        public Criteria andShanzishejijineNotIn(List<Double> values) {
            addCriterion("SHANZISHEJIJINE not in", values, "shanzishejijine");
            return (Criteria) this;
        }

        public Criteria andShanzishejijineBetween(Double value1, Double value2) {
            addCriterion("SHANZISHEJIJINE between", value1, value2, "shanzishejijine");
            return (Criteria) this;
        }

        public Criteria andShanzishejijineNotBetween(Double value1, Double value2) {
            addCriterion("SHANZISHEJIJINE not between", value1, value2, "shanzishejijine");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianshoufeiIsNull() {
            addCriterion("ZIXINGJIANMIANSHOUFEI is null");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianshoufeiIsNotNull() {
            addCriterion("ZIXINGJIANMIANSHOUFEI is not null");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianshoufeiEqualTo(Double value) {
            addCriterion("ZIXINGJIANMIANSHOUFEI =", value, "zixingjianmianshoufei");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianshoufeiNotEqualTo(Double value) {
            addCriterion("ZIXINGJIANMIANSHOUFEI <>", value, "zixingjianmianshoufei");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianshoufeiGreaterThan(Double value) {
            addCriterion("ZIXINGJIANMIANSHOUFEI >", value, "zixingjianmianshoufei");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianshoufeiGreaterThanOrEqualTo(Double value) {
            addCriterion("ZIXINGJIANMIANSHOUFEI >=", value, "zixingjianmianshoufei");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianshoufeiLessThan(Double value) {
            addCriterion("ZIXINGJIANMIANSHOUFEI <", value, "zixingjianmianshoufei");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianshoufeiLessThanOrEqualTo(Double value) {
            addCriterion("ZIXINGJIANMIANSHOUFEI <=", value, "zixingjianmianshoufei");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianshoufeiIn(List<Double> values) {
            addCriterion("ZIXINGJIANMIANSHOUFEI in", values, "zixingjianmianshoufei");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianshoufeiNotIn(List<Double> values) {
            addCriterion("ZIXINGJIANMIANSHOUFEI not in", values, "zixingjianmianshoufei");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianshoufeiBetween(Double value1, Double value2) {
            addCriterion("ZIXINGJIANMIANSHOUFEI between", value1, value2, "zixingjianmianshoufei");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianshoufeiNotBetween(Double value1, Double value2) {
            addCriterion("ZIXINGJIANMIANSHOUFEI not between", value1, value2, "zixingjianmianshoufei");
            return (Criteria) this;
        }

        public Criteria andJianmianshoufeijutiqingkuangIsNull() {
            addCriterion("JIANMIANSHOUFEIJUTIQINGKUANG is null");
            return (Criteria) this;
        }

        public Criteria andJianmianshoufeijutiqingkuangIsNotNull() {
            addCriterion("JIANMIANSHOUFEIJUTIQINGKUANG is not null");
            return (Criteria) this;
        }

        public Criteria andJianmianshoufeijutiqingkuangEqualTo(String value) {
            addCriterion("JIANMIANSHOUFEIJUTIQINGKUANG =", value, "jianmianshoufeijutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andJianmianshoufeijutiqingkuangNotEqualTo(String value) {
            addCriterion("JIANMIANSHOUFEIJUTIQINGKUANG <>", value, "jianmianshoufeijutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andJianmianshoufeijutiqingkuangGreaterThan(String value) {
            addCriterion("JIANMIANSHOUFEIJUTIQINGKUANG >", value, "jianmianshoufeijutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andJianmianshoufeijutiqingkuangGreaterThanOrEqualTo(String value) {
            addCriterion("JIANMIANSHOUFEIJUTIQINGKUANG >=", value, "jianmianshoufeijutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andJianmianshoufeijutiqingkuangLessThan(String value) {
            addCriterion("JIANMIANSHOUFEIJUTIQINGKUANG <", value, "jianmianshoufeijutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andJianmianshoufeijutiqingkuangLessThanOrEqualTo(String value) {
            addCriterion("JIANMIANSHOUFEIJUTIQINGKUANG <=", value, "jianmianshoufeijutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andJianmianshoufeijutiqingkuangLike(String value) {
            addCriterion("JIANMIANSHOUFEIJUTIQINGKUANG like", value, "jianmianshoufeijutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andJianmianshoufeijutiqingkuangNotLike(String value) {
            addCriterion("JIANMIANSHOUFEIJUTIQINGKUANG not like", value, "jianmianshoufeijutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andJianmianshoufeijutiqingkuangIn(List<String> values) {
            addCriterion("JIANMIANSHOUFEIJUTIQINGKUANG in", values, "jianmianshoufeijutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andJianmianshoufeijutiqingkuangNotIn(List<String> values) {
            addCriterion("JIANMIANSHOUFEIJUTIQINGKUANG not in", values, "jianmianshoufeijutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andJianmianshoufeijutiqingkuangBetween(String value1, String value2) {
            addCriterion("JIANMIANSHOUFEIJUTIQINGKUANG between", value1, value2, "jianmianshoufeijutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andJianmianshoufeijutiqingkuangNotBetween(String value1, String value2) {
            addCriterion("JIANMIANSHOUFEIJUTIQINGKUANG not between", value1, value2, "jianmianshoufeijutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andZhenggaijineIsNull() {
            addCriterion("ZHENGGAIJINE is null");
            return (Criteria) this;
        }

        public Criteria andZhenggaijineIsNotNull() {
            addCriterion("ZHENGGAIJINE is not null");
            return (Criteria) this;
        }

        public Criteria andZhenggaijineEqualTo(BigDecimal value) {
            addCriterion("ZHENGGAIJINE =", value, "zhenggaijine");
            return (Criteria) this;
        }

        public Criteria andZhenggaijineNotEqualTo(BigDecimal value) {
            addCriterion("ZHENGGAIJINE <>", value, "zhenggaijine");
            return (Criteria) this;
        }

        public Criteria andZhenggaijineGreaterThan(BigDecimal value) {
            addCriterion("ZHENGGAIJINE >", value, "zhenggaijine");
            return (Criteria) this;
        }

        public Criteria andZhenggaijineGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHENGGAIJINE >=", value, "zhenggaijine");
            return (Criteria) this;
        }

        public Criteria andZhenggaijineLessThan(BigDecimal value) {
            addCriterion("ZHENGGAIJINE <", value, "zhenggaijine");
            return (Criteria) this;
        }

        public Criteria andZhenggaijineLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHENGGAIJINE <=", value, "zhenggaijine");
            return (Criteria) this;
        }

        public Criteria andZhenggaijineIn(List<BigDecimal> values) {
            addCriterion("ZHENGGAIJINE in", values, "zhenggaijine");
            return (Criteria) this;
        }

        public Criteria andZhenggaijineNotIn(List<BigDecimal> values) {
            addCriterion("ZHENGGAIJINE not in", values, "zhenggaijine");
            return (Criteria) this;
        }

        public Criteria andZhenggaijineBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHENGGAIJINE between", value1, value2, "zhenggaijine");
            return (Criteria) this;
        }

        public Criteria andZhenggaijineNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHENGGAIJINE not between", value1, value2, "zhenggaijine");
            return (Criteria) this;
        }

        public Criteria andZhenggaijinejutiqingkuangIsNull() {
            addCriterion("ZHENGGAIJINEJUTIQINGKUANG is null");
            return (Criteria) this;
        }

        public Criteria andZhenggaijinejutiqingkuangIsNotNull() {
            addCriterion("ZHENGGAIJINEJUTIQINGKUANG is not null");
            return (Criteria) this;
        }

        public Criteria andZhenggaijinejutiqingkuangEqualTo(String value) {
            addCriterion("ZHENGGAIJINEJUTIQINGKUANG =", value, "zhenggaijinejutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andZhenggaijinejutiqingkuangNotEqualTo(String value) {
            addCriterion("ZHENGGAIJINEJUTIQINGKUANG <>", value, "zhenggaijinejutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andZhenggaijinejutiqingkuangGreaterThan(String value) {
            addCriterion("ZHENGGAIJINEJUTIQINGKUANG >", value, "zhenggaijinejutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andZhenggaijinejutiqingkuangGreaterThanOrEqualTo(String value) {
            addCriterion("ZHENGGAIJINEJUTIQINGKUANG >=", value, "zhenggaijinejutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andZhenggaijinejutiqingkuangLessThan(String value) {
            addCriterion("ZHENGGAIJINEJUTIQINGKUANG <", value, "zhenggaijinejutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andZhenggaijinejutiqingkuangLessThanOrEqualTo(String value) {
            addCriterion("ZHENGGAIJINEJUTIQINGKUANG <=", value, "zhenggaijinejutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andZhenggaijinejutiqingkuangLike(String value) {
            addCriterion("ZHENGGAIJINEJUTIQINGKUANG like", value, "zhenggaijinejutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andZhenggaijinejutiqingkuangNotLike(String value) {
            addCriterion("ZHENGGAIJINEJUTIQINGKUANG not like", value, "zhenggaijinejutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andZhenggaijinejutiqingkuangIn(List<String> values) {
            addCriterion("ZHENGGAIJINEJUTIQINGKUANG in", values, "zhenggaijinejutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andZhenggaijinejutiqingkuangNotIn(List<String> values) {
            addCriterion("ZHENGGAIJINEJUTIQINGKUANG not in", values, "zhenggaijinejutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andZhenggaijinejutiqingkuangBetween(String value1, String value2) {
            addCriterion("ZHENGGAIJINEJUTIQINGKUANG between", value1, value2, "zhenggaijinejutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andZhenggaijinejutiqingkuangNotBetween(String value1, String value2) {
            addCriterion("ZHENGGAIJINEJUTIQINGKUANG not between", value1, value2, "zhenggaijinejutiqingkuang");
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