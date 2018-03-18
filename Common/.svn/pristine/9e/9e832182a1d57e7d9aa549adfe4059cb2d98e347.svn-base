package com.yonyou.scf.common.entity;

import java.util.ArrayList;
import java.util.List;

public class PlatformLandingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlatformLandingExample() {
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

        public Criteria andPlatformIdIsNull() {
            addCriterion("platform_id is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIsNotNull() {
            addCriterion("platform_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformIdEqualTo(String value) {
            addCriterion("platform_id =", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotEqualTo(String value) {
            addCriterion("platform_id <>", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdGreaterThan(String value) {
            addCriterion("platform_id >", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdGreaterThanOrEqualTo(String value) {
            addCriterion("platform_id >=", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdLessThan(String value) {
            addCriterion("platform_id <", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdLessThanOrEqualTo(String value) {
            addCriterion("platform_id <=", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdLike(String value) {
            addCriterion("platform_id like", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotLike(String value) {
            addCriterion("platform_id not like", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIn(List<String> values) {
            addCriterion("platform_id in", values, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotIn(List<String> values) {
            addCriterion("platform_id not in", values, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdBetween(String value1, String value2) {
            addCriterion("platform_id between", value1, value2, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotBetween(String value1, String value2) {
            addCriterion("platform_id not between", value1, value2, "platformId");
            return (Criteria) this;
        }

        public Criteria andFundIdIsNull() {
            addCriterion("fund_id is null");
            return (Criteria) this;
        }

        public Criteria andFundIdIsNotNull() {
            addCriterion("fund_id is not null");
            return (Criteria) this;
        }

        public Criteria andFundIdEqualTo(String value) {
            addCriterion("fund_id =", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdNotEqualTo(String value) {
            addCriterion("fund_id <>", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdGreaterThan(String value) {
            addCriterion("fund_id >", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdGreaterThanOrEqualTo(String value) {
            addCriterion("fund_id >=", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdLessThan(String value) {
            addCriterion("fund_id <", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdLessThanOrEqualTo(String value) {
            addCriterion("fund_id <=", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdLike(String value) {
            addCriterion("fund_id like", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdNotLike(String value) {
            addCriterion("fund_id not like", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdIn(List<String> values) {
            addCriterion("fund_id in", values, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdNotIn(List<String> values) {
            addCriterion("fund_id not in", values, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdBetween(String value1, String value2) {
            addCriterion("fund_id between", value1, value2, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdNotBetween(String value1, String value2) {
            addCriterion("fund_id not between", value1, value2, "fundId");
            return (Criteria) this;
        }

        public Criteria andMerchantUserIdIsNull() {
            addCriterion("merchant_user_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchantUserIdIsNotNull() {
            addCriterion("merchant_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantUserIdEqualTo(String value) {
            addCriterion("merchant_user_id =", value, "merchantUserId");
            return (Criteria) this;
        }

        public Criteria andMerchantUserIdNotEqualTo(String value) {
            addCriterion("merchant_user_id <>", value, "merchantUserId");
            return (Criteria) this;
        }

        public Criteria andMerchantUserIdGreaterThan(String value) {
            addCriterion("merchant_user_id >", value, "merchantUserId");
            return (Criteria) this;
        }

        public Criteria andMerchantUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_user_id >=", value, "merchantUserId");
            return (Criteria) this;
        }

        public Criteria andMerchantUserIdLessThan(String value) {
            addCriterion("merchant_user_id <", value, "merchantUserId");
            return (Criteria) this;
        }

        public Criteria andMerchantUserIdLessThanOrEqualTo(String value) {
            addCriterion("merchant_user_id <=", value, "merchantUserId");
            return (Criteria) this;
        }

        public Criteria andMerchantUserIdLike(String value) {
            addCriterion("merchant_user_id like", value, "merchantUserId");
            return (Criteria) this;
        }

        public Criteria andMerchantUserIdNotLike(String value) {
            addCriterion("merchant_user_id not like", value, "merchantUserId");
            return (Criteria) this;
        }

        public Criteria andMerchantUserIdIn(List<String> values) {
            addCriterion("merchant_user_id in", values, "merchantUserId");
            return (Criteria) this;
        }

        public Criteria andMerchantUserIdNotIn(List<String> values) {
            addCriterion("merchant_user_id not in", values, "merchantUserId");
            return (Criteria) this;
        }

        public Criteria andMerchantUserIdBetween(String value1, String value2) {
            addCriterion("merchant_user_id between", value1, value2, "merchantUserId");
            return (Criteria) this;
        }

        public Criteria andMerchantUserIdNotBetween(String value1, String value2) {
            addCriterion("merchant_user_id not between", value1, value2, "merchantUserId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsNull() {
            addCriterion("user_role is null");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsNotNull() {
            addCriterion("user_role is not null");
            return (Criteria) this;
        }

        public Criteria andUserRoleEqualTo(Integer value) {
            addCriterion("user_role =", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotEqualTo(Integer value) {
            addCriterion("user_role <>", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleGreaterThan(Integer value) {
            addCriterion("user_role >", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_role >=", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleLessThan(Integer value) {
            addCriterion("user_role <", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleLessThanOrEqualTo(Integer value) {
            addCriterion("user_role <=", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleIn(List<Integer> values) {
            addCriterion("user_role in", values, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotIn(List<Integer> values) {
            addCriterion("user_role not in", values, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleBetween(Integer value1, Integer value2) {
            addCriterion("user_role between", value1, value2, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotBetween(Integer value1, Integer value2) {
            addCriterion("user_role not between", value1, value2, "userRole");
            return (Criteria) this;
        }

        public Criteria andControllerTypeIsNull() {
            addCriterion("controller_type is null");
            return (Criteria) this;
        }

        public Criteria andControllerTypeIsNotNull() {
            addCriterion("controller_type is not null");
            return (Criteria) this;
        }

        public Criteria andControllerTypeEqualTo(Integer value) {
            addCriterion("controller_type =", value, "controllerType");
            return (Criteria) this;
        }

        public Criteria andControllerTypeNotEqualTo(Integer value) {
            addCriterion("controller_type <>", value, "controllerType");
            return (Criteria) this;
        }

        public Criteria andControllerTypeGreaterThan(Integer value) {
            addCriterion("controller_type >", value, "controllerType");
            return (Criteria) this;
        }

        public Criteria andControllerTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("controller_type >=", value, "controllerType");
            return (Criteria) this;
        }

        public Criteria andControllerTypeLessThan(Integer value) {
            addCriterion("controller_type <", value, "controllerType");
            return (Criteria) this;
        }

        public Criteria andControllerTypeLessThanOrEqualTo(Integer value) {
            addCriterion("controller_type <=", value, "controllerType");
            return (Criteria) this;
        }

        public Criteria andControllerTypeIn(List<Integer> values) {
            addCriterion("controller_type in", values, "controllerType");
            return (Criteria) this;
        }

        public Criteria andControllerTypeNotIn(List<Integer> values) {
            addCriterion("controller_type not in", values, "controllerType");
            return (Criteria) this;
        }

        public Criteria andControllerTypeBetween(Integer value1, Integer value2) {
            addCriterion("controller_type between", value1, value2, "controllerType");
            return (Criteria) this;
        }

        public Criteria andControllerTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("controller_type not between", value1, value2, "controllerType");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentIpIsNull() {
            addCriterion("login_current_ip is null");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentIpIsNotNull() {
            addCriterion("login_current_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentIpEqualTo(String value) {
            addCriterion("login_current_ip =", value, "loginCurrentIp");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentIpNotEqualTo(String value) {
            addCriterion("login_current_ip <>", value, "loginCurrentIp");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentIpGreaterThan(String value) {
            addCriterion("login_current_ip >", value, "loginCurrentIp");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentIpGreaterThanOrEqualTo(String value) {
            addCriterion("login_current_ip >=", value, "loginCurrentIp");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentIpLessThan(String value) {
            addCriterion("login_current_ip <", value, "loginCurrentIp");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentIpLessThanOrEqualTo(String value) {
            addCriterion("login_current_ip <=", value, "loginCurrentIp");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentIpLike(String value) {
            addCriterion("login_current_ip like", value, "loginCurrentIp");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentIpNotLike(String value) {
            addCriterion("login_current_ip not like", value, "loginCurrentIp");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentIpIn(List<String> values) {
            addCriterion("login_current_ip in", values, "loginCurrentIp");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentIpNotIn(List<String> values) {
            addCriterion("login_current_ip not in", values, "loginCurrentIp");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentIpBetween(String value1, String value2) {
            addCriterion("login_current_ip between", value1, value2, "loginCurrentIp");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentIpNotBetween(String value1, String value2) {
            addCriterion("login_current_ip not between", value1, value2, "loginCurrentIp");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentAddressIsNull() {
            addCriterion("login_current_address is null");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentAddressIsNotNull() {
            addCriterion("login_current_address is not null");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentAddressEqualTo(String value) {
            addCriterion("login_current_address =", value, "loginCurrentAddress");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentAddressNotEqualTo(String value) {
            addCriterion("login_current_address <>", value, "loginCurrentAddress");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentAddressGreaterThan(String value) {
            addCriterion("login_current_address >", value, "loginCurrentAddress");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentAddressGreaterThanOrEqualTo(String value) {
            addCriterion("login_current_address >=", value, "loginCurrentAddress");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentAddressLessThan(String value) {
            addCriterion("login_current_address <", value, "loginCurrentAddress");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentAddressLessThanOrEqualTo(String value) {
            addCriterion("login_current_address <=", value, "loginCurrentAddress");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentAddressLike(String value) {
            addCriterion("login_current_address like", value, "loginCurrentAddress");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentAddressNotLike(String value) {
            addCriterion("login_current_address not like", value, "loginCurrentAddress");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentAddressIn(List<String> values) {
            addCriterion("login_current_address in", values, "loginCurrentAddress");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentAddressNotIn(List<String> values) {
            addCriterion("login_current_address not in", values, "loginCurrentAddress");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentAddressBetween(String value1, String value2) {
            addCriterion("login_current_address between", value1, value2, "loginCurrentAddress");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentAddressNotBetween(String value1, String value2) {
            addCriterion("login_current_address not between", value1, value2, "loginCurrentAddress");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentTimeIsNull() {
            addCriterion("login_current_time is null");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentTimeIsNotNull() {
            addCriterion("login_current_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentTimeEqualTo(String value) {
            addCriterion("login_current_time =", value, "loginCurrentTime");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentTimeNotEqualTo(String value) {
            addCriterion("login_current_time <>", value, "loginCurrentTime");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentTimeGreaterThan(String value) {
            addCriterion("login_current_time >", value, "loginCurrentTime");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentTimeGreaterThanOrEqualTo(String value) {
            addCriterion("login_current_time >=", value, "loginCurrentTime");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentTimeLessThan(String value) {
            addCriterion("login_current_time <", value, "loginCurrentTime");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentTimeLessThanOrEqualTo(String value) {
            addCriterion("login_current_time <=", value, "loginCurrentTime");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentTimeLike(String value) {
            addCriterion("login_current_time like", value, "loginCurrentTime");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentTimeNotLike(String value) {
            addCriterion("login_current_time not like", value, "loginCurrentTime");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentTimeIn(List<String> values) {
            addCriterion("login_current_time in", values, "loginCurrentTime");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentTimeNotIn(List<String> values) {
            addCriterion("login_current_time not in", values, "loginCurrentTime");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentTimeBetween(String value1, String value2) {
            addCriterion("login_current_time between", value1, value2, "loginCurrentTime");
            return (Criteria) this;
        }

        public Criteria andLoginCurrentTimeNotBetween(String value1, String value2) {
            addCriterion("login_current_time not between", value1, value2, "loginCurrentTime");
            return (Criteria) this;
        }

        public Criteria andLoginLastIpIsNull() {
            addCriterion("login_last_ip is null");
            return (Criteria) this;
        }

        public Criteria andLoginLastIpIsNotNull() {
            addCriterion("login_last_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLoginLastIpEqualTo(String value) {
            addCriterion("login_last_ip =", value, "loginLastIp");
            return (Criteria) this;
        }

        public Criteria andLoginLastIpNotEqualTo(String value) {
            addCriterion("login_last_ip <>", value, "loginLastIp");
            return (Criteria) this;
        }

        public Criteria andLoginLastIpGreaterThan(String value) {
            addCriterion("login_last_ip >", value, "loginLastIp");
            return (Criteria) this;
        }

        public Criteria andLoginLastIpGreaterThanOrEqualTo(String value) {
            addCriterion("login_last_ip >=", value, "loginLastIp");
            return (Criteria) this;
        }

        public Criteria andLoginLastIpLessThan(String value) {
            addCriterion("login_last_ip <", value, "loginLastIp");
            return (Criteria) this;
        }

        public Criteria andLoginLastIpLessThanOrEqualTo(String value) {
            addCriterion("login_last_ip <=", value, "loginLastIp");
            return (Criteria) this;
        }

        public Criteria andLoginLastIpLike(String value) {
            addCriterion("login_last_ip like", value, "loginLastIp");
            return (Criteria) this;
        }

        public Criteria andLoginLastIpNotLike(String value) {
            addCriterion("login_last_ip not like", value, "loginLastIp");
            return (Criteria) this;
        }

        public Criteria andLoginLastIpIn(List<String> values) {
            addCriterion("login_last_ip in", values, "loginLastIp");
            return (Criteria) this;
        }

        public Criteria andLoginLastIpNotIn(List<String> values) {
            addCriterion("login_last_ip not in", values, "loginLastIp");
            return (Criteria) this;
        }

        public Criteria andLoginLastIpBetween(String value1, String value2) {
            addCriterion("login_last_ip between", value1, value2, "loginLastIp");
            return (Criteria) this;
        }

        public Criteria andLoginLastIpNotBetween(String value1, String value2) {
            addCriterion("login_last_ip not between", value1, value2, "loginLastIp");
            return (Criteria) this;
        }

        public Criteria andLoginLastAddressIsNull() {
            addCriterion("login_last_address is null");
            return (Criteria) this;
        }

        public Criteria andLoginLastAddressIsNotNull() {
            addCriterion("login_last_address is not null");
            return (Criteria) this;
        }

        public Criteria andLoginLastAddressEqualTo(String value) {
            addCriterion("login_last_address =", value, "loginLastAddress");
            return (Criteria) this;
        }

        public Criteria andLoginLastAddressNotEqualTo(String value) {
            addCriterion("login_last_address <>", value, "loginLastAddress");
            return (Criteria) this;
        }

        public Criteria andLoginLastAddressGreaterThan(String value) {
            addCriterion("login_last_address >", value, "loginLastAddress");
            return (Criteria) this;
        }

        public Criteria andLoginLastAddressGreaterThanOrEqualTo(String value) {
            addCriterion("login_last_address >=", value, "loginLastAddress");
            return (Criteria) this;
        }

        public Criteria andLoginLastAddressLessThan(String value) {
            addCriterion("login_last_address <", value, "loginLastAddress");
            return (Criteria) this;
        }

        public Criteria andLoginLastAddressLessThanOrEqualTo(String value) {
            addCriterion("login_last_address <=", value, "loginLastAddress");
            return (Criteria) this;
        }

        public Criteria andLoginLastAddressLike(String value) {
            addCriterion("login_last_address like", value, "loginLastAddress");
            return (Criteria) this;
        }

        public Criteria andLoginLastAddressNotLike(String value) {
            addCriterion("login_last_address not like", value, "loginLastAddress");
            return (Criteria) this;
        }

        public Criteria andLoginLastAddressIn(List<String> values) {
            addCriterion("login_last_address in", values, "loginLastAddress");
            return (Criteria) this;
        }

        public Criteria andLoginLastAddressNotIn(List<String> values) {
            addCriterion("login_last_address not in", values, "loginLastAddress");
            return (Criteria) this;
        }

        public Criteria andLoginLastAddressBetween(String value1, String value2) {
            addCriterion("login_last_address between", value1, value2, "loginLastAddress");
            return (Criteria) this;
        }

        public Criteria andLoginLastAddressNotBetween(String value1, String value2) {
            addCriterion("login_last_address not between", value1, value2, "loginLastAddress");
            return (Criteria) this;
        }

        public Criteria andLoginLastTimeIsNull() {
            addCriterion("login_last_time is null");
            return (Criteria) this;
        }

        public Criteria andLoginLastTimeIsNotNull() {
            addCriterion("login_last_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoginLastTimeEqualTo(String value) {
            addCriterion("login_last_time =", value, "loginLastTime");
            return (Criteria) this;
        }

        public Criteria andLoginLastTimeNotEqualTo(String value) {
            addCriterion("login_last_time <>", value, "loginLastTime");
            return (Criteria) this;
        }

        public Criteria andLoginLastTimeGreaterThan(String value) {
            addCriterion("login_last_time >", value, "loginLastTime");
            return (Criteria) this;
        }

        public Criteria andLoginLastTimeGreaterThanOrEqualTo(String value) {
            addCriterion("login_last_time >=", value, "loginLastTime");
            return (Criteria) this;
        }

        public Criteria andLoginLastTimeLessThan(String value) {
            addCriterion("login_last_time <", value, "loginLastTime");
            return (Criteria) this;
        }

        public Criteria andLoginLastTimeLessThanOrEqualTo(String value) {
            addCriterion("login_last_time <=", value, "loginLastTime");
            return (Criteria) this;
        }

        public Criteria andLoginLastTimeLike(String value) {
            addCriterion("login_last_time like", value, "loginLastTime");
            return (Criteria) this;
        }

        public Criteria andLoginLastTimeNotLike(String value) {
            addCriterion("login_last_time not like", value, "loginLastTime");
            return (Criteria) this;
        }

        public Criteria andLoginLastTimeIn(List<String> values) {
            addCriterion("login_last_time in", values, "loginLastTime");
            return (Criteria) this;
        }

        public Criteria andLoginLastTimeNotIn(List<String> values) {
            addCriterion("login_last_time not in", values, "loginLastTime");
            return (Criteria) this;
        }

        public Criteria andLoginLastTimeBetween(String value1, String value2) {
            addCriterion("login_last_time between", value1, value2, "loginLastTime");
            return (Criteria) this;
        }

        public Criteria andLoginLastTimeNotBetween(String value1, String value2) {
            addCriterion("login_last_time not between", value1, value2, "loginLastTime");
            return (Criteria) this;
        }

        public Criteria andLoginNumIsNull() {
            addCriterion("login_num is null");
            return (Criteria) this;
        }

        public Criteria andLoginNumIsNotNull() {
            addCriterion("login_num is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNumEqualTo(Integer value) {
            addCriterion("login_num =", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumNotEqualTo(Integer value) {
            addCriterion("login_num <>", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumGreaterThan(Integer value) {
            addCriterion("login_num >", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_num >=", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumLessThan(Integer value) {
            addCriterion("login_num <", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumLessThanOrEqualTo(Integer value) {
            addCriterion("login_num <=", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumIn(List<Integer> values) {
            addCriterion("login_num in", values, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumNotIn(List<Integer> values) {
            addCriterion("login_num not in", values, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumBetween(Integer value1, Integer value2) {
            addCriterion("login_num between", value1, value2, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumNotBetween(Integer value1, Integer value2) {
            addCriterion("login_num not between", value1, value2, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginLimitTypeIsNull() {
            addCriterion("login_limit_type is null");
            return (Criteria) this;
        }

        public Criteria andLoginLimitTypeIsNotNull() {
            addCriterion("login_limit_type is not null");
            return (Criteria) this;
        }

        public Criteria andLoginLimitTypeEqualTo(Integer value) {
            addCriterion("login_limit_type =", value, "loginLimitType");
            return (Criteria) this;
        }

        public Criteria andLoginLimitTypeNotEqualTo(Integer value) {
            addCriterion("login_limit_type <>", value, "loginLimitType");
            return (Criteria) this;
        }

        public Criteria andLoginLimitTypeGreaterThan(Integer value) {
            addCriterion("login_limit_type >", value, "loginLimitType");
            return (Criteria) this;
        }

        public Criteria andLoginLimitTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_limit_type >=", value, "loginLimitType");
            return (Criteria) this;
        }

        public Criteria andLoginLimitTypeLessThan(Integer value) {
            addCriterion("login_limit_type <", value, "loginLimitType");
            return (Criteria) this;
        }

        public Criteria andLoginLimitTypeLessThanOrEqualTo(Integer value) {
            addCriterion("login_limit_type <=", value, "loginLimitType");
            return (Criteria) this;
        }

        public Criteria andLoginLimitTypeIn(List<Integer> values) {
            addCriterion("login_limit_type in", values, "loginLimitType");
            return (Criteria) this;
        }

        public Criteria andLoginLimitTypeNotIn(List<Integer> values) {
            addCriterion("login_limit_type not in", values, "loginLimitType");
            return (Criteria) this;
        }

        public Criteria andLoginLimitTypeBetween(Integer value1, Integer value2) {
            addCriterion("login_limit_type between", value1, value2, "loginLimitType");
            return (Criteria) this;
        }

        public Criteria andLoginLimitTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("login_limit_type not between", value1, value2, "loginLimitType");
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