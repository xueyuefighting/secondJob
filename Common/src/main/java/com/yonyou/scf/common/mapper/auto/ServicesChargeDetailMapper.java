package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.ServicesChargeDetail;
import com.yonyou.scf.common.entity.ServicesChargeDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServicesChargeDetailMapper {
    int countByExample(ServicesChargeDetailExample example);

    int deleteByExample(ServicesChargeDetailExample example);

    int deleteByPrimaryKey(Long payId);

    int insert(ServicesChargeDetail record);

    int insertSelective(ServicesChargeDetail record);

    List<ServicesChargeDetail> selectByExample(ServicesChargeDetailExample example);

    ServicesChargeDetail selectByPrimaryKey(Long payId);

    int updateByExampleSelective(@Param("record") ServicesChargeDetail record, @Param("example") ServicesChargeDetailExample example);

    int updateByExample(@Param("record") ServicesChargeDetail record, @Param("example") ServicesChargeDetailExample example);

    int updateByPrimaryKeySelective(ServicesChargeDetail record);

    int updateByPrimaryKey(ServicesChargeDetail record);
}