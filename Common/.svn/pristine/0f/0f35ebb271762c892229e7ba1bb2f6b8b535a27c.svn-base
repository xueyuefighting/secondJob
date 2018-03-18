package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.WorkflowStatus;
import com.yonyou.scf.common.entity.WorkflowStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkflowStatusMapper {
    int countByExample(WorkflowStatusExample example);

    int deleteByExample(WorkflowStatusExample example);

    int deleteByPrimaryKey(Long statusId);

    int insert(WorkflowStatus record);

    int insertSelective(WorkflowStatus record);

    List<WorkflowStatus> selectByExample(WorkflowStatusExample example);

    WorkflowStatus selectByPrimaryKey(Long statusId);

    int updateByExampleSelective(@Param("record") WorkflowStatus record, @Param("example") WorkflowStatusExample example);

    int updateByExample(@Param("record") WorkflowStatus record, @Param("example") WorkflowStatusExample example);

    int updateByPrimaryKeySelective(WorkflowStatus record);

    int updateByPrimaryKey(WorkflowStatus record);
}