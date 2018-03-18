package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.CompanyRelationship;
import com.yonyou.scf.common.entity.CompanyRelationshipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyRelationshipMapper {
    int countByExample(CompanyRelationshipExample example);

    int deleteByExample(CompanyRelationshipExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CompanyRelationship record);

    int insertSelective(CompanyRelationship record);

    List<CompanyRelationship> selectByExample(CompanyRelationshipExample example);

    CompanyRelationship selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CompanyRelationship record, @Param("example") CompanyRelationshipExample example);

    int updateByExample(@Param("record") CompanyRelationship record, @Param("example") CompanyRelationshipExample example);

    int updateByPrimaryKeySelective(CompanyRelationship record);

    int updateByPrimaryKey(CompanyRelationship record);
}