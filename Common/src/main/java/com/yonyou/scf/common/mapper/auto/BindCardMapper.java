package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.BindCard;
import com.yonyou.scf.common.entity.BindCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BindCardMapper {
    int countByExample(BindCardExample example);

    int deleteByExample(BindCardExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BindCard record);

    int insertSelective(BindCard record);

    List<BindCard> selectByExample(BindCardExample example);

    BindCard selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BindCard record, @Param("example") BindCardExample example);

    int updateByExample(@Param("record") BindCard record, @Param("example") BindCardExample example);

    int updateByPrimaryKeySelective(BindCard record);

    int updateByPrimaryKey(BindCard record);
}