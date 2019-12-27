package com.xgb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StNjReport16Sub2Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StNjReport16Sub2Example() {
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

        public Criteria andHuiyididianIsNull() {
            addCriterion("HUIYIDIDIAN is null");
            return (Criteria) this;
        }

        public Criteria andHuiyididianIsNotNull() {
            addCriterion("HUIYIDIDIAN is not null");
            return (Criteria) this;
        }

        public Criteria andHuiyididianEqualTo(String value) {
            addCriterion("HUIYIDIDIAN =", value, "huiyididian");
            return (Criteria) this;
        }

        public Criteria andHuiyididianNotEqualTo(String value) {
            addCriterion("HUIYIDIDIAN <>", value, "huiyididian");
            return (Criteria) this;
        }

        public Criteria andHuiyididianGreaterThan(String value) {
            addCriterion("HUIYIDIDIAN >", value, "huiyididian");
            return (Criteria) this;
        }

        public Criteria andHuiyididianGreaterThanOrEqualTo(String value) {
            addCriterion("HUIYIDIDIAN >=", value, "huiyididian");
            return (Criteria) this;
        }

        public Criteria andHuiyididianLessThan(String value) {
            addCriterion("HUIYIDIDIAN <", value, "huiyididian");
            return (Criteria) this;
        }

        public Criteria andHuiyididianLessThanOrEqualTo(String value) {
            addCriterion("HUIYIDIDIAN <=", value, "huiyididian");
            return (Criteria) this;
        }

        public Criteria andHuiyididianLike(String value) {
            addCriterion("HUIYIDIDIAN like", value, "huiyididian");
            return (Criteria) this;
        }

        public Criteria andHuiyididianNotLike(String value) {
            addCriterion("HUIYIDIDIAN not like", value, "huiyididian");
            return (Criteria) this;
        }

        public Criteria andHuiyididianIn(List<String> values) {
            addCriterion("HUIYIDIDIAN in", values, "huiyididian");
            return (Criteria) this;
        }

        public Criteria andHuiyididianNotIn(List<String> values) {
            addCriterion("HUIYIDIDIAN not in", values, "huiyididian");
            return (Criteria) this;
        }

        public Criteria andHuiyididianBetween(String value1, String value2) {
            addCriterion("HUIYIDIDIAN between", value1, value2, "huiyididian");
            return (Criteria) this;
        }

        public Criteria andHuiyididianNotBetween(String value1, String value2) {
            addCriterion("HUIYIDIDIAN not between", value1, value2, "huiyididian");
            return (Criteria) this;
        }

        public Criteria andHuiyileixingIsNull() {
            addCriterion("HUIYILEIXING is null");
            return (Criteria) this;
        }

        public Criteria andHuiyileixingIsNotNull() {
            addCriterion("HUIYILEIXING is not null");
            return (Criteria) this;
        }

        public Criteria andHuiyileixingEqualTo(String value) {
            addCriterion("HUIYILEIXING =", value, "huiyileixing");
            return (Criteria) this;
        }

        public Criteria andHuiyileixingNotEqualTo(String value) {
            addCriterion("HUIYILEIXING <>", value, "huiyileixing");
            return (Criteria) this;
        }

        public Criteria andHuiyileixingGreaterThan(String value) {
            addCriterion("HUIYILEIXING >", value, "huiyileixing");
            return (Criteria) this;
        }

        public Criteria andHuiyileixingGreaterThanOrEqualTo(String value) {
            addCriterion("HUIYILEIXING >=", value, "huiyileixing");
            return (Criteria) this;
        }

        public Criteria andHuiyileixingLessThan(String value) {
            addCriterion("HUIYILEIXING <", value, "huiyileixing");
            return (Criteria) this;
        }

        public Criteria andHuiyileixingLessThanOrEqualTo(String value) {
            addCriterion("HUIYILEIXING <=", value, "huiyileixing");
            return (Criteria) this;
        }

        public Criteria andHuiyileixingLike(String value) {
            addCriterion("HUIYILEIXING like", value, "huiyileixing");
            return (Criteria) this;
        }

        public Criteria andHuiyileixingNotLike(String value) {
            addCriterion("HUIYILEIXING not like", value, "huiyileixing");
            return (Criteria) this;
        }

        public Criteria andHuiyileixingIn(List<String> values) {
            addCriterion("HUIYILEIXING in", values, "huiyileixing");
            return (Criteria) this;
        }

        public Criteria andHuiyileixingNotIn(List<String> values) {
            addCriterion("HUIYILEIXING not in", values, "huiyileixing");
            return (Criteria) this;
        }

        public Criteria andHuiyileixingBetween(String value1, String value2) {
            addCriterion("HUIYILEIXING between", value1, value2, "huiyileixing");
            return (Criteria) this;
        }

        public Criteria andHuiyileixingNotBetween(String value1, String value2) {
            addCriterion("HUIYILEIXING not between", value1, value2, "huiyileixing");
            return (Criteria) this;
        }

        public Criteria andHuiyimingchengIsNull() {
            addCriterion("HUIYIMINGCHENG is null");
            return (Criteria) this;
        }

        public Criteria andHuiyimingchengIsNotNull() {
            addCriterion("HUIYIMINGCHENG is not null");
            return (Criteria) this;
        }

        public Criteria andHuiyimingchengEqualTo(String value) {
            addCriterion("HUIYIMINGCHENG =", value, "huiyimingcheng");
            return (Criteria) this;
        }

        public Criteria andHuiyimingchengNotEqualTo(String value) {
            addCriterion("HUIYIMINGCHENG <>", value, "huiyimingcheng");
            return (Criteria) this;
        }

        public Criteria andHuiyimingchengGreaterThan(String value) {
            addCriterion("HUIYIMINGCHENG >", value, "huiyimingcheng");
            return (Criteria) this;
        }

        public Criteria andHuiyimingchengGreaterThanOrEqualTo(String value) {
            addCriterion("HUIYIMINGCHENG >=", value, "huiyimingcheng");
            return (Criteria) this;
        }

        public Criteria andHuiyimingchengLessThan(String value) {
            addCriterion("HUIYIMINGCHENG <", value, "huiyimingcheng");
            return (Criteria) this;
        }

        public Criteria andHuiyimingchengLessThanOrEqualTo(String value) {
            addCriterion("HUIYIMINGCHENG <=", value, "huiyimingcheng");
            return (Criteria) this;
        }

        public Criteria andHuiyimingchengLike(String value) {
            addCriterion("HUIYIMINGCHENG like", value, "huiyimingcheng");
            return (Criteria) this;
        }

        public Criteria andHuiyimingchengNotLike(String value) {
            addCriterion("HUIYIMINGCHENG not like", value, "huiyimingcheng");
            return (Criteria) this;
        }

        public Criteria andHuiyimingchengIn(List<String> values) {
            addCriterion("HUIYIMINGCHENG in", values, "huiyimingcheng");
            return (Criteria) this;
        }

        public Criteria andHuiyimingchengNotIn(List<String> values) {
            addCriterion("HUIYIMINGCHENG not in", values, "huiyimingcheng");
            return (Criteria) this;
        }

        public Criteria andHuiyimingchengBetween(String value1, String value2) {
            addCriterion("HUIYIMINGCHENG between", value1, value2, "huiyimingcheng");
            return (Criteria) this;
        }

        public Criteria andHuiyimingchengNotBetween(String value1, String value2) {
            addCriterion("HUIYIMINGCHENG not between", value1, value2, "huiyimingcheng");
            return (Criteria) this;
        }

        public Criteria andHuiyikaishishijianIsNull() {
            addCriterion("HUIYIKAISHISHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andHuiyikaishishijianIsNotNull() {
            addCriterion("HUIYIKAISHISHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andHuiyikaishishijianEqualTo(Date value) {
            addCriterion("HUIYIKAISHISHIJIAN =", value, "huiyikaishishijian");
            return (Criteria) this;
        }

        public Criteria andHuiyikaishishijianNotEqualTo(Date value) {
            addCriterion("HUIYIKAISHISHIJIAN <>", value, "huiyikaishishijian");
            return (Criteria) this;
        }

        public Criteria andHuiyikaishishijianGreaterThan(Date value) {
            addCriterion("HUIYIKAISHISHIJIAN >", value, "huiyikaishishijian");
            return (Criteria) this;
        }

        public Criteria andHuiyikaishishijianGreaterThanOrEqualTo(Date value) {
            addCriterion("HUIYIKAISHISHIJIAN >=", value, "huiyikaishishijian");
            return (Criteria) this;
        }

        public Criteria andHuiyikaishishijianLessThan(Date value) {
            addCriterion("HUIYIKAISHISHIJIAN <", value, "huiyikaishishijian");
            return (Criteria) this;
        }

        public Criteria andHuiyikaishishijianLessThanOrEqualTo(Date value) {
            addCriterion("HUIYIKAISHISHIJIAN <=", value, "huiyikaishishijian");
            return (Criteria) this;
        }

        public Criteria andHuiyikaishishijianIn(List<Date> values) {
            addCriterion("HUIYIKAISHISHIJIAN in", values, "huiyikaishishijian");
            return (Criteria) this;
        }

        public Criteria andHuiyikaishishijianNotIn(List<Date> values) {
            addCriterion("HUIYIKAISHISHIJIAN not in", values, "huiyikaishishijian");
            return (Criteria) this;
        }

        public Criteria andHuiyikaishishijianBetween(Date value1, Date value2) {
            addCriterion("HUIYIKAISHISHIJIAN between", value1, value2, "huiyikaishishijian");
            return (Criteria) this;
        }

        public Criteria andHuiyikaishishijianNotBetween(Date value1, Date value2) {
            addCriterion("HUIYIKAISHISHIJIAN not between", value1, value2, "huiyikaishishijian");
            return (Criteria) this;
        }

        public Criteria andZhubandanweimingchengIsNull() {
            addCriterion("ZHUBANDANWEIMINGCHENG is null");
            return (Criteria) this;
        }

        public Criteria andZhubandanweimingchengIsNotNull() {
            addCriterion("ZHUBANDANWEIMINGCHENG is not null");
            return (Criteria) this;
        }

        public Criteria andZhubandanweimingchengEqualTo(String value) {
            addCriterion("ZHUBANDANWEIMINGCHENG =", value, "zhubandanweimingcheng");
            return (Criteria) this;
        }

        public Criteria andZhubandanweimingchengNotEqualTo(String value) {
            addCriterion("ZHUBANDANWEIMINGCHENG <>", value, "zhubandanweimingcheng");
            return (Criteria) this;
        }

        public Criteria andZhubandanweimingchengGreaterThan(String value) {
            addCriterion("ZHUBANDANWEIMINGCHENG >", value, "zhubandanweimingcheng");
            return (Criteria) this;
        }

        public Criteria andZhubandanweimingchengGreaterThanOrEqualTo(String value) {
            addCriterion("ZHUBANDANWEIMINGCHENG >=", value, "zhubandanweimingcheng");
            return (Criteria) this;
        }

        public Criteria andZhubandanweimingchengLessThan(String value) {
            addCriterion("ZHUBANDANWEIMINGCHENG <", value, "zhubandanweimingcheng");
            return (Criteria) this;
        }

        public Criteria andZhubandanweimingchengLessThanOrEqualTo(String value) {
            addCriterion("ZHUBANDANWEIMINGCHENG <=", value, "zhubandanweimingcheng");
            return (Criteria) this;
        }

        public Criteria andZhubandanweimingchengLike(String value) {
            addCriterion("ZHUBANDANWEIMINGCHENG like", value, "zhubandanweimingcheng");
            return (Criteria) this;
        }

        public Criteria andZhubandanweimingchengNotLike(String value) {
            addCriterion("ZHUBANDANWEIMINGCHENG not like", value, "zhubandanweimingcheng");
            return (Criteria) this;
        }

        public Criteria andZhubandanweimingchengIn(List<String> values) {
            addCriterion("ZHUBANDANWEIMINGCHENG in", values, "zhubandanweimingcheng");
            return (Criteria) this;
        }

        public Criteria andZhubandanweimingchengNotIn(List<String> values) {
            addCriterion("ZHUBANDANWEIMINGCHENG not in", values, "zhubandanweimingcheng");
            return (Criteria) this;
        }

        public Criteria andZhubandanweimingchengBetween(String value1, String value2) {
            addCriterion("ZHUBANDANWEIMINGCHENG between", value1, value2, "zhubandanweimingcheng");
            return (Criteria) this;
        }

        public Criteria andZhubandanweimingchengNotBetween(String value1, String value2) {
            addCriterion("ZHUBANDANWEIMINGCHENG not between", value1, value2, "zhubandanweimingcheng");
            return (Criteria) this;
        }

        public Criteria andWofangjingfeilaiyuanIsNull() {
            addCriterion("WOFANGJINGFEILAIYUAN is null");
            return (Criteria) this;
        }

        public Criteria andWofangjingfeilaiyuanIsNotNull() {
            addCriterion("WOFANGJINGFEILAIYUAN is not null");
            return (Criteria) this;
        }

        public Criteria andWofangjingfeilaiyuanEqualTo(String value) {
            addCriterion("WOFANGJINGFEILAIYUAN =", value, "wofangjingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andWofangjingfeilaiyuanNotEqualTo(String value) {
            addCriterion("WOFANGJINGFEILAIYUAN <>", value, "wofangjingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andWofangjingfeilaiyuanGreaterThan(String value) {
            addCriterion("WOFANGJINGFEILAIYUAN >", value, "wofangjingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andWofangjingfeilaiyuanGreaterThanOrEqualTo(String value) {
            addCriterion("WOFANGJINGFEILAIYUAN >=", value, "wofangjingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andWofangjingfeilaiyuanLessThan(String value) {
            addCriterion("WOFANGJINGFEILAIYUAN <", value, "wofangjingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andWofangjingfeilaiyuanLessThanOrEqualTo(String value) {
            addCriterion("WOFANGJINGFEILAIYUAN <=", value, "wofangjingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andWofangjingfeilaiyuanLike(String value) {
            addCriterion("WOFANGJINGFEILAIYUAN like", value, "wofangjingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andWofangjingfeilaiyuanNotLike(String value) {
            addCriterion("WOFANGJINGFEILAIYUAN not like", value, "wofangjingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andWofangjingfeilaiyuanIn(List<String> values) {
            addCriterion("WOFANGJINGFEILAIYUAN in", values, "wofangjingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andWofangjingfeilaiyuanNotIn(List<String> values) {
            addCriterion("WOFANGJINGFEILAIYUAN not in", values, "wofangjingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andWofangjingfeilaiyuanBetween(String value1, String value2) {
            addCriterion("WOFANGJINGFEILAIYUAN between", value1, value2, "wofangjingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andWofangjingfeilaiyuanNotBetween(String value1, String value2) {
            addCriterion("WOFANGJINGFEILAIYUAN not between", value1, value2, "wofangjingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andWofangfayanzhutiIsNull() {
            addCriterion("WOFANGFAYANZHUTI is null");
            return (Criteria) this;
        }

        public Criteria andWofangfayanzhutiIsNotNull() {
            addCriterion("WOFANGFAYANZHUTI is not null");
            return (Criteria) this;
        }

        public Criteria andWofangfayanzhutiEqualTo(String value) {
            addCriterion("WOFANGFAYANZHUTI =", value, "wofangfayanzhuti");
            return (Criteria) this;
        }

        public Criteria andWofangfayanzhutiNotEqualTo(String value) {
            addCriterion("WOFANGFAYANZHUTI <>", value, "wofangfayanzhuti");
            return (Criteria) this;
        }

        public Criteria andWofangfayanzhutiGreaterThan(String value) {
            addCriterion("WOFANGFAYANZHUTI >", value, "wofangfayanzhuti");
            return (Criteria) this;
        }

        public Criteria andWofangfayanzhutiGreaterThanOrEqualTo(String value) {
            addCriterion("WOFANGFAYANZHUTI >=", value, "wofangfayanzhuti");
            return (Criteria) this;
        }

        public Criteria andWofangfayanzhutiLessThan(String value) {
            addCriterion("WOFANGFAYANZHUTI <", value, "wofangfayanzhuti");
            return (Criteria) this;
        }

        public Criteria andWofangfayanzhutiLessThanOrEqualTo(String value) {
            addCriterion("WOFANGFAYANZHUTI <=", value, "wofangfayanzhuti");
            return (Criteria) this;
        }

        public Criteria andWofangfayanzhutiLike(String value) {
            addCriterion("WOFANGFAYANZHUTI like", value, "wofangfayanzhuti");
            return (Criteria) this;
        }

        public Criteria andWofangfayanzhutiNotLike(String value) {
            addCriterion("WOFANGFAYANZHUTI not like", value, "wofangfayanzhuti");
            return (Criteria) this;
        }

        public Criteria andWofangfayanzhutiIn(List<String> values) {
            addCriterion("WOFANGFAYANZHUTI in", values, "wofangfayanzhuti");
            return (Criteria) this;
        }

        public Criteria andWofangfayanzhutiNotIn(List<String> values) {
            addCriterion("WOFANGFAYANZHUTI not in", values, "wofangfayanzhuti");
            return (Criteria) this;
        }

        public Criteria andWofangfayanzhutiBetween(String value1, String value2) {
            addCriterion("WOFANGFAYANZHUTI between", value1, value2, "wofangfayanzhuti");
            return (Criteria) this;
        }

        public Criteria andWofangfayanzhutiNotBetween(String value1, String value2) {
            addCriterion("WOFANGFAYANZHUTI not between", value1, value2, "wofangfayanzhuti");
            return (Criteria) this;
        }

        public Criteria andHuiyijieshushijianIsNull() {
            addCriterion("HUIYIJIESHUSHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andHuiyijieshushijianIsNotNull() {
            addCriterion("HUIYIJIESHUSHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andHuiyijieshushijianEqualTo(Date value) {
            addCriterion("HUIYIJIESHUSHIJIAN =", value, "huiyijieshushijian");
            return (Criteria) this;
        }

        public Criteria andHuiyijieshushijianNotEqualTo(Date value) {
            addCriterion("HUIYIJIESHUSHIJIAN <>", value, "huiyijieshushijian");
            return (Criteria) this;
        }

        public Criteria andHuiyijieshushijianGreaterThan(Date value) {
            addCriterion("HUIYIJIESHUSHIJIAN >", value, "huiyijieshushijian");
            return (Criteria) this;
        }

        public Criteria andHuiyijieshushijianGreaterThanOrEqualTo(Date value) {
            addCriterion("HUIYIJIESHUSHIJIAN >=", value, "huiyijieshushijian");
            return (Criteria) this;
        }

        public Criteria andHuiyijieshushijianLessThan(Date value) {
            addCriterion("HUIYIJIESHUSHIJIAN <", value, "huiyijieshushijian");
            return (Criteria) this;
        }

        public Criteria andHuiyijieshushijianLessThanOrEqualTo(Date value) {
            addCriterion("HUIYIJIESHUSHIJIAN <=", value, "huiyijieshushijian");
            return (Criteria) this;
        }

        public Criteria andHuiyijieshushijianIn(List<Date> values) {
            addCriterion("HUIYIJIESHUSHIJIAN in", values, "huiyijieshushijian");
            return (Criteria) this;
        }

        public Criteria andHuiyijieshushijianNotIn(List<Date> values) {
            addCriterion("HUIYIJIESHUSHIJIAN not in", values, "huiyijieshushijian");
            return (Criteria) this;
        }

        public Criteria andHuiyijieshushijianBetween(Date value1, Date value2) {
            addCriterion("HUIYIJIESHUSHIJIAN between", value1, value2, "huiyijieshushijian");
            return (Criteria) this;
        }

        public Criteria andHuiyijieshushijianNotBetween(Date value1, Date value2) {
            addCriterion("HUIYIJIESHUSHIJIAN not between", value1, value2, "huiyijieshushijian");
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