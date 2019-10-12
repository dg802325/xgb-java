package com.xgb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopAdverExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopAdverExample() {
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

        public Criteria andAdverNameIsNull() {
            addCriterion("ADVER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAdverNameIsNotNull() {
            addCriterion("ADVER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAdverNameEqualTo(String value) {
            addCriterion("ADVER_NAME =", value, "adverName");
            return (Criteria) this;
        }

        public Criteria andAdverNameNotEqualTo(String value) {
            addCriterion("ADVER_NAME <>", value, "adverName");
            return (Criteria) this;
        }

        public Criteria andAdverNameGreaterThan(String value) {
            addCriterion("ADVER_NAME >", value, "adverName");
            return (Criteria) this;
        }

        public Criteria andAdverNameGreaterThanOrEqualTo(String value) {
            addCriterion("ADVER_NAME >=", value, "adverName");
            return (Criteria) this;
        }

        public Criteria andAdverNameLessThan(String value) {
            addCriterion("ADVER_NAME <", value, "adverName");
            return (Criteria) this;
        }

        public Criteria andAdverNameLessThanOrEqualTo(String value) {
            addCriterion("ADVER_NAME <=", value, "adverName");
            return (Criteria) this;
        }

        public Criteria andAdverNameLike(String value) {
            addCriterion("ADVER_NAME like", value, "adverName");
            return (Criteria) this;
        }

        public Criteria andAdverNameNotLike(String value) {
            addCriterion("ADVER_NAME not like", value, "adverName");
            return (Criteria) this;
        }

        public Criteria andAdverNameIn(List<String> values) {
            addCriterion("ADVER_NAME in", values, "adverName");
            return (Criteria) this;
        }

        public Criteria andAdverNameNotIn(List<String> values) {
            addCriterion("ADVER_NAME not in", values, "adverName");
            return (Criteria) this;
        }

        public Criteria andAdverNameBetween(String value1, String value2) {
            addCriterion("ADVER_NAME between", value1, value2, "adverName");
            return (Criteria) this;
        }

        public Criteria andAdverNameNotBetween(String value1, String value2) {
            addCriterion("ADVER_NAME not between", value1, value2, "adverName");
            return (Criteria) this;
        }

        public Criteria andAdverLocationIsNull() {
            addCriterion("ADVER_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andAdverLocationIsNotNull() {
            addCriterion("ADVER_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andAdverLocationEqualTo(String value) {
            addCriterion("ADVER_LOCATION =", value, "adverLocation");
            return (Criteria) this;
        }

        public Criteria andAdverLocationNotEqualTo(String value) {
            addCriterion("ADVER_LOCATION <>", value, "adverLocation");
            return (Criteria) this;
        }

        public Criteria andAdverLocationGreaterThan(String value) {
            addCriterion("ADVER_LOCATION >", value, "adverLocation");
            return (Criteria) this;
        }

        public Criteria andAdverLocationGreaterThanOrEqualTo(String value) {
            addCriterion("ADVER_LOCATION >=", value, "adverLocation");
            return (Criteria) this;
        }

        public Criteria andAdverLocationLessThan(String value) {
            addCriterion("ADVER_LOCATION <", value, "adverLocation");
            return (Criteria) this;
        }

        public Criteria andAdverLocationLessThanOrEqualTo(String value) {
            addCriterion("ADVER_LOCATION <=", value, "adverLocation");
            return (Criteria) this;
        }

        public Criteria andAdverLocationLike(String value) {
            addCriterion("ADVER_LOCATION like", value, "adverLocation");
            return (Criteria) this;
        }

        public Criteria andAdverLocationNotLike(String value) {
            addCriterion("ADVER_LOCATION not like", value, "adverLocation");
            return (Criteria) this;
        }

        public Criteria andAdverLocationIn(List<String> values) {
            addCriterion("ADVER_LOCATION in", values, "adverLocation");
            return (Criteria) this;
        }

        public Criteria andAdverLocationNotIn(List<String> values) {
            addCriterion("ADVER_LOCATION not in", values, "adverLocation");
            return (Criteria) this;
        }

        public Criteria andAdverLocationBetween(String value1, String value2) {
            addCriterion("ADVER_LOCATION between", value1, value2, "adverLocation");
            return (Criteria) this;
        }

        public Criteria andAdverLocationNotBetween(String value1, String value2) {
            addCriterion("ADVER_LOCATION not between", value1, value2, "adverLocation");
            return (Criteria) this;
        }

        public Criteria andAdverImageIsNull() {
            addCriterion("ADVER_IMAGE is null");
            return (Criteria) this;
        }

        public Criteria andAdverImageIsNotNull() {
            addCriterion("ADVER_IMAGE is not null");
            return (Criteria) this;
        }

        public Criteria andAdverImageEqualTo(String value) {
            addCriterion("ADVER_IMAGE =", value, "adverImage");
            return (Criteria) this;
        }

        public Criteria andAdverImageNotEqualTo(String value) {
            addCriterion("ADVER_IMAGE <>", value, "adverImage");
            return (Criteria) this;
        }

        public Criteria andAdverImageGreaterThan(String value) {
            addCriterion("ADVER_IMAGE >", value, "adverImage");
            return (Criteria) this;
        }

        public Criteria andAdverImageGreaterThanOrEqualTo(String value) {
            addCriterion("ADVER_IMAGE >=", value, "adverImage");
            return (Criteria) this;
        }

        public Criteria andAdverImageLessThan(String value) {
            addCriterion("ADVER_IMAGE <", value, "adverImage");
            return (Criteria) this;
        }

        public Criteria andAdverImageLessThanOrEqualTo(String value) {
            addCriterion("ADVER_IMAGE <=", value, "adverImage");
            return (Criteria) this;
        }

        public Criteria andAdverImageLike(String value) {
            addCriterion("ADVER_IMAGE like", value, "adverImage");
            return (Criteria) this;
        }

        public Criteria andAdverImageNotLike(String value) {
            addCriterion("ADVER_IMAGE not like", value, "adverImage");
            return (Criteria) this;
        }

        public Criteria andAdverImageIn(List<String> values) {
            addCriterion("ADVER_IMAGE in", values, "adverImage");
            return (Criteria) this;
        }

        public Criteria andAdverImageNotIn(List<String> values) {
            addCriterion("ADVER_IMAGE not in", values, "adverImage");
            return (Criteria) this;
        }

        public Criteria andAdverImageBetween(String value1, String value2) {
            addCriterion("ADVER_IMAGE between", value1, value2, "adverImage");
            return (Criteria) this;
        }

        public Criteria andAdverImageNotBetween(String value1, String value2) {
            addCriterion("ADVER_IMAGE not between", value1, value2, "adverImage");
            return (Criteria) this;
        }

        public Criteria andAdverLinkIsNull() {
            addCriterion("ADVER_LINK is null");
            return (Criteria) this;
        }

        public Criteria andAdverLinkIsNotNull() {
            addCriterion("ADVER_LINK is not null");
            return (Criteria) this;
        }

        public Criteria andAdverLinkEqualTo(String value) {
            addCriterion("ADVER_LINK =", value, "adverLink");
            return (Criteria) this;
        }

        public Criteria andAdverLinkNotEqualTo(String value) {
            addCriterion("ADVER_LINK <>", value, "adverLink");
            return (Criteria) this;
        }

        public Criteria andAdverLinkGreaterThan(String value) {
            addCriterion("ADVER_LINK >", value, "adverLink");
            return (Criteria) this;
        }

        public Criteria andAdverLinkGreaterThanOrEqualTo(String value) {
            addCriterion("ADVER_LINK >=", value, "adverLink");
            return (Criteria) this;
        }

        public Criteria andAdverLinkLessThan(String value) {
            addCriterion("ADVER_LINK <", value, "adverLink");
            return (Criteria) this;
        }

        public Criteria andAdverLinkLessThanOrEqualTo(String value) {
            addCriterion("ADVER_LINK <=", value, "adverLink");
            return (Criteria) this;
        }

        public Criteria andAdverLinkLike(String value) {
            addCriterion("ADVER_LINK like", value, "adverLink");
            return (Criteria) this;
        }

        public Criteria andAdverLinkNotLike(String value) {
            addCriterion("ADVER_LINK not like", value, "adverLink");
            return (Criteria) this;
        }

        public Criteria andAdverLinkIn(List<String> values) {
            addCriterion("ADVER_LINK in", values, "adverLink");
            return (Criteria) this;
        }

        public Criteria andAdverLinkNotIn(List<String> values) {
            addCriterion("ADVER_LINK not in", values, "adverLink");
            return (Criteria) this;
        }

        public Criteria andAdverLinkBetween(String value1, String value2) {
            addCriterion("ADVER_LINK between", value1, value2, "adverLink");
            return (Criteria) this;
        }

        public Criteria andAdverLinkNotBetween(String value1, String value2) {
            addCriterion("ADVER_LINK not between", value1, value2, "adverLink");
            return (Criteria) this;
        }

        public Criteria andAdverRemarkIsNull() {
            addCriterion("ADVER_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andAdverRemarkIsNotNull() {
            addCriterion("ADVER_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andAdverRemarkEqualTo(String value) {
            addCriterion("ADVER_REMARK =", value, "adverRemark");
            return (Criteria) this;
        }

        public Criteria andAdverRemarkNotEqualTo(String value) {
            addCriterion("ADVER_REMARK <>", value, "adverRemark");
            return (Criteria) this;
        }

        public Criteria andAdverRemarkGreaterThan(String value) {
            addCriterion("ADVER_REMARK >", value, "adverRemark");
            return (Criteria) this;
        }

        public Criteria andAdverRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ADVER_REMARK >=", value, "adverRemark");
            return (Criteria) this;
        }

        public Criteria andAdverRemarkLessThan(String value) {
            addCriterion("ADVER_REMARK <", value, "adverRemark");
            return (Criteria) this;
        }

        public Criteria andAdverRemarkLessThanOrEqualTo(String value) {
            addCriterion("ADVER_REMARK <=", value, "adverRemark");
            return (Criteria) this;
        }

        public Criteria andAdverRemarkLike(String value) {
            addCriterion("ADVER_REMARK like", value, "adverRemark");
            return (Criteria) this;
        }

        public Criteria andAdverRemarkNotLike(String value) {
            addCriterion("ADVER_REMARK not like", value, "adverRemark");
            return (Criteria) this;
        }

        public Criteria andAdverRemarkIn(List<String> values) {
            addCriterion("ADVER_REMARK in", values, "adverRemark");
            return (Criteria) this;
        }

        public Criteria andAdverRemarkNotIn(List<String> values) {
            addCriterion("ADVER_REMARK not in", values, "adverRemark");
            return (Criteria) this;
        }

        public Criteria andAdverRemarkBetween(String value1, String value2) {
            addCriterion("ADVER_REMARK between", value1, value2, "adverRemark");
            return (Criteria) this;
        }

        public Criteria andAdverRemarkNotBetween(String value1, String value2) {
            addCriterion("ADVER_REMARK not between", value1, value2, "adverRemark");
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

        public Criteria andCreatorIdIsNull() {
            addCriterion("CREATOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("CREATOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(String value) {
            addCriterion("CREATOR_ID =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(String value) {
            addCriterion("CREATOR_ID <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(String value) {
            addCriterion("CREATOR_ID >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR_ID >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(String value) {
            addCriterion("CREATOR_ID <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(String value) {
            addCriterion("CREATOR_ID <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLike(String value) {
            addCriterion("CREATOR_ID like", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotLike(String value) {
            addCriterion("CREATOR_ID not like", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<String> values) {
            addCriterion("CREATOR_ID in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<String> values) {
            addCriterion("CREATOR_ID not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(String value1, String value2) {
            addCriterion("CREATOR_ID between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(String value1, String value2) {
            addCriterion("CREATOR_ID not between", value1, value2, "creatorId");
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

        public Criteria andUpTopIsNull() {
            addCriterion("UP_TOP is null");
            return (Criteria) this;
        }

        public Criteria andUpTopIsNotNull() {
            addCriterion("UP_TOP is not null");
            return (Criteria) this;
        }

        public Criteria andUpTopEqualTo(String value) {
            addCriterion("UP_TOP =", value, "upTop");
            return (Criteria) this;
        }

        public Criteria andUpTopNotEqualTo(String value) {
            addCriterion("UP_TOP <>", value, "upTop");
            return (Criteria) this;
        }

        public Criteria andUpTopGreaterThan(String value) {
            addCriterion("UP_TOP >", value, "upTop");
            return (Criteria) this;
        }

        public Criteria andUpTopGreaterThanOrEqualTo(String value) {
            addCriterion("UP_TOP >=", value, "upTop");
            return (Criteria) this;
        }

        public Criteria andUpTopLessThan(String value) {
            addCriterion("UP_TOP <", value, "upTop");
            return (Criteria) this;
        }

        public Criteria andUpTopLessThanOrEqualTo(String value) {
            addCriterion("UP_TOP <=", value, "upTop");
            return (Criteria) this;
        }

        public Criteria andUpTopLike(String value) {
            addCriterion("UP_TOP like", value, "upTop");
            return (Criteria) this;
        }

        public Criteria andUpTopNotLike(String value) {
            addCriterion("UP_TOP not like", value, "upTop");
            return (Criteria) this;
        }

        public Criteria andUpTopIn(List<String> values) {
            addCriterion("UP_TOP in", values, "upTop");
            return (Criteria) this;
        }

        public Criteria andUpTopNotIn(List<String> values) {
            addCriterion("UP_TOP not in", values, "upTop");
            return (Criteria) this;
        }

        public Criteria andUpTopBetween(String value1, String value2) {
            addCriterion("UP_TOP between", value1, value2, "upTop");
            return (Criteria) this;
        }

        public Criteria andUpTopNotBetween(String value1, String value2) {
            addCriterion("UP_TOP not between", value1, value2, "upTop");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
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