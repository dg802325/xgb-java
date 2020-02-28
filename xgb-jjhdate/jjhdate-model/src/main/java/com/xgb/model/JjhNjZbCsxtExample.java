package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JjhNjZbCsxtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JjhNjZbCsxtExample() {
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

        public Criteria andHuodongshuIsNull() {
            addCriterion("HUODONGSHU is null");
            return (Criteria) this;
        }

        public Criteria andHuodongshuIsNotNull() {
            addCriterion("HUODONGSHU is not null");
            return (Criteria) this;
        }

        public Criteria andHuodongshuEqualTo(Short value) {
            addCriterion("HUODONGSHU =", value, "huodongshu");
            return (Criteria) this;
        }

        public Criteria andHuodongshuNotEqualTo(Short value) {
            addCriterion("HUODONGSHU <>", value, "huodongshu");
            return (Criteria) this;
        }

        public Criteria andHuodongshuGreaterThan(Short value) {
            addCriterion("HUODONGSHU >", value, "huodongshu");
            return (Criteria) this;
        }

        public Criteria andHuodongshuGreaterThanOrEqualTo(Short value) {
            addCriterion("HUODONGSHU >=", value, "huodongshu");
            return (Criteria) this;
        }

        public Criteria andHuodongshuLessThan(Short value) {
            addCriterion("HUODONGSHU <", value, "huodongshu");
            return (Criteria) this;
        }

        public Criteria andHuodongshuLessThanOrEqualTo(Short value) {
            addCriterion("HUODONGSHU <=", value, "huodongshu");
            return (Criteria) this;
        }

        public Criteria andHuodongshuIn(List<Short> values) {
            addCriterion("HUODONGSHU in", values, "huodongshu");
            return (Criteria) this;
        }

        public Criteria andHuodongshuNotIn(List<Short> values) {
            addCriterion("HUODONGSHU not in", values, "huodongshu");
            return (Criteria) this;
        }

        public Criteria andHuodongshuBetween(Short value1, Short value2) {
            addCriterion("HUODONGSHU between", value1, value2, "huodongshu");
            return (Criteria) this;
        }

        public Criteria andHuodongshuNotBetween(Short value1, Short value2) {
            addCriterion("HUODONGSHU not between", value1, value2, "huodongshu");
            return (Criteria) this;
        }

        public Criteria andLingyuIsNull() {
            addCriterion("LINGYU is null");
            return (Criteria) this;
        }

        public Criteria andLingyuIsNotNull() {
            addCriterion("LINGYU is not null");
            return (Criteria) this;
        }

        public Criteria andLingyuEqualTo(String value) {
            addCriterion("LINGYU =", value, "lingyu");
            return (Criteria) this;
        }

        public Criteria andLingyuNotEqualTo(String value) {
            addCriterion("LINGYU <>", value, "lingyu");
            return (Criteria) this;
        }

        public Criteria andLingyuGreaterThan(String value) {
            addCriterion("LINGYU >", value, "lingyu");
            return (Criteria) this;
        }

        public Criteria andLingyuGreaterThanOrEqualTo(String value) {
            addCriterion("LINGYU >=", value, "lingyu");
            return (Criteria) this;
        }

        public Criteria andLingyuLessThan(String value) {
            addCriterion("LINGYU <", value, "lingyu");
            return (Criteria) this;
        }

        public Criteria andLingyuLessThanOrEqualTo(String value) {
            addCriterion("LINGYU <=", value, "lingyu");
            return (Criteria) this;
        }

        public Criteria andLingyuLike(String value) {
            addCriterion("LINGYU like", value, "lingyu");
            return (Criteria) this;
        }

        public Criteria andLingyuNotLike(String value) {
            addCriterion("LINGYU not like", value, "lingyu");
            return (Criteria) this;
        }

        public Criteria andLingyuIn(List<String> values) {
            addCriterion("LINGYU in", values, "lingyu");
            return (Criteria) this;
        }

        public Criteria andLingyuNotIn(List<String> values) {
            addCriterion("LINGYU not in", values, "lingyu");
            return (Criteria) this;
        }

        public Criteria andLingyuBetween(String value1, String value2) {
            addCriterion("LINGYU between", value1, value2, "lingyu");
            return (Criteria) this;
        }

        public Criteria andLingyuNotBetween(String value1, String value2) {
            addCriterion("LINGYU not between", value1, value2, "lingyu");
            return (Criteria) this;
        }

        public Criteria andJineIsNull() {
            addCriterion("JINE is null");
            return (Criteria) this;
        }

        public Criteria andJineIsNotNull() {
            addCriterion("JINE is not null");
            return (Criteria) this;
        }

        public Criteria andJineEqualTo(BigDecimal value) {
            addCriterion("JINE =", value, "jine");
            return (Criteria) this;
        }

        public Criteria andJineNotEqualTo(BigDecimal value) {
            addCriterion("JINE <>", value, "jine");
            return (Criteria) this;
        }

        public Criteria andJineGreaterThan(BigDecimal value) {
            addCriterion("JINE >", value, "jine");
            return (Criteria) this;
        }

        public Criteria andJineGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JINE >=", value, "jine");
            return (Criteria) this;
        }

        public Criteria andJineLessThan(BigDecimal value) {
            addCriterion("JINE <", value, "jine");
            return (Criteria) this;
        }

        public Criteria andJineLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JINE <=", value, "jine");
            return (Criteria) this;
        }

        public Criteria andJineIn(List<BigDecimal> values) {
            addCriterion("JINE in", values, "jine");
            return (Criteria) this;
        }

        public Criteria andJineNotIn(List<BigDecimal> values) {
            addCriterion("JINE not in", values, "jine");
            return (Criteria) this;
        }

        public Criteria andJineBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JINE between", value1, value2, "jine");
            return (Criteria) this;
        }

        public Criteria andJineNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JINE not between", value1, value2, "jine");
            return (Criteria) this;
        }

        public Criteria andShifoucishanIsNull() {
            addCriterion("SHIFOUCISHAN is null");
            return (Criteria) this;
        }

        public Criteria andShifoucishanIsNotNull() {
            addCriterion("SHIFOUCISHAN is not null");
            return (Criteria) this;
        }

        public Criteria andShifoucishanEqualTo(Short value) {
            addCriterion("SHIFOUCISHAN =", value, "shifoucishan");
            return (Criteria) this;
        }

        public Criteria andShifoucishanNotEqualTo(Short value) {
            addCriterion("SHIFOUCISHAN <>", value, "shifoucishan");
            return (Criteria) this;
        }

        public Criteria andShifoucishanGreaterThan(Short value) {
            addCriterion("SHIFOUCISHAN >", value, "shifoucishan");
            return (Criteria) this;
        }

        public Criteria andShifoucishanGreaterThanOrEqualTo(Short value) {
            addCriterion("SHIFOUCISHAN >=", value, "shifoucishan");
            return (Criteria) this;
        }

        public Criteria andShifoucishanLessThan(Short value) {
            addCriterion("SHIFOUCISHAN <", value, "shifoucishan");
            return (Criteria) this;
        }

        public Criteria andShifoucishanLessThanOrEqualTo(Short value) {
            addCriterion("SHIFOUCISHAN <=", value, "shifoucishan");
            return (Criteria) this;
        }

        public Criteria andShifoucishanIn(List<Short> values) {
            addCriterion("SHIFOUCISHAN in", values, "shifoucishan");
            return (Criteria) this;
        }

        public Criteria andShifoucishanNotIn(List<Short> values) {
            addCriterion("SHIFOUCISHAN not in", values, "shifoucishan");
            return (Criteria) this;
        }

        public Criteria andShifoucishanBetween(Short value1, Short value2) {
            addCriterion("SHIFOUCISHAN between", value1, value2, "shifoucishan");
            return (Criteria) this;
        }

        public Criteria andShifoucishanNotBetween(Short value1, Short value2) {
            addCriterion("SHIFOUCISHAN not between", value1, value2, "shifoucishan");
            return (Criteria) this;
        }

        public Criteria andHejiweituoIsNull() {
            addCriterion("HEJIWEITUO is null");
            return (Criteria) this;
        }

        public Criteria andHejiweituoIsNotNull() {
            addCriterion("HEJIWEITUO is not null");
            return (Criteria) this;
        }

        public Criteria andHejiweituoEqualTo(BigDecimal value) {
            addCriterion("HEJIWEITUO =", value, "hejiweituo");
            return (Criteria) this;
        }

        public Criteria andHejiweituoNotEqualTo(BigDecimal value) {
            addCriterion("HEJIWEITUO <>", value, "hejiweituo");
            return (Criteria) this;
        }

        public Criteria andHejiweituoGreaterThan(BigDecimal value) {
            addCriterion("HEJIWEITUO >", value, "hejiweituo");
            return (Criteria) this;
        }

        public Criteria andHejiweituoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJIWEITUO >=", value, "hejiweituo");
            return (Criteria) this;
        }

        public Criteria andHejiweituoLessThan(BigDecimal value) {
            addCriterion("HEJIWEITUO <", value, "hejiweituo");
            return (Criteria) this;
        }

        public Criteria andHejiweituoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJIWEITUO <=", value, "hejiweituo");
            return (Criteria) this;
        }

        public Criteria andHejiweituoIn(List<BigDecimal> values) {
            addCriterion("HEJIWEITUO in", values, "hejiweituo");
            return (Criteria) this;
        }

        public Criteria andHejiweituoNotIn(List<BigDecimal> values) {
            addCriterion("HEJIWEITUO not in", values, "hejiweituo");
            return (Criteria) this;
        }

        public Criteria andHejiweituoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJIWEITUO between", value1, value2, "hejiweituo");
            return (Criteria) this;
        }

        public Criteria andHejiweituoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJIWEITUO not between", value1, value2, "hejiweituo");
            return (Criteria) this;
        }

        public Criteria andHejishoutuoIsNull() {
            addCriterion("HEJISHOUTUO is null");
            return (Criteria) this;
        }

        public Criteria andHejishoutuoIsNotNull() {
            addCriterion("HEJISHOUTUO is not null");
            return (Criteria) this;
        }

        public Criteria andHejishoutuoEqualTo(BigDecimal value) {
            addCriterion("HEJISHOUTUO =", value, "hejishoutuo");
            return (Criteria) this;
        }

        public Criteria andHejishoutuoNotEqualTo(BigDecimal value) {
            addCriterion("HEJISHOUTUO <>", value, "hejishoutuo");
            return (Criteria) this;
        }

        public Criteria andHejishoutuoGreaterThan(BigDecimal value) {
            addCriterion("HEJISHOUTUO >", value, "hejishoutuo");
            return (Criteria) this;
        }

        public Criteria andHejishoutuoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJISHOUTUO >=", value, "hejishoutuo");
            return (Criteria) this;
        }

        public Criteria andHejishoutuoLessThan(BigDecimal value) {
            addCriterion("HEJISHOUTUO <", value, "hejishoutuo");
            return (Criteria) this;
        }

        public Criteria andHejishoutuoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HEJISHOUTUO <=", value, "hejishoutuo");
            return (Criteria) this;
        }

        public Criteria andHejishoutuoIn(List<BigDecimal> values) {
            addCriterion("HEJISHOUTUO in", values, "hejishoutuo");
            return (Criteria) this;
        }

        public Criteria andHejishoutuoNotIn(List<BigDecimal> values) {
            addCriterion("HEJISHOUTUO not in", values, "hejishoutuo");
            return (Criteria) this;
        }

        public Criteria andHejishoutuoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJISHOUTUO between", value1, value2, "hejishoutuo");
            return (Criteria) this;
        }

        public Criteria andHejishoutuoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEJISHOUTUO not between", value1, value2, "hejishoutuo");
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