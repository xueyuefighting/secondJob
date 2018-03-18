package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.RepaymentSchedule;
import com.yonyou.scf.common.entity.RepaymentScheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepaymentScheduleMapper {
    int countByExample(RepaymentScheduleExample example);

    int deleteByExample(RepaymentScheduleExample example);

    int deleteByPrimaryKey(Long rsId);

    int insert(RepaymentSchedule record);

    int insertSelective(RepaymentSchedule record);

    List<RepaymentSchedule> selectByExample(RepaymentScheduleExample example);

    RepaymentSchedule selectByPrimaryKey(Long rsId);

    int updateByExampleSelective(@Param("record") RepaymentSchedule record, @Param("example") RepaymentScheduleExample example);

    int updateByExample(@Param("record") RepaymentSchedule record, @Param("example") RepaymentScheduleExample example);

    int updateByPrimaryKeySelective(RepaymentSchedule record);

    int updateByPrimaryKey(RepaymentSchedule record);
}