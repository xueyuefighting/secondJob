package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.WorkflowInfo;
import com.yonyou.scf.common.entity.WorkflowInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkflowInfoMapper {
    int countByExample(WorkflowInfoExample example);

    int deleteByExample(WorkflowInfoExample example);

    int deleteByPrimaryKey(Long wkinId);

    int insert(WorkflowInfo record);

    int insertSelective(WorkflowInfo record);

    List<WorkflowInfo> selectByExample(WorkflowInfoExample example);

    WorkflowInfo selectByPrimaryKey(Long wkinId);

    int updateByExampleSelective(@Param("record") WorkflowInfo record, @Param("example") WorkflowInfoExample example);

    int updateByExample(@Param("record") WorkflowInfo record, @Param("example") WorkflowInfoExample example);

    int updateByPrimaryKeySelective(WorkflowInfo record);

    int updateByPrimaryKey(WorkflowInfo record);
}