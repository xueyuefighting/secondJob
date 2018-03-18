package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.RepaymentDetails;
import com.yonyou.scf.common.entity.RepaymentDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepaymentDetailsMapper {
    int countByExample(RepaymentDetailsExample example);

    int deleteByExample(RepaymentDetailsExample example);

    int deleteByPrimaryKey(Long rdId);

    int insert(RepaymentDetails record);

    int insertSelective(RepaymentDetails record);

    List<RepaymentDetails> selectByExample(RepaymentDetailsExample example);

    RepaymentDetails selectByPrimaryKey(Long rdId);

    int updateByExampleSelective(@Param("record") RepaymentDetails record, @Param("example") RepaymentDetailsExample example);

    int updateByExample(@Param("record") RepaymentDetails record, @Param("example") RepaymentDetailsExample example);

    int updateByPrimaryKeySelective(RepaymentDetails record);

    int updateByPrimaryKey(RepaymentDetails record);
}