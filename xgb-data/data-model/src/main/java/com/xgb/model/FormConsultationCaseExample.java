package com.xgb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FormConsultationCaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FormConsultationCaseExample() {
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

        public Criteria andApplicationIsNull() {
            addCriterion("APPLICATION is null");
            return (Criteria) this;
        }

        public Criteria andApplicationIsNotNull() {
            addCriterion("APPLICATION is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationEqualTo(String value) {
            addCriterion("APPLICATION =", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotEqualTo(String value) {
            addCriterion("APPLICATION <>", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationGreaterThan(String value) {
            addCriterion("APPLICATION >", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICATION >=", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationLessThan(String value) {
            addCriterion("APPLICATION <", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationLessThanOrEqualTo(String value) {
            addCriterion("APPLICATION <=", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationLike(String value) {
            addCriterion("APPLICATION like", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotLike(String value) {
            addCriterion("APPLICATION not like", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationIn(List<String> values) {
            addCriterion("APPLICATION in", values, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotIn(List<String> values) {
            addCriterion("APPLICATION not in", values, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationBetween(String value1, String value2) {
            addCriterion("APPLICATION between", value1, value2, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotBetween(String value1, String value2) {
            addCriterion("APPLICATION not between", value1, value2, "application");
            return (Criteria) this;
        }

        public Criteria andCatalogIsNull() {
            addCriterion("CATALOG is null");
            return (Criteria) this;
        }

        public Criteria andCatalogIsNotNull() {
            addCriterion("CATALOG is not null");
            return (Criteria) this;
        }

        public Criteria andCatalogEqualTo(String value) {
            addCriterion("CATALOG =", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotEqualTo(String value) {
            addCriterion("CATALOG <>", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogGreaterThan(String value) {
            addCriterion("CATALOG >", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogGreaterThanOrEqualTo(String value) {
            addCriterion("CATALOG >=", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogLessThan(String value) {
            addCriterion("CATALOG <", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogLessThanOrEqualTo(String value) {
            addCriterion("CATALOG <=", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogLike(String value) {
            addCriterion("CATALOG like", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotLike(String value) {
            addCriterion("CATALOG not like", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogIn(List<String> values) {
            addCriterion("CATALOG in", values, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotIn(List<String> values) {
            addCriterion("CATALOG not in", values, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogBetween(String value1, String value2) {
            addCriterion("CATALOG between", value1, value2, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotBetween(String value1, String value2) {
            addCriterion("CATALOG not between", value1, value2, "catalog");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNull() {
            addCriterion("ORGID is null");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNotNull() {
            addCriterion("ORGID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgidEqualTo(String value) {
            addCriterion("ORGID =", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotEqualTo(String value) {
            addCriterion("ORGID <>", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThan(String value) {
            addCriterion("ORGID >", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThanOrEqualTo(String value) {
            addCriterion("ORGID >=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThan(String value) {
            addCriterion("ORGID <", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThanOrEqualTo(String value) {
            addCriterion("ORGID <=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLike(String value) {
            addCriterion("ORGID like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotLike(String value) {
            addCriterion("ORGID not like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidIn(List<String> values) {
            addCriterion("ORGID in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotIn(List<String> values) {
            addCriterion("ORGID not in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidBetween(String value1, String value2) {
            addCriterion("ORGID between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotBetween(String value1, String value2) {
            addCriterion("ORGID not between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidentityIsNull() {
            addCriterion("ORGIDENTITY is null");
            return (Criteria) this;
        }

        public Criteria andOrgidentityIsNotNull() {
            addCriterion("ORGIDENTITY is not null");
            return (Criteria) this;
        }

        public Criteria andOrgidentityEqualTo(String value) {
            addCriterion("ORGIDENTITY =", value, "orgidentity");
            return (Criteria) this;
        }

        public Criteria andOrgidentityNotEqualTo(String value) {
            addCriterion("ORGIDENTITY <>", value, "orgidentity");
            return (Criteria) this;
        }

        public Criteria andOrgidentityGreaterThan(String value) {
            addCriterion("ORGIDENTITY >", value, "orgidentity");
            return (Criteria) this;
        }

        public Criteria andOrgidentityGreaterThanOrEqualTo(String value) {
            addCriterion("ORGIDENTITY >=", value, "orgidentity");
            return (Criteria) this;
        }

        public Criteria andOrgidentityLessThan(String value) {
            addCriterion("ORGIDENTITY <", value, "orgidentity");
            return (Criteria) this;
        }

        public Criteria andOrgidentityLessThanOrEqualTo(String value) {
            addCriterion("ORGIDENTITY <=", value, "orgidentity");
            return (Criteria) this;
        }

        public Criteria andOrgidentityLike(String value) {
            addCriterion("ORGIDENTITY like", value, "orgidentity");
            return (Criteria) this;
        }

        public Criteria andOrgidentityNotLike(String value) {
            addCriterion("ORGIDENTITY not like", value, "orgidentity");
            return (Criteria) this;
        }

        public Criteria andOrgidentityIn(List<String> values) {
            addCriterion("ORGIDENTITY in", values, "orgidentity");
            return (Criteria) this;
        }

        public Criteria andOrgidentityNotIn(List<String> values) {
            addCriterion("ORGIDENTITY not in", values, "orgidentity");
            return (Criteria) this;
        }

        public Criteria andOrgidentityBetween(String value1, String value2) {
            addCriterion("ORGIDENTITY between", value1, value2, "orgidentity");
            return (Criteria) this;
        }

        public Criteria andOrgidentityNotBetween(String value1, String value2) {
            addCriterion("ORGIDENTITY not between", value1, value2, "orgidentity");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNull() {
            addCriterion("ORGNAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNotNull() {
            addCriterion("ORGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnameEqualTo(String value) {
            addCriterion("ORGNAME =", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotEqualTo(String value) {
            addCriterion("ORGNAME <>", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThan(String value) {
            addCriterion("ORGNAME >", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThanOrEqualTo(String value) {
            addCriterion("ORGNAME >=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThan(String value) {
            addCriterion("ORGNAME <", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThanOrEqualTo(String value) {
            addCriterion("ORGNAME <=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLike(String value) {
            addCriterion("ORGNAME like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotLike(String value) {
            addCriterion("ORGNAME not like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameIn(List<String> values) {
            addCriterion("ORGNAME in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotIn(List<String> values) {
            addCriterion("ORGNAME not in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameBetween(String value1, String value2) {
            addCriterion("ORGNAME between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotBetween(String value1, String value2) {
            addCriterion("ORGNAME not between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andProposerIsNull() {
            addCriterion("PROPOSER is null");
            return (Criteria) this;
        }

        public Criteria andProposerIsNotNull() {
            addCriterion("PROPOSER is not null");
            return (Criteria) this;
        }

        public Criteria andProposerEqualTo(String value) {
            addCriterion("PROPOSER =", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotEqualTo(String value) {
            addCriterion("PROPOSER <>", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerGreaterThan(String value) {
            addCriterion("PROPOSER >", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerGreaterThanOrEqualTo(String value) {
            addCriterion("PROPOSER >=", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerLessThan(String value) {
            addCriterion("PROPOSER <", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerLessThanOrEqualTo(String value) {
            addCriterion("PROPOSER <=", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerLike(String value) {
            addCriterion("PROPOSER like", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotLike(String value) {
            addCriterion("PROPOSER not like", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerIn(List<String> values) {
            addCriterion("PROPOSER in", values, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotIn(List<String> values) {
            addCriterion("PROPOSER not in", values, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerBetween(String value1, String value2) {
            addCriterion("PROPOSER between", value1, value2, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotBetween(String value1, String value2) {
            addCriterion("PROPOSER not between", value1, value2, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposeidIsNull() {
            addCriterion("PROPOSEID is null");
            return (Criteria) this;
        }

        public Criteria andProposeidIsNotNull() {
            addCriterion("PROPOSEID is not null");
            return (Criteria) this;
        }

        public Criteria andProposeidEqualTo(Long value) {
            addCriterion("PROPOSEID =", value, "proposeid");
            return (Criteria) this;
        }

        public Criteria andProposeidNotEqualTo(Long value) {
            addCriterion("PROPOSEID <>", value, "proposeid");
            return (Criteria) this;
        }

        public Criteria andProposeidGreaterThan(Long value) {
            addCriterion("PROPOSEID >", value, "proposeid");
            return (Criteria) this;
        }

        public Criteria andProposeidGreaterThanOrEqualTo(Long value) {
            addCriterion("PROPOSEID >=", value, "proposeid");
            return (Criteria) this;
        }

        public Criteria andProposeidLessThan(Long value) {
            addCriterion("PROPOSEID <", value, "proposeid");
            return (Criteria) this;
        }

        public Criteria andProposeidLessThanOrEqualTo(Long value) {
            addCriterion("PROPOSEID <=", value, "proposeid");
            return (Criteria) this;
        }

        public Criteria andProposeidIn(List<Long> values) {
            addCriterion("PROPOSEID in", values, "proposeid");
            return (Criteria) this;
        }

        public Criteria andProposeidNotIn(List<Long> values) {
            addCriterion("PROPOSEID not in", values, "proposeid");
            return (Criteria) this;
        }

        public Criteria andProposeidBetween(Long value1, Long value2) {
            addCriterion("PROPOSEID between", value1, value2, "proposeid");
            return (Criteria) this;
        }

        public Criteria andProposeidNotBetween(Long value1, Long value2) {
            addCriterion("PROPOSEID not between", value1, value2, "proposeid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNull() {
            addCriterion("DEPTID is null");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNotNull() {
            addCriterion("DEPTID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidEqualTo(Long value) {
            addCriterion("DEPTID =", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotEqualTo(Long value) {
            addCriterion("DEPTID <>", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThan(Long value) {
            addCriterion("DEPTID >", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThanOrEqualTo(Long value) {
            addCriterion("DEPTID >=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThan(Long value) {
            addCriterion("DEPTID <", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThanOrEqualTo(Long value) {
            addCriterion("DEPTID <=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidIn(List<Long> values) {
            addCriterion("DEPTID in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotIn(List<Long> values) {
            addCriterion("DEPTID not in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidBetween(Long value1, Long value2) {
            addCriterion("DEPTID between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotBetween(Long value1, Long value2) {
            addCriterion("DEPTID not between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeIsNull() {
            addCriterion("LASTMODIFYTIME is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeIsNotNull() {
            addCriterion("LASTMODIFYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeEqualTo(Date value) {
            addCriterion("LASTMODIFYTIME =", value, "lastmodifytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeNotEqualTo(Date value) {
            addCriterion("LASTMODIFYTIME <>", value, "lastmodifytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeGreaterThan(Date value) {
            addCriterion("LASTMODIFYTIME >", value, "lastmodifytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTMODIFYTIME >=", value, "lastmodifytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeLessThan(Date value) {
            addCriterion("LASTMODIFYTIME <", value, "lastmodifytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeLessThanOrEqualTo(Date value) {
            addCriterion("LASTMODIFYTIME <=", value, "lastmodifytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeIn(List<Date> values) {
            addCriterion("LASTMODIFYTIME in", values, "lastmodifytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeNotIn(List<Date> values) {
            addCriterion("LASTMODIFYTIME not in", values, "lastmodifytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeBetween(Date value1, Date value2) {
            addCriterion("LASTMODIFYTIME between", value1, value2, "lastmodifytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeNotBetween(Date value1, Date value2) {
            addCriterion("LASTMODIFYTIME not between", value1, value2, "lastmodifytime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("STARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("STARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("STARTTIME =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("STARTTIME <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("STARTTIME >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("STARTTIME >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("STARTTIME <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("STARTTIME <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("STARTTIME in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("STARTTIME not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("STARTTIME between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("STARTTIME not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("ENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("ENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("ENDTIME =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("ENDTIME <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("ENDTIME >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ENDTIME >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("ENDTIME <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("ENDTIME <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("ENDTIME in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("ENDTIME not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("ENDTIME between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("ENDTIME not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andCreatetypeIsNull() {
            addCriterion("CREATETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCreatetypeIsNotNull() {
            addCriterion("CREATETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetypeEqualTo(Short value) {
            addCriterion("CREATETYPE =", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeNotEqualTo(Short value) {
            addCriterion("CREATETYPE <>", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeGreaterThan(Short value) {
            addCriterion("CREATETYPE >", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeGreaterThanOrEqualTo(Short value) {
            addCriterion("CREATETYPE >=", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeLessThan(Short value) {
            addCriterion("CREATETYPE <", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeLessThanOrEqualTo(Short value) {
            addCriterion("CREATETYPE <=", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeIn(List<Short> values) {
            addCriterion("CREATETYPE in", values, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeNotIn(List<Short> values) {
            addCriterion("CREATETYPE not in", values, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeBetween(Short value1, Short value2) {
            addCriterion("CREATETYPE between", value1, value2, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeNotBetween(Short value1, Short value2) {
            addCriterion("CREATETYPE not between", value1, value2, "createtype");
            return (Criteria) this;
        }

        public Criteria andCasetypeIsNull() {
            addCriterion("CASETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCasetypeIsNotNull() {
            addCriterion("CASETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCasetypeEqualTo(Short value) {
            addCriterion("CASETYPE =", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeNotEqualTo(Short value) {
            addCriterion("CASETYPE <>", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeGreaterThan(Short value) {
            addCriterion("CASETYPE >", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeGreaterThanOrEqualTo(Short value) {
            addCriterion("CASETYPE >=", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeLessThan(Short value) {
            addCriterion("CASETYPE <", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeLessThanOrEqualTo(Short value) {
            addCriterion("CASETYPE <=", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeIn(List<Short> values) {
            addCriterion("CASETYPE in", values, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeNotIn(List<Short> values) {
            addCriterion("CASETYPE not in", values, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeBetween(Short value1, Short value2) {
            addCriterion("CASETYPE between", value1, value2, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeNotBetween(Short value1, Short value2) {
            addCriterion("CASETYPE not between", value1, value2, "casetype");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("REGION is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("REGION is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(Long value) {
            addCriterion("REGION =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(Long value) {
            addCriterion("REGION <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(Long value) {
            addCriterion("REGION >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(Long value) {
            addCriterion("REGION >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(Long value) {
            addCriterion("REGION <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(Long value) {
            addCriterion("REGION <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<Long> values) {
            addCriterion("REGION in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<Long> values) {
            addCriterion("REGION not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(Long value1, Long value2) {
            addCriterion("REGION between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(Long value1, Long value2) {
            addCriterion("REGION not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andFinishedIsNull() {
            addCriterion("FINISHED is null");
            return (Criteria) this;
        }

        public Criteria andFinishedIsNotNull() {
            addCriterion("FINISHED is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedEqualTo(Short value) {
            addCriterion("FINISHED =", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotEqualTo(Short value) {
            addCriterion("FINISHED <>", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedGreaterThan(Short value) {
            addCriterion("FINISHED >", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedGreaterThanOrEqualTo(Short value) {
            addCriterion("FINISHED >=", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedLessThan(Short value) {
            addCriterion("FINISHED <", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedLessThanOrEqualTo(Short value) {
            addCriterion("FINISHED <=", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedIn(List<Short> values) {
            addCriterion("FINISHED in", values, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotIn(List<Short> values) {
            addCriterion("FINISHED not in", values, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedBetween(Short value1, Short value2) {
            addCriterion("FINISHED between", value1, value2, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotBetween(Short value1, Short value2) {
            addCriterion("FINISHED not between", value1, value2, "finished");
            return (Criteria) this;
        }

        public Criteria andCasestateIsNull() {
            addCriterion("CASESTATE is null");
            return (Criteria) this;
        }

        public Criteria andCasestateIsNotNull() {
            addCriterion("CASESTATE is not null");
            return (Criteria) this;
        }

        public Criteria andCasestateEqualTo(Short value) {
            addCriterion("CASESTATE =", value, "casestate");
            return (Criteria) this;
        }

        public Criteria andCasestateNotEqualTo(Short value) {
            addCriterion("CASESTATE <>", value, "casestate");
            return (Criteria) this;
        }

        public Criteria andCasestateGreaterThan(Short value) {
            addCriterion("CASESTATE >", value, "casestate");
            return (Criteria) this;
        }

        public Criteria andCasestateGreaterThanOrEqualTo(Short value) {
            addCriterion("CASESTATE >=", value, "casestate");
            return (Criteria) this;
        }

        public Criteria andCasestateLessThan(Short value) {
            addCriterion("CASESTATE <", value, "casestate");
            return (Criteria) this;
        }

        public Criteria andCasestateLessThanOrEqualTo(Short value) {
            addCriterion("CASESTATE <=", value, "casestate");
            return (Criteria) this;
        }

        public Criteria andCasestateIn(List<Short> values) {
            addCriterion("CASESTATE in", values, "casestate");
            return (Criteria) this;
        }

        public Criteria andCasestateNotIn(List<Short> values) {
            addCriterion("CASESTATE not in", values, "casestate");
            return (Criteria) this;
        }

        public Criteria andCasestateBetween(Short value1, Short value2) {
            addCriterion("CASESTATE between", value1, value2, "casestate");
            return (Criteria) this;
        }

        public Criteria andCasestateNotBetween(Short value1, Short value2) {
            addCriterion("CASESTATE not between", value1, value2, "casestate");
            return (Criteria) this;
        }

        public Criteria andPropertyAIsNull() {
            addCriterion("PROPERTY_A is null");
            return (Criteria) this;
        }

        public Criteria andPropertyAIsNotNull() {
            addCriterion("PROPERTY_A is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyAEqualTo(String value) {
            addCriterion("PROPERTY_A =", value, "propertyA");
            return (Criteria) this;
        }

        public Criteria andPropertyANotEqualTo(String value) {
            addCriterion("PROPERTY_A <>", value, "propertyA");
            return (Criteria) this;
        }

        public Criteria andPropertyAGreaterThan(String value) {
            addCriterion("PROPERTY_A >", value, "propertyA");
            return (Criteria) this;
        }

        public Criteria andPropertyAGreaterThanOrEqualTo(String value) {
            addCriterion("PROPERTY_A >=", value, "propertyA");
            return (Criteria) this;
        }

        public Criteria andPropertyALessThan(String value) {
            addCriterion("PROPERTY_A <", value, "propertyA");
            return (Criteria) this;
        }

        public Criteria andPropertyALessThanOrEqualTo(String value) {
            addCriterion("PROPERTY_A <=", value, "propertyA");
            return (Criteria) this;
        }

        public Criteria andPropertyALike(String value) {
            addCriterion("PROPERTY_A like", value, "propertyA");
            return (Criteria) this;
        }

        public Criteria andPropertyANotLike(String value) {
            addCriterion("PROPERTY_A not like", value, "propertyA");
            return (Criteria) this;
        }

        public Criteria andPropertyAIn(List<String> values) {
            addCriterion("PROPERTY_A in", values, "propertyA");
            return (Criteria) this;
        }

        public Criteria andPropertyANotIn(List<String> values) {
            addCriterion("PROPERTY_A not in", values, "propertyA");
            return (Criteria) this;
        }

        public Criteria andPropertyABetween(String value1, String value2) {
            addCriterion("PROPERTY_A between", value1, value2, "propertyA");
            return (Criteria) this;
        }

        public Criteria andPropertyANotBetween(String value1, String value2) {
            addCriterion("PROPERTY_A not between", value1, value2, "propertyA");
            return (Criteria) this;
        }

        public Criteria andPropertyBIsNull() {
            addCriterion("PROPERTY_B is null");
            return (Criteria) this;
        }

        public Criteria andPropertyBIsNotNull() {
            addCriterion("PROPERTY_B is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyBEqualTo(String value) {
            addCriterion("PROPERTY_B =", value, "propertyB");
            return (Criteria) this;
        }

        public Criteria andPropertyBNotEqualTo(String value) {
            addCriterion("PROPERTY_B <>", value, "propertyB");
            return (Criteria) this;
        }

        public Criteria andPropertyBGreaterThan(String value) {
            addCriterion("PROPERTY_B >", value, "propertyB");
            return (Criteria) this;
        }

        public Criteria andPropertyBGreaterThanOrEqualTo(String value) {
            addCriterion("PROPERTY_B >=", value, "propertyB");
            return (Criteria) this;
        }

        public Criteria andPropertyBLessThan(String value) {
            addCriterion("PROPERTY_B <", value, "propertyB");
            return (Criteria) this;
        }

        public Criteria andPropertyBLessThanOrEqualTo(String value) {
            addCriterion("PROPERTY_B <=", value, "propertyB");
            return (Criteria) this;
        }

        public Criteria andPropertyBLike(String value) {
            addCriterion("PROPERTY_B like", value, "propertyB");
            return (Criteria) this;
        }

        public Criteria andPropertyBNotLike(String value) {
            addCriterion("PROPERTY_B not like", value, "propertyB");
            return (Criteria) this;
        }

        public Criteria andPropertyBIn(List<String> values) {
            addCriterion("PROPERTY_B in", values, "propertyB");
            return (Criteria) this;
        }

        public Criteria andPropertyBNotIn(List<String> values) {
            addCriterion("PROPERTY_B not in", values, "propertyB");
            return (Criteria) this;
        }

        public Criteria andPropertyBBetween(String value1, String value2) {
            addCriterion("PROPERTY_B between", value1, value2, "propertyB");
            return (Criteria) this;
        }

        public Criteria andPropertyBNotBetween(String value1, String value2) {
            addCriterion("PROPERTY_B not between", value1, value2, "propertyB");
            return (Criteria) this;
        }

        public Criteria andPropertyCIsNull() {
            addCriterion("PROPERTY_C is null");
            return (Criteria) this;
        }

        public Criteria andPropertyCIsNotNull() {
            addCriterion("PROPERTY_C is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyCEqualTo(String value) {
            addCriterion("PROPERTY_C =", value, "propertyC");
            return (Criteria) this;
        }

        public Criteria andPropertyCNotEqualTo(String value) {
            addCriterion("PROPERTY_C <>", value, "propertyC");
            return (Criteria) this;
        }

        public Criteria andPropertyCGreaterThan(String value) {
            addCriterion("PROPERTY_C >", value, "propertyC");
            return (Criteria) this;
        }

        public Criteria andPropertyCGreaterThanOrEqualTo(String value) {
            addCriterion("PROPERTY_C >=", value, "propertyC");
            return (Criteria) this;
        }

        public Criteria andPropertyCLessThan(String value) {
            addCriterion("PROPERTY_C <", value, "propertyC");
            return (Criteria) this;
        }

        public Criteria andPropertyCLessThanOrEqualTo(String value) {
            addCriterion("PROPERTY_C <=", value, "propertyC");
            return (Criteria) this;
        }

        public Criteria andPropertyCLike(String value) {
            addCriterion("PROPERTY_C like", value, "propertyC");
            return (Criteria) this;
        }

        public Criteria andPropertyCNotLike(String value) {
            addCriterion("PROPERTY_C not like", value, "propertyC");
            return (Criteria) this;
        }

        public Criteria andPropertyCIn(List<String> values) {
            addCriterion("PROPERTY_C in", values, "propertyC");
            return (Criteria) this;
        }

        public Criteria andPropertyCNotIn(List<String> values) {
            addCriterion("PROPERTY_C not in", values, "propertyC");
            return (Criteria) this;
        }

        public Criteria andPropertyCBetween(String value1, String value2) {
            addCriterion("PROPERTY_C between", value1, value2, "propertyC");
            return (Criteria) this;
        }

        public Criteria andPropertyCNotBetween(String value1, String value2) {
            addCriterion("PROPERTY_C not between", value1, value2, "propertyC");
            return (Criteria) this;
        }

        public Criteria andPropertyDIsNull() {
            addCriterion("PROPERTY_D is null");
            return (Criteria) this;
        }

        public Criteria andPropertyDIsNotNull() {
            addCriterion("PROPERTY_D is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyDEqualTo(String value) {
            addCriterion("PROPERTY_D =", value, "propertyD");
            return (Criteria) this;
        }

        public Criteria andPropertyDNotEqualTo(String value) {
            addCriterion("PROPERTY_D <>", value, "propertyD");
            return (Criteria) this;
        }

        public Criteria andPropertyDGreaterThan(String value) {
            addCriterion("PROPERTY_D >", value, "propertyD");
            return (Criteria) this;
        }

        public Criteria andPropertyDGreaterThanOrEqualTo(String value) {
            addCriterion("PROPERTY_D >=", value, "propertyD");
            return (Criteria) this;
        }

        public Criteria andPropertyDLessThan(String value) {
            addCriterion("PROPERTY_D <", value, "propertyD");
            return (Criteria) this;
        }

        public Criteria andPropertyDLessThanOrEqualTo(String value) {
            addCriterion("PROPERTY_D <=", value, "propertyD");
            return (Criteria) this;
        }

        public Criteria andPropertyDLike(String value) {
            addCriterion("PROPERTY_D like", value, "propertyD");
            return (Criteria) this;
        }

        public Criteria andPropertyDNotLike(String value) {
            addCriterion("PROPERTY_D not like", value, "propertyD");
            return (Criteria) this;
        }

        public Criteria andPropertyDIn(List<String> values) {
            addCriterion("PROPERTY_D in", values, "propertyD");
            return (Criteria) this;
        }

        public Criteria andPropertyDNotIn(List<String> values) {
            addCriterion("PROPERTY_D not in", values, "propertyD");
            return (Criteria) this;
        }

        public Criteria andPropertyDBetween(String value1, String value2) {
            addCriterion("PROPERTY_D between", value1, value2, "propertyD");
            return (Criteria) this;
        }

        public Criteria andPropertyDNotBetween(String value1, String value2) {
            addCriterion("PROPERTY_D not between", value1, value2, "propertyD");
            return (Criteria) this;
        }

        public Criteria andPropertyEIsNull() {
            addCriterion("PROPERTY_E is null");
            return (Criteria) this;
        }

        public Criteria andPropertyEIsNotNull() {
            addCriterion("PROPERTY_E is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyEEqualTo(String value) {
            addCriterion("PROPERTY_E =", value, "propertyE");
            return (Criteria) this;
        }

        public Criteria andPropertyENotEqualTo(String value) {
            addCriterion("PROPERTY_E <>", value, "propertyE");
            return (Criteria) this;
        }

        public Criteria andPropertyEGreaterThan(String value) {
            addCriterion("PROPERTY_E >", value, "propertyE");
            return (Criteria) this;
        }

        public Criteria andPropertyEGreaterThanOrEqualTo(String value) {
            addCriterion("PROPERTY_E >=", value, "propertyE");
            return (Criteria) this;
        }

        public Criteria andPropertyELessThan(String value) {
            addCriterion("PROPERTY_E <", value, "propertyE");
            return (Criteria) this;
        }

        public Criteria andPropertyELessThanOrEqualTo(String value) {
            addCriterion("PROPERTY_E <=", value, "propertyE");
            return (Criteria) this;
        }

        public Criteria andPropertyELike(String value) {
            addCriterion("PROPERTY_E like", value, "propertyE");
            return (Criteria) this;
        }

        public Criteria andPropertyENotLike(String value) {
            addCriterion("PROPERTY_E not like", value, "propertyE");
            return (Criteria) this;
        }

        public Criteria andPropertyEIn(List<String> values) {
            addCriterion("PROPERTY_E in", values, "propertyE");
            return (Criteria) this;
        }

        public Criteria andPropertyENotIn(List<String> values) {
            addCriterion("PROPERTY_E not in", values, "propertyE");
            return (Criteria) this;
        }

        public Criteria andPropertyEBetween(String value1, String value2) {
            addCriterion("PROPERTY_E between", value1, value2, "propertyE");
            return (Criteria) this;
        }

        public Criteria andPropertyENotBetween(String value1, String value2) {
            addCriterion("PROPERTY_E not between", value1, value2, "propertyE");
            return (Criteria) this;
        }

        public Criteria andHasnewmsgIsNull() {
            addCriterion("HASNEWMSG is null");
            return (Criteria) this;
        }

        public Criteria andHasnewmsgIsNotNull() {
            addCriterion("HASNEWMSG is not null");
            return (Criteria) this;
        }

        public Criteria andHasnewmsgEqualTo(Short value) {
            addCriterion("HASNEWMSG =", value, "hasnewmsg");
            return (Criteria) this;
        }

        public Criteria andHasnewmsgNotEqualTo(Short value) {
            addCriterion("HASNEWMSG <>", value, "hasnewmsg");
            return (Criteria) this;
        }

        public Criteria andHasnewmsgGreaterThan(Short value) {
            addCriterion("HASNEWMSG >", value, "hasnewmsg");
            return (Criteria) this;
        }

        public Criteria andHasnewmsgGreaterThanOrEqualTo(Short value) {
            addCriterion("HASNEWMSG >=", value, "hasnewmsg");
            return (Criteria) this;
        }

        public Criteria andHasnewmsgLessThan(Short value) {
            addCriterion("HASNEWMSG <", value, "hasnewmsg");
            return (Criteria) this;
        }

        public Criteria andHasnewmsgLessThanOrEqualTo(Short value) {
            addCriterion("HASNEWMSG <=", value, "hasnewmsg");
            return (Criteria) this;
        }

        public Criteria andHasnewmsgIn(List<Short> values) {
            addCriterion("HASNEWMSG in", values, "hasnewmsg");
            return (Criteria) this;
        }

        public Criteria andHasnewmsgNotIn(List<Short> values) {
            addCriterion("HASNEWMSG not in", values, "hasnewmsg");
            return (Criteria) this;
        }

        public Criteria andHasnewmsgBetween(Short value1, Short value2) {
            addCriterion("HASNEWMSG between", value1, value2, "hasnewmsg");
            return (Criteria) this;
        }

        public Criteria andHasnewmsgNotBetween(Short value1, Short value2) {
            addCriterion("HASNEWMSG not between", value1, value2, "hasnewmsg");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIsNull() {
            addCriterion("UNIT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIsNotNull() {
            addCriterion("UNIT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUnitTypeEqualTo(Short value) {
            addCriterion("UNIT_TYPE =", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotEqualTo(Short value) {
            addCriterion("UNIT_TYPE <>", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeGreaterThan(Short value) {
            addCriterion("UNIT_TYPE >", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("UNIT_TYPE >=", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeLessThan(Short value) {
            addCriterion("UNIT_TYPE <", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeLessThanOrEqualTo(Short value) {
            addCriterion("UNIT_TYPE <=", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIn(List<Short> values) {
            addCriterion("UNIT_TYPE in", values, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotIn(List<Short> values) {
            addCriterion("UNIT_TYPE not in", values, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeBetween(Short value1, Short value2) {
            addCriterion("UNIT_TYPE between", value1, value2, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotBetween(Short value1, Short value2) {
            addCriterion("UNIT_TYPE not between", value1, value2, "unitType");
            return (Criteria) this;
        }

        public Criteria andAcceptResultIsNull() {
            addCriterion("ACCEPT_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andAcceptResultIsNotNull() {
            addCriterion("ACCEPT_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptResultEqualTo(Short value) {
            addCriterion("ACCEPT_RESULT =", value, "acceptResult");
            return (Criteria) this;
        }

        public Criteria andAcceptResultNotEqualTo(Short value) {
            addCriterion("ACCEPT_RESULT <>", value, "acceptResult");
            return (Criteria) this;
        }

        public Criteria andAcceptResultGreaterThan(Short value) {
            addCriterion("ACCEPT_RESULT >", value, "acceptResult");
            return (Criteria) this;
        }

        public Criteria andAcceptResultGreaterThanOrEqualTo(Short value) {
            addCriterion("ACCEPT_RESULT >=", value, "acceptResult");
            return (Criteria) this;
        }

        public Criteria andAcceptResultLessThan(Short value) {
            addCriterion("ACCEPT_RESULT <", value, "acceptResult");
            return (Criteria) this;
        }

        public Criteria andAcceptResultLessThanOrEqualTo(Short value) {
            addCriterion("ACCEPT_RESULT <=", value, "acceptResult");
            return (Criteria) this;
        }

        public Criteria andAcceptResultIn(List<Short> values) {
            addCriterion("ACCEPT_RESULT in", values, "acceptResult");
            return (Criteria) this;
        }

        public Criteria andAcceptResultNotIn(List<Short> values) {
            addCriterion("ACCEPT_RESULT not in", values, "acceptResult");
            return (Criteria) this;
        }

        public Criteria andAcceptResultBetween(Short value1, Short value2) {
            addCriterion("ACCEPT_RESULT between", value1, value2, "acceptResult");
            return (Criteria) this;
        }

        public Criteria andAcceptResultNotBetween(Short value1, Short value2) {
            addCriterion("ACCEPT_RESULT not between", value1, value2, "acceptResult");
            return (Criteria) this;
        }

        public Criteria andManagerorgidIsNull() {
            addCriterion("MANAGERORGID is null");
            return (Criteria) this;
        }

        public Criteria andManagerorgidIsNotNull() {
            addCriterion("MANAGERORGID is not null");
            return (Criteria) this;
        }

        public Criteria andManagerorgidEqualTo(Long value) {
            addCriterion("MANAGERORGID =", value, "managerorgid");
            return (Criteria) this;
        }

        public Criteria andManagerorgidNotEqualTo(Long value) {
            addCriterion("MANAGERORGID <>", value, "managerorgid");
            return (Criteria) this;
        }

        public Criteria andManagerorgidGreaterThan(Long value) {
            addCriterion("MANAGERORGID >", value, "managerorgid");
            return (Criteria) this;
        }

        public Criteria andManagerorgidGreaterThanOrEqualTo(Long value) {
            addCriterion("MANAGERORGID >=", value, "managerorgid");
            return (Criteria) this;
        }

        public Criteria andManagerorgidLessThan(Long value) {
            addCriterion("MANAGERORGID <", value, "managerorgid");
            return (Criteria) this;
        }

        public Criteria andManagerorgidLessThanOrEqualTo(Long value) {
            addCriterion("MANAGERORGID <=", value, "managerorgid");
            return (Criteria) this;
        }

        public Criteria andManagerorgidIn(List<Long> values) {
            addCriterion("MANAGERORGID in", values, "managerorgid");
            return (Criteria) this;
        }

        public Criteria andManagerorgidNotIn(List<Long> values) {
            addCriterion("MANAGERORGID not in", values, "managerorgid");
            return (Criteria) this;
        }

        public Criteria andManagerorgidBetween(Long value1, Long value2) {
            addCriterion("MANAGERORGID between", value1, value2, "managerorgid");
            return (Criteria) this;
        }

        public Criteria andManagerorgidNotBetween(Long value1, Long value2) {
            addCriterion("MANAGERORGID not between", value1, value2, "managerorgid");
            return (Criteria) this;
        }

        public Criteria andAuditTypeIsNull() {
            addCriterion("AUDIT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAuditTypeIsNotNull() {
            addCriterion("AUDIT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTypeEqualTo(Short value) {
            addCriterion("AUDIT_TYPE =", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotEqualTo(Short value) {
            addCriterion("AUDIT_TYPE <>", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeGreaterThan(Short value) {
            addCriterion("AUDIT_TYPE >", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("AUDIT_TYPE >=", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeLessThan(Short value) {
            addCriterion("AUDIT_TYPE <", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeLessThanOrEqualTo(Short value) {
            addCriterion("AUDIT_TYPE <=", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeIn(List<Short> values) {
            addCriterion("AUDIT_TYPE in", values, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotIn(List<Short> values) {
            addCriterion("AUDIT_TYPE not in", values, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeBetween(Short value1, Short value2) {
            addCriterion("AUDIT_TYPE between", value1, value2, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotBetween(Short value1, Short value2) {
            addCriterion("AUDIT_TYPE not between", value1, value2, "auditType");
            return (Criteria) this;
        }

        public Criteria andIsAllowEditIsNull() {
            addCriterion("IS_ALLOW_EDIT is null");
            return (Criteria) this;
        }

        public Criteria andIsAllowEditIsNotNull() {
            addCriterion("IS_ALLOW_EDIT is not null");
            return (Criteria) this;
        }

        public Criteria andIsAllowEditEqualTo(Short value) {
            addCriterion("IS_ALLOW_EDIT =", value, "isAllowEdit");
            return (Criteria) this;
        }

        public Criteria andIsAllowEditNotEqualTo(Short value) {
            addCriterion("IS_ALLOW_EDIT <>", value, "isAllowEdit");
            return (Criteria) this;
        }

        public Criteria andIsAllowEditGreaterThan(Short value) {
            addCriterion("IS_ALLOW_EDIT >", value, "isAllowEdit");
            return (Criteria) this;
        }

        public Criteria andIsAllowEditGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_ALLOW_EDIT >=", value, "isAllowEdit");
            return (Criteria) this;
        }

        public Criteria andIsAllowEditLessThan(Short value) {
            addCriterion("IS_ALLOW_EDIT <", value, "isAllowEdit");
            return (Criteria) this;
        }

        public Criteria andIsAllowEditLessThanOrEqualTo(Short value) {
            addCriterion("IS_ALLOW_EDIT <=", value, "isAllowEdit");
            return (Criteria) this;
        }

        public Criteria andIsAllowEditIn(List<Short> values) {
            addCriterion("IS_ALLOW_EDIT in", values, "isAllowEdit");
            return (Criteria) this;
        }

        public Criteria andIsAllowEditNotIn(List<Short> values) {
            addCriterion("IS_ALLOW_EDIT not in", values, "isAllowEdit");
            return (Criteria) this;
        }

        public Criteria andIsAllowEditBetween(Short value1, Short value2) {
            addCriterion("IS_ALLOW_EDIT between", value1, value2, "isAllowEdit");
            return (Criteria) this;
        }

        public Criteria andIsAllowEditNotBetween(Short value1, Short value2) {
            addCriterion("IS_ALLOW_EDIT not between", value1, value2, "isAllowEdit");
            return (Criteria) this;
        }

        public Criteria andTempIsNull() {
            addCriterion("TEMP is null");
            return (Criteria) this;
        }

        public Criteria andTempIsNotNull() {
            addCriterion("TEMP is not null");
            return (Criteria) this;
        }

        public Criteria andTempEqualTo(Long value) {
            addCriterion("TEMP =", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotEqualTo(Long value) {
            addCriterion("TEMP <>", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempGreaterThan(Long value) {
            addCriterion("TEMP >", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempGreaterThanOrEqualTo(Long value) {
            addCriterion("TEMP >=", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLessThan(Long value) {
            addCriterion("TEMP <", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLessThanOrEqualTo(Long value) {
            addCriterion("TEMP <=", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempIn(List<Long> values) {
            addCriterion("TEMP in", values, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotIn(List<Long> values) {
            addCriterion("TEMP not in", values, "temp");
            return (Criteria) this;
        }

        public Criteria andTempBetween(Long value1, Long value2) {
            addCriterion("TEMP between", value1, value2, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotBetween(Long value1, Long value2) {
            addCriterion("TEMP not between", value1, value2, "temp");
            return (Criteria) this;
        }

        public Criteria andTempAIsNull() {
            addCriterion("TEMP_A is null");
            return (Criteria) this;
        }

        public Criteria andTempAIsNotNull() {
            addCriterion("TEMP_A is not null");
            return (Criteria) this;
        }

        public Criteria andTempAEqualTo(String value) {
            addCriterion("TEMP_A =", value, "tempA");
            return (Criteria) this;
        }

        public Criteria andTempANotEqualTo(String value) {
            addCriterion("TEMP_A <>", value, "tempA");
            return (Criteria) this;
        }

        public Criteria andTempAGreaterThan(String value) {
            addCriterion("TEMP_A >", value, "tempA");
            return (Criteria) this;
        }

        public Criteria andTempAGreaterThanOrEqualTo(String value) {
            addCriterion("TEMP_A >=", value, "tempA");
            return (Criteria) this;
        }

        public Criteria andTempALessThan(String value) {
            addCriterion("TEMP_A <", value, "tempA");
            return (Criteria) this;
        }

        public Criteria andTempALessThanOrEqualTo(String value) {
            addCriterion("TEMP_A <=", value, "tempA");
            return (Criteria) this;
        }

        public Criteria andTempALike(String value) {
            addCriterion("TEMP_A like", value, "tempA");
            return (Criteria) this;
        }

        public Criteria andTempANotLike(String value) {
            addCriterion("TEMP_A not like", value, "tempA");
            return (Criteria) this;
        }

        public Criteria andTempAIn(List<String> values) {
            addCriterion("TEMP_A in", values, "tempA");
            return (Criteria) this;
        }

        public Criteria andTempANotIn(List<String> values) {
            addCriterion("TEMP_A not in", values, "tempA");
            return (Criteria) this;
        }

        public Criteria andTempABetween(String value1, String value2) {
            addCriterion("TEMP_A between", value1, value2, "tempA");
            return (Criteria) this;
        }

        public Criteria andTempANotBetween(String value1, String value2) {
            addCriterion("TEMP_A not between", value1, value2, "tempA");
            return (Criteria) this;
        }

        public Criteria andTempBIsNull() {
            addCriterion("TEMP_B is null");
            return (Criteria) this;
        }

        public Criteria andTempBIsNotNull() {
            addCriterion("TEMP_B is not null");
            return (Criteria) this;
        }

        public Criteria andTempBEqualTo(String value) {
            addCriterion("TEMP_B =", value, "tempB");
            return (Criteria) this;
        }

        public Criteria andTempBNotEqualTo(String value) {
            addCriterion("TEMP_B <>", value, "tempB");
            return (Criteria) this;
        }

        public Criteria andTempBGreaterThan(String value) {
            addCriterion("TEMP_B >", value, "tempB");
            return (Criteria) this;
        }

        public Criteria andTempBGreaterThanOrEqualTo(String value) {
            addCriterion("TEMP_B >=", value, "tempB");
            return (Criteria) this;
        }

        public Criteria andTempBLessThan(String value) {
            addCriterion("TEMP_B <", value, "tempB");
            return (Criteria) this;
        }

        public Criteria andTempBLessThanOrEqualTo(String value) {
            addCriterion("TEMP_B <=", value, "tempB");
            return (Criteria) this;
        }

        public Criteria andTempBLike(String value) {
            addCriterion("TEMP_B like", value, "tempB");
            return (Criteria) this;
        }

        public Criteria andTempBNotLike(String value) {
            addCriterion("TEMP_B not like", value, "tempB");
            return (Criteria) this;
        }

        public Criteria andTempBIn(List<String> values) {
            addCriterion("TEMP_B in", values, "tempB");
            return (Criteria) this;
        }

        public Criteria andTempBNotIn(List<String> values) {
            addCriterion("TEMP_B not in", values, "tempB");
            return (Criteria) this;
        }

        public Criteria andTempBBetween(String value1, String value2) {
            addCriterion("TEMP_B between", value1, value2, "tempB");
            return (Criteria) this;
        }

        public Criteria andTempBNotBetween(String value1, String value2) {
            addCriterion("TEMP_B not between", value1, value2, "tempB");
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