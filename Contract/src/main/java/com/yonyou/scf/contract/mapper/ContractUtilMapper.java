package com.yonyou.scf.contract.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.yonyou.scf.common.entity.ContractSigner;
import com.yonyou.scf.common.entity.File;
import com.yonyou.scf.common.input.SelectConsByCreditId;
import com.yonyou.scf.contract.utilEntity.ConstractInCreditEntity;

@Mapper
public interface ContractUtilMapper {
	int insertBatchData(List<File> fileList);
	
	//授信-贷前 签署时点合同记录
	int insertBatchDataCredit(List<Map<String,Object>> fileList);
	//授信-贷前 签署时点合同记录 更新
	int updateBatchDataCredit(List<Map<String,Object>> fileList);
	//融资申请 签署时点合同记录
	int insertBatchDataFinance(List<ContractSigner> fileList);
	/*
	 * id 当前数据id
	 * contractName 合同模板名称
	 * isSpecial 是否指定核心企业  是／否
	 * fundNo 融资模式 现在是序号，待字典表成型再替换
	 * signNo 签署时点序号  你给我传的也是序号，我给你反的应该是文字，待字典表成型再替换
	 * fileId 文件id 这个id在前端不可替换 保存的时候是需要的
	 * viewUrl service提供转换  浏览地址
	 * downUrl service提供转换  下载地址
	 * @param map
	 * @return
	 * 
	 * 
	 * 当前sql将签署方的限制条件挪动到代码中进行判断
	 */
	List<Map<String,Object>> selectListForCrediCon(Map<String, Object> map);
	
	/*
	 * BL-授信签署合同回显
	 * id 当前数据主键id
	 * serialNum 签署流水号
	 * signerNo 签署方序号
	 * signerId 签署方id
	 * isSigned 是否签署（中文）
	 * isS 是否签署
	 * fileId 文件id（file表的主键）
	 * fileName 文件名字
	 * subfix 文件后缀
	 * ftpFileId ftp上文件名字
	 * @param map
	 * @return
	 */
	List<Map<String,Object>> selectForSignCreditCon(Map<String, Object> map);
	
	/*
	 * TPN-授信签署合同回显
	 * 
	 * serialNum 流水号
	 * signerName 签署人
	 * signerId 签署人id
	 * signerNo 签署人业务角色序号
	 * signTime 签署时间
	 * isS 是否签署  1 是
	 * isSigned 是否签署  （汉字展示） 是-否
	 * fileId file表主键
	 * fileName 文件名字
	 * subfix 文件后缀
	 * ftpFileId file表中的fileid 字段值
	 * 
	 * @param map
	 * @return
	 */
	List<Map<String, Object>> selectForSignCredit(Map<String, Object> map);
	/*
	 * 融资申请签署合同回显
	 * 
	 * serialNum 流水号
	 * signerName 签署人
	 * signerId 签署人id
	 * signerNo 签署人业务角色序号
	 * signTime 签署时间
	 * isS 是否签署  1 是
	 * isSigned 是否签署  （汉字展示） 是-否
	 * fileId file表主键
	 * fileName 文件名字
	 * subfix 文件后缀
	 * ftpFileId file表中的fileid 字段值
	 * 
	 * @param map
	 * @return
	 */
	List<Map<String, Object>> selectForSignFianceCon(Map<String, Object> map);
	/*
	 * 融资申请签署合同回显
	 * 
	 * serialNum 流水号
	 * signerName 签署人
	 * signerId 签署人id
	 * signerNo 签署人业务角色序号
	 * signTime 签署时间
	 * isS 是否签署  1 是
	 * isSigned 是否签署  （汉字展示） 是-否
	 * fileId file表主键
	 * fileName 文件名字
	 * subfix 文件后缀
	 * ftpFileId file表中的fileid 字段值
	 * 
	 * 查询没有插入contract_signer表时，当前人需要签署的合同：业务场景：融资申请单确认页面显示的合同
	 * @param map
	 * @return
	 */
	List<Map<String, Object>> selectConWithoutSign(Map<String, Object> map);
	
	
	/*
	 * 授信合同配置页面，根据授信id 查询当前页面所有数据
	 * id 当前条数据的主键id
	 * tctId 合同模版的主键id
	 * crediId 授信id
	 * roleId 签署方序号 eg：1-核心企业 2-出借方等
	 * roleName 签署方序号对应的名字
	 * signerId 签署方企业id
	 * userName 签署方企业名称
	 * type 签署方类型 01-企业 02-个人
	 * signNo 签署时点
	 * order 签署顺序
	 * fileId file表主键id
	 * fileName 文件名字
	 * subfix 文件后缀
	 * @param map
	 * @return
	 */
	List<ConstractInCreditEntity> ContractCredit(Map<String, Object> map);

	List<SelectConsByCreditId> selectConsByCreditId(String creditId);
}
