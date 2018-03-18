package com.yonyou.scf.common.entity;

import java.util.ArrayList;
import java.util.List;

public class OrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderInfoExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date not between", value1, value2, "date");
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

        public Criteria andBorrowingBusinessIsNull() {
            addCriterion("borrowing_business is null");
            return (Criteria) this;
        }

        public Criteria andBorrowingBusinessIsNotNull() {
            addCriterion("borrowing_business is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowingBusinessEqualTo(Long value) {
            addCriterion("borrowing_business =", value, "borrowingBusiness");
            return (Criteria) this;
        }

        public Criteria andBorrowingBusinessNotEqualTo(Long value) {
            addCriterion("borrowing_business <>", value, "borrowingBusiness");
            return (Criteria) this;
        }

        public Criteria andBorrowingBusinessGreaterThan(Long value) {
            addCriterion("borrowing_business >", value, "borrowingBusiness");
            return (Criteria) this;
        }

        public Criteria andBorrowingBusinessGreaterThanOrEqualTo(Long value) {
            addCriterion("borrowing_business >=", value, "borrowingBusiness");
            return (Criteria) this;
        }

        public Criteria andBorrowingBusinessLessThan(Long value) {
            addCriterion("borrowing_business <", value, "borrowingBusiness");
            return (Criteria) this;
        }

        public Criteria andBorrowingBusinessLessThanOrEqualTo(Long value) {
            addCriterion("borrowing_business <=", value, "borrowingBusiness");
            return (Criteria) this;
        }

        public Criteria andBorrowingBusinessIn(List<Long> values) {
            addCriterion("borrowing_business in", values, "borrowingBusiness");
            return (Criteria) this;
        }

        public Criteria andBorrowingBusinessNotIn(List<Long> values) {
            addCriterion("borrowing_business not in", values, "borrowingBusiness");
            return (Criteria) this;
        }

        public Criteria andBorrowingBusinessBetween(Long value1, Long value2) {
            addCriterion("borrowing_business between", value1, value2, "borrowingBusiness");
            return (Criteria) this;
        }

        public Criteria andBorrowingBusinessNotBetween(Long value1, Long value2) {
            addCriterion("borrowing_business not between", value1, value2, "borrowingBusiness");
            return (Criteria) this;
        }

        public Criteria andDocumentNumberIsNull() {
            addCriterion("document_number is null");
            return (Criteria) this;
        }

        public Criteria andDocumentNumberIsNotNull() {
            addCriterion("document_number is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentNumberEqualTo(String value) {
            addCriterion("document_number =", value, "documentNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentNumberNotEqualTo(String value) {
            addCriterion("document_number <>", value, "documentNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentNumberGreaterThan(String value) {
            addCriterion("document_number >", value, "documentNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("document_number >=", value, "documentNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentNumberLessThan(String value) {
            addCriterion("document_number <", value, "documentNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentNumberLessThanOrEqualTo(String value) {
            addCriterion("document_number <=", value, "documentNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentNumberLike(String value) {
            addCriterion("document_number like", value, "documentNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentNumberNotLike(String value) {
            addCriterion("document_number not like", value, "documentNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentNumberIn(List<String> values) {
            addCriterion("document_number in", values, "documentNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentNumberNotIn(List<String> values) {
            addCriterion("document_number not in", values, "documentNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentNumberBetween(String value1, String value2) {
            addCriterion("document_number between", value1, value2, "documentNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentNumberNotBetween(String value1, String value2) {
            addCriterion("document_number not between", value1, value2, "documentNumber");
            return (Criteria) this;
        }

        public Criteria andCoreBusinessIsNull() {
            addCriterion("core_business is null");
            return (Criteria) this;
        }

        public Criteria andCoreBusinessIsNotNull() {
            addCriterion("core_business is not null");
            return (Criteria) this;
        }

        public Criteria andCoreBusinessEqualTo(Long value) {
            addCriterion("core_business =", value, "coreBusiness");
            return (Criteria) this;
        }

        public Criteria andCoreBusinessNotEqualTo(Long value) {
            addCriterion("core_business <>", value, "coreBusiness");
            return (Criteria) this;
        }

        public Criteria andCoreBusinessGreaterThan(Long value) {
            addCriterion("core_business >", value, "coreBusiness");
            return (Criteria) this;
        }

        public Criteria andCoreBusinessGreaterThanOrEqualTo(Long value) {
            addCriterion("core_business >=", value, "coreBusiness");
            return (Criteria) this;
        }

        public Criteria andCoreBusinessLessThan(Long value) {
            addCriterion("core_business <", value, "coreBusiness");
            return (Criteria) this;
        }

        public Criteria andCoreBusinessLessThanOrEqualTo(Long value) {
            addCriterion("core_business <=", value, "coreBusiness");
            return (Criteria) this;
        }

        public Criteria andCoreBusinessIn(List<Long> values) {
            addCriterion("core_business in", values, "coreBusiness");
            return (Criteria) this;
        }

        public Criteria andCoreBusinessNotIn(List<Long> values) {
            addCriterion("core_business not in", values, "coreBusiness");
            return (Criteria) this;
        }

        public Criteria andCoreBusinessBetween(Long value1, Long value2) {
            addCriterion("core_business between", value1, value2, "coreBusiness");
            return (Criteria) this;
        }

        public Criteria andCoreBusinessNotBetween(Long value1, Long value2) {
            addCriterion("core_business not between", value1, value2, "coreBusiness");
            return (Criteria) this;
        }

        public Criteria andCommodityCategoriesIsNull() {
            addCriterion("commodity_categories is null");
            return (Criteria) this;
        }

        public Criteria andCommodityCategoriesIsNotNull() {
            addCriterion("commodity_categories is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityCategoriesEqualTo(String value) {
            addCriterion("commodity_categories =", value, "commodityCategories");
            return (Criteria) this;
        }

        public Criteria andCommodityCategoriesNotEqualTo(String value) {
            addCriterion("commodity_categories <>", value, "commodityCategories");
            return (Criteria) this;
        }

        public Criteria andCommodityCategoriesGreaterThan(String value) {
            addCriterion("commodity_categories >", value, "commodityCategories");
            return (Criteria) this;
        }

        public Criteria andCommodityCategoriesGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_categories >=", value, "commodityCategories");
            return (Criteria) this;
        }

        public Criteria andCommodityCategoriesLessThan(String value) {
            addCriterion("commodity_categories <", value, "commodityCategories");
            return (Criteria) this;
        }

        public Criteria andCommodityCategoriesLessThanOrEqualTo(String value) {
            addCriterion("commodity_categories <=", value, "commodityCategories");
            return (Criteria) this;
        }

        public Criteria andCommodityCategoriesLike(String value) {
            addCriterion("commodity_categories like", value, "commodityCategories");
            return (Criteria) this;
        }

        public Criteria andCommodityCategoriesNotLike(String value) {
            addCriterion("commodity_categories not like", value, "commodityCategories");
            return (Criteria) this;
        }

        public Criteria andCommodityCategoriesIn(List<String> values) {
            addCriterion("commodity_categories in", values, "commodityCategories");
            return (Criteria) this;
        }

        public Criteria andCommodityCategoriesNotIn(List<String> values) {
            addCriterion("commodity_categories not in", values, "commodityCategories");
            return (Criteria) this;
        }

        public Criteria andCommodityCategoriesBetween(String value1, String value2) {
            addCriterion("commodity_categories between", value1, value2, "commodityCategories");
            return (Criteria) this;
        }

        public Criteria andCommodityCategoriesNotBetween(String value1, String value2) {
            addCriterion("commodity_categories not between", value1, value2, "commodityCategories");
            return (Criteria) this;
        }

        public Criteria andFinancingIsNull() {
            addCriterion("financing is null");
            return (Criteria) this;
        }

        public Criteria andFinancingIsNotNull() {
            addCriterion("financing is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingEqualTo(String value) {
            addCriterion("financing =", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingNotEqualTo(String value) {
            addCriterion("financing <>", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingGreaterThan(String value) {
            addCriterion("financing >", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingGreaterThanOrEqualTo(String value) {
            addCriterion("financing >=", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingLessThan(String value) {
            addCriterion("financing <", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingLessThanOrEqualTo(String value) {
            addCriterion("financing <=", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingLike(String value) {
            addCriterion("financing like", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingNotLike(String value) {
            addCriterion("financing not like", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingIn(List<String> values) {
            addCriterion("financing in", values, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingNotIn(List<String> values) {
            addCriterion("financing not in", values, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingBetween(String value1, String value2) {
            addCriterion("financing between", value1, value2, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingNotBetween(String value1, String value2) {
            addCriterion("financing not between", value1, value2, "financing");
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

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(Long value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(Long value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(Long value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(Long value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(Long value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(Long value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<Long> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<Long> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(Long value1, Long value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(Long value1, Long value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("update_time like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("update_time not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andInvalidIsNull() {
            addCriterion("invalid is null");
            return (Criteria) this;
        }

        public Criteria andInvalidIsNotNull() {
            addCriterion("invalid is not null");
            return (Criteria) this;
        }

        public Criteria andInvalidEqualTo(String value) {
            addCriterion("invalid =", value, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidNotEqualTo(String value) {
            addCriterion("invalid <>", value, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidGreaterThan(String value) {
            addCriterion("invalid >", value, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidGreaterThanOrEqualTo(String value) {
            addCriterion("invalid >=", value, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidLessThan(String value) {
            addCriterion("invalid <", value, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidLessThanOrEqualTo(String value) {
            addCriterion("invalid <=", value, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidLike(String value) {
            addCriterion("invalid like", value, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidNotLike(String value) {
            addCriterion("invalid not like", value, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidIn(List<String> values) {
            addCriterion("invalid in", values, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidNotIn(List<String> values) {
            addCriterion("invalid not in", values, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidBetween(String value1, String value2) {
            addCriterion("invalid between", value1, value2, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidNotBetween(String value1, String value2) {
            addCriterion("invalid not between", value1, value2, "invalid");
            return (Criteria) this;
        }

        public Criteria andBorrowingBusinessTypeIsNull() {
            addCriterion("borrowing_business_type is null");
            return (Criteria) this;
        }

        public Criteria andBorrowingBusinessTypeIsNotNull() {
            addCriterion("borrowing_business_type is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowingBusinessTypeEqualTo(String value) {
            addCriterion("borrowing_business_type =", value, "borrowingBusinessType");
            return (Criteria) this;
        }

        public Criteria andBorrowingBusinessTypeNotEqualTo(String value) {
            addCriterion("borrowing_business_type <>", value, "borrowingBusinessType");
            return (Criteria) this;
        }

        public Criteria andBorrowingBusinessTypeGreaterThan(String value) {
            addCriterion("borrowing_business_type >", value, "borrowingBusinessType");
            return (Criteria) this;
        }

        public Criteria andBorrowingBusinessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("borrowing_business_type >=", value, "borrowingBusinessType");
            return (Criteria) this;
        }

        public Criteria andBorrowingBusinessTypeLessThan(String value) {
            addCriterion("borrowing_business_type <", value, "borrowingBusinessType");
            return (Criteria) this;
        }

        public Criteria andBorrowingBusinessTypeLessThanOrEqualTo(String value) {
            addCriterion("borrowing_business_type <=", value, "borrowingBusinessType");
            return (Criteria) this;
        }

        public Criteria andBorrowingBusinessTypeLike(String value) {
            addCriterion("borrowing_business_type like", value, "borrowingBusinessType");
            return (Criteria) this;
        }

        public Criteria andBorrowingBusinessTypeNotLike(String value) {
            addCriterion("borrowing_business_type not like", value, "borrowingBusinessType");
            return (Criteria) this;
        }

        public Criteria andBorrowingBusinessTypeIn(List<String> values) {
            addCriterion("borrowing_business_type in", values, "borrowingBusinessType");
            return (Criteria) this;
        }

        public Criteria andBorrowingBusinessTypeNotIn(List<String> values) {
            addCriterion("borrowing_business_type not in", values, "borrowingBusinessType");
            return (Criteria) this;
        }

        public Criteria andBorrowingBusinessTypeBetween(String value1, String value2) {
            addCriterion("borrowing_business_type between", value1, value2, "borrowingBusinessType");
            return (Criteria) this;
        }

        public Criteria andBorrowingBusinessTypeNotBetween(String value1, String value2) {
            addCriterion("borrowing_business_type not between", value1, value2, "borrowingBusinessType");
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