package com.yonyou.scf.common.entity;

import java.util.ArrayList;
import java.util.List;

public class InvoiceBillingDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InvoiceBillingDetailExample() {
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

        public Criteria andIbdIdIsNull() {
            addCriterion("ibd_id is null");
            return (Criteria) this;
        }

        public Criteria andIbdIdIsNotNull() {
            addCriterion("ibd_id is not null");
            return (Criteria) this;
        }

        public Criteria andIbdIdEqualTo(Long value) {
            addCriterion("ibd_id =", value, "ibdId");
            return (Criteria) this;
        }

        public Criteria andIbdIdNotEqualTo(Long value) {
            addCriterion("ibd_id <>", value, "ibdId");
            return (Criteria) this;
        }

        public Criteria andIbdIdGreaterThan(Long value) {
            addCriterion("ibd_id >", value, "ibdId");
            return (Criteria) this;
        }

        public Criteria andIbdIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ibd_id >=", value, "ibdId");
            return (Criteria) this;
        }

        public Criteria andIbdIdLessThan(Long value) {
            addCriterion("ibd_id <", value, "ibdId");
            return (Criteria) this;
        }

        public Criteria andIbdIdLessThanOrEqualTo(Long value) {
            addCriterion("ibd_id <=", value, "ibdId");
            return (Criteria) this;
        }

        public Criteria andIbdIdIn(List<Long> values) {
            addCriterion("ibd_id in", values, "ibdId");
            return (Criteria) this;
        }

        public Criteria andIbdIdNotIn(List<Long> values) {
            addCriterion("ibd_id not in", values, "ibdId");
            return (Criteria) this;
        }

        public Criteria andIbdIdBetween(Long value1, Long value2) {
            addCriterion("ibd_id between", value1, value2, "ibdId");
            return (Criteria) this;
        }

        public Criteria andIbdIdNotBetween(Long value1, Long value2) {
            addCriterion("ibd_id not between", value1, value2, "ibdId");
            return (Criteria) this;
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