package com.xgb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StNjReport14SubExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StNjReport14SubExample() {
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

        public Criteria andLeixingIsNull() {
            addCriterion("LEIXING is null");
            return (Criteria) this;
        }

        public Criteria andLeixingIsNotNull() {
            addCriterion("LEIXING is not null");
            return (Criteria) this;
        }

        public Criteria andLeixingEqualTo(String value) {
            addCriterion("LEIXING =", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingNotEqualTo(String value) {
            addCriterion("LEIXING <>", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingGreaterThan(String value) {
            addCriterion("LEIXING >", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingGreaterThanOrEqualTo(String value) {
            addCriterion("LEIXING >=", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingLessThan(String value) {
            addCriterion("LEIXING <", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingLessThanOrEqualTo(String value) {
            addCriterion("LEIXING <=", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingLike(String value) {
            addCriterion("LEIXING like", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingNotLike(String value) {
            addCriterion("LEIXING not like", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingIn(List<String> values) {
            addCriterion("LEIXING in", values, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingNotIn(List<String> values) {
            addCriterion("LEIXING not in", values, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingBetween(String value1, String value2) {
            addCriterion("LEIXING between", value1, value2, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingNotBetween(String value1, String value2) {
            addCriterion("LEIXING not between", value1, value2, "leixing");
            return (Criteria) this;
        }

        public Criteria andHuodongmingchengIsNull() {
            addCriterion("HUODONGMINGCHENG is null");
            return (Criteria) this;
        }

        public Criteria andHuodongmingchengIsNotNull() {
            addCriterion("HUODONGMINGCHENG is not null");
            return (Criteria) this;
        }

        public Criteria andHuodongmingchengEqualTo(String value) {
            addCriterion("HUODONGMINGCHENG =", value, "huodongmingcheng");
            return (Criteria) this;
        }

        public Criteria andHuodongmingchengNotEqualTo(String value) {
            addCriterion("HUODONGMINGCHENG <>", value, "huodongmingcheng");
            return (Criteria) this;
        }

        public Criteria andHuodongmingchengGreaterThan(String value) {
            addCriterion("HUODONGMINGCHENG >", value, "huodongmingcheng");
            return (Criteria) this;
        }

        public Criteria andHuodongmingchengGreaterThanOrEqualTo(String value) {
            addCriterion("HUODONGMINGCHENG >=", value, "huodongmingcheng");
            return (Criteria) this;
        }

        public Criteria andHuodongmingchengLessThan(String value) {
            addCriterion("HUODONGMINGCHENG <", value, "huodongmingcheng");
            return (Criteria) this;
        }

        public Criteria andHuodongmingchengLessThanOrEqualTo(String value) {
            addCriterion("HUODONGMINGCHENG <=", value, "huodongmingcheng");
            return (Criteria) this;
        }

        public Criteria andHuodongmingchengLike(String value) {
            addCriterion("HUODONGMINGCHENG like", value, "huodongmingcheng");
            return (Criteria) this;
        }

        public Criteria andHuodongmingchengNotLike(String value) {
            addCriterion("HUODONGMINGCHENG not like", value, "huodongmingcheng");
            return (Criteria) this;
        }

        public Criteria andHuodongmingchengIn(List<String> values) {
            addCriterion("HUODONGMINGCHENG in", values, "huodongmingcheng");
            return (Criteria) this;
        }

        public Criteria andHuodongmingchengNotIn(List<String> values) {
            addCriterion("HUODONGMINGCHENG not in", values, "huodongmingcheng");
            return (Criteria) this;
        }

        public Criteria andHuodongmingchengBetween(String value1, String value2) {
            addCriterion("HUODONGMINGCHENG between", value1, value2, "huodongmingcheng");
            return (Criteria) this;
        }

        public Criteria andHuodongmingchengNotBetween(String value1, String value2) {
            addCriterion("HUODONGMINGCHENG not between", value1, value2, "huodongmingcheng");
            return (Criteria) this;
        }

        public Criteria andShijianIsNull() {
            addCriterion("SHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andShijianIsNotNull() {
            addCriterion("SHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andShijianEqualTo(String value) {
            addCriterion("SHIJIAN =", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianNotEqualTo(String value) {
            addCriterion("SHIJIAN <>", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianGreaterThan(String value) {
            addCriterion("SHIJIAN >", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianGreaterThanOrEqualTo(String value) {
            addCriterion("SHIJIAN >=", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianLessThan(String value) {
            addCriterion("SHIJIAN <", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianLessThanOrEqualTo(String value) {
            addCriterion("SHIJIAN <=", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianLike(String value) {
            addCriterion("SHIJIAN like", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianNotLike(String value) {
            addCriterion("SHIJIAN not like", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianIn(List<String> values) {
            addCriterion("SHIJIAN in", values, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianNotIn(List<String> values) {
            addCriterion("SHIJIAN not in", values, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianBetween(String value1, String value2) {
            addCriterion("SHIJIAN between", value1, value2, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianNotBetween(String value1, String value2) {
            addCriterion("SHIJIAN not between", value1, value2, "shijian");
            return (Criteria) this;
        }

        public Criteria andDidianIsNull() {
            addCriterion("DIDIAN is null");
            return (Criteria) this;
        }

        public Criteria andDidianIsNotNull() {
            addCriterion("DIDIAN is not null");
            return (Criteria) this;
        }

        public Criteria andDidianEqualTo(String value) {
            addCriterion("DIDIAN =", value, "didian");
            return (Criteria) this;
        }

        public Criteria andDidianNotEqualTo(String value) {
            addCriterion("DIDIAN <>", value, "didian");
            return (Criteria) this;
        }

        public Criteria andDidianGreaterThan(String value) {
            addCriterion("DIDIAN >", value, "didian");
            return (Criteria) this;
        }

        public Criteria andDidianGreaterThanOrEqualTo(String value) {
            addCriterion("DIDIAN >=", value, "didian");
            return (Criteria) this;
        }

        public Criteria andDidianLessThan(String value) {
            addCriterion("DIDIAN <", value, "didian");
            return (Criteria) this;
        }

        public Criteria andDidianLessThanOrEqualTo(String value) {
            addCriterion("DIDIAN <=", value, "didian");
            return (Criteria) this;
        }

        public Criteria andDidianLike(String value) {
            addCriterion("DIDIAN like", value, "didian");
            return (Criteria) this;
        }

        public Criteria andDidianNotLike(String value) {
            addCriterion("DIDIAN not like", value, "didian");
            return (Criteria) this;
        }

        public Criteria andDidianIn(List<String> values) {
            addCriterion("DIDIAN in", values, "didian");
            return (Criteria) this;
        }

        public Criteria andDidianNotIn(List<String> values) {
            addCriterion("DIDIAN not in", values, "didian");
            return (Criteria) this;
        }

        public Criteria andDidianBetween(String value1, String value2) {
            addCriterion("DIDIAN between", value1, value2, "didian");
            return (Criteria) this;
        }

        public Criteria andDidianNotBetween(String value1, String value2) {
            addCriterion("DIDIAN not between", value1, value2, "didian");
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

        public Criteria andShoufeiqingkuangIsNull() {
            addCriterion("SHOUFEIQINGKUANG is null");
            return (Criteria) this;
        }

        public Criteria andShoufeiqingkuangIsNotNull() {
            addCriterion("SHOUFEIQINGKUANG is not null");
            return (Criteria) this;
        }

        public Criteria andShoufeiqingkuangEqualTo(String value) {
            addCriterion("SHOUFEIQINGKUANG =", value, "shoufeiqingkuang");
            return (Criteria) this;
        }

        public Criteria andShoufeiqingkuangNotEqualTo(String value) {
            addCriterion("SHOUFEIQINGKUANG <>", value, "shoufeiqingkuang");
            return (Criteria) this;
        }

        public Criteria andShoufeiqingkuangGreaterThan(String value) {
            addCriterion("SHOUFEIQINGKUANG >", value, "shoufeiqingkuang");
            return (Criteria) this;
        }

        public Criteria andShoufeiqingkuangGreaterThanOrEqualTo(String value) {
            addCriterion("SHOUFEIQINGKUANG >=", value, "shoufeiqingkuang");
            return (Criteria) this;
        }

        public Criteria andShoufeiqingkuangLessThan(String value) {
            addCriterion("SHOUFEIQINGKUANG <", value, "shoufeiqingkuang");
            return (Criteria) this;
        }

        public Criteria andShoufeiqingkuangLessThanOrEqualTo(String value) {
            addCriterion("SHOUFEIQINGKUANG <=", value, "shoufeiqingkuang");
            return (Criteria) this;
        }

        public Criteria andShoufeiqingkuangLike(String value) {
            addCriterion("SHOUFEIQINGKUANG like", value, "shoufeiqingkuang");
            return (Criteria) this;
        }

        public Criteria andShoufeiqingkuangNotLike(String value) {
            addCriterion("SHOUFEIQINGKUANG not like", value, "shoufeiqingkuang");
            return (Criteria) this;
        }

        public Criteria andShoufeiqingkuangIn(List<String> values) {
            addCriterion("SHOUFEIQINGKUANG in", values, "shoufeiqingkuang");
            return (Criteria) this;
        }

        public Criteria andShoufeiqingkuangNotIn(List<String> values) {
            addCriterion("SHOUFEIQINGKUANG not in", values, "shoufeiqingkuang");
            return (Criteria) this;
        }

        public Criteria andShoufeiqingkuangBetween(String value1, String value2) {
            addCriterion("SHOUFEIQINGKUANG between", value1, value2, "shoufeiqingkuang");
            return (Criteria) this;
        }

        public Criteria andShoufeiqingkuangNotBetween(String value1, String value2) {
            addCriterion("SHOUFEIQINGKUANG not between", value1, value2, "shoufeiqingkuang");
            return (Criteria) this;
        }

        public Criteria andShijian3IsNull() {
            addCriterion("SHIJIAN3 is null");
            return (Criteria) this;
        }

        public Criteria andShijian3IsNotNull() {
            addCriterion("SHIJIAN3 is not null");
            return (Criteria) this;
        }

        public Criteria andShijian3EqualTo(Date value) {
            addCriterion("SHIJIAN3 =", value, "shijian3");
            return (Criteria) this;
        }

        public Criteria andShijian3NotEqualTo(Date value) {
            addCriterion("SHIJIAN3 <>", value, "shijian3");
            return (Criteria) this;
        }

        public Criteria andShijian3GreaterThan(Date value) {
            addCriterion("SHIJIAN3 >", value, "shijian3");
            return (Criteria) this;
        }

        public Criteria andShijian3GreaterThanOrEqualTo(Date value) {
            addCriterion("SHIJIAN3 >=", value, "shijian3");
            return (Criteria) this;
        }

        public Criteria andShijian3LessThan(Date value) {
            addCriterion("SHIJIAN3 <", value, "shijian3");
            return (Criteria) this;
        }

        public Criteria andShijian3LessThanOrEqualTo(Date value) {
            addCriterion("SHIJIAN3 <=", value, "shijian3");
            return (Criteria) this;
        }

        public Criteria andShijian3In(List<Date> values) {
            addCriterion("SHIJIAN3 in", values, "shijian3");
            return (Criteria) this;
        }

        public Criteria andShijian3NotIn(List<Date> values) {
            addCriterion("SHIJIAN3 not in", values, "shijian3");
            return (Criteria) this;
        }

        public Criteria andShijian3Between(Date value1, Date value2) {
            addCriterion("SHIJIAN3 between", value1, value2, "shijian3");
            return (Criteria) this;
        }

        public Criteria andShijian3NotBetween(Date value1, Date value2) {
            addCriterion("SHIJIAN3 not between", value1, value2, "shijian3");
            return (Criteria) this;
        }

        public Criteria andZijinzizouIsNull() {
            addCriterion("ZIJINZIZOU is null");
            return (Criteria) this;
        }

        public Criteria andZijinzizouIsNotNull() {
            addCriterion("ZIJINZIZOU is not null");
            return (Criteria) this;
        }

        public Criteria andZijinzizouEqualTo(String value) {
            addCriterion("ZIJINZIZOU =", value, "zijinzizou");
            return (Criteria) this;
        }

        public Criteria andZijinzizouNotEqualTo(String value) {
            addCriterion("ZIJINZIZOU <>", value, "zijinzizou");
            return (Criteria) this;
        }

        public Criteria andZijinzizouGreaterThan(String value) {
            addCriterion("ZIJINZIZOU >", value, "zijinzizou");
            return (Criteria) this;
        }

        public Criteria andZijinzizouGreaterThanOrEqualTo(String value) {
            addCriterion("ZIJINZIZOU >=", value, "zijinzizou");
            return (Criteria) this;
        }

        public Criteria andZijinzizouLessThan(String value) {
            addCriterion("ZIJINZIZOU <", value, "zijinzizou");
            return (Criteria) this;
        }

        public Criteria andZijinzizouLessThanOrEqualTo(String value) {
            addCriterion("ZIJINZIZOU <=", value, "zijinzizou");
            return (Criteria) this;
        }

        public Criteria andZijinzizouLike(String value) {
            addCriterion("ZIJINZIZOU like", value, "zijinzizou");
            return (Criteria) this;
        }

        public Criteria andZijinzizouNotLike(String value) {
            addCriterion("ZIJINZIZOU not like", value, "zijinzizou");
            return (Criteria) this;
        }

        public Criteria andZijinzizouIn(List<String> values) {
            addCriterion("ZIJINZIZOU in", values, "zijinzizou");
            return (Criteria) this;
        }

        public Criteria andZijinzizouNotIn(List<String> values) {
            addCriterion("ZIJINZIZOU not in", values, "zijinzizou");
            return (Criteria) this;
        }

        public Criteria andZijinzizouBetween(String value1, String value2) {
            addCriterion("ZIJINZIZOU between", value1, value2, "zijinzizou");
            return (Criteria) this;
        }

        public Criteria andZijinzizouNotBetween(String value1, String value2) {
            addCriterion("ZIJINZIZOU not between", value1, value2, "zijinzizou");
            return (Criteria) this;
        }

        public Criteria andJishuIsNull() {
            addCriterion("JISHU is null");
            return (Criteria) this;
        }

        public Criteria andJishuIsNotNull() {
            addCriterion("JISHU is not null");
            return (Criteria) this;
        }

        public Criteria andJishuEqualTo(String value) {
            addCriterion("JISHU =", value, "jishu");
            return (Criteria) this;
        }

        public Criteria andJishuNotEqualTo(String value) {
            addCriterion("JISHU <>", value, "jishu");
            return (Criteria) this;
        }

        public Criteria andJishuGreaterThan(String value) {
            addCriterion("JISHU >", value, "jishu");
            return (Criteria) this;
        }

        public Criteria andJishuGreaterThanOrEqualTo(String value) {
            addCriterion("JISHU >=", value, "jishu");
            return (Criteria) this;
        }

        public Criteria andJishuLessThan(String value) {
            addCriterion("JISHU <", value, "jishu");
            return (Criteria) this;
        }

        public Criteria andJishuLessThanOrEqualTo(String value) {
            addCriterion("JISHU <=", value, "jishu");
            return (Criteria) this;
        }

        public Criteria andJishuLike(String value) {
            addCriterion("JISHU like", value, "jishu");
            return (Criteria) this;
        }

        public Criteria andJishuNotLike(String value) {
            addCriterion("JISHU not like", value, "jishu");
            return (Criteria) this;
        }

        public Criteria andJishuIn(List<String> values) {
            addCriterion("JISHU in", values, "jishu");
            return (Criteria) this;
        }

        public Criteria andJishuNotIn(List<String> values) {
            addCriterion("JISHU not in", values, "jishu");
            return (Criteria) this;
        }

        public Criteria andJishuBetween(String value1, String value2) {
            addCriterion("JISHU between", value1, value2, "jishu");
            return (Criteria) this;
        }

        public Criteria andJishuNotBetween(String value1, String value2) {
            addCriterion("JISHU not between", value1, value2, "jishu");
            return (Criteria) this;
        }

        public Criteria andXinxiIsNull() {
            addCriterion("XINXI is null");
            return (Criteria) this;
        }

        public Criteria andXinxiIsNotNull() {
            addCriterion("XINXI is not null");
            return (Criteria) this;
        }

        public Criteria andXinxiEqualTo(String value) {
            addCriterion("XINXI =", value, "xinxi");
            return (Criteria) this;
        }

        public Criteria andXinxiNotEqualTo(String value) {
            addCriterion("XINXI <>", value, "xinxi");
            return (Criteria) this;
        }

        public Criteria andXinxiGreaterThan(String value) {
            addCriterion("XINXI >", value, "xinxi");
            return (Criteria) this;
        }

        public Criteria andXinxiGreaterThanOrEqualTo(String value) {
            addCriterion("XINXI >=", value, "xinxi");
            return (Criteria) this;
        }

        public Criteria andXinxiLessThan(String value) {
            addCriterion("XINXI <", value, "xinxi");
            return (Criteria) this;
        }

        public Criteria andXinxiLessThanOrEqualTo(String value) {
            addCriterion("XINXI <=", value, "xinxi");
            return (Criteria) this;
        }

        public Criteria andXinxiLike(String value) {
            addCriterion("XINXI like", value, "xinxi");
            return (Criteria) this;
        }

        public Criteria andXinxiNotLike(String value) {
            addCriterion("XINXI not like", value, "xinxi");
            return (Criteria) this;
        }

        public Criteria andXinxiIn(List<String> values) {
            addCriterion("XINXI in", values, "xinxi");
            return (Criteria) this;
        }

        public Criteria andXinxiNotIn(List<String> values) {
            addCriterion("XINXI not in", values, "xinxi");
            return (Criteria) this;
        }

        public Criteria andXinxiBetween(String value1, String value2) {
            addCriterion("XINXI between", value1, value2, "xinxi");
            return (Criteria) this;
        }

        public Criteria andXinxiNotBetween(String value1, String value2) {
            addCriterion("XINXI not between", value1, value2, "xinxi");
            return (Criteria) this;
        }

        public Criteria andZhuanjiarencaiIsNull() {
            addCriterion("ZHUANJIARENCAI is null");
            return (Criteria) this;
        }

        public Criteria andZhuanjiarencaiIsNotNull() {
            addCriterion("ZHUANJIARENCAI is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanjiarencaiEqualTo(String value) {
            addCriterion("ZHUANJIARENCAI =", value, "zhuanjiarencai");
            return (Criteria) this;
        }

        public Criteria andZhuanjiarencaiNotEqualTo(String value) {
            addCriterion("ZHUANJIARENCAI <>", value, "zhuanjiarencai");
            return (Criteria) this;
        }

        public Criteria andZhuanjiarencaiGreaterThan(String value) {
            addCriterion("ZHUANJIARENCAI >", value, "zhuanjiarencai");
            return (Criteria) this;
        }

        public Criteria andZhuanjiarencaiGreaterThanOrEqualTo(String value) {
            addCriterion("ZHUANJIARENCAI >=", value, "zhuanjiarencai");
            return (Criteria) this;
        }

        public Criteria andZhuanjiarencaiLessThan(String value) {
            addCriterion("ZHUANJIARENCAI <", value, "zhuanjiarencai");
            return (Criteria) this;
        }

        public Criteria andZhuanjiarencaiLessThanOrEqualTo(String value) {
            addCriterion("ZHUANJIARENCAI <=", value, "zhuanjiarencai");
            return (Criteria) this;
        }

        public Criteria andZhuanjiarencaiLike(String value) {
            addCriterion("ZHUANJIARENCAI like", value, "zhuanjiarencai");
            return (Criteria) this;
        }

        public Criteria andZhuanjiarencaiNotLike(String value) {
            addCriterion("ZHUANJIARENCAI not like", value, "zhuanjiarencai");
            return (Criteria) this;
        }

        public Criteria andZhuanjiarencaiIn(List<String> values) {
            addCriterion("ZHUANJIARENCAI in", values, "zhuanjiarencai");
            return (Criteria) this;
        }

        public Criteria andZhuanjiarencaiNotIn(List<String> values) {
            addCriterion("ZHUANJIARENCAI not in", values, "zhuanjiarencai");
            return (Criteria) this;
        }

        public Criteria andZhuanjiarencaiBetween(String value1, String value2) {
            addCriterion("ZHUANJIARENCAI between", value1, value2, "zhuanjiarencai");
            return (Criteria) this;
        }

        public Criteria andZhuanjiarencaiNotBetween(String value1, String value2) {
            addCriterion("ZHUANJIARENCAI not between", value1, value2, "zhuanjiarencai");
            return (Criteria) this;
        }

        public Criteria andTrainIsNull() {
            addCriterion("TRAIN is null");
            return (Criteria) this;
        }

        public Criteria andTrainIsNotNull() {
            addCriterion("TRAIN is not null");
            return (Criteria) this;
        }

        public Criteria andTrainEqualTo(String value) {
            addCriterion("TRAIN =", value, "train");
            return (Criteria) this;
        }

        public Criteria andTrainNotEqualTo(String value) {
            addCriterion("TRAIN <>", value, "train");
            return (Criteria) this;
        }

        public Criteria andTrainGreaterThan(String value) {
            addCriterion("TRAIN >", value, "train");
            return (Criteria) this;
        }

        public Criteria andTrainGreaterThanOrEqualTo(String value) {
            addCriterion("TRAIN >=", value, "train");
            return (Criteria) this;
        }

        public Criteria andTrainLessThan(String value) {
            addCriterion("TRAIN <", value, "train");
            return (Criteria) this;
        }

        public Criteria andTrainLessThanOrEqualTo(String value) {
            addCriterion("TRAIN <=", value, "train");
            return (Criteria) this;
        }

        public Criteria andTrainLike(String value) {
            addCriterion("TRAIN like", value, "train");
            return (Criteria) this;
        }

        public Criteria andTrainNotLike(String value) {
            addCriterion("TRAIN not like", value, "train");
            return (Criteria) this;
        }

        public Criteria andTrainIn(List<String> values) {
            addCriterion("TRAIN in", values, "train");
            return (Criteria) this;
        }

        public Criteria andTrainNotIn(List<String> values) {
            addCriterion("TRAIN not in", values, "train");
            return (Criteria) this;
        }

        public Criteria andTrainBetween(String value1, String value2) {
            addCriterion("TRAIN between", value1, value2, "train");
            return (Criteria) this;
        }

        public Criteria andTrainNotBetween(String value1, String value2) {
            addCriterion("TRAIN not between", value1, value2, "train");
            return (Criteria) this;
        }

        public Criteria andProductionIsNull() {
            addCriterion("PRODUCTION is null");
            return (Criteria) this;
        }

        public Criteria andProductionIsNotNull() {
            addCriterion("PRODUCTION is not null");
            return (Criteria) this;
        }

        public Criteria andProductionEqualTo(String value) {
            addCriterion("PRODUCTION =", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionNotEqualTo(String value) {
            addCriterion("PRODUCTION <>", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionGreaterThan(String value) {
            addCriterion("PRODUCTION >", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTION >=", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionLessThan(String value) {
            addCriterion("PRODUCTION <", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTION <=", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionLike(String value) {
            addCriterion("PRODUCTION like", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionNotLike(String value) {
            addCriterion("PRODUCTION not like", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionIn(List<String> values) {
            addCriterion("PRODUCTION in", values, "production");
            return (Criteria) this;
        }

        public Criteria andProductionNotIn(List<String> values) {
            addCriterion("PRODUCTION not in", values, "production");
            return (Criteria) this;
        }

        public Criteria andProductionBetween(String value1, String value2) {
            addCriterion("PRODUCTION between", value1, value2, "production");
            return (Criteria) this;
        }

        public Criteria andProductionNotBetween(String value1, String value2) {
            addCriterion("PRODUCTION not between", value1, value2, "production");
            return (Criteria) this;
        }

        public Criteria andConsultIsNull() {
            addCriterion("CONSULT is null");
            return (Criteria) this;
        }

        public Criteria andConsultIsNotNull() {
            addCriterion("CONSULT is not null");
            return (Criteria) this;
        }

        public Criteria andConsultEqualTo(String value) {
            addCriterion("CONSULT =", value, "consult");
            return (Criteria) this;
        }

        public Criteria andConsultNotEqualTo(String value) {
            addCriterion("CONSULT <>", value, "consult");
            return (Criteria) this;
        }

        public Criteria andConsultGreaterThan(String value) {
            addCriterion("CONSULT >", value, "consult");
            return (Criteria) this;
        }

        public Criteria andConsultGreaterThanOrEqualTo(String value) {
            addCriterion("CONSULT >=", value, "consult");
            return (Criteria) this;
        }

        public Criteria andConsultLessThan(String value) {
            addCriterion("CONSULT <", value, "consult");
            return (Criteria) this;
        }

        public Criteria andConsultLessThanOrEqualTo(String value) {
            addCriterion("CONSULT <=", value, "consult");
            return (Criteria) this;
        }

        public Criteria andConsultLike(String value) {
            addCriterion("CONSULT like", value, "consult");
            return (Criteria) this;
        }

        public Criteria andConsultNotLike(String value) {
            addCriterion("CONSULT not like", value, "consult");
            return (Criteria) this;
        }

        public Criteria andConsultIn(List<String> values) {
            addCriterion("CONSULT in", values, "consult");
            return (Criteria) this;
        }

        public Criteria andConsultNotIn(List<String> values) {
            addCriterion("CONSULT not in", values, "consult");
            return (Criteria) this;
        }

        public Criteria andConsultBetween(String value1, String value2) {
            addCriterion("CONSULT between", value1, value2, "consult");
            return (Criteria) this;
        }

        public Criteria andConsultNotBetween(String value1, String value2) {
            addCriterion("CONSULT not between", value1, value2, "consult");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("OTHER is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("OTHER =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("OTHER <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("OTHER >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("OTHER >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("OTHER <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("OTHER <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("OTHER like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("OTHER not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("OTHER in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("OTHER not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("OTHER between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("OTHER not between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andEducativeIsNull() {
            addCriterion("EDUCATIVE is null");
            return (Criteria) this;
        }

        public Criteria andEducativeIsNotNull() {
            addCriterion("EDUCATIVE is not null");
            return (Criteria) this;
        }

        public Criteria andEducativeEqualTo(String value) {
            addCriterion("EDUCATIVE =", value, "educative");
            return (Criteria) this;
        }

        public Criteria andEducativeNotEqualTo(String value) {
            addCriterion("EDUCATIVE <>", value, "educative");
            return (Criteria) this;
        }

        public Criteria andEducativeGreaterThan(String value) {
            addCriterion("EDUCATIVE >", value, "educative");
            return (Criteria) this;
        }

        public Criteria andEducativeGreaterThanOrEqualTo(String value) {
            addCriterion("EDUCATIVE >=", value, "educative");
            return (Criteria) this;
        }

        public Criteria andEducativeLessThan(String value) {
            addCriterion("EDUCATIVE <", value, "educative");
            return (Criteria) this;
        }

        public Criteria andEducativeLessThanOrEqualTo(String value) {
            addCriterion("EDUCATIVE <=", value, "educative");
            return (Criteria) this;
        }

        public Criteria andEducativeLike(String value) {
            addCriterion("EDUCATIVE like", value, "educative");
            return (Criteria) this;
        }

        public Criteria andEducativeNotLike(String value) {
            addCriterion("EDUCATIVE not like", value, "educative");
            return (Criteria) this;
        }

        public Criteria andEducativeIn(List<String> values) {
            addCriterion("EDUCATIVE in", values, "educative");
            return (Criteria) this;
        }

        public Criteria andEducativeNotIn(List<String> values) {
            addCriterion("EDUCATIVE not in", values, "educative");
            return (Criteria) this;
        }

        public Criteria andEducativeBetween(String value1, String value2) {
            addCriterion("EDUCATIVE between", value1, value2, "educative");
            return (Criteria) this;
        }

        public Criteria andEducativeNotBetween(String value1, String value2) {
            addCriterion("EDUCATIVE not between", value1, value2, "educative");
            return (Criteria) this;
        }

        public Criteria andAbilityIsNull() {
            addCriterion("ABILITY is null");
            return (Criteria) this;
        }

        public Criteria andAbilityIsNotNull() {
            addCriterion("ABILITY is not null");
            return (Criteria) this;
        }

        public Criteria andAbilityEqualTo(String value) {
            addCriterion("ABILITY =", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityNotEqualTo(String value) {
            addCriterion("ABILITY <>", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityGreaterThan(String value) {
            addCriterion("ABILITY >", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityGreaterThanOrEqualTo(String value) {
            addCriterion("ABILITY >=", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityLessThan(String value) {
            addCriterion("ABILITY <", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityLessThanOrEqualTo(String value) {
            addCriterion("ABILITY <=", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityLike(String value) {
            addCriterion("ABILITY like", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityNotLike(String value) {
            addCriterion("ABILITY not like", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityIn(List<String> values) {
            addCriterion("ABILITY in", values, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityNotIn(List<String> values) {
            addCriterion("ABILITY not in", values, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityBetween(String value1, String value2) {
            addCriterion("ABILITY between", value1, value2, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityNotBetween(String value1, String value2) {
            addCriterion("ABILITY not between", value1, value2, "ability");
            return (Criteria) this;
        }

        public Criteria andTechnologyIsNull() {
            addCriterion("TECHNOLOGY is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyIsNotNull() {
            addCriterion("TECHNOLOGY is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyEqualTo(String value) {
            addCriterion("TECHNOLOGY =", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyNotEqualTo(String value) {
            addCriterion("TECHNOLOGY <>", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyGreaterThan(String value) {
            addCriterion("TECHNOLOGY >", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyGreaterThanOrEqualTo(String value) {
            addCriterion("TECHNOLOGY >=", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyLessThan(String value) {
            addCriterion("TECHNOLOGY <", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyLessThanOrEqualTo(String value) {
            addCriterion("TECHNOLOGY <=", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyLike(String value) {
            addCriterion("TECHNOLOGY like", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyNotLike(String value) {
            addCriterion("TECHNOLOGY not like", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyIn(List<String> values) {
            addCriterion("TECHNOLOGY in", values, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyNotIn(List<String> values) {
            addCriterion("TECHNOLOGY not in", values, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyBetween(String value1, String value2) {
            addCriterion("TECHNOLOGY between", value1, value2, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyNotBetween(String value1, String value2) {
            addCriterion("TECHNOLOGY not between", value1, value2, "technology");
            return (Criteria) this;
        }

        public Criteria andFruitIsNull() {
            addCriterion("FRUIT is null");
            return (Criteria) this;
        }

        public Criteria andFruitIsNotNull() {
            addCriterion("FRUIT is not null");
            return (Criteria) this;
        }

        public Criteria andFruitEqualTo(String value) {
            addCriterion("FRUIT =", value, "fruit");
            return (Criteria) this;
        }

        public Criteria andFruitNotEqualTo(String value) {
            addCriterion("FRUIT <>", value, "fruit");
            return (Criteria) this;
        }

        public Criteria andFruitGreaterThan(String value) {
            addCriterion("FRUIT >", value, "fruit");
            return (Criteria) this;
        }

        public Criteria andFruitGreaterThanOrEqualTo(String value) {
            addCriterion("FRUIT >=", value, "fruit");
            return (Criteria) this;
        }

        public Criteria andFruitLessThan(String value) {
            addCriterion("FRUIT <", value, "fruit");
            return (Criteria) this;
        }

        public Criteria andFruitLessThanOrEqualTo(String value) {
            addCriterion("FRUIT <=", value, "fruit");
            return (Criteria) this;
        }

        public Criteria andFruitLike(String value) {
            addCriterion("FRUIT like", value, "fruit");
            return (Criteria) this;
        }

        public Criteria andFruitNotLike(String value) {
            addCriterion("FRUIT not like", value, "fruit");
            return (Criteria) this;
        }

        public Criteria andFruitIn(List<String> values) {
            addCriterion("FRUIT in", values, "fruit");
            return (Criteria) this;
        }

        public Criteria andFruitNotIn(List<String> values) {
            addCriterion("FRUIT not in", values, "fruit");
            return (Criteria) this;
        }

        public Criteria andFruitBetween(String value1, String value2) {
            addCriterion("FRUIT between", value1, value2, "fruit");
            return (Criteria) this;
        }

        public Criteria andFruitNotBetween(String value1, String value2) {
            addCriterion("FRUIT not between", value1, value2, "fruit");
            return (Criteria) this;
        }

        public Criteria andAgriculturalIsNull() {
            addCriterion("AGRICULTURAL is null");
            return (Criteria) this;
        }

        public Criteria andAgriculturalIsNotNull() {
            addCriterion("AGRICULTURAL is not null");
            return (Criteria) this;
        }

        public Criteria andAgriculturalEqualTo(String value) {
            addCriterion("AGRICULTURAL =", value, "agricultural");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNotEqualTo(String value) {
            addCriterion("AGRICULTURAL <>", value, "agricultural");
            return (Criteria) this;
        }

        public Criteria andAgriculturalGreaterThan(String value) {
            addCriterion("AGRICULTURAL >", value, "agricultural");
            return (Criteria) this;
        }

        public Criteria andAgriculturalGreaterThanOrEqualTo(String value) {
            addCriterion("AGRICULTURAL >=", value, "agricultural");
            return (Criteria) this;
        }

        public Criteria andAgriculturalLessThan(String value) {
            addCriterion("AGRICULTURAL <", value, "agricultural");
            return (Criteria) this;
        }

        public Criteria andAgriculturalLessThanOrEqualTo(String value) {
            addCriterion("AGRICULTURAL <=", value, "agricultural");
            return (Criteria) this;
        }

        public Criteria andAgriculturalLike(String value) {
            addCriterion("AGRICULTURAL like", value, "agricultural");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNotLike(String value) {
            addCriterion("AGRICULTURAL not like", value, "agricultural");
            return (Criteria) this;
        }

        public Criteria andAgriculturalIn(List<String> values) {
            addCriterion("AGRICULTURAL in", values, "agricultural");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNotIn(List<String> values) {
            addCriterion("AGRICULTURAL not in", values, "agricultural");
            return (Criteria) this;
        }

        public Criteria andAgriculturalBetween(String value1, String value2) {
            addCriterion("AGRICULTURAL between", value1, value2, "agricultural");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNotBetween(String value1, String value2) {
            addCriterion("AGRICULTURAL not between", value1, value2, "agricultural");
            return (Criteria) this;
        }

        public Criteria andFactoryIsNull() {
            addCriterion("FACTORY is null");
            return (Criteria) this;
        }

        public Criteria andFactoryIsNotNull() {
            addCriterion("FACTORY is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryEqualTo(String value) {
            addCriterion("FACTORY =", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotEqualTo(String value) {
            addCriterion("FACTORY <>", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryGreaterThan(String value) {
            addCriterion("FACTORY >", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryGreaterThanOrEqualTo(String value) {
            addCriterion("FACTORY >=", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLessThan(String value) {
            addCriterion("FACTORY <", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLessThanOrEqualTo(String value) {
            addCriterion("FACTORY <=", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLike(String value) {
            addCriterion("FACTORY like", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotLike(String value) {
            addCriterion("FACTORY not like", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryIn(List<String> values) {
            addCriterion("FACTORY in", values, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotIn(List<String> values) {
            addCriterion("FACTORY not in", values, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryBetween(String value1, String value2) {
            addCriterion("FACTORY between", value1, value2, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotBetween(String value1, String value2) {
            addCriterion("FACTORY not between", value1, value2, "factory");
            return (Criteria) this;
        }

        public Criteria andAquacultureIsNull() {
            addCriterion("AQUACULTURE is null");
            return (Criteria) this;
        }

        public Criteria andAquacultureIsNotNull() {
            addCriterion("AQUACULTURE is not null");
            return (Criteria) this;
        }

        public Criteria andAquacultureEqualTo(String value) {
            addCriterion("AQUACULTURE =", value, "aquaculture");
            return (Criteria) this;
        }

        public Criteria andAquacultureNotEqualTo(String value) {
            addCriterion("AQUACULTURE <>", value, "aquaculture");
            return (Criteria) this;
        }

        public Criteria andAquacultureGreaterThan(String value) {
            addCriterion("AQUACULTURE >", value, "aquaculture");
            return (Criteria) this;
        }

        public Criteria andAquacultureGreaterThanOrEqualTo(String value) {
            addCriterion("AQUACULTURE >=", value, "aquaculture");
            return (Criteria) this;
        }

        public Criteria andAquacultureLessThan(String value) {
            addCriterion("AQUACULTURE <", value, "aquaculture");
            return (Criteria) this;
        }

        public Criteria andAquacultureLessThanOrEqualTo(String value) {
            addCriterion("AQUACULTURE <=", value, "aquaculture");
            return (Criteria) this;
        }

        public Criteria andAquacultureLike(String value) {
            addCriterion("AQUACULTURE like", value, "aquaculture");
            return (Criteria) this;
        }

        public Criteria andAquacultureNotLike(String value) {
            addCriterion("AQUACULTURE not like", value, "aquaculture");
            return (Criteria) this;
        }

        public Criteria andAquacultureIn(List<String> values) {
            addCriterion("AQUACULTURE in", values, "aquaculture");
            return (Criteria) this;
        }

        public Criteria andAquacultureNotIn(List<String> values) {
            addCriterion("AQUACULTURE not in", values, "aquaculture");
            return (Criteria) this;
        }

        public Criteria andAquacultureBetween(String value1, String value2) {
            addCriterion("AQUACULTURE between", value1, value2, "aquaculture");
            return (Criteria) this;
        }

        public Criteria andAquacultureNotBetween(String value1, String value2) {
            addCriterion("AQUACULTURE not between", value1, value2, "aquaculture");
            return (Criteria) this;
        }

        public Criteria andManresourceIsNull() {
            addCriterion("MANRESOURCE is null");
            return (Criteria) this;
        }

        public Criteria andManresourceIsNotNull() {
            addCriterion("MANRESOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andManresourceEqualTo(String value) {
            addCriterion("MANRESOURCE =", value, "manresource");
            return (Criteria) this;
        }

        public Criteria andManresourceNotEqualTo(String value) {
            addCriterion("MANRESOURCE <>", value, "manresource");
            return (Criteria) this;
        }

        public Criteria andManresourceGreaterThan(String value) {
            addCriterion("MANRESOURCE >", value, "manresource");
            return (Criteria) this;
        }

        public Criteria andManresourceGreaterThanOrEqualTo(String value) {
            addCriterion("MANRESOURCE >=", value, "manresource");
            return (Criteria) this;
        }

        public Criteria andManresourceLessThan(String value) {
            addCriterion("MANRESOURCE <", value, "manresource");
            return (Criteria) this;
        }

        public Criteria andManresourceLessThanOrEqualTo(String value) {
            addCriterion("MANRESOURCE <=", value, "manresource");
            return (Criteria) this;
        }

        public Criteria andManresourceLike(String value) {
            addCriterion("MANRESOURCE like", value, "manresource");
            return (Criteria) this;
        }

        public Criteria andManresourceNotLike(String value) {
            addCriterion("MANRESOURCE not like", value, "manresource");
            return (Criteria) this;
        }

        public Criteria andManresourceIn(List<String> values) {
            addCriterion("MANRESOURCE in", values, "manresource");
            return (Criteria) this;
        }

        public Criteria andManresourceNotIn(List<String> values) {
            addCriterion("MANRESOURCE not in", values, "manresource");
            return (Criteria) this;
        }

        public Criteria andManresourceBetween(String value1, String value2) {
            addCriterion("MANRESOURCE between", value1, value2, "manresource");
            return (Criteria) this;
        }

        public Criteria andManresourceNotBetween(String value1, String value2) {
            addCriterion("MANRESOURCE not between", value1, value2, "manresource");
            return (Criteria) this;
        }

        public Criteria andEconomicIsNull() {
            addCriterion("ECONOMIC is null");
            return (Criteria) this;
        }

        public Criteria andEconomicIsNotNull() {
            addCriterion("ECONOMIC is not null");
            return (Criteria) this;
        }

        public Criteria andEconomicEqualTo(String value) {
            addCriterion("ECONOMIC =", value, "economic");
            return (Criteria) this;
        }

        public Criteria andEconomicNotEqualTo(String value) {
            addCriterion("ECONOMIC <>", value, "economic");
            return (Criteria) this;
        }

        public Criteria andEconomicGreaterThan(String value) {
            addCriterion("ECONOMIC >", value, "economic");
            return (Criteria) this;
        }

        public Criteria andEconomicGreaterThanOrEqualTo(String value) {
            addCriterion("ECONOMIC >=", value, "economic");
            return (Criteria) this;
        }

        public Criteria andEconomicLessThan(String value) {
            addCriterion("ECONOMIC <", value, "economic");
            return (Criteria) this;
        }

        public Criteria andEconomicLessThanOrEqualTo(String value) {
            addCriterion("ECONOMIC <=", value, "economic");
            return (Criteria) this;
        }

        public Criteria andEconomicLike(String value) {
            addCriterion("ECONOMIC like", value, "economic");
            return (Criteria) this;
        }

        public Criteria andEconomicNotLike(String value) {
            addCriterion("ECONOMIC not like", value, "economic");
            return (Criteria) this;
        }

        public Criteria andEconomicIn(List<String> values) {
            addCriterion("ECONOMIC in", values, "economic");
            return (Criteria) this;
        }

        public Criteria andEconomicNotIn(List<String> values) {
            addCriterion("ECONOMIC not in", values, "economic");
            return (Criteria) this;
        }

        public Criteria andEconomicBetween(String value1, String value2) {
            addCriterion("ECONOMIC between", value1, value2, "economic");
            return (Criteria) this;
        }

        public Criteria andEconomicNotBetween(String value1, String value2) {
            addCriterion("ECONOMIC not between", value1, value2, "economic");
            return (Criteria) this;
        }

        public Criteria andCulturologyIsNull() {
            addCriterion("CULTUROLOGY is null");
            return (Criteria) this;
        }

        public Criteria andCulturologyIsNotNull() {
            addCriterion("CULTUROLOGY is not null");
            return (Criteria) this;
        }

        public Criteria andCulturologyEqualTo(String value) {
            addCriterion("CULTUROLOGY =", value, "culturology");
            return (Criteria) this;
        }

        public Criteria andCulturologyNotEqualTo(String value) {
            addCriterion("CULTUROLOGY <>", value, "culturology");
            return (Criteria) this;
        }

        public Criteria andCulturologyGreaterThan(String value) {
            addCriterion("CULTUROLOGY >", value, "culturology");
            return (Criteria) this;
        }

        public Criteria andCulturologyGreaterThanOrEqualTo(String value) {
            addCriterion("CULTUROLOGY >=", value, "culturology");
            return (Criteria) this;
        }

        public Criteria andCulturologyLessThan(String value) {
            addCriterion("CULTUROLOGY <", value, "culturology");
            return (Criteria) this;
        }

        public Criteria andCulturologyLessThanOrEqualTo(String value) {
            addCriterion("CULTUROLOGY <=", value, "culturology");
            return (Criteria) this;
        }

        public Criteria andCulturologyLike(String value) {
            addCriterion("CULTUROLOGY like", value, "culturology");
            return (Criteria) this;
        }

        public Criteria andCulturologyNotLike(String value) {
            addCriterion("CULTUROLOGY not like", value, "culturology");
            return (Criteria) this;
        }

        public Criteria andCulturologyIn(List<String> values) {
            addCriterion("CULTUROLOGY in", values, "culturology");
            return (Criteria) this;
        }

        public Criteria andCulturologyNotIn(List<String> values) {
            addCriterion("CULTUROLOGY not in", values, "culturology");
            return (Criteria) this;
        }

        public Criteria andCulturologyBetween(String value1, String value2) {
            addCriterion("CULTUROLOGY between", value1, value2, "culturology");
            return (Criteria) this;
        }

        public Criteria andCulturologyNotBetween(String value1, String value2) {
            addCriterion("CULTUROLOGY not between", value1, value2, "culturology");
            return (Criteria) this;
        }

        public Criteria andCharitableIsNull() {
            addCriterion("CHARITABLE is null");
            return (Criteria) this;
        }

        public Criteria andCharitableIsNotNull() {
            addCriterion("CHARITABLE is not null");
            return (Criteria) this;
        }

        public Criteria andCharitableEqualTo(String value) {
            addCriterion("CHARITABLE =", value, "charitable");
            return (Criteria) this;
        }

        public Criteria andCharitableNotEqualTo(String value) {
            addCriterion("CHARITABLE <>", value, "charitable");
            return (Criteria) this;
        }

        public Criteria andCharitableGreaterThan(String value) {
            addCriterion("CHARITABLE >", value, "charitable");
            return (Criteria) this;
        }

        public Criteria andCharitableGreaterThanOrEqualTo(String value) {
            addCriterion("CHARITABLE >=", value, "charitable");
            return (Criteria) this;
        }

        public Criteria andCharitableLessThan(String value) {
            addCriterion("CHARITABLE <", value, "charitable");
            return (Criteria) this;
        }

        public Criteria andCharitableLessThanOrEqualTo(String value) {
            addCriterion("CHARITABLE <=", value, "charitable");
            return (Criteria) this;
        }

        public Criteria andCharitableLike(String value) {
            addCriterion("CHARITABLE like", value, "charitable");
            return (Criteria) this;
        }

        public Criteria andCharitableNotLike(String value) {
            addCriterion("CHARITABLE not like", value, "charitable");
            return (Criteria) this;
        }

        public Criteria andCharitableIn(List<String> values) {
            addCriterion("CHARITABLE in", values, "charitable");
            return (Criteria) this;
        }

        public Criteria andCharitableNotIn(List<String> values) {
            addCriterion("CHARITABLE not in", values, "charitable");
            return (Criteria) this;
        }

        public Criteria andCharitableBetween(String value1, String value2) {
            addCriterion("CHARITABLE between", value1, value2, "charitable");
            return (Criteria) this;
        }

        public Criteria andCharitableNotBetween(String value1, String value2) {
            addCriterion("CHARITABLE not between", value1, value2, "charitable");
            return (Criteria) this;
        }

        public Criteria andMedicareIsNull() {
            addCriterion("MEDICARE is null");
            return (Criteria) this;
        }

        public Criteria andMedicareIsNotNull() {
            addCriterion("MEDICARE is not null");
            return (Criteria) this;
        }

        public Criteria andMedicareEqualTo(String value) {
            addCriterion("MEDICARE =", value, "medicare");
            return (Criteria) this;
        }

        public Criteria andMedicareNotEqualTo(String value) {
            addCriterion("MEDICARE <>", value, "medicare");
            return (Criteria) this;
        }

        public Criteria andMedicareGreaterThan(String value) {
            addCriterion("MEDICARE >", value, "medicare");
            return (Criteria) this;
        }

        public Criteria andMedicareGreaterThanOrEqualTo(String value) {
            addCriterion("MEDICARE >=", value, "medicare");
            return (Criteria) this;
        }

        public Criteria andMedicareLessThan(String value) {
            addCriterion("MEDICARE <", value, "medicare");
            return (Criteria) this;
        }

        public Criteria andMedicareLessThanOrEqualTo(String value) {
            addCriterion("MEDICARE <=", value, "medicare");
            return (Criteria) this;
        }

        public Criteria andMedicareLike(String value) {
            addCriterion("MEDICARE like", value, "medicare");
            return (Criteria) this;
        }

        public Criteria andMedicareNotLike(String value) {
            addCriterion("MEDICARE not like", value, "medicare");
            return (Criteria) this;
        }

        public Criteria andMedicareIn(List<String> values) {
            addCriterion("MEDICARE in", values, "medicare");
            return (Criteria) this;
        }

        public Criteria andMedicareNotIn(List<String> values) {
            addCriterion("MEDICARE not in", values, "medicare");
            return (Criteria) this;
        }

        public Criteria andMedicareBetween(String value1, String value2) {
            addCriterion("MEDICARE between", value1, value2, "medicare");
            return (Criteria) this;
        }

        public Criteria andMedicareNotBetween(String value1, String value2) {
            addCriterion("MEDICARE not between", value1, value2, "medicare");
            return (Criteria) this;
        }

        public Criteria andMarketIsNull() {
            addCriterion("MARKET is null");
            return (Criteria) this;
        }

        public Criteria andMarketIsNotNull() {
            addCriterion("MARKET is not null");
            return (Criteria) this;
        }

        public Criteria andMarketEqualTo(String value) {
            addCriterion("MARKET =", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotEqualTo(String value) {
            addCriterion("MARKET <>", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketGreaterThan(String value) {
            addCriterion("MARKET >", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketGreaterThanOrEqualTo(String value) {
            addCriterion("MARKET >=", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketLessThan(String value) {
            addCriterion("MARKET <", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketLessThanOrEqualTo(String value) {
            addCriterion("MARKET <=", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketLike(String value) {
            addCriterion("MARKET like", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotLike(String value) {
            addCriterion("MARKET not like", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketIn(List<String> values) {
            addCriterion("MARKET in", values, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotIn(List<String> values) {
            addCriterion("MARKET not in", values, "market");
            return (Criteria) this;
        }

        public Criteria andMarketBetween(String value1, String value2) {
            addCriterion("MARKET between", value1, value2, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotBetween(String value1, String value2) {
            addCriterion("MARKET not between", value1, value2, "market");
            return (Criteria) this;
        }

        public Criteria andEnvironmentalIsNull() {
            addCriterion("ENVIRONMENTAL is null");
            return (Criteria) this;
        }

        public Criteria andEnvironmentalIsNotNull() {
            addCriterion("ENVIRONMENTAL is not null");
            return (Criteria) this;
        }

        public Criteria andEnvironmentalEqualTo(String value) {
            addCriterion("ENVIRONMENTAL =", value, "environmental");
            return (Criteria) this;
        }

        public Criteria andEnvironmentalNotEqualTo(String value) {
            addCriterion("ENVIRONMENTAL <>", value, "environmental");
            return (Criteria) this;
        }

        public Criteria andEnvironmentalGreaterThan(String value) {
            addCriterion("ENVIRONMENTAL >", value, "environmental");
            return (Criteria) this;
        }

        public Criteria andEnvironmentalGreaterThanOrEqualTo(String value) {
            addCriterion("ENVIRONMENTAL >=", value, "environmental");
            return (Criteria) this;
        }

        public Criteria andEnvironmentalLessThan(String value) {
            addCriterion("ENVIRONMENTAL <", value, "environmental");
            return (Criteria) this;
        }

        public Criteria andEnvironmentalLessThanOrEqualTo(String value) {
            addCriterion("ENVIRONMENTAL <=", value, "environmental");
            return (Criteria) this;
        }

        public Criteria andEnvironmentalLike(String value) {
            addCriterion("ENVIRONMENTAL like", value, "environmental");
            return (Criteria) this;
        }

        public Criteria andEnvironmentalNotLike(String value) {
            addCriterion("ENVIRONMENTAL not like", value, "environmental");
            return (Criteria) this;
        }

        public Criteria andEnvironmentalIn(List<String> values) {
            addCriterion("ENVIRONMENTAL in", values, "environmental");
            return (Criteria) this;
        }

        public Criteria andEnvironmentalNotIn(List<String> values) {
            addCriterion("ENVIRONMENTAL not in", values, "environmental");
            return (Criteria) this;
        }

        public Criteria andEnvironmentalBetween(String value1, String value2) {
            addCriterion("ENVIRONMENTAL between", value1, value2, "environmental");
            return (Criteria) this;
        }

        public Criteria andEnvironmentalNotBetween(String value1, String value2) {
            addCriterion("ENVIRONMENTAL not between", value1, value2, "environmental");
            return (Criteria) this;
        }

        public Criteria andBasicorganizationIsNull() {
            addCriterion("BASICORGANIZATION is null");
            return (Criteria) this;
        }

        public Criteria andBasicorganizationIsNotNull() {
            addCriterion("BASICORGANIZATION is not null");
            return (Criteria) this;
        }

        public Criteria andBasicorganizationEqualTo(String value) {
            addCriterion("BASICORGANIZATION =", value, "basicorganization");
            return (Criteria) this;
        }

        public Criteria andBasicorganizationNotEqualTo(String value) {
            addCriterion("BASICORGANIZATION <>", value, "basicorganization");
            return (Criteria) this;
        }

        public Criteria andBasicorganizationGreaterThan(String value) {
            addCriterion("BASICORGANIZATION >", value, "basicorganization");
            return (Criteria) this;
        }

        public Criteria andBasicorganizationGreaterThanOrEqualTo(String value) {
            addCriterion("BASICORGANIZATION >=", value, "basicorganization");
            return (Criteria) this;
        }

        public Criteria andBasicorganizationLessThan(String value) {
            addCriterion("BASICORGANIZATION <", value, "basicorganization");
            return (Criteria) this;
        }

        public Criteria andBasicorganizationLessThanOrEqualTo(String value) {
            addCriterion("BASICORGANIZATION <=", value, "basicorganization");
            return (Criteria) this;
        }

        public Criteria andBasicorganizationLike(String value) {
            addCriterion("BASICORGANIZATION like", value, "basicorganization");
            return (Criteria) this;
        }

        public Criteria andBasicorganizationNotLike(String value) {
            addCriterion("BASICORGANIZATION not like", value, "basicorganization");
            return (Criteria) this;
        }

        public Criteria andBasicorganizationIn(List<String> values) {
            addCriterion("BASICORGANIZATION in", values, "basicorganization");
            return (Criteria) this;
        }

        public Criteria andBasicorganizationNotIn(List<String> values) {
            addCriterion("BASICORGANIZATION not in", values, "basicorganization");
            return (Criteria) this;
        }

        public Criteria andBasicorganizationBetween(String value1, String value2) {
            addCriterion("BASICORGANIZATION between", value1, value2, "basicorganization");
            return (Criteria) this;
        }

        public Criteria andBasicorganizationNotBetween(String value1, String value2) {
            addCriterion("BASICORGANIZATION not between", value1, value2, "basicorganization");
            return (Criteria) this;
        }

        public Criteria andComplexIsNull() {
            addCriterion("COMPLEX is null");
            return (Criteria) this;
        }

        public Criteria andComplexIsNotNull() {
            addCriterion("COMPLEX is not null");
            return (Criteria) this;
        }

        public Criteria andComplexEqualTo(String value) {
            addCriterion("COMPLEX =", value, "complex");
            return (Criteria) this;
        }

        public Criteria andComplexNotEqualTo(String value) {
            addCriterion("COMPLEX <>", value, "complex");
            return (Criteria) this;
        }

        public Criteria andComplexGreaterThan(String value) {
            addCriterion("COMPLEX >", value, "complex");
            return (Criteria) this;
        }

        public Criteria andComplexGreaterThanOrEqualTo(String value) {
            addCriterion("COMPLEX >=", value, "complex");
            return (Criteria) this;
        }

        public Criteria andComplexLessThan(String value) {
            addCriterion("COMPLEX <", value, "complex");
            return (Criteria) this;
        }

        public Criteria andComplexLessThanOrEqualTo(String value) {
            addCriterion("COMPLEX <=", value, "complex");
            return (Criteria) this;
        }

        public Criteria andComplexLike(String value) {
            addCriterion("COMPLEX like", value, "complex");
            return (Criteria) this;
        }

        public Criteria andComplexNotLike(String value) {
            addCriterion("COMPLEX not like", value, "complex");
            return (Criteria) this;
        }

        public Criteria andComplexIn(List<String> values) {
            addCriterion("COMPLEX in", values, "complex");
            return (Criteria) this;
        }

        public Criteria andComplexNotIn(List<String> values) {
            addCriterion("COMPLEX not in", values, "complex");
            return (Criteria) this;
        }

        public Criteria andComplexBetween(String value1, String value2) {
            addCriterion("COMPLEX between", value1, value2, "complex");
            return (Criteria) this;
        }

        public Criteria andComplexNotBetween(String value1, String value2) {
            addCriterion("COMPLEX not between", value1, value2, "complex");
            return (Criteria) this;
        }

        public Criteria andServiceotherIsNull() {
            addCriterion("SERVICEOTHER is null");
            return (Criteria) this;
        }

        public Criteria andServiceotherIsNotNull() {
            addCriterion("SERVICEOTHER is not null");
            return (Criteria) this;
        }

        public Criteria andServiceotherEqualTo(String value) {
            addCriterion("SERVICEOTHER =", value, "serviceother");
            return (Criteria) this;
        }

        public Criteria andServiceotherNotEqualTo(String value) {
            addCriterion("SERVICEOTHER <>", value, "serviceother");
            return (Criteria) this;
        }

        public Criteria andServiceotherGreaterThan(String value) {
            addCriterion("SERVICEOTHER >", value, "serviceother");
            return (Criteria) this;
        }

        public Criteria andServiceotherGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICEOTHER >=", value, "serviceother");
            return (Criteria) this;
        }

        public Criteria andServiceotherLessThan(String value) {
            addCriterion("SERVICEOTHER <", value, "serviceother");
            return (Criteria) this;
        }

        public Criteria andServiceotherLessThanOrEqualTo(String value) {
            addCriterion("SERVICEOTHER <=", value, "serviceother");
            return (Criteria) this;
        }

        public Criteria andServiceotherLike(String value) {
            addCriterion("SERVICEOTHER like", value, "serviceother");
            return (Criteria) this;
        }

        public Criteria andServiceotherNotLike(String value) {
            addCriterion("SERVICEOTHER not like", value, "serviceother");
            return (Criteria) this;
        }

        public Criteria andServiceotherIn(List<String> values) {
            addCriterion("SERVICEOTHER in", values, "serviceother");
            return (Criteria) this;
        }

        public Criteria andServiceotherNotIn(List<String> values) {
            addCriterion("SERVICEOTHER not in", values, "serviceother");
            return (Criteria) this;
        }

        public Criteria andServiceotherBetween(String value1, String value2) {
            addCriterion("SERVICEOTHER between", value1, value2, "serviceother");
            return (Criteria) this;
        }

        public Criteria andServiceotherNotBetween(String value1, String value2) {
            addCriterion("SERVICEOTHER not between", value1, value2, "serviceother");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1IsNull() {
            addCriterion("TJNJJIEGUO1 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1IsNotNull() {
            addCriterion("TJNJJIEGUO1 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1EqualTo(String value) {
            addCriterion("TJNJJIEGUO1 =", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1NotEqualTo(String value) {
            addCriterion("TJNJJIEGUO1 <>", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1GreaterThan(String value) {
            addCriterion("TJNJJIEGUO1 >", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1GreaterThanOrEqualTo(String value) {
            addCriterion("TJNJJIEGUO1 >=", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1LessThan(String value) {
            addCriterion("TJNJJIEGUO1 <", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1LessThanOrEqualTo(String value) {
            addCriterion("TJNJJIEGUO1 <=", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1Like(String value) {
            addCriterion("TJNJJIEGUO1 like", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1NotLike(String value) {
            addCriterion("TJNJJIEGUO1 not like", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1In(List<String> values) {
            addCriterion("TJNJJIEGUO1 in", values, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1NotIn(List<String> values) {
            addCriterion("TJNJJIEGUO1 not in", values, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1Between(String value1, String value2) {
            addCriterion("TJNJJIEGUO1 between", value1, value2, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1NotBetween(String value1, String value2) {
            addCriterion("TJNJJIEGUO1 not between", value1, value2, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2IsNull() {
            addCriterion("TJNJJIEGUO2 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2IsNotNull() {
            addCriterion("TJNJJIEGUO2 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2EqualTo(String value) {
            addCriterion("TJNJJIEGUO2 =", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2NotEqualTo(String value) {
            addCriterion("TJNJJIEGUO2 <>", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2GreaterThan(String value) {
            addCriterion("TJNJJIEGUO2 >", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2GreaterThanOrEqualTo(String value) {
            addCriterion("TJNJJIEGUO2 >=", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2LessThan(String value) {
            addCriterion("TJNJJIEGUO2 <", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2LessThanOrEqualTo(String value) {
            addCriterion("TJNJJIEGUO2 <=", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2Like(String value) {
            addCriterion("TJNJJIEGUO2 like", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2NotLike(String value) {
            addCriterion("TJNJJIEGUO2 not like", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2In(List<String> values) {
            addCriterion("TJNJJIEGUO2 in", values, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2NotIn(List<String> values) {
            addCriterion("TJNJJIEGUO2 not in", values, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2Between(String value1, String value2) {
            addCriterion("TJNJJIEGUO2 between", value1, value2, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2NotBetween(String value1, String value2) {
            addCriterion("TJNJJIEGUO2 not between", value1, value2, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1IsNull() {
            addCriterion("TJNJYIJIAN1 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1IsNotNull() {
            addCriterion("TJNJYIJIAN1 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1EqualTo(String value) {
            addCriterion("TJNJYIJIAN1 =", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1NotEqualTo(String value) {
            addCriterion("TJNJYIJIAN1 <>", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1GreaterThan(String value) {
            addCriterion("TJNJYIJIAN1 >", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1GreaterThanOrEqualTo(String value) {
            addCriterion("TJNJYIJIAN1 >=", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1LessThan(String value) {
            addCriterion("TJNJYIJIAN1 <", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1LessThanOrEqualTo(String value) {
            addCriterion("TJNJYIJIAN1 <=", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1Like(String value) {
            addCriterion("TJNJYIJIAN1 like", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1NotLike(String value) {
            addCriterion("TJNJYIJIAN1 not like", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1In(List<String> values) {
            addCriterion("TJNJYIJIAN1 in", values, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1NotIn(List<String> values) {
            addCriterion("TJNJYIJIAN1 not in", values, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1Between(String value1, String value2) {
            addCriterion("TJNJYIJIAN1 between", value1, value2, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1NotBetween(String value1, String value2) {
            addCriterion("TJNJYIJIAN1 not between", value1, value2, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2IsNull() {
            addCriterion("TJNJYIJIAN2 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2IsNotNull() {
            addCriterion("TJNJYIJIAN2 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2EqualTo(String value) {
            addCriterion("TJNJYIJIAN2 =", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2NotEqualTo(String value) {
            addCriterion("TJNJYIJIAN2 <>", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2GreaterThan(String value) {
            addCriterion("TJNJYIJIAN2 >", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2GreaterThanOrEqualTo(String value) {
            addCriterion("TJNJYIJIAN2 >=", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2LessThan(String value) {
            addCriterion("TJNJYIJIAN2 <", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2LessThanOrEqualTo(String value) {
            addCriterion("TJNJYIJIAN2 <=", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2Like(String value) {
            addCriterion("TJNJYIJIAN2 like", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2NotLike(String value) {
            addCriterion("TJNJYIJIAN2 not like", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2In(List<String> values) {
            addCriterion("TJNJYIJIAN2 in", values, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2NotIn(List<String> values) {
            addCriterion("TJNJYIJIAN2 not in", values, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2Between(String value1, String value2) {
            addCriterion("TJNJYIJIAN2 between", value1, value2, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2NotBetween(String value1, String value2) {
            addCriterion("TJNJYIJIAN2 not between", value1, value2, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1IsNull() {
            addCriterion("TJNJXINGMING1 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1IsNotNull() {
            addCriterion("TJNJXINGMING1 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1EqualTo(String value) {
            addCriterion("TJNJXINGMING1 =", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1NotEqualTo(String value) {
            addCriterion("TJNJXINGMING1 <>", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1GreaterThan(String value) {
            addCriterion("TJNJXINGMING1 >", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1GreaterThanOrEqualTo(String value) {
            addCriterion("TJNJXINGMING1 >=", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1LessThan(String value) {
            addCriterion("TJNJXINGMING1 <", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1LessThanOrEqualTo(String value) {
            addCriterion("TJNJXINGMING1 <=", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1Like(String value) {
            addCriterion("TJNJXINGMING1 like", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1NotLike(String value) {
            addCriterion("TJNJXINGMING1 not like", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1In(List<String> values) {
            addCriterion("TJNJXINGMING1 in", values, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1NotIn(List<String> values) {
            addCriterion("TJNJXINGMING1 not in", values, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1Between(String value1, String value2) {
            addCriterion("TJNJXINGMING1 between", value1, value2, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1NotBetween(String value1, String value2) {
            addCriterion("TJNJXINGMING1 not between", value1, value2, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2IsNull() {
            addCriterion("TJNJXINGMING2 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2IsNotNull() {
            addCriterion("TJNJXINGMING2 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2EqualTo(String value) {
            addCriterion("TJNJXINGMING2 =", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2NotEqualTo(String value) {
            addCriterion("TJNJXINGMING2 <>", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2GreaterThan(String value) {
            addCriterion("TJNJXINGMING2 >", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2GreaterThanOrEqualTo(String value) {
            addCriterion("TJNJXINGMING2 >=", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2LessThan(String value) {
            addCriterion("TJNJXINGMING2 <", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2LessThanOrEqualTo(String value) {
            addCriterion("TJNJXINGMING2 <=", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2Like(String value) {
            addCriterion("TJNJXINGMING2 like", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2NotLike(String value) {
            addCriterion("TJNJXINGMING2 not like", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2In(List<String> values) {
            addCriterion("TJNJXINGMING2 in", values, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2NotIn(List<String> values) {
            addCriterion("TJNJXINGMING2 not in", values, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2Between(String value1, String value2) {
            addCriterion("TJNJXINGMING2 between", value1, value2, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2NotBetween(String value1, String value2) {
            addCriterion("TJNJXINGMING2 not between", value1, value2, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1IsNull() {
            addCriterion("TJNJSHIJIAN1 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1IsNotNull() {
            addCriterion("TJNJSHIJIAN1 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1EqualTo(Date value) {
            addCriterion("TJNJSHIJIAN1 =", value, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1NotEqualTo(Date value) {
            addCriterion("TJNJSHIJIAN1 <>", value, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1GreaterThan(Date value) {
            addCriterion("TJNJSHIJIAN1 >", value, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1GreaterThanOrEqualTo(Date value) {
            addCriterion("TJNJSHIJIAN1 >=", value, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1LessThan(Date value) {
            addCriterion("TJNJSHIJIAN1 <", value, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1LessThanOrEqualTo(Date value) {
            addCriterion("TJNJSHIJIAN1 <=", value, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1In(List<Date> values) {
            addCriterion("TJNJSHIJIAN1 in", values, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1NotIn(List<Date> values) {
            addCriterion("TJNJSHIJIAN1 not in", values, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1Between(Date value1, Date value2) {
            addCriterion("TJNJSHIJIAN1 between", value1, value2, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1NotBetween(Date value1, Date value2) {
            addCriterion("TJNJSHIJIAN1 not between", value1, value2, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2IsNull() {
            addCriterion("TJNJSHIJIAN2 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2IsNotNull() {
            addCriterion("TJNJSHIJIAN2 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2EqualTo(Date value) {
            addCriterion("TJNJSHIJIAN2 =", value, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2NotEqualTo(Date value) {
            addCriterion("TJNJSHIJIAN2 <>", value, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2GreaterThan(Date value) {
            addCriterion("TJNJSHIJIAN2 >", value, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2GreaterThanOrEqualTo(Date value) {
            addCriterion("TJNJSHIJIAN2 >=", value, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2LessThan(Date value) {
            addCriterion("TJNJSHIJIAN2 <", value, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2LessThanOrEqualTo(Date value) {
            addCriterion("TJNJSHIJIAN2 <=", value, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2In(List<Date> values) {
            addCriterion("TJNJSHIJIAN2 in", values, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2NotIn(List<Date> values) {
            addCriterion("TJNJSHIJIAN2 not in", values, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2Between(Date value1, Date value2) {
            addCriterion("TJNJSHIJIAN2 between", value1, value2, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2NotBetween(Date value1, Date value2) {
            addCriterion("TJNJSHIJIAN2 not between", value1, value2, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andDidian1IsNull() {
            addCriterion("DIDIAN1 is null");
            return (Criteria) this;
        }

        public Criteria andDidian1IsNotNull() {
            addCriterion("DIDIAN1 is not null");
            return (Criteria) this;
        }

        public Criteria andDidian1EqualTo(String value) {
            addCriterion("DIDIAN1 =", value, "didian1");
            return (Criteria) this;
        }

        public Criteria andDidian1NotEqualTo(String value) {
            addCriterion("DIDIAN1 <>", value, "didian1");
            return (Criteria) this;
        }

        public Criteria andDidian1GreaterThan(String value) {
            addCriterion("DIDIAN1 >", value, "didian1");
            return (Criteria) this;
        }

        public Criteria andDidian1GreaterThanOrEqualTo(String value) {
            addCriterion("DIDIAN1 >=", value, "didian1");
            return (Criteria) this;
        }

        public Criteria andDidian1LessThan(String value) {
            addCriterion("DIDIAN1 <", value, "didian1");
            return (Criteria) this;
        }

        public Criteria andDidian1LessThanOrEqualTo(String value) {
            addCriterion("DIDIAN1 <=", value, "didian1");
            return (Criteria) this;
        }

        public Criteria andDidian1Like(String value) {
            addCriterion("DIDIAN1 like", value, "didian1");
            return (Criteria) this;
        }

        public Criteria andDidian1NotLike(String value) {
            addCriterion("DIDIAN1 not like", value, "didian1");
            return (Criteria) this;
        }

        public Criteria andDidian1In(List<String> values) {
            addCriterion("DIDIAN1 in", values, "didian1");
            return (Criteria) this;
        }

        public Criteria andDidian1NotIn(List<String> values) {
            addCriterion("DIDIAN1 not in", values, "didian1");
            return (Criteria) this;
        }

        public Criteria andDidian1Between(String value1, String value2) {
            addCriterion("DIDIAN1 between", value1, value2, "didian1");
            return (Criteria) this;
        }

        public Criteria andDidian1NotBetween(String value1, String value2) {
            addCriterion("DIDIAN1 not between", value1, value2, "didian1");
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