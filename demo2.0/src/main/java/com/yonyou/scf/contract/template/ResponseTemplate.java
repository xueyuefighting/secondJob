package com.yonyou.scf.contract.template;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.annotation.ManagedBean;

import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.yonyou.scf.contract.utilEntity.CommonPostListMContent;
import com.yonyou.scf.contract.utilEntity.CommonPostListSBs;
import com.yonyou.scf.contract.utilEntity.CommonPostListSIs;
import com.yonyou.scf.contract.utilEntity.CommonPostListSIso;
import com.yonyou.scf.contract.utilEntity.CommonPostListSOs;
import com.yonyou.scf.contract.utilEntity.IListTemplateHelper;
import com.yonyou.scf.contract.utilEntity.PostSi;
import com.yonyou.scf.contract.utilEntity.TitleAttribute;
import com.yonyou.scf.contract.utilEntity.TitleContent;
import com.yonyou.scf.contract.utilEntity.CommonPostListMContent.TitleEntity;
import com.yonyou.scf.tools.system.CodeException;

/**
 * 当前设置bean作用域为session，有以下几个考虑
 * （1）一次请求可以开很多session，每个session有自己的事物控制，也许有自己的业务逻辑，设置session的话 意味着提供返回多个列表级返回值。
 * （2）这样也保证了bean不被污染
 * （3）待完善。
 * 
 * @author wyx
 *
 */
@Service
@Scope("prototype")
public class ResponseTemplate implements IResponseTemplate{
	
	private boolean searchButton = true;//是否展示查询按钮 default:展示-true
	private boolean resetButton = true;//是否展示重置按钮 default:展示-true
	private List<CommonPostListSIs> searchInputC;//复杂的查询项
	private List<CommonPostListSIso> searchInputO;//优化的查询项
	private List<? extends PostSi> finallySearchInput;//最终构建成的查询项
	private String datatitle = "列表标题";//列表标题
	private String inputtitle = "查询标题";//查询标题
	private CommonPostListMContent data;//列表中的字段名及字段值
	private List<TitleAttribute> titleAttribute;
	private List<Map<Integer,Object>> titleContent;
	private boolean helper = false;//启用帮助类
	
	//查询按钮
	List<CommonPostListSBs> sbsList = new ArrayList<CommonPostListSBs>();
	
	@Override
	public List<CommonPostListSOs> create() throws CodeException {
		//添加整个页面的所有元素
		args.add(getCommonPostListSOs());
		
		return args;
	}
	
	/*
	 * 表单所有元素
	 * @return
	 */
	public CommonPostListSOs getCommonPostListSOs() throws CodeException {
		
		CommonPostListSOs sos = new CommonPostListSOs();
		
		//填充列表数据 主动调用
		getCommonPostListMContent();
		//查询项主动调用
		obtainsButton();
		
		sos.setInputtitle(inputtitle);
		
		//返回给前端的时候 两种对象都可以，complex Object '⊂' optimze Object 优先取conmplex对象 
		//如果是接前端请求的对象 只能用complex Object，不然...不然系统可能会报错（映射不到对象）。
		finallySearchInput = (StringUtils.isEmpty(finallySearchInput))?(StringUtils.isEmpty(searchInputC)?searchInputO:searchInputC):this.finallySearchInput;
		
		sos.setInput(finallySearchInput);//查询项
		
		sos.setButton(sbsList);//查询按钮
		
		sos.setData(data);//列表中的字段名及字段值
		
		sos.setDatatitle(datatitle);//列表标题
			
		return sos;
	}
	
	 public void getCommonPostListMContent() throws CodeException {
		 
		 
		 CommonPostListMContent commonPostListMContent = new CommonPostListMContent();
		 
		 TitleEntity titleEntity = commonPostListMContent.createTitleEntity();
		 
		 if(titleContent!=null && titleContent.size()>0 && titleAttribute.size()!=titleContent.get(0).size()) {
			 throw new CodeException("0001", "列表字段名列数与列表字段值列数不一样");
		 }
		 
		 titleEntity.setTitle(titleAttribute);
		 
		 titleEntity.setData(titleContent);
		 
		 commonPostListMContent.setArgs(Arrays.asList(titleEntity));
		 
		 this.data = commonPostListMContent;
	 }
	
	/*
	 *提供查询按钮 
	 *列表查询一般也就2个按钮 查询+重置（这里已经‘定死两个’）
	 *如果另有需要添加其他按钮，可自己放入sbsList
	 */
	public void obtainsButton() {
		
		CommonPostListSBs commonPostListSBs = null;
		
		if(searchButton) {
			commonPostListSBs = new CommonPostListSBs();
			commonPostListSBs.setTitle("查询");
			commonPostListSBs.setId("submit");
			commonPostListSBs.setReadonly(false);
			commonPostListSBs.setType("button");
			commonPostListSBs.setValue("查询");
			commonPostListSBs.setUrl("");
			sbsList.add(commonPostListSBs);
		}
		
		if(resetButton) {
			commonPostListSBs = new CommonPostListSBs();
			commonPostListSBs.setTitle("重置");
			commonPostListSBs.setId("submit");
			commonPostListSBs.setReadonly(false);
			commonPostListSBs.setType("reset");
			commonPostListSBs.setValue("重置");
			commonPostListSBs.setUrl("");
			sbsList.add(commonPostListSBs);
		}
	}

	//辅助方法
	public void setAbsListTemplateHelper(IListTemplateHelper absListTemplateHelper) {
		
		if(absListTemplateHelper==null) {
			this.helper = false;
		}else {
			this.helper = true;
			this.datatitle = absListTemplateHelper.getDatatitle();
			this.inputtitle = absListTemplateHelper.getInputtitle();
			this.finallySearchInput = absListTemplateHelper.getSearchInput();
			this.titleAttribute = absListTemplateHelper.getTitleAttribute();
			this.titleContent = absListTemplateHelper.getTitleContent();
		}
		
		
	}
	
	public boolean isSearchButton() {
		return searchButton;
	}

	public void setSearchButton(boolean searchButton) {
		this.searchButton = searchButton;
	}

	public boolean isResetButton() {
		return resetButton;
	}

	public void setResetButton(boolean resetButton) {
		this.resetButton = resetButton;
	}

	public List<CommonPostListSBs> getSbsList() {
		return sbsList;
	}

	public void setSbsList(List<CommonPostListSBs> sbsList) {
		this.sbsList = sbsList;
	}

	public List<CommonPostListSIs> getSearchInputC() {
		return searchInputC;
	}

	public void setSearchInputC(List<CommonPostListSIs> searchInputC) {
		this.searchInputC = searchInputC;
	}

	public List<CommonPostListSIso> getSearchInputO() {
		return searchInputO;
	}

	public void setSearchInputO(List<CommonPostListSIso> searchInputO) {
		this.searchInputO = searchInputO;
	}

	public String getDatatitle() {
		return datatitle;
	}

	public void setDatatitle(String datatitle) {
		this.datatitle = datatitle;
	}

	public String getInputtitle() {
		return inputtitle;
	}

	public void setInputtitle(String inputtitle) {
		this.inputtitle = inputtitle;
	}

	public List<TitleAttribute> getTitleAttribute() {
		return titleAttribute;
	}

	public void setTitleAttribute(List<TitleAttribute> titleAttribute) {
		this.titleAttribute = titleAttribute;
	}

	public List<Map<Integer,Object>> getTitleContent() {
		return titleContent;
	}

	public void setTitleContent(List<Map<Integer,Object>> titleContent) {
		this.titleContent = titleContent;
	}

}
