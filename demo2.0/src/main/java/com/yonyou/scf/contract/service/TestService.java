package com.yonyou.scf.contract.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yonyou.scf.common.schema1.domain.PlatformInfo;
import com.yonyou.scf.common.schema1.domain.PlatformInfoExample;
import com.yonyou.scf.common.schema1.mapper.PlatformInfoMapper;
import com.yonyou.scf.contract.template.ResponseTemplate;
import com.yonyou.scf.contract.template.TemplateFactory;
import com.yonyou.scf.contract.utilEntity.CommonPostList;
import com.yonyou.scf.contract.utilEntity.CommonPostListSIs;
import com.yonyou.scf.contract.utilEntity.CommonPostListSOs;
import com.yonyou.scf.contract.utilEntity.IListTemplateHelper;
import com.yonyou.scf.contract.utilEntity.PostSi;
import com.yonyou.scf.contract.utilEntity.TitleAttribute;
import com.yonyou.scf.tools.system.CodeException;

@Service
public class TestService {
	
	@Autowired
	private PlatformInfoMapper platformInfoMapper;
//	@Autowired
//	private  ResponseTemplate responseTemplate;
	
	
	public CommonPostList obtainsList() {//CommonListRq commonListRq
		
		ResponseTemplate responseTemplate = TemplateFactory.buildResponseTemplate();
		
		CommonPostList common = new CommonPostList();
	 try {
		responseTemplate.setAbsListTemplateHelper(new IListTemplateHelper() {
			
			@Override
			public List<Map<Integer,Object>> getTitleContent() {
//				List<TitleContent> listValue = new ArrayList<TitleContent>();
				List<Map<Integer,Object>> listValue = new ArrayList<>();
				Map<Integer,Object> map = null;
				//获取列表数据
				List<PlatformInfo> platformInfoList = platformInfoMapper.selectByExample(new PlatformInfoExample());
				
				for (PlatformInfo platformInfo : platformInfoList) {
					map = new HashMap<Integer,Object>();
					map.put(0, platformInfo.getPlatformName());
					map.put(1, platformInfo.getContact());
					map.put(2, platformInfo.getInformUrl());
					
					List<Map<String, String>> li = new ArrayList<>();
					Map<String, String> map_l = new HashMap<String, String>();
					map_l.put("name", "查询");
					map_l.put("href", "www.baidu.com");
					li.add(map_l);
					map_l.put("name", "修改");
					map_l.put("href", "www.baidu.com");
					li.add(map_l);
					map.put(3, li);
					listValue.add(map);
					
//					value = new TitleContent();
//					value.setIndex(0);
//					value.setValue(platformInfo.getPlatformName());
//					value.setIndex(1);
//					value.setValue(platformInfo.getContact());
//					value.setIndex(2);
//					value.setValue(platformInfo.getInformUrl());
//					value.setIndex(3);
//					value.setValue(map.toString());
//					listValue.add(value);
				}
				
				return listValue;
			}
			
			@Override
			public List<TitleAttribute> getTitleAttribute() {
				List<TitleAttribute> listName = new ArrayList<TitleAttribute>();
				
				TitleAttribute name = new TitleAttribute();
				name.setColumn("渠道名称");
				name.setType("");
				name.setWidth("10");
				listName.add(name);
				
				name = new TitleAttribute();
				name.setColumn("联系人");
				name.setType("");
				name.setWidth("10");
				listName.add(name);
				
				name = new TitleAttribute();
				name.setColumn("通知url");
				name.setType("");
				name.setWidth("10");
				listName.add(name);
				
				name = new TitleAttribute();
				name.setColumn("操作");
				name.setType("");
				name.setWidth("70");
				listName.add(name);
				
				return listName;
			}
			
			@Override
			public List<? extends PostSi> getSearchInput() {
				List<CommonPostListSIs> sisList = new ArrayList<CommonPostListSIs>();
				CommonPostListSIs commonPostListSIso = new CommonPostListSIs();
				commonPostListSIso.setId("platformName");
				commonPostListSIso.setTitle("渠道名称");
				commonPostListSIso.setType("text");
				sisList.add(commonPostListSIso);
				
				commonPostListSIso = new CommonPostListSIs();
				commonPostListSIso.setId("contact");
				commonPostListSIso.setTitle("联系人");
				commonPostListSIso.setType("text");
				sisList.add(commonPostListSIso);
				return sisList;
			}
			
			@Override
			public String getInputtitle() {
				return "渠道信息查询";
			}
			
			@Override
			public String getDatatitle() {
				return "渠道信息展示";
			}
		});
		
			List<CommonPostListSOs> list = responseTemplate.create();
			
			common.setCode("200");
			common.setMsg("请求成功");
			common.setData(list);
		} catch (CodeException e) {
			common.setCode("001");
			common.setMsg("请求失败");
			e.printStackTrace();
		}
		
		return common;
	}
	

}
