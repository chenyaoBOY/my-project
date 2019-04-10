package com.sfbest.order.management.vo;

import java.util.ArrayList;
import java.util.List;

public class GshopReturnsActiveGiftExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GshopReturnsActiveGiftExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderActiveIdIsNull() {
            addCriterion("order_active_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderActiveIdIsNotNull() {
            addCriterion("order_active_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderActiveIdEqualTo(Integer value) {
            addCriterion("order_active_id =", value, "orderActiveId");
            return (Criteria) this;
        }

        public Criteria andOrderActiveIdNotEqualTo(Integer value) {
            addCriterion("order_active_id <>", value, "orderActiveId");
            return (Criteria) this;
        }

        public Criteria andOrderActiveIdGreaterThan(Integer value) {
            addCriterion("order_active_id >", value, "orderActiveId");
            return (Criteria) this;
        }

        public Criteria andOrderActiveIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_active_id >=", value, "orderActiveId");
            return (Criteria) this;
        }

        public Criteria andOrderActiveIdLessThan(Integer value) {
            addCriterion("order_active_id <", value, "orderActiveId");
            return (Criteria) this;
        }

        public Criteria andOrderActiveIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_active_id <=", value, "orderActiveId");
            return (Criteria) this;
        }

        public Criteria andOrderActiveIdIn(List<Integer> values) {
            addCriterion("order_active_id in", values, "orderActiveId");
            return (Criteria) this;
        }

        public Criteria andOrderActiveIdNotIn(List<Integer> values) {
            addCriterion("order_active_id not in", values, "orderActiveId");
            return (Criteria) this;
        }

        public Criteria andOrderActiveIdBetween(Integer value1, Integer value2) {
            addCriterion("order_active_id between", value1, value2, "orderActiveId");
            return (Criteria) this;
        }

        public Criteria andOrderActiveIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_active_id not between", value1, value2, "orderActiveId");
            return (Criteria) this;
        }

        public Criteria andOrderProductIdIsNull() {
            addCriterion("order_product_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderProductIdIsNotNull() {
            addCriterion("order_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderProductIdEqualTo(Integer value) {
            addCriterion("order_product_id =", value, "orderProductId");
            return (Criteria) this;
        }

        public Criteria andOrderProductIdNotEqualTo(Integer value) {
            addCriterion("order_product_id <>", value, "orderProductId");
            return (Criteria) this;
        }

        public Criteria andOrderProductIdGreaterThan(Integer value) {
            addCriterion("order_product_id >", value, "orderProductId");
            return (Criteria) this;
        }

        public Criteria andOrderProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_product_id >=", value, "orderProductId");
            return (Criteria) this;
        }

        public Criteria andOrderProductIdLessThan(Integer value) {
            addCriterion("order_product_id <", value, "orderProductId");
            return (Criteria) this;
        }

        public Criteria andOrderProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_product_id <=", value, "orderProductId");
            return (Criteria) this;
        }

        public Criteria andOrderProductIdIn(List<Integer> values) {
            addCriterion("order_product_id in", values, "orderProductId");
            return (Criteria) this;
        }

        public Criteria andOrderProductIdNotIn(List<Integer> values) {
            addCriterion("order_product_id not in", values, "orderProductId");
            return (Criteria) this;
        }

        public Criteria andOrderProductIdBetween(Integer value1, Integer value2) {
            addCriterion("order_product_id between", value1, value2, "orderProductId");
            return (Criteria) this;
        }

        public Criteria andOrderProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_product_id not between", value1, value2, "orderProductId");
            return (Criteria) this;
        }

        public Criteria andOrderProductNumIsNull() {
            addCriterion("order_product_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderProductNumIsNotNull() {
            addCriterion("order_product_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderProductNumEqualTo(Integer value) {
            addCriterion("order_product_num =", value, "orderProductNum");
            return (Criteria) this;
        }

        public Criteria andOrderProductNumNotEqualTo(Integer value) {
            addCriterion("order_product_num <>", value, "orderProductNum");
            return (Criteria) this;
        }

        public Criteria andOrderProductNumGreaterThan(Integer value) {
            addCriterion("order_product_num >", value, "orderProductNum");
            return (Criteria) this;
        }

        public Criteria andOrderProductNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_product_num >=", value, "orderProductNum");
            return (Criteria) this;
        }

        public Criteria andOrderProductNumLessThan(Integer value) {
            addCriterion("order_product_num <", value, "orderProductNum");
            return (Criteria) this;
        }

        public Criteria andOrderProductNumLessThanOrEqualTo(Integer value) {
            addCriterion("order_product_num <=", value, "orderProductNum");
            return (Criteria) this;
        }

        public Criteria andOrderProductNumIn(List<Integer> values) {
            addCriterion("order_product_num in", values, "orderProductNum");
            return (Criteria) this;
        }

        public Criteria andOrderProductNumNotIn(List<Integer> values) {
            addCriterion("order_product_num not in", values, "orderProductNum");
            return (Criteria) this;
        }

        public Criteria andOrderProductNumBetween(Integer value1, Integer value2) {
            addCriterion("order_product_num between", value1, value2, "orderProductNum");
            return (Criteria) this;
        }

        public Criteria andOrderProductNumNotBetween(Integer value1, Integer value2) {
            addCriterion("order_product_num not between", value1, value2, "orderProductNum");
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