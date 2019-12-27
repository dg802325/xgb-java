package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StNjGyhdzcSubExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StNjGyhdzcSubExample() {
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

        public Criteria andMingchengIsNull() {
            addCriterion("MINGCHENG is null");
            return (Criteria) this;
        }

        public Criteria andMingchengIsNotNull() {
            addCriterion("MINGCHENG is not null");
            return (Criteria) this;
        }

        public Criteria andMingchengEqualTo(String value) {
            addCriterion("MINGCHENG =", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengNotEqualTo(String value) {
            addCriterion("MINGCHENG <>", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengGreaterThan(String value) {
            addCriterion("MINGCHENG >", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengGreaterThanOrEqualTo(String value) {
            addCriterion("MINGCHENG >=", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengLessThan(String value) {
            addCriterion("MINGCHENG <", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengLessThanOrEqualTo(String value) {
            addCriterion("MINGCHENG <=", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengLike(String value) {
            addCriterion("MINGCHENG like", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengNotLike(String value) {
            addCriterion("MINGCHENG not like", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengIn(List<String> values) {
            addCriterion("MINGCHENG in", values, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengNotIn(List<String> values) {
            addCriterion("MINGCHENG not in", values, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengBetween(String value1, String value2) {
            addCriterion("MINGCHENG between", value1, value2, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengNotBetween(String value1, String value2) {
            addCriterion("MINGCHENG not between", value1, value2, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andKuanwuIsNull() {
            addCriterion("KUANWU is null");
            return (Criteria) this;
        }

        public Criteria andKuanwuIsNotNull() {
            addCriterion("KUANWU is not null");
            return (Criteria) this;
        }

        public Criteria andKuanwuEqualTo(BigDecimal value) {
            addCriterion("KUANWU =", value, "kuanwu");
            return (Criteria) this;
        }

        public Criteria andKuanwuNotEqualTo(BigDecimal value) {
            addCriterion("KUANWU <>", value, "kuanwu");
            return (Criteria) this;
        }

        public Criteria andKuanwuGreaterThan(BigDecimal value) {
            addCriterion("KUANWU >", value, "kuanwu");
            return (Criteria) this;
        }

        public Criteria andKuanwuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("KUANWU >=", value, "kuanwu");
            return (Criteria) this;
        }

        public Criteria andKuanwuLessThan(BigDecimal value) {
            addCriterion("KUANWU <", value, "kuanwu");
            return (Criteria) this;
        }

        public Criteria andKuanwuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("KUANWU <=", value, "kuanwu");
            return (Criteria) this;
        }

        public Criteria andKuanwuIn(List<BigDecimal> values) {
            addCriterion("KUANWU in", values, "kuanwu");
            return (Criteria) this;
        }

        public Criteria andKuanwuNotIn(List<BigDecimal> values) {
            addCriterion("KUANWU not in", values, "kuanwu");
            return (Criteria) this;
        }

        public Criteria andKuanwuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KUANWU between", value1, value2, "kuanwu");
            return (Criteria) this;
        }

        public Criteria andKuanwuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KUANWU not between", value1, value2, "kuanwu");
            return (Criteria) this;
        }

        public Criteria andRenyuanfeiyongIsNull() {
            addCriterion("RENYUANFEIYONG is null");
            return (Criteria) this;
        }

        public Criteria andRenyuanfeiyongIsNotNull() {
            addCriterion("RENYUANFEIYONG is not null");
            return (Criteria) this;
        }

        public Criteria andRenyuanfeiyongEqualTo(BigDecimal value) {
            addCriterion("RENYUANFEIYONG =", value, "renyuanfeiyong");
            return (Criteria) this;
        }

        public Criteria andRenyuanfeiyongNotEqualTo(BigDecimal value) {
            addCriterion("RENYUANFEIYONG <>", value, "renyuanfeiyong");
            return (Criteria) this;
        }

        public Criteria andRenyuanfeiyongGreaterThan(BigDecimal value) {
            addCriterion("RENYUANFEIYONG >", value, "renyuanfeiyong");
            return (Criteria) this;
        }

        public Criteria andRenyuanfeiyongGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RENYUANFEIYONG >=", value, "renyuanfeiyong");
            return (Criteria) this;
        }

        public Criteria andRenyuanfeiyongLessThan(BigDecimal value) {
            addCriterion("RENYUANFEIYONG <", value, "renyuanfeiyong");
            return (Criteria) this;
        }

        public Criteria andRenyuanfeiyongLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RENYUANFEIYONG <=", value, "renyuanfeiyong");
            return (Criteria) this;
        }

        public Criteria andRenyuanfeiyongIn(List<BigDecimal> values) {
            addCriterion("RENYUANFEIYONG in", values, "renyuanfeiyong");
            return (Criteria) this;
        }

        public Criteria andRenyuanfeiyongNotIn(List<BigDecimal> values) {
            addCriterion("RENYUANFEIYONG not in", values, "renyuanfeiyong");
            return (Criteria) this;
        }

        public Criteria andRenyuanfeiyongBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RENYUANFEIYONG between", value1, value2, "renyuanfeiyong");
            return (Criteria) this;
        }

        public Criteria andRenyuanfeiyongNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RENYUANFEIYONG not between", value1, value2, "renyuanfeiyong");
            return (Criteria) this;
        }

        public Criteria andBangongfeiyongIsNull() {
            addCriterion("BANGONGFEIYONG is null");
            return (Criteria) this;
        }

        public Criteria andBangongfeiyongIsNotNull() {
            addCriterion("BANGONGFEIYONG is not null");
            return (Criteria) this;
        }

        public Criteria andBangongfeiyongEqualTo(BigDecimal value) {
            addCriterion("BANGONGFEIYONG =", value, "bangongfeiyong");
            return (Criteria) this;
        }

        public Criteria andBangongfeiyongNotEqualTo(BigDecimal value) {
            addCriterion("BANGONGFEIYONG <>", value, "bangongfeiyong");
            return (Criteria) this;
        }

        public Criteria andBangongfeiyongGreaterThan(BigDecimal value) {
            addCriterion("BANGONGFEIYONG >", value, "bangongfeiyong");
            return (Criteria) this;
        }

        public Criteria andBangongfeiyongGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BANGONGFEIYONG >=", value, "bangongfeiyong");
            return (Criteria) this;
        }

        public Criteria andBangongfeiyongLessThan(BigDecimal value) {
            addCriterion("BANGONGFEIYONG <", value, "bangongfeiyong");
            return (Criteria) this;
        }

        public Criteria andBangongfeiyongLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BANGONGFEIYONG <=", value, "bangongfeiyong");
            return (Criteria) this;
        }

        public Criteria andBangongfeiyongIn(List<BigDecimal> values) {
            addCriterion("BANGONGFEIYONG in", values, "bangongfeiyong");
            return (Criteria) this;
        }

        public Criteria andBangongfeiyongNotIn(List<BigDecimal> values) {
            addCriterion("BANGONGFEIYONG not in", values, "bangongfeiyong");
            return (Criteria) this;
        }

        public Criteria andBangongfeiyongBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANGONGFEIYONG between", value1, value2, "bangongfeiyong");
            return (Criteria) this;
        }

        public Criteria andBangongfeiyongNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANGONGFEIYONG not between", value1, value2, "bangongfeiyong");
            return (Criteria) this;
        }

        public Criteria andShiyongfeiyongIsNull() {
            addCriterion("SHIYONGFEIYONG is null");
            return (Criteria) this;
        }

        public Criteria andShiyongfeiyongIsNotNull() {
            addCriterion("SHIYONGFEIYONG is not null");
            return (Criteria) this;
        }

        public Criteria andShiyongfeiyongEqualTo(BigDecimal value) {
            addCriterion("SHIYONGFEIYONG =", value, "shiyongfeiyong");
            return (Criteria) this;
        }

        public Criteria andShiyongfeiyongNotEqualTo(BigDecimal value) {
            addCriterion("SHIYONGFEIYONG <>", value, "shiyongfeiyong");
            return (Criteria) this;
        }

        public Criteria andShiyongfeiyongGreaterThan(BigDecimal value) {
            addCriterion("SHIYONGFEIYONG >", value, "shiyongfeiyong");
            return (Criteria) this;
        }

        public Criteria andShiyongfeiyongGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHIYONGFEIYONG >=", value, "shiyongfeiyong");
            return (Criteria) this;
        }

        public Criteria andShiyongfeiyongLessThan(BigDecimal value) {
            addCriterion("SHIYONGFEIYONG <", value, "shiyongfeiyong");
            return (Criteria) this;
        }

        public Criteria andShiyongfeiyongLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHIYONGFEIYONG <=", value, "shiyongfeiyong");
            return (Criteria) this;
        }

        public Criteria andShiyongfeiyongIn(List<BigDecimal> values) {
            addCriterion("SHIYONGFEIYONG in", values, "shiyongfeiyong");
            return (Criteria) this;
        }

        public Criteria andShiyongfeiyongNotIn(List<BigDecimal> values) {
            addCriterion("SHIYONGFEIYONG not in", values, "shiyongfeiyong");
            return (Criteria) this;
        }

        public Criteria andShiyongfeiyongBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHIYONGFEIYONG between", value1, value2, "shiyongfeiyong");
            return (Criteria) this;
        }

        public Criteria andShiyongfeiyongNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHIYONGFEIYONG not between", value1, value2, "shiyongfeiyong");
            return (Criteria) this;
        }

        public Criteria andChouzifeiyongIsNull() {
            addCriterion("CHOUZIFEIYONG is null");
            return (Criteria) this;
        }

        public Criteria andChouzifeiyongIsNotNull() {
            addCriterion("CHOUZIFEIYONG is not null");
            return (Criteria) this;
        }

        public Criteria andChouzifeiyongEqualTo(BigDecimal value) {
            addCriterion("CHOUZIFEIYONG =", value, "chouzifeiyong");
            return (Criteria) this;
        }

        public Criteria andChouzifeiyongNotEqualTo(BigDecimal value) {
            addCriterion("CHOUZIFEIYONG <>", value, "chouzifeiyong");
            return (Criteria) this;
        }

        public Criteria andChouzifeiyongGreaterThan(BigDecimal value) {
            addCriterion("CHOUZIFEIYONG >", value, "chouzifeiyong");
            return (Criteria) this;
        }

        public Criteria andChouzifeiyongGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHOUZIFEIYONG >=", value, "chouzifeiyong");
            return (Criteria) this;
        }

        public Criteria andChouzifeiyongLessThan(BigDecimal value) {
            addCriterion("CHOUZIFEIYONG <", value, "chouzifeiyong");
            return (Criteria) this;
        }

        public Criteria andChouzifeiyongLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHOUZIFEIYONG <=", value, "chouzifeiyong");
            return (Criteria) this;
        }

        public Criteria andChouzifeiyongIn(List<BigDecimal> values) {
            addCriterion("CHOUZIFEIYONG in", values, "chouzifeiyong");
            return (Criteria) this;
        }

        public Criteria andChouzifeiyongNotIn(List<BigDecimal> values) {
            addCriterion("CHOUZIFEIYONG not in", values, "chouzifeiyong");
            return (Criteria) this;
        }

        public Criteria andChouzifeiyongBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHOUZIFEIYONG between", value1, value2, "chouzifeiyong");
            return (Criteria) this;
        }

        public Criteria andChouzifeiyongNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHOUZIFEIYONG not between", value1, value2, "chouzifeiyong");
            return (Criteria) this;
        }

        public Criteria andQitafeiyongIsNull() {
            addCriterion("QITAFEIYONG is null");
            return (Criteria) this;
        }

        public Criteria andQitafeiyongIsNotNull() {
            addCriterion("QITAFEIYONG is not null");
            return (Criteria) this;
        }

        public Criteria andQitafeiyongEqualTo(BigDecimal value) {
            addCriterion("QITAFEIYONG =", value, "qitafeiyong");
            return (Criteria) this;
        }

        public Criteria andQitafeiyongNotEqualTo(BigDecimal value) {
            addCriterion("QITAFEIYONG <>", value, "qitafeiyong");
            return (Criteria) this;
        }

        public Criteria andQitafeiyongGreaterThan(BigDecimal value) {
            addCriterion("QITAFEIYONG >", value, "qitafeiyong");
            return (Criteria) this;
        }

        public Criteria andQitafeiyongGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QITAFEIYONG >=", value, "qitafeiyong");
            return (Criteria) this;
        }

        public Criteria andQitafeiyongLessThan(BigDecimal value) {
            addCriterion("QITAFEIYONG <", value, "qitafeiyong");
            return (Criteria) this;
        }

        public Criteria andQitafeiyongLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QITAFEIYONG <=", value, "qitafeiyong");
            return (Criteria) this;
        }

        public Criteria andQitafeiyongIn(List<BigDecimal> values) {
            addCriterion("QITAFEIYONG in", values, "qitafeiyong");
            return (Criteria) this;
        }

        public Criteria andQitafeiyongNotIn(List<BigDecimal> values) {
            addCriterion("QITAFEIYONG not in", values, "qitafeiyong");
            return (Criteria) this;
        }

        public Criteria andQitafeiyongBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QITAFEIYONG between", value1, value2, "qitafeiyong");
            return (Criteria) this;
        }

        public Criteria andQitafeiyongNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QITAFEIYONG not between", value1, value2, "qitafeiyong");
            return (Criteria) this;
        }

        public Criteria andZongjiIsNull() {
            addCriterion("ZONGJI is null");
            return (Criteria) this;
        }

        public Criteria andZongjiIsNotNull() {
            addCriterion("ZONGJI is not null");
            return (Criteria) this;
        }

        public Criteria andZongjiEqualTo(BigDecimal value) {
            addCriterion("ZONGJI =", value, "zongji");
            return (Criteria) this;
        }

        public Criteria andZongjiNotEqualTo(BigDecimal value) {
            addCriterion("ZONGJI <>", value, "zongji");
            return (Criteria) this;
        }

        public Criteria andZongjiGreaterThan(BigDecimal value) {
            addCriterion("ZONGJI >", value, "zongji");
            return (Criteria) this;
        }

        public Criteria andZongjiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZONGJI >=", value, "zongji");
            return (Criteria) this;
        }

        public Criteria andZongjiLessThan(BigDecimal value) {
            addCriterion("ZONGJI <", value, "zongji");
            return (Criteria) this;
        }

        public Criteria andZongjiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZONGJI <=", value, "zongji");
            return (Criteria) this;
        }

        public Criteria andZongjiIn(List<BigDecimal> values) {
            addCriterion("ZONGJI in", values, "zongji");
            return (Criteria) this;
        }

        public Criteria andZongjiNotIn(List<BigDecimal> values) {
            addCriterion("ZONGJI not in", values, "zongji");
            return (Criteria) this;
        }

        public Criteria andZongjiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZONGJI between", value1, value2, "zongji");
            return (Criteria) this;
        }

        public Criteria andZongjiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZONGJI not between", value1, value2, "zongji");
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