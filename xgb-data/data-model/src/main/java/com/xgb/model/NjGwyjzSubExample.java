package com.xgb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NjGwyjzSubExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NjGwyjzSubExample() {
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

        public Criteria andXingbieIsNull() {
            addCriterion("XINGBIE is null");
            return (Criteria) this;
        }

        public Criteria andXingbieIsNotNull() {
            addCriterion("XINGBIE is not null");
            return (Criteria) this;
        }

        public Criteria andXingbieEqualTo(String value) {
            addCriterion("XINGBIE =", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieNotEqualTo(String value) {
            addCriterion("XINGBIE <>", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieGreaterThan(String value) {
            addCriterion("XINGBIE >", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieGreaterThanOrEqualTo(String value) {
            addCriterion("XINGBIE >=", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieLessThan(String value) {
            addCriterion("XINGBIE <", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieLessThanOrEqualTo(String value) {
            addCriterion("XINGBIE <=", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieLike(String value) {
            addCriterion("XINGBIE like", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieNotLike(String value) {
            addCriterion("XINGBIE not like", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieIn(List<String> values) {
            addCriterion("XINGBIE in", values, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieNotIn(List<String> values) {
            addCriterion("XINGBIE not in", values, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieBetween(String value1, String value2) {
            addCriterion("XINGBIE between", value1, value2, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieNotBetween(String value1, String value2) {
            addCriterion("XINGBIE not between", value1, value2, "xingbie");
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

        public Criteria andDanweizhiwuIsNull() {
            addCriterion("DANWEIZHIWU is null");
            return (Criteria) this;
        }

        public Criteria andDanweizhiwuIsNotNull() {
            addCriterion("DANWEIZHIWU is not null");
            return (Criteria) this;
        }

        public Criteria andDanweizhiwuEqualTo(String value) {
            addCriterion("DANWEIZHIWU =", value, "danweizhiwu");
            return (Criteria) this;
        }

        public Criteria andDanweizhiwuNotEqualTo(String value) {
            addCriterion("DANWEIZHIWU <>", value, "danweizhiwu");
            return (Criteria) this;
        }

        public Criteria andDanweizhiwuGreaterThan(String value) {
            addCriterion("DANWEIZHIWU >", value, "danweizhiwu");
            return (Criteria) this;
        }

        public Criteria andDanweizhiwuGreaterThanOrEqualTo(String value) {
            addCriterion("DANWEIZHIWU >=", value, "danweizhiwu");
            return (Criteria) this;
        }

        public Criteria andDanweizhiwuLessThan(String value) {
            addCriterion("DANWEIZHIWU <", value, "danweizhiwu");
            return (Criteria) this;
        }

        public Criteria andDanweizhiwuLessThanOrEqualTo(String value) {
            addCriterion("DANWEIZHIWU <=", value, "danweizhiwu");
            return (Criteria) this;
        }

        public Criteria andDanweizhiwuLike(String value) {
            addCriterion("DANWEIZHIWU like", value, "danweizhiwu");
            return (Criteria) this;
        }

        public Criteria andDanweizhiwuNotLike(String value) {
            addCriterion("DANWEIZHIWU not like", value, "danweizhiwu");
            return (Criteria) this;
        }

        public Criteria andDanweizhiwuIn(List<String> values) {
            addCriterion("DANWEIZHIWU in", values, "danweizhiwu");
            return (Criteria) this;
        }

        public Criteria andDanweizhiwuNotIn(List<String> values) {
            addCriterion("DANWEIZHIWU not in", values, "danweizhiwu");
            return (Criteria) this;
        }

        public Criteria andDanweizhiwuBetween(String value1, String value2) {
            addCriterion("DANWEIZHIWU between", value1, value2, "danweizhiwu");
            return (Criteria) this;
        }

        public Criteria andDanweizhiwuNotBetween(String value1, String value2) {
            addCriterion("DANWEIZHIWU not between", value1, value2, "danweizhiwu");
            return (Criteria) this;
        }

        public Criteria andGongzuodanweiIsNull() {
            addCriterion("GONGZUODANWEI is null");
            return (Criteria) this;
        }

        public Criteria andGongzuodanweiIsNotNull() {
            addCriterion("GONGZUODANWEI is not null");
            return (Criteria) this;
        }

        public Criteria andGongzuodanweiEqualTo(String value) {
            addCriterion("GONGZUODANWEI =", value, "gongzuodanwei");
            return (Criteria) this;
        }

        public Criteria andGongzuodanweiNotEqualTo(String value) {
            addCriterion("GONGZUODANWEI <>", value, "gongzuodanwei");
            return (Criteria) this;
        }

        public Criteria andGongzuodanweiGreaterThan(String value) {
            addCriterion("GONGZUODANWEI >", value, "gongzuodanwei");
            return (Criteria) this;
        }

        public Criteria andGongzuodanweiGreaterThanOrEqualTo(String value) {
            addCriterion("GONGZUODANWEI >=", value, "gongzuodanwei");
            return (Criteria) this;
        }

        public Criteria andGongzuodanweiLessThan(String value) {
            addCriterion("GONGZUODANWEI <", value, "gongzuodanwei");
            return (Criteria) this;
        }

        public Criteria andGongzuodanweiLessThanOrEqualTo(String value) {
            addCriterion("GONGZUODANWEI <=", value, "gongzuodanwei");
            return (Criteria) this;
        }

        public Criteria andGongzuodanweiLike(String value) {
            addCriterion("GONGZUODANWEI like", value, "gongzuodanwei");
            return (Criteria) this;
        }

        public Criteria andGongzuodanweiNotLike(String value) {
            addCriterion("GONGZUODANWEI not like", value, "gongzuodanwei");
            return (Criteria) this;
        }

        public Criteria andGongzuodanweiIn(List<String> values) {
            addCriterion("GONGZUODANWEI in", values, "gongzuodanwei");
            return (Criteria) this;
        }

        public Criteria andGongzuodanweiNotIn(List<String> values) {
            addCriterion("GONGZUODANWEI not in", values, "gongzuodanwei");
            return (Criteria) this;
        }

        public Criteria andGongzuodanweiBetween(String value1, String value2) {
            addCriterion("GONGZUODANWEI between", value1, value2, "gongzuodanwei");
            return (Criteria) this;
        }

        public Criteria andGongzuodanweiNotBetween(String value1, String value2) {
            addCriterion("GONGZUODANWEI not between", value1, value2, "gongzuodanwei");
            return (Criteria) this;
        }

        public Criteria andZaizhizhuangtaiIsNull() {
            addCriterion("ZAIZHIZHUANGTAI is null");
            return (Criteria) this;
        }

        public Criteria andZaizhizhuangtaiIsNotNull() {
            addCriterion("ZAIZHIZHUANGTAI is not null");
            return (Criteria) this;
        }

        public Criteria andZaizhizhuangtaiEqualTo(String value) {
            addCriterion("ZAIZHIZHUANGTAI =", value, "zaizhizhuangtai");
            return (Criteria) this;
        }

        public Criteria andZaizhizhuangtaiNotEqualTo(String value) {
            addCriterion("ZAIZHIZHUANGTAI <>", value, "zaizhizhuangtai");
            return (Criteria) this;
        }

        public Criteria andZaizhizhuangtaiGreaterThan(String value) {
            addCriterion("ZAIZHIZHUANGTAI >", value, "zaizhizhuangtai");
            return (Criteria) this;
        }

        public Criteria andZaizhizhuangtaiGreaterThanOrEqualTo(String value) {
            addCriterion("ZAIZHIZHUANGTAI >=", value, "zaizhizhuangtai");
            return (Criteria) this;
        }

        public Criteria andZaizhizhuangtaiLessThan(String value) {
            addCriterion("ZAIZHIZHUANGTAI <", value, "zaizhizhuangtai");
            return (Criteria) this;
        }

        public Criteria andZaizhizhuangtaiLessThanOrEqualTo(String value) {
            addCriterion("ZAIZHIZHUANGTAI <=", value, "zaizhizhuangtai");
            return (Criteria) this;
        }

        public Criteria andZaizhizhuangtaiLike(String value) {
            addCriterion("ZAIZHIZHUANGTAI like", value, "zaizhizhuangtai");
            return (Criteria) this;
        }

        public Criteria andZaizhizhuangtaiNotLike(String value) {
            addCriterion("ZAIZHIZHUANGTAI not like", value, "zaizhizhuangtai");
            return (Criteria) this;
        }

        public Criteria andZaizhizhuangtaiIn(List<String> values) {
            addCriterion("ZAIZHIZHUANGTAI in", values, "zaizhizhuangtai");
            return (Criteria) this;
        }

        public Criteria andZaizhizhuangtaiNotIn(List<String> values) {
            addCriterion("ZAIZHIZHUANGTAI not in", values, "zaizhizhuangtai");
            return (Criteria) this;
        }

        public Criteria andZaizhizhuangtaiBetween(String value1, String value2) {
            addCriterion("ZAIZHIZHUANGTAI between", value1, value2, "zaizhizhuangtai");
            return (Criteria) this;
        }

        public Criteria andZaizhizhuangtaiNotBetween(String value1, String value2) {
            addCriterion("ZAIZHIZHUANGTAI not between", value1, value2, "zaizhizhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhiwuIsNull() {
            addCriterion("ZHIWU is null");
            return (Criteria) this;
        }

        public Criteria andZhiwuIsNotNull() {
            addCriterion("ZHIWU is not null");
            return (Criteria) this;
        }

        public Criteria andZhiwuEqualTo(String value) {
            addCriterion("ZHIWU =", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuNotEqualTo(String value) {
            addCriterion("ZHIWU <>", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuGreaterThan(String value) {
            addCriterion("ZHIWU >", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuGreaterThanOrEqualTo(String value) {
            addCriterion("ZHIWU >=", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuLessThan(String value) {
            addCriterion("ZHIWU <", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuLessThanOrEqualTo(String value) {
            addCriterion("ZHIWU <=", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuLike(String value) {
            addCriterion("ZHIWU like", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuNotLike(String value) {
            addCriterion("ZHIWU not like", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuIn(List<String> values) {
            addCriterion("ZHIWU in", values, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuNotIn(List<String> values) {
            addCriterion("ZHIWU not in", values, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuBetween(String value1, String value2) {
            addCriterion("ZHIWU between", value1, value2, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuNotBetween(String value1, String value2) {
            addCriterion("ZHIWU not between", value1, value2, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andLingchouqingkuangIsNull() {
            addCriterion("LINGCHOUQINGKUANG is null");
            return (Criteria) this;
        }

        public Criteria andLingchouqingkuangIsNotNull() {
            addCriterion("LINGCHOUQINGKUANG is not null");
            return (Criteria) this;
        }

        public Criteria andLingchouqingkuangEqualTo(String value) {
            addCriterion("LINGCHOUQINGKUANG =", value, "lingchouqingkuang");
            return (Criteria) this;
        }

        public Criteria andLingchouqingkuangNotEqualTo(String value) {
            addCriterion("LINGCHOUQINGKUANG <>", value, "lingchouqingkuang");
            return (Criteria) this;
        }

        public Criteria andLingchouqingkuangGreaterThan(String value) {
            addCriterion("LINGCHOUQINGKUANG >", value, "lingchouqingkuang");
            return (Criteria) this;
        }

        public Criteria andLingchouqingkuangGreaterThanOrEqualTo(String value) {
            addCriterion("LINGCHOUQINGKUANG >=", value, "lingchouqingkuang");
            return (Criteria) this;
        }

        public Criteria andLingchouqingkuangLessThan(String value) {
            addCriterion("LINGCHOUQINGKUANG <", value, "lingchouqingkuang");
            return (Criteria) this;
        }

        public Criteria andLingchouqingkuangLessThanOrEqualTo(String value) {
            addCriterion("LINGCHOUQINGKUANG <=", value, "lingchouqingkuang");
            return (Criteria) this;
        }

        public Criteria andLingchouqingkuangLike(String value) {
            addCriterion("LINGCHOUQINGKUANG like", value, "lingchouqingkuang");
            return (Criteria) this;
        }

        public Criteria andLingchouqingkuangNotLike(String value) {
            addCriterion("LINGCHOUQINGKUANG not like", value, "lingchouqingkuang");
            return (Criteria) this;
        }

        public Criteria andLingchouqingkuangIn(List<String> values) {
            addCriterion("LINGCHOUQINGKUANG in", values, "lingchouqingkuang");
            return (Criteria) this;
        }

        public Criteria andLingchouqingkuangNotIn(List<String> values) {
            addCriterion("LINGCHOUQINGKUANG not in", values, "lingchouqingkuang");
            return (Criteria) this;
        }

        public Criteria andLingchouqingkuangBetween(String value1, String value2) {
            addCriterion("LINGCHOUQINGKUANG between", value1, value2, "lingchouqingkuang");
            return (Criteria) this;
        }

        public Criteria andLingchouqingkuangNotBetween(String value1, String value2) {
            addCriterion("LINGCHOUQINGKUANG not between", value1, value2, "lingchouqingkuang");
            return (Criteria) this;
        }

        public Criteria andPizhundanweiIsNull() {
            addCriterion("PIZHUNDANWEI is null");
            return (Criteria) this;
        }

        public Criteria andPizhundanweiIsNotNull() {
            addCriterion("PIZHUNDANWEI is not null");
            return (Criteria) this;
        }

        public Criteria andPizhundanweiEqualTo(String value) {
            addCriterion("PIZHUNDANWEI =", value, "pizhundanwei");
            return (Criteria) this;
        }

        public Criteria andPizhundanweiNotEqualTo(String value) {
            addCriterion("PIZHUNDANWEI <>", value, "pizhundanwei");
            return (Criteria) this;
        }

        public Criteria andPizhundanweiGreaterThan(String value) {
            addCriterion("PIZHUNDANWEI >", value, "pizhundanwei");
            return (Criteria) this;
        }

        public Criteria andPizhundanweiGreaterThanOrEqualTo(String value) {
            addCriterion("PIZHUNDANWEI >=", value, "pizhundanwei");
            return (Criteria) this;
        }

        public Criteria andPizhundanweiLessThan(String value) {
            addCriterion("PIZHUNDANWEI <", value, "pizhundanwei");
            return (Criteria) this;
        }

        public Criteria andPizhundanweiLessThanOrEqualTo(String value) {
            addCriterion("PIZHUNDANWEI <=", value, "pizhundanwei");
            return (Criteria) this;
        }

        public Criteria andPizhundanweiLike(String value) {
            addCriterion("PIZHUNDANWEI like", value, "pizhundanwei");
            return (Criteria) this;
        }

        public Criteria andPizhundanweiNotLike(String value) {
            addCriterion("PIZHUNDANWEI not like", value, "pizhundanwei");
            return (Criteria) this;
        }

        public Criteria andPizhundanweiIn(List<String> values) {
            addCriterion("PIZHUNDANWEI in", values, "pizhundanwei");
            return (Criteria) this;
        }

        public Criteria andPizhundanweiNotIn(List<String> values) {
            addCriterion("PIZHUNDANWEI not in", values, "pizhundanwei");
            return (Criteria) this;
        }

        public Criteria andPizhundanweiBetween(String value1, String value2) {
            addCriterion("PIZHUNDANWEI between", value1, value2, "pizhundanwei");
            return (Criteria) this;
        }

        public Criteria andPizhundanweiNotBetween(String value1, String value2) {
            addCriterion("PIZHUNDANWEI not between", value1, value2, "pizhundanwei");
            return (Criteria) this;
        }

        public Criteria andPizhunshijianIsNull() {
            addCriterion("PIZHUNSHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andPizhunshijianIsNotNull() {
            addCriterion("PIZHUNSHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andPizhunshijianEqualTo(Date value) {
            addCriterion("PIZHUNSHIJIAN =", value, "pizhunshijian");
            return (Criteria) this;
        }

        public Criteria andPizhunshijianNotEqualTo(Date value) {
            addCriterion("PIZHUNSHIJIAN <>", value, "pizhunshijian");
            return (Criteria) this;
        }

        public Criteria andPizhunshijianGreaterThan(Date value) {
            addCriterion("PIZHUNSHIJIAN >", value, "pizhunshijian");
            return (Criteria) this;
        }

        public Criteria andPizhunshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("PIZHUNSHIJIAN >=", value, "pizhunshijian");
            return (Criteria) this;
        }

        public Criteria andPizhunshijianLessThan(Date value) {
            addCriterion("PIZHUNSHIJIAN <", value, "pizhunshijian");
            return (Criteria) this;
        }

        public Criteria andPizhunshijianLessThanOrEqualTo(Date value) {
            addCriterion("PIZHUNSHIJIAN <=", value, "pizhunshijian");
            return (Criteria) this;
        }

        public Criteria andPizhunshijianIn(List<Date> values) {
            addCriterion("PIZHUNSHIJIAN in", values, "pizhunshijian");
            return (Criteria) this;
        }

        public Criteria andPizhunshijianNotIn(List<Date> values) {
            addCriterion("PIZHUNSHIJIAN not in", values, "pizhunshijian");
            return (Criteria) this;
        }

        public Criteria andPizhunshijianBetween(Date value1, Date value2) {
            addCriterion("PIZHUNSHIJIAN between", value1, value2, "pizhunshijian");
            return (Criteria) this;
        }

        public Criteria andPizhunshijianNotBetween(Date value1, Date value2) {
            addCriterion("PIZHUNSHIJIAN not between", value1, value2, "pizhunshijian");
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