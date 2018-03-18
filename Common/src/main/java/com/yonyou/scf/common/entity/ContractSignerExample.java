package com.yonyou.scf.common.entity;

import java.util.ArrayList;
import java.util.List;

public class ContractSignerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractSignerExample() {
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

        public Criteria andTctIdIsNull() {
            addCriterion("tct_id is null");
            return (Criteria) this;
        }

        public Criteria andTctIdIsNotNull() {
            addCriterion("tct_id is not null");
            return (Criteria) this;
        }

        public Criteria andTctIdEqualTo(Long value) {
            addCriterion("tct_id =", value, "tctId");
            return (Criteria) this;
        }

        public Criteria andTctIdNotEqualTo(Long value) {
            addCriterion("tct_id <>", value, "tctId");
            return (Criteria) this;
        }

        public Criteria andTctIdGreaterThan(Long value) {
            addCriterion("tct_id >", value, "tctId");
            return (Criteria) this;
        }

        public Criteria andTctIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tct_id >=", value, "tctId");
            return (Criteria) this;
        }

        public Criteria andTctIdLessThan(Long value) {
            addCriterion("tct_id <", value, "tctId");
            return (Criteria) this;
        }

        public Criteria andTctIdLessThanOrEqualTo(Long value) {
            addCriterion("tct_id <=", value, "tctId");
            return (Criteria) this;
        }

        public Criteria andTctIdIn(List<Long> values) {
            addCriterion("tct_id in", values, "tctId");
            return (Criteria) this;
        }

        public Criteria andTctIdNotIn(List<Long> values) {
            addCriterion("tct_id not in", values, "tctId");
            return (Criteria) this;
        }

        public Criteria andTctIdBetween(Long value1, Long value2) {
            addCriterion("tct_id between", value1, value2, "tctId");
            return (Criteria) this;
        }

        public Criteria andTctIdNotBetween(Long value1, Long value2) {
            addCriterion("tct_id not between", value1, value2, "tctId");
            return (Criteria) this;
        }

        public Criteria andCreditIdIsNull() {
            addCriterion("credit_id is null");
            return (Criteria) this;
        }

        public Criteria andCreditIdIsNotNull() {
            addCriterion("credit_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreditIdEqualTo(Long value) {
            addCriterion("credit_id =", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdNotEqualTo(Long value) {
            addCriterion("credit_id <>", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdGreaterThan(Long value) {
            addCriterion("credit_id >", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdGreaterThanOrEqualTo(Long value) {
            addCriterion("credit_id >=", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdLessThan(Long value) {
            addCriterion("credit_id <", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdLessThanOrEqualTo(Long value) {
            addCriterion("credit_id <=", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdIn(List<Long> values) {
            addCriterion("credit_id in", values, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdNotIn(List<Long> values) {
            addCriterion("credit_id not in", values, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdBetween(Long value1, Long value2) {
            addCriterion("credit_id between", value1, value2, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdNotBetween(Long value1, Long value2) {
            addCriterion("credit_id not between", value1, value2, "creditId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIsNull() {
            addCriterion("application_id is null");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIsNotNull() {
            addCriterion("application_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationIdEqualTo(Long value) {
            addCriterion("application_id =", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotEqualTo(Long value) {
            addCriterion("application_id <>", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdGreaterThan(Long value) {
            addCriterion("application_id >", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("application_id >=", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdLessThan(Long value) {
            addCriterion("application_id <", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdLessThanOrEqualTo(Long value) {
            addCriterion("application_id <=", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIn(List<Long> values) {
            addCriterion("application_id in", values, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotIn(List<Long> values) {
            addCriterion("application_id not in", values, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdBetween(Long value1, Long value2) {
            addCriterion("application_id between", value1, value2, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotBetween(Long value1, Long value2) {
            addCriterion("application_id not between", value1, value2, "applicationId");
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

        public Criteria andSignerNoEqualTo(String value) {
            addCriterion("signer_no =", value, "signerNo");
            return (Criteria) this;
        }

        public Criteria andSignerNoNotEqualTo(String value) {
            addCriterion("signer_no <>", value, "signerNo");
            return (Criteria) this;
        }

        public Criteria andSignerNoGreaterThan(String value) {
            addCriterion("signer_no >", value, "signerNo");
            return (Criteria) this;
        }

        public Criteria andSignerNoGreaterThanOrEqualTo(String value) {
            addCriterion("signer_no >=", value, "signerNo");
            return (Criteria) this;
        }

        public Criteria andSignerNoLessThan(String value) {
            addCriterion("signer_no <", value, "signerNo");
            return (Criteria) this;
        }

        public Criteria andSignerNoLessThanOrEqualTo(String value) {
            addCriterion("signer_no <=", value, "signerNo");
            return (Criteria) this;
        }

        public Criteria andSignerNoLike(String value) {
            addCriterion("signer_no like", value, "signerNo");
            return (Criteria) this;
        }

        public Criteria andSignerNoNotLike(String value) {
            addCriterion("signer_no not like", value, "signerNo");
            return (Criteria) this;
        }

        public Criteria andSignerNoIn(List<String> values) {
            addCriterion("signer_no in", values, "signerNo");
            return (Criteria) this;
        }

        public Criteria andSignerNoNotIn(List<String> values) {
            addCriterion("signer_no not in", values, "signerNo");
            return (Criteria) this;
        }

        public Criteria andSignerNoBetween(String value1, String value2) {
            addCriterion("signer_no between", value1, value2, "signerNo");
            return (Criteria) this;
        }

        public Criteria andSignerNoNotBetween(String value1, String value2) {
            addCriterion("signer_no not between", value1, value2, "signerNo");
            return (Criteria) this;
        }

        public Criteria andSignerIdIsNull() {
            addCriterion("signer_id is null");
            return (Criteria) this;
        }

        public Criteria andSignerIdIsNotNull() {
            addCriterion("signer_id is not null");
            return (Criteria) this;
        }

        public Criteria andSignerIdEqualTo(Long value) {
            addCriterion("signer_id =", value, "signerId");
            return (Criteria) this;
        }

        public Criteria andSignerIdNotEqualTo(Long value) {
            addCriterion("signer_id <>", value, "signerId");
            return (Criteria) this;
        }

        public Criteria andSignerIdGreaterThan(Long value) {
            addCriterion("signer_id >", value, "signerId");
            return (Criteria) this;
        }

        public Criteria andSignerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("signer_id >=", value, "signerId");
            return (Criteria) this;
        }

        public Criteria andSignerIdLessThan(Long value) {
            addCriterion("signer_id <", value, "signerId");
            return (Criteria) this;
        }

        public Criteria andSignerIdLessThanOrEqualTo(Long value) {
            addCriterion("signer_id <=", value, "signerId");
            return (Criteria) this;
        }

        public Criteria andSignerIdIn(List<Long> values) {
            addCriterion("signer_id in", values, "signerId");
            return (Criteria) this;
        }

        public Criteria andSignerIdNotIn(List<Long> values) {
            addCriterion("signer_id not in", values, "signerId");
            return (Criteria) this;
        }

        public Criteria andSignerIdBetween(Long value1, Long value2) {
            addCriterion("signer_id between", value1, value2, "signerId");
            return (Criteria) this;
        }

        public Criteria andSignerIdNotBetween(Long value1, Long value2) {
            addCriterion("signer_id not between", value1, value2, "signerId");
            return (Criteria) this;
        }

        public Criteria andFileNoIsNull() {
            addCriterion("file_no is null");
            return (Criteria) this;
        }

        public Criteria andFileNoIsNotNull() {
            addCriterion("file_no is not null");
            return (Criteria) this;
        }

        public Criteria andFileNoEqualTo(String value) {
            addCriterion("file_no =", value, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoNotEqualTo(String value) {
            addCriterion("file_no <>", value, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoGreaterThan(String value) {
            addCriterion("file_no >", value, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoGreaterThanOrEqualTo(String value) {
            addCriterion("file_no >=", value, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoLessThan(String value) {
            addCriterion("file_no <", value, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoLessThanOrEqualTo(String value) {
            addCriterion("file_no <=", value, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoLike(String value) {
            addCriterion("file_no like", value, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoNotLike(String value) {
            addCriterion("file_no not like", value, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoIn(List<String> values) {
            addCriterion("file_no in", values, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoNotIn(List<String> values) {
            addCriterion("file_no not in", values, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoBetween(String value1, String value2) {
            addCriterion("file_no between", value1, value2, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoNotBetween(String value1, String value2) {
            addCriterion("file_no not between", value1, value2, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNull() {
            addCriterion("file_id is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("file_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(String value) {
            addCriterion("file_id =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(String value) {
            addCriterion("file_id <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(String value) {
            addCriterion("file_id >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("file_id >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(String value) {
            addCriterion("file_id <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(String value) {
            addCriterion("file_id <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLike(String value) {
            addCriterion("file_id like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotLike(String value) {
            addCriterion("file_id not like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<String> values) {
            addCriterion("file_id in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<String> values) {
            addCriterion("file_id not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(String value1, String value2) {
            addCriterion("file_id between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(String value1, String value2) {
            addCriterion("file_id not between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andSignContractIdIsNull() {
            addCriterion("sign_contract_id is null");
            return (Criteria) this;
        }

        public Criteria andSignContractIdIsNotNull() {
            addCriterion("sign_contract_id is not null");
            return (Criteria) this;
        }

        public Criteria andSignContractIdEqualTo(String value) {
            addCriterion("sign_contract_id =", value, "signContractId");
            return (Criteria) this;
        }

        public Criteria andSignContractIdNotEqualTo(String value) {
            addCriterion("sign_contract_id <>", value, "signContractId");
            return (Criteria) this;
        }

        public Criteria andSignContractIdGreaterThan(String value) {
            addCriterion("sign_contract_id >", value, "signContractId");
            return (Criteria) this;
        }

        public Criteria andSignContractIdGreaterThanOrEqualTo(String value) {
            addCriterion("sign_contract_id >=", value, "signContractId");
            return (Criteria) this;
        }

        public Criteria andSignContractIdLessThan(String value) {
            addCriterion("sign_contract_id <", value, "signContractId");
            return (Criteria) this;
        }

        public Criteria andSignContractIdLessThanOrEqualTo(String value) {
            addCriterion("sign_contract_id <=", value, "signContractId");
            return (Criteria) this;
        }

        public Criteria andSignContractIdLike(String value) {
            addCriterion("sign_contract_id like", value, "signContractId");
            return (Criteria) this;
        }

        public Criteria andSignContractIdNotLike(String value) {
            addCriterion("sign_contract_id not like", value, "signContractId");
            return (Criteria) this;
        }

        public Criteria andSignContractIdIn(List<String> values) {
            addCriterion("sign_contract_id in", values, "signContractId");
            return (Criteria) this;
        }

        public Criteria andSignContractIdNotIn(List<String> values) {
            addCriterion("sign_contract_id not in", values, "signContractId");
            return (Criteria) this;
        }

        public Criteria andSignContractIdBetween(String value1, String value2) {
            addCriterion("sign_contract_id between", value1, value2, "signContractId");
            return (Criteria) this;
        }

        public Criteria andSignContractIdNotBetween(String value1, String value2) {
            addCriterion("sign_contract_id not between", value1, value2, "signContractId");
            return (Criteria) this;
        }

        public Criteria andSignContractNoIsNull() {
            addCriterion("sign_contract_no is null");
            return (Criteria) this;
        }

        public Criteria andSignContractNoIsNotNull() {
            addCriterion("sign_contract_no is not null");
            return (Criteria) this;
        }

        public Criteria andSignContractNoEqualTo(String value) {
            addCriterion("sign_contract_no =", value, "signContractNo");
            return (Criteria) this;
        }

        public Criteria andSignContractNoNotEqualTo(String value) {
            addCriterion("sign_contract_no <>", value, "signContractNo");
            return (Criteria) this;
        }

        public Criteria andSignContractNoGreaterThan(String value) {
            addCriterion("sign_contract_no >", value, "signContractNo");
            return (Criteria) this;
        }

        public Criteria andSignContractNoGreaterThanOrEqualTo(String value) {
            addCriterion("sign_contract_no >=", value, "signContractNo");
            return (Criteria) this;
        }

        public Criteria andSignContractNoLessThan(String value) {
            addCriterion("sign_contract_no <", value, "signContractNo");
            return (Criteria) this;
        }

        public Criteria andSignContractNoLessThanOrEqualTo(String value) {
            addCriterion("sign_contract_no <=", value, "signContractNo");
            return (Criteria) this;
        }

        public Criteria andSignContractNoLike(String value) {
            addCriterion("sign_contract_no like", value, "signContractNo");
            return (Criteria) this;
        }

        public Criteria andSignContractNoNotLike(String value) {
            addCriterion("sign_contract_no not like", value, "signContractNo");
            return (Criteria) this;
        }

        public Criteria andSignContractNoIn(List<String> values) {
            addCriterion("sign_contract_no in", values, "signContractNo");
            return (Criteria) this;
        }

        public Criteria andSignContractNoNotIn(List<String> values) {
            addCriterion("sign_contract_no not in", values, "signContractNo");
            return (Criteria) this;
        }

        public Criteria andSignContractNoBetween(String value1, String value2) {
            addCriterion("sign_contract_no between", value1, value2, "signContractNo");
            return (Criteria) this;
        }

        public Criteria andSignContractNoNotBetween(String value1, String value2) {
            addCriterion("sign_contract_no not between", value1, value2, "signContractNo");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNull() {
            addCriterion("sign_time is null");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNotNull() {
            addCriterion("sign_time is not null");
            return (Criteria) this;
        }

        public Criteria andSignTimeEqualTo(String value) {
            addCriterion("sign_time =", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotEqualTo(String value) {
            addCriterion("sign_time <>", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThan(String value) {
            addCriterion("sign_time >", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThanOrEqualTo(String value) {
            addCriterion("sign_time >=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThan(String value) {
            addCriterion("sign_time <", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThanOrEqualTo(String value) {
            addCriterion("sign_time <=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLike(String value) {
            addCriterion("sign_time like", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotLike(String value) {
            addCriterion("sign_time not like", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeIn(List<String> values) {
            addCriterion("sign_time in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotIn(List<String> values) {
            addCriterion("sign_time not in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeBetween(String value1, String value2) {
            addCriterion("sign_time between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotBetween(String value1, String value2) {
            addCriterion("sign_time not between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andPlaceholderNoIsNull() {
            addCriterion("placeholder_no is null");
            return (Criteria) this;
        }

        public Criteria andPlaceholderNoIsNotNull() {
            addCriterion("placeholder_no is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceholderNoEqualTo(String value) {
            addCriterion("placeholder_no =", value, "placeholderNo");
            return (Criteria) this;
        }

        public Criteria andPlaceholderNoNotEqualTo(String value) {
            addCriterion("placeholder_no <>", value, "placeholderNo");
            return (Criteria) this;
        }

        public Criteria andPlaceholderNoGreaterThan(String value) {
            addCriterion("placeholder_no >", value, "placeholderNo");
            return (Criteria) this;
        }

        public Criteria andPlaceholderNoGreaterThanOrEqualTo(String value) {
            addCriterion("placeholder_no >=", value, "placeholderNo");
            return (Criteria) this;
        }

        public Criteria andPlaceholderNoLessThan(String value) {
            addCriterion("placeholder_no <", value, "placeholderNo");
            return (Criteria) this;
        }

        public Criteria andPlaceholderNoLessThanOrEqualTo(String value) {
            addCriterion("placeholder_no <=", value, "placeholderNo");
            return (Criteria) this;
        }

        public Criteria andPlaceholderNoLike(String value) {
            addCriterion("placeholder_no like", value, "placeholderNo");
            return (Criteria) this;
        }

        public Criteria andPlaceholderNoNotLike(String value) {
            addCriterion("placeholder_no not like", value, "placeholderNo");
            return (Criteria) this;
        }

        public Criteria andPlaceholderNoIn(List<String> values) {
            addCriterion("placeholder_no in", values, "placeholderNo");
            return (Criteria) this;
        }

        public Criteria andPlaceholderNoNotIn(List<String> values) {
            addCriterion("placeholder_no not in", values, "placeholderNo");
            return (Criteria) this;
        }

        public Criteria andPlaceholderNoBetween(String value1, String value2) {
            addCriterion("placeholder_no between", value1, value2, "placeholderNo");
            return (Criteria) this;
        }

        public Criteria andPlaceholderNoNotBetween(String value1, String value2) {
            addCriterion("placeholder_no not between", value1, value2, "placeholderNo");
            return (Criteria) this;
        }

        public Criteria andIsSignedIsNull() {
            addCriterion("is_signed is null");
            return (Criteria) this;
        }

        public Criteria andIsSignedIsNotNull() {
            addCriterion("is_signed is not null");
            return (Criteria) this;
        }

        public Criteria andIsSignedEqualTo(Integer value) {
            addCriterion("is_signed =", value, "isSigned");
            return (Criteria) this;
        }

        public Criteria andIsSignedNotEqualTo(Integer value) {
            addCriterion("is_signed <>", value, "isSigned");
            return (Criteria) this;
        }

        public Criteria andIsSignedGreaterThan(Integer value) {
            addCriterion("is_signed >", value, "isSigned");
            return (Criteria) this;
        }

        public Criteria andIsSignedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_signed >=", value, "isSigned");
            return (Criteria) this;
        }

        public Criteria andIsSignedLessThan(Integer value) {
            addCriterion("is_signed <", value, "isSigned");
            return (Criteria) this;
        }

        public Criteria andIsSignedLessThanOrEqualTo(Integer value) {
            addCriterion("is_signed <=", value, "isSigned");
            return (Criteria) this;
        }

        public Criteria andIsSignedIn(List<Integer> values) {
            addCriterion("is_signed in", values, "isSigned");
            return (Criteria) this;
        }

        public Criteria andIsSignedNotIn(List<Integer> values) {
            addCriterion("is_signed not in", values, "isSigned");
            return (Criteria) this;
        }

        public Criteria andIsSignedBetween(Integer value1, Integer value2) {
            addCriterion("is_signed between", value1, value2, "isSigned");
            return (Criteria) this;
        }

        public Criteria andIsSignedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_signed not between", value1, value2, "isSigned");
            return (Criteria) this;
        }

        public Criteria andSignUserIdIsNull() {
            addCriterion("sign_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSignUserIdIsNotNull() {
            addCriterion("sign_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSignUserIdEqualTo(Long value) {
            addCriterion("sign_user_id =", value, "signUserId");
            return (Criteria) this;
        }

        public Criteria andSignUserIdNotEqualTo(Long value) {
            addCriterion("sign_user_id <>", value, "signUserId");
            return (Criteria) this;
        }

        public Criteria andSignUserIdGreaterThan(Long value) {
            addCriterion("sign_user_id >", value, "signUserId");
            return (Criteria) this;
        }

        public Criteria andSignUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sign_user_id >=", value, "signUserId");
            return (Criteria) this;
        }

        public Criteria andSignUserIdLessThan(Long value) {
            addCriterion("sign_user_id <", value, "signUserId");
            return (Criteria) this;
        }

        public Criteria andSignUserIdLessThanOrEqualTo(Long value) {
            addCriterion("sign_user_id <=", value, "signUserId");
            return (Criteria) this;
        }

        public Criteria andSignUserIdIn(List<Long> values) {
            addCriterion("sign_user_id in", values, "signUserId");
            return (Criteria) this;
        }

        public Criteria andSignUserIdNotIn(List<Long> values) {
            addCriterion("sign_user_id not in", values, "signUserId");
            return (Criteria) this;
        }

        public Criteria andSignUserIdBetween(Long value1, Long value2) {
            addCriterion("sign_user_id between", value1, value2, "signUserId");
            return (Criteria) this;
        }

        public Criteria andSignUserIdNotBetween(Long value1, Long value2) {
            addCriterion("sign_user_id not between", value1, value2, "signUserId");
            return (Criteria) this;
        }

        public Criteria andCertifyIdIsNull() {
            addCriterion("certify_id is null");
            return (Criteria) this;
        }

        public Criteria andCertifyIdIsNotNull() {
            addCriterion("certify_id is not null");
            return (Criteria) this;
        }

        public Criteria andCertifyIdEqualTo(Long value) {
            addCriterion("certify_id =", value, "certifyId");
            return (Criteria) this;
        }

        public Criteria andCertifyIdNotEqualTo(Long value) {
            addCriterion("certify_id <>", value, "certifyId");
            return (Criteria) this;
        }

        public Criteria andCertifyIdGreaterThan(Long value) {
            addCriterion("certify_id >", value, "certifyId");
            return (Criteria) this;
        }

        public Criteria andCertifyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("certify_id >=", value, "certifyId");
            return (Criteria) this;
        }

        public Criteria andCertifyIdLessThan(Long value) {
            addCriterion("certify_id <", value, "certifyId");
            return (Criteria) this;
        }

        public Criteria andCertifyIdLessThanOrEqualTo(Long value) {
            addCriterion("certify_id <=", value, "certifyId");
            return (Criteria) this;
        }

        public Criteria andCertifyIdIn(List<Long> values) {
            addCriterion("certify_id in", values, "certifyId");
            return (Criteria) this;
        }

        public Criteria andCertifyIdNotIn(List<Long> values) {
            addCriterion("certify_id not in", values, "certifyId");
            return (Criteria) this;
        }

        public Criteria andCertifyIdBetween(Long value1, Long value2) {
            addCriterion("certify_id between", value1, value2, "certifyId");
            return (Criteria) this;
        }

        public Criteria andCertifyIdNotBetween(Long value1, Long value2) {
            addCriterion("certify_id not between", value1, value2, "certifyId");
            return (Criteria) this;
        }

        public Criteria andSourceContentIsNull() {
            addCriterion("source_content is null");
            return (Criteria) this;
        }

        public Criteria andSourceContentIsNotNull() {
            addCriterion("source_content is not null");
            return (Criteria) this;
        }

        public Criteria andSourceContentEqualTo(String value) {
            addCriterion("source_content =", value, "sourceContent");
            return (Criteria) this;
        }

        public Criteria andSourceContentNotEqualTo(String value) {
            addCriterion("source_content <>", value, "sourceContent");
            return (Criteria) this;
        }

        public Criteria andSourceContentGreaterThan(String value) {
            addCriterion("source_content >", value, "sourceContent");
            return (Criteria) this;
        }

        public Criteria andSourceContentGreaterThanOrEqualTo(String value) {
            addCriterion("source_content >=", value, "sourceContent");
            return (Criteria) this;
        }

        public Criteria andSourceContentLessThan(String value) {
            addCriterion("source_content <", value, "sourceContent");
            return (Criteria) this;
        }

        public Criteria andSourceContentLessThanOrEqualTo(String value) {
            addCriterion("source_content <=", value, "sourceContent");
            return (Criteria) this;
        }

        public Criteria andSourceContentLike(String value) {
            addCriterion("source_content like", value, "sourceContent");
            return (Criteria) this;
        }

        public Criteria andSourceContentNotLike(String value) {
            addCriterion("source_content not like", value, "sourceContent");
            return (Criteria) this;
        }

        public Criteria andSourceContentIn(List<String> values) {
            addCriterion("source_content in", values, "sourceContent");
            return (Criteria) this;
        }

        public Criteria andSourceContentNotIn(List<String> values) {
            addCriterion("source_content not in", values, "sourceContent");
            return (Criteria) this;
        }

        public Criteria andSourceContentBetween(String value1, String value2) {
            addCriterion("source_content between", value1, value2, "sourceContent");
            return (Criteria) this;
        }

        public Criteria andSourceContentNotBetween(String value1, String value2) {
            addCriterion("source_content not between", value1, value2, "sourceContent");
            return (Criteria) this;
        }

        public Criteria andSecretContentIsNull() {
            addCriterion("secret_content is null");
            return (Criteria) this;
        }

        public Criteria andSecretContentIsNotNull() {
            addCriterion("secret_content is not null");
            return (Criteria) this;
        }

        public Criteria andSecretContentEqualTo(String value) {
            addCriterion("secret_content =", value, "secretContent");
            return (Criteria) this;
        }

        public Criteria andSecretContentNotEqualTo(String value) {
            addCriterion("secret_content <>", value, "secretContent");
            return (Criteria) this;
        }

        public Criteria andSecretContentGreaterThan(String value) {
            addCriterion("secret_content >", value, "secretContent");
            return (Criteria) this;
        }

        public Criteria andSecretContentGreaterThanOrEqualTo(String value) {
            addCriterion("secret_content >=", value, "secretContent");
            return (Criteria) this;
        }

        public Criteria andSecretContentLessThan(String value) {
            addCriterion("secret_content <", value, "secretContent");
            return (Criteria) this;
        }

        public Criteria andSecretContentLessThanOrEqualTo(String value) {
            addCriterion("secret_content <=", value, "secretContent");
            return (Criteria) this;
        }

        public Criteria andSecretContentLike(String value) {
            addCriterion("secret_content like", value, "secretContent");
            return (Criteria) this;
        }

        public Criteria andSecretContentNotLike(String value) {
            addCriterion("secret_content not like", value, "secretContent");
            return (Criteria) this;
        }

        public Criteria andSecretContentIn(List<String> values) {
            addCriterion("secret_content in", values, "secretContent");
            return (Criteria) this;
        }

        public Criteria andSecretContentNotIn(List<String> values) {
            addCriterion("secret_content not in", values, "secretContent");
            return (Criteria) this;
        }

        public Criteria andSecretContentBetween(String value1, String value2) {
            addCriterion("secret_content between", value1, value2, "secretContent");
            return (Criteria) this;
        }

        public Criteria andSecretContentNotBetween(String value1, String value2) {
            addCriterion("secret_content not between", value1, value2, "secretContent");
            return (Criteria) this;
        }

        public Criteria andTelegramContentIsNull() {
            addCriterion("telegram_content is null");
            return (Criteria) this;
        }

        public Criteria andTelegramContentIsNotNull() {
            addCriterion("telegram_content is not null");
            return (Criteria) this;
        }

        public Criteria andTelegramContentEqualTo(String value) {
            addCriterion("telegram_content =", value, "telegramContent");
            return (Criteria) this;
        }

        public Criteria andTelegramContentNotEqualTo(String value) {
            addCriterion("telegram_content <>", value, "telegramContent");
            return (Criteria) this;
        }

        public Criteria andTelegramContentGreaterThan(String value) {
            addCriterion("telegram_content >", value, "telegramContent");
            return (Criteria) this;
        }

        public Criteria andTelegramContentGreaterThanOrEqualTo(String value) {
            addCriterion("telegram_content >=", value, "telegramContent");
            return (Criteria) this;
        }

        public Criteria andTelegramContentLessThan(String value) {
            addCriterion("telegram_content <", value, "telegramContent");
            return (Criteria) this;
        }

        public Criteria andTelegramContentLessThanOrEqualTo(String value) {
            addCriterion("telegram_content <=", value, "telegramContent");
            return (Criteria) this;
        }

        public Criteria andTelegramContentLike(String value) {
            addCriterion("telegram_content like", value, "telegramContent");
            return (Criteria) this;
        }

        public Criteria andTelegramContentNotLike(String value) {
            addCriterion("telegram_content not like", value, "telegramContent");
            return (Criteria) this;
        }

        public Criteria andTelegramContentIn(List<String> values) {
            addCriterion("telegram_content in", values, "telegramContent");
            return (Criteria) this;
        }

        public Criteria andTelegramContentNotIn(List<String> values) {
            addCriterion("telegram_content not in", values, "telegramContent");
            return (Criteria) this;
        }

        public Criteria andTelegramContentBetween(String value1, String value2) {
            addCriterion("telegram_content between", value1, value2, "telegramContent");
            return (Criteria) this;
        }

        public Criteria andTelegramContentNotBetween(String value1, String value2) {
            addCriterion("telegram_content not between", value1, value2, "telegramContent");
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

        public Criteria andSerialNumIsNull() {
            addCriterion("serial_num is null");
            return (Criteria) this;
        }

        public Criteria andSerialNumIsNotNull() {
            addCriterion("serial_num is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNumEqualTo(String value) {
            addCriterion("serial_num =", value, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSerialNumNotEqualTo(String value) {
            addCriterion("serial_num <>", value, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSerialNumGreaterThan(String value) {
            addCriterion("serial_num >", value, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSerialNumGreaterThanOrEqualTo(String value) {
            addCriterion("serial_num >=", value, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSerialNumLessThan(String value) {
            addCriterion("serial_num <", value, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSerialNumLessThanOrEqualTo(String value) {
            addCriterion("serial_num <=", value, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSerialNumLike(String value) {
            addCriterion("serial_num like", value, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSerialNumNotLike(String value) {
            addCriterion("serial_num not like", value, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSerialNumIn(List<String> values) {
            addCriterion("serial_num in", values, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSerialNumNotIn(List<String> values) {
            addCriterion("serial_num not in", values, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSerialNumBetween(String value1, String value2) {
            addCriterion("serial_num between", value1, value2, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSerialNumNotBetween(String value1, String value2) {
            addCriterion("serial_num not between", value1, value2, "serialNum");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(Integer value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(Integer value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(Integer value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(Integer value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(Integer value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<Integer> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<Integer> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(Integer value1, Integer value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(Integer value1, Integer value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
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