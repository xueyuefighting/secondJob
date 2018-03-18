package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.F606;
import com.yonyou.scf.common.entity.F606Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface F606Mapper {
    int countByExample(F606Example example);

    int deleteByExample(F606Example example);

    int deleteByPrimaryKey(Long id);

    int insert(F606 record);

    int insertSelective(F606 record);

    List<F606> selectByExample(F606Example example);

    F606 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") F606 record, @Param("example") F606Example example);

    int updateByExample(@Param("record") F606 record, @Param("example") F606Example example);

    int updateByPrimaryKeySelective(F606 record);

    int updateByPrimaryKey(F606 record);
}