package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JjhnjReport4Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JjhnjReport4Example() {
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

        public Criteria andBianzhidanweiIsNull() {
            addCriterion("BIANZHIDANWEI is null");
            return (Criteria) this;
        }

        public Criteria andBianzhidanweiIsNotNull() {
            addCriterion("BIANZHIDANWEI is not null");
            return (Criteria) this;
        }

        public Criteria andBianzhidanweiEqualTo(String value) {
            addCriterion("BIANZHIDANWEI =", value, "bianzhidanwei");
            return (Criteria) this;
        }

        public Criteria andBianzhidanweiNotEqualTo(String value) {
            addCriterion("BIANZHIDANWEI <>", value, "bianzhidanwei");
            return (Criteria) this;
        }

        public Criteria andBianzhidanweiGreaterThan(String value) {
            addCriterion("BIANZHIDANWEI >", value, "bianzhidanwei");
            return (Criteria) this;
        }

        public Criteria andBianzhidanweiGreaterThanOrEqualTo(String value) {
            addCriterion("BIANZHIDANWEI >=", value, "bianzhidanwei");
            return (Criteria) this;
        }

        public Criteria andBianzhidanweiLessThan(String value) {
            addCriterion("BIANZHIDANWEI <", value, "bianzhidanwei");
            return (Criteria) this;
        }

        public Criteria andBianzhidanweiLessThanOrEqualTo(String value) {
            addCriterion("BIANZHIDANWEI <=", value, "bianzhidanwei");
            return (Criteria) this;
        }

        public Criteria andBianzhidanweiLike(String value) {
            addCriterion("BIANZHIDANWEI like", value, "bianzhidanwei");
            return (Criteria) this;
        }

        public Criteria andBianzhidanweiNotLike(String value) {
            addCriterion("BIANZHIDANWEI not like", value, "bianzhidanwei");
            return (Criteria) this;
        }

        public Criteria andBianzhidanweiIn(List<String> values) {
            addCriterion("BIANZHIDANWEI in", values, "bianzhidanwei");
            return (Criteria) this;
        }

        public Criteria andBianzhidanweiNotIn(List<String> values) {
            addCriterion("BIANZHIDANWEI not in", values, "bianzhidanwei");
            return (Criteria) this;
        }

        public Criteria andBianzhidanweiBetween(String value1, String value2) {
            addCriterion("BIANZHIDANWEI between", value1, value2, "bianzhidanwei");
            return (Criteria) this;
        }

        public Criteria andBianzhidanweiNotBetween(String value1, String value2) {
            addCriterion("BIANZHIDANWEI not between", value1, value2, "bianzhidanwei");
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

        public Criteria andMojuanfeixianIsNull() {
            addCriterion("MOJUANFEIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andMojuanfeixianIsNotNull() {
            addCriterion("MOJUANFEIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andMojuanfeixianEqualTo(BigDecimal value) {
            addCriterion("MOJUANFEIXIAN =", value, "mojuanfeixian");
            return (Criteria) this;
        }

        public Criteria andMojuanfeixianNotEqualTo(BigDecimal value) {
            addCriterion("MOJUANFEIXIAN <>", value, "mojuanfeixian");
            return (Criteria) this;
        }

        public Criteria andMojuanfeixianGreaterThan(BigDecimal value) {
            addCriterion("MOJUANFEIXIAN >", value, "mojuanfeixian");
            return (Criteria) this;
        }

        public Criteria andMojuanfeixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOJUANFEIXIAN >=", value, "mojuanfeixian");
            return (Criteria) this;
        }

        public Criteria andMojuanfeixianLessThan(BigDecimal value) {
            addCriterion("MOJUANFEIXIAN <", value, "mojuanfeixian");
            return (Criteria) this;
        }

        public Criteria andMojuanfeixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOJUANFEIXIAN <=", value, "mojuanfeixian");
            return (Criteria) this;
        }

        public Criteria andMojuanfeixianIn(List<BigDecimal> values) {
            addCriterion("MOJUANFEIXIAN in", values, "mojuanfeixian");
            return (Criteria) this;
        }

        public Criteria andMojuanfeixianNotIn(List<BigDecimal> values) {
            addCriterion("MOJUANFEIXIAN not in", values, "mojuanfeixian");
            return (Criteria) this;
        }

        public Criteria andMojuanfeixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOJUANFEIXIAN between", value1, value2, "mojuanfeixian");
            return (Criteria) this;
        }

        public Criteria andMojuanfeixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOJUANFEIXIAN not between", value1, value2, "mojuanfeixian");
            return (Criteria) this;
        }

        public Criteria andMojuanxianIsNull() {
            addCriterion("MOJUANXIAN is null");
            return (Criteria) this;
        }

        public Criteria andMojuanxianIsNotNull() {
            addCriterion("MOJUANXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andMojuanxianEqualTo(BigDecimal value) {
            addCriterion("MOJUANXIAN =", value, "mojuanxian");
            return (Criteria) this;
        }

        public Criteria andMojuanxianNotEqualTo(BigDecimal value) {
            addCriterion("MOJUANXIAN <>", value, "mojuanxian");
            return (Criteria) this;
        }

        public Criteria andMojuanxianGreaterThan(BigDecimal value) {
            addCriterion("MOJUANXIAN >", value, "mojuanxian");
            return (Criteria) this;
        }

        public Criteria andMojuanxianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOJUANXIAN >=", value, "mojuanxian");
            return (Criteria) this;
        }

        public Criteria andMojuanxianLessThan(BigDecimal value) {
            addCriterion("MOJUANXIAN <", value, "mojuanxian");
            return (Criteria) this;
        }

        public Criteria andMojuanxianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOJUANXIAN <=", value, "mojuanxian");
            return (Criteria) this;
        }

        public Criteria andMojuanxianIn(List<BigDecimal> values) {
            addCriterion("MOJUANXIAN in", values, "mojuanxian");
            return (Criteria) this;
        }

        public Criteria andMojuanxianNotIn(List<BigDecimal> values) {
            addCriterion("MOJUANXIAN not in", values, "mojuanxian");
            return (Criteria) this;
        }

        public Criteria andMojuanxianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOJUANXIAN between", value1, value2, "mojuanxian");
            return (Criteria) this;
        }

        public Criteria andMojuanxianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOJUANXIAN not between", value1, value2, "mojuanxian");
            return (Criteria) this;
        }

        public Criteria andMojuanhejiIsNull() {
            addCriterion("MOJUANHEJI is null");
            return (Criteria) this;
        }

        public Criteria andMojuanhejiIsNotNull() {
            addCriterion("MOJUANHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andMojuanhejiEqualTo(BigDecimal value) {
            addCriterion("MOJUANHEJI =", value, "mojuanheji");
            return (Criteria) this;
        }

        public Criteria andMojuanhejiNotEqualTo(BigDecimal value) {
            addCriterion("MOJUANHEJI <>", value, "mojuanheji");
            return (Criteria) this;
        }

        public Criteria andMojuanhejiGreaterThan(BigDecimal value) {
            addCriterion("MOJUANHEJI >", value, "mojuanheji");
            return (Criteria) this;
        }

        public Criteria andMojuanhejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOJUANHEJI >=", value, "mojuanheji");
            return (Criteria) this;
        }

        public Criteria andMojuanhejiLessThan(BigDecimal value) {
            addCriterion("MOJUANHEJI <", value, "mojuanheji");
            return (Criteria) this;
        }

        public Criteria andMojuanhejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOJUANHEJI <=", value, "mojuanheji");
            return (Criteria) this;
        }

        public Criteria andMojuanhejiIn(List<BigDecimal> values) {
            addCriterion("MOJUANHEJI in", values, "mojuanheji");
            return (Criteria) this;
        }

        public Criteria andMojuanhejiNotIn(List<BigDecimal> values) {
            addCriterion("MOJUANHEJI not in", values, "mojuanheji");
            return (Criteria) this;
        }

        public Criteria andMojuanhejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOJUANHEJI between", value1, value2, "mojuanheji");
            return (Criteria) this;
        }

        public Criteria andMojuanhejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOJUANHEJI not between", value1, value2, "mojuanheji");
            return (Criteria) this;
        }

        public Criteria andLeijijuanfeixianIsNull() {
            addCriterion("LEIJIJUANFEIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijijuanfeixianIsNotNull() {
            addCriterion("LEIJIJUANFEIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijijuanfeixianEqualTo(BigDecimal value) {
            addCriterion("LEIJIJUANFEIXIAN =", value, "leijijuanfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijijuanfeixianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIJUANFEIXIAN <>", value, "leijijuanfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijijuanfeixianGreaterThan(BigDecimal value) {
            addCriterion("LEIJIJUANFEIXIAN >", value, "leijijuanfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijijuanfeixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIJUANFEIXIAN >=", value, "leijijuanfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijijuanfeixianLessThan(BigDecimal value) {
            addCriterion("LEIJIJUANFEIXIAN <", value, "leijijuanfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijijuanfeixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIJUANFEIXIAN <=", value, "leijijuanfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijijuanfeixianIn(List<BigDecimal> values) {
            addCriterion("LEIJIJUANFEIXIAN in", values, "leijijuanfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijijuanfeixianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIJUANFEIXIAN not in", values, "leijijuanfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijijuanfeixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIJUANFEIXIAN between", value1, value2, "leijijuanfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijijuanfeixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIJUANFEIXIAN not between", value1, value2, "leijijuanfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijijuanxianIsNull() {
            addCriterion("LEIJIJUANXIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijijuanxianIsNotNull() {
            addCriterion("LEIJIJUANXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijijuanxianEqualTo(BigDecimal value) {
            addCriterion("LEIJIJUANXIAN =", value, "leijijuanxian");
            return (Criteria) this;
        }

        public Criteria andLeijijuanxianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIJUANXIAN <>", value, "leijijuanxian");
            return (Criteria) this;
        }

        public Criteria andLeijijuanxianGreaterThan(BigDecimal value) {
            addCriterion("LEIJIJUANXIAN >", value, "leijijuanxian");
            return (Criteria) this;
        }

        public Criteria andLeijijuanxianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIJUANXIAN >=", value, "leijijuanxian");
            return (Criteria) this;
        }

        public Criteria andLeijijuanxianLessThan(BigDecimal value) {
            addCriterion("LEIJIJUANXIAN <", value, "leijijuanxian");
            return (Criteria) this;
        }

        public Criteria andLeijijuanxianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIJUANXIAN <=", value, "leijijuanxian");
            return (Criteria) this;
        }

        public Criteria andLeijijuanxianIn(List<BigDecimal> values) {
            addCriterion("LEIJIJUANXIAN in", values, "leijijuanxian");
            return (Criteria) this;
        }

        public Criteria andLeijijuanxianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIJUANXIAN not in", values, "leijijuanxian");
            return (Criteria) this;
        }

        public Criteria andLeijijuanxianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIJUANXIAN between", value1, value2, "leijijuanxian");
            return (Criteria) this;
        }

        public Criteria andLeijijuanxianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIJUANXIAN not between", value1, value2, "leijijuanxian");
            return (Criteria) this;
        }

        public Criteria andLeijijuanhejiIsNull() {
            addCriterion("LEIJIJUANHEJI is null");
            return (Criteria) this;
        }

        public Criteria andLeijijuanhejiIsNotNull() {
            addCriterion("LEIJIJUANHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andLeijijuanhejiEqualTo(BigDecimal value) {
            addCriterion("LEIJIJUANHEJI =", value, "leijijuanheji");
            return (Criteria) this;
        }

        public Criteria andLeijijuanhejiNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIJUANHEJI <>", value, "leijijuanheji");
            return (Criteria) this;
        }

        public Criteria andLeijijuanhejiGreaterThan(BigDecimal value) {
            addCriterion("LEIJIJUANHEJI >", value, "leijijuanheji");
            return (Criteria) this;
        }

        public Criteria andLeijijuanhejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIJUANHEJI >=", value, "leijijuanheji");
            return (Criteria) this;
        }

        public Criteria andLeijijuanhejiLessThan(BigDecimal value) {
            addCriterion("LEIJIJUANHEJI <", value, "leijijuanheji");
            return (Criteria) this;
        }

        public Criteria andLeijijuanhejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIJUANHEJI <=", value, "leijijuanheji");
            return (Criteria) this;
        }

        public Criteria andLeijijuanhejiIn(List<BigDecimal> values) {
            addCriterion("LEIJIJUANHEJI in", values, "leijijuanheji");
            return (Criteria) this;
        }

        public Criteria andLeijijuanhejiNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIJUANHEJI not in", values, "leijijuanheji");
            return (Criteria) this;
        }

        public Criteria andLeijijuanhejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIJUANHEJI between", value1, value2, "leijijuanheji");
            return (Criteria) this;
        }

        public Criteria andLeijijuanhejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIJUANHEJI not between", value1, value2, "leijijuanheji");
            return (Criteria) this;
        }

        public Criteria andMohuifeixianIsNull() {
            addCriterion("MOHUIFEIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andMohuifeixianIsNotNull() {
            addCriterion("MOHUIFEIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andMohuifeixianEqualTo(BigDecimal value) {
            addCriterion("MOHUIFEIXIAN =", value, "mohuifeixian");
            return (Criteria) this;
        }

        public Criteria andMohuifeixianNotEqualTo(BigDecimal value) {
            addCriterion("MOHUIFEIXIAN <>", value, "mohuifeixian");
            return (Criteria) this;
        }

        public Criteria andMohuifeixianGreaterThan(BigDecimal value) {
            addCriterion("MOHUIFEIXIAN >", value, "mohuifeixian");
            return (Criteria) this;
        }

        public Criteria andMohuifeixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOHUIFEIXIAN >=", value, "mohuifeixian");
            return (Criteria) this;
        }

        public Criteria andMohuifeixianLessThan(BigDecimal value) {
            addCriterion("MOHUIFEIXIAN <", value, "mohuifeixian");
            return (Criteria) this;
        }

        public Criteria andMohuifeixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOHUIFEIXIAN <=", value, "mohuifeixian");
            return (Criteria) this;
        }

        public Criteria andMohuifeixianIn(List<BigDecimal> values) {
            addCriterion("MOHUIFEIXIAN in", values, "mohuifeixian");
            return (Criteria) this;
        }

        public Criteria andMohuifeixianNotIn(List<BigDecimal> values) {
            addCriterion("MOHUIFEIXIAN not in", values, "mohuifeixian");
            return (Criteria) this;
        }

        public Criteria andMohuifeixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOHUIFEIXIAN between", value1, value2, "mohuifeixian");
            return (Criteria) this;
        }

        public Criteria andMohuifeixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOHUIFEIXIAN not between", value1, value2, "mohuifeixian");
            return (Criteria) this;
        }

        public Criteria andMohuixianIsNull() {
            addCriterion("MOHUIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andMohuixianIsNotNull() {
            addCriterion("MOHUIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andMohuixianEqualTo(BigDecimal value) {
            addCriterion("MOHUIXIAN =", value, "mohuixian");
            return (Criteria) this;
        }

        public Criteria andMohuixianNotEqualTo(BigDecimal value) {
            addCriterion("MOHUIXIAN <>", value, "mohuixian");
            return (Criteria) this;
        }

        public Criteria andMohuixianGreaterThan(BigDecimal value) {
            addCriterion("MOHUIXIAN >", value, "mohuixian");
            return (Criteria) this;
        }

        public Criteria andMohuixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOHUIXIAN >=", value, "mohuixian");
            return (Criteria) this;
        }

        public Criteria andMohuixianLessThan(BigDecimal value) {
            addCriterion("MOHUIXIAN <", value, "mohuixian");
            return (Criteria) this;
        }

        public Criteria andMohuixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOHUIXIAN <=", value, "mohuixian");
            return (Criteria) this;
        }

        public Criteria andMohuixianIn(List<BigDecimal> values) {
            addCriterion("MOHUIXIAN in", values, "mohuixian");
            return (Criteria) this;
        }

        public Criteria andMohuixianNotIn(List<BigDecimal> values) {
            addCriterion("MOHUIXIAN not in", values, "mohuixian");
            return (Criteria) this;
        }

        public Criteria andMohuixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOHUIXIAN between", value1, value2, "mohuixian");
            return (Criteria) this;
        }

        public Criteria andMohuixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOHUIXIAN not between", value1, value2, "mohuixian");
            return (Criteria) this;
        }

        public Criteria andMohuihejiIsNull() {
            addCriterion("MOHUIHEJI is null");
            return (Criteria) this;
        }

        public Criteria andMohuihejiIsNotNull() {
            addCriterion("MOHUIHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andMohuihejiEqualTo(BigDecimal value) {
            addCriterion("MOHUIHEJI =", value, "mohuiheji");
            return (Criteria) this;
        }

        public Criteria andMohuihejiNotEqualTo(BigDecimal value) {
            addCriterion("MOHUIHEJI <>", value, "mohuiheji");
            return (Criteria) this;
        }

        public Criteria andMohuihejiGreaterThan(BigDecimal value) {
            addCriterion("MOHUIHEJI >", value, "mohuiheji");
            return (Criteria) this;
        }

        public Criteria andMohuihejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOHUIHEJI >=", value, "mohuiheji");
            return (Criteria) this;
        }

        public Criteria andMohuihejiLessThan(BigDecimal value) {
            addCriterion("MOHUIHEJI <", value, "mohuiheji");
            return (Criteria) this;
        }

        public Criteria andMohuihejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOHUIHEJI <=", value, "mohuiheji");
            return (Criteria) this;
        }

        public Criteria andMohuihejiIn(List<BigDecimal> values) {
            addCriterion("MOHUIHEJI in", values, "mohuiheji");
            return (Criteria) this;
        }

        public Criteria andMohuihejiNotIn(List<BigDecimal> values) {
            addCriterion("MOHUIHEJI not in", values, "mohuiheji");
            return (Criteria) this;
        }

        public Criteria andMohuihejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOHUIHEJI between", value1, value2, "mohuiheji");
            return (Criteria) this;
        }

        public Criteria andMohuihejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOHUIHEJI not between", value1, value2, "mohuiheji");
            return (Criteria) this;
        }

        public Criteria andLeijihuifeixianIsNull() {
            addCriterion("LEIJIHUIFEIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijihuifeixianIsNotNull() {
            addCriterion("LEIJIHUIFEIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijihuifeixianEqualTo(BigDecimal value) {
            addCriterion("LEIJIHUIFEIXIAN =", value, "leijihuifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijihuifeixianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIHUIFEIXIAN <>", value, "leijihuifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijihuifeixianGreaterThan(BigDecimal value) {
            addCriterion("LEIJIHUIFEIXIAN >", value, "leijihuifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijihuifeixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIHUIFEIXIAN >=", value, "leijihuifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijihuifeixianLessThan(BigDecimal value) {
            addCriterion("LEIJIHUIFEIXIAN <", value, "leijihuifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijihuifeixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIHUIFEIXIAN <=", value, "leijihuifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijihuifeixianIn(List<BigDecimal> values) {
            addCriterion("LEIJIHUIFEIXIAN in", values, "leijihuifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijihuifeixianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIHUIFEIXIAN not in", values, "leijihuifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijihuifeixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIHUIFEIXIAN between", value1, value2, "leijihuifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijihuifeixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIHUIFEIXIAN not between", value1, value2, "leijihuifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijihuixianIsNull() {
            addCriterion("LEIJIHUIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijihuixianIsNotNull() {
            addCriterion("LEIJIHUIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijihuixianEqualTo(BigDecimal value) {
            addCriterion("LEIJIHUIXIAN =", value, "leijihuixian");
            return (Criteria) this;
        }

        public Criteria andLeijihuixianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIHUIXIAN <>", value, "leijihuixian");
            return (Criteria) this;
        }

        public Criteria andLeijihuixianGreaterThan(BigDecimal value) {
            addCriterion("LEIJIHUIXIAN >", value, "leijihuixian");
            return (Criteria) this;
        }

        public Criteria andLeijihuixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIHUIXIAN >=", value, "leijihuixian");
            return (Criteria) this;
        }

        public Criteria andLeijihuixianLessThan(BigDecimal value) {
            addCriterion("LEIJIHUIXIAN <", value, "leijihuixian");
            return (Criteria) this;
        }

        public Criteria andLeijihuixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIHUIXIAN <=", value, "leijihuixian");
            return (Criteria) this;
        }

        public Criteria andLeijihuixianIn(List<BigDecimal> values) {
            addCriterion("LEIJIHUIXIAN in", values, "leijihuixian");
            return (Criteria) this;
        }

        public Criteria andLeijihuixianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIHUIXIAN not in", values, "leijihuixian");
            return (Criteria) this;
        }

        public Criteria andLeijihuixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIHUIXIAN between", value1, value2, "leijihuixian");
            return (Criteria) this;
        }

        public Criteria andLeijihuixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIHUIXIAN not between", value1, value2, "leijihuixian");
            return (Criteria) this;
        }

        public Criteria andLeijihuihejiIsNull() {
            addCriterion("LEIJIHUIHEJI is null");
            return (Criteria) this;
        }

        public Criteria andLeijihuihejiIsNotNull() {
            addCriterion("LEIJIHUIHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andLeijihuihejiEqualTo(BigDecimal value) {
            addCriterion("LEIJIHUIHEJI =", value, "leijihuiheji");
            return (Criteria) this;
        }

        public Criteria andLeijihuihejiNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIHUIHEJI <>", value, "leijihuiheji");
            return (Criteria) this;
        }

        public Criteria andLeijihuihejiGreaterThan(BigDecimal value) {
            addCriterion("LEIJIHUIHEJI >", value, "leijihuiheji");
            return (Criteria) this;
        }

        public Criteria andLeijihuihejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIHUIHEJI >=", value, "leijihuiheji");
            return (Criteria) this;
        }

        public Criteria andLeijihuihejiLessThan(BigDecimal value) {
            addCriterion("LEIJIHUIHEJI <", value, "leijihuiheji");
            return (Criteria) this;
        }

        public Criteria andLeijihuihejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIHUIHEJI <=", value, "leijihuiheji");
            return (Criteria) this;
        }

        public Criteria andLeijihuihejiIn(List<BigDecimal> values) {
            addCriterion("LEIJIHUIHEJI in", values, "leijihuiheji");
            return (Criteria) this;
        }

        public Criteria andLeijihuihejiNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIHUIHEJI not in", values, "leijihuiheji");
            return (Criteria) this;
        }

        public Criteria andLeijihuihejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIHUIHEJI between", value1, value2, "leijihuiheji");
            return (Criteria) this;
        }

        public Criteria andLeijihuihejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIHUIHEJI not between", value1, value2, "leijihuiheji");
            return (Criteria) this;
        }

        public Criteria andMofuwufeixianIsNull() {
            addCriterion("MOFUWUFEIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andMofuwufeixianIsNotNull() {
            addCriterion("MOFUWUFEIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andMofuwufeixianEqualTo(BigDecimal value) {
            addCriterion("MOFUWUFEIXIAN =", value, "mofuwufeixian");
            return (Criteria) this;
        }

        public Criteria andMofuwufeixianNotEqualTo(BigDecimal value) {
            addCriterion("MOFUWUFEIXIAN <>", value, "mofuwufeixian");
            return (Criteria) this;
        }

        public Criteria andMofuwufeixianGreaterThan(BigDecimal value) {
            addCriterion("MOFUWUFEIXIAN >", value, "mofuwufeixian");
            return (Criteria) this;
        }

        public Criteria andMofuwufeixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOFUWUFEIXIAN >=", value, "mofuwufeixian");
            return (Criteria) this;
        }

        public Criteria andMofuwufeixianLessThan(BigDecimal value) {
            addCriterion("MOFUWUFEIXIAN <", value, "mofuwufeixian");
            return (Criteria) this;
        }

        public Criteria andMofuwufeixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOFUWUFEIXIAN <=", value, "mofuwufeixian");
            return (Criteria) this;
        }

        public Criteria andMofuwufeixianIn(List<BigDecimal> values) {
            addCriterion("MOFUWUFEIXIAN in", values, "mofuwufeixian");
            return (Criteria) this;
        }

        public Criteria andMofuwufeixianNotIn(List<BigDecimal> values) {
            addCriterion("MOFUWUFEIXIAN not in", values, "mofuwufeixian");
            return (Criteria) this;
        }

        public Criteria andMofuwufeixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOFUWUFEIXIAN between", value1, value2, "mofuwufeixian");
            return (Criteria) this;
        }

        public Criteria andMofuwufeixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOFUWUFEIXIAN not between", value1, value2, "mofuwufeixian");
            return (Criteria) this;
        }

        public Criteria andMofuwuxianIsNull() {
            addCriterion("MOFUWUXIAN is null");
            return (Criteria) this;
        }

        public Criteria andMofuwuxianIsNotNull() {
            addCriterion("MOFUWUXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andMofuwuxianEqualTo(BigDecimal value) {
            addCriterion("MOFUWUXIAN =", value, "mofuwuxian");
            return (Criteria) this;
        }

        public Criteria andMofuwuxianNotEqualTo(BigDecimal value) {
            addCriterion("MOFUWUXIAN <>", value, "mofuwuxian");
            return (Criteria) this;
        }

        public Criteria andMofuwuxianGreaterThan(BigDecimal value) {
            addCriterion("MOFUWUXIAN >", value, "mofuwuxian");
            return (Criteria) this;
        }

        public Criteria andMofuwuxianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOFUWUXIAN >=", value, "mofuwuxian");
            return (Criteria) this;
        }

        public Criteria andMofuwuxianLessThan(BigDecimal value) {
            addCriterion("MOFUWUXIAN <", value, "mofuwuxian");
            return (Criteria) this;
        }

        public Criteria andMofuwuxianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOFUWUXIAN <=", value, "mofuwuxian");
            return (Criteria) this;
        }

        public Criteria andMofuwuxianIn(List<BigDecimal> values) {
            addCriterion("MOFUWUXIAN in", values, "mofuwuxian");
            return (Criteria) this;
        }

        public Criteria andMofuwuxianNotIn(List<BigDecimal> values) {
            addCriterion("MOFUWUXIAN not in", values, "mofuwuxian");
            return (Criteria) this;
        }

        public Criteria andMofuwuxianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOFUWUXIAN between", value1, value2, "mofuwuxian");
            return (Criteria) this;
        }

        public Criteria andMofuwuxianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOFUWUXIAN not between", value1, value2, "mofuwuxian");
            return (Criteria) this;
        }

        public Criteria andMofuwuhejiIsNull() {
            addCriterion("MOFUWUHEJI is null");
            return (Criteria) this;
        }

        public Criteria andMofuwuhejiIsNotNull() {
            addCriterion("MOFUWUHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andMofuwuhejiEqualTo(BigDecimal value) {
            addCriterion("MOFUWUHEJI =", value, "mofuwuheji");
            return (Criteria) this;
        }

        public Criteria andMofuwuhejiNotEqualTo(BigDecimal value) {
            addCriterion("MOFUWUHEJI <>", value, "mofuwuheji");
            return (Criteria) this;
        }

        public Criteria andMofuwuhejiGreaterThan(BigDecimal value) {
            addCriterion("MOFUWUHEJI >", value, "mofuwuheji");
            return (Criteria) this;
        }

        public Criteria andMofuwuhejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOFUWUHEJI >=", value, "mofuwuheji");
            return (Criteria) this;
        }

        public Criteria andMofuwuhejiLessThan(BigDecimal value) {
            addCriterion("MOFUWUHEJI <", value, "mofuwuheji");
            return (Criteria) this;
        }

        public Criteria andMofuwuhejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOFUWUHEJI <=", value, "mofuwuheji");
            return (Criteria) this;
        }

        public Criteria andMofuwuhejiIn(List<BigDecimal> values) {
            addCriterion("MOFUWUHEJI in", values, "mofuwuheji");
            return (Criteria) this;
        }

        public Criteria andMofuwuhejiNotIn(List<BigDecimal> values) {
            addCriterion("MOFUWUHEJI not in", values, "mofuwuheji");
            return (Criteria) this;
        }

        public Criteria andMofuwuhejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOFUWUHEJI between", value1, value2, "mofuwuheji");
            return (Criteria) this;
        }

        public Criteria andMofuwuhejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOFUWUHEJI not between", value1, value2, "mofuwuheji");
            return (Criteria) this;
        }

        public Criteria andLeijifuwufeixianIsNull() {
            addCriterion("LEIJIFUWUFEIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijifuwufeixianIsNotNull() {
            addCriterion("LEIJIFUWUFEIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijifuwufeixianEqualTo(BigDecimal value) {
            addCriterion("LEIJIFUWUFEIXIAN =", value, "leijifuwufeixian");
            return (Criteria) this;
        }

        public Criteria andLeijifuwufeixianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIFUWUFEIXIAN <>", value, "leijifuwufeixian");
            return (Criteria) this;
        }

        public Criteria andLeijifuwufeixianGreaterThan(BigDecimal value) {
            addCriterion("LEIJIFUWUFEIXIAN >", value, "leijifuwufeixian");
            return (Criteria) this;
        }

        public Criteria andLeijifuwufeixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIFUWUFEIXIAN >=", value, "leijifuwufeixian");
            return (Criteria) this;
        }

        public Criteria andLeijifuwufeixianLessThan(BigDecimal value) {
            addCriterion("LEIJIFUWUFEIXIAN <", value, "leijifuwufeixian");
            return (Criteria) this;
        }

        public Criteria andLeijifuwufeixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIFUWUFEIXIAN <=", value, "leijifuwufeixian");
            return (Criteria) this;
        }

        public Criteria andLeijifuwufeixianIn(List<BigDecimal> values) {
            addCriterion("LEIJIFUWUFEIXIAN in", values, "leijifuwufeixian");
            return (Criteria) this;
        }

        public Criteria andLeijifuwufeixianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIFUWUFEIXIAN not in", values, "leijifuwufeixian");
            return (Criteria) this;
        }

        public Criteria andLeijifuwufeixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIFUWUFEIXIAN between", value1, value2, "leijifuwufeixian");
            return (Criteria) this;
        }

        public Criteria andLeijifuwufeixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIFUWUFEIXIAN not between", value1, value2, "leijifuwufeixian");
            return (Criteria) this;
        }

        public Criteria andLeijifuwuxianIsNull() {
            addCriterion("LEIJIFUWUXIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijifuwuxianIsNotNull() {
            addCriterion("LEIJIFUWUXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijifuwuxianEqualTo(BigDecimal value) {
            addCriterion("LEIJIFUWUXIAN =", value, "leijifuwuxian");
            return (Criteria) this;
        }

        public Criteria andLeijifuwuxianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIFUWUXIAN <>", value, "leijifuwuxian");
            return (Criteria) this;
        }

        public Criteria andLeijifuwuxianGreaterThan(BigDecimal value) {
            addCriterion("LEIJIFUWUXIAN >", value, "leijifuwuxian");
            return (Criteria) this;
        }

        public Criteria andLeijifuwuxianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIFUWUXIAN >=", value, "leijifuwuxian");
            return (Criteria) this;
        }

        public Criteria andLeijifuwuxianLessThan(BigDecimal value) {
            addCriterion("LEIJIFUWUXIAN <", value, "leijifuwuxian");
            return (Criteria) this;
        }

        public Criteria andLeijifuwuxianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIFUWUXIAN <=", value, "leijifuwuxian");
            return (Criteria) this;
        }

        public Criteria andLeijifuwuxianIn(List<BigDecimal> values) {
            addCriterion("LEIJIFUWUXIAN in", values, "leijifuwuxian");
            return (Criteria) this;
        }

        public Criteria andLeijifuwuxianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIFUWUXIAN not in", values, "leijifuwuxian");
            return (Criteria) this;
        }

        public Criteria andLeijifuwuxianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIFUWUXIAN between", value1, value2, "leijifuwuxian");
            return (Criteria) this;
        }

        public Criteria andLeijifuwuxianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIFUWUXIAN not between", value1, value2, "leijifuwuxian");
            return (Criteria) this;
        }

        public Criteria andLeijifuwuhejiIsNull() {
            addCriterion("LEIJIFUWUHEJI is null");
            return (Criteria) this;
        }

        public Criteria andLeijifuwuhejiIsNotNull() {
            addCriterion("LEIJIFUWUHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andLeijifuwuhejiEqualTo(BigDecimal value) {
            addCriterion("LEIJIFUWUHEJI =", value, "leijifuwuheji");
            return (Criteria) this;
        }

        public Criteria andLeijifuwuhejiNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIFUWUHEJI <>", value, "leijifuwuheji");
            return (Criteria) this;
        }

        public Criteria andLeijifuwuhejiGreaterThan(BigDecimal value) {
            addCriterion("LEIJIFUWUHEJI >", value, "leijifuwuheji");
            return (Criteria) this;
        }

        public Criteria andLeijifuwuhejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIFUWUHEJI >=", value, "leijifuwuheji");
            return (Criteria) this;
        }

        public Criteria andLeijifuwuhejiLessThan(BigDecimal value) {
            addCriterion("LEIJIFUWUHEJI <", value, "leijifuwuheji");
            return (Criteria) this;
        }

        public Criteria andLeijifuwuhejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIFUWUHEJI <=", value, "leijifuwuheji");
            return (Criteria) this;
        }

        public Criteria andLeijifuwuhejiIn(List<BigDecimal> values) {
            addCriterion("LEIJIFUWUHEJI in", values, "leijifuwuheji");
            return (Criteria) this;
        }

        public Criteria andLeijifuwuhejiNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIFUWUHEJI not in", values, "leijifuwuheji");
            return (Criteria) this;
        }

        public Criteria andLeijifuwuhejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIFUWUHEJI between", value1, value2, "leijifuwuheji");
            return (Criteria) this;
        }

        public Criteria andLeijifuwuhejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIFUWUHEJI not between", value1, value2, "leijifuwuheji");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshoufeixianIsNull() {
            addCriterion("MOXIAOSHOUFEIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshoufeixianIsNotNull() {
            addCriterion("MOXIAOSHOUFEIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshoufeixianEqualTo(BigDecimal value) {
            addCriterion("MOXIAOSHOUFEIXIAN =", value, "moxiaoshoufeixian");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshoufeixianNotEqualTo(BigDecimal value) {
            addCriterion("MOXIAOSHOUFEIXIAN <>", value, "moxiaoshoufeixian");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshoufeixianGreaterThan(BigDecimal value) {
            addCriterion("MOXIAOSHOUFEIXIAN >", value, "moxiaoshoufeixian");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshoufeixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOXIAOSHOUFEIXIAN >=", value, "moxiaoshoufeixian");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshoufeixianLessThan(BigDecimal value) {
            addCriterion("MOXIAOSHOUFEIXIAN <", value, "moxiaoshoufeixian");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshoufeixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOXIAOSHOUFEIXIAN <=", value, "moxiaoshoufeixian");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshoufeixianIn(List<BigDecimal> values) {
            addCriterion("MOXIAOSHOUFEIXIAN in", values, "moxiaoshoufeixian");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshoufeixianNotIn(List<BigDecimal> values) {
            addCriterion("MOXIAOSHOUFEIXIAN not in", values, "moxiaoshoufeixian");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshoufeixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOXIAOSHOUFEIXIAN between", value1, value2, "moxiaoshoufeixian");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshoufeixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOXIAOSHOUFEIXIAN not between", value1, value2, "moxiaoshoufeixian");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshouxianIsNull() {
            addCriterion("MOXIAOSHOUXIAN is null");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshouxianIsNotNull() {
            addCriterion("MOXIAOSHOUXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshouxianEqualTo(BigDecimal value) {
            addCriterion("MOXIAOSHOUXIAN =", value, "moxiaoshouxian");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshouxianNotEqualTo(BigDecimal value) {
            addCriterion("MOXIAOSHOUXIAN <>", value, "moxiaoshouxian");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshouxianGreaterThan(BigDecimal value) {
            addCriterion("MOXIAOSHOUXIAN >", value, "moxiaoshouxian");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshouxianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOXIAOSHOUXIAN >=", value, "moxiaoshouxian");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshouxianLessThan(BigDecimal value) {
            addCriterion("MOXIAOSHOUXIAN <", value, "moxiaoshouxian");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshouxianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOXIAOSHOUXIAN <=", value, "moxiaoshouxian");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshouxianIn(List<BigDecimal> values) {
            addCriterion("MOXIAOSHOUXIAN in", values, "moxiaoshouxian");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshouxianNotIn(List<BigDecimal> values) {
            addCriterion("MOXIAOSHOUXIAN not in", values, "moxiaoshouxian");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshouxianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOXIAOSHOUXIAN between", value1, value2, "moxiaoshouxian");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshouxianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOXIAOSHOUXIAN not between", value1, value2, "moxiaoshouxian");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshouhejiIsNull() {
            addCriterion("MOXIAOSHOUHEJI is null");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshouhejiIsNotNull() {
            addCriterion("MOXIAOSHOUHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshouhejiEqualTo(BigDecimal value) {
            addCriterion("MOXIAOSHOUHEJI =", value, "moxiaoshouheji");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshouhejiNotEqualTo(BigDecimal value) {
            addCriterion("MOXIAOSHOUHEJI <>", value, "moxiaoshouheji");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshouhejiGreaterThan(BigDecimal value) {
            addCriterion("MOXIAOSHOUHEJI >", value, "moxiaoshouheji");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshouhejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOXIAOSHOUHEJI >=", value, "moxiaoshouheji");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshouhejiLessThan(BigDecimal value) {
            addCriterion("MOXIAOSHOUHEJI <", value, "moxiaoshouheji");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshouhejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOXIAOSHOUHEJI <=", value, "moxiaoshouheji");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshouhejiIn(List<BigDecimal> values) {
            addCriterion("MOXIAOSHOUHEJI in", values, "moxiaoshouheji");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshouhejiNotIn(List<BigDecimal> values) {
            addCriterion("MOXIAOSHOUHEJI not in", values, "moxiaoshouheji");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshouhejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOXIAOSHOUHEJI between", value1, value2, "moxiaoshouheji");
            return (Criteria) this;
        }

        public Criteria andMoxiaoshouhejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOXIAOSHOUHEJI not between", value1, value2, "moxiaoshouheji");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshoufeixianIsNull() {
            addCriterion("LEIJIXIAOSHOUFEIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshoufeixianIsNotNull() {
            addCriterion("LEIJIXIAOSHOUFEIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshoufeixianEqualTo(BigDecimal value) {
            addCriterion("LEIJIXIAOSHOUFEIXIAN =", value, "leijixiaoshoufeixian");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshoufeixianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIXIAOSHOUFEIXIAN <>", value, "leijixiaoshoufeixian");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshoufeixianGreaterThan(BigDecimal value) {
            addCriterion("LEIJIXIAOSHOUFEIXIAN >", value, "leijixiaoshoufeixian");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshoufeixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIXIAOSHOUFEIXIAN >=", value, "leijixiaoshoufeixian");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshoufeixianLessThan(BigDecimal value) {
            addCriterion("LEIJIXIAOSHOUFEIXIAN <", value, "leijixiaoshoufeixian");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshoufeixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIXIAOSHOUFEIXIAN <=", value, "leijixiaoshoufeixian");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshoufeixianIn(List<BigDecimal> values) {
            addCriterion("LEIJIXIAOSHOUFEIXIAN in", values, "leijixiaoshoufeixian");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshoufeixianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIXIAOSHOUFEIXIAN not in", values, "leijixiaoshoufeixian");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshoufeixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIXIAOSHOUFEIXIAN between", value1, value2, "leijixiaoshoufeixian");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshoufeixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIXIAOSHOUFEIXIAN not between", value1, value2, "leijixiaoshoufeixian");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshouxianIsNull() {
            addCriterion("LEIJIXIAOSHOUXIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshouxianIsNotNull() {
            addCriterion("LEIJIXIAOSHOUXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshouxianEqualTo(BigDecimal value) {
            addCriterion("LEIJIXIAOSHOUXIAN =", value, "leijixiaoshouxian");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshouxianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIXIAOSHOUXIAN <>", value, "leijixiaoshouxian");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshouxianGreaterThan(BigDecimal value) {
            addCriterion("LEIJIXIAOSHOUXIAN >", value, "leijixiaoshouxian");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshouxianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIXIAOSHOUXIAN >=", value, "leijixiaoshouxian");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshouxianLessThan(BigDecimal value) {
            addCriterion("LEIJIXIAOSHOUXIAN <", value, "leijixiaoshouxian");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshouxianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIXIAOSHOUXIAN <=", value, "leijixiaoshouxian");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshouxianIn(List<BigDecimal> values) {
            addCriterion("LEIJIXIAOSHOUXIAN in", values, "leijixiaoshouxian");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshouxianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIXIAOSHOUXIAN not in", values, "leijixiaoshouxian");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshouxianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIXIAOSHOUXIAN between", value1, value2, "leijixiaoshouxian");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshouxianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIXIAOSHOUXIAN not between", value1, value2, "leijixiaoshouxian");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshouhejiIsNull() {
            addCriterion("LEIJIXIAOSHOUHEJI is null");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshouhejiIsNotNull() {
            addCriterion("LEIJIXIAOSHOUHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshouhejiEqualTo(BigDecimal value) {
            addCriterion("LEIJIXIAOSHOUHEJI =", value, "leijixiaoshouheji");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshouhejiNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIXIAOSHOUHEJI <>", value, "leijixiaoshouheji");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshouhejiGreaterThan(BigDecimal value) {
            addCriterion("LEIJIXIAOSHOUHEJI >", value, "leijixiaoshouheji");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshouhejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIXIAOSHOUHEJI >=", value, "leijixiaoshouheji");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshouhejiLessThan(BigDecimal value) {
            addCriterion("LEIJIXIAOSHOUHEJI <", value, "leijixiaoshouheji");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshouhejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIXIAOSHOUHEJI <=", value, "leijixiaoshouheji");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshouhejiIn(List<BigDecimal> values) {
            addCriterion("LEIJIXIAOSHOUHEJI in", values, "leijixiaoshouheji");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshouhejiNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIXIAOSHOUHEJI not in", values, "leijixiaoshouheji");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshouhejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIXIAOSHOUHEJI between", value1, value2, "leijixiaoshouheji");
            return (Criteria) this;
        }

        public Criteria andLeijixiaoshouhejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIXIAOSHOUHEJI not between", value1, value2, "leijixiaoshouheji");
            return (Criteria) this;
        }

        public Criteria andMobuzhufeixianIsNull() {
            addCriterion("MOBUZHUFEIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andMobuzhufeixianIsNotNull() {
            addCriterion("MOBUZHUFEIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andMobuzhufeixianEqualTo(BigDecimal value) {
            addCriterion("MOBUZHUFEIXIAN =", value, "mobuzhufeixian");
            return (Criteria) this;
        }

        public Criteria andMobuzhufeixianNotEqualTo(BigDecimal value) {
            addCriterion("MOBUZHUFEIXIAN <>", value, "mobuzhufeixian");
            return (Criteria) this;
        }

        public Criteria andMobuzhufeixianGreaterThan(BigDecimal value) {
            addCriterion("MOBUZHUFEIXIAN >", value, "mobuzhufeixian");
            return (Criteria) this;
        }

        public Criteria andMobuzhufeixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOBUZHUFEIXIAN >=", value, "mobuzhufeixian");
            return (Criteria) this;
        }

        public Criteria andMobuzhufeixianLessThan(BigDecimal value) {
            addCriterion("MOBUZHUFEIXIAN <", value, "mobuzhufeixian");
            return (Criteria) this;
        }

        public Criteria andMobuzhufeixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOBUZHUFEIXIAN <=", value, "mobuzhufeixian");
            return (Criteria) this;
        }

        public Criteria andMobuzhufeixianIn(List<BigDecimal> values) {
            addCriterion("MOBUZHUFEIXIAN in", values, "mobuzhufeixian");
            return (Criteria) this;
        }

        public Criteria andMobuzhufeixianNotIn(List<BigDecimal> values) {
            addCriterion("MOBUZHUFEIXIAN not in", values, "mobuzhufeixian");
            return (Criteria) this;
        }

        public Criteria andMobuzhufeixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOBUZHUFEIXIAN between", value1, value2, "mobuzhufeixian");
            return (Criteria) this;
        }

        public Criteria andMobuzhufeixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOBUZHUFEIXIAN not between", value1, value2, "mobuzhufeixian");
            return (Criteria) this;
        }

        public Criteria andMobuzhuxianIsNull() {
            addCriterion("MOBUZHUXIAN is null");
            return (Criteria) this;
        }

        public Criteria andMobuzhuxianIsNotNull() {
            addCriterion("MOBUZHUXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andMobuzhuxianEqualTo(BigDecimal value) {
            addCriterion("MOBUZHUXIAN =", value, "mobuzhuxian");
            return (Criteria) this;
        }

        public Criteria andMobuzhuxianNotEqualTo(BigDecimal value) {
            addCriterion("MOBUZHUXIAN <>", value, "mobuzhuxian");
            return (Criteria) this;
        }

        public Criteria andMobuzhuxianGreaterThan(BigDecimal value) {
            addCriterion("MOBUZHUXIAN >", value, "mobuzhuxian");
            return (Criteria) this;
        }

        public Criteria andMobuzhuxianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOBUZHUXIAN >=", value, "mobuzhuxian");
            return (Criteria) this;
        }

        public Criteria andMobuzhuxianLessThan(BigDecimal value) {
            addCriterion("MOBUZHUXIAN <", value, "mobuzhuxian");
            return (Criteria) this;
        }

        public Criteria andMobuzhuxianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOBUZHUXIAN <=", value, "mobuzhuxian");
            return (Criteria) this;
        }

        public Criteria andMobuzhuxianIn(List<BigDecimal> values) {
            addCriterion("MOBUZHUXIAN in", values, "mobuzhuxian");
            return (Criteria) this;
        }

        public Criteria andMobuzhuxianNotIn(List<BigDecimal> values) {
            addCriterion("MOBUZHUXIAN not in", values, "mobuzhuxian");
            return (Criteria) this;
        }

        public Criteria andMobuzhuxianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOBUZHUXIAN between", value1, value2, "mobuzhuxian");
            return (Criteria) this;
        }

        public Criteria andMobuzhuxianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOBUZHUXIAN not between", value1, value2, "mobuzhuxian");
            return (Criteria) this;
        }

        public Criteria andMobuzhuhejiIsNull() {
            addCriterion("MOBUZHUHEJI is null");
            return (Criteria) this;
        }

        public Criteria andMobuzhuhejiIsNotNull() {
            addCriterion("MOBUZHUHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andMobuzhuhejiEqualTo(BigDecimal value) {
            addCriterion("MOBUZHUHEJI =", value, "mobuzhuheji");
            return (Criteria) this;
        }

        public Criteria andMobuzhuhejiNotEqualTo(BigDecimal value) {
            addCriterion("MOBUZHUHEJI <>", value, "mobuzhuheji");
            return (Criteria) this;
        }

        public Criteria andMobuzhuhejiGreaterThan(BigDecimal value) {
            addCriterion("MOBUZHUHEJI >", value, "mobuzhuheji");
            return (Criteria) this;
        }

        public Criteria andMobuzhuhejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOBUZHUHEJI >=", value, "mobuzhuheji");
            return (Criteria) this;
        }

        public Criteria andMobuzhuhejiLessThan(BigDecimal value) {
            addCriterion("MOBUZHUHEJI <", value, "mobuzhuheji");
            return (Criteria) this;
        }

        public Criteria andMobuzhuhejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOBUZHUHEJI <=", value, "mobuzhuheji");
            return (Criteria) this;
        }

        public Criteria andMobuzhuhejiIn(List<BigDecimal> values) {
            addCriterion("MOBUZHUHEJI in", values, "mobuzhuheji");
            return (Criteria) this;
        }

        public Criteria andMobuzhuhejiNotIn(List<BigDecimal> values) {
            addCriterion("MOBUZHUHEJI not in", values, "mobuzhuheji");
            return (Criteria) this;
        }

        public Criteria andMobuzhuhejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOBUZHUHEJI between", value1, value2, "mobuzhuheji");
            return (Criteria) this;
        }

        public Criteria andMobuzhuhejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOBUZHUHEJI not between", value1, value2, "mobuzhuheji");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhufeixianIsNull() {
            addCriterion("LEIJIBUZHUFEIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhufeixianIsNotNull() {
            addCriterion("LEIJIBUZHUFEIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhufeixianEqualTo(BigDecimal value) {
            addCriterion("LEIJIBUZHUFEIXIAN =", value, "leijibuzhufeixian");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhufeixianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIBUZHUFEIXIAN <>", value, "leijibuzhufeixian");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhufeixianGreaterThan(BigDecimal value) {
            addCriterion("LEIJIBUZHUFEIXIAN >", value, "leijibuzhufeixian");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhufeixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIBUZHUFEIXIAN >=", value, "leijibuzhufeixian");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhufeixianLessThan(BigDecimal value) {
            addCriterion("LEIJIBUZHUFEIXIAN <", value, "leijibuzhufeixian");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhufeixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIBUZHUFEIXIAN <=", value, "leijibuzhufeixian");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhufeixianIn(List<BigDecimal> values) {
            addCriterion("LEIJIBUZHUFEIXIAN in", values, "leijibuzhufeixian");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhufeixianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIBUZHUFEIXIAN not in", values, "leijibuzhufeixian");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhufeixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIBUZHUFEIXIAN between", value1, value2, "leijibuzhufeixian");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhufeixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIBUZHUFEIXIAN not between", value1, value2, "leijibuzhufeixian");
            return (Criteria) this;
        }

        public Criteria andMotouzifeixianIsNull() {
            addCriterion("MOTOUZIFEIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andMotouzifeixianIsNotNull() {
            addCriterion("MOTOUZIFEIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andMotouzifeixianEqualTo(BigDecimal value) {
            addCriterion("MOTOUZIFEIXIAN =", value, "motouzifeixian");
            return (Criteria) this;
        }

        public Criteria andMotouzifeixianNotEqualTo(BigDecimal value) {
            addCriterion("MOTOUZIFEIXIAN <>", value, "motouzifeixian");
            return (Criteria) this;
        }

        public Criteria andMotouzifeixianGreaterThan(BigDecimal value) {
            addCriterion("MOTOUZIFEIXIAN >", value, "motouzifeixian");
            return (Criteria) this;
        }

        public Criteria andMotouzifeixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOTOUZIFEIXIAN >=", value, "motouzifeixian");
            return (Criteria) this;
        }

        public Criteria andMotouzifeixianLessThan(BigDecimal value) {
            addCriterion("MOTOUZIFEIXIAN <", value, "motouzifeixian");
            return (Criteria) this;
        }

        public Criteria andMotouzifeixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOTOUZIFEIXIAN <=", value, "motouzifeixian");
            return (Criteria) this;
        }

        public Criteria andMotouzifeixianIn(List<BigDecimal> values) {
            addCriterion("MOTOUZIFEIXIAN in", values, "motouzifeixian");
            return (Criteria) this;
        }

        public Criteria andMotouzifeixianNotIn(List<BigDecimal> values) {
            addCriterion("MOTOUZIFEIXIAN not in", values, "motouzifeixian");
            return (Criteria) this;
        }

        public Criteria andMotouzifeixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOTOUZIFEIXIAN between", value1, value2, "motouzifeixian");
            return (Criteria) this;
        }

        public Criteria andMotouzifeixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOTOUZIFEIXIAN not between", value1, value2, "motouzifeixian");
            return (Criteria) this;
        }

        public Criteria andMotouzixianIsNull() {
            addCriterion("MOTOUZIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andMotouzixianIsNotNull() {
            addCriterion("MOTOUZIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andMotouzixianEqualTo(BigDecimal value) {
            addCriterion("MOTOUZIXIAN =", value, "motouzixian");
            return (Criteria) this;
        }

        public Criteria andMotouzixianNotEqualTo(BigDecimal value) {
            addCriterion("MOTOUZIXIAN <>", value, "motouzixian");
            return (Criteria) this;
        }

        public Criteria andMotouzixianGreaterThan(BigDecimal value) {
            addCriterion("MOTOUZIXIAN >", value, "motouzixian");
            return (Criteria) this;
        }

        public Criteria andMotouzixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOTOUZIXIAN >=", value, "motouzixian");
            return (Criteria) this;
        }

        public Criteria andMotouzixianLessThan(BigDecimal value) {
            addCriterion("MOTOUZIXIAN <", value, "motouzixian");
            return (Criteria) this;
        }

        public Criteria andMotouzixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOTOUZIXIAN <=", value, "motouzixian");
            return (Criteria) this;
        }

        public Criteria andMotouzixianIn(List<BigDecimal> values) {
            addCriterion("MOTOUZIXIAN in", values, "motouzixian");
            return (Criteria) this;
        }

        public Criteria andMotouzixianNotIn(List<BigDecimal> values) {
            addCriterion("MOTOUZIXIAN not in", values, "motouzixian");
            return (Criteria) this;
        }

        public Criteria andMotouzixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOTOUZIXIAN between", value1, value2, "motouzixian");
            return (Criteria) this;
        }

        public Criteria andMotouzixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOTOUZIXIAN not between", value1, value2, "motouzixian");
            return (Criteria) this;
        }

        public Criteria andMotouzihejiIsNull() {
            addCriterion("MOTOUZIHEJI is null");
            return (Criteria) this;
        }

        public Criteria andMotouzihejiIsNotNull() {
            addCriterion("MOTOUZIHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andMotouzihejiEqualTo(BigDecimal value) {
            addCriterion("MOTOUZIHEJI =", value, "motouziheji");
            return (Criteria) this;
        }

        public Criteria andMotouzihejiNotEqualTo(BigDecimal value) {
            addCriterion("MOTOUZIHEJI <>", value, "motouziheji");
            return (Criteria) this;
        }

        public Criteria andMotouzihejiGreaterThan(BigDecimal value) {
            addCriterion("MOTOUZIHEJI >", value, "motouziheji");
            return (Criteria) this;
        }

        public Criteria andMotouzihejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOTOUZIHEJI >=", value, "motouziheji");
            return (Criteria) this;
        }

        public Criteria andMotouzihejiLessThan(BigDecimal value) {
            addCriterion("MOTOUZIHEJI <", value, "motouziheji");
            return (Criteria) this;
        }

        public Criteria andMotouzihejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOTOUZIHEJI <=", value, "motouziheji");
            return (Criteria) this;
        }

        public Criteria andMotouzihejiIn(List<BigDecimal> values) {
            addCriterion("MOTOUZIHEJI in", values, "motouziheji");
            return (Criteria) this;
        }

        public Criteria andMotouzihejiNotIn(List<BigDecimal> values) {
            addCriterion("MOTOUZIHEJI not in", values, "motouziheji");
            return (Criteria) this;
        }

        public Criteria andMotouzihejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOTOUZIHEJI between", value1, value2, "motouziheji");
            return (Criteria) this;
        }

        public Criteria andMotouzihejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOTOUZIHEJI not between", value1, value2, "motouziheji");
            return (Criteria) this;
        }

        public Criteria andLeijitouzifeixianIsNull() {
            addCriterion("LEIJITOUZIFEIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijitouzifeixianIsNotNull() {
            addCriterion("LEIJITOUZIFEIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijitouzifeixianEqualTo(BigDecimal value) {
            addCriterion("LEIJITOUZIFEIXIAN =", value, "leijitouzifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijitouzifeixianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJITOUZIFEIXIAN <>", value, "leijitouzifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijitouzifeixianGreaterThan(BigDecimal value) {
            addCriterion("LEIJITOUZIFEIXIAN >", value, "leijitouzifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijitouzifeixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJITOUZIFEIXIAN >=", value, "leijitouzifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijitouzifeixianLessThan(BigDecimal value) {
            addCriterion("LEIJITOUZIFEIXIAN <", value, "leijitouzifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijitouzifeixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJITOUZIFEIXIAN <=", value, "leijitouzifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijitouzifeixianIn(List<BigDecimal> values) {
            addCriterion("LEIJITOUZIFEIXIAN in", values, "leijitouzifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijitouzifeixianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJITOUZIFEIXIAN not in", values, "leijitouzifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijitouzifeixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJITOUZIFEIXIAN between", value1, value2, "leijitouzifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijitouzifeixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJITOUZIFEIXIAN not between", value1, value2, "leijitouzifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijitouzixianIsNull() {
            addCriterion("LEIJITOUZIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijitouzixianIsNotNull() {
            addCriterion("LEIJITOUZIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijitouzixianEqualTo(BigDecimal value) {
            addCriterion("LEIJITOUZIXIAN =", value, "leijitouzixian");
            return (Criteria) this;
        }

        public Criteria andLeijitouzixianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJITOUZIXIAN <>", value, "leijitouzixian");
            return (Criteria) this;
        }

        public Criteria andLeijitouzixianGreaterThan(BigDecimal value) {
            addCriterion("LEIJITOUZIXIAN >", value, "leijitouzixian");
            return (Criteria) this;
        }

        public Criteria andLeijitouzixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJITOUZIXIAN >=", value, "leijitouzixian");
            return (Criteria) this;
        }

        public Criteria andLeijitouzixianLessThan(BigDecimal value) {
            addCriterion("LEIJITOUZIXIAN <", value, "leijitouzixian");
            return (Criteria) this;
        }

        public Criteria andLeijitouzixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJITOUZIXIAN <=", value, "leijitouzixian");
            return (Criteria) this;
        }

        public Criteria andLeijitouzixianIn(List<BigDecimal> values) {
            addCriterion("LEIJITOUZIXIAN in", values, "leijitouzixian");
            return (Criteria) this;
        }

        public Criteria andLeijitouzixianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJITOUZIXIAN not in", values, "leijitouzixian");
            return (Criteria) this;
        }

        public Criteria andLeijitouzixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJITOUZIXIAN between", value1, value2, "leijitouzixian");
            return (Criteria) this;
        }

        public Criteria andLeijitouzixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJITOUZIXIAN not between", value1, value2, "leijitouzixian");
            return (Criteria) this;
        }

        public Criteria andLeijitouzihejiIsNull() {
            addCriterion("LEIJITOUZIHEJI is null");
            return (Criteria) this;
        }

        public Criteria andLeijitouzihejiIsNotNull() {
            addCriterion("LEIJITOUZIHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andLeijitouzihejiEqualTo(BigDecimal value) {
            addCriterion("LEIJITOUZIHEJI =", value, "leijitouziheji");
            return (Criteria) this;
        }

        public Criteria andLeijitouzihejiNotEqualTo(BigDecimal value) {
            addCriterion("LEIJITOUZIHEJI <>", value, "leijitouziheji");
            return (Criteria) this;
        }

        public Criteria andLeijitouzihejiGreaterThan(BigDecimal value) {
            addCriterion("LEIJITOUZIHEJI >", value, "leijitouziheji");
            return (Criteria) this;
        }

        public Criteria andLeijitouzihejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJITOUZIHEJI >=", value, "leijitouziheji");
            return (Criteria) this;
        }

        public Criteria andLeijitouzihejiLessThan(BigDecimal value) {
            addCriterion("LEIJITOUZIHEJI <", value, "leijitouziheji");
            return (Criteria) this;
        }

        public Criteria andLeijitouzihejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJITOUZIHEJI <=", value, "leijitouziheji");
            return (Criteria) this;
        }

        public Criteria andLeijitouzihejiIn(List<BigDecimal> values) {
            addCriterion("LEIJITOUZIHEJI in", values, "leijitouziheji");
            return (Criteria) this;
        }

        public Criteria andLeijitouzihejiNotIn(List<BigDecimal> values) {
            addCriterion("LEIJITOUZIHEJI not in", values, "leijitouziheji");
            return (Criteria) this;
        }

        public Criteria andLeijitouzihejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJITOUZIHEJI between", value1, value2, "leijitouziheji");
            return (Criteria) this;
        }

        public Criteria andLeijitouzihejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJITOUZIHEJI not between", value1, value2, "leijitouziheji");
            return (Criteria) this;
        }

        public Criteria andMoqitafeixianIsNull() {
            addCriterion("MOQITAFEIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andMoqitafeixianIsNotNull() {
            addCriterion("MOQITAFEIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andMoqitafeixianEqualTo(BigDecimal value) {
            addCriterion("MOQITAFEIXIAN =", value, "moqitafeixian");
            return (Criteria) this;
        }

        public Criteria andMoqitafeixianNotEqualTo(BigDecimal value) {
            addCriterion("MOQITAFEIXIAN <>", value, "moqitafeixian");
            return (Criteria) this;
        }

        public Criteria andMoqitafeixianGreaterThan(BigDecimal value) {
            addCriterion("MOQITAFEIXIAN >", value, "moqitafeixian");
            return (Criteria) this;
        }

        public Criteria andMoqitafeixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQITAFEIXIAN >=", value, "moqitafeixian");
            return (Criteria) this;
        }

        public Criteria andMoqitafeixianLessThan(BigDecimal value) {
            addCriterion("MOQITAFEIXIAN <", value, "moqitafeixian");
            return (Criteria) this;
        }

        public Criteria andMoqitafeixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQITAFEIXIAN <=", value, "moqitafeixian");
            return (Criteria) this;
        }

        public Criteria andMoqitafeixianIn(List<BigDecimal> values) {
            addCriterion("MOQITAFEIXIAN in", values, "moqitafeixian");
            return (Criteria) this;
        }

        public Criteria andMoqitafeixianNotIn(List<BigDecimal> values) {
            addCriterion("MOQITAFEIXIAN not in", values, "moqitafeixian");
            return (Criteria) this;
        }

        public Criteria andMoqitafeixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQITAFEIXIAN between", value1, value2, "moqitafeixian");
            return (Criteria) this;
        }

        public Criteria andMoqitafeixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQITAFEIXIAN not between", value1, value2, "moqitafeixian");
            return (Criteria) this;
        }

        public Criteria andMoqitaxianIsNull() {
            addCriterion("MOQITAXIAN is null");
            return (Criteria) this;
        }

        public Criteria andMoqitaxianIsNotNull() {
            addCriterion("MOQITAXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andMoqitaxianEqualTo(BigDecimal value) {
            addCriterion("MOQITAXIAN =", value, "moqitaxian");
            return (Criteria) this;
        }

        public Criteria andMoqitaxianNotEqualTo(BigDecimal value) {
            addCriterion("MOQITAXIAN <>", value, "moqitaxian");
            return (Criteria) this;
        }

        public Criteria andMoqitaxianGreaterThan(BigDecimal value) {
            addCriterion("MOQITAXIAN >", value, "moqitaxian");
            return (Criteria) this;
        }

        public Criteria andMoqitaxianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQITAXIAN >=", value, "moqitaxian");
            return (Criteria) this;
        }

        public Criteria andMoqitaxianLessThan(BigDecimal value) {
            addCriterion("MOQITAXIAN <", value, "moqitaxian");
            return (Criteria) this;
        }

        public Criteria andMoqitaxianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQITAXIAN <=", value, "moqitaxian");
            return (Criteria) this;
        }

        public Criteria andMoqitaxianIn(List<BigDecimal> values) {
            addCriterion("MOQITAXIAN in", values, "moqitaxian");
            return (Criteria) this;
        }

        public Criteria andMoqitaxianNotIn(List<BigDecimal> values) {
            addCriterion("MOQITAXIAN not in", values, "moqitaxian");
            return (Criteria) this;
        }

        public Criteria andMoqitaxianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQITAXIAN between", value1, value2, "moqitaxian");
            return (Criteria) this;
        }

        public Criteria andMoqitaxianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQITAXIAN not between", value1, value2, "moqitaxian");
            return (Criteria) this;
        }

        public Criteria andMoqitahejiIsNull() {
            addCriterion("MOQITAHEJI is null");
            return (Criteria) this;
        }

        public Criteria andMoqitahejiIsNotNull() {
            addCriterion("MOQITAHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andMoqitahejiEqualTo(BigDecimal value) {
            addCriterion("MOQITAHEJI =", value, "moqitaheji");
            return (Criteria) this;
        }

        public Criteria andMoqitahejiNotEqualTo(BigDecimal value) {
            addCriterion("MOQITAHEJI <>", value, "moqitaheji");
            return (Criteria) this;
        }

        public Criteria andMoqitahejiGreaterThan(BigDecimal value) {
            addCriterion("MOQITAHEJI >", value, "moqitaheji");
            return (Criteria) this;
        }

        public Criteria andMoqitahejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQITAHEJI >=", value, "moqitaheji");
            return (Criteria) this;
        }

        public Criteria andMoqitahejiLessThan(BigDecimal value) {
            addCriterion("MOQITAHEJI <", value, "moqitaheji");
            return (Criteria) this;
        }

        public Criteria andMoqitahejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQITAHEJI <=", value, "moqitaheji");
            return (Criteria) this;
        }

        public Criteria andMoqitahejiIn(List<BigDecimal> values) {
            addCriterion("MOQITAHEJI in", values, "moqitaheji");
            return (Criteria) this;
        }

        public Criteria andMoqitahejiNotIn(List<BigDecimal> values) {
            addCriterion("MOQITAHEJI not in", values, "moqitaheji");
            return (Criteria) this;
        }

        public Criteria andMoqitahejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQITAHEJI between", value1, value2, "moqitaheji");
            return (Criteria) this;
        }

        public Criteria andMoqitahejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQITAHEJI not between", value1, value2, "moqitaheji");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeixianIsNull() {
            addCriterion("LEIJIQITAFEIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeixianIsNotNull() {
            addCriterion("LEIJIQITAFEIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeixianEqualTo(BigDecimal value) {
            addCriterion("LEIJIQITAFEIXIAN =", value, "leijiqitafeixian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeixianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIQITAFEIXIAN <>", value, "leijiqitafeixian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeixianGreaterThan(BigDecimal value) {
            addCriterion("LEIJIQITAFEIXIAN >", value, "leijiqitafeixian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQITAFEIXIAN >=", value, "leijiqitafeixian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeixianLessThan(BigDecimal value) {
            addCriterion("LEIJIQITAFEIXIAN <", value, "leijiqitafeixian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQITAFEIXIAN <=", value, "leijiqitafeixian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeixianIn(List<BigDecimal> values) {
            addCriterion("LEIJIQITAFEIXIAN in", values, "leijiqitafeixian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeixianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIQITAFEIXIAN not in", values, "leijiqitafeixian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQITAFEIXIAN between", value1, value2, "leijiqitafeixian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQITAFEIXIAN not between", value1, value2, "leijiqitafeixian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitaxianIsNull() {
            addCriterion("LEIJIQITAXIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijiqitaxianIsNotNull() {
            addCriterion("LEIJIQITAXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiqitaxianEqualTo(BigDecimal value) {
            addCriterion("LEIJIQITAXIAN =", value, "leijiqitaxian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitaxianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIQITAXIAN <>", value, "leijiqitaxian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitaxianGreaterThan(BigDecimal value) {
            addCriterion("LEIJIQITAXIAN >", value, "leijiqitaxian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitaxianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQITAXIAN >=", value, "leijiqitaxian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitaxianLessThan(BigDecimal value) {
            addCriterion("LEIJIQITAXIAN <", value, "leijiqitaxian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitaxianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQITAXIAN <=", value, "leijiqitaxian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitaxianIn(List<BigDecimal> values) {
            addCriterion("LEIJIQITAXIAN in", values, "leijiqitaxian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitaxianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIQITAXIAN not in", values, "leijiqitaxian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitaxianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQITAXIAN between", value1, value2, "leijiqitaxian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitaxianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQITAXIAN not between", value1, value2, "leijiqitaxian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitahejiIsNull() {
            addCriterion("LEIJIQITAHEJI is null");
            return (Criteria) this;
        }

        public Criteria andLeijiqitahejiIsNotNull() {
            addCriterion("LEIJIQITAHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiqitahejiEqualTo(BigDecimal value) {
            addCriterion("LEIJIQITAHEJI =", value, "leijiqitaheji");
            return (Criteria) this;
        }

        public Criteria andLeijiqitahejiNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIQITAHEJI <>", value, "leijiqitaheji");
            return (Criteria) this;
        }

        public Criteria andLeijiqitahejiGreaterThan(BigDecimal value) {
            addCriterion("LEIJIQITAHEJI >", value, "leijiqitaheji");
            return (Criteria) this;
        }

        public Criteria andLeijiqitahejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQITAHEJI >=", value, "leijiqitaheji");
            return (Criteria) this;
        }

        public Criteria andLeijiqitahejiLessThan(BigDecimal value) {
            addCriterion("LEIJIQITAHEJI <", value, "leijiqitaheji");
            return (Criteria) this;
        }

        public Criteria andLeijiqitahejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQITAHEJI <=", value, "leijiqitaheji");
            return (Criteria) this;
        }

        public Criteria andLeijiqitahejiIn(List<BigDecimal> values) {
            addCriterion("LEIJIQITAHEJI in", values, "leijiqitaheji");
            return (Criteria) this;
        }

        public Criteria andLeijiqitahejiNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIQITAHEJI not in", values, "leijiqitaheji");
            return (Criteria) this;
        }

        public Criteria andLeijiqitahejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQITAHEJI between", value1, value2, "leijiqitaheji");
            return (Criteria) this;
        }

        public Criteria andLeijiqitahejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQITAHEJI not between", value1, value2, "leijiqitaheji");
            return (Criteria) this;
        }

        public Criteria andMohejifeixianIsNull() {
            addCriterion("MOHEJIFEIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andMohejifeixianIsNotNull() {
            addCriterion("MOHEJIFEIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andMohejifeixianEqualTo(BigDecimal value) {
            addCriterion("MOHEJIFEIXIAN =", value, "mohejifeixian");
            return (Criteria) this;
        }

        public Criteria andMohejifeixianNotEqualTo(BigDecimal value) {
            addCriterion("MOHEJIFEIXIAN <>", value, "mohejifeixian");
            return (Criteria) this;
        }

        public Criteria andMohejifeixianGreaterThan(BigDecimal value) {
            addCriterion("MOHEJIFEIXIAN >", value, "mohejifeixian");
            return (Criteria) this;
        }

        public Criteria andMohejifeixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOHEJIFEIXIAN >=", value, "mohejifeixian");
            return (Criteria) this;
        }

        public Criteria andMohejifeixianLessThan(BigDecimal value) {
            addCriterion("MOHEJIFEIXIAN <", value, "mohejifeixian");
            return (Criteria) this;
        }

        public Criteria andMohejifeixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOHEJIFEIXIAN <=", value, "mohejifeixian");
            return (Criteria) this;
        }

        public Criteria andMohejifeixianIn(List<BigDecimal> values) {
            addCriterion("MOHEJIFEIXIAN in", values, "mohejifeixian");
            return (Criteria) this;
        }

        public Criteria andMohejifeixianNotIn(List<BigDecimal> values) {
            addCriterion("MOHEJIFEIXIAN not in", values, "mohejifeixian");
            return (Criteria) this;
        }

        public Criteria andMohejifeixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOHEJIFEIXIAN between", value1, value2, "mohejifeixian");
            return (Criteria) this;
        }

        public Criteria andMohejifeixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOHEJIFEIXIAN not between", value1, value2, "mohejifeixian");
            return (Criteria) this;
        }

        public Criteria andMohejixianIsNull() {
            addCriterion("MOHEJIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andMohejixianIsNotNull() {
            addCriterion("MOHEJIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andMohejixianEqualTo(BigDecimal value) {
            addCriterion("MOHEJIXIAN =", value, "mohejixian");
            return (Criteria) this;
        }

        public Criteria andMohejixianNotEqualTo(BigDecimal value) {
            addCriterion("MOHEJIXIAN <>", value, "mohejixian");
            return (Criteria) this;
        }

        public Criteria andMohejixianGreaterThan(BigDecimal value) {
            addCriterion("MOHEJIXIAN >", value, "mohejixian");
            return (Criteria) this;
        }

        public Criteria andMohejixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOHEJIXIAN >=", value, "mohejixian");
            return (Criteria) this;
        }

        public Criteria andMohejixianLessThan(BigDecimal value) {
            addCriterion("MOHEJIXIAN <", value, "mohejixian");
            return (Criteria) this;
        }

        public Criteria andMohejixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOHEJIXIAN <=", value, "mohejixian");
            return (Criteria) this;
        }

        public Criteria andMohejixianIn(List<BigDecimal> values) {
            addCriterion("MOHEJIXIAN in", values, "mohejixian");
            return (Criteria) this;
        }

        public Criteria andMohejixianNotIn(List<BigDecimal> values) {
            addCriterion("MOHEJIXIAN not in", values, "mohejixian");
            return (Criteria) this;
        }

        public Criteria andMohejixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOHEJIXIAN between", value1, value2, "mohejixian");
            return (Criteria) this;
        }

        public Criteria andMohejixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOHEJIXIAN not between", value1, value2, "mohejixian");
            return (Criteria) this;
        }

        public Criteria andMohejihejiIsNull() {
            addCriterion("MOHEJIHEJI is null");
            return (Criteria) this;
        }

        public Criteria andMohejihejiIsNotNull() {
            addCriterion("MOHEJIHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andMohejihejiEqualTo(BigDecimal value) {
            addCriterion("MOHEJIHEJI =", value, "mohejiheji");
            return (Criteria) this;
        }

        public Criteria andMohejihejiNotEqualTo(BigDecimal value) {
            addCriterion("MOHEJIHEJI <>", value, "mohejiheji");
            return (Criteria) this;
        }

        public Criteria andMohejihejiGreaterThan(BigDecimal value) {
            addCriterion("MOHEJIHEJI >", value, "mohejiheji");
            return (Criteria) this;
        }

        public Criteria andMohejihejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOHEJIHEJI >=", value, "mohejiheji");
            return (Criteria) this;
        }

        public Criteria andMohejihejiLessThan(BigDecimal value) {
            addCriterion("MOHEJIHEJI <", value, "mohejiheji");
            return (Criteria) this;
        }

        public Criteria andMohejihejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOHEJIHEJI <=", value, "mohejiheji");
            return (Criteria) this;
        }

        public Criteria andMohejihejiIn(List<BigDecimal> values) {
            addCriterion("MOHEJIHEJI in", values, "mohejiheji");
            return (Criteria) this;
        }

        public Criteria andMohejihejiNotIn(List<BigDecimal> values) {
            addCriterion("MOHEJIHEJI not in", values, "mohejiheji");
            return (Criteria) this;
        }

        public Criteria andMohejihejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOHEJIHEJI between", value1, value2, "mohejiheji");
            return (Criteria) this;
        }

        public Criteria andMohejihejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOHEJIHEJI not between", value1, value2, "mohejiheji");
            return (Criteria) this;
        }

        public Criteria andLeijihejifeixianIsNull() {
            addCriterion("LEIJIHEJIFEIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijihejifeixianIsNotNull() {
            addCriterion("LEIJIHEJIFEIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijihejifeixianEqualTo(BigDecimal value) {
            addCriterion("LEIJIHEJIFEIXIAN =", value, "leijihejifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijihejifeixianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIHEJIFEIXIAN <>", value, "leijihejifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijihejifeixianGreaterThan(BigDecimal value) {
            addCriterion("LEIJIHEJIFEIXIAN >", value, "leijihejifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijihejifeixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIHEJIFEIXIAN >=", value, "leijihejifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijihejifeixianLessThan(BigDecimal value) {
            addCriterion("LEIJIHEJIFEIXIAN <", value, "leijihejifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijihejifeixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIHEJIFEIXIAN <=", value, "leijihejifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijihejifeixianIn(List<BigDecimal> values) {
            addCriterion("LEIJIHEJIFEIXIAN in", values, "leijihejifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijihejifeixianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIHEJIFEIXIAN not in", values, "leijihejifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijihejifeixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIHEJIFEIXIAN between", value1, value2, "leijihejifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijihejifeixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIHEJIFEIXIAN not between", value1, value2, "leijihejifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijihejixianIsNull() {
            addCriterion("LEIJIHEJIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijihejixianIsNotNull() {
            addCriterion("LEIJIHEJIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijihejixianEqualTo(BigDecimal value) {
            addCriterion("LEIJIHEJIXIAN =", value, "leijihejixian");
            return (Criteria) this;
        }

        public Criteria andLeijihejixianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIHEJIXIAN <>", value, "leijihejixian");
            return (Criteria) this;
        }

        public Criteria andLeijihejixianGreaterThan(BigDecimal value) {
            addCriterion("LEIJIHEJIXIAN >", value, "leijihejixian");
            return (Criteria) this;
        }

        public Criteria andLeijihejixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIHEJIXIAN >=", value, "leijihejixian");
            return (Criteria) this;
        }

        public Criteria andLeijihejixianLessThan(BigDecimal value) {
            addCriterion("LEIJIHEJIXIAN <", value, "leijihejixian");
            return (Criteria) this;
        }

        public Criteria andLeijihejixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIHEJIXIAN <=", value, "leijihejixian");
            return (Criteria) this;
        }

        public Criteria andLeijihejixianIn(List<BigDecimal> values) {
            addCriterion("LEIJIHEJIXIAN in", values, "leijihejixian");
            return (Criteria) this;
        }

        public Criteria andLeijihejixianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIHEJIXIAN not in", values, "leijihejixian");
            return (Criteria) this;
        }

        public Criteria andLeijihejixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIHEJIXIAN between", value1, value2, "leijihejixian");
            return (Criteria) this;
        }

        public Criteria andLeijihejixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIHEJIXIAN not between", value1, value2, "leijihejixian");
            return (Criteria) this;
        }

        public Criteria andLeijihejihejiIsNull() {
            addCriterion("LEIJIHEJIHEJI is null");
            return (Criteria) this;
        }

        public Criteria andLeijihejihejiIsNotNull() {
            addCriterion("LEIJIHEJIHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andLeijihejihejiEqualTo(BigDecimal value) {
            addCriterion("LEIJIHEJIHEJI =", value, "leijihejiheji");
            return (Criteria) this;
        }

        public Criteria andLeijihejihejiNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIHEJIHEJI <>", value, "leijihejiheji");
            return (Criteria) this;
        }

        public Criteria andLeijihejihejiGreaterThan(BigDecimal value) {
            addCriterion("LEIJIHEJIHEJI >", value, "leijihejiheji");
            return (Criteria) this;
        }

        public Criteria andLeijihejihejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIHEJIHEJI >=", value, "leijihejiheji");
            return (Criteria) this;
        }

        public Criteria andLeijihejihejiLessThan(BigDecimal value) {
            addCriterion("LEIJIHEJIHEJI <", value, "leijihejiheji");
            return (Criteria) this;
        }

        public Criteria andLeijihejihejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIHEJIHEJI <=", value, "leijihejiheji");
            return (Criteria) this;
        }

        public Criteria andLeijihejihejiIn(List<BigDecimal> values) {
            addCriterion("LEIJIHEJIHEJI in", values, "leijihejiheji");
            return (Criteria) this;
        }

        public Criteria andLeijihejihejiNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIHEJIHEJI not in", values, "leijihejiheji");
            return (Criteria) this;
        }

        public Criteria andLeijihejihejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIHEJIHEJI between", value1, value2, "leijihejiheji");
            return (Criteria) this;
        }

        public Criteria andLeijihejihejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIHEJIHEJI not between", value1, value2, "leijihejiheji");
            return (Criteria) this;
        }

        public Criteria andMochengbenfeixianIsNull() {
            addCriterion("MOCHENGBENFEIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andMochengbenfeixianIsNotNull() {
            addCriterion("MOCHENGBENFEIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andMochengbenfeixianEqualTo(BigDecimal value) {
            addCriterion("MOCHENGBENFEIXIAN =", value, "mochengbenfeixian");
            return (Criteria) this;
        }

        public Criteria andMochengbenfeixianNotEqualTo(BigDecimal value) {
            addCriterion("MOCHENGBENFEIXIAN <>", value, "mochengbenfeixian");
            return (Criteria) this;
        }

        public Criteria andMochengbenfeixianGreaterThan(BigDecimal value) {
            addCriterion("MOCHENGBENFEIXIAN >", value, "mochengbenfeixian");
            return (Criteria) this;
        }

        public Criteria andMochengbenfeixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOCHENGBENFEIXIAN >=", value, "mochengbenfeixian");
            return (Criteria) this;
        }

        public Criteria andMochengbenfeixianLessThan(BigDecimal value) {
            addCriterion("MOCHENGBENFEIXIAN <", value, "mochengbenfeixian");
            return (Criteria) this;
        }

        public Criteria andMochengbenfeixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOCHENGBENFEIXIAN <=", value, "mochengbenfeixian");
            return (Criteria) this;
        }

        public Criteria andMochengbenfeixianIn(List<BigDecimal> values) {
            addCriterion("MOCHENGBENFEIXIAN in", values, "mochengbenfeixian");
            return (Criteria) this;
        }

        public Criteria andMochengbenfeixianNotIn(List<BigDecimal> values) {
            addCriterion("MOCHENGBENFEIXIAN not in", values, "mochengbenfeixian");
            return (Criteria) this;
        }

        public Criteria andMochengbenfeixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOCHENGBENFEIXIAN between", value1, value2, "mochengbenfeixian");
            return (Criteria) this;
        }

        public Criteria andMochengbenfeixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOCHENGBENFEIXIAN not between", value1, value2, "mochengbenfeixian");
            return (Criteria) this;
        }

        public Criteria andMochengbenxianIsNull() {
            addCriterion("MOCHENGBENXIAN is null");
            return (Criteria) this;
        }

        public Criteria andMochengbenxianIsNotNull() {
            addCriterion("MOCHENGBENXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andMochengbenxianEqualTo(BigDecimal value) {
            addCriterion("MOCHENGBENXIAN =", value, "mochengbenxian");
            return (Criteria) this;
        }

        public Criteria andMochengbenxianNotEqualTo(BigDecimal value) {
            addCriterion("MOCHENGBENXIAN <>", value, "mochengbenxian");
            return (Criteria) this;
        }

        public Criteria andMochengbenxianGreaterThan(BigDecimal value) {
            addCriterion("MOCHENGBENXIAN >", value, "mochengbenxian");
            return (Criteria) this;
        }

        public Criteria andMochengbenxianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOCHENGBENXIAN >=", value, "mochengbenxian");
            return (Criteria) this;
        }

        public Criteria andMochengbenxianLessThan(BigDecimal value) {
            addCriterion("MOCHENGBENXIAN <", value, "mochengbenxian");
            return (Criteria) this;
        }

        public Criteria andMochengbenxianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOCHENGBENXIAN <=", value, "mochengbenxian");
            return (Criteria) this;
        }

        public Criteria andMochengbenxianIn(List<BigDecimal> values) {
            addCriterion("MOCHENGBENXIAN in", values, "mochengbenxian");
            return (Criteria) this;
        }

        public Criteria andMochengbenxianNotIn(List<BigDecimal> values) {
            addCriterion("MOCHENGBENXIAN not in", values, "mochengbenxian");
            return (Criteria) this;
        }

        public Criteria andMochengbenxianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOCHENGBENXIAN between", value1, value2, "mochengbenxian");
            return (Criteria) this;
        }

        public Criteria andMochengbenxianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOCHENGBENXIAN not between", value1, value2, "mochengbenxian");
            return (Criteria) this;
        }

        public Criteria andMochengbenhejiIsNull() {
            addCriterion("MOCHENGBENHEJI is null");
            return (Criteria) this;
        }

        public Criteria andMochengbenhejiIsNotNull() {
            addCriterion("MOCHENGBENHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andMochengbenhejiEqualTo(BigDecimal value) {
            addCriterion("MOCHENGBENHEJI =", value, "mochengbenheji");
            return (Criteria) this;
        }

        public Criteria andMochengbenhejiNotEqualTo(BigDecimal value) {
            addCriterion("MOCHENGBENHEJI <>", value, "mochengbenheji");
            return (Criteria) this;
        }

        public Criteria andMochengbenhejiGreaterThan(BigDecimal value) {
            addCriterion("MOCHENGBENHEJI >", value, "mochengbenheji");
            return (Criteria) this;
        }

        public Criteria andMochengbenhejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOCHENGBENHEJI >=", value, "mochengbenheji");
            return (Criteria) this;
        }

        public Criteria andMochengbenhejiLessThan(BigDecimal value) {
            addCriterion("MOCHENGBENHEJI <", value, "mochengbenheji");
            return (Criteria) this;
        }

        public Criteria andMochengbenhejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOCHENGBENHEJI <=", value, "mochengbenheji");
            return (Criteria) this;
        }

        public Criteria andMochengbenhejiIn(List<BigDecimal> values) {
            addCriterion("MOCHENGBENHEJI in", values, "mochengbenheji");
            return (Criteria) this;
        }

        public Criteria andMochengbenhejiNotIn(List<BigDecimal> values) {
            addCriterion("MOCHENGBENHEJI not in", values, "mochengbenheji");
            return (Criteria) this;
        }

        public Criteria andMochengbenhejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOCHENGBENHEJI between", value1, value2, "mochengbenheji");
            return (Criteria) this;
        }

        public Criteria andMochengbenhejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOCHENGBENHEJI not between", value1, value2, "mochengbenheji");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenfeixianIsNull() {
            addCriterion("LEIJICHENGBENFEIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenfeixianIsNotNull() {
            addCriterion("LEIJICHENGBENFEIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenfeixianEqualTo(BigDecimal value) {
            addCriterion("LEIJICHENGBENFEIXIAN =", value, "leijichengbenfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenfeixianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJICHENGBENFEIXIAN <>", value, "leijichengbenfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenfeixianGreaterThan(BigDecimal value) {
            addCriterion("LEIJICHENGBENFEIXIAN >", value, "leijichengbenfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenfeixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJICHENGBENFEIXIAN >=", value, "leijichengbenfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenfeixianLessThan(BigDecimal value) {
            addCriterion("LEIJICHENGBENFEIXIAN <", value, "leijichengbenfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenfeixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJICHENGBENFEIXIAN <=", value, "leijichengbenfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenfeixianIn(List<BigDecimal> values) {
            addCriterion("LEIJICHENGBENFEIXIAN in", values, "leijichengbenfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenfeixianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJICHENGBENFEIXIAN not in", values, "leijichengbenfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenfeixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJICHENGBENFEIXIAN between", value1, value2, "leijichengbenfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenfeixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJICHENGBENFEIXIAN not between", value1, value2, "leijichengbenfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenxianIsNull() {
            addCriterion("LEIJICHENGBENXIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenxianIsNotNull() {
            addCriterion("LEIJICHENGBENXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenxianEqualTo(BigDecimal value) {
            addCriterion("LEIJICHENGBENXIAN =", value, "leijichengbenxian");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenxianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJICHENGBENXIAN <>", value, "leijichengbenxian");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenxianGreaterThan(BigDecimal value) {
            addCriterion("LEIJICHENGBENXIAN >", value, "leijichengbenxian");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenxianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJICHENGBENXIAN >=", value, "leijichengbenxian");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenxianLessThan(BigDecimal value) {
            addCriterion("LEIJICHENGBENXIAN <", value, "leijichengbenxian");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenxianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJICHENGBENXIAN <=", value, "leijichengbenxian");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenxianIn(List<BigDecimal> values) {
            addCriterion("LEIJICHENGBENXIAN in", values, "leijichengbenxian");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenxianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJICHENGBENXIAN not in", values, "leijichengbenxian");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenxianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJICHENGBENXIAN between", value1, value2, "leijichengbenxian");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenxianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJICHENGBENXIAN not between", value1, value2, "leijichengbenxian");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenhejiIsNull() {
            addCriterion("LEIJICHENGBENHEJI is null");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenhejiIsNotNull() {
            addCriterion("LEIJICHENGBENHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenhejiEqualTo(BigDecimal value) {
            addCriterion("LEIJICHENGBENHEJI =", value, "leijichengbenheji");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenhejiNotEqualTo(BigDecimal value) {
            addCriterion("LEIJICHENGBENHEJI <>", value, "leijichengbenheji");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenhejiGreaterThan(BigDecimal value) {
            addCriterion("LEIJICHENGBENHEJI >", value, "leijichengbenheji");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenhejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJICHENGBENHEJI >=", value, "leijichengbenheji");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenhejiLessThan(BigDecimal value) {
            addCriterion("LEIJICHENGBENHEJI <", value, "leijichengbenheji");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenhejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJICHENGBENHEJI <=", value, "leijichengbenheji");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenhejiIn(List<BigDecimal> values) {
            addCriterion("LEIJICHENGBENHEJI in", values, "leijichengbenheji");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenhejiNotIn(List<BigDecimal> values) {
            addCriterion("LEIJICHENGBENHEJI not in", values, "leijichengbenheji");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenhejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJICHENGBENHEJI between", value1, value2, "leijichengbenheji");
            return (Criteria) this;
        }

        public Criteria andLeijichengbenhejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJICHENGBENHEJI not between", value1, value2, "leijichengbenheji");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian1IsNull() {
            addCriterion("MOQIZHONGFEIXIAN1 is null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian1IsNotNull() {
            addCriterion("MOQIZHONGFEIXIAN1 is not null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian1EqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN1 =", value, "moqizhongfeixian1");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian1NotEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN1 <>", value, "moqizhongfeixian1");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian1GreaterThan(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN1 >", value, "moqizhongfeixian1");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN1 >=", value, "moqizhongfeixian1");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian1LessThan(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN1 <", value, "moqizhongfeixian1");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN1 <=", value, "moqizhongfeixian1");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian1In(List<BigDecimal> values) {
            addCriterion("MOQIZHONGFEIXIAN1 in", values, "moqizhongfeixian1");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian1NotIn(List<BigDecimal> values) {
            addCriterion("MOQIZHONGFEIXIAN1 not in", values, "moqizhongfeixian1");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGFEIXIAN1 between", value1, value2, "moqizhongfeixian1");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGFEIXIAN1 not between", value1, value2, "moqizhongfeixian1");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian1IsNull() {
            addCriterion("MOQIZHONGXIAN1 is null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian1IsNotNull() {
            addCriterion("MOQIZHONGXIAN1 is not null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian1EqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN1 =", value, "moqizhongxian1");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian1NotEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN1 <>", value, "moqizhongxian1");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian1GreaterThan(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN1 >", value, "moqizhongxian1");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN1 >=", value, "moqizhongxian1");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian1LessThan(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN1 <", value, "moqizhongxian1");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN1 <=", value, "moqizhongxian1");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian1In(List<BigDecimal> values) {
            addCriterion("MOQIZHONGXIAN1 in", values, "moqizhongxian1");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian1NotIn(List<BigDecimal> values) {
            addCriterion("MOQIZHONGXIAN1 not in", values, "moqizhongxian1");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGXIAN1 between", value1, value2, "moqizhongxian1");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGXIAN1 not between", value1, value2, "moqizhongxian1");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji1IsNull() {
            addCriterion("MOQIZHONGHEJI1 is null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji1IsNotNull() {
            addCriterion("MOQIZHONGHEJI1 is not null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji1EqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI1 =", value, "moqizhongheji1");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji1NotEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI1 <>", value, "moqizhongheji1");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji1GreaterThan(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI1 >", value, "moqizhongheji1");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI1 >=", value, "moqizhongheji1");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji1LessThan(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI1 <", value, "moqizhongheji1");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI1 <=", value, "moqizhongheji1");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji1In(List<BigDecimal> values) {
            addCriterion("MOQIZHONGHEJI1 in", values, "moqizhongheji1");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji1NotIn(List<BigDecimal> values) {
            addCriterion("MOQIZHONGHEJI1 not in", values, "moqizhongheji1");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGHEJI1 between", value1, value2, "moqizhongheji1");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGHEJI1 not between", value1, value2, "moqizhongheji1");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian1IsNull() {
            addCriterion("LEIJIQIZHONGFEIXIAN1 is null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian1IsNotNull() {
            addCriterion("LEIJIQIZHONGFEIXIAN1 is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian1EqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN1 =", value, "leijiqizhongfeixian1");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian1NotEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN1 <>", value, "leijiqizhongfeixian1");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian1GreaterThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN1 >", value, "leijiqizhongfeixian1");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN1 >=", value, "leijiqizhongfeixian1");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian1LessThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN1 <", value, "leijiqizhongfeixian1");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN1 <=", value, "leijiqizhongfeixian1");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian1In(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGFEIXIAN1 in", values, "leijiqizhongfeixian1");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian1NotIn(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGFEIXIAN1 not in", values, "leijiqizhongfeixian1");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGFEIXIAN1 between", value1, value2, "leijiqizhongfeixian1");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGFEIXIAN1 not between", value1, value2, "leijiqizhongfeixian1");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian1IsNull() {
            addCriterion("LEIJIQIZHONGXIAN1 is null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian1IsNotNull() {
            addCriterion("LEIJIQIZHONGXIAN1 is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian1EqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN1 =", value, "leijiqizhongxian1");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian1NotEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN1 <>", value, "leijiqizhongxian1");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian1GreaterThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN1 >", value, "leijiqizhongxian1");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN1 >=", value, "leijiqizhongxian1");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian1LessThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN1 <", value, "leijiqizhongxian1");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN1 <=", value, "leijiqizhongxian1");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian1In(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGXIAN1 in", values, "leijiqizhongxian1");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian1NotIn(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGXIAN1 not in", values, "leijiqizhongxian1");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGXIAN1 between", value1, value2, "leijiqizhongxian1");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGXIAN1 not between", value1, value2, "leijiqizhongxian1");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji1IsNull() {
            addCriterion("LEIJIQIZHONGHEJI1 is null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji1IsNotNull() {
            addCriterion("LEIJIQIZHONGHEJI1 is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji1EqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI1 =", value, "leijiqizhongheji1");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji1NotEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI1 <>", value, "leijiqizhongheji1");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji1GreaterThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI1 >", value, "leijiqizhongheji1");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI1 >=", value, "leijiqizhongheji1");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji1LessThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI1 <", value, "leijiqizhongheji1");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI1 <=", value, "leijiqizhongheji1");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji1In(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGHEJI1 in", values, "leijiqizhongheji1");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji1NotIn(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGHEJI1 not in", values, "leijiqizhongheji1");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGHEJI1 between", value1, value2, "leijiqizhongheji1");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGHEJI1 not between", value1, value2, "leijiqizhongheji1");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian2IsNull() {
            addCriterion("MOQIZHONGFEIXIAN2 is null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian2IsNotNull() {
            addCriterion("MOQIZHONGFEIXIAN2 is not null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian2EqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN2 =", value, "moqizhongfeixian2");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian2NotEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN2 <>", value, "moqizhongfeixian2");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian2GreaterThan(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN2 >", value, "moqizhongfeixian2");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN2 >=", value, "moqizhongfeixian2");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian2LessThan(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN2 <", value, "moqizhongfeixian2");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN2 <=", value, "moqizhongfeixian2");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian2In(List<BigDecimal> values) {
            addCriterion("MOQIZHONGFEIXIAN2 in", values, "moqizhongfeixian2");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian2NotIn(List<BigDecimal> values) {
            addCriterion("MOQIZHONGFEIXIAN2 not in", values, "moqizhongfeixian2");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGFEIXIAN2 between", value1, value2, "moqizhongfeixian2");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGFEIXIAN2 not between", value1, value2, "moqizhongfeixian2");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian2IsNull() {
            addCriterion("MOQIZHONGXIAN2 is null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian2IsNotNull() {
            addCriterion("MOQIZHONGXIAN2 is not null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian2EqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN2 =", value, "moqizhongxian2");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian2NotEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN2 <>", value, "moqizhongxian2");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian2GreaterThan(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN2 >", value, "moqizhongxian2");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN2 >=", value, "moqizhongxian2");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian2LessThan(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN2 <", value, "moqizhongxian2");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN2 <=", value, "moqizhongxian2");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian2In(List<BigDecimal> values) {
            addCriterion("MOQIZHONGXIAN2 in", values, "moqizhongxian2");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian2NotIn(List<BigDecimal> values) {
            addCriterion("MOQIZHONGXIAN2 not in", values, "moqizhongxian2");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGXIAN2 between", value1, value2, "moqizhongxian2");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGXIAN2 not between", value1, value2, "moqizhongxian2");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji2IsNull() {
            addCriterion("MOQIZHONGHEJI2 is null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji2IsNotNull() {
            addCriterion("MOQIZHONGHEJI2 is not null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji2EqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI2 =", value, "moqizhongheji2");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji2NotEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI2 <>", value, "moqizhongheji2");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji2GreaterThan(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI2 >", value, "moqizhongheji2");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI2 >=", value, "moqizhongheji2");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji2LessThan(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI2 <", value, "moqizhongheji2");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI2 <=", value, "moqizhongheji2");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji2In(List<BigDecimal> values) {
            addCriterion("MOQIZHONGHEJI2 in", values, "moqizhongheji2");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji2NotIn(List<BigDecimal> values) {
            addCriterion("MOQIZHONGHEJI2 not in", values, "moqizhongheji2");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGHEJI2 between", value1, value2, "moqizhongheji2");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGHEJI2 not between", value1, value2, "moqizhongheji2");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian2IsNull() {
            addCriterion("LEIJIQIZHONGFEIXIAN2 is null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian2IsNotNull() {
            addCriterion("LEIJIQIZHONGFEIXIAN2 is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian2EqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN2 =", value, "leijiqizhongfeixian2");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian2NotEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN2 <>", value, "leijiqizhongfeixian2");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian2GreaterThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN2 >", value, "leijiqizhongfeixian2");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN2 >=", value, "leijiqizhongfeixian2");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian2LessThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN2 <", value, "leijiqizhongfeixian2");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN2 <=", value, "leijiqizhongfeixian2");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian2In(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGFEIXIAN2 in", values, "leijiqizhongfeixian2");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian2NotIn(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGFEIXIAN2 not in", values, "leijiqizhongfeixian2");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGFEIXIAN2 between", value1, value2, "leijiqizhongfeixian2");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGFEIXIAN2 not between", value1, value2, "leijiqizhongfeixian2");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian2IsNull() {
            addCriterion("LEIJIQIZHONGXIAN2 is null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian2IsNotNull() {
            addCriterion("LEIJIQIZHONGXIAN2 is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian2EqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN2 =", value, "leijiqizhongxian2");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian2NotEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN2 <>", value, "leijiqizhongxian2");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian2GreaterThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN2 >", value, "leijiqizhongxian2");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN2 >=", value, "leijiqizhongxian2");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian2LessThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN2 <", value, "leijiqizhongxian2");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN2 <=", value, "leijiqizhongxian2");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian2In(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGXIAN2 in", values, "leijiqizhongxian2");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian2NotIn(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGXIAN2 not in", values, "leijiqizhongxian2");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGXIAN2 between", value1, value2, "leijiqizhongxian2");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGXIAN2 not between", value1, value2, "leijiqizhongxian2");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji2IsNull() {
            addCriterion("LEIJIQIZHONGHEJI2 is null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji2IsNotNull() {
            addCriterion("LEIJIQIZHONGHEJI2 is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji2EqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI2 =", value, "leijiqizhongheji2");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji2NotEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI2 <>", value, "leijiqizhongheji2");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji2GreaterThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI2 >", value, "leijiqizhongheji2");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI2 >=", value, "leijiqizhongheji2");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji2LessThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI2 <", value, "leijiqizhongheji2");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI2 <=", value, "leijiqizhongheji2");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji2In(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGHEJI2 in", values, "leijiqizhongheji2");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji2NotIn(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGHEJI2 not in", values, "leijiqizhongheji2");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGHEJI2 between", value1, value2, "leijiqizhongheji2");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGHEJI2 not between", value1, value2, "leijiqizhongheji2");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian3IsNull() {
            addCriterion("MOQIZHONGFEIXIAN3 is null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian3IsNotNull() {
            addCriterion("MOQIZHONGFEIXIAN3 is not null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian3EqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN3 =", value, "moqizhongfeixian3");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian3NotEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN3 <>", value, "moqizhongfeixian3");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian3GreaterThan(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN3 >", value, "moqizhongfeixian3");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN3 >=", value, "moqizhongfeixian3");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian3LessThan(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN3 <", value, "moqizhongfeixian3");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN3 <=", value, "moqizhongfeixian3");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian3In(List<BigDecimal> values) {
            addCriterion("MOQIZHONGFEIXIAN3 in", values, "moqizhongfeixian3");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian3NotIn(List<BigDecimal> values) {
            addCriterion("MOQIZHONGFEIXIAN3 not in", values, "moqizhongfeixian3");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGFEIXIAN3 between", value1, value2, "moqizhongfeixian3");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGFEIXIAN3 not between", value1, value2, "moqizhongfeixian3");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian3IsNull() {
            addCriterion("MOQIZHONGXIAN3 is null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian3IsNotNull() {
            addCriterion("MOQIZHONGXIAN3 is not null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian3EqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN3 =", value, "moqizhongxian3");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian3NotEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN3 <>", value, "moqizhongxian3");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian3GreaterThan(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN3 >", value, "moqizhongxian3");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN3 >=", value, "moqizhongxian3");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian3LessThan(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN3 <", value, "moqizhongxian3");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN3 <=", value, "moqizhongxian3");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian3In(List<BigDecimal> values) {
            addCriterion("MOQIZHONGXIAN3 in", values, "moqizhongxian3");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian3NotIn(List<BigDecimal> values) {
            addCriterion("MOQIZHONGXIAN3 not in", values, "moqizhongxian3");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGXIAN3 between", value1, value2, "moqizhongxian3");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGXIAN3 not between", value1, value2, "moqizhongxian3");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji3IsNull() {
            addCriterion("MOQIZHONGHEJI3 is null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji3IsNotNull() {
            addCriterion("MOQIZHONGHEJI3 is not null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji3EqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI3 =", value, "moqizhongheji3");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji3NotEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI3 <>", value, "moqizhongheji3");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji3GreaterThan(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI3 >", value, "moqizhongheji3");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI3 >=", value, "moqizhongheji3");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji3LessThan(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI3 <", value, "moqizhongheji3");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI3 <=", value, "moqizhongheji3");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji3In(List<BigDecimal> values) {
            addCriterion("MOQIZHONGHEJI3 in", values, "moqizhongheji3");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji3NotIn(List<BigDecimal> values) {
            addCriterion("MOQIZHONGHEJI3 not in", values, "moqizhongheji3");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGHEJI3 between", value1, value2, "moqizhongheji3");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGHEJI3 not between", value1, value2, "moqizhongheji3");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian3IsNull() {
            addCriterion("LEIJIQIZHONGFEIXIAN3 is null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian3IsNotNull() {
            addCriterion("LEIJIQIZHONGFEIXIAN3 is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian3EqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN3 =", value, "leijiqizhongfeixian3");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian3NotEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN3 <>", value, "leijiqizhongfeixian3");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian3GreaterThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN3 >", value, "leijiqizhongfeixian3");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN3 >=", value, "leijiqizhongfeixian3");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian3LessThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN3 <", value, "leijiqizhongfeixian3");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN3 <=", value, "leijiqizhongfeixian3");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian3In(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGFEIXIAN3 in", values, "leijiqizhongfeixian3");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian3NotIn(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGFEIXIAN3 not in", values, "leijiqizhongfeixian3");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGFEIXIAN3 between", value1, value2, "leijiqizhongfeixian3");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGFEIXIAN3 not between", value1, value2, "leijiqizhongfeixian3");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian3IsNull() {
            addCriterion("LEIJIQIZHONGXIAN3 is null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian3IsNotNull() {
            addCriterion("LEIJIQIZHONGXIAN3 is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian3EqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN3 =", value, "leijiqizhongxian3");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian3NotEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN3 <>", value, "leijiqizhongxian3");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian3GreaterThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN3 >", value, "leijiqizhongxian3");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN3 >=", value, "leijiqizhongxian3");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian3LessThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN3 <", value, "leijiqizhongxian3");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN3 <=", value, "leijiqizhongxian3");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian3In(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGXIAN3 in", values, "leijiqizhongxian3");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian3NotIn(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGXIAN3 not in", values, "leijiqizhongxian3");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGXIAN3 between", value1, value2, "leijiqizhongxian3");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGXIAN3 not between", value1, value2, "leijiqizhongxian3");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji3IsNull() {
            addCriterion("LEIJIQIZHONGHEJI3 is null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji3IsNotNull() {
            addCriterion("LEIJIQIZHONGHEJI3 is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji3EqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI3 =", value, "leijiqizhongheji3");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji3NotEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI3 <>", value, "leijiqizhongheji3");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji3GreaterThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI3 >", value, "leijiqizhongheji3");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI3 >=", value, "leijiqizhongheji3");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji3LessThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI3 <", value, "leijiqizhongheji3");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI3 <=", value, "leijiqizhongheji3");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji3In(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGHEJI3 in", values, "leijiqizhongheji3");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji3NotIn(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGHEJI3 not in", values, "leijiqizhongheji3");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGHEJI3 between", value1, value2, "leijiqizhongheji3");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGHEJI3 not between", value1, value2, "leijiqizhongheji3");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian4IsNull() {
            addCriterion("MOQIZHONGFEIXIAN4 is null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian4IsNotNull() {
            addCriterion("MOQIZHONGFEIXIAN4 is not null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian4EqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN4 =", value, "moqizhongfeixian4");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian4NotEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN4 <>", value, "moqizhongfeixian4");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian4GreaterThan(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN4 >", value, "moqizhongfeixian4");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN4 >=", value, "moqizhongfeixian4");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian4LessThan(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN4 <", value, "moqizhongfeixian4");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN4 <=", value, "moqizhongfeixian4");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian4In(List<BigDecimal> values) {
            addCriterion("MOQIZHONGFEIXIAN4 in", values, "moqizhongfeixian4");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian4NotIn(List<BigDecimal> values) {
            addCriterion("MOQIZHONGFEIXIAN4 not in", values, "moqizhongfeixian4");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGFEIXIAN4 between", value1, value2, "moqizhongfeixian4");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGFEIXIAN4 not between", value1, value2, "moqizhongfeixian4");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian4IsNull() {
            addCriterion("MOQIZHONGXIAN4 is null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian4IsNotNull() {
            addCriterion("MOQIZHONGXIAN4 is not null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian4EqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN4 =", value, "moqizhongxian4");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian4NotEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN4 <>", value, "moqizhongxian4");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian4GreaterThan(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN4 >", value, "moqizhongxian4");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN4 >=", value, "moqizhongxian4");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian4LessThan(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN4 <", value, "moqizhongxian4");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN4 <=", value, "moqizhongxian4");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian4In(List<BigDecimal> values) {
            addCriterion("MOQIZHONGXIAN4 in", values, "moqizhongxian4");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian4NotIn(List<BigDecimal> values) {
            addCriterion("MOQIZHONGXIAN4 not in", values, "moqizhongxian4");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGXIAN4 between", value1, value2, "moqizhongxian4");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGXIAN4 not between", value1, value2, "moqizhongxian4");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji4IsNull() {
            addCriterion("MOQIZHONGHEJI4 is null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji4IsNotNull() {
            addCriterion("MOQIZHONGHEJI4 is not null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji4EqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI4 =", value, "moqizhongheji4");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji4NotEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI4 <>", value, "moqizhongheji4");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji4GreaterThan(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI4 >", value, "moqizhongheji4");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI4 >=", value, "moqizhongheji4");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji4LessThan(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI4 <", value, "moqizhongheji4");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI4 <=", value, "moqizhongheji4");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji4In(List<BigDecimal> values) {
            addCriterion("MOQIZHONGHEJI4 in", values, "moqizhongheji4");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji4NotIn(List<BigDecimal> values) {
            addCriterion("MOQIZHONGHEJI4 not in", values, "moqizhongheji4");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGHEJI4 between", value1, value2, "moqizhongheji4");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGHEJI4 not between", value1, value2, "moqizhongheji4");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian4IsNull() {
            addCriterion("LEIJIQIZHONGFEIXIAN4 is null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian4IsNotNull() {
            addCriterion("LEIJIQIZHONGFEIXIAN4 is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian4EqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN4 =", value, "leijiqizhongfeixian4");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian4NotEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN4 <>", value, "leijiqizhongfeixian4");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian4GreaterThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN4 >", value, "leijiqizhongfeixian4");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN4 >=", value, "leijiqizhongfeixian4");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian4LessThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN4 <", value, "leijiqizhongfeixian4");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN4 <=", value, "leijiqizhongfeixian4");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian4In(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGFEIXIAN4 in", values, "leijiqizhongfeixian4");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian4NotIn(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGFEIXIAN4 not in", values, "leijiqizhongfeixian4");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGFEIXIAN4 between", value1, value2, "leijiqizhongfeixian4");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGFEIXIAN4 not between", value1, value2, "leijiqizhongfeixian4");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian4IsNull() {
            addCriterion("LEIJIQIZHONGXIAN4 is null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian4IsNotNull() {
            addCriterion("LEIJIQIZHONGXIAN4 is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian4EqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN4 =", value, "leijiqizhongxian4");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian4NotEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN4 <>", value, "leijiqizhongxian4");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian4GreaterThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN4 >", value, "leijiqizhongxian4");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN4 >=", value, "leijiqizhongxian4");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian4LessThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN4 <", value, "leijiqizhongxian4");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN4 <=", value, "leijiqizhongxian4");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian4In(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGXIAN4 in", values, "leijiqizhongxian4");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian4NotIn(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGXIAN4 not in", values, "leijiqizhongxian4");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGXIAN4 between", value1, value2, "leijiqizhongxian4");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGXIAN4 not between", value1, value2, "leijiqizhongxian4");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji4IsNull() {
            addCriterion("LEIJIQIZHONGHEJI4 is null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji4IsNotNull() {
            addCriterion("LEIJIQIZHONGHEJI4 is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji4EqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI4 =", value, "leijiqizhongheji4");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji4NotEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI4 <>", value, "leijiqizhongheji4");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji4GreaterThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI4 >", value, "leijiqizhongheji4");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI4 >=", value, "leijiqizhongheji4");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji4LessThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI4 <", value, "leijiqizhongheji4");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI4 <=", value, "leijiqizhongheji4");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji4In(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGHEJI4 in", values, "leijiqizhongheji4");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji4NotIn(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGHEJI4 not in", values, "leijiqizhongheji4");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGHEJI4 between", value1, value2, "leijiqizhongheji4");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGHEJI4 not between", value1, value2, "leijiqizhongheji4");
            return (Criteria) this;
        }

        public Criteria andMoguanlifeixianIsNull() {
            addCriterion("MOGUANLIFEIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andMoguanlifeixianIsNotNull() {
            addCriterion("MOGUANLIFEIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andMoguanlifeixianEqualTo(BigDecimal value) {
            addCriterion("MOGUANLIFEIXIAN =", value, "moguanlifeixian");
            return (Criteria) this;
        }

        public Criteria andMoguanlifeixianNotEqualTo(BigDecimal value) {
            addCriterion("MOGUANLIFEIXIAN <>", value, "moguanlifeixian");
            return (Criteria) this;
        }

        public Criteria andMoguanlifeixianGreaterThan(BigDecimal value) {
            addCriterion("MOGUANLIFEIXIAN >", value, "moguanlifeixian");
            return (Criteria) this;
        }

        public Criteria andMoguanlifeixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOGUANLIFEIXIAN >=", value, "moguanlifeixian");
            return (Criteria) this;
        }

        public Criteria andMoguanlifeixianLessThan(BigDecimal value) {
            addCriterion("MOGUANLIFEIXIAN <", value, "moguanlifeixian");
            return (Criteria) this;
        }

        public Criteria andMoguanlifeixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOGUANLIFEIXIAN <=", value, "moguanlifeixian");
            return (Criteria) this;
        }

        public Criteria andMoguanlifeixianIn(List<BigDecimal> values) {
            addCriterion("MOGUANLIFEIXIAN in", values, "moguanlifeixian");
            return (Criteria) this;
        }

        public Criteria andMoguanlifeixianNotIn(List<BigDecimal> values) {
            addCriterion("MOGUANLIFEIXIAN not in", values, "moguanlifeixian");
            return (Criteria) this;
        }

        public Criteria andMoguanlifeixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOGUANLIFEIXIAN between", value1, value2, "moguanlifeixian");
            return (Criteria) this;
        }

        public Criteria andMoguanlifeixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOGUANLIFEIXIAN not between", value1, value2, "moguanlifeixian");
            return (Criteria) this;
        }

        public Criteria andMoguanlixianIsNull() {
            addCriterion("MOGUANLIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andMoguanlixianIsNotNull() {
            addCriterion("MOGUANLIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andMoguanlixianEqualTo(BigDecimal value) {
            addCriterion("MOGUANLIXIAN =", value, "moguanlixian");
            return (Criteria) this;
        }

        public Criteria andMoguanlixianNotEqualTo(BigDecimal value) {
            addCriterion("MOGUANLIXIAN <>", value, "moguanlixian");
            return (Criteria) this;
        }

        public Criteria andMoguanlixianGreaterThan(BigDecimal value) {
            addCriterion("MOGUANLIXIAN >", value, "moguanlixian");
            return (Criteria) this;
        }

        public Criteria andMoguanlixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOGUANLIXIAN >=", value, "moguanlixian");
            return (Criteria) this;
        }

        public Criteria andMoguanlixianLessThan(BigDecimal value) {
            addCriterion("MOGUANLIXIAN <", value, "moguanlixian");
            return (Criteria) this;
        }

        public Criteria andMoguanlixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOGUANLIXIAN <=", value, "moguanlixian");
            return (Criteria) this;
        }

        public Criteria andMoguanlixianIn(List<BigDecimal> values) {
            addCriterion("MOGUANLIXIAN in", values, "moguanlixian");
            return (Criteria) this;
        }

        public Criteria andMoguanlixianNotIn(List<BigDecimal> values) {
            addCriterion("MOGUANLIXIAN not in", values, "moguanlixian");
            return (Criteria) this;
        }

        public Criteria andMoguanlixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOGUANLIXIAN between", value1, value2, "moguanlixian");
            return (Criteria) this;
        }

        public Criteria andMoguanlixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOGUANLIXIAN not between", value1, value2, "moguanlixian");
            return (Criteria) this;
        }

        public Criteria andMoguanlihejiIsNull() {
            addCriterion("MOGUANLIHEJI is null");
            return (Criteria) this;
        }

        public Criteria andMoguanlihejiIsNotNull() {
            addCriterion("MOGUANLIHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andMoguanlihejiEqualTo(BigDecimal value) {
            addCriterion("MOGUANLIHEJI =", value, "moguanliheji");
            return (Criteria) this;
        }

        public Criteria andMoguanlihejiNotEqualTo(BigDecimal value) {
            addCriterion("MOGUANLIHEJI <>", value, "moguanliheji");
            return (Criteria) this;
        }

        public Criteria andMoguanlihejiGreaterThan(BigDecimal value) {
            addCriterion("MOGUANLIHEJI >", value, "moguanliheji");
            return (Criteria) this;
        }

        public Criteria andMoguanlihejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOGUANLIHEJI >=", value, "moguanliheji");
            return (Criteria) this;
        }

        public Criteria andMoguanlihejiLessThan(BigDecimal value) {
            addCriterion("MOGUANLIHEJI <", value, "moguanliheji");
            return (Criteria) this;
        }

        public Criteria andMoguanlihejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOGUANLIHEJI <=", value, "moguanliheji");
            return (Criteria) this;
        }

        public Criteria andMoguanlihejiIn(List<BigDecimal> values) {
            addCriterion("MOGUANLIHEJI in", values, "moguanliheji");
            return (Criteria) this;
        }

        public Criteria andMoguanlihejiNotIn(List<BigDecimal> values) {
            addCriterion("MOGUANLIHEJI not in", values, "moguanliheji");
            return (Criteria) this;
        }

        public Criteria andMoguanlihejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOGUANLIHEJI between", value1, value2, "moguanliheji");
            return (Criteria) this;
        }

        public Criteria andMoguanlihejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOGUANLIHEJI not between", value1, value2, "moguanliheji");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlifeixianIsNull() {
            addCriterion("LEIJIGUANLIFEIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlifeixianIsNotNull() {
            addCriterion("LEIJIGUANLIFEIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlifeixianEqualTo(BigDecimal value) {
            addCriterion("LEIJIGUANLIFEIXIAN =", value, "leijiguanlifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlifeixianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIGUANLIFEIXIAN <>", value, "leijiguanlifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlifeixianGreaterThan(BigDecimal value) {
            addCriterion("LEIJIGUANLIFEIXIAN >", value, "leijiguanlifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlifeixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIGUANLIFEIXIAN >=", value, "leijiguanlifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlifeixianLessThan(BigDecimal value) {
            addCriterion("LEIJIGUANLIFEIXIAN <", value, "leijiguanlifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlifeixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIGUANLIFEIXIAN <=", value, "leijiguanlifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlifeixianIn(List<BigDecimal> values) {
            addCriterion("LEIJIGUANLIFEIXIAN in", values, "leijiguanlifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlifeixianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIGUANLIFEIXIAN not in", values, "leijiguanlifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlifeixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIGUANLIFEIXIAN between", value1, value2, "leijiguanlifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlifeixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIGUANLIFEIXIAN not between", value1, value2, "leijiguanlifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlixianIsNull() {
            addCriterion("LEIJIGUANLIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlixianIsNotNull() {
            addCriterion("LEIJIGUANLIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlixianEqualTo(BigDecimal value) {
            addCriterion("LEIJIGUANLIXIAN =", value, "leijiguanlixian");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlixianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIGUANLIXIAN <>", value, "leijiguanlixian");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlixianGreaterThan(BigDecimal value) {
            addCriterion("LEIJIGUANLIXIAN >", value, "leijiguanlixian");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIGUANLIXIAN >=", value, "leijiguanlixian");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlixianLessThan(BigDecimal value) {
            addCriterion("LEIJIGUANLIXIAN <", value, "leijiguanlixian");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIGUANLIXIAN <=", value, "leijiguanlixian");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlixianIn(List<BigDecimal> values) {
            addCriterion("LEIJIGUANLIXIAN in", values, "leijiguanlixian");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlixianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIGUANLIXIAN not in", values, "leijiguanlixian");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIGUANLIXIAN between", value1, value2, "leijiguanlixian");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIGUANLIXIAN not between", value1, value2, "leijiguanlixian");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlihejiIsNull() {
            addCriterion("LEIJIGUANLIHEJI is null");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlihejiIsNotNull() {
            addCriterion("LEIJIGUANLIHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlihejiEqualTo(BigDecimal value) {
            addCriterion("LEIJIGUANLIHEJI =", value, "leijiguanliheji");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlihejiNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIGUANLIHEJI <>", value, "leijiguanliheji");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlihejiGreaterThan(BigDecimal value) {
            addCriterion("LEIJIGUANLIHEJI >", value, "leijiguanliheji");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlihejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIGUANLIHEJI >=", value, "leijiguanliheji");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlihejiLessThan(BigDecimal value) {
            addCriterion("LEIJIGUANLIHEJI <", value, "leijiguanliheji");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlihejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIGUANLIHEJI <=", value, "leijiguanliheji");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlihejiIn(List<BigDecimal> values) {
            addCriterion("LEIJIGUANLIHEJI in", values, "leijiguanliheji");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlihejiNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIGUANLIHEJI not in", values, "leijiguanliheji");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlihejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIGUANLIHEJI between", value1, value2, "leijiguanliheji");
            return (Criteria) this;
        }

        public Criteria andLeijiguanlihejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIGUANLIHEJI not between", value1, value2, "leijiguanliheji");
            return (Criteria) this;
        }

        public Criteria andMochouzifeixianIsNull() {
            addCriterion("MOCHOUZIFEIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andMochouzifeixianIsNotNull() {
            addCriterion("MOCHOUZIFEIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andMochouzifeixianEqualTo(BigDecimal value) {
            addCriterion("MOCHOUZIFEIXIAN =", value, "mochouzifeixian");
            return (Criteria) this;
        }

        public Criteria andMochouzifeixianNotEqualTo(BigDecimal value) {
            addCriterion("MOCHOUZIFEIXIAN <>", value, "mochouzifeixian");
            return (Criteria) this;
        }

        public Criteria andMochouzifeixianGreaterThan(BigDecimal value) {
            addCriterion("MOCHOUZIFEIXIAN >", value, "mochouzifeixian");
            return (Criteria) this;
        }

        public Criteria andMochouzifeixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOCHOUZIFEIXIAN >=", value, "mochouzifeixian");
            return (Criteria) this;
        }

        public Criteria andMochouzifeixianLessThan(BigDecimal value) {
            addCriterion("MOCHOUZIFEIXIAN <", value, "mochouzifeixian");
            return (Criteria) this;
        }

        public Criteria andMochouzifeixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOCHOUZIFEIXIAN <=", value, "mochouzifeixian");
            return (Criteria) this;
        }

        public Criteria andMochouzifeixianIn(List<BigDecimal> values) {
            addCriterion("MOCHOUZIFEIXIAN in", values, "mochouzifeixian");
            return (Criteria) this;
        }

        public Criteria andMochouzifeixianNotIn(List<BigDecimal> values) {
            addCriterion("MOCHOUZIFEIXIAN not in", values, "mochouzifeixian");
            return (Criteria) this;
        }

        public Criteria andMochouzifeixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOCHOUZIFEIXIAN between", value1, value2, "mochouzifeixian");
            return (Criteria) this;
        }

        public Criteria andMochouzifeixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOCHOUZIFEIXIAN not between", value1, value2, "mochouzifeixian");
            return (Criteria) this;
        }

        public Criteria andMochouzixianIsNull() {
            addCriterion("MOCHOUZIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andMochouzixianIsNotNull() {
            addCriterion("MOCHOUZIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andMochouzixianEqualTo(BigDecimal value) {
            addCriterion("MOCHOUZIXIAN =", value, "mochouzixian");
            return (Criteria) this;
        }

        public Criteria andMochouzixianNotEqualTo(BigDecimal value) {
            addCriterion("MOCHOUZIXIAN <>", value, "mochouzixian");
            return (Criteria) this;
        }

        public Criteria andMochouzixianGreaterThan(BigDecimal value) {
            addCriterion("MOCHOUZIXIAN >", value, "mochouzixian");
            return (Criteria) this;
        }

        public Criteria andMochouzixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOCHOUZIXIAN >=", value, "mochouzixian");
            return (Criteria) this;
        }

        public Criteria andMochouzixianLessThan(BigDecimal value) {
            addCriterion("MOCHOUZIXIAN <", value, "mochouzixian");
            return (Criteria) this;
        }

        public Criteria andMochouzixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOCHOUZIXIAN <=", value, "mochouzixian");
            return (Criteria) this;
        }

        public Criteria andMochouzixianIn(List<BigDecimal> values) {
            addCriterion("MOCHOUZIXIAN in", values, "mochouzixian");
            return (Criteria) this;
        }

        public Criteria andMochouzixianNotIn(List<BigDecimal> values) {
            addCriterion("MOCHOUZIXIAN not in", values, "mochouzixian");
            return (Criteria) this;
        }

        public Criteria andMochouzixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOCHOUZIXIAN between", value1, value2, "mochouzixian");
            return (Criteria) this;
        }

        public Criteria andMochouzixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOCHOUZIXIAN not between", value1, value2, "mochouzixian");
            return (Criteria) this;
        }

        public Criteria andMochouzihejiIsNull() {
            addCriterion("MOCHOUZIHEJI is null");
            return (Criteria) this;
        }

        public Criteria andMochouzihejiIsNotNull() {
            addCriterion("MOCHOUZIHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andMochouzihejiEqualTo(BigDecimal value) {
            addCriterion("MOCHOUZIHEJI =", value, "mochouziheji");
            return (Criteria) this;
        }

        public Criteria andMochouzihejiNotEqualTo(BigDecimal value) {
            addCriterion("MOCHOUZIHEJI <>", value, "mochouziheji");
            return (Criteria) this;
        }

        public Criteria andMochouzihejiGreaterThan(BigDecimal value) {
            addCriterion("MOCHOUZIHEJI >", value, "mochouziheji");
            return (Criteria) this;
        }

        public Criteria andMochouzihejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOCHOUZIHEJI >=", value, "mochouziheji");
            return (Criteria) this;
        }

        public Criteria andMochouzihejiLessThan(BigDecimal value) {
            addCriterion("MOCHOUZIHEJI <", value, "mochouziheji");
            return (Criteria) this;
        }

        public Criteria andMochouzihejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOCHOUZIHEJI <=", value, "mochouziheji");
            return (Criteria) this;
        }

        public Criteria andMochouzihejiIn(List<BigDecimal> values) {
            addCriterion("MOCHOUZIHEJI in", values, "mochouziheji");
            return (Criteria) this;
        }

        public Criteria andMochouzihejiNotIn(List<BigDecimal> values) {
            addCriterion("MOCHOUZIHEJI not in", values, "mochouziheji");
            return (Criteria) this;
        }

        public Criteria andMochouzihejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOCHOUZIHEJI between", value1, value2, "mochouziheji");
            return (Criteria) this;
        }

        public Criteria andMochouzihejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOCHOUZIHEJI not between", value1, value2, "mochouziheji");
            return (Criteria) this;
        }

        public Criteria andLeijichouzifeixianIsNull() {
            addCriterion("LEIJICHOUZIFEIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijichouzifeixianIsNotNull() {
            addCriterion("LEIJICHOUZIFEIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijichouzifeixianEqualTo(BigDecimal value) {
            addCriterion("LEIJICHOUZIFEIXIAN =", value, "leijichouzifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijichouzifeixianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJICHOUZIFEIXIAN <>", value, "leijichouzifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijichouzifeixianGreaterThan(BigDecimal value) {
            addCriterion("LEIJICHOUZIFEIXIAN >", value, "leijichouzifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijichouzifeixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJICHOUZIFEIXIAN >=", value, "leijichouzifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijichouzifeixianLessThan(BigDecimal value) {
            addCriterion("LEIJICHOUZIFEIXIAN <", value, "leijichouzifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijichouzifeixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJICHOUZIFEIXIAN <=", value, "leijichouzifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijichouzifeixianIn(List<BigDecimal> values) {
            addCriterion("LEIJICHOUZIFEIXIAN in", values, "leijichouzifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijichouzifeixianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJICHOUZIFEIXIAN not in", values, "leijichouzifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijichouzifeixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJICHOUZIFEIXIAN between", value1, value2, "leijichouzifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijichouzifeixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJICHOUZIFEIXIAN not between", value1, value2, "leijichouzifeixian");
            return (Criteria) this;
        }

        public Criteria andLeijichouzixianIsNull() {
            addCriterion("LEIJICHOUZIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijichouzixianIsNotNull() {
            addCriterion("LEIJICHOUZIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijichouzixianEqualTo(BigDecimal value) {
            addCriterion("LEIJICHOUZIXIAN =", value, "leijichouzixian");
            return (Criteria) this;
        }

        public Criteria andLeijichouzixianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJICHOUZIXIAN <>", value, "leijichouzixian");
            return (Criteria) this;
        }

        public Criteria andLeijichouzixianGreaterThan(BigDecimal value) {
            addCriterion("LEIJICHOUZIXIAN >", value, "leijichouzixian");
            return (Criteria) this;
        }

        public Criteria andLeijichouzixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJICHOUZIXIAN >=", value, "leijichouzixian");
            return (Criteria) this;
        }

        public Criteria andLeijichouzixianLessThan(BigDecimal value) {
            addCriterion("LEIJICHOUZIXIAN <", value, "leijichouzixian");
            return (Criteria) this;
        }

        public Criteria andLeijichouzixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJICHOUZIXIAN <=", value, "leijichouzixian");
            return (Criteria) this;
        }

        public Criteria andLeijichouzixianIn(List<BigDecimal> values) {
            addCriterion("LEIJICHOUZIXIAN in", values, "leijichouzixian");
            return (Criteria) this;
        }

        public Criteria andLeijichouzixianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJICHOUZIXIAN not in", values, "leijichouzixian");
            return (Criteria) this;
        }

        public Criteria andLeijichouzixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJICHOUZIXIAN between", value1, value2, "leijichouzixian");
            return (Criteria) this;
        }

        public Criteria andLeijichouzixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJICHOUZIXIAN not between", value1, value2, "leijichouzixian");
            return (Criteria) this;
        }

        public Criteria andLeijichouzihejiIsNull() {
            addCriterion("LEIJICHOUZIHEJI is null");
            return (Criteria) this;
        }

        public Criteria andLeijichouzihejiIsNotNull() {
            addCriterion("LEIJICHOUZIHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andLeijichouzihejiEqualTo(BigDecimal value) {
            addCriterion("LEIJICHOUZIHEJI =", value, "leijichouziheji");
            return (Criteria) this;
        }

        public Criteria andLeijichouzihejiNotEqualTo(BigDecimal value) {
            addCriterion("LEIJICHOUZIHEJI <>", value, "leijichouziheji");
            return (Criteria) this;
        }

        public Criteria andLeijichouzihejiGreaterThan(BigDecimal value) {
            addCriterion("LEIJICHOUZIHEJI >", value, "leijichouziheji");
            return (Criteria) this;
        }

        public Criteria andLeijichouzihejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJICHOUZIHEJI >=", value, "leijichouziheji");
            return (Criteria) this;
        }

        public Criteria andLeijichouzihejiLessThan(BigDecimal value) {
            addCriterion("LEIJICHOUZIHEJI <", value, "leijichouziheji");
            return (Criteria) this;
        }

        public Criteria andLeijichouzihejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJICHOUZIHEJI <=", value, "leijichouziheji");
            return (Criteria) this;
        }

        public Criteria andLeijichouzihejiIn(List<BigDecimal> values) {
            addCriterion("LEIJICHOUZIHEJI in", values, "leijichouziheji");
            return (Criteria) this;
        }

        public Criteria andLeijichouzihejiNotIn(List<BigDecimal> values) {
            addCriterion("LEIJICHOUZIHEJI not in", values, "leijichouziheji");
            return (Criteria) this;
        }

        public Criteria andLeijichouzihejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJICHOUZIHEJI between", value1, value2, "leijichouziheji");
            return (Criteria) this;
        }

        public Criteria andLeijichouzihejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJICHOUZIHEJI not between", value1, value2, "leijichouziheji");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyongfeiIsNull() {
            addCriterion("MOQITAFEIYONGFEI is null");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyongfeiIsNotNull() {
            addCriterion("MOQITAFEIYONGFEI is not null");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyongfeiEqualTo(BigDecimal value) {
            addCriterion("MOQITAFEIYONGFEI =", value, "moqitafeiyongfei");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyongfeiNotEqualTo(BigDecimal value) {
            addCriterion("MOQITAFEIYONGFEI <>", value, "moqitafeiyongfei");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyongfeiGreaterThan(BigDecimal value) {
            addCriterion("MOQITAFEIYONGFEI >", value, "moqitafeiyongfei");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyongfeiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQITAFEIYONGFEI >=", value, "moqitafeiyongfei");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyongfeiLessThan(BigDecimal value) {
            addCriterion("MOQITAFEIYONGFEI <", value, "moqitafeiyongfei");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyongfeiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQITAFEIYONGFEI <=", value, "moqitafeiyongfei");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyongfeiIn(List<BigDecimal> values) {
            addCriterion("MOQITAFEIYONGFEI in", values, "moqitafeiyongfei");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyongfeiNotIn(List<BigDecimal> values) {
            addCriterion("MOQITAFEIYONGFEI not in", values, "moqitafeiyongfei");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyongfeiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQITAFEIYONGFEI between", value1, value2, "moqitafeiyongfei");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyongfeiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQITAFEIYONGFEI not between", value1, value2, "moqitafeiyongfei");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyongxianIsNull() {
            addCriterion("MOQITAFEIYONGXIAN is null");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyongxianIsNotNull() {
            addCriterion("MOQITAFEIYONGXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyongxianEqualTo(BigDecimal value) {
            addCriterion("MOQITAFEIYONGXIAN =", value, "moqitafeiyongxian");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyongxianNotEqualTo(BigDecimal value) {
            addCriterion("MOQITAFEIYONGXIAN <>", value, "moqitafeiyongxian");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyongxianGreaterThan(BigDecimal value) {
            addCriterion("MOQITAFEIYONGXIAN >", value, "moqitafeiyongxian");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyongxianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQITAFEIYONGXIAN >=", value, "moqitafeiyongxian");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyongxianLessThan(BigDecimal value) {
            addCriterion("MOQITAFEIYONGXIAN <", value, "moqitafeiyongxian");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyongxianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQITAFEIYONGXIAN <=", value, "moqitafeiyongxian");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyongxianIn(List<BigDecimal> values) {
            addCriterion("MOQITAFEIYONGXIAN in", values, "moqitafeiyongxian");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyongxianNotIn(List<BigDecimal> values) {
            addCriterion("MOQITAFEIYONGXIAN not in", values, "moqitafeiyongxian");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyongxianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQITAFEIYONGXIAN between", value1, value2, "moqitafeiyongxian");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyongxianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQITAFEIYONGXIAN not between", value1, value2, "moqitafeiyongxian");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyonghejiIsNull() {
            addCriterion("MOQITAFEIYONGHEJI is null");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyonghejiIsNotNull() {
            addCriterion("MOQITAFEIYONGHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyonghejiEqualTo(BigDecimal value) {
            addCriterion("MOQITAFEIYONGHEJI =", value, "moqitafeiyongheji");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyonghejiNotEqualTo(BigDecimal value) {
            addCriterion("MOQITAFEIYONGHEJI <>", value, "moqitafeiyongheji");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyonghejiGreaterThan(BigDecimal value) {
            addCriterion("MOQITAFEIYONGHEJI >", value, "moqitafeiyongheji");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyonghejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQITAFEIYONGHEJI >=", value, "moqitafeiyongheji");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyonghejiLessThan(BigDecimal value) {
            addCriterion("MOQITAFEIYONGHEJI <", value, "moqitafeiyongheji");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyonghejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQITAFEIYONGHEJI <=", value, "moqitafeiyongheji");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyonghejiIn(List<BigDecimal> values) {
            addCriterion("MOQITAFEIYONGHEJI in", values, "moqitafeiyongheji");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyonghejiNotIn(List<BigDecimal> values) {
            addCriterion("MOQITAFEIYONGHEJI not in", values, "moqitafeiyongheji");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyonghejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQITAFEIYONGHEJI between", value1, value2, "moqitafeiyongheji");
            return (Criteria) this;
        }

        public Criteria andMoqitafeiyonghejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQITAFEIYONGHEJI not between", value1, value2, "moqitafeiyongheji");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyongfeixianIsNull() {
            addCriterion("LEIJIQITAFEIYONGFEIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyongfeixianIsNotNull() {
            addCriterion("LEIJIQITAFEIYONGFEIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyongfeixianEqualTo(BigDecimal value) {
            addCriterion("LEIJIQITAFEIYONGFEIXIAN =", value, "leijiqitafeiyongfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyongfeixianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIQITAFEIYONGFEIXIAN <>", value, "leijiqitafeiyongfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyongfeixianGreaterThan(BigDecimal value) {
            addCriterion("LEIJIQITAFEIYONGFEIXIAN >", value, "leijiqitafeiyongfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyongfeixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQITAFEIYONGFEIXIAN >=", value, "leijiqitafeiyongfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyongfeixianLessThan(BigDecimal value) {
            addCriterion("LEIJIQITAFEIYONGFEIXIAN <", value, "leijiqitafeiyongfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyongfeixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQITAFEIYONGFEIXIAN <=", value, "leijiqitafeiyongfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyongfeixianIn(List<BigDecimal> values) {
            addCriterion("LEIJIQITAFEIYONGFEIXIAN in", values, "leijiqitafeiyongfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyongfeixianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIQITAFEIYONGFEIXIAN not in", values, "leijiqitafeiyongfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyongfeixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQITAFEIYONGFEIXIAN between", value1, value2, "leijiqitafeiyongfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyongfeixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQITAFEIYONGFEIXIAN not between", value1, value2, "leijiqitafeiyongfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyongxianIsNull() {
            addCriterion("LEIJIQITAFEIYONGXIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyongxianIsNotNull() {
            addCriterion("LEIJIQITAFEIYONGXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyongxianEqualTo(BigDecimal value) {
            addCriterion("LEIJIQITAFEIYONGXIAN =", value, "leijiqitafeiyongxian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyongxianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIQITAFEIYONGXIAN <>", value, "leijiqitafeiyongxian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyongxianGreaterThan(BigDecimal value) {
            addCriterion("LEIJIQITAFEIYONGXIAN >", value, "leijiqitafeiyongxian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyongxianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQITAFEIYONGXIAN >=", value, "leijiqitafeiyongxian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyongxianLessThan(BigDecimal value) {
            addCriterion("LEIJIQITAFEIYONGXIAN <", value, "leijiqitafeiyongxian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyongxianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQITAFEIYONGXIAN <=", value, "leijiqitafeiyongxian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyongxianIn(List<BigDecimal> values) {
            addCriterion("LEIJIQITAFEIYONGXIAN in", values, "leijiqitafeiyongxian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyongxianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIQITAFEIYONGXIAN not in", values, "leijiqitafeiyongxian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyongxianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQITAFEIYONGXIAN between", value1, value2, "leijiqitafeiyongxian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyongxianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQITAFEIYONGXIAN not between", value1, value2, "leijiqitafeiyongxian");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyonghejiIsNull() {
            addCriterion("LEIJIQITAFEIYONGHEJI is null");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyonghejiIsNotNull() {
            addCriterion("LEIJIQITAFEIYONGHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyonghejiEqualTo(BigDecimal value) {
            addCriterion("LEIJIQITAFEIYONGHEJI =", value, "leijiqitafeiyongheji");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyonghejiNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIQITAFEIYONGHEJI <>", value, "leijiqitafeiyongheji");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyonghejiGreaterThan(BigDecimal value) {
            addCriterion("LEIJIQITAFEIYONGHEJI >", value, "leijiqitafeiyongheji");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyonghejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQITAFEIYONGHEJI >=", value, "leijiqitafeiyongheji");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyonghejiLessThan(BigDecimal value) {
            addCriterion("LEIJIQITAFEIYONGHEJI <", value, "leijiqitafeiyongheji");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyonghejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQITAFEIYONGHEJI <=", value, "leijiqitafeiyongheji");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyonghejiIn(List<BigDecimal> values) {
            addCriterion("LEIJIQITAFEIYONGHEJI in", values, "leijiqitafeiyongheji");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyonghejiNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIQITAFEIYONGHEJI not in", values, "leijiqitafeiyongheji");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyonghejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQITAFEIYONGHEJI between", value1, value2, "leijiqitafeiyongheji");
            return (Criteria) this;
        }

        public Criteria andLeijiqitafeiyonghejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQITAFEIYONGHEJI not between", value1, value2, "leijiqitafeiyongheji");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejifeiIsNull() {
            addCriterion("MOFEIYONGHEJIFEI is null");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejifeiIsNotNull() {
            addCriterion("MOFEIYONGHEJIFEI is not null");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejifeiEqualTo(BigDecimal value) {
            addCriterion("MOFEIYONGHEJIFEI =", value, "mofeiyonghejifei");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejifeiNotEqualTo(BigDecimal value) {
            addCriterion("MOFEIYONGHEJIFEI <>", value, "mofeiyonghejifei");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejifeiGreaterThan(BigDecimal value) {
            addCriterion("MOFEIYONGHEJIFEI >", value, "mofeiyonghejifei");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejifeiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOFEIYONGHEJIFEI >=", value, "mofeiyonghejifei");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejifeiLessThan(BigDecimal value) {
            addCriterion("MOFEIYONGHEJIFEI <", value, "mofeiyonghejifei");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejifeiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOFEIYONGHEJIFEI <=", value, "mofeiyonghejifei");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejifeiIn(List<BigDecimal> values) {
            addCriterion("MOFEIYONGHEJIFEI in", values, "mofeiyonghejifei");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejifeiNotIn(List<BigDecimal> values) {
            addCriterion("MOFEIYONGHEJIFEI not in", values, "mofeiyonghejifei");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejifeiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOFEIYONGHEJIFEI between", value1, value2, "mofeiyonghejifei");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejifeiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOFEIYONGHEJIFEI not between", value1, value2, "mofeiyonghejifei");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejixianIsNull() {
            addCriterion("MOFEIYONGHEJIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejixianIsNotNull() {
            addCriterion("MOFEIYONGHEJIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejixianEqualTo(BigDecimal value) {
            addCriterion("MOFEIYONGHEJIXIAN =", value, "mofeiyonghejixian");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejixianNotEqualTo(BigDecimal value) {
            addCriterion("MOFEIYONGHEJIXIAN <>", value, "mofeiyonghejixian");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejixianGreaterThan(BigDecimal value) {
            addCriterion("MOFEIYONGHEJIXIAN >", value, "mofeiyonghejixian");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOFEIYONGHEJIXIAN >=", value, "mofeiyonghejixian");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejixianLessThan(BigDecimal value) {
            addCriterion("MOFEIYONGHEJIXIAN <", value, "mofeiyonghejixian");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOFEIYONGHEJIXIAN <=", value, "mofeiyonghejixian");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejixianIn(List<BigDecimal> values) {
            addCriterion("MOFEIYONGHEJIXIAN in", values, "mofeiyonghejixian");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejixianNotIn(List<BigDecimal> values) {
            addCriterion("MOFEIYONGHEJIXIAN not in", values, "mofeiyonghejixian");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOFEIYONGHEJIXIAN between", value1, value2, "mofeiyonghejixian");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOFEIYONGHEJIXIAN not between", value1, value2, "mofeiyonghejixian");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejihejiIsNull() {
            addCriterion("MOFEIYONGHEJIHEJI is null");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejihejiIsNotNull() {
            addCriterion("MOFEIYONGHEJIHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejihejiEqualTo(BigDecimal value) {
            addCriterion("MOFEIYONGHEJIHEJI =", value, "mofeiyonghejiheji");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejihejiNotEqualTo(BigDecimal value) {
            addCriterion("MOFEIYONGHEJIHEJI <>", value, "mofeiyonghejiheji");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejihejiGreaterThan(BigDecimal value) {
            addCriterion("MOFEIYONGHEJIHEJI >", value, "mofeiyonghejiheji");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejihejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOFEIYONGHEJIHEJI >=", value, "mofeiyonghejiheji");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejihejiLessThan(BigDecimal value) {
            addCriterion("MOFEIYONGHEJIHEJI <", value, "mofeiyonghejiheji");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejihejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOFEIYONGHEJIHEJI <=", value, "mofeiyonghejiheji");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejihejiIn(List<BigDecimal> values) {
            addCriterion("MOFEIYONGHEJIHEJI in", values, "mofeiyonghejiheji");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejihejiNotIn(List<BigDecimal> values) {
            addCriterion("MOFEIYONGHEJIHEJI not in", values, "mofeiyonghejiheji");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejihejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOFEIYONGHEJIHEJI between", value1, value2, "mofeiyonghejiheji");
            return (Criteria) this;
        }

        public Criteria andMofeiyonghejihejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOFEIYONGHEJIHEJI not between", value1, value2, "mofeiyonghejiheji");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejifeiIsNull() {
            addCriterion("LEIJIFEIYONGHEJIFEI is null");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejifeiIsNotNull() {
            addCriterion("LEIJIFEIYONGHEJIFEI is not null");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejifeiEqualTo(BigDecimal value) {
            addCriterion("LEIJIFEIYONGHEJIFEI =", value, "leijifeiyonghejifei");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejifeiNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIFEIYONGHEJIFEI <>", value, "leijifeiyonghejifei");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejifeiGreaterThan(BigDecimal value) {
            addCriterion("LEIJIFEIYONGHEJIFEI >", value, "leijifeiyonghejifei");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejifeiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIFEIYONGHEJIFEI >=", value, "leijifeiyonghejifei");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejifeiLessThan(BigDecimal value) {
            addCriterion("LEIJIFEIYONGHEJIFEI <", value, "leijifeiyonghejifei");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejifeiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIFEIYONGHEJIFEI <=", value, "leijifeiyonghejifei");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejifeiIn(List<BigDecimal> values) {
            addCriterion("LEIJIFEIYONGHEJIFEI in", values, "leijifeiyonghejifei");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejifeiNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIFEIYONGHEJIFEI not in", values, "leijifeiyonghejifei");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejifeiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIFEIYONGHEJIFEI between", value1, value2, "leijifeiyonghejifei");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejifeiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIFEIYONGHEJIFEI not between", value1, value2, "leijifeiyonghejifei");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejixianIsNull() {
            addCriterion("LEIJIFEIYONGHEJIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejixianIsNotNull() {
            addCriterion("LEIJIFEIYONGHEJIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejixianEqualTo(BigDecimal value) {
            addCriterion("LEIJIFEIYONGHEJIXIAN =", value, "leijifeiyonghejixian");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejixianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIFEIYONGHEJIXIAN <>", value, "leijifeiyonghejixian");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejixianGreaterThan(BigDecimal value) {
            addCriterion("LEIJIFEIYONGHEJIXIAN >", value, "leijifeiyonghejixian");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIFEIYONGHEJIXIAN >=", value, "leijifeiyonghejixian");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejixianLessThan(BigDecimal value) {
            addCriterion("LEIJIFEIYONGHEJIXIAN <", value, "leijifeiyonghejixian");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIFEIYONGHEJIXIAN <=", value, "leijifeiyonghejixian");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejixianIn(List<BigDecimal> values) {
            addCriterion("LEIJIFEIYONGHEJIXIAN in", values, "leijifeiyonghejixian");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejixianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIFEIYONGHEJIXIAN not in", values, "leijifeiyonghejixian");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIFEIYONGHEJIXIAN between", value1, value2, "leijifeiyonghejixian");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIFEIYONGHEJIXIAN not between", value1, value2, "leijifeiyonghejixian");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejihejiIsNull() {
            addCriterion("LEIJIFEIYONGHEJIHEJI is null");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejihejiIsNotNull() {
            addCriterion("LEIJIFEIYONGHEJIHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejihejiEqualTo(BigDecimal value) {
            addCriterion("LEIJIFEIYONGHEJIHEJI =", value, "leijifeiyonghejiheji");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejihejiNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIFEIYONGHEJIHEJI <>", value, "leijifeiyonghejiheji");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejihejiGreaterThan(BigDecimal value) {
            addCriterion("LEIJIFEIYONGHEJIHEJI >", value, "leijifeiyonghejiheji");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejihejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIFEIYONGHEJIHEJI >=", value, "leijifeiyonghejiheji");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejihejiLessThan(BigDecimal value) {
            addCriterion("LEIJIFEIYONGHEJIHEJI <", value, "leijifeiyonghejiheji");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejihejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIFEIYONGHEJIHEJI <=", value, "leijifeiyonghejiheji");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejihejiIn(List<BigDecimal> values) {
            addCriterion("LEIJIFEIYONGHEJIHEJI in", values, "leijifeiyonghejiheji");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejihejiNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIFEIYONGHEJIHEJI not in", values, "leijifeiyonghejiheji");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejihejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIFEIYONGHEJIHEJI between", value1, value2, "leijifeiyonghejiheji");
            return (Criteria) this;
        }

        public Criteria andLeijifeiyonghejihejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIFEIYONGHEJIHEJI not between", value1, value2, "leijifeiyonghejiheji");
            return (Criteria) this;
        }

        public Criteria andMozhuanfeixianIsNull() {
            addCriterion("MOZHUANFEIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andMozhuanfeixianIsNotNull() {
            addCriterion("MOZHUANFEIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andMozhuanfeixianEqualTo(BigDecimal value) {
            addCriterion("MOZHUANFEIXIAN =", value, "mozhuanfeixian");
            return (Criteria) this;
        }

        public Criteria andMozhuanfeixianNotEqualTo(BigDecimal value) {
            addCriterion("MOZHUANFEIXIAN <>", value, "mozhuanfeixian");
            return (Criteria) this;
        }

        public Criteria andMozhuanfeixianGreaterThan(BigDecimal value) {
            addCriterion("MOZHUANFEIXIAN >", value, "mozhuanfeixian");
            return (Criteria) this;
        }

        public Criteria andMozhuanfeixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOZHUANFEIXIAN >=", value, "mozhuanfeixian");
            return (Criteria) this;
        }

        public Criteria andMozhuanfeixianLessThan(BigDecimal value) {
            addCriterion("MOZHUANFEIXIAN <", value, "mozhuanfeixian");
            return (Criteria) this;
        }

        public Criteria andMozhuanfeixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOZHUANFEIXIAN <=", value, "mozhuanfeixian");
            return (Criteria) this;
        }

        public Criteria andMozhuanfeixianIn(List<BigDecimal> values) {
            addCriterion("MOZHUANFEIXIAN in", values, "mozhuanfeixian");
            return (Criteria) this;
        }

        public Criteria andMozhuanfeixianNotIn(List<BigDecimal> values) {
            addCriterion("MOZHUANFEIXIAN not in", values, "mozhuanfeixian");
            return (Criteria) this;
        }

        public Criteria andMozhuanfeixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOZHUANFEIXIAN between", value1, value2, "mozhuanfeixian");
            return (Criteria) this;
        }

        public Criteria andMozhuanfeixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOZHUANFEIXIAN not between", value1, value2, "mozhuanfeixian");
            return (Criteria) this;
        }

        public Criteria andMozhuanxianIsNull() {
            addCriterion("MOZHUANXIAN is null");
            return (Criteria) this;
        }

        public Criteria andMozhuanxianIsNotNull() {
            addCriterion("MOZHUANXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andMozhuanxianEqualTo(BigDecimal value) {
            addCriterion("MOZHUANXIAN =", value, "mozhuanxian");
            return (Criteria) this;
        }

        public Criteria andMozhuanxianNotEqualTo(BigDecimal value) {
            addCriterion("MOZHUANXIAN <>", value, "mozhuanxian");
            return (Criteria) this;
        }

        public Criteria andMozhuanxianGreaterThan(BigDecimal value) {
            addCriterion("MOZHUANXIAN >", value, "mozhuanxian");
            return (Criteria) this;
        }

        public Criteria andMozhuanxianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOZHUANXIAN >=", value, "mozhuanxian");
            return (Criteria) this;
        }

        public Criteria andMozhuanxianLessThan(BigDecimal value) {
            addCriterion("MOZHUANXIAN <", value, "mozhuanxian");
            return (Criteria) this;
        }

        public Criteria andMozhuanxianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOZHUANXIAN <=", value, "mozhuanxian");
            return (Criteria) this;
        }

        public Criteria andMozhuanxianIn(List<BigDecimal> values) {
            addCriterion("MOZHUANXIAN in", values, "mozhuanxian");
            return (Criteria) this;
        }

        public Criteria andMozhuanxianNotIn(List<BigDecimal> values) {
            addCriterion("MOZHUANXIAN not in", values, "mozhuanxian");
            return (Criteria) this;
        }

        public Criteria andMozhuanxianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOZHUANXIAN between", value1, value2, "mozhuanxian");
            return (Criteria) this;
        }

        public Criteria andMozhuanxianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOZHUANXIAN not between", value1, value2, "mozhuanxian");
            return (Criteria) this;
        }

        public Criteria andMozhuanhejiIsNull() {
            addCriterion("MOZHUANHEJI is null");
            return (Criteria) this;
        }

        public Criteria andMozhuanhejiIsNotNull() {
            addCriterion("MOZHUANHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andMozhuanhejiEqualTo(BigDecimal value) {
            addCriterion("MOZHUANHEJI =", value, "mozhuanheji");
            return (Criteria) this;
        }

        public Criteria andMozhuanhejiNotEqualTo(BigDecimal value) {
            addCriterion("MOZHUANHEJI <>", value, "mozhuanheji");
            return (Criteria) this;
        }

        public Criteria andMozhuanhejiGreaterThan(BigDecimal value) {
            addCriterion("MOZHUANHEJI >", value, "mozhuanheji");
            return (Criteria) this;
        }

        public Criteria andMozhuanhejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOZHUANHEJI >=", value, "mozhuanheji");
            return (Criteria) this;
        }

        public Criteria andMozhuanhejiLessThan(BigDecimal value) {
            addCriterion("MOZHUANHEJI <", value, "mozhuanheji");
            return (Criteria) this;
        }

        public Criteria andMozhuanhejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOZHUANHEJI <=", value, "mozhuanheji");
            return (Criteria) this;
        }

        public Criteria andMozhuanhejiIn(List<BigDecimal> values) {
            addCriterion("MOZHUANHEJI in", values, "mozhuanheji");
            return (Criteria) this;
        }

        public Criteria andMozhuanhejiNotIn(List<BigDecimal> values) {
            addCriterion("MOZHUANHEJI not in", values, "mozhuanheji");
            return (Criteria) this;
        }

        public Criteria andMozhuanhejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOZHUANHEJI between", value1, value2, "mozhuanheji");
            return (Criteria) this;
        }

        public Criteria andMozhuanhejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOZHUANHEJI not between", value1, value2, "mozhuanheji");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanfeixianIsNull() {
            addCriterion("LEIJIZHUANFEIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanfeixianIsNotNull() {
            addCriterion("LEIJIZHUANFEIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanfeixianEqualTo(BigDecimal value) {
            addCriterion("LEIJIZHUANFEIXIAN =", value, "leijizhuanfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanfeixianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIZHUANFEIXIAN <>", value, "leijizhuanfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanfeixianGreaterThan(BigDecimal value) {
            addCriterion("LEIJIZHUANFEIXIAN >", value, "leijizhuanfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanfeixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIZHUANFEIXIAN >=", value, "leijizhuanfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanfeixianLessThan(BigDecimal value) {
            addCriterion("LEIJIZHUANFEIXIAN <", value, "leijizhuanfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanfeixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIZHUANFEIXIAN <=", value, "leijizhuanfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanfeixianIn(List<BigDecimal> values) {
            addCriterion("LEIJIZHUANFEIXIAN in", values, "leijizhuanfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanfeixianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIZHUANFEIXIAN not in", values, "leijizhuanfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanfeixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIZHUANFEIXIAN between", value1, value2, "leijizhuanfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanfeixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIZHUANFEIXIAN not between", value1, value2, "leijizhuanfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanxianIsNull() {
            addCriterion("LEIJIZHUANXIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanxianIsNotNull() {
            addCriterion("LEIJIZHUANXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanxianEqualTo(BigDecimal value) {
            addCriterion("LEIJIZHUANXIAN =", value, "leijizhuanxian");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanxianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIZHUANXIAN <>", value, "leijizhuanxian");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanxianGreaterThan(BigDecimal value) {
            addCriterion("LEIJIZHUANXIAN >", value, "leijizhuanxian");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanxianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIZHUANXIAN >=", value, "leijizhuanxian");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanxianLessThan(BigDecimal value) {
            addCriterion("LEIJIZHUANXIAN <", value, "leijizhuanxian");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanxianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIZHUANXIAN <=", value, "leijizhuanxian");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanxianIn(List<BigDecimal> values) {
            addCriterion("LEIJIZHUANXIAN in", values, "leijizhuanxian");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanxianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIZHUANXIAN not in", values, "leijizhuanxian");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanxianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIZHUANXIAN between", value1, value2, "leijizhuanxian");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanxianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIZHUANXIAN not between", value1, value2, "leijizhuanxian");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanhejiIsNull() {
            addCriterion("LEIJIZHUANHEJI is null");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanhejiIsNotNull() {
            addCriterion("LEIJIZHUANHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanhejiEqualTo(BigDecimal value) {
            addCriterion("LEIJIZHUANHEJI =", value, "leijizhuanheji");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanhejiNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIZHUANHEJI <>", value, "leijizhuanheji");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanhejiGreaterThan(BigDecimal value) {
            addCriterion("LEIJIZHUANHEJI >", value, "leijizhuanheji");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanhejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIZHUANHEJI >=", value, "leijizhuanheji");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanhejiLessThan(BigDecimal value) {
            addCriterion("LEIJIZHUANHEJI <", value, "leijizhuanheji");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanhejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIZHUANHEJI <=", value, "leijizhuanheji");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanhejiIn(List<BigDecimal> values) {
            addCriterion("LEIJIZHUANHEJI in", values, "leijizhuanheji");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanhejiNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIZHUANHEJI not in", values, "leijizhuanheji");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanhejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIZHUANHEJI between", value1, value2, "leijizhuanheji");
            return (Criteria) this;
        }

        public Criteria andLeijizhuanhejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIZHUANHEJI not between", value1, value2, "leijizhuanheji");
            return (Criteria) this;
        }

        public Criteria andMobiandongfeixianIsNull() {
            addCriterion("MOBIANDONGFEIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andMobiandongfeixianIsNotNull() {
            addCriterion("MOBIANDONGFEIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andMobiandongfeixianEqualTo(BigDecimal value) {
            addCriterion("MOBIANDONGFEIXIAN =", value, "mobiandongfeixian");
            return (Criteria) this;
        }

        public Criteria andMobiandongfeixianNotEqualTo(BigDecimal value) {
            addCriterion("MOBIANDONGFEIXIAN <>", value, "mobiandongfeixian");
            return (Criteria) this;
        }

        public Criteria andMobiandongfeixianGreaterThan(BigDecimal value) {
            addCriterion("MOBIANDONGFEIXIAN >", value, "mobiandongfeixian");
            return (Criteria) this;
        }

        public Criteria andMobiandongfeixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOBIANDONGFEIXIAN >=", value, "mobiandongfeixian");
            return (Criteria) this;
        }

        public Criteria andMobiandongfeixianLessThan(BigDecimal value) {
            addCriterion("MOBIANDONGFEIXIAN <", value, "mobiandongfeixian");
            return (Criteria) this;
        }

        public Criteria andMobiandongfeixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOBIANDONGFEIXIAN <=", value, "mobiandongfeixian");
            return (Criteria) this;
        }

        public Criteria andMobiandongfeixianIn(List<BigDecimal> values) {
            addCriterion("MOBIANDONGFEIXIAN in", values, "mobiandongfeixian");
            return (Criteria) this;
        }

        public Criteria andMobiandongfeixianNotIn(List<BigDecimal> values) {
            addCriterion("MOBIANDONGFEIXIAN not in", values, "mobiandongfeixian");
            return (Criteria) this;
        }

        public Criteria andMobiandongfeixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOBIANDONGFEIXIAN between", value1, value2, "mobiandongfeixian");
            return (Criteria) this;
        }

        public Criteria andMobiandongfeixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOBIANDONGFEIXIAN not between", value1, value2, "mobiandongfeixian");
            return (Criteria) this;
        }

        public Criteria andMobiandongxianIsNull() {
            addCriterion("MOBIANDONGXIAN is null");
            return (Criteria) this;
        }

        public Criteria andMobiandongxianIsNotNull() {
            addCriterion("MOBIANDONGXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andMobiandongxianEqualTo(BigDecimal value) {
            addCriterion("MOBIANDONGXIAN =", value, "mobiandongxian");
            return (Criteria) this;
        }

        public Criteria andMobiandongxianNotEqualTo(BigDecimal value) {
            addCriterion("MOBIANDONGXIAN <>", value, "mobiandongxian");
            return (Criteria) this;
        }

        public Criteria andMobiandongxianGreaterThan(BigDecimal value) {
            addCriterion("MOBIANDONGXIAN >", value, "mobiandongxian");
            return (Criteria) this;
        }

        public Criteria andMobiandongxianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOBIANDONGXIAN >=", value, "mobiandongxian");
            return (Criteria) this;
        }

        public Criteria andMobiandongxianLessThan(BigDecimal value) {
            addCriterion("MOBIANDONGXIAN <", value, "mobiandongxian");
            return (Criteria) this;
        }

        public Criteria andMobiandongxianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOBIANDONGXIAN <=", value, "mobiandongxian");
            return (Criteria) this;
        }

        public Criteria andMobiandongxianIn(List<BigDecimal> values) {
            addCriterion("MOBIANDONGXIAN in", values, "mobiandongxian");
            return (Criteria) this;
        }

        public Criteria andMobiandongxianNotIn(List<BigDecimal> values) {
            addCriterion("MOBIANDONGXIAN not in", values, "mobiandongxian");
            return (Criteria) this;
        }

        public Criteria andMobiandongxianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOBIANDONGXIAN between", value1, value2, "mobiandongxian");
            return (Criteria) this;
        }

        public Criteria andMobiandongxianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOBIANDONGXIAN not between", value1, value2, "mobiandongxian");
            return (Criteria) this;
        }

        public Criteria andMobiandonghejiIsNull() {
            addCriterion("MOBIANDONGHEJI is null");
            return (Criteria) this;
        }

        public Criteria andMobiandonghejiIsNotNull() {
            addCriterion("MOBIANDONGHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andMobiandonghejiEqualTo(BigDecimal value) {
            addCriterion("MOBIANDONGHEJI =", value, "mobiandongheji");
            return (Criteria) this;
        }

        public Criteria andMobiandonghejiNotEqualTo(BigDecimal value) {
            addCriterion("MOBIANDONGHEJI <>", value, "mobiandongheji");
            return (Criteria) this;
        }

        public Criteria andMobiandonghejiGreaterThan(BigDecimal value) {
            addCriterion("MOBIANDONGHEJI >", value, "mobiandongheji");
            return (Criteria) this;
        }

        public Criteria andMobiandonghejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOBIANDONGHEJI >=", value, "mobiandongheji");
            return (Criteria) this;
        }

        public Criteria andMobiandonghejiLessThan(BigDecimal value) {
            addCriterion("MOBIANDONGHEJI <", value, "mobiandongheji");
            return (Criteria) this;
        }

        public Criteria andMobiandonghejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOBIANDONGHEJI <=", value, "mobiandongheji");
            return (Criteria) this;
        }

        public Criteria andMobiandonghejiIn(List<BigDecimal> values) {
            addCriterion("MOBIANDONGHEJI in", values, "mobiandongheji");
            return (Criteria) this;
        }

        public Criteria andMobiandonghejiNotIn(List<BigDecimal> values) {
            addCriterion("MOBIANDONGHEJI not in", values, "mobiandongheji");
            return (Criteria) this;
        }

        public Criteria andMobiandonghejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOBIANDONGHEJI between", value1, value2, "mobiandongheji");
            return (Criteria) this;
        }

        public Criteria andMobiandonghejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOBIANDONGHEJI not between", value1, value2, "mobiandongheji");
            return (Criteria) this;
        }

        public Criteria andLeijibiandongfeixianIsNull() {
            addCriterion("LEIJIBIANDONGFEIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijibiandongfeixianIsNotNull() {
            addCriterion("LEIJIBIANDONGFEIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijibiandongfeixianEqualTo(BigDecimal value) {
            addCriterion("LEIJIBIANDONGFEIXIAN =", value, "leijibiandongfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijibiandongfeixianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIBIANDONGFEIXIAN <>", value, "leijibiandongfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijibiandongfeixianGreaterThan(BigDecimal value) {
            addCriterion("LEIJIBIANDONGFEIXIAN >", value, "leijibiandongfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijibiandongfeixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIBIANDONGFEIXIAN >=", value, "leijibiandongfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijibiandongfeixianLessThan(BigDecimal value) {
            addCriterion("LEIJIBIANDONGFEIXIAN <", value, "leijibiandongfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijibiandongfeixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIBIANDONGFEIXIAN <=", value, "leijibiandongfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijibiandongfeixianIn(List<BigDecimal> values) {
            addCriterion("LEIJIBIANDONGFEIXIAN in", values, "leijibiandongfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijibiandongfeixianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIBIANDONGFEIXIAN not in", values, "leijibiandongfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijibiandongfeixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIBIANDONGFEIXIAN between", value1, value2, "leijibiandongfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijibiandongfeixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIBIANDONGFEIXIAN not between", value1, value2, "leijibiandongfeixian");
            return (Criteria) this;
        }

        public Criteria andLeijibiandongxianIsNull() {
            addCriterion("LEIJIBIANDONGXIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijibiandongxianIsNotNull() {
            addCriterion("LEIJIBIANDONGXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijibiandongxianEqualTo(BigDecimal value) {
            addCriterion("LEIJIBIANDONGXIAN =", value, "leijibiandongxian");
            return (Criteria) this;
        }

        public Criteria andLeijibiandongxianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIBIANDONGXIAN <>", value, "leijibiandongxian");
            return (Criteria) this;
        }

        public Criteria andLeijibiandongxianGreaterThan(BigDecimal value) {
            addCriterion("LEIJIBIANDONGXIAN >", value, "leijibiandongxian");
            return (Criteria) this;
        }

        public Criteria andLeijibiandongxianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIBIANDONGXIAN >=", value, "leijibiandongxian");
            return (Criteria) this;
        }

        public Criteria andLeijibiandongxianLessThan(BigDecimal value) {
            addCriterion("LEIJIBIANDONGXIAN <", value, "leijibiandongxian");
            return (Criteria) this;
        }

        public Criteria andLeijibiandongxianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIBIANDONGXIAN <=", value, "leijibiandongxian");
            return (Criteria) this;
        }

        public Criteria andLeijibiandongxianIn(List<BigDecimal> values) {
            addCriterion("LEIJIBIANDONGXIAN in", values, "leijibiandongxian");
            return (Criteria) this;
        }

        public Criteria andLeijibiandongxianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIBIANDONGXIAN not in", values, "leijibiandongxian");
            return (Criteria) this;
        }

        public Criteria andLeijibiandongxianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIBIANDONGXIAN between", value1, value2, "leijibiandongxian");
            return (Criteria) this;
        }

        public Criteria andLeijibiandongxianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIBIANDONGXIAN not between", value1, value2, "leijibiandongxian");
            return (Criteria) this;
        }

        public Criteria andLeijibiandonghejiIsNull() {
            addCriterion("LEIJIBIANDONGHEJI is null");
            return (Criteria) this;
        }

        public Criteria andLeijibiandonghejiIsNotNull() {
            addCriterion("LEIJIBIANDONGHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andLeijibiandonghejiEqualTo(BigDecimal value) {
            addCriterion("LEIJIBIANDONGHEJI =", value, "leijibiandongheji");
            return (Criteria) this;
        }

        public Criteria andLeijibiandonghejiNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIBIANDONGHEJI <>", value, "leijibiandongheji");
            return (Criteria) this;
        }

        public Criteria andLeijibiandonghejiGreaterThan(BigDecimal value) {
            addCriterion("LEIJIBIANDONGHEJI >", value, "leijibiandongheji");
            return (Criteria) this;
        }

        public Criteria andLeijibiandonghejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIBIANDONGHEJI >=", value, "leijibiandongheji");
            return (Criteria) this;
        }

        public Criteria andLeijibiandonghejiLessThan(BigDecimal value) {
            addCriterion("LEIJIBIANDONGHEJI <", value, "leijibiandongheji");
            return (Criteria) this;
        }

        public Criteria andLeijibiandonghejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIBIANDONGHEJI <=", value, "leijibiandongheji");
            return (Criteria) this;
        }

        public Criteria andLeijibiandonghejiIn(List<BigDecimal> values) {
            addCriterion("LEIJIBIANDONGHEJI in", values, "leijibiandongheji");
            return (Criteria) this;
        }

        public Criteria andLeijibiandonghejiNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIBIANDONGHEJI not in", values, "leijibiandongheji");
            return (Criteria) this;
        }

        public Criteria andLeijibiandonghejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIBIANDONGHEJI between", value1, value2, "leijibiandongheji");
            return (Criteria) this;
        }

        public Criteria andLeijibiandonghejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIBIANDONGHEJI not between", value1, value2, "leijibiandongheji");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhuxianIsNull() {
            addCriterion("LEIJIBUZHUXIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhuxianIsNotNull() {
            addCriterion("LEIJIBUZHUXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhuxianEqualTo(BigDecimal value) {
            addCriterion("LEIJIBUZHUXIAN =", value, "leijibuzhuxian");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhuxianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIBUZHUXIAN <>", value, "leijibuzhuxian");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhuxianGreaterThan(BigDecimal value) {
            addCriterion("LEIJIBUZHUXIAN >", value, "leijibuzhuxian");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhuxianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIBUZHUXIAN >=", value, "leijibuzhuxian");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhuxianLessThan(BigDecimal value) {
            addCriterion("LEIJIBUZHUXIAN <", value, "leijibuzhuxian");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhuxianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIBUZHUXIAN <=", value, "leijibuzhuxian");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhuxianIn(List<BigDecimal> values) {
            addCriterion("LEIJIBUZHUXIAN in", values, "leijibuzhuxian");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhuxianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIBUZHUXIAN not in", values, "leijibuzhuxian");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhuxianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIBUZHUXIAN between", value1, value2, "leijibuzhuxian");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhuxianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIBUZHUXIAN not between", value1, value2, "leijibuzhuxian");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhuhejiIsNull() {
            addCriterion("LEIJIBUZHUHEJI is null");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhuhejiIsNotNull() {
            addCriterion("LEIJIBUZHUHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhuhejiEqualTo(BigDecimal value) {
            addCriterion("LEIJIBUZHUHEJI =", value, "leijibuzhuheji");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhuhejiNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIBUZHUHEJI <>", value, "leijibuzhuheji");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhuhejiGreaterThan(BigDecimal value) {
            addCriterion("LEIJIBUZHUHEJI >", value, "leijibuzhuheji");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhuhejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIBUZHUHEJI >=", value, "leijibuzhuheji");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhuhejiLessThan(BigDecimal value) {
            addCriterion("LEIJIBUZHUHEJI <", value, "leijibuzhuheji");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhuhejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIBUZHUHEJI <=", value, "leijibuzhuheji");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhuhejiIn(List<BigDecimal> values) {
            addCriterion("LEIJIBUZHUHEJI in", values, "leijibuzhuheji");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhuhejiNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIBUZHUHEJI not in", values, "leijibuzhuheji");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhuhejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIBUZHUHEJI between", value1, value2, "leijibuzhuheji");
            return (Criteria) this;
        }

        public Criteria andLeijibuzhuhejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIBUZHUHEJI not between", value1, value2, "leijibuzhuheji");
            return (Criteria) this;
        }

        public Criteria andQizhong1IsNull() {
            addCriterion("QIZHONG1 is null");
            return (Criteria) this;
        }

        public Criteria andQizhong1IsNotNull() {
            addCriterion("QIZHONG1 is not null");
            return (Criteria) this;
        }

        public Criteria andQizhong1EqualTo(String value) {
            addCriterion("QIZHONG1 =", value, "qizhong1");
            return (Criteria) this;
        }

        public Criteria andQizhong1NotEqualTo(String value) {
            addCriterion("QIZHONG1 <>", value, "qizhong1");
            return (Criteria) this;
        }

        public Criteria andQizhong1GreaterThan(String value) {
            addCriterion("QIZHONG1 >", value, "qizhong1");
            return (Criteria) this;
        }

        public Criteria andQizhong1GreaterThanOrEqualTo(String value) {
            addCriterion("QIZHONG1 >=", value, "qizhong1");
            return (Criteria) this;
        }

        public Criteria andQizhong1LessThan(String value) {
            addCriterion("QIZHONG1 <", value, "qizhong1");
            return (Criteria) this;
        }

        public Criteria andQizhong1LessThanOrEqualTo(String value) {
            addCriterion("QIZHONG1 <=", value, "qizhong1");
            return (Criteria) this;
        }

        public Criteria andQizhong1Like(String value) {
            addCriterion("QIZHONG1 like", value, "qizhong1");
            return (Criteria) this;
        }

        public Criteria andQizhong1NotLike(String value) {
            addCriterion("QIZHONG1 not like", value, "qizhong1");
            return (Criteria) this;
        }

        public Criteria andQizhong1In(List<String> values) {
            addCriterion("QIZHONG1 in", values, "qizhong1");
            return (Criteria) this;
        }

        public Criteria andQizhong1NotIn(List<String> values) {
            addCriterion("QIZHONG1 not in", values, "qizhong1");
            return (Criteria) this;
        }

        public Criteria andQizhong1Between(String value1, String value2) {
            addCriterion("QIZHONG1 between", value1, value2, "qizhong1");
            return (Criteria) this;
        }

        public Criteria andQizhong1NotBetween(String value1, String value2) {
            addCriterion("QIZHONG1 not between", value1, value2, "qizhong1");
            return (Criteria) this;
        }

        public Criteria andQizhong2IsNull() {
            addCriterion("QIZHONG2 is null");
            return (Criteria) this;
        }

        public Criteria andQizhong2IsNotNull() {
            addCriterion("QIZHONG2 is not null");
            return (Criteria) this;
        }

        public Criteria andQizhong2EqualTo(String value) {
            addCriterion("QIZHONG2 =", value, "qizhong2");
            return (Criteria) this;
        }

        public Criteria andQizhong2NotEqualTo(String value) {
            addCriterion("QIZHONG2 <>", value, "qizhong2");
            return (Criteria) this;
        }

        public Criteria andQizhong2GreaterThan(String value) {
            addCriterion("QIZHONG2 >", value, "qizhong2");
            return (Criteria) this;
        }

        public Criteria andQizhong2GreaterThanOrEqualTo(String value) {
            addCriterion("QIZHONG2 >=", value, "qizhong2");
            return (Criteria) this;
        }

        public Criteria andQizhong2LessThan(String value) {
            addCriterion("QIZHONG2 <", value, "qizhong2");
            return (Criteria) this;
        }

        public Criteria andQizhong2LessThanOrEqualTo(String value) {
            addCriterion("QIZHONG2 <=", value, "qizhong2");
            return (Criteria) this;
        }

        public Criteria andQizhong2Like(String value) {
            addCriterion("QIZHONG2 like", value, "qizhong2");
            return (Criteria) this;
        }

        public Criteria andQizhong2NotLike(String value) {
            addCriterion("QIZHONG2 not like", value, "qizhong2");
            return (Criteria) this;
        }

        public Criteria andQizhong2In(List<String> values) {
            addCriterion("QIZHONG2 in", values, "qizhong2");
            return (Criteria) this;
        }

        public Criteria andQizhong2NotIn(List<String> values) {
            addCriterion("QIZHONG2 not in", values, "qizhong2");
            return (Criteria) this;
        }

        public Criteria andQizhong2Between(String value1, String value2) {
            addCriterion("QIZHONG2 between", value1, value2, "qizhong2");
            return (Criteria) this;
        }

        public Criteria andQizhong2NotBetween(String value1, String value2) {
            addCriterion("QIZHONG2 not between", value1, value2, "qizhong2");
            return (Criteria) this;
        }

        public Criteria andQizhong3IsNull() {
            addCriterion("QIZHONG3 is null");
            return (Criteria) this;
        }

        public Criteria andQizhong3IsNotNull() {
            addCriterion("QIZHONG3 is not null");
            return (Criteria) this;
        }

        public Criteria andQizhong3EqualTo(String value) {
            addCriterion("QIZHONG3 =", value, "qizhong3");
            return (Criteria) this;
        }

        public Criteria andQizhong3NotEqualTo(String value) {
            addCriterion("QIZHONG3 <>", value, "qizhong3");
            return (Criteria) this;
        }

        public Criteria andQizhong3GreaterThan(String value) {
            addCriterion("QIZHONG3 >", value, "qizhong3");
            return (Criteria) this;
        }

        public Criteria andQizhong3GreaterThanOrEqualTo(String value) {
            addCriterion("QIZHONG3 >=", value, "qizhong3");
            return (Criteria) this;
        }

        public Criteria andQizhong3LessThan(String value) {
            addCriterion("QIZHONG3 <", value, "qizhong3");
            return (Criteria) this;
        }

        public Criteria andQizhong3LessThanOrEqualTo(String value) {
            addCriterion("QIZHONG3 <=", value, "qizhong3");
            return (Criteria) this;
        }

        public Criteria andQizhong3Like(String value) {
            addCriterion("QIZHONG3 like", value, "qizhong3");
            return (Criteria) this;
        }

        public Criteria andQizhong3NotLike(String value) {
            addCriterion("QIZHONG3 not like", value, "qizhong3");
            return (Criteria) this;
        }

        public Criteria andQizhong3In(List<String> values) {
            addCriterion("QIZHONG3 in", values, "qizhong3");
            return (Criteria) this;
        }

        public Criteria andQizhong3NotIn(List<String> values) {
            addCriterion("QIZHONG3 not in", values, "qizhong3");
            return (Criteria) this;
        }

        public Criteria andQizhong3Between(String value1, String value2) {
            addCriterion("QIZHONG3 between", value1, value2, "qizhong3");
            return (Criteria) this;
        }

        public Criteria andQizhong3NotBetween(String value1, String value2) {
            addCriterion("QIZHONG3 not between", value1, value2, "qizhong3");
            return (Criteria) this;
        }

        public Criteria andQizhong4IsNull() {
            addCriterion("QIZHONG4 is null");
            return (Criteria) this;
        }

        public Criteria andQizhong4IsNotNull() {
            addCriterion("QIZHONG4 is not null");
            return (Criteria) this;
        }

        public Criteria andQizhong4EqualTo(String value) {
            addCriterion("QIZHONG4 =", value, "qizhong4");
            return (Criteria) this;
        }

        public Criteria andQizhong4NotEqualTo(String value) {
            addCriterion("QIZHONG4 <>", value, "qizhong4");
            return (Criteria) this;
        }

        public Criteria andQizhong4GreaterThan(String value) {
            addCriterion("QIZHONG4 >", value, "qizhong4");
            return (Criteria) this;
        }

        public Criteria andQizhong4GreaterThanOrEqualTo(String value) {
            addCriterion("QIZHONG4 >=", value, "qizhong4");
            return (Criteria) this;
        }

        public Criteria andQizhong4LessThan(String value) {
            addCriterion("QIZHONG4 <", value, "qizhong4");
            return (Criteria) this;
        }

        public Criteria andQizhong4LessThanOrEqualTo(String value) {
            addCriterion("QIZHONG4 <=", value, "qizhong4");
            return (Criteria) this;
        }

        public Criteria andQizhong4Like(String value) {
            addCriterion("QIZHONG4 like", value, "qizhong4");
            return (Criteria) this;
        }

        public Criteria andQizhong4NotLike(String value) {
            addCriterion("QIZHONG4 not like", value, "qizhong4");
            return (Criteria) this;
        }

        public Criteria andQizhong4In(List<String> values) {
            addCriterion("QIZHONG4 in", values, "qizhong4");
            return (Criteria) this;
        }

        public Criteria andQizhong4NotIn(List<String> values) {
            addCriterion("QIZHONG4 not in", values, "qizhong4");
            return (Criteria) this;
        }

        public Criteria andQizhong4Between(String value1, String value2) {
            addCriterion("QIZHONG4 between", value1, value2, "qizhong4");
            return (Criteria) this;
        }

        public Criteria andQizhong4NotBetween(String value1, String value2) {
            addCriterion("QIZHONG4 not between", value1, value2, "qizhong4");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian5IsNull() {
            addCriterion("MOQIZHONGFEIXIAN5 is null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian5IsNotNull() {
            addCriterion("MOQIZHONGFEIXIAN5 is not null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian5EqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN5 =", value, "moqizhongfeixian5");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian5NotEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN5 <>", value, "moqizhongfeixian5");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian5GreaterThan(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN5 >", value, "moqizhongfeixian5");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN5 >=", value, "moqizhongfeixian5");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian5LessThan(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN5 <", value, "moqizhongfeixian5");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN5 <=", value, "moqizhongfeixian5");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian5In(List<BigDecimal> values) {
            addCriterion("MOQIZHONGFEIXIAN5 in", values, "moqizhongfeixian5");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian5NotIn(List<BigDecimal> values) {
            addCriterion("MOQIZHONGFEIXIAN5 not in", values, "moqizhongfeixian5");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGFEIXIAN5 between", value1, value2, "moqizhongfeixian5");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGFEIXIAN5 not between", value1, value2, "moqizhongfeixian5");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian6IsNull() {
            addCriterion("MOQIZHONGFEIXIAN6 is null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian6IsNotNull() {
            addCriterion("MOQIZHONGFEIXIAN6 is not null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian6EqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN6 =", value, "moqizhongfeixian6");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian6NotEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN6 <>", value, "moqizhongfeixian6");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian6GreaterThan(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN6 >", value, "moqizhongfeixian6");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN6 >=", value, "moqizhongfeixian6");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian6LessThan(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN6 <", value, "moqizhongfeixian6");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN6 <=", value, "moqizhongfeixian6");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian6In(List<BigDecimal> values) {
            addCriterion("MOQIZHONGFEIXIAN6 in", values, "moqizhongfeixian6");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian6NotIn(List<BigDecimal> values) {
            addCriterion("MOQIZHONGFEIXIAN6 not in", values, "moqizhongfeixian6");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGFEIXIAN6 between", value1, value2, "moqizhongfeixian6");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGFEIXIAN6 not between", value1, value2, "moqizhongfeixian6");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian7IsNull() {
            addCriterion("MOQIZHONGFEIXIAN7 is null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian7IsNotNull() {
            addCriterion("MOQIZHONGFEIXIAN7 is not null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian7EqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN7 =", value, "moqizhongfeixian7");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian7NotEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN7 <>", value, "moqizhongfeixian7");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian7GreaterThan(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN7 >", value, "moqizhongfeixian7");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian7GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN7 >=", value, "moqizhongfeixian7");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian7LessThan(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN7 <", value, "moqizhongfeixian7");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian7LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN7 <=", value, "moqizhongfeixian7");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian7In(List<BigDecimal> values) {
            addCriterion("MOQIZHONGFEIXIAN7 in", values, "moqizhongfeixian7");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian7NotIn(List<BigDecimal> values) {
            addCriterion("MOQIZHONGFEIXIAN7 not in", values, "moqizhongfeixian7");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian7Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGFEIXIAN7 between", value1, value2, "moqizhongfeixian7");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian7NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGFEIXIAN7 not between", value1, value2, "moqizhongfeixian7");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian8IsNull() {
            addCriterion("MOQIZHONGFEIXIAN8 is null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian8IsNotNull() {
            addCriterion("MOQIZHONGFEIXIAN8 is not null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian8EqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN8 =", value, "moqizhongfeixian8");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian8NotEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN8 <>", value, "moqizhongfeixian8");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian8GreaterThan(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN8 >", value, "moqizhongfeixian8");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian8GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN8 >=", value, "moqizhongfeixian8");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian8LessThan(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN8 <", value, "moqizhongfeixian8");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian8LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGFEIXIAN8 <=", value, "moqizhongfeixian8");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian8In(List<BigDecimal> values) {
            addCriterion("MOQIZHONGFEIXIAN8 in", values, "moqizhongfeixian8");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian8NotIn(List<BigDecimal> values) {
            addCriterion("MOQIZHONGFEIXIAN8 not in", values, "moqizhongfeixian8");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian8Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGFEIXIAN8 between", value1, value2, "moqizhongfeixian8");
            return (Criteria) this;
        }

        public Criteria andMoqizhongfeixian8NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGFEIXIAN8 not between", value1, value2, "moqizhongfeixian8");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian5IsNull() {
            addCriterion("MOQIZHONGXIAN5 is null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian5IsNotNull() {
            addCriterion("MOQIZHONGXIAN5 is not null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian5EqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN5 =", value, "moqizhongxian5");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian5NotEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN5 <>", value, "moqizhongxian5");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian5GreaterThan(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN5 >", value, "moqizhongxian5");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN5 >=", value, "moqizhongxian5");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian5LessThan(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN5 <", value, "moqizhongxian5");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN5 <=", value, "moqizhongxian5");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian5In(List<BigDecimal> values) {
            addCriterion("MOQIZHONGXIAN5 in", values, "moqizhongxian5");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian5NotIn(List<BigDecimal> values) {
            addCriterion("MOQIZHONGXIAN5 not in", values, "moqizhongxian5");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGXIAN5 between", value1, value2, "moqizhongxian5");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGXIAN5 not between", value1, value2, "moqizhongxian5");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian6IsNull() {
            addCriterion("MOQIZHONGXIAN6 is null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian6IsNotNull() {
            addCriterion("MOQIZHONGXIAN6 is not null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian6EqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN6 =", value, "moqizhongxian6");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian6NotEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN6 <>", value, "moqizhongxian6");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian6GreaterThan(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN6 >", value, "moqizhongxian6");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN6 >=", value, "moqizhongxian6");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian6LessThan(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN6 <", value, "moqizhongxian6");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN6 <=", value, "moqizhongxian6");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian6In(List<BigDecimal> values) {
            addCriterion("MOQIZHONGXIAN6 in", values, "moqizhongxian6");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian6NotIn(List<BigDecimal> values) {
            addCriterion("MOQIZHONGXIAN6 not in", values, "moqizhongxian6");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGXIAN6 between", value1, value2, "moqizhongxian6");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGXIAN6 not between", value1, value2, "moqizhongxian6");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian7IsNull() {
            addCriterion("MOQIZHONGXIAN7 is null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian7IsNotNull() {
            addCriterion("MOQIZHONGXIAN7 is not null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian7EqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN7 =", value, "moqizhongxian7");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian7NotEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN7 <>", value, "moqizhongxian7");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian7GreaterThan(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN7 >", value, "moqizhongxian7");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian7GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN7 >=", value, "moqizhongxian7");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian7LessThan(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN7 <", value, "moqizhongxian7");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian7LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN7 <=", value, "moqizhongxian7");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian7In(List<BigDecimal> values) {
            addCriterion("MOQIZHONGXIAN7 in", values, "moqizhongxian7");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian7NotIn(List<BigDecimal> values) {
            addCriterion("MOQIZHONGXIAN7 not in", values, "moqizhongxian7");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian7Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGXIAN7 between", value1, value2, "moqizhongxian7");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian7NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGXIAN7 not between", value1, value2, "moqizhongxian7");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian8IsNull() {
            addCriterion("MOQIZHONGXIAN8 is null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian8IsNotNull() {
            addCriterion("MOQIZHONGXIAN8 is not null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian8EqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN8 =", value, "moqizhongxian8");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian8NotEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN8 <>", value, "moqizhongxian8");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian8GreaterThan(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN8 >", value, "moqizhongxian8");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian8GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN8 >=", value, "moqizhongxian8");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian8LessThan(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN8 <", value, "moqizhongxian8");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian8LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGXIAN8 <=", value, "moqizhongxian8");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian8In(List<BigDecimal> values) {
            addCriterion("MOQIZHONGXIAN8 in", values, "moqizhongxian8");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian8NotIn(List<BigDecimal> values) {
            addCriterion("MOQIZHONGXIAN8 not in", values, "moqizhongxian8");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian8Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGXIAN8 between", value1, value2, "moqizhongxian8");
            return (Criteria) this;
        }

        public Criteria andMoqizhongxian8NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGXIAN8 not between", value1, value2, "moqizhongxian8");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji5IsNull() {
            addCriterion("MOQIZHONGHEJI5 is null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji5IsNotNull() {
            addCriterion("MOQIZHONGHEJI5 is not null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji5EqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI5 =", value, "moqizhongheji5");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji5NotEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI5 <>", value, "moqizhongheji5");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji5GreaterThan(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI5 >", value, "moqizhongheji5");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI5 >=", value, "moqizhongheji5");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji5LessThan(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI5 <", value, "moqizhongheji5");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI5 <=", value, "moqizhongheji5");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji5In(List<BigDecimal> values) {
            addCriterion("MOQIZHONGHEJI5 in", values, "moqizhongheji5");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji5NotIn(List<BigDecimal> values) {
            addCriterion("MOQIZHONGHEJI5 not in", values, "moqizhongheji5");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGHEJI5 between", value1, value2, "moqizhongheji5");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGHEJI5 not between", value1, value2, "moqizhongheji5");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji6IsNull() {
            addCriterion("MOQIZHONGHEJI6 is null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji6IsNotNull() {
            addCriterion("MOQIZHONGHEJI6 is not null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji6EqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI6 =", value, "moqizhongheji6");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji6NotEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI6 <>", value, "moqizhongheji6");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji6GreaterThan(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI6 >", value, "moqizhongheji6");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI6 >=", value, "moqizhongheji6");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji6LessThan(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI6 <", value, "moqizhongheji6");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI6 <=", value, "moqizhongheji6");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji6In(List<BigDecimal> values) {
            addCriterion("MOQIZHONGHEJI6 in", values, "moqizhongheji6");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji6NotIn(List<BigDecimal> values) {
            addCriterion("MOQIZHONGHEJI6 not in", values, "moqizhongheji6");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGHEJI6 between", value1, value2, "moqizhongheji6");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGHEJI6 not between", value1, value2, "moqizhongheji6");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji7IsNull() {
            addCriterion("MOQIZHONGHEJI7 is null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji7IsNotNull() {
            addCriterion("MOQIZHONGHEJI7 is not null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji7EqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI7 =", value, "moqizhongheji7");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji7NotEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI7 <>", value, "moqizhongheji7");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji7GreaterThan(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI7 >", value, "moqizhongheji7");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji7GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI7 >=", value, "moqizhongheji7");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji7LessThan(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI7 <", value, "moqizhongheji7");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji7LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI7 <=", value, "moqizhongheji7");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji7In(List<BigDecimal> values) {
            addCriterion("MOQIZHONGHEJI7 in", values, "moqizhongheji7");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji7NotIn(List<BigDecimal> values) {
            addCriterion("MOQIZHONGHEJI7 not in", values, "moqizhongheji7");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji7Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGHEJI7 between", value1, value2, "moqizhongheji7");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji7NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGHEJI7 not between", value1, value2, "moqizhongheji7");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji8IsNull() {
            addCriterion("MOQIZHONGHEJI8 is null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji8IsNotNull() {
            addCriterion("MOQIZHONGHEJI8 is not null");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji8EqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI8 =", value, "moqizhongheji8");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji8NotEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI8 <>", value, "moqizhongheji8");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji8GreaterThan(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI8 >", value, "moqizhongheji8");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji8GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI8 >=", value, "moqizhongheji8");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji8LessThan(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI8 <", value, "moqizhongheji8");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji8LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOQIZHONGHEJI8 <=", value, "moqizhongheji8");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji8In(List<BigDecimal> values) {
            addCriterion("MOQIZHONGHEJI8 in", values, "moqizhongheji8");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji8NotIn(List<BigDecimal> values) {
            addCriterion("MOQIZHONGHEJI8 not in", values, "moqizhongheji8");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji8Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGHEJI8 between", value1, value2, "moqizhongheji8");
            return (Criteria) this;
        }

        public Criteria andMoqizhongheji8NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOQIZHONGHEJI8 not between", value1, value2, "moqizhongheji8");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian5IsNull() {
            addCriterion("LEIJIQIZHONGFEIXIAN5 is null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian5IsNotNull() {
            addCriterion("LEIJIQIZHONGFEIXIAN5 is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian5EqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN5 =", value, "leijiqizhongfeixian5");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian5NotEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN5 <>", value, "leijiqizhongfeixian5");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian5GreaterThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN5 >", value, "leijiqizhongfeixian5");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN5 >=", value, "leijiqizhongfeixian5");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian5LessThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN5 <", value, "leijiqizhongfeixian5");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN5 <=", value, "leijiqizhongfeixian5");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian5In(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGFEIXIAN5 in", values, "leijiqizhongfeixian5");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian5NotIn(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGFEIXIAN5 not in", values, "leijiqizhongfeixian5");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGFEIXIAN5 between", value1, value2, "leijiqizhongfeixian5");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGFEIXIAN5 not between", value1, value2, "leijiqizhongfeixian5");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian6IsNull() {
            addCriterion("LEIJIQIZHONGFEIXIAN6 is null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian6IsNotNull() {
            addCriterion("LEIJIQIZHONGFEIXIAN6 is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian6EqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN6 =", value, "leijiqizhongfeixian6");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian6NotEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN6 <>", value, "leijiqizhongfeixian6");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian6GreaterThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN6 >", value, "leijiqizhongfeixian6");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN6 >=", value, "leijiqizhongfeixian6");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian6LessThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN6 <", value, "leijiqizhongfeixian6");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN6 <=", value, "leijiqizhongfeixian6");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian6In(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGFEIXIAN6 in", values, "leijiqizhongfeixian6");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian6NotIn(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGFEIXIAN6 not in", values, "leijiqizhongfeixian6");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGFEIXIAN6 between", value1, value2, "leijiqizhongfeixian6");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGFEIXIAN6 not between", value1, value2, "leijiqizhongfeixian6");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian7IsNull() {
            addCriterion("LEIJIQIZHONGFEIXIAN7 is null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian7IsNotNull() {
            addCriterion("LEIJIQIZHONGFEIXIAN7 is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian7EqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN7 =", value, "leijiqizhongfeixian7");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian7NotEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN7 <>", value, "leijiqizhongfeixian7");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian7GreaterThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN7 >", value, "leijiqizhongfeixian7");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian7GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN7 >=", value, "leijiqizhongfeixian7");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian7LessThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN7 <", value, "leijiqizhongfeixian7");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian7LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN7 <=", value, "leijiqizhongfeixian7");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian7In(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGFEIXIAN7 in", values, "leijiqizhongfeixian7");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian7NotIn(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGFEIXIAN7 not in", values, "leijiqizhongfeixian7");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian7Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGFEIXIAN7 between", value1, value2, "leijiqizhongfeixian7");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian7NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGFEIXIAN7 not between", value1, value2, "leijiqizhongfeixian7");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian8IsNull() {
            addCriterion("LEIJIQIZHONGFEIXIAN8 is null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian8IsNotNull() {
            addCriterion("LEIJIQIZHONGFEIXIAN8 is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian8EqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN8 =", value, "leijiqizhongfeixian8");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian8NotEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN8 <>", value, "leijiqizhongfeixian8");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian8GreaterThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN8 >", value, "leijiqizhongfeixian8");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian8GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN8 >=", value, "leijiqizhongfeixian8");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian8LessThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN8 <", value, "leijiqizhongfeixian8");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian8LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGFEIXIAN8 <=", value, "leijiqizhongfeixian8");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian8In(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGFEIXIAN8 in", values, "leijiqizhongfeixian8");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian8NotIn(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGFEIXIAN8 not in", values, "leijiqizhongfeixian8");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian8Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGFEIXIAN8 between", value1, value2, "leijiqizhongfeixian8");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongfeixian8NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGFEIXIAN8 not between", value1, value2, "leijiqizhongfeixian8");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian5IsNull() {
            addCriterion("LEIJIQIZHONGXIAN5 is null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian5IsNotNull() {
            addCriterion("LEIJIQIZHONGXIAN5 is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian5EqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN5 =", value, "leijiqizhongxian5");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian5NotEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN5 <>", value, "leijiqizhongxian5");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian5GreaterThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN5 >", value, "leijiqizhongxian5");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN5 >=", value, "leijiqizhongxian5");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian5LessThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN5 <", value, "leijiqizhongxian5");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN5 <=", value, "leijiqizhongxian5");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian5In(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGXIAN5 in", values, "leijiqizhongxian5");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian5NotIn(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGXIAN5 not in", values, "leijiqizhongxian5");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGXIAN5 between", value1, value2, "leijiqizhongxian5");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGXIAN5 not between", value1, value2, "leijiqizhongxian5");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian6IsNull() {
            addCriterion("LEIJIQIZHONGXIAN6 is null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian6IsNotNull() {
            addCriterion("LEIJIQIZHONGXIAN6 is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian6EqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN6 =", value, "leijiqizhongxian6");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian6NotEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN6 <>", value, "leijiqizhongxian6");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian6GreaterThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN6 >", value, "leijiqizhongxian6");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN6 >=", value, "leijiqizhongxian6");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian6LessThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN6 <", value, "leijiqizhongxian6");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN6 <=", value, "leijiqizhongxian6");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian6In(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGXIAN6 in", values, "leijiqizhongxian6");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian6NotIn(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGXIAN6 not in", values, "leijiqizhongxian6");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGXIAN6 between", value1, value2, "leijiqizhongxian6");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGXIAN6 not between", value1, value2, "leijiqizhongxian6");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian7IsNull() {
            addCriterion("LEIJIQIZHONGXIAN7 is null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian7IsNotNull() {
            addCriterion("LEIJIQIZHONGXIAN7 is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian7EqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN7 =", value, "leijiqizhongxian7");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian7NotEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN7 <>", value, "leijiqizhongxian7");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian7GreaterThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN7 >", value, "leijiqizhongxian7");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian7GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN7 >=", value, "leijiqizhongxian7");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian7LessThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN7 <", value, "leijiqizhongxian7");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian7LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN7 <=", value, "leijiqizhongxian7");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian7In(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGXIAN7 in", values, "leijiqizhongxian7");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian7NotIn(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGXIAN7 not in", values, "leijiqizhongxian7");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian7Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGXIAN7 between", value1, value2, "leijiqizhongxian7");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian7NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGXIAN7 not between", value1, value2, "leijiqizhongxian7");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian8IsNull() {
            addCriterion("LEIJIQIZHONGXIAN8 is null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian8IsNotNull() {
            addCriterion("LEIJIQIZHONGXIAN8 is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian8EqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN8 =", value, "leijiqizhongxian8");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian8NotEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN8 <>", value, "leijiqizhongxian8");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian8GreaterThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN8 >", value, "leijiqizhongxian8");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian8GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN8 >=", value, "leijiqizhongxian8");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian8LessThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN8 <", value, "leijiqizhongxian8");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian8LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGXIAN8 <=", value, "leijiqizhongxian8");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian8In(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGXIAN8 in", values, "leijiqizhongxian8");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian8NotIn(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGXIAN8 not in", values, "leijiqizhongxian8");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian8Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGXIAN8 between", value1, value2, "leijiqizhongxian8");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongxian8NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGXIAN8 not between", value1, value2, "leijiqizhongxian8");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji5IsNull() {
            addCriterion("LEIJIQIZHONGHEJI5 is null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji5IsNotNull() {
            addCriterion("LEIJIQIZHONGHEJI5 is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji5EqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI5 =", value, "leijiqizhongheji5");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji5NotEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI5 <>", value, "leijiqizhongheji5");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji5GreaterThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI5 >", value, "leijiqizhongheji5");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI5 >=", value, "leijiqizhongheji5");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji5LessThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI5 <", value, "leijiqizhongheji5");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI5 <=", value, "leijiqizhongheji5");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji5In(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGHEJI5 in", values, "leijiqizhongheji5");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji5NotIn(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGHEJI5 not in", values, "leijiqizhongheji5");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGHEJI5 between", value1, value2, "leijiqizhongheji5");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGHEJI5 not between", value1, value2, "leijiqizhongheji5");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji6IsNull() {
            addCriterion("LEIJIQIZHONGHEJI6 is null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji6IsNotNull() {
            addCriterion("LEIJIQIZHONGHEJI6 is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji6EqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI6 =", value, "leijiqizhongheji6");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji6NotEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI6 <>", value, "leijiqizhongheji6");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji6GreaterThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI6 >", value, "leijiqizhongheji6");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI6 >=", value, "leijiqizhongheji6");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji6LessThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI6 <", value, "leijiqizhongheji6");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI6 <=", value, "leijiqizhongheji6");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji6In(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGHEJI6 in", values, "leijiqizhongheji6");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji6NotIn(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGHEJI6 not in", values, "leijiqizhongheji6");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGHEJI6 between", value1, value2, "leijiqizhongheji6");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGHEJI6 not between", value1, value2, "leijiqizhongheji6");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji7IsNull() {
            addCriterion("LEIJIQIZHONGHEJI7 is null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji7IsNotNull() {
            addCriterion("LEIJIQIZHONGHEJI7 is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji7EqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI7 =", value, "leijiqizhongheji7");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji7NotEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI7 <>", value, "leijiqizhongheji7");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji7GreaterThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI7 >", value, "leijiqizhongheji7");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji7GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI7 >=", value, "leijiqizhongheji7");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji7LessThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI7 <", value, "leijiqizhongheji7");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji7LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI7 <=", value, "leijiqizhongheji7");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji7In(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGHEJI7 in", values, "leijiqizhongheji7");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji7NotIn(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGHEJI7 not in", values, "leijiqizhongheji7");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji7Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGHEJI7 between", value1, value2, "leijiqizhongheji7");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji7NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGHEJI7 not between", value1, value2, "leijiqizhongheji7");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji8IsNull() {
            addCriterion("LEIJIQIZHONGHEJI8 is null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji8IsNotNull() {
            addCriterion("LEIJIQIZHONGHEJI8 is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji8EqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI8 =", value, "leijiqizhongheji8");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji8NotEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI8 <>", value, "leijiqizhongheji8");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji8GreaterThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI8 >", value, "leijiqizhongheji8");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji8GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI8 >=", value, "leijiqizhongheji8");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji8LessThan(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI8 <", value, "leijiqizhongheji8");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji8LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIQIZHONGHEJI8 <=", value, "leijiqizhongheji8");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji8In(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGHEJI8 in", values, "leijiqizhongheji8");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji8NotIn(List<BigDecimal> values) {
            addCriterion("LEIJIQIZHONGHEJI8 not in", values, "leijiqizhongheji8");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji8Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGHEJI8 between", value1, value2, "leijiqizhongheji8");
            return (Criteria) this;
        }

        public Criteria andLeijiqizhongheji8NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIQIZHONGHEJI8 not between", value1, value2, "leijiqizhongheji8");
            return (Criteria) this;
        }

        public Criteria andRenyuan1IsNull() {
            addCriterion("RENYUAN1 is null");
            return (Criteria) this;
        }

        public Criteria andRenyuan1IsNotNull() {
            addCriterion("RENYUAN1 is not null");
            return (Criteria) this;
        }

        public Criteria andRenyuan1EqualTo(BigDecimal value) {
            addCriterion("RENYUAN1 =", value, "renyuan1");
            return (Criteria) this;
        }

        public Criteria andRenyuan1NotEqualTo(BigDecimal value) {
            addCriterion("RENYUAN1 <>", value, "renyuan1");
            return (Criteria) this;
        }

        public Criteria andRenyuan1GreaterThan(BigDecimal value) {
            addCriterion("RENYUAN1 >", value, "renyuan1");
            return (Criteria) this;
        }

        public Criteria andRenyuan1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RENYUAN1 >=", value, "renyuan1");
            return (Criteria) this;
        }

        public Criteria andRenyuan1LessThan(BigDecimal value) {
            addCriterion("RENYUAN1 <", value, "renyuan1");
            return (Criteria) this;
        }

        public Criteria andRenyuan1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("RENYUAN1 <=", value, "renyuan1");
            return (Criteria) this;
        }

        public Criteria andRenyuan1In(List<BigDecimal> values) {
            addCriterion("RENYUAN1 in", values, "renyuan1");
            return (Criteria) this;
        }

        public Criteria andRenyuan1NotIn(List<BigDecimal> values) {
            addCriterion("RENYUAN1 not in", values, "renyuan1");
            return (Criteria) this;
        }

        public Criteria andRenyuan1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("RENYUAN1 between", value1, value2, "renyuan1");
            return (Criteria) this;
        }

        public Criteria andRenyuan1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RENYUAN1 not between", value1, value2, "renyuan1");
            return (Criteria) this;
        }

        public Criteria andRenyuan2IsNull() {
            addCriterion("RENYUAN2 is null");
            return (Criteria) this;
        }

        public Criteria andRenyuan2IsNotNull() {
            addCriterion("RENYUAN2 is not null");
            return (Criteria) this;
        }

        public Criteria andRenyuan2EqualTo(BigDecimal value) {
            addCriterion("RENYUAN2 =", value, "renyuan2");
            return (Criteria) this;
        }

        public Criteria andRenyuan2NotEqualTo(BigDecimal value) {
            addCriterion("RENYUAN2 <>", value, "renyuan2");
            return (Criteria) this;
        }

        public Criteria andRenyuan2GreaterThan(BigDecimal value) {
            addCriterion("RENYUAN2 >", value, "renyuan2");
            return (Criteria) this;
        }

        public Criteria andRenyuan2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RENYUAN2 >=", value, "renyuan2");
            return (Criteria) this;
        }

        public Criteria andRenyuan2LessThan(BigDecimal value) {
            addCriterion("RENYUAN2 <", value, "renyuan2");
            return (Criteria) this;
        }

        public Criteria andRenyuan2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("RENYUAN2 <=", value, "renyuan2");
            return (Criteria) this;
        }

        public Criteria andRenyuan2In(List<BigDecimal> values) {
            addCriterion("RENYUAN2 in", values, "renyuan2");
            return (Criteria) this;
        }

        public Criteria andRenyuan2NotIn(List<BigDecimal> values) {
            addCriterion("RENYUAN2 not in", values, "renyuan2");
            return (Criteria) this;
        }

        public Criteria andRenyuan2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("RENYUAN2 between", value1, value2, "renyuan2");
            return (Criteria) this;
        }

        public Criteria andRenyuan2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RENYUAN2 not between", value1, value2, "renyuan2");
            return (Criteria) this;
        }

        public Criteria andRenyuan3IsNull() {
            addCriterion("RENYUAN3 is null");
            return (Criteria) this;
        }

        public Criteria andRenyuan3IsNotNull() {
            addCriterion("RENYUAN3 is not null");
            return (Criteria) this;
        }

        public Criteria andRenyuan3EqualTo(BigDecimal value) {
            addCriterion("RENYUAN3 =", value, "renyuan3");
            return (Criteria) this;
        }

        public Criteria andRenyuan3NotEqualTo(BigDecimal value) {
            addCriterion("RENYUAN3 <>", value, "renyuan3");
            return (Criteria) this;
        }

        public Criteria andRenyuan3GreaterThan(BigDecimal value) {
            addCriterion("RENYUAN3 >", value, "renyuan3");
            return (Criteria) this;
        }

        public Criteria andRenyuan3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RENYUAN3 >=", value, "renyuan3");
            return (Criteria) this;
        }

        public Criteria andRenyuan3LessThan(BigDecimal value) {
            addCriterion("RENYUAN3 <", value, "renyuan3");
            return (Criteria) this;
        }

        public Criteria andRenyuan3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("RENYUAN3 <=", value, "renyuan3");
            return (Criteria) this;
        }

        public Criteria andRenyuan3In(List<BigDecimal> values) {
            addCriterion("RENYUAN3 in", values, "renyuan3");
            return (Criteria) this;
        }

        public Criteria andRenyuan3NotIn(List<BigDecimal> values) {
            addCriterion("RENYUAN3 not in", values, "renyuan3");
            return (Criteria) this;
        }

        public Criteria andRenyuan3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("RENYUAN3 between", value1, value2, "renyuan3");
            return (Criteria) this;
        }

        public Criteria andRenyuan3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RENYUAN3 not between", value1, value2, "renyuan3");
            return (Criteria) this;
        }

        public Criteria andRenyuan4IsNull() {
            addCriterion("RENYUAN4 is null");
            return (Criteria) this;
        }

        public Criteria andRenyuan4IsNotNull() {
            addCriterion("RENYUAN4 is not null");
            return (Criteria) this;
        }

        public Criteria andRenyuan4EqualTo(BigDecimal value) {
            addCriterion("RENYUAN4 =", value, "renyuan4");
            return (Criteria) this;
        }

        public Criteria andRenyuan4NotEqualTo(BigDecimal value) {
            addCriterion("RENYUAN4 <>", value, "renyuan4");
            return (Criteria) this;
        }

        public Criteria andRenyuan4GreaterThan(BigDecimal value) {
            addCriterion("RENYUAN4 >", value, "renyuan4");
            return (Criteria) this;
        }

        public Criteria andRenyuan4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RENYUAN4 >=", value, "renyuan4");
            return (Criteria) this;
        }

        public Criteria andRenyuan4LessThan(BigDecimal value) {
            addCriterion("RENYUAN4 <", value, "renyuan4");
            return (Criteria) this;
        }

        public Criteria andRenyuan4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("RENYUAN4 <=", value, "renyuan4");
            return (Criteria) this;
        }

        public Criteria andRenyuan4In(List<BigDecimal> values) {
            addCriterion("RENYUAN4 in", values, "renyuan4");
            return (Criteria) this;
        }

        public Criteria andRenyuan4NotIn(List<BigDecimal> values) {
            addCriterion("RENYUAN4 not in", values, "renyuan4");
            return (Criteria) this;
        }

        public Criteria andRenyuan4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("RENYUAN4 between", value1, value2, "renyuan4");
            return (Criteria) this;
        }

        public Criteria andRenyuan4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RENYUAN4 not between", value1, value2, "renyuan4");
            return (Criteria) this;
        }

        public Criteria andRenyuan5IsNull() {
            addCriterion("RENYUAN5 is null");
            return (Criteria) this;
        }

        public Criteria andRenyuan5IsNotNull() {
            addCriterion("RENYUAN5 is not null");
            return (Criteria) this;
        }

        public Criteria andRenyuan5EqualTo(BigDecimal value) {
            addCriterion("RENYUAN5 =", value, "renyuan5");
            return (Criteria) this;
        }

        public Criteria andRenyuan5NotEqualTo(BigDecimal value) {
            addCriterion("RENYUAN5 <>", value, "renyuan5");
            return (Criteria) this;
        }

        public Criteria andRenyuan5GreaterThan(BigDecimal value) {
            addCriterion("RENYUAN5 >", value, "renyuan5");
            return (Criteria) this;
        }

        public Criteria andRenyuan5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RENYUAN5 >=", value, "renyuan5");
            return (Criteria) this;
        }

        public Criteria andRenyuan5LessThan(BigDecimal value) {
            addCriterion("RENYUAN5 <", value, "renyuan5");
            return (Criteria) this;
        }

        public Criteria andRenyuan5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("RENYUAN5 <=", value, "renyuan5");
            return (Criteria) this;
        }

        public Criteria andRenyuan5In(List<BigDecimal> values) {
            addCriterion("RENYUAN5 in", values, "renyuan5");
            return (Criteria) this;
        }

        public Criteria andRenyuan5NotIn(List<BigDecimal> values) {
            addCriterion("RENYUAN5 not in", values, "renyuan5");
            return (Criteria) this;
        }

        public Criteria andRenyuan5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("RENYUAN5 between", value1, value2, "renyuan5");
            return (Criteria) this;
        }

        public Criteria andRenyuan5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RENYUAN5 not between", value1, value2, "renyuan5");
            return (Criteria) this;
        }

        public Criteria andRenyuan6IsNull() {
            addCriterion("RENYUAN6 is null");
            return (Criteria) this;
        }

        public Criteria andRenyuan6IsNotNull() {
            addCriterion("RENYUAN6 is not null");
            return (Criteria) this;
        }

        public Criteria andRenyuan6EqualTo(BigDecimal value) {
            addCriterion("RENYUAN6 =", value, "renyuan6");
            return (Criteria) this;
        }

        public Criteria andRenyuan6NotEqualTo(BigDecimal value) {
            addCriterion("RENYUAN6 <>", value, "renyuan6");
            return (Criteria) this;
        }

        public Criteria andRenyuan6GreaterThan(BigDecimal value) {
            addCriterion("RENYUAN6 >", value, "renyuan6");
            return (Criteria) this;
        }

        public Criteria andRenyuan6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RENYUAN6 >=", value, "renyuan6");
            return (Criteria) this;
        }

        public Criteria andRenyuan6LessThan(BigDecimal value) {
            addCriterion("RENYUAN6 <", value, "renyuan6");
            return (Criteria) this;
        }

        public Criteria andRenyuan6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("RENYUAN6 <=", value, "renyuan6");
            return (Criteria) this;
        }

        public Criteria andRenyuan6In(List<BigDecimal> values) {
            addCriterion("RENYUAN6 in", values, "renyuan6");
            return (Criteria) this;
        }

        public Criteria andRenyuan6NotIn(List<BigDecimal> values) {
            addCriterion("RENYUAN6 not in", values, "renyuan6");
            return (Criteria) this;
        }

        public Criteria andRenyuan6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("RENYUAN6 between", value1, value2, "renyuan6");
            return (Criteria) this;
        }

        public Criteria andRenyuan6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RENYUAN6 not between", value1, value2, "renyuan6");
            return (Criteria) this;
        }

        public Criteria andRenyuan7IsNull() {
            addCriterion("RENYUAN7 is null");
            return (Criteria) this;
        }

        public Criteria andRenyuan7IsNotNull() {
            addCriterion("RENYUAN7 is not null");
            return (Criteria) this;
        }

        public Criteria andRenyuan7EqualTo(BigDecimal value) {
            addCriterion("RENYUAN7 =", value, "renyuan7");
            return (Criteria) this;
        }

        public Criteria andRenyuan7NotEqualTo(BigDecimal value) {
            addCriterion("RENYUAN7 <>", value, "renyuan7");
            return (Criteria) this;
        }

        public Criteria andRenyuan7GreaterThan(BigDecimal value) {
            addCriterion("RENYUAN7 >", value, "renyuan7");
            return (Criteria) this;
        }

        public Criteria andRenyuan7GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RENYUAN7 >=", value, "renyuan7");
            return (Criteria) this;
        }

        public Criteria andRenyuan7LessThan(BigDecimal value) {
            addCriterion("RENYUAN7 <", value, "renyuan7");
            return (Criteria) this;
        }

        public Criteria andRenyuan7LessThanOrEqualTo(BigDecimal value) {
            addCriterion("RENYUAN7 <=", value, "renyuan7");
            return (Criteria) this;
        }

        public Criteria andRenyuan7In(List<BigDecimal> values) {
            addCriterion("RENYUAN7 in", values, "renyuan7");
            return (Criteria) this;
        }

        public Criteria andRenyuan7NotIn(List<BigDecimal> values) {
            addCriterion("RENYUAN7 not in", values, "renyuan7");
            return (Criteria) this;
        }

        public Criteria andRenyuan7Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("RENYUAN7 between", value1, value2, "renyuan7");
            return (Criteria) this;
        }

        public Criteria andRenyuan7NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RENYUAN7 not between", value1, value2, "renyuan7");
            return (Criteria) this;
        }

        public Criteria andRichang1IsNull() {
            addCriterion("RICHANG1 is null");
            return (Criteria) this;
        }

        public Criteria andRichang1IsNotNull() {
            addCriterion("RICHANG1 is not null");
            return (Criteria) this;
        }

        public Criteria andRichang1EqualTo(BigDecimal value) {
            addCriterion("RICHANG1 =", value, "richang1");
            return (Criteria) this;
        }

        public Criteria andRichang1NotEqualTo(BigDecimal value) {
            addCriterion("RICHANG1 <>", value, "richang1");
            return (Criteria) this;
        }

        public Criteria andRichang1GreaterThan(BigDecimal value) {
            addCriterion("RICHANG1 >", value, "richang1");
            return (Criteria) this;
        }

        public Criteria andRichang1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RICHANG1 >=", value, "richang1");
            return (Criteria) this;
        }

        public Criteria andRichang1LessThan(BigDecimal value) {
            addCriterion("RICHANG1 <", value, "richang1");
            return (Criteria) this;
        }

        public Criteria andRichang1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("RICHANG1 <=", value, "richang1");
            return (Criteria) this;
        }

        public Criteria andRichang1In(List<BigDecimal> values) {
            addCriterion("RICHANG1 in", values, "richang1");
            return (Criteria) this;
        }

        public Criteria andRichang1NotIn(List<BigDecimal> values) {
            addCriterion("RICHANG1 not in", values, "richang1");
            return (Criteria) this;
        }

        public Criteria andRichang1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("RICHANG1 between", value1, value2, "richang1");
            return (Criteria) this;
        }

        public Criteria andRichang1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RICHANG1 not between", value1, value2, "richang1");
            return (Criteria) this;
        }

        public Criteria andRichang2IsNull() {
            addCriterion("RICHANG2 is null");
            return (Criteria) this;
        }

        public Criteria andRichang2IsNotNull() {
            addCriterion("RICHANG2 is not null");
            return (Criteria) this;
        }

        public Criteria andRichang2EqualTo(BigDecimal value) {
            addCriterion("RICHANG2 =", value, "richang2");
            return (Criteria) this;
        }

        public Criteria andRichang2NotEqualTo(BigDecimal value) {
            addCriterion("RICHANG2 <>", value, "richang2");
            return (Criteria) this;
        }

        public Criteria andRichang2GreaterThan(BigDecimal value) {
            addCriterion("RICHANG2 >", value, "richang2");
            return (Criteria) this;
        }

        public Criteria andRichang2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RICHANG2 >=", value, "richang2");
            return (Criteria) this;
        }

        public Criteria andRichang2LessThan(BigDecimal value) {
            addCriterion("RICHANG2 <", value, "richang2");
            return (Criteria) this;
        }

        public Criteria andRichang2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("RICHANG2 <=", value, "richang2");
            return (Criteria) this;
        }

        public Criteria andRichang2In(List<BigDecimal> values) {
            addCriterion("RICHANG2 in", values, "richang2");
            return (Criteria) this;
        }

        public Criteria andRichang2NotIn(List<BigDecimal> values) {
            addCriterion("RICHANG2 not in", values, "richang2");
            return (Criteria) this;
        }

        public Criteria andRichang2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("RICHANG2 between", value1, value2, "richang2");
            return (Criteria) this;
        }

        public Criteria andRichang2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RICHANG2 not between", value1, value2, "richang2");
            return (Criteria) this;
        }

        public Criteria andRichang3IsNull() {
            addCriterion("RICHANG3 is null");
            return (Criteria) this;
        }

        public Criteria andRichang3IsNotNull() {
            addCriterion("RICHANG3 is not null");
            return (Criteria) this;
        }

        public Criteria andRichang3EqualTo(BigDecimal value) {
            addCriterion("RICHANG3 =", value, "richang3");
            return (Criteria) this;
        }

        public Criteria andRichang3NotEqualTo(BigDecimal value) {
            addCriterion("RICHANG3 <>", value, "richang3");
            return (Criteria) this;
        }

        public Criteria andRichang3GreaterThan(BigDecimal value) {
            addCriterion("RICHANG3 >", value, "richang3");
            return (Criteria) this;
        }

        public Criteria andRichang3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RICHANG3 >=", value, "richang3");
            return (Criteria) this;
        }

        public Criteria andRichang3LessThan(BigDecimal value) {
            addCriterion("RICHANG3 <", value, "richang3");
            return (Criteria) this;
        }

        public Criteria andRichang3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("RICHANG3 <=", value, "richang3");
            return (Criteria) this;
        }

        public Criteria andRichang3In(List<BigDecimal> values) {
            addCriterion("RICHANG3 in", values, "richang3");
            return (Criteria) this;
        }

        public Criteria andRichang3NotIn(List<BigDecimal> values) {
            addCriterion("RICHANG3 not in", values, "richang3");
            return (Criteria) this;
        }

        public Criteria andRichang3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("RICHANG3 between", value1, value2, "richang3");
            return (Criteria) this;
        }

        public Criteria andRichang3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RICHANG3 not between", value1, value2, "richang3");
            return (Criteria) this;
        }

        public Criteria andRichang4IsNull() {
            addCriterion("RICHANG4 is null");
            return (Criteria) this;
        }

        public Criteria andRichang4IsNotNull() {
            addCriterion("RICHANG4 is not null");
            return (Criteria) this;
        }

        public Criteria andRichang4EqualTo(BigDecimal value) {
            addCriterion("RICHANG4 =", value, "richang4");
            return (Criteria) this;
        }

        public Criteria andRichang4NotEqualTo(BigDecimal value) {
            addCriterion("RICHANG4 <>", value, "richang4");
            return (Criteria) this;
        }

        public Criteria andRichang4GreaterThan(BigDecimal value) {
            addCriterion("RICHANG4 >", value, "richang4");
            return (Criteria) this;
        }

        public Criteria andRichang4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RICHANG4 >=", value, "richang4");
            return (Criteria) this;
        }

        public Criteria andRichang4LessThan(BigDecimal value) {
            addCriterion("RICHANG4 <", value, "richang4");
            return (Criteria) this;
        }

        public Criteria andRichang4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("RICHANG4 <=", value, "richang4");
            return (Criteria) this;
        }

        public Criteria andRichang4In(List<BigDecimal> values) {
            addCriterion("RICHANG4 in", values, "richang4");
            return (Criteria) this;
        }

        public Criteria andRichang4NotIn(List<BigDecimal> values) {
            addCriterion("RICHANG4 not in", values, "richang4");
            return (Criteria) this;
        }

        public Criteria andRichang4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("RICHANG4 between", value1, value2, "richang4");
            return (Criteria) this;
        }

        public Criteria andRichang4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RICHANG4 not between", value1, value2, "richang4");
            return (Criteria) this;
        }

        public Criteria andRichang5IsNull() {
            addCriterion("RICHANG5 is null");
            return (Criteria) this;
        }

        public Criteria andRichang5IsNotNull() {
            addCriterion("RICHANG5 is not null");
            return (Criteria) this;
        }

        public Criteria andRichang5EqualTo(BigDecimal value) {
            addCriterion("RICHANG5 =", value, "richang5");
            return (Criteria) this;
        }

        public Criteria andRichang5NotEqualTo(BigDecimal value) {
            addCriterion("RICHANG5 <>", value, "richang5");
            return (Criteria) this;
        }

        public Criteria andRichang5GreaterThan(BigDecimal value) {
            addCriterion("RICHANG5 >", value, "richang5");
            return (Criteria) this;
        }

        public Criteria andRichang5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RICHANG5 >=", value, "richang5");
            return (Criteria) this;
        }

        public Criteria andRichang5LessThan(BigDecimal value) {
            addCriterion("RICHANG5 <", value, "richang5");
            return (Criteria) this;
        }

        public Criteria andRichang5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("RICHANG5 <=", value, "richang5");
            return (Criteria) this;
        }

        public Criteria andRichang5In(List<BigDecimal> values) {
            addCriterion("RICHANG5 in", values, "richang5");
            return (Criteria) this;
        }

        public Criteria andRichang5NotIn(List<BigDecimal> values) {
            addCriterion("RICHANG5 not in", values, "richang5");
            return (Criteria) this;
        }

        public Criteria andRichang5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("RICHANG5 between", value1, value2, "richang5");
            return (Criteria) this;
        }

        public Criteria andRichang5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RICHANG5 not between", value1, value2, "richang5");
            return (Criteria) this;
        }

        public Criteria andRichang6IsNull() {
            addCriterion("RICHANG6 is null");
            return (Criteria) this;
        }

        public Criteria andRichang6IsNotNull() {
            addCriterion("RICHANG6 is not null");
            return (Criteria) this;
        }

        public Criteria andRichang6EqualTo(BigDecimal value) {
            addCriterion("RICHANG6 =", value, "richang6");
            return (Criteria) this;
        }

        public Criteria andRichang6NotEqualTo(BigDecimal value) {
            addCriterion("RICHANG6 <>", value, "richang6");
            return (Criteria) this;
        }

        public Criteria andRichang6GreaterThan(BigDecimal value) {
            addCriterion("RICHANG6 >", value, "richang6");
            return (Criteria) this;
        }

        public Criteria andRichang6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RICHANG6 >=", value, "richang6");
            return (Criteria) this;
        }

        public Criteria andRichang6LessThan(BigDecimal value) {
            addCriterion("RICHANG6 <", value, "richang6");
            return (Criteria) this;
        }

        public Criteria andRichang6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("RICHANG6 <=", value, "richang6");
            return (Criteria) this;
        }

        public Criteria andRichang6In(List<BigDecimal> values) {
            addCriterion("RICHANG6 in", values, "richang6");
            return (Criteria) this;
        }

        public Criteria andRichang6NotIn(List<BigDecimal> values) {
            addCriterion("RICHANG6 not in", values, "richang6");
            return (Criteria) this;
        }

        public Criteria andRichang6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("RICHANG6 between", value1, value2, "richang6");
            return (Criteria) this;
        }

        public Criteria andRichang6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RICHANG6 not between", value1, value2, "richang6");
            return (Criteria) this;
        }

        public Criteria andRichang7IsNull() {
            addCriterion("RICHANG7 is null");
            return (Criteria) this;
        }

        public Criteria andRichang7IsNotNull() {
            addCriterion("RICHANG7 is not null");
            return (Criteria) this;
        }

        public Criteria andRichang7EqualTo(BigDecimal value) {
            addCriterion("RICHANG7 =", value, "richang7");
            return (Criteria) this;
        }

        public Criteria andRichang7NotEqualTo(BigDecimal value) {
            addCriterion("RICHANG7 <>", value, "richang7");
            return (Criteria) this;
        }

        public Criteria andRichang7GreaterThan(BigDecimal value) {
            addCriterion("RICHANG7 >", value, "richang7");
            return (Criteria) this;
        }

        public Criteria andRichang7GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RICHANG7 >=", value, "richang7");
            return (Criteria) this;
        }

        public Criteria andRichang7LessThan(BigDecimal value) {
            addCriterion("RICHANG7 <", value, "richang7");
            return (Criteria) this;
        }

        public Criteria andRichang7LessThanOrEqualTo(BigDecimal value) {
            addCriterion("RICHANG7 <=", value, "richang7");
            return (Criteria) this;
        }

        public Criteria andRichang7In(List<BigDecimal> values) {
            addCriterion("RICHANG7 in", values, "richang7");
            return (Criteria) this;
        }

        public Criteria andRichang7NotIn(List<BigDecimal> values) {
            addCriterion("RICHANG7 not in", values, "richang7");
            return (Criteria) this;
        }

        public Criteria andRichang7Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("RICHANG7 between", value1, value2, "richang7");
            return (Criteria) this;
        }

        public Criteria andRichang7NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RICHANG7 not between", value1, value2, "richang7");
            return (Criteria) this;
        }

        public Criteria andGuding1IsNull() {
            addCriterion("GUDING1 is null");
            return (Criteria) this;
        }

        public Criteria andGuding1IsNotNull() {
            addCriterion("GUDING1 is not null");
            return (Criteria) this;
        }

        public Criteria andGuding1EqualTo(BigDecimal value) {
            addCriterion("GUDING1 =", value, "guding1");
            return (Criteria) this;
        }

        public Criteria andGuding1NotEqualTo(BigDecimal value) {
            addCriterion("GUDING1 <>", value, "guding1");
            return (Criteria) this;
        }

        public Criteria andGuding1GreaterThan(BigDecimal value) {
            addCriterion("GUDING1 >", value, "guding1");
            return (Criteria) this;
        }

        public Criteria andGuding1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GUDING1 >=", value, "guding1");
            return (Criteria) this;
        }

        public Criteria andGuding1LessThan(BigDecimal value) {
            addCriterion("GUDING1 <", value, "guding1");
            return (Criteria) this;
        }

        public Criteria andGuding1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("GUDING1 <=", value, "guding1");
            return (Criteria) this;
        }

        public Criteria andGuding1In(List<BigDecimal> values) {
            addCriterion("GUDING1 in", values, "guding1");
            return (Criteria) this;
        }

        public Criteria andGuding1NotIn(List<BigDecimal> values) {
            addCriterion("GUDING1 not in", values, "guding1");
            return (Criteria) this;
        }

        public Criteria andGuding1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUDING1 between", value1, value2, "guding1");
            return (Criteria) this;
        }

        public Criteria andGuding1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUDING1 not between", value1, value2, "guding1");
            return (Criteria) this;
        }

        public Criteria andGuding2IsNull() {
            addCriterion("GUDING2 is null");
            return (Criteria) this;
        }

        public Criteria andGuding2IsNotNull() {
            addCriterion("GUDING2 is not null");
            return (Criteria) this;
        }

        public Criteria andGuding2EqualTo(BigDecimal value) {
            addCriterion("GUDING2 =", value, "guding2");
            return (Criteria) this;
        }

        public Criteria andGuding2NotEqualTo(BigDecimal value) {
            addCriterion("GUDING2 <>", value, "guding2");
            return (Criteria) this;
        }

        public Criteria andGuding2GreaterThan(BigDecimal value) {
            addCriterion("GUDING2 >", value, "guding2");
            return (Criteria) this;
        }

        public Criteria andGuding2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GUDING2 >=", value, "guding2");
            return (Criteria) this;
        }

        public Criteria andGuding2LessThan(BigDecimal value) {
            addCriterion("GUDING2 <", value, "guding2");
            return (Criteria) this;
        }

        public Criteria andGuding2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("GUDING2 <=", value, "guding2");
            return (Criteria) this;
        }

        public Criteria andGuding2In(List<BigDecimal> values) {
            addCriterion("GUDING2 in", values, "guding2");
            return (Criteria) this;
        }

        public Criteria andGuding2NotIn(List<BigDecimal> values) {
            addCriterion("GUDING2 not in", values, "guding2");
            return (Criteria) this;
        }

        public Criteria andGuding2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUDING2 between", value1, value2, "guding2");
            return (Criteria) this;
        }

        public Criteria andGuding2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUDING2 not between", value1, value2, "guding2");
            return (Criteria) this;
        }

        public Criteria andGuding3IsNull() {
            addCriterion("GUDING3 is null");
            return (Criteria) this;
        }

        public Criteria andGuding3IsNotNull() {
            addCriterion("GUDING3 is not null");
            return (Criteria) this;
        }

        public Criteria andGuding3EqualTo(BigDecimal value) {
            addCriterion("GUDING3 =", value, "guding3");
            return (Criteria) this;
        }

        public Criteria andGuding3NotEqualTo(BigDecimal value) {
            addCriterion("GUDING3 <>", value, "guding3");
            return (Criteria) this;
        }

        public Criteria andGuding3GreaterThan(BigDecimal value) {
            addCriterion("GUDING3 >", value, "guding3");
            return (Criteria) this;
        }

        public Criteria andGuding3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GUDING3 >=", value, "guding3");
            return (Criteria) this;
        }

        public Criteria andGuding3LessThan(BigDecimal value) {
            addCriterion("GUDING3 <", value, "guding3");
            return (Criteria) this;
        }

        public Criteria andGuding3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("GUDING3 <=", value, "guding3");
            return (Criteria) this;
        }

        public Criteria andGuding3In(List<BigDecimal> values) {
            addCriterion("GUDING3 in", values, "guding3");
            return (Criteria) this;
        }

        public Criteria andGuding3NotIn(List<BigDecimal> values) {
            addCriterion("GUDING3 not in", values, "guding3");
            return (Criteria) this;
        }

        public Criteria andGuding3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUDING3 between", value1, value2, "guding3");
            return (Criteria) this;
        }

        public Criteria andGuding3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUDING3 not between", value1, value2, "guding3");
            return (Criteria) this;
        }

        public Criteria andGuding4IsNull() {
            addCriterion("GUDING4 is null");
            return (Criteria) this;
        }

        public Criteria andGuding4IsNotNull() {
            addCriterion("GUDING4 is not null");
            return (Criteria) this;
        }

        public Criteria andGuding4EqualTo(BigDecimal value) {
            addCriterion("GUDING4 =", value, "guding4");
            return (Criteria) this;
        }

        public Criteria andGuding4NotEqualTo(BigDecimal value) {
            addCriterion("GUDING4 <>", value, "guding4");
            return (Criteria) this;
        }

        public Criteria andGuding4GreaterThan(BigDecimal value) {
            addCriterion("GUDING4 >", value, "guding4");
            return (Criteria) this;
        }

        public Criteria andGuding4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GUDING4 >=", value, "guding4");
            return (Criteria) this;
        }

        public Criteria andGuding4LessThan(BigDecimal value) {
            addCriterion("GUDING4 <", value, "guding4");
            return (Criteria) this;
        }

        public Criteria andGuding4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("GUDING4 <=", value, "guding4");
            return (Criteria) this;
        }

        public Criteria andGuding4In(List<BigDecimal> values) {
            addCriterion("GUDING4 in", values, "guding4");
            return (Criteria) this;
        }

        public Criteria andGuding4NotIn(List<BigDecimal> values) {
            addCriterion("GUDING4 not in", values, "guding4");
            return (Criteria) this;
        }

        public Criteria andGuding4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUDING4 between", value1, value2, "guding4");
            return (Criteria) this;
        }

        public Criteria andGuding4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUDING4 not between", value1, value2, "guding4");
            return (Criteria) this;
        }

        public Criteria andGuding5IsNull() {
            addCriterion("GUDING5 is null");
            return (Criteria) this;
        }

        public Criteria andGuding5IsNotNull() {
            addCriterion("GUDING5 is not null");
            return (Criteria) this;
        }

        public Criteria andGuding5EqualTo(BigDecimal value) {
            addCriterion("GUDING5 =", value, "guding5");
            return (Criteria) this;
        }

        public Criteria andGuding5NotEqualTo(BigDecimal value) {
            addCriterion("GUDING5 <>", value, "guding5");
            return (Criteria) this;
        }

        public Criteria andGuding5GreaterThan(BigDecimal value) {
            addCriterion("GUDING5 >", value, "guding5");
            return (Criteria) this;
        }

        public Criteria andGuding5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GUDING5 >=", value, "guding5");
            return (Criteria) this;
        }

        public Criteria andGuding5LessThan(BigDecimal value) {
            addCriterion("GUDING5 <", value, "guding5");
            return (Criteria) this;
        }

        public Criteria andGuding5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("GUDING5 <=", value, "guding5");
            return (Criteria) this;
        }

        public Criteria andGuding5In(List<BigDecimal> values) {
            addCriterion("GUDING5 in", values, "guding5");
            return (Criteria) this;
        }

        public Criteria andGuding5NotIn(List<BigDecimal> values) {
            addCriterion("GUDING5 not in", values, "guding5");
            return (Criteria) this;
        }

        public Criteria andGuding5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUDING5 between", value1, value2, "guding5");
            return (Criteria) this;
        }

        public Criteria andGuding5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUDING5 not between", value1, value2, "guding5");
            return (Criteria) this;
        }

        public Criteria andGuding6IsNull() {
            addCriterion("GUDING6 is null");
            return (Criteria) this;
        }

        public Criteria andGuding6IsNotNull() {
            addCriterion("GUDING6 is not null");
            return (Criteria) this;
        }

        public Criteria andGuding6EqualTo(BigDecimal value) {
            addCriterion("GUDING6 =", value, "guding6");
            return (Criteria) this;
        }

        public Criteria andGuding6NotEqualTo(BigDecimal value) {
            addCriterion("GUDING6 <>", value, "guding6");
            return (Criteria) this;
        }

        public Criteria andGuding6GreaterThan(BigDecimal value) {
            addCriterion("GUDING6 >", value, "guding6");
            return (Criteria) this;
        }

        public Criteria andGuding6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GUDING6 >=", value, "guding6");
            return (Criteria) this;
        }

        public Criteria andGuding6LessThan(BigDecimal value) {
            addCriterion("GUDING6 <", value, "guding6");
            return (Criteria) this;
        }

        public Criteria andGuding6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("GUDING6 <=", value, "guding6");
            return (Criteria) this;
        }

        public Criteria andGuding6In(List<BigDecimal> values) {
            addCriterion("GUDING6 in", values, "guding6");
            return (Criteria) this;
        }

        public Criteria andGuding6NotIn(List<BigDecimal> values) {
            addCriterion("GUDING6 not in", values, "guding6");
            return (Criteria) this;
        }

        public Criteria andGuding6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUDING6 between", value1, value2, "guding6");
            return (Criteria) this;
        }

        public Criteria andGuding6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUDING6 not between", value1, value2, "guding6");
            return (Criteria) this;
        }

        public Criteria andGuding7IsNull() {
            addCriterion("GUDING7 is null");
            return (Criteria) this;
        }

        public Criteria andGuding7IsNotNull() {
            addCriterion("GUDING7 is not null");
            return (Criteria) this;
        }

        public Criteria andGuding7EqualTo(BigDecimal value) {
            addCriterion("GUDING7 =", value, "guding7");
            return (Criteria) this;
        }

        public Criteria andGuding7NotEqualTo(BigDecimal value) {
            addCriterion("GUDING7 <>", value, "guding7");
            return (Criteria) this;
        }

        public Criteria andGuding7GreaterThan(BigDecimal value) {
            addCriterion("GUDING7 >", value, "guding7");
            return (Criteria) this;
        }

        public Criteria andGuding7GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GUDING7 >=", value, "guding7");
            return (Criteria) this;
        }

        public Criteria andGuding7LessThan(BigDecimal value) {
            addCriterion("GUDING7 <", value, "guding7");
            return (Criteria) this;
        }

        public Criteria andGuding7LessThanOrEqualTo(BigDecimal value) {
            addCriterion("GUDING7 <=", value, "guding7");
            return (Criteria) this;
        }

        public Criteria andGuding7In(List<BigDecimal> values) {
            addCriterion("GUDING7 in", values, "guding7");
            return (Criteria) this;
        }

        public Criteria andGuding7NotIn(List<BigDecimal> values) {
            addCriterion("GUDING7 not in", values, "guding7");
            return (Criteria) this;
        }

        public Criteria andGuding7Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUDING7 between", value1, value2, "guding7");
            return (Criteria) this;
        }

        public Criteria andGuding7NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUDING7 not between", value1, value2, "guding7");
            return (Criteria) this;
        }

        public Criteria andShuifei1IsNull() {
            addCriterion("SHUIFEI1 is null");
            return (Criteria) this;
        }

        public Criteria andShuifei1IsNotNull() {
            addCriterion("SHUIFEI1 is not null");
            return (Criteria) this;
        }

        public Criteria andShuifei1EqualTo(BigDecimal value) {
            addCriterion("SHUIFEI1 =", value, "shuifei1");
            return (Criteria) this;
        }

        public Criteria andShuifei1NotEqualTo(BigDecimal value) {
            addCriterion("SHUIFEI1 <>", value, "shuifei1");
            return (Criteria) this;
        }

        public Criteria andShuifei1GreaterThan(BigDecimal value) {
            addCriterion("SHUIFEI1 >", value, "shuifei1");
            return (Criteria) this;
        }

        public Criteria andShuifei1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHUIFEI1 >=", value, "shuifei1");
            return (Criteria) this;
        }

        public Criteria andShuifei1LessThan(BigDecimal value) {
            addCriterion("SHUIFEI1 <", value, "shuifei1");
            return (Criteria) this;
        }

        public Criteria andShuifei1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHUIFEI1 <=", value, "shuifei1");
            return (Criteria) this;
        }

        public Criteria andShuifei1In(List<BigDecimal> values) {
            addCriterion("SHUIFEI1 in", values, "shuifei1");
            return (Criteria) this;
        }

        public Criteria andShuifei1NotIn(List<BigDecimal> values) {
            addCriterion("SHUIFEI1 not in", values, "shuifei1");
            return (Criteria) this;
        }

        public Criteria andShuifei1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHUIFEI1 between", value1, value2, "shuifei1");
            return (Criteria) this;
        }

        public Criteria andShuifei1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHUIFEI1 not between", value1, value2, "shuifei1");
            return (Criteria) this;
        }

        public Criteria andShuifei2IsNull() {
            addCriterion("SHUIFEI2 is null");
            return (Criteria) this;
        }

        public Criteria andShuifei2IsNotNull() {
            addCriterion("SHUIFEI2 is not null");
            return (Criteria) this;
        }

        public Criteria andShuifei2EqualTo(BigDecimal value) {
            addCriterion("SHUIFEI2 =", value, "shuifei2");
            return (Criteria) this;
        }

        public Criteria andShuifei2NotEqualTo(BigDecimal value) {
            addCriterion("SHUIFEI2 <>", value, "shuifei2");
            return (Criteria) this;
        }

        public Criteria andShuifei2GreaterThan(BigDecimal value) {
            addCriterion("SHUIFEI2 >", value, "shuifei2");
            return (Criteria) this;
        }

        public Criteria andShuifei2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHUIFEI2 >=", value, "shuifei2");
            return (Criteria) this;
        }

        public Criteria andShuifei2LessThan(BigDecimal value) {
            addCriterion("SHUIFEI2 <", value, "shuifei2");
            return (Criteria) this;
        }

        public Criteria andShuifei2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHUIFEI2 <=", value, "shuifei2");
            return (Criteria) this;
        }

        public Criteria andShuifei2In(List<BigDecimal> values) {
            addCriterion("SHUIFEI2 in", values, "shuifei2");
            return (Criteria) this;
        }

        public Criteria andShuifei2NotIn(List<BigDecimal> values) {
            addCriterion("SHUIFEI2 not in", values, "shuifei2");
            return (Criteria) this;
        }

        public Criteria andShuifei2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHUIFEI2 between", value1, value2, "shuifei2");
            return (Criteria) this;
        }

        public Criteria andShuifei2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHUIFEI2 not between", value1, value2, "shuifei2");
            return (Criteria) this;
        }

        public Criteria andShuifei3IsNull() {
            addCriterion("SHUIFEI3 is null");
            return (Criteria) this;
        }

        public Criteria andShuifei3IsNotNull() {
            addCriterion("SHUIFEI3 is not null");
            return (Criteria) this;
        }

        public Criteria andShuifei3EqualTo(BigDecimal value) {
            addCriterion("SHUIFEI3 =", value, "shuifei3");
            return (Criteria) this;
        }

        public Criteria andShuifei3NotEqualTo(BigDecimal value) {
            addCriterion("SHUIFEI3 <>", value, "shuifei3");
            return (Criteria) this;
        }

        public Criteria andShuifei3GreaterThan(BigDecimal value) {
            addCriterion("SHUIFEI3 >", value, "shuifei3");
            return (Criteria) this;
        }

        public Criteria andShuifei3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHUIFEI3 >=", value, "shuifei3");
            return (Criteria) this;
        }

        public Criteria andShuifei3LessThan(BigDecimal value) {
            addCriterion("SHUIFEI3 <", value, "shuifei3");
            return (Criteria) this;
        }

        public Criteria andShuifei3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHUIFEI3 <=", value, "shuifei3");
            return (Criteria) this;
        }

        public Criteria andShuifei3In(List<BigDecimal> values) {
            addCriterion("SHUIFEI3 in", values, "shuifei3");
            return (Criteria) this;
        }

        public Criteria andShuifei3NotIn(List<BigDecimal> values) {
            addCriterion("SHUIFEI3 not in", values, "shuifei3");
            return (Criteria) this;
        }

        public Criteria andShuifei3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHUIFEI3 between", value1, value2, "shuifei3");
            return (Criteria) this;
        }

        public Criteria andShuifei3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHUIFEI3 not between", value1, value2, "shuifei3");
            return (Criteria) this;
        }

        public Criteria andShuifei4IsNull() {
            addCriterion("SHUIFEI4 is null");
            return (Criteria) this;
        }

        public Criteria andShuifei4IsNotNull() {
            addCriterion("SHUIFEI4 is not null");
            return (Criteria) this;
        }

        public Criteria andShuifei4EqualTo(BigDecimal value) {
            addCriterion("SHUIFEI4 =", value, "shuifei4");
            return (Criteria) this;
        }

        public Criteria andShuifei4NotEqualTo(BigDecimal value) {
            addCriterion("SHUIFEI4 <>", value, "shuifei4");
            return (Criteria) this;
        }

        public Criteria andShuifei4GreaterThan(BigDecimal value) {
            addCriterion("SHUIFEI4 >", value, "shuifei4");
            return (Criteria) this;
        }

        public Criteria andShuifei4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHUIFEI4 >=", value, "shuifei4");
            return (Criteria) this;
        }

        public Criteria andShuifei4LessThan(BigDecimal value) {
            addCriterion("SHUIFEI4 <", value, "shuifei4");
            return (Criteria) this;
        }

        public Criteria andShuifei4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHUIFEI4 <=", value, "shuifei4");
            return (Criteria) this;
        }

        public Criteria andShuifei4In(List<BigDecimal> values) {
            addCriterion("SHUIFEI4 in", values, "shuifei4");
            return (Criteria) this;
        }

        public Criteria andShuifei4NotIn(List<BigDecimal> values) {
            addCriterion("SHUIFEI4 not in", values, "shuifei4");
            return (Criteria) this;
        }

        public Criteria andShuifei4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHUIFEI4 between", value1, value2, "shuifei4");
            return (Criteria) this;
        }

        public Criteria andShuifei4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHUIFEI4 not between", value1, value2, "shuifei4");
            return (Criteria) this;
        }

        public Criteria andShuifei5IsNull() {
            addCriterion("SHUIFEI5 is null");
            return (Criteria) this;
        }

        public Criteria andShuifei5IsNotNull() {
            addCriterion("SHUIFEI5 is not null");
            return (Criteria) this;
        }

        public Criteria andShuifei5EqualTo(BigDecimal value) {
            addCriterion("SHUIFEI5 =", value, "shuifei5");
            return (Criteria) this;
        }

        public Criteria andShuifei5NotEqualTo(BigDecimal value) {
            addCriterion("SHUIFEI5 <>", value, "shuifei5");
            return (Criteria) this;
        }

        public Criteria andShuifei5GreaterThan(BigDecimal value) {
            addCriterion("SHUIFEI5 >", value, "shuifei5");
            return (Criteria) this;
        }

        public Criteria andShuifei5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHUIFEI5 >=", value, "shuifei5");
            return (Criteria) this;
        }

        public Criteria andShuifei5LessThan(BigDecimal value) {
            addCriterion("SHUIFEI5 <", value, "shuifei5");
            return (Criteria) this;
        }

        public Criteria andShuifei5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHUIFEI5 <=", value, "shuifei5");
            return (Criteria) this;
        }

        public Criteria andShuifei5In(List<BigDecimal> values) {
            addCriterion("SHUIFEI5 in", values, "shuifei5");
            return (Criteria) this;
        }

        public Criteria andShuifei5NotIn(List<BigDecimal> values) {
            addCriterion("SHUIFEI5 not in", values, "shuifei5");
            return (Criteria) this;
        }

        public Criteria andShuifei5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHUIFEI5 between", value1, value2, "shuifei5");
            return (Criteria) this;
        }

        public Criteria andShuifei5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHUIFEI5 not between", value1, value2, "shuifei5");
            return (Criteria) this;
        }

        public Criteria andShuifei6IsNull() {
            addCriterion("SHUIFEI6 is null");
            return (Criteria) this;
        }

        public Criteria andShuifei6IsNotNull() {
            addCriterion("SHUIFEI6 is not null");
            return (Criteria) this;
        }

        public Criteria andShuifei6EqualTo(BigDecimal value) {
            addCriterion("SHUIFEI6 =", value, "shuifei6");
            return (Criteria) this;
        }

        public Criteria andShuifei6NotEqualTo(BigDecimal value) {
            addCriterion("SHUIFEI6 <>", value, "shuifei6");
            return (Criteria) this;
        }

        public Criteria andShuifei6GreaterThan(BigDecimal value) {
            addCriterion("SHUIFEI6 >", value, "shuifei6");
            return (Criteria) this;
        }

        public Criteria andShuifei6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHUIFEI6 >=", value, "shuifei6");
            return (Criteria) this;
        }

        public Criteria andShuifei6LessThan(BigDecimal value) {
            addCriterion("SHUIFEI6 <", value, "shuifei6");
            return (Criteria) this;
        }

        public Criteria andShuifei6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHUIFEI6 <=", value, "shuifei6");
            return (Criteria) this;
        }

        public Criteria andShuifei6In(List<BigDecimal> values) {
            addCriterion("SHUIFEI6 in", values, "shuifei6");
            return (Criteria) this;
        }

        public Criteria andShuifei6NotIn(List<BigDecimal> values) {
            addCriterion("SHUIFEI6 not in", values, "shuifei6");
            return (Criteria) this;
        }

        public Criteria andShuifei6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHUIFEI6 between", value1, value2, "shuifei6");
            return (Criteria) this;
        }

        public Criteria andShuifei6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHUIFEI6 not between", value1, value2, "shuifei6");
            return (Criteria) this;
        }

        public Criteria andShuifei7IsNull() {
            addCriterion("SHUIFEI7 is null");
            return (Criteria) this;
        }

        public Criteria andShuifei7IsNotNull() {
            addCriterion("SHUIFEI7 is not null");
            return (Criteria) this;
        }

        public Criteria andShuifei7EqualTo(BigDecimal value) {
            addCriterion("SHUIFEI7 =", value, "shuifei7");
            return (Criteria) this;
        }

        public Criteria andShuifei7NotEqualTo(BigDecimal value) {
            addCriterion("SHUIFEI7 <>", value, "shuifei7");
            return (Criteria) this;
        }

        public Criteria andShuifei7GreaterThan(BigDecimal value) {
            addCriterion("SHUIFEI7 >", value, "shuifei7");
            return (Criteria) this;
        }

        public Criteria andShuifei7GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHUIFEI7 >=", value, "shuifei7");
            return (Criteria) this;
        }

        public Criteria andShuifei7LessThan(BigDecimal value) {
            addCriterion("SHUIFEI7 <", value, "shuifei7");
            return (Criteria) this;
        }

        public Criteria andShuifei7LessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHUIFEI7 <=", value, "shuifei7");
            return (Criteria) this;
        }

        public Criteria andShuifei7In(List<BigDecimal> values) {
            addCriterion("SHUIFEI7 in", values, "shuifei7");
            return (Criteria) this;
        }

        public Criteria andShuifei7NotIn(List<BigDecimal> values) {
            addCriterion("SHUIFEI7 not in", values, "shuifei7");
            return (Criteria) this;
        }

        public Criteria andShuifei7Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHUIFEI7 between", value1, value2, "shuifei7");
            return (Criteria) this;
        }

        public Criteria andShuifei7NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHUIFEI7 not between", value1, value2, "shuifei7");
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

        public Criteria andXianjinjuanzengIsNull() {
            addCriterion("XIANJINJUANZENG is null");
            return (Criteria) this;
        }

        public Criteria andXianjinjuanzengIsNotNull() {
            addCriterion("XIANJINJUANZENG is not null");
            return (Criteria) this;
        }

        public Criteria andXianjinjuanzengEqualTo(BigDecimal value) {
            addCriterion("XIANJINJUANZENG =", value, "xianjinjuanzeng");
            return (Criteria) this;
        }

        public Criteria andXianjinjuanzengNotEqualTo(BigDecimal value) {
            addCriterion("XIANJINJUANZENG <>", value, "xianjinjuanzeng");
            return (Criteria) this;
        }

        public Criteria andXianjinjuanzengGreaterThan(BigDecimal value) {
            addCriterion("XIANJINJUANZENG >", value, "xianjinjuanzeng");
            return (Criteria) this;
        }

        public Criteria andXianjinjuanzengGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJINJUANZENG >=", value, "xianjinjuanzeng");
            return (Criteria) this;
        }

        public Criteria andXianjinjuanzengLessThan(BigDecimal value) {
            addCriterion("XIANJINJUANZENG <", value, "xianjinjuanzeng");
            return (Criteria) this;
        }

        public Criteria andXianjinjuanzengLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJINJUANZENG <=", value, "xianjinjuanzeng");
            return (Criteria) this;
        }

        public Criteria andXianjinjuanzengIn(List<BigDecimal> values) {
            addCriterion("XIANJINJUANZENG in", values, "xianjinjuanzeng");
            return (Criteria) this;
        }

        public Criteria andXianjinjuanzengNotIn(List<BigDecimal> values) {
            addCriterion("XIANJINJUANZENG not in", values, "xianjinjuanzeng");
            return (Criteria) this;
        }

        public Criteria andXianjinjuanzengBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJINJUANZENG between", value1, value2, "xianjinjuanzeng");
            return (Criteria) this;
        }

        public Criteria andXianjinjuanzengNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJINJUANZENG not between", value1, value2, "xianjinjuanzeng");
            return (Criteria) this;
        }

        public Criteria andXianjingongyiIsNull() {
            addCriterion("XIANJINGONGYI is null");
            return (Criteria) this;
        }

        public Criteria andXianjingongyiIsNotNull() {
            addCriterion("XIANJINGONGYI is not null");
            return (Criteria) this;
        }

        public Criteria andXianjingongyiEqualTo(BigDecimal value) {
            addCriterion("XIANJINGONGYI =", value, "xianjingongyi");
            return (Criteria) this;
        }

        public Criteria andXianjingongyiNotEqualTo(BigDecimal value) {
            addCriterion("XIANJINGONGYI <>", value, "xianjingongyi");
            return (Criteria) this;
        }

        public Criteria andXianjingongyiGreaterThan(BigDecimal value) {
            addCriterion("XIANJINGONGYI >", value, "xianjingongyi");
            return (Criteria) this;
        }

        public Criteria andXianjingongyiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJINGONGYI >=", value, "xianjingongyi");
            return (Criteria) this;
        }

        public Criteria andXianjingongyiLessThan(BigDecimal value) {
            addCriterion("XIANJINGONGYI <", value, "xianjingongyi");
            return (Criteria) this;
        }

        public Criteria andXianjingongyiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJINGONGYI <=", value, "xianjingongyi");
            return (Criteria) this;
        }

        public Criteria andXianjingongyiIn(List<BigDecimal> values) {
            addCriterion("XIANJINGONGYI in", values, "xianjingongyi");
            return (Criteria) this;
        }

        public Criteria andXianjingongyiNotIn(List<BigDecimal> values) {
            addCriterion("XIANJINGONGYI not in", values, "xianjingongyi");
            return (Criteria) this;
        }

        public Criteria andXianjingongyiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJINGONGYI between", value1, value2, "xianjingongyi");
            return (Criteria) this;
        }

        public Criteria andXianjingongyiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJINGONGYI not between", value1, value2, "xianjingongyi");
            return (Criteria) this;
        }

        public Criteria andXiandingxingIsNull() {
            addCriterion("XIANDINGXING is null");
            return (Criteria) this;
        }

        public Criteria andXiandingxingIsNotNull() {
            addCriterion("XIANDINGXING is not null");
            return (Criteria) this;
        }

        public Criteria andXiandingxingEqualTo(BigDecimal value) {
            addCriterion("XIANDINGXING =", value, "xiandingxing");
            return (Criteria) this;
        }

        public Criteria andXiandingxingNotEqualTo(BigDecimal value) {
            addCriterion("XIANDINGXING <>", value, "xiandingxing");
            return (Criteria) this;
        }

        public Criteria andXiandingxingGreaterThan(BigDecimal value) {
            addCriterion("XIANDINGXING >", value, "xiandingxing");
            return (Criteria) this;
        }

        public Criteria andXiandingxingGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANDINGXING >=", value, "xiandingxing");
            return (Criteria) this;
        }

        public Criteria andXiandingxingLessThan(BigDecimal value) {
            addCriterion("XIANDINGXING <", value, "xiandingxing");
            return (Criteria) this;
        }

        public Criteria andXiandingxingLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANDINGXING <=", value, "xiandingxing");
            return (Criteria) this;
        }

        public Criteria andXiandingxingIn(List<BigDecimal> values) {
            addCriterion("XIANDINGXING in", values, "xiandingxing");
            return (Criteria) this;
        }

        public Criteria andXiandingxingNotIn(List<BigDecimal> values) {
            addCriterion("XIANDINGXING not in", values, "xiandingxing");
            return (Criteria) this;
        }

        public Criteria andXiandingxingBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANDINGXING between", value1, value2, "xiandingxing");
            return (Criteria) this;
        }

        public Criteria andXiandingxingNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANDINGXING not between", value1, value2, "xiandingxing");
            return (Criteria) this;
        }

        public Criteria andXiandingzichanIsNull() {
            addCriterion("XIANDINGZICHAN is null");
            return (Criteria) this;
        }

        public Criteria andXiandingzichanIsNotNull() {
            addCriterion("XIANDINGZICHAN is not null");
            return (Criteria) this;
        }

        public Criteria andXiandingzichanEqualTo(BigDecimal value) {
            addCriterion("XIANDINGZICHAN =", value, "xiandingzichan");
            return (Criteria) this;
        }

        public Criteria andXiandingzichanNotEqualTo(BigDecimal value) {
            addCriterion("XIANDINGZICHAN <>", value, "xiandingzichan");
            return (Criteria) this;
        }

        public Criteria andXiandingzichanGreaterThan(BigDecimal value) {
            addCriterion("XIANDINGZICHAN >", value, "xiandingzichan");
            return (Criteria) this;
        }

        public Criteria andXiandingzichanGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANDINGZICHAN >=", value, "xiandingzichan");
            return (Criteria) this;
        }

        public Criteria andXiandingzichanLessThan(BigDecimal value) {
            addCriterion("XIANDINGZICHAN <", value, "xiandingzichan");
            return (Criteria) this;
        }

        public Criteria andXiandingzichanLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANDINGZICHAN <=", value, "xiandingzichan");
            return (Criteria) this;
        }

        public Criteria andXiandingzichanIn(List<BigDecimal> values) {
            addCriterion("XIANDINGZICHAN in", values, "xiandingzichan");
            return (Criteria) this;
        }

        public Criteria andXiandingzichanNotIn(List<BigDecimal> values) {
            addCriterion("XIANDINGZICHAN not in", values, "xiandingzichan");
            return (Criteria) this;
        }

        public Criteria andXiandingzichanBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANDINGZICHAN between", value1, value2, "xiandingzichan");
            return (Criteria) this;
        }

        public Criteria andXiandingzichanNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANDINGZICHAN not between", value1, value2, "xiandingzichan");
            return (Criteria) this;
        }

        public Criteria andQita1IsNull() {
            addCriterion("QITA1 is null");
            return (Criteria) this;
        }

        public Criteria andQita1IsNotNull() {
            addCriterion("QITA1 is not null");
            return (Criteria) this;
        }

        public Criteria andQita1EqualTo(BigDecimal value) {
            addCriterion("QITA1 =", value, "qita1");
            return (Criteria) this;
        }

        public Criteria andQita1NotEqualTo(BigDecimal value) {
            addCriterion("QITA1 <>", value, "qita1");
            return (Criteria) this;
        }

        public Criteria andQita1GreaterThan(BigDecimal value) {
            addCriterion("QITA1 >", value, "qita1");
            return (Criteria) this;
        }

        public Criteria andQita1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QITA1 >=", value, "qita1");
            return (Criteria) this;
        }

        public Criteria andQita1LessThan(BigDecimal value) {
            addCriterion("QITA1 <", value, "qita1");
            return (Criteria) this;
        }

        public Criteria andQita1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QITA1 <=", value, "qita1");
            return (Criteria) this;
        }

        public Criteria andQita1In(List<BigDecimal> values) {
            addCriterion("QITA1 in", values, "qita1");
            return (Criteria) this;
        }

        public Criteria andQita1NotIn(List<BigDecimal> values) {
            addCriterion("QITA1 not in", values, "qita1");
            return (Criteria) this;
        }

        public Criteria andQita1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QITA1 between", value1, value2, "qita1");
            return (Criteria) this;
        }

        public Criteria andQita1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QITA1 not between", value1, value2, "qita1");
            return (Criteria) this;
        }

        public Criteria andQita2IsNull() {
            addCriterion("QITA2 is null");
            return (Criteria) this;
        }

        public Criteria andQita2IsNotNull() {
            addCriterion("QITA2 is not null");
            return (Criteria) this;
        }

        public Criteria andQita2EqualTo(BigDecimal value) {
            addCriterion("QITA2 =", value, "qita2");
            return (Criteria) this;
        }

        public Criteria andQita2NotEqualTo(BigDecimal value) {
            addCriterion("QITA2 <>", value, "qita2");
            return (Criteria) this;
        }

        public Criteria andQita2GreaterThan(BigDecimal value) {
            addCriterion("QITA2 >", value, "qita2");
            return (Criteria) this;
        }

        public Criteria andQita2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QITA2 >=", value, "qita2");
            return (Criteria) this;
        }

        public Criteria andQita2LessThan(BigDecimal value) {
            addCriterion("QITA2 <", value, "qita2");
            return (Criteria) this;
        }

        public Criteria andQita2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QITA2 <=", value, "qita2");
            return (Criteria) this;
        }

        public Criteria andQita2In(List<BigDecimal> values) {
            addCriterion("QITA2 in", values, "qita2");
            return (Criteria) this;
        }

        public Criteria andQita2NotIn(List<BigDecimal> values) {
            addCriterion("QITA2 not in", values, "qita2");
            return (Criteria) this;
        }

        public Criteria andQita2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QITA2 between", value1, value2, "qita2");
            return (Criteria) this;
        }

        public Criteria andQita2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QITA2 not between", value1, value2, "qita2");
            return (Criteria) this;
        }

        public Criteria andQita3IsNull() {
            addCriterion("QITA3 is null");
            return (Criteria) this;
        }

        public Criteria andQita3IsNotNull() {
            addCriterion("QITA3 is not null");
            return (Criteria) this;
        }

        public Criteria andQita3EqualTo(BigDecimal value) {
            addCriterion("QITA3 =", value, "qita3");
            return (Criteria) this;
        }

        public Criteria andQita3NotEqualTo(BigDecimal value) {
            addCriterion("QITA3 <>", value, "qita3");
            return (Criteria) this;
        }

        public Criteria andQita3GreaterThan(BigDecimal value) {
            addCriterion("QITA3 >", value, "qita3");
            return (Criteria) this;
        }

        public Criteria andQita3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QITA3 >=", value, "qita3");
            return (Criteria) this;
        }

        public Criteria andQita3LessThan(BigDecimal value) {
            addCriterion("QITA3 <", value, "qita3");
            return (Criteria) this;
        }

        public Criteria andQita3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QITA3 <=", value, "qita3");
            return (Criteria) this;
        }

        public Criteria andQita3In(List<BigDecimal> values) {
            addCriterion("QITA3 in", values, "qita3");
            return (Criteria) this;
        }

        public Criteria andQita3NotIn(List<BigDecimal> values) {
            addCriterion("QITA3 not in", values, "qita3");
            return (Criteria) this;
        }

        public Criteria andQita3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QITA3 between", value1, value2, "qita3");
            return (Criteria) this;
        }

        public Criteria andQita3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QITA3 not between", value1, value2, "qita3");
            return (Criteria) this;
        }

        public Criteria andQita4IsNull() {
            addCriterion("QITA4 is null");
            return (Criteria) this;
        }

        public Criteria andQita4IsNotNull() {
            addCriterion("QITA4 is not null");
            return (Criteria) this;
        }

        public Criteria andQita4EqualTo(BigDecimal value) {
            addCriterion("QITA4 =", value, "qita4");
            return (Criteria) this;
        }

        public Criteria andQita4NotEqualTo(BigDecimal value) {
            addCriterion("QITA4 <>", value, "qita4");
            return (Criteria) this;
        }

        public Criteria andQita4GreaterThan(BigDecimal value) {
            addCriterion("QITA4 >", value, "qita4");
            return (Criteria) this;
        }

        public Criteria andQita4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QITA4 >=", value, "qita4");
            return (Criteria) this;
        }

        public Criteria andQita4LessThan(BigDecimal value) {
            addCriterion("QITA4 <", value, "qita4");
            return (Criteria) this;
        }

        public Criteria andQita4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QITA4 <=", value, "qita4");
            return (Criteria) this;
        }

        public Criteria andQita4In(List<BigDecimal> values) {
            addCriterion("QITA4 in", values, "qita4");
            return (Criteria) this;
        }

        public Criteria andQita4NotIn(List<BigDecimal> values) {
            addCriterion("QITA4 not in", values, "qita4");
            return (Criteria) this;
        }

        public Criteria andQita4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QITA4 between", value1, value2, "qita4");
            return (Criteria) this;
        }

        public Criteria andQita4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QITA4 not between", value1, value2, "qita4");
            return (Criteria) this;
        }

        public Criteria andQita5IsNull() {
            addCriterion("QITA5 is null");
            return (Criteria) this;
        }

        public Criteria andQita5IsNotNull() {
            addCriterion("QITA5 is not null");
            return (Criteria) this;
        }

        public Criteria andQita5EqualTo(BigDecimal value) {
            addCriterion("QITA5 =", value, "qita5");
            return (Criteria) this;
        }

        public Criteria andQita5NotEqualTo(BigDecimal value) {
            addCriterion("QITA5 <>", value, "qita5");
            return (Criteria) this;
        }

        public Criteria andQita5GreaterThan(BigDecimal value) {
            addCriterion("QITA5 >", value, "qita5");
            return (Criteria) this;
        }

        public Criteria andQita5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QITA5 >=", value, "qita5");
            return (Criteria) this;
        }

        public Criteria andQita5LessThan(BigDecimal value) {
            addCriterion("QITA5 <", value, "qita5");
            return (Criteria) this;
        }

        public Criteria andQita5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QITA5 <=", value, "qita5");
            return (Criteria) this;
        }

        public Criteria andQita5In(List<BigDecimal> values) {
            addCriterion("QITA5 in", values, "qita5");
            return (Criteria) this;
        }

        public Criteria andQita5NotIn(List<BigDecimal> values) {
            addCriterion("QITA5 not in", values, "qita5");
            return (Criteria) this;
        }

        public Criteria andQita5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QITA5 between", value1, value2, "qita5");
            return (Criteria) this;
        }

        public Criteria andQita5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QITA5 not between", value1, value2, "qita5");
            return (Criteria) this;
        }

        public Criteria andQita6IsNull() {
            addCriterion("QITA6 is null");
            return (Criteria) this;
        }

        public Criteria andQita6IsNotNull() {
            addCriterion("QITA6 is not null");
            return (Criteria) this;
        }

        public Criteria andQita6EqualTo(BigDecimal value) {
            addCriterion("QITA6 =", value, "qita6");
            return (Criteria) this;
        }

        public Criteria andQita6NotEqualTo(BigDecimal value) {
            addCriterion("QITA6 <>", value, "qita6");
            return (Criteria) this;
        }

        public Criteria andQita6GreaterThan(BigDecimal value) {
            addCriterion("QITA6 >", value, "qita6");
            return (Criteria) this;
        }

        public Criteria andQita6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QITA6 >=", value, "qita6");
            return (Criteria) this;
        }

        public Criteria andQita6LessThan(BigDecimal value) {
            addCriterion("QITA6 <", value, "qita6");
            return (Criteria) this;
        }

        public Criteria andQita6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QITA6 <=", value, "qita6");
            return (Criteria) this;
        }

        public Criteria andQita6In(List<BigDecimal> values) {
            addCriterion("QITA6 in", values, "qita6");
            return (Criteria) this;
        }

        public Criteria andQita6NotIn(List<BigDecimal> values) {
            addCriterion("QITA6 not in", values, "qita6");
            return (Criteria) this;
        }

        public Criteria andQita6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QITA6 between", value1, value2, "qita6");
            return (Criteria) this;
        }

        public Criteria andQita6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QITA6 not between", value1, value2, "qita6");
            return (Criteria) this;
        }

        public Criteria andFujiafeixianIsNull() {
            addCriterion("FUJIAFEIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andFujiafeixianIsNotNull() {
            addCriterion("FUJIAFEIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andFujiafeixianEqualTo(BigDecimal value) {
            addCriterion("FUJIAFEIXIAN =", value, "fujiafeixian");
            return (Criteria) this;
        }

        public Criteria andFujiafeixianNotEqualTo(BigDecimal value) {
            addCriterion("FUJIAFEIXIAN <>", value, "fujiafeixian");
            return (Criteria) this;
        }

        public Criteria andFujiafeixianGreaterThan(BigDecimal value) {
            addCriterion("FUJIAFEIXIAN >", value, "fujiafeixian");
            return (Criteria) this;
        }

        public Criteria andFujiafeixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FUJIAFEIXIAN >=", value, "fujiafeixian");
            return (Criteria) this;
        }

        public Criteria andFujiafeixianLessThan(BigDecimal value) {
            addCriterion("FUJIAFEIXIAN <", value, "fujiafeixian");
            return (Criteria) this;
        }

        public Criteria andFujiafeixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FUJIAFEIXIAN <=", value, "fujiafeixian");
            return (Criteria) this;
        }

        public Criteria andFujiafeixianIn(List<BigDecimal> values) {
            addCriterion("FUJIAFEIXIAN in", values, "fujiafeixian");
            return (Criteria) this;
        }

        public Criteria andFujiafeixianNotIn(List<BigDecimal> values) {
            addCriterion("FUJIAFEIXIAN not in", values, "fujiafeixian");
            return (Criteria) this;
        }

        public Criteria andFujiafeixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUJIAFEIXIAN between", value1, value2, "fujiafeixian");
            return (Criteria) this;
        }

        public Criteria andFujiafeixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUJIAFEIXIAN not between", value1, value2, "fujiafeixian");
            return (Criteria) this;
        }

        public Criteria andFujiaxianIsNull() {
            addCriterion("FUJIAXIAN is null");
            return (Criteria) this;
        }

        public Criteria andFujiaxianIsNotNull() {
            addCriterion("FUJIAXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andFujiaxianEqualTo(BigDecimal value) {
            addCriterion("FUJIAXIAN =", value, "fujiaxian");
            return (Criteria) this;
        }

        public Criteria andFujiaxianNotEqualTo(BigDecimal value) {
            addCriterion("FUJIAXIAN <>", value, "fujiaxian");
            return (Criteria) this;
        }

        public Criteria andFujiaxianGreaterThan(BigDecimal value) {
            addCriterion("FUJIAXIAN >", value, "fujiaxian");
            return (Criteria) this;
        }

        public Criteria andFujiaxianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FUJIAXIAN >=", value, "fujiaxian");
            return (Criteria) this;
        }

        public Criteria andFujiaxianLessThan(BigDecimal value) {
            addCriterion("FUJIAXIAN <", value, "fujiaxian");
            return (Criteria) this;
        }

        public Criteria andFujiaxianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FUJIAXIAN <=", value, "fujiaxian");
            return (Criteria) this;
        }

        public Criteria andFujiaxianIn(List<BigDecimal> values) {
            addCriterion("FUJIAXIAN in", values, "fujiaxian");
            return (Criteria) this;
        }

        public Criteria andFujiaxianNotIn(List<BigDecimal> values) {
            addCriterion("FUJIAXIAN not in", values, "fujiaxian");
            return (Criteria) this;
        }

        public Criteria andFujiaxianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUJIAXIAN between", value1, value2, "fujiaxian");
            return (Criteria) this;
        }

        public Criteria andFujiaxianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUJIAXIAN not between", value1, value2, "fujiaxian");
            return (Criteria) this;
        }

        public Criteria andFujiahejiIsNull() {
            addCriterion("FUJIAHEJI is null");
            return (Criteria) this;
        }

        public Criteria andFujiahejiIsNotNull() {
            addCriterion("FUJIAHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andFujiahejiEqualTo(BigDecimal value) {
            addCriterion("FUJIAHEJI =", value, "fujiaheji");
            return (Criteria) this;
        }

        public Criteria andFujiahejiNotEqualTo(BigDecimal value) {
            addCriterion("FUJIAHEJI <>", value, "fujiaheji");
            return (Criteria) this;
        }

        public Criteria andFujiahejiGreaterThan(BigDecimal value) {
            addCriterion("FUJIAHEJI >", value, "fujiaheji");
            return (Criteria) this;
        }

        public Criteria andFujiahejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FUJIAHEJI >=", value, "fujiaheji");
            return (Criteria) this;
        }

        public Criteria andFujiahejiLessThan(BigDecimal value) {
            addCriterion("FUJIAHEJI <", value, "fujiaheji");
            return (Criteria) this;
        }

        public Criteria andFujiahejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FUJIAHEJI <=", value, "fujiaheji");
            return (Criteria) this;
        }

        public Criteria andFujiahejiIn(List<BigDecimal> values) {
            addCriterion("FUJIAHEJI in", values, "fujiaheji");
            return (Criteria) this;
        }

        public Criteria andFujiahejiNotIn(List<BigDecimal> values) {
            addCriterion("FUJIAHEJI not in", values, "fujiaheji");
            return (Criteria) this;
        }

        public Criteria andFujiahejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUJIAHEJI between", value1, value2, "fujiaheji");
            return (Criteria) this;
        }

        public Criteria andFujiahejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUJIAHEJI not between", value1, value2, "fujiaheji");
            return (Criteria) this;
        }

        public Criteria andLeijifujiafeixianIsNull() {
            addCriterion("LEIJIFUJIAFEIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijifujiafeixianIsNotNull() {
            addCriterion("LEIJIFUJIAFEIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijifujiafeixianEqualTo(BigDecimal value) {
            addCriterion("LEIJIFUJIAFEIXIAN =", value, "leijifujiafeixian");
            return (Criteria) this;
        }

        public Criteria andLeijifujiafeixianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIFUJIAFEIXIAN <>", value, "leijifujiafeixian");
            return (Criteria) this;
        }

        public Criteria andLeijifujiafeixianGreaterThan(BigDecimal value) {
            addCriterion("LEIJIFUJIAFEIXIAN >", value, "leijifujiafeixian");
            return (Criteria) this;
        }

        public Criteria andLeijifujiafeixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIFUJIAFEIXIAN >=", value, "leijifujiafeixian");
            return (Criteria) this;
        }

        public Criteria andLeijifujiafeixianLessThan(BigDecimal value) {
            addCriterion("LEIJIFUJIAFEIXIAN <", value, "leijifujiafeixian");
            return (Criteria) this;
        }

        public Criteria andLeijifujiafeixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIFUJIAFEIXIAN <=", value, "leijifujiafeixian");
            return (Criteria) this;
        }

        public Criteria andLeijifujiafeixianIn(List<BigDecimal> values) {
            addCriterion("LEIJIFUJIAFEIXIAN in", values, "leijifujiafeixian");
            return (Criteria) this;
        }

        public Criteria andLeijifujiafeixianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIFUJIAFEIXIAN not in", values, "leijifujiafeixian");
            return (Criteria) this;
        }

        public Criteria andLeijifujiafeixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIFUJIAFEIXIAN between", value1, value2, "leijifujiafeixian");
            return (Criteria) this;
        }

        public Criteria andLeijifujiafeixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIFUJIAFEIXIAN not between", value1, value2, "leijifujiafeixian");
            return (Criteria) this;
        }

        public Criteria andLeijifujiaxianIsNull() {
            addCriterion("LEIJIFUJIAXIAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijifujiaxianIsNotNull() {
            addCriterion("LEIJIFUJIAXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijifujiaxianEqualTo(BigDecimal value) {
            addCriterion("LEIJIFUJIAXIAN =", value, "leijifujiaxian");
            return (Criteria) this;
        }

        public Criteria andLeijifujiaxianNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIFUJIAXIAN <>", value, "leijifujiaxian");
            return (Criteria) this;
        }

        public Criteria andLeijifujiaxianGreaterThan(BigDecimal value) {
            addCriterion("LEIJIFUJIAXIAN >", value, "leijifujiaxian");
            return (Criteria) this;
        }

        public Criteria andLeijifujiaxianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIFUJIAXIAN >=", value, "leijifujiaxian");
            return (Criteria) this;
        }

        public Criteria andLeijifujiaxianLessThan(BigDecimal value) {
            addCriterion("LEIJIFUJIAXIAN <", value, "leijifujiaxian");
            return (Criteria) this;
        }

        public Criteria andLeijifujiaxianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIFUJIAXIAN <=", value, "leijifujiaxian");
            return (Criteria) this;
        }

        public Criteria andLeijifujiaxianIn(List<BigDecimal> values) {
            addCriterion("LEIJIFUJIAXIAN in", values, "leijifujiaxian");
            return (Criteria) this;
        }

        public Criteria andLeijifujiaxianNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIFUJIAXIAN not in", values, "leijifujiaxian");
            return (Criteria) this;
        }

        public Criteria andLeijifujiaxianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIFUJIAXIAN between", value1, value2, "leijifujiaxian");
            return (Criteria) this;
        }

        public Criteria andLeijifujiaxianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIFUJIAXIAN not between", value1, value2, "leijifujiaxian");
            return (Criteria) this;
        }

        public Criteria andLeijifujiahejiIsNull() {
            addCriterion("LEIJIFUJIAHEJI is null");
            return (Criteria) this;
        }

        public Criteria andLeijifujiahejiIsNotNull() {
            addCriterion("LEIJIFUJIAHEJI is not null");
            return (Criteria) this;
        }

        public Criteria andLeijifujiahejiEqualTo(BigDecimal value) {
            addCriterion("LEIJIFUJIAHEJI =", value, "leijifujiaheji");
            return (Criteria) this;
        }

        public Criteria andLeijifujiahejiNotEqualTo(BigDecimal value) {
            addCriterion("LEIJIFUJIAHEJI <>", value, "leijifujiaheji");
            return (Criteria) this;
        }

        public Criteria andLeijifujiahejiGreaterThan(BigDecimal value) {
            addCriterion("LEIJIFUJIAHEJI >", value, "leijifujiaheji");
            return (Criteria) this;
        }

        public Criteria andLeijifujiahejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIFUJIAHEJI >=", value, "leijifujiaheji");
            return (Criteria) this;
        }

        public Criteria andLeijifujiahejiLessThan(BigDecimal value) {
            addCriterion("LEIJIFUJIAHEJI <", value, "leijifujiaheji");
            return (Criteria) this;
        }

        public Criteria andLeijifujiahejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEIJIFUJIAHEJI <=", value, "leijifujiaheji");
            return (Criteria) this;
        }

        public Criteria andLeijifujiahejiIn(List<BigDecimal> values) {
            addCriterion("LEIJIFUJIAHEJI in", values, "leijifujiaheji");
            return (Criteria) this;
        }

        public Criteria andLeijifujiahejiNotIn(List<BigDecimal> values) {
            addCriterion("LEIJIFUJIAHEJI not in", values, "leijifujiaheji");
            return (Criteria) this;
        }

        public Criteria andLeijifujiahejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIFUJIAHEJI between", value1, value2, "leijifujiaheji");
            return (Criteria) this;
        }

        public Criteria andLeijifujiahejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEIJIFUJIAHEJI not between", value1, value2, "leijifujiaheji");
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