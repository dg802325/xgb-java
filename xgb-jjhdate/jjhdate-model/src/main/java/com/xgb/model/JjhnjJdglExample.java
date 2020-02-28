package com.xgb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JjhnjJdglExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JjhnjJdglExample() {
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

        public Criteria andQiansannianjieguoIsNull() {
            addCriterion("QIANSANNIANJIEGUO is null");
            return (Criteria) this;
        }

        public Criteria andQiansannianjieguoIsNotNull() {
            addCriterion("QIANSANNIANJIEGUO is not null");
            return (Criteria) this;
        }

        public Criteria andQiansannianjieguoEqualTo(String value) {
            addCriterion("QIANSANNIANJIEGUO =", value, "qiansannianjieguo");
            return (Criteria) this;
        }

        public Criteria andQiansannianjieguoNotEqualTo(String value) {
            addCriterion("QIANSANNIANJIEGUO <>", value, "qiansannianjieguo");
            return (Criteria) this;
        }

        public Criteria andQiansannianjieguoGreaterThan(String value) {
            addCriterion("QIANSANNIANJIEGUO >", value, "qiansannianjieguo");
            return (Criteria) this;
        }

        public Criteria andQiansannianjieguoGreaterThanOrEqualTo(String value) {
            addCriterion("QIANSANNIANJIEGUO >=", value, "qiansannianjieguo");
            return (Criteria) this;
        }

        public Criteria andQiansannianjieguoLessThan(String value) {
            addCriterion("QIANSANNIANJIEGUO <", value, "qiansannianjieguo");
            return (Criteria) this;
        }

        public Criteria andQiansannianjieguoLessThanOrEqualTo(String value) {
            addCriterion("QIANSANNIANJIEGUO <=", value, "qiansannianjieguo");
            return (Criteria) this;
        }

        public Criteria andQiansannianjieguoLike(String value) {
            addCriterion("QIANSANNIANJIEGUO like", value, "qiansannianjieguo");
            return (Criteria) this;
        }

        public Criteria andQiansannianjieguoNotLike(String value) {
            addCriterion("QIANSANNIANJIEGUO not like", value, "qiansannianjieguo");
            return (Criteria) this;
        }

        public Criteria andQiansannianjieguoIn(List<String> values) {
            addCriterion("QIANSANNIANJIEGUO in", values, "qiansannianjieguo");
            return (Criteria) this;
        }

        public Criteria andQiansannianjieguoNotIn(List<String> values) {
            addCriterion("QIANSANNIANJIEGUO not in", values, "qiansannianjieguo");
            return (Criteria) this;
        }

        public Criteria andQiansannianjieguoBetween(String value1, String value2) {
            addCriterion("QIANSANNIANJIEGUO between", value1, value2, "qiansannianjieguo");
            return (Criteria) this;
        }

        public Criteria andQiansannianjieguoNotBetween(String value1, String value2) {
            addCriterion("QIANSANNIANJIEGUO not between", value1, value2, "qiansannianjieguo");
            return (Criteria) this;
        }

        public Criteria andQianernianjieguoIsNull() {
            addCriterion("QIANERNIANJIEGUO is null");
            return (Criteria) this;
        }

        public Criteria andQianernianjieguoIsNotNull() {
            addCriterion("QIANERNIANJIEGUO is not null");
            return (Criteria) this;
        }

        public Criteria andQianernianjieguoEqualTo(String value) {
            addCriterion("QIANERNIANJIEGUO =", value, "qianernianjieguo");
            return (Criteria) this;
        }

        public Criteria andQianernianjieguoNotEqualTo(String value) {
            addCriterion("QIANERNIANJIEGUO <>", value, "qianernianjieguo");
            return (Criteria) this;
        }

        public Criteria andQianernianjieguoGreaterThan(String value) {
            addCriterion("QIANERNIANJIEGUO >", value, "qianernianjieguo");
            return (Criteria) this;
        }

        public Criteria andQianernianjieguoGreaterThanOrEqualTo(String value) {
            addCriterion("QIANERNIANJIEGUO >=", value, "qianernianjieguo");
            return (Criteria) this;
        }

        public Criteria andQianernianjieguoLessThan(String value) {
            addCriterion("QIANERNIANJIEGUO <", value, "qianernianjieguo");
            return (Criteria) this;
        }

        public Criteria andQianernianjieguoLessThanOrEqualTo(String value) {
            addCriterion("QIANERNIANJIEGUO <=", value, "qianernianjieguo");
            return (Criteria) this;
        }

        public Criteria andQianernianjieguoLike(String value) {
            addCriterion("QIANERNIANJIEGUO like", value, "qianernianjieguo");
            return (Criteria) this;
        }

        public Criteria andQianernianjieguoNotLike(String value) {
            addCriterion("QIANERNIANJIEGUO not like", value, "qianernianjieguo");
            return (Criteria) this;
        }

        public Criteria andQianernianjieguoIn(List<String> values) {
            addCriterion("QIANERNIANJIEGUO in", values, "qianernianjieguo");
            return (Criteria) this;
        }

        public Criteria andQianernianjieguoNotIn(List<String> values) {
            addCriterion("QIANERNIANJIEGUO not in", values, "qianernianjieguo");
            return (Criteria) this;
        }

        public Criteria andQianernianjieguoBetween(String value1, String value2) {
            addCriterion("QIANERNIANJIEGUO between", value1, value2, "qianernianjieguo");
            return (Criteria) this;
        }

        public Criteria andQianernianjieguoNotBetween(String value1, String value2) {
            addCriterion("QIANERNIANJIEGUO not between", value1, value2, "qianernianjieguo");
            return (Criteria) this;
        }

        public Criteria andShangnianjieguoIsNull() {
            addCriterion("SHANGNIANJIEGUO is null");
            return (Criteria) this;
        }

        public Criteria andShangnianjieguoIsNotNull() {
            addCriterion("SHANGNIANJIEGUO is not null");
            return (Criteria) this;
        }

        public Criteria andShangnianjieguoEqualTo(String value) {
            addCriterion("SHANGNIANJIEGUO =", value, "shangnianjieguo");
            return (Criteria) this;
        }

        public Criteria andShangnianjieguoNotEqualTo(String value) {
            addCriterion("SHANGNIANJIEGUO <>", value, "shangnianjieguo");
            return (Criteria) this;
        }

        public Criteria andShangnianjieguoGreaterThan(String value) {
            addCriterion("SHANGNIANJIEGUO >", value, "shangnianjieguo");
            return (Criteria) this;
        }

        public Criteria andShangnianjieguoGreaterThanOrEqualTo(String value) {
            addCriterion("SHANGNIANJIEGUO >=", value, "shangnianjieguo");
            return (Criteria) this;
        }

        public Criteria andShangnianjieguoLessThan(String value) {
            addCriterion("SHANGNIANJIEGUO <", value, "shangnianjieguo");
            return (Criteria) this;
        }

        public Criteria andShangnianjieguoLessThanOrEqualTo(String value) {
            addCriterion("SHANGNIANJIEGUO <=", value, "shangnianjieguo");
            return (Criteria) this;
        }

        public Criteria andShangnianjieguoLike(String value) {
            addCriterion("SHANGNIANJIEGUO like", value, "shangnianjieguo");
            return (Criteria) this;
        }

        public Criteria andShangnianjieguoNotLike(String value) {
            addCriterion("SHANGNIANJIEGUO not like", value, "shangnianjieguo");
            return (Criteria) this;
        }

        public Criteria andShangnianjieguoIn(List<String> values) {
            addCriterion("SHANGNIANJIEGUO in", values, "shangnianjieguo");
            return (Criteria) this;
        }

        public Criteria andShangnianjieguoNotIn(List<String> values) {
            addCriterion("SHANGNIANJIEGUO not in", values, "shangnianjieguo");
            return (Criteria) this;
        }

        public Criteria andShangnianjieguoBetween(String value1, String value2) {
            addCriterion("SHANGNIANJIEGUO between", value1, value2, "shangnianjieguo");
            return (Criteria) this;
        }

        public Criteria andShangnianjieguoNotBetween(String value1, String value2) {
            addCriterion("SHANGNIANJIEGUO not between", value1, value2, "shangnianjieguo");
            return (Criteria) this;
        }

        public Criteria andPinggudengjiIsNull() {
            addCriterion("PINGGUDENGJI is null");
            return (Criteria) this;
        }

        public Criteria andPinggudengjiIsNotNull() {
            addCriterion("PINGGUDENGJI is not null");
            return (Criteria) this;
        }

        public Criteria andPinggudengjiEqualTo(String value) {
            addCriterion("PINGGUDENGJI =", value, "pinggudengji");
            return (Criteria) this;
        }

        public Criteria andPinggudengjiNotEqualTo(String value) {
            addCriterion("PINGGUDENGJI <>", value, "pinggudengji");
            return (Criteria) this;
        }

        public Criteria andPinggudengjiGreaterThan(String value) {
            addCriterion("PINGGUDENGJI >", value, "pinggudengji");
            return (Criteria) this;
        }

        public Criteria andPinggudengjiGreaterThanOrEqualTo(String value) {
            addCriterion("PINGGUDENGJI >=", value, "pinggudengji");
            return (Criteria) this;
        }

        public Criteria andPinggudengjiLessThan(String value) {
            addCriterion("PINGGUDENGJI <", value, "pinggudengji");
            return (Criteria) this;
        }

        public Criteria andPinggudengjiLessThanOrEqualTo(String value) {
            addCriterion("PINGGUDENGJI <=", value, "pinggudengji");
            return (Criteria) this;
        }

        public Criteria andPinggudengjiLike(String value) {
            addCriterion("PINGGUDENGJI like", value, "pinggudengji");
            return (Criteria) this;
        }

        public Criteria andPinggudengjiNotLike(String value) {
            addCriterion("PINGGUDENGJI not like", value, "pinggudengji");
            return (Criteria) this;
        }

        public Criteria andPinggudengjiIn(List<String> values) {
            addCriterion("PINGGUDENGJI in", values, "pinggudengji");
            return (Criteria) this;
        }

        public Criteria andPinggudengjiNotIn(List<String> values) {
            addCriterion("PINGGUDENGJI not in", values, "pinggudengji");
            return (Criteria) this;
        }

        public Criteria andPinggudengjiBetween(String value1, String value2) {
            addCriterion("PINGGUDENGJI between", value1, value2, "pinggudengji");
            return (Criteria) this;
        }

        public Criteria andPinggudengjiNotBetween(String value1, String value2) {
            addCriterion("PINGGUDENGJI not between", value1, value2, "pinggudengji");
            return (Criteria) this;
        }

        public Criteria andPingguziIsNull() {
            addCriterion("PINGGUZI is null");
            return (Criteria) this;
        }

        public Criteria andPingguziIsNotNull() {
            addCriterion("PINGGUZI is not null");
            return (Criteria) this;
        }

        public Criteria andPingguziEqualTo(String value) {
            addCriterion("PINGGUZI =", value, "pingguzi");
            return (Criteria) this;
        }

        public Criteria andPingguziNotEqualTo(String value) {
            addCriterion("PINGGUZI <>", value, "pingguzi");
            return (Criteria) this;
        }

        public Criteria andPingguziGreaterThan(String value) {
            addCriterion("PINGGUZI >", value, "pingguzi");
            return (Criteria) this;
        }

        public Criteria andPingguziGreaterThanOrEqualTo(String value) {
            addCriterion("PINGGUZI >=", value, "pingguzi");
            return (Criteria) this;
        }

        public Criteria andPingguziLessThan(String value) {
            addCriterion("PINGGUZI <", value, "pingguzi");
            return (Criteria) this;
        }

        public Criteria andPingguziLessThanOrEqualTo(String value) {
            addCriterion("PINGGUZI <=", value, "pingguzi");
            return (Criteria) this;
        }

        public Criteria andPingguziLike(String value) {
            addCriterion("PINGGUZI like", value, "pingguzi");
            return (Criteria) this;
        }

        public Criteria andPingguziNotLike(String value) {
            addCriterion("PINGGUZI not like", value, "pingguzi");
            return (Criteria) this;
        }

        public Criteria andPingguziIn(List<String> values) {
            addCriterion("PINGGUZI in", values, "pingguzi");
            return (Criteria) this;
        }

        public Criteria andPingguziNotIn(List<String> values) {
            addCriterion("PINGGUZI not in", values, "pingguzi");
            return (Criteria) this;
        }

        public Criteria andPingguziBetween(String value1, String value2) {
            addCriterion("PINGGUZI between", value1, value2, "pingguzi");
            return (Criteria) this;
        }

        public Criteria andPingguziNotBetween(String value1, String value2) {
            addCriterion("PINGGUZI not between", value1, value2, "pingguzi");
            return (Criteria) this;
        }

        public Criteria andPingguzhiIsNull() {
            addCriterion("PINGGUZHI is null");
            return (Criteria) this;
        }

        public Criteria andPingguzhiIsNotNull() {
            addCriterion("PINGGUZHI is not null");
            return (Criteria) this;
        }

        public Criteria andPingguzhiEqualTo(String value) {
            addCriterion("PINGGUZHI =", value, "pingguzhi");
            return (Criteria) this;
        }

        public Criteria andPingguzhiNotEqualTo(String value) {
            addCriterion("PINGGUZHI <>", value, "pingguzhi");
            return (Criteria) this;
        }

        public Criteria andPingguzhiGreaterThan(String value) {
            addCriterion("PINGGUZHI >", value, "pingguzhi");
            return (Criteria) this;
        }

        public Criteria andPingguzhiGreaterThanOrEqualTo(String value) {
            addCriterion("PINGGUZHI >=", value, "pingguzhi");
            return (Criteria) this;
        }

        public Criteria andPingguzhiLessThan(String value) {
            addCriterion("PINGGUZHI <", value, "pingguzhi");
            return (Criteria) this;
        }

        public Criteria andPingguzhiLessThanOrEqualTo(String value) {
            addCriterion("PINGGUZHI <=", value, "pingguzhi");
            return (Criteria) this;
        }

        public Criteria andPingguzhiLike(String value) {
            addCriterion("PINGGUZHI like", value, "pingguzhi");
            return (Criteria) this;
        }

        public Criteria andPingguzhiNotLike(String value) {
            addCriterion("PINGGUZHI not like", value, "pingguzhi");
            return (Criteria) this;
        }

        public Criteria andPingguzhiIn(List<String> values) {
            addCriterion("PINGGUZHI in", values, "pingguzhi");
            return (Criteria) this;
        }

        public Criteria andPingguzhiNotIn(List<String> values) {
            addCriterion("PINGGUZHI not in", values, "pingguzhi");
            return (Criteria) this;
        }

        public Criteria andPingguzhiBetween(String value1, String value2) {
            addCriterion("PINGGUZHI between", value1, value2, "pingguzhi");
            return (Criteria) this;
        }

        public Criteria andPingguzhiNotBetween(String value1, String value2) {
            addCriterion("PINGGUZHI not between", value1, value2, "pingguzhi");
            return (Criteria) this;
        }

        public Criteria andShifouchufaIsNull() {
            addCriterion("SHIFOUCHUFA is null");
            return (Criteria) this;
        }

        public Criteria andShifouchufaIsNotNull() {
            addCriterion("SHIFOUCHUFA is not null");
            return (Criteria) this;
        }

        public Criteria andShifouchufaEqualTo(String value) {
            addCriterion("SHIFOUCHUFA =", value, "shifouchufa");
            return (Criteria) this;
        }

        public Criteria andShifouchufaNotEqualTo(String value) {
            addCriterion("SHIFOUCHUFA <>", value, "shifouchufa");
            return (Criteria) this;
        }

        public Criteria andShifouchufaGreaterThan(String value) {
            addCriterion("SHIFOUCHUFA >", value, "shifouchufa");
            return (Criteria) this;
        }

        public Criteria andShifouchufaGreaterThanOrEqualTo(String value) {
            addCriterion("SHIFOUCHUFA >=", value, "shifouchufa");
            return (Criteria) this;
        }

        public Criteria andShifouchufaLessThan(String value) {
            addCriterion("SHIFOUCHUFA <", value, "shifouchufa");
            return (Criteria) this;
        }

        public Criteria andShifouchufaLessThanOrEqualTo(String value) {
            addCriterion("SHIFOUCHUFA <=", value, "shifouchufa");
            return (Criteria) this;
        }

        public Criteria andShifouchufaLike(String value) {
            addCriterion("SHIFOUCHUFA like", value, "shifouchufa");
            return (Criteria) this;
        }

        public Criteria andShifouchufaNotLike(String value) {
            addCriterion("SHIFOUCHUFA not like", value, "shifouchufa");
            return (Criteria) this;
        }

        public Criteria andShifouchufaIn(List<String> values) {
            addCriterion("SHIFOUCHUFA in", values, "shifouchufa");
            return (Criteria) this;
        }

        public Criteria andShifouchufaNotIn(List<String> values) {
            addCriterion("SHIFOUCHUFA not in", values, "shifouchufa");
            return (Criteria) this;
        }

        public Criteria andShifouchufaBetween(String value1, String value2) {
            addCriterion("SHIFOUCHUFA between", value1, value2, "shifouchufa");
            return (Criteria) this;
        }

        public Criteria andShifouchufaNotBetween(String value1, String value2) {
            addCriterion("SHIFOUCHUFA not between", value1, value2, "shifouchufa");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei1IsNull() {
            addCriterion("CHUFAZHONGLEI1 is null");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei1IsNotNull() {
            addCriterion("CHUFAZHONGLEI1 is not null");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei1EqualTo(String value) {
            addCriterion("CHUFAZHONGLEI1 =", value, "chufazhonglei1");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei1NotEqualTo(String value) {
            addCriterion("CHUFAZHONGLEI1 <>", value, "chufazhonglei1");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei1GreaterThan(String value) {
            addCriterion("CHUFAZHONGLEI1 >", value, "chufazhonglei1");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei1GreaterThanOrEqualTo(String value) {
            addCriterion("CHUFAZHONGLEI1 >=", value, "chufazhonglei1");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei1LessThan(String value) {
            addCriterion("CHUFAZHONGLEI1 <", value, "chufazhonglei1");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei1LessThanOrEqualTo(String value) {
            addCriterion("CHUFAZHONGLEI1 <=", value, "chufazhonglei1");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei1Like(String value) {
            addCriterion("CHUFAZHONGLEI1 like", value, "chufazhonglei1");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei1NotLike(String value) {
            addCriterion("CHUFAZHONGLEI1 not like", value, "chufazhonglei1");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei1In(List<String> values) {
            addCriterion("CHUFAZHONGLEI1 in", values, "chufazhonglei1");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei1NotIn(List<String> values) {
            addCriterion("CHUFAZHONGLEI1 not in", values, "chufazhonglei1");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei1Between(String value1, String value2) {
            addCriterion("CHUFAZHONGLEI1 between", value1, value2, "chufazhonglei1");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei1NotBetween(String value1, String value2) {
            addCriterion("CHUFAZHONGLEI1 not between", value1, value2, "chufazhonglei1");
            return (Criteria) this;
        }

        public Criteria andChufajiguan1IsNull() {
            addCriterion("CHUFAJIGUAN1 is null");
            return (Criteria) this;
        }

        public Criteria andChufajiguan1IsNotNull() {
            addCriterion("CHUFAJIGUAN1 is not null");
            return (Criteria) this;
        }

        public Criteria andChufajiguan1EqualTo(String value) {
            addCriterion("CHUFAJIGUAN1 =", value, "chufajiguan1");
            return (Criteria) this;
        }

        public Criteria andChufajiguan1NotEqualTo(String value) {
            addCriterion("CHUFAJIGUAN1 <>", value, "chufajiguan1");
            return (Criteria) this;
        }

        public Criteria andChufajiguan1GreaterThan(String value) {
            addCriterion("CHUFAJIGUAN1 >", value, "chufajiguan1");
            return (Criteria) this;
        }

        public Criteria andChufajiguan1GreaterThanOrEqualTo(String value) {
            addCriterion("CHUFAJIGUAN1 >=", value, "chufajiguan1");
            return (Criteria) this;
        }

        public Criteria andChufajiguan1LessThan(String value) {
            addCriterion("CHUFAJIGUAN1 <", value, "chufajiguan1");
            return (Criteria) this;
        }

        public Criteria andChufajiguan1LessThanOrEqualTo(String value) {
            addCriterion("CHUFAJIGUAN1 <=", value, "chufajiguan1");
            return (Criteria) this;
        }

        public Criteria andChufajiguan1Like(String value) {
            addCriterion("CHUFAJIGUAN1 like", value, "chufajiguan1");
            return (Criteria) this;
        }

        public Criteria andChufajiguan1NotLike(String value) {
            addCriterion("CHUFAJIGUAN1 not like", value, "chufajiguan1");
            return (Criteria) this;
        }

        public Criteria andChufajiguan1In(List<String> values) {
            addCriterion("CHUFAJIGUAN1 in", values, "chufajiguan1");
            return (Criteria) this;
        }

        public Criteria andChufajiguan1NotIn(List<String> values) {
            addCriterion("CHUFAJIGUAN1 not in", values, "chufajiguan1");
            return (Criteria) this;
        }

        public Criteria andChufajiguan1Between(String value1, String value2) {
            addCriterion("CHUFAJIGUAN1 between", value1, value2, "chufajiguan1");
            return (Criteria) this;
        }

        public Criteria andChufajiguan1NotBetween(String value1, String value2) {
            addCriterion("CHUFAJIGUAN1 not between", value1, value2, "chufajiguan1");
            return (Criteria) this;
        }

        public Criteria andChufashijian1IsNull() {
            addCriterion("CHUFASHIJIAN1 is null");
            return (Criteria) this;
        }

        public Criteria andChufashijian1IsNotNull() {
            addCriterion("CHUFASHIJIAN1 is not null");
            return (Criteria) this;
        }

        public Criteria andChufashijian1EqualTo(Date value) {
            addCriterion("CHUFASHIJIAN1 =", value, "chufashijian1");
            return (Criteria) this;
        }

        public Criteria andChufashijian1NotEqualTo(Date value) {
            addCriterion("CHUFASHIJIAN1 <>", value, "chufashijian1");
            return (Criteria) this;
        }

        public Criteria andChufashijian1GreaterThan(Date value) {
            addCriterion("CHUFASHIJIAN1 >", value, "chufashijian1");
            return (Criteria) this;
        }

        public Criteria andChufashijian1GreaterThanOrEqualTo(Date value) {
            addCriterion("CHUFASHIJIAN1 >=", value, "chufashijian1");
            return (Criteria) this;
        }

        public Criteria andChufashijian1LessThan(Date value) {
            addCriterion("CHUFASHIJIAN1 <", value, "chufashijian1");
            return (Criteria) this;
        }

        public Criteria andChufashijian1LessThanOrEqualTo(Date value) {
            addCriterion("CHUFASHIJIAN1 <=", value, "chufashijian1");
            return (Criteria) this;
        }

        public Criteria andChufashijian1In(List<Date> values) {
            addCriterion("CHUFASHIJIAN1 in", values, "chufashijian1");
            return (Criteria) this;
        }

        public Criteria andChufashijian1NotIn(List<Date> values) {
            addCriterion("CHUFASHIJIAN1 not in", values, "chufashijian1");
            return (Criteria) this;
        }

        public Criteria andChufashijian1Between(Date value1, Date value2) {
            addCriterion("CHUFASHIJIAN1 between", value1, value2, "chufashijian1");
            return (Criteria) this;
        }

        public Criteria andChufashijian1NotBetween(Date value1, Date value2) {
            addCriterion("CHUFASHIJIAN1 not between", value1, value2, "chufashijian1");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei1IsNull() {
            addCriterion("WEIFAXINGWEI1 is null");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei1IsNotNull() {
            addCriterion("WEIFAXINGWEI1 is not null");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei1EqualTo(String value) {
            addCriterion("WEIFAXINGWEI1 =", value, "weifaxingwei1");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei1NotEqualTo(String value) {
            addCriterion("WEIFAXINGWEI1 <>", value, "weifaxingwei1");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei1GreaterThan(String value) {
            addCriterion("WEIFAXINGWEI1 >", value, "weifaxingwei1");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei1GreaterThanOrEqualTo(String value) {
            addCriterion("WEIFAXINGWEI1 >=", value, "weifaxingwei1");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei1LessThan(String value) {
            addCriterion("WEIFAXINGWEI1 <", value, "weifaxingwei1");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei1LessThanOrEqualTo(String value) {
            addCriterion("WEIFAXINGWEI1 <=", value, "weifaxingwei1");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei1Like(String value) {
            addCriterion("WEIFAXINGWEI1 like", value, "weifaxingwei1");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei1NotLike(String value) {
            addCriterion("WEIFAXINGWEI1 not like", value, "weifaxingwei1");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei1In(List<String> values) {
            addCriterion("WEIFAXINGWEI1 in", values, "weifaxingwei1");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei1NotIn(List<String> values) {
            addCriterion("WEIFAXINGWEI1 not in", values, "weifaxingwei1");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei1Between(String value1, String value2) {
            addCriterion("WEIFAXINGWEI1 between", value1, value2, "weifaxingwei1");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei1NotBetween(String value1, String value2) {
            addCriterion("WEIFAXINGWEI1 not between", value1, value2, "weifaxingwei1");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei2IsNull() {
            addCriterion("CHUFAZHONGLEI2 is null");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei2IsNotNull() {
            addCriterion("CHUFAZHONGLEI2 is not null");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei2EqualTo(String value) {
            addCriterion("CHUFAZHONGLEI2 =", value, "chufazhonglei2");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei2NotEqualTo(String value) {
            addCriterion("CHUFAZHONGLEI2 <>", value, "chufazhonglei2");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei2GreaterThan(String value) {
            addCriterion("CHUFAZHONGLEI2 >", value, "chufazhonglei2");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei2GreaterThanOrEqualTo(String value) {
            addCriterion("CHUFAZHONGLEI2 >=", value, "chufazhonglei2");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei2LessThan(String value) {
            addCriterion("CHUFAZHONGLEI2 <", value, "chufazhonglei2");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei2LessThanOrEqualTo(String value) {
            addCriterion("CHUFAZHONGLEI2 <=", value, "chufazhonglei2");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei2Like(String value) {
            addCriterion("CHUFAZHONGLEI2 like", value, "chufazhonglei2");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei2NotLike(String value) {
            addCriterion("CHUFAZHONGLEI2 not like", value, "chufazhonglei2");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei2In(List<String> values) {
            addCriterion("CHUFAZHONGLEI2 in", values, "chufazhonglei2");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei2NotIn(List<String> values) {
            addCriterion("CHUFAZHONGLEI2 not in", values, "chufazhonglei2");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei2Between(String value1, String value2) {
            addCriterion("CHUFAZHONGLEI2 between", value1, value2, "chufazhonglei2");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei2NotBetween(String value1, String value2) {
            addCriterion("CHUFAZHONGLEI2 not between", value1, value2, "chufazhonglei2");
            return (Criteria) this;
        }

        public Criteria andChufajiguan2IsNull() {
            addCriterion("CHUFAJIGUAN2 is null");
            return (Criteria) this;
        }

        public Criteria andChufajiguan2IsNotNull() {
            addCriterion("CHUFAJIGUAN2 is not null");
            return (Criteria) this;
        }

        public Criteria andChufajiguan2EqualTo(String value) {
            addCriterion("CHUFAJIGUAN2 =", value, "chufajiguan2");
            return (Criteria) this;
        }

        public Criteria andChufajiguan2NotEqualTo(String value) {
            addCriterion("CHUFAJIGUAN2 <>", value, "chufajiguan2");
            return (Criteria) this;
        }

        public Criteria andChufajiguan2GreaterThan(String value) {
            addCriterion("CHUFAJIGUAN2 >", value, "chufajiguan2");
            return (Criteria) this;
        }

        public Criteria andChufajiguan2GreaterThanOrEqualTo(String value) {
            addCriterion("CHUFAJIGUAN2 >=", value, "chufajiguan2");
            return (Criteria) this;
        }

        public Criteria andChufajiguan2LessThan(String value) {
            addCriterion("CHUFAJIGUAN2 <", value, "chufajiguan2");
            return (Criteria) this;
        }

        public Criteria andChufajiguan2LessThanOrEqualTo(String value) {
            addCriterion("CHUFAJIGUAN2 <=", value, "chufajiguan2");
            return (Criteria) this;
        }

        public Criteria andChufajiguan2Like(String value) {
            addCriterion("CHUFAJIGUAN2 like", value, "chufajiguan2");
            return (Criteria) this;
        }

        public Criteria andChufajiguan2NotLike(String value) {
            addCriterion("CHUFAJIGUAN2 not like", value, "chufajiguan2");
            return (Criteria) this;
        }

        public Criteria andChufajiguan2In(List<String> values) {
            addCriterion("CHUFAJIGUAN2 in", values, "chufajiguan2");
            return (Criteria) this;
        }

        public Criteria andChufajiguan2NotIn(List<String> values) {
            addCriterion("CHUFAJIGUAN2 not in", values, "chufajiguan2");
            return (Criteria) this;
        }

        public Criteria andChufajiguan2Between(String value1, String value2) {
            addCriterion("CHUFAJIGUAN2 between", value1, value2, "chufajiguan2");
            return (Criteria) this;
        }

        public Criteria andChufajiguan2NotBetween(String value1, String value2) {
            addCriterion("CHUFAJIGUAN2 not between", value1, value2, "chufajiguan2");
            return (Criteria) this;
        }

        public Criteria andChufashijian2IsNull() {
            addCriterion("CHUFASHIJIAN2 is null");
            return (Criteria) this;
        }

        public Criteria andChufashijian2IsNotNull() {
            addCriterion("CHUFASHIJIAN2 is not null");
            return (Criteria) this;
        }

        public Criteria andChufashijian2EqualTo(Date value) {
            addCriterion("CHUFASHIJIAN2 =", value, "chufashijian2");
            return (Criteria) this;
        }

        public Criteria andChufashijian2NotEqualTo(Date value) {
            addCriterion("CHUFASHIJIAN2 <>", value, "chufashijian2");
            return (Criteria) this;
        }

        public Criteria andChufashijian2GreaterThan(Date value) {
            addCriterion("CHUFASHIJIAN2 >", value, "chufashijian2");
            return (Criteria) this;
        }

        public Criteria andChufashijian2GreaterThanOrEqualTo(Date value) {
            addCriterion("CHUFASHIJIAN2 >=", value, "chufashijian2");
            return (Criteria) this;
        }

        public Criteria andChufashijian2LessThan(Date value) {
            addCriterion("CHUFASHIJIAN2 <", value, "chufashijian2");
            return (Criteria) this;
        }

        public Criteria andChufashijian2LessThanOrEqualTo(Date value) {
            addCriterion("CHUFASHIJIAN2 <=", value, "chufashijian2");
            return (Criteria) this;
        }

        public Criteria andChufashijian2In(List<Date> values) {
            addCriterion("CHUFASHIJIAN2 in", values, "chufashijian2");
            return (Criteria) this;
        }

        public Criteria andChufashijian2NotIn(List<Date> values) {
            addCriterion("CHUFASHIJIAN2 not in", values, "chufashijian2");
            return (Criteria) this;
        }

        public Criteria andChufashijian2Between(Date value1, Date value2) {
            addCriterion("CHUFASHIJIAN2 between", value1, value2, "chufashijian2");
            return (Criteria) this;
        }

        public Criteria andChufashijian2NotBetween(Date value1, Date value2) {
            addCriterion("CHUFASHIJIAN2 not between", value1, value2, "chufashijian2");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei2IsNull() {
            addCriterion("WEIFAXINGWEI2 is null");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei2IsNotNull() {
            addCriterion("WEIFAXINGWEI2 is not null");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei2EqualTo(String value) {
            addCriterion("WEIFAXINGWEI2 =", value, "weifaxingwei2");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei2NotEqualTo(String value) {
            addCriterion("WEIFAXINGWEI2 <>", value, "weifaxingwei2");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei2GreaterThan(String value) {
            addCriterion("WEIFAXINGWEI2 >", value, "weifaxingwei2");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei2GreaterThanOrEqualTo(String value) {
            addCriterion("WEIFAXINGWEI2 >=", value, "weifaxingwei2");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei2LessThan(String value) {
            addCriterion("WEIFAXINGWEI2 <", value, "weifaxingwei2");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei2LessThanOrEqualTo(String value) {
            addCriterion("WEIFAXINGWEI2 <=", value, "weifaxingwei2");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei2Like(String value) {
            addCriterion("WEIFAXINGWEI2 like", value, "weifaxingwei2");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei2NotLike(String value) {
            addCriterion("WEIFAXINGWEI2 not like", value, "weifaxingwei2");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei2In(List<String> values) {
            addCriterion("WEIFAXINGWEI2 in", values, "weifaxingwei2");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei2NotIn(List<String> values) {
            addCriterion("WEIFAXINGWEI2 not in", values, "weifaxingwei2");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei2Between(String value1, String value2) {
            addCriterion("WEIFAXINGWEI2 between", value1, value2, "weifaxingwei2");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei2NotBetween(String value1, String value2) {
            addCriterion("WEIFAXINGWEI2 not between", value1, value2, "weifaxingwei2");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei3IsNull() {
            addCriterion("CHUFAZHONGLEI3 is null");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei3IsNotNull() {
            addCriterion("CHUFAZHONGLEI3 is not null");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei3EqualTo(String value) {
            addCriterion("CHUFAZHONGLEI3 =", value, "chufazhonglei3");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei3NotEqualTo(String value) {
            addCriterion("CHUFAZHONGLEI3 <>", value, "chufazhonglei3");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei3GreaterThan(String value) {
            addCriterion("CHUFAZHONGLEI3 >", value, "chufazhonglei3");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei3GreaterThanOrEqualTo(String value) {
            addCriterion("CHUFAZHONGLEI3 >=", value, "chufazhonglei3");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei3LessThan(String value) {
            addCriterion("CHUFAZHONGLEI3 <", value, "chufazhonglei3");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei3LessThanOrEqualTo(String value) {
            addCriterion("CHUFAZHONGLEI3 <=", value, "chufazhonglei3");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei3Like(String value) {
            addCriterion("CHUFAZHONGLEI3 like", value, "chufazhonglei3");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei3NotLike(String value) {
            addCriterion("CHUFAZHONGLEI3 not like", value, "chufazhonglei3");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei3In(List<String> values) {
            addCriterion("CHUFAZHONGLEI3 in", values, "chufazhonglei3");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei3NotIn(List<String> values) {
            addCriterion("CHUFAZHONGLEI3 not in", values, "chufazhonglei3");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei3Between(String value1, String value2) {
            addCriterion("CHUFAZHONGLEI3 between", value1, value2, "chufazhonglei3");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei3NotBetween(String value1, String value2) {
            addCriterion("CHUFAZHONGLEI3 not between", value1, value2, "chufazhonglei3");
            return (Criteria) this;
        }

        public Criteria andChufajiguan3IsNull() {
            addCriterion("CHUFAJIGUAN3 is null");
            return (Criteria) this;
        }

        public Criteria andChufajiguan3IsNotNull() {
            addCriterion("CHUFAJIGUAN3 is not null");
            return (Criteria) this;
        }

        public Criteria andChufajiguan3EqualTo(String value) {
            addCriterion("CHUFAJIGUAN3 =", value, "chufajiguan3");
            return (Criteria) this;
        }

        public Criteria andChufajiguan3NotEqualTo(String value) {
            addCriterion("CHUFAJIGUAN3 <>", value, "chufajiguan3");
            return (Criteria) this;
        }

        public Criteria andChufajiguan3GreaterThan(String value) {
            addCriterion("CHUFAJIGUAN3 >", value, "chufajiguan3");
            return (Criteria) this;
        }

        public Criteria andChufajiguan3GreaterThanOrEqualTo(String value) {
            addCriterion("CHUFAJIGUAN3 >=", value, "chufajiguan3");
            return (Criteria) this;
        }

        public Criteria andChufajiguan3LessThan(String value) {
            addCriterion("CHUFAJIGUAN3 <", value, "chufajiguan3");
            return (Criteria) this;
        }

        public Criteria andChufajiguan3LessThanOrEqualTo(String value) {
            addCriterion("CHUFAJIGUAN3 <=", value, "chufajiguan3");
            return (Criteria) this;
        }

        public Criteria andChufajiguan3Like(String value) {
            addCriterion("CHUFAJIGUAN3 like", value, "chufajiguan3");
            return (Criteria) this;
        }

        public Criteria andChufajiguan3NotLike(String value) {
            addCriterion("CHUFAJIGUAN3 not like", value, "chufajiguan3");
            return (Criteria) this;
        }

        public Criteria andChufajiguan3In(List<String> values) {
            addCriterion("CHUFAJIGUAN3 in", values, "chufajiguan3");
            return (Criteria) this;
        }

        public Criteria andChufajiguan3NotIn(List<String> values) {
            addCriterion("CHUFAJIGUAN3 not in", values, "chufajiguan3");
            return (Criteria) this;
        }

        public Criteria andChufajiguan3Between(String value1, String value2) {
            addCriterion("CHUFAJIGUAN3 between", value1, value2, "chufajiguan3");
            return (Criteria) this;
        }

        public Criteria andChufajiguan3NotBetween(String value1, String value2) {
            addCriterion("CHUFAJIGUAN3 not between", value1, value2, "chufajiguan3");
            return (Criteria) this;
        }

        public Criteria andChufashijian3IsNull() {
            addCriterion("CHUFASHIJIAN3 is null");
            return (Criteria) this;
        }

        public Criteria andChufashijian3IsNotNull() {
            addCriterion("CHUFASHIJIAN3 is not null");
            return (Criteria) this;
        }

        public Criteria andChufashijian3EqualTo(Date value) {
            addCriterion("CHUFASHIJIAN3 =", value, "chufashijian3");
            return (Criteria) this;
        }

        public Criteria andChufashijian3NotEqualTo(Date value) {
            addCriterion("CHUFASHIJIAN3 <>", value, "chufashijian3");
            return (Criteria) this;
        }

        public Criteria andChufashijian3GreaterThan(Date value) {
            addCriterion("CHUFASHIJIAN3 >", value, "chufashijian3");
            return (Criteria) this;
        }

        public Criteria andChufashijian3GreaterThanOrEqualTo(Date value) {
            addCriterion("CHUFASHIJIAN3 >=", value, "chufashijian3");
            return (Criteria) this;
        }

        public Criteria andChufashijian3LessThan(Date value) {
            addCriterion("CHUFASHIJIAN3 <", value, "chufashijian3");
            return (Criteria) this;
        }

        public Criteria andChufashijian3LessThanOrEqualTo(Date value) {
            addCriterion("CHUFASHIJIAN3 <=", value, "chufashijian3");
            return (Criteria) this;
        }

        public Criteria andChufashijian3In(List<Date> values) {
            addCriterion("CHUFASHIJIAN3 in", values, "chufashijian3");
            return (Criteria) this;
        }

        public Criteria andChufashijian3NotIn(List<Date> values) {
            addCriterion("CHUFASHIJIAN3 not in", values, "chufashijian3");
            return (Criteria) this;
        }

        public Criteria andChufashijian3Between(Date value1, Date value2) {
            addCriterion("CHUFASHIJIAN3 between", value1, value2, "chufashijian3");
            return (Criteria) this;
        }

        public Criteria andChufashijian3NotBetween(Date value1, Date value2) {
            addCriterion("CHUFASHIJIAN3 not between", value1, value2, "chufashijian3");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei3IsNull() {
            addCriterion("WEIFAXINGWEI3 is null");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei3IsNotNull() {
            addCriterion("WEIFAXINGWEI3 is not null");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei3EqualTo(String value) {
            addCriterion("WEIFAXINGWEI3 =", value, "weifaxingwei3");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei3NotEqualTo(String value) {
            addCriterion("WEIFAXINGWEI3 <>", value, "weifaxingwei3");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei3GreaterThan(String value) {
            addCriterion("WEIFAXINGWEI3 >", value, "weifaxingwei3");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei3GreaterThanOrEqualTo(String value) {
            addCriterion("WEIFAXINGWEI3 >=", value, "weifaxingwei3");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei3LessThan(String value) {
            addCriterion("WEIFAXINGWEI3 <", value, "weifaxingwei3");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei3LessThanOrEqualTo(String value) {
            addCriterion("WEIFAXINGWEI3 <=", value, "weifaxingwei3");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei3Like(String value) {
            addCriterion("WEIFAXINGWEI3 like", value, "weifaxingwei3");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei3NotLike(String value) {
            addCriterion("WEIFAXINGWEI3 not like", value, "weifaxingwei3");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei3In(List<String> values) {
            addCriterion("WEIFAXINGWEI3 in", values, "weifaxingwei3");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei3NotIn(List<String> values) {
            addCriterion("WEIFAXINGWEI3 not in", values, "weifaxingwei3");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei3Between(String value1, String value2) {
            addCriterion("WEIFAXINGWEI3 between", value1, value2, "weifaxingwei3");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei3NotBetween(String value1, String value2) {
            addCriterion("WEIFAXINGWEI3 not between", value1, value2, "weifaxingwei3");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei4IsNull() {
            addCriterion("CHUFAZHONGLEI4 is null");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei4IsNotNull() {
            addCriterion("CHUFAZHONGLEI4 is not null");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei4EqualTo(String value) {
            addCriterion("CHUFAZHONGLEI4 =", value, "chufazhonglei4");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei4NotEqualTo(String value) {
            addCriterion("CHUFAZHONGLEI4 <>", value, "chufazhonglei4");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei4GreaterThan(String value) {
            addCriterion("CHUFAZHONGLEI4 >", value, "chufazhonglei4");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei4GreaterThanOrEqualTo(String value) {
            addCriterion("CHUFAZHONGLEI4 >=", value, "chufazhonglei4");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei4LessThan(String value) {
            addCriterion("CHUFAZHONGLEI4 <", value, "chufazhonglei4");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei4LessThanOrEqualTo(String value) {
            addCriterion("CHUFAZHONGLEI4 <=", value, "chufazhonglei4");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei4Like(String value) {
            addCriterion("CHUFAZHONGLEI4 like", value, "chufazhonglei4");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei4NotLike(String value) {
            addCriterion("CHUFAZHONGLEI4 not like", value, "chufazhonglei4");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei4In(List<String> values) {
            addCriterion("CHUFAZHONGLEI4 in", values, "chufazhonglei4");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei4NotIn(List<String> values) {
            addCriterion("CHUFAZHONGLEI4 not in", values, "chufazhonglei4");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei4Between(String value1, String value2) {
            addCriterion("CHUFAZHONGLEI4 between", value1, value2, "chufazhonglei4");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei4NotBetween(String value1, String value2) {
            addCriterion("CHUFAZHONGLEI4 not between", value1, value2, "chufazhonglei4");
            return (Criteria) this;
        }

        public Criteria andChufajiguan4IsNull() {
            addCriterion("CHUFAJIGUAN4 is null");
            return (Criteria) this;
        }

        public Criteria andChufajiguan4IsNotNull() {
            addCriterion("CHUFAJIGUAN4 is not null");
            return (Criteria) this;
        }

        public Criteria andChufajiguan4EqualTo(String value) {
            addCriterion("CHUFAJIGUAN4 =", value, "chufajiguan4");
            return (Criteria) this;
        }

        public Criteria andChufajiguan4NotEqualTo(String value) {
            addCriterion("CHUFAJIGUAN4 <>", value, "chufajiguan4");
            return (Criteria) this;
        }

        public Criteria andChufajiguan4GreaterThan(String value) {
            addCriterion("CHUFAJIGUAN4 >", value, "chufajiguan4");
            return (Criteria) this;
        }

        public Criteria andChufajiguan4GreaterThanOrEqualTo(String value) {
            addCriterion("CHUFAJIGUAN4 >=", value, "chufajiguan4");
            return (Criteria) this;
        }

        public Criteria andChufajiguan4LessThan(String value) {
            addCriterion("CHUFAJIGUAN4 <", value, "chufajiguan4");
            return (Criteria) this;
        }

        public Criteria andChufajiguan4LessThanOrEqualTo(String value) {
            addCriterion("CHUFAJIGUAN4 <=", value, "chufajiguan4");
            return (Criteria) this;
        }

        public Criteria andChufajiguan4Like(String value) {
            addCriterion("CHUFAJIGUAN4 like", value, "chufajiguan4");
            return (Criteria) this;
        }

        public Criteria andChufajiguan4NotLike(String value) {
            addCriterion("CHUFAJIGUAN4 not like", value, "chufajiguan4");
            return (Criteria) this;
        }

        public Criteria andChufajiguan4In(List<String> values) {
            addCriterion("CHUFAJIGUAN4 in", values, "chufajiguan4");
            return (Criteria) this;
        }

        public Criteria andChufajiguan4NotIn(List<String> values) {
            addCriterion("CHUFAJIGUAN4 not in", values, "chufajiguan4");
            return (Criteria) this;
        }

        public Criteria andChufajiguan4Between(String value1, String value2) {
            addCriterion("CHUFAJIGUAN4 between", value1, value2, "chufajiguan4");
            return (Criteria) this;
        }

        public Criteria andChufajiguan4NotBetween(String value1, String value2) {
            addCriterion("CHUFAJIGUAN4 not between", value1, value2, "chufajiguan4");
            return (Criteria) this;
        }

        public Criteria andChufashijian4IsNull() {
            addCriterion("CHUFASHIJIAN4 is null");
            return (Criteria) this;
        }

        public Criteria andChufashijian4IsNotNull() {
            addCriterion("CHUFASHIJIAN4 is not null");
            return (Criteria) this;
        }

        public Criteria andChufashijian4EqualTo(Date value) {
            addCriterion("CHUFASHIJIAN4 =", value, "chufashijian4");
            return (Criteria) this;
        }

        public Criteria andChufashijian4NotEqualTo(Date value) {
            addCriterion("CHUFASHIJIAN4 <>", value, "chufashijian4");
            return (Criteria) this;
        }

        public Criteria andChufashijian4GreaterThan(Date value) {
            addCriterion("CHUFASHIJIAN4 >", value, "chufashijian4");
            return (Criteria) this;
        }

        public Criteria andChufashijian4GreaterThanOrEqualTo(Date value) {
            addCriterion("CHUFASHIJIAN4 >=", value, "chufashijian4");
            return (Criteria) this;
        }

        public Criteria andChufashijian4LessThan(Date value) {
            addCriterion("CHUFASHIJIAN4 <", value, "chufashijian4");
            return (Criteria) this;
        }

        public Criteria andChufashijian4LessThanOrEqualTo(Date value) {
            addCriterion("CHUFASHIJIAN4 <=", value, "chufashijian4");
            return (Criteria) this;
        }

        public Criteria andChufashijian4In(List<Date> values) {
            addCriterion("CHUFASHIJIAN4 in", values, "chufashijian4");
            return (Criteria) this;
        }

        public Criteria andChufashijian4NotIn(List<Date> values) {
            addCriterion("CHUFASHIJIAN4 not in", values, "chufashijian4");
            return (Criteria) this;
        }

        public Criteria andChufashijian4Between(Date value1, Date value2) {
            addCriterion("CHUFASHIJIAN4 between", value1, value2, "chufashijian4");
            return (Criteria) this;
        }

        public Criteria andChufashijian4NotBetween(Date value1, Date value2) {
            addCriterion("CHUFASHIJIAN4 not between", value1, value2, "chufashijian4");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei4IsNull() {
            addCriterion("WEIFAXINGWEI4 is null");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei4IsNotNull() {
            addCriterion("WEIFAXINGWEI4 is not null");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei4EqualTo(String value) {
            addCriterion("WEIFAXINGWEI4 =", value, "weifaxingwei4");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei4NotEqualTo(String value) {
            addCriterion("WEIFAXINGWEI4 <>", value, "weifaxingwei4");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei4GreaterThan(String value) {
            addCriterion("WEIFAXINGWEI4 >", value, "weifaxingwei4");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei4GreaterThanOrEqualTo(String value) {
            addCriterion("WEIFAXINGWEI4 >=", value, "weifaxingwei4");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei4LessThan(String value) {
            addCriterion("WEIFAXINGWEI4 <", value, "weifaxingwei4");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei4LessThanOrEqualTo(String value) {
            addCriterion("WEIFAXINGWEI4 <=", value, "weifaxingwei4");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei4Like(String value) {
            addCriterion("WEIFAXINGWEI4 like", value, "weifaxingwei4");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei4NotLike(String value) {
            addCriterion("WEIFAXINGWEI4 not like", value, "weifaxingwei4");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei4In(List<String> values) {
            addCriterion("WEIFAXINGWEI4 in", values, "weifaxingwei4");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei4NotIn(List<String> values) {
            addCriterion("WEIFAXINGWEI4 not in", values, "weifaxingwei4");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei4Between(String value1, String value2) {
            addCriterion("WEIFAXINGWEI4 between", value1, value2, "weifaxingwei4");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei4NotBetween(String value1, String value2) {
            addCriterion("WEIFAXINGWEI4 not between", value1, value2, "weifaxingwei4");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei5IsNull() {
            addCriterion("CHUFAZHONGLEI5 is null");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei5IsNotNull() {
            addCriterion("CHUFAZHONGLEI5 is not null");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei5EqualTo(String value) {
            addCriterion("CHUFAZHONGLEI5 =", value, "chufazhonglei5");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei5NotEqualTo(String value) {
            addCriterion("CHUFAZHONGLEI5 <>", value, "chufazhonglei5");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei5GreaterThan(String value) {
            addCriterion("CHUFAZHONGLEI5 >", value, "chufazhonglei5");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei5GreaterThanOrEqualTo(String value) {
            addCriterion("CHUFAZHONGLEI5 >=", value, "chufazhonglei5");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei5LessThan(String value) {
            addCriterion("CHUFAZHONGLEI5 <", value, "chufazhonglei5");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei5LessThanOrEqualTo(String value) {
            addCriterion("CHUFAZHONGLEI5 <=", value, "chufazhonglei5");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei5Like(String value) {
            addCriterion("CHUFAZHONGLEI5 like", value, "chufazhonglei5");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei5NotLike(String value) {
            addCriterion("CHUFAZHONGLEI5 not like", value, "chufazhonglei5");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei5In(List<String> values) {
            addCriterion("CHUFAZHONGLEI5 in", values, "chufazhonglei5");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei5NotIn(List<String> values) {
            addCriterion("CHUFAZHONGLEI5 not in", values, "chufazhonglei5");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei5Between(String value1, String value2) {
            addCriterion("CHUFAZHONGLEI5 between", value1, value2, "chufazhonglei5");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei5NotBetween(String value1, String value2) {
            addCriterion("CHUFAZHONGLEI5 not between", value1, value2, "chufazhonglei5");
            return (Criteria) this;
        }

        public Criteria andChufajiguan5IsNull() {
            addCriterion("CHUFAJIGUAN5 is null");
            return (Criteria) this;
        }

        public Criteria andChufajiguan5IsNotNull() {
            addCriterion("CHUFAJIGUAN5 is not null");
            return (Criteria) this;
        }

        public Criteria andChufajiguan5EqualTo(String value) {
            addCriterion("CHUFAJIGUAN5 =", value, "chufajiguan5");
            return (Criteria) this;
        }

        public Criteria andChufajiguan5NotEqualTo(String value) {
            addCriterion("CHUFAJIGUAN5 <>", value, "chufajiguan5");
            return (Criteria) this;
        }

        public Criteria andChufajiguan5GreaterThan(String value) {
            addCriterion("CHUFAJIGUAN5 >", value, "chufajiguan5");
            return (Criteria) this;
        }

        public Criteria andChufajiguan5GreaterThanOrEqualTo(String value) {
            addCriterion("CHUFAJIGUAN5 >=", value, "chufajiguan5");
            return (Criteria) this;
        }

        public Criteria andChufajiguan5LessThan(String value) {
            addCriterion("CHUFAJIGUAN5 <", value, "chufajiguan5");
            return (Criteria) this;
        }

        public Criteria andChufajiguan5LessThanOrEqualTo(String value) {
            addCriterion("CHUFAJIGUAN5 <=", value, "chufajiguan5");
            return (Criteria) this;
        }

        public Criteria andChufajiguan5Like(String value) {
            addCriterion("CHUFAJIGUAN5 like", value, "chufajiguan5");
            return (Criteria) this;
        }

        public Criteria andChufajiguan5NotLike(String value) {
            addCriterion("CHUFAJIGUAN5 not like", value, "chufajiguan5");
            return (Criteria) this;
        }

        public Criteria andChufajiguan5In(List<String> values) {
            addCriterion("CHUFAJIGUAN5 in", values, "chufajiguan5");
            return (Criteria) this;
        }

        public Criteria andChufajiguan5NotIn(List<String> values) {
            addCriterion("CHUFAJIGUAN5 not in", values, "chufajiguan5");
            return (Criteria) this;
        }

        public Criteria andChufajiguan5Between(String value1, String value2) {
            addCriterion("CHUFAJIGUAN5 between", value1, value2, "chufajiguan5");
            return (Criteria) this;
        }

        public Criteria andChufajiguan5NotBetween(String value1, String value2) {
            addCriterion("CHUFAJIGUAN5 not between", value1, value2, "chufajiguan5");
            return (Criteria) this;
        }

        public Criteria andChufashijian5IsNull() {
            addCriterion("CHUFASHIJIAN5 is null");
            return (Criteria) this;
        }

        public Criteria andChufashijian5IsNotNull() {
            addCriterion("CHUFASHIJIAN5 is not null");
            return (Criteria) this;
        }

        public Criteria andChufashijian5EqualTo(Date value) {
            addCriterion("CHUFASHIJIAN5 =", value, "chufashijian5");
            return (Criteria) this;
        }

        public Criteria andChufashijian5NotEqualTo(Date value) {
            addCriterion("CHUFASHIJIAN5 <>", value, "chufashijian5");
            return (Criteria) this;
        }

        public Criteria andChufashijian5GreaterThan(Date value) {
            addCriterion("CHUFASHIJIAN5 >", value, "chufashijian5");
            return (Criteria) this;
        }

        public Criteria andChufashijian5GreaterThanOrEqualTo(Date value) {
            addCriterion("CHUFASHIJIAN5 >=", value, "chufashijian5");
            return (Criteria) this;
        }

        public Criteria andChufashijian5LessThan(Date value) {
            addCriterion("CHUFASHIJIAN5 <", value, "chufashijian5");
            return (Criteria) this;
        }

        public Criteria andChufashijian5LessThanOrEqualTo(Date value) {
            addCriterion("CHUFASHIJIAN5 <=", value, "chufashijian5");
            return (Criteria) this;
        }

        public Criteria andChufashijian5In(List<Date> values) {
            addCriterion("CHUFASHIJIAN5 in", values, "chufashijian5");
            return (Criteria) this;
        }

        public Criteria andChufashijian5NotIn(List<Date> values) {
            addCriterion("CHUFASHIJIAN5 not in", values, "chufashijian5");
            return (Criteria) this;
        }

        public Criteria andChufashijian5Between(Date value1, Date value2) {
            addCriterion("CHUFASHIJIAN5 between", value1, value2, "chufashijian5");
            return (Criteria) this;
        }

        public Criteria andChufashijian5NotBetween(Date value1, Date value2) {
            addCriterion("CHUFASHIJIAN5 not between", value1, value2, "chufashijian5");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei5IsNull() {
            addCriterion("WEIFAXINGWEI5 is null");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei5IsNotNull() {
            addCriterion("WEIFAXINGWEI5 is not null");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei5EqualTo(String value) {
            addCriterion("WEIFAXINGWEI5 =", value, "weifaxingwei5");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei5NotEqualTo(String value) {
            addCriterion("WEIFAXINGWEI5 <>", value, "weifaxingwei5");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei5GreaterThan(String value) {
            addCriterion("WEIFAXINGWEI5 >", value, "weifaxingwei5");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei5GreaterThanOrEqualTo(String value) {
            addCriterion("WEIFAXINGWEI5 >=", value, "weifaxingwei5");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei5LessThan(String value) {
            addCriterion("WEIFAXINGWEI5 <", value, "weifaxingwei5");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei5LessThanOrEqualTo(String value) {
            addCriterion("WEIFAXINGWEI5 <=", value, "weifaxingwei5");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei5Like(String value) {
            addCriterion("WEIFAXINGWEI5 like", value, "weifaxingwei5");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei5NotLike(String value) {
            addCriterion("WEIFAXINGWEI5 not like", value, "weifaxingwei5");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei5In(List<String> values) {
            addCriterion("WEIFAXINGWEI5 in", values, "weifaxingwei5");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei5NotIn(List<String> values) {
            addCriterion("WEIFAXINGWEI5 not in", values, "weifaxingwei5");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei5Between(String value1, String value2) {
            addCriterion("WEIFAXINGWEI5 between", value1, value2, "weifaxingwei5");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei5NotBetween(String value1, String value2) {
            addCriterion("WEIFAXINGWEI5 not between", value1, value2, "weifaxingwei5");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei6IsNull() {
            addCriterion("CHUFAZHONGLEI6 is null");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei6IsNotNull() {
            addCriterion("CHUFAZHONGLEI6 is not null");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei6EqualTo(String value) {
            addCriterion("CHUFAZHONGLEI6 =", value, "chufazhonglei6");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei6NotEqualTo(String value) {
            addCriterion("CHUFAZHONGLEI6 <>", value, "chufazhonglei6");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei6GreaterThan(String value) {
            addCriterion("CHUFAZHONGLEI6 >", value, "chufazhonglei6");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei6GreaterThanOrEqualTo(String value) {
            addCriterion("CHUFAZHONGLEI6 >=", value, "chufazhonglei6");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei6LessThan(String value) {
            addCriterion("CHUFAZHONGLEI6 <", value, "chufazhonglei6");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei6LessThanOrEqualTo(String value) {
            addCriterion("CHUFAZHONGLEI6 <=", value, "chufazhonglei6");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei6Like(String value) {
            addCriterion("CHUFAZHONGLEI6 like", value, "chufazhonglei6");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei6NotLike(String value) {
            addCriterion("CHUFAZHONGLEI6 not like", value, "chufazhonglei6");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei6In(List<String> values) {
            addCriterion("CHUFAZHONGLEI6 in", values, "chufazhonglei6");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei6NotIn(List<String> values) {
            addCriterion("CHUFAZHONGLEI6 not in", values, "chufazhonglei6");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei6Between(String value1, String value2) {
            addCriterion("CHUFAZHONGLEI6 between", value1, value2, "chufazhonglei6");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei6NotBetween(String value1, String value2) {
            addCriterion("CHUFAZHONGLEI6 not between", value1, value2, "chufazhonglei6");
            return (Criteria) this;
        }

        public Criteria andChufajiguan6IsNull() {
            addCriterion("CHUFAJIGUAN6 is null");
            return (Criteria) this;
        }

        public Criteria andChufajiguan6IsNotNull() {
            addCriterion("CHUFAJIGUAN6 is not null");
            return (Criteria) this;
        }

        public Criteria andChufajiguan6EqualTo(String value) {
            addCriterion("CHUFAJIGUAN6 =", value, "chufajiguan6");
            return (Criteria) this;
        }

        public Criteria andChufajiguan6NotEqualTo(String value) {
            addCriterion("CHUFAJIGUAN6 <>", value, "chufajiguan6");
            return (Criteria) this;
        }

        public Criteria andChufajiguan6GreaterThan(String value) {
            addCriterion("CHUFAJIGUAN6 >", value, "chufajiguan6");
            return (Criteria) this;
        }

        public Criteria andChufajiguan6GreaterThanOrEqualTo(String value) {
            addCriterion("CHUFAJIGUAN6 >=", value, "chufajiguan6");
            return (Criteria) this;
        }

        public Criteria andChufajiguan6LessThan(String value) {
            addCriterion("CHUFAJIGUAN6 <", value, "chufajiguan6");
            return (Criteria) this;
        }

        public Criteria andChufajiguan6LessThanOrEqualTo(String value) {
            addCriterion("CHUFAJIGUAN6 <=", value, "chufajiguan6");
            return (Criteria) this;
        }

        public Criteria andChufajiguan6Like(String value) {
            addCriterion("CHUFAJIGUAN6 like", value, "chufajiguan6");
            return (Criteria) this;
        }

        public Criteria andChufajiguan6NotLike(String value) {
            addCriterion("CHUFAJIGUAN6 not like", value, "chufajiguan6");
            return (Criteria) this;
        }

        public Criteria andChufajiguan6In(List<String> values) {
            addCriterion("CHUFAJIGUAN6 in", values, "chufajiguan6");
            return (Criteria) this;
        }

        public Criteria andChufajiguan6NotIn(List<String> values) {
            addCriterion("CHUFAJIGUAN6 not in", values, "chufajiguan6");
            return (Criteria) this;
        }

        public Criteria andChufajiguan6Between(String value1, String value2) {
            addCriterion("CHUFAJIGUAN6 between", value1, value2, "chufajiguan6");
            return (Criteria) this;
        }

        public Criteria andChufajiguan6NotBetween(String value1, String value2) {
            addCriterion("CHUFAJIGUAN6 not between", value1, value2, "chufajiguan6");
            return (Criteria) this;
        }

        public Criteria andChufashijian6IsNull() {
            addCriterion("CHUFASHIJIAN6 is null");
            return (Criteria) this;
        }

        public Criteria andChufashijian6IsNotNull() {
            addCriterion("CHUFASHIJIAN6 is not null");
            return (Criteria) this;
        }

        public Criteria andChufashijian6EqualTo(Date value) {
            addCriterion("CHUFASHIJIAN6 =", value, "chufashijian6");
            return (Criteria) this;
        }

        public Criteria andChufashijian6NotEqualTo(Date value) {
            addCriterion("CHUFASHIJIAN6 <>", value, "chufashijian6");
            return (Criteria) this;
        }

        public Criteria andChufashijian6GreaterThan(Date value) {
            addCriterion("CHUFASHIJIAN6 >", value, "chufashijian6");
            return (Criteria) this;
        }

        public Criteria andChufashijian6GreaterThanOrEqualTo(Date value) {
            addCriterion("CHUFASHIJIAN6 >=", value, "chufashijian6");
            return (Criteria) this;
        }

        public Criteria andChufashijian6LessThan(Date value) {
            addCriterion("CHUFASHIJIAN6 <", value, "chufashijian6");
            return (Criteria) this;
        }

        public Criteria andChufashijian6LessThanOrEqualTo(Date value) {
            addCriterion("CHUFASHIJIAN6 <=", value, "chufashijian6");
            return (Criteria) this;
        }

        public Criteria andChufashijian6In(List<Date> values) {
            addCriterion("CHUFASHIJIAN6 in", values, "chufashijian6");
            return (Criteria) this;
        }

        public Criteria andChufashijian6NotIn(List<Date> values) {
            addCriterion("CHUFASHIJIAN6 not in", values, "chufashijian6");
            return (Criteria) this;
        }

        public Criteria andChufashijian6Between(Date value1, Date value2) {
            addCriterion("CHUFASHIJIAN6 between", value1, value2, "chufashijian6");
            return (Criteria) this;
        }

        public Criteria andChufashijian6NotBetween(Date value1, Date value2) {
            addCriterion("CHUFASHIJIAN6 not between", value1, value2, "chufashijian6");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei6IsNull() {
            addCriterion("WEIFAXINGWEI6 is null");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei6IsNotNull() {
            addCriterion("WEIFAXINGWEI6 is not null");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei6EqualTo(String value) {
            addCriterion("WEIFAXINGWEI6 =", value, "weifaxingwei6");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei6NotEqualTo(String value) {
            addCriterion("WEIFAXINGWEI6 <>", value, "weifaxingwei6");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei6GreaterThan(String value) {
            addCriterion("WEIFAXINGWEI6 >", value, "weifaxingwei6");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei6GreaterThanOrEqualTo(String value) {
            addCriterion("WEIFAXINGWEI6 >=", value, "weifaxingwei6");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei6LessThan(String value) {
            addCriterion("WEIFAXINGWEI6 <", value, "weifaxingwei6");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei6LessThanOrEqualTo(String value) {
            addCriterion("WEIFAXINGWEI6 <=", value, "weifaxingwei6");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei6Like(String value) {
            addCriterion("WEIFAXINGWEI6 like", value, "weifaxingwei6");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei6NotLike(String value) {
            addCriterion("WEIFAXINGWEI6 not like", value, "weifaxingwei6");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei6In(List<String> values) {
            addCriterion("WEIFAXINGWEI6 in", values, "weifaxingwei6");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei6NotIn(List<String> values) {
            addCriterion("WEIFAXINGWEI6 not in", values, "weifaxingwei6");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei6Between(String value1, String value2) {
            addCriterion("WEIFAXINGWEI6 between", value1, value2, "weifaxingwei6");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei6NotBetween(String value1, String value2) {
            addCriterion("WEIFAXINGWEI6 not between", value1, value2, "weifaxingwei6");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei7IsNull() {
            addCriterion("CHUFAZHONGLEI7 is null");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei7IsNotNull() {
            addCriterion("CHUFAZHONGLEI7 is not null");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei7EqualTo(String value) {
            addCriterion("CHUFAZHONGLEI7 =", value, "chufazhonglei7");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei7NotEqualTo(String value) {
            addCriterion("CHUFAZHONGLEI7 <>", value, "chufazhonglei7");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei7GreaterThan(String value) {
            addCriterion("CHUFAZHONGLEI7 >", value, "chufazhonglei7");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei7GreaterThanOrEqualTo(String value) {
            addCriterion("CHUFAZHONGLEI7 >=", value, "chufazhonglei7");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei7LessThan(String value) {
            addCriterion("CHUFAZHONGLEI7 <", value, "chufazhonglei7");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei7LessThanOrEqualTo(String value) {
            addCriterion("CHUFAZHONGLEI7 <=", value, "chufazhonglei7");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei7Like(String value) {
            addCriterion("CHUFAZHONGLEI7 like", value, "chufazhonglei7");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei7NotLike(String value) {
            addCriterion("CHUFAZHONGLEI7 not like", value, "chufazhonglei7");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei7In(List<String> values) {
            addCriterion("CHUFAZHONGLEI7 in", values, "chufazhonglei7");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei7NotIn(List<String> values) {
            addCriterion("CHUFAZHONGLEI7 not in", values, "chufazhonglei7");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei7Between(String value1, String value2) {
            addCriterion("CHUFAZHONGLEI7 between", value1, value2, "chufazhonglei7");
            return (Criteria) this;
        }

        public Criteria andChufazhonglei7NotBetween(String value1, String value2) {
            addCriterion("CHUFAZHONGLEI7 not between", value1, value2, "chufazhonglei7");
            return (Criteria) this;
        }

        public Criteria andChufajiguan7IsNull() {
            addCriterion("CHUFAJIGUAN7 is null");
            return (Criteria) this;
        }

        public Criteria andChufajiguan7IsNotNull() {
            addCriterion("CHUFAJIGUAN7 is not null");
            return (Criteria) this;
        }

        public Criteria andChufajiguan7EqualTo(String value) {
            addCriterion("CHUFAJIGUAN7 =", value, "chufajiguan7");
            return (Criteria) this;
        }

        public Criteria andChufajiguan7NotEqualTo(String value) {
            addCriterion("CHUFAJIGUAN7 <>", value, "chufajiguan7");
            return (Criteria) this;
        }

        public Criteria andChufajiguan7GreaterThan(String value) {
            addCriterion("CHUFAJIGUAN7 >", value, "chufajiguan7");
            return (Criteria) this;
        }

        public Criteria andChufajiguan7GreaterThanOrEqualTo(String value) {
            addCriterion("CHUFAJIGUAN7 >=", value, "chufajiguan7");
            return (Criteria) this;
        }

        public Criteria andChufajiguan7LessThan(String value) {
            addCriterion("CHUFAJIGUAN7 <", value, "chufajiguan7");
            return (Criteria) this;
        }

        public Criteria andChufajiguan7LessThanOrEqualTo(String value) {
            addCriterion("CHUFAJIGUAN7 <=", value, "chufajiguan7");
            return (Criteria) this;
        }

        public Criteria andChufajiguan7Like(String value) {
            addCriterion("CHUFAJIGUAN7 like", value, "chufajiguan7");
            return (Criteria) this;
        }

        public Criteria andChufajiguan7NotLike(String value) {
            addCriterion("CHUFAJIGUAN7 not like", value, "chufajiguan7");
            return (Criteria) this;
        }

        public Criteria andChufajiguan7In(List<String> values) {
            addCriterion("CHUFAJIGUAN7 in", values, "chufajiguan7");
            return (Criteria) this;
        }

        public Criteria andChufajiguan7NotIn(List<String> values) {
            addCriterion("CHUFAJIGUAN7 not in", values, "chufajiguan7");
            return (Criteria) this;
        }

        public Criteria andChufajiguan7Between(String value1, String value2) {
            addCriterion("CHUFAJIGUAN7 between", value1, value2, "chufajiguan7");
            return (Criteria) this;
        }

        public Criteria andChufajiguan7NotBetween(String value1, String value2) {
            addCriterion("CHUFAJIGUAN7 not between", value1, value2, "chufajiguan7");
            return (Criteria) this;
        }

        public Criteria andChufashijian7IsNull() {
            addCriterion("CHUFASHIJIAN7 is null");
            return (Criteria) this;
        }

        public Criteria andChufashijian7IsNotNull() {
            addCriterion("CHUFASHIJIAN7 is not null");
            return (Criteria) this;
        }

        public Criteria andChufashijian7EqualTo(Date value) {
            addCriterion("CHUFASHIJIAN7 =", value, "chufashijian7");
            return (Criteria) this;
        }

        public Criteria andChufashijian7NotEqualTo(Date value) {
            addCriterion("CHUFASHIJIAN7 <>", value, "chufashijian7");
            return (Criteria) this;
        }

        public Criteria andChufashijian7GreaterThan(Date value) {
            addCriterion("CHUFASHIJIAN7 >", value, "chufashijian7");
            return (Criteria) this;
        }

        public Criteria andChufashijian7GreaterThanOrEqualTo(Date value) {
            addCriterion("CHUFASHIJIAN7 >=", value, "chufashijian7");
            return (Criteria) this;
        }

        public Criteria andChufashijian7LessThan(Date value) {
            addCriterion("CHUFASHIJIAN7 <", value, "chufashijian7");
            return (Criteria) this;
        }

        public Criteria andChufashijian7LessThanOrEqualTo(Date value) {
            addCriterion("CHUFASHIJIAN7 <=", value, "chufashijian7");
            return (Criteria) this;
        }

        public Criteria andChufashijian7In(List<Date> values) {
            addCriterion("CHUFASHIJIAN7 in", values, "chufashijian7");
            return (Criteria) this;
        }

        public Criteria andChufashijian7NotIn(List<Date> values) {
            addCriterion("CHUFASHIJIAN7 not in", values, "chufashijian7");
            return (Criteria) this;
        }

        public Criteria andChufashijian7Between(Date value1, Date value2) {
            addCriterion("CHUFASHIJIAN7 between", value1, value2, "chufashijian7");
            return (Criteria) this;
        }

        public Criteria andChufashijian7NotBetween(Date value1, Date value2) {
            addCriterion("CHUFASHIJIAN7 not between", value1, value2, "chufashijian7");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei7IsNull() {
            addCriterion("WEIFAXINGWEI7 is null");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei7IsNotNull() {
            addCriterion("WEIFAXINGWEI7 is not null");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei7EqualTo(String value) {
            addCriterion("WEIFAXINGWEI7 =", value, "weifaxingwei7");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei7NotEqualTo(String value) {
            addCriterion("WEIFAXINGWEI7 <>", value, "weifaxingwei7");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei7GreaterThan(String value) {
            addCriterion("WEIFAXINGWEI7 >", value, "weifaxingwei7");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei7GreaterThanOrEqualTo(String value) {
            addCriterion("WEIFAXINGWEI7 >=", value, "weifaxingwei7");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei7LessThan(String value) {
            addCriterion("WEIFAXINGWEI7 <", value, "weifaxingwei7");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei7LessThanOrEqualTo(String value) {
            addCriterion("WEIFAXINGWEI7 <=", value, "weifaxingwei7");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei7Like(String value) {
            addCriterion("WEIFAXINGWEI7 like", value, "weifaxingwei7");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei7NotLike(String value) {
            addCriterion("WEIFAXINGWEI7 not like", value, "weifaxingwei7");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei7In(List<String> values) {
            addCriterion("WEIFAXINGWEI7 in", values, "weifaxingwei7");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei7NotIn(List<String> values) {
            addCriterion("WEIFAXINGWEI7 not in", values, "weifaxingwei7");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei7Between(String value1, String value2) {
            addCriterion("WEIFAXINGWEI7 between", value1, value2, "weifaxingwei7");
            return (Criteria) this;
        }

        public Criteria andWeifaxingwei7NotBetween(String value1, String value2) {
            addCriterion("WEIFAXINGWEI7 not between", value1, value2, "weifaxingwei7");
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