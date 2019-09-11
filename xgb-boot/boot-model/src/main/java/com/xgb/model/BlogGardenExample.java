package com.xgb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogGardenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogGardenExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBlogTaitlIsNull() {
            addCriterion("BLOG_TAITL is null");
            return (Criteria) this;
        }

        public Criteria andBlogTaitlIsNotNull() {
            addCriterion("BLOG_TAITL is not null");
            return (Criteria) this;
        }

        public Criteria andBlogTaitlEqualTo(String value) {
            addCriterion("BLOG_TAITL =", value, "blogTaitl");
            return (Criteria) this;
        }

        public Criteria andBlogTaitlNotEqualTo(String value) {
            addCriterion("BLOG_TAITL <>", value, "blogTaitl");
            return (Criteria) this;
        }

        public Criteria andBlogTaitlGreaterThan(String value) {
            addCriterion("BLOG_TAITL >", value, "blogTaitl");
            return (Criteria) this;
        }

        public Criteria andBlogTaitlGreaterThanOrEqualTo(String value) {
            addCriterion("BLOG_TAITL >=", value, "blogTaitl");
            return (Criteria) this;
        }

        public Criteria andBlogTaitlLessThan(String value) {
            addCriterion("BLOG_TAITL <", value, "blogTaitl");
            return (Criteria) this;
        }

        public Criteria andBlogTaitlLessThanOrEqualTo(String value) {
            addCriterion("BLOG_TAITL <=", value, "blogTaitl");
            return (Criteria) this;
        }

        public Criteria andBlogTaitlLike(String value) {
            addCriterion("BLOG_TAITL like", value, "blogTaitl");
            return (Criteria) this;
        }

        public Criteria andBlogTaitlNotLike(String value) {
            addCriterion("BLOG_TAITL not like", value, "blogTaitl");
            return (Criteria) this;
        }

        public Criteria andBlogTaitlIn(List<String> values) {
            addCriterion("BLOG_TAITL in", values, "blogTaitl");
            return (Criteria) this;
        }

        public Criteria andBlogTaitlNotIn(List<String> values) {
            addCriterion("BLOG_TAITL not in", values, "blogTaitl");
            return (Criteria) this;
        }

        public Criteria andBlogTaitlBetween(String value1, String value2) {
            addCriterion("BLOG_TAITL between", value1, value2, "blogTaitl");
            return (Criteria) this;
        }

        public Criteria andBlogTaitlNotBetween(String value1, String value2) {
            addCriterion("BLOG_TAITL not between", value1, value2, "blogTaitl");
            return (Criteria) this;
        }

        public Criteria andBlogAboutIsNull() {
            addCriterion("BLOG_ABOUT is null");
            return (Criteria) this;
        }

        public Criteria andBlogAboutIsNotNull() {
            addCriterion("BLOG_ABOUT is not null");
            return (Criteria) this;
        }

        public Criteria andBlogAboutEqualTo(String value) {
            addCriterion("BLOG_ABOUT =", value, "blogAbout");
            return (Criteria) this;
        }

        public Criteria andBlogAboutNotEqualTo(String value) {
            addCriterion("BLOG_ABOUT <>", value, "blogAbout");
            return (Criteria) this;
        }

        public Criteria andBlogAboutGreaterThan(String value) {
            addCriterion("BLOG_ABOUT >", value, "blogAbout");
            return (Criteria) this;
        }

        public Criteria andBlogAboutGreaterThanOrEqualTo(String value) {
            addCriterion("BLOG_ABOUT >=", value, "blogAbout");
            return (Criteria) this;
        }

        public Criteria andBlogAboutLessThan(String value) {
            addCriterion("BLOG_ABOUT <", value, "blogAbout");
            return (Criteria) this;
        }

        public Criteria andBlogAboutLessThanOrEqualTo(String value) {
            addCriterion("BLOG_ABOUT <=", value, "blogAbout");
            return (Criteria) this;
        }

        public Criteria andBlogAboutLike(String value) {
            addCriterion("BLOG_ABOUT like", value, "blogAbout");
            return (Criteria) this;
        }

        public Criteria andBlogAboutNotLike(String value) {
            addCriterion("BLOG_ABOUT not like", value, "blogAbout");
            return (Criteria) this;
        }

        public Criteria andBlogAboutIn(List<String> values) {
            addCriterion("BLOG_ABOUT in", values, "blogAbout");
            return (Criteria) this;
        }

        public Criteria andBlogAboutNotIn(List<String> values) {
            addCriterion("BLOG_ABOUT not in", values, "blogAbout");
            return (Criteria) this;
        }

        public Criteria andBlogAboutBetween(String value1, String value2) {
            addCriterion("BLOG_ABOUT between", value1, value2, "blogAbout");
            return (Criteria) this;
        }

        public Criteria andBlogAboutNotBetween(String value1, String value2) {
            addCriterion("BLOG_ABOUT not between", value1, value2, "blogAbout");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("VOLUME is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("VOLUME is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(Integer value) {
            addCriterion("VOLUME =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(Integer value) {
            addCriterion("VOLUME <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(Integer value) {
            addCriterion("VOLUME >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("VOLUME >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(Integer value) {
            addCriterion("VOLUME <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(Integer value) {
            addCriterion("VOLUME <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<Integer> values) {
            addCriterion("VOLUME in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<Integer> values) {
            addCriterion("VOLUME not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(Integer value1, Integer value2) {
            addCriterion("VOLUME between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("VOLUME not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andSupportIsNull() {
            addCriterion("SUPPORT is null");
            return (Criteria) this;
        }

        public Criteria andSupportIsNotNull() {
            addCriterion("SUPPORT is not null");
            return (Criteria) this;
        }

        public Criteria andSupportEqualTo(Integer value) {
            addCriterion("SUPPORT =", value, "support");
            return (Criteria) this;
        }

        public Criteria andSupportNotEqualTo(Integer value) {
            addCriterion("SUPPORT <>", value, "support");
            return (Criteria) this;
        }

        public Criteria andSupportGreaterThan(Integer value) {
            addCriterion("SUPPORT >", value, "support");
            return (Criteria) this;
        }

        public Criteria andSupportGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUPPORT >=", value, "support");
            return (Criteria) this;
        }

        public Criteria andSupportLessThan(Integer value) {
            addCriterion("SUPPORT <", value, "support");
            return (Criteria) this;
        }

        public Criteria andSupportLessThanOrEqualTo(Integer value) {
            addCriterion("SUPPORT <=", value, "support");
            return (Criteria) this;
        }

        public Criteria andSupportIn(List<Integer> values) {
            addCriterion("SUPPORT in", values, "support");
            return (Criteria) this;
        }

        public Criteria andSupportNotIn(List<Integer> values) {
            addCriterion("SUPPORT not in", values, "support");
            return (Criteria) this;
        }

        public Criteria andSupportBetween(Integer value1, Integer value2) {
            addCriterion("SUPPORT between", value1, value2, "support");
            return (Criteria) this;
        }

        public Criteria andSupportNotBetween(Integer value1, Integer value2) {
            addCriterion("SUPPORT not between", value1, value2, "support");
            return (Criteria) this;
        }

        public Criteria andOppositionIsNull() {
            addCriterion("OPPOSITION is null");
            return (Criteria) this;
        }

        public Criteria andOppositionIsNotNull() {
            addCriterion("OPPOSITION is not null");
            return (Criteria) this;
        }

        public Criteria andOppositionEqualTo(Integer value) {
            addCriterion("OPPOSITION =", value, "opposition");
            return (Criteria) this;
        }

        public Criteria andOppositionNotEqualTo(Integer value) {
            addCriterion("OPPOSITION <>", value, "opposition");
            return (Criteria) this;
        }

        public Criteria andOppositionGreaterThan(Integer value) {
            addCriterion("OPPOSITION >", value, "opposition");
            return (Criteria) this;
        }

        public Criteria andOppositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("OPPOSITION >=", value, "opposition");
            return (Criteria) this;
        }

        public Criteria andOppositionLessThan(Integer value) {
            addCriterion("OPPOSITION <", value, "opposition");
            return (Criteria) this;
        }

        public Criteria andOppositionLessThanOrEqualTo(Integer value) {
            addCriterion("OPPOSITION <=", value, "opposition");
            return (Criteria) this;
        }

        public Criteria andOppositionIn(List<Integer> values) {
            addCriterion("OPPOSITION in", values, "opposition");
            return (Criteria) this;
        }

        public Criteria andOppositionNotIn(List<Integer> values) {
            addCriterion("OPPOSITION not in", values, "opposition");
            return (Criteria) this;
        }

        public Criteria andOppositionBetween(Integer value1, Integer value2) {
            addCriterion("OPPOSITION between", value1, value2, "opposition");
            return (Criteria) this;
        }

        public Criteria andOppositionNotBetween(Integer value1, Integer value2) {
            addCriterion("OPPOSITION not between", value1, value2, "opposition");
            return (Criteria) this;
        }

        public Criteria andClassificationIdIsNull() {
            addCriterion("CLASSIFICATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andClassificationIdIsNotNull() {
            addCriterion("CLASSIFICATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationIdEqualTo(String value) {
            addCriterion("CLASSIFICATION_ID =", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdNotEqualTo(String value) {
            addCriterion("CLASSIFICATION_ID <>", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdGreaterThan(String value) {
            addCriterion("CLASSIFICATION_ID >", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSIFICATION_ID >=", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdLessThan(String value) {
            addCriterion("CLASSIFICATION_ID <", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdLessThanOrEqualTo(String value) {
            addCriterion("CLASSIFICATION_ID <=", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdLike(String value) {
            addCriterion("CLASSIFICATION_ID like", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdNotLike(String value) {
            addCriterion("CLASSIFICATION_ID not like", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdIn(List<String> values) {
            addCriterion("CLASSIFICATION_ID in", values, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdNotIn(List<String> values) {
            addCriterion("CLASSIFICATION_ID not in", values, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdBetween(String value1, String value2) {
            addCriterion("CLASSIFICATION_ID between", value1, value2, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdNotBetween(String value1, String value2) {
            addCriterion("CLASSIFICATION_ID not between", value1, value2, "classificationId");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("CREATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("CREATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(String value) {
            addCriterion("CREATE_ID =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(String value) {
            addCriterion("CREATE_ID <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(String value) {
            addCriterion("CREATE_ID >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_ID >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(String value) {
            addCriterion("CREATE_ID <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(String value) {
            addCriterion("CREATE_ID <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLike(String value) {
            addCriterion("CREATE_ID like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotLike(String value) {
            addCriterion("CREATE_ID not like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<String> values) {
            addCriterion("CREATE_ID in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<String> values) {
            addCriterion("CREATE_ID not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(String value1, String value2) {
            addCriterion("CREATE_ID between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(String value1, String value2) {
            addCriterion("CREATE_ID not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNull() {
            addCriterion("UPDATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNotNull() {
            addCriterion("UPDATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdEqualTo(String value) {
            addCriterion("UPDATE_ID =", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotEqualTo(String value) {
            addCriterion("UPDATE_ID <>", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThan(String value) {
            addCriterion("UPDATE_ID >", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_ID >=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThan(String value) {
            addCriterion("UPDATE_ID <", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_ID <=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLike(String value) {
            addCriterion("UPDATE_ID like", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotLike(String value) {
            addCriterion("UPDATE_ID not like", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIn(List<String> values) {
            addCriterion("UPDATE_ID in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotIn(List<String> values) {
            addCriterion("UPDATE_ID not in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdBetween(String value1, String value2) {
            addCriterion("UPDATE_ID between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotBetween(String value1, String value2) {
            addCriterion("UPDATE_ID not between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andKeyWordIsNull() {
            addCriterion("KEY_WORD is null");
            return (Criteria) this;
        }

        public Criteria andKeyWordIsNotNull() {
            addCriterion("KEY_WORD is not null");
            return (Criteria) this;
        }

        public Criteria andKeyWordEqualTo(String value) {
            addCriterion("KEY_WORD =", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordNotEqualTo(String value) {
            addCriterion("KEY_WORD <>", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordGreaterThan(String value) {
            addCriterion("KEY_WORD >", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordGreaterThanOrEqualTo(String value) {
            addCriterion("KEY_WORD >=", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordLessThan(String value) {
            addCriterion("KEY_WORD <", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordLessThanOrEqualTo(String value) {
            addCriterion("KEY_WORD <=", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordLike(String value) {
            addCriterion("KEY_WORD like", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordNotLike(String value) {
            addCriterion("KEY_WORD not like", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordIn(List<String> values) {
            addCriterion("KEY_WORD in", values, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordNotIn(List<String> values) {
            addCriterion("KEY_WORD not in", values, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordBetween(String value1, String value2) {
            addCriterion("KEY_WORD between", value1, value2, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordNotBetween(String value1, String value2) {
            addCriterion("KEY_WORD not between", value1, value2, "keyWord");
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