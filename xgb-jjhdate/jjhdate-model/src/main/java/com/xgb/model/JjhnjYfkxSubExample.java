package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JjhnjYfkxSubExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JjhnjYfkxSubExample() {
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

        public Criteria andXiangmuIsNull() {
            addCriterion("XIANGMU is null");
            return (Criteria) this;
        }

        public Criteria andXiangmuIsNotNull() {
            addCriterion("XIANGMU is not null");
            return (Criteria) this;
        }

        public Criteria andXiangmuEqualTo(String value) {
            addCriterion("XIANGMU =", value, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andXiangmuNotEqualTo(String value) {
            addCriterion("XIANGMU <>", value, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andXiangmuGreaterThan(String value) {
            addCriterion("XIANGMU >", value, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andXiangmuGreaterThanOrEqualTo(String value) {
            addCriterion("XIANGMU >=", value, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andXiangmuLessThan(String value) {
            addCriterion("XIANGMU <", value, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andXiangmuLessThanOrEqualTo(String value) {
            addCriterion("XIANGMU <=", value, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andXiangmuLike(String value) {
            addCriterion("XIANGMU like", value, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andXiangmuNotLike(String value) {
            addCriterion("XIANGMU not like", value, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andXiangmuIn(List<String> values) {
            addCriterion("XIANGMU in", values, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andXiangmuNotIn(List<String> values) {
            addCriterion("XIANGMU not in", values, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andXiangmuBetween(String value1, String value2) {
            addCriterion("XIANGMU between", value1, value2, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andXiangmuNotBetween(String value1, String value2) {
            addCriterion("XIANGMU not between", value1, value2, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andNianchuyueIsNull() {
            addCriterion("NIANCHUYUE is null");
            return (Criteria) this;
        }

        public Criteria andNianchuyueIsNotNull() {
            addCriterion("NIANCHUYUE is not null");
            return (Criteria) this;
        }

        public Criteria andNianchuyueEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE =", value, "nianchuyue");
            return (Criteria) this;
        }

        public Criteria andNianchuyueNotEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE <>", value, "nianchuyue");
            return (Criteria) this;
        }

        public Criteria andNianchuyueGreaterThan(BigDecimal value) {
            addCriterion("NIANCHUYUE >", value, "nianchuyue");
            return (Criteria) this;
        }

        public Criteria andNianchuyueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE >=", value, "nianchuyue");
            return (Criteria) this;
        }

        public Criteria andNianchuyueLessThan(BigDecimal value) {
            addCriterion("NIANCHUYUE <", value, "nianchuyue");
            return (Criteria) this;
        }

        public Criteria andNianchuyueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANCHUYUE <=", value, "nianchuyue");
            return (Criteria) this;
        }

        public Criteria andNianchuyueIn(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE in", values, "nianchuyue");
            return (Criteria) this;
        }

        public Criteria andNianchuyueNotIn(List<BigDecimal> values) {
            addCriterion("NIANCHUYUE not in", values, "nianchuyue");
            return (Criteria) this;
        }

        public Criteria andNianchuyueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE between", value1, value2, "nianchuyue");
            return (Criteria) this;
        }

        public Criteria andNianchuyueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANCHUYUE not between", value1, value2, "nianchuyue");
            return (Criteria) this;
        }

        public Criteria andZengjiaeIsNull() {
            addCriterion("ZENGJIAE is null");
            return (Criteria) this;
        }

        public Criteria andZengjiaeIsNotNull() {
            addCriterion("ZENGJIAE is not null");
            return (Criteria) this;
        }

        public Criteria andZengjiaeEqualTo(BigDecimal value) {
            addCriterion("ZENGJIAE =", value, "zengjiae");
            return (Criteria) this;
        }

        public Criteria andZengjiaeNotEqualTo(BigDecimal value) {
            addCriterion("ZENGJIAE <>", value, "zengjiae");
            return (Criteria) this;
        }

        public Criteria andZengjiaeGreaterThan(BigDecimal value) {
            addCriterion("ZENGJIAE >", value, "zengjiae");
            return (Criteria) this;
        }

        public Criteria andZengjiaeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZENGJIAE >=", value, "zengjiae");
            return (Criteria) this;
        }

        public Criteria andZengjiaeLessThan(BigDecimal value) {
            addCriterion("ZENGJIAE <", value, "zengjiae");
            return (Criteria) this;
        }

        public Criteria andZengjiaeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZENGJIAE <=", value, "zengjiae");
            return (Criteria) this;
        }

        public Criteria andZengjiaeIn(List<BigDecimal> values) {
            addCriterion("ZENGJIAE in", values, "zengjiae");
            return (Criteria) this;
        }

        public Criteria andZengjiaeNotIn(List<BigDecimal> values) {
            addCriterion("ZENGJIAE not in", values, "zengjiae");
            return (Criteria) this;
        }

        public Criteria andZengjiaeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZENGJIAE between", value1, value2, "zengjiae");
            return (Criteria) this;
        }

        public Criteria andZengjiaeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZENGJIAE not between", value1, value2, "zengjiae");
            return (Criteria) this;
        }

        public Criteria andJianshaoeIsNull() {
            addCriterion("JIANSHAOE is null");
            return (Criteria) this;
        }

        public Criteria andJianshaoeIsNotNull() {
            addCriterion("JIANSHAOE is not null");
            return (Criteria) this;
        }

        public Criteria andJianshaoeEqualTo(BigDecimal value) {
            addCriterion("JIANSHAOE =", value, "jianshaoe");
            return (Criteria) this;
        }

        public Criteria andJianshaoeNotEqualTo(BigDecimal value) {
            addCriterion("JIANSHAOE <>", value, "jianshaoe");
            return (Criteria) this;
        }

        public Criteria andJianshaoeGreaterThan(BigDecimal value) {
            addCriterion("JIANSHAOE >", value, "jianshaoe");
            return (Criteria) this;
        }

        public Criteria andJianshaoeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JIANSHAOE >=", value, "jianshaoe");
            return (Criteria) this;
        }

        public Criteria andJianshaoeLessThan(BigDecimal value) {
            addCriterion("JIANSHAOE <", value, "jianshaoe");
            return (Criteria) this;
        }

        public Criteria andJianshaoeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JIANSHAOE <=", value, "jianshaoe");
            return (Criteria) this;
        }

        public Criteria andJianshaoeIn(List<BigDecimal> values) {
            addCriterion("JIANSHAOE in", values, "jianshaoe");
            return (Criteria) this;
        }

        public Criteria andJianshaoeNotIn(List<BigDecimal> values) {
            addCriterion("JIANSHAOE not in", values, "jianshaoe");
            return (Criteria) this;
        }

        public Criteria andJianshaoeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JIANSHAOE between", value1, value2, "jianshaoe");
            return (Criteria) this;
        }

        public Criteria andJianshaoeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JIANSHAOE not between", value1, value2, "jianshaoe");
            return (Criteria) this;
        }

        public Criteria andNianmoyueIsNull() {
            addCriterion("NIANMOYUE is null");
            return (Criteria) this;
        }

        public Criteria andNianmoyueIsNotNull() {
            addCriterion("NIANMOYUE is not null");
            return (Criteria) this;
        }

        public Criteria andNianmoyueEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE =", value, "nianmoyue");
            return (Criteria) this;
        }

        public Criteria andNianmoyueNotEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE <>", value, "nianmoyue");
            return (Criteria) this;
        }

        public Criteria andNianmoyueGreaterThan(BigDecimal value) {
            addCriterion("NIANMOYUE >", value, "nianmoyue");
            return (Criteria) this;
        }

        public Criteria andNianmoyueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE >=", value, "nianmoyue");
            return (Criteria) this;
        }

        public Criteria andNianmoyueLessThan(BigDecimal value) {
            addCriterion("NIANMOYUE <", value, "nianmoyue");
            return (Criteria) this;
        }

        public Criteria andNianmoyueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANMOYUE <=", value, "nianmoyue");
            return (Criteria) this;
        }

        public Criteria andNianmoyueIn(List<BigDecimal> values) {
            addCriterion("NIANMOYUE in", values, "nianmoyue");
            return (Criteria) this;
        }

        public Criteria andNianmoyueNotIn(List<BigDecimal> values) {
            addCriterion("NIANMOYUE not in", values, "nianmoyue");
            return (Criteria) this;
        }

        public Criteria andNianmoyueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE between", value1, value2, "nianmoyue");
            return (Criteria) this;
        }

        public Criteria andNianmoyueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANMOYUE not between", value1, value2, "nianmoyue");
            return (Criteria) this;
        }

        public Criteria andKehuIsNull() {
            addCriterion("KEHU is null");
            return (Criteria) this;
        }

        public Criteria andKehuIsNotNull() {
            addCriterion("KEHU is not null");
            return (Criteria) this;
        }

        public Criteria andKehuEqualTo(String value) {
            addCriterion("KEHU =", value, "kehu");
            return (Criteria) this;
        }

        public Criteria andKehuNotEqualTo(String value) {
            addCriterion("KEHU <>", value, "kehu");
            return (Criteria) this;
        }

        public Criteria andKehuGreaterThan(String value) {
            addCriterion("KEHU >", value, "kehu");
            return (Criteria) this;
        }

        public Criteria andKehuGreaterThanOrEqualTo(String value) {
            addCriterion("KEHU >=", value, "kehu");
            return (Criteria) this;
        }

        public Criteria andKehuLessThan(String value) {
            addCriterion("KEHU <", value, "kehu");
            return (Criteria) this;
        }

        public Criteria andKehuLessThanOrEqualTo(String value) {
            addCriterion("KEHU <=", value, "kehu");
            return (Criteria) this;
        }

        public Criteria andKehuLike(String value) {
            addCriterion("KEHU like", value, "kehu");
            return (Criteria) this;
        }

        public Criteria andKehuNotLike(String value) {
            addCriterion("KEHU not like", value, "kehu");
            return (Criteria) this;
        }

        public Criteria andKehuIn(List<String> values) {
            addCriterion("KEHU in", values, "kehu");
            return (Criteria) this;
        }

        public Criteria andKehuNotIn(List<String> values) {
            addCriterion("KEHU not in", values, "kehu");
            return (Criteria) this;
        }

        public Criteria andKehuBetween(String value1, String value2) {
            addCriterion("KEHU between", value1, value2, "kehu");
            return (Criteria) this;
        }

        public Criteria andKehuNotBetween(String value1, String value2) {
            addCriterion("KEHU not between", value1, value2, "kehu");
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