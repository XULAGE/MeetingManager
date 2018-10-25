package com.meeting.pojo;

import java.util.ArrayList;
import java.util.List;

public class HotelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HotelExample() {
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

        public Criteria andHnumIsNull() {
            addCriterion("hnum is null");
            return (Criteria) this;
        }

        public Criteria andHnumIsNotNull() {
            addCriterion("hnum is not null");
            return (Criteria) this;
        }

        public Criteria andHnumEqualTo(Integer value) {
            addCriterion("hnum =", value, "hnum");
            return (Criteria) this;
        }

        public Criteria andHnumNotEqualTo(Integer value) {
            addCriterion("hnum <>", value, "hnum");
            return (Criteria) this;
        }

        public Criteria andHnumGreaterThan(Integer value) {
            addCriterion("hnum >", value, "hnum");
            return (Criteria) this;
        }

        public Criteria andHnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("hnum >=", value, "hnum");
            return (Criteria) this;
        }

        public Criteria andHnumLessThan(Integer value) {
            addCriterion("hnum <", value, "hnum");
            return (Criteria) this;
        }

        public Criteria andHnumLessThanOrEqualTo(Integer value) {
            addCriterion("hnum <=", value, "hnum");
            return (Criteria) this;
        }

        public Criteria andHnumIn(List<Integer> values) {
            addCriterion("hnum in", values, "hnum");
            return (Criteria) this;
        }

        public Criteria andHnumNotIn(List<Integer> values) {
            addCriterion("hnum not in", values, "hnum");
            return (Criteria) this;
        }

        public Criteria andHnumBetween(Integer value1, Integer value2) {
            addCriterion("hnum between", value1, value2, "hnum");
            return (Criteria) this;
        }

        public Criteria andHnumNotBetween(Integer value1, Integer value2) {
            addCriterion("hnum not between", value1, value2, "hnum");
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

        public Criteria andPnumIsNull() {
            addCriterion("pnum is null");
            return (Criteria) this;
        }

        public Criteria andPnumIsNotNull() {
            addCriterion("pnum is not null");
            return (Criteria) this;
        }

        public Criteria andPnumEqualTo(Integer value) {
            addCriterion("pnum =", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumNotEqualTo(Integer value) {
            addCriterion("pnum <>", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumGreaterThan(Integer value) {
            addCriterion("pnum >", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("pnum >=", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumLessThan(Integer value) {
            addCriterion("pnum <", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumLessThanOrEqualTo(Integer value) {
            addCriterion("pnum <=", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumIn(List<Integer> values) {
            addCriterion("pnum in", values, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumNotIn(List<Integer> values) {
            addCriterion("pnum not in", values, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumBetween(Integer value1, Integer value2) {
            addCriterion("pnum between", value1, value2, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumNotBetween(Integer value1, Integer value2) {
            addCriterion("pnum not between", value1, value2, "pnum");
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