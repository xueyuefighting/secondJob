package com.yonyou.scf.common.entity;

import java.util.ArrayList;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserStyleIsNull() {
            addCriterion("user_style is null");
            return (Criteria) this;
        }

        public Criteria andUserStyleIsNotNull() {
            addCriterion("user_style is not null");
            return (Criteria) this;
        }

        public Criteria andUserStyleEqualTo(String value) {
            addCriterion("user_style =", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleNotEqualTo(String value) {
            addCriterion("user_style <>", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleGreaterThan(String value) {
            addCriterion("user_style >", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleGreaterThanOrEqualTo(String value) {
            addCriterion("user_style >=", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleLessThan(String value) {
            addCriterion("user_style <", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleLessThanOrEqualTo(String value) {
            addCriterion("user_style <=", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleLike(String value) {
            addCriterion("user_style like", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleNotLike(String value) {
            addCriterion("user_style not like", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleIn(List<String> values) {
            addCriterion("user_style in", values, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleNotIn(List<String> values) {
            addCriterion("user_style not in", values, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleBetween(String value1, String value2) {
            addCriterion("user_style between", value1, value2, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleNotBetween(String value1, String value2) {
            addCriterion("user_style not between", value1, value2, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeIsNull() {
            addCriterion("credential_type is null");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeIsNotNull() {
            addCriterion("credential_type is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeEqualTo(String value) {
            addCriterion("credential_type =", value, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeNotEqualTo(String value) {
            addCriterion("credential_type <>", value, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeGreaterThan(String value) {
            addCriterion("credential_type >", value, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeGreaterThanOrEqualTo(String value) {
            addCriterion("credential_type >=", value, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeLessThan(String value) {
            addCriterion("credential_type <", value, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeLessThanOrEqualTo(String value) {
            addCriterion("credential_type <=", value, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeLike(String value) {
            addCriterion("credential_type like", value, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeNotLike(String value) {
            addCriterion("credential_type not like", value, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeIn(List<String> values) {
            addCriterion("credential_type in", values, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeNotIn(List<String> values) {
            addCriterion("credential_type not in", values, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeBetween(String value1, String value2) {
            addCriterion("credential_type between", value1, value2, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeNotBetween(String value1, String value2) {
            addCriterion("credential_type not between", value1, value2, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialNumIsNull() {
            addCriterion("credential_num is null");
            return (Criteria) this;
        }

        public Criteria andCredentialNumIsNotNull() {
            addCriterion("credential_num is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialNumEqualTo(String value) {
            addCriterion("credential_num =", value, "credentialNum");
            return (Criteria) this;
        }

        public Criteria andCredentialNumNotEqualTo(String value) {
            addCriterion("credential_num <>", value, "credentialNum");
            return (Criteria) this;
        }

        public Criteria andCredentialNumGreaterThan(String value) {
            addCriterion("credential_num >", value, "credentialNum");
            return (Criteria) this;
        }

        public Criteria andCredentialNumGreaterThanOrEqualTo(String value) {
            addCriterion("credential_num >=", value, "credentialNum");
            return (Criteria) this;
        }

        public Criteria andCredentialNumLessThan(String value) {
            addCriterion("credential_num <", value, "credentialNum");
            return (Criteria) this;
        }

        public Criteria andCredentialNumLessThanOrEqualTo(String value) {
            addCriterion("credential_num <=", value, "credentialNum");
            return (Criteria) this;
        }

        public Criteria andCredentialNumLike(String value) {
            addCriterion("credential_num like", value, "credentialNum");
            return (Criteria) this;
        }

        public Criteria andCredentialNumNotLike(String value) {
            addCriterion("credential_num not like", value, "credentialNum");
            return (Criteria) this;
        }

        public Criteria andCredentialNumIn(List<String> values) {
            addCriterion("credential_num in", values, "credentialNum");
            return (Criteria) this;
        }

        public Criteria andCredentialNumNotIn(List<String> values) {
            addCriterion("credential_num not in", values, "credentialNum");
            return (Criteria) this;
        }

        public Criteria andCredentialNumBetween(String value1, String value2) {
            addCriterion("credential_num between", value1, value2, "credentialNum");
            return (Criteria) this;
        }

        public Criteria andCredentialNumNotBetween(String value1, String value2) {
            addCriterion("credential_num not between", value1, value2, "credentialNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIsNull() {
            addCriterion("phone_num is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIsNotNull() {
            addCriterion("phone_num is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumEqualTo(String value) {
            addCriterion("phone_num =", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotEqualTo(String value) {
            addCriterion("phone_num <>", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumGreaterThan(String value) {
            addCriterion("phone_num >", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumGreaterThanOrEqualTo(String value) {
            addCriterion("phone_num >=", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLessThan(String value) {
            addCriterion("phone_num <", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLessThanOrEqualTo(String value) {
            addCriterion("phone_num <=", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLike(String value) {
            addCriterion("phone_num like", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotLike(String value) {
            addCriterion("phone_num not like", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIn(List<String> values) {
            addCriterion("phone_num in", values, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotIn(List<String> values) {
            addCriterion("phone_num not in", values, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumBetween(String value1, String value2) {
            addCriterion("phone_num between", value1, value2, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotBetween(String value1, String value2) {
            addCriterion("phone_num not between", value1, value2, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andCredentialPicIsNull() {
            addCriterion("credential_pic is null");
            return (Criteria) this;
        }

        public Criteria andCredentialPicIsNotNull() {
            addCriterion("credential_pic is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialPicEqualTo(Long value) {
            addCriterion("credential_pic =", value, "credentialPic");
            return (Criteria) this;
        }

        public Criteria andCredentialPicNotEqualTo(Long value) {
            addCriterion("credential_pic <>", value, "credentialPic");
            return (Criteria) this;
        }

        public Criteria andCredentialPicGreaterThan(Long value) {
            addCriterion("credential_pic >", value, "credentialPic");
            return (Criteria) this;
        }

        public Criteria andCredentialPicGreaterThanOrEqualTo(Long value) {
            addCriterion("credential_pic >=", value, "credentialPic");
            return (Criteria) this;
        }

        public Criteria andCredentialPicLessThan(Long value) {
            addCriterion("credential_pic <", value, "credentialPic");
            return (Criteria) this;
        }

        public Criteria andCredentialPicLessThanOrEqualTo(Long value) {
            addCriterion("credential_pic <=", value, "credentialPic");
            return (Criteria) this;
        }

        public Criteria andCredentialPicIn(List<Long> values) {
            addCriterion("credential_pic in", values, "credentialPic");
            return (Criteria) this;
        }

        public Criteria andCredentialPicNotIn(List<Long> values) {
            addCriterion("credential_pic not in", values, "credentialPic");
            return (Criteria) this;
        }

        public Criteria andCredentialPicBetween(Long value1, Long value2) {
            addCriterion("credential_pic between", value1, value2, "credentialPic");
            return (Criteria) this;
        }

        public Criteria andCredentialPicNotBetween(Long value1, Long value2) {
            addCriterion("credential_pic not between", value1, value2, "credentialPic");
            return (Criteria) this;
        }

        public Criteria andCredentialPic2IsNull() {
            addCriterion("credential_pic2 is null");
            return (Criteria) this;
        }

        public Criteria andCredentialPic2IsNotNull() {
            addCriterion("credential_pic2 is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialPic2EqualTo(Long value) {
            addCriterion("credential_pic2 =", value, "credentialPic2");
            return (Criteria) this;
        }

        public Criteria andCredentialPic2NotEqualTo(Long value) {
            addCriterion("credential_pic2 <>", value, "credentialPic2");
            return (Criteria) this;
        }

        public Criteria andCredentialPic2GreaterThan(Long value) {
            addCriterion("credential_pic2 >", value, "credentialPic2");
            return (Criteria) this;
        }

        public Criteria andCredentialPic2GreaterThanOrEqualTo(Long value) {
            addCriterion("credential_pic2 >=", value, "credentialPic2");
            return (Criteria) this;
        }

        public Criteria andCredentialPic2LessThan(Long value) {
            addCriterion("credential_pic2 <", value, "credentialPic2");
            return (Criteria) this;
        }

        public Criteria andCredentialPic2LessThanOrEqualTo(Long value) {
            addCriterion("credential_pic2 <=", value, "credentialPic2");
            return (Criteria) this;
        }

        public Criteria andCredentialPic2In(List<Long> values) {
            addCriterion("credential_pic2 in", values, "credentialPic2");
            return (Criteria) this;
        }

        public Criteria andCredentialPic2NotIn(List<Long> values) {
            addCriterion("credential_pic2 not in", values, "credentialPic2");
            return (Criteria) this;
        }

        public Criteria andCredentialPic2Between(Long value1, Long value2) {
            addCriterion("credential_pic2 between", value1, value2, "credentialPic2");
            return (Criteria) this;
        }

        public Criteria andCredentialPic2NotBetween(Long value1, Long value2) {
            addCriterion("credential_pic2 not between", value1, value2, "credentialPic2");
            return (Criteria) this;
        }

        public Criteria andEducationalLevelIsNull() {
            addCriterion("educational_level is null");
            return (Criteria) this;
        }

        public Criteria andEducationalLevelIsNotNull() {
            addCriterion("educational_level is not null");
            return (Criteria) this;
        }

        public Criteria andEducationalLevelEqualTo(String value) {
            addCriterion("educational_level =", value, "educationalLevel");
            return (Criteria) this;
        }

        public Criteria andEducationalLevelNotEqualTo(String value) {
            addCriterion("educational_level <>", value, "educationalLevel");
            return (Criteria) this;
        }

        public Criteria andEducationalLevelGreaterThan(String value) {
            addCriterion("educational_level >", value, "educationalLevel");
            return (Criteria) this;
        }

        public Criteria andEducationalLevelGreaterThanOrEqualTo(String value) {
            addCriterion("educational_level >=", value, "educationalLevel");
            return (Criteria) this;
        }

        public Criteria andEducationalLevelLessThan(String value) {
            addCriterion("educational_level <", value, "educationalLevel");
            return (Criteria) this;
        }

        public Criteria andEducationalLevelLessThanOrEqualTo(String value) {
            addCriterion("educational_level <=", value, "educationalLevel");
            return (Criteria) this;
        }

        public Criteria andEducationalLevelLike(String value) {
            addCriterion("educational_level like", value, "educationalLevel");
            return (Criteria) this;
        }

        public Criteria andEducationalLevelNotLike(String value) {
            addCriterion("educational_level not like", value, "educationalLevel");
            return (Criteria) this;
        }

        public Criteria andEducationalLevelIn(List<String> values) {
            addCriterion("educational_level in", values, "educationalLevel");
            return (Criteria) this;
        }

        public Criteria andEducationalLevelNotIn(List<String> values) {
            addCriterion("educational_level not in", values, "educationalLevel");
            return (Criteria) this;
        }

        public Criteria andEducationalLevelBetween(String value1, String value2) {
            addCriterion("educational_level between", value1, value2, "educationalLevel");
            return (Criteria) this;
        }

        public Criteria andEducationalLevelNotBetween(String value1, String value2) {
            addCriterion("educational_level not between", value1, value2, "educationalLevel");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNull() {
            addCriterion("marital_status is null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNotNull() {
            addCriterion("marital_status is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusEqualTo(String value) {
            addCriterion("marital_status =", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotEqualTo(String value) {
            addCriterion("marital_status <>", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThan(String value) {
            addCriterion("marital_status >", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("marital_status >=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThan(String value) {
            addCriterion("marital_status <", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThanOrEqualTo(String value) {
            addCriterion("marital_status <=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLike(String value) {
            addCriterion("marital_status like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotLike(String value) {
            addCriterion("marital_status not like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIn(List<String> values) {
            addCriterion("marital_status in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotIn(List<String> values) {
            addCriterion("marital_status not in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusBetween(String value1, String value2) {
            addCriterion("marital_status between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotBetween(String value1, String value2) {
            addCriterion("marital_status not between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andEnableStatusIsNull() {
            addCriterion("enable_status is null");
            return (Criteria) this;
        }

        public Criteria andEnableStatusIsNotNull() {
            addCriterion("enable_status is not null");
            return (Criteria) this;
        }

        public Criteria andEnableStatusEqualTo(String value) {
            addCriterion("enable_status =", value, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusNotEqualTo(String value) {
            addCriterion("enable_status <>", value, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusGreaterThan(String value) {
            addCriterion("enable_status >", value, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusGreaterThanOrEqualTo(String value) {
            addCriterion("enable_status >=", value, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusLessThan(String value) {
            addCriterion("enable_status <", value, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusLessThanOrEqualTo(String value) {
            addCriterion("enable_status <=", value, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusLike(String value) {
            addCriterion("enable_status like", value, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusNotLike(String value) {
            addCriterion("enable_status not like", value, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusIn(List<String> values) {
            addCriterion("enable_status in", values, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusNotIn(List<String> values) {
            addCriterion("enable_status not in", values, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusBetween(String value1, String value2) {
            addCriterion("enable_status between", value1, value2, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusNotBetween(String value1, String value2) {
            addCriterion("enable_status not between", value1, value2, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusIsNull() {
            addCriterion("auditing_status is null");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusIsNotNull() {
            addCriterion("auditing_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusEqualTo(String value) {
            addCriterion("auditing_status =", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusNotEqualTo(String value) {
            addCriterion("auditing_status <>", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusGreaterThan(String value) {
            addCriterion("auditing_status >", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusGreaterThanOrEqualTo(String value) {
            addCriterion("auditing_status >=", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusLessThan(String value) {
            addCriterion("auditing_status <", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusLessThanOrEqualTo(String value) {
            addCriterion("auditing_status <=", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusLike(String value) {
            addCriterion("auditing_status like", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusNotLike(String value) {
            addCriterion("auditing_status not like", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusIn(List<String> values) {
            addCriterion("auditing_status in", values, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusNotIn(List<String> values) {
            addCriterion("auditing_status not in", values, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusBetween(String value1, String value2) {
            addCriterion("auditing_status between", value1, value2, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusNotBetween(String value1, String value2) {
            addCriterion("auditing_status not between", value1, value2, "auditingStatus");
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

        public Criteria andCredentialHandIsNull() {
            addCriterion("credential_hand is null");
            return (Criteria) this;
        }

        public Criteria andCredentialHandIsNotNull() {
            addCriterion("credential_hand is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialHandEqualTo(Long value) {
            addCriterion("credential_hand =", value, "credentialHand");
            return (Criteria) this;
        }

        public Criteria andCredentialHandNotEqualTo(Long value) {
            addCriterion("credential_hand <>", value, "credentialHand");
            return (Criteria) this;
        }

        public Criteria andCredentialHandGreaterThan(Long value) {
            addCriterion("credential_hand >", value, "credentialHand");
            return (Criteria) this;
        }

        public Criteria andCredentialHandGreaterThanOrEqualTo(Long value) {
            addCriterion("credential_hand >=", value, "credentialHand");
            return (Criteria) this;
        }

        public Criteria andCredentialHandLessThan(Long value) {
            addCriterion("credential_hand <", value, "credentialHand");
            return (Criteria) this;
        }

        public Criteria andCredentialHandLessThanOrEqualTo(Long value) {
            addCriterion("credential_hand <=", value, "credentialHand");
            return (Criteria) this;
        }

        public Criteria andCredentialHandIn(List<Long> values) {
            addCriterion("credential_hand in", values, "credentialHand");
            return (Criteria) this;
        }

        public Criteria andCredentialHandNotIn(List<Long> values) {
            addCriterion("credential_hand not in", values, "credentialHand");
            return (Criteria) this;
        }

        public Criteria andCredentialHandBetween(Long value1, Long value2) {
            addCriterion("credential_hand between", value1, value2, "credentialHand");
            return (Criteria) this;
        }

        public Criteria andCredentialHandNotBetween(Long value1, Long value2) {
            addCriterion("credential_hand not between", value1, value2, "credentialHand");
            return (Criteria) this;
        }

        public Criteria andAreaPIsNull() {
            addCriterion("area_p is null");
            return (Criteria) this;
        }

        public Criteria andAreaPIsNotNull() {
            addCriterion("area_p is not null");
            return (Criteria) this;
        }

        public Criteria andAreaPEqualTo(String value) {
            addCriterion("area_p =", value, "areaP");
            return (Criteria) this;
        }

        public Criteria andAreaPNotEqualTo(String value) {
            addCriterion("area_p <>", value, "areaP");
            return (Criteria) this;
        }

        public Criteria andAreaPGreaterThan(String value) {
            addCriterion("area_p >", value, "areaP");
            return (Criteria) this;
        }

        public Criteria andAreaPGreaterThanOrEqualTo(String value) {
            addCriterion("area_p >=", value, "areaP");
            return (Criteria) this;
        }

        public Criteria andAreaPLessThan(String value) {
            addCriterion("area_p <", value, "areaP");
            return (Criteria) this;
        }

        public Criteria andAreaPLessThanOrEqualTo(String value) {
            addCriterion("area_p <=", value, "areaP");
            return (Criteria) this;
        }

        public Criteria andAreaPLike(String value) {
            addCriterion("area_p like", value, "areaP");
            return (Criteria) this;
        }

        public Criteria andAreaPNotLike(String value) {
            addCriterion("area_p not like", value, "areaP");
            return (Criteria) this;
        }

        public Criteria andAreaPIn(List<String> values) {
            addCriterion("area_p in", values, "areaP");
            return (Criteria) this;
        }

        public Criteria andAreaPNotIn(List<String> values) {
            addCriterion("area_p not in", values, "areaP");
            return (Criteria) this;
        }

        public Criteria andAreaPBetween(String value1, String value2) {
            addCriterion("area_p between", value1, value2, "areaP");
            return (Criteria) this;
        }

        public Criteria andAreaPNotBetween(String value1, String value2) {
            addCriterion("area_p not between", value1, value2, "areaP");
            return (Criteria) this;
        }

        public Criteria andAreaCIsNull() {
            addCriterion("area_c is null");
            return (Criteria) this;
        }

        public Criteria andAreaCIsNotNull() {
            addCriterion("area_c is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCEqualTo(String value) {
            addCriterion("area_c =", value, "areaC");
            return (Criteria) this;
        }

        public Criteria andAreaCNotEqualTo(String value) {
            addCriterion("area_c <>", value, "areaC");
            return (Criteria) this;
        }

        public Criteria andAreaCGreaterThan(String value) {
            addCriterion("area_c >", value, "areaC");
            return (Criteria) this;
        }

        public Criteria andAreaCGreaterThanOrEqualTo(String value) {
            addCriterion("area_c >=", value, "areaC");
            return (Criteria) this;
        }

        public Criteria andAreaCLessThan(String value) {
            addCriterion("area_c <", value, "areaC");
            return (Criteria) this;
        }

        public Criteria andAreaCLessThanOrEqualTo(String value) {
            addCriterion("area_c <=", value, "areaC");
            return (Criteria) this;
        }

        public Criteria andAreaCLike(String value) {
            addCriterion("area_c like", value, "areaC");
            return (Criteria) this;
        }

        public Criteria andAreaCNotLike(String value) {
            addCriterion("area_c not like", value, "areaC");
            return (Criteria) this;
        }

        public Criteria andAreaCIn(List<String> values) {
            addCriterion("area_c in", values, "areaC");
            return (Criteria) this;
        }

        public Criteria andAreaCNotIn(List<String> values) {
            addCriterion("area_c not in", values, "areaC");
            return (Criteria) this;
        }

        public Criteria andAreaCBetween(String value1, String value2) {
            addCriterion("area_c between", value1, value2, "areaC");
            return (Criteria) this;
        }

        public Criteria andAreaCNotBetween(String value1, String value2) {
            addCriterion("area_c not between", value1, value2, "areaC");
            return (Criteria) this;
        }

        public Criteria andAreaQIsNull() {
            addCriterion("area_q is null");
            return (Criteria) this;
        }

        public Criteria andAreaQIsNotNull() {
            addCriterion("area_q is not null");
            return (Criteria) this;
        }

        public Criteria andAreaQEqualTo(String value) {
            addCriterion("area_q =", value, "areaQ");
            return (Criteria) this;
        }

        public Criteria andAreaQNotEqualTo(String value) {
            addCriterion("area_q <>", value, "areaQ");
            return (Criteria) this;
        }

        public Criteria andAreaQGreaterThan(String value) {
            addCriterion("area_q >", value, "areaQ");
            return (Criteria) this;
        }

        public Criteria andAreaQGreaterThanOrEqualTo(String value) {
            addCriterion("area_q >=", value, "areaQ");
            return (Criteria) this;
        }

        public Criteria andAreaQLessThan(String value) {
            addCriterion("area_q <", value, "areaQ");
            return (Criteria) this;
        }

        public Criteria andAreaQLessThanOrEqualTo(String value) {
            addCriterion("area_q <=", value, "areaQ");
            return (Criteria) this;
        }

        public Criteria andAreaQLike(String value) {
            addCriterion("area_q like", value, "areaQ");
            return (Criteria) this;
        }

        public Criteria andAreaQNotLike(String value) {
            addCriterion("area_q not like", value, "areaQ");
            return (Criteria) this;
        }

        public Criteria andAreaQIn(List<String> values) {
            addCriterion("area_q in", values, "areaQ");
            return (Criteria) this;
        }

        public Criteria andAreaQNotIn(List<String> values) {
            addCriterion("area_q not in", values, "areaQ");
            return (Criteria) this;
        }

        public Criteria andAreaQBetween(String value1, String value2) {
            addCriterion("area_q between", value1, value2, "areaQ");
            return (Criteria) this;
        }

        public Criteria andAreaQNotBetween(String value1, String value2) {
            addCriterion("area_q not between", value1, value2, "areaQ");
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