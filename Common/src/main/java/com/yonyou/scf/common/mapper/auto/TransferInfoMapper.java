package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.TransferInfo;
import com.yonyou.scf.common.entity.TransferInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransferInfoMapper {
    int countByExample(TransferInfoExample example);

    int deleteByExample(TransferInfoExample example);

    int deleteByPrimaryKey(Long servicesId);

    int insert(TransferInfo record);

    int insertSelective(TransferInfo record);

    List<TransferInfo> selectByExample(TransferInfoExample example);

    TransferInfo selectByPrimaryKey(Long servicesId);

    int updateByExampleSelective(@Param("record") TransferInfo record, @Param("example") TransferInfoExample example);

    int updateByExample(@Param("record") TransferInfo record, @Param("example") TransferInfoExample example);

    int updateByPrimaryKeySelective(TransferInfo record);

    int updateByPrimaryKey(TransferInfo record);
}