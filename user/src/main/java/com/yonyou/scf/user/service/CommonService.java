package com.yonyou.scf.user.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yonyou.scf.common.constant.UserConst;
import com.yonyou.scf.common.entity.CompanyRelationship;
import com.yonyou.scf.common.entity.CompanyRelationshipExample;
import com.yonyou.scf.common.entity.UserRoleType;
import com.yonyou.scf.common.entity.UserRoleTypeExample;
import com.yonyou.scf.common.mapper.auto.CompanyRelationshipMapper;
import com.yonyou.scf.common.mapper.auto.UserRoleTypeMapper;
import com.yonyou.scf.common.output.UserS0003Output;
import com.yonyou.scf.common.util.LongUtil;
import com.yonyou.scf.common.util.StringUtil;
import com.yonyou.scf.user.mapper.hand.UserMapper;

@Transactional
@Service
public class CommonService {

	@Autowired
	private UserMapper userMappper;

	@SuppressWarnings("rawtypes")
	@Resource
	private StringRedisTemplate stringRedisTemplate;

	@Resource
	private UserRoleTypeMapper userRoleTypeMapper;

	// 客户名称获取
	public Map<String, Object> COMDD0031() {

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("user_style_company", UserConst.user_style_company);
		params.put("user_style_person", UserConst.user_style_person);

		List<Map<String, Object>> datalist = userMappper
				.getUserNameList(params);

		Map<String, Object> result = new HashMap<String, Object>();

		for (Map<String, Object> data : datalist) {
			result.put(data.get("userId").toString(), data.get("userName"));
		}

		return result;
	}

	// 客户名称获取-单据用
	public Map<String, Object> COMDD0031R() {

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("user_style_company", UserConst.user_style_company);
		params.put("user_style_person", UserConst.user_style_person);

		List<Map<String, Object>> datalist = userMappper
				.getUserNameListDj(params);

		Map<String, Object> result = new HashMap<String, Object>();

		for (Map<String, Object> data : datalist) {
			if (result.containsKey(StringUtil.toString(data.get("userName")))) {
				result.put(StringUtil.toString(data.get("userName")),
						result.get(StringUtil.toString(data.get("userName")))
								+ "," + StringUtil.toString(data.get("userId")));// 如果不是一对一
			} else {
				result.put(StringUtil.toString(data.get("userName")),
						StringUtil.toString(data.get("userId")));
			}
		}

		return result;
	}

	// 客户名称获取
	public Map<String, Object> GetCOMNameByRole(String roleType) {

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("user_style_company", UserConst.user_style_company);
		params.put("user_style_person", UserConst.user_style_person);
		if (roleType == null || "".equals(roleType)) {
			params.put("user_role", null);
		} else {
			params.put("user_role", roleType);
		}

		List<Map<String, Object>> datalist = userMappper
				.getUserNameListByRole(params);

		Map<String, Object> result = new HashMap<String, Object>();

		for (Map<String, Object> data : datalist) {
			result.put(data.get("userId").toString(), data.get("userName"));
		}

		return result;
	}

	// 证件号码获取
	public Map<String, Object> COMDD0032() {

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("user_style_company", UserConst.user_style_company);
		params.put("user_style_person", UserConst.user_style_person);

		List<Map<String, Object>> datalist = userMappper
				.getCredentialNumList(params);

		Map<String, Object> result = new HashMap<String, Object>();

		for (Map<String, Object> data : datalist) {
			result.put(data.get("userId").toString(), data.get("credentialNum"));
		}

		return result;
	}

	// 客户类型下拉框获取
	@SuppressWarnings("unchecked")
	public Map<Object, Object> COMDD0008() {

		return stringRedisTemplate.opsForHash().entries("user_role/user_style");

	}

	// 业务角色下拉框获取
	public Map<String, Object> COMDD0009() {

		UserRoleTypeExample userRoleTypeExample = new UserRoleTypeExample();
		userRoleTypeExample.createCriteria().andStatusEqualTo(
				UserConst.user_role_type_status_no);

		List<UserRoleType> datalist = userRoleTypeMapper
				.selectByExample(userRoleTypeExample);

		Map<String, Object> result = new HashMap<String, Object>();

		for (UserRoleType userRoleType : datalist) {
			result.put(userRoleType.getId().toString(),
					userRoleType.getUserRoleName());
		}

		return result;
	}

	@Autowired
	private CompanyRelationshipMapper companyRelationshipMapper;

	// 通过关联查询(专用，只能从借款方检索对应核心企业,id,3,1)
	// ------------------参数------------------
	// 客户ID userId
	// 业务角色 roleType 固定3
	// 业务角色 roleType2 固定1
	// ------------------返回------------------
	// 企业ID
	// 企业名称
	public Map<String, Object> SCF931007(Long userId, String roleType,
			String roleType2) {

		CompanyRelationshipExample companyRelationshipExample = new CompanyRelationshipExample();
		companyRelationshipExample.createCriteria()
				.andCompanyId2EqualTo(userId).andCompanyRole2EqualTo(roleType)
				.andCompanyRoleEqualTo(roleType2);

		List<CompanyRelationship> datalist = companyRelationshipMapper
				.selectByExample(companyRelationshipExample);

		Map<String, Object> result = new HashMap<String, Object>();

		// 从id翻译企业名称的字典
		Map<String, Object> dic = COMDD0031();

		for (CompanyRelationship companyRelationship : datalist) {
			result.put(
					StringUtil.toString((companyRelationship.getCompanyId())),
					dic.get(StringUtil.toString(companyRelationship
							.getCompanyId())));
		}

		return result;
	}

	// 通过关联查询(专用，通过关联查询(专用，只能从借款方和核心企业检索其他))
	// ------------------返回------------------
	// 企业ID
	// 企业名称
	public Map<String, Object> SCF931008(Long userId, String roleType,
			String roleType2) {

		CompanyRelationshipExample companyRelationshipExample = new CompanyRelationshipExample();
		companyRelationshipExample.createCriteria().andCompanyIdEqualTo(userId)
				.andCompanyRoleEqualTo(roleType)
				.andCompanyRole2EqualTo(roleType2);

		List<CompanyRelationship> datalist = companyRelationshipMapper
				.selectByExample(companyRelationshipExample);

		Map<String, Object> result = new HashMap<String, Object>();

		// 从id翻译企业名称的字典
		Map<String, Object> dic = COMDD0031();

		for (CompanyRelationship companyRelationship : datalist) {
			result.put(
					StringUtil.toString(companyRelationship.getCompanyId2()),
					dic.get(StringUtil.toString(companyRelationship
							.getCompanyId2())));
		}

		return result;
	}

	// 通过某资方检索所有相关方ID名称和业务角色
	public List<UserS0003Output> S0003(Long companyId) {

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("companyId", companyId);

		List<Map<String, Object>> datalist = userMappper
				.getRelationshipList2(params);

		Map<String, Object> dic = COMDD0031();
		Map<Object, Object> roleDic = stringRedisTemplate.opsForHash().entries(
				"user_info/user_role");

		List<UserS0003Output> result = new ArrayList<UserS0003Output>();

		for (Map<String, Object> data : datalist) {
			UserS0003Output output = new UserS0003Output();
			output.setId(LongUtil.toLong(data.get("id")));
			output.setName(f(dic.get(f(data.get("id")))));
			output.setRole(data.get("companyRole").toString());
			output.setRoleName(f(roleDic.get(f(data.get("companyRole")))));
			result.add(output);
		}

		return result;
	}

	// 个人证件类型获取
	@SuppressWarnings("unchecked")
	public Map<Object, Object> COMDD0010() {
		return stringRedisTemplate.opsForHash().entries(
				"user_info/credential_type");
	}

	// 最高学历下拉框获取
	@SuppressWarnings("unchecked")
	public Map<Object, Object> COMDD0013() {
		return stringRedisTemplate.opsForHash().entries(
				"user_info/educational_level");
	}

	// 婚姻类型获取
	@SuppressWarnings("unchecked")
	public Map<Object, Object> COMDD0014() {
		return stringRedisTemplate.opsForHash().entries(
				"user_info/marital_status");
	}

	// 三证合一获取
	@SuppressWarnings("unchecked")
	public Map<Object, Object> COMDD0015() {
		return stringRedisTemplate.opsForHash().entries(
				"company_info/three_examinations_to_one");
	}

	// 所属行业获取
	@SuppressWarnings("unchecked")
	public Map<Object, Object> COMDD0011() {
		return stringRedisTemplate.opsForHash().entries(
				"company_info/industry_which_belongs_to");
	}

	// 所属地区省
	@SuppressWarnings("unchecked")
	public Map<Object, Object> COMDD00121() {
		return stringRedisTemplate.opsForHash().entries("company_info/area_p");
	}

	// 所属地区市
	@SuppressWarnings("unchecked")
	public Map<Object, Object> COMDD00122() {
		return stringRedisTemplate.opsForHash().entries("company_info/area_c");
	}

	// 所属地区区
	@SuppressWarnings("unchecked")
	public Map<Object, Object> COMDD00123() {
		return stringRedisTemplate.opsForHash().entries("company_info/area_q");
	}

	private String f(Object obj) {
		return StringUtil.toString(obj);
	}
}