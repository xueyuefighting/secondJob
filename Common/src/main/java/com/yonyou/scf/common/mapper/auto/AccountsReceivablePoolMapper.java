package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.AccountsReceivablePool;
import com.yonyou.scf.common.entity.AccountsReceivablePoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountsReceivablePoolMapper {
    int countByExample(AccountsReceivablePoolExample example);

    int deleteByExample(AccountsReceivablePoolExample example);

    int deleteByPrimaryKey(Long arpId);

    int insert(AccountsReceivablePool record);

    int insertSelective(AccountsReceivablePool record);

    List<AccountsReceivablePool> selectByExample(AccountsReceivablePoolExample example);

    AccountsReceivablePool selectByPrimaryKey(Long arpId);

    int updateByExampleSelective(@Param("record") AccountsReceivablePool record, @Param("example") AccountsReceivablePoolExample example);

    int updateByExample(@Param("record") AccountsReceivablePool record, @Param("example") AccountsReceivablePoolExample example);

    int updateByPrimaryKeySelective(AccountsReceivablePool record);

    int updateByPrimaryKey(AccountsReceivablePool record);
}