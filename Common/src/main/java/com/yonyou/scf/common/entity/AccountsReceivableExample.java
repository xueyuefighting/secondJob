package com.yonyou.scf.common.entity;

import java.util.ArrayList;
import java.util.List;

public class AccountsReceivableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountsReceivableExample() {
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

        public Criteria andReceiveIdIsNull() {
            addCriterion("receive_id is null");
            return (Criteria) this;
        }

        public Criteria andReceiveIdIsNotNull() {
            addCriterion("receive_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveIdEqualTo(Long value) {
            addCriterion("receive_id =", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdNotEqualTo(Long value) {
            addCriterion("receive_id <>", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdGreaterThan(Long value) {
            addCriterion("receive_id >", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdGreaterThanOrEqualTo(Long value) {
            addCriterion("receive_id >=", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdLessThan(Long value) {
            addCriterion("receive_id <", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdLessThanOrEqualTo(Long value) {
            addCriterion("receive_id <=", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdIn(List<Long> values) {
            addCriterion("receive_id in", values, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdNotIn(List<Long> values) {
            addCriterion("receive_id not in", values, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdBetween(Long value1, Long value2) {
            addCriterion("receive_id between", value1, value2, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdNotBetween(Long value1, Long value2) {
            addCriterion("receive_id not between", value1, value2, "receiveId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("company_id like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("company_id not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andReceiveCodeIsNull() {
            addCriterion("receive_code is null");
            return (Criteria) this;
        }

        public Criteria andReceiveCodeIsNotNull() {
            addCriterion("receive_code is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveCodeEqualTo(String value) {
            addCriterion("receive_code =", value, "receiveCode");
            return (Criteria) this;
        }

        public Criteria andReceiveCodeNotEqualTo(String value) {
            addCriterion("receive_code <>", value, "receiveCode");
            return (Criteria) this;
        }

        public Criteria andReceiveCodeGreaterThan(String value) {
            addCriterion("receive_code >", value, "receiveCode");
            return (Criteria) this;
        }

        public Criteria andReceiveCodeGreaterThanOrEqualTo(String value) {
            addCriterion("receive_code >=", value, "receiveCode");
            return (Criteria) this;
        }

        public Criteria andReceiveCodeLessThan(String value) {
            addCriterion("receive_code <", value, "receiveCode");
            return (Criteria) this;
        }

        public Criteria andReceiveCodeLessThanOrEqualTo(String value) {
            addCriterion("receive_code <=", value, "receiveCode");
            return (Criteria) this;
        }

        public Criteria andReceiveCodeLike(String value) {
            addCriterion("receive_code like", value, "receiveCode");
            return (Criteria) this;
        }

        public Criteria andReceiveCodeNotLike(String value) {
            addCriterion("receive_code not like", value, "receiveCode");
            return (Criteria) this;
        }

        public Criteria andReceiveCodeIn(List<String> values) {
            addCriterion("receive_code in", values, "receiveCode");
            return (Criteria) this;
        }

        public Criteria andReceiveCodeNotIn(List<String> values) {
            addCriterion("receive_code not in", values, "receiveCode");
            return (Criteria) this;
        }

        public Criteria andReceiveCodeBetween(String value1, String value2) {
            addCriterion("receive_code between", value1, value2, "receiveCode");
            return (Criteria) this;
        }

        public Criteria andReceiveCodeNotBetween(String value1, String value2) {
            addCriterion("receive_code not between", value1, value2, "receiveCode");
            return (Criteria) this;
        }

        public Criteria andReceiveTotalAmountIsNull() {
            addCriterion("receive_total_amount is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTotalAmountIsNotNull() {
            addCriterion("receive_total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTotalAmountEqualTo(Long value) {
            addCriterion("receive_total_amount =", value, "receiveTotalAmount");
            return (Criteria) this;
        }

        public Criteria andReceiveTotalAmountNotEqualTo(Long value) {
            addCriterion("receive_total_amount <>", value, "receiveTotalAmount");
            return (Criteria) this;
        }

        public Criteria andReceiveTotalAmountGreaterThan(Long value) {
            addCriterion("receive_total_amount >", value, "receiveTotalAmount");
            return (Criteria) this;
        }

        public Criteria andReceiveTotalAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("receive_total_amount >=", value, "receiveTotalAmount");
            return (Criteria) this;
        }

        public Criteria andReceiveTotalAmountLessThan(Long value) {
            addCriterion("receive_total_amount <", value, "receiveTotalAmount");
            return (Criteria) this;
        }

        public Criteria andReceiveTotalAmountLessThanOrEqualTo(Long value) {
            addCriterion("receive_total_amount <=", value, "receiveTotalAmount");
            return (Criteria) this;
        }

        public Criteria andReceiveTotalAmountIn(List<Long> values) {
            addCriterion("receive_total_amount in", values, "receiveTotalAmount");
            return (Criteria) this;
        }

        public Criteria andReceiveTotalAmountNotIn(List<Long> values) {
            addCriterion("receive_total_amount not in", values, "receiveTotalAmount");
            return (Criteria) this;
        }

        public Criteria andReceiveTotalAmountBetween(Long value1, Long value2) {
            addCriterion("receive_total_amount between", value1, value2, "receiveTotalAmount");
            return (Criteria) this;
        }

        public Criteria andReceiveTotalAmountNotBetween(Long value1, Long value2) {
            addCriterion("receive_total_amount not between", value1, value2, "receiveTotalAmount");
            return (Criteria) this;
        }

        public Criteria andReceiveBalanceIsNull() {
            addCriterion("receive_balance is null");
            return (Criteria) this;
        }

        public Criteria andReceiveBalanceIsNotNull() {
            addCriterion("receive_balance is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveBalanceEqualTo(Long value) {
            addCriterion("receive_balance =", value, "receiveBalance");
            return (Criteria) this;
        }

        public Criteria andReceiveBalanceNotEqualTo(Long value) {
            addCriterion("receive_balance <>", value, "receiveBalance");
            return (Criteria) this;
        }

        public Criteria andReceiveBalanceGreaterThan(Long value) {
            addCriterion("receive_balance >", value, "receiveBalance");
            return (Criteria) this;
        }

        public Criteria andReceiveBalanceGreaterThanOrEqualTo(Long value) {
            addCriterion("receive_balance >=", value, "receiveBalance");
            return (Criteria) this;
        }

        public Criteria andReceiveBalanceLessThan(Long value) {
            addCriterion("receive_balance <", value, "receiveBalance");
            return (Criteria) this;
        }

        public Criteria andReceiveBalanceLessThanOrEqualTo(Long value) {
            addCriterion("receive_balance <=", value, "receiveBalance");
            return (Criteria) this;
        }

        public Criteria andReceiveBalanceIn(List<Long> values) {
            addCriterion("receive_balance in", values, "receiveBalance");
            return (Criteria) this;
        }

        public Criteria andReceiveBalanceNotIn(List<Long> values) {
            addCriterion("receive_balance not in", values, "receiveBalance");
            return (Criteria) this;
        }

        public Criteria andReceiveBalanceBetween(Long value1, Long value2) {
            addCriterion("receive_balance between", value1, value2, "receiveBalance");
            return (Criteria) this;
        }

        public Criteria andReceiveBalanceNotBetween(Long value1, Long value2) {
            addCriterion("receive_balance not between", value1, value2, "receiveBalance");
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

        public Criteria andAgencyIdEqualTo(String value) {
            addCriterion("agency_id =", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotEqualTo(String value) {
            addCriterion("agency_id <>", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdGreaterThan(String value) {
            addCriterion("agency_id >", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdGreaterThanOrEqualTo(String value) {
            addCriterion("agency_id >=", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdLessThan(String value) {
            addCriterion("agency_id <", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdLessThanOrEqualTo(String value) {
            addCriterion("agency_id <=", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdLike(String value) {
            addCriterion("agency_id like", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotLike(String value) {
            addCriterion("agency_id not like", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdIn(List<String> values) {
            addCriterion("agency_id in", values, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotIn(List<String> values) {
            addCriterion("agency_id not in", values, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdBetween(String value1, String value2) {
            addCriterion("agency_id between", value1, value2, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotBetween(String value1, String value2) {
            addCriterion("agency_id not between", value1, value2, "agencyId");
            return (Criteria) this;
        }

        public Criteria andTransferIsNull() {
            addCriterion("transfer is null");
            return (Criteria) this;
        }

        public Criteria andTransferIsNotNull() {
            addCriterion("transfer is not null");
            return (Criteria) this;
        }

        public Criteria andTransferEqualTo(String value) {
            addCriterion("transfer =", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferNotEqualTo(String value) {
            addCriterion("transfer <>", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferGreaterThan(String value) {
            addCriterion("transfer >", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferGreaterThanOrEqualTo(String value) {
            addCriterion("transfer >=", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferLessThan(String value) {
            addCriterion("transfer <", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferLessThanOrEqualTo(String value) {
            addCriterion("transfer <=", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferLike(String value) {
            addCriterion("transfer like", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferNotLike(String value) {
            addCriterion("transfer not like", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferIn(List<String> values) {
            addCriterion("transfer in", values, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferNotIn(List<String> values) {
            addCriterion("transfer not in", values, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferBetween(String value1, String value2) {
            addCriterion("transfer between", value1, value2, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferNotBetween(String value1, String value2) {
            addCriterion("transfer not between", value1, value2, "transfer");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateIsNull() {
            addCriterion("invoice_date is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateIsNotNull() {
            addCriterion("invoice_date is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateEqualTo(String value) {
            addCriterion("invoice_date =", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateNotEqualTo(String value) {
            addCriterion("invoice_date <>", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateGreaterThan(String value) {
            addCriterion("invoice_date >", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_date >=", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateLessThan(String value) {
            addCriterion("invoice_date <", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateLessThanOrEqualTo(String value) {
            addCriterion("invoice_date <=", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateLike(String value) {
            addCriterion("invoice_date like", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateNotLike(String value) {
            addCriterion("invoice_date not like", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateIn(List<String> values) {
            addCriterion("invoice_date in", values, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateNotIn(List<String> values) {
            addCriterion("invoice_date not in", values, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateBetween(String value1, String value2) {
            addCriterion("invoice_date between", value1, value2, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateNotBetween(String value1, String value2) {
            addCriterion("invoice_date not between", value1, value2, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateIsNull() {
            addCriterion("expiry_date is null");
            return (Criteria) this;
        }

        public Criteria andExpiryDateIsNotNull() {
            addCriterion("expiry_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpiryDateEqualTo(String value) {
            addCriterion("expiry_date =", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotEqualTo(String value) {
            addCriterion("expiry_date <>", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateGreaterThan(String value) {
            addCriterion("expiry_date >", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateGreaterThanOrEqualTo(String value) {
            addCriterion("expiry_date >=", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateLessThan(String value) {
            addCriterion("expiry_date <", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateLessThanOrEqualTo(String value) {
            addCriterion("expiry_date <=", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateLike(String value) {
            addCriterion("expiry_date like", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotLike(String value) {
            addCriterion("expiry_date not like", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateIn(List<String> values) {
            addCriterion("expiry_date in", values, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotIn(List<String> values) {
            addCriterion("expiry_date not in", values, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateBetween(String value1, String value2) {
            addCriterion("expiry_date between", value1, value2, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotBetween(String value1, String value2) {
            addCriterion("expiry_date not between", value1, value2, "expiryDate");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPactCodeIsNull() {
            addCriterion("pact_code is null");
            return (Criteria) this;
        }

        public Criteria andPactCodeIsNotNull() {
            addCriterion("pact_code is not null");
            return (Criteria) this;
        }

        public Criteria andPactCodeEqualTo(String value) {
            addCriterion("pact_code =", value, "pactCode");
            return (Criteria) this;
        }

        public Criteria andPactCodeNotEqualTo(String value) {
            addCriterion("pact_code <>", value, "pactCode");
            return (Criteria) this;
        }

        public Criteria andPactCodeGreaterThan(String value) {
            addCriterion("pact_code >", value, "pactCode");
            return (Criteria) this;
        }

        public Criteria andPactCodeGreaterThanOrEqualTo(String value) {
            addCriterion("pact_code >=", value, "pactCode");
            return (Criteria) this;
        }

        public Criteria andPactCodeLessThan(String value) {
            addCriterion("pact_code <", value, "pactCode");
            return (Criteria) this;
        }

        public Criteria andPactCodeLessThanOrEqualTo(String value) {
            addCriterion("pact_code <=", value, "pactCode");
            return (Criteria) this;
        }

        public Criteria andPactCodeLike(String value) {
            addCriterion("pact_code like", value, "pactCode");
            return (Criteria) this;
        }

        public Criteria andPactCodeNotLike(String value) {
            addCriterion("pact_code not like", value, "pactCode");
            return (Criteria) this;
        }

        public Criteria andPactCodeIn(List<String> values) {
            addCriterion("pact_code in", values, "pactCode");
            return (Criteria) this;
        }

        public Criteria andPactCodeNotIn(List<String> values) {
            addCriterion("pact_code not in", values, "pactCode");
            return (Criteria) this;
        }

        public Criteria andPactCodeBetween(String value1, String value2) {
            addCriterion("pact_code between", value1, value2, "pactCode");
            return (Criteria) this;
        }

        public Criteria andPactCodeNotBetween(String value1, String value2) {
            addCriterion("pact_code not between", value1, value2, "pactCode");
            return (Criteria) this;
        }

        public Criteria andPactStartDateIsNull() {
            addCriterion("pact_start_date is null");
            return (Criteria) this;
        }

        public Criteria andPactStartDateIsNotNull() {
            addCriterion("pact_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andPactStartDateEqualTo(String value) {
            addCriterion("pact_start_date =", value, "pactStartDate");
            return (Criteria) this;
        }

        public Criteria andPactStartDateNotEqualTo(String value) {
            addCriterion("pact_start_date <>", value, "pactStartDate");
            return (Criteria) this;
        }

        public Criteria andPactStartDateGreaterThan(String value) {
            addCriterion("pact_start_date >", value, "pactStartDate");
            return (Criteria) this;
        }

        public Criteria andPactStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("pact_start_date >=", value, "pactStartDate");
            return (Criteria) this;
        }

        public Criteria andPactStartDateLessThan(String value) {
            addCriterion("pact_start_date <", value, "pactStartDate");
            return (Criteria) this;
        }

        public Criteria andPactStartDateLessThanOrEqualTo(String value) {
            addCriterion("pact_start_date <=", value, "pactStartDate");
            return (Criteria) this;
        }

        public Criteria andPactStartDateLike(String value) {
            addCriterion("pact_start_date like", value, "pactStartDate");
            return (Criteria) this;
        }

        public Criteria andPactStartDateNotLike(String value) {
            addCriterion("pact_start_date not like", value, "pactStartDate");
            return (Criteria) this;
        }

        public Criteria andPactStartDateIn(List<String> values) {
            addCriterion("pact_start_date in", values, "pactStartDate");
            return (Criteria) this;
        }

        public Criteria andPactStartDateNotIn(List<String> values) {
            addCriterion("pact_start_date not in", values, "pactStartDate");
            return (Criteria) this;
        }

        public Criteria andPactStartDateBetween(String value1, String value2) {
            addCriterion("pact_start_date between", value1, value2, "pactStartDate");
            return (Criteria) this;
        }

        public Criteria andPactStartDateNotBetween(String value1, String value2) {
            addCriterion("pact_start_date not between", value1, value2, "pactStartDate");
            return (Criteria) this;
        }

        public Criteria andPactEndDateIsNull() {
            addCriterion("pact_end_date is null");
            return (Criteria) this;
        }

        public Criteria andPactEndDateIsNotNull() {
            addCriterion("pact_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andPactEndDateEqualTo(String value) {
            addCriterion("pact_end_date =", value, "pactEndDate");
            return (Criteria) this;
        }

        public Criteria andPactEndDateNotEqualTo(String value) {
            addCriterion("pact_end_date <>", value, "pactEndDate");
            return (Criteria) this;
        }

        public Criteria andPactEndDateGreaterThan(String value) {
            addCriterion("pact_end_date >", value, "pactEndDate");
            return (Criteria) this;
        }

        public Criteria andPactEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("pact_end_date >=", value, "pactEndDate");
            return (Criteria) this;
        }

        public Criteria andPactEndDateLessThan(String value) {
            addCriterion("pact_end_date <", value, "pactEndDate");
            return (Criteria) this;
        }

        public Criteria andPactEndDateLessThanOrEqualTo(String value) {
            addCriterion("pact_end_date <=", value, "pactEndDate");
            return (Criteria) this;
        }

        public Criteria andPactEndDateLike(String value) {
            addCriterion("pact_end_date like", value, "pactEndDate");
            return (Criteria) this;
        }

        public Criteria andPactEndDateNotLike(String value) {
            addCriterion("pact_end_date not like", value, "pactEndDate");
            return (Criteria) this;
        }

        public Criteria andPactEndDateIn(List<String> values) {
            addCriterion("pact_end_date in", values, "pactEndDate");
            return (Criteria) this;
        }

        public Criteria andPactEndDateNotIn(List<String> values) {
            addCriterion("pact_end_date not in", values, "pactEndDate");
            return (Criteria) this;
        }

        public Criteria andPactEndDateBetween(String value1, String value2) {
            addCriterion("pact_end_date between", value1, value2, "pactEndDate");
            return (Criteria) this;
        }

        public Criteria andPactEndDateNotBetween(String value1, String value2) {
            addCriterion("pact_end_date not between", value1, value2, "pactEndDate");
            return (Criteria) this;
        }

        public Criteria andClaimsLendingIsNull() {
            addCriterion("claims_lending is null");
            return (Criteria) this;
        }

        public Criteria andClaimsLendingIsNotNull() {
            addCriterion("claims_lending is not null");
            return (Criteria) this;
        }

        public Criteria andClaimsLendingEqualTo(Long value) {
            addCriterion("claims_lending =", value, "claimsLending");
            return (Criteria) this;
        }

        public Criteria andClaimsLendingNotEqualTo(Long value) {
            addCriterion("claims_lending <>", value, "claimsLending");
            return (Criteria) this;
        }

        public Criteria andClaimsLendingGreaterThan(Long value) {
            addCriterion("claims_lending >", value, "claimsLending");
            return (Criteria) this;
        }

        public Criteria andClaimsLendingGreaterThanOrEqualTo(Long value) {
            addCriterion("claims_lending >=", value, "claimsLending");
            return (Criteria) this;
        }

        public Criteria andClaimsLendingLessThan(Long value) {
            addCriterion("claims_lending <", value, "claimsLending");
            return (Criteria) this;
        }

        public Criteria andClaimsLendingLessThanOrEqualTo(Long value) {
            addCriterion("claims_lending <=", value, "claimsLending");
            return (Criteria) this;
        }

        public Criteria andClaimsLendingIn(List<Long> values) {
            addCriterion("claims_lending in", values, "claimsLending");
            return (Criteria) this;
        }

        public Criteria andClaimsLendingNotIn(List<Long> values) {
            addCriterion("claims_lending not in", values, "claimsLending");
            return (Criteria) this;
        }

        public Criteria andClaimsLendingBetween(Long value1, Long value2) {
            addCriterion("claims_lending between", value1, value2, "claimsLending");
            return (Criteria) this;
        }

        public Criteria andClaimsLendingNotBetween(Long value1, Long value2) {
            addCriterion("claims_lending not between", value1, value2, "claimsLending");
            return (Criteria) this;
        }

        public Criteria andFinancingIsNull() {
            addCriterion("financing is null");
            return (Criteria) this;
        }

        public Criteria andFinancingIsNotNull() {
            addCriterion("financing is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingEqualTo(String value) {
            addCriterion("financing =", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingNotEqualTo(String value) {
            addCriterion("financing <>", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingGreaterThan(String value) {
            addCriterion("financing >", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingGreaterThanOrEqualTo(String value) {
            addCriterion("financing >=", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingLessThan(String value) {
            addCriterion("financing <", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingLessThanOrEqualTo(String value) {
            addCriterion("financing <=", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingLike(String value) {
            addCriterion("financing like", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingNotLike(String value) {
            addCriterion("financing not like", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingIn(List<String> values) {
            addCriterion("financing in", values, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingNotIn(List<String> values) {
            addCriterion("financing not in", values, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingBetween(String value1, String value2) {
            addCriterion("financing between", value1, value2, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingNotBetween(String value1, String value2) {
            addCriterion("financing not between", value1, value2, "financing");
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

        public Criteria andCreateDatetimeIsNull() {
            addCriterion("create_datetime is null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIsNotNull() {
            addCriterion("create_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeEqualTo(String value) {
            addCriterion("create_datetime =", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotEqualTo(String value) {
            addCriterion("create_datetime <>", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThan(String value) {
            addCriterion("create_datetime >", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_datetime >=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThan(String value) {
            addCriterion("create_datetime <", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThanOrEqualTo(String value) {
            addCriterion("create_datetime <=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLike(String value) {
            addCriterion("create_datetime like", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotLike(String value) {
            addCriterion("create_datetime not like", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIn(List<String> values) {
            addCriterion("create_datetime in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotIn(List<String> values) {
            addCriterion("create_datetime not in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeBetween(String value1, String value2) {
            addCriterion("create_datetime between", value1, value2, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotBetween(String value1, String value2) {
            addCriterion("create_datetime not between", value1, value2, "createDatetime");
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

        public Criteria andUpdateDatetimeIsNull() {
            addCriterion("update_datetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNotNull() {
            addCriterion("update_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeEqualTo(String value) {
            addCriterion("update_datetime =", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotEqualTo(String value) {
            addCriterion("update_datetime <>", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThan(String value) {
            addCriterion("update_datetime >", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("update_datetime >=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThan(String value) {
            addCriterion("update_datetime <", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThanOrEqualTo(String value) {
            addCriterion("update_datetime <=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLike(String value) {
            addCriterion("update_datetime like", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotLike(String value) {
            addCriterion("update_datetime not like", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIn(List<String> values) {
            addCriterion("update_datetime in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotIn(List<String> values) {
            addCriterion("update_datetime not in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeBetween(String value1, String value2) {
            addCriterion("update_datetime between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotBetween(String value1, String value2) {
            addCriterion("update_datetime not between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andInvalidIsNull() {
            addCriterion("invalid is null");
            return (Criteria) this;
        }

        public Criteria andInvalidIsNotNull() {
            addCriterion("invalid is not null");
            return (Criteria) this;
        }

        public Criteria andInvalidEqualTo(String value) {
            addCriterion("invalid =", value, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidNotEqualTo(String value) {
            addCriterion("invalid <>", value, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidGreaterThan(String value) {
            addCriterion("invalid >", value, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidGreaterThanOrEqualTo(String value) {
            addCriterion("invalid >=", value, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidLessThan(String value) {
            addCriterion("invalid <", value, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidLessThanOrEqualTo(String value) {
            addCriterion("invalid <=", value, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidLike(String value) {
            addCriterion("invalid like", value, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidNotLike(String value) {
            addCriterion("invalid not like", value, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidIn(List<String> values) {
            addCriterion("invalid in", values, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidNotIn(List<String> values) {
            addCriterion("invalid not in", values, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidBetween(String value1, String value2) {
            addCriterion("invalid between", value1, value2, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidNotBetween(String value1, String value2) {
            addCriterion("invalid not between", value1, value2, "invalid");
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