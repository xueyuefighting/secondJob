package com.yonyou.pojo;

import java.util.ArrayList;
import java.util.List;

public class NotificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NotificationExample() {
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

        public Criteria andSystemidIsNull() {
            addCriterion("SYSTEMID is null");
            return (Criteria) this;
        }

        public Criteria andSystemidIsNotNull() {
            addCriterion("SYSTEMID is not null");
            return (Criteria) this;
        }

        public Criteria andSystemidEqualTo(String value) {
            addCriterion("SYSTEMID =", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidNotEqualTo(String value) {
            addCriterion("SYSTEMID <>", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidGreaterThan(String value) {
            addCriterion("SYSTEMID >", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidGreaterThanOrEqualTo(String value) {
            addCriterion("SYSTEMID >=", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidLessThan(String value) {
            addCriterion("SYSTEMID <", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidLessThanOrEqualTo(String value) {
            addCriterion("SYSTEMID <=", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidLike(String value) {
            addCriterion("SYSTEMID like", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidNotLike(String value) {
            addCriterion("SYSTEMID not like", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidIn(List<String> values) {
            addCriterion("SYSTEMID in", values, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidNotIn(List<String> values) {
            addCriterion("SYSTEMID not in", values, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidBetween(String value1, String value2) {
            addCriterion("SYSTEMID between", value1, value2, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidNotBetween(String value1, String value2) {
            addCriterion("SYSTEMID not between", value1, value2, "systemid");
            return (Criteria) this;
        }

        public Criteria andCommunicationTypeIsNull() {
            addCriterion("COMMUNICATION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCommunicationTypeIsNotNull() {
            addCriterion("COMMUNICATION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCommunicationTypeEqualTo(Integer value) {
            addCriterion("COMMUNICATION_TYPE =", value, "communicationType");
            return (Criteria) this;
        }

        public Criteria andCommunicationTypeNotEqualTo(Integer value) {
            addCriterion("COMMUNICATION_TYPE <>", value, "communicationType");
            return (Criteria) this;
        }

        public Criteria andCommunicationTypeGreaterThan(Integer value) {
            addCriterion("COMMUNICATION_TYPE >", value, "communicationType");
            return (Criteria) this;
        }

        public Criteria andCommunicationTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMMUNICATION_TYPE >=", value, "communicationType");
            return (Criteria) this;
        }

        public Criteria andCommunicationTypeLessThan(Integer value) {
            addCriterion("COMMUNICATION_TYPE <", value, "communicationType");
            return (Criteria) this;
        }

        public Criteria andCommunicationTypeLessThanOrEqualTo(Integer value) {
            addCriterion("COMMUNICATION_TYPE <=", value, "communicationType");
            return (Criteria) this;
        }

        public Criteria andCommunicationTypeIn(List<Integer> values) {
            addCriterion("COMMUNICATION_TYPE in", values, "communicationType");
            return (Criteria) this;
        }

        public Criteria andCommunicationTypeNotIn(List<Integer> values) {
            addCriterion("COMMUNICATION_TYPE not in", values, "communicationType");
            return (Criteria) this;
        }

        public Criteria andCommunicationTypeBetween(Integer value1, Integer value2) {
            addCriterion("COMMUNICATION_TYPE between", value1, value2, "communicationType");
            return (Criteria) this;
        }

        public Criteria andCommunicationTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("COMMUNICATION_TYPE not between", value1, value2, "communicationType");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("MESSAGE =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("MESSAGE <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("MESSAGE >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("MESSAGE >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("MESSAGE <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("MESSAGE <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("MESSAGE like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("MESSAGE not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("MESSAGE in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("MESSAGE not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("MESSAGE between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("MESSAGE not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeIsNull() {
            addCriterion("NOTICE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeIsNotNull() {
            addCriterion("NOTICE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeEqualTo(Integer value) {
            addCriterion("NOTICE_TYPE =", value, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeNotEqualTo(Integer value) {
            addCriterion("NOTICE_TYPE <>", value, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeGreaterThan(Integer value) {
            addCriterion("NOTICE_TYPE >", value, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("NOTICE_TYPE >=", value, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeLessThan(Integer value) {
            addCriterion("NOTICE_TYPE <", value, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("NOTICE_TYPE <=", value, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeIn(List<Integer> values) {
            addCriterion("NOTICE_TYPE in", values, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeNotIn(List<Integer> values) {
            addCriterion("NOTICE_TYPE not in", values, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeBetween(Integer value1, Integer value2) {
            addCriterion("NOTICE_TYPE between", value1, value2, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("NOTICE_TYPE not between", value1, value2, "noticeType");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeIsNull() {
            addCriterion("LAST_SEND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeIsNotNull() {
            addCriterion("LAST_SEND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeEqualTo(String value) {
            addCriterion("LAST_SEND_TIME =", value, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeNotEqualTo(String value) {
            addCriterion("LAST_SEND_TIME <>", value, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeGreaterThan(String value) {
            addCriterion("LAST_SEND_TIME >", value, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_SEND_TIME >=", value, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeLessThan(String value) {
            addCriterion("LAST_SEND_TIME <", value, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeLessThanOrEqualTo(String value) {
            addCriterion("LAST_SEND_TIME <=", value, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeLike(String value) {
            addCriterion("LAST_SEND_TIME like", value, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeNotLike(String value) {
            addCriterion("LAST_SEND_TIME not like", value, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeIn(List<String> values) {
            addCriterion("LAST_SEND_TIME in", values, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeNotIn(List<String> values) {
            addCriterion("LAST_SEND_TIME not in", values, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeBetween(String value1, String value2) {
            addCriterion("LAST_SEND_TIME between", value1, value2, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeNotBetween(String value1, String value2) {
            addCriterion("LAST_SEND_TIME not between", value1, value2, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusIsNull() {
            addCriterion("NOTICE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusIsNotNull() {
            addCriterion("NOTICE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusEqualTo(Integer value) {
            addCriterion("NOTICE_STATUS =", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusNotEqualTo(Integer value) {
            addCriterion("NOTICE_STATUS <>", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusGreaterThan(Integer value) {
            addCriterion("NOTICE_STATUS >", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("NOTICE_STATUS >=", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusLessThan(Integer value) {
            addCriterion("NOTICE_STATUS <", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("NOTICE_STATUS <=", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusIn(List<Integer> values) {
            addCriterion("NOTICE_STATUS in", values, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusNotIn(List<Integer> values) {
            addCriterion("NOTICE_STATUS not in", values, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusBetween(Integer value1, Integer value2) {
            addCriterion("NOTICE_STATUS between", value1, value2, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("NOTICE_STATUS not between", value1, value2, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andSendCountIsNull() {
            addCriterion("SEND_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andSendCountIsNotNull() {
            addCriterion("SEND_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSendCountEqualTo(Integer value) {
            addCriterion("SEND_COUNT =", value, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountNotEqualTo(Integer value) {
            addCriterion("SEND_COUNT <>", value, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountGreaterThan(Integer value) {
            addCriterion("SEND_COUNT >", value, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("SEND_COUNT >=", value, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountLessThan(Integer value) {
            addCriterion("SEND_COUNT <", value, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountLessThanOrEqualTo(Integer value) {
            addCriterion("SEND_COUNT <=", value, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountIn(List<Integer> values) {
            addCriterion("SEND_COUNT in", values, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountNotIn(List<Integer> values) {
            addCriterion("SEND_COUNT not in", values, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountBetween(Integer value1, Integer value2) {
            addCriterion("SEND_COUNT between", value1, value2, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountNotBetween(Integer value1, Integer value2) {
            addCriterion("SEND_COUNT not between", value1, value2, "sendCount");
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