package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.F639;
import com.yonyou.scf.common.entity.F639Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface F639Mapper {
    int countByExample(F639Example example);

    int deleteByExample(F639Example example);

    int deleteByPrimaryKey(Long id);

    int insert(F639 record);

    int insertSelective(F639 record);

    List<F639> selectByExample(F639Example example);

    F639 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") F639 record, @Param("example") F639Example example);

    int updateByExample(@Param("record") F639 record, @Param("example") F639Example example);

    int updateByPrimaryKeySelective(F639 record);

    int updateByPrimaryKey(F639 record);
}