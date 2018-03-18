package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.Authentication;
import com.yonyou.scf.common.entity.AuthenticationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthenticationMapper {
    long countByExample(AuthenticationExample example);

    int deleteByExample(AuthenticationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Authentication record);

    int insertSelective(Authentication record);

    List<Authentication> selectByExample(AuthenticationExample example);

    Authentication selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Authentication record, @Param("example") AuthenticationExample example);

    int updateByExample(@Param("record") Authentication record, @Param("example") AuthenticationExample example);

    int updateByPrimaryKeySelective(Authentication record);

    int updateByPrimaryKey(Authentication record);
}