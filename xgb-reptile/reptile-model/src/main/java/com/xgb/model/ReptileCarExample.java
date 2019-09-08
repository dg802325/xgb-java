package com.xgb.model;

import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
/**
* @Auther: Mr Deng
* @Date: 2019-09-08 00:29:04
* @Description:
*/
public class ReptileCarExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReptileCarExample() {
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

                public Criteria andIdIsNull(){
            addCriterion("ID is null");
            return (Criteria)this;
        }

        public Criteria andIdIsNotNull(){
            addCriterion("ID is not null");
            return (Criteria)this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria)this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria)this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andTitleIsNull(){
            addCriterion("TITLE is null");
            return (Criteria)this;
        }

        public Criteria andTitleIsNotNull(){
            addCriterion("TITLE is not null");
            return (Criteria)this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "id");
            return (Criteria)this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "id");
            return (Criteria)this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "id");
            return (Criteria)this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "id");
            return (Criteria)this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "id");
            return (Criteria)this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "id");
            return (Criteria)this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "id");
            return (Criteria)this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "id");
            return (Criteria)this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "id");
            return (Criteria)this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "id");
            return (Criteria)this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andCarSpeedIsNull(){
            addCriterion("CAR_SPEED is null");
            return (Criteria)this;
        }

        public Criteria andCarSpeedIsNotNull(){
            addCriterion("CAR_SPEED is not null");
            return (Criteria)this;
        }

        public Criteria andCarSpeedEqualTo(String value) {
            addCriterion("CAR_SPEED =", value, "id");
            return (Criteria)this;
        }

        public Criteria andCarSpeedNotEqualTo(String value) {
            addCriterion("CAR_SPEED <>", value, "id");
            return (Criteria)this;
        }

        public Criteria andCarSpeedGreaterThan(String value) {
            addCriterion("CAR_SPEED >", value, "id");
            return (Criteria)this;
        }

        public Criteria andCarSpeedGreaterThanOrEqualTo(String value) {
            addCriterion("CAR_SPEED >=", value, "id");
            return (Criteria)this;
        }

        public Criteria andCarSpeedLessThan(String value) {
            addCriterion("CAR_SPEED <", value, "id");
            return (Criteria)this;
        }

        public Criteria andCarSpeedLessThanOrEqualTo(String value) {
            addCriterion("CAR_SPEED <=", value, "id");
            return (Criteria)this;
        }

        public Criteria andCarSpeedLike(String value) {
            addCriterion("CAR_SPEED like", value, "id");
            return (Criteria)this;
        }

        public Criteria andCarSpeedNotLike(String value) {
            addCriterion("CAR_SPEED not like", value, "id");
            return (Criteria)this;
        }

        public Criteria andCarSpeedIn(List<String> values) {
            addCriterion("CAR_SPEED in", values, "id");
            return (Criteria)this;
        }

        public Criteria andCarSpeedNotIn(List<String> values) {
            addCriterion("CAR_SPEED not in", values, "id");
            return (Criteria)this;
        }

        public Criteria andCarSpeedBetween(String value1, String value2) {
            addCriterion("CAR_SPEED between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andCarSpeedNotBetween(String value1, String value2) {
            addCriterion("CAR_SPEED not between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andCarBrakeIsNull(){
            addCriterion("CAR_BRAKE is null");
            return (Criteria)this;
        }

        public Criteria andCarBrakeIsNotNull(){
            addCriterion("CAR_BRAKE is not null");
            return (Criteria)this;
        }

        public Criteria andCarBrakeEqualTo(String value) {
            addCriterion("CAR_BRAKE =", value, "id");
            return (Criteria)this;
        }

        public Criteria andCarBrakeNotEqualTo(String value) {
            addCriterion("CAR_BRAKE <>", value, "id");
            return (Criteria)this;
        }

        public Criteria andCarBrakeGreaterThan(String value) {
            addCriterion("CAR_BRAKE >", value, "id");
            return (Criteria)this;
        }

        public Criteria andCarBrakeGreaterThanOrEqualTo(String value) {
            addCriterion("CAR_BRAKE >=", value, "id");
            return (Criteria)this;
        }

        public Criteria andCarBrakeLessThan(String value) {
            addCriterion("CAR_BRAKE <", value, "id");
            return (Criteria)this;
        }

        public Criteria andCarBrakeLessThanOrEqualTo(String value) {
            addCriterion("CAR_BRAKE <=", value, "id");
            return (Criteria)this;
        }

        public Criteria andCarBrakeLike(String value) {
            addCriterion("CAR_BRAKE like", value, "id");
            return (Criteria)this;
        }

        public Criteria andCarBrakeNotLike(String value) {
            addCriterion("CAR_BRAKE not like", value, "id");
            return (Criteria)this;
        }

        public Criteria andCarBrakeIn(List<String> values) {
            addCriterion("CAR_BRAKE in", values, "id");
            return (Criteria)this;
        }

        public Criteria andCarBrakeNotIn(List<String> values) {
            addCriterion("CAR_BRAKE not in", values, "id");
            return (Criteria)this;
        }

        public Criteria andCarBrakeBetween(String value1, String value2) {
            addCriterion("CAR_BRAKE between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andCarBrakeNotBetween(String value1, String value2) {
            addCriterion("CAR_BRAKE not between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andCarOilIsNull(){
            addCriterion("CAR_OIL is null");
            return (Criteria)this;
        }

        public Criteria andCarOilIsNotNull(){
            addCriterion("CAR_OIL is not null");
            return (Criteria)this;
        }

        public Criteria andCarOilEqualTo(String value) {
            addCriterion("CAR_OIL =", value, "id");
            return (Criteria)this;
        }

        public Criteria andCarOilNotEqualTo(String value) {
            addCriterion("CAR_OIL <>", value, "id");
            return (Criteria)this;
        }

        public Criteria andCarOilGreaterThan(String value) {
            addCriterion("CAR_OIL >", value, "id");
            return (Criteria)this;
        }

        public Criteria andCarOilGreaterThanOrEqualTo(String value) {
            addCriterion("CAR_OIL >=", value, "id");
            return (Criteria)this;
        }

        public Criteria andCarOilLessThan(String value) {
            addCriterion("CAR_OIL <", value, "id");
            return (Criteria)this;
        }

        public Criteria andCarOilLessThanOrEqualTo(String value) {
            addCriterion("CAR_OIL <=", value, "id");
            return (Criteria)this;
        }

        public Criteria andCarOilLike(String value) {
            addCriterion("CAR_OIL like", value, "id");
            return (Criteria)this;
        }

        public Criteria andCarOilNotLike(String value) {
            addCriterion("CAR_OIL not like", value, "id");
            return (Criteria)this;
        }

        public Criteria andCarOilIn(List<String> values) {
            addCriterion("CAR_OIL in", values, "id");
            return (Criteria)this;
        }

        public Criteria andCarOilNotIn(List<String> values) {
            addCriterion("CAR_OIL not in", values, "id");
            return (Criteria)this;
        }

        public Criteria andCarOilBetween(String value1, String value2) {
            addCriterion("CAR_OIL between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andCarOilNotBetween(String value1, String value2) {
            addCriterion("CAR_OIL not between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andEditorName1IsNull(){
            addCriterion("EDITOR_NAME1 is null");
            return (Criteria)this;
        }

        public Criteria andEditorName1IsNotNull(){
            addCriterion("EDITOR_NAME1 is not null");
            return (Criteria)this;
        }

        public Criteria andEditorName1EqualTo(String value) {
            addCriterion("EDITOR_NAME1 =", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorName1NotEqualTo(String value) {
            addCriterion("EDITOR_NAME1 <>", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorName1GreaterThan(String value) {
            addCriterion("EDITOR_NAME1 >", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorName1GreaterThanOrEqualTo(String value) {
            addCriterion("EDITOR_NAME1 >=", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorName1LessThan(String value) {
            addCriterion("EDITOR_NAME1 <", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorName1LessThanOrEqualTo(String value) {
            addCriterion("EDITOR_NAME1 <=", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorName1Like(String value) {
            addCriterion("EDITOR_NAME1 like", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorName1NotLike(String value) {
            addCriterion("EDITOR_NAME1 not like", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorName1In(List<String> values) {
            addCriterion("EDITOR_NAME1 in", values, "id");
            return (Criteria)this;
        }

        public Criteria andEditorName1NotIn(List<String> values) {
            addCriterion("EDITOR_NAME1 not in", values, "id");
            return (Criteria)this;
        }

        public Criteria andEditorName1Between(String value1, String value2) {
            addCriterion("EDITOR_NAME1 between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andEditorName1NotBetween(String value1, String value2) {
            addCriterion("EDITOR_NAME1 not between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark1IsNull(){
            addCriterion("EDITOR_REMARK1 is null");
            return (Criteria)this;
        }

        public Criteria andEditorRemark1IsNotNull(){
            addCriterion("EDITOR_REMARK1 is not null");
            return (Criteria)this;
        }

        public Criteria andEditorRemark1EqualTo(String value) {
            addCriterion("EDITOR_REMARK1 =", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark1NotEqualTo(String value) {
            addCriterion("EDITOR_REMARK1 <>", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark1GreaterThan(String value) {
            addCriterion("EDITOR_REMARK1 >", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("EDITOR_REMARK1 >=", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark1LessThan(String value) {
            addCriterion("EDITOR_REMARK1 <", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark1LessThanOrEqualTo(String value) {
            addCriterion("EDITOR_REMARK1 <=", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark1Like(String value) {
            addCriterion("EDITOR_REMARK1 like", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark1NotLike(String value) {
            addCriterion("EDITOR_REMARK1 not like", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark1In(List<String> values) {
            addCriterion("EDITOR_REMARK1 in", values, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark1NotIn(List<String> values) {
            addCriterion("EDITOR_REMARK1 not in", values, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark1Between(String value1, String value2) {
            addCriterion("EDITOR_REMARK1 between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark1NotBetween(String value1, String value2) {
            addCriterion("EDITOR_REMARK1 not between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andEditorName2IsNull(){
            addCriterion("EDITOR_NAME2 is null");
            return (Criteria)this;
        }

        public Criteria andEditorName2IsNotNull(){
            addCriterion("EDITOR_NAME2 is not null");
            return (Criteria)this;
        }

        public Criteria andEditorName2EqualTo(String value) {
            addCriterion("EDITOR_NAME2 =", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorName2NotEqualTo(String value) {
            addCriterion("EDITOR_NAME2 <>", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorName2GreaterThan(String value) {
            addCriterion("EDITOR_NAME2 >", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorName2GreaterThanOrEqualTo(String value) {
            addCriterion("EDITOR_NAME2 >=", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorName2LessThan(String value) {
            addCriterion("EDITOR_NAME2 <", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorName2LessThanOrEqualTo(String value) {
            addCriterion("EDITOR_NAME2 <=", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorName2Like(String value) {
            addCriterion("EDITOR_NAME2 like", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorName2NotLike(String value) {
            addCriterion("EDITOR_NAME2 not like", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorName2In(List<String> values) {
            addCriterion("EDITOR_NAME2 in", values, "id");
            return (Criteria)this;
        }

        public Criteria andEditorName2NotIn(List<String> values) {
            addCriterion("EDITOR_NAME2 not in", values, "id");
            return (Criteria)this;
        }

        public Criteria andEditorName2Between(String value1, String value2) {
            addCriterion("EDITOR_NAME2 between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andEditorName2NotBetween(String value1, String value2) {
            addCriterion("EDITOR_NAME2 not between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark2IsNull(){
            addCriterion("EDITOR_REMARK2 is null");
            return (Criteria)this;
        }

        public Criteria andEditorRemark2IsNotNull(){
            addCriterion("EDITOR_REMARK2 is not null");
            return (Criteria)this;
        }

        public Criteria andEditorRemark2EqualTo(String value) {
            addCriterion("EDITOR_REMARK2 =", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark2NotEqualTo(String value) {
            addCriterion("EDITOR_REMARK2 <>", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark2GreaterThan(String value) {
            addCriterion("EDITOR_REMARK2 >", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("EDITOR_REMARK2 >=", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark2LessThan(String value) {
            addCriterion("EDITOR_REMARK2 <", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark2LessThanOrEqualTo(String value) {
            addCriterion("EDITOR_REMARK2 <=", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark2Like(String value) {
            addCriterion("EDITOR_REMARK2 like", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark2NotLike(String value) {
            addCriterion("EDITOR_REMARK2 not like", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark2In(List<String> values) {
            addCriterion("EDITOR_REMARK2 in", values, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark2NotIn(List<String> values) {
            addCriterion("EDITOR_REMARK2 not in", values, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark2Between(String value1, String value2) {
            addCriterion("EDITOR_REMARK2 between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark2NotBetween(String value1, String value2) {
            addCriterion("EDITOR_REMARK2 not between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andEditName3IsNull(){
            addCriterion("EDIT_NAME3 is null");
            return (Criteria)this;
        }

        public Criteria andEditName3IsNotNull(){
            addCriterion("EDIT_NAME3 is not null");
            return (Criteria)this;
        }

        public Criteria andEditName3EqualTo(String value) {
            addCriterion("EDIT_NAME3 =", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditName3NotEqualTo(String value) {
            addCriterion("EDIT_NAME3 <>", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditName3GreaterThan(String value) {
            addCriterion("EDIT_NAME3 >", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditName3GreaterThanOrEqualTo(String value) {
            addCriterion("EDIT_NAME3 >=", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditName3LessThan(String value) {
            addCriterion("EDIT_NAME3 <", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditName3LessThanOrEqualTo(String value) {
            addCriterion("EDIT_NAME3 <=", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditName3Like(String value) {
            addCriterion("EDIT_NAME3 like", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditName3NotLike(String value) {
            addCriterion("EDIT_NAME3 not like", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditName3In(List<String> values) {
            addCriterion("EDIT_NAME3 in", values, "id");
            return (Criteria)this;
        }

        public Criteria andEditName3NotIn(List<String> values) {
            addCriterion("EDIT_NAME3 not in", values, "id");
            return (Criteria)this;
        }

        public Criteria andEditName3Between(String value1, String value2) {
            addCriterion("EDIT_NAME3 between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andEditName3NotBetween(String value1, String value2) {
            addCriterion("EDIT_NAME3 not between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark3IsNull(){
            addCriterion("EDITOR_REMARK3 is null");
            return (Criteria)this;
        }

        public Criteria andEditorRemark3IsNotNull(){
            addCriterion("EDITOR_REMARK3 is not null");
            return (Criteria)this;
        }

        public Criteria andEditorRemark3EqualTo(String value) {
            addCriterion("EDITOR_REMARK3 =", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark3NotEqualTo(String value) {
            addCriterion("EDITOR_REMARK3 <>", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark3GreaterThan(String value) {
            addCriterion("EDITOR_REMARK3 >", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark3GreaterThanOrEqualTo(String value) {
            addCriterion("EDITOR_REMARK3 >=", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark3LessThan(String value) {
            addCriterion("EDITOR_REMARK3 <", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark3LessThanOrEqualTo(String value) {
            addCriterion("EDITOR_REMARK3 <=", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark3Like(String value) {
            addCriterion("EDITOR_REMARK3 like", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark3NotLike(String value) {
            addCriterion("EDITOR_REMARK3 not like", value, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark3In(List<String> values) {
            addCriterion("EDITOR_REMARK3 in", values, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark3NotIn(List<String> values) {
            addCriterion("EDITOR_REMARK3 not in", values, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark3Between(String value1, String value2) {
            addCriterion("EDITOR_REMARK3 between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andEditorRemark3NotBetween(String value1, String value2) {
            addCriterion("EDITOR_REMARK3 not between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andImageIsNull(){
            addCriterion("IMAGE is null");
            return (Criteria)this;
        }

        public Criteria andImageIsNotNull(){
            addCriterion("IMAGE is not null");
            return (Criteria)this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("IMAGE =", value, "id");
            return (Criteria)this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("IMAGE <>", value, "id");
            return (Criteria)this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("IMAGE >", value, "id");
            return (Criteria)this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("IMAGE >=", value, "id");
            return (Criteria)this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("IMAGE <", value, "id");
            return (Criteria)this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("IMAGE <=", value, "id");
            return (Criteria)this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("IMAGE like", value, "id");
            return (Criteria)this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("IMAGE not like", value, "id");
            return (Criteria)this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("IMAGE in", values, "id");
            return (Criteria)this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("IMAGE not in", values, "id");
            return (Criteria)this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("IMAGE between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("IMAGE not between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andCreateTimeIsNull(){
            addCriterion("CREATE_TIME is null");
            return (Criteria)this;
        }

        public Criteria andCreateTimeIsNotNull(){
            addCriterion("CREATE_TIME is not null");
            return (Criteria)this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "id");
            return (Criteria)this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "id");
            return (Criteria)this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "id");
            return (Criteria)this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "id");
            return (Criteria)this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "id");
            return (Criteria)this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "id");
            return (Criteria)this;
        }

        public Criteria andCreateTimeLike(Date value) {
            addCriterion("CREATE_TIME like", value, "id");
            return (Criteria)this;
        }

        public Criteria andCreateTimeNotLike(Date value) {
            addCriterion("CREATE_TIME not like", value, "id");
            return (Criteria)this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "id");
            return (Criteria)this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "id");
            return (Criteria)this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeIsNull(){
            addCriterion("UPDATE_TIME is null");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeIsNotNull(){
            addCriterion("UPDATE_TIME is not null");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "id");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "id");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "id");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "id");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "id");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "id");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeLike(Date value) {
            addCriterion("UPDATE_TIME like", value, "id");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeNotLike(Date value) {
            addCriterion("UPDATE_TIME not like", value, "id");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "id");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "id");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andCreateIdIsNull(){
            addCriterion("CREATE_ID is null");
            return (Criteria)this;
        }

        public Criteria andCreateIdIsNotNull(){
            addCriterion("CREATE_ID is not null");
            return (Criteria)this;
        }

        public Criteria andCreateIdEqualTo(String value) {
            addCriterion("CREATE_ID =", value, "id");
            return (Criteria)this;
        }

        public Criteria andCreateIdNotEqualTo(String value) {
            addCriterion("CREATE_ID <>", value, "id");
            return (Criteria)this;
        }

        public Criteria andCreateIdGreaterThan(String value) {
            addCriterion("CREATE_ID >", value, "id");
            return (Criteria)this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_ID >=", value, "id");
            return (Criteria)this;
        }

        public Criteria andCreateIdLessThan(String value) {
            addCriterion("CREATE_ID <", value, "id");
            return (Criteria)this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(String value) {
            addCriterion("CREATE_ID <=", value, "id");
            return (Criteria)this;
        }

        public Criteria andCreateIdLike(String value) {
            addCriterion("CREATE_ID like", value, "id");
            return (Criteria)this;
        }

        public Criteria andCreateIdNotLike(String value) {
            addCriterion("CREATE_ID not like", value, "id");
            return (Criteria)this;
        }

        public Criteria andCreateIdIn(List<String> values) {
            addCriterion("CREATE_ID in", values, "id");
            return (Criteria)this;
        }

        public Criteria andCreateIdNotIn(List<String> values) {
            addCriterion("CREATE_ID not in", values, "id");
            return (Criteria)this;
        }

        public Criteria andCreateIdBetween(String value1, String value2) {
            addCriterion("CREATE_ID between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andCreateIdNotBetween(String value1, String value2) {
            addCriterion("CREATE_ID not between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andStatusIsNull(){
            addCriterion("STATUS is null");
            return (Criteria)this;
        }

        public Criteria andStatusIsNotNull(){
            addCriterion("STATUS is not null");
            return (Criteria)this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "id");
            return (Criteria)this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "id");
            return (Criteria)this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "id");
            return (Criteria)this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "id");
            return (Criteria)this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "id");
            return (Criteria)this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "id");
            return (Criteria)this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "id");
            return (Criteria)this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "id");
            return (Criteria)this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "id");
            return (Criteria)this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "id");
            return (Criteria)this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andUpdateIdIsNull(){
            addCriterion("UPDATE_ID is null");
            return (Criteria)this;
        }

        public Criteria andUpdateIdIsNotNull(){
            addCriterion("UPDATE_ID is not null");
            return (Criteria)this;
        }

        public Criteria andUpdateIdEqualTo(String value) {
            addCriterion("UPDATE_ID =", value, "id");
            return (Criteria)this;
        }

        public Criteria andUpdateIdNotEqualTo(String value) {
            addCriterion("UPDATE_ID <>", value, "id");
            return (Criteria)this;
        }

        public Criteria andUpdateIdGreaterThan(String value) {
            addCriterion("UPDATE_ID >", value, "id");
            return (Criteria)this;
        }

        public Criteria andUpdateIdGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_ID >=", value, "id");
            return (Criteria)this;
        }

        public Criteria andUpdateIdLessThan(String value) {
            addCriterion("UPDATE_ID <", value, "id");
            return (Criteria)this;
        }

        public Criteria andUpdateIdLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_ID <=", value, "id");
            return (Criteria)this;
        }

        public Criteria andUpdateIdLike(String value) {
            addCriterion("UPDATE_ID like", value, "id");
            return (Criteria)this;
        }

        public Criteria andUpdateIdNotLike(String value) {
            addCriterion("UPDATE_ID not like", value, "id");
            return (Criteria)this;
        }

        public Criteria andUpdateIdIn(List<String> values) {
            addCriterion("UPDATE_ID in", values, "id");
            return (Criteria)this;
        }

        public Criteria andUpdateIdNotIn(List<String> values) {
            addCriterion("UPDATE_ID not in", values, "id");
            return (Criteria)this;
        }

        public Criteria andUpdateIdBetween(String value1, String value2) {
            addCriterion("UPDATE_ID between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andUpdateIdNotBetween(String value1, String value2) {
            addCriterion("UPDATE_ID not between", value1, value2, "id");
            return (Criteria)this;
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
