package com.yonyou.scf.user.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yonyou.scf.common.constant.RoleConst;
import com.yonyou.scf.common.entity.CompanyInfo;
import com.yonyou.scf.common.entity.CompanyInfoExample;
import com.yonyou.scf.common.entity.Operator;
import com.yonyou.scf.common.entity.OperatorExample;
import com.yonyou.scf.common.entity.Role;
import com.yonyou.scf.common.entity.RoleExample;
import com.yonyou.scf.common.entity.SysParam;
import com.yonyou.scf.common.entity.SysParamExample;
import com.yonyou.scf.common.mapper.auto.CompanyInfoMapper;
import com.yonyou.scf.common.mapper.auto.OperatorMapper;
import com.yonyou.scf.common.mapper.auto.RoleMapper;
import com.yonyou.scf.common.mapper.auto.SysParamMapper;
import com.yonyou.scf.common.util.StringUtil;

@Transactional
@Service
public class ParamService {

	@Resource
	private StringRedisTemplate stringRedisTemplate;

	@Resource
	private SysParamMapper sysParamMapper;

	@Resource
	private CompanyInfoMapper companyInfoMapper;

	@Resource
	private OperatorMapper operatorMapper;

	@Resource
	private RoleMapper roleMapper;

	public Map<Object, Object> getMap(String table) {

		Map<Object, Object> kv = stringRedisTemplate.opsForHash()
				.entries(table);

		return kv;
	}

	public String initAll() {
		// 系统参数表
		SysParamExample spe = new SysParamExample();
		spe.createCriteria().andStatusIsNotNull();
		spe.setOrderByClause(" table_name , column_name ");
		List<SysParam> spList = sysParamMapper.selectByExample(spe);
		// Map<String, String> kv = new HashMap<String, String>();

		// 所有企业名称（不包括个人）
		CompanyInfoExample cie = new CompanyInfoExample();
		cie.createCriteria().andEnableStatusIsNotNull();
		List<CompanyInfo> comList = companyInfoMapper.selectByExample(cie);

		// 所有角色名称
		RoleExample re = new RoleExample();
		re.createCriteria().andStatusEqualTo(RoleConst.role_status_enable);
		List<Role> roleList = roleMapper.selectByExample(re);

		// 所有操作员名字
		OperatorExample oe = new OperatorExample();
		oe.createCriteria().andStatusEqualTo(RoleConst.operator_status_enable);
		List<Operator> operatorList = operatorMapper.selectByExample(oe);

		System.out.println("sys info load start-------------"
				+ new Date().toLocaleString());

		// 系统参数表加载
		// 删除REDIS中所有key
		// TODO 启动时会删除所有数据，在上真实测试库时再放开
		stringRedisTemplate.delete(stringRedisTemplate.keys("*"));

		for (SysParam sp : spList) {
			stringRedisTemplate.opsForHash().put(
					sp.getTableName() + "/" + sp.getColumnName(),
					sp.getKeyName(), sp.getVal());
		}
		// 所有企业名称加载（不包括个人）
		for (CompanyInfo ci : comList) {
			stringRedisTemplate.opsForHash().put("company_info",
					StringUtil.toString(ci.getUserId()), ci.getCompanyName());
		}

		// 所有角色名称加载
		for (Role ro : roleList) {
			stringRedisTemplate.opsForHash().put("role",
					StringUtil.toString(ro.getId()), ro.getName());
		}

		// 所有操作员名称加载
		for (Operator op : operatorList) {
			stringRedisTemplate.opsForHash().put("operator",
					StringUtil.toString(op.getOperatorId()), op.getName());
		}

		System.out.println("sys info load start-------------"
				+ new Date().toLocaleString());
		return "SUCCESS";
	}
}
