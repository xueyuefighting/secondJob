package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.PtAccount;
import com.yonyou.scf.common.entity.PtAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PtAccountMapper {
    int countByExample(PtAccountExample example);

    int deleteByExample(PtAccountExample example);

    int insert(PtAccount record);

    int insertSelective(PtAccount record);

    List<PtAccount> selectByExample(PtAccountExample example);

    int updateByExampleSelective(@Param("record") PtAccount record, @Param("example") PtAccountExample example);

    int updateByExample(@Param("record") PtAccount record, @Param("example") PtAccountExample example);
}