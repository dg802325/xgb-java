package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JjhnjZhdgyxmdezhfdxSubExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JjhnjZhdgyxmdezhfdxSubExample() {
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

        public Criteria andXiangmumingchengIsNull() {
            addCriterion("XIANGMUMINGCHENG is null");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengIsNotNull() {
            addCriterion("XIANGMUMINGCHENG is not null");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengEqualTo(String value) {
            addCriterion("XIANGMUMINGCHENG =", value, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengNotEqualTo(String value) {
            addCriterion("XIANGMUMINGCHENG <>", value, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengGreaterThan(String value) {
            addCriterion("XIANGMUMINGCHENG >", value, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengGreaterThanOrEqualTo(String value) {
            addCriterion("XIANGMUMINGCHENG >=", value, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengLessThan(String value) {
            addCriterion("XIANGMUMINGCHENG <", value, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengLessThanOrEqualTo(String value) {
            addCriterion("XIANGMUMINGCHENG <=", value, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengLike(String value) {
            addCriterion("XIANGMUMINGCHENG like", value, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengNotLike(String value) {
            addCriterion("XIANGMUMINGCHENG not like", value, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengIn(List<String> values) {
            addCriterion("XIANGMUMINGCHENG in", values, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengNotIn(List<String> values) {
            addCriterion("XIANGMUMINGCHENG not in", values, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengBetween(String value1, String value2) {
            addCriterion("XIANGMUMINGCHENG between", value1, value2, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengNotBetween(String value1, String value2) {
            addCriterion("XIANGMUMINGCHENG not between", value1, value2, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andDaezhifuduixiangIsNull() {
            addCriterion("DAEZHIFUDUIXIANG is null");
            return (Criteria) this;
        }

        public Criteria andDaezhifuduixiangIsNotNull() {
            addCriterion("DAEZHIFUDUIXIANG is not null");
            return (Criteria) this;
        }

        public Criteria andDaezhifuduixiangEqualTo(String value) {
            addCriterion("DAEZHIFUDUIXIANG =", value, "daezhifuduixiang");
            return (Criteria) this;
        }

        public Criteria andDaezhifuduixiangNotEqualTo(String value) {
            addCriterion("DAEZHIFUDUIXIANG <>", value, "daezhifuduixiang");
            return (Criteria) this;
        }

        public Criteria andDaezhifuduixiangGreaterThan(String value) {
            addCriterion("DAEZHIFUDUIXIANG >", value, "daezhifuduixiang");
            return (Criteria) this;
        }

        public Criteria andDaezhifuduixiangGreaterThanOrEqualTo(String value) {
            addCriterion("DAEZHIFUDUIXIANG >=", value, "daezhifuduixiang");
            return (Criteria) this;
        }

        public Criteria andDaezhifuduixiangLessThan(String value) {
            addCriterion("DAEZHIFUDUIXIANG <", value, "daezhifuduixiang");
            return (Criteria) this;
        }

        public Criteria andDaezhifuduixiangLessThanOrEqualTo(String value) {
            addCriterion("DAEZHIFUDUIXIANG <=", value, "daezhifuduixiang");
            return (Criteria) this;
        }

        public Criteria andDaezhifuduixiangLike(String value) {
            addCriterion("DAEZHIFUDUIXIANG like", value, "daezhifuduixiang");
            return (Criteria) this;
        }

        public Criteria andDaezhifuduixiangNotLike(String value) {
            addCriterion("DAEZHIFUDUIXIANG not like", value, "daezhifuduixiang");
            return (Criteria) this;
        }

        public Criteria andDaezhifuduixiangIn(List<String> values) {
            addCriterion("DAEZHIFUDUIXIANG in", values, "daezhifuduixiang");
            return (Criteria) this;
        }

        public Criteria andDaezhifuduixiangNotIn(List<String> values) {
            addCriterion("DAEZHIFUDUIXIANG not in", values, "daezhifuduixiang");
            return (Criteria) this;
        }

        public Criteria andDaezhifuduixiangBetween(String value1, String value2) {
            addCriterion("DAEZHIFUDUIXIANG between", value1, value2, "daezhifuduixiang");
            return (Criteria) this;
        }

        public Criteria andDaezhifuduixiangNotBetween(String value1, String value2) {
            addCriterion("DAEZHIFUDUIXIANG not between", value1, value2, "daezhifuduixiang");
            return (Criteria) this;
        }

        public Criteria andZhifujineIsNull() {
            addCriterion("ZHIFUJINE is null");
            return (Criteria) this;
        }

        public Criteria andZhifujineIsNotNull() {
            addCriterion("ZHIFUJINE is not null");
            return (Criteria) this;
        }

        public Criteria andZhifujineEqualTo(BigDecimal value) {
            addCriterion("ZHIFUJINE =", value, "zhifujine");
            return (Criteria) this;
        }

        public Criteria andZhifujineNotEqualTo(BigDecimal value) {
            addCriterion("ZHIFUJINE <>", value, "zhifujine");
            return (Criteria) this;
        }

        public Criteria andZhifujineGreaterThan(BigDecimal value) {
            addCriterion("ZHIFUJINE >", value, "zhifujine");
            return (Criteria) this;
        }

        public Criteria andZhifujineGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHIFUJINE >=", value, "zhifujine");
            return (Criteria) this;
        }

        public Criteria andZhifujineLessThan(BigDecimal value) {
            addCriterion("ZHIFUJINE <", value, "zhifujine");
            return (Criteria) this;
        }

        public Criteria andZhifujineLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHIFUJINE <=", value, "zhifujine");
            return (Criteria) this;
        }

        public Criteria andZhifujineIn(List<BigDecimal> values) {
            addCriterion("ZHIFUJINE in", values, "zhifujine");
            return (Criteria) this;
        }

        public Criteria andZhifujineNotIn(List<BigDecimal> values) {
            addCriterion("ZHIFUJINE not in", values, "zhifujine");
            return (Criteria) this;
        }

        public Criteria andZhifujineBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHIFUJINE between", value1, value2, "zhifujine");
            return (Criteria) this;
        }

        public Criteria andZhifujineNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHIFUJINE not between", value1, value2, "zhifujine");
            return (Criteria) this;
        }

        public Criteria andBiliIsNull() {
            addCriterion("BILI is null");
            return (Criteria) this;
        }

        public Criteria andBiliIsNotNull() {
            addCriterion("BILI is not null");
            return (Criteria) this;
        }

        public Criteria andBiliEqualTo(String value) {
            addCriterion("BILI =", value, "bili");
            return (Criteria) this;
        }

        public Criteria andBiliNotEqualTo(String value) {
            addCriterion("BILI <>", value, "bili");
            return (Criteria) this;
        }

        public Criteria andBiliGreaterThan(String value) {
            addCriterion("BILI >", value, "bili");
            return (Criteria) this;
        }

        public Criteria andBiliGreaterThanOrEqualTo(String value) {
            addCriterion("BILI >=", value, "bili");
            return (Criteria) this;
        }

        public Criteria andBiliLessThan(String value) {
            addCriterion("BILI <", value, "bili");
            return (Criteria) this;
        }

        public Criteria andBiliLessThanOrEqualTo(String value) {
            addCriterion("BILI <=", value, "bili");
            return (Criteria) this;
        }

        public Criteria andBiliLike(String value) {
            addCriterion("BILI like", value, "bili");
            return (Criteria) this;
        }

        public Criteria andBiliNotLike(String value) {
            addCriterion("BILI not like", value, "bili");
            return (Criteria) this;
        }

        public Criteria andBiliIn(List<String> values) {
            addCriterion("BILI in", values, "bili");
            return (Criteria) this;
        }

        public Criteria andBiliNotIn(List<String> values) {
            addCriterion("BILI not in", values, "bili");
            return (Criteria) this;
        }

        public Criteria andBiliBetween(String value1, String value2) {
            addCriterion("BILI between", value1, value2, "bili");
            return (Criteria) this;
        }

        public Criteria andBiliNotBetween(String value1, String value2) {
            addCriterion("BILI not between", value1, value2, "bili");
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