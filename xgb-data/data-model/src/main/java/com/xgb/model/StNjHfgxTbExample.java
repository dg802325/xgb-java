package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StNjHfgxTbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StNjHfgxTbExample() {
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

        public Criteria andJieciIsNull() {
            addCriterion("JIECI is null");
            return (Criteria) this;
        }

        public Criteria andJieciIsNotNull() {
            addCriterion("JIECI is not null");
            return (Criteria) this;
        }

        public Criteria andJieciEqualTo(String value) {
            addCriterion("JIECI =", value, "jieci");
            return (Criteria) this;
        }

        public Criteria andJieciNotEqualTo(String value) {
            addCriterion("JIECI <>", value, "jieci");
            return (Criteria) this;
        }

        public Criteria andJieciGreaterThan(String value) {
            addCriterion("JIECI >", value, "jieci");
            return (Criteria) this;
        }

        public Criteria andJieciGreaterThanOrEqualTo(String value) {
            addCriterion("JIECI >=", value, "jieci");
            return (Criteria) this;
        }

        public Criteria andJieciLessThan(String value) {
            addCriterion("JIECI <", value, "jieci");
            return (Criteria) this;
        }

        public Criteria andJieciLessThanOrEqualTo(String value) {
            addCriterion("JIECI <=", value, "jieci");
            return (Criteria) this;
        }

        public Criteria andJieciLike(String value) {
            addCriterion("JIECI like", value, "jieci");
            return (Criteria) this;
        }

        public Criteria andJieciNotLike(String value) {
            addCriterion("JIECI not like", value, "jieci");
            return (Criteria) this;
        }

        public Criteria andJieciIn(List<String> values) {
            addCriterion("JIECI in", values, "jieci");
            return (Criteria) this;
        }

        public Criteria andJieciNotIn(List<String> values) {
            addCriterion("JIECI not in", values, "jieci");
            return (Criteria) this;
        }

        public Criteria andJieciBetween(String value1, String value2) {
            addCriterion("JIECI between", value1, value2, "jieci");
            return (Criteria) this;
        }

        public Criteria andJieciNotBetween(String value1, String value2) {
            addCriterion("JIECI not between", value1, value2, "jieci");
            return (Criteria) this;
        }

        public Criteria andZhidingshijianIsNull() {
            addCriterion("ZHIDINGSHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andZhidingshijianIsNotNull() {
            addCriterion("ZHIDINGSHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andZhidingshijianEqualTo(Date value) {
            addCriterion("ZHIDINGSHIJIAN =", value, "zhidingshijian");
            return (Criteria) this;
        }

        public Criteria andZhidingshijianNotEqualTo(Date value) {
            addCriterion("ZHIDINGSHIJIAN <>", value, "zhidingshijian");
            return (Criteria) this;
        }

        public Criteria andZhidingshijianGreaterThan(Date value) {
            addCriterion("ZHIDINGSHIJIAN >", value, "zhidingshijian");
            return (Criteria) this;
        }

        public Criteria andZhidingshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("ZHIDINGSHIJIAN >=", value, "zhidingshijian");
            return (Criteria) this;
        }

        public Criteria andZhidingshijianLessThan(Date value) {
            addCriterion("ZHIDINGSHIJIAN <", value, "zhidingshijian");
            return (Criteria) this;
        }

        public Criteria andZhidingshijianLessThanOrEqualTo(Date value) {
            addCriterion("ZHIDINGSHIJIAN <=", value, "zhidingshijian");
            return (Criteria) this;
        }

        public Criteria andZhidingshijianIn(List<Date> values) {
            addCriterion("ZHIDINGSHIJIAN in", values, "zhidingshijian");
            return (Criteria) this;
        }

        public Criteria andZhidingshijianNotIn(List<Date> values) {
            addCriterion("ZHIDINGSHIJIAN not in", values, "zhidingshijian");
            return (Criteria) this;
        }

        public Criteria andZhidingshijianBetween(Date value1, Date value2) {
            addCriterion("ZHIDINGSHIJIAN between", value1, value2, "zhidingshijian");
            return (Criteria) this;
        }

        public Criteria andZhidingshijianNotBetween(Date value1, Date value2) {
            addCriterion("ZHIDINGSHIJIAN not between", value1, value2, "zhidingshijian");
            return (Criteria) this;
        }

        public Criteria andYingjiaohuifeiIsNull() {
            addCriterion("YINGJIAOHUIFEI is null");
            return (Criteria) this;
        }

        public Criteria andYingjiaohuifeiIsNotNull() {
            addCriterion("YINGJIAOHUIFEI is not null");
            return (Criteria) this;
        }

        public Criteria andYingjiaohuifeiEqualTo(BigDecimal value) {
            addCriterion("YINGJIAOHUIFEI =", value, "yingjiaohuifei");
            return (Criteria) this;
        }

        public Criteria andYingjiaohuifeiNotEqualTo(BigDecimal value) {
            addCriterion("YINGJIAOHUIFEI <>", value, "yingjiaohuifei");
            return (Criteria) this;
        }

        public Criteria andYingjiaohuifeiGreaterThan(BigDecimal value) {
            addCriterion("YINGJIAOHUIFEI >", value, "yingjiaohuifei");
            return (Criteria) this;
        }

        public Criteria andYingjiaohuifeiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YINGJIAOHUIFEI >=", value, "yingjiaohuifei");
            return (Criteria) this;
        }

        public Criteria andYingjiaohuifeiLessThan(BigDecimal value) {
            addCriterion("YINGJIAOHUIFEI <", value, "yingjiaohuifei");
            return (Criteria) this;
        }

        public Criteria andYingjiaohuifeiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YINGJIAOHUIFEI <=", value, "yingjiaohuifei");
            return (Criteria) this;
        }

        public Criteria andYingjiaohuifeiIn(List<BigDecimal> values) {
            addCriterion("YINGJIAOHUIFEI in", values, "yingjiaohuifei");
            return (Criteria) this;
        }

        public Criteria andYingjiaohuifeiNotIn(List<BigDecimal> values) {
            addCriterion("YINGJIAOHUIFEI not in", values, "yingjiaohuifei");
            return (Criteria) this;
        }

        public Criteria andYingjiaohuifeiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YINGJIAOHUIFEI between", value1, value2, "yingjiaohuifei");
            return (Criteria) this;
        }

        public Criteria andYingjiaohuifeiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YINGJIAOHUIFEI not between", value1, value2, "yingjiaohuifei");
            return (Criteria) this;
        }

        public Criteria andLibiaodanweiIsNull() {
            addCriterion("LIBIAODANWEI is null");
            return (Criteria) this;
        }

        public Criteria andLibiaodanweiIsNotNull() {
            addCriterion("LIBIAODANWEI is not null");
            return (Criteria) this;
        }

        public Criteria andLibiaodanweiEqualTo(BigDecimal value) {
            addCriterion("LIBIAODANWEI =", value, "libiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLibiaodanweiNotEqualTo(BigDecimal value) {
            addCriterion("LIBIAODANWEI <>", value, "libiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLibiaodanweiGreaterThan(BigDecimal value) {
            addCriterion("LIBIAODANWEI >", value, "libiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLibiaodanweiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIBIAODANWEI >=", value, "libiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLibiaodanweiLessThan(BigDecimal value) {
            addCriterion("LIBIAODANWEI <", value, "libiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLibiaodanweiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIBIAODANWEI <=", value, "libiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLibiaodanweiIn(List<BigDecimal> values) {
            addCriterion("LIBIAODANWEI in", values, "libiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLibiaodanweiNotIn(List<BigDecimal> values) {
            addCriterion("LIBIAODANWEI not in", values, "libiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLibiaodanweiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIBIAODANWEI between", value1, value2, "libiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLibiaodanweiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIBIAODANWEI not between", value1, value2, "libiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLishudanweiIsNull() {
            addCriterion("LISHUDANWEI is null");
            return (Criteria) this;
        }

        public Criteria andLishudanweiIsNotNull() {
            addCriterion("LISHUDANWEI is not null");
            return (Criteria) this;
        }

        public Criteria andLishudanweiEqualTo(BigDecimal value) {
            addCriterion("LISHUDANWEI =", value, "lishudanwei");
            return (Criteria) this;
        }

        public Criteria andLishudanweiNotEqualTo(BigDecimal value) {
            addCriterion("LISHUDANWEI <>", value, "lishudanwei");
            return (Criteria) this;
        }

        public Criteria andLishudanweiGreaterThan(BigDecimal value) {
            addCriterion("LISHUDANWEI >", value, "lishudanwei");
            return (Criteria) this;
        }

        public Criteria andLishudanweiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LISHUDANWEI >=", value, "lishudanwei");
            return (Criteria) this;
        }

        public Criteria andLishudanweiLessThan(BigDecimal value) {
            addCriterion("LISHUDANWEI <", value, "lishudanwei");
            return (Criteria) this;
        }

        public Criteria andLishudanweiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LISHUDANWEI <=", value, "lishudanwei");
            return (Criteria) this;
        }

        public Criteria andLishudanweiIn(List<BigDecimal> values) {
            addCriterion("LISHUDANWEI in", values, "lishudanwei");
            return (Criteria) this;
        }

        public Criteria andLishudanweiNotIn(List<BigDecimal> values) {
            addCriterion("LISHUDANWEI not in", values, "lishudanwei");
            return (Criteria) this;
        }

        public Criteria andLishudanweiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LISHUDANWEI between", value1, value2, "lishudanwei");
            return (Criteria) this;
        }

        public Criteria andLishudanweiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LISHUDANWEI not between", value1, value2, "lishudanwei");
            return (Criteria) this;
        }

        public Criteria andLijiaodanweiIsNull() {
            addCriterion("LIJIAODANWEI is null");
            return (Criteria) this;
        }

        public Criteria andLijiaodanweiIsNotNull() {
            addCriterion("LIJIAODANWEI is not null");
            return (Criteria) this;
        }

        public Criteria andLijiaodanweiEqualTo(BigDecimal value) {
            addCriterion("LIJIAODANWEI =", value, "lijiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLijiaodanweiNotEqualTo(BigDecimal value) {
            addCriterion("LIJIAODANWEI <>", value, "lijiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLijiaodanweiGreaterThan(BigDecimal value) {
            addCriterion("LIJIAODANWEI >", value, "lijiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLijiaodanweiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIJIAODANWEI >=", value, "lijiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLijiaodanweiLessThan(BigDecimal value) {
            addCriterion("LIJIAODANWEI <", value, "lijiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLijiaodanweiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIJIAODANWEI <=", value, "lijiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLijiaodanweiIn(List<BigDecimal> values) {
            addCriterion("LIJIAODANWEI in", values, "lijiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLijiaodanweiNotIn(List<BigDecimal> values) {
            addCriterion("LIJIAODANWEI not in", values, "lijiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLijiaodanweiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIJIAODANWEI between", value1, value2, "lijiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLijiaodanweiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIJIAODANWEI not between", value1, value2, "lijiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLibiaogerenIsNull() {
            addCriterion("LIBIAOGEREN is null");
            return (Criteria) this;
        }

        public Criteria andLibiaogerenIsNotNull() {
            addCriterion("LIBIAOGEREN is not null");
            return (Criteria) this;
        }

        public Criteria andLibiaogerenEqualTo(BigDecimal value) {
            addCriterion("LIBIAOGEREN =", value, "libiaogeren");
            return (Criteria) this;
        }

        public Criteria andLibiaogerenNotEqualTo(BigDecimal value) {
            addCriterion("LIBIAOGEREN <>", value, "libiaogeren");
            return (Criteria) this;
        }

        public Criteria andLibiaogerenGreaterThan(BigDecimal value) {
            addCriterion("LIBIAOGEREN >", value, "libiaogeren");
            return (Criteria) this;
        }

        public Criteria andLibiaogerenGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIBIAOGEREN >=", value, "libiaogeren");
            return (Criteria) this;
        }

        public Criteria andLibiaogerenLessThan(BigDecimal value) {
            addCriterion("LIBIAOGEREN <", value, "libiaogeren");
            return (Criteria) this;
        }

        public Criteria andLibiaogerenLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIBIAOGEREN <=", value, "libiaogeren");
            return (Criteria) this;
        }

        public Criteria andLibiaogerenIn(List<BigDecimal> values) {
            addCriterion("LIBIAOGEREN in", values, "libiaogeren");
            return (Criteria) this;
        }

        public Criteria andLibiaogerenNotIn(List<BigDecimal> values) {
            addCriterion("LIBIAOGEREN not in", values, "libiaogeren");
            return (Criteria) this;
        }

        public Criteria andLibiaogerenBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIBIAOGEREN between", value1, value2, "libiaogeren");
            return (Criteria) this;
        }

        public Criteria andLibiaogerenNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIBIAOGEREN not between", value1, value2, "libiaogeren");
            return (Criteria) this;
        }

        public Criteria andLishugerenIsNull() {
            addCriterion("LISHUGEREN is null");
            return (Criteria) this;
        }

        public Criteria andLishugerenIsNotNull() {
            addCriterion("LISHUGEREN is not null");
            return (Criteria) this;
        }

        public Criteria andLishugerenEqualTo(Integer value) {
            addCriterion("LISHUGEREN =", value, "lishugeren");
            return (Criteria) this;
        }

        public Criteria andLishugerenNotEqualTo(Integer value) {
            addCriterion("LISHUGEREN <>", value, "lishugeren");
            return (Criteria) this;
        }

        public Criteria andLishugerenGreaterThan(Integer value) {
            addCriterion("LISHUGEREN >", value, "lishugeren");
            return (Criteria) this;
        }

        public Criteria andLishugerenGreaterThanOrEqualTo(Integer value) {
            addCriterion("LISHUGEREN >=", value, "lishugeren");
            return (Criteria) this;
        }

        public Criteria andLishugerenLessThan(Integer value) {
            addCriterion("LISHUGEREN <", value, "lishugeren");
            return (Criteria) this;
        }

        public Criteria andLishugerenLessThanOrEqualTo(Integer value) {
            addCriterion("LISHUGEREN <=", value, "lishugeren");
            return (Criteria) this;
        }

        public Criteria andLishugerenIn(List<Integer> values) {
            addCriterion("LISHUGEREN in", values, "lishugeren");
            return (Criteria) this;
        }

        public Criteria andLishugerenNotIn(List<Integer> values) {
            addCriterion("LISHUGEREN not in", values, "lishugeren");
            return (Criteria) this;
        }

        public Criteria andLishugerenBetween(Integer value1, Integer value2) {
            addCriterion("LISHUGEREN between", value1, value2, "lishugeren");
            return (Criteria) this;
        }

        public Criteria andLishugerenNotBetween(Integer value1, Integer value2) {
            addCriterion("LISHUGEREN not between", value1, value2, "lishugeren");
            return (Criteria) this;
        }

        public Criteria andLijiaogerenIsNull() {
            addCriterion("LIJIAOGEREN is null");
            return (Criteria) this;
        }

        public Criteria andLijiaogerenIsNotNull() {
            addCriterion("LIJIAOGEREN is not null");
            return (Criteria) this;
        }

        public Criteria andLijiaogerenEqualTo(BigDecimal value) {
            addCriterion("LIJIAOGEREN =", value, "lijiaogeren");
            return (Criteria) this;
        }

        public Criteria andLijiaogerenNotEqualTo(BigDecimal value) {
            addCriterion("LIJIAOGEREN <>", value, "lijiaogeren");
            return (Criteria) this;
        }

        public Criteria andLijiaogerenGreaterThan(BigDecimal value) {
            addCriterion("LIJIAOGEREN >", value, "lijiaogeren");
            return (Criteria) this;
        }

        public Criteria andLijiaogerenGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIJIAOGEREN >=", value, "lijiaogeren");
            return (Criteria) this;
        }

        public Criteria andLijiaogerenLessThan(BigDecimal value) {
            addCriterion("LIJIAOGEREN <", value, "lijiaogeren");
            return (Criteria) this;
        }

        public Criteria andLijiaogerenLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIJIAOGEREN <=", value, "lijiaogeren");
            return (Criteria) this;
        }

        public Criteria andLijiaogerenIn(List<BigDecimal> values) {
            addCriterion("LIJIAOGEREN in", values, "lijiaogeren");
            return (Criteria) this;
        }

        public Criteria andLijiaogerenNotIn(List<BigDecimal> values) {
            addCriterion("LIJIAOGEREN not in", values, "lijiaogeren");
            return (Criteria) this;
        }

        public Criteria andLijiaogerenBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIJIAOGEREN between", value1, value2, "lijiaogeren");
            return (Criteria) this;
        }

        public Criteria andLijiaogerenNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIJIAOGEREN not between", value1, value2, "lijiaogeren");
            return (Criteria) this;
        }

        public Criteria andFubiaodanweiIsNull() {
            addCriterion("FUBIAODANWEI is null");
            return (Criteria) this;
        }

        public Criteria andFubiaodanweiIsNotNull() {
            addCriterion("FUBIAODANWEI is not null");
            return (Criteria) this;
        }

        public Criteria andFubiaodanweiEqualTo(BigDecimal value) {
            addCriterion("FUBIAODANWEI =", value, "fubiaodanwei");
            return (Criteria) this;
        }

        public Criteria andFubiaodanweiNotEqualTo(BigDecimal value) {
            addCriterion("FUBIAODANWEI <>", value, "fubiaodanwei");
            return (Criteria) this;
        }

        public Criteria andFubiaodanweiGreaterThan(BigDecimal value) {
            addCriterion("FUBIAODANWEI >", value, "fubiaodanwei");
            return (Criteria) this;
        }

        public Criteria andFubiaodanweiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FUBIAODANWEI >=", value, "fubiaodanwei");
            return (Criteria) this;
        }

        public Criteria andFubiaodanweiLessThan(BigDecimal value) {
            addCriterion("FUBIAODANWEI <", value, "fubiaodanwei");
            return (Criteria) this;
        }

        public Criteria andFubiaodanweiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FUBIAODANWEI <=", value, "fubiaodanwei");
            return (Criteria) this;
        }

        public Criteria andFubiaodanweiIn(List<BigDecimal> values) {
            addCriterion("FUBIAODANWEI in", values, "fubiaodanwei");
            return (Criteria) this;
        }

        public Criteria andFubiaodanweiNotIn(List<BigDecimal> values) {
            addCriterion("FUBIAODANWEI not in", values, "fubiaodanwei");
            return (Criteria) this;
        }

        public Criteria andFubiaodanweiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUBIAODANWEI between", value1, value2, "fubiaodanwei");
            return (Criteria) this;
        }

        public Criteria andFubiaodanweiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUBIAODANWEI not between", value1, value2, "fubiaodanwei");
            return (Criteria) this;
        }

        public Criteria andFushudanweiIsNull() {
            addCriterion("FUSHUDANWEI is null");
            return (Criteria) this;
        }

        public Criteria andFushudanweiIsNotNull() {
            addCriterion("FUSHUDANWEI is not null");
            return (Criteria) this;
        }

        public Criteria andFushudanweiEqualTo(Integer value) {
            addCriterion("FUSHUDANWEI =", value, "fushudanwei");
            return (Criteria) this;
        }

        public Criteria andFushudanweiNotEqualTo(Integer value) {
            addCriterion("FUSHUDANWEI <>", value, "fushudanwei");
            return (Criteria) this;
        }

        public Criteria andFushudanweiGreaterThan(Integer value) {
            addCriterion("FUSHUDANWEI >", value, "fushudanwei");
            return (Criteria) this;
        }

        public Criteria andFushudanweiGreaterThanOrEqualTo(Integer value) {
            addCriterion("FUSHUDANWEI >=", value, "fushudanwei");
            return (Criteria) this;
        }

        public Criteria andFushudanweiLessThan(Integer value) {
            addCriterion("FUSHUDANWEI <", value, "fushudanwei");
            return (Criteria) this;
        }

        public Criteria andFushudanweiLessThanOrEqualTo(Integer value) {
            addCriterion("FUSHUDANWEI <=", value, "fushudanwei");
            return (Criteria) this;
        }

        public Criteria andFushudanweiIn(List<Integer> values) {
            addCriterion("FUSHUDANWEI in", values, "fushudanwei");
            return (Criteria) this;
        }

        public Criteria andFushudanweiNotIn(List<Integer> values) {
            addCriterion("FUSHUDANWEI not in", values, "fushudanwei");
            return (Criteria) this;
        }

        public Criteria andFushudanweiBetween(Integer value1, Integer value2) {
            addCriterion("FUSHUDANWEI between", value1, value2, "fushudanwei");
            return (Criteria) this;
        }

        public Criteria andFushudanweiNotBetween(Integer value1, Integer value2) {
            addCriterion("FUSHUDANWEI not between", value1, value2, "fushudanwei");
            return (Criteria) this;
        }

        public Criteria andFujiaodanweiIsNull() {
            addCriterion("FUJIAODANWEI is null");
            return (Criteria) this;
        }

        public Criteria andFujiaodanweiIsNotNull() {
            addCriterion("FUJIAODANWEI is not null");
            return (Criteria) this;
        }

        public Criteria andFujiaodanweiEqualTo(BigDecimal value) {
            addCriterion("FUJIAODANWEI =", value, "fujiaodanwei");
            return (Criteria) this;
        }

        public Criteria andFujiaodanweiNotEqualTo(BigDecimal value) {
            addCriterion("FUJIAODANWEI <>", value, "fujiaodanwei");
            return (Criteria) this;
        }

        public Criteria andFujiaodanweiGreaterThan(BigDecimal value) {
            addCriterion("FUJIAODANWEI >", value, "fujiaodanwei");
            return (Criteria) this;
        }

        public Criteria andFujiaodanweiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FUJIAODANWEI >=", value, "fujiaodanwei");
            return (Criteria) this;
        }

        public Criteria andFujiaodanweiLessThan(BigDecimal value) {
            addCriterion("FUJIAODANWEI <", value, "fujiaodanwei");
            return (Criteria) this;
        }

        public Criteria andFujiaodanweiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FUJIAODANWEI <=", value, "fujiaodanwei");
            return (Criteria) this;
        }

        public Criteria andFujiaodanweiIn(List<BigDecimal> values) {
            addCriterion("FUJIAODANWEI in", values, "fujiaodanwei");
            return (Criteria) this;
        }

        public Criteria andFujiaodanweiNotIn(List<BigDecimal> values) {
            addCriterion("FUJIAODANWEI not in", values, "fujiaodanwei");
            return (Criteria) this;
        }

        public Criteria andFujiaodanweiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUJIAODANWEI between", value1, value2, "fujiaodanwei");
            return (Criteria) this;
        }

        public Criteria andFujiaodanweiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUJIAODANWEI not between", value1, value2, "fujiaodanwei");
            return (Criteria) this;
        }

        public Criteria andFubiaogerenIsNull() {
            addCriterion("FUBIAOGEREN is null");
            return (Criteria) this;
        }

        public Criteria andFubiaogerenIsNotNull() {
            addCriterion("FUBIAOGEREN is not null");
            return (Criteria) this;
        }

        public Criteria andFubiaogerenEqualTo(BigDecimal value) {
            addCriterion("FUBIAOGEREN =", value, "fubiaogeren");
            return (Criteria) this;
        }

        public Criteria andFubiaogerenNotEqualTo(BigDecimal value) {
            addCriterion("FUBIAOGEREN <>", value, "fubiaogeren");
            return (Criteria) this;
        }

        public Criteria andFubiaogerenGreaterThan(BigDecimal value) {
            addCriterion("FUBIAOGEREN >", value, "fubiaogeren");
            return (Criteria) this;
        }

        public Criteria andFubiaogerenGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FUBIAOGEREN >=", value, "fubiaogeren");
            return (Criteria) this;
        }

        public Criteria andFubiaogerenLessThan(BigDecimal value) {
            addCriterion("FUBIAOGEREN <", value, "fubiaogeren");
            return (Criteria) this;
        }

        public Criteria andFubiaogerenLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FUBIAOGEREN <=", value, "fubiaogeren");
            return (Criteria) this;
        }

        public Criteria andFubiaogerenIn(List<BigDecimal> values) {
            addCriterion("FUBIAOGEREN in", values, "fubiaogeren");
            return (Criteria) this;
        }

        public Criteria andFubiaogerenNotIn(List<BigDecimal> values) {
            addCriterion("FUBIAOGEREN not in", values, "fubiaogeren");
            return (Criteria) this;
        }

        public Criteria andFubiaogerenBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUBIAOGEREN between", value1, value2, "fubiaogeren");
            return (Criteria) this;
        }

        public Criteria andFubiaogerenNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUBIAOGEREN not between", value1, value2, "fubiaogeren");
            return (Criteria) this;
        }

        public Criteria andFushugerenIsNull() {
            addCriterion("FUSHUGEREN is null");
            return (Criteria) this;
        }

        public Criteria andFushugerenIsNotNull() {
            addCriterion("FUSHUGEREN is not null");
            return (Criteria) this;
        }

        public Criteria andFushugerenEqualTo(Integer value) {
            addCriterion("FUSHUGEREN =", value, "fushugeren");
            return (Criteria) this;
        }

        public Criteria andFushugerenNotEqualTo(Integer value) {
            addCriterion("FUSHUGEREN <>", value, "fushugeren");
            return (Criteria) this;
        }

        public Criteria andFushugerenGreaterThan(Integer value) {
            addCriterion("FUSHUGEREN >", value, "fushugeren");
            return (Criteria) this;
        }

        public Criteria andFushugerenGreaterThanOrEqualTo(Integer value) {
            addCriterion("FUSHUGEREN >=", value, "fushugeren");
            return (Criteria) this;
        }

        public Criteria andFushugerenLessThan(Integer value) {
            addCriterion("FUSHUGEREN <", value, "fushugeren");
            return (Criteria) this;
        }

        public Criteria andFushugerenLessThanOrEqualTo(Integer value) {
            addCriterion("FUSHUGEREN <=", value, "fushugeren");
            return (Criteria) this;
        }

        public Criteria andFushugerenIn(List<Integer> values) {
            addCriterion("FUSHUGEREN in", values, "fushugeren");
            return (Criteria) this;
        }

        public Criteria andFushugerenNotIn(List<Integer> values) {
            addCriterion("FUSHUGEREN not in", values, "fushugeren");
            return (Criteria) this;
        }

        public Criteria andFushugerenBetween(Integer value1, Integer value2) {
            addCriterion("FUSHUGEREN between", value1, value2, "fushugeren");
            return (Criteria) this;
        }

        public Criteria andFushugerenNotBetween(Integer value1, Integer value2) {
            addCriterion("FUSHUGEREN not between", value1, value2, "fushugeren");
            return (Criteria) this;
        }

        public Criteria andFujiaogerenIsNull() {
            addCriterion("FUJIAOGEREN is null");
            return (Criteria) this;
        }

        public Criteria andFujiaogerenIsNotNull() {
            addCriterion("FUJIAOGEREN is not null");
            return (Criteria) this;
        }

        public Criteria andFujiaogerenEqualTo(BigDecimal value) {
            addCriterion("FUJIAOGEREN =", value, "fujiaogeren");
            return (Criteria) this;
        }

        public Criteria andFujiaogerenNotEqualTo(BigDecimal value) {
            addCriterion("FUJIAOGEREN <>", value, "fujiaogeren");
            return (Criteria) this;
        }

        public Criteria andFujiaogerenGreaterThan(BigDecimal value) {
            addCriterion("FUJIAOGEREN >", value, "fujiaogeren");
            return (Criteria) this;
        }

        public Criteria andFujiaogerenGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FUJIAOGEREN >=", value, "fujiaogeren");
            return (Criteria) this;
        }

        public Criteria andFujiaogerenLessThan(BigDecimal value) {
            addCriterion("FUJIAOGEREN <", value, "fujiaogeren");
            return (Criteria) this;
        }

        public Criteria andFujiaogerenLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FUJIAOGEREN <=", value, "fujiaogeren");
            return (Criteria) this;
        }

        public Criteria andFujiaogerenIn(List<BigDecimal> values) {
            addCriterion("FUJIAOGEREN in", values, "fujiaogeren");
            return (Criteria) this;
        }

        public Criteria andFujiaogerenNotIn(List<BigDecimal> values) {
            addCriterion("FUJIAOGEREN not in", values, "fujiaogeren");
            return (Criteria) this;
        }

        public Criteria andFujiaogerenBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUJIAOGEREN between", value1, value2, "fujiaogeren");
            return (Criteria) this;
        }

        public Criteria andFujiaogerenNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUJIAOGEREN not between", value1, value2, "fujiaogeren");
            return (Criteria) this;
        }

        public Criteria andChangbiaodanweiIsNull() {
            addCriterion("CHANGBIAODANWEI is null");
            return (Criteria) this;
        }

        public Criteria andChangbiaodanweiIsNotNull() {
            addCriterion("CHANGBIAODANWEI is not null");
            return (Criteria) this;
        }

        public Criteria andChangbiaodanweiEqualTo(BigDecimal value) {
            addCriterion("CHANGBIAODANWEI =", value, "changbiaodanwei");
            return (Criteria) this;
        }

        public Criteria andChangbiaodanweiNotEqualTo(BigDecimal value) {
            addCriterion("CHANGBIAODANWEI <>", value, "changbiaodanwei");
            return (Criteria) this;
        }

        public Criteria andChangbiaodanweiGreaterThan(BigDecimal value) {
            addCriterion("CHANGBIAODANWEI >", value, "changbiaodanwei");
            return (Criteria) this;
        }

        public Criteria andChangbiaodanweiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHANGBIAODANWEI >=", value, "changbiaodanwei");
            return (Criteria) this;
        }

        public Criteria andChangbiaodanweiLessThan(BigDecimal value) {
            addCriterion("CHANGBIAODANWEI <", value, "changbiaodanwei");
            return (Criteria) this;
        }

        public Criteria andChangbiaodanweiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHANGBIAODANWEI <=", value, "changbiaodanwei");
            return (Criteria) this;
        }

        public Criteria andChangbiaodanweiIn(List<BigDecimal> values) {
            addCriterion("CHANGBIAODANWEI in", values, "changbiaodanwei");
            return (Criteria) this;
        }

        public Criteria andChangbiaodanweiNotIn(List<BigDecimal> values) {
            addCriterion("CHANGBIAODANWEI not in", values, "changbiaodanwei");
            return (Criteria) this;
        }

        public Criteria andChangbiaodanweiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHANGBIAODANWEI between", value1, value2, "changbiaodanwei");
            return (Criteria) this;
        }

        public Criteria andChangbiaodanweiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHANGBIAODANWEI not between", value1, value2, "changbiaodanwei");
            return (Criteria) this;
        }

        public Criteria andChangshudanweiIsNull() {
            addCriterion("CHANGSHUDANWEI is null");
            return (Criteria) this;
        }

        public Criteria andChangshudanweiIsNotNull() {
            addCriterion("CHANGSHUDANWEI is not null");
            return (Criteria) this;
        }

        public Criteria andChangshudanweiEqualTo(Integer value) {
            addCriterion("CHANGSHUDANWEI =", value, "changshudanwei");
            return (Criteria) this;
        }

        public Criteria andChangshudanweiNotEqualTo(Integer value) {
            addCriterion("CHANGSHUDANWEI <>", value, "changshudanwei");
            return (Criteria) this;
        }

        public Criteria andChangshudanweiGreaterThan(Integer value) {
            addCriterion("CHANGSHUDANWEI >", value, "changshudanwei");
            return (Criteria) this;
        }

        public Criteria andChangshudanweiGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHANGSHUDANWEI >=", value, "changshudanwei");
            return (Criteria) this;
        }

        public Criteria andChangshudanweiLessThan(Integer value) {
            addCriterion("CHANGSHUDANWEI <", value, "changshudanwei");
            return (Criteria) this;
        }

        public Criteria andChangshudanweiLessThanOrEqualTo(Integer value) {
            addCriterion("CHANGSHUDANWEI <=", value, "changshudanwei");
            return (Criteria) this;
        }

        public Criteria andChangshudanweiIn(List<Integer> values) {
            addCriterion("CHANGSHUDANWEI in", values, "changshudanwei");
            return (Criteria) this;
        }

        public Criteria andChangshudanweiNotIn(List<Integer> values) {
            addCriterion("CHANGSHUDANWEI not in", values, "changshudanwei");
            return (Criteria) this;
        }

        public Criteria andChangshudanweiBetween(Integer value1, Integer value2) {
            addCriterion("CHANGSHUDANWEI between", value1, value2, "changshudanwei");
            return (Criteria) this;
        }

        public Criteria andChangshudanweiNotBetween(Integer value1, Integer value2) {
            addCriterion("CHANGSHUDANWEI not between", value1, value2, "changshudanwei");
            return (Criteria) this;
        }

        public Criteria andChangjiaodanweiIsNull() {
            addCriterion("CHANGJIAODANWEI is null");
            return (Criteria) this;
        }

        public Criteria andChangjiaodanweiIsNotNull() {
            addCriterion("CHANGJIAODANWEI is not null");
            return (Criteria) this;
        }

        public Criteria andChangjiaodanweiEqualTo(BigDecimal value) {
            addCriterion("CHANGJIAODANWEI =", value, "changjiaodanwei");
            return (Criteria) this;
        }

        public Criteria andChangjiaodanweiNotEqualTo(BigDecimal value) {
            addCriterion("CHANGJIAODANWEI <>", value, "changjiaodanwei");
            return (Criteria) this;
        }

        public Criteria andChangjiaodanweiGreaterThan(BigDecimal value) {
            addCriterion("CHANGJIAODANWEI >", value, "changjiaodanwei");
            return (Criteria) this;
        }

        public Criteria andChangjiaodanweiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHANGJIAODANWEI >=", value, "changjiaodanwei");
            return (Criteria) this;
        }

        public Criteria andChangjiaodanweiLessThan(BigDecimal value) {
            addCriterion("CHANGJIAODANWEI <", value, "changjiaodanwei");
            return (Criteria) this;
        }

        public Criteria andChangjiaodanweiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHANGJIAODANWEI <=", value, "changjiaodanwei");
            return (Criteria) this;
        }

        public Criteria andChangjiaodanweiIn(List<BigDecimal> values) {
            addCriterion("CHANGJIAODANWEI in", values, "changjiaodanwei");
            return (Criteria) this;
        }

        public Criteria andChangjiaodanweiNotIn(List<BigDecimal> values) {
            addCriterion("CHANGJIAODANWEI not in", values, "changjiaodanwei");
            return (Criteria) this;
        }

        public Criteria andChangjiaodanweiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHANGJIAODANWEI between", value1, value2, "changjiaodanwei");
            return (Criteria) this;
        }

        public Criteria andChangjiaodanweiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHANGJIAODANWEI not between", value1, value2, "changjiaodanwei");
            return (Criteria) this;
        }

        public Criteria andChangbiaogerenIsNull() {
            addCriterion("CHANGBIAOGEREN is null");
            return (Criteria) this;
        }

        public Criteria andChangbiaogerenIsNotNull() {
            addCriterion("CHANGBIAOGEREN is not null");
            return (Criteria) this;
        }

        public Criteria andChangbiaogerenEqualTo(BigDecimal value) {
            addCriterion("CHANGBIAOGEREN =", value, "changbiaogeren");
            return (Criteria) this;
        }

        public Criteria andChangbiaogerenNotEqualTo(BigDecimal value) {
            addCriterion("CHANGBIAOGEREN <>", value, "changbiaogeren");
            return (Criteria) this;
        }

        public Criteria andChangbiaogerenGreaterThan(BigDecimal value) {
            addCriterion("CHANGBIAOGEREN >", value, "changbiaogeren");
            return (Criteria) this;
        }

        public Criteria andChangbiaogerenGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHANGBIAOGEREN >=", value, "changbiaogeren");
            return (Criteria) this;
        }

        public Criteria andChangbiaogerenLessThan(BigDecimal value) {
            addCriterion("CHANGBIAOGEREN <", value, "changbiaogeren");
            return (Criteria) this;
        }

        public Criteria andChangbiaogerenLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHANGBIAOGEREN <=", value, "changbiaogeren");
            return (Criteria) this;
        }

        public Criteria andChangbiaogerenIn(List<BigDecimal> values) {
            addCriterion("CHANGBIAOGEREN in", values, "changbiaogeren");
            return (Criteria) this;
        }

        public Criteria andChangbiaogerenNotIn(List<BigDecimal> values) {
            addCriterion("CHANGBIAOGEREN not in", values, "changbiaogeren");
            return (Criteria) this;
        }

        public Criteria andChangbiaogerenBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHANGBIAOGEREN between", value1, value2, "changbiaogeren");
            return (Criteria) this;
        }

        public Criteria andChangbiaogerenNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHANGBIAOGEREN not between", value1, value2, "changbiaogeren");
            return (Criteria) this;
        }

        public Criteria andChangshugerenIsNull() {
            addCriterion("CHANGSHUGEREN is null");
            return (Criteria) this;
        }

        public Criteria andChangshugerenIsNotNull() {
            addCriterion("CHANGSHUGEREN is not null");
            return (Criteria) this;
        }

        public Criteria andChangshugerenEqualTo(Integer value) {
            addCriterion("CHANGSHUGEREN =", value, "changshugeren");
            return (Criteria) this;
        }

        public Criteria andChangshugerenNotEqualTo(Integer value) {
            addCriterion("CHANGSHUGEREN <>", value, "changshugeren");
            return (Criteria) this;
        }

        public Criteria andChangshugerenGreaterThan(Integer value) {
            addCriterion("CHANGSHUGEREN >", value, "changshugeren");
            return (Criteria) this;
        }

        public Criteria andChangshugerenGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHANGSHUGEREN >=", value, "changshugeren");
            return (Criteria) this;
        }

        public Criteria andChangshugerenLessThan(Integer value) {
            addCriterion("CHANGSHUGEREN <", value, "changshugeren");
            return (Criteria) this;
        }

        public Criteria andChangshugerenLessThanOrEqualTo(Integer value) {
            addCriterion("CHANGSHUGEREN <=", value, "changshugeren");
            return (Criteria) this;
        }

        public Criteria andChangshugerenIn(List<Integer> values) {
            addCriterion("CHANGSHUGEREN in", values, "changshugeren");
            return (Criteria) this;
        }

        public Criteria andChangshugerenNotIn(List<Integer> values) {
            addCriterion("CHANGSHUGEREN not in", values, "changshugeren");
            return (Criteria) this;
        }

        public Criteria andChangshugerenBetween(Integer value1, Integer value2) {
            addCriterion("CHANGSHUGEREN between", value1, value2, "changshugeren");
            return (Criteria) this;
        }

        public Criteria andChangshugerenNotBetween(Integer value1, Integer value2) {
            addCriterion("CHANGSHUGEREN not between", value1, value2, "changshugeren");
            return (Criteria) this;
        }

        public Criteria andChangjiaogerenIsNull() {
            addCriterion("CHANGJIAOGEREN is null");
            return (Criteria) this;
        }

        public Criteria andChangjiaogerenIsNotNull() {
            addCriterion("CHANGJIAOGEREN is not null");
            return (Criteria) this;
        }

        public Criteria andChangjiaogerenEqualTo(BigDecimal value) {
            addCriterion("CHANGJIAOGEREN =", value, "changjiaogeren");
            return (Criteria) this;
        }

        public Criteria andChangjiaogerenNotEqualTo(BigDecimal value) {
            addCriterion("CHANGJIAOGEREN <>", value, "changjiaogeren");
            return (Criteria) this;
        }

        public Criteria andChangjiaogerenGreaterThan(BigDecimal value) {
            addCriterion("CHANGJIAOGEREN >", value, "changjiaogeren");
            return (Criteria) this;
        }

        public Criteria andChangjiaogerenGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHANGJIAOGEREN >=", value, "changjiaogeren");
            return (Criteria) this;
        }

        public Criteria andChangjiaogerenLessThan(BigDecimal value) {
            addCriterion("CHANGJIAOGEREN <", value, "changjiaogeren");
            return (Criteria) this;
        }

        public Criteria andChangjiaogerenLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHANGJIAOGEREN <=", value, "changjiaogeren");
            return (Criteria) this;
        }

        public Criteria andChangjiaogerenIn(List<BigDecimal> values) {
            addCriterion("CHANGJIAOGEREN in", values, "changjiaogeren");
            return (Criteria) this;
        }

        public Criteria andChangjiaogerenNotIn(List<BigDecimal> values) {
            addCriterion("CHANGJIAOGEREN not in", values, "changjiaogeren");
            return (Criteria) this;
        }

        public Criteria andChangjiaogerenBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHANGJIAOGEREN between", value1, value2, "changjiaogeren");
            return (Criteria) this;
        }

        public Criteria andChangjiaogerenNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHANGJIAOGEREN not between", value1, value2, "changjiaogeren");
            return (Criteria) this;
        }

        public Criteria andLishibiaodanweiIsNull() {
            addCriterion("LISHIBIAODANWEI is null");
            return (Criteria) this;
        }

        public Criteria andLishibiaodanweiIsNotNull() {
            addCriterion("LISHIBIAODANWEI is not null");
            return (Criteria) this;
        }

        public Criteria andLishibiaodanweiEqualTo(BigDecimal value) {
            addCriterion("LISHIBIAODANWEI =", value, "lishibiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLishibiaodanweiNotEqualTo(BigDecimal value) {
            addCriterion("LISHIBIAODANWEI <>", value, "lishibiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLishibiaodanweiGreaterThan(BigDecimal value) {
            addCriterion("LISHIBIAODANWEI >", value, "lishibiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLishibiaodanweiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LISHIBIAODANWEI >=", value, "lishibiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLishibiaodanweiLessThan(BigDecimal value) {
            addCriterion("LISHIBIAODANWEI <", value, "lishibiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLishibiaodanweiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LISHIBIAODANWEI <=", value, "lishibiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLishibiaodanweiIn(List<BigDecimal> values) {
            addCriterion("LISHIBIAODANWEI in", values, "lishibiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLishibiaodanweiNotIn(List<BigDecimal> values) {
            addCriterion("LISHIBIAODANWEI not in", values, "lishibiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLishibiaodanweiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LISHIBIAODANWEI between", value1, value2, "lishibiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLishibiaodanweiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LISHIBIAODANWEI not between", value1, value2, "lishibiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLishishudanweiIsNull() {
            addCriterion("LISHISHUDANWEI is null");
            return (Criteria) this;
        }

        public Criteria andLishishudanweiIsNotNull() {
            addCriterion("LISHISHUDANWEI is not null");
            return (Criteria) this;
        }

        public Criteria andLishishudanweiEqualTo(Integer value) {
            addCriterion("LISHISHUDANWEI =", value, "lishishudanwei");
            return (Criteria) this;
        }

        public Criteria andLishishudanweiNotEqualTo(Integer value) {
            addCriterion("LISHISHUDANWEI <>", value, "lishishudanwei");
            return (Criteria) this;
        }

        public Criteria andLishishudanweiGreaterThan(Integer value) {
            addCriterion("LISHISHUDANWEI >", value, "lishishudanwei");
            return (Criteria) this;
        }

        public Criteria andLishishudanweiGreaterThanOrEqualTo(Integer value) {
            addCriterion("LISHISHUDANWEI >=", value, "lishishudanwei");
            return (Criteria) this;
        }

        public Criteria andLishishudanweiLessThan(Integer value) {
            addCriterion("LISHISHUDANWEI <", value, "lishishudanwei");
            return (Criteria) this;
        }

        public Criteria andLishishudanweiLessThanOrEqualTo(Integer value) {
            addCriterion("LISHISHUDANWEI <=", value, "lishishudanwei");
            return (Criteria) this;
        }

        public Criteria andLishishudanweiIn(List<Integer> values) {
            addCriterion("LISHISHUDANWEI in", values, "lishishudanwei");
            return (Criteria) this;
        }

        public Criteria andLishishudanweiNotIn(List<Integer> values) {
            addCriterion("LISHISHUDANWEI not in", values, "lishishudanwei");
            return (Criteria) this;
        }

        public Criteria andLishishudanweiBetween(Integer value1, Integer value2) {
            addCriterion("LISHISHUDANWEI between", value1, value2, "lishishudanwei");
            return (Criteria) this;
        }

        public Criteria andLishishudanweiNotBetween(Integer value1, Integer value2) {
            addCriterion("LISHISHUDANWEI not between", value1, value2, "lishishudanwei");
            return (Criteria) this;
        }

        public Criteria andLishijiaodanweiIsNull() {
            addCriterion("LISHIJIAODANWEI is null");
            return (Criteria) this;
        }

        public Criteria andLishijiaodanweiIsNotNull() {
            addCriterion("LISHIJIAODANWEI is not null");
            return (Criteria) this;
        }

        public Criteria andLishijiaodanweiEqualTo(BigDecimal value) {
            addCriterion("LISHIJIAODANWEI =", value, "lishijiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLishijiaodanweiNotEqualTo(BigDecimal value) {
            addCriterion("LISHIJIAODANWEI <>", value, "lishijiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLishijiaodanweiGreaterThan(BigDecimal value) {
            addCriterion("LISHIJIAODANWEI >", value, "lishijiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLishijiaodanweiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LISHIJIAODANWEI >=", value, "lishijiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLishijiaodanweiLessThan(BigDecimal value) {
            addCriterion("LISHIJIAODANWEI <", value, "lishijiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLishijiaodanweiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LISHIJIAODANWEI <=", value, "lishijiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLishijiaodanweiIn(List<BigDecimal> values) {
            addCriterion("LISHIJIAODANWEI in", values, "lishijiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLishijiaodanweiNotIn(List<BigDecimal> values) {
            addCriterion("LISHIJIAODANWEI not in", values, "lishijiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLishijiaodanweiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LISHIJIAODANWEI between", value1, value2, "lishijiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLishijiaodanweiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LISHIJIAODANWEI not between", value1, value2, "lishijiaodanwei");
            return (Criteria) this;
        }

        public Criteria andLishibiaogerenIsNull() {
            addCriterion("LISHIBIAOGEREN is null");
            return (Criteria) this;
        }

        public Criteria andLishibiaogerenIsNotNull() {
            addCriterion("LISHIBIAOGEREN is not null");
            return (Criteria) this;
        }

        public Criteria andLishibiaogerenEqualTo(BigDecimal value) {
            addCriterion("LISHIBIAOGEREN =", value, "lishibiaogeren");
            return (Criteria) this;
        }

        public Criteria andLishibiaogerenNotEqualTo(BigDecimal value) {
            addCriterion("LISHIBIAOGEREN <>", value, "lishibiaogeren");
            return (Criteria) this;
        }

        public Criteria andLishibiaogerenGreaterThan(BigDecimal value) {
            addCriterion("LISHIBIAOGEREN >", value, "lishibiaogeren");
            return (Criteria) this;
        }

        public Criteria andLishibiaogerenGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LISHIBIAOGEREN >=", value, "lishibiaogeren");
            return (Criteria) this;
        }

        public Criteria andLishibiaogerenLessThan(BigDecimal value) {
            addCriterion("LISHIBIAOGEREN <", value, "lishibiaogeren");
            return (Criteria) this;
        }

        public Criteria andLishibiaogerenLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LISHIBIAOGEREN <=", value, "lishibiaogeren");
            return (Criteria) this;
        }

        public Criteria andLishibiaogerenIn(List<BigDecimal> values) {
            addCriterion("LISHIBIAOGEREN in", values, "lishibiaogeren");
            return (Criteria) this;
        }

        public Criteria andLishibiaogerenNotIn(List<BigDecimal> values) {
            addCriterion("LISHIBIAOGEREN not in", values, "lishibiaogeren");
            return (Criteria) this;
        }

        public Criteria andLishibiaogerenBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LISHIBIAOGEREN between", value1, value2, "lishibiaogeren");
            return (Criteria) this;
        }

        public Criteria andLishibiaogerenNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LISHIBIAOGEREN not between", value1, value2, "lishibiaogeren");
            return (Criteria) this;
        }

        public Criteria andLishishugerenIsNull() {
            addCriterion("LISHISHUGEREN is null");
            return (Criteria) this;
        }

        public Criteria andLishishugerenIsNotNull() {
            addCriterion("LISHISHUGEREN is not null");
            return (Criteria) this;
        }

        public Criteria andLishishugerenEqualTo(Integer value) {
            addCriterion("LISHISHUGEREN =", value, "lishishugeren");
            return (Criteria) this;
        }

        public Criteria andLishishugerenNotEqualTo(Integer value) {
            addCriterion("LISHISHUGEREN <>", value, "lishishugeren");
            return (Criteria) this;
        }

        public Criteria andLishishugerenGreaterThan(Integer value) {
            addCriterion("LISHISHUGEREN >", value, "lishishugeren");
            return (Criteria) this;
        }

        public Criteria andLishishugerenGreaterThanOrEqualTo(Integer value) {
            addCriterion("LISHISHUGEREN >=", value, "lishishugeren");
            return (Criteria) this;
        }

        public Criteria andLishishugerenLessThan(Integer value) {
            addCriterion("LISHISHUGEREN <", value, "lishishugeren");
            return (Criteria) this;
        }

        public Criteria andLishishugerenLessThanOrEqualTo(Integer value) {
            addCriterion("LISHISHUGEREN <=", value, "lishishugeren");
            return (Criteria) this;
        }

        public Criteria andLishishugerenIn(List<Integer> values) {
            addCriterion("LISHISHUGEREN in", values, "lishishugeren");
            return (Criteria) this;
        }

        public Criteria andLishishugerenNotIn(List<Integer> values) {
            addCriterion("LISHISHUGEREN not in", values, "lishishugeren");
            return (Criteria) this;
        }

        public Criteria andLishishugerenBetween(Integer value1, Integer value2) {
            addCriterion("LISHISHUGEREN between", value1, value2, "lishishugeren");
            return (Criteria) this;
        }

        public Criteria andLishishugerenNotBetween(Integer value1, Integer value2) {
            addCriterion("LISHISHUGEREN not between", value1, value2, "lishishugeren");
            return (Criteria) this;
        }

        public Criteria andLishijiaogerenIsNull() {
            addCriterion("LISHIJIAOGEREN is null");
            return (Criteria) this;
        }

        public Criteria andLishijiaogerenIsNotNull() {
            addCriterion("LISHIJIAOGEREN is not null");
            return (Criteria) this;
        }

        public Criteria andLishijiaogerenEqualTo(BigDecimal value) {
            addCriterion("LISHIJIAOGEREN =", value, "lishijiaogeren");
            return (Criteria) this;
        }

        public Criteria andLishijiaogerenNotEqualTo(BigDecimal value) {
            addCriterion("LISHIJIAOGEREN <>", value, "lishijiaogeren");
            return (Criteria) this;
        }

        public Criteria andLishijiaogerenGreaterThan(BigDecimal value) {
            addCriterion("LISHIJIAOGEREN >", value, "lishijiaogeren");
            return (Criteria) this;
        }

        public Criteria andLishijiaogerenGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LISHIJIAOGEREN >=", value, "lishijiaogeren");
            return (Criteria) this;
        }

        public Criteria andLishijiaogerenLessThan(BigDecimal value) {
            addCriterion("LISHIJIAOGEREN <", value, "lishijiaogeren");
            return (Criteria) this;
        }

        public Criteria andLishijiaogerenLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LISHIJIAOGEREN <=", value, "lishijiaogeren");
            return (Criteria) this;
        }

        public Criteria andLishijiaogerenIn(List<BigDecimal> values) {
            addCriterion("LISHIJIAOGEREN in", values, "lishijiaogeren");
            return (Criteria) this;
        }

        public Criteria andLishijiaogerenNotIn(List<BigDecimal> values) {
            addCriterion("LISHIJIAOGEREN not in", values, "lishijiaogeren");
            return (Criteria) this;
        }

        public Criteria andLishijiaogerenBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LISHIJIAOGEREN between", value1, value2, "lishijiaogeren");
            return (Criteria) this;
        }

        public Criteria andLishijiaogerenNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LISHIJIAOGEREN not between", value1, value2, "lishijiaogeren");
            return (Criteria) this;
        }

        public Criteria andHuibiaodanweiIsNull() {
            addCriterion("HUIBIAODANWEI is null");
            return (Criteria) this;
        }

        public Criteria andHuibiaodanweiIsNotNull() {
            addCriterion("HUIBIAODANWEI is not null");
            return (Criteria) this;
        }

        public Criteria andHuibiaodanweiEqualTo(BigDecimal value) {
            addCriterion("HUIBIAODANWEI =", value, "huibiaodanwei");
            return (Criteria) this;
        }

        public Criteria andHuibiaodanweiNotEqualTo(BigDecimal value) {
            addCriterion("HUIBIAODANWEI <>", value, "huibiaodanwei");
            return (Criteria) this;
        }

        public Criteria andHuibiaodanweiGreaterThan(BigDecimal value) {
            addCriterion("HUIBIAODANWEI >", value, "huibiaodanwei");
            return (Criteria) this;
        }

        public Criteria andHuibiaodanweiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HUIBIAODANWEI >=", value, "huibiaodanwei");
            return (Criteria) this;
        }

        public Criteria andHuibiaodanweiLessThan(BigDecimal value) {
            addCriterion("HUIBIAODANWEI <", value, "huibiaodanwei");
            return (Criteria) this;
        }

        public Criteria andHuibiaodanweiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HUIBIAODANWEI <=", value, "huibiaodanwei");
            return (Criteria) this;
        }

        public Criteria andHuibiaodanweiIn(List<BigDecimal> values) {
            addCriterion("HUIBIAODANWEI in", values, "huibiaodanwei");
            return (Criteria) this;
        }

        public Criteria andHuibiaodanweiNotIn(List<BigDecimal> values) {
            addCriterion("HUIBIAODANWEI not in", values, "huibiaodanwei");
            return (Criteria) this;
        }

        public Criteria andHuibiaodanweiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HUIBIAODANWEI between", value1, value2, "huibiaodanwei");
            return (Criteria) this;
        }

        public Criteria andHuibiaodanweiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HUIBIAODANWEI not between", value1, value2, "huibiaodanwei");
            return (Criteria) this;
        }

        public Criteria andHuishudanweiIsNull() {
            addCriterion("HUISHUDANWEI is null");
            return (Criteria) this;
        }

        public Criteria andHuishudanweiIsNotNull() {
            addCriterion("HUISHUDANWEI is not null");
            return (Criteria) this;
        }

        public Criteria andHuishudanweiEqualTo(Integer value) {
            addCriterion("HUISHUDANWEI =", value, "huishudanwei");
            return (Criteria) this;
        }

        public Criteria andHuishudanweiNotEqualTo(Integer value) {
            addCriterion("HUISHUDANWEI <>", value, "huishudanwei");
            return (Criteria) this;
        }

        public Criteria andHuishudanweiGreaterThan(Integer value) {
            addCriterion("HUISHUDANWEI >", value, "huishudanwei");
            return (Criteria) this;
        }

        public Criteria andHuishudanweiGreaterThanOrEqualTo(Integer value) {
            addCriterion("HUISHUDANWEI >=", value, "huishudanwei");
            return (Criteria) this;
        }

        public Criteria andHuishudanweiLessThan(Integer value) {
            addCriterion("HUISHUDANWEI <", value, "huishudanwei");
            return (Criteria) this;
        }

        public Criteria andHuishudanweiLessThanOrEqualTo(Integer value) {
            addCriterion("HUISHUDANWEI <=", value, "huishudanwei");
            return (Criteria) this;
        }

        public Criteria andHuishudanweiIn(List<Integer> values) {
            addCriterion("HUISHUDANWEI in", values, "huishudanwei");
            return (Criteria) this;
        }

        public Criteria andHuishudanweiNotIn(List<Integer> values) {
            addCriterion("HUISHUDANWEI not in", values, "huishudanwei");
            return (Criteria) this;
        }

        public Criteria andHuishudanweiBetween(Integer value1, Integer value2) {
            addCriterion("HUISHUDANWEI between", value1, value2, "huishudanwei");
            return (Criteria) this;
        }

        public Criteria andHuishudanweiNotBetween(Integer value1, Integer value2) {
            addCriterion("HUISHUDANWEI not between", value1, value2, "huishudanwei");
            return (Criteria) this;
        }

        public Criteria andHuijiaodanweiIsNull() {
            addCriterion("HUIJIAODANWEI is null");
            return (Criteria) this;
        }

        public Criteria andHuijiaodanweiIsNotNull() {
            addCriterion("HUIJIAODANWEI is not null");
            return (Criteria) this;
        }

        public Criteria andHuijiaodanweiEqualTo(BigDecimal value) {
            addCriterion("HUIJIAODANWEI =", value, "huijiaodanwei");
            return (Criteria) this;
        }

        public Criteria andHuijiaodanweiNotEqualTo(BigDecimal value) {
            addCriterion("HUIJIAODANWEI <>", value, "huijiaodanwei");
            return (Criteria) this;
        }

        public Criteria andHuijiaodanweiGreaterThan(BigDecimal value) {
            addCriterion("HUIJIAODANWEI >", value, "huijiaodanwei");
            return (Criteria) this;
        }

        public Criteria andHuijiaodanweiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HUIJIAODANWEI >=", value, "huijiaodanwei");
            return (Criteria) this;
        }

        public Criteria andHuijiaodanweiLessThan(BigDecimal value) {
            addCriterion("HUIJIAODANWEI <", value, "huijiaodanwei");
            return (Criteria) this;
        }

        public Criteria andHuijiaodanweiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HUIJIAODANWEI <=", value, "huijiaodanwei");
            return (Criteria) this;
        }

        public Criteria andHuijiaodanweiIn(List<BigDecimal> values) {
            addCriterion("HUIJIAODANWEI in", values, "huijiaodanwei");
            return (Criteria) this;
        }

        public Criteria andHuijiaodanweiNotIn(List<BigDecimal> values) {
            addCriterion("HUIJIAODANWEI not in", values, "huijiaodanwei");
            return (Criteria) this;
        }

        public Criteria andHuijiaodanweiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HUIJIAODANWEI between", value1, value2, "huijiaodanwei");
            return (Criteria) this;
        }

        public Criteria andHuijiaodanweiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HUIJIAODANWEI not between", value1, value2, "huijiaodanwei");
            return (Criteria) this;
        }

        public Criteria andHuibiaogerenIsNull() {
            addCriterion("HUIBIAOGEREN is null");
            return (Criteria) this;
        }

        public Criteria andHuibiaogerenIsNotNull() {
            addCriterion("HUIBIAOGEREN is not null");
            return (Criteria) this;
        }

        public Criteria andHuibiaogerenEqualTo(BigDecimal value) {
            addCriterion("HUIBIAOGEREN =", value, "huibiaogeren");
            return (Criteria) this;
        }

        public Criteria andHuibiaogerenNotEqualTo(BigDecimal value) {
            addCriterion("HUIBIAOGEREN <>", value, "huibiaogeren");
            return (Criteria) this;
        }

        public Criteria andHuibiaogerenGreaterThan(BigDecimal value) {
            addCriterion("HUIBIAOGEREN >", value, "huibiaogeren");
            return (Criteria) this;
        }

        public Criteria andHuibiaogerenGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HUIBIAOGEREN >=", value, "huibiaogeren");
            return (Criteria) this;
        }

        public Criteria andHuibiaogerenLessThan(BigDecimal value) {
            addCriterion("HUIBIAOGEREN <", value, "huibiaogeren");
            return (Criteria) this;
        }

        public Criteria andHuibiaogerenLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HUIBIAOGEREN <=", value, "huibiaogeren");
            return (Criteria) this;
        }

        public Criteria andHuibiaogerenIn(List<BigDecimal> values) {
            addCriterion("HUIBIAOGEREN in", values, "huibiaogeren");
            return (Criteria) this;
        }

        public Criteria andHuibiaogerenNotIn(List<BigDecimal> values) {
            addCriterion("HUIBIAOGEREN not in", values, "huibiaogeren");
            return (Criteria) this;
        }

        public Criteria andHuibiaogerenBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HUIBIAOGEREN between", value1, value2, "huibiaogeren");
            return (Criteria) this;
        }

        public Criteria andHuibiaogerenNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HUIBIAOGEREN not between", value1, value2, "huibiaogeren");
            return (Criteria) this;
        }

        public Criteria andHuishugerenIsNull() {
            addCriterion("HUISHUGEREN is null");
            return (Criteria) this;
        }

        public Criteria andHuishugerenIsNotNull() {
            addCriterion("HUISHUGEREN is not null");
            return (Criteria) this;
        }

        public Criteria andHuishugerenEqualTo(Integer value) {
            addCriterion("HUISHUGEREN =", value, "huishugeren");
            return (Criteria) this;
        }

        public Criteria andHuishugerenNotEqualTo(Integer value) {
            addCriterion("HUISHUGEREN <>", value, "huishugeren");
            return (Criteria) this;
        }

        public Criteria andHuishugerenGreaterThan(Integer value) {
            addCriterion("HUISHUGEREN >", value, "huishugeren");
            return (Criteria) this;
        }

        public Criteria andHuishugerenGreaterThanOrEqualTo(Integer value) {
            addCriterion("HUISHUGEREN >=", value, "huishugeren");
            return (Criteria) this;
        }

        public Criteria andHuishugerenLessThan(Integer value) {
            addCriterion("HUISHUGEREN <", value, "huishugeren");
            return (Criteria) this;
        }

        public Criteria andHuishugerenLessThanOrEqualTo(Integer value) {
            addCriterion("HUISHUGEREN <=", value, "huishugeren");
            return (Criteria) this;
        }

        public Criteria andHuishugerenIn(List<Integer> values) {
            addCriterion("HUISHUGEREN in", values, "huishugeren");
            return (Criteria) this;
        }

        public Criteria andHuishugerenNotIn(List<Integer> values) {
            addCriterion("HUISHUGEREN not in", values, "huishugeren");
            return (Criteria) this;
        }

        public Criteria andHuishugerenBetween(Integer value1, Integer value2) {
            addCriterion("HUISHUGEREN between", value1, value2, "huishugeren");
            return (Criteria) this;
        }

        public Criteria andHuishugerenNotBetween(Integer value1, Integer value2) {
            addCriterion("HUISHUGEREN not between", value1, value2, "huishugeren");
            return (Criteria) this;
        }

        public Criteria andHuijiaogerenIsNull() {
            addCriterion("HUIJIAOGEREN is null");
            return (Criteria) this;
        }

        public Criteria andHuijiaogerenIsNotNull() {
            addCriterion("HUIJIAOGEREN is not null");
            return (Criteria) this;
        }

        public Criteria andHuijiaogerenEqualTo(BigDecimal value) {
            addCriterion("HUIJIAOGEREN =", value, "huijiaogeren");
            return (Criteria) this;
        }

        public Criteria andHuijiaogerenNotEqualTo(BigDecimal value) {
            addCriterion("HUIJIAOGEREN <>", value, "huijiaogeren");
            return (Criteria) this;
        }

        public Criteria andHuijiaogerenGreaterThan(BigDecimal value) {
            addCriterion("HUIJIAOGEREN >", value, "huijiaogeren");
            return (Criteria) this;
        }

        public Criteria andHuijiaogerenGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HUIJIAOGEREN >=", value, "huijiaogeren");
            return (Criteria) this;
        }

        public Criteria andHuijiaogerenLessThan(BigDecimal value) {
            addCriterion("HUIJIAOGEREN <", value, "huijiaogeren");
            return (Criteria) this;
        }

        public Criteria andHuijiaogerenLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HUIJIAOGEREN <=", value, "huijiaogeren");
            return (Criteria) this;
        }

        public Criteria andHuijiaogerenIn(List<BigDecimal> values) {
            addCriterion("HUIJIAOGEREN in", values, "huijiaogeren");
            return (Criteria) this;
        }

        public Criteria andHuijiaogerenNotIn(List<BigDecimal> values) {
            addCriterion("HUIJIAOGEREN not in", values, "huijiaogeren");
            return (Criteria) this;
        }

        public Criteria andHuijiaogerenBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HUIJIAOGEREN between", value1, value2, "huijiaogeren");
            return (Criteria) this;
        }

        public Criteria andHuijiaogerenNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HUIJIAOGEREN not between", value1, value2, "huijiaogeren");
            return (Criteria) this;
        }

        public Criteria andZichanzongeIsNull() {
            addCriterion("ZICHANZONGE is null");
            return (Criteria) this;
        }

        public Criteria andZichanzongeIsNotNull() {
            addCriterion("ZICHANZONGE is not null");
            return (Criteria) this;
        }

        public Criteria andZichanzongeEqualTo(BigDecimal value) {
            addCriterion("ZICHANZONGE =", value, "zichanzonge");
            return (Criteria) this;
        }

        public Criteria andZichanzongeNotEqualTo(BigDecimal value) {
            addCriterion("ZICHANZONGE <>", value, "zichanzonge");
            return (Criteria) this;
        }

        public Criteria andZichanzongeGreaterThan(BigDecimal value) {
            addCriterion("ZICHANZONGE >", value, "zichanzonge");
            return (Criteria) this;
        }

        public Criteria andZichanzongeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZICHANZONGE >=", value, "zichanzonge");
            return (Criteria) this;
        }

        public Criteria andZichanzongeLessThan(BigDecimal value) {
            addCriterion("ZICHANZONGE <", value, "zichanzonge");
            return (Criteria) this;
        }

        public Criteria andZichanzongeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZICHANZONGE <=", value, "zichanzonge");
            return (Criteria) this;
        }

        public Criteria andZichanzongeIn(List<BigDecimal> values) {
            addCriterion("ZICHANZONGE in", values, "zichanzonge");
            return (Criteria) this;
        }

        public Criteria andZichanzongeNotIn(List<BigDecimal> values) {
            addCriterion("ZICHANZONGE not in", values, "zichanzonge");
            return (Criteria) this;
        }

        public Criteria andZichanzongeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZICHANZONGE between", value1, value2, "zichanzonge");
            return (Criteria) this;
        }

        public Criteria andZichanzongeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZICHANZONGE not between", value1, value2, "zichanzonge");
            return (Criteria) this;
        }

        public Criteria andChanzhizongeIsNull() {
            addCriterion("CHANZHIZONGE is null");
            return (Criteria) this;
        }

        public Criteria andChanzhizongeIsNotNull() {
            addCriterion("CHANZHIZONGE is not null");
            return (Criteria) this;
        }

        public Criteria andChanzhizongeEqualTo(BigDecimal value) {
            addCriterion("CHANZHIZONGE =", value, "chanzhizonge");
            return (Criteria) this;
        }

        public Criteria andChanzhizongeNotEqualTo(BigDecimal value) {
            addCriterion("CHANZHIZONGE <>", value, "chanzhizonge");
            return (Criteria) this;
        }

        public Criteria andChanzhizongeGreaterThan(BigDecimal value) {
            addCriterion("CHANZHIZONGE >", value, "chanzhizonge");
            return (Criteria) this;
        }

        public Criteria andChanzhizongeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHANZHIZONGE >=", value, "chanzhizonge");
            return (Criteria) this;
        }

        public Criteria andChanzhizongeLessThan(BigDecimal value) {
            addCriterion("CHANZHIZONGE <", value, "chanzhizonge");
            return (Criteria) this;
        }

        public Criteria andChanzhizongeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHANZHIZONGE <=", value, "chanzhizonge");
            return (Criteria) this;
        }

        public Criteria andChanzhizongeIn(List<BigDecimal> values) {
            addCriterion("CHANZHIZONGE in", values, "chanzhizonge");
            return (Criteria) this;
        }

        public Criteria andChanzhizongeNotIn(List<BigDecimal> values) {
            addCriterion("CHANZHIZONGE not in", values, "chanzhizonge");
            return (Criteria) this;
        }

        public Criteria andChanzhizongeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHANZHIZONGE between", value1, value2, "chanzhizonge");
            return (Criteria) this;
        }

        public Criteria andChanzhizongeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHANZHIZONGE not between", value1, value2, "chanzhizonge");
            return (Criteria) this;
        }

        public Criteria andDanweichanzhiIsNull() {
            addCriterion("DANWEICHANZHI is null");
            return (Criteria) this;
        }

        public Criteria andDanweichanzhiIsNotNull() {
            addCriterion("DANWEICHANZHI is not null");
            return (Criteria) this;
        }

        public Criteria andDanweichanzhiEqualTo(BigDecimal value) {
            addCriterion("DANWEICHANZHI =", value, "danweichanzhi");
            return (Criteria) this;
        }

        public Criteria andDanweichanzhiNotEqualTo(BigDecimal value) {
            addCriterion("DANWEICHANZHI <>", value, "danweichanzhi");
            return (Criteria) this;
        }

        public Criteria andDanweichanzhiGreaterThan(BigDecimal value) {
            addCriterion("DANWEICHANZHI >", value, "danweichanzhi");
            return (Criteria) this;
        }

        public Criteria andDanweichanzhiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DANWEICHANZHI >=", value, "danweichanzhi");
            return (Criteria) this;
        }

        public Criteria andDanweichanzhiLessThan(BigDecimal value) {
            addCriterion("DANWEICHANZHI <", value, "danweichanzhi");
            return (Criteria) this;
        }

        public Criteria andDanweichanzhiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DANWEICHANZHI <=", value, "danweichanzhi");
            return (Criteria) this;
        }

        public Criteria andDanweichanzhiIn(List<BigDecimal> values) {
            addCriterion("DANWEICHANZHI in", values, "danweichanzhi");
            return (Criteria) this;
        }

        public Criteria andDanweichanzhiNotIn(List<BigDecimal> values) {
            addCriterion("DANWEICHANZHI not in", values, "danweichanzhi");
            return (Criteria) this;
        }

        public Criteria andDanweichanzhiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DANWEICHANZHI between", value1, value2, "danweichanzhi");
            return (Criteria) this;
        }

        public Criteria andDanweichanzhiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DANWEICHANZHI not between", value1, value2, "danweichanzhi");
            return (Criteria) this;
        }

        public Criteria andHuiyuanbiliIsNull() {
            addCriterion("HUIYUANBILI is null");
            return (Criteria) this;
        }

        public Criteria andHuiyuanbiliIsNotNull() {
            addCriterion("HUIYUANBILI is not null");
            return (Criteria) this;
        }

        public Criteria andHuiyuanbiliEqualTo(String value) {
            addCriterion("HUIYUANBILI =", value, "huiyuanbili");
            return (Criteria) this;
        }

        public Criteria andHuiyuanbiliNotEqualTo(String value) {
            addCriterion("HUIYUANBILI <>", value, "huiyuanbili");
            return (Criteria) this;
        }

        public Criteria andHuiyuanbiliGreaterThan(String value) {
            addCriterion("HUIYUANBILI >", value, "huiyuanbili");
            return (Criteria) this;
        }

        public Criteria andHuiyuanbiliGreaterThanOrEqualTo(String value) {
            addCriterion("HUIYUANBILI >=", value, "huiyuanbili");
            return (Criteria) this;
        }

        public Criteria andHuiyuanbiliLessThan(String value) {
            addCriterion("HUIYUANBILI <", value, "huiyuanbili");
            return (Criteria) this;
        }

        public Criteria andHuiyuanbiliLessThanOrEqualTo(String value) {
            addCriterion("HUIYUANBILI <=", value, "huiyuanbili");
            return (Criteria) this;
        }

        public Criteria andHuiyuanbiliLike(String value) {
            addCriterion("HUIYUANBILI like", value, "huiyuanbili");
            return (Criteria) this;
        }

        public Criteria andHuiyuanbiliNotLike(String value) {
            addCriterion("HUIYUANBILI not like", value, "huiyuanbili");
            return (Criteria) this;
        }

        public Criteria andHuiyuanbiliIn(List<String> values) {
            addCriterion("HUIYUANBILI in", values, "huiyuanbili");
            return (Criteria) this;
        }

        public Criteria andHuiyuanbiliNotIn(List<String> values) {
            addCriterion("HUIYUANBILI not in", values, "huiyuanbili");
            return (Criteria) this;
        }

        public Criteria andHuiyuanbiliBetween(String value1, String value2) {
            addCriterion("HUIYUANBILI between", value1, value2, "huiyuanbili");
            return (Criteria) this;
        }

        public Criteria andHuiyuanbiliNotBetween(String value1, String value2) {
            addCriterion("HUIYUANBILI not between", value1, value2, "huiyuanbili");
            return (Criteria) this;
        }

        public Criteria andShitishuliangIsNull() {
            addCriterion("SHITISHULIANG is null");
            return (Criteria) this;
        }

        public Criteria andShitishuliangIsNotNull() {
            addCriterion("SHITISHULIANG is not null");
            return (Criteria) this;
        }

        public Criteria andShitishuliangEqualTo(Integer value) {
            addCriterion("SHITISHULIANG =", value, "shitishuliang");
            return (Criteria) this;
        }

        public Criteria andShitishuliangNotEqualTo(Integer value) {
            addCriterion("SHITISHULIANG <>", value, "shitishuliang");
            return (Criteria) this;
        }

        public Criteria andShitishuliangGreaterThan(Integer value) {
            addCriterion("SHITISHULIANG >", value, "shitishuliang");
            return (Criteria) this;
        }

        public Criteria andShitishuliangGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHITISHULIANG >=", value, "shitishuliang");
            return (Criteria) this;
        }

        public Criteria andShitishuliangLessThan(Integer value) {
            addCriterion("SHITISHULIANG <", value, "shitishuliang");
            return (Criteria) this;
        }

        public Criteria andShitishuliangLessThanOrEqualTo(Integer value) {
            addCriterion("SHITISHULIANG <=", value, "shitishuliang");
            return (Criteria) this;
        }

        public Criteria andShitishuliangIn(List<Integer> values) {
            addCriterion("SHITISHULIANG in", values, "shitishuliang");
            return (Criteria) this;
        }

        public Criteria andShitishuliangNotIn(List<Integer> values) {
            addCriterion("SHITISHULIANG not in", values, "shitishuliang");
            return (Criteria) this;
        }

        public Criteria andShitishuliangBetween(Integer value1, Integer value2) {
            addCriterion("SHITISHULIANG between", value1, value2, "shitishuliang");
            return (Criteria) this;
        }

        public Criteria andShitishuliangNotBetween(Integer value1, Integer value2) {
            addCriterion("SHITISHULIANG not between", value1, value2, "shitishuliang");
            return (Criteria) this;
        }

        public Criteria andShitichanzhiIsNull() {
            addCriterion("SHITICHANZHI is null");
            return (Criteria) this;
        }

        public Criteria andShitichanzhiIsNotNull() {
            addCriterion("SHITICHANZHI is not null");
            return (Criteria) this;
        }

        public Criteria andShitichanzhiEqualTo(BigDecimal value) {
            addCriterion("SHITICHANZHI =", value, "shitichanzhi");
            return (Criteria) this;
        }

        public Criteria andShitichanzhiNotEqualTo(BigDecimal value) {
            addCriterion("SHITICHANZHI <>", value, "shitichanzhi");
            return (Criteria) this;
        }

        public Criteria andShitichanzhiGreaterThan(BigDecimal value) {
            addCriterion("SHITICHANZHI >", value, "shitichanzhi");
            return (Criteria) this;
        }

        public Criteria andShitichanzhiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHITICHANZHI >=", value, "shitichanzhi");
            return (Criteria) this;
        }

        public Criteria andShitichanzhiLessThan(BigDecimal value) {
            addCriterion("SHITICHANZHI <", value, "shitichanzhi");
            return (Criteria) this;
        }

        public Criteria andShitichanzhiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHITICHANZHI <=", value, "shitichanzhi");
            return (Criteria) this;
        }

        public Criteria andShitichanzhiIn(List<BigDecimal> values) {
            addCriterion("SHITICHANZHI in", values, "shitichanzhi");
            return (Criteria) this;
        }

        public Criteria andShitichanzhiNotIn(List<BigDecimal> values) {
            addCriterion("SHITICHANZHI not in", values, "shitichanzhi");
            return (Criteria) this;
        }

        public Criteria andShitichanzhiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHITICHANZHI between", value1, value2, "shitichanzhi");
            return (Criteria) this;
        }

        public Criteria andShitichanzhiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHITICHANZHI not between", value1, value2, "shitichanzhi");
            return (Criteria) this;
        }

        public Criteria andXinarenshuIsNull() {
            addCriterion("XINARENSHU is null");
            return (Criteria) this;
        }

        public Criteria andXinarenshuIsNotNull() {
            addCriterion("XINARENSHU is not null");
            return (Criteria) this;
        }

        public Criteria andXinarenshuEqualTo(Integer value) {
            addCriterion("XINARENSHU =", value, "xinarenshu");
            return (Criteria) this;
        }

        public Criteria andXinarenshuNotEqualTo(Integer value) {
            addCriterion("XINARENSHU <>", value, "xinarenshu");
            return (Criteria) this;
        }

        public Criteria andXinarenshuGreaterThan(Integer value) {
            addCriterion("XINARENSHU >", value, "xinarenshu");
            return (Criteria) this;
        }

        public Criteria andXinarenshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("XINARENSHU >=", value, "xinarenshu");
            return (Criteria) this;
        }

        public Criteria andXinarenshuLessThan(Integer value) {
            addCriterion("XINARENSHU <", value, "xinarenshu");
            return (Criteria) this;
        }

        public Criteria andXinarenshuLessThanOrEqualTo(Integer value) {
            addCriterion("XINARENSHU <=", value, "xinarenshu");
            return (Criteria) this;
        }

        public Criteria andXinarenshuIn(List<Integer> values) {
            addCriterion("XINARENSHU in", values, "xinarenshu");
            return (Criteria) this;
        }

        public Criteria andXinarenshuNotIn(List<Integer> values) {
            addCriterion("XINARENSHU not in", values, "xinarenshu");
            return (Criteria) this;
        }

        public Criteria andXinarenshuBetween(Integer value1, Integer value2) {
            addCriterion("XINARENSHU between", value1, value2, "xinarenshu");
            return (Criteria) this;
        }

        public Criteria andXinarenshuNotBetween(Integer value1, Integer value2) {
            addCriterion("XINARENSHU not between", value1, value2, "xinarenshu");
            return (Criteria) this;
        }

        public Criteria andJianyishuliangIsNull() {
            addCriterion("JIANYISHULIANG is null");
            return (Criteria) this;
        }

        public Criteria andJianyishuliangIsNotNull() {
            addCriterion("JIANYISHULIANG is not null");
            return (Criteria) this;
        }

        public Criteria andJianyishuliangEqualTo(String value) {
            addCriterion("JIANYISHULIANG =", value, "jianyishuliang");
            return (Criteria) this;
        }

        public Criteria andJianyishuliangNotEqualTo(String value) {
            addCriterion("JIANYISHULIANG <>", value, "jianyishuliang");
            return (Criteria) this;
        }

        public Criteria andJianyishuliangGreaterThan(String value) {
            addCriterion("JIANYISHULIANG >", value, "jianyishuliang");
            return (Criteria) this;
        }

        public Criteria andJianyishuliangGreaterThanOrEqualTo(String value) {
            addCriterion("JIANYISHULIANG >=", value, "jianyishuliang");
            return (Criteria) this;
        }

        public Criteria andJianyishuliangLessThan(String value) {
            addCriterion("JIANYISHULIANG <", value, "jianyishuliang");
            return (Criteria) this;
        }

        public Criteria andJianyishuliangLessThanOrEqualTo(String value) {
            addCriterion("JIANYISHULIANG <=", value, "jianyishuliang");
            return (Criteria) this;
        }

        public Criteria andJianyishuliangLike(String value) {
            addCriterion("JIANYISHULIANG like", value, "jianyishuliang");
            return (Criteria) this;
        }

        public Criteria andJianyishuliangNotLike(String value) {
            addCriterion("JIANYISHULIANG not like", value, "jianyishuliang");
            return (Criteria) this;
        }

        public Criteria andJianyishuliangIn(List<String> values) {
            addCriterion("JIANYISHULIANG in", values, "jianyishuliang");
            return (Criteria) this;
        }

        public Criteria andJianyishuliangNotIn(List<String> values) {
            addCriterion("JIANYISHULIANG not in", values, "jianyishuliang");
            return (Criteria) this;
        }

        public Criteria andJianyishuliangBetween(String value1, String value2) {
            addCriterion("JIANYISHULIANG between", value1, value2, "jianyishuliang");
            return (Criteria) this;
        }

        public Criteria andJianyishuliangNotBetween(String value1, String value2) {
            addCriterion("JIANYISHULIANG not between", value1, value2, "jianyishuliang");
            return (Criteria) this;
        }

        public Criteria andMujizijinIsNull() {
            addCriterion("MUJIZIJIN is null");
            return (Criteria) this;
        }

        public Criteria andMujizijinIsNotNull() {
            addCriterion("MUJIZIJIN is not null");
            return (Criteria) this;
        }

        public Criteria andMujizijinEqualTo(BigDecimal value) {
            addCriterion("MUJIZIJIN =", value, "mujizijin");
            return (Criteria) this;
        }

        public Criteria andMujizijinNotEqualTo(BigDecimal value) {
            addCriterion("MUJIZIJIN <>", value, "mujizijin");
            return (Criteria) this;
        }

        public Criteria andMujizijinGreaterThan(BigDecimal value) {
            addCriterion("MUJIZIJIN >", value, "mujizijin");
            return (Criteria) this;
        }

        public Criteria andMujizijinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MUJIZIJIN >=", value, "mujizijin");
            return (Criteria) this;
        }

        public Criteria andMujizijinLessThan(BigDecimal value) {
            addCriterion("MUJIZIJIN <", value, "mujizijin");
            return (Criteria) this;
        }

        public Criteria andMujizijinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MUJIZIJIN <=", value, "mujizijin");
            return (Criteria) this;
        }

        public Criteria andMujizijinIn(List<BigDecimal> values) {
            addCriterion("MUJIZIJIN in", values, "mujizijin");
            return (Criteria) this;
        }

        public Criteria andMujizijinNotIn(List<BigDecimal> values) {
            addCriterion("MUJIZIJIN not in", values, "mujizijin");
            return (Criteria) this;
        }

        public Criteria andMujizijinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MUJIZIJIN between", value1, value2, "mujizijin");
            return (Criteria) this;
        }

        public Criteria andMujizijinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MUJIZIJIN not between", value1, value2, "mujizijin");
            return (Criteria) this;
        }

        public Criteria andHuijirenqunIsNull() {
            addCriterion("HUIJIRENQUN is null");
            return (Criteria) this;
        }

        public Criteria andHuijirenqunIsNotNull() {
            addCriterion("HUIJIRENQUN is not null");
            return (Criteria) this;
        }

        public Criteria andHuijirenqunEqualTo(Integer value) {
            addCriterion("HUIJIRENQUN =", value, "huijirenqun");
            return (Criteria) this;
        }

        public Criteria andHuijirenqunNotEqualTo(Integer value) {
            addCriterion("HUIJIRENQUN <>", value, "huijirenqun");
            return (Criteria) this;
        }

        public Criteria andHuijirenqunGreaterThan(Integer value) {
            addCriterion("HUIJIRENQUN >", value, "huijirenqun");
            return (Criteria) this;
        }

        public Criteria andHuijirenqunGreaterThanOrEqualTo(Integer value) {
            addCriterion("HUIJIRENQUN >=", value, "huijirenqun");
            return (Criteria) this;
        }

        public Criteria andHuijirenqunLessThan(Integer value) {
            addCriterion("HUIJIRENQUN <", value, "huijirenqun");
            return (Criteria) this;
        }

        public Criteria andHuijirenqunLessThanOrEqualTo(Integer value) {
            addCriterion("HUIJIRENQUN <=", value, "huijirenqun");
            return (Criteria) this;
        }

        public Criteria andHuijirenqunIn(List<Integer> values) {
            addCriterion("HUIJIRENQUN in", values, "huijirenqun");
            return (Criteria) this;
        }

        public Criteria andHuijirenqunNotIn(List<Integer> values) {
            addCriterion("HUIJIRENQUN not in", values, "huijirenqun");
            return (Criteria) this;
        }

        public Criteria andHuijirenqunBetween(Integer value1, Integer value2) {
            addCriterion("HUIJIRENQUN between", value1, value2, "huijirenqun");
            return (Criteria) this;
        }

        public Criteria andHuijirenqunNotBetween(Integer value1, Integer value2) {
            addCriterion("HUIJIRENQUN not between", value1, value2, "huijirenqun");
            return (Criteria) this;
        }

        public Criteria andJiuyegangweiIsNull() {
            addCriterion("JIUYEGANGWEI is null");
            return (Criteria) this;
        }

        public Criteria andJiuyegangweiIsNotNull() {
            addCriterion("JIUYEGANGWEI is not null");
            return (Criteria) this;
        }

        public Criteria andJiuyegangweiEqualTo(Integer value) {
            addCriterion("JIUYEGANGWEI =", value, "jiuyegangwei");
            return (Criteria) this;
        }

        public Criteria andJiuyegangweiNotEqualTo(Integer value) {
            addCriterion("JIUYEGANGWEI <>", value, "jiuyegangwei");
            return (Criteria) this;
        }

        public Criteria andJiuyegangweiGreaterThan(Integer value) {
            addCriterion("JIUYEGANGWEI >", value, "jiuyegangwei");
            return (Criteria) this;
        }

        public Criteria andJiuyegangweiGreaterThanOrEqualTo(Integer value) {
            addCriterion("JIUYEGANGWEI >=", value, "jiuyegangwei");
            return (Criteria) this;
        }

        public Criteria andJiuyegangweiLessThan(Integer value) {
            addCriterion("JIUYEGANGWEI <", value, "jiuyegangwei");
            return (Criteria) this;
        }

        public Criteria andJiuyegangweiLessThanOrEqualTo(Integer value) {
            addCriterion("JIUYEGANGWEI <=", value, "jiuyegangwei");
            return (Criteria) this;
        }

        public Criteria andJiuyegangweiIn(List<Integer> values) {
            addCriterion("JIUYEGANGWEI in", values, "jiuyegangwei");
            return (Criteria) this;
        }

        public Criteria andJiuyegangweiNotIn(List<Integer> values) {
            addCriterion("JIUYEGANGWEI not in", values, "jiuyegangwei");
            return (Criteria) this;
        }

        public Criteria andJiuyegangweiBetween(Integer value1, Integer value2) {
            addCriterion("JIUYEGANGWEI between", value1, value2, "jiuyegangwei");
            return (Criteria) this;
        }

        public Criteria andJiuyegangweiNotBetween(Integer value1, Integer value2) {
            addCriterion("JIUYEGANGWEI not between", value1, value2, "jiuyegangwei");
            return (Criteria) this;
        }

        public Criteria andXinzengshouruIsNull() {
            addCriterion("XINZENGSHOURU is null");
            return (Criteria) this;
        }

        public Criteria andXinzengshouruIsNotNull() {
            addCriterion("XINZENGSHOURU is not null");
            return (Criteria) this;
        }

        public Criteria andXinzengshouruEqualTo(BigDecimal value) {
            addCriterion("XINZENGSHOURU =", value, "xinzengshouru");
            return (Criteria) this;
        }

        public Criteria andXinzengshouruNotEqualTo(BigDecimal value) {
            addCriterion("XINZENGSHOURU <>", value, "xinzengshouru");
            return (Criteria) this;
        }

        public Criteria andXinzengshouruGreaterThan(BigDecimal value) {
            addCriterion("XINZENGSHOURU >", value, "xinzengshouru");
            return (Criteria) this;
        }

        public Criteria andXinzengshouruGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XINZENGSHOURU >=", value, "xinzengshouru");
            return (Criteria) this;
        }

        public Criteria andXinzengshouruLessThan(BigDecimal value) {
            addCriterion("XINZENGSHOURU <", value, "xinzengshouru");
            return (Criteria) this;
        }

        public Criteria andXinzengshouruLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XINZENGSHOURU <=", value, "xinzengshouru");
            return (Criteria) this;
        }

        public Criteria andXinzengshouruIn(List<BigDecimal> values) {
            addCriterion("XINZENGSHOURU in", values, "xinzengshouru");
            return (Criteria) this;
        }

        public Criteria andXinzengshouruNotIn(List<BigDecimal> values) {
            addCriterion("XINZENGSHOURU not in", values, "xinzengshouru");
            return (Criteria) this;
        }

        public Criteria andXinzengshouruBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XINZENGSHOURU between", value1, value2, "xinzengshouru");
            return (Criteria) this;
        }

        public Criteria andXinzengshouruNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XINZENGSHOURU not between", value1, value2, "xinzengshouru");
            return (Criteria) this;
        }

        public Criteria andTanpancishuIsNull() {
            addCriterion("TANPANCISHU is null");
            return (Criteria) this;
        }

        public Criteria andTanpancishuIsNotNull() {
            addCriterion("TANPANCISHU is not null");
            return (Criteria) this;
        }

        public Criteria andTanpancishuEqualTo(Integer value) {
            addCriterion("TANPANCISHU =", value, "tanpancishu");
            return (Criteria) this;
        }

        public Criteria andTanpancishuNotEqualTo(Integer value) {
            addCriterion("TANPANCISHU <>", value, "tanpancishu");
            return (Criteria) this;
        }

        public Criteria andTanpancishuGreaterThan(Integer value) {
            addCriterion("TANPANCISHU >", value, "tanpancishu");
            return (Criteria) this;
        }

        public Criteria andTanpancishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("TANPANCISHU >=", value, "tanpancishu");
            return (Criteria) this;
        }

        public Criteria andTanpancishuLessThan(Integer value) {
            addCriterion("TANPANCISHU <", value, "tanpancishu");
            return (Criteria) this;
        }

        public Criteria andTanpancishuLessThanOrEqualTo(Integer value) {
            addCriterion("TANPANCISHU <=", value, "tanpancishu");
            return (Criteria) this;
        }

        public Criteria andTanpancishuIn(List<Integer> values) {
            addCriterion("TANPANCISHU in", values, "tanpancishu");
            return (Criteria) this;
        }

        public Criteria andTanpancishuNotIn(List<Integer> values) {
            addCriterion("TANPANCISHU not in", values, "tanpancishu");
            return (Criteria) this;
        }

        public Criteria andTanpancishuBetween(Integer value1, Integer value2) {
            addCriterion("TANPANCISHU between", value1, value2, "tanpancishu");
            return (Criteria) this;
        }

        public Criteria andTanpancishuNotBetween(Integer value1, Integer value2) {
            addCriterion("TANPANCISHU not between", value1, value2, "tanpancishu");
            return (Criteria) this;
        }

        public Criteria andTanpanqingkuangIsNull() {
            addCriterion("TANPANQINGKUANG is null");
            return (Criteria) this;
        }

        public Criteria andTanpanqingkuangIsNotNull() {
            addCriterion("TANPANQINGKUANG is not null");
            return (Criteria) this;
        }

        public Criteria andTanpanqingkuangEqualTo(String value) {
            addCriterion("TANPANQINGKUANG =", value, "tanpanqingkuang");
            return (Criteria) this;
        }

        public Criteria andTanpanqingkuangNotEqualTo(String value) {
            addCriterion("TANPANQINGKUANG <>", value, "tanpanqingkuang");
            return (Criteria) this;
        }

        public Criteria andTanpanqingkuangGreaterThan(String value) {
            addCriterion("TANPANQINGKUANG >", value, "tanpanqingkuang");
            return (Criteria) this;
        }

        public Criteria andTanpanqingkuangGreaterThanOrEqualTo(String value) {
            addCriterion("TANPANQINGKUANG >=", value, "tanpanqingkuang");
            return (Criteria) this;
        }

        public Criteria andTanpanqingkuangLessThan(String value) {
            addCriterion("TANPANQINGKUANG <", value, "tanpanqingkuang");
            return (Criteria) this;
        }

        public Criteria andTanpanqingkuangLessThanOrEqualTo(String value) {
            addCriterion("TANPANQINGKUANG <=", value, "tanpanqingkuang");
            return (Criteria) this;
        }

        public Criteria andTanpanqingkuangLike(String value) {
            addCriterion("TANPANQINGKUANG like", value, "tanpanqingkuang");
            return (Criteria) this;
        }

        public Criteria andTanpanqingkuangNotLike(String value) {
            addCriterion("TANPANQINGKUANG not like", value, "tanpanqingkuang");
            return (Criteria) this;
        }

        public Criteria andTanpanqingkuangIn(List<String> values) {
            addCriterion("TANPANQINGKUANG in", values, "tanpanqingkuang");
            return (Criteria) this;
        }

        public Criteria andTanpanqingkuangNotIn(List<String> values) {
            addCriterion("TANPANQINGKUANG not in", values, "tanpanqingkuang");
            return (Criteria) this;
        }

        public Criteria andTanpanqingkuangBetween(String value1, String value2) {
            addCriterion("TANPANQINGKUANG between", value1, value2, "tanpanqingkuang");
            return (Criteria) this;
        }

        public Criteria andTanpanqingkuangNotBetween(String value1, String value2) {
            addCriterion("TANPANQINGKUANG not between", value1, value2, "tanpanqingkuang");
            return (Criteria) this;
        }

        public Criteria andXingdongcishuIsNull() {
            addCriterion("XINGDONGCISHU is null");
            return (Criteria) this;
        }

        public Criteria andXingdongcishuIsNotNull() {
            addCriterion("XINGDONGCISHU is not null");
            return (Criteria) this;
        }

        public Criteria andXingdongcishuEqualTo(Integer value) {
            addCriterion("XINGDONGCISHU =", value, "xingdongcishu");
            return (Criteria) this;
        }

        public Criteria andXingdongcishuNotEqualTo(Integer value) {
            addCriterion("XINGDONGCISHU <>", value, "xingdongcishu");
            return (Criteria) this;
        }

        public Criteria andXingdongcishuGreaterThan(Integer value) {
            addCriterion("XINGDONGCISHU >", value, "xingdongcishu");
            return (Criteria) this;
        }

        public Criteria andXingdongcishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("XINGDONGCISHU >=", value, "xingdongcishu");
            return (Criteria) this;
        }

        public Criteria andXingdongcishuLessThan(Integer value) {
            addCriterion("XINGDONGCISHU <", value, "xingdongcishu");
            return (Criteria) this;
        }

        public Criteria andXingdongcishuLessThanOrEqualTo(Integer value) {
            addCriterion("XINGDONGCISHU <=", value, "xingdongcishu");
            return (Criteria) this;
        }

        public Criteria andXingdongcishuIn(List<Integer> values) {
            addCriterion("XINGDONGCISHU in", values, "xingdongcishu");
            return (Criteria) this;
        }

        public Criteria andXingdongcishuNotIn(List<Integer> values) {
            addCriterion("XINGDONGCISHU not in", values, "xingdongcishu");
            return (Criteria) this;
        }

        public Criteria andXingdongcishuBetween(Integer value1, Integer value2) {
            addCriterion("XINGDONGCISHU between", value1, value2, "xingdongcishu");
            return (Criteria) this;
        }

        public Criteria andXingdongcishuNotBetween(Integer value1, Integer value2) {
            addCriterion("XINGDONGCISHU not between", value1, value2, "xingdongcishu");
            return (Criteria) this;
        }

        public Criteria andXingdongqingkuangIsNull() {
            addCriterion("XINGDONGQINGKUANG is null");
            return (Criteria) this;
        }

        public Criteria andXingdongqingkuangIsNotNull() {
            addCriterion("XINGDONGQINGKUANG is not null");
            return (Criteria) this;
        }

        public Criteria andXingdongqingkuangEqualTo(String value) {
            addCriterion("XINGDONGQINGKUANG =", value, "xingdongqingkuang");
            return (Criteria) this;
        }

        public Criteria andXingdongqingkuangNotEqualTo(String value) {
            addCriterion("XINGDONGQINGKUANG <>", value, "xingdongqingkuang");
            return (Criteria) this;
        }

        public Criteria andXingdongqingkuangGreaterThan(String value) {
            addCriterion("XINGDONGQINGKUANG >", value, "xingdongqingkuang");
            return (Criteria) this;
        }

        public Criteria andXingdongqingkuangGreaterThanOrEqualTo(String value) {
            addCriterion("XINGDONGQINGKUANG >=", value, "xingdongqingkuang");
            return (Criteria) this;
        }

        public Criteria andXingdongqingkuangLessThan(String value) {
            addCriterion("XINGDONGQINGKUANG <", value, "xingdongqingkuang");
            return (Criteria) this;
        }

        public Criteria andXingdongqingkuangLessThanOrEqualTo(String value) {
            addCriterion("XINGDONGQINGKUANG <=", value, "xingdongqingkuang");
            return (Criteria) this;
        }

        public Criteria andXingdongqingkuangLike(String value) {
            addCriterion("XINGDONGQINGKUANG like", value, "xingdongqingkuang");
            return (Criteria) this;
        }

        public Criteria andXingdongqingkuangNotLike(String value) {
            addCriterion("XINGDONGQINGKUANG not like", value, "xingdongqingkuang");
            return (Criteria) this;
        }

        public Criteria andXingdongqingkuangIn(List<String> values) {
            addCriterion("XINGDONGQINGKUANG in", values, "xingdongqingkuang");
            return (Criteria) this;
        }

        public Criteria andXingdongqingkuangNotIn(List<String> values) {
            addCriterion("XINGDONGQINGKUANG not in", values, "xingdongqingkuang");
            return (Criteria) this;
        }

        public Criteria andXingdongqingkuangBetween(String value1, String value2) {
            addCriterion("XINGDONGQINGKUANG between", value1, value2, "xingdongqingkuang");
            return (Criteria) this;
        }

        public Criteria andXingdongqingkuangNotBetween(String value1, String value2) {
            addCriterion("XINGDONGQINGKUANG not between", value1, value2, "xingdongqingkuang");
            return (Criteria) this;
        }

        public Criteria andHuodongqingkuangIsNull() {
            addCriterion("HUODONGQINGKUANG is null");
            return (Criteria) this;
        }

        public Criteria andHuodongqingkuangIsNotNull() {
            addCriterion("HUODONGQINGKUANG is not null");
            return (Criteria) this;
        }

        public Criteria andHuodongqingkuangEqualTo(String value) {
            addCriterion("HUODONGQINGKUANG =", value, "huodongqingkuang");
            return (Criteria) this;
        }

        public Criteria andHuodongqingkuangNotEqualTo(String value) {
            addCriterion("HUODONGQINGKUANG <>", value, "huodongqingkuang");
            return (Criteria) this;
        }

        public Criteria andHuodongqingkuangGreaterThan(String value) {
            addCriterion("HUODONGQINGKUANG >", value, "huodongqingkuang");
            return (Criteria) this;
        }

        public Criteria andHuodongqingkuangGreaterThanOrEqualTo(String value) {
            addCriterion("HUODONGQINGKUANG >=", value, "huodongqingkuang");
            return (Criteria) this;
        }

        public Criteria andHuodongqingkuangLessThan(String value) {
            addCriterion("HUODONGQINGKUANG <", value, "huodongqingkuang");
            return (Criteria) this;
        }

        public Criteria andHuodongqingkuangLessThanOrEqualTo(String value) {
            addCriterion("HUODONGQINGKUANG <=", value, "huodongqingkuang");
            return (Criteria) this;
        }

        public Criteria andHuodongqingkuangLike(String value) {
            addCriterion("HUODONGQINGKUANG like", value, "huodongqingkuang");
            return (Criteria) this;
        }

        public Criteria andHuodongqingkuangNotLike(String value) {
            addCriterion("HUODONGQINGKUANG not like", value, "huodongqingkuang");
            return (Criteria) this;
        }

        public Criteria andHuodongqingkuangIn(List<String> values) {
            addCriterion("HUODONGQINGKUANG in", values, "huodongqingkuang");
            return (Criteria) this;
        }

        public Criteria andHuodongqingkuangNotIn(List<String> values) {
            addCriterion("HUODONGQINGKUANG not in", values, "huodongqingkuang");
            return (Criteria) this;
        }

        public Criteria andHuodongqingkuangBetween(String value1, String value2) {
            addCriterion("HUODONGQINGKUANG between", value1, value2, "huodongqingkuang");
            return (Criteria) this;
        }

        public Criteria andHuodongqingkuangNotBetween(String value1, String value2) {
            addCriterion("HUODONGQINGKUANG not between", value1, value2, "huodongqingkuang");
            return (Criteria) this;
        }

        public Criteria andFuwuqingkuangIsNull() {
            addCriterion("FUWUQINGKUANG is null");
            return (Criteria) this;
        }

        public Criteria andFuwuqingkuangIsNotNull() {
            addCriterion("FUWUQINGKUANG is not null");
            return (Criteria) this;
        }

        public Criteria andFuwuqingkuangEqualTo(String value) {
            addCriterion("FUWUQINGKUANG =", value, "fuwuqingkuang");
            return (Criteria) this;
        }

        public Criteria andFuwuqingkuangNotEqualTo(String value) {
            addCriterion("FUWUQINGKUANG <>", value, "fuwuqingkuang");
            return (Criteria) this;
        }

        public Criteria andFuwuqingkuangGreaterThan(String value) {
            addCriterion("FUWUQINGKUANG >", value, "fuwuqingkuang");
            return (Criteria) this;
        }

        public Criteria andFuwuqingkuangGreaterThanOrEqualTo(String value) {
            addCriterion("FUWUQINGKUANG >=", value, "fuwuqingkuang");
            return (Criteria) this;
        }

        public Criteria andFuwuqingkuangLessThan(String value) {
            addCriterion("FUWUQINGKUANG <", value, "fuwuqingkuang");
            return (Criteria) this;
        }

        public Criteria andFuwuqingkuangLessThanOrEqualTo(String value) {
            addCriterion("FUWUQINGKUANG <=", value, "fuwuqingkuang");
            return (Criteria) this;
        }

        public Criteria andFuwuqingkuangLike(String value) {
            addCriterion("FUWUQINGKUANG like", value, "fuwuqingkuang");
            return (Criteria) this;
        }

        public Criteria andFuwuqingkuangNotLike(String value) {
            addCriterion("FUWUQINGKUANG not like", value, "fuwuqingkuang");
            return (Criteria) this;
        }

        public Criteria andFuwuqingkuangIn(List<String> values) {
            addCriterion("FUWUQINGKUANG in", values, "fuwuqingkuang");
            return (Criteria) this;
        }

        public Criteria andFuwuqingkuangNotIn(List<String> values) {
            addCriterion("FUWUQINGKUANG not in", values, "fuwuqingkuang");
            return (Criteria) this;
        }

        public Criteria andFuwuqingkuangBetween(String value1, String value2) {
            addCriterion("FUWUQINGKUANG between", value1, value2, "fuwuqingkuang");
            return (Criteria) this;
        }

        public Criteria andFuwuqingkuangNotBetween(String value1, String value2) {
            addCriterion("FUWUQINGKUANG not between", value1, value2, "fuwuqingkuang");
            return (Criteria) this;
        }

        public Criteria andShenpiriqiIsNull() {
            addCriterion("SHENPIRIQI is null");
            return (Criteria) this;
        }

        public Criteria andShenpiriqiIsNotNull() {
            addCriterion("SHENPIRIQI is not null");
            return (Criteria) this;
        }

        public Criteria andShenpiriqiEqualTo(Date value) {
            addCriterion("SHENPIRIQI =", value, "shenpiriqi");
            return (Criteria) this;
        }

        public Criteria andShenpiriqiNotEqualTo(Date value) {
            addCriterion("SHENPIRIQI <>", value, "shenpiriqi");
            return (Criteria) this;
        }

        public Criteria andShenpiriqiGreaterThan(Date value) {
            addCriterion("SHENPIRIQI >", value, "shenpiriqi");
            return (Criteria) this;
        }

        public Criteria andShenpiriqiGreaterThanOrEqualTo(Date value) {
            addCriterion("SHENPIRIQI >=", value, "shenpiriqi");
            return (Criteria) this;
        }

        public Criteria andShenpiriqiLessThan(Date value) {
            addCriterion("SHENPIRIQI <", value, "shenpiriqi");
            return (Criteria) this;
        }

        public Criteria andShenpiriqiLessThanOrEqualTo(Date value) {
            addCriterion("SHENPIRIQI <=", value, "shenpiriqi");
            return (Criteria) this;
        }

        public Criteria andShenpiriqiIn(List<Date> values) {
            addCriterion("SHENPIRIQI in", values, "shenpiriqi");
            return (Criteria) this;
        }

        public Criteria andShenpiriqiNotIn(List<Date> values) {
            addCriterion("SHENPIRIQI not in", values, "shenpiriqi");
            return (Criteria) this;
        }

        public Criteria andShenpiriqiBetween(Date value1, Date value2) {
            addCriterion("SHENPIRIQI between", value1, value2, "shenpiriqi");
            return (Criteria) this;
        }

        public Criteria andShenpiriqiNotBetween(Date value1, Date value2) {
            addCriterion("SHENPIRIQI not between", value1, value2, "shenpiriqi");
            return (Criteria) this;
        }

        public Criteria andQiyejiadanrenIsNull() {
            addCriterion("QIYEJIADANREN is null");
            return (Criteria) this;
        }

        public Criteria andQiyejiadanrenIsNotNull() {
            addCriterion("QIYEJIADANREN is not null");
            return (Criteria) this;
        }

        public Criteria andQiyejiadanrenEqualTo(String value) {
            addCriterion("QIYEJIADANREN =", value, "qiyejiadanren");
            return (Criteria) this;
        }

        public Criteria andQiyejiadanrenNotEqualTo(String value) {
            addCriterion("QIYEJIADANREN <>", value, "qiyejiadanren");
            return (Criteria) this;
        }

        public Criteria andQiyejiadanrenGreaterThan(String value) {
            addCriterion("QIYEJIADANREN >", value, "qiyejiadanren");
            return (Criteria) this;
        }

        public Criteria andQiyejiadanrenGreaterThanOrEqualTo(String value) {
            addCriterion("QIYEJIADANREN >=", value, "qiyejiadanren");
            return (Criteria) this;
        }

        public Criteria andQiyejiadanrenLessThan(String value) {
            addCriterion("QIYEJIADANREN <", value, "qiyejiadanren");
            return (Criteria) this;
        }

        public Criteria andQiyejiadanrenLessThanOrEqualTo(String value) {
            addCriterion("QIYEJIADANREN <=", value, "qiyejiadanren");
            return (Criteria) this;
        }

        public Criteria andQiyejiadanrenLike(String value) {
            addCriterion("QIYEJIADANREN like", value, "qiyejiadanren");
            return (Criteria) this;
        }

        public Criteria andQiyejiadanrenNotLike(String value) {
            addCriterion("QIYEJIADANREN not like", value, "qiyejiadanren");
            return (Criteria) this;
        }

        public Criteria andQiyejiadanrenIn(List<String> values) {
            addCriterion("QIYEJIADANREN in", values, "qiyejiadanren");
            return (Criteria) this;
        }

        public Criteria andQiyejiadanrenNotIn(List<String> values) {
            addCriterion("QIYEJIADANREN not in", values, "qiyejiadanren");
            return (Criteria) this;
        }

        public Criteria andQiyejiadanrenBetween(String value1, String value2) {
            addCriterion("QIYEJIADANREN between", value1, value2, "qiyejiadanren");
            return (Criteria) this;
        }

        public Criteria andQiyejiadanrenNotBetween(String value1, String value2) {
            addCriterion("QIYEJIADANREN not between", value1, value2, "qiyejiadanren");
            return (Criteria) this;
        }

        public Criteria andHanggueihangyueIsNull() {
            addCriterion("HANGGUEIHANGYUE is null");
            return (Criteria) this;
        }

        public Criteria andHanggueihangyueIsNotNull() {
            addCriterion("HANGGUEIHANGYUE is not null");
            return (Criteria) this;
        }

        public Criteria andHanggueihangyueEqualTo(String value) {
            addCriterion("HANGGUEIHANGYUE =", value, "hanggueihangyue");
            return (Criteria) this;
        }

        public Criteria andHanggueihangyueNotEqualTo(String value) {
            addCriterion("HANGGUEIHANGYUE <>", value, "hanggueihangyue");
            return (Criteria) this;
        }

        public Criteria andHanggueihangyueGreaterThan(String value) {
            addCriterion("HANGGUEIHANGYUE >", value, "hanggueihangyue");
            return (Criteria) this;
        }

        public Criteria andHanggueihangyueGreaterThanOrEqualTo(String value) {
            addCriterion("HANGGUEIHANGYUE >=", value, "hanggueihangyue");
            return (Criteria) this;
        }

        public Criteria andHanggueihangyueLessThan(String value) {
            addCriterion("HANGGUEIHANGYUE <", value, "hanggueihangyue");
            return (Criteria) this;
        }

        public Criteria andHanggueihangyueLessThanOrEqualTo(String value) {
            addCriterion("HANGGUEIHANGYUE <=", value, "hanggueihangyue");
            return (Criteria) this;
        }

        public Criteria andHanggueihangyueLike(String value) {
            addCriterion("HANGGUEIHANGYUE like", value, "hanggueihangyue");
            return (Criteria) this;
        }

        public Criteria andHanggueihangyueNotLike(String value) {
            addCriterion("HANGGUEIHANGYUE not like", value, "hanggueihangyue");
            return (Criteria) this;
        }

        public Criteria andHanggueihangyueIn(List<String> values) {
            addCriterion("HANGGUEIHANGYUE in", values, "hanggueihangyue");
            return (Criteria) this;
        }

        public Criteria andHanggueihangyueNotIn(List<String> values) {
            addCriterion("HANGGUEIHANGYUE not in", values, "hanggueihangyue");
            return (Criteria) this;
        }

        public Criteria andHanggueihangyueBetween(String value1, String value2) {
            addCriterion("HANGGUEIHANGYUE between", value1, value2, "hanggueihangyue");
            return (Criteria) this;
        }

        public Criteria andHanggueihangyueNotBetween(String value1, String value2) {
            addCriterion("HANGGUEIHANGYUE not between", value1, value2, "hanggueihangyue");
            return (Criteria) this;
        }

        public Criteria andDaodezhunzeIsNull() {
            addCriterion("DAODEZHUNZE is null");
            return (Criteria) this;
        }

        public Criteria andDaodezhunzeIsNotNull() {
            addCriterion("DAODEZHUNZE is not null");
            return (Criteria) this;
        }

        public Criteria andDaodezhunzeEqualTo(String value) {
            addCriterion("DAODEZHUNZE =", value, "daodezhunze");
            return (Criteria) this;
        }

        public Criteria andDaodezhunzeNotEqualTo(String value) {
            addCriterion("DAODEZHUNZE <>", value, "daodezhunze");
            return (Criteria) this;
        }

        public Criteria andDaodezhunzeGreaterThan(String value) {
            addCriterion("DAODEZHUNZE >", value, "daodezhunze");
            return (Criteria) this;
        }

        public Criteria andDaodezhunzeGreaterThanOrEqualTo(String value) {
            addCriterion("DAODEZHUNZE >=", value, "daodezhunze");
            return (Criteria) this;
        }

        public Criteria andDaodezhunzeLessThan(String value) {
            addCriterion("DAODEZHUNZE <", value, "daodezhunze");
            return (Criteria) this;
        }

        public Criteria andDaodezhunzeLessThanOrEqualTo(String value) {
            addCriterion("DAODEZHUNZE <=", value, "daodezhunze");
            return (Criteria) this;
        }

        public Criteria andDaodezhunzeLike(String value) {
            addCriterion("DAODEZHUNZE like", value, "daodezhunze");
            return (Criteria) this;
        }

        public Criteria andDaodezhunzeNotLike(String value) {
            addCriterion("DAODEZHUNZE not like", value, "daodezhunze");
            return (Criteria) this;
        }

        public Criteria andDaodezhunzeIn(List<String> values) {
            addCriterion("DAODEZHUNZE in", values, "daodezhunze");
            return (Criteria) this;
        }

        public Criteria andDaodezhunzeNotIn(List<String> values) {
            addCriterion("DAODEZHUNZE not in", values, "daodezhunze");
            return (Criteria) this;
        }

        public Criteria andDaodezhunzeBetween(String value1, String value2) {
            addCriterion("DAODEZHUNZE between", value1, value2, "daodezhunze");
            return (Criteria) this;
        }

        public Criteria andDaodezhunzeNotBetween(String value1, String value2) {
            addCriterion("DAODEZHUNZE not between", value1, value2, "daodezhunze");
            return (Criteria) this;
        }

        public Criteria andZilvzhiduIsNull() {
            addCriterion("ZILVZHIDU is null");
            return (Criteria) this;
        }

        public Criteria andZilvzhiduIsNotNull() {
            addCriterion("ZILVZHIDU is not null");
            return (Criteria) this;
        }

        public Criteria andZilvzhiduEqualTo(String value) {
            addCriterion("ZILVZHIDU =", value, "zilvzhidu");
            return (Criteria) this;
        }

        public Criteria andZilvzhiduNotEqualTo(String value) {
            addCriterion("ZILVZHIDU <>", value, "zilvzhidu");
            return (Criteria) this;
        }

        public Criteria andZilvzhiduGreaterThan(String value) {
            addCriterion("ZILVZHIDU >", value, "zilvzhidu");
            return (Criteria) this;
        }

        public Criteria andZilvzhiduGreaterThanOrEqualTo(String value) {
            addCriterion("ZILVZHIDU >=", value, "zilvzhidu");
            return (Criteria) this;
        }

        public Criteria andZilvzhiduLessThan(String value) {
            addCriterion("ZILVZHIDU <", value, "zilvzhidu");
            return (Criteria) this;
        }

        public Criteria andZilvzhiduLessThanOrEqualTo(String value) {
            addCriterion("ZILVZHIDU <=", value, "zilvzhidu");
            return (Criteria) this;
        }

        public Criteria andZilvzhiduLike(String value) {
            addCriterion("ZILVZHIDU like", value, "zilvzhidu");
            return (Criteria) this;
        }

        public Criteria andZilvzhiduNotLike(String value) {
            addCriterion("ZILVZHIDU not like", value, "zilvzhidu");
            return (Criteria) this;
        }

        public Criteria andZilvzhiduIn(List<String> values) {
            addCriterion("ZILVZHIDU in", values, "zilvzhidu");
            return (Criteria) this;
        }

        public Criteria andZilvzhiduNotIn(List<String> values) {
            addCriterion("ZILVZHIDU not in", values, "zilvzhidu");
            return (Criteria) this;
        }

        public Criteria andZilvzhiduBetween(String value1, String value2) {
            addCriterion("ZILVZHIDU between", value1, value2, "zilvzhidu");
            return (Criteria) this;
        }

        public Criteria andZilvzhiduNotBetween(String value1, String value2) {
            addCriterion("ZILVZHIDU not between", value1, value2, "zilvzhidu");
            return (Criteria) this;
        }

        public Criteria andZilvxuanyanIsNull() {
            addCriterion("ZILVXUANYAN is null");
            return (Criteria) this;
        }

        public Criteria andZilvxuanyanIsNotNull() {
            addCriterion("ZILVXUANYAN is not null");
            return (Criteria) this;
        }

        public Criteria andZilvxuanyanEqualTo(String value) {
            addCriterion("ZILVXUANYAN =", value, "zilvxuanyan");
            return (Criteria) this;
        }

        public Criteria andZilvxuanyanNotEqualTo(String value) {
            addCriterion("ZILVXUANYAN <>", value, "zilvxuanyan");
            return (Criteria) this;
        }

        public Criteria andZilvxuanyanGreaterThan(String value) {
            addCriterion("ZILVXUANYAN >", value, "zilvxuanyan");
            return (Criteria) this;
        }

        public Criteria andZilvxuanyanGreaterThanOrEqualTo(String value) {
            addCriterion("ZILVXUANYAN >=", value, "zilvxuanyan");
            return (Criteria) this;
        }

        public Criteria andZilvxuanyanLessThan(String value) {
            addCriterion("ZILVXUANYAN <", value, "zilvxuanyan");
            return (Criteria) this;
        }

        public Criteria andZilvxuanyanLessThanOrEqualTo(String value) {
            addCriterion("ZILVXUANYAN <=", value, "zilvxuanyan");
            return (Criteria) this;
        }

        public Criteria andZilvxuanyanLike(String value) {
            addCriterion("ZILVXUANYAN like", value, "zilvxuanyan");
            return (Criteria) this;
        }

        public Criteria andZilvxuanyanNotLike(String value) {
            addCriterion("ZILVXUANYAN not like", value, "zilvxuanyan");
            return (Criteria) this;
        }

        public Criteria andZilvxuanyanIn(List<String> values) {
            addCriterion("ZILVXUANYAN in", values, "zilvxuanyan");
            return (Criteria) this;
        }

        public Criteria andZilvxuanyanNotIn(List<String> values) {
            addCriterion("ZILVXUANYAN not in", values, "zilvxuanyan");
            return (Criteria) this;
        }

        public Criteria andZilvxuanyanBetween(String value1, String value2) {
            addCriterion("ZILVXUANYAN between", value1, value2, "zilvxuanyan");
            return (Criteria) this;
        }

        public Criteria andZilvxuanyanNotBetween(String value1, String value2) {
            addCriterion("ZILVXUANYAN not between", value1, value2, "zilvxuanyan");
            return (Criteria) this;
        }

        public Criteria andDiaochahetongjiIsNull() {
            addCriterion("DIAOCHAHETONGJI is null");
            return (Criteria) this;
        }

        public Criteria andDiaochahetongjiIsNotNull() {
            addCriterion("DIAOCHAHETONGJI is not null");
            return (Criteria) this;
        }

        public Criteria andDiaochahetongjiEqualTo(String value) {
            addCriterion("DIAOCHAHETONGJI =", value, "diaochahetongji");
            return (Criteria) this;
        }

        public Criteria andDiaochahetongjiNotEqualTo(String value) {
            addCriterion("DIAOCHAHETONGJI <>", value, "diaochahetongji");
            return (Criteria) this;
        }

        public Criteria andDiaochahetongjiGreaterThan(String value) {
            addCriterion("DIAOCHAHETONGJI >", value, "diaochahetongji");
            return (Criteria) this;
        }

        public Criteria andDiaochahetongjiGreaterThanOrEqualTo(String value) {
            addCriterion("DIAOCHAHETONGJI >=", value, "diaochahetongji");
            return (Criteria) this;
        }

        public Criteria andDiaochahetongjiLessThan(String value) {
            addCriterion("DIAOCHAHETONGJI <", value, "diaochahetongji");
            return (Criteria) this;
        }

        public Criteria andDiaochahetongjiLessThanOrEqualTo(String value) {
            addCriterion("DIAOCHAHETONGJI <=", value, "diaochahetongji");
            return (Criteria) this;
        }

        public Criteria andDiaochahetongjiLike(String value) {
            addCriterion("DIAOCHAHETONGJI like", value, "diaochahetongji");
            return (Criteria) this;
        }

        public Criteria andDiaochahetongjiNotLike(String value) {
            addCriterion("DIAOCHAHETONGJI not like", value, "diaochahetongji");
            return (Criteria) this;
        }

        public Criteria andDiaochahetongjiIn(List<String> values) {
            addCriterion("DIAOCHAHETONGJI in", values, "diaochahetongji");
            return (Criteria) this;
        }

        public Criteria andDiaochahetongjiNotIn(List<String> values) {
            addCriterion("DIAOCHAHETONGJI not in", values, "diaochahetongji");
            return (Criteria) this;
        }

        public Criteria andDiaochahetongjiBetween(String value1, String value2) {
            addCriterion("DIAOCHAHETONGJI between", value1, value2, "diaochahetongji");
            return (Criteria) this;
        }

        public Criteria andDiaochahetongjiNotBetween(String value1, String value2) {
            addCriterion("DIAOCHAHETONGJI not between", value1, value2, "diaochahetongji");
            return (Criteria) this;
        }

        public Criteria andHangyexinxiIsNull() {
            addCriterion("HANGYEXINXI is null");
            return (Criteria) this;
        }

        public Criteria andHangyexinxiIsNotNull() {
            addCriterion("HANGYEXINXI is not null");
            return (Criteria) this;
        }

        public Criteria andHangyexinxiEqualTo(String value) {
            addCriterion("HANGYEXINXI =", value, "hangyexinxi");
            return (Criteria) this;
        }

        public Criteria andHangyexinxiNotEqualTo(String value) {
            addCriterion("HANGYEXINXI <>", value, "hangyexinxi");
            return (Criteria) this;
        }

        public Criteria andHangyexinxiGreaterThan(String value) {
            addCriterion("HANGYEXINXI >", value, "hangyexinxi");
            return (Criteria) this;
        }

        public Criteria andHangyexinxiGreaterThanOrEqualTo(String value) {
            addCriterion("HANGYEXINXI >=", value, "hangyexinxi");
            return (Criteria) this;
        }

        public Criteria andHangyexinxiLessThan(String value) {
            addCriterion("HANGYEXINXI <", value, "hangyexinxi");
            return (Criteria) this;
        }

        public Criteria andHangyexinxiLessThanOrEqualTo(String value) {
            addCriterion("HANGYEXINXI <=", value, "hangyexinxi");
            return (Criteria) this;
        }

        public Criteria andHangyexinxiLike(String value) {
            addCriterion("HANGYEXINXI like", value, "hangyexinxi");
            return (Criteria) this;
        }

        public Criteria andHangyexinxiNotLike(String value) {
            addCriterion("HANGYEXINXI not like", value, "hangyexinxi");
            return (Criteria) this;
        }

        public Criteria andHangyexinxiIn(List<String> values) {
            addCriterion("HANGYEXINXI in", values, "hangyexinxi");
            return (Criteria) this;
        }

        public Criteria andHangyexinxiNotIn(List<String> values) {
            addCriterion("HANGYEXINXI not in", values, "hangyexinxi");
            return (Criteria) this;
        }

        public Criteria andHangyexinxiBetween(String value1, String value2) {
            addCriterion("HANGYEXINXI between", value1, value2, "hangyexinxi");
            return (Criteria) this;
        }

        public Criteria andHangyexinxiNotBetween(String value1, String value2) {
            addCriterion("HANGYEXINXI not between", value1, value2, "hangyexinxi");
            return (Criteria) this;
        }

        public Criteria andPinpaifuwuIsNull() {
            addCriterion("PINPAIFUWU is null");
            return (Criteria) this;
        }

        public Criteria andPinpaifuwuIsNotNull() {
            addCriterion("PINPAIFUWU is not null");
            return (Criteria) this;
        }

        public Criteria andPinpaifuwuEqualTo(String value) {
            addCriterion("PINPAIFUWU =", value, "pinpaifuwu");
            return (Criteria) this;
        }

        public Criteria andPinpaifuwuNotEqualTo(String value) {
            addCriterion("PINPAIFUWU <>", value, "pinpaifuwu");
            return (Criteria) this;
        }

        public Criteria andPinpaifuwuGreaterThan(String value) {
            addCriterion("PINPAIFUWU >", value, "pinpaifuwu");
            return (Criteria) this;
        }

        public Criteria andPinpaifuwuGreaterThanOrEqualTo(String value) {
            addCriterion("PINPAIFUWU >=", value, "pinpaifuwu");
            return (Criteria) this;
        }

        public Criteria andPinpaifuwuLessThan(String value) {
            addCriterion("PINPAIFUWU <", value, "pinpaifuwu");
            return (Criteria) this;
        }

        public Criteria andPinpaifuwuLessThanOrEqualTo(String value) {
            addCriterion("PINPAIFUWU <=", value, "pinpaifuwu");
            return (Criteria) this;
        }

        public Criteria andPinpaifuwuLike(String value) {
            addCriterion("PINPAIFUWU like", value, "pinpaifuwu");
            return (Criteria) this;
        }

        public Criteria andPinpaifuwuNotLike(String value) {
            addCriterion("PINPAIFUWU not like", value, "pinpaifuwu");
            return (Criteria) this;
        }

        public Criteria andPinpaifuwuIn(List<String> values) {
            addCriterion("PINPAIFUWU in", values, "pinpaifuwu");
            return (Criteria) this;
        }

        public Criteria andPinpaifuwuNotIn(List<String> values) {
            addCriterion("PINPAIFUWU not in", values, "pinpaifuwu");
            return (Criteria) this;
        }

        public Criteria andPinpaifuwuBetween(String value1, String value2) {
            addCriterion("PINPAIFUWU between", value1, value2, "pinpaifuwu");
            return (Criteria) this;
        }

        public Criteria andPinpaifuwuNotBetween(String value1, String value2) {
            addCriterion("PINPAIFUWU not between", value1, value2, "pinpaifuwu");
            return (Criteria) this;
        }

        public Criteria andXietongfazhanIsNull() {
            addCriterion("XIETONGFAZHAN is null");
            return (Criteria) this;
        }

        public Criteria andXietongfazhanIsNotNull() {
            addCriterion("XIETONGFAZHAN is not null");
            return (Criteria) this;
        }

        public Criteria andXietongfazhanEqualTo(String value) {
            addCriterion("XIETONGFAZHAN =", value, "xietongfazhan");
            return (Criteria) this;
        }

        public Criteria andXietongfazhanNotEqualTo(String value) {
            addCriterion("XIETONGFAZHAN <>", value, "xietongfazhan");
            return (Criteria) this;
        }

        public Criteria andXietongfazhanGreaterThan(String value) {
            addCriterion("XIETONGFAZHAN >", value, "xietongfazhan");
            return (Criteria) this;
        }

        public Criteria andXietongfazhanGreaterThanOrEqualTo(String value) {
            addCriterion("XIETONGFAZHAN >=", value, "xietongfazhan");
            return (Criteria) this;
        }

        public Criteria andXietongfazhanLessThan(String value) {
            addCriterion("XIETONGFAZHAN <", value, "xietongfazhan");
            return (Criteria) this;
        }

        public Criteria andXietongfazhanLessThanOrEqualTo(String value) {
            addCriterion("XIETONGFAZHAN <=", value, "xietongfazhan");
            return (Criteria) this;
        }

        public Criteria andXietongfazhanLike(String value) {
            addCriterion("XIETONGFAZHAN like", value, "xietongfazhan");
            return (Criteria) this;
        }

        public Criteria andXietongfazhanNotLike(String value) {
            addCriterion("XIETONGFAZHAN not like", value, "xietongfazhan");
            return (Criteria) this;
        }

        public Criteria andXietongfazhanIn(List<String> values) {
            addCriterion("XIETONGFAZHAN in", values, "xietongfazhan");
            return (Criteria) this;
        }

        public Criteria andXietongfazhanNotIn(List<String> values) {
            addCriterion("XIETONGFAZHAN not in", values, "xietongfazhan");
            return (Criteria) this;
        }

        public Criteria andXietongfazhanBetween(String value1, String value2) {
            addCriterion("XIETONGFAZHAN between", value1, value2, "xietongfazhan");
            return (Criteria) this;
        }

        public Criteria andXietongfazhanNotBetween(String value1, String value2) {
            addCriterion("XIETONGFAZHAN not between", value1, value2, "xietongfazhan");
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