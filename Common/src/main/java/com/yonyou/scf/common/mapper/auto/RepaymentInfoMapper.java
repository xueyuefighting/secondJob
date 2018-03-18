package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.RepaymentInfo;
import com.yonyou.scf.common.entity.RepaymentInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepaymentInfoMapper {
    int countByExample(RepaymentInfoExample example);

    int deleteByExample(RepaymentInfoExample example);

    int deleteByPrimaryKey(Long repayId);

    int insert(RepaymentInfo record);

    int insertSelective(RepaymentInfo record);

    List<RepaymentInfo> selectByExample(RepaymentInfoExample example);

    RepaymentInfo selectByPrimaryKey(Long repayId);

    int updateByExampleSelective(@Param("record") RepaymentInfo record, @Param("example") RepaymentInfoExample example);

    int updateByExample(@Param("record") RepaymentInfo record, @Param("example") RepaymentInfoExample example);

    int updateByPrimaryKeySelective(RepaymentInfo record);

    int updateByPrimaryKey(RepaymentInfo record);
}