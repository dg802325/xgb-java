package com.xgb.model;

import java.util.ArrayList;
import java.util.List;

public class StDjqk4Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StDjqk4Example() {
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

        public Criteria andDanweimingchengIsNull() {
            addCriterion("DANWEIMINGCHENG is null");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengIsNotNull() {
            addCriterion("DANWEIMINGCHENG is not null");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengEqualTo(String value) {
            addCriterion("DANWEIMINGCHENG =", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengNotEqualTo(String value) {
            addCriterion("DANWEIMINGCHENG <>", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengGreaterThan(String value) {
            addCriterion("DANWEIMINGCHENG >", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengGreaterThanOrEqualTo(String value) {
            addCriterion("DANWEIMINGCHENG >=", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengLessThan(String value) {
            addCriterion("DANWEIMINGCHENG <", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengLessThanOrEqualTo(String value) {
            addCriterion("DANWEIMINGCHENG <=", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengLike(String value) {
            addCriterion("DANWEIMINGCHENG like", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengNotLike(String value) {
            addCriterion("DANWEIMINGCHENG not like", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengIn(List<String> values) {
            addCriterion("DANWEIMINGCHENG in", values, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengNotIn(List<String> values) {
            addCriterion("DANWEIMINGCHENG not in", values, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengBetween(String value1, String value2) {
            addCriterion("DANWEIMINGCHENG between", value1, value2, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengNotBetween(String value1, String value2) {
            addCriterion("DANWEIMINGCHENG not between", value1, value2, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDengjihaoIsNull() {
            addCriterion("DENGJIHAO is null");
            return (Criteria) this;
        }

        public Criteria andDengjihaoIsNotNull() {
            addCriterion("DENGJIHAO is not null");
            return (Criteria) this;
        }

        public Criteria andDengjihaoEqualTo(String value) {
            addCriterion("DENGJIHAO =", value, "dengjihao");
            return (Criteria) this;
        }

        public Criteria andDengjihaoNotEqualTo(String value) {
            addCriterion("DENGJIHAO <>", value, "dengjihao");
            return (Criteria) this;
        }

        public Criteria andDengjihaoGreaterThan(String value) {
            addCriterion("DENGJIHAO >", value, "dengjihao");
            return (Criteria) this;
        }

        public Criteria andDengjihaoGreaterThanOrEqualTo(String value) {
            addCriterion("DENGJIHAO >=", value, "dengjihao");
            return (Criteria) this;
        }

        public Criteria andDengjihaoLessThan(String value) {
            addCriterion("DENGJIHAO <", value, "dengjihao");
            return (Criteria) this;
        }

        public Criteria andDengjihaoLessThanOrEqualTo(String value) {
            addCriterion("DENGJIHAO <=", value, "dengjihao");
            return (Criteria) this;
        }

        public Criteria andDengjihaoLike(String value) {
            addCriterion("DENGJIHAO like", value, "dengjihao");
            return (Criteria) this;
        }

        public Criteria andDengjihaoNotLike(String value) {
            addCriterion("DENGJIHAO not like", value, "dengjihao");
            return (Criteria) this;
        }

        public Criteria andDengjihaoIn(List<String> values) {
            addCriterion("DENGJIHAO in", values, "dengjihao");
            return (Criteria) this;
        }

        public Criteria andDengjihaoNotIn(List<String> values) {
            addCriterion("DENGJIHAO not in", values, "dengjihao");
            return (Criteria) this;
        }

        public Criteria andDengjihaoBetween(String value1, String value2) {
            addCriterion("DENGJIHAO between", value1, value2, "dengjihao");
            return (Criteria) this;
        }

        public Criteria andDengjihaoNotBetween(String value1, String value2) {
            addCriterion("DENGJIHAO not between", value1, value2, "dengjihao");
            return (Criteria) this;
        }

        public Criteria andDengjijiguanIsNull() {
            addCriterion("DENGJIJIGUAN is null");
            return (Criteria) this;
        }

        public Criteria andDengjijiguanIsNotNull() {
            addCriterion("DENGJIJIGUAN is not null");
            return (Criteria) this;
        }

        public Criteria andDengjijiguanEqualTo(String value) {
            addCriterion("DENGJIJIGUAN =", value, "dengjijiguan");
            return (Criteria) this;
        }

        public Criteria andDengjijiguanNotEqualTo(String value) {
            addCriterion("DENGJIJIGUAN <>", value, "dengjijiguan");
            return (Criteria) this;
        }

        public Criteria andDengjijiguanGreaterThan(String value) {
            addCriterion("DENGJIJIGUAN >", value, "dengjijiguan");
            return (Criteria) this;
        }

        public Criteria andDengjijiguanGreaterThanOrEqualTo(String value) {
            addCriterion("DENGJIJIGUAN >=", value, "dengjijiguan");
            return (Criteria) this;
        }

        public Criteria andDengjijiguanLessThan(String value) {
            addCriterion("DENGJIJIGUAN <", value, "dengjijiguan");
            return (Criteria) this;
        }

        public Criteria andDengjijiguanLessThanOrEqualTo(String value) {
            addCriterion("DENGJIJIGUAN <=", value, "dengjijiguan");
            return (Criteria) this;
        }

        public Criteria andDengjijiguanLike(String value) {
            addCriterion("DENGJIJIGUAN like", value, "dengjijiguan");
            return (Criteria) this;
        }

        public Criteria andDengjijiguanNotLike(String value) {
            addCriterion("DENGJIJIGUAN not like", value, "dengjijiguan");
            return (Criteria) this;
        }

        public Criteria andDengjijiguanIn(List<String> values) {
            addCriterion("DENGJIJIGUAN in", values, "dengjijiguan");
            return (Criteria) this;
        }

        public Criteria andDengjijiguanNotIn(List<String> values) {
            addCriterion("DENGJIJIGUAN not in", values, "dengjijiguan");
            return (Criteria) this;
        }

        public Criteria andDengjijiguanBetween(String value1, String value2) {
            addCriterion("DENGJIJIGUAN between", value1, value2, "dengjijiguan");
            return (Criteria) this;
        }

        public Criteria andDengjijiguanNotBetween(String value1, String value2) {
            addCriterion("DENGJIJIGUAN not between", value1, value2, "dengjijiguan");
            return (Criteria) this;
        }

        public Criteria andDangyuanzongshuIsNull() {
            addCriterion("DANGYUANZONGSHU is null");
            return (Criteria) this;
        }

        public Criteria andDangyuanzongshuIsNotNull() {
            addCriterion("DANGYUANZONGSHU is not null");
            return (Criteria) this;
        }

        public Criteria andDangyuanzongshuEqualTo(Integer value) {
            addCriterion("DANGYUANZONGSHU =", value, "dangyuanzongshu");
            return (Criteria) this;
        }

        public Criteria andDangyuanzongshuNotEqualTo(Integer value) {
            addCriterion("DANGYUANZONGSHU <>", value, "dangyuanzongshu");
            return (Criteria) this;
        }

        public Criteria andDangyuanzongshuGreaterThan(Integer value) {
            addCriterion("DANGYUANZONGSHU >", value, "dangyuanzongshu");
            return (Criteria) this;
        }

        public Criteria andDangyuanzongshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("DANGYUANZONGSHU >=", value, "dangyuanzongshu");
            return (Criteria) this;
        }

        public Criteria andDangyuanzongshuLessThan(Integer value) {
            addCriterion("DANGYUANZONGSHU <", value, "dangyuanzongshu");
            return (Criteria) this;
        }

        public Criteria andDangyuanzongshuLessThanOrEqualTo(Integer value) {
            addCriterion("DANGYUANZONGSHU <=", value, "dangyuanzongshu");
            return (Criteria) this;
        }

        public Criteria andDangyuanzongshuIn(List<Integer> values) {
            addCriterion("DANGYUANZONGSHU in", values, "dangyuanzongshu");
            return (Criteria) this;
        }

        public Criteria andDangyuanzongshuNotIn(List<Integer> values) {
            addCriterion("DANGYUANZONGSHU not in", values, "dangyuanzongshu");
            return (Criteria) this;
        }

        public Criteria andDangyuanzongshuBetween(Integer value1, Integer value2) {
            addCriterion("DANGYUANZONGSHU between", value1, value2, "dangyuanzongshu");
            return (Criteria) this;
        }

        public Criteria andDangyuanzongshuNotBetween(Integer value1, Integer value2) {
            addCriterion("DANGYUANZONGSHU not between", value1, value2, "dangyuanzongshu");
            return (Criteria) this;
        }

        public Criteria andZhuandangshuIsNull() {
            addCriterion("ZHUANDANGSHU is null");
            return (Criteria) this;
        }

        public Criteria andZhuandangshuIsNotNull() {
            addCriterion("ZHUANDANGSHU is not null");
            return (Criteria) this;
        }

        public Criteria andZhuandangshuEqualTo(Integer value) {
            addCriterion("ZHUANDANGSHU =", value, "zhuandangshu");
            return (Criteria) this;
        }

        public Criteria andZhuandangshuNotEqualTo(Integer value) {
            addCriterion("ZHUANDANGSHU <>", value, "zhuandangshu");
            return (Criteria) this;
        }

        public Criteria andZhuandangshuGreaterThan(Integer value) {
            addCriterion("ZHUANDANGSHU >", value, "zhuandangshu");
            return (Criteria) this;
        }

        public Criteria andZhuandangshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZHUANDANGSHU >=", value, "zhuandangshu");
            return (Criteria) this;
        }

        public Criteria andZhuandangshuLessThan(Integer value) {
            addCriterion("ZHUANDANGSHU <", value, "zhuandangshu");
            return (Criteria) this;
        }

        public Criteria andZhuandangshuLessThanOrEqualTo(Integer value) {
            addCriterion("ZHUANDANGSHU <=", value, "zhuandangshu");
            return (Criteria) this;
        }

        public Criteria andZhuandangshuIn(List<Integer> values) {
            addCriterion("ZHUANDANGSHU in", values, "zhuandangshu");
            return (Criteria) this;
        }

        public Criteria andZhuandangshuNotIn(List<Integer> values) {
            addCriterion("ZHUANDANGSHU not in", values, "zhuandangshu");
            return (Criteria) this;
        }

        public Criteria andZhuandangshuBetween(Integer value1, Integer value2) {
            addCriterion("ZHUANDANGSHU between", value1, value2, "zhuandangshu");
            return (Criteria) this;
        }

        public Criteria andZhuandangshuNotBetween(Integer value1, Integer value2) {
            addCriterion("ZHUANDANGSHU not between", value1, value2, "zhuandangshu");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuIsNull() {
            addCriterion("FUZERENSHU is null");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuIsNotNull() {
            addCriterion("FUZERENSHU is not null");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuEqualTo(Integer value) {
            addCriterion("FUZERENSHU =", value, "fuzerenshu");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuNotEqualTo(Integer value) {
            addCriterion("FUZERENSHU <>", value, "fuzerenshu");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuGreaterThan(Integer value) {
            addCriterion("FUZERENSHU >", value, "fuzerenshu");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("FUZERENSHU >=", value, "fuzerenshu");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuLessThan(Integer value) {
            addCriterion("FUZERENSHU <", value, "fuzerenshu");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuLessThanOrEqualTo(Integer value) {
            addCriterion("FUZERENSHU <=", value, "fuzerenshu");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuIn(List<Integer> values) {
            addCriterion("FUZERENSHU in", values, "fuzerenshu");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuNotIn(List<Integer> values) {
            addCriterion("FUZERENSHU not in", values, "fuzerenshu");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuBetween(Integer value1, Integer value2) {
            addCriterion("FUZERENSHU between", value1, value2, "fuzerenshu");
            return (Criteria) this;
        }

        public Criteria andFuzerenshuNotBetween(Integer value1, Integer value2) {
            addCriterion("FUZERENSHU not between", value1, value2, "fuzerenshu");
            return (Criteria) this;
        }

        public Criteria andJiandangshuIsNull() {
            addCriterion("JIANDANGSHU is null");
            return (Criteria) this;
        }

        public Criteria andJiandangshuIsNotNull() {
            addCriterion("JIANDANGSHU is not null");
            return (Criteria) this;
        }

        public Criteria andJiandangshuEqualTo(Integer value) {
            addCriterion("JIANDANGSHU =", value, "jiandangshu");
            return (Criteria) this;
        }

        public Criteria andJiandangshuNotEqualTo(Integer value) {
            addCriterion("JIANDANGSHU <>", value, "jiandangshu");
            return (Criteria) this;
        }

        public Criteria andJiandangshuGreaterThan(Integer value) {
            addCriterion("JIANDANGSHU >", value, "jiandangshu");
            return (Criteria) this;
        }

        public Criteria andJiandangshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("JIANDANGSHU >=", value, "jiandangshu");
            return (Criteria) this;
        }

        public Criteria andJiandangshuLessThan(Integer value) {
            addCriterion("JIANDANGSHU <", value, "jiandangshu");
            return (Criteria) this;
        }

        public Criteria andJiandangshuLessThanOrEqualTo(Integer value) {
            addCriterion("JIANDANGSHU <=", value, "jiandangshu");
            return (Criteria) this;
        }

        public Criteria andJiandangshuIn(List<Integer> values) {
            addCriterion("JIANDANGSHU in", values, "jiandangshu");
            return (Criteria) this;
        }

        public Criteria andJiandangshuNotIn(List<Integer> values) {
            addCriterion("JIANDANGSHU not in", values, "jiandangshu");
            return (Criteria) this;
        }

        public Criteria andJiandangshuBetween(Integer value1, Integer value2) {
            addCriterion("JIANDANGSHU between", value1, value2, "jiandangshu");
            return (Criteria) this;
        }

        public Criteria andJiandangshuNotBetween(Integer value1, Integer value2) {
            addCriterion("JIANDANGSHU not between", value1, value2, "jiandangshu");
            return (Criteria) this;
        }

        public Criteria andDangnianshuIsNull() {
            addCriterion("DANGNIANSHU is null");
            return (Criteria) this;
        }

        public Criteria andDangnianshuIsNotNull() {
            addCriterion("DANGNIANSHU is not null");
            return (Criteria) this;
        }

        public Criteria andDangnianshuEqualTo(Integer value) {
            addCriterion("DANGNIANSHU =", value, "dangnianshu");
            return (Criteria) this;
        }

        public Criteria andDangnianshuNotEqualTo(Integer value) {
            addCriterion("DANGNIANSHU <>", value, "dangnianshu");
            return (Criteria) this;
        }

        public Criteria andDangnianshuGreaterThan(Integer value) {
            addCriterion("DANGNIANSHU >", value, "dangnianshu");
            return (Criteria) this;
        }

        public Criteria andDangnianshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("DANGNIANSHU >=", value, "dangnianshu");
            return (Criteria) this;
        }

        public Criteria andDangnianshuLessThan(Integer value) {
            addCriterion("DANGNIANSHU <", value, "dangnianshu");
            return (Criteria) this;
        }

        public Criteria andDangnianshuLessThanOrEqualTo(Integer value) {
            addCriterion("DANGNIANSHU <=", value, "dangnianshu");
            return (Criteria) this;
        }

        public Criteria andDangnianshuIn(List<Integer> values) {
            addCriterion("DANGNIANSHU in", values, "dangnianshu");
            return (Criteria) this;
        }

        public Criteria andDangnianshuNotIn(List<Integer> values) {
            addCriterion("DANGNIANSHU not in", values, "dangnianshu");
            return (Criteria) this;
        }

        public Criteria andDangnianshuBetween(Integer value1, Integer value2) {
            addCriterion("DANGNIANSHU between", value1, value2, "dangnianshu");
            return (Criteria) this;
        }

        public Criteria andDangnianshuNotBetween(Integer value1, Integer value2) {
            addCriterion("DANGNIANSHU not between", value1, value2, "dangnianshu");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu1IsNull() {
            addCriterion("RENYUANSHU1 is null");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu1IsNotNull() {
            addCriterion("RENYUANSHU1 is not null");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu1EqualTo(Integer value) {
            addCriterion("RENYUANSHU1 =", value, "renyuanshu1");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu1NotEqualTo(Integer value) {
            addCriterion("RENYUANSHU1 <>", value, "renyuanshu1");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu1GreaterThan(Integer value) {
            addCriterion("RENYUANSHU1 >", value, "renyuanshu1");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu1GreaterThanOrEqualTo(Integer value) {
            addCriterion("RENYUANSHU1 >=", value, "renyuanshu1");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu1LessThan(Integer value) {
            addCriterion("RENYUANSHU1 <", value, "renyuanshu1");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu1LessThanOrEqualTo(Integer value) {
            addCriterion("RENYUANSHU1 <=", value, "renyuanshu1");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu1In(List<Integer> values) {
            addCriterion("RENYUANSHU1 in", values, "renyuanshu1");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu1NotIn(List<Integer> values) {
            addCriterion("RENYUANSHU1 not in", values, "renyuanshu1");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu1Between(Integer value1, Integer value2) {
            addCriterion("RENYUANSHU1 between", value1, value2, "renyuanshu1");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu1NotBetween(Integer value1, Integer value2) {
            addCriterion("RENYUANSHU1 not between", value1, value2, "renyuanshu1");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu2IsNull() {
            addCriterion("RENYUANSHU2 is null");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu2IsNotNull() {
            addCriterion("RENYUANSHU2 is not null");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu2EqualTo(Integer value) {
            addCriterion("RENYUANSHU2 =", value, "renyuanshu2");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu2NotEqualTo(Integer value) {
            addCriterion("RENYUANSHU2 <>", value, "renyuanshu2");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu2GreaterThan(Integer value) {
            addCriterion("RENYUANSHU2 >", value, "renyuanshu2");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu2GreaterThanOrEqualTo(Integer value) {
            addCriterion("RENYUANSHU2 >=", value, "renyuanshu2");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu2LessThan(Integer value) {
            addCriterion("RENYUANSHU2 <", value, "renyuanshu2");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu2LessThanOrEqualTo(Integer value) {
            addCriterion("RENYUANSHU2 <=", value, "renyuanshu2");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu2In(List<Integer> values) {
            addCriterion("RENYUANSHU2 in", values, "renyuanshu2");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu2NotIn(List<Integer> values) {
            addCriterion("RENYUANSHU2 not in", values, "renyuanshu2");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu2Between(Integer value1, Integer value2) {
            addCriterion("RENYUANSHU2 between", value1, value2, "renyuanshu2");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu2NotBetween(Integer value1, Integer value2) {
            addCriterion("RENYUANSHU2 not between", value1, value2, "renyuanshu2");
            return (Criteria) this;
        }

        public Criteria andSanshiwushuIsNull() {
            addCriterion("SANSHIWUSHU is null");
            return (Criteria) this;
        }

        public Criteria andSanshiwushuIsNotNull() {
            addCriterion("SANSHIWUSHU is not null");
            return (Criteria) this;
        }

        public Criteria andSanshiwushuEqualTo(Integer value) {
            addCriterion("SANSHIWUSHU =", value, "sanshiwushu");
            return (Criteria) this;
        }

        public Criteria andSanshiwushuNotEqualTo(Integer value) {
            addCriterion("SANSHIWUSHU <>", value, "sanshiwushu");
            return (Criteria) this;
        }

        public Criteria andSanshiwushuGreaterThan(Integer value) {
            addCriterion("SANSHIWUSHU >", value, "sanshiwushu");
            return (Criteria) this;
        }

        public Criteria andSanshiwushuGreaterThanOrEqualTo(Integer value) {
            addCriterion("SANSHIWUSHU >=", value, "sanshiwushu");
            return (Criteria) this;
        }

        public Criteria andSanshiwushuLessThan(Integer value) {
            addCriterion("SANSHIWUSHU <", value, "sanshiwushu");
            return (Criteria) this;
        }

        public Criteria andSanshiwushuLessThanOrEqualTo(Integer value) {
            addCriterion("SANSHIWUSHU <=", value, "sanshiwushu");
            return (Criteria) this;
        }

        public Criteria andSanshiwushuIn(List<Integer> values) {
            addCriterion("SANSHIWUSHU in", values, "sanshiwushu");
            return (Criteria) this;
        }

        public Criteria andSanshiwushuNotIn(List<Integer> values) {
            addCriterion("SANSHIWUSHU not in", values, "sanshiwushu");
            return (Criteria) this;
        }

        public Criteria andSanshiwushuBetween(Integer value1, Integer value2) {
            addCriterion("SANSHIWUSHU between", value1, value2, "sanshiwushu");
            return (Criteria) this;
        }

        public Criteria andSanshiwushuNotBetween(Integer value1, Integer value2) {
            addCriterion("SANSHIWUSHU not between", value1, value2, "sanshiwushu");
            return (Criteria) this;
        }

        public Criteria andWushisishuIsNull() {
            addCriterion("WUSHISISHU is null");
            return (Criteria) this;
        }

        public Criteria andWushisishuIsNotNull() {
            addCriterion("WUSHISISHU is not null");
            return (Criteria) this;
        }

        public Criteria andWushisishuEqualTo(Integer value) {
            addCriterion("WUSHISISHU =", value, "wushisishu");
            return (Criteria) this;
        }

        public Criteria andWushisishuNotEqualTo(Integer value) {
            addCriterion("WUSHISISHU <>", value, "wushisishu");
            return (Criteria) this;
        }

        public Criteria andWushisishuGreaterThan(Integer value) {
            addCriterion("WUSHISISHU >", value, "wushisishu");
            return (Criteria) this;
        }

        public Criteria andWushisishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("WUSHISISHU >=", value, "wushisishu");
            return (Criteria) this;
        }

        public Criteria andWushisishuLessThan(Integer value) {
            addCriterion("WUSHISISHU <", value, "wushisishu");
            return (Criteria) this;
        }

        public Criteria andWushisishuLessThanOrEqualTo(Integer value) {
            addCriterion("WUSHISISHU <=", value, "wushisishu");
            return (Criteria) this;
        }

        public Criteria andWushisishuIn(List<Integer> values) {
            addCriterion("WUSHISISHU in", values, "wushisishu");
            return (Criteria) this;
        }

        public Criteria andWushisishuNotIn(List<Integer> values) {
            addCriterion("WUSHISISHU not in", values, "wushisishu");
            return (Criteria) this;
        }

        public Criteria andWushisishuBetween(Integer value1, Integer value2) {
            addCriterion("WUSHISISHU between", value1, value2, "wushisishu");
            return (Criteria) this;
        }

        public Criteria andWushisishuNotBetween(Integer value1, Integer value2) {
            addCriterion("WUSHISISHU not between", value1, value2, "wushisishu");
            return (Criteria) this;
        }

        public Criteria andWushiwushuIsNull() {
            addCriterion("WUSHIWUSHU is null");
            return (Criteria) this;
        }

        public Criteria andWushiwushuIsNotNull() {
            addCriterion("WUSHIWUSHU is not null");
            return (Criteria) this;
        }

        public Criteria andWushiwushuEqualTo(Integer value) {
            addCriterion("WUSHIWUSHU =", value, "wushiwushu");
            return (Criteria) this;
        }

        public Criteria andWushiwushuNotEqualTo(Integer value) {
            addCriterion("WUSHIWUSHU <>", value, "wushiwushu");
            return (Criteria) this;
        }

        public Criteria andWushiwushuGreaterThan(Integer value) {
            addCriterion("WUSHIWUSHU >", value, "wushiwushu");
            return (Criteria) this;
        }

        public Criteria andWushiwushuGreaterThanOrEqualTo(Integer value) {
            addCriterion("WUSHIWUSHU >=", value, "wushiwushu");
            return (Criteria) this;
        }

        public Criteria andWushiwushuLessThan(Integer value) {
            addCriterion("WUSHIWUSHU <", value, "wushiwushu");
            return (Criteria) this;
        }

        public Criteria andWushiwushuLessThanOrEqualTo(Integer value) {
            addCriterion("WUSHIWUSHU <=", value, "wushiwushu");
            return (Criteria) this;
        }

        public Criteria andWushiwushuIn(List<Integer> values) {
            addCriterion("WUSHIWUSHU in", values, "wushiwushu");
            return (Criteria) this;
        }

        public Criteria andWushiwushuNotIn(List<Integer> values) {
            addCriterion("WUSHIWUSHU not in", values, "wushiwushu");
            return (Criteria) this;
        }

        public Criteria andWushiwushuBetween(Integer value1, Integer value2) {
            addCriterion("WUSHIWUSHU between", value1, value2, "wushiwushu");
            return (Criteria) this;
        }

        public Criteria andWushiwushuNotBetween(Integer value1, Integer value2) {
            addCriterion("WUSHIWUSHU not between", value1, value2, "wushiwushu");
            return (Criteria) this;
        }

        public Criteria andBoshishuIsNull() {
            addCriterion("BOSHISHU is null");
            return (Criteria) this;
        }

        public Criteria andBoshishuIsNotNull() {
            addCriterion("BOSHISHU is not null");
            return (Criteria) this;
        }

        public Criteria andBoshishuEqualTo(Integer value) {
            addCriterion("BOSHISHU =", value, "boshishu");
            return (Criteria) this;
        }

        public Criteria andBoshishuNotEqualTo(Integer value) {
            addCriterion("BOSHISHU <>", value, "boshishu");
            return (Criteria) this;
        }

        public Criteria andBoshishuGreaterThan(Integer value) {
            addCriterion("BOSHISHU >", value, "boshishu");
            return (Criteria) this;
        }

        public Criteria andBoshishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("BOSHISHU >=", value, "boshishu");
            return (Criteria) this;
        }

        public Criteria andBoshishuLessThan(Integer value) {
            addCriterion("BOSHISHU <", value, "boshishu");
            return (Criteria) this;
        }

        public Criteria andBoshishuLessThanOrEqualTo(Integer value) {
            addCriterion("BOSHISHU <=", value, "boshishu");
            return (Criteria) this;
        }

        public Criteria andBoshishuIn(List<Integer> values) {
            addCriterion("BOSHISHU in", values, "boshishu");
            return (Criteria) this;
        }

        public Criteria andBoshishuNotIn(List<Integer> values) {
            addCriterion("BOSHISHU not in", values, "boshishu");
            return (Criteria) this;
        }

        public Criteria andBoshishuBetween(Integer value1, Integer value2) {
            addCriterion("BOSHISHU between", value1, value2, "boshishu");
            return (Criteria) this;
        }

        public Criteria andBoshishuNotBetween(Integer value1, Integer value2) {
            addCriterion("BOSHISHU not between", value1, value2, "boshishu");
            return (Criteria) this;
        }

        public Criteria andShuoshishuIsNull() {
            addCriterion("SHUOSHISHU is null");
            return (Criteria) this;
        }

        public Criteria andShuoshishuIsNotNull() {
            addCriterion("SHUOSHISHU is not null");
            return (Criteria) this;
        }

        public Criteria andShuoshishuEqualTo(Integer value) {
            addCriterion("SHUOSHISHU =", value, "shuoshishu");
            return (Criteria) this;
        }

        public Criteria andShuoshishuNotEqualTo(Integer value) {
            addCriterion("SHUOSHISHU <>", value, "shuoshishu");
            return (Criteria) this;
        }

        public Criteria andShuoshishuGreaterThan(Integer value) {
            addCriterion("SHUOSHISHU >", value, "shuoshishu");
            return (Criteria) this;
        }

        public Criteria andShuoshishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHUOSHISHU >=", value, "shuoshishu");
            return (Criteria) this;
        }

        public Criteria andShuoshishuLessThan(Integer value) {
            addCriterion("SHUOSHISHU <", value, "shuoshishu");
            return (Criteria) this;
        }

        public Criteria andShuoshishuLessThanOrEqualTo(Integer value) {
            addCriterion("SHUOSHISHU <=", value, "shuoshishu");
            return (Criteria) this;
        }

        public Criteria andShuoshishuIn(List<Integer> values) {
            addCriterion("SHUOSHISHU in", values, "shuoshishu");
            return (Criteria) this;
        }

        public Criteria andShuoshishuNotIn(List<Integer> values) {
            addCriterion("SHUOSHISHU not in", values, "shuoshishu");
            return (Criteria) this;
        }

        public Criteria andShuoshishuBetween(Integer value1, Integer value2) {
            addCriterion("SHUOSHISHU between", value1, value2, "shuoshishu");
            return (Criteria) this;
        }

        public Criteria andShuoshishuNotBetween(Integer value1, Integer value2) {
            addCriterion("SHUOSHISHU not between", value1, value2, "shuoshishu");
            return (Criteria) this;
        }

        public Criteria andBenkeshuIsNull() {
            addCriterion("BENKESHU is null");
            return (Criteria) this;
        }

        public Criteria andBenkeshuIsNotNull() {
            addCriterion("BENKESHU is not null");
            return (Criteria) this;
        }

        public Criteria andBenkeshuEqualTo(Integer value) {
            addCriterion("BENKESHU =", value, "benkeshu");
            return (Criteria) this;
        }

        public Criteria andBenkeshuNotEqualTo(Integer value) {
            addCriterion("BENKESHU <>", value, "benkeshu");
            return (Criteria) this;
        }

        public Criteria andBenkeshuGreaterThan(Integer value) {
            addCriterion("BENKESHU >", value, "benkeshu");
            return (Criteria) this;
        }

        public Criteria andBenkeshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("BENKESHU >=", value, "benkeshu");
            return (Criteria) this;
        }

        public Criteria andBenkeshuLessThan(Integer value) {
            addCriterion("BENKESHU <", value, "benkeshu");
            return (Criteria) this;
        }

        public Criteria andBenkeshuLessThanOrEqualTo(Integer value) {
            addCriterion("BENKESHU <=", value, "benkeshu");
            return (Criteria) this;
        }

        public Criteria andBenkeshuIn(List<Integer> values) {
            addCriterion("BENKESHU in", values, "benkeshu");
            return (Criteria) this;
        }

        public Criteria andBenkeshuNotIn(List<Integer> values) {
            addCriterion("BENKESHU not in", values, "benkeshu");
            return (Criteria) this;
        }

        public Criteria andBenkeshuBetween(Integer value1, Integer value2) {
            addCriterion("BENKESHU between", value1, value2, "benkeshu");
            return (Criteria) this;
        }

        public Criteria andBenkeshuNotBetween(Integer value1, Integer value2) {
            addCriterion("BENKESHU not between", value1, value2, "benkeshu");
            return (Criteria) this;
        }

        public Criteria andDazhuanshuIsNull() {
            addCriterion("DAZHUANSHU is null");
            return (Criteria) this;
        }

        public Criteria andDazhuanshuIsNotNull() {
            addCriterion("DAZHUANSHU is not null");
            return (Criteria) this;
        }

        public Criteria andDazhuanshuEqualTo(Integer value) {
            addCriterion("DAZHUANSHU =", value, "dazhuanshu");
            return (Criteria) this;
        }

        public Criteria andDazhuanshuNotEqualTo(Integer value) {
            addCriterion("DAZHUANSHU <>", value, "dazhuanshu");
            return (Criteria) this;
        }

        public Criteria andDazhuanshuGreaterThan(Integer value) {
            addCriterion("DAZHUANSHU >", value, "dazhuanshu");
            return (Criteria) this;
        }

        public Criteria andDazhuanshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("DAZHUANSHU >=", value, "dazhuanshu");
            return (Criteria) this;
        }

        public Criteria andDazhuanshuLessThan(Integer value) {
            addCriterion("DAZHUANSHU <", value, "dazhuanshu");
            return (Criteria) this;
        }

        public Criteria andDazhuanshuLessThanOrEqualTo(Integer value) {
            addCriterion("DAZHUANSHU <=", value, "dazhuanshu");
            return (Criteria) this;
        }

        public Criteria andDazhuanshuIn(List<Integer> values) {
            addCriterion("DAZHUANSHU in", values, "dazhuanshu");
            return (Criteria) this;
        }

        public Criteria andDazhuanshuNotIn(List<Integer> values) {
            addCriterion("DAZHUANSHU not in", values, "dazhuanshu");
            return (Criteria) this;
        }

        public Criteria andDazhuanshuBetween(Integer value1, Integer value2) {
            addCriterion("DAZHUANSHU between", value1, value2, "dazhuanshu");
            return (Criteria) this;
        }

        public Criteria andDazhuanshuNotBetween(Integer value1, Integer value2) {
            addCriterion("DAZHUANSHU not between", value1, value2, "dazhuanshu");
            return (Criteria) this;
        }

        public Criteria andZhongzhuanshuIsNull() {
            addCriterion("ZHONGZHUANSHU is null");
            return (Criteria) this;
        }

        public Criteria andZhongzhuanshuIsNotNull() {
            addCriterion("ZHONGZHUANSHU is not null");
            return (Criteria) this;
        }

        public Criteria andZhongzhuanshuEqualTo(Integer value) {
            addCriterion("ZHONGZHUANSHU =", value, "zhongzhuanshu");
            return (Criteria) this;
        }

        public Criteria andZhongzhuanshuNotEqualTo(Integer value) {
            addCriterion("ZHONGZHUANSHU <>", value, "zhongzhuanshu");
            return (Criteria) this;
        }

        public Criteria andZhongzhuanshuGreaterThan(Integer value) {
            addCriterion("ZHONGZHUANSHU >", value, "zhongzhuanshu");
            return (Criteria) this;
        }

        public Criteria andZhongzhuanshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZHONGZHUANSHU >=", value, "zhongzhuanshu");
            return (Criteria) this;
        }

        public Criteria andZhongzhuanshuLessThan(Integer value) {
            addCriterion("ZHONGZHUANSHU <", value, "zhongzhuanshu");
            return (Criteria) this;
        }

        public Criteria andZhongzhuanshuLessThanOrEqualTo(Integer value) {
            addCriterion("ZHONGZHUANSHU <=", value, "zhongzhuanshu");
            return (Criteria) this;
        }

        public Criteria andZhongzhuanshuIn(List<Integer> values) {
            addCriterion("ZHONGZHUANSHU in", values, "zhongzhuanshu");
            return (Criteria) this;
        }

        public Criteria andZhongzhuanshuNotIn(List<Integer> values) {
            addCriterion("ZHONGZHUANSHU not in", values, "zhongzhuanshu");
            return (Criteria) this;
        }

        public Criteria andZhongzhuanshuBetween(Integer value1, Integer value2) {
            addCriterion("ZHONGZHUANSHU between", value1, value2, "zhongzhuanshu");
            return (Criteria) this;
        }

        public Criteria andZhongzhuanshuNotBetween(Integer value1, Integer value2) {
            addCriterion("ZHONGZHUANSHU not between", value1, value2, "zhongzhuanshu");
            return (Criteria) this;
        }

        public Criteria andGaozhongshuIsNull() {
            addCriterion("GAOZHONGSHU is null");
            return (Criteria) this;
        }

        public Criteria andGaozhongshuIsNotNull() {
            addCriterion("GAOZHONGSHU is not null");
            return (Criteria) this;
        }

        public Criteria andGaozhongshuEqualTo(Integer value) {
            addCriterion("GAOZHONGSHU =", value, "gaozhongshu");
            return (Criteria) this;
        }

        public Criteria andGaozhongshuNotEqualTo(Integer value) {
            addCriterion("GAOZHONGSHU <>", value, "gaozhongshu");
            return (Criteria) this;
        }

        public Criteria andGaozhongshuGreaterThan(Integer value) {
            addCriterion("GAOZHONGSHU >", value, "gaozhongshu");
            return (Criteria) this;
        }

        public Criteria andGaozhongshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("GAOZHONGSHU >=", value, "gaozhongshu");
            return (Criteria) this;
        }

        public Criteria andGaozhongshuLessThan(Integer value) {
            addCriterion("GAOZHONGSHU <", value, "gaozhongshu");
            return (Criteria) this;
        }

        public Criteria andGaozhongshuLessThanOrEqualTo(Integer value) {
            addCriterion("GAOZHONGSHU <=", value, "gaozhongshu");
            return (Criteria) this;
        }

        public Criteria andGaozhongshuIn(List<Integer> values) {
            addCriterion("GAOZHONGSHU in", values, "gaozhongshu");
            return (Criteria) this;
        }

        public Criteria andGaozhongshuNotIn(List<Integer> values) {
            addCriterion("GAOZHONGSHU not in", values, "gaozhongshu");
            return (Criteria) this;
        }

        public Criteria andGaozhongshuBetween(Integer value1, Integer value2) {
            addCriterion("GAOZHONGSHU between", value1, value2, "gaozhongshu");
            return (Criteria) this;
        }

        public Criteria andGaozhongshuNotBetween(Integer value1, Integer value2) {
            addCriterion("GAOZHONGSHU not between", value1, value2, "gaozhongshu");
            return (Criteria) this;
        }

        public Criteria andJingjidangshuIsNull() {
            addCriterion("JINGJIDANGSHU is null");
            return (Criteria) this;
        }

        public Criteria andJingjidangshuIsNotNull() {
            addCriterion("JINGJIDANGSHU is not null");
            return (Criteria) this;
        }

        public Criteria andJingjidangshuEqualTo(Integer value) {
            addCriterion("JINGJIDANGSHU =", value, "jingjidangshu");
            return (Criteria) this;
        }

        public Criteria andJingjidangshuNotEqualTo(Integer value) {
            addCriterion("JINGJIDANGSHU <>", value, "jingjidangshu");
            return (Criteria) this;
        }

        public Criteria andJingjidangshuGreaterThan(Integer value) {
            addCriterion("JINGJIDANGSHU >", value, "jingjidangshu");
            return (Criteria) this;
        }

        public Criteria andJingjidangshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("JINGJIDANGSHU >=", value, "jingjidangshu");
            return (Criteria) this;
        }

        public Criteria andJingjidangshuLessThan(Integer value) {
            addCriterion("JINGJIDANGSHU <", value, "jingjidangshu");
            return (Criteria) this;
        }

        public Criteria andJingjidangshuLessThanOrEqualTo(Integer value) {
            addCriterion("JINGJIDANGSHU <=", value, "jingjidangshu");
            return (Criteria) this;
        }

        public Criteria andJingjidangshuIn(List<Integer> values) {
            addCriterion("JINGJIDANGSHU in", values, "jingjidangshu");
            return (Criteria) this;
        }

        public Criteria andJingjidangshuNotIn(List<Integer> values) {
            addCriterion("JINGJIDANGSHU not in", values, "jingjidangshu");
            return (Criteria) this;
        }

        public Criteria andJingjidangshuBetween(Integer value1, Integer value2) {
            addCriterion("JINGJIDANGSHU between", value1, value2, "jingjidangshu");
            return (Criteria) this;
        }

        public Criteria andJingjidangshuNotBetween(Integer value1, Integer value2) {
            addCriterion("JINGJIDANGSHU not between", value1, value2, "jingjidangshu");
            return (Criteria) this;
        }

        public Criteria andWaishengdangshuIsNull() {
            addCriterion("WAISHENGDANGSHU is null");
            return (Criteria) this;
        }

        public Criteria andWaishengdangshuIsNotNull() {
            addCriterion("WAISHENGDANGSHU is not null");
            return (Criteria) this;
        }

        public Criteria andWaishengdangshuEqualTo(Integer value) {
            addCriterion("WAISHENGDANGSHU =", value, "waishengdangshu");
            return (Criteria) this;
        }

        public Criteria andWaishengdangshuNotEqualTo(Integer value) {
            addCriterion("WAISHENGDANGSHU <>", value, "waishengdangshu");
            return (Criteria) this;
        }

        public Criteria andWaishengdangshuGreaterThan(Integer value) {
            addCriterion("WAISHENGDANGSHU >", value, "waishengdangshu");
            return (Criteria) this;
        }

        public Criteria andWaishengdangshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("WAISHENGDANGSHU >=", value, "waishengdangshu");
            return (Criteria) this;
        }

        public Criteria andWaishengdangshuLessThan(Integer value) {
            addCriterion("WAISHENGDANGSHU <", value, "waishengdangshu");
            return (Criteria) this;
        }

        public Criteria andWaishengdangshuLessThanOrEqualTo(Integer value) {
            addCriterion("WAISHENGDANGSHU <=", value, "waishengdangshu");
            return (Criteria) this;
        }

        public Criteria andWaishengdangshuIn(List<Integer> values) {
            addCriterion("WAISHENGDANGSHU in", values, "waishengdangshu");
            return (Criteria) this;
        }

        public Criteria andWaishengdangshuNotIn(List<Integer> values) {
            addCriterion("WAISHENGDANGSHU not in", values, "waishengdangshu");
            return (Criteria) this;
        }

        public Criteria andWaishengdangshuBetween(Integer value1, Integer value2) {
            addCriterion("WAISHENGDANGSHU between", value1, value2, "waishengdangshu");
            return (Criteria) this;
        }

        public Criteria andWaishengdangshuNotBetween(Integer value1, Integer value2) {
            addCriterion("WAISHENGDANGSHU not between", value1, value2, "waishengdangshu");
            return (Criteria) this;
        }

        public Criteria andShehuizushuIsNull() {
            addCriterion("SHEHUIZUSHU is null");
            return (Criteria) this;
        }

        public Criteria andShehuizushuIsNotNull() {
            addCriterion("SHEHUIZUSHU is not null");
            return (Criteria) this;
        }

        public Criteria andShehuizushuEqualTo(Integer value) {
            addCriterion("SHEHUIZUSHU =", value, "shehuizushu");
            return (Criteria) this;
        }

        public Criteria andShehuizushuNotEqualTo(Integer value) {
            addCriterion("SHEHUIZUSHU <>", value, "shehuizushu");
            return (Criteria) this;
        }

        public Criteria andShehuizushuGreaterThan(Integer value) {
            addCriterion("SHEHUIZUSHU >", value, "shehuizushu");
            return (Criteria) this;
        }

        public Criteria andShehuizushuGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHEHUIZUSHU >=", value, "shehuizushu");
            return (Criteria) this;
        }

        public Criteria andShehuizushuLessThan(Integer value) {
            addCriterion("SHEHUIZUSHU <", value, "shehuizushu");
            return (Criteria) this;
        }

        public Criteria andShehuizushuLessThanOrEqualTo(Integer value) {
            addCriterion("SHEHUIZUSHU <=", value, "shehuizushu");
            return (Criteria) this;
        }

        public Criteria andShehuizushuIn(List<Integer> values) {
            addCriterion("SHEHUIZUSHU in", values, "shehuizushu");
            return (Criteria) this;
        }

        public Criteria andShehuizushuNotIn(List<Integer> values) {
            addCriterion("SHEHUIZUSHU not in", values, "shehuizushu");
            return (Criteria) this;
        }

        public Criteria andShehuizushuBetween(Integer value1, Integer value2) {
            addCriterion("SHEHUIZUSHU between", value1, value2, "shehuizushu");
            return (Criteria) this;
        }

        public Criteria andShehuizushuNotBetween(Integer value1, Integer value2) {
            addCriterion("SHEHUIZUSHU not between", value1, value2, "shehuizushu");
            return (Criteria) this;
        }

        public Criteria andYezushuIsNull() {
            addCriterion("YEZUSHU is null");
            return (Criteria) this;
        }

        public Criteria andYezushuIsNotNull() {
            addCriterion("YEZUSHU is not null");
            return (Criteria) this;
        }

        public Criteria andYezushuEqualTo(Integer value) {
            addCriterion("YEZUSHU =", value, "yezushu");
            return (Criteria) this;
        }

        public Criteria andYezushuNotEqualTo(Integer value) {
            addCriterion("YEZUSHU <>", value, "yezushu");
            return (Criteria) this;
        }

        public Criteria andYezushuGreaterThan(Integer value) {
            addCriterion("YEZUSHU >", value, "yezushu");
            return (Criteria) this;
        }

        public Criteria andYezushuGreaterThanOrEqualTo(Integer value) {
            addCriterion("YEZUSHU >=", value, "yezushu");
            return (Criteria) this;
        }

        public Criteria andYezushuLessThan(Integer value) {
            addCriterion("YEZUSHU <", value, "yezushu");
            return (Criteria) this;
        }

        public Criteria andYezushuLessThanOrEqualTo(Integer value) {
            addCriterion("YEZUSHU <=", value, "yezushu");
            return (Criteria) this;
        }

        public Criteria andYezushuIn(List<Integer> values) {
            addCriterion("YEZUSHU in", values, "yezushu");
            return (Criteria) this;
        }

        public Criteria andYezushuNotIn(List<Integer> values) {
            addCriterion("YEZUSHU not in", values, "yezushu");
            return (Criteria) this;
        }

        public Criteria andYezushuBetween(Integer value1, Integer value2) {
            addCriterion("YEZUSHU between", value1, value2, "yezushu");
            return (Criteria) this;
        }

        public Criteria andYezushuNotBetween(Integer value1, Integer value2) {
            addCriterion("YEZUSHU not between", value1, value2, "yezushu");
            return (Criteria) this;
        }

        public Criteria andGuakaozushuIsNull() {
            addCriterion("GUAKAOZUSHU is null");
            return (Criteria) this;
        }

        public Criteria andGuakaozushuIsNotNull() {
            addCriterion("GUAKAOZUSHU is not null");
            return (Criteria) this;
        }

        public Criteria andGuakaozushuEqualTo(Integer value) {
            addCriterion("GUAKAOZUSHU =", value, "guakaozushu");
            return (Criteria) this;
        }

        public Criteria andGuakaozushuNotEqualTo(Integer value) {
            addCriterion("GUAKAOZUSHU <>", value, "guakaozushu");
            return (Criteria) this;
        }

        public Criteria andGuakaozushuGreaterThan(Integer value) {
            addCriterion("GUAKAOZUSHU >", value, "guakaozushu");
            return (Criteria) this;
        }

        public Criteria andGuakaozushuGreaterThanOrEqualTo(Integer value) {
            addCriterion("GUAKAOZUSHU >=", value, "guakaozushu");
            return (Criteria) this;
        }

        public Criteria andGuakaozushuLessThan(Integer value) {
            addCriterion("GUAKAOZUSHU <", value, "guakaozushu");
            return (Criteria) this;
        }

        public Criteria andGuakaozushuLessThanOrEqualTo(Integer value) {
            addCriterion("GUAKAOZUSHU <=", value, "guakaozushu");
            return (Criteria) this;
        }

        public Criteria andGuakaozushuIn(List<Integer> values) {
            addCriterion("GUAKAOZUSHU in", values, "guakaozushu");
            return (Criteria) this;
        }

        public Criteria andGuakaozushuNotIn(List<Integer> values) {
            addCriterion("GUAKAOZUSHU not in", values, "guakaozushu");
            return (Criteria) this;
        }

        public Criteria andGuakaozushuBetween(Integer value1, Integer value2) {
            addCriterion("GUAKAOZUSHU between", value1, value2, "guakaozushu");
            return (Criteria) this;
        }

        public Criteria andGuakaozushuNotBetween(Integer value1, Integer value2) {
            addCriterion("GUAKAOZUSHU not between", value1, value2, "guakaozushu");
            return (Criteria) this;
        }

        public Criteria andShudizushuIsNull() {
            addCriterion("SHUDIZUSHU is null");
            return (Criteria) this;
        }

        public Criteria andShudizushuIsNotNull() {
            addCriterion("SHUDIZUSHU is not null");
            return (Criteria) this;
        }

        public Criteria andShudizushuEqualTo(Integer value) {
            addCriterion("SHUDIZUSHU =", value, "shudizushu");
            return (Criteria) this;
        }

        public Criteria andShudizushuNotEqualTo(Integer value) {
            addCriterion("SHUDIZUSHU <>", value, "shudizushu");
            return (Criteria) this;
        }

        public Criteria andShudizushuGreaterThan(Integer value) {
            addCriterion("SHUDIZUSHU >", value, "shudizushu");
            return (Criteria) this;
        }

        public Criteria andShudizushuGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHUDIZUSHU >=", value, "shudizushu");
            return (Criteria) this;
        }

        public Criteria andShudizushuLessThan(Integer value) {
            addCriterion("SHUDIZUSHU <", value, "shudizushu");
            return (Criteria) this;
        }

        public Criteria andShudizushuLessThanOrEqualTo(Integer value) {
            addCriterion("SHUDIZUSHU <=", value, "shudizushu");
            return (Criteria) this;
        }

        public Criteria andShudizushuIn(List<Integer> values) {
            addCriterion("SHUDIZUSHU in", values, "shudizushu");
            return (Criteria) this;
        }

        public Criteria andShudizushuNotIn(List<Integer> values) {
            addCriterion("SHUDIZUSHU not in", values, "shudizushu");
            return (Criteria) this;
        }

        public Criteria andShudizushuBetween(Integer value1, Integer value2) {
            addCriterion("SHUDIZUSHU between", value1, value2, "shudizushu");
            return (Criteria) this;
        }

        public Criteria andShudizushuNotBetween(Integer value1, Integer value2) {
            addCriterion("SHUDIZUSHU not between", value1, value2, "shudizushu");
            return (Criteria) this;
        }

        public Criteria andYuanzuzhishuIsNull() {
            addCriterion("YUANZUZHISHU is null");
            return (Criteria) this;
        }

        public Criteria andYuanzuzhishuIsNotNull() {
            addCriterion("YUANZUZHISHU is not null");
            return (Criteria) this;
        }

        public Criteria andYuanzuzhishuEqualTo(Integer value) {
            addCriterion("YUANZUZHISHU =", value, "yuanzuzhishu");
            return (Criteria) this;
        }

        public Criteria andYuanzuzhishuNotEqualTo(Integer value) {
            addCriterion("YUANZUZHISHU <>", value, "yuanzuzhishu");
            return (Criteria) this;
        }

        public Criteria andYuanzuzhishuGreaterThan(Integer value) {
            addCriterion("YUANZUZHISHU >", value, "yuanzuzhishu");
            return (Criteria) this;
        }

        public Criteria andYuanzuzhishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("YUANZUZHISHU >=", value, "yuanzuzhishu");
            return (Criteria) this;
        }

        public Criteria andYuanzuzhishuLessThan(Integer value) {
            addCriterion("YUANZUZHISHU <", value, "yuanzuzhishu");
            return (Criteria) this;
        }

        public Criteria andYuanzuzhishuLessThanOrEqualTo(Integer value) {
            addCriterion("YUANZUZHISHU <=", value, "yuanzuzhishu");
            return (Criteria) this;
        }

        public Criteria andYuanzuzhishuIn(List<Integer> values) {
            addCriterion("YUANZUZHISHU in", values, "yuanzuzhishu");
            return (Criteria) this;
        }

        public Criteria andYuanzuzhishuNotIn(List<Integer> values) {
            addCriterion("YUANZUZHISHU not in", values, "yuanzuzhishu");
            return (Criteria) this;
        }

        public Criteria andYuanzuzhishuBetween(Integer value1, Integer value2) {
            addCriterion("YUANZUZHISHU between", value1, value2, "yuanzuzhishu");
            return (Criteria) this;
        }

        public Criteria andYuanzuzhishuNotBetween(Integer value1, Integer value2) {
            addCriterion("YUANZUZHISHU not between", value1, value2, "yuanzuzhishu");
            return (Criteria) this;
        }

        public Criteria andQitashuIsNull() {
            addCriterion("QITASHU is null");
            return (Criteria) this;
        }

        public Criteria andQitashuIsNotNull() {
            addCriterion("QITASHU is not null");
            return (Criteria) this;
        }

        public Criteria andQitashuEqualTo(Integer value) {
            addCriterion("QITASHU =", value, "qitashu");
            return (Criteria) this;
        }

        public Criteria andQitashuNotEqualTo(Integer value) {
            addCriterion("QITASHU <>", value, "qitashu");
            return (Criteria) this;
        }

        public Criteria andQitashuGreaterThan(Integer value) {
            addCriterion("QITASHU >", value, "qitashu");
            return (Criteria) this;
        }

        public Criteria andQitashuGreaterThanOrEqualTo(Integer value) {
            addCriterion("QITASHU >=", value, "qitashu");
            return (Criteria) this;
        }

        public Criteria andQitashuLessThan(Integer value) {
            addCriterion("QITASHU <", value, "qitashu");
            return (Criteria) this;
        }

        public Criteria andQitashuLessThanOrEqualTo(Integer value) {
            addCriterion("QITASHU <=", value, "qitashu");
            return (Criteria) this;
        }

        public Criteria andQitashuIn(List<Integer> values) {
            addCriterion("QITASHU in", values, "qitashu");
            return (Criteria) this;
        }

        public Criteria andQitashuNotIn(List<Integer> values) {
            addCriterion("QITASHU not in", values, "qitashu");
            return (Criteria) this;
        }

        public Criteria andQitashuBetween(Integer value1, Integer value2) {
            addCriterion("QITASHU between", value1, value2, "qitashu");
            return (Criteria) this;
        }

        public Criteria andQitashuNotBetween(Integer value1, Integer value2) {
            addCriterion("QITASHU not between", value1, value2, "qitashu");
            return (Criteria) this;
        }

        public Criteria andJianlidang1IsNull() {
            addCriterion("JIANLIDANG1 is null");
            return (Criteria) this;
        }

        public Criteria andJianlidang1IsNotNull() {
            addCriterion("JIANLIDANG1 is not null");
            return (Criteria) this;
        }

        public Criteria andJianlidang1EqualTo(String value) {
            addCriterion("JIANLIDANG1 =", value, "jianlidang1");
            return (Criteria) this;
        }

        public Criteria andJianlidang1NotEqualTo(String value) {
            addCriterion("JIANLIDANG1 <>", value, "jianlidang1");
            return (Criteria) this;
        }

        public Criteria andJianlidang1GreaterThan(String value) {
            addCriterion("JIANLIDANG1 >", value, "jianlidang1");
            return (Criteria) this;
        }

        public Criteria andJianlidang1GreaterThanOrEqualTo(String value) {
            addCriterion("JIANLIDANG1 >=", value, "jianlidang1");
            return (Criteria) this;
        }

        public Criteria andJianlidang1LessThan(String value) {
            addCriterion("JIANLIDANG1 <", value, "jianlidang1");
            return (Criteria) this;
        }

        public Criteria andJianlidang1LessThanOrEqualTo(String value) {
            addCriterion("JIANLIDANG1 <=", value, "jianlidang1");
            return (Criteria) this;
        }

        public Criteria andJianlidang1Like(String value) {
            addCriterion("JIANLIDANG1 like", value, "jianlidang1");
            return (Criteria) this;
        }

        public Criteria andJianlidang1NotLike(String value) {
            addCriterion("JIANLIDANG1 not like", value, "jianlidang1");
            return (Criteria) this;
        }

        public Criteria andJianlidang1In(List<String> values) {
            addCriterion("JIANLIDANG1 in", values, "jianlidang1");
            return (Criteria) this;
        }

        public Criteria andJianlidang1NotIn(List<String> values) {
            addCriterion("JIANLIDANG1 not in", values, "jianlidang1");
            return (Criteria) this;
        }

        public Criteria andJianlidang1Between(String value1, String value2) {
            addCriterion("JIANLIDANG1 between", value1, value2, "jianlidang1");
            return (Criteria) this;
        }

        public Criteria andJianlidang1NotBetween(String value1, String value2) {
            addCriterion("JIANLIDANG1 not between", value1, value2, "jianlidang1");
            return (Criteria) this;
        }

        public Criteria andJianlidang2IsNull() {
            addCriterion("JIANLIDANG2 is null");
            return (Criteria) this;
        }

        public Criteria andJianlidang2IsNotNull() {
            addCriterion("JIANLIDANG2 is not null");
            return (Criteria) this;
        }

        public Criteria andJianlidang2EqualTo(String value) {
            addCriterion("JIANLIDANG2 =", value, "jianlidang2");
            return (Criteria) this;
        }

        public Criteria andJianlidang2NotEqualTo(String value) {
            addCriterion("JIANLIDANG2 <>", value, "jianlidang2");
            return (Criteria) this;
        }

        public Criteria andJianlidang2GreaterThan(String value) {
            addCriterion("JIANLIDANG2 >", value, "jianlidang2");
            return (Criteria) this;
        }

        public Criteria andJianlidang2GreaterThanOrEqualTo(String value) {
            addCriterion("JIANLIDANG2 >=", value, "jianlidang2");
            return (Criteria) this;
        }

        public Criteria andJianlidang2LessThan(String value) {
            addCriterion("JIANLIDANG2 <", value, "jianlidang2");
            return (Criteria) this;
        }

        public Criteria andJianlidang2LessThanOrEqualTo(String value) {
            addCriterion("JIANLIDANG2 <=", value, "jianlidang2");
            return (Criteria) this;
        }

        public Criteria andJianlidang2Like(String value) {
            addCriterion("JIANLIDANG2 like", value, "jianlidang2");
            return (Criteria) this;
        }

        public Criteria andJianlidang2NotLike(String value) {
            addCriterion("JIANLIDANG2 not like", value, "jianlidang2");
            return (Criteria) this;
        }

        public Criteria andJianlidang2In(List<String> values) {
            addCriterion("JIANLIDANG2 in", values, "jianlidang2");
            return (Criteria) this;
        }

        public Criteria andJianlidang2NotIn(List<String> values) {
            addCriterion("JIANLIDANG2 not in", values, "jianlidang2");
            return (Criteria) this;
        }

        public Criteria andJianlidang2Between(String value1, String value2) {
            addCriterion("JIANLIDANG2 between", value1, value2, "jianlidang2");
            return (Criteria) this;
        }

        public Criteria andJianlidang2NotBetween(String value1, String value2) {
            addCriterion("JIANLIDANG2 not between", value1, value2, "jianlidang2");
            return (Criteria) this;
        }

        public Criteria andZuzhimingchengIsNull() {
            addCriterion("ZUZHIMINGCHENG is null");
            return (Criteria) this;
        }

        public Criteria andZuzhimingchengIsNotNull() {
            addCriterion("ZUZHIMINGCHENG is not null");
            return (Criteria) this;
        }

        public Criteria andZuzhimingchengEqualTo(String value) {
            addCriterion("ZUZHIMINGCHENG =", value, "zuzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andZuzhimingchengNotEqualTo(String value) {
            addCriterion("ZUZHIMINGCHENG <>", value, "zuzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andZuzhimingchengGreaterThan(String value) {
            addCriterion("ZUZHIMINGCHENG >", value, "zuzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andZuzhimingchengGreaterThanOrEqualTo(String value) {
            addCriterion("ZUZHIMINGCHENG >=", value, "zuzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andZuzhimingchengLessThan(String value) {
            addCriterion("ZUZHIMINGCHENG <", value, "zuzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andZuzhimingchengLessThanOrEqualTo(String value) {
            addCriterion("ZUZHIMINGCHENG <=", value, "zuzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andZuzhimingchengLike(String value) {
            addCriterion("ZUZHIMINGCHENG like", value, "zuzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andZuzhimingchengNotLike(String value) {
            addCriterion("ZUZHIMINGCHENG not like", value, "zuzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andZuzhimingchengIn(List<String> values) {
            addCriterion("ZUZHIMINGCHENG in", values, "zuzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andZuzhimingchengNotIn(List<String> values) {
            addCriterion("ZUZHIMINGCHENG not in", values, "zuzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andZuzhimingchengBetween(String value1, String value2) {
            addCriterion("ZUZHIMINGCHENG between", value1, value2, "zuzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andZuzhimingchengNotBetween(String value1, String value2) {
            addCriterion("ZUZHIMINGCHENG not between", value1, value2, "zuzhimingcheng");
            return (Criteria) this;
        }

        public Criteria andDangleixingIsNull() {
            addCriterion("DANGLEIXING is null");
            return (Criteria) this;
        }

        public Criteria andDangleixingIsNotNull() {
            addCriterion("DANGLEIXING is not null");
            return (Criteria) this;
        }

        public Criteria andDangleixingEqualTo(String value) {
            addCriterion("DANGLEIXING =", value, "dangleixing");
            return (Criteria) this;
        }

        public Criteria andDangleixingNotEqualTo(String value) {
            addCriterion("DANGLEIXING <>", value, "dangleixing");
            return (Criteria) this;
        }

        public Criteria andDangleixingGreaterThan(String value) {
            addCriterion("DANGLEIXING >", value, "dangleixing");
            return (Criteria) this;
        }

        public Criteria andDangleixingGreaterThanOrEqualTo(String value) {
            addCriterion("DANGLEIXING >=", value, "dangleixing");
            return (Criteria) this;
        }

        public Criteria andDangleixingLessThan(String value) {
            addCriterion("DANGLEIXING <", value, "dangleixing");
            return (Criteria) this;
        }

        public Criteria andDangleixingLessThanOrEqualTo(String value) {
            addCriterion("DANGLEIXING <=", value, "dangleixing");
            return (Criteria) this;
        }

        public Criteria andDangleixingLike(String value) {
            addCriterion("DANGLEIXING like", value, "dangleixing");
            return (Criteria) this;
        }

        public Criteria andDangleixingNotLike(String value) {
            addCriterion("DANGLEIXING not like", value, "dangleixing");
            return (Criteria) this;
        }

        public Criteria andDangleixingIn(List<String> values) {
            addCriterion("DANGLEIXING in", values, "dangleixing");
            return (Criteria) this;
        }

        public Criteria andDangleixingNotIn(List<String> values) {
            addCriterion("DANGLEIXING not in", values, "dangleixing");
            return (Criteria) this;
        }

        public Criteria andDangleixingBetween(String value1, String value2) {
            addCriterion("DANGLEIXING between", value1, value2, "dangleixing");
            return (Criteria) this;
        }

        public Criteria andDangleixingNotBetween(String value1, String value2) {
            addCriterion("DANGLEIXING not between", value1, value2, "dangleixing");
            return (Criteria) this;
        }

        public Criteria andLishuguanxiIsNull() {
            addCriterion("LISHUGUANXI is null");
            return (Criteria) this;
        }

        public Criteria andLishuguanxiIsNotNull() {
            addCriterion("LISHUGUANXI is not null");
            return (Criteria) this;
        }

        public Criteria andLishuguanxiEqualTo(String value) {
            addCriterion("LISHUGUANXI =", value, "lishuguanxi");
            return (Criteria) this;
        }

        public Criteria andLishuguanxiNotEqualTo(String value) {
            addCriterion("LISHUGUANXI <>", value, "lishuguanxi");
            return (Criteria) this;
        }

        public Criteria andLishuguanxiGreaterThan(String value) {
            addCriterion("LISHUGUANXI >", value, "lishuguanxi");
            return (Criteria) this;
        }

        public Criteria andLishuguanxiGreaterThanOrEqualTo(String value) {
            addCriterion("LISHUGUANXI >=", value, "lishuguanxi");
            return (Criteria) this;
        }

        public Criteria andLishuguanxiLessThan(String value) {
            addCriterion("LISHUGUANXI <", value, "lishuguanxi");
            return (Criteria) this;
        }

        public Criteria andLishuguanxiLessThanOrEqualTo(String value) {
            addCriterion("LISHUGUANXI <=", value, "lishuguanxi");
            return (Criteria) this;
        }

        public Criteria andLishuguanxiLike(String value) {
            addCriterion("LISHUGUANXI like", value, "lishuguanxi");
            return (Criteria) this;
        }

        public Criteria andLishuguanxiNotLike(String value) {
            addCriterion("LISHUGUANXI not like", value, "lishuguanxi");
            return (Criteria) this;
        }

        public Criteria andLishuguanxiIn(List<String> values) {
            addCriterion("LISHUGUANXI in", values, "lishuguanxi");
            return (Criteria) this;
        }

        public Criteria andLishuguanxiNotIn(List<String> values) {
            addCriterion("LISHUGUANXI not in", values, "lishuguanxi");
            return (Criteria) this;
        }

        public Criteria andLishuguanxiBetween(String value1, String value2) {
            addCriterion("LISHUGUANXI between", value1, value2, "lishuguanxi");
            return (Criteria) this;
        }

        public Criteria andLishuguanxiNotBetween(String value1, String value2) {
            addCriterion("LISHUGUANXI not between", value1, value2, "lishuguanxi");
            return (Criteria) this;
        }

        public Criteria andDanrenzhiwuIsNull() {
            addCriterion("DANRENZHIWU is null");
            return (Criteria) this;
        }

        public Criteria andDanrenzhiwuIsNotNull() {
            addCriterion("DANRENZHIWU is not null");
            return (Criteria) this;
        }

        public Criteria andDanrenzhiwuEqualTo(String value) {
            addCriterion("DANRENZHIWU =", value, "danrenzhiwu");
            return (Criteria) this;
        }

        public Criteria andDanrenzhiwuNotEqualTo(String value) {
            addCriterion("DANRENZHIWU <>", value, "danrenzhiwu");
            return (Criteria) this;
        }

        public Criteria andDanrenzhiwuGreaterThan(String value) {
            addCriterion("DANRENZHIWU >", value, "danrenzhiwu");
            return (Criteria) this;
        }

        public Criteria andDanrenzhiwuGreaterThanOrEqualTo(String value) {
            addCriterion("DANRENZHIWU >=", value, "danrenzhiwu");
            return (Criteria) this;
        }

        public Criteria andDanrenzhiwuLessThan(String value) {
            addCriterion("DANRENZHIWU <", value, "danrenzhiwu");
            return (Criteria) this;
        }

        public Criteria andDanrenzhiwuLessThanOrEqualTo(String value) {
            addCriterion("DANRENZHIWU <=", value, "danrenzhiwu");
            return (Criteria) this;
        }

        public Criteria andDanrenzhiwuLike(String value) {
            addCriterion("DANRENZHIWU like", value, "danrenzhiwu");
            return (Criteria) this;
        }

        public Criteria andDanrenzhiwuNotLike(String value) {
            addCriterion("DANRENZHIWU not like", value, "danrenzhiwu");
            return (Criteria) this;
        }

        public Criteria andDanrenzhiwuIn(List<String> values) {
            addCriterion("DANRENZHIWU in", values, "danrenzhiwu");
            return (Criteria) this;
        }

        public Criteria andDanrenzhiwuNotIn(List<String> values) {
            addCriterion("DANRENZHIWU not in", values, "danrenzhiwu");
            return (Criteria) this;
        }

        public Criteria andDanrenzhiwuBetween(String value1, String value2) {
            addCriterion("DANRENZHIWU between", value1, value2, "danrenzhiwu");
            return (Criteria) this;
        }

        public Criteria andDanrenzhiwuNotBetween(String value1, String value2) {
            addCriterion("DANRENZHIWU not between", value1, value2, "danrenzhiwu");
            return (Criteria) this;
        }

        public Criteria andNianlingIsNull() {
            addCriterion("NIANLING is null");
            return (Criteria) this;
        }

        public Criteria andNianlingIsNotNull() {
            addCriterion("NIANLING is not null");
            return (Criteria) this;
        }

        public Criteria andNianlingEqualTo(String value) {
            addCriterion("NIANLING =", value, "nianling");
            return (Criteria) this;
        }

        public Criteria andNianlingNotEqualTo(String value) {
            addCriterion("NIANLING <>", value, "nianling");
            return (Criteria) this;
        }

        public Criteria andNianlingGreaterThan(String value) {
            addCriterion("NIANLING >", value, "nianling");
            return (Criteria) this;
        }

        public Criteria andNianlingGreaterThanOrEqualTo(String value) {
            addCriterion("NIANLING >=", value, "nianling");
            return (Criteria) this;
        }

        public Criteria andNianlingLessThan(String value) {
            addCriterion("NIANLING <", value, "nianling");
            return (Criteria) this;
        }

        public Criteria andNianlingLessThanOrEqualTo(String value) {
            addCriterion("NIANLING <=", value, "nianling");
            return (Criteria) this;
        }

        public Criteria andNianlingLike(String value) {
            addCriterion("NIANLING like", value, "nianling");
            return (Criteria) this;
        }

        public Criteria andNianlingNotLike(String value) {
            addCriterion("NIANLING not like", value, "nianling");
            return (Criteria) this;
        }

        public Criteria andNianlingIn(List<String> values) {
            addCriterion("NIANLING in", values, "nianling");
            return (Criteria) this;
        }

        public Criteria andNianlingNotIn(List<String> values) {
            addCriterion("NIANLING not in", values, "nianling");
            return (Criteria) this;
        }

        public Criteria andNianlingBetween(String value1, String value2) {
            addCriterion("NIANLING between", value1, value2, "nianling");
            return (Criteria) this;
        }

        public Criteria andNianlingNotBetween(String value1, String value2) {
            addCriterion("NIANLING not between", value1, value2, "nianling");
            return (Criteria) this;
        }

        public Criteria andXueliIsNull() {
            addCriterion("XUELI is null");
            return (Criteria) this;
        }

        public Criteria andXueliIsNotNull() {
            addCriterion("XUELI is not null");
            return (Criteria) this;
        }

        public Criteria andXueliEqualTo(String value) {
            addCriterion("XUELI =", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotEqualTo(String value) {
            addCriterion("XUELI <>", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliGreaterThan(String value) {
            addCriterion("XUELI >", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliGreaterThanOrEqualTo(String value) {
            addCriterion("XUELI >=", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLessThan(String value) {
            addCriterion("XUELI <", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLessThanOrEqualTo(String value) {
            addCriterion("XUELI <=", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLike(String value) {
            addCriterion("XUELI like", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotLike(String value) {
            addCriterion("XUELI not like", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliIn(List<String> values) {
            addCriterion("XUELI in", values, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotIn(List<String> values) {
            addCriterion("XUELI not in", values, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliBetween(String value1, String value2) {
            addCriterion("XUELI between", value1, value2, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotBetween(String value1, String value2) {
            addCriterion("XUELI not between", value1, value2, "xueli");
            return (Criteria) this;
        }

        public Criteria andLiudongshuIsNull() {
            addCriterion("LIUDONGSHU is null");
            return (Criteria) this;
        }

        public Criteria andLiudongshuIsNotNull() {
            addCriterion("LIUDONGSHU is not null");
            return (Criteria) this;
        }

        public Criteria andLiudongshuEqualTo(Integer value) {
            addCriterion("LIUDONGSHU =", value, "liudongshu");
            return (Criteria) this;
        }

        public Criteria andLiudongshuNotEqualTo(Integer value) {
            addCriterion("LIUDONGSHU <>", value, "liudongshu");
            return (Criteria) this;
        }

        public Criteria andLiudongshuGreaterThan(Integer value) {
            addCriterion("LIUDONGSHU >", value, "liudongshu");
            return (Criteria) this;
        }

        public Criteria andLiudongshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIUDONGSHU >=", value, "liudongshu");
            return (Criteria) this;
        }

        public Criteria andLiudongshuLessThan(Integer value) {
            addCriterion("LIUDONGSHU <", value, "liudongshu");
            return (Criteria) this;
        }

        public Criteria andLiudongshuLessThanOrEqualTo(Integer value) {
            addCriterion("LIUDONGSHU <=", value, "liudongshu");
            return (Criteria) this;
        }

        public Criteria andLiudongshuIn(List<Integer> values) {
            addCriterion("LIUDONGSHU in", values, "liudongshu");
            return (Criteria) this;
        }

        public Criteria andLiudongshuNotIn(List<Integer> values) {
            addCriterion("LIUDONGSHU not in", values, "liudongshu");
            return (Criteria) this;
        }

        public Criteria andLiudongshuBetween(Integer value1, Integer value2) {
            addCriterion("LIUDONGSHU between", value1, value2, "liudongshu");
            return (Criteria) this;
        }

        public Criteria andLiudongshuNotBetween(Integer value1, Integer value2) {
            addCriterion("LIUDONGSHU not between", value1, value2, "liudongshu");
            return (Criteria) this;
        }

        public Criteria andYuanjishuIsNull() {
            addCriterion("YUANJISHU is null");
            return (Criteria) this;
        }

        public Criteria andYuanjishuIsNotNull() {
            addCriterion("YUANJISHU is not null");
            return (Criteria) this;
        }

        public Criteria andYuanjishuEqualTo(Integer value) {
            addCriterion("YUANJISHU =", value, "yuanjishu");
            return (Criteria) this;
        }

        public Criteria andYuanjishuNotEqualTo(Integer value) {
            addCriterion("YUANJISHU <>", value, "yuanjishu");
            return (Criteria) this;
        }

        public Criteria andYuanjishuGreaterThan(Integer value) {
            addCriterion("YUANJISHU >", value, "yuanjishu");
            return (Criteria) this;
        }

        public Criteria andYuanjishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("YUANJISHU >=", value, "yuanjishu");
            return (Criteria) this;
        }

        public Criteria andYuanjishuLessThan(Integer value) {
            addCriterion("YUANJISHU <", value, "yuanjishu");
            return (Criteria) this;
        }

        public Criteria andYuanjishuLessThanOrEqualTo(Integer value) {
            addCriterion("YUANJISHU <=", value, "yuanjishu");
            return (Criteria) this;
        }

        public Criteria andYuanjishuIn(List<Integer> values) {
            addCriterion("YUANJISHU in", values, "yuanjishu");
            return (Criteria) this;
        }

        public Criteria andYuanjishuNotIn(List<Integer> values) {
            addCriterion("YUANJISHU not in", values, "yuanjishu");
            return (Criteria) this;
        }

        public Criteria andYuanjishuBetween(Integer value1, Integer value2) {
            addCriterion("YUANJISHU between", value1, value2, "yuanjishu");
            return (Criteria) this;
        }

        public Criteria andYuanjishuNotBetween(Integer value1, Integer value2) {
            addCriterion("YUANJISHU not between", value1, value2, "yuanjishu");
            return (Criteria) this;
        }

        public Criteria andZhijieshuIsNull() {
            addCriterion("ZHIJIESHU is null");
            return (Criteria) this;
        }

        public Criteria andZhijieshuIsNotNull() {
            addCriterion("ZHIJIESHU is not null");
            return (Criteria) this;
        }

        public Criteria andZhijieshuEqualTo(Integer value) {
            addCriterion("ZHIJIESHU =", value, "zhijieshu");
            return (Criteria) this;
        }

        public Criteria andZhijieshuNotEqualTo(Integer value) {
            addCriterion("ZHIJIESHU <>", value, "zhijieshu");
            return (Criteria) this;
        }

        public Criteria andZhijieshuGreaterThan(Integer value) {
            addCriterion("ZHIJIESHU >", value, "zhijieshu");
            return (Criteria) this;
        }

        public Criteria andZhijieshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZHIJIESHU >=", value, "zhijieshu");
            return (Criteria) this;
        }

        public Criteria andZhijieshuLessThan(Integer value) {
            addCriterion("ZHIJIESHU <", value, "zhijieshu");
            return (Criteria) this;
        }

        public Criteria andZhijieshuLessThanOrEqualTo(Integer value) {
            addCriterion("ZHIJIESHU <=", value, "zhijieshu");
            return (Criteria) this;
        }

        public Criteria andZhijieshuIn(List<Integer> values) {
            addCriterion("ZHIJIESHU in", values, "zhijieshu");
            return (Criteria) this;
        }

        public Criteria andZhijieshuNotIn(List<Integer> values) {
            addCriterion("ZHIJIESHU not in", values, "zhijieshu");
            return (Criteria) this;
        }

        public Criteria andZhijieshuBetween(Integer value1, Integer value2) {
            addCriterion("ZHIJIESHU between", value1, value2, "zhijieshu");
            return (Criteria) this;
        }

        public Criteria andZhijieshuNotBetween(Integer value1, Integer value2) {
            addCriterion("ZHIJIESHU not between", value1, value2, "zhijieshu");
            return (Criteria) this;
        }

        public Criteria andZidaishuIsNull() {
            addCriterion("ZIDAISHU is null");
            return (Criteria) this;
        }

        public Criteria andZidaishuIsNotNull() {
            addCriterion("ZIDAISHU is not null");
            return (Criteria) this;
        }

        public Criteria andZidaishuEqualTo(Integer value) {
            addCriterion("ZIDAISHU =", value, "zidaishu");
            return (Criteria) this;
        }

        public Criteria andZidaishuNotEqualTo(Integer value) {
            addCriterion("ZIDAISHU <>", value, "zidaishu");
            return (Criteria) this;
        }

        public Criteria andZidaishuGreaterThan(Integer value) {
            addCriterion("ZIDAISHU >", value, "zidaishu");
            return (Criteria) this;
        }

        public Criteria andZidaishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZIDAISHU >=", value, "zidaishu");
            return (Criteria) this;
        }

        public Criteria andZidaishuLessThan(Integer value) {
            addCriterion("ZIDAISHU <", value, "zidaishu");
            return (Criteria) this;
        }

        public Criteria andZidaishuLessThanOrEqualTo(Integer value) {
            addCriterion("ZIDAISHU <=", value, "zidaishu");
            return (Criteria) this;
        }

        public Criteria andZidaishuIn(List<Integer> values) {
            addCriterion("ZIDAISHU in", values, "zidaishu");
            return (Criteria) this;
        }

        public Criteria andZidaishuNotIn(List<Integer> values) {
            addCriterion("ZIDAISHU not in", values, "zidaishu");
            return (Criteria) this;
        }

        public Criteria andZidaishuBetween(Integer value1, Integer value2) {
            addCriterion("ZIDAISHU between", value1, value2, "zidaishu");
            return (Criteria) this;
        }

        public Criteria andZidaishuNotBetween(Integer value1, Integer value2) {
            addCriterion("ZIDAISHU not between", value1, value2, "zidaishu");
            return (Criteria) this;
        }

        public Criteria andCanjiaIsNull() {
            addCriterion("CANJIA is null");
            return (Criteria) this;
        }

        public Criteria andCanjiaIsNotNull() {
            addCriterion("CANJIA is not null");
            return (Criteria) this;
        }

        public Criteria andCanjiaEqualTo(String value) {
            addCriterion("CANJIA =", value, "canjia");
            return (Criteria) this;
        }

        public Criteria andCanjiaNotEqualTo(String value) {
            addCriterion("CANJIA <>", value, "canjia");
            return (Criteria) this;
        }

        public Criteria andCanjiaGreaterThan(String value) {
            addCriterion("CANJIA >", value, "canjia");
            return (Criteria) this;
        }

        public Criteria andCanjiaGreaterThanOrEqualTo(String value) {
            addCriterion("CANJIA >=", value, "canjia");
            return (Criteria) this;
        }

        public Criteria andCanjiaLessThan(String value) {
            addCriterion("CANJIA <", value, "canjia");
            return (Criteria) this;
        }

        public Criteria andCanjiaLessThanOrEqualTo(String value) {
            addCriterion("CANJIA <=", value, "canjia");
            return (Criteria) this;
        }

        public Criteria andCanjiaLike(String value) {
            addCriterion("CANJIA like", value, "canjia");
            return (Criteria) this;
        }

        public Criteria andCanjiaNotLike(String value) {
            addCriterion("CANJIA not like", value, "canjia");
            return (Criteria) this;
        }

        public Criteria andCanjiaIn(List<String> values) {
            addCriterion("CANJIA in", values, "canjia");
            return (Criteria) this;
        }

        public Criteria andCanjiaNotIn(List<String> values) {
            addCriterion("CANJIA not in", values, "canjia");
            return (Criteria) this;
        }

        public Criteria andCanjiaBetween(String value1, String value2) {
            addCriterion("CANJIA between", value1, value2, "canjia");
            return (Criteria) this;
        }

        public Criteria andCanjiaNotBetween(String value1, String value2) {
            addCriterion("CANJIA not between", value1, value2, "canjia");
            return (Criteria) this;
        }

        public Criteria andBucanjiaIsNull() {
            addCriterion("BUCANJIA is null");
            return (Criteria) this;
        }

        public Criteria andBucanjiaIsNotNull() {
            addCriterion("BUCANJIA is not null");
            return (Criteria) this;
        }

        public Criteria andBucanjiaEqualTo(String value) {
            addCriterion("BUCANJIA =", value, "bucanjia");
            return (Criteria) this;
        }

        public Criteria andBucanjiaNotEqualTo(String value) {
            addCriterion("BUCANJIA <>", value, "bucanjia");
            return (Criteria) this;
        }

        public Criteria andBucanjiaGreaterThan(String value) {
            addCriterion("BUCANJIA >", value, "bucanjia");
            return (Criteria) this;
        }

        public Criteria andBucanjiaGreaterThanOrEqualTo(String value) {
            addCriterion("BUCANJIA >=", value, "bucanjia");
            return (Criteria) this;
        }

        public Criteria andBucanjiaLessThan(String value) {
            addCriterion("BUCANJIA <", value, "bucanjia");
            return (Criteria) this;
        }

        public Criteria andBucanjiaLessThanOrEqualTo(String value) {
            addCriterion("BUCANJIA <=", value, "bucanjia");
            return (Criteria) this;
        }

        public Criteria andBucanjiaLike(String value) {
            addCriterion("BUCANJIA like", value, "bucanjia");
            return (Criteria) this;
        }

        public Criteria andBucanjiaNotLike(String value) {
            addCriterion("BUCANJIA not like", value, "bucanjia");
            return (Criteria) this;
        }

        public Criteria andBucanjiaIn(List<String> values) {
            addCriterion("BUCANJIA in", values, "bucanjia");
            return (Criteria) this;
        }

        public Criteria andBucanjiaNotIn(List<String> values) {
            addCriterion("BUCANJIA not in", values, "bucanjia");
            return (Criteria) this;
        }

        public Criteria andBucanjiaBetween(String value1, String value2) {
            addCriterion("BUCANJIA between", value1, value2, "bucanjia");
            return (Criteria) this;
        }

        public Criteria andBucanjiaNotBetween(String value1, String value2) {
            addCriterion("BUCANJIA not between", value1, value2, "bucanjia");
            return (Criteria) this;
        }

        public Criteria andWeijianyuanyinIsNull() {
            addCriterion("WEIJIANYUANYIN is null");
            return (Criteria) this;
        }

        public Criteria andWeijianyuanyinIsNotNull() {
            addCriterion("WEIJIANYUANYIN is not null");
            return (Criteria) this;
        }

        public Criteria andWeijianyuanyinEqualTo(String value) {
            addCriterion("WEIJIANYUANYIN =", value, "weijianyuanyin");
            return (Criteria) this;
        }

        public Criteria andWeijianyuanyinNotEqualTo(String value) {
            addCriterion("WEIJIANYUANYIN <>", value, "weijianyuanyin");
            return (Criteria) this;
        }

        public Criteria andWeijianyuanyinGreaterThan(String value) {
            addCriterion("WEIJIANYUANYIN >", value, "weijianyuanyin");
            return (Criteria) this;
        }

        public Criteria andWeijianyuanyinGreaterThanOrEqualTo(String value) {
            addCriterion("WEIJIANYUANYIN >=", value, "weijianyuanyin");
            return (Criteria) this;
        }

        public Criteria andWeijianyuanyinLessThan(String value) {
            addCriterion("WEIJIANYUANYIN <", value, "weijianyuanyin");
            return (Criteria) this;
        }

        public Criteria andWeijianyuanyinLessThanOrEqualTo(String value) {
            addCriterion("WEIJIANYUANYIN <=", value, "weijianyuanyin");
            return (Criteria) this;
        }

        public Criteria andWeijianyuanyinLike(String value) {
            addCriterion("WEIJIANYUANYIN like", value, "weijianyuanyin");
            return (Criteria) this;
        }

        public Criteria andWeijianyuanyinNotLike(String value) {
            addCriterion("WEIJIANYUANYIN not like", value, "weijianyuanyin");
            return (Criteria) this;
        }

        public Criteria andWeijianyuanyinIn(List<String> values) {
            addCriterion("WEIJIANYUANYIN in", values, "weijianyuanyin");
            return (Criteria) this;
        }

        public Criteria andWeijianyuanyinNotIn(List<String> values) {
            addCriterion("WEIJIANYUANYIN not in", values, "weijianyuanyin");
            return (Criteria) this;
        }

        public Criteria andWeijianyuanyinBetween(String value1, String value2) {
            addCriterion("WEIJIANYUANYIN between", value1, value2, "weijianyuanyin");
            return (Criteria) this;
        }

        public Criteria andWeijianyuanyinNotBetween(String value1, String value2) {
            addCriterion("WEIJIANYUANYIN not between", value1, value2, "weijianyuanyin");
            return (Criteria) this;
        }

        public Criteria andHuodongchangsuoIsNull() {
            addCriterion("HUODONGCHANGSUO is null");
            return (Criteria) this;
        }

        public Criteria andHuodongchangsuoIsNotNull() {
            addCriterion("HUODONGCHANGSUO is not null");
            return (Criteria) this;
        }

        public Criteria andHuodongchangsuoEqualTo(String value) {
            addCriterion("HUODONGCHANGSUO =", value, "huodongchangsuo");
            return (Criteria) this;
        }

        public Criteria andHuodongchangsuoNotEqualTo(String value) {
            addCriterion("HUODONGCHANGSUO <>", value, "huodongchangsuo");
            return (Criteria) this;
        }

        public Criteria andHuodongchangsuoGreaterThan(String value) {
            addCriterion("HUODONGCHANGSUO >", value, "huodongchangsuo");
            return (Criteria) this;
        }

        public Criteria andHuodongchangsuoGreaterThanOrEqualTo(String value) {
            addCriterion("HUODONGCHANGSUO >=", value, "huodongchangsuo");
            return (Criteria) this;
        }

        public Criteria andHuodongchangsuoLessThan(String value) {
            addCriterion("HUODONGCHANGSUO <", value, "huodongchangsuo");
            return (Criteria) this;
        }

        public Criteria andHuodongchangsuoLessThanOrEqualTo(String value) {
            addCriterion("HUODONGCHANGSUO <=", value, "huodongchangsuo");
            return (Criteria) this;
        }

        public Criteria andHuodongchangsuoLike(String value) {
            addCriterion("HUODONGCHANGSUO like", value, "huodongchangsuo");
            return (Criteria) this;
        }

        public Criteria andHuodongchangsuoNotLike(String value) {
            addCriterion("HUODONGCHANGSUO not like", value, "huodongchangsuo");
            return (Criteria) this;
        }

        public Criteria andHuodongchangsuoIn(List<String> values) {
            addCriterion("HUODONGCHANGSUO in", values, "huodongchangsuo");
            return (Criteria) this;
        }

        public Criteria andHuodongchangsuoNotIn(List<String> values) {
            addCriterion("HUODONGCHANGSUO not in", values, "huodongchangsuo");
            return (Criteria) this;
        }

        public Criteria andHuodongchangsuoBetween(String value1, String value2) {
            addCriterion("HUODONGCHANGSUO between", value1, value2, "huodongchangsuo");
            return (Criteria) this;
        }

        public Criteria andHuodongchangsuoNotBetween(String value1, String value2) {
            addCriterion("HUODONGCHANGSUO not between", value1, value2, "huodongchangsuo");
            return (Criteria) this;
        }

        public Criteria andHuodongjingfeiIsNull() {
            addCriterion("HUODONGJINGFEI is null");
            return (Criteria) this;
        }

        public Criteria andHuodongjingfeiIsNotNull() {
            addCriterion("HUODONGJINGFEI is not null");
            return (Criteria) this;
        }

        public Criteria andHuodongjingfeiEqualTo(String value) {
            addCriterion("HUODONGJINGFEI =", value, "huodongjingfei");
            return (Criteria) this;
        }

        public Criteria andHuodongjingfeiNotEqualTo(String value) {
            addCriterion("HUODONGJINGFEI <>", value, "huodongjingfei");
            return (Criteria) this;
        }

        public Criteria andHuodongjingfeiGreaterThan(String value) {
            addCriterion("HUODONGJINGFEI >", value, "huodongjingfei");
            return (Criteria) this;
        }

        public Criteria andHuodongjingfeiGreaterThanOrEqualTo(String value) {
            addCriterion("HUODONGJINGFEI >=", value, "huodongjingfei");
            return (Criteria) this;
        }

        public Criteria andHuodongjingfeiLessThan(String value) {
            addCriterion("HUODONGJINGFEI <", value, "huodongjingfei");
            return (Criteria) this;
        }

        public Criteria andHuodongjingfeiLessThanOrEqualTo(String value) {
            addCriterion("HUODONGJINGFEI <=", value, "huodongjingfei");
            return (Criteria) this;
        }

        public Criteria andHuodongjingfeiLike(String value) {
            addCriterion("HUODONGJINGFEI like", value, "huodongjingfei");
            return (Criteria) this;
        }

        public Criteria andHuodongjingfeiNotLike(String value) {
            addCriterion("HUODONGJINGFEI not like", value, "huodongjingfei");
            return (Criteria) this;
        }

        public Criteria andHuodongjingfeiIn(List<String> values) {
            addCriterion("HUODONGJINGFEI in", values, "huodongjingfei");
            return (Criteria) this;
        }

        public Criteria andHuodongjingfeiNotIn(List<String> values) {
            addCriterion("HUODONGJINGFEI not in", values, "huodongjingfei");
            return (Criteria) this;
        }

        public Criteria andHuodongjingfeiBetween(String value1, String value2) {
            addCriterion("HUODONGJINGFEI between", value1, value2, "huodongjingfei");
            return (Criteria) this;
        }

        public Criteria andHuodongjingfeiNotBetween(String value1, String value2) {
            addCriterion("HUODONGJINGFEI not between", value1, value2, "huodongjingfei");
            return (Criteria) this;
        }

        public Criteria andJingfeilaiyuanIsNull() {
            addCriterion("JINGFEILAIYUAN is null");
            return (Criteria) this;
        }

        public Criteria andJingfeilaiyuanIsNotNull() {
            addCriterion("JINGFEILAIYUAN is not null");
            return (Criteria) this;
        }

        public Criteria andJingfeilaiyuanEqualTo(String value) {
            addCriterion("JINGFEILAIYUAN =", value, "jingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andJingfeilaiyuanNotEqualTo(String value) {
            addCriterion("JINGFEILAIYUAN <>", value, "jingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andJingfeilaiyuanGreaterThan(String value) {
            addCriterion("JINGFEILAIYUAN >", value, "jingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andJingfeilaiyuanGreaterThanOrEqualTo(String value) {
            addCriterion("JINGFEILAIYUAN >=", value, "jingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andJingfeilaiyuanLessThan(String value) {
            addCriterion("JINGFEILAIYUAN <", value, "jingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andJingfeilaiyuanLessThanOrEqualTo(String value) {
            addCriterion("JINGFEILAIYUAN <=", value, "jingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andJingfeilaiyuanLike(String value) {
            addCriterion("JINGFEILAIYUAN like", value, "jingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andJingfeilaiyuanNotLike(String value) {
            addCriterion("JINGFEILAIYUAN not like", value, "jingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andJingfeilaiyuanIn(List<String> values) {
            addCriterion("JINGFEILAIYUAN in", values, "jingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andJingfeilaiyuanNotIn(List<String> values) {
            addCriterion("JINGFEILAIYUAN not in", values, "jingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andJingfeilaiyuanBetween(String value1, String value2) {
            addCriterion("JINGFEILAIYUAN between", value1, value2, "jingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andJingfeilaiyuanNotBetween(String value1, String value2) {
            addCriterion("JINGFEILAIYUAN not between", value1, value2, "jingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andFazhandangyuanIsNull() {
            addCriterion("FAZHANDANGYUAN is null");
            return (Criteria) this;
        }

        public Criteria andFazhandangyuanIsNotNull() {
            addCriterion("FAZHANDANGYUAN is not null");
            return (Criteria) this;
        }

        public Criteria andFazhandangyuanEqualTo(String value) {
            addCriterion("FAZHANDANGYUAN =", value, "fazhandangyuan");
            return (Criteria) this;
        }

        public Criteria andFazhandangyuanNotEqualTo(String value) {
            addCriterion("FAZHANDANGYUAN <>", value, "fazhandangyuan");
            return (Criteria) this;
        }

        public Criteria andFazhandangyuanGreaterThan(String value) {
            addCriterion("FAZHANDANGYUAN >", value, "fazhandangyuan");
            return (Criteria) this;
        }

        public Criteria andFazhandangyuanGreaterThanOrEqualTo(String value) {
            addCriterion("FAZHANDANGYUAN >=", value, "fazhandangyuan");
            return (Criteria) this;
        }

        public Criteria andFazhandangyuanLessThan(String value) {
            addCriterion("FAZHANDANGYUAN <", value, "fazhandangyuan");
            return (Criteria) this;
        }

        public Criteria andFazhandangyuanLessThanOrEqualTo(String value) {
            addCriterion("FAZHANDANGYUAN <=", value, "fazhandangyuan");
            return (Criteria) this;
        }

        public Criteria andFazhandangyuanLike(String value) {
            addCriterion("FAZHANDANGYUAN like", value, "fazhandangyuan");
            return (Criteria) this;
        }

        public Criteria andFazhandangyuanNotLike(String value) {
            addCriterion("FAZHANDANGYUAN not like", value, "fazhandangyuan");
            return (Criteria) this;
        }

        public Criteria andFazhandangyuanIn(List<String> values) {
            addCriterion("FAZHANDANGYUAN in", values, "fazhandangyuan");
            return (Criteria) this;
        }

        public Criteria andFazhandangyuanNotIn(List<String> values) {
            addCriterion("FAZHANDANGYUAN not in", values, "fazhandangyuan");
            return (Criteria) this;
        }

        public Criteria andFazhandangyuanBetween(String value1, String value2) {
            addCriterion("FAZHANDANGYUAN between", value1, value2, "fazhandangyuan");
            return (Criteria) this;
        }

        public Criteria andFazhandangyuanNotBetween(String value1, String value2) {
            addCriterion("FAZHANDANGYUAN not between", value1, value2, "fazhandangyuan");
            return (Criteria) this;
        }

        public Criteria andDanghuishuIsNull() {
            addCriterion("DANGHUISHU is null");
            return (Criteria) this;
        }

        public Criteria andDanghuishuIsNotNull() {
            addCriterion("DANGHUISHU is not null");
            return (Criteria) this;
        }

        public Criteria andDanghuishuEqualTo(Integer value) {
            addCriterion("DANGHUISHU =", value, "danghuishu");
            return (Criteria) this;
        }

        public Criteria andDanghuishuNotEqualTo(Integer value) {
            addCriterion("DANGHUISHU <>", value, "danghuishu");
            return (Criteria) this;
        }

        public Criteria andDanghuishuGreaterThan(Integer value) {
            addCriterion("DANGHUISHU >", value, "danghuishu");
            return (Criteria) this;
        }

        public Criteria andDanghuishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("DANGHUISHU >=", value, "danghuishu");
            return (Criteria) this;
        }

        public Criteria andDanghuishuLessThan(Integer value) {
            addCriterion("DANGHUISHU <", value, "danghuishu");
            return (Criteria) this;
        }

        public Criteria andDanghuishuLessThanOrEqualTo(Integer value) {
            addCriterion("DANGHUISHU <=", value, "danghuishu");
            return (Criteria) this;
        }

        public Criteria andDanghuishuIn(List<Integer> values) {
            addCriterion("DANGHUISHU in", values, "danghuishu");
            return (Criteria) this;
        }

        public Criteria andDanghuishuNotIn(List<Integer> values) {
            addCriterion("DANGHUISHU not in", values, "danghuishu");
            return (Criteria) this;
        }

        public Criteria andDanghuishuBetween(Integer value1, Integer value2) {
            addCriterion("DANGHUISHU between", value1, value2, "danghuishu");
            return (Criteria) this;
        }

        public Criteria andDanghuishuNotBetween(Integer value1, Integer value2) {
            addCriterion("DANGHUISHU not between", value1, value2, "danghuishu");
            return (Criteria) this;
        }

        public Criteria andZhihuishuIsNull() {
            addCriterion("ZHIHUISHU is null");
            return (Criteria) this;
        }

        public Criteria andZhihuishuIsNotNull() {
            addCriterion("ZHIHUISHU is not null");
            return (Criteria) this;
        }

        public Criteria andZhihuishuEqualTo(Integer value) {
            addCriterion("ZHIHUISHU =", value, "zhihuishu");
            return (Criteria) this;
        }

        public Criteria andZhihuishuNotEqualTo(Integer value) {
            addCriterion("ZHIHUISHU <>", value, "zhihuishu");
            return (Criteria) this;
        }

        public Criteria andZhihuishuGreaterThan(Integer value) {
            addCriterion("ZHIHUISHU >", value, "zhihuishu");
            return (Criteria) this;
        }

        public Criteria andZhihuishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZHIHUISHU >=", value, "zhihuishu");
            return (Criteria) this;
        }

        public Criteria andZhihuishuLessThan(Integer value) {
            addCriterion("ZHIHUISHU <", value, "zhihuishu");
            return (Criteria) this;
        }

        public Criteria andZhihuishuLessThanOrEqualTo(Integer value) {
            addCriterion("ZHIHUISHU <=", value, "zhihuishu");
            return (Criteria) this;
        }

        public Criteria andZhihuishuIn(List<Integer> values) {
            addCriterion("ZHIHUISHU in", values, "zhihuishu");
            return (Criteria) this;
        }

        public Criteria andZhihuishuNotIn(List<Integer> values) {
            addCriterion("ZHIHUISHU not in", values, "zhihuishu");
            return (Criteria) this;
        }

        public Criteria andZhihuishuBetween(Integer value1, Integer value2) {
            addCriterion("ZHIHUISHU between", value1, value2, "zhihuishu");
            return (Criteria) this;
        }

        public Criteria andZhihuishuNotBetween(Integer value1, Integer value2) {
            addCriterion("ZHIHUISHU not between", value1, value2, "zhihuishu");
            return (Criteria) this;
        }

        public Criteria andMinhuishuIsNull() {
            addCriterion("MINHUISHU is null");
            return (Criteria) this;
        }

        public Criteria andMinhuishuIsNotNull() {
            addCriterion("MINHUISHU is not null");
            return (Criteria) this;
        }

        public Criteria andMinhuishuEqualTo(Integer value) {
            addCriterion("MINHUISHU =", value, "minhuishu");
            return (Criteria) this;
        }

        public Criteria andMinhuishuNotEqualTo(Integer value) {
            addCriterion("MINHUISHU <>", value, "minhuishu");
            return (Criteria) this;
        }

        public Criteria andMinhuishuGreaterThan(Integer value) {
            addCriterion("MINHUISHU >", value, "minhuishu");
            return (Criteria) this;
        }

        public Criteria andMinhuishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("MINHUISHU >=", value, "minhuishu");
            return (Criteria) this;
        }

        public Criteria andMinhuishuLessThan(Integer value) {
            addCriterion("MINHUISHU <", value, "minhuishu");
            return (Criteria) this;
        }

        public Criteria andMinhuishuLessThanOrEqualTo(Integer value) {
            addCriterion("MINHUISHU <=", value, "minhuishu");
            return (Criteria) this;
        }

        public Criteria andMinhuishuIn(List<Integer> values) {
            addCriterion("MINHUISHU in", values, "minhuishu");
            return (Criteria) this;
        }

        public Criteria andMinhuishuNotIn(List<Integer> values) {
            addCriterion("MINHUISHU not in", values, "minhuishu");
            return (Criteria) this;
        }

        public Criteria andMinhuishuBetween(Integer value1, Integer value2) {
            addCriterion("MINHUISHU between", value1, value2, "minhuishu");
            return (Criteria) this;
        }

        public Criteria andMinhuishuNotBetween(Integer value1, Integer value2) {
            addCriterion("MINHUISHU not between", value1, value2, "minhuishu");
            return (Criteria) this;
        }

        public Criteria andDangkeshuIsNull() {
            addCriterion("DANGKESHU is null");
            return (Criteria) this;
        }

        public Criteria andDangkeshuIsNotNull() {
            addCriterion("DANGKESHU is not null");
            return (Criteria) this;
        }

        public Criteria andDangkeshuEqualTo(Integer value) {
            addCriterion("DANGKESHU =", value, "dangkeshu");
            return (Criteria) this;
        }

        public Criteria andDangkeshuNotEqualTo(Integer value) {
            addCriterion("DANGKESHU <>", value, "dangkeshu");
            return (Criteria) this;
        }

        public Criteria andDangkeshuGreaterThan(Integer value) {
            addCriterion("DANGKESHU >", value, "dangkeshu");
            return (Criteria) this;
        }

        public Criteria andDangkeshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("DANGKESHU >=", value, "dangkeshu");
            return (Criteria) this;
        }

        public Criteria andDangkeshuLessThan(Integer value) {
            addCriterion("DANGKESHU <", value, "dangkeshu");
            return (Criteria) this;
        }

        public Criteria andDangkeshuLessThanOrEqualTo(Integer value) {
            addCriterion("DANGKESHU <=", value, "dangkeshu");
            return (Criteria) this;
        }

        public Criteria andDangkeshuIn(List<Integer> values) {
            addCriterion("DANGKESHU in", values, "dangkeshu");
            return (Criteria) this;
        }

        public Criteria andDangkeshuNotIn(List<Integer> values) {
            addCriterion("DANGKESHU not in", values, "dangkeshu");
            return (Criteria) this;
        }

        public Criteria andDangkeshuBetween(Integer value1, Integer value2) {
            addCriterion("DANGKESHU between", value1, value2, "dangkeshu");
            return (Criteria) this;
        }

        public Criteria andDangkeshuNotBetween(Integer value1, Integer value2) {
            addCriterion("DANGKESHU not between", value1, value2, "dangkeshu");
            return (Criteria) this;
        }

        public Criteria andDongyuanhui1IsNull() {
            addCriterion("DONGYUANHUI1 is null");
            return (Criteria) this;
        }

        public Criteria andDongyuanhui1IsNotNull() {
            addCriterion("DONGYUANHUI1 is not null");
            return (Criteria) this;
        }

        public Criteria andDongyuanhui1EqualTo(String value) {
            addCriterion("DONGYUANHUI1 =", value, "dongyuanhui1");
            return (Criteria) this;
        }

        public Criteria andDongyuanhui1NotEqualTo(String value) {
            addCriterion("DONGYUANHUI1 <>", value, "dongyuanhui1");
            return (Criteria) this;
        }

        public Criteria andDongyuanhui1GreaterThan(String value) {
            addCriterion("DONGYUANHUI1 >", value, "dongyuanhui1");
            return (Criteria) this;
        }

        public Criteria andDongyuanhui1GreaterThanOrEqualTo(String value) {
            addCriterion("DONGYUANHUI1 >=", value, "dongyuanhui1");
            return (Criteria) this;
        }

        public Criteria andDongyuanhui1LessThan(String value) {
            addCriterion("DONGYUANHUI1 <", value, "dongyuanhui1");
            return (Criteria) this;
        }

        public Criteria andDongyuanhui1LessThanOrEqualTo(String value) {
            addCriterion("DONGYUANHUI1 <=", value, "dongyuanhui1");
            return (Criteria) this;
        }

        public Criteria andDongyuanhui1Like(String value) {
            addCriterion("DONGYUANHUI1 like", value, "dongyuanhui1");
            return (Criteria) this;
        }

        public Criteria andDongyuanhui1NotLike(String value) {
            addCriterion("DONGYUANHUI1 not like", value, "dongyuanhui1");
            return (Criteria) this;
        }

        public Criteria andDongyuanhui1In(List<String> values) {
            addCriterion("DONGYUANHUI1 in", values, "dongyuanhui1");
            return (Criteria) this;
        }

        public Criteria andDongyuanhui1NotIn(List<String> values) {
            addCriterion("DONGYUANHUI1 not in", values, "dongyuanhui1");
            return (Criteria) this;
        }

        public Criteria andDongyuanhui1Between(String value1, String value2) {
            addCriterion("DONGYUANHUI1 between", value1, value2, "dongyuanhui1");
            return (Criteria) this;
        }

        public Criteria andDongyuanhui1NotBetween(String value1, String value2) {
            addCriterion("DONGYUANHUI1 not between", value1, value2, "dongyuanhui1");
            return (Criteria) this;
        }

        public Criteria andDongyuanhui2IsNull() {
            addCriterion("DONGYUANHUI2 is null");
            return (Criteria) this;
        }

        public Criteria andDongyuanhui2IsNotNull() {
            addCriterion("DONGYUANHUI2 is not null");
            return (Criteria) this;
        }

        public Criteria andDongyuanhui2EqualTo(String value) {
            addCriterion("DONGYUANHUI2 =", value, "dongyuanhui2");
            return (Criteria) this;
        }

        public Criteria andDongyuanhui2NotEqualTo(String value) {
            addCriterion("DONGYUANHUI2 <>", value, "dongyuanhui2");
            return (Criteria) this;
        }

        public Criteria andDongyuanhui2GreaterThan(String value) {
            addCriterion("DONGYUANHUI2 >", value, "dongyuanhui2");
            return (Criteria) this;
        }

        public Criteria andDongyuanhui2GreaterThanOrEqualTo(String value) {
            addCriterion("DONGYUANHUI2 >=", value, "dongyuanhui2");
            return (Criteria) this;
        }

        public Criteria andDongyuanhui2LessThan(String value) {
            addCriterion("DONGYUANHUI2 <", value, "dongyuanhui2");
            return (Criteria) this;
        }

        public Criteria andDongyuanhui2LessThanOrEqualTo(String value) {
            addCriterion("DONGYUANHUI2 <=", value, "dongyuanhui2");
            return (Criteria) this;
        }

        public Criteria andDongyuanhui2Like(String value) {
            addCriterion("DONGYUANHUI2 like", value, "dongyuanhui2");
            return (Criteria) this;
        }

        public Criteria andDongyuanhui2NotLike(String value) {
            addCriterion("DONGYUANHUI2 not like", value, "dongyuanhui2");
            return (Criteria) this;
        }

        public Criteria andDongyuanhui2In(List<String> values) {
            addCriterion("DONGYUANHUI2 in", values, "dongyuanhui2");
            return (Criteria) this;
        }

        public Criteria andDongyuanhui2NotIn(List<String> values) {
            addCriterion("DONGYUANHUI2 not in", values, "dongyuanhui2");
            return (Criteria) this;
        }

        public Criteria andDongyuanhui2Between(String value1, String value2) {
            addCriterion("DONGYUANHUI2 between", value1, value2, "dongyuanhui2");
            return (Criteria) this;
        }

        public Criteria andDongyuanhui2NotBetween(String value1, String value2) {
            addCriterion("DONGYUANHUI2 not between", value1, value2, "dongyuanhui2");
            return (Criteria) this;
        }

        public Criteria andKaizhanshuIsNull() {
            addCriterion("KAIZHANSHU is null");
            return (Criteria) this;
        }

        public Criteria andKaizhanshuIsNotNull() {
            addCriterion("KAIZHANSHU is not null");
            return (Criteria) this;
        }

        public Criteria andKaizhanshuEqualTo(Integer value) {
            addCriterion("KAIZHANSHU =", value, "kaizhanshu");
            return (Criteria) this;
        }

        public Criteria andKaizhanshuNotEqualTo(Integer value) {
            addCriterion("KAIZHANSHU <>", value, "kaizhanshu");
            return (Criteria) this;
        }

        public Criteria andKaizhanshuGreaterThan(Integer value) {
            addCriterion("KAIZHANSHU >", value, "kaizhanshu");
            return (Criteria) this;
        }

        public Criteria andKaizhanshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("KAIZHANSHU >=", value, "kaizhanshu");
            return (Criteria) this;
        }

        public Criteria andKaizhanshuLessThan(Integer value) {
            addCriterion("KAIZHANSHU <", value, "kaizhanshu");
            return (Criteria) this;
        }

        public Criteria andKaizhanshuLessThanOrEqualTo(Integer value) {
            addCriterion("KAIZHANSHU <=", value, "kaizhanshu");
            return (Criteria) this;
        }

        public Criteria andKaizhanshuIn(List<Integer> values) {
            addCriterion("KAIZHANSHU in", values, "kaizhanshu");
            return (Criteria) this;
        }

        public Criteria andKaizhanshuNotIn(List<Integer> values) {
            addCriterion("KAIZHANSHU not in", values, "kaizhanshu");
            return (Criteria) this;
        }

        public Criteria andKaizhanshuBetween(Integer value1, Integer value2) {
            addCriterion("KAIZHANSHU between", value1, value2, "kaizhanshu");
            return (Criteria) this;
        }

        public Criteria andKaizhanshuNotBetween(Integer value1, Integer value2) {
            addCriterion("KAIZHANSHU not between", value1, value2, "kaizhanshu");
            return (Criteria) this;
        }

        public Criteria andHuodongzaitiIsNull() {
            addCriterion("HUODONGZAITI is null");
            return (Criteria) this;
        }

        public Criteria andHuodongzaitiIsNotNull() {
            addCriterion("HUODONGZAITI is not null");
            return (Criteria) this;
        }

        public Criteria andHuodongzaitiEqualTo(String value) {
            addCriterion("HUODONGZAITI =", value, "huodongzaiti");
            return (Criteria) this;
        }

        public Criteria andHuodongzaitiNotEqualTo(String value) {
            addCriterion("HUODONGZAITI <>", value, "huodongzaiti");
            return (Criteria) this;
        }

        public Criteria andHuodongzaitiGreaterThan(String value) {
            addCriterion("HUODONGZAITI >", value, "huodongzaiti");
            return (Criteria) this;
        }

        public Criteria andHuodongzaitiGreaterThanOrEqualTo(String value) {
            addCriterion("HUODONGZAITI >=", value, "huodongzaiti");
            return (Criteria) this;
        }

        public Criteria andHuodongzaitiLessThan(String value) {
            addCriterion("HUODONGZAITI <", value, "huodongzaiti");
            return (Criteria) this;
        }

        public Criteria andHuodongzaitiLessThanOrEqualTo(String value) {
            addCriterion("HUODONGZAITI <=", value, "huodongzaiti");
            return (Criteria) this;
        }

        public Criteria andHuodongzaitiLike(String value) {
            addCriterion("HUODONGZAITI like", value, "huodongzaiti");
            return (Criteria) this;
        }

        public Criteria andHuodongzaitiNotLike(String value) {
            addCriterion("HUODONGZAITI not like", value, "huodongzaiti");
            return (Criteria) this;
        }

        public Criteria andHuodongzaitiIn(List<String> values) {
            addCriterion("HUODONGZAITI in", values, "huodongzaiti");
            return (Criteria) this;
        }

        public Criteria andHuodongzaitiNotIn(List<String> values) {
            addCriterion("HUODONGZAITI not in", values, "huodongzaiti");
            return (Criteria) this;
        }

        public Criteria andHuodongzaitiBetween(String value1, String value2) {
            addCriterion("HUODONGZAITI between", value1, value2, "huodongzaiti");
            return (Criteria) this;
        }

        public Criteria andHuodongzaitiNotBetween(String value1, String value2) {
            addCriterion("HUODONGZAITI not between", value1, value2, "huodongzaiti");
            return (Criteria) this;
        }

        public Criteria andWanchengzhuangtaiIsNull() {
            addCriterion("WANCHENGZHUANGTAI is null");
            return (Criteria) this;
        }

        public Criteria andWanchengzhuangtaiIsNotNull() {
            addCriterion("WANCHENGZHUANGTAI is not null");
            return (Criteria) this;
        }

        public Criteria andWanchengzhuangtaiEqualTo(String value) {
            addCriterion("WANCHENGZHUANGTAI =", value, "wanchengzhuangtai");
            return (Criteria) this;
        }

        public Criteria andWanchengzhuangtaiNotEqualTo(String value) {
            addCriterion("WANCHENGZHUANGTAI <>", value, "wanchengzhuangtai");
            return (Criteria) this;
        }

        public Criteria andWanchengzhuangtaiGreaterThan(String value) {
            addCriterion("WANCHENGZHUANGTAI >", value, "wanchengzhuangtai");
            return (Criteria) this;
        }

        public Criteria andWanchengzhuangtaiGreaterThanOrEqualTo(String value) {
            addCriterion("WANCHENGZHUANGTAI >=", value, "wanchengzhuangtai");
            return (Criteria) this;
        }

        public Criteria andWanchengzhuangtaiLessThan(String value) {
            addCriterion("WANCHENGZHUANGTAI <", value, "wanchengzhuangtai");
            return (Criteria) this;
        }

        public Criteria andWanchengzhuangtaiLessThanOrEqualTo(String value) {
            addCriterion("WANCHENGZHUANGTAI <=", value, "wanchengzhuangtai");
            return (Criteria) this;
        }

        public Criteria andWanchengzhuangtaiLike(String value) {
            addCriterion("WANCHENGZHUANGTAI like", value, "wanchengzhuangtai");
            return (Criteria) this;
        }

        public Criteria andWanchengzhuangtaiNotLike(String value) {
            addCriterion("WANCHENGZHUANGTAI not like", value, "wanchengzhuangtai");
            return (Criteria) this;
        }

        public Criteria andWanchengzhuangtaiIn(List<String> values) {
            addCriterion("WANCHENGZHUANGTAI in", values, "wanchengzhuangtai");
            return (Criteria) this;
        }

        public Criteria andWanchengzhuangtaiNotIn(List<String> values) {
            addCriterion("WANCHENGZHUANGTAI not in", values, "wanchengzhuangtai");
            return (Criteria) this;
        }

        public Criteria andWanchengzhuangtaiBetween(String value1, String value2) {
            addCriterion("WANCHENGZHUANGTAI between", value1, value2, "wanchengzhuangtai");
            return (Criteria) this;
        }

        public Criteria andWanchengzhuangtaiNotBetween(String value1, String value2) {
            addCriterion("WANCHENGZHUANGTAI not between", value1, value2, "wanchengzhuangtai");
            return (Criteria) this;
        }

        public Criteria andJianfushuIsNull() {
            addCriterion("JIANFUSHU is null");
            return (Criteria) this;
        }

        public Criteria andJianfushuIsNotNull() {
            addCriterion("JIANFUSHU is not null");
            return (Criteria) this;
        }

        public Criteria andJianfushuEqualTo(Integer value) {
            addCriterion("JIANFUSHU =", value, "jianfushu");
            return (Criteria) this;
        }

        public Criteria andJianfushuNotEqualTo(Integer value) {
            addCriterion("JIANFUSHU <>", value, "jianfushu");
            return (Criteria) this;
        }

        public Criteria andJianfushuGreaterThan(Integer value) {
            addCriterion("JIANFUSHU >", value, "jianfushu");
            return (Criteria) this;
        }

        public Criteria andJianfushuGreaterThanOrEqualTo(Integer value) {
            addCriterion("JIANFUSHU >=", value, "jianfushu");
            return (Criteria) this;
        }

        public Criteria andJianfushuLessThan(Integer value) {
            addCriterion("JIANFUSHU <", value, "jianfushu");
            return (Criteria) this;
        }

        public Criteria andJianfushuLessThanOrEqualTo(Integer value) {
            addCriterion("JIANFUSHU <=", value, "jianfushu");
            return (Criteria) this;
        }

        public Criteria andJianfushuIn(List<Integer> values) {
            addCriterion("JIANFUSHU in", values, "jianfushu");
            return (Criteria) this;
        }

        public Criteria andJianfushuNotIn(List<Integer> values) {
            addCriterion("JIANFUSHU not in", values, "jianfushu");
            return (Criteria) this;
        }

        public Criteria andJianfushuBetween(Integer value1, Integer value2) {
            addCriterion("JIANFUSHU between", value1, value2, "jianfushu");
            return (Criteria) this;
        }

        public Criteria andJianfushuNotBetween(Integer value1, Integer value2) {
            addCriterion("JIANFUSHU not between", value1, value2, "jianfushu");
            return (Criteria) this;
        }

        public Criteria andJiedangshuIsNull() {
            addCriterion("JIEDANGSHU is null");
            return (Criteria) this;
        }

        public Criteria andJiedangshuIsNotNull() {
            addCriterion("JIEDANGSHU is not null");
            return (Criteria) this;
        }

        public Criteria andJiedangshuEqualTo(Integer value) {
            addCriterion("JIEDANGSHU =", value, "jiedangshu");
            return (Criteria) this;
        }

        public Criteria andJiedangshuNotEqualTo(Integer value) {
            addCriterion("JIEDANGSHU <>", value, "jiedangshu");
            return (Criteria) this;
        }

        public Criteria andJiedangshuGreaterThan(Integer value) {
            addCriterion("JIEDANGSHU >", value, "jiedangshu");
            return (Criteria) this;
        }

        public Criteria andJiedangshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("JIEDANGSHU >=", value, "jiedangshu");
            return (Criteria) this;
        }

        public Criteria andJiedangshuLessThan(Integer value) {
            addCriterion("JIEDANGSHU <", value, "jiedangshu");
            return (Criteria) this;
        }

        public Criteria andJiedangshuLessThanOrEqualTo(Integer value) {
            addCriterion("JIEDANGSHU <=", value, "jiedangshu");
            return (Criteria) this;
        }

        public Criteria andJiedangshuIn(List<Integer> values) {
            addCriterion("JIEDANGSHU in", values, "jiedangshu");
            return (Criteria) this;
        }

        public Criteria andJiedangshuNotIn(List<Integer> values) {
            addCriterion("JIEDANGSHU not in", values, "jiedangshu");
            return (Criteria) this;
        }

        public Criteria andJiedangshuBetween(Integer value1, Integer value2) {
            addCriterion("JIEDANGSHU between", value1, value2, "jiedangshu");
            return (Criteria) this;
        }

        public Criteria andJiedangshuNotBetween(Integer value1, Integer value2) {
            addCriterion("JIEDANGSHU not between", value1, value2, "jiedangshu");
            return (Criteria) this;
        }

        public Criteria andFuzerenshu5IsNull() {
            addCriterion("FUZERENSHU5 is null");
            return (Criteria) this;
        }

        public Criteria andFuzerenshu5IsNotNull() {
            addCriterion("FUZERENSHU5 is not null");
            return (Criteria) this;
        }

        public Criteria andFuzerenshu5EqualTo(Integer value) {
            addCriterion("FUZERENSHU5 =", value, "fuzerenshu5");
            return (Criteria) this;
        }

        public Criteria andFuzerenshu5NotEqualTo(Integer value) {
            addCriterion("FUZERENSHU5 <>", value, "fuzerenshu5");
            return (Criteria) this;
        }

        public Criteria andFuzerenshu5GreaterThan(Integer value) {
            addCriterion("FUZERENSHU5 >", value, "fuzerenshu5");
            return (Criteria) this;
        }

        public Criteria andFuzerenshu5GreaterThanOrEqualTo(Integer value) {
            addCriterion("FUZERENSHU5 >=", value, "fuzerenshu5");
            return (Criteria) this;
        }

        public Criteria andFuzerenshu5LessThan(Integer value) {
            addCriterion("FUZERENSHU5 <", value, "fuzerenshu5");
            return (Criteria) this;
        }

        public Criteria andFuzerenshu5LessThanOrEqualTo(Integer value) {
            addCriterion("FUZERENSHU5 <=", value, "fuzerenshu5");
            return (Criteria) this;
        }

        public Criteria andFuzerenshu5In(List<Integer> values) {
            addCriterion("FUZERENSHU5 in", values, "fuzerenshu5");
            return (Criteria) this;
        }

        public Criteria andFuzerenshu5NotIn(List<Integer> values) {
            addCriterion("FUZERENSHU5 not in", values, "fuzerenshu5");
            return (Criteria) this;
        }

        public Criteria andFuzerenshu5Between(Integer value1, Integer value2) {
            addCriterion("FUZERENSHU5 between", value1, value2, "fuzerenshu5");
            return (Criteria) this;
        }

        public Criteria andFuzerenshu5NotBetween(Integer value1, Integer value2) {
            addCriterion("FUZERENSHU5 not between", value1, value2, "fuzerenshu5");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu5IsNull() {
            addCriterion("RENYUANSHU5 is null");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu5IsNotNull() {
            addCriterion("RENYUANSHU5 is not null");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu5EqualTo(Integer value) {
            addCriterion("RENYUANSHU5 =", value, "renyuanshu5");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu5NotEqualTo(Integer value) {
            addCriterion("RENYUANSHU5 <>", value, "renyuanshu5");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu5GreaterThan(Integer value) {
            addCriterion("RENYUANSHU5 >", value, "renyuanshu5");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu5GreaterThanOrEqualTo(Integer value) {
            addCriterion("RENYUANSHU5 >=", value, "renyuanshu5");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu5LessThan(Integer value) {
            addCriterion("RENYUANSHU5 <", value, "renyuanshu5");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu5LessThanOrEqualTo(Integer value) {
            addCriterion("RENYUANSHU5 <=", value, "renyuanshu5");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu5In(List<Integer> values) {
            addCriterion("RENYUANSHU5 in", values, "renyuanshu5");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu5NotIn(List<Integer> values) {
            addCriterion("RENYUANSHU5 not in", values, "renyuanshu5");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu5Between(Integer value1, Integer value2) {
            addCriterion("RENYUANSHU5 between", value1, value2, "renyuanshu5");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu5NotBetween(Integer value1, Integer value2) {
            addCriterion("RENYUANSHU5 not between", value1, value2, "renyuanshu5");
            return (Criteria) this;
        }

        public Criteria andLidangshuIsNull() {
            addCriterion("LIDANGSHU is null");
            return (Criteria) this;
        }

        public Criteria andLidangshuIsNotNull() {
            addCriterion("LIDANGSHU is not null");
            return (Criteria) this;
        }

        public Criteria andLidangshuEqualTo(Integer value) {
            addCriterion("LIDANGSHU =", value, "lidangshu");
            return (Criteria) this;
        }

        public Criteria andLidangshuNotEqualTo(Integer value) {
            addCriterion("LIDANGSHU <>", value, "lidangshu");
            return (Criteria) this;
        }

        public Criteria andLidangshuGreaterThan(Integer value) {
            addCriterion("LIDANGSHU >", value, "lidangshu");
            return (Criteria) this;
        }

        public Criteria andLidangshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIDANGSHU >=", value, "lidangshu");
            return (Criteria) this;
        }

        public Criteria andLidangshuLessThan(Integer value) {
            addCriterion("LIDANGSHU <", value, "lidangshu");
            return (Criteria) this;
        }

        public Criteria andLidangshuLessThanOrEqualTo(Integer value) {
            addCriterion("LIDANGSHU <=", value, "lidangshu");
            return (Criteria) this;
        }

        public Criteria andLidangshuIn(List<Integer> values) {
            addCriterion("LIDANGSHU in", values, "lidangshu");
            return (Criteria) this;
        }

        public Criteria andLidangshuNotIn(List<Integer> values) {
            addCriterion("LIDANGSHU not in", values, "lidangshu");
            return (Criteria) this;
        }

        public Criteria andLidangshuBetween(Integer value1, Integer value2) {
            addCriterion("LIDANGSHU between", value1, value2, "lidangshu");
            return (Criteria) this;
        }

        public Criteria andLidangshuNotBetween(Integer value1, Integer value2) {
            addCriterion("LIDANGSHU not between", value1, value2, "lidangshu");
            return (Criteria) this;
        }

        public Criteria andFuzerenshu6IsNull() {
            addCriterion("FUZERENSHU6 is null");
            return (Criteria) this;
        }

        public Criteria andFuzerenshu6IsNotNull() {
            addCriterion("FUZERENSHU6 is not null");
            return (Criteria) this;
        }

        public Criteria andFuzerenshu6EqualTo(Integer value) {
            addCriterion("FUZERENSHU6 =", value, "fuzerenshu6");
            return (Criteria) this;
        }

        public Criteria andFuzerenshu6NotEqualTo(Integer value) {
            addCriterion("FUZERENSHU6 <>", value, "fuzerenshu6");
            return (Criteria) this;
        }

        public Criteria andFuzerenshu6GreaterThan(Integer value) {
            addCriterion("FUZERENSHU6 >", value, "fuzerenshu6");
            return (Criteria) this;
        }

        public Criteria andFuzerenshu6GreaterThanOrEqualTo(Integer value) {
            addCriterion("FUZERENSHU6 >=", value, "fuzerenshu6");
            return (Criteria) this;
        }

        public Criteria andFuzerenshu6LessThan(Integer value) {
            addCriterion("FUZERENSHU6 <", value, "fuzerenshu6");
            return (Criteria) this;
        }

        public Criteria andFuzerenshu6LessThanOrEqualTo(Integer value) {
            addCriterion("FUZERENSHU6 <=", value, "fuzerenshu6");
            return (Criteria) this;
        }

        public Criteria andFuzerenshu6In(List<Integer> values) {
            addCriterion("FUZERENSHU6 in", values, "fuzerenshu6");
            return (Criteria) this;
        }

        public Criteria andFuzerenshu6NotIn(List<Integer> values) {
            addCriterion("FUZERENSHU6 not in", values, "fuzerenshu6");
            return (Criteria) this;
        }

        public Criteria andFuzerenshu6Between(Integer value1, Integer value2) {
            addCriterion("FUZERENSHU6 between", value1, value2, "fuzerenshu6");
            return (Criteria) this;
        }

        public Criteria andFuzerenshu6NotBetween(Integer value1, Integer value2) {
            addCriterion("FUZERENSHU6 not between", value1, value2, "fuzerenshu6");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu6IsNull() {
            addCriterion("RENYUANSHU6 is null");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu6IsNotNull() {
            addCriterion("RENYUANSHU6 is not null");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu6EqualTo(Integer value) {
            addCriterion("RENYUANSHU6 =", value, "renyuanshu6");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu6NotEqualTo(Integer value) {
            addCriterion("RENYUANSHU6 <>", value, "renyuanshu6");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu6GreaterThan(Integer value) {
            addCriterion("RENYUANSHU6 >", value, "renyuanshu6");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu6GreaterThanOrEqualTo(Integer value) {
            addCriterion("RENYUANSHU6 >=", value, "renyuanshu6");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu6LessThan(Integer value) {
            addCriterion("RENYUANSHU6 <", value, "renyuanshu6");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu6LessThanOrEqualTo(Integer value) {
            addCriterion("RENYUANSHU6 <=", value, "renyuanshu6");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu6In(List<Integer> values) {
            addCriterion("RENYUANSHU6 in", values, "renyuanshu6");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu6NotIn(List<Integer> values) {
            addCriterion("RENYUANSHU6 not in", values, "renyuanshu6");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu6Between(Integer value1, Integer value2) {
            addCriterion("RENYUANSHU6 between", value1, value2, "renyuanshu6");
            return (Criteria) this;
        }

        public Criteria andRenyuanshu6NotBetween(Integer value1, Integer value2) {
            addCriterion("RENYUANSHU6 not between", value1, value2, "renyuanshu6");
            return (Criteria) this;
        }

        public Criteria andJijinhuiIsNull() {
            addCriterion("JIJINHUI is null");
            return (Criteria) this;
        }

        public Criteria andJijinhuiIsNotNull() {
            addCriterion("JIJINHUI is not null");
            return (Criteria) this;
        }

        public Criteria andJijinhuiEqualTo(Integer value) {
            addCriterion("JIJINHUI =", value, "jijinhui");
            return (Criteria) this;
        }

        public Criteria andJijinhuiNotEqualTo(Integer value) {
            addCriterion("JIJINHUI <>", value, "jijinhui");
            return (Criteria) this;
        }

        public Criteria andJijinhuiGreaterThan(Integer value) {
            addCriterion("JIJINHUI >", value, "jijinhui");
            return (Criteria) this;
        }

        public Criteria andJijinhuiGreaterThanOrEqualTo(Integer value) {
            addCriterion("JIJINHUI >=", value, "jijinhui");
            return (Criteria) this;
        }

        public Criteria andJijinhuiLessThan(Integer value) {
            addCriterion("JIJINHUI <", value, "jijinhui");
            return (Criteria) this;
        }

        public Criteria andJijinhuiLessThanOrEqualTo(Integer value) {
            addCriterion("JIJINHUI <=", value, "jijinhui");
            return (Criteria) this;
        }

        public Criteria andJijinhuiIn(List<Integer> values) {
            addCriterion("JIJINHUI in", values, "jijinhui");
            return (Criteria) this;
        }

        public Criteria andJijinhuiNotIn(List<Integer> values) {
            addCriterion("JIJINHUI not in", values, "jijinhui");
            return (Criteria) this;
        }

        public Criteria andJijinhuiBetween(Integer value1, Integer value2) {
            addCriterion("JIJINHUI between", value1, value2, "jijinhui");
            return (Criteria) this;
        }

        public Criteria andJijinhuiNotBetween(Integer value1, Integer value2) {
            addCriterion("JIJINHUI not between", value1, value2, "jijinhui");
            return (Criteria) this;
        }

        public Criteria andChenglishijianIsNull() {
            addCriterion("CHENGLISHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andChenglishijianIsNotNull() {
            addCriterion("CHENGLISHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andChenglishijianEqualTo(String value) {
            addCriterion("CHENGLISHIJIAN =", value, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andChenglishijianNotEqualTo(String value) {
            addCriterion("CHENGLISHIJIAN <>", value, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andChenglishijianGreaterThan(String value) {
            addCriterion("CHENGLISHIJIAN >", value, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andChenglishijianGreaterThanOrEqualTo(String value) {
            addCriterion("CHENGLISHIJIAN >=", value, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andChenglishijianLessThan(String value) {
            addCriterion("CHENGLISHIJIAN <", value, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andChenglishijianLessThanOrEqualTo(String value) {
            addCriterion("CHENGLISHIJIAN <=", value, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andChenglishijianLike(String value) {
            addCriterion("CHENGLISHIJIAN like", value, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andChenglishijianNotLike(String value) {
            addCriterion("CHENGLISHIJIAN not like", value, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andChenglishijianIn(List<String> values) {
            addCriterion("CHENGLISHIJIAN in", values, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andChenglishijianNotIn(List<String> values) {
            addCriterion("CHENGLISHIJIAN not in", values, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andChenglishijianBetween(String value1, String value2) {
            addCriterion("CHENGLISHIJIAN between", value1, value2, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andChenglishijianNotBetween(String value1, String value2) {
            addCriterion("CHENGLISHIJIAN not between", value1, value2, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andAnqihuanjieIsNull() {
            addCriterion("ANQIHUANJIE is null");
            return (Criteria) this;
        }

        public Criteria andAnqihuanjieIsNotNull() {
            addCriterion("ANQIHUANJIE is not null");
            return (Criteria) this;
        }

        public Criteria andAnqihuanjieEqualTo(String value) {
            addCriterion("ANQIHUANJIE =", value, "anqihuanjie");
            return (Criteria) this;
        }

        public Criteria andAnqihuanjieNotEqualTo(String value) {
            addCriterion("ANQIHUANJIE <>", value, "anqihuanjie");
            return (Criteria) this;
        }

        public Criteria andAnqihuanjieGreaterThan(String value) {
            addCriterion("ANQIHUANJIE >", value, "anqihuanjie");
            return (Criteria) this;
        }

        public Criteria andAnqihuanjieGreaterThanOrEqualTo(String value) {
            addCriterion("ANQIHUANJIE >=", value, "anqihuanjie");
            return (Criteria) this;
        }

        public Criteria andAnqihuanjieLessThan(String value) {
            addCriterion("ANQIHUANJIE <", value, "anqihuanjie");
            return (Criteria) this;
        }

        public Criteria andAnqihuanjieLessThanOrEqualTo(String value) {
            addCriterion("ANQIHUANJIE <=", value, "anqihuanjie");
            return (Criteria) this;
        }

        public Criteria andAnqihuanjieLike(String value) {
            addCriterion("ANQIHUANJIE like", value, "anqihuanjie");
            return (Criteria) this;
        }

        public Criteria andAnqihuanjieNotLike(String value) {
            addCriterion("ANQIHUANJIE not like", value, "anqihuanjie");
            return (Criteria) this;
        }

        public Criteria andAnqihuanjieIn(List<String> values) {
            addCriterion("ANQIHUANJIE in", values, "anqihuanjie");
            return (Criteria) this;
        }

        public Criteria andAnqihuanjieNotIn(List<String> values) {
            addCriterion("ANQIHUANJIE not in", values, "anqihuanjie");
            return (Criteria) this;
        }

        public Criteria andAnqihuanjieBetween(String value1, String value2) {
            addCriterion("ANQIHUANJIE between", value1, value2, "anqihuanjie");
            return (Criteria) this;
        }

        public Criteria andAnqihuanjieNotBetween(String value1, String value2) {
            addCriterion("ANQIHUANJIE not between", value1, value2, "anqihuanjie");
            return (Criteria) this;
        }

        public Criteria andShangjidangzuzhiIsNull() {
            addCriterion("SHANGJIDANGZUZHI is null");
            return (Criteria) this;
        }

        public Criteria andShangjidangzuzhiIsNotNull() {
            addCriterion("SHANGJIDANGZUZHI is not null");
            return (Criteria) this;
        }

        public Criteria andShangjidangzuzhiEqualTo(String value) {
            addCriterion("SHANGJIDANGZUZHI =", value, "shangjidangzuzhi");
            return (Criteria) this;
        }

        public Criteria andShangjidangzuzhiNotEqualTo(String value) {
            addCriterion("SHANGJIDANGZUZHI <>", value, "shangjidangzuzhi");
            return (Criteria) this;
        }

        public Criteria andShangjidangzuzhiGreaterThan(String value) {
            addCriterion("SHANGJIDANGZUZHI >", value, "shangjidangzuzhi");
            return (Criteria) this;
        }

        public Criteria andShangjidangzuzhiGreaterThanOrEqualTo(String value) {
            addCriterion("SHANGJIDANGZUZHI >=", value, "shangjidangzuzhi");
            return (Criteria) this;
        }

        public Criteria andShangjidangzuzhiLessThan(String value) {
            addCriterion("SHANGJIDANGZUZHI <", value, "shangjidangzuzhi");
            return (Criteria) this;
        }

        public Criteria andShangjidangzuzhiLessThanOrEqualTo(String value) {
            addCriterion("SHANGJIDANGZUZHI <=", value, "shangjidangzuzhi");
            return (Criteria) this;
        }

        public Criteria andShangjidangzuzhiLike(String value) {
            addCriterion("SHANGJIDANGZUZHI like", value, "shangjidangzuzhi");
            return (Criteria) this;
        }

        public Criteria andShangjidangzuzhiNotLike(String value) {
            addCriterion("SHANGJIDANGZUZHI not like", value, "shangjidangzuzhi");
            return (Criteria) this;
        }

        public Criteria andShangjidangzuzhiIn(List<String> values) {
            addCriterion("SHANGJIDANGZUZHI in", values, "shangjidangzuzhi");
            return (Criteria) this;
        }

        public Criteria andShangjidangzuzhiNotIn(List<String> values) {
            addCriterion("SHANGJIDANGZUZHI not in", values, "shangjidangzuzhi");
            return (Criteria) this;
        }

        public Criteria andShangjidangzuzhiBetween(String value1, String value2) {
            addCriterion("SHANGJIDANGZUZHI between", value1, value2, "shangjidangzuzhi");
            return (Criteria) this;
        }

        public Criteria andShangjidangzuzhiNotBetween(String value1, String value2) {
            addCriterion("SHANGJIDANGZUZHI not between", value1, value2, "shangjidangzuzhi");
            return (Criteria) this;
        }

        public Criteria andShixiangjueceIsNull() {
            addCriterion("SHIXIANGJUECE is null");
            return (Criteria) this;
        }

        public Criteria andShixiangjueceIsNotNull() {
            addCriterion("SHIXIANGJUECE is not null");
            return (Criteria) this;
        }

        public Criteria andShixiangjueceEqualTo(String value) {
            addCriterion("SHIXIANGJUECE =", value, "shixiangjuece");
            return (Criteria) this;
        }

        public Criteria andShixiangjueceNotEqualTo(String value) {
            addCriterion("SHIXIANGJUECE <>", value, "shixiangjuece");
            return (Criteria) this;
        }

        public Criteria andShixiangjueceGreaterThan(String value) {
            addCriterion("SHIXIANGJUECE >", value, "shixiangjuece");
            return (Criteria) this;
        }

        public Criteria andShixiangjueceGreaterThanOrEqualTo(String value) {
            addCriterion("SHIXIANGJUECE >=", value, "shixiangjuece");
            return (Criteria) this;
        }

        public Criteria andShixiangjueceLessThan(String value) {
            addCriterion("SHIXIANGJUECE <", value, "shixiangjuece");
            return (Criteria) this;
        }

        public Criteria andShixiangjueceLessThanOrEqualTo(String value) {
            addCriterion("SHIXIANGJUECE <=", value, "shixiangjuece");
            return (Criteria) this;
        }

        public Criteria andShixiangjueceLike(String value) {
            addCriterion("SHIXIANGJUECE like", value, "shixiangjuece");
            return (Criteria) this;
        }

        public Criteria andShixiangjueceNotLike(String value) {
            addCriterion("SHIXIANGJUECE not like", value, "shixiangjuece");
            return (Criteria) this;
        }

        public Criteria andShixiangjueceIn(List<String> values) {
            addCriterion("SHIXIANGJUECE in", values, "shixiangjuece");
            return (Criteria) this;
        }

        public Criteria andShixiangjueceNotIn(List<String> values) {
            addCriterion("SHIXIANGJUECE not in", values, "shixiangjuece");
            return (Criteria) this;
        }

        public Criteria andShixiangjueceBetween(String value1, String value2) {
            addCriterion("SHIXIANGJUECE between", value1, value2, "shixiangjuece");
            return (Criteria) this;
        }

        public Criteria andShixiangjueceNotBetween(String value1, String value2) {
            addCriterion("SHIXIANGJUECE not between", value1, value2, "shixiangjuece");
            return (Criteria) this;
        }

        public Criteria andDangjiangongzuopeixunIsNull() {
            addCriterion("DANGJIANGONGZUOPEIXUN is null");
            return (Criteria) this;
        }

        public Criteria andDangjiangongzuopeixunIsNotNull() {
            addCriterion("DANGJIANGONGZUOPEIXUN is not null");
            return (Criteria) this;
        }

        public Criteria andDangjiangongzuopeixunEqualTo(String value) {
            addCriterion("DANGJIANGONGZUOPEIXUN =", value, "dangjiangongzuopeixun");
            return (Criteria) this;
        }

        public Criteria andDangjiangongzuopeixunNotEqualTo(String value) {
            addCriterion("DANGJIANGONGZUOPEIXUN <>", value, "dangjiangongzuopeixun");
            return (Criteria) this;
        }

        public Criteria andDangjiangongzuopeixunGreaterThan(String value) {
            addCriterion("DANGJIANGONGZUOPEIXUN >", value, "dangjiangongzuopeixun");
            return (Criteria) this;
        }

        public Criteria andDangjiangongzuopeixunGreaterThanOrEqualTo(String value) {
            addCriterion("DANGJIANGONGZUOPEIXUN >=", value, "dangjiangongzuopeixun");
            return (Criteria) this;
        }

        public Criteria andDangjiangongzuopeixunLessThan(String value) {
            addCriterion("DANGJIANGONGZUOPEIXUN <", value, "dangjiangongzuopeixun");
            return (Criteria) this;
        }

        public Criteria andDangjiangongzuopeixunLessThanOrEqualTo(String value) {
            addCriterion("DANGJIANGONGZUOPEIXUN <=", value, "dangjiangongzuopeixun");
            return (Criteria) this;
        }

        public Criteria andDangjiangongzuopeixunLike(String value) {
            addCriterion("DANGJIANGONGZUOPEIXUN like", value, "dangjiangongzuopeixun");
            return (Criteria) this;
        }

        public Criteria andDangjiangongzuopeixunNotLike(String value) {
            addCriterion("DANGJIANGONGZUOPEIXUN not like", value, "dangjiangongzuopeixun");
            return (Criteria) this;
        }

        public Criteria andDangjiangongzuopeixunIn(List<String> values) {
            addCriterion("DANGJIANGONGZUOPEIXUN in", values, "dangjiangongzuopeixun");
            return (Criteria) this;
        }

        public Criteria andDangjiangongzuopeixunNotIn(List<String> values) {
            addCriterion("DANGJIANGONGZUOPEIXUN not in", values, "dangjiangongzuopeixun");
            return (Criteria) this;
        }

        public Criteria andDangjiangongzuopeixunBetween(String value1, String value2) {
            addCriterion("DANGJIANGONGZUOPEIXUN between", value1, value2, "dangjiangongzuopeixun");
            return (Criteria) this;
        }

        public Criteria andDangjiangongzuopeixunNotBetween(String value1, String value2) {
            addCriterion("DANGJIANGONGZUOPEIXUN not between", value1, value2, "dangjiangongzuopeixun");
            return (Criteria) this;
        }

        public Criteria andDangjianpeixun1IsNull() {
            addCriterion("DANGJIANPEIXUN1 is null");
            return (Criteria) this;
        }

        public Criteria andDangjianpeixun1IsNotNull() {
            addCriterion("DANGJIANPEIXUN1 is not null");
            return (Criteria) this;
        }

        public Criteria andDangjianpeixun1EqualTo(String value) {
            addCriterion("DANGJIANPEIXUN1 =", value, "dangjianpeixun1");
            return (Criteria) this;
        }

        public Criteria andDangjianpeixun1NotEqualTo(String value) {
            addCriterion("DANGJIANPEIXUN1 <>", value, "dangjianpeixun1");
            return (Criteria) this;
        }

        public Criteria andDangjianpeixun1GreaterThan(String value) {
            addCriterion("DANGJIANPEIXUN1 >", value, "dangjianpeixun1");
            return (Criteria) this;
        }

        public Criteria andDangjianpeixun1GreaterThanOrEqualTo(String value) {
            addCriterion("DANGJIANPEIXUN1 >=", value, "dangjianpeixun1");
            return (Criteria) this;
        }

        public Criteria andDangjianpeixun1LessThan(String value) {
            addCriterion("DANGJIANPEIXUN1 <", value, "dangjianpeixun1");
            return (Criteria) this;
        }

        public Criteria andDangjianpeixun1LessThanOrEqualTo(String value) {
            addCriterion("DANGJIANPEIXUN1 <=", value, "dangjianpeixun1");
            return (Criteria) this;
        }

        public Criteria andDangjianpeixun1Like(String value) {
            addCriterion("DANGJIANPEIXUN1 like", value, "dangjianpeixun1");
            return (Criteria) this;
        }

        public Criteria andDangjianpeixun1NotLike(String value) {
            addCriterion("DANGJIANPEIXUN1 not like", value, "dangjianpeixun1");
            return (Criteria) this;
        }

        public Criteria andDangjianpeixun1In(List<String> values) {
            addCriterion("DANGJIANPEIXUN1 in", values, "dangjianpeixun1");
            return (Criteria) this;
        }

        public Criteria andDangjianpeixun1NotIn(List<String> values) {
            addCriterion("DANGJIANPEIXUN1 not in", values, "dangjianpeixun1");
            return (Criteria) this;
        }

        public Criteria andDangjianpeixun1Between(String value1, String value2) {
            addCriterion("DANGJIANPEIXUN1 between", value1, value2, "dangjianpeixun1");
            return (Criteria) this;
        }

        public Criteria andDangjianpeixun1NotBetween(String value1, String value2) {
            addCriterion("DANGJIANPEIXUN1 not between", value1, value2, "dangjianpeixun1");
            return (Criteria) this;
        }

        public Criteria andPinpaihuodongIsNull() {
            addCriterion("PINPAIHUODONG is null");
            return (Criteria) this;
        }

        public Criteria andPinpaihuodongIsNotNull() {
            addCriterion("PINPAIHUODONG is not null");
            return (Criteria) this;
        }

        public Criteria andPinpaihuodongEqualTo(String value) {
            addCriterion("PINPAIHUODONG =", value, "pinpaihuodong");
            return (Criteria) this;
        }

        public Criteria andPinpaihuodongNotEqualTo(String value) {
            addCriterion("PINPAIHUODONG <>", value, "pinpaihuodong");
            return (Criteria) this;
        }

        public Criteria andPinpaihuodongGreaterThan(String value) {
            addCriterion("PINPAIHUODONG >", value, "pinpaihuodong");
            return (Criteria) this;
        }

        public Criteria andPinpaihuodongGreaterThanOrEqualTo(String value) {
            addCriterion("PINPAIHUODONG >=", value, "pinpaihuodong");
            return (Criteria) this;
        }

        public Criteria andPinpaihuodongLessThan(String value) {
            addCriterion("PINPAIHUODONG <", value, "pinpaihuodong");
            return (Criteria) this;
        }

        public Criteria andPinpaihuodongLessThanOrEqualTo(String value) {
            addCriterion("PINPAIHUODONG <=", value, "pinpaihuodong");
            return (Criteria) this;
        }

        public Criteria andPinpaihuodongLike(String value) {
            addCriterion("PINPAIHUODONG like", value, "pinpaihuodong");
            return (Criteria) this;
        }

        public Criteria andPinpaihuodongNotLike(String value) {
            addCriterion("PINPAIHUODONG not like", value, "pinpaihuodong");
            return (Criteria) this;
        }

        public Criteria andPinpaihuodongIn(List<String> values) {
            addCriterion("PINPAIHUODONG in", values, "pinpaihuodong");
            return (Criteria) this;
        }

        public Criteria andPinpaihuodongNotIn(List<String> values) {
            addCriterion("PINPAIHUODONG not in", values, "pinpaihuodong");
            return (Criteria) this;
        }

        public Criteria andPinpaihuodongBetween(String value1, String value2) {
            addCriterion("PINPAIHUODONG between", value1, value2, "pinpaihuodong");
            return (Criteria) this;
        }

        public Criteria andPinpaihuodongNotBetween(String value1, String value2) {
            addCriterion("PINPAIHUODONG not between", value1, value2, "pinpaihuodong");
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

        public Criteria andGuanfangwangzhan1IsNull() {
            addCriterion("GUANFANGWANGZHAN1 is null");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan1IsNotNull() {
            addCriterion("GUANFANGWANGZHAN1 is not null");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan1EqualTo(Object value) {
            addCriterion("GUANFANGWANGZHAN1 =", value, "guanfangwangzhan1");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan1NotEqualTo(Object value) {
            addCriterion("GUANFANGWANGZHAN1 <>", value, "guanfangwangzhan1");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan1GreaterThan(Object value) {
            addCriterion("GUANFANGWANGZHAN1 >", value, "guanfangwangzhan1");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan1GreaterThanOrEqualTo(Object value) {
            addCriterion("GUANFANGWANGZHAN1 >=", value, "guanfangwangzhan1");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan1LessThan(Object value) {
            addCriterion("GUANFANGWANGZHAN1 <", value, "guanfangwangzhan1");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan1LessThanOrEqualTo(Object value) {
            addCriterion("GUANFANGWANGZHAN1 <=", value, "guanfangwangzhan1");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan1In(List<Object> values) {
            addCriterion("GUANFANGWANGZHAN1 in", values, "guanfangwangzhan1");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan1NotIn(List<Object> values) {
            addCriterion("GUANFANGWANGZHAN1 not in", values, "guanfangwangzhan1");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan1Between(Object value1, Object value2) {
            addCriterion("GUANFANGWANGZHAN1 between", value1, value2, "guanfangwangzhan1");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan1NotBetween(Object value1, Object value2) {
            addCriterion("GUANFANGWANGZHAN1 not between", value1, value2, "guanfangwangzhan1");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai1IsNull() {
            addCriterion("WEIXINPINGTAI1 is null");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai1IsNotNull() {
            addCriterion("WEIXINPINGTAI1 is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai1EqualTo(Object value) {
            addCriterion("WEIXINPINGTAI1 =", value, "weixinpingtai1");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai1NotEqualTo(Object value) {
            addCriterion("WEIXINPINGTAI1 <>", value, "weixinpingtai1");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai1GreaterThan(Object value) {
            addCriterion("WEIXINPINGTAI1 >", value, "weixinpingtai1");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai1GreaterThanOrEqualTo(Object value) {
            addCriterion("WEIXINPINGTAI1 >=", value, "weixinpingtai1");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai1LessThan(Object value) {
            addCriterion("WEIXINPINGTAI1 <", value, "weixinpingtai1");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai1LessThanOrEqualTo(Object value) {
            addCriterion("WEIXINPINGTAI1 <=", value, "weixinpingtai1");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai1In(List<Object> values) {
            addCriterion("WEIXINPINGTAI1 in", values, "weixinpingtai1");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai1NotIn(List<Object> values) {
            addCriterion("WEIXINPINGTAI1 not in", values, "weixinpingtai1");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai1Between(Object value1, Object value2) {
            addCriterion("WEIXINPINGTAI1 between", value1, value2, "weixinpingtai1");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai1NotBetween(Object value1, Object value2) {
            addCriterion("WEIXINPINGTAI1 not between", value1, value2, "weixinpingtai1");
            return (Criteria) this;
        }

        public Criteria andWeibo1IsNull() {
            addCriterion("WEIBO1 is null");
            return (Criteria) this;
        }

        public Criteria andWeibo1IsNotNull() {
            addCriterion("WEIBO1 is not null");
            return (Criteria) this;
        }

        public Criteria andWeibo1EqualTo(Object value) {
            addCriterion("WEIBO1 =", value, "weibo1");
            return (Criteria) this;
        }

        public Criteria andWeibo1NotEqualTo(Object value) {
            addCriterion("WEIBO1 <>", value, "weibo1");
            return (Criteria) this;
        }

        public Criteria andWeibo1GreaterThan(Object value) {
            addCriterion("WEIBO1 >", value, "weibo1");
            return (Criteria) this;
        }

        public Criteria andWeibo1GreaterThanOrEqualTo(Object value) {
            addCriterion("WEIBO1 >=", value, "weibo1");
            return (Criteria) this;
        }

        public Criteria andWeibo1LessThan(Object value) {
            addCriterion("WEIBO1 <", value, "weibo1");
            return (Criteria) this;
        }

        public Criteria andWeibo1LessThanOrEqualTo(Object value) {
            addCriterion("WEIBO1 <=", value, "weibo1");
            return (Criteria) this;
        }

        public Criteria andWeibo1In(List<Object> values) {
            addCriterion("WEIBO1 in", values, "weibo1");
            return (Criteria) this;
        }

        public Criteria andWeibo1NotIn(List<Object> values) {
            addCriterion("WEIBO1 not in", values, "weibo1");
            return (Criteria) this;
        }

        public Criteria andWeibo1Between(Object value1, Object value2) {
            addCriterion("WEIBO1 between", value1, value2, "weibo1");
            return (Criteria) this;
        }

        public Criteria andWeibo1NotBetween(Object value1, Object value2) {
            addCriterion("WEIBO1 not between", value1, value2, "weibo1");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan1IsNull() {
            addCriterion("ZAZHIQIKAN1 is null");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan1IsNotNull() {
            addCriterion("ZAZHIQIKAN1 is not null");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan1EqualTo(Object value) {
            addCriterion("ZAZHIQIKAN1 =", value, "zazhiqikan1");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan1NotEqualTo(Object value) {
            addCriterion("ZAZHIQIKAN1 <>", value, "zazhiqikan1");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan1GreaterThan(Object value) {
            addCriterion("ZAZHIQIKAN1 >", value, "zazhiqikan1");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan1GreaterThanOrEqualTo(Object value) {
            addCriterion("ZAZHIQIKAN1 >=", value, "zazhiqikan1");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan1LessThan(Object value) {
            addCriterion("ZAZHIQIKAN1 <", value, "zazhiqikan1");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan1LessThanOrEqualTo(Object value) {
            addCriterion("ZAZHIQIKAN1 <=", value, "zazhiqikan1");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan1In(List<Object> values) {
            addCriterion("ZAZHIQIKAN1 in", values, "zazhiqikan1");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan1NotIn(List<Object> values) {
            addCriterion("ZAZHIQIKAN1 not in", values, "zazhiqikan1");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan1Between(Object value1, Object value2) {
            addCriterion("ZAZHIQIKAN1 between", value1, value2, "zazhiqikan1");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan1NotBetween(Object value1, Object value2) {
            addCriterion("ZAZHIQIKAN1 not between", value1, value2, "zazhiqikan1");
            return (Criteria) this;
        }

        public Criteria andQitafangshi1IsNull() {
            addCriterion("QITAFANGSHI1 is null");
            return (Criteria) this;
        }

        public Criteria andQitafangshi1IsNotNull() {
            addCriterion("QITAFANGSHI1 is not null");
            return (Criteria) this;
        }

        public Criteria andQitafangshi1EqualTo(Object value) {
            addCriterion("QITAFANGSHI1 =", value, "qitafangshi1");
            return (Criteria) this;
        }

        public Criteria andQitafangshi1NotEqualTo(Object value) {
            addCriterion("QITAFANGSHI1 <>", value, "qitafangshi1");
            return (Criteria) this;
        }

        public Criteria andQitafangshi1GreaterThan(Object value) {
            addCriterion("QITAFANGSHI1 >", value, "qitafangshi1");
            return (Criteria) this;
        }

        public Criteria andQitafangshi1GreaterThanOrEqualTo(Object value) {
            addCriterion("QITAFANGSHI1 >=", value, "qitafangshi1");
            return (Criteria) this;
        }

        public Criteria andQitafangshi1LessThan(Object value) {
            addCriterion("QITAFANGSHI1 <", value, "qitafangshi1");
            return (Criteria) this;
        }

        public Criteria andQitafangshi1LessThanOrEqualTo(Object value) {
            addCriterion("QITAFANGSHI1 <=", value, "qitafangshi1");
            return (Criteria) this;
        }

        public Criteria andQitafangshi1In(List<Object> values) {
            addCriterion("QITAFANGSHI1 in", values, "qitafangshi1");
            return (Criteria) this;
        }

        public Criteria andQitafangshi1NotIn(List<Object> values) {
            addCriterion("QITAFANGSHI1 not in", values, "qitafangshi1");
            return (Criteria) this;
        }

        public Criteria andQitafangshi1Between(Object value1, Object value2) {
            addCriterion("QITAFANGSHI1 between", value1, value2, "qitafangshi1");
            return (Criteria) this;
        }

        public Criteria andQitafangshi1NotBetween(Object value1, Object value2) {
            addCriterion("QITAFANGSHI1 not between", value1, value2, "qitafangshi1");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan2IsNull() {
            addCriterion("GUANFANGWANGZHAN2 is null");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan2IsNotNull() {
            addCriterion("GUANFANGWANGZHAN2 is not null");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan2EqualTo(Object value) {
            addCriterion("GUANFANGWANGZHAN2 =", value, "guanfangwangzhan2");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan2NotEqualTo(Object value) {
            addCriterion("GUANFANGWANGZHAN2 <>", value, "guanfangwangzhan2");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan2GreaterThan(Object value) {
            addCriterion("GUANFANGWANGZHAN2 >", value, "guanfangwangzhan2");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan2GreaterThanOrEqualTo(Object value) {
            addCriterion("GUANFANGWANGZHAN2 >=", value, "guanfangwangzhan2");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan2LessThan(Object value) {
            addCriterion("GUANFANGWANGZHAN2 <", value, "guanfangwangzhan2");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan2LessThanOrEqualTo(Object value) {
            addCriterion("GUANFANGWANGZHAN2 <=", value, "guanfangwangzhan2");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan2In(List<Object> values) {
            addCriterion("GUANFANGWANGZHAN2 in", values, "guanfangwangzhan2");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan2NotIn(List<Object> values) {
            addCriterion("GUANFANGWANGZHAN2 not in", values, "guanfangwangzhan2");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan2Between(Object value1, Object value2) {
            addCriterion("GUANFANGWANGZHAN2 between", value1, value2, "guanfangwangzhan2");
            return (Criteria) this;
        }

        public Criteria andGuanfangwangzhan2NotBetween(Object value1, Object value2) {
            addCriterion("GUANFANGWANGZHAN2 not between", value1, value2, "guanfangwangzhan2");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai2IsNull() {
            addCriterion("WEIXINPINGTAI2 is null");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai2IsNotNull() {
            addCriterion("WEIXINPINGTAI2 is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai2EqualTo(Object value) {
            addCriterion("WEIXINPINGTAI2 =", value, "weixinpingtai2");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai2NotEqualTo(Object value) {
            addCriterion("WEIXINPINGTAI2 <>", value, "weixinpingtai2");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai2GreaterThan(Object value) {
            addCriterion("WEIXINPINGTAI2 >", value, "weixinpingtai2");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai2GreaterThanOrEqualTo(Object value) {
            addCriterion("WEIXINPINGTAI2 >=", value, "weixinpingtai2");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai2LessThan(Object value) {
            addCriterion("WEIXINPINGTAI2 <", value, "weixinpingtai2");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai2LessThanOrEqualTo(Object value) {
            addCriterion("WEIXINPINGTAI2 <=", value, "weixinpingtai2");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai2In(List<Object> values) {
            addCriterion("WEIXINPINGTAI2 in", values, "weixinpingtai2");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai2NotIn(List<Object> values) {
            addCriterion("WEIXINPINGTAI2 not in", values, "weixinpingtai2");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai2Between(Object value1, Object value2) {
            addCriterion("WEIXINPINGTAI2 between", value1, value2, "weixinpingtai2");
            return (Criteria) this;
        }

        public Criteria andWeixinpingtai2NotBetween(Object value1, Object value2) {
            addCriterion("WEIXINPINGTAI2 not between", value1, value2, "weixinpingtai2");
            return (Criteria) this;
        }

        public Criteria andWeibo2IsNull() {
            addCriterion("WEIBO2 is null");
            return (Criteria) this;
        }

        public Criteria andWeibo2IsNotNull() {
            addCriterion("WEIBO2 is not null");
            return (Criteria) this;
        }

        public Criteria andWeibo2EqualTo(Object value) {
            addCriterion("WEIBO2 =", value, "weibo2");
            return (Criteria) this;
        }

        public Criteria andWeibo2NotEqualTo(Object value) {
            addCriterion("WEIBO2 <>", value, "weibo2");
            return (Criteria) this;
        }

        public Criteria andWeibo2GreaterThan(Object value) {
            addCriterion("WEIBO2 >", value, "weibo2");
            return (Criteria) this;
        }

        public Criteria andWeibo2GreaterThanOrEqualTo(Object value) {
            addCriterion("WEIBO2 >=", value, "weibo2");
            return (Criteria) this;
        }

        public Criteria andWeibo2LessThan(Object value) {
            addCriterion("WEIBO2 <", value, "weibo2");
            return (Criteria) this;
        }

        public Criteria andWeibo2LessThanOrEqualTo(Object value) {
            addCriterion("WEIBO2 <=", value, "weibo2");
            return (Criteria) this;
        }

        public Criteria andWeibo2In(List<Object> values) {
            addCriterion("WEIBO2 in", values, "weibo2");
            return (Criteria) this;
        }

        public Criteria andWeibo2NotIn(List<Object> values) {
            addCriterion("WEIBO2 not in", values, "weibo2");
            return (Criteria) this;
        }

        public Criteria andWeibo2Between(Object value1, Object value2) {
            addCriterion("WEIBO2 between", value1, value2, "weibo2");
            return (Criteria) this;
        }

        public Criteria andWeibo2NotBetween(Object value1, Object value2) {
            addCriterion("WEIBO2 not between", value1, value2, "weibo2");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan2IsNull() {
            addCriterion("ZAZHIQIKAN2 is null");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan2IsNotNull() {
            addCriterion("ZAZHIQIKAN2 is not null");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan2EqualTo(Object value) {
            addCriterion("ZAZHIQIKAN2 =", value, "zazhiqikan2");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan2NotEqualTo(Object value) {
            addCriterion("ZAZHIQIKAN2 <>", value, "zazhiqikan2");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan2GreaterThan(Object value) {
            addCriterion("ZAZHIQIKAN2 >", value, "zazhiqikan2");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan2GreaterThanOrEqualTo(Object value) {
            addCriterion("ZAZHIQIKAN2 >=", value, "zazhiqikan2");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan2LessThan(Object value) {
            addCriterion("ZAZHIQIKAN2 <", value, "zazhiqikan2");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan2LessThanOrEqualTo(Object value) {
            addCriterion("ZAZHIQIKAN2 <=", value, "zazhiqikan2");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan2In(List<Object> values) {
            addCriterion("ZAZHIQIKAN2 in", values, "zazhiqikan2");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan2NotIn(List<Object> values) {
            addCriterion("ZAZHIQIKAN2 not in", values, "zazhiqikan2");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan2Between(Object value1, Object value2) {
            addCriterion("ZAZHIQIKAN2 between", value1, value2, "zazhiqikan2");
            return (Criteria) this;
        }

        public Criteria andZazhiqikan2NotBetween(Object value1, Object value2) {
            addCriterion("ZAZHIQIKAN2 not between", value1, value2, "zazhiqikan2");
            return (Criteria) this;
        }

        public Criteria andQitafangshi2IsNull() {
            addCriterion("QITAFANGSHI2 is null");
            return (Criteria) this;
        }

        public Criteria andQitafangshi2IsNotNull() {
            addCriterion("QITAFANGSHI2 is not null");
            return (Criteria) this;
        }

        public Criteria andQitafangshi2EqualTo(Object value) {
            addCriterion("QITAFANGSHI2 =", value, "qitafangshi2");
            return (Criteria) this;
        }

        public Criteria andQitafangshi2NotEqualTo(Object value) {
            addCriterion("QITAFANGSHI2 <>", value, "qitafangshi2");
            return (Criteria) this;
        }

        public Criteria andQitafangshi2GreaterThan(Object value) {
            addCriterion("QITAFANGSHI2 >", value, "qitafangshi2");
            return (Criteria) this;
        }

        public Criteria andQitafangshi2GreaterThanOrEqualTo(Object value) {
            addCriterion("QITAFANGSHI2 >=", value, "qitafangshi2");
            return (Criteria) this;
        }

        public Criteria andQitafangshi2LessThan(Object value) {
            addCriterion("QITAFANGSHI2 <", value, "qitafangshi2");
            return (Criteria) this;
        }

        public Criteria andQitafangshi2LessThanOrEqualTo(Object value) {
            addCriterion("QITAFANGSHI2 <=", value, "qitafangshi2");
            return (Criteria) this;
        }

        public Criteria andQitafangshi2In(List<Object> values) {
            addCriterion("QITAFANGSHI2 in", values, "qitafangshi2");
            return (Criteria) this;
        }

        public Criteria andQitafangshi2NotIn(List<Object> values) {
            addCriterion("QITAFANGSHI2 not in", values, "qitafangshi2");
            return (Criteria) this;
        }

        public Criteria andQitafangshi2Between(Object value1, Object value2) {
            addCriterion("QITAFANGSHI2 between", value1, value2, "qitafangshi2");
            return (Criteria) this;
        }

        public Criteria andQitafangshi2NotBetween(Object value1, Object value2) {
            addCriterion("QITAFANGSHI2 not between", value1, value2, "qitafangshi2");
            return (Criteria) this;
        }

        public Criteria andQitafangshi22IsNull() {
            addCriterion("QITAFANGSHI22 is null");
            return (Criteria) this;
        }

        public Criteria andQitafangshi22IsNotNull() {
            addCriterion("QITAFANGSHI22 is not null");
            return (Criteria) this;
        }

        public Criteria andQitafangshi22EqualTo(Object value) {
            addCriterion("QITAFANGSHI22 =", value, "qitafangshi22");
            return (Criteria) this;
        }

        public Criteria andQitafangshi22NotEqualTo(Object value) {
            addCriterion("QITAFANGSHI22 <>", value, "qitafangshi22");
            return (Criteria) this;
        }

        public Criteria andQitafangshi22GreaterThan(Object value) {
            addCriterion("QITAFANGSHI22 >", value, "qitafangshi22");
            return (Criteria) this;
        }

        public Criteria andQitafangshi22GreaterThanOrEqualTo(Object value) {
            addCriterion("QITAFANGSHI22 >=", value, "qitafangshi22");
            return (Criteria) this;
        }

        public Criteria andQitafangshi22LessThan(Object value) {
            addCriterion("QITAFANGSHI22 <", value, "qitafangshi22");
            return (Criteria) this;
        }

        public Criteria andQitafangshi22LessThanOrEqualTo(Object value) {
            addCriterion("QITAFANGSHI22 <=", value, "qitafangshi22");
            return (Criteria) this;
        }

        public Criteria andQitafangshi22In(List<Object> values) {
            addCriterion("QITAFANGSHI22 in", values, "qitafangshi22");
            return (Criteria) this;
        }

        public Criteria andQitafangshi22NotIn(List<Object> values) {
            addCriterion("QITAFANGSHI22 not in", values, "qitafangshi22");
            return (Criteria) this;
        }

        public Criteria andQitafangshi22Between(Object value1, Object value2) {
            addCriterion("QITAFANGSHI22 between", value1, value2, "qitafangshi22");
            return (Criteria) this;
        }

        public Criteria andQitafangshi22NotBetween(Object value1, Object value2) {
            addCriterion("QITAFANGSHI22 not between", value1, value2, "qitafangshi22");
            return (Criteria) this;
        }

        public Criteria andQitafangshi11IsNull() {
            addCriterion("QITAFANGSHI11 is null");
            return (Criteria) this;
        }

        public Criteria andQitafangshi11IsNotNull() {
            addCriterion("QITAFANGSHI11 is not null");
            return (Criteria) this;
        }

        public Criteria andQitafangshi11EqualTo(Object value) {
            addCriterion("QITAFANGSHI11 =", value, "qitafangshi11");
            return (Criteria) this;
        }

        public Criteria andQitafangshi11NotEqualTo(Object value) {
            addCriterion("QITAFANGSHI11 <>", value, "qitafangshi11");
            return (Criteria) this;
        }

        public Criteria andQitafangshi11GreaterThan(Object value) {
            addCriterion("QITAFANGSHI11 >", value, "qitafangshi11");
            return (Criteria) this;
        }

        public Criteria andQitafangshi11GreaterThanOrEqualTo(Object value) {
            addCriterion("QITAFANGSHI11 >=", value, "qitafangshi11");
            return (Criteria) this;
        }

        public Criteria andQitafangshi11LessThan(Object value) {
            addCriterion("QITAFANGSHI11 <", value, "qitafangshi11");
            return (Criteria) this;
        }

        public Criteria andQitafangshi11LessThanOrEqualTo(Object value) {
            addCriterion("QITAFANGSHI11 <=", value, "qitafangshi11");
            return (Criteria) this;
        }

        public Criteria andQitafangshi11In(List<Object> values) {
            addCriterion("QITAFANGSHI11 in", values, "qitafangshi11");
            return (Criteria) this;
        }

        public Criteria andQitafangshi11NotIn(List<Object> values) {
            addCriterion("QITAFANGSHI11 not in", values, "qitafangshi11");
            return (Criteria) this;
        }

        public Criteria andQitafangshi11Between(Object value1, Object value2) {
            addCriterion("QITAFANGSHI11 between", value1, value2, "qitafangshi11");
            return (Criteria) this;
        }

        public Criteria andQitafangshi11NotBetween(Object value1, Object value2) {
            addCriterion("QITAFANGSHI11 not between", value1, value2, "qitafangshi11");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuiIsNull() {
            addCriterion("HUIYUANDAHUI is null");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuiIsNotNull() {
            addCriterion("HUIYUANDAHUI is not null");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuiEqualTo(Object value) {
            addCriterion("HUIYUANDAHUI =", value, "huiyuandahui");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuiNotEqualTo(Object value) {
            addCriterion("HUIYUANDAHUI <>", value, "huiyuandahui");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuiGreaterThan(Object value) {
            addCriterion("HUIYUANDAHUI >", value, "huiyuandahui");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuiGreaterThanOrEqualTo(Object value) {
            addCriterion("HUIYUANDAHUI >=", value, "huiyuandahui");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuiLessThan(Object value) {
            addCriterion("HUIYUANDAHUI <", value, "huiyuandahui");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuiLessThanOrEqualTo(Object value) {
            addCriterion("HUIYUANDAHUI <=", value, "huiyuandahui");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuiIn(List<Object> values) {
            addCriterion("HUIYUANDAHUI in", values, "huiyuandahui");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuiNotIn(List<Object> values) {
            addCriterion("HUIYUANDAHUI not in", values, "huiyuandahui");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuiBetween(Object value1, Object value2) {
            addCriterion("HUIYUANDAHUI between", value1, value2, "huiyuandahui");
            return (Criteria) this;
        }

        public Criteria andHuiyuandahuiNotBetween(Object value1, Object value2) {
            addCriterion("HUIYUANDAHUI not between", value1, value2, "huiyuandahui");
            return (Criteria) this;
        }

        public Criteria andGongzuoqqqunIsNull() {
            addCriterion("GONGZUOQQQUN is null");
            return (Criteria) this;
        }

        public Criteria andGongzuoqqqunIsNotNull() {
            addCriterion("GONGZUOQQQUN is not null");
            return (Criteria) this;
        }

        public Criteria andGongzuoqqqunEqualTo(Object value) {
            addCriterion("GONGZUOQQQUN =", value, "gongzuoqqqun");
            return (Criteria) this;
        }

        public Criteria andGongzuoqqqunNotEqualTo(Object value) {
            addCriterion("GONGZUOQQQUN <>", value, "gongzuoqqqun");
            return (Criteria) this;
        }

        public Criteria andGongzuoqqqunGreaterThan(Object value) {
            addCriterion("GONGZUOQQQUN >", value, "gongzuoqqqun");
            return (Criteria) this;
        }

        public Criteria andGongzuoqqqunGreaterThanOrEqualTo(Object value) {
            addCriterion("GONGZUOQQQUN >=", value, "gongzuoqqqun");
            return (Criteria) this;
        }

        public Criteria andGongzuoqqqunLessThan(Object value) {
            addCriterion("GONGZUOQQQUN <", value, "gongzuoqqqun");
            return (Criteria) this;
        }

        public Criteria andGongzuoqqqunLessThanOrEqualTo(Object value) {
            addCriterion("GONGZUOQQQUN <=", value, "gongzuoqqqun");
            return (Criteria) this;
        }

        public Criteria andGongzuoqqqunIn(List<Object> values) {
            addCriterion("GONGZUOQQQUN in", values, "gongzuoqqqun");
            return (Criteria) this;
        }

        public Criteria andGongzuoqqqunNotIn(List<Object> values) {
            addCriterion("GONGZUOQQQUN not in", values, "gongzuoqqqun");
            return (Criteria) this;
        }

        public Criteria andGongzuoqqqunBetween(Object value1, Object value2) {
            addCriterion("GONGZUOQQQUN between", value1, value2, "gongzuoqqqun");
            return (Criteria) this;
        }

        public Criteria andGongzuoqqqunNotBetween(Object value1, Object value2) {
            addCriterion("GONGZUOQQQUN not between", value1, value2, "gongzuoqqqun");
            return (Criteria) this;
        }

        public Criteria andDuanxinpingtaiIsNull() {
            addCriterion("DUANXINPINGTAI is null");
            return (Criteria) this;
        }

        public Criteria andDuanxinpingtaiIsNotNull() {
            addCriterion("DUANXINPINGTAI is not null");
            return (Criteria) this;
        }

        public Criteria andDuanxinpingtaiEqualTo(Object value) {
            addCriterion("DUANXINPINGTAI =", value, "duanxinpingtai");
            return (Criteria) this;
        }

        public Criteria andDuanxinpingtaiNotEqualTo(Object value) {
            addCriterion("DUANXINPINGTAI <>", value, "duanxinpingtai");
            return (Criteria) this;
        }

        public Criteria andDuanxinpingtaiGreaterThan(Object value) {
            addCriterion("DUANXINPINGTAI >", value, "duanxinpingtai");
            return (Criteria) this;
        }

        public Criteria andDuanxinpingtaiGreaterThanOrEqualTo(Object value) {
            addCriterion("DUANXINPINGTAI >=", value, "duanxinpingtai");
            return (Criteria) this;
        }

        public Criteria andDuanxinpingtaiLessThan(Object value) {
            addCriterion("DUANXINPINGTAI <", value, "duanxinpingtai");
            return (Criteria) this;
        }

        public Criteria andDuanxinpingtaiLessThanOrEqualTo(Object value) {
            addCriterion("DUANXINPINGTAI <=", value, "duanxinpingtai");
            return (Criteria) this;
        }

        public Criteria andDuanxinpingtaiIn(List<Object> values) {
            addCriterion("DUANXINPINGTAI in", values, "duanxinpingtai");
            return (Criteria) this;
        }

        public Criteria andDuanxinpingtaiNotIn(List<Object> values) {
            addCriterion("DUANXINPINGTAI not in", values, "duanxinpingtai");
            return (Criteria) this;
        }

        public Criteria andDuanxinpingtaiBetween(Object value1, Object value2) {
            addCriterion("DUANXINPINGTAI between", value1, value2, "duanxinpingtai");
            return (Criteria) this;
        }

        public Criteria andDuanxinpingtaiNotBetween(Object value1, Object value2) {
            addCriterion("DUANXINPINGTAI not between", value1, value2, "duanxinpingtai");
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