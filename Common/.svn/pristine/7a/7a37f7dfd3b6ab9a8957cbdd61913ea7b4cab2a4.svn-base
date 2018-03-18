package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.CompanyUserRelationship;
import com.yonyou.scf.common.entity.CompanyUserRelationshipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyUserRelationshipMapper {
    int countByExample(CompanyUserRelationshipExample example);

    int deleteByExample(CompanyUserRelationshipExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CompanyUserRelationship record);

    int insertSelective(CompanyUserRelationship record);

    List<CompanyUserRelationship> selectByExample(CompanyUserRelationshipExample example);

    CompanyUserRelationship selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CompanyUserRelationship record, @Param("example") CompanyUserRelationshipExample example);

    int updateByExample(@Param("record") CompanyUserRelationship record, @Param("example") CompanyUserRelationshipExample example);

    int updateByPrimaryKeySelective(CompanyUserRelationship record);

    int updateByPrimaryKey(CompanyUserRelationship record);
}