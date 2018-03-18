package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.ServicesChargeInfo;
import com.yonyou.scf.common.entity.ServicesChargeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServicesChargeInfoMapper {
    int countByExample(ServicesChargeInfoExample example);

    int deleteByExample(ServicesChargeInfoExample example);

    int deleteByPrimaryKey(Long serviceChargeRuleId);

    int insert(ServicesChargeInfo record);

    int insertSelective(ServicesChargeInfo record);

    List<ServicesChargeInfo> selectByExample(ServicesChargeInfoExample example);

    ServicesChargeInfo selectByPrimaryKey(Long serviceChargeRuleId);

    int updateByExampleSelective(@Param("record") ServicesChargeInfo record, @Param("example") ServicesChargeInfoExample example);

    int updateByExample(@Param("record") ServicesChargeInfo record, @Param("example") ServicesChargeInfoExample example);

    int updateByPrimaryKeySelective(ServicesChargeInfo record);

    int updateByPrimaryKey(ServicesChargeInfo record);
}