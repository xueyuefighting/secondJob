package com.yonyou.scf.userFace.service;

import java.io.IOException;
import java.io.OutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import com.yonyou.scf.common.constant.DefaultConst;
import com.yonyou.scf.common.constant.DigitalCertificateConst;
import com.yonyou.scf.common.constant.RoleConst;
import com.yonyou.scf.common.constant.UserConst;
import com.yonyou.scf.common.constant.UserFaceConstant;
import com.yonyou.scf.common.entity.Authority;
import com.yonyou.scf.common.entity.AuthorityExample;
import com.yonyou.scf.common.entity.DigitalCertificateExample;
import com.yonyou.scf.common.entity.Menu;
import com.yonyou.scf.common.entity.MenuExample;
import com.yonyou.scf.common.entity.Operator;
import com.yonyou.scf.common.entity.OperatorExample;
import com.yonyou.scf.common.gateway.entity.TokenBean;
import com.yonyou.scf.common.input.Statistic4FinancingAmountRequest;
import com.yonyou.scf.common.mapper.auto.AuthorityMapper;
import com.yonyou.scf.common.mapper.auto.DigitalCertificateMapper;
import com.yonyou.scf.common.mapper.auto.MenuMapper;
import com.yonyou.scf.common.mapper.auto.OperatorMapper;
import com.yonyou.scf.common.output.ResultBean;
import com.yonyou.scf.common.system.CodeException;
import com.yonyou.scf.common.util.LongUtil;
import com.yonyou.scf.common.util.StringUtil;
import com.yonyou.scf.common.util.Timer;
import com.yonyou.scf.common.util.TokenUtil;
import com.yonyou.scf.userFace.constant.Constant;
import com.yonyou.scf.userFace.mapper.RoleHMapper;
import com.yonyou.scf.userFace.mapper.UserHMapper;
import com.yonyou.scf.userFace.util.HttpRequestUtils;
import com.yonyou.scf.userFace.util.VerifyCodeUtils;
import com.yonyou.scf.userFace.utilEntity.LoginEntity;

@Service
public class MainService {

	@Autowired
	private RedisTemplate<Object, Object> redisTemplate;
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	@Autowired
	private OperatorMapper operatorMapper;
	@Autowired
	private RoleHMapper roleHMapper;
	@Autowired
	private UserHMapper userHMapper;
	@Autowired
	private AuthorityMapper authorityMapper;
	@Autowired
	private MenuMapper menuMapper;
	@Autowired
	private Statistic4FinancingAmountService statistic4FinancingAmountService;
	@Autowired
	private DigitalCertificateMapper digitalCertificateMapper;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	/*
	 * 生成验证码
	 * 
	 * @param width
	 * 
	 * @param height
	 * 
	 * @param outputStream
	 */
	public void genrateVerifyNo(int width, int height, String redisKey,
			OutputStream outputStream) {
		// 生成字符
		String verifyCode = VerifyCodeUtils.generateVerifyCode(4);

		try {

			VerifyCodeUtils
					.outputImage(width, height, outputStream, verifyCode);
			redisTemplate.opsForValue().set(redisKey, verifyCode);
			redisTemplate.expire(redisKey, UserFaceConstant.VERIFYCODE_TIMEOUT,
					UserFaceConstant.VERIFYCODE_UNIT);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/*
	 * 登录
	 * 
	 * @param loginEntity
	 * 
	 * @return
	 */
	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
	public String logIn(LoginEntity loginEntity, HttpServletRequest request) {

		// 没有请求体
		if (loginEntity == null) {
			return JSON.toJSONString(new ResultBean(Constant.CODE_1000,
					Constant.MSG_LOGIN_NULL));
		}

		String userName = loginEntity.getUserName();
		String pwds = loginEntity.getPassword();//密码明文
		String pwd = loginEntity.getMd5();
		String key = loginEntity.getKey();
		String roleId = loginEntity.getRoleId();
		String operatortype = loginEntity.getOperatorType();
		String verifyCode = loginEntity.getVerifyCode();
		
		Pattern p = Pattern.compile("\\s+");   
        Matcher m_u = p.matcher(userName);  //验证用户名 
        Matcher m_p = p.matcher(pwds);   //验证明文密码
		
        if(m_u.find() || m_p.find()) {
        		return JSON.toJSONString(new ResultBean(Constant.CODE_1000, Constant.MSG_LOGIN_SPACE));
        }
        
		// 验证码是否正确
		String verifyNo = (String) redisTemplate.opsForValue().get(key);

		// 失败则立即返回，遗留在redis中的无用验证码，以后可以通过redis 扫描长期不用的key 删除
		if (StringUtils.isEmpty(verifyNo)) {
			return JSON.toJSONString(new ResultBean(Constant.CODE_1000,
					Constant.MSG_VERIFY_ERROR));
		}

		if (!verifyNo.equalsIgnoreCase(verifyCode)) {
			return JSON.toJSONString(new ResultBean(Constant.CODE_1000,
					Constant.MSG_VERIFY_ERROR));
		}

		// 验证码存在-》验证码验证成功，继续往下操作并删除当前redis中的key
		redisTemplate.delete(key);
		
		List<Operator> listPhone =  null;
		List<Operator> listEmail =  null;
		//如果转long正常 证明是手机登陆，否则是邮箱
		try {
			Long un = Long.parseLong(userName);
			
			// 登录名为手机
			OperatorExample OperatorExample1 = new OperatorExample();
			OperatorExample1.createCriteria()
					.andPhoneEqualTo(un)
					.andOperatorStyleEqualTo(operatortype);
			listPhone = operatorMapper
					.selectByExample(OperatorExample1);
		} catch (java.lang.NumberFormatException e) {
			// 登录名为邮箱
			OperatorExample OperatorExample2 = new OperatorExample();
			OperatorExample2.createCriteria().andEmailEqualTo(userName)
					.andOperatorStyleEqualTo(operatortype);
			listEmail = operatorMapper
					.selectByExample(OperatorExample2);
			
		}
		
		// 用户名密码错误(用户名不存在)
		if ((listPhone == null || listPhone.size() < 1)
				&& (listEmail == null || listEmail.size() < 1)) {
			return JSON.toJSONString(new ResultBean(Constant.CODE_1000,
					Constant.MSG_ERROR_NAMEORPWD));
		}

		// 取操作人记录数据
		Operator currentOperator = null;
		if (listPhone == null || listPhone.size() < 1) {
			currentOperator = listEmail.get(0);
		} else {
			currentOperator = listPhone.get(0);
		}

		// 用户已锁定 拒绝登录
		if ("1".equals(currentOperator.getAuditingStatus())) {
			return JSON.toJSONString(new ResultBean(Constant.CODE_1001,
					Constant.MSG_1001));
		}
		// 用户已禁用
		if ("1".equals(currentOperator.getStatus())) {
			return JSON.toJSONString(new ResultBean(Constant.CODE_1003,
					Constant.CODE_1003));
		}

		// 如果密码错误，记录错误次数返回 或者 锁定
		if (!currentOperator.getPassword().equals(pwd)) {
			return errorLogin(currentOperator);
		}

		return rightLogin(loginEntity, currentOperator, request);
	}

	/*
	 * 回显角色列表
	 * 
	 * @param key
	 * 
	 * @param request
	 * 
	 * @return
	 */
	public String roleList(String key, HttpServletRequest request) {

		TokenBean tokenBean = TokenUtil.getBean(key, redisTemplate);

		if (StringUtils.isEmpty(tokenBean)) {
			return JSON.toJSONString(new ResultBean(
					Constant.CODE_ERROR_OUTOFTIME,
					Constant.MSG_ERROR_OUTOFTIME, Arrays.asList(null)));
		}
		return JSON.toJSONString(redisTemplate.opsForValue().get(key));
	}

	/*
	 * 选择角色后 真实登录
	 * 
	 * @param key
	 * 
	 * @param request
	 * 
	 * @return
	 */
	public String selectRole(JSONObject obj, HttpServletRequest request) {

		String key = obj.getString("key");
		String roleId = obj.getString("roleId");

		if (StringUtils.isEmpty(key) || StringUtils.isEmpty(roleId)) {
			return JSON.toJSONString(new ResultBean(Constant.CODE_1000,
					Constant.MSG_1000));
		}

		Map<Object, Object> map = redisTemplate.opsForHash().entries(key);

		if (map == null || map.size() < 1) {
			return JSON.toJSONString(new ResultBean(Constant.CODE_1000,
					Constant.MSG_ERROR_NOROLE));
		}

		LoginEntity loginEntity = (LoginEntity) map.get("entity");
		Operator operator = (Operator) map.get("operator");

		// 判断是否为有效的roleid 如果是有效的roleid 那么证明当前是选择角色阶段 非输入用户名密码阶段
		Map<String, String> rolesMap = (Map<String, String>) map.get("roles");

		if (rolesMap.containsKey(roleId)) {
			String roleName = rolesMap.get(roleId);
			loginEntity.setRoleId(roleId);
			loginEntity.setRoleName(roleName);
			return successLogin(loginEntity, operator, request);
		} else {
			return JSON.toJSONString(new ResultBean(Constant.CODE_1000,
					Constant.MSG_1000));
		}
	}

	/*
	 * 密码错误 记录错误次数返回 或者 锁定
	 * 
	 * @param currentOperator
	 * 
	 * @return
	 */
	@Transactional(rollbackFor = Exception.class, propagation = Propagation.MANDATORY, isolation = Isolation.REPEATABLE_READ)
	private String errorLogin(Operator currentOperator) {

		long lastTimes = currentOperator.getWrongTimes();
		long wrongTime = 4 - lastTimes;
		String msg = Constant.MSG_1002 + wrongTime + "次";
		if (wrongTime == 0) {// 锁定当前用户
			currentOperator.setAuditingStatus("1");
			msg = "用户已锁定";
		}

		currentOperator.setWrongTimes(lastTimes + 1);

		operatorMapper.updateByPrimaryKey(currentOperator);

		return JSON.toJSONString(new ResultBean(Constant.CODE_1002, msg));
	}

	/*
	 * “登录” 正确的用户名和密码后操作
	 * 
	 * @param operator
	 * 
	 * @return
	 */
	@Transactional(rollbackFor = Exception.class, propagation = Propagation.MANDATORY, isolation = Isolation.REPEATABLE_READ)
	private String rightLogin(LoginEntity loginEntity, Operator operator,
			HttpServletRequest request) {

		// 获取业务角色 借款方-出借方 等

		Map<String, Object> businessMap = S0002(operator.getOperatorId());

		if (businessMap == null || businessMap.size() < 1) {
			return JSON.toJSONString(new ResultBean(Constant.CODE_1000,
					Constant.MSG_ERROR_NOROLE));
		}

		loginEntity.setOrganizeRoleCnt(businessMap.size());
		// 如果是一个业务角色，直接创建真正交互的redis返回
		if (businessMap.size() == 1) {
			String businessRoleId = businessMap.entrySet().iterator().next()
					.getKey();
			String businessRoleName = businessMap.entrySet().iterator().next()
					.getValue().toString();
			loginEntity.setRoleId(businessRoleId);
			loginEntity.setRoleName(businessRoleName);
			return successLogin(loginEntity, operator, request);
		}
		// 如果是多个业务觉得，创建一个临时交互的redis并返回
		String key = VerifyCodeUtils.generateId();

		Map<String, Object> map = Maps.newHashMapWithExpectedSize(2);
		map.put("entity", loginEntity);
		map.put("operator", operator);
		map.put("roles", businessMap);

		redisTemplate.opsForHash().putAll(key, map);
		redisTemplate.expire(key, UserFaceConstant.TIMEOUT,
				UserFaceConstant.TIMEOUT_UNIT);

		ResultBean bean = new ResultBean();
		bean.setCode(Constant.CODE_2001);
		bean.setMessage(Constant.MSG_2001);
		bean.setDataListCnt(1);
		bean.setDataList(Arrays.asList(key));

		return JSON.toJSONString(bean);
	}

	public String getRoleKeys(JSONObject obj) {
		if (!obj.containsKey("key")
				|| StringUtils.isEmpty(obj.getString("key"))) {
			return JSON.toJSONString(new ResultBean(Constant.CODE_1000,
					Constant.MSG_1000));
		}

		String key = obj.getString("key");

		if (!redisTemplate.hasKey(key)) {
			return JSON
					.toJSONString(new ResultBean(Constant.CODE_ERROR_OUTOFTIME,
							Constant.MSG_ERROR_OUTOFTIME));
		}

		Map<String, Object> maps = (Map<String, Object>) redisTemplate
				.opsForHash().get(key, "roles");

		Map<String, Object> mapResult = new HashMap<>();

		mapResult.put("key", key);
		mapResult.put("roleKeys", maps.keySet());

		ResultBean bean = new ResultBean();
		bean.setCode(Constant.CODE_2000);
		bean.setMessage(Constant.MSG_2000);
		bean.setDataListCnt(1);
		bean.setDataList(Arrays.asList(JSON.toJSONString(mapResult)));

		return JSON.toJSONString(bean);
	}

	/*
	 * “切换角色”
	 * 
	 * @param operator
	 * 
	 * @return
	 */
	// @Transactional(rollbackFor=Exception.class,propagation=Propagation.MANDATORY,isolation=Isolation.REPEATABLE_READ)
	// private String changeRoleLogin(String key, HttpServletRequest request) {
	//
	// TokenBean tokenBean = TokenUtil.getBean(key, redisTemplate);
	//
	// if(StringUtils.isEmpty(tokenBean)) {
	// return JSON.toJSONString(new ResultBean(Constant.CODE_1000,"暂无角色"));
	// }
	//
	// //获取业务角色 借款方-出借方 等
	// Map<String,Object> businessMap =
	// S0002(Long.parseLong(tokenBean.getUserId()));
	//
	// if(businessMap==null || businessMap.size()<1) {
	// return JSON.toJSONString(new
	// ResultBean(Constant.CODE_1000,Constant.MSG_ERROR_NOROLE));
	// }
	//
	// LoginEntity loginEntity = new LoginEntity();
	//
	// loginEntity.set
	//
	// Operator operator =
	// operatorMapper.selectByPrimaryKey(Long.parseLong(bean.getUserId()));
	//
	// loginEntity.setOrganizeRoleCnt(businessMap.size());
	// //如果是一个业务角色，直接创建真正交互的redis返回
	// if(businessMap.size()==1) {
	// String businessRoleId =
	// businessMap.entrySet().iterator().next().getKey();
	// String businessRoleName =
	// businessMap.entrySet().iterator().next().getValue().toString();
	// loginEntity.setRoleId(businessRoleId);
	// loginEntity.setRoleName(businessRoleName);
	// return successLogin(loginEntity, operator, request);
	// }
	// //如果是多个业务觉得，创建一个临时交互的redis并返回
	// String key = VerifyCodeUtils.generateId();
	//
	// Map<String,Object> map = Maps.newHashMapWithExpectedSize(2);
	// map.put("entity", loginEntity);
	// map.put("operator", operator);
	// map.put("roles", businessMap);
	//
	// redisTemplate.opsForHash().putAll(key, map);
	// redisTemplate.expire(key, UserFaceConstant.TIMEOUT,
	// UserFaceConstant.TIMEOUT_UNIT);
	//
	// //取所有业务角色id
	// Set<String> roleKeys = businessMap.keySet();
	//
	// Map<String,Object> mapResult = new HashMap<>();
	//
	// mapResult.put("key", key);
	// mapResult.put("roleKeys", roleKeys);
	//
	// ResultBean bean = new ResultBean();
	// bean.setCode(Constant.CODE_2001);
	// bean.setMessage(Constant.MSG_2001);
	// bean.setDataListCnt(1);
	// bean.setDataList(Arrays.asList(JSON.toJSONString(mapResult)));
	//
	// return JSON.toJSONString(bean);
	// }
	//
	@Transactional(rollbackFor = Exception.class, propagation = Propagation.MANDATORY, isolation = Isolation.REPEATABLE_READ)
	private String successLogin(LoginEntity loginEntity, Operator operator,
			HttpServletRequest request) {

		// 构造交互token
		String key = "";
		try {
			key = createToken(loginEntity, operator, request);
		} catch (CodeException e) {
			e.printStackTrace();
			return JSON.toJSONString(new ResultBean(Constant.CODE_1000, e
					.getMessage()));
		}

		// 更新数据库中上次登录时间
		String currentTime = Timer.getDateTimeNow(Timer.Role2);
		operator.setLastLoginTime(currentTime);
		operator.setWrongTimes(new Long(0));
		operator.setIp(HttpRequestUtils.getIpAddr(request));
		int resultInt = operatorMapper.updateByPrimaryKey(operator);

		ResultBean bean = new ResultBean();
		bean.setCode(Constant.CODE_2005);
		bean.setMessage(Constant.MSG_2005);
		bean.setDataListCnt(1);
		bean.setDataList(Arrays.asList(key));
		return JSON.toJSONString(bean);
	}

	@Transactional(rollbackFor = Exception.class, propagation = Propagation.MANDATORY, isolation = Isolation.REPEATABLE_READ)
	private String createToken(LoginEntity loginEntity, Operator operator,
			HttpServletRequest request) throws CodeException {
		TokenBean token = new TokenBean();
		token.setBeforeLoginTime(operator.getLastLoginTime());
		token.setIp(operator.getIp());

		// 获取所属单位／企业
		Map<String, Object> companyInfo = S0004(operator.getOperatorId());

		if (companyInfo == null || companyInfo.size() < 1) {
			throw new CodeException("10001", "获取所属单位有误");
		}

		/** 杜瑞 20171020 统一数据接口 start */
		String companyId = StringUtil.toString(companyInfo.get(loginEntity
				.getRoleId()));
		token.setOrganizeId(companyId);
		token.setOrganizeName(StringUtil.toString(COMDD0031().get(companyId)));
		/** 杜瑞 20171020 统一数据接口 end */
		token.setOrganizeRoleName(loginEntity.getRoleName());
		token.setOrganizeRoleNo(loginEntity.getRoleId());
		token.setOrganizeRoleCnt(loginEntity.getOrganizeRoleCnt());
		token.setPlatformId(loginEntity.getPlatformId());
		token.setUserType(loginEntity.getOperatorType());
		// 获取在所属单位下 担任的所有角色 审批人等
		Map<String, String> rolesMap = S0003(operator.getOperatorId(),
				loginEntity.getRoleId());

		if (rolesMap == null || rolesMap.size() < 1) {
			throw new CodeException("10001", "获取在所属单位下 担任的角色有误");
		}

		ArrayList<String> appIds = S0010(operator.getOperatorId(),
				loginEntity.getRoleId());
		token.setAppId(appIds);

		token.setRoles(rolesMap);
		token.setRoleNo(new ArrayList<String>(rolesMap.keySet()));
		token.setConcaterPhone(String.valueOf(operator.getPhone()));
		token.setConcaterMail(operator.getEmail());
		token.setUserId(operator.getOperatorId().toString());
		token.setUserName(operator.getName());
		String key = VerifyCodeUtils.generateId();
		// 将token放入redis 并设置过期时间
		redisTemplate.opsForValue().set(key, JSON.toJSONString(token));
		redisTemplate.expire(key, UserFaceConstant.TIMEOUT,
				UserFaceConstant.TIMEOUT_UNIT);
		return key;
	}

	/*
	 * 登出系统
	 * 
	 * @param key
	 * 
	 * @param request
	 * 
	 * @return
	 */
	public String logOut(String key, HttpServletRequest request) {

		if (!StringUtils.isEmpty(key)) {
			redisTemplate.delete(key);
		}
		return JSON.toJSONString(new ResultBean(Constant.CODE_2000,
				Constant.MSG_2000));
	}

	public String judgeRolesCnt(String key) {

		TokenBean bean = TokenUtil.getBean(key, redisTemplate);
		if (StringUtils.isEmpty(bean)) {
			return JSON
					.toJSONString(new ResultBean(Constant.CODE_ERROR_OUTOFTIME,
							Constant.MSG_ERROR_OUTOFTIME));
		}

		return JSON.toJSONString(new ResultBean(Constant.CODE_ERROR_OUTOFTIME,
				Constant.MSG_ERROR_OUTOFTIME, Arrays.asList(bean
						.getOrganizeRoleCnt())));
	}

	// 用操作员ID和业务角色换可用的授权信息
	private ArrayList<String> S0010(Long operatorId, String userRole) {

		try {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("operatorId", operatorId);
			params.put("userRole", userRole);

			List<Map<String, Object>> dataList = roleHMapper
					.getRoleInfoListByOpIdAndUserRole(params);

			List<Long> result = dataList.stream()
					.map(x -> Long.valueOf(StringUtil.toString(x.get("id"))))
					.collect(Collectors.toList());

			AuthorityExample ae = new AuthorityExample();
			ae.createCriteria().andRoleIn(result)
					.andStatusEqualTo(RoleConst.authority_status_enable);
			List<Authority> menus = authorityMapper.selectByExample(ae);

			result = new ArrayList<Long>();

			for (Authority a : menus) {
				result.add(a.getMenuId());
			}

			MenuExample me = new MenuExample();
			me.createCriteria().andMenuIdIn(result);

			List<Menu> menuList = menuMapper.selectByExample(me);

			ArrayList<String> result2 = menuList.stream().map(x -> x.getLink())
					.collect(Collectors.toCollection(ArrayList::new));

			return result2;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	// 用操作员ID和业务角色换可用的角色
	private Map<String, String> S0003(Long operatorId, String userRole) {
		try {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("operatorId", operatorId);
			params.put("userRole", userRole);

			List<Map<String, Object>> dataList = roleHMapper
					.getRoleInfoListByOpIdAndUserRole(params);

			Map<String, String> result = new HashMap<String, String>();

			for (Map<String, Object> data : dataList) {
				result.put(data.get("id").toString(), data.get("name")
						.toString());
			}

			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	// 用操作员ID换可用的业务角色
	private Map<String, Object> S0002(Long operatorId) {
		try {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("operatorId", operatorId);

			List<Map<String, Object>> dataList = roleHMapper
					.getUserRoleInfoListByOpId(params);

			Map<String, Object> result = new HashMap<String, Object>();

			for (Map<String, Object> data : dataList) {

				result.put(
						data.get("userRole").toString(),
						getMap("user_info/user_role").get(
								data.get("userRole").toString()));
			}

			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 用操作员ID换企业信息
	private Map<String, Object> S0004(Long operatorId) {
		try {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("operatorId", operatorId);

			List<Map<String, Object>> dataList = roleHMapper
					.getUserRoleInfoListByOpId(params);

			Map<String, Object> result = new HashMap<String, Object>();

			for (Map<String, Object> data : dataList) {

				result.put(data.get("userRole").toString(), data.get("userId")
						.toString());
			}

			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	// 客户名称获取
	private Map<Object, Object> COMDD0031() {

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("user_style_company", UserConst.user_style_company);
		params.put("user_style_person", UserConst.user_style_person);

		List<Map<String, Object>> datalist = userHMapper
				.getUserNameList(params);

		Map<Object, Object> result = new HashMap<Object, Object>();

		for (Map<String, Object> data : datalist) {
			result.put(data.get("userId").toString(), data.get("userName"));
		}

		return result;
	}

	private Map<Object, Object> getMap(String table) {
		Map<Object, Object> kv = stringRedisTemplate.opsForHash()
				.entries(table);
		return kv;
	}

	public ResultBean personInfo(String key, HttpServletRequest request) {
		JSONObject obj = new JSONObject();
		try {
			TokenBean token = TokenUtil.getBean(key, redisTemplate);

			if (StringUtils.isEmpty(token)) {
				return null;
			}

			obj.put("lastLoginTime", formatLastTime(token.getBeforeLoginTime()));// 上次登录时间
			obj.put("belongName", token.getOrganizeName());
			obj.put("perOrEn", token.getUserType());
			obj.put("userName", token.getUserName());
			obj.put("isBindUkey", isBindUkey(token.getOrganizeId()));
		} catch (Exception e) {
			e.printStackTrace();
			obj.put("belongName", "无");
		}

		return new ResultBean(Constant.CODE_2000, Constant.MSG_2000, obj);
	}

	/*
	 * 判断当前登录人是否绑定ukey 0-没绑定 1-绑定
	 * 
	 * @return
	 */
	private String isBindUkey(String companyId) {
		try {
			// 用企业ID换证书状态
			logger.debug("用企业ID换证书状态 isBindUkey companyId=" + companyId);
			DigitalCertificateExample digitalCertificateExample = new DigitalCertificateExample();
			digitalCertificateExample
					.createCriteria()
					.andAuditingStatusEqualTo(
							DigitalCertificateConst.auditing_status_1)
					.andBindStatusEqualTo(DigitalCertificateConst.bind_status_1)
					.andUserIdEqualTo(LongUtil.toLong(companyId));

			digitalCertificateMapper.countByExample(digitalCertificateExample);

			if (digitalCertificateMapper
					.countByExample(digitalCertificateExample) > 0) {
				return "1";
			} else {
				return "0";
			}

		} catch (Exception e) {
			logger.error("用企业ID换证书状态失败isBindUkey companyId=" + companyId);
			return "0";
		}
	}

	/*
	 * 将时间字符串yyyyMMddHHmmss 转化为yyyy-MM-dd HH:mm格式的时间 如果转化过程报错 则返回当前时间
	 * 
	 * @param beforeLoginTime
	 * 
	 * @return
	 */
	private String formatLastTime(String beforeLoginTime) {
		if (StringUtils.isEmpty(beforeLoginTime)) {
			return "首次";
		}

		final String formatString = "yyyy-MM-dd HH:mm";
		String formatTime = "";
		try {
			DateTimeFormatter formatter = new DateTimeFormatterBuilder()
					.appendPattern("yyyyMMddHHmmss")
					.appendValue(ChronoField.MILLI_OF_SECOND, 3).toFormatter();
			LocalDateTime local = LocalDateTime.parse(beforeLoginTime,
					formatter);
			formatTime = local
					.format(DateTimeFormatter.ofPattern(formatString));
		} catch (Exception e) {
			e.printStackTrace();
			formatTime = LocalDateTime.now().format(
					DateTimeFormatter.ofPattern(formatString));
		}

		return formatTime;
	}

	public ResultBean getToken(String key, HttpServletRequest request) {
		try {
			TokenBean tb = TokenUtil.getBean(key, redisTemplate);

			if (StringUtils.isEmpty(tb)) {
				return new ResultBean(Constant.CODE_1000, Constant.MSG_1000);
			}
			return new ResultBean(Constant.CODE_2000, Constant.MSG_2000, tb);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultBean(Constant.CODE_1000, Constant.MSG_1000);
		}

	}

	/**
	 * 登录失败次数日终清零、锁定状态的日终解除
	 * 
	 * @return
	 */
	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
	public ResultBean resetLoginStatus() {
		ResultBean rb = new ResultBean();

		OperatorExample OperatorExample = new OperatorExample();
		OperatorExample.createCriteria().andWrongTimesGreaterThan(0L);

		List<Operator> operatorList = operatorMapper
				.selectByExample(OperatorExample);
		System.out.println("登录锁定用户数:" + operatorList.size());

		Operator operatorRecord = new Operator();
		operatorRecord.setWrongTimes(0L);
		operatorRecord.setAuditingStatus("0");// 非锁定
		operatorRecord.setUpdateTime(Timer.getDateTimeFormat());
		operatorRecord.setUpdateUser(8700L);// TODO,8700-BatchJobs

		// TODO：测试
		int cnt = operatorMapper.updateByExampleSelective(operatorRecord,
				OperatorExample);
		System.out.println("实际解锁用户数:" + cnt);

		if (cnt != operatorList.size()) {
			System.out.println("登录锁定部分解除失败");
			rb.setCode(DefaultConst.ERR_2002_CODE);
			rb.setMessage(DefaultConst.ERR_2002_MSG);
		} else {
			System.out.println("登录锁定全部解除成功");
			rb.setCode(DefaultConst.SUCCESS_RESPONSE_CODE);
			rb.setMessage(DefaultConst.SUCCESS_RESPONSE_MESSAGE);
			rb.setDataListCnt(cnt);
		}
		return rb;
	}

	public ResultBean indexUserInfo(JSONObject obj) throws Exception {

		System.out.println("请求参数：obj：" + obj);

		System.out.println("!obj.containsKey(token):"
				+ !obj.containsKey("token"));
		System.out.println("StringUtils.isEmpty(obj.get(token)):"
				+ StringUtils.isEmpty(obj.get("token")));

		if (!obj.containsKey("token") || StringUtils.isEmpty(obj.get("token"))) {
			throw new Exception(Constant.MSG_ERROR_OUTOFTIME);
		}

		String token = obj.getString("token");
		System.out.println("token值为:" + token);
		TokenBean tokenBean = TokenUtil.getBean(token, redisTemplate);
		System.out.println("tokenBean值为:" + tokenBean);

		if (StringUtils.isEmpty(tokenBean)) {
			throw new Exception(Constant.MSG_ERROR_OUTOFTIME);
		}

		Statistic4FinancingAmountRequest request = new Statistic4FinancingAmountRequest();
		request.setOrganizeId(tokenBean.getOrganizeId());
		request.setOrganizeRoleNo(tokenBean.getOrganizeRoleNo());
		request.setUserType(tokenBean.getUserType());

		ResultBean resultBean = statistic4FinancingAmountService.Job01(request);

		if (Constant.CODE_2000.equals(resultBean.getCode())) {
			String result = resultBean.getDataList().get(0);
			JSONObject resultObj = new JSONObject();
			resultObj.put("role", tokenBean.getOrganizeRoleNo());
			resultObj.put("info", result);
			return new ResultBean(Constant.CODE_2000, Constant.MSG_2000,
					resultObj);
		}

		return new ResultBean(Constant.CODE_1000, Constant.MSG_1000);
	}
}
