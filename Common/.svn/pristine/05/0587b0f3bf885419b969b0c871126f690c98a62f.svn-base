package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.FrozenInfo;
import com.yonyou.scf.common.entity.FrozenInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrozenInfoMapper {
    int countByExample(FrozenInfoExample example);

    int deleteByExample(FrozenInfoExample example);

    int deleteByPrimaryKey(Long financeId);

    int insert(FrozenInfo record);

    int insertSelective(FrozenInfo record);

    List<FrozenInfo> selectByExample(FrozenInfoExample example);

    FrozenInfo selectByPrimaryKey(Long financeId);

    int updateByExampleSelective(@Param("record") FrozenInfo record, @Param("example") FrozenInfoExample example);

    int updateByExample(@Param("record") FrozenInfo record, @Param("example") FrozenInfoExample example);

    int updateByPrimaryKeySelective(FrozenInfo record);

    int updateByPrimaryKey(FrozenInfo record);
}