package com.yonyou.scf.common.entity;

import java.util.ArrayList;
import java.util.List;

public class ContractAttributeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractAttributeExample() {
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

        public Criteria andContractTypeIsNull() {
            addCriterion("contract_type is null");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNotNull() {
            addCriterion("contract_type is not null");
            return (Criteria) this;
        }

        public Criteria andContractTypeEqualTo(String value) {
            addCriterion("contract_type =", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotEqualTo(String value) {
            addCriterion("contract_type <>", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThan(String value) {
            addCriterion("contract_type >", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThanOrEqualTo(String value) {
            addCriterion("contract_type >=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThan(String value) {
            addCriterion("contract_type <", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThanOrEqualTo(String value) {
            addCriterion("contract_type <=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLike(String value) {
            addCriterion("contract_type like", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotLike(String value) {
            addCriterion("contract_type not like", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeIn(List<String> values) {
            addCriterion("contract_type in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotIn(List<String> values) {
            addCriterion("contract_type not in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeBetween(String value1, String value2) {
            addCriterion("contract_type between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotBetween(String value1, String value2) {
            addCriterion("contract_type not between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractGenerateRuleIsNull() {
            addCriterion("contract_generate_rule is null");
            return (Criteria) this;
        }

        public Criteria andContractGenerateRuleIsNotNull() {
            addCriterion("contract_generate_rule is not null");
            return (Criteria) this;
        }

        public Criteria andContractGenerateRuleEqualTo(String value) {
            addCriterion("contract_generate_rule =", value, "contractGenerateRule");
            return (Criteria) this;
        }

        public Criteria andContractGenerateRuleNotEqualTo(String value) {
            addCriterion("contract_generate_rule <>", value, "contractGenerateRule");
            return (Criteria) this;
        }

        public Criteria andContractGenerateRuleGreaterThan(String value) {
            addCriterion("contract_generate_rule >", value, "contractGenerateRule");
            return (Criteria) this;
        }

        public Criteria andContractGenerateRuleGreaterThanOrEqualTo(String value) {
            addCriterion("contract_generate_rule >=", value, "contractGenerateRule");
            return (Criteria) this;
        }

        public Criteria andContractGenerateRuleLessThan(String value) {
            addCriterion("contract_generate_rule <", value, "contractGenerateRule");
            return (Criteria) this;
        }

        public Criteria andContractGenerateRuleLessThanOrEqualTo(String value) {
            addCriterion("contract_generate_rule <=", value, "contractGenerateRule");
            return (Criteria) this;
        }

        public Criteria andContractGenerateRuleLike(String value) {
            addCriterion("contract_generate_rule like", value, "contractGenerateRule");
            return (Criteria) this;
        }

        public Criteria andContractGenerateRuleNotLike(String value) {
            addCriterion("contract_generate_rule not like", value, "contractGenerateRule");
            return (Criteria) this;
        }

        public Criteria andContractGenerateRuleIn(List<String> values) {
            addCriterion("contract_generate_rule in", values, "contractGenerateRule");
            return (Criteria) this;
        }

        public Criteria andContractGenerateRuleNotIn(List<String> values) {
            addCriterion("contract_generate_rule not in", values, "contractGenerateRule");
            return (Criteria) this;
        }

        public Criteria andContractGenerateRuleBetween(String value1, String value2) {
            addCriterion("contract_generate_rule between", value1, value2, "contractGenerateRule");
            return (Criteria) this;
        }

        public Criteria andContractGenerateRuleNotBetween(String value1, String value2) {
            addCriterion("contract_generate_rule not between", value1, value2, "contractGenerateRule");
            return (Criteria) this;
        }

        public Criteria andMainContractTypeIsNull() {
            addCriterion("main_contract_type is null");
            return (Criteria) this;
        }

        public Criteria andMainContractTypeIsNotNull() {
            addCriterion("main_contract_type is not null");
            return (Criteria) this;
        }

        public Criteria andMainContractTypeEqualTo(String value) {
            addCriterion("main_contract_type =", value, "mainContractType");
            return (Criteria) this;
        }

        public Criteria andMainContractTypeNotEqualTo(String value) {
            addCriterion("main_contract_type <>", value, "mainContractType");
            return (Criteria) this;
        }

        public Criteria andMainContractTypeGreaterThan(String value) {
            addCriterion("main_contract_type >", value, "mainContractType");
            return (Criteria) this;
        }

        public Criteria andMainContractTypeGreaterThanOrEqualTo(String value) {
            addCriterion("main_contract_type >=", value, "mainContractType");
            return (Criteria) this;
        }

        public Criteria andMainContractTypeLessThan(String value) {
            addCriterion("main_contract_type <", value, "mainContractType");
            return (Criteria) this;
        }

        public Criteria andMainContractTypeLessThanOrEqualTo(String value) {
            addCriterion("main_contract_type <=", value, "mainContractType");
            return (Criteria) this;
        }

        public Criteria andMainContractTypeLike(String value) {
            addCriterion("main_contract_type like", value, "mainContractType");
            return (Criteria) this;
        }

        public Criteria andMainContractTypeNotLike(String value) {
            addCriterion("main_contract_type not like", value, "mainContractType");
            return (Criteria) this;
        }

        public Criteria andMainContractTypeIn(List<String> values) {
            addCriterion("main_contract_type in", values, "mainContractType");
            return (Criteria) this;
        }

        public Criteria andMainContractTypeNotIn(List<String> values) {
            addCriterion("main_contract_type not in", values, "mainContractType");
            return (Criteria) this;
        }

        public Criteria andMainContractTypeBetween(String value1, String value2) {
            addCriterion("main_contract_type between", value1, value2, "mainContractType");
            return (Criteria) this;
        }

        public Criteria andMainContractTypeNotBetween(String value1, String value2) {
            addCriterion("main_contract_type not between", value1, value2, "mainContractType");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(String value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(String value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(String value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(String value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(String value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(String value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLike(String value) {
            addCriterion("gmt_create like", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotLike(String value) {
            addCriterion("gmt_create not like", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<String> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<String> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(String value1, String value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(String value1, String value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andCreUserIdIsNull() {
            addCriterion("cre_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreUserIdIsNotNull() {
            addCriterion("cre_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreUserIdEqualTo(Long value) {
            addCriterion("cre_user_id =", value, "creUserId");
            return (Criteria) this;
        }

        public Criteria andCreUserIdNotEqualTo(Long value) {
            addCriterion("cre_user_id <>", value, "creUserId");
            return (Criteria) this;
        }

        public Criteria andCreUserIdGreaterThan(Long value) {
            addCriterion("cre_user_id >", value, "creUserId");
            return (Criteria) this;
        }

        public Criteria andCreUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cre_user_id >=", value, "creUserId");
            return (Criteria) this;
        }

        public Criteria andCreUserIdLessThan(Long value) {
            addCriterion("cre_user_id <", value, "creUserId");
            return (Criteria) this;
        }

        public Criteria andCreUserIdLessThanOrEqualTo(Long value) {
            addCriterion("cre_user_id <=", value, "creUserId");
            return (Criteria) this;
        }

        public Criteria andCreUserIdIn(List<Long> values) {
            addCriterion("cre_user_id in", values, "creUserId");
            return (Criteria) this;
        }

        public Criteria andCreUserIdNotIn(List<Long> values) {
            addCriterion("cre_user_id not in", values, "creUserId");
            return (Criteria) this;
        }

        public Criteria andCreUserIdBetween(Long value1, Long value2) {
            addCriterion("cre_user_id between", value1, value2, "creUserId");
            return (Criteria) this;
        }

        public Criteria andCreUserIdNotBetween(Long value1, Long value2) {
            addCriterion("cre_user_id not between", value1, value2, "creUserId");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(String value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(String value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(String value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(String value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(String value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(String value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLike(String value) {
            addCriterion("gmt_modified like", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotLike(String value) {
            addCriterion("gmt_modified not like", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<String> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<String> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(String value1, String value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(String value1, String value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andModUserIdIsNull() {
            addCriterion("mod_user_id is null");
            return (Criteria) this;
        }

        public Criteria andModUserIdIsNotNull() {
            addCriterion("mod_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andModUserIdEqualTo(Long value) {
            addCriterion("mod_user_id =", value, "modUserId");
            return (Criteria) this;
        }

        public Criteria andModUserIdNotEqualTo(Long value) {
            addCriterion("mod_user_id <>", value, "modUserId");
            return (Criteria) this;
        }

        public Criteria andModUserIdGreaterThan(Long value) {
            addCriterion("mod_user_id >", value, "modUserId");
            return (Criteria) this;
        }

        public Criteria andModUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mod_user_id >=", value, "modUserId");
            return (Criteria) this;
        }

        public Criteria andModUserIdLessThan(Long value) {
            addCriterion("mod_user_id <", value, "modUserId");
            return (Criteria) this;
        }

        public Criteria andModUserIdLessThanOrEqualTo(Long value) {
            addCriterion("mod_user_id <=", value, "modUserId");
            return (Criteria) this;
        }

        public Criteria andModUserIdIn(List<Long> values) {
            addCriterion("mod_user_id in", values, "modUserId");
            return (Criteria) this;
        }

        public Criteria andModUserIdNotIn(List<Long> values) {
            addCriterion("mod_user_id not in", values, "modUserId");
            return (Criteria) this;
        }

        public Criteria andModUserIdBetween(Long value1, Long value2) {
            addCriterion("mod_user_id between", value1, value2, "modUserId");
            return (Criteria) this;
        }

        public Criteria andModUserIdNotBetween(Long value1, Long value2) {
            addCriterion("mod_user_id not between", value1, value2, "modUserId");
            return (Criteria) this;
        }

        public Criteria andSignerNoIsNull() {
            addCriterion("signer_no is null");
            return (Criteria) this;
        }

        public Criteria andSignerNoIsNotNull() {
            addCriterion("signer_no is not null");
            return (Criteria) this;
        }

        public Criteria andSignerNoEqualTo(Integer value) {
            addCriterion("signer_no =", value, "signerNo");
            return (Criteria) this;
        }

        public Criteria andSignerNoNotEqualTo(Integer value) {
            addCriterion("signer_no <>", value, "signerNo");
            return (Criteria) this;
        }

        public Criteria andSignerNoGreaterThan(Integer value) {
            addCriterion("signer_no >", value, "signerNo");
            return (Criteria) this;
        }

        public Criteria andSignerNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("signer_no >=", value, "signerNo");
            return (Criteria) this;
        }

        public Criteria andSignerNoLessThan(Integer value) {
            addCriterion("signer_no <", value, "signerNo");
            return (Criteria) this;
        }

        public Criteria andSignerNoLessThanOrEqualTo(Integer value) {
            addCriterion("signer_no <=", value, "signerNo");
            return (Criteria) this;
        }

        public Criteria andSignerNoIn(List<Integer> values) {
            addCriterion("signer_no in", values, "signerNo");
            return (Criteria) this;
        }

        public Criteria andSignerNoNotIn(List<Integer> values) {
            addCriterion("signer_no not in", values, "signerNo");
            return (Criteria) this;
        }

        public Criteria andSignerNoBetween(Integer value1, Integer value2) {
            addCriterion("signer_no between", value1, value2, "signerNo");
            return (Criteria) this;
        }

        public Criteria andSignerNoNotBetween(Integer value1, Integer value2) {
            addCriterion("signer_no not between", value1, value2, "signerNo");
            return (Criteria) this;
        }

        public Criteria andRepalceWordIsNull() {
            addCriterion("repalce_word is null");
            return (Criteria) this;
        }

        public Criteria andRepalceWordIsNotNull() {
            addCriterion("repalce_word is not null");
            return (Criteria) this;
        }

        public Criteria andRepalceWordEqualTo(String value) {
            addCriterion("repalce_word =", value, "repalceWord");
            return (Criteria) this;
        }

        public Criteria andRepalceWordNotEqualTo(String value) {
            addCriterion("repalce_word <>", value, "repalceWord");
            return (Criteria) this;
        }

        public Criteria andRepalceWordGreaterThan(String value) {
            addCriterion("repalce_word >", value, "repalceWord");
            return (Criteria) this;
        }

        public Criteria andRepalceWordGreaterThanOrEqualTo(String value) {
            addCriterion("repalce_word >=", value, "repalceWord");
            return (Criteria) this;
        }

        public Criteria andRepalceWordLessThan(String value) {
            addCriterion("repalce_word <", value, "repalceWord");
            return (Criteria) this;
        }

        public Criteria andRepalceWordLessThanOrEqualTo(String value) {
            addCriterion("repalce_word <=", value, "repalceWord");
            return (Criteria) this;
        }

        public Criteria andRepalceWordLike(String value) {
            addCriterion("repalce_word like", value, "repalceWord");
            return (Criteria) this;
        }

        public Criteria andRepalceWordNotLike(String value) {
            addCriterion("repalce_word not like", value, "repalceWord");
            return (Criteria) this;
        }

        public Criteria andRepalceWordIn(List<String> values) {
            addCriterion("repalce_word in", values, "repalceWord");
            return (Criteria) this;
        }

        public Criteria andRepalceWordNotIn(List<String> values) {
            addCriterion("repalce_word not in", values, "repalceWord");
            return (Criteria) this;
        }

        public Criteria andRepalceWordBetween(String value1, String value2) {
            addCriterion("repalce_word between", value1, value2, "repalceWord");
            return (Criteria) this;
        }

        public Criteria andRepalceWordNotBetween(String value1, String value2) {
            addCriterion("repalce_word not between", value1, value2, "repalceWord");
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