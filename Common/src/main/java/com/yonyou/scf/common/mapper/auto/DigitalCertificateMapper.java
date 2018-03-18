package com.yonyou.scf.common.mapper.auto;

import com.yonyou.scf.common.entity.DigitalCertificate;
import com.yonyou.scf.common.entity.DigitalCertificateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DigitalCertificateMapper {
    int countByExample(DigitalCertificateExample example);

    int deleteByExample(DigitalCertificateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DigitalCertificate record);

    int insertSelective(DigitalCertificate record);

    List<DigitalCertificate> selectByExample(DigitalCertificateExample example);

    DigitalCertificate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DigitalCertificate record, @Param("example") DigitalCertificateExample example);

    int updateByExample(@Param("record") DigitalCertificate record, @Param("example") DigitalCertificateExample example);

    int updateByPrimaryKeySelective(DigitalCertificate record);

    int updateByPrimaryKey(DigitalCertificate record);
}