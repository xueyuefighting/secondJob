package com.yonyou.scf.common.entity;

import java.util.ArrayList;
import java.util.List;

public class F640DetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public F640DetailExample() {
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

        public Criteria andF640IdIsNull() {
            addCriterion("f640_id is null");
            return (Criteria) this;
        }

        public Criteria andF640IdIsNotNull() {
            addCriterion("f640_id is not null");
            return (Criteria) this;
        }

        public Criteria andF640IdEqualTo(Long value) {
            addCriterion("f640_id =", value, "f640Id");
            return (Criteria) this;
        }

        public Criteria andF640IdNotEqualTo(Long value) {
            addCriterion("f640_id <>", value, "f640Id");
            return (Criteria) this;
        }

        public Criteria andF640IdGreaterThan(Long value) {
            addCriterion("f640_id >", value, "f640Id");
            return (Criteria) this;
        }

        public Criteria andF640IdGreaterThanOrEqualTo(Long value) {
            addCriterion("f640_id >=", value, "f640Id");
            return (Criteria) this;
        }

        public Criteria andF640IdLessThan(Long value) {
            addCriterion("f640_id <", value, "f640Id");
            return (Criteria) this;
        }

        public Criteria andF640IdLessThanOrEqualTo(Long value) {
            addCriterion("f640_id <=", value, "f640Id");
            return (Criteria) this;
        }

        public Criteria andF640IdIn(List<Long> values) {
            addCriterion("f640_id in", values, "f640Id");
            return (Criteria) this;
        }

        public Criteria andF640IdNotIn(List<Long> values) {
            addCriterion("f640_id not in", values, "f640Id");
            return (Criteria) this;
        }

        public Criteria andF640IdBetween(Long value1, Long value2) {
            addCriterion("f640_id between", value1, value2, "f640Id");
            return (Criteria) this;
        }

        public Criteria andF640IdNotBetween(Long value1, Long value2) {
            addCriterion("f640_id not between", value1, value2, "f640Id");
            return (Criteria) this;
        }

        public Criteria andImtTypeIsNull() {
            addCriterion("imt_type is null");
            return (Criteria) this;
        }

        public Criteria andImtTypeIsNotNull() {
            addCriterion("imt_type is not null");
            return (Criteria) this;
        }

        public Criteria andImtTypeEqualTo(String value) {
            addCriterion("imt_type =", value, "imtType");
            return (Criteria) this;
        }

        public Criteria andImtTypeNotEqualTo(String value) {
            addCriterion("imt_type <>", value, "imtType");
            return (Criteria) this;
        }

        public Criteria andImtTypeGreaterThan(String value) {
            addCriterion("imt_type >", value, "imtType");
            return (Criteria) this;
        }

        public Criteria andImtTypeGreaterThanOrEqualTo(String value) {
            addCriterion("imt_type >=", value, "imtType");
            return (Criteria) this;
        }

        public Criteria andImtTypeLessThan(String value) {
            addCriterion("imt_type <", value, "imtType");
            return (Criteria) this;
        }

        public Criteria andImtTypeLessThanOrEqualTo(String value) {
            addCriterion("imt_type <=", value, "imtType");
            return (Criteria) this;
        }

        public Criteria andImtTypeLike(String value) {
            addCriterion("imt_type like", value, "imtType");
            return (Criteria) this;
        }

        public Criteria andImtTypeNotLike(String value) {
            addCriterion("imt_type not like", value, "imtType");
            return (Criteria) this;
        }

        public Criteria andImtTypeIn(List<String> values) {
            addCriterion("imt_type in", values, "imtType");
            return (Criteria) this;
        }

        public Criteria andImtTypeNotIn(List<String> values) {
            addCriterion("imt_type not in", values, "imtType");
            return (Criteria) this;
        }

        public Criteria andImtTypeBetween(String value1, String value2) {
            addCriterion("imt_type between", value1, value2, "imtType");
            return (Criteria) this;
        }

        public Criteria andImtTypeNotBetween(String value1, String value2) {
            addCriterion("imt_type not between", value1, value2, "imtType");
            return (Criteria) this;
        }

        public Criteria andCrLmtIdIsNull() {
            addCriterion("cr_lmt_id is null");
            return (Criteria) this;
        }

        public Criteria andCrLmtIdIsNotNull() {
            addCriterion("cr_lmt_id is not null");
            return (Criteria) this;
        }

        public Criteria andCrLmtIdEqualTo(String value) {
            addCriterion("cr_lmt_id =", value, "crLmtId");
            return (Criteria) this;
        }

        public Criteria andCrLmtIdNotEqualTo(String value) {
            addCriterion("cr_lmt_id <>", value, "crLmtId");
            return (Criteria) this;
        }

        public Criteria andCrLmtIdGreaterThan(String value) {
            addCriterion("cr_lmt_id >", value, "crLmtId");
            return (Criteria) this;
        }

        public Criteria andCrLmtIdGreaterThanOrEqualTo(String value) {
            addCriterion("cr_lmt_id >=", value, "crLmtId");
            return (Criteria) this;
        }

        public Criteria andCrLmtIdLessThan(String value) {
            addCriterion("cr_lmt_id <", value, "crLmtId");
            return (Criteria) this;
        }

        public Criteria andCrLmtIdLessThanOrEqualTo(String value) {
            addCriterion("cr_lmt_id <=", value, "crLmtId");
            return (Criteria) this;
        }

        public Criteria andCrLmtIdLike(String value) {
            addCriterion("cr_lmt_id like", value, "crLmtId");
            return (Criteria) this;
        }

        public Criteria andCrLmtIdNotLike(String value) {
            addCriterion("cr_lmt_id not like", value, "crLmtId");
            return (Criteria) this;
        }

        public Criteria andCrLmtIdIn(List<String> values) {
            addCriterion("cr_lmt_id in", values, "crLmtId");
            return (Criteria) this;
        }

        public Criteria andCrLmtIdNotIn(List<String> values) {
            addCriterion("cr_lmt_id not in", values, "crLmtId");
            return (Criteria) this;
        }

        public Criteria andCrLmtIdBetween(String value1, String value2) {
            addCriterion("cr_lmt_id between", value1, value2, "crLmtId");
            return (Criteria) this;
        }

        public Criteria andCrLmtIdNotBetween(String value1, String value2) {
            addCriterion("cr_lmt_id not between", value1, value2, "crLmtId");
            return (Criteria) this;
        }

        public Criteria andContractNoIsNull() {
            addCriterion("contract_no is null");
            return (Criteria) this;
        }

        public Criteria andContractNoIsNotNull() {
            addCriterion("contract_no is not null");
            return (Criteria) this;
        }

        public Criteria andContractNoEqualTo(String value) {
            addCriterion("contract_no =", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotEqualTo(String value) {
            addCriterion("contract_no <>", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThan(String value) {
            addCriterion("contract_no >", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThanOrEqualTo(String value) {
            addCriterion("contract_no >=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThan(String value) {
            addCriterion("contract_no <", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThanOrEqualTo(String value) {
            addCriterion("contract_no <=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLike(String value) {
            addCriterion("contract_no like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotLike(String value) {
            addCriterion("contract_no not like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoIn(List<String> values) {
            addCriterion("contract_no in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotIn(List<String> values) {
            addCriterion("contract_no not in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoBetween(String value1, String value2) {
            addCriterion("contract_no between", value1, value2, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotBetween(String value1, String value2) {
            addCriterion("contract_no not between", value1, value2, "contractNo");
            return (Criteria) this;
        }

        public Criteria andImtAmtIsNull() {
            addCriterion("imt_amt is null");
            return (Criteria) this;
        }

        public Criteria andImtAmtIsNotNull() {
            addCriterion("imt_amt is not null");
            return (Criteria) this;
        }

        public Criteria andImtAmtEqualTo(Long value) {
            addCriterion("imt_amt =", value, "imtAmt");
            return (Criteria) this;
        }

        public Criteria andImtAmtNotEqualTo(Long value) {
            addCriterion("imt_amt <>", value, "imtAmt");
            return (Criteria) this;
        }

        public Criteria andImtAmtGreaterThan(Long value) {
            addCriterion("imt_amt >", value, "imtAmt");
            return (Criteria) this;
        }

        public Criteria andImtAmtGreaterThanOrEqualTo(Long value) {
            addCriterion("imt_amt >=", value, "imtAmt");
            return (Criteria) this;
        }

        public Criteria andImtAmtLessThan(Long value) {
            addCriterion("imt_amt <", value, "imtAmt");
            return (Criteria) this;
        }

        public Criteria andImtAmtLessThanOrEqualTo(Long value) {
            addCriterion("imt_amt <=", value, "imtAmt");
            return (Criteria) this;
        }

        public Criteria andImtAmtIn(List<Long> values) {
            addCriterion("imt_amt in", values, "imtAmt");
            return (Criteria) this;
        }

        public Criteria andImtAmtNotIn(List<Long> values) {
            addCriterion("imt_amt not in", values, "imtAmt");
            return (Criteria) this;
        }

        public Criteria andImtAmtBetween(Long value1, Long value2) {
            addCriterion("imt_amt between", value1, value2, "imtAmt");
            return (Criteria) this;
        }

        public Criteria andImtAmtNotBetween(Long value1, Long value2) {
            addCriterion("imt_amt not between", value1, value2, "imtAmt");
            return (Criteria) this;
        }

        public Criteria andImtAmtUseableIsNull() {
            addCriterion("imt_amt_useable is null");
            return (Criteria) this;
        }

        public Criteria andImtAmtUseableIsNotNull() {
            addCriterion("imt_amt_useable is not null");
            return (Criteria) this;
        }

        public Criteria andImtAmtUseableEqualTo(Long value) {
            addCriterion("imt_amt_useable =", value, "imtAmtUseable");
            return (Criteria) this;
        }

        public Criteria andImtAmtUseableNotEqualTo(Long value) {
            addCriterion("imt_amt_useable <>", value, "imtAmtUseable");
            return (Criteria) this;
        }

        public Criteria andImtAmtUseableGreaterThan(Long value) {
            addCriterion("imt_amt_useable >", value, "imtAmtUseable");
            return (Criteria) this;
        }

        public Criteria andImtAmtUseableGreaterThanOrEqualTo(Long value) {
            addCriterion("imt_amt_useable >=", value, "imtAmtUseable");
            return (Criteria) this;
        }

        public Criteria andImtAmtUseableLessThan(Long value) {
            addCriterion("imt_amt_useable <", value, "imtAmtUseable");
            return (Criteria) this;
        }

        public Criteria andImtAmtUseableLessThanOrEqualTo(Long value) {
            addCriterion("imt_amt_useable <=", value, "imtAmtUseable");
            return (Criteria) this;
        }

        public Criteria andImtAmtUseableIn(List<Long> values) {
            addCriterion("imt_amt_useable in", values, "imtAmtUseable");
            return (Criteria) this;
        }

        public Criteria andImtAmtUseableNotIn(List<Long> values) {
            addCriterion("imt_amt_useable not in", values, "imtAmtUseable");
            return (Criteria) this;
        }

        public Criteria andImtAmtUseableBetween(Long value1, Long value2) {
            addCriterion("imt_amt_useable between", value1, value2, "imtAmtUseable");
            return (Criteria) this;
        }

        public Criteria andImtAmtUseableNotBetween(Long value1, Long value2) {
            addCriterion("imt_amt_useable not between", value1, value2, "imtAmtUseable");
            return (Criteria) this;
        }

        public Criteria andFinanceScaleIsNull() {
            addCriterion("finance_scale is null");
            return (Criteria) this;
        }

        public Criteria andFinanceScaleIsNotNull() {
            addCriterion("finance_scale is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceScaleEqualTo(Long value) {
            addCriterion("finance_scale =", value, "financeScale");
            return (Criteria) this;
        }

        public Criteria andFinanceScaleNotEqualTo(Long value) {
            addCriterion("finance_scale <>", value, "financeScale");
            return (Criteria) this;
        }

        public Criteria andFinanceScaleGreaterThan(Long value) {
            addCriterion("finance_scale >", value, "financeScale");
            return (Criteria) this;
        }

        public Criteria andFinanceScaleGreaterThanOrEqualTo(Long value) {
            addCriterion("finance_scale >=", value, "financeScale");
            return (Criteria) this;
        }

        public Criteria andFinanceScaleLessThan(Long value) {
            addCriterion("finance_scale <", value, "financeScale");
            return (Criteria) this;
        }

        public Criteria andFinanceScaleLessThanOrEqualTo(Long value) {
            addCriterion("finance_scale <=", value, "financeScale");
            return (Criteria) this;
        }

        public Criteria andFinanceScaleIn(List<Long> values) {
            addCriterion("finance_scale in", values, "financeScale");
            return (Criteria) this;
        }

        public Criteria andFinanceScaleNotIn(List<Long> values) {
            addCriterion("finance_scale not in", values, "financeScale");
            return (Criteria) this;
        }

        public Criteria andFinanceScaleBetween(Long value1, Long value2) {
            addCriterion("finance_scale between", value1, value2, "financeScale");
            return (Criteria) this;
        }

        public Criteria andFinanceScaleNotBetween(Long value1, Long value2) {
            addCriterion("finance_scale not between", value1, value2, "financeScale");
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

        public Criteria andEffDayIsNull() {
            addCriterion("eff_day is null");
            return (Criteria) this;
        }

        public Criteria andEffDayIsNotNull() {
            addCriterion("eff_day is not null");
            return (Criteria) this;
        }

        public Criteria andEffDayEqualTo(String value) {
            addCriterion("eff_day =", value, "effDay");
            return (Criteria) this;
        }

        public Criteria andEffDayNotEqualTo(String value) {
            addCriterion("eff_day <>", value, "effDay");
            return (Criteria) this;
        }

        public Criteria andEffDayGreaterThan(String value) {
            addCriterion("eff_day >", value, "effDay");
            return (Criteria) this;
        }

        public Criteria andEffDayGreaterThanOrEqualTo(String value) {
            addCriterion("eff_day >=", value, "effDay");
            return (Criteria) this;
        }

        public Criteria andEffDayLessThan(String value) {
            addCriterion("eff_day <", value, "effDay");
            return (Criteria) this;
        }

        public Criteria andEffDayLessThanOrEqualTo(String value) {
            addCriterion("eff_day <=", value, "effDay");
            return (Criteria) this;
        }

        public Criteria andEffDayLike(String value) {
            addCriterion("eff_day like", value, "effDay");
            return (Criteria) this;
        }

        public Criteria andEffDayNotLike(String value) {
            addCriterion("eff_day not like", value, "effDay");
            return (Criteria) this;
        }

        public Criteria andEffDayIn(List<String> values) {
            addCriterion("eff_day in", values, "effDay");
            return (Criteria) this;
        }

        public Criteria andEffDayNotIn(List<String> values) {
            addCriterion("eff_day not in", values, "effDay");
            return (Criteria) this;
        }

        public Criteria andEffDayBetween(String value1, String value2) {
            addCriterion("eff_day between", value1, value2, "effDay");
            return (Criteria) this;
        }

        public Criteria andEffDayNotBetween(String value1, String value2) {
            addCriterion("eff_day not between", value1, value2, "effDay");
            return (Criteria) this;
        }

        public Criteria andExDayIsNull() {
            addCriterion("ex_day is null");
            return (Criteria) this;
        }

        public Criteria andExDayIsNotNull() {
            addCriterion("ex_day is not null");
            return (Criteria) this;
        }

        public Criteria andExDayEqualTo(String value) {
            addCriterion("ex_day =", value, "exDay");
            return (Criteria) this;
        }

        public Criteria andExDayNotEqualTo(String value) {
            addCriterion("ex_day <>", value, "exDay");
            return (Criteria) this;
        }

        public Criteria andExDayGreaterThan(String value) {
            addCriterion("ex_day >", value, "exDay");
            return (Criteria) this;
        }

        public Criteria andExDayGreaterThanOrEqualTo(String value) {
            addCriterion("ex_day >=", value, "exDay");
            return (Criteria) this;
        }

        public Criteria andExDayLessThan(String value) {
            addCriterion("ex_day <", value, "exDay");
            return (Criteria) this;
        }

        public Criteria andExDayLessThanOrEqualTo(String value) {
            addCriterion("ex_day <=", value, "exDay");
            return (Criteria) this;
        }

        public Criteria andExDayLike(String value) {
            addCriterion("ex_day like", value, "exDay");
            return (Criteria) this;
        }

        public Criteria andExDayNotLike(String value) {
            addCriterion("ex_day not like", value, "exDay");
            return (Criteria) this;
        }

        public Criteria andExDayIn(List<String> values) {
            addCriterion("ex_day in", values, "exDay");
            return (Criteria) this;
        }

        public Criteria andExDayNotIn(List<String> values) {
            addCriterion("ex_day not in", values, "exDay");
            return (Criteria) this;
        }

        public Criteria andExDayBetween(String value1, String value2) {
            addCriterion("ex_day between", value1, value2, "exDay");
            return (Criteria) this;
        }

        public Criteria andExDayNotBetween(String value1, String value2) {
            addCriterion("ex_day not between", value1, value2, "exDay");
            return (Criteria) this;
        }

        public Criteria andLoanTermIsNull() {
            addCriterion("loan_term is null");
            return (Criteria) this;
        }

        public Criteria andLoanTermIsNotNull() {
            addCriterion("loan_term is not null");
            return (Criteria) this;
        }

        public Criteria andLoanTermEqualTo(Integer value) {
            addCriterion("loan_term =", value, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermNotEqualTo(Integer value) {
            addCriterion("loan_term <>", value, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermGreaterThan(Integer value) {
            addCriterion("loan_term >", value, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermGreaterThanOrEqualTo(Integer value) {
            addCriterion("loan_term >=", value, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermLessThan(Integer value) {
            addCriterion("loan_term <", value, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermLessThanOrEqualTo(Integer value) {
            addCriterion("loan_term <=", value, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermIn(List<Integer> values) {
            addCriterion("loan_term in", values, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermNotIn(List<Integer> values) {
            addCriterion("loan_term not in", values, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermBetween(Integer value1, Integer value2) {
            addCriterion("loan_term between", value1, value2, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermNotBetween(Integer value1, Integer value2) {
            addCriterion("loan_term not between", value1, value2, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andEarInterestRateIsNull() {
            addCriterion("ear_interest_rate is null");
            return (Criteria) this;
        }

        public Criteria andEarInterestRateIsNotNull() {
            addCriterion("ear_interest_rate is not null");
            return (Criteria) this;
        }

        public Criteria andEarInterestRateEqualTo(Long value) {
            addCriterion("ear_interest_rate =", value, "earInterestRate");
            return (Criteria) this;
        }

        public Criteria andEarInterestRateNotEqualTo(Long value) {
            addCriterion("ear_interest_rate <>", value, "earInterestRate");
            return (Criteria) this;
        }

        public Criteria andEarInterestRateGreaterThan(Long value) {
            addCriterion("ear_interest_rate >", value, "earInterestRate");
            return (Criteria) this;
        }

        public Criteria andEarInterestRateGreaterThanOrEqualTo(Long value) {
            addCriterion("ear_interest_rate >=", value, "earInterestRate");
            return (Criteria) this;
        }

        public Criteria andEarInterestRateLessThan(Long value) {
            addCriterion("ear_interest_rate <", value, "earInterestRate");
            return (Criteria) this;
        }

        public Criteria andEarInterestRateLessThanOrEqualTo(Long value) {
            addCriterion("ear_interest_rate <=", value, "earInterestRate");
            return (Criteria) this;
        }

        public Criteria andEarInterestRateIn(List<Long> values) {
            addCriterion("ear_interest_rate in", values, "earInterestRate");
            return (Criteria) this;
        }

        public Criteria andEarInterestRateNotIn(List<Long> values) {
            addCriterion("ear_interest_rate not in", values, "earInterestRate");
            return (Criteria) this;
        }

        public Criteria andEarInterestRateBetween(Long value1, Long value2) {
            addCriterion("ear_interest_rate between", value1, value2, "earInterestRate");
            return (Criteria) this;
        }

        public Criteria andEarInterestRateNotBetween(Long value1, Long value2) {
            addCriterion("ear_interest_rate not between", value1, value2, "earInterestRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateIsNull() {
            addCriterion("penalty_rate is null");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateIsNotNull() {
            addCriterion("penalty_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateEqualTo(Long value) {
            addCriterion("penalty_rate =", value, "penaltyRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateNotEqualTo(Long value) {
            addCriterion("penalty_rate <>", value, "penaltyRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateGreaterThan(Long value) {
            addCriterion("penalty_rate >", value, "penaltyRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateGreaterThanOrEqualTo(Long value) {
            addCriterion("penalty_rate >=", value, "penaltyRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateLessThan(Long value) {
            addCriterion("penalty_rate <", value, "penaltyRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateLessThanOrEqualTo(Long value) {
            addCriterion("penalty_rate <=", value, "penaltyRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateIn(List<Long> values) {
            addCriterion("penalty_rate in", values, "penaltyRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateNotIn(List<Long> values) {
            addCriterion("penalty_rate not in", values, "penaltyRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateBetween(Long value1, Long value2) {
            addCriterion("penalty_rate between", value1, value2, "penaltyRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateNotBetween(Long value1, Long value2) {
            addCriterion("penalty_rate not between", value1, value2, "penaltyRate");
            return (Criteria) this;
        }

        public Criteria andAbPenaltyRateIsNull() {
            addCriterion("ab_penalty_rate is null");
            return (Criteria) this;
        }

        public Criteria andAbPenaltyRateIsNotNull() {
            addCriterion("ab_penalty_rate is not null");
            return (Criteria) this;
        }

        public Criteria andAbPenaltyRateEqualTo(Long value) {
            addCriterion("ab_penalty_rate =", value, "abPenaltyRate");
            return (Criteria) this;
        }

        public Criteria andAbPenaltyRateNotEqualTo(Long value) {
            addCriterion("ab_penalty_rate <>", value, "abPenaltyRate");
            return (Criteria) this;
        }

        public Criteria andAbPenaltyRateGreaterThan(Long value) {
            addCriterion("ab_penalty_rate >", value, "abPenaltyRate");
            return (Criteria) this;
        }

        public Criteria andAbPenaltyRateGreaterThanOrEqualTo(Long value) {
            addCriterion("ab_penalty_rate >=", value, "abPenaltyRate");
            return (Criteria) this;
        }

        public Criteria andAbPenaltyRateLessThan(Long value) {
            addCriterion("ab_penalty_rate <", value, "abPenaltyRate");
            return (Criteria) this;
        }

        public Criteria andAbPenaltyRateLessThanOrEqualTo(Long value) {
            addCriterion("ab_penalty_rate <=", value, "abPenaltyRate");
            return (Criteria) this;
        }

        public Criteria andAbPenaltyRateIn(List<Long> values) {
            addCriterion("ab_penalty_rate in", values, "abPenaltyRate");
            return (Criteria) this;
        }

        public Criteria andAbPenaltyRateNotIn(List<Long> values) {
            addCriterion("ab_penalty_rate not in", values, "abPenaltyRate");
            return (Criteria) this;
        }

        public Criteria andAbPenaltyRateBetween(Long value1, Long value2) {
            addCriterion("ab_penalty_rate between", value1, value2, "abPenaltyRate");
            return (Criteria) this;
        }

        public Criteria andAbPenaltyRateNotBetween(Long value1, Long value2) {
            addCriterion("ab_penalty_rate not between", value1, value2, "abPenaltyRate");
            return (Criteria) this;
        }

        public Criteria andRepayModeIsNull() {
            addCriterion("repay_mode is null");
            return (Criteria) this;
        }

        public Criteria andRepayModeIsNotNull() {
            addCriterion("repay_mode is not null");
            return (Criteria) this;
        }

        public Criteria andRepayModeEqualTo(String value) {
            addCriterion("repay_mode =", value, "repayMode");
            return (Criteria) this;
        }

        public Criteria andRepayModeNotEqualTo(String value) {
            addCriterion("repay_mode <>", value, "repayMode");
            return (Criteria) this;
        }

        public Criteria andRepayModeGreaterThan(String value) {
            addCriterion("repay_mode >", value, "repayMode");
            return (Criteria) this;
        }

        public Criteria andRepayModeGreaterThanOrEqualTo(String value) {
            addCriterion("repay_mode >=", value, "repayMode");
            return (Criteria) this;
        }

        public Criteria andRepayModeLessThan(String value) {
            addCriterion("repay_mode <", value, "repayMode");
            return (Criteria) this;
        }

        public Criteria andRepayModeLessThanOrEqualTo(String value) {
            addCriterion("repay_mode <=", value, "repayMode");
            return (Criteria) this;
        }

        public Criteria andRepayModeLike(String value) {
            addCriterion("repay_mode like", value, "repayMode");
            return (Criteria) this;
        }

        public Criteria andRepayModeNotLike(String value) {
            addCriterion("repay_mode not like", value, "repayMode");
            return (Criteria) this;
        }

        public Criteria andRepayModeIn(List<String> values) {
            addCriterion("repay_mode in", values, "repayMode");
            return (Criteria) this;
        }

        public Criteria andRepayModeNotIn(List<String> values) {
            addCriterion("repay_mode not in", values, "repayMode");
            return (Criteria) this;
        }

        public Criteria andRepayModeBetween(String value1, String value2) {
            addCriterion("repay_mode between", value1, value2, "repayMode");
            return (Criteria) this;
        }

        public Criteria andRepayModeNotBetween(String value1, String value2) {
            addCriterion("repay_mode not between", value1, value2, "repayMode");
            return (Criteria) this;
        }

        public Criteria andRepayAccNumIsNull() {
            addCriterion("repay_acc_num is null");
            return (Criteria) this;
        }

        public Criteria andRepayAccNumIsNotNull() {
            addCriterion("repay_acc_num is not null");
            return (Criteria) this;
        }

        public Criteria andRepayAccNumEqualTo(String value) {
            addCriterion("repay_acc_num =", value, "repayAccNum");
            return (Criteria) this;
        }

        public Criteria andRepayAccNumNotEqualTo(String value) {
            addCriterion("repay_acc_num <>", value, "repayAccNum");
            return (Criteria) this;
        }

        public Criteria andRepayAccNumGreaterThan(String value) {
            addCriterion("repay_acc_num >", value, "repayAccNum");
            return (Criteria) this;
        }

        public Criteria andRepayAccNumGreaterThanOrEqualTo(String value) {
            addCriterion("repay_acc_num >=", value, "repayAccNum");
            return (Criteria) this;
        }

        public Criteria andRepayAccNumLessThan(String value) {
            addCriterion("repay_acc_num <", value, "repayAccNum");
            return (Criteria) this;
        }

        public Criteria andRepayAccNumLessThanOrEqualTo(String value) {
            addCriterion("repay_acc_num <=", value, "repayAccNum");
            return (Criteria) this;
        }

        public Criteria andRepayAccNumLike(String value) {
            addCriterion("repay_acc_num like", value, "repayAccNum");
            return (Criteria) this;
        }

        public Criteria andRepayAccNumNotLike(String value) {
            addCriterion("repay_acc_num not like", value, "repayAccNum");
            return (Criteria) this;
        }

        public Criteria andRepayAccNumIn(List<String> values) {
            addCriterion("repay_acc_num in", values, "repayAccNum");
            return (Criteria) this;
        }

        public Criteria andRepayAccNumNotIn(List<String> values) {
            addCriterion("repay_acc_num not in", values, "repayAccNum");
            return (Criteria) this;
        }

        public Criteria andRepayAccNumBetween(String value1, String value2) {
            addCriterion("repay_acc_num between", value1, value2, "repayAccNum");
            return (Criteria) this;
        }

        public Criteria andRepayAccNumNotBetween(String value1, String value2) {
            addCriterion("repay_acc_num not between", value1, value2, "repayAccNum");
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