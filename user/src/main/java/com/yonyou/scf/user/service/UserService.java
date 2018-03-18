package com.yonyou.scf.user.service;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.alibaba.fastjson.JSON;
import com.yonyou.scf.common.constant.DefaultConst;
import com.yonyou.scf.common.constant.DigitalCertificateConst;
import com.yonyou.scf.common.constant.FddConst;
import com.yonyou.scf.common.constant.RoleConst;
import com.yonyou.scf.common.constant.URLConst;
import com.yonyou.scf.common.constant.UserConst;
import com.yonyou.scf.common.entity.Authority;
import com.yonyou.scf.common.entity.AuthorityExample;
import com.yonyou.scf.common.entity.CompanyInfo;
import com.yonyou.scf.common.entity.CompanyInfoExample;
import com.yonyou.scf.common.entity.CompanyRelationship;
import com.yonyou.scf.common.entity.CompanyRelationshipExample;
import com.yonyou.scf.common.entity.CompanyUserRelationship;
import com.yonyou.scf.common.entity.CompanyUserRelationshipExample;
import com.yonyou.scf.common.entity.DigitalCertificate;
import com.yonyou.scf.common.entity.DigitalCertificateExample;
import com.yonyou.scf.common.entity.Operator;
import com.yonyou.scf.common.entity.OperatorRoleRelationship;
import com.yonyou.scf.common.entity.OperatorRoleRelationshipExample;
import com.yonyou.scf.common.entity.Role;
import com.yonyou.scf.common.entity.RoleExample;
import com.yonyou.scf.common.entity.UserInfo;
import com.yonyou.scf.common.entity.UserInfoExample;
import com.yonyou.scf.common.entity.UserRole;
import com.yonyou.scf.common.entity.UserRoleExample;
import com.yonyou.scf.common.gateway.entity.TokenBean;
import com.yonyou.scf.common.helper.SMSHelper;
import com.yonyou.scf.common.input.Fdd1011Request;
import com.yonyou.scf.common.input.Fdd1021Request;
import com.yonyou.scf.common.input.Fdd3011Request;
import com.yonyou.scf.common.input.SCF91TokenBean;
import com.yonyou.scf.common.input.SCF921002Input;
import com.yonyou.scf.common.input.SCF922004Input;
import com.yonyou.scf.common.input.SCF923002Input;
import com.yonyou.scf.common.input.SCF931002Input;
import com.yonyou.scf.common.input.SCF931004Input;
import com.yonyou.scf.common.input.SCF931005Input;
import com.yonyou.scf.common.mapper.auto.AuthorityMapper;
import com.yonyou.scf.common.mapper.auto.CompanyInfoMapper;
import com.yonyou.scf.common.mapper.auto.CompanyRelationshipMapper;
import com.yonyou.scf.common.mapper.auto.CompanyUserRelationshipMapper;
import com.yonyou.scf.common.mapper.auto.DigitalCertificateMapper;
import com.yonyou.scf.common.mapper.auto.OperatorMapper;
import com.yonyou.scf.common.mapper.auto.OperatorRoleRelationshipMapper;
import com.yonyou.scf.common.mapper.auto.RoleMapper;
import com.yonyou.scf.common.mapper.auto.UserInfoMapper;
import com.yonyou.scf.common.mapper.auto.UserRoleMapper;
import com.yonyou.scf.common.output.ResultBean;
import com.yonyou.scf.common.output.SCF921002Output;
import com.yonyou.scf.common.output.SCF931002Output;
import com.yonyou.scf.common.output.SCF931003Output;
import com.yonyou.scf.common.util.CheckUtil;
import com.yonyou.scf.common.util.CreateID;
import com.yonyou.scf.common.util.LongUtil;
import com.yonyou.scf.common.util.PasswordGenerator;
import com.yonyou.scf.common.util.StringUtil;
import com.yonyou.scf.common.util.Timer;
import com.yonyou.scf.common.util.TokenUtil;
import com.yonyou.scf.common.util.json.JsonUtil;
import com.yonyou.scf.common.util.net.HttpClientUtil;
import com.yonyou.scf.user.mapper.hand.RoleHMapper;
import com.yonyou.scf.user.mapper.hand.UserMapper;

@Transactional(propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
@Service
public class UserService {

	@Resource
	private CommonService commonService;

	@Autowired
	private UserMapper userMappper;

	@Autowired
	private RoleMapper roleMapper;

	@Autowired
	private RoleHMapper roleHMappper;

	@Autowired
	private OperatorMapper operatorMapper;

	@Autowired
	private OperatorRoleRelationshipMapper operatorRoleRelationshipMapper;

	@Autowired
	private UserInfoMapper userInfoMapper;

	@Autowired
	private CompanyInfoMapper companyInfoMapper;

	@Autowired
	private UserRoleMapper userRoleMapper;

	@Autowired
	private CompanyUserRelationshipMapper companyUserRelationshipMapper;

	@Autowired
	private CompanyRelationshipMapper companyRelationshipMapper;

	@Autowired
	private AuthorityMapper authorityMapper;

	@Resource
	private ParamService paramService;

	@Resource
	private DigitalCertificateMapper digitalCertificateMapper;

	@Autowired
	private RedisTemplate<Object, Object> redisTemplate;

	private static final Logger logger = LoggerFactory
			.getLogger(UserService.class);

	// 客户档案信息初始化页面
	public Map<String, Map<String, Object>> SCF921001() {

		Map<String, Map<String, Object>> result = new HashMap<String, Map<String, Object>>();

		// 客户类型下拉框获取
		// result.put("COMDD0008", commonService.COMDD0008());
		// 业务角色下拉框获取
		result.put("COMDD0009", commonService.COMDD0009());
		// 客户名称获取
		result.put("COMDD0031", commonService.COMDD0031());
		// 证件号码获取
		result.put("COMDD0032", commonService.COMDD0032());

		return result;
	}

	// 客户档案查询
	// 客户名称 userName
	// 证件号码 credentialNum
	// 客户类型 userType
	// 业务角色 roleType
	public ResultBean SCF921002(SCF921002Input input) {

		List<SCF921002Output> result = new ArrayList<SCF921002Output>();

		Map<String, Object> params = new HashMap<String, Object>();
		if ("".equals(input.getCompanyName())) {
			params.put("userName", null);
		} else {
			params.put("userName", input.getCompanyName());
		}

		if ("".equals(input.getCredentialNum())) {
			params.put("credentialNum", null);
		} else {
			params.put("credentialNum", input.getCredentialNum());
		}

		params.put("userType", input.getUserType());
		params.put("userRole", input.getRoleType());

		List<Map<String, Object>> dataList = userMappper
				.getUserInfoList(params);

		Map<Object, Object> typeDic = paramService
				.getMap("user_role/user_style");
		Map<Object, Object> roleDic = paramService
				.getMap("user_info/user_role");
		Map<Object, Object> stautsDic = paramService
				.getMap("user_info/enable_status");
		Map<Object, Object> credentialtypeDic = paramService
				.getMap("user_info/credential_type");

		for (Map<String, Object> data : dataList) {
			SCF921002Output output = new SCF921002Output();

			output.setUserName(f(data.get("userName")));
			output.setUserId(f(data.get("userId")));
			output.setCredentialNum(f(data.get("credentialNum")));
			output.setUserType(f(typeDic.get(f(data.get("userType")))));
			output.setUserTypeId(f(data.get("userType")));
			output.setUserRole(f(roleDic.get(f(data.get("userRole")))));
			output.setCreatTime(FormatDateStringFrom17(f(data.get("creatTime"))));// 创建时间
			output.setEnableStatus(f(stautsDic.get(f(data.get("status")))));

			// 企业处理
			if (UserConst.user_style_company.equals(f(data.get("userType")))) {

				output.setCredentialType(f(credentialtypeDic.get(f(data
						.get("credentialType")))));
				// output.setUrl1("CDtails.html?id=" + data.get("userId"));
				// output.setUrl3("CEdit.html?id=" + data.get("userId"));
				output.setUrl1(f(data.get("userId")));
				output.setUrl3(f(data.get("userId")));

			} else if (UserConst.user_style_person.equals(f(data
					.get("userType")))) {
				output.setCredentialType(UserConst.company_info_three_examinations_to_one_no
						.equals(f(data.get("three_examinations_to_one"))) ? UserConst.company_info_credential_type_03_name
						: UserConst.company_info_credential_type_02_name);
				// output.setUrl3("UEdit.html?id=" + data.get("userId"));
				// output.setUrl1("UDtails.html?id=" + data.get("userId"));
				output.setUrl1(f(data.get("userId")));
				output.setUrl3(f(data.get("userId")));
			}

			output.setCaption1(UserConst.DETAIL);
			// output.setUrl1("user/SCF922003/" + data.get("userId"));

			if (UserConst.user_info_enable_status_no.equals(f(data
					.get("status")))) {
				output.setCaption2(UserConst.ENABLE);
				output.setUrl2("user/SCF922001/" + data.get("userId"));
				// output.setUrl2("user/enable.html?id=" +
				// data.get("userId"));

			} else if (UserConst.user_info_enable_status_yes.equals(f(data
					.get("status")))) {
				output.setCaption2(UserConst.DISABLE);
				output.setUrl2("user/SCF922002/" + data.get("userId"));
				// output.setUrl2("user/disble.html?id=" +
				// data.get("userId"));
			}

			output.setCaption3(UserConst.MODIFY);

			// output.setUrl3("user/SCF922003/" + data.get("userId"));

			result.add(output);
		}

		return new ResultBean(DefaultConst.SUCCESS_RESPONSE_CODE,
				DefaultConst.SUCCESS_RESPONSE_MESSAGE, result);
	}

	// 个人信息启用
	public ResultBean SCF922001(Long id, SCF91TokenBean input) {
		UserInfo ui = new UserInfo();
		ui.setUserId(id);
		ui.setEnableStatus(UserConst.user_info_enable_status_yes);
		ui.setUpdateUser(1L);
		ui.setUpdateTime(Timer.getDateTimeNow(Timer.Role2));

		int count = userInfoMapper.updateByPrimaryKeySelective(ui);
		if (count == 1) {
			logger.error("个人信息启用成功 id=" + id);
			return new ResultBean(DefaultConst.SUCCESS_RESPONSE_CODE,
					DefaultConst.SUCCESS_RESPONSE_MESSAGE);
		}

		logger.error("个人信息启用失败 id=" + id);
		return new ResultBean(DefaultConst.ERR_2001_CODE, "系统错误，请重试");
	}

	// 个人信息禁用
	public ResultBean SCF922002(Long id, SCF91TokenBean input) {
		UserInfo ui = new UserInfo();
		ui.setUserId(id);
		ui.setEnableStatus(UserConst.user_info_enable_status_no);
		ui.setUpdateUser(1L);
		ui.setUpdateTime(Timer.getDateTimeNow(Timer.Role2));

		int count = userInfoMapper.updateByPrimaryKeySelective(ui);
		if (count == 1) {
			logger.error("个人信息禁用成功 id=" + id);
			return new ResultBean(DefaultConst.SUCCESS_RESPONSE_CODE,
					DefaultConst.SUCCESS_RESPONSE_MESSAGE);
		}

		logger.error("个人信息禁用失败 id=" + id);
		return new ResultBean(DefaultConst.ERR_2001_CODE, "系统错误，请重试");
	}

	// 个人信息详情,新增和修改
	public Map<String, Map<String, Object>> SCF922003(Long id) {

		Map<String, Map<String, Object>> result = new HashMap<String, Map<String, Object>>();

		UserInfo ui = userInfoMapper.selectByPrimaryKey(id);

		if (ui == null) {
		} else {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("userId", id);// 客户ID
			data.put("userName", ui.getUserName());// 名称
			// data.put(
			// "credentialType",
			// paramService.getMap("user_info/credential_type").get(
			// f(ui.getCredentialType())));// 证件类型
			data.put("credentialType", f(ui.getCredentialType()));// 证件类型
			data.put("credentialNum", ui.getCredentialNum());// 证件号码
			data.put("credentialPic", ui.getCredentialPic());// 身份证照
			data.put("credentialPic2", ui.getCredentialPic2());// 身份证照2
			data.put("credentialHand", ui.getCredentialHand());// 手持身份证照
			data.put("mobilePhone", ui.getPhoneNum());// 手机号
			data.put("email", ui.getEmail());// 邮箱
			data.put("educationalLevel", ui.getEducationalLevel());// 学历
			data.put("maritalStatus", ui.getMaritalStatus());// 婚姻状况
			data.put("status", ui.getEnableStatus());// 状态

			// 业务角色列表
			Map<String, Object> roleMap = new HashMap<String, Object>();
			UserRoleExample ure = new UserRoleExample();
			ure.createCriteria().andUserIdEqualTo(id);
			List<UserRole> userRoleList = userRoleMapper.selectByExample(ure);

			Map<String, Object> roledic = commonService.COMDD0009();

			if (data != null) {

				for (UserRole ur : userRoleList) {
					roleMap.put(ur.getUserRole(), roledic.get(ur.getUserRole()));
				}
			}
			data.put("roleMap", roleMap);

			result.put("SCF922003", data);
		}

		// 个人证件类型获取
		// result.put("COMDD0010", commonService.COMDD0010());
		// 最高学历下拉框获取
		// result.put("COMDD0013", commonService.COMDD0013());
		// 婚姻类型获取
		// result.put("COMDD0014", commonService.COMDD0014());
		// 业务角色下拉框获取
		result.put("COMDD0009", commonService.COMDD0009());

		return result;
	}

	// 个人新增修改提交
	public ResultBean SCF922004(SCF922004Input scf922004Input) {

		ResultBean rb = new ResultBean();

		// 业务角色至少要选定一个
		if (scf922004Input.getRoleList() == null
				|| scf922004Input.getRoleList().size() == 0) {

			rb.setCode(DefaultConst.ERR_0001_CODE);
			rb.setMessage("必须指定一个业务角色");

			return rb;
		}

		// 手机号格式检查
		if (!CheckUtil
				.matches(scf922004Input.getMobilePhone(), CheckUtil.PHONE)) {

			rb.setCode(DefaultConst.ERR_0001_CODE);
			rb.setMessage("请检查输入的手机号格式");

			return rb;
		}

		// 邮箱格式检查
		if (!CheckUtil.matches(scf922004Input.getEmail(), CheckUtil.EMAIL)) {

			rb.setCode(DefaultConst.ERR_0001_CODE);
			rb.setMessage("请检查输入的邮箱格式");

			return rb;
		}

		// 身份证格式检查
		if (!CheckUtil.matches(scf922004Input.getCredentialNum(),
				CheckUtil.CERTNO)) {

			rb.setCode(DefaultConst.ERR_0001_CODE);
			rb.setMessage("请检查输入的身份证格式");

			return rb;
		}

		// 手机号重复检查
		UserInfoExample uie = new UserInfoExample();
		if (scf922004Input.getUserId() == null) {
			uie.createCriteria()
					.andUserStyleEqualTo(UserConst.user_info_user_style_person)
					.andPhoneNumEqualTo(scf922004Input.getMobilePhone());
		} else {
			uie.createCriteria()
					.andUserIdNotEqualTo(scf922004Input.getUserId())
					.andUserStyleEqualTo(UserConst.user_info_user_style_person)
					.andPhoneNumEqualTo(scf922004Input.getMobilePhone());
		}

		if (userInfoMapper.countByExample(uie) > 0) {

			rb.setCode(DefaultConst.ERR_0001_CODE);
			rb.setMessage("此手机号已经被绑定，请尝试其他手机号");

			return rb;
		}

		// 邮箱重复检查
		uie = new UserInfoExample();
		if (scf922004Input.getUserId() == null) {
			uie.createCriteria()
					.andUserStyleEqualTo(UserConst.user_info_user_style_person)
					.andEmailEqualTo(scf922004Input.getEmail());
		} else {
			uie.createCriteria()
					.andUserIdNotEqualTo(scf922004Input.getUserId())
					.andUserStyleEqualTo(UserConst.user_info_user_style_person)
					.andEmailEqualTo(scf922004Input.getEmail());
		}

		if (userInfoMapper.countByExample(uie) > 0) {

			rb.setCode(DefaultConst.ERR_0001_CODE);
			rb.setMessage("此邮箱已经被绑定，请尝试其他邮箱");

			return rb;
		}

		// 身份证信息
		uie = new UserInfoExample();
		if (scf922004Input.getUserId() == null) {
			uie.createCriteria()
					.andUserStyleEqualTo(UserConst.user_info_user_style_person)
					.andCredentialNumEqualTo(scf922004Input.getCredentialNum());
		} else {
			uie.createCriteria()
					.andUserIdNotEqualTo(scf922004Input.getUserId())
					.andUserStyleEqualTo(UserConst.user_info_user_style_person)
					.andCredentialNumEqualTo(scf922004Input.getCredentialNum());
		}

		if (userInfoMapper.countByExample(uie) > 0) {

			rb.setCode(DefaultConst.ERR_0001_CODE);
			rb.setMessage("此身份证已经被绑定，请尝试其他身份证");

			return rb;
		}

		// 设置更新或者插入数据库的数据
		try {

			UserInfo userInfo = new UserInfo();

			userInfo.setUserName(scf922004Input.getUserName());// 名称
			userInfo.setCredentialType(scf922004Input.getCredentialType());// 证件类型
			userInfo.setCredentialNum(scf922004Input.getCredentialNum());// 证件号码
			userInfo.setPhoneNum(scf922004Input.getMobilePhone());// 手机号
			userInfo.setEmail(scf922004Input.getEmail());// 邮箱
			// userInfo.setCredentialPic(scf922004Input.getCredentialPic());//
			// 身份证正面
			// userInfo.setCredentialPic2(scf922004Input.getCredentialPic2());//
			// 身份证反面
			// userInfo.setCredentialHand(scf922004Input.getCredentialHand());//
			// 手持身份证照

			userInfo.setUserStyle(UserConst.user_info_user_style_person);// 个人

			userInfo.setCreateUser(scf922004Input.getOperatorId());// 创建者
			userInfo.setCreateTime(Timer.getDateTimeNow(Timer.Role2));// 创建时间
			userInfo.setUpdateUser(scf922004Input.getOperatorId());// 更新者
			userInfo.setUpdateTime(Timer.getDateTimeNow(Timer.Role2));// 更新时间

			if (scf922004Input.getUserId() == null) {
				userInfo.setUserId(CreateID.createId());
				scf922004Input.setUserId(userInfo.getUserId());
				userInfo.setEnableStatus(UserConst.user_info_enable_status_yes);

				if (!"".equals(scf922004Input.getCredentialPic())) {
					Long credentialPic = this.saveImage(
							scf922004Input.getCredentialPic(),
							scf922004Input.getToken());
					if (null == credentialPic) {
						rb.setCode(DefaultConst.ERR_2001_CODE);
						rb.setMessage(DefaultConst.ERR_2003_MSG);
						return rb;
					}
					userInfo.setCredentialPic(credentialPic);
				}

				if (!"".equals(scf922004Input.getCredentialPic2())) {
					Long credentialPic2 = this.saveImage(
							scf922004Input.getCredentialPic2(),
							scf922004Input.getToken());
					if (null == credentialPic2) {
						rb.setCode(DefaultConst.ERR_2001_CODE);
						rb.setMessage(DefaultConst.ERR_2003_MSG);
						return rb;
					}
					userInfo.setCredentialPic2(credentialPic2);
				}

				if (!"".equals(scf922004Input.getCredentialHand())) {
					Long credentialHand = this.saveImage(
							scf922004Input.getCredentialHand(),
							scf922004Input.getToken());
					if (null == credentialHand) {
						rb.setCode(DefaultConst.ERR_2001_CODE);
						rb.setMessage(DefaultConst.ERR_2003_MSG);
						return rb;
					}
					userInfo.setCredentialHand(credentialHand);
				}

				userInfoMapper.insert(userInfo);

				// 保理个人CA开通
				Fdd1011Request tx1011Req = new Fdd1011Request();
				tx1011Req.setCustomer_id(f(userInfo.getUserId()));// 企业ID
				tx1011Req.setCustomer_name(userInfo.getUserName());// 企业名称
				tx1011Req.setEmail(userInfo.getEmail());// 操作人的EMAIL
				tx1011Req
						.setMobile(StringUtil.toString(userInfo.getPhoneNum()));// 操作人的PHONE

				//
				tx1011Req
						.setIdent_type(StringUtil
								.toString(FddConst.Fdd_person_info_Ident_type_Preson_ident));
				tx1011Req.setId_card(userInfo.getCredentialNum());

				// String ret =
				// HttpClientUtil.post("http://localhost:58101/syncPerson_auto",
				// tx1011Req);
				String ret = HttpClientUtil.post(URLConst.URL_FADADA
						+ "/syncPerson_auto", tx1011Req);
				// String ret = hc.send(tx1011Req);

				ResultBean b = JSON.parseObject(ret, ResultBean.class);
				if (!DefaultConst.SUCCESS_RESPONSE_CODE.equals(b.getCode())) {
					logger.error("个人开通法大大失败 getCode=" + b.getCode());
					logger.error("            UserId=" + userInfo.getUserId());

					TransactionAspectSupport.currentTransactionStatus()
							.setRollbackOnly();

					return new ResultBean(DefaultConst.ERR_2001_CODE,
							"系统错误，请重试");
				} else {
					// 新增用友保理数字证书申请 个人 固定开通
					DigitalCertificate dc = new DigitalCertificate();

					dc.setId(CreateID.createId());
					dc.setAuditingStatus(DigitalCertificateConst.auditing_status_1);
					dc.setBindStatus(DigitalCertificateConst.bind_status_1);
					dc.setExpireDate("2099-12-31");
					dc.setUserId(userInfo.getUserId());
					dc.setSignBankId(1L);
					// dc.setCredentialPic(input.getCredential_pic());
					// dc.setCredentialPic2(input.getCredential_pic2());
					// dc.setCredentialHand(input.getCredential_hand());
					dc.setCreateTime(Timer.getDateTimeNow(Timer.Role2));
					dc.setCreateUser(scf922004Input.getOperatorId());

					digitalCertificateMapper.insertSelective(dc);
				}

				// 加超管操作员
				Operator op = new Operator();
				Thread.sleep(1);
				op.setOperatorId(CreateID.createId());
				op.setAuditingStatus(RoleConst.operator_auditing_status_start);
				op.setOperatorStyle(RoleConst.operator_style_person);
				op.setName("超级管理员");
				op.setStatus(RoleConst.operator_status_enable);
				op.setCreateUser(scf922004Input.getOperatorId());
				op.setCreateTime(Timer.getDateTimeNow(Timer.Role2));
				String pas = PasswordGenerator.getFixLenthString();
				op.setPassword(DigestUtils.md5Hex(pas));
				op.setWrongTimes(0L);
				op.setPhone(Long.valueOf(scf922004Input.getMobilePhone()));
				op.setEmail(scf922004Input.getEmail());
				op.setCredentialType(scf922004Input.getCredentialType());
				op.setCredentialNum(scf922004Input.getCredentialNum());

				operatorMapper.insertSelective(op);
				logger.debug("开始发初始密码短信 需要SMS模块已经启动 phone=" + op.getPhone());

				SMSHelper.doSend(DefaultConst.SCF_PLATFORM_ID,
						StringUtil.toString(op.getPhone()), "【用友产融】您的初始密码为:"
								+ pas, Timer.getTimestamp());

				logger.debug("初始密码短信已经发送 phone=" + op.getPhone());

				// TODO
				// 邮件没通，暂时不发
				// MailHelper.doSend(DefaultConst.SCF_PLATFORM_ID, "供应链金融平台提示",
				// op.getEmail(), "初始密码为:" + pas, Timer.getTimestamp());

				// 加超管角色
				for (String ro : scf922004Input.getRoleList()) {

					Role role = new Role();
					Thread.sleep(1);
					role.setId(CreateID.createId());
					role.setUserId(userInfo.getUserId());

					role.setName("超级管理员");
					// role.setUserId(scf922004Input.getUserId());
					role.setIsAdmin(RoleConst.role_is_admin_yes);
					role.setUserRole(ro);
					role.setDescription("超级管理员");

					role.setCreateTime(Timer.getDateTimeNow(Timer.Role2));
					role.setCreateUser(scf922004Input.getOperatorId());
					role.setStatus(RoleConst.role_status_enable);

					roleMapper.insertSelective(role);

					AuthorityExample ae = new AuthorityExample();
					ae.createCriteria().andRoleEqualTo(LongUtil.toLong(ro));
					List<Authority> alist = authorityMapper.selectByExample(ae);

					// List<Authority> aList = new ArrayList<Authority>();
					for (int i = 0; i < alist.size(); i++) {
						Authority authority = alist.get(i);
						// Authority a = new Authority();
						Thread.sleep(1);
						authority.setId(CreateID.createId());
						authority.setCreateTime(Timer
								.getDateTimeNow(Timer.Role2));
						authority.setCreateUser(scf922004Input.getOperatorId());
						authority.setRole(role.getId());
					}
					roleHMappper.insertBatch(alist);

					OperatorRoleRelationship orr = new OperatorRoleRelationship();
					Thread.sleep(1);
					orr.setId(CreateID.createId());
					orr.setOperatorId(op.getOperatorId());
					orr.setRole(role.getId());
					orr.setCreateTime(Timer.getDateTimeNow(Timer.Role2));
					orr.setCreateUser(scf922004Input.getOperatorId());

					operatorRoleRelationshipMapper.insertSelective(orr);
				}

			} else {
				Long operatorId = -1L;
				userInfo.setUserId(scf922004Input.getUserId());

				UserInfo oldUser = userInfoMapper
						.selectByPrimaryKey(scf922004Input.getUserId());

				if (!"".equals(scf922004Input.getCredentialPic())
						&& !scf922004Input.getCredentialPic().equals(
								oldUser.getCredentialPic())) {
					Long credentialPic = this.saveImage(
							scf922004Input.getCredentialPic(),
							scf922004Input.getToken());
					if (null == credentialPic) {
						rb.setCode(DefaultConst.ERR_2001_CODE);
						rb.setMessage(DefaultConst.ERR_2003_MSG);
						return rb;
					}
					userInfo.setCredentialPic(credentialPic);
				}

				if (!"".equals(scf922004Input.getCredentialPic2())
						&& !scf922004Input.getCredentialPic2().equals(
								oldUser.getCredentialPic2())) {
					Long credentialPic2 = this.saveImage(
							scf922004Input.getCredentialPic2(),
							scf922004Input.getToken());
					if (null == credentialPic2) {
						rb.setCode(DefaultConst.ERR_2001_CODE);
						rb.setMessage(DefaultConst.ERR_2003_MSG);
						return rb;
					}
					userInfo.setCredentialPic2(credentialPic2);
				}

				if (!"".equals(scf922004Input.getCredentialHand())
						&& !scf922004Input.getCredentialHand().equals(
								oldUser.getCredentialHand())) {
					Long credentialHand = this.saveImage(
							scf922004Input.getCredentialHand(),
							scf922004Input.getToken());
					if (null == credentialHand) {
						rb.setCode(DefaultConst.ERR_2001_CODE);
						rb.setMessage(DefaultConst.ERR_2003_MSG);
						return rb;
					}
					userInfo.setCredentialHand(credentialHand);
				}

				// 将旧的业务角色删除
				UserRoleExample ure = new UserRoleExample();
				ure.createCriteria().andUserIdEqualTo(
						scf922004Input.getUserId());
				userInfoMapper.updateByPrimaryKeySelective(userInfo);
				userRoleMapper.deleteByExample(ure);

				RoleExample re = new RoleExample();
				re.createCriteria()
						.andUserIdEqualTo(scf922004Input.getUserId())
						.andIsAdminEqualTo(RoleConst.role_is_admin_yes);
				List<Role> roleList = roleMapper.selectByExample(re);
				if (roleList == null || roleList.size() == 0) {
					rb.setCode(DefaultConst.ERR_2001_CODE);
					rb.setMessage("系统自动建立的超级管理员角色读取出错");

					return rb;
				} else {
					OperatorRoleRelationshipExample orre = new OperatorRoleRelationshipExample();
					orre.createCriteria().andRoleEqualTo(
							roleList.get(0).getId());
					List<OperatorRoleRelationship> orrList = operatorRoleRelationshipMapper
							.selectByExample(orre);
					if (orrList == null || orrList.size() == 0) {
						rb.setCode(DefaultConst.ERR_2001_CODE);
						rb.setMessage("系统自动建立的超级管理员读取出错");

						return rb;
					}

					operatorId = orrList.get(0).getOperatorId();
				}

				// 判断关键信息发生变化
				Operator op = operatorMapper.selectByPrimaryKey(operatorId);
				Boolean flag = false;

				DigitalCertificateExample example = new DigitalCertificateExample();
				example.createCriteria()
						.andBindStatusEqualTo(
								DigitalCertificateConst.bind_status_2)
						.andAuditingStatusEqualTo(
								DigitalCertificateConst.auditing_status_0)
						.andUserIdEqualTo(userInfo.getUserId())
						.andSignBankIdEqualTo(1L);
				
				//TODO 之后要在数据库中加入字段，手工修改资方的类型(保理，廊坊银行，其他)
				
				int count = digitalCertificateMapper.countByExample(example);

				// 有一条保理数字证书待审核数据时要通知法大大更新，通知个人变更
				if ((count == 1)
						&& (!op.getPhone().equals(
								Long.valueOf(scf922004Input.getMobilePhone())) || !op
								.getEmail().equals(scf922004Input.getEmail()))) {

					userInfo.setPhoneNum(scf922004Input.getMobilePhone());// 手机号
					userInfo.setEmail(scf922004Input.getEmail());// 邮箱

					// 通知法大大
					// HttpConnection hc = new
					// HttpConnection("http://localhost:58101/infochange");
					// 胜苏，20171014，替换为HttpClientUtil.post

					Fdd3011Request tx3011Req = new Fdd3011Request();
					tx3011Req.setCustomer_id(f(userInfo.getUserId()));
					tx3011Req.setEmail(op.getEmail());
					tx3011Req.setMobile(f(op.getPhone()));
					tx3011Req.setEmail_new(userInfo.getEmail());
					tx3011Req.setMobile_new(userInfo.getPhoneNum());
					tx3011Req.setCustomer_type(UserConst.fdd_person);
					// tx3011Req.setFdd_customer_id("");

					String ret = HttpClientUtil.post(URLConst.URL_FADADA
							+ "/infochange", tx3011Req);
					// String ret = hc.send(tx3011Req);

					ResultBean b = JSON.parseObject(ret, ResultBean.class);
					if (DefaultConst.SUCCESS_RESPONSE_CODE.equals(b.getCode())) {
						logger.error("个人修改法大大信息失败 UserId="
								+ userInfo.getUserId() + " " + b.getMessage());
						return new ResultBean(DefaultConst.ERR_2001_CODE,
								"通知法大大失败，请重试");
					} else {
						logger.error("个人修改法大大信息成功 UserId="
								+ userInfo.getUserId() + " " + b.getMessage());
						// 通知个人
						SMSHelper.doSend(DefaultConst.SCF_PLATFORM_ID,
								StringUtil.toString(userInfo.getPhoneNum()),
								"您在法大大的个人信息变更成功！", Timer.getTimestamp());
						//
						// MailHelper.doSend(DefaultConst.SCF_PLATFORM_ID,
						// "供应链金融平台提示",
						// op.getEmail(), "初始密码为:" + pas, Timer.getTimestamp());

						userInfo.getEmail();
						userInfo.getPhoneNum();
					}
				}

				op.setPhone(Long.valueOf(scf922004Input.getMobilePhone()));
				op.setEmail(scf922004Input.getEmail());
				op.setCredentialNum(scf922004Input.getCredentialNum());

				op.setUpdateTime(Timer.getDateTimeNow(Timer.Role2));
				op.setUpdateUser(scf922004Input.getOperatorId());
				operatorMapper.updateByPrimaryKeySelective(op);

				// 删除删超管角色
				re = new RoleExample();
				re.createCriteria()
						.andUserIdEqualTo(scf922004Input.getUserId())
						.andIsAdminEqualTo(RoleConst.role_is_admin_yes);
				roleMapper.deleteByExample(re);

				// 删除所有管理员操作员和角色的关系
				OperatorRoleRelationshipExample orre = new OperatorRoleRelationshipExample();
				orre.createCriteria().andOperatorIdEqualTo(operatorId);
				operatorRoleRelationshipMapper.deleteByExample(orre);

				// 加超管角色
				for (String ro : scf922004Input.getRoleList()) {

					Role role = new Role();
					Thread.sleep(1);
					role.setId(CreateID.createId());
					role.setUserId(scf922004Input.getUserId());

					role.setName("超级管理员");
					role.setUserRole(ro);
					role.setDescription("超级管理员");

					role.setCreateTime(Timer.getDateTimeNow(Timer.Role2));
					role.setCreateUser(scf922004Input.getOperatorId());
					role.setStatus(RoleConst.role_status_enable);

					roleMapper.insertSelective(role);

					AuthorityExample ae = new AuthorityExample();
					ae.createCriteria().andRoleEqualTo(LongUtil.toLong(ro));
					List<Authority> alist = authorityMapper.selectByExample(ae);

					// List<Authority> aList = new ArrayList<Authority>();
					for (int i = 0; i < alist.size(); i++) {
						Authority authority = alist.get(i);
						// Authority a = new Authority();
						Thread.sleep(1);
						authority.setId(CreateID.createId());
						authority.setCreateTime(Timer
								.getDateTimeNow(Timer.Role2));
						authority.setCreateUser(scf922004Input.getOperatorId());
						authority.setRole(role.getId());
					}
					roleHMappper.insertBatch(alist);

					OperatorRoleRelationship orr = new OperatorRoleRelationship();
					Thread.sleep(1);
					orr.setId(CreateID.createId());
					orr.setOperatorId(operatorId);
					orr.setRole(role.getId());
					orr.setCreateTime(Timer.getDateTimeNow(Timer.Role2));
					orr.setCreateUser(scf922004Input.getOperatorId());

					operatorRoleRelationshipMapper.insertSelective(orr);
				}

				// 通知法大大 3011 8101-法大大
			}

			for (String role : scf922004Input.getRoleList()) {
				Thread.sleep(1);
				UserRole ur = new UserRole();

				ur.setId(CreateID.createId());// ID
				ur.setUserId(userInfo.getUserId());// USERID
				ur.setUserStyle(UserConst.user_style_person);// 个人
				ur.setUserRole(role);// 业务角色

				ur.setCreateUser(scf922004Input.getOperatorId());// 创建者
				ur.setCreateTime(Timer.getDateTimeNow(Timer.Role2));// 创建时间
				ur.setUpdateUser(scf922004Input.getOperatorId());// 更新者
				ur.setUpdateTime(Timer.getDateTimeNow(Timer.Role2));// 更新时间

				userRoleMapper.insert(ur);

			}

		} catch (Exception e) {

			rb.setCode(DefaultConst.ERR_2001_CODE);
			rb.setMessage("处理异常，请重新提交");

			TransactionAspectSupport.currentTransactionStatus()
					.setRollbackOnly();

			return rb;
		}

		rb.setCode(DefaultConst.SUCCESS_RESPONSE_CODE);
		rb.setMessage(DefaultConst.SUCCESS_RESPONSE_MESSAGE);
		return rb;

	}

	// 企业信息详情,新增和修改
	public Map<String, Map<String, Object>> SCF923001(Long id) {

		Map<String, Map<String, Object>> result = new HashMap<String, Map<String, Object>>();

		CompanyInfo ci = companyInfoMapper.selectByPrimaryKey(id);

		if (ci == null) {
		} else {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("userId", id);// 客户ID
			data.put("userName", ci.getCompanyName());// 名称
			data.put("three_examinations_to_one",
					ci.getThreeExaminationsToOne());// 三证合一
			data.put("unifiedSocialCreditCode", ci.getUnifiedSocialCreditCode());// 统一社会信用代码
			data.put("businessLicence", ci.getBusinessLicence());// 营业执照号
			data.put("taxId", ci.getTaxId());// 税务登记号
			data.put("industryWhichBelongsTo", ci.getIndustryWhichBelongsTo());// 所属行业
			data.put("areaP", ci.getAreaP());// 所属地区省
			data.put("areaC", ci.getAreaC());// 所属地区市
			data.put("areaQ", ci.getAreaQ());// 所属地区区

			/** 20171009 add by durui 增加画面必输可改项目 start */
			data.put("loanName", ci.getLoanName());// 放款户名
			data.put("loanAccount", ci.getLoanAccount());// 放款账号
			data.put("loanDepositBank", ci.getLoanDepositBank());// 放款开户行
			data.put("receivedPaymentsName", ci.getReceivedPaymentsName());// 回款户名
			data.put("receivedPaymentsAccount", ci.getReceivedPaymentsAccount());// 回款账号
			data.put("receivedPaymentsDepositBank",
					ci.getReceivedPaymentsDepositBank());// 回款开户行
			/** 20171009 add by durui 增加画面必输可改项目 end */

			// 检索法人信息
			CompanyUserRelationshipExample curse = new CompanyUserRelationshipExample();
			curse.createCriteria()
					.andCompanyIdEqualTo(id)
					.andUserTypeEqualTo(
							UserConst.user_info_user_style_representative)
					.andEnableStatusEqualTo(
							UserConst.company_user_relationship_enable_status_yes);

			List<CompanyUserRelationship> representativeList = companyUserRelationshipMapper
					.selectByExample(curse);

			Long tempId = -1L;
			if (representativeList.size() == 1) {
				tempId = representativeList.get(0).getUserId();
			}

			// 法定代表人(法人，启用)
			UserInfoExample uie = new UserInfoExample();
			uie.createCriteria()
					.andUserIdEqualTo(tempId)
					.andEnableStatusEqualTo(
							UserConst.user_info_enable_status_yes)
					.andUserStyleEqualTo(
							UserConst.user_info_user_style_representative);
			List<UserInfo> ui1 = userInfoMapper.selectByExample(uie);

			if (ui1.size() == 1) {
				data.put("corporationId", ui1.get(0).getUserId());// 法人ID
				data.put("corporationName", ui1.get(0).getUserName());// 法人姓名
				data.put("corporationCredentialType", ui1.get(0)
						.getCredentialType());// 法人证件类型
				data.put("corporationCredentialNum", ui1.get(0)
						.getCredentialNum());// 法人证件号码
				data.put("corporationMobilePhone", ui1.get(0).getPhoneNum());// 法人手机号
				data.put("corporationEmail", ui1.get(0).getEmail());// 法人邮箱
				data.put("credentialPic", ui1.get(0).getCredentialPic());// 法人身份证pic
			}

			// 检索联系人信息
			curse = new CompanyUserRelationshipExample();
			curse.createCriteria()
					.andCompanyIdEqualTo(id)
					.andUserTypeEqualTo(UserConst.user_info_user_style_contacts)
					.andEnableStatusEqualTo(
							UserConst.company_user_relationship_enable_status_yes);

			representativeList = companyUserRelationshipMapper
					.selectByExample(curse);

			tempId = -1L;
			if (representativeList.size() == 1) {
				tempId = representativeList.get(0).getUserId();
			}

			uie = new UserInfoExample();
			// 联系人(联系人，启用)
			uie.createCriteria()
					.andUserIdEqualTo(tempId)
					.andEnableStatusEqualTo(
							UserConst.user_info_enable_status_yes)
					.andUserStyleEqualTo(
							UserConst.user_info_user_style_contacts);
			List<UserInfo> ui2 = userInfoMapper.selectByExample(uie);

			if (ui2.size() == 1) {
				data.put("contactsId", ui2.get(0).getUserId());// 联系人ID
				data.put("contactsName", ui2.get(0).getUserName());// 联系人姓名
				data.put("contactsCredentialType", ui2.get(0)
						.getCredentialType());// 联系人证件类型
				data.put("contactsCredentialNum", ui2.get(0).getCredentialNum());// 联系人证件号码
				data.put("contactsMobilePhone", ui2.get(0).getPhoneNum());// 联系人手机号
				data.put("contactsEmail", ui2.get(0).getEmail());// 联系人邮箱
			}

			data.put("unifiedSocialCreditCodePic",
					ci.getUnifiedSocialCreditCodePic());// 统一社会信用代码pic
			data.put("organizationCodePic", ci.getUnifiedSocialCreditCodePic());// 组织机构代码pic
			data.put("businessLicencePic", ci.getBusinessLicencePic());// 营业执照pic
			data.put("taxIdPic", ci.getTaxIdPic());// 税务登记证pic

			// 业务角色列表
			Map<String, Object> roleMap = new HashMap<String, Object>();
			UserRoleExample ure = new UserRoleExample();
			ure.createCriteria().andUserIdEqualTo(id);
			List<UserRole> userRoleList = userRoleMapper.selectByExample(ure);
			Map<String, Object> roledic = commonService.COMDD0009();
			if (data != null) {

				for (UserRole ur : userRoleList) {
					roleMap.put(ur.getUserRole(), roledic.get(ur.getUserRole()));
				}
			}
			data.put("roleMap", roleMap);

			result.put("SCF923001", data);
		}

		// // 三证合一获取
		// result.put("COMDD0015", commonService.COMDD0015());
		// // 所属行业获取
		// result.put("COMDD0011", commonService.COMDD0011());
		// // 个人证件类型获取
		// result.put("COMDD0010", commonService.COMDD0010());
		// // 业务角色下拉框获取
		// result.put("COMDD0009", commonService.COMDD0009());
		// // 所属地区省
		// result.put("COMDD00121", commonService.COMDD00121());
		// // 所属地区市
		// result.put("COMDD00122", commonService.COMDD00122());
		// // 所属地区区
		// result.put("COMDD00123", commonService.COMDD00123());

		return result;
	}

	// 企业新增修改提交
	public ResultBean SCF923002(SCF923002Input scf923002Input) {

		ResultBean rb = new ResultBean();

		TokenBean bean = TokenUtil.getBean(scf923002Input.getToken(),
				redisTemplate);
		if (bean == null) {
			// 错误处理
			logger.debug("token 已经失效" + scf923002Input.getToken());
			rb.setCode(DefaultConst.ERR_0001_CODE);
			rb.setMessage("登录超时，请重新登录");

			return rb;
		}
		Long operatorId = LongUtil.toLong(bean.getUserId());
		scf923002Input.setOperatorId(operatorId);

		// 名称重复检查
		CompanyInfoExample cie = new CompanyInfoExample();
		if (scf923002Input.getUserId() == null) {
			cie.createCriteria().andCompanyNameEqualTo(
					scf923002Input.getUserName());
		} else {
			cie.createCriteria()
					.andUserIdNotEqualTo(scf923002Input.getUserId())
					.andCompanyNameEqualTo(scf923002Input.getUserName());
		}

		if (companyInfoMapper.countByExample(cie) > 0) {

			rb.setCode(DefaultConst.ERR_0001_CODE);
			rb.setMessage("此企业名称已经存在，请输入正确的企业名称");

			return rb;
		}

		// 证件号码重复检查/统一社会信用代码
		cie = new CompanyInfoExample();
		if (scf923002Input.getUserId() == null) {
			cie.createCriteria().andUnifiedSocialCreditCodeEqualTo(
					scf923002Input.getUnifiedSocialCreditCode());
		} else {
			cie.createCriteria()
					.andUserIdNotEqualTo(scf923002Input.getUserId())
					.andUnifiedSocialCreditCodeEqualTo(
							scf923002Input.getUnifiedSocialCreditCode());
		}

		if (companyInfoMapper.countByExample(cie) > 0) {

			// 统一社会信用代码
			rb.setCode(DefaultConst.ERR_0001_CODE);

			if (UserConst.company_info_three_examinations_to_one_yes
					.equals(scf923002Input.getThreeExaminationsToOne())) {
				rb.setMessage("统一社会信用代码，请检查");
			} else {
				rb.setMessage("组织机构代码已经存在，请检查");
			}

			return rb;
		}

		if (!UserConst.company_info_three_examinations_to_one_yes
				.equals(scf923002Input.getThreeExaminationsToOne())) {

			// 营业执照
			cie = new CompanyInfoExample();
			if (scf923002Input.getUserId() == null) {
				cie.createCriteria().andBusinessLicenceEqualTo(
						scf923002Input.getBusinessLicence());
			} else {
				cie.createCriteria()
						.andUserIdNotEqualTo(scf923002Input.getUserId())
						.andBusinessLicenceEqualTo(
								scf923002Input.getBusinessLicence());
			}

			if (companyInfoMapper.countByExample(cie) > 0) {

				// 统一社会信用代码
				rb.setCode(DefaultConst.ERR_0001_CODE);
				rb.setMessage("营业执照已经存在，请检查");

				return rb;
			}

			// 税务登记号码
			cie = new CompanyInfoExample();
			if (scf923002Input.getUserId() == null) {
				cie.createCriteria().andTaxIdEqualTo(scf923002Input.getTaxId());
			} else {
				cie.createCriteria()
						.andUserIdNotEqualTo(scf923002Input.getUserId())
						.andTaxIdEqualTo(scf923002Input.getTaxId());
			}

			if (companyInfoMapper.countByExample(cie) > 0) {

				// 统一社会信用代码
				rb.setCode(DefaultConst.ERR_0001_CODE);
				rb.setMessage("税务登记号已经存在，请检查");

				return rb;
			}
		}

		// String userRole = bean.getOrganizeRoleNo();

		// 业务角色至少要选定一个
		if (scf923002Input.getRoleList().size() == 0) {

			rb.setCode(DefaultConst.ERR_0001_CODE);
			rb.setMessage("必须指定一个业务角色");

			return rb;
		}

		// 法人手机号格式检查
		if (!CheckUtil.matches(scf923002Input.getCorporationMobilePhone(),
				CheckUtil.PHONE)) {

			rb.setCode(DefaultConst.ERR_0001_CODE);
			rb.setMessage("请检查输入的法人手机号格式");

			return rb;
		}

		// 联系人手机号格式检查
		if (!CheckUtil.matches(scf923002Input.getContactsMobilePhone(),
				CheckUtil.PHONE)) {

			rb.setCode(DefaultConst.ERR_0001_CODE);
			rb.setMessage("请检查输入的联系人手机号格式");

			return rb;
		}

		// 法人邮箱格式检查
		if (!CheckUtil.matches(scf923002Input.getCorporationEmail(),
				CheckUtil.EMAIL)) {

			rb.setCode(DefaultConst.ERR_0001_CODE);
			rb.setMessage("请检查输入的法人邮箱格式");

			return rb;
		}

		// 联系人邮箱格式检查
		if (!CheckUtil.matches(scf923002Input.getContactsEmail(),
				CheckUtil.EMAIL)) {

			rb.setCode(DefaultConst.ERR_0001_CODE);
			rb.setMessage("请检查输入的联系人邮箱格式");

			return rb;
		}

		// 法人身份证格式检查
		if (!CheckUtil.matches(scf923002Input.getCorporationCredentialNum(),
				CheckUtil.CERTNO)) {

			rb.setCode(DefaultConst.ERR_0001_CODE);
			rb.setMessage("请检查输入的法人身份证格式");

			return rb;
		}

		// 联系人身份证格式检查
		if (!CheckUtil.matches(scf923002Input.getContactsCredentialNum(),
				CheckUtil.CERTNO)) {

			rb.setCode(DefaultConst.ERR_0001_CODE);
			rb.setMessage("请检查输入的联系人身份证格式");

			return rb;
		}

		// 联系人手机号重复检查
		UserInfoExample uie = new UserInfoExample();
		if (scf923002Input.getUserId() == null) {
			uie.createCriteria()
					.andUserStyleEqualTo(
							UserConst.user_info_user_style_contacts)
					.andPhoneNumEqualTo(scf923002Input.getContactsMobilePhone());
		} else {
			uie.createCriteria()
					.andUserIdNotEqualTo(scf923002Input.getContactsId())
					.andUserStyleEqualTo(
							UserConst.user_info_user_style_contacts)
					.andPhoneNumEqualTo(scf923002Input.getContactsMobilePhone());
		}

		if (userInfoMapper.countByExample(uie) > 0) {

			rb.setCode(DefaultConst.ERR_0001_CODE);
			rb.setMessage("此手机号已经被绑定，请尝试其他手机号");

			return rb;
		}

		// 联系人邮箱重复检查
		uie = new UserInfoExample();
		if (scf923002Input.getUserId() == null) {
			uie.createCriteria()
					.andUserStyleEqualTo(
							UserConst.user_info_user_style_contacts)
					.andEmailEqualTo(scf923002Input.getContactsEmail());
		} else {
			uie.createCriteria()
					.andUserIdNotEqualTo(scf923002Input.getContactsId())
					.andUserStyleEqualTo(
							UserConst.user_info_user_style_contacts)
					.andEmailEqualTo(scf923002Input.getContactsEmail());
		}

		if (userInfoMapper.countByExample(uie) > 0) {

			rb.setCode(DefaultConst.ERR_0001_CODE);
			rb.setMessage("此联系人邮箱已经被绑定，请尝试其他邮箱");

			return rb;
		}

		// 联系人身份证信息
		uie = new UserInfoExample();
		if (scf923002Input.getUserId() == null) {
			uie.createCriteria()
					.andUserStyleEqualTo(
							UserConst.user_info_user_style_contacts)
					.andCredentialNumEqualTo(
							scf923002Input.getContactsCredentialNum());
		} else {
			uie.createCriteria()
					.andUserIdNotEqualTo(scf923002Input.getContactsId())
					.andUserStyleEqualTo(
							UserConst.user_info_user_style_contacts)
					.andCredentialNumEqualTo(
							scf923002Input.getContactsCredentialNum());
		}

		if (userInfoMapper.countByExample(uie) > 0) {

			rb.setCode(DefaultConst.ERR_0001_CODE);
			rb.setMessage("此联系人身份证已经被绑定，请尝试其他身份证");

			return rb;
		}

		try {

			CompanyInfo companyInfo = new CompanyInfo();

			companyInfo.setCompanyName(scf923002Input.getUserName());// 名称
			companyInfo.setThreeExaminationsToOne(scf923002Input
					.getThreeExaminationsToOne());// 三证合一
			companyInfo.setUnifiedSocialCreditCode(scf923002Input
					.getUnifiedSocialCreditCode());// 统一社会信用代码 三证未合一时存储组织机构代码

			companyInfo.setBusinessLicence(scf923002Input.getBusinessLicence());// 营业执照号
			companyInfo.setTaxId(scf923002Input.getTaxId());// 税务登记号
			companyInfo.setIndustryWhichBelongsTo(scf923002Input
					.getIndustryWhichBelongsTo());// 所属行业
			companyInfo.setAreaP(scf923002Input.getProvince());// 所属地区省
			companyInfo.setAreaC(scf923002Input.getCity());// 所属地区市
			companyInfo.setAreaQ(scf923002Input.getArea());// 所属地区区

			/** 20171009 add by durui 增加画面必输可改项目 start */
			companyInfo.setLoanName(scf923002Input.getLoanName());// 放款户名
			companyInfo.setLoanAccount(scf923002Input.getLoanAccount());// 放款账号
			companyInfo.setLoanDepositBank(scf923002Input.getLoanDepositBank());// 放款开户行
			companyInfo.setReceivedPaymentsName(scf923002Input
					.getReceivedPaymentsName());// 回款户名
			companyInfo.setReceivedPaymentsAccount(scf923002Input
					.getReceivedPaymentsAccount());// 回款账号
			companyInfo.setReceivedPaymentsDepositBank(scf923002Input
					.getReceivedPaymentsDepositBank());// 回款开户行
			/** 20171009 add by durui 增加画面必输可改项目 end */

			/** 20171017 add by zhangxu 保存图片 start */
			// 统一社会信用代码
			if (!"".equals(scf923002Input.getUnifiedSocialCreditCodePic())) {
				Long unifiedSocialCreditCodePic = this.saveImage(
						scf923002Input.getUnifiedSocialCreditCodePic(),
						scf923002Input.getToken());
				if (null == unifiedSocialCreditCodePic) {
					rb.setCode(DefaultConst.ERR_2001_CODE);
					rb.setMessage(DefaultConst.ERR_2003_MSG);
					return rb;
				}
				companyInfo
						.setUnifiedSocialCreditCodePic(unifiedSocialCreditCodePic);
			}
			if (!"".equals(scf923002Input.getBusinessLicencePic())) {
				Long businessLicencePic = this.saveImage(
						scf923002Input.getBusinessLicencePic(),
						scf923002Input.getToken());
				if (null == businessLicencePic) {
					rb.setCode(DefaultConst.ERR_2001_CODE);
					rb.setMessage(DefaultConst.ERR_2003_MSG);
					return rb;
				}
				companyInfo.setBusinessLicencePic(businessLicencePic);
			}
			if (!"".equals(scf923002Input.getTaxIdPic())) {
				Long taxIdPic = this.saveImage(scf923002Input.getTaxIdPic(),
						scf923002Input.getToken());
				if (null == taxIdPic) {
					rb.setCode(DefaultConst.ERR_2001_CODE);
					rb.setMessage(DefaultConst.ERR_2003_MSG);
					return rb;
				}
				companyInfo.setTaxIdPic(taxIdPic);
			}
			/** 20171017 add by zhangxu 保存图片 end */

			// 法定代表人
			UserInfo userInfo = new UserInfo();

			userInfo.setUserStyle(UserConst.user_info_user_style_representative);
			userInfo.setUserName(scf923002Input.getCorporationName());// 法人名
			userInfo.setCredentialType(scf923002Input
					.getCorporationCredentialType());// 证件类型
			userInfo.setCredentialNum(scf923002Input
					.getCorporationCredentialNum());// 证件号码
			userInfo.setPhoneNum(scf923002Input.getCorporationMobilePhone());// 手机号
			userInfo.setEmail(scf923002Input.getCorporationEmail());// 邮箱
			userInfo.setEnableStatus(UserConst.user_info_enable_status_yes);// 可用状态
			/** 20171017 add by zhangxu 保存图片 start */
			if (!"".equals(scf923002Input.getCredentialPic())) {
				Long credentialPic = this.saveImage(
						scf923002Input.getCredentialPic(),
						scf923002Input.getToken());
				if (null == credentialPic) {
					rb.setCode(DefaultConst.ERR_2001_CODE);
					rb.setMessage(DefaultConst.ERR_2003_MSG);
					return rb;
				}
				userInfo.setCredentialPic(credentialPic);
			}
			/** 20171017 add by zhangxu 保存图片 end */

			// 联系人
			UserInfo userInfo1 = new UserInfo();

			userInfo1.setUserStyle(UserConst.user_info_user_style_contacts);
			userInfo1.setUserName(scf923002Input.getContactsName());// 联系人名
			userInfo1.setCredentialType(scf923002Input
					.getContactsCredentialType());// 证件类型
			userInfo1.setCredentialNum(scf923002Input
					.getContactsCredentialNum());// 证件号码
			userInfo1.setPhoneNum(scf923002Input.getContactsMobilePhone());// 手机号
			userInfo1.setEmail(scf923002Input.getContactsEmail());// 邮箱
			userInfo1.setCreateUser(scf923002Input.getOperatorId());// 创建者
			userInfo1.setCreateTime(Timer.getDateTimeNow(Timer.Role2));// 创建时间
			userInfo1.setUpdateUser(scf923002Input.getOperatorId());// 更新者
			userInfo1.setUpdateTime(Timer.getDateTimeNow(Timer.Role2));// 更新时间
			userInfo1.setEnableStatus(UserConst.user_info_enable_status_yes);// 可用状态

			// 如果是新增
			if (scf923002Input.getUserId() == null) {
				userInfo.setCreateUser(scf923002Input.getOperatorId());// 创建者
				userInfo.setCreateTime(Timer.getDateTimeNow(Timer.Role2));// 创建时间
				Thread.sleep(1);
				companyInfo.setUserId(CreateID.createId());
				companyInfo
						.setEnableStatus(UserConst.user_info_enable_status_yes);// 20171022
																				// ADD
				companyInfoMapper.insert(companyInfo);

				Thread.sleep(1);
				userInfo.setUserId(CreateID.createId());// 法人ID
				userInfoMapper.insert(userInfo);

				Thread.sleep(1);
				userInfo1.setUserId(CreateID.createId());// 联系人ID
				userInfoMapper.insert(userInfo1);

				CompanyUserRelationship cur = new CompanyUserRelationship();
				Thread.sleep(1);
				cur.setId(CreateID.createId());
				cur.setCompanyId(companyInfo.getUserId());
				cur.setUserId(userInfo.getUserId());
				cur.setUserType(UserConst.user_info_user_style_representative);
				cur.setEnableStatus(UserConst.company_user_relationship_enable_status_yes);
				cur.setCreateUser(scf923002Input.getOperatorId());// 创建者
				cur.setCreateTime(Timer.getDateTimeNow(Timer.Role2));// 创建时间
				cur.setUpdateUser(scf923002Input.getOperatorId());// 更新者
				cur.setUpdateTime(Timer.getDateTimeNow(Timer.Role2));// 更新时间
				companyUserRelationshipMapper.insert(cur);

				cur = new CompanyUserRelationship();
				Thread.sleep(1);
				cur.setId(CreateID.createId());
				cur.setCompanyId(companyInfo.getUserId());
				cur.setUserId(userInfo1.getUserId());
				cur.setUserType(UserConst.user_info_user_style_contacts);
				cur.setEnableStatus(UserConst.company_user_relationship_enable_status_yes);
				cur.setCreateUser(scf923002Input.getOperatorId());// 创建者
				cur.setCreateTime(Timer.getDateTimeNow(Timer.Role2));// 创建时间
				cur.setUpdateUser(scf923002Input.getOperatorId());// 更新者
				cur.setUpdateTime(Timer.getDateTimeNow(Timer.Role2));// 更新时间
				companyUserRelationshipMapper.insert(cur);

				// 加超管操作员
				Operator op = new Operator();
				Thread.sleep(1);
				op.setOperatorId(CreateID.createId());
				op.setAuditingStatus(RoleConst.operator_auditing_status_start);
				op.setOperatorStyle(RoleConst.operator_style_company);
				op.setStatus(RoleConst.operator_status_enable);
				op.setName("超级管理员");
				op.setCreateUser(scf923002Input.getOperatorId());
				op.setCreateTime(Timer.getDateTimeNow(Timer.Role2));
				String pas = PasswordGenerator.getFixLenthString();
				op.setPassword(DigestUtils.md5Hex(pas));
				op.setWrongTimes(0L);
				op.setPhone(Long.valueOf(scf923002Input
						.getContactsMobilePhone()));
				op.setEmail(scf923002Input.getContactsEmail());
				op.setCredentialType(scf923002Input.getContactsCredentialType());
				op.setCredentialNum(scf923002Input.getContactsCredentialNum());

				operatorMapper.insertSelective(op);

				logger.debug("开始发初始密码短信 需要SMS模块已经启动 phone=" + op.getPhone());

				SMSHelper.doSend(DefaultConst.SCF_PLATFORM_ID,
						StringUtil.toString(op.getPhone()), "【用友产融】您的初始密码为:"
								+ pas, Timer.getTimestamp());

				logger.debug("初始密码短信已经发送 phone=" + op.getPhone());

				// MailHelper.doSend(DefaultConst.SCF_PLATFORM_ID, "供应链金融平台提示",
				// op.getEmail(), "初始密码为:" + pas, Timer.getTimestamp());

				// 加超管角色
				for (String ro : scf923002Input.getRoleList()) {

					Role role = new Role();
					Thread.sleep(1);
					role.setId(CreateID.createId());

					role.setName("超级管理员");
					role.setUserId(companyInfo.getUserId());
					role.setIsAdmin(RoleConst.role_is_admin_yes);
					role.setUserRole(ro);
					role.setDescription("超级管理员");

					role.setCreateTime(Timer.getDateTimeNow(Timer.Role2));
					role.setCreateUser(scf923002Input.getOperatorId());
					role.setStatus(RoleConst.role_status_enable);

					roleMapper.insertSelective(role);

					AuthorityExample ae = new AuthorityExample();
					ae.createCriteria().andRoleEqualTo(LongUtil.toLong(ro));
					List<Authority> alist = authorityMapper.selectByExample(ae);

					// List<Authority> aList = new ArrayList<Authority>();
					for (int i = 0; i < alist.size(); i++) {
						Authority authority = alist.get(i);
						Thread.sleep(1);
						authority.setId(CreateID.createId());
						authority.setCreateTime(Timer
								.getDateTimeNow(Timer.Role2));
						authority.setCreateUser(scf923002Input.getOperatorId());
						authority.setRole(role.getId());
					}
					roleHMappper.insertBatch(alist);

					OperatorRoleRelationship orr = new OperatorRoleRelationship();
					Thread.sleep(1);
					orr.setId(CreateID.createId());
					orr.setOperatorId(op.getOperatorId());
					orr.setRole(role.getId());
					orr.setCreateTime(Timer.getDateTimeNow(Timer.Role2));
					orr.setCreateUser(scf923002Input.getOperatorId());

					operatorRoleRelationshipMapper.insertSelective(orr);
				}

			} else {
				companyInfo.setUserId(scf923002Input.getUserId());
				userInfo.setUserId(scf923002Input.getCorporationId());// 法人ID
				userInfo1.setUserId(scf923002Input.getContactsId());// 联系人ID
				userInfo.setUpdateUser(scf923002Input.getOperatorId());// 更新者
				userInfo.setUpdateTime(Timer.getDateTimeNow(Timer.Role2));// 更新时间

				// 将旧的业务角色删除
				UserRoleExample ure = new UserRoleExample();
				ure.createCriteria().andUserIdEqualTo(
						scf923002Input.getOperatorId());
				companyInfoMapper.updateByPrimaryKeySelective(companyInfo);
				userRoleMapper.deleteByExample(ure);

				userInfoMapper.updateByPrimaryKeySelective(userInfo);
				userInfoMapper.updateByPrimaryKeySelective(userInfo1);

				RoleExample re = new RoleExample();
				re.createCriteria()
						.andUserIdEqualTo(scf923002Input.getUserId())
						.andIsAdminEqualTo(RoleConst.role_is_admin_yes);
				List<Role> roleList = roleMapper.selectByExample(re);
				if (roleList == null || roleList.size() == 0) {
					rb.setCode(DefaultConst.ERR_2001_CODE);
					rb.setMessage("系统自动建立的超级管理员角色读取出错");

					return rb;
				} else {
					OperatorRoleRelationshipExample orre = new OperatorRoleRelationshipExample();
					orre.createCriteria().andRoleEqualTo(
							roleList.get(0).getId());
					List<OperatorRoleRelationship> orrList = operatorRoleRelationshipMapper
							.selectByExample(orre);
					if (orrList == null || orrList.size() == 0) {
						rb.setCode(DefaultConst.ERR_2001_CODE);
						rb.setMessage("系统自动建立的超级管理员读取出错");

						return rb;
					}

					operatorId = orrList.get(0).getOperatorId();
				}

				// 判断关键信息发生变化
				Operator op = operatorMapper.selectByPrimaryKey(operatorId);
				DigitalCertificateExample example = new DigitalCertificateExample();
				example.createCriteria()
						.andBindStatusEqualTo(
								DigitalCertificateConst.bind_status_2)
						.andAuditingStatusEqualTo(
								DigitalCertificateConst.auditing_status_0)
						.andUserIdEqualTo(companyInfo.getUserId())
						.andSignBankIdEqualTo(1L);
				
				int count = digitalCertificateMapper.countByExample(example);

				// 有一条保理数字证书待审核数据时则不允许修改此信息
				if (count == 1) {
					logger.error("法大大资料审核中，不允许随意变更资料 UserId="
							+ companyInfo.getUserId());
					return new ResultBean(DefaultConst.ERR_2001_CODE,
							"法大大资料审核中，不允许随意变更资料");
				}

				example = new DigitalCertificateExample();
				example.createCriteria()
						.andBindStatusEqualTo(
								DigitalCertificateConst.bind_status_1)
						.andAuditingStatusEqualTo(
								DigitalCertificateConst.auditing_status_1)
						.andUserIdEqualTo(companyInfo.getUserId())
						.andSignBankIdEqualTo(1L);
				//TODO 和个人逻辑一样没如果不保留保理默认数据则需要修改1L的关联方式
				
				count = digitalCertificateMapper.countByExample(example);

				// 有一条保理数字证书数据时要通知法大大更新，通知个人变更
				if ((count == 1)
						&& (!op.getPhone().equals(
								Long.valueOf(scf923002Input
										.getContactsMobilePhone())) || !op
								.getEmail().equals(
										scf923002Input.getContactsEmail()))) {
					// 通知法大大
					// HttpConnection hc = new
					// HttpConnection("http://localhost:58101/infochange");//
					// TODO地址需要配置
					// 胜苏，20171014，替换为HttpClientUtil.post

					Fdd3011Request tx3011Req = new Fdd3011Request();
					tx3011Req.setCustomer_id(f(companyInfo.getUserId()));
					tx3011Req.setEmail(op.getEmail());
					tx3011Req.setMobile(f(op.getPhone()));
					tx3011Req.setEmail_new(userInfo1.getEmail());
					tx3011Req.setMobile_new(userInfo1.getPhoneNum());
					tx3011Req.setCustomer_type(UserConst.fdd_person);
					// tx3011Req.setFdd_customer_id("");

					String ret = HttpClientUtil.post(
							"http://localhost:58101/infochange", tx3011Req);
					// String ret = hc.send(tx3011Req);

					ResultBean b = JSON.parseObject(ret, ResultBean.class);
					if (DefaultConst.SUCCESS_RESPONSE_CODE.equals(b.getCode())) {
						logger.error("企业修改法大大信息失败 UserId="
								+ companyInfo.getUserId() + " "
								+ b.getMessage());
						return new ResultBean(DefaultConst.ERR_2001_CODE,
								"系统错误，请重试");
					} else {
						logger.error("企业修改法大大信息成功UserId="
								+ companyInfo.getUserId() + " "
								+ b.getMessage());
						// 通知个人 暂时没有做，因为一个企业的任意操作员都有可能是申请人，关联关系维护复杂
					}
					
				}

				op.setPhone(Long.valueOf(scf923002Input
						.getContactsMobilePhone()));
				op.setEmail(scf923002Input.getContactsEmail());
				op.setCredentialType(scf923002Input.getContactsCredentialType());
				op.setCredentialNum(scf923002Input.getContactsCredentialNum());

				op.setUpdateTime(Timer.getDateTimeNow(Timer.Role2));
				op.setUpdateUser(scf923002Input.getOperatorId());
				operatorMapper.updateByPrimaryKeySelective(op);

				// 删除删超管角色
				re = new RoleExample();
				re.createCriteria()
						.andUserIdEqualTo(scf923002Input.getUserId())
						.andIsAdminEqualTo(RoleConst.role_is_admin_yes);
				roleMapper.deleteByExample(re);

				// 删除所有管理员操作员和角色的关系
				OperatorRoleRelationshipExample orre = new OperatorRoleRelationshipExample();
				orre.createCriteria().andOperatorIdEqualTo(operatorId);
				operatorRoleRelationshipMapper.deleteByExample(orre);

				// 加超管角色
				for (String ro : scf923002Input.getRoleList()) {

					Role role = new Role();
					Thread.sleep(1);
					role.setId(CreateID.createId());
					role.setUserId(companyInfo.getUserId());

					role.setName("超级管理员");
					// role.setUserId(scf923002Input.getUserId());
					role.setIsAdmin(RoleConst.role_is_admin_yes);

					role.setUserRole(ro);
					role.setDescription("超级管理员");

					role.setCreateTime(Timer.getDateTimeNow(Timer.Role2));
					role.setCreateUser(scf923002Input.getOperatorId());
					role.setStatus(RoleConst.role_status_enable);

					roleMapper.insertSelective(role);

					AuthorityExample ae = new AuthorityExample();
					ae.createCriteria().andRoleEqualTo(LongUtil.toLong(ro));
					List<Authority> alist = authorityMapper.selectByExample(ae);

					// List<Authority> aList = new ArrayList<Authority>();
					for (int i = 0; i < alist.size(); i++) {
						Authority authority = alist.get(i);
						// Authority a = new Authority();
						Thread.sleep(1);
						authority.setId(CreateID.createId());
						authority.setCreateTime(Timer
								.getDateTimeNow(Timer.Role2));
						authority.setCreateUser(scf923002Input.getOperatorId());
						authority.setRole(role.getId());
					}
					roleHMappper.insertBatch(alist);

					OperatorRoleRelationship orr = new OperatorRoleRelationship();
					Thread.sleep(1);
					orr.setId(CreateID.createId());
					orr.setOperatorId(operatorId);
					orr.setRole(role.getId());
					orr.setCreateTime(Timer.getDateTimeNow(Timer.Role2));
					orr.setCreateUser(scf923002Input.getOperatorId());

					operatorRoleRelationshipMapper.insertSelective(orr);
				}
				// 通知客户
				// 通知法大大 3011 8101-法大大
			}

			// 删除此企业的所有业务角色
			UserRoleExample ure = new UserRoleExample();
			ure.createCriteria().andUserIdEqualTo(companyInfo.getUserId());
			userRoleMapper.deleteByExample(ure);

			for (String role : scf923002Input.getRoleList()) {
				Thread.sleep(1);
				UserRole ur = new UserRole();

				ur.setId(CreateID.createId());// ID
				ur.setUserId(companyInfo.getUserId());// USERID
				ur.setUserStyle(UserConst.user_style_company);// 企业
				ur.setUserRole(role);// 业务角色

				ur.setCreateUser(scf923002Input.getOperatorId());// 创建者
				ur.setCreateTime(Timer.getDateTimeNow(Timer.Role2));// 创建时间

				userRoleMapper.insert(ur);
			}

		} catch (Exception e) {

			rb.setCode(DefaultConst.ERR_2001_CODE);
			rb.setMessage(DefaultConst.ERR_2001_MSG);
			TransactionAspectSupport.currentTransactionStatus()
					.setRollbackOnly();
			return rb;
		}

		rb.setCode(DefaultConst.SUCCESS_RESPONSE_CODE);
		rb.setMessage(DefaultConst.SUCCESS_RESPONSE_MESSAGE);
		return rb;

	}

	// 判断是否用户已经被添加过
	Boolean contains(List<SCF931002Output> result, String key) {
		if (result == null) {
			return false;
		}

		for (SCF931002Output o : result) {
			if (key.equals(f(o.getUserId()))) {
				return true;
			}
		}
		return false;
	}

	// 客户关系查询
	// 客户名称 userName
	// 证件号码 credentialNum
	// 客户类型 userType
	// 业务角色 roleType
	public ResultBean SCF931002(SCF931002Input input) {

		List<SCF931002Output> result = new ArrayList<SCF931002Output>();

		Map<String, Object> params = new HashMap<String, Object>();

		if ("".equals(input.getCompanyName())) {
			params.put("userName", null);
		} else {
			params.put("userName", input.getCompanyName());
		}

		if ("".equals(input.getCredentialNum())) {
			params.put("credentialNum", null);
		} else {
			params.put("credentialNum", input.getCredentialNum());
		}

		params.put("userType", input.getUserType());
		params.put("userRole", input.getRoleType());

		List<Map<String, Object>> dataList = userMappper
				.getUserRelationshipList(params);

		Map<Object, Object> typedic = paramService
				.getMap("user_role/user_style");

		Map<Object, Object> roledic = paramService
				.getMap("user_info/user_role");

		Map<Object, Object> credentialtypedic = paramService
				.getMap("user_info/credential_type");

		for (Map<String, Object> data : dataList) {

			// 只处理核心企业和借款方
			if (UserConst.user_role_type_1.equals(f(data.get("userRole")))
					|| UserConst.user_role_type_3
							.equals(f(data.get("userRole")))) {

				// 检查是不是已经有了同样企业信息，有则将业务角色和操作链接进行拼接
				if (contains(result, f(data.get("userId")))) {
					// 数据问题，核心企业可能会被关联多次
					// for (int i = 0; i < result.size(); i++) {
					// SCF931002Output o = result.get(i);
					// if (f(data.get("userId")).equals(f(o.getUserId()))) {
					// if (o.getUserRole().indexOf(
					// f(roledic.get(f(data.get("userRole"))))) < 0) {
					//
					// o.setUserRole(o.getUserRole() + " | "
					// + roledic.get(f(data.get("userRole"))));
					// }
					//
					// if (UserConst.user_role_type_3.equals(f(data
					// .get("userRole")))) {
					// o.setCaption4(UserConst.LendingRelationShip);
					// o.setUrl4("LendingRelationShipModify.html?id="
					// + data.get("userId"));
					// }
					// }
					// }
				} else {
					SCF931002Output output = new SCF931002Output();
					output.setUserName(f(data.get("userName")));
					output.setUserId(f(data.get("userId")));
					output.setCredentialNum(f(data.get("credentialNum")));
					output.setUserType(f(typedic.get(f(data.get("userType")))));
					output.setUserRole(f(roledic.get(f(data.get("userRole")))));

					// 企业处理
					if (UserConst.user_style_person.equals(f(data
							.get("userType")))) {

						output.setCredentialType(f(credentialtypedic.get(f(data
								.get("credentialType")))));
						// output.setUrl3("user/SCF922003/" +
						// data.get("userId"));

					} else if (UserConst.user_style_company.equals(f(data
							.get("userType")))) {
						output.setCredentialType(UserConst.company_info_three_examinations_to_one_no
								.equals(f(data.get("three_examinations_to_one"))) ? UserConst.company_info_credential_type_03_name
								: UserConst.company_info_credential_type_02_name);
					}

					if (UserConst.user_role_type_1.equals(f(data
							.get("userRole")))) {
						output.setCaption1(UserConst.UserRelationShip);
						output.setUrl1("UserRelationShipModify1.html?id="
								+ data.get("userId") + "&roleType=3");
						output.setUrl2("UserRelationShipModify2.html?id="
								+ data.get("userId") + "&roleType=2");
						output.setUrl3("UserRelationShipModify3.html?id="
								+ data.get("userId") + "&roleType=4");
						// output.setUrl2("user/enable.html?id=" +
						// data.get("userId"));

					} else if (UserConst.user_role_type_3.equals(f(data
							.get("userRole")))) {
						output.setCaption4(UserConst.LendingRelationShip);
						output.setUrl4("LendingRelationShipModify.html?id="
								+ data.get("userId") + "&roleType=5");
						// output.setUrl2("user/disble.html?id=" +
						// data.get("userId"));
					}

					result.add(output);
				}
			}
		}

		return new ResultBean(DefaultConst.SUCCESS_RESPONSE_CODE,
				DefaultConst.SUCCESS_RESPONSE_MESSAGE, result);

	}

	// 已关联方检索
	public ResultBean SCF931003(Long userId, String roleType) {

		CompanyRelationshipExample crse = new CompanyRelationshipExample();
		crse.createCriteria().andCompanyIdEqualTo(userId)
				.andCompanyRole2EqualTo(roleType);

		List<SCF931003Output> result = new ArrayList<SCF931003Output>();

		// 已关联方检索
		List<CompanyRelationship> dataList = companyRelationshipMapper
				.selectByExample(crse);

		Map<String, Object> COMDD0031 = commonService.COMDD0031();

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("user_style_company", UserConst.user_style_company);
		params.put("user_style_person", UserConst.user_style_person);

		List<Map<String, Object>> datalist = userMappper
				.getCredentialNumList(params);

		Map<Object, Object> credentialtypedic = paramService
				.getMap("user_info/credential_type");

		Map<String, Object> COMDD00321 = new HashMap<String, Object>();
		Map<String, Object> COMDD00322 = new HashMap<String, Object>();

		for (Map<String, Object> data : datalist) {
			COMDD00321.put(f(data.get("userId")), data.get("credentialNum"));
			COMDD00322.put(f(data.get("userId")), data.get("credentialType"));
		}

		for (CompanyRelationship data : dataList) {
			SCF931003Output output = new SCF931003Output();
			output.setUserId(data.getCompanyId2());
			output.setUserName(f(COMDD0031.get(f(data.getCompanyId2()))));
			output.setCredentialNum(f(COMDD00321.get(f(data.getCompanyId2()))));
			output.setCredentialType(f(credentialtypedic.get(f(COMDD00322
					.get(f(data.getCompanyId2()))))));

			// Caption 本期不实现

			result.add(output);
		}

		return new ResultBean(DefaultConst.SUCCESS_RESPONSE_CODE,
				DefaultConst.SUCCESS_RESPONSE_MESSAGE, result);
	}

	// 判断是否用户已经被添加过
	Boolean contains2(List<CompanyRelationship> result, String key) {
		if (result == null) {
			return false;
		}

		for (CompanyRelationship o : result) {
			if (key.equals(f(o.getCompanyId2()))) {
				return true;
			}
		}
		return false;
	}

	// 可关联方检索
	public ResultBean SCF931004(Long companyId, SCF931004Input input,
			String userRole) {
		List<SCF931003Output> result = new ArrayList<SCF931003Output>();

		Map<String, Object> params = new HashMap<String, Object>();

		if ("".equals(input.getCompanyName())) {
			params.put("userName", null);
		} else {
			params.put("userName", input.getCompanyName());
		}

		if ("".equals(input.getCredentialNum())) {
			params.put("credentialNum", null);
		} else {
			params.put("credentialNum", input.getCredentialNum());
		}

		params.put("userType", null);
		params.put("userRole", userRole);

		List<Map<String, Object>> dataList = userMappper
				.getUserInfoList(params);

		CompanyRelationshipExample crse = new CompanyRelationshipExample();
		crse.createCriteria().andCompanyIdEqualTo(companyId)
				.andCompanyRole2EqualTo(userRole);

		// 已关联方检索
		List<CompanyRelationship> allReady = companyRelationshipMapper
				.selectByExample(crse);

		Map<Object, Object> credentialtypedic = paramService
				.getMap("user_info/credential_type");

		for (Map<String, Object> data : dataList) {

			// 当检索结果已经被添加过则忽略
			if (!contains2(allReady, f(data.get("userId")))) {
				SCF931003Output output = new SCF931003Output();
				output.setUserName(f(data.get("userName")));
				output.setUserId(Long.valueOf(f(data.get("userId"))));
				output.setCredentialNum(f(data.get("credentialNum")));

				// 企业处理
				if (UserConst.user_style_person.equals(f(data.get("userType")))) {
					output.setCredentialType(f(credentialtypedic.get(f(data
							.get("credentialType")))));

				} else if (UserConst.user_style_company.equals(f(data
						.get("userType")))) {
					output.setCredentialType(UserConst.company_info_three_examinations_to_one_no
							.equals(f(data.get("three_examinations_to_one"))) ? UserConst.company_info_credential_type_03_name
							: UserConst.company_info_credential_type_02_name);
				}

				result.add(output);
			}
		}

		return new ResultBean(DefaultConst.SUCCESS_RESPONSE_CODE,
				DefaultConst.SUCCESS_RESPONSE_MESSAGE, result);
	}

	// 新增关联
	public ResultBean SCF931005(SCF931005Input scf931005Input) {

		ResultBean rb = new ResultBean();
		String companyRole;

		if (scf931005Input.getCodes() == null
				|| "".equals(scf931005Input.getCodes())) {
			rb.setCode(DefaultConst.ERR_0001_CODE);
			rb.setMessage("没有选中企业!");

			return rb;
		}

		if (UserConst.user_role_type_5.equals(scf931005Input.getRoleType())) {
			companyRole = UserConst.user_role_type_3;
		} else {
			companyRole = UserConst.user_role_type_1;
		}

		String[] codes = scf931005Input.getCodes().split(",");

		List<Long> datalist = new ArrayList<Long>();
		datalist.add(-1L);

		for (String l : codes) {
			datalist.add(Long.valueOf(l));
		}

		CompanyRelationshipExample crse = new CompanyRelationshipExample();
		crse.createCriteria().andCompanyIdEqualTo(scf931005Input.getUserId())
				.andCompanyRoleEqualTo(companyRole).andCompanyRole2EqualTo("")
				.andCompanyId2In(datalist);

		// 已关联方检索
		List<CompanyRelationship> allReady = companyRelationshipMapper
				.selectByExample(crse);

		if (allReady != null && allReady.size() > 0) {
			rb.setCode(DefaultConst.ERR_0001_CODE);
			rb.setMessage("选中的数据有的已经被关联，请重新检索并执行新增操作!");

			return rb;
		}

		// 检查输入数据 只能绑定核心企业的相关方和借款方的共借方
		// for (SCF931005InputData scf931005InputData : scf931005Input
		// .getDatalist()) {
		//
		// if (!UserConst.user_role_type_1.equals(scf931005InputData
		// .getRoleType())
		// && !UserConst.user_role_type_3.equals(scf931005InputData
		// .getRoleType())) {
		// rb.setCode(DefaultConst.ERR_0001_CODE);
		// rb.setMessage("关联失败，请重试");
		// }
		// }

		try {
			for (Long code : datalist) {
				CompanyRelationship crs = new CompanyRelationship();

				Thread.sleep(1);
				crs.setId(CreateID.createId());// ID
				crs.setCompanyId(scf931005Input.getUserId());// 客户ID
				crs.setCompanyRole(companyRole);// 客户业务角色
				crs.setCompanyId2(code);// 客户ID2
				crs.setCompanyRole2(scf931005Input.getRoleType());// 客户业务角色2

				crs.setEnableStatus(UserConst.company_relationship_enable_status_yes);// 可用状态

				crs.setCreateUser(scf931005Input.getOperatorId());// 创建者
				crs.setCreateTime(Timer.getDateTimeNow(Timer.Role2));// 创建时间

				companyRelationshipMapper.insertSelective(crs);
			}

		} catch (Exception e) {
			rb.setCode(DefaultConst.ERR_2001_CODE);
			rb.setMessage(DefaultConst.ERR_2001_MSG);
			TransactionAspectSupport.currentTransactionStatus()
					.setRollbackOnly();
		}

		rb.setCode(DefaultConst.SUCCESS_RESPONSE_CODE);
		rb.setMessage(DefaultConst.SUCCESS_RESPONSE_MESSAGE);

		return rb;
	}

	private String f(Object obj) {
		return StringUtil.toString(obj);
	}

	public String FormatDateStringFrom17(String time) {
		if (StringUtil.isEmpty(time)) {
			return "";
		}
		SimpleDateFormat oldFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		SimpleDateFormat newFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date;
		try {
			date = oldFormat.parse(time);
		} catch (ParseException e) {
			logger.error("时间格式化失败:" + time);
			return "";
		}
		return newFormat.format(date);
	}

	public Long saveImage(String fileId, String token) {
		// 保存图片：统一社会信用代码/组织机构代码
		HashMap<String, Object> fileParam = new HashMap<String, Object>();
		fileParam.put("fileId", fileId);
		fileParam.put("key", token);
		String upSaveFile;
		try {
			// upSaveFile = HttpClientUtil.post(CommonUrl.url_file +
			// "upSaveFile",
			upSaveFile = HttpClientUtil.post(URLConst.URL_CONTRACT
					+ "/fileControl/upSaveFile", fileParam);
			if (StringUtil.isNotEmpty(upSaveFile)) {
				ResultBean filers = JsonUtil.toBean(upSaveFile,
						ResultBean.class);
				if (DefaultConst.SUCCESS_RESPONSE_CODE.equals(filers.getCode())) {
					return LongUtil.toLong(filers.getDataList().get(0));
				}
			}
		} catch (IOException e) {
			TransactionAspectSupport.currentTransactionStatus()
					.setRollbackOnly();
		}
		return null;
	}

}