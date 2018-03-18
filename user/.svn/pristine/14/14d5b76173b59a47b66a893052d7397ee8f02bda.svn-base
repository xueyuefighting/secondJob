//package com.yonyou.scf.user.controller;
//
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiParam;
//
//import java.util.Date;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import javax.annotation.Resource;
//
//import org.apache.catalina.mbeans.RoleMBean;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.yonyou.scf.common.constant.RoleConst;
//import com.yonyou.scf.common.constant.UserConst;
//import com.yonyou.scf.common.entity.CompanyInfo;
//import com.yonyou.scf.common.entity.CompanyInfoExample;
//import com.yonyou.scf.common.entity.Role;
//import com.yonyou.scf.common.entity.RoleExample;
//import com.yonyou.scf.common.entity.SysParam;
//import com.yonyou.scf.common.entity.SysParamExample;
//import com.yonyou.scf.common.mapper.auto.CompanyInfoMapper;
//import com.yonyou.scf.common.mapper.auto.RoleMapper;
//import com.yonyou.scf.common.mapper.auto.SysParamMapper;
//import com.yonyou.scf.common.util.StringUtil;
//import com.yonyou.scf.user.service.ParamService;
//
//@RestController
//@RequestMapping("/PARA")
//@Api(value = "PARAM API接口", description = "v1.0 测试用")
//@CrossOrigin
//public class ParamController {
//
//	// final String ENABLE = "01";
//	@Resource
//	private StringRedisTemplate stringRedisTemplate;
//
//	@Autowired
//	private ParamService paramService;
//
//	@ApiOperation(value = "根据表名和字段名取得枚举值列表", notes = "v1.0 测试用")
//	@RequestMapping(value = "/0001", method = RequestMethod.POST)
//	public Map<Object, Object> getMap(
//			@ApiParam("表名") @RequestParam(value = "table", required = true, defaultValue = "user_info") String table,
//			@ApiParam("列名") @RequestParam(value = "column", required = true, defaultValue = "user_type") String column) {
//
//		return paramService.getMap(table + "/" + column);
//	}
//
//	@ApiOperation(value = "根据表名取ID和NAME映射关系", notes = "v1.0 测试用")
//	@RequestMapping(value = "/0002", method = RequestMethod.POST)
//	public Map<Object, Object> trans(
//			@ApiParam("表名") @RequestParam(value = "table", required = true, defaultValue = "user_info") String table) {
//
//		return paramService.getMap(table);
//	}
//
//	@ApiOperation(value = "初始化系统参数表中数据到REDIS", notes = "v1.0 测试用")
//	@RequestMapping(value = "/0000", method = RequestMethod.POST)
//	public String initAll() {
//		return paramService.initAll();
//	}
//	// @ApiOperation(value = "根据token取登陆信息", notes = "v1.0 测试用")
//	// @RequestMapping(value = "/0003", method = RequestMethod.POST)
//	// public Map<String, String> loginIofo(
//	// @ApiParam("令牌") @RequestParam(value = "token", required = true,
//	// defaultValue = "") String token) {
//	//
//	// return paramService.getMap(token);
//	// }
//
//	// @ApiOperation(value = "初始化测试数据", notes = "v1.0 测试用")
//	// @RequestMapping(value = "/PARAM/init", method = RequestMethod.POST)
//	// public String init(
//	// @ApiParam("dummy") @RequestParam(value = "abc", required = false,
//	// defaultValue = "只是示例") String dummy) {
//	//
//	// Map<String, String> kv = new HashMap<String, String>();
//	//
//	// kv.put("10", "个人");
//	// kv.put("20", "企业");
//	//
//	// stringRedisTemplate.opsForHash().putAll("user_info/user_type", kv);
//	//
//	// return "Success";
//	// }
//	//
//	// @ApiOperation(value = "清空测试数据", notes = "v1.0 测试用")
//	// @RequestMapping(value = "/PARAM/deleteAll", method = RequestMethod.POST)
//	// public String deleteAll(
//	// @ApiParam("dummy") @RequestParam(value = "bcd", required = false,
//	// defaultValue = "只是示例") String dummy) {
//	//
//	// stringRedisTemplate.delete("user_info/user_type");
//	//
//	// return "Success";
//	// }
//
//	// @RequestBody
//}