package com.yonyou.scf.common.entity;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andModeIsNull() {
            addCriterion("mode is null");
            return (Criteria) this;
        }

        public Criteria andModeIsNotNull() {
            addCriterion("mode is not null");
            return (Criteria) this;
        }

        public Criteria andModeEqualTo(String value) {
            addCriterion("mode =", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotEqualTo(String value) {
            addCriterion("mode <>", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeGreaterThan(String value) {
            addCriterion("mode >", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeGreaterThanOrEqualTo(String value) {
            addCriterion("mode >=", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeLessThan(String value) {
            addCriterion("mode <", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeLessThanOrEqualTo(String value) {
            addCriterion("mode <=", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeLike(String value) {
            addCriterion("mode like", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotLike(String value) {
            addCriterion("mode not like", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeIn(List<String> values) {
            addCriterion("mode in", values, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotIn(List<String> values) {
            addCriterion("mode not in", values, "mode");
            return (Criteria) this;
        }

        public Criteria andModeBetween(String value1, String value2) {
            addCriterion("mode between", value1, value2, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotBetween(String value1, String value2) {
            addCriterion("mode not between", value1, value2, "mode");
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

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Long value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Long value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Long value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Long value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Long value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Long> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Long> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Long value1, Long value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Long value1, Long value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
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

        public Criteria andProductRateEqualTo(Integer value) {
            addCriterion("product_rate =", value, "productRate");
            return (Criteria) this;
        }

        public Criteria andProductRateNotEqualTo(Integer value) {
            addCriterion("product_rate <>", value, "productRate");
            return (Criteria) this;
        }

        public Criteria andProductRateGreaterThan(Integer value) {
            addCriterion("product_rate >", value, "productRate");
            return (Criteria) this;
        }

        public Criteria andProductRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_rate >=", value, "productRate");
            return (Criteria) this;
        }

        public Criteria andProductRateLessThan(Integer value) {
            addCriterion("product_rate <", value, "productRate");
            return (Criteria) this;
        }

        public Criteria andProductRateLessThanOrEqualTo(Integer value) {
            addCriterion("product_rate <=", value, "productRate");
            return (Criteria) this;
        }

        public Criteria andProductRateIn(List<Integer> values) {
            addCriterion("product_rate in", values, "productRate");
            return (Criteria) this;
        }

        public Criteria andProductRateNotIn(List<Integer> values) {
            addCriterion("product_rate not in", values, "productRate");
            return (Criteria) this;
        }

        public Criteria andProductRateBetween(Integer value1, Integer value2) {
            addCriterion("product_rate between", value1, value2, "productRate");
            return (Criteria) this;
        }

        public Criteria andProductRateNotBetween(Integer value1, Integer value2) {
            addCriterion("product_rate not between", value1, value2, "productRate");
            return (Criteria) this;
        }

        public Criteria andFinanceRateIsNull() {
            addCriterion("finance_rate is null");
            return (Criteria) this;
        }

        public Criteria andFinanceRateIsNotNull() {
            addCriterion("finance_rate is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceRateEqualTo(Integer value) {
            addCriterion("finance_rate =", value, "financeRate");
            return (Criteria) this;
        }

        public Criteria andFinanceRateNotEqualTo(Integer value) {
            addCriterion("finance_rate <>", value, "financeRate");
            return (Criteria) this;
        }

        public Criteria andFinanceRateGreaterThan(Integer value) {
            addCriterion("finance_rate >", value, "financeRate");
            return (Criteria) this;
        }

        public Criteria andFinanceRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("finance_rate >=", value, "financeRate");
            return (Criteria) this;
        }

        public Criteria andFinanceRateLessThan(Integer value) {
            addCriterion("finance_rate <", value, "financeRate");
            return (Criteria) this;
        }

        public Criteria andFinanceRateLessThanOrEqualTo(Integer value) {
            addCriterion("finance_rate <=", value, "financeRate");
            return (Criteria) this;
        }

        public Criteria andFinanceRateIn(List<Integer> values) {
            addCriterion("finance_rate in", values, "financeRate");
            return (Criteria) this;
        }

        public Criteria andFinanceRateNotIn(List<Integer> values) {
            addCriterion("finance_rate not in", values, "financeRate");
            return (Criteria) this;
        }

        public Criteria andFinanceRateBetween(Integer value1, Integer value2) {
            addCriterion("finance_rate between", value1, value2, "financeRate");
            return (Criteria) this;
        }

        public Criteria andFinanceRateNotBetween(Integer value1, Integer value2) {
            addCriterion("finance_rate not between", value1, value2, "financeRate");
            return (Criteria) this;
        }

        public Criteria andServiceRateIsNull() {
            addCriterion("service_rate is null");
            return (Criteria) this;
        }

        public Criteria andServiceRateIsNotNull() {
            addCriterion("service_rate is not null");
            return (Criteria) this;
        }

        public Criteria andServiceRateEqualTo(Integer value) {
            addCriterion("service_rate =", value, "serviceRate");
            return (Criteria) this;
        }

        public Criteria andServiceRateNotEqualTo(Integer value) {
            addCriterion("service_rate <>", value, "serviceRate");
            return (Criteria) this;
        }

        public Criteria andServiceRateGreaterThan(Integer value) {
            addCriterion("service_rate >", value, "serviceRate");
            return (Criteria) this;
        }

        public Criteria andServiceRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_rate >=", value, "serviceRate");
            return (Criteria) this;
        }

        public Criteria andServiceRateLessThan(Integer value) {
            addCriterion("service_rate <", value, "serviceRate");
            return (Criteria) this;
        }

        public Criteria andServiceRateLessThanOrEqualTo(Integer value) {
            addCriterion("service_rate <=", value, "serviceRate");
            return (Criteria) this;
        }

        public Criteria andServiceRateIn(List<Integer> values) {
            addCriterion("service_rate in", values, "serviceRate");
            return (Criteria) this;
        }

        public Criteria andServiceRateNotIn(List<Integer> values) {
            addCriterion("service_rate not in", values, "serviceRate");
            return (Criteria) this;
        }

        public Criteria andServiceRateBetween(Integer value1, Integer value2) {
            addCriterion("service_rate between", value1, value2, "serviceRate");
            return (Criteria) this;
        }

        public Criteria andServiceRateNotBetween(Integer value1, Integer value2) {
            addCriterion("service_rate not between", value1, value2, "serviceRate");
            return (Criteria) this;
        }

        public Criteria andProductUseAmountIsNull() {
            addCriterion("product_use_amount is null");
            return (Criteria) this;
        }

        public Criteria andProductUseAmountIsNotNull() {
            addCriterion("product_use_amount is not null");
            return (Criteria) this;
        }

        public Criteria andProductUseAmountEqualTo(Long value) {
            addCriterion("product_use_amount =", value, "productUseAmount");
            return (Criteria) this;
        }

        public Criteria andProductUseAmountNotEqualTo(Long value) {
            addCriterion("product_use_amount <>", value, "productUseAmount");
            return (Criteria) this;
        }

        public Criteria andProductUseAmountGreaterThan(Long value) {
            addCriterion("product_use_amount >", value, "productUseAmount");
            return (Criteria) this;
        }

        public Criteria andProductUseAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("product_use_amount >=", value, "productUseAmount");
            return (Criteria) this;
        }

        public Criteria andProductUseAmountLessThan(Long value) {
            addCriterion("product_use_amount <", value, "productUseAmount");
            return (Criteria) this;
        }

        public Criteria andProductUseAmountLessThanOrEqualTo(Long value) {
            addCriterion("product_use_amount <=", value, "productUseAmount");
            return (Criteria) this;
        }

        public Criteria andProductUseAmountIn(List<Long> values) {
            addCriterion("product_use_amount in", values, "productUseAmount");
            return (Criteria) this;
        }

        public Criteria andProductUseAmountNotIn(List<Long> values) {
            addCriterion("product_use_amount not in", values, "productUseAmount");
            return (Criteria) this;
        }

        public Criteria andProductUseAmountBetween(Long value1, Long value2) {
            addCriterion("product_use_amount between", value1, value2, "productUseAmount");
            return (Criteria) this;
        }

        public Criteria andProductUseAmountNotBetween(Long value1, Long value2) {
            addCriterion("product_use_amount not between", value1, value2, "productUseAmount");
            return (Criteria) this;
        }

        public Criteria andProductCreditAmountIsNull() {
            addCriterion("product_credit_amount is null");
            return (Criteria) this;
        }

        public Criteria andProductCreditAmountIsNotNull() {
            addCriterion("product_credit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andProductCreditAmountEqualTo(Long value) {
            addCriterion("product_credit_amount =", value, "productCreditAmount");
            return (Criteria) this;
        }

        public Criteria andProductCreditAmountNotEqualTo(Long value) {
            addCriterion("product_credit_amount <>", value, "productCreditAmount");
            return (Criteria) this;
        }

        public Criteria andProductCreditAmountGreaterThan(Long value) {
            addCriterion("product_credit_amount >", value, "productCreditAmount");
            return (Criteria) this;
        }

        public Criteria andProductCreditAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("product_credit_amount >=", value, "productCreditAmount");
            return (Criteria) this;
        }

        public Criteria andProductCreditAmountLessThan(Long value) {
            addCriterion("product_credit_amount <", value, "productCreditAmount");
            return (Criteria) this;
        }

        public Criteria andProductCreditAmountLessThanOrEqualTo(Long value) {
            addCriterion("product_credit_amount <=", value, "productCreditAmount");
            return (Criteria) this;
        }

        public Criteria andProductCreditAmountIn(List<Long> values) {
            addCriterion("product_credit_amount in", values, "productCreditAmount");
            return (Criteria) this;
        }

        public Criteria andProductCreditAmountNotIn(List<Long> values) {
            addCriterion("product_credit_amount not in", values, "productCreditAmount");
            return (Criteria) this;
        }

        public Criteria andProductCreditAmountBetween(Long value1, Long value2) {
            addCriterion("product_credit_amount between", value1, value2, "productCreditAmount");
            return (Criteria) this;
        }

        public Criteria andProductCreditAmountNotBetween(Long value1, Long value2) {
            addCriterion("product_credit_amount not between", value1, value2, "productCreditAmount");
            return (Criteria) this;
        }

        public Criteria andMinFinanceMoneyIsNull() {
            addCriterion("min_finance_money is null");
            return (Criteria) this;
        }

        public Criteria andMinFinanceMoneyIsNotNull() {
            addCriterion("min_finance_money is not null");
            return (Criteria) this;
        }

        public Criteria andMinFinanceMoneyEqualTo(Long value) {
            addCriterion("min_finance_money =", value, "minFinanceMoney");
            return (Criteria) this;
        }

        public Criteria andMinFinanceMoneyNotEqualTo(Long value) {
            addCriterion("min_finance_money <>", value, "minFinanceMoney");
            return (Criteria) this;
        }

        public Criteria andMinFinanceMoneyGreaterThan(Long value) {
            addCriterion("min_finance_money >", value, "minFinanceMoney");
            return (Criteria) this;
        }

        public Criteria andMinFinanceMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("min_finance_money >=", value, "minFinanceMoney");
            return (Criteria) this;
        }

        public Criteria andMinFinanceMoneyLessThan(Long value) {
            addCriterion("min_finance_money <", value, "minFinanceMoney");
            return (Criteria) this;
        }

        public Criteria andMinFinanceMoneyLessThanOrEqualTo(Long value) {
            addCriterion("min_finance_money <=", value, "minFinanceMoney");
            return (Criteria) this;
        }

        public Criteria andMinFinanceMoneyIn(List<Long> values) {
            addCriterion("min_finance_money in", values, "minFinanceMoney");
            return (Criteria) this;
        }

        public Criteria andMinFinanceMoneyNotIn(List<Long> values) {
            addCriterion("min_finance_money not in", values, "minFinanceMoney");
            return (Criteria) this;
        }

        public Criteria andMinFinanceMoneyBetween(Long value1, Long value2) {
            addCriterion("min_finance_money between", value1, value2, "minFinanceMoney");
            return (Criteria) this;
        }

        public Criteria andMinFinanceMoneyNotBetween(Long value1, Long value2) {
            addCriterion("min_finance_money not between", value1, value2, "minFinanceMoney");
            return (Criteria) this;
        }

        public Criteria andMinFinanceDayIsNull() {
            addCriterion("min_finance_day is null");
            return (Criteria) this;
        }

        public Criteria andMinFinanceDayIsNotNull() {
            addCriterion("min_finance_day is not null");
            return (Criteria) this;
        }

        public Criteria andMinFinanceDayEqualTo(Integer value) {
            addCriterion("min_finance_day =", value, "minFinanceDay");
            return (Criteria) this;
        }

        public Criteria andMinFinanceDayNotEqualTo(Integer value) {
            addCriterion("min_finance_day <>", value, "minFinanceDay");
            return (Criteria) this;
        }

        public Criteria andMinFinanceDayGreaterThan(Integer value) {
            addCriterion("min_finance_day >", value, "minFinanceDay");
            return (Criteria) this;
        }

        public Criteria andMinFinanceDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_finance_day >=", value, "minFinanceDay");
            return (Criteria) this;
        }

        public Criteria andMinFinanceDayLessThan(Integer value) {
            addCriterion("min_finance_day <", value, "minFinanceDay");
            return (Criteria) this;
        }

        public Criteria andMinFinanceDayLessThanOrEqualTo(Integer value) {
            addCriterion("min_finance_day <=", value, "minFinanceDay");
            return (Criteria) this;
        }

        public Criteria andMinFinanceDayIn(List<Integer> values) {
            addCriterion("min_finance_day in", values, "minFinanceDay");
            return (Criteria) this;
        }

        public Criteria andMinFinanceDayNotIn(List<Integer> values) {
            addCriterion("min_finance_day not in", values, "minFinanceDay");
            return (Criteria) this;
        }

        public Criteria andMinFinanceDayBetween(Integer value1, Integer value2) {
            addCriterion("min_finance_day between", value1, value2, "minFinanceDay");
            return (Criteria) this;
        }

        public Criteria andMinFinanceDayNotBetween(Integer value1, Integer value2) {
            addCriterion("min_finance_day not between", value1, value2, "minFinanceDay");
            return (Criteria) this;
        }

        public Criteria andMaxFinanceDayIsNull() {
            addCriterion("max_finance_day is null");
            return (Criteria) this;
        }

        public Criteria andMaxFinanceDayIsNotNull() {
            addCriterion("max_finance_day is not null");
            return (Criteria) this;
        }

        public Criteria andMaxFinanceDayEqualTo(Integer value) {
            addCriterion("max_finance_day =", value, "maxFinanceDay");
            return (Criteria) this;
        }

        public Criteria andMaxFinanceDayNotEqualTo(Integer value) {
            addCriterion("max_finance_day <>", value, "maxFinanceDay");
            return (Criteria) this;
        }

        public Criteria andMaxFinanceDayGreaterThan(Integer value) {
            addCriterion("max_finance_day >", value, "maxFinanceDay");
            return (Criteria) this;
        }

        public Criteria andMaxFinanceDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_finance_day >=", value, "maxFinanceDay");
            return (Criteria) this;
        }

        public Criteria andMaxFinanceDayLessThan(Integer value) {
            addCriterion("max_finance_day <", value, "maxFinanceDay");
            return (Criteria) this;
        }

        public Criteria andMaxFinanceDayLessThanOrEqualTo(Integer value) {
            addCriterion("max_finance_day <=", value, "maxFinanceDay");
            return (Criteria) this;
        }

        public Criteria andMaxFinanceDayIn(List<Integer> values) {
            addCriterion("max_finance_day in", values, "maxFinanceDay");
            return (Criteria) this;
        }

        public Criteria andMaxFinanceDayNotIn(List<Integer> values) {
            addCriterion("max_finance_day not in", values, "maxFinanceDay");
            return (Criteria) this;
        }

        public Criteria andMaxFinanceDayBetween(Integer value1, Integer value2) {
            addCriterion("max_finance_day between", value1, value2, "maxFinanceDay");
            return (Criteria) this;
        }

        public Criteria andMaxFinanceDayNotBetween(Integer value1, Integer value2) {
            addCriterion("max_finance_day not between", value1, value2, "maxFinanceDay");
            return (Criteria) this;
        }

        public Criteria andTransferPeriodIsNull() {
            addCriterion("transfer_period is null");
            return (Criteria) this;
        }

        public Criteria andTransferPeriodIsNotNull() {
            addCriterion("transfer_period is not null");
            return (Criteria) this;
        }

        public Criteria andTransferPeriodEqualTo(Integer value) {
            addCriterion("transfer_period =", value, "transferPeriod");
            return (Criteria) this;
        }

        public Criteria andTransferPeriodNotEqualTo(Integer value) {
            addCriterion("transfer_period <>", value, "transferPeriod");
            return (Criteria) this;
        }

        public Criteria andTransferPeriodGreaterThan(Integer value) {
            addCriterion("transfer_period >", value, "transferPeriod");
            return (Criteria) this;
        }

        public Criteria andTransferPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("transfer_period >=", value, "transferPeriod");
            return (Criteria) this;
        }

        public Criteria andTransferPeriodLessThan(Integer value) {
            addCriterion("transfer_period <", value, "transferPeriod");
            return (Criteria) this;
        }

        public Criteria andTransferPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("transfer_period <=", value, "transferPeriod");
            return (Criteria) this;
        }

        public Criteria andTransferPeriodIn(List<Integer> values) {
            addCriterion("transfer_period in", values, "transferPeriod");
            return (Criteria) this;
        }

        public Criteria andTransferPeriodNotIn(List<Integer> values) {
            addCriterion("transfer_period not in", values, "transferPeriod");
            return (Criteria) this;
        }

        public Criteria andTransferPeriodBetween(Integer value1, Integer value2) {
            addCriterion("transfer_period between", value1, value2, "transferPeriod");
            return (Criteria) this;
        }

        public Criteria andTransferPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("transfer_period not between", value1, value2, "transferPeriod");
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

        public Criteria andIsdelayIsNull() {
            addCriterion("isdelay is null");
            return (Criteria) this;
        }

        public Criteria andIsdelayIsNotNull() {
            addCriterion("isdelay is not null");
            return (Criteria) this;
        }

        public Criteria andIsdelayEqualTo(String value) {
            addCriterion("isdelay =", value, "isdelay");
            return (Criteria) this;
        }

        public Criteria andIsdelayNotEqualTo(String value) {
            addCriterion("isdelay <>", value, "isdelay");
            return (Criteria) this;
        }

        public Criteria andIsdelayGreaterThan(String value) {
            addCriterion("isdelay >", value, "isdelay");
            return (Criteria) this;
        }

        public Criteria andIsdelayGreaterThanOrEqualTo(String value) {
            addCriterion("isdelay >=", value, "isdelay");
            return (Criteria) this;
        }

        public Criteria andIsdelayLessThan(String value) {
            addCriterion("isdelay <", value, "isdelay");
            return (Criteria) this;
        }

        public Criteria andIsdelayLessThanOrEqualTo(String value) {
            addCriterion("isdelay <=", value, "isdelay");
            return (Criteria) this;
        }

        public Criteria andIsdelayLike(String value) {
            addCriterion("isdelay like", value, "isdelay");
            return (Criteria) this;
        }

        public Criteria andIsdelayNotLike(String value) {
            addCriterion("isdelay not like", value, "isdelay");
            return (Criteria) this;
        }

        public Criteria andIsdelayIn(List<String> values) {
            addCriterion("isdelay in", values, "isdelay");
            return (Criteria) this;
        }

        public Criteria andIsdelayNotIn(List<String> values) {
            addCriterion("isdelay not in", values, "isdelay");
            return (Criteria) this;
        }

        public Criteria andIsdelayBetween(String value1, String value2) {
            addCriterion("isdelay between", value1, value2, "isdelay");
            return (Criteria) this;
        }

        public Criteria andIsdelayNotBetween(String value1, String value2) {
            addCriterion("isdelay not between", value1, value2, "isdelay");
            return (Criteria) this;
        }

        public Criteria andExtendDayIsNull() {
            addCriterion("extend_day is null");
            return (Criteria) this;
        }

        public Criteria andExtendDayIsNotNull() {
            addCriterion("extend_day is not null");
            return (Criteria) this;
        }

        public Criteria andExtendDayEqualTo(Integer value) {
            addCriterion("extend_day =", value, "extendDay");
            return (Criteria) this;
        }

        public Criteria andExtendDayNotEqualTo(Integer value) {
            addCriterion("extend_day <>", value, "extendDay");
            return (Criteria) this;
        }

        public Criteria andExtendDayGreaterThan(Integer value) {
            addCriterion("extend_day >", value, "extendDay");
            return (Criteria) this;
        }

        public Criteria andExtendDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("extend_day >=", value, "extendDay");
            return (Criteria) this;
        }

        public Criteria andExtendDayLessThan(Integer value) {
            addCriterion("extend_day <", value, "extendDay");
            return (Criteria) this;
        }

        public Criteria andExtendDayLessThanOrEqualTo(Integer value) {
            addCriterion("extend_day <=", value, "extendDay");
            return (Criteria) this;
        }

        public Criteria andExtendDayIn(List<Integer> values) {
            addCriterion("extend_day in", values, "extendDay");
            return (Criteria) this;
        }

        public Criteria andExtendDayNotIn(List<Integer> values) {
            addCriterion("extend_day not in", values, "extendDay");
            return (Criteria) this;
        }

        public Criteria andExtendDayBetween(Integer value1, Integer value2) {
            addCriterion("extend_day between", value1, value2, "extendDay");
            return (Criteria) this;
        }

        public Criteria andExtendDayNotBetween(Integer value1, Integer value2) {
            addCriterion("extend_day not between", value1, value2, "extendDay");
            return (Criteria) this;
        }

        public Criteria andExtensionChargeRateIsNull() {
            addCriterion("extension_charge_rate is null");
            return (Criteria) this;
        }

        public Criteria andExtensionChargeRateIsNotNull() {
            addCriterion("extension_charge_rate is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionChargeRateEqualTo(Integer value) {
            addCriterion("extension_charge_rate =", value, "extensionChargeRate");
            return (Criteria) this;
        }

        public Criteria andExtensionChargeRateNotEqualTo(Integer value) {
            addCriterion("extension_charge_rate <>", value, "extensionChargeRate");
            return (Criteria) this;
        }

        public Criteria andExtensionChargeRateGreaterThan(Integer value) {
            addCriterion("extension_charge_rate >", value, "extensionChargeRate");
            return (Criteria) this;
        }

        public Criteria andExtensionChargeRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("extension_charge_rate >=", value, "extensionChargeRate");
            return (Criteria) this;
        }

        public Criteria andExtensionChargeRateLessThan(Integer value) {
            addCriterion("extension_charge_rate <", value, "extensionChargeRate");
            return (Criteria) this;
        }

        public Criteria andExtensionChargeRateLessThanOrEqualTo(Integer value) {
            addCriterion("extension_charge_rate <=", value, "extensionChargeRate");
            return (Criteria) this;
        }

        public Criteria andExtensionChargeRateIn(List<Integer> values) {
            addCriterion("extension_charge_rate in", values, "extensionChargeRate");
            return (Criteria) this;
        }

        public Criteria andExtensionChargeRateNotIn(List<Integer> values) {
            addCriterion("extension_charge_rate not in", values, "extensionChargeRate");
            return (Criteria) this;
        }

        public Criteria andExtensionChargeRateBetween(Integer value1, Integer value2) {
            addCriterion("extension_charge_rate between", value1, value2, "extensionChargeRate");
            return (Criteria) this;
        }

        public Criteria andExtensionChargeRateNotBetween(Integer value1, Integer value2) {
            addCriterion("extension_charge_rate not between", value1, value2, "extensionChargeRate");
            return (Criteria) this;
        }

        public Criteria andPrepaymentChargeRateIsNull() {
            addCriterion("prepayment_charge_rate is null");
            return (Criteria) this;
        }

        public Criteria andPrepaymentChargeRateIsNotNull() {
            addCriterion("prepayment_charge_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPrepaymentChargeRateEqualTo(Integer value) {
            addCriterion("prepayment_charge_rate =", value, "prepaymentChargeRate");
            return (Criteria) this;
        }

        public Criteria andPrepaymentChargeRateNotEqualTo(Integer value) {
            addCriterion("prepayment_charge_rate <>", value, "prepaymentChargeRate");
            return (Criteria) this;
        }

        public Criteria andPrepaymentChargeRateGreaterThan(Integer value) {
            addCriterion("prepayment_charge_rate >", value, "prepaymentChargeRate");
            return (Criteria) this;
        }

        public Criteria andPrepaymentChargeRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("prepayment_charge_rate >=", value, "prepaymentChargeRate");
            return (Criteria) this;
        }

        public Criteria andPrepaymentChargeRateLessThan(Integer value) {
            addCriterion("prepayment_charge_rate <", value, "prepaymentChargeRate");
            return (Criteria) this;
        }

        public Criteria andPrepaymentChargeRateLessThanOrEqualTo(Integer value) {
            addCriterion("prepayment_charge_rate <=", value, "prepaymentChargeRate");
            return (Criteria) this;
        }

        public Criteria andPrepaymentChargeRateIn(List<Integer> values) {
            addCriterion("prepayment_charge_rate in", values, "prepaymentChargeRate");
            return (Criteria) this;
        }

        public Criteria andPrepaymentChargeRateNotIn(List<Integer> values) {
            addCriterion("prepayment_charge_rate not in", values, "prepaymentChargeRate");
            return (Criteria) this;
        }

        public Criteria andPrepaymentChargeRateBetween(Integer value1, Integer value2) {
            addCriterion("prepayment_charge_rate between", value1, value2, "prepaymentChargeRate");
            return (Criteria) this;
        }

        public Criteria andPrepaymentChargeRateNotBetween(Integer value1, Integer value2) {
            addCriterion("prepayment_charge_rate not between", value1, value2, "prepaymentChargeRate");
            return (Criteria) this;
        }

        public Criteria andContinuationFloatRateIsNull() {
            addCriterion("continuation_float_rate is null");
            return (Criteria) this;
        }

        public Criteria andContinuationFloatRateIsNotNull() {
            addCriterion("continuation_float_rate is not null");
            return (Criteria) this;
        }

        public Criteria andContinuationFloatRateEqualTo(Integer value) {
            addCriterion("continuation_float_rate =", value, "continuationFloatRate");
            return (Criteria) this;
        }

        public Criteria andContinuationFloatRateNotEqualTo(Integer value) {
            addCriterion("continuation_float_rate <>", value, "continuationFloatRate");
            return (Criteria) this;
        }

        public Criteria andContinuationFloatRateGreaterThan(Integer value) {
            addCriterion("continuation_float_rate >", value, "continuationFloatRate");
            return (Criteria) this;
        }

        public Criteria andContinuationFloatRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("continuation_float_rate >=", value, "continuationFloatRate");
            return (Criteria) this;
        }

        public Criteria andContinuationFloatRateLessThan(Integer value) {
            addCriterion("continuation_float_rate <", value, "continuationFloatRate");
            return (Criteria) this;
        }

        public Criteria andContinuationFloatRateLessThanOrEqualTo(Integer value) {
            addCriterion("continuation_float_rate <=", value, "continuationFloatRate");
            return (Criteria) this;
        }

        public Criteria andContinuationFloatRateIn(List<Integer> values) {
            addCriterion("continuation_float_rate in", values, "continuationFloatRate");
            return (Criteria) this;
        }

        public Criteria andContinuationFloatRateNotIn(List<Integer> values) {
            addCriterion("continuation_float_rate not in", values, "continuationFloatRate");
            return (Criteria) this;
        }

        public Criteria andContinuationFloatRateBetween(Integer value1, Integer value2) {
            addCriterion("continuation_float_rate between", value1, value2, "continuationFloatRate");
            return (Criteria) this;
        }

        public Criteria andContinuationFloatRateNotBetween(Integer value1, Integer value2) {
            addCriterion("continuation_float_rate not between", value1, value2, "continuationFloatRate");
            return (Criteria) this;
        }

        public Criteria andOverdueFloatRateIsNull() {
            addCriterion("overdue_float_rate is null");
            return (Criteria) this;
        }

        public Criteria andOverdueFloatRateIsNotNull() {
            addCriterion("overdue_float_rate is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueFloatRateEqualTo(Integer value) {
            addCriterion("overdue_float_rate =", value, "overdueFloatRate");
            return (Criteria) this;
        }

        public Criteria andOverdueFloatRateNotEqualTo(Integer value) {
            addCriterion("overdue_float_rate <>", value, "overdueFloatRate");
            return (Criteria) this;
        }

        public Criteria andOverdueFloatRateGreaterThan(Integer value) {
            addCriterion("overdue_float_rate >", value, "overdueFloatRate");
            return (Criteria) this;
        }

        public Criteria andOverdueFloatRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("overdue_float_rate >=", value, "overdueFloatRate");
            return (Criteria) this;
        }

        public Criteria andOverdueFloatRateLessThan(Integer value) {
            addCriterion("overdue_float_rate <", value, "overdueFloatRate");
            return (Criteria) this;
        }

        public Criteria andOverdueFloatRateLessThanOrEqualTo(Integer value) {
            addCriterion("overdue_float_rate <=", value, "overdueFloatRate");
            return (Criteria) this;
        }

        public Criteria andOverdueFloatRateIn(List<Integer> values) {
            addCriterion("overdue_float_rate in", values, "overdueFloatRate");
            return (Criteria) this;
        }

        public Criteria andOverdueFloatRateNotIn(List<Integer> values) {
            addCriterion("overdue_float_rate not in", values, "overdueFloatRate");
            return (Criteria) this;
        }

        public Criteria andOverdueFloatRateBetween(Integer value1, Integer value2) {
            addCriterion("overdue_float_rate between", value1, value2, "overdueFloatRate");
            return (Criteria) this;
        }

        public Criteria andOverdueFloatRateNotBetween(Integer value1, Integer value2) {
            addCriterion("overdue_float_rate not between", value1, value2, "overdueFloatRate");
            return (Criteria) this;
        }

        public Criteria andContinuationRateIsNull() {
            addCriterion("continuation_rate is null");
            return (Criteria) this;
        }

        public Criteria andContinuationRateIsNotNull() {
            addCriterion("continuation_rate is not null");
            return (Criteria) this;
        }

        public Criteria andContinuationRateEqualTo(Integer value) {
            addCriterion("continuation_rate =", value, "continuationRate");
            return (Criteria) this;
        }

        public Criteria andContinuationRateNotEqualTo(Integer value) {
            addCriterion("continuation_rate <>", value, "continuationRate");
            return (Criteria) this;
        }

        public Criteria andContinuationRateGreaterThan(Integer value) {
            addCriterion("continuation_rate >", value, "continuationRate");
            return (Criteria) this;
        }

        public Criteria andContinuationRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("continuation_rate >=", value, "continuationRate");
            return (Criteria) this;
        }

        public Criteria andContinuationRateLessThan(Integer value) {
            addCriterion("continuation_rate <", value, "continuationRate");
            return (Criteria) this;
        }

        public Criteria andContinuationRateLessThanOrEqualTo(Integer value) {
            addCriterion("continuation_rate <=", value, "continuationRate");
            return (Criteria) this;
        }

        public Criteria andContinuationRateIn(List<Integer> values) {
            addCriterion("continuation_rate in", values, "continuationRate");
            return (Criteria) this;
        }

        public Criteria andContinuationRateNotIn(List<Integer> values) {
            addCriterion("continuation_rate not in", values, "continuationRate");
            return (Criteria) this;
        }

        public Criteria andContinuationRateBetween(Integer value1, Integer value2) {
            addCriterion("continuation_rate between", value1, value2, "continuationRate");
            return (Criteria) this;
        }

        public Criteria andContinuationRateNotBetween(Integer value1, Integer value2) {
            addCriterion("continuation_rate not between", value1, value2, "continuationRate");
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

        public Criteria andOverdueRateEqualTo(Integer value) {
            addCriterion("overdue_rate =", value, "overdueRate");
            return (Criteria) this;
        }

        public Criteria andOverdueRateNotEqualTo(Integer value) {
            addCriterion("overdue_rate <>", value, "overdueRate");
            return (Criteria) this;
        }

        public Criteria andOverdueRateGreaterThan(Integer value) {
            addCriterion("overdue_rate >", value, "overdueRate");
            return (Criteria) this;
        }

        public Criteria andOverdueRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("overdue_rate >=", value, "overdueRate");
            return (Criteria) this;
        }

        public Criteria andOverdueRateLessThan(Integer value) {
            addCriterion("overdue_rate <", value, "overdueRate");
            return (Criteria) this;
        }

        public Criteria andOverdueRateLessThanOrEqualTo(Integer value) {
            addCriterion("overdue_rate <=", value, "overdueRate");
            return (Criteria) this;
        }

        public Criteria andOverdueRateIn(List<Integer> values) {
            addCriterion("overdue_rate in", values, "overdueRate");
            return (Criteria) this;
        }

        public Criteria andOverdueRateNotIn(List<Integer> values) {
            addCriterion("overdue_rate not in", values, "overdueRate");
            return (Criteria) this;
        }

        public Criteria andOverdueRateBetween(Integer value1, Integer value2) {
            addCriterion("overdue_rate between", value1, value2, "overdueRate");
            return (Criteria) this;
        }

        public Criteria andOverdueRateNotBetween(Integer value1, Integer value2) {
            addCriterion("overdue_rate not between", value1, value2, "overdueRate");
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

        public Criteria andIsFrozenOwnFundsIsNull() {
            addCriterion("is_frozen_own_funds is null");
            return (Criteria) this;
        }

        public Criteria andIsFrozenOwnFundsIsNotNull() {
            addCriterion("is_frozen_own_funds is not null");
            return (Criteria) this;
        }

        public Criteria andIsFrozenOwnFundsEqualTo(String value) {
            addCriterion("is_frozen_own_funds =", value, "isFrozenOwnFunds");
            return (Criteria) this;
        }

        public Criteria andIsFrozenOwnFundsNotEqualTo(String value) {
            addCriterion("is_frozen_own_funds <>", value, "isFrozenOwnFunds");
            return (Criteria) this;
        }

        public Criteria andIsFrozenOwnFundsGreaterThan(String value) {
            addCriterion("is_frozen_own_funds >", value, "isFrozenOwnFunds");
            return (Criteria) this;
        }

        public Criteria andIsFrozenOwnFundsGreaterThanOrEqualTo(String value) {
            addCriterion("is_frozen_own_funds >=", value, "isFrozenOwnFunds");
            return (Criteria) this;
        }

        public Criteria andIsFrozenOwnFundsLessThan(String value) {
            addCriterion("is_frozen_own_funds <", value, "isFrozenOwnFunds");
            return (Criteria) this;
        }

        public Criteria andIsFrozenOwnFundsLessThanOrEqualTo(String value) {
            addCriterion("is_frozen_own_funds <=", value, "isFrozenOwnFunds");
            return (Criteria) this;
        }

        public Criteria andIsFrozenOwnFundsLike(String value) {
            addCriterion("is_frozen_own_funds like", value, "isFrozenOwnFunds");
            return (Criteria) this;
        }

        public Criteria andIsFrozenOwnFundsNotLike(String value) {
            addCriterion("is_frozen_own_funds not like", value, "isFrozenOwnFunds");
            return (Criteria) this;
        }

        public Criteria andIsFrozenOwnFundsIn(List<String> values) {
            addCriterion("is_frozen_own_funds in", values, "isFrozenOwnFunds");
            return (Criteria) this;
        }

        public Criteria andIsFrozenOwnFundsNotIn(List<String> values) {
            addCriterion("is_frozen_own_funds not in", values, "isFrozenOwnFunds");
            return (Criteria) this;
        }

        public Criteria andIsFrozenOwnFundsBetween(String value1, String value2) {
            addCriterion("is_frozen_own_funds between", value1, value2, "isFrozenOwnFunds");
            return (Criteria) this;
        }

        public Criteria andIsFrozenOwnFundsNotBetween(String value1, String value2) {
            addCriterion("is_frozen_own_funds not between", value1, value2, "isFrozenOwnFunds");
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

        public Criteria andMonthlyRateIsNull() {
            addCriterion("monthly_rate is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateIsNotNull() {
            addCriterion("monthly_rate is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateEqualTo(Integer value) {
            addCriterion("monthly_rate =", value, "monthlyRate");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateNotEqualTo(Integer value) {
            addCriterion("monthly_rate <>", value, "monthlyRate");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateGreaterThan(Integer value) {
            addCriterion("monthly_rate >", value, "monthlyRate");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthly_rate >=", value, "monthlyRate");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateLessThan(Integer value) {
            addCriterion("monthly_rate <", value, "monthlyRate");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateLessThanOrEqualTo(Integer value) {
            addCriterion("monthly_rate <=", value, "monthlyRate");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateIn(List<Integer> values) {
            addCriterion("monthly_rate in", values, "monthlyRate");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateNotIn(List<Integer> values) {
            addCriterion("monthly_rate not in", values, "monthlyRate");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateBetween(Integer value1, Integer value2) {
            addCriterion("monthly_rate between", value1, value2, "monthlyRate");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateNotBetween(Integer value1, Integer value2) {
            addCriterion("monthly_rate not between", value1, value2, "monthlyRate");
            return (Criteria) this;
        }

        public Criteria andMarginRateIsNull() {
            addCriterion("margin_rate is null");
            return (Criteria) this;
        }

        public Criteria andMarginRateIsNotNull() {
            addCriterion("margin_rate is not null");
            return (Criteria) this;
        }

        public Criteria andMarginRateEqualTo(Integer value) {
            addCriterion("margin_rate =", value, "marginRate");
            return (Criteria) this;
        }

        public Criteria andMarginRateNotEqualTo(Integer value) {
            addCriterion("margin_rate <>", value, "marginRate");
            return (Criteria) this;
        }

        public Criteria andMarginRateGreaterThan(Integer value) {
            addCriterion("margin_rate >", value, "marginRate");
            return (Criteria) this;
        }

        public Criteria andMarginRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("margin_rate >=", value, "marginRate");
            return (Criteria) this;
        }

        public Criteria andMarginRateLessThan(Integer value) {
            addCriterion("margin_rate <", value, "marginRate");
            return (Criteria) this;
        }

        public Criteria andMarginRateLessThanOrEqualTo(Integer value) {
            addCriterion("margin_rate <=", value, "marginRate");
            return (Criteria) this;
        }

        public Criteria andMarginRateIn(List<Integer> values) {
            addCriterion("margin_rate in", values, "marginRate");
            return (Criteria) this;
        }

        public Criteria andMarginRateNotIn(List<Integer> values) {
            addCriterion("margin_rate not in", values, "marginRate");
            return (Criteria) this;
        }

        public Criteria andMarginRateBetween(Integer value1, Integer value2) {
            addCriterion("margin_rate between", value1, value2, "marginRate");
            return (Criteria) this;
        }

        public Criteria andMarginRateNotBetween(Integer value1, Integer value2) {
            addCriterion("margin_rate not between", value1, value2, "marginRate");
            return (Criteria) this;
        }

        public Criteria andWayOfGuaranteeIsNull() {
            addCriterion("way_of_guarantee is null");
            return (Criteria) this;
        }

        public Criteria andWayOfGuaranteeIsNotNull() {
            addCriterion("way_of_guarantee is not null");
            return (Criteria) this;
        }

        public Criteria andWayOfGuaranteeEqualTo(String value) {
            addCriterion("way_of_guarantee =", value, "wayOfGuarantee");
            return (Criteria) this;
        }

        public Criteria andWayOfGuaranteeNotEqualTo(String value) {
            addCriterion("way_of_guarantee <>", value, "wayOfGuarantee");
            return (Criteria) this;
        }

        public Criteria andWayOfGuaranteeGreaterThan(String value) {
            addCriterion("way_of_guarantee >", value, "wayOfGuarantee");
            return (Criteria) this;
        }

        public Criteria andWayOfGuaranteeGreaterThanOrEqualTo(String value) {
            addCriterion("way_of_guarantee >=", value, "wayOfGuarantee");
            return (Criteria) this;
        }

        public Criteria andWayOfGuaranteeLessThan(String value) {
            addCriterion("way_of_guarantee <", value, "wayOfGuarantee");
            return (Criteria) this;
        }

        public Criteria andWayOfGuaranteeLessThanOrEqualTo(String value) {
            addCriterion("way_of_guarantee <=", value, "wayOfGuarantee");
            return (Criteria) this;
        }

        public Criteria andWayOfGuaranteeLike(String value) {
            addCriterion("way_of_guarantee like", value, "wayOfGuarantee");
            return (Criteria) this;
        }

        public Criteria andWayOfGuaranteeNotLike(String value) {
            addCriterion("way_of_guarantee not like", value, "wayOfGuarantee");
            return (Criteria) this;
        }

        public Criteria andWayOfGuaranteeIn(List<String> values) {
            addCriterion("way_of_guarantee in", values, "wayOfGuarantee");
            return (Criteria) this;
        }

        public Criteria andWayOfGuaranteeNotIn(List<String> values) {
            addCriterion("way_of_guarantee not in", values, "wayOfGuarantee");
            return (Criteria) this;
        }

        public Criteria andWayOfGuaranteeBetween(String value1, String value2) {
            addCriterion("way_of_guarantee between", value1, value2, "wayOfGuarantee");
            return (Criteria) this;
        }

        public Criteria andWayOfGuaranteeNotBetween(String value1, String value2) {
            addCriterion("way_of_guarantee not between", value1, value2, "wayOfGuarantee");
            return (Criteria) this;
        }

        public Criteria andRunBatchIsNull() {
            addCriterion("run_batch is null");
            return (Criteria) this;
        }

        public Criteria andRunBatchIsNotNull() {
            addCriterion("run_batch is not null");
            return (Criteria) this;
        }

        public Criteria andRunBatchEqualTo(String value) {
            addCriterion("run_batch =", value, "runBatch");
            return (Criteria) this;
        }

        public Criteria andRunBatchNotEqualTo(String value) {
            addCriterion("run_batch <>", value, "runBatch");
            return (Criteria) this;
        }

        public Criteria andRunBatchGreaterThan(String value) {
            addCriterion("run_batch >", value, "runBatch");
            return (Criteria) this;
        }

        public Criteria andRunBatchGreaterThanOrEqualTo(String value) {
            addCriterion("run_batch >=", value, "runBatch");
            return (Criteria) this;
        }

        public Criteria andRunBatchLessThan(String value) {
            addCriterion("run_batch <", value, "runBatch");
            return (Criteria) this;
        }

        public Criteria andRunBatchLessThanOrEqualTo(String value) {
            addCriterion("run_batch <=", value, "runBatch");
            return (Criteria) this;
        }

        public Criteria andRunBatchLike(String value) {
            addCriterion("run_batch like", value, "runBatch");
            return (Criteria) this;
        }

        public Criteria andRunBatchNotLike(String value) {
            addCriterion("run_batch not like", value, "runBatch");
            return (Criteria) this;
        }

        public Criteria andRunBatchIn(List<String> values) {
            addCriterion("run_batch in", values, "runBatch");
            return (Criteria) this;
        }

        public Criteria andRunBatchNotIn(List<String> values) {
            addCriterion("run_batch not in", values, "runBatch");
            return (Criteria) this;
        }

        public Criteria andRunBatchBetween(String value1, String value2) {
            addCriterion("run_batch between", value1, value2, "runBatch");
            return (Criteria) this;
        }

        public Criteria andRunBatchNotBetween(String value1, String value2) {
            addCriterion("run_batch not between", value1, value2, "runBatch");
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