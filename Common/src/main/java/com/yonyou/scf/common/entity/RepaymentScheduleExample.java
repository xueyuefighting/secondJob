package com.yonyou.scf.common.entity;

import java.util.ArrayList;
import java.util.List;

public class RepaymentScheduleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepaymentScheduleExample() {
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

        public Criteria andRsIdIsNull() {
            addCriterion("rs_id is null");
            return (Criteria) this;
        }

        public Criteria andRsIdIsNotNull() {
            addCriterion("rs_id is not null");
            return (Criteria) this;
        }

        public Criteria andRsIdEqualTo(Long value) {
            addCriterion("rs_id =", value, "rsId");
            return (Criteria) this;
        }

        public Criteria andRsIdNotEqualTo(Long value) {
            addCriterion("rs_id <>", value, "rsId");
            return (Criteria) this;
        }

        public Criteria andRsIdGreaterThan(Long value) {
            addCriterion("rs_id >", value, "rsId");
            return (Criteria) this;
        }

        public Criteria andRsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("rs_id >=", value, "rsId");
            return (Criteria) this;
        }

        public Criteria andRsIdLessThan(Long value) {
            addCriterion("rs_id <", value, "rsId");
            return (Criteria) this;
        }

        public Criteria andRsIdLessThanOrEqualTo(Long value) {
            addCriterion("rs_id <=", value, "rsId");
            return (Criteria) this;
        }

        public Criteria andRsIdIn(List<Long> values) {
            addCriterion("rs_id in", values, "rsId");
            return (Criteria) this;
        }

        public Criteria andRsIdNotIn(List<Long> values) {
            addCriterion("rs_id not in", values, "rsId");
            return (Criteria) this;
        }

        public Criteria andRsIdBetween(Long value1, Long value2) {
            addCriterion("rs_id between", value1, value2, "rsId");
            return (Criteria) this;
        }

        public Criteria andRsIdNotBetween(Long value1, Long value2) {
            addCriterion("rs_id not between", value1, value2, "rsId");
            return (Criteria) this;
        }

        public Criteria andCapitalIdIsNull() {
            addCriterion("capital_id is null");
            return (Criteria) this;
        }

        public Criteria andCapitalIdIsNotNull() {
            addCriterion("capital_id is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalIdEqualTo(Long value) {
            addCriterion("capital_id =", value, "capitalId");
            return (Criteria) this;
        }

        public Criteria andCapitalIdNotEqualTo(Long value) {
            addCriterion("capital_id <>", value, "capitalId");
            return (Criteria) this;
        }

        public Criteria andCapitalIdGreaterThan(Long value) {
            addCriterion("capital_id >", value, "capitalId");
            return (Criteria) this;
        }

        public Criteria andCapitalIdGreaterThanOrEqualTo(Long value) {
            addCriterion("capital_id >=", value, "capitalId");
            return (Criteria) this;
        }

        public Criteria andCapitalIdLessThan(Long value) {
            addCriterion("capital_id <", value, "capitalId");
            return (Criteria) this;
        }

        public Criteria andCapitalIdLessThanOrEqualTo(Long value) {
            addCriterion("capital_id <=", value, "capitalId");
            return (Criteria) this;
        }

        public Criteria andCapitalIdIn(List<Long> values) {
            addCriterion("capital_id in", values, "capitalId");
            return (Criteria) this;
        }

        public Criteria andCapitalIdNotIn(List<Long> values) {
            addCriterion("capital_id not in", values, "capitalId");
            return (Criteria) this;
        }

        public Criteria andCapitalIdBetween(Long value1, Long value2) {
            addCriterion("capital_id between", value1, value2, "capitalId");
            return (Criteria) this;
        }

        public Criteria andCapitalIdNotBetween(Long value1, Long value2) {
            addCriterion("capital_id not between", value1, value2, "capitalId");
            return (Criteria) this;
        }

        public Criteria andLoanIdIsNull() {
            addCriterion("loan_id is null");
            return (Criteria) this;
        }

        public Criteria andLoanIdIsNotNull() {
            addCriterion("loan_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoanIdEqualTo(Long value) {
            addCriterion("loan_id =", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotEqualTo(Long value) {
            addCriterion("loan_id <>", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdGreaterThan(Long value) {
            addCriterion("loan_id >", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdGreaterThanOrEqualTo(Long value) {
            addCriterion("loan_id >=", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLessThan(Long value) {
            addCriterion("loan_id <", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLessThanOrEqualTo(Long value) {
            addCriterion("loan_id <=", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdIn(List<Long> values) {
            addCriterion("loan_id in", values, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotIn(List<Long> values) {
            addCriterion("loan_id not in", values, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdBetween(Long value1, Long value2) {
            addCriterion("loan_id between", value1, value2, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotBetween(Long value1, Long value2) {
            addCriterion("loan_id not between", value1, value2, "loanId");
            return (Criteria) this;
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

        public Criteria andBusinessNumberIsNull() {
            addCriterion("business_number is null");
            return (Criteria) this;
        }

        public Criteria andBusinessNumberIsNotNull() {
            addCriterion("business_number is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessNumberEqualTo(String value) {
            addCriterion("business_number =", value, "businessNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessNumberNotEqualTo(String value) {
            addCriterion("business_number <>", value, "businessNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessNumberGreaterThan(String value) {
            addCriterion("business_number >", value, "businessNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessNumberGreaterThanOrEqualTo(String value) {
            addCriterion("business_number >=", value, "businessNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessNumberLessThan(String value) {
            addCriterion("business_number <", value, "businessNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessNumberLessThanOrEqualTo(String value) {
            addCriterion("business_number <=", value, "businessNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessNumberLike(String value) {
            addCriterion("business_number like", value, "businessNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessNumberNotLike(String value) {
            addCriterion("business_number not like", value, "businessNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessNumberIn(List<String> values) {
            addCriterion("business_number in", values, "businessNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessNumberNotIn(List<String> values) {
            addCriterion("business_number not in", values, "businessNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessNumberBetween(String value1, String value2) {
            addCriterion("business_number between", value1, value2, "businessNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessNumberNotBetween(String value1, String value2) {
            addCriterion("business_number not between", value1, value2, "businessNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberIsNull() {
            addCriterion("member_number is null");
            return (Criteria) this;
        }

        public Criteria andMemberNumberIsNotNull() {
            addCriterion("member_number is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNumberEqualTo(String value) {
            addCriterion("member_number =", value, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberNotEqualTo(String value) {
            addCriterion("member_number <>", value, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberGreaterThan(String value) {
            addCriterion("member_number >", value, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberGreaterThanOrEqualTo(String value) {
            addCriterion("member_number >=", value, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberLessThan(String value) {
            addCriterion("member_number <", value, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberLessThanOrEqualTo(String value) {
            addCriterion("member_number <=", value, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberLike(String value) {
            addCriterion("member_number like", value, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberNotLike(String value) {
            addCriterion("member_number not like", value, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberIn(List<String> values) {
            addCriterion("member_number in", values, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberNotIn(List<String> values) {
            addCriterion("member_number not in", values, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberBetween(String value1, String value2) {
            addCriterion("member_number between", value1, value2, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberNotBetween(String value1, String value2) {
            addCriterion("member_number not between", value1, value2, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andPenNumberIsNull() {
            addCriterion("pen_number is null");
            return (Criteria) this;
        }

        public Criteria andPenNumberIsNotNull() {
            addCriterion("pen_number is not null");
            return (Criteria) this;
        }

        public Criteria andPenNumberEqualTo(String value) {
            addCriterion("pen_number =", value, "penNumber");
            return (Criteria) this;
        }

        public Criteria andPenNumberNotEqualTo(String value) {
            addCriterion("pen_number <>", value, "penNumber");
            return (Criteria) this;
        }

        public Criteria andPenNumberGreaterThan(String value) {
            addCriterion("pen_number >", value, "penNumber");
            return (Criteria) this;
        }

        public Criteria andPenNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pen_number >=", value, "penNumber");
            return (Criteria) this;
        }

        public Criteria andPenNumberLessThan(String value) {
            addCriterion("pen_number <", value, "penNumber");
            return (Criteria) this;
        }

        public Criteria andPenNumberLessThanOrEqualTo(String value) {
            addCriterion("pen_number <=", value, "penNumber");
            return (Criteria) this;
        }

        public Criteria andPenNumberLike(String value) {
            addCriterion("pen_number like", value, "penNumber");
            return (Criteria) this;
        }

        public Criteria andPenNumberNotLike(String value) {
            addCriterion("pen_number not like", value, "penNumber");
            return (Criteria) this;
        }

        public Criteria andPenNumberIn(List<String> values) {
            addCriterion("pen_number in", values, "penNumber");
            return (Criteria) this;
        }

        public Criteria andPenNumberNotIn(List<String> values) {
            addCriterion("pen_number not in", values, "penNumber");
            return (Criteria) this;
        }

        public Criteria andPenNumberBetween(String value1, String value2) {
            addCriterion("pen_number between", value1, value2, "penNumber");
            return (Criteria) this;
        }

        public Criteria andPenNumberNotBetween(String value1, String value2) {
            addCriterion("pen_number not between", value1, value2, "penNumber");
            return (Criteria) this;
        }

        public Criteria andLoanAccountIsNull() {
            addCriterion("loan_account is null");
            return (Criteria) this;
        }

        public Criteria andLoanAccountIsNotNull() {
            addCriterion("loan_account is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAccountEqualTo(String value) {
            addCriterion("loan_account =", value, "loanAccount");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNotEqualTo(String value) {
            addCriterion("loan_account <>", value, "loanAccount");
            return (Criteria) this;
        }

        public Criteria andLoanAccountGreaterThan(String value) {
            addCriterion("loan_account >", value, "loanAccount");
            return (Criteria) this;
        }

        public Criteria andLoanAccountGreaterThanOrEqualTo(String value) {
            addCriterion("loan_account >=", value, "loanAccount");
            return (Criteria) this;
        }

        public Criteria andLoanAccountLessThan(String value) {
            addCriterion("loan_account <", value, "loanAccount");
            return (Criteria) this;
        }

        public Criteria andLoanAccountLessThanOrEqualTo(String value) {
            addCriterion("loan_account <=", value, "loanAccount");
            return (Criteria) this;
        }

        public Criteria andLoanAccountLike(String value) {
            addCriterion("loan_account like", value, "loanAccount");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNotLike(String value) {
            addCriterion("loan_account not like", value, "loanAccount");
            return (Criteria) this;
        }

        public Criteria andLoanAccountIn(List<String> values) {
            addCriterion("loan_account in", values, "loanAccount");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNotIn(List<String> values) {
            addCriterion("loan_account not in", values, "loanAccount");
            return (Criteria) this;
        }

        public Criteria andLoanAccountBetween(String value1, String value2) {
            addCriterion("loan_account between", value1, value2, "loanAccount");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNotBetween(String value1, String value2) {
            addCriterion("loan_account not between", value1, value2, "loanAccount");
            return (Criteria) this;
        }

        public Criteria andLoanDebitNumberIsNull() {
            addCriterion("loan_debit_number is null");
            return (Criteria) this;
        }

        public Criteria andLoanDebitNumberIsNotNull() {
            addCriterion("loan_debit_number is not null");
            return (Criteria) this;
        }

        public Criteria andLoanDebitNumberEqualTo(String value) {
            addCriterion("loan_debit_number =", value, "loanDebitNumber");
            return (Criteria) this;
        }

        public Criteria andLoanDebitNumberNotEqualTo(String value) {
            addCriterion("loan_debit_number <>", value, "loanDebitNumber");
            return (Criteria) this;
        }

        public Criteria andLoanDebitNumberGreaterThan(String value) {
            addCriterion("loan_debit_number >", value, "loanDebitNumber");
            return (Criteria) this;
        }

        public Criteria andLoanDebitNumberGreaterThanOrEqualTo(String value) {
            addCriterion("loan_debit_number >=", value, "loanDebitNumber");
            return (Criteria) this;
        }

        public Criteria andLoanDebitNumberLessThan(String value) {
            addCriterion("loan_debit_number <", value, "loanDebitNumber");
            return (Criteria) this;
        }

        public Criteria andLoanDebitNumberLessThanOrEqualTo(String value) {
            addCriterion("loan_debit_number <=", value, "loanDebitNumber");
            return (Criteria) this;
        }

        public Criteria andLoanDebitNumberLike(String value) {
            addCriterion("loan_debit_number like", value, "loanDebitNumber");
            return (Criteria) this;
        }

        public Criteria andLoanDebitNumberNotLike(String value) {
            addCriterion("loan_debit_number not like", value, "loanDebitNumber");
            return (Criteria) this;
        }

        public Criteria andLoanDebitNumberIn(List<String> values) {
            addCriterion("loan_debit_number in", values, "loanDebitNumber");
            return (Criteria) this;
        }

        public Criteria andLoanDebitNumberNotIn(List<String> values) {
            addCriterion("loan_debit_number not in", values, "loanDebitNumber");
            return (Criteria) this;
        }

        public Criteria andLoanDebitNumberBetween(String value1, String value2) {
            addCriterion("loan_debit_number between", value1, value2, "loanDebitNumber");
            return (Criteria) this;
        }

        public Criteria andLoanDebitNumberNotBetween(String value1, String value2) {
            addCriterion("loan_debit_number not between", value1, value2, "loanDebitNumber");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNull() {
            addCriterion("product_code is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("product_code is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("product_code =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("product_code <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("product_code >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("product_code >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(String value) {
            addCriterion("product_code <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("product_code <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLike(String value) {
            addCriterion("product_code like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotLike(String value) {
            addCriterion("product_code not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<String> values) {
            addCriterion("product_code in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<String> values) {
            addCriterion("product_code not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("product_code between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("product_code not between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andClientNumberIsNull() {
            addCriterion("client_number is null");
            return (Criteria) this;
        }

        public Criteria andClientNumberIsNotNull() {
            addCriterion("client_number is not null");
            return (Criteria) this;
        }

        public Criteria andClientNumberEqualTo(String value) {
            addCriterion("client_number =", value, "clientNumber");
            return (Criteria) this;
        }

        public Criteria andClientNumberNotEqualTo(String value) {
            addCriterion("client_number <>", value, "clientNumber");
            return (Criteria) this;
        }

        public Criteria andClientNumberGreaterThan(String value) {
            addCriterion("client_number >", value, "clientNumber");
            return (Criteria) this;
        }

        public Criteria andClientNumberGreaterThanOrEqualTo(String value) {
            addCriterion("client_number >=", value, "clientNumber");
            return (Criteria) this;
        }

        public Criteria andClientNumberLessThan(String value) {
            addCriterion("client_number <", value, "clientNumber");
            return (Criteria) this;
        }

        public Criteria andClientNumberLessThanOrEqualTo(String value) {
            addCriterion("client_number <=", value, "clientNumber");
            return (Criteria) this;
        }

        public Criteria andClientNumberLike(String value) {
            addCriterion("client_number like", value, "clientNumber");
            return (Criteria) this;
        }

        public Criteria andClientNumberNotLike(String value) {
            addCriterion("client_number not like", value, "clientNumber");
            return (Criteria) this;
        }

        public Criteria andClientNumberIn(List<String> values) {
            addCriterion("client_number in", values, "clientNumber");
            return (Criteria) this;
        }

        public Criteria andClientNumberNotIn(List<String> values) {
            addCriterion("client_number not in", values, "clientNumber");
            return (Criteria) this;
        }

        public Criteria andClientNumberBetween(String value1, String value2) {
            addCriterion("client_number between", value1, value2, "clientNumber");
            return (Criteria) this;
        }

        public Criteria andClientNumberNotBetween(String value1, String value2) {
            addCriterion("client_number not between", value1, value2, "clientNumber");
            return (Criteria) this;
        }

        public Criteria andClientNameIsNull() {
            addCriterion("client_name is null");
            return (Criteria) this;
        }

        public Criteria andClientNameIsNotNull() {
            addCriterion("client_name is not null");
            return (Criteria) this;
        }

        public Criteria andClientNameEqualTo(String value) {
            addCriterion("client_name =", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotEqualTo(String value) {
            addCriterion("client_name <>", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameGreaterThan(String value) {
            addCriterion("client_name >", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameGreaterThanOrEqualTo(String value) {
            addCriterion("client_name >=", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLessThan(String value) {
            addCriterion("client_name <", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLessThanOrEqualTo(String value) {
            addCriterion("client_name <=", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLike(String value) {
            addCriterion("client_name like", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotLike(String value) {
            addCriterion("client_name not like", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameIn(List<String> values) {
            addCriterion("client_name in", values, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotIn(List<String> values) {
            addCriterion("client_name not in", values, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameBetween(String value1, String value2) {
            addCriterion("client_name between", value1, value2, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotBetween(String value1, String value2) {
            addCriterion("client_name not between", value1, value2, "clientName");
            return (Criteria) this;
        }

        public Criteria andContractAmountIsNull() {
            addCriterion("contract_amount is null");
            return (Criteria) this;
        }

        public Criteria andContractAmountIsNotNull() {
            addCriterion("contract_amount is not null");
            return (Criteria) this;
        }

        public Criteria andContractAmountEqualTo(Long value) {
            addCriterion("contract_amount =", value, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountNotEqualTo(Long value) {
            addCriterion("contract_amount <>", value, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountGreaterThan(Long value) {
            addCriterion("contract_amount >", value, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("contract_amount >=", value, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountLessThan(Long value) {
            addCriterion("contract_amount <", value, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountLessThanOrEqualTo(Long value) {
            addCriterion("contract_amount <=", value, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountIn(List<Long> values) {
            addCriterion("contract_amount in", values, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountNotIn(List<Long> values) {
            addCriterion("contract_amount not in", values, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountBetween(Long value1, Long value2) {
            addCriterion("contract_amount between", value1, value2, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountNotBetween(Long value1, Long value2) {
            addCriterion("contract_amount not between", value1, value2, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountIsNull() {
            addCriterion("borrow_amount is null");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountIsNotNull() {
            addCriterion("borrow_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountEqualTo(Long value) {
            addCriterion("borrow_amount =", value, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountNotEqualTo(Long value) {
            addCriterion("borrow_amount <>", value, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountGreaterThan(Long value) {
            addCriterion("borrow_amount >", value, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("borrow_amount >=", value, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountLessThan(Long value) {
            addCriterion("borrow_amount <", value, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountLessThanOrEqualTo(Long value) {
            addCriterion("borrow_amount <=", value, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountIn(List<Long> values) {
            addCriterion("borrow_amount in", values, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountNotIn(List<Long> values) {
            addCriterion("borrow_amount not in", values, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountBetween(Long value1, Long value2) {
            addCriterion("borrow_amount between", value1, value2, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountNotBetween(Long value1, Long value2) {
            addCriterion("borrow_amount not between", value1, value2, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andYmRateMakrIsNull() {
            addCriterion("ym_rate_makr is null");
            return (Criteria) this;
        }

        public Criteria andYmRateMakrIsNotNull() {
            addCriterion("ym_rate_makr is not null");
            return (Criteria) this;
        }

        public Criteria andYmRateMakrEqualTo(String value) {
            addCriterion("ym_rate_makr =", value, "ymRateMakr");
            return (Criteria) this;
        }

        public Criteria andYmRateMakrNotEqualTo(String value) {
            addCriterion("ym_rate_makr <>", value, "ymRateMakr");
            return (Criteria) this;
        }

        public Criteria andYmRateMakrGreaterThan(String value) {
            addCriterion("ym_rate_makr >", value, "ymRateMakr");
            return (Criteria) this;
        }

        public Criteria andYmRateMakrGreaterThanOrEqualTo(String value) {
            addCriterion("ym_rate_makr >=", value, "ymRateMakr");
            return (Criteria) this;
        }

        public Criteria andYmRateMakrLessThan(String value) {
            addCriterion("ym_rate_makr <", value, "ymRateMakr");
            return (Criteria) this;
        }

        public Criteria andYmRateMakrLessThanOrEqualTo(String value) {
            addCriterion("ym_rate_makr <=", value, "ymRateMakr");
            return (Criteria) this;
        }

        public Criteria andYmRateMakrLike(String value) {
            addCriterion("ym_rate_makr like", value, "ymRateMakr");
            return (Criteria) this;
        }

        public Criteria andYmRateMakrNotLike(String value) {
            addCriterion("ym_rate_makr not like", value, "ymRateMakr");
            return (Criteria) this;
        }

        public Criteria andYmRateMakrIn(List<String> values) {
            addCriterion("ym_rate_makr in", values, "ymRateMakr");
            return (Criteria) this;
        }

        public Criteria andYmRateMakrNotIn(List<String> values) {
            addCriterion("ym_rate_makr not in", values, "ymRateMakr");
            return (Criteria) this;
        }

        public Criteria andYmRateMakrBetween(String value1, String value2) {
            addCriterion("ym_rate_makr between", value1, value2, "ymRateMakr");
            return (Criteria) this;
        }

        public Criteria andYmRateMakrNotBetween(String value1, String value2) {
            addCriterion("ym_rate_makr not between", value1, value2, "ymRateMakr");
            return (Criteria) this;
        }

        public Criteria andAnnualInterestRateIsNull() {
            addCriterion("annual_interest_rate is null");
            return (Criteria) this;
        }

        public Criteria andAnnualInterestRateIsNotNull() {
            addCriterion("annual_interest_rate is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualInterestRateEqualTo(Long value) {
            addCriterion("annual_interest_rate =", value, "annualInterestRate");
            return (Criteria) this;
        }

        public Criteria andAnnualInterestRateNotEqualTo(Long value) {
            addCriterion("annual_interest_rate <>", value, "annualInterestRate");
            return (Criteria) this;
        }

        public Criteria andAnnualInterestRateGreaterThan(Long value) {
            addCriterion("annual_interest_rate >", value, "annualInterestRate");
            return (Criteria) this;
        }

        public Criteria andAnnualInterestRateGreaterThanOrEqualTo(Long value) {
            addCriterion("annual_interest_rate >=", value, "annualInterestRate");
            return (Criteria) this;
        }

        public Criteria andAnnualInterestRateLessThan(Long value) {
            addCriterion("annual_interest_rate <", value, "annualInterestRate");
            return (Criteria) this;
        }

        public Criteria andAnnualInterestRateLessThanOrEqualTo(Long value) {
            addCriterion("annual_interest_rate <=", value, "annualInterestRate");
            return (Criteria) this;
        }

        public Criteria andAnnualInterestRateIn(List<Long> values) {
            addCriterion("annual_interest_rate in", values, "annualInterestRate");
            return (Criteria) this;
        }

        public Criteria andAnnualInterestRateNotIn(List<Long> values) {
            addCriterion("annual_interest_rate not in", values, "annualInterestRate");
            return (Criteria) this;
        }

        public Criteria andAnnualInterestRateBetween(Long value1, Long value2) {
            addCriterion("annual_interest_rate between", value1, value2, "annualInterestRate");
            return (Criteria) this;
        }

        public Criteria andAnnualInterestRateNotBetween(Long value1, Long value2) {
            addCriterion("annual_interest_rate not between", value1, value2, "annualInterestRate");
            return (Criteria) this;
        }

        public Criteria andRepaymentIsNull() {
            addCriterion("repayment is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentIsNotNull() {
            addCriterion("repayment is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentEqualTo(String value) {
            addCriterion("repayment =", value, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentNotEqualTo(String value) {
            addCriterion("repayment <>", value, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentGreaterThan(String value) {
            addCriterion("repayment >", value, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentGreaterThanOrEqualTo(String value) {
            addCriterion("repayment >=", value, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentLessThan(String value) {
            addCriterion("repayment <", value, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentLessThanOrEqualTo(String value) {
            addCriterion("repayment <=", value, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentLike(String value) {
            addCriterion("repayment like", value, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentNotLike(String value) {
            addCriterion("repayment not like", value, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentIn(List<String> values) {
            addCriterion("repayment in", values, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentNotIn(List<String> values) {
            addCriterion("repayment not in", values, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentBetween(String value1, String value2) {
            addCriterion("repayment between", value1, value2, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentNotBetween(String value1, String value2) {
            addCriterion("repayment not between", value1, value2, "repayment");
            return (Criteria) this;
        }

        public Criteria andEqualRulesIsNull() {
            addCriterion("equal_rules is null");
            return (Criteria) this;
        }

        public Criteria andEqualRulesIsNotNull() {
            addCriterion("equal_rules is not null");
            return (Criteria) this;
        }

        public Criteria andEqualRulesEqualTo(String value) {
            addCriterion("equal_rules =", value, "equalRules");
            return (Criteria) this;
        }

        public Criteria andEqualRulesNotEqualTo(String value) {
            addCriterion("equal_rules <>", value, "equalRules");
            return (Criteria) this;
        }

        public Criteria andEqualRulesGreaterThan(String value) {
            addCriterion("equal_rules >", value, "equalRules");
            return (Criteria) this;
        }

        public Criteria andEqualRulesGreaterThanOrEqualTo(String value) {
            addCriterion("equal_rules >=", value, "equalRules");
            return (Criteria) this;
        }

        public Criteria andEqualRulesLessThan(String value) {
            addCriterion("equal_rules <", value, "equalRules");
            return (Criteria) this;
        }

        public Criteria andEqualRulesLessThanOrEqualTo(String value) {
            addCriterion("equal_rules <=", value, "equalRules");
            return (Criteria) this;
        }

        public Criteria andEqualRulesLike(String value) {
            addCriterion("equal_rules like", value, "equalRules");
            return (Criteria) this;
        }

        public Criteria andEqualRulesNotLike(String value) {
            addCriterion("equal_rules not like", value, "equalRules");
            return (Criteria) this;
        }

        public Criteria andEqualRulesIn(List<String> values) {
            addCriterion("equal_rules in", values, "equalRules");
            return (Criteria) this;
        }

        public Criteria andEqualRulesNotIn(List<String> values) {
            addCriterion("equal_rules not in", values, "equalRules");
            return (Criteria) this;
        }

        public Criteria andEqualRulesBetween(String value1, String value2) {
            addCriterion("equal_rules between", value1, value2, "equalRules");
            return (Criteria) this;
        }

        public Criteria andEqualRulesNotBetween(String value1, String value2) {
            addCriterion("equal_rules not between", value1, value2, "equalRules");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodsNumberIsNull() {
            addCriterion("total_periods_number is null");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodsNumberIsNotNull() {
            addCriterion("total_periods_number is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodsNumberEqualTo(String value) {
            addCriterion("total_periods_number =", value, "totalPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodsNumberNotEqualTo(String value) {
            addCriterion("total_periods_number <>", value, "totalPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodsNumberGreaterThan(String value) {
            addCriterion("total_periods_number >", value, "totalPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("total_periods_number >=", value, "totalPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodsNumberLessThan(String value) {
            addCriterion("total_periods_number <", value, "totalPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodsNumberLessThanOrEqualTo(String value) {
            addCriterion("total_periods_number <=", value, "totalPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodsNumberLike(String value) {
            addCriterion("total_periods_number like", value, "totalPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodsNumberNotLike(String value) {
            addCriterion("total_periods_number not like", value, "totalPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodsNumberIn(List<String> values) {
            addCriterion("total_periods_number in", values, "totalPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodsNumberNotIn(List<String> values) {
            addCriterion("total_periods_number not in", values, "totalPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodsNumberBetween(String value1, String value2) {
            addCriterion("total_periods_number between", value1, value2, "totalPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodsNumberNotBetween(String value1, String value2) {
            addCriterion("total_periods_number not between", value1, value2, "totalPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodsNumberIsNull() {
            addCriterion("current_periods_number is null");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodsNumberIsNotNull() {
            addCriterion("current_periods_number is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodsNumberEqualTo(String value) {
            addCriterion("current_periods_number =", value, "currentPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodsNumberNotEqualTo(String value) {
            addCriterion("current_periods_number <>", value, "currentPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodsNumberGreaterThan(String value) {
            addCriterion("current_periods_number >", value, "currentPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("current_periods_number >=", value, "currentPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodsNumberLessThan(String value) {
            addCriterion("current_periods_number <", value, "currentPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodsNumberLessThanOrEqualTo(String value) {
            addCriterion("current_periods_number <=", value, "currentPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodsNumberLike(String value) {
            addCriterion("current_periods_number like", value, "currentPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodsNumberNotLike(String value) {
            addCriterion("current_periods_number not like", value, "currentPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodsNumberIn(List<String> values) {
            addCriterion("current_periods_number in", values, "currentPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodsNumberNotIn(List<String> values) {
            addCriterion("current_periods_number not in", values, "currentPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodsNumberBetween(String value1, String value2) {
            addCriterion("current_periods_number between", value1, value2, "currentPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodsNumberNotBetween(String value1, String value2) {
            addCriterion("current_periods_number not between", value1, value2, "currentPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andOverduePeriodsNumberIsNull() {
            addCriterion("overdue_periods_number is null");
            return (Criteria) this;
        }

        public Criteria andOverduePeriodsNumberIsNotNull() {
            addCriterion("overdue_periods_number is not null");
            return (Criteria) this;
        }

        public Criteria andOverduePeriodsNumberEqualTo(String value) {
            addCriterion("overdue_periods_number =", value, "overduePeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andOverduePeriodsNumberNotEqualTo(String value) {
            addCriterion("overdue_periods_number <>", value, "overduePeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andOverduePeriodsNumberGreaterThan(String value) {
            addCriterion("overdue_periods_number >", value, "overduePeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andOverduePeriodsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("overdue_periods_number >=", value, "overduePeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andOverduePeriodsNumberLessThan(String value) {
            addCriterion("overdue_periods_number <", value, "overduePeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andOverduePeriodsNumberLessThanOrEqualTo(String value) {
            addCriterion("overdue_periods_number <=", value, "overduePeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andOverduePeriodsNumberLike(String value) {
            addCriterion("overdue_periods_number like", value, "overduePeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andOverduePeriodsNumberNotLike(String value) {
            addCriterion("overdue_periods_number not like", value, "overduePeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andOverduePeriodsNumberIn(List<String> values) {
            addCriterion("overdue_periods_number in", values, "overduePeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andOverduePeriodsNumberNotIn(List<String> values) {
            addCriterion("overdue_periods_number not in", values, "overduePeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andOverduePeriodsNumberBetween(String value1, String value2) {
            addCriterion("overdue_periods_number between", value1, value2, "overduePeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andOverduePeriodsNumberNotBetween(String value1, String value2) {
            addCriterion("overdue_periods_number not between", value1, value2, "overduePeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andRemainingPeriodsNumberIsNull() {
            addCriterion("remaining_periods_number is null");
            return (Criteria) this;
        }

        public Criteria andRemainingPeriodsNumberIsNotNull() {
            addCriterion("remaining_periods_number is not null");
            return (Criteria) this;
        }

        public Criteria andRemainingPeriodsNumberEqualTo(String value) {
            addCriterion("remaining_periods_number =", value, "remainingPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andRemainingPeriodsNumberNotEqualTo(String value) {
            addCriterion("remaining_periods_number <>", value, "remainingPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andRemainingPeriodsNumberGreaterThan(String value) {
            addCriterion("remaining_periods_number >", value, "remainingPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andRemainingPeriodsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("remaining_periods_number >=", value, "remainingPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andRemainingPeriodsNumberLessThan(String value) {
            addCriterion("remaining_periods_number <", value, "remainingPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andRemainingPeriodsNumberLessThanOrEqualTo(String value) {
            addCriterion("remaining_periods_number <=", value, "remainingPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andRemainingPeriodsNumberLike(String value) {
            addCriterion("remaining_periods_number like", value, "remainingPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andRemainingPeriodsNumberNotLike(String value) {
            addCriterion("remaining_periods_number not like", value, "remainingPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andRemainingPeriodsNumberIn(List<String> values) {
            addCriterion("remaining_periods_number in", values, "remainingPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andRemainingPeriodsNumberNotIn(List<String> values) {
            addCriterion("remaining_periods_number not in", values, "remainingPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andRemainingPeriodsNumberBetween(String value1, String value2) {
            addCriterion("remaining_periods_number between", value1, value2, "remainingPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andRemainingPeriodsNumberNotBetween(String value1, String value2) {
            addCriterion("remaining_periods_number not between", value1, value2, "remainingPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andOverPeriodsNumberIsNull() {
            addCriterion("over_periods_number is null");
            return (Criteria) this;
        }

        public Criteria andOverPeriodsNumberIsNotNull() {
            addCriterion("over_periods_number is not null");
            return (Criteria) this;
        }

        public Criteria andOverPeriodsNumberEqualTo(String value) {
            addCriterion("over_periods_number =", value, "overPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andOverPeriodsNumberNotEqualTo(String value) {
            addCriterion("over_periods_number <>", value, "overPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andOverPeriodsNumberGreaterThan(String value) {
            addCriterion("over_periods_number >", value, "overPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andOverPeriodsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("over_periods_number >=", value, "overPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andOverPeriodsNumberLessThan(String value) {
            addCriterion("over_periods_number <", value, "overPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andOverPeriodsNumberLessThanOrEqualTo(String value) {
            addCriterion("over_periods_number <=", value, "overPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andOverPeriodsNumberLike(String value) {
            addCriterion("over_periods_number like", value, "overPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andOverPeriodsNumberNotLike(String value) {
            addCriterion("over_periods_number not like", value, "overPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andOverPeriodsNumberIn(List<String> values) {
            addCriterion("over_periods_number in", values, "overPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andOverPeriodsNumberNotIn(List<String> values) {
            addCriterion("over_periods_number not in", values, "overPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andOverPeriodsNumberBetween(String value1, String value2) {
            addCriterion("over_periods_number between", value1, value2, "overPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andOverPeriodsNumberNotBetween(String value1, String value2) {
            addCriterion("over_periods_number not between", value1, value2, "overPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andTotalAlreadyPrincipalIsNull() {
            addCriterion("total_already_principal is null");
            return (Criteria) this;
        }

        public Criteria andTotalAlreadyPrincipalIsNotNull() {
            addCriterion("total_already_principal is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAlreadyPrincipalEqualTo(Long value) {
            addCriterion("total_already_principal =", value, "totalAlreadyPrincipal");
            return (Criteria) this;
        }

        public Criteria andTotalAlreadyPrincipalNotEqualTo(Long value) {
            addCriterion("total_already_principal <>", value, "totalAlreadyPrincipal");
            return (Criteria) this;
        }

        public Criteria andTotalAlreadyPrincipalGreaterThan(Long value) {
            addCriterion("total_already_principal >", value, "totalAlreadyPrincipal");
            return (Criteria) this;
        }

        public Criteria andTotalAlreadyPrincipalGreaterThanOrEqualTo(Long value) {
            addCriterion("total_already_principal >=", value, "totalAlreadyPrincipal");
            return (Criteria) this;
        }

        public Criteria andTotalAlreadyPrincipalLessThan(Long value) {
            addCriterion("total_already_principal <", value, "totalAlreadyPrincipal");
            return (Criteria) this;
        }

        public Criteria andTotalAlreadyPrincipalLessThanOrEqualTo(Long value) {
            addCriterion("total_already_principal <=", value, "totalAlreadyPrincipal");
            return (Criteria) this;
        }

        public Criteria andTotalAlreadyPrincipalIn(List<Long> values) {
            addCriterion("total_already_principal in", values, "totalAlreadyPrincipal");
            return (Criteria) this;
        }

        public Criteria andTotalAlreadyPrincipalNotIn(List<Long> values) {
            addCriterion("total_already_principal not in", values, "totalAlreadyPrincipal");
            return (Criteria) this;
        }

        public Criteria andTotalAlreadyPrincipalBetween(Long value1, Long value2) {
            addCriterion("total_already_principal between", value1, value2, "totalAlreadyPrincipal");
            return (Criteria) this;
        }

        public Criteria andTotalAlreadyPrincipalNotBetween(Long value1, Long value2) {
            addCriterion("total_already_principal not between", value1, value2, "totalAlreadyPrincipal");
            return (Criteria) this;
        }

        public Criteria andTotalAlreadyInterestIsNull() {
            addCriterion("total_already_interest is null");
            return (Criteria) this;
        }

        public Criteria andTotalAlreadyInterestIsNotNull() {
            addCriterion("total_already_interest is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAlreadyInterestEqualTo(Long value) {
            addCriterion("total_already_interest =", value, "totalAlreadyInterest");
            return (Criteria) this;
        }

        public Criteria andTotalAlreadyInterestNotEqualTo(Long value) {
            addCriterion("total_already_interest <>", value, "totalAlreadyInterest");
            return (Criteria) this;
        }

        public Criteria andTotalAlreadyInterestGreaterThan(Long value) {
            addCriterion("total_already_interest >", value, "totalAlreadyInterest");
            return (Criteria) this;
        }

        public Criteria andTotalAlreadyInterestGreaterThanOrEqualTo(Long value) {
            addCriterion("total_already_interest >=", value, "totalAlreadyInterest");
            return (Criteria) this;
        }

        public Criteria andTotalAlreadyInterestLessThan(Long value) {
            addCriterion("total_already_interest <", value, "totalAlreadyInterest");
            return (Criteria) this;
        }

        public Criteria andTotalAlreadyInterestLessThanOrEqualTo(Long value) {
            addCriterion("total_already_interest <=", value, "totalAlreadyInterest");
            return (Criteria) this;
        }

        public Criteria andTotalAlreadyInterestIn(List<Long> values) {
            addCriterion("total_already_interest in", values, "totalAlreadyInterest");
            return (Criteria) this;
        }

        public Criteria andTotalAlreadyInterestNotIn(List<Long> values) {
            addCriterion("total_already_interest not in", values, "totalAlreadyInterest");
            return (Criteria) this;
        }

        public Criteria andTotalAlreadyInterestBetween(Long value1, Long value2) {
            addCriterion("total_already_interest between", value1, value2, "totalAlreadyInterest");
            return (Criteria) this;
        }

        public Criteria andTotalAlreadyInterestNotBetween(Long value1, Long value2) {
            addCriterion("total_already_interest not between", value1, value2, "totalAlreadyInterest");
            return (Criteria) this;
        }

        public Criteria andLoanFormIsNull() {
            addCriterion("loan_form is null");
            return (Criteria) this;
        }

        public Criteria andLoanFormIsNotNull() {
            addCriterion("loan_form is not null");
            return (Criteria) this;
        }

        public Criteria andLoanFormEqualTo(String value) {
            addCriterion("loan_form =", value, "loanForm");
            return (Criteria) this;
        }

        public Criteria andLoanFormNotEqualTo(String value) {
            addCriterion("loan_form <>", value, "loanForm");
            return (Criteria) this;
        }

        public Criteria andLoanFormGreaterThan(String value) {
            addCriterion("loan_form >", value, "loanForm");
            return (Criteria) this;
        }

        public Criteria andLoanFormGreaterThanOrEqualTo(String value) {
            addCriterion("loan_form >=", value, "loanForm");
            return (Criteria) this;
        }

        public Criteria andLoanFormLessThan(String value) {
            addCriterion("loan_form <", value, "loanForm");
            return (Criteria) this;
        }

        public Criteria andLoanFormLessThanOrEqualTo(String value) {
            addCriterion("loan_form <=", value, "loanForm");
            return (Criteria) this;
        }

        public Criteria andLoanFormLike(String value) {
            addCriterion("loan_form like", value, "loanForm");
            return (Criteria) this;
        }

        public Criteria andLoanFormNotLike(String value) {
            addCriterion("loan_form not like", value, "loanForm");
            return (Criteria) this;
        }

        public Criteria andLoanFormIn(List<String> values) {
            addCriterion("loan_form in", values, "loanForm");
            return (Criteria) this;
        }

        public Criteria andLoanFormNotIn(List<String> values) {
            addCriterion("loan_form not in", values, "loanForm");
            return (Criteria) this;
        }

        public Criteria andLoanFormBetween(String value1, String value2) {
            addCriterion("loan_form between", value1, value2, "loanForm");
            return (Criteria) this;
        }

        public Criteria andLoanFormNotBetween(String value1, String value2) {
            addCriterion("loan_form not between", value1, value2, "loanForm");
            return (Criteria) this;
        }

        public Criteria andLoanAccountStateIsNull() {
            addCriterion("loan_account_state is null");
            return (Criteria) this;
        }

        public Criteria andLoanAccountStateIsNotNull() {
            addCriterion("loan_account_state is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAccountStateEqualTo(String value) {
            addCriterion("loan_account_state =", value, "loanAccountState");
            return (Criteria) this;
        }

        public Criteria andLoanAccountStateNotEqualTo(String value) {
            addCriterion("loan_account_state <>", value, "loanAccountState");
            return (Criteria) this;
        }

        public Criteria andLoanAccountStateGreaterThan(String value) {
            addCriterion("loan_account_state >", value, "loanAccountState");
            return (Criteria) this;
        }

        public Criteria andLoanAccountStateGreaterThanOrEqualTo(String value) {
            addCriterion("loan_account_state >=", value, "loanAccountState");
            return (Criteria) this;
        }

        public Criteria andLoanAccountStateLessThan(String value) {
            addCriterion("loan_account_state <", value, "loanAccountState");
            return (Criteria) this;
        }

        public Criteria andLoanAccountStateLessThanOrEqualTo(String value) {
            addCriterion("loan_account_state <=", value, "loanAccountState");
            return (Criteria) this;
        }

        public Criteria andLoanAccountStateLike(String value) {
            addCriterion("loan_account_state like", value, "loanAccountState");
            return (Criteria) this;
        }

        public Criteria andLoanAccountStateNotLike(String value) {
            addCriterion("loan_account_state not like", value, "loanAccountState");
            return (Criteria) this;
        }

        public Criteria andLoanAccountStateIn(List<String> values) {
            addCriterion("loan_account_state in", values, "loanAccountState");
            return (Criteria) this;
        }

        public Criteria andLoanAccountStateNotIn(List<String> values) {
            addCriterion("loan_account_state not in", values, "loanAccountState");
            return (Criteria) this;
        }

        public Criteria andLoanAccountStateBetween(String value1, String value2) {
            addCriterion("loan_account_state between", value1, value2, "loanAccountState");
            return (Criteria) this;
        }

        public Criteria andLoanAccountStateNotBetween(String value1, String value2) {
            addCriterion("loan_account_state not between", value1, value2, "loanAccountState");
            return (Criteria) this;
        }

        public Criteria andAccruedAccrualStateIsNull() {
            addCriterion("accrued_accrual_state is null");
            return (Criteria) this;
        }

        public Criteria andAccruedAccrualStateIsNotNull() {
            addCriterion("accrued_accrual_state is not null");
            return (Criteria) this;
        }

        public Criteria andAccruedAccrualStateEqualTo(String value) {
            addCriterion("accrued_accrual_state =", value, "accruedAccrualState");
            return (Criteria) this;
        }

        public Criteria andAccruedAccrualStateNotEqualTo(String value) {
            addCriterion("accrued_accrual_state <>", value, "accruedAccrualState");
            return (Criteria) this;
        }

        public Criteria andAccruedAccrualStateGreaterThan(String value) {
            addCriterion("accrued_accrual_state >", value, "accruedAccrualState");
            return (Criteria) this;
        }

        public Criteria andAccruedAccrualStateGreaterThanOrEqualTo(String value) {
            addCriterion("accrued_accrual_state >=", value, "accruedAccrualState");
            return (Criteria) this;
        }

        public Criteria andAccruedAccrualStateLessThan(String value) {
            addCriterion("accrued_accrual_state <", value, "accruedAccrualState");
            return (Criteria) this;
        }

        public Criteria andAccruedAccrualStateLessThanOrEqualTo(String value) {
            addCriterion("accrued_accrual_state <=", value, "accruedAccrualState");
            return (Criteria) this;
        }

        public Criteria andAccruedAccrualStateLike(String value) {
            addCriterion("accrued_accrual_state like", value, "accruedAccrualState");
            return (Criteria) this;
        }

        public Criteria andAccruedAccrualStateNotLike(String value) {
            addCriterion("accrued_accrual_state not like", value, "accruedAccrualState");
            return (Criteria) this;
        }

        public Criteria andAccruedAccrualStateIn(List<String> values) {
            addCriterion("accrued_accrual_state in", values, "accruedAccrualState");
            return (Criteria) this;
        }

        public Criteria andAccruedAccrualStateNotIn(List<String> values) {
            addCriterion("accrued_accrual_state not in", values, "accruedAccrualState");
            return (Criteria) this;
        }

        public Criteria andAccruedAccrualStateBetween(String value1, String value2) {
            addCriterion("accrued_accrual_state between", value1, value2, "accruedAccrualState");
            return (Criteria) this;
        }

        public Criteria andAccruedAccrualStateNotBetween(String value1, String value2) {
            addCriterion("accrued_accrual_state not between", value1, value2, "accruedAccrualState");
            return (Criteria) this;
        }

        public Criteria andTotalRepaymentAmountIsNull() {
            addCriterion("total_repayment_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalRepaymentAmountIsNotNull() {
            addCriterion("total_repayment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalRepaymentAmountEqualTo(Long value) {
            addCriterion("total_repayment_amount =", value, "totalRepaymentAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRepaymentAmountNotEqualTo(Long value) {
            addCriterion("total_repayment_amount <>", value, "totalRepaymentAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRepaymentAmountGreaterThan(Long value) {
            addCriterion("total_repayment_amount >", value, "totalRepaymentAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRepaymentAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("total_repayment_amount >=", value, "totalRepaymentAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRepaymentAmountLessThan(Long value) {
            addCriterion("total_repayment_amount <", value, "totalRepaymentAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRepaymentAmountLessThanOrEqualTo(Long value) {
            addCriterion("total_repayment_amount <=", value, "totalRepaymentAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRepaymentAmountIn(List<Long> values) {
            addCriterion("total_repayment_amount in", values, "totalRepaymentAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRepaymentAmountNotIn(List<Long> values) {
            addCriterion("total_repayment_amount not in", values, "totalRepaymentAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRepaymentAmountBetween(Long value1, Long value2) {
            addCriterion("total_repayment_amount between", value1, value2, "totalRepaymentAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRepaymentAmountNotBetween(Long value1, Long value2) {
            addCriterion("total_repayment_amount not between", value1, value2, "totalRepaymentAmount");
            return (Criteria) this;
        }

        public Criteria andEachRepaymentAmountIsNull() {
            addCriterion("each_repayment_amount is null");
            return (Criteria) this;
        }

        public Criteria andEachRepaymentAmountIsNotNull() {
            addCriterion("each_repayment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andEachRepaymentAmountEqualTo(Long value) {
            addCriterion("each_repayment_amount =", value, "eachRepaymentAmount");
            return (Criteria) this;
        }

        public Criteria andEachRepaymentAmountNotEqualTo(Long value) {
            addCriterion("each_repayment_amount <>", value, "eachRepaymentAmount");
            return (Criteria) this;
        }

        public Criteria andEachRepaymentAmountGreaterThan(Long value) {
            addCriterion("each_repayment_amount >", value, "eachRepaymentAmount");
            return (Criteria) this;
        }

        public Criteria andEachRepaymentAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("each_repayment_amount >=", value, "eachRepaymentAmount");
            return (Criteria) this;
        }

        public Criteria andEachRepaymentAmountLessThan(Long value) {
            addCriterion("each_repayment_amount <", value, "eachRepaymentAmount");
            return (Criteria) this;
        }

        public Criteria andEachRepaymentAmountLessThanOrEqualTo(Long value) {
            addCriterion("each_repayment_amount <=", value, "eachRepaymentAmount");
            return (Criteria) this;
        }

        public Criteria andEachRepaymentAmountIn(List<Long> values) {
            addCriterion("each_repayment_amount in", values, "eachRepaymentAmount");
            return (Criteria) this;
        }

        public Criteria andEachRepaymentAmountNotIn(List<Long> values) {
            addCriterion("each_repayment_amount not in", values, "eachRepaymentAmount");
            return (Criteria) this;
        }

        public Criteria andEachRepaymentAmountBetween(Long value1, Long value2) {
            addCriterion("each_repayment_amount between", value1, value2, "eachRepaymentAmount");
            return (Criteria) this;
        }

        public Criteria andEachRepaymentAmountNotBetween(Long value1, Long value2) {
            addCriterion("each_repayment_amount not between", value1, value2, "eachRepaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRetainedAmountIsNull() {
            addCriterion("retained_amount is null");
            return (Criteria) this;
        }

        public Criteria andRetainedAmountIsNotNull() {
            addCriterion("retained_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRetainedAmountEqualTo(Long value) {
            addCriterion("retained_amount =", value, "retainedAmount");
            return (Criteria) this;
        }

        public Criteria andRetainedAmountNotEqualTo(Long value) {
            addCriterion("retained_amount <>", value, "retainedAmount");
            return (Criteria) this;
        }

        public Criteria andRetainedAmountGreaterThan(Long value) {
            addCriterion("retained_amount >", value, "retainedAmount");
            return (Criteria) this;
        }

        public Criteria andRetainedAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("retained_amount >=", value, "retainedAmount");
            return (Criteria) this;
        }

        public Criteria andRetainedAmountLessThan(Long value) {
            addCriterion("retained_amount <", value, "retainedAmount");
            return (Criteria) this;
        }

        public Criteria andRetainedAmountLessThanOrEqualTo(Long value) {
            addCriterion("retained_amount <=", value, "retainedAmount");
            return (Criteria) this;
        }

        public Criteria andRetainedAmountIn(List<Long> values) {
            addCriterion("retained_amount in", values, "retainedAmount");
            return (Criteria) this;
        }

        public Criteria andRetainedAmountNotIn(List<Long> values) {
            addCriterion("retained_amount not in", values, "retainedAmount");
            return (Criteria) this;
        }

        public Criteria andRetainedAmountBetween(Long value1, Long value2) {
            addCriterion("retained_amount between", value1, value2, "retainedAmount");
            return (Criteria) this;
        }

        public Criteria andRetainedAmountNotBetween(Long value1, Long value2) {
            addCriterion("retained_amount not between", value1, value2, "retainedAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentCycleIsNull() {
            addCriterion("repayment_cycle is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentCycleIsNotNull() {
            addCriterion("repayment_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentCycleEqualTo(String value) {
            addCriterion("repayment_cycle =", value, "repaymentCycle");
            return (Criteria) this;
        }

        public Criteria andRepaymentCycleNotEqualTo(String value) {
            addCriterion("repayment_cycle <>", value, "repaymentCycle");
            return (Criteria) this;
        }

        public Criteria andRepaymentCycleGreaterThan(String value) {
            addCriterion("repayment_cycle >", value, "repaymentCycle");
            return (Criteria) this;
        }

        public Criteria andRepaymentCycleGreaterThanOrEqualTo(String value) {
            addCriterion("repayment_cycle >=", value, "repaymentCycle");
            return (Criteria) this;
        }

        public Criteria andRepaymentCycleLessThan(String value) {
            addCriterion("repayment_cycle <", value, "repaymentCycle");
            return (Criteria) this;
        }

        public Criteria andRepaymentCycleLessThanOrEqualTo(String value) {
            addCriterion("repayment_cycle <=", value, "repaymentCycle");
            return (Criteria) this;
        }

        public Criteria andRepaymentCycleLike(String value) {
            addCriterion("repayment_cycle like", value, "repaymentCycle");
            return (Criteria) this;
        }

        public Criteria andRepaymentCycleNotLike(String value) {
            addCriterion("repayment_cycle not like", value, "repaymentCycle");
            return (Criteria) this;
        }

        public Criteria andRepaymentCycleIn(List<String> values) {
            addCriterion("repayment_cycle in", values, "repaymentCycle");
            return (Criteria) this;
        }

        public Criteria andRepaymentCycleNotIn(List<String> values) {
            addCriterion("repayment_cycle not in", values, "repaymentCycle");
            return (Criteria) this;
        }

        public Criteria andRepaymentCycleBetween(String value1, String value2) {
            addCriterion("repayment_cycle between", value1, value2, "repaymentCycle");
            return (Criteria) this;
        }

        public Criteria andRepaymentCycleNotBetween(String value1, String value2) {
            addCriterion("repayment_cycle not between", value1, value2, "repaymentCycle");
            return (Criteria) this;
        }

        public Criteria andPrincipalSegmentationIsNull() {
            addCriterion("principal_segmentation is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalSegmentationIsNotNull() {
            addCriterion("principal_segmentation is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalSegmentationEqualTo(String value) {
            addCriterion("principal_segmentation =", value, "principalSegmentation");
            return (Criteria) this;
        }

        public Criteria andPrincipalSegmentationNotEqualTo(String value) {
            addCriterion("principal_segmentation <>", value, "principalSegmentation");
            return (Criteria) this;
        }

        public Criteria andPrincipalSegmentationGreaterThan(String value) {
            addCriterion("principal_segmentation >", value, "principalSegmentation");
            return (Criteria) this;
        }

        public Criteria andPrincipalSegmentationGreaterThanOrEqualTo(String value) {
            addCriterion("principal_segmentation >=", value, "principalSegmentation");
            return (Criteria) this;
        }

        public Criteria andPrincipalSegmentationLessThan(String value) {
            addCriterion("principal_segmentation <", value, "principalSegmentation");
            return (Criteria) this;
        }

        public Criteria andPrincipalSegmentationLessThanOrEqualTo(String value) {
            addCriterion("principal_segmentation <=", value, "principalSegmentation");
            return (Criteria) this;
        }

        public Criteria andPrincipalSegmentationLike(String value) {
            addCriterion("principal_segmentation like", value, "principalSegmentation");
            return (Criteria) this;
        }

        public Criteria andPrincipalSegmentationNotLike(String value) {
            addCriterion("principal_segmentation not like", value, "principalSegmentation");
            return (Criteria) this;
        }

        public Criteria andPrincipalSegmentationIn(List<String> values) {
            addCriterion("principal_segmentation in", values, "principalSegmentation");
            return (Criteria) this;
        }

        public Criteria andPrincipalSegmentationNotIn(List<String> values) {
            addCriterion("principal_segmentation not in", values, "principalSegmentation");
            return (Criteria) this;
        }

        public Criteria andPrincipalSegmentationBetween(String value1, String value2) {
            addCriterion("principal_segmentation between", value1, value2, "principalSegmentation");
            return (Criteria) this;
        }

        public Criteria andPrincipalSegmentationNotBetween(String value1, String value2) {
            addCriterion("principal_segmentation not between", value1, value2, "principalSegmentation");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(String value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(String value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(String value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(String value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(String value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLike(String value) {
            addCriterion("start_date like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotLike(String value) {
            addCriterion("start_date not like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<String> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<String> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(String value1, String value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(String value1, String value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(String value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(String value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(String value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(String value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(String value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLike(String value) {
            addCriterion("end_date like", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotLike(String value) {
            addCriterion("end_date not like", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<String> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<String> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(String value1, String value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(String value1, String value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andLastRepaymentDateIsNull() {
            addCriterion("last_repayment_date is null");
            return (Criteria) this;
        }

        public Criteria andLastRepaymentDateIsNotNull() {
            addCriterion("last_repayment_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastRepaymentDateEqualTo(String value) {
            addCriterion("last_repayment_date =", value, "lastRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andLastRepaymentDateNotEqualTo(String value) {
            addCriterion("last_repayment_date <>", value, "lastRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andLastRepaymentDateGreaterThan(String value) {
            addCriterion("last_repayment_date >", value, "lastRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andLastRepaymentDateGreaterThanOrEqualTo(String value) {
            addCriterion("last_repayment_date >=", value, "lastRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andLastRepaymentDateLessThan(String value) {
            addCriterion("last_repayment_date <", value, "lastRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andLastRepaymentDateLessThanOrEqualTo(String value) {
            addCriterion("last_repayment_date <=", value, "lastRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andLastRepaymentDateLike(String value) {
            addCriterion("last_repayment_date like", value, "lastRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andLastRepaymentDateNotLike(String value) {
            addCriterion("last_repayment_date not like", value, "lastRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andLastRepaymentDateIn(List<String> values) {
            addCriterion("last_repayment_date in", values, "lastRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andLastRepaymentDateNotIn(List<String> values) {
            addCriterion("last_repayment_date not in", values, "lastRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andLastRepaymentDateBetween(String value1, String value2) {
            addCriterion("last_repayment_date between", value1, value2, "lastRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andLastRepaymentDateNotBetween(String value1, String value2) {
            addCriterion("last_repayment_date not between", value1, value2, "lastRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andNormalPrincipalIsNull() {
            addCriterion("normal_principal is null");
            return (Criteria) this;
        }

        public Criteria andNormalPrincipalIsNotNull() {
            addCriterion("normal_principal is not null");
            return (Criteria) this;
        }

        public Criteria andNormalPrincipalEqualTo(Long value) {
            addCriterion("normal_principal =", value, "normalPrincipal");
            return (Criteria) this;
        }

        public Criteria andNormalPrincipalNotEqualTo(Long value) {
            addCriterion("normal_principal <>", value, "normalPrincipal");
            return (Criteria) this;
        }

        public Criteria andNormalPrincipalGreaterThan(Long value) {
            addCriterion("normal_principal >", value, "normalPrincipal");
            return (Criteria) this;
        }

        public Criteria andNormalPrincipalGreaterThanOrEqualTo(Long value) {
            addCriterion("normal_principal >=", value, "normalPrincipal");
            return (Criteria) this;
        }

        public Criteria andNormalPrincipalLessThan(Long value) {
            addCriterion("normal_principal <", value, "normalPrincipal");
            return (Criteria) this;
        }

        public Criteria andNormalPrincipalLessThanOrEqualTo(Long value) {
            addCriterion("normal_principal <=", value, "normalPrincipal");
            return (Criteria) this;
        }

        public Criteria andNormalPrincipalIn(List<Long> values) {
            addCriterion("normal_principal in", values, "normalPrincipal");
            return (Criteria) this;
        }

        public Criteria andNormalPrincipalNotIn(List<Long> values) {
            addCriterion("normal_principal not in", values, "normalPrincipal");
            return (Criteria) this;
        }

        public Criteria andNormalPrincipalBetween(Long value1, Long value2) {
            addCriterion("normal_principal between", value1, value2, "normalPrincipal");
            return (Criteria) this;
        }

        public Criteria andNormalPrincipalNotBetween(Long value1, Long value2) {
            addCriterion("normal_principal not between", value1, value2, "normalPrincipal");
            return (Criteria) this;
        }

        public Criteria andWriteoffPrincipalIsNull() {
            addCriterion("writeoff_principal is null");
            return (Criteria) this;
        }

        public Criteria andWriteoffPrincipalIsNotNull() {
            addCriterion("writeoff_principal is not null");
            return (Criteria) this;
        }

        public Criteria andWriteoffPrincipalEqualTo(Long value) {
            addCriterion("writeoff_principal =", value, "writeoffPrincipal");
            return (Criteria) this;
        }

        public Criteria andWriteoffPrincipalNotEqualTo(Long value) {
            addCriterion("writeoff_principal <>", value, "writeoffPrincipal");
            return (Criteria) this;
        }

        public Criteria andWriteoffPrincipalGreaterThan(Long value) {
            addCriterion("writeoff_principal >", value, "writeoffPrincipal");
            return (Criteria) this;
        }

        public Criteria andWriteoffPrincipalGreaterThanOrEqualTo(Long value) {
            addCriterion("writeoff_principal >=", value, "writeoffPrincipal");
            return (Criteria) this;
        }

        public Criteria andWriteoffPrincipalLessThan(Long value) {
            addCriterion("writeoff_principal <", value, "writeoffPrincipal");
            return (Criteria) this;
        }

        public Criteria andWriteoffPrincipalLessThanOrEqualTo(Long value) {
            addCriterion("writeoff_principal <=", value, "writeoffPrincipal");
            return (Criteria) this;
        }

        public Criteria andWriteoffPrincipalIn(List<Long> values) {
            addCriterion("writeoff_principal in", values, "writeoffPrincipal");
            return (Criteria) this;
        }

        public Criteria andWriteoffPrincipalNotIn(List<Long> values) {
            addCriterion("writeoff_principal not in", values, "writeoffPrincipal");
            return (Criteria) this;
        }

        public Criteria andWriteoffPrincipalBetween(Long value1, Long value2) {
            addCriterion("writeoff_principal between", value1, value2, "writeoffPrincipal");
            return (Criteria) this;
        }

        public Criteria andWriteoffPrincipalNotBetween(Long value1, Long value2) {
            addCriterion("writeoff_principal not between", value1, value2, "writeoffPrincipal");
            return (Criteria) this;
        }

        public Criteria andWriteoffInterestIsNull() {
            addCriterion("writeoff_interest is null");
            return (Criteria) this;
        }

        public Criteria andWriteoffInterestIsNotNull() {
            addCriterion("writeoff_interest is not null");
            return (Criteria) this;
        }

        public Criteria andWriteoffInterestEqualTo(Long value) {
            addCriterion("writeoff_interest =", value, "writeoffInterest");
            return (Criteria) this;
        }

        public Criteria andWriteoffInterestNotEqualTo(Long value) {
            addCriterion("writeoff_interest <>", value, "writeoffInterest");
            return (Criteria) this;
        }

        public Criteria andWriteoffInterestGreaterThan(Long value) {
            addCriterion("writeoff_interest >", value, "writeoffInterest");
            return (Criteria) this;
        }

        public Criteria andWriteoffInterestGreaterThanOrEqualTo(Long value) {
            addCriterion("writeoff_interest >=", value, "writeoffInterest");
            return (Criteria) this;
        }

        public Criteria andWriteoffInterestLessThan(Long value) {
            addCriterion("writeoff_interest <", value, "writeoffInterest");
            return (Criteria) this;
        }

        public Criteria andWriteoffInterestLessThanOrEqualTo(Long value) {
            addCriterion("writeoff_interest <=", value, "writeoffInterest");
            return (Criteria) this;
        }

        public Criteria andWriteoffInterestIn(List<Long> values) {
            addCriterion("writeoff_interest in", values, "writeoffInterest");
            return (Criteria) this;
        }

        public Criteria andWriteoffInterestNotIn(List<Long> values) {
            addCriterion("writeoff_interest not in", values, "writeoffInterest");
            return (Criteria) this;
        }

        public Criteria andWriteoffInterestBetween(Long value1, Long value2) {
            addCriterion("writeoff_interest between", value1, value2, "writeoffInterest");
            return (Criteria) this;
        }

        public Criteria andWriteoffInterestNotBetween(Long value1, Long value2) {
            addCriterion("writeoff_interest not between", value1, value2, "writeoffInterest");
            return (Criteria) this;
        }

        public Criteria andChildPeriodsIsNull() {
            addCriterion("child_periods is null");
            return (Criteria) this;
        }

        public Criteria andChildPeriodsIsNotNull() {
            addCriterion("child_periods is not null");
            return (Criteria) this;
        }

        public Criteria andChildPeriodsEqualTo(String value) {
            addCriterion("child_periods =", value, "childPeriods");
            return (Criteria) this;
        }

        public Criteria andChildPeriodsNotEqualTo(String value) {
            addCriterion("child_periods <>", value, "childPeriods");
            return (Criteria) this;
        }

        public Criteria andChildPeriodsGreaterThan(String value) {
            addCriterion("child_periods >", value, "childPeriods");
            return (Criteria) this;
        }

        public Criteria andChildPeriodsGreaterThanOrEqualTo(String value) {
            addCriterion("child_periods >=", value, "childPeriods");
            return (Criteria) this;
        }

        public Criteria andChildPeriodsLessThan(String value) {
            addCriterion("child_periods <", value, "childPeriods");
            return (Criteria) this;
        }

        public Criteria andChildPeriodsLessThanOrEqualTo(String value) {
            addCriterion("child_periods <=", value, "childPeriods");
            return (Criteria) this;
        }

        public Criteria andChildPeriodsLike(String value) {
            addCriterion("child_periods like", value, "childPeriods");
            return (Criteria) this;
        }

        public Criteria andChildPeriodsNotLike(String value) {
            addCriterion("child_periods not like", value, "childPeriods");
            return (Criteria) this;
        }

        public Criteria andChildPeriodsIn(List<String> values) {
            addCriterion("child_periods in", values, "childPeriods");
            return (Criteria) this;
        }

        public Criteria andChildPeriodsNotIn(List<String> values) {
            addCriterion("child_periods not in", values, "childPeriods");
            return (Criteria) this;
        }

        public Criteria andChildPeriodsBetween(String value1, String value2) {
            addCriterion("child_periods between", value1, value2, "childPeriods");
            return (Criteria) this;
        }

        public Criteria andChildPeriodsNotBetween(String value1, String value2) {
            addCriterion("child_periods not between", value1, value2, "childPeriods");
            return (Criteria) this;
        }

        public Criteria andTransactionDateIsNull() {
            addCriterion("transaction_date is null");
            return (Criteria) this;
        }

        public Criteria andTransactionDateIsNotNull() {
            addCriterion("transaction_date is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionDateEqualTo(String value) {
            addCriterion("transaction_date =", value, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateNotEqualTo(String value) {
            addCriterion("transaction_date <>", value, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateGreaterThan(String value) {
            addCriterion("transaction_date >", value, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_date >=", value, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateLessThan(String value) {
            addCriterion("transaction_date <", value, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateLessThanOrEqualTo(String value) {
            addCriterion("transaction_date <=", value, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateLike(String value) {
            addCriterion("transaction_date like", value, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateNotLike(String value) {
            addCriterion("transaction_date not like", value, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateIn(List<String> values) {
            addCriterion("transaction_date in", values, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateNotIn(List<String> values) {
            addCriterion("transaction_date not in", values, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateBetween(String value1, String value2) {
            addCriterion("transaction_date between", value1, value2, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateNotBetween(String value1, String value2) {
            addCriterion("transaction_date not between", value1, value2, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andAccumulatedOverduePrincipalIsNull() {
            addCriterion("accumulated_overdue_principal is null");
            return (Criteria) this;
        }

        public Criteria andAccumulatedOverduePrincipalIsNotNull() {
            addCriterion("accumulated_overdue_principal is not null");
            return (Criteria) this;
        }

        public Criteria andAccumulatedOverduePrincipalEqualTo(Long value) {
            addCriterion("accumulated_overdue_principal =", value, "accumulatedOverduePrincipal");
            return (Criteria) this;
        }

        public Criteria andAccumulatedOverduePrincipalNotEqualTo(Long value) {
            addCriterion("accumulated_overdue_principal <>", value, "accumulatedOverduePrincipal");
            return (Criteria) this;
        }

        public Criteria andAccumulatedOverduePrincipalGreaterThan(Long value) {
            addCriterion("accumulated_overdue_principal >", value, "accumulatedOverduePrincipal");
            return (Criteria) this;
        }

        public Criteria andAccumulatedOverduePrincipalGreaterThanOrEqualTo(Long value) {
            addCriterion("accumulated_overdue_principal >=", value, "accumulatedOverduePrincipal");
            return (Criteria) this;
        }

        public Criteria andAccumulatedOverduePrincipalLessThan(Long value) {
            addCriterion("accumulated_overdue_principal <", value, "accumulatedOverduePrincipal");
            return (Criteria) this;
        }

        public Criteria andAccumulatedOverduePrincipalLessThanOrEqualTo(Long value) {
            addCriterion("accumulated_overdue_principal <=", value, "accumulatedOverduePrincipal");
            return (Criteria) this;
        }

        public Criteria andAccumulatedOverduePrincipalIn(List<Long> values) {
            addCriterion("accumulated_overdue_principal in", values, "accumulatedOverduePrincipal");
            return (Criteria) this;
        }

        public Criteria andAccumulatedOverduePrincipalNotIn(List<Long> values) {
            addCriterion("accumulated_overdue_principal not in", values, "accumulatedOverduePrincipal");
            return (Criteria) this;
        }

        public Criteria andAccumulatedOverduePrincipalBetween(Long value1, Long value2) {
            addCriterion("accumulated_overdue_principal between", value1, value2, "accumulatedOverduePrincipal");
            return (Criteria) this;
        }

        public Criteria andAccumulatedOverduePrincipalNotBetween(Long value1, Long value2) {
            addCriterion("accumulated_overdue_principal not between", value1, value2, "accumulatedOverduePrincipal");
            return (Criteria) this;
        }

        public Criteria andAccumulatedOverdueIsNull() {
            addCriterion("accumulated_overdue is null");
            return (Criteria) this;
        }

        public Criteria andAccumulatedOverdueIsNotNull() {
            addCriterion("accumulated_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andAccumulatedOverdueEqualTo(Long value) {
            addCriterion("accumulated_overdue =", value, "accumulatedOverdue");
            return (Criteria) this;
        }

        public Criteria andAccumulatedOverdueNotEqualTo(Long value) {
            addCriterion("accumulated_overdue <>", value, "accumulatedOverdue");
            return (Criteria) this;
        }

        public Criteria andAccumulatedOverdueGreaterThan(Long value) {
            addCriterion("accumulated_overdue >", value, "accumulatedOverdue");
            return (Criteria) this;
        }

        public Criteria andAccumulatedOverdueGreaterThanOrEqualTo(Long value) {
            addCriterion("accumulated_overdue >=", value, "accumulatedOverdue");
            return (Criteria) this;
        }

        public Criteria andAccumulatedOverdueLessThan(Long value) {
            addCriterion("accumulated_overdue <", value, "accumulatedOverdue");
            return (Criteria) this;
        }

        public Criteria andAccumulatedOverdueLessThanOrEqualTo(Long value) {
            addCriterion("accumulated_overdue <=", value, "accumulatedOverdue");
            return (Criteria) this;
        }

        public Criteria andAccumulatedOverdueIn(List<Long> values) {
            addCriterion("accumulated_overdue in", values, "accumulatedOverdue");
            return (Criteria) this;
        }

        public Criteria andAccumulatedOverdueNotIn(List<Long> values) {
            addCriterion("accumulated_overdue not in", values, "accumulatedOverdue");
            return (Criteria) this;
        }

        public Criteria andAccumulatedOverdueBetween(Long value1, Long value2) {
            addCriterion("accumulated_overdue between", value1, value2, "accumulatedOverdue");
            return (Criteria) this;
        }

        public Criteria andAccumulatedOverdueNotBetween(Long value1, Long value2) {
            addCriterion("accumulated_overdue not between", value1, value2, "accumulatedOverdue");
            return (Criteria) this;
        }

        public Criteria andAccumulatePrincipalIsNull() {
            addCriterion("accumulate_principal is null");
            return (Criteria) this;
        }

        public Criteria andAccumulatePrincipalIsNotNull() {
            addCriterion("accumulate_principal is not null");
            return (Criteria) this;
        }

        public Criteria andAccumulatePrincipalEqualTo(Long value) {
            addCriterion("accumulate_principal =", value, "accumulatePrincipal");
            return (Criteria) this;
        }

        public Criteria andAccumulatePrincipalNotEqualTo(Long value) {
            addCriterion("accumulate_principal <>", value, "accumulatePrincipal");
            return (Criteria) this;
        }

        public Criteria andAccumulatePrincipalGreaterThan(Long value) {
            addCriterion("accumulate_principal >", value, "accumulatePrincipal");
            return (Criteria) this;
        }

        public Criteria andAccumulatePrincipalGreaterThanOrEqualTo(Long value) {
            addCriterion("accumulate_principal >=", value, "accumulatePrincipal");
            return (Criteria) this;
        }

        public Criteria andAccumulatePrincipalLessThan(Long value) {
            addCriterion("accumulate_principal <", value, "accumulatePrincipal");
            return (Criteria) this;
        }

        public Criteria andAccumulatePrincipalLessThanOrEqualTo(Long value) {
            addCriterion("accumulate_principal <=", value, "accumulatePrincipal");
            return (Criteria) this;
        }

        public Criteria andAccumulatePrincipalIn(List<Long> values) {
            addCriterion("accumulate_principal in", values, "accumulatePrincipal");
            return (Criteria) this;
        }

        public Criteria andAccumulatePrincipalNotIn(List<Long> values) {
            addCriterion("accumulate_principal not in", values, "accumulatePrincipal");
            return (Criteria) this;
        }

        public Criteria andAccumulatePrincipalBetween(Long value1, Long value2) {
            addCriterion("accumulate_principal between", value1, value2, "accumulatePrincipal");
            return (Criteria) this;
        }

        public Criteria andAccumulatePrincipalNotBetween(Long value1, Long value2) {
            addCriterion("accumulate_principal not between", value1, value2, "accumulatePrincipal");
            return (Criteria) this;
        }

        public Criteria andAccumulateInterestIsNull() {
            addCriterion("accumulate_interest is null");
            return (Criteria) this;
        }

        public Criteria andAccumulateInterestIsNotNull() {
            addCriterion("accumulate_interest is not null");
            return (Criteria) this;
        }

        public Criteria andAccumulateInterestEqualTo(Long value) {
            addCriterion("accumulate_interest =", value, "accumulateInterest");
            return (Criteria) this;
        }

        public Criteria andAccumulateInterestNotEqualTo(Long value) {
            addCriterion("accumulate_interest <>", value, "accumulateInterest");
            return (Criteria) this;
        }

        public Criteria andAccumulateInterestGreaterThan(Long value) {
            addCriterion("accumulate_interest >", value, "accumulateInterest");
            return (Criteria) this;
        }

        public Criteria andAccumulateInterestGreaterThanOrEqualTo(Long value) {
            addCriterion("accumulate_interest >=", value, "accumulateInterest");
            return (Criteria) this;
        }

        public Criteria andAccumulateInterestLessThan(Long value) {
            addCriterion("accumulate_interest <", value, "accumulateInterest");
            return (Criteria) this;
        }

        public Criteria andAccumulateInterestLessThanOrEqualTo(Long value) {
            addCriterion("accumulate_interest <=", value, "accumulateInterest");
            return (Criteria) this;
        }

        public Criteria andAccumulateInterestIn(List<Long> values) {
            addCriterion("accumulate_interest in", values, "accumulateInterest");
            return (Criteria) this;
        }

        public Criteria andAccumulateInterestNotIn(List<Long> values) {
            addCriterion("accumulate_interest not in", values, "accumulateInterest");
            return (Criteria) this;
        }

        public Criteria andAccumulateInterestBetween(Long value1, Long value2) {
            addCriterion("accumulate_interest between", value1, value2, "accumulateInterest");
            return (Criteria) this;
        }

        public Criteria andAccumulateInterestNotBetween(Long value1, Long value2) {
            addCriterion("accumulate_interest not between", value1, value2, "accumulateInterest");
            return (Criteria) this;
        }

        public Criteria andDataFromIsNull() {
            addCriterion("data_from is null");
            return (Criteria) this;
        }

        public Criteria andDataFromIsNotNull() {
            addCriterion("data_from is not null");
            return (Criteria) this;
        }

        public Criteria andDataFromEqualTo(String value) {
            addCriterion("data_from =", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromNotEqualTo(String value) {
            addCriterion("data_from <>", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromGreaterThan(String value) {
            addCriterion("data_from >", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromGreaterThanOrEqualTo(String value) {
            addCriterion("data_from >=", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromLessThan(String value) {
            addCriterion("data_from <", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromLessThanOrEqualTo(String value) {
            addCriterion("data_from <=", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromLike(String value) {
            addCriterion("data_from like", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromNotLike(String value) {
            addCriterion("data_from not like", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromIn(List<String> values) {
            addCriterion("data_from in", values, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromNotIn(List<String> values) {
            addCriterion("data_from not in", values, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromBetween(String value1, String value2) {
            addCriterion("data_from between", value1, value2, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromNotBetween(String value1, String value2) {
            addCriterion("data_from not between", value1, value2, "dataFrom");
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

        public Criteria andEffectiveIsNull() {
            addCriterion("effective is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveIsNotNull() {
            addCriterion("effective is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveEqualTo(String value) {
            addCriterion("effective =", value, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveNotEqualTo(String value) {
            addCriterion("effective <>", value, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveGreaterThan(String value) {
            addCriterion("effective >", value, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveGreaterThanOrEqualTo(String value) {
            addCriterion("effective >=", value, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveLessThan(String value) {
            addCriterion("effective <", value, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveLessThanOrEqualTo(String value) {
            addCriterion("effective <=", value, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveLike(String value) {
            addCriterion("effective like", value, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveNotLike(String value) {
            addCriterion("effective not like", value, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveIn(List<String> values) {
            addCriterion("effective in", values, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveNotIn(List<String> values) {
            addCriterion("effective not in", values, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveBetween(String value1, String value2) {
            addCriterion("effective between", value1, value2, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveNotBetween(String value1, String value2) {
            addCriterion("effective not between", value1, value2, "effective");
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