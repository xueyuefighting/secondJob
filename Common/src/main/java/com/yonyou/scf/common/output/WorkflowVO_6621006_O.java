package com.yonyou.scf.common.output;

import java.io.Serializable;

import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 66210006接口Bean_输出
 * 
 * @author zhangxu
 *
 */
public class WorkflowVO_6621006_O implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6641293626087488993L;

	/**
	 * 序号
	 */
	private int no;
	/**
	 * 审核步骤
	 */
	private String step;
	/**
	 * 审核人
	 */
	private String user;
	/**
	 * 审核时间
	 */
	private String time;
	/**
	 * 审核结果
	 */
	private String info;
	/**
	 * 审核状态
	 */
	private String status;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getStep() {
		return step;
	}

	public void setStep(String step) {
		this.step = step;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
