package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.Workflow;
import com.yonyou.scf.common.entity.WorkflowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkflowMapper {
    int countByExample(WorkflowExample example);

    int deleteByExample(WorkflowExample example);

    int deleteByPrimaryKey(Long nodeId);

    int insert(Workflow record);

    int insertSelective(Workflow record);

    List<Workflow> selectByExample(WorkflowExample example);

    Workflow selectByPrimaryKey(Long nodeId);

    int updateByExampleSelective(@Param("record") Workflow record, @Param("example") WorkflowExample example);

    int updateByExample(@Param("record") Workflow record, @Param("example") WorkflowExample example);

    int updateByPrimaryKeySelective(Workflow record);

    int updateByPrimaryKey(Workflow record);
}