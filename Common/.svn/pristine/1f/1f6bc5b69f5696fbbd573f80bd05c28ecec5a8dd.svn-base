package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.WorkflowConfiguration;
import com.yonyou.scf.common.entity.WorkflowConfigurationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkflowConfigurationMapper {
    int countByExample(WorkflowConfigurationExample example);

    int deleteByExample(WorkflowConfigurationExample example);

    int deleteByPrimaryKey(Long confId);

    int insert(WorkflowConfiguration record);

    int insertSelective(WorkflowConfiguration record);

    List<WorkflowConfiguration> selectByExample(WorkflowConfigurationExample example);

    WorkflowConfiguration selectByPrimaryKey(Long confId);

    int updateByExampleSelective(@Param("record") WorkflowConfiguration record, @Param("example") WorkflowConfigurationExample example);

    int updateByExample(@Param("record") WorkflowConfiguration record, @Param("example") WorkflowConfigurationExample example);

    int updateByPrimaryKeySelective(WorkflowConfiguration record);

    int updateByPrimaryKey(WorkflowConfiguration record);
}