package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.F607;
import com.yonyou.scf.common.entity.F607Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface F607Mapper {
    int countByExample(F607Example example);

    int deleteByExample(F607Example example);

    int deleteByPrimaryKey(Long id);

    int insert(F607 record);

    int insertSelective(F607 record);

    List<F607> selectByExample(F607Example example);

    F607 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") F607 record, @Param("example") F607Example example);

    int updateByExample(@Param("record") F607 record, @Param("example") F607Example example);

    int updateByPrimaryKeySelective(F607 record);

    int updateByPrimaryKey(F607 record);
}