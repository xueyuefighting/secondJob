package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.Finance;
import com.yonyou.scf.common.entity.FinanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceMapper {
    int countByExample(FinanceExample example);

    int deleteByExample(FinanceExample example);

    int deleteByPrimaryKey(Long financeId);

    int insert(Finance record);

    int insertSelective(Finance record);

    List<Finance> selectByExample(FinanceExample example);

    Finance selectByPrimaryKey(Long financeId);

    int updateByExampleSelective(@Param("record") Finance record, @Param("example") FinanceExample example);

    int updateByExample(@Param("record") Finance record, @Param("example") FinanceExample example);

    int updateByPrimaryKeySelective(Finance record);

    int updateByPrimaryKey(Finance record);
}