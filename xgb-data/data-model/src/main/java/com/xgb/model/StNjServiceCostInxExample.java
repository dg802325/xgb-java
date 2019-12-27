package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StNjServiceCostInxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StNjServiceCostInxExample() {
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

        public Criteria andFuwushoufeizongeIsNull() {
            addCriterion("FUWUSHOUFEIZONGE is null");
            return (Criteria) this;
        }

        public Criteria andFuwushoufeizongeIsNotNull() {
            addCriterion("FUWUSHOUFEIZONGE is not null");
            return (Criteria) this;
        }

        public Criteria andFuwushoufeizongeEqualTo(BigDecimal value) {
            addCriterion("FUWUSHOUFEIZONGE =", value, "fuwushoufeizonge");
            return (Criteria) this;
        }

        public Criteria andFuwushoufeizongeNotEqualTo(BigDecimal value) {
            addCriterion("FUWUSHOUFEIZONGE <>", value, "fuwushoufeizonge");
            return (Criteria) this;
        }

        public Criteria andFuwushoufeizongeGreaterThan(BigDecimal value) {
            addCriterion("FUWUSHOUFEIZONGE >", value, "fuwushoufeizonge");
            return (Criteria) this;
        }

        public Criteria andFuwushoufeizongeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FUWUSHOUFEIZONGE >=", value, "fuwushoufeizonge");
            return (Criteria) this;
        }

        public Criteria andFuwushoufeizongeLessThan(BigDecimal value) {
            addCriterion("FUWUSHOUFEIZONGE <", value, "fuwushoufeizonge");
            return (Criteria) this;
        }

        public Criteria andFuwushoufeizongeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FUWUSHOUFEIZONGE <=", value, "fuwushoufeizonge");
            return (Criteria) this;
        }

        public Criteria andFuwushoufeizongeIn(List<BigDecimal> values) {
            addCriterion("FUWUSHOUFEIZONGE in", values, "fuwushoufeizonge");
            return (Criteria) this;
        }

        public Criteria andFuwushoufeizongeNotIn(List<BigDecimal> values) {
            addCriterion("FUWUSHOUFEIZONGE not in", values, "fuwushoufeizonge");
            return (Criteria) this;
        }

        public Criteria andFuwushoufeizongeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUWUSHOUFEIZONGE between", value1, value2, "fuwushoufeizonge");
            return (Criteria) this;
        }

        public Criteria andFuwushoufeizongeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUWUSHOUFEIZONGE not between", value1, value2, "fuwushoufeizonge");
            return (Criteria) this;
        }

        public Criteria andShifouqiangzhiIsNull() {
            addCriterion("SHIFOUQIANGZHI is null");
            return (Criteria) this;
        }

        public Criteria andShifouqiangzhiIsNotNull() {
            addCriterion("SHIFOUQIANGZHI is not null");
            return (Criteria) this;
        }

        public Criteria andShifouqiangzhiEqualTo(String value) {
            addCriterion("SHIFOUQIANGZHI =", value, "shifouqiangzhi");
            return (Criteria) this;
        }

        public Criteria andShifouqiangzhiNotEqualTo(String value) {
            addCriterion("SHIFOUQIANGZHI <>", value, "shifouqiangzhi");
            return (Criteria) this;
        }

        public Criteria andShifouqiangzhiGreaterThan(String value) {
            addCriterion("SHIFOUQIANGZHI >", value, "shifouqiangzhi");
            return (Criteria) this;
        }

        public Criteria andShifouqiangzhiGreaterThanOrEqualTo(String value) {
            addCriterion("SHIFOUQIANGZHI >=", value, "shifouqiangzhi");
            return (Criteria) this;
        }

        public Criteria andShifouqiangzhiLessThan(String value) {
            addCriterion("SHIFOUQIANGZHI <", value, "shifouqiangzhi");
            return (Criteria) this;
        }

        public Criteria andShifouqiangzhiLessThanOrEqualTo(String value) {
            addCriterion("SHIFOUQIANGZHI <=", value, "shifouqiangzhi");
            return (Criteria) this;
        }

        public Criteria andShifouqiangzhiLike(String value) {
            addCriterion("SHIFOUQIANGZHI like", value, "shifouqiangzhi");
            return (Criteria) this;
        }

        public Criteria andShifouqiangzhiNotLike(String value) {
            addCriterion("SHIFOUQIANGZHI not like", value, "shifouqiangzhi");
            return (Criteria) this;
        }

        public Criteria andShifouqiangzhiIn(List<String> values) {
            addCriterion("SHIFOUQIANGZHI in", values, "shifouqiangzhi");
            return (Criteria) this;
        }

        public Criteria andShifouqiangzhiNotIn(List<String> values) {
            addCriterion("SHIFOUQIANGZHI not in", values, "shifouqiangzhi");
            return (Criteria) this;
        }

        public Criteria andShifouqiangzhiBetween(String value1, String value2) {
            addCriterion("SHIFOUQIANGZHI between", value1, value2, "shifouqiangzhi");
            return (Criteria) this;
        }

        public Criteria andShifouqiangzhiNotBetween(String value1, String value2) {
            addCriterion("SHIFOUQIANGZHI not between", value1, value2, "shifouqiangzhi");
            return (Criteria) this;
        }

        public Criteria andQiangzhishejijineIsNull() {
            addCriterion("QIANGZHISHEJIJINE is null");
            return (Criteria) this;
        }

        public Criteria andQiangzhishejijineIsNotNull() {
            addCriterion("QIANGZHISHEJIJINE is not null");
            return (Criteria) this;
        }

        public Criteria andQiangzhishejijineEqualTo(BigDecimal value) {
            addCriterion("QIANGZHISHEJIJINE =", value, "qiangzhishejijine");
            return (Criteria) this;
        }

        public Criteria andQiangzhishejijineNotEqualTo(BigDecimal value) {
            addCriterion("QIANGZHISHEJIJINE <>", value, "qiangzhishejijine");
            return (Criteria) this;
        }

        public Criteria andQiangzhishejijineGreaterThan(BigDecimal value) {
            addCriterion("QIANGZHISHEJIJINE >", value, "qiangzhishejijine");
            return (Criteria) this;
        }

        public Criteria andQiangzhishejijineGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QIANGZHISHEJIJINE >=", value, "qiangzhishejijine");
            return (Criteria) this;
        }

        public Criteria andQiangzhishejijineLessThan(BigDecimal value) {
            addCriterion("QIANGZHISHEJIJINE <", value, "qiangzhishejijine");
            return (Criteria) this;
        }

        public Criteria andQiangzhishejijineLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QIANGZHISHEJIJINE <=", value, "qiangzhishejijine");
            return (Criteria) this;
        }

        public Criteria andQiangzhishejijineIn(List<BigDecimal> values) {
            addCriterion("QIANGZHISHEJIJINE in", values, "qiangzhishejijine");
            return (Criteria) this;
        }

        public Criteria andQiangzhishejijineNotIn(List<BigDecimal> values) {
            addCriterion("QIANGZHISHEJIJINE not in", values, "qiangzhishejijine");
            return (Criteria) this;
        }

        public Criteria andQiangzhishejijineBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIANGZHISHEJIJINE between", value1, value2, "qiangzhishejijine");
            return (Criteria) this;
        }

        public Criteria andQiangzhishejijineNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QIANGZHISHEJIJINE not between", value1, value2, "qiangzhishejijine");
            return (Criteria) this;
        }

        public Criteria andShifouliyongIsNull() {
            addCriterion("SHIFOULIYONG is null");
            return (Criteria) this;
        }

        public Criteria andShifouliyongIsNotNull() {
            addCriterion("SHIFOULIYONG is not null");
            return (Criteria) this;
        }

        public Criteria andShifouliyongEqualTo(String value) {
            addCriterion("SHIFOULIYONG =", value, "shifouliyong");
            return (Criteria) this;
        }

        public Criteria andShifouliyongNotEqualTo(String value) {
            addCriterion("SHIFOULIYONG <>", value, "shifouliyong");
            return (Criteria) this;
        }

        public Criteria andShifouliyongGreaterThan(String value) {
            addCriterion("SHIFOULIYONG >", value, "shifouliyong");
            return (Criteria) this;
        }

        public Criteria andShifouliyongGreaterThanOrEqualTo(String value) {
            addCriterion("SHIFOULIYONG >=", value, "shifouliyong");
            return (Criteria) this;
        }

        public Criteria andShifouliyongLessThan(String value) {
            addCriterion("SHIFOULIYONG <", value, "shifouliyong");
            return (Criteria) this;
        }

        public Criteria andShifouliyongLessThanOrEqualTo(String value) {
            addCriterion("SHIFOULIYONG <=", value, "shifouliyong");
            return (Criteria) this;
        }

        public Criteria andShifouliyongLike(String value) {
            addCriterion("SHIFOULIYONG like", value, "shifouliyong");
            return (Criteria) this;
        }

        public Criteria andShifouliyongNotLike(String value) {
            addCriterion("SHIFOULIYONG not like", value, "shifouliyong");
            return (Criteria) this;
        }

        public Criteria andShifouliyongIn(List<String> values) {
            addCriterion("SHIFOULIYONG in", values, "shifouliyong");
            return (Criteria) this;
        }

        public Criteria andShifouliyongNotIn(List<String> values) {
            addCriterion("SHIFOULIYONG not in", values, "shifouliyong");
            return (Criteria) this;
        }

        public Criteria andShifouliyongBetween(String value1, String value2) {
            addCriterion("SHIFOULIYONG between", value1, value2, "shifouliyong");
            return (Criteria) this;
        }

        public Criteria andShifouliyongNotBetween(String value1, String value2) {
            addCriterion("SHIFOULIYONG not between", value1, value2, "shifouliyong");
            return (Criteria) this;
        }

        public Criteria andLiyongshejijineIsNull() {
            addCriterion("LIYONGSHEJIJINE is null");
            return (Criteria) this;
        }

        public Criteria andLiyongshejijineIsNotNull() {
            addCriterion("LIYONGSHEJIJINE is not null");
            return (Criteria) this;
        }

        public Criteria andLiyongshejijineEqualTo(BigDecimal value) {
            addCriterion("LIYONGSHEJIJINE =", value, "liyongshejijine");
            return (Criteria) this;
        }

        public Criteria andLiyongshejijineNotEqualTo(BigDecimal value) {
            addCriterion("LIYONGSHEJIJINE <>", value, "liyongshejijine");
            return (Criteria) this;
        }

        public Criteria andLiyongshejijineGreaterThan(BigDecimal value) {
            addCriterion("LIYONGSHEJIJINE >", value, "liyongshejijine");
            return (Criteria) this;
        }

        public Criteria andLiyongshejijineGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIYONGSHEJIJINE >=", value, "liyongshejijine");
            return (Criteria) this;
        }

        public Criteria andLiyongshejijineLessThan(BigDecimal value) {
            addCriterion("LIYONGSHEJIJINE <", value, "liyongshejijine");
            return (Criteria) this;
        }

        public Criteria andLiyongshejijineLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIYONGSHEJIJINE <=", value, "liyongshejijine");
            return (Criteria) this;
        }

        public Criteria andLiyongshejijineIn(List<BigDecimal> values) {
            addCriterion("LIYONGSHEJIJINE in", values, "liyongshejijine");
            return (Criteria) this;
        }

        public Criteria andLiyongshejijineNotIn(List<BigDecimal> values) {
            addCriterion("LIYONGSHEJIJINE not in", values, "liyongshejijine");
            return (Criteria) this;
        }

        public Criteria andLiyongshejijineBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIYONGSHEJIJINE between", value1, value2, "liyongshejijine");
            return (Criteria) this;
        }

        public Criteria andLiyongshejijineNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIYONGSHEJIJINE not between", value1, value2, "liyongshejijine");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianhuifeiIsNull() {
            addCriterion("ZIXINGJIANMIANHUIFEI is null");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianhuifeiIsNotNull() {
            addCriterion("ZIXINGJIANMIANHUIFEI is not null");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianhuifeiEqualTo(BigDecimal value) {
            addCriterion("ZIXINGJIANMIANHUIFEI =", value, "zixingjianmianhuifei");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianhuifeiNotEqualTo(BigDecimal value) {
            addCriterion("ZIXINGJIANMIANHUIFEI <>", value, "zixingjianmianhuifei");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianhuifeiGreaterThan(BigDecimal value) {
            addCriterion("ZIXINGJIANMIANHUIFEI >", value, "zixingjianmianhuifei");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianhuifeiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZIXINGJIANMIANHUIFEI >=", value, "zixingjianmianhuifei");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianhuifeiLessThan(BigDecimal value) {
            addCriterion("ZIXINGJIANMIANHUIFEI <", value, "zixingjianmianhuifei");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianhuifeiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZIXINGJIANMIANHUIFEI <=", value, "zixingjianmianhuifei");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianhuifeiIn(List<BigDecimal> values) {
            addCriterion("ZIXINGJIANMIANHUIFEI in", values, "zixingjianmianhuifei");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianhuifeiNotIn(List<BigDecimal> values) {
            addCriterion("ZIXINGJIANMIANHUIFEI not in", values, "zixingjianmianhuifei");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianhuifeiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZIXINGJIANMIANHUIFEI between", value1, value2, "zixingjianmianhuifei");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianhuifeiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZIXINGJIANMIANHUIFEI not between", value1, value2, "zixingjianmianhuifei");
            return (Criteria) this;
        }

        public Criteria andJianmianhuifeijutiqingkuangIsNull() {
            addCriterion("JIANMIANHUIFEIJUTIQINGKUANG is null");
            return (Criteria) this;
        }

        public Criteria andJianmianhuifeijutiqingkuangIsNotNull() {
            addCriterion("JIANMIANHUIFEIJUTIQINGKUANG is not null");
            return (Criteria) this;
        }

        public Criteria andJianmianhuifeijutiqingkuangEqualTo(String value) {
            addCriterion("JIANMIANHUIFEIJUTIQINGKUANG =", value, "jianmianhuifeijutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andJianmianhuifeijutiqingkuangNotEqualTo(String value) {
            addCriterion("JIANMIANHUIFEIJUTIQINGKUANG <>", value, "jianmianhuifeijutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andJianmianhuifeijutiqingkuangGreaterThan(String value) {
            addCriterion("JIANMIANHUIFEIJUTIQINGKUANG >", value, "jianmianhuifeijutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andJianmianhuifeijutiqingkuangGreaterThanOrEqualTo(String value) {
            addCriterion("JIANMIANHUIFEIJUTIQINGKUANG >=", value, "jianmianhuifeijutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andJianmianhuifeijutiqingkuangLessThan(String value) {
            addCriterion("JIANMIANHUIFEIJUTIQINGKUANG <", value, "jianmianhuifeijutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andJianmianhuifeijutiqingkuangLessThanOrEqualTo(String value) {
            addCriterion("JIANMIANHUIFEIJUTIQINGKUANG <=", value, "jianmianhuifeijutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andJianmianhuifeijutiqingkuangLike(String value) {
            addCriterion("JIANMIANHUIFEIJUTIQINGKUANG like", value, "jianmianhuifeijutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andJianmianhuifeijutiqingkuangNotLike(String value) {
            addCriterion("JIANMIANHUIFEIJUTIQINGKUANG not like", value, "jianmianhuifeijutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andJianmianhuifeijutiqingkuangIn(List<String> values) {
            addCriterion("JIANMIANHUIFEIJUTIQINGKUANG in", values, "jianmianhuifeijutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andJianmianhuifeijutiqingkuangNotIn(List<String> values) {
            addCriterion("JIANMIANHUIFEIJUTIQINGKUANG not in", values, "jianmianhuifeijutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andJianmianhuifeijutiqingkuangBetween(String value1, String value2) {
            addCriterion("JIANMIANHUIFEIJUTIQINGKUANG between", value1, value2, "jianmianhuifeijutiqingkuang");
            return (Criteria) this;
        }

        public Criteria andJianmianhuifeijutiqingkuangNotBetween(String value1, String value2) {
            addCriterion("JIANMIANHUIFEIJUTIQINGKUANG not between", value1, value2, "jianmianhuifeijutiqingkuang");
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

        public Criteria andWuciqingkuangIsNull() {
            addCriterion("WUCIQINGKUANG is null");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangIsNotNull() {
            addCriterion("WUCIQINGKUANG is not null");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangEqualTo(String value) {
            addCriterion("WUCIQINGKUANG =", value, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangNotEqualTo(String value) {
            addCriterion("WUCIQINGKUANG <>", value, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangGreaterThan(String value) {
            addCriterion("WUCIQINGKUANG >", value, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangGreaterThanOrEqualTo(String value) {
            addCriterion("WUCIQINGKUANG >=", value, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangLessThan(String value) {
            addCriterion("WUCIQINGKUANG <", value, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangLessThanOrEqualTo(String value) {
            addCriterion("WUCIQINGKUANG <=", value, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangLike(String value) {
            addCriterion("WUCIQINGKUANG like", value, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangNotLike(String value) {
            addCriterion("WUCIQINGKUANG not like", value, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangIn(List<String> values) {
            addCriterion("WUCIQINGKUANG in", values, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangNotIn(List<String> values) {
            addCriterion("WUCIQINGKUANG not in", values, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangBetween(String value1, String value2) {
            addCriterion("WUCIQINGKUANG between", value1, value2, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangNotBetween(String value1, String value2) {
            addCriterion("WUCIQINGKUANG not between", value1, value2, "wuciqingkuang");
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