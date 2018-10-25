package com.meeting.pojo;

import java.util.ArrayList;
import java.util.List;

public class HoteltypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HoteltypeExample() {
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

        public Criteria andHtnumIsNull() {
            addCriterion("htnum is null");
            return (Criteria) this;
        }

        public Criteria andHtnumIsNotNull() {
            addCriterion("htnum is not null");
            return (Criteria) this;
        }

        public Criteria andHtnumEqualTo(Integer value) {
            addCriterion("htnum =", value, "htnum");
            return (Criteria) this;
        }

        public Criteria andHtnumNotEqualTo(Integer value) {
            addCriterion("htnum <>", value, "htnum");
            return (Criteria) this;
        }

        public Criteria andHtnumGreaterThan(Integer value) {
            addCriterion("htnum >", value, "htnum");
            return (Criteria) this;
        }

        public Criteria andHtnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("htnum >=", value, "htnum");
            return (Criteria) this;
        }

        public Criteria andHtnumLessThan(Integer value) {
            addCriterion("htnum <", value, "htnum");
            return (Criteria) this;
        }

        public Criteria andHtnumLessThanOrEqualTo(Integer value) {
            addCriterion("htnum <=", value, "htnum");
            return (Criteria) this;
        }

        public Criteria andHtnumIn(List<Integer> values) {
            addCriterion("htnum in", values, "htnum");
            return (Criteria) this;
        }

        public Criteria andHtnumNotIn(List<Integer> values) {
            addCriterion("htnum not in", values, "htnum");
            return (Criteria) this;
        }

        public Criteria andHtnumBetween(Integer value1, Integer value2) {
            addCriterion("htnum between", value1, value2, "htnum");
            return (Criteria) this;
        }

        public Criteria andHtnumNotBetween(Integer value1, Integer value2) {
            addCriterion("htnum not between", value1, value2, "htnum");
            return (Criteria) this;
        }

        public Criteria andMnumIsNull() {
            addCriterion("mnum is null");
            return (Criteria) this;
        }

        public Criteria andMnumIsNotNull() {
            addCriterion("mnum is not null");
            return (Criteria) this;
        }

        public Criteria andMnumEqualTo(Long value) {
            addCriterion("mnum =", value, "mnum");
            return (Criteria) this;
        }

        public Criteria andMnumNotEqualTo(Long value) {
            addCriterion("mnum <>", value, "mnum");
            return (Criteria) this;
        }

        public Criteria andMnumGreaterThan(Long value) {
            addCriterion("mnum >", value, "mnum");
            return (Criteria) this;
        }

        public Criteria andMnumGreaterThanOrEqualTo(Long value) {
            addCriterion("mnum >=", value, "mnum");
            return (Criteria) this;
        }

        public Criteria andMnumLessThan(Long value) {
            addCriterion("mnum <", value, "mnum");
            return (Criteria) this;
        }

        public Criteria andMnumLessThanOrEqualTo(Long value) {
            addCriterion("mnum <=", value, "mnum");
            return (Criteria) this;
        }

        public Criteria andMnumIn(List<Long> values) {
            addCriterion("mnum in", values, "mnum");
            return (Criteria) this;
        }

        public Criteria andMnumNotIn(List<Long> values) {
            addCriterion("mnum not in", values, "mnum");
            return (Criteria) this;
        }

        public Criteria andMnumBetween(Long value1, Long value2) {
            addCriterion("mnum between", value1, value2, "mnum");
            return (Criteria) this;
        }

        public Criteria andMnumNotBetween(Long value1, Long value2) {
            addCriterion("mnum not between", value1, value2, "mnum");
            return (Criteria) this;
        }

        public Criteria andHttimeIsNull() {
            addCriterion("httime is null");
            return (Criteria) this;
        }

        public Criteria andHttimeIsNotNull() {
            addCriterion("httime is not null");
            return (Criteria) this;
        }

        public Criteria andHttimeEqualTo(String value) {
            addCriterion("httime =", value, "httime");
            return (Criteria) this;
        }

        public Criteria andHttimeNotEqualTo(String value) {
            addCriterion("httime <>", value, "httime");
            return (Criteria) this;
        }

        public Criteria andHttimeGreaterThan(String value) {
            addCriterion("httime >", value, "httime");
            return (Criteria) this;
        }

        public Criteria andHttimeGreaterThanOrEqualTo(String value) {
            addCriterion("httime >=", value, "httime");
            return (Criteria) this;
        }

        public Criteria andHttimeLessThan(String value) {
            addCriterion("httime <", value, "httime");
            return (Criteria) this;
        }

        public Criteria andHttimeLessThanOrEqualTo(String value) {
            addCriterion("httime <=", value, "httime");
            return (Criteria) this;
        }

        public Criteria andHttimeLike(String value) {
            addCriterion("httime like", value, "httime");
            return (Criteria) this;
        }

        public Criteria andHttimeNotLike(String value) {
            addCriterion("httime not like", value, "httime");
            return (Criteria) this;
        }

        public Criteria andHttimeIn(List<String> values) {
            addCriterion("httime in", values, "httime");
            return (Criteria) this;
        }

        public Criteria andHttimeNotIn(List<String> values) {
            addCriterion("httime not in", values, "httime");
            return (Criteria) this;
        }

        public Criteria andHttimeBetween(String value1, String value2) {
            addCriterion("httime between", value1, value2, "httime");
            return (Criteria) this;
        }

        public Criteria andHttimeNotBetween(String value1, String value2) {
            addCriterion("httime not between", value1, value2, "httime");
            return (Criteria) this;
        }

        public Criteria andEtplaceIsNull() {
            addCriterion("etplace is null");
            return (Criteria) this;
        }

        public Criteria andEtplaceIsNotNull() {
            addCriterion("etplace is not null");
            return (Criteria) this;
        }

        public Criteria andEtplaceEqualTo(String value) {
            addCriterion("etplace =", value, "etplace");
            return (Criteria) this;
        }

        public Criteria andEtplaceNotEqualTo(String value) {
            addCriterion("etplace <>", value, "etplace");
            return (Criteria) this;
        }

        public Criteria andEtplaceGreaterThan(String value) {
            addCriterion("etplace >", value, "etplace");
            return (Criteria) this;
        }

        public Criteria andEtplaceGreaterThanOrEqualTo(String value) {
            addCriterion("etplace >=", value, "etplace");
            return (Criteria) this;
        }

        public Criteria andEtplaceLessThan(String value) {
            addCriterion("etplace <", value, "etplace");
            return (Criteria) this;
        }

        public Criteria andEtplaceLessThanOrEqualTo(String value) {
            addCriterion("etplace <=", value, "etplace");
            return (Criteria) this;
        }

        public Criteria andEtplaceLike(String value) {
            addCriterion("etplace like", value, "etplace");
            return (Criteria) this;
        }

        public Criteria andEtplaceNotLike(String value) {
            addCriterion("etplace not like", value, "etplace");
            return (Criteria) this;
        }

        public Criteria andEtplaceIn(List<String> values) {
            addCriterion("etplace in", values, "etplace");
            return (Criteria) this;
        }

        public Criteria andEtplaceNotIn(List<String> values) {
            addCriterion("etplace not in", values, "etplace");
            return (Criteria) this;
        }

        public Criteria andEtplaceBetween(String value1, String value2) {
            addCriterion("etplace between", value1, value2, "etplace");
            return (Criteria) this;
        }

        public Criteria andEtplaceNotBetween(String value1, String value2) {
            addCriterion("etplace not between", value1, value2, "etplace");
            return (Criteria) this;
        }

        public Criteria andEttypeIsNull() {
            addCriterion("ettype is null");
            return (Criteria) this;
        }

        public Criteria andEttypeIsNotNull() {
            addCriterion("ettype is not null");
            return (Criteria) this;
        }

        public Criteria andEttypeEqualTo(String value) {
            addCriterion("ettype =", value, "ettype");
            return (Criteria) this;
        }

        public Criteria andEttypeNotEqualTo(String value) {
            addCriterion("ettype <>", value, "ettype");
            return (Criteria) this;
        }

        public Criteria andEttypeGreaterThan(String value) {
            addCriterion("ettype >", value, "ettype");
            return (Criteria) this;
        }

        public Criteria andEttypeGreaterThanOrEqualTo(String value) {
            addCriterion("ettype >=", value, "ettype");
            return (Criteria) this;
        }

        public Criteria andEttypeLessThan(String value) {
            addCriterion("ettype <", value, "ettype");
            return (Criteria) this;
        }

        public Criteria andEttypeLessThanOrEqualTo(String value) {
            addCriterion("ettype <=", value, "ettype");
            return (Criteria) this;
        }

        public Criteria andEttypeLike(String value) {
            addCriterion("ettype like", value, "ettype");
            return (Criteria) this;
        }

        public Criteria andEttypeNotLike(String value) {
            addCriterion("ettype not like", value, "ettype");
            return (Criteria) this;
        }

        public Criteria andEttypeIn(List<String> values) {
            addCriterion("ettype in", values, "ettype");
            return (Criteria) this;
        }

        public Criteria andEttypeNotIn(List<String> values) {
            addCriterion("ettype not in", values, "ettype");
            return (Criteria) this;
        }

        public Criteria andEttypeBetween(String value1, String value2) {
            addCriterion("ettype between", value1, value2, "ettype");
            return (Criteria) this;
        }

        public Criteria andEttypeNotBetween(String value1, String value2) {
            addCriterion("ettype not between", value1, value2, "ettype");
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