package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.FitGroup;
import com.yonyou.scf.common.entity.FitGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FitGroupMapper {
    long countByExample(FitGroupExample example);

    int deleteByExample(FitGroupExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FitGroup record);

    int insertSelective(FitGroup record);

    List<FitGroup> selectByExample(FitGroupExample example);

    FitGroup selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FitGroup record, @Param("example") FitGroupExample example);

    int updateByExample(@Param("record") FitGroup record, @Param("example") FitGroupExample example);

    int updateByPrimaryKeySelective(FitGroup record);

    int updateByPrimaryKey(FitGroup record);
}