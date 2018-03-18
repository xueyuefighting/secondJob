package com.yonyou.scf.common.constant;

public class UserConst {

	/** 客户类型(企业 个人) */
	// 企业
	public static final String user_style_company = "01";
	// 个人
	public static final String user_style_person = "02";

	//FDD接口
	/** 客户类型(个人) */
	public static final String fdd_person = "0";
	/** 客户类型(企业) */
	public static final String fdd_company = "1";

	/** 个人信息种类(法定代表人 联系人 个人) */
	// 个人
	public static final String user_info_user_style_person = "01";
	// 法定代表人
	public static final String user_info_user_style_representative = "02";
	// 联系人
	public static final String user_info_user_style_contacts = "03";

	/** 客户关系 */
	// 可用
	public static final String company_relationship_enable_status_yes = "0";
	// 禁用
	public static final String company_relationship_enable_status_no = "1";

	/** 个人信息状态 */
	// 启用
	public static final String user_info_enable_status_yes = "0";
	// 禁用
	public static final String user_info_enable_status_no = "1";

	/** 是否禁用 */
	// 否
	public static final String user_role_type_status_no = "0";
	// 是
	public static final String user_role_type_status_yes = "1";

	/** 是否可用 */
	// 是
	public static final String company_user_relationship_enable_status_yes = "0";
	// 否
	public static final String company_user_relationship_enable_status_no = "1";

	/** 三证合一 */
	// 否 组织机构代码
	public static final String company_info_three_examinations_to_one_no = "03";
	public static final String company_info_credential_type_03_name = "组织机构代码";
	// 是 统一社会信用代码
	public static final String company_info_three_examinations_to_one_yes = "02";
	public static final String company_info_credential_type_02_name = "统一社会信用代码";

	/** 证件类型 */
	// 身份证
	public static final String user_info_credential_type_01 = "01";
	// 统一社会信用代码
	public static final String company_info_credential_type_02 = "02";
	// 组织机构代码
	public static final String company_info_credential_type_03 = "03";

	/** 业务角色类型 */
	// 核心企业
	public static final String user_role_type_1 = "1";
	public static final String user_role_type_1_name = "核心企业";
	// 出借方
	public static final String user_role_type_2 = "2";
	public static final String user_role_type_2_name = "出借方";
	// 借款方
	public static final String user_role_type_3 = "3";
	public static final String user_role_type_3_name = "借款方";
	// 担保方
	public static final String user_role_type_4 = "4";
	public static final String user_role_type_4_name = "担保方";
	// 共借方
	public static final String user_role_type_5 = "5";
	public static final String user_role_type_5_name = "共借方";
	// 平台
	public static final String user_role_type_6 = "6";
	public static final String user_role_type_6_name = "运营平台";

	// 详情
	public static final String DETAIL = "详情";
	// 启用
	public static final String ENABLE = "启用";
	// 禁用
	public static final String DISABLE = "禁用";
	// 修改
	public static final String MODIFY = "修改";

	// 维护相关方
	public static final String UserRelationShip = "维护相关方";
	// 维护共借方
	public static final String LendingRelationShip = "维护共借方";
	
	/**
	 * 默认用户
	 */
	public static final Long default_user = Long.decode("999999999999999");
}
