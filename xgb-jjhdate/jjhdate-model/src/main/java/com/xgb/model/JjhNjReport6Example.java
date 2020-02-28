package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JjhNjReport6Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JjhNjReport6Example() {
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

        public Criteria andJieshoujuanzengIsNull() {
            addCriterion("JIESHOUJUANZENG is null");
            return (Criteria) this;
        }

        public Criteria andJieshoujuanzengIsNotNull() {
            addCriterion("JIESHOUJUANZENG is not null");
            return (Criteria) this;
        }

        public Criteria andJieshoujuanzengEqualTo(BigDecimal value) {
            addCriterion("JIESHOUJUANZENG =", value, "jieshoujuanzeng");
            return (Criteria) this;
        }

        public Criteria andJieshoujuanzengNotEqualTo(BigDecimal value) {
            addCriterion("JIESHOUJUANZENG <>", value, "jieshoujuanzeng");
            return (Criteria) this;
        }

        public Criteria andJieshoujuanzengGreaterThan(BigDecimal value) {
            addCriterion("JIESHOUJUANZENG >", value, "jieshoujuanzeng");
            return (Criteria) this;
        }

        public Criteria andJieshoujuanzengGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JIESHOUJUANZENG >=", value, "jieshoujuanzeng");
            return (Criteria) this;
        }

        public Criteria andJieshoujuanzengLessThan(BigDecimal value) {
            addCriterion("JIESHOUJUANZENG <", value, "jieshoujuanzeng");
            return (Criteria) this;
        }

        public Criteria andJieshoujuanzengLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JIESHOUJUANZENG <=", value, "jieshoujuanzeng");
            return (Criteria) this;
        }

        public Criteria andJieshoujuanzengIn(List<BigDecimal> values) {
            addCriterion("JIESHOUJUANZENG in", values, "jieshoujuanzeng");
            return (Criteria) this;
        }

        public Criteria andJieshoujuanzengNotIn(List<BigDecimal> values) {
            addCriterion("JIESHOUJUANZENG not in", values, "jieshoujuanzeng");
            return (Criteria) this;
        }

        public Criteria andJieshoujuanzengBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JIESHOUJUANZENG between", value1, value2, "jieshoujuanzeng");
            return (Criteria) this;
        }

        public Criteria andJieshoujuanzengNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JIESHOUJUANZENG not between", value1, value2, "jieshoujuanzeng");
            return (Criteria) this;
        }

        public Criteria andShouquhuifeiIsNull() {
            addCriterion("SHOUQUHUIFEI is null");
            return (Criteria) this;
        }

        public Criteria andShouquhuifeiIsNotNull() {
            addCriterion("SHOUQUHUIFEI is not null");
            return (Criteria) this;
        }

        public Criteria andShouquhuifeiEqualTo(BigDecimal value) {
            addCriterion("SHOUQUHUIFEI =", value, "shouquhuifei");
            return (Criteria) this;
        }

        public Criteria andShouquhuifeiNotEqualTo(BigDecimal value) {
            addCriterion("SHOUQUHUIFEI <>", value, "shouquhuifei");
            return (Criteria) this;
        }

        public Criteria andShouquhuifeiGreaterThan(BigDecimal value) {
            addCriterion("SHOUQUHUIFEI >", value, "shouquhuifei");
            return (Criteria) this;
        }

        public Criteria andShouquhuifeiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOUQUHUIFEI >=", value, "shouquhuifei");
            return (Criteria) this;
        }

        public Criteria andShouquhuifeiLessThan(BigDecimal value) {
            addCriterion("SHOUQUHUIFEI <", value, "shouquhuifei");
            return (Criteria) this;
        }

        public Criteria andShouquhuifeiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOUQUHUIFEI <=", value, "shouquhuifei");
            return (Criteria) this;
        }

        public Criteria andShouquhuifeiIn(List<BigDecimal> values) {
            addCriterion("SHOUQUHUIFEI in", values, "shouquhuifei");
            return (Criteria) this;
        }

        public Criteria andShouquhuifeiNotIn(List<BigDecimal> values) {
            addCriterion("SHOUQUHUIFEI not in", values, "shouquhuifei");
            return (Criteria) this;
        }

        public Criteria andShouquhuifeiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOUQUHUIFEI between", value1, value2, "shouquhuifei");
            return (Criteria) this;
        }

        public Criteria andShouquhuifeiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOUQUHUIFEI not between", value1, value2, "shouquhuifei");
            return (Criteria) this;
        }

        public Criteria andTigongfuwuIsNull() {
            addCriterion("TIGONGFUWU is null");
            return (Criteria) this;
        }

        public Criteria andTigongfuwuIsNotNull() {
            addCriterion("TIGONGFUWU is not null");
            return (Criteria) this;
        }

        public Criteria andTigongfuwuEqualTo(BigDecimal value) {
            addCriterion("TIGONGFUWU =", value, "tigongfuwu");
            return (Criteria) this;
        }

        public Criteria andTigongfuwuNotEqualTo(BigDecimal value) {
            addCriterion("TIGONGFUWU <>", value, "tigongfuwu");
            return (Criteria) this;
        }

        public Criteria andTigongfuwuGreaterThan(BigDecimal value) {
            addCriterion("TIGONGFUWU >", value, "tigongfuwu");
            return (Criteria) this;
        }

        public Criteria andTigongfuwuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TIGONGFUWU >=", value, "tigongfuwu");
            return (Criteria) this;
        }

        public Criteria andTigongfuwuLessThan(BigDecimal value) {
            addCriterion("TIGONGFUWU <", value, "tigongfuwu");
            return (Criteria) this;
        }

        public Criteria andTigongfuwuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TIGONGFUWU <=", value, "tigongfuwu");
            return (Criteria) this;
        }

        public Criteria andTigongfuwuIn(List<BigDecimal> values) {
            addCriterion("TIGONGFUWU in", values, "tigongfuwu");
            return (Criteria) this;
        }

        public Criteria andTigongfuwuNotIn(List<BigDecimal> values) {
            addCriterion("TIGONGFUWU not in", values, "tigongfuwu");
            return (Criteria) this;
        }

        public Criteria andTigongfuwuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TIGONGFUWU between", value1, value2, "tigongfuwu");
            return (Criteria) this;
        }

        public Criteria andTigongfuwuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TIGONGFUWU not between", value1, value2, "tigongfuwu");
            return (Criteria) this;
        }

        public Criteria andXiaoshoushangpinIsNull() {
            addCriterion("XIAOSHOUSHANGPIN is null");
            return (Criteria) this;
        }

        public Criteria andXiaoshoushangpinIsNotNull() {
            addCriterion("XIAOSHOUSHANGPIN is not null");
            return (Criteria) this;
        }

        public Criteria andXiaoshoushangpinEqualTo(BigDecimal value) {
            addCriterion("XIAOSHOUSHANGPIN =", value, "xiaoshoushangpin");
            return (Criteria) this;
        }

        public Criteria andXiaoshoushangpinNotEqualTo(BigDecimal value) {
            addCriterion("XIAOSHOUSHANGPIN <>", value, "xiaoshoushangpin");
            return (Criteria) this;
        }

        public Criteria andXiaoshoushangpinGreaterThan(BigDecimal value) {
            addCriterion("XIAOSHOUSHANGPIN >", value, "xiaoshoushangpin");
            return (Criteria) this;
        }

        public Criteria andXiaoshoushangpinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XIAOSHOUSHANGPIN >=", value, "xiaoshoushangpin");
            return (Criteria) this;
        }

        public Criteria andXiaoshoushangpinLessThan(BigDecimal value) {
            addCriterion("XIAOSHOUSHANGPIN <", value, "xiaoshoushangpin");
            return (Criteria) this;
        }

        public Criteria andXiaoshoushangpinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XIAOSHOUSHANGPIN <=", value, "xiaoshoushangpin");
            return (Criteria) this;
        }

        public Criteria andXiaoshoushangpinIn(List<BigDecimal> values) {
            addCriterion("XIAOSHOUSHANGPIN in", values, "xiaoshoushangpin");
            return (Criteria) this;
        }

        public Criteria andXiaoshoushangpinNotIn(List<BigDecimal> values) {
            addCriterion("XIAOSHOUSHANGPIN not in", values, "xiaoshoushangpin");
            return (Criteria) this;
        }

        public Criteria andXiaoshoushangpinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIAOSHOUSHANGPIN between", value1, value2, "xiaoshoushangpin");
            return (Criteria) this;
        }

        public Criteria andXiaoshoushangpinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIAOSHOUSHANGPIN not between", value1, value2, "xiaoshoushangpin");
            return (Criteria) this;
        }

        public Criteria andZhengfubuzhuIsNull() {
            addCriterion("ZHENGFUBUZHU is null");
            return (Criteria) this;
        }

        public Criteria andZhengfubuzhuIsNotNull() {
            addCriterion("ZHENGFUBUZHU is not null");
            return (Criteria) this;
        }

        public Criteria andZhengfubuzhuEqualTo(BigDecimal value) {
            addCriterion("ZHENGFUBUZHU =", value, "zhengfubuzhu");
            return (Criteria) this;
        }

        public Criteria andZhengfubuzhuNotEqualTo(BigDecimal value) {
            addCriterion("ZHENGFUBUZHU <>", value, "zhengfubuzhu");
            return (Criteria) this;
        }

        public Criteria andZhengfubuzhuGreaterThan(BigDecimal value) {
            addCriterion("ZHENGFUBUZHU >", value, "zhengfubuzhu");
            return (Criteria) this;
        }

        public Criteria andZhengfubuzhuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHENGFUBUZHU >=", value, "zhengfubuzhu");
            return (Criteria) this;
        }

        public Criteria andZhengfubuzhuLessThan(BigDecimal value) {
            addCriterion("ZHENGFUBUZHU <", value, "zhengfubuzhu");
            return (Criteria) this;
        }

        public Criteria andZhengfubuzhuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHENGFUBUZHU <=", value, "zhengfubuzhu");
            return (Criteria) this;
        }

        public Criteria andZhengfubuzhuIn(List<BigDecimal> values) {
            addCriterion("ZHENGFUBUZHU in", values, "zhengfubuzhu");
            return (Criteria) this;
        }

        public Criteria andZhengfubuzhuNotIn(List<BigDecimal> values) {
            addCriterion("ZHENGFUBUZHU not in", values, "zhengfubuzhu");
            return (Criteria) this;
        }

        public Criteria andZhengfubuzhuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHENGFUBUZHU between", value1, value2, "zhengfubuzhu");
            return (Criteria) this;
        }

        public Criteria andZhengfubuzhuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHENGFUBUZHU not between", value1, value2, "zhengfubuzhu");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitayewuIsNull() {
            addCriterion("SHOUDAOQITAYEWU is null");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitayewuIsNotNull() {
            addCriterion("SHOUDAOQITAYEWU is not null");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitayewuEqualTo(BigDecimal value) {
            addCriterion("SHOUDAOQITAYEWU =", value, "shoudaoqitayewu");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitayewuNotEqualTo(BigDecimal value) {
            addCriterion("SHOUDAOQITAYEWU <>", value, "shoudaoqitayewu");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitayewuGreaterThan(BigDecimal value) {
            addCriterion("SHOUDAOQITAYEWU >", value, "shoudaoqitayewu");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitayewuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOUDAOQITAYEWU >=", value, "shoudaoqitayewu");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitayewuLessThan(BigDecimal value) {
            addCriterion("SHOUDAOQITAYEWU <", value, "shoudaoqitayewu");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitayewuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOUDAOQITAYEWU <=", value, "shoudaoqitayewu");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitayewuIn(List<BigDecimal> values) {
            addCriterion("SHOUDAOQITAYEWU in", values, "shoudaoqitayewu");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitayewuNotIn(List<BigDecimal> values) {
            addCriterion("SHOUDAOQITAYEWU not in", values, "shoudaoqitayewu");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitayewuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOUDAOQITAYEWU between", value1, value2, "shoudaoqitayewu");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitayewuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOUDAOQITAYEWU not between", value1, value2, "shoudaoqitayewu");
            return (Criteria) this;
        }

        public Criteria andYewuliuruxiaojiIsNull() {
            addCriterion("YEWULIURUXIAOJI is null");
            return (Criteria) this;
        }

        public Criteria andYewuliuruxiaojiIsNotNull() {
            addCriterion("YEWULIURUXIAOJI is not null");
            return (Criteria) this;
        }

        public Criteria andYewuliuruxiaojiEqualTo(BigDecimal value) {
            addCriterion("YEWULIURUXIAOJI =", value, "yewuliuruxiaoji");
            return (Criteria) this;
        }

        public Criteria andYewuliuruxiaojiNotEqualTo(BigDecimal value) {
            addCriterion("YEWULIURUXIAOJI <>", value, "yewuliuruxiaoji");
            return (Criteria) this;
        }

        public Criteria andYewuliuruxiaojiGreaterThan(BigDecimal value) {
            addCriterion("YEWULIURUXIAOJI >", value, "yewuliuruxiaoji");
            return (Criteria) this;
        }

        public Criteria andYewuliuruxiaojiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YEWULIURUXIAOJI >=", value, "yewuliuruxiaoji");
            return (Criteria) this;
        }

        public Criteria andYewuliuruxiaojiLessThan(BigDecimal value) {
            addCriterion("YEWULIURUXIAOJI <", value, "yewuliuruxiaoji");
            return (Criteria) this;
        }

        public Criteria andYewuliuruxiaojiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YEWULIURUXIAOJI <=", value, "yewuliuruxiaoji");
            return (Criteria) this;
        }

        public Criteria andYewuliuruxiaojiIn(List<BigDecimal> values) {
            addCriterion("YEWULIURUXIAOJI in", values, "yewuliuruxiaoji");
            return (Criteria) this;
        }

        public Criteria andYewuliuruxiaojiNotIn(List<BigDecimal> values) {
            addCriterion("YEWULIURUXIAOJI not in", values, "yewuliuruxiaoji");
            return (Criteria) this;
        }

        public Criteria andYewuliuruxiaojiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YEWULIURUXIAOJI between", value1, value2, "yewuliuruxiaoji");
            return (Criteria) this;
        }

        public Criteria andYewuliuruxiaojiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YEWULIURUXIAOJI not between", value1, value2, "yewuliuruxiaoji");
            return (Criteria) this;
        }

        public Criteria andJuanzengzhifuIsNull() {
            addCriterion("JUANZENGZHIFU is null");
            return (Criteria) this;
        }

        public Criteria andJuanzengzhifuIsNotNull() {
            addCriterion("JUANZENGZHIFU is not null");
            return (Criteria) this;
        }

        public Criteria andJuanzengzhifuEqualTo(BigDecimal value) {
            addCriterion("JUANZENGZHIFU =", value, "juanzengzhifu");
            return (Criteria) this;
        }

        public Criteria andJuanzengzhifuNotEqualTo(BigDecimal value) {
            addCriterion("JUANZENGZHIFU <>", value, "juanzengzhifu");
            return (Criteria) this;
        }

        public Criteria andJuanzengzhifuGreaterThan(BigDecimal value) {
            addCriterion("JUANZENGZHIFU >", value, "juanzengzhifu");
            return (Criteria) this;
        }

        public Criteria andJuanzengzhifuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JUANZENGZHIFU >=", value, "juanzengzhifu");
            return (Criteria) this;
        }

        public Criteria andJuanzengzhifuLessThan(BigDecimal value) {
            addCriterion("JUANZENGZHIFU <", value, "juanzengzhifu");
            return (Criteria) this;
        }

        public Criteria andJuanzengzhifuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JUANZENGZHIFU <=", value, "juanzengzhifu");
            return (Criteria) this;
        }

        public Criteria andJuanzengzhifuIn(List<BigDecimal> values) {
            addCriterion("JUANZENGZHIFU in", values, "juanzengzhifu");
            return (Criteria) this;
        }

        public Criteria andJuanzengzhifuNotIn(List<BigDecimal> values) {
            addCriterion("JUANZENGZHIFU not in", values, "juanzengzhifu");
            return (Criteria) this;
        }

        public Criteria andJuanzengzhifuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JUANZENGZHIFU between", value1, value2, "juanzengzhifu");
            return (Criteria) this;
        }

        public Criteria andJuanzengzhifuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JUANZENGZHIFU not between", value1, value2, "juanzengzhifu");
            return (Criteria) this;
        }

        public Criteria andZhifuyuangongIsNull() {
            addCriterion("ZHIFUYUANGONG is null");
            return (Criteria) this;
        }

        public Criteria andZhifuyuangongIsNotNull() {
            addCriterion("ZHIFUYUANGONG is not null");
            return (Criteria) this;
        }

        public Criteria andZhifuyuangongEqualTo(BigDecimal value) {
            addCriterion("ZHIFUYUANGONG =", value, "zhifuyuangong");
            return (Criteria) this;
        }

        public Criteria andZhifuyuangongNotEqualTo(BigDecimal value) {
            addCriterion("ZHIFUYUANGONG <>", value, "zhifuyuangong");
            return (Criteria) this;
        }

        public Criteria andZhifuyuangongGreaterThan(BigDecimal value) {
            addCriterion("ZHIFUYUANGONG >", value, "zhifuyuangong");
            return (Criteria) this;
        }

        public Criteria andZhifuyuangongGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHIFUYUANGONG >=", value, "zhifuyuangong");
            return (Criteria) this;
        }

        public Criteria andZhifuyuangongLessThan(BigDecimal value) {
            addCriterion("ZHIFUYUANGONG <", value, "zhifuyuangong");
            return (Criteria) this;
        }

        public Criteria andZhifuyuangongLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHIFUYUANGONG <=", value, "zhifuyuangong");
            return (Criteria) this;
        }

        public Criteria andZhifuyuangongIn(List<BigDecimal> values) {
            addCriterion("ZHIFUYUANGONG in", values, "zhifuyuangong");
            return (Criteria) this;
        }

        public Criteria andZhifuyuangongNotIn(List<BigDecimal> values) {
            addCriterion("ZHIFUYUANGONG not in", values, "zhifuyuangong");
            return (Criteria) this;
        }

        public Criteria andZhifuyuangongBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHIFUYUANGONG between", value1, value2, "zhifuyuangong");
            return (Criteria) this;
        }

        public Criteria andZhifuyuangongNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHIFUYUANGONG not between", value1, value2, "zhifuyuangong");
            return (Criteria) this;
        }

        public Criteria andShangpinfuwuzhifuIsNull() {
            addCriterion("SHANGPINFUWUZHIFU is null");
            return (Criteria) this;
        }

        public Criteria andShangpinfuwuzhifuIsNotNull() {
            addCriterion("SHANGPINFUWUZHIFU is not null");
            return (Criteria) this;
        }

        public Criteria andShangpinfuwuzhifuEqualTo(BigDecimal value) {
            addCriterion("SHANGPINFUWUZHIFU =", value, "shangpinfuwuzhifu");
            return (Criteria) this;
        }

        public Criteria andShangpinfuwuzhifuNotEqualTo(BigDecimal value) {
            addCriterion("SHANGPINFUWUZHIFU <>", value, "shangpinfuwuzhifu");
            return (Criteria) this;
        }

        public Criteria andShangpinfuwuzhifuGreaterThan(BigDecimal value) {
            addCriterion("SHANGPINFUWUZHIFU >", value, "shangpinfuwuzhifu");
            return (Criteria) this;
        }

        public Criteria andShangpinfuwuzhifuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHANGPINFUWUZHIFU >=", value, "shangpinfuwuzhifu");
            return (Criteria) this;
        }

        public Criteria andShangpinfuwuzhifuLessThan(BigDecimal value) {
            addCriterion("SHANGPINFUWUZHIFU <", value, "shangpinfuwuzhifu");
            return (Criteria) this;
        }

        public Criteria andShangpinfuwuzhifuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHANGPINFUWUZHIFU <=", value, "shangpinfuwuzhifu");
            return (Criteria) this;
        }

        public Criteria andShangpinfuwuzhifuIn(List<BigDecimal> values) {
            addCriterion("SHANGPINFUWUZHIFU in", values, "shangpinfuwuzhifu");
            return (Criteria) this;
        }

        public Criteria andShangpinfuwuzhifuNotIn(List<BigDecimal> values) {
            addCriterion("SHANGPINFUWUZHIFU not in", values, "shangpinfuwuzhifu");
            return (Criteria) this;
        }

        public Criteria andShangpinfuwuzhifuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHANGPINFUWUZHIFU between", value1, value2, "shangpinfuwuzhifu");
            return (Criteria) this;
        }

        public Criteria andShangpinfuwuzhifuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHANGPINFUWUZHIFU not between", value1, value2, "shangpinfuwuzhifu");
            return (Criteria) this;
        }

        public Criteria andZhifuqitayewuIsNull() {
            addCriterion("ZHIFUQITAYEWU is null");
            return (Criteria) this;
        }

        public Criteria andZhifuqitayewuIsNotNull() {
            addCriterion("ZHIFUQITAYEWU is not null");
            return (Criteria) this;
        }

        public Criteria andZhifuqitayewuEqualTo(BigDecimal value) {
            addCriterion("ZHIFUQITAYEWU =", value, "zhifuqitayewu");
            return (Criteria) this;
        }

        public Criteria andZhifuqitayewuNotEqualTo(BigDecimal value) {
            addCriterion("ZHIFUQITAYEWU <>", value, "zhifuqitayewu");
            return (Criteria) this;
        }

        public Criteria andZhifuqitayewuGreaterThan(BigDecimal value) {
            addCriterion("ZHIFUQITAYEWU >", value, "zhifuqitayewu");
            return (Criteria) this;
        }

        public Criteria andZhifuqitayewuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHIFUQITAYEWU >=", value, "zhifuqitayewu");
            return (Criteria) this;
        }

        public Criteria andZhifuqitayewuLessThan(BigDecimal value) {
            addCriterion("ZHIFUQITAYEWU <", value, "zhifuqitayewu");
            return (Criteria) this;
        }

        public Criteria andZhifuqitayewuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHIFUQITAYEWU <=", value, "zhifuqitayewu");
            return (Criteria) this;
        }

        public Criteria andZhifuqitayewuIn(List<BigDecimal> values) {
            addCriterion("ZHIFUQITAYEWU in", values, "zhifuqitayewu");
            return (Criteria) this;
        }

        public Criteria andZhifuqitayewuNotIn(List<BigDecimal> values) {
            addCriterion("ZHIFUQITAYEWU not in", values, "zhifuqitayewu");
            return (Criteria) this;
        }

        public Criteria andZhifuqitayewuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHIFUQITAYEWU between", value1, value2, "zhifuqitayewu");
            return (Criteria) this;
        }

        public Criteria andZhifuqitayewuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHIFUQITAYEWU not between", value1, value2, "zhifuqitayewu");
            return (Criteria) this;
        }

        public Criteria andYewuliuchuxiaojiIsNull() {
            addCriterion("YEWULIUCHUXIAOJI is null");
            return (Criteria) this;
        }

        public Criteria andYewuliuchuxiaojiIsNotNull() {
            addCriterion("YEWULIUCHUXIAOJI is not null");
            return (Criteria) this;
        }

        public Criteria andYewuliuchuxiaojiEqualTo(BigDecimal value) {
            addCriterion("YEWULIUCHUXIAOJI =", value, "yewuliuchuxiaoji");
            return (Criteria) this;
        }

        public Criteria andYewuliuchuxiaojiNotEqualTo(BigDecimal value) {
            addCriterion("YEWULIUCHUXIAOJI <>", value, "yewuliuchuxiaoji");
            return (Criteria) this;
        }

        public Criteria andYewuliuchuxiaojiGreaterThan(BigDecimal value) {
            addCriterion("YEWULIUCHUXIAOJI >", value, "yewuliuchuxiaoji");
            return (Criteria) this;
        }

        public Criteria andYewuliuchuxiaojiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YEWULIUCHUXIAOJI >=", value, "yewuliuchuxiaoji");
            return (Criteria) this;
        }

        public Criteria andYewuliuchuxiaojiLessThan(BigDecimal value) {
            addCriterion("YEWULIUCHUXIAOJI <", value, "yewuliuchuxiaoji");
            return (Criteria) this;
        }

        public Criteria andYewuliuchuxiaojiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YEWULIUCHUXIAOJI <=", value, "yewuliuchuxiaoji");
            return (Criteria) this;
        }

        public Criteria andYewuliuchuxiaojiIn(List<BigDecimal> values) {
            addCriterion("YEWULIUCHUXIAOJI in", values, "yewuliuchuxiaoji");
            return (Criteria) this;
        }

        public Criteria andYewuliuchuxiaojiNotIn(List<BigDecimal> values) {
            addCriterion("YEWULIUCHUXIAOJI not in", values, "yewuliuchuxiaoji");
            return (Criteria) this;
        }

        public Criteria andYewuliuchuxiaojiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YEWULIUCHUXIAOJI between", value1, value2, "yewuliuchuxiaoji");
            return (Criteria) this;
        }

        public Criteria andYewuliuchuxiaojiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YEWULIUCHUXIAOJI not between", value1, value2, "yewuliuchuxiaoji");
            return (Criteria) this;
        }

        public Criteria andYewujingeIsNull() {
            addCriterion("YEWUJINGE is null");
            return (Criteria) this;
        }

        public Criteria andYewujingeIsNotNull() {
            addCriterion("YEWUJINGE is not null");
            return (Criteria) this;
        }

        public Criteria andYewujingeEqualTo(BigDecimal value) {
            addCriterion("YEWUJINGE =", value, "yewujinge");
            return (Criteria) this;
        }

        public Criteria andYewujingeNotEqualTo(BigDecimal value) {
            addCriterion("YEWUJINGE <>", value, "yewujinge");
            return (Criteria) this;
        }

        public Criteria andYewujingeGreaterThan(BigDecimal value) {
            addCriterion("YEWUJINGE >", value, "yewujinge");
            return (Criteria) this;
        }

        public Criteria andYewujingeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YEWUJINGE >=", value, "yewujinge");
            return (Criteria) this;
        }

        public Criteria andYewujingeLessThan(BigDecimal value) {
            addCriterion("YEWUJINGE <", value, "yewujinge");
            return (Criteria) this;
        }

        public Criteria andYewujingeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YEWUJINGE <=", value, "yewujinge");
            return (Criteria) this;
        }

        public Criteria andYewujingeIn(List<BigDecimal> values) {
            addCriterion("YEWUJINGE in", values, "yewujinge");
            return (Criteria) this;
        }

        public Criteria andYewujingeNotIn(List<BigDecimal> values) {
            addCriterion("YEWUJINGE not in", values, "yewujinge");
            return (Criteria) this;
        }

        public Criteria andYewujingeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YEWUJINGE between", value1, value2, "yewujinge");
            return (Criteria) this;
        }

        public Criteria andYewujingeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YEWUJINGE not between", value1, value2, "yewujinge");
            return (Criteria) this;
        }

        public Criteria andShouhuitouziIsNull() {
            addCriterion("SHOUHUITOUZI is null");
            return (Criteria) this;
        }

        public Criteria andShouhuitouziIsNotNull() {
            addCriterion("SHOUHUITOUZI is not null");
            return (Criteria) this;
        }

        public Criteria andShouhuitouziEqualTo(BigDecimal value) {
            addCriterion("SHOUHUITOUZI =", value, "shouhuitouzi");
            return (Criteria) this;
        }

        public Criteria andShouhuitouziNotEqualTo(BigDecimal value) {
            addCriterion("SHOUHUITOUZI <>", value, "shouhuitouzi");
            return (Criteria) this;
        }

        public Criteria andShouhuitouziGreaterThan(BigDecimal value) {
            addCriterion("SHOUHUITOUZI >", value, "shouhuitouzi");
            return (Criteria) this;
        }

        public Criteria andShouhuitouziGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOUHUITOUZI >=", value, "shouhuitouzi");
            return (Criteria) this;
        }

        public Criteria andShouhuitouziLessThan(BigDecimal value) {
            addCriterion("SHOUHUITOUZI <", value, "shouhuitouzi");
            return (Criteria) this;
        }

        public Criteria andShouhuitouziLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOUHUITOUZI <=", value, "shouhuitouzi");
            return (Criteria) this;
        }

        public Criteria andShouhuitouziIn(List<BigDecimal> values) {
            addCriterion("SHOUHUITOUZI in", values, "shouhuitouzi");
            return (Criteria) this;
        }

        public Criteria andShouhuitouziNotIn(List<BigDecimal> values) {
            addCriterion("SHOUHUITOUZI not in", values, "shouhuitouzi");
            return (Criteria) this;
        }

        public Criteria andShouhuitouziBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOUHUITOUZI between", value1, value2, "shouhuitouzi");
            return (Criteria) this;
        }

        public Criteria andShouhuitouziNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOUHUITOUZI not between", value1, value2, "shouhuitouzi");
            return (Criteria) this;
        }

        public Criteria andTouzishouyiIsNull() {
            addCriterion("TOUZISHOUYI is null");
            return (Criteria) this;
        }

        public Criteria andTouzishouyiIsNotNull() {
            addCriterion("TOUZISHOUYI is not null");
            return (Criteria) this;
        }

        public Criteria andTouzishouyiEqualTo(BigDecimal value) {
            addCriterion("TOUZISHOUYI =", value, "touzishouyi");
            return (Criteria) this;
        }

        public Criteria andTouzishouyiNotEqualTo(BigDecimal value) {
            addCriterion("TOUZISHOUYI <>", value, "touzishouyi");
            return (Criteria) this;
        }

        public Criteria andTouzishouyiGreaterThan(BigDecimal value) {
            addCriterion("TOUZISHOUYI >", value, "touzishouyi");
            return (Criteria) this;
        }

        public Criteria andTouzishouyiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOUZISHOUYI >=", value, "touzishouyi");
            return (Criteria) this;
        }

        public Criteria andTouzishouyiLessThan(BigDecimal value) {
            addCriterion("TOUZISHOUYI <", value, "touzishouyi");
            return (Criteria) this;
        }

        public Criteria andTouzishouyiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOUZISHOUYI <=", value, "touzishouyi");
            return (Criteria) this;
        }

        public Criteria andTouzishouyiIn(List<BigDecimal> values) {
            addCriterion("TOUZISHOUYI in", values, "touzishouyi");
            return (Criteria) this;
        }

        public Criteria andTouzishouyiNotIn(List<BigDecimal> values) {
            addCriterion("TOUZISHOUYI not in", values, "touzishouyi");
            return (Criteria) this;
        }

        public Criteria andTouzishouyiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOUZISHOUYI between", value1, value2, "touzishouyi");
            return (Criteria) this;
        }

        public Criteria andTouzishouyiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOUZISHOUYI not between", value1, value2, "touzishouyi");
            return (Criteria) this;
        }

        public Criteria andChuzhizichanshouhuiIsNull() {
            addCriterion("CHUZHIZICHANSHOUHUI is null");
            return (Criteria) this;
        }

        public Criteria andChuzhizichanshouhuiIsNotNull() {
            addCriterion("CHUZHIZICHANSHOUHUI is not null");
            return (Criteria) this;
        }

        public Criteria andChuzhizichanshouhuiEqualTo(BigDecimal value) {
            addCriterion("CHUZHIZICHANSHOUHUI =", value, "chuzhizichanshouhui");
            return (Criteria) this;
        }

        public Criteria andChuzhizichanshouhuiNotEqualTo(BigDecimal value) {
            addCriterion("CHUZHIZICHANSHOUHUI <>", value, "chuzhizichanshouhui");
            return (Criteria) this;
        }

        public Criteria andChuzhizichanshouhuiGreaterThan(BigDecimal value) {
            addCriterion("CHUZHIZICHANSHOUHUI >", value, "chuzhizichanshouhui");
            return (Criteria) this;
        }

        public Criteria andChuzhizichanshouhuiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHUZHIZICHANSHOUHUI >=", value, "chuzhizichanshouhui");
            return (Criteria) this;
        }

        public Criteria andChuzhizichanshouhuiLessThan(BigDecimal value) {
            addCriterion("CHUZHIZICHANSHOUHUI <", value, "chuzhizichanshouhui");
            return (Criteria) this;
        }

        public Criteria andChuzhizichanshouhuiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHUZHIZICHANSHOUHUI <=", value, "chuzhizichanshouhui");
            return (Criteria) this;
        }

        public Criteria andChuzhizichanshouhuiIn(List<BigDecimal> values) {
            addCriterion("CHUZHIZICHANSHOUHUI in", values, "chuzhizichanshouhui");
            return (Criteria) this;
        }

        public Criteria andChuzhizichanshouhuiNotIn(List<BigDecimal> values) {
            addCriterion("CHUZHIZICHANSHOUHUI not in", values, "chuzhizichanshouhui");
            return (Criteria) this;
        }

        public Criteria andChuzhizichanshouhuiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHUZHIZICHANSHOUHUI between", value1, value2, "chuzhizichanshouhui");
            return (Criteria) this;
        }

        public Criteria andChuzhizichanshouhuiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHUZHIZICHANSHOUHUI not between", value1, value2, "chuzhizichanshouhui");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitatouziIsNull() {
            addCriterion("SHOUDAOQITATOUZI is null");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitatouziIsNotNull() {
            addCriterion("SHOUDAOQITATOUZI is not null");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitatouziEqualTo(BigDecimal value) {
            addCriterion("SHOUDAOQITATOUZI =", value, "shoudaoqitatouzi");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitatouziNotEqualTo(BigDecimal value) {
            addCriterion("SHOUDAOQITATOUZI <>", value, "shoudaoqitatouzi");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitatouziGreaterThan(BigDecimal value) {
            addCriterion("SHOUDAOQITATOUZI >", value, "shoudaoqitatouzi");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitatouziGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOUDAOQITATOUZI >=", value, "shoudaoqitatouzi");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitatouziLessThan(BigDecimal value) {
            addCriterion("SHOUDAOQITATOUZI <", value, "shoudaoqitatouzi");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitatouziLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOUDAOQITATOUZI <=", value, "shoudaoqitatouzi");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitatouziIn(List<BigDecimal> values) {
            addCriterion("SHOUDAOQITATOUZI in", values, "shoudaoqitatouzi");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitatouziNotIn(List<BigDecimal> values) {
            addCriterion("SHOUDAOQITATOUZI not in", values, "shoudaoqitatouzi");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitatouziBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOUDAOQITATOUZI between", value1, value2, "shoudaoqitatouzi");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitatouziNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOUDAOQITATOUZI not between", value1, value2, "shoudaoqitatouzi");
            return (Criteria) this;
        }

        public Criteria andTouziliuruxiaojiIsNull() {
            addCriterion("TOUZILIURUXIAOJI is null");
            return (Criteria) this;
        }

        public Criteria andTouziliuruxiaojiIsNotNull() {
            addCriterion("TOUZILIURUXIAOJI is not null");
            return (Criteria) this;
        }

        public Criteria andTouziliuruxiaojiEqualTo(BigDecimal value) {
            addCriterion("TOUZILIURUXIAOJI =", value, "touziliuruxiaoji");
            return (Criteria) this;
        }

        public Criteria andTouziliuruxiaojiNotEqualTo(BigDecimal value) {
            addCriterion("TOUZILIURUXIAOJI <>", value, "touziliuruxiaoji");
            return (Criteria) this;
        }

        public Criteria andTouziliuruxiaojiGreaterThan(BigDecimal value) {
            addCriterion("TOUZILIURUXIAOJI >", value, "touziliuruxiaoji");
            return (Criteria) this;
        }

        public Criteria andTouziliuruxiaojiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOUZILIURUXIAOJI >=", value, "touziliuruxiaoji");
            return (Criteria) this;
        }

        public Criteria andTouziliuruxiaojiLessThan(BigDecimal value) {
            addCriterion("TOUZILIURUXIAOJI <", value, "touziliuruxiaoji");
            return (Criteria) this;
        }

        public Criteria andTouziliuruxiaojiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOUZILIURUXIAOJI <=", value, "touziliuruxiaoji");
            return (Criteria) this;
        }

        public Criteria andTouziliuruxiaojiIn(List<BigDecimal> values) {
            addCriterion("TOUZILIURUXIAOJI in", values, "touziliuruxiaoji");
            return (Criteria) this;
        }

        public Criteria andTouziliuruxiaojiNotIn(List<BigDecimal> values) {
            addCriterion("TOUZILIURUXIAOJI not in", values, "touziliuruxiaoji");
            return (Criteria) this;
        }

        public Criteria andTouziliuruxiaojiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOUZILIURUXIAOJI between", value1, value2, "touziliuruxiaoji");
            return (Criteria) this;
        }

        public Criteria andTouziliuruxiaojiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOUZILIURUXIAOJI not between", value1, value2, "touziliuruxiaoji");
            return (Criteria) this;
        }

        public Criteria andGoujianzichanzhifuIsNull() {
            addCriterion("GOUJIANZICHANZHIFU is null");
            return (Criteria) this;
        }

        public Criteria andGoujianzichanzhifuIsNotNull() {
            addCriterion("GOUJIANZICHANZHIFU is not null");
            return (Criteria) this;
        }

        public Criteria andGoujianzichanzhifuEqualTo(BigDecimal value) {
            addCriterion("GOUJIANZICHANZHIFU =", value, "goujianzichanzhifu");
            return (Criteria) this;
        }

        public Criteria andGoujianzichanzhifuNotEqualTo(BigDecimal value) {
            addCriterion("GOUJIANZICHANZHIFU <>", value, "goujianzichanzhifu");
            return (Criteria) this;
        }

        public Criteria andGoujianzichanzhifuGreaterThan(BigDecimal value) {
            addCriterion("GOUJIANZICHANZHIFU >", value, "goujianzichanzhifu");
            return (Criteria) this;
        }

        public Criteria andGoujianzichanzhifuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GOUJIANZICHANZHIFU >=", value, "goujianzichanzhifu");
            return (Criteria) this;
        }

        public Criteria andGoujianzichanzhifuLessThan(BigDecimal value) {
            addCriterion("GOUJIANZICHANZHIFU <", value, "goujianzichanzhifu");
            return (Criteria) this;
        }

        public Criteria andGoujianzichanzhifuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GOUJIANZICHANZHIFU <=", value, "goujianzichanzhifu");
            return (Criteria) this;
        }

        public Criteria andGoujianzichanzhifuIn(List<BigDecimal> values) {
            addCriterion("GOUJIANZICHANZHIFU in", values, "goujianzichanzhifu");
            return (Criteria) this;
        }

        public Criteria andGoujianzichanzhifuNotIn(List<BigDecimal> values) {
            addCriterion("GOUJIANZICHANZHIFU not in", values, "goujianzichanzhifu");
            return (Criteria) this;
        }

        public Criteria andGoujianzichanzhifuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOUJIANZICHANZHIFU between", value1, value2, "goujianzichanzhifu");
            return (Criteria) this;
        }

        public Criteria andGoujianzichanzhifuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOUJIANZICHANZHIFU not between", value1, value2, "goujianzichanzhifu");
            return (Criteria) this;
        }

        public Criteria andTouzizhifuIsNull() {
            addCriterion("TOUZIZHIFU is null");
            return (Criteria) this;
        }

        public Criteria andTouzizhifuIsNotNull() {
            addCriterion("TOUZIZHIFU is not null");
            return (Criteria) this;
        }

        public Criteria andTouzizhifuEqualTo(BigDecimal value) {
            addCriterion("TOUZIZHIFU =", value, "touzizhifu");
            return (Criteria) this;
        }

        public Criteria andTouzizhifuNotEqualTo(BigDecimal value) {
            addCriterion("TOUZIZHIFU <>", value, "touzizhifu");
            return (Criteria) this;
        }

        public Criteria andTouzizhifuGreaterThan(BigDecimal value) {
            addCriterion("TOUZIZHIFU >", value, "touzizhifu");
            return (Criteria) this;
        }

        public Criteria andTouzizhifuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOUZIZHIFU >=", value, "touzizhifu");
            return (Criteria) this;
        }

        public Criteria andTouzizhifuLessThan(BigDecimal value) {
            addCriterion("TOUZIZHIFU <", value, "touzizhifu");
            return (Criteria) this;
        }

        public Criteria andTouzizhifuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOUZIZHIFU <=", value, "touzizhifu");
            return (Criteria) this;
        }

        public Criteria andTouzizhifuIn(List<BigDecimal> values) {
            addCriterion("TOUZIZHIFU in", values, "touzizhifu");
            return (Criteria) this;
        }

        public Criteria andTouzizhifuNotIn(List<BigDecimal> values) {
            addCriterion("TOUZIZHIFU not in", values, "touzizhifu");
            return (Criteria) this;
        }

        public Criteria andTouzizhifuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOUZIZHIFU between", value1, value2, "touzizhifu");
            return (Criteria) this;
        }

        public Criteria andTouzizhifuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOUZIZHIFU not between", value1, value2, "touzizhifu");
            return (Criteria) this;
        }

        public Criteria andZhifuqitatouziIsNull() {
            addCriterion("ZHIFUQITATOUZI is null");
            return (Criteria) this;
        }

        public Criteria andZhifuqitatouziIsNotNull() {
            addCriterion("ZHIFUQITATOUZI is not null");
            return (Criteria) this;
        }

        public Criteria andZhifuqitatouziEqualTo(BigDecimal value) {
            addCriterion("ZHIFUQITATOUZI =", value, "zhifuqitatouzi");
            return (Criteria) this;
        }

        public Criteria andZhifuqitatouziNotEqualTo(BigDecimal value) {
            addCriterion("ZHIFUQITATOUZI <>", value, "zhifuqitatouzi");
            return (Criteria) this;
        }

        public Criteria andZhifuqitatouziGreaterThan(BigDecimal value) {
            addCriterion("ZHIFUQITATOUZI >", value, "zhifuqitatouzi");
            return (Criteria) this;
        }

        public Criteria andZhifuqitatouziGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHIFUQITATOUZI >=", value, "zhifuqitatouzi");
            return (Criteria) this;
        }

        public Criteria andZhifuqitatouziLessThan(BigDecimal value) {
            addCriterion("ZHIFUQITATOUZI <", value, "zhifuqitatouzi");
            return (Criteria) this;
        }

        public Criteria andZhifuqitatouziLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHIFUQITATOUZI <=", value, "zhifuqitatouzi");
            return (Criteria) this;
        }

        public Criteria andZhifuqitatouziIn(List<BigDecimal> values) {
            addCriterion("ZHIFUQITATOUZI in", values, "zhifuqitatouzi");
            return (Criteria) this;
        }

        public Criteria andZhifuqitatouziNotIn(List<BigDecimal> values) {
            addCriterion("ZHIFUQITATOUZI not in", values, "zhifuqitatouzi");
            return (Criteria) this;
        }

        public Criteria andZhifuqitatouziBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHIFUQITATOUZI between", value1, value2, "zhifuqitatouzi");
            return (Criteria) this;
        }

        public Criteria andZhifuqitatouziNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHIFUQITATOUZI not between", value1, value2, "zhifuqitatouzi");
            return (Criteria) this;
        }

        public Criteria andTouziliuchuxiaojiIsNull() {
            addCriterion("TOUZILIUCHUXIAOJI is null");
            return (Criteria) this;
        }

        public Criteria andTouziliuchuxiaojiIsNotNull() {
            addCriterion("TOUZILIUCHUXIAOJI is not null");
            return (Criteria) this;
        }

        public Criteria andTouziliuchuxiaojiEqualTo(BigDecimal value) {
            addCriterion("TOUZILIUCHUXIAOJI =", value, "touziliuchuxiaoji");
            return (Criteria) this;
        }

        public Criteria andTouziliuchuxiaojiNotEqualTo(BigDecimal value) {
            addCriterion("TOUZILIUCHUXIAOJI <>", value, "touziliuchuxiaoji");
            return (Criteria) this;
        }

        public Criteria andTouziliuchuxiaojiGreaterThan(BigDecimal value) {
            addCriterion("TOUZILIUCHUXIAOJI >", value, "touziliuchuxiaoji");
            return (Criteria) this;
        }

        public Criteria andTouziliuchuxiaojiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOUZILIUCHUXIAOJI >=", value, "touziliuchuxiaoji");
            return (Criteria) this;
        }

        public Criteria andTouziliuchuxiaojiLessThan(BigDecimal value) {
            addCriterion("TOUZILIUCHUXIAOJI <", value, "touziliuchuxiaoji");
            return (Criteria) this;
        }

        public Criteria andTouziliuchuxiaojiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOUZILIUCHUXIAOJI <=", value, "touziliuchuxiaoji");
            return (Criteria) this;
        }

        public Criteria andTouziliuchuxiaojiIn(List<BigDecimal> values) {
            addCriterion("TOUZILIUCHUXIAOJI in", values, "touziliuchuxiaoji");
            return (Criteria) this;
        }

        public Criteria andTouziliuchuxiaojiNotIn(List<BigDecimal> values) {
            addCriterion("TOUZILIUCHUXIAOJI not in", values, "touziliuchuxiaoji");
            return (Criteria) this;
        }

        public Criteria andTouziliuchuxiaojiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOUZILIUCHUXIAOJI between", value1, value2, "touziliuchuxiaoji");
            return (Criteria) this;
        }

        public Criteria andTouziliuchuxiaojiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOUZILIUCHUXIAOJI not between", value1, value2, "touziliuchuxiaoji");
            return (Criteria) this;
        }

        public Criteria andTouzijingeIsNull() {
            addCriterion("TOUZIJINGE is null");
            return (Criteria) this;
        }

        public Criteria andTouzijingeIsNotNull() {
            addCriterion("TOUZIJINGE is not null");
            return (Criteria) this;
        }

        public Criteria andTouzijingeEqualTo(BigDecimal value) {
            addCriterion("TOUZIJINGE =", value, "touzijinge");
            return (Criteria) this;
        }

        public Criteria andTouzijingeNotEqualTo(BigDecimal value) {
            addCriterion("TOUZIJINGE <>", value, "touzijinge");
            return (Criteria) this;
        }

        public Criteria andTouzijingeGreaterThan(BigDecimal value) {
            addCriterion("TOUZIJINGE >", value, "touzijinge");
            return (Criteria) this;
        }

        public Criteria andTouzijingeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOUZIJINGE >=", value, "touzijinge");
            return (Criteria) this;
        }

        public Criteria andTouzijingeLessThan(BigDecimal value) {
            addCriterion("TOUZIJINGE <", value, "touzijinge");
            return (Criteria) this;
        }

        public Criteria andTouzijingeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOUZIJINGE <=", value, "touzijinge");
            return (Criteria) this;
        }

        public Criteria andTouzijingeIn(List<BigDecimal> values) {
            addCriterion("TOUZIJINGE in", values, "touzijinge");
            return (Criteria) this;
        }

        public Criteria andTouzijingeNotIn(List<BigDecimal> values) {
            addCriterion("TOUZIJINGE not in", values, "touzijinge");
            return (Criteria) this;
        }

        public Criteria andTouzijingeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOUZIJINGE between", value1, value2, "touzijinge");
            return (Criteria) this;
        }

        public Criteria andTouzijingeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOUZIJINGE not between", value1, value2, "touzijinge");
            return (Criteria) this;
        }

        public Criteria andJiekuanshoudaoIsNull() {
            addCriterion("JIEKUANSHOUDAO is null");
            return (Criteria) this;
        }

        public Criteria andJiekuanshoudaoIsNotNull() {
            addCriterion("JIEKUANSHOUDAO is not null");
            return (Criteria) this;
        }

        public Criteria andJiekuanshoudaoEqualTo(BigDecimal value) {
            addCriterion("JIEKUANSHOUDAO =", value, "jiekuanshoudao");
            return (Criteria) this;
        }

        public Criteria andJiekuanshoudaoNotEqualTo(BigDecimal value) {
            addCriterion("JIEKUANSHOUDAO <>", value, "jiekuanshoudao");
            return (Criteria) this;
        }

        public Criteria andJiekuanshoudaoGreaterThan(BigDecimal value) {
            addCriterion("JIEKUANSHOUDAO >", value, "jiekuanshoudao");
            return (Criteria) this;
        }

        public Criteria andJiekuanshoudaoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JIEKUANSHOUDAO >=", value, "jiekuanshoudao");
            return (Criteria) this;
        }

        public Criteria andJiekuanshoudaoLessThan(BigDecimal value) {
            addCriterion("JIEKUANSHOUDAO <", value, "jiekuanshoudao");
            return (Criteria) this;
        }

        public Criteria andJiekuanshoudaoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JIEKUANSHOUDAO <=", value, "jiekuanshoudao");
            return (Criteria) this;
        }

        public Criteria andJiekuanshoudaoIn(List<BigDecimal> values) {
            addCriterion("JIEKUANSHOUDAO in", values, "jiekuanshoudao");
            return (Criteria) this;
        }

        public Criteria andJiekuanshoudaoNotIn(List<BigDecimal> values) {
            addCriterion("JIEKUANSHOUDAO not in", values, "jiekuanshoudao");
            return (Criteria) this;
        }

        public Criteria andJiekuanshoudaoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JIEKUANSHOUDAO between", value1, value2, "jiekuanshoudao");
            return (Criteria) this;
        }

        public Criteria andJiekuanshoudaoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JIEKUANSHOUDAO not between", value1, value2, "jiekuanshoudao");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitachouziIsNull() {
            addCriterion("SHOUDAOQITACHOUZI is null");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitachouziIsNotNull() {
            addCriterion("SHOUDAOQITACHOUZI is not null");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitachouziEqualTo(BigDecimal value) {
            addCriterion("SHOUDAOQITACHOUZI =", value, "shoudaoqitachouzi");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitachouziNotEqualTo(BigDecimal value) {
            addCriterion("SHOUDAOQITACHOUZI <>", value, "shoudaoqitachouzi");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitachouziGreaterThan(BigDecimal value) {
            addCriterion("SHOUDAOQITACHOUZI >", value, "shoudaoqitachouzi");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitachouziGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOUDAOQITACHOUZI >=", value, "shoudaoqitachouzi");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitachouziLessThan(BigDecimal value) {
            addCriterion("SHOUDAOQITACHOUZI <", value, "shoudaoqitachouzi");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitachouziLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOUDAOQITACHOUZI <=", value, "shoudaoqitachouzi");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitachouziIn(List<BigDecimal> values) {
            addCriterion("SHOUDAOQITACHOUZI in", values, "shoudaoqitachouzi");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitachouziNotIn(List<BigDecimal> values) {
            addCriterion("SHOUDAOQITACHOUZI not in", values, "shoudaoqitachouzi");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitachouziBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOUDAOQITACHOUZI between", value1, value2, "shoudaoqitachouzi");
            return (Criteria) this;
        }

        public Criteria andShoudaoqitachouziNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOUDAOQITACHOUZI not between", value1, value2, "shoudaoqitachouzi");
            return (Criteria) this;
        }

        public Criteria andChouziliuruxiaojiIsNull() {
            addCriterion("CHOUZILIURUXIAOJI is null");
            return (Criteria) this;
        }

        public Criteria andChouziliuruxiaojiIsNotNull() {
            addCriterion("CHOUZILIURUXIAOJI is not null");
            return (Criteria) this;
        }

        public Criteria andChouziliuruxiaojiEqualTo(BigDecimal value) {
            addCriterion("CHOUZILIURUXIAOJI =", value, "chouziliuruxiaoji");
            return (Criteria) this;
        }

        public Criteria andChouziliuruxiaojiNotEqualTo(BigDecimal value) {
            addCriterion("CHOUZILIURUXIAOJI <>", value, "chouziliuruxiaoji");
            return (Criteria) this;
        }

        public Criteria andChouziliuruxiaojiGreaterThan(BigDecimal value) {
            addCriterion("CHOUZILIURUXIAOJI >", value, "chouziliuruxiaoji");
            return (Criteria) this;
        }

        public Criteria andChouziliuruxiaojiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHOUZILIURUXIAOJI >=", value, "chouziliuruxiaoji");
            return (Criteria) this;
        }

        public Criteria andChouziliuruxiaojiLessThan(BigDecimal value) {
            addCriterion("CHOUZILIURUXIAOJI <", value, "chouziliuruxiaoji");
            return (Criteria) this;
        }

        public Criteria andChouziliuruxiaojiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHOUZILIURUXIAOJI <=", value, "chouziliuruxiaoji");
            return (Criteria) this;
        }

        public Criteria andChouziliuruxiaojiIn(List<BigDecimal> values) {
            addCriterion("CHOUZILIURUXIAOJI in", values, "chouziliuruxiaoji");
            return (Criteria) this;
        }

        public Criteria andChouziliuruxiaojiNotIn(List<BigDecimal> values) {
            addCriterion("CHOUZILIURUXIAOJI not in", values, "chouziliuruxiaoji");
            return (Criteria) this;
        }

        public Criteria andChouziliuruxiaojiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHOUZILIURUXIAOJI between", value1, value2, "chouziliuruxiaoji");
            return (Criteria) this;
        }

        public Criteria andChouziliuruxiaojiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHOUZILIURUXIAOJI not between", value1, value2, "chouziliuruxiaoji");
            return (Criteria) this;
        }

        public Criteria andJiekuanzhifuIsNull() {
            addCriterion("JIEKUANZHIFU is null");
            return (Criteria) this;
        }

        public Criteria andJiekuanzhifuIsNotNull() {
            addCriterion("JIEKUANZHIFU is not null");
            return (Criteria) this;
        }

        public Criteria andJiekuanzhifuEqualTo(BigDecimal value) {
            addCriterion("JIEKUANZHIFU =", value, "jiekuanzhifu");
            return (Criteria) this;
        }

        public Criteria andJiekuanzhifuNotEqualTo(BigDecimal value) {
            addCriterion("JIEKUANZHIFU <>", value, "jiekuanzhifu");
            return (Criteria) this;
        }

        public Criteria andJiekuanzhifuGreaterThan(BigDecimal value) {
            addCriterion("JIEKUANZHIFU >", value, "jiekuanzhifu");
            return (Criteria) this;
        }

        public Criteria andJiekuanzhifuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JIEKUANZHIFU >=", value, "jiekuanzhifu");
            return (Criteria) this;
        }

        public Criteria andJiekuanzhifuLessThan(BigDecimal value) {
            addCriterion("JIEKUANZHIFU <", value, "jiekuanzhifu");
            return (Criteria) this;
        }

        public Criteria andJiekuanzhifuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JIEKUANZHIFU <=", value, "jiekuanzhifu");
            return (Criteria) this;
        }

        public Criteria andJiekuanzhifuIn(List<BigDecimal> values) {
            addCriterion("JIEKUANZHIFU in", values, "jiekuanzhifu");
            return (Criteria) this;
        }

        public Criteria andJiekuanzhifuNotIn(List<BigDecimal> values) {
            addCriterion("JIEKUANZHIFU not in", values, "jiekuanzhifu");
            return (Criteria) this;
        }

        public Criteria andJiekuanzhifuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JIEKUANZHIFU between", value1, value2, "jiekuanzhifu");
            return (Criteria) this;
        }

        public Criteria andJiekuanzhifuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JIEKUANZHIFU not between", value1, value2, "jiekuanzhifu");
            return (Criteria) this;
        }

        public Criteria andLixizhifuIsNull() {
            addCriterion("LIXIZHIFU is null");
            return (Criteria) this;
        }

        public Criteria andLixizhifuIsNotNull() {
            addCriterion("LIXIZHIFU is not null");
            return (Criteria) this;
        }

        public Criteria andLixizhifuEqualTo(BigDecimal value) {
            addCriterion("LIXIZHIFU =", value, "lixizhifu");
            return (Criteria) this;
        }

        public Criteria andLixizhifuNotEqualTo(BigDecimal value) {
            addCriterion("LIXIZHIFU <>", value, "lixizhifu");
            return (Criteria) this;
        }

        public Criteria andLixizhifuGreaterThan(BigDecimal value) {
            addCriterion("LIXIZHIFU >", value, "lixizhifu");
            return (Criteria) this;
        }

        public Criteria andLixizhifuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIXIZHIFU >=", value, "lixizhifu");
            return (Criteria) this;
        }

        public Criteria andLixizhifuLessThan(BigDecimal value) {
            addCriterion("LIXIZHIFU <", value, "lixizhifu");
            return (Criteria) this;
        }

        public Criteria andLixizhifuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIXIZHIFU <=", value, "lixizhifu");
            return (Criteria) this;
        }

        public Criteria andLixizhifuIn(List<BigDecimal> values) {
            addCriterion("LIXIZHIFU in", values, "lixizhifu");
            return (Criteria) this;
        }

        public Criteria andLixizhifuNotIn(List<BigDecimal> values) {
            addCriterion("LIXIZHIFU not in", values, "lixizhifu");
            return (Criteria) this;
        }

        public Criteria andLixizhifuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIXIZHIFU between", value1, value2, "lixizhifu");
            return (Criteria) this;
        }

        public Criteria andLixizhifuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIXIZHIFU not between", value1, value2, "lixizhifu");
            return (Criteria) this;
        }

        public Criteria andZhifuqitachouziIsNull() {
            addCriterion("ZHIFUQITACHOUZI is null");
            return (Criteria) this;
        }

        public Criteria andZhifuqitachouziIsNotNull() {
            addCriterion("ZHIFUQITACHOUZI is not null");
            return (Criteria) this;
        }

        public Criteria andZhifuqitachouziEqualTo(BigDecimal value) {
            addCriterion("ZHIFUQITACHOUZI =", value, "zhifuqitachouzi");
            return (Criteria) this;
        }

        public Criteria andZhifuqitachouziNotEqualTo(BigDecimal value) {
            addCriterion("ZHIFUQITACHOUZI <>", value, "zhifuqitachouzi");
            return (Criteria) this;
        }

        public Criteria andZhifuqitachouziGreaterThan(BigDecimal value) {
            addCriterion("ZHIFUQITACHOUZI >", value, "zhifuqitachouzi");
            return (Criteria) this;
        }

        public Criteria andZhifuqitachouziGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHIFUQITACHOUZI >=", value, "zhifuqitachouzi");
            return (Criteria) this;
        }

        public Criteria andZhifuqitachouziLessThan(BigDecimal value) {
            addCriterion("ZHIFUQITACHOUZI <", value, "zhifuqitachouzi");
            return (Criteria) this;
        }

        public Criteria andZhifuqitachouziLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHIFUQITACHOUZI <=", value, "zhifuqitachouzi");
            return (Criteria) this;
        }

        public Criteria andZhifuqitachouziIn(List<BigDecimal> values) {
            addCriterion("ZHIFUQITACHOUZI in", values, "zhifuqitachouzi");
            return (Criteria) this;
        }

        public Criteria andZhifuqitachouziNotIn(List<BigDecimal> values) {
            addCriterion("ZHIFUQITACHOUZI not in", values, "zhifuqitachouzi");
            return (Criteria) this;
        }

        public Criteria andZhifuqitachouziBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHIFUQITACHOUZI between", value1, value2, "zhifuqitachouzi");
            return (Criteria) this;
        }

        public Criteria andZhifuqitachouziNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHIFUQITACHOUZI not between", value1, value2, "zhifuqitachouzi");
            return (Criteria) this;
        }

        public Criteria andChouziliuchuxiaojiIsNull() {
            addCriterion("CHOUZILIUCHUXIAOJI is null");
            return (Criteria) this;
        }

        public Criteria andChouziliuchuxiaojiIsNotNull() {
            addCriterion("CHOUZILIUCHUXIAOJI is not null");
            return (Criteria) this;
        }

        public Criteria andChouziliuchuxiaojiEqualTo(BigDecimal value) {
            addCriterion("CHOUZILIUCHUXIAOJI =", value, "chouziliuchuxiaoji");
            return (Criteria) this;
        }

        public Criteria andChouziliuchuxiaojiNotEqualTo(BigDecimal value) {
            addCriterion("CHOUZILIUCHUXIAOJI <>", value, "chouziliuchuxiaoji");
            return (Criteria) this;
        }

        public Criteria andChouziliuchuxiaojiGreaterThan(BigDecimal value) {
            addCriterion("CHOUZILIUCHUXIAOJI >", value, "chouziliuchuxiaoji");
            return (Criteria) this;
        }

        public Criteria andChouziliuchuxiaojiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHOUZILIUCHUXIAOJI >=", value, "chouziliuchuxiaoji");
            return (Criteria) this;
        }

        public Criteria andChouziliuchuxiaojiLessThan(BigDecimal value) {
            addCriterion("CHOUZILIUCHUXIAOJI <", value, "chouziliuchuxiaoji");
            return (Criteria) this;
        }

        public Criteria andChouziliuchuxiaojiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHOUZILIUCHUXIAOJI <=", value, "chouziliuchuxiaoji");
            return (Criteria) this;
        }

        public Criteria andChouziliuchuxiaojiIn(List<BigDecimal> values) {
            addCriterion("CHOUZILIUCHUXIAOJI in", values, "chouziliuchuxiaoji");
            return (Criteria) this;
        }

        public Criteria andChouziliuchuxiaojiNotIn(List<BigDecimal> values) {
            addCriterion("CHOUZILIUCHUXIAOJI not in", values, "chouziliuchuxiaoji");
            return (Criteria) this;
        }

        public Criteria andChouziliuchuxiaojiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHOUZILIUCHUXIAOJI between", value1, value2, "chouziliuchuxiaoji");
            return (Criteria) this;
        }

        public Criteria andChouziliuchuxiaojiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHOUZILIUCHUXIAOJI not between", value1, value2, "chouziliuchuxiaoji");
            return (Criteria) this;
        }

        public Criteria andChouzijingeIsNull() {
            addCriterion("CHOUZIJINGE is null");
            return (Criteria) this;
        }

        public Criteria andChouzijingeIsNotNull() {
            addCriterion("CHOUZIJINGE is not null");
            return (Criteria) this;
        }

        public Criteria andChouzijingeEqualTo(BigDecimal value) {
            addCriterion("CHOUZIJINGE =", value, "chouzijinge");
            return (Criteria) this;
        }

        public Criteria andChouzijingeNotEqualTo(BigDecimal value) {
            addCriterion("CHOUZIJINGE <>", value, "chouzijinge");
            return (Criteria) this;
        }

        public Criteria andChouzijingeGreaterThan(BigDecimal value) {
            addCriterion("CHOUZIJINGE >", value, "chouzijinge");
            return (Criteria) this;
        }

        public Criteria andChouzijingeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHOUZIJINGE >=", value, "chouzijinge");
            return (Criteria) this;
        }

        public Criteria andChouzijingeLessThan(BigDecimal value) {
            addCriterion("CHOUZIJINGE <", value, "chouzijinge");
            return (Criteria) this;
        }

        public Criteria andChouzijingeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHOUZIJINGE <=", value, "chouzijinge");
            return (Criteria) this;
        }

        public Criteria andChouzijingeIn(List<BigDecimal> values) {
            addCriterion("CHOUZIJINGE in", values, "chouzijinge");
            return (Criteria) this;
        }

        public Criteria andChouzijingeNotIn(List<BigDecimal> values) {
            addCriterion("CHOUZIJINGE not in", values, "chouzijinge");
            return (Criteria) this;
        }

        public Criteria andChouzijingeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHOUZIJINGE between", value1, value2, "chouzijinge");
            return (Criteria) this;
        }

        public Criteria andChouzijingeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHOUZIJINGE not between", value1, value2, "chouzijinge");
            return (Criteria) this;
        }

        public Criteria andHuilvyingxiangeIsNull() {
            addCriterion("HUILVYINGXIANGE is null");
            return (Criteria) this;
        }

        public Criteria andHuilvyingxiangeIsNotNull() {
            addCriterion("HUILVYINGXIANGE is not null");
            return (Criteria) this;
        }

        public Criteria andHuilvyingxiangeEqualTo(BigDecimal value) {
            addCriterion("HUILVYINGXIANGE =", value, "huilvyingxiange");
            return (Criteria) this;
        }

        public Criteria andHuilvyingxiangeNotEqualTo(BigDecimal value) {
            addCriterion("HUILVYINGXIANGE <>", value, "huilvyingxiange");
            return (Criteria) this;
        }

        public Criteria andHuilvyingxiangeGreaterThan(BigDecimal value) {
            addCriterion("HUILVYINGXIANGE >", value, "huilvyingxiange");
            return (Criteria) this;
        }

        public Criteria andHuilvyingxiangeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HUILVYINGXIANGE >=", value, "huilvyingxiange");
            return (Criteria) this;
        }

        public Criteria andHuilvyingxiangeLessThan(BigDecimal value) {
            addCriterion("HUILVYINGXIANGE <", value, "huilvyingxiange");
            return (Criteria) this;
        }

        public Criteria andHuilvyingxiangeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HUILVYINGXIANGE <=", value, "huilvyingxiange");
            return (Criteria) this;
        }

        public Criteria andHuilvyingxiangeIn(List<BigDecimal> values) {
            addCriterion("HUILVYINGXIANGE in", values, "huilvyingxiange");
            return (Criteria) this;
        }

        public Criteria andHuilvyingxiangeNotIn(List<BigDecimal> values) {
            addCriterion("HUILVYINGXIANGE not in", values, "huilvyingxiange");
            return (Criteria) this;
        }

        public Criteria andHuilvyingxiangeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HUILVYINGXIANGE between", value1, value2, "huilvyingxiange");
            return (Criteria) this;
        }

        public Criteria andHuilvyingxiangeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HUILVYINGXIANGE not between", value1, value2, "huilvyingxiange");
            return (Criteria) this;
        }

        public Criteria andXianjinzengjiaeIsNull() {
            addCriterion("XIANJINZENGJIAE is null");
            return (Criteria) this;
        }

        public Criteria andXianjinzengjiaeIsNotNull() {
            addCriterion("XIANJINZENGJIAE is not null");
            return (Criteria) this;
        }

        public Criteria andXianjinzengjiaeEqualTo(BigDecimal value) {
            addCriterion("XIANJINZENGJIAE =", value, "xianjinzengjiae");
            return (Criteria) this;
        }

        public Criteria andXianjinzengjiaeNotEqualTo(BigDecimal value) {
            addCriterion("XIANJINZENGJIAE <>", value, "xianjinzengjiae");
            return (Criteria) this;
        }

        public Criteria andXianjinzengjiaeGreaterThan(BigDecimal value) {
            addCriterion("XIANJINZENGJIAE >", value, "xianjinzengjiae");
            return (Criteria) this;
        }

        public Criteria andXianjinzengjiaeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJINZENGJIAE >=", value, "xianjinzengjiae");
            return (Criteria) this;
        }

        public Criteria andXianjinzengjiaeLessThan(BigDecimal value) {
            addCriterion("XIANJINZENGJIAE <", value, "xianjinzengjiae");
            return (Criteria) this;
        }

        public Criteria andXianjinzengjiaeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANJINZENGJIAE <=", value, "xianjinzengjiae");
            return (Criteria) this;
        }

        public Criteria andXianjinzengjiaeIn(List<BigDecimal> values) {
            addCriterion("XIANJINZENGJIAE in", values, "xianjinzengjiae");
            return (Criteria) this;
        }

        public Criteria andXianjinzengjiaeNotIn(List<BigDecimal> values) {
            addCriterion("XIANJINZENGJIAE not in", values, "xianjinzengjiae");
            return (Criteria) this;
        }

        public Criteria andXianjinzengjiaeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJINZENGJIAE between", value1, value2, "xianjinzengjiae");
            return (Criteria) this;
        }

        public Criteria andXianjinzengjiaeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANJINZENGJIAE not between", value1, value2, "xianjinzengjiae");
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