package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.FddSignResult;
import com.yonyou.scf.common.entity.FddSignResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FddSignResultMapper {
    int countByExample(FddSignResultExample example);

    int deleteByExample(FddSignResultExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FddSignResult record);

    int insertSelective(FddSignResult record);

    List<FddSignResult> selectByExample(FddSignResultExample example);

    FddSignResult selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FddSignResult record, @Param("example") FddSignResultExample example);

    int updateByExample(@Param("record") FddSignResult record, @Param("example") FddSignResultExample example);

    int updateByPrimaryKeySelective(FddSignResult record);

    int updateByPrimaryKey(FddSignResult record);
}