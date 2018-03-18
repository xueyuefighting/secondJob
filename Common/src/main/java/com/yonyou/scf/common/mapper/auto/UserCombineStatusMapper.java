package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.UserCombineStatus;
import com.yonyou.scf.common.entity.UserCombineStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCombineStatusMapper {
    long countByExample(UserCombineStatusExample example);

    int deleteByExample(UserCombineStatusExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserCombineStatus record);

    int insertSelective(UserCombineStatus record);

    List<UserCombineStatus> selectByExample(UserCombineStatusExample example);

    UserCombineStatus selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserCombineStatus record, @Param("example") UserCombineStatusExample example);

    int updateByExample(@Param("record") UserCombineStatus record, @Param("example") UserCombineStatusExample example);

    int updateByPrimaryKeySelective(UserCombineStatus record);

    int updateByPrimaryKey(UserCombineStatus record);
}