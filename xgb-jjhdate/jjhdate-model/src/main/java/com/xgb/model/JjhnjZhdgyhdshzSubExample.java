package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JjhnjZhdgyhdshzSubExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JjhnjZhdgyhdshzSubExample() {
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

        public Criteria andXiangmumingchengIsNull() {
            addCriterion("XIANGMUMINGCHENG is null");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengIsNotNull() {
            addCriterion("XIANGMUMINGCHENG is not null");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengEqualTo(String value) {
            addCriterion("XIANGMUMINGCHENG =", value, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengNotEqualTo(String value) {
            addCriterion("XIANGMUMINGCHENG <>", value, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengGreaterThan(String value) {
            addCriterion("XIANGMUMINGCHENG >", value, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengGreaterThanOrEqualTo(String value) {
            addCriterion("XIANGMUMINGCHENG >=", value, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengLessThan(String value) {
            addCriterion("XIANGMUMINGCHENG <", value, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengLessThanOrEqualTo(String value) {
            addCriterion("XIANGMUMINGCHENG <=", value, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengLike(String value) {
            addCriterion("XIANGMUMINGCHENG like", value, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengNotLike(String value) {
            addCriterion("XIANGMUMINGCHENG not like", value, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengIn(List<String> values) {
            addCriterion("XIANGMUMINGCHENG in", values, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengNotIn(List<String> values) {
            addCriterion("XIANGMUMINGCHENG not in", values, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengBetween(String value1, String value2) {
            addCriterion("XIANGMUMINGCHENG between", value1, value2, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengNotBetween(String value1, String value2) {
            addCriterion("XIANGMUMINGCHENG not between", value1, value2, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andShouruIsNull() {
            addCriterion("SHOURU is null");
            return (Criteria) this;
        }

        public Criteria andShouruIsNotNull() {
            addCriterion("SHOURU is not null");
            return (Criteria) this;
        }

        public Criteria andShouruEqualTo(BigDecimal value) {
            addCriterion("SHOURU =", value, "shouru");
            return (Criteria) this;
        }

        public Criteria andShouruNotEqualTo(BigDecimal value) {
            addCriterion("SHOURU <>", value, "shouru");
            return (Criteria) this;
        }

        public Criteria andShouruGreaterThan(BigDecimal value) {
            addCriterion("SHOURU >", value, "shouru");
            return (Criteria) this;
        }

        public Criteria andShouruGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOURU >=", value, "shouru");
            return (Criteria) this;
        }

        public Criteria andShouruLessThan(BigDecimal value) {
            addCriterion("SHOURU <", value, "shouru");
            return (Criteria) this;
        }

        public Criteria andShouruLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOURU <=", value, "shouru");
            return (Criteria) this;
        }

        public Criteria andShouruIn(List<BigDecimal> values) {
            addCriterion("SHOURU in", values, "shouru");
            return (Criteria) this;
        }

        public Criteria andShouruNotIn(List<BigDecimal> values) {
            addCriterion("SHOURU not in", values, "shouru");
            return (Criteria) this;
        }

        public Criteria andShouruBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOURU between", value1, value2, "shouru");
            return (Criteria) this;
        }

        public Criteria andShouruNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOURU not between", value1, value2, "shouru");
            return (Criteria) this;
        }

        public Criteria andZhijiekuanwuIsNull() {
            addCriterion("ZHIJIEKUANWU is null");
            return (Criteria) this;
        }

        public Criteria andZhijiekuanwuIsNotNull() {
            addCriterion("ZHIJIEKUANWU is not null");
            return (Criteria) this;
        }

        public Criteria andZhijiekuanwuEqualTo(BigDecimal value) {
            addCriterion("ZHIJIEKUANWU =", value, "zhijiekuanwu");
            return (Criteria) this;
        }

        public Criteria andZhijiekuanwuNotEqualTo(BigDecimal value) {
            addCriterion("ZHIJIEKUANWU <>", value, "zhijiekuanwu");
            return (Criteria) this;
        }

        public Criteria andZhijiekuanwuGreaterThan(BigDecimal value) {
            addCriterion("ZHIJIEKUANWU >", value, "zhijiekuanwu");
            return (Criteria) this;
        }

        public Criteria andZhijiekuanwuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHIJIEKUANWU >=", value, "zhijiekuanwu");
            return (Criteria) this;
        }

        public Criteria andZhijiekuanwuLessThan(BigDecimal value) {
            addCriterion("ZHIJIEKUANWU <", value, "zhijiekuanwu");
            return (Criteria) this;
        }

        public Criteria andZhijiekuanwuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHIJIEKUANWU <=", value, "zhijiekuanwu");
            return (Criteria) this;
        }

        public Criteria andZhijiekuanwuIn(List<BigDecimal> values) {
            addCriterion("ZHIJIEKUANWU in", values, "zhijiekuanwu");
            return (Criteria) this;
        }

        public Criteria andZhijiekuanwuNotIn(List<BigDecimal> values) {
            addCriterion("ZHIJIEKUANWU not in", values, "zhijiekuanwu");
            return (Criteria) this;
        }

        public Criteria andZhijiekuanwuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHIJIEKUANWU between", value1, value2, "zhijiekuanwu");
            return (Criteria) this;
        }

        public Criteria andZhijiekuanwuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHIJIEKUANWU not between", value1, value2, "zhijiekuanwu");
            return (Criteria) this;
        }

        public Criteria andXiangmurenyuangongziIsNull() {
            addCriterion("XIANGMURENYUANGONGZI is null");
            return (Criteria) this;
        }

        public Criteria andXiangmurenyuangongziIsNotNull() {
            addCriterion("XIANGMURENYUANGONGZI is not null");
            return (Criteria) this;
        }

        public Criteria andXiangmurenyuangongziEqualTo(BigDecimal value) {
            addCriterion("XIANGMURENYUANGONGZI =", value, "xiangmurenyuangongzi");
            return (Criteria) this;
        }

        public Criteria andXiangmurenyuangongziNotEqualTo(BigDecimal value) {
            addCriterion("XIANGMURENYUANGONGZI <>", value, "xiangmurenyuangongzi");
            return (Criteria) this;
        }

        public Criteria andXiangmurenyuangongziGreaterThan(BigDecimal value) {
            addCriterion("XIANGMURENYUANGONGZI >", value, "xiangmurenyuangongzi");
            return (Criteria) this;
        }

        public Criteria andXiangmurenyuangongziGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANGMURENYUANGONGZI >=", value, "xiangmurenyuangongzi");
            return (Criteria) this;
        }

        public Criteria andXiangmurenyuangongziLessThan(BigDecimal value) {
            addCriterion("XIANGMURENYUANGONGZI <", value, "xiangmurenyuangongzi");
            return (Criteria) this;
        }

        public Criteria andXiangmurenyuangongziLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANGMURENYUANGONGZI <=", value, "xiangmurenyuangongzi");
            return (Criteria) this;
        }

        public Criteria andXiangmurenyuangongziIn(List<BigDecimal> values) {
            addCriterion("XIANGMURENYUANGONGZI in", values, "xiangmurenyuangongzi");
            return (Criteria) this;
        }

        public Criteria andXiangmurenyuangongziNotIn(List<BigDecimal> values) {
            addCriterion("XIANGMURENYUANGONGZI not in", values, "xiangmurenyuangongzi");
            return (Criteria) this;
        }

        public Criteria andXiangmurenyuangongziBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANGMURENYUANGONGZI between", value1, value2, "xiangmurenyuangongzi");
            return (Criteria) this;
        }

        public Criteria andXiangmurenyuangongziNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANGMURENYUANGONGZI not between", value1, value2, "xiangmurenyuangongzi");
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

        public Criteria andZichanshiyongfeiyongIsNull() {
            addCriterion("ZICHANSHIYONGFEIYONG is null");
            return (Criteria) this;
        }

        public Criteria andZichanshiyongfeiyongIsNotNull() {
            addCriterion("ZICHANSHIYONGFEIYONG is not null");
            return (Criteria) this;
        }

        public Criteria andZichanshiyongfeiyongEqualTo(BigDecimal value) {
            addCriterion("ZICHANSHIYONGFEIYONG =", value, "zichanshiyongfeiyong");
            return (Criteria) this;
        }

        public Criteria andZichanshiyongfeiyongNotEqualTo(BigDecimal value) {
            addCriterion("ZICHANSHIYONGFEIYONG <>", value, "zichanshiyongfeiyong");
            return (Criteria) this;
        }

        public Criteria andZichanshiyongfeiyongGreaterThan(BigDecimal value) {
            addCriterion("ZICHANSHIYONGFEIYONG >", value, "zichanshiyongfeiyong");
            return (Criteria) this;
        }

        public Criteria andZichanshiyongfeiyongGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZICHANSHIYONGFEIYONG >=", value, "zichanshiyongfeiyong");
            return (Criteria) this;
        }

        public Criteria andZichanshiyongfeiyongLessThan(BigDecimal value) {
            addCriterion("ZICHANSHIYONGFEIYONG <", value, "zichanshiyongfeiyong");
            return (Criteria) this;
        }

        public Criteria andZichanshiyongfeiyongLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZICHANSHIYONGFEIYONG <=", value, "zichanshiyongfeiyong");
            return (Criteria) this;
        }

        public Criteria andZichanshiyongfeiyongIn(List<BigDecimal> values) {
            addCriterion("ZICHANSHIYONGFEIYONG in", values, "zichanshiyongfeiyong");
            return (Criteria) this;
        }

        public Criteria andZichanshiyongfeiyongNotIn(List<BigDecimal> values) {
            addCriterion("ZICHANSHIYONGFEIYONG not in", values, "zichanshiyongfeiyong");
            return (Criteria) this;
        }

        public Criteria andZichanshiyongfeiyongBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZICHANSHIYONGFEIYONG between", value1, value2, "zichanshiyongfeiyong");
            return (Criteria) this;
        }

        public Criteria andZichanshiyongfeiyongNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZICHANSHIYONGFEIYONG not between", value1, value2, "zichanshiyongfeiyong");
            return (Criteria) this;
        }

        public Criteria andXuanchuanfeiyongIsNull() {
            addCriterion("XUANCHUANFEIYONG is null");
            return (Criteria) this;
        }

        public Criteria andXuanchuanfeiyongIsNotNull() {
            addCriterion("XUANCHUANFEIYONG is not null");
            return (Criteria) this;
        }

        public Criteria andXuanchuanfeiyongEqualTo(BigDecimal value) {
            addCriterion("XUANCHUANFEIYONG =", value, "xuanchuanfeiyong");
            return (Criteria) this;
        }

        public Criteria andXuanchuanfeiyongNotEqualTo(BigDecimal value) {
            addCriterion("XUANCHUANFEIYONG <>", value, "xuanchuanfeiyong");
            return (Criteria) this;
        }

        public Criteria andXuanchuanfeiyongGreaterThan(BigDecimal value) {
            addCriterion("XUANCHUANFEIYONG >", value, "xuanchuanfeiyong");
            return (Criteria) this;
        }

        public Criteria andXuanchuanfeiyongGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XUANCHUANFEIYONG >=", value, "xuanchuanfeiyong");
            return (Criteria) this;
        }

        public Criteria andXuanchuanfeiyongLessThan(BigDecimal value) {
            addCriterion("XUANCHUANFEIYONG <", value, "xuanchuanfeiyong");
            return (Criteria) this;
        }

        public Criteria andXuanchuanfeiyongLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XUANCHUANFEIYONG <=", value, "xuanchuanfeiyong");
            return (Criteria) this;
        }

        public Criteria andXuanchuanfeiyongIn(List<BigDecimal> values) {
            addCriterion("XUANCHUANFEIYONG in", values, "xuanchuanfeiyong");
            return (Criteria) this;
        }

        public Criteria andXuanchuanfeiyongNotIn(List<BigDecimal> values) {
            addCriterion("XUANCHUANFEIYONG not in", values, "xuanchuanfeiyong");
            return (Criteria) this;
        }

        public Criteria andXuanchuanfeiyongBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XUANCHUANFEIYONG between", value1, value2, "xuanchuanfeiyong");
            return (Criteria) this;
        }

        public Criteria andXuanchuanfeiyongNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XUANCHUANFEIYONG not between", value1, value2, "xuanchuanfeiyong");
            return (Criteria) this;
        }

        public Criteria andChalvfeiIsNull() {
            addCriterion("CHALVFEI is null");
            return (Criteria) this;
        }

        public Criteria andChalvfeiIsNotNull() {
            addCriterion("CHALVFEI is not null");
            return (Criteria) this;
        }

        public Criteria andChalvfeiEqualTo(BigDecimal value) {
            addCriterion("CHALVFEI =", value, "chalvfei");
            return (Criteria) this;
        }

        public Criteria andChalvfeiNotEqualTo(BigDecimal value) {
            addCriterion("CHALVFEI <>", value, "chalvfei");
            return (Criteria) this;
        }

        public Criteria andChalvfeiGreaterThan(BigDecimal value) {
            addCriterion("CHALVFEI >", value, "chalvfei");
            return (Criteria) this;
        }

        public Criteria andChalvfeiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHALVFEI >=", value, "chalvfei");
            return (Criteria) this;
        }

        public Criteria andChalvfeiLessThan(BigDecimal value) {
            addCriterion("CHALVFEI <", value, "chalvfei");
            return (Criteria) this;
        }

        public Criteria andChalvfeiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHALVFEI <=", value, "chalvfei");
            return (Criteria) this;
        }

        public Criteria andChalvfeiIn(List<BigDecimal> values) {
            addCriterion("CHALVFEI in", values, "chalvfei");
            return (Criteria) this;
        }

        public Criteria andChalvfeiNotIn(List<BigDecimal> values) {
            addCriterion("CHALVFEI not in", values, "chalvfei");
            return (Criteria) this;
        }

        public Criteria andChalvfeiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHALVFEI between", value1, value2, "chalvfei");
            return (Criteria) this;
        }

        public Criteria andChalvfeiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHALVFEI not between", value1, value2, "chalvfei");
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

        public Criteria andXiaojiIsNull() {
            addCriterion("XIAOJI is null");
            return (Criteria) this;
        }

        public Criteria andXiaojiIsNotNull() {
            addCriterion("XIAOJI is not null");
            return (Criteria) this;
        }

        public Criteria andXiaojiEqualTo(BigDecimal value) {
            addCriterion("XIAOJI =", value, "xiaoji");
            return (Criteria) this;
        }

        public Criteria andXiaojiNotEqualTo(BigDecimal value) {
            addCriterion("XIAOJI <>", value, "xiaoji");
            return (Criteria) this;
        }

        public Criteria andXiaojiGreaterThan(BigDecimal value) {
            addCriterion("XIAOJI >", value, "xiaoji");
            return (Criteria) this;
        }

        public Criteria andXiaojiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XIAOJI >=", value, "xiaoji");
            return (Criteria) this;
        }

        public Criteria andXiaojiLessThan(BigDecimal value) {
            addCriterion("XIAOJI <", value, "xiaoji");
            return (Criteria) this;
        }

        public Criteria andXiaojiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XIAOJI <=", value, "xiaoji");
            return (Criteria) this;
        }

        public Criteria andXiaojiIn(List<BigDecimal> values) {
            addCriterion("XIAOJI in", values, "xiaoji");
            return (Criteria) this;
        }

        public Criteria andXiaojiNotIn(List<BigDecimal> values) {
            addCriterion("XIAOJI not in", values, "xiaoji");
            return (Criteria) this;
        }

        public Criteria andXiaojiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIAOJI between", value1, value2, "xiaoji");
            return (Criteria) this;
        }

        public Criteria andXiaojiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIAOJI not between", value1, value2, "xiaoji");
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