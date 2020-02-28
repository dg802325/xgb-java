package com.xgb.model;

import java.util.ArrayList;
import java.util.List;

public class SNianjianBranchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SNianjianBranchExample() {
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

        public Criteria andFenzhishuIsNull() {
            addCriterion("FENZHISHU is null");
            return (Criteria) this;
        }

        public Criteria andFenzhishuIsNotNull() {
            addCriterion("FENZHISHU is not null");
            return (Criteria) this;
        }

        public Criteria andFenzhishuEqualTo(Integer value) {
            addCriterion("FENZHISHU =", value, "fenzhishu");
            return (Criteria) this;
        }

        public Criteria andFenzhishuNotEqualTo(Integer value) {
            addCriterion("FENZHISHU <>", value, "fenzhishu");
            return (Criteria) this;
        }

        public Criteria andFenzhishuGreaterThan(Integer value) {
            addCriterion("FENZHISHU >", value, "fenzhishu");
            return (Criteria) this;
        }

        public Criteria andFenzhishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("FENZHISHU >=", value, "fenzhishu");
            return (Criteria) this;
        }

        public Criteria andFenzhishuLessThan(Integer value) {
            addCriterion("FENZHISHU <", value, "fenzhishu");
            return (Criteria) this;
        }

        public Criteria andFenzhishuLessThanOrEqualTo(Integer value) {
            addCriterion("FENZHISHU <=", value, "fenzhishu");
            return (Criteria) this;
        }

        public Criteria andFenzhishuIn(List<Integer> values) {
            addCriterion("FENZHISHU in", values, "fenzhishu");
            return (Criteria) this;
        }

        public Criteria andFenzhishuNotIn(List<Integer> values) {
            addCriterion("FENZHISHU not in", values, "fenzhishu");
            return (Criteria) this;
        }

        public Criteria andFenzhishuBetween(Integer value1, Integer value2) {
            addCriterion("FENZHISHU between", value1, value2, "fenzhishu");
            return (Criteria) this;
        }

        public Criteria andFenzhishuNotBetween(Integer value1, Integer value2) {
            addCriterion("FENZHISHU not between", value1, value2, "fenzhishu");
            return (Criteria) this;
        }

        public Criteria andXinshefenzhishuIsNull() {
            addCriterion("XINSHEFENZHISHU is null");
            return (Criteria) this;
        }

        public Criteria andXinshefenzhishuIsNotNull() {
            addCriterion("XINSHEFENZHISHU is not null");
            return (Criteria) this;
        }

        public Criteria andXinshefenzhishuEqualTo(Integer value) {
            addCriterion("XINSHEFENZHISHU =", value, "xinshefenzhishu");
            return (Criteria) this;
        }

        public Criteria andXinshefenzhishuNotEqualTo(Integer value) {
            addCriterion("XINSHEFENZHISHU <>", value, "xinshefenzhishu");
            return (Criteria) this;
        }

        public Criteria andXinshefenzhishuGreaterThan(Integer value) {
            addCriterion("XINSHEFENZHISHU >", value, "xinshefenzhishu");
            return (Criteria) this;
        }

        public Criteria andXinshefenzhishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("XINSHEFENZHISHU >=", value, "xinshefenzhishu");
            return (Criteria) this;
        }

        public Criteria andXinshefenzhishuLessThan(Integer value) {
            addCriterion("XINSHEFENZHISHU <", value, "xinshefenzhishu");
            return (Criteria) this;
        }

        public Criteria andXinshefenzhishuLessThanOrEqualTo(Integer value) {
            addCriterion("XINSHEFENZHISHU <=", value, "xinshefenzhishu");
            return (Criteria) this;
        }

        public Criteria andXinshefenzhishuIn(List<Integer> values) {
            addCriterion("XINSHEFENZHISHU in", values, "xinshefenzhishu");
            return (Criteria) this;
        }

        public Criteria andXinshefenzhishuNotIn(List<Integer> values) {
            addCriterion("XINSHEFENZHISHU not in", values, "xinshefenzhishu");
            return (Criteria) this;
        }

        public Criteria andXinshefenzhishuBetween(Integer value1, Integer value2) {
            addCriterion("XINSHEFENZHISHU between", value1, value2, "xinshefenzhishu");
            return (Criteria) this;
        }

        public Criteria andXinshefenzhishuNotBetween(Integer value1, Integer value2) {
            addCriterion("XINSHEFENZHISHU not between", value1, value2, "xinshefenzhishu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshefenzhishuIsNull() {
            addCriterion("BANLIXINSHEFENZHISHU is null");
            return (Criteria) this;
        }

        public Criteria andBanlixinshefenzhishuIsNotNull() {
            addCriterion("BANLIXINSHEFENZHISHU is not null");
            return (Criteria) this;
        }

        public Criteria andBanlixinshefenzhishuEqualTo(Integer value) {
            addCriterion("BANLIXINSHEFENZHISHU =", value, "banlixinshefenzhishu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshefenzhishuNotEqualTo(Integer value) {
            addCriterion("BANLIXINSHEFENZHISHU <>", value, "banlixinshefenzhishu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshefenzhishuGreaterThan(Integer value) {
            addCriterion("BANLIXINSHEFENZHISHU >", value, "banlixinshefenzhishu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshefenzhishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("BANLIXINSHEFENZHISHU >=", value, "banlixinshefenzhishu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshefenzhishuLessThan(Integer value) {
            addCriterion("BANLIXINSHEFENZHISHU <", value, "banlixinshefenzhishu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshefenzhishuLessThanOrEqualTo(Integer value) {
            addCriterion("BANLIXINSHEFENZHISHU <=", value, "banlixinshefenzhishu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshefenzhishuIn(List<Integer> values) {
            addCriterion("BANLIXINSHEFENZHISHU in", values, "banlixinshefenzhishu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshefenzhishuNotIn(List<Integer> values) {
            addCriterion("BANLIXINSHEFENZHISHU not in", values, "banlixinshefenzhishu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshefenzhishuBetween(Integer value1, Integer value2) {
            addCriterion("BANLIXINSHEFENZHISHU between", value1, value2, "banlixinshefenzhishu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshefenzhishuNotBetween(Integer value1, Integer value2) {
            addCriterion("BANLIXINSHEFENZHISHU not between", value1, value2, "banlixinshefenzhishu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaofenzhishuIsNull() {
            addCriterion("ZHUXIAOFENZHISHU is null");
            return (Criteria) this;
        }

        public Criteria andZhuxiaofenzhishuIsNotNull() {
            addCriterion("ZHUXIAOFENZHISHU is not null");
            return (Criteria) this;
        }

        public Criteria andZhuxiaofenzhishuEqualTo(Integer value) {
            addCriterion("ZHUXIAOFENZHISHU =", value, "zhuxiaofenzhishu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaofenzhishuNotEqualTo(Integer value) {
            addCriterion("ZHUXIAOFENZHISHU <>", value, "zhuxiaofenzhishu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaofenzhishuGreaterThan(Integer value) {
            addCriterion("ZHUXIAOFENZHISHU >", value, "zhuxiaofenzhishu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaofenzhishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZHUXIAOFENZHISHU >=", value, "zhuxiaofenzhishu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaofenzhishuLessThan(Integer value) {
            addCriterion("ZHUXIAOFENZHISHU <", value, "zhuxiaofenzhishu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaofenzhishuLessThanOrEqualTo(Integer value) {
            addCriterion("ZHUXIAOFENZHISHU <=", value, "zhuxiaofenzhishu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaofenzhishuIn(List<Integer> values) {
            addCriterion("ZHUXIAOFENZHISHU in", values, "zhuxiaofenzhishu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaofenzhishuNotIn(List<Integer> values) {
            addCriterion("ZHUXIAOFENZHISHU not in", values, "zhuxiaofenzhishu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaofenzhishuBetween(Integer value1, Integer value2) {
            addCriterion("ZHUXIAOFENZHISHU between", value1, value2, "zhuxiaofenzhishu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaofenzhishuNotBetween(Integer value1, Integer value2) {
            addCriterion("ZHUXIAOFENZHISHU not between", value1, value2, "zhuxiaofenzhishu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaofenzhishuIsNull() {
            addCriterion("BANLIZHUXIAOFENZHISHU is null");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaofenzhishuIsNotNull() {
            addCriterion("BANLIZHUXIAOFENZHISHU is not null");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaofenzhishuEqualTo(Integer value) {
            addCriterion("BANLIZHUXIAOFENZHISHU =", value, "banlizhuxiaofenzhishu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaofenzhishuNotEqualTo(Integer value) {
            addCriterion("BANLIZHUXIAOFENZHISHU <>", value, "banlizhuxiaofenzhishu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaofenzhishuGreaterThan(Integer value) {
            addCriterion("BANLIZHUXIAOFENZHISHU >", value, "banlizhuxiaofenzhishu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaofenzhishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("BANLIZHUXIAOFENZHISHU >=", value, "banlizhuxiaofenzhishu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaofenzhishuLessThan(Integer value) {
            addCriterion("BANLIZHUXIAOFENZHISHU <", value, "banlizhuxiaofenzhishu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaofenzhishuLessThanOrEqualTo(Integer value) {
            addCriterion("BANLIZHUXIAOFENZHISHU <=", value, "banlizhuxiaofenzhishu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaofenzhishuIn(List<Integer> values) {
            addCriterion("BANLIZHUXIAOFENZHISHU in", values, "banlizhuxiaofenzhishu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaofenzhishuNotIn(List<Integer> values) {
            addCriterion("BANLIZHUXIAOFENZHISHU not in", values, "banlizhuxiaofenzhishu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaofenzhishuBetween(Integer value1, Integer value2) {
            addCriterion("BANLIZHUXIAOFENZHISHU between", value1, value2, "banlizhuxiaofenzhishu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaofenzhishuNotBetween(Integer value1, Integer value2) {
            addCriterion("BANLIZHUXIAOFENZHISHU not between", value1, value2, "banlizhuxiaofenzhishu");
            return (Criteria) this;
        }

        public Criteria andDaibiaoshuIsNull() {
            addCriterion("DAIBIAOSHU is null");
            return (Criteria) this;
        }

        public Criteria andDaibiaoshuIsNotNull() {
            addCriterion("DAIBIAOSHU is not null");
            return (Criteria) this;
        }

        public Criteria andDaibiaoshuEqualTo(Integer value) {
            addCriterion("DAIBIAOSHU =", value, "daibiaoshu");
            return (Criteria) this;
        }

        public Criteria andDaibiaoshuNotEqualTo(Integer value) {
            addCriterion("DAIBIAOSHU <>", value, "daibiaoshu");
            return (Criteria) this;
        }

        public Criteria andDaibiaoshuGreaterThan(Integer value) {
            addCriterion("DAIBIAOSHU >", value, "daibiaoshu");
            return (Criteria) this;
        }

        public Criteria andDaibiaoshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("DAIBIAOSHU >=", value, "daibiaoshu");
            return (Criteria) this;
        }

        public Criteria andDaibiaoshuLessThan(Integer value) {
            addCriterion("DAIBIAOSHU <", value, "daibiaoshu");
            return (Criteria) this;
        }

        public Criteria andDaibiaoshuLessThanOrEqualTo(Integer value) {
            addCriterion("DAIBIAOSHU <=", value, "daibiaoshu");
            return (Criteria) this;
        }

        public Criteria andDaibiaoshuIn(List<Integer> values) {
            addCriterion("DAIBIAOSHU in", values, "daibiaoshu");
            return (Criteria) this;
        }

        public Criteria andDaibiaoshuNotIn(List<Integer> values) {
            addCriterion("DAIBIAOSHU not in", values, "daibiaoshu");
            return (Criteria) this;
        }

        public Criteria andDaibiaoshuBetween(Integer value1, Integer value2) {
            addCriterion("DAIBIAOSHU between", value1, value2, "daibiaoshu");
            return (Criteria) this;
        }

        public Criteria andDaibiaoshuNotBetween(Integer value1, Integer value2) {
            addCriterion("DAIBIAOSHU not between", value1, value2, "daibiaoshu");
            return (Criteria) this;
        }

        public Criteria andXinshedaibiaoshuIsNull() {
            addCriterion("XINSHEDAIBIAOSHU is null");
            return (Criteria) this;
        }

        public Criteria andXinshedaibiaoshuIsNotNull() {
            addCriterion("XINSHEDAIBIAOSHU is not null");
            return (Criteria) this;
        }

        public Criteria andXinshedaibiaoshuEqualTo(Integer value) {
            addCriterion("XINSHEDAIBIAOSHU =", value, "xinshedaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andXinshedaibiaoshuNotEqualTo(Integer value) {
            addCriterion("XINSHEDAIBIAOSHU <>", value, "xinshedaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andXinshedaibiaoshuGreaterThan(Integer value) {
            addCriterion("XINSHEDAIBIAOSHU >", value, "xinshedaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andXinshedaibiaoshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("XINSHEDAIBIAOSHU >=", value, "xinshedaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andXinshedaibiaoshuLessThan(Integer value) {
            addCriterion("XINSHEDAIBIAOSHU <", value, "xinshedaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andXinshedaibiaoshuLessThanOrEqualTo(Integer value) {
            addCriterion("XINSHEDAIBIAOSHU <=", value, "xinshedaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andXinshedaibiaoshuIn(List<Integer> values) {
            addCriterion("XINSHEDAIBIAOSHU in", values, "xinshedaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andXinshedaibiaoshuNotIn(List<Integer> values) {
            addCriterion("XINSHEDAIBIAOSHU not in", values, "xinshedaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andXinshedaibiaoshuBetween(Integer value1, Integer value2) {
            addCriterion("XINSHEDAIBIAOSHU between", value1, value2, "xinshedaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andXinshedaibiaoshuNotBetween(Integer value1, Integer value2) {
            addCriterion("XINSHEDAIBIAOSHU not between", value1, value2, "xinshedaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshedaibiaoshuIsNull() {
            addCriterion("BANLIXINSHEDAIBIAOSHU is null");
            return (Criteria) this;
        }

        public Criteria andBanlixinshedaibiaoshuIsNotNull() {
            addCriterion("BANLIXINSHEDAIBIAOSHU is not null");
            return (Criteria) this;
        }

        public Criteria andBanlixinshedaibiaoshuEqualTo(Integer value) {
            addCriterion("BANLIXINSHEDAIBIAOSHU =", value, "banlixinshedaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshedaibiaoshuNotEqualTo(Integer value) {
            addCriterion("BANLIXINSHEDAIBIAOSHU <>", value, "banlixinshedaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshedaibiaoshuGreaterThan(Integer value) {
            addCriterion("BANLIXINSHEDAIBIAOSHU >", value, "banlixinshedaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshedaibiaoshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("BANLIXINSHEDAIBIAOSHU >=", value, "banlixinshedaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshedaibiaoshuLessThan(Integer value) {
            addCriterion("BANLIXINSHEDAIBIAOSHU <", value, "banlixinshedaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshedaibiaoshuLessThanOrEqualTo(Integer value) {
            addCriterion("BANLIXINSHEDAIBIAOSHU <=", value, "banlixinshedaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshedaibiaoshuIn(List<Integer> values) {
            addCriterion("BANLIXINSHEDAIBIAOSHU in", values, "banlixinshedaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshedaibiaoshuNotIn(List<Integer> values) {
            addCriterion("BANLIXINSHEDAIBIAOSHU not in", values, "banlixinshedaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshedaibiaoshuBetween(Integer value1, Integer value2) {
            addCriterion("BANLIXINSHEDAIBIAOSHU between", value1, value2, "banlixinshedaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshedaibiaoshuNotBetween(Integer value1, Integer value2) {
            addCriterion("BANLIXINSHEDAIBIAOSHU not between", value1, value2, "banlixinshedaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaodaibiaoshuIsNull() {
            addCriterion("ZHUXIAODAIBIAOSHU is null");
            return (Criteria) this;
        }

        public Criteria andZhuxiaodaibiaoshuIsNotNull() {
            addCriterion("ZHUXIAODAIBIAOSHU is not null");
            return (Criteria) this;
        }

        public Criteria andZhuxiaodaibiaoshuEqualTo(Integer value) {
            addCriterion("ZHUXIAODAIBIAOSHU =", value, "zhuxiaodaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaodaibiaoshuNotEqualTo(Integer value) {
            addCriterion("ZHUXIAODAIBIAOSHU <>", value, "zhuxiaodaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaodaibiaoshuGreaterThan(Integer value) {
            addCriterion("ZHUXIAODAIBIAOSHU >", value, "zhuxiaodaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaodaibiaoshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZHUXIAODAIBIAOSHU >=", value, "zhuxiaodaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaodaibiaoshuLessThan(Integer value) {
            addCriterion("ZHUXIAODAIBIAOSHU <", value, "zhuxiaodaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaodaibiaoshuLessThanOrEqualTo(Integer value) {
            addCriterion("ZHUXIAODAIBIAOSHU <=", value, "zhuxiaodaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaodaibiaoshuIn(List<Integer> values) {
            addCriterion("ZHUXIAODAIBIAOSHU in", values, "zhuxiaodaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaodaibiaoshuNotIn(List<Integer> values) {
            addCriterion("ZHUXIAODAIBIAOSHU not in", values, "zhuxiaodaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaodaibiaoshuBetween(Integer value1, Integer value2) {
            addCriterion("ZHUXIAODAIBIAOSHU between", value1, value2, "zhuxiaodaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaodaibiaoshuNotBetween(Integer value1, Integer value2) {
            addCriterion("ZHUXIAODAIBIAOSHU not between", value1, value2, "zhuxiaodaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaodaibiaoshuIsNull() {
            addCriterion("BANLIZHUXIAODAIBIAOSHU is null");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaodaibiaoshuIsNotNull() {
            addCriterion("BANLIZHUXIAODAIBIAOSHU is not null");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaodaibiaoshuEqualTo(Integer value) {
            addCriterion("BANLIZHUXIAODAIBIAOSHU =", value, "banlizhuxiaodaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaodaibiaoshuNotEqualTo(Integer value) {
            addCriterion("BANLIZHUXIAODAIBIAOSHU <>", value, "banlizhuxiaodaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaodaibiaoshuGreaterThan(Integer value) {
            addCriterion("BANLIZHUXIAODAIBIAOSHU >", value, "banlizhuxiaodaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaodaibiaoshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("BANLIZHUXIAODAIBIAOSHU >=", value, "banlizhuxiaodaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaodaibiaoshuLessThan(Integer value) {
            addCriterion("BANLIZHUXIAODAIBIAOSHU <", value, "banlizhuxiaodaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaodaibiaoshuLessThanOrEqualTo(Integer value) {
            addCriterion("BANLIZHUXIAODAIBIAOSHU <=", value, "banlizhuxiaodaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaodaibiaoshuIn(List<Integer> values) {
            addCriterion("BANLIZHUXIAODAIBIAOSHU in", values, "banlizhuxiaodaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaodaibiaoshuNotIn(List<Integer> values) {
            addCriterion("BANLIZHUXIAODAIBIAOSHU not in", values, "banlizhuxiaodaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaodaibiaoshuBetween(Integer value1, Integer value2) {
            addCriterion("BANLIZHUXIAODAIBIAOSHU between", value1, value2, "banlizhuxiaodaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaodaibiaoshuNotBetween(Integer value1, Integer value2) {
            addCriterion("BANLIZHUXIAODAIBIAOSHU not between", value1, value2, "banlizhuxiaodaibiaoshu");
            return (Criteria) this;
        }

        public Criteria andJijinshuIsNull() {
            addCriterion("JIJINSHU is null");
            return (Criteria) this;
        }

        public Criteria andJijinshuIsNotNull() {
            addCriterion("JIJINSHU is not null");
            return (Criteria) this;
        }

        public Criteria andJijinshuEqualTo(Integer value) {
            addCriterion("JIJINSHU =", value, "jijinshu");
            return (Criteria) this;
        }

        public Criteria andJijinshuNotEqualTo(Integer value) {
            addCriterion("JIJINSHU <>", value, "jijinshu");
            return (Criteria) this;
        }

        public Criteria andJijinshuGreaterThan(Integer value) {
            addCriterion("JIJINSHU >", value, "jijinshu");
            return (Criteria) this;
        }

        public Criteria andJijinshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("JIJINSHU >=", value, "jijinshu");
            return (Criteria) this;
        }

        public Criteria andJijinshuLessThan(Integer value) {
            addCriterion("JIJINSHU <", value, "jijinshu");
            return (Criteria) this;
        }

        public Criteria andJijinshuLessThanOrEqualTo(Integer value) {
            addCriterion("JIJINSHU <=", value, "jijinshu");
            return (Criteria) this;
        }

        public Criteria andJijinshuIn(List<Integer> values) {
            addCriterion("JIJINSHU in", values, "jijinshu");
            return (Criteria) this;
        }

        public Criteria andJijinshuNotIn(List<Integer> values) {
            addCriterion("JIJINSHU not in", values, "jijinshu");
            return (Criteria) this;
        }

        public Criteria andJijinshuBetween(Integer value1, Integer value2) {
            addCriterion("JIJINSHU between", value1, value2, "jijinshu");
            return (Criteria) this;
        }

        public Criteria andJijinshuNotBetween(Integer value1, Integer value2) {
            addCriterion("JIJINSHU not between", value1, value2, "jijinshu");
            return (Criteria) this;
        }

        public Criteria andXinshejijinshuIsNull() {
            addCriterion("XINSHEJIJINSHU is null");
            return (Criteria) this;
        }

        public Criteria andXinshejijinshuIsNotNull() {
            addCriterion("XINSHEJIJINSHU is not null");
            return (Criteria) this;
        }

        public Criteria andXinshejijinshuEqualTo(Integer value) {
            addCriterion("XINSHEJIJINSHU =", value, "xinshejijinshu");
            return (Criteria) this;
        }

        public Criteria andXinshejijinshuNotEqualTo(Integer value) {
            addCriterion("XINSHEJIJINSHU <>", value, "xinshejijinshu");
            return (Criteria) this;
        }

        public Criteria andXinshejijinshuGreaterThan(Integer value) {
            addCriterion("XINSHEJIJINSHU >", value, "xinshejijinshu");
            return (Criteria) this;
        }

        public Criteria andXinshejijinshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("XINSHEJIJINSHU >=", value, "xinshejijinshu");
            return (Criteria) this;
        }

        public Criteria andXinshejijinshuLessThan(Integer value) {
            addCriterion("XINSHEJIJINSHU <", value, "xinshejijinshu");
            return (Criteria) this;
        }

        public Criteria andXinshejijinshuLessThanOrEqualTo(Integer value) {
            addCriterion("XINSHEJIJINSHU <=", value, "xinshejijinshu");
            return (Criteria) this;
        }

        public Criteria andXinshejijinshuIn(List<Integer> values) {
            addCriterion("XINSHEJIJINSHU in", values, "xinshejijinshu");
            return (Criteria) this;
        }

        public Criteria andXinshejijinshuNotIn(List<Integer> values) {
            addCriterion("XINSHEJIJINSHU not in", values, "xinshejijinshu");
            return (Criteria) this;
        }

        public Criteria andXinshejijinshuBetween(Integer value1, Integer value2) {
            addCriterion("XINSHEJIJINSHU between", value1, value2, "xinshejijinshu");
            return (Criteria) this;
        }

        public Criteria andXinshejijinshuNotBetween(Integer value1, Integer value2) {
            addCriterion("XINSHEJIJINSHU not between", value1, value2, "xinshejijinshu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshejijinshuIsNull() {
            addCriterion("BANLIXINSHEJIJINSHU is null");
            return (Criteria) this;
        }

        public Criteria andBanlixinshejijinshuIsNotNull() {
            addCriterion("BANLIXINSHEJIJINSHU is not null");
            return (Criteria) this;
        }

        public Criteria andBanlixinshejijinshuEqualTo(Integer value) {
            addCriterion("BANLIXINSHEJIJINSHU =", value, "banlixinshejijinshu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshejijinshuNotEqualTo(Integer value) {
            addCriterion("BANLIXINSHEJIJINSHU <>", value, "banlixinshejijinshu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshejijinshuGreaterThan(Integer value) {
            addCriterion("BANLIXINSHEJIJINSHU >", value, "banlixinshejijinshu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshejijinshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("BANLIXINSHEJIJINSHU >=", value, "banlixinshejijinshu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshejijinshuLessThan(Integer value) {
            addCriterion("BANLIXINSHEJIJINSHU <", value, "banlixinshejijinshu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshejijinshuLessThanOrEqualTo(Integer value) {
            addCriterion("BANLIXINSHEJIJINSHU <=", value, "banlixinshejijinshu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshejijinshuIn(List<Integer> values) {
            addCriterion("BANLIXINSHEJIJINSHU in", values, "banlixinshejijinshu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshejijinshuNotIn(List<Integer> values) {
            addCriterion("BANLIXINSHEJIJINSHU not in", values, "banlixinshejijinshu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshejijinshuBetween(Integer value1, Integer value2) {
            addCriterion("BANLIXINSHEJIJINSHU between", value1, value2, "banlixinshejijinshu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshejijinshuNotBetween(Integer value1, Integer value2) {
            addCriterion("BANLIXINSHEJIJINSHU not between", value1, value2, "banlixinshejijinshu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaojijinshuIsNull() {
            addCriterion("ZHUXIAOJIJINSHU is null");
            return (Criteria) this;
        }

        public Criteria andZhuxiaojijinshuIsNotNull() {
            addCriterion("ZHUXIAOJIJINSHU is not null");
            return (Criteria) this;
        }

        public Criteria andZhuxiaojijinshuEqualTo(Integer value) {
            addCriterion("ZHUXIAOJIJINSHU =", value, "zhuxiaojijinshu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaojijinshuNotEqualTo(Integer value) {
            addCriterion("ZHUXIAOJIJINSHU <>", value, "zhuxiaojijinshu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaojijinshuGreaterThan(Integer value) {
            addCriterion("ZHUXIAOJIJINSHU >", value, "zhuxiaojijinshu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaojijinshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZHUXIAOJIJINSHU >=", value, "zhuxiaojijinshu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaojijinshuLessThan(Integer value) {
            addCriterion("ZHUXIAOJIJINSHU <", value, "zhuxiaojijinshu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaojijinshuLessThanOrEqualTo(Integer value) {
            addCriterion("ZHUXIAOJIJINSHU <=", value, "zhuxiaojijinshu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaojijinshuIn(List<Integer> values) {
            addCriterion("ZHUXIAOJIJINSHU in", values, "zhuxiaojijinshu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaojijinshuNotIn(List<Integer> values) {
            addCriterion("ZHUXIAOJIJINSHU not in", values, "zhuxiaojijinshu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaojijinshuBetween(Integer value1, Integer value2) {
            addCriterion("ZHUXIAOJIJINSHU between", value1, value2, "zhuxiaojijinshu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaojijinshuNotBetween(Integer value1, Integer value2) {
            addCriterion("ZHUXIAOJIJINSHU not between", value1, value2, "zhuxiaojijinshu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaojijinshuIsNull() {
            addCriterion("BANLIZHUXIAOJIJINSHU is null");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaojijinshuIsNotNull() {
            addCriterion("BANLIZHUXIAOJIJINSHU is not null");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaojijinshuEqualTo(Integer value) {
            addCriterion("BANLIZHUXIAOJIJINSHU =", value, "banlizhuxiaojijinshu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaojijinshuNotEqualTo(Integer value) {
            addCriterion("BANLIZHUXIAOJIJINSHU <>", value, "banlizhuxiaojijinshu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaojijinshuGreaterThan(Integer value) {
            addCriterion("BANLIZHUXIAOJIJINSHU >", value, "banlizhuxiaojijinshu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaojijinshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("BANLIZHUXIAOJIJINSHU >=", value, "banlizhuxiaojijinshu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaojijinshuLessThan(Integer value) {
            addCriterion("BANLIZHUXIAOJIJINSHU <", value, "banlizhuxiaojijinshu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaojijinshuLessThanOrEqualTo(Integer value) {
            addCriterion("BANLIZHUXIAOJIJINSHU <=", value, "banlizhuxiaojijinshu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaojijinshuIn(List<Integer> values) {
            addCriterion("BANLIZHUXIAOJIJINSHU in", values, "banlizhuxiaojijinshu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaojijinshuNotIn(List<Integer> values) {
            addCriterion("BANLIZHUXIAOJIJINSHU not in", values, "banlizhuxiaojijinshu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaojijinshuBetween(Integer value1, Integer value2) {
            addCriterion("BANLIZHUXIAOJIJINSHU between", value1, value2, "banlizhuxiaojijinshu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaojijinshuNotBetween(Integer value1, Integer value2) {
            addCriterion("BANLIZHUXIAOJIJINSHU not between", value1, value2, "banlizhuxiaojijinshu");
            return (Criteria) this;
        }

        public Criteria andBanshishuIsNull() {
            addCriterion("BANSHISHU is null");
            return (Criteria) this;
        }

        public Criteria andBanshishuIsNotNull() {
            addCriterion("BANSHISHU is not null");
            return (Criteria) this;
        }

        public Criteria andBanshishuEqualTo(Integer value) {
            addCriterion("BANSHISHU =", value, "banshishu");
            return (Criteria) this;
        }

        public Criteria andBanshishuNotEqualTo(Integer value) {
            addCriterion("BANSHISHU <>", value, "banshishu");
            return (Criteria) this;
        }

        public Criteria andBanshishuGreaterThan(Integer value) {
            addCriterion("BANSHISHU >", value, "banshishu");
            return (Criteria) this;
        }

        public Criteria andBanshishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("BANSHISHU >=", value, "banshishu");
            return (Criteria) this;
        }

        public Criteria andBanshishuLessThan(Integer value) {
            addCriterion("BANSHISHU <", value, "banshishu");
            return (Criteria) this;
        }

        public Criteria andBanshishuLessThanOrEqualTo(Integer value) {
            addCriterion("BANSHISHU <=", value, "banshishu");
            return (Criteria) this;
        }

        public Criteria andBanshishuIn(List<Integer> values) {
            addCriterion("BANSHISHU in", values, "banshishu");
            return (Criteria) this;
        }

        public Criteria andBanshishuNotIn(List<Integer> values) {
            addCriterion("BANSHISHU not in", values, "banshishu");
            return (Criteria) this;
        }

        public Criteria andBanshishuBetween(Integer value1, Integer value2) {
            addCriterion("BANSHISHU between", value1, value2, "banshishu");
            return (Criteria) this;
        }

        public Criteria andBanshishuNotBetween(Integer value1, Integer value2) {
            addCriterion("BANSHISHU not between", value1, value2, "banshishu");
            return (Criteria) this;
        }

        public Criteria andXinshebanshishuIsNull() {
            addCriterion("XINSHEBANSHISHU is null");
            return (Criteria) this;
        }

        public Criteria andXinshebanshishuIsNotNull() {
            addCriterion("XINSHEBANSHISHU is not null");
            return (Criteria) this;
        }

        public Criteria andXinshebanshishuEqualTo(Integer value) {
            addCriterion("XINSHEBANSHISHU =", value, "xinshebanshishu");
            return (Criteria) this;
        }

        public Criteria andXinshebanshishuNotEqualTo(Integer value) {
            addCriterion("XINSHEBANSHISHU <>", value, "xinshebanshishu");
            return (Criteria) this;
        }

        public Criteria andXinshebanshishuGreaterThan(Integer value) {
            addCriterion("XINSHEBANSHISHU >", value, "xinshebanshishu");
            return (Criteria) this;
        }

        public Criteria andXinshebanshishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("XINSHEBANSHISHU >=", value, "xinshebanshishu");
            return (Criteria) this;
        }

        public Criteria andXinshebanshishuLessThan(Integer value) {
            addCriterion("XINSHEBANSHISHU <", value, "xinshebanshishu");
            return (Criteria) this;
        }

        public Criteria andXinshebanshishuLessThanOrEqualTo(Integer value) {
            addCriterion("XINSHEBANSHISHU <=", value, "xinshebanshishu");
            return (Criteria) this;
        }

        public Criteria andXinshebanshishuIn(List<Integer> values) {
            addCriterion("XINSHEBANSHISHU in", values, "xinshebanshishu");
            return (Criteria) this;
        }

        public Criteria andXinshebanshishuNotIn(List<Integer> values) {
            addCriterion("XINSHEBANSHISHU not in", values, "xinshebanshishu");
            return (Criteria) this;
        }

        public Criteria andXinshebanshishuBetween(Integer value1, Integer value2) {
            addCriterion("XINSHEBANSHISHU between", value1, value2, "xinshebanshishu");
            return (Criteria) this;
        }

        public Criteria andXinshebanshishuNotBetween(Integer value1, Integer value2) {
            addCriterion("XINSHEBANSHISHU not between", value1, value2, "xinshebanshishu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshebanshishuIsNull() {
            addCriterion("BANLIXINSHEBANSHISHU is null");
            return (Criteria) this;
        }

        public Criteria andBanlixinshebanshishuIsNotNull() {
            addCriterion("BANLIXINSHEBANSHISHU is not null");
            return (Criteria) this;
        }

        public Criteria andBanlixinshebanshishuEqualTo(Integer value) {
            addCriterion("BANLIXINSHEBANSHISHU =", value, "banlixinshebanshishu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshebanshishuNotEqualTo(Integer value) {
            addCriterion("BANLIXINSHEBANSHISHU <>", value, "banlixinshebanshishu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshebanshishuGreaterThan(Integer value) {
            addCriterion("BANLIXINSHEBANSHISHU >", value, "banlixinshebanshishu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshebanshishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("BANLIXINSHEBANSHISHU >=", value, "banlixinshebanshishu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshebanshishuLessThan(Integer value) {
            addCriterion("BANLIXINSHEBANSHISHU <", value, "banlixinshebanshishu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshebanshishuLessThanOrEqualTo(Integer value) {
            addCriterion("BANLIXINSHEBANSHISHU <=", value, "banlixinshebanshishu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshebanshishuIn(List<Integer> values) {
            addCriterion("BANLIXINSHEBANSHISHU in", values, "banlixinshebanshishu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshebanshishuNotIn(List<Integer> values) {
            addCriterion("BANLIXINSHEBANSHISHU not in", values, "banlixinshebanshishu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshebanshishuBetween(Integer value1, Integer value2) {
            addCriterion("BANLIXINSHEBANSHISHU between", value1, value2, "banlixinshebanshishu");
            return (Criteria) this;
        }

        public Criteria andBanlixinshebanshishuNotBetween(Integer value1, Integer value2) {
            addCriterion("BANLIXINSHEBANSHISHU not between", value1, value2, "banlixinshebanshishu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaobanshishuIsNull() {
            addCriterion("ZHUXIAOBANSHISHU is null");
            return (Criteria) this;
        }

        public Criteria andZhuxiaobanshishuIsNotNull() {
            addCriterion("ZHUXIAOBANSHISHU is not null");
            return (Criteria) this;
        }

        public Criteria andZhuxiaobanshishuEqualTo(Integer value) {
            addCriterion("ZHUXIAOBANSHISHU =", value, "zhuxiaobanshishu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaobanshishuNotEqualTo(Integer value) {
            addCriterion("ZHUXIAOBANSHISHU <>", value, "zhuxiaobanshishu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaobanshishuGreaterThan(Integer value) {
            addCriterion("ZHUXIAOBANSHISHU >", value, "zhuxiaobanshishu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaobanshishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZHUXIAOBANSHISHU >=", value, "zhuxiaobanshishu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaobanshishuLessThan(Integer value) {
            addCriterion("ZHUXIAOBANSHISHU <", value, "zhuxiaobanshishu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaobanshishuLessThanOrEqualTo(Integer value) {
            addCriterion("ZHUXIAOBANSHISHU <=", value, "zhuxiaobanshishu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaobanshishuIn(List<Integer> values) {
            addCriterion("ZHUXIAOBANSHISHU in", values, "zhuxiaobanshishu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaobanshishuNotIn(List<Integer> values) {
            addCriterion("ZHUXIAOBANSHISHU not in", values, "zhuxiaobanshishu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaobanshishuBetween(Integer value1, Integer value2) {
            addCriterion("ZHUXIAOBANSHISHU between", value1, value2, "zhuxiaobanshishu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaobanshishuNotBetween(Integer value1, Integer value2) {
            addCriterion("ZHUXIAOBANSHISHU not between", value1, value2, "zhuxiaobanshishu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaobanshishuIsNull() {
            addCriterion("BANLIZHUXIAOBANSHISHU is null");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaobanshishuIsNotNull() {
            addCriterion("BANLIZHUXIAOBANSHISHU is not null");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaobanshishuEqualTo(Integer value) {
            addCriterion("BANLIZHUXIAOBANSHISHU =", value, "banlizhuxiaobanshishu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaobanshishuNotEqualTo(Integer value) {
            addCriterion("BANLIZHUXIAOBANSHISHU <>", value, "banlizhuxiaobanshishu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaobanshishuGreaterThan(Integer value) {
            addCriterion("BANLIZHUXIAOBANSHISHU >", value, "banlizhuxiaobanshishu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaobanshishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("BANLIZHUXIAOBANSHISHU >=", value, "banlizhuxiaobanshishu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaobanshishuLessThan(Integer value) {
            addCriterion("BANLIZHUXIAOBANSHISHU <", value, "banlizhuxiaobanshishu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaobanshishuLessThanOrEqualTo(Integer value) {
            addCriterion("BANLIZHUXIAOBANSHISHU <=", value, "banlizhuxiaobanshishu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaobanshishuIn(List<Integer> values) {
            addCriterion("BANLIZHUXIAOBANSHISHU in", values, "banlizhuxiaobanshishu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaobanshishuNotIn(List<Integer> values) {
            addCriterion("BANLIZHUXIAOBANSHISHU not in", values, "banlizhuxiaobanshishu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaobanshishuBetween(Integer value1, Integer value2) {
            addCriterion("BANLIZHUXIAOBANSHISHU between", value1, value2, "banlizhuxiaobanshishu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaobanshishuNotBetween(Integer value1, Integer value2) {
            addCriterion("BANLIZHUXIAOBANSHISHU not between", value1, value2, "banlizhuxiaobanshishu");
            return (Criteria) this;
        }

        public Criteria andShitishuIsNull() {
            addCriterion("SHITISHU is null");
            return (Criteria) this;
        }

        public Criteria andShitishuIsNotNull() {
            addCriterion("SHITISHU is not null");
            return (Criteria) this;
        }

        public Criteria andShitishuEqualTo(Integer value) {
            addCriterion("SHITISHU =", value, "shitishu");
            return (Criteria) this;
        }

        public Criteria andShitishuNotEqualTo(Integer value) {
            addCriterion("SHITISHU <>", value, "shitishu");
            return (Criteria) this;
        }

        public Criteria andShitishuGreaterThan(Integer value) {
            addCriterion("SHITISHU >", value, "shitishu");
            return (Criteria) this;
        }

        public Criteria andShitishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHITISHU >=", value, "shitishu");
            return (Criteria) this;
        }

        public Criteria andShitishuLessThan(Integer value) {
            addCriterion("SHITISHU <", value, "shitishu");
            return (Criteria) this;
        }

        public Criteria andShitishuLessThanOrEqualTo(Integer value) {
            addCriterion("SHITISHU <=", value, "shitishu");
            return (Criteria) this;
        }

        public Criteria andShitishuIn(List<Integer> values) {
            addCriterion("SHITISHU in", values, "shitishu");
            return (Criteria) this;
        }

        public Criteria andShitishuNotIn(List<Integer> values) {
            addCriterion("SHITISHU not in", values, "shitishu");
            return (Criteria) this;
        }

        public Criteria andShitishuBetween(Integer value1, Integer value2) {
            addCriterion("SHITISHU between", value1, value2, "shitishu");
            return (Criteria) this;
        }

        public Criteria andShitishuNotBetween(Integer value1, Integer value2) {
            addCriterion("SHITISHU not between", value1, value2, "shitishu");
            return (Criteria) this;
        }

        public Criteria andXinsheshitishuIsNull() {
            addCriterion("XINSHESHITISHU is null");
            return (Criteria) this;
        }

        public Criteria andXinsheshitishuIsNotNull() {
            addCriterion("XINSHESHITISHU is not null");
            return (Criteria) this;
        }

        public Criteria andXinsheshitishuEqualTo(Integer value) {
            addCriterion("XINSHESHITISHU =", value, "xinsheshitishu");
            return (Criteria) this;
        }

        public Criteria andXinsheshitishuNotEqualTo(Integer value) {
            addCriterion("XINSHESHITISHU <>", value, "xinsheshitishu");
            return (Criteria) this;
        }

        public Criteria andXinsheshitishuGreaterThan(Integer value) {
            addCriterion("XINSHESHITISHU >", value, "xinsheshitishu");
            return (Criteria) this;
        }

        public Criteria andXinsheshitishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("XINSHESHITISHU >=", value, "xinsheshitishu");
            return (Criteria) this;
        }

        public Criteria andXinsheshitishuLessThan(Integer value) {
            addCriterion("XINSHESHITISHU <", value, "xinsheshitishu");
            return (Criteria) this;
        }

        public Criteria andXinsheshitishuLessThanOrEqualTo(Integer value) {
            addCriterion("XINSHESHITISHU <=", value, "xinsheshitishu");
            return (Criteria) this;
        }

        public Criteria andXinsheshitishuIn(List<Integer> values) {
            addCriterion("XINSHESHITISHU in", values, "xinsheshitishu");
            return (Criteria) this;
        }

        public Criteria andXinsheshitishuNotIn(List<Integer> values) {
            addCriterion("XINSHESHITISHU not in", values, "xinsheshitishu");
            return (Criteria) this;
        }

        public Criteria andXinsheshitishuBetween(Integer value1, Integer value2) {
            addCriterion("XINSHESHITISHU between", value1, value2, "xinsheshitishu");
            return (Criteria) this;
        }

        public Criteria andXinsheshitishuNotBetween(Integer value1, Integer value2) {
            addCriterion("XINSHESHITISHU not between", value1, value2, "xinsheshitishu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoshitishuIsNull() {
            addCriterion("ZHUXIAOSHITISHU is null");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoshitishuIsNotNull() {
            addCriterion("ZHUXIAOSHITISHU is not null");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoshitishuEqualTo(Integer value) {
            addCriterion("ZHUXIAOSHITISHU =", value, "zhuxiaoshitishu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoshitishuNotEqualTo(Integer value) {
            addCriterion("ZHUXIAOSHITISHU <>", value, "zhuxiaoshitishu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoshitishuGreaterThan(Integer value) {
            addCriterion("ZHUXIAOSHITISHU >", value, "zhuxiaoshitishu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoshitishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZHUXIAOSHITISHU >=", value, "zhuxiaoshitishu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoshitishuLessThan(Integer value) {
            addCriterion("ZHUXIAOSHITISHU <", value, "zhuxiaoshitishu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoshitishuLessThanOrEqualTo(Integer value) {
            addCriterion("ZHUXIAOSHITISHU <=", value, "zhuxiaoshitishu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoshitishuIn(List<Integer> values) {
            addCriterion("ZHUXIAOSHITISHU in", values, "zhuxiaoshitishu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoshitishuNotIn(List<Integer> values) {
            addCriterion("ZHUXIAOSHITISHU not in", values, "zhuxiaoshitishu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoshitishuBetween(Integer value1, Integer value2) {
            addCriterion("ZHUXIAOSHITISHU between", value1, value2, "zhuxiaoshitishu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoshitishuNotBetween(Integer value1, Integer value2) {
            addCriterion("ZHUXIAOSHITISHU not between", value1, value2, "zhuxiaoshitishu");
            return (Criteria) this;
        }

        public Criteria andBanlixinsheshitishuIsNull() {
            addCriterion("BANLIXINSHESHITISHU is null");
            return (Criteria) this;
        }

        public Criteria andBanlixinsheshitishuIsNotNull() {
            addCriterion("BANLIXINSHESHITISHU is not null");
            return (Criteria) this;
        }

        public Criteria andBanlixinsheshitishuEqualTo(Integer value) {
            addCriterion("BANLIXINSHESHITISHU =", value, "banlixinsheshitishu");
            return (Criteria) this;
        }

        public Criteria andBanlixinsheshitishuNotEqualTo(Integer value) {
            addCriterion("BANLIXINSHESHITISHU <>", value, "banlixinsheshitishu");
            return (Criteria) this;
        }

        public Criteria andBanlixinsheshitishuGreaterThan(Integer value) {
            addCriterion("BANLIXINSHESHITISHU >", value, "banlixinsheshitishu");
            return (Criteria) this;
        }

        public Criteria andBanlixinsheshitishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("BANLIXINSHESHITISHU >=", value, "banlixinsheshitishu");
            return (Criteria) this;
        }

        public Criteria andBanlixinsheshitishuLessThan(Integer value) {
            addCriterion("BANLIXINSHESHITISHU <", value, "banlixinsheshitishu");
            return (Criteria) this;
        }

        public Criteria andBanlixinsheshitishuLessThanOrEqualTo(Integer value) {
            addCriterion("BANLIXINSHESHITISHU <=", value, "banlixinsheshitishu");
            return (Criteria) this;
        }

        public Criteria andBanlixinsheshitishuIn(List<Integer> values) {
            addCriterion("BANLIXINSHESHITISHU in", values, "banlixinsheshitishu");
            return (Criteria) this;
        }

        public Criteria andBanlixinsheshitishuNotIn(List<Integer> values) {
            addCriterion("BANLIXINSHESHITISHU not in", values, "banlixinsheshitishu");
            return (Criteria) this;
        }

        public Criteria andBanlixinsheshitishuBetween(Integer value1, Integer value2) {
            addCriterion("BANLIXINSHESHITISHU between", value1, value2, "banlixinsheshitishu");
            return (Criteria) this;
        }

        public Criteria andBanlixinsheshitishuNotBetween(Integer value1, Integer value2) {
            addCriterion("BANLIXINSHESHITISHU not between", value1, value2, "banlixinsheshitishu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaoshitishuIsNull() {
            addCriterion("BANLIZHUXIAOSHITISHU is null");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaoshitishuIsNotNull() {
            addCriterion("BANLIZHUXIAOSHITISHU is not null");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaoshitishuEqualTo(Integer value) {
            addCriterion("BANLIZHUXIAOSHITISHU =", value, "banlizhuxiaoshitishu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaoshitishuNotEqualTo(Integer value) {
            addCriterion("BANLIZHUXIAOSHITISHU <>", value, "banlizhuxiaoshitishu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaoshitishuGreaterThan(Integer value) {
            addCriterion("BANLIZHUXIAOSHITISHU >", value, "banlizhuxiaoshitishu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaoshitishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("BANLIZHUXIAOSHITISHU >=", value, "banlizhuxiaoshitishu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaoshitishuLessThan(Integer value) {
            addCriterion("BANLIZHUXIAOSHITISHU <", value, "banlizhuxiaoshitishu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaoshitishuLessThanOrEqualTo(Integer value) {
            addCriterion("BANLIZHUXIAOSHITISHU <=", value, "banlizhuxiaoshitishu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaoshitishuIn(List<Integer> values) {
            addCriterion("BANLIZHUXIAOSHITISHU in", values, "banlizhuxiaoshitishu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaoshitishuNotIn(List<Integer> values) {
            addCriterion("BANLIZHUXIAOSHITISHU not in", values, "banlizhuxiaoshitishu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaoshitishuBetween(Integer value1, Integer value2) {
            addCriterion("BANLIZHUXIAOSHITISHU between", value1, value2, "banlizhuxiaoshitishu");
            return (Criteria) this;
        }

        public Criteria andBanlizhuxiaoshitishuNotBetween(Integer value1, Integer value2) {
            addCriterion("BANLIZHUXIAOSHITISHU not between", value1, value2, "banlizhuxiaoshitishu");
            return (Criteria) this;
        }

        public Criteria andNeisheshuIsNull() {
            addCriterion("NEISHESHU is null");
            return (Criteria) this;
        }

        public Criteria andNeisheshuIsNotNull() {
            addCriterion("NEISHESHU is not null");
            return (Criteria) this;
        }

        public Criteria andNeisheshuEqualTo(Integer value) {
            addCriterion("NEISHESHU =", value, "neisheshu");
            return (Criteria) this;
        }

        public Criteria andNeisheshuNotEqualTo(Integer value) {
            addCriterion("NEISHESHU <>", value, "neisheshu");
            return (Criteria) this;
        }

        public Criteria andNeisheshuGreaterThan(Integer value) {
            addCriterion("NEISHESHU >", value, "neisheshu");
            return (Criteria) this;
        }

        public Criteria andNeisheshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("NEISHESHU >=", value, "neisheshu");
            return (Criteria) this;
        }

        public Criteria andNeisheshuLessThan(Integer value) {
            addCriterion("NEISHESHU <", value, "neisheshu");
            return (Criteria) this;
        }

        public Criteria andNeisheshuLessThanOrEqualTo(Integer value) {
            addCriterion("NEISHESHU <=", value, "neisheshu");
            return (Criteria) this;
        }

        public Criteria andNeisheshuIn(List<Integer> values) {
            addCriterion("NEISHESHU in", values, "neisheshu");
            return (Criteria) this;
        }

        public Criteria andNeisheshuNotIn(List<Integer> values) {
            addCriterion("NEISHESHU not in", values, "neisheshu");
            return (Criteria) this;
        }

        public Criteria andNeisheshuBetween(Integer value1, Integer value2) {
            addCriterion("NEISHESHU between", value1, value2, "neisheshu");
            return (Criteria) this;
        }

        public Criteria andNeisheshuNotBetween(Integer value1, Integer value2) {
            addCriterion("NEISHESHU not between", value1, value2, "neisheshu");
            return (Criteria) this;
        }

        public Criteria andXinsheneisheshuIsNull() {
            addCriterion("XINSHENEISHESHU is null");
            return (Criteria) this;
        }

        public Criteria andXinsheneisheshuIsNotNull() {
            addCriterion("XINSHENEISHESHU is not null");
            return (Criteria) this;
        }

        public Criteria andXinsheneisheshuEqualTo(Integer value) {
            addCriterion("XINSHENEISHESHU =", value, "xinsheneisheshu");
            return (Criteria) this;
        }

        public Criteria andXinsheneisheshuNotEqualTo(Integer value) {
            addCriterion("XINSHENEISHESHU <>", value, "xinsheneisheshu");
            return (Criteria) this;
        }

        public Criteria andXinsheneisheshuGreaterThan(Integer value) {
            addCriterion("XINSHENEISHESHU >", value, "xinsheneisheshu");
            return (Criteria) this;
        }

        public Criteria andXinsheneisheshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("XINSHENEISHESHU >=", value, "xinsheneisheshu");
            return (Criteria) this;
        }

        public Criteria andXinsheneisheshuLessThan(Integer value) {
            addCriterion("XINSHENEISHESHU <", value, "xinsheneisheshu");
            return (Criteria) this;
        }

        public Criteria andXinsheneisheshuLessThanOrEqualTo(Integer value) {
            addCriterion("XINSHENEISHESHU <=", value, "xinsheneisheshu");
            return (Criteria) this;
        }

        public Criteria andXinsheneisheshuIn(List<Integer> values) {
            addCriterion("XINSHENEISHESHU in", values, "xinsheneisheshu");
            return (Criteria) this;
        }

        public Criteria andXinsheneisheshuNotIn(List<Integer> values) {
            addCriterion("XINSHENEISHESHU not in", values, "xinsheneisheshu");
            return (Criteria) this;
        }

        public Criteria andXinsheneisheshuBetween(Integer value1, Integer value2) {
            addCriterion("XINSHENEISHESHU between", value1, value2, "xinsheneisheshu");
            return (Criteria) this;
        }

        public Criteria andXinsheneisheshuNotBetween(Integer value1, Integer value2) {
            addCriterion("XINSHENEISHESHU not between", value1, value2, "xinsheneisheshu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoneisheshuIsNull() {
            addCriterion("ZHUXIAONEISHESHU is null");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoneisheshuIsNotNull() {
            addCriterion("ZHUXIAONEISHESHU is not null");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoneisheshuEqualTo(Integer value) {
            addCriterion("ZHUXIAONEISHESHU =", value, "zhuxiaoneisheshu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoneisheshuNotEqualTo(Integer value) {
            addCriterion("ZHUXIAONEISHESHU <>", value, "zhuxiaoneisheshu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoneisheshuGreaterThan(Integer value) {
            addCriterion("ZHUXIAONEISHESHU >", value, "zhuxiaoneisheshu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoneisheshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZHUXIAONEISHESHU >=", value, "zhuxiaoneisheshu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoneisheshuLessThan(Integer value) {
            addCriterion("ZHUXIAONEISHESHU <", value, "zhuxiaoneisheshu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoneisheshuLessThanOrEqualTo(Integer value) {
            addCriterion("ZHUXIAONEISHESHU <=", value, "zhuxiaoneisheshu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoneisheshuIn(List<Integer> values) {
            addCriterion("ZHUXIAONEISHESHU in", values, "zhuxiaoneisheshu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoneisheshuNotIn(List<Integer> values) {
            addCriterion("ZHUXIAONEISHESHU not in", values, "zhuxiaoneisheshu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoneisheshuBetween(Integer value1, Integer value2) {
            addCriterion("ZHUXIAONEISHESHU between", value1, value2, "zhuxiaoneisheshu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoneisheshuNotBetween(Integer value1, Integer value2) {
            addCriterion("ZHUXIAONEISHESHU not between", value1, value2, "zhuxiaoneisheshu");
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