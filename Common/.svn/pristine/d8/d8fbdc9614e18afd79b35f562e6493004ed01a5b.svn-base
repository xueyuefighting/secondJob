package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.WorkflowTumover;
import com.yonyou.scf.common.entity.WorkflowTumoverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkflowTumoverMapper {
    int countByExample(WorkflowTumoverExample example);

    int deleteByExample(WorkflowTumoverExample example);

    int deleteByPrimaryKey(Long tumoverId);

    int insert(WorkflowTumover record);

    int insertSelective(WorkflowTumover record);

    List<WorkflowTumover> selectByExample(WorkflowTumoverExample example);

    WorkflowTumover selectByPrimaryKey(Long tumoverId);

    int updateByExampleSelective(@Param("record") WorkflowTumover record, @Param("example") WorkflowTumoverExample example);

    int updateByExample(@Param("record") WorkflowTumover record, @Param("example") WorkflowTumoverExample example);

    int updateByPrimaryKeySelective(WorkflowTumover record);

    int updateByPrimaryKey(WorkflowTumover record);
}