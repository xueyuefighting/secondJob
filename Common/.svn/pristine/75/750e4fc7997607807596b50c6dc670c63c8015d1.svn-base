package com.yonyou.scf.common.entity;

import java.util.ArrayList;
import java.util.List;

public class InvoiceBillingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InvoiceBillingExample() {
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

        public Criteria andIbIdIsNull() {
            addCriterion("ib_id is null");
            return (Criteria) this;
        }

        public Criteria andIbIdIsNotNull() {
            addCriterion("ib_id is not null");
            return (Criteria) this;
        }

        public Criteria andIbIdEqualTo(Long value) {
            addCriterion("ib_id =", value, "ibId");
            return (Criteria) this;
        }

        public Criteria andIbIdNotEqualTo(Long value) {
            addCriterion("ib_id <>", value, "ibId");
            return (Criteria) this;
        }

        public Criteria andIbIdGreaterThan(Long value) {
            addCriterion("ib_id >", value, "ibId");
            return (Criteria) this;
        }

        public Criteria andIbIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ib_id >=", value, "ibId");
            return (Criteria) this;
        }

        public Criteria andIbIdLessThan(Long value) {
            addCriterion("ib_id <", value, "ibId");
            return (Criteria) this;
        }

        public Criteria andIbIdLessThanOrEqualTo(Long value) {
            addCriterion("ib_id <=", value, "ibId");
            return (Criteria) this;
        }

        public Criteria andIbIdIn(List<Long> values) {
            addCriterion("ib_id in", values, "ibId");
            return (Criteria) this;
        }

        public Criteria andIbIdNotIn(List<Long> values) {
            addCriterion("ib_id not in", values, "ibId");
            return (Criteria) this;
        }

        public Criteria andIbIdBetween(Long value1, Long value2) {
            addCriterion("ib_id between", value1, value2, "ibId");
            return (Criteria) this;
        }

        public Criteria andIbIdNotBetween(Long value1, Long value2) {
            addCriterion("ib_id not between", value1, value2, "ibId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdIsNull() {
            addCriterion("agency_id is null");
            return (Criteria) this;
        }

        public Criteria andAgencyIdIsNotNull() {
            addCriterion("agency_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyIdEqualTo(Long value) {
            addCriterion("agency_id =", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotEqualTo(Long value) {
            addCriterion("agency_id <>", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdGreaterThan(Long value) {
            addCriterion("agency_id >", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("agency_id >=", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdLessThan(Long value) {
            addCriterion("agency_id <", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdLessThanOrEqualTo(Long value) {
            addCriterion("agency_id <=", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdIn(List<Long> values) {
            addCriterion("agency_id in", values, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotIn(List<Long> values) {
            addCriterion("agency_id not in", values, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdBetween(Long value1, Long value2) {
            addCriterion("agency_id between", value1, value2, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotBetween(Long value1, Long value2) {
            addCriterion("agency_id not between", value1, value2, "agencyId");
            return (Criteria) this;
        }

        public Criteria andFinanceProductTypeIsNull() {
            addCriterion("finance_product_type is null");
            return (Criteria) this;
        }

        public Criteria andFinanceProductTypeIsNotNull() {
            addCriterion("finance_product_type is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceProductTypeEqualTo(String value) {
            addCriterion("finance_product_type =", value, "financeProductType");
            return (Criteria) this;
        }

        public Criteria andFinanceProductTypeNotEqualTo(String value) {
            addCriterion("finance_product_type <>", value, "financeProductType");
            return (Criteria) this;
        }

        public Criteria andFinanceProductTypeGreaterThan(String value) {
            addCriterion("finance_product_type >", value, "financeProductType");
            return (Criteria) this;
        }

        public Criteria andFinanceProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("finance_product_type >=", value, "financeProductType");
            return (Criteria) this;
        }

        public Criteria andFinanceProductTypeLessThan(String value) {
            addCriterion("finance_product_type <", value, "financeProductType");
            return (Criteria) this;
        }

        public Criteria andFinanceProductTypeLessThanOrEqualTo(String value) {
            addCriterion("finance_product_type <=", value, "financeProductType");
            return (Criteria) this;
        }

        public Criteria andFinanceProductTypeLike(String value) {
            addCriterion("finance_product_type like", value, "financeProductType");
            return (Criteria) this;
        }

        public Criteria andFinanceProductTypeNotLike(String value) {
            addCriterion("finance_product_type not like", value, "financeProductType");
            return (Criteria) this;
        }

        public Criteria andFinanceProductTypeIn(List<String> values) {
            addCriterion("finance_product_type in", values, "financeProductType");
            return (Criteria) this;
        }

        public Criteria andFinanceProductTypeNotIn(List<String> values) {
            addCriterion("finance_product_type not in", values, "financeProductType");
            return (Criteria) this;
        }

        public Criteria andFinanceProductTypeBetween(String value1, String value2) {
            addCriterion("finance_product_type between", value1, value2, "financeProductType");
            return (Criteria) this;
        }

        public Criteria andFinanceProductTypeNotBetween(String value1, String value2) {
            addCriterion("finance_product_type not between", value1, value2, "financeProductType");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Long value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Long value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Long value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Long value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Long value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Long> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Long> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Long value1, Long value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Long value1, Long value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductRateIsNull() {
            addCriterion("product_rate is null");
            return (Criteria) this;
        }

        public Criteria andProductRateIsNotNull() {
            addCriterion("product_rate is not null");
            return (Criteria) this;
        }

        public Criteria andProductRateEqualTo(Long value) {
            addCriterion("product_rate =", value, "productRate");
            return (Criteria) this;
        }

        public Criteria andProductRateNotEqualTo(Long value) {
            addCriterion("product_rate <>", value, "productRate");
            return (Criteria) this;
        }

        public Criteria andProductRateGreaterThan(Long value) {
            addCriterion("product_rate >", value, "productRate");
            return (Criteria) this;
        }

        public Criteria andProductRateGreaterThanOrEqualTo(Long value) {
            addCriterion("product_rate >=", value, "productRate");
            return (Criteria) this;
        }

        public Criteria andProductRateLessThan(Long value) {
            addCriterion("product_rate <", value, "productRate");
            return (Criteria) this;
        }

        public Criteria andProductRateLessThanOrEqualTo(Long value) {
            addCriterion("product_rate <=", value, "productRate");
            return (Criteria) this;
        }

        public Criteria andProductRateIn(List<Long> values) {
            addCriterion("product_rate in", values, "productRate");
            return (Criteria) this;
        }

        public Criteria andProductRateNotIn(List<Long> values) {
            addCriterion("product_rate not in", values, "productRate");
            return (Criteria) this;
        }

        public Criteria andProductRateBetween(Long value1, Long value2) {
            addCriterion("product_rate between", value1, value2, "productRate");
            return (Criteria) this;
        }

        public Criteria andProductRateNotBetween(Long value1, Long value2) {
            addCriterion("product_rate not between", value1, value2, "productRate");
            return (Criteria) this;
        }

        public Criteria andOverdueRateIsNull() {
            addCriterion("overdue_rate is null");
            return (Criteria) this;
        }

        public Criteria andOverdueRateIsNotNull() {
            addCriterion("overdue_rate is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueRateEqualTo(Long value) {
            addCriterion("overdue_rate =", value, "overdueRate");
            return (Criteria) this;
        }

        public Criteria andOverdueRateNotEqualTo(Long value) {
            addCriterion("overdue_rate <>", value, "overdueRate");
            return (Criteria) this;
        }

        public Criteria andOverdueRateGreaterThan(Long value) {
            addCriterion("overdue_rate >", value, "overdueRate");
            return (Criteria) this;
        }

        public Criteria andOverdueRateGreaterThanOrEqualTo(Long value) {
            addCriterion("overdue_rate >=", value, "overdueRate");
            return (Criteria) this;
        }

        public Criteria andOverdueRateLessThan(Long value) {
            addCriterion("overdue_rate <", value, "overdueRate");
            return (Criteria) this;
        }

        public Criteria andOverdueRateLessThanOrEqualTo(Long value) {
            addCriterion("overdue_rate <=", value, "overdueRate");
            return (Criteria) this;
        }

        public Criteria andOverdueRateIn(List<Long> values) {
            addCriterion("overdue_rate in", values, "overdueRate");
            return (Criteria) this;
        }

        public Criteria andOverdueRateNotIn(List<Long> values) {
            addCriterion("overdue_rate not in", values, "overdueRate");
            return (Criteria) this;
        }

        public Criteria andOverdueRateBetween(Long value1, Long value2) {
            addCriterion("overdue_rate between", value1, value2, "overdueRate");
            return (Criteria) this;
        }

        public Criteria andOverdueRateNotBetween(Long value1, Long value2) {
            addCriterion("overdue_rate not between", value1, value2, "overdueRate");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationNoIsNull() {
            addCriterion("financing_application_no is null");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationNoIsNotNull() {
            addCriterion("financing_application_no is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationNoEqualTo(Long value) {
            addCriterion("financing_application_no =", value, "financingApplicationNo");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationNoNotEqualTo(Long value) {
            addCriterion("financing_application_no <>", value, "financingApplicationNo");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationNoGreaterThan(Long value) {
            addCriterion("financing_application_no >", value, "financingApplicationNo");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationNoGreaterThanOrEqualTo(Long value) {
            addCriterion("financing_application_no >=", value, "financingApplicationNo");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationNoLessThan(Long value) {
            addCriterion("financing_application_no <", value, "financingApplicationNo");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationNoLessThanOrEqualTo(Long value) {
            addCriterion("financing_application_no <=", value, "financingApplicationNo");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationNoIn(List<Long> values) {
            addCriterion("financing_application_no in", values, "financingApplicationNo");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationNoNotIn(List<Long> values) {
            addCriterion("financing_application_no not in", values, "financingApplicationNo");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationNoBetween(Long value1, Long value2) {
            addCriterion("financing_application_no between", value1, value2, "financingApplicationNo");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationNoNotBetween(Long value1, Long value2) {
            addCriterion("financing_application_no not between", value1, value2, "financingApplicationNo");
            return (Criteria) this;
        }

        public Criteria andFinancingStartDateIsNull() {
            addCriterion("financing_start_date is null");
            return (Criteria) this;
        }

        public Criteria andFinancingStartDateIsNotNull() {
            addCriterion("financing_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingStartDateEqualTo(String value) {
            addCriterion("financing_start_date =", value, "financingStartDate");
            return (Criteria) this;
        }

        public Criteria andFinancingStartDateNotEqualTo(String value) {
            addCriterion("financing_start_date <>", value, "financingStartDate");
            return (Criteria) this;
        }

        public Criteria andFinancingStartDateGreaterThan(String value) {
            addCriterion("financing_start_date >", value, "financingStartDate");
            return (Criteria) this;
        }

        public Criteria andFinancingStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("financing_start_date >=", value, "financingStartDate");
            return (Criteria) this;
        }

        public Criteria andFinancingStartDateLessThan(String value) {
            addCriterion("financing_start_date <", value, "financingStartDate");
            return (Criteria) this;
        }

        public Criteria andFinancingStartDateLessThanOrEqualTo(String value) {
            addCriterion("financing_start_date <=", value, "financingStartDate");
            return (Criteria) this;
        }

        public Criteria andFinancingStartDateLike(String value) {
            addCriterion("financing_start_date like", value, "financingStartDate");
            return (Criteria) this;
        }

        public Criteria andFinancingStartDateNotLike(String value) {
            addCriterion("financing_start_date not like", value, "financingStartDate");
            return (Criteria) this;
        }

        public Criteria andFinancingStartDateIn(List<String> values) {
            addCriterion("financing_start_date in", values, "financingStartDate");
            return (Criteria) this;
        }

        public Criteria andFinancingStartDateNotIn(List<String> values) {
            addCriterion("financing_start_date not in", values, "financingStartDate");
            return (Criteria) this;
        }

        public Criteria andFinancingStartDateBetween(String value1, String value2) {
            addCriterion("financing_start_date between", value1, value2, "financingStartDate");
            return (Criteria) this;
        }

        public Criteria andFinancingStartDateNotBetween(String value1, String value2) {
            addCriterion("financing_start_date not between", value1, value2, "financingStartDate");
            return (Criteria) this;
        }

        public Criteria andFinancingEndDateIsNull() {
            addCriterion("financing_end_date is null");
            return (Criteria) this;
        }

        public Criteria andFinancingEndDateIsNotNull() {
            addCriterion("financing_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingEndDateEqualTo(String value) {
            addCriterion("financing_end_date =", value, "financingEndDate");
            return (Criteria) this;
        }

        public Criteria andFinancingEndDateNotEqualTo(String value) {
            addCriterion("financing_end_date <>", value, "financingEndDate");
            return (Criteria) this;
        }

        public Criteria andFinancingEndDateGreaterThan(String value) {
            addCriterion("financing_end_date >", value, "financingEndDate");
            return (Criteria) this;
        }

        public Criteria andFinancingEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("financing_end_date >=", value, "financingEndDate");
            return (Criteria) this;
        }

        public Criteria andFinancingEndDateLessThan(String value) {
            addCriterion("financing_end_date <", value, "financingEndDate");
            return (Criteria) this;
        }

        public Criteria andFinancingEndDateLessThanOrEqualTo(String value) {
            addCriterion("financing_end_date <=", value, "financingEndDate");
            return (Criteria) this;
        }

        public Criteria andFinancingEndDateLike(String value) {
            addCriterion("financing_end_date like", value, "financingEndDate");
            return (Criteria) this;
        }

        public Criteria andFinancingEndDateNotLike(String value) {
            addCriterion("financing_end_date not like", value, "financingEndDate");
            return (Criteria) this;
        }

        public Criteria andFinancingEndDateIn(List<String> values) {
            addCriterion("financing_end_date in", values, "financingEndDate");
            return (Criteria) this;
        }

        public Criteria andFinancingEndDateNotIn(List<String> values) {
            addCriterion("financing_end_date not in", values, "financingEndDate");
            return (Criteria) this;
        }

        public Criteria andFinancingEndDateBetween(String value1, String value2) {
            addCriterion("financing_end_date between", value1, value2, "financingEndDate");
            return (Criteria) this;
        }

        public Criteria andFinancingEndDateNotBetween(String value1, String value2) {
            addCriterion("financing_end_date not between", value1, value2, "financingEndDate");
            return (Criteria) this;
        }

        public Criteria andExtendStartDateIsNull() {
            addCriterion("extend_start_date is null");
            return (Criteria) this;
        }

        public Criteria andExtendStartDateIsNotNull() {
            addCriterion("extend_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andExtendStartDateEqualTo(String value) {
            addCriterion("extend_start_date =", value, "extendStartDate");
            return (Criteria) this;
        }

        public Criteria andExtendStartDateNotEqualTo(String value) {
            addCriterion("extend_start_date <>", value, "extendStartDate");
            return (Criteria) this;
        }

        public Criteria andExtendStartDateGreaterThan(String value) {
            addCriterion("extend_start_date >", value, "extendStartDate");
            return (Criteria) this;
        }

        public Criteria andExtendStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("extend_start_date >=", value, "extendStartDate");
            return (Criteria) this;
        }

        public Criteria andExtendStartDateLessThan(String value) {
            addCriterion("extend_start_date <", value, "extendStartDate");
            return (Criteria) this;
        }

        public Criteria andExtendStartDateLessThanOrEqualTo(String value) {
            addCriterion("extend_start_date <=", value, "extendStartDate");
            return (Criteria) this;
        }

        public Criteria andExtendStartDateLike(String value) {
            addCriterion("extend_start_date like", value, "extendStartDate");
            return (Criteria) this;
        }

        public Criteria andExtendStartDateNotLike(String value) {
            addCriterion("extend_start_date not like", value, "extendStartDate");
            return (Criteria) this;
        }

        public Criteria andExtendStartDateIn(List<String> values) {
            addCriterion("extend_start_date in", values, "extendStartDate");
            return (Criteria) this;
        }

        public Criteria andExtendStartDateNotIn(List<String> values) {
            addCriterion("extend_start_date not in", values, "extendStartDate");
            return (Criteria) this;
        }

        public Criteria andExtendStartDateBetween(String value1, String value2) {
            addCriterion("extend_start_date between", value1, value2, "extendStartDate");
            return (Criteria) this;
        }

        public Criteria andExtendStartDateNotBetween(String value1, String value2) {
            addCriterion("extend_start_date not between", value1, value2, "extendStartDate");
            return (Criteria) this;
        }

        public Criteria andExtendEndDateIsNull() {
            addCriterion("extend_end_date is null");
            return (Criteria) this;
        }

        public Criteria andExtendEndDateIsNotNull() {
            addCriterion("extend_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andExtendEndDateEqualTo(String value) {
            addCriterion("extend_end_date =", value, "extendEndDate");
            return (Criteria) this;
        }

        public Criteria andExtendEndDateNotEqualTo(String value) {
            addCriterion("extend_end_date <>", value, "extendEndDate");
            return (Criteria) this;
        }

        public Criteria andExtendEndDateGreaterThan(String value) {
            addCriterion("extend_end_date >", value, "extendEndDate");
            return (Criteria) this;
        }

        public Criteria andExtendEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("extend_end_date >=", value, "extendEndDate");
            return (Criteria) this;
        }

        public Criteria andExtendEndDateLessThan(String value) {
            addCriterion("extend_end_date <", value, "extendEndDate");
            return (Criteria) this;
        }

        public Criteria andExtendEndDateLessThanOrEqualTo(String value) {
            addCriterion("extend_end_date <=", value, "extendEndDate");
            return (Criteria) this;
        }

        public Criteria andExtendEndDateLike(String value) {
            addCriterion("extend_end_date like", value, "extendEndDate");
            return (Criteria) this;
        }

        public Criteria andExtendEndDateNotLike(String value) {
            addCriterion("extend_end_date not like", value, "extendEndDate");
            return (Criteria) this;
        }

        public Criteria andExtendEndDateIn(List<String> values) {
            addCriterion("extend_end_date in", values, "extendEndDate");
            return (Criteria) this;
        }

        public Criteria andExtendEndDateNotIn(List<String> values) {
            addCriterion("extend_end_date not in", values, "extendEndDate");
            return (Criteria) this;
        }

        public Criteria andExtendEndDateBetween(String value1, String value2) {
            addCriterion("extend_end_date between", value1, value2, "extendEndDate");
            return (Criteria) this;
        }

        public Criteria andExtendEndDateNotBetween(String value1, String value2) {
            addCriterion("extend_end_date not between", value1, value2, "extendEndDate");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNull() {
            addCriterion("loan_amount is null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNotNull() {
            addCriterion("loan_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountEqualTo(Long value) {
            addCriterion("loan_amount =", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotEqualTo(Long value) {
            addCriterion("loan_amount <>", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThan(Long value) {
            addCriterion("loan_amount >", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("loan_amount >=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThan(Long value) {
            addCriterion("loan_amount <", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThanOrEqualTo(Long value) {
            addCriterion("loan_amount <=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIn(List<Long> values) {
            addCriterion("loan_amount in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotIn(List<Long> values) {
            addCriterion("loan_amount not in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountBetween(Long value1, Long value2) {
            addCriterion("loan_amount between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotBetween(Long value1, Long value2) {
            addCriterion("loan_amount not between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNull() {
            addCriterion("principal is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNotNull() {
            addCriterion("principal is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalEqualTo(Long value) {
            addCriterion("principal =", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotEqualTo(Long value) {
            addCriterion("principal <>", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThan(Long value) {
            addCriterion("principal >", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThanOrEqualTo(Long value) {
            addCriterion("principal >=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThan(Long value) {
            addCriterion("principal <", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThanOrEqualTo(Long value) {
            addCriterion("principal <=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalIn(List<Long> values) {
            addCriterion("principal in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotIn(List<Long> values) {
            addCriterion("principal not in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalBetween(Long value1, Long value2) {
            addCriterion("principal between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotBetween(Long value1, Long value2) {
            addCriterion("principal not between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalAlreadyIsNull() {
            addCriterion("principal_already is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalAlreadyIsNotNull() {
            addCriterion("principal_already is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalAlreadyEqualTo(Long value) {
            addCriterion("principal_already =", value, "principalAlready");
            return (Criteria) this;
        }

        public Criteria andPrincipalAlreadyNotEqualTo(Long value) {
            addCriterion("principal_already <>", value, "principalAlready");
            return (Criteria) this;
        }

        public Criteria andPrincipalAlreadyGreaterThan(Long value) {
            addCriterion("principal_already >", value, "principalAlready");
            return (Criteria) this;
        }

        public Criteria andPrincipalAlreadyGreaterThanOrEqualTo(Long value) {
            addCriterion("principal_already >=", value, "principalAlready");
            return (Criteria) this;
        }

        public Criteria andPrincipalAlreadyLessThan(Long value) {
            addCriterion("principal_already <", value, "principalAlready");
            return (Criteria) this;
        }

        public Criteria andPrincipalAlreadyLessThanOrEqualTo(Long value) {
            addCriterion("principal_already <=", value, "principalAlready");
            return (Criteria) this;
        }

        public Criteria andPrincipalAlreadyIn(List<Long> values) {
            addCriterion("principal_already in", values, "principalAlready");
            return (Criteria) this;
        }

        public Criteria andPrincipalAlreadyNotIn(List<Long> values) {
            addCriterion("principal_already not in", values, "principalAlready");
            return (Criteria) this;
        }

        public Criteria andPrincipalAlreadyBetween(Long value1, Long value2) {
            addCriterion("principal_already between", value1, value2, "principalAlready");
            return (Criteria) this;
        }

        public Criteria andPrincipalAlreadyNotBetween(Long value1, Long value2) {
            addCriterion("principal_already not between", value1, value2, "principalAlready");
            return (Criteria) this;
        }

        public Criteria andInterestIsNull() {
            addCriterion("interest is null");
            return (Criteria) this;
        }

        public Criteria andInterestIsNotNull() {
            addCriterion("interest is not null");
            return (Criteria) this;
        }

        public Criteria andInterestEqualTo(Long value) {
            addCriterion("interest =", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotEqualTo(Long value) {
            addCriterion("interest <>", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThan(Long value) {
            addCriterion("interest >", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThanOrEqualTo(Long value) {
            addCriterion("interest >=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThan(Long value) {
            addCriterion("interest <", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThanOrEqualTo(Long value) {
            addCriterion("interest <=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestIn(List<Long> values) {
            addCriterion("interest in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotIn(List<Long> values) {
            addCriterion("interest not in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestBetween(Long value1, Long value2) {
            addCriterion("interest between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotBetween(Long value1, Long value2) {
            addCriterion("interest not between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestAlreadyIsNull() {
            addCriterion("interest_already is null");
            return (Criteria) this;
        }

        public Criteria andInterestAlreadyIsNotNull() {
            addCriterion("interest_already is not null");
            return (Criteria) this;
        }

        public Criteria andInterestAlreadyEqualTo(Long value) {
            addCriterion("interest_already =", value, "interestAlready");
            return (Criteria) this;
        }

        public Criteria andInterestAlreadyNotEqualTo(Long value) {
            addCriterion("interest_already <>", value, "interestAlready");
            return (Criteria) this;
        }

        public Criteria andInterestAlreadyGreaterThan(Long value) {
            addCriterion("interest_already >", value, "interestAlready");
            return (Criteria) this;
        }

        public Criteria andInterestAlreadyGreaterThanOrEqualTo(Long value) {
            addCriterion("interest_already >=", value, "interestAlready");
            return (Criteria) this;
        }

        public Criteria andInterestAlreadyLessThan(Long value) {
            addCriterion("interest_already <", value, "interestAlready");
            return (Criteria) this;
        }

        public Criteria andInterestAlreadyLessThanOrEqualTo(Long value) {
            addCriterion("interest_already <=", value, "interestAlready");
            return (Criteria) this;
        }

        public Criteria andInterestAlreadyIn(List<Long> values) {
            addCriterion("interest_already in", values, "interestAlready");
            return (Criteria) this;
        }

        public Criteria andInterestAlreadyNotIn(List<Long> values) {
            addCriterion("interest_already not in", values, "interestAlready");
            return (Criteria) this;
        }

        public Criteria andInterestAlreadyBetween(Long value1, Long value2) {
            addCriterion("interest_already between", value1, value2, "interestAlready");
            return (Criteria) this;
        }

        public Criteria andInterestAlreadyNotBetween(Long value1, Long value2) {
            addCriterion("interest_already not between", value1, value2, "interestAlready");
            return (Criteria) this;
        }

        public Criteria andServiceChargeIsNull() {
            addCriterion("service_charge is null");
            return (Criteria) this;
        }

        public Criteria andServiceChargeIsNotNull() {
            addCriterion("service_charge is not null");
            return (Criteria) this;
        }

        public Criteria andServiceChargeEqualTo(Long value) {
            addCriterion("service_charge =", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotEqualTo(Long value) {
            addCriterion("service_charge <>", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeGreaterThan(Long value) {
            addCriterion("service_charge >", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeGreaterThanOrEqualTo(Long value) {
            addCriterion("service_charge >=", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeLessThan(Long value) {
            addCriterion("service_charge <", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeLessThanOrEqualTo(Long value) {
            addCriterion("service_charge <=", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeIn(List<Long> values) {
            addCriterion("service_charge in", values, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotIn(List<Long> values) {
            addCriterion("service_charge not in", values, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeBetween(Long value1, Long value2) {
            addCriterion("service_charge between", value1, value2, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotBetween(Long value1, Long value2) {
            addCriterion("service_charge not between", value1, value2, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeAlreadyIsNull() {
            addCriterion("service_charge_already is null");
            return (Criteria) this;
        }

        public Criteria andServiceChargeAlreadyIsNotNull() {
            addCriterion("service_charge_already is not null");
            return (Criteria) this;
        }

        public Criteria andServiceChargeAlreadyEqualTo(Long value) {
            addCriterion("service_charge_already =", value, "serviceChargeAlready");
            return (Criteria) this;
        }

        public Criteria andServiceChargeAlreadyNotEqualTo(Long value) {
            addCriterion("service_charge_already <>", value, "serviceChargeAlready");
            return (Criteria) this;
        }

        public Criteria andServiceChargeAlreadyGreaterThan(Long value) {
            addCriterion("service_charge_already >", value, "serviceChargeAlready");
            return (Criteria) this;
        }

        public Criteria andServiceChargeAlreadyGreaterThanOrEqualTo(Long value) {
            addCriterion("service_charge_already >=", value, "serviceChargeAlready");
            return (Criteria) this;
        }

        public Criteria andServiceChargeAlreadyLessThan(Long value) {
            addCriterion("service_charge_already <", value, "serviceChargeAlready");
            return (Criteria) this;
        }

        public Criteria andServiceChargeAlreadyLessThanOrEqualTo(Long value) {
            addCriterion("service_charge_already <=", value, "serviceChargeAlready");
            return (Criteria) this;
        }

        public Criteria andServiceChargeAlreadyIn(List<Long> values) {
            addCriterion("service_charge_already in", values, "serviceChargeAlready");
            return (Criteria) this;
        }

        public Criteria andServiceChargeAlreadyNotIn(List<Long> values) {
            addCriterion("service_charge_already not in", values, "serviceChargeAlready");
            return (Criteria) this;
        }

        public Criteria andServiceChargeAlreadyBetween(Long value1, Long value2) {
            addCriterion("service_charge_already between", value1, value2, "serviceChargeAlready");
            return (Criteria) this;
        }

        public Criteria andServiceChargeAlreadyNotBetween(Long value1, Long value2) {
            addCriterion("service_charge_already not between", value1, value2, "serviceChargeAlready");
            return (Criteria) this;
        }

        public Criteria andRolloverInterestIsNull() {
            addCriterion("rollover_interest is null");
            return (Criteria) this;
        }

        public Criteria andRolloverInterestIsNotNull() {
            addCriterion("rollover_interest is not null");
            return (Criteria) this;
        }

        public Criteria andRolloverInterestEqualTo(Long value) {
            addCriterion("rollover_interest =", value, "rolloverInterest");
            return (Criteria) this;
        }

        public Criteria andRolloverInterestNotEqualTo(Long value) {
            addCriterion("rollover_interest <>", value, "rolloverInterest");
            return (Criteria) this;
        }

        public Criteria andRolloverInterestGreaterThan(Long value) {
            addCriterion("rollover_interest >", value, "rolloverInterest");
            return (Criteria) this;
        }

        public Criteria andRolloverInterestGreaterThanOrEqualTo(Long value) {
            addCriterion("rollover_interest >=", value, "rolloverInterest");
            return (Criteria) this;
        }

        public Criteria andRolloverInterestLessThan(Long value) {
            addCriterion("rollover_interest <", value, "rolloverInterest");
            return (Criteria) this;
        }

        public Criteria andRolloverInterestLessThanOrEqualTo(Long value) {
            addCriterion("rollover_interest <=", value, "rolloverInterest");
            return (Criteria) this;
        }

        public Criteria andRolloverInterestIn(List<Long> values) {
            addCriterion("rollover_interest in", values, "rolloverInterest");
            return (Criteria) this;
        }

        public Criteria andRolloverInterestNotIn(List<Long> values) {
            addCriterion("rollover_interest not in", values, "rolloverInterest");
            return (Criteria) this;
        }

        public Criteria andRolloverInterestBetween(Long value1, Long value2) {
            addCriterion("rollover_interest between", value1, value2, "rolloverInterest");
            return (Criteria) this;
        }

        public Criteria andRolloverInterestNotBetween(Long value1, Long value2) {
            addCriterion("rollover_interest not between", value1, value2, "rolloverInterest");
            return (Criteria) this;
        }

        public Criteria andRolloverInterestAlreadyIsNull() {
            addCriterion("rollover_interest_already is null");
            return (Criteria) this;
        }

        public Criteria andRolloverInterestAlreadyIsNotNull() {
            addCriterion("rollover_interest_already is not null");
            return (Criteria) this;
        }

        public Criteria andRolloverInterestAlreadyEqualTo(Long value) {
            addCriterion("rollover_interest_already =", value, "rolloverInterestAlready");
            return (Criteria) this;
        }

        public Criteria andRolloverInterestAlreadyNotEqualTo(Long value) {
            addCriterion("rollover_interest_already <>", value, "rolloverInterestAlready");
            return (Criteria) this;
        }

        public Criteria andRolloverInterestAlreadyGreaterThan(Long value) {
            addCriterion("rollover_interest_already >", value, "rolloverInterestAlready");
            return (Criteria) this;
        }

        public Criteria andRolloverInterestAlreadyGreaterThanOrEqualTo(Long value) {
            addCriterion("rollover_interest_already >=", value, "rolloverInterestAlready");
            return (Criteria) this;
        }

        public Criteria andRolloverInterestAlreadyLessThan(Long value) {
            addCriterion("rollover_interest_already <", value, "rolloverInterestAlready");
            return (Criteria) this;
        }

        public Criteria andRolloverInterestAlreadyLessThanOrEqualTo(Long value) {
            addCriterion("rollover_interest_already <=", value, "rolloverInterestAlready");
            return (Criteria) this;
        }

        public Criteria andRolloverInterestAlreadyIn(List<Long> values) {
            addCriterion("rollover_interest_already in", values, "rolloverInterestAlready");
            return (Criteria) this;
        }

        public Criteria andRolloverInterestAlreadyNotIn(List<Long> values) {
            addCriterion("rollover_interest_already not in", values, "rolloverInterestAlready");
            return (Criteria) this;
        }

        public Criteria andRolloverInterestAlreadyBetween(Long value1, Long value2) {
            addCriterion("rollover_interest_already between", value1, value2, "rolloverInterestAlready");
            return (Criteria) this;
        }

        public Criteria andRolloverInterestAlreadyNotBetween(Long value1, Long value2) {
            addCriterion("rollover_interest_already not between", value1, value2, "rolloverInterestAlready");
            return (Criteria) this;
        }

        public Criteria andExtensionServiceFeeIsNull() {
            addCriterion("extension_service_fee is null");
            return (Criteria) this;
        }

        public Criteria andExtensionServiceFeeIsNotNull() {
            addCriterion("extension_service_fee is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionServiceFeeEqualTo(Long value) {
            addCriterion("extension_service_fee =", value, "extensionServiceFee");
            return (Criteria) this;
        }

        public Criteria andExtensionServiceFeeNotEqualTo(Long value) {
            addCriterion("extension_service_fee <>", value, "extensionServiceFee");
            return (Criteria) this;
        }

        public Criteria andExtensionServiceFeeGreaterThan(Long value) {
            addCriterion("extension_service_fee >", value, "extensionServiceFee");
            return (Criteria) this;
        }

        public Criteria andExtensionServiceFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("extension_service_fee >=", value, "extensionServiceFee");
            return (Criteria) this;
        }

        public Criteria andExtensionServiceFeeLessThan(Long value) {
            addCriterion("extension_service_fee <", value, "extensionServiceFee");
            return (Criteria) this;
        }

        public Criteria andExtensionServiceFeeLessThanOrEqualTo(Long value) {
            addCriterion("extension_service_fee <=", value, "extensionServiceFee");
            return (Criteria) this;
        }

        public Criteria andExtensionServiceFeeIn(List<Long> values) {
            addCriterion("extension_service_fee in", values, "extensionServiceFee");
            return (Criteria) this;
        }

        public Criteria andExtensionServiceFeeNotIn(List<Long> values) {
            addCriterion("extension_service_fee not in", values, "extensionServiceFee");
            return (Criteria) this;
        }

        public Criteria andExtensionServiceFeeBetween(Long value1, Long value2) {
            addCriterion("extension_service_fee between", value1, value2, "extensionServiceFee");
            return (Criteria) this;
        }

        public Criteria andExtensionServiceFeeNotBetween(Long value1, Long value2) {
            addCriterion("extension_service_fee not between", value1, value2, "extensionServiceFee");
            return (Criteria) this;
        }

        public Criteria andExtensionServiceFeeAlreadyIsNull() {
            addCriterion("extension_service_fee_already is null");
            return (Criteria) this;
        }

        public Criteria andExtensionServiceFeeAlreadyIsNotNull() {
            addCriterion("extension_service_fee_already is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionServiceFeeAlreadyEqualTo(Long value) {
            addCriterion("extension_service_fee_already =", value, "extensionServiceFeeAlready");
            return (Criteria) this;
        }

        public Criteria andExtensionServiceFeeAlreadyNotEqualTo(Long value) {
            addCriterion("extension_service_fee_already <>", value, "extensionServiceFeeAlready");
            return (Criteria) this;
        }

        public Criteria andExtensionServiceFeeAlreadyGreaterThan(Long value) {
            addCriterion("extension_service_fee_already >", value, "extensionServiceFeeAlready");
            return (Criteria) this;
        }

        public Criteria andExtensionServiceFeeAlreadyGreaterThanOrEqualTo(Long value) {
            addCriterion("extension_service_fee_already >=", value, "extensionServiceFeeAlready");
            return (Criteria) this;
        }

        public Criteria andExtensionServiceFeeAlreadyLessThan(Long value) {
            addCriterion("extension_service_fee_already <", value, "extensionServiceFeeAlready");
            return (Criteria) this;
        }

        public Criteria andExtensionServiceFeeAlreadyLessThanOrEqualTo(Long value) {
            addCriterion("extension_service_fee_already <=", value, "extensionServiceFeeAlready");
            return (Criteria) this;
        }

        public Criteria andExtensionServiceFeeAlreadyIn(List<Long> values) {
            addCriterion("extension_service_fee_already in", values, "extensionServiceFeeAlready");
            return (Criteria) this;
        }

        public Criteria andExtensionServiceFeeAlreadyNotIn(List<Long> values) {
            addCriterion("extension_service_fee_already not in", values, "extensionServiceFeeAlready");
            return (Criteria) this;
        }

        public Criteria andExtensionServiceFeeAlreadyBetween(Long value1, Long value2) {
            addCriterion("extension_service_fee_already between", value1, value2, "extensionServiceFeeAlready");
            return (Criteria) this;
        }

        public Criteria andExtensionServiceFeeAlreadyNotBetween(Long value1, Long value2) {
            addCriterion("extension_service_fee_already not between", value1, value2, "extensionServiceFeeAlready");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestIsNull() {
            addCriterion("overdue_interest is null");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestIsNotNull() {
            addCriterion("overdue_interest is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestEqualTo(Long value) {
            addCriterion("overdue_interest =", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestNotEqualTo(Long value) {
            addCriterion("overdue_interest <>", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestGreaterThan(Long value) {
            addCriterion("overdue_interest >", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestGreaterThanOrEqualTo(Long value) {
            addCriterion("overdue_interest >=", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestLessThan(Long value) {
            addCriterion("overdue_interest <", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestLessThanOrEqualTo(Long value) {
            addCriterion("overdue_interest <=", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestIn(List<Long> values) {
            addCriterion("overdue_interest in", values, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestNotIn(List<Long> values) {
            addCriterion("overdue_interest not in", values, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestBetween(Long value1, Long value2) {
            addCriterion("overdue_interest between", value1, value2, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestNotBetween(Long value1, Long value2) {
            addCriterion("overdue_interest not between", value1, value2, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestAlreadyIsNull() {
            addCriterion("overdue_interest_already is null");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestAlreadyIsNotNull() {
            addCriterion("overdue_interest_already is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestAlreadyEqualTo(Long value) {
            addCriterion("overdue_interest_already =", value, "overdueInterestAlready");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestAlreadyNotEqualTo(Long value) {
            addCriterion("overdue_interest_already <>", value, "overdueInterestAlready");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestAlreadyGreaterThan(Long value) {
            addCriterion("overdue_interest_already >", value, "overdueInterestAlready");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestAlreadyGreaterThanOrEqualTo(Long value) {
            addCriterion("overdue_interest_already >=", value, "overdueInterestAlready");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestAlreadyLessThan(Long value) {
            addCriterion("overdue_interest_already <", value, "overdueInterestAlready");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestAlreadyLessThanOrEqualTo(Long value) {
            addCriterion("overdue_interest_already <=", value, "overdueInterestAlready");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestAlreadyIn(List<Long> values) {
            addCriterion("overdue_interest_already in", values, "overdueInterestAlready");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestAlreadyNotIn(List<Long> values) {
            addCriterion("overdue_interest_already not in", values, "overdueInterestAlready");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestAlreadyBetween(Long value1, Long value2) {
            addCriterion("overdue_interest_already between", value1, value2, "overdueInterestAlready");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestAlreadyNotBetween(Long value1, Long value2) {
            addCriterion("overdue_interest_already not between", value1, value2, "overdueInterestAlready");
            return (Criteria) this;
        }

        public Criteria andOverdueServiceFeeIsNull() {
            addCriterion("overdue_service_fee is null");
            return (Criteria) this;
        }

        public Criteria andOverdueServiceFeeIsNotNull() {
            addCriterion("overdue_service_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueServiceFeeEqualTo(Long value) {
            addCriterion("overdue_service_fee =", value, "overdueServiceFee");
            return (Criteria) this;
        }

        public Criteria andOverdueServiceFeeNotEqualTo(Long value) {
            addCriterion("overdue_service_fee <>", value, "overdueServiceFee");
            return (Criteria) this;
        }

        public Criteria andOverdueServiceFeeGreaterThan(Long value) {
            addCriterion("overdue_service_fee >", value, "overdueServiceFee");
            return (Criteria) this;
        }

        public Criteria andOverdueServiceFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("overdue_service_fee >=", value, "overdueServiceFee");
            return (Criteria) this;
        }

        public Criteria andOverdueServiceFeeLessThan(Long value) {
            addCriterion("overdue_service_fee <", value, "overdueServiceFee");
            return (Criteria) this;
        }

        public Criteria andOverdueServiceFeeLessThanOrEqualTo(Long value) {
            addCriterion("overdue_service_fee <=", value, "overdueServiceFee");
            return (Criteria) this;
        }

        public Criteria andOverdueServiceFeeIn(List<Long> values) {
            addCriterion("overdue_service_fee in", values, "overdueServiceFee");
            return (Criteria) this;
        }

        public Criteria andOverdueServiceFeeNotIn(List<Long> values) {
            addCriterion("overdue_service_fee not in", values, "overdueServiceFee");
            return (Criteria) this;
        }

        public Criteria andOverdueServiceFeeBetween(Long value1, Long value2) {
            addCriterion("overdue_service_fee between", value1, value2, "overdueServiceFee");
            return (Criteria) this;
        }

        public Criteria andOverdueServiceFeeNotBetween(Long value1, Long value2) {
            addCriterion("overdue_service_fee not between", value1, value2, "overdueServiceFee");
            return (Criteria) this;
        }

        public Criteria andOverdueServiceFeeAlreadyIsNull() {
            addCriterion("overdue_service_fee_already is null");
            return (Criteria) this;
        }

        public Criteria andOverdueServiceFeeAlreadyIsNotNull() {
            addCriterion("overdue_service_fee_already is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueServiceFeeAlreadyEqualTo(Long value) {
            addCriterion("overdue_service_fee_already =", value, "overdueServiceFeeAlready");
            return (Criteria) this;
        }

        public Criteria andOverdueServiceFeeAlreadyNotEqualTo(Long value) {
            addCriterion("overdue_service_fee_already <>", value, "overdueServiceFeeAlready");
            return (Criteria) this;
        }

        public Criteria andOverdueServiceFeeAlreadyGreaterThan(Long value) {
            addCriterion("overdue_service_fee_already >", value, "overdueServiceFeeAlready");
            return (Criteria) this;
        }

        public Criteria andOverdueServiceFeeAlreadyGreaterThanOrEqualTo(Long value) {
            addCriterion("overdue_service_fee_already >=", value, "overdueServiceFeeAlready");
            return (Criteria) this;
        }

        public Criteria andOverdueServiceFeeAlreadyLessThan(Long value) {
            addCriterion("overdue_service_fee_already <", value, "overdueServiceFeeAlready");
            return (Criteria) this;
        }

        public Criteria andOverdueServiceFeeAlreadyLessThanOrEqualTo(Long value) {
            addCriterion("overdue_service_fee_already <=", value, "overdueServiceFeeAlready");
            return (Criteria) this;
        }

        public Criteria andOverdueServiceFeeAlreadyIn(List<Long> values) {
            addCriterion("overdue_service_fee_already in", values, "overdueServiceFeeAlready");
            return (Criteria) this;
        }

        public Criteria andOverdueServiceFeeAlreadyNotIn(List<Long> values) {
            addCriterion("overdue_service_fee_already not in", values, "overdueServiceFeeAlready");
            return (Criteria) this;
        }

        public Criteria andOverdueServiceFeeAlreadyBetween(Long value1, Long value2) {
            addCriterion("overdue_service_fee_already between", value1, value2, "overdueServiceFeeAlready");
            return (Criteria) this;
        }

        public Criteria andOverdueServiceFeeAlreadyNotBetween(Long value1, Long value2) {
            addCriterion("overdue_service_fee_already not between", value1, value2, "overdueServiceFeeAlready");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(Long value) {
            addCriterion("create_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(Long value) {
            addCriterion("create_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(Long value) {
            addCriterion("create_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("create_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(Long value) {
            addCriterion("create_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(Long value) {
            addCriterion("create_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<Long> values) {
            addCriterion("create_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<Long> values) {
            addCriterion("create_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(Long value1, Long value2) {
            addCriterion("create_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(Long value1, Long value2) {
            addCriterion("create_id not between", value1, value2, "createId");
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

        public Criteria andUpdateIdIsNull() {
            addCriterion("update_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNotNull() {
            addCriterion("update_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdEqualTo(Long value) {
            addCriterion("update_id =", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotEqualTo(Long value) {
            addCriterion("update_id <>", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThan(Long value) {
            addCriterion("update_id >", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("update_id >=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThan(Long value) {
            addCriterion("update_id <", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThanOrEqualTo(Long value) {
            addCriterion("update_id <=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIn(List<Long> values) {
            addCriterion("update_id in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotIn(List<Long> values) {
            addCriterion("update_id not in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdBetween(Long value1, Long value2) {
            addCriterion("update_id between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotBetween(Long value1, Long value2) {
            addCriterion("update_id not between", value1, value2, "updateId");
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

        public Criteria andRepayStatusIsNull() {
            addCriterion("repay_status is null");
            return (Criteria) this;
        }

        public Criteria andRepayStatusIsNotNull() {
            addCriterion("repay_status is not null");
            return (Criteria) this;
        }

        public Criteria andRepayStatusEqualTo(String value) {
            addCriterion("repay_status =", value, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusNotEqualTo(String value) {
            addCriterion("repay_status <>", value, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusGreaterThan(String value) {
            addCriterion("repay_status >", value, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusGreaterThanOrEqualTo(String value) {
            addCriterion("repay_status >=", value, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusLessThan(String value) {
            addCriterion("repay_status <", value, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusLessThanOrEqualTo(String value) {
            addCriterion("repay_status <=", value, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusLike(String value) {
            addCriterion("repay_status like", value, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusNotLike(String value) {
            addCriterion("repay_status not like", value, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusIn(List<String> values) {
            addCriterion("repay_status in", values, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusNotIn(List<String> values) {
            addCriterion("repay_status not in", values, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusBetween(String value1, String value2) {
            addCriterion("repay_status between", value1, value2, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusNotBetween(String value1, String value2) {
            addCriterion("repay_status not between", value1, value2, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andPreRepayFeeIsNull() {
            addCriterion("pre_repay_fee is null");
            return (Criteria) this;
        }

        public Criteria andPreRepayFeeIsNotNull() {
            addCriterion("pre_repay_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPreRepayFeeEqualTo(Long value) {
            addCriterion("pre_repay_fee =", value, "preRepayFee");
            return (Criteria) this;
        }

        public Criteria andPreRepayFeeNotEqualTo(Long value) {
            addCriterion("pre_repay_fee <>", value, "preRepayFee");
            return (Criteria) this;
        }

        public Criteria andPreRepayFeeGreaterThan(Long value) {
            addCriterion("pre_repay_fee >", value, "preRepayFee");
            return (Criteria) this;
        }

        public Criteria andPreRepayFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("pre_repay_fee >=", value, "preRepayFee");
            return (Criteria) this;
        }

        public Criteria andPreRepayFeeLessThan(Long value) {
            addCriterion("pre_repay_fee <", value, "preRepayFee");
            return (Criteria) this;
        }

        public Criteria andPreRepayFeeLessThanOrEqualTo(Long value) {
            addCriterion("pre_repay_fee <=", value, "preRepayFee");
            return (Criteria) this;
        }

        public Criteria andPreRepayFeeIn(List<Long> values) {
            addCriterion("pre_repay_fee in", values, "preRepayFee");
            return (Criteria) this;
        }

        public Criteria andPreRepayFeeNotIn(List<Long> values) {
            addCriterion("pre_repay_fee not in", values, "preRepayFee");
            return (Criteria) this;
        }

        public Criteria andPreRepayFeeBetween(Long value1, Long value2) {
            addCriterion("pre_repay_fee between", value1, value2, "preRepayFee");
            return (Criteria) this;
        }

        public Criteria andPreRepayFeeNotBetween(Long value1, Long value2) {
            addCriterion("pre_repay_fee not between", value1, value2, "preRepayFee");
            return (Criteria) this;
        }

        public Criteria andPreRepayFeeAlreadyIsNull() {
            addCriterion("pre_repay_fee_already is null");
            return (Criteria) this;
        }

        public Criteria andPreRepayFeeAlreadyIsNotNull() {
            addCriterion("pre_repay_fee_already is not null");
            return (Criteria) this;
        }

        public Criteria andPreRepayFeeAlreadyEqualTo(Long value) {
            addCriterion("pre_repay_fee_already =", value, "preRepayFeeAlready");
            return (Criteria) this;
        }

        public Criteria andPreRepayFeeAlreadyNotEqualTo(Long value) {
            addCriterion("pre_repay_fee_already <>", value, "preRepayFeeAlready");
            return (Criteria) this;
        }

        public Criteria andPreRepayFeeAlreadyGreaterThan(Long value) {
            addCriterion("pre_repay_fee_already >", value, "preRepayFeeAlready");
            return (Criteria) this;
        }

        public Criteria andPreRepayFeeAlreadyGreaterThanOrEqualTo(Long value) {
            addCriterion("pre_repay_fee_already >=", value, "preRepayFeeAlready");
            return (Criteria) this;
        }

        public Criteria andPreRepayFeeAlreadyLessThan(Long value) {
            addCriterion("pre_repay_fee_already <", value, "preRepayFeeAlready");
            return (Criteria) this;
        }

        public Criteria andPreRepayFeeAlreadyLessThanOrEqualTo(Long value) {
            addCriterion("pre_repay_fee_already <=", value, "preRepayFeeAlready");
            return (Criteria) this;
        }

        public Criteria andPreRepayFeeAlreadyIn(List<Long> values) {
            addCriterion("pre_repay_fee_already in", values, "preRepayFeeAlready");
            return (Criteria) this;
        }

        public Criteria andPreRepayFeeAlreadyNotIn(List<Long> values) {
            addCriterion("pre_repay_fee_already not in", values, "preRepayFeeAlready");
            return (Criteria) this;
        }

        public Criteria andPreRepayFeeAlreadyBetween(Long value1, Long value2) {
            addCriterion("pre_repay_fee_already between", value1, value2, "preRepayFeeAlready");
            return (Criteria) this;
        }

        public Criteria andPreRepayFeeAlreadyNotBetween(Long value1, Long value2) {
            addCriterion("pre_repay_fee_already not between", value1, value2, "preRepayFeeAlready");
            return (Criteria) this;
        }

        public Criteria andExtensionFeeIsNull() {
            addCriterion("extension_fee is null");
            return (Criteria) this;
        }

        public Criteria andExtensionFeeIsNotNull() {
            addCriterion("extension_fee is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionFeeEqualTo(Long value) {
            addCriterion("extension_fee =", value, "extensionFee");
            return (Criteria) this;
        }

        public Criteria andExtensionFeeNotEqualTo(Long value) {
            addCriterion("extension_fee <>", value, "extensionFee");
            return (Criteria) this;
        }

        public Criteria andExtensionFeeGreaterThan(Long value) {
            addCriterion("extension_fee >", value, "extensionFee");
            return (Criteria) this;
        }

        public Criteria andExtensionFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("extension_fee >=", value, "extensionFee");
            return (Criteria) this;
        }

        public Criteria andExtensionFeeLessThan(Long value) {
            addCriterion("extension_fee <", value, "extensionFee");
            return (Criteria) this;
        }

        public Criteria andExtensionFeeLessThanOrEqualTo(Long value) {
            addCriterion("extension_fee <=", value, "extensionFee");
            return (Criteria) this;
        }

        public Criteria andExtensionFeeIn(List<Long> values) {
            addCriterion("extension_fee in", values, "extensionFee");
            return (Criteria) this;
        }

        public Criteria andExtensionFeeNotIn(List<Long> values) {
            addCriterion("extension_fee not in", values, "extensionFee");
            return (Criteria) this;
        }

        public Criteria andExtensionFeeBetween(Long value1, Long value2) {
            addCriterion("extension_fee between", value1, value2, "extensionFee");
            return (Criteria) this;
        }

        public Criteria andExtensionFeeNotBetween(Long value1, Long value2) {
            addCriterion("extension_fee not between", value1, value2, "extensionFee");
            return (Criteria) this;
        }

        public Criteria andExtensionFeeAlreadyIsNull() {
            addCriterion("extension_fee_already is null");
            return (Criteria) this;
        }

        public Criteria andExtensionFeeAlreadyIsNotNull() {
            addCriterion("extension_fee_already is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionFeeAlreadyEqualTo(Long value) {
            addCriterion("extension_fee_already =", value, "extensionFeeAlready");
            return (Criteria) this;
        }

        public Criteria andExtensionFeeAlreadyNotEqualTo(Long value) {
            addCriterion("extension_fee_already <>", value, "extensionFeeAlready");
            return (Criteria) this;
        }

        public Criteria andExtensionFeeAlreadyGreaterThan(Long value) {
            addCriterion("extension_fee_already >", value, "extensionFeeAlready");
            return (Criteria) this;
        }

        public Criteria andExtensionFeeAlreadyGreaterThanOrEqualTo(Long value) {
            addCriterion("extension_fee_already >=", value, "extensionFeeAlready");
            return (Criteria) this;
        }

        public Criteria andExtensionFeeAlreadyLessThan(Long value) {
            addCriterion("extension_fee_already <", value, "extensionFeeAlready");
            return (Criteria) this;
        }

        public Criteria andExtensionFeeAlreadyLessThanOrEqualTo(Long value) {
            addCriterion("extension_fee_already <=", value, "extensionFeeAlready");
            return (Criteria) this;
        }

        public Criteria andExtensionFeeAlreadyIn(List<Long> values) {
            addCriterion("extension_fee_already in", values, "extensionFeeAlready");
            return (Criteria) this;
        }

        public Criteria andExtensionFeeAlreadyNotIn(List<Long> values) {
            addCriterion("extension_fee_already not in", values, "extensionFeeAlready");
            return (Criteria) this;
        }

        public Criteria andExtensionFeeAlreadyBetween(Long value1, Long value2) {
            addCriterion("extension_fee_already between", value1, value2, "extensionFeeAlready");
            return (Criteria) this;
        }

        public Criteria andExtensionFeeAlreadyNotBetween(Long value1, Long value2) {
            addCriterion("extension_fee_already not between", value1, value2, "extensionFeeAlready");
            return (Criteria) this;
        }

        public Criteria andOtherFeeIsNull() {
            addCriterion("other_fee is null");
            return (Criteria) this;
        }

        public Criteria andOtherFeeIsNotNull() {
            addCriterion("other_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOtherFeeEqualTo(Long value) {
            addCriterion("other_fee =", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeNotEqualTo(Long value) {
            addCriterion("other_fee <>", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeGreaterThan(Long value) {
            addCriterion("other_fee >", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("other_fee >=", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeLessThan(Long value) {
            addCriterion("other_fee <", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeLessThanOrEqualTo(Long value) {
            addCriterion("other_fee <=", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeIn(List<Long> values) {
            addCriterion("other_fee in", values, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeNotIn(List<Long> values) {
            addCriterion("other_fee not in", values, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeBetween(Long value1, Long value2) {
            addCriterion("other_fee between", value1, value2, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeNotBetween(Long value1, Long value2) {
            addCriterion("other_fee not between", value1, value2, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeAlreadyIsNull() {
            addCriterion("other_fee_already is null");
            return (Criteria) this;
        }

        public Criteria andOtherFeeAlreadyIsNotNull() {
            addCriterion("other_fee_already is not null");
            return (Criteria) this;
        }

        public Criteria andOtherFeeAlreadyEqualTo(Long value) {
            addCriterion("other_fee_already =", value, "otherFeeAlready");
            return (Criteria) this;
        }

        public Criteria andOtherFeeAlreadyNotEqualTo(Long value) {
            addCriterion("other_fee_already <>", value, "otherFeeAlready");
            return (Criteria) this;
        }

        public Criteria andOtherFeeAlreadyGreaterThan(Long value) {
            addCriterion("other_fee_already >", value, "otherFeeAlready");
            return (Criteria) this;
        }

        public Criteria andOtherFeeAlreadyGreaterThanOrEqualTo(Long value) {
            addCriterion("other_fee_already >=", value, "otherFeeAlready");
            return (Criteria) this;
        }

        public Criteria andOtherFeeAlreadyLessThan(Long value) {
            addCriterion("other_fee_already <", value, "otherFeeAlready");
            return (Criteria) this;
        }

        public Criteria andOtherFeeAlreadyLessThanOrEqualTo(Long value) {
            addCriterion("other_fee_already <=", value, "otherFeeAlready");
            return (Criteria) this;
        }

        public Criteria andOtherFeeAlreadyIn(List<Long> values) {
            addCriterion("other_fee_already in", values, "otherFeeAlready");
            return (Criteria) this;
        }

        public Criteria andOtherFeeAlreadyNotIn(List<Long> values) {
            addCriterion("other_fee_already not in", values, "otherFeeAlready");
            return (Criteria) this;
        }

        public Criteria andOtherFeeAlreadyBetween(Long value1, Long value2) {
            addCriterion("other_fee_already between", value1, value2, "otherFeeAlready");
            return (Criteria) this;
        }

        public Criteria andOtherFeeAlreadyNotBetween(Long value1, Long value2) {
            addCriterion("other_fee_already not between", value1, value2, "otherFeeAlready");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(Long value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(Long value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(Long value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(Long value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(Long value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(Long value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<Long> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<Long> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(Long value1, Long value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(Long value1, Long value2) {
            addCriterion("balance not between", value1, value2, "balance");
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