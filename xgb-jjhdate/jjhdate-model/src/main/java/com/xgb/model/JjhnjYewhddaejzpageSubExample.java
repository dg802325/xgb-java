package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JjhnjYewhddaejzpageSubExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JjhnjYewhddaejzpageSubExample() {
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

        public Criteria andJuanzengrenIsNull() {
            addCriterion("JUANZENGREN is null");
            return (Criteria) this;
        }

        public Criteria andJuanzengrenIsNotNull() {
            addCriterion("JUANZENGREN is not null");
            return (Criteria) this;
        }

        public Criteria andJuanzengrenEqualTo(String value) {
            addCriterion("JUANZENGREN =", value, "juanzengren");
            return (Criteria) this;
        }

        public Criteria andJuanzengrenNotEqualTo(String value) {
            addCriterion("JUANZENGREN <>", value, "juanzengren");
            return (Criteria) this;
        }

        public Criteria andJuanzengrenGreaterThan(String value) {
            addCriterion("JUANZENGREN >", value, "juanzengren");
            return (Criteria) this;
        }

        public Criteria andJuanzengrenGreaterThanOrEqualTo(String value) {
            addCriterion("JUANZENGREN >=", value, "juanzengren");
            return (Criteria) this;
        }

        public Criteria andJuanzengrenLessThan(String value) {
            addCriterion("JUANZENGREN <", value, "juanzengren");
            return (Criteria) this;
        }

        public Criteria andJuanzengrenLessThanOrEqualTo(String value) {
            addCriterion("JUANZENGREN <=", value, "juanzengren");
            return (Criteria) this;
        }

        public Criteria andJuanzengrenLike(String value) {
            addCriterion("JUANZENGREN like", value, "juanzengren");
            return (Criteria) this;
        }

        public Criteria andJuanzengrenNotLike(String value) {
            addCriterion("JUANZENGREN not like", value, "juanzengren");
            return (Criteria) this;
        }

        public Criteria andJuanzengrenIn(List<String> values) {
            addCriterion("JUANZENGREN in", values, "juanzengren");
            return (Criteria) this;
        }

        public Criteria andJuanzengrenNotIn(List<String> values) {
            addCriterion("JUANZENGREN not in", values, "juanzengren");
            return (Criteria) this;
        }

        public Criteria andJuanzengrenBetween(String value1, String value2) {
            addCriterion("JUANZENGREN between", value1, value2, "juanzengren");
            return (Criteria) this;
        }

        public Criteria andJuanzengrenNotBetween(String value1, String value2) {
            addCriterion("JUANZENGREN not between", value1, value2, "juanzengren");
            return (Criteria) this;
        }

        public Criteria andBennianjuanzengeIsNull() {
            addCriterion("BENNIANJUANZENGE is null");
            return (Criteria) this;
        }

        public Criteria andBennianjuanzengeIsNotNull() {
            addCriterion("BENNIANJUANZENGE is not null");
            return (Criteria) this;
        }

        public Criteria andBennianjuanzengeEqualTo(String value) {
            addCriterion("BENNIANJUANZENGE =", value, "bennianjuanzenge");
            return (Criteria) this;
        }

        public Criteria andBennianjuanzengeNotEqualTo(String value) {
            addCriterion("BENNIANJUANZENGE <>", value, "bennianjuanzenge");
            return (Criteria) this;
        }

        public Criteria andBennianjuanzengeGreaterThan(String value) {
            addCriterion("BENNIANJUANZENGE >", value, "bennianjuanzenge");
            return (Criteria) this;
        }

        public Criteria andBennianjuanzengeGreaterThanOrEqualTo(String value) {
            addCriterion("BENNIANJUANZENGE >=", value, "bennianjuanzenge");
            return (Criteria) this;
        }

        public Criteria andBennianjuanzengeLessThan(String value) {
            addCriterion("BENNIANJUANZENGE <", value, "bennianjuanzenge");
            return (Criteria) this;
        }

        public Criteria andBennianjuanzengeLessThanOrEqualTo(String value) {
            addCriterion("BENNIANJUANZENGE <=", value, "bennianjuanzenge");
            return (Criteria) this;
        }

        public Criteria andBennianjuanzengeLike(String value) {
            addCriterion("BENNIANJUANZENGE like", value, "bennianjuanzenge");
            return (Criteria) this;
        }

        public Criteria andBennianjuanzengeNotLike(String value) {
            addCriterion("BENNIANJUANZENGE not like", value, "bennianjuanzenge");
            return (Criteria) this;
        }

        public Criteria andBennianjuanzengeIn(List<String> values) {
            addCriterion("BENNIANJUANZENGE in", values, "bennianjuanzenge");
            return (Criteria) this;
        }

        public Criteria andBennianjuanzengeNotIn(List<String> values) {
            addCriterion("BENNIANJUANZENGE not in", values, "bennianjuanzenge");
            return (Criteria) this;
        }

        public Criteria andBennianjuanzengeBetween(String value1, String value2) {
            addCriterion("BENNIANJUANZENGE between", value1, value2, "bennianjuanzenge");
            return (Criteria) this;
        }

        public Criteria andBennianjuanzengeNotBetween(String value1, String value2) {
            addCriterion("BENNIANJUANZENGE not between", value1, value2, "bennianjuanzenge");
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

        public Criteria andJuankuanIsNull() {
            addCriterion("JUANKUAN is null");
            return (Criteria) this;
        }

        public Criteria andJuankuanIsNotNull() {
            addCriterion("JUANKUAN is not null");
            return (Criteria) this;
        }

        public Criteria andJuankuanEqualTo(BigDecimal value) {
            addCriterion("JUANKUAN =", value, "juankuan");
            return (Criteria) this;
        }

        public Criteria andJuankuanNotEqualTo(BigDecimal value) {
            addCriterion("JUANKUAN <>", value, "juankuan");
            return (Criteria) this;
        }

        public Criteria andJuankuanGreaterThan(BigDecimal value) {
            addCriterion("JUANKUAN >", value, "juankuan");
            return (Criteria) this;
        }

        public Criteria andJuankuanGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JUANKUAN >=", value, "juankuan");
            return (Criteria) this;
        }

        public Criteria andJuankuanLessThan(BigDecimal value) {
            addCriterion("JUANKUAN <", value, "juankuan");
            return (Criteria) this;
        }

        public Criteria andJuankuanLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JUANKUAN <=", value, "juankuan");
            return (Criteria) this;
        }

        public Criteria andJuankuanIn(List<BigDecimal> values) {
            addCriterion("JUANKUAN in", values, "juankuan");
            return (Criteria) this;
        }

        public Criteria andJuankuanNotIn(List<BigDecimal> values) {
            addCriterion("JUANKUAN not in", values, "juankuan");
            return (Criteria) this;
        }

        public Criteria andJuankuanBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JUANKUAN between", value1, value2, "juankuan");
            return (Criteria) this;
        }

        public Criteria andJuankuanNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JUANKUAN not between", value1, value2, "juankuan");
            return (Criteria) this;
        }

        public Criteria andJuankuanyongtuIsNull() {
            addCriterion("JUANKUANYONGTU is null");
            return (Criteria) this;
        }

        public Criteria andJuankuanyongtuIsNotNull() {
            addCriterion("JUANKUANYONGTU is not null");
            return (Criteria) this;
        }

        public Criteria andJuankuanyongtuEqualTo(String value) {
            addCriterion("JUANKUANYONGTU =", value, "juankuanyongtu");
            return (Criteria) this;
        }

        public Criteria andJuankuanyongtuNotEqualTo(String value) {
            addCriterion("JUANKUANYONGTU <>", value, "juankuanyongtu");
            return (Criteria) this;
        }

        public Criteria andJuankuanyongtuGreaterThan(String value) {
            addCriterion("JUANKUANYONGTU >", value, "juankuanyongtu");
            return (Criteria) this;
        }

        public Criteria andJuankuanyongtuGreaterThanOrEqualTo(String value) {
            addCriterion("JUANKUANYONGTU >=", value, "juankuanyongtu");
            return (Criteria) this;
        }

        public Criteria andJuankuanyongtuLessThan(String value) {
            addCriterion("JUANKUANYONGTU <", value, "juankuanyongtu");
            return (Criteria) this;
        }

        public Criteria andJuankuanyongtuLessThanOrEqualTo(String value) {
            addCriterion("JUANKUANYONGTU <=", value, "juankuanyongtu");
            return (Criteria) this;
        }

        public Criteria andJuankuanyongtuLike(String value) {
            addCriterion("JUANKUANYONGTU like", value, "juankuanyongtu");
            return (Criteria) this;
        }

        public Criteria andJuankuanyongtuNotLike(String value) {
            addCriterion("JUANKUANYONGTU not like", value, "juankuanyongtu");
            return (Criteria) this;
        }

        public Criteria andJuankuanyongtuIn(List<String> values) {
            addCriterion("JUANKUANYONGTU in", values, "juankuanyongtu");
            return (Criteria) this;
        }

        public Criteria andJuankuanyongtuNotIn(List<String> values) {
            addCriterion("JUANKUANYONGTU not in", values, "juankuanyongtu");
            return (Criteria) this;
        }

        public Criteria andJuankuanyongtuBetween(String value1, String value2) {
            addCriterion("JUANKUANYONGTU between", value1, value2, "juankuanyongtu");
            return (Criteria) this;
        }

        public Criteria andJuankuanyongtuNotBetween(String value1, String value2) {
            addCriterion("JUANKUANYONGTU not between", value1, value2, "juankuanyongtu");
            return (Criteria) this;
        }

        public Criteria andJuanwuIsNull() {
            addCriterion("JUANWU is null");
            return (Criteria) this;
        }

        public Criteria andJuanwuIsNotNull() {
            addCriterion("JUANWU is not null");
            return (Criteria) this;
        }

        public Criteria andJuanwuEqualTo(BigDecimal value) {
            addCriterion("JUANWU =", value, "juanwu");
            return (Criteria) this;
        }

        public Criteria andJuanwuNotEqualTo(BigDecimal value) {
            addCriterion("JUANWU <>", value, "juanwu");
            return (Criteria) this;
        }

        public Criteria andJuanwuGreaterThan(BigDecimal value) {
            addCriterion("JUANWU >", value, "juanwu");
            return (Criteria) this;
        }

        public Criteria andJuanwuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JUANWU >=", value, "juanwu");
            return (Criteria) this;
        }

        public Criteria andJuanwuLessThan(BigDecimal value) {
            addCriterion("JUANWU <", value, "juanwu");
            return (Criteria) this;
        }

        public Criteria andJuanwuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JUANWU <=", value, "juanwu");
            return (Criteria) this;
        }

        public Criteria andJuanwuIn(List<BigDecimal> values) {
            addCriterion("JUANWU in", values, "juanwu");
            return (Criteria) this;
        }

        public Criteria andJuanwuNotIn(List<BigDecimal> values) {
            addCriterion("JUANWU not in", values, "juanwu");
            return (Criteria) this;
        }

        public Criteria andJuanwuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JUANWU between", value1, value2, "juanwu");
            return (Criteria) this;
        }

        public Criteria andJuanwuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JUANWU not between", value1, value2, "juanwu");
            return (Criteria) this;
        }

        public Criteria andJuanwuyongtuIsNull() {
            addCriterion("JUANWUYONGTU is null");
            return (Criteria) this;
        }

        public Criteria andJuanwuyongtuIsNotNull() {
            addCriterion("JUANWUYONGTU is not null");
            return (Criteria) this;
        }

        public Criteria andJuanwuyongtuEqualTo(String value) {
            addCriterion("JUANWUYONGTU =", value, "juanwuyongtu");
            return (Criteria) this;
        }

        public Criteria andJuanwuyongtuNotEqualTo(String value) {
            addCriterion("JUANWUYONGTU <>", value, "juanwuyongtu");
            return (Criteria) this;
        }

        public Criteria andJuanwuyongtuGreaterThan(String value) {
            addCriterion("JUANWUYONGTU >", value, "juanwuyongtu");
            return (Criteria) this;
        }

        public Criteria andJuanwuyongtuGreaterThanOrEqualTo(String value) {
            addCriterion("JUANWUYONGTU >=", value, "juanwuyongtu");
            return (Criteria) this;
        }

        public Criteria andJuanwuyongtuLessThan(String value) {
            addCriterion("JUANWUYONGTU <", value, "juanwuyongtu");
            return (Criteria) this;
        }

        public Criteria andJuanwuyongtuLessThanOrEqualTo(String value) {
            addCriterion("JUANWUYONGTU <=", value, "juanwuyongtu");
            return (Criteria) this;
        }

        public Criteria andJuanwuyongtuLike(String value) {
            addCriterion("JUANWUYONGTU like", value, "juanwuyongtu");
            return (Criteria) this;
        }

        public Criteria andJuanwuyongtuNotLike(String value) {
            addCriterion("JUANWUYONGTU not like", value, "juanwuyongtu");
            return (Criteria) this;
        }

        public Criteria andJuanwuyongtuIn(List<String> values) {
            addCriterion("JUANWUYONGTU in", values, "juanwuyongtu");
            return (Criteria) this;
        }

        public Criteria andJuanwuyongtuNotIn(List<String> values) {
            addCriterion("JUANWUYONGTU not in", values, "juanwuyongtu");
            return (Criteria) this;
        }

        public Criteria andJuanwuyongtuBetween(String value1, String value2) {
            addCriterion("JUANWUYONGTU between", value1, value2, "juanwuyongtu");
            return (Criteria) this;
        }

        public Criteria andJuanwuyongtuNotBetween(String value1, String value2) {
            addCriterion("JUANWUYONGTU not between", value1, value2, "juanwuyongtu");
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