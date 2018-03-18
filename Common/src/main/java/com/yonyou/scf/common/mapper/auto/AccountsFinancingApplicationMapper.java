package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.AccountsFinancingApplication;
import com.yonyou.scf.common.entity.AccountsFinancingApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountsFinancingApplicationMapper {
    long countByExample(AccountsFinancingApplicationExample example);

    int deleteByExample(AccountsFinancingApplicationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AccountsFinancingApplication record);

    int insertSelective(AccountsFinancingApplication record);

    List<AccountsFinancingApplication> selectByExample(AccountsFinancingApplicationExample example);

    AccountsFinancingApplication selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AccountsFinancingApplication record, @Param("example") AccountsFinancingApplicationExample example);

    int updateByExample(@Param("record") AccountsFinancingApplication record, @Param("example") AccountsFinancingApplicationExample example);

    int updateByPrimaryKeySelective(AccountsFinancingApplication record);

    int updateByPrimaryKey(AccountsFinancingApplication record);
}