package com.xgb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JjhnjJgjslsjqkSubExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JjhnjJgjslsjqkSubExample() {
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

        public Criteria andNianIsNull() {
            addCriterion("NIAN is null");
            return (Criteria) this;
        }

        public Criteria andNianIsNotNull() {
            addCriterion("NIAN is not null");
            return (Criteria) this;
        }

        public Criteria andNianEqualTo(String value) {
            addCriterion("NIAN =", value, "nian");
            return (Criteria) this;
        }

        public Criteria andNianNotEqualTo(String value) {
            addCriterion("NIAN <>", value, "nian");
            return (Criteria) this;
        }

        public Criteria andNianGreaterThan(String value) {
            addCriterion("NIAN >", value, "nian");
            return (Criteria) this;
        }

        public Criteria andNianGreaterThanOrEqualTo(String value) {
            addCriterion("NIAN >=", value, "nian");
            return (Criteria) this;
        }

        public Criteria andNianLessThan(String value) {
            addCriterion("NIAN <", value, "nian");
            return (Criteria) this;
        }

        public Criteria andNianLessThanOrEqualTo(String value) {
            addCriterion("NIAN <=", value, "nian");
            return (Criteria) this;
        }

        public Criteria andNianLike(String value) {
            addCriterion("NIAN like", value, "nian");
            return (Criteria) this;
        }

        public Criteria andNianNotLike(String value) {
            addCriterion("NIAN not like", value, "nian");
            return (Criteria) this;
        }

        public Criteria andNianIn(List<String> values) {
            addCriterion("NIAN in", values, "nian");
            return (Criteria) this;
        }

        public Criteria andNianNotIn(List<String> values) {
            addCriterion("NIAN not in", values, "nian");
            return (Criteria) this;
        }

        public Criteria andNianBetween(String value1, String value2) {
            addCriterion("NIAN between", value1, value2, "nian");
            return (Criteria) this;
        }

        public Criteria andNianNotBetween(String value1, String value2) {
            addCriterion("NIAN not between", value1, value2, "nian");
            return (Criteria) this;
        }

        public Criteria andYueIsNull() {
            addCriterion("YUE is null");
            return (Criteria) this;
        }

        public Criteria andYueIsNotNull() {
            addCriterion("YUE is not null");
            return (Criteria) this;
        }

        public Criteria andYueEqualTo(String value) {
            addCriterion("YUE =", value, "yue");
            return (Criteria) this;
        }

        public Criteria andYueNotEqualTo(String value) {
            addCriterion("YUE <>", value, "yue");
            return (Criteria) this;
        }

        public Criteria andYueGreaterThan(String value) {
            addCriterion("YUE >", value, "yue");
            return (Criteria) this;
        }

        public Criteria andYueGreaterThanOrEqualTo(String value) {
            addCriterion("YUE >=", value, "yue");
            return (Criteria) this;
        }

        public Criteria andYueLessThan(String value) {
            addCriterion("YUE <", value, "yue");
            return (Criteria) this;
        }

        public Criteria andYueLessThanOrEqualTo(String value) {
            addCriterion("YUE <=", value, "yue");
            return (Criteria) this;
        }

        public Criteria andYueLike(String value) {
            addCriterion("YUE like", value, "yue");
            return (Criteria) this;
        }

        public Criteria andYueNotLike(String value) {
            addCriterion("YUE not like", value, "yue");
            return (Criteria) this;
        }

        public Criteria andYueIn(List<String> values) {
            addCriterion("YUE in", values, "yue");
            return (Criteria) this;
        }

        public Criteria andYueNotIn(List<String> values) {
            addCriterion("YUE not in", values, "yue");
            return (Criteria) this;
        }

        public Criteria andYueBetween(String value1, String value2) {
            addCriterion("YUE between", value1, value2, "yue");
            return (Criteria) this;
        }

        public Criteria andYueNotBetween(String value1, String value2) {
            addCriterion("YUE not between", value1, value2, "yue");
            return (Criteria) this;
        }

        public Criteria andRiIsNull() {
            addCriterion("RI is null");
            return (Criteria) this;
        }

        public Criteria andRiIsNotNull() {
            addCriterion("RI is not null");
            return (Criteria) this;
        }

        public Criteria andRiEqualTo(String value) {
            addCriterion("RI =", value, "ri");
            return (Criteria) this;
        }

        public Criteria andRiNotEqualTo(String value) {
            addCriterion("RI <>", value, "ri");
            return (Criteria) this;
        }

        public Criteria andRiGreaterThan(String value) {
            addCriterion("RI >", value, "ri");
            return (Criteria) this;
        }

        public Criteria andRiGreaterThanOrEqualTo(String value) {
            addCriterion("RI >=", value, "ri");
            return (Criteria) this;
        }

        public Criteria andRiLessThan(String value) {
            addCriterion("RI <", value, "ri");
            return (Criteria) this;
        }

        public Criteria andRiLessThanOrEqualTo(String value) {
            addCriterion("RI <=", value, "ri");
            return (Criteria) this;
        }

        public Criteria andRiLike(String value) {
            addCriterion("RI like", value, "ri");
            return (Criteria) this;
        }

        public Criteria andRiNotLike(String value) {
            addCriterion("RI not like", value, "ri");
            return (Criteria) this;
        }

        public Criteria andRiIn(List<String> values) {
            addCriterion("RI in", values, "ri");
            return (Criteria) this;
        }

        public Criteria andRiNotIn(List<String> values) {
            addCriterion("RI not in", values, "ri");
            return (Criteria) this;
        }

        public Criteria andRiBetween(String value1, String value2) {
            addCriterion("RI between", value1, value2, "ri");
            return (Criteria) this;
        }

        public Criteria andRiNotBetween(String value1, String value2) {
            addCriterion("RI not between", value1, value2, "ri");
            return (Criteria) this;
        }

        public Criteria andJieIsNull() {
            addCriterion("JIE is null");
            return (Criteria) this;
        }

        public Criteria andJieIsNotNull() {
            addCriterion("JIE is not null");
            return (Criteria) this;
        }

        public Criteria andJieEqualTo(String value) {
            addCriterion("JIE =", value, "jie");
            return (Criteria) this;
        }

        public Criteria andJieNotEqualTo(String value) {
            addCriterion("JIE <>", value, "jie");
            return (Criteria) this;
        }

        public Criteria andJieGreaterThan(String value) {
            addCriterion("JIE >", value, "jie");
            return (Criteria) this;
        }

        public Criteria andJieGreaterThanOrEqualTo(String value) {
            addCriterion("JIE >=", value, "jie");
            return (Criteria) this;
        }

        public Criteria andJieLessThan(String value) {
            addCriterion("JIE <", value, "jie");
            return (Criteria) this;
        }

        public Criteria andJieLessThanOrEqualTo(String value) {
            addCriterion("JIE <=", value, "jie");
            return (Criteria) this;
        }

        public Criteria andJieLike(String value) {
            addCriterion("JIE like", value, "jie");
            return (Criteria) this;
        }

        public Criteria andJieNotLike(String value) {
            addCriterion("JIE not like", value, "jie");
            return (Criteria) this;
        }

        public Criteria andJieIn(List<String> values) {
            addCriterion("JIE in", values, "jie");
            return (Criteria) this;
        }

        public Criteria andJieNotIn(List<String> values) {
            addCriterion("JIE not in", values, "jie");
            return (Criteria) this;
        }

        public Criteria andJieBetween(String value1, String value2) {
            addCriterion("JIE between", value1, value2, "jie");
            return (Criteria) this;
        }

        public Criteria andJieNotBetween(String value1, String value2) {
            addCriterion("JIE not between", value1, value2, "jie");
            return (Criteria) this;
        }

        public Criteria andCiIsNull() {
            addCriterion("CI is null");
            return (Criteria) this;
        }

        public Criteria andCiIsNotNull() {
            addCriterion("CI is not null");
            return (Criteria) this;
        }

        public Criteria andCiEqualTo(String value) {
            addCriterion("CI =", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiNotEqualTo(String value) {
            addCriterion("CI <>", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiGreaterThan(String value) {
            addCriterion("CI >", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiGreaterThanOrEqualTo(String value) {
            addCriterion("CI >=", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiLessThan(String value) {
            addCriterion("CI <", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiLessThanOrEqualTo(String value) {
            addCriterion("CI <=", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiLike(String value) {
            addCriterion("CI like", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiNotLike(String value) {
            addCriterion("CI not like", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiIn(List<String> values) {
            addCriterion("CI in", values, "ci");
            return (Criteria) this;
        }

        public Criteria andCiNotIn(List<String> values) {
            addCriterion("CI not in", values, "ci");
            return (Criteria) this;
        }

        public Criteria andCiBetween(String value1, String value2) {
            addCriterion("CI between", value1, value2, "ci");
            return (Criteria) this;
        }

        public Criteria andCiNotBetween(String value1, String value2) {
            addCriterion("CI not between", value1, value2, "ci");
            return (Criteria) this;
        }

        public Criteria andHuiyishijianIsNull() {
            addCriterion("HUIYISHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andHuiyishijianIsNotNull() {
            addCriterion("HUIYISHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andHuiyishijianEqualTo(Date value) {
            addCriterion("HUIYISHIJIAN =", value, "huiyishijian");
            return (Criteria) this;
        }

        public Criteria andHuiyishijianNotEqualTo(Date value) {
            addCriterion("HUIYISHIJIAN <>", value, "huiyishijian");
            return (Criteria) this;
        }

        public Criteria andHuiyishijianGreaterThan(Date value) {
            addCriterion("HUIYISHIJIAN >", value, "huiyishijian");
            return (Criteria) this;
        }

        public Criteria andHuiyishijianGreaterThanOrEqualTo(Date value) {
            addCriterion("HUIYISHIJIAN >=", value, "huiyishijian");
            return (Criteria) this;
        }

        public Criteria andHuiyishijianLessThan(Date value) {
            addCriterion("HUIYISHIJIAN <", value, "huiyishijian");
            return (Criteria) this;
        }

        public Criteria andHuiyishijianLessThanOrEqualTo(Date value) {
            addCriterion("HUIYISHIJIAN <=", value, "huiyishijian");
            return (Criteria) this;
        }

        public Criteria andHuiyishijianIn(List<Date> values) {
            addCriterion("HUIYISHIJIAN in", values, "huiyishijian");
            return (Criteria) this;
        }

        public Criteria andHuiyishijianNotIn(List<Date> values) {
            addCriterion("HUIYISHIJIAN not in", values, "huiyishijian");
            return (Criteria) this;
        }

        public Criteria andHuiyishijianBetween(Date value1, Date value2) {
            addCriterion("HUIYISHIJIAN between", value1, value2, "huiyishijian");
            return (Criteria) this;
        }

        public Criteria andHuiyishijianNotBetween(Date value1, Date value2) {
            addCriterion("HUIYISHIJIAN not between", value1, value2, "huiyishijian");
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

        public Criteria andHuiyizhutiIsNull() {
            addCriterion("HUIYIZHUTI is null");
            return (Criteria) this;
        }

        public Criteria andHuiyizhutiIsNotNull() {
            addCriterion("HUIYIZHUTI is not null");
            return (Criteria) this;
        }

        public Criteria andHuiyizhutiEqualTo(String value) {
            addCriterion("HUIYIZHUTI =", value, "huiyizhuti");
            return (Criteria) this;
        }

        public Criteria andHuiyizhutiNotEqualTo(String value) {
            addCriterion("HUIYIZHUTI <>", value, "huiyizhuti");
            return (Criteria) this;
        }

        public Criteria andHuiyizhutiGreaterThan(String value) {
            addCriterion("HUIYIZHUTI >", value, "huiyizhuti");
            return (Criteria) this;
        }

        public Criteria andHuiyizhutiGreaterThanOrEqualTo(String value) {
            addCriterion("HUIYIZHUTI >=", value, "huiyizhuti");
            return (Criteria) this;
        }

        public Criteria andHuiyizhutiLessThan(String value) {
            addCriterion("HUIYIZHUTI <", value, "huiyizhuti");
            return (Criteria) this;
        }

        public Criteria andHuiyizhutiLessThanOrEqualTo(String value) {
            addCriterion("HUIYIZHUTI <=", value, "huiyizhuti");
            return (Criteria) this;
        }

        public Criteria andHuiyizhutiLike(String value) {
            addCriterion("HUIYIZHUTI like", value, "huiyizhuti");
            return (Criteria) this;
        }

        public Criteria andHuiyizhutiNotLike(String value) {
            addCriterion("HUIYIZHUTI not like", value, "huiyizhuti");
            return (Criteria) this;
        }

        public Criteria andHuiyizhutiIn(List<String> values) {
            addCriterion("HUIYIZHUTI in", values, "huiyizhuti");
            return (Criteria) this;
        }

        public Criteria andHuiyizhutiNotIn(List<String> values) {
            addCriterion("HUIYIZHUTI not in", values, "huiyizhuti");
            return (Criteria) this;
        }

        public Criteria andHuiyizhutiBetween(String value1, String value2) {
            addCriterion("HUIYIZHUTI between", value1, value2, "huiyizhuti");
            return (Criteria) this;
        }

        public Criteria andHuiyizhutiNotBetween(String value1, String value2) {
            addCriterion("HUIYIZHUTI not between", value1, value2, "huiyizhuti");
            return (Criteria) this;
        }

        public Criteria andRenyuanmingdanIsNull() {
            addCriterion("RENYUANMINGDAN is null");
            return (Criteria) this;
        }

        public Criteria andRenyuanmingdanIsNotNull() {
            addCriterion("RENYUANMINGDAN is not null");
            return (Criteria) this;
        }

        public Criteria andRenyuanmingdanEqualTo(String value) {
            addCriterion("RENYUANMINGDAN =", value, "renyuanmingdan");
            return (Criteria) this;
        }

        public Criteria andRenyuanmingdanNotEqualTo(String value) {
            addCriterion("RENYUANMINGDAN <>", value, "renyuanmingdan");
            return (Criteria) this;
        }

        public Criteria andRenyuanmingdanGreaterThan(String value) {
            addCriterion("RENYUANMINGDAN >", value, "renyuanmingdan");
            return (Criteria) this;
        }

        public Criteria andRenyuanmingdanGreaterThanOrEqualTo(String value) {
            addCriterion("RENYUANMINGDAN >=", value, "renyuanmingdan");
            return (Criteria) this;
        }

        public Criteria andRenyuanmingdanLessThan(String value) {
            addCriterion("RENYUANMINGDAN <", value, "renyuanmingdan");
            return (Criteria) this;
        }

        public Criteria andRenyuanmingdanLessThanOrEqualTo(String value) {
            addCriterion("RENYUANMINGDAN <=", value, "renyuanmingdan");
            return (Criteria) this;
        }

        public Criteria andRenyuanmingdanLike(String value) {
            addCriterion("RENYUANMINGDAN like", value, "renyuanmingdan");
            return (Criteria) this;
        }

        public Criteria andRenyuanmingdanNotLike(String value) {
            addCriterion("RENYUANMINGDAN not like", value, "renyuanmingdan");
            return (Criteria) this;
        }

        public Criteria andRenyuanmingdanIn(List<String> values) {
            addCriterion("RENYUANMINGDAN in", values, "renyuanmingdan");
            return (Criteria) this;
        }

        public Criteria andRenyuanmingdanNotIn(List<String> values) {
            addCriterion("RENYUANMINGDAN not in", values, "renyuanmingdan");
            return (Criteria) this;
        }

        public Criteria andRenyuanmingdanBetween(String value1, String value2) {
            addCriterion("RENYUANMINGDAN between", value1, value2, "renyuanmingdan");
            return (Criteria) this;
        }

        public Criteria andRenyuanmingdanNotBetween(String value1, String value2) {
            addCriterion("RENYUANMINGDAN not between", value1, value2, "renyuanmingdan");
            return (Criteria) this;
        }

        public Criteria andHuiyijueyiIsNull() {
            addCriterion("HUIYIJUEYI is null");
            return (Criteria) this;
        }

        public Criteria andHuiyijueyiIsNotNull() {
            addCriterion("HUIYIJUEYI is not null");
            return (Criteria) this;
        }

        public Criteria andHuiyijueyiEqualTo(String value) {
            addCriterion("HUIYIJUEYI =", value, "huiyijueyi");
            return (Criteria) this;
        }

        public Criteria andHuiyijueyiNotEqualTo(String value) {
            addCriterion("HUIYIJUEYI <>", value, "huiyijueyi");
            return (Criteria) this;
        }

        public Criteria andHuiyijueyiGreaterThan(String value) {
            addCriterion("HUIYIJUEYI >", value, "huiyijueyi");
            return (Criteria) this;
        }

        public Criteria andHuiyijueyiGreaterThanOrEqualTo(String value) {
            addCriterion("HUIYIJUEYI >=", value, "huiyijueyi");
            return (Criteria) this;
        }

        public Criteria andHuiyijueyiLessThan(String value) {
            addCriterion("HUIYIJUEYI <", value, "huiyijueyi");
            return (Criteria) this;
        }

        public Criteria andHuiyijueyiLessThanOrEqualTo(String value) {
            addCriterion("HUIYIJUEYI <=", value, "huiyijueyi");
            return (Criteria) this;
        }

        public Criteria andHuiyijueyiLike(String value) {
            addCriterion("HUIYIJUEYI like", value, "huiyijueyi");
            return (Criteria) this;
        }

        public Criteria andHuiyijueyiNotLike(String value) {
            addCriterion("HUIYIJUEYI not like", value, "huiyijueyi");
            return (Criteria) this;
        }

        public Criteria andHuiyijueyiIn(List<String> values) {
            addCriterion("HUIYIJUEYI in", values, "huiyijueyi");
            return (Criteria) this;
        }

        public Criteria andHuiyijueyiNotIn(List<String> values) {
            addCriterion("HUIYIJUEYI not in", values, "huiyijueyi");
            return (Criteria) this;
        }

        public Criteria andHuiyijueyiBetween(String value1, String value2) {
            addCriterion("HUIYIJUEYI between", value1, value2, "huiyijueyi");
            return (Criteria) this;
        }

        public Criteria andHuiyijueyiNotBetween(String value1, String value2) {
            addCriterion("HUIYIJUEYI not between", value1, value2, "huiyijueyi");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNull() {
            addCriterion("BEIZHU is null");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNotNull() {
            addCriterion("BEIZHU is not null");
            return (Criteria) this;
        }

        public Criteria andBeizhuEqualTo(String value) {
            addCriterion("BEIZHU =", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotEqualTo(String value) {
            addCriterion("BEIZHU <>", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThan(String value) {
            addCriterion("BEIZHU >", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThanOrEqualTo(String value) {
            addCriterion("BEIZHU >=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThan(String value) {
            addCriterion("BEIZHU <", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThanOrEqualTo(String value) {
            addCriterion("BEIZHU <=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLike(String value) {
            addCriterion("BEIZHU like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotLike(String value) {
            addCriterion("BEIZHU not like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuIn(List<String> values) {
            addCriterion("BEIZHU in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotIn(List<String> values) {
            addCriterion("BEIZHU not in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuBetween(String value1, String value2) {
            addCriterion("BEIZHU between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotBetween(String value1, String value2) {
            addCriterion("BEIZHU not between", value1, value2, "beizhu");
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

        public Criteria andXuhaoEqualTo(Short value) {
            addCriterion("XUHAO =", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoNotEqualTo(Short value) {
            addCriterion("XUHAO <>", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoGreaterThan(Short value) {
            addCriterion("XUHAO >", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoGreaterThanOrEqualTo(Short value) {
            addCriterion("XUHAO >=", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoLessThan(Short value) {
            addCriterion("XUHAO <", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoLessThanOrEqualTo(Short value) {
            addCriterion("XUHAO <=", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoIn(List<Short> values) {
            addCriterion("XUHAO in", values, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoNotIn(List<Short> values) {
            addCriterion("XUHAO not in", values, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoBetween(Short value1, Short value2) {
            addCriterion("XUHAO between", value1, value2, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoNotBetween(Short value1, Short value2) {
            addCriterion("XUHAO not between", value1, value2, "xuhao");
            return (Criteria) this;
        }

        public Criteria andChuxilishi1IsNull() {
            addCriterion("CHUXILISHI1 is null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi1IsNotNull() {
            addCriterion("CHUXILISHI1 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi1EqualTo(String value) {
            addCriterion("CHUXILISHI1 =", value, "chuxilishi1");
            return (Criteria) this;
        }

        public Criteria andChuxilishi1NotEqualTo(String value) {
            addCriterion("CHUXILISHI1 <>", value, "chuxilishi1");
            return (Criteria) this;
        }

        public Criteria andChuxilishi1GreaterThan(String value) {
            addCriterion("CHUXILISHI1 >", value, "chuxilishi1");
            return (Criteria) this;
        }

        public Criteria andChuxilishi1GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI1 >=", value, "chuxilishi1");
            return (Criteria) this;
        }

        public Criteria andChuxilishi1LessThan(String value) {
            addCriterion("CHUXILISHI1 <", value, "chuxilishi1");
            return (Criteria) this;
        }

        public Criteria andChuxilishi1LessThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI1 <=", value, "chuxilishi1");
            return (Criteria) this;
        }

        public Criteria andChuxilishi1Like(String value) {
            addCriterion("CHUXILISHI1 like", value, "chuxilishi1");
            return (Criteria) this;
        }

        public Criteria andChuxilishi1NotLike(String value) {
            addCriterion("CHUXILISHI1 not like", value, "chuxilishi1");
            return (Criteria) this;
        }

        public Criteria andChuxilishi1In(List<String> values) {
            addCriterion("CHUXILISHI1 in", values, "chuxilishi1");
            return (Criteria) this;
        }

        public Criteria andChuxilishi1NotIn(List<String> values) {
            addCriterion("CHUXILISHI1 not in", values, "chuxilishi1");
            return (Criteria) this;
        }

        public Criteria andChuxilishi1Between(String value1, String value2) {
            addCriterion("CHUXILISHI1 between", value1, value2, "chuxilishi1");
            return (Criteria) this;
        }

        public Criteria andChuxilishi1NotBetween(String value1, String value2) {
            addCriterion("CHUXILISHI1 not between", value1, value2, "chuxilishi1");
            return (Criteria) this;
        }

        public Criteria andChuxilishi2IsNull() {
            addCriterion("CHUXILISHI2 is null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi2IsNotNull() {
            addCriterion("CHUXILISHI2 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi2EqualTo(String value) {
            addCriterion("CHUXILISHI2 =", value, "chuxilishi2");
            return (Criteria) this;
        }

        public Criteria andChuxilishi2NotEqualTo(String value) {
            addCriterion("CHUXILISHI2 <>", value, "chuxilishi2");
            return (Criteria) this;
        }

        public Criteria andChuxilishi2GreaterThan(String value) {
            addCriterion("CHUXILISHI2 >", value, "chuxilishi2");
            return (Criteria) this;
        }

        public Criteria andChuxilishi2GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI2 >=", value, "chuxilishi2");
            return (Criteria) this;
        }

        public Criteria andChuxilishi2LessThan(String value) {
            addCriterion("CHUXILISHI2 <", value, "chuxilishi2");
            return (Criteria) this;
        }

        public Criteria andChuxilishi2LessThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI2 <=", value, "chuxilishi2");
            return (Criteria) this;
        }

        public Criteria andChuxilishi2Like(String value) {
            addCriterion("CHUXILISHI2 like", value, "chuxilishi2");
            return (Criteria) this;
        }

        public Criteria andChuxilishi2NotLike(String value) {
            addCriterion("CHUXILISHI2 not like", value, "chuxilishi2");
            return (Criteria) this;
        }

        public Criteria andChuxilishi2In(List<String> values) {
            addCriterion("CHUXILISHI2 in", values, "chuxilishi2");
            return (Criteria) this;
        }

        public Criteria andChuxilishi2NotIn(List<String> values) {
            addCriterion("CHUXILISHI2 not in", values, "chuxilishi2");
            return (Criteria) this;
        }

        public Criteria andChuxilishi2Between(String value1, String value2) {
            addCriterion("CHUXILISHI2 between", value1, value2, "chuxilishi2");
            return (Criteria) this;
        }

        public Criteria andChuxilishi2NotBetween(String value1, String value2) {
            addCriterion("CHUXILISHI2 not between", value1, value2, "chuxilishi2");
            return (Criteria) this;
        }

        public Criteria andChuxilishi3IsNull() {
            addCriterion("CHUXILISHI3 is null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi3IsNotNull() {
            addCriterion("CHUXILISHI3 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi3EqualTo(String value) {
            addCriterion("CHUXILISHI3 =", value, "chuxilishi3");
            return (Criteria) this;
        }

        public Criteria andChuxilishi3NotEqualTo(String value) {
            addCriterion("CHUXILISHI3 <>", value, "chuxilishi3");
            return (Criteria) this;
        }

        public Criteria andChuxilishi3GreaterThan(String value) {
            addCriterion("CHUXILISHI3 >", value, "chuxilishi3");
            return (Criteria) this;
        }

        public Criteria andChuxilishi3GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI3 >=", value, "chuxilishi3");
            return (Criteria) this;
        }

        public Criteria andChuxilishi3LessThan(String value) {
            addCriterion("CHUXILISHI3 <", value, "chuxilishi3");
            return (Criteria) this;
        }

        public Criteria andChuxilishi3LessThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI3 <=", value, "chuxilishi3");
            return (Criteria) this;
        }

        public Criteria andChuxilishi3Like(String value) {
            addCriterion("CHUXILISHI3 like", value, "chuxilishi3");
            return (Criteria) this;
        }

        public Criteria andChuxilishi3NotLike(String value) {
            addCriterion("CHUXILISHI3 not like", value, "chuxilishi3");
            return (Criteria) this;
        }

        public Criteria andChuxilishi3In(List<String> values) {
            addCriterion("CHUXILISHI3 in", values, "chuxilishi3");
            return (Criteria) this;
        }

        public Criteria andChuxilishi3NotIn(List<String> values) {
            addCriterion("CHUXILISHI3 not in", values, "chuxilishi3");
            return (Criteria) this;
        }

        public Criteria andChuxilishi3Between(String value1, String value2) {
            addCriterion("CHUXILISHI3 between", value1, value2, "chuxilishi3");
            return (Criteria) this;
        }

        public Criteria andChuxilishi3NotBetween(String value1, String value2) {
            addCriterion("CHUXILISHI3 not between", value1, value2, "chuxilishi3");
            return (Criteria) this;
        }

        public Criteria andChuxilishi4IsNull() {
            addCriterion("CHUXILISHI4 is null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi4IsNotNull() {
            addCriterion("CHUXILISHI4 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi4EqualTo(String value) {
            addCriterion("CHUXILISHI4 =", value, "chuxilishi4");
            return (Criteria) this;
        }

        public Criteria andChuxilishi4NotEqualTo(String value) {
            addCriterion("CHUXILISHI4 <>", value, "chuxilishi4");
            return (Criteria) this;
        }

        public Criteria andChuxilishi4GreaterThan(String value) {
            addCriterion("CHUXILISHI4 >", value, "chuxilishi4");
            return (Criteria) this;
        }

        public Criteria andChuxilishi4GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI4 >=", value, "chuxilishi4");
            return (Criteria) this;
        }

        public Criteria andChuxilishi4LessThan(String value) {
            addCriterion("CHUXILISHI4 <", value, "chuxilishi4");
            return (Criteria) this;
        }

        public Criteria andChuxilishi4LessThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI4 <=", value, "chuxilishi4");
            return (Criteria) this;
        }

        public Criteria andChuxilishi4Like(String value) {
            addCriterion("CHUXILISHI4 like", value, "chuxilishi4");
            return (Criteria) this;
        }

        public Criteria andChuxilishi4NotLike(String value) {
            addCriterion("CHUXILISHI4 not like", value, "chuxilishi4");
            return (Criteria) this;
        }

        public Criteria andChuxilishi4In(List<String> values) {
            addCriterion("CHUXILISHI4 in", values, "chuxilishi4");
            return (Criteria) this;
        }

        public Criteria andChuxilishi4NotIn(List<String> values) {
            addCriterion("CHUXILISHI4 not in", values, "chuxilishi4");
            return (Criteria) this;
        }

        public Criteria andChuxilishi4Between(String value1, String value2) {
            addCriterion("CHUXILISHI4 between", value1, value2, "chuxilishi4");
            return (Criteria) this;
        }

        public Criteria andChuxilishi4NotBetween(String value1, String value2) {
            addCriterion("CHUXILISHI4 not between", value1, value2, "chuxilishi4");
            return (Criteria) this;
        }

        public Criteria andChuxilishi5IsNull() {
            addCriterion("CHUXILISHI5 is null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi5IsNotNull() {
            addCriterion("CHUXILISHI5 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi5EqualTo(String value) {
            addCriterion("CHUXILISHI5 =", value, "chuxilishi5");
            return (Criteria) this;
        }

        public Criteria andChuxilishi5NotEqualTo(String value) {
            addCriterion("CHUXILISHI5 <>", value, "chuxilishi5");
            return (Criteria) this;
        }

        public Criteria andChuxilishi5GreaterThan(String value) {
            addCriterion("CHUXILISHI5 >", value, "chuxilishi5");
            return (Criteria) this;
        }

        public Criteria andChuxilishi5GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI5 >=", value, "chuxilishi5");
            return (Criteria) this;
        }

        public Criteria andChuxilishi5LessThan(String value) {
            addCriterion("CHUXILISHI5 <", value, "chuxilishi5");
            return (Criteria) this;
        }

        public Criteria andChuxilishi5LessThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI5 <=", value, "chuxilishi5");
            return (Criteria) this;
        }

        public Criteria andChuxilishi5Like(String value) {
            addCriterion("CHUXILISHI5 like", value, "chuxilishi5");
            return (Criteria) this;
        }

        public Criteria andChuxilishi5NotLike(String value) {
            addCriterion("CHUXILISHI5 not like", value, "chuxilishi5");
            return (Criteria) this;
        }

        public Criteria andChuxilishi5In(List<String> values) {
            addCriterion("CHUXILISHI5 in", values, "chuxilishi5");
            return (Criteria) this;
        }

        public Criteria andChuxilishi5NotIn(List<String> values) {
            addCriterion("CHUXILISHI5 not in", values, "chuxilishi5");
            return (Criteria) this;
        }

        public Criteria andChuxilishi5Between(String value1, String value2) {
            addCriterion("CHUXILISHI5 between", value1, value2, "chuxilishi5");
            return (Criteria) this;
        }

        public Criteria andChuxilishi5NotBetween(String value1, String value2) {
            addCriterion("CHUXILISHI5 not between", value1, value2, "chuxilishi5");
            return (Criteria) this;
        }

        public Criteria andChuxilishi6IsNull() {
            addCriterion("CHUXILISHI6 is null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi6IsNotNull() {
            addCriterion("CHUXILISHI6 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi6EqualTo(String value) {
            addCriterion("CHUXILISHI6 =", value, "chuxilishi6");
            return (Criteria) this;
        }

        public Criteria andChuxilishi6NotEqualTo(String value) {
            addCriterion("CHUXILISHI6 <>", value, "chuxilishi6");
            return (Criteria) this;
        }

        public Criteria andChuxilishi6GreaterThan(String value) {
            addCriterion("CHUXILISHI6 >", value, "chuxilishi6");
            return (Criteria) this;
        }

        public Criteria andChuxilishi6GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI6 >=", value, "chuxilishi6");
            return (Criteria) this;
        }

        public Criteria andChuxilishi6LessThan(String value) {
            addCriterion("CHUXILISHI6 <", value, "chuxilishi6");
            return (Criteria) this;
        }

        public Criteria andChuxilishi6LessThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI6 <=", value, "chuxilishi6");
            return (Criteria) this;
        }

        public Criteria andChuxilishi6Like(String value) {
            addCriterion("CHUXILISHI6 like", value, "chuxilishi6");
            return (Criteria) this;
        }

        public Criteria andChuxilishi6NotLike(String value) {
            addCriterion("CHUXILISHI6 not like", value, "chuxilishi6");
            return (Criteria) this;
        }

        public Criteria andChuxilishi6In(List<String> values) {
            addCriterion("CHUXILISHI6 in", values, "chuxilishi6");
            return (Criteria) this;
        }

        public Criteria andChuxilishi6NotIn(List<String> values) {
            addCriterion("CHUXILISHI6 not in", values, "chuxilishi6");
            return (Criteria) this;
        }

        public Criteria andChuxilishi6Between(String value1, String value2) {
            addCriterion("CHUXILISHI6 between", value1, value2, "chuxilishi6");
            return (Criteria) this;
        }

        public Criteria andChuxilishi6NotBetween(String value1, String value2) {
            addCriterion("CHUXILISHI6 not between", value1, value2, "chuxilishi6");
            return (Criteria) this;
        }

        public Criteria andChuxilishi7IsNull() {
            addCriterion("CHUXILISHI7 is null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi7IsNotNull() {
            addCriterion("CHUXILISHI7 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi7EqualTo(String value) {
            addCriterion("CHUXILISHI7 =", value, "chuxilishi7");
            return (Criteria) this;
        }

        public Criteria andChuxilishi7NotEqualTo(String value) {
            addCriterion("CHUXILISHI7 <>", value, "chuxilishi7");
            return (Criteria) this;
        }

        public Criteria andChuxilishi7GreaterThan(String value) {
            addCriterion("CHUXILISHI7 >", value, "chuxilishi7");
            return (Criteria) this;
        }

        public Criteria andChuxilishi7GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI7 >=", value, "chuxilishi7");
            return (Criteria) this;
        }

        public Criteria andChuxilishi7LessThan(String value) {
            addCriterion("CHUXILISHI7 <", value, "chuxilishi7");
            return (Criteria) this;
        }

        public Criteria andChuxilishi7LessThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI7 <=", value, "chuxilishi7");
            return (Criteria) this;
        }

        public Criteria andChuxilishi7Like(String value) {
            addCriterion("CHUXILISHI7 like", value, "chuxilishi7");
            return (Criteria) this;
        }

        public Criteria andChuxilishi7NotLike(String value) {
            addCriterion("CHUXILISHI7 not like", value, "chuxilishi7");
            return (Criteria) this;
        }

        public Criteria andChuxilishi7In(List<String> values) {
            addCriterion("CHUXILISHI7 in", values, "chuxilishi7");
            return (Criteria) this;
        }

        public Criteria andChuxilishi7NotIn(List<String> values) {
            addCriterion("CHUXILISHI7 not in", values, "chuxilishi7");
            return (Criteria) this;
        }

        public Criteria andChuxilishi7Between(String value1, String value2) {
            addCriterion("CHUXILISHI7 between", value1, value2, "chuxilishi7");
            return (Criteria) this;
        }

        public Criteria andChuxilishi7NotBetween(String value1, String value2) {
            addCriterion("CHUXILISHI7 not between", value1, value2, "chuxilishi7");
            return (Criteria) this;
        }

        public Criteria andChuxilishi8IsNull() {
            addCriterion("CHUXILISHI8 is null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi8IsNotNull() {
            addCriterion("CHUXILISHI8 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi8EqualTo(String value) {
            addCriterion("CHUXILISHI8 =", value, "chuxilishi8");
            return (Criteria) this;
        }

        public Criteria andChuxilishi8NotEqualTo(String value) {
            addCriterion("CHUXILISHI8 <>", value, "chuxilishi8");
            return (Criteria) this;
        }

        public Criteria andChuxilishi8GreaterThan(String value) {
            addCriterion("CHUXILISHI8 >", value, "chuxilishi8");
            return (Criteria) this;
        }

        public Criteria andChuxilishi8GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI8 >=", value, "chuxilishi8");
            return (Criteria) this;
        }

        public Criteria andChuxilishi8LessThan(String value) {
            addCriterion("CHUXILISHI8 <", value, "chuxilishi8");
            return (Criteria) this;
        }

        public Criteria andChuxilishi8LessThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI8 <=", value, "chuxilishi8");
            return (Criteria) this;
        }

        public Criteria andChuxilishi8Like(String value) {
            addCriterion("CHUXILISHI8 like", value, "chuxilishi8");
            return (Criteria) this;
        }

        public Criteria andChuxilishi8NotLike(String value) {
            addCriterion("CHUXILISHI8 not like", value, "chuxilishi8");
            return (Criteria) this;
        }

        public Criteria andChuxilishi8In(List<String> values) {
            addCriterion("CHUXILISHI8 in", values, "chuxilishi8");
            return (Criteria) this;
        }

        public Criteria andChuxilishi8NotIn(List<String> values) {
            addCriterion("CHUXILISHI8 not in", values, "chuxilishi8");
            return (Criteria) this;
        }

        public Criteria andChuxilishi8Between(String value1, String value2) {
            addCriterion("CHUXILISHI8 between", value1, value2, "chuxilishi8");
            return (Criteria) this;
        }

        public Criteria andChuxilishi8NotBetween(String value1, String value2) {
            addCriterion("CHUXILISHI8 not between", value1, value2, "chuxilishi8");
            return (Criteria) this;
        }

        public Criteria andChuxilishi9IsNull() {
            addCriterion("CHUXILISHI9 is null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi9IsNotNull() {
            addCriterion("CHUXILISHI9 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi9EqualTo(String value) {
            addCriterion("CHUXILISHI9 =", value, "chuxilishi9");
            return (Criteria) this;
        }

        public Criteria andChuxilishi9NotEqualTo(String value) {
            addCriterion("CHUXILISHI9 <>", value, "chuxilishi9");
            return (Criteria) this;
        }

        public Criteria andChuxilishi9GreaterThan(String value) {
            addCriterion("CHUXILISHI9 >", value, "chuxilishi9");
            return (Criteria) this;
        }

        public Criteria andChuxilishi9GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI9 >=", value, "chuxilishi9");
            return (Criteria) this;
        }

        public Criteria andChuxilishi9LessThan(String value) {
            addCriterion("CHUXILISHI9 <", value, "chuxilishi9");
            return (Criteria) this;
        }

        public Criteria andChuxilishi9LessThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI9 <=", value, "chuxilishi9");
            return (Criteria) this;
        }

        public Criteria andChuxilishi9Like(String value) {
            addCriterion("CHUXILISHI9 like", value, "chuxilishi9");
            return (Criteria) this;
        }

        public Criteria andChuxilishi9NotLike(String value) {
            addCriterion("CHUXILISHI9 not like", value, "chuxilishi9");
            return (Criteria) this;
        }

        public Criteria andChuxilishi9In(List<String> values) {
            addCriterion("CHUXILISHI9 in", values, "chuxilishi9");
            return (Criteria) this;
        }

        public Criteria andChuxilishi9NotIn(List<String> values) {
            addCriterion("CHUXILISHI9 not in", values, "chuxilishi9");
            return (Criteria) this;
        }

        public Criteria andChuxilishi9Between(String value1, String value2) {
            addCriterion("CHUXILISHI9 between", value1, value2, "chuxilishi9");
            return (Criteria) this;
        }

        public Criteria andChuxilishi9NotBetween(String value1, String value2) {
            addCriterion("CHUXILISHI9 not between", value1, value2, "chuxilishi9");
            return (Criteria) this;
        }

        public Criteria andChuxilishi10IsNull() {
            addCriterion("CHUXILISHI10 is null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi10IsNotNull() {
            addCriterion("CHUXILISHI10 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi10EqualTo(String value) {
            addCriterion("CHUXILISHI10 =", value, "chuxilishi10");
            return (Criteria) this;
        }

        public Criteria andChuxilishi10NotEqualTo(String value) {
            addCriterion("CHUXILISHI10 <>", value, "chuxilishi10");
            return (Criteria) this;
        }

        public Criteria andChuxilishi10GreaterThan(String value) {
            addCriterion("CHUXILISHI10 >", value, "chuxilishi10");
            return (Criteria) this;
        }

        public Criteria andChuxilishi10GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI10 >=", value, "chuxilishi10");
            return (Criteria) this;
        }

        public Criteria andChuxilishi10LessThan(String value) {
            addCriterion("CHUXILISHI10 <", value, "chuxilishi10");
            return (Criteria) this;
        }

        public Criteria andChuxilishi10LessThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI10 <=", value, "chuxilishi10");
            return (Criteria) this;
        }

        public Criteria andChuxilishi10Like(String value) {
            addCriterion("CHUXILISHI10 like", value, "chuxilishi10");
            return (Criteria) this;
        }

        public Criteria andChuxilishi10NotLike(String value) {
            addCriterion("CHUXILISHI10 not like", value, "chuxilishi10");
            return (Criteria) this;
        }

        public Criteria andChuxilishi10In(List<String> values) {
            addCriterion("CHUXILISHI10 in", values, "chuxilishi10");
            return (Criteria) this;
        }

        public Criteria andChuxilishi10NotIn(List<String> values) {
            addCriterion("CHUXILISHI10 not in", values, "chuxilishi10");
            return (Criteria) this;
        }

        public Criteria andChuxilishi10Between(String value1, String value2) {
            addCriterion("CHUXILISHI10 between", value1, value2, "chuxilishi10");
            return (Criteria) this;
        }

        public Criteria andChuxilishi10NotBetween(String value1, String value2) {
            addCriterion("CHUXILISHI10 not between", value1, value2, "chuxilishi10");
            return (Criteria) this;
        }

        public Criteria andChuxilishi11IsNull() {
            addCriterion("CHUXILISHI11 is null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi11IsNotNull() {
            addCriterion("CHUXILISHI11 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi11EqualTo(String value) {
            addCriterion("CHUXILISHI11 =", value, "chuxilishi11");
            return (Criteria) this;
        }

        public Criteria andChuxilishi11NotEqualTo(String value) {
            addCriterion("CHUXILISHI11 <>", value, "chuxilishi11");
            return (Criteria) this;
        }

        public Criteria andChuxilishi11GreaterThan(String value) {
            addCriterion("CHUXILISHI11 >", value, "chuxilishi11");
            return (Criteria) this;
        }

        public Criteria andChuxilishi11GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI11 >=", value, "chuxilishi11");
            return (Criteria) this;
        }

        public Criteria andChuxilishi11LessThan(String value) {
            addCriterion("CHUXILISHI11 <", value, "chuxilishi11");
            return (Criteria) this;
        }

        public Criteria andChuxilishi11LessThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI11 <=", value, "chuxilishi11");
            return (Criteria) this;
        }

        public Criteria andChuxilishi11Like(String value) {
            addCriterion("CHUXILISHI11 like", value, "chuxilishi11");
            return (Criteria) this;
        }

        public Criteria andChuxilishi11NotLike(String value) {
            addCriterion("CHUXILISHI11 not like", value, "chuxilishi11");
            return (Criteria) this;
        }

        public Criteria andChuxilishi11In(List<String> values) {
            addCriterion("CHUXILISHI11 in", values, "chuxilishi11");
            return (Criteria) this;
        }

        public Criteria andChuxilishi11NotIn(List<String> values) {
            addCriterion("CHUXILISHI11 not in", values, "chuxilishi11");
            return (Criteria) this;
        }

        public Criteria andChuxilishi11Between(String value1, String value2) {
            addCriterion("CHUXILISHI11 between", value1, value2, "chuxilishi11");
            return (Criteria) this;
        }

        public Criteria andChuxilishi11NotBetween(String value1, String value2) {
            addCriterion("CHUXILISHI11 not between", value1, value2, "chuxilishi11");
            return (Criteria) this;
        }

        public Criteria andChuxilishi12IsNull() {
            addCriterion("CHUXILISHI12 is null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi12IsNotNull() {
            addCriterion("CHUXILISHI12 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi12EqualTo(String value) {
            addCriterion("CHUXILISHI12 =", value, "chuxilishi12");
            return (Criteria) this;
        }

        public Criteria andChuxilishi12NotEqualTo(String value) {
            addCriterion("CHUXILISHI12 <>", value, "chuxilishi12");
            return (Criteria) this;
        }

        public Criteria andChuxilishi12GreaterThan(String value) {
            addCriterion("CHUXILISHI12 >", value, "chuxilishi12");
            return (Criteria) this;
        }

        public Criteria andChuxilishi12GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI12 >=", value, "chuxilishi12");
            return (Criteria) this;
        }

        public Criteria andChuxilishi12LessThan(String value) {
            addCriterion("CHUXILISHI12 <", value, "chuxilishi12");
            return (Criteria) this;
        }

        public Criteria andChuxilishi12LessThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI12 <=", value, "chuxilishi12");
            return (Criteria) this;
        }

        public Criteria andChuxilishi12Like(String value) {
            addCriterion("CHUXILISHI12 like", value, "chuxilishi12");
            return (Criteria) this;
        }

        public Criteria andChuxilishi12NotLike(String value) {
            addCriterion("CHUXILISHI12 not like", value, "chuxilishi12");
            return (Criteria) this;
        }

        public Criteria andChuxilishi12In(List<String> values) {
            addCriterion("CHUXILISHI12 in", values, "chuxilishi12");
            return (Criteria) this;
        }

        public Criteria andChuxilishi12NotIn(List<String> values) {
            addCriterion("CHUXILISHI12 not in", values, "chuxilishi12");
            return (Criteria) this;
        }

        public Criteria andChuxilishi12Between(String value1, String value2) {
            addCriterion("CHUXILISHI12 between", value1, value2, "chuxilishi12");
            return (Criteria) this;
        }

        public Criteria andChuxilishi12NotBetween(String value1, String value2) {
            addCriterion("CHUXILISHI12 not between", value1, value2, "chuxilishi12");
            return (Criteria) this;
        }

        public Criteria andChuxilishi13IsNull() {
            addCriterion("CHUXILISHI13 is null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi13IsNotNull() {
            addCriterion("CHUXILISHI13 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi13EqualTo(String value) {
            addCriterion("CHUXILISHI13 =", value, "chuxilishi13");
            return (Criteria) this;
        }

        public Criteria andChuxilishi13NotEqualTo(String value) {
            addCriterion("CHUXILISHI13 <>", value, "chuxilishi13");
            return (Criteria) this;
        }

        public Criteria andChuxilishi13GreaterThan(String value) {
            addCriterion("CHUXILISHI13 >", value, "chuxilishi13");
            return (Criteria) this;
        }

        public Criteria andChuxilishi13GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI13 >=", value, "chuxilishi13");
            return (Criteria) this;
        }

        public Criteria andChuxilishi13LessThan(String value) {
            addCriterion("CHUXILISHI13 <", value, "chuxilishi13");
            return (Criteria) this;
        }

        public Criteria andChuxilishi13LessThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI13 <=", value, "chuxilishi13");
            return (Criteria) this;
        }

        public Criteria andChuxilishi13Like(String value) {
            addCriterion("CHUXILISHI13 like", value, "chuxilishi13");
            return (Criteria) this;
        }

        public Criteria andChuxilishi13NotLike(String value) {
            addCriterion("CHUXILISHI13 not like", value, "chuxilishi13");
            return (Criteria) this;
        }

        public Criteria andChuxilishi13In(List<String> values) {
            addCriterion("CHUXILISHI13 in", values, "chuxilishi13");
            return (Criteria) this;
        }

        public Criteria andChuxilishi13NotIn(List<String> values) {
            addCriterion("CHUXILISHI13 not in", values, "chuxilishi13");
            return (Criteria) this;
        }

        public Criteria andChuxilishi13Between(String value1, String value2) {
            addCriterion("CHUXILISHI13 between", value1, value2, "chuxilishi13");
            return (Criteria) this;
        }

        public Criteria andChuxilishi13NotBetween(String value1, String value2) {
            addCriterion("CHUXILISHI13 not between", value1, value2, "chuxilishi13");
            return (Criteria) this;
        }

        public Criteria andChuxilishi14IsNull() {
            addCriterion("CHUXILISHI14 is null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi14IsNotNull() {
            addCriterion("CHUXILISHI14 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi14EqualTo(String value) {
            addCriterion("CHUXILISHI14 =", value, "chuxilishi14");
            return (Criteria) this;
        }

        public Criteria andChuxilishi14NotEqualTo(String value) {
            addCriterion("CHUXILISHI14 <>", value, "chuxilishi14");
            return (Criteria) this;
        }

        public Criteria andChuxilishi14GreaterThan(String value) {
            addCriterion("CHUXILISHI14 >", value, "chuxilishi14");
            return (Criteria) this;
        }

        public Criteria andChuxilishi14GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI14 >=", value, "chuxilishi14");
            return (Criteria) this;
        }

        public Criteria andChuxilishi14LessThan(String value) {
            addCriterion("CHUXILISHI14 <", value, "chuxilishi14");
            return (Criteria) this;
        }

        public Criteria andChuxilishi14LessThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI14 <=", value, "chuxilishi14");
            return (Criteria) this;
        }

        public Criteria andChuxilishi14Like(String value) {
            addCriterion("CHUXILISHI14 like", value, "chuxilishi14");
            return (Criteria) this;
        }

        public Criteria andChuxilishi14NotLike(String value) {
            addCriterion("CHUXILISHI14 not like", value, "chuxilishi14");
            return (Criteria) this;
        }

        public Criteria andChuxilishi14In(List<String> values) {
            addCriterion("CHUXILISHI14 in", values, "chuxilishi14");
            return (Criteria) this;
        }

        public Criteria andChuxilishi14NotIn(List<String> values) {
            addCriterion("CHUXILISHI14 not in", values, "chuxilishi14");
            return (Criteria) this;
        }

        public Criteria andChuxilishi14Between(String value1, String value2) {
            addCriterion("CHUXILISHI14 between", value1, value2, "chuxilishi14");
            return (Criteria) this;
        }

        public Criteria andChuxilishi14NotBetween(String value1, String value2) {
            addCriterion("CHUXILISHI14 not between", value1, value2, "chuxilishi14");
            return (Criteria) this;
        }

        public Criteria andChuxilishi15IsNull() {
            addCriterion("CHUXILISHI15 is null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi15IsNotNull() {
            addCriterion("CHUXILISHI15 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi15EqualTo(String value) {
            addCriterion("CHUXILISHI15 =", value, "chuxilishi15");
            return (Criteria) this;
        }

        public Criteria andChuxilishi15NotEqualTo(String value) {
            addCriterion("CHUXILISHI15 <>", value, "chuxilishi15");
            return (Criteria) this;
        }

        public Criteria andChuxilishi15GreaterThan(String value) {
            addCriterion("CHUXILISHI15 >", value, "chuxilishi15");
            return (Criteria) this;
        }

        public Criteria andChuxilishi15GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI15 >=", value, "chuxilishi15");
            return (Criteria) this;
        }

        public Criteria andChuxilishi15LessThan(String value) {
            addCriterion("CHUXILISHI15 <", value, "chuxilishi15");
            return (Criteria) this;
        }

        public Criteria andChuxilishi15LessThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI15 <=", value, "chuxilishi15");
            return (Criteria) this;
        }

        public Criteria andChuxilishi15Like(String value) {
            addCriterion("CHUXILISHI15 like", value, "chuxilishi15");
            return (Criteria) this;
        }

        public Criteria andChuxilishi15NotLike(String value) {
            addCriterion("CHUXILISHI15 not like", value, "chuxilishi15");
            return (Criteria) this;
        }

        public Criteria andChuxilishi15In(List<String> values) {
            addCriterion("CHUXILISHI15 in", values, "chuxilishi15");
            return (Criteria) this;
        }

        public Criteria andChuxilishi15NotIn(List<String> values) {
            addCriterion("CHUXILISHI15 not in", values, "chuxilishi15");
            return (Criteria) this;
        }

        public Criteria andChuxilishi15Between(String value1, String value2) {
            addCriterion("CHUXILISHI15 between", value1, value2, "chuxilishi15");
            return (Criteria) this;
        }

        public Criteria andChuxilishi15NotBetween(String value1, String value2) {
            addCriterion("CHUXILISHI15 not between", value1, value2, "chuxilishi15");
            return (Criteria) this;
        }

        public Criteria andChuxilishi16IsNull() {
            addCriterion("CHUXILISHI16 is null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi16IsNotNull() {
            addCriterion("CHUXILISHI16 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi16EqualTo(String value) {
            addCriterion("CHUXILISHI16 =", value, "chuxilishi16");
            return (Criteria) this;
        }

        public Criteria andChuxilishi16NotEqualTo(String value) {
            addCriterion("CHUXILISHI16 <>", value, "chuxilishi16");
            return (Criteria) this;
        }

        public Criteria andChuxilishi16GreaterThan(String value) {
            addCriterion("CHUXILISHI16 >", value, "chuxilishi16");
            return (Criteria) this;
        }

        public Criteria andChuxilishi16GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI16 >=", value, "chuxilishi16");
            return (Criteria) this;
        }

        public Criteria andChuxilishi16LessThan(String value) {
            addCriterion("CHUXILISHI16 <", value, "chuxilishi16");
            return (Criteria) this;
        }

        public Criteria andChuxilishi16LessThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI16 <=", value, "chuxilishi16");
            return (Criteria) this;
        }

        public Criteria andChuxilishi16Like(String value) {
            addCriterion("CHUXILISHI16 like", value, "chuxilishi16");
            return (Criteria) this;
        }

        public Criteria andChuxilishi16NotLike(String value) {
            addCriterion("CHUXILISHI16 not like", value, "chuxilishi16");
            return (Criteria) this;
        }

        public Criteria andChuxilishi16In(List<String> values) {
            addCriterion("CHUXILISHI16 in", values, "chuxilishi16");
            return (Criteria) this;
        }

        public Criteria andChuxilishi16NotIn(List<String> values) {
            addCriterion("CHUXILISHI16 not in", values, "chuxilishi16");
            return (Criteria) this;
        }

        public Criteria andChuxilishi16Between(String value1, String value2) {
            addCriterion("CHUXILISHI16 between", value1, value2, "chuxilishi16");
            return (Criteria) this;
        }

        public Criteria andChuxilishi16NotBetween(String value1, String value2) {
            addCriterion("CHUXILISHI16 not between", value1, value2, "chuxilishi16");
            return (Criteria) this;
        }

        public Criteria andChuxilishi17IsNull() {
            addCriterion("CHUXILISHI17 is null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi17IsNotNull() {
            addCriterion("CHUXILISHI17 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi17EqualTo(String value) {
            addCriterion("CHUXILISHI17 =", value, "chuxilishi17");
            return (Criteria) this;
        }

        public Criteria andChuxilishi17NotEqualTo(String value) {
            addCriterion("CHUXILISHI17 <>", value, "chuxilishi17");
            return (Criteria) this;
        }

        public Criteria andChuxilishi17GreaterThan(String value) {
            addCriterion("CHUXILISHI17 >", value, "chuxilishi17");
            return (Criteria) this;
        }

        public Criteria andChuxilishi17GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI17 >=", value, "chuxilishi17");
            return (Criteria) this;
        }

        public Criteria andChuxilishi17LessThan(String value) {
            addCriterion("CHUXILISHI17 <", value, "chuxilishi17");
            return (Criteria) this;
        }

        public Criteria andChuxilishi17LessThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI17 <=", value, "chuxilishi17");
            return (Criteria) this;
        }

        public Criteria andChuxilishi17Like(String value) {
            addCriterion("CHUXILISHI17 like", value, "chuxilishi17");
            return (Criteria) this;
        }

        public Criteria andChuxilishi17NotLike(String value) {
            addCriterion("CHUXILISHI17 not like", value, "chuxilishi17");
            return (Criteria) this;
        }

        public Criteria andChuxilishi17In(List<String> values) {
            addCriterion("CHUXILISHI17 in", values, "chuxilishi17");
            return (Criteria) this;
        }

        public Criteria andChuxilishi17NotIn(List<String> values) {
            addCriterion("CHUXILISHI17 not in", values, "chuxilishi17");
            return (Criteria) this;
        }

        public Criteria andChuxilishi17Between(String value1, String value2) {
            addCriterion("CHUXILISHI17 between", value1, value2, "chuxilishi17");
            return (Criteria) this;
        }

        public Criteria andChuxilishi17NotBetween(String value1, String value2) {
            addCriterion("CHUXILISHI17 not between", value1, value2, "chuxilishi17");
            return (Criteria) this;
        }

        public Criteria andChuxilishi18IsNull() {
            addCriterion("CHUXILISHI18 is null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi18IsNotNull() {
            addCriterion("CHUXILISHI18 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi18EqualTo(String value) {
            addCriterion("CHUXILISHI18 =", value, "chuxilishi18");
            return (Criteria) this;
        }

        public Criteria andChuxilishi18NotEqualTo(String value) {
            addCriterion("CHUXILISHI18 <>", value, "chuxilishi18");
            return (Criteria) this;
        }

        public Criteria andChuxilishi18GreaterThan(String value) {
            addCriterion("CHUXILISHI18 >", value, "chuxilishi18");
            return (Criteria) this;
        }

        public Criteria andChuxilishi18GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI18 >=", value, "chuxilishi18");
            return (Criteria) this;
        }

        public Criteria andChuxilishi18LessThan(String value) {
            addCriterion("CHUXILISHI18 <", value, "chuxilishi18");
            return (Criteria) this;
        }

        public Criteria andChuxilishi18LessThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI18 <=", value, "chuxilishi18");
            return (Criteria) this;
        }

        public Criteria andChuxilishi18Like(String value) {
            addCriterion("CHUXILISHI18 like", value, "chuxilishi18");
            return (Criteria) this;
        }

        public Criteria andChuxilishi18NotLike(String value) {
            addCriterion("CHUXILISHI18 not like", value, "chuxilishi18");
            return (Criteria) this;
        }

        public Criteria andChuxilishi18In(List<String> values) {
            addCriterion("CHUXILISHI18 in", values, "chuxilishi18");
            return (Criteria) this;
        }

        public Criteria andChuxilishi18NotIn(List<String> values) {
            addCriterion("CHUXILISHI18 not in", values, "chuxilishi18");
            return (Criteria) this;
        }

        public Criteria andChuxilishi18Between(String value1, String value2) {
            addCriterion("CHUXILISHI18 between", value1, value2, "chuxilishi18");
            return (Criteria) this;
        }

        public Criteria andChuxilishi18NotBetween(String value1, String value2) {
            addCriterion("CHUXILISHI18 not between", value1, value2, "chuxilishi18");
            return (Criteria) this;
        }

        public Criteria andChuxilishi19IsNull() {
            addCriterion("CHUXILISHI19 is null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi19IsNotNull() {
            addCriterion("CHUXILISHI19 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi19EqualTo(String value) {
            addCriterion("CHUXILISHI19 =", value, "chuxilishi19");
            return (Criteria) this;
        }

        public Criteria andChuxilishi19NotEqualTo(String value) {
            addCriterion("CHUXILISHI19 <>", value, "chuxilishi19");
            return (Criteria) this;
        }

        public Criteria andChuxilishi19GreaterThan(String value) {
            addCriterion("CHUXILISHI19 >", value, "chuxilishi19");
            return (Criteria) this;
        }

        public Criteria andChuxilishi19GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI19 >=", value, "chuxilishi19");
            return (Criteria) this;
        }

        public Criteria andChuxilishi19LessThan(String value) {
            addCriterion("CHUXILISHI19 <", value, "chuxilishi19");
            return (Criteria) this;
        }

        public Criteria andChuxilishi19LessThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI19 <=", value, "chuxilishi19");
            return (Criteria) this;
        }

        public Criteria andChuxilishi19Like(String value) {
            addCriterion("CHUXILISHI19 like", value, "chuxilishi19");
            return (Criteria) this;
        }

        public Criteria andChuxilishi19NotLike(String value) {
            addCriterion("CHUXILISHI19 not like", value, "chuxilishi19");
            return (Criteria) this;
        }

        public Criteria andChuxilishi19In(List<String> values) {
            addCriterion("CHUXILISHI19 in", values, "chuxilishi19");
            return (Criteria) this;
        }

        public Criteria andChuxilishi19NotIn(List<String> values) {
            addCriterion("CHUXILISHI19 not in", values, "chuxilishi19");
            return (Criteria) this;
        }

        public Criteria andChuxilishi19Between(String value1, String value2) {
            addCriterion("CHUXILISHI19 between", value1, value2, "chuxilishi19");
            return (Criteria) this;
        }

        public Criteria andChuxilishi19NotBetween(String value1, String value2) {
            addCriterion("CHUXILISHI19 not between", value1, value2, "chuxilishi19");
            return (Criteria) this;
        }

        public Criteria andChuxilishi20IsNull() {
            addCriterion("CHUXILISHI20 is null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi20IsNotNull() {
            addCriterion("CHUXILISHI20 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi20EqualTo(String value) {
            addCriterion("CHUXILISHI20 =", value, "chuxilishi20");
            return (Criteria) this;
        }

        public Criteria andChuxilishi20NotEqualTo(String value) {
            addCriterion("CHUXILISHI20 <>", value, "chuxilishi20");
            return (Criteria) this;
        }

        public Criteria andChuxilishi20GreaterThan(String value) {
            addCriterion("CHUXILISHI20 >", value, "chuxilishi20");
            return (Criteria) this;
        }

        public Criteria andChuxilishi20GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI20 >=", value, "chuxilishi20");
            return (Criteria) this;
        }

        public Criteria andChuxilishi20LessThan(String value) {
            addCriterion("CHUXILISHI20 <", value, "chuxilishi20");
            return (Criteria) this;
        }

        public Criteria andChuxilishi20LessThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI20 <=", value, "chuxilishi20");
            return (Criteria) this;
        }

        public Criteria andChuxilishi20Like(String value) {
            addCriterion("CHUXILISHI20 like", value, "chuxilishi20");
            return (Criteria) this;
        }

        public Criteria andChuxilishi20NotLike(String value) {
            addCriterion("CHUXILISHI20 not like", value, "chuxilishi20");
            return (Criteria) this;
        }

        public Criteria andChuxilishi20In(List<String> values) {
            addCriterion("CHUXILISHI20 in", values, "chuxilishi20");
            return (Criteria) this;
        }

        public Criteria andChuxilishi20NotIn(List<String> values) {
            addCriterion("CHUXILISHI20 not in", values, "chuxilishi20");
            return (Criteria) this;
        }

        public Criteria andChuxilishi20Between(String value1, String value2) {
            addCriterion("CHUXILISHI20 between", value1, value2, "chuxilishi20");
            return (Criteria) this;
        }

        public Criteria andChuxilishi20NotBetween(String value1, String value2) {
            addCriterion("CHUXILISHI20 not between", value1, value2, "chuxilishi20");
            return (Criteria) this;
        }

        public Criteria andChuxilishi21IsNull() {
            addCriterion("CHUXILISHI21 is null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi21IsNotNull() {
            addCriterion("CHUXILISHI21 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi21EqualTo(String value) {
            addCriterion("CHUXILISHI21 =", value, "chuxilishi21");
            return (Criteria) this;
        }

        public Criteria andChuxilishi21NotEqualTo(String value) {
            addCriterion("CHUXILISHI21 <>", value, "chuxilishi21");
            return (Criteria) this;
        }

        public Criteria andChuxilishi21GreaterThan(String value) {
            addCriterion("CHUXILISHI21 >", value, "chuxilishi21");
            return (Criteria) this;
        }

        public Criteria andChuxilishi21GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI21 >=", value, "chuxilishi21");
            return (Criteria) this;
        }

        public Criteria andChuxilishi21LessThan(String value) {
            addCriterion("CHUXILISHI21 <", value, "chuxilishi21");
            return (Criteria) this;
        }

        public Criteria andChuxilishi21LessThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI21 <=", value, "chuxilishi21");
            return (Criteria) this;
        }

        public Criteria andChuxilishi21Like(String value) {
            addCriterion("CHUXILISHI21 like", value, "chuxilishi21");
            return (Criteria) this;
        }

        public Criteria andChuxilishi21NotLike(String value) {
            addCriterion("CHUXILISHI21 not like", value, "chuxilishi21");
            return (Criteria) this;
        }

        public Criteria andChuxilishi21In(List<String> values) {
            addCriterion("CHUXILISHI21 in", values, "chuxilishi21");
            return (Criteria) this;
        }

        public Criteria andChuxilishi21NotIn(List<String> values) {
            addCriterion("CHUXILISHI21 not in", values, "chuxilishi21");
            return (Criteria) this;
        }

        public Criteria andChuxilishi21Between(String value1, String value2) {
            addCriterion("CHUXILISHI21 between", value1, value2, "chuxilishi21");
            return (Criteria) this;
        }

        public Criteria andChuxilishi21NotBetween(String value1, String value2) {
            addCriterion("CHUXILISHI21 not between", value1, value2, "chuxilishi21");
            return (Criteria) this;
        }

        public Criteria andChuxilishi22IsNull() {
            addCriterion("CHUXILISHI22 is null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi22IsNotNull() {
            addCriterion("CHUXILISHI22 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi22EqualTo(String value) {
            addCriterion("CHUXILISHI22 =", value, "chuxilishi22");
            return (Criteria) this;
        }

        public Criteria andChuxilishi22NotEqualTo(String value) {
            addCriterion("CHUXILISHI22 <>", value, "chuxilishi22");
            return (Criteria) this;
        }

        public Criteria andChuxilishi22GreaterThan(String value) {
            addCriterion("CHUXILISHI22 >", value, "chuxilishi22");
            return (Criteria) this;
        }

        public Criteria andChuxilishi22GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI22 >=", value, "chuxilishi22");
            return (Criteria) this;
        }

        public Criteria andChuxilishi22LessThan(String value) {
            addCriterion("CHUXILISHI22 <", value, "chuxilishi22");
            return (Criteria) this;
        }

        public Criteria andChuxilishi22LessThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI22 <=", value, "chuxilishi22");
            return (Criteria) this;
        }

        public Criteria andChuxilishi22Like(String value) {
            addCriterion("CHUXILISHI22 like", value, "chuxilishi22");
            return (Criteria) this;
        }

        public Criteria andChuxilishi22NotLike(String value) {
            addCriterion("CHUXILISHI22 not like", value, "chuxilishi22");
            return (Criteria) this;
        }

        public Criteria andChuxilishi22In(List<String> values) {
            addCriterion("CHUXILISHI22 in", values, "chuxilishi22");
            return (Criteria) this;
        }

        public Criteria andChuxilishi22NotIn(List<String> values) {
            addCriterion("CHUXILISHI22 not in", values, "chuxilishi22");
            return (Criteria) this;
        }

        public Criteria andChuxilishi22Between(String value1, String value2) {
            addCriterion("CHUXILISHI22 between", value1, value2, "chuxilishi22");
            return (Criteria) this;
        }

        public Criteria andChuxilishi22NotBetween(String value1, String value2) {
            addCriterion("CHUXILISHI22 not between", value1, value2, "chuxilishi22");
            return (Criteria) this;
        }

        public Criteria andChuxilishi23IsNull() {
            addCriterion("CHUXILISHI23 is null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi23IsNotNull() {
            addCriterion("CHUXILISHI23 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi23EqualTo(String value) {
            addCriterion("CHUXILISHI23 =", value, "chuxilishi23");
            return (Criteria) this;
        }

        public Criteria andChuxilishi23NotEqualTo(String value) {
            addCriterion("CHUXILISHI23 <>", value, "chuxilishi23");
            return (Criteria) this;
        }

        public Criteria andChuxilishi23GreaterThan(String value) {
            addCriterion("CHUXILISHI23 >", value, "chuxilishi23");
            return (Criteria) this;
        }

        public Criteria andChuxilishi23GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI23 >=", value, "chuxilishi23");
            return (Criteria) this;
        }

        public Criteria andChuxilishi23LessThan(String value) {
            addCriterion("CHUXILISHI23 <", value, "chuxilishi23");
            return (Criteria) this;
        }

        public Criteria andChuxilishi23LessThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI23 <=", value, "chuxilishi23");
            return (Criteria) this;
        }

        public Criteria andChuxilishi23Like(String value) {
            addCriterion("CHUXILISHI23 like", value, "chuxilishi23");
            return (Criteria) this;
        }

        public Criteria andChuxilishi23NotLike(String value) {
            addCriterion("CHUXILISHI23 not like", value, "chuxilishi23");
            return (Criteria) this;
        }

        public Criteria andChuxilishi23In(List<String> values) {
            addCriterion("CHUXILISHI23 in", values, "chuxilishi23");
            return (Criteria) this;
        }

        public Criteria andChuxilishi23NotIn(List<String> values) {
            addCriterion("CHUXILISHI23 not in", values, "chuxilishi23");
            return (Criteria) this;
        }

        public Criteria andChuxilishi23Between(String value1, String value2) {
            addCriterion("CHUXILISHI23 between", value1, value2, "chuxilishi23");
            return (Criteria) this;
        }

        public Criteria andChuxilishi23NotBetween(String value1, String value2) {
            addCriterion("CHUXILISHI23 not between", value1, value2, "chuxilishi23");
            return (Criteria) this;
        }

        public Criteria andChuxilishi24IsNull() {
            addCriterion("CHUXILISHI24 is null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi24IsNotNull() {
            addCriterion("CHUXILISHI24 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi24EqualTo(String value) {
            addCriterion("CHUXILISHI24 =", value, "chuxilishi24");
            return (Criteria) this;
        }

        public Criteria andChuxilishi24NotEqualTo(String value) {
            addCriterion("CHUXILISHI24 <>", value, "chuxilishi24");
            return (Criteria) this;
        }

        public Criteria andChuxilishi24GreaterThan(String value) {
            addCriterion("CHUXILISHI24 >", value, "chuxilishi24");
            return (Criteria) this;
        }

        public Criteria andChuxilishi24GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI24 >=", value, "chuxilishi24");
            return (Criteria) this;
        }

        public Criteria andChuxilishi24LessThan(String value) {
            addCriterion("CHUXILISHI24 <", value, "chuxilishi24");
            return (Criteria) this;
        }

        public Criteria andChuxilishi24LessThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI24 <=", value, "chuxilishi24");
            return (Criteria) this;
        }

        public Criteria andChuxilishi24Like(String value) {
            addCriterion("CHUXILISHI24 like", value, "chuxilishi24");
            return (Criteria) this;
        }

        public Criteria andChuxilishi24NotLike(String value) {
            addCriterion("CHUXILISHI24 not like", value, "chuxilishi24");
            return (Criteria) this;
        }

        public Criteria andChuxilishi24In(List<String> values) {
            addCriterion("CHUXILISHI24 in", values, "chuxilishi24");
            return (Criteria) this;
        }

        public Criteria andChuxilishi24NotIn(List<String> values) {
            addCriterion("CHUXILISHI24 not in", values, "chuxilishi24");
            return (Criteria) this;
        }

        public Criteria andChuxilishi24Between(String value1, String value2) {
            addCriterion("CHUXILISHI24 between", value1, value2, "chuxilishi24");
            return (Criteria) this;
        }

        public Criteria andChuxilishi24NotBetween(String value1, String value2) {
            addCriterion("CHUXILISHI24 not between", value1, value2, "chuxilishi24");
            return (Criteria) this;
        }

        public Criteria andChuxilishi25IsNull() {
            addCriterion("CHUXILISHI25 is null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi25IsNotNull() {
            addCriterion("CHUXILISHI25 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxilishi25EqualTo(String value) {
            addCriterion("CHUXILISHI25 =", value, "chuxilishi25");
            return (Criteria) this;
        }

        public Criteria andChuxilishi25NotEqualTo(String value) {
            addCriterion("CHUXILISHI25 <>", value, "chuxilishi25");
            return (Criteria) this;
        }

        public Criteria andChuxilishi25GreaterThan(String value) {
            addCriterion("CHUXILISHI25 >", value, "chuxilishi25");
            return (Criteria) this;
        }

        public Criteria andChuxilishi25GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI25 >=", value, "chuxilishi25");
            return (Criteria) this;
        }

        public Criteria andChuxilishi25LessThan(String value) {
            addCriterion("CHUXILISHI25 <", value, "chuxilishi25");
            return (Criteria) this;
        }

        public Criteria andChuxilishi25LessThanOrEqualTo(String value) {
            addCriterion("CHUXILISHI25 <=", value, "chuxilishi25");
            return (Criteria) this;
        }

        public Criteria andChuxilishi25Like(String value) {
            addCriterion("CHUXILISHI25 like", value, "chuxilishi25");
            return (Criteria) this;
        }

        public Criteria andChuxilishi25NotLike(String value) {
            addCriterion("CHUXILISHI25 not like", value, "chuxilishi25");
            return (Criteria) this;
        }

        public Criteria andChuxilishi25In(List<String> values) {
            addCriterion("CHUXILISHI25 in", values, "chuxilishi25");
            return (Criteria) this;
        }

        public Criteria andChuxilishi25NotIn(List<String> values) {
            addCriterion("CHUXILISHI25 not in", values, "chuxilishi25");
            return (Criteria) this;
        }

        public Criteria andChuxilishi25Between(String value1, String value2) {
            addCriterion("CHUXILISHI25 between", value1, value2, "chuxilishi25");
            return (Criteria) this;
        }

        public Criteria andChuxilishi25NotBetween(String value1, String value2) {
            addCriterion("CHUXILISHI25 not between", value1, value2, "chuxilishi25");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishiIsNull() {
            addCriterion("WEICHUXILISHI is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishiIsNotNull() {
            addCriterion("WEICHUXILISHI is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishiEqualTo(String value) {
            addCriterion("WEICHUXILISHI =", value, "weichuxilishi");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishiNotEqualTo(String value) {
            addCriterion("WEICHUXILISHI <>", value, "weichuxilishi");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishiGreaterThan(String value) {
            addCriterion("WEICHUXILISHI >", value, "weichuxilishi");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishiGreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI >=", value, "weichuxilishi");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishiLessThan(String value) {
            addCriterion("WEICHUXILISHI <", value, "weichuxilishi");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishiLessThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI <=", value, "weichuxilishi");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishiLike(String value) {
            addCriterion("WEICHUXILISHI like", value, "weichuxilishi");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishiNotLike(String value) {
            addCriterion("WEICHUXILISHI not like", value, "weichuxilishi");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishiIn(List<String> values) {
            addCriterion("WEICHUXILISHI in", values, "weichuxilishi");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishiNotIn(List<String> values) {
            addCriterion("WEICHUXILISHI not in", values, "weichuxilishi");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishiBetween(String value1, String value2) {
            addCriterion("WEICHUXILISHI between", value1, value2, "weichuxilishi");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishiNotBetween(String value1, String value2) {
            addCriterion("WEICHUXILISHI not between", value1, value2, "weichuxilishi");
            return (Criteria) this;
        }

        public Criteria andChuxijianshiIsNull() {
            addCriterion("CHUXIJIANSHI is null");
            return (Criteria) this;
        }

        public Criteria andChuxijianshiIsNotNull() {
            addCriterion("CHUXIJIANSHI is not null");
            return (Criteria) this;
        }

        public Criteria andChuxijianshiEqualTo(String value) {
            addCriterion("CHUXIJIANSHI =", value, "chuxijianshi");
            return (Criteria) this;
        }

        public Criteria andChuxijianshiNotEqualTo(String value) {
            addCriterion("CHUXIJIANSHI <>", value, "chuxijianshi");
            return (Criteria) this;
        }

        public Criteria andChuxijianshiGreaterThan(String value) {
            addCriterion("CHUXIJIANSHI >", value, "chuxijianshi");
            return (Criteria) this;
        }

        public Criteria andChuxijianshiGreaterThanOrEqualTo(String value) {
            addCriterion("CHUXIJIANSHI >=", value, "chuxijianshi");
            return (Criteria) this;
        }

        public Criteria andChuxijianshiLessThan(String value) {
            addCriterion("CHUXIJIANSHI <", value, "chuxijianshi");
            return (Criteria) this;
        }

        public Criteria andChuxijianshiLessThanOrEqualTo(String value) {
            addCriterion("CHUXIJIANSHI <=", value, "chuxijianshi");
            return (Criteria) this;
        }

        public Criteria andChuxijianshiLike(String value) {
            addCriterion("CHUXIJIANSHI like", value, "chuxijianshi");
            return (Criteria) this;
        }

        public Criteria andChuxijianshiNotLike(String value) {
            addCriterion("CHUXIJIANSHI not like", value, "chuxijianshi");
            return (Criteria) this;
        }

        public Criteria andChuxijianshiIn(List<String> values) {
            addCriterion("CHUXIJIANSHI in", values, "chuxijianshi");
            return (Criteria) this;
        }

        public Criteria andChuxijianshiNotIn(List<String> values) {
            addCriterion("CHUXIJIANSHI not in", values, "chuxijianshi");
            return (Criteria) this;
        }

        public Criteria andChuxijianshiBetween(String value1, String value2) {
            addCriterion("CHUXIJIANSHI between", value1, value2, "chuxijianshi");
            return (Criteria) this;
        }

        public Criteria andChuxijianshiNotBetween(String value1, String value2) {
            addCriterion("CHUXIJIANSHI not between", value1, value2, "chuxijianshi");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshiIsNull() {
            addCriterion("WEICHUXIJIANSHI is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshiIsNotNull() {
            addCriterion("WEICHUXIJIANSHI is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshiEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI =", value, "weichuxijianshi");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshiNotEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI <>", value, "weichuxijianshi");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshiGreaterThan(String value) {
            addCriterion("WEICHUXIJIANSHI >", value, "weichuxijianshi");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshiGreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI >=", value, "weichuxijianshi");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshiLessThan(String value) {
            addCriterion("WEICHUXIJIANSHI <", value, "weichuxijianshi");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshiLessThanOrEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI <=", value, "weichuxijianshi");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshiLike(String value) {
            addCriterion("WEICHUXIJIANSHI like", value, "weichuxijianshi");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshiNotLike(String value) {
            addCriterion("WEICHUXIJIANSHI not like", value, "weichuxijianshi");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshiIn(List<String> values) {
            addCriterion("WEICHUXIJIANSHI in", values, "weichuxijianshi");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshiNotIn(List<String> values) {
            addCriterion("WEICHUXIJIANSHI not in", values, "weichuxijianshi");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshiBetween(String value1, String value2) {
            addCriterion("WEICHUXIJIANSHI between", value1, value2, "weichuxijianshi");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshiNotBetween(String value1, String value2) {
            addCriterion("WEICHUXIJIANSHI not between", value1, value2, "weichuxijianshi");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi1IsNull() {
            addCriterion("CHUXIJIANSHI1 is null");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi1IsNotNull() {
            addCriterion("CHUXIJIANSHI1 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi1EqualTo(String value) {
            addCriterion("CHUXIJIANSHI1 =", value, "chuxijianshi1");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi1NotEqualTo(String value) {
            addCriterion("CHUXIJIANSHI1 <>", value, "chuxijianshi1");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi1GreaterThan(String value) {
            addCriterion("CHUXIJIANSHI1 >", value, "chuxijianshi1");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi1GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXIJIANSHI1 >=", value, "chuxijianshi1");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi1LessThan(String value) {
            addCriterion("CHUXIJIANSHI1 <", value, "chuxijianshi1");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi1LessThanOrEqualTo(String value) {
            addCriterion("CHUXIJIANSHI1 <=", value, "chuxijianshi1");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi1Like(String value) {
            addCriterion("CHUXIJIANSHI1 like", value, "chuxijianshi1");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi1NotLike(String value) {
            addCriterion("CHUXIJIANSHI1 not like", value, "chuxijianshi1");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi1In(List<String> values) {
            addCriterion("CHUXIJIANSHI1 in", values, "chuxijianshi1");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi1NotIn(List<String> values) {
            addCriterion("CHUXIJIANSHI1 not in", values, "chuxijianshi1");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi1Between(String value1, String value2) {
            addCriterion("CHUXIJIANSHI1 between", value1, value2, "chuxijianshi1");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi1NotBetween(String value1, String value2) {
            addCriterion("CHUXIJIANSHI1 not between", value1, value2, "chuxijianshi1");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi2IsNull() {
            addCriterion("CHUXIJIANSHI2 is null");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi2IsNotNull() {
            addCriterion("CHUXIJIANSHI2 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi2EqualTo(String value) {
            addCriterion("CHUXIJIANSHI2 =", value, "chuxijianshi2");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi2NotEqualTo(String value) {
            addCriterion("CHUXIJIANSHI2 <>", value, "chuxijianshi2");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi2GreaterThan(String value) {
            addCriterion("CHUXIJIANSHI2 >", value, "chuxijianshi2");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi2GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXIJIANSHI2 >=", value, "chuxijianshi2");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi2LessThan(String value) {
            addCriterion("CHUXIJIANSHI2 <", value, "chuxijianshi2");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi2LessThanOrEqualTo(String value) {
            addCriterion("CHUXIJIANSHI2 <=", value, "chuxijianshi2");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi2Like(String value) {
            addCriterion("CHUXIJIANSHI2 like", value, "chuxijianshi2");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi2NotLike(String value) {
            addCriterion("CHUXIJIANSHI2 not like", value, "chuxijianshi2");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi2In(List<String> values) {
            addCriterion("CHUXIJIANSHI2 in", values, "chuxijianshi2");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi2NotIn(List<String> values) {
            addCriterion("CHUXIJIANSHI2 not in", values, "chuxijianshi2");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi2Between(String value1, String value2) {
            addCriterion("CHUXIJIANSHI2 between", value1, value2, "chuxijianshi2");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi2NotBetween(String value1, String value2) {
            addCriterion("CHUXIJIANSHI2 not between", value1, value2, "chuxijianshi2");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi3IsNull() {
            addCriterion("CHUXIJIANSHI3 is null");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi3IsNotNull() {
            addCriterion("CHUXIJIANSHI3 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi3EqualTo(String value) {
            addCriterion("CHUXIJIANSHI3 =", value, "chuxijianshi3");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi3NotEqualTo(String value) {
            addCriterion("CHUXIJIANSHI3 <>", value, "chuxijianshi3");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi3GreaterThan(String value) {
            addCriterion("CHUXIJIANSHI3 >", value, "chuxijianshi3");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi3GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXIJIANSHI3 >=", value, "chuxijianshi3");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi3LessThan(String value) {
            addCriterion("CHUXIJIANSHI3 <", value, "chuxijianshi3");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi3LessThanOrEqualTo(String value) {
            addCriterion("CHUXIJIANSHI3 <=", value, "chuxijianshi3");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi3Like(String value) {
            addCriterion("CHUXIJIANSHI3 like", value, "chuxijianshi3");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi3NotLike(String value) {
            addCriterion("CHUXIJIANSHI3 not like", value, "chuxijianshi3");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi3In(List<String> values) {
            addCriterion("CHUXIJIANSHI3 in", values, "chuxijianshi3");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi3NotIn(List<String> values) {
            addCriterion("CHUXIJIANSHI3 not in", values, "chuxijianshi3");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi3Between(String value1, String value2) {
            addCriterion("CHUXIJIANSHI3 between", value1, value2, "chuxijianshi3");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi3NotBetween(String value1, String value2) {
            addCriterion("CHUXIJIANSHI3 not between", value1, value2, "chuxijianshi3");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi4IsNull() {
            addCriterion("CHUXIJIANSHI4 is null");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi4IsNotNull() {
            addCriterion("CHUXIJIANSHI4 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi4EqualTo(String value) {
            addCriterion("CHUXIJIANSHI4 =", value, "chuxijianshi4");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi4NotEqualTo(String value) {
            addCriterion("CHUXIJIANSHI4 <>", value, "chuxijianshi4");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi4GreaterThan(String value) {
            addCriterion("CHUXIJIANSHI4 >", value, "chuxijianshi4");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi4GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXIJIANSHI4 >=", value, "chuxijianshi4");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi4LessThan(String value) {
            addCriterion("CHUXIJIANSHI4 <", value, "chuxijianshi4");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi4LessThanOrEqualTo(String value) {
            addCriterion("CHUXIJIANSHI4 <=", value, "chuxijianshi4");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi4Like(String value) {
            addCriterion("CHUXIJIANSHI4 like", value, "chuxijianshi4");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi4NotLike(String value) {
            addCriterion("CHUXIJIANSHI4 not like", value, "chuxijianshi4");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi4In(List<String> values) {
            addCriterion("CHUXIJIANSHI4 in", values, "chuxijianshi4");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi4NotIn(List<String> values) {
            addCriterion("CHUXIJIANSHI4 not in", values, "chuxijianshi4");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi4Between(String value1, String value2) {
            addCriterion("CHUXIJIANSHI4 between", value1, value2, "chuxijianshi4");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi4NotBetween(String value1, String value2) {
            addCriterion("CHUXIJIANSHI4 not between", value1, value2, "chuxijianshi4");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi5IsNull() {
            addCriterion("CHUXIJIANSHI5 is null");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi5IsNotNull() {
            addCriterion("CHUXIJIANSHI5 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi5EqualTo(String value) {
            addCriterion("CHUXIJIANSHI5 =", value, "chuxijianshi5");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi5NotEqualTo(String value) {
            addCriterion("CHUXIJIANSHI5 <>", value, "chuxijianshi5");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi5GreaterThan(String value) {
            addCriterion("CHUXIJIANSHI5 >", value, "chuxijianshi5");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi5GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXIJIANSHI5 >=", value, "chuxijianshi5");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi5LessThan(String value) {
            addCriterion("CHUXIJIANSHI5 <", value, "chuxijianshi5");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi5LessThanOrEqualTo(String value) {
            addCriterion("CHUXIJIANSHI5 <=", value, "chuxijianshi5");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi5Like(String value) {
            addCriterion("CHUXIJIANSHI5 like", value, "chuxijianshi5");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi5NotLike(String value) {
            addCriterion("CHUXIJIANSHI5 not like", value, "chuxijianshi5");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi5In(List<String> values) {
            addCriterion("CHUXIJIANSHI5 in", values, "chuxijianshi5");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi5NotIn(List<String> values) {
            addCriterion("CHUXIJIANSHI5 not in", values, "chuxijianshi5");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi5Between(String value1, String value2) {
            addCriterion("CHUXIJIANSHI5 between", value1, value2, "chuxijianshi5");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi5NotBetween(String value1, String value2) {
            addCriterion("CHUXIJIANSHI5 not between", value1, value2, "chuxijianshi5");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi6IsNull() {
            addCriterion("CHUXIJIANSHI6 is null");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi6IsNotNull() {
            addCriterion("CHUXIJIANSHI6 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi6EqualTo(String value) {
            addCriterion("CHUXIJIANSHI6 =", value, "chuxijianshi6");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi6NotEqualTo(String value) {
            addCriterion("CHUXIJIANSHI6 <>", value, "chuxijianshi6");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi6GreaterThan(String value) {
            addCriterion("CHUXIJIANSHI6 >", value, "chuxijianshi6");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi6GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXIJIANSHI6 >=", value, "chuxijianshi6");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi6LessThan(String value) {
            addCriterion("CHUXIJIANSHI6 <", value, "chuxijianshi6");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi6LessThanOrEqualTo(String value) {
            addCriterion("CHUXIJIANSHI6 <=", value, "chuxijianshi6");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi6Like(String value) {
            addCriterion("CHUXIJIANSHI6 like", value, "chuxijianshi6");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi6NotLike(String value) {
            addCriterion("CHUXIJIANSHI6 not like", value, "chuxijianshi6");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi6In(List<String> values) {
            addCriterion("CHUXIJIANSHI6 in", values, "chuxijianshi6");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi6NotIn(List<String> values) {
            addCriterion("CHUXIJIANSHI6 not in", values, "chuxijianshi6");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi6Between(String value1, String value2) {
            addCriterion("CHUXIJIANSHI6 between", value1, value2, "chuxijianshi6");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi6NotBetween(String value1, String value2) {
            addCriterion("CHUXIJIANSHI6 not between", value1, value2, "chuxijianshi6");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi7IsNull() {
            addCriterion("CHUXIJIANSHI7 is null");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi7IsNotNull() {
            addCriterion("CHUXIJIANSHI7 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi7EqualTo(String value) {
            addCriterion("CHUXIJIANSHI7 =", value, "chuxijianshi7");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi7NotEqualTo(String value) {
            addCriterion("CHUXIJIANSHI7 <>", value, "chuxijianshi7");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi7GreaterThan(String value) {
            addCriterion("CHUXIJIANSHI7 >", value, "chuxijianshi7");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi7GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXIJIANSHI7 >=", value, "chuxijianshi7");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi7LessThan(String value) {
            addCriterion("CHUXIJIANSHI7 <", value, "chuxijianshi7");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi7LessThanOrEqualTo(String value) {
            addCriterion("CHUXIJIANSHI7 <=", value, "chuxijianshi7");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi7Like(String value) {
            addCriterion("CHUXIJIANSHI7 like", value, "chuxijianshi7");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi7NotLike(String value) {
            addCriterion("CHUXIJIANSHI7 not like", value, "chuxijianshi7");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi7In(List<String> values) {
            addCriterion("CHUXIJIANSHI7 in", values, "chuxijianshi7");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi7NotIn(List<String> values) {
            addCriterion("CHUXIJIANSHI7 not in", values, "chuxijianshi7");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi7Between(String value1, String value2) {
            addCriterion("CHUXIJIANSHI7 between", value1, value2, "chuxijianshi7");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi7NotBetween(String value1, String value2) {
            addCriterion("CHUXIJIANSHI7 not between", value1, value2, "chuxijianshi7");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi8IsNull() {
            addCriterion("CHUXIJIANSHI8 is null");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi8IsNotNull() {
            addCriterion("CHUXIJIANSHI8 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi8EqualTo(String value) {
            addCriterion("CHUXIJIANSHI8 =", value, "chuxijianshi8");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi8NotEqualTo(String value) {
            addCriterion("CHUXIJIANSHI8 <>", value, "chuxijianshi8");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi8GreaterThan(String value) {
            addCriterion("CHUXIJIANSHI8 >", value, "chuxijianshi8");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi8GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXIJIANSHI8 >=", value, "chuxijianshi8");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi8LessThan(String value) {
            addCriterion("CHUXIJIANSHI8 <", value, "chuxijianshi8");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi8LessThanOrEqualTo(String value) {
            addCriterion("CHUXIJIANSHI8 <=", value, "chuxijianshi8");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi8Like(String value) {
            addCriterion("CHUXIJIANSHI8 like", value, "chuxijianshi8");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi8NotLike(String value) {
            addCriterion("CHUXIJIANSHI8 not like", value, "chuxijianshi8");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi8In(List<String> values) {
            addCriterion("CHUXIJIANSHI8 in", values, "chuxijianshi8");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi8NotIn(List<String> values) {
            addCriterion("CHUXIJIANSHI8 not in", values, "chuxijianshi8");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi8Between(String value1, String value2) {
            addCriterion("CHUXIJIANSHI8 between", value1, value2, "chuxijianshi8");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi8NotBetween(String value1, String value2) {
            addCriterion("CHUXIJIANSHI8 not between", value1, value2, "chuxijianshi8");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi9IsNull() {
            addCriterion("CHUXIJIANSHI9 is null");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi9IsNotNull() {
            addCriterion("CHUXIJIANSHI9 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi9EqualTo(String value) {
            addCriterion("CHUXIJIANSHI9 =", value, "chuxijianshi9");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi9NotEqualTo(String value) {
            addCriterion("CHUXIJIANSHI9 <>", value, "chuxijianshi9");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi9GreaterThan(String value) {
            addCriterion("CHUXIJIANSHI9 >", value, "chuxijianshi9");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi9GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXIJIANSHI9 >=", value, "chuxijianshi9");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi9LessThan(String value) {
            addCriterion("CHUXIJIANSHI9 <", value, "chuxijianshi9");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi9LessThanOrEqualTo(String value) {
            addCriterion("CHUXIJIANSHI9 <=", value, "chuxijianshi9");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi9Like(String value) {
            addCriterion("CHUXIJIANSHI9 like", value, "chuxijianshi9");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi9NotLike(String value) {
            addCriterion("CHUXIJIANSHI9 not like", value, "chuxijianshi9");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi9In(List<String> values) {
            addCriterion("CHUXIJIANSHI9 in", values, "chuxijianshi9");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi9NotIn(List<String> values) {
            addCriterion("CHUXIJIANSHI9 not in", values, "chuxijianshi9");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi9Between(String value1, String value2) {
            addCriterion("CHUXIJIANSHI9 between", value1, value2, "chuxijianshi9");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi9NotBetween(String value1, String value2) {
            addCriterion("CHUXIJIANSHI9 not between", value1, value2, "chuxijianshi9");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi10IsNull() {
            addCriterion("CHUXIJIANSHI10 is null");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi10IsNotNull() {
            addCriterion("CHUXIJIANSHI10 is not null");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi10EqualTo(String value) {
            addCriterion("CHUXIJIANSHI10 =", value, "chuxijianshi10");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi10NotEqualTo(String value) {
            addCriterion("CHUXIJIANSHI10 <>", value, "chuxijianshi10");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi10GreaterThan(String value) {
            addCriterion("CHUXIJIANSHI10 >", value, "chuxijianshi10");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi10GreaterThanOrEqualTo(String value) {
            addCriterion("CHUXIJIANSHI10 >=", value, "chuxijianshi10");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi10LessThan(String value) {
            addCriterion("CHUXIJIANSHI10 <", value, "chuxijianshi10");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi10LessThanOrEqualTo(String value) {
            addCriterion("CHUXIJIANSHI10 <=", value, "chuxijianshi10");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi10Like(String value) {
            addCriterion("CHUXIJIANSHI10 like", value, "chuxijianshi10");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi10NotLike(String value) {
            addCriterion("CHUXIJIANSHI10 not like", value, "chuxijianshi10");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi10In(List<String> values) {
            addCriterion("CHUXIJIANSHI10 in", values, "chuxijianshi10");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi10NotIn(List<String> values) {
            addCriterion("CHUXIJIANSHI10 not in", values, "chuxijianshi10");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi10Between(String value1, String value2) {
            addCriterion("CHUXIJIANSHI10 between", value1, value2, "chuxijianshi10");
            return (Criteria) this;
        }

        public Criteria andChuxijianshi10NotBetween(String value1, String value2) {
            addCriterion("CHUXIJIANSHI10 not between", value1, value2, "chuxijianshi10");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi1IsNull() {
            addCriterion("WEICHUXIJIANSHI1 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi1IsNotNull() {
            addCriterion("WEICHUXIJIANSHI1 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi1EqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI1 =", value, "weichuxijianshi1");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi1NotEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI1 <>", value, "weichuxijianshi1");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi1GreaterThan(String value) {
            addCriterion("WEICHUXIJIANSHI1 >", value, "weichuxijianshi1");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi1GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI1 >=", value, "weichuxijianshi1");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi1LessThan(String value) {
            addCriterion("WEICHUXIJIANSHI1 <", value, "weichuxijianshi1");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi1LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI1 <=", value, "weichuxijianshi1");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi1Like(String value) {
            addCriterion("WEICHUXIJIANSHI1 like", value, "weichuxijianshi1");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi1NotLike(String value) {
            addCriterion("WEICHUXIJIANSHI1 not like", value, "weichuxijianshi1");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi1In(List<String> values) {
            addCriterion("WEICHUXIJIANSHI1 in", values, "weichuxijianshi1");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi1NotIn(List<String> values) {
            addCriterion("WEICHUXIJIANSHI1 not in", values, "weichuxijianshi1");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi1Between(String value1, String value2) {
            addCriterion("WEICHUXIJIANSHI1 between", value1, value2, "weichuxijianshi1");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi1NotBetween(String value1, String value2) {
            addCriterion("WEICHUXIJIANSHI1 not between", value1, value2, "weichuxijianshi1");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi2IsNull() {
            addCriterion("WEICHUXIJIANSHI2 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi2IsNotNull() {
            addCriterion("WEICHUXIJIANSHI2 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi2EqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI2 =", value, "weichuxijianshi2");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi2NotEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI2 <>", value, "weichuxijianshi2");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi2GreaterThan(String value) {
            addCriterion("WEICHUXIJIANSHI2 >", value, "weichuxijianshi2");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi2GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI2 >=", value, "weichuxijianshi2");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi2LessThan(String value) {
            addCriterion("WEICHUXIJIANSHI2 <", value, "weichuxijianshi2");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi2LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI2 <=", value, "weichuxijianshi2");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi2Like(String value) {
            addCriterion("WEICHUXIJIANSHI2 like", value, "weichuxijianshi2");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi2NotLike(String value) {
            addCriterion("WEICHUXIJIANSHI2 not like", value, "weichuxijianshi2");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi2In(List<String> values) {
            addCriterion("WEICHUXIJIANSHI2 in", values, "weichuxijianshi2");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi2NotIn(List<String> values) {
            addCriterion("WEICHUXIJIANSHI2 not in", values, "weichuxijianshi2");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi2Between(String value1, String value2) {
            addCriterion("WEICHUXIJIANSHI2 between", value1, value2, "weichuxijianshi2");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi2NotBetween(String value1, String value2) {
            addCriterion("WEICHUXIJIANSHI2 not between", value1, value2, "weichuxijianshi2");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi3IsNull() {
            addCriterion("WEICHUXIJIANSHI3 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi3IsNotNull() {
            addCriterion("WEICHUXIJIANSHI3 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi3EqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI3 =", value, "weichuxijianshi3");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi3NotEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI3 <>", value, "weichuxijianshi3");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi3GreaterThan(String value) {
            addCriterion("WEICHUXIJIANSHI3 >", value, "weichuxijianshi3");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi3GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI3 >=", value, "weichuxijianshi3");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi3LessThan(String value) {
            addCriterion("WEICHUXIJIANSHI3 <", value, "weichuxijianshi3");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi3LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI3 <=", value, "weichuxijianshi3");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi3Like(String value) {
            addCriterion("WEICHUXIJIANSHI3 like", value, "weichuxijianshi3");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi3NotLike(String value) {
            addCriterion("WEICHUXIJIANSHI3 not like", value, "weichuxijianshi3");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi3In(List<String> values) {
            addCriterion("WEICHUXIJIANSHI3 in", values, "weichuxijianshi3");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi3NotIn(List<String> values) {
            addCriterion("WEICHUXIJIANSHI3 not in", values, "weichuxijianshi3");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi3Between(String value1, String value2) {
            addCriterion("WEICHUXIJIANSHI3 between", value1, value2, "weichuxijianshi3");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi3NotBetween(String value1, String value2) {
            addCriterion("WEICHUXIJIANSHI3 not between", value1, value2, "weichuxijianshi3");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi4IsNull() {
            addCriterion("WEICHUXIJIANSHI4 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi4IsNotNull() {
            addCriterion("WEICHUXIJIANSHI4 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi4EqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI4 =", value, "weichuxijianshi4");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi4NotEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI4 <>", value, "weichuxijianshi4");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi4GreaterThan(String value) {
            addCriterion("WEICHUXIJIANSHI4 >", value, "weichuxijianshi4");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi4GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI4 >=", value, "weichuxijianshi4");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi4LessThan(String value) {
            addCriterion("WEICHUXIJIANSHI4 <", value, "weichuxijianshi4");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi4LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI4 <=", value, "weichuxijianshi4");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi4Like(String value) {
            addCriterion("WEICHUXIJIANSHI4 like", value, "weichuxijianshi4");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi4NotLike(String value) {
            addCriterion("WEICHUXIJIANSHI4 not like", value, "weichuxijianshi4");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi4In(List<String> values) {
            addCriterion("WEICHUXIJIANSHI4 in", values, "weichuxijianshi4");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi4NotIn(List<String> values) {
            addCriterion("WEICHUXIJIANSHI4 not in", values, "weichuxijianshi4");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi4Between(String value1, String value2) {
            addCriterion("WEICHUXIJIANSHI4 between", value1, value2, "weichuxijianshi4");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi4NotBetween(String value1, String value2) {
            addCriterion("WEICHUXIJIANSHI4 not between", value1, value2, "weichuxijianshi4");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi5IsNull() {
            addCriterion("WEICHUXIJIANSHI5 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi5IsNotNull() {
            addCriterion("WEICHUXIJIANSHI5 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi5EqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI5 =", value, "weichuxijianshi5");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi5NotEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI5 <>", value, "weichuxijianshi5");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi5GreaterThan(String value) {
            addCriterion("WEICHUXIJIANSHI5 >", value, "weichuxijianshi5");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi5GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI5 >=", value, "weichuxijianshi5");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi5LessThan(String value) {
            addCriterion("WEICHUXIJIANSHI5 <", value, "weichuxijianshi5");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi5LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI5 <=", value, "weichuxijianshi5");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi5Like(String value) {
            addCriterion("WEICHUXIJIANSHI5 like", value, "weichuxijianshi5");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi5NotLike(String value) {
            addCriterion("WEICHUXIJIANSHI5 not like", value, "weichuxijianshi5");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi5In(List<String> values) {
            addCriterion("WEICHUXIJIANSHI5 in", values, "weichuxijianshi5");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi5NotIn(List<String> values) {
            addCriterion("WEICHUXIJIANSHI5 not in", values, "weichuxijianshi5");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi5Between(String value1, String value2) {
            addCriterion("WEICHUXIJIANSHI5 between", value1, value2, "weichuxijianshi5");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi5NotBetween(String value1, String value2) {
            addCriterion("WEICHUXIJIANSHI5 not between", value1, value2, "weichuxijianshi5");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi6IsNull() {
            addCriterion("WEICHUXIJIANSHI6 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi6IsNotNull() {
            addCriterion("WEICHUXIJIANSHI6 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi6EqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI6 =", value, "weichuxijianshi6");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi6NotEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI6 <>", value, "weichuxijianshi6");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi6GreaterThan(String value) {
            addCriterion("WEICHUXIJIANSHI6 >", value, "weichuxijianshi6");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi6GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI6 >=", value, "weichuxijianshi6");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi6LessThan(String value) {
            addCriterion("WEICHUXIJIANSHI6 <", value, "weichuxijianshi6");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi6LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI6 <=", value, "weichuxijianshi6");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi6Like(String value) {
            addCriterion("WEICHUXIJIANSHI6 like", value, "weichuxijianshi6");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi6NotLike(String value) {
            addCriterion("WEICHUXIJIANSHI6 not like", value, "weichuxijianshi6");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi6In(List<String> values) {
            addCriterion("WEICHUXIJIANSHI6 in", values, "weichuxijianshi6");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi6NotIn(List<String> values) {
            addCriterion("WEICHUXIJIANSHI6 not in", values, "weichuxijianshi6");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi6Between(String value1, String value2) {
            addCriterion("WEICHUXIJIANSHI6 between", value1, value2, "weichuxijianshi6");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi6NotBetween(String value1, String value2) {
            addCriterion("WEICHUXIJIANSHI6 not between", value1, value2, "weichuxijianshi6");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi7IsNull() {
            addCriterion("WEICHUXIJIANSHI7 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi7IsNotNull() {
            addCriterion("WEICHUXIJIANSHI7 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi7EqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI7 =", value, "weichuxijianshi7");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi7NotEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI7 <>", value, "weichuxijianshi7");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi7GreaterThan(String value) {
            addCriterion("WEICHUXIJIANSHI7 >", value, "weichuxijianshi7");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi7GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI7 >=", value, "weichuxijianshi7");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi7LessThan(String value) {
            addCriterion("WEICHUXIJIANSHI7 <", value, "weichuxijianshi7");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi7LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI7 <=", value, "weichuxijianshi7");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi7Like(String value) {
            addCriterion("WEICHUXIJIANSHI7 like", value, "weichuxijianshi7");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi7NotLike(String value) {
            addCriterion("WEICHUXIJIANSHI7 not like", value, "weichuxijianshi7");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi7In(List<String> values) {
            addCriterion("WEICHUXIJIANSHI7 in", values, "weichuxijianshi7");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi7NotIn(List<String> values) {
            addCriterion("WEICHUXIJIANSHI7 not in", values, "weichuxijianshi7");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi7Between(String value1, String value2) {
            addCriterion("WEICHUXIJIANSHI7 between", value1, value2, "weichuxijianshi7");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi7NotBetween(String value1, String value2) {
            addCriterion("WEICHUXIJIANSHI7 not between", value1, value2, "weichuxijianshi7");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi8IsNull() {
            addCriterion("WEICHUXIJIANSHI8 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi8IsNotNull() {
            addCriterion("WEICHUXIJIANSHI8 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi8EqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI8 =", value, "weichuxijianshi8");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi8NotEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI8 <>", value, "weichuxijianshi8");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi8GreaterThan(String value) {
            addCriterion("WEICHUXIJIANSHI8 >", value, "weichuxijianshi8");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi8GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI8 >=", value, "weichuxijianshi8");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi8LessThan(String value) {
            addCriterion("WEICHUXIJIANSHI8 <", value, "weichuxijianshi8");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi8LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI8 <=", value, "weichuxijianshi8");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi8Like(String value) {
            addCriterion("WEICHUXIJIANSHI8 like", value, "weichuxijianshi8");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi8NotLike(String value) {
            addCriterion("WEICHUXIJIANSHI8 not like", value, "weichuxijianshi8");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi8In(List<String> values) {
            addCriterion("WEICHUXIJIANSHI8 in", values, "weichuxijianshi8");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi8NotIn(List<String> values) {
            addCriterion("WEICHUXIJIANSHI8 not in", values, "weichuxijianshi8");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi8Between(String value1, String value2) {
            addCriterion("WEICHUXIJIANSHI8 between", value1, value2, "weichuxijianshi8");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi8NotBetween(String value1, String value2) {
            addCriterion("WEICHUXIJIANSHI8 not between", value1, value2, "weichuxijianshi8");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi9IsNull() {
            addCriterion("WEICHUXIJIANSHI9 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi9IsNotNull() {
            addCriterion("WEICHUXIJIANSHI9 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi9EqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI9 =", value, "weichuxijianshi9");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi9NotEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI9 <>", value, "weichuxijianshi9");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi9GreaterThan(String value) {
            addCriterion("WEICHUXIJIANSHI9 >", value, "weichuxijianshi9");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi9GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI9 >=", value, "weichuxijianshi9");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi9LessThan(String value) {
            addCriterion("WEICHUXIJIANSHI9 <", value, "weichuxijianshi9");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi9LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI9 <=", value, "weichuxijianshi9");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi9Like(String value) {
            addCriterion("WEICHUXIJIANSHI9 like", value, "weichuxijianshi9");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi9NotLike(String value) {
            addCriterion("WEICHUXIJIANSHI9 not like", value, "weichuxijianshi9");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi9In(List<String> values) {
            addCriterion("WEICHUXIJIANSHI9 in", values, "weichuxijianshi9");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi9NotIn(List<String> values) {
            addCriterion("WEICHUXIJIANSHI9 not in", values, "weichuxijianshi9");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi9Between(String value1, String value2) {
            addCriterion("WEICHUXIJIANSHI9 between", value1, value2, "weichuxijianshi9");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi9NotBetween(String value1, String value2) {
            addCriterion("WEICHUXIJIANSHI9 not between", value1, value2, "weichuxijianshi9");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi10IsNull() {
            addCriterion("WEICHUXIJIANSHI10 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi10IsNotNull() {
            addCriterion("WEICHUXIJIANSHI10 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi10EqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI10 =", value, "weichuxijianshi10");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi10NotEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI10 <>", value, "weichuxijianshi10");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi10GreaterThan(String value) {
            addCriterion("WEICHUXIJIANSHI10 >", value, "weichuxijianshi10");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi10GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI10 >=", value, "weichuxijianshi10");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi10LessThan(String value) {
            addCriterion("WEICHUXIJIANSHI10 <", value, "weichuxijianshi10");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi10LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXIJIANSHI10 <=", value, "weichuxijianshi10");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi10Like(String value) {
            addCriterion("WEICHUXIJIANSHI10 like", value, "weichuxijianshi10");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi10NotLike(String value) {
            addCriterion("WEICHUXIJIANSHI10 not like", value, "weichuxijianshi10");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi10In(List<String> values) {
            addCriterion("WEICHUXIJIANSHI10 in", values, "weichuxijianshi10");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi10NotIn(List<String> values) {
            addCriterion("WEICHUXIJIANSHI10 not in", values, "weichuxijianshi10");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi10Between(String value1, String value2) {
            addCriterion("WEICHUXIJIANSHI10 between", value1, value2, "weichuxijianshi10");
            return (Criteria) this;
        }

        public Criteria andWeichuxijianshi10NotBetween(String value1, String value2) {
            addCriterion("WEICHUXIJIANSHI10 not between", value1, value2, "weichuxijianshi10");
            return (Criteria) this;
        }

        public Criteria andLishizongshuIsNull() {
            addCriterion("LISHIZONGSHU is null");
            return (Criteria) this;
        }

        public Criteria andLishizongshuIsNotNull() {
            addCriterion("LISHIZONGSHU is not null");
            return (Criteria) this;
        }

        public Criteria andLishizongshuEqualTo(Short value) {
            addCriterion("LISHIZONGSHU =", value, "lishizongshu");
            return (Criteria) this;
        }

        public Criteria andLishizongshuNotEqualTo(Short value) {
            addCriterion("LISHIZONGSHU <>", value, "lishizongshu");
            return (Criteria) this;
        }

        public Criteria andLishizongshuGreaterThan(Short value) {
            addCriterion("LISHIZONGSHU >", value, "lishizongshu");
            return (Criteria) this;
        }

        public Criteria andLishizongshuGreaterThanOrEqualTo(Short value) {
            addCriterion("LISHIZONGSHU >=", value, "lishizongshu");
            return (Criteria) this;
        }

        public Criteria andLishizongshuLessThan(Short value) {
            addCriterion("LISHIZONGSHU <", value, "lishizongshu");
            return (Criteria) this;
        }

        public Criteria andLishizongshuLessThanOrEqualTo(Short value) {
            addCriterion("LISHIZONGSHU <=", value, "lishizongshu");
            return (Criteria) this;
        }

        public Criteria andLishizongshuIn(List<Short> values) {
            addCriterion("LISHIZONGSHU in", values, "lishizongshu");
            return (Criteria) this;
        }

        public Criteria andLishizongshuNotIn(List<Short> values) {
            addCriterion("LISHIZONGSHU not in", values, "lishizongshu");
            return (Criteria) this;
        }

        public Criteria andLishizongshuBetween(Short value1, Short value2) {
            addCriterion("LISHIZONGSHU between", value1, value2, "lishizongshu");
            return (Criteria) this;
        }

        public Criteria andLishizongshuNotBetween(Short value1, Short value2) {
            addCriterion("LISHIZONGSHU not between", value1, value2, "lishizongshu");
            return (Criteria) this;
        }

        public Criteria andJianshizongshuIsNull() {
            addCriterion("JIANSHIZONGSHU is null");
            return (Criteria) this;
        }

        public Criteria andJianshizongshuIsNotNull() {
            addCriterion("JIANSHIZONGSHU is not null");
            return (Criteria) this;
        }

        public Criteria andJianshizongshuEqualTo(Short value) {
            addCriterion("JIANSHIZONGSHU =", value, "jianshizongshu");
            return (Criteria) this;
        }

        public Criteria andJianshizongshuNotEqualTo(Short value) {
            addCriterion("JIANSHIZONGSHU <>", value, "jianshizongshu");
            return (Criteria) this;
        }

        public Criteria andJianshizongshuGreaterThan(Short value) {
            addCriterion("JIANSHIZONGSHU >", value, "jianshizongshu");
            return (Criteria) this;
        }

        public Criteria andJianshizongshuGreaterThanOrEqualTo(Short value) {
            addCriterion("JIANSHIZONGSHU >=", value, "jianshizongshu");
            return (Criteria) this;
        }

        public Criteria andJianshizongshuLessThan(Short value) {
            addCriterion("JIANSHIZONGSHU <", value, "jianshizongshu");
            return (Criteria) this;
        }

        public Criteria andJianshizongshuLessThanOrEqualTo(Short value) {
            addCriterion("JIANSHIZONGSHU <=", value, "jianshizongshu");
            return (Criteria) this;
        }

        public Criteria andJianshizongshuIn(List<Short> values) {
            addCriterion("JIANSHIZONGSHU in", values, "jianshizongshu");
            return (Criteria) this;
        }

        public Criteria andJianshizongshuNotIn(List<Short> values) {
            addCriterion("JIANSHIZONGSHU not in", values, "jianshizongshu");
            return (Criteria) this;
        }

        public Criteria andJianshizongshuBetween(Short value1, Short value2) {
            addCriterion("JIANSHIZONGSHU between", value1, value2, "jianshizongshu");
            return (Criteria) this;
        }

        public Criteria andJianshizongshuNotBetween(Short value1, Short value2) {
            addCriterion("JIANSHIZONGSHU not between", value1, value2, "jianshizongshu");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi1IsNull() {
            addCriterion("WEICHUXILISHI1 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi1IsNotNull() {
            addCriterion("WEICHUXILISHI1 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi1EqualTo(String value) {
            addCriterion("WEICHUXILISHI1 =", value, "weichuxilishi1");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi1NotEqualTo(String value) {
            addCriterion("WEICHUXILISHI1 <>", value, "weichuxilishi1");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi1GreaterThan(String value) {
            addCriterion("WEICHUXILISHI1 >", value, "weichuxilishi1");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi1GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI1 >=", value, "weichuxilishi1");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi1LessThan(String value) {
            addCriterion("WEICHUXILISHI1 <", value, "weichuxilishi1");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi1LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI1 <=", value, "weichuxilishi1");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi1Like(String value) {
            addCriterion("WEICHUXILISHI1 like", value, "weichuxilishi1");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi1NotLike(String value) {
            addCriterion("WEICHUXILISHI1 not like", value, "weichuxilishi1");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi1In(List<String> values) {
            addCriterion("WEICHUXILISHI1 in", values, "weichuxilishi1");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi1NotIn(List<String> values) {
            addCriterion("WEICHUXILISHI1 not in", values, "weichuxilishi1");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi1Between(String value1, String value2) {
            addCriterion("WEICHUXILISHI1 between", value1, value2, "weichuxilishi1");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi1NotBetween(String value1, String value2) {
            addCriterion("WEICHUXILISHI1 not between", value1, value2, "weichuxilishi1");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi2IsNull() {
            addCriterion("WEICHUXILISHI2 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi2IsNotNull() {
            addCriterion("WEICHUXILISHI2 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi2EqualTo(String value) {
            addCriterion("WEICHUXILISHI2 =", value, "weichuxilishi2");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi2NotEqualTo(String value) {
            addCriterion("WEICHUXILISHI2 <>", value, "weichuxilishi2");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi2GreaterThan(String value) {
            addCriterion("WEICHUXILISHI2 >", value, "weichuxilishi2");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi2GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI2 >=", value, "weichuxilishi2");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi2LessThan(String value) {
            addCriterion("WEICHUXILISHI2 <", value, "weichuxilishi2");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi2LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI2 <=", value, "weichuxilishi2");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi2Like(String value) {
            addCriterion("WEICHUXILISHI2 like", value, "weichuxilishi2");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi2NotLike(String value) {
            addCriterion("WEICHUXILISHI2 not like", value, "weichuxilishi2");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi2In(List<String> values) {
            addCriterion("WEICHUXILISHI2 in", values, "weichuxilishi2");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi2NotIn(List<String> values) {
            addCriterion("WEICHUXILISHI2 not in", values, "weichuxilishi2");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi2Between(String value1, String value2) {
            addCriterion("WEICHUXILISHI2 between", value1, value2, "weichuxilishi2");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi2NotBetween(String value1, String value2) {
            addCriterion("WEICHUXILISHI2 not between", value1, value2, "weichuxilishi2");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi3IsNull() {
            addCriterion("WEICHUXILISHI3 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi3IsNotNull() {
            addCriterion("WEICHUXILISHI3 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi3EqualTo(String value) {
            addCriterion("WEICHUXILISHI3 =", value, "weichuxilishi3");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi3NotEqualTo(String value) {
            addCriterion("WEICHUXILISHI3 <>", value, "weichuxilishi3");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi3GreaterThan(String value) {
            addCriterion("WEICHUXILISHI3 >", value, "weichuxilishi3");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi3GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI3 >=", value, "weichuxilishi3");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi3LessThan(String value) {
            addCriterion("WEICHUXILISHI3 <", value, "weichuxilishi3");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi3LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI3 <=", value, "weichuxilishi3");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi3Like(String value) {
            addCriterion("WEICHUXILISHI3 like", value, "weichuxilishi3");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi3NotLike(String value) {
            addCriterion("WEICHUXILISHI3 not like", value, "weichuxilishi3");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi3In(List<String> values) {
            addCriterion("WEICHUXILISHI3 in", values, "weichuxilishi3");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi3NotIn(List<String> values) {
            addCriterion("WEICHUXILISHI3 not in", values, "weichuxilishi3");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi3Between(String value1, String value2) {
            addCriterion("WEICHUXILISHI3 between", value1, value2, "weichuxilishi3");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi3NotBetween(String value1, String value2) {
            addCriterion("WEICHUXILISHI3 not between", value1, value2, "weichuxilishi3");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi4IsNull() {
            addCriterion("WEICHUXILISHI4 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi4IsNotNull() {
            addCriterion("WEICHUXILISHI4 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi4EqualTo(String value) {
            addCriterion("WEICHUXILISHI4 =", value, "weichuxilishi4");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi4NotEqualTo(String value) {
            addCriterion("WEICHUXILISHI4 <>", value, "weichuxilishi4");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi4GreaterThan(String value) {
            addCriterion("WEICHUXILISHI4 >", value, "weichuxilishi4");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi4GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI4 >=", value, "weichuxilishi4");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi4LessThan(String value) {
            addCriterion("WEICHUXILISHI4 <", value, "weichuxilishi4");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi4LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI4 <=", value, "weichuxilishi4");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi4Like(String value) {
            addCriterion("WEICHUXILISHI4 like", value, "weichuxilishi4");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi4NotLike(String value) {
            addCriterion("WEICHUXILISHI4 not like", value, "weichuxilishi4");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi4In(List<String> values) {
            addCriterion("WEICHUXILISHI4 in", values, "weichuxilishi4");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi4NotIn(List<String> values) {
            addCriterion("WEICHUXILISHI4 not in", values, "weichuxilishi4");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi4Between(String value1, String value2) {
            addCriterion("WEICHUXILISHI4 between", value1, value2, "weichuxilishi4");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi4NotBetween(String value1, String value2) {
            addCriterion("WEICHUXILISHI4 not between", value1, value2, "weichuxilishi4");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi5IsNull() {
            addCriterion("WEICHUXILISHI5 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi5IsNotNull() {
            addCriterion("WEICHUXILISHI5 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi5EqualTo(String value) {
            addCriterion("WEICHUXILISHI5 =", value, "weichuxilishi5");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi5NotEqualTo(String value) {
            addCriterion("WEICHUXILISHI5 <>", value, "weichuxilishi5");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi5GreaterThan(String value) {
            addCriterion("WEICHUXILISHI5 >", value, "weichuxilishi5");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi5GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI5 >=", value, "weichuxilishi5");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi5LessThan(String value) {
            addCriterion("WEICHUXILISHI5 <", value, "weichuxilishi5");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi5LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI5 <=", value, "weichuxilishi5");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi5Like(String value) {
            addCriterion("WEICHUXILISHI5 like", value, "weichuxilishi5");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi5NotLike(String value) {
            addCriterion("WEICHUXILISHI5 not like", value, "weichuxilishi5");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi5In(List<String> values) {
            addCriterion("WEICHUXILISHI5 in", values, "weichuxilishi5");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi5NotIn(List<String> values) {
            addCriterion("WEICHUXILISHI5 not in", values, "weichuxilishi5");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi5Between(String value1, String value2) {
            addCriterion("WEICHUXILISHI5 between", value1, value2, "weichuxilishi5");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi5NotBetween(String value1, String value2) {
            addCriterion("WEICHUXILISHI5 not between", value1, value2, "weichuxilishi5");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi6IsNull() {
            addCriterion("WEICHUXILISHI6 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi6IsNotNull() {
            addCriterion("WEICHUXILISHI6 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi6EqualTo(String value) {
            addCriterion("WEICHUXILISHI6 =", value, "weichuxilishi6");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi6NotEqualTo(String value) {
            addCriterion("WEICHUXILISHI6 <>", value, "weichuxilishi6");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi6GreaterThan(String value) {
            addCriterion("WEICHUXILISHI6 >", value, "weichuxilishi6");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi6GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI6 >=", value, "weichuxilishi6");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi6LessThan(String value) {
            addCriterion("WEICHUXILISHI6 <", value, "weichuxilishi6");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi6LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI6 <=", value, "weichuxilishi6");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi6Like(String value) {
            addCriterion("WEICHUXILISHI6 like", value, "weichuxilishi6");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi6NotLike(String value) {
            addCriterion("WEICHUXILISHI6 not like", value, "weichuxilishi6");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi6In(List<String> values) {
            addCriterion("WEICHUXILISHI6 in", values, "weichuxilishi6");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi6NotIn(List<String> values) {
            addCriterion("WEICHUXILISHI6 not in", values, "weichuxilishi6");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi6Between(String value1, String value2) {
            addCriterion("WEICHUXILISHI6 between", value1, value2, "weichuxilishi6");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi6NotBetween(String value1, String value2) {
            addCriterion("WEICHUXILISHI6 not between", value1, value2, "weichuxilishi6");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi7IsNull() {
            addCriterion("WEICHUXILISHI7 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi7IsNotNull() {
            addCriterion("WEICHUXILISHI7 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi7EqualTo(String value) {
            addCriterion("WEICHUXILISHI7 =", value, "weichuxilishi7");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi7NotEqualTo(String value) {
            addCriterion("WEICHUXILISHI7 <>", value, "weichuxilishi7");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi7GreaterThan(String value) {
            addCriterion("WEICHUXILISHI7 >", value, "weichuxilishi7");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi7GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI7 >=", value, "weichuxilishi7");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi7LessThan(String value) {
            addCriterion("WEICHUXILISHI7 <", value, "weichuxilishi7");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi7LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI7 <=", value, "weichuxilishi7");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi7Like(String value) {
            addCriterion("WEICHUXILISHI7 like", value, "weichuxilishi7");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi7NotLike(String value) {
            addCriterion("WEICHUXILISHI7 not like", value, "weichuxilishi7");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi7In(List<String> values) {
            addCriterion("WEICHUXILISHI7 in", values, "weichuxilishi7");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi7NotIn(List<String> values) {
            addCriterion("WEICHUXILISHI7 not in", values, "weichuxilishi7");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi7Between(String value1, String value2) {
            addCriterion("WEICHUXILISHI7 between", value1, value2, "weichuxilishi7");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi7NotBetween(String value1, String value2) {
            addCriterion("WEICHUXILISHI7 not between", value1, value2, "weichuxilishi7");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi8IsNull() {
            addCriterion("WEICHUXILISHI8 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi8IsNotNull() {
            addCriterion("WEICHUXILISHI8 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi8EqualTo(String value) {
            addCriterion("WEICHUXILISHI8 =", value, "weichuxilishi8");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi8NotEqualTo(String value) {
            addCriterion("WEICHUXILISHI8 <>", value, "weichuxilishi8");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi8GreaterThan(String value) {
            addCriterion("WEICHUXILISHI8 >", value, "weichuxilishi8");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi8GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI8 >=", value, "weichuxilishi8");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi8LessThan(String value) {
            addCriterion("WEICHUXILISHI8 <", value, "weichuxilishi8");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi8LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI8 <=", value, "weichuxilishi8");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi8Like(String value) {
            addCriterion("WEICHUXILISHI8 like", value, "weichuxilishi8");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi8NotLike(String value) {
            addCriterion("WEICHUXILISHI8 not like", value, "weichuxilishi8");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi8In(List<String> values) {
            addCriterion("WEICHUXILISHI8 in", values, "weichuxilishi8");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi8NotIn(List<String> values) {
            addCriterion("WEICHUXILISHI8 not in", values, "weichuxilishi8");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi8Between(String value1, String value2) {
            addCriterion("WEICHUXILISHI8 between", value1, value2, "weichuxilishi8");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi8NotBetween(String value1, String value2) {
            addCriterion("WEICHUXILISHI8 not between", value1, value2, "weichuxilishi8");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi9IsNull() {
            addCriterion("WEICHUXILISHI9 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi9IsNotNull() {
            addCriterion("WEICHUXILISHI9 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi9EqualTo(String value) {
            addCriterion("WEICHUXILISHI9 =", value, "weichuxilishi9");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi9NotEqualTo(String value) {
            addCriterion("WEICHUXILISHI9 <>", value, "weichuxilishi9");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi9GreaterThan(String value) {
            addCriterion("WEICHUXILISHI9 >", value, "weichuxilishi9");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi9GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI9 >=", value, "weichuxilishi9");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi9LessThan(String value) {
            addCriterion("WEICHUXILISHI9 <", value, "weichuxilishi9");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi9LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI9 <=", value, "weichuxilishi9");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi9Like(String value) {
            addCriterion("WEICHUXILISHI9 like", value, "weichuxilishi9");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi9NotLike(String value) {
            addCriterion("WEICHUXILISHI9 not like", value, "weichuxilishi9");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi9In(List<String> values) {
            addCriterion("WEICHUXILISHI9 in", values, "weichuxilishi9");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi9NotIn(List<String> values) {
            addCriterion("WEICHUXILISHI9 not in", values, "weichuxilishi9");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi9Between(String value1, String value2) {
            addCriterion("WEICHUXILISHI9 between", value1, value2, "weichuxilishi9");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi9NotBetween(String value1, String value2) {
            addCriterion("WEICHUXILISHI9 not between", value1, value2, "weichuxilishi9");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi10IsNull() {
            addCriterion("WEICHUXILISHI10 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi10IsNotNull() {
            addCriterion("WEICHUXILISHI10 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi10EqualTo(String value) {
            addCriterion("WEICHUXILISHI10 =", value, "weichuxilishi10");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi10NotEqualTo(String value) {
            addCriterion("WEICHUXILISHI10 <>", value, "weichuxilishi10");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi10GreaterThan(String value) {
            addCriterion("WEICHUXILISHI10 >", value, "weichuxilishi10");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi10GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI10 >=", value, "weichuxilishi10");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi10LessThan(String value) {
            addCriterion("WEICHUXILISHI10 <", value, "weichuxilishi10");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi10LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI10 <=", value, "weichuxilishi10");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi10Like(String value) {
            addCriterion("WEICHUXILISHI10 like", value, "weichuxilishi10");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi10NotLike(String value) {
            addCriterion("WEICHUXILISHI10 not like", value, "weichuxilishi10");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi10In(List<String> values) {
            addCriterion("WEICHUXILISHI10 in", values, "weichuxilishi10");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi10NotIn(List<String> values) {
            addCriterion("WEICHUXILISHI10 not in", values, "weichuxilishi10");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi10Between(String value1, String value2) {
            addCriterion("WEICHUXILISHI10 between", value1, value2, "weichuxilishi10");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi10NotBetween(String value1, String value2) {
            addCriterion("WEICHUXILISHI10 not between", value1, value2, "weichuxilishi10");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi11IsNull() {
            addCriterion("WEICHUXILISHI11 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi11IsNotNull() {
            addCriterion("WEICHUXILISHI11 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi11EqualTo(String value) {
            addCriterion("WEICHUXILISHI11 =", value, "weichuxilishi11");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi11NotEqualTo(String value) {
            addCriterion("WEICHUXILISHI11 <>", value, "weichuxilishi11");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi11GreaterThan(String value) {
            addCriterion("WEICHUXILISHI11 >", value, "weichuxilishi11");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi11GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI11 >=", value, "weichuxilishi11");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi11LessThan(String value) {
            addCriterion("WEICHUXILISHI11 <", value, "weichuxilishi11");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi11LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI11 <=", value, "weichuxilishi11");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi11Like(String value) {
            addCriterion("WEICHUXILISHI11 like", value, "weichuxilishi11");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi11NotLike(String value) {
            addCriterion("WEICHUXILISHI11 not like", value, "weichuxilishi11");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi11In(List<String> values) {
            addCriterion("WEICHUXILISHI11 in", values, "weichuxilishi11");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi11NotIn(List<String> values) {
            addCriterion("WEICHUXILISHI11 not in", values, "weichuxilishi11");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi11Between(String value1, String value2) {
            addCriterion("WEICHUXILISHI11 between", value1, value2, "weichuxilishi11");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi11NotBetween(String value1, String value2) {
            addCriterion("WEICHUXILISHI11 not between", value1, value2, "weichuxilishi11");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi12IsNull() {
            addCriterion("WEICHUXILISHI12 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi12IsNotNull() {
            addCriterion("WEICHUXILISHI12 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi12EqualTo(String value) {
            addCriterion("WEICHUXILISHI12 =", value, "weichuxilishi12");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi12NotEqualTo(String value) {
            addCriterion("WEICHUXILISHI12 <>", value, "weichuxilishi12");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi12GreaterThan(String value) {
            addCriterion("WEICHUXILISHI12 >", value, "weichuxilishi12");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi12GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI12 >=", value, "weichuxilishi12");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi12LessThan(String value) {
            addCriterion("WEICHUXILISHI12 <", value, "weichuxilishi12");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi12LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI12 <=", value, "weichuxilishi12");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi12Like(String value) {
            addCriterion("WEICHUXILISHI12 like", value, "weichuxilishi12");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi12NotLike(String value) {
            addCriterion("WEICHUXILISHI12 not like", value, "weichuxilishi12");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi12In(List<String> values) {
            addCriterion("WEICHUXILISHI12 in", values, "weichuxilishi12");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi12NotIn(List<String> values) {
            addCriterion("WEICHUXILISHI12 not in", values, "weichuxilishi12");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi12Between(String value1, String value2) {
            addCriterion("WEICHUXILISHI12 between", value1, value2, "weichuxilishi12");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi12NotBetween(String value1, String value2) {
            addCriterion("WEICHUXILISHI12 not between", value1, value2, "weichuxilishi12");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi13IsNull() {
            addCriterion("WEICHUXILISHI13 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi13IsNotNull() {
            addCriterion("WEICHUXILISHI13 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi13EqualTo(String value) {
            addCriterion("WEICHUXILISHI13 =", value, "weichuxilishi13");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi13NotEqualTo(String value) {
            addCriterion("WEICHUXILISHI13 <>", value, "weichuxilishi13");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi13GreaterThan(String value) {
            addCriterion("WEICHUXILISHI13 >", value, "weichuxilishi13");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi13GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI13 >=", value, "weichuxilishi13");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi13LessThan(String value) {
            addCriterion("WEICHUXILISHI13 <", value, "weichuxilishi13");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi13LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI13 <=", value, "weichuxilishi13");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi13Like(String value) {
            addCriterion("WEICHUXILISHI13 like", value, "weichuxilishi13");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi13NotLike(String value) {
            addCriterion("WEICHUXILISHI13 not like", value, "weichuxilishi13");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi13In(List<String> values) {
            addCriterion("WEICHUXILISHI13 in", values, "weichuxilishi13");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi13NotIn(List<String> values) {
            addCriterion("WEICHUXILISHI13 not in", values, "weichuxilishi13");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi13Between(String value1, String value2) {
            addCriterion("WEICHUXILISHI13 between", value1, value2, "weichuxilishi13");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi13NotBetween(String value1, String value2) {
            addCriterion("WEICHUXILISHI13 not between", value1, value2, "weichuxilishi13");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi14IsNull() {
            addCriterion("WEICHUXILISHI14 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi14IsNotNull() {
            addCriterion("WEICHUXILISHI14 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi14EqualTo(String value) {
            addCriterion("WEICHUXILISHI14 =", value, "weichuxilishi14");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi14NotEqualTo(String value) {
            addCriterion("WEICHUXILISHI14 <>", value, "weichuxilishi14");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi14GreaterThan(String value) {
            addCriterion("WEICHUXILISHI14 >", value, "weichuxilishi14");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi14GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI14 >=", value, "weichuxilishi14");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi14LessThan(String value) {
            addCriterion("WEICHUXILISHI14 <", value, "weichuxilishi14");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi14LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI14 <=", value, "weichuxilishi14");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi14Like(String value) {
            addCriterion("WEICHUXILISHI14 like", value, "weichuxilishi14");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi14NotLike(String value) {
            addCriterion("WEICHUXILISHI14 not like", value, "weichuxilishi14");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi14In(List<String> values) {
            addCriterion("WEICHUXILISHI14 in", values, "weichuxilishi14");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi14NotIn(List<String> values) {
            addCriterion("WEICHUXILISHI14 not in", values, "weichuxilishi14");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi14Between(String value1, String value2) {
            addCriterion("WEICHUXILISHI14 between", value1, value2, "weichuxilishi14");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi14NotBetween(String value1, String value2) {
            addCriterion("WEICHUXILISHI14 not between", value1, value2, "weichuxilishi14");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi15IsNull() {
            addCriterion("WEICHUXILISHI15 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi15IsNotNull() {
            addCriterion("WEICHUXILISHI15 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi15EqualTo(String value) {
            addCriterion("WEICHUXILISHI15 =", value, "weichuxilishi15");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi15NotEqualTo(String value) {
            addCriterion("WEICHUXILISHI15 <>", value, "weichuxilishi15");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi15GreaterThan(String value) {
            addCriterion("WEICHUXILISHI15 >", value, "weichuxilishi15");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi15GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI15 >=", value, "weichuxilishi15");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi15LessThan(String value) {
            addCriterion("WEICHUXILISHI15 <", value, "weichuxilishi15");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi15LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI15 <=", value, "weichuxilishi15");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi15Like(String value) {
            addCriterion("WEICHUXILISHI15 like", value, "weichuxilishi15");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi15NotLike(String value) {
            addCriterion("WEICHUXILISHI15 not like", value, "weichuxilishi15");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi15In(List<String> values) {
            addCriterion("WEICHUXILISHI15 in", values, "weichuxilishi15");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi15NotIn(List<String> values) {
            addCriterion("WEICHUXILISHI15 not in", values, "weichuxilishi15");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi15Between(String value1, String value2) {
            addCriterion("WEICHUXILISHI15 between", value1, value2, "weichuxilishi15");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi15NotBetween(String value1, String value2) {
            addCriterion("WEICHUXILISHI15 not between", value1, value2, "weichuxilishi15");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi16IsNull() {
            addCriterion("WEICHUXILISHI16 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi16IsNotNull() {
            addCriterion("WEICHUXILISHI16 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi16EqualTo(String value) {
            addCriterion("WEICHUXILISHI16 =", value, "weichuxilishi16");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi16NotEqualTo(String value) {
            addCriterion("WEICHUXILISHI16 <>", value, "weichuxilishi16");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi16GreaterThan(String value) {
            addCriterion("WEICHUXILISHI16 >", value, "weichuxilishi16");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi16GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI16 >=", value, "weichuxilishi16");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi16LessThan(String value) {
            addCriterion("WEICHUXILISHI16 <", value, "weichuxilishi16");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi16LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI16 <=", value, "weichuxilishi16");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi16Like(String value) {
            addCriterion("WEICHUXILISHI16 like", value, "weichuxilishi16");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi16NotLike(String value) {
            addCriterion("WEICHUXILISHI16 not like", value, "weichuxilishi16");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi16In(List<String> values) {
            addCriterion("WEICHUXILISHI16 in", values, "weichuxilishi16");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi16NotIn(List<String> values) {
            addCriterion("WEICHUXILISHI16 not in", values, "weichuxilishi16");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi16Between(String value1, String value2) {
            addCriterion("WEICHUXILISHI16 between", value1, value2, "weichuxilishi16");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi16NotBetween(String value1, String value2) {
            addCriterion("WEICHUXILISHI16 not between", value1, value2, "weichuxilishi16");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi17IsNull() {
            addCriterion("WEICHUXILISHI17 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi17IsNotNull() {
            addCriterion("WEICHUXILISHI17 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi17EqualTo(String value) {
            addCriterion("WEICHUXILISHI17 =", value, "weichuxilishi17");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi17NotEqualTo(String value) {
            addCriterion("WEICHUXILISHI17 <>", value, "weichuxilishi17");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi17GreaterThan(String value) {
            addCriterion("WEICHUXILISHI17 >", value, "weichuxilishi17");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi17GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI17 >=", value, "weichuxilishi17");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi17LessThan(String value) {
            addCriterion("WEICHUXILISHI17 <", value, "weichuxilishi17");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi17LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI17 <=", value, "weichuxilishi17");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi17Like(String value) {
            addCriterion("WEICHUXILISHI17 like", value, "weichuxilishi17");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi17NotLike(String value) {
            addCriterion("WEICHUXILISHI17 not like", value, "weichuxilishi17");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi17In(List<String> values) {
            addCriterion("WEICHUXILISHI17 in", values, "weichuxilishi17");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi17NotIn(List<String> values) {
            addCriterion("WEICHUXILISHI17 not in", values, "weichuxilishi17");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi17Between(String value1, String value2) {
            addCriterion("WEICHUXILISHI17 between", value1, value2, "weichuxilishi17");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi17NotBetween(String value1, String value2) {
            addCriterion("WEICHUXILISHI17 not between", value1, value2, "weichuxilishi17");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi18IsNull() {
            addCriterion("WEICHUXILISHI18 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi18IsNotNull() {
            addCriterion("WEICHUXILISHI18 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi18EqualTo(String value) {
            addCriterion("WEICHUXILISHI18 =", value, "weichuxilishi18");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi18NotEqualTo(String value) {
            addCriterion("WEICHUXILISHI18 <>", value, "weichuxilishi18");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi18GreaterThan(String value) {
            addCriterion("WEICHUXILISHI18 >", value, "weichuxilishi18");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi18GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI18 >=", value, "weichuxilishi18");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi18LessThan(String value) {
            addCriterion("WEICHUXILISHI18 <", value, "weichuxilishi18");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi18LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI18 <=", value, "weichuxilishi18");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi18Like(String value) {
            addCriterion("WEICHUXILISHI18 like", value, "weichuxilishi18");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi18NotLike(String value) {
            addCriterion("WEICHUXILISHI18 not like", value, "weichuxilishi18");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi18In(List<String> values) {
            addCriterion("WEICHUXILISHI18 in", values, "weichuxilishi18");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi18NotIn(List<String> values) {
            addCriterion("WEICHUXILISHI18 not in", values, "weichuxilishi18");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi18Between(String value1, String value2) {
            addCriterion("WEICHUXILISHI18 between", value1, value2, "weichuxilishi18");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi18NotBetween(String value1, String value2) {
            addCriterion("WEICHUXILISHI18 not between", value1, value2, "weichuxilishi18");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi19IsNull() {
            addCriterion("WEICHUXILISHI19 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi19IsNotNull() {
            addCriterion("WEICHUXILISHI19 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi19EqualTo(String value) {
            addCriterion("WEICHUXILISHI19 =", value, "weichuxilishi19");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi19NotEqualTo(String value) {
            addCriterion("WEICHUXILISHI19 <>", value, "weichuxilishi19");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi19GreaterThan(String value) {
            addCriterion("WEICHUXILISHI19 >", value, "weichuxilishi19");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi19GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI19 >=", value, "weichuxilishi19");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi19LessThan(String value) {
            addCriterion("WEICHUXILISHI19 <", value, "weichuxilishi19");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi19LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI19 <=", value, "weichuxilishi19");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi19Like(String value) {
            addCriterion("WEICHUXILISHI19 like", value, "weichuxilishi19");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi19NotLike(String value) {
            addCriterion("WEICHUXILISHI19 not like", value, "weichuxilishi19");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi19In(List<String> values) {
            addCriterion("WEICHUXILISHI19 in", values, "weichuxilishi19");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi19NotIn(List<String> values) {
            addCriterion("WEICHUXILISHI19 not in", values, "weichuxilishi19");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi19Between(String value1, String value2) {
            addCriterion("WEICHUXILISHI19 between", value1, value2, "weichuxilishi19");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi19NotBetween(String value1, String value2) {
            addCriterion("WEICHUXILISHI19 not between", value1, value2, "weichuxilishi19");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi20IsNull() {
            addCriterion("WEICHUXILISHI20 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi20IsNotNull() {
            addCriterion("WEICHUXILISHI20 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi20EqualTo(String value) {
            addCriterion("WEICHUXILISHI20 =", value, "weichuxilishi20");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi20NotEqualTo(String value) {
            addCriterion("WEICHUXILISHI20 <>", value, "weichuxilishi20");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi20GreaterThan(String value) {
            addCriterion("WEICHUXILISHI20 >", value, "weichuxilishi20");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi20GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI20 >=", value, "weichuxilishi20");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi20LessThan(String value) {
            addCriterion("WEICHUXILISHI20 <", value, "weichuxilishi20");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi20LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI20 <=", value, "weichuxilishi20");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi20Like(String value) {
            addCriterion("WEICHUXILISHI20 like", value, "weichuxilishi20");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi20NotLike(String value) {
            addCriterion("WEICHUXILISHI20 not like", value, "weichuxilishi20");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi20In(List<String> values) {
            addCriterion("WEICHUXILISHI20 in", values, "weichuxilishi20");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi20NotIn(List<String> values) {
            addCriterion("WEICHUXILISHI20 not in", values, "weichuxilishi20");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi20Between(String value1, String value2) {
            addCriterion("WEICHUXILISHI20 between", value1, value2, "weichuxilishi20");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi20NotBetween(String value1, String value2) {
            addCriterion("WEICHUXILISHI20 not between", value1, value2, "weichuxilishi20");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi21IsNull() {
            addCriterion("WEICHUXILISHI21 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi21IsNotNull() {
            addCriterion("WEICHUXILISHI21 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi21EqualTo(String value) {
            addCriterion("WEICHUXILISHI21 =", value, "weichuxilishi21");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi21NotEqualTo(String value) {
            addCriterion("WEICHUXILISHI21 <>", value, "weichuxilishi21");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi21GreaterThan(String value) {
            addCriterion("WEICHUXILISHI21 >", value, "weichuxilishi21");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi21GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI21 >=", value, "weichuxilishi21");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi21LessThan(String value) {
            addCriterion("WEICHUXILISHI21 <", value, "weichuxilishi21");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi21LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI21 <=", value, "weichuxilishi21");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi21Like(String value) {
            addCriterion("WEICHUXILISHI21 like", value, "weichuxilishi21");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi21NotLike(String value) {
            addCriterion("WEICHUXILISHI21 not like", value, "weichuxilishi21");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi21In(List<String> values) {
            addCriterion("WEICHUXILISHI21 in", values, "weichuxilishi21");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi21NotIn(List<String> values) {
            addCriterion("WEICHUXILISHI21 not in", values, "weichuxilishi21");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi21Between(String value1, String value2) {
            addCriterion("WEICHUXILISHI21 between", value1, value2, "weichuxilishi21");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi21NotBetween(String value1, String value2) {
            addCriterion("WEICHUXILISHI21 not between", value1, value2, "weichuxilishi21");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi22IsNull() {
            addCriterion("WEICHUXILISHI22 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi22IsNotNull() {
            addCriterion("WEICHUXILISHI22 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi22EqualTo(String value) {
            addCriterion("WEICHUXILISHI22 =", value, "weichuxilishi22");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi22NotEqualTo(String value) {
            addCriterion("WEICHUXILISHI22 <>", value, "weichuxilishi22");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi22GreaterThan(String value) {
            addCriterion("WEICHUXILISHI22 >", value, "weichuxilishi22");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi22GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI22 >=", value, "weichuxilishi22");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi22LessThan(String value) {
            addCriterion("WEICHUXILISHI22 <", value, "weichuxilishi22");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi22LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI22 <=", value, "weichuxilishi22");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi22Like(String value) {
            addCriterion("WEICHUXILISHI22 like", value, "weichuxilishi22");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi22NotLike(String value) {
            addCriterion("WEICHUXILISHI22 not like", value, "weichuxilishi22");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi22In(List<String> values) {
            addCriterion("WEICHUXILISHI22 in", values, "weichuxilishi22");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi22NotIn(List<String> values) {
            addCriterion("WEICHUXILISHI22 not in", values, "weichuxilishi22");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi22Between(String value1, String value2) {
            addCriterion("WEICHUXILISHI22 between", value1, value2, "weichuxilishi22");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi22NotBetween(String value1, String value2) {
            addCriterion("WEICHUXILISHI22 not between", value1, value2, "weichuxilishi22");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi23IsNull() {
            addCriterion("WEICHUXILISHI23 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi23IsNotNull() {
            addCriterion("WEICHUXILISHI23 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi23EqualTo(String value) {
            addCriterion("WEICHUXILISHI23 =", value, "weichuxilishi23");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi23NotEqualTo(String value) {
            addCriterion("WEICHUXILISHI23 <>", value, "weichuxilishi23");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi23GreaterThan(String value) {
            addCriterion("WEICHUXILISHI23 >", value, "weichuxilishi23");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi23GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI23 >=", value, "weichuxilishi23");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi23LessThan(String value) {
            addCriterion("WEICHUXILISHI23 <", value, "weichuxilishi23");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi23LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI23 <=", value, "weichuxilishi23");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi23Like(String value) {
            addCriterion("WEICHUXILISHI23 like", value, "weichuxilishi23");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi23NotLike(String value) {
            addCriterion("WEICHUXILISHI23 not like", value, "weichuxilishi23");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi23In(List<String> values) {
            addCriterion("WEICHUXILISHI23 in", values, "weichuxilishi23");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi23NotIn(List<String> values) {
            addCriterion("WEICHUXILISHI23 not in", values, "weichuxilishi23");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi23Between(String value1, String value2) {
            addCriterion("WEICHUXILISHI23 between", value1, value2, "weichuxilishi23");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi23NotBetween(String value1, String value2) {
            addCriterion("WEICHUXILISHI23 not between", value1, value2, "weichuxilishi23");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi24IsNull() {
            addCriterion("WEICHUXILISHI24 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi24IsNotNull() {
            addCriterion("WEICHUXILISHI24 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi24EqualTo(String value) {
            addCriterion("WEICHUXILISHI24 =", value, "weichuxilishi24");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi24NotEqualTo(String value) {
            addCriterion("WEICHUXILISHI24 <>", value, "weichuxilishi24");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi24GreaterThan(String value) {
            addCriterion("WEICHUXILISHI24 >", value, "weichuxilishi24");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi24GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI24 >=", value, "weichuxilishi24");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi24LessThan(String value) {
            addCriterion("WEICHUXILISHI24 <", value, "weichuxilishi24");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi24LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI24 <=", value, "weichuxilishi24");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi24Like(String value) {
            addCriterion("WEICHUXILISHI24 like", value, "weichuxilishi24");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi24NotLike(String value) {
            addCriterion("WEICHUXILISHI24 not like", value, "weichuxilishi24");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi24In(List<String> values) {
            addCriterion("WEICHUXILISHI24 in", values, "weichuxilishi24");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi24NotIn(List<String> values) {
            addCriterion("WEICHUXILISHI24 not in", values, "weichuxilishi24");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi24Between(String value1, String value2) {
            addCriterion("WEICHUXILISHI24 between", value1, value2, "weichuxilishi24");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi24NotBetween(String value1, String value2) {
            addCriterion("WEICHUXILISHI24 not between", value1, value2, "weichuxilishi24");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi25IsNull() {
            addCriterion("WEICHUXILISHI25 is null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi25IsNotNull() {
            addCriterion("WEICHUXILISHI25 is not null");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi25EqualTo(String value) {
            addCriterion("WEICHUXILISHI25 =", value, "weichuxilishi25");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi25NotEqualTo(String value) {
            addCriterion("WEICHUXILISHI25 <>", value, "weichuxilishi25");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi25GreaterThan(String value) {
            addCriterion("WEICHUXILISHI25 >", value, "weichuxilishi25");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi25GreaterThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI25 >=", value, "weichuxilishi25");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi25LessThan(String value) {
            addCriterion("WEICHUXILISHI25 <", value, "weichuxilishi25");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi25LessThanOrEqualTo(String value) {
            addCriterion("WEICHUXILISHI25 <=", value, "weichuxilishi25");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi25Like(String value) {
            addCriterion("WEICHUXILISHI25 like", value, "weichuxilishi25");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi25NotLike(String value) {
            addCriterion("WEICHUXILISHI25 not like", value, "weichuxilishi25");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi25In(List<String> values) {
            addCriterion("WEICHUXILISHI25 in", values, "weichuxilishi25");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi25NotIn(List<String> values) {
            addCriterion("WEICHUXILISHI25 not in", values, "weichuxilishi25");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi25Between(String value1, String value2) {
            addCriterion("WEICHUXILISHI25 between", value1, value2, "weichuxilishi25");
            return (Criteria) this;
        }

        public Criteria andWeichuxilishi25NotBetween(String value1, String value2) {
            addCriterion("WEICHUXILISHI25 not between", value1, value2, "weichuxilishi25");
            return (Criteria) this;
        }

        public Criteria andShifoudadaoIsNull() {
            addCriterion("SHIFOUDADAO is null");
            return (Criteria) this;
        }

        public Criteria andShifoudadaoIsNotNull() {
            addCriterion("SHIFOUDADAO is not null");
            return (Criteria) this;
        }

        public Criteria andShifoudadaoEqualTo(Short value) {
            addCriterion("SHIFOUDADAO =", value, "shifoudadao");
            return (Criteria) this;
        }

        public Criteria andShifoudadaoNotEqualTo(Short value) {
            addCriterion("SHIFOUDADAO <>", value, "shifoudadao");
            return (Criteria) this;
        }

        public Criteria andShifoudadaoGreaterThan(Short value) {
            addCriterion("SHIFOUDADAO >", value, "shifoudadao");
            return (Criteria) this;
        }

        public Criteria andShifoudadaoGreaterThanOrEqualTo(Short value) {
            addCriterion("SHIFOUDADAO >=", value, "shifoudadao");
            return (Criteria) this;
        }

        public Criteria andShifoudadaoLessThan(Short value) {
            addCriterion("SHIFOUDADAO <", value, "shifoudadao");
            return (Criteria) this;
        }

        public Criteria andShifoudadaoLessThanOrEqualTo(Short value) {
            addCriterion("SHIFOUDADAO <=", value, "shifoudadao");
            return (Criteria) this;
        }

        public Criteria andShifoudadaoIn(List<Short> values) {
            addCriterion("SHIFOUDADAO in", values, "shifoudadao");
            return (Criteria) this;
        }

        public Criteria andShifoudadaoNotIn(List<Short> values) {
            addCriterion("SHIFOUDADAO not in", values, "shifoudadao");
            return (Criteria) this;
        }

        public Criteria andShifoudadaoBetween(Short value1, Short value2) {
            addCriterion("SHIFOUDADAO between", value1, value2, "shifoudadao");
            return (Criteria) this;
        }

        public Criteria andShifoudadaoNotBetween(Short value1, Short value2) {
            addCriterion("SHIFOUDADAO not between", value1, value2, "shifoudadao");
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