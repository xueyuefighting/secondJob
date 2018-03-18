package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.ModifyPayAmount;
import com.yonyou.scf.common.entity.ModifyPayAmountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModifyPayAmountMapper {
    long countByExample(ModifyPayAmountExample example);

    int deleteByExample(ModifyPayAmountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ModifyPayAmount record);

    int insertSelective(ModifyPayAmount record);

    List<ModifyPayAmount> selectByExample(ModifyPayAmountExample example);

    ModifyPayAmount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ModifyPayAmount record, @Param("example") ModifyPayAmountExample example);

    int updateByExample(@Param("record") ModifyPayAmount record, @Param("example") ModifyPayAmountExample example);

    int updateByPrimaryKeySelective(ModifyPayAmount record);

    int updateByPrimaryKey(ModifyPayAmount record);
}