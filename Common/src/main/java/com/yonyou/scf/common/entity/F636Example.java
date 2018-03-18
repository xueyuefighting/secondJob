package com.yonyou.scf.common.entity;

import java.util.ArrayList;
import java.util.List;

public class F636Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public F636Example() {
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

        public Criteria andFeeTypeIsNull() {
            addCriterion("fee_type is null");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIsNotNull() {
            addCriterion("fee_type is not null");
            return (Criteria) this;
        }

        public Criteria andFeeTypeEqualTo(String value) {
            addCriterion("fee_type =", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotEqualTo(String value) {
            addCriterion("fee_type <>", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeGreaterThan(String value) {
            addCriterion("fee_type >", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("fee_type >=", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLessThan(String value) {
            addCriterion("fee_type <", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLessThanOrEqualTo(String value) {
            addCriterion("fee_type <=", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLike(String value) {
            addCriterion("fee_type like", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotLike(String value) {
            addCriterion("fee_type not like", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIn(List<String> values) {
            addCriterion("fee_type in", values, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotIn(List<String> values) {
            addCriterion("fee_type not in", values, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeBetween(String value1, String value2) {
            addCriterion("fee_type between", value1, value2, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotBetween(String value1, String value2) {
            addCriterion("fee_type not between", value1, value2, "feeType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionIsNull() {
            addCriterion("prescription is null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionIsNotNull() {
            addCriterion("prescription is not null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionEqualTo(String value) {
            addCriterion("prescription =", value, "prescription");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNotEqualTo(String value) {
            addCriterion("prescription <>", value, "prescription");
            return (Criteria) this;
        }

        public Criteria andPrescriptionGreaterThan(String value) {
            addCriterion("prescription >", value, "prescription");
            return (Criteria) this;
        }

        public Criteria andPrescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("prescription >=", value, "prescription");
            return (Criteria) this;
        }

        public Criteria andPrescriptionLessThan(String value) {
            addCriterion("prescription <", value, "prescription");
            return (Criteria) this;
        }

        public Criteria andPrescriptionLessThanOrEqualTo(String value) {
            addCriterion("prescription <=", value, "prescription");
            return (Criteria) this;
        }

        public Criteria andPrescriptionLike(String value) {
            addCriterion("prescription like", value, "prescription");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNotLike(String value) {
            addCriterion("prescription not like", value, "prescription");
            return (Criteria) this;
        }

        public Criteria andPrescriptionIn(List<String> values) {
            addCriterion("prescription in", values, "prescription");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNotIn(List<String> values) {
            addCriterion("prescription not in", values, "prescription");
            return (Criteria) this;
        }

        public Criteria andPrescriptionBetween(String value1, String value2) {
            addCriterion("prescription between", value1, value2, "prescription");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNotBetween(String value1, String value2) {
            addCriterion("prescription not between", value1, value2, "prescription");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andFeeModelIsNull() {
            addCriterion("fee_model is null");
            return (Criteria) this;
        }

        public Criteria andFeeModelIsNotNull() {
            addCriterion("fee_model is not null");
            return (Criteria) this;
        }

        public Criteria andFeeModelEqualTo(String value) {
            addCriterion("fee_model =", value, "feeModel");
            return (Criteria) this;
        }

        public Criteria andFeeModelNotEqualTo(String value) {
            addCriterion("fee_model <>", value, "feeModel");
            return (Criteria) this;
        }

        public Criteria andFeeModelGreaterThan(String value) {
            addCriterion("fee_model >", value, "feeModel");
            return (Criteria) this;
        }

        public Criteria andFeeModelGreaterThanOrEqualTo(String value) {
            addCriterion("fee_model >=", value, "feeModel");
            return (Criteria) this;
        }

        public Criteria andFeeModelLessThan(String value) {
            addCriterion("fee_model <", value, "feeModel");
            return (Criteria) this;
        }

        public Criteria andFeeModelLessThanOrEqualTo(String value) {
            addCriterion("fee_model <=", value, "feeModel");
            return (Criteria) this;
        }

        public Criteria andFeeModelLike(String value) {
            addCriterion("fee_model like", value, "feeModel");
            return (Criteria) this;
        }

        public Criteria andFeeModelNotLike(String value) {
            addCriterion("fee_model not like", value, "feeModel");
            return (Criteria) this;
        }

        public Criteria andFeeModelIn(List<String> values) {
            addCriterion("fee_model in", values, "feeModel");
            return (Criteria) this;
        }

        public Criteria andFeeModelNotIn(List<String> values) {
            addCriterion("fee_model not in", values, "feeModel");
            return (Criteria) this;
        }

        public Criteria andFeeModelBetween(String value1, String value2) {
            addCriterion("fee_model between", value1, value2, "feeModel");
            return (Criteria) this;
        }

        public Criteria andFeeModelNotBetween(String value1, String value2) {
            addCriterion("fee_model not between", value1, value2, "feeModel");
            return (Criteria) this;
        }

        public Criteria andMoneyAmountIsNull() {
            addCriterion("money_amount is null");
            return (Criteria) this;
        }

        public Criteria andMoneyAmountIsNotNull() {
            addCriterion("money_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyAmountEqualTo(Long value) {
            addCriterion("money_amount =", value, "moneyAmount");
            return (Criteria) this;
        }

        public Criteria andMoneyAmountNotEqualTo(Long value) {
            addCriterion("money_amount <>", value, "moneyAmount");
            return (Criteria) this;
        }

        public Criteria andMoneyAmountGreaterThan(Long value) {
            addCriterion("money_amount >", value, "moneyAmount");
            return (Criteria) this;
        }

        public Criteria andMoneyAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("money_amount >=", value, "moneyAmount");
            return (Criteria) this;
        }

        public Criteria andMoneyAmountLessThan(Long value) {
            addCriterion("money_amount <", value, "moneyAmount");
            return (Criteria) this;
        }

        public Criteria andMoneyAmountLessThanOrEqualTo(Long value) {
            addCriterion("money_amount <=", value, "moneyAmount");
            return (Criteria) this;
        }

        public Criteria andMoneyAmountIn(List<Long> values) {
            addCriterion("money_amount in", values, "moneyAmount");
            return (Criteria) this;
        }

        public Criteria andMoneyAmountNotIn(List<Long> values) {
            addCriterion("money_amount not in", values, "moneyAmount");
            return (Criteria) this;
        }

        public Criteria andMoneyAmountBetween(Long value1, Long value2) {
            addCriterion("money_amount between", value1, value2, "moneyAmount");
            return (Criteria) this;
        }

        public Criteria andMoneyAmountNotBetween(Long value1, Long value2) {
            addCriterion("money_amount not between", value1, value2, "moneyAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountIsNull() {
            addCriterion("fee_amount is null");
            return (Criteria) this;
        }

        public Criteria andFeeAmountIsNotNull() {
            addCriterion("fee_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFeeAmountEqualTo(Long value) {
            addCriterion("fee_amount =", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountNotEqualTo(Long value) {
            addCriterion("fee_amount <>", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountGreaterThan(Long value) {
            addCriterion("fee_amount >", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("fee_amount >=", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountLessThan(Long value) {
            addCriterion("fee_amount <", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountLessThanOrEqualTo(Long value) {
            addCriterion("fee_amount <=", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountIn(List<Long> values) {
            addCriterion("fee_amount in", values, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountNotIn(List<Long> values) {
            addCriterion("fee_amount not in", values, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountBetween(Long value1, Long value2) {
            addCriterion("fee_amount between", value1, value2, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountNotBetween(Long value1, Long value2) {
            addCriterion("fee_amount not between", value1, value2, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeNoIsNull() {
            addCriterion("fee_no is null");
            return (Criteria) this;
        }

        public Criteria andFeeNoIsNotNull() {
            addCriterion("fee_no is not null");
            return (Criteria) this;
        }

        public Criteria andFeeNoEqualTo(String value) {
            addCriterion("fee_no =", value, "feeNo");
            return (Criteria) this;
        }

        public Criteria andFeeNoNotEqualTo(String value) {
            addCriterion("fee_no <>", value, "feeNo");
            return (Criteria) this;
        }

        public Criteria andFeeNoGreaterThan(String value) {
            addCriterion("fee_no >", value, "feeNo");
            return (Criteria) this;
        }

        public Criteria andFeeNoGreaterThanOrEqualTo(String value) {
            addCriterion("fee_no >=", value, "feeNo");
            return (Criteria) this;
        }

        public Criteria andFeeNoLessThan(String value) {
            addCriterion("fee_no <", value, "feeNo");
            return (Criteria) this;
        }

        public Criteria andFeeNoLessThanOrEqualTo(String value) {
            addCriterion("fee_no <=", value, "feeNo");
            return (Criteria) this;
        }

        public Criteria andFeeNoLike(String value) {
            addCriterion("fee_no like", value, "feeNo");
            return (Criteria) this;
        }

        public Criteria andFeeNoNotLike(String value) {
            addCriterion("fee_no not like", value, "feeNo");
            return (Criteria) this;
        }

        public Criteria andFeeNoIn(List<String> values) {
            addCriterion("fee_no in", values, "feeNo");
            return (Criteria) this;
        }

        public Criteria andFeeNoNotIn(List<String> values) {
            addCriterion("fee_no not in", values, "feeNo");
            return (Criteria) this;
        }

        public Criteria andFeeNoBetween(String value1, String value2) {
            addCriterion("fee_no between", value1, value2, "feeNo");
            return (Criteria) this;
        }

        public Criteria andFeeNoNotBetween(String value1, String value2) {
            addCriterion("fee_no not between", value1, value2, "feeNo");
            return (Criteria) this;
        }

        public Criteria andPtwdhIsNull() {
            addCriterion("ptwdh is null");
            return (Criteria) this;
        }

        public Criteria andPtwdhIsNotNull() {
            addCriterion("ptwdh is not null");
            return (Criteria) this;
        }

        public Criteria andPtwdhEqualTo(String value) {
            addCriterion("ptwdh =", value, "ptwdh");
            return (Criteria) this;
        }

        public Criteria andPtwdhNotEqualTo(String value) {
            addCriterion("ptwdh <>", value, "ptwdh");
            return (Criteria) this;
        }

        public Criteria andPtwdhGreaterThan(String value) {
            addCriterion("ptwdh >", value, "ptwdh");
            return (Criteria) this;
        }

        public Criteria andPtwdhGreaterThanOrEqualTo(String value) {
            addCriterion("ptwdh >=", value, "ptwdh");
            return (Criteria) this;
        }

        public Criteria andPtwdhLessThan(String value) {
            addCriterion("ptwdh <", value, "ptwdh");
            return (Criteria) this;
        }

        public Criteria andPtwdhLessThanOrEqualTo(String value) {
            addCriterion("ptwdh <=", value, "ptwdh");
            return (Criteria) this;
        }

        public Criteria andPtwdhLike(String value) {
            addCriterion("ptwdh like", value, "ptwdh");
            return (Criteria) this;
        }

        public Criteria andPtwdhNotLike(String value) {
            addCriterion("ptwdh not like", value, "ptwdh");
            return (Criteria) this;
        }

        public Criteria andPtwdhIn(List<String> values) {
            addCriterion("ptwdh in", values, "ptwdh");
            return (Criteria) this;
        }

        public Criteria andPtwdhNotIn(List<String> values) {
            addCriterion("ptwdh not in", values, "ptwdh");
            return (Criteria) this;
        }

        public Criteria andPtwdhBetween(String value1, String value2) {
            addCriterion("ptwdh between", value1, value2, "ptwdh");
            return (Criteria) this;
        }

        public Criteria andPtwdhNotBetween(String value1, String value2) {
            addCriterion("ptwdh not between", value1, value2, "ptwdh");
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

        public Criteria andRoleTypeIsNull() {
            addCriterion("role_type is null");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIsNotNull() {
            addCriterion("role_type is not null");
            return (Criteria) this;
        }

        public Criteria andRoleTypeEqualTo(String value) {
            addCriterion("role_type =", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotEqualTo(String value) {
            addCriterion("role_type <>", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeGreaterThan(String value) {
            addCriterion("role_type >", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("role_type >=", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeLessThan(String value) {
            addCriterion("role_type <", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeLessThanOrEqualTo(String value) {
            addCriterion("role_type <=", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeLike(String value) {
            addCriterion("role_type like", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotLike(String value) {
            addCriterion("role_type not like", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIn(List<String> values) {
            addCriterion("role_type in", values, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotIn(List<String> values) {
            addCriterion("role_type not in", values, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeBetween(String value1, String value2) {
            addCriterion("role_type between", value1, value2, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotBetween(String value1, String value2) {
            addCriterion("role_type not between", value1, value2, "roleType");
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