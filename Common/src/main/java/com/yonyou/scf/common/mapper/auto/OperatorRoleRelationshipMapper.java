package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.OperatorRoleRelationship;
import com.yonyou.scf.common.entity.OperatorRoleRelationshipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperatorRoleRelationshipMapper {
    int countByExample(OperatorRoleRelationshipExample example);

    int deleteByExample(OperatorRoleRelationshipExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OperatorRoleRelationship record);

    int insertSelective(OperatorRoleRelationship record);

    List<OperatorRoleRelationship> selectByExample(OperatorRoleRelationshipExample example);

    OperatorRoleRelationship selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OperatorRoleRelationship record, @Param("example") OperatorRoleRelationshipExample example);

    int updateByExample(@Param("record") OperatorRoleRelationship record, @Param("example") OperatorRoleRelationshipExample example);

    int updateByPrimaryKeySelective(OperatorRoleRelationship record);

    int updateByPrimaryKey(OperatorRoleRelationship record);
}