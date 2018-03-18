package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.FinanceModeSupport;
import com.yonyou.scf.common.entity.FinanceModeSupportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceModeSupportMapper {
    int countByExample(FinanceModeSupportExample example);

    int deleteByExample(FinanceModeSupportExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FinanceModeSupport record);

    int insertSelective(FinanceModeSupport record);

    List<FinanceModeSupport> selectByExample(FinanceModeSupportExample example);

    FinanceModeSupport selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FinanceModeSupport record, @Param("example") FinanceModeSupportExample example);

    int updateByExample(@Param("record") FinanceModeSupport record, @Param("example") FinanceModeSupportExample example);

    int updateByPrimaryKeySelective(FinanceModeSupport record);

    int updateByPrimaryKey(FinanceModeSupport record);
}