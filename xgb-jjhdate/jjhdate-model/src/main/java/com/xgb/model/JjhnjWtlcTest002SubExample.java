package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JjhnjWtlcTest002SubExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JjhnjWtlcTest002SubExample() {
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

        public Criteria andShoutuorenIsNull() {
            addCriterion("SHOUTUOREN is null");
            return (Criteria) this;
        }

        public Criteria andShoutuorenIsNotNull() {
            addCriterion("SHOUTUOREN is not null");
            return (Criteria) this;
        }

        public Criteria andShoutuorenEqualTo(String value) {
            addCriterion("SHOUTUOREN =", value, "shoutuoren");
            return (Criteria) this;
        }

        public Criteria andShoutuorenNotEqualTo(String value) {
            addCriterion("SHOUTUOREN <>", value, "shoutuoren");
            return (Criteria) this;
        }

        public Criteria andShoutuorenGreaterThan(String value) {
            addCriterion("SHOUTUOREN >", value, "shoutuoren");
            return (Criteria) this;
        }

        public Criteria andShoutuorenGreaterThanOrEqualTo(String value) {
            addCriterion("SHOUTUOREN >=", value, "shoutuoren");
            return (Criteria) this;
        }

        public Criteria andShoutuorenLessThan(String value) {
            addCriterion("SHOUTUOREN <", value, "shoutuoren");
            return (Criteria) this;
        }

        public Criteria andShoutuorenLessThanOrEqualTo(String value) {
            addCriterion("SHOUTUOREN <=", value, "shoutuoren");
            return (Criteria) this;
        }

        public Criteria andShoutuorenLike(String value) {
            addCriterion("SHOUTUOREN like", value, "shoutuoren");
            return (Criteria) this;
        }

        public Criteria andShoutuorenNotLike(String value) {
            addCriterion("SHOUTUOREN not like", value, "shoutuoren");
            return (Criteria) this;
        }

        public Criteria andShoutuorenIn(List<String> values) {
            addCriterion("SHOUTUOREN in", values, "shoutuoren");
            return (Criteria) this;
        }

        public Criteria andShoutuorenNotIn(List<String> values) {
            addCriterion("SHOUTUOREN not in", values, "shoutuoren");
            return (Criteria) this;
        }

        public Criteria andShoutuorenBetween(String value1, String value2) {
            addCriterion("SHOUTUOREN between", value1, value2, "shoutuoren");
            return (Criteria) this;
        }

        public Criteria andShoutuorenNotBetween(String value1, String value2) {
            addCriterion("SHOUTUOREN not between", value1, value2, "shoutuoren");
            return (Criteria) this;
        }

        public Criteria andFarenIsNull() {
            addCriterion("FAREN is null");
            return (Criteria) this;
        }

        public Criteria andFarenIsNotNull() {
            addCriterion("FAREN is not null");
            return (Criteria) this;
        }

        public Criteria andFarenEqualTo(String value) {
            addCriterion("FAREN =", value, "faren");
            return (Criteria) this;
        }

        public Criteria andFarenNotEqualTo(String value) {
            addCriterion("FAREN <>", value, "faren");
            return (Criteria) this;
        }

        public Criteria andFarenGreaterThan(String value) {
            addCriterion("FAREN >", value, "faren");
            return (Criteria) this;
        }

        public Criteria andFarenGreaterThanOrEqualTo(String value) {
            addCriterion("FAREN >=", value, "faren");
            return (Criteria) this;
        }

        public Criteria andFarenLessThan(String value) {
            addCriterion("FAREN <", value, "faren");
            return (Criteria) this;
        }

        public Criteria andFarenLessThanOrEqualTo(String value) {
            addCriterion("FAREN <=", value, "faren");
            return (Criteria) this;
        }

        public Criteria andFarenLike(String value) {
            addCriterion("FAREN like", value, "faren");
            return (Criteria) this;
        }

        public Criteria andFarenNotLike(String value) {
            addCriterion("FAREN not like", value, "faren");
            return (Criteria) this;
        }

        public Criteria andFarenIn(List<String> values) {
            addCriterion("FAREN in", values, "faren");
            return (Criteria) this;
        }

        public Criteria andFarenNotIn(List<String> values) {
            addCriterion("FAREN not in", values, "faren");
            return (Criteria) this;
        }

        public Criteria andFarenBetween(String value1, String value2) {
            addCriterion("FAREN between", value1, value2, "faren");
            return (Criteria) this;
        }

        public Criteria andFarenNotBetween(String value1, String value2) {
            addCriterion("FAREN not between", value1, value2, "faren");
            return (Criteria) this;
        }

        public Criteria andWeituojineIsNull() {
            addCriterion("WEITUOJINE is null");
            return (Criteria) this;
        }

        public Criteria andWeituojineIsNotNull() {
            addCriterion("WEITUOJINE is not null");
            return (Criteria) this;
        }

        public Criteria andWeituojineEqualTo(BigDecimal value) {
            addCriterion("WEITUOJINE =", value, "weituojine");
            return (Criteria) this;
        }

        public Criteria andWeituojineNotEqualTo(BigDecimal value) {
            addCriterion("WEITUOJINE <>", value, "weituojine");
            return (Criteria) this;
        }

        public Criteria andWeituojineGreaterThan(BigDecimal value) {
            addCriterion("WEITUOJINE >", value, "weituojine");
            return (Criteria) this;
        }

        public Criteria andWeituojineGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WEITUOJINE >=", value, "weituojine");
            return (Criteria) this;
        }

        public Criteria andWeituojineLessThan(BigDecimal value) {
            addCriterion("WEITUOJINE <", value, "weituojine");
            return (Criteria) this;
        }

        public Criteria andWeituojineLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WEITUOJINE <=", value, "weituojine");
            return (Criteria) this;
        }

        public Criteria andWeituojineIn(List<BigDecimal> values) {
            addCriterion("WEITUOJINE in", values, "weituojine");
            return (Criteria) this;
        }

        public Criteria andWeituojineNotIn(List<BigDecimal> values) {
            addCriterion("WEITUOJINE not in", values, "weituojine");
            return (Criteria) this;
        }

        public Criteria andWeituojineBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEITUOJINE between", value1, value2, "weituojine");
            return (Criteria) this;
        }

        public Criteria andWeituojineNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEITUOJINE not between", value1, value2, "weituojine");
            return (Criteria) this;
        }

        public Criteria andWeituoqixianIsNull() {
            addCriterion("WEITUOQIXIAN is null");
            return (Criteria) this;
        }

        public Criteria andWeituoqixianIsNotNull() {
            addCriterion("WEITUOQIXIAN is not null");
            return (Criteria) this;
        }

        public Criteria andWeituoqixianEqualTo(String value) {
            addCriterion("WEITUOQIXIAN =", value, "weituoqixian");
            return (Criteria) this;
        }

        public Criteria andWeituoqixianNotEqualTo(String value) {
            addCriterion("WEITUOQIXIAN <>", value, "weituoqixian");
            return (Criteria) this;
        }

        public Criteria andWeituoqixianGreaterThan(String value) {
            addCriterion("WEITUOQIXIAN >", value, "weituoqixian");
            return (Criteria) this;
        }

        public Criteria andWeituoqixianGreaterThanOrEqualTo(String value) {
            addCriterion("WEITUOQIXIAN >=", value, "weituoqixian");
            return (Criteria) this;
        }

        public Criteria andWeituoqixianLessThan(String value) {
            addCriterion("WEITUOQIXIAN <", value, "weituoqixian");
            return (Criteria) this;
        }

        public Criteria andWeituoqixianLessThanOrEqualTo(String value) {
            addCriterion("WEITUOQIXIAN <=", value, "weituoqixian");
            return (Criteria) this;
        }

        public Criteria andWeituoqixianLike(String value) {
            addCriterion("WEITUOQIXIAN like", value, "weituoqixian");
            return (Criteria) this;
        }

        public Criteria andWeituoqixianNotLike(String value) {
            addCriterion("WEITUOQIXIAN not like", value, "weituoqixian");
            return (Criteria) this;
        }

        public Criteria andWeituoqixianIn(List<String> values) {
            addCriterion("WEITUOQIXIAN in", values, "weituoqixian");
            return (Criteria) this;
        }

        public Criteria andWeituoqixianNotIn(List<String> values) {
            addCriterion("WEITUOQIXIAN not in", values, "weituoqixian");
            return (Criteria) this;
        }

        public Criteria andWeituoqixianBetween(String value1, String value2) {
            addCriterion("WEITUOQIXIAN between", value1, value2, "weituoqixian");
            return (Criteria) this;
        }

        public Criteria andWeituoqixianNotBetween(String value1, String value2) {
            addCriterion("WEITUOQIXIAN not between", value1, value2, "weituoqixian");
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

        public Criteria andBaochouEqualTo(String value) {
            addCriterion("BAOCHOU =", value, "baochou");
            return (Criteria) this;
        }

        public Criteria andBaochouNotEqualTo(String value) {
            addCriterion("BAOCHOU <>", value, "baochou");
            return (Criteria) this;
        }

        public Criteria andBaochouGreaterThan(String value) {
            addCriterion("BAOCHOU >", value, "baochou");
            return (Criteria) this;
        }

        public Criteria andBaochouGreaterThanOrEqualTo(String value) {
            addCriterion("BAOCHOU >=", value, "baochou");
            return (Criteria) this;
        }

        public Criteria andBaochouLessThan(String value) {
            addCriterion("BAOCHOU <", value, "baochou");
            return (Criteria) this;
        }

        public Criteria andBaochouLessThanOrEqualTo(String value) {
            addCriterion("BAOCHOU <=", value, "baochou");
            return (Criteria) this;
        }

        public Criteria andBaochouLike(String value) {
            addCriterion("BAOCHOU like", value, "baochou");
            return (Criteria) this;
        }

        public Criteria andBaochouNotLike(String value) {
            addCriterion("BAOCHOU not like", value, "baochou");
            return (Criteria) this;
        }

        public Criteria andBaochouIn(List<String> values) {
            addCriterion("BAOCHOU in", values, "baochou");
            return (Criteria) this;
        }

        public Criteria andBaochouNotIn(List<String> values) {
            addCriterion("BAOCHOU not in", values, "baochou");
            return (Criteria) this;
        }

        public Criteria andBaochouBetween(String value1, String value2) {
            addCriterion("BAOCHOU between", value1, value2, "baochou");
            return (Criteria) this;
        }

        public Criteria andBaochouNotBetween(String value1, String value2) {
            addCriterion("BAOCHOU not between", value1, value2, "baochou");
            return (Criteria) this;
        }

        public Criteria andShijishouyiIsNull() {
            addCriterion("SHIJISHOUYI is null");
            return (Criteria) this;
        }

        public Criteria andShijishouyiIsNotNull() {
            addCriterion("SHIJISHOUYI is not null");
            return (Criteria) this;
        }

        public Criteria andShijishouyiEqualTo(String value) {
            addCriterion("SHIJISHOUYI =", value, "shijishouyi");
            return (Criteria) this;
        }

        public Criteria andShijishouyiNotEqualTo(String value) {
            addCriterion("SHIJISHOUYI <>", value, "shijishouyi");
            return (Criteria) this;
        }

        public Criteria andShijishouyiGreaterThan(String value) {
            addCriterion("SHIJISHOUYI >", value, "shijishouyi");
            return (Criteria) this;
        }

        public Criteria andShijishouyiGreaterThanOrEqualTo(String value) {
            addCriterion("SHIJISHOUYI >=", value, "shijishouyi");
            return (Criteria) this;
        }

        public Criteria andShijishouyiLessThan(String value) {
            addCriterion("SHIJISHOUYI <", value, "shijishouyi");
            return (Criteria) this;
        }

        public Criteria andShijishouyiLessThanOrEqualTo(String value) {
            addCriterion("SHIJISHOUYI <=", value, "shijishouyi");
            return (Criteria) this;
        }

        public Criteria andShijishouyiLike(String value) {
            addCriterion("SHIJISHOUYI like", value, "shijishouyi");
            return (Criteria) this;
        }

        public Criteria andShijishouyiNotLike(String value) {
            addCriterion("SHIJISHOUYI not like", value, "shijishouyi");
            return (Criteria) this;
        }

        public Criteria andShijishouyiIn(List<String> values) {
            addCriterion("SHIJISHOUYI in", values, "shijishouyi");
            return (Criteria) this;
        }

        public Criteria andShijishouyiNotIn(List<String> values) {
            addCriterion("SHIJISHOUYI not in", values, "shijishouyi");
            return (Criteria) this;
        }

        public Criteria andShijishouyiBetween(String value1, String value2) {
            addCriterion("SHIJISHOUYI between", value1, value2, "shijishouyi");
            return (Criteria) this;
        }

        public Criteria andShijishouyiNotBetween(String value1, String value2) {
            addCriterion("SHIJISHOUYI not between", value1, value2, "shijishouyi");
            return (Criteria) this;
        }

        public Criteria andShouhuijineIsNull() {
            addCriterion("SHOUHUIJINE is null");
            return (Criteria) this;
        }

        public Criteria andShouhuijineIsNotNull() {
            addCriterion("SHOUHUIJINE is not null");
            return (Criteria) this;
        }

        public Criteria andShouhuijineEqualTo(BigDecimal value) {
            addCriterion("SHOUHUIJINE =", value, "shouhuijine");
            return (Criteria) this;
        }

        public Criteria andShouhuijineNotEqualTo(BigDecimal value) {
            addCriterion("SHOUHUIJINE <>", value, "shouhuijine");
            return (Criteria) this;
        }

        public Criteria andShouhuijineGreaterThan(BigDecimal value) {
            addCriterion("SHOUHUIJINE >", value, "shouhuijine");
            return (Criteria) this;
        }

        public Criteria andShouhuijineGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOUHUIJINE >=", value, "shouhuijine");
            return (Criteria) this;
        }

        public Criteria andShouhuijineLessThan(BigDecimal value) {
            addCriterion("SHOUHUIJINE <", value, "shouhuijine");
            return (Criteria) this;
        }

        public Criteria andShouhuijineLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOUHUIJINE <=", value, "shouhuijine");
            return (Criteria) this;
        }

        public Criteria andShouhuijineIn(List<BigDecimal> values) {
            addCriterion("SHOUHUIJINE in", values, "shouhuijine");
            return (Criteria) this;
        }

        public Criteria andShouhuijineNotIn(List<BigDecimal> values) {
            addCriterion("SHOUHUIJINE not in", values, "shouhuijine");
            return (Criteria) this;
        }

        public Criteria andShouhuijineBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOUHUIJINE between", value1, value2, "shouhuijine");
            return (Criteria) this;
        }

        public Criteria andShouhuijineNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOUHUIJINE not between", value1, value2, "shouhuijine");
            return (Criteria) this;
        }

        public Criteria andIszizhiIsNull() {
            addCriterion("ISZIZHI is null");
            return (Criteria) this;
        }

        public Criteria andIszizhiIsNotNull() {
            addCriterion("ISZIZHI is not null");
            return (Criteria) this;
        }

        public Criteria andIszizhiEqualTo(Short value) {
            addCriterion("ISZIZHI =", value, "iszizhi");
            return (Criteria) this;
        }

        public Criteria andIszizhiNotEqualTo(Short value) {
            addCriterion("ISZIZHI <>", value, "iszizhi");
            return (Criteria) this;
        }

        public Criteria andIszizhiGreaterThan(Short value) {
            addCriterion("ISZIZHI >", value, "iszizhi");
            return (Criteria) this;
        }

        public Criteria andIszizhiGreaterThanOrEqualTo(Short value) {
            addCriterion("ISZIZHI >=", value, "iszizhi");
            return (Criteria) this;
        }

        public Criteria andIszizhiLessThan(Short value) {
            addCriterion("ISZIZHI <", value, "iszizhi");
            return (Criteria) this;
        }

        public Criteria andIszizhiLessThanOrEqualTo(Short value) {
            addCriterion("ISZIZHI <=", value, "iszizhi");
            return (Criteria) this;
        }

        public Criteria andIszizhiIn(List<Short> values) {
            addCriterion("ISZIZHI in", values, "iszizhi");
            return (Criteria) this;
        }

        public Criteria andIszizhiNotIn(List<Short> values) {
            addCriterion("ISZIZHI not in", values, "iszizhi");
            return (Criteria) this;
        }

        public Criteria andIszizhiBetween(Short value1, Short value2) {
            addCriterion("ISZIZHI between", value1, value2, "iszizhi");
            return (Criteria) this;
        }

        public Criteria andIszizhiNotBetween(Short value1, Short value2) {
            addCriterion("ISZIZHI not between", value1, value2, "iszizhi");
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