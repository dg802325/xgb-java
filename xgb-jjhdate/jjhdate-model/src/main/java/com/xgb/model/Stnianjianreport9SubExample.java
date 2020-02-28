package com.xgb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Stnianjianreport9SubExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Stnianjianreport9SubExample() {
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

        public Criteria andZhanghuIsNull() {
            addCriterion("ZHANGHU is null");
            return (Criteria) this;
        }

        public Criteria andZhanghuIsNotNull() {
            addCriterion("ZHANGHU is not null");
            return (Criteria) this;
        }

        public Criteria andZhanghuEqualTo(String value) {
            addCriterion("ZHANGHU =", value, "zhanghu");
            return (Criteria) this;
        }

        public Criteria andZhanghuNotEqualTo(String value) {
            addCriterion("ZHANGHU <>", value, "zhanghu");
            return (Criteria) this;
        }

        public Criteria andZhanghuGreaterThan(String value) {
            addCriterion("ZHANGHU >", value, "zhanghu");
            return (Criteria) this;
        }

        public Criteria andZhanghuGreaterThanOrEqualTo(String value) {
            addCriterion("ZHANGHU >=", value, "zhanghu");
            return (Criteria) this;
        }

        public Criteria andZhanghuLessThan(String value) {
            addCriterion("ZHANGHU <", value, "zhanghu");
            return (Criteria) this;
        }

        public Criteria andZhanghuLessThanOrEqualTo(String value) {
            addCriterion("ZHANGHU <=", value, "zhanghu");
            return (Criteria) this;
        }

        public Criteria andZhanghuLike(String value) {
            addCriterion("ZHANGHU like", value, "zhanghu");
            return (Criteria) this;
        }

        public Criteria andZhanghuNotLike(String value) {
            addCriterion("ZHANGHU not like", value, "zhanghu");
            return (Criteria) this;
        }

        public Criteria andZhanghuIn(List<String> values) {
            addCriterion("ZHANGHU in", values, "zhanghu");
            return (Criteria) this;
        }

        public Criteria andZhanghuNotIn(List<String> values) {
            addCriterion("ZHANGHU not in", values, "zhanghu");
            return (Criteria) this;
        }

        public Criteria andZhanghuBetween(String value1, String value2) {
            addCriterion("ZHANGHU between", value1, value2, "zhanghu");
            return (Criteria) this;
        }

        public Criteria andZhanghuNotBetween(String value1, String value2) {
            addCriterion("ZHANGHU not between", value1, value2, "zhanghu");
            return (Criteria) this;
        }

        public Criteria andMingchengIsNull() {
            addCriterion("MINGCHENG is null");
            return (Criteria) this;
        }

        public Criteria andMingchengIsNotNull() {
            addCriterion("MINGCHENG is not null");
            return (Criteria) this;
        }

        public Criteria andMingchengEqualTo(String value) {
            addCriterion("MINGCHENG =", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengNotEqualTo(String value) {
            addCriterion("MINGCHENG <>", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengGreaterThan(String value) {
            addCriterion("MINGCHENG >", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengGreaterThanOrEqualTo(String value) {
            addCriterion("MINGCHENG >=", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengLessThan(String value) {
            addCriterion("MINGCHENG <", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengLessThanOrEqualTo(String value) {
            addCriterion("MINGCHENG <=", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengLike(String value) {
            addCriterion("MINGCHENG like", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengNotLike(String value) {
            addCriterion("MINGCHENG not like", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengIn(List<String> values) {
            addCriterion("MINGCHENG in", values, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengNotIn(List<String> values) {
            addCriterion("MINGCHENG not in", values, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengBetween(String value1, String value2) {
            addCriterion("MINGCHENG between", value1, value2, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengNotBetween(String value1, String value2) {
            addCriterion("MINGCHENG not between", value1, value2, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andFuzerenIsNull() {
            addCriterion("FUZEREN is null");
            return (Criteria) this;
        }

        public Criteria andFuzerenIsNotNull() {
            addCriterion("FUZEREN is not null");
            return (Criteria) this;
        }

        public Criteria andFuzerenEqualTo(String value) {
            addCriterion("FUZEREN =", value, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenNotEqualTo(String value) {
            addCriterion("FUZEREN <>", value, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenGreaterThan(String value) {
            addCriterion("FUZEREN >", value, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenGreaterThanOrEqualTo(String value) {
            addCriterion("FUZEREN >=", value, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenLessThan(String value) {
            addCriterion("FUZEREN <", value, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenLessThanOrEqualTo(String value) {
            addCriterion("FUZEREN <=", value, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenLike(String value) {
            addCriterion("FUZEREN like", value, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenNotLike(String value) {
            addCriterion("FUZEREN not like", value, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenIn(List<String> values) {
            addCriterion("FUZEREN in", values, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenNotIn(List<String> values) {
            addCriterion("FUZEREN not in", values, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenBetween(String value1, String value2) {
            addCriterion("FUZEREN between", value1, value2, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenNotBetween(String value1, String value2) {
            addCriterion("FUZEREN not between", value1, value2, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andDengjishijianIsNull() {
            addCriterion("DENGJISHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andDengjishijianIsNotNull() {
            addCriterion("DENGJISHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andDengjishijianEqualTo(Date value) {
            addCriterion("DENGJISHIJIAN =", value, "dengjishijian");
            return (Criteria) this;
        }

        public Criteria andDengjishijianNotEqualTo(Date value) {
            addCriterion("DENGJISHIJIAN <>", value, "dengjishijian");
            return (Criteria) this;
        }

        public Criteria andDengjishijianGreaterThan(Date value) {
            addCriterion("DENGJISHIJIAN >", value, "dengjishijian");
            return (Criteria) this;
        }

        public Criteria andDengjishijianGreaterThanOrEqualTo(Date value) {
            addCriterion("DENGJISHIJIAN >=", value, "dengjishijian");
            return (Criteria) this;
        }

        public Criteria andDengjishijianLessThan(Date value) {
            addCriterion("DENGJISHIJIAN <", value, "dengjishijian");
            return (Criteria) this;
        }

        public Criteria andDengjishijianLessThanOrEqualTo(Date value) {
            addCriterion("DENGJISHIJIAN <=", value, "dengjishijian");
            return (Criteria) this;
        }

        public Criteria andDengjishijianIn(List<Date> values) {
            addCriterion("DENGJISHIJIAN in", values, "dengjishijian");
            return (Criteria) this;
        }

        public Criteria andDengjishijianNotIn(List<Date> values) {
            addCriterion("DENGJISHIJIAN not in", values, "dengjishijian");
            return (Criteria) this;
        }

        public Criteria andDengjishijianBetween(Date value1, Date value2) {
            addCriterion("DENGJISHIJIAN between", value1, value2, "dengjishijian");
            return (Criteria) this;
        }

        public Criteria andDengjishijianNotBetween(Date value1, Date value2) {
            addCriterion("DENGJISHIJIAN not between", value1, value2, "dengjishijian");
            return (Criteria) this;
        }

        public Criteria andZhusuoIsNull() {
            addCriterion("ZHUSUO is null");
            return (Criteria) this;
        }

        public Criteria andZhusuoIsNotNull() {
            addCriterion("ZHUSUO is not null");
            return (Criteria) this;
        }

        public Criteria andZhusuoEqualTo(String value) {
            addCriterion("ZHUSUO =", value, "zhusuo");
            return (Criteria) this;
        }

        public Criteria andZhusuoNotEqualTo(String value) {
            addCriterion("ZHUSUO <>", value, "zhusuo");
            return (Criteria) this;
        }

        public Criteria andZhusuoGreaterThan(String value) {
            addCriterion("ZHUSUO >", value, "zhusuo");
            return (Criteria) this;
        }

        public Criteria andZhusuoGreaterThanOrEqualTo(String value) {
            addCriterion("ZHUSUO >=", value, "zhusuo");
            return (Criteria) this;
        }

        public Criteria andZhusuoLessThan(String value) {
            addCriterion("ZHUSUO <", value, "zhusuo");
            return (Criteria) this;
        }

        public Criteria andZhusuoLessThanOrEqualTo(String value) {
            addCriterion("ZHUSUO <=", value, "zhusuo");
            return (Criteria) this;
        }

        public Criteria andZhusuoLike(String value) {
            addCriterion("ZHUSUO like", value, "zhusuo");
            return (Criteria) this;
        }

        public Criteria andZhusuoNotLike(String value) {
            addCriterion("ZHUSUO not like", value, "zhusuo");
            return (Criteria) this;
        }

        public Criteria andZhusuoIn(List<String> values) {
            addCriterion("ZHUSUO in", values, "zhusuo");
            return (Criteria) this;
        }

        public Criteria andZhusuoNotIn(List<String> values) {
            addCriterion("ZHUSUO not in", values, "zhusuo");
            return (Criteria) this;
        }

        public Criteria andZhusuoBetween(String value1, String value2) {
            addCriterion("ZHUSUO between", value1, value2, "zhusuo");
            return (Criteria) this;
        }

        public Criteria andZhusuoNotBetween(String value1, String value2) {
            addCriterion("ZHUSUO not between", value1, value2, "zhusuo");
            return (Criteria) this;
        }

        public Criteria andDengjizhenghaoIsNull() {
            addCriterion("DENGJIZHENGHAO is null");
            return (Criteria) this;
        }

        public Criteria andDengjizhenghaoIsNotNull() {
            addCriterion("DENGJIZHENGHAO is not null");
            return (Criteria) this;
        }

        public Criteria andDengjizhenghaoEqualTo(String value) {
            addCriterion("DENGJIZHENGHAO =", value, "dengjizhenghao");
            return (Criteria) this;
        }

        public Criteria andDengjizhenghaoNotEqualTo(String value) {
            addCriterion("DENGJIZHENGHAO <>", value, "dengjizhenghao");
            return (Criteria) this;
        }

        public Criteria andDengjizhenghaoGreaterThan(String value) {
            addCriterion("DENGJIZHENGHAO >", value, "dengjizhenghao");
            return (Criteria) this;
        }

        public Criteria andDengjizhenghaoGreaterThanOrEqualTo(String value) {
            addCriterion("DENGJIZHENGHAO >=", value, "dengjizhenghao");
            return (Criteria) this;
        }

        public Criteria andDengjizhenghaoLessThan(String value) {
            addCriterion("DENGJIZHENGHAO <", value, "dengjizhenghao");
            return (Criteria) this;
        }

        public Criteria andDengjizhenghaoLessThanOrEqualTo(String value) {
            addCriterion("DENGJIZHENGHAO <=", value, "dengjizhenghao");
            return (Criteria) this;
        }

        public Criteria andDengjizhenghaoLike(String value) {
            addCriterion("DENGJIZHENGHAO like", value, "dengjizhenghao");
            return (Criteria) this;
        }

        public Criteria andDengjizhenghaoNotLike(String value) {
            addCriterion("DENGJIZHENGHAO not like", value, "dengjizhenghao");
            return (Criteria) this;
        }

        public Criteria andDengjizhenghaoIn(List<String> values) {
            addCriterion("DENGJIZHENGHAO in", values, "dengjizhenghao");
            return (Criteria) this;
        }

        public Criteria andDengjizhenghaoNotIn(List<String> values) {
            addCriterion("DENGJIZHENGHAO not in", values, "dengjizhenghao");
            return (Criteria) this;
        }

        public Criteria andDengjizhenghaoBetween(String value1, String value2) {
            addCriterion("DENGJIZHENGHAO between", value1, value2, "dengjizhenghao");
            return (Criteria) this;
        }

        public Criteria andDengjizhenghaoNotBetween(String value1, String value2) {
            addCriterion("DENGJIZHENGHAO not between", value1, value2, "dengjizhenghao");
            return (Criteria) this;
        }

        public Criteria andYinhangjizhanghaoIsNull() {
            addCriterion("YINHANGJIZHANGHAO is null");
            return (Criteria) this;
        }

        public Criteria andYinhangjizhanghaoIsNotNull() {
            addCriterion("YINHANGJIZHANGHAO is not null");
            return (Criteria) this;
        }

        public Criteria andYinhangjizhanghaoEqualTo(String value) {
            addCriterion("YINHANGJIZHANGHAO =", value, "yinhangjizhanghao");
            return (Criteria) this;
        }

        public Criteria andYinhangjizhanghaoNotEqualTo(String value) {
            addCriterion("YINHANGJIZHANGHAO <>", value, "yinhangjizhanghao");
            return (Criteria) this;
        }

        public Criteria andYinhangjizhanghaoGreaterThan(String value) {
            addCriterion("YINHANGJIZHANGHAO >", value, "yinhangjizhanghao");
            return (Criteria) this;
        }

        public Criteria andYinhangjizhanghaoGreaterThanOrEqualTo(String value) {
            addCriterion("YINHANGJIZHANGHAO >=", value, "yinhangjizhanghao");
            return (Criteria) this;
        }

        public Criteria andYinhangjizhanghaoLessThan(String value) {
            addCriterion("YINHANGJIZHANGHAO <", value, "yinhangjizhanghao");
            return (Criteria) this;
        }

        public Criteria andYinhangjizhanghaoLessThanOrEqualTo(String value) {
            addCriterion("YINHANGJIZHANGHAO <=", value, "yinhangjizhanghao");
            return (Criteria) this;
        }

        public Criteria andYinhangjizhanghaoLike(String value) {
            addCriterion("YINHANGJIZHANGHAO like", value, "yinhangjizhanghao");
            return (Criteria) this;
        }

        public Criteria andYinhangjizhanghaoNotLike(String value) {
            addCriterion("YINHANGJIZHANGHAO not like", value, "yinhangjizhanghao");
            return (Criteria) this;
        }

        public Criteria andYinhangjizhanghaoIn(List<String> values) {
            addCriterion("YINHANGJIZHANGHAO in", values, "yinhangjizhanghao");
            return (Criteria) this;
        }

        public Criteria andYinhangjizhanghaoNotIn(List<String> values) {
            addCriterion("YINHANGJIZHANGHAO not in", values, "yinhangjizhanghao");
            return (Criteria) this;
        }

        public Criteria andYinhangjizhanghaoBetween(String value1, String value2) {
            addCriterion("YINHANGJIZHANGHAO between", value1, value2, "yinhangjizhanghao");
            return (Criteria) this;
        }

        public Criteria andYinhangjizhanghaoNotBetween(String value1, String value2) {
            addCriterion("YINHANGJIZHANGHAO not between", value1, value2, "yinhangjizhanghao");
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