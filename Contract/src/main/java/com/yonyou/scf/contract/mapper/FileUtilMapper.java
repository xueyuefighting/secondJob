package com.yonyou.scf.contract.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yonyou.scf.common.entity.File;
@Mapper
public interface FileUtilMapper {
	int insertBatchData(List<File> fileList);
}
