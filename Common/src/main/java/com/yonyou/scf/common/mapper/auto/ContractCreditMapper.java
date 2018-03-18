package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.ContractCredit;
import com.yonyou.scf.common.entity.ContractCreditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractCreditMapper {
    int countByExample(ContractCreditExample example);

    int deleteByExample(ContractCreditExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ContractCredit record);

    int insertSelective(ContractCredit record);

    List<ContractCredit> selectByExample(ContractCreditExample example);

    ContractCredit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ContractCredit record, @Param("example") ContractCreditExample example);

    int updateByExample(@Param("record") ContractCredit record, @Param("example") ContractCreditExample example);

    int updateByPrimaryKeySelective(ContractCredit record);

    int updateByPrimaryKey(ContractCredit record);
}