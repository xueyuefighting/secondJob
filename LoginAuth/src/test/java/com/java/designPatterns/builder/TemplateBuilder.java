package com.java.designPatterns.builder;

public abstract class TemplateBuilder {
	public abstract boolean deleteLocalFile(String fileName);
	public abstract boolean deleteLocalFile(String fileName,String subfix,String localPath);
	
}
