package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.FileRelation;
import com.yonyou.scf.common.entity.FileRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileRelationMapper {
    int countByExample(FileRelationExample example);

    int deleteByExample(FileRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FileRelation record);

    int insertSelective(FileRelation record);

    List<FileRelation> selectByExample(FileRelationExample example);

    FileRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FileRelation record, @Param("example") FileRelationExample example);

    int updateByExample(@Param("record") FileRelation record, @Param("example") FileRelationExample example);

    int updateByPrimaryKeySelective(FileRelation record);

    int updateByPrimaryKey(FileRelation record);
}