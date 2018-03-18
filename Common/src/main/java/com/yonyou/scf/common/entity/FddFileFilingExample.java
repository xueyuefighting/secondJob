package com.yonyou.scf.common.entity;

import java.util.ArrayList;
import java.util.List;

public class FddFileFilingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FddFileFilingExample() {
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

        public Criteria andContractIdIsNull() {
            addCriterion("contract_id is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("contract_id is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(String value) {
            addCriterion("contract_id =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(String value) {
            addCriterion("contract_id <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(String value) {
            addCriterion("contract_id >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(String value) {
            addCriterion("contract_id >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(String value) {
            addCriterion("contract_id <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(String value) {
            addCriterion("contract_id <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLike(String value) {
            addCriterion("contract_id like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotLike(String value) {
            addCriterion("contract_id not like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<String> values) {
            addCriterion("contract_id in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<String> values) {
            addCriterion("contract_id not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(String value1, String value2) {
            addCriterion("contract_id between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(String value1, String value2) {
            addCriterion("contract_id not between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andFilePathnameIsNull() {
            addCriterion("file_pathname is null");
            return (Criteria) this;
        }

        public Criteria andFilePathnameIsNotNull() {
            addCriterion("file_pathname is not null");
            return (Criteria) this;
        }

        public Criteria andFilePathnameEqualTo(String value) {
            addCriterion("file_pathname =", value, "filePathname");
            return (Criteria) this;
        }

        public Criteria andFilePathnameNotEqualTo(String value) {
            addCriterion("file_pathname <>", value, "filePathname");
            return (Criteria) this;
        }

        public Criteria andFilePathnameGreaterThan(String value) {
            addCriterion("file_pathname >", value, "filePathname");
            return (Criteria) this;
        }

        public Criteria andFilePathnameGreaterThanOrEqualTo(String value) {
            addCriterion("file_pathname >=", value, "filePathname");
            return (Criteria) this;
        }

        public Criteria andFilePathnameLessThan(String value) {
            addCriterion("file_pathname <", value, "filePathname");
            return (Criteria) this;
        }

        public Criteria andFilePathnameLessThanOrEqualTo(String value) {
            addCriterion("file_pathname <=", value, "filePathname");
            return (Criteria) this;
        }

        public Criteria andFilePathnameLike(String value) {
            addCriterion("file_pathname like", value, "filePathname");
            return (Criteria) this;
        }

        public Criteria andFilePathnameNotLike(String value) {
            addCriterion("file_pathname not like", value, "filePathname");
            return (Criteria) this;
        }

        public Criteria andFilePathnameIn(List<String> values) {
            addCriterion("file_pathname in", values, "filePathname");
            return (Criteria) this;
        }

        public Criteria andFilePathnameNotIn(List<String> values) {
            addCriterion("file_pathname not in", values, "filePathname");
            return (Criteria) this;
        }

        public Criteria andFilePathnameBetween(String value1, String value2) {
            addCriterion("file_pathname between", value1, value2, "filePathname");
            return (Criteria) this;
        }

        public Criteria andFilePathnameNotBetween(String value1, String value2) {
            addCriterion("file_pathname not between", value1, value2, "filePathname");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andFddResultIsNull() {
            addCriterion("fdd_result is null");
            return (Criteria) this;
        }

        public Criteria andFddResultIsNotNull() {
            addCriterion("fdd_result is not null");
            return (Criteria) this;
        }

        public Criteria andFddResultEqualTo(String value) {
            addCriterion("fdd_result =", value, "fddResult");
            return (Criteria) this;
        }

        public Criteria andFddResultNotEqualTo(String value) {
            addCriterion("fdd_result <>", value, "fddResult");
            return (Criteria) this;
        }

        public Criteria andFddResultGreaterThan(String value) {
            addCriterion("fdd_result >", value, "fddResult");
            return (Criteria) this;
        }

        public Criteria andFddResultGreaterThanOrEqualTo(String value) {
            addCriterion("fdd_result >=", value, "fddResult");
            return (Criteria) this;
        }

        public Criteria andFddResultLessThan(String value) {
            addCriterion("fdd_result <", value, "fddResult");
            return (Criteria) this;
        }

        public Criteria andFddResultLessThanOrEqualTo(String value) {
            addCriterion("fdd_result <=", value, "fddResult");
            return (Criteria) this;
        }

        public Criteria andFddResultLike(String value) {
            addCriterion("fdd_result like", value, "fddResult");
            return (Criteria) this;
        }

        public Criteria andFddResultNotLike(String value) {
            addCriterion("fdd_result not like", value, "fddResult");
            return (Criteria) this;
        }

        public Criteria andFddResultIn(List<String> values) {
            addCriterion("fdd_result in", values, "fddResult");
            return (Criteria) this;
        }

        public Criteria andFddResultNotIn(List<String> values) {
            addCriterion("fdd_result not in", values, "fddResult");
            return (Criteria) this;
        }

        public Criteria andFddResultBetween(String value1, String value2) {
            addCriterion("fdd_result between", value1, value2, "fddResult");
            return (Criteria) this;
        }

        public Criteria andFddResultNotBetween(String value1, String value2) {
            addCriterion("fdd_result not between", value1, value2, "fddResult");
            return (Criteria) this;
        }

        public Criteria andFddCodeIsNull() {
            addCriterion("fdd_code is null");
            return (Criteria) this;
        }

        public Criteria andFddCodeIsNotNull() {
            addCriterion("fdd_code is not null");
            return (Criteria) this;
        }

        public Criteria andFddCodeEqualTo(String value) {
            addCriterion("fdd_code =", value, "fddCode");
            return (Criteria) this;
        }

        public Criteria andFddCodeNotEqualTo(String value) {
            addCriterion("fdd_code <>", value, "fddCode");
            return (Criteria) this;
        }

        public Criteria andFddCodeGreaterThan(String value) {
            addCriterion("fdd_code >", value, "fddCode");
            return (Criteria) this;
        }

        public Criteria andFddCodeGreaterThanOrEqualTo(String value) {
            addCriterion("fdd_code >=", value, "fddCode");
            return (Criteria) this;
        }

        public Criteria andFddCodeLessThan(String value) {
            addCriterion("fdd_code <", value, "fddCode");
            return (Criteria) this;
        }

        public Criteria andFddCodeLessThanOrEqualTo(String value) {
            addCriterion("fdd_code <=", value, "fddCode");
            return (Criteria) this;
        }

        public Criteria andFddCodeLike(String value) {
            addCriterion("fdd_code like", value, "fddCode");
            return (Criteria) this;
        }

        public Criteria andFddCodeNotLike(String value) {
            addCriterion("fdd_code not like", value, "fddCode");
            return (Criteria) this;
        }

        public Criteria andFddCodeIn(List<String> values) {
            addCriterion("fdd_code in", values, "fddCode");
            return (Criteria) this;
        }

        public Criteria andFddCodeNotIn(List<String> values) {
            addCriterion("fdd_code not in", values, "fddCode");
            return (Criteria) this;
        }

        public Criteria andFddCodeBetween(String value1, String value2) {
            addCriterion("fdd_code between", value1, value2, "fddCode");
            return (Criteria) this;
        }

        public Criteria andFddCodeNotBetween(String value1, String value2) {
            addCriterion("fdd_code not between", value1, value2, "fddCode");
            return (Criteria) this;
        }

        public Criteria andFddMsgIsNull() {
            addCriterion("fdd_msg is null");
            return (Criteria) this;
        }

        public Criteria andFddMsgIsNotNull() {
            addCriterion("fdd_msg is not null");
            return (Criteria) this;
        }

        public Criteria andFddMsgEqualTo(String value) {
            addCriterion("fdd_msg =", value, "fddMsg");
            return (Criteria) this;
        }

        public Criteria andFddMsgNotEqualTo(String value) {
            addCriterion("fdd_msg <>", value, "fddMsg");
            return (Criteria) this;
        }

        public Criteria andFddMsgGreaterThan(String value) {
            addCriterion("fdd_msg >", value, "fddMsg");
            return (Criteria) this;
        }

        public Criteria andFddMsgGreaterThanOrEqualTo(String value) {
            addCriterion("fdd_msg >=", value, "fddMsg");
            return (Criteria) this;
        }

        public Criteria andFddMsgLessThan(String value) {
            addCriterion("fdd_msg <", value, "fddMsg");
            return (Criteria) this;
        }

        public Criteria andFddMsgLessThanOrEqualTo(String value) {
            addCriterion("fdd_msg <=", value, "fddMsg");
            return (Criteria) this;
        }

        public Criteria andFddMsgLike(String value) {
            addCriterion("fdd_msg like", value, "fddMsg");
            return (Criteria) this;
        }

        public Criteria andFddMsgNotLike(String value) {
            addCriterion("fdd_msg not like", value, "fddMsg");
            return (Criteria) this;
        }

        public Criteria andFddMsgIn(List<String> values) {
            addCriterion("fdd_msg in", values, "fddMsg");
            return (Criteria) this;
        }

        public Criteria andFddMsgNotIn(List<String> values) {
            addCriterion("fdd_msg not in", values, "fddMsg");
            return (Criteria) this;
        }

        public Criteria andFddMsgBetween(String value1, String value2) {
            addCriterion("fdd_msg between", value1, value2, "fddMsg");
            return (Criteria) this;
        }

        public Criteria andFddMsgNotBetween(String value1, String value2) {
            addCriterion("fdd_msg not between", value1, value2, "fddMsg");
            return (Criteria) this;
        }

        public Criteria andFddViewUrlIsNull() {
            addCriterion("fdd_view_url is null");
            return (Criteria) this;
        }

        public Criteria andFddViewUrlIsNotNull() {
            addCriterion("fdd_view_url is not null");
            return (Criteria) this;
        }

        public Criteria andFddViewUrlEqualTo(String value) {
            addCriterion("fdd_view_url =", value, "fddViewUrl");
            return (Criteria) this;
        }

        public Criteria andFddViewUrlNotEqualTo(String value) {
            addCriterion("fdd_view_url <>", value, "fddViewUrl");
            return (Criteria) this;
        }

        public Criteria andFddViewUrlGreaterThan(String value) {
            addCriterion("fdd_view_url >", value, "fddViewUrl");
            return (Criteria) this;
        }

        public Criteria andFddViewUrlGreaterThanOrEqualTo(String value) {
            addCriterion("fdd_view_url >=", value, "fddViewUrl");
            return (Criteria) this;
        }

        public Criteria andFddViewUrlLessThan(String value) {
            addCriterion("fdd_view_url <", value, "fddViewUrl");
            return (Criteria) this;
        }

        public Criteria andFddViewUrlLessThanOrEqualTo(String value) {
            addCriterion("fdd_view_url <=", value, "fddViewUrl");
            return (Criteria) this;
        }

        public Criteria andFddViewUrlLike(String value) {
            addCriterion("fdd_view_url like", value, "fddViewUrl");
            return (Criteria) this;
        }

        public Criteria andFddViewUrlNotLike(String value) {
            addCriterion("fdd_view_url not like", value, "fddViewUrl");
            return (Criteria) this;
        }

        public Criteria andFddViewUrlIn(List<String> values) {
            addCriterion("fdd_view_url in", values, "fddViewUrl");
            return (Criteria) this;
        }

        public Criteria andFddViewUrlNotIn(List<String> values) {
            addCriterion("fdd_view_url not in", values, "fddViewUrl");
            return (Criteria) this;
        }

        public Criteria andFddViewUrlBetween(String value1, String value2) {
            addCriterion("fdd_view_url between", value1, value2, "fddViewUrl");
            return (Criteria) this;
        }

        public Criteria andFddViewUrlNotBetween(String value1, String value2) {
            addCriterion("fdd_view_url not between", value1, value2, "fddViewUrl");
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