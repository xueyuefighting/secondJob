package com.yonyou.scf.common.entity;

import java.util.ArrayList;
import java.util.List;

public class ContractTemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractTemplateExample() {
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

        public Criteria andContractNameIsNull() {
            addCriterion("contract_name is null");
            return (Criteria) this;
        }

        public Criteria andContractNameIsNotNull() {
            addCriterion("contract_name is not null");
            return (Criteria) this;
        }

        public Criteria andContractNameEqualTo(String value) {
            addCriterion("contract_name =", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotEqualTo(String value) {
            addCriterion("contract_name <>", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameGreaterThan(String value) {
            addCriterion("contract_name >", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameGreaterThanOrEqualTo(String value) {
            addCriterion("contract_name >=", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameLessThan(String value) {
            addCriterion("contract_name <", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameLessThanOrEqualTo(String value) {
            addCriterion("contract_name <=", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameLike(String value) {
            addCriterion("contract_name like", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotLike(String value) {
            addCriterion("contract_name not like", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameIn(List<String> values) {
            addCriterion("contract_name in", values, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotIn(List<String> values) {
            addCriterion("contract_name not in", values, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameBetween(String value1, String value2) {
            addCriterion("contract_name between", value1, value2, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotBetween(String value1, String value2) {
            addCriterion("contract_name not between", value1, value2, "contractName");
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

        public Criteria andCapitalIdIsNull() {
            addCriterion("capital_id is null");
            return (Criteria) this;
        }

        public Criteria andCapitalIdIsNotNull() {
            addCriterion("capital_id is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalIdEqualTo(Long value) {
            addCriterion("capital_id =", value, "capitalId");
            return (Criteria) this;
        }

        public Criteria andCapitalIdNotEqualTo(Long value) {
            addCriterion("capital_id <>", value, "capitalId");
            return (Criteria) this;
        }

        public Criteria andCapitalIdGreaterThan(Long value) {
            addCriterion("capital_id >", value, "capitalId");
            return (Criteria) this;
        }

        public Criteria andCapitalIdGreaterThanOrEqualTo(Long value) {
            addCriterion("capital_id >=", value, "capitalId");
            return (Criteria) this;
        }

        public Criteria andCapitalIdLessThan(Long value) {
            addCriterion("capital_id <", value, "capitalId");
            return (Criteria) this;
        }

        public Criteria andCapitalIdLessThanOrEqualTo(Long value) {
            addCriterion("capital_id <=", value, "capitalId");
            return (Criteria) this;
        }

        public Criteria andCapitalIdIn(List<Long> values) {
            addCriterion("capital_id in", values, "capitalId");
            return (Criteria) this;
        }

        public Criteria andCapitalIdNotIn(List<Long> values) {
            addCriterion("capital_id not in", values, "capitalId");
            return (Criteria) this;
        }

        public Criteria andCapitalIdBetween(Long value1, Long value2) {
            addCriterion("capital_id between", value1, value2, "capitalId");
            return (Criteria) this;
        }

        public Criteria andCapitalIdNotBetween(Long value1, Long value2) {
            addCriterion("capital_id not between", value1, value2, "capitalId");
            return (Criteria) this;
        }

        public Criteria andFundNoIsNull() {
            addCriterion("fund_no is null");
            return (Criteria) this;
        }

        public Criteria andFundNoIsNotNull() {
            addCriterion("fund_no is not null");
            return (Criteria) this;
        }

        public Criteria andFundNoEqualTo(String value) {
            addCriterion("fund_no =", value, "fundNo");
            return (Criteria) this;
        }

        public Criteria andFundNoNotEqualTo(String value) {
            addCriterion("fund_no <>", value, "fundNo");
            return (Criteria) this;
        }

        public Criteria andFundNoGreaterThan(String value) {
            addCriterion("fund_no >", value, "fundNo");
            return (Criteria) this;
        }

        public Criteria andFundNoGreaterThanOrEqualTo(String value) {
            addCriterion("fund_no >=", value, "fundNo");
            return (Criteria) this;
        }

        public Criteria andFundNoLessThan(String value) {
            addCriterion("fund_no <", value, "fundNo");
            return (Criteria) this;
        }

        public Criteria andFundNoLessThanOrEqualTo(String value) {
            addCriterion("fund_no <=", value, "fundNo");
            return (Criteria) this;
        }

        public Criteria andFundNoLike(String value) {
            addCriterion("fund_no like", value, "fundNo");
            return (Criteria) this;
        }

        public Criteria andFundNoNotLike(String value) {
            addCriterion("fund_no not like", value, "fundNo");
            return (Criteria) this;
        }

        public Criteria andFundNoIn(List<String> values) {
            addCriterion("fund_no in", values, "fundNo");
            return (Criteria) this;
        }

        public Criteria andFundNoNotIn(List<String> values) {
            addCriterion("fund_no not in", values, "fundNo");
            return (Criteria) this;
        }

        public Criteria andFundNoBetween(String value1, String value2) {
            addCriterion("fund_no between", value1, value2, "fundNo");
            return (Criteria) this;
        }

        public Criteria andFundNoNotBetween(String value1, String value2) {
            addCriterion("fund_no not between", value1, value2, "fundNo");
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

        public Criteria andSpecialSignersIsNull() {
            addCriterion("special_signers is null");
            return (Criteria) this;
        }

        public Criteria andSpecialSignersIsNotNull() {
            addCriterion("special_signers is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialSignersEqualTo(String value) {
            addCriterion("special_signers =", value, "specialSigners");
            return (Criteria) this;
        }

        public Criteria andSpecialSignersNotEqualTo(String value) {
            addCriterion("special_signers <>", value, "specialSigners");
            return (Criteria) this;
        }

        public Criteria andSpecialSignersGreaterThan(String value) {
            addCriterion("special_signers >", value, "specialSigners");
            return (Criteria) this;
        }

        public Criteria andSpecialSignersGreaterThanOrEqualTo(String value) {
            addCriterion("special_signers >=", value, "specialSigners");
            return (Criteria) this;
        }

        public Criteria andSpecialSignersLessThan(String value) {
            addCriterion("special_signers <", value, "specialSigners");
            return (Criteria) this;
        }

        public Criteria andSpecialSignersLessThanOrEqualTo(String value) {
            addCriterion("special_signers <=", value, "specialSigners");
            return (Criteria) this;
        }

        public Criteria andSpecialSignersLike(String value) {
            addCriterion("special_signers like", value, "specialSigners");
            return (Criteria) this;
        }

        public Criteria andSpecialSignersNotLike(String value) {
            addCriterion("special_signers not like", value, "specialSigners");
            return (Criteria) this;
        }

        public Criteria andSpecialSignersIn(List<String> values) {
            addCriterion("special_signers in", values, "specialSigners");
            return (Criteria) this;
        }

        public Criteria andSpecialSignersNotIn(List<String> values) {
            addCriterion("special_signers not in", values, "specialSigners");
            return (Criteria) this;
        }

        public Criteria andSpecialSignersBetween(String value1, String value2) {
            addCriterion("special_signers between", value1, value2, "specialSigners");
            return (Criteria) this;
        }

        public Criteria andSpecialSignersNotBetween(String value1, String value2) {
            addCriterion("special_signers not between", value1, value2, "specialSigners");
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

        public Criteria andIsSpecialCompanyIsNull() {
            addCriterion("is_special_company is null");
            return (Criteria) this;
        }

        public Criteria andIsSpecialCompanyIsNotNull() {
            addCriterion("is_special_company is not null");
            return (Criteria) this;
        }

        public Criteria andIsSpecialCompanyEqualTo(Integer value) {
            addCriterion("is_special_company =", value, "isSpecialCompany");
            return (Criteria) this;
        }

        public Criteria andIsSpecialCompanyNotEqualTo(Integer value) {
            addCriterion("is_special_company <>", value, "isSpecialCompany");
            return (Criteria) this;
        }

        public Criteria andIsSpecialCompanyGreaterThan(Integer value) {
            addCriterion("is_special_company >", value, "isSpecialCompany");
            return (Criteria) this;
        }

        public Criteria andIsSpecialCompanyGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_special_company >=", value, "isSpecialCompany");
            return (Criteria) this;
        }

        public Criteria andIsSpecialCompanyLessThan(Integer value) {
            addCriterion("is_special_company <", value, "isSpecialCompany");
            return (Criteria) this;
        }

        public Criteria andIsSpecialCompanyLessThanOrEqualTo(Integer value) {
            addCriterion("is_special_company <=", value, "isSpecialCompany");
            return (Criteria) this;
        }

        public Criteria andIsSpecialCompanyIn(List<Integer> values) {
            addCriterion("is_special_company in", values, "isSpecialCompany");
            return (Criteria) this;
        }

        public Criteria andIsSpecialCompanyNotIn(List<Integer> values) {
            addCriterion("is_special_company not in", values, "isSpecialCompany");
            return (Criteria) this;
        }

        public Criteria andIsSpecialCompanyBetween(Integer value1, Integer value2) {
            addCriterion("is_special_company between", value1, value2, "isSpecialCompany");
            return (Criteria) this;
        }

        public Criteria andIsSpecialCompanyNotBetween(Integer value1, Integer value2) {
            addCriterion("is_special_company not between", value1, value2, "isSpecialCompany");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Long value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Long value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Long value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Long value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Long value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Long> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Long> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Long value1, Long value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Long value1, Long value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
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