package com.yonyou.scf.common.bank.lccb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class F648Response implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2819087804240954839L;
	//商户号
	private String busiNum;
	//会员编号
	private String memNum;
	//笔数
	private String totalNum;
	//贷款账号
	private String dkzhangh;
	//贷款借据号
	private String dkjiejuh;
	//产品代码
	private String chanpdma;
	//产品名称
	private String chanpmch;
	//客户号
	private String kehuhaoo;
	//客户名称
	private String kehmingc;
	//合同金额
	private Double hetongje;
	//借据金额
	private Double jiejuuje ;
	//年/月利率标识
	private String  nyuelilv;
	//执行年利率
	private String  zhxnlilv;
	//还款方式
	private String huankfsh ;
	//等额处理规则
	private String dechligz ;
	//总期数
	private String zongqish ;
	//本期期数
	private String  benqqish;
	//逾期期数
	private String yuqiqish;
	//剩余期数
	private String shyuqish;
	//已还期数
	private String yihqishu;
	
	//累计已还本金
	private Double leijyhbj ;
	//累计已还利息
	private Double  leijyhlx;
	//贷款形态
	private String  daikxtai;
	//贷款账户状态
	private String  dkzhhzht;
	//应计非应计状态
	private String  yjfyjzht;
	//每期还款总额
	private Double  meiqhkze;
	//每期还本金额
	private Double  meiqhbje;
	//保留金额
	private Double  baoliuje;
	//还款周期
	private String  hkzhouqi;
	//本金分段
	private String  benjinfd;
	//起息日期
	private String  qixiriqi;
	//到期日期
	private String  daoqriqi;
	//上次还款日
	private String schkriqi ;
	//正常本金
	private Double  zhchbjin;
	//核销本金
	private Double hexiaobj ;
	//核销利息
	private Double  hexiaolx;
	//本期子期数
	private String  benqizqs;
	//交易日期
	private String  jiaoyirq;
	//累计逾期本金
	private Double leijyqbj ;
	//累计逾期欠息
	private Double leijyqqx ;
	//累计产生本金
	private Double  leijcsbj;
	//累计产生利息
	private Double  leijcslx;
	//循环域
	private List<F648Response_DataList> dataList =  new ArrayList<F648Response_DataList>();
	public String getBusiNum() {
		return busiNum;
	}
	public void setBusiNum(String busiNum) {
		this.busiNum = busiNum;
	}
	public String getMemNum() {
		return memNum;
	}
	public void setMemNum(String memNum) {
		this.memNum = memNum;
	}
	public String getTotalNum() {
		return totalNum;
	}
	public void setTotalNum(String totalNum) {
		this.totalNum = totalNum;
	}
	public String getDkzhangh() {
		return dkzhangh;
	}
	public void setDkzhangh(String dkzhangh) {
		this.dkzhangh = dkzhangh;
	}
	public String getDkjiejuh() {
		return dkjiejuh;
	}
	public void setDkjiejuh(String dkjiejuh) {
		this.dkjiejuh = dkjiejuh;
	}
	public String getChanpdma() {
		return chanpdma;
	}
	public void setChanpdma(String chanpdma) {
		this.chanpdma = chanpdma;
	}
	public String getChanpmch() {
		return chanpmch;
	}
	public void setChanpmch(String chanpmch) {
		this.chanpmch = chanpmch;
	}
	public String getKehuhaoo() {
		return kehuhaoo;
	}
	public void setKehuhaoo(String kehuhaoo) {
		this.kehuhaoo = kehuhaoo;
	}
	public String getKehmingc() {
		return kehmingc;
	}
	public void setKehmingc(String kehmingc) {
		this.kehmingc = kehmingc;
	}
	public Double getHetongje() {
		return hetongje;
	}
	public void setHetongje(Double hetongje) {
		this.hetongje = hetongje;
	}
	public Double getJiejuuje() {
		return jiejuuje;
	}
	public void setJiejuuje(Double jiejuuje) {
		this.jiejuuje = jiejuuje;
	}
	public String getNyuelilv() {
		return nyuelilv;
	}
	public void setNyuelilv(String nyuelilv) {
		this.nyuelilv = nyuelilv;
	}
	public String getZhxnlilv() {
		return zhxnlilv;
	}
	public void setZhxnlilv(String zhxnlilv) {
		this.zhxnlilv = zhxnlilv;
	}
	public String getHuankfsh() {
		return huankfsh;
	}
	public void setHuankfsh(String huankfsh) {
		this.huankfsh = huankfsh;
	}
	public String getDechligz() {
		return dechligz;
	}
	public void setDechligz(String dechligz) {
		this.dechligz = dechligz;
	}
	public String getZongqish() {
		return zongqish;
	}
	public void setZongqish(String zongqish) {
		this.zongqish = zongqish;
	}
	public String getBenqqish() {
		return benqqish;
	}
	public void setBenqqish(String benqqish) {
		this.benqqish = benqqish;
	}
	public String getYuqiqish() {
		return yuqiqish;
	}
	public void setYuqiqish(String yuqiqish) {
		this.yuqiqish = yuqiqish;
	}
	public String getShyuqish() {
		return shyuqish;
	}
	public void setShyuqish(String shyuqish) {
		this.shyuqish = shyuqish;
	}
	public String getYihqishu() {
		return yihqishu;
	}
	public void setYihqishu(String yihqishu) {
		this.yihqishu = yihqishu;
	}
	public Double getLeijyhbj() {
		return leijyhbj;
	}
	public void setLeijyhbj(Double leijyhbj) {
		this.leijyhbj = leijyhbj;
	}
	public Double getLeijyhlx() {
		return leijyhlx;
	}
	public void setLeijyhlx(Double leijyhlx) {
		this.leijyhlx = leijyhlx;
	}
	public String getDaikxtai() {
		return daikxtai;
	}
	public void setDaikxtai(String daikxtai) {
		this.daikxtai = daikxtai;
	}
	public String getDkzhhzht() {
		return dkzhhzht;
	}
	public void setDkzhhzht(String dkzhhzht) {
		this.dkzhhzht = dkzhhzht;
	}
	public String getYjfyjzht() {
		return yjfyjzht;
	}
	public void setYjfyjzht(String yjfyjzht) {
		this.yjfyjzht = yjfyjzht;
	}
	public Double getMeiqhkze() {
		return meiqhkze;
	}
	public void setMeiqhkze(Double meiqhkze) {
		this.meiqhkze = meiqhkze;
	}
	public Double getMeiqhbje() {
		return meiqhbje;
	}
	public void setMeiqhbje(Double meiqhbje) {
		this.meiqhbje = meiqhbje;
	}
	public Double getBaoliuje() {
		return baoliuje;
	}
	public void setBaoliuje(Double baoliuje) {
		this.baoliuje = baoliuje;
	}
	public String getHkzhouqi() {
		return hkzhouqi;
	}
	public void setHkzhouqi(String hkzhouqi) {
		this.hkzhouqi = hkzhouqi;
	}
	public String getBenjinfd() {
		return benjinfd;
	}
	public void setBenjinfd(String benjinfd) {
		this.benjinfd = benjinfd;
	}
	public String getQixiriqi() {
		return qixiriqi;
	}
	public void setQixiriqi(String qixiriqi) {
		this.qixiriqi = qixiriqi;
	}
	public String getDaoqriqi() {
		return daoqriqi;
	}
	public void setDaoqriqi(String daoqriqi) {
		this.daoqriqi = daoqriqi;
	}
	public String getSchkriqi() {
		return schkriqi;
	}
	public void setSchkriqi(String schkriqi) {
		this.schkriqi = schkriqi;
	}
	public Double getZhchbjin() {
		return zhchbjin;
	}
	public void setZhchbjin(Double zhchbjin) {
		this.zhchbjin = zhchbjin;
	}
	public Double getHexiaobj() {
		return hexiaobj;
	}
	public void setHexiaobj(Double hexiaobj) {
		this.hexiaobj = hexiaobj;
	}
	public Double getHexiaolx() {
		return hexiaolx;
	}
	public void setHexiaolx(Double hexiaolx) {
		this.hexiaolx = hexiaolx;
	}
	public String getBenqizqs() {
		return benqizqs;
	}
	public void setBenqizqs(String benqizqs) {
		this.benqizqs = benqizqs;
	}
	public String getJiaoyirq() {
		return jiaoyirq;
	}
	public void setJiaoyirq(String jiaoyirq) {
		this.jiaoyirq = jiaoyirq;
	}
	public Double getLeijyqbj() {
		return leijyqbj;
	}
	public void setLeijyqbj(Double leijyqbj) {
		this.leijyqbj = leijyqbj;
	}
	public Double getLeijyqqx() {
		return leijyqqx;
	}
	public void setLeijyqqx(Double leijyqqx) {
		this.leijyqqx = leijyqqx;
	}
	public Double getLeijcsbj() {
		return leijcsbj;
	}
	public void setLeijcsbj(Double leijcsbj) {
		this.leijcsbj = leijcsbj;
	}
	public Double getLeijcslx() {
		return leijcslx;
	}
	public void setLeijcslx(Double leijcslx) {
		this.leijcslx = leijcslx;
	}
	public List<F648Response_DataList> getDataList() {
		return dataList;
	}
	public void setDataList(List<F648Response_DataList> dataList) {
		this.dataList = dataList;
	}
	@Override
	public String toString() {
		return "F648Response [busiNum=" + busiNum + ", memNum=" + memNum
				+ ", totalNum=" + totalNum + ", dkzhangh=" + dkzhangh
				+ ", dkjiejuh=" + dkjiejuh + ", chanpdma=" + chanpdma
				+ ", chanpmch=" + chanpmch + ", kehuhaoo=" + kehuhaoo
				+ ", kehmingc=" + kehmingc + ", hetongje=" + hetongje
				+ ", jiejuuje=" + jiejuuje + ", nyuelilv=" + nyuelilv
				+ ", zhxnlilv=" + zhxnlilv + ", huankfsh=" + huankfsh
				+ ", dechligz=" + dechligz + ", zongqish=" + zongqish
				+ ", benqqish=" + benqqish + ", yuqiqish=" + yuqiqish
				+ ", shyuqish=" + shyuqish + ", yihqishu=" + yihqishu
				+ ", leijyhbj=" + leijyhbj + ", leijyhlx=" + leijyhlx
				+ ", daikxtai=" + daikxtai + ", dkzhhzht=" + dkzhhzht
				+ ", yjfyjzht=" + yjfyjzht + ", meiqhkze=" + meiqhkze
				+ ", meiqhbje=" + meiqhbje + ", baoliuje=" + baoliuje
				+ ", hkzhouqi=" + hkzhouqi + ", benjinfd=" + benjinfd
				+ ", qixiriqi=" + qixiriqi + ", daoqriqi=" + daoqriqi
				+ ", schkriqi=" + schkriqi + ", zhchbjin=" + zhchbjin
				+ ", hexiaobj=" + hexiaobj + ", hexiaolx=" + hexiaolx
				+ ", benqizqs=" + benqizqs + ", jiaoyirq=" + jiaoyirq
				+ ", leijyqbj=" + leijyqbj + ", leijyqqx=" + leijyqqx
				+ ", leijcsbj=" + leijcsbj + ", leijcslx=" + leijcslx
				+ ", dataList=" + dataList + "]";
	}
	

}
