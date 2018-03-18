package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.Holiday;
import com.yonyou.scf.common.entity.HolidayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HolidayMapper {
    int countByExample(HolidayExample example);

    int deleteByExample(HolidayExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Holiday record);

    int insertSelective(Holiday record);

    List<Holiday> selectByExample(HolidayExample example);

    Holiday selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Holiday record, @Param("example") HolidayExample example);

    int updateByExample(@Param("record") Holiday record, @Param("example") HolidayExample example);

    int updateByPrimaryKeySelective(Holiday record);

    int updateByPrimaryKey(Holiday record);
}