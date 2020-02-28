package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JjhnjYzhdqkSubExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JjhnjYzhdqkSubExample() {
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

        public Criteria andXiangmuzhichuIsNull() {
            addCriterion("XIANGMUZHICHU is null");
            return (Criteria) this;
        }

        public Criteria andXiangmuzhichuIsNotNull() {
            addCriterion("XIANGMUZHICHU is not null");
            return (Criteria) this;
        }

        public Criteria andXiangmuzhichuEqualTo(BigDecimal value) {
            addCriterion("XIANGMUZHICHU =", value, "xiangmuzhichu");
            return (Criteria) this;
        }

        public Criteria andXiangmuzhichuNotEqualTo(BigDecimal value) {
            addCriterion("XIANGMUZHICHU <>", value, "xiangmuzhichu");
            return (Criteria) this;
        }

        public Criteria andXiangmuzhichuGreaterThan(BigDecimal value) {
            addCriterion("XIANGMUZHICHU >", value, "xiangmuzhichu");
            return (Criteria) this;
        }

        public Criteria andXiangmuzhichuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANGMUZHICHU >=", value, "xiangmuzhichu");
            return (Criteria) this;
        }

        public Criteria andXiangmuzhichuLessThan(BigDecimal value) {
            addCriterion("XIANGMUZHICHU <", value, "xiangmuzhichu");
            return (Criteria) this;
        }

        public Criteria andXiangmuzhichuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XIANGMUZHICHU <=", value, "xiangmuzhichu");
            return (Criteria) this;
        }

        public Criteria andXiangmuzhichuIn(List<BigDecimal> values) {
            addCriterion("XIANGMUZHICHU in", values, "xiangmuzhichu");
            return (Criteria) this;
        }

        public Criteria andXiangmuzhichuNotIn(List<BigDecimal> values) {
            addCriterion("XIANGMUZHICHU not in", values, "xiangmuzhichu");
            return (Criteria) this;
        }

        public Criteria andXiangmuzhichuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANGMUZHICHU between", value1, value2, "xiangmuzhichu");
            return (Criteria) this;
        }

        public Criteria andXiangmuzhichuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XIANGMUZHICHU not between", value1, value2, "xiangmuzhichu");
            return (Criteria) this;
        }

        public Criteria andMinshengbaozhangIsNull() {
            addCriterion("MINSHENGBAOZHANG is null");
            return (Criteria) this;
        }

        public Criteria andMinshengbaozhangIsNotNull() {
            addCriterion("MINSHENGBAOZHANG is not null");
            return (Criteria) this;
        }

        public Criteria andMinshengbaozhangEqualTo(Object value) {
            addCriterion("MINSHENGBAOZHANG =", value, "minshengbaozhang");
            return (Criteria) this;
        }

        public Criteria andMinshengbaozhangNotEqualTo(Object value) {
            addCriterion("MINSHENGBAOZHANG <>", value, "minshengbaozhang");
            return (Criteria) this;
        }

        public Criteria andMinshengbaozhangGreaterThan(Object value) {
            addCriterion("MINSHENGBAOZHANG >", value, "minshengbaozhang");
            return (Criteria) this;
        }

        public Criteria andMinshengbaozhangGreaterThanOrEqualTo(Object value) {
            addCriterion("MINSHENGBAOZHANG >=", value, "minshengbaozhang");
            return (Criteria) this;
        }

        public Criteria andMinshengbaozhangLessThan(Object value) {
            addCriterion("MINSHENGBAOZHANG <", value, "minshengbaozhang");
            return (Criteria) this;
        }

        public Criteria andMinshengbaozhangLessThanOrEqualTo(Object value) {
            addCriterion("MINSHENGBAOZHANG <=", value, "minshengbaozhang");
            return (Criteria) this;
        }

        public Criteria andMinshengbaozhangIn(List<Object> values) {
            addCriterion("MINSHENGBAOZHANG in", values, "minshengbaozhang");
            return (Criteria) this;
        }

        public Criteria andMinshengbaozhangNotIn(List<Object> values) {
            addCriterion("MINSHENGBAOZHANG not in", values, "minshengbaozhang");
            return (Criteria) this;
        }

        public Criteria andMinshengbaozhangBetween(Object value1, Object value2) {
            addCriterion("MINSHENGBAOZHANG between", value1, value2, "minshengbaozhang");
            return (Criteria) this;
        }

        public Criteria andMinshengbaozhangNotBetween(Object value1, Object value2) {
            addCriterion("MINSHENGBAOZHANG not between", value1, value2, "minshengbaozhang");
            return (Criteria) this;
        }

        public Criteria andFupinjikunIsNull() {
            addCriterion("FUPINJIKUN is null");
            return (Criteria) this;
        }

        public Criteria andFupinjikunIsNotNull() {
            addCriterion("FUPINJIKUN is not null");
            return (Criteria) this;
        }

        public Criteria andFupinjikunEqualTo(Object value) {
            addCriterion("FUPINJIKUN =", value, "fupinjikun");
            return (Criteria) this;
        }

        public Criteria andFupinjikunNotEqualTo(Object value) {
            addCriterion("FUPINJIKUN <>", value, "fupinjikun");
            return (Criteria) this;
        }

        public Criteria andFupinjikunGreaterThan(Object value) {
            addCriterion("FUPINJIKUN >", value, "fupinjikun");
            return (Criteria) this;
        }

        public Criteria andFupinjikunGreaterThanOrEqualTo(Object value) {
            addCriterion("FUPINJIKUN >=", value, "fupinjikun");
            return (Criteria) this;
        }

        public Criteria andFupinjikunLessThan(Object value) {
            addCriterion("FUPINJIKUN <", value, "fupinjikun");
            return (Criteria) this;
        }

        public Criteria andFupinjikunLessThanOrEqualTo(Object value) {
            addCriterion("FUPINJIKUN <=", value, "fupinjikun");
            return (Criteria) this;
        }

        public Criteria andFupinjikunIn(List<Object> values) {
            addCriterion("FUPINJIKUN in", values, "fupinjikun");
            return (Criteria) this;
        }

        public Criteria andFupinjikunNotIn(List<Object> values) {
            addCriterion("FUPINJIKUN not in", values, "fupinjikun");
            return (Criteria) this;
        }

        public Criteria andFupinjikunBetween(Object value1, Object value2) {
            addCriterion("FUPINJIKUN between", value1, value2, "fupinjikun");
            return (Criteria) this;
        }

        public Criteria andFupinjikunNotBetween(Object value1, Object value2) {
            addCriterion("FUPINJIKUN not between", value1, value2, "fupinjikun");
            return (Criteria) this;
        }

        public Criteria andQitaIsNull() {
            addCriterion("QITA is null");
            return (Criteria) this;
        }

        public Criteria andQitaIsNotNull() {
            addCriterion("QITA is not null");
            return (Criteria) this;
        }

        public Criteria andQitaEqualTo(Object value) {
            addCriterion("QITA =", value, "qita");
            return (Criteria) this;
        }

        public Criteria andQitaNotEqualTo(Object value) {
            addCriterion("QITA <>", value, "qita");
            return (Criteria) this;
        }

        public Criteria andQitaGreaterThan(Object value) {
            addCriterion("QITA >", value, "qita");
            return (Criteria) this;
        }

        public Criteria andQitaGreaterThanOrEqualTo(Object value) {
            addCriterion("QITA >=", value, "qita");
            return (Criteria) this;
        }

        public Criteria andQitaLessThan(Object value) {
            addCriterion("QITA <", value, "qita");
            return (Criteria) this;
        }

        public Criteria andQitaLessThanOrEqualTo(Object value) {
            addCriterion("QITA <=", value, "qita");
            return (Criteria) this;
        }

        public Criteria andQitaIn(List<Object> values) {
            addCriterion("QITA in", values, "qita");
            return (Criteria) this;
        }

        public Criteria andQitaNotIn(List<Object> values) {
            addCriterion("QITA not in", values, "qita");
            return (Criteria) this;
        }

        public Criteria andQitaBetween(Object value1, Object value2) {
            addCriterion("QITA between", value1, value2, "qita");
            return (Criteria) this;
        }

        public Criteria andQitaNotBetween(Object value1, Object value2) {
            addCriterion("QITA not between", value1, value2, "qita");
            return (Criteria) this;
        }

        public Criteria andXiangmuneirongIsNull() {
            addCriterion("XIANGMUNEIRONG is null");
            return (Criteria) this;
        }

        public Criteria andXiangmuneirongIsNotNull() {
            addCriterion("XIANGMUNEIRONG is not null");
            return (Criteria) this;
        }

        public Criteria andXiangmuneirongEqualTo(String value) {
            addCriterion("XIANGMUNEIRONG =", value, "xiangmuneirong");
            return (Criteria) this;
        }

        public Criteria andXiangmuneirongNotEqualTo(String value) {
            addCriterion("XIANGMUNEIRONG <>", value, "xiangmuneirong");
            return (Criteria) this;
        }

        public Criteria andXiangmuneirongGreaterThan(String value) {
            addCriterion("XIANGMUNEIRONG >", value, "xiangmuneirong");
            return (Criteria) this;
        }

        public Criteria andXiangmuneirongGreaterThanOrEqualTo(String value) {
            addCriterion("XIANGMUNEIRONG >=", value, "xiangmuneirong");
            return (Criteria) this;
        }

        public Criteria andXiangmuneirongLessThan(String value) {
            addCriterion("XIANGMUNEIRONG <", value, "xiangmuneirong");
            return (Criteria) this;
        }

        public Criteria andXiangmuneirongLessThanOrEqualTo(String value) {
            addCriterion("XIANGMUNEIRONG <=", value, "xiangmuneirong");
            return (Criteria) this;
        }

        public Criteria andXiangmuneirongLike(String value) {
            addCriterion("XIANGMUNEIRONG like", value, "xiangmuneirong");
            return (Criteria) this;
        }

        public Criteria andXiangmuneirongNotLike(String value) {
            addCriterion("XIANGMUNEIRONG not like", value, "xiangmuneirong");
            return (Criteria) this;
        }

        public Criteria andXiangmuneirongIn(List<String> values) {
            addCriterion("XIANGMUNEIRONG in", values, "xiangmuneirong");
            return (Criteria) this;
        }

        public Criteria andXiangmuneirongNotIn(List<String> values) {
            addCriterion("XIANGMUNEIRONG not in", values, "xiangmuneirong");
            return (Criteria) this;
        }

        public Criteria andXiangmuneirongBetween(String value1, String value2) {
            addCriterion("XIANGMUNEIRONG between", value1, value2, "xiangmuneirong");
            return (Criteria) this;
        }

        public Criteria andXiangmuneirongNotBetween(String value1, String value2) {
            addCriterion("XIANGMUNEIRONG not between", value1, value2, "xiangmuneirong");
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

        public Criteria andLasaIsNull() {
            addCriterion("LASA is null");
            return (Criteria) this;
        }

        public Criteria andLasaIsNotNull() {
            addCriterion("LASA is not null");
            return (Criteria) this;
        }

        public Criteria andLasaEqualTo(Object value) {
            addCriterion("LASA =", value, "lasa");
            return (Criteria) this;
        }

        public Criteria andLasaNotEqualTo(Object value) {
            addCriterion("LASA <>", value, "lasa");
            return (Criteria) this;
        }

        public Criteria andLasaGreaterThan(Object value) {
            addCriterion("LASA >", value, "lasa");
            return (Criteria) this;
        }

        public Criteria andLasaGreaterThanOrEqualTo(Object value) {
            addCriterion("LASA >=", value, "lasa");
            return (Criteria) this;
        }

        public Criteria andLasaLessThan(Object value) {
            addCriterion("LASA <", value, "lasa");
            return (Criteria) this;
        }

        public Criteria andLasaLessThanOrEqualTo(Object value) {
            addCriterion("LASA <=", value, "lasa");
            return (Criteria) this;
        }

        public Criteria andLasaIn(List<Object> values) {
            addCriterion("LASA in", values, "lasa");
            return (Criteria) this;
        }

        public Criteria andLasaNotIn(List<Object> values) {
            addCriterion("LASA not in", values, "lasa");
            return (Criteria) this;
        }

        public Criteria andLasaBetween(Object value1, Object value2) {
            addCriterion("LASA between", value1, value2, "lasa");
            return (Criteria) this;
        }

        public Criteria andLasaNotBetween(Object value1, Object value2) {
            addCriterion("LASA not between", value1, value2, "lasa");
            return (Criteria) this;
        }

        public Criteria andRikazeIsNull() {
            addCriterion("RIKAZE is null");
            return (Criteria) this;
        }

        public Criteria andRikazeIsNotNull() {
            addCriterion("RIKAZE is not null");
            return (Criteria) this;
        }

        public Criteria andRikazeEqualTo(Object value) {
            addCriterion("RIKAZE =", value, "rikaze");
            return (Criteria) this;
        }

        public Criteria andRikazeNotEqualTo(Object value) {
            addCriterion("RIKAZE <>", value, "rikaze");
            return (Criteria) this;
        }

        public Criteria andRikazeGreaterThan(Object value) {
            addCriterion("RIKAZE >", value, "rikaze");
            return (Criteria) this;
        }

        public Criteria andRikazeGreaterThanOrEqualTo(Object value) {
            addCriterion("RIKAZE >=", value, "rikaze");
            return (Criteria) this;
        }

        public Criteria andRikazeLessThan(Object value) {
            addCriterion("RIKAZE <", value, "rikaze");
            return (Criteria) this;
        }

        public Criteria andRikazeLessThanOrEqualTo(Object value) {
            addCriterion("RIKAZE <=", value, "rikaze");
            return (Criteria) this;
        }

        public Criteria andRikazeIn(List<Object> values) {
            addCriterion("RIKAZE in", values, "rikaze");
            return (Criteria) this;
        }

        public Criteria andRikazeNotIn(List<Object> values) {
            addCriterion("RIKAZE not in", values, "rikaze");
            return (Criteria) this;
        }

        public Criteria andRikazeBetween(Object value1, Object value2) {
            addCriterion("RIKAZE between", value1, value2, "rikaze");
            return (Criteria) this;
        }

        public Criteria andRikazeNotBetween(Object value1, Object value2) {
            addCriterion("RIKAZE not between", value1, value2, "rikaze");
            return (Criteria) this;
        }

        public Criteria andChangdudiquIsNull() {
            addCriterion("CHANGDUDIQU is null");
            return (Criteria) this;
        }

        public Criteria andChangdudiquIsNotNull() {
            addCriterion("CHANGDUDIQU is not null");
            return (Criteria) this;
        }

        public Criteria andChangdudiquEqualTo(Object value) {
            addCriterion("CHANGDUDIQU =", value, "changdudiqu");
            return (Criteria) this;
        }

        public Criteria andChangdudiquNotEqualTo(Object value) {
            addCriterion("CHANGDUDIQU <>", value, "changdudiqu");
            return (Criteria) this;
        }

        public Criteria andChangdudiquGreaterThan(Object value) {
            addCriterion("CHANGDUDIQU >", value, "changdudiqu");
            return (Criteria) this;
        }

        public Criteria andChangdudiquGreaterThanOrEqualTo(Object value) {
            addCriterion("CHANGDUDIQU >=", value, "changdudiqu");
            return (Criteria) this;
        }

        public Criteria andChangdudiquLessThan(Object value) {
            addCriterion("CHANGDUDIQU <", value, "changdudiqu");
            return (Criteria) this;
        }

        public Criteria andChangdudiquLessThanOrEqualTo(Object value) {
            addCriterion("CHANGDUDIQU <=", value, "changdudiqu");
            return (Criteria) this;
        }

        public Criteria andChangdudiquIn(List<Object> values) {
            addCriterion("CHANGDUDIQU in", values, "changdudiqu");
            return (Criteria) this;
        }

        public Criteria andChangdudiquNotIn(List<Object> values) {
            addCriterion("CHANGDUDIQU not in", values, "changdudiqu");
            return (Criteria) this;
        }

        public Criteria andChangdudiquBetween(Object value1, Object value2) {
            addCriterion("CHANGDUDIQU between", value1, value2, "changdudiqu");
            return (Criteria) this;
        }

        public Criteria andChangdudiquNotBetween(Object value1, Object value2) {
            addCriterion("CHANGDUDIQU not between", value1, value2, "changdudiqu");
            return (Criteria) this;
        }

        public Criteria andShannandiquIsNull() {
            addCriterion("SHANNANDIQU is null");
            return (Criteria) this;
        }

        public Criteria andShannandiquIsNotNull() {
            addCriterion("SHANNANDIQU is not null");
            return (Criteria) this;
        }

        public Criteria andShannandiquEqualTo(Object value) {
            addCriterion("SHANNANDIQU =", value, "shannandiqu");
            return (Criteria) this;
        }

        public Criteria andShannandiquNotEqualTo(Object value) {
            addCriterion("SHANNANDIQU <>", value, "shannandiqu");
            return (Criteria) this;
        }

        public Criteria andShannandiquGreaterThan(Object value) {
            addCriterion("SHANNANDIQU >", value, "shannandiqu");
            return (Criteria) this;
        }

        public Criteria andShannandiquGreaterThanOrEqualTo(Object value) {
            addCriterion("SHANNANDIQU >=", value, "shannandiqu");
            return (Criteria) this;
        }

        public Criteria andShannandiquLessThan(Object value) {
            addCriterion("SHANNANDIQU <", value, "shannandiqu");
            return (Criteria) this;
        }

        public Criteria andShannandiquLessThanOrEqualTo(Object value) {
            addCriterion("SHANNANDIQU <=", value, "shannandiqu");
            return (Criteria) this;
        }

        public Criteria andShannandiquIn(List<Object> values) {
            addCriterion("SHANNANDIQU in", values, "shannandiqu");
            return (Criteria) this;
        }

        public Criteria andShannandiquNotIn(List<Object> values) {
            addCriterion("SHANNANDIQU not in", values, "shannandiqu");
            return (Criteria) this;
        }

        public Criteria andShannandiquBetween(Object value1, Object value2) {
            addCriterion("SHANNANDIQU between", value1, value2, "shannandiqu");
            return (Criteria) this;
        }

        public Criteria andShannandiquNotBetween(Object value1, Object value2) {
            addCriterion("SHANNANDIQU not between", value1, value2, "shannandiqu");
            return (Criteria) this;
        }

        public Criteria andNaqudiquIsNull() {
            addCriterion("NAQUDIQU is null");
            return (Criteria) this;
        }

        public Criteria andNaqudiquIsNotNull() {
            addCriterion("NAQUDIQU is not null");
            return (Criteria) this;
        }

        public Criteria andNaqudiquEqualTo(Object value) {
            addCriterion("NAQUDIQU =", value, "naqudiqu");
            return (Criteria) this;
        }

        public Criteria andNaqudiquNotEqualTo(Object value) {
            addCriterion("NAQUDIQU <>", value, "naqudiqu");
            return (Criteria) this;
        }

        public Criteria andNaqudiquGreaterThan(Object value) {
            addCriterion("NAQUDIQU >", value, "naqudiqu");
            return (Criteria) this;
        }

        public Criteria andNaqudiquGreaterThanOrEqualTo(Object value) {
            addCriterion("NAQUDIQU >=", value, "naqudiqu");
            return (Criteria) this;
        }

        public Criteria andNaqudiquLessThan(Object value) {
            addCriterion("NAQUDIQU <", value, "naqudiqu");
            return (Criteria) this;
        }

        public Criteria andNaqudiquLessThanOrEqualTo(Object value) {
            addCriterion("NAQUDIQU <=", value, "naqudiqu");
            return (Criteria) this;
        }

        public Criteria andNaqudiquIn(List<Object> values) {
            addCriterion("NAQUDIQU in", values, "naqudiqu");
            return (Criteria) this;
        }

        public Criteria andNaqudiquNotIn(List<Object> values) {
            addCriterion("NAQUDIQU not in", values, "naqudiqu");
            return (Criteria) this;
        }

        public Criteria andNaqudiquBetween(Object value1, Object value2) {
            addCriterion("NAQUDIQU between", value1, value2, "naqudiqu");
            return (Criteria) this;
        }

        public Criteria andNaqudiquNotBetween(Object value1, Object value2) {
            addCriterion("NAQUDIQU not between", value1, value2, "naqudiqu");
            return (Criteria) this;
        }

        public Criteria andAlidiquIsNull() {
            addCriterion("ALIDIQU is null");
            return (Criteria) this;
        }

        public Criteria andAlidiquIsNotNull() {
            addCriterion("ALIDIQU is not null");
            return (Criteria) this;
        }

        public Criteria andAlidiquEqualTo(Object value) {
            addCriterion("ALIDIQU =", value, "alidiqu");
            return (Criteria) this;
        }

        public Criteria andAlidiquNotEqualTo(Object value) {
            addCriterion("ALIDIQU <>", value, "alidiqu");
            return (Criteria) this;
        }

        public Criteria andAlidiquGreaterThan(Object value) {
            addCriterion("ALIDIQU >", value, "alidiqu");
            return (Criteria) this;
        }

        public Criteria andAlidiquGreaterThanOrEqualTo(Object value) {
            addCriterion("ALIDIQU >=", value, "alidiqu");
            return (Criteria) this;
        }

        public Criteria andAlidiquLessThan(Object value) {
            addCriterion("ALIDIQU <", value, "alidiqu");
            return (Criteria) this;
        }

        public Criteria andAlidiquLessThanOrEqualTo(Object value) {
            addCriterion("ALIDIQU <=", value, "alidiqu");
            return (Criteria) this;
        }

        public Criteria andAlidiquIn(List<Object> values) {
            addCriterion("ALIDIQU in", values, "alidiqu");
            return (Criteria) this;
        }

        public Criteria andAlidiquNotIn(List<Object> values) {
            addCriterion("ALIDIQU not in", values, "alidiqu");
            return (Criteria) this;
        }

        public Criteria andAlidiquBetween(Object value1, Object value2) {
            addCriterion("ALIDIQU between", value1, value2, "alidiqu");
            return (Criteria) this;
        }

        public Criteria andAlidiquNotBetween(Object value1, Object value2) {
            addCriterion("ALIDIQU not between", value1, value2, "alidiqu");
            return (Criteria) this;
        }

        public Criteria andLinzhidiquIsNull() {
            addCriterion("LINZHIDIQU is null");
            return (Criteria) this;
        }

        public Criteria andLinzhidiquIsNotNull() {
            addCriterion("LINZHIDIQU is not null");
            return (Criteria) this;
        }

        public Criteria andLinzhidiquEqualTo(Object value) {
            addCriterion("LINZHIDIQU =", value, "linzhidiqu");
            return (Criteria) this;
        }

        public Criteria andLinzhidiquNotEqualTo(Object value) {
            addCriterion("LINZHIDIQU <>", value, "linzhidiqu");
            return (Criteria) this;
        }

        public Criteria andLinzhidiquGreaterThan(Object value) {
            addCriterion("LINZHIDIQU >", value, "linzhidiqu");
            return (Criteria) this;
        }

        public Criteria andLinzhidiquGreaterThanOrEqualTo(Object value) {
            addCriterion("LINZHIDIQU >=", value, "linzhidiqu");
            return (Criteria) this;
        }

        public Criteria andLinzhidiquLessThan(Object value) {
            addCriterion("LINZHIDIQU <", value, "linzhidiqu");
            return (Criteria) this;
        }

        public Criteria andLinzhidiquLessThanOrEqualTo(Object value) {
            addCriterion("LINZHIDIQU <=", value, "linzhidiqu");
            return (Criteria) this;
        }

        public Criteria andLinzhidiquIn(List<Object> values) {
            addCriterion("LINZHIDIQU in", values, "linzhidiqu");
            return (Criteria) this;
        }

        public Criteria andLinzhidiquNotIn(List<Object> values) {
            addCriterion("LINZHIDIQU not in", values, "linzhidiqu");
            return (Criteria) this;
        }

        public Criteria andLinzhidiquBetween(Object value1, Object value2) {
            addCriterion("LINZHIDIQU between", value1, value2, "linzhidiqu");
            return (Criteria) this;
        }

        public Criteria andLinzhidiquNotBetween(Object value1, Object value2) {
            addCriterion("LINZHIDIQU not between", value1, value2, "linzhidiqu");
            return (Criteria) this;
        }

        public Criteria andQinghaizangquIsNull() {
            addCriterion("QINGHAIZANGQU is null");
            return (Criteria) this;
        }

        public Criteria andQinghaizangquIsNotNull() {
            addCriterion("QINGHAIZANGQU is not null");
            return (Criteria) this;
        }

        public Criteria andQinghaizangquEqualTo(Object value) {
            addCriterion("QINGHAIZANGQU =", value, "qinghaizangqu");
            return (Criteria) this;
        }

        public Criteria andQinghaizangquNotEqualTo(Object value) {
            addCriterion("QINGHAIZANGQU <>", value, "qinghaizangqu");
            return (Criteria) this;
        }

        public Criteria andQinghaizangquGreaterThan(Object value) {
            addCriterion("QINGHAIZANGQU >", value, "qinghaizangqu");
            return (Criteria) this;
        }

        public Criteria andQinghaizangquGreaterThanOrEqualTo(Object value) {
            addCriterion("QINGHAIZANGQU >=", value, "qinghaizangqu");
            return (Criteria) this;
        }

        public Criteria andQinghaizangquLessThan(Object value) {
            addCriterion("QINGHAIZANGQU <", value, "qinghaizangqu");
            return (Criteria) this;
        }

        public Criteria andQinghaizangquLessThanOrEqualTo(Object value) {
            addCriterion("QINGHAIZANGQU <=", value, "qinghaizangqu");
            return (Criteria) this;
        }

        public Criteria andQinghaizangquIn(List<Object> values) {
            addCriterion("QINGHAIZANGQU in", values, "qinghaizangqu");
            return (Criteria) this;
        }

        public Criteria andQinghaizangquNotIn(List<Object> values) {
            addCriterion("QINGHAIZANGQU not in", values, "qinghaizangqu");
            return (Criteria) this;
        }

        public Criteria andQinghaizangquBetween(Object value1, Object value2) {
            addCriterion("QINGHAIZANGQU between", value1, value2, "qinghaizangqu");
            return (Criteria) this;
        }

        public Criteria andQinghaizangquNotBetween(Object value1, Object value2) {
            addCriterion("QINGHAIZANGQU not between", value1, value2, "qinghaizangqu");
            return (Criteria) this;
        }

        public Criteria andSichuanzangquIsNull() {
            addCriterion("SICHUANZANGQU is null");
            return (Criteria) this;
        }

        public Criteria andSichuanzangquIsNotNull() {
            addCriterion("SICHUANZANGQU is not null");
            return (Criteria) this;
        }

        public Criteria andSichuanzangquEqualTo(Object value) {
            addCriterion("SICHUANZANGQU =", value, "sichuanzangqu");
            return (Criteria) this;
        }

        public Criteria andSichuanzangquNotEqualTo(Object value) {
            addCriterion("SICHUANZANGQU <>", value, "sichuanzangqu");
            return (Criteria) this;
        }

        public Criteria andSichuanzangquGreaterThan(Object value) {
            addCriterion("SICHUANZANGQU >", value, "sichuanzangqu");
            return (Criteria) this;
        }

        public Criteria andSichuanzangquGreaterThanOrEqualTo(Object value) {
            addCriterion("SICHUANZANGQU >=", value, "sichuanzangqu");
            return (Criteria) this;
        }

        public Criteria andSichuanzangquLessThan(Object value) {
            addCriterion("SICHUANZANGQU <", value, "sichuanzangqu");
            return (Criteria) this;
        }

        public Criteria andSichuanzangquLessThanOrEqualTo(Object value) {
            addCriterion("SICHUANZANGQU <=", value, "sichuanzangqu");
            return (Criteria) this;
        }

        public Criteria andSichuanzangquIn(List<Object> values) {
            addCriterion("SICHUANZANGQU in", values, "sichuanzangqu");
            return (Criteria) this;
        }

        public Criteria andSichuanzangquNotIn(List<Object> values) {
            addCriterion("SICHUANZANGQU not in", values, "sichuanzangqu");
            return (Criteria) this;
        }

        public Criteria andSichuanzangquBetween(Object value1, Object value2) {
            addCriterion("SICHUANZANGQU between", value1, value2, "sichuanzangqu");
            return (Criteria) this;
        }

        public Criteria andSichuanzangquNotBetween(Object value1, Object value2) {
            addCriterion("SICHUANZANGQU not between", value1, value2, "sichuanzangqu");
            return (Criteria) this;
        }

        public Criteria andYunnanzangquIsNull() {
            addCriterion("YUNNANZANGQU is null");
            return (Criteria) this;
        }

        public Criteria andYunnanzangquIsNotNull() {
            addCriterion("YUNNANZANGQU is not null");
            return (Criteria) this;
        }

        public Criteria andYunnanzangquEqualTo(Object value) {
            addCriterion("YUNNANZANGQU =", value, "yunnanzangqu");
            return (Criteria) this;
        }

        public Criteria andYunnanzangquNotEqualTo(Object value) {
            addCriterion("YUNNANZANGQU <>", value, "yunnanzangqu");
            return (Criteria) this;
        }

        public Criteria andYunnanzangquGreaterThan(Object value) {
            addCriterion("YUNNANZANGQU >", value, "yunnanzangqu");
            return (Criteria) this;
        }

        public Criteria andYunnanzangquGreaterThanOrEqualTo(Object value) {
            addCriterion("YUNNANZANGQU >=", value, "yunnanzangqu");
            return (Criteria) this;
        }

        public Criteria andYunnanzangquLessThan(Object value) {
            addCriterion("YUNNANZANGQU <", value, "yunnanzangqu");
            return (Criteria) this;
        }

        public Criteria andYunnanzangquLessThanOrEqualTo(Object value) {
            addCriterion("YUNNANZANGQU <=", value, "yunnanzangqu");
            return (Criteria) this;
        }

        public Criteria andYunnanzangquIn(List<Object> values) {
            addCriterion("YUNNANZANGQU in", values, "yunnanzangqu");
            return (Criteria) this;
        }

        public Criteria andYunnanzangquNotIn(List<Object> values) {
            addCriterion("YUNNANZANGQU not in", values, "yunnanzangqu");
            return (Criteria) this;
        }

        public Criteria andYunnanzangquBetween(Object value1, Object value2) {
            addCriterion("YUNNANZANGQU between", value1, value2, "yunnanzangqu");
            return (Criteria) this;
        }

        public Criteria andYunnanzangquNotBetween(Object value1, Object value2) {
            addCriterion("YUNNANZANGQU not between", value1, value2, "yunnanzangqu");
            return (Criteria) this;
        }

        public Criteria andGansuzangquIsNull() {
            addCriterion("GANSUZANGQU is null");
            return (Criteria) this;
        }

        public Criteria andGansuzangquIsNotNull() {
            addCriterion("GANSUZANGQU is not null");
            return (Criteria) this;
        }

        public Criteria andGansuzangquEqualTo(Object value) {
            addCriterion("GANSUZANGQU =", value, "gansuzangqu");
            return (Criteria) this;
        }

        public Criteria andGansuzangquNotEqualTo(Object value) {
            addCriterion("GANSUZANGQU <>", value, "gansuzangqu");
            return (Criteria) this;
        }

        public Criteria andGansuzangquGreaterThan(Object value) {
            addCriterion("GANSUZANGQU >", value, "gansuzangqu");
            return (Criteria) this;
        }

        public Criteria andGansuzangquGreaterThanOrEqualTo(Object value) {
            addCriterion("GANSUZANGQU >=", value, "gansuzangqu");
            return (Criteria) this;
        }

        public Criteria andGansuzangquLessThan(Object value) {
            addCriterion("GANSUZANGQU <", value, "gansuzangqu");
            return (Criteria) this;
        }

        public Criteria andGansuzangquLessThanOrEqualTo(Object value) {
            addCriterion("GANSUZANGQU <=", value, "gansuzangqu");
            return (Criteria) this;
        }

        public Criteria andGansuzangquIn(List<Object> values) {
            addCriterion("GANSUZANGQU in", values, "gansuzangqu");
            return (Criteria) this;
        }

        public Criteria andGansuzangquNotIn(List<Object> values) {
            addCriterion("GANSUZANGQU not in", values, "gansuzangqu");
            return (Criteria) this;
        }

        public Criteria andGansuzangquBetween(Object value1, Object value2) {
            addCriterion("GANSUZANGQU between", value1, value2, "gansuzangqu");
            return (Criteria) this;
        }

        public Criteria andGansuzangquNotBetween(Object value1, Object value2) {
            addCriterion("GANSUZANGQU not between", value1, value2, "gansuzangqu");
            return (Criteria) this;
        }

        public Criteria andShifouyuanzangIsNull() {
            addCriterion("SHIFOUYUANZANG is null");
            return (Criteria) this;
        }

        public Criteria andShifouyuanzangIsNotNull() {
            addCriterion("SHIFOUYUANZANG is not null");
            return (Criteria) this;
        }

        public Criteria andShifouyuanzangEqualTo(Short value) {
            addCriterion("SHIFOUYUANZANG =", value, "shifouyuanzang");
            return (Criteria) this;
        }

        public Criteria andShifouyuanzangNotEqualTo(Short value) {
            addCriterion("SHIFOUYUANZANG <>", value, "shifouyuanzang");
            return (Criteria) this;
        }

        public Criteria andShifouyuanzangGreaterThan(Short value) {
            addCriterion("SHIFOUYUANZANG >", value, "shifouyuanzang");
            return (Criteria) this;
        }

        public Criteria andShifouyuanzangGreaterThanOrEqualTo(Short value) {
            addCriterion("SHIFOUYUANZANG >=", value, "shifouyuanzang");
            return (Criteria) this;
        }

        public Criteria andShifouyuanzangLessThan(Short value) {
            addCriterion("SHIFOUYUANZANG <", value, "shifouyuanzang");
            return (Criteria) this;
        }

        public Criteria andShifouyuanzangLessThanOrEqualTo(Short value) {
            addCriterion("SHIFOUYUANZANG <=", value, "shifouyuanzang");
            return (Criteria) this;
        }

        public Criteria andShifouyuanzangIn(List<Short> values) {
            addCriterion("SHIFOUYUANZANG in", values, "shifouyuanzang");
            return (Criteria) this;
        }

        public Criteria andShifouyuanzangNotIn(List<Short> values) {
            addCriterion("SHIFOUYUANZANG not in", values, "shifouyuanzang");
            return (Criteria) this;
        }

        public Criteria andShifouyuanzangBetween(Short value1, Short value2) {
            addCriterion("SHIFOUYUANZANG between", value1, value2, "shifouyuanzang");
            return (Criteria) this;
        }

        public Criteria andShifouyuanzangNotBetween(Short value1, Short value2) {
            addCriterion("SHIFOUYUANZANG not between", value1, value2, "shifouyuanzang");
            return (Criteria) this;
        }

        public Criteria andXiangmudidianIsNull() {
            addCriterion("XIANGMUDIDIAN is null");
            return (Criteria) this;
        }

        public Criteria andXiangmudidianIsNotNull() {
            addCriterion("XIANGMUDIDIAN is not null");
            return (Criteria) this;
        }

        public Criteria andXiangmudidianEqualTo(String value) {
            addCriterion("XIANGMUDIDIAN =", value, "xiangmudidian");
            return (Criteria) this;
        }

        public Criteria andXiangmudidianNotEqualTo(String value) {
            addCriterion("XIANGMUDIDIAN <>", value, "xiangmudidian");
            return (Criteria) this;
        }

        public Criteria andXiangmudidianGreaterThan(String value) {
            addCriterion("XIANGMUDIDIAN >", value, "xiangmudidian");
            return (Criteria) this;
        }

        public Criteria andXiangmudidianGreaterThanOrEqualTo(String value) {
            addCriterion("XIANGMUDIDIAN >=", value, "xiangmudidian");
            return (Criteria) this;
        }

        public Criteria andXiangmudidianLessThan(String value) {
            addCriterion("XIANGMUDIDIAN <", value, "xiangmudidian");
            return (Criteria) this;
        }

        public Criteria andXiangmudidianLessThanOrEqualTo(String value) {
            addCriterion("XIANGMUDIDIAN <=", value, "xiangmudidian");
            return (Criteria) this;
        }

        public Criteria andXiangmudidianLike(String value) {
            addCriterion("XIANGMUDIDIAN like", value, "xiangmudidian");
            return (Criteria) this;
        }

        public Criteria andXiangmudidianNotLike(String value) {
            addCriterion("XIANGMUDIDIAN not like", value, "xiangmudidian");
            return (Criteria) this;
        }

        public Criteria andXiangmudidianIn(List<String> values) {
            addCriterion("XIANGMUDIDIAN in", values, "xiangmudidian");
            return (Criteria) this;
        }

        public Criteria andXiangmudidianNotIn(List<String> values) {
            addCriterion("XIANGMUDIDIAN not in", values, "xiangmudidian");
            return (Criteria) this;
        }

        public Criteria andXiangmudidianBetween(String value1, String value2) {
            addCriterion("XIANGMUDIDIAN between", value1, value2, "xiangmudidian");
            return (Criteria) this;
        }

        public Criteria andXiangmudidianNotBetween(String value1, String value2) {
            addCriterion("XIANGMUDIDIAN not between", value1, value2, "xiangmudidian");
            return (Criteria) this;
        }

        public Criteria andPinkunhuIsNull() {
            addCriterion("PINKUNHU is null");
            return (Criteria) this;
        }

        public Criteria andPinkunhuIsNotNull() {
            addCriterion("PINKUNHU is not null");
            return (Criteria) this;
        }

        public Criteria andPinkunhuEqualTo(String value) {
            addCriterion("PINKUNHU =", value, "pinkunhu");
            return (Criteria) this;
        }

        public Criteria andPinkunhuNotEqualTo(String value) {
            addCriterion("PINKUNHU <>", value, "pinkunhu");
            return (Criteria) this;
        }

        public Criteria andPinkunhuGreaterThan(String value) {
            addCriterion("PINKUNHU >", value, "pinkunhu");
            return (Criteria) this;
        }

        public Criteria andPinkunhuGreaterThanOrEqualTo(String value) {
            addCriterion("PINKUNHU >=", value, "pinkunhu");
            return (Criteria) this;
        }

        public Criteria andPinkunhuLessThan(String value) {
            addCriterion("PINKUNHU <", value, "pinkunhu");
            return (Criteria) this;
        }

        public Criteria andPinkunhuLessThanOrEqualTo(String value) {
            addCriterion("PINKUNHU <=", value, "pinkunhu");
            return (Criteria) this;
        }

        public Criteria andPinkunhuLike(String value) {
            addCriterion("PINKUNHU like", value, "pinkunhu");
            return (Criteria) this;
        }

        public Criteria andPinkunhuNotLike(String value) {
            addCriterion("PINKUNHU not like", value, "pinkunhu");
            return (Criteria) this;
        }

        public Criteria andPinkunhuIn(List<String> values) {
            addCriterion("PINKUNHU in", values, "pinkunhu");
            return (Criteria) this;
        }

        public Criteria andPinkunhuNotIn(List<String> values) {
            addCriterion("PINKUNHU not in", values, "pinkunhu");
            return (Criteria) this;
        }

        public Criteria andPinkunhuBetween(String value1, String value2) {
            addCriterion("PINKUNHU between", value1, value2, "pinkunhu");
            return (Criteria) this;
        }

        public Criteria andPinkunhuNotBetween(String value1, String value2) {
            addCriterion("PINKUNHU not between", value1, value2, "pinkunhu");
            return (Criteria) this;
        }

        public Criteria andPinkunrenIsNull() {
            addCriterion("PINKUNREN is null");
            return (Criteria) this;
        }

        public Criteria andPinkunrenIsNotNull() {
            addCriterion("PINKUNREN is not null");
            return (Criteria) this;
        }

        public Criteria andPinkunrenEqualTo(Long value) {
            addCriterion("PINKUNREN =", value, "pinkunren");
            return (Criteria) this;
        }

        public Criteria andPinkunrenNotEqualTo(Long value) {
            addCriterion("PINKUNREN <>", value, "pinkunren");
            return (Criteria) this;
        }

        public Criteria andPinkunrenGreaterThan(Long value) {
            addCriterion("PINKUNREN >", value, "pinkunren");
            return (Criteria) this;
        }

        public Criteria andPinkunrenGreaterThanOrEqualTo(Long value) {
            addCriterion("PINKUNREN >=", value, "pinkunren");
            return (Criteria) this;
        }

        public Criteria andPinkunrenLessThan(Long value) {
            addCriterion("PINKUNREN <", value, "pinkunren");
            return (Criteria) this;
        }

        public Criteria andPinkunrenLessThanOrEqualTo(Long value) {
            addCriterion("PINKUNREN <=", value, "pinkunren");
            return (Criteria) this;
        }

        public Criteria andPinkunrenIn(List<Long> values) {
            addCriterion("PINKUNREN in", values, "pinkunren");
            return (Criteria) this;
        }

        public Criteria andPinkunrenNotIn(List<Long> values) {
            addCriterion("PINKUNREN not in", values, "pinkunren");
            return (Criteria) this;
        }

        public Criteria andPinkunrenBetween(Long value1, Long value2) {
            addCriterion("PINKUNREN between", value1, value2, "pinkunren");
            return (Criteria) this;
        }

        public Criteria andPinkunrenNotBetween(Long value1, Long value2) {
            addCriterion("PINKUNREN not between", value1, value2, "pinkunren");
            return (Criteria) this;
        }

        public Criteria andJiaoyufupinIsNull() {
            addCriterion("JIAOYUFUPIN is null");
            return (Criteria) this;
        }

        public Criteria andJiaoyufupinIsNotNull() {
            addCriterion("JIAOYUFUPIN is not null");
            return (Criteria) this;
        }

        public Criteria andJiaoyufupinEqualTo(Object value) {
            addCriterion("JIAOYUFUPIN =", value, "jiaoyufupin");
            return (Criteria) this;
        }

        public Criteria andJiaoyufupinNotEqualTo(Object value) {
            addCriterion("JIAOYUFUPIN <>", value, "jiaoyufupin");
            return (Criteria) this;
        }

        public Criteria andJiaoyufupinGreaterThan(Object value) {
            addCriterion("JIAOYUFUPIN >", value, "jiaoyufupin");
            return (Criteria) this;
        }

        public Criteria andJiaoyufupinGreaterThanOrEqualTo(Object value) {
            addCriterion("JIAOYUFUPIN >=", value, "jiaoyufupin");
            return (Criteria) this;
        }

        public Criteria andJiaoyufupinLessThan(Object value) {
            addCriterion("JIAOYUFUPIN <", value, "jiaoyufupin");
            return (Criteria) this;
        }

        public Criteria andJiaoyufupinLessThanOrEqualTo(Object value) {
            addCriterion("JIAOYUFUPIN <=", value, "jiaoyufupin");
            return (Criteria) this;
        }

        public Criteria andJiaoyufupinIn(List<Object> values) {
            addCriterion("JIAOYUFUPIN in", values, "jiaoyufupin");
            return (Criteria) this;
        }

        public Criteria andJiaoyufupinNotIn(List<Object> values) {
            addCriterion("JIAOYUFUPIN not in", values, "jiaoyufupin");
            return (Criteria) this;
        }

        public Criteria andJiaoyufupinBetween(Object value1, Object value2) {
            addCriterion("JIAOYUFUPIN between", value1, value2, "jiaoyufupin");
            return (Criteria) this;
        }

        public Criteria andJiaoyufupinNotBetween(Object value1, Object value2) {
            addCriterion("JIAOYUFUPIN not between", value1, value2, "jiaoyufupin");
            return (Criteria) this;
        }

        public Criteria andJiankangfupinIsNull() {
            addCriterion("JIANKANGFUPIN is null");
            return (Criteria) this;
        }

        public Criteria andJiankangfupinIsNotNull() {
            addCriterion("JIANKANGFUPIN is not null");
            return (Criteria) this;
        }

        public Criteria andJiankangfupinEqualTo(Object value) {
            addCriterion("JIANKANGFUPIN =", value, "jiankangfupin");
            return (Criteria) this;
        }

        public Criteria andJiankangfupinNotEqualTo(Object value) {
            addCriterion("JIANKANGFUPIN <>", value, "jiankangfupin");
            return (Criteria) this;
        }

        public Criteria andJiankangfupinGreaterThan(Object value) {
            addCriterion("JIANKANGFUPIN >", value, "jiankangfupin");
            return (Criteria) this;
        }

        public Criteria andJiankangfupinGreaterThanOrEqualTo(Object value) {
            addCriterion("JIANKANGFUPIN >=", value, "jiankangfupin");
            return (Criteria) this;
        }

        public Criteria andJiankangfupinLessThan(Object value) {
            addCriterion("JIANKANGFUPIN <", value, "jiankangfupin");
            return (Criteria) this;
        }

        public Criteria andJiankangfupinLessThanOrEqualTo(Object value) {
            addCriterion("JIANKANGFUPIN <=", value, "jiankangfupin");
            return (Criteria) this;
        }

        public Criteria andJiankangfupinIn(List<Object> values) {
            addCriterion("JIANKANGFUPIN in", values, "jiankangfupin");
            return (Criteria) this;
        }

        public Criteria andJiankangfupinNotIn(List<Object> values) {
            addCriterion("JIANKANGFUPIN not in", values, "jiankangfupin");
            return (Criteria) this;
        }

        public Criteria andJiankangfupinBetween(Object value1, Object value2) {
            addCriterion("JIANKANGFUPIN between", value1, value2, "jiankangfupin");
            return (Criteria) this;
        }

        public Criteria andJiankangfupinNotBetween(Object value1, Object value2) {
            addCriterion("JIANKANGFUPIN not between", value1, value2, "jiankangfupin");
            return (Criteria) this;
        }

        public Criteria andChanyefupinIsNull() {
            addCriterion("CHANYEFUPIN is null");
            return (Criteria) this;
        }

        public Criteria andChanyefupinIsNotNull() {
            addCriterion("CHANYEFUPIN is not null");
            return (Criteria) this;
        }

        public Criteria andChanyefupinEqualTo(Object value) {
            addCriterion("CHANYEFUPIN =", value, "chanyefupin");
            return (Criteria) this;
        }

        public Criteria andChanyefupinNotEqualTo(Object value) {
            addCriterion("CHANYEFUPIN <>", value, "chanyefupin");
            return (Criteria) this;
        }

        public Criteria andChanyefupinGreaterThan(Object value) {
            addCriterion("CHANYEFUPIN >", value, "chanyefupin");
            return (Criteria) this;
        }

        public Criteria andChanyefupinGreaterThanOrEqualTo(Object value) {
            addCriterion("CHANYEFUPIN >=", value, "chanyefupin");
            return (Criteria) this;
        }

        public Criteria andChanyefupinLessThan(Object value) {
            addCriterion("CHANYEFUPIN <", value, "chanyefupin");
            return (Criteria) this;
        }

        public Criteria andChanyefupinLessThanOrEqualTo(Object value) {
            addCriterion("CHANYEFUPIN <=", value, "chanyefupin");
            return (Criteria) this;
        }

        public Criteria andChanyefupinIn(List<Object> values) {
            addCriterion("CHANYEFUPIN in", values, "chanyefupin");
            return (Criteria) this;
        }

        public Criteria andChanyefupinNotIn(List<Object> values) {
            addCriterion("CHANYEFUPIN not in", values, "chanyefupin");
            return (Criteria) this;
        }

        public Criteria andChanyefupinBetween(Object value1, Object value2) {
            addCriterion("CHANYEFUPIN between", value1, value2, "chanyefupin");
            return (Criteria) this;
        }

        public Criteria andChanyefupinNotBetween(Object value1, Object value2) {
            addCriterion("CHANYEFUPIN not between", value1, value2, "chanyefupin");
            return (Criteria) this;
        }

        public Criteria andJichusheshiIsNull() {
            addCriterion("JICHUSHESHI is null");
            return (Criteria) this;
        }

        public Criteria andJichusheshiIsNotNull() {
            addCriterion("JICHUSHESHI is not null");
            return (Criteria) this;
        }

        public Criteria andJichusheshiEqualTo(Object value) {
            addCriterion("JICHUSHESHI =", value, "jichusheshi");
            return (Criteria) this;
        }

        public Criteria andJichusheshiNotEqualTo(Object value) {
            addCriterion("JICHUSHESHI <>", value, "jichusheshi");
            return (Criteria) this;
        }

        public Criteria andJichusheshiGreaterThan(Object value) {
            addCriterion("JICHUSHESHI >", value, "jichusheshi");
            return (Criteria) this;
        }

        public Criteria andJichusheshiGreaterThanOrEqualTo(Object value) {
            addCriterion("JICHUSHESHI >=", value, "jichusheshi");
            return (Criteria) this;
        }

        public Criteria andJichusheshiLessThan(Object value) {
            addCriterion("JICHUSHESHI <", value, "jichusheshi");
            return (Criteria) this;
        }

        public Criteria andJichusheshiLessThanOrEqualTo(Object value) {
            addCriterion("JICHUSHESHI <=", value, "jichusheshi");
            return (Criteria) this;
        }

        public Criteria andJichusheshiIn(List<Object> values) {
            addCriterion("JICHUSHESHI in", values, "jichusheshi");
            return (Criteria) this;
        }

        public Criteria andJichusheshiNotIn(List<Object> values) {
            addCriterion("JICHUSHESHI not in", values, "jichusheshi");
            return (Criteria) this;
        }

        public Criteria andJichusheshiBetween(Object value1, Object value2) {
            addCriterion("JICHUSHESHI between", value1, value2, "jichusheshi");
            return (Criteria) this;
        }

        public Criteria andJichusheshiNotBetween(Object value1, Object value2) {
            addCriterion("JICHUSHESHI not between", value1, value2, "jichusheshi");
            return (Criteria) this;
        }

        public Criteria andZhijiejiuzhuIsNull() {
            addCriterion("ZHIJIEJIUZHU is null");
            return (Criteria) this;
        }

        public Criteria andZhijiejiuzhuIsNotNull() {
            addCriterion("ZHIJIEJIUZHU is not null");
            return (Criteria) this;
        }

        public Criteria andZhijiejiuzhuEqualTo(Object value) {
            addCriterion("ZHIJIEJIUZHU =", value, "zhijiejiuzhu");
            return (Criteria) this;
        }

        public Criteria andZhijiejiuzhuNotEqualTo(Object value) {
            addCriterion("ZHIJIEJIUZHU <>", value, "zhijiejiuzhu");
            return (Criteria) this;
        }

        public Criteria andZhijiejiuzhuGreaterThan(Object value) {
            addCriterion("ZHIJIEJIUZHU >", value, "zhijiejiuzhu");
            return (Criteria) this;
        }

        public Criteria andZhijiejiuzhuGreaterThanOrEqualTo(Object value) {
            addCriterion("ZHIJIEJIUZHU >=", value, "zhijiejiuzhu");
            return (Criteria) this;
        }

        public Criteria andZhijiejiuzhuLessThan(Object value) {
            addCriterion("ZHIJIEJIUZHU <", value, "zhijiejiuzhu");
            return (Criteria) this;
        }

        public Criteria andZhijiejiuzhuLessThanOrEqualTo(Object value) {
            addCriterion("ZHIJIEJIUZHU <=", value, "zhijiejiuzhu");
            return (Criteria) this;
        }

        public Criteria andZhijiejiuzhuIn(List<Object> values) {
            addCriterion("ZHIJIEJIUZHU in", values, "zhijiejiuzhu");
            return (Criteria) this;
        }

        public Criteria andZhijiejiuzhuNotIn(List<Object> values) {
            addCriterion("ZHIJIEJIUZHU not in", values, "zhijiejiuzhu");
            return (Criteria) this;
        }

        public Criteria andZhijiejiuzhuBetween(Object value1, Object value2) {
            addCriterion("ZHIJIEJIUZHU between", value1, value2, "zhijiejiuzhu");
            return (Criteria) this;
        }

        public Criteria andZhijiejiuzhuNotBetween(Object value1, Object value2) {
            addCriterion("ZHIJIEJIUZHU not between", value1, value2, "zhijiejiuzhu");
            return (Criteria) this;
        }

        public Criteria andZhiyuanfupinIsNull() {
            addCriterion("ZHIYUANFUPIN is null");
            return (Criteria) this;
        }

        public Criteria andZhiyuanfupinIsNotNull() {
            addCriterion("ZHIYUANFUPIN is not null");
            return (Criteria) this;
        }

        public Criteria andZhiyuanfupinEqualTo(Object value) {
            addCriterion("ZHIYUANFUPIN =", value, "zhiyuanfupin");
            return (Criteria) this;
        }

        public Criteria andZhiyuanfupinNotEqualTo(Object value) {
            addCriterion("ZHIYUANFUPIN <>", value, "zhiyuanfupin");
            return (Criteria) this;
        }

        public Criteria andZhiyuanfupinGreaterThan(Object value) {
            addCriterion("ZHIYUANFUPIN >", value, "zhiyuanfupin");
            return (Criteria) this;
        }

        public Criteria andZhiyuanfupinGreaterThanOrEqualTo(Object value) {
            addCriterion("ZHIYUANFUPIN >=", value, "zhiyuanfupin");
            return (Criteria) this;
        }

        public Criteria andZhiyuanfupinLessThan(Object value) {
            addCriterion("ZHIYUANFUPIN <", value, "zhiyuanfupin");
            return (Criteria) this;
        }

        public Criteria andZhiyuanfupinLessThanOrEqualTo(Object value) {
            addCriterion("ZHIYUANFUPIN <=", value, "zhiyuanfupin");
            return (Criteria) this;
        }

        public Criteria andZhiyuanfupinIn(List<Object> values) {
            addCriterion("ZHIYUANFUPIN in", values, "zhiyuanfupin");
            return (Criteria) this;
        }

        public Criteria andZhiyuanfupinNotIn(List<Object> values) {
            addCriterion("ZHIYUANFUPIN not in", values, "zhiyuanfupin");
            return (Criteria) this;
        }

        public Criteria andZhiyuanfupinBetween(Object value1, Object value2) {
            addCriterion("ZHIYUANFUPIN between", value1, value2, "zhiyuanfupin");
            return (Criteria) this;
        }

        public Criteria andZhiyuanfupinNotBetween(Object value1, Object value2) {
            addCriterion("ZHIYUANFUPIN not between", value1, value2, "zhiyuanfupin");
            return (Criteria) this;
        }

        public Criteria andYidibanqianIsNull() {
            addCriterion("YIDIBANQIAN is null");
            return (Criteria) this;
        }

        public Criteria andYidibanqianIsNotNull() {
            addCriterion("YIDIBANQIAN is not null");
            return (Criteria) this;
        }

        public Criteria andYidibanqianEqualTo(Object value) {
            addCriterion("YIDIBANQIAN =", value, "yidibanqian");
            return (Criteria) this;
        }

        public Criteria andYidibanqianNotEqualTo(Object value) {
            addCriterion("YIDIBANQIAN <>", value, "yidibanqian");
            return (Criteria) this;
        }

        public Criteria andYidibanqianGreaterThan(Object value) {
            addCriterion("YIDIBANQIAN >", value, "yidibanqian");
            return (Criteria) this;
        }

        public Criteria andYidibanqianGreaterThanOrEqualTo(Object value) {
            addCriterion("YIDIBANQIAN >=", value, "yidibanqian");
            return (Criteria) this;
        }

        public Criteria andYidibanqianLessThan(Object value) {
            addCriterion("YIDIBANQIAN <", value, "yidibanqian");
            return (Criteria) this;
        }

        public Criteria andYidibanqianLessThanOrEqualTo(Object value) {
            addCriterion("YIDIBANQIAN <=", value, "yidibanqian");
            return (Criteria) this;
        }

        public Criteria andYidibanqianIn(List<Object> values) {
            addCriterion("YIDIBANQIAN in", values, "yidibanqian");
            return (Criteria) this;
        }

        public Criteria andYidibanqianNotIn(List<Object> values) {
            addCriterion("YIDIBANQIAN not in", values, "yidibanqian");
            return (Criteria) this;
        }

        public Criteria andYidibanqianBetween(Object value1, Object value2) {
            addCriterion("YIDIBANQIAN between", value1, value2, "yidibanqian");
            return (Criteria) this;
        }

        public Criteria andYidibanqianNotBetween(Object value1, Object value2) {
            addCriterion("YIDIBANQIAN not between", value1, value2, "yidibanqian");
            return (Criteria) this;
        }

        public Criteria andShengIsNull() {
            addCriterion("SHENG is null");
            return (Criteria) this;
        }

        public Criteria andShengIsNotNull() {
            addCriterion("SHENG is not null");
            return (Criteria) this;
        }

        public Criteria andShengEqualTo(Object value) {
            addCriterion("SHENG =", value, "sheng");
            return (Criteria) this;
        }

        public Criteria andShengNotEqualTo(Object value) {
            addCriterion("SHENG <>", value, "sheng");
            return (Criteria) this;
        }

        public Criteria andShengGreaterThan(Object value) {
            addCriterion("SHENG >", value, "sheng");
            return (Criteria) this;
        }

        public Criteria andShengGreaterThanOrEqualTo(Object value) {
            addCriterion("SHENG >=", value, "sheng");
            return (Criteria) this;
        }

        public Criteria andShengLessThan(Object value) {
            addCriterion("SHENG <", value, "sheng");
            return (Criteria) this;
        }

        public Criteria andShengLessThanOrEqualTo(Object value) {
            addCriterion("SHENG <=", value, "sheng");
            return (Criteria) this;
        }

        public Criteria andShengIn(List<Object> values) {
            addCriterion("SHENG in", values, "sheng");
            return (Criteria) this;
        }

        public Criteria andShengNotIn(List<Object> values) {
            addCriterion("SHENG not in", values, "sheng");
            return (Criteria) this;
        }

        public Criteria andShengBetween(Object value1, Object value2) {
            addCriterion("SHENG between", value1, value2, "sheng");
            return (Criteria) this;
        }

        public Criteria andShengNotBetween(Object value1, Object value2) {
            addCriterion("SHENG not between", value1, value2, "sheng");
            return (Criteria) this;
        }

        public Criteria andShiIsNull() {
            addCriterion("SHI is null");
            return (Criteria) this;
        }

        public Criteria andShiIsNotNull() {
            addCriterion("SHI is not null");
            return (Criteria) this;
        }

        public Criteria andShiEqualTo(Object value) {
            addCriterion("SHI =", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiNotEqualTo(Object value) {
            addCriterion("SHI <>", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiGreaterThan(Object value) {
            addCriterion("SHI >", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiGreaterThanOrEqualTo(Object value) {
            addCriterion("SHI >=", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiLessThan(Object value) {
            addCriterion("SHI <", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiLessThanOrEqualTo(Object value) {
            addCriterion("SHI <=", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiIn(List<Object> values) {
            addCriterion("SHI in", values, "shi");
            return (Criteria) this;
        }

        public Criteria andShiNotIn(List<Object> values) {
            addCriterion("SHI not in", values, "shi");
            return (Criteria) this;
        }

        public Criteria andShiBetween(Object value1, Object value2) {
            addCriterion("SHI between", value1, value2, "shi");
            return (Criteria) this;
        }

        public Criteria andShiNotBetween(Object value1, Object value2) {
            addCriterion("SHI not between", value1, value2, "shi");
            return (Criteria) this;
        }

        public Criteria andXianIsNull() {
            addCriterion("XIAN is null");
            return (Criteria) this;
        }

        public Criteria andXianIsNotNull() {
            addCriterion("XIAN is not null");
            return (Criteria) this;
        }

        public Criteria andXianEqualTo(Object value) {
            addCriterion("XIAN =", value, "xian");
            return (Criteria) this;
        }

        public Criteria andXianNotEqualTo(Object value) {
            addCriterion("XIAN <>", value, "xian");
            return (Criteria) this;
        }

        public Criteria andXianGreaterThan(Object value) {
            addCriterion("XIAN >", value, "xian");
            return (Criteria) this;
        }

        public Criteria andXianGreaterThanOrEqualTo(Object value) {
            addCriterion("XIAN >=", value, "xian");
            return (Criteria) this;
        }

        public Criteria andXianLessThan(Object value) {
            addCriterion("XIAN <", value, "xian");
            return (Criteria) this;
        }

        public Criteria andXianLessThanOrEqualTo(Object value) {
            addCriterion("XIAN <=", value, "xian");
            return (Criteria) this;
        }

        public Criteria andXianIn(List<Object> values) {
            addCriterion("XIAN in", values, "xian");
            return (Criteria) this;
        }

        public Criteria andXianNotIn(List<Object> values) {
            addCriterion("XIAN not in", values, "xian");
            return (Criteria) this;
        }

        public Criteria andXianBetween(Object value1, Object value2) {
            addCriterion("XIAN between", value1, value2, "xian");
            return (Criteria) this;
        }

        public Criteria andXianNotBetween(Object value1, Object value2) {
            addCriterion("XIAN not between", value1, value2, "xian");
            return (Criteria) this;
        }

        public Criteria andXianextIsNull() {
            addCriterion("XIANEXT is null");
            return (Criteria) this;
        }

        public Criteria andXianextIsNotNull() {
            addCriterion("XIANEXT is not null");
            return (Criteria) this;
        }

        public Criteria andXianextEqualTo(String value) {
            addCriterion("XIANEXT =", value, "xianext");
            return (Criteria) this;
        }

        public Criteria andXianextNotEqualTo(String value) {
            addCriterion("XIANEXT <>", value, "xianext");
            return (Criteria) this;
        }

        public Criteria andXianextGreaterThan(String value) {
            addCriterion("XIANEXT >", value, "xianext");
            return (Criteria) this;
        }

        public Criteria andXianextGreaterThanOrEqualTo(String value) {
            addCriterion("XIANEXT >=", value, "xianext");
            return (Criteria) this;
        }

        public Criteria andXianextLessThan(String value) {
            addCriterion("XIANEXT <", value, "xianext");
            return (Criteria) this;
        }

        public Criteria andXianextLessThanOrEqualTo(String value) {
            addCriterion("XIANEXT <=", value, "xianext");
            return (Criteria) this;
        }

        public Criteria andXianextLike(String value) {
            addCriterion("XIANEXT like", value, "xianext");
            return (Criteria) this;
        }

        public Criteria andXianextNotLike(String value) {
            addCriterion("XIANEXT not like", value, "xianext");
            return (Criteria) this;
        }

        public Criteria andXianextIn(List<String> values) {
            addCriterion("XIANEXT in", values, "xianext");
            return (Criteria) this;
        }

        public Criteria andXianextNotIn(List<String> values) {
            addCriterion("XIANEXT not in", values, "xianext");
            return (Criteria) this;
        }

        public Criteria andXianextBetween(String value1, String value2) {
            addCriterion("XIANEXT between", value1, value2, "xianext");
            return (Criteria) this;
        }

        public Criteria andXianextNotBetween(String value1, String value2) {
            addCriterion("XIANEXT not between", value1, value2, "xianext");
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