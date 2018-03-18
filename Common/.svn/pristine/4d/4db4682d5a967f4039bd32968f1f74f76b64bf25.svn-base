package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.AllApiList;
import com.yonyou.scf.common.entity.AllApiListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AllApiListMapper {
    int countByExample(AllApiListExample example);

    int deleteByExample(AllApiListExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AllApiList record);

    int insertSelective(AllApiList record);

    List<AllApiList> selectByExample(AllApiListExample example);

    AllApiList selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AllApiList record, @Param("example") AllApiListExample example);

    int updateByExample(@Param("record") AllApiList record, @Param("example") AllApiListExample example);

    int updateByPrimaryKeySelective(AllApiList record);

    int updateByPrimaryKey(AllApiList record);
}