package com.yonyou.scf.common.entity;

import java.util.ArrayList;
import java.util.List;

public class RepaymentScheduleDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepaymentScheduleDetailExample() {
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

        public Criteria andRsdIdIsNull() {
            addCriterion("rsd_id is null");
            return (Criteria) this;
        }

        public Criteria andRsdIdIsNotNull() {
            addCriterion("rsd_id is not null");
            return (Criteria) this;
        }

        public Criteria andRsdIdEqualTo(Long value) {
            addCriterion("rsd_id =", value, "rsdId");
            return (Criteria) this;
        }

        public Criteria andRsdIdNotEqualTo(Long value) {
            addCriterion("rsd_id <>", value, "rsdId");
            return (Criteria) this;
        }

        public Criteria andRsdIdGreaterThan(Long value) {
            addCriterion("rsd_id >", value, "rsdId");
            return (Criteria) this;
        }

        public Criteria andRsdIdGreaterThanOrEqualTo(Long value) {
            addCriterion("rsd_id >=", value, "rsdId");
            return (Criteria) this;
        }

        public Criteria andRsdIdLessThan(Long value) {
            addCriterion("rsd_id <", value, "rsdId");
            return (Criteria) this;
        }

        public Criteria andRsdIdLessThanOrEqualTo(Long value) {
            addCriterion("rsd_id <=", value, "rsdId");
            return (Criteria) this;
        }

        public Criteria andRsdIdIn(List<Long> values) {
            addCriterion("rsd_id in", values, "rsdId");
            return (Criteria) this;
        }

        public Criteria andRsdIdNotIn(List<Long> values) {
            addCriterion("rsd_id not in", values, "rsdId");
            return (Criteria) this;
        }

        public Criteria andRsdIdBetween(Long value1, Long value2) {
            addCriterion("rsd_id between", value1, value2, "rsdId");
            return (Criteria) this;
        }

        public Criteria andRsdIdNotBetween(Long value1, Long value2) {
            addCriterion("rsd_id not between", value1, value2, "rsdId");
            return (Criteria) this;
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

        public Criteria andRepaymentDateIsNull() {
            addCriterion("repayment_date is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIsNotNull() {
            addCriterion("repayment_date is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateEqualTo(String value) {
            addCriterion("repayment_date =", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateNotEqualTo(String value) {
            addCriterion("repayment_date <>", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateGreaterThan(String value) {
            addCriterion("repayment_date >", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateGreaterThanOrEqualTo(String value) {
            addCriterion("repayment_date >=", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateLessThan(String value) {
            addCriterion("repayment_date <", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateLessThanOrEqualTo(String value) {
            addCriterion("repayment_date <=", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateLike(String value) {
            addCriterion("repayment_date like", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateNotLike(String value) {
            addCriterion("repayment_date not like", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIn(List<String> values) {
            addCriterion("repayment_date in", values, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateNotIn(List<String> values) {
            addCriterion("repayment_date not in", values, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateBetween(String value1, String value2) {
            addCriterion("repayment_date between", value1, value2, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateNotBetween(String value1, String value2) {
            addCriterion("repayment_date not between", value1, value2, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateIsNull() {
            addCriterion("real_repayment_date is null");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateIsNotNull() {
            addCriterion("real_repayment_date is not null");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateEqualTo(String value) {
            addCriterion("real_repayment_date =", value, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateNotEqualTo(String value) {
            addCriterion("real_repayment_date <>", value, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateGreaterThan(String value) {
            addCriterion("real_repayment_date >", value, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateGreaterThanOrEqualTo(String value) {
            addCriterion("real_repayment_date >=", value, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateLessThan(String value) {
            addCriterion("real_repayment_date <", value, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateLessThanOrEqualTo(String value) {
            addCriterion("real_repayment_date <=", value, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateLike(String value) {
            addCriterion("real_repayment_date like", value, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateNotLike(String value) {
            addCriterion("real_repayment_date not like", value, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateIn(List<String> values) {
            addCriterion("real_repayment_date in", values, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateNotIn(List<String> values) {
            addCriterion("real_repayment_date not in", values, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateBetween(String value1, String value2) {
            addCriterion("real_repayment_date between", value1, value2, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andRealRepaymentDateNotBetween(String value1, String value2) {
            addCriterion("real_repayment_date not between", value1, value2, "realRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andPrincipalAmountIsNull() {
            addCriterion("principal_amount is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalAmountIsNotNull() {
            addCriterion("principal_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalAmountEqualTo(Long value) {
            addCriterion("principal_amount =", value, "principalAmount");
            return (Criteria) this;
        }

        public Criteria andPrincipalAmountNotEqualTo(Long value) {
            addCriterion("principal_amount <>", value, "principalAmount");
            return (Criteria) this;
        }

        public Criteria andPrincipalAmountGreaterThan(Long value) {
            addCriterion("principal_amount >", value, "principalAmount");
            return (Criteria) this;
        }

        public Criteria andPrincipalAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("principal_amount >=", value, "principalAmount");
            return (Criteria) this;
        }

        public Criteria andPrincipalAmountLessThan(Long value) {
            addCriterion("principal_amount <", value, "principalAmount");
            return (Criteria) this;
        }

        public Criteria andPrincipalAmountLessThanOrEqualTo(Long value) {
            addCriterion("principal_amount <=", value, "principalAmount");
            return (Criteria) this;
        }

        public Criteria andPrincipalAmountIn(List<Long> values) {
            addCriterion("principal_amount in", values, "principalAmount");
            return (Criteria) this;
        }

        public Criteria andPrincipalAmountNotIn(List<Long> values) {
            addCriterion("principal_amount not in", values, "principalAmount");
            return (Criteria) this;
        }

        public Criteria andPrincipalAmountBetween(Long value1, Long value2) {
            addCriterion("principal_amount between", value1, value2, "principalAmount");
            return (Criteria) this;
        }

        public Criteria andPrincipalAmountNotBetween(Long value1, Long value2) {
            addCriterion("principal_amount not between", value1, value2, "principalAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountIsNull() {
            addCriterion("interest_amount is null");
            return (Criteria) this;
        }

        public Criteria andInterestAmountIsNotNull() {
            addCriterion("interest_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInterestAmountEqualTo(Long value) {
            addCriterion("interest_amount =", value, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountNotEqualTo(Long value) {
            addCriterion("interest_amount <>", value, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountGreaterThan(Long value) {
            addCriterion("interest_amount >", value, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("interest_amount >=", value, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountLessThan(Long value) {
            addCriterion("interest_amount <", value, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountLessThanOrEqualTo(Long value) {
            addCriterion("interest_amount <=", value, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountIn(List<Long> values) {
            addCriterion("interest_amount in", values, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountNotIn(List<Long> values) {
            addCriterion("interest_amount not in", values, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountBetween(Long value1, Long value2) {
            addCriterion("interest_amount between", value1, value2, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountNotBetween(Long value1, Long value2) {
            addCriterion("interest_amount not between", value1, value2, "interestAmount");
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

        public Criteria andInitialPrincipalIsNull() {
            addCriterion("initial_principal is null");
            return (Criteria) this;
        }

        public Criteria andInitialPrincipalIsNotNull() {
            addCriterion("initial_principal is not null");
            return (Criteria) this;
        }

        public Criteria andInitialPrincipalEqualTo(Long value) {
            addCriterion("initial_principal =", value, "initialPrincipal");
            return (Criteria) this;
        }

        public Criteria andInitialPrincipalNotEqualTo(Long value) {
            addCriterion("initial_principal <>", value, "initialPrincipal");
            return (Criteria) this;
        }

        public Criteria andInitialPrincipalGreaterThan(Long value) {
            addCriterion("initial_principal >", value, "initialPrincipal");
            return (Criteria) this;
        }

        public Criteria andInitialPrincipalGreaterThanOrEqualTo(Long value) {
            addCriterion("initial_principal >=", value, "initialPrincipal");
            return (Criteria) this;
        }

        public Criteria andInitialPrincipalLessThan(Long value) {
            addCriterion("initial_principal <", value, "initialPrincipal");
            return (Criteria) this;
        }

        public Criteria andInitialPrincipalLessThanOrEqualTo(Long value) {
            addCriterion("initial_principal <=", value, "initialPrincipal");
            return (Criteria) this;
        }

        public Criteria andInitialPrincipalIn(List<Long> values) {
            addCriterion("initial_principal in", values, "initialPrincipal");
            return (Criteria) this;
        }

        public Criteria andInitialPrincipalNotIn(List<Long> values) {
            addCriterion("initial_principal not in", values, "initialPrincipal");
            return (Criteria) this;
        }

        public Criteria andInitialPrincipalBetween(Long value1, Long value2) {
            addCriterion("initial_principal between", value1, value2, "initialPrincipal");
            return (Criteria) this;
        }

        public Criteria andInitialPrincipalNotBetween(Long value1, Long value2) {
            addCriterion("initial_principal not between", value1, value2, "initialPrincipal");
            return (Criteria) this;
        }

        public Criteria andInitialInterestIsNull() {
            addCriterion("initial_interest is null");
            return (Criteria) this;
        }

        public Criteria andInitialInterestIsNotNull() {
            addCriterion("initial_interest is not null");
            return (Criteria) this;
        }

        public Criteria andInitialInterestEqualTo(Long value) {
            addCriterion("initial_interest =", value, "initialInterest");
            return (Criteria) this;
        }

        public Criteria andInitialInterestNotEqualTo(Long value) {
            addCriterion("initial_interest <>", value, "initialInterest");
            return (Criteria) this;
        }

        public Criteria andInitialInterestGreaterThan(Long value) {
            addCriterion("initial_interest >", value, "initialInterest");
            return (Criteria) this;
        }

        public Criteria andInitialInterestGreaterThanOrEqualTo(Long value) {
            addCriterion("initial_interest >=", value, "initialInterest");
            return (Criteria) this;
        }

        public Criteria andInitialInterestLessThan(Long value) {
            addCriterion("initial_interest <", value, "initialInterest");
            return (Criteria) this;
        }

        public Criteria andInitialInterestLessThanOrEqualTo(Long value) {
            addCriterion("initial_interest <=", value, "initialInterest");
            return (Criteria) this;
        }

        public Criteria andInitialInterestIn(List<Long> values) {
            addCriterion("initial_interest in", values, "initialInterest");
            return (Criteria) this;
        }

        public Criteria andInitialInterestNotIn(List<Long> values) {
            addCriterion("initial_interest not in", values, "initialInterest");
            return (Criteria) this;
        }

        public Criteria andInitialInterestBetween(Long value1, Long value2) {
            addCriterion("initial_interest between", value1, value2, "initialInterest");
            return (Criteria) this;
        }

        public Criteria andInitialInterestNotBetween(Long value1, Long value2) {
            addCriterion("initial_interest not between", value1, value2, "initialInterest");
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

        public Criteria andGraceperiodExpirydateIsNull() {
            addCriterion("graceperiod_expirydate is null");
            return (Criteria) this;
        }

        public Criteria andGraceperiodExpirydateIsNotNull() {
            addCriterion("graceperiod_expirydate is not null");
            return (Criteria) this;
        }

        public Criteria andGraceperiodExpirydateEqualTo(String value) {
            addCriterion("graceperiod_expirydate =", value, "graceperiodExpirydate");
            return (Criteria) this;
        }

        public Criteria andGraceperiodExpirydateNotEqualTo(String value) {
            addCriterion("graceperiod_expirydate <>", value, "graceperiodExpirydate");
            return (Criteria) this;
        }

        public Criteria andGraceperiodExpirydateGreaterThan(String value) {
            addCriterion("graceperiod_expirydate >", value, "graceperiodExpirydate");
            return (Criteria) this;
        }

        public Criteria andGraceperiodExpirydateGreaterThanOrEqualTo(String value) {
            addCriterion("graceperiod_expirydate >=", value, "graceperiodExpirydate");
            return (Criteria) this;
        }

        public Criteria andGraceperiodExpirydateLessThan(String value) {
            addCriterion("graceperiod_expirydate <", value, "graceperiodExpirydate");
            return (Criteria) this;
        }

        public Criteria andGraceperiodExpirydateLessThanOrEqualTo(String value) {
            addCriterion("graceperiod_expirydate <=", value, "graceperiodExpirydate");
            return (Criteria) this;
        }

        public Criteria andGraceperiodExpirydateLike(String value) {
            addCriterion("graceperiod_expirydate like", value, "graceperiodExpirydate");
            return (Criteria) this;
        }

        public Criteria andGraceperiodExpirydateNotLike(String value) {
            addCriterion("graceperiod_expirydate not like", value, "graceperiodExpirydate");
            return (Criteria) this;
        }

        public Criteria andGraceperiodExpirydateIn(List<String> values) {
            addCriterion("graceperiod_expirydate in", values, "graceperiodExpirydate");
            return (Criteria) this;
        }

        public Criteria andGraceperiodExpirydateNotIn(List<String> values) {
            addCriterion("graceperiod_expirydate not in", values, "graceperiodExpirydate");
            return (Criteria) this;
        }

        public Criteria andGraceperiodExpirydateBetween(String value1, String value2) {
            addCriterion("graceperiod_expirydate between", value1, value2, "graceperiodExpirydate");
            return (Criteria) this;
        }

        public Criteria andGraceperiodExpirydateNotBetween(String value1, String value2) {
            addCriterion("graceperiod_expirydate not between", value1, value2, "graceperiodExpirydate");
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

        public Criteria andReceivableAccruedInterestIsNull() {
            addCriterion("receivable_accrued_interest is null");
            return (Criteria) this;
        }

        public Criteria andReceivableAccruedInterestIsNotNull() {
            addCriterion("receivable_accrued_interest is not null");
            return (Criteria) this;
        }

        public Criteria andReceivableAccruedInterestEqualTo(Long value) {
            addCriterion("receivable_accrued_interest =", value, "receivableAccruedInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableAccruedInterestNotEqualTo(Long value) {
            addCriterion("receivable_accrued_interest <>", value, "receivableAccruedInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableAccruedInterestGreaterThan(Long value) {
            addCriterion("receivable_accrued_interest >", value, "receivableAccruedInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableAccruedInterestGreaterThanOrEqualTo(Long value) {
            addCriterion("receivable_accrued_interest >=", value, "receivableAccruedInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableAccruedInterestLessThan(Long value) {
            addCriterion("receivable_accrued_interest <", value, "receivableAccruedInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableAccruedInterestLessThanOrEqualTo(Long value) {
            addCriterion("receivable_accrued_interest <=", value, "receivableAccruedInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableAccruedInterestIn(List<Long> values) {
            addCriterion("receivable_accrued_interest in", values, "receivableAccruedInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableAccruedInterestNotIn(List<Long> values) {
            addCriterion("receivable_accrued_interest not in", values, "receivableAccruedInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableAccruedInterestBetween(Long value1, Long value2) {
            addCriterion("receivable_accrued_interest between", value1, value2, "receivableAccruedInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableAccruedInterestNotBetween(Long value1, Long value2) {
            addCriterion("receivable_accrued_interest not between", value1, value2, "receivableAccruedInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionAccruedInterestIsNull() {
            addCriterion("collection_accrued_interest is null");
            return (Criteria) this;
        }

        public Criteria andCollectionAccruedInterestIsNotNull() {
            addCriterion("collection_accrued_interest is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionAccruedInterestEqualTo(Long value) {
            addCriterion("collection_accrued_interest =", value, "collectionAccruedInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionAccruedInterestNotEqualTo(Long value) {
            addCriterion("collection_accrued_interest <>", value, "collectionAccruedInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionAccruedInterestGreaterThan(Long value) {
            addCriterion("collection_accrued_interest >", value, "collectionAccruedInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionAccruedInterestGreaterThanOrEqualTo(Long value) {
            addCriterion("collection_accrued_interest >=", value, "collectionAccruedInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionAccruedInterestLessThan(Long value) {
            addCriterion("collection_accrued_interest <", value, "collectionAccruedInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionAccruedInterestLessThanOrEqualTo(Long value) {
            addCriterion("collection_accrued_interest <=", value, "collectionAccruedInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionAccruedInterestIn(List<Long> values) {
            addCriterion("collection_accrued_interest in", values, "collectionAccruedInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionAccruedInterestNotIn(List<Long> values) {
            addCriterion("collection_accrued_interest not in", values, "collectionAccruedInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionAccruedInterestBetween(Long value1, Long value2) {
            addCriterion("collection_accrued_interest between", value1, value2, "collectionAccruedInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionAccruedInterestNotBetween(Long value1, Long value2) {
            addCriterion("collection_accrued_interest not between", value1, value2, "collectionAccruedInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableOweIsNull() {
            addCriterion("receivable_owe is null");
            return (Criteria) this;
        }

        public Criteria andReceivableOweIsNotNull() {
            addCriterion("receivable_owe is not null");
            return (Criteria) this;
        }

        public Criteria andReceivableOweEqualTo(Long value) {
            addCriterion("receivable_owe =", value, "receivableOwe");
            return (Criteria) this;
        }

        public Criteria andReceivableOweNotEqualTo(Long value) {
            addCriterion("receivable_owe <>", value, "receivableOwe");
            return (Criteria) this;
        }

        public Criteria andReceivableOweGreaterThan(Long value) {
            addCriterion("receivable_owe >", value, "receivableOwe");
            return (Criteria) this;
        }

        public Criteria andReceivableOweGreaterThanOrEqualTo(Long value) {
            addCriterion("receivable_owe >=", value, "receivableOwe");
            return (Criteria) this;
        }

        public Criteria andReceivableOweLessThan(Long value) {
            addCriterion("receivable_owe <", value, "receivableOwe");
            return (Criteria) this;
        }

        public Criteria andReceivableOweLessThanOrEqualTo(Long value) {
            addCriterion("receivable_owe <=", value, "receivableOwe");
            return (Criteria) this;
        }

        public Criteria andReceivableOweIn(List<Long> values) {
            addCriterion("receivable_owe in", values, "receivableOwe");
            return (Criteria) this;
        }

        public Criteria andReceivableOweNotIn(List<Long> values) {
            addCriterion("receivable_owe not in", values, "receivableOwe");
            return (Criteria) this;
        }

        public Criteria andReceivableOweBetween(Long value1, Long value2) {
            addCriterion("receivable_owe between", value1, value2, "receivableOwe");
            return (Criteria) this;
        }

        public Criteria andReceivableOweNotBetween(Long value1, Long value2) {
            addCriterion("receivable_owe not between", value1, value2, "receivableOwe");
            return (Criteria) this;
        }

        public Criteria andCollectionOweIsNull() {
            addCriterion("collection_owe is null");
            return (Criteria) this;
        }

        public Criteria andCollectionOweIsNotNull() {
            addCriterion("collection_owe is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionOweEqualTo(Long value) {
            addCriterion("collection_owe =", value, "collectionOwe");
            return (Criteria) this;
        }

        public Criteria andCollectionOweNotEqualTo(Long value) {
            addCriterion("collection_owe <>", value, "collectionOwe");
            return (Criteria) this;
        }

        public Criteria andCollectionOweGreaterThan(Long value) {
            addCriterion("collection_owe >", value, "collectionOwe");
            return (Criteria) this;
        }

        public Criteria andCollectionOweGreaterThanOrEqualTo(Long value) {
            addCriterion("collection_owe >=", value, "collectionOwe");
            return (Criteria) this;
        }

        public Criteria andCollectionOweLessThan(Long value) {
            addCriterion("collection_owe <", value, "collectionOwe");
            return (Criteria) this;
        }

        public Criteria andCollectionOweLessThanOrEqualTo(Long value) {
            addCriterion("collection_owe <=", value, "collectionOwe");
            return (Criteria) this;
        }

        public Criteria andCollectionOweIn(List<Long> values) {
            addCriterion("collection_owe in", values, "collectionOwe");
            return (Criteria) this;
        }

        public Criteria andCollectionOweNotIn(List<Long> values) {
            addCriterion("collection_owe not in", values, "collectionOwe");
            return (Criteria) this;
        }

        public Criteria andCollectionOweBetween(Long value1, Long value2) {
            addCriterion("collection_owe between", value1, value2, "collectionOwe");
            return (Criteria) this;
        }

        public Criteria andCollectionOweNotBetween(Long value1, Long value2) {
            addCriterion("collection_owe not between", value1, value2, "collectionOwe");
            return (Criteria) this;
        }

        public Criteria andReceivableAccruedPenaltyInterestIsNull() {
            addCriterion("receivable_accrued_penalty_interest is null");
            return (Criteria) this;
        }

        public Criteria andReceivableAccruedPenaltyInterestIsNotNull() {
            addCriterion("receivable_accrued_penalty_interest is not null");
            return (Criteria) this;
        }

        public Criteria andReceivableAccruedPenaltyInterestEqualTo(Long value) {
            addCriterion("receivable_accrued_penalty_interest =", value, "receivableAccruedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableAccruedPenaltyInterestNotEqualTo(Long value) {
            addCriterion("receivable_accrued_penalty_interest <>", value, "receivableAccruedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableAccruedPenaltyInterestGreaterThan(Long value) {
            addCriterion("receivable_accrued_penalty_interest >", value, "receivableAccruedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableAccruedPenaltyInterestGreaterThanOrEqualTo(Long value) {
            addCriterion("receivable_accrued_penalty_interest >=", value, "receivableAccruedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableAccruedPenaltyInterestLessThan(Long value) {
            addCriterion("receivable_accrued_penalty_interest <", value, "receivableAccruedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableAccruedPenaltyInterestLessThanOrEqualTo(Long value) {
            addCriterion("receivable_accrued_penalty_interest <=", value, "receivableAccruedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableAccruedPenaltyInterestIn(List<Long> values) {
            addCriterion("receivable_accrued_penalty_interest in", values, "receivableAccruedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableAccruedPenaltyInterestNotIn(List<Long> values) {
            addCriterion("receivable_accrued_penalty_interest not in", values, "receivableAccruedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableAccruedPenaltyInterestBetween(Long value1, Long value2) {
            addCriterion("receivable_accrued_penalty_interest between", value1, value2, "receivableAccruedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableAccruedPenaltyInterestNotBetween(Long value1, Long value2) {
            addCriterion("receivable_accrued_penalty_interest not between", value1, value2, "receivableAccruedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionAccruedPenaltyInterestIsNull() {
            addCriterion("collection_accrued_penalty_interest is null");
            return (Criteria) this;
        }

        public Criteria andCollectionAccruedPenaltyInterestIsNotNull() {
            addCriterion("collection_accrued_penalty_interest is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionAccruedPenaltyInterestEqualTo(Long value) {
            addCriterion("collection_accrued_penalty_interest =", value, "collectionAccruedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionAccruedPenaltyInterestNotEqualTo(Long value) {
            addCriterion("collection_accrued_penalty_interest <>", value, "collectionAccruedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionAccruedPenaltyInterestGreaterThan(Long value) {
            addCriterion("collection_accrued_penalty_interest >", value, "collectionAccruedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionAccruedPenaltyInterestGreaterThanOrEqualTo(Long value) {
            addCriterion("collection_accrued_penalty_interest >=", value, "collectionAccruedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionAccruedPenaltyInterestLessThan(Long value) {
            addCriterion("collection_accrued_penalty_interest <", value, "collectionAccruedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionAccruedPenaltyInterestLessThanOrEqualTo(Long value) {
            addCriterion("collection_accrued_penalty_interest <=", value, "collectionAccruedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionAccruedPenaltyInterestIn(List<Long> values) {
            addCriterion("collection_accrued_penalty_interest in", values, "collectionAccruedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionAccruedPenaltyInterestNotIn(List<Long> values) {
            addCriterion("collection_accrued_penalty_interest not in", values, "collectionAccruedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionAccruedPenaltyInterestBetween(Long value1, Long value2) {
            addCriterion("collection_accrued_penalty_interest between", value1, value2, "collectionAccruedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionAccruedPenaltyInterestNotBetween(Long value1, Long value2) {
            addCriterion("collection_accrued_penalty_interest not between", value1, value2, "collectionAccruedPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andReceivablePenaltyInterestIsNull() {
            addCriterion("receivable_penalty_interest is null");
            return (Criteria) this;
        }

        public Criteria andReceivablePenaltyInterestIsNotNull() {
            addCriterion("receivable_penalty_interest is not null");
            return (Criteria) this;
        }

        public Criteria andReceivablePenaltyInterestEqualTo(Long value) {
            addCriterion("receivable_penalty_interest =", value, "receivablePenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andReceivablePenaltyInterestNotEqualTo(Long value) {
            addCriterion("receivable_penalty_interest <>", value, "receivablePenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andReceivablePenaltyInterestGreaterThan(Long value) {
            addCriterion("receivable_penalty_interest >", value, "receivablePenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andReceivablePenaltyInterestGreaterThanOrEqualTo(Long value) {
            addCriterion("receivable_penalty_interest >=", value, "receivablePenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andReceivablePenaltyInterestLessThan(Long value) {
            addCriterion("receivable_penalty_interest <", value, "receivablePenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andReceivablePenaltyInterestLessThanOrEqualTo(Long value) {
            addCriterion("receivable_penalty_interest <=", value, "receivablePenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andReceivablePenaltyInterestIn(List<Long> values) {
            addCriterion("receivable_penalty_interest in", values, "receivablePenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andReceivablePenaltyInterestNotIn(List<Long> values) {
            addCriterion("receivable_penalty_interest not in", values, "receivablePenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andReceivablePenaltyInterestBetween(Long value1, Long value2) {
            addCriterion("receivable_penalty_interest between", value1, value2, "receivablePenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andReceivablePenaltyInterestNotBetween(Long value1, Long value2) {
            addCriterion("receivable_penalty_interest not between", value1, value2, "receivablePenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionPenaltyInterestIsNull() {
            addCriterion("collection_penalty_interest is null");
            return (Criteria) this;
        }

        public Criteria andCollectionPenaltyInterestIsNotNull() {
            addCriterion("collection_penalty_interest is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionPenaltyInterestEqualTo(Long value) {
            addCriterion("collection_penalty_interest =", value, "collectionPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionPenaltyInterestNotEqualTo(Long value) {
            addCriterion("collection_penalty_interest <>", value, "collectionPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionPenaltyInterestGreaterThan(Long value) {
            addCriterion("collection_penalty_interest >", value, "collectionPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionPenaltyInterestGreaterThanOrEqualTo(Long value) {
            addCriterion("collection_penalty_interest >=", value, "collectionPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionPenaltyInterestLessThan(Long value) {
            addCriterion("collection_penalty_interest <", value, "collectionPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionPenaltyInterestLessThanOrEqualTo(Long value) {
            addCriterion("collection_penalty_interest <=", value, "collectionPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionPenaltyInterestIn(List<Long> values) {
            addCriterion("collection_penalty_interest in", values, "collectionPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionPenaltyInterestNotIn(List<Long> values) {
            addCriterion("collection_penalty_interest not in", values, "collectionPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionPenaltyInterestBetween(Long value1, Long value2) {
            addCriterion("collection_penalty_interest between", value1, value2, "collectionPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionPenaltyInterestNotBetween(Long value1, Long value2) {
            addCriterion("collection_penalty_interest not between", value1, value2, "collectionPenaltyInterest");
            return (Criteria) this;
        }

        public Criteria andAccruedIsNull() {
            addCriterion("accrued is null");
            return (Criteria) this;
        }

        public Criteria andAccruedIsNotNull() {
            addCriterion("accrued is not null");
            return (Criteria) this;
        }

        public Criteria andAccruedEqualTo(Long value) {
            addCriterion("accrued =", value, "accrued");
            return (Criteria) this;
        }

        public Criteria andAccruedNotEqualTo(Long value) {
            addCriterion("accrued <>", value, "accrued");
            return (Criteria) this;
        }

        public Criteria andAccruedGreaterThan(Long value) {
            addCriterion("accrued >", value, "accrued");
            return (Criteria) this;
        }

        public Criteria andAccruedGreaterThanOrEqualTo(Long value) {
            addCriterion("accrued >=", value, "accrued");
            return (Criteria) this;
        }

        public Criteria andAccruedLessThan(Long value) {
            addCriterion("accrued <", value, "accrued");
            return (Criteria) this;
        }

        public Criteria andAccruedLessThanOrEqualTo(Long value) {
            addCriterion("accrued <=", value, "accrued");
            return (Criteria) this;
        }

        public Criteria andAccruedIn(List<Long> values) {
            addCriterion("accrued in", values, "accrued");
            return (Criteria) this;
        }

        public Criteria andAccruedNotIn(List<Long> values) {
            addCriterion("accrued not in", values, "accrued");
            return (Criteria) this;
        }

        public Criteria andAccruedBetween(Long value1, Long value2) {
            addCriterion("accrued between", value1, value2, "accrued");
            return (Criteria) this;
        }

        public Criteria andAccruedNotBetween(Long value1, Long value2) {
            addCriterion("accrued not between", value1, value2, "accrued");
            return (Criteria) this;
        }

        public Criteria andRecipeIsNull() {
            addCriterion("recipe is null");
            return (Criteria) this;
        }

        public Criteria andRecipeIsNotNull() {
            addCriterion("recipe is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeEqualTo(Long value) {
            addCriterion("recipe =", value, "recipe");
            return (Criteria) this;
        }

        public Criteria andRecipeNotEqualTo(Long value) {
            addCriterion("recipe <>", value, "recipe");
            return (Criteria) this;
        }

        public Criteria andRecipeGreaterThan(Long value) {
            addCriterion("recipe >", value, "recipe");
            return (Criteria) this;
        }

        public Criteria andRecipeGreaterThanOrEqualTo(Long value) {
            addCriterion("recipe >=", value, "recipe");
            return (Criteria) this;
        }

        public Criteria andRecipeLessThan(Long value) {
            addCriterion("recipe <", value, "recipe");
            return (Criteria) this;
        }

        public Criteria andRecipeLessThanOrEqualTo(Long value) {
            addCriterion("recipe <=", value, "recipe");
            return (Criteria) this;
        }

        public Criteria andRecipeIn(List<Long> values) {
            addCriterion("recipe in", values, "recipe");
            return (Criteria) this;
        }

        public Criteria andRecipeNotIn(List<Long> values) {
            addCriterion("recipe not in", values, "recipe");
            return (Criteria) this;
        }

        public Criteria andRecipeBetween(Long value1, Long value2) {
            addCriterion("recipe between", value1, value2, "recipe");
            return (Criteria) this;
        }

        public Criteria andRecipeNotBetween(Long value1, Long value2) {
            addCriterion("recipe not between", value1, value2, "recipe");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusIsNull() {
            addCriterion("current_status is null");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusIsNotNull() {
            addCriterion("current_status is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusEqualTo(String value) {
            addCriterion("current_status =", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotEqualTo(String value) {
            addCriterion("current_status <>", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusGreaterThan(String value) {
            addCriterion("current_status >", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("current_status >=", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLessThan(String value) {
            addCriterion("current_status <", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLessThanOrEqualTo(String value) {
            addCriterion("current_status <=", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLike(String value) {
            addCriterion("current_status like", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotLike(String value) {
            addCriterion("current_status not like", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusIn(List<String> values) {
            addCriterion("current_status in", values, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotIn(List<String> values) {
            addCriterion("current_status not in", values, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusBetween(String value1, String value2) {
            addCriterion("current_status between", value1, value2, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotBetween(String value1, String value2) {
            addCriterion("current_status not between", value1, value2, "currentStatus");
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