package com.yonyou.scf.common.entity;

import java.util.ArrayList;
import java.util.List;

public class FddInfoChangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FddInfoChangeExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("customer_id like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("customer_id not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNull() {
            addCriterion("customer_type is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNotNull() {
            addCriterion("customer_type is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeEqualTo(Short value) {
            addCriterion("customer_type =", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotEqualTo(Short value) {
            addCriterion("customer_type <>", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThan(Short value) {
            addCriterion("customer_type >", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("customer_type >=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThan(Short value) {
            addCriterion("customer_type <", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThanOrEqualTo(Short value) {
            addCriterion("customer_type <=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIn(List<Short> values) {
            addCriterion("customer_type in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotIn(List<Short> values) {
            addCriterion("customer_type not in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeBetween(Short value1, Short value2) {
            addCriterion("customer_type between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotBetween(Short value1, Short value2) {
            addCriterion("customer_type not between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andEmailNewIsNull() {
            addCriterion("email_new is null");
            return (Criteria) this;
        }

        public Criteria andEmailNewIsNotNull() {
            addCriterion("email_new is not null");
            return (Criteria) this;
        }

        public Criteria andEmailNewEqualTo(String value) {
            addCriterion("email_new =", value, "emailNew");
            return (Criteria) this;
        }

        public Criteria andEmailNewNotEqualTo(String value) {
            addCriterion("email_new <>", value, "emailNew");
            return (Criteria) this;
        }

        public Criteria andEmailNewGreaterThan(String value) {
            addCriterion("email_new >", value, "emailNew");
            return (Criteria) this;
        }

        public Criteria andEmailNewGreaterThanOrEqualTo(String value) {
            addCriterion("email_new >=", value, "emailNew");
            return (Criteria) this;
        }

        public Criteria andEmailNewLessThan(String value) {
            addCriterion("email_new <", value, "emailNew");
            return (Criteria) this;
        }

        public Criteria andEmailNewLessThanOrEqualTo(String value) {
            addCriterion("email_new <=", value, "emailNew");
            return (Criteria) this;
        }

        public Criteria andEmailNewLike(String value) {
            addCriterion("email_new like", value, "emailNew");
            return (Criteria) this;
        }

        public Criteria andEmailNewNotLike(String value) {
            addCriterion("email_new not like", value, "emailNew");
            return (Criteria) this;
        }

        public Criteria andEmailNewIn(List<String> values) {
            addCriterion("email_new in", values, "emailNew");
            return (Criteria) this;
        }

        public Criteria andEmailNewNotIn(List<String> values) {
            addCriterion("email_new not in", values, "emailNew");
            return (Criteria) this;
        }

        public Criteria andEmailNewBetween(String value1, String value2) {
            addCriterion("email_new between", value1, value2, "emailNew");
            return (Criteria) this;
        }

        public Criteria andEmailNewNotBetween(String value1, String value2) {
            addCriterion("email_new not between", value1, value2, "emailNew");
            return (Criteria) this;
        }

        public Criteria andMobileNewIsNull() {
            addCriterion("mobile_new is null");
            return (Criteria) this;
        }

        public Criteria andMobileNewIsNotNull() {
            addCriterion("mobile_new is not null");
            return (Criteria) this;
        }

        public Criteria andMobileNewEqualTo(String value) {
            addCriterion("mobile_new =", value, "mobileNew");
            return (Criteria) this;
        }

        public Criteria andMobileNewNotEqualTo(String value) {
            addCriterion("mobile_new <>", value, "mobileNew");
            return (Criteria) this;
        }

        public Criteria andMobileNewGreaterThan(String value) {
            addCriterion("mobile_new >", value, "mobileNew");
            return (Criteria) this;
        }

        public Criteria andMobileNewGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_new >=", value, "mobileNew");
            return (Criteria) this;
        }

        public Criteria andMobileNewLessThan(String value) {
            addCriterion("mobile_new <", value, "mobileNew");
            return (Criteria) this;
        }

        public Criteria andMobileNewLessThanOrEqualTo(String value) {
            addCriterion("mobile_new <=", value, "mobileNew");
            return (Criteria) this;
        }

        public Criteria andMobileNewLike(String value) {
            addCriterion("mobile_new like", value, "mobileNew");
            return (Criteria) this;
        }

        public Criteria andMobileNewNotLike(String value) {
            addCriterion("mobile_new not like", value, "mobileNew");
            return (Criteria) this;
        }

        public Criteria andMobileNewIn(List<String> values) {
            addCriterion("mobile_new in", values, "mobileNew");
            return (Criteria) this;
        }

        public Criteria andMobileNewNotIn(List<String> values) {
            addCriterion("mobile_new not in", values, "mobileNew");
            return (Criteria) this;
        }

        public Criteria andMobileNewBetween(String value1, String value2) {
            addCriterion("mobile_new between", value1, value2, "mobileNew");
            return (Criteria) this;
        }

        public Criteria andMobileNewNotBetween(String value1, String value2) {
            addCriterion("mobile_new not between", value1, value2, "mobileNew");
            return (Criteria) this;
        }

        public Criteria andFddCustomerIdIsNull() {
            addCriterion("fdd_customer_id is null");
            return (Criteria) this;
        }

        public Criteria andFddCustomerIdIsNotNull() {
            addCriterion("fdd_customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andFddCustomerIdEqualTo(String value) {
            addCriterion("fdd_customer_id =", value, "fddCustomerId");
            return (Criteria) this;
        }

        public Criteria andFddCustomerIdNotEqualTo(String value) {
            addCriterion("fdd_customer_id <>", value, "fddCustomerId");
            return (Criteria) this;
        }

        public Criteria andFddCustomerIdGreaterThan(String value) {
            addCriterion("fdd_customer_id >", value, "fddCustomerId");
            return (Criteria) this;
        }

        public Criteria andFddCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("fdd_customer_id >=", value, "fddCustomerId");
            return (Criteria) this;
        }

        public Criteria andFddCustomerIdLessThan(String value) {
            addCriterion("fdd_customer_id <", value, "fddCustomerId");
            return (Criteria) this;
        }

        public Criteria andFddCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("fdd_customer_id <=", value, "fddCustomerId");
            return (Criteria) this;
        }

        public Criteria andFddCustomerIdLike(String value) {
            addCriterion("fdd_customer_id like", value, "fddCustomerId");
            return (Criteria) this;
        }

        public Criteria andFddCustomerIdNotLike(String value) {
            addCriterion("fdd_customer_id not like", value, "fddCustomerId");
            return (Criteria) this;
        }

        public Criteria andFddCustomerIdIn(List<String> values) {
            addCriterion("fdd_customer_id in", values, "fddCustomerId");
            return (Criteria) this;
        }

        public Criteria andFddCustomerIdNotIn(List<String> values) {
            addCriterion("fdd_customer_id not in", values, "fddCustomerId");
            return (Criteria) this;
        }

        public Criteria andFddCustomerIdBetween(String value1, String value2) {
            addCriterion("fdd_customer_id between", value1, value2, "fddCustomerId");
            return (Criteria) this;
        }

        public Criteria andFddCustomerIdNotBetween(String value1, String value2) {
            addCriterion("fdd_customer_id not between", value1, value2, "fddCustomerId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andFddResultIsNull() {
            addCriterion("fdd_result is null");
            return (Criteria) this;
        }

        public Criteria andFddResultIsNotNull() {
            addCriterion("fdd_result is not null");
            return (Criteria) this;
        }

        public Criteria andFddResultEqualTo(String value) {
            addCriterion("fdd_result =", value, "fddResult");
            return (Criteria) this;
        }

        public Criteria andFddResultNotEqualTo(String value) {
            addCriterion("fdd_result <>", value, "fddResult");
            return (Criteria) this;
        }

        public Criteria andFddResultGreaterThan(String value) {
            addCriterion("fdd_result >", value, "fddResult");
            return (Criteria) this;
        }

        public Criteria andFddResultGreaterThanOrEqualTo(String value) {
            addCriterion("fdd_result >=", value, "fddResult");
            return (Criteria) this;
        }

        public Criteria andFddResultLessThan(String value) {
            addCriterion("fdd_result <", value, "fddResult");
            return (Criteria) this;
        }

        public Criteria andFddResultLessThanOrEqualTo(String value) {
            addCriterion("fdd_result <=", value, "fddResult");
            return (Criteria) this;
        }

        public Criteria andFddResultLike(String value) {
            addCriterion("fdd_result like", value, "fddResult");
            return (Criteria) this;
        }

        public Criteria andFddResultNotLike(String value) {
            addCriterion("fdd_result not like", value, "fddResult");
            return (Criteria) this;
        }

        public Criteria andFddResultIn(List<String> values) {
            addCriterion("fdd_result in", values, "fddResult");
            return (Criteria) this;
        }

        public Criteria andFddResultNotIn(List<String> values) {
            addCriterion("fdd_result not in", values, "fddResult");
            return (Criteria) this;
        }

        public Criteria andFddResultBetween(String value1, String value2) {
            addCriterion("fdd_result between", value1, value2, "fddResult");
            return (Criteria) this;
        }

        public Criteria andFddResultNotBetween(String value1, String value2) {
            addCriterion("fdd_result not between", value1, value2, "fddResult");
            return (Criteria) this;
        }

        public Criteria andFddCodeIsNull() {
            addCriterion("fdd_code is null");
            return (Criteria) this;
        }

        public Criteria andFddCodeIsNotNull() {
            addCriterion("fdd_code is not null");
            return (Criteria) this;
        }

        public Criteria andFddCodeEqualTo(String value) {
            addCriterion("fdd_code =", value, "fddCode");
            return (Criteria) this;
        }

        public Criteria andFddCodeNotEqualTo(String value) {
            addCriterion("fdd_code <>", value, "fddCode");
            return (Criteria) this;
        }

        public Criteria andFddCodeGreaterThan(String value) {
            addCriterion("fdd_code >", value, "fddCode");
            return (Criteria) this;
        }

        public Criteria andFddCodeGreaterThanOrEqualTo(String value) {
            addCriterion("fdd_code >=", value, "fddCode");
            return (Criteria) this;
        }

        public Criteria andFddCodeLessThan(String value) {
            addCriterion("fdd_code <", value, "fddCode");
            return (Criteria) this;
        }

        public Criteria andFddCodeLessThanOrEqualTo(String value) {
            addCriterion("fdd_code <=", value, "fddCode");
            return (Criteria) this;
        }

        public Criteria andFddCodeLike(String value) {
            addCriterion("fdd_code like", value, "fddCode");
            return (Criteria) this;
        }

        public Criteria andFddCodeNotLike(String value) {
            addCriterion("fdd_code not like", value, "fddCode");
            return (Criteria) this;
        }

        public Criteria andFddCodeIn(List<String> values) {
            addCriterion("fdd_code in", values, "fddCode");
            return (Criteria) this;
        }

        public Criteria andFddCodeNotIn(List<String> values) {
            addCriterion("fdd_code not in", values, "fddCode");
            return (Criteria) this;
        }

        public Criteria andFddCodeBetween(String value1, String value2) {
            addCriterion("fdd_code between", value1, value2, "fddCode");
            return (Criteria) this;
        }

        public Criteria andFddCodeNotBetween(String value1, String value2) {
            addCriterion("fdd_code not between", value1, value2, "fddCode");
            return (Criteria) this;
        }

        public Criteria andFddMsgIsNull() {
            addCriterion("fdd_msg is null");
            return (Criteria) this;
        }

        public Criteria andFddMsgIsNotNull() {
            addCriterion("fdd_msg is not null");
            return (Criteria) this;
        }

        public Criteria andFddMsgEqualTo(String value) {
            addCriterion("fdd_msg =", value, "fddMsg");
            return (Criteria) this;
        }

        public Criteria andFddMsgNotEqualTo(String value) {
            addCriterion("fdd_msg <>", value, "fddMsg");
            return (Criteria) this;
        }

        public Criteria andFddMsgGreaterThan(String value) {
            addCriterion("fdd_msg >", value, "fddMsg");
            return (Criteria) this;
        }

        public Criteria andFddMsgGreaterThanOrEqualTo(String value) {
            addCriterion("fdd_msg >=", value, "fddMsg");
            return (Criteria) this;
        }

        public Criteria andFddMsgLessThan(String value) {
            addCriterion("fdd_msg <", value, "fddMsg");
            return (Criteria) this;
        }

        public Criteria andFddMsgLessThanOrEqualTo(String value) {
            addCriterion("fdd_msg <=", value, "fddMsg");
            return (Criteria) this;
        }

        public Criteria andFddMsgLike(String value) {
            addCriterion("fdd_msg like", value, "fddMsg");
            return (Criteria) this;
        }

        public Criteria andFddMsgNotLike(String value) {
            addCriterion("fdd_msg not like", value, "fddMsg");
            return (Criteria) this;
        }

        public Criteria andFddMsgIn(List<String> values) {
            addCriterion("fdd_msg in", values, "fddMsg");
            return (Criteria) this;
        }

        public Criteria andFddMsgNotIn(List<String> values) {
            addCriterion("fdd_msg not in", values, "fddMsg");
            return (Criteria) this;
        }

        public Criteria andFddMsgBetween(String value1, String value2) {
            addCriterion("fdd_msg between", value1, value2, "fddMsg");
            return (Criteria) this;
        }

        public Criteria andFddMsgNotBetween(String value1, String value2) {
            addCriterion("fdd_msg not between", value1, value2, "fddMsg");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(Long value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(Long value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(Long value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(Long value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(Long value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(Long value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<Long> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<Long> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(Long value1, Long value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(Long value1, Long value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("update_time like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("update_time not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(Long value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(Long value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(Long value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(Long value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(Long value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(Long value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<Long> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<Long> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(Long value1, Long value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(Long value1, Long value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlIsNull() {
            addCriterion("callback_url is null");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlIsNotNull() {
            addCriterion("callback_url is not null");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlEqualTo(String value) {
            addCriterion("callback_url =", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlNotEqualTo(String value) {
            addCriterion("callback_url <>", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlGreaterThan(String value) {
            addCriterion("callback_url >", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlGreaterThanOrEqualTo(String value) {
            addCriterion("callback_url >=", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlLessThan(String value) {
            addCriterion("callback_url <", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlLessThanOrEqualTo(String value) {
            addCriterion("callback_url <=", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlLike(String value) {
            addCriterion("callback_url like", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlNotLike(String value) {
            addCriterion("callback_url not like", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlIn(List<String> values) {
            addCriterion("callback_url in", values, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlNotIn(List<String> values) {
            addCriterion("callback_url not in", values, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlBetween(String value1, String value2) {
            addCriterion("callback_url between", value1, value2, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlNotBetween(String value1, String value2) {
            addCriterion("callback_url not between", value1, value2, "callbackUrl");
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