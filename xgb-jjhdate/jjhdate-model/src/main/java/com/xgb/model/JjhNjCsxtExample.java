package com.xgb.model;

import java.util.ArrayList;
import java.util.List;

public class JjhNjCsxtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JjhNjCsxtExample() {
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

        public Criteria andWietuoIsNull() {
            addCriterion("WIETUO is null");
            return (Criteria) this;
        }

        public Criteria andWietuoIsNotNull() {
            addCriterion("WIETUO is not null");
            return (Criteria) this;
        }

        public Criteria andWietuoEqualTo(String value) {
            addCriterion("WIETUO =", value, "wietuo");
            return (Criteria) this;
        }

        public Criteria andWietuoNotEqualTo(String value) {
            addCriterion("WIETUO <>", value, "wietuo");
            return (Criteria) this;
        }

        public Criteria andWietuoGreaterThan(String value) {
            addCriterion("WIETUO >", value, "wietuo");
            return (Criteria) this;
        }

        public Criteria andWietuoGreaterThanOrEqualTo(String value) {
            addCriterion("WIETUO >=", value, "wietuo");
            return (Criteria) this;
        }

        public Criteria andWietuoLessThan(String value) {
            addCriterion("WIETUO <", value, "wietuo");
            return (Criteria) this;
        }

        public Criteria andWietuoLessThanOrEqualTo(String value) {
            addCriterion("WIETUO <=", value, "wietuo");
            return (Criteria) this;
        }

        public Criteria andWietuoLike(String value) {
            addCriterion("WIETUO like", value, "wietuo");
            return (Criteria) this;
        }

        public Criteria andWietuoNotLike(String value) {
            addCriterion("WIETUO not like", value, "wietuo");
            return (Criteria) this;
        }

        public Criteria andWietuoIn(List<String> values) {
            addCriterion("WIETUO in", values, "wietuo");
            return (Criteria) this;
        }

        public Criteria andWietuoNotIn(List<String> values) {
            addCriterion("WIETUO not in", values, "wietuo");
            return (Criteria) this;
        }

        public Criteria andWietuoBetween(String value1, String value2) {
            addCriterion("WIETUO between", value1, value2, "wietuo");
            return (Criteria) this;
        }

        public Criteria andWietuoNotBetween(String value1, String value2) {
            addCriterion("WIETUO not between", value1, value2, "wietuo");
            return (Criteria) this;
        }

        public Criteria andYongtuIsNull() {
            addCriterion("YONGTU is null");
            return (Criteria) this;
        }

        public Criteria andYongtuIsNotNull() {
            addCriterion("YONGTU is not null");
            return (Criteria) this;
        }

        public Criteria andYongtuEqualTo(String value) {
            addCriterion("YONGTU =", value, "yongtu");
            return (Criteria) this;
        }

        public Criteria andYongtuNotEqualTo(String value) {
            addCriterion("YONGTU <>", value, "yongtu");
            return (Criteria) this;
        }

        public Criteria andYongtuGreaterThan(String value) {
            addCriterion("YONGTU >", value, "yongtu");
            return (Criteria) this;
        }

        public Criteria andYongtuGreaterThanOrEqualTo(String value) {
            addCriterion("YONGTU >=", value, "yongtu");
            return (Criteria) this;
        }

        public Criteria andYongtuLessThan(String value) {
            addCriterion("YONGTU <", value, "yongtu");
            return (Criteria) this;
        }

        public Criteria andYongtuLessThanOrEqualTo(String value) {
            addCriterion("YONGTU <=", value, "yongtu");
            return (Criteria) this;
        }

        public Criteria andYongtuLike(String value) {
            addCriterion("YONGTU like", value, "yongtu");
            return (Criteria) this;
        }

        public Criteria andYongtuNotLike(String value) {
            addCriterion("YONGTU not like", value, "yongtu");
            return (Criteria) this;
        }

        public Criteria andYongtuIn(List<String> values) {
            addCriterion("YONGTU in", values, "yongtu");
            return (Criteria) this;
        }

        public Criteria andYongtuNotIn(List<String> values) {
            addCriterion("YONGTU not in", values, "yongtu");
            return (Criteria) this;
        }

        public Criteria andYongtuBetween(String value1, String value2) {
            addCriterion("YONGTU between", value1, value2, "yongtu");
            return (Criteria) this;
        }

        public Criteria andYongtuNotBetween(String value1, String value2) {
            addCriterion("YONGTU not between", value1, value2, "yongtu");
            return (Criteria) this;
        }

        public Criteria andGongtongshoutuofangIsNull() {
            addCriterion("GONGTONGSHOUTUOFANG is null");
            return (Criteria) this;
        }

        public Criteria andGongtongshoutuofangIsNotNull() {
            addCriterion("GONGTONGSHOUTUOFANG is not null");
            return (Criteria) this;
        }

        public Criteria andGongtongshoutuofangEqualTo(String value) {
            addCriterion("GONGTONGSHOUTUOFANG =", value, "gongtongshoutuofang");
            return (Criteria) this;
        }

        public Criteria andGongtongshoutuofangNotEqualTo(String value) {
            addCriterion("GONGTONGSHOUTUOFANG <>", value, "gongtongshoutuofang");
            return (Criteria) this;
        }

        public Criteria andGongtongshoutuofangGreaterThan(String value) {
            addCriterion("GONGTONGSHOUTUOFANG >", value, "gongtongshoutuofang");
            return (Criteria) this;
        }

        public Criteria andGongtongshoutuofangGreaterThanOrEqualTo(String value) {
            addCriterion("GONGTONGSHOUTUOFANG >=", value, "gongtongshoutuofang");
            return (Criteria) this;
        }

        public Criteria andGongtongshoutuofangLessThan(String value) {
            addCriterion("GONGTONGSHOUTUOFANG <", value, "gongtongshoutuofang");
            return (Criteria) this;
        }

        public Criteria andGongtongshoutuofangLessThanOrEqualTo(String value) {
            addCriterion("GONGTONGSHOUTUOFANG <=", value, "gongtongshoutuofang");
            return (Criteria) this;
        }

        public Criteria andGongtongshoutuofangLike(String value) {
            addCriterion("GONGTONGSHOUTUOFANG like", value, "gongtongshoutuofang");
            return (Criteria) this;
        }

        public Criteria andGongtongshoutuofangNotLike(String value) {
            addCriterion("GONGTONGSHOUTUOFANG not like", value, "gongtongshoutuofang");
            return (Criteria) this;
        }

        public Criteria andGongtongshoutuofangIn(List<String> values) {
            addCriterion("GONGTONGSHOUTUOFANG in", values, "gongtongshoutuofang");
            return (Criteria) this;
        }

        public Criteria andGongtongshoutuofangNotIn(List<String> values) {
            addCriterion("GONGTONGSHOUTUOFANG not in", values, "gongtongshoutuofang");
            return (Criteria) this;
        }

        public Criteria andGongtongshoutuofangBetween(String value1, String value2) {
            addCriterion("GONGTONGSHOUTUOFANG between", value1, value2, "gongtongshoutuofang");
            return (Criteria) this;
        }

        public Criteria andGongtongshoutuofangNotBetween(String value1, String value2) {
            addCriterion("GONGTONGSHOUTUOFANG not between", value1, value2, "gongtongshoutuofang");
            return (Criteria) this;
        }

        public Criteria andXintuotaiwuyueIsNull() {
            addCriterion("XINTUOTAIWUYUE is null");
            return (Criteria) this;
        }

        public Criteria andXintuotaiwuyueIsNotNull() {
            addCriterion("XINTUOTAIWUYUE is not null");
            return (Criteria) this;
        }

        public Criteria andXintuotaiwuyueEqualTo(Long value) {
            addCriterion("XINTUOTAIWUYUE =", value, "xintuotaiwuyue");
            return (Criteria) this;
        }

        public Criteria andXintuotaiwuyueNotEqualTo(Long value) {
            addCriterion("XINTUOTAIWUYUE <>", value, "xintuotaiwuyue");
            return (Criteria) this;
        }

        public Criteria andXintuotaiwuyueGreaterThan(Long value) {
            addCriterion("XINTUOTAIWUYUE >", value, "xintuotaiwuyue");
            return (Criteria) this;
        }

        public Criteria andXintuotaiwuyueGreaterThanOrEqualTo(Long value) {
            addCriterion("XINTUOTAIWUYUE >=", value, "xintuotaiwuyue");
            return (Criteria) this;
        }

        public Criteria andXintuotaiwuyueLessThan(Long value) {
            addCriterion("XINTUOTAIWUYUE <", value, "xintuotaiwuyue");
            return (Criteria) this;
        }

        public Criteria andXintuotaiwuyueLessThanOrEqualTo(Long value) {
            addCriterion("XINTUOTAIWUYUE <=", value, "xintuotaiwuyue");
            return (Criteria) this;
        }

        public Criteria andXintuotaiwuyueIn(List<Long> values) {
            addCriterion("XINTUOTAIWUYUE in", values, "xintuotaiwuyue");
            return (Criteria) this;
        }

        public Criteria andXintuotaiwuyueNotIn(List<Long> values) {
            addCriterion("XINTUOTAIWUYUE not in", values, "xintuotaiwuyue");
            return (Criteria) this;
        }

        public Criteria andXintuotaiwuyueBetween(Long value1, Long value2) {
            addCriterion("XINTUOTAIWUYUE between", value1, value2, "xintuotaiwuyue");
            return (Criteria) this;
        }

        public Criteria andXintuotaiwuyueNotBetween(Long value1, Long value2) {
            addCriterion("XINTUOTAIWUYUE not between", value1, value2, "xintuotaiwuyue");
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