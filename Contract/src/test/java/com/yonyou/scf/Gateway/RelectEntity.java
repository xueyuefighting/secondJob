package com.yonyou.scf.Gateway;

import java.lang.reflect.Field;
import java.util.Optional;
import java.util.stream.Stream;

import com.yonyou.scf.common.util.StringUtil;

public class RelectEntity {

	private static String[] moneyKey = {"fen","jiao","yuan","bai","qian"};
	
	private String qian;
	private String bai;
	private String yuan;
	private String jiao;
	private String fen;
	
	private String money;
	private String name;

	public String getYuan() {
		return yuan;
	}

	public void setYuan(String yuan) {
		this.yuan = yuan;
	}

	public String getJiao() {
		return jiao;
	}

	public void setJiao(String jiao) {
		this.jiao = jiao;
	}

	public String getFen() {
		return fen;
	}

	public void setFen(String fen) {
		this.fen = fen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMoney() {
		return money;
	}

	/*
	 * 1)仅支持单位为分的金额
	 * 2）传入money金额后，将会被依次划分到其他属性
	 * @param money
	 * @throws Exception
	 */
	public void setMoney(String money) throws Exception {
		
		for (int i = money.length()-1; i > -1; i--) {
			String currentFieldName =  moneyKey[i];
			
			Field[] fields = this.getClass().getDeclaredFields();
			
			Optional<Field> fieldO = Stream.of(fields)
					.filter(x->x.getName().equalsIgnoreCase(currentFieldName)).findFirst();
			
			Field field = fieldO.orElseThrow(NullPointerException::new);
			
			field.setAccessible(true);
			field.set(this, StringUtil.toString(money.charAt(i)));
		}
		this.money = money;
	}
	
	public String getQian() {
		return qian;
	}

	public void setQian(String qian) {
		this.qian = qian;
	}

	public String getBai() {
		return bai;
	}

	public void setBai(String bai) {
		this.bai = bai;
	}


	@Override
	public String toString() {
		return "RelectEntity [qian=" + qian + ", bai=" + bai + ", yuan=" + yuan + ", jiao=" + jiao + ", fen=" + fen
				+ ", money=" + money + ", name=" + name + "]";
	}

	public RelectEntity(String qian, String bai, String yuan, String jiao, String fen, String money, String name) {
		super();
		this.qian = qian;
		this.bai = bai;
		this.yuan = yuan;
		this.jiao = jiao;
		this.fen = fen;
		this.money = money;
		this.name = name;
	}

	public RelectEntity() {
	}

	
	
}
