package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.ContractSigner;
import com.yonyou.scf.common.entity.ContractSignerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractSignerMapper {
    int countByExample(ContractSignerExample example);

    int deleteByExample(ContractSignerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ContractSigner record);

    int insertSelective(ContractSigner record);

    List<ContractSigner> selectByExample(ContractSignerExample example);

    ContractSigner selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ContractSigner record, @Param("example") ContractSignerExample example);

    int updateByExample(@Param("record") ContractSigner record, @Param("example") ContractSignerExample example);

    int updateByPrimaryKeySelective(ContractSigner record);

    int updateByPrimaryKey(ContractSigner record);
}