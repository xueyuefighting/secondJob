package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.ContractTemplate;
import com.yonyou.scf.common.entity.ContractTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractTemplateMapper {
    int countByExample(ContractTemplateExample example);

    int deleteByExample(ContractTemplateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ContractTemplate record);

    int insertSelective(ContractTemplate record);

    List<ContractTemplate> selectByExample(ContractTemplateExample example);

    ContractTemplate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ContractTemplate record, @Param("example") ContractTemplateExample example);

    int updateByExample(@Param("record") ContractTemplate record, @Param("example") ContractTemplateExample example);

    int updateByPrimaryKeySelective(ContractTemplate record);

    int updateByPrimaryKey(ContractTemplate record);
}