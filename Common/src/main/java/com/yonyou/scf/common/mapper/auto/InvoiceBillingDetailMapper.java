package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.InvoiceBillingDetail;
import com.yonyou.scf.common.entity.InvoiceBillingDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvoiceBillingDetailMapper {
    int countByExample(InvoiceBillingDetailExample example);

    int deleteByExample(InvoiceBillingDetailExample example);

    int deleteByPrimaryKey(Long ibdId);

    int insert(InvoiceBillingDetail record);

    int insertSelective(InvoiceBillingDetail record);

    List<InvoiceBillingDetail> selectByExample(InvoiceBillingDetailExample example);

    InvoiceBillingDetail selectByPrimaryKey(Long ibdId);

    int updateByExampleSelective(@Param("record") InvoiceBillingDetail record, @Param("example") InvoiceBillingDetailExample example);

    int updateByExample(@Param("record") InvoiceBillingDetail record, @Param("example") InvoiceBillingDetailExample example);

    int updateByPrimaryKeySelective(InvoiceBillingDetail record);

    int updateByPrimaryKey(InvoiceBillingDetail record);
}