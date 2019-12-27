package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JjhnjGyhdmxSubExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JjhnjGyhdmxSubExample() {
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

        public Criteria andXuhaoIsNull() {
            addCriterion("XUHAO is null");
            return (Criteria) this;
        }

        public Criteria andXuhaoIsNotNull() {
            addCriterion("XUHAO is not null");
            return (Criteria) this;
        }

        public Criteria andXuhaoEqualTo(String value) {
            addCriterion("XUHAO =", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoNotEqualTo(String value) {
            addCriterion("XUHAO <>", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoGreaterThan(String value) {
            addCriterion("XUHAO >", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoGreaterThanOrEqualTo(String value) {
            addCriterion("XUHAO >=", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoLessThan(String value) {
            addCriterion("XUHAO <", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoLessThanOrEqualTo(String value) {
            addCriterion("XUHAO <=", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoLike(String value) {
            addCriterion("XUHAO like", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoNotLike(String value) {
            addCriterion("XUHAO not like", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoIn(List<String> values) {
            addCriterion("XUHAO in", values, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoNotIn(List<String> values) {
            addCriterion("XUHAO not in", values, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoBetween(String value1, String value2) {
            addCriterion("XUHAO between", value1, value2, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoNotBetween(String value1, String value2) {
            addCriterion("XUHAO not between", value1, value2, "xuhao");
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

        public Criteria andZhichuIsNull() {
            addCriterion("ZHICHU is null");
            return (Criteria) this;
        }

        public Criteria andZhichuIsNotNull() {
            addCriterion("ZHICHU is not null");
            return (Criteria) this;
        }

        public Criteria andZhichuEqualTo(BigDecimal value) {
            addCriterion("ZHICHU =", value, "zhichu");
            return (Criteria) this;
        }

        public Criteria andZhichuNotEqualTo(BigDecimal value) {
            addCriterion("ZHICHU <>", value, "zhichu");
            return (Criteria) this;
        }

        public Criteria andZhichuGreaterThan(BigDecimal value) {
            addCriterion("ZHICHU >", value, "zhichu");
            return (Criteria) this;
        }

        public Criteria andZhichuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHICHU >=", value, "zhichu");
            return (Criteria) this;
        }

        public Criteria andZhichuLessThan(BigDecimal value) {
            addCriterion("ZHICHU <", value, "zhichu");
            return (Criteria) this;
        }

        public Criteria andZhichuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHICHU <=", value, "zhichu");
            return (Criteria) this;
        }

        public Criteria andZhichuIn(List<BigDecimal> values) {
            addCriterion("ZHICHU in", values, "zhichu");
            return (Criteria) this;
        }

        public Criteria andZhichuNotIn(List<BigDecimal> values) {
            addCriterion("ZHICHU not in", values, "zhichu");
            return (Criteria) this;
        }

        public Criteria andZhichuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHICHU between", value1, value2, "zhichu");
            return (Criteria) this;
        }

        public Criteria andZhichuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHICHU not between", value1, value2, "zhichu");
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

        public Criteria andZiEqualTo(String value) {
            addCriterion("ZI =", value, "zi");
            return (Criteria) this;
        }

        public Criteria andZiNotEqualTo(String value) {
            addCriterion("ZI <>", value, "zi");
            return (Criteria) this;
        }

        public Criteria andZiGreaterThan(String value) {
            addCriterion("ZI >", value, "zi");
            return (Criteria) this;
        }

        public Criteria andZiGreaterThanOrEqualTo(String value) {
            addCriterion("ZI >=", value, "zi");
            return (Criteria) this;
        }

        public Criteria andZiLessThan(String value) {
            addCriterion("ZI <", value, "zi");
            return (Criteria) this;
        }

        public Criteria andZiLessThanOrEqualTo(String value) {
            addCriterion("ZI <=", value, "zi");
            return (Criteria) this;
        }

        public Criteria andZiLike(String value) {
            addCriterion("ZI like", value, "zi");
            return (Criteria) this;
        }

        public Criteria andZiNotLike(String value) {
            addCriterion("ZI not like", value, "zi");
            return (Criteria) this;
        }

        public Criteria andZiIn(List<String> values) {
            addCriterion("ZI in", values, "zi");
            return (Criteria) this;
        }

        public Criteria andZiNotIn(List<String> values) {
            addCriterion("ZI not in", values, "zi");
            return (Criteria) this;
        }

        public Criteria andZiBetween(String value1, String value2) {
            addCriterion("ZI between", value1, value2, "zi");
            return (Criteria) this;
        }

        public Criteria andZiNotBetween(String value1, String value2) {
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

        public Criteria andZhiEqualTo(String value) {
            addCriterion("ZHI =", value, "zhi");
            return (Criteria) this;
        }

        public Criteria andZhiNotEqualTo(String value) {
            addCriterion("ZHI <>", value, "zhi");
            return (Criteria) this;
        }

        public Criteria andZhiGreaterThan(String value) {
            addCriterion("ZHI >", value, "zhi");
            return (Criteria) this;
        }

        public Criteria andZhiGreaterThanOrEqualTo(String value) {
            addCriterion("ZHI >=", value, "zhi");
            return (Criteria) this;
        }

        public Criteria andZhiLessThan(String value) {
            addCriterion("ZHI <", value, "zhi");
            return (Criteria) this;
        }

        public Criteria andZhiLessThanOrEqualTo(String value) {
            addCriterion("ZHI <=", value, "zhi");
            return (Criteria) this;
        }

        public Criteria andZhiLike(String value) {
            addCriterion("ZHI like", value, "zhi");
            return (Criteria) this;
        }

        public Criteria andZhiNotLike(String value) {
            addCriterion("ZHI not like", value, "zhi");
            return (Criteria) this;
        }

        public Criteria andZhiIn(List<String> values) {
            addCriterion("ZHI in", values, "zhi");
            return (Criteria) this;
        }

        public Criteria andZhiNotIn(List<String> values) {
            addCriterion("ZHI not in", values, "zhi");
            return (Criteria) this;
        }

        public Criteria andZhiBetween(String value1, String value2) {
            addCriterion("ZHI between", value1, value2, "zhi");
            return (Criteria) this;
        }

        public Criteria andZhiNotBetween(String value1, String value2) {
            addCriterion("ZHI not between", value1, value2, "zhi");
            return (Criteria) this;
        }

        public Criteria andJianshuIsNull() {
            addCriterion("JIANSHU is null");
            return (Criteria) this;
        }

        public Criteria andJianshuIsNotNull() {
            addCriterion("JIANSHU is not null");
            return (Criteria) this;
        }

        public Criteria andJianshuEqualTo(String value) {
            addCriterion("JIANSHU =", value, "jianshu");
            return (Criteria) this;
        }

        public Criteria andJianshuNotEqualTo(String value) {
            addCriterion("JIANSHU <>", value, "jianshu");
            return (Criteria) this;
        }

        public Criteria andJianshuGreaterThan(String value) {
            addCriterion("JIANSHU >", value, "jianshu");
            return (Criteria) this;
        }

        public Criteria andJianshuGreaterThanOrEqualTo(String value) {
            addCriterion("JIANSHU >=", value, "jianshu");
            return (Criteria) this;
        }

        public Criteria andJianshuLessThan(String value) {
            addCriterion("JIANSHU <", value, "jianshu");
            return (Criteria) this;
        }

        public Criteria andJianshuLessThanOrEqualTo(String value) {
            addCriterion("JIANSHU <=", value, "jianshu");
            return (Criteria) this;
        }

        public Criteria andJianshuLike(String value) {
            addCriterion("JIANSHU like", value, "jianshu");
            return (Criteria) this;
        }

        public Criteria andJianshuNotLike(String value) {
            addCriterion("JIANSHU not like", value, "jianshu");
            return (Criteria) this;
        }

        public Criteria andJianshuIn(List<String> values) {
            addCriterion("JIANSHU in", values, "jianshu");
            return (Criteria) this;
        }

        public Criteria andJianshuNotIn(List<String> values) {
            addCriterion("JIANSHU not in", values, "jianshu");
            return (Criteria) this;
        }

        public Criteria andJianshuBetween(String value1, String value2) {
            addCriterion("JIANSHU between", value1, value2, "jianshu");
            return (Criteria) this;
        }

        public Criteria andJianshuNotBetween(String value1, String value2) {
            addCriterion("JIANSHU not between", value1, value2, "jianshu");
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