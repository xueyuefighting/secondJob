package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.CustomerMemRole;
import com.yonyou.scf.common.entity.CustomerMemRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerMemRoleMapper {
    int countByExample(CustomerMemRoleExample example);

    int deleteByExample(CustomerMemRoleExample example);

    int deleteByPrimaryKey(Long memberId);

    int insert(CustomerMemRole record);

    int insertSelective(CustomerMemRole record);

    List<CustomerMemRole> selectByExample(CustomerMemRoleExample example);

    CustomerMemRole selectByPrimaryKey(Long memberId);

    int updateByExampleSelective(@Param("record") CustomerMemRole record, @Param("example") CustomerMemRoleExample example);

    int updateByExample(@Param("record") CustomerMemRole record, @Param("example") CustomerMemRoleExample example);

    int updateByPrimaryKeySelective(CustomerMemRole record);

    int updateByPrimaryKey(CustomerMemRole record);
}