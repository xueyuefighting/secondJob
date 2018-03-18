package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.ExtendInfo;
import com.yonyou.scf.common.entity.ExtendInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExtendInfoMapper {
    int countByExample(ExtendInfoExample example);

    int deleteByExample(ExtendInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ExtendInfo record);

    int insertSelective(ExtendInfo record);

    List<ExtendInfo> selectByExample(ExtendInfoExample example);

    ExtendInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ExtendInfo record, @Param("example") ExtendInfoExample example);

    int updateByExample(@Param("record") ExtendInfo record, @Param("example") ExtendInfoExample example);

    int updateByPrimaryKeySelective(ExtendInfo record);

    int updateByPrimaryKey(ExtendInfo record);
}