package com.yonyou.scf.common.entity;

import java.util.ArrayList;
import java.util.List;

public class ModifyPayAmountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ModifyPayAmountExample() {
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

        public Criteria andInterfaceNoIsNull() {
            addCriterion("interface_no is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceNoIsNotNull() {
            addCriterion("interface_no is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceNoEqualTo(String value) {
            addCriterion("interface_no =", value, "interfaceNo");
            return (Criteria) this;
        }

        public Criteria andInterfaceNoNotEqualTo(String value) {
            addCriterion("interface_no <>", value, "interfaceNo");
            return (Criteria) this;
        }

        public Criteria andInterfaceNoGreaterThan(String value) {
            addCriterion("interface_no >", value, "interfaceNo");
            return (Criteria) this;
        }

        public Criteria andInterfaceNoGreaterThanOrEqualTo(String value) {
            addCriterion("interface_no >=", value, "interfaceNo");
            return (Criteria) this;
        }

        public Criteria andInterfaceNoLessThan(String value) {
            addCriterion("interface_no <", value, "interfaceNo");
            return (Criteria) this;
        }

        public Criteria andInterfaceNoLessThanOrEqualTo(String value) {
            addCriterion("interface_no <=", value, "interfaceNo");
            return (Criteria) this;
        }

        public Criteria andInterfaceNoLike(String value) {
            addCriterion("interface_no like", value, "interfaceNo");
            return (Criteria) this;
        }

        public Criteria andInterfaceNoNotLike(String value) {
            addCriterion("interface_no not like", value, "interfaceNo");
            return (Criteria) this;
        }

        public Criteria andInterfaceNoIn(List<String> values) {
            addCriterion("interface_no in", values, "interfaceNo");
            return (Criteria) this;
        }

        public Criteria andInterfaceNoNotIn(List<String> values) {
            addCriterion("interface_no not in", values, "interfaceNo");
            return (Criteria) this;
        }

        public Criteria andInterfaceNoBetween(String value1, String value2) {
            addCriterion("interface_no between", value1, value2, "interfaceNo");
            return (Criteria) this;
        }

        public Criteria andInterfaceNoNotBetween(String value1, String value2) {
            addCriterion("interface_no not between", value1, value2, "interfaceNo");
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

        public Criteria andFundIdIsNull() {
            addCriterion("fund_id is null");
            return (Criteria) this;
        }

        public Criteria andFundIdIsNotNull() {
            addCriterion("fund_id is not null");
            return (Criteria) this;
        }

        public Criteria andFundIdEqualTo(String value) {
            addCriterion("fund_id =", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdNotEqualTo(String value) {
            addCriterion("fund_id <>", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdGreaterThan(String value) {
            addCriterion("fund_id >", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdGreaterThanOrEqualTo(String value) {
            addCriterion("fund_id >=", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdLessThan(String value) {
            addCriterion("fund_id <", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdLessThanOrEqualTo(String value) {
            addCriterion("fund_id <=", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdLike(String value) {
            addCriterion("fund_id like", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdNotLike(String value) {
            addCriterion("fund_id not like", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdIn(List<String> values) {
            addCriterion("fund_id in", values, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdNotIn(List<String> values) {
            addCriterion("fund_id not in", values, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdBetween(String value1, String value2) {
            addCriterion("fund_id between", value1, value2, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdNotBetween(String value1, String value2) {
            addCriterion("fund_id not between", value1, value2, "fundId");
            return (Criteria) this;
        }

        public Criteria andCenterCompanyIdIsNull() {
            addCriterion("center_company_id is null");
            return (Criteria) this;
        }

        public Criteria andCenterCompanyIdIsNotNull() {
            addCriterion("center_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCenterCompanyIdEqualTo(String value) {
            addCriterion("center_company_id =", value, "centerCompanyId");
            return (Criteria) this;
        }

        public Criteria andCenterCompanyIdNotEqualTo(String value) {
            addCriterion("center_company_id <>", value, "centerCompanyId");
            return (Criteria) this;
        }

        public Criteria andCenterCompanyIdGreaterThan(String value) {
            addCriterion("center_company_id >", value, "centerCompanyId");
            return (Criteria) this;
        }

        public Criteria andCenterCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("center_company_id >=", value, "centerCompanyId");
            return (Criteria) this;
        }

        public Criteria andCenterCompanyIdLessThan(String value) {
            addCriterion("center_company_id <", value, "centerCompanyId");
            return (Criteria) this;
        }

        public Criteria andCenterCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("center_company_id <=", value, "centerCompanyId");
            return (Criteria) this;
        }

        public Criteria andCenterCompanyIdLike(String value) {
            addCriterion("center_company_id like", value, "centerCompanyId");
            return (Criteria) this;
        }

        public Criteria andCenterCompanyIdNotLike(String value) {
            addCriterion("center_company_id not like", value, "centerCompanyId");
            return (Criteria) this;
        }

        public Criteria andCenterCompanyIdIn(List<String> values) {
            addCriterion("center_company_id in", values, "centerCompanyId");
            return (Criteria) this;
        }

        public Criteria andCenterCompanyIdNotIn(List<String> values) {
            addCriterion("center_company_id not in", values, "centerCompanyId");
            return (Criteria) this;
        }

        public Criteria andCenterCompanyIdBetween(String value1, String value2) {
            addCriterion("center_company_id between", value1, value2, "centerCompanyId");
            return (Criteria) this;
        }

        public Criteria andCenterCompanyIdNotBetween(String value1, String value2) {
            addCriterion("center_company_id not between", value1, value2, "centerCompanyId");
            return (Criteria) this;
        }

        public Criteria andFsIdIsNull() {
            addCriterion("fs_id is null");
            return (Criteria) this;
        }

        public Criteria andFsIdIsNotNull() {
            addCriterion("fs_id is not null");
            return (Criteria) this;
        }

        public Criteria andFsIdEqualTo(String value) {
            addCriterion("fs_id =", value, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsIdNotEqualTo(String value) {
            addCriterion("fs_id <>", value, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsIdGreaterThan(String value) {
            addCriterion("fs_id >", value, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsIdGreaterThanOrEqualTo(String value) {
            addCriterion("fs_id >=", value, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsIdLessThan(String value) {
            addCriterion("fs_id <", value, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsIdLessThanOrEqualTo(String value) {
            addCriterion("fs_id <=", value, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsIdLike(String value) {
            addCriterion("fs_id like", value, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsIdNotLike(String value) {
            addCriterion("fs_id not like", value, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsIdIn(List<String> values) {
            addCriterion("fs_id in", values, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsIdNotIn(List<String> values) {
            addCriterion("fs_id not in", values, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsIdBetween(String value1, String value2) {
            addCriterion("fs_id between", value1, value2, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsIdNotBetween(String value1, String value2) {
            addCriterion("fs_id not between", value1, value2, "fsId");
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

        public Criteria andFinancingApplicationNoEqualTo(String value) {
            addCriterion("financing_application_no =", value, "financingApplicationNo");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationNoNotEqualTo(String value) {
            addCriterion("financing_application_no <>", value, "financingApplicationNo");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationNoGreaterThan(String value) {
            addCriterion("financing_application_no >", value, "financingApplicationNo");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationNoGreaterThanOrEqualTo(String value) {
            addCriterion("financing_application_no >=", value, "financingApplicationNo");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationNoLessThan(String value) {
            addCriterion("financing_application_no <", value, "financingApplicationNo");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationNoLessThanOrEqualTo(String value) {
            addCriterion("financing_application_no <=", value, "financingApplicationNo");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationNoLike(String value) {
            addCriterion("financing_application_no like", value, "financingApplicationNo");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationNoNotLike(String value) {
            addCriterion("financing_application_no not like", value, "financingApplicationNo");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationNoIn(List<String> values) {
            addCriterion("financing_application_no in", values, "financingApplicationNo");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationNoNotIn(List<String> values) {
            addCriterion("financing_application_no not in", values, "financingApplicationNo");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationNoBetween(String value1, String value2) {
            addCriterion("financing_application_no between", value1, value2, "financingApplicationNo");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationNoNotBetween(String value1, String value2) {
            addCriterion("financing_application_no not between", value1, value2, "financingApplicationNo");
            return (Criteria) this;
        }

        public Criteria andFsManagedAccountBankIdIsNull() {
            addCriterion("fs_managed_account_bank_id is null");
            return (Criteria) this;
        }

        public Criteria andFsManagedAccountBankIdIsNotNull() {
            addCriterion("fs_managed_account_bank_id is not null");
            return (Criteria) this;
        }

        public Criteria andFsManagedAccountBankIdEqualTo(String value) {
            addCriterion("fs_managed_account_bank_id =", value, "fsManagedAccountBankId");
            return (Criteria) this;
        }

        public Criteria andFsManagedAccountBankIdNotEqualTo(String value) {
            addCriterion("fs_managed_account_bank_id <>", value, "fsManagedAccountBankId");
            return (Criteria) this;
        }

        public Criteria andFsManagedAccountBankIdGreaterThan(String value) {
            addCriterion("fs_managed_account_bank_id >", value, "fsManagedAccountBankId");
            return (Criteria) this;
        }

        public Criteria andFsManagedAccountBankIdGreaterThanOrEqualTo(String value) {
            addCriterion("fs_managed_account_bank_id >=", value, "fsManagedAccountBankId");
            return (Criteria) this;
        }

        public Criteria andFsManagedAccountBankIdLessThan(String value) {
            addCriterion("fs_managed_account_bank_id <", value, "fsManagedAccountBankId");
            return (Criteria) this;
        }

        public Criteria andFsManagedAccountBankIdLessThanOrEqualTo(String value) {
            addCriterion("fs_managed_account_bank_id <=", value, "fsManagedAccountBankId");
            return (Criteria) this;
        }

        public Criteria andFsManagedAccountBankIdLike(String value) {
            addCriterion("fs_managed_account_bank_id like", value, "fsManagedAccountBankId");
            return (Criteria) this;
        }

        public Criteria andFsManagedAccountBankIdNotLike(String value) {
            addCriterion("fs_managed_account_bank_id not like", value, "fsManagedAccountBankId");
            return (Criteria) this;
        }

        public Criteria andFsManagedAccountBankIdIn(List<String> values) {
            addCriterion("fs_managed_account_bank_id in", values, "fsManagedAccountBankId");
            return (Criteria) this;
        }

        public Criteria andFsManagedAccountBankIdNotIn(List<String> values) {
            addCriterion("fs_managed_account_bank_id not in", values, "fsManagedAccountBankId");
            return (Criteria) this;
        }

        public Criteria andFsManagedAccountBankIdBetween(String value1, String value2) {
            addCriterion("fs_managed_account_bank_id between", value1, value2, "fsManagedAccountBankId");
            return (Criteria) this;
        }

        public Criteria andFsManagedAccountBankIdNotBetween(String value1, String value2) {
            addCriterion("fs_managed_account_bank_id not between", value1, value2, "fsManagedAccountBankId");
            return (Criteria) this;
        }

        public Criteria andFsManagedAccountNumberIsNull() {
            addCriterion("fs_managed_account_number is null");
            return (Criteria) this;
        }

        public Criteria andFsManagedAccountNumberIsNotNull() {
            addCriterion("fs_managed_account_number is not null");
            return (Criteria) this;
        }

        public Criteria andFsManagedAccountNumberEqualTo(String value) {
            addCriterion("fs_managed_account_number =", value, "fsManagedAccountNumber");
            return (Criteria) this;
        }

        public Criteria andFsManagedAccountNumberNotEqualTo(String value) {
            addCriterion("fs_managed_account_number <>", value, "fsManagedAccountNumber");
            return (Criteria) this;
        }

        public Criteria andFsManagedAccountNumberGreaterThan(String value) {
            addCriterion("fs_managed_account_number >", value, "fsManagedAccountNumber");
            return (Criteria) this;
        }

        public Criteria andFsManagedAccountNumberGreaterThanOrEqualTo(String value) {
            addCriterion("fs_managed_account_number >=", value, "fsManagedAccountNumber");
            return (Criteria) this;
        }

        public Criteria andFsManagedAccountNumberLessThan(String value) {
            addCriterion("fs_managed_account_number <", value, "fsManagedAccountNumber");
            return (Criteria) this;
        }

        public Criteria andFsManagedAccountNumberLessThanOrEqualTo(String value) {
            addCriterion("fs_managed_account_number <=", value, "fsManagedAccountNumber");
            return (Criteria) this;
        }

        public Criteria andFsManagedAccountNumberLike(String value) {
            addCriterion("fs_managed_account_number like", value, "fsManagedAccountNumber");
            return (Criteria) this;
        }

        public Criteria andFsManagedAccountNumberNotLike(String value) {
            addCriterion("fs_managed_account_number not like", value, "fsManagedAccountNumber");
            return (Criteria) this;
        }

        public Criteria andFsManagedAccountNumberIn(List<String> values) {
            addCriterion("fs_managed_account_number in", values, "fsManagedAccountNumber");
            return (Criteria) this;
        }

        public Criteria andFsManagedAccountNumberNotIn(List<String> values) {
            addCriterion("fs_managed_account_number not in", values, "fsManagedAccountNumber");
            return (Criteria) this;
        }

        public Criteria andFsManagedAccountNumberBetween(String value1, String value2) {
            addCriterion("fs_managed_account_number between", value1, value2, "fsManagedAccountNumber");
            return (Criteria) this;
        }

        public Criteria andFsManagedAccountNumberNotBetween(String value1, String value2) {
            addCriterion("fs_managed_account_number not between", value1, value2, "fsManagedAccountNumber");
            return (Criteria) this;
        }

        public Criteria andPayRecevieVoucherNoIsNull() {
            addCriterion("pay_recevie_voucher_no is null");
            return (Criteria) this;
        }

        public Criteria andPayRecevieVoucherNoIsNotNull() {
            addCriterion("pay_recevie_voucher_no is not null");
            return (Criteria) this;
        }

        public Criteria andPayRecevieVoucherNoEqualTo(String value) {
            addCriterion("pay_recevie_voucher_no =", value, "payRecevieVoucherNo");
            return (Criteria) this;
        }

        public Criteria andPayRecevieVoucherNoNotEqualTo(String value) {
            addCriterion("pay_recevie_voucher_no <>", value, "payRecevieVoucherNo");
            return (Criteria) this;
        }

        public Criteria andPayRecevieVoucherNoGreaterThan(String value) {
            addCriterion("pay_recevie_voucher_no >", value, "payRecevieVoucherNo");
            return (Criteria) this;
        }

        public Criteria andPayRecevieVoucherNoGreaterThanOrEqualTo(String value) {
            addCriterion("pay_recevie_voucher_no >=", value, "payRecevieVoucherNo");
            return (Criteria) this;
        }

        public Criteria andPayRecevieVoucherNoLessThan(String value) {
            addCriterion("pay_recevie_voucher_no <", value, "payRecevieVoucherNo");
            return (Criteria) this;
        }

        public Criteria andPayRecevieVoucherNoLessThanOrEqualTo(String value) {
            addCriterion("pay_recevie_voucher_no <=", value, "payRecevieVoucherNo");
            return (Criteria) this;
        }

        public Criteria andPayRecevieVoucherNoLike(String value) {
            addCriterion("pay_recevie_voucher_no like", value, "payRecevieVoucherNo");
            return (Criteria) this;
        }

        public Criteria andPayRecevieVoucherNoNotLike(String value) {
            addCriterion("pay_recevie_voucher_no not like", value, "payRecevieVoucherNo");
            return (Criteria) this;
        }

        public Criteria andPayRecevieVoucherNoIn(List<String> values) {
            addCriterion("pay_recevie_voucher_no in", values, "payRecevieVoucherNo");
            return (Criteria) this;
        }

        public Criteria andPayRecevieVoucherNoNotIn(List<String> values) {
            addCriterion("pay_recevie_voucher_no not in", values, "payRecevieVoucherNo");
            return (Criteria) this;
        }

        public Criteria andPayRecevieVoucherNoBetween(String value1, String value2) {
            addCriterion("pay_recevie_voucher_no between", value1, value2, "payRecevieVoucherNo");
            return (Criteria) this;
        }

        public Criteria andPayRecevieVoucherNoNotBetween(String value1, String value2) {
            addCriterion("pay_recevie_voucher_no not between", value1, value2, "payRecevieVoucherNo");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(String value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(String value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(String value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(String value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(String value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLike(String value) {
            addCriterion("modify_time like", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotLike(String value) {
            addCriterion("modify_time not like", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<String> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<String> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(String value1, String value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(String value1, String value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyNumIsNull() {
            addCriterion("modify_num is null");
            return (Criteria) this;
        }

        public Criteria andModifyNumIsNotNull() {
            addCriterion("modify_num is not null");
            return (Criteria) this;
        }

        public Criteria andModifyNumEqualTo(Integer value) {
            addCriterion("modify_num =", value, "modifyNum");
            return (Criteria) this;
        }

        public Criteria andModifyNumNotEqualTo(Integer value) {
            addCriterion("modify_num <>", value, "modifyNum");
            return (Criteria) this;
        }

        public Criteria andModifyNumGreaterThan(Integer value) {
            addCriterion("modify_num >", value, "modifyNum");
            return (Criteria) this;
        }

        public Criteria andModifyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("modify_num >=", value, "modifyNum");
            return (Criteria) this;
        }

        public Criteria andModifyNumLessThan(Integer value) {
            addCriterion("modify_num <", value, "modifyNum");
            return (Criteria) this;
        }

        public Criteria andModifyNumLessThanOrEqualTo(Integer value) {
            addCriterion("modify_num <=", value, "modifyNum");
            return (Criteria) this;
        }

        public Criteria andModifyNumIn(List<Integer> values) {
            addCriterion("modify_num in", values, "modifyNum");
            return (Criteria) this;
        }

        public Criteria andModifyNumNotIn(List<Integer> values) {
            addCriterion("modify_num not in", values, "modifyNum");
            return (Criteria) this;
        }

        public Criteria andModifyNumBetween(Integer value1, Integer value2) {
            addCriterion("modify_num between", value1, value2, "modifyNum");
            return (Criteria) this;
        }

        public Criteria andModifyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("modify_num not between", value1, value2, "modifyNum");
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