package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
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

        public Criteria andMsIsNull() {
            addCriterion("MS is null");
            return (Criteria) this;
        }

        public Criteria andMsIsNotNull() {
            addCriterion("MS is not null");
            return (Criteria) this;
        }

        public Criteria andMsEqualTo(String value) {
            addCriterion("MS =", value, "ms");
            return (Criteria) this;
        }

        public Criteria andMsNotEqualTo(String value) {
            addCriterion("MS <>", value, "ms");
            return (Criteria) this;
        }

        public Criteria andMsGreaterThan(String value) {
            addCriterion("MS >", value, "ms");
            return (Criteria) this;
        }

        public Criteria andMsGreaterThanOrEqualTo(String value) {
            addCriterion("MS >=", value, "ms");
            return (Criteria) this;
        }

        public Criteria andMsLessThan(String value) {
            addCriterion("MS <", value, "ms");
            return (Criteria) this;
        }

        public Criteria andMsLessThanOrEqualTo(String value) {
            addCriterion("MS <=", value, "ms");
            return (Criteria) this;
        }

        public Criteria andMsLike(String value) {
            addCriterion("MS like", value, "ms");
            return (Criteria) this;
        }

        public Criteria andMsNotLike(String value) {
            addCriterion("MS not like", value, "ms");
            return (Criteria) this;
        }

        public Criteria andMsIn(List<String> values) {
            addCriterion("MS in", values, "ms");
            return (Criteria) this;
        }

        public Criteria andMsNotIn(List<String> values) {
            addCriterion("MS not in", values, "ms");
            return (Criteria) this;
        }

        public Criteria andMsBetween(String value1, String value2) {
            addCriterion("MS between", value1, value2, "ms");
            return (Criteria) this;
        }

        public Criteria andMsNotBetween(String value1, String value2) {
            addCriterion("MS not between", value1, value2, "ms");
            return (Criteria) this;
        }

        public Criteria andR1IsNull() {
            addCriterion("R1 is null");
            return (Criteria) this;
        }

        public Criteria andR1IsNotNull() {
            addCriterion("R1 is not null");
            return (Criteria) this;
        }

        public Criteria andR1EqualTo(String value) {
            addCriterion("R1 =", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1NotEqualTo(String value) {
            addCriterion("R1 <>", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1GreaterThan(String value) {
            addCriterion("R1 >", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1GreaterThanOrEqualTo(String value) {
            addCriterion("R1 >=", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1LessThan(String value) {
            addCriterion("R1 <", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1LessThanOrEqualTo(String value) {
            addCriterion("R1 <=", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1Like(String value) {
            addCriterion("R1 like", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1NotLike(String value) {
            addCriterion("R1 not like", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1In(List<String> values) {
            addCriterion("R1 in", values, "r1");
            return (Criteria) this;
        }

        public Criteria andR1NotIn(List<String> values) {
            addCriterion("R1 not in", values, "r1");
            return (Criteria) this;
        }

        public Criteria andR1Between(String value1, String value2) {
            addCriterion("R1 between", value1, value2, "r1");
            return (Criteria) this;
        }

        public Criteria andR1NotBetween(String value1, String value2) {
            addCriterion("R1 not between", value1, value2, "r1");
            return (Criteria) this;
        }

        public Criteria andR2IsNull() {
            addCriterion("R2 is null");
            return (Criteria) this;
        }

        public Criteria andR2IsNotNull() {
            addCriterion("R2 is not null");
            return (Criteria) this;
        }

        public Criteria andR2EqualTo(String value) {
            addCriterion("R2 =", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2NotEqualTo(String value) {
            addCriterion("R2 <>", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2GreaterThan(String value) {
            addCriterion("R2 >", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2GreaterThanOrEqualTo(String value) {
            addCriterion("R2 >=", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2LessThan(String value) {
            addCriterion("R2 <", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2LessThanOrEqualTo(String value) {
            addCriterion("R2 <=", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2Like(String value) {
            addCriterion("R2 like", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2NotLike(String value) {
            addCriterion("R2 not like", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2In(List<String> values) {
            addCriterion("R2 in", values, "r2");
            return (Criteria) this;
        }

        public Criteria andR2NotIn(List<String> values) {
            addCriterion("R2 not in", values, "r2");
            return (Criteria) this;
        }

        public Criteria andR2Between(String value1, String value2) {
            addCriterion("R2 between", value1, value2, "r2");
            return (Criteria) this;
        }

        public Criteria andR2NotBetween(String value1, String value2) {
            addCriterion("R2 not between", value1, value2, "r2");
            return (Criteria) this;
        }

        public Criteria andR3IsNull() {
            addCriterion("R3 is null");
            return (Criteria) this;
        }

        public Criteria andR3IsNotNull() {
            addCriterion("R3 is not null");
            return (Criteria) this;
        }

        public Criteria andR3EqualTo(String value) {
            addCriterion("R3 =", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3NotEqualTo(String value) {
            addCriterion("R3 <>", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3GreaterThan(String value) {
            addCriterion("R3 >", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3GreaterThanOrEqualTo(String value) {
            addCriterion("R3 >=", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3LessThan(String value) {
            addCriterion("R3 <", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3LessThanOrEqualTo(String value) {
            addCriterion("R3 <=", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3Like(String value) {
            addCriterion("R3 like", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3NotLike(String value) {
            addCriterion("R3 not like", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3In(List<String> values) {
            addCriterion("R3 in", values, "r3");
            return (Criteria) this;
        }

        public Criteria andR3NotIn(List<String> values) {
            addCriterion("R3 not in", values, "r3");
            return (Criteria) this;
        }

        public Criteria andR3Between(String value1, String value2) {
            addCriterion("R3 between", value1, value2, "r3");
            return (Criteria) this;
        }

        public Criteria andR3NotBetween(String value1, String value2) {
            addCriterion("R3 not between", value1, value2, "r3");
            return (Criteria) this;
        }

        public Criteria andR4IsNull() {
            addCriterion("R4 is null");
            return (Criteria) this;
        }

        public Criteria andR4IsNotNull() {
            addCriterion("R4 is not null");
            return (Criteria) this;
        }

        public Criteria andR4EqualTo(String value) {
            addCriterion("R4 =", value, "r4");
            return (Criteria) this;
        }

        public Criteria andR4NotEqualTo(String value) {
            addCriterion("R4 <>", value, "r4");
            return (Criteria) this;
        }

        public Criteria andR4GreaterThan(String value) {
            addCriterion("R4 >", value, "r4");
            return (Criteria) this;
        }

        public Criteria andR4GreaterThanOrEqualTo(String value) {
            addCriterion("R4 >=", value, "r4");
            return (Criteria) this;
        }

        public Criteria andR4LessThan(String value) {
            addCriterion("R4 <", value, "r4");
            return (Criteria) this;
        }

        public Criteria andR4LessThanOrEqualTo(String value) {
            addCriterion("R4 <=", value, "r4");
            return (Criteria) this;
        }

        public Criteria andR4Like(String value) {
            addCriterion("R4 like", value, "r4");
            return (Criteria) this;
        }

        public Criteria andR4NotLike(String value) {
            addCriterion("R4 not like", value, "r4");
            return (Criteria) this;
        }

        public Criteria andR4In(List<String> values) {
            addCriterion("R4 in", values, "r4");
            return (Criteria) this;
        }

        public Criteria andR4NotIn(List<String> values) {
            addCriterion("R4 not in", values, "r4");
            return (Criteria) this;
        }

        public Criteria andR4Between(String value1, String value2) {
            addCriterion("R4 between", value1, value2, "r4");
            return (Criteria) this;
        }

        public Criteria andR4NotBetween(String value1, String value2) {
            addCriterion("R4 not between", value1, value2, "r4");
            return (Criteria) this;
        }

        public Criteria andR5IsNull() {
            addCriterion("R5 is null");
            return (Criteria) this;
        }

        public Criteria andR5IsNotNull() {
            addCriterion("R5 is not null");
            return (Criteria) this;
        }

        public Criteria andR5EqualTo(String value) {
            addCriterion("R5 =", value, "r5");
            return (Criteria) this;
        }

        public Criteria andR5NotEqualTo(String value) {
            addCriterion("R5 <>", value, "r5");
            return (Criteria) this;
        }

        public Criteria andR5GreaterThan(String value) {
            addCriterion("R5 >", value, "r5");
            return (Criteria) this;
        }

        public Criteria andR5GreaterThanOrEqualTo(String value) {
            addCriterion("R5 >=", value, "r5");
            return (Criteria) this;
        }

        public Criteria andR5LessThan(String value) {
            addCriterion("R5 <", value, "r5");
            return (Criteria) this;
        }

        public Criteria andR5LessThanOrEqualTo(String value) {
            addCriterion("R5 <=", value, "r5");
            return (Criteria) this;
        }

        public Criteria andR5Like(String value) {
            addCriterion("R5 like", value, "r5");
            return (Criteria) this;
        }

        public Criteria andR5NotLike(String value) {
            addCriterion("R5 not like", value, "r5");
            return (Criteria) this;
        }

        public Criteria andR5In(List<String> values) {
            addCriterion("R5 in", values, "r5");
            return (Criteria) this;
        }

        public Criteria andR5NotIn(List<String> values) {
            addCriterion("R5 not in", values, "r5");
            return (Criteria) this;
        }

        public Criteria andR5Between(String value1, String value2) {
            addCriterion("R5 between", value1, value2, "r5");
            return (Criteria) this;
        }

        public Criteria andR5NotBetween(String value1, String value2) {
            addCriterion("R5 not between", value1, value2, "r5");
            return (Criteria) this;
        }

        public Criteria andR6IsNull() {
            addCriterion("R6 is null");
            return (Criteria) this;
        }

        public Criteria andR6IsNotNull() {
            addCriterion("R6 is not null");
            return (Criteria) this;
        }

        public Criteria andR6EqualTo(String value) {
            addCriterion("R6 =", value, "r6");
            return (Criteria) this;
        }

        public Criteria andR6NotEqualTo(String value) {
            addCriterion("R6 <>", value, "r6");
            return (Criteria) this;
        }

        public Criteria andR6GreaterThan(String value) {
            addCriterion("R6 >", value, "r6");
            return (Criteria) this;
        }

        public Criteria andR6GreaterThanOrEqualTo(String value) {
            addCriterion("R6 >=", value, "r6");
            return (Criteria) this;
        }

        public Criteria andR6LessThan(String value) {
            addCriterion("R6 <", value, "r6");
            return (Criteria) this;
        }

        public Criteria andR6LessThanOrEqualTo(String value) {
            addCriterion("R6 <=", value, "r6");
            return (Criteria) this;
        }

        public Criteria andR6Like(String value) {
            addCriterion("R6 like", value, "r6");
            return (Criteria) this;
        }

        public Criteria andR6NotLike(String value) {
            addCriterion("R6 not like", value, "r6");
            return (Criteria) this;
        }

        public Criteria andR6In(List<String> values) {
            addCriterion("R6 in", values, "r6");
            return (Criteria) this;
        }

        public Criteria andR6NotIn(List<String> values) {
            addCriterion("R6 not in", values, "r6");
            return (Criteria) this;
        }

        public Criteria andR6Between(String value1, String value2) {
            addCriterion("R6 between", value1, value2, "r6");
            return (Criteria) this;
        }

        public Criteria andR6NotBetween(String value1, String value2) {
            addCriterion("R6 not between", value1, value2, "r6");
            return (Criteria) this;
        }

        public Criteria andR7IsNull() {
            addCriterion("R7 is null");
            return (Criteria) this;
        }

        public Criteria andR7IsNotNull() {
            addCriterion("R7 is not null");
            return (Criteria) this;
        }

        public Criteria andR7EqualTo(String value) {
            addCriterion("R7 =", value, "r7");
            return (Criteria) this;
        }

        public Criteria andR7NotEqualTo(String value) {
            addCriterion("R7 <>", value, "r7");
            return (Criteria) this;
        }

        public Criteria andR7GreaterThan(String value) {
            addCriterion("R7 >", value, "r7");
            return (Criteria) this;
        }

        public Criteria andR7GreaterThanOrEqualTo(String value) {
            addCriterion("R7 >=", value, "r7");
            return (Criteria) this;
        }

        public Criteria andR7LessThan(String value) {
            addCriterion("R7 <", value, "r7");
            return (Criteria) this;
        }

        public Criteria andR7LessThanOrEqualTo(String value) {
            addCriterion("R7 <=", value, "r7");
            return (Criteria) this;
        }

        public Criteria andR7Like(String value) {
            addCriterion("R7 like", value, "r7");
            return (Criteria) this;
        }

        public Criteria andR7NotLike(String value) {
            addCriterion("R7 not like", value, "r7");
            return (Criteria) this;
        }

        public Criteria andR7In(List<String> values) {
            addCriterion("R7 in", values, "r7");
            return (Criteria) this;
        }

        public Criteria andR7NotIn(List<String> values) {
            addCriterion("R7 not in", values, "r7");
            return (Criteria) this;
        }

        public Criteria andR7Between(String value1, String value2) {
            addCriterion("R7 between", value1, value2, "r7");
            return (Criteria) this;
        }

        public Criteria andR7NotBetween(String value1, String value2) {
            addCriterion("R7 not between", value1, value2, "r7");
            return (Criteria) this;
        }

        public Criteria andR8IsNull() {
            addCriterion("R8 is null");
            return (Criteria) this;
        }

        public Criteria andR8IsNotNull() {
            addCriterion("R8 is not null");
            return (Criteria) this;
        }

        public Criteria andR8EqualTo(String value) {
            addCriterion("R8 =", value, "r8");
            return (Criteria) this;
        }

        public Criteria andR8NotEqualTo(String value) {
            addCriterion("R8 <>", value, "r8");
            return (Criteria) this;
        }

        public Criteria andR8GreaterThan(String value) {
            addCriterion("R8 >", value, "r8");
            return (Criteria) this;
        }

        public Criteria andR8GreaterThanOrEqualTo(String value) {
            addCriterion("R8 >=", value, "r8");
            return (Criteria) this;
        }

        public Criteria andR8LessThan(String value) {
            addCriterion("R8 <", value, "r8");
            return (Criteria) this;
        }

        public Criteria andR8LessThanOrEqualTo(String value) {
            addCriterion("R8 <=", value, "r8");
            return (Criteria) this;
        }

        public Criteria andR8Like(String value) {
            addCriterion("R8 like", value, "r8");
            return (Criteria) this;
        }

        public Criteria andR8NotLike(String value) {
            addCriterion("R8 not like", value, "r8");
            return (Criteria) this;
        }

        public Criteria andR8In(List<String> values) {
            addCriterion("R8 in", values, "r8");
            return (Criteria) this;
        }

        public Criteria andR8NotIn(List<String> values) {
            addCriterion("R8 not in", values, "r8");
            return (Criteria) this;
        }

        public Criteria andR8Between(String value1, String value2) {
            addCriterion("R8 between", value1, value2, "r8");
            return (Criteria) this;
        }

        public Criteria andR8NotBetween(String value1, String value2) {
            addCriterion("R8 not between", value1, value2, "r8");
            return (Criteria) this;
        }

        public Criteria andR9IsNull() {
            addCriterion("R9 is null");
            return (Criteria) this;
        }

        public Criteria andR9IsNotNull() {
            addCriterion("R9 is not null");
            return (Criteria) this;
        }

        public Criteria andR9EqualTo(String value) {
            addCriterion("R9 =", value, "r9");
            return (Criteria) this;
        }

        public Criteria andR9NotEqualTo(String value) {
            addCriterion("R9 <>", value, "r9");
            return (Criteria) this;
        }

        public Criteria andR9GreaterThan(String value) {
            addCriterion("R9 >", value, "r9");
            return (Criteria) this;
        }

        public Criteria andR9GreaterThanOrEqualTo(String value) {
            addCriterion("R9 >=", value, "r9");
            return (Criteria) this;
        }

        public Criteria andR9LessThan(String value) {
            addCriterion("R9 <", value, "r9");
            return (Criteria) this;
        }

        public Criteria andR9LessThanOrEqualTo(String value) {
            addCriterion("R9 <=", value, "r9");
            return (Criteria) this;
        }

        public Criteria andR9Like(String value) {
            addCriterion("R9 like", value, "r9");
            return (Criteria) this;
        }

        public Criteria andR9NotLike(String value) {
            addCriterion("R9 not like", value, "r9");
            return (Criteria) this;
        }

        public Criteria andR9In(List<String> values) {
            addCriterion("R9 in", values, "r9");
            return (Criteria) this;
        }

        public Criteria andR9NotIn(List<String> values) {
            addCriterion("R9 not in", values, "r9");
            return (Criteria) this;
        }

        public Criteria andR9Between(String value1, String value2) {
            addCriterion("R9 between", value1, value2, "r9");
            return (Criteria) this;
        }

        public Criteria andR9NotBetween(String value1, String value2) {
            addCriterion("R9 not between", value1, value2, "r9");
            return (Criteria) this;
        }

        public Criteria andFwlyIsNull() {
            addCriterion("FWLY is null");
            return (Criteria) this;
        }

        public Criteria andFwlyIsNotNull() {
            addCriterion("FWLY is not null");
            return (Criteria) this;
        }

        public Criteria andFwlyEqualTo(String value) {
            addCriterion("FWLY =", value, "fwly");
            return (Criteria) this;
        }

        public Criteria andFwlyNotEqualTo(String value) {
            addCriterion("FWLY <>", value, "fwly");
            return (Criteria) this;
        }

        public Criteria andFwlyGreaterThan(String value) {
            addCriterion("FWLY >", value, "fwly");
            return (Criteria) this;
        }

        public Criteria andFwlyGreaterThanOrEqualTo(String value) {
            addCriterion("FWLY >=", value, "fwly");
            return (Criteria) this;
        }

        public Criteria andFwlyLessThan(String value) {
            addCriterion("FWLY <", value, "fwly");
            return (Criteria) this;
        }

        public Criteria andFwlyLessThanOrEqualTo(String value) {
            addCriterion("FWLY <=", value, "fwly");
            return (Criteria) this;
        }

        public Criteria andFwlyLike(String value) {
            addCriterion("FWLY like", value, "fwly");
            return (Criteria) this;
        }

        public Criteria andFwlyNotLike(String value) {
            addCriterion("FWLY not like", value, "fwly");
            return (Criteria) this;
        }

        public Criteria andFwlyIn(List<String> values) {
            addCriterion("FWLY in", values, "fwly");
            return (Criteria) this;
        }

        public Criteria andFwlyNotIn(List<String> values) {
            addCriterion("FWLY not in", values, "fwly");
            return (Criteria) this;
        }

        public Criteria andFwlyBetween(String value1, String value2) {
            addCriterion("FWLY between", value1, value2, "fwly");
            return (Criteria) this;
        }

        public Criteria andFwlyNotBetween(String value1, String value2) {
            addCriterion("FWLY not between", value1, value2, "fwly");
            return (Criteria) this;
        }

        public Criteria andS1IsNull() {
            addCriterion("S1 is null");
            return (Criteria) this;
        }

        public Criteria andS1IsNotNull() {
            addCriterion("S1 is not null");
            return (Criteria) this;
        }

        public Criteria andS1EqualTo(String value) {
            addCriterion("S1 =", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1NotEqualTo(String value) {
            addCriterion("S1 <>", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1GreaterThan(String value) {
            addCriterion("S1 >", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1GreaterThanOrEqualTo(String value) {
            addCriterion("S1 >=", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1LessThan(String value) {
            addCriterion("S1 <", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1LessThanOrEqualTo(String value) {
            addCriterion("S1 <=", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1Like(String value) {
            addCriterion("S1 like", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1NotLike(String value) {
            addCriterion("S1 not like", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1In(List<String> values) {
            addCriterion("S1 in", values, "s1");
            return (Criteria) this;
        }

        public Criteria andS1NotIn(List<String> values) {
            addCriterion("S1 not in", values, "s1");
            return (Criteria) this;
        }

        public Criteria andS1Between(String value1, String value2) {
            addCriterion("S1 between", value1, value2, "s1");
            return (Criteria) this;
        }

        public Criteria andS1NotBetween(String value1, String value2) {
            addCriterion("S1 not between", value1, value2, "s1");
            return (Criteria) this;
        }

        public Criteria andS2IsNull() {
            addCriterion("S2 is null");
            return (Criteria) this;
        }

        public Criteria andS2IsNotNull() {
            addCriterion("S2 is not null");
            return (Criteria) this;
        }

        public Criteria andS2EqualTo(String value) {
            addCriterion("S2 =", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2NotEqualTo(String value) {
            addCriterion("S2 <>", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2GreaterThan(String value) {
            addCriterion("S2 >", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2GreaterThanOrEqualTo(String value) {
            addCriterion("S2 >=", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2LessThan(String value) {
            addCriterion("S2 <", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2LessThanOrEqualTo(String value) {
            addCriterion("S2 <=", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2Like(String value) {
            addCriterion("S2 like", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2NotLike(String value) {
            addCriterion("S2 not like", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2In(List<String> values) {
            addCriterion("S2 in", values, "s2");
            return (Criteria) this;
        }

        public Criteria andS2NotIn(List<String> values) {
            addCriterion("S2 not in", values, "s2");
            return (Criteria) this;
        }

        public Criteria andS2Between(String value1, String value2) {
            addCriterion("S2 between", value1, value2, "s2");
            return (Criteria) this;
        }

        public Criteria andS2NotBetween(String value1, String value2) {
            addCriterion("S2 not between", value1, value2, "s2");
            return (Criteria) this;
        }

        public Criteria andS3IsNull() {
            addCriterion("S3 is null");
            return (Criteria) this;
        }

        public Criteria andS3IsNotNull() {
            addCriterion("S3 is not null");
            return (Criteria) this;
        }

        public Criteria andS3EqualTo(String value) {
            addCriterion("S3 =", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3NotEqualTo(String value) {
            addCriterion("S3 <>", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3GreaterThan(String value) {
            addCriterion("S3 >", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3GreaterThanOrEqualTo(String value) {
            addCriterion("S3 >=", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3LessThan(String value) {
            addCriterion("S3 <", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3LessThanOrEqualTo(String value) {
            addCriterion("S3 <=", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3Like(String value) {
            addCriterion("S3 like", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3NotLike(String value) {
            addCriterion("S3 not like", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3In(List<String> values) {
            addCriterion("S3 in", values, "s3");
            return (Criteria) this;
        }

        public Criteria andS3NotIn(List<String> values) {
            addCriterion("S3 not in", values, "s3");
            return (Criteria) this;
        }

        public Criteria andS3Between(String value1, String value2) {
            addCriterion("S3 between", value1, value2, "s3");
            return (Criteria) this;
        }

        public Criteria andS3NotBetween(String value1, String value2) {
            addCriterion("S3 not between", value1, value2, "s3");
            return (Criteria) this;
        }

        public Criteria andS4IsNull() {
            addCriterion("S4 is null");
            return (Criteria) this;
        }

        public Criteria andS4IsNotNull() {
            addCriterion("S4 is not null");
            return (Criteria) this;
        }

        public Criteria andS4EqualTo(String value) {
            addCriterion("S4 =", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4NotEqualTo(String value) {
            addCriterion("S4 <>", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4GreaterThan(String value) {
            addCriterion("S4 >", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4GreaterThanOrEqualTo(String value) {
            addCriterion("S4 >=", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4LessThan(String value) {
            addCriterion("S4 <", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4LessThanOrEqualTo(String value) {
            addCriterion("S4 <=", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4Like(String value) {
            addCriterion("S4 like", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4NotLike(String value) {
            addCriterion("S4 not like", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4In(List<String> values) {
            addCriterion("S4 in", values, "s4");
            return (Criteria) this;
        }

        public Criteria andS4NotIn(List<String> values) {
            addCriterion("S4 not in", values, "s4");
            return (Criteria) this;
        }

        public Criteria andS4Between(String value1, String value2) {
            addCriterion("S4 between", value1, value2, "s4");
            return (Criteria) this;
        }

        public Criteria andS4NotBetween(String value1, String value2) {
            addCriterion("S4 not between", value1, value2, "s4");
            return (Criteria) this;
        }

        public Criteria andS5IsNull() {
            addCriterion("S5 is null");
            return (Criteria) this;
        }

        public Criteria andS5IsNotNull() {
            addCriterion("S5 is not null");
            return (Criteria) this;
        }

        public Criteria andS5EqualTo(String value) {
            addCriterion("S5 =", value, "s5");
            return (Criteria) this;
        }

        public Criteria andS5NotEqualTo(String value) {
            addCriterion("S5 <>", value, "s5");
            return (Criteria) this;
        }

        public Criteria andS5GreaterThan(String value) {
            addCriterion("S5 >", value, "s5");
            return (Criteria) this;
        }

        public Criteria andS5GreaterThanOrEqualTo(String value) {
            addCriterion("S5 >=", value, "s5");
            return (Criteria) this;
        }

        public Criteria andS5LessThan(String value) {
            addCriterion("S5 <", value, "s5");
            return (Criteria) this;
        }

        public Criteria andS5LessThanOrEqualTo(String value) {
            addCriterion("S5 <=", value, "s5");
            return (Criteria) this;
        }

        public Criteria andS5Like(String value) {
            addCriterion("S5 like", value, "s5");
            return (Criteria) this;
        }

        public Criteria andS5NotLike(String value) {
            addCriterion("S5 not like", value, "s5");
            return (Criteria) this;
        }

        public Criteria andS5In(List<String> values) {
            addCriterion("S5 in", values, "s5");
            return (Criteria) this;
        }

        public Criteria andS5NotIn(List<String> values) {
            addCriterion("S5 not in", values, "s5");
            return (Criteria) this;
        }

        public Criteria andS5Between(String value1, String value2) {
            addCriterion("S5 between", value1, value2, "s5");
            return (Criteria) this;
        }

        public Criteria andS5NotBetween(String value1, String value2) {
            addCriterion("S5 not between", value1, value2, "s5");
            return (Criteria) this;
        }

        public Criteria andS6IsNull() {
            addCriterion("S6 is null");
            return (Criteria) this;
        }

        public Criteria andS6IsNotNull() {
            addCriterion("S6 is not null");
            return (Criteria) this;
        }

        public Criteria andS6EqualTo(String value) {
            addCriterion("S6 =", value, "s6");
            return (Criteria) this;
        }

        public Criteria andS6NotEqualTo(String value) {
            addCriterion("S6 <>", value, "s6");
            return (Criteria) this;
        }

        public Criteria andS6GreaterThan(String value) {
            addCriterion("S6 >", value, "s6");
            return (Criteria) this;
        }

        public Criteria andS6GreaterThanOrEqualTo(String value) {
            addCriterion("S6 >=", value, "s6");
            return (Criteria) this;
        }

        public Criteria andS6LessThan(String value) {
            addCriterion("S6 <", value, "s6");
            return (Criteria) this;
        }

        public Criteria andS6LessThanOrEqualTo(String value) {
            addCriterion("S6 <=", value, "s6");
            return (Criteria) this;
        }

        public Criteria andS6Like(String value) {
            addCriterion("S6 like", value, "s6");
            return (Criteria) this;
        }

        public Criteria andS6NotLike(String value) {
            addCriterion("S6 not like", value, "s6");
            return (Criteria) this;
        }

        public Criteria andS6In(List<String> values) {
            addCriterion("S6 in", values, "s6");
            return (Criteria) this;
        }

        public Criteria andS6NotIn(List<String> values) {
            addCriterion("S6 not in", values, "s6");
            return (Criteria) this;
        }

        public Criteria andS6Between(String value1, String value2) {
            addCriterion("S6 between", value1, value2, "s6");
            return (Criteria) this;
        }

        public Criteria andS6NotBetween(String value1, String value2) {
            addCriterion("S6 not between", value1, value2, "s6");
            return (Criteria) this;
        }

        public Criteria andS7IsNull() {
            addCriterion("S7 is null");
            return (Criteria) this;
        }

        public Criteria andS7IsNotNull() {
            addCriterion("S7 is not null");
            return (Criteria) this;
        }

        public Criteria andS7EqualTo(String value) {
            addCriterion("S7 =", value, "s7");
            return (Criteria) this;
        }

        public Criteria andS7NotEqualTo(String value) {
            addCriterion("S7 <>", value, "s7");
            return (Criteria) this;
        }

        public Criteria andS7GreaterThan(String value) {
            addCriterion("S7 >", value, "s7");
            return (Criteria) this;
        }

        public Criteria andS7GreaterThanOrEqualTo(String value) {
            addCriterion("S7 >=", value, "s7");
            return (Criteria) this;
        }

        public Criteria andS7LessThan(String value) {
            addCriterion("S7 <", value, "s7");
            return (Criteria) this;
        }

        public Criteria andS7LessThanOrEqualTo(String value) {
            addCriterion("S7 <=", value, "s7");
            return (Criteria) this;
        }

        public Criteria andS7Like(String value) {
            addCriterion("S7 like", value, "s7");
            return (Criteria) this;
        }

        public Criteria andS7NotLike(String value) {
            addCriterion("S7 not like", value, "s7");
            return (Criteria) this;
        }

        public Criteria andS7In(List<String> values) {
            addCriterion("S7 in", values, "s7");
            return (Criteria) this;
        }

        public Criteria andS7NotIn(List<String> values) {
            addCriterion("S7 not in", values, "s7");
            return (Criteria) this;
        }

        public Criteria andS7Between(String value1, String value2) {
            addCriterion("S7 between", value1, value2, "s7");
            return (Criteria) this;
        }

        public Criteria andS7NotBetween(String value1, String value2) {
            addCriterion("S7 not between", value1, value2, "s7");
            return (Criteria) this;
        }

        public Criteria andS8IsNull() {
            addCriterion("S8 is null");
            return (Criteria) this;
        }

        public Criteria andS8IsNotNull() {
            addCriterion("S8 is not null");
            return (Criteria) this;
        }

        public Criteria andS8EqualTo(String value) {
            addCriterion("S8 =", value, "s8");
            return (Criteria) this;
        }

        public Criteria andS8NotEqualTo(String value) {
            addCriterion("S8 <>", value, "s8");
            return (Criteria) this;
        }

        public Criteria andS8GreaterThan(String value) {
            addCriterion("S8 >", value, "s8");
            return (Criteria) this;
        }

        public Criteria andS8GreaterThanOrEqualTo(String value) {
            addCriterion("S8 >=", value, "s8");
            return (Criteria) this;
        }

        public Criteria andS8LessThan(String value) {
            addCriterion("S8 <", value, "s8");
            return (Criteria) this;
        }

        public Criteria andS8LessThanOrEqualTo(String value) {
            addCriterion("S8 <=", value, "s8");
            return (Criteria) this;
        }

        public Criteria andS8Like(String value) {
            addCriterion("S8 like", value, "s8");
            return (Criteria) this;
        }

        public Criteria andS8NotLike(String value) {
            addCriterion("S8 not like", value, "s8");
            return (Criteria) this;
        }

        public Criteria andS8In(List<String> values) {
            addCriterion("S8 in", values, "s8");
            return (Criteria) this;
        }

        public Criteria andS8NotIn(List<String> values) {
            addCriterion("S8 not in", values, "s8");
            return (Criteria) this;
        }

        public Criteria andS8Between(String value1, String value2) {
            addCriterion("S8 between", value1, value2, "s8");
            return (Criteria) this;
        }

        public Criteria andS8NotBetween(String value1, String value2) {
            addCriterion("S8 not between", value1, value2, "s8");
            return (Criteria) this;
        }

        public Criteria andS9IsNull() {
            addCriterion("S9 is null");
            return (Criteria) this;
        }

        public Criteria andS9IsNotNull() {
            addCriterion("S9 is not null");
            return (Criteria) this;
        }

        public Criteria andS9EqualTo(String value) {
            addCriterion("S9 =", value, "s9");
            return (Criteria) this;
        }

        public Criteria andS9NotEqualTo(String value) {
            addCriterion("S9 <>", value, "s9");
            return (Criteria) this;
        }

        public Criteria andS9GreaterThan(String value) {
            addCriterion("S9 >", value, "s9");
            return (Criteria) this;
        }

        public Criteria andS9GreaterThanOrEqualTo(String value) {
            addCriterion("S9 >=", value, "s9");
            return (Criteria) this;
        }

        public Criteria andS9LessThan(String value) {
            addCriterion("S9 <", value, "s9");
            return (Criteria) this;
        }

        public Criteria andS9LessThanOrEqualTo(String value) {
            addCriterion("S9 <=", value, "s9");
            return (Criteria) this;
        }

        public Criteria andS9Like(String value) {
            addCriterion("S9 like", value, "s9");
            return (Criteria) this;
        }

        public Criteria andS9NotLike(String value) {
            addCriterion("S9 not like", value, "s9");
            return (Criteria) this;
        }

        public Criteria andS9In(List<String> values) {
            addCriterion("S9 in", values, "s9");
            return (Criteria) this;
        }

        public Criteria andS9NotIn(List<String> values) {
            addCriterion("S9 not in", values, "s9");
            return (Criteria) this;
        }

        public Criteria andS9Between(String value1, String value2) {
            addCriterion("S9 between", value1, value2, "s9");
            return (Criteria) this;
        }

        public Criteria andS9NotBetween(String value1, String value2) {
            addCriterion("S9 not between", value1, value2, "s9");
            return (Criteria) this;
        }

        public Criteria andS10IsNull() {
            addCriterion("S10 is null");
            return (Criteria) this;
        }

        public Criteria andS10IsNotNull() {
            addCriterion("S10 is not null");
            return (Criteria) this;
        }

        public Criteria andS10EqualTo(String value) {
            addCriterion("S10 =", value, "s10");
            return (Criteria) this;
        }

        public Criteria andS10NotEqualTo(String value) {
            addCriterion("S10 <>", value, "s10");
            return (Criteria) this;
        }

        public Criteria andS10GreaterThan(String value) {
            addCriterion("S10 >", value, "s10");
            return (Criteria) this;
        }

        public Criteria andS10GreaterThanOrEqualTo(String value) {
            addCriterion("S10 >=", value, "s10");
            return (Criteria) this;
        }

        public Criteria andS10LessThan(String value) {
            addCriterion("S10 <", value, "s10");
            return (Criteria) this;
        }

        public Criteria andS10LessThanOrEqualTo(String value) {
            addCriterion("S10 <=", value, "s10");
            return (Criteria) this;
        }

        public Criteria andS10Like(String value) {
            addCriterion("S10 like", value, "s10");
            return (Criteria) this;
        }

        public Criteria andS10NotLike(String value) {
            addCriterion("S10 not like", value, "s10");
            return (Criteria) this;
        }

        public Criteria andS10In(List<String> values) {
            addCriterion("S10 in", values, "s10");
            return (Criteria) this;
        }

        public Criteria andS10NotIn(List<String> values) {
            addCriterion("S10 not in", values, "s10");
            return (Criteria) this;
        }

        public Criteria andS10Between(String value1, String value2) {
            addCriterion("S10 between", value1, value2, "s10");
            return (Criteria) this;
        }

        public Criteria andS10NotBetween(String value1, String value2) {
            addCriterion("S10 not between", value1, value2, "s10");
            return (Criteria) this;
        }

        public Criteria andS11IsNull() {
            addCriterion("S11 is null");
            return (Criteria) this;
        }

        public Criteria andS11IsNotNull() {
            addCriterion("S11 is not null");
            return (Criteria) this;
        }

        public Criteria andS11EqualTo(String value) {
            addCriterion("S11 =", value, "s11");
            return (Criteria) this;
        }

        public Criteria andS11NotEqualTo(String value) {
            addCriterion("S11 <>", value, "s11");
            return (Criteria) this;
        }

        public Criteria andS11GreaterThan(String value) {
            addCriterion("S11 >", value, "s11");
            return (Criteria) this;
        }

        public Criteria andS11GreaterThanOrEqualTo(String value) {
            addCriterion("S11 >=", value, "s11");
            return (Criteria) this;
        }

        public Criteria andS11LessThan(String value) {
            addCriterion("S11 <", value, "s11");
            return (Criteria) this;
        }

        public Criteria andS11LessThanOrEqualTo(String value) {
            addCriterion("S11 <=", value, "s11");
            return (Criteria) this;
        }

        public Criteria andS11Like(String value) {
            addCriterion("S11 like", value, "s11");
            return (Criteria) this;
        }

        public Criteria andS11NotLike(String value) {
            addCriterion("S11 not like", value, "s11");
            return (Criteria) this;
        }

        public Criteria andS11In(List<String> values) {
            addCriterion("S11 in", values, "s11");
            return (Criteria) this;
        }

        public Criteria andS11NotIn(List<String> values) {
            addCriterion("S11 not in", values, "s11");
            return (Criteria) this;
        }

        public Criteria andS11Between(String value1, String value2) {
            addCriterion("S11 between", value1, value2, "s11");
            return (Criteria) this;
        }

        public Criteria andS11NotBetween(String value1, String value2) {
            addCriterion("S11 not between", value1, value2, "s11");
            return (Criteria) this;
        }

        public Criteria andS12IsNull() {
            addCriterion("S12 is null");
            return (Criteria) this;
        }

        public Criteria andS12IsNotNull() {
            addCriterion("S12 is not null");
            return (Criteria) this;
        }

        public Criteria andS12EqualTo(String value) {
            addCriterion("S12 =", value, "s12");
            return (Criteria) this;
        }

        public Criteria andS12NotEqualTo(String value) {
            addCriterion("S12 <>", value, "s12");
            return (Criteria) this;
        }

        public Criteria andS12GreaterThan(String value) {
            addCriterion("S12 >", value, "s12");
            return (Criteria) this;
        }

        public Criteria andS12GreaterThanOrEqualTo(String value) {
            addCriterion("S12 >=", value, "s12");
            return (Criteria) this;
        }

        public Criteria andS12LessThan(String value) {
            addCriterion("S12 <", value, "s12");
            return (Criteria) this;
        }

        public Criteria andS12LessThanOrEqualTo(String value) {
            addCriterion("S12 <=", value, "s12");
            return (Criteria) this;
        }

        public Criteria andS12Like(String value) {
            addCriterion("S12 like", value, "s12");
            return (Criteria) this;
        }

        public Criteria andS12NotLike(String value) {
            addCriterion("S12 not like", value, "s12");
            return (Criteria) this;
        }

        public Criteria andS12In(List<String> values) {
            addCriterion("S12 in", values, "s12");
            return (Criteria) this;
        }

        public Criteria andS12NotIn(List<String> values) {
            addCriterion("S12 not in", values, "s12");
            return (Criteria) this;
        }

        public Criteria andS12Between(String value1, String value2) {
            addCriterion("S12 between", value1, value2, "s12");
            return (Criteria) this;
        }

        public Criteria andS12NotBetween(String value1, String value2) {
            addCriterion("S12 not between", value1, value2, "s12");
            return (Criteria) this;
        }

        public Criteria andS13IsNull() {
            addCriterion("S13 is null");
            return (Criteria) this;
        }

        public Criteria andS13IsNotNull() {
            addCriterion("S13 is not null");
            return (Criteria) this;
        }

        public Criteria andS13EqualTo(String value) {
            addCriterion("S13 =", value, "s13");
            return (Criteria) this;
        }

        public Criteria andS13NotEqualTo(String value) {
            addCriterion("S13 <>", value, "s13");
            return (Criteria) this;
        }

        public Criteria andS13GreaterThan(String value) {
            addCriterion("S13 >", value, "s13");
            return (Criteria) this;
        }

        public Criteria andS13GreaterThanOrEqualTo(String value) {
            addCriterion("S13 >=", value, "s13");
            return (Criteria) this;
        }

        public Criteria andS13LessThan(String value) {
            addCriterion("S13 <", value, "s13");
            return (Criteria) this;
        }

        public Criteria andS13LessThanOrEqualTo(String value) {
            addCriterion("S13 <=", value, "s13");
            return (Criteria) this;
        }

        public Criteria andS13Like(String value) {
            addCriterion("S13 like", value, "s13");
            return (Criteria) this;
        }

        public Criteria andS13NotLike(String value) {
            addCriterion("S13 not like", value, "s13");
            return (Criteria) this;
        }

        public Criteria andS13In(List<String> values) {
            addCriterion("S13 in", values, "s13");
            return (Criteria) this;
        }

        public Criteria andS13NotIn(List<String> values) {
            addCriterion("S13 not in", values, "s13");
            return (Criteria) this;
        }

        public Criteria andS13Between(String value1, String value2) {
            addCriterion("S13 between", value1, value2, "s13");
            return (Criteria) this;
        }

        public Criteria andS13NotBetween(String value1, String value2) {
            addCriterion("S13 not between", value1, value2, "s13");
            return (Criteria) this;
        }

        public Criteria andS14IsNull() {
            addCriterion("S14 is null");
            return (Criteria) this;
        }

        public Criteria andS14IsNotNull() {
            addCriterion("S14 is not null");
            return (Criteria) this;
        }

        public Criteria andS14EqualTo(String value) {
            addCriterion("S14 =", value, "s14");
            return (Criteria) this;
        }

        public Criteria andS14NotEqualTo(String value) {
            addCriterion("S14 <>", value, "s14");
            return (Criteria) this;
        }

        public Criteria andS14GreaterThan(String value) {
            addCriterion("S14 >", value, "s14");
            return (Criteria) this;
        }

        public Criteria andS14GreaterThanOrEqualTo(String value) {
            addCriterion("S14 >=", value, "s14");
            return (Criteria) this;
        }

        public Criteria andS14LessThan(String value) {
            addCriterion("S14 <", value, "s14");
            return (Criteria) this;
        }

        public Criteria andS14LessThanOrEqualTo(String value) {
            addCriterion("S14 <=", value, "s14");
            return (Criteria) this;
        }

        public Criteria andS14Like(String value) {
            addCriterion("S14 like", value, "s14");
            return (Criteria) this;
        }

        public Criteria andS14NotLike(String value) {
            addCriterion("S14 not like", value, "s14");
            return (Criteria) this;
        }

        public Criteria andS14In(List<String> values) {
            addCriterion("S14 in", values, "s14");
            return (Criteria) this;
        }

        public Criteria andS14NotIn(List<String> values) {
            addCriterion("S14 not in", values, "s14");
            return (Criteria) this;
        }

        public Criteria andS14Between(String value1, String value2) {
            addCriterion("S14 between", value1, value2, "s14");
            return (Criteria) this;
        }

        public Criteria andS14NotBetween(String value1, String value2) {
            addCriterion("S14 not between", value1, value2, "s14");
            return (Criteria) this;
        }

        public Criteria andS15IsNull() {
            addCriterion("S15 is null");
            return (Criteria) this;
        }

        public Criteria andS15IsNotNull() {
            addCriterion("S15 is not null");
            return (Criteria) this;
        }

        public Criteria andS15EqualTo(String value) {
            addCriterion("S15 =", value, "s15");
            return (Criteria) this;
        }

        public Criteria andS15NotEqualTo(String value) {
            addCriterion("S15 <>", value, "s15");
            return (Criteria) this;
        }

        public Criteria andS15GreaterThan(String value) {
            addCriterion("S15 >", value, "s15");
            return (Criteria) this;
        }

        public Criteria andS15GreaterThanOrEqualTo(String value) {
            addCriterion("S15 >=", value, "s15");
            return (Criteria) this;
        }

        public Criteria andS15LessThan(String value) {
            addCriterion("S15 <", value, "s15");
            return (Criteria) this;
        }

        public Criteria andS15LessThanOrEqualTo(String value) {
            addCriterion("S15 <=", value, "s15");
            return (Criteria) this;
        }

        public Criteria andS15Like(String value) {
            addCriterion("S15 like", value, "s15");
            return (Criteria) this;
        }

        public Criteria andS15NotLike(String value) {
            addCriterion("S15 not like", value, "s15");
            return (Criteria) this;
        }

        public Criteria andS15In(List<String> values) {
            addCriterion("S15 in", values, "s15");
            return (Criteria) this;
        }

        public Criteria andS15NotIn(List<String> values) {
            addCriterion("S15 not in", values, "s15");
            return (Criteria) this;
        }

        public Criteria andS15Between(String value1, String value2) {
            addCriterion("S15 between", value1, value2, "s15");
            return (Criteria) this;
        }

        public Criteria andS15NotBetween(String value1, String value2) {
            addCriterion("S15 not between", value1, value2, "s15");
            return (Criteria) this;
        }

        public Criteria andS16IsNull() {
            addCriterion("S16 is null");
            return (Criteria) this;
        }

        public Criteria andS16IsNotNull() {
            addCriterion("S16 is not null");
            return (Criteria) this;
        }

        public Criteria andS16EqualTo(String value) {
            addCriterion("S16 =", value, "s16");
            return (Criteria) this;
        }

        public Criteria andS16NotEqualTo(String value) {
            addCriterion("S16 <>", value, "s16");
            return (Criteria) this;
        }

        public Criteria andS16GreaterThan(String value) {
            addCriterion("S16 >", value, "s16");
            return (Criteria) this;
        }

        public Criteria andS16GreaterThanOrEqualTo(String value) {
            addCriterion("S16 >=", value, "s16");
            return (Criteria) this;
        }

        public Criteria andS16LessThan(String value) {
            addCriterion("S16 <", value, "s16");
            return (Criteria) this;
        }

        public Criteria andS16LessThanOrEqualTo(String value) {
            addCriterion("S16 <=", value, "s16");
            return (Criteria) this;
        }

        public Criteria andS16Like(String value) {
            addCriterion("S16 like", value, "s16");
            return (Criteria) this;
        }

        public Criteria andS16NotLike(String value) {
            addCriterion("S16 not like", value, "s16");
            return (Criteria) this;
        }

        public Criteria andS16In(List<String> values) {
            addCriterion("S16 in", values, "s16");
            return (Criteria) this;
        }

        public Criteria andS16NotIn(List<String> values) {
            addCriterion("S16 not in", values, "s16");
            return (Criteria) this;
        }

        public Criteria andS16Between(String value1, String value2) {
            addCriterion("S16 between", value1, value2, "s16");
            return (Criteria) this;
        }

        public Criteria andS16NotBetween(String value1, String value2) {
            addCriterion("S16 not between", value1, value2, "s16");
            return (Criteria) this;
        }

        public Criteria andS17IsNull() {
            addCriterion("S17 is null");
            return (Criteria) this;
        }

        public Criteria andS17IsNotNull() {
            addCriterion("S17 is not null");
            return (Criteria) this;
        }

        public Criteria andS17EqualTo(String value) {
            addCriterion("S17 =", value, "s17");
            return (Criteria) this;
        }

        public Criteria andS17NotEqualTo(String value) {
            addCriterion("S17 <>", value, "s17");
            return (Criteria) this;
        }

        public Criteria andS17GreaterThan(String value) {
            addCriterion("S17 >", value, "s17");
            return (Criteria) this;
        }

        public Criteria andS17GreaterThanOrEqualTo(String value) {
            addCriterion("S17 >=", value, "s17");
            return (Criteria) this;
        }

        public Criteria andS17LessThan(String value) {
            addCriterion("S17 <", value, "s17");
            return (Criteria) this;
        }

        public Criteria andS17LessThanOrEqualTo(String value) {
            addCriterion("S17 <=", value, "s17");
            return (Criteria) this;
        }

        public Criteria andS17Like(String value) {
            addCriterion("S17 like", value, "s17");
            return (Criteria) this;
        }

        public Criteria andS17NotLike(String value) {
            addCriterion("S17 not like", value, "s17");
            return (Criteria) this;
        }

        public Criteria andS17In(List<String> values) {
            addCriterion("S17 in", values, "s17");
            return (Criteria) this;
        }

        public Criteria andS17NotIn(List<String> values) {
            addCriterion("S17 not in", values, "s17");
            return (Criteria) this;
        }

        public Criteria andS17Between(String value1, String value2) {
            addCriterion("S17 between", value1, value2, "s17");
            return (Criteria) this;
        }

        public Criteria andS17NotBetween(String value1, String value2) {
            addCriterion("S17 not between", value1, value2, "s17");
            return (Criteria) this;
        }

        public Criteria andS18IsNull() {
            addCriterion("S18 is null");
            return (Criteria) this;
        }

        public Criteria andS18IsNotNull() {
            addCriterion("S18 is not null");
            return (Criteria) this;
        }

        public Criteria andS18EqualTo(String value) {
            addCriterion("S18 =", value, "s18");
            return (Criteria) this;
        }

        public Criteria andS18NotEqualTo(String value) {
            addCriterion("S18 <>", value, "s18");
            return (Criteria) this;
        }

        public Criteria andS18GreaterThan(String value) {
            addCriterion("S18 >", value, "s18");
            return (Criteria) this;
        }

        public Criteria andS18GreaterThanOrEqualTo(String value) {
            addCriterion("S18 >=", value, "s18");
            return (Criteria) this;
        }

        public Criteria andS18LessThan(String value) {
            addCriterion("S18 <", value, "s18");
            return (Criteria) this;
        }

        public Criteria andS18LessThanOrEqualTo(String value) {
            addCriterion("S18 <=", value, "s18");
            return (Criteria) this;
        }

        public Criteria andS18Like(String value) {
            addCriterion("S18 like", value, "s18");
            return (Criteria) this;
        }

        public Criteria andS18NotLike(String value) {
            addCriterion("S18 not like", value, "s18");
            return (Criteria) this;
        }

        public Criteria andS18In(List<String> values) {
            addCriterion("S18 in", values, "s18");
            return (Criteria) this;
        }

        public Criteria andS18NotIn(List<String> values) {
            addCriterion("S18 not in", values, "s18");
            return (Criteria) this;
        }

        public Criteria andS18Between(String value1, String value2) {
            addCriterion("S18 between", value1, value2, "s18");
            return (Criteria) this;
        }

        public Criteria andS18NotBetween(String value1, String value2) {
            addCriterion("S18 not between", value1, value2, "s18");
            return (Criteria) this;
        }

        public Criteria andS19IsNull() {
            addCriterion("S19 is null");
            return (Criteria) this;
        }

        public Criteria andS19IsNotNull() {
            addCriterion("S19 is not null");
            return (Criteria) this;
        }

        public Criteria andS19EqualTo(String value) {
            addCriterion("S19 =", value, "s19");
            return (Criteria) this;
        }

        public Criteria andS19NotEqualTo(String value) {
            addCriterion("S19 <>", value, "s19");
            return (Criteria) this;
        }

        public Criteria andS19GreaterThan(String value) {
            addCriterion("S19 >", value, "s19");
            return (Criteria) this;
        }

        public Criteria andS19GreaterThanOrEqualTo(String value) {
            addCriterion("S19 >=", value, "s19");
            return (Criteria) this;
        }

        public Criteria andS19LessThan(String value) {
            addCriterion("S19 <", value, "s19");
            return (Criteria) this;
        }

        public Criteria andS19LessThanOrEqualTo(String value) {
            addCriterion("S19 <=", value, "s19");
            return (Criteria) this;
        }

        public Criteria andS19Like(String value) {
            addCriterion("S19 like", value, "s19");
            return (Criteria) this;
        }

        public Criteria andS19NotLike(String value) {
            addCriterion("S19 not like", value, "s19");
            return (Criteria) this;
        }

        public Criteria andS19In(List<String> values) {
            addCriterion("S19 in", values, "s19");
            return (Criteria) this;
        }

        public Criteria andS19NotIn(List<String> values) {
            addCriterion("S19 not in", values, "s19");
            return (Criteria) this;
        }

        public Criteria andS19Between(String value1, String value2) {
            addCriterion("S19 between", value1, value2, "s19");
            return (Criteria) this;
        }

        public Criteria andS19NotBetween(String value1, String value2) {
            addCriterion("S19 not between", value1, value2, "s19");
            return (Criteria) this;
        }

        public Criteria andS20IsNull() {
            addCriterion("S20 is null");
            return (Criteria) this;
        }

        public Criteria andS20IsNotNull() {
            addCriterion("S20 is not null");
            return (Criteria) this;
        }

        public Criteria andS20EqualTo(String value) {
            addCriterion("S20 =", value, "s20");
            return (Criteria) this;
        }

        public Criteria andS20NotEqualTo(String value) {
            addCriterion("S20 <>", value, "s20");
            return (Criteria) this;
        }

        public Criteria andS20GreaterThan(String value) {
            addCriterion("S20 >", value, "s20");
            return (Criteria) this;
        }

        public Criteria andS20GreaterThanOrEqualTo(String value) {
            addCriterion("S20 >=", value, "s20");
            return (Criteria) this;
        }

        public Criteria andS20LessThan(String value) {
            addCriterion("S20 <", value, "s20");
            return (Criteria) this;
        }

        public Criteria andS20LessThanOrEqualTo(String value) {
            addCriterion("S20 <=", value, "s20");
            return (Criteria) this;
        }

        public Criteria andS20Like(String value) {
            addCriterion("S20 like", value, "s20");
            return (Criteria) this;
        }

        public Criteria andS20NotLike(String value) {
            addCriterion("S20 not like", value, "s20");
            return (Criteria) this;
        }

        public Criteria andS20In(List<String> values) {
            addCriterion("S20 in", values, "s20");
            return (Criteria) this;
        }

        public Criteria andS20NotIn(List<String> values) {
            addCriterion("S20 not in", values, "s20");
            return (Criteria) this;
        }

        public Criteria andS20Between(String value1, String value2) {
            addCriterion("S20 between", value1, value2, "s20");
            return (Criteria) this;
        }

        public Criteria andS20NotBetween(String value1, String value2) {
            addCriterion("S20 not between", value1, value2, "s20");
            return (Criteria) this;
        }

        public Criteria andS21IsNull() {
            addCriterion("S21 is null");
            return (Criteria) this;
        }

        public Criteria andS21IsNotNull() {
            addCriterion("S21 is not null");
            return (Criteria) this;
        }

        public Criteria andS21EqualTo(String value) {
            addCriterion("S21 =", value, "s21");
            return (Criteria) this;
        }

        public Criteria andS21NotEqualTo(String value) {
            addCriterion("S21 <>", value, "s21");
            return (Criteria) this;
        }

        public Criteria andS21GreaterThan(String value) {
            addCriterion("S21 >", value, "s21");
            return (Criteria) this;
        }

        public Criteria andS21GreaterThanOrEqualTo(String value) {
            addCriterion("S21 >=", value, "s21");
            return (Criteria) this;
        }

        public Criteria andS21LessThan(String value) {
            addCriterion("S21 <", value, "s21");
            return (Criteria) this;
        }

        public Criteria andS21LessThanOrEqualTo(String value) {
            addCriterion("S21 <=", value, "s21");
            return (Criteria) this;
        }

        public Criteria andS21Like(String value) {
            addCriterion("S21 like", value, "s21");
            return (Criteria) this;
        }

        public Criteria andS21NotLike(String value) {
            addCriterion("S21 not like", value, "s21");
            return (Criteria) this;
        }

        public Criteria andS21In(List<String> values) {
            addCriterion("S21 in", values, "s21");
            return (Criteria) this;
        }

        public Criteria andS21NotIn(List<String> values) {
            addCriterion("S21 not in", values, "s21");
            return (Criteria) this;
        }

        public Criteria andS21Between(String value1, String value2) {
            addCriterion("S21 between", value1, value2, "s21");
            return (Criteria) this;
        }

        public Criteria andS21NotBetween(String value1, String value2) {
            addCriterion("S21 not between", value1, value2, "s21");
            return (Criteria) this;
        }

        public Criteria andS22IsNull() {
            addCriterion("S22 is null");
            return (Criteria) this;
        }

        public Criteria andS22IsNotNull() {
            addCriterion("S22 is not null");
            return (Criteria) this;
        }

        public Criteria andS22EqualTo(String value) {
            addCriterion("S22 =", value, "s22");
            return (Criteria) this;
        }

        public Criteria andS22NotEqualTo(String value) {
            addCriterion("S22 <>", value, "s22");
            return (Criteria) this;
        }

        public Criteria andS22GreaterThan(String value) {
            addCriterion("S22 >", value, "s22");
            return (Criteria) this;
        }

        public Criteria andS22GreaterThanOrEqualTo(String value) {
            addCriterion("S22 >=", value, "s22");
            return (Criteria) this;
        }

        public Criteria andS22LessThan(String value) {
            addCriterion("S22 <", value, "s22");
            return (Criteria) this;
        }

        public Criteria andS22LessThanOrEqualTo(String value) {
            addCriterion("S22 <=", value, "s22");
            return (Criteria) this;
        }

        public Criteria andS22Like(String value) {
            addCriterion("S22 like", value, "s22");
            return (Criteria) this;
        }

        public Criteria andS22NotLike(String value) {
            addCriterion("S22 not like", value, "s22");
            return (Criteria) this;
        }

        public Criteria andS22In(List<String> values) {
            addCriterion("S22 in", values, "s22");
            return (Criteria) this;
        }

        public Criteria andS22NotIn(List<String> values) {
            addCriterion("S22 not in", values, "s22");
            return (Criteria) this;
        }

        public Criteria andS22Between(String value1, String value2) {
            addCriterion("S22 between", value1, value2, "s22");
            return (Criteria) this;
        }

        public Criteria andS22NotBetween(String value1, String value2) {
            addCriterion("S22 not between", value1, value2, "s22");
            return (Criteria) this;
        }

        public Criteria andS23IsNull() {
            addCriterion("S23 is null");
            return (Criteria) this;
        }

        public Criteria andS23IsNotNull() {
            addCriterion("S23 is not null");
            return (Criteria) this;
        }

        public Criteria andS23EqualTo(String value) {
            addCriterion("S23 =", value, "s23");
            return (Criteria) this;
        }

        public Criteria andS23NotEqualTo(String value) {
            addCriterion("S23 <>", value, "s23");
            return (Criteria) this;
        }

        public Criteria andS23GreaterThan(String value) {
            addCriterion("S23 >", value, "s23");
            return (Criteria) this;
        }

        public Criteria andS23GreaterThanOrEqualTo(String value) {
            addCriterion("S23 >=", value, "s23");
            return (Criteria) this;
        }

        public Criteria andS23LessThan(String value) {
            addCriterion("S23 <", value, "s23");
            return (Criteria) this;
        }

        public Criteria andS23LessThanOrEqualTo(String value) {
            addCriterion("S23 <=", value, "s23");
            return (Criteria) this;
        }

        public Criteria andS23Like(String value) {
            addCriterion("S23 like", value, "s23");
            return (Criteria) this;
        }

        public Criteria andS23NotLike(String value) {
            addCriterion("S23 not like", value, "s23");
            return (Criteria) this;
        }

        public Criteria andS23In(List<String> values) {
            addCriterion("S23 in", values, "s23");
            return (Criteria) this;
        }

        public Criteria andS23NotIn(List<String> values) {
            addCriterion("S23 not in", values, "s23");
            return (Criteria) this;
        }

        public Criteria andS23Between(String value1, String value2) {
            addCriterion("S23 between", value1, value2, "s23");
            return (Criteria) this;
        }

        public Criteria andS23NotBetween(String value1, String value2) {
            addCriterion("S23 not between", value1, value2, "s23");
            return (Criteria) this;
        }

        public Criteria andS24IsNull() {
            addCriterion("S24 is null");
            return (Criteria) this;
        }

        public Criteria andS24IsNotNull() {
            addCriterion("S24 is not null");
            return (Criteria) this;
        }

        public Criteria andS24EqualTo(String value) {
            addCriterion("S24 =", value, "s24");
            return (Criteria) this;
        }

        public Criteria andS24NotEqualTo(String value) {
            addCriterion("S24 <>", value, "s24");
            return (Criteria) this;
        }

        public Criteria andS24GreaterThan(String value) {
            addCriterion("S24 >", value, "s24");
            return (Criteria) this;
        }

        public Criteria andS24GreaterThanOrEqualTo(String value) {
            addCriterion("S24 >=", value, "s24");
            return (Criteria) this;
        }

        public Criteria andS24LessThan(String value) {
            addCriterion("S24 <", value, "s24");
            return (Criteria) this;
        }

        public Criteria andS24LessThanOrEqualTo(String value) {
            addCriterion("S24 <=", value, "s24");
            return (Criteria) this;
        }

        public Criteria andS24Like(String value) {
            addCriterion("S24 like", value, "s24");
            return (Criteria) this;
        }

        public Criteria andS24NotLike(String value) {
            addCriterion("S24 not like", value, "s24");
            return (Criteria) this;
        }

        public Criteria andS24In(List<String> values) {
            addCriterion("S24 in", values, "s24");
            return (Criteria) this;
        }

        public Criteria andS24NotIn(List<String> values) {
            addCriterion("S24 not in", values, "s24");
            return (Criteria) this;
        }

        public Criteria andS24Between(String value1, String value2) {
            addCriterion("S24 between", value1, value2, "s24");
            return (Criteria) this;
        }

        public Criteria andS24NotBetween(String value1, String value2) {
            addCriterion("S24 not between", value1, value2, "s24");
            return (Criteria) this;
        }

        public Criteria andS25IsNull() {
            addCriterion("S25 is null");
            return (Criteria) this;
        }

        public Criteria andS25IsNotNull() {
            addCriterion("S25 is not null");
            return (Criteria) this;
        }

        public Criteria andS25EqualTo(String value) {
            addCriterion("S25 =", value, "s25");
            return (Criteria) this;
        }

        public Criteria andS25NotEqualTo(String value) {
            addCriterion("S25 <>", value, "s25");
            return (Criteria) this;
        }

        public Criteria andS25GreaterThan(String value) {
            addCriterion("S25 >", value, "s25");
            return (Criteria) this;
        }

        public Criteria andS25GreaterThanOrEqualTo(String value) {
            addCriterion("S25 >=", value, "s25");
            return (Criteria) this;
        }

        public Criteria andS25LessThan(String value) {
            addCriterion("S25 <", value, "s25");
            return (Criteria) this;
        }

        public Criteria andS25LessThanOrEqualTo(String value) {
            addCriterion("S25 <=", value, "s25");
            return (Criteria) this;
        }

        public Criteria andS25Like(String value) {
            addCriterion("S25 like", value, "s25");
            return (Criteria) this;
        }

        public Criteria andS25NotLike(String value) {
            addCriterion("S25 not like", value, "s25");
            return (Criteria) this;
        }

        public Criteria andS25In(List<String> values) {
            addCriterion("S25 in", values, "s25");
            return (Criteria) this;
        }

        public Criteria andS25NotIn(List<String> values) {
            addCriterion("S25 not in", values, "s25");
            return (Criteria) this;
        }

        public Criteria andS25Between(String value1, String value2) {
            addCriterion("S25 between", value1, value2, "s25");
            return (Criteria) this;
        }

        public Criteria andS25NotBetween(String value1, String value2) {
            addCriterion("S25 not between", value1, value2, "s25");
            return (Criteria) this;
        }

        public Criteria andS26IsNull() {
            addCriterion("S26 is null");
            return (Criteria) this;
        }

        public Criteria andS26IsNotNull() {
            addCriterion("S26 is not null");
            return (Criteria) this;
        }

        public Criteria andS26EqualTo(String value) {
            addCriterion("S26 =", value, "s26");
            return (Criteria) this;
        }

        public Criteria andS26NotEqualTo(String value) {
            addCriterion("S26 <>", value, "s26");
            return (Criteria) this;
        }

        public Criteria andS26GreaterThan(String value) {
            addCriterion("S26 >", value, "s26");
            return (Criteria) this;
        }

        public Criteria andS26GreaterThanOrEqualTo(String value) {
            addCriterion("S26 >=", value, "s26");
            return (Criteria) this;
        }

        public Criteria andS26LessThan(String value) {
            addCriterion("S26 <", value, "s26");
            return (Criteria) this;
        }

        public Criteria andS26LessThanOrEqualTo(String value) {
            addCriterion("S26 <=", value, "s26");
            return (Criteria) this;
        }

        public Criteria andS26Like(String value) {
            addCriterion("S26 like", value, "s26");
            return (Criteria) this;
        }

        public Criteria andS26NotLike(String value) {
            addCriterion("S26 not like", value, "s26");
            return (Criteria) this;
        }

        public Criteria andS26In(List<String> values) {
            addCriterion("S26 in", values, "s26");
            return (Criteria) this;
        }

        public Criteria andS26NotIn(List<String> values) {
            addCriterion("S26 not in", values, "s26");
            return (Criteria) this;
        }

        public Criteria andS26Between(String value1, String value2) {
            addCriterion("S26 between", value1, value2, "s26");
            return (Criteria) this;
        }

        public Criteria andS26NotBetween(String value1, String value2) {
            addCriterion("S26 not between", value1, value2, "s26");
            return (Criteria) this;
        }

        public Criteria andS27IsNull() {
            addCriterion("S27 is null");
            return (Criteria) this;
        }

        public Criteria andS27IsNotNull() {
            addCriterion("S27 is not null");
            return (Criteria) this;
        }

        public Criteria andS27EqualTo(String value) {
            addCriterion("S27 =", value, "s27");
            return (Criteria) this;
        }

        public Criteria andS27NotEqualTo(String value) {
            addCriterion("S27 <>", value, "s27");
            return (Criteria) this;
        }

        public Criteria andS27GreaterThan(String value) {
            addCriterion("S27 >", value, "s27");
            return (Criteria) this;
        }

        public Criteria andS27GreaterThanOrEqualTo(String value) {
            addCriterion("S27 >=", value, "s27");
            return (Criteria) this;
        }

        public Criteria andS27LessThan(String value) {
            addCriterion("S27 <", value, "s27");
            return (Criteria) this;
        }

        public Criteria andS27LessThanOrEqualTo(String value) {
            addCriterion("S27 <=", value, "s27");
            return (Criteria) this;
        }

        public Criteria andS27Like(String value) {
            addCriterion("S27 like", value, "s27");
            return (Criteria) this;
        }

        public Criteria andS27NotLike(String value) {
            addCriterion("S27 not like", value, "s27");
            return (Criteria) this;
        }

        public Criteria andS27In(List<String> values) {
            addCriterion("S27 in", values, "s27");
            return (Criteria) this;
        }

        public Criteria andS27NotIn(List<String> values) {
            addCriterion("S27 not in", values, "s27");
            return (Criteria) this;
        }

        public Criteria andS27Between(String value1, String value2) {
            addCriterion("S27 between", value1, value2, "s27");
            return (Criteria) this;
        }

        public Criteria andS27NotBetween(String value1, String value2) {
            addCriterion("S27 not between", value1, value2, "s27");
            return (Criteria) this;
        }

        public Criteria andS28IsNull() {
            addCriterion("S28 is null");
            return (Criteria) this;
        }

        public Criteria andS28IsNotNull() {
            addCriterion("S28 is not null");
            return (Criteria) this;
        }

        public Criteria andS28EqualTo(String value) {
            addCriterion("S28 =", value, "s28");
            return (Criteria) this;
        }

        public Criteria andS28NotEqualTo(String value) {
            addCriterion("S28 <>", value, "s28");
            return (Criteria) this;
        }

        public Criteria andS28GreaterThan(String value) {
            addCriterion("S28 >", value, "s28");
            return (Criteria) this;
        }

        public Criteria andS28GreaterThanOrEqualTo(String value) {
            addCriterion("S28 >=", value, "s28");
            return (Criteria) this;
        }

        public Criteria andS28LessThan(String value) {
            addCriterion("S28 <", value, "s28");
            return (Criteria) this;
        }

        public Criteria andS28LessThanOrEqualTo(String value) {
            addCriterion("S28 <=", value, "s28");
            return (Criteria) this;
        }

        public Criteria andS28Like(String value) {
            addCriterion("S28 like", value, "s28");
            return (Criteria) this;
        }

        public Criteria andS28NotLike(String value) {
            addCriterion("S28 not like", value, "s28");
            return (Criteria) this;
        }

        public Criteria andS28In(List<String> values) {
            addCriterion("S28 in", values, "s28");
            return (Criteria) this;
        }

        public Criteria andS28NotIn(List<String> values) {
            addCriterion("S28 not in", values, "s28");
            return (Criteria) this;
        }

        public Criteria andS28Between(String value1, String value2) {
            addCriterion("S28 between", value1, value2, "s28");
            return (Criteria) this;
        }

        public Criteria andS28NotBetween(String value1, String value2) {
            addCriterion("S28 not between", value1, value2, "s28");
            return (Criteria) this;
        }

        public Criteria andS29IsNull() {
            addCriterion("S29 is null");
            return (Criteria) this;
        }

        public Criteria andS29IsNotNull() {
            addCriterion("S29 is not null");
            return (Criteria) this;
        }

        public Criteria andS29EqualTo(String value) {
            addCriterion("S29 =", value, "s29");
            return (Criteria) this;
        }

        public Criteria andS29NotEqualTo(String value) {
            addCriterion("S29 <>", value, "s29");
            return (Criteria) this;
        }

        public Criteria andS29GreaterThan(String value) {
            addCriterion("S29 >", value, "s29");
            return (Criteria) this;
        }

        public Criteria andS29GreaterThanOrEqualTo(String value) {
            addCriterion("S29 >=", value, "s29");
            return (Criteria) this;
        }

        public Criteria andS29LessThan(String value) {
            addCriterion("S29 <", value, "s29");
            return (Criteria) this;
        }

        public Criteria andS29LessThanOrEqualTo(String value) {
            addCriterion("S29 <=", value, "s29");
            return (Criteria) this;
        }

        public Criteria andS29Like(String value) {
            addCriterion("S29 like", value, "s29");
            return (Criteria) this;
        }

        public Criteria andS29NotLike(String value) {
            addCriterion("S29 not like", value, "s29");
            return (Criteria) this;
        }

        public Criteria andS29In(List<String> values) {
            addCriterion("S29 in", values, "s29");
            return (Criteria) this;
        }

        public Criteria andS29NotIn(List<String> values) {
            addCriterion("S29 not in", values, "s29");
            return (Criteria) this;
        }

        public Criteria andS29Between(String value1, String value2) {
            addCriterion("S29 between", value1, value2, "s29");
            return (Criteria) this;
        }

        public Criteria andS29NotBetween(String value1, String value2) {
            addCriterion("S29 not between", value1, value2, "s29");
            return (Criteria) this;
        }

        public Criteria andS30IsNull() {
            addCriterion("S30 is null");
            return (Criteria) this;
        }

        public Criteria andS30IsNotNull() {
            addCriterion("S30 is not null");
            return (Criteria) this;
        }

        public Criteria andS30EqualTo(String value) {
            addCriterion("S30 =", value, "s30");
            return (Criteria) this;
        }

        public Criteria andS30NotEqualTo(String value) {
            addCriterion("S30 <>", value, "s30");
            return (Criteria) this;
        }

        public Criteria andS30GreaterThan(String value) {
            addCriterion("S30 >", value, "s30");
            return (Criteria) this;
        }

        public Criteria andS30GreaterThanOrEqualTo(String value) {
            addCriterion("S30 >=", value, "s30");
            return (Criteria) this;
        }

        public Criteria andS30LessThan(String value) {
            addCriterion("S30 <", value, "s30");
            return (Criteria) this;
        }

        public Criteria andS30LessThanOrEqualTo(String value) {
            addCriterion("S30 <=", value, "s30");
            return (Criteria) this;
        }

        public Criteria andS30Like(String value) {
            addCriterion("S30 like", value, "s30");
            return (Criteria) this;
        }

        public Criteria andS30NotLike(String value) {
            addCriterion("S30 not like", value, "s30");
            return (Criteria) this;
        }

        public Criteria andS30In(List<String> values) {
            addCriterion("S30 in", values, "s30");
            return (Criteria) this;
        }

        public Criteria andS30NotIn(List<String> values) {
            addCriterion("S30 not in", values, "s30");
            return (Criteria) this;
        }

        public Criteria andS30Between(String value1, String value2) {
            addCriterion("S30 between", value1, value2, "s30");
            return (Criteria) this;
        }

        public Criteria andS30NotBetween(String value1, String value2) {
            addCriterion("S30 not between", value1, value2, "s30");
            return (Criteria) this;
        }

        public Criteria andS31IsNull() {
            addCriterion("S31 is null");
            return (Criteria) this;
        }

        public Criteria andS31IsNotNull() {
            addCriterion("S31 is not null");
            return (Criteria) this;
        }

        public Criteria andS31EqualTo(String value) {
            addCriterion("S31 =", value, "s31");
            return (Criteria) this;
        }

        public Criteria andS31NotEqualTo(String value) {
            addCriterion("S31 <>", value, "s31");
            return (Criteria) this;
        }

        public Criteria andS31GreaterThan(String value) {
            addCriterion("S31 >", value, "s31");
            return (Criteria) this;
        }

        public Criteria andS31GreaterThanOrEqualTo(String value) {
            addCriterion("S31 >=", value, "s31");
            return (Criteria) this;
        }

        public Criteria andS31LessThan(String value) {
            addCriterion("S31 <", value, "s31");
            return (Criteria) this;
        }

        public Criteria andS31LessThanOrEqualTo(String value) {
            addCriterion("S31 <=", value, "s31");
            return (Criteria) this;
        }

        public Criteria andS31Like(String value) {
            addCriterion("S31 like", value, "s31");
            return (Criteria) this;
        }

        public Criteria andS31NotLike(String value) {
            addCriterion("S31 not like", value, "s31");
            return (Criteria) this;
        }

        public Criteria andS31In(List<String> values) {
            addCriterion("S31 in", values, "s31");
            return (Criteria) this;
        }

        public Criteria andS31NotIn(List<String> values) {
            addCriterion("S31 not in", values, "s31");
            return (Criteria) this;
        }

        public Criteria andS31Between(String value1, String value2) {
            addCriterion("S31 between", value1, value2, "s31");
            return (Criteria) this;
        }

        public Criteria andS31NotBetween(String value1, String value2) {
            addCriterion("S31 not between", value1, value2, "s31");
            return (Criteria) this;
        }

        public Criteria andS32IsNull() {
            addCriterion("S32 is null");
            return (Criteria) this;
        }

        public Criteria andS32IsNotNull() {
            addCriterion("S32 is not null");
            return (Criteria) this;
        }

        public Criteria andS32EqualTo(String value) {
            addCriterion("S32 =", value, "s32");
            return (Criteria) this;
        }

        public Criteria andS32NotEqualTo(String value) {
            addCriterion("S32 <>", value, "s32");
            return (Criteria) this;
        }

        public Criteria andS32GreaterThan(String value) {
            addCriterion("S32 >", value, "s32");
            return (Criteria) this;
        }

        public Criteria andS32GreaterThanOrEqualTo(String value) {
            addCriterion("S32 >=", value, "s32");
            return (Criteria) this;
        }

        public Criteria andS32LessThan(String value) {
            addCriterion("S32 <", value, "s32");
            return (Criteria) this;
        }

        public Criteria andS32LessThanOrEqualTo(String value) {
            addCriterion("S32 <=", value, "s32");
            return (Criteria) this;
        }

        public Criteria andS32Like(String value) {
            addCriterion("S32 like", value, "s32");
            return (Criteria) this;
        }

        public Criteria andS32NotLike(String value) {
            addCriterion("S32 not like", value, "s32");
            return (Criteria) this;
        }

        public Criteria andS32In(List<String> values) {
            addCriterion("S32 in", values, "s32");
            return (Criteria) this;
        }

        public Criteria andS32NotIn(List<String> values) {
            addCriterion("S32 not in", values, "s32");
            return (Criteria) this;
        }

        public Criteria andS32Between(String value1, String value2) {
            addCriterion("S32 between", value1, value2, "s32");
            return (Criteria) this;
        }

        public Criteria andS32NotBetween(String value1, String value2) {
            addCriterion("S32 not between", value1, value2, "s32");
            return (Criteria) this;
        }

        public Criteria andS33IsNull() {
            addCriterion("S33 is null");
            return (Criteria) this;
        }

        public Criteria andS33IsNotNull() {
            addCriterion("S33 is not null");
            return (Criteria) this;
        }

        public Criteria andS33EqualTo(String value) {
            addCriterion("S33 =", value, "s33");
            return (Criteria) this;
        }

        public Criteria andS33NotEqualTo(String value) {
            addCriterion("S33 <>", value, "s33");
            return (Criteria) this;
        }

        public Criteria andS33GreaterThan(String value) {
            addCriterion("S33 >", value, "s33");
            return (Criteria) this;
        }

        public Criteria andS33GreaterThanOrEqualTo(String value) {
            addCriterion("S33 >=", value, "s33");
            return (Criteria) this;
        }

        public Criteria andS33LessThan(String value) {
            addCriterion("S33 <", value, "s33");
            return (Criteria) this;
        }

        public Criteria andS33LessThanOrEqualTo(String value) {
            addCriterion("S33 <=", value, "s33");
            return (Criteria) this;
        }

        public Criteria andS33Like(String value) {
            addCriterion("S33 like", value, "s33");
            return (Criteria) this;
        }

        public Criteria andS33NotLike(String value) {
            addCriterion("S33 not like", value, "s33");
            return (Criteria) this;
        }

        public Criteria andS33In(List<String> values) {
            addCriterion("S33 in", values, "s33");
            return (Criteria) this;
        }

        public Criteria andS33NotIn(List<String> values) {
            addCriterion("S33 not in", values, "s33");
            return (Criteria) this;
        }

        public Criteria andS33Between(String value1, String value2) {
            addCriterion("S33 between", value1, value2, "s33");
            return (Criteria) this;
        }

        public Criteria andS33NotBetween(String value1, String value2) {
            addCriterion("S33 not between", value1, value2, "s33");
            return (Criteria) this;
        }

        public Criteria andS34IsNull() {
            addCriterion("S34 is null");
            return (Criteria) this;
        }

        public Criteria andS34IsNotNull() {
            addCriterion("S34 is not null");
            return (Criteria) this;
        }

        public Criteria andS34EqualTo(String value) {
            addCriterion("S34 =", value, "s34");
            return (Criteria) this;
        }

        public Criteria andS34NotEqualTo(String value) {
            addCriterion("S34 <>", value, "s34");
            return (Criteria) this;
        }

        public Criteria andS34GreaterThan(String value) {
            addCriterion("S34 >", value, "s34");
            return (Criteria) this;
        }

        public Criteria andS34GreaterThanOrEqualTo(String value) {
            addCriterion("S34 >=", value, "s34");
            return (Criteria) this;
        }

        public Criteria andS34LessThan(String value) {
            addCriterion("S34 <", value, "s34");
            return (Criteria) this;
        }

        public Criteria andS34LessThanOrEqualTo(String value) {
            addCriterion("S34 <=", value, "s34");
            return (Criteria) this;
        }

        public Criteria andS34Like(String value) {
            addCriterion("S34 like", value, "s34");
            return (Criteria) this;
        }

        public Criteria andS34NotLike(String value) {
            addCriterion("S34 not like", value, "s34");
            return (Criteria) this;
        }

        public Criteria andS34In(List<String> values) {
            addCriterion("S34 in", values, "s34");
            return (Criteria) this;
        }

        public Criteria andS34NotIn(List<String> values) {
            addCriterion("S34 not in", values, "s34");
            return (Criteria) this;
        }

        public Criteria andS34Between(String value1, String value2) {
            addCriterion("S34 between", value1, value2, "s34");
            return (Criteria) this;
        }

        public Criteria andS34NotBetween(String value1, String value2) {
            addCriterion("S34 not between", value1, value2, "s34");
            return (Criteria) this;
        }

        public Criteria andS35IsNull() {
            addCriterion("S35 is null");
            return (Criteria) this;
        }

        public Criteria andS35IsNotNull() {
            addCriterion("S35 is not null");
            return (Criteria) this;
        }

        public Criteria andS35EqualTo(String value) {
            addCriterion("S35 =", value, "s35");
            return (Criteria) this;
        }

        public Criteria andS35NotEqualTo(String value) {
            addCriterion("S35 <>", value, "s35");
            return (Criteria) this;
        }

        public Criteria andS35GreaterThan(String value) {
            addCriterion("S35 >", value, "s35");
            return (Criteria) this;
        }

        public Criteria andS35GreaterThanOrEqualTo(String value) {
            addCriterion("S35 >=", value, "s35");
            return (Criteria) this;
        }

        public Criteria andS35LessThan(String value) {
            addCriterion("S35 <", value, "s35");
            return (Criteria) this;
        }

        public Criteria andS35LessThanOrEqualTo(String value) {
            addCriterion("S35 <=", value, "s35");
            return (Criteria) this;
        }

        public Criteria andS35Like(String value) {
            addCriterion("S35 like", value, "s35");
            return (Criteria) this;
        }

        public Criteria andS35NotLike(String value) {
            addCriterion("S35 not like", value, "s35");
            return (Criteria) this;
        }

        public Criteria andS35In(List<String> values) {
            addCriterion("S35 in", values, "s35");
            return (Criteria) this;
        }

        public Criteria andS35NotIn(List<String> values) {
            addCriterion("S35 not in", values, "s35");
            return (Criteria) this;
        }

        public Criteria andS35Between(String value1, String value2) {
            addCriterion("S35 between", value1, value2, "s35");
            return (Criteria) this;
        }

        public Criteria andS35NotBetween(String value1, String value2) {
            addCriterion("S35 not between", value1, value2, "s35");
            return (Criteria) this;
        }

        public Criteria andS36IsNull() {
            addCriterion("S36 is null");
            return (Criteria) this;
        }

        public Criteria andS36IsNotNull() {
            addCriterion("S36 is not null");
            return (Criteria) this;
        }

        public Criteria andS36EqualTo(String value) {
            addCriterion("S36 =", value, "s36");
            return (Criteria) this;
        }

        public Criteria andS36NotEqualTo(String value) {
            addCriterion("S36 <>", value, "s36");
            return (Criteria) this;
        }

        public Criteria andS36GreaterThan(String value) {
            addCriterion("S36 >", value, "s36");
            return (Criteria) this;
        }

        public Criteria andS36GreaterThanOrEqualTo(String value) {
            addCriterion("S36 >=", value, "s36");
            return (Criteria) this;
        }

        public Criteria andS36LessThan(String value) {
            addCriterion("S36 <", value, "s36");
            return (Criteria) this;
        }

        public Criteria andS36LessThanOrEqualTo(String value) {
            addCriterion("S36 <=", value, "s36");
            return (Criteria) this;
        }

        public Criteria andS36Like(String value) {
            addCriterion("S36 like", value, "s36");
            return (Criteria) this;
        }

        public Criteria andS36NotLike(String value) {
            addCriterion("S36 not like", value, "s36");
            return (Criteria) this;
        }

        public Criteria andS36In(List<String> values) {
            addCriterion("S36 in", values, "s36");
            return (Criteria) this;
        }

        public Criteria andS36NotIn(List<String> values) {
            addCriterion("S36 not in", values, "s36");
            return (Criteria) this;
        }

        public Criteria andS36Between(String value1, String value2) {
            addCriterion("S36 between", value1, value2, "s36");
            return (Criteria) this;
        }

        public Criteria andS36NotBetween(String value1, String value2) {
            addCriterion("S36 not between", value1, value2, "s36");
            return (Criteria) this;
        }

        public Criteria andS37IsNull() {
            addCriterion("S37 is null");
            return (Criteria) this;
        }

        public Criteria andS37IsNotNull() {
            addCriterion("S37 is not null");
            return (Criteria) this;
        }

        public Criteria andS37EqualTo(String value) {
            addCriterion("S37 =", value, "s37");
            return (Criteria) this;
        }

        public Criteria andS37NotEqualTo(String value) {
            addCriterion("S37 <>", value, "s37");
            return (Criteria) this;
        }

        public Criteria andS37GreaterThan(String value) {
            addCriterion("S37 >", value, "s37");
            return (Criteria) this;
        }

        public Criteria andS37GreaterThanOrEqualTo(String value) {
            addCriterion("S37 >=", value, "s37");
            return (Criteria) this;
        }

        public Criteria andS37LessThan(String value) {
            addCriterion("S37 <", value, "s37");
            return (Criteria) this;
        }

        public Criteria andS37LessThanOrEqualTo(String value) {
            addCriterion("S37 <=", value, "s37");
            return (Criteria) this;
        }

        public Criteria andS37Like(String value) {
            addCriterion("S37 like", value, "s37");
            return (Criteria) this;
        }

        public Criteria andS37NotLike(String value) {
            addCriterion("S37 not like", value, "s37");
            return (Criteria) this;
        }

        public Criteria andS37In(List<String> values) {
            addCriterion("S37 in", values, "s37");
            return (Criteria) this;
        }

        public Criteria andS37NotIn(List<String> values) {
            addCriterion("S37 not in", values, "s37");
            return (Criteria) this;
        }

        public Criteria andS37Between(String value1, String value2) {
            addCriterion("S37 between", value1, value2, "s37");
            return (Criteria) this;
        }

        public Criteria andS37NotBetween(String value1, String value2) {
            addCriterion("S37 not between", value1, value2, "s37");
            return (Criteria) this;
        }

        public Criteria andS38IsNull() {
            addCriterion("S38 is null");
            return (Criteria) this;
        }

        public Criteria andS38IsNotNull() {
            addCriterion("S38 is not null");
            return (Criteria) this;
        }

        public Criteria andS38EqualTo(String value) {
            addCriterion("S38 =", value, "s38");
            return (Criteria) this;
        }

        public Criteria andS38NotEqualTo(String value) {
            addCriterion("S38 <>", value, "s38");
            return (Criteria) this;
        }

        public Criteria andS38GreaterThan(String value) {
            addCriterion("S38 >", value, "s38");
            return (Criteria) this;
        }

        public Criteria andS38GreaterThanOrEqualTo(String value) {
            addCriterion("S38 >=", value, "s38");
            return (Criteria) this;
        }

        public Criteria andS38LessThan(String value) {
            addCriterion("S38 <", value, "s38");
            return (Criteria) this;
        }

        public Criteria andS38LessThanOrEqualTo(String value) {
            addCriterion("S38 <=", value, "s38");
            return (Criteria) this;
        }

        public Criteria andS38Like(String value) {
            addCriterion("S38 like", value, "s38");
            return (Criteria) this;
        }

        public Criteria andS38NotLike(String value) {
            addCriterion("S38 not like", value, "s38");
            return (Criteria) this;
        }

        public Criteria andS38In(List<String> values) {
            addCriterion("S38 in", values, "s38");
            return (Criteria) this;
        }

        public Criteria andS38NotIn(List<String> values) {
            addCriterion("S38 not in", values, "s38");
            return (Criteria) this;
        }

        public Criteria andS38Between(String value1, String value2) {
            addCriterion("S38 between", value1, value2, "s38");
            return (Criteria) this;
        }

        public Criteria andS38NotBetween(String value1, String value2) {
            addCriterion("S38 not between", value1, value2, "s38");
            return (Criteria) this;
        }

        public Criteria andIskaizhanjuanmuIsNull() {
            addCriterion("ISKAIZHANJUANMU is null");
            return (Criteria) this;
        }

        public Criteria andIskaizhanjuanmuIsNotNull() {
            addCriterion("ISKAIZHANJUANMU is not null");
            return (Criteria) this;
        }

        public Criteria andIskaizhanjuanmuEqualTo(String value) {
            addCriterion("ISKAIZHANJUANMU =", value, "iskaizhanjuanmu");
            return (Criteria) this;
        }

        public Criteria andIskaizhanjuanmuNotEqualTo(String value) {
            addCriterion("ISKAIZHANJUANMU <>", value, "iskaizhanjuanmu");
            return (Criteria) this;
        }

        public Criteria andIskaizhanjuanmuGreaterThan(String value) {
            addCriterion("ISKAIZHANJUANMU >", value, "iskaizhanjuanmu");
            return (Criteria) this;
        }

        public Criteria andIskaizhanjuanmuGreaterThanOrEqualTo(String value) {
            addCriterion("ISKAIZHANJUANMU >=", value, "iskaizhanjuanmu");
            return (Criteria) this;
        }

        public Criteria andIskaizhanjuanmuLessThan(String value) {
            addCriterion("ISKAIZHANJUANMU <", value, "iskaizhanjuanmu");
            return (Criteria) this;
        }

        public Criteria andIskaizhanjuanmuLessThanOrEqualTo(String value) {
            addCriterion("ISKAIZHANJUANMU <=", value, "iskaizhanjuanmu");
            return (Criteria) this;
        }

        public Criteria andIskaizhanjuanmuLike(String value) {
            addCriterion("ISKAIZHANJUANMU like", value, "iskaizhanjuanmu");
            return (Criteria) this;
        }

        public Criteria andIskaizhanjuanmuNotLike(String value) {
            addCriterion("ISKAIZHANJUANMU not like", value, "iskaizhanjuanmu");
            return (Criteria) this;
        }

        public Criteria andIskaizhanjuanmuIn(List<String> values) {
            addCriterion("ISKAIZHANJUANMU in", values, "iskaizhanjuanmu");
            return (Criteria) this;
        }

        public Criteria andIskaizhanjuanmuNotIn(List<String> values) {
            addCriterion("ISKAIZHANJUANMU not in", values, "iskaizhanjuanmu");
            return (Criteria) this;
        }

        public Criteria andIskaizhanjuanmuBetween(String value1, String value2) {
            addCriterion("ISKAIZHANJUANMU between", value1, value2, "iskaizhanjuanmu");
            return (Criteria) this;
        }

        public Criteria andIskaizhanjuanmuNotBetween(String value1, String value2) {
            addCriterion("ISKAIZHANJUANMU not between", value1, value2, "iskaizhanjuanmu");
            return (Criteria) this;
        }

        public Criteria andIszhuanxiangshenjiIsNull() {
            addCriterion("ISZHUANXIANGSHENJI is null");
            return (Criteria) this;
        }

        public Criteria andIszhuanxiangshenjiIsNotNull() {
            addCriterion("ISZHUANXIANGSHENJI is not null");
            return (Criteria) this;
        }

        public Criteria andIszhuanxiangshenjiEqualTo(String value) {
            addCriterion("ISZHUANXIANGSHENJI =", value, "iszhuanxiangshenji");
            return (Criteria) this;
        }

        public Criteria andIszhuanxiangshenjiNotEqualTo(String value) {
            addCriterion("ISZHUANXIANGSHENJI <>", value, "iszhuanxiangshenji");
            return (Criteria) this;
        }

        public Criteria andIszhuanxiangshenjiGreaterThan(String value) {
            addCriterion("ISZHUANXIANGSHENJI >", value, "iszhuanxiangshenji");
            return (Criteria) this;
        }

        public Criteria andIszhuanxiangshenjiGreaterThanOrEqualTo(String value) {
            addCriterion("ISZHUANXIANGSHENJI >=", value, "iszhuanxiangshenji");
            return (Criteria) this;
        }

        public Criteria andIszhuanxiangshenjiLessThan(String value) {
            addCriterion("ISZHUANXIANGSHENJI <", value, "iszhuanxiangshenji");
            return (Criteria) this;
        }

        public Criteria andIszhuanxiangshenjiLessThanOrEqualTo(String value) {
            addCriterion("ISZHUANXIANGSHENJI <=", value, "iszhuanxiangshenji");
            return (Criteria) this;
        }

        public Criteria andIszhuanxiangshenjiLike(String value) {
            addCriterion("ISZHUANXIANGSHENJI like", value, "iszhuanxiangshenji");
            return (Criteria) this;
        }

        public Criteria andIszhuanxiangshenjiNotLike(String value) {
            addCriterion("ISZHUANXIANGSHENJI not like", value, "iszhuanxiangshenji");
            return (Criteria) this;
        }

        public Criteria andIszhuanxiangshenjiIn(List<String> values) {
            addCriterion("ISZHUANXIANGSHENJI in", values, "iszhuanxiangshenji");
            return (Criteria) this;
        }

        public Criteria andIszhuanxiangshenjiNotIn(List<String> values) {
            addCriterion("ISZHUANXIANGSHENJI not in", values, "iszhuanxiangshenji");
            return (Criteria) this;
        }

        public Criteria andIszhuanxiangshenjiBetween(String value1, String value2) {
            addCriterion("ISZHUANXIANGSHENJI between", value1, value2, "iszhuanxiangshenji");
            return (Criteria) this;
        }

        public Criteria andIszhuanxiangshenjiNotBetween(String value1, String value2) {
            addCriterion("ISZHUANXIANGSHENJI not between", value1, value2, "iszhuanxiangshenji");
            return (Criteria) this;
        }

        public Criteria andMjdateIsNull() {
            addCriterion("MJDATE is null");
            return (Criteria) this;
        }

        public Criteria andMjdateIsNotNull() {
            addCriterion("MJDATE is not null");
            return (Criteria) this;
        }

        public Criteria andMjdateEqualTo(Date value) {
            addCriterion("MJDATE =", value, "mjdate");
            return (Criteria) this;
        }

        public Criteria andMjdateNotEqualTo(Date value) {
            addCriterion("MJDATE <>", value, "mjdate");
            return (Criteria) this;
        }

        public Criteria andMjdateGreaterThan(Date value) {
            addCriterion("MJDATE >", value, "mjdate");
            return (Criteria) this;
        }

        public Criteria andMjdateGreaterThanOrEqualTo(Date value) {
            addCriterion("MJDATE >=", value, "mjdate");
            return (Criteria) this;
        }

        public Criteria andMjdateLessThan(Date value) {
            addCriterion("MJDATE <", value, "mjdate");
            return (Criteria) this;
        }

        public Criteria andMjdateLessThanOrEqualTo(Date value) {
            addCriterion("MJDATE <=", value, "mjdate");
            return (Criteria) this;
        }

        public Criteria andMjdateIn(List<Date> values) {
            addCriterion("MJDATE in", values, "mjdate");
            return (Criteria) this;
        }

        public Criteria andMjdateNotIn(List<Date> values) {
            addCriterion("MJDATE not in", values, "mjdate");
            return (Criteria) this;
        }

        public Criteria andMjdateBetween(Date value1, Date value2) {
            addCriterion("MJDATE between", value1, value2, "mjdate");
            return (Criteria) this;
        }

        public Criteria andMjdateNotBetween(Date value1, Date value2) {
            addCriterion("MJDATE not between", value1, value2, "mjdate");
            return (Criteria) this;
        }

        public Criteria andIszizhuhuodongIsNull() {
            addCriterion("ISZIZHUHUODONG is null");
            return (Criteria) this;
        }

        public Criteria andIszizhuhuodongIsNotNull() {
            addCriterion("ISZIZHUHUODONG is not null");
            return (Criteria) this;
        }

        public Criteria andIszizhuhuodongEqualTo(String value) {
            addCriterion("ISZIZHUHUODONG =", value, "iszizhuhuodong");
            return (Criteria) this;
        }

        public Criteria andIszizhuhuodongNotEqualTo(String value) {
            addCriterion("ISZIZHUHUODONG <>", value, "iszizhuhuodong");
            return (Criteria) this;
        }

        public Criteria andIszizhuhuodongGreaterThan(String value) {
            addCriterion("ISZIZHUHUODONG >", value, "iszizhuhuodong");
            return (Criteria) this;
        }

        public Criteria andIszizhuhuodongGreaterThanOrEqualTo(String value) {
            addCriterion("ISZIZHUHUODONG >=", value, "iszizhuhuodong");
            return (Criteria) this;
        }

        public Criteria andIszizhuhuodongLessThan(String value) {
            addCriterion("ISZIZHUHUODONG <", value, "iszizhuhuodong");
            return (Criteria) this;
        }

        public Criteria andIszizhuhuodongLessThanOrEqualTo(String value) {
            addCriterion("ISZIZHUHUODONG <=", value, "iszizhuhuodong");
            return (Criteria) this;
        }

        public Criteria andIszizhuhuodongLike(String value) {
            addCriterion("ISZIZHUHUODONG like", value, "iszizhuhuodong");
            return (Criteria) this;
        }

        public Criteria andIszizhuhuodongNotLike(String value) {
            addCriterion("ISZIZHUHUODONG not like", value, "iszizhuhuodong");
            return (Criteria) this;
        }

        public Criteria andIszizhuhuodongIn(List<String> values) {
            addCriterion("ISZIZHUHUODONG in", values, "iszizhuhuodong");
            return (Criteria) this;
        }

        public Criteria andIszizhuhuodongNotIn(List<String> values) {
            addCriterion("ISZIZHUHUODONG not in", values, "iszizhuhuodong");
            return (Criteria) this;
        }

        public Criteria andIszizhuhuodongBetween(String value1, String value2) {
            addCriterion("ISZIZHUHUODONG between", value1, value2, "iszizhuhuodong");
            return (Criteria) this;
        }

        public Criteria andIszizhuhuodongNotBetween(String value1, String value2) {
            addCriterion("ISZIZHUHUODONG not between", value1, value2, "iszizhuhuodong");
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