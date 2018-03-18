package com.yonyou.scf.common.entity;

import java.util.ArrayList;
import java.util.List;

public class FinancingApplicationProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinancingApplicationProductExample() {
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

        public Criteria andInterfaceNoIsNull() {
            addCriterion("interface_no is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceNoIsNotNull() {
            addCriterion("interface_no is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceNoEqualTo(String value) {
            addCriterion("interface_no =", value, "interfaceNo");
            return (Criteria) this;
        }

        public Criteria andInterfaceNoNotEqualTo(String value) {
            addCriterion("interface_no <>", value, "interfaceNo");
            return (Criteria) this;
        }

        public Criteria andInterfaceNoGreaterThan(String value) {
            addCriterion("interface_no >", value, "interfaceNo");
            return (Criteria) this;
        }

        public Criteria andInterfaceNoGreaterThanOrEqualTo(String value) {
            addCriterion("interface_no >=", value, "interfaceNo");
            return (Criteria) this;
        }

        public Criteria andInterfaceNoLessThan(String value) {
            addCriterion("interface_no <", value, "interfaceNo");
            return (Criteria) this;
        }

        public Criteria andInterfaceNoLessThanOrEqualTo(String value) {
            addCriterion("interface_no <=", value, "interfaceNo");
            return (Criteria) this;
        }

        public Criteria andInterfaceNoLike(String value) {
            addCriterion("interface_no like", value, "interfaceNo");
            return (Criteria) this;
        }

        public Criteria andInterfaceNoNotLike(String value) {
            addCriterion("interface_no not like", value, "interfaceNo");
            return (Criteria) this;
        }

        public Criteria andInterfaceNoIn(List<String> values) {
            addCriterion("interface_no in", values, "interfaceNo");
            return (Criteria) this;
        }

        public Criteria andInterfaceNoNotIn(List<String> values) {
            addCriterion("interface_no not in", values, "interfaceNo");
            return (Criteria) this;
        }

        public Criteria andInterfaceNoBetween(String value1, String value2) {
            addCriterion("interface_no between", value1, value2, "interfaceNo");
            return (Criteria) this;
        }

        public Criteria andInterfaceNoNotBetween(String value1, String value2) {
            addCriterion("interface_no not between", value1, value2, "interfaceNo");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationIdIsNull() {
            addCriterion("financing_application_id is null");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationIdIsNotNull() {
            addCriterion("financing_application_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationIdEqualTo(String value) {
            addCriterion("financing_application_id =", value, "financingApplicationId");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationIdNotEqualTo(String value) {
            addCriterion("financing_application_id <>", value, "financingApplicationId");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationIdGreaterThan(String value) {
            addCriterion("financing_application_id >", value, "financingApplicationId");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationIdGreaterThanOrEqualTo(String value) {
            addCriterion("financing_application_id >=", value, "financingApplicationId");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationIdLessThan(String value) {
            addCriterion("financing_application_id <", value, "financingApplicationId");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationIdLessThanOrEqualTo(String value) {
            addCriterion("financing_application_id <=", value, "financingApplicationId");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationIdLike(String value) {
            addCriterion("financing_application_id like", value, "financingApplicationId");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationIdNotLike(String value) {
            addCriterion("financing_application_id not like", value, "financingApplicationId");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationIdIn(List<String> values) {
            addCriterion("financing_application_id in", values, "financingApplicationId");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationIdNotIn(List<String> values) {
            addCriterion("financing_application_id not in", values, "financingApplicationId");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationIdBetween(String value1, String value2) {
            addCriterion("financing_application_id between", value1, value2, "financingApplicationId");
            return (Criteria) this;
        }

        public Criteria andFinancingApplicationIdNotBetween(String value1, String value2) {
            addCriterion("financing_application_id not between", value1, value2, "financingApplicationId");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductStandardIsNull() {
            addCriterion("product_standard is null");
            return (Criteria) this;
        }

        public Criteria andProductStandardIsNotNull() {
            addCriterion("product_standard is not null");
            return (Criteria) this;
        }

        public Criteria andProductStandardEqualTo(String value) {
            addCriterion("product_standard =", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardNotEqualTo(String value) {
            addCriterion("product_standard <>", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardGreaterThan(String value) {
            addCriterion("product_standard >", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardGreaterThanOrEqualTo(String value) {
            addCriterion("product_standard >=", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardLessThan(String value) {
            addCriterion("product_standard <", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardLessThanOrEqualTo(String value) {
            addCriterion("product_standard <=", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardLike(String value) {
            addCriterion("product_standard like", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardNotLike(String value) {
            addCriterion("product_standard not like", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardIn(List<String> values) {
            addCriterion("product_standard in", values, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardNotIn(List<String> values) {
            addCriterion("product_standard not in", values, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardBetween(String value1, String value2) {
            addCriterion("product_standard between", value1, value2, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardNotBetween(String value1, String value2) {
            addCriterion("product_standard not between", value1, value2, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductUnitIsNull() {
            addCriterion("product_unit is null");
            return (Criteria) this;
        }

        public Criteria andProductUnitIsNotNull() {
            addCriterion("product_unit is not null");
            return (Criteria) this;
        }

        public Criteria andProductUnitEqualTo(String value) {
            addCriterion("product_unit =", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotEqualTo(String value) {
            addCriterion("product_unit <>", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitGreaterThan(String value) {
            addCriterion("product_unit >", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitGreaterThanOrEqualTo(String value) {
            addCriterion("product_unit >=", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitLessThan(String value) {
            addCriterion("product_unit <", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitLessThanOrEqualTo(String value) {
            addCriterion("product_unit <=", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitLike(String value) {
            addCriterion("product_unit like", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotLike(String value) {
            addCriterion("product_unit not like", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitIn(List<String> values) {
            addCriterion("product_unit in", values, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotIn(List<String> values) {
            addCriterion("product_unit not in", values, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitBetween(String value1, String value2) {
            addCriterion("product_unit between", value1, value2, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotBetween(String value1, String value2) {
            addCriterion("product_unit not between", value1, value2, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductNumIsNull() {
            addCriterion("product_num is null");
            return (Criteria) this;
        }

        public Criteria andProductNumIsNotNull() {
            addCriterion("product_num is not null");
            return (Criteria) this;
        }

        public Criteria andProductNumEqualTo(Integer value) {
            addCriterion("product_num =", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotEqualTo(Integer value) {
            addCriterion("product_num <>", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThan(Integer value) {
            addCriterion("product_num >", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_num >=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThan(Integer value) {
            addCriterion("product_num <", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThanOrEqualTo(Integer value) {
            addCriterion("product_num <=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumIn(List<Integer> values) {
            addCriterion("product_num in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotIn(List<Integer> values) {
            addCriterion("product_num not in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumBetween(Integer value1, Integer value2) {
            addCriterion("product_num between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotBetween(Integer value1, Integer value2) {
            addCriterion("product_num not between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductAmountIsNull() {
            addCriterion("product_amount is null");
            return (Criteria) this;
        }

        public Criteria andProductAmountIsNotNull() {
            addCriterion("product_amount is not null");
            return (Criteria) this;
        }

        public Criteria andProductAmountEqualTo(Long value) {
            addCriterion("product_amount =", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountNotEqualTo(Long value) {
            addCriterion("product_amount <>", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountGreaterThan(Long value) {
            addCriterion("product_amount >", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("product_amount >=", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountLessThan(Long value) {
            addCriterion("product_amount <", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountLessThanOrEqualTo(Long value) {
            addCriterion("product_amount <=", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountIn(List<Long> values) {
            addCriterion("product_amount in", values, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountNotIn(List<Long> values) {
            addCriterion("product_amount not in", values, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountBetween(Long value1, Long value2) {
            addCriterion("product_amount between", value1, value2, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountNotBetween(Long value1, Long value2) {
            addCriterion("product_amount not between", value1, value2, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductStorageNameIsNull() {
            addCriterion("product_storage_name is null");
            return (Criteria) this;
        }

        public Criteria andProductStorageNameIsNotNull() {
            addCriterion("product_storage_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductStorageNameEqualTo(String value) {
            addCriterion("product_storage_name =", value, "productStorageName");
            return (Criteria) this;
        }

        public Criteria andProductStorageNameNotEqualTo(String value) {
            addCriterion("product_storage_name <>", value, "productStorageName");
            return (Criteria) this;
        }

        public Criteria andProductStorageNameGreaterThan(String value) {
            addCriterion("product_storage_name >", value, "productStorageName");
            return (Criteria) this;
        }

        public Criteria andProductStorageNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_storage_name >=", value, "productStorageName");
            return (Criteria) this;
        }

        public Criteria andProductStorageNameLessThan(String value) {
            addCriterion("product_storage_name <", value, "productStorageName");
            return (Criteria) this;
        }

        public Criteria andProductStorageNameLessThanOrEqualTo(String value) {
            addCriterion("product_storage_name <=", value, "productStorageName");
            return (Criteria) this;
        }

        public Criteria andProductStorageNameLike(String value) {
            addCriterion("product_storage_name like", value, "productStorageName");
            return (Criteria) this;
        }

        public Criteria andProductStorageNameNotLike(String value) {
            addCriterion("product_storage_name not like", value, "productStorageName");
            return (Criteria) this;
        }

        public Criteria andProductStorageNameIn(List<String> values) {
            addCriterion("product_storage_name in", values, "productStorageName");
            return (Criteria) this;
        }

        public Criteria andProductStorageNameNotIn(List<String> values) {
            addCriterion("product_storage_name not in", values, "productStorageName");
            return (Criteria) this;
        }

        public Criteria andProductStorageNameBetween(String value1, String value2) {
            addCriterion("product_storage_name between", value1, value2, "productStorageName");
            return (Criteria) this;
        }

        public Criteria andProductStorageNameNotBetween(String value1, String value2) {
            addCriterion("product_storage_name not between", value1, value2, "productStorageName");
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

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(String value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(String value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(String value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(String value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(String value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLike(String value) {
            addCriterion("modify_time like", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotLike(String value) {
            addCriterion("modify_time not like", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<String> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<String> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(String value1, String value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(String value1, String value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
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