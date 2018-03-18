package com.yonyou.scf.common.entity;

import java.util.ArrayList;
import java.util.List;

public class F625Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public F625Example() {
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

        public Criteria andVirAccTypeIsNull() {
            addCriterion("vir_acc_type is null");
            return (Criteria) this;
        }

        public Criteria andVirAccTypeIsNotNull() {
            addCriterion("vir_acc_type is not null");
            return (Criteria) this;
        }

        public Criteria andVirAccTypeEqualTo(String value) {
            addCriterion("vir_acc_type =", value, "virAccType");
            return (Criteria) this;
        }

        public Criteria andVirAccTypeNotEqualTo(String value) {
            addCriterion("vir_acc_type <>", value, "virAccType");
            return (Criteria) this;
        }

        public Criteria andVirAccTypeGreaterThan(String value) {
            addCriterion("vir_acc_type >", value, "virAccType");
            return (Criteria) this;
        }

        public Criteria andVirAccTypeGreaterThanOrEqualTo(String value) {
            addCriterion("vir_acc_type >=", value, "virAccType");
            return (Criteria) this;
        }

        public Criteria andVirAccTypeLessThan(String value) {
            addCriterion("vir_acc_type <", value, "virAccType");
            return (Criteria) this;
        }

        public Criteria andVirAccTypeLessThanOrEqualTo(String value) {
            addCriterion("vir_acc_type <=", value, "virAccType");
            return (Criteria) this;
        }

        public Criteria andVirAccTypeLike(String value) {
            addCriterion("vir_acc_type like", value, "virAccType");
            return (Criteria) this;
        }

        public Criteria andVirAccTypeNotLike(String value) {
            addCriterion("vir_acc_type not like", value, "virAccType");
            return (Criteria) this;
        }

        public Criteria andVirAccTypeIn(List<String> values) {
            addCriterion("vir_acc_type in", values, "virAccType");
            return (Criteria) this;
        }

        public Criteria andVirAccTypeNotIn(List<String> values) {
            addCriterion("vir_acc_type not in", values, "virAccType");
            return (Criteria) this;
        }

        public Criteria andVirAccTypeBetween(String value1, String value2) {
            addCriterion("vir_acc_type between", value1, value2, "virAccType");
            return (Criteria) this;
        }

        public Criteria andVirAccTypeNotBetween(String value1, String value2) {
            addCriterion("vir_acc_type not between", value1, value2, "virAccType");
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

        public Criteria andQueryDateIsNull() {
            addCriterion("query_date is null");
            return (Criteria) this;
        }

        public Criteria andQueryDateIsNotNull() {
            addCriterion("query_date is not null");
            return (Criteria) this;
        }

        public Criteria andQueryDateEqualTo(String value) {
            addCriterion("query_date =", value, "queryDate");
            return (Criteria) this;
        }

        public Criteria andQueryDateNotEqualTo(String value) {
            addCriterion("query_date <>", value, "queryDate");
            return (Criteria) this;
        }

        public Criteria andQueryDateGreaterThan(String value) {
            addCriterion("query_date >", value, "queryDate");
            return (Criteria) this;
        }

        public Criteria andQueryDateGreaterThanOrEqualTo(String value) {
            addCriterion("query_date >=", value, "queryDate");
            return (Criteria) this;
        }

        public Criteria andQueryDateLessThan(String value) {
            addCriterion("query_date <", value, "queryDate");
            return (Criteria) this;
        }

        public Criteria andQueryDateLessThanOrEqualTo(String value) {
            addCriterion("query_date <=", value, "queryDate");
            return (Criteria) this;
        }

        public Criteria andQueryDateLike(String value) {
            addCriterion("query_date like", value, "queryDate");
            return (Criteria) this;
        }

        public Criteria andQueryDateNotLike(String value) {
            addCriterion("query_date not like", value, "queryDate");
            return (Criteria) this;
        }

        public Criteria andQueryDateIn(List<String> values) {
            addCriterion("query_date in", values, "queryDate");
            return (Criteria) this;
        }

        public Criteria andQueryDateNotIn(List<String> values) {
            addCriterion("query_date not in", values, "queryDate");
            return (Criteria) this;
        }

        public Criteria andQueryDateBetween(String value1, String value2) {
            addCriterion("query_date between", value1, value2, "queryDate");
            return (Criteria) this;
        }

        public Criteria andQueryDateNotBetween(String value1, String value2) {
            addCriterion("query_date not between", value1, value2, "queryDate");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(Long value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(Long value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(Long value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(Long value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(Long value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(Long value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<Long> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<Long> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(Long value1, Long value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(Long value1, Long value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andUseableBalanceIsNull() {
            addCriterion("useable_balance is null");
            return (Criteria) this;
        }

        public Criteria andUseableBalanceIsNotNull() {
            addCriterion("useable_balance is not null");
            return (Criteria) this;
        }

        public Criteria andUseableBalanceEqualTo(Long value) {
            addCriterion("useable_balance =", value, "useableBalance");
            return (Criteria) this;
        }

        public Criteria andUseableBalanceNotEqualTo(Long value) {
            addCriterion("useable_balance <>", value, "useableBalance");
            return (Criteria) this;
        }

        public Criteria andUseableBalanceGreaterThan(Long value) {
            addCriterion("useable_balance >", value, "useableBalance");
            return (Criteria) this;
        }

        public Criteria andUseableBalanceGreaterThanOrEqualTo(Long value) {
            addCriterion("useable_balance >=", value, "useableBalance");
            return (Criteria) this;
        }

        public Criteria andUseableBalanceLessThan(Long value) {
            addCriterion("useable_balance <", value, "useableBalance");
            return (Criteria) this;
        }

        public Criteria andUseableBalanceLessThanOrEqualTo(Long value) {
            addCriterion("useable_balance <=", value, "useableBalance");
            return (Criteria) this;
        }

        public Criteria andUseableBalanceIn(List<Long> values) {
            addCriterion("useable_balance in", values, "useableBalance");
            return (Criteria) this;
        }

        public Criteria andUseableBalanceNotIn(List<Long> values) {
            addCriterion("useable_balance not in", values, "useableBalance");
            return (Criteria) this;
        }

        public Criteria andUseableBalanceBetween(Long value1, Long value2) {
            addCriterion("useable_balance between", value1, value2, "useableBalance");
            return (Criteria) this;
        }

        public Criteria andUseableBalanceNotBetween(Long value1, Long value2) {
            addCriterion("useable_balance not between", value1, value2, "useableBalance");
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