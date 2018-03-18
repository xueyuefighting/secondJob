package com.yonyou.scf.common.entity;

import java.util.ArrayList;
import java.util.List;

public class F605CardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public F605CardExample() {
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

        public Criteria andF605IdIsNull() {
            addCriterion("f605_id is null");
            return (Criteria) this;
        }

        public Criteria andF605IdIsNotNull() {
            addCriterion("f605_id is not null");
            return (Criteria) this;
        }

        public Criteria andF605IdEqualTo(Long value) {
            addCriterion("f605_id =", value, "f605Id");
            return (Criteria) this;
        }

        public Criteria andF605IdNotEqualTo(Long value) {
            addCriterion("f605_id <>", value, "f605Id");
            return (Criteria) this;
        }

        public Criteria andF605IdGreaterThan(Long value) {
            addCriterion("f605_id >", value, "f605Id");
            return (Criteria) this;
        }

        public Criteria andF605IdGreaterThanOrEqualTo(Long value) {
            addCriterion("f605_id >=", value, "f605Id");
            return (Criteria) this;
        }

        public Criteria andF605IdLessThan(Long value) {
            addCriterion("f605_id <", value, "f605Id");
            return (Criteria) this;
        }

        public Criteria andF605IdLessThanOrEqualTo(Long value) {
            addCriterion("f605_id <=", value, "f605Id");
            return (Criteria) this;
        }

        public Criteria andF605IdIn(List<Long> values) {
            addCriterion("f605_id in", values, "f605Id");
            return (Criteria) this;
        }

        public Criteria andF605IdNotIn(List<Long> values) {
            addCriterion("f605_id not in", values, "f605Id");
            return (Criteria) this;
        }

        public Criteria andF605IdBetween(Long value1, Long value2) {
            addCriterion("f605_id between", value1, value2, "f605Id");
            return (Criteria) this;
        }

        public Criteria andF605IdNotBetween(Long value1, Long value2) {
            addCriterion("f605_id not between", value1, value2, "f605Id");
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

        public Criteria andBindOpenBankNameIsNull() {
            addCriterion("bind_open_bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBindOpenBankNameIsNotNull() {
            addCriterion("bind_open_bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBindOpenBankNameEqualTo(String value) {
            addCriterion("bind_open_bank_name =", value, "bindOpenBankName");
            return (Criteria) this;
        }

        public Criteria andBindOpenBankNameNotEqualTo(String value) {
            addCriterion("bind_open_bank_name <>", value, "bindOpenBankName");
            return (Criteria) this;
        }

        public Criteria andBindOpenBankNameGreaterThan(String value) {
            addCriterion("bind_open_bank_name >", value, "bindOpenBankName");
            return (Criteria) this;
        }

        public Criteria andBindOpenBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bind_open_bank_name >=", value, "bindOpenBankName");
            return (Criteria) this;
        }

        public Criteria andBindOpenBankNameLessThan(String value) {
            addCriterion("bind_open_bank_name <", value, "bindOpenBankName");
            return (Criteria) this;
        }

        public Criteria andBindOpenBankNameLessThanOrEqualTo(String value) {
            addCriterion("bind_open_bank_name <=", value, "bindOpenBankName");
            return (Criteria) this;
        }

        public Criteria andBindOpenBankNameLike(String value) {
            addCriterion("bind_open_bank_name like", value, "bindOpenBankName");
            return (Criteria) this;
        }

        public Criteria andBindOpenBankNameNotLike(String value) {
            addCriterion("bind_open_bank_name not like", value, "bindOpenBankName");
            return (Criteria) this;
        }

        public Criteria andBindOpenBankNameIn(List<String> values) {
            addCriterion("bind_open_bank_name in", values, "bindOpenBankName");
            return (Criteria) this;
        }

        public Criteria andBindOpenBankNameNotIn(List<String> values) {
            addCriterion("bind_open_bank_name not in", values, "bindOpenBankName");
            return (Criteria) this;
        }

        public Criteria andBindOpenBankNameBetween(String value1, String value2) {
            addCriterion("bind_open_bank_name between", value1, value2, "bindOpenBankName");
            return (Criteria) this;
        }

        public Criteria andBindOpenBankNameNotBetween(String value1, String value2) {
            addCriterion("bind_open_bank_name not between", value1, value2, "bindOpenBankName");
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

        public Criteria andOriginBindOpenBankIsNull() {
            addCriterion("origin_bind_open_bank is null");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenBankIsNotNull() {
            addCriterion("origin_bind_open_bank is not null");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenBankEqualTo(String value) {
            addCriterion("origin_bind_open_bank =", value, "originBindOpenBank");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenBankNotEqualTo(String value) {
            addCriterion("origin_bind_open_bank <>", value, "originBindOpenBank");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenBankGreaterThan(String value) {
            addCriterion("origin_bind_open_bank >", value, "originBindOpenBank");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenBankGreaterThanOrEqualTo(String value) {
            addCriterion("origin_bind_open_bank >=", value, "originBindOpenBank");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenBankLessThan(String value) {
            addCriterion("origin_bind_open_bank <", value, "originBindOpenBank");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenBankLessThanOrEqualTo(String value) {
            addCriterion("origin_bind_open_bank <=", value, "originBindOpenBank");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenBankLike(String value) {
            addCriterion("origin_bind_open_bank like", value, "originBindOpenBank");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenBankNotLike(String value) {
            addCriterion("origin_bind_open_bank not like", value, "originBindOpenBank");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenBankIn(List<String> values) {
            addCriterion("origin_bind_open_bank in", values, "originBindOpenBank");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenBankNotIn(List<String> values) {
            addCriterion("origin_bind_open_bank not in", values, "originBindOpenBank");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenBankBetween(String value1, String value2) {
            addCriterion("origin_bind_open_bank between", value1, value2, "originBindOpenBank");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenBankNotBetween(String value1, String value2) {
            addCriterion("origin_bind_open_bank not between", value1, value2, "originBindOpenBank");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenOrgNumIsNull() {
            addCriterion("origin_bind_open_org_num is null");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenOrgNumIsNotNull() {
            addCriterion("origin_bind_open_org_num is not null");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenOrgNumEqualTo(String value) {
            addCriterion("origin_bind_open_org_num =", value, "originBindOpenOrgNum");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenOrgNumNotEqualTo(String value) {
            addCriterion("origin_bind_open_org_num <>", value, "originBindOpenOrgNum");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenOrgNumGreaterThan(String value) {
            addCriterion("origin_bind_open_org_num >", value, "originBindOpenOrgNum");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenOrgNumGreaterThanOrEqualTo(String value) {
            addCriterion("origin_bind_open_org_num >=", value, "originBindOpenOrgNum");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenOrgNumLessThan(String value) {
            addCriterion("origin_bind_open_org_num <", value, "originBindOpenOrgNum");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenOrgNumLessThanOrEqualTo(String value) {
            addCriterion("origin_bind_open_org_num <=", value, "originBindOpenOrgNum");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenOrgNumLike(String value) {
            addCriterion("origin_bind_open_org_num like", value, "originBindOpenOrgNum");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenOrgNumNotLike(String value) {
            addCriterion("origin_bind_open_org_num not like", value, "originBindOpenOrgNum");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenOrgNumIn(List<String> values) {
            addCriterion("origin_bind_open_org_num in", values, "originBindOpenOrgNum");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenOrgNumNotIn(List<String> values) {
            addCriterion("origin_bind_open_org_num not in", values, "originBindOpenOrgNum");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenOrgNumBetween(String value1, String value2) {
            addCriterion("origin_bind_open_org_num between", value1, value2, "originBindOpenOrgNum");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenOrgNumNotBetween(String value1, String value2) {
            addCriterion("origin_bind_open_org_num not between", value1, value2, "originBindOpenOrgNum");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenBankNameIsNull() {
            addCriterion("origin_bind_open_bank_name is null");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenBankNameIsNotNull() {
            addCriterion("origin_bind_open_bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenBankNameEqualTo(String value) {
            addCriterion("origin_bind_open_bank_name =", value, "originBindOpenBankName");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenBankNameNotEqualTo(String value) {
            addCriterion("origin_bind_open_bank_name <>", value, "originBindOpenBankName");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenBankNameGreaterThan(String value) {
            addCriterion("origin_bind_open_bank_name >", value, "originBindOpenBankName");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("origin_bind_open_bank_name >=", value, "originBindOpenBankName");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenBankNameLessThan(String value) {
            addCriterion("origin_bind_open_bank_name <", value, "originBindOpenBankName");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenBankNameLessThanOrEqualTo(String value) {
            addCriterion("origin_bind_open_bank_name <=", value, "originBindOpenBankName");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenBankNameLike(String value) {
            addCriterion("origin_bind_open_bank_name like", value, "originBindOpenBankName");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenBankNameNotLike(String value) {
            addCriterion("origin_bind_open_bank_name not like", value, "originBindOpenBankName");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenBankNameIn(List<String> values) {
            addCriterion("origin_bind_open_bank_name in", values, "originBindOpenBankName");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenBankNameNotIn(List<String> values) {
            addCriterion("origin_bind_open_bank_name not in", values, "originBindOpenBankName");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenBankNameBetween(String value1, String value2) {
            addCriterion("origin_bind_open_bank_name between", value1, value2, "originBindOpenBankName");
            return (Criteria) this;
        }

        public Criteria andOriginBindOpenBankNameNotBetween(String value1, String value2) {
            addCriterion("origin_bind_open_bank_name not between", value1, value2, "originBindOpenBankName");
            return (Criteria) this;
        }

        public Criteria andOriginBindAccNumIsNull() {
            addCriterion("origin_bind_acc_num is null");
            return (Criteria) this;
        }

        public Criteria andOriginBindAccNumIsNotNull() {
            addCriterion("origin_bind_acc_num is not null");
            return (Criteria) this;
        }

        public Criteria andOriginBindAccNumEqualTo(String value) {
            addCriterion("origin_bind_acc_num =", value, "originBindAccNum");
            return (Criteria) this;
        }

        public Criteria andOriginBindAccNumNotEqualTo(String value) {
            addCriterion("origin_bind_acc_num <>", value, "originBindAccNum");
            return (Criteria) this;
        }

        public Criteria andOriginBindAccNumGreaterThan(String value) {
            addCriterion("origin_bind_acc_num >", value, "originBindAccNum");
            return (Criteria) this;
        }

        public Criteria andOriginBindAccNumGreaterThanOrEqualTo(String value) {
            addCriterion("origin_bind_acc_num >=", value, "originBindAccNum");
            return (Criteria) this;
        }

        public Criteria andOriginBindAccNumLessThan(String value) {
            addCriterion("origin_bind_acc_num <", value, "originBindAccNum");
            return (Criteria) this;
        }

        public Criteria andOriginBindAccNumLessThanOrEqualTo(String value) {
            addCriterion("origin_bind_acc_num <=", value, "originBindAccNum");
            return (Criteria) this;
        }

        public Criteria andOriginBindAccNumLike(String value) {
            addCriterion("origin_bind_acc_num like", value, "originBindAccNum");
            return (Criteria) this;
        }

        public Criteria andOriginBindAccNumNotLike(String value) {
            addCriterion("origin_bind_acc_num not like", value, "originBindAccNum");
            return (Criteria) this;
        }

        public Criteria andOriginBindAccNumIn(List<String> values) {
            addCriterion("origin_bind_acc_num in", values, "originBindAccNum");
            return (Criteria) this;
        }

        public Criteria andOriginBindAccNumNotIn(List<String> values) {
            addCriterion("origin_bind_acc_num not in", values, "originBindAccNum");
            return (Criteria) this;
        }

        public Criteria andOriginBindAccNumBetween(String value1, String value2) {
            addCriterion("origin_bind_acc_num between", value1, value2, "originBindAccNum");
            return (Criteria) this;
        }

        public Criteria andOriginBindAccNumNotBetween(String value1, String value2) {
            addCriterion("origin_bind_acc_num not between", value1, value2, "originBindAccNum");
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