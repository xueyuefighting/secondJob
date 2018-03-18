package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.FddInfoChange;
import com.yonyou.scf.common.entity.FddInfoChangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FddInfoChangeMapper {
    int countByExample(FddInfoChangeExample example);

    int deleteByExample(FddInfoChangeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FddInfoChange record);

    int insertSelective(FddInfoChange record);

    List<FddInfoChange> selectByExample(FddInfoChangeExample example);

    FddInfoChange selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FddInfoChange record, @Param("example") FddInfoChangeExample example);

    int updateByExample(@Param("record") FddInfoChange record, @Param("example") FddInfoChangeExample example);

    int updateByPrimaryKeySelective(FddInfoChange record);

    int updateByPrimaryKey(FddInfoChange record);
}