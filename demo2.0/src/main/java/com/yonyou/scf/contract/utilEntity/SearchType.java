package com.yonyou.scf.contract.utilEntity;

public enum SearchType {
	
	TEXT("text"),
	
	RADIO("radio"),
	
	SELECT("select"),
	
	TIME("time");
	
	private String value;

	private SearchType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
}
