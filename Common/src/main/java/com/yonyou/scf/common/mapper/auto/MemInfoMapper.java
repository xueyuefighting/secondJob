package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.MemInfo;
import com.yonyou.scf.common.entity.MemInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemInfoMapper {
    int countByExample(MemInfoExample example);

    int deleteByExample(MemInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemInfo record);

    int insertSelective(MemInfo record);

    List<MemInfo> selectByExample(MemInfoExample example);

    MemInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemInfo record, @Param("example") MemInfoExample example);

    int updateByExample(@Param("record") MemInfo record, @Param("example") MemInfoExample example);

    int updateByPrimaryKeySelective(MemInfo record);

    int updateByPrimaryKey(MemInfo record);
}