package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StNjAdministratCostInxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StNjAdministratCostInxExample() {
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

        public Criteria andXingzhengshoufeizongeIsNull() {
            addCriterion("XINGZHENGSHOUFEIZONGE is null");
            return (Criteria) this;
        }

        public Criteria andXingzhengshoufeizongeIsNotNull() {
            addCriterion("XINGZHENGSHOUFEIZONGE is not null");
            return (Criteria) this;
        }

        public Criteria andXingzhengshoufeizongeEqualTo(BigDecimal value) {
            addCriterion("XINGZHENGSHOUFEIZONGE =", value, "xingzhengshoufeizonge");
            return (Criteria) this;
        }

        public Criteria andXingzhengshoufeizongeNotEqualTo(BigDecimal value) {
            addCriterion("XINGZHENGSHOUFEIZONGE <>", value, "xingzhengshoufeizonge");
            return (Criteria) this;
        }

        public Criteria andXingzhengshoufeizongeGreaterThan(BigDecimal value) {
            addCriterion("XINGZHENGSHOUFEIZONGE >", value, "xingzhengshoufeizonge");
            return (Criteria) this;
        }

        public Criteria andXingzhengshoufeizongeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XINGZHENGSHOUFEIZONGE >=", value, "xingzhengshoufeizonge");
            return (Criteria) this;
        }

        public Criteria andXingzhengshoufeizongeLessThan(BigDecimal value) {
            addCriterion("XINGZHENGSHOUFEIZONGE <", value, "xingzhengshoufeizonge");
            return (Criteria) this;
        }

        public Criteria andXingzhengshoufeizongeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XINGZHENGSHOUFEIZONGE <=", value, "xingzhengshoufeizonge");
            return (Criteria) this;
        }

        public Criteria andXingzhengshoufeizongeIn(List<BigDecimal> values) {
            addCriterion("XINGZHENGSHOUFEIZONGE in", values, "xingzhengshoufeizonge");
            return (Criteria) this;
        }

        public Criteria andXingzhengshoufeizongeNotIn(List<BigDecimal> values) {
            addCriterion("XINGZHENGSHOUFEIZONGE not in", values, "xingzhengshoufeizonge");
            return (Criteria) this;
        }

        public Criteria andXingzhengshoufeizongeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XINGZHENGSHOUFEIZONGE between", value1, value2, "xingzhengshoufeizonge");
            return (Criteria) this;
        }

        public Criteria andXingzhengshoufeizongeNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andShanzishejijineEqualTo(BigDecimal value) {
            addCriterion("SHANZISHEJIJINE =", value, "shanzishejijine");
            return (Criteria) this;
        }

        public Criteria andShanzishejijineNotEqualTo(BigDecimal value) {
            addCriterion("SHANZISHEJIJINE <>", value, "shanzishejijine");
            return (Criteria) this;
        }

        public Criteria andShanzishejijineGreaterThan(BigDecimal value) {
            addCriterion("SHANZISHEJIJINE >", value, "shanzishejijine");
            return (Criteria) this;
        }

        public Criteria andShanzishejijineGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHANZISHEJIJINE >=", value, "shanzishejijine");
            return (Criteria) this;
        }

        public Criteria andShanzishejijineLessThan(BigDecimal value) {
            addCriterion("SHANZISHEJIJINE <", value, "shanzishejijine");
            return (Criteria) this;
        }

        public Criteria andShanzishejijineLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHANZISHEJIJINE <=", value, "shanzishejijine");
            return (Criteria) this;
        }

        public Criteria andShanzishejijineIn(List<BigDecimal> values) {
            addCriterion("SHANZISHEJIJINE in", values, "shanzishejijine");
            return (Criteria) this;
        }

        public Criteria andShanzishejijineNotIn(List<BigDecimal> values) {
            addCriterion("SHANZISHEJIJINE not in", values, "shanzishejijine");
            return (Criteria) this;
        }

        public Criteria andShanzishejijineBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHANZISHEJIJINE between", value1, value2, "shanzishejijine");
            return (Criteria) this;
        }

        public Criteria andShanzishejijineNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andZixingjianmianshoufeiEqualTo(BigDecimal value) {
            addCriterion("ZIXINGJIANMIANSHOUFEI =", value, "zixingjianmianshoufei");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianshoufeiNotEqualTo(BigDecimal value) {
            addCriterion("ZIXINGJIANMIANSHOUFEI <>", value, "zixingjianmianshoufei");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianshoufeiGreaterThan(BigDecimal value) {
            addCriterion("ZIXINGJIANMIANSHOUFEI >", value, "zixingjianmianshoufei");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianshoufeiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZIXINGJIANMIANSHOUFEI >=", value, "zixingjianmianshoufei");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianshoufeiLessThan(BigDecimal value) {
            addCriterion("ZIXINGJIANMIANSHOUFEI <", value, "zixingjianmianshoufei");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianshoufeiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZIXINGJIANMIANSHOUFEI <=", value, "zixingjianmianshoufei");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianshoufeiIn(List<BigDecimal> values) {
            addCriterion("ZIXINGJIANMIANSHOUFEI in", values, "zixingjianmianshoufei");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianshoufeiNotIn(List<BigDecimal> values) {
            addCriterion("ZIXINGJIANMIANSHOUFEI not in", values, "zixingjianmianshoufei");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianshoufeiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZIXINGJIANMIANSHOUFEI between", value1, value2, "zixingjianmianshoufei");
            return (Criteria) this;
        }

        public Criteria andZixingjianmianshoufeiNotBetween(BigDecimal value1, BigDecimal value2) {
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