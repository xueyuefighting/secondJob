package com.yonyou.scf.common.entity;

import java.util.ArrayList;
import java.util.List;

public class F605Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public F605Example() {
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

        public Criteria andOpeTypeIsNull() {
            addCriterion("ope_type is null");
            return (Criteria) this;
        }

        public Criteria andOpeTypeIsNotNull() {
            addCriterion("ope_type is not null");
            return (Criteria) this;
        }

        public Criteria andOpeTypeEqualTo(String value) {
            addCriterion("ope_type =", value, "opeType");
            return (Criteria) this;
        }

        public Criteria andOpeTypeNotEqualTo(String value) {
            addCriterion("ope_type <>", value, "opeType");
            return (Criteria) this;
        }

        public Criteria andOpeTypeGreaterThan(String value) {
            addCriterion("ope_type >", value, "opeType");
            return (Criteria) this;
        }

        public Criteria andOpeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ope_type >=", value, "opeType");
            return (Criteria) this;
        }

        public Criteria andOpeTypeLessThan(String value) {
            addCriterion("ope_type <", value, "opeType");
            return (Criteria) this;
        }

        public Criteria andOpeTypeLessThanOrEqualTo(String value) {
            addCriterion("ope_type <=", value, "opeType");
            return (Criteria) this;
        }

        public Criteria andOpeTypeLike(String value) {
            addCriterion("ope_type like", value, "opeType");
            return (Criteria) this;
        }

        public Criteria andOpeTypeNotLike(String value) {
            addCriterion("ope_type not like", value, "opeType");
            return (Criteria) this;
        }

        public Criteria andOpeTypeIn(List<String> values) {
            addCriterion("ope_type in", values, "opeType");
            return (Criteria) this;
        }

        public Criteria andOpeTypeNotIn(List<String> values) {
            addCriterion("ope_type not in", values, "opeType");
            return (Criteria) this;
        }

        public Criteria andOpeTypeBetween(String value1, String value2) {
            addCriterion("ope_type between", value1, value2, "opeType");
            return (Criteria) this;
        }

        public Criteria andOpeTypeNotBetween(String value1, String value2) {
            addCriterion("ope_type not between", value1, value2, "opeType");
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

        public Criteria andMemNameIsNull() {
            addCriterion("mem_name is null");
            return (Criteria) this;
        }

        public Criteria andMemNameIsNotNull() {
            addCriterion("mem_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemNameEqualTo(String value) {
            addCriterion("mem_name =", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameNotEqualTo(String value) {
            addCriterion("mem_name <>", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameGreaterThan(String value) {
            addCriterion("mem_name >", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameGreaterThanOrEqualTo(String value) {
            addCriterion("mem_name >=", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameLessThan(String value) {
            addCriterion("mem_name <", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameLessThanOrEqualTo(String value) {
            addCriterion("mem_name <=", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameLike(String value) {
            addCriterion("mem_name like", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameNotLike(String value) {
            addCriterion("mem_name not like", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameIn(List<String> values) {
            addCriterion("mem_name in", values, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameNotIn(List<String> values) {
            addCriterion("mem_name not in", values, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameBetween(String value1, String value2) {
            addCriterion("mem_name between", value1, value2, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameNotBetween(String value1, String value2) {
            addCriterion("mem_name not between", value1, value2, "memName");
            return (Criteria) this;
        }

        public Criteria andMemTypeIsNull() {
            addCriterion("mem_type is null");
            return (Criteria) this;
        }

        public Criteria andMemTypeIsNotNull() {
            addCriterion("mem_type is not null");
            return (Criteria) this;
        }

        public Criteria andMemTypeEqualTo(String value) {
            addCriterion("mem_type =", value, "memType");
            return (Criteria) this;
        }

        public Criteria andMemTypeNotEqualTo(String value) {
            addCriterion("mem_type <>", value, "memType");
            return (Criteria) this;
        }

        public Criteria andMemTypeGreaterThan(String value) {
            addCriterion("mem_type >", value, "memType");
            return (Criteria) this;
        }

        public Criteria andMemTypeGreaterThanOrEqualTo(String value) {
            addCriterion("mem_type >=", value, "memType");
            return (Criteria) this;
        }

        public Criteria andMemTypeLessThan(String value) {
            addCriterion("mem_type <", value, "memType");
            return (Criteria) this;
        }

        public Criteria andMemTypeLessThanOrEqualTo(String value) {
            addCriterion("mem_type <=", value, "memType");
            return (Criteria) this;
        }

        public Criteria andMemTypeLike(String value) {
            addCriterion("mem_type like", value, "memType");
            return (Criteria) this;
        }

        public Criteria andMemTypeNotLike(String value) {
            addCriterion("mem_type not like", value, "memType");
            return (Criteria) this;
        }

        public Criteria andMemTypeIn(List<String> values) {
            addCriterion("mem_type in", values, "memType");
            return (Criteria) this;
        }

        public Criteria andMemTypeNotIn(List<String> values) {
            addCriterion("mem_type not in", values, "memType");
            return (Criteria) this;
        }

        public Criteria andMemTypeBetween(String value1, String value2) {
            addCriterion("mem_type between", value1, value2, "memType");
            return (Criteria) this;
        }

        public Criteria andMemTypeNotBetween(String value1, String value2) {
            addCriterion("mem_type not between", value1, value2, "memType");
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

        public Criteria andRegisNameIsNull() {
            addCriterion("regis_name is null");
            return (Criteria) this;
        }

        public Criteria andRegisNameIsNotNull() {
            addCriterion("regis_name is not null");
            return (Criteria) this;
        }

        public Criteria andRegisNameEqualTo(String value) {
            addCriterion("regis_name =", value, "regisName");
            return (Criteria) this;
        }

        public Criteria andRegisNameNotEqualTo(String value) {
            addCriterion("regis_name <>", value, "regisName");
            return (Criteria) this;
        }

        public Criteria andRegisNameGreaterThan(String value) {
            addCriterion("regis_name >", value, "regisName");
            return (Criteria) this;
        }

        public Criteria andRegisNameGreaterThanOrEqualTo(String value) {
            addCriterion("regis_name >=", value, "regisName");
            return (Criteria) this;
        }

        public Criteria andRegisNameLessThan(String value) {
            addCriterion("regis_name <", value, "regisName");
            return (Criteria) this;
        }

        public Criteria andRegisNameLessThanOrEqualTo(String value) {
            addCriterion("regis_name <=", value, "regisName");
            return (Criteria) this;
        }

        public Criteria andRegisNameLike(String value) {
            addCriterion("regis_name like", value, "regisName");
            return (Criteria) this;
        }

        public Criteria andRegisNameNotLike(String value) {
            addCriterion("regis_name not like", value, "regisName");
            return (Criteria) this;
        }

        public Criteria andRegisNameIn(List<String> values) {
            addCriterion("regis_name in", values, "regisName");
            return (Criteria) this;
        }

        public Criteria andRegisNameNotIn(List<String> values) {
            addCriterion("regis_name not in", values, "regisName");
            return (Criteria) this;
        }

        public Criteria andRegisNameBetween(String value1, String value2) {
            addCriterion("regis_name between", value1, value2, "regisName");
            return (Criteria) this;
        }

        public Criteria andRegisNameNotBetween(String value1, String value2) {
            addCriterion("regis_name not between", value1, value2, "regisName");
            return (Criteria) this;
        }

        public Criteria andIdentiTypeIsNull() {
            addCriterion("identi_type is null");
            return (Criteria) this;
        }

        public Criteria andIdentiTypeIsNotNull() {
            addCriterion("identi_type is not null");
            return (Criteria) this;
        }

        public Criteria andIdentiTypeEqualTo(String value) {
            addCriterion("identi_type =", value, "identiType");
            return (Criteria) this;
        }

        public Criteria andIdentiTypeNotEqualTo(String value) {
            addCriterion("identi_type <>", value, "identiType");
            return (Criteria) this;
        }

        public Criteria andIdentiTypeGreaterThan(String value) {
            addCriterion("identi_type >", value, "identiType");
            return (Criteria) this;
        }

        public Criteria andIdentiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("identi_type >=", value, "identiType");
            return (Criteria) this;
        }

        public Criteria andIdentiTypeLessThan(String value) {
            addCriterion("identi_type <", value, "identiType");
            return (Criteria) this;
        }

        public Criteria andIdentiTypeLessThanOrEqualTo(String value) {
            addCriterion("identi_type <=", value, "identiType");
            return (Criteria) this;
        }

        public Criteria andIdentiTypeLike(String value) {
            addCriterion("identi_type like", value, "identiType");
            return (Criteria) this;
        }

        public Criteria andIdentiTypeNotLike(String value) {
            addCriterion("identi_type not like", value, "identiType");
            return (Criteria) this;
        }

        public Criteria andIdentiTypeIn(List<String> values) {
            addCriterion("identi_type in", values, "identiType");
            return (Criteria) this;
        }

        public Criteria andIdentiTypeNotIn(List<String> values) {
            addCriterion("identi_type not in", values, "identiType");
            return (Criteria) this;
        }

        public Criteria andIdentiTypeBetween(String value1, String value2) {
            addCriterion("identi_type between", value1, value2, "identiType");
            return (Criteria) this;
        }

        public Criteria andIdentiTypeNotBetween(String value1, String value2) {
            addCriterion("identi_type not between", value1, value2, "identiType");
            return (Criteria) this;
        }

        public Criteria andIdentiNumIsNull() {
            addCriterion("identi_num is null");
            return (Criteria) this;
        }

        public Criteria andIdentiNumIsNotNull() {
            addCriterion("identi_num is not null");
            return (Criteria) this;
        }

        public Criteria andIdentiNumEqualTo(String value) {
            addCriterion("identi_num =", value, "identiNum");
            return (Criteria) this;
        }

        public Criteria andIdentiNumNotEqualTo(String value) {
            addCriterion("identi_num <>", value, "identiNum");
            return (Criteria) this;
        }

        public Criteria andIdentiNumGreaterThan(String value) {
            addCriterion("identi_num >", value, "identiNum");
            return (Criteria) this;
        }

        public Criteria andIdentiNumGreaterThanOrEqualTo(String value) {
            addCriterion("identi_num >=", value, "identiNum");
            return (Criteria) this;
        }

        public Criteria andIdentiNumLessThan(String value) {
            addCriterion("identi_num <", value, "identiNum");
            return (Criteria) this;
        }

        public Criteria andIdentiNumLessThanOrEqualTo(String value) {
            addCriterion("identi_num <=", value, "identiNum");
            return (Criteria) this;
        }

        public Criteria andIdentiNumLike(String value) {
            addCriterion("identi_num like", value, "identiNum");
            return (Criteria) this;
        }

        public Criteria andIdentiNumNotLike(String value) {
            addCriterion("identi_num not like", value, "identiNum");
            return (Criteria) this;
        }

        public Criteria andIdentiNumIn(List<String> values) {
            addCriterion("identi_num in", values, "identiNum");
            return (Criteria) this;
        }

        public Criteria andIdentiNumNotIn(List<String> values) {
            addCriterion("identi_num not in", values, "identiNum");
            return (Criteria) this;
        }

        public Criteria andIdentiNumBetween(String value1, String value2) {
            addCriterion("identi_num between", value1, value2, "identiNum");
            return (Criteria) this;
        }

        public Criteria andIdentiNumNotBetween(String value1, String value2) {
            addCriterion("identi_num not between", value1, value2, "identiNum");
            return (Criteria) this;
        }

        public Criteria andBusiLicenseIsNull() {
            addCriterion("busi_license is null");
            return (Criteria) this;
        }

        public Criteria andBusiLicenseIsNotNull() {
            addCriterion("busi_license is not null");
            return (Criteria) this;
        }

        public Criteria andBusiLicenseEqualTo(String value) {
            addCriterion("busi_license =", value, "busiLicense");
            return (Criteria) this;
        }

        public Criteria andBusiLicenseNotEqualTo(String value) {
            addCriterion("busi_license <>", value, "busiLicense");
            return (Criteria) this;
        }

        public Criteria andBusiLicenseGreaterThan(String value) {
            addCriterion("busi_license >", value, "busiLicense");
            return (Criteria) this;
        }

        public Criteria andBusiLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("busi_license >=", value, "busiLicense");
            return (Criteria) this;
        }

        public Criteria andBusiLicenseLessThan(String value) {
            addCriterion("busi_license <", value, "busiLicense");
            return (Criteria) this;
        }

        public Criteria andBusiLicenseLessThanOrEqualTo(String value) {
            addCriterion("busi_license <=", value, "busiLicense");
            return (Criteria) this;
        }

        public Criteria andBusiLicenseLike(String value) {
            addCriterion("busi_license like", value, "busiLicense");
            return (Criteria) this;
        }

        public Criteria andBusiLicenseNotLike(String value) {
            addCriterion("busi_license not like", value, "busiLicense");
            return (Criteria) this;
        }

        public Criteria andBusiLicenseIn(List<String> values) {
            addCriterion("busi_license in", values, "busiLicense");
            return (Criteria) this;
        }

        public Criteria andBusiLicenseNotIn(List<String> values) {
            addCriterion("busi_license not in", values, "busiLicense");
            return (Criteria) this;
        }

        public Criteria andBusiLicenseBetween(String value1, String value2) {
            addCriterion("busi_license between", value1, value2, "busiLicense");
            return (Criteria) this;
        }

        public Criteria andBusiLicenseNotBetween(String value1, String value2) {
            addCriterion("busi_license not between", value1, value2, "busiLicense");
            return (Criteria) this;
        }

        public Criteria andTaxRegisNumIsNull() {
            addCriterion("tax_regis_num is null");
            return (Criteria) this;
        }

        public Criteria andTaxRegisNumIsNotNull() {
            addCriterion("tax_regis_num is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRegisNumEqualTo(String value) {
            addCriterion("tax_regis_num =", value, "taxRegisNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegisNumNotEqualTo(String value) {
            addCriterion("tax_regis_num <>", value, "taxRegisNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegisNumGreaterThan(String value) {
            addCriterion("tax_regis_num >", value, "taxRegisNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegisNumGreaterThanOrEqualTo(String value) {
            addCriterion("tax_regis_num >=", value, "taxRegisNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegisNumLessThan(String value) {
            addCriterion("tax_regis_num <", value, "taxRegisNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegisNumLessThanOrEqualTo(String value) {
            addCriterion("tax_regis_num <=", value, "taxRegisNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegisNumLike(String value) {
            addCriterion("tax_regis_num like", value, "taxRegisNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegisNumNotLike(String value) {
            addCriterion("tax_regis_num not like", value, "taxRegisNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegisNumIn(List<String> values) {
            addCriterion("tax_regis_num in", values, "taxRegisNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegisNumNotIn(List<String> values) {
            addCriterion("tax_regis_num not in", values, "taxRegisNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegisNumBetween(String value1, String value2) {
            addCriterion("tax_regis_num between", value1, value2, "taxRegisNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegisNumNotBetween(String value1, String value2) {
            addCriterion("tax_regis_num not between", value1, value2, "taxRegisNum");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("flag like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("flag not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andMemStateIsNull() {
            addCriterion("mem_state is null");
            return (Criteria) this;
        }

        public Criteria andMemStateIsNotNull() {
            addCriterion("mem_state is not null");
            return (Criteria) this;
        }

        public Criteria andMemStateEqualTo(String value) {
            addCriterion("mem_state =", value, "memState");
            return (Criteria) this;
        }

        public Criteria andMemStateNotEqualTo(String value) {
            addCriterion("mem_state <>", value, "memState");
            return (Criteria) this;
        }

        public Criteria andMemStateGreaterThan(String value) {
            addCriterion("mem_state >", value, "memState");
            return (Criteria) this;
        }

        public Criteria andMemStateGreaterThanOrEqualTo(String value) {
            addCriterion("mem_state >=", value, "memState");
            return (Criteria) this;
        }

        public Criteria andMemStateLessThan(String value) {
            addCriterion("mem_state <", value, "memState");
            return (Criteria) this;
        }

        public Criteria andMemStateLessThanOrEqualTo(String value) {
            addCriterion("mem_state <=", value, "memState");
            return (Criteria) this;
        }

        public Criteria andMemStateLike(String value) {
            addCriterion("mem_state like", value, "memState");
            return (Criteria) this;
        }

        public Criteria andMemStateNotLike(String value) {
            addCriterion("mem_state not like", value, "memState");
            return (Criteria) this;
        }

        public Criteria andMemStateIn(List<String> values) {
            addCriterion("mem_state in", values, "memState");
            return (Criteria) this;
        }

        public Criteria andMemStateNotIn(List<String> values) {
            addCriterion("mem_state not in", values, "memState");
            return (Criteria) this;
        }

        public Criteria andMemStateBetween(String value1, String value2) {
            addCriterion("mem_state between", value1, value2, "memState");
            return (Criteria) this;
        }

        public Criteria andMemStateNotBetween(String value1, String value2) {
            addCriterion("mem_state not between", value1, value2, "memState");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("result like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("result not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("result not between", value1, value2, "result");
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