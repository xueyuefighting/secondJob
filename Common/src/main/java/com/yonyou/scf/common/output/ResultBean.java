package com.yonyou.scf.common.output;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import com.yonyou.scf.common.constant.DefaultConst;
import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 定义响应API接口的有效业务格式Bean，根据Json串解析。 嵌套关系如下：TxResponse --> ResultBean --> API
 * Response
 * 
 * <pre>
 * Modify Information:
 * Author       Date        Description
 * ============ =========== ============================
 * shengsu      2017-03-16  Create this file
 * shengsu		2017-06-22  修改构造方法
 * shengsu		2017-09-06  增加构造方法
 * shengsu	    2017-11-02  增加属性Object obj
 * </pre>
 * 
 */
public class ResultBean {

	private static final long serialVersionUID = -8659512506680957154L;

	/**
	 * 返回值
	 */
	private String code = DefaultConst.SUCCESS_RESPONSE_CODE;
	/**
	 * 返回消息
	 */
	private String message = DefaultConst.SUCCESS_RESPONSE_MESSAGE;
	/**
	 * 数据列表
	 */
	private List<String> dataList;
	/**
	 * 数据列表条目数
	 */
	private int dataListCnt = 0;
	/**
	 * 自定义类型字段
	 */
	private Map<String, ?> obj = new HashMap();

	public Map<String, ?> getObj() {
		return obj;
	}

	public void setObj(Map<String, ?> obj) {
		this.obj = obj;
	}

	/**
	 * 根据Jsong格式的String对象，初始化ResultBean对象。
	 * 
	 * @param jsonStr
	 */
	public ResultBean(String jsonStr) {
		ResultBean c = JsonUtil.toBean(jsonStr, this.getClass());

		if (null != c) {
			this.code = c.getCode();
			this.message = c.getMessage();
			this.dataList = c.getDataList();
			this.dataListCnt = c.getDataListCnt();
		}
	}

	/**
	 * 根据返回值和消息，初始化ResultBean对象。 多用于无实际数据的场合。
	 * 
	 * @param code
	 * @param message
	 */
	public ResultBean(String code, String message) {
		this.code = code;
		this.message = message;
	}

	/**
	 * 根据返回值和消息以及数据部List，初始化ResultBean对象。 多用于有实际数据的场合。
	 * 
	 * @param code
	 * @param message
	 * @param list
	 */
	public ResultBean(String code, String message, List<String> list) {
		this.code = code;
		this.message = message;
		this.dataList = list;
		if (null != list) {
			this.dataListCnt = list.size();
		}

	}

	/**
	 * 根据数据部单一条对象，初始化ResultBean对象。 多用于有实际数据且仅有一条的成功场合。
	 * 
	 * @param obj
	 */
	public ResultBean(Object obj) {
		ArrayList<String> list = new ArrayList<String>();
		list.add(JsonUtil.toJSONString(obj));
		this.dataList = list;
		this.dataListCnt = 1;
	}

	/**
	 * 根据返回值和消息以及数据部单一条对象，初始化ResultBean对象。 多用于有实际数据且仅有一条的场合。
	 * 
	 * @param code
	 * @param message
	 * @param obj
	 */
	public ResultBean(String code, String message, Object obj) {
		this.code = code;
		this.message = message;
		ArrayList<String> list = new ArrayList<String>();
		list.add(JsonUtil.toJSONString(obj));
		this.dataList = list;
		this.dataListCnt = 1;
	}

	/**
	 * 根据BindingResult对象，初始化ResultBean对象。
	 * 
	 * @param BindingResult
	 */
	public ResultBean(BindingResult result) {
		if (null != result && result.hasErrors()) {
			this.code = DefaultConst.ERR_0001_CODE;
			//			this.message = DefaultConst.ERR_0001_MSG;
			this.dataList = null;
			this.dataListCnt = 0;

			StringBuffer sb = new StringBuffer();
			List<ObjectError> list = result.getAllErrors();
			for (ObjectError error : list) {
				sb.append(error.getDefaultMessage());
				sb.append(", ");
			}
			this.message = sb.substring(0, sb.length() - 2).toString();
		}
	}

	/**
	 * 根据返回值和消息以及数据部对象数目，初始化ResultBean对象。 多用于无实际数据但需返回实际影响条数的场合。
	 * 
	 * @param code
	 * @param message
	 * @param cnt
	 */
	public ResultBean(String code, String message, int cnt) {
		this.code = code;
		this.message = message;
		this.dataListCnt = cnt;
	}

	/**
	 * Json转换用，初始化Bean对象。
	 */
	public ResultBean() {
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.getDesensitizationJSON(this);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getDataList() {
		return dataList;
	}

	public void setDataList(List<String> dataList) {
		this.dataList = dataList;
	}

	public int getDataListCnt() {
		return dataListCnt;
	}

	public void setDataListCnt(int dataListCnt) {
		this.dataListCnt = dataListCnt;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
