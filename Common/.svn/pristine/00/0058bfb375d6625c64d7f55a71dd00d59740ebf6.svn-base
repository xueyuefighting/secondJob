package com.yonyou.scf.common.entity;

import java.util.ArrayList;
import java.util.List;

public class IouInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IouInfoExample() {
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

        public Criteria andIouDateIsNull() {
            addCriterion("iou_date is null");
            return (Criteria) this;
        }

        public Criteria andIouDateIsNotNull() {
            addCriterion("iou_date is not null");
            return (Criteria) this;
        }

        public Criteria andIouDateEqualTo(String value) {
            addCriterion("iou_date =", value, "iouDate");
            return (Criteria) this;
        }

        public Criteria andIouDateNotEqualTo(String value) {
            addCriterion("iou_date <>", value, "iouDate");
            return (Criteria) this;
        }

        public Criteria andIouDateGreaterThan(String value) {
            addCriterion("iou_date >", value, "iouDate");
            return (Criteria) this;
        }

        public Criteria andIouDateGreaterThanOrEqualTo(String value) {
            addCriterion("iou_date >=", value, "iouDate");
            return (Criteria) this;
        }

        public Criteria andIouDateLessThan(String value) {
            addCriterion("iou_date <", value, "iouDate");
            return (Criteria) this;
        }

        public Criteria andIouDateLessThanOrEqualTo(String value) {
            addCriterion("iou_date <=", value, "iouDate");
            return (Criteria) this;
        }

        public Criteria andIouDateLike(String value) {
            addCriterion("iou_date like", value, "iouDate");
            return (Criteria) this;
        }

        public Criteria andIouDateNotLike(String value) {
            addCriterion("iou_date not like", value, "iouDate");
            return (Criteria) this;
        }

        public Criteria andIouDateIn(List<String> values) {
            addCriterion("iou_date in", values, "iouDate");
            return (Criteria) this;
        }

        public Criteria andIouDateNotIn(List<String> values) {
            addCriterion("iou_date not in", values, "iouDate");
            return (Criteria) this;
        }

        public Criteria andIouDateBetween(String value1, String value2) {
            addCriterion("iou_date between", value1, value2, "iouDate");
            return (Criteria) this;
        }

        public Criteria andIouDateNotBetween(String value1, String value2) {
            addCriterion("iou_date not between", value1, value2, "iouDate");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("account_name is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("account_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("account_name =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("account_name <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("account_name >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("account_name >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("account_name <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("account_name <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("account_name like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("account_name not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("account_name in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("account_name not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("account_name between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("account_name not between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountCodeIsNull() {
            addCriterion("account_code is null");
            return (Criteria) this;
        }

        public Criteria andAccountCodeIsNotNull() {
            addCriterion("account_code is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCodeEqualTo(String value) {
            addCriterion("account_code =", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeNotEqualTo(String value) {
            addCriterion("account_code <>", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeGreaterThan(String value) {
            addCriterion("account_code >", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeGreaterThanOrEqualTo(String value) {
            addCriterion("account_code >=", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeLessThan(String value) {
            addCriterion("account_code <", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeLessThanOrEqualTo(String value) {
            addCriterion("account_code <=", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeLike(String value) {
            addCriterion("account_code like", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeNotLike(String value) {
            addCriterion("account_code not like", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeIn(List<String> values) {
            addCriterion("account_code in", values, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeNotIn(List<String> values) {
            addCriterion("account_code not in", values, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeBetween(String value1, String value2) {
            addCriterion("account_code between", value1, value2, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeNotBetween(String value1, String value2) {
            addCriterion("account_code not between", value1, value2, "accountCode");
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

        public Criteria andLoadAmountIsNull() {
            addCriterion("load_amount is null");
            return (Criteria) this;
        }

        public Criteria andLoadAmountIsNotNull() {
            addCriterion("load_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLoadAmountEqualTo(Long value) {
            addCriterion("load_amount =", value, "loadAmount");
            return (Criteria) this;
        }

        public Criteria andLoadAmountNotEqualTo(Long value) {
            addCriterion("load_amount <>", value, "loadAmount");
            return (Criteria) this;
        }

        public Criteria andLoadAmountGreaterThan(Long value) {
            addCriterion("load_amount >", value, "loadAmount");
            return (Criteria) this;
        }

        public Criteria andLoadAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("load_amount >=", value, "loadAmount");
            return (Criteria) this;
        }

        public Criteria andLoadAmountLessThan(Long value) {
            addCriterion("load_amount <", value, "loadAmount");
            return (Criteria) this;
        }

        public Criteria andLoadAmountLessThanOrEqualTo(Long value) {
            addCriterion("load_amount <=", value, "loadAmount");
            return (Criteria) this;
        }

        public Criteria andLoadAmountIn(List<Long> values) {
            addCriterion("load_amount in", values, "loadAmount");
            return (Criteria) this;
        }

        public Criteria andLoadAmountNotIn(List<Long> values) {
            addCriterion("load_amount not in", values, "loadAmount");
            return (Criteria) this;
        }

        public Criteria andLoadAmountBetween(Long value1, Long value2) {
            addCriterion("load_amount between", value1, value2, "loadAmount");
            return (Criteria) this;
        }

        public Criteria andLoadAmountNotBetween(Long value1, Long value2) {
            addCriterion("load_amount not between", value1, value2, "loadAmount");
            return (Criteria) this;
        }

        public Criteria andGiveAmountIsNull() {
            addCriterion("give_amount is null");
            return (Criteria) this;
        }

        public Criteria andGiveAmountIsNotNull() {
            addCriterion("give_amount is not null");
            return (Criteria) this;
        }

        public Criteria andGiveAmountEqualTo(Long value) {
            addCriterion("give_amount =", value, "giveAmount");
            return (Criteria) this;
        }

        public Criteria andGiveAmountNotEqualTo(Long value) {
            addCriterion("give_amount <>", value, "giveAmount");
            return (Criteria) this;
        }

        public Criteria andGiveAmountGreaterThan(Long value) {
            addCriterion("give_amount >", value, "giveAmount");
            return (Criteria) this;
        }

        public Criteria andGiveAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("give_amount >=", value, "giveAmount");
            return (Criteria) this;
        }

        public Criteria andGiveAmountLessThan(Long value) {
            addCriterion("give_amount <", value, "giveAmount");
            return (Criteria) this;
        }

        public Criteria andGiveAmountLessThanOrEqualTo(Long value) {
            addCriterion("give_amount <=", value, "giveAmount");
            return (Criteria) this;
        }

        public Criteria andGiveAmountIn(List<Long> values) {
            addCriterion("give_amount in", values, "giveAmount");
            return (Criteria) this;
        }

        public Criteria andGiveAmountNotIn(List<Long> values) {
            addCriterion("give_amount not in", values, "giveAmount");
            return (Criteria) this;
        }

        public Criteria andGiveAmountBetween(Long value1, Long value2) {
            addCriterion("give_amount between", value1, value2, "giveAmount");
            return (Criteria) this;
        }

        public Criteria andGiveAmountNotBetween(Long value1, Long value2) {
            addCriterion("give_amount not between", value1, value2, "giveAmount");
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

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(String value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(String value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(String value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(String value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(String value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(String value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLike(String value) {
            addCriterion("pay_status like", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotLike(String value) {
            addCriterion("pay_status not like", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<String> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<String> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(String value1, String value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(String value1, String value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
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