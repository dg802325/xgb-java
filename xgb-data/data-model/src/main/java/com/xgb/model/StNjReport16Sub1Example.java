package com.xgb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StNjReport16Sub1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StNjReport16Sub1Example() {
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

        public Criteria andXuhaoIsNull() {
            addCriterion("XUHAO is null");
            return (Criteria) this;
        }

        public Criteria andXuhaoIsNotNull() {
            addCriterion("XUHAO is not null");
            return (Criteria) this;
        }

        public Criteria andXuhaoEqualTo(String value) {
            addCriterion("XUHAO =", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoNotEqualTo(String value) {
            addCriterion("XUHAO <>", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoGreaterThan(String value) {
            addCriterion("XUHAO >", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoGreaterThanOrEqualTo(String value) {
            addCriterion("XUHAO >=", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoLessThan(String value) {
            addCriterion("XUHAO <", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoLessThanOrEqualTo(String value) {
            addCriterion("XUHAO <=", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoLike(String value) {
            addCriterion("XUHAO like", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoNotLike(String value) {
            addCriterion("XUHAO not like", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoIn(List<String> values) {
            addCriterion("XUHAO in", values, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoNotIn(List<String> values) {
            addCriterion("XUHAO not in", values, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoBetween(String value1, String value2) {
            addCriterion("XUHAO between", value1, value2, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoNotBetween(String value1, String value2) {
            addCriterion("XUHAO not between", value1, value2, "xuhao");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhiIsNull() {
            addCriterion("GUOJIZUZHI is null");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhiIsNotNull() {
            addCriterion("GUOJIZUZHI is not null");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhiEqualTo(String value) {
            addCriterion("GUOJIZUZHI =", value, "guojizuzhi");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhiNotEqualTo(String value) {
            addCriterion("GUOJIZUZHI <>", value, "guojizuzhi");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhiGreaterThan(String value) {
            addCriterion("GUOJIZUZHI >", value, "guojizuzhi");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhiGreaterThanOrEqualTo(String value) {
            addCriterion("GUOJIZUZHI >=", value, "guojizuzhi");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhiLessThan(String value) {
            addCriterion("GUOJIZUZHI <", value, "guojizuzhi");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhiLessThanOrEqualTo(String value) {
            addCriterion("GUOJIZUZHI <=", value, "guojizuzhi");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhiLike(String value) {
            addCriterion("GUOJIZUZHI like", value, "guojizuzhi");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhiNotLike(String value) {
            addCriterion("GUOJIZUZHI not like", value, "guojizuzhi");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhiIn(List<String> values) {
            addCriterion("GUOJIZUZHI in", values, "guojizuzhi");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhiNotIn(List<String> values) {
            addCriterion("GUOJIZUZHI not in", values, "guojizuzhi");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhiBetween(String value1, String value2) {
            addCriterion("GUOJIZUZHI between", value1, value2, "guojizuzhi");
            return (Criteria) this;
        }

        public Criteria andGuojizuzhiNotBetween(String value1, String value2) {
            addCriterion("GUOJIZUZHI not between", value1, value2, "guojizuzhi");
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

        public Criteria andPizhunjiguanIsNull() {
            addCriterion("PIZHUNJIGUAN is null");
            return (Criteria) this;
        }

        public Criteria andPizhunjiguanIsNotNull() {
            addCriterion("PIZHUNJIGUAN is not null");
            return (Criteria) this;
        }

        public Criteria andPizhunjiguanEqualTo(String value) {
            addCriterion("PIZHUNJIGUAN =", value, "pizhunjiguan");
            return (Criteria) this;
        }

        public Criteria andPizhunjiguanNotEqualTo(String value) {
            addCriterion("PIZHUNJIGUAN <>", value, "pizhunjiguan");
            return (Criteria) this;
        }

        public Criteria andPizhunjiguanGreaterThan(String value) {
            addCriterion("PIZHUNJIGUAN >", value, "pizhunjiguan");
            return (Criteria) this;
        }

        public Criteria andPizhunjiguanGreaterThanOrEqualTo(String value) {
            addCriterion("PIZHUNJIGUAN >=", value, "pizhunjiguan");
            return (Criteria) this;
        }

        public Criteria andPizhunjiguanLessThan(String value) {
            addCriterion("PIZHUNJIGUAN <", value, "pizhunjiguan");
            return (Criteria) this;
        }

        public Criteria andPizhunjiguanLessThanOrEqualTo(String value) {
            addCriterion("PIZHUNJIGUAN <=", value, "pizhunjiguan");
            return (Criteria) this;
        }

        public Criteria andPizhunjiguanLike(String value) {
            addCriterion("PIZHUNJIGUAN like", value, "pizhunjiguan");
            return (Criteria) this;
        }

        public Criteria andPizhunjiguanNotLike(String value) {
            addCriterion("PIZHUNJIGUAN not like", value, "pizhunjiguan");
            return (Criteria) this;
        }

        public Criteria andPizhunjiguanIn(List<String> values) {
            addCriterion("PIZHUNJIGUAN in", values, "pizhunjiguan");
            return (Criteria) this;
        }

        public Criteria andPizhunjiguanNotIn(List<String> values) {
            addCriterion("PIZHUNJIGUAN not in", values, "pizhunjiguan");
            return (Criteria) this;
        }

        public Criteria andPizhunjiguanBetween(String value1, String value2) {
            addCriterion("PIZHUNJIGUAN between", value1, value2, "pizhunjiguan");
            return (Criteria) this;
        }

        public Criteria andPizhunjiguanNotBetween(String value1, String value2) {
            addCriterion("PIZHUNJIGUAN not between", value1, value2, "pizhunjiguan");
            return (Criteria) this;
        }

        public Criteria andHezuodanweiIsNull() {
            addCriterion("HEZUODANWEI is null");
            return (Criteria) this;
        }

        public Criteria andHezuodanweiIsNotNull() {
            addCriterion("HEZUODANWEI is not null");
            return (Criteria) this;
        }

        public Criteria andHezuodanweiEqualTo(String value) {
            addCriterion("HEZUODANWEI =", value, "hezuodanwei");
            return (Criteria) this;
        }

        public Criteria andHezuodanweiNotEqualTo(String value) {
            addCriterion("HEZUODANWEI <>", value, "hezuodanwei");
            return (Criteria) this;
        }

        public Criteria andHezuodanweiGreaterThan(String value) {
            addCriterion("HEZUODANWEI >", value, "hezuodanwei");
            return (Criteria) this;
        }

        public Criteria andHezuodanweiGreaterThanOrEqualTo(String value) {
            addCriterion("HEZUODANWEI >=", value, "hezuodanwei");
            return (Criteria) this;
        }

        public Criteria andHezuodanweiLessThan(String value) {
            addCriterion("HEZUODANWEI <", value, "hezuodanwei");
            return (Criteria) this;
        }

        public Criteria andHezuodanweiLessThanOrEqualTo(String value) {
            addCriterion("HEZUODANWEI <=", value, "hezuodanwei");
            return (Criteria) this;
        }

        public Criteria andHezuodanweiLike(String value) {
            addCriterion("HEZUODANWEI like", value, "hezuodanwei");
            return (Criteria) this;
        }

        public Criteria andHezuodanweiNotLike(String value) {
            addCriterion("HEZUODANWEI not like", value, "hezuodanwei");
            return (Criteria) this;
        }

        public Criteria andHezuodanweiIn(List<String> values) {
            addCriterion("HEZUODANWEI in", values, "hezuodanwei");
            return (Criteria) this;
        }

        public Criteria andHezuodanweiNotIn(List<String> values) {
            addCriterion("HEZUODANWEI not in", values, "hezuodanwei");
            return (Criteria) this;
        }

        public Criteria andHezuodanweiBetween(String value1, String value2) {
            addCriterion("HEZUODANWEI between", value1, value2, "hezuodanwei");
            return (Criteria) this;
        }

        public Criteria andHezuodanweiNotBetween(String value1, String value2) {
            addCriterion("HEZUODANWEI not between", value1, value2, "hezuodanwei");
            return (Criteria) this;
        }

        public Criteria andJingneiIsNull() {
            addCriterion("JINGNEI is null");
            return (Criteria) this;
        }

        public Criteria andJingneiIsNotNull() {
            addCriterion("JINGNEI is not null");
            return (Criteria) this;
        }

        public Criteria andJingneiEqualTo(BigDecimal value) {
            addCriterion("JINGNEI =", value, "jingnei");
            return (Criteria) this;
        }

        public Criteria andJingneiNotEqualTo(BigDecimal value) {
            addCriterion("JINGNEI <>", value, "jingnei");
            return (Criteria) this;
        }

        public Criteria andJingneiGreaterThan(BigDecimal value) {
            addCriterion("JINGNEI >", value, "jingnei");
            return (Criteria) this;
        }

        public Criteria andJingneiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JINGNEI >=", value, "jingnei");
            return (Criteria) this;
        }

        public Criteria andJingneiLessThan(BigDecimal value) {
            addCriterion("JINGNEI <", value, "jingnei");
            return (Criteria) this;
        }

        public Criteria andJingneiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JINGNEI <=", value, "jingnei");
            return (Criteria) this;
        }

        public Criteria andJingneiIn(List<BigDecimal> values) {
            addCriterion("JINGNEI in", values, "jingnei");
            return (Criteria) this;
        }

        public Criteria andJingneiNotIn(List<BigDecimal> values) {
            addCriterion("JINGNEI not in", values, "jingnei");
            return (Criteria) this;
        }

        public Criteria andJingneiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JINGNEI between", value1, value2, "jingnei");
            return (Criteria) this;
        }

        public Criteria andJingneiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JINGNEI not between", value1, value2, "jingnei");
            return (Criteria) this;
        }

        public Criteria andJingwaiIsNull() {
            addCriterion("JINGWAI is null");
            return (Criteria) this;
        }

        public Criteria andJingwaiIsNotNull() {
            addCriterion("JINGWAI is not null");
            return (Criteria) this;
        }

        public Criteria andJingwaiEqualTo(BigDecimal value) {
            addCriterion("JINGWAI =", value, "jingwai");
            return (Criteria) this;
        }

        public Criteria andJingwaiNotEqualTo(BigDecimal value) {
            addCriterion("JINGWAI <>", value, "jingwai");
            return (Criteria) this;
        }

        public Criteria andJingwaiGreaterThan(BigDecimal value) {
            addCriterion("JINGWAI >", value, "jingwai");
            return (Criteria) this;
        }

        public Criteria andJingwaiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JINGWAI >=", value, "jingwai");
            return (Criteria) this;
        }

        public Criteria andJingwaiLessThan(BigDecimal value) {
            addCriterion("JINGWAI <", value, "jingwai");
            return (Criteria) this;
        }

        public Criteria andJingwaiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JINGWAI <=", value, "jingwai");
            return (Criteria) this;
        }

        public Criteria andJingwaiIn(List<BigDecimal> values) {
            addCriterion("JINGWAI in", values, "jingwai");
            return (Criteria) this;
        }

        public Criteria andJingwaiNotIn(List<BigDecimal> values) {
            addCriterion("JINGWAI not in", values, "jingwai");
            return (Criteria) this;
        }

        public Criteria andJingwaiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JINGWAI between", value1, value2, "jingwai");
            return (Criteria) this;
        }

        public Criteria andJingwaiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JINGWAI not between", value1, value2, "jingwai");
            return (Criteria) this;
        }

        public Criteria andXiangmuleibieIsNull() {
            addCriterion("XIANGMULEIBIE is null");
            return (Criteria) this;
        }

        public Criteria andXiangmuleibieIsNotNull() {
            addCriterion("XIANGMULEIBIE is not null");
            return (Criteria) this;
        }

        public Criteria andXiangmuleibieEqualTo(String value) {
            addCriterion("XIANGMULEIBIE =", value, "xiangmuleibie");
            return (Criteria) this;
        }

        public Criteria andXiangmuleibieNotEqualTo(String value) {
            addCriterion("XIANGMULEIBIE <>", value, "xiangmuleibie");
            return (Criteria) this;
        }

        public Criteria andXiangmuleibieGreaterThan(String value) {
            addCriterion("XIANGMULEIBIE >", value, "xiangmuleibie");
            return (Criteria) this;
        }

        public Criteria andXiangmuleibieGreaterThanOrEqualTo(String value) {
            addCriterion("XIANGMULEIBIE >=", value, "xiangmuleibie");
            return (Criteria) this;
        }

        public Criteria andXiangmuleibieLessThan(String value) {
            addCriterion("XIANGMULEIBIE <", value, "xiangmuleibie");
            return (Criteria) this;
        }

        public Criteria andXiangmuleibieLessThanOrEqualTo(String value) {
            addCriterion("XIANGMULEIBIE <=", value, "xiangmuleibie");
            return (Criteria) this;
        }

        public Criteria andXiangmuleibieLike(String value) {
            addCriterion("XIANGMULEIBIE like", value, "xiangmuleibie");
            return (Criteria) this;
        }

        public Criteria andXiangmuleibieNotLike(String value) {
            addCriterion("XIANGMULEIBIE not like", value, "xiangmuleibie");
            return (Criteria) this;
        }

        public Criteria andXiangmuleibieIn(List<String> values) {
            addCriterion("XIANGMULEIBIE in", values, "xiangmuleibie");
            return (Criteria) this;
        }

        public Criteria andXiangmuleibieNotIn(List<String> values) {
            addCriterion("XIANGMULEIBIE not in", values, "xiangmuleibie");
            return (Criteria) this;
        }

        public Criteria andXiangmuleibieBetween(String value1, String value2) {
            addCriterion("XIANGMULEIBIE between", value1, value2, "xiangmuleibie");
            return (Criteria) this;
        }

        public Criteria andXiangmuleibieNotBetween(String value1, String value2) {
            addCriterion("XIANGMULEIBIE not between", value1, value2, "xiangmuleibie");
            return (Criteria) this;
        }

        public Criteria andShishikaishishijianIsNull() {
            addCriterion("SHISHIKAISHISHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andShishikaishishijianIsNotNull() {
            addCriterion("SHISHIKAISHISHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andShishikaishishijianEqualTo(Date value) {
            addCriterion("SHISHIKAISHISHIJIAN =", value, "shishikaishishijian");
            return (Criteria) this;
        }

        public Criteria andShishikaishishijianNotEqualTo(Date value) {
            addCriterion("SHISHIKAISHISHIJIAN <>", value, "shishikaishishijian");
            return (Criteria) this;
        }

        public Criteria andShishikaishishijianGreaterThan(Date value) {
            addCriterion("SHISHIKAISHISHIJIAN >", value, "shishikaishishijian");
            return (Criteria) this;
        }

        public Criteria andShishikaishishijianGreaterThanOrEqualTo(Date value) {
            addCriterion("SHISHIKAISHISHIJIAN >=", value, "shishikaishishijian");
            return (Criteria) this;
        }

        public Criteria andShishikaishishijianLessThan(Date value) {
            addCriterion("SHISHIKAISHISHIJIAN <", value, "shishikaishishijian");
            return (Criteria) this;
        }

        public Criteria andShishikaishishijianLessThanOrEqualTo(Date value) {
            addCriterion("SHISHIKAISHISHIJIAN <=", value, "shishikaishishijian");
            return (Criteria) this;
        }

        public Criteria andShishikaishishijianIn(List<Date> values) {
            addCriterion("SHISHIKAISHISHIJIAN in", values, "shishikaishishijian");
            return (Criteria) this;
        }

        public Criteria andShishikaishishijianNotIn(List<Date> values) {
            addCriterion("SHISHIKAISHISHIJIAN not in", values, "shishikaishishijian");
            return (Criteria) this;
        }

        public Criteria andShishikaishishijianBetween(Date value1, Date value2) {
            addCriterion("SHISHIKAISHISHIJIAN between", value1, value2, "shishikaishishijian");
            return (Criteria) this;
        }

        public Criteria andShishikaishishijianNotBetween(Date value1, Date value2) {
            addCriterion("SHISHIKAISHISHIJIAN not between", value1, value2, "shishikaishishijian");
            return (Criteria) this;
        }

        public Criteria andShishidiIsNull() {
            addCriterion("SHISHIDI is null");
            return (Criteria) this;
        }

        public Criteria andShishidiIsNotNull() {
            addCriterion("SHISHIDI is not null");
            return (Criteria) this;
        }

        public Criteria andShishidiEqualTo(String value) {
            addCriterion("SHISHIDI =", value, "shishidi");
            return (Criteria) this;
        }

        public Criteria andShishidiNotEqualTo(String value) {
            addCriterion("SHISHIDI <>", value, "shishidi");
            return (Criteria) this;
        }

        public Criteria andShishidiGreaterThan(String value) {
            addCriterion("SHISHIDI >", value, "shishidi");
            return (Criteria) this;
        }

        public Criteria andShishidiGreaterThanOrEqualTo(String value) {
            addCriterion("SHISHIDI >=", value, "shishidi");
            return (Criteria) this;
        }

        public Criteria andShishidiLessThan(String value) {
            addCriterion("SHISHIDI <", value, "shishidi");
            return (Criteria) this;
        }

        public Criteria andShishidiLessThanOrEqualTo(String value) {
            addCriterion("SHISHIDI <=", value, "shishidi");
            return (Criteria) this;
        }

        public Criteria andShishidiLike(String value) {
            addCriterion("SHISHIDI like", value, "shishidi");
            return (Criteria) this;
        }

        public Criteria andShishidiNotLike(String value) {
            addCriterion("SHISHIDI not like", value, "shishidi");
            return (Criteria) this;
        }

        public Criteria andShishidiIn(List<String> values) {
            addCriterion("SHISHIDI in", values, "shishidi");
            return (Criteria) this;
        }

        public Criteria andShishidiNotIn(List<String> values) {
            addCriterion("SHISHIDI not in", values, "shishidi");
            return (Criteria) this;
        }

        public Criteria andShishidiBetween(String value1, String value2) {
            addCriterion("SHISHIDI between", value1, value2, "shishidi");
            return (Criteria) this;
        }

        public Criteria andShishidiNotBetween(String value1, String value2) {
            addCriterion("SHISHIDI not between", value1, value2, "shishidi");
            return (Criteria) this;
        }

        public Criteria andShishijieshushijianIsNull() {
            addCriterion("SHISHIJIESHUSHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andShishijieshushijianIsNotNull() {
            addCriterion("SHISHIJIESHUSHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andShishijieshushijianEqualTo(Date value) {
            addCriterion("SHISHIJIESHUSHIJIAN =", value, "shishijieshushijian");
            return (Criteria) this;
        }

        public Criteria andShishijieshushijianNotEqualTo(Date value) {
            addCriterion("SHISHIJIESHUSHIJIAN <>", value, "shishijieshushijian");
            return (Criteria) this;
        }

        public Criteria andShishijieshushijianGreaterThan(Date value) {
            addCriterion("SHISHIJIESHUSHIJIAN >", value, "shishijieshushijian");
            return (Criteria) this;
        }

        public Criteria andShishijieshushijianGreaterThanOrEqualTo(Date value) {
            addCriterion("SHISHIJIESHUSHIJIAN >=", value, "shishijieshushijian");
            return (Criteria) this;
        }

        public Criteria andShishijieshushijianLessThan(Date value) {
            addCriterion("SHISHIJIESHUSHIJIAN <", value, "shishijieshushijian");
            return (Criteria) this;
        }

        public Criteria andShishijieshushijianLessThanOrEqualTo(Date value) {
            addCriterion("SHISHIJIESHUSHIJIAN <=", value, "shishijieshushijian");
            return (Criteria) this;
        }

        public Criteria andShishijieshushijianIn(List<Date> values) {
            addCriterion("SHISHIJIESHUSHIJIAN in", values, "shishijieshushijian");
            return (Criteria) this;
        }

        public Criteria andShishijieshushijianNotIn(List<Date> values) {
            addCriterion("SHISHIJIESHUSHIJIAN not in", values, "shishijieshushijian");
            return (Criteria) this;
        }

        public Criteria andShishijieshushijianBetween(Date value1, Date value2) {
            addCriterion("SHISHIJIESHUSHIJIAN between", value1, value2, "shishijieshushijian");
            return (Criteria) this;
        }

        public Criteria andShishijieshushijianNotBetween(Date value1, Date value2) {
            addCriterion("SHISHIJIESHUSHIJIAN not between", value1, value2, "shishijieshushijian");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1IsNull() {
            addCriterion("TJNJJIEGUO1 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1IsNotNull() {
            addCriterion("TJNJJIEGUO1 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1EqualTo(String value) {
            addCriterion("TJNJJIEGUO1 =", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1NotEqualTo(String value) {
            addCriterion("TJNJJIEGUO1 <>", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1GreaterThan(String value) {
            addCriterion("TJNJJIEGUO1 >", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1GreaterThanOrEqualTo(String value) {
            addCriterion("TJNJJIEGUO1 >=", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1LessThan(String value) {
            addCriterion("TJNJJIEGUO1 <", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1LessThanOrEqualTo(String value) {
            addCriterion("TJNJJIEGUO1 <=", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1Like(String value) {
            addCriterion("TJNJJIEGUO1 like", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1NotLike(String value) {
            addCriterion("TJNJJIEGUO1 not like", value, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1In(List<String> values) {
            addCriterion("TJNJJIEGUO1 in", values, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1NotIn(List<String> values) {
            addCriterion("TJNJJIEGUO1 not in", values, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1Between(String value1, String value2) {
            addCriterion("TJNJJIEGUO1 between", value1, value2, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo1NotBetween(String value1, String value2) {
            addCriterion("TJNJJIEGUO1 not between", value1, value2, "tjnjjieguo1");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2IsNull() {
            addCriterion("TJNJJIEGUO2 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2IsNotNull() {
            addCriterion("TJNJJIEGUO2 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2EqualTo(String value) {
            addCriterion("TJNJJIEGUO2 =", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2NotEqualTo(String value) {
            addCriterion("TJNJJIEGUO2 <>", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2GreaterThan(String value) {
            addCriterion("TJNJJIEGUO2 >", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2GreaterThanOrEqualTo(String value) {
            addCriterion("TJNJJIEGUO2 >=", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2LessThan(String value) {
            addCriterion("TJNJJIEGUO2 <", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2LessThanOrEqualTo(String value) {
            addCriterion("TJNJJIEGUO2 <=", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2Like(String value) {
            addCriterion("TJNJJIEGUO2 like", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2NotLike(String value) {
            addCriterion("TJNJJIEGUO2 not like", value, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2In(List<String> values) {
            addCriterion("TJNJJIEGUO2 in", values, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2NotIn(List<String> values) {
            addCriterion("TJNJJIEGUO2 not in", values, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2Between(String value1, String value2) {
            addCriterion("TJNJJIEGUO2 between", value1, value2, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjjieguo2NotBetween(String value1, String value2) {
            addCriterion("TJNJJIEGUO2 not between", value1, value2, "tjnjjieguo2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1IsNull() {
            addCriterion("TJNJYIJIAN1 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1IsNotNull() {
            addCriterion("TJNJYIJIAN1 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1EqualTo(String value) {
            addCriterion("TJNJYIJIAN1 =", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1NotEqualTo(String value) {
            addCriterion("TJNJYIJIAN1 <>", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1GreaterThan(String value) {
            addCriterion("TJNJYIJIAN1 >", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1GreaterThanOrEqualTo(String value) {
            addCriterion("TJNJYIJIAN1 >=", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1LessThan(String value) {
            addCriterion("TJNJYIJIAN1 <", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1LessThanOrEqualTo(String value) {
            addCriterion("TJNJYIJIAN1 <=", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1Like(String value) {
            addCriterion("TJNJYIJIAN1 like", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1NotLike(String value) {
            addCriterion("TJNJYIJIAN1 not like", value, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1In(List<String> values) {
            addCriterion("TJNJYIJIAN1 in", values, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1NotIn(List<String> values) {
            addCriterion("TJNJYIJIAN1 not in", values, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1Between(String value1, String value2) {
            addCriterion("TJNJYIJIAN1 between", value1, value2, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian1NotBetween(String value1, String value2) {
            addCriterion("TJNJYIJIAN1 not between", value1, value2, "tjnjyijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2IsNull() {
            addCriterion("TJNJYIJIAN2 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2IsNotNull() {
            addCriterion("TJNJYIJIAN2 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2EqualTo(String value) {
            addCriterion("TJNJYIJIAN2 =", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2NotEqualTo(String value) {
            addCriterion("TJNJYIJIAN2 <>", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2GreaterThan(String value) {
            addCriterion("TJNJYIJIAN2 >", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2GreaterThanOrEqualTo(String value) {
            addCriterion("TJNJYIJIAN2 >=", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2LessThan(String value) {
            addCriterion("TJNJYIJIAN2 <", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2LessThanOrEqualTo(String value) {
            addCriterion("TJNJYIJIAN2 <=", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2Like(String value) {
            addCriterion("TJNJYIJIAN2 like", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2NotLike(String value) {
            addCriterion("TJNJYIJIAN2 not like", value, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2In(List<String> values) {
            addCriterion("TJNJYIJIAN2 in", values, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2NotIn(List<String> values) {
            addCriterion("TJNJYIJIAN2 not in", values, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2Between(String value1, String value2) {
            addCriterion("TJNJYIJIAN2 between", value1, value2, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjyijian2NotBetween(String value1, String value2) {
            addCriterion("TJNJYIJIAN2 not between", value1, value2, "tjnjyijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1IsNull() {
            addCriterion("TJNJXINGMING1 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1IsNotNull() {
            addCriterion("TJNJXINGMING1 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1EqualTo(String value) {
            addCriterion("TJNJXINGMING1 =", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1NotEqualTo(String value) {
            addCriterion("TJNJXINGMING1 <>", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1GreaterThan(String value) {
            addCriterion("TJNJXINGMING1 >", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1GreaterThanOrEqualTo(String value) {
            addCriterion("TJNJXINGMING1 >=", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1LessThan(String value) {
            addCriterion("TJNJXINGMING1 <", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1LessThanOrEqualTo(String value) {
            addCriterion("TJNJXINGMING1 <=", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1Like(String value) {
            addCriterion("TJNJXINGMING1 like", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1NotLike(String value) {
            addCriterion("TJNJXINGMING1 not like", value, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1In(List<String> values) {
            addCriterion("TJNJXINGMING1 in", values, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1NotIn(List<String> values) {
            addCriterion("TJNJXINGMING1 not in", values, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1Between(String value1, String value2) {
            addCriterion("TJNJXINGMING1 between", value1, value2, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming1NotBetween(String value1, String value2) {
            addCriterion("TJNJXINGMING1 not between", value1, value2, "tjnjxingming1");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2IsNull() {
            addCriterion("TJNJXINGMING2 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2IsNotNull() {
            addCriterion("TJNJXINGMING2 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2EqualTo(String value) {
            addCriterion("TJNJXINGMING2 =", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2NotEqualTo(String value) {
            addCriterion("TJNJXINGMING2 <>", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2GreaterThan(String value) {
            addCriterion("TJNJXINGMING2 >", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2GreaterThanOrEqualTo(String value) {
            addCriterion("TJNJXINGMING2 >=", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2LessThan(String value) {
            addCriterion("TJNJXINGMING2 <", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2LessThanOrEqualTo(String value) {
            addCriterion("TJNJXINGMING2 <=", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2Like(String value) {
            addCriterion("TJNJXINGMING2 like", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2NotLike(String value) {
            addCriterion("TJNJXINGMING2 not like", value, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2In(List<String> values) {
            addCriterion("TJNJXINGMING2 in", values, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2NotIn(List<String> values) {
            addCriterion("TJNJXINGMING2 not in", values, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2Between(String value1, String value2) {
            addCriterion("TJNJXINGMING2 between", value1, value2, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjxingming2NotBetween(String value1, String value2) {
            addCriterion("TJNJXINGMING2 not between", value1, value2, "tjnjxingming2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1IsNull() {
            addCriterion("TJNJSHIJIAN1 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1IsNotNull() {
            addCriterion("TJNJSHIJIAN1 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1EqualTo(Date value) {
            addCriterion("TJNJSHIJIAN1 =", value, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1NotEqualTo(Date value) {
            addCriterion("TJNJSHIJIAN1 <>", value, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1GreaterThan(Date value) {
            addCriterion("TJNJSHIJIAN1 >", value, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1GreaterThanOrEqualTo(Date value) {
            addCriterion("TJNJSHIJIAN1 >=", value, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1LessThan(Date value) {
            addCriterion("TJNJSHIJIAN1 <", value, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1LessThanOrEqualTo(Date value) {
            addCriterion("TJNJSHIJIAN1 <=", value, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1In(List<Date> values) {
            addCriterion("TJNJSHIJIAN1 in", values, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1NotIn(List<Date> values) {
            addCriterion("TJNJSHIJIAN1 not in", values, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1Between(Date value1, Date value2) {
            addCriterion("TJNJSHIJIAN1 between", value1, value2, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian1NotBetween(Date value1, Date value2) {
            addCriterion("TJNJSHIJIAN1 not between", value1, value2, "tjnjshijian1");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2IsNull() {
            addCriterion("TJNJSHIJIAN2 is null");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2IsNotNull() {
            addCriterion("TJNJSHIJIAN2 is not null");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2EqualTo(Date value) {
            addCriterion("TJNJSHIJIAN2 =", value, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2NotEqualTo(Date value) {
            addCriterion("TJNJSHIJIAN2 <>", value, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2GreaterThan(Date value) {
            addCriterion("TJNJSHIJIAN2 >", value, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2GreaterThanOrEqualTo(Date value) {
            addCriterion("TJNJSHIJIAN2 >=", value, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2LessThan(Date value) {
            addCriterion("TJNJSHIJIAN2 <", value, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2LessThanOrEqualTo(Date value) {
            addCriterion("TJNJSHIJIAN2 <=", value, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2In(List<Date> values) {
            addCriterion("TJNJSHIJIAN2 in", values, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2NotIn(List<Date> values) {
            addCriterion("TJNJSHIJIAN2 not in", values, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2Between(Date value1, Date value2) {
            addCriterion("TJNJSHIJIAN2 between", value1, value2, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andTjnjshijian2NotBetween(Date value1, Date value2) {
            addCriterion("TJNJSHIJIAN2 not between", value1, value2, "tjnjshijian2");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangIsNull() {
            addCriterion("WUCIQINGKUANG is null");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangIsNotNull() {
            addCriterion("WUCIQINGKUANG is not null");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangEqualTo(String value) {
            addCriterion("WUCIQINGKUANG =", value, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangNotEqualTo(String value) {
            addCriterion("WUCIQINGKUANG <>", value, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangGreaterThan(String value) {
            addCriterion("WUCIQINGKUANG >", value, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangGreaterThanOrEqualTo(String value) {
            addCriterion("WUCIQINGKUANG >=", value, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangLessThan(String value) {
            addCriterion("WUCIQINGKUANG <", value, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangLessThanOrEqualTo(String value) {
            addCriterion("WUCIQINGKUANG <=", value, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangLike(String value) {
            addCriterion("WUCIQINGKUANG like", value, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangNotLike(String value) {
            addCriterion("WUCIQINGKUANG not like", value, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangIn(List<String> values) {
            addCriterion("WUCIQINGKUANG in", values, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangNotIn(List<String> values) {
            addCriterion("WUCIQINGKUANG not in", values, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangBetween(String value1, String value2) {
            addCriterion("WUCIQINGKUANG between", value1, value2, "wuciqingkuang");
            return (Criteria) this;
        }

        public Criteria andWuciqingkuangNotBetween(String value1, String value2) {
            addCriterion("WUCIQINGKUANG not between", value1, value2, "wuciqingkuang");
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