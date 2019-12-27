package com.xgb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LsCybaZbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LsCybaZbExample() {
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

        public Criteria andXingmingIsNull() {
            addCriterion("XINGMING is null");
            return (Criteria) this;
        }

        public Criteria andXingmingIsNotNull() {
            addCriterion("XINGMING is not null");
            return (Criteria) this;
        }

        public Criteria andXingmingEqualTo(String value) {
            addCriterion("XINGMING =", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotEqualTo(String value) {
            addCriterion("XINGMING <>", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingGreaterThan(String value) {
            addCriterion("XINGMING >", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingGreaterThanOrEqualTo(String value) {
            addCriterion("XINGMING >=", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingLessThan(String value) {
            addCriterion("XINGMING <", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingLessThanOrEqualTo(String value) {
            addCriterion("XINGMING <=", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingLike(String value) {
            addCriterion("XINGMING like", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotLike(String value) {
            addCriterion("XINGMING not like", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingIn(List<String> values) {
            addCriterion("XINGMING in", values, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotIn(List<String> values) {
            addCriterion("XINGMING not in", values, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingBetween(String value1, String value2) {
            addCriterion("XINGMING between", value1, value2, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotBetween(String value1, String value2) {
            addCriterion("XINGMING not between", value1, value2, "xingming");
            return (Criteria) this;
        }

        public Criteria andChushengnianyueIsNull() {
            addCriterion("CHUSHENGNIANYUE is null");
            return (Criteria) this;
        }

        public Criteria andChushengnianyueIsNotNull() {
            addCriterion("CHUSHENGNIANYUE is not null");
            return (Criteria) this;
        }

        public Criteria andChushengnianyueEqualTo(Date value) {
            addCriterion("CHUSHENGNIANYUE =", value, "chushengnianyue");
            return (Criteria) this;
        }

        public Criteria andChushengnianyueNotEqualTo(Date value) {
            addCriterion("CHUSHENGNIANYUE <>", value, "chushengnianyue");
            return (Criteria) this;
        }

        public Criteria andChushengnianyueGreaterThan(Date value) {
            addCriterion("CHUSHENGNIANYUE >", value, "chushengnianyue");
            return (Criteria) this;
        }

        public Criteria andChushengnianyueGreaterThanOrEqualTo(Date value) {
            addCriterion("CHUSHENGNIANYUE >=", value, "chushengnianyue");
            return (Criteria) this;
        }

        public Criteria andChushengnianyueLessThan(Date value) {
            addCriterion("CHUSHENGNIANYUE <", value, "chushengnianyue");
            return (Criteria) this;
        }

        public Criteria andChushengnianyueLessThanOrEqualTo(Date value) {
            addCriterion("CHUSHENGNIANYUE <=", value, "chushengnianyue");
            return (Criteria) this;
        }

        public Criteria andChushengnianyueIn(List<Date> values) {
            addCriterion("CHUSHENGNIANYUE in", values, "chushengnianyue");
            return (Criteria) this;
        }

        public Criteria andChushengnianyueNotIn(List<Date> values) {
            addCriterion("CHUSHENGNIANYUE not in", values, "chushengnianyue");
            return (Criteria) this;
        }

        public Criteria andChushengnianyueBetween(Date value1, Date value2) {
            addCriterion("CHUSHENGNIANYUE between", value1, value2, "chushengnianyue");
            return (Criteria) this;
        }

        public Criteria andChushengnianyueNotBetween(Date value1, Date value2) {
            addCriterion("CHUSHENGNIANYUE not between", value1, value2, "chushengnianyue");
            return (Criteria) this;
        }

        public Criteria andNeizhiwuIsNull() {
            addCriterion("NEIZHIWU is null");
            return (Criteria) this;
        }

        public Criteria andNeizhiwuIsNotNull() {
            addCriterion("NEIZHIWU is not null");
            return (Criteria) this;
        }

        public Criteria andNeizhiwuEqualTo(String value) {
            addCriterion("NEIZHIWU =", value, "neizhiwu");
            return (Criteria) this;
        }

        public Criteria andNeizhiwuNotEqualTo(String value) {
            addCriterion("NEIZHIWU <>", value, "neizhiwu");
            return (Criteria) this;
        }

        public Criteria andNeizhiwuGreaterThan(String value) {
            addCriterion("NEIZHIWU >", value, "neizhiwu");
            return (Criteria) this;
        }

        public Criteria andNeizhiwuGreaterThanOrEqualTo(String value) {
            addCriterion("NEIZHIWU >=", value, "neizhiwu");
            return (Criteria) this;
        }

        public Criteria andNeizhiwuLessThan(String value) {
            addCriterion("NEIZHIWU <", value, "neizhiwu");
            return (Criteria) this;
        }

        public Criteria andNeizhiwuLessThanOrEqualTo(String value) {
            addCriterion("NEIZHIWU <=", value, "neizhiwu");
            return (Criteria) this;
        }

        public Criteria andNeizhiwuLike(String value) {
            addCriterion("NEIZHIWU like", value, "neizhiwu");
            return (Criteria) this;
        }

        public Criteria andNeizhiwuNotLike(String value) {
            addCriterion("NEIZHIWU not like", value, "neizhiwu");
            return (Criteria) this;
        }

        public Criteria andNeizhiwuIn(List<String> values) {
            addCriterion("NEIZHIWU in", values, "neizhiwu");
            return (Criteria) this;
        }

        public Criteria andNeizhiwuNotIn(List<String> values) {
            addCriterion("NEIZHIWU not in", values, "neizhiwu");
            return (Criteria) this;
        }

        public Criteria andNeizhiwuBetween(String value1, String value2) {
            addCriterion("NEIZHIWU between", value1, value2, "neizhiwu");
            return (Criteria) this;
        }

        public Criteria andNeizhiwuNotBetween(String value1, String value2) {
            addCriterion("NEIZHIWU not between", value1, value2, "neizhiwu");
            return (Criteria) this;
        }

        public Criteria andLishiIsNull() {
            addCriterion("LISHI is null");
            return (Criteria) this;
        }

        public Criteria andLishiIsNotNull() {
            addCriterion("LISHI is not null");
            return (Criteria) this;
        }

        public Criteria andLishiEqualTo(String value) {
            addCriterion("LISHI =", value, "lishi");
            return (Criteria) this;
        }

        public Criteria andLishiNotEqualTo(String value) {
            addCriterion("LISHI <>", value, "lishi");
            return (Criteria) this;
        }

        public Criteria andLishiGreaterThan(String value) {
            addCriterion("LISHI >", value, "lishi");
            return (Criteria) this;
        }

        public Criteria andLishiGreaterThanOrEqualTo(String value) {
            addCriterion("LISHI >=", value, "lishi");
            return (Criteria) this;
        }

        public Criteria andLishiLessThan(String value) {
            addCriterion("LISHI <", value, "lishi");
            return (Criteria) this;
        }

        public Criteria andLishiLessThanOrEqualTo(String value) {
            addCriterion("LISHI <=", value, "lishi");
            return (Criteria) this;
        }

        public Criteria andLishiLike(String value) {
            addCriterion("LISHI like", value, "lishi");
            return (Criteria) this;
        }

        public Criteria andLishiNotLike(String value) {
            addCriterion("LISHI not like", value, "lishi");
            return (Criteria) this;
        }

        public Criteria andLishiIn(List<String> values) {
            addCriterion("LISHI in", values, "lishi");
            return (Criteria) this;
        }

        public Criteria andLishiNotIn(List<String> values) {
            addCriterion("LISHI not in", values, "lishi");
            return (Criteria) this;
        }

        public Criteria andLishiBetween(String value1, String value2) {
            addCriterion("LISHI between", value1, value2, "lishi");
            return (Criteria) this;
        }

        public Criteria andLishiNotBetween(String value1, String value2) {
            addCriterion("LISHI not between", value1, value2, "lishi");
            return (Criteria) this;
        }

        public Criteria andJizhiwuIsNull() {
            addCriterion("JIZHIWU is null");
            return (Criteria) this;
        }

        public Criteria andJizhiwuIsNotNull() {
            addCriterion("JIZHIWU is not null");
            return (Criteria) this;
        }

        public Criteria andJizhiwuEqualTo(String value) {
            addCriterion("JIZHIWU =", value, "jizhiwu");
            return (Criteria) this;
        }

        public Criteria andJizhiwuNotEqualTo(String value) {
            addCriterion("JIZHIWU <>", value, "jizhiwu");
            return (Criteria) this;
        }

        public Criteria andJizhiwuGreaterThan(String value) {
            addCriterion("JIZHIWU >", value, "jizhiwu");
            return (Criteria) this;
        }

        public Criteria andJizhiwuGreaterThanOrEqualTo(String value) {
            addCriterion("JIZHIWU >=", value, "jizhiwu");
            return (Criteria) this;
        }

        public Criteria andJizhiwuLessThan(String value) {
            addCriterion("JIZHIWU <", value, "jizhiwu");
            return (Criteria) this;
        }

        public Criteria andJizhiwuLessThanOrEqualTo(String value) {
            addCriterion("JIZHIWU <=", value, "jizhiwu");
            return (Criteria) this;
        }

        public Criteria andJizhiwuLike(String value) {
            addCriterion("JIZHIWU like", value, "jizhiwu");
            return (Criteria) this;
        }

        public Criteria andJizhiwuNotLike(String value) {
            addCriterion("JIZHIWU not like", value, "jizhiwu");
            return (Criteria) this;
        }

        public Criteria andJizhiwuIn(List<String> values) {
            addCriterion("JIZHIWU in", values, "jizhiwu");
            return (Criteria) this;
        }

        public Criteria andJizhiwuNotIn(List<String> values) {
            addCriterion("JIZHIWU not in", values, "jizhiwu");
            return (Criteria) this;
        }

        public Criteria andJizhiwuBetween(String value1, String value2) {
            addCriterion("JIZHIWU between", value1, value2, "jizhiwu");
            return (Criteria) this;
        }

        public Criteria andJizhiwuNotBetween(String value1, String value2) {
            addCriterion("JIZHIWU not between", value1, value2, "jizhiwu");
            return (Criteria) this;
        }

        public Criteria andQianziIsNull() {
            addCriterion("QIANZI is null");
            return (Criteria) this;
        }

        public Criteria andQianziIsNotNull() {
            addCriterion("QIANZI is not null");
            return (Criteria) this;
        }

        public Criteria andQianziEqualTo(String value) {
            addCriterion("QIANZI =", value, "qianzi");
            return (Criteria) this;
        }

        public Criteria andQianziNotEqualTo(String value) {
            addCriterion("QIANZI <>", value, "qianzi");
            return (Criteria) this;
        }

        public Criteria andQianziGreaterThan(String value) {
            addCriterion("QIANZI >", value, "qianzi");
            return (Criteria) this;
        }

        public Criteria andQianziGreaterThanOrEqualTo(String value) {
            addCriterion("QIANZI >=", value, "qianzi");
            return (Criteria) this;
        }

        public Criteria andQianziLessThan(String value) {
            addCriterion("QIANZI <", value, "qianzi");
            return (Criteria) this;
        }

        public Criteria andQianziLessThanOrEqualTo(String value) {
            addCriterion("QIANZI <=", value, "qianzi");
            return (Criteria) this;
        }

        public Criteria andQianziLike(String value) {
            addCriterion("QIANZI like", value, "qianzi");
            return (Criteria) this;
        }

        public Criteria andQianziNotLike(String value) {
            addCriterion("QIANZI not like", value, "qianzi");
            return (Criteria) this;
        }

        public Criteria andQianziIn(List<String> values) {
            addCriterion("QIANZI in", values, "qianzi");
            return (Criteria) this;
        }

        public Criteria andQianziNotIn(List<String> values) {
            addCriterion("QIANZI not in", values, "qianzi");
            return (Criteria) this;
        }

        public Criteria andQianziBetween(String value1, String value2) {
            addCriterion("QIANZI between", value1, value2, "qianzi");
            return (Criteria) this;
        }

        public Criteria andQianziNotBetween(String value1, String value2) {
            addCriterion("QIANZI not between", value1, value2, "qianzi");
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