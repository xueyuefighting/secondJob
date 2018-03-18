package com.yonyou.mapper;

import java.util.List;

import org.apache.ibatis.jdbc.SQL;

import com.yonyou.pojo.Notification;
import com.yonyou.pojo.NotificationExample;
import com.yonyou.pojo.NotificationExample.Criteria;
import com.yonyou.pojo.NotificationExample.Criterion;

public class NotificationSqlProvider {

    public String insertSelective(Notification record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("notification");
        
        if (record.getSystemid() != null) {
            sql.VALUES("SYSTEMID", "#{systemid,jdbcType=VARCHAR}");
        }
        
        if (record.getCommunicationType() != null) {
            sql.VALUES("COMMUNICATION_TYPE", "#{communicationType,jdbcType=INTEGER}");
        }
        
        if (record.getUrl() != null) {
            sql.VALUES("URL", "#{url,jdbcType=VARCHAR}");
        }
        
        if (record.getMessage() != null) {
            sql.VALUES("MESSAGE", "#{message,jdbcType=VARCHAR}");
        }
        
        if (record.getNoticeType() != null) {
            sql.VALUES("NOTICE_TYPE", "#{noticeType,jdbcType=INTEGER}");
        }
        
        if (record.getLastSendTime() != null) {
            sql.VALUES("LAST_SEND_TIME", "#{lastSendTime,jdbcType=VARCHAR}");
        }
        
        if (record.getNoticeStatus() != null) {
            sql.VALUES("NOTICE_STATUS", "#{noticeStatus,jdbcType=INTEGER}");
        }
        
        if (record.getSendCount() != null) {
            sql.VALUES("SEND_COUNT", "#{sendCount,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(NotificationExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("SYSTEMID");
        } else {
            sql.SELECT("SYSTEMID");
        }
        sql.SELECT("COMMUNICATION_TYPE");
        sql.SELECT("URL");
        sql.SELECT("MESSAGE");
        sql.SELECT("NOTICE_TYPE");
        sql.SELECT("LAST_SEND_TIME");
        sql.SELECT("NOTICE_STATUS");
        sql.SELECT("SEND_COUNT");
        sql.FROM("notification");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, NotificationExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}