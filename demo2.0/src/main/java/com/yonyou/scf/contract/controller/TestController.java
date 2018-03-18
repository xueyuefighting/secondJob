package com.yonyou.scf.contract.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yonyou.scf.contract.service.TestService;
import com.yonyou.scf.contract.utilEntity.CommonListRq;
import com.yonyou.scf.contract.utilEntity.CommonPostList;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "前后端分离链条测试接口",description = "v2.0 测试用")
@RequestMapping("/template")
@CrossOrigin//springmvc 跨域控制
public class TestController {
	@Autowired
	private TestService testService;
	
	@ApiOperation(value="获取列表",notes="V2.0测试用")
	@RequestMapping(value = "/obtainsList", method = RequestMethod.POST)
	public CommonPostList obtainsList(){//@RequestBody CommonListRq commonListRq
		return testService.obtainsList();
	}
}
