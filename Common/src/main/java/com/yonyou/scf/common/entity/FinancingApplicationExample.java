package com.yonyou.scf.common.entity;

import java.util.ArrayList;
import java.util.List;

public class FinancingApplicationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinancingApplicationExample() {
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

        public Criteria andFinanceProductionTypeIsNull() {
            addCriterion("finance_production_type is null");
            return (Criteria) this;
        }

        public Criteria andFinanceProductionTypeIsNotNull() {
            addCriterion("finance_production_type is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceProductionTypeEqualTo(Integer value) {
            addCriterion("finance_production_type =", value, "financeProductionType");
            return (Criteria) this;
        }

        public Criteria andFinanceProductionTypeNotEqualTo(Integer value) {
            addCriterion("finance_production_type <>", value, "financeProductionType");
            return (Criteria) this;
        }

        public Criteria andFinanceProductionTypeGreaterThan(Integer value) {
            addCriterion("finance_production_type >", value, "financeProductionType");
            return (Criteria) this;
        }

        public Criteria andFinanceProductionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("finance_production_type >=", value, "financeProductionType");
            return (Criteria) this;
        }

        public Criteria andFinanceProductionTypeLessThan(Integer value) {
            addCriterion("finance_production_type <", value, "financeProductionType");
            return (Criteria) this;
        }

        public Criteria andFinanceProductionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("finance_production_type <=", value, "financeProductionType");
            return (Criteria) this;
        }

        public Criteria andFinanceProductionTypeIn(List<Integer> values) {
            addCriterion("finance_production_type in", values, "financeProductionType");
            return (Criteria) this;
        }

        public Criteria andFinanceProductionTypeNotIn(List<Integer> values) {
            addCriterion("finance_production_type not in", values, "financeProductionType");
            return (Criteria) this;
        }

        public Criteria andFinanceProductionTypeBetween(Integer value1, Integer value2) {
            addCriterion("finance_production_type between", value1, value2, "financeProductionType");
            return (Criteria) this;
        }

        public Criteria andFinanceProductionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("finance_production_type not between", value1, value2, "financeProductionType");
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

        public Criteria andFinancingIdIsNull() {
            addCriterion("financing_id is null");
            return (Criteria) this;
        }

        public Criteria andFinancingIdIsNotNull() {
            addCriterion("financing_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingIdEqualTo(String value) {
            addCriterion("financing_id =", value, "financingId");
            return (Criteria) this;
        }

        public Criteria andFinancingIdNotEqualTo(String value) {
            addCriterion("financing_id <>", value, "financingId");
            return (Criteria) this;
        }

        public Criteria andFinancingIdGreaterThan(String value) {
            addCriterion("financing_id >", value, "financingId");
            return (Criteria) this;
        }

        public Criteria andFinancingIdGreaterThanOrEqualTo(String value) {
            addCriterion("financing_id >=", value, "financingId");
            return (Criteria) this;
        }

        public Criteria andFinancingIdLessThan(String value) {
            addCriterion("financing_id <", value, "financingId");
            return (Criteria) this;
        }

        public Criteria andFinancingIdLessThanOrEqualTo(String value) {
            addCriterion("financing_id <=", value, "financingId");
            return (Criteria) this;
        }

        public Criteria andFinancingIdLike(String value) {
            addCriterion("financing_id like", value, "financingId");
            return (Criteria) this;
        }

        public Criteria andFinancingIdNotLike(String value) {
            addCriterion("financing_id not like", value, "financingId");
            return (Criteria) this;
        }

        public Criteria andFinancingIdIn(List<String> values) {
            addCriterion("financing_id in", values, "financingId");
            return (Criteria) this;
        }

        public Criteria andFinancingIdNotIn(List<String> values) {
            addCriterion("financing_id not in", values, "financingId");
            return (Criteria) this;
        }

        public Criteria andFinancingIdBetween(String value1, String value2) {
            addCriterion("financing_id between", value1, value2, "financingId");
            return (Criteria) this;
        }

        public Criteria andFinancingIdNotBetween(String value1, String value2) {
            addCriterion("financing_id not between", value1, value2, "financingId");
            return (Criteria) this;
        }

        public Criteria andBillNoIsNull() {
            addCriterion("bill_no is null");
            return (Criteria) this;
        }

        public Criteria andBillNoIsNotNull() {
            addCriterion("bill_no is not null");
            return (Criteria) this;
        }

        public Criteria andBillNoEqualTo(String value) {
            addCriterion("bill_no =", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotEqualTo(String value) {
            addCriterion("bill_no <>", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoGreaterThan(String value) {
            addCriterion("bill_no >", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoGreaterThanOrEqualTo(String value) {
            addCriterion("bill_no >=", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoLessThan(String value) {
            addCriterion("bill_no <", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoLessThanOrEqualTo(String value) {
            addCriterion("bill_no <=", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoLike(String value) {
            addCriterion("bill_no like", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotLike(String value) {
            addCriterion("bill_no not like", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoIn(List<String> values) {
            addCriterion("bill_no in", values, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotIn(List<String> values) {
            addCriterion("bill_no not in", values, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoBetween(String value1, String value2) {
            addCriterion("bill_no between", value1, value2, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotBetween(String value1, String value2) {
            addCriterion("bill_no not between", value1, value2, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillDateIsNull() {
            addCriterion("bill_date is null");
            return (Criteria) this;
        }

        public Criteria andBillDateIsNotNull() {
            addCriterion("bill_date is not null");
            return (Criteria) this;
        }

        public Criteria andBillDateEqualTo(String value) {
            addCriterion("bill_date =", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateNotEqualTo(String value) {
            addCriterion("bill_date <>", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateGreaterThan(String value) {
            addCriterion("bill_date >", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateGreaterThanOrEqualTo(String value) {
            addCriterion("bill_date >=", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateLessThan(String value) {
            addCriterion("bill_date <", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateLessThanOrEqualTo(String value) {
            addCriterion("bill_date <=", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateLike(String value) {
            addCriterion("bill_date like", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateNotLike(String value) {
            addCriterion("bill_date not like", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateIn(List<String> values) {
            addCriterion("bill_date in", values, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateNotIn(List<String> values) {
            addCriterion("bill_date not in", values, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateBetween(String value1, String value2) {
            addCriterion("bill_date between", value1, value2, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateNotBetween(String value1, String value2) {
            addCriterion("bill_date not between", value1, value2, "billDate");
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

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("product_id like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("product_id not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("product_id not between", value1, value2, "productId");
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

        public Criteria andBillDescriptionIsNull() {
            addCriterion("bill_description is null");
            return (Criteria) this;
        }

        public Criteria andBillDescriptionIsNotNull() {
            addCriterion("bill_description is not null");
            return (Criteria) this;
        }

        public Criteria andBillDescriptionEqualTo(String value) {
            addCriterion("bill_description =", value, "billDescription");
            return (Criteria) this;
        }

        public Criteria andBillDescriptionNotEqualTo(String value) {
            addCriterion("bill_description <>", value, "billDescription");
            return (Criteria) this;
        }

        public Criteria andBillDescriptionGreaterThan(String value) {
            addCriterion("bill_description >", value, "billDescription");
            return (Criteria) this;
        }

        public Criteria andBillDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("bill_description >=", value, "billDescription");
            return (Criteria) this;
        }

        public Criteria andBillDescriptionLessThan(String value) {
            addCriterion("bill_description <", value, "billDescription");
            return (Criteria) this;
        }

        public Criteria andBillDescriptionLessThanOrEqualTo(String value) {
            addCriterion("bill_description <=", value, "billDescription");
            return (Criteria) this;
        }

        public Criteria andBillDescriptionLike(String value) {
            addCriterion("bill_description like", value, "billDescription");
            return (Criteria) this;
        }

        public Criteria andBillDescriptionNotLike(String value) {
            addCriterion("bill_description not like", value, "billDescription");
            return (Criteria) this;
        }

        public Criteria andBillDescriptionIn(List<String> values) {
            addCriterion("bill_description in", values, "billDescription");
            return (Criteria) this;
        }

        public Criteria andBillDescriptionNotIn(List<String> values) {
            addCriterion("bill_description not in", values, "billDescription");
            return (Criteria) this;
        }

        public Criteria andBillDescriptionBetween(String value1, String value2) {
            addCriterion("bill_description between", value1, value2, "billDescription");
            return (Criteria) this;
        }

        public Criteria andBillDescriptionNotBetween(String value1, String value2) {
            addCriterion("bill_description not between", value1, value2, "billDescription");
            return (Criteria) this;
        }

        public Criteria andBillAmountIsNull() {
            addCriterion("bill_amount is null");
            return (Criteria) this;
        }

        public Criteria andBillAmountIsNotNull() {
            addCriterion("bill_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBillAmountEqualTo(Long value) {
            addCriterion("bill_amount =", value, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountNotEqualTo(Long value) {
            addCriterion("bill_amount <>", value, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountGreaterThan(Long value) {
            addCriterion("bill_amount >", value, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("bill_amount >=", value, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountLessThan(Long value) {
            addCriterion("bill_amount <", value, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountLessThanOrEqualTo(Long value) {
            addCriterion("bill_amount <=", value, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountIn(List<Long> values) {
            addCriterion("bill_amount in", values, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountNotIn(List<Long> values) {
            addCriterion("bill_amount not in", values, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountBetween(Long value1, Long value2) {
            addCriterion("bill_amount between", value1, value2, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountNotBetween(Long value1, Long value2) {
            addCriterion("bill_amount not between", value1, value2, "billAmount");
            return (Criteria) this;
        }

        public Criteria andDataListCntIsNull() {
            addCriterion("data_list_cnt is null");
            return (Criteria) this;
        }

        public Criteria andDataListCntIsNotNull() {
            addCriterion("data_list_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andDataListCntEqualTo(Integer value) {
            addCriterion("data_list_cnt =", value, "dataListCnt");
            return (Criteria) this;
        }

        public Criteria andDataListCntNotEqualTo(Integer value) {
            addCriterion("data_list_cnt <>", value, "dataListCnt");
            return (Criteria) this;
        }

        public Criteria andDataListCntGreaterThan(Integer value) {
            addCriterion("data_list_cnt >", value, "dataListCnt");
            return (Criteria) this;
        }

        public Criteria andDataListCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_list_cnt >=", value, "dataListCnt");
            return (Criteria) this;
        }

        public Criteria andDataListCntLessThan(Integer value) {
            addCriterion("data_list_cnt <", value, "dataListCnt");
            return (Criteria) this;
        }

        public Criteria andDataListCntLessThanOrEqualTo(Integer value) {
            addCriterion("data_list_cnt <=", value, "dataListCnt");
            return (Criteria) this;
        }

        public Criteria andDataListCntIn(List<Integer> values) {
            addCriterion("data_list_cnt in", values, "dataListCnt");
            return (Criteria) this;
        }

        public Criteria andDataListCntNotIn(List<Integer> values) {
            addCriterion("data_list_cnt not in", values, "dataListCnt");
            return (Criteria) this;
        }

        public Criteria andDataListCntBetween(Integer value1, Integer value2) {
            addCriterion("data_list_cnt between", value1, value2, "dataListCnt");
            return (Criteria) this;
        }

        public Criteria andDataListCntNotBetween(Integer value1, Integer value2) {
            addCriterion("data_list_cnt not between", value1, value2, "dataListCnt");
            return (Criteria) this;
        }

        public Criteria andFinancingAmountIsNull() {
            addCriterion("financing_amount is null");
            return (Criteria) this;
        }

        public Criteria andFinancingAmountIsNotNull() {
            addCriterion("financing_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingAmountEqualTo(Long value) {
            addCriterion("financing_amount =", value, "financingAmount");
            return (Criteria) this;
        }

        public Criteria andFinancingAmountNotEqualTo(Long value) {
            addCriterion("financing_amount <>", value, "financingAmount");
            return (Criteria) this;
        }

        public Criteria andFinancingAmountGreaterThan(Long value) {
            addCriterion("financing_amount >", value, "financingAmount");
            return (Criteria) this;
        }

        public Criteria andFinancingAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("financing_amount >=", value, "financingAmount");
            return (Criteria) this;
        }

        public Criteria andFinancingAmountLessThan(Long value) {
            addCriterion("financing_amount <", value, "financingAmount");
            return (Criteria) this;
        }

        public Criteria andFinancingAmountLessThanOrEqualTo(Long value) {
            addCriterion("financing_amount <=", value, "financingAmount");
            return (Criteria) this;
        }

        public Criteria andFinancingAmountIn(List<Long> values) {
            addCriterion("financing_amount in", values, "financingAmount");
            return (Criteria) this;
        }

        public Criteria andFinancingAmountNotIn(List<Long> values) {
            addCriterion("financing_amount not in", values, "financingAmount");
            return (Criteria) this;
        }

        public Criteria andFinancingAmountBetween(Long value1, Long value2) {
            addCriterion("financing_amount between", value1, value2, "financingAmount");
            return (Criteria) this;
        }

        public Criteria andFinancingAmountNotBetween(Long value1, Long value2) {
            addCriterion("financing_amount not between", value1, value2, "financingAmount");
            return (Criteria) this;
        }

        public Criteria andSnNoIsNull() {
            addCriterion("sn_no is null");
            return (Criteria) this;
        }

        public Criteria andSnNoIsNotNull() {
            addCriterion("sn_no is not null");
            return (Criteria) this;
        }

        public Criteria andSnNoEqualTo(String value) {
            addCriterion("sn_no =", value, "snNo");
            return (Criteria) this;
        }

        public Criteria andSnNoNotEqualTo(String value) {
            addCriterion("sn_no <>", value, "snNo");
            return (Criteria) this;
        }

        public Criteria andSnNoGreaterThan(String value) {
            addCriterion("sn_no >", value, "snNo");
            return (Criteria) this;
        }

        public Criteria andSnNoGreaterThanOrEqualTo(String value) {
            addCriterion("sn_no >=", value, "snNo");
            return (Criteria) this;
        }

        public Criteria andSnNoLessThan(String value) {
            addCriterion("sn_no <", value, "snNo");
            return (Criteria) this;
        }

        public Criteria andSnNoLessThanOrEqualTo(String value) {
            addCriterion("sn_no <=", value, "snNo");
            return (Criteria) this;
        }

        public Criteria andSnNoLike(String value) {
            addCriterion("sn_no like", value, "snNo");
            return (Criteria) this;
        }

        public Criteria andSnNoNotLike(String value) {
            addCriterion("sn_no not like", value, "snNo");
            return (Criteria) this;
        }

        public Criteria andSnNoIn(List<String> values) {
            addCriterion("sn_no in", values, "snNo");
            return (Criteria) this;
        }

        public Criteria andSnNoNotIn(List<String> values) {
            addCriterion("sn_no not in", values, "snNo");
            return (Criteria) this;
        }

        public Criteria andSnNoBetween(String value1, String value2) {
            addCriterion("sn_no between", value1, value2, "snNo");
            return (Criteria) this;
        }

        public Criteria andSnNoNotBetween(String value1, String value2) {
            addCriterion("sn_no not between", value1, value2, "snNo");
            return (Criteria) this;
        }

        public Criteria andSnLoadTimeIsNull() {
            addCriterion("sn_load_time is null");
            return (Criteria) this;
        }

        public Criteria andSnLoadTimeIsNotNull() {
            addCriterion("sn_load_time is not null");
            return (Criteria) this;
        }

        public Criteria andSnLoadTimeEqualTo(String value) {
            addCriterion("sn_load_time =", value, "snLoadTime");
            return (Criteria) this;
        }

        public Criteria andSnLoadTimeNotEqualTo(String value) {
            addCriterion("sn_load_time <>", value, "snLoadTime");
            return (Criteria) this;
        }

        public Criteria andSnLoadTimeGreaterThan(String value) {
            addCriterion("sn_load_time >", value, "snLoadTime");
            return (Criteria) this;
        }

        public Criteria andSnLoadTimeGreaterThanOrEqualTo(String value) {
            addCriterion("sn_load_time >=", value, "snLoadTime");
            return (Criteria) this;
        }

        public Criteria andSnLoadTimeLessThan(String value) {
            addCriterion("sn_load_time <", value, "snLoadTime");
            return (Criteria) this;
        }

        public Criteria andSnLoadTimeLessThanOrEqualTo(String value) {
            addCriterion("sn_load_time <=", value, "snLoadTime");
            return (Criteria) this;
        }

        public Criteria andSnLoadTimeLike(String value) {
            addCriterion("sn_load_time like", value, "snLoadTime");
            return (Criteria) this;
        }

        public Criteria andSnLoadTimeNotLike(String value) {
            addCriterion("sn_load_time not like", value, "snLoadTime");
            return (Criteria) this;
        }

        public Criteria andSnLoadTimeIn(List<String> values) {
            addCriterion("sn_load_time in", values, "snLoadTime");
            return (Criteria) this;
        }

        public Criteria andSnLoadTimeNotIn(List<String> values) {
            addCriterion("sn_load_time not in", values, "snLoadTime");
            return (Criteria) this;
        }

        public Criteria andSnLoadTimeBetween(String value1, String value2) {
            addCriterion("sn_load_time between", value1, value2, "snLoadTime");
            return (Criteria) this;
        }

        public Criteria andSnLoadTimeNotBetween(String value1, String value2) {
            addCriterion("sn_load_time not between", value1, value2, "snLoadTime");
            return (Criteria) this;
        }

        public Criteria andSnValidTimeIsNull() {
            addCriterion("sn_valid_time is null");
            return (Criteria) this;
        }

        public Criteria andSnValidTimeIsNotNull() {
            addCriterion("sn_valid_time is not null");
            return (Criteria) this;
        }

        public Criteria andSnValidTimeEqualTo(String value) {
            addCriterion("sn_valid_time =", value, "snValidTime");
            return (Criteria) this;
        }

        public Criteria andSnValidTimeNotEqualTo(String value) {
            addCriterion("sn_valid_time <>", value, "snValidTime");
            return (Criteria) this;
        }

        public Criteria andSnValidTimeGreaterThan(String value) {
            addCriterion("sn_valid_time >", value, "snValidTime");
            return (Criteria) this;
        }

        public Criteria andSnValidTimeGreaterThanOrEqualTo(String value) {
            addCriterion("sn_valid_time >=", value, "snValidTime");
            return (Criteria) this;
        }

        public Criteria andSnValidTimeLessThan(String value) {
            addCriterion("sn_valid_time <", value, "snValidTime");
            return (Criteria) this;
        }

        public Criteria andSnValidTimeLessThanOrEqualTo(String value) {
            addCriterion("sn_valid_time <=", value, "snValidTime");
            return (Criteria) this;
        }

        public Criteria andSnValidTimeLike(String value) {
            addCriterion("sn_valid_time like", value, "snValidTime");
            return (Criteria) this;
        }

        public Criteria andSnValidTimeNotLike(String value) {
            addCriterion("sn_valid_time not like", value, "snValidTime");
            return (Criteria) this;
        }

        public Criteria andSnValidTimeIn(List<String> values) {
            addCriterion("sn_valid_time in", values, "snValidTime");
            return (Criteria) this;
        }

        public Criteria andSnValidTimeNotIn(List<String> values) {
            addCriterion("sn_valid_time not in", values, "snValidTime");
            return (Criteria) this;
        }

        public Criteria andSnValidTimeBetween(String value1, String value2) {
            addCriterion("sn_valid_time between", value1, value2, "snValidTime");
            return (Criteria) this;
        }

        public Criteria andSnValidTimeNotBetween(String value1, String value2) {
            addCriterion("sn_valid_time not between", value1, value2, "snValidTime");
            return (Criteria) this;
        }

        public Criteria andBillStatusIsNull() {
            addCriterion("bill_status is null");
            return (Criteria) this;
        }

        public Criteria andBillStatusIsNotNull() {
            addCriterion("bill_status is not null");
            return (Criteria) this;
        }

        public Criteria andBillStatusEqualTo(Integer value) {
            addCriterion("bill_status =", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotEqualTo(Integer value) {
            addCriterion("bill_status <>", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusGreaterThan(Integer value) {
            addCriterion("bill_status >", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_status >=", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLessThan(Integer value) {
            addCriterion("bill_status <", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLessThanOrEqualTo(Integer value) {
            addCriterion("bill_status <=", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusIn(List<Integer> values) {
            addCriterion("bill_status in", values, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotIn(List<Integer> values) {
            addCriterion("bill_status not in", values, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusBetween(Integer value1, Integer value2) {
            addCriterion("bill_status between", value1, value2, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_status not between", value1, value2, "billStatus");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceIsNull() {
            addCriterion("terminal_source is null");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceIsNotNull() {
            addCriterion("terminal_source is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceEqualTo(Integer value) {
            addCriterion("terminal_source =", value, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceNotEqualTo(Integer value) {
            addCriterion("terminal_source <>", value, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceGreaterThan(Integer value) {
            addCriterion("terminal_source >", value, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("terminal_source >=", value, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceLessThan(Integer value) {
            addCriterion("terminal_source <", value, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceLessThanOrEqualTo(Integer value) {
            addCriterion("terminal_source <=", value, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceIn(List<Integer> values) {
            addCriterion("terminal_source in", values, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceNotIn(List<Integer> values) {
            addCriterion("terminal_source not in", values, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceBetween(Integer value1, Integer value2) {
            addCriterion("terminal_source between", value1, value2, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("terminal_source not between", value1, value2, "terminalSource");
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

        public Criteria andPtcwdhIsNull() {
            addCriterion("ptcwdh is null");
            return (Criteria) this;
        }

        public Criteria andPtcwdhIsNotNull() {
            addCriterion("ptcwdh is not null");
            return (Criteria) this;
        }

        public Criteria andPtcwdhEqualTo(String value) {
            addCriterion("ptcwdh =", value, "ptcwdh");
            return (Criteria) this;
        }

        public Criteria andPtcwdhNotEqualTo(String value) {
            addCriterion("ptcwdh <>", value, "ptcwdh");
            return (Criteria) this;
        }

        public Criteria andPtcwdhGreaterThan(String value) {
            addCriterion("ptcwdh >", value, "ptcwdh");
            return (Criteria) this;
        }

        public Criteria andPtcwdhGreaterThanOrEqualTo(String value) {
            addCriterion("ptcwdh >=", value, "ptcwdh");
            return (Criteria) this;
        }

        public Criteria andPtcwdhLessThan(String value) {
            addCriterion("ptcwdh <", value, "ptcwdh");
            return (Criteria) this;
        }

        public Criteria andPtcwdhLessThanOrEqualTo(String value) {
            addCriterion("ptcwdh <=", value, "ptcwdh");
            return (Criteria) this;
        }

        public Criteria andPtcwdhLike(String value) {
            addCriterion("ptcwdh like", value, "ptcwdh");
            return (Criteria) this;
        }

        public Criteria andPtcwdhNotLike(String value) {
            addCriterion("ptcwdh not like", value, "ptcwdh");
            return (Criteria) this;
        }

        public Criteria andPtcwdhIn(List<String> values) {
            addCriterion("ptcwdh in", values, "ptcwdh");
            return (Criteria) this;
        }

        public Criteria andPtcwdhNotIn(List<String> values) {
            addCriterion("ptcwdh not in", values, "ptcwdh");
            return (Criteria) this;
        }

        public Criteria andPtcwdhBetween(String value1, String value2) {
            addCriterion("ptcwdh between", value1, value2, "ptcwdh");
            return (Criteria) this;
        }

        public Criteria andPtcwdhNotBetween(String value1, String value2) {
            addCriterion("ptcwdh not between", value1, value2, "ptcwdh");
            return (Criteria) this;
        }

        public Criteria andCuowxxIsNull() {
            addCriterion("cuowxx is null");
            return (Criteria) this;
        }

        public Criteria andCuowxxIsNotNull() {
            addCriterion("cuowxx is not null");
            return (Criteria) this;
        }

        public Criteria andCuowxxEqualTo(String value) {
            addCriterion("cuowxx =", value, "cuowxx");
            return (Criteria) this;
        }

        public Criteria andCuowxxNotEqualTo(String value) {
            addCriterion("cuowxx <>", value, "cuowxx");
            return (Criteria) this;
        }

        public Criteria andCuowxxGreaterThan(String value) {
            addCriterion("cuowxx >", value, "cuowxx");
            return (Criteria) this;
        }

        public Criteria andCuowxxGreaterThanOrEqualTo(String value) {
            addCriterion("cuowxx >=", value, "cuowxx");
            return (Criteria) this;
        }

        public Criteria andCuowxxLessThan(String value) {
            addCriterion("cuowxx <", value, "cuowxx");
            return (Criteria) this;
        }

        public Criteria andCuowxxLessThanOrEqualTo(String value) {
            addCriterion("cuowxx <=", value, "cuowxx");
            return (Criteria) this;
        }

        public Criteria andCuowxxLike(String value) {
            addCriterion("cuowxx like", value, "cuowxx");
            return (Criteria) this;
        }

        public Criteria andCuowxxNotLike(String value) {
            addCriterion("cuowxx not like", value, "cuowxx");
            return (Criteria) this;
        }

        public Criteria andCuowxxIn(List<String> values) {
            addCriterion("cuowxx in", values, "cuowxx");
            return (Criteria) this;
        }

        public Criteria andCuowxxNotIn(List<String> values) {
            addCriterion("cuowxx not in", values, "cuowxx");
            return (Criteria) this;
        }

        public Criteria andCuowxxBetween(String value1, String value2) {
            addCriterion("cuowxx between", value1, value2, "cuowxx");
            return (Criteria) this;
        }

        public Criteria andCuowxxNotBetween(String value1, String value2) {
            addCriterion("cuowxx not between", value1, value2, "cuowxx");
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