package com.xgb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JjhNjReportZxqkItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JjhNjReportZxqkItemExample() {
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

        public Criteria andZxjjmingchengIsNull() {
            addCriterion("ZXJJMINGCHENG is null");
            return (Criteria) this;
        }

        public Criteria andZxjjmingchengIsNotNull() {
            addCriterion("ZXJJMINGCHENG is not null");
            return (Criteria) this;
        }

        public Criteria andZxjjmingchengEqualTo(Object value) {
            addCriterion("ZXJJMINGCHENG =", value, "zxjjmingcheng");
            return (Criteria) this;
        }

        public Criteria andZxjjmingchengNotEqualTo(Object value) {
            addCriterion("ZXJJMINGCHENG <>", value, "zxjjmingcheng");
            return (Criteria) this;
        }

        public Criteria andZxjjmingchengGreaterThan(Object value) {
            addCriterion("ZXJJMINGCHENG >", value, "zxjjmingcheng");
            return (Criteria) this;
        }

        public Criteria andZxjjmingchengGreaterThanOrEqualTo(Object value) {
            addCriterion("ZXJJMINGCHENG >=", value, "zxjjmingcheng");
            return (Criteria) this;
        }

        public Criteria andZxjjmingchengLessThan(Object value) {
            addCriterion("ZXJJMINGCHENG <", value, "zxjjmingcheng");
            return (Criteria) this;
        }

        public Criteria andZxjjmingchengLessThanOrEqualTo(Object value) {
            addCriterion("ZXJJMINGCHENG <=", value, "zxjjmingcheng");
            return (Criteria) this;
        }

        public Criteria andZxjjmingchengIn(List<Object> values) {
            addCriterion("ZXJJMINGCHENG in", values, "zxjjmingcheng");
            return (Criteria) this;
        }

        public Criteria andZxjjmingchengNotIn(List<Object> values) {
            addCriterion("ZXJJMINGCHENG not in", values, "zxjjmingcheng");
            return (Criteria) this;
        }

        public Criteria andZxjjmingchengBetween(Object value1, Object value2) {
            addCriterion("ZXJJMINGCHENG between", value1, value2, "zxjjmingcheng");
            return (Criteria) this;
        }

        public Criteria andZxjjmingchengNotBetween(Object value1, Object value2) {
            addCriterion("ZXJJMINGCHENG not between", value1, value2, "zxjjmingcheng");
            return (Criteria) this;
        }

        public Criteria andChenglishijianIsNull() {
            addCriterion("CHENGLISHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andChenglishijianIsNotNull() {
            addCriterion("CHENGLISHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andChenglishijianEqualTo(Date value) {
            addCriterion("CHENGLISHIJIAN =", value, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andChenglishijianNotEqualTo(Date value) {
            addCriterion("CHENGLISHIJIAN <>", value, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andChenglishijianGreaterThan(Date value) {
            addCriterion("CHENGLISHIJIAN >", value, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andChenglishijianGreaterThanOrEqualTo(Date value) {
            addCriterion("CHENGLISHIJIAN >=", value, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andChenglishijianLessThan(Date value) {
            addCriterion("CHENGLISHIJIAN <", value, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andChenglishijianLessThanOrEqualTo(Date value) {
            addCriterion("CHENGLISHIJIAN <=", value, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andChenglishijianIn(List<Date> values) {
            addCriterion("CHENGLISHIJIAN in", values, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andChenglishijianNotIn(List<Date> values) {
            addCriterion("CHENGLISHIJIAN not in", values, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andChenglishijianBetween(Date value1, Date value2) {
            addCriterion("CHENGLISHIJIAN between", value1, value2, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andChenglishijianNotBetween(Date value1, Date value2) {
            addCriterion("CHENGLISHIJIAN not between", value1, value2, "chenglishijian");
            return (Criteria) this;
        }

        public Criteria andFaqirenIsNull() {
            addCriterion("FAQIREN is null");
            return (Criteria) this;
        }

        public Criteria andFaqirenIsNotNull() {
            addCriterion("FAQIREN is not null");
            return (Criteria) this;
        }

        public Criteria andFaqirenEqualTo(Object value) {
            addCriterion("FAQIREN =", value, "faqiren");
            return (Criteria) this;
        }

        public Criteria andFaqirenNotEqualTo(Object value) {
            addCriterion("FAQIREN <>", value, "faqiren");
            return (Criteria) this;
        }

        public Criteria andFaqirenGreaterThan(Object value) {
            addCriterion("FAQIREN >", value, "faqiren");
            return (Criteria) this;
        }

        public Criteria andFaqirenGreaterThanOrEqualTo(Object value) {
            addCriterion("FAQIREN >=", value, "faqiren");
            return (Criteria) this;
        }

        public Criteria andFaqirenLessThan(Object value) {
            addCriterion("FAQIREN <", value, "faqiren");
            return (Criteria) this;
        }

        public Criteria andFaqirenLessThanOrEqualTo(Object value) {
            addCriterion("FAQIREN <=", value, "faqiren");
            return (Criteria) this;
        }

        public Criteria andFaqirenIn(List<Object> values) {
            addCriterion("FAQIREN in", values, "faqiren");
            return (Criteria) this;
        }

        public Criteria andFaqirenNotIn(List<Object> values) {
            addCriterion("FAQIREN not in", values, "faqiren");
            return (Criteria) this;
        }

        public Criteria andFaqirenBetween(Object value1, Object value2) {
            addCriterion("FAQIREN between", value1, value2, "faqiren");
            return (Criteria) this;
        }

        public Criteria andFaqirenNotBetween(Object value1, Object value2) {
            addCriterion("FAQIREN not between", value1, value2, "faqiren");
            return (Criteria) this;
        }

        public Criteria andChuzirenIsNull() {
            addCriterion("CHUZIREN is null");
            return (Criteria) this;
        }

        public Criteria andChuzirenIsNotNull() {
            addCriterion("CHUZIREN is not null");
            return (Criteria) this;
        }

        public Criteria andChuzirenEqualTo(Object value) {
            addCriterion("CHUZIREN =", value, "chuziren");
            return (Criteria) this;
        }

        public Criteria andChuzirenNotEqualTo(Object value) {
            addCriterion("CHUZIREN <>", value, "chuziren");
            return (Criteria) this;
        }

        public Criteria andChuzirenGreaterThan(Object value) {
            addCriterion("CHUZIREN >", value, "chuziren");
            return (Criteria) this;
        }

        public Criteria andChuzirenGreaterThanOrEqualTo(Object value) {
            addCriterion("CHUZIREN >=", value, "chuziren");
            return (Criteria) this;
        }

        public Criteria andChuzirenLessThan(Object value) {
            addCriterion("CHUZIREN <", value, "chuziren");
            return (Criteria) this;
        }

        public Criteria andChuzirenLessThanOrEqualTo(Object value) {
            addCriterion("CHUZIREN <=", value, "chuziren");
            return (Criteria) this;
        }

        public Criteria andChuzirenIn(List<Object> values) {
            addCriterion("CHUZIREN in", values, "chuziren");
            return (Criteria) this;
        }

        public Criteria andChuzirenNotIn(List<Object> values) {
            addCriterion("CHUZIREN not in", values, "chuziren");
            return (Criteria) this;
        }

        public Criteria andChuzirenBetween(Object value1, Object value2) {
            addCriterion("CHUZIREN between", value1, value2, "chuziren");
            return (Criteria) this;
        }

        public Criteria andChuzirenNotBetween(Object value1, Object value2) {
            addCriterion("CHUZIREN not between", value1, value2, "chuziren");
            return (Criteria) this;
        }

        public Criteria andFuzerenIsNull() {
            addCriterion("FUZEREN is null");
            return (Criteria) this;
        }

        public Criteria andFuzerenIsNotNull() {
            addCriterion("FUZEREN is not null");
            return (Criteria) this;
        }

        public Criteria andFuzerenEqualTo(Object value) {
            addCriterion("FUZEREN =", value, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenNotEqualTo(Object value) {
            addCriterion("FUZEREN <>", value, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenGreaterThan(Object value) {
            addCriterion("FUZEREN >", value, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenGreaterThanOrEqualTo(Object value) {
            addCriterion("FUZEREN >=", value, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenLessThan(Object value) {
            addCriterion("FUZEREN <", value, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenLessThanOrEqualTo(Object value) {
            addCriterion("FUZEREN <=", value, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenIn(List<Object> values) {
            addCriterion("FUZEREN in", values, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenNotIn(List<Object> values) {
            addCriterion("FUZEREN not in", values, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenBetween(Object value1, Object value2) {
            addCriterion("FUZEREN between", value1, value2, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenNotBetween(Object value1, Object value2) {
            addCriterion("FUZEREN not between", value1, value2, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andZhanghuxingzhiIsNull() {
            addCriterion("ZHANGHUXINGZHI is null");
            return (Criteria) this;
        }

        public Criteria andZhanghuxingzhiIsNotNull() {
            addCriterion("ZHANGHUXINGZHI is not null");
            return (Criteria) this;
        }

        public Criteria andZhanghuxingzhiEqualTo(Object value) {
            addCriterion("ZHANGHUXINGZHI =", value, "zhanghuxingzhi");
            return (Criteria) this;
        }

        public Criteria andZhanghuxingzhiNotEqualTo(Object value) {
            addCriterion("ZHANGHUXINGZHI <>", value, "zhanghuxingzhi");
            return (Criteria) this;
        }

        public Criteria andZhanghuxingzhiGreaterThan(Object value) {
            addCriterion("ZHANGHUXINGZHI >", value, "zhanghuxingzhi");
            return (Criteria) this;
        }

        public Criteria andZhanghuxingzhiGreaterThanOrEqualTo(Object value) {
            addCriterion("ZHANGHUXINGZHI >=", value, "zhanghuxingzhi");
            return (Criteria) this;
        }

        public Criteria andZhanghuxingzhiLessThan(Object value) {
            addCriterion("ZHANGHUXINGZHI <", value, "zhanghuxingzhi");
            return (Criteria) this;
        }

        public Criteria andZhanghuxingzhiLessThanOrEqualTo(Object value) {
            addCriterion("ZHANGHUXINGZHI <=", value, "zhanghuxingzhi");
            return (Criteria) this;
        }

        public Criteria andZhanghuxingzhiIn(List<Object> values) {
            addCriterion("ZHANGHUXINGZHI in", values, "zhanghuxingzhi");
            return (Criteria) this;
        }

        public Criteria andZhanghuxingzhiNotIn(List<Object> values) {
            addCriterion("ZHANGHUXINGZHI not in", values, "zhanghuxingzhi");
            return (Criteria) this;
        }

        public Criteria andZhanghuxingzhiBetween(Object value1, Object value2) {
            addCriterion("ZHANGHUXINGZHI between", value1, value2, "zhanghuxingzhi");
            return (Criteria) this;
        }

        public Criteria andZhanghuxingzhiNotBetween(Object value1, Object value2) {
            addCriterion("ZHANGHUXINGZHI not between", value1, value2, "zhanghuxingzhi");
            return (Criteria) this;
        }

        public Criteria andGuanlijigouIsNull() {
            addCriterion("GUANLIJIGOU is null");
            return (Criteria) this;
        }

        public Criteria andGuanlijigouIsNotNull() {
            addCriterion("GUANLIJIGOU is not null");
            return (Criteria) this;
        }

        public Criteria andGuanlijigouEqualTo(Object value) {
            addCriterion("GUANLIJIGOU =", value, "guanlijigou");
            return (Criteria) this;
        }

        public Criteria andGuanlijigouNotEqualTo(Object value) {
            addCriterion("GUANLIJIGOU <>", value, "guanlijigou");
            return (Criteria) this;
        }

        public Criteria andGuanlijigouGreaterThan(Object value) {
            addCriterion("GUANLIJIGOU >", value, "guanlijigou");
            return (Criteria) this;
        }

        public Criteria andGuanlijigouGreaterThanOrEqualTo(Object value) {
            addCriterion("GUANLIJIGOU >=", value, "guanlijigou");
            return (Criteria) this;
        }

        public Criteria andGuanlijigouLessThan(Object value) {
            addCriterion("GUANLIJIGOU <", value, "guanlijigou");
            return (Criteria) this;
        }

        public Criteria andGuanlijigouLessThanOrEqualTo(Object value) {
            addCriterion("GUANLIJIGOU <=", value, "guanlijigou");
            return (Criteria) this;
        }

        public Criteria andGuanlijigouIn(List<Object> values) {
            addCriterion("GUANLIJIGOU in", values, "guanlijigou");
            return (Criteria) this;
        }

        public Criteria andGuanlijigouNotIn(List<Object> values) {
            addCriterion("GUANLIJIGOU not in", values, "guanlijigou");
            return (Criteria) this;
        }

        public Criteria andGuanlijigouBetween(Object value1, Object value2) {
            addCriterion("GUANLIJIGOU between", value1, value2, "guanlijigou");
            return (Criteria) this;
        }

        public Criteria andGuanlijigouNotBetween(Object value1, Object value2) {
            addCriterion("GUANLIJIGOU not between", value1, value2, "guanlijigou");
            return (Criteria) this;
        }

        public Criteria andJigourenshuIsNull() {
            addCriterion("JIGOURENSHU is null");
            return (Criteria) this;
        }

        public Criteria andJigourenshuIsNotNull() {
            addCriterion("JIGOURENSHU is not null");
            return (Criteria) this;
        }

        public Criteria andJigourenshuEqualTo(Long value) {
            addCriterion("JIGOURENSHU =", value, "jigourenshu");
            return (Criteria) this;
        }

        public Criteria andJigourenshuNotEqualTo(Long value) {
            addCriterion("JIGOURENSHU <>", value, "jigourenshu");
            return (Criteria) this;
        }

        public Criteria andJigourenshuGreaterThan(Long value) {
            addCriterion("JIGOURENSHU >", value, "jigourenshu");
            return (Criteria) this;
        }

        public Criteria andJigourenshuGreaterThanOrEqualTo(Long value) {
            addCriterion("JIGOURENSHU >=", value, "jigourenshu");
            return (Criteria) this;
        }

        public Criteria andJigourenshuLessThan(Long value) {
            addCriterion("JIGOURENSHU <", value, "jigourenshu");
            return (Criteria) this;
        }

        public Criteria andJigourenshuLessThanOrEqualTo(Long value) {
            addCriterion("JIGOURENSHU <=", value, "jigourenshu");
            return (Criteria) this;
        }

        public Criteria andJigourenshuIn(List<Long> values) {
            addCriterion("JIGOURENSHU in", values, "jigourenshu");
            return (Criteria) this;
        }

        public Criteria andJigourenshuNotIn(List<Long> values) {
            addCriterion("JIGOURENSHU not in", values, "jigourenshu");
            return (Criteria) this;
        }

        public Criteria andJigourenshuBetween(Long value1, Long value2) {
            addCriterion("JIGOURENSHU between", value1, value2, "jigourenshu");
            return (Criteria) this;
        }

        public Criteria andJigourenshuNotBetween(Long value1, Long value2) {
            addCriterion("JIGOURENSHU not between", value1, value2, "jigourenshu");
            return (Criteria) this;
        }

        public Criteria andHuiyicishuIsNull() {
            addCriterion("HUIYICISHU is null");
            return (Criteria) this;
        }

        public Criteria andHuiyicishuIsNotNull() {
            addCriterion("HUIYICISHU is not null");
            return (Criteria) this;
        }

        public Criteria andHuiyicishuEqualTo(Long value) {
            addCriterion("HUIYICISHU =", value, "huiyicishu");
            return (Criteria) this;
        }

        public Criteria andHuiyicishuNotEqualTo(Long value) {
            addCriterion("HUIYICISHU <>", value, "huiyicishu");
            return (Criteria) this;
        }

        public Criteria andHuiyicishuGreaterThan(Long value) {
            addCriterion("HUIYICISHU >", value, "huiyicishu");
            return (Criteria) this;
        }

        public Criteria andHuiyicishuGreaterThanOrEqualTo(Long value) {
            addCriterion("HUIYICISHU >=", value, "huiyicishu");
            return (Criteria) this;
        }

        public Criteria andHuiyicishuLessThan(Long value) {
            addCriterion("HUIYICISHU <", value, "huiyicishu");
            return (Criteria) this;
        }

        public Criteria andHuiyicishuLessThanOrEqualTo(Long value) {
            addCriterion("HUIYICISHU <=", value, "huiyicishu");
            return (Criteria) this;
        }

        public Criteria andHuiyicishuIn(List<Long> values) {
            addCriterion("HUIYICISHU in", values, "huiyicishu");
            return (Criteria) this;
        }

        public Criteria andHuiyicishuNotIn(List<Long> values) {
            addCriterion("HUIYICISHU not in", values, "huiyicishu");
            return (Criteria) this;
        }

        public Criteria andHuiyicishuBetween(Long value1, Long value2) {
            addCriterion("HUIYICISHU between", value1, value2, "huiyicishu");
            return (Criteria) this;
        }

        public Criteria andHuiyicishuNotBetween(Long value1, Long value2) {
            addCriterion("HUIYICISHU not between", value1, value2, "huiyicishu");
            return (Criteria) this;
        }

        public Criteria andZijinlaiyuanIsNull() {
            addCriterion("ZIJINLAIYUAN is null");
            return (Criteria) this;
        }

        public Criteria andZijinlaiyuanIsNotNull() {
            addCriterion("ZIJINLAIYUAN is not null");
            return (Criteria) this;
        }

        public Criteria andZijinlaiyuanEqualTo(Object value) {
            addCriterion("ZIJINLAIYUAN =", value, "zijinlaiyuan");
            return (Criteria) this;
        }

        public Criteria andZijinlaiyuanNotEqualTo(Object value) {
            addCriterion("ZIJINLAIYUAN <>", value, "zijinlaiyuan");
            return (Criteria) this;
        }

        public Criteria andZijinlaiyuanGreaterThan(Object value) {
            addCriterion("ZIJINLAIYUAN >", value, "zijinlaiyuan");
            return (Criteria) this;
        }

        public Criteria andZijinlaiyuanGreaterThanOrEqualTo(Object value) {
            addCriterion("ZIJINLAIYUAN >=", value, "zijinlaiyuan");
            return (Criteria) this;
        }

        public Criteria andZijinlaiyuanLessThan(Object value) {
            addCriterion("ZIJINLAIYUAN <", value, "zijinlaiyuan");
            return (Criteria) this;
        }

        public Criteria andZijinlaiyuanLessThanOrEqualTo(Object value) {
            addCriterion("ZIJINLAIYUAN <=", value, "zijinlaiyuan");
            return (Criteria) this;
        }

        public Criteria andZijinlaiyuanIn(List<Object> values) {
            addCriterion("ZIJINLAIYUAN in", values, "zijinlaiyuan");
            return (Criteria) this;
        }

        public Criteria andZijinlaiyuanNotIn(List<Object> values) {
            addCriterion("ZIJINLAIYUAN not in", values, "zijinlaiyuan");
            return (Criteria) this;
        }

        public Criteria andZijinlaiyuanBetween(Object value1, Object value2) {
            addCriterion("ZIJINLAIYUAN between", value1, value2, "zijinlaiyuan");
            return (Criteria) this;
        }

        public Criteria andZijinlaiyuanNotBetween(Object value1, Object value2) {
            addCriterion("ZIJINLAIYUAN not between", value1, value2, "zijinlaiyuan");
            return (Criteria) this;
        }

        public Criteria andShifoufuheIsNull() {
            addCriterion("SHIFOUFUHE is null");
            return (Criteria) this;
        }

        public Criteria andShifoufuheIsNotNull() {
            addCriterion("SHIFOUFUHE is not null");
            return (Criteria) this;
        }

        public Criteria andShifoufuheEqualTo(Object value) {
            addCriterion("SHIFOUFUHE =", value, "shifoufuhe");
            return (Criteria) this;
        }

        public Criteria andShifoufuheNotEqualTo(Object value) {
            addCriterion("SHIFOUFUHE <>", value, "shifoufuhe");
            return (Criteria) this;
        }

        public Criteria andShifoufuheGreaterThan(Object value) {
            addCriterion("SHIFOUFUHE >", value, "shifoufuhe");
            return (Criteria) this;
        }

        public Criteria andShifoufuheGreaterThanOrEqualTo(Object value) {
            addCriterion("SHIFOUFUHE >=", value, "shifoufuhe");
            return (Criteria) this;
        }

        public Criteria andShifoufuheLessThan(Object value) {
            addCriterion("SHIFOUFUHE <", value, "shifoufuhe");
            return (Criteria) this;
        }

        public Criteria andShifoufuheLessThanOrEqualTo(Object value) {
            addCriterion("SHIFOUFUHE <=", value, "shifoufuhe");
            return (Criteria) this;
        }

        public Criteria andShifoufuheIn(List<Object> values) {
            addCriterion("SHIFOUFUHE in", values, "shifoufuhe");
            return (Criteria) this;
        }

        public Criteria andShifoufuheNotIn(List<Object> values) {
            addCriterion("SHIFOUFUHE not in", values, "shifoufuhe");
            return (Criteria) this;
        }

        public Criteria andShifoufuheBetween(Object value1, Object value2) {
            addCriterion("SHIFOUFUHE between", value1, value2, "shifoufuhe");
            return (Criteria) this;
        }

        public Criteria andShifoufuheNotBetween(Object value1, Object value2) {
            addCriterion("SHIFOUFUHE not between", value1, value2, "shifoufuhe");
            return (Criteria) this;
        }

        public Criteria andKzgymingchengIsNull() {
            addCriterion("KZGYMINGCHENG is null");
            return (Criteria) this;
        }

        public Criteria andKzgymingchengIsNotNull() {
            addCriterion("KZGYMINGCHENG is not null");
            return (Criteria) this;
        }

        public Criteria andKzgymingchengEqualTo(Object value) {
            addCriterion("KZGYMINGCHENG =", value, "kzgymingcheng");
            return (Criteria) this;
        }

        public Criteria andKzgymingchengNotEqualTo(Object value) {
            addCriterion("KZGYMINGCHENG <>", value, "kzgymingcheng");
            return (Criteria) this;
        }

        public Criteria andKzgymingchengGreaterThan(Object value) {
            addCriterion("KZGYMINGCHENG >", value, "kzgymingcheng");
            return (Criteria) this;
        }

        public Criteria andKzgymingchengGreaterThanOrEqualTo(Object value) {
            addCriterion("KZGYMINGCHENG >=", value, "kzgymingcheng");
            return (Criteria) this;
        }

        public Criteria andKzgymingchengLessThan(Object value) {
            addCriterion("KZGYMINGCHENG <", value, "kzgymingcheng");
            return (Criteria) this;
        }

        public Criteria andKzgymingchengLessThanOrEqualTo(Object value) {
            addCriterion("KZGYMINGCHENG <=", value, "kzgymingcheng");
            return (Criteria) this;
        }

        public Criteria andKzgymingchengIn(List<Object> values) {
            addCriterion("KZGYMINGCHENG in", values, "kzgymingcheng");
            return (Criteria) this;
        }

        public Criteria andKzgymingchengNotIn(List<Object> values) {
            addCriterion("KZGYMINGCHENG not in", values, "kzgymingcheng");
            return (Criteria) this;
        }

        public Criteria andKzgymingchengBetween(Object value1, Object value2) {
            addCriterion("KZGYMINGCHENG between", value1, value2, "kzgymingcheng");
            return (Criteria) this;
        }

        public Criteria andKzgymingchengNotBetween(Object value1, Object value2) {
            addCriterion("KZGYMINGCHENG not between", value1, value2, "kzgymingcheng");
            return (Criteria) this;
        }

        public Criteria andGkmeitiIsNull() {
            addCriterion("GKMEITI is null");
            return (Criteria) this;
        }

        public Criteria andGkmeitiIsNotNull() {
            addCriterion("GKMEITI is not null");
            return (Criteria) this;
        }

        public Criteria andGkmeitiEqualTo(Object value) {
            addCriterion("GKMEITI =", value, "gkmeiti");
            return (Criteria) this;
        }

        public Criteria andGkmeitiNotEqualTo(Object value) {
            addCriterion("GKMEITI <>", value, "gkmeiti");
            return (Criteria) this;
        }

        public Criteria andGkmeitiGreaterThan(Object value) {
            addCriterion("GKMEITI >", value, "gkmeiti");
            return (Criteria) this;
        }

        public Criteria andGkmeitiGreaterThanOrEqualTo(Object value) {
            addCriterion("GKMEITI >=", value, "gkmeiti");
            return (Criteria) this;
        }

        public Criteria andGkmeitiLessThan(Object value) {
            addCriterion("GKMEITI <", value, "gkmeiti");
            return (Criteria) this;
        }

        public Criteria andGkmeitiLessThanOrEqualTo(Object value) {
            addCriterion("GKMEITI <=", value, "gkmeiti");
            return (Criteria) this;
        }

        public Criteria andGkmeitiIn(List<Object> values) {
            addCriterion("GKMEITI in", values, "gkmeiti");
            return (Criteria) this;
        }

        public Criteria andGkmeitiNotIn(List<Object> values) {
            addCriterion("GKMEITI not in", values, "gkmeiti");
            return (Criteria) this;
        }

        public Criteria andGkmeitiBetween(Object value1, Object value2) {
            addCriterion("GKMEITI between", value1, value2, "gkmeiti");
            return (Criteria) this;
        }

        public Criteria andGkmeitiNotBetween(Object value1, Object value2) {
            addCriterion("GKMEITI not between", value1, value2, "gkmeiti");
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

        public Criteria andXuhaoEqualTo(Long value) {
            addCriterion("XUHAO =", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoNotEqualTo(Long value) {
            addCriterion("XUHAO <>", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoGreaterThan(Long value) {
            addCriterion("XUHAO >", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoGreaterThanOrEqualTo(Long value) {
            addCriterion("XUHAO >=", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoLessThan(Long value) {
            addCriterion("XUHAO <", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoLessThanOrEqualTo(Long value) {
            addCriterion("XUHAO <=", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoIn(List<Long> values) {
            addCriterion("XUHAO in", values, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoNotIn(List<Long> values) {
            addCriterion("XUHAO not in", values, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoBetween(Long value1, Long value2) {
            addCriterion("XUHAO between", value1, value2, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoNotBetween(Long value1, Long value2) {
            addCriterion("XUHAO not between", value1, value2, "xuhao");
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