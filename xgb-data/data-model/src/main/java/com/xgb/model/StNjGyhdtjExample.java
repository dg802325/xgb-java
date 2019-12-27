package com.xgb.model;

import java.util.ArrayList;
import java.util.List;

public class StNjGyhdtjExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StNjGyhdtjExample() {
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

        public Criteria andZongshouru1IsNull() {
            addCriterion("ZONGSHOURU1 is null");
            return (Criteria) this;
        }

        public Criteria andZongshouru1IsNotNull() {
            addCriterion("ZONGSHOURU1 is not null");
            return (Criteria) this;
        }

        public Criteria andZongshouru1EqualTo(String value) {
            addCriterion("ZONGSHOURU1 =", value, "zongshouru1");
            return (Criteria) this;
        }

        public Criteria andZongshouru1NotEqualTo(String value) {
            addCriterion("ZONGSHOURU1 <>", value, "zongshouru1");
            return (Criteria) this;
        }

        public Criteria andZongshouru1GreaterThan(String value) {
            addCriterion("ZONGSHOURU1 >", value, "zongshouru1");
            return (Criteria) this;
        }

        public Criteria andZongshouru1GreaterThanOrEqualTo(String value) {
            addCriterion("ZONGSHOURU1 >=", value, "zongshouru1");
            return (Criteria) this;
        }

        public Criteria andZongshouru1LessThan(String value) {
            addCriterion("ZONGSHOURU1 <", value, "zongshouru1");
            return (Criteria) this;
        }

        public Criteria andZongshouru1LessThanOrEqualTo(String value) {
            addCriterion("ZONGSHOURU1 <=", value, "zongshouru1");
            return (Criteria) this;
        }

        public Criteria andZongshouru1Like(String value) {
            addCriterion("ZONGSHOURU1 like", value, "zongshouru1");
            return (Criteria) this;
        }

        public Criteria andZongshouru1NotLike(String value) {
            addCriterion("ZONGSHOURU1 not like", value, "zongshouru1");
            return (Criteria) this;
        }

        public Criteria andZongshouru1In(List<String> values) {
            addCriterion("ZONGSHOURU1 in", values, "zongshouru1");
            return (Criteria) this;
        }

        public Criteria andZongshouru1NotIn(List<String> values) {
            addCriterion("ZONGSHOURU1 not in", values, "zongshouru1");
            return (Criteria) this;
        }

        public Criteria andZongshouru1Between(String value1, String value2) {
            addCriterion("ZONGSHOURU1 between", value1, value2, "zongshouru1");
            return (Criteria) this;
        }

        public Criteria andZongshouru1NotBetween(String value1, String value2) {
            addCriterion("ZONGSHOURU1 not between", value1, value2, "zongshouru1");
            return (Criteria) this;
        }

        public Criteria andZongzhichu1IsNull() {
            addCriterion("ZONGZHICHU1 is null");
            return (Criteria) this;
        }

        public Criteria andZongzhichu1IsNotNull() {
            addCriterion("ZONGZHICHU1 is not null");
            return (Criteria) this;
        }

        public Criteria andZongzhichu1EqualTo(String value) {
            addCriterion("ZONGZHICHU1 =", value, "zongzhichu1");
            return (Criteria) this;
        }

        public Criteria andZongzhichu1NotEqualTo(String value) {
            addCriterion("ZONGZHICHU1 <>", value, "zongzhichu1");
            return (Criteria) this;
        }

        public Criteria andZongzhichu1GreaterThan(String value) {
            addCriterion("ZONGZHICHU1 >", value, "zongzhichu1");
            return (Criteria) this;
        }

        public Criteria andZongzhichu1GreaterThanOrEqualTo(String value) {
            addCriterion("ZONGZHICHU1 >=", value, "zongzhichu1");
            return (Criteria) this;
        }

        public Criteria andZongzhichu1LessThan(String value) {
            addCriterion("ZONGZHICHU1 <", value, "zongzhichu1");
            return (Criteria) this;
        }

        public Criteria andZongzhichu1LessThanOrEqualTo(String value) {
            addCriterion("ZONGZHICHU1 <=", value, "zongzhichu1");
            return (Criteria) this;
        }

        public Criteria andZongzhichu1Like(String value) {
            addCriterion("ZONGZHICHU1 like", value, "zongzhichu1");
            return (Criteria) this;
        }

        public Criteria andZongzhichu1NotLike(String value) {
            addCriterion("ZONGZHICHU1 not like", value, "zongzhichu1");
            return (Criteria) this;
        }

        public Criteria andZongzhichu1In(List<String> values) {
            addCriterion("ZONGZHICHU1 in", values, "zongzhichu1");
            return (Criteria) this;
        }

        public Criteria andZongzhichu1NotIn(List<String> values) {
            addCriterion("ZONGZHICHU1 not in", values, "zongzhichu1");
            return (Criteria) this;
        }

        public Criteria andZongzhichu1Between(String value1, String value2) {
            addCriterion("ZONGZHICHU1 between", value1, value2, "zongzhichu1");
            return (Criteria) this;
        }

        public Criteria andZongzhichu1NotBetween(String value1, String value2) {
            addCriterion("ZONGZHICHU1 not between", value1, value2, "zongzhichu1");
            return (Criteria) this;
        }

        public Criteria andZhichu1IsNull() {
            addCriterion("ZHICHU1 is null");
            return (Criteria) this;
        }

        public Criteria andZhichu1IsNotNull() {
            addCriterion("ZHICHU1 is not null");
            return (Criteria) this;
        }

        public Criteria andZhichu1EqualTo(String value) {
            addCriterion("ZHICHU1 =", value, "zhichu1");
            return (Criteria) this;
        }

        public Criteria andZhichu1NotEqualTo(String value) {
            addCriterion("ZHICHU1 <>", value, "zhichu1");
            return (Criteria) this;
        }

        public Criteria andZhichu1GreaterThan(String value) {
            addCriterion("ZHICHU1 >", value, "zhichu1");
            return (Criteria) this;
        }

        public Criteria andZhichu1GreaterThanOrEqualTo(String value) {
            addCriterion("ZHICHU1 >=", value, "zhichu1");
            return (Criteria) this;
        }

        public Criteria andZhichu1LessThan(String value) {
            addCriterion("ZHICHU1 <", value, "zhichu1");
            return (Criteria) this;
        }

        public Criteria andZhichu1LessThanOrEqualTo(String value) {
            addCriterion("ZHICHU1 <=", value, "zhichu1");
            return (Criteria) this;
        }

        public Criteria andZhichu1Like(String value) {
            addCriterion("ZHICHU1 like", value, "zhichu1");
            return (Criteria) this;
        }

        public Criteria andZhichu1NotLike(String value) {
            addCriterion("ZHICHU1 not like", value, "zhichu1");
            return (Criteria) this;
        }

        public Criteria andZhichu1In(List<String> values) {
            addCriterion("ZHICHU1 in", values, "zhichu1");
            return (Criteria) this;
        }

        public Criteria andZhichu1NotIn(List<String> values) {
            addCriterion("ZHICHU1 not in", values, "zhichu1");
            return (Criteria) this;
        }

        public Criteria andZhichu1Between(String value1, String value2) {
            addCriterion("ZHICHU1 between", value1, value2, "zhichu1");
            return (Criteria) this;
        }

        public Criteria andZhichu1NotBetween(String value1, String value2) {
            addCriterion("ZHICHU1 not between", value1, value2, "zhichu1");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi1IsNull() {
            addCriterion("SHANGNIANDUZHANBI1 is null");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi1IsNotNull() {
            addCriterion("SHANGNIANDUZHANBI1 is not null");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi1EqualTo(String value) {
            addCriterion("SHANGNIANDUZHANBI1 =", value, "shangnianduzhanbi1");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi1NotEqualTo(String value) {
            addCriterion("SHANGNIANDUZHANBI1 <>", value, "shangnianduzhanbi1");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi1GreaterThan(String value) {
            addCriterion("SHANGNIANDUZHANBI1 >", value, "shangnianduzhanbi1");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi1GreaterThanOrEqualTo(String value) {
            addCriterion("SHANGNIANDUZHANBI1 >=", value, "shangnianduzhanbi1");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi1LessThan(String value) {
            addCriterion("SHANGNIANDUZHANBI1 <", value, "shangnianduzhanbi1");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi1LessThanOrEqualTo(String value) {
            addCriterion("SHANGNIANDUZHANBI1 <=", value, "shangnianduzhanbi1");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi1Like(String value) {
            addCriterion("SHANGNIANDUZHANBI1 like", value, "shangnianduzhanbi1");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi1NotLike(String value) {
            addCriterion("SHANGNIANDUZHANBI1 not like", value, "shangnianduzhanbi1");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi1In(List<String> values) {
            addCriterion("SHANGNIANDUZHANBI1 in", values, "shangnianduzhanbi1");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi1NotIn(List<String> values) {
            addCriterion("SHANGNIANDUZHANBI1 not in", values, "shangnianduzhanbi1");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi1Between(String value1, String value2) {
            addCriterion("SHANGNIANDUZHANBI1 between", value1, value2, "shangnianduzhanbi1");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi1NotBetween(String value1, String value2) {
            addCriterion("SHANGNIANDUZHANBI1 not between", value1, value2, "shangnianduzhanbi1");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi1IsNull() {
            addCriterion("BENNIANDUZHANBI1 is null");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi1IsNotNull() {
            addCriterion("BENNIANDUZHANBI1 is not null");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi1EqualTo(String value) {
            addCriterion("BENNIANDUZHANBI1 =", value, "bennianduzhanbi1");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi1NotEqualTo(String value) {
            addCriterion("BENNIANDUZHANBI1 <>", value, "bennianduzhanbi1");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi1GreaterThan(String value) {
            addCriterion("BENNIANDUZHANBI1 >", value, "bennianduzhanbi1");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi1GreaterThanOrEqualTo(String value) {
            addCriterion("BENNIANDUZHANBI1 >=", value, "bennianduzhanbi1");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi1LessThan(String value) {
            addCriterion("BENNIANDUZHANBI1 <", value, "bennianduzhanbi1");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi1LessThanOrEqualTo(String value) {
            addCriterion("BENNIANDUZHANBI1 <=", value, "bennianduzhanbi1");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi1Like(String value) {
            addCriterion("BENNIANDUZHANBI1 like", value, "bennianduzhanbi1");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi1NotLike(String value) {
            addCriterion("BENNIANDUZHANBI1 not like", value, "bennianduzhanbi1");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi1In(List<String> values) {
            addCriterion("BENNIANDUZHANBI1 in", values, "bennianduzhanbi1");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi1NotIn(List<String> values) {
            addCriterion("BENNIANDUZHANBI1 not in", values, "bennianduzhanbi1");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi1Between(String value1, String value2) {
            addCriterion("BENNIANDUZHANBI1 between", value1, value2, "bennianduzhanbi1");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi1NotBetween(String value1, String value2) {
            addCriterion("BENNIANDUZHANBI1 not between", value1, value2, "bennianduzhanbi1");
            return (Criteria) this;
        }

        public Criteria andZongshouru2IsNull() {
            addCriterion("ZONGSHOURU2 is null");
            return (Criteria) this;
        }

        public Criteria andZongshouru2IsNotNull() {
            addCriterion("ZONGSHOURU2 is not null");
            return (Criteria) this;
        }

        public Criteria andZongshouru2EqualTo(String value) {
            addCriterion("ZONGSHOURU2 =", value, "zongshouru2");
            return (Criteria) this;
        }

        public Criteria andZongshouru2NotEqualTo(String value) {
            addCriterion("ZONGSHOURU2 <>", value, "zongshouru2");
            return (Criteria) this;
        }

        public Criteria andZongshouru2GreaterThan(String value) {
            addCriterion("ZONGSHOURU2 >", value, "zongshouru2");
            return (Criteria) this;
        }

        public Criteria andZongshouru2GreaterThanOrEqualTo(String value) {
            addCriterion("ZONGSHOURU2 >=", value, "zongshouru2");
            return (Criteria) this;
        }

        public Criteria andZongshouru2LessThan(String value) {
            addCriterion("ZONGSHOURU2 <", value, "zongshouru2");
            return (Criteria) this;
        }

        public Criteria andZongshouru2LessThanOrEqualTo(String value) {
            addCriterion("ZONGSHOURU2 <=", value, "zongshouru2");
            return (Criteria) this;
        }

        public Criteria andZongshouru2Like(String value) {
            addCriterion("ZONGSHOURU2 like", value, "zongshouru2");
            return (Criteria) this;
        }

        public Criteria andZongshouru2NotLike(String value) {
            addCriterion("ZONGSHOURU2 not like", value, "zongshouru2");
            return (Criteria) this;
        }

        public Criteria andZongshouru2In(List<String> values) {
            addCriterion("ZONGSHOURU2 in", values, "zongshouru2");
            return (Criteria) this;
        }

        public Criteria andZongshouru2NotIn(List<String> values) {
            addCriterion("ZONGSHOURU2 not in", values, "zongshouru2");
            return (Criteria) this;
        }

        public Criteria andZongshouru2Between(String value1, String value2) {
            addCriterion("ZONGSHOURU2 between", value1, value2, "zongshouru2");
            return (Criteria) this;
        }

        public Criteria andZongshouru2NotBetween(String value1, String value2) {
            addCriterion("ZONGSHOURU2 not between", value1, value2, "zongshouru2");
            return (Criteria) this;
        }

        public Criteria andZongzhichu2IsNull() {
            addCriterion("ZONGZHICHU2 is null");
            return (Criteria) this;
        }

        public Criteria andZongzhichu2IsNotNull() {
            addCriterion("ZONGZHICHU2 is not null");
            return (Criteria) this;
        }

        public Criteria andZongzhichu2EqualTo(String value) {
            addCriterion("ZONGZHICHU2 =", value, "zongzhichu2");
            return (Criteria) this;
        }

        public Criteria andZongzhichu2NotEqualTo(String value) {
            addCriterion("ZONGZHICHU2 <>", value, "zongzhichu2");
            return (Criteria) this;
        }

        public Criteria andZongzhichu2GreaterThan(String value) {
            addCriterion("ZONGZHICHU2 >", value, "zongzhichu2");
            return (Criteria) this;
        }

        public Criteria andZongzhichu2GreaterThanOrEqualTo(String value) {
            addCriterion("ZONGZHICHU2 >=", value, "zongzhichu2");
            return (Criteria) this;
        }

        public Criteria andZongzhichu2LessThan(String value) {
            addCriterion("ZONGZHICHU2 <", value, "zongzhichu2");
            return (Criteria) this;
        }

        public Criteria andZongzhichu2LessThanOrEqualTo(String value) {
            addCriterion("ZONGZHICHU2 <=", value, "zongzhichu2");
            return (Criteria) this;
        }

        public Criteria andZongzhichu2Like(String value) {
            addCriterion("ZONGZHICHU2 like", value, "zongzhichu2");
            return (Criteria) this;
        }

        public Criteria andZongzhichu2NotLike(String value) {
            addCriterion("ZONGZHICHU2 not like", value, "zongzhichu2");
            return (Criteria) this;
        }

        public Criteria andZongzhichu2In(List<String> values) {
            addCriterion("ZONGZHICHU2 in", values, "zongzhichu2");
            return (Criteria) this;
        }

        public Criteria andZongzhichu2NotIn(List<String> values) {
            addCriterion("ZONGZHICHU2 not in", values, "zongzhichu2");
            return (Criteria) this;
        }

        public Criteria andZongzhichu2Between(String value1, String value2) {
            addCriterion("ZONGZHICHU2 between", value1, value2, "zongzhichu2");
            return (Criteria) this;
        }

        public Criteria andZongzhichu2NotBetween(String value1, String value2) {
            addCriterion("ZONGZHICHU2 not between", value1, value2, "zongzhichu2");
            return (Criteria) this;
        }

        public Criteria andZhichu2IsNull() {
            addCriterion("ZHICHU2 is null");
            return (Criteria) this;
        }

        public Criteria andZhichu2IsNotNull() {
            addCriterion("ZHICHU2 is not null");
            return (Criteria) this;
        }

        public Criteria andZhichu2EqualTo(String value) {
            addCriterion("ZHICHU2 =", value, "zhichu2");
            return (Criteria) this;
        }

        public Criteria andZhichu2NotEqualTo(String value) {
            addCriterion("ZHICHU2 <>", value, "zhichu2");
            return (Criteria) this;
        }

        public Criteria andZhichu2GreaterThan(String value) {
            addCriterion("ZHICHU2 >", value, "zhichu2");
            return (Criteria) this;
        }

        public Criteria andZhichu2GreaterThanOrEqualTo(String value) {
            addCriterion("ZHICHU2 >=", value, "zhichu2");
            return (Criteria) this;
        }

        public Criteria andZhichu2LessThan(String value) {
            addCriterion("ZHICHU2 <", value, "zhichu2");
            return (Criteria) this;
        }

        public Criteria andZhichu2LessThanOrEqualTo(String value) {
            addCriterion("ZHICHU2 <=", value, "zhichu2");
            return (Criteria) this;
        }

        public Criteria andZhichu2Like(String value) {
            addCriterion("ZHICHU2 like", value, "zhichu2");
            return (Criteria) this;
        }

        public Criteria andZhichu2NotLike(String value) {
            addCriterion("ZHICHU2 not like", value, "zhichu2");
            return (Criteria) this;
        }

        public Criteria andZhichu2In(List<String> values) {
            addCriterion("ZHICHU2 in", values, "zhichu2");
            return (Criteria) this;
        }

        public Criteria andZhichu2NotIn(List<String> values) {
            addCriterion("ZHICHU2 not in", values, "zhichu2");
            return (Criteria) this;
        }

        public Criteria andZhichu2Between(String value1, String value2) {
            addCriterion("ZHICHU2 between", value1, value2, "zhichu2");
            return (Criteria) this;
        }

        public Criteria andZhichu2NotBetween(String value1, String value2) {
            addCriterion("ZHICHU2 not between", value1, value2, "zhichu2");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi2IsNull() {
            addCriterion("SHANGNIANDUZHANBI2 is null");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi2IsNotNull() {
            addCriterion("SHANGNIANDUZHANBI2 is not null");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi2EqualTo(String value) {
            addCriterion("SHANGNIANDUZHANBI2 =", value, "shangnianduzhanbi2");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi2NotEqualTo(String value) {
            addCriterion("SHANGNIANDUZHANBI2 <>", value, "shangnianduzhanbi2");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi2GreaterThan(String value) {
            addCriterion("SHANGNIANDUZHANBI2 >", value, "shangnianduzhanbi2");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi2GreaterThanOrEqualTo(String value) {
            addCriterion("SHANGNIANDUZHANBI2 >=", value, "shangnianduzhanbi2");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi2LessThan(String value) {
            addCriterion("SHANGNIANDUZHANBI2 <", value, "shangnianduzhanbi2");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi2LessThanOrEqualTo(String value) {
            addCriterion("SHANGNIANDUZHANBI2 <=", value, "shangnianduzhanbi2");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi2Like(String value) {
            addCriterion("SHANGNIANDUZHANBI2 like", value, "shangnianduzhanbi2");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi2NotLike(String value) {
            addCriterion("SHANGNIANDUZHANBI2 not like", value, "shangnianduzhanbi2");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi2In(List<String> values) {
            addCriterion("SHANGNIANDUZHANBI2 in", values, "shangnianduzhanbi2");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi2NotIn(List<String> values) {
            addCriterion("SHANGNIANDUZHANBI2 not in", values, "shangnianduzhanbi2");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi2Between(String value1, String value2) {
            addCriterion("SHANGNIANDUZHANBI2 between", value1, value2, "shangnianduzhanbi2");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi2NotBetween(String value1, String value2) {
            addCriterion("SHANGNIANDUZHANBI2 not between", value1, value2, "shangnianduzhanbi2");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi2IsNull() {
            addCriterion("BENNIANDUZHANBI2 is null");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi2IsNotNull() {
            addCriterion("BENNIANDUZHANBI2 is not null");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi2EqualTo(String value) {
            addCriterion("BENNIANDUZHANBI2 =", value, "bennianduzhanbi2");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi2NotEqualTo(String value) {
            addCriterion("BENNIANDUZHANBI2 <>", value, "bennianduzhanbi2");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi2GreaterThan(String value) {
            addCriterion("BENNIANDUZHANBI2 >", value, "bennianduzhanbi2");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi2GreaterThanOrEqualTo(String value) {
            addCriterion("BENNIANDUZHANBI2 >=", value, "bennianduzhanbi2");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi2LessThan(String value) {
            addCriterion("BENNIANDUZHANBI2 <", value, "bennianduzhanbi2");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi2LessThanOrEqualTo(String value) {
            addCriterion("BENNIANDUZHANBI2 <=", value, "bennianduzhanbi2");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi2Like(String value) {
            addCriterion("BENNIANDUZHANBI2 like", value, "bennianduzhanbi2");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi2NotLike(String value) {
            addCriterion("BENNIANDUZHANBI2 not like", value, "bennianduzhanbi2");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi2In(List<String> values) {
            addCriterion("BENNIANDUZHANBI2 in", values, "bennianduzhanbi2");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi2NotIn(List<String> values) {
            addCriterion("BENNIANDUZHANBI2 not in", values, "bennianduzhanbi2");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi2Between(String value1, String value2) {
            addCriterion("BENNIANDUZHANBI2 between", value1, value2, "bennianduzhanbi2");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi2NotBetween(String value1, String value2) {
            addCriterion("BENNIANDUZHANBI2 not between", value1, value2, "bennianduzhanbi2");
            return (Criteria) this;
        }

        public Criteria andZongshouru3IsNull() {
            addCriterion("ZONGSHOURU3 is null");
            return (Criteria) this;
        }

        public Criteria andZongshouru3IsNotNull() {
            addCriterion("ZONGSHOURU3 is not null");
            return (Criteria) this;
        }

        public Criteria andZongshouru3EqualTo(String value) {
            addCriterion("ZONGSHOURU3 =", value, "zongshouru3");
            return (Criteria) this;
        }

        public Criteria andZongshouru3NotEqualTo(String value) {
            addCriterion("ZONGSHOURU3 <>", value, "zongshouru3");
            return (Criteria) this;
        }

        public Criteria andZongshouru3GreaterThan(String value) {
            addCriterion("ZONGSHOURU3 >", value, "zongshouru3");
            return (Criteria) this;
        }

        public Criteria andZongshouru3GreaterThanOrEqualTo(String value) {
            addCriterion("ZONGSHOURU3 >=", value, "zongshouru3");
            return (Criteria) this;
        }

        public Criteria andZongshouru3LessThan(String value) {
            addCriterion("ZONGSHOURU3 <", value, "zongshouru3");
            return (Criteria) this;
        }

        public Criteria andZongshouru3LessThanOrEqualTo(String value) {
            addCriterion("ZONGSHOURU3 <=", value, "zongshouru3");
            return (Criteria) this;
        }

        public Criteria andZongshouru3Like(String value) {
            addCriterion("ZONGSHOURU3 like", value, "zongshouru3");
            return (Criteria) this;
        }

        public Criteria andZongshouru3NotLike(String value) {
            addCriterion("ZONGSHOURU3 not like", value, "zongshouru3");
            return (Criteria) this;
        }

        public Criteria andZongshouru3In(List<String> values) {
            addCriterion("ZONGSHOURU3 in", values, "zongshouru3");
            return (Criteria) this;
        }

        public Criteria andZongshouru3NotIn(List<String> values) {
            addCriterion("ZONGSHOURU3 not in", values, "zongshouru3");
            return (Criteria) this;
        }

        public Criteria andZongshouru3Between(String value1, String value2) {
            addCriterion("ZONGSHOURU3 between", value1, value2, "zongshouru3");
            return (Criteria) this;
        }

        public Criteria andZongshouru3NotBetween(String value1, String value2) {
            addCriterion("ZONGSHOURU3 not between", value1, value2, "zongshouru3");
            return (Criteria) this;
        }

        public Criteria andZongzhichu3IsNull() {
            addCriterion("ZONGZHICHU3 is null");
            return (Criteria) this;
        }

        public Criteria andZongzhichu3IsNotNull() {
            addCriterion("ZONGZHICHU3 is not null");
            return (Criteria) this;
        }

        public Criteria andZongzhichu3EqualTo(String value) {
            addCriterion("ZONGZHICHU3 =", value, "zongzhichu3");
            return (Criteria) this;
        }

        public Criteria andZongzhichu3NotEqualTo(String value) {
            addCriterion("ZONGZHICHU3 <>", value, "zongzhichu3");
            return (Criteria) this;
        }

        public Criteria andZongzhichu3GreaterThan(String value) {
            addCriterion("ZONGZHICHU3 >", value, "zongzhichu3");
            return (Criteria) this;
        }

        public Criteria andZongzhichu3GreaterThanOrEqualTo(String value) {
            addCriterion("ZONGZHICHU3 >=", value, "zongzhichu3");
            return (Criteria) this;
        }

        public Criteria andZongzhichu3LessThan(String value) {
            addCriterion("ZONGZHICHU3 <", value, "zongzhichu3");
            return (Criteria) this;
        }

        public Criteria andZongzhichu3LessThanOrEqualTo(String value) {
            addCriterion("ZONGZHICHU3 <=", value, "zongzhichu3");
            return (Criteria) this;
        }

        public Criteria andZongzhichu3Like(String value) {
            addCriterion("ZONGZHICHU3 like", value, "zongzhichu3");
            return (Criteria) this;
        }

        public Criteria andZongzhichu3NotLike(String value) {
            addCriterion("ZONGZHICHU3 not like", value, "zongzhichu3");
            return (Criteria) this;
        }

        public Criteria andZongzhichu3In(List<String> values) {
            addCriterion("ZONGZHICHU3 in", values, "zongzhichu3");
            return (Criteria) this;
        }

        public Criteria andZongzhichu3NotIn(List<String> values) {
            addCriterion("ZONGZHICHU3 not in", values, "zongzhichu3");
            return (Criteria) this;
        }

        public Criteria andZongzhichu3Between(String value1, String value2) {
            addCriterion("ZONGZHICHU3 between", value1, value2, "zongzhichu3");
            return (Criteria) this;
        }

        public Criteria andZongzhichu3NotBetween(String value1, String value2) {
            addCriterion("ZONGZHICHU3 not between", value1, value2, "zongzhichu3");
            return (Criteria) this;
        }

        public Criteria andZhichu3IsNull() {
            addCriterion("ZHICHU3 is null");
            return (Criteria) this;
        }

        public Criteria andZhichu3IsNotNull() {
            addCriterion("ZHICHU3 is not null");
            return (Criteria) this;
        }

        public Criteria andZhichu3EqualTo(String value) {
            addCriterion("ZHICHU3 =", value, "zhichu3");
            return (Criteria) this;
        }

        public Criteria andZhichu3NotEqualTo(String value) {
            addCriterion("ZHICHU3 <>", value, "zhichu3");
            return (Criteria) this;
        }

        public Criteria andZhichu3GreaterThan(String value) {
            addCriterion("ZHICHU3 >", value, "zhichu3");
            return (Criteria) this;
        }

        public Criteria andZhichu3GreaterThanOrEqualTo(String value) {
            addCriterion("ZHICHU3 >=", value, "zhichu3");
            return (Criteria) this;
        }

        public Criteria andZhichu3LessThan(String value) {
            addCriterion("ZHICHU3 <", value, "zhichu3");
            return (Criteria) this;
        }

        public Criteria andZhichu3LessThanOrEqualTo(String value) {
            addCriterion("ZHICHU3 <=", value, "zhichu3");
            return (Criteria) this;
        }

        public Criteria andZhichu3Like(String value) {
            addCriterion("ZHICHU3 like", value, "zhichu3");
            return (Criteria) this;
        }

        public Criteria andZhichu3NotLike(String value) {
            addCriterion("ZHICHU3 not like", value, "zhichu3");
            return (Criteria) this;
        }

        public Criteria andZhichu3In(List<String> values) {
            addCriterion("ZHICHU3 in", values, "zhichu3");
            return (Criteria) this;
        }

        public Criteria andZhichu3NotIn(List<String> values) {
            addCriterion("ZHICHU3 not in", values, "zhichu3");
            return (Criteria) this;
        }

        public Criteria andZhichu3Between(String value1, String value2) {
            addCriterion("ZHICHU3 between", value1, value2, "zhichu3");
            return (Criteria) this;
        }

        public Criteria andZhichu3NotBetween(String value1, String value2) {
            addCriterion("ZHICHU3 not between", value1, value2, "zhichu3");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi3IsNull() {
            addCriterion("SHANGNIANDUZHANBI3 is null");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi3IsNotNull() {
            addCriterion("SHANGNIANDUZHANBI3 is not null");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi3EqualTo(String value) {
            addCriterion("SHANGNIANDUZHANBI3 =", value, "shangnianduzhanbi3");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi3NotEqualTo(String value) {
            addCriterion("SHANGNIANDUZHANBI3 <>", value, "shangnianduzhanbi3");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi3GreaterThan(String value) {
            addCriterion("SHANGNIANDUZHANBI3 >", value, "shangnianduzhanbi3");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi3GreaterThanOrEqualTo(String value) {
            addCriterion("SHANGNIANDUZHANBI3 >=", value, "shangnianduzhanbi3");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi3LessThan(String value) {
            addCriterion("SHANGNIANDUZHANBI3 <", value, "shangnianduzhanbi3");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi3LessThanOrEqualTo(String value) {
            addCriterion("SHANGNIANDUZHANBI3 <=", value, "shangnianduzhanbi3");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi3Like(String value) {
            addCriterion("SHANGNIANDUZHANBI3 like", value, "shangnianduzhanbi3");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi3NotLike(String value) {
            addCriterion("SHANGNIANDUZHANBI3 not like", value, "shangnianduzhanbi3");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi3In(List<String> values) {
            addCriterion("SHANGNIANDUZHANBI3 in", values, "shangnianduzhanbi3");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi3NotIn(List<String> values) {
            addCriterion("SHANGNIANDUZHANBI3 not in", values, "shangnianduzhanbi3");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi3Between(String value1, String value2) {
            addCriterion("SHANGNIANDUZHANBI3 between", value1, value2, "shangnianduzhanbi3");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi3NotBetween(String value1, String value2) {
            addCriterion("SHANGNIANDUZHANBI3 not between", value1, value2, "shangnianduzhanbi3");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi3IsNull() {
            addCriterion("BENNIANDUZHANBI3 is null");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi3IsNotNull() {
            addCriterion("BENNIANDUZHANBI3 is not null");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi3EqualTo(String value) {
            addCriterion("BENNIANDUZHANBI3 =", value, "bennianduzhanbi3");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi3NotEqualTo(String value) {
            addCriterion("BENNIANDUZHANBI3 <>", value, "bennianduzhanbi3");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi3GreaterThan(String value) {
            addCriterion("BENNIANDUZHANBI3 >", value, "bennianduzhanbi3");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi3GreaterThanOrEqualTo(String value) {
            addCriterion("BENNIANDUZHANBI3 >=", value, "bennianduzhanbi3");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi3LessThan(String value) {
            addCriterion("BENNIANDUZHANBI3 <", value, "bennianduzhanbi3");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi3LessThanOrEqualTo(String value) {
            addCriterion("BENNIANDUZHANBI3 <=", value, "bennianduzhanbi3");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi3Like(String value) {
            addCriterion("BENNIANDUZHANBI3 like", value, "bennianduzhanbi3");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi3NotLike(String value) {
            addCriterion("BENNIANDUZHANBI3 not like", value, "bennianduzhanbi3");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi3In(List<String> values) {
            addCriterion("BENNIANDUZHANBI3 in", values, "bennianduzhanbi3");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi3NotIn(List<String> values) {
            addCriterion("BENNIANDUZHANBI3 not in", values, "bennianduzhanbi3");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi3Between(String value1, String value2) {
            addCriterion("BENNIANDUZHANBI3 between", value1, value2, "bennianduzhanbi3");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi3NotBetween(String value1, String value2) {
            addCriterion("BENNIANDUZHANBI3 not between", value1, value2, "bennianduzhanbi3");
            return (Criteria) this;
        }

        public Criteria andZongshouru4IsNull() {
            addCriterion("ZONGSHOURU4 is null");
            return (Criteria) this;
        }

        public Criteria andZongshouru4IsNotNull() {
            addCriterion("ZONGSHOURU4 is not null");
            return (Criteria) this;
        }

        public Criteria andZongshouru4EqualTo(String value) {
            addCriterion("ZONGSHOURU4 =", value, "zongshouru4");
            return (Criteria) this;
        }

        public Criteria andZongshouru4NotEqualTo(String value) {
            addCriterion("ZONGSHOURU4 <>", value, "zongshouru4");
            return (Criteria) this;
        }

        public Criteria andZongshouru4GreaterThan(String value) {
            addCriterion("ZONGSHOURU4 >", value, "zongshouru4");
            return (Criteria) this;
        }

        public Criteria andZongshouru4GreaterThanOrEqualTo(String value) {
            addCriterion("ZONGSHOURU4 >=", value, "zongshouru4");
            return (Criteria) this;
        }

        public Criteria andZongshouru4LessThan(String value) {
            addCriterion("ZONGSHOURU4 <", value, "zongshouru4");
            return (Criteria) this;
        }

        public Criteria andZongshouru4LessThanOrEqualTo(String value) {
            addCriterion("ZONGSHOURU4 <=", value, "zongshouru4");
            return (Criteria) this;
        }

        public Criteria andZongshouru4Like(String value) {
            addCriterion("ZONGSHOURU4 like", value, "zongshouru4");
            return (Criteria) this;
        }

        public Criteria andZongshouru4NotLike(String value) {
            addCriterion("ZONGSHOURU4 not like", value, "zongshouru4");
            return (Criteria) this;
        }

        public Criteria andZongshouru4In(List<String> values) {
            addCriterion("ZONGSHOURU4 in", values, "zongshouru4");
            return (Criteria) this;
        }

        public Criteria andZongshouru4NotIn(List<String> values) {
            addCriterion("ZONGSHOURU4 not in", values, "zongshouru4");
            return (Criteria) this;
        }

        public Criteria andZongshouru4Between(String value1, String value2) {
            addCriterion("ZONGSHOURU4 between", value1, value2, "zongshouru4");
            return (Criteria) this;
        }

        public Criteria andZongshouru4NotBetween(String value1, String value2) {
            addCriterion("ZONGSHOURU4 not between", value1, value2, "zongshouru4");
            return (Criteria) this;
        }

        public Criteria andZongzhichu4IsNull() {
            addCriterion("ZONGZHICHU4 is null");
            return (Criteria) this;
        }

        public Criteria andZongzhichu4IsNotNull() {
            addCriterion("ZONGZHICHU4 is not null");
            return (Criteria) this;
        }

        public Criteria andZongzhichu4EqualTo(String value) {
            addCriterion("ZONGZHICHU4 =", value, "zongzhichu4");
            return (Criteria) this;
        }

        public Criteria andZongzhichu4NotEqualTo(String value) {
            addCriterion("ZONGZHICHU4 <>", value, "zongzhichu4");
            return (Criteria) this;
        }

        public Criteria andZongzhichu4GreaterThan(String value) {
            addCriterion("ZONGZHICHU4 >", value, "zongzhichu4");
            return (Criteria) this;
        }

        public Criteria andZongzhichu4GreaterThanOrEqualTo(String value) {
            addCriterion("ZONGZHICHU4 >=", value, "zongzhichu4");
            return (Criteria) this;
        }

        public Criteria andZongzhichu4LessThan(String value) {
            addCriterion("ZONGZHICHU4 <", value, "zongzhichu4");
            return (Criteria) this;
        }

        public Criteria andZongzhichu4LessThanOrEqualTo(String value) {
            addCriterion("ZONGZHICHU4 <=", value, "zongzhichu4");
            return (Criteria) this;
        }

        public Criteria andZongzhichu4Like(String value) {
            addCriterion("ZONGZHICHU4 like", value, "zongzhichu4");
            return (Criteria) this;
        }

        public Criteria andZongzhichu4NotLike(String value) {
            addCriterion("ZONGZHICHU4 not like", value, "zongzhichu4");
            return (Criteria) this;
        }

        public Criteria andZongzhichu4In(List<String> values) {
            addCriterion("ZONGZHICHU4 in", values, "zongzhichu4");
            return (Criteria) this;
        }

        public Criteria andZongzhichu4NotIn(List<String> values) {
            addCriterion("ZONGZHICHU4 not in", values, "zongzhichu4");
            return (Criteria) this;
        }

        public Criteria andZongzhichu4Between(String value1, String value2) {
            addCriterion("ZONGZHICHU4 between", value1, value2, "zongzhichu4");
            return (Criteria) this;
        }

        public Criteria andZongzhichu4NotBetween(String value1, String value2) {
            addCriterion("ZONGZHICHU4 not between", value1, value2, "zongzhichu4");
            return (Criteria) this;
        }

        public Criteria andZhichu4IsNull() {
            addCriterion("ZHICHU4 is null");
            return (Criteria) this;
        }

        public Criteria andZhichu4IsNotNull() {
            addCriterion("ZHICHU4 is not null");
            return (Criteria) this;
        }

        public Criteria andZhichu4EqualTo(String value) {
            addCriterion("ZHICHU4 =", value, "zhichu4");
            return (Criteria) this;
        }

        public Criteria andZhichu4NotEqualTo(String value) {
            addCriterion("ZHICHU4 <>", value, "zhichu4");
            return (Criteria) this;
        }

        public Criteria andZhichu4GreaterThan(String value) {
            addCriterion("ZHICHU4 >", value, "zhichu4");
            return (Criteria) this;
        }

        public Criteria andZhichu4GreaterThanOrEqualTo(String value) {
            addCriterion("ZHICHU4 >=", value, "zhichu4");
            return (Criteria) this;
        }

        public Criteria andZhichu4LessThan(String value) {
            addCriterion("ZHICHU4 <", value, "zhichu4");
            return (Criteria) this;
        }

        public Criteria andZhichu4LessThanOrEqualTo(String value) {
            addCriterion("ZHICHU4 <=", value, "zhichu4");
            return (Criteria) this;
        }

        public Criteria andZhichu4Like(String value) {
            addCriterion("ZHICHU4 like", value, "zhichu4");
            return (Criteria) this;
        }

        public Criteria andZhichu4NotLike(String value) {
            addCriterion("ZHICHU4 not like", value, "zhichu4");
            return (Criteria) this;
        }

        public Criteria andZhichu4In(List<String> values) {
            addCriterion("ZHICHU4 in", values, "zhichu4");
            return (Criteria) this;
        }

        public Criteria andZhichu4NotIn(List<String> values) {
            addCriterion("ZHICHU4 not in", values, "zhichu4");
            return (Criteria) this;
        }

        public Criteria andZhichu4Between(String value1, String value2) {
            addCriterion("ZHICHU4 between", value1, value2, "zhichu4");
            return (Criteria) this;
        }

        public Criteria andZhichu4NotBetween(String value1, String value2) {
            addCriterion("ZHICHU4 not between", value1, value2, "zhichu4");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi4IsNull() {
            addCriterion("SHANGNIANDUZHANBI4 is null");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi4IsNotNull() {
            addCriterion("SHANGNIANDUZHANBI4 is not null");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi4EqualTo(String value) {
            addCriterion("SHANGNIANDUZHANBI4 =", value, "shangnianduzhanbi4");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi4NotEqualTo(String value) {
            addCriterion("SHANGNIANDUZHANBI4 <>", value, "shangnianduzhanbi4");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi4GreaterThan(String value) {
            addCriterion("SHANGNIANDUZHANBI4 >", value, "shangnianduzhanbi4");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi4GreaterThanOrEqualTo(String value) {
            addCriterion("SHANGNIANDUZHANBI4 >=", value, "shangnianduzhanbi4");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi4LessThan(String value) {
            addCriterion("SHANGNIANDUZHANBI4 <", value, "shangnianduzhanbi4");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi4LessThanOrEqualTo(String value) {
            addCriterion("SHANGNIANDUZHANBI4 <=", value, "shangnianduzhanbi4");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi4Like(String value) {
            addCriterion("SHANGNIANDUZHANBI4 like", value, "shangnianduzhanbi4");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi4NotLike(String value) {
            addCriterion("SHANGNIANDUZHANBI4 not like", value, "shangnianduzhanbi4");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi4In(List<String> values) {
            addCriterion("SHANGNIANDUZHANBI4 in", values, "shangnianduzhanbi4");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi4NotIn(List<String> values) {
            addCriterion("SHANGNIANDUZHANBI4 not in", values, "shangnianduzhanbi4");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi4Between(String value1, String value2) {
            addCriterion("SHANGNIANDUZHANBI4 between", value1, value2, "shangnianduzhanbi4");
            return (Criteria) this;
        }

        public Criteria andShangnianduzhanbi4NotBetween(String value1, String value2) {
            addCriterion("SHANGNIANDUZHANBI4 not between", value1, value2, "shangnianduzhanbi4");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi4IsNull() {
            addCriterion("BENNIANDUZHANBI4 is null");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi4IsNotNull() {
            addCriterion("BENNIANDUZHANBI4 is not null");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi4EqualTo(String value) {
            addCriterion("BENNIANDUZHANBI4 =", value, "bennianduzhanbi4");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi4NotEqualTo(String value) {
            addCriterion("BENNIANDUZHANBI4 <>", value, "bennianduzhanbi4");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi4GreaterThan(String value) {
            addCriterion("BENNIANDUZHANBI4 >", value, "bennianduzhanbi4");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi4GreaterThanOrEqualTo(String value) {
            addCriterion("BENNIANDUZHANBI4 >=", value, "bennianduzhanbi4");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi4LessThan(String value) {
            addCriterion("BENNIANDUZHANBI4 <", value, "bennianduzhanbi4");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi4LessThanOrEqualTo(String value) {
            addCriterion("BENNIANDUZHANBI4 <=", value, "bennianduzhanbi4");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi4Like(String value) {
            addCriterion("BENNIANDUZHANBI4 like", value, "bennianduzhanbi4");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi4NotLike(String value) {
            addCriterion("BENNIANDUZHANBI4 not like", value, "bennianduzhanbi4");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi4In(List<String> values) {
            addCriterion("BENNIANDUZHANBI4 in", values, "bennianduzhanbi4");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi4NotIn(List<String> values) {
            addCriterion("BENNIANDUZHANBI4 not in", values, "bennianduzhanbi4");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi4Between(String value1, String value2) {
            addCriterion("BENNIANDUZHANBI4 between", value1, value2, "bennianduzhanbi4");
            return (Criteria) this;
        }

        public Criteria andBennianduzhanbi4NotBetween(String value1, String value2) {
            addCriterion("BENNIANDUZHANBI4 not between", value1, value2, "bennianduzhanbi4");
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