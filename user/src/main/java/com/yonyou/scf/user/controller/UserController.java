package com.yonyou.scf.user.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yonyou.scf.common.input.SCF91TokenBean;
import com.yonyou.scf.common.input.SCF921002Input;
import com.yonyou.scf.common.input.SCF922004Input;
import com.yonyou.scf.common.input.SCF923002Input;
import com.yonyou.scf.common.input.SCF931002Input;
import com.yonyou.scf.common.input.SCF931004Input;
import com.yonyou.scf.common.input.SCF931005Input;
import com.yonyou.scf.common.output.ResultBean;
import com.yonyou.scf.common.output.SCF91CompanyInfo;
import com.yonyou.scf.common.output.SCF91CompanyInfoIDName;
import com.yonyou.scf.common.output.SCF91CredentialInfo;
import com.yonyou.scf.common.output.UserS0003Output;
import com.yonyou.scf.common.util.StringUtil;
import com.yonyou.scf.user.service.CommonService;
import com.yonyou.scf.user.service.UserService;

@RestController
// @RequestMapping("/user")
@Api(value = "各类API接口", description = "v1.0 测试用")
@CrossOrigin
public class UserController {

	@Resource
	private UserService userService;

	@Resource
	private CommonService commonService;

	/** 客户档案部分 start ***********************************************/
	@ApiOperation(value = "ID换企业名称", notes = "v1.0 测试用")
	@RequestMapping(value = "/0001/{userId}", method = RequestMethod.POST)
	public String S0001(@ApiParam("userId") @PathVariable Long userId) {
		return commonService.COMDD0031().containsKey(f(userId)) ? f(commonService
				.COMDD0031().get(f(userId))) : "";
	}

	@ApiOperation(value = "返回ID和企业名称", notes = "v1.0 测试用")
	@RequestMapping(value = "/0002", method = RequestMethod.POST)
	public Map<String, Object> S0001() {
		return commonService.COMDD0031();
	}

	@ApiOperation(value = "返回企业名称和ID", notes = "v1.0 测试用")
	@RequestMapping(value = "/nameAndIds", method = RequestMethod.POST)
	public Map<String, Object> nameAndIds() {
		return commonService.COMDD0031R();
	}

	@ApiOperation(value = "通过业务角色查询公司名称", notes = "v1.0 测试用")
	@RequestMapping(value = "/0005/{roleType}", method = RequestMethod.POST)
	public List<SCF91CompanyInfoIDName> S0005(
			@ApiParam("业务角色") @PathVariable String roleType) {

		List<SCF91CompanyInfoIDName> temp = new ArrayList<SCF91CompanyInfoIDName>();

		Map<String, Object> data = commonService.GetCOMNameByRole(roleType);

		for (Object key : data.keySet()) {
			SCF91CompanyInfoIDName out = new SCF91CompanyInfoIDName();
			out.setId(Long.valueOf(StringUtil.toString(key)));
			out.setName(StringUtil.toString(data.get(key)));
			temp.add(out);
		}

		return temp;
	}

	@ApiOperation(value = "返回ID和企业名称List", notes = "v1.0 测试用")
	@RequestMapping(value = "/COMDD0031", method = RequestMethod.POST)
	public List<SCF91CompanyInfo> COMDD0031() {
		List<SCF91CompanyInfo> temp = new ArrayList<SCF91CompanyInfo>();

		Map<String, Object> data = commonService.COMDD0031();

		for (Object key : data.keySet()) {
			SCF91CompanyInfo out = new SCF91CompanyInfo();
			out.setCompanyId(Long.valueOf(StringUtil.toString(key)));
			out.setCompanyName(StringUtil.toString(data.get(key)));
			temp.add(out);
		}

		return temp;
	}

	@ApiOperation(value = "返回ID和证件号码List", notes = "v1.0 测试用")
	@RequestMapping(value = "/COMDD0032", method = RequestMethod.POST)
	public List<SCF91CredentialInfo> COMDD0032() {
		List<SCF91CredentialInfo> temp = new ArrayList<SCF91CredentialInfo>();

		Map<String, Object> data = commonService.COMDD0032();

		for (Object key : data.keySet()) {
			SCF91CredentialInfo out = new SCF91CredentialInfo();
			out.setUserId(Long.valueOf(StringUtil.toString(key)));
			out.setCredentialNum(StringUtil.toString(data.get(key)));
			temp.add(out);
		}

		return temp;
	}

	@ApiOperation(value = "返回行业ID和NAME List", notes = "v1.0 测试用")
	@RequestMapping(value = "/COMDD0011", method = RequestMethod.POST)
	public List<SCF91CredentialInfo> COMDD0011() {
		List<SCF91CredentialInfo> temp = new ArrayList<SCF91CredentialInfo>();

		Map<Object, Object> data = commonService.COMDD0011();

		for (Object key : data.keySet()) {
			SCF91CredentialInfo out = new SCF91CredentialInfo();
			out.setUserId(Long.valueOf(StringUtil.toString(key)));
			out.setCredentialNum(StringUtil.toString(data.get(key)));
			temp.add(out);
		}

		return temp;
	}

	@ApiOperation(value = "通过某资方检索所有相关方ID名称和业务角色", notes = "v1.0 测试用")
	@RequestMapping(value = "/0003/{companyId}", method = RequestMethod.POST)
	public List<UserS0003Output> S0003(
			@ApiParam("资方Id") @PathVariable Long companyId) {
		return commonService.S0003(companyId);
	}

	@ApiOperation(value = "返回ID和证件号码", notes = "v1.0 测试用")
	@RequestMapping(value = "/0004", method = RequestMethod.POST)
	public Map<String, Object> S0004() {
		return commonService.COMDD0032();
	}

	@ApiOperation(value = "客户档案初始化页面", notes = "v1.0 测试用")
	@RequestMapping(value = "/SCF921001", method = RequestMethod.POST)
	public Map<String, Map<String, Object>> SCF921001() {
		return userService.SCF921001();
	}

	@ApiOperation(value = "客户档案查询", notes = "v1.0 测试用")
	@RequestMapping(value = "/SCF921002", method = RequestMethod.POST)
	public ResultBean SCF921002(
			@ApiParam("SCF921002输入报文/JSON/BODY") @RequestBody @Valid SCF921002Input input,
			BindingResult result) {
		if (result.hasErrors()) {
			return new ResultBean(result);
		}
		return userService.SCF921002(input);
	}

	@ApiOperation(value = "通过关联查询(专用，只能从借款方检索对应核心企业,id,3,1)", notes = "v1.0 测试用")
	@RequestMapping(value = "/SCF921002/{userId}/{roleType}/{roleType2}", method = RequestMethod.POST)
	public Map<String, Object> SCF931007(
			@ApiParam("借款方ID") @PathVariable Long userId,
			@ApiParam("借款方标识=3") @PathVariable String roleType,
			@ApiParam("核心企业标识=1") @PathVariable String roleType2) {
		return commonService.SCF931007(userId, roleType, roleType2);
	}

	@ApiOperation(value = "通过关联查询(专用，只能从借款方和核心企业检索其他)", notes = "v1.0 测试用")
	@RequestMapping(value = "/SCF921003/{userId}/{roleType}/{roleType2}", method = RequestMethod.POST)
	public Map<String, Object> SCF931008(
			@ApiParam("中心方ID") @PathVariable Long userId,
			@ApiParam("中心方标识=3") @PathVariable String roleType,
			@ApiParam("对象标识=1") @PathVariable String roleType2) {
		return commonService.SCF931008(userId, roleType, roleType2);
	}

	@ApiOperation(value = "个人信息启用", notes = "v1.0 测试用")
	@RequestMapping(value = "/SCF922001/{id}", method = RequestMethod.POST)
	public ResultBean SCF922001(
			@ApiParam("个人ID") @PathVariable Long id,
			@ApiParam("tokenBean/JSON/BODY") @RequestBody SCF91TokenBean input) {
		return userService.SCF922001(id, input);
	}

	@ApiOperation(value = "个人信息禁用", notes = "v1.0 测试用")
	@RequestMapping(value = "/SCF922002/{id}", method = RequestMethod.POST)
	public ResultBean SCF922002(
			@ApiParam("个人ID") @PathVariable Long id,
			@ApiParam("tokenBean/JSON/BODY") @RequestBody SCF91TokenBean input) {
		return userService.SCF922002(id, input);
	}

	@ApiOperation(value = "个人信息详情,新增和修改", notes = "v1.0 测试用")
	@RequestMapping(value = "/SCF922003/{id}", method = RequestMethod.POST)
	public Map<String, Map<String, Object>> SCF922003(
			@ApiParam("个人ID") @PathVariable Long id) {
		return userService.SCF922003(id);
	}

	@ApiOperation(value = "个人新增修改提交", notes = "v1.0 测试用")
	@RequestMapping(value = "/SCF922004", method = RequestMethod.POST)
	public ResultBean SCF922004(
			@ApiParam("SCF922004输入报文/JSON/BODY") @RequestBody @Valid SCF922004Input input,
			BindingResult result) {
		if (result.hasErrors()) {
			return new ResultBean(result);
		}
		return userService.SCF922004(input);
	}

	@ApiOperation(value = "企业信息详情,新增和修改", notes = "v1.0 测试用")
	@RequestMapping(value = "/SCF923001/{id}", method = RequestMethod.POST)
	public Map<String, Map<String, Object>> SCF923001(
			@ApiParam("个人ID") @PathVariable Long id) {
		return userService.SCF923001(id);
	}

	@ApiOperation(value = "企业新增修改提交", notes = "v1.0 测试用")
	@RequestMapping(value = "/SCF923002", method = RequestMethod.POST)
	public ResultBean SCF923002(
			@ApiParam("SCF923002输入报文/JSON/BODY") @RequestBody @Valid SCF923002Input input,
			BindingResult result) {
		if (result.hasErrors()) {
			return new ResultBean(result);
		}
		return userService.SCF923002(input);
	}

	/** 客户档案部分 end *************************************************/

	/** 客户关系维护部分 start *********************************************/
	@ApiOperation(value = "客户关系维护初始化页面", notes = "v1.0 测试用")
	@RequestMapping(value = "/SCF931001", method = RequestMethod.POST)
	public Map<String, Map<String, Object>> SCF931001() {
		return userService.SCF921001();
	}

	@ApiOperation(value = "客户关系信息查询", notes = "v1.0 测试用")
	@RequestMapping(value = "/SCF931002", method = RequestMethod.POST)
	public ResultBean SCF931002(
			@ApiParam("SCF931002输入报文/JSON/BODY") @RequestBody @Valid SCF931002Input input,
			BindingResult result) {
		if (result.hasErrors()) {
			return new ResultBean(result);
		}
		return userService.SCF931002(input);
	}

	@ApiOperation(value = "已关联方检索", notes = "v1.0 测试用")
	@RequestMapping(value = "/SCF931003/{userId}/{roleType}", method = RequestMethod.POST)
	public ResultBean SCF931003(@ApiParam("客户ID") @PathVariable Long userId,
			@ApiParam("客户ID") @PathVariable String roleType) {
		return userService.SCF931003(userId, roleType);
	}

	@ApiOperation(value = "可关联借款方检索", notes = "v1.0 测试用")
	@RequestMapping(value = "/SCF931004/{companyId}/{userRole}", method = RequestMethod.POST)
	public ResultBean SCF931004(
			@ApiParam("companyId") @PathVariable Long companyId,
			@ApiParam("业务角色") @PathVariable String userRole,
			@RequestBody SCF931004Input input) {
		return userService.SCF931004(companyId, input, userRole);
	}

	@ApiOperation(value = "关联", notes = "v1.0 测试用")
	@RequestMapping(value = "/SCF931005", method = RequestMethod.POST)
	public ResultBean SCF931005(
			@ApiParam("SCF931005输入报文/JSON/BODY") @RequestBody @Valid SCF931005Input input,
			BindingResult result) {
		if (result.hasErrors()) {
			return new ResultBean(result);
		}
		return userService.SCF931005(input);
	}

	/** 客户关系维护部分 end ***********************************************/

	private String f(Object obj) {
		return StringUtil.toString(obj);
	}

}