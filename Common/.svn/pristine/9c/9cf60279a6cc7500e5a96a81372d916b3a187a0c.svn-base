package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.ContractAttribute;
import com.yonyou.scf.common.entity.ContractAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractAttributeMapper {
    int countByExample(ContractAttributeExample example);

    int deleteByExample(ContractAttributeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ContractAttribute record);

    int insertSelective(ContractAttribute record);

    List<ContractAttribute> selectByExample(ContractAttributeExample example);

    ContractAttribute selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ContractAttribute record, @Param("example") ContractAttributeExample example);

    int updateByExample(@Param("record") ContractAttribute record, @Param("example") ContractAttributeExample example);

    int updateByPrimaryKeySelective(ContractAttribute record);

    int updateByPrimaryKey(ContractAttribute record);
}