package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.F636;
import com.yonyou.scf.common.entity.F636Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface F636Mapper {
    int countByExample(F636Example example);

    int deleteByExample(F636Example example);

    int deleteByPrimaryKey(Long id);

    int insert(F636 record);

    int insertSelective(F636 record);

    List<F636> selectByExample(F636Example example);

    F636 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") F636 record, @Param("example") F636Example example);

    int updateByExample(@Param("record") F636 record, @Param("example") F636Example example);

    int updateByPrimaryKeySelective(F636 record);

    int updateByPrimaryKey(F636 record);
}