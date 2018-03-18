package com.yonyou.scf.common.entity;

import java.util.ArrayList;
import java.util.List;

public class FinanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinanceExample() {
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

        public Criteria andFinanceIdIsNull() {
            addCriterion("finance_id is null");
            return (Criteria) this;
        }

        public Criteria andFinanceIdIsNotNull() {
            addCriterion("finance_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceIdEqualTo(Long value) {
            addCriterion("finance_id =", value, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdNotEqualTo(Long value) {
            addCriterion("finance_id <>", value, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdGreaterThan(Long value) {
            addCriterion("finance_id >", value, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("finance_id >=", value, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdLessThan(Long value) {
            addCriterion("finance_id <", value, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdLessThanOrEqualTo(Long value) {
            addCriterion("finance_id <=", value, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdIn(List<Long> values) {
            addCriterion("finance_id in", values, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdNotIn(List<Long> values) {
            addCriterion("finance_id not in", values, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdBetween(Long value1, Long value2) {
            addCriterion("finance_id between", value1, value2, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdNotBetween(Long value1, Long value2) {
            addCriterion("finance_id not between", value1, value2, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceNoIsNull() {
            addCriterion("finance_no is null");
            return (Criteria) this;
        }

        public Criteria andFinanceNoIsNotNull() {
            addCriterion("finance_no is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceNoEqualTo(String value) {
            addCriterion("finance_no =", value, "financeNo");
            return (Criteria) this;
        }

        public Criteria andFinanceNoNotEqualTo(String value) {
            addCriterion("finance_no <>", value, "financeNo");
            return (Criteria) this;
        }

        public Criteria andFinanceNoGreaterThan(String value) {
            addCriterion("finance_no >", value, "financeNo");
            return (Criteria) this;
        }

        public Criteria andFinanceNoGreaterThanOrEqualTo(String value) {
            addCriterion("finance_no >=", value, "financeNo");
            return (Criteria) this;
        }

        public Criteria andFinanceNoLessThan(String value) {
            addCriterion("finance_no <", value, "financeNo");
            return (Criteria) this;
        }

        public Criteria andFinanceNoLessThanOrEqualTo(String value) {
            addCriterion("finance_no <=", value, "financeNo");
            return (Criteria) this;
        }

        public Criteria andFinanceNoLike(String value) {
            addCriterion("finance_no like", value, "financeNo");
            return (Criteria) this;
        }

        public Criteria andFinanceNoNotLike(String value) {
            addCriterion("finance_no not like", value, "financeNo");
            return (Criteria) this;
        }

        public Criteria andFinanceNoIn(List<String> values) {
            addCriterion("finance_no in", values, "financeNo");
            return (Criteria) this;
        }

        public Criteria andFinanceNoNotIn(List<String> values) {
            addCriterion("finance_no not in", values, "financeNo");
            return (Criteria) this;
        }

        public Criteria andFinanceNoBetween(String value1, String value2) {
            addCriterion("finance_no between", value1, value2, "financeNo");
            return (Criteria) this;
        }

        public Criteria andFinanceNoNotBetween(String value1, String value2) {
            addCriterion("finance_no not between", value1, value2, "financeNo");
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

        public Criteria andCreditIdIsNull() {
            addCriterion("credit_id is null");
            return (Criteria) this;
        }

        public Criteria andCreditIdIsNotNull() {
            addCriterion("credit_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreditIdEqualTo(Long value) {
            addCriterion("credit_id =", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdNotEqualTo(Long value) {
            addCriterion("credit_id <>", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdGreaterThan(Long value) {
            addCriterion("credit_id >", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdGreaterThanOrEqualTo(Long value) {
            addCriterion("credit_id >=", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdLessThan(Long value) {
            addCriterion("credit_id <", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdLessThanOrEqualTo(Long value) {
            addCriterion("credit_id <=", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdIn(List<Long> values) {
            addCriterion("credit_id in", values, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdNotIn(List<Long> values) {
            addCriterion("credit_id not in", values, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdBetween(Long value1, Long value2) {
            addCriterion("credit_id between", value1, value2, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdNotBetween(Long value1, Long value2) {
            addCriterion("credit_id not between", value1, value2, "creditId");
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

        public Criteria andFinanceAmountIsNull() {
            addCriterion("finance_amount is null");
            return (Criteria) this;
        }

        public Criteria andFinanceAmountIsNotNull() {
            addCriterion("finance_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceAmountEqualTo(Long value) {
            addCriterion("finance_amount =", value, "financeAmount");
            return (Criteria) this;
        }

        public Criteria andFinanceAmountNotEqualTo(Long value) {
            addCriterion("finance_amount <>", value, "financeAmount");
            return (Criteria) this;
        }

        public Criteria andFinanceAmountGreaterThan(Long value) {
            addCriterion("finance_amount >", value, "financeAmount");
            return (Criteria) this;
        }

        public Criteria andFinanceAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("finance_amount >=", value, "financeAmount");
            return (Criteria) this;
        }

        public Criteria andFinanceAmountLessThan(Long value) {
            addCriterion("finance_amount <", value, "financeAmount");
            return (Criteria) this;
        }

        public Criteria andFinanceAmountLessThanOrEqualTo(Long value) {
            addCriterion("finance_amount <=", value, "financeAmount");
            return (Criteria) this;
        }

        public Criteria andFinanceAmountIn(List<Long> values) {
            addCriterion("finance_amount in", values, "financeAmount");
            return (Criteria) this;
        }

        public Criteria andFinanceAmountNotIn(List<Long> values) {
            addCriterion("finance_amount not in", values, "financeAmount");
            return (Criteria) this;
        }

        public Criteria andFinanceAmountBetween(Long value1, Long value2) {
            addCriterion("finance_amount between", value1, value2, "financeAmount");
            return (Criteria) this;
        }

        public Criteria andFinanceAmountNotBetween(Long value1, Long value2) {
            addCriterion("finance_amount not between", value1, value2, "financeAmount");
            return (Criteria) this;
        }

        public Criteria andFinancePurposeIsNull() {
            addCriterion("finance_purpose is null");
            return (Criteria) this;
        }

        public Criteria andFinancePurposeIsNotNull() {
            addCriterion("finance_purpose is not null");
            return (Criteria) this;
        }

        public Criteria andFinancePurposeEqualTo(String value) {
            addCriterion("finance_purpose =", value, "financePurpose");
            return (Criteria) this;
        }

        public Criteria andFinancePurposeNotEqualTo(String value) {
            addCriterion("finance_purpose <>", value, "financePurpose");
            return (Criteria) this;
        }

        public Criteria andFinancePurposeGreaterThan(String value) {
            addCriterion("finance_purpose >", value, "financePurpose");
            return (Criteria) this;
        }

        public Criteria andFinancePurposeGreaterThanOrEqualTo(String value) {
            addCriterion("finance_purpose >=", value, "financePurpose");
            return (Criteria) this;
        }

        public Criteria andFinancePurposeLessThan(String value) {
            addCriterion("finance_purpose <", value, "financePurpose");
            return (Criteria) this;
        }

        public Criteria andFinancePurposeLessThanOrEqualTo(String value) {
            addCriterion("finance_purpose <=", value, "financePurpose");
            return (Criteria) this;
        }

        public Criteria andFinancePurposeLike(String value) {
            addCriterion("finance_purpose like", value, "financePurpose");
            return (Criteria) this;
        }

        public Criteria andFinancePurposeNotLike(String value) {
            addCriterion("finance_purpose not like", value, "financePurpose");
            return (Criteria) this;
        }

        public Criteria andFinancePurposeIn(List<String> values) {
            addCriterion("finance_purpose in", values, "financePurpose");
            return (Criteria) this;
        }

        public Criteria andFinancePurposeNotIn(List<String> values) {
            addCriterion("finance_purpose not in", values, "financePurpose");
            return (Criteria) this;
        }

        public Criteria andFinancePurposeBetween(String value1, String value2) {
            addCriterion("finance_purpose between", value1, value2, "financePurpose");
            return (Criteria) this;
        }

        public Criteria andFinancePurposeNotBetween(String value1, String value2) {
            addCriterion("finance_purpose not between", value1, value2, "financePurpose");
            return (Criteria) this;
        }

        public Criteria andFinanceDayIsNull() {
            addCriterion("finance_day is null");
            return (Criteria) this;
        }

        public Criteria andFinanceDayIsNotNull() {
            addCriterion("finance_day is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceDayEqualTo(Integer value) {
            addCriterion("finance_day =", value, "financeDay");
            return (Criteria) this;
        }

        public Criteria andFinanceDayNotEqualTo(Integer value) {
            addCriterion("finance_day <>", value, "financeDay");
            return (Criteria) this;
        }

        public Criteria andFinanceDayGreaterThan(Integer value) {
            addCriterion("finance_day >", value, "financeDay");
            return (Criteria) this;
        }

        public Criteria andFinanceDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("finance_day >=", value, "financeDay");
            return (Criteria) this;
        }

        public Criteria andFinanceDayLessThan(Integer value) {
            addCriterion("finance_day <", value, "financeDay");
            return (Criteria) this;
        }

        public Criteria andFinanceDayLessThanOrEqualTo(Integer value) {
            addCriterion("finance_day <=", value, "financeDay");
            return (Criteria) this;
        }

        public Criteria andFinanceDayIn(List<Integer> values) {
            addCriterion("finance_day in", values, "financeDay");
            return (Criteria) this;
        }

        public Criteria andFinanceDayNotIn(List<Integer> values) {
            addCriterion("finance_day not in", values, "financeDay");
            return (Criteria) this;
        }

        public Criteria andFinanceDayBetween(Integer value1, Integer value2) {
            addCriterion("finance_day between", value1, value2, "financeDay");
            return (Criteria) this;
        }

        public Criteria andFinanceDayNotBetween(Integer value1, Integer value2) {
            addCriterion("finance_day not between", value1, value2, "financeDay");
            return (Criteria) this;
        }

        public Criteria andFinancePurposeRemarkIsNull() {
            addCriterion("finance_purpose_remark is null");
            return (Criteria) this;
        }

        public Criteria andFinancePurposeRemarkIsNotNull() {
            addCriterion("finance_purpose_remark is not null");
            return (Criteria) this;
        }

        public Criteria andFinancePurposeRemarkEqualTo(String value) {
            addCriterion("finance_purpose_remark =", value, "financePurposeRemark");
            return (Criteria) this;
        }

        public Criteria andFinancePurposeRemarkNotEqualTo(String value) {
            addCriterion("finance_purpose_remark <>", value, "financePurposeRemark");
            return (Criteria) this;
        }

        public Criteria andFinancePurposeRemarkGreaterThan(String value) {
            addCriterion("finance_purpose_remark >", value, "financePurposeRemark");
            return (Criteria) this;
        }

        public Criteria andFinancePurposeRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("finance_purpose_remark >=", value, "financePurposeRemark");
            return (Criteria) this;
        }

        public Criteria andFinancePurposeRemarkLessThan(String value) {
            addCriterion("finance_purpose_remark <", value, "financePurposeRemark");
            return (Criteria) this;
        }

        public Criteria andFinancePurposeRemarkLessThanOrEqualTo(String value) {
            addCriterion("finance_purpose_remark <=", value, "financePurposeRemark");
            return (Criteria) this;
        }

        public Criteria andFinancePurposeRemarkLike(String value) {
            addCriterion("finance_purpose_remark like", value, "financePurposeRemark");
            return (Criteria) this;
        }

        public Criteria andFinancePurposeRemarkNotLike(String value) {
            addCriterion("finance_purpose_remark not like", value, "financePurposeRemark");
            return (Criteria) this;
        }

        public Criteria andFinancePurposeRemarkIn(List<String> values) {
            addCriterion("finance_purpose_remark in", values, "financePurposeRemark");
            return (Criteria) this;
        }

        public Criteria andFinancePurposeRemarkNotIn(List<String> values) {
            addCriterion("finance_purpose_remark not in", values, "financePurposeRemark");
            return (Criteria) this;
        }

        public Criteria andFinancePurposeRemarkBetween(String value1, String value2) {
            addCriterion("finance_purpose_remark between", value1, value2, "financePurposeRemark");
            return (Criteria) this;
        }

        public Criteria andFinancePurposeRemarkNotBetween(String value1, String value2) {
            addCriterion("finance_purpose_remark not between", value1, value2, "financePurposeRemark");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("order_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(Long value) {
            addCriterion("order_amount =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(Long value) {
            addCriterion("order_amount <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(Long value) {
            addCriterion("order_amount >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("order_amount >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(Long value) {
            addCriterion("order_amount <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(Long value) {
            addCriterion("order_amount <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<Long> values) {
            addCriterion("order_amount in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<Long> values) {
            addCriterion("order_amount not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(Long value1, Long value2) {
            addCriterion("order_amount between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(Long value1, Long value2) {
            addCriterion("order_amount not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andReceivableIdIsNull() {
            addCriterion("receivable_id is null");
            return (Criteria) this;
        }

        public Criteria andReceivableIdIsNotNull() {
            addCriterion("receivable_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceivableIdEqualTo(Long value) {
            addCriterion("receivable_id =", value, "receivableId");
            return (Criteria) this;
        }

        public Criteria andReceivableIdNotEqualTo(Long value) {
            addCriterion("receivable_id <>", value, "receivableId");
            return (Criteria) this;
        }

        public Criteria andReceivableIdGreaterThan(Long value) {
            addCriterion("receivable_id >", value, "receivableId");
            return (Criteria) this;
        }

        public Criteria andReceivableIdGreaterThanOrEqualTo(Long value) {
            addCriterion("receivable_id >=", value, "receivableId");
            return (Criteria) this;
        }

        public Criteria andReceivableIdLessThan(Long value) {
            addCriterion("receivable_id <", value, "receivableId");
            return (Criteria) this;
        }

        public Criteria andReceivableIdLessThanOrEqualTo(Long value) {
            addCriterion("receivable_id <=", value, "receivableId");
            return (Criteria) this;
        }

        public Criteria andReceivableIdIn(List<Long> values) {
            addCriterion("receivable_id in", values, "receivableId");
            return (Criteria) this;
        }

        public Criteria andReceivableIdNotIn(List<Long> values) {
            addCriterion("receivable_id not in", values, "receivableId");
            return (Criteria) this;
        }

        public Criteria andReceivableIdBetween(Long value1, Long value2) {
            addCriterion("receivable_id between", value1, value2, "receivableId");
            return (Criteria) this;
        }

        public Criteria andReceivableIdNotBetween(Long value1, Long value2) {
            addCriterion("receivable_id not between", value1, value2, "receivableId");
            return (Criteria) this;
        }

        public Criteria andRepayTypeIsNull() {
            addCriterion("repay_type is null");
            return (Criteria) this;
        }

        public Criteria andRepayTypeIsNotNull() {
            addCriterion("repay_type is not null");
            return (Criteria) this;
        }

        public Criteria andRepayTypeEqualTo(String value) {
            addCriterion("repay_type =", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeNotEqualTo(String value) {
            addCriterion("repay_type <>", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeGreaterThan(String value) {
            addCriterion("repay_type >", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("repay_type >=", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeLessThan(String value) {
            addCriterion("repay_type <", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeLessThanOrEqualTo(String value) {
            addCriterion("repay_type <=", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeLike(String value) {
            addCriterion("repay_type like", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeNotLike(String value) {
            addCriterion("repay_type not like", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeIn(List<String> values) {
            addCriterion("repay_type in", values, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeNotIn(List<String> values) {
            addCriterion("repay_type not in", values, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeBetween(String value1, String value2) {
            addCriterion("repay_type between", value1, value2, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeNotBetween(String value1, String value2) {
            addCriterion("repay_type not between", value1, value2, "repayType");
            return (Criteria) this;
        }

        public Criteria andFinanceStatusIsNull() {
            addCriterion("finance_status is null");
            return (Criteria) this;
        }

        public Criteria andFinanceStatusIsNotNull() {
            addCriterion("finance_status is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceStatusEqualTo(String value) {
            addCriterion("finance_status =", value, "financeStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceStatusNotEqualTo(String value) {
            addCriterion("finance_status <>", value, "financeStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceStatusGreaterThan(String value) {
            addCriterion("finance_status >", value, "financeStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceStatusGreaterThanOrEqualTo(String value) {
            addCriterion("finance_status >=", value, "financeStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceStatusLessThan(String value) {
            addCriterion("finance_status <", value, "financeStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceStatusLessThanOrEqualTo(String value) {
            addCriterion("finance_status <=", value, "financeStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceStatusLike(String value) {
            addCriterion("finance_status like", value, "financeStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceStatusNotLike(String value) {
            addCriterion("finance_status not like", value, "financeStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceStatusIn(List<String> values) {
            addCriterion("finance_status in", values, "financeStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceStatusNotIn(List<String> values) {
            addCriterion("finance_status not in", values, "financeStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceStatusBetween(String value1, String value2) {
            addCriterion("finance_status between", value1, value2, "financeStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceStatusNotBetween(String value1, String value2) {
            addCriterion("finance_status not between", value1, value2, "financeStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceModeIsNull() {
            addCriterion("finance_mode is null");
            return (Criteria) this;
        }

        public Criteria andFinanceModeIsNotNull() {
            addCriterion("finance_mode is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceModeEqualTo(String value) {
            addCriterion("finance_mode =", value, "financeMode");
            return (Criteria) this;
        }

        public Criteria andFinanceModeNotEqualTo(String value) {
            addCriterion("finance_mode <>", value, "financeMode");
            return (Criteria) this;
        }

        public Criteria andFinanceModeGreaterThan(String value) {
            addCriterion("finance_mode >", value, "financeMode");
            return (Criteria) this;
        }

        public Criteria andFinanceModeGreaterThanOrEqualTo(String value) {
            addCriterion("finance_mode >=", value, "financeMode");
            return (Criteria) this;
        }

        public Criteria andFinanceModeLessThan(String value) {
            addCriterion("finance_mode <", value, "financeMode");
            return (Criteria) this;
        }

        public Criteria andFinanceModeLessThanOrEqualTo(String value) {
            addCriterion("finance_mode <=", value, "financeMode");
            return (Criteria) this;
        }

        public Criteria andFinanceModeLike(String value) {
            addCriterion("finance_mode like", value, "financeMode");
            return (Criteria) this;
        }

        public Criteria andFinanceModeNotLike(String value) {
            addCriterion("finance_mode not like", value, "financeMode");
            return (Criteria) this;
        }

        public Criteria andFinanceModeIn(List<String> values) {
            addCriterion("finance_mode in", values, "financeMode");
            return (Criteria) this;
        }

        public Criteria andFinanceModeNotIn(List<String> values) {
            addCriterion("finance_mode not in", values, "financeMode");
            return (Criteria) this;
        }

        public Criteria andFinanceModeBetween(String value1, String value2) {
            addCriterion("finance_mode between", value1, value2, "financeMode");
            return (Criteria) this;
        }

        public Criteria andFinanceModeNotBetween(String value1, String value2) {
            addCriterion("finance_mode not between", value1, value2, "financeMode");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIsNull() {
            addCriterion("platform_id is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIsNotNull() {
            addCriterion("platform_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformIdEqualTo(String value) {
            addCriterion("platform_id =", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotEqualTo(String value) {
            addCriterion("platform_id <>", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdGreaterThan(String value) {
            addCriterion("platform_id >", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdGreaterThanOrEqualTo(String value) {
            addCriterion("platform_id >=", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdLessThan(String value) {
            addCriterion("platform_id <", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdLessThanOrEqualTo(String value) {
            addCriterion("platform_id <=", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdLike(String value) {
            addCriterion("platform_id like", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotLike(String value) {
            addCriterion("platform_id not like", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIn(List<String> values) {
            addCriterion("platform_id in", values, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotIn(List<String> values) {
            addCriterion("platform_id not in", values, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdBetween(String value1, String value2) {
            addCriterion("platform_id between", value1, value2, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotBetween(String value1, String value2) {
            addCriterion("platform_id not between", value1, value2, "platformId");
            return (Criteria) this;
        }

        public Criteria andReceivablesIdIsNull() {
            addCriterion("receivables_id is null");
            return (Criteria) this;
        }

        public Criteria andReceivablesIdIsNotNull() {
            addCriterion("receivables_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceivablesIdEqualTo(Long value) {
            addCriterion("receivables_id =", value, "receivablesId");
            return (Criteria) this;
        }

        public Criteria andReceivablesIdNotEqualTo(Long value) {
            addCriterion("receivables_id <>", value, "receivablesId");
            return (Criteria) this;
        }

        public Criteria andReceivablesIdGreaterThan(Long value) {
            addCriterion("receivables_id >", value, "receivablesId");
            return (Criteria) this;
        }

        public Criteria andReceivablesIdGreaterThanOrEqualTo(Long value) {
            addCriterion("receivables_id >=", value, "receivablesId");
            return (Criteria) this;
        }

        public Criteria andReceivablesIdLessThan(Long value) {
            addCriterion("receivables_id <", value, "receivablesId");
            return (Criteria) this;
        }

        public Criteria andReceivablesIdLessThanOrEqualTo(Long value) {
            addCriterion("receivables_id <=", value, "receivablesId");
            return (Criteria) this;
        }

        public Criteria andReceivablesIdIn(List<Long> values) {
            addCriterion("receivables_id in", values, "receivablesId");
            return (Criteria) this;
        }

        public Criteria andReceivablesIdNotIn(List<Long> values) {
            addCriterion("receivables_id not in", values, "receivablesId");
            return (Criteria) this;
        }

        public Criteria andReceivablesIdBetween(Long value1, Long value2) {
            addCriterion("receivables_id between", value1, value2, "receivablesId");
            return (Criteria) this;
        }

        public Criteria andReceivablesIdNotBetween(Long value1, Long value2) {
            addCriterion("receivables_id not between", value1, value2, "receivablesId");
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

        public Criteria andRepayAmountIsNull() {
            addCriterion("repay_amount is null");
            return (Criteria) this;
        }

        public Criteria andRepayAmountIsNotNull() {
            addCriterion("repay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRepayAmountEqualTo(Long value) {
            addCriterion("repay_amount =", value, "repayAmount");
            return (Criteria) this;
        }

        public Criteria andRepayAmountNotEqualTo(Long value) {
            addCriterion("repay_amount <>", value, "repayAmount");
            return (Criteria) this;
        }

        public Criteria andRepayAmountGreaterThan(Long value) {
            addCriterion("repay_amount >", value, "repayAmount");
            return (Criteria) this;
        }

        public Criteria andRepayAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("repay_amount >=", value, "repayAmount");
            return (Criteria) this;
        }

        public Criteria andRepayAmountLessThan(Long value) {
            addCriterion("repay_amount <", value, "repayAmount");
            return (Criteria) this;
        }

        public Criteria andRepayAmountLessThanOrEqualTo(Long value) {
            addCriterion("repay_amount <=", value, "repayAmount");
            return (Criteria) this;
        }

        public Criteria andRepayAmountIn(List<Long> values) {
            addCriterion("repay_amount in", values, "repayAmount");
            return (Criteria) this;
        }

        public Criteria andRepayAmountNotIn(List<Long> values) {
            addCriterion("repay_amount not in", values, "repayAmount");
            return (Criteria) this;
        }

        public Criteria andRepayAmountBetween(Long value1, Long value2) {
            addCriterion("repay_amount between", value1, value2, "repayAmount");
            return (Criteria) this;
        }

        public Criteria andRepayAmountNotBetween(Long value1, Long value2) {
            addCriterion("repay_amount not between", value1, value2, "repayAmount");
            return (Criteria) this;
        }

        public Criteria andRepayTimeIsNull() {
            addCriterion("repay_time is null");
            return (Criteria) this;
        }

        public Criteria andRepayTimeIsNotNull() {
            addCriterion("repay_time is not null");
            return (Criteria) this;
        }

        public Criteria andRepayTimeEqualTo(String value) {
            addCriterion("repay_time =", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeNotEqualTo(String value) {
            addCriterion("repay_time <>", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeGreaterThan(String value) {
            addCriterion("repay_time >", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeGreaterThanOrEqualTo(String value) {
            addCriterion("repay_time >=", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeLessThan(String value) {
            addCriterion("repay_time <", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeLessThanOrEqualTo(String value) {
            addCriterion("repay_time <=", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeLike(String value) {
            addCriterion("repay_time like", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeNotLike(String value) {
            addCriterion("repay_time not like", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeIn(List<String> values) {
            addCriterion("repay_time in", values, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeNotIn(List<String> values) {
            addCriterion("repay_time not in", values, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeBetween(String value1, String value2) {
            addCriterion("repay_time between", value1, value2, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeNotBetween(String value1, String value2) {
            addCriterion("repay_time not between", value1, value2, "repayTime");
            return (Criteria) this;
        }

        public Criteria andFinanceEndDateIsNull() {
            addCriterion("finance_end_date is null");
            return (Criteria) this;
        }

        public Criteria andFinanceEndDateIsNotNull() {
            addCriterion("finance_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceEndDateEqualTo(String value) {
            addCriterion("finance_end_date =", value, "financeEndDate");
            return (Criteria) this;
        }

        public Criteria andFinanceEndDateNotEqualTo(String value) {
            addCriterion("finance_end_date <>", value, "financeEndDate");
            return (Criteria) this;
        }

        public Criteria andFinanceEndDateGreaterThan(String value) {
            addCriterion("finance_end_date >", value, "financeEndDate");
            return (Criteria) this;
        }

        public Criteria andFinanceEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("finance_end_date >=", value, "financeEndDate");
            return (Criteria) this;
        }

        public Criteria andFinanceEndDateLessThan(String value) {
            addCriterion("finance_end_date <", value, "financeEndDate");
            return (Criteria) this;
        }

        public Criteria andFinanceEndDateLessThanOrEqualTo(String value) {
            addCriterion("finance_end_date <=", value, "financeEndDate");
            return (Criteria) this;
        }

        public Criteria andFinanceEndDateLike(String value) {
            addCriterion("finance_end_date like", value, "financeEndDate");
            return (Criteria) this;
        }

        public Criteria andFinanceEndDateNotLike(String value) {
            addCriterion("finance_end_date not like", value, "financeEndDate");
            return (Criteria) this;
        }

        public Criteria andFinanceEndDateIn(List<String> values) {
            addCriterion("finance_end_date in", values, "financeEndDate");
            return (Criteria) this;
        }

        public Criteria andFinanceEndDateNotIn(List<String> values) {
            addCriterion("finance_end_date not in", values, "financeEndDate");
            return (Criteria) this;
        }

        public Criteria andFinanceEndDateBetween(String value1, String value2) {
            addCriterion("finance_end_date between", value1, value2, "financeEndDate");
            return (Criteria) this;
        }

        public Criteria andFinanceEndDateNotBetween(String value1, String value2) {
            addCriterion("finance_end_date not between", value1, value2, "financeEndDate");
            return (Criteria) this;
        }

        public Criteria andRebackAmountIsNull() {
            addCriterion("reback_amount is null");
            return (Criteria) this;
        }

        public Criteria andRebackAmountIsNotNull() {
            addCriterion("reback_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRebackAmountEqualTo(Long value) {
            addCriterion("reback_amount =", value, "rebackAmount");
            return (Criteria) this;
        }

        public Criteria andRebackAmountNotEqualTo(Long value) {
            addCriterion("reback_amount <>", value, "rebackAmount");
            return (Criteria) this;
        }

        public Criteria andRebackAmountGreaterThan(Long value) {
            addCriterion("reback_amount >", value, "rebackAmount");
            return (Criteria) this;
        }

        public Criteria andRebackAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("reback_amount >=", value, "rebackAmount");
            return (Criteria) this;
        }

        public Criteria andRebackAmountLessThan(Long value) {
            addCriterion("reback_amount <", value, "rebackAmount");
            return (Criteria) this;
        }

        public Criteria andRebackAmountLessThanOrEqualTo(Long value) {
            addCriterion("reback_amount <=", value, "rebackAmount");
            return (Criteria) this;
        }

        public Criteria andRebackAmountIn(List<Long> values) {
            addCriterion("reback_amount in", values, "rebackAmount");
            return (Criteria) this;
        }

        public Criteria andRebackAmountNotIn(List<Long> values) {
            addCriterion("reback_amount not in", values, "rebackAmount");
            return (Criteria) this;
        }

        public Criteria andRebackAmountBetween(Long value1, Long value2) {
            addCriterion("reback_amount between", value1, value2, "rebackAmount");
            return (Criteria) this;
        }

        public Criteria andRebackAmountNotBetween(Long value1, Long value2) {
            addCriterion("reback_amount not between", value1, value2, "rebackAmount");
            return (Criteria) this;
        }

        public Criteria andIsForzenIsNull() {
            addCriterion("is_forzen is null");
            return (Criteria) this;
        }

        public Criteria andIsForzenIsNotNull() {
            addCriterion("is_forzen is not null");
            return (Criteria) this;
        }

        public Criteria andIsForzenEqualTo(String value) {
            addCriterion("is_forzen =", value, "isForzen");
            return (Criteria) this;
        }

        public Criteria andIsForzenNotEqualTo(String value) {
            addCriterion("is_forzen <>", value, "isForzen");
            return (Criteria) this;
        }

        public Criteria andIsForzenGreaterThan(String value) {
            addCriterion("is_forzen >", value, "isForzen");
            return (Criteria) this;
        }

        public Criteria andIsForzenGreaterThanOrEqualTo(String value) {
            addCriterion("is_forzen >=", value, "isForzen");
            return (Criteria) this;
        }

        public Criteria andIsForzenLessThan(String value) {
            addCriterion("is_forzen <", value, "isForzen");
            return (Criteria) this;
        }

        public Criteria andIsForzenLessThanOrEqualTo(String value) {
            addCriterion("is_forzen <=", value, "isForzen");
            return (Criteria) this;
        }

        public Criteria andIsForzenLike(String value) {
            addCriterion("is_forzen like", value, "isForzen");
            return (Criteria) this;
        }

        public Criteria andIsForzenNotLike(String value) {
            addCriterion("is_forzen not like", value, "isForzen");
            return (Criteria) this;
        }

        public Criteria andIsForzenIn(List<String> values) {
            addCriterion("is_forzen in", values, "isForzen");
            return (Criteria) this;
        }

        public Criteria andIsForzenNotIn(List<String> values) {
            addCriterion("is_forzen not in", values, "isForzen");
            return (Criteria) this;
        }

        public Criteria andIsForzenBetween(String value1, String value2) {
            addCriterion("is_forzen between", value1, value2, "isForzen");
            return (Criteria) this;
        }

        public Criteria andIsForzenNotBetween(String value1, String value2) {
            addCriterion("is_forzen not between", value1, value2, "isForzen");
            return (Criteria) this;
        }

        public Criteria andForzenAmountIsNull() {
            addCriterion("forzen_amount is null");
            return (Criteria) this;
        }

        public Criteria andForzenAmountIsNotNull() {
            addCriterion("forzen_amount is not null");
            return (Criteria) this;
        }

        public Criteria andForzenAmountEqualTo(Long value) {
            addCriterion("forzen_amount =", value, "forzenAmount");
            return (Criteria) this;
        }

        public Criteria andForzenAmountNotEqualTo(Long value) {
            addCriterion("forzen_amount <>", value, "forzenAmount");
            return (Criteria) this;
        }

        public Criteria andForzenAmountGreaterThan(Long value) {
            addCriterion("forzen_amount >", value, "forzenAmount");
            return (Criteria) this;
        }

        public Criteria andForzenAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("forzen_amount >=", value, "forzenAmount");
            return (Criteria) this;
        }

        public Criteria andForzenAmountLessThan(Long value) {
            addCriterion("forzen_amount <", value, "forzenAmount");
            return (Criteria) this;
        }

        public Criteria andForzenAmountLessThanOrEqualTo(Long value) {
            addCriterion("forzen_amount <=", value, "forzenAmount");
            return (Criteria) this;
        }

        public Criteria andForzenAmountIn(List<Long> values) {
            addCriterion("forzen_amount in", values, "forzenAmount");
            return (Criteria) this;
        }

        public Criteria andForzenAmountNotIn(List<Long> values) {
            addCriterion("forzen_amount not in", values, "forzenAmount");
            return (Criteria) this;
        }

        public Criteria andForzenAmountBetween(Long value1, Long value2) {
            addCriterion("forzen_amount between", value1, value2, "forzenAmount");
            return (Criteria) this;
        }

        public Criteria andForzenAmountNotBetween(Long value1, Long value2) {
            addCriterion("forzen_amount not between", value1, value2, "forzenAmount");
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

        public Criteria andIsExtensionIsNull() {
            addCriterion("is_extension is null");
            return (Criteria) this;
        }

        public Criteria andIsExtensionIsNotNull() {
            addCriterion("is_extension is not null");
            return (Criteria) this;
        }

        public Criteria andIsExtensionEqualTo(String value) {
            addCriterion("is_extension =", value, "isExtension");
            return (Criteria) this;
        }

        public Criteria andIsExtensionNotEqualTo(String value) {
            addCriterion("is_extension <>", value, "isExtension");
            return (Criteria) this;
        }

        public Criteria andIsExtensionGreaterThan(String value) {
            addCriterion("is_extension >", value, "isExtension");
            return (Criteria) this;
        }

        public Criteria andIsExtensionGreaterThanOrEqualTo(String value) {
            addCriterion("is_extension >=", value, "isExtension");
            return (Criteria) this;
        }

        public Criteria andIsExtensionLessThan(String value) {
            addCriterion("is_extension <", value, "isExtension");
            return (Criteria) this;
        }

        public Criteria andIsExtensionLessThanOrEqualTo(String value) {
            addCriterion("is_extension <=", value, "isExtension");
            return (Criteria) this;
        }

        public Criteria andIsExtensionLike(String value) {
            addCriterion("is_extension like", value, "isExtension");
            return (Criteria) this;
        }

        public Criteria andIsExtensionNotLike(String value) {
            addCriterion("is_extension not like", value, "isExtension");
            return (Criteria) this;
        }

        public Criteria andIsExtensionIn(List<String> values) {
            addCriterion("is_extension in", values, "isExtension");
            return (Criteria) this;
        }

        public Criteria andIsExtensionNotIn(List<String> values) {
            addCriterion("is_extension not in", values, "isExtension");
            return (Criteria) this;
        }

        public Criteria andIsExtensionBetween(String value1, String value2) {
            addCriterion("is_extension between", value1, value2, "isExtension");
            return (Criteria) this;
        }

        public Criteria andIsExtensionNotBetween(String value1, String value2) {
            addCriterion("is_extension not between", value1, value2, "isExtension");
            return (Criteria) this;
        }

        public Criteria andIsOverdueIsNull() {
            addCriterion("is_overdue is null");
            return (Criteria) this;
        }

        public Criteria andIsOverdueIsNotNull() {
            addCriterion("is_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andIsOverdueEqualTo(String value) {
            addCriterion("is_overdue =", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueNotEqualTo(String value) {
            addCriterion("is_overdue <>", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueGreaterThan(String value) {
            addCriterion("is_overdue >", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("is_overdue >=", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueLessThan(String value) {
            addCriterion("is_overdue <", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueLessThanOrEqualTo(String value) {
            addCriterion("is_overdue <=", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueLike(String value) {
            addCriterion("is_overdue like", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueNotLike(String value) {
            addCriterion("is_overdue not like", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueIn(List<String> values) {
            addCriterion("is_overdue in", values, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueNotIn(List<String> values) {
            addCriterion("is_overdue not in", values, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueBetween(String value1, String value2) {
            addCriterion("is_overdue between", value1, value2, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueNotBetween(String value1, String value2) {
            addCriterion("is_overdue not between", value1, value2, "isOverdue");
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