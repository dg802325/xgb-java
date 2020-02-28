package com.xgb.model;

import java.util.ArrayList;
import java.util.List;

public class Stnianjianreport9Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Stnianjianreport9Example() {
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

        public Criteria andNiandu1IsNull() {
            addCriterion("NIANDU1 is null");
            return (Criteria) this;
        }

        public Criteria andNiandu1IsNotNull() {
            addCriterion("NIANDU1 is not null");
            return (Criteria) this;
        }

        public Criteria andNiandu1EqualTo(String value) {
            addCriterion("NIANDU1 =", value, "niandu1");
            return (Criteria) this;
        }

        public Criteria andNiandu1NotEqualTo(String value) {
            addCriterion("NIANDU1 <>", value, "niandu1");
            return (Criteria) this;
        }

        public Criteria andNiandu1GreaterThan(String value) {
            addCriterion("NIANDU1 >", value, "niandu1");
            return (Criteria) this;
        }

        public Criteria andNiandu1GreaterThanOrEqualTo(String value) {
            addCriterion("NIANDU1 >=", value, "niandu1");
            return (Criteria) this;
        }

        public Criteria andNiandu1LessThan(String value) {
            addCriterion("NIANDU1 <", value, "niandu1");
            return (Criteria) this;
        }

        public Criteria andNiandu1LessThanOrEqualTo(String value) {
            addCriterion("NIANDU1 <=", value, "niandu1");
            return (Criteria) this;
        }

        public Criteria andNiandu1Like(String value) {
            addCriterion("NIANDU1 like", value, "niandu1");
            return (Criteria) this;
        }

        public Criteria andNiandu1NotLike(String value) {
            addCriterion("NIANDU1 not like", value, "niandu1");
            return (Criteria) this;
        }

        public Criteria andNiandu1In(List<String> values) {
            addCriterion("NIANDU1 in", values, "niandu1");
            return (Criteria) this;
        }

        public Criteria andNiandu1NotIn(List<String> values) {
            addCriterion("NIANDU1 not in", values, "niandu1");
            return (Criteria) this;
        }

        public Criteria andNiandu1Between(String value1, String value2) {
            addCriterion("NIANDU1 between", value1, value2, "niandu1");
            return (Criteria) this;
        }

        public Criteria andNiandu1NotBetween(String value1, String value2) {
            addCriterion("NIANDU1 not between", value1, value2, "niandu1");
            return (Criteria) this;
        }

        public Criteria andChenglijigoushuIsNull() {
            addCriterion("CHENGLIJIGOUSHU is null");
            return (Criteria) this;
        }

        public Criteria andChenglijigoushuIsNotNull() {
            addCriterion("CHENGLIJIGOUSHU is not null");
            return (Criteria) this;
        }

        public Criteria andChenglijigoushuEqualTo(Integer value) {
            addCriterion("CHENGLIJIGOUSHU =", value, "chenglijigoushu");
            return (Criteria) this;
        }

        public Criteria andChenglijigoushuNotEqualTo(Integer value) {
            addCriterion("CHENGLIJIGOUSHU <>", value, "chenglijigoushu");
            return (Criteria) this;
        }

        public Criteria andChenglijigoushuGreaterThan(Integer value) {
            addCriterion("CHENGLIJIGOUSHU >", value, "chenglijigoushu");
            return (Criteria) this;
        }

        public Criteria andChenglijigoushuGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHENGLIJIGOUSHU >=", value, "chenglijigoushu");
            return (Criteria) this;
        }

        public Criteria andChenglijigoushuLessThan(Integer value) {
            addCriterion("CHENGLIJIGOUSHU <", value, "chenglijigoushu");
            return (Criteria) this;
        }

        public Criteria andChenglijigoushuLessThanOrEqualTo(Integer value) {
            addCriterion("CHENGLIJIGOUSHU <=", value, "chenglijigoushu");
            return (Criteria) this;
        }

        public Criteria andChenglijigoushuIn(List<Integer> values) {
            addCriterion("CHENGLIJIGOUSHU in", values, "chenglijigoushu");
            return (Criteria) this;
        }

        public Criteria andChenglijigoushuNotIn(List<Integer> values) {
            addCriterion("CHENGLIJIGOUSHU not in", values, "chenglijigoushu");
            return (Criteria) this;
        }

        public Criteria andChenglijigoushuBetween(Integer value1, Integer value2) {
            addCriterion("CHENGLIJIGOUSHU between", value1, value2, "chenglijigoushu");
            return (Criteria) this;
        }

        public Criteria andChenglijigoushuNotBetween(Integer value1, Integer value2) {
            addCriterion("CHENGLIJIGOUSHU not between", value1, value2, "chenglijigoushu");
            return (Criteria) this;
        }

        public Criteria andChenglishouxushuIsNull() {
            addCriterion("CHENGLISHOUXUSHU is null");
            return (Criteria) this;
        }

        public Criteria andChenglishouxushuIsNotNull() {
            addCriterion("CHENGLISHOUXUSHU is not null");
            return (Criteria) this;
        }

        public Criteria andChenglishouxushuEqualTo(Integer value) {
            addCriterion("CHENGLISHOUXUSHU =", value, "chenglishouxushu");
            return (Criteria) this;
        }

        public Criteria andChenglishouxushuNotEqualTo(Integer value) {
            addCriterion("CHENGLISHOUXUSHU <>", value, "chenglishouxushu");
            return (Criteria) this;
        }

        public Criteria andChenglishouxushuGreaterThan(Integer value) {
            addCriterion("CHENGLISHOUXUSHU >", value, "chenglishouxushu");
            return (Criteria) this;
        }

        public Criteria andChenglishouxushuGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHENGLISHOUXUSHU >=", value, "chenglishouxushu");
            return (Criteria) this;
        }

        public Criteria andChenglishouxushuLessThan(Integer value) {
            addCriterion("CHENGLISHOUXUSHU <", value, "chenglishouxushu");
            return (Criteria) this;
        }

        public Criteria andChenglishouxushuLessThanOrEqualTo(Integer value) {
            addCriterion("CHENGLISHOUXUSHU <=", value, "chenglishouxushu");
            return (Criteria) this;
        }

        public Criteria andChenglishouxushuIn(List<Integer> values) {
            addCriterion("CHENGLISHOUXUSHU in", values, "chenglishouxushu");
            return (Criteria) this;
        }

        public Criteria andChenglishouxushuNotIn(List<Integer> values) {
            addCriterion("CHENGLISHOUXUSHU not in", values, "chenglishouxushu");
            return (Criteria) this;
        }

        public Criteria andChenglishouxushuBetween(Integer value1, Integer value2) {
            addCriterion("CHENGLISHOUXUSHU between", value1, value2, "chenglishouxushu");
            return (Criteria) this;
        }

        public Criteria andChenglishouxushuNotBetween(Integer value1, Integer value2) {
            addCriterion("CHENGLISHOUXUSHU not between", value1, value2, "chenglishouxushu");
            return (Criteria) this;
        }

        public Criteria andNiandu2IsNull() {
            addCriterion("NIANDU2 is null");
            return (Criteria) this;
        }

        public Criteria andNiandu2IsNotNull() {
            addCriterion("NIANDU2 is not null");
            return (Criteria) this;
        }

        public Criteria andNiandu2EqualTo(String value) {
            addCriterion("NIANDU2 =", value, "niandu2");
            return (Criteria) this;
        }

        public Criteria andNiandu2NotEqualTo(String value) {
            addCriterion("NIANDU2 <>", value, "niandu2");
            return (Criteria) this;
        }

        public Criteria andNiandu2GreaterThan(String value) {
            addCriterion("NIANDU2 >", value, "niandu2");
            return (Criteria) this;
        }

        public Criteria andNiandu2GreaterThanOrEqualTo(String value) {
            addCriterion("NIANDU2 >=", value, "niandu2");
            return (Criteria) this;
        }

        public Criteria andNiandu2LessThan(String value) {
            addCriterion("NIANDU2 <", value, "niandu2");
            return (Criteria) this;
        }

        public Criteria andNiandu2LessThanOrEqualTo(String value) {
            addCriterion("NIANDU2 <=", value, "niandu2");
            return (Criteria) this;
        }

        public Criteria andNiandu2Like(String value) {
            addCriterion("NIANDU2 like", value, "niandu2");
            return (Criteria) this;
        }

        public Criteria andNiandu2NotLike(String value) {
            addCriterion("NIANDU2 not like", value, "niandu2");
            return (Criteria) this;
        }

        public Criteria andNiandu2In(List<String> values) {
            addCriterion("NIANDU2 in", values, "niandu2");
            return (Criteria) this;
        }

        public Criteria andNiandu2NotIn(List<String> values) {
            addCriterion("NIANDU2 not in", values, "niandu2");
            return (Criteria) this;
        }

        public Criteria andNiandu2Between(String value1, String value2) {
            addCriterion("NIANDU2 between", value1, value2, "niandu2");
            return (Criteria) this;
        }

        public Criteria andNiandu2NotBetween(String value1, String value2) {
            addCriterion("NIANDU2 not between", value1, value2, "niandu2");
            return (Criteria) this;
        }

        public Criteria andZhuxiaojigoushuIsNull() {
            addCriterion("ZHUXIAOJIGOUSHU is null");
            return (Criteria) this;
        }

        public Criteria andZhuxiaojigoushuIsNotNull() {
            addCriterion("ZHUXIAOJIGOUSHU is not null");
            return (Criteria) this;
        }

        public Criteria andZhuxiaojigoushuEqualTo(Integer value) {
            addCriterion("ZHUXIAOJIGOUSHU =", value, "zhuxiaojigoushu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaojigoushuNotEqualTo(Integer value) {
            addCriterion("ZHUXIAOJIGOUSHU <>", value, "zhuxiaojigoushu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaojigoushuGreaterThan(Integer value) {
            addCriterion("ZHUXIAOJIGOUSHU >", value, "zhuxiaojigoushu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaojigoushuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZHUXIAOJIGOUSHU >=", value, "zhuxiaojigoushu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaojigoushuLessThan(Integer value) {
            addCriterion("ZHUXIAOJIGOUSHU <", value, "zhuxiaojigoushu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaojigoushuLessThanOrEqualTo(Integer value) {
            addCriterion("ZHUXIAOJIGOUSHU <=", value, "zhuxiaojigoushu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaojigoushuIn(List<Integer> values) {
            addCriterion("ZHUXIAOJIGOUSHU in", values, "zhuxiaojigoushu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaojigoushuNotIn(List<Integer> values) {
            addCriterion("ZHUXIAOJIGOUSHU not in", values, "zhuxiaojigoushu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaojigoushuBetween(Integer value1, Integer value2) {
            addCriterion("ZHUXIAOJIGOUSHU between", value1, value2, "zhuxiaojigoushu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaojigoushuNotBetween(Integer value1, Integer value2) {
            addCriterion("ZHUXIAOJIGOUSHU not between", value1, value2, "zhuxiaojigoushu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoshouxushuIsNull() {
            addCriterion("ZHUXIAOSHOUXUSHU is null");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoshouxushuIsNotNull() {
            addCriterion("ZHUXIAOSHOUXUSHU is not null");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoshouxushuEqualTo(Integer value) {
            addCriterion("ZHUXIAOSHOUXUSHU =", value, "zhuxiaoshouxushu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoshouxushuNotEqualTo(Integer value) {
            addCriterion("ZHUXIAOSHOUXUSHU <>", value, "zhuxiaoshouxushu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoshouxushuGreaterThan(Integer value) {
            addCriterion("ZHUXIAOSHOUXUSHU >", value, "zhuxiaoshouxushu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoshouxushuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZHUXIAOSHOUXUSHU >=", value, "zhuxiaoshouxushu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoshouxushuLessThan(Integer value) {
            addCriterion("ZHUXIAOSHOUXUSHU <", value, "zhuxiaoshouxushu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoshouxushuLessThanOrEqualTo(Integer value) {
            addCriterion("ZHUXIAOSHOUXUSHU <=", value, "zhuxiaoshouxushu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoshouxushuIn(List<Integer> values) {
            addCriterion("ZHUXIAOSHOUXUSHU in", values, "zhuxiaoshouxushu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoshouxushuNotIn(List<Integer> values) {
            addCriterion("ZHUXIAOSHOUXUSHU not in", values, "zhuxiaoshouxushu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoshouxushuBetween(Integer value1, Integer value2) {
            addCriterion("ZHUXIAOSHOUXUSHU between", value1, value2, "zhuxiaoshouxushu");
            return (Criteria) this;
        }

        public Criteria andZhuxiaoshouxushuNotBetween(Integer value1, Integer value2) {
            addCriterion("ZHUXIAOSHOUXUSHU not between", value1, value2, "zhuxiaoshouxushu");
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