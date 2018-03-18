package com.yonyou.scf.common.entity;

import java.util.ArrayList;
import java.util.List;

public class F638Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public F638Example() {
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

        public Criteria andBusiNumIsNull() {
            addCriterion("busi_num is null");
            return (Criteria) this;
        }

        public Criteria andBusiNumIsNotNull() {
            addCriterion("busi_num is not null");
            return (Criteria) this;
        }

        public Criteria andBusiNumEqualTo(String value) {
            addCriterion("busi_num =", value, "busiNum");
            return (Criteria) this;
        }

        public Criteria andBusiNumNotEqualTo(String value) {
            addCriterion("busi_num <>", value, "busiNum");
            return (Criteria) this;
        }

        public Criteria andBusiNumGreaterThan(String value) {
            addCriterion("busi_num >", value, "busiNum");
            return (Criteria) this;
        }

        public Criteria andBusiNumGreaterThanOrEqualTo(String value) {
            addCriterion("busi_num >=", value, "busiNum");
            return (Criteria) this;
        }

        public Criteria andBusiNumLessThan(String value) {
            addCriterion("busi_num <", value, "busiNum");
            return (Criteria) this;
        }

        public Criteria andBusiNumLessThanOrEqualTo(String value) {
            addCriterion("busi_num <=", value, "busiNum");
            return (Criteria) this;
        }

        public Criteria andBusiNumLike(String value) {
            addCriterion("busi_num like", value, "busiNum");
            return (Criteria) this;
        }

        public Criteria andBusiNumNotLike(String value) {
            addCriterion("busi_num not like", value, "busiNum");
            return (Criteria) this;
        }

        public Criteria andBusiNumIn(List<String> values) {
            addCriterion("busi_num in", values, "busiNum");
            return (Criteria) this;
        }

        public Criteria andBusiNumNotIn(List<String> values) {
            addCriterion("busi_num not in", values, "busiNum");
            return (Criteria) this;
        }

        public Criteria andBusiNumBetween(String value1, String value2) {
            addCriterion("busi_num between", value1, value2, "busiNum");
            return (Criteria) this;
        }

        public Criteria andBusiNumNotBetween(String value1, String value2) {
            addCriterion("busi_num not between", value1, value2, "busiNum");
            return (Criteria) this;
        }

        public Criteria andMemNumIsNull() {
            addCriterion("mem_num is null");
            return (Criteria) this;
        }

        public Criteria andMemNumIsNotNull() {
            addCriterion("mem_num is not null");
            return (Criteria) this;
        }

        public Criteria andMemNumEqualTo(String value) {
            addCriterion("mem_num =", value, "memNum");
            return (Criteria) this;
        }

        public Criteria andMemNumNotEqualTo(String value) {
            addCriterion("mem_num <>", value, "memNum");
            return (Criteria) this;
        }

        public Criteria andMemNumGreaterThan(String value) {
            addCriterion("mem_num >", value, "memNum");
            return (Criteria) this;
        }

        public Criteria andMemNumGreaterThanOrEqualTo(String value) {
            addCriterion("mem_num >=", value, "memNum");
            return (Criteria) this;
        }

        public Criteria andMemNumLessThan(String value) {
            addCriterion("mem_num <", value, "memNum");
            return (Criteria) this;
        }

        public Criteria andMemNumLessThanOrEqualTo(String value) {
            addCriterion("mem_num <=", value, "memNum");
            return (Criteria) this;
        }

        public Criteria andMemNumLike(String value) {
            addCriterion("mem_num like", value, "memNum");
            return (Criteria) this;
        }

        public Criteria andMemNumNotLike(String value) {
            addCriterion("mem_num not like", value, "memNum");
            return (Criteria) this;
        }

        public Criteria andMemNumIn(List<String> values) {
            addCriterion("mem_num in", values, "memNum");
            return (Criteria) this;
        }

        public Criteria andMemNumNotIn(List<String> values) {
            addCriterion("mem_num not in", values, "memNum");
            return (Criteria) this;
        }

        public Criteria andMemNumBetween(String value1, String value2) {
            addCriterion("mem_num between", value1, value2, "memNum");
            return (Criteria) this;
        }

        public Criteria andMemNumNotBetween(String value1, String value2) {
            addCriterion("mem_num not between", value1, value2, "memNum");
            return (Criteria) this;
        }

        public Criteria andFcsSerialNumIsNull() {
            addCriterion("fcs_serial_num is null");
            return (Criteria) this;
        }

        public Criteria andFcsSerialNumIsNotNull() {
            addCriterion("fcs_serial_num is not null");
            return (Criteria) this;
        }

        public Criteria andFcsSerialNumEqualTo(String value) {
            addCriterion("fcs_serial_num =", value, "fcsSerialNum");
            return (Criteria) this;
        }

        public Criteria andFcsSerialNumNotEqualTo(String value) {
            addCriterion("fcs_serial_num <>", value, "fcsSerialNum");
            return (Criteria) this;
        }

        public Criteria andFcsSerialNumGreaterThan(String value) {
            addCriterion("fcs_serial_num >", value, "fcsSerialNum");
            return (Criteria) this;
        }

        public Criteria andFcsSerialNumGreaterThanOrEqualTo(String value) {
            addCriterion("fcs_serial_num >=", value, "fcsSerialNum");
            return (Criteria) this;
        }

        public Criteria andFcsSerialNumLessThan(String value) {
            addCriterion("fcs_serial_num <", value, "fcsSerialNum");
            return (Criteria) this;
        }

        public Criteria andFcsSerialNumLessThanOrEqualTo(String value) {
            addCriterion("fcs_serial_num <=", value, "fcsSerialNum");
            return (Criteria) this;
        }

        public Criteria andFcsSerialNumLike(String value) {
            addCriterion("fcs_serial_num like", value, "fcsSerialNum");
            return (Criteria) this;
        }

        public Criteria andFcsSerialNumNotLike(String value) {
            addCriterion("fcs_serial_num not like", value, "fcsSerialNum");
            return (Criteria) this;
        }

        public Criteria andFcsSerialNumIn(List<String> values) {
            addCriterion("fcs_serial_num in", values, "fcsSerialNum");
            return (Criteria) this;
        }

        public Criteria andFcsSerialNumNotIn(List<String> values) {
            addCriterion("fcs_serial_num not in", values, "fcsSerialNum");
            return (Criteria) this;
        }

        public Criteria andFcsSerialNumBetween(String value1, String value2) {
            addCriterion("fcs_serial_num between", value1, value2, "fcsSerialNum");
            return (Criteria) this;
        }

        public Criteria andFcsSerialNumNotBetween(String value1, String value2) {
            addCriterion("fcs_serial_num not between", value1, value2, "fcsSerialNum");
            return (Criteria) this;
        }

        public Criteria andBusiSerialNumIsNull() {
            addCriterion("busi_serial_num is null");
            return (Criteria) this;
        }

        public Criteria andBusiSerialNumIsNotNull() {
            addCriterion("busi_serial_num is not null");
            return (Criteria) this;
        }

        public Criteria andBusiSerialNumEqualTo(String value) {
            addCriterion("busi_serial_num =", value, "busiSerialNum");
            return (Criteria) this;
        }

        public Criteria andBusiSerialNumNotEqualTo(String value) {
            addCriterion("busi_serial_num <>", value, "busiSerialNum");
            return (Criteria) this;
        }

        public Criteria andBusiSerialNumGreaterThan(String value) {
            addCriterion("busi_serial_num >", value, "busiSerialNum");
            return (Criteria) this;
        }

        public Criteria andBusiSerialNumGreaterThanOrEqualTo(String value) {
            addCriterion("busi_serial_num >=", value, "busiSerialNum");
            return (Criteria) this;
        }

        public Criteria andBusiSerialNumLessThan(String value) {
            addCriterion("busi_serial_num <", value, "busiSerialNum");
            return (Criteria) this;
        }

        public Criteria andBusiSerialNumLessThanOrEqualTo(String value) {
            addCriterion("busi_serial_num <=", value, "busiSerialNum");
            return (Criteria) this;
        }

        public Criteria andBusiSerialNumLike(String value) {
            addCriterion("busi_serial_num like", value, "busiSerialNum");
            return (Criteria) this;
        }

        public Criteria andBusiSerialNumNotLike(String value) {
            addCriterion("busi_serial_num not like", value, "busiSerialNum");
            return (Criteria) this;
        }

        public Criteria andBusiSerialNumIn(List<String> values) {
            addCriterion("busi_serial_num in", values, "busiSerialNum");
            return (Criteria) this;
        }

        public Criteria andBusiSerialNumNotIn(List<String> values) {
            addCriterion("busi_serial_num not in", values, "busiSerialNum");
            return (Criteria) this;
        }

        public Criteria andBusiSerialNumBetween(String value1, String value2) {
            addCriterion("busi_serial_num between", value1, value2, "busiSerialNum");
            return (Criteria) this;
        }

        public Criteria andBusiSerialNumNotBetween(String value1, String value2) {
            addCriterion("busi_serial_num not between", value1, value2, "busiSerialNum");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIsNull() {
            addCriterion("repayment_type is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIsNotNull() {
            addCriterion("repayment_type is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeEqualTo(String value) {
            addCriterion("repayment_type =", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeNotEqualTo(String value) {
            addCriterion("repayment_type <>", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeGreaterThan(String value) {
            addCriterion("repayment_type >", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("repayment_type >=", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeLessThan(String value) {
            addCriterion("repayment_type <", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeLessThanOrEqualTo(String value) {
            addCriterion("repayment_type <=", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeLike(String value) {
            addCriterion("repayment_type like", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeNotLike(String value) {
            addCriterion("repayment_type not like", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIn(List<String> values) {
            addCriterion("repayment_type in", values, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeNotIn(List<String> values) {
            addCriterion("repayment_type not in", values, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeBetween(String value1, String value2) {
            addCriterion("repayment_type between", value1, value2, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeNotBetween(String value1, String value2) {
            addCriterion("repayment_type not between", value1, value2, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentModeIsNull() {
            addCriterion("repayment_mode is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentModeIsNotNull() {
            addCriterion("repayment_mode is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentModeEqualTo(String value) {
            addCriterion("repayment_mode =", value, "repaymentMode");
            return (Criteria) this;
        }

        public Criteria andRepaymentModeNotEqualTo(String value) {
            addCriterion("repayment_mode <>", value, "repaymentMode");
            return (Criteria) this;
        }

        public Criteria andRepaymentModeGreaterThan(String value) {
            addCriterion("repayment_mode >", value, "repaymentMode");
            return (Criteria) this;
        }

        public Criteria andRepaymentModeGreaterThanOrEqualTo(String value) {
            addCriterion("repayment_mode >=", value, "repaymentMode");
            return (Criteria) this;
        }

        public Criteria andRepaymentModeLessThan(String value) {
            addCriterion("repayment_mode <", value, "repaymentMode");
            return (Criteria) this;
        }

        public Criteria andRepaymentModeLessThanOrEqualTo(String value) {
            addCriterion("repayment_mode <=", value, "repaymentMode");
            return (Criteria) this;
        }

        public Criteria andRepaymentModeLike(String value) {
            addCriterion("repayment_mode like", value, "repaymentMode");
            return (Criteria) this;
        }

        public Criteria andRepaymentModeNotLike(String value) {
            addCriterion("repayment_mode not like", value, "repaymentMode");
            return (Criteria) this;
        }

        public Criteria andRepaymentModeIn(List<String> values) {
            addCriterion("repayment_mode in", values, "repaymentMode");
            return (Criteria) this;
        }

        public Criteria andRepaymentModeNotIn(List<String> values) {
            addCriterion("repayment_mode not in", values, "repaymentMode");
            return (Criteria) this;
        }

        public Criteria andRepaymentModeBetween(String value1, String value2) {
            addCriterion("repayment_mode between", value1, value2, "repaymentMode");
            return (Criteria) this;
        }

        public Criteria andRepaymentModeNotBetween(String value1, String value2) {
            addCriterion("repayment_mode not between", value1, value2, "repaymentMode");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Long value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Long value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Long value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Long value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Long value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Long> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Long> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Long value1, Long value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Long value1, Long value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andYsqianxiIsNull() {
            addCriterion("ysqianxi is null");
            return (Criteria) this;
        }

        public Criteria andYsqianxiIsNotNull() {
            addCriterion("ysqianxi is not null");
            return (Criteria) this;
        }

        public Criteria andYsqianxiEqualTo(Long value) {
            addCriterion("ysqianxi =", value, "ysqianxi");
            return (Criteria) this;
        }

        public Criteria andYsqianxiNotEqualTo(Long value) {
            addCriterion("ysqianxi <>", value, "ysqianxi");
            return (Criteria) this;
        }

        public Criteria andYsqianxiGreaterThan(Long value) {
            addCriterion("ysqianxi >", value, "ysqianxi");
            return (Criteria) this;
        }

        public Criteria andYsqianxiGreaterThanOrEqualTo(Long value) {
            addCriterion("ysqianxi >=", value, "ysqianxi");
            return (Criteria) this;
        }

        public Criteria andYsqianxiLessThan(Long value) {
            addCriterion("ysqianxi <", value, "ysqianxi");
            return (Criteria) this;
        }

        public Criteria andYsqianxiLessThanOrEqualTo(Long value) {
            addCriterion("ysqianxi <=", value, "ysqianxi");
            return (Criteria) this;
        }

        public Criteria andYsqianxiIn(List<Long> values) {
            addCriterion("ysqianxi in", values, "ysqianxi");
            return (Criteria) this;
        }

        public Criteria andYsqianxiNotIn(List<Long> values) {
            addCriterion("ysqianxi not in", values, "ysqianxi");
            return (Criteria) this;
        }

        public Criteria andYsqianxiBetween(Long value1, Long value2) {
            addCriterion("ysqianxi between", value1, value2, "ysqianxi");
            return (Criteria) this;
        }

        public Criteria andYsqianxiNotBetween(Long value1, Long value2) {
            addCriterion("ysqianxi not between", value1, value2, "ysqianxi");
            return (Criteria) this;
        }

        public Criteria andFiled1IsNull() {
            addCriterion("filed1 is null");
            return (Criteria) this;
        }

        public Criteria andFiled1IsNotNull() {
            addCriterion("filed1 is not null");
            return (Criteria) this;
        }

        public Criteria andFiled1EqualTo(String value) {
            addCriterion("filed1 =", value, "filed1");
            return (Criteria) this;
        }

        public Criteria andFiled1NotEqualTo(String value) {
            addCriterion("filed1 <>", value, "filed1");
            return (Criteria) this;
        }

        public Criteria andFiled1GreaterThan(String value) {
            addCriterion("filed1 >", value, "filed1");
            return (Criteria) this;
        }

        public Criteria andFiled1GreaterThanOrEqualTo(String value) {
            addCriterion("filed1 >=", value, "filed1");
            return (Criteria) this;
        }

        public Criteria andFiled1LessThan(String value) {
            addCriterion("filed1 <", value, "filed1");
            return (Criteria) this;
        }

        public Criteria andFiled1LessThanOrEqualTo(String value) {
            addCriterion("filed1 <=", value, "filed1");
            return (Criteria) this;
        }

        public Criteria andFiled1Like(String value) {
            addCriterion("filed1 like", value, "filed1");
            return (Criteria) this;
        }

        public Criteria andFiled1NotLike(String value) {
            addCriterion("filed1 not like", value, "filed1");
            return (Criteria) this;
        }

        public Criteria andFiled1In(List<String> values) {
            addCriterion("filed1 in", values, "filed1");
            return (Criteria) this;
        }

        public Criteria andFiled1NotIn(List<String> values) {
            addCriterion("filed1 not in", values, "filed1");
            return (Criteria) this;
        }

        public Criteria andFiled1Between(String value1, String value2) {
            addCriterion("filed1 between", value1, value2, "filed1");
            return (Criteria) this;
        }

        public Criteria andFiled1NotBetween(String value1, String value2) {
            addCriterion("filed1 not between", value1, value2, "filed1");
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

        public Criteria andDebitInterestIsNull() {
            addCriterion("debit_interest is null");
            return (Criteria) this;
        }

        public Criteria andDebitInterestIsNotNull() {
            addCriterion("debit_interest is not null");
            return (Criteria) this;
        }

        public Criteria andDebitInterestEqualTo(Long value) {
            addCriterion("debit_interest =", value, "debitInterest");
            return (Criteria) this;
        }

        public Criteria andDebitInterestNotEqualTo(Long value) {
            addCriterion("debit_interest <>", value, "debitInterest");
            return (Criteria) this;
        }

        public Criteria andDebitInterestGreaterThan(Long value) {
            addCriterion("debit_interest >", value, "debitInterest");
            return (Criteria) this;
        }

        public Criteria andDebitInterestGreaterThanOrEqualTo(Long value) {
            addCriterion("debit_interest >=", value, "debitInterest");
            return (Criteria) this;
        }

        public Criteria andDebitInterestLessThan(Long value) {
            addCriterion("debit_interest <", value, "debitInterest");
            return (Criteria) this;
        }

        public Criteria andDebitInterestLessThanOrEqualTo(Long value) {
            addCriterion("debit_interest <=", value, "debitInterest");
            return (Criteria) this;
        }

        public Criteria andDebitInterestIn(List<Long> values) {
            addCriterion("debit_interest in", values, "debitInterest");
            return (Criteria) this;
        }

        public Criteria andDebitInterestNotIn(List<Long> values) {
            addCriterion("debit_interest not in", values, "debitInterest");
            return (Criteria) this;
        }

        public Criteria andDebitInterestBetween(Long value1, Long value2) {
            addCriterion("debit_interest between", value1, value2, "debitInterest");
            return (Criteria) this;
        }

        public Criteria andDebitInterestNotBetween(Long value1, Long value2) {
            addCriterion("debit_interest not between", value1, value2, "debitInterest");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterestIsNull() {
            addCriterion("penalty_interest is null");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterestIsNotNull() {
            addCriterion("penalty_interest is not null");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterestEqualTo(Long value) {
            addCriterion("penalty_interest =", value, "penaltyInterest");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterestNotEqualTo(Long value) {
            addCriterion("penalty_interest <>", value, "penaltyInterest");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterestGreaterThan(Long value) {
            addCriterion("penalty_interest >", value, "penaltyInterest");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterestGreaterThanOrEqualTo(Long value) {
            addCriterion("penalty_interest >=", value, "penaltyInterest");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterestLessThan(Long value) {
            addCriterion("penalty_interest <", value, "penaltyInterest");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterestLessThanOrEqualTo(Long value) {
            addCriterion("penalty_interest <=", value, "penaltyInterest");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterestIn(List<Long> values) {
            addCriterion("penalty_interest in", values, "penaltyInterest");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterestNotIn(List<Long> values) {
            addCriterion("penalty_interest not in", values, "penaltyInterest");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterestBetween(Long value1, Long value2) {
            addCriterion("penalty_interest between", value1, value2, "penaltyInterest");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterestNotBetween(Long value1, Long value2) {
            addCriterion("penalty_interest not between", value1, value2, "penaltyInterest");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(Long value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(Long value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(Long value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(Long value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(Long value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(Long value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<Long> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<Long> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(Long value1, Long value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(Long value1, Long value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andResultAmountIsNull() {
            addCriterion("result_amount is null");
            return (Criteria) this;
        }

        public Criteria andResultAmountIsNotNull() {
            addCriterion("result_amount is not null");
            return (Criteria) this;
        }

        public Criteria andResultAmountEqualTo(Long value) {
            addCriterion("result_amount =", value, "resultAmount");
            return (Criteria) this;
        }

        public Criteria andResultAmountNotEqualTo(Long value) {
            addCriterion("result_amount <>", value, "resultAmount");
            return (Criteria) this;
        }

        public Criteria andResultAmountGreaterThan(Long value) {
            addCriterion("result_amount >", value, "resultAmount");
            return (Criteria) this;
        }

        public Criteria andResultAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("result_amount >=", value, "resultAmount");
            return (Criteria) this;
        }

        public Criteria andResultAmountLessThan(Long value) {
            addCriterion("result_amount <", value, "resultAmount");
            return (Criteria) this;
        }

        public Criteria andResultAmountLessThanOrEqualTo(Long value) {
            addCriterion("result_amount <=", value, "resultAmount");
            return (Criteria) this;
        }

        public Criteria andResultAmountIn(List<Long> values) {
            addCriterion("result_amount in", values, "resultAmount");
            return (Criteria) this;
        }

        public Criteria andResultAmountNotIn(List<Long> values) {
            addCriterion("result_amount not in", values, "resultAmount");
            return (Criteria) this;
        }

        public Criteria andResultAmountBetween(Long value1, Long value2) {
            addCriterion("result_amount between", value1, value2, "resultAmount");
            return (Criteria) this;
        }

        public Criteria andResultAmountNotBetween(Long value1, Long value2) {
            addCriterion("result_amount not between", value1, value2, "resultAmount");
            return (Criteria) this;
        }

        public Criteria andPtdwhIsNull() {
            addCriterion("ptdwh is null");
            return (Criteria) this;
        }

        public Criteria andPtdwhIsNotNull() {
            addCriterion("ptdwh is not null");
            return (Criteria) this;
        }

        public Criteria andPtdwhEqualTo(String value) {
            addCriterion("ptdwh =", value, "ptdwh");
            return (Criteria) this;
        }

        public Criteria andPtdwhNotEqualTo(String value) {
            addCriterion("ptdwh <>", value, "ptdwh");
            return (Criteria) this;
        }

        public Criteria andPtdwhGreaterThan(String value) {
            addCriterion("ptdwh >", value, "ptdwh");
            return (Criteria) this;
        }

        public Criteria andPtdwhGreaterThanOrEqualTo(String value) {
            addCriterion("ptdwh >=", value, "ptdwh");
            return (Criteria) this;
        }

        public Criteria andPtdwhLessThan(String value) {
            addCriterion("ptdwh <", value, "ptdwh");
            return (Criteria) this;
        }

        public Criteria andPtdwhLessThanOrEqualTo(String value) {
            addCriterion("ptdwh <=", value, "ptdwh");
            return (Criteria) this;
        }

        public Criteria andPtdwhLike(String value) {
            addCriterion("ptdwh like", value, "ptdwh");
            return (Criteria) this;
        }

        public Criteria andPtdwhNotLike(String value) {
            addCriterion("ptdwh not like", value, "ptdwh");
            return (Criteria) this;
        }

        public Criteria andPtdwhIn(List<String> values) {
            addCriterion("ptdwh in", values, "ptdwh");
            return (Criteria) this;
        }

        public Criteria andPtdwhNotIn(List<String> values) {
            addCriterion("ptdwh not in", values, "ptdwh");
            return (Criteria) this;
        }

        public Criteria andPtdwhBetween(String value1, String value2) {
            addCriterion("ptdwh between", value1, value2, "ptdwh");
            return (Criteria) this;
        }

        public Criteria andPtdwhNotBetween(String value1, String value2) {
            addCriterion("ptdwh not between", value1, value2, "ptdwh");
            return (Criteria) this;
        }

        public Criteria andCuowuxxIsNull() {
            addCriterion("cuowuxx is null");
            return (Criteria) this;
        }

        public Criteria andCuowuxxIsNotNull() {
            addCriterion("cuowuxx is not null");
            return (Criteria) this;
        }

        public Criteria andCuowuxxEqualTo(String value) {
            addCriterion("cuowuxx =", value, "cuowuxx");
            return (Criteria) this;
        }

        public Criteria andCuowuxxNotEqualTo(String value) {
            addCriterion("cuowuxx <>", value, "cuowuxx");
            return (Criteria) this;
        }

        public Criteria andCuowuxxGreaterThan(String value) {
            addCriterion("cuowuxx >", value, "cuowuxx");
            return (Criteria) this;
        }

        public Criteria andCuowuxxGreaterThanOrEqualTo(String value) {
            addCriterion("cuowuxx >=", value, "cuowuxx");
            return (Criteria) this;
        }

        public Criteria andCuowuxxLessThan(String value) {
            addCriterion("cuowuxx <", value, "cuowuxx");
            return (Criteria) this;
        }

        public Criteria andCuowuxxLessThanOrEqualTo(String value) {
            addCriterion("cuowuxx <=", value, "cuowuxx");
            return (Criteria) this;
        }

        public Criteria andCuowuxxLike(String value) {
            addCriterion("cuowuxx like", value, "cuowuxx");
            return (Criteria) this;
        }

        public Criteria andCuowuxxNotLike(String value) {
            addCriterion("cuowuxx not like", value, "cuowuxx");
            return (Criteria) this;
        }

        public Criteria andCuowuxxIn(List<String> values) {
            addCriterion("cuowuxx in", values, "cuowuxx");
            return (Criteria) this;
        }

        public Criteria andCuowuxxNotIn(List<String> values) {
            addCriterion("cuowuxx not in", values, "cuowuxx");
            return (Criteria) this;
        }

        public Criteria andCuowuxxBetween(String value1, String value2) {
            addCriterion("cuowuxx between", value1, value2, "cuowuxx");
            return (Criteria) this;
        }

        public Criteria andCuowuxxNotBetween(String value1, String value2) {
            addCriterion("cuowuxx not between", value1, value2, "cuowuxx");
            return (Criteria) this;
        }

        public Criteria andFinanceidIsNull() {
            addCriterion("financeid is null");
            return (Criteria) this;
        }

        public Criteria andFinanceidIsNotNull() {
            addCriterion("financeid is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceidEqualTo(Long value) {
            addCriterion("financeid =", value, "financeid");
            return (Criteria) this;
        }

        public Criteria andFinanceidNotEqualTo(Long value) {
            addCriterion("financeid <>", value, "financeid");
            return (Criteria) this;
        }

        public Criteria andFinanceidGreaterThan(Long value) {
            addCriterion("financeid >", value, "financeid");
            return (Criteria) this;
        }

        public Criteria andFinanceidGreaterThanOrEqualTo(Long value) {
            addCriterion("financeid >=", value, "financeid");
            return (Criteria) this;
        }

        public Criteria andFinanceidLessThan(Long value) {
            addCriterion("financeid <", value, "financeid");
            return (Criteria) this;
        }

        public Criteria andFinanceidLessThanOrEqualTo(Long value) {
            addCriterion("financeid <=", value, "financeid");
            return (Criteria) this;
        }

        public Criteria andFinanceidIn(List<Long> values) {
            addCriterion("financeid in", values, "financeid");
            return (Criteria) this;
        }

        public Criteria andFinanceidNotIn(List<Long> values) {
            addCriterion("financeid not in", values, "financeid");
            return (Criteria) this;
        }

        public Criteria andFinanceidBetween(Long value1, Long value2) {
            addCriterion("financeid between", value1, value2, "financeid");
            return (Criteria) this;
        }

        public Criteria andFinanceidNotBetween(Long value1, Long value2) {
            addCriterion("financeid not between", value1, value2, "financeid");
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