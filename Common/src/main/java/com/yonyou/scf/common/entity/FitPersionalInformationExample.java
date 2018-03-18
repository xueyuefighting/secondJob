package com.yonyou.scf.common.entity;

import java.util.ArrayList;
import java.util.List;

public class FitPersionalInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FitPersionalInformationExample() {
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

        public Criteria andFiGroupIdIsNull() {
            addCriterion("fi_group_id is null");
            return (Criteria) this;
        }

        public Criteria andFiGroupIdIsNotNull() {
            addCriterion("fi_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andFiGroupIdEqualTo(String value) {
            addCriterion("fi_group_id =", value, "fiGroupId");
            return (Criteria) this;
        }

        public Criteria andFiGroupIdNotEqualTo(String value) {
            addCriterion("fi_group_id <>", value, "fiGroupId");
            return (Criteria) this;
        }

        public Criteria andFiGroupIdGreaterThan(String value) {
            addCriterion("fi_group_id >", value, "fiGroupId");
            return (Criteria) this;
        }

        public Criteria andFiGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("fi_group_id >=", value, "fiGroupId");
            return (Criteria) this;
        }

        public Criteria andFiGroupIdLessThan(String value) {
            addCriterion("fi_group_id <", value, "fiGroupId");
            return (Criteria) this;
        }

        public Criteria andFiGroupIdLessThanOrEqualTo(String value) {
            addCriterion("fi_group_id <=", value, "fiGroupId");
            return (Criteria) this;
        }

        public Criteria andFiGroupIdLike(String value) {
            addCriterion("fi_group_id like", value, "fiGroupId");
            return (Criteria) this;
        }

        public Criteria andFiGroupIdNotLike(String value) {
            addCriterion("fi_group_id not like", value, "fiGroupId");
            return (Criteria) this;
        }

        public Criteria andFiGroupIdIn(List<String> values) {
            addCriterion("fi_group_id in", values, "fiGroupId");
            return (Criteria) this;
        }

        public Criteria andFiGroupIdNotIn(List<String> values) {
            addCriterion("fi_group_id not in", values, "fiGroupId");
            return (Criteria) this;
        }

        public Criteria andFiGroupIdBetween(String value1, String value2) {
            addCriterion("fi_group_id between", value1, value2, "fiGroupId");
            return (Criteria) this;
        }

        public Criteria andFiGroupIdNotBetween(String value1, String value2) {
            addCriterion("fi_group_id not between", value1, value2, "fiGroupId");
            return (Criteria) this;
        }

        public Criteria andFsIdIsNull() {
            addCriterion("fs_id is null");
            return (Criteria) this;
        }

        public Criteria andFsIdIsNotNull() {
            addCriterion("fs_id is not null");
            return (Criteria) this;
        }

        public Criteria andFsIdEqualTo(String value) {
            addCriterion("fs_id =", value, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsIdNotEqualTo(String value) {
            addCriterion("fs_id <>", value, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsIdGreaterThan(String value) {
            addCriterion("fs_id >", value, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsIdGreaterThanOrEqualTo(String value) {
            addCriterion("fs_id >=", value, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsIdLessThan(String value) {
            addCriterion("fs_id <", value, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsIdLessThanOrEqualTo(String value) {
            addCriterion("fs_id <=", value, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsIdLike(String value) {
            addCriterion("fs_id like", value, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsIdNotLike(String value) {
            addCriterion("fs_id not like", value, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsIdIn(List<String> values) {
            addCriterion("fs_id in", values, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsIdNotIn(List<String> values) {
            addCriterion("fs_id not in", values, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsIdBetween(String value1, String value2) {
            addCriterion("fs_id between", value1, value2, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsIdNotBetween(String value1, String value2) {
            addCriterion("fs_id not between", value1, value2, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsTypeIsNull() {
            addCriterion("fs_type is null");
            return (Criteria) this;
        }

        public Criteria andFsTypeIsNotNull() {
            addCriterion("fs_type is not null");
            return (Criteria) this;
        }

        public Criteria andFsTypeEqualTo(Integer value) {
            addCriterion("fs_type =", value, "fsType");
            return (Criteria) this;
        }

        public Criteria andFsTypeNotEqualTo(Integer value) {
            addCriterion("fs_type <>", value, "fsType");
            return (Criteria) this;
        }

        public Criteria andFsTypeGreaterThan(Integer value) {
            addCriterion("fs_type >", value, "fsType");
            return (Criteria) this;
        }

        public Criteria andFsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("fs_type >=", value, "fsType");
            return (Criteria) this;
        }

        public Criteria andFsTypeLessThan(Integer value) {
            addCriterion("fs_type <", value, "fsType");
            return (Criteria) this;
        }

        public Criteria andFsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("fs_type <=", value, "fsType");
            return (Criteria) this;
        }

        public Criteria andFsTypeIn(List<Integer> values) {
            addCriterion("fs_type in", values, "fsType");
            return (Criteria) this;
        }

        public Criteria andFsTypeNotIn(List<Integer> values) {
            addCriterion("fs_type not in", values, "fsType");
            return (Criteria) this;
        }

        public Criteria andFsTypeBetween(Integer value1, Integer value2) {
            addCriterion("fs_type between", value1, value2, "fsType");
            return (Criteria) this;
        }

        public Criteria andFsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("fs_type not between", value1, value2, "fsType");
            return (Criteria) this;
        }

        public Criteria andFsNameIsNull() {
            addCriterion("fs_name is null");
            return (Criteria) this;
        }

        public Criteria andFsNameIsNotNull() {
            addCriterion("fs_name is not null");
            return (Criteria) this;
        }

        public Criteria andFsNameEqualTo(String value) {
            addCriterion("fs_name =", value, "fsName");
            return (Criteria) this;
        }

        public Criteria andFsNameNotEqualTo(String value) {
            addCriterion("fs_name <>", value, "fsName");
            return (Criteria) this;
        }

        public Criteria andFsNameGreaterThan(String value) {
            addCriterion("fs_name >", value, "fsName");
            return (Criteria) this;
        }

        public Criteria andFsNameGreaterThanOrEqualTo(String value) {
            addCriterion("fs_name >=", value, "fsName");
            return (Criteria) this;
        }

        public Criteria andFsNameLessThan(String value) {
            addCriterion("fs_name <", value, "fsName");
            return (Criteria) this;
        }

        public Criteria andFsNameLessThanOrEqualTo(String value) {
            addCriterion("fs_name <=", value, "fsName");
            return (Criteria) this;
        }

        public Criteria andFsNameLike(String value) {
            addCriterion("fs_name like", value, "fsName");
            return (Criteria) this;
        }

        public Criteria andFsNameNotLike(String value) {
            addCriterion("fs_name not like", value, "fsName");
            return (Criteria) this;
        }

        public Criteria andFsNameIn(List<String> values) {
            addCriterion("fs_name in", values, "fsName");
            return (Criteria) this;
        }

        public Criteria andFsNameNotIn(List<String> values) {
            addCriterion("fs_name not in", values, "fsName");
            return (Criteria) this;
        }

        public Criteria andFsNameBetween(String value1, String value2) {
            addCriterion("fs_name between", value1, value2, "fsName");
            return (Criteria) this;
        }

        public Criteria andFsNameNotBetween(String value1, String value2) {
            addCriterion("fs_name not between", value1, value2, "fsName");
            return (Criteria) this;
        }

        public Criteria andFsGroupNoIsNull() {
            addCriterion("fs_group_no is null");
            return (Criteria) this;
        }

        public Criteria andFsGroupNoIsNotNull() {
            addCriterion("fs_group_no is not null");
            return (Criteria) this;
        }

        public Criteria andFsGroupNoEqualTo(String value) {
            addCriterion("fs_group_no =", value, "fsGroupNo");
            return (Criteria) this;
        }

        public Criteria andFsGroupNoNotEqualTo(String value) {
            addCriterion("fs_group_no <>", value, "fsGroupNo");
            return (Criteria) this;
        }

        public Criteria andFsGroupNoGreaterThan(String value) {
            addCriterion("fs_group_no >", value, "fsGroupNo");
            return (Criteria) this;
        }

        public Criteria andFsGroupNoGreaterThanOrEqualTo(String value) {
            addCriterion("fs_group_no >=", value, "fsGroupNo");
            return (Criteria) this;
        }

        public Criteria andFsGroupNoLessThan(String value) {
            addCriterion("fs_group_no <", value, "fsGroupNo");
            return (Criteria) this;
        }

        public Criteria andFsGroupNoLessThanOrEqualTo(String value) {
            addCriterion("fs_group_no <=", value, "fsGroupNo");
            return (Criteria) this;
        }

        public Criteria andFsGroupNoLike(String value) {
            addCriterion("fs_group_no like", value, "fsGroupNo");
            return (Criteria) this;
        }

        public Criteria andFsGroupNoNotLike(String value) {
            addCriterion("fs_group_no not like", value, "fsGroupNo");
            return (Criteria) this;
        }

        public Criteria andFsGroupNoIn(List<String> values) {
            addCriterion("fs_group_no in", values, "fsGroupNo");
            return (Criteria) this;
        }

        public Criteria andFsGroupNoNotIn(List<String> values) {
            addCriterion("fs_group_no not in", values, "fsGroupNo");
            return (Criteria) this;
        }

        public Criteria andFsGroupNoBetween(String value1, String value2) {
            addCriterion("fs_group_no between", value1, value2, "fsGroupNo");
            return (Criteria) this;
        }

        public Criteria andFsGroupNoNotBetween(String value1, String value2) {
            addCriterion("fs_group_no not between", value1, value2, "fsGroupNo");
            return (Criteria) this;
        }

        public Criteria andFsConcaterIsNull() {
            addCriterion("fs_concater is null");
            return (Criteria) this;
        }

        public Criteria andFsConcaterIsNotNull() {
            addCriterion("fs_concater is not null");
            return (Criteria) this;
        }

        public Criteria andFsConcaterEqualTo(String value) {
            addCriterion("fs_concater =", value, "fsConcater");
            return (Criteria) this;
        }

        public Criteria andFsConcaterNotEqualTo(String value) {
            addCriterion("fs_concater <>", value, "fsConcater");
            return (Criteria) this;
        }

        public Criteria andFsConcaterGreaterThan(String value) {
            addCriterion("fs_concater >", value, "fsConcater");
            return (Criteria) this;
        }

        public Criteria andFsConcaterGreaterThanOrEqualTo(String value) {
            addCriterion("fs_concater >=", value, "fsConcater");
            return (Criteria) this;
        }

        public Criteria andFsConcaterLessThan(String value) {
            addCriterion("fs_concater <", value, "fsConcater");
            return (Criteria) this;
        }

        public Criteria andFsConcaterLessThanOrEqualTo(String value) {
            addCriterion("fs_concater <=", value, "fsConcater");
            return (Criteria) this;
        }

        public Criteria andFsConcaterLike(String value) {
            addCriterion("fs_concater like", value, "fsConcater");
            return (Criteria) this;
        }

        public Criteria andFsConcaterNotLike(String value) {
            addCriterion("fs_concater not like", value, "fsConcater");
            return (Criteria) this;
        }

        public Criteria andFsConcaterIn(List<String> values) {
            addCriterion("fs_concater in", values, "fsConcater");
            return (Criteria) this;
        }

        public Criteria andFsConcaterNotIn(List<String> values) {
            addCriterion("fs_concater not in", values, "fsConcater");
            return (Criteria) this;
        }

        public Criteria andFsConcaterBetween(String value1, String value2) {
            addCriterion("fs_concater between", value1, value2, "fsConcater");
            return (Criteria) this;
        }

        public Criteria andFsConcaterNotBetween(String value1, String value2) {
            addCriterion("fs_concater not between", value1, value2, "fsConcater");
            return (Criteria) this;
        }

        public Criteria andFsTelIsNull() {
            addCriterion("fs_tel is null");
            return (Criteria) this;
        }

        public Criteria andFsTelIsNotNull() {
            addCriterion("fs_tel is not null");
            return (Criteria) this;
        }

        public Criteria andFsTelEqualTo(String value) {
            addCriterion("fs_tel =", value, "fsTel");
            return (Criteria) this;
        }

        public Criteria andFsTelNotEqualTo(String value) {
            addCriterion("fs_tel <>", value, "fsTel");
            return (Criteria) this;
        }

        public Criteria andFsTelGreaterThan(String value) {
            addCriterion("fs_tel >", value, "fsTel");
            return (Criteria) this;
        }

        public Criteria andFsTelGreaterThanOrEqualTo(String value) {
            addCriterion("fs_tel >=", value, "fsTel");
            return (Criteria) this;
        }

        public Criteria andFsTelLessThan(String value) {
            addCriterion("fs_tel <", value, "fsTel");
            return (Criteria) this;
        }

        public Criteria andFsTelLessThanOrEqualTo(String value) {
            addCriterion("fs_tel <=", value, "fsTel");
            return (Criteria) this;
        }

        public Criteria andFsTelLike(String value) {
            addCriterion("fs_tel like", value, "fsTel");
            return (Criteria) this;
        }

        public Criteria andFsTelNotLike(String value) {
            addCriterion("fs_tel not like", value, "fsTel");
            return (Criteria) this;
        }

        public Criteria andFsTelIn(List<String> values) {
            addCriterion("fs_tel in", values, "fsTel");
            return (Criteria) this;
        }

        public Criteria andFsTelNotIn(List<String> values) {
            addCriterion("fs_tel not in", values, "fsTel");
            return (Criteria) this;
        }

        public Criteria andFsTelBetween(String value1, String value2) {
            addCriterion("fs_tel between", value1, value2, "fsTel");
            return (Criteria) this;
        }

        public Criteria andFsTelNotBetween(String value1, String value2) {
            addCriterion("fs_tel not between", value1, value2, "fsTel");
            return (Criteria) this;
        }

        public Criteria andFsMailIsNull() {
            addCriterion("fs_mail is null");
            return (Criteria) this;
        }

        public Criteria andFsMailIsNotNull() {
            addCriterion("fs_mail is not null");
            return (Criteria) this;
        }

        public Criteria andFsMailEqualTo(String value) {
            addCriterion("fs_mail =", value, "fsMail");
            return (Criteria) this;
        }

        public Criteria andFsMailNotEqualTo(String value) {
            addCriterion("fs_mail <>", value, "fsMail");
            return (Criteria) this;
        }

        public Criteria andFsMailGreaterThan(String value) {
            addCriterion("fs_mail >", value, "fsMail");
            return (Criteria) this;
        }

        public Criteria andFsMailGreaterThanOrEqualTo(String value) {
            addCriterion("fs_mail >=", value, "fsMail");
            return (Criteria) this;
        }

        public Criteria andFsMailLessThan(String value) {
            addCriterion("fs_mail <", value, "fsMail");
            return (Criteria) this;
        }

        public Criteria andFsMailLessThanOrEqualTo(String value) {
            addCriterion("fs_mail <=", value, "fsMail");
            return (Criteria) this;
        }

        public Criteria andFsMailLike(String value) {
            addCriterion("fs_mail like", value, "fsMail");
            return (Criteria) this;
        }

        public Criteria andFsMailNotLike(String value) {
            addCriterion("fs_mail not like", value, "fsMail");
            return (Criteria) this;
        }

        public Criteria andFsMailIn(List<String> values) {
            addCriterion("fs_mail in", values, "fsMail");
            return (Criteria) this;
        }

        public Criteria andFsMailNotIn(List<String> values) {
            addCriterion("fs_mail not in", values, "fsMail");
            return (Criteria) this;
        }

        public Criteria andFsMailBetween(String value1, String value2) {
            addCriterion("fs_mail between", value1, value2, "fsMail");
            return (Criteria) this;
        }

        public Criteria andFsMailNotBetween(String value1, String value2) {
            addCriterion("fs_mail not between", value1, value2, "fsMail");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceIsNull() {
            addCriterion("terminal_source is null");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceIsNotNull() {
            addCriterion("terminal_source is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceEqualTo(Integer value) {
            addCriterion("terminal_source =", value, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceNotEqualTo(Integer value) {
            addCriterion("terminal_source <>", value, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceGreaterThan(Integer value) {
            addCriterion("terminal_source >", value, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("terminal_source >=", value, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceLessThan(Integer value) {
            addCriterion("terminal_source <", value, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceLessThanOrEqualTo(Integer value) {
            addCriterion("terminal_source <=", value, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceIn(List<Integer> values) {
            addCriterion("terminal_source in", values, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceNotIn(List<Integer> values) {
            addCriterion("terminal_source not in", values, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceBetween(Integer value1, Integer value2) {
            addCriterion("terminal_source between", value1, value2, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("terminal_source not between", value1, value2, "terminalSource");
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