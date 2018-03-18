package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.PlatformInfo;
import com.yonyou.scf.common.entity.PlatformInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlatformInfoMapper {
    int countByExample(PlatformInfoExample example);

    int deleteByExample(PlatformInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlatformInfo record);

    int insertSelective(PlatformInfo record);

    List<PlatformInfo> selectByExample(PlatformInfoExample example);

    PlatformInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlatformInfo record, @Param("example") PlatformInfoExample example);

    int updateByExample(@Param("record") PlatformInfo record, @Param("example") PlatformInfoExample example);

    int updateByPrimaryKeySelective(PlatformInfo record);

    int updateByPrimaryKey(PlatformInfo record);
}