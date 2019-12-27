package com.xgb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MjzzUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MjzzUserExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andDeptIsNull() {
            addCriterion("DEPT is null");
            return (Criteria) this;
        }

        public Criteria andDeptIsNotNull() {
            addCriterion("DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andDeptEqualTo(String value) {
            addCriterion("DEPT =", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotEqualTo(String value) {
            addCriterion("DEPT <>", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThan(String value) {
            addCriterion("DEPT >", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT >=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThan(String value) {
            addCriterion("DEPT <", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThanOrEqualTo(String value) {
            addCriterion("DEPT <=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLike(String value) {
            addCriterion("DEPT like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotLike(String value) {
            addCriterion("DEPT not like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptIn(List<String> values) {
            addCriterion("DEPT in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotIn(List<String> values) {
            addCriterion("DEPT not in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptBetween(String value1, String value2) {
            addCriterion("DEPT between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotBetween(String value1, String value2) {
            addCriterion("DEPT not between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("IDCARD is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("IDCARD is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("IDCARD =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("IDCARD <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("IDCARD >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("IDCARD >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("IDCARD <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("IDCARD <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("IDCARD like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("IDCARD not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("IDCARD in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("IDCARD not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("IDCARD between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("IDCARD not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("TELEPHONE =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("TELEPHONE <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("TELEPHONE >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("TELEPHONE >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("TELEPHONE <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("TELEPHONE <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("TELEPHONE like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("TELEPHONE not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("TELEPHONE in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("TELEPHONE not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("TELEPHONE between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("TELEPHONE not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("FAX is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("FAX is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("FAX =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("FAX <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("FAX >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("FAX >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("FAX <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("FAX <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("FAX like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("FAX not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("FAX in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("FAX not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("FAX between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("FAX not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andWorkdeptIsNull() {
            addCriterion("WORKDEPT is null");
            return (Criteria) this;
        }

        public Criteria andWorkdeptIsNotNull() {
            addCriterion("WORKDEPT is not null");
            return (Criteria) this;
        }

        public Criteria andWorkdeptEqualTo(String value) {
            addCriterion("WORKDEPT =", value, "workdept");
            return (Criteria) this;
        }

        public Criteria andWorkdeptNotEqualTo(String value) {
            addCriterion("WORKDEPT <>", value, "workdept");
            return (Criteria) this;
        }

        public Criteria andWorkdeptGreaterThan(String value) {
            addCriterion("WORKDEPT >", value, "workdept");
            return (Criteria) this;
        }

        public Criteria andWorkdeptGreaterThanOrEqualTo(String value) {
            addCriterion("WORKDEPT >=", value, "workdept");
            return (Criteria) this;
        }

        public Criteria andWorkdeptLessThan(String value) {
            addCriterion("WORKDEPT <", value, "workdept");
            return (Criteria) this;
        }

        public Criteria andWorkdeptLessThanOrEqualTo(String value) {
            addCriterion("WORKDEPT <=", value, "workdept");
            return (Criteria) this;
        }

        public Criteria andWorkdeptLike(String value) {
            addCriterion("WORKDEPT like", value, "workdept");
            return (Criteria) this;
        }

        public Criteria andWorkdeptNotLike(String value) {
            addCriterion("WORKDEPT not like", value, "workdept");
            return (Criteria) this;
        }

        public Criteria andWorkdeptIn(List<String> values) {
            addCriterion("WORKDEPT in", values, "workdept");
            return (Criteria) this;
        }

        public Criteria andWorkdeptNotIn(List<String> values) {
            addCriterion("WORKDEPT not in", values, "workdept");
            return (Criteria) this;
        }

        public Criteria andWorkdeptBetween(String value1, String value2) {
            addCriterion("WORKDEPT between", value1, value2, "workdept");
            return (Criteria) this;
        }

        public Criteria andWorkdeptNotBetween(String value1, String value2) {
            addCriterion("WORKDEPT not between", value1, value2, "workdept");
            return (Criteria) this;
        }

        public Criteria andResidenceIsNull() {
            addCriterion("RESIDENCE is null");
            return (Criteria) this;
        }

        public Criteria andResidenceIsNotNull() {
            addCriterion("RESIDENCE is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceEqualTo(String value) {
            addCriterion("RESIDENCE =", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotEqualTo(String value) {
            addCriterion("RESIDENCE <>", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceGreaterThan(String value) {
            addCriterion("RESIDENCE >", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceGreaterThanOrEqualTo(String value) {
            addCriterion("RESIDENCE >=", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceLessThan(String value) {
            addCriterion("RESIDENCE <", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceLessThanOrEqualTo(String value) {
            addCriterion("RESIDENCE <=", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceLike(String value) {
            addCriterion("RESIDENCE like", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotLike(String value) {
            addCriterion("RESIDENCE not like", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceIn(List<String> values) {
            addCriterion("RESIDENCE in", values, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotIn(List<String> values) {
            addCriterion("RESIDENCE not in", values, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceBetween(String value1, String value2) {
            addCriterion("RESIDENCE between", value1, value2, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotBetween(String value1, String value2) {
            addCriterion("RESIDENCE not between", value1, value2, "residence");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("POSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("POSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("POSTCODE =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("POSTCODE <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("POSTCODE >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("POSTCODE >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("POSTCODE <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("POSTCODE <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("POSTCODE like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("POSTCODE not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("POSTCODE in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("POSTCODE not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("POSTCODE between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("POSTCODE not between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andOthercontactIsNull() {
            addCriterion("OTHERCONTACT is null");
            return (Criteria) this;
        }

        public Criteria andOthercontactIsNotNull() {
            addCriterion("OTHERCONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andOthercontactEqualTo(String value) {
            addCriterion("OTHERCONTACT =", value, "othercontact");
            return (Criteria) this;
        }

        public Criteria andOthercontactNotEqualTo(String value) {
            addCriterion("OTHERCONTACT <>", value, "othercontact");
            return (Criteria) this;
        }

        public Criteria andOthercontactGreaterThan(String value) {
            addCriterion("OTHERCONTACT >", value, "othercontact");
            return (Criteria) this;
        }

        public Criteria andOthercontactGreaterThanOrEqualTo(String value) {
            addCriterion("OTHERCONTACT >=", value, "othercontact");
            return (Criteria) this;
        }

        public Criteria andOthercontactLessThan(String value) {
            addCriterion("OTHERCONTACT <", value, "othercontact");
            return (Criteria) this;
        }

        public Criteria andOthercontactLessThanOrEqualTo(String value) {
            addCriterion("OTHERCONTACT <=", value, "othercontact");
            return (Criteria) this;
        }

        public Criteria andOthercontactLike(String value) {
            addCriterion("OTHERCONTACT like", value, "othercontact");
            return (Criteria) this;
        }

        public Criteria andOthercontactNotLike(String value) {
            addCriterion("OTHERCONTACT not like", value, "othercontact");
            return (Criteria) this;
        }

        public Criteria andOthercontactIn(List<String> values) {
            addCriterion("OTHERCONTACT in", values, "othercontact");
            return (Criteria) this;
        }

        public Criteria andOthercontactNotIn(List<String> values) {
            addCriterion("OTHERCONTACT not in", values, "othercontact");
            return (Criteria) this;
        }

        public Criteria andOthercontactBetween(String value1, String value2) {
            addCriterion("OTHERCONTACT between", value1, value2, "othercontact");
            return (Criteria) this;
        }

        public Criteria andOthercontactNotBetween(String value1, String value2) {
            addCriterion("OTHERCONTACT not between", value1, value2, "othercontact");
            return (Criteria) this;
        }

        public Criteria andRegisteredIsNull() {
            addCriterion("REGISTERED is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredIsNotNull() {
            addCriterion("REGISTERED is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredEqualTo(String value) {
            addCriterion("REGISTERED =", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredNotEqualTo(String value) {
            addCriterion("REGISTERED <>", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredGreaterThan(String value) {
            addCriterion("REGISTERED >", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTERED >=", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredLessThan(String value) {
            addCriterion("REGISTERED <", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredLessThanOrEqualTo(String value) {
            addCriterion("REGISTERED <=", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredLike(String value) {
            addCriterion("REGISTERED like", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredNotLike(String value) {
            addCriterion("REGISTERED not like", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredIn(List<String> values) {
            addCriterion("REGISTERED in", values, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredNotIn(List<String> values) {
            addCriterion("REGISTERED not in", values, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredBetween(String value1, String value2) {
            addCriterion("REGISTERED between", value1, value2, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredNotBetween(String value1, String value2) {
            addCriterion("REGISTERED not between", value1, value2, "registered");
            return (Criteria) this;
        }

        public Criteria andManagerdeptIsNull() {
            addCriterion("MANAGERDEPT is null");
            return (Criteria) this;
        }

        public Criteria andManagerdeptIsNotNull() {
            addCriterion("MANAGERDEPT is not null");
            return (Criteria) this;
        }

        public Criteria andManagerdeptEqualTo(Long value) {
            addCriterion("MANAGERDEPT =", value, "managerdept");
            return (Criteria) this;
        }

        public Criteria andManagerdeptNotEqualTo(Long value) {
            addCriterion("MANAGERDEPT <>", value, "managerdept");
            return (Criteria) this;
        }

        public Criteria andManagerdeptGreaterThan(Long value) {
            addCriterion("MANAGERDEPT >", value, "managerdept");
            return (Criteria) this;
        }

        public Criteria andManagerdeptGreaterThanOrEqualTo(Long value) {
            addCriterion("MANAGERDEPT >=", value, "managerdept");
            return (Criteria) this;
        }

        public Criteria andManagerdeptLessThan(Long value) {
            addCriterion("MANAGERDEPT <", value, "managerdept");
            return (Criteria) this;
        }

        public Criteria andManagerdeptLessThanOrEqualTo(Long value) {
            addCriterion("MANAGERDEPT <=", value, "managerdept");
            return (Criteria) this;
        }

        public Criteria andManagerdeptIn(List<Long> values) {
            addCriterion("MANAGERDEPT in", values, "managerdept");
            return (Criteria) this;
        }

        public Criteria andManagerdeptNotIn(List<Long> values) {
            addCriterion("MANAGERDEPT not in", values, "managerdept");
            return (Criteria) this;
        }

        public Criteria andManagerdeptBetween(Long value1, Long value2) {
            addCriterion("MANAGERDEPT between", value1, value2, "managerdept");
            return (Criteria) this;
        }

        public Criteria andManagerdeptNotBetween(Long value1, Long value2) {
            addCriterion("MANAGERDEPT not between", value1, value2, "managerdept");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNull() {
            addCriterion("ORGANIZATION is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNotNull() {
            addCriterion("ORGANIZATION is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationEqualTo(String value) {
            addCriterion("ORGANIZATION =", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotEqualTo(String value) {
            addCriterion("ORGANIZATION <>", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThan(String value) {
            addCriterion("ORGANIZATION >", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION >=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThan(String value) {
            addCriterion("ORGANIZATION <", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION <=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLike(String value) {
            addCriterion("ORGANIZATION like", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotLike(String value) {
            addCriterion("ORGANIZATION not like", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationIn(List<String> values) {
            addCriterion("ORGANIZATION in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotIn(List<String> values) {
            addCriterion("ORGANIZATION not in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationBetween(String value1, String value2) {
            addCriterion("ORGANIZATION between", value1, value2, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotBetween(String value1, String value2) {
            addCriterion("ORGANIZATION not between", value1, value2, "organization");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIsNull() {
            addCriterion("SERIALNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIsNotNull() {
            addCriterion("SERIALNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andSerialnumberEqualTo(String value) {
            addCriterion("SERIALNUMBER =", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberNotEqualTo(String value) {
            addCriterion("SERIALNUMBER <>", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberGreaterThan(String value) {
            addCriterion("SERIALNUMBER >", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberGreaterThanOrEqualTo(String value) {
            addCriterion("SERIALNUMBER >=", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberLessThan(String value) {
            addCriterion("SERIALNUMBER <", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberLessThanOrEqualTo(String value) {
            addCriterion("SERIALNUMBER <=", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberLike(String value) {
            addCriterion("SERIALNUMBER like", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberNotLike(String value) {
            addCriterion("SERIALNUMBER not like", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIn(List<String> values) {
            addCriterion("SERIALNUMBER in", values, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberNotIn(List<String> values) {
            addCriterion("SERIALNUMBER not in", values, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberBetween(String value1, String value2) {
            addCriterion("SERIALNUMBER between", value1, value2, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberNotBetween(String value1, String value2) {
            addCriterion("SERIALNUMBER not between", value1, value2, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andConstitutedateIsNull() {
            addCriterion("CONSTITUTEDATE is null");
            return (Criteria) this;
        }

        public Criteria andConstitutedateIsNotNull() {
            addCriterion("CONSTITUTEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andConstitutedateEqualTo(Date value) {
            addCriterion("CONSTITUTEDATE =", value, "constitutedate");
            return (Criteria) this;
        }

        public Criteria andConstitutedateNotEqualTo(Date value) {
            addCriterion("CONSTITUTEDATE <>", value, "constitutedate");
            return (Criteria) this;
        }

        public Criteria andConstitutedateGreaterThan(Date value) {
            addCriterion("CONSTITUTEDATE >", value, "constitutedate");
            return (Criteria) this;
        }

        public Criteria andConstitutedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CONSTITUTEDATE >=", value, "constitutedate");
            return (Criteria) this;
        }

        public Criteria andConstitutedateLessThan(Date value) {
            addCriterion("CONSTITUTEDATE <", value, "constitutedate");
            return (Criteria) this;
        }

        public Criteria andConstitutedateLessThanOrEqualTo(Date value) {
            addCriterion("CONSTITUTEDATE <=", value, "constitutedate");
            return (Criteria) this;
        }

        public Criteria andConstitutedateIn(List<Date> values) {
            addCriterion("CONSTITUTEDATE in", values, "constitutedate");
            return (Criteria) this;
        }

        public Criteria andConstitutedateNotIn(List<Date> values) {
            addCriterion("CONSTITUTEDATE not in", values, "constitutedate");
            return (Criteria) this;
        }

        public Criteria andConstitutedateBetween(Date value1, Date value2) {
            addCriterion("CONSTITUTEDATE between", value1, value2, "constitutedate");
            return (Criteria) this;
        }

        public Criteria andConstitutedateNotBetween(Date value1, Date value2) {
            addCriterion("CONSTITUTEDATE not between", value1, value2, "constitutedate");
            return (Criteria) this;
        }

        public Criteria andCorporationIsNull() {
            addCriterion("CORPORATION is null");
            return (Criteria) this;
        }

        public Criteria andCorporationIsNotNull() {
            addCriterion("CORPORATION is not null");
            return (Criteria) this;
        }

        public Criteria andCorporationEqualTo(String value) {
            addCriterion("CORPORATION =", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationNotEqualTo(String value) {
            addCriterion("CORPORATION <>", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationGreaterThan(String value) {
            addCriterion("CORPORATION >", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationGreaterThanOrEqualTo(String value) {
            addCriterion("CORPORATION >=", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationLessThan(String value) {
            addCriterion("CORPORATION <", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationLessThanOrEqualTo(String value) {
            addCriterion("CORPORATION <=", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationLike(String value) {
            addCriterion("CORPORATION like", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationNotLike(String value) {
            addCriterion("CORPORATION not like", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationIn(List<String> values) {
            addCriterion("CORPORATION in", values, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationNotIn(List<String> values) {
            addCriterion("CORPORATION not in", values, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationBetween(String value1, String value2) {
            addCriterion("CORPORATION between", value1, value2, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationNotBetween(String value1, String value2) {
            addCriterion("CORPORATION not between", value1, value2, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorptelephoneIsNull() {
            addCriterion("CORPTELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andCorptelephoneIsNotNull() {
            addCriterion("CORPTELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCorptelephoneEqualTo(String value) {
            addCriterion("CORPTELEPHONE =", value, "corptelephone");
            return (Criteria) this;
        }

        public Criteria andCorptelephoneNotEqualTo(String value) {
            addCriterion("CORPTELEPHONE <>", value, "corptelephone");
            return (Criteria) this;
        }

        public Criteria andCorptelephoneGreaterThan(String value) {
            addCriterion("CORPTELEPHONE >", value, "corptelephone");
            return (Criteria) this;
        }

        public Criteria andCorptelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("CORPTELEPHONE >=", value, "corptelephone");
            return (Criteria) this;
        }

        public Criteria andCorptelephoneLessThan(String value) {
            addCriterion("CORPTELEPHONE <", value, "corptelephone");
            return (Criteria) this;
        }

        public Criteria andCorptelephoneLessThanOrEqualTo(String value) {
            addCriterion("CORPTELEPHONE <=", value, "corptelephone");
            return (Criteria) this;
        }

        public Criteria andCorptelephoneLike(String value) {
            addCriterion("CORPTELEPHONE like", value, "corptelephone");
            return (Criteria) this;
        }

        public Criteria andCorptelephoneNotLike(String value) {
            addCriterion("CORPTELEPHONE not like", value, "corptelephone");
            return (Criteria) this;
        }

        public Criteria andCorptelephoneIn(List<String> values) {
            addCriterion("CORPTELEPHONE in", values, "corptelephone");
            return (Criteria) this;
        }

        public Criteria andCorptelephoneNotIn(List<String> values) {
            addCriterion("CORPTELEPHONE not in", values, "corptelephone");
            return (Criteria) this;
        }

        public Criteria andCorptelephoneBetween(String value1, String value2) {
            addCriterion("CORPTELEPHONE between", value1, value2, "corptelephone");
            return (Criteria) this;
        }

        public Criteria andCorptelephoneNotBetween(String value1, String value2) {
            addCriterion("CORPTELEPHONE not between", value1, value2, "corptelephone");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Short value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Short value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Short value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Short value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Short value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Short> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Short> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Short value1, Short value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Short value1, Short value2) {
            addCriterion("TYPE not between", value1, value2, "type");
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

        public Criteria andTypedeptidIsNull() {
            addCriterion("TYPEDEPTID is null");
            return (Criteria) this;
        }

        public Criteria andTypedeptidIsNotNull() {
            addCriterion("TYPEDEPTID is not null");
            return (Criteria) this;
        }

        public Criteria andTypedeptidEqualTo(Long value) {
            addCriterion("TYPEDEPTID =", value, "typedeptid");
            return (Criteria) this;
        }

        public Criteria andTypedeptidNotEqualTo(Long value) {
            addCriterion("TYPEDEPTID <>", value, "typedeptid");
            return (Criteria) this;
        }

        public Criteria andTypedeptidGreaterThan(Long value) {
            addCriterion("TYPEDEPTID >", value, "typedeptid");
            return (Criteria) this;
        }

        public Criteria andTypedeptidGreaterThanOrEqualTo(Long value) {
            addCriterion("TYPEDEPTID >=", value, "typedeptid");
            return (Criteria) this;
        }

        public Criteria andTypedeptidLessThan(Long value) {
            addCriterion("TYPEDEPTID <", value, "typedeptid");
            return (Criteria) this;
        }

        public Criteria andTypedeptidLessThanOrEqualTo(Long value) {
            addCriterion("TYPEDEPTID <=", value, "typedeptid");
            return (Criteria) this;
        }

        public Criteria andTypedeptidIn(List<Long> values) {
            addCriterion("TYPEDEPTID in", values, "typedeptid");
            return (Criteria) this;
        }

        public Criteria andTypedeptidNotIn(List<Long> values) {
            addCriterion("TYPEDEPTID not in", values, "typedeptid");
            return (Criteria) this;
        }

        public Criteria andTypedeptidBetween(Long value1, Long value2) {
            addCriterion("TYPEDEPTID between", value1, value2, "typedeptid");
            return (Criteria) this;
        }

        public Criteria andTypedeptidNotBetween(Long value1, Long value2) {
            addCriterion("TYPEDEPTID not between", value1, value2, "typedeptid");
            return (Criteria) this;
        }

        public Criteria andManageorgIsNull() {
            addCriterion("MANAGEORG is null");
            return (Criteria) this;
        }

        public Criteria andManageorgIsNotNull() {
            addCriterion("MANAGEORG is not null");
            return (Criteria) this;
        }

        public Criteria andManageorgEqualTo(Long value) {
            addCriterion("MANAGEORG =", value, "manageorg");
            return (Criteria) this;
        }

        public Criteria andManageorgNotEqualTo(Long value) {
            addCriterion("MANAGEORG <>", value, "manageorg");
            return (Criteria) this;
        }

        public Criteria andManageorgGreaterThan(Long value) {
            addCriterion("MANAGEORG >", value, "manageorg");
            return (Criteria) this;
        }

        public Criteria andManageorgGreaterThanOrEqualTo(Long value) {
            addCriterion("MANAGEORG >=", value, "manageorg");
            return (Criteria) this;
        }

        public Criteria andManageorgLessThan(Long value) {
            addCriterion("MANAGEORG <", value, "manageorg");
            return (Criteria) this;
        }

        public Criteria andManageorgLessThanOrEqualTo(Long value) {
            addCriterion("MANAGEORG <=", value, "manageorg");
            return (Criteria) this;
        }

        public Criteria andManageorgIn(List<Long> values) {
            addCriterion("MANAGEORG in", values, "manageorg");
            return (Criteria) this;
        }

        public Criteria andManageorgNotIn(List<Long> values) {
            addCriterion("MANAGEORG not in", values, "manageorg");
            return (Criteria) this;
        }

        public Criteria andManageorgBetween(Long value1, Long value2) {
            addCriterion("MANAGEORG between", value1, value2, "manageorg");
            return (Criteria) this;
        }

        public Criteria andManageorgNotBetween(Long value1, Long value2) {
            addCriterion("MANAGEORG not between", value1, value2, "manageorg");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNull() {
            addCriterion("ORGANIZATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNotNull() {
            addCriterion("ORGANIZATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdEqualTo(String value) {
            addCriterion("ORGANIZATION_ID =", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotEqualTo(String value) {
            addCriterion("ORGANIZATION_ID <>", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThan(String value) {
            addCriterion("ORGANIZATION_ID >", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_ID >=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThan(String value) {
            addCriterion("ORGANIZATION_ID <", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_ID <=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLike(String value) {
            addCriterion("ORGANIZATION_ID like", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotLike(String value) {
            addCriterion("ORGANIZATION_ID not like", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIn(List<String> values) {
            addCriterion("ORGANIZATION_ID in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotIn(List<String> values) {
            addCriterion("ORGANIZATION_ID not in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_ID between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_ID not between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andMfTypeIsNull() {
            addCriterion("MF_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMfTypeIsNotNull() {
            addCriterion("MF_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMfTypeEqualTo(Short value) {
            addCriterion("MF_TYPE =", value, "mfType");
            return (Criteria) this;
        }

        public Criteria andMfTypeNotEqualTo(Short value) {
            addCriterion("MF_TYPE <>", value, "mfType");
            return (Criteria) this;
        }

        public Criteria andMfTypeGreaterThan(Short value) {
            addCriterion("MF_TYPE >", value, "mfType");
            return (Criteria) this;
        }

        public Criteria andMfTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("MF_TYPE >=", value, "mfType");
            return (Criteria) this;
        }

        public Criteria andMfTypeLessThan(Short value) {
            addCriterion("MF_TYPE <", value, "mfType");
            return (Criteria) this;
        }

        public Criteria andMfTypeLessThanOrEqualTo(Short value) {
            addCriterion("MF_TYPE <=", value, "mfType");
            return (Criteria) this;
        }

        public Criteria andMfTypeIn(List<Short> values) {
            addCriterion("MF_TYPE in", values, "mfType");
            return (Criteria) this;
        }

        public Criteria andMfTypeNotIn(List<Short> values) {
            addCriterion("MF_TYPE not in", values, "mfType");
            return (Criteria) this;
        }

        public Criteria andMfTypeBetween(Short value1, Short value2) {
            addCriterion("MF_TYPE between", value1, value2, "mfType");
            return (Criteria) this;
        }

        public Criteria andMfTypeNotBetween(Short value1, Short value2) {
            addCriterion("MF_TYPE not between", value1, value2, "mfType");
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

        public Criteria andRegistedateIsNull() {
            addCriterion("REGISTEDATE is null");
            return (Criteria) this;
        }

        public Criteria andRegistedateIsNotNull() {
            addCriterion("REGISTEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRegistedateEqualTo(Date value) {
            addCriterion("REGISTEDATE =", value, "registedate");
            return (Criteria) this;
        }

        public Criteria andRegistedateNotEqualTo(Date value) {
            addCriterion("REGISTEDATE <>", value, "registedate");
            return (Criteria) this;
        }

        public Criteria andRegistedateGreaterThan(Date value) {
            addCriterion("REGISTEDATE >", value, "registedate");
            return (Criteria) this;
        }

        public Criteria andRegistedateGreaterThanOrEqualTo(Date value) {
            addCriterion("REGISTEDATE >=", value, "registedate");
            return (Criteria) this;
        }

        public Criteria andRegistedateLessThan(Date value) {
            addCriterion("REGISTEDATE <", value, "registedate");
            return (Criteria) this;
        }

        public Criteria andRegistedateLessThanOrEqualTo(Date value) {
            addCriterion("REGISTEDATE <=", value, "registedate");
            return (Criteria) this;
        }

        public Criteria andRegistedateIn(List<Date> values) {
            addCriterion("REGISTEDATE in", values, "registedate");
            return (Criteria) this;
        }

        public Criteria andRegistedateNotIn(List<Date> values) {
            addCriterion("REGISTEDATE not in", values, "registedate");
            return (Criteria) this;
        }

        public Criteria andRegistedateBetween(Date value1, Date value2) {
            addCriterion("REGISTEDATE between", value1, value2, "registedate");
            return (Criteria) this;
        }

        public Criteria andRegistedateNotBetween(Date value1, Date value2) {
            addCriterion("REGISTEDATE not between", value1, value2, "registedate");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("AREA is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("AREA is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Short value) {
            addCriterion("AREA =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Short value) {
            addCriterion("AREA <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Short value) {
            addCriterion("AREA >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Short value) {
            addCriterion("AREA >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Short value) {
            addCriterion("AREA <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Short value) {
            addCriterion("AREA <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Short> values) {
            addCriterion("AREA in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Short> values) {
            addCriterion("AREA not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Short value1, Short value2) {
            addCriterion("AREA between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Short value1, Short value2) {
            addCriterion("AREA not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNull() {
            addCriterion("USERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNotNull() {
            addCriterion("USERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeEqualTo(Short value) {
            addCriterion("USERTYPE =", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotEqualTo(Short value) {
            addCriterion("USERTYPE <>", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThan(Short value) {
            addCriterion("USERTYPE >", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThanOrEqualTo(Short value) {
            addCriterion("USERTYPE >=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThan(Short value) {
            addCriterion("USERTYPE <", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThanOrEqualTo(Short value) {
            addCriterion("USERTYPE <=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeIn(List<Short> values) {
            addCriterion("USERTYPE in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotIn(List<Short> values) {
            addCriterion("USERTYPE not in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeBetween(Short value1, Short value2) {
            addCriterion("USERTYPE between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotBetween(Short value1, Short value2) {
            addCriterion("USERTYPE not between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andOrgIdentityIsNull() {
            addCriterion("ORG_IDENTITY is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdentityIsNotNull() {
            addCriterion("ORG_IDENTITY is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdentityEqualTo(String value) {
            addCriterion("ORG_IDENTITY =", value, "orgIdentity");
            return (Criteria) this;
        }

        public Criteria andOrgIdentityNotEqualTo(String value) {
            addCriterion("ORG_IDENTITY <>", value, "orgIdentity");
            return (Criteria) this;
        }

        public Criteria andOrgIdentityGreaterThan(String value) {
            addCriterion("ORG_IDENTITY >", value, "orgIdentity");
            return (Criteria) this;
        }

        public Criteria andOrgIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_IDENTITY >=", value, "orgIdentity");
            return (Criteria) this;
        }

        public Criteria andOrgIdentityLessThan(String value) {
            addCriterion("ORG_IDENTITY <", value, "orgIdentity");
            return (Criteria) this;
        }

        public Criteria andOrgIdentityLessThanOrEqualTo(String value) {
            addCriterion("ORG_IDENTITY <=", value, "orgIdentity");
            return (Criteria) this;
        }

        public Criteria andOrgIdentityLike(String value) {
            addCriterion("ORG_IDENTITY like", value, "orgIdentity");
            return (Criteria) this;
        }

        public Criteria andOrgIdentityNotLike(String value) {
            addCriterion("ORG_IDENTITY not like", value, "orgIdentity");
            return (Criteria) this;
        }

        public Criteria andOrgIdentityIn(List<String> values) {
            addCriterion("ORG_IDENTITY in", values, "orgIdentity");
            return (Criteria) this;
        }

        public Criteria andOrgIdentityNotIn(List<String> values) {
            addCriterion("ORG_IDENTITY not in", values, "orgIdentity");
            return (Criteria) this;
        }

        public Criteria andOrgIdentityBetween(String value1, String value2) {
            addCriterion("ORG_IDENTITY between", value1, value2, "orgIdentity");
            return (Criteria) this;
        }

        public Criteria andOrgIdentityNotBetween(String value1, String value2) {
            addCriterion("ORG_IDENTITY not between", value1, value2, "orgIdentity");
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

        public Criteria andUnitTypeEqualTo(String value) {
            addCriterion("UNIT_TYPE =", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotEqualTo(String value) {
            addCriterion("UNIT_TYPE <>", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeGreaterThan(String value) {
            addCriterion("UNIT_TYPE >", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT_TYPE >=", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeLessThan(String value) {
            addCriterion("UNIT_TYPE <", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeLessThanOrEqualTo(String value) {
            addCriterion("UNIT_TYPE <=", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeLike(String value) {
            addCriterion("UNIT_TYPE like", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotLike(String value) {
            addCriterion("UNIT_TYPE not like", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIn(List<String> values) {
            addCriterion("UNIT_TYPE in", values, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotIn(List<String> values) {
            addCriterion("UNIT_TYPE not in", values, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeBetween(String value1, String value2) {
            addCriterion("UNIT_TYPE between", value1, value2, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotBetween(String value1, String value2) {
            addCriterion("UNIT_TYPE not between", value1, value2, "unitType");
            return (Criteria) this;
        }

        public Criteria andLastLogginginTimeIsNull() {
            addCriterion("LAST_LOGGINGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastLogginginTimeIsNotNull() {
            addCriterion("LAST_LOGGINGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastLogginginTimeEqualTo(Date value) {
            addCriterion("LAST_LOGGINGIN_TIME =", value, "lastLogginginTime");
            return (Criteria) this;
        }

        public Criteria andLastLogginginTimeNotEqualTo(Date value) {
            addCriterion("LAST_LOGGINGIN_TIME <>", value, "lastLogginginTime");
            return (Criteria) this;
        }

        public Criteria andLastLogginginTimeGreaterThan(Date value) {
            addCriterion("LAST_LOGGINGIN_TIME >", value, "lastLogginginTime");
            return (Criteria) this;
        }

        public Criteria andLastLogginginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_LOGGINGIN_TIME >=", value, "lastLogginginTime");
            return (Criteria) this;
        }

        public Criteria andLastLogginginTimeLessThan(Date value) {
            addCriterion("LAST_LOGGINGIN_TIME <", value, "lastLogginginTime");
            return (Criteria) this;
        }

        public Criteria andLastLogginginTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_LOGGINGIN_TIME <=", value, "lastLogginginTime");
            return (Criteria) this;
        }

        public Criteria andLastLogginginTimeIn(List<Date> values) {
            addCriterion("LAST_LOGGINGIN_TIME in", values, "lastLogginginTime");
            return (Criteria) this;
        }

        public Criteria andLastLogginginTimeNotIn(List<Date> values) {
            addCriterion("LAST_LOGGINGIN_TIME not in", values, "lastLogginginTime");
            return (Criteria) this;
        }

        public Criteria andLastLogginginTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_LOGGINGIN_TIME between", value1, value2, "lastLogginginTime");
            return (Criteria) this;
        }

        public Criteria andLastLogginginTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_LOGGINGIN_TIME not between", value1, value2, "lastLogginginTime");
            return (Criteria) this;
        }

        public Criteria andLogginginCountIsNull() {
            addCriterion("LOGGINGIN_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andLogginginCountIsNotNull() {
            addCriterion("LOGGINGIN_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLogginginCountEqualTo(Long value) {
            addCriterion("LOGGINGIN_COUNT =", value, "logginginCount");
            return (Criteria) this;
        }

        public Criteria andLogginginCountNotEqualTo(Long value) {
            addCriterion("LOGGINGIN_COUNT <>", value, "logginginCount");
            return (Criteria) this;
        }

        public Criteria andLogginginCountGreaterThan(Long value) {
            addCriterion("LOGGINGIN_COUNT >", value, "logginginCount");
            return (Criteria) this;
        }

        public Criteria andLogginginCountGreaterThanOrEqualTo(Long value) {
            addCriterion("LOGGINGIN_COUNT >=", value, "logginginCount");
            return (Criteria) this;
        }

        public Criteria andLogginginCountLessThan(Long value) {
            addCriterion("LOGGINGIN_COUNT <", value, "logginginCount");
            return (Criteria) this;
        }

        public Criteria andLogginginCountLessThanOrEqualTo(Long value) {
            addCriterion("LOGGINGIN_COUNT <=", value, "logginginCount");
            return (Criteria) this;
        }

        public Criteria andLogginginCountIn(List<Long> values) {
            addCriterion("LOGGINGIN_COUNT in", values, "logginginCount");
            return (Criteria) this;
        }

        public Criteria andLogginginCountNotIn(List<Long> values) {
            addCriterion("LOGGINGIN_COUNT not in", values, "logginginCount");
            return (Criteria) this;
        }

        public Criteria andLogginginCountBetween(Long value1, Long value2) {
            addCriterion("LOGGINGIN_COUNT between", value1, value2, "logginginCount");
            return (Criteria) this;
        }

        public Criteria andLogginginCountNotBetween(Long value1, Long value2) {
            addCriterion("LOGGINGIN_COUNT not between", value1, value2, "logginginCount");
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

        public Criteria andTempEqualTo(String value) {
            addCriterion("TEMP =", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotEqualTo(String value) {
            addCriterion("TEMP <>", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempGreaterThan(String value) {
            addCriterion("TEMP >", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempGreaterThanOrEqualTo(String value) {
            addCriterion("TEMP >=", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLessThan(String value) {
            addCriterion("TEMP <", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLessThanOrEqualTo(String value) {
            addCriterion("TEMP <=", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLike(String value) {
            addCriterion("TEMP like", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotLike(String value) {
            addCriterion("TEMP not like", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempIn(List<String> values) {
            addCriterion("TEMP in", values, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotIn(List<String> values) {
            addCriterion("TEMP not in", values, "temp");
            return (Criteria) this;
        }

        public Criteria andTempBetween(String value1, String value2) {
            addCriterion("TEMP between", value1, value2, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotBetween(String value1, String value2) {
            addCriterion("TEMP not between", value1, value2, "temp");
            return (Criteria) this;
        }

        public Criteria andXinyongdaimaIsNull() {
            addCriterion("XINYONGDAIMA is null");
            return (Criteria) this;
        }

        public Criteria andXinyongdaimaIsNotNull() {
            addCriterion("XINYONGDAIMA is not null");
            return (Criteria) this;
        }

        public Criteria andXinyongdaimaEqualTo(String value) {
            addCriterion("XINYONGDAIMA =", value, "xinyongdaima");
            return (Criteria) this;
        }

        public Criteria andXinyongdaimaNotEqualTo(String value) {
            addCriterion("XINYONGDAIMA <>", value, "xinyongdaima");
            return (Criteria) this;
        }

        public Criteria andXinyongdaimaGreaterThan(String value) {
            addCriterion("XINYONGDAIMA >", value, "xinyongdaima");
            return (Criteria) this;
        }

        public Criteria andXinyongdaimaGreaterThanOrEqualTo(String value) {
            addCriterion("XINYONGDAIMA >=", value, "xinyongdaima");
            return (Criteria) this;
        }

        public Criteria andXinyongdaimaLessThan(String value) {
            addCriterion("XINYONGDAIMA <", value, "xinyongdaima");
            return (Criteria) this;
        }

        public Criteria andXinyongdaimaLessThanOrEqualTo(String value) {
            addCriterion("XINYONGDAIMA <=", value, "xinyongdaima");
            return (Criteria) this;
        }

        public Criteria andXinyongdaimaLike(String value) {
            addCriterion("XINYONGDAIMA like", value, "xinyongdaima");
            return (Criteria) this;
        }

        public Criteria andXinyongdaimaNotLike(String value) {
            addCriterion("XINYONGDAIMA not like", value, "xinyongdaima");
            return (Criteria) this;
        }

        public Criteria andXinyongdaimaIn(List<String> values) {
            addCriterion("XINYONGDAIMA in", values, "xinyongdaima");
            return (Criteria) this;
        }

        public Criteria andXinyongdaimaNotIn(List<String> values) {
            addCriterion("XINYONGDAIMA not in", values, "xinyongdaima");
            return (Criteria) this;
        }

        public Criteria andXinyongdaimaBetween(String value1, String value2) {
            addCriterion("XINYONGDAIMA between", value1, value2, "xinyongdaima");
            return (Criteria) this;
        }

        public Criteria andXinyongdaimaNotBetween(String value1, String value2) {
            addCriterion("XINYONGDAIMA not between", value1, value2, "xinyongdaima");
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