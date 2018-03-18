package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.FinancingApplication;
import com.yonyou.scf.common.entity.FinancingApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinancingApplicationMapper {
    long countByExample(FinancingApplicationExample example);

    int deleteByExample(FinancingApplicationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FinancingApplication record);

    int insertSelective(FinancingApplication record);

    List<FinancingApplication> selectByExample(FinancingApplicationExample example);

    FinancingApplication selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FinancingApplication record, @Param("example") FinancingApplicationExample example);

    int updateByExample(@Param("record") FinancingApplication record, @Param("example") FinancingApplicationExample example);

    int updateByPrimaryKeySelective(FinancingApplication record);

    int updateByPrimaryKey(FinancingApplication record);
}