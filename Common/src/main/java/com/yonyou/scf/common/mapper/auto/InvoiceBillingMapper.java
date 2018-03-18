package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.InvoiceBilling;
import com.yonyou.scf.common.entity.InvoiceBillingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvoiceBillingMapper {
    int countByExample(InvoiceBillingExample example);

    int deleteByExample(InvoiceBillingExample example);

    int deleteByPrimaryKey(Long ibId);

    int insert(InvoiceBilling record);

    int insertSelective(InvoiceBilling record);

    List<InvoiceBilling> selectByExample(InvoiceBillingExample example);

    InvoiceBilling selectByPrimaryKey(Long ibId);

    int updateByExampleSelective(@Param("record") InvoiceBilling record, @Param("example") InvoiceBillingExample example);

    int updateByExample(@Param("record") InvoiceBilling record, @Param("example") InvoiceBillingExample example);

    int updateByPrimaryKeySelective(InvoiceBilling record);

    int updateByPrimaryKey(InvoiceBilling record);
}