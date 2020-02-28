package com.xgb.model;

import java.util.ArrayList;
import java.util.List;

public class JjhNianjianDangjmesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JjhNianjianDangjmesExample() {
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

        public Criteria andIsjiandangIsNull() {
            addCriterion("ISJIANDANG is null");
            return (Criteria) this;
        }

        public Criteria andIsjiandangIsNotNull() {
            addCriterion("ISJIANDANG is not null");
            return (Criteria) this;
        }

        public Criteria andIsjiandangEqualTo(Short value) {
            addCriterion("ISJIANDANG =", value, "isjiandang");
            return (Criteria) this;
        }

        public Criteria andIsjiandangNotEqualTo(Short value) {
            addCriterion("ISJIANDANG <>", value, "isjiandang");
            return (Criteria) this;
        }

        public Criteria andIsjiandangGreaterThan(Short value) {
            addCriterion("ISJIANDANG >", value, "isjiandang");
            return (Criteria) this;
        }

        public Criteria andIsjiandangGreaterThanOrEqualTo(Short value) {
            addCriterion("ISJIANDANG >=", value, "isjiandang");
            return (Criteria) this;
        }

        public Criteria andIsjiandangLessThan(Short value) {
            addCriterion("ISJIANDANG <", value, "isjiandang");
            return (Criteria) this;
        }

        public Criteria andIsjiandangLessThanOrEqualTo(Short value) {
            addCriterion("ISJIANDANG <=", value, "isjiandang");
            return (Criteria) this;
        }

        public Criteria andIsjiandangIn(List<Short> values) {
            addCriterion("ISJIANDANG in", values, "isjiandang");
            return (Criteria) this;
        }

        public Criteria andIsjiandangNotIn(List<Short> values) {
            addCriterion("ISJIANDANG not in", values, "isjiandang");
            return (Criteria) this;
        }

        public Criteria andIsjiandangBetween(Short value1, Short value2) {
            addCriterion("ISJIANDANG between", value1, value2, "isjiandang");
            return (Criteria) this;
        }

        public Criteria andIsjiandangNotBetween(Short value1, Short value2) {
            addCriterion("ISJIANDANG not between", value1, value2, "isjiandang");
            return (Criteria) this;
        }

        public Criteria andDangmingchengIsNull() {
            addCriterion("DANGMINGCHENG is null");
            return (Criteria) this;
        }

        public Criteria andDangmingchengIsNotNull() {
            addCriterion("DANGMINGCHENG is not null");
            return (Criteria) this;
        }

        public Criteria andDangmingchengEqualTo(String value) {
            addCriterion("DANGMINGCHENG =", value, "dangmingcheng");
            return (Criteria) this;
        }

        public Criteria andDangmingchengNotEqualTo(String value) {
            addCriterion("DANGMINGCHENG <>", value, "dangmingcheng");
            return (Criteria) this;
        }

        public Criteria andDangmingchengGreaterThan(String value) {
            addCriterion("DANGMINGCHENG >", value, "dangmingcheng");
            return (Criteria) this;
        }

        public Criteria andDangmingchengGreaterThanOrEqualTo(String value) {
            addCriterion("DANGMINGCHENG >=", value, "dangmingcheng");
            return (Criteria) this;
        }

        public Criteria andDangmingchengLessThan(String value) {
            addCriterion("DANGMINGCHENG <", value, "dangmingcheng");
            return (Criteria) this;
        }

        public Criteria andDangmingchengLessThanOrEqualTo(String value) {
            addCriterion("DANGMINGCHENG <=", value, "dangmingcheng");
            return (Criteria) this;
        }

        public Criteria andDangmingchengLike(String value) {
            addCriterion("DANGMINGCHENG like", value, "dangmingcheng");
            return (Criteria) this;
        }

        public Criteria andDangmingchengNotLike(String value) {
            addCriterion("DANGMINGCHENG not like", value, "dangmingcheng");
            return (Criteria) this;
        }

        public Criteria andDangmingchengIn(List<String> values) {
            addCriterion("DANGMINGCHENG in", values, "dangmingcheng");
            return (Criteria) this;
        }

        public Criteria andDangmingchengNotIn(List<String> values) {
            addCriterion("DANGMINGCHENG not in", values, "dangmingcheng");
            return (Criteria) this;
        }

        public Criteria andDangmingchengBetween(String value1, String value2) {
            addCriterion("DANGMINGCHENG between", value1, value2, "dangmingcheng");
            return (Criteria) this;
        }

        public Criteria andDangmingchengNotBetween(String value1, String value2) {
            addCriterion("DANGMINGCHENG not between", value1, value2, "dangmingcheng");
            return (Criteria) this;
        }

        public Criteria andDangtypeIsNull() {
            addCriterion("DANGTYPE is null");
            return (Criteria) this;
        }

        public Criteria andDangtypeIsNotNull() {
            addCriterion("DANGTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDangtypeEqualTo(Short value) {
            addCriterion("DANGTYPE =", value, "dangtype");
            return (Criteria) this;
        }

        public Criteria andDangtypeNotEqualTo(Short value) {
            addCriterion("DANGTYPE <>", value, "dangtype");
            return (Criteria) this;
        }

        public Criteria andDangtypeGreaterThan(Short value) {
            addCriterion("DANGTYPE >", value, "dangtype");
            return (Criteria) this;
        }

        public Criteria andDangtypeGreaterThanOrEqualTo(Short value) {
            addCriterion("DANGTYPE >=", value, "dangtype");
            return (Criteria) this;
        }

        public Criteria andDangtypeLessThan(Short value) {
            addCriterion("DANGTYPE <", value, "dangtype");
            return (Criteria) this;
        }

        public Criteria andDangtypeLessThanOrEqualTo(Short value) {
            addCriterion("DANGTYPE <=", value, "dangtype");
            return (Criteria) this;
        }

        public Criteria andDangtypeIn(List<Short> values) {
            addCriterion("DANGTYPE in", values, "dangtype");
            return (Criteria) this;
        }

        public Criteria andDangtypeNotIn(List<Short> values) {
            addCriterion("DANGTYPE not in", values, "dangtype");
            return (Criteria) this;
        }

        public Criteria andDangtypeBetween(Short value1, Short value2) {
            addCriterion("DANGTYPE between", value1, value2, "dangtype");
            return (Criteria) this;
        }

        public Criteria andDangtypeNotBetween(Short value1, Short value2) {
            addCriterion("DANGTYPE not between", value1, value2, "dangtype");
            return (Criteria) this;
        }

        public Criteria andSjdangmingchengIsNull() {
            addCriterion("SJDANGMINGCHENG is null");
            return (Criteria) this;
        }

        public Criteria andSjdangmingchengIsNotNull() {
            addCriterion("SJDANGMINGCHENG is not null");
            return (Criteria) this;
        }

        public Criteria andSjdangmingchengEqualTo(String value) {
            addCriterion("SJDANGMINGCHENG =", value, "sjdangmingcheng");
            return (Criteria) this;
        }

        public Criteria andSjdangmingchengNotEqualTo(String value) {
            addCriterion("SJDANGMINGCHENG <>", value, "sjdangmingcheng");
            return (Criteria) this;
        }

        public Criteria andSjdangmingchengGreaterThan(String value) {
            addCriterion("SJDANGMINGCHENG >", value, "sjdangmingcheng");
            return (Criteria) this;
        }

        public Criteria andSjdangmingchengGreaterThanOrEqualTo(String value) {
            addCriterion("SJDANGMINGCHENG >=", value, "sjdangmingcheng");
            return (Criteria) this;
        }

        public Criteria andSjdangmingchengLessThan(String value) {
            addCriterion("SJDANGMINGCHENG <", value, "sjdangmingcheng");
            return (Criteria) this;
        }

        public Criteria andSjdangmingchengLessThanOrEqualTo(String value) {
            addCriterion("SJDANGMINGCHENG <=", value, "sjdangmingcheng");
            return (Criteria) this;
        }

        public Criteria andSjdangmingchengLike(String value) {
            addCriterion("SJDANGMINGCHENG like", value, "sjdangmingcheng");
            return (Criteria) this;
        }

        public Criteria andSjdangmingchengNotLike(String value) {
            addCriterion("SJDANGMINGCHENG not like", value, "sjdangmingcheng");
            return (Criteria) this;
        }

        public Criteria andSjdangmingchengIn(List<String> values) {
            addCriterion("SJDANGMINGCHENG in", values, "sjdangmingcheng");
            return (Criteria) this;
        }

        public Criteria andSjdangmingchengNotIn(List<String> values) {
            addCriterion("SJDANGMINGCHENG not in", values, "sjdangmingcheng");
            return (Criteria) this;
        }

        public Criteria andSjdangmingchengBetween(String value1, String value2) {
            addCriterion("SJDANGMINGCHENG between", value1, value2, "sjdangmingcheng");
            return (Criteria) this;
        }

        public Criteria andSjdangmingchengNotBetween(String value1, String value2) {
            addCriterion("SJDANGMINGCHENG not between", value1, value2, "sjdangmingcheng");
            return (Criteria) this;
        }

        public Criteria andDangrenshuIsNull() {
            addCriterion("DANGRENSHU is null");
            return (Criteria) this;
        }

        public Criteria andDangrenshuIsNotNull() {
            addCriterion("DANGRENSHU is not null");
            return (Criteria) this;
        }

        public Criteria andDangrenshuEqualTo(Integer value) {
            addCriterion("DANGRENSHU =", value, "dangrenshu");
            return (Criteria) this;
        }

        public Criteria andDangrenshuNotEqualTo(Integer value) {
            addCriterion("DANGRENSHU <>", value, "dangrenshu");
            return (Criteria) this;
        }

        public Criteria andDangrenshuGreaterThan(Integer value) {
            addCriterion("DANGRENSHU >", value, "dangrenshu");
            return (Criteria) this;
        }

        public Criteria andDangrenshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("DANGRENSHU >=", value, "dangrenshu");
            return (Criteria) this;
        }

        public Criteria andDangrenshuLessThan(Integer value) {
            addCriterion("DANGRENSHU <", value, "dangrenshu");
            return (Criteria) this;
        }

        public Criteria andDangrenshuLessThanOrEqualTo(Integer value) {
            addCriterion("DANGRENSHU <=", value, "dangrenshu");
            return (Criteria) this;
        }

        public Criteria andDangrenshuIn(List<Integer> values) {
            addCriterion("DANGRENSHU in", values, "dangrenshu");
            return (Criteria) this;
        }

        public Criteria andDangrenshuNotIn(List<Integer> values) {
            addCriterion("DANGRENSHU not in", values, "dangrenshu");
            return (Criteria) this;
        }

        public Criteria andDangrenshuBetween(Integer value1, Integer value2) {
            addCriterion("DANGRENSHU between", value1, value2, "dangrenshu");
            return (Criteria) this;
        }

        public Criteria andDangrenshuNotBetween(Integer value1, Integer value2) {
            addCriterion("DANGRENSHU not between", value1, value2, "dangrenshu");
            return (Criteria) this;
        }

        public Criteria andDangshujixingmingIsNull() {
            addCriterion("DANGSHUJIXINGMING is null");
            return (Criteria) this;
        }

        public Criteria andDangshujixingmingIsNotNull() {
            addCriterion("DANGSHUJIXINGMING is not null");
            return (Criteria) this;
        }

        public Criteria andDangshujixingmingEqualTo(String value) {
            addCriterion("DANGSHUJIXINGMING =", value, "dangshujixingming");
            return (Criteria) this;
        }

        public Criteria andDangshujixingmingNotEqualTo(String value) {
            addCriterion("DANGSHUJIXINGMING <>", value, "dangshujixingming");
            return (Criteria) this;
        }

        public Criteria andDangshujixingmingGreaterThan(String value) {
            addCriterion("DANGSHUJIXINGMING >", value, "dangshujixingming");
            return (Criteria) this;
        }

        public Criteria andDangshujixingmingGreaterThanOrEqualTo(String value) {
            addCriterion("DANGSHUJIXINGMING >=", value, "dangshujixingming");
            return (Criteria) this;
        }

        public Criteria andDangshujixingmingLessThan(String value) {
            addCriterion("DANGSHUJIXINGMING <", value, "dangshujixingming");
            return (Criteria) this;
        }

        public Criteria andDangshujixingmingLessThanOrEqualTo(String value) {
            addCriterion("DANGSHUJIXINGMING <=", value, "dangshujixingming");
            return (Criteria) this;
        }

        public Criteria andDangshujixingmingLike(String value) {
            addCriterion("DANGSHUJIXINGMING like", value, "dangshujixingming");
            return (Criteria) this;
        }

        public Criteria andDangshujixingmingNotLike(String value) {
            addCriterion("DANGSHUJIXINGMING not like", value, "dangshujixingming");
            return (Criteria) this;
        }

        public Criteria andDangshujixingmingIn(List<String> values) {
            addCriterion("DANGSHUJIXINGMING in", values, "dangshujixingming");
            return (Criteria) this;
        }

        public Criteria andDangshujixingmingNotIn(List<String> values) {
            addCriterion("DANGSHUJIXINGMING not in", values, "dangshujixingming");
            return (Criteria) this;
        }

        public Criteria andDangshujixingmingBetween(String value1, String value2) {
            addCriterion("DANGSHUJIXINGMING between", value1, value2, "dangshujixingming");
            return (Criteria) this;
        }

        public Criteria andDangshujixingmingNotBetween(String value1, String value2) {
            addCriterion("DANGSHUJIXINGMING not between", value1, value2, "dangshujixingming");
            return (Criteria) this;
        }

        public Criteria andSuozaizhiwuIsNull() {
            addCriterion("SUOZAIZHIWU is null");
            return (Criteria) this;
        }

        public Criteria andSuozaizhiwuIsNotNull() {
            addCriterion("SUOZAIZHIWU is not null");
            return (Criteria) this;
        }

        public Criteria andSuozaizhiwuEqualTo(String value) {
            addCriterion("SUOZAIZHIWU =", value, "suozaizhiwu");
            return (Criteria) this;
        }

        public Criteria andSuozaizhiwuNotEqualTo(String value) {
            addCriterion("SUOZAIZHIWU <>", value, "suozaizhiwu");
            return (Criteria) this;
        }

        public Criteria andSuozaizhiwuGreaterThan(String value) {
            addCriterion("SUOZAIZHIWU >", value, "suozaizhiwu");
            return (Criteria) this;
        }

        public Criteria andSuozaizhiwuGreaterThanOrEqualTo(String value) {
            addCriterion("SUOZAIZHIWU >=", value, "suozaizhiwu");
            return (Criteria) this;
        }

        public Criteria andSuozaizhiwuLessThan(String value) {
            addCriterion("SUOZAIZHIWU <", value, "suozaizhiwu");
            return (Criteria) this;
        }

        public Criteria andSuozaizhiwuLessThanOrEqualTo(String value) {
            addCriterion("SUOZAIZHIWU <=", value, "suozaizhiwu");
            return (Criteria) this;
        }

        public Criteria andSuozaizhiwuLike(String value) {
            addCriterion("SUOZAIZHIWU like", value, "suozaizhiwu");
            return (Criteria) this;
        }

        public Criteria andSuozaizhiwuNotLike(String value) {
            addCriterion("SUOZAIZHIWU not like", value, "suozaizhiwu");
            return (Criteria) this;
        }

        public Criteria andSuozaizhiwuIn(List<String> values) {
            addCriterion("SUOZAIZHIWU in", values, "suozaizhiwu");
            return (Criteria) this;
        }

        public Criteria andSuozaizhiwuNotIn(List<String> values) {
            addCriterion("SUOZAIZHIWU not in", values, "suozaizhiwu");
            return (Criteria) this;
        }

        public Criteria andSuozaizhiwuBetween(String value1, String value2) {
            addCriterion("SUOZAIZHIWU between", value1, value2, "suozaizhiwu");
            return (Criteria) this;
        }

        public Criteria andSuozaizhiwuNotBetween(String value1, String value2) {
            addCriterion("SUOZAIZHIWU not between", value1, value2, "suozaizhiwu");
            return (Criteria) this;
        }

        public Criteria andIszhiliIsNull() {
            addCriterion("ISZHILI is null");
            return (Criteria) this;
        }

        public Criteria andIszhiliIsNotNull() {
            addCriterion("ISZHILI is not null");
            return (Criteria) this;
        }

        public Criteria andIszhiliEqualTo(Short value) {
            addCriterion("ISZHILI =", value, "iszhili");
            return (Criteria) this;
        }

        public Criteria andIszhiliNotEqualTo(Short value) {
            addCriterion("ISZHILI <>", value, "iszhili");
            return (Criteria) this;
        }

        public Criteria andIszhiliGreaterThan(Short value) {
            addCriterion("ISZHILI >", value, "iszhili");
            return (Criteria) this;
        }

        public Criteria andIszhiliGreaterThanOrEqualTo(Short value) {
            addCriterion("ISZHILI >=", value, "iszhili");
            return (Criteria) this;
        }

        public Criteria andIszhiliLessThan(Short value) {
            addCriterion("ISZHILI <", value, "iszhili");
            return (Criteria) this;
        }

        public Criteria andIszhiliLessThanOrEqualTo(Short value) {
            addCriterion("ISZHILI <=", value, "iszhili");
            return (Criteria) this;
        }

        public Criteria andIszhiliIn(List<Short> values) {
            addCriterion("ISZHILI in", values, "iszhili");
            return (Criteria) this;
        }

        public Criteria andIszhiliNotIn(List<Short> values) {
            addCriterion("ISZHILI not in", values, "iszhili");
            return (Criteria) this;
        }

        public Criteria andIszhiliBetween(Short value1, Short value2) {
            addCriterion("ISZHILI between", value1, value2, "iszhili");
            return (Criteria) this;
        }

        public Criteria andIszhiliNotBetween(Short value1, Short value2) {
            addCriterion("ISZHILI not between", value1, value2, "iszhili");
            return (Criteria) this;
        }

        public Criteria andDangjianlxrIsNull() {
            addCriterion("DANGJIANLXR is null");
            return (Criteria) this;
        }

        public Criteria andDangjianlxrIsNotNull() {
            addCriterion("DANGJIANLXR is not null");
            return (Criteria) this;
        }

        public Criteria andDangjianlxrEqualTo(String value) {
            addCriterion("DANGJIANLXR =", value, "dangjianlxr");
            return (Criteria) this;
        }

        public Criteria andDangjianlxrNotEqualTo(String value) {
            addCriterion("DANGJIANLXR <>", value, "dangjianlxr");
            return (Criteria) this;
        }

        public Criteria andDangjianlxrGreaterThan(String value) {
            addCriterion("DANGJIANLXR >", value, "dangjianlxr");
            return (Criteria) this;
        }

        public Criteria andDangjianlxrGreaterThanOrEqualTo(String value) {
            addCriterion("DANGJIANLXR >=", value, "dangjianlxr");
            return (Criteria) this;
        }

        public Criteria andDangjianlxrLessThan(String value) {
            addCriterion("DANGJIANLXR <", value, "dangjianlxr");
            return (Criteria) this;
        }

        public Criteria andDangjianlxrLessThanOrEqualTo(String value) {
            addCriterion("DANGJIANLXR <=", value, "dangjianlxr");
            return (Criteria) this;
        }

        public Criteria andDangjianlxrLike(String value) {
            addCriterion("DANGJIANLXR like", value, "dangjianlxr");
            return (Criteria) this;
        }

        public Criteria andDangjianlxrNotLike(String value) {
            addCriterion("DANGJIANLXR not like", value, "dangjianlxr");
            return (Criteria) this;
        }

        public Criteria andDangjianlxrIn(List<String> values) {
            addCriterion("DANGJIANLXR in", values, "dangjianlxr");
            return (Criteria) this;
        }

        public Criteria andDangjianlxrNotIn(List<String> values) {
            addCriterion("DANGJIANLXR not in", values, "dangjianlxr");
            return (Criteria) this;
        }

        public Criteria andDangjianlxrBetween(String value1, String value2) {
            addCriterion("DANGJIANLXR between", value1, value2, "dangjianlxr");
            return (Criteria) this;
        }

        public Criteria andDangjianlxrNotBetween(String value1, String value2) {
            addCriterion("DANGJIANLXR not between", value1, value2, "dangjianlxr");
            return (Criteria) this;
        }

        public Criteria andDjlxrzhiwuIsNull() {
            addCriterion("DJLXRZHIWU is null");
            return (Criteria) this;
        }

        public Criteria andDjlxrzhiwuIsNotNull() {
            addCriterion("DJLXRZHIWU is not null");
            return (Criteria) this;
        }

        public Criteria andDjlxrzhiwuEqualTo(String value) {
            addCriterion("DJLXRZHIWU =", value, "djlxrzhiwu");
            return (Criteria) this;
        }

        public Criteria andDjlxrzhiwuNotEqualTo(String value) {
            addCriterion("DJLXRZHIWU <>", value, "djlxrzhiwu");
            return (Criteria) this;
        }

        public Criteria andDjlxrzhiwuGreaterThan(String value) {
            addCriterion("DJLXRZHIWU >", value, "djlxrzhiwu");
            return (Criteria) this;
        }

        public Criteria andDjlxrzhiwuGreaterThanOrEqualTo(String value) {
            addCriterion("DJLXRZHIWU >=", value, "djlxrzhiwu");
            return (Criteria) this;
        }

        public Criteria andDjlxrzhiwuLessThan(String value) {
            addCriterion("DJLXRZHIWU <", value, "djlxrzhiwu");
            return (Criteria) this;
        }

        public Criteria andDjlxrzhiwuLessThanOrEqualTo(String value) {
            addCriterion("DJLXRZHIWU <=", value, "djlxrzhiwu");
            return (Criteria) this;
        }

        public Criteria andDjlxrzhiwuLike(String value) {
            addCriterion("DJLXRZHIWU like", value, "djlxrzhiwu");
            return (Criteria) this;
        }

        public Criteria andDjlxrzhiwuNotLike(String value) {
            addCriterion("DJLXRZHIWU not like", value, "djlxrzhiwu");
            return (Criteria) this;
        }

        public Criteria andDjlxrzhiwuIn(List<String> values) {
            addCriterion("DJLXRZHIWU in", values, "djlxrzhiwu");
            return (Criteria) this;
        }

        public Criteria andDjlxrzhiwuNotIn(List<String> values) {
            addCriterion("DJLXRZHIWU not in", values, "djlxrzhiwu");
            return (Criteria) this;
        }

        public Criteria andDjlxrzhiwuBetween(String value1, String value2) {
            addCriterion("DJLXRZHIWU between", value1, value2, "djlxrzhiwu");
            return (Criteria) this;
        }

        public Criteria andDjlxrzhiwuNotBetween(String value1, String value2) {
            addCriterion("DJLXRZHIWU not between", value1, value2, "djlxrzhiwu");
            return (Criteria) this;
        }

        public Criteria andIphoneIsNull() {
            addCriterion("IPHONE is null");
            return (Criteria) this;
        }

        public Criteria andIphoneIsNotNull() {
            addCriterion("IPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andIphoneEqualTo(Long value) {
            addCriterion("IPHONE =", value, "iphone");
            return (Criteria) this;
        }

        public Criteria andIphoneNotEqualTo(Long value) {
            addCriterion("IPHONE <>", value, "iphone");
            return (Criteria) this;
        }

        public Criteria andIphoneGreaterThan(Long value) {
            addCriterion("IPHONE >", value, "iphone");
            return (Criteria) this;
        }

        public Criteria andIphoneGreaterThanOrEqualTo(Long value) {
            addCriterion("IPHONE >=", value, "iphone");
            return (Criteria) this;
        }

        public Criteria andIphoneLessThan(Long value) {
            addCriterion("IPHONE <", value, "iphone");
            return (Criteria) this;
        }

        public Criteria andIphoneLessThanOrEqualTo(Long value) {
            addCriterion("IPHONE <=", value, "iphone");
            return (Criteria) this;
        }

        public Criteria andIphoneIn(List<Long> values) {
            addCriterion("IPHONE in", values, "iphone");
            return (Criteria) this;
        }

        public Criteria andIphoneNotIn(List<Long> values) {
            addCriterion("IPHONE not in", values, "iphone");
            return (Criteria) this;
        }

        public Criteria andIphoneBetween(Long value1, Long value2) {
            addCriterion("IPHONE between", value1, value2, "iphone");
            return (Criteria) this;
        }

        public Criteria andIphoneNotBetween(Long value1, Long value2) {
            addCriterion("IPHONE not between", value1, value2, "iphone");
            return (Criteria) this;
        }

        public Criteria andChangsuoIsNull() {
            addCriterion("CHANGSUO is null");
            return (Criteria) this;
        }

        public Criteria andChangsuoIsNotNull() {
            addCriterion("CHANGSUO is not null");
            return (Criteria) this;
        }

        public Criteria andChangsuoEqualTo(Short value) {
            addCriterion("CHANGSUO =", value, "changsuo");
            return (Criteria) this;
        }

        public Criteria andChangsuoNotEqualTo(Short value) {
            addCriterion("CHANGSUO <>", value, "changsuo");
            return (Criteria) this;
        }

        public Criteria andChangsuoGreaterThan(Short value) {
            addCriterion("CHANGSUO >", value, "changsuo");
            return (Criteria) this;
        }

        public Criteria andChangsuoGreaterThanOrEqualTo(Short value) {
            addCriterion("CHANGSUO >=", value, "changsuo");
            return (Criteria) this;
        }

        public Criteria andChangsuoLessThan(Short value) {
            addCriterion("CHANGSUO <", value, "changsuo");
            return (Criteria) this;
        }

        public Criteria andChangsuoLessThanOrEqualTo(Short value) {
            addCriterion("CHANGSUO <=", value, "changsuo");
            return (Criteria) this;
        }

        public Criteria andChangsuoIn(List<Short> values) {
            addCriterion("CHANGSUO in", values, "changsuo");
            return (Criteria) this;
        }

        public Criteria andChangsuoNotIn(List<Short> values) {
            addCriterion("CHANGSUO not in", values, "changsuo");
            return (Criteria) this;
        }

        public Criteria andChangsuoBetween(Short value1, Short value2) {
            addCriterion("CHANGSUO between", value1, value2, "changsuo");
            return (Criteria) this;
        }

        public Criteria andChangsuoNotBetween(Short value1, Short value2) {
            addCriterion("CHANGSUO not between", value1, value2, "changsuo");
            return (Criteria) this;
        }

        public Criteria andJingfeishueIsNull() {
            addCriterion("JINGFEISHUE is null");
            return (Criteria) this;
        }

        public Criteria andJingfeishueIsNotNull() {
            addCriterion("JINGFEISHUE is not null");
            return (Criteria) this;
        }

        public Criteria andJingfeishueEqualTo(Long value) {
            addCriterion("JINGFEISHUE =", value, "jingfeishue");
            return (Criteria) this;
        }

        public Criteria andJingfeishueNotEqualTo(Long value) {
            addCriterion("JINGFEISHUE <>", value, "jingfeishue");
            return (Criteria) this;
        }

        public Criteria andJingfeishueGreaterThan(Long value) {
            addCriterion("JINGFEISHUE >", value, "jingfeishue");
            return (Criteria) this;
        }

        public Criteria andJingfeishueGreaterThanOrEqualTo(Long value) {
            addCriterion("JINGFEISHUE >=", value, "jingfeishue");
            return (Criteria) this;
        }

        public Criteria andJingfeishueLessThan(Long value) {
            addCriterion("JINGFEISHUE <", value, "jingfeishue");
            return (Criteria) this;
        }

        public Criteria andJingfeishueLessThanOrEqualTo(Long value) {
            addCriterion("JINGFEISHUE <=", value, "jingfeishue");
            return (Criteria) this;
        }

        public Criteria andJingfeishueIn(List<Long> values) {
            addCriterion("JINGFEISHUE in", values, "jingfeishue");
            return (Criteria) this;
        }

        public Criteria andJingfeishueNotIn(List<Long> values) {
            addCriterion("JINGFEISHUE not in", values, "jingfeishue");
            return (Criteria) this;
        }

        public Criteria andJingfeishueBetween(Long value1, Long value2) {
            addCriterion("JINGFEISHUE between", value1, value2, "jingfeishue");
            return (Criteria) this;
        }

        public Criteria andJingfeishueNotBetween(Long value1, Long value2) {
            addCriterion("JINGFEISHUE not between", value1, value2, "jingfeishue");
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

        public Criteria andJingfeilaiyuanEqualTo(Short value) {
            addCriterion("JINGFEILAIYUAN =", value, "jingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andJingfeilaiyuanNotEqualTo(Short value) {
            addCriterion("JINGFEILAIYUAN <>", value, "jingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andJingfeilaiyuanGreaterThan(Short value) {
            addCriterion("JINGFEILAIYUAN >", value, "jingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andJingfeilaiyuanGreaterThanOrEqualTo(Short value) {
            addCriterion("JINGFEILAIYUAN >=", value, "jingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andJingfeilaiyuanLessThan(Short value) {
            addCriterion("JINGFEILAIYUAN <", value, "jingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andJingfeilaiyuanLessThanOrEqualTo(Short value) {
            addCriterion("JINGFEILAIYUAN <=", value, "jingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andJingfeilaiyuanIn(List<Short> values) {
            addCriterion("JINGFEILAIYUAN in", values, "jingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andJingfeilaiyuanNotIn(List<Short> values) {
            addCriterion("JINGFEILAIYUAN not in", values, "jingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andJingfeilaiyuanBetween(Short value1, Short value2) {
            addCriterion("JINGFEILAIYUAN between", value1, value2, "jingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andJingfeilaiyuanNotBetween(Short value1, Short value2) {
            addCriterion("JINGFEILAIYUAN not between", value1, value2, "jingfeilaiyuan");
            return (Criteria) this;
        }

        public Criteria andDangyuandahuishuIsNull() {
            addCriterion("DANGYUANDAHUISHU is null");
            return (Criteria) this;
        }

        public Criteria andDangyuandahuishuIsNotNull() {
            addCriterion("DANGYUANDAHUISHU is not null");
            return (Criteria) this;
        }

        public Criteria andDangyuandahuishuEqualTo(Long value) {
            addCriterion("DANGYUANDAHUISHU =", value, "dangyuandahuishu");
            return (Criteria) this;
        }

        public Criteria andDangyuandahuishuNotEqualTo(Long value) {
            addCriterion("DANGYUANDAHUISHU <>", value, "dangyuandahuishu");
            return (Criteria) this;
        }

        public Criteria andDangyuandahuishuGreaterThan(Long value) {
            addCriterion("DANGYUANDAHUISHU >", value, "dangyuandahuishu");
            return (Criteria) this;
        }

        public Criteria andDangyuandahuishuGreaterThanOrEqualTo(Long value) {
            addCriterion("DANGYUANDAHUISHU >=", value, "dangyuandahuishu");
            return (Criteria) this;
        }

        public Criteria andDangyuandahuishuLessThan(Long value) {
            addCriterion("DANGYUANDAHUISHU <", value, "dangyuandahuishu");
            return (Criteria) this;
        }

        public Criteria andDangyuandahuishuLessThanOrEqualTo(Long value) {
            addCriterion("DANGYUANDAHUISHU <=", value, "dangyuandahuishu");
            return (Criteria) this;
        }

        public Criteria andDangyuandahuishuIn(List<Long> values) {
            addCriterion("DANGYUANDAHUISHU in", values, "dangyuandahuishu");
            return (Criteria) this;
        }

        public Criteria andDangyuandahuishuNotIn(List<Long> values) {
            addCriterion("DANGYUANDAHUISHU not in", values, "dangyuandahuishu");
            return (Criteria) this;
        }

        public Criteria andDangyuandahuishuBetween(Long value1, Long value2) {
            addCriterion("DANGYUANDAHUISHU between", value1, value2, "dangyuandahuishu");
            return (Criteria) this;
        }

        public Criteria andDangyuandahuishuNotBetween(Long value1, Long value2) {
            addCriterion("DANGYUANDAHUISHU not between", value1, value2, "dangyuandahuishu");
            return (Criteria) this;
        }

        public Criteria andZhiweihuishuIsNull() {
            addCriterion("ZHIWEIHUISHU is null");
            return (Criteria) this;
        }

        public Criteria andZhiweihuishuIsNotNull() {
            addCriterion("ZHIWEIHUISHU is not null");
            return (Criteria) this;
        }

        public Criteria andZhiweihuishuEqualTo(Long value) {
            addCriterion("ZHIWEIHUISHU =", value, "zhiweihuishu");
            return (Criteria) this;
        }

        public Criteria andZhiweihuishuNotEqualTo(Long value) {
            addCriterion("ZHIWEIHUISHU <>", value, "zhiweihuishu");
            return (Criteria) this;
        }

        public Criteria andZhiweihuishuGreaterThan(Long value) {
            addCriterion("ZHIWEIHUISHU >", value, "zhiweihuishu");
            return (Criteria) this;
        }

        public Criteria andZhiweihuishuGreaterThanOrEqualTo(Long value) {
            addCriterion("ZHIWEIHUISHU >=", value, "zhiweihuishu");
            return (Criteria) this;
        }

        public Criteria andZhiweihuishuLessThan(Long value) {
            addCriterion("ZHIWEIHUISHU <", value, "zhiweihuishu");
            return (Criteria) this;
        }

        public Criteria andZhiweihuishuLessThanOrEqualTo(Long value) {
            addCriterion("ZHIWEIHUISHU <=", value, "zhiweihuishu");
            return (Criteria) this;
        }

        public Criteria andZhiweihuishuIn(List<Long> values) {
            addCriterion("ZHIWEIHUISHU in", values, "zhiweihuishu");
            return (Criteria) this;
        }

        public Criteria andZhiweihuishuNotIn(List<Long> values) {
            addCriterion("ZHIWEIHUISHU not in", values, "zhiweihuishu");
            return (Criteria) this;
        }

        public Criteria andZhiweihuishuBetween(Long value1, Long value2) {
            addCriterion("ZHIWEIHUISHU between", value1, value2, "zhiweihuishu");
            return (Criteria) this;
        }

        public Criteria andZhiweihuishuNotBetween(Long value1, Long value2) {
            addCriterion("ZHIWEIHUISHU not between", value1, value2, "zhiweihuishu");
            return (Criteria) this;
        }

        public Criteria andXiaozuhuishuIsNull() {
            addCriterion("XIAOZUHUISHU is null");
            return (Criteria) this;
        }

        public Criteria andXiaozuhuishuIsNotNull() {
            addCriterion("XIAOZUHUISHU is not null");
            return (Criteria) this;
        }

        public Criteria andXiaozuhuishuEqualTo(Long value) {
            addCriterion("XIAOZUHUISHU =", value, "xiaozuhuishu");
            return (Criteria) this;
        }

        public Criteria andXiaozuhuishuNotEqualTo(Long value) {
            addCriterion("XIAOZUHUISHU <>", value, "xiaozuhuishu");
            return (Criteria) this;
        }

        public Criteria andXiaozuhuishuGreaterThan(Long value) {
            addCriterion("XIAOZUHUISHU >", value, "xiaozuhuishu");
            return (Criteria) this;
        }

        public Criteria andXiaozuhuishuGreaterThanOrEqualTo(Long value) {
            addCriterion("XIAOZUHUISHU >=", value, "xiaozuhuishu");
            return (Criteria) this;
        }

        public Criteria andXiaozuhuishuLessThan(Long value) {
            addCriterion("XIAOZUHUISHU <", value, "xiaozuhuishu");
            return (Criteria) this;
        }

        public Criteria andXiaozuhuishuLessThanOrEqualTo(Long value) {
            addCriterion("XIAOZUHUISHU <=", value, "xiaozuhuishu");
            return (Criteria) this;
        }

        public Criteria andXiaozuhuishuIn(List<Long> values) {
            addCriterion("XIAOZUHUISHU in", values, "xiaozuhuishu");
            return (Criteria) this;
        }

        public Criteria andXiaozuhuishuNotIn(List<Long> values) {
            addCriterion("XIAOZUHUISHU not in", values, "xiaozuhuishu");
            return (Criteria) this;
        }

        public Criteria andXiaozuhuishuBetween(Long value1, Long value2) {
            addCriterion("XIAOZUHUISHU between", value1, value2, "xiaozuhuishu");
            return (Criteria) this;
        }

        public Criteria andXiaozuhuishuNotBetween(Long value1, Long value2) {
            addCriterion("XIAOZUHUISHU not between", value1, value2, "xiaozuhuishu");
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

        public Criteria andDangkeshuEqualTo(Long value) {
            addCriterion("DANGKESHU =", value, "dangkeshu");
            return (Criteria) this;
        }

        public Criteria andDangkeshuNotEqualTo(Long value) {
            addCriterion("DANGKESHU <>", value, "dangkeshu");
            return (Criteria) this;
        }

        public Criteria andDangkeshuGreaterThan(Long value) {
            addCriterion("DANGKESHU >", value, "dangkeshu");
            return (Criteria) this;
        }

        public Criteria andDangkeshuGreaterThanOrEqualTo(Long value) {
            addCriterion("DANGKESHU >=", value, "dangkeshu");
            return (Criteria) this;
        }

        public Criteria andDangkeshuLessThan(Long value) {
            addCriterion("DANGKESHU <", value, "dangkeshu");
            return (Criteria) this;
        }

        public Criteria andDangkeshuLessThanOrEqualTo(Long value) {
            addCriterion("DANGKESHU <=", value, "dangkeshu");
            return (Criteria) this;
        }

        public Criteria andDangkeshuIn(List<Long> values) {
            addCriterion("DANGKESHU in", values, "dangkeshu");
            return (Criteria) this;
        }

        public Criteria andDangkeshuNotIn(List<Long> values) {
            addCriterion("DANGKESHU not in", values, "dangkeshu");
            return (Criteria) this;
        }

        public Criteria andDangkeshuBetween(Long value1, Long value2) {
            addCriterion("DANGKESHU between", value1, value2, "dangkeshu");
            return (Criteria) this;
        }

        public Criteria andDangkeshuNotBetween(Long value1, Long value2) {
            addCriterion("DANGKESHU not between", value1, value2, "dangkeshu");
            return (Criteria) this;
        }

        public Criteria andIsgonghuiIsNull() {
            addCriterion("ISGONGHUI is null");
            return (Criteria) this;
        }

        public Criteria andIsgonghuiIsNotNull() {
            addCriterion("ISGONGHUI is not null");
            return (Criteria) this;
        }

        public Criteria andIsgonghuiEqualTo(Short value) {
            addCriterion("ISGONGHUI =", value, "isgonghui");
            return (Criteria) this;
        }

        public Criteria andIsgonghuiNotEqualTo(Short value) {
            addCriterion("ISGONGHUI <>", value, "isgonghui");
            return (Criteria) this;
        }

        public Criteria andIsgonghuiGreaterThan(Short value) {
            addCriterion("ISGONGHUI >", value, "isgonghui");
            return (Criteria) this;
        }

        public Criteria andIsgonghuiGreaterThanOrEqualTo(Short value) {
            addCriterion("ISGONGHUI >=", value, "isgonghui");
            return (Criteria) this;
        }

        public Criteria andIsgonghuiLessThan(Short value) {
            addCriterion("ISGONGHUI <", value, "isgonghui");
            return (Criteria) this;
        }

        public Criteria andIsgonghuiLessThanOrEqualTo(Short value) {
            addCriterion("ISGONGHUI <=", value, "isgonghui");
            return (Criteria) this;
        }

        public Criteria andIsgonghuiIn(List<Short> values) {
            addCriterion("ISGONGHUI in", values, "isgonghui");
            return (Criteria) this;
        }

        public Criteria andIsgonghuiNotIn(List<Short> values) {
            addCriterion("ISGONGHUI not in", values, "isgonghui");
            return (Criteria) this;
        }

        public Criteria andIsgonghuiBetween(Short value1, Short value2) {
            addCriterion("ISGONGHUI between", value1, value2, "isgonghui");
            return (Criteria) this;
        }

        public Criteria andIsgonghuiNotBetween(Short value1, Short value2) {
            addCriterion("ISGONGHUI not between", value1, value2, "isgonghui");
            return (Criteria) this;
        }

        public Criteria andIstuanzuzhiIsNull() {
            addCriterion("ISTUANZUZHI is null");
            return (Criteria) this;
        }

        public Criteria andIstuanzuzhiIsNotNull() {
            addCriterion("ISTUANZUZHI is not null");
            return (Criteria) this;
        }

        public Criteria andIstuanzuzhiEqualTo(Short value) {
            addCriterion("ISTUANZUZHI =", value, "istuanzuzhi");
            return (Criteria) this;
        }

        public Criteria andIstuanzuzhiNotEqualTo(Short value) {
            addCriterion("ISTUANZUZHI <>", value, "istuanzuzhi");
            return (Criteria) this;
        }

        public Criteria andIstuanzuzhiGreaterThan(Short value) {
            addCriterion("ISTUANZUZHI >", value, "istuanzuzhi");
            return (Criteria) this;
        }

        public Criteria andIstuanzuzhiGreaterThanOrEqualTo(Short value) {
            addCriterion("ISTUANZUZHI >=", value, "istuanzuzhi");
            return (Criteria) this;
        }

        public Criteria andIstuanzuzhiLessThan(Short value) {
            addCriterion("ISTUANZUZHI <", value, "istuanzuzhi");
            return (Criteria) this;
        }

        public Criteria andIstuanzuzhiLessThanOrEqualTo(Short value) {
            addCriterion("ISTUANZUZHI <=", value, "istuanzuzhi");
            return (Criteria) this;
        }

        public Criteria andIstuanzuzhiIn(List<Short> values) {
            addCriterion("ISTUANZUZHI in", values, "istuanzuzhi");
            return (Criteria) this;
        }

        public Criteria andIstuanzuzhiNotIn(List<Short> values) {
            addCriterion("ISTUANZUZHI not in", values, "istuanzuzhi");
            return (Criteria) this;
        }

        public Criteria andIstuanzuzhiBetween(Short value1, Short value2) {
            addCriterion("ISTUANZUZHI between", value1, value2, "istuanzuzhi");
            return (Criteria) this;
        }

        public Criteria andIstuanzuzhiNotBetween(Short value1, Short value2) {
            addCriterion("ISTUANZUZHI not between", value1, value2, "istuanzuzhi");
            return (Criteria) this;
        }

        public Criteria andIsfulianIsNull() {
            addCriterion("ISFULIAN is null");
            return (Criteria) this;
        }

        public Criteria andIsfulianIsNotNull() {
            addCriterion("ISFULIAN is not null");
            return (Criteria) this;
        }

        public Criteria andIsfulianEqualTo(Short value) {
            addCriterion("ISFULIAN =", value, "isfulian");
            return (Criteria) this;
        }

        public Criteria andIsfulianNotEqualTo(Short value) {
            addCriterion("ISFULIAN <>", value, "isfulian");
            return (Criteria) this;
        }

        public Criteria andIsfulianGreaterThan(Short value) {
            addCriterion("ISFULIAN >", value, "isfulian");
            return (Criteria) this;
        }

        public Criteria andIsfulianGreaterThanOrEqualTo(Short value) {
            addCriterion("ISFULIAN >=", value, "isfulian");
            return (Criteria) this;
        }

        public Criteria andIsfulianLessThan(Short value) {
            addCriterion("ISFULIAN <", value, "isfulian");
            return (Criteria) this;
        }

        public Criteria andIsfulianLessThanOrEqualTo(Short value) {
            addCriterion("ISFULIAN <=", value, "isfulian");
            return (Criteria) this;
        }

        public Criteria andIsfulianIn(List<Short> values) {
            addCriterion("ISFULIAN in", values, "isfulian");
            return (Criteria) this;
        }

        public Criteria andIsfulianNotIn(List<Short> values) {
            addCriterion("ISFULIAN not in", values, "isfulian");
            return (Criteria) this;
        }

        public Criteria andIsfulianBetween(Short value1, Short value2) {
            addCriterion("ISFULIAN between", value1, value2, "isfulian");
            return (Criteria) this;
        }

        public Criteria andIsfulianNotBetween(Short value1, Short value2) {
            addCriterion("ISFULIAN not between", value1, value2, "isfulian");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuIsNull() {
            addCriterion("HUODONGCISHU is null");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuIsNotNull() {
            addCriterion("HUODONGCISHU is not null");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuEqualTo(Long value) {
            addCriterion("HUODONGCISHU =", value, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuNotEqualTo(Long value) {
            addCriterion("HUODONGCISHU <>", value, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuGreaterThan(Long value) {
            addCriterion("HUODONGCISHU >", value, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuGreaterThanOrEqualTo(Long value) {
            addCriterion("HUODONGCISHU >=", value, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuLessThan(Long value) {
            addCriterion("HUODONGCISHU <", value, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuLessThanOrEqualTo(Long value) {
            addCriterion("HUODONGCISHU <=", value, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuIn(List<Long> values) {
            addCriterion("HUODONGCISHU in", values, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuNotIn(List<Long> values) {
            addCriterion("HUODONGCISHU not in", values, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuBetween(Long value1, Long value2) {
            addCriterion("HUODONGCISHU between", value1, value2, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andHuodongcishuNotBetween(Long value1, Long value2) {
            addCriterion("HUODONGCISHU not between", value1, value2, "huodongcishu");
            return (Criteria) this;
        }

        public Criteria andZongrenshuIsNull() {
            addCriterion("ZONGRENSHU is null");
            return (Criteria) this;
        }

        public Criteria andZongrenshuIsNotNull() {
            addCriterion("ZONGRENSHU is not null");
            return (Criteria) this;
        }

        public Criteria andZongrenshuEqualTo(Long value) {
            addCriterion("ZONGRENSHU =", value, "zongrenshu");
            return (Criteria) this;
        }

        public Criteria andZongrenshuNotEqualTo(Long value) {
            addCriterion("ZONGRENSHU <>", value, "zongrenshu");
            return (Criteria) this;
        }

        public Criteria andZongrenshuGreaterThan(Long value) {
            addCriterion("ZONGRENSHU >", value, "zongrenshu");
            return (Criteria) this;
        }

        public Criteria andZongrenshuGreaterThanOrEqualTo(Long value) {
            addCriterion("ZONGRENSHU >=", value, "zongrenshu");
            return (Criteria) this;
        }

        public Criteria andZongrenshuLessThan(Long value) {
            addCriterion("ZONGRENSHU <", value, "zongrenshu");
            return (Criteria) this;
        }

        public Criteria andZongrenshuLessThanOrEqualTo(Long value) {
            addCriterion("ZONGRENSHU <=", value, "zongrenshu");
            return (Criteria) this;
        }

        public Criteria andZongrenshuIn(List<Long> values) {
            addCriterion("ZONGRENSHU in", values, "zongrenshu");
            return (Criteria) this;
        }

        public Criteria andZongrenshuNotIn(List<Long> values) {
            addCriterion("ZONGRENSHU not in", values, "zongrenshu");
            return (Criteria) this;
        }

        public Criteria andZongrenshuBetween(Long value1, Long value2) {
            addCriterion("ZONGRENSHU between", value1, value2, "zongrenshu");
            return (Criteria) this;
        }

        public Criteria andZongrenshuNotBetween(Long value1, Long value2) {
            addCriterion("ZONGRENSHU not between", value1, value2, "zongrenshu");
            return (Criteria) this;
        }

        public Criteria andIsgonghui1IsNull() {
            addCriterion("ISGONGHUI1 is null");
            return (Criteria) this;
        }

        public Criteria andIsgonghui1IsNotNull() {
            addCriterion("ISGONGHUI1 is not null");
            return (Criteria) this;
        }

        public Criteria andIsgonghui1EqualTo(Short value) {
            addCriterion("ISGONGHUI1 =", value, "isgonghui1");
            return (Criteria) this;
        }

        public Criteria andIsgonghui1NotEqualTo(Short value) {
            addCriterion("ISGONGHUI1 <>", value, "isgonghui1");
            return (Criteria) this;
        }

        public Criteria andIsgonghui1GreaterThan(Short value) {
            addCriterion("ISGONGHUI1 >", value, "isgonghui1");
            return (Criteria) this;
        }

        public Criteria andIsgonghui1GreaterThanOrEqualTo(Short value) {
            addCriterion("ISGONGHUI1 >=", value, "isgonghui1");
            return (Criteria) this;
        }

        public Criteria andIsgonghui1LessThan(Short value) {
            addCriterion("ISGONGHUI1 <", value, "isgonghui1");
            return (Criteria) this;
        }

        public Criteria andIsgonghui1LessThanOrEqualTo(Short value) {
            addCriterion("ISGONGHUI1 <=", value, "isgonghui1");
            return (Criteria) this;
        }

        public Criteria andIsgonghui1In(List<Short> values) {
            addCriterion("ISGONGHUI1 in", values, "isgonghui1");
            return (Criteria) this;
        }

        public Criteria andIsgonghui1NotIn(List<Short> values) {
            addCriterion("ISGONGHUI1 not in", values, "isgonghui1");
            return (Criteria) this;
        }

        public Criteria andIsgonghui1Between(Short value1, Short value2) {
            addCriterion("ISGONGHUI1 between", value1, value2, "isgonghui1");
            return (Criteria) this;
        }

        public Criteria andIsgonghui1NotBetween(Short value1, Short value2) {
            addCriterion("ISGONGHUI1 not between", value1, value2, "isgonghui1");
            return (Criteria) this;
        }

        public Criteria andIstuanzuzhi1IsNull() {
            addCriterion("ISTUANZUZHI1 is null");
            return (Criteria) this;
        }

        public Criteria andIstuanzuzhi1IsNotNull() {
            addCriterion("ISTUANZUZHI1 is not null");
            return (Criteria) this;
        }

        public Criteria andIstuanzuzhi1EqualTo(Short value) {
            addCriterion("ISTUANZUZHI1 =", value, "istuanzuzhi1");
            return (Criteria) this;
        }

        public Criteria andIstuanzuzhi1NotEqualTo(Short value) {
            addCriterion("ISTUANZUZHI1 <>", value, "istuanzuzhi1");
            return (Criteria) this;
        }

        public Criteria andIstuanzuzhi1GreaterThan(Short value) {
            addCriterion("ISTUANZUZHI1 >", value, "istuanzuzhi1");
            return (Criteria) this;
        }

        public Criteria andIstuanzuzhi1GreaterThanOrEqualTo(Short value) {
            addCriterion("ISTUANZUZHI1 >=", value, "istuanzuzhi1");
            return (Criteria) this;
        }

        public Criteria andIstuanzuzhi1LessThan(Short value) {
            addCriterion("ISTUANZUZHI1 <", value, "istuanzuzhi1");
            return (Criteria) this;
        }

        public Criteria andIstuanzuzhi1LessThanOrEqualTo(Short value) {
            addCriterion("ISTUANZUZHI1 <=", value, "istuanzuzhi1");
            return (Criteria) this;
        }

        public Criteria andIstuanzuzhi1In(List<Short> values) {
            addCriterion("ISTUANZUZHI1 in", values, "istuanzuzhi1");
            return (Criteria) this;
        }

        public Criteria andIstuanzuzhi1NotIn(List<Short> values) {
            addCriterion("ISTUANZUZHI1 not in", values, "istuanzuzhi1");
            return (Criteria) this;
        }

        public Criteria andIstuanzuzhi1Between(Short value1, Short value2) {
            addCriterion("ISTUANZUZHI1 between", value1, value2, "istuanzuzhi1");
            return (Criteria) this;
        }

        public Criteria andIstuanzuzhi1NotBetween(Short value1, Short value2) {
            addCriterion("ISTUANZUZHI1 not between", value1, value2, "istuanzuzhi1");
            return (Criteria) this;
        }

        public Criteria andIsfulian1IsNull() {
            addCriterion("ISFULIAN1 is null");
            return (Criteria) this;
        }

        public Criteria andIsfulian1IsNotNull() {
            addCriterion("ISFULIAN1 is not null");
            return (Criteria) this;
        }

        public Criteria andIsfulian1EqualTo(Short value) {
            addCriterion("ISFULIAN1 =", value, "isfulian1");
            return (Criteria) this;
        }

        public Criteria andIsfulian1NotEqualTo(Short value) {
            addCriterion("ISFULIAN1 <>", value, "isfulian1");
            return (Criteria) this;
        }

        public Criteria andIsfulian1GreaterThan(Short value) {
            addCriterion("ISFULIAN1 >", value, "isfulian1");
            return (Criteria) this;
        }

        public Criteria andIsfulian1GreaterThanOrEqualTo(Short value) {
            addCriterion("ISFULIAN1 >=", value, "isfulian1");
            return (Criteria) this;
        }

        public Criteria andIsfulian1LessThan(Short value) {
            addCriterion("ISFULIAN1 <", value, "isfulian1");
            return (Criteria) this;
        }

        public Criteria andIsfulian1LessThanOrEqualTo(Short value) {
            addCriterion("ISFULIAN1 <=", value, "isfulian1");
            return (Criteria) this;
        }

        public Criteria andIsfulian1In(List<Short> values) {
            addCriterion("ISFULIAN1 in", values, "isfulian1");
            return (Criteria) this;
        }

        public Criteria andIsfulian1NotIn(List<Short> values) {
            addCriterion("ISFULIAN1 not in", values, "isfulian1");
            return (Criteria) this;
        }

        public Criteria andIsfulian1Between(Short value1, Short value2) {
            addCriterion("ISFULIAN1 between", value1, value2, "isfulian1");
            return (Criteria) this;
        }

        public Criteria andIsfulian1NotBetween(Short value1, Short value2) {
            addCriterion("ISFULIAN1 not between", value1, value2, "isfulian1");
            return (Criteria) this;
        }

        public Criteria andHuodongcishu1IsNull() {
            addCriterion("HUODONGCISHU1 is null");
            return (Criteria) this;
        }

        public Criteria andHuodongcishu1IsNotNull() {
            addCriterion("HUODONGCISHU1 is not null");
            return (Criteria) this;
        }

        public Criteria andHuodongcishu1EqualTo(Long value) {
            addCriterion("HUODONGCISHU1 =", value, "huodongcishu1");
            return (Criteria) this;
        }

        public Criteria andHuodongcishu1NotEqualTo(Long value) {
            addCriterion("HUODONGCISHU1 <>", value, "huodongcishu1");
            return (Criteria) this;
        }

        public Criteria andHuodongcishu1GreaterThan(Long value) {
            addCriterion("HUODONGCISHU1 >", value, "huodongcishu1");
            return (Criteria) this;
        }

        public Criteria andHuodongcishu1GreaterThanOrEqualTo(Long value) {
            addCriterion("HUODONGCISHU1 >=", value, "huodongcishu1");
            return (Criteria) this;
        }

        public Criteria andHuodongcishu1LessThan(Long value) {
            addCriterion("HUODONGCISHU1 <", value, "huodongcishu1");
            return (Criteria) this;
        }

        public Criteria andHuodongcishu1LessThanOrEqualTo(Long value) {
            addCriterion("HUODONGCISHU1 <=", value, "huodongcishu1");
            return (Criteria) this;
        }

        public Criteria andHuodongcishu1In(List<Long> values) {
            addCriterion("HUODONGCISHU1 in", values, "huodongcishu1");
            return (Criteria) this;
        }

        public Criteria andHuodongcishu1NotIn(List<Long> values) {
            addCriterion("HUODONGCISHU1 not in", values, "huodongcishu1");
            return (Criteria) this;
        }

        public Criteria andHuodongcishu1Between(Long value1, Long value2) {
            addCriterion("HUODONGCISHU1 between", value1, value2, "huodongcishu1");
            return (Criteria) this;
        }

        public Criteria andHuodongcishu1NotBetween(Long value1, Long value2) {
            addCriterion("HUODONGCISHU1 not between", value1, value2, "huodongcishu1");
            return (Criteria) this;
        }

        public Criteria andLlyxingmingIsNull() {
            addCriterion("LLYXINGMING is null");
            return (Criteria) this;
        }

        public Criteria andLlyxingmingIsNotNull() {
            addCriterion("LLYXINGMING is not null");
            return (Criteria) this;
        }

        public Criteria andLlyxingmingEqualTo(String value) {
            addCriterion("LLYXINGMING =", value, "llyxingming");
            return (Criteria) this;
        }

        public Criteria andLlyxingmingNotEqualTo(String value) {
            addCriterion("LLYXINGMING <>", value, "llyxingming");
            return (Criteria) this;
        }

        public Criteria andLlyxingmingGreaterThan(String value) {
            addCriterion("LLYXINGMING >", value, "llyxingming");
            return (Criteria) this;
        }

        public Criteria andLlyxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("LLYXINGMING >=", value, "llyxingming");
            return (Criteria) this;
        }

        public Criteria andLlyxingmingLessThan(String value) {
            addCriterion("LLYXINGMING <", value, "llyxingming");
            return (Criteria) this;
        }

        public Criteria andLlyxingmingLessThanOrEqualTo(String value) {
            addCriterion("LLYXINGMING <=", value, "llyxingming");
            return (Criteria) this;
        }

        public Criteria andLlyxingmingLike(String value) {
            addCriterion("LLYXINGMING like", value, "llyxingming");
            return (Criteria) this;
        }

        public Criteria andLlyxingmingNotLike(String value) {
            addCriterion("LLYXINGMING not like", value, "llyxingming");
            return (Criteria) this;
        }

        public Criteria andLlyxingmingIn(List<String> values) {
            addCriterion("LLYXINGMING in", values, "llyxingming");
            return (Criteria) this;
        }

        public Criteria andLlyxingmingNotIn(List<String> values) {
            addCriterion("LLYXINGMING not in", values, "llyxingming");
            return (Criteria) this;
        }

        public Criteria andLlyxingmingBetween(String value1, String value2) {
            addCriterion("LLYXINGMING between", value1, value2, "llyxingming");
            return (Criteria) this;
        }

        public Criteria andLlyxingmingNotBetween(String value1, String value2) {
            addCriterion("LLYXINGMING not between", value1, value2, "llyxingming");
            return (Criteria) this;
        }

        public Criteria andLlyiphone0IsNull() {
            addCriterion("LLYIPHONE_0 is null");
            return (Criteria) this;
        }

        public Criteria andLlyiphone0IsNotNull() {
            addCriterion("LLYIPHONE_0 is not null");
            return (Criteria) this;
        }

        public Criteria andLlyiphone0EqualTo(Long value) {
            addCriterion("LLYIPHONE_0 =", value, "llyiphone0");
            return (Criteria) this;
        }

        public Criteria andLlyiphone0NotEqualTo(Long value) {
            addCriterion("LLYIPHONE_0 <>", value, "llyiphone0");
            return (Criteria) this;
        }

        public Criteria andLlyiphone0GreaterThan(Long value) {
            addCriterion("LLYIPHONE_0 >", value, "llyiphone0");
            return (Criteria) this;
        }

        public Criteria andLlyiphone0GreaterThanOrEqualTo(Long value) {
            addCriterion("LLYIPHONE_0 >=", value, "llyiphone0");
            return (Criteria) this;
        }

        public Criteria andLlyiphone0LessThan(Long value) {
            addCriterion("LLYIPHONE_0 <", value, "llyiphone0");
            return (Criteria) this;
        }

        public Criteria andLlyiphone0LessThanOrEqualTo(Long value) {
            addCriterion("LLYIPHONE_0 <=", value, "llyiphone0");
            return (Criteria) this;
        }

        public Criteria andLlyiphone0In(List<Long> values) {
            addCriterion("LLYIPHONE_0 in", values, "llyiphone0");
            return (Criteria) this;
        }

        public Criteria andLlyiphone0NotIn(List<Long> values) {
            addCriterion("LLYIPHONE_0 not in", values, "llyiphone0");
            return (Criteria) this;
        }

        public Criteria andLlyiphone0Between(Long value1, Long value2) {
            addCriterion("LLYIPHONE_0 between", value1, value2, "llyiphone0");
            return (Criteria) this;
        }

        public Criteria andLlyiphone0NotBetween(Long value1, Long value2) {
            addCriterion("LLYIPHONE_0 not between", value1, value2, "llyiphone0");
            return (Criteria) this;
        }

        public Criteria andPaichudanweiIsNull() {
            addCriterion("PAICHUDANWEI is null");
            return (Criteria) this;
        }

        public Criteria andPaichudanweiIsNotNull() {
            addCriterion("PAICHUDANWEI is not null");
            return (Criteria) this;
        }

        public Criteria andPaichudanweiEqualTo(String value) {
            addCriterion("PAICHUDANWEI =", value, "paichudanwei");
            return (Criteria) this;
        }

        public Criteria andPaichudanweiNotEqualTo(String value) {
            addCriterion("PAICHUDANWEI <>", value, "paichudanwei");
            return (Criteria) this;
        }

        public Criteria andPaichudanweiGreaterThan(String value) {
            addCriterion("PAICHUDANWEI >", value, "paichudanwei");
            return (Criteria) this;
        }

        public Criteria andPaichudanweiGreaterThanOrEqualTo(String value) {
            addCriterion("PAICHUDANWEI >=", value, "paichudanwei");
            return (Criteria) this;
        }

        public Criteria andPaichudanweiLessThan(String value) {
            addCriterion("PAICHUDANWEI <", value, "paichudanwei");
            return (Criteria) this;
        }

        public Criteria andPaichudanweiLessThanOrEqualTo(String value) {
            addCriterion("PAICHUDANWEI <=", value, "paichudanwei");
            return (Criteria) this;
        }

        public Criteria andPaichudanweiLike(String value) {
            addCriterion("PAICHUDANWEI like", value, "paichudanwei");
            return (Criteria) this;
        }

        public Criteria andPaichudanweiNotLike(String value) {
            addCriterion("PAICHUDANWEI not like", value, "paichudanwei");
            return (Criteria) this;
        }

        public Criteria andPaichudanweiIn(List<String> values) {
            addCriterion("PAICHUDANWEI in", values, "paichudanwei");
            return (Criteria) this;
        }

        public Criteria andPaichudanweiNotIn(List<String> values) {
            addCriterion("PAICHUDANWEI not in", values, "paichudanwei");
            return (Criteria) this;
        }

        public Criteria andPaichudanweiBetween(String value1, String value2) {
            addCriterion("PAICHUDANWEI between", value1, value2, "paichudanwei");
            return (Criteria) this;
        }

        public Criteria andPaichudanweiNotBetween(String value1, String value2) {
            addCriterion("PAICHUDANWEI not between", value1, value2, "paichudanwei");
            return (Criteria) this;
        }

        public Criteria andHuiyuanIsNull() {
            addCriterion("HUIYUAN is null");
            return (Criteria) this;
        }

        public Criteria andHuiyuanIsNotNull() {
            addCriterion("HUIYUAN is not null");
            return (Criteria) this;
        }

        public Criteria andHuiyuanEqualTo(Object value) {
            addCriterion("HUIYUAN =", value, "huiyuan");
            return (Criteria) this;
        }

        public Criteria andHuiyuanNotEqualTo(Object value) {
            addCriterion("HUIYUAN <>", value, "huiyuan");
            return (Criteria) this;
        }

        public Criteria andHuiyuanGreaterThan(Object value) {
            addCriterion("HUIYUAN >", value, "huiyuan");
            return (Criteria) this;
        }

        public Criteria andHuiyuanGreaterThanOrEqualTo(Object value) {
            addCriterion("HUIYUAN >=", value, "huiyuan");
            return (Criteria) this;
        }

        public Criteria andHuiyuanLessThan(Object value) {
            addCriterion("HUIYUAN <", value, "huiyuan");
            return (Criteria) this;
        }

        public Criteria andHuiyuanLessThanOrEqualTo(Object value) {
            addCriterion("HUIYUAN <=", value, "huiyuan");
            return (Criteria) this;
        }

        public Criteria andHuiyuanIn(List<Object> values) {
            addCriterion("HUIYUAN in", values, "huiyuan");
            return (Criteria) this;
        }

        public Criteria andHuiyuanNotIn(List<Object> values) {
            addCriterion("HUIYUAN not in", values, "huiyuan");
            return (Criteria) this;
        }

        public Criteria andHuiyuanBetween(Object value1, Object value2) {
            addCriterion("HUIYUAN between", value1, value2, "huiyuan");
            return (Criteria) this;
        }

        public Criteria andHuiyuanNotBetween(Object value1, Object value2) {
            addCriterion("HUIYUAN not between", value1, value2, "huiyuan");
            return (Criteria) this;
        }

        public Criteria andLishihuiIsNull() {
            addCriterion("LISHIHUI is null");
            return (Criteria) this;
        }

        public Criteria andLishihuiIsNotNull() {
            addCriterion("LISHIHUI is not null");
            return (Criteria) this;
        }

        public Criteria andLishihuiEqualTo(Object value) {
            addCriterion("LISHIHUI =", value, "lishihui");
            return (Criteria) this;
        }

        public Criteria andLishihuiNotEqualTo(Object value) {
            addCriterion("LISHIHUI <>", value, "lishihui");
            return (Criteria) this;
        }

        public Criteria andLishihuiGreaterThan(Object value) {
            addCriterion("LISHIHUI >", value, "lishihui");
            return (Criteria) this;
        }

        public Criteria andLishihuiGreaterThanOrEqualTo(Object value) {
            addCriterion("LISHIHUI >=", value, "lishihui");
            return (Criteria) this;
        }

        public Criteria andLishihuiLessThan(Object value) {
            addCriterion("LISHIHUI <", value, "lishihui");
            return (Criteria) this;
        }

        public Criteria andLishihuiLessThanOrEqualTo(Object value) {
            addCriterion("LISHIHUI <=", value, "lishihui");
            return (Criteria) this;
        }

        public Criteria andLishihuiIn(List<Object> values) {
            addCriterion("LISHIHUI in", values, "lishihui");
            return (Criteria) this;
        }

        public Criteria andLishihuiNotIn(List<Object> values) {
            addCriterion("LISHIHUI not in", values, "lishihui");
            return (Criteria) this;
        }

        public Criteria andLishihuiBetween(Object value1, Object value2) {
            addCriterion("LISHIHUI between", value1, value2, "lishihui");
            return (Criteria) this;
        }

        public Criteria andLishihuiNotBetween(Object value1, Object value2) {
            addCriterion("LISHIHUI not between", value1, value2, "lishihui");
            return (Criteria) this;
        }

        public Criteria andCwlishihuiIsNull() {
            addCriterion("CWLISHIHUI is null");
            return (Criteria) this;
        }

        public Criteria andCwlishihuiIsNotNull() {
            addCriterion("CWLISHIHUI is not null");
            return (Criteria) this;
        }

        public Criteria andCwlishihuiEqualTo(Object value) {
            addCriterion("CWLISHIHUI =", value, "cwlishihui");
            return (Criteria) this;
        }

        public Criteria andCwlishihuiNotEqualTo(Object value) {
            addCriterion("CWLISHIHUI <>", value, "cwlishihui");
            return (Criteria) this;
        }

        public Criteria andCwlishihuiGreaterThan(Object value) {
            addCriterion("CWLISHIHUI >", value, "cwlishihui");
            return (Criteria) this;
        }

        public Criteria andCwlishihuiGreaterThanOrEqualTo(Object value) {
            addCriterion("CWLISHIHUI >=", value, "cwlishihui");
            return (Criteria) this;
        }

        public Criteria andCwlishihuiLessThan(Object value) {
            addCriterion("CWLISHIHUI <", value, "cwlishihui");
            return (Criteria) this;
        }

        public Criteria andCwlishihuiLessThanOrEqualTo(Object value) {
            addCriterion("CWLISHIHUI <=", value, "cwlishihui");
            return (Criteria) this;
        }

        public Criteria andCwlishihuiIn(List<Object> values) {
            addCriterion("CWLISHIHUI in", values, "cwlishihui");
            return (Criteria) this;
        }

        public Criteria andCwlishihuiNotIn(List<Object> values) {
            addCriterion("CWLISHIHUI not in", values, "cwlishihui");
            return (Criteria) this;
        }

        public Criteria andCwlishihuiBetween(Object value1, Object value2) {
            addCriterion("CWLISHIHUI between", value1, value2, "cwlishihui");
            return (Criteria) this;
        }

        public Criteria andCwlishihuiNotBetween(Object value1, Object value2) {
            addCriterion("CWLISHIHUI not between", value1, value2, "cwlishihui");
            return (Criteria) this;
        }

        public Criteria andBangonghuiIsNull() {
            addCriterion("BANGONGHUI is null");
            return (Criteria) this;
        }

        public Criteria andBangonghuiIsNotNull() {
            addCriterion("BANGONGHUI is not null");
            return (Criteria) this;
        }

        public Criteria andBangonghuiEqualTo(Object value) {
            addCriterion("BANGONGHUI =", value, "bangonghui");
            return (Criteria) this;
        }

        public Criteria andBangonghuiNotEqualTo(Object value) {
            addCriterion("BANGONGHUI <>", value, "bangonghui");
            return (Criteria) this;
        }

        public Criteria andBangonghuiGreaterThan(Object value) {
            addCriterion("BANGONGHUI >", value, "bangonghui");
            return (Criteria) this;
        }

        public Criteria andBangonghuiGreaterThanOrEqualTo(Object value) {
            addCriterion("BANGONGHUI >=", value, "bangonghui");
            return (Criteria) this;
        }

        public Criteria andBangonghuiLessThan(Object value) {
            addCriterion("BANGONGHUI <", value, "bangonghui");
            return (Criteria) this;
        }

        public Criteria andBangonghuiLessThanOrEqualTo(Object value) {
            addCriterion("BANGONGHUI <=", value, "bangonghui");
            return (Criteria) this;
        }

        public Criteria andBangonghuiIn(List<Object> values) {
            addCriterion("BANGONGHUI in", values, "bangonghui");
            return (Criteria) this;
        }

        public Criteria andBangonghuiNotIn(List<Object> values) {
            addCriterion("BANGONGHUI not in", values, "bangonghui");
            return (Criteria) this;
        }

        public Criteria andBangonghuiBetween(Object value1, Object value2) {
            addCriterion("BANGONGHUI between", value1, value2, "bangonghui");
            return (Criteria) this;
        }

        public Criteria andBangonghuiNotBetween(Object value1, Object value2) {
            addCriterion("BANGONGHUI not between", value1, value2, "bangonghui");
            return (Criteria) this;
        }

        public Criteria andLlyiphoneIsNull() {
            addCriterion("LLYIPHONE is null");
            return (Criteria) this;
        }

        public Criteria andLlyiphoneIsNotNull() {
            addCriterion("LLYIPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andLlyiphoneEqualTo(String value) {
            addCriterion("LLYIPHONE =", value, "llyiphone");
            return (Criteria) this;
        }

        public Criteria andLlyiphoneNotEqualTo(String value) {
            addCriterion("LLYIPHONE <>", value, "llyiphone");
            return (Criteria) this;
        }

        public Criteria andLlyiphoneGreaterThan(String value) {
            addCriterion("LLYIPHONE >", value, "llyiphone");
            return (Criteria) this;
        }

        public Criteria andLlyiphoneGreaterThanOrEqualTo(String value) {
            addCriterion("LLYIPHONE >=", value, "llyiphone");
            return (Criteria) this;
        }

        public Criteria andLlyiphoneLessThan(String value) {
            addCriterion("LLYIPHONE <", value, "llyiphone");
            return (Criteria) this;
        }

        public Criteria andLlyiphoneLessThanOrEqualTo(String value) {
            addCriterion("LLYIPHONE <=", value, "llyiphone");
            return (Criteria) this;
        }

        public Criteria andLlyiphoneLike(String value) {
            addCriterion("LLYIPHONE like", value, "llyiphone");
            return (Criteria) this;
        }

        public Criteria andLlyiphoneNotLike(String value) {
            addCriterion("LLYIPHONE not like", value, "llyiphone");
            return (Criteria) this;
        }

        public Criteria andLlyiphoneIn(List<String> values) {
            addCriterion("LLYIPHONE in", values, "llyiphone");
            return (Criteria) this;
        }

        public Criteria andLlyiphoneNotIn(List<String> values) {
            addCriterion("LLYIPHONE not in", values, "llyiphone");
            return (Criteria) this;
        }

        public Criteria andLlyiphoneBetween(String value1, String value2) {
            addCriterion("LLYIPHONE between", value1, value2, "llyiphone");
            return (Criteria) this;
        }

        public Criteria andLlyiphoneNotBetween(String value1, String value2) {
            addCriterion("LLYIPHONE not between", value1, value2, "llyiphone");
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