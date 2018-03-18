package com.yonyou.scf.common.entity;

import java.util.ArrayList;
import java.util.List;

public class ExtendInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExtendInfoExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("user_type like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("user_type not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andLedingTypeIsNull() {
            addCriterion("leding_type is null");
            return (Criteria) this;
        }

        public Criteria andLedingTypeIsNotNull() {
            addCriterion("leding_type is not null");
            return (Criteria) this;
        }

        public Criteria andLedingTypeEqualTo(String value) {
            addCriterion("leding_type =", value, "ledingType");
            return (Criteria) this;
        }

        public Criteria andLedingTypeNotEqualTo(String value) {
            addCriterion("leding_type <>", value, "ledingType");
            return (Criteria) this;
        }

        public Criteria andLedingTypeGreaterThan(String value) {
            addCriterion("leding_type >", value, "ledingType");
            return (Criteria) this;
        }

        public Criteria andLedingTypeGreaterThanOrEqualTo(String value) {
            addCriterion("leding_type >=", value, "ledingType");
            return (Criteria) this;
        }

        public Criteria andLedingTypeLessThan(String value) {
            addCriterion("leding_type <", value, "ledingType");
            return (Criteria) this;
        }

        public Criteria andLedingTypeLessThanOrEqualTo(String value) {
            addCriterion("leding_type <=", value, "ledingType");
            return (Criteria) this;
        }

        public Criteria andLedingTypeLike(String value) {
            addCriterion("leding_type like", value, "ledingType");
            return (Criteria) this;
        }

        public Criteria andLedingTypeNotLike(String value) {
            addCriterion("leding_type not like", value, "ledingType");
            return (Criteria) this;
        }

        public Criteria andLedingTypeIn(List<String> values) {
            addCriterion("leding_type in", values, "ledingType");
            return (Criteria) this;
        }

        public Criteria andLedingTypeNotIn(List<String> values) {
            addCriterion("leding_type not in", values, "ledingType");
            return (Criteria) this;
        }

        public Criteria andLedingTypeBetween(String value1, String value2) {
            addCriterion("leding_type between", value1, value2, "ledingType");
            return (Criteria) this;
        }

        public Criteria andLedingTypeNotBetween(String value1, String value2) {
            addCriterion("leding_type not between", value1, value2, "ledingType");
            return (Criteria) this;
        }

        public Criteria andSignBankIsNull() {
            addCriterion("sign_bank is null");
            return (Criteria) this;
        }

        public Criteria andSignBankIsNotNull() {
            addCriterion("sign_bank is not null");
            return (Criteria) this;
        }

        public Criteria andSignBankEqualTo(Long value) {
            addCriterion("sign_bank =", value, "signBank");
            return (Criteria) this;
        }

        public Criteria andSignBankNotEqualTo(Long value) {
            addCriterion("sign_bank <>", value, "signBank");
            return (Criteria) this;
        }

        public Criteria andSignBankGreaterThan(Long value) {
            addCriterion("sign_bank >", value, "signBank");
            return (Criteria) this;
        }

        public Criteria andSignBankGreaterThanOrEqualTo(Long value) {
            addCriterion("sign_bank >=", value, "signBank");
            return (Criteria) this;
        }

        public Criteria andSignBankLessThan(Long value) {
            addCriterion("sign_bank <", value, "signBank");
            return (Criteria) this;
        }

        public Criteria andSignBankLessThanOrEqualTo(Long value) {
            addCriterion("sign_bank <=", value, "signBank");
            return (Criteria) this;
        }

        public Criteria andSignBankIn(List<Long> values) {
            addCriterion("sign_bank in", values, "signBank");
            return (Criteria) this;
        }

        public Criteria andSignBankNotIn(List<Long> values) {
            addCriterion("sign_bank not in", values, "signBank");
            return (Criteria) this;
        }

        public Criteria andSignBankBetween(Long value1, Long value2) {
            addCriterion("sign_bank between", value1, value2, "signBank");
            return (Criteria) this;
        }

        public Criteria andSignBankNotBetween(Long value1, Long value2) {
            addCriterion("sign_bank not between", value1, value2, "signBank");
            return (Criteria) this;
        }

        public Criteria andServiceBankPIsNull() {
            addCriterion("service_bank_p is null");
            return (Criteria) this;
        }

        public Criteria andServiceBankPIsNotNull() {
            addCriterion("service_bank_p is not null");
            return (Criteria) this;
        }

        public Criteria andServiceBankPEqualTo(String value) {
            addCriterion("service_bank_p =", value, "serviceBankP");
            return (Criteria) this;
        }

        public Criteria andServiceBankPNotEqualTo(String value) {
            addCriterion("service_bank_p <>", value, "serviceBankP");
            return (Criteria) this;
        }

        public Criteria andServiceBankPGreaterThan(String value) {
            addCriterion("service_bank_p >", value, "serviceBankP");
            return (Criteria) this;
        }

        public Criteria andServiceBankPGreaterThanOrEqualTo(String value) {
            addCriterion("service_bank_p >=", value, "serviceBankP");
            return (Criteria) this;
        }

        public Criteria andServiceBankPLessThan(String value) {
            addCriterion("service_bank_p <", value, "serviceBankP");
            return (Criteria) this;
        }

        public Criteria andServiceBankPLessThanOrEqualTo(String value) {
            addCriterion("service_bank_p <=", value, "serviceBankP");
            return (Criteria) this;
        }

        public Criteria andServiceBankPLike(String value) {
            addCriterion("service_bank_p like", value, "serviceBankP");
            return (Criteria) this;
        }

        public Criteria andServiceBankPNotLike(String value) {
            addCriterion("service_bank_p not like", value, "serviceBankP");
            return (Criteria) this;
        }

        public Criteria andServiceBankPIn(List<String> values) {
            addCriterion("service_bank_p in", values, "serviceBankP");
            return (Criteria) this;
        }

        public Criteria andServiceBankPNotIn(List<String> values) {
            addCriterion("service_bank_p not in", values, "serviceBankP");
            return (Criteria) this;
        }

        public Criteria andServiceBankPBetween(String value1, String value2) {
            addCriterion("service_bank_p between", value1, value2, "serviceBankP");
            return (Criteria) this;
        }

        public Criteria andServiceBankPNotBetween(String value1, String value2) {
            addCriterion("service_bank_p not between", value1, value2, "serviceBankP");
            return (Criteria) this;
        }

        public Criteria andServiceBankCIsNull() {
            addCriterion("service_bank_c is null");
            return (Criteria) this;
        }

        public Criteria andServiceBankCIsNotNull() {
            addCriterion("service_bank_c is not null");
            return (Criteria) this;
        }

        public Criteria andServiceBankCEqualTo(String value) {
            addCriterion("service_bank_c =", value, "serviceBankC");
            return (Criteria) this;
        }

        public Criteria andServiceBankCNotEqualTo(String value) {
            addCriterion("service_bank_c <>", value, "serviceBankC");
            return (Criteria) this;
        }

        public Criteria andServiceBankCGreaterThan(String value) {
            addCriterion("service_bank_c >", value, "serviceBankC");
            return (Criteria) this;
        }

        public Criteria andServiceBankCGreaterThanOrEqualTo(String value) {
            addCriterion("service_bank_c >=", value, "serviceBankC");
            return (Criteria) this;
        }

        public Criteria andServiceBankCLessThan(String value) {
            addCriterion("service_bank_c <", value, "serviceBankC");
            return (Criteria) this;
        }

        public Criteria andServiceBankCLessThanOrEqualTo(String value) {
            addCriterion("service_bank_c <=", value, "serviceBankC");
            return (Criteria) this;
        }

        public Criteria andServiceBankCLike(String value) {
            addCriterion("service_bank_c like", value, "serviceBankC");
            return (Criteria) this;
        }

        public Criteria andServiceBankCNotLike(String value) {
            addCriterion("service_bank_c not like", value, "serviceBankC");
            return (Criteria) this;
        }

        public Criteria andServiceBankCIn(List<String> values) {
            addCriterion("service_bank_c in", values, "serviceBankC");
            return (Criteria) this;
        }

        public Criteria andServiceBankCNotIn(List<String> values) {
            addCriterion("service_bank_c not in", values, "serviceBankC");
            return (Criteria) this;
        }

        public Criteria andServiceBankCBetween(String value1, String value2) {
            addCriterion("service_bank_c between", value1, value2, "serviceBankC");
            return (Criteria) this;
        }

        public Criteria andServiceBankCNotBetween(String value1, String value2) {
            addCriterion("service_bank_c not between", value1, value2, "serviceBankC");
            return (Criteria) this;
        }

        public Criteria andServiceBankBIsNull() {
            addCriterion("service_bank_b is null");
            return (Criteria) this;
        }

        public Criteria andServiceBankBIsNotNull() {
            addCriterion("service_bank_b is not null");
            return (Criteria) this;
        }

        public Criteria andServiceBankBEqualTo(String value) {
            addCriterion("service_bank_b =", value, "serviceBankB");
            return (Criteria) this;
        }

        public Criteria andServiceBankBNotEqualTo(String value) {
            addCriterion("service_bank_b <>", value, "serviceBankB");
            return (Criteria) this;
        }

        public Criteria andServiceBankBGreaterThan(String value) {
            addCriterion("service_bank_b >", value, "serviceBankB");
            return (Criteria) this;
        }

        public Criteria andServiceBankBGreaterThanOrEqualTo(String value) {
            addCriterion("service_bank_b >=", value, "serviceBankB");
            return (Criteria) this;
        }

        public Criteria andServiceBankBLessThan(String value) {
            addCriterion("service_bank_b <", value, "serviceBankB");
            return (Criteria) this;
        }

        public Criteria andServiceBankBLessThanOrEqualTo(String value) {
            addCriterion("service_bank_b <=", value, "serviceBankB");
            return (Criteria) this;
        }

        public Criteria andServiceBankBLike(String value) {
            addCriterion("service_bank_b like", value, "serviceBankB");
            return (Criteria) this;
        }

        public Criteria andServiceBankBNotLike(String value) {
            addCriterion("service_bank_b not like", value, "serviceBankB");
            return (Criteria) this;
        }

        public Criteria andServiceBankBIn(List<String> values) {
            addCriterion("service_bank_b in", values, "serviceBankB");
            return (Criteria) this;
        }

        public Criteria andServiceBankBNotIn(List<String> values) {
            addCriterion("service_bank_b not in", values, "serviceBankB");
            return (Criteria) this;
        }

        public Criteria andServiceBankBBetween(String value1, String value2) {
            addCriterion("service_bank_b between", value1, value2, "serviceBankB");
            return (Criteria) this;
        }

        public Criteria andServiceBankBNotBetween(String value1, String value2) {
            addCriterion("service_bank_b not between", value1, value2, "serviceBankB");
            return (Criteria) this;
        }

        public Criteria andServiceAreaIsNull() {
            addCriterion("service_area is null");
            return (Criteria) this;
        }

        public Criteria andServiceAreaIsNotNull() {
            addCriterion("service_area is not null");
            return (Criteria) this;
        }

        public Criteria andServiceAreaEqualTo(String value) {
            addCriterion("service_area =", value, "serviceArea");
            return (Criteria) this;
        }

        public Criteria andServiceAreaNotEqualTo(String value) {
            addCriterion("service_area <>", value, "serviceArea");
            return (Criteria) this;
        }

        public Criteria andServiceAreaGreaterThan(String value) {
            addCriterion("service_area >", value, "serviceArea");
            return (Criteria) this;
        }

        public Criteria andServiceAreaGreaterThanOrEqualTo(String value) {
            addCriterion("service_area >=", value, "serviceArea");
            return (Criteria) this;
        }

        public Criteria andServiceAreaLessThan(String value) {
            addCriterion("service_area <", value, "serviceArea");
            return (Criteria) this;
        }

        public Criteria andServiceAreaLessThanOrEqualTo(String value) {
            addCriterion("service_area <=", value, "serviceArea");
            return (Criteria) this;
        }

        public Criteria andServiceAreaLike(String value) {
            addCriterion("service_area like", value, "serviceArea");
            return (Criteria) this;
        }

        public Criteria andServiceAreaNotLike(String value) {
            addCriterion("service_area not like", value, "serviceArea");
            return (Criteria) this;
        }

        public Criteria andServiceAreaIn(List<String> values) {
            addCriterion("service_area in", values, "serviceArea");
            return (Criteria) this;
        }

        public Criteria andServiceAreaNotIn(List<String> values) {
            addCriterion("service_area not in", values, "serviceArea");
            return (Criteria) this;
        }

        public Criteria andServiceAreaBetween(String value1, String value2) {
            addCriterion("service_area between", value1, value2, "serviceArea");
            return (Criteria) this;
        }

        public Criteria andServiceAreaNotBetween(String value1, String value2) {
            addCriterion("service_area not between", value1, value2, "serviceArea");
            return (Criteria) this;
        }

        public Criteria andLimitMinIsNull() {
            addCriterion("limit_min is null");
            return (Criteria) this;
        }

        public Criteria andLimitMinIsNotNull() {
            addCriterion("limit_min is not null");
            return (Criteria) this;
        }

        public Criteria andLimitMinEqualTo(Long value) {
            addCriterion("limit_min =", value, "limitMin");
            return (Criteria) this;
        }

        public Criteria andLimitMinNotEqualTo(Long value) {
            addCriterion("limit_min <>", value, "limitMin");
            return (Criteria) this;
        }

        public Criteria andLimitMinGreaterThan(Long value) {
            addCriterion("limit_min >", value, "limitMin");
            return (Criteria) this;
        }

        public Criteria andLimitMinGreaterThanOrEqualTo(Long value) {
            addCriterion("limit_min >=", value, "limitMin");
            return (Criteria) this;
        }

        public Criteria andLimitMinLessThan(Long value) {
            addCriterion("limit_min <", value, "limitMin");
            return (Criteria) this;
        }

        public Criteria andLimitMinLessThanOrEqualTo(Long value) {
            addCriterion("limit_min <=", value, "limitMin");
            return (Criteria) this;
        }

        public Criteria andLimitMinIn(List<Long> values) {
            addCriterion("limit_min in", values, "limitMin");
            return (Criteria) this;
        }

        public Criteria andLimitMinNotIn(List<Long> values) {
            addCriterion("limit_min not in", values, "limitMin");
            return (Criteria) this;
        }

        public Criteria andLimitMinBetween(Long value1, Long value2) {
            addCriterion("limit_min between", value1, value2, "limitMin");
            return (Criteria) this;
        }

        public Criteria andLimitMinNotBetween(Long value1, Long value2) {
            addCriterion("limit_min not between", value1, value2, "limitMin");
            return (Criteria) this;
        }

        public Criteria andLimitMaxIsNull() {
            addCriterion("limit_max is null");
            return (Criteria) this;
        }

        public Criteria andLimitMaxIsNotNull() {
            addCriterion("limit_max is not null");
            return (Criteria) this;
        }

        public Criteria andLimitMaxEqualTo(Long value) {
            addCriterion("limit_max =", value, "limitMax");
            return (Criteria) this;
        }

        public Criteria andLimitMaxNotEqualTo(Long value) {
            addCriterion("limit_max <>", value, "limitMax");
            return (Criteria) this;
        }

        public Criteria andLimitMaxGreaterThan(Long value) {
            addCriterion("limit_max >", value, "limitMax");
            return (Criteria) this;
        }

        public Criteria andLimitMaxGreaterThanOrEqualTo(Long value) {
            addCriterion("limit_max >=", value, "limitMax");
            return (Criteria) this;
        }

        public Criteria andLimitMaxLessThan(Long value) {
            addCriterion("limit_max <", value, "limitMax");
            return (Criteria) this;
        }

        public Criteria andLimitMaxLessThanOrEqualTo(Long value) {
            addCriterion("limit_max <=", value, "limitMax");
            return (Criteria) this;
        }

        public Criteria andLimitMaxIn(List<Long> values) {
            addCriterion("limit_max in", values, "limitMax");
            return (Criteria) this;
        }

        public Criteria andLimitMaxNotIn(List<Long> values) {
            addCriterion("limit_max not in", values, "limitMax");
            return (Criteria) this;
        }

        public Criteria andLimitMaxBetween(Long value1, Long value2) {
            addCriterion("limit_max between", value1, value2, "limitMax");
            return (Criteria) this;
        }

        public Criteria andLimitMaxNotBetween(Long value1, Long value2) {
            addCriterion("limit_max not between", value1, value2, "limitMax");
            return (Criteria) this;
        }

        public Criteria andRateMinIsNull() {
            addCriterion("rate_min is null");
            return (Criteria) this;
        }

        public Criteria andRateMinIsNotNull() {
            addCriterion("rate_min is not null");
            return (Criteria) this;
        }

        public Criteria andRateMinEqualTo(Long value) {
            addCriterion("rate_min =", value, "rateMin");
            return (Criteria) this;
        }

        public Criteria andRateMinNotEqualTo(Long value) {
            addCriterion("rate_min <>", value, "rateMin");
            return (Criteria) this;
        }

        public Criteria andRateMinGreaterThan(Long value) {
            addCriterion("rate_min >", value, "rateMin");
            return (Criteria) this;
        }

        public Criteria andRateMinGreaterThanOrEqualTo(Long value) {
            addCriterion("rate_min >=", value, "rateMin");
            return (Criteria) this;
        }

        public Criteria andRateMinLessThan(Long value) {
            addCriterion("rate_min <", value, "rateMin");
            return (Criteria) this;
        }

        public Criteria andRateMinLessThanOrEqualTo(Long value) {
            addCriterion("rate_min <=", value, "rateMin");
            return (Criteria) this;
        }

        public Criteria andRateMinIn(List<Long> values) {
            addCriterion("rate_min in", values, "rateMin");
            return (Criteria) this;
        }

        public Criteria andRateMinNotIn(List<Long> values) {
            addCriterion("rate_min not in", values, "rateMin");
            return (Criteria) this;
        }

        public Criteria andRateMinBetween(Long value1, Long value2) {
            addCriterion("rate_min between", value1, value2, "rateMin");
            return (Criteria) this;
        }

        public Criteria andRateMinNotBetween(Long value1, Long value2) {
            addCriterion("rate_min not between", value1, value2, "rateMin");
            return (Criteria) this;
        }

        public Criteria andRateMaxIsNull() {
            addCriterion("rate_max is null");
            return (Criteria) this;
        }

        public Criteria andRateMaxIsNotNull() {
            addCriterion("rate_max is not null");
            return (Criteria) this;
        }

        public Criteria andRateMaxEqualTo(Long value) {
            addCriterion("rate_max =", value, "rateMax");
            return (Criteria) this;
        }

        public Criteria andRateMaxNotEqualTo(Long value) {
            addCriterion("rate_max <>", value, "rateMax");
            return (Criteria) this;
        }

        public Criteria andRateMaxGreaterThan(Long value) {
            addCriterion("rate_max >", value, "rateMax");
            return (Criteria) this;
        }

        public Criteria andRateMaxGreaterThanOrEqualTo(Long value) {
            addCriterion("rate_max >=", value, "rateMax");
            return (Criteria) this;
        }

        public Criteria andRateMaxLessThan(Long value) {
            addCriterion("rate_max <", value, "rateMax");
            return (Criteria) this;
        }

        public Criteria andRateMaxLessThanOrEqualTo(Long value) {
            addCriterion("rate_max <=", value, "rateMax");
            return (Criteria) this;
        }

        public Criteria andRateMaxIn(List<Long> values) {
            addCriterion("rate_max in", values, "rateMax");
            return (Criteria) this;
        }

        public Criteria andRateMaxNotIn(List<Long> values) {
            addCriterion("rate_max not in", values, "rateMax");
            return (Criteria) this;
        }

        public Criteria andRateMaxBetween(Long value1, Long value2) {
            addCriterion("rate_max between", value1, value2, "rateMax");
            return (Criteria) this;
        }

        public Criteria andRateMaxNotBetween(Long value1, Long value2) {
            addCriterion("rate_max not between", value1, value2, "rateMax");
            return (Criteria) this;
        }

        public Criteria andRequirementIsNull() {
            addCriterion("requirement is null");
            return (Criteria) this;
        }

        public Criteria andRequirementIsNotNull() {
            addCriterion("requirement is not null");
            return (Criteria) this;
        }

        public Criteria andRequirementEqualTo(String value) {
            addCriterion("requirement =", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotEqualTo(String value) {
            addCriterion("requirement <>", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementGreaterThan(String value) {
            addCriterion("requirement >", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementGreaterThanOrEqualTo(String value) {
            addCriterion("requirement >=", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementLessThan(String value) {
            addCriterion("requirement <", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementLessThanOrEqualTo(String value) {
            addCriterion("requirement <=", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementLike(String value) {
            addCriterion("requirement like", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotLike(String value) {
            addCriterion("requirement not like", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementIn(List<String> values) {
            addCriterion("requirement in", values, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotIn(List<String> values) {
            addCriterion("requirement not in", values, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementBetween(String value1, String value2) {
            addCriterion("requirement between", value1, value2, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotBetween(String value1, String value2) {
            addCriterion("requirement not between", value1, value2, "requirement");
            return (Criteria) this;
        }

        public Criteria andEnableStatusIsNull() {
            addCriterion("enable_status is null");
            return (Criteria) this;
        }

        public Criteria andEnableStatusIsNotNull() {
            addCriterion("enable_status is not null");
            return (Criteria) this;
        }

        public Criteria andEnableStatusEqualTo(String value) {
            addCriterion("enable_status =", value, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusNotEqualTo(String value) {
            addCriterion("enable_status <>", value, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusGreaterThan(String value) {
            addCriterion("enable_status >", value, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusGreaterThanOrEqualTo(String value) {
            addCriterion("enable_status >=", value, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusLessThan(String value) {
            addCriterion("enable_status <", value, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusLessThanOrEqualTo(String value) {
            addCriterion("enable_status <=", value, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusLike(String value) {
            addCriterion("enable_status like", value, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusNotLike(String value) {
            addCriterion("enable_status not like", value, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusIn(List<String> values) {
            addCriterion("enable_status in", values, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusNotIn(List<String> values) {
            addCriterion("enable_status not in", values, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusBetween(String value1, String value2) {
            addCriterion("enable_status between", value1, value2, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusNotBetween(String value1, String value2) {
            addCriterion("enable_status not between", value1, value2, "enableStatus");
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