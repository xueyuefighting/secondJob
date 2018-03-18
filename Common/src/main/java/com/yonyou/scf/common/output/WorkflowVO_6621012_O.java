package com.yonyou.scf.common.output;

import java.io.Serializable;

import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 6621012接口Bean_输出
 * 
 * @author zhangxu
 *
 */
public class WorkflowVO_6621012_O implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1226317508439167598L;

	private Long wkId;
	private Long nodeId;
	private Long foreignId;
	private String type;
	private Long createUserId;
	private String command;
	private String typeName;
	private String applicationPeople;
	private String applicationTime;

	public Long getWkId() {
		return wkId;
	}

	public void setWkId(Long wkId) {
		this.wkId = wkId;
	}

	public Long getNodeId() {
		return nodeId;
	}

	public void setNodeId(Long nodeId) {
		this.nodeId = nodeId;
	}

	public Long getForeignId() {
		return foreignId;
	}

	public void setForeignId(Long foreignId) {
		this.foreignId = foreignId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getApplicationPeople() {
		return applicationPeople;
	}

	public void setApplicationPeople(String applicationPeople) {
		this.applicationPeople = applicationPeople;
	}

	public String getApplicationTime() {
		return applicationTime;
	}

	public void setApplicationTime(String applicationTime) {
		this.applicationTime = applicationTime;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
