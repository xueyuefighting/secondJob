package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.FddFileFiling;
import com.yonyou.scf.common.entity.FddFileFilingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FddFileFilingMapper {
    int countByExample(FddFileFilingExample example);

    int deleteByExample(FddFileFilingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FddFileFiling record);

    int insertSelective(FddFileFiling record);

    List<FddFileFiling> selectByExample(FddFileFilingExample example);

    FddFileFiling selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FddFileFiling record, @Param("example") FddFileFilingExample example);

    int updateByExample(@Param("record") FddFileFiling record, @Param("example") FddFileFilingExample example);

    int updateByPrimaryKeySelective(FddFileFiling record);

    int updateByPrimaryKey(FddFileFiling record);
}