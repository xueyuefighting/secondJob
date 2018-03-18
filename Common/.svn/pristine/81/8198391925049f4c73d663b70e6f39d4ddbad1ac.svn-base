package com.yonyou.scf.common.entity;

import java.util.ArrayList;
import java.util.List;

public class BindCardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BindCardExample() {
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

        public Criteria andMemIdIsNull() {
            addCriterion("mem_id is null");
            return (Criteria) this;
        }

        public Criteria andMemIdIsNotNull() {
            addCriterion("mem_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemIdEqualTo(Long value) {
            addCriterion("mem_id =", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdNotEqualTo(Long value) {
            addCriterion("mem_id <>", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdGreaterThan(Long value) {
            addCriterion("mem_id >", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mem_id >=", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdLessThan(Long value) {
            addCriterion("mem_id <", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdLessThanOrEqualTo(Long value) {
            addCriterion("mem_id <=", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdIn(List<Long> values) {
            addCriterion("mem_id in", values, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdNotIn(List<Long> values) {
            addCriterion("mem_id not in", values, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdBetween(Long value1, Long value2) {
            addCriterion("mem_id between", value1, value2, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdNotBetween(Long value1, Long value2) {
            addCriterion("mem_id not between", value1, value2, "memId");
            return (Criteria) this;
        }

        public Criteria andBindOpenBankIsNull() {
            addCriterion("bind_open_bank is null");
            return (Criteria) this;
        }

        public Criteria andBindOpenBankIsNotNull() {
            addCriterion("bind_open_bank is not null");
            return (Criteria) this;
        }

        public Criteria andBindOpenBankEqualTo(String value) {
            addCriterion("bind_open_bank =", value, "bindOpenBank");
            return (Criteria) this;
        }

        public Criteria andBindOpenBankNotEqualTo(String value) {
            addCriterion("bind_open_bank <>", value, "bindOpenBank");
            return (Criteria) this;
        }

        public Criteria andBindOpenBankGreaterThan(String value) {
            addCriterion("bind_open_bank >", value, "bindOpenBank");
            return (Criteria) this;
        }

        public Criteria andBindOpenBankGreaterThanOrEqualTo(String value) {
            addCriterion("bind_open_bank >=", value, "bindOpenBank");
            return (Criteria) this;
        }

        public Criteria andBindOpenBankLessThan(String value) {
            addCriterion("bind_open_bank <", value, "bindOpenBank");
            return (Criteria) this;
        }

        public Criteria andBindOpenBankLessThanOrEqualTo(String value) {
            addCriterion("bind_open_bank <=", value, "bindOpenBank");
            return (Criteria) this;
        }

        public Criteria andBindOpenBankLike(String value) {
            addCriterion("bind_open_bank like", value, "bindOpenBank");
            return (Criteria) this;
        }

        public Criteria andBindOpenBankNotLike(String value) {
            addCriterion("bind_open_bank not like", value, "bindOpenBank");
            return (Criteria) this;
        }

        public Criteria andBindOpenBankIn(List<String> values) {
            addCriterion("bind_open_bank in", values, "bindOpenBank");
            return (Criteria) this;
        }

        public Criteria andBindOpenBankNotIn(List<String> values) {
            addCriterion("bind_open_bank not in", values, "bindOpenBank");
            return (Criteria) this;
        }

        public Criteria andBindOpenBankBetween(String value1, String value2) {
            addCriterion("bind_open_bank between", value1, value2, "bindOpenBank");
            return (Criteria) this;
        }

        public Criteria andBindOpenBankNotBetween(String value1, String value2) {
            addCriterion("bind_open_bank not between", value1, value2, "bindOpenBank");
            return (Criteria) this;
        }

        public Criteria andBindOpenOrgNumIsNull() {
            addCriterion("bind_open_org_num is null");
            return (Criteria) this;
        }

        public Criteria andBindOpenOrgNumIsNotNull() {
            addCriterion("bind_open_org_num is not null");
            return (Criteria) this;
        }

        public Criteria andBindOpenOrgNumEqualTo(String value) {
            addCriterion("bind_open_org_num =", value, "bindOpenOrgNum");
            return (Criteria) this;
        }

        public Criteria andBindOpenOrgNumNotEqualTo(String value) {
            addCriterion("bind_open_org_num <>", value, "bindOpenOrgNum");
            return (Criteria) this;
        }

        public Criteria andBindOpenOrgNumGreaterThan(String value) {
            addCriterion("bind_open_org_num >", value, "bindOpenOrgNum");
            return (Criteria) this;
        }

        public Criteria andBindOpenOrgNumGreaterThanOrEqualTo(String value) {
            addCriterion("bind_open_org_num >=", value, "bindOpenOrgNum");
            return (Criteria) this;
        }

        public Criteria andBindOpenOrgNumLessThan(String value) {
            addCriterion("bind_open_org_num <", value, "bindOpenOrgNum");
            return (Criteria) this;
        }

        public Criteria andBindOpenOrgNumLessThanOrEqualTo(String value) {
            addCriterion("bind_open_org_num <=", value, "bindOpenOrgNum");
            return (Criteria) this;
        }

        public Criteria andBindOpenOrgNumLike(String value) {
            addCriterion("bind_open_org_num like", value, "bindOpenOrgNum");
            return (Criteria) this;
        }

        public Criteria andBindOpenOrgNumNotLike(String value) {
            addCriterion("bind_open_org_num not like", value, "bindOpenOrgNum");
            return (Criteria) this;
        }

        public Criteria andBindOpenOrgNumIn(List<String> values) {
            addCriterion("bind_open_org_num in", values, "bindOpenOrgNum");
            return (Criteria) this;
        }

        public Criteria andBindOpenOrgNumNotIn(List<String> values) {
            addCriterion("bind_open_org_num not in", values, "bindOpenOrgNum");
            return (Criteria) this;
        }

        public Criteria andBindOpenOrgNumBetween(String value1, String value2) {
            addCriterion("bind_open_org_num between", value1, value2, "bindOpenOrgNum");
            return (Criteria) this;
        }

        public Criteria andBindOpenOrgNumNotBetween(String value1, String value2) {
            addCriterion("bind_open_org_num not between", value1, value2, "bindOpenOrgNum");
            return (Criteria) this;
        }

        public Criteria andOpenBankProvinceIsNull() {
            addCriterion("open_bank_province is null");
            return (Criteria) this;
        }

        public Criteria andOpenBankProvinceIsNotNull() {
            addCriterion("open_bank_province is not null");
            return (Criteria) this;
        }

        public Criteria andOpenBankProvinceEqualTo(String value) {
            addCriterion("open_bank_province =", value, "openBankProvince");
            return (Criteria) this;
        }

        public Criteria andOpenBankProvinceNotEqualTo(String value) {
            addCriterion("open_bank_province <>", value, "openBankProvince");
            return (Criteria) this;
        }

        public Criteria andOpenBankProvinceGreaterThan(String value) {
            addCriterion("open_bank_province >", value, "openBankProvince");
            return (Criteria) this;
        }

        public Criteria andOpenBankProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("open_bank_province >=", value, "openBankProvince");
            return (Criteria) this;
        }

        public Criteria andOpenBankProvinceLessThan(String value) {
            addCriterion("open_bank_province <", value, "openBankProvince");
            return (Criteria) this;
        }

        public Criteria andOpenBankProvinceLessThanOrEqualTo(String value) {
            addCriterion("open_bank_province <=", value, "openBankProvince");
            return (Criteria) this;
        }

        public Criteria andOpenBankProvinceLike(String value) {
            addCriterion("open_bank_province like", value, "openBankProvince");
            return (Criteria) this;
        }

        public Criteria andOpenBankProvinceNotLike(String value) {
            addCriterion("open_bank_province not like", value, "openBankProvince");
            return (Criteria) this;
        }

        public Criteria andOpenBankProvinceIn(List<String> values) {
            addCriterion("open_bank_province in", values, "openBankProvince");
            return (Criteria) this;
        }

        public Criteria andOpenBankProvinceNotIn(List<String> values) {
            addCriterion("open_bank_province not in", values, "openBankProvince");
            return (Criteria) this;
        }

        public Criteria andOpenBankProvinceBetween(String value1, String value2) {
            addCriterion("open_bank_province between", value1, value2, "openBankProvince");
            return (Criteria) this;
        }

        public Criteria andOpenBankProvinceNotBetween(String value1, String value2) {
            addCriterion("open_bank_province not between", value1, value2, "openBankProvince");
            return (Criteria) this;
        }

        public Criteria andOpenBankCityIsNull() {
            addCriterion("open_bank_city is null");
            return (Criteria) this;
        }

        public Criteria andOpenBankCityIsNotNull() {
            addCriterion("open_bank_city is not null");
            return (Criteria) this;
        }

        public Criteria andOpenBankCityEqualTo(String value) {
            addCriterion("open_bank_city =", value, "openBankCity");
            return (Criteria) this;
        }

        public Criteria andOpenBankCityNotEqualTo(String value) {
            addCriterion("open_bank_city <>", value, "openBankCity");
            return (Criteria) this;
        }

        public Criteria andOpenBankCityGreaterThan(String value) {
            addCriterion("open_bank_city >", value, "openBankCity");
            return (Criteria) this;
        }

        public Criteria andOpenBankCityGreaterThanOrEqualTo(String value) {
            addCriterion("open_bank_city >=", value, "openBankCity");
            return (Criteria) this;
        }

        public Criteria andOpenBankCityLessThan(String value) {
            addCriterion("open_bank_city <", value, "openBankCity");
            return (Criteria) this;
        }

        public Criteria andOpenBankCityLessThanOrEqualTo(String value) {
            addCriterion("open_bank_city <=", value, "openBankCity");
            return (Criteria) this;
        }

        public Criteria andOpenBankCityLike(String value) {
            addCriterion("open_bank_city like", value, "openBankCity");
            return (Criteria) this;
        }

        public Criteria andOpenBankCityNotLike(String value) {
            addCriterion("open_bank_city not like", value, "openBankCity");
            return (Criteria) this;
        }

        public Criteria andOpenBankCityIn(List<String> values) {
            addCriterion("open_bank_city in", values, "openBankCity");
            return (Criteria) this;
        }

        public Criteria andOpenBankCityNotIn(List<String> values) {
            addCriterion("open_bank_city not in", values, "openBankCity");
            return (Criteria) this;
        }

        public Criteria andOpenBankCityBetween(String value1, String value2) {
            addCriterion("open_bank_city between", value1, value2, "openBankCity");
            return (Criteria) this;
        }

        public Criteria andOpenBankCityNotBetween(String value1, String value2) {
            addCriterion("open_bank_city not between", value1, value2, "openBankCity");
            return (Criteria) this;
        }

        public Criteria andOpenBankBranchRowsIsNull() {
            addCriterion("open_bank_branch_rows is null");
            return (Criteria) this;
        }

        public Criteria andOpenBankBranchRowsIsNotNull() {
            addCriterion("open_bank_branch_rows is not null");
            return (Criteria) this;
        }

        public Criteria andOpenBankBranchRowsEqualTo(String value) {
            addCriterion("open_bank_branch_rows =", value, "openBankBranchRows");
            return (Criteria) this;
        }

        public Criteria andOpenBankBranchRowsNotEqualTo(String value) {
            addCriterion("open_bank_branch_rows <>", value, "openBankBranchRows");
            return (Criteria) this;
        }

        public Criteria andOpenBankBranchRowsGreaterThan(String value) {
            addCriterion("open_bank_branch_rows >", value, "openBankBranchRows");
            return (Criteria) this;
        }

        public Criteria andOpenBankBranchRowsGreaterThanOrEqualTo(String value) {
            addCriterion("open_bank_branch_rows >=", value, "openBankBranchRows");
            return (Criteria) this;
        }

        public Criteria andOpenBankBranchRowsLessThan(String value) {
            addCriterion("open_bank_branch_rows <", value, "openBankBranchRows");
            return (Criteria) this;
        }

        public Criteria andOpenBankBranchRowsLessThanOrEqualTo(String value) {
            addCriterion("open_bank_branch_rows <=", value, "openBankBranchRows");
            return (Criteria) this;
        }

        public Criteria andOpenBankBranchRowsLike(String value) {
            addCriterion("open_bank_branch_rows like", value, "openBankBranchRows");
            return (Criteria) this;
        }

        public Criteria andOpenBankBranchRowsNotLike(String value) {
            addCriterion("open_bank_branch_rows not like", value, "openBankBranchRows");
            return (Criteria) this;
        }

        public Criteria andOpenBankBranchRowsIn(List<String> values) {
            addCriterion("open_bank_branch_rows in", values, "openBankBranchRows");
            return (Criteria) this;
        }

        public Criteria andOpenBankBranchRowsNotIn(List<String> values) {
            addCriterion("open_bank_branch_rows not in", values, "openBankBranchRows");
            return (Criteria) this;
        }

        public Criteria andOpenBankBranchRowsBetween(String value1, String value2) {
            addCriterion("open_bank_branch_rows between", value1, value2, "openBankBranchRows");
            return (Criteria) this;
        }

        public Criteria andOpenBankBranchRowsNotBetween(String value1, String value2) {
            addCriterion("open_bank_branch_rows not between", value1, value2, "openBankBranchRows");
            return (Criteria) this;
        }

        public Criteria andBindAccNumIsNull() {
            addCriterion("bind_acc_num is null");
            return (Criteria) this;
        }

        public Criteria andBindAccNumIsNotNull() {
            addCriterion("bind_acc_num is not null");
            return (Criteria) this;
        }

        public Criteria andBindAccNumEqualTo(String value) {
            addCriterion("bind_acc_num =", value, "bindAccNum");
            return (Criteria) this;
        }

        public Criteria andBindAccNumNotEqualTo(String value) {
            addCriterion("bind_acc_num <>", value, "bindAccNum");
            return (Criteria) this;
        }

        public Criteria andBindAccNumGreaterThan(String value) {
            addCriterion("bind_acc_num >", value, "bindAccNum");
            return (Criteria) this;
        }

        public Criteria andBindAccNumGreaterThanOrEqualTo(String value) {
            addCriterion("bind_acc_num >=", value, "bindAccNum");
            return (Criteria) this;
        }

        public Criteria andBindAccNumLessThan(String value) {
            addCriterion("bind_acc_num <", value, "bindAccNum");
            return (Criteria) this;
        }

        public Criteria andBindAccNumLessThanOrEqualTo(String value) {
            addCriterion("bind_acc_num <=", value, "bindAccNum");
            return (Criteria) this;
        }

        public Criteria andBindAccNumLike(String value) {
            addCriterion("bind_acc_num like", value, "bindAccNum");
            return (Criteria) this;
        }

        public Criteria andBindAccNumNotLike(String value) {
            addCriterion("bind_acc_num not like", value, "bindAccNum");
            return (Criteria) this;
        }

        public Criteria andBindAccNumIn(List<String> values) {
            addCriterion("bind_acc_num in", values, "bindAccNum");
            return (Criteria) this;
        }

        public Criteria andBindAccNumNotIn(List<String> values) {
            addCriterion("bind_acc_num not in", values, "bindAccNum");
            return (Criteria) this;
        }

        public Criteria andBindAccNumBetween(String value1, String value2) {
            addCriterion("bind_acc_num between", value1, value2, "bindAccNum");
            return (Criteria) this;
        }

        public Criteria andBindAccNumNotBetween(String value1, String value2) {
            addCriterion("bind_acc_num not between", value1, value2, "bindAccNum");
            return (Criteria) this;
        }

        public Criteria andBindAccNameIsNull() {
            addCriterion("bind_acc_name is null");
            return (Criteria) this;
        }

        public Criteria andBindAccNameIsNotNull() {
            addCriterion("bind_acc_name is not null");
            return (Criteria) this;
        }

        public Criteria andBindAccNameEqualTo(String value) {
            addCriterion("bind_acc_name =", value, "bindAccName");
            return (Criteria) this;
        }

        public Criteria andBindAccNameNotEqualTo(String value) {
            addCriterion("bind_acc_name <>", value, "bindAccName");
            return (Criteria) this;
        }

        public Criteria andBindAccNameGreaterThan(String value) {
            addCriterion("bind_acc_name >", value, "bindAccName");
            return (Criteria) this;
        }

        public Criteria andBindAccNameGreaterThanOrEqualTo(String value) {
            addCriterion("bind_acc_name >=", value, "bindAccName");
            return (Criteria) this;
        }

        public Criteria andBindAccNameLessThan(String value) {
            addCriterion("bind_acc_name <", value, "bindAccName");
            return (Criteria) this;
        }

        public Criteria andBindAccNameLessThanOrEqualTo(String value) {
            addCriterion("bind_acc_name <=", value, "bindAccName");
            return (Criteria) this;
        }

        public Criteria andBindAccNameLike(String value) {
            addCriterion("bind_acc_name like", value, "bindAccName");
            return (Criteria) this;
        }

        public Criteria andBindAccNameNotLike(String value) {
            addCriterion("bind_acc_name not like", value, "bindAccName");
            return (Criteria) this;
        }

        public Criteria andBindAccNameIn(List<String> values) {
            addCriterion("bind_acc_name in", values, "bindAccName");
            return (Criteria) this;
        }

        public Criteria andBindAccNameNotIn(List<String> values) {
            addCriterion("bind_acc_name not in", values, "bindAccName");
            return (Criteria) this;
        }

        public Criteria andBindAccNameBetween(String value1, String value2) {
            addCriterion("bind_acc_name between", value1, value2, "bindAccName");
            return (Criteria) this;
        }

        public Criteria andBindAccNameNotBetween(String value1, String value2) {
            addCriterion("bind_acc_name not between", value1, value2, "bindAccName");
            return (Criteria) this;
        }

        public Criteria andIsCrossLineIsNull() {
            addCriterion("is_cross_line is null");
            return (Criteria) this;
        }

        public Criteria andIsCrossLineIsNotNull() {
            addCriterion("is_cross_line is not null");
            return (Criteria) this;
        }

        public Criteria andIsCrossLineEqualTo(String value) {
            addCriterion("is_cross_line =", value, "isCrossLine");
            return (Criteria) this;
        }

        public Criteria andIsCrossLineNotEqualTo(String value) {
            addCriterion("is_cross_line <>", value, "isCrossLine");
            return (Criteria) this;
        }

        public Criteria andIsCrossLineGreaterThan(String value) {
            addCriterion("is_cross_line >", value, "isCrossLine");
            return (Criteria) this;
        }

        public Criteria andIsCrossLineGreaterThanOrEqualTo(String value) {
            addCriterion("is_cross_line >=", value, "isCrossLine");
            return (Criteria) this;
        }

        public Criteria andIsCrossLineLessThan(String value) {
            addCriterion("is_cross_line <", value, "isCrossLine");
            return (Criteria) this;
        }

        public Criteria andIsCrossLineLessThanOrEqualTo(String value) {
            addCriterion("is_cross_line <=", value, "isCrossLine");
            return (Criteria) this;
        }

        public Criteria andIsCrossLineLike(String value) {
            addCriterion("is_cross_line like", value, "isCrossLine");
            return (Criteria) this;
        }

        public Criteria andIsCrossLineNotLike(String value) {
            addCriterion("is_cross_line not like", value, "isCrossLine");
            return (Criteria) this;
        }

        public Criteria andIsCrossLineIn(List<String> values) {
            addCriterion("is_cross_line in", values, "isCrossLine");
            return (Criteria) this;
        }

        public Criteria andIsCrossLineNotIn(List<String> values) {
            addCriterion("is_cross_line not in", values, "isCrossLine");
            return (Criteria) this;
        }

        public Criteria andIsCrossLineBetween(String value1, String value2) {
            addCriterion("is_cross_line between", value1, value2, "isCrossLine");
            return (Criteria) this;
        }

        public Criteria andIsCrossLineNotBetween(String value1, String value2) {
            addCriterion("is_cross_line not between", value1, value2, "isCrossLine");
            return (Criteria) this;
        }

        public Criteria andCardStatusIsNull() {
            addCriterion("card_status is null");
            return (Criteria) this;
        }

        public Criteria andCardStatusIsNotNull() {
            addCriterion("card_status is not null");
            return (Criteria) this;
        }

        public Criteria andCardStatusEqualTo(String value) {
            addCriterion("card_status =", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardStatusNotEqualTo(String value) {
            addCriterion("card_status <>", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardStatusGreaterThan(String value) {
            addCriterion("card_status >", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardStatusGreaterThanOrEqualTo(String value) {
            addCriterion("card_status >=", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardStatusLessThan(String value) {
            addCriterion("card_status <", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardStatusLessThanOrEqualTo(String value) {
            addCriterion("card_status <=", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardStatusLike(String value) {
            addCriterion("card_status like", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardStatusNotLike(String value) {
            addCriterion("card_status not like", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardStatusIn(List<String> values) {
            addCriterion("card_status in", values, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardStatusNotIn(List<String> values) {
            addCriterion("card_status not in", values, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardStatusBetween(String value1, String value2) {
            addCriterion("card_status between", value1, value2, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardStatusNotBetween(String value1, String value2) {
            addCriterion("card_status not between", value1, value2, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Long value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Long value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Long value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Long value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Long value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Long> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Long> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Long value1, Long value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Long value1, Long value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
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