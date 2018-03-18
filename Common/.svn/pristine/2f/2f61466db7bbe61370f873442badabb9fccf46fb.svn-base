package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.IouInfo;
import com.yonyou.scf.common.entity.IouInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IouInfoMapper {
    int countByExample(IouInfoExample example);

    int deleteByExample(IouInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(IouInfo record);

    int insertSelective(IouInfo record);

    List<IouInfo> selectByExample(IouInfoExample example);

    IouInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") IouInfo record, @Param("example") IouInfoExample example);

    int updateByExample(@Param("record") IouInfo record, @Param("example") IouInfoExample example);

    int updateByPrimaryKeySelective(IouInfo record);

    int updateByPrimaryKey(IouInfo record);
}