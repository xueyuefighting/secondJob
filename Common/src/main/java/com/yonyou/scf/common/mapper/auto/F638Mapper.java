package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.F638;
import com.yonyou.scf.common.entity.F638Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface F638Mapper {
    int countByExample(F638Example example);

    int deleteByExample(F638Example example);

    int deleteByPrimaryKey(Long id);

    int insert(F638 record);

    int insertSelective(F638 record);

    List<F638> selectByExample(F638Example example);

    F638 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") F638 record, @Param("example") F638Example example);

    int updateByExample(@Param("record") F638 record, @Param("example") F638Example example);

    int updateByPrimaryKeySelective(F638 record);

    int updateByPrimaryKey(F638 record);
}