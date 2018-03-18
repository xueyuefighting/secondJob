package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.FinanceOrderRelation;
import com.yonyou.scf.common.entity.FinanceOrderRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceOrderRelationMapper {
    int countByExample(FinanceOrderRelationExample example);

    int deleteByExample(FinanceOrderRelationExample example);

    int deleteByPrimaryKey(Long relId);

    int insert(FinanceOrderRelation record);

    int insertSelective(FinanceOrderRelation record);

    List<FinanceOrderRelation> selectByExample(FinanceOrderRelationExample example);

    FinanceOrderRelation selectByPrimaryKey(Long relId);

    int updateByExampleSelective(@Param("record") FinanceOrderRelation record, @Param("example") FinanceOrderRelationExample example);

    int updateByExample(@Param("record") FinanceOrderRelation record, @Param("example") FinanceOrderRelationExample example);

    int updateByPrimaryKeySelective(FinanceOrderRelation record);

    int updateByPrimaryKey(FinanceOrderRelation record);
}