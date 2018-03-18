package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.F650;
import com.yonyou.scf.common.entity.F650Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface F650Mapper {
    int countByExample(F650Example example);

    int deleteByExample(F650Example example);

    int deleteByPrimaryKey(Long id);

    int insert(F650 record);

    int insertSelective(F650 record);

    List<F650> selectByExample(F650Example example);

    F650 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") F650 record, @Param("example") F650Example example);

    int updateByExample(@Param("record") F650 record, @Param("example") F650Example example);

    int updateByPrimaryKeySelective(F650 record);

    int updateByPrimaryKey(F650 record);
}