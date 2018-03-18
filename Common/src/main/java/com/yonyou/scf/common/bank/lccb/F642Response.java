package com.yonyou.scf.common.bank.lccb;

import java.io.Serializable;

public class F642Response implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9112642332900243881L;
	//商户号
	private String busiNum;
	//会员编号
	private String memNum;
	//贷款借据号
	private String dkjiejuh;
	//合同编号
	private String hetongbh;
	//贷款账号
	private String dkzhangh;
	//客户号
	private String kehuhaoo;
	//客户名称
	private String kehuzwmc;
	//产品代码
	private String chanpdma;
	//产品名称
	private String chanpmch;
	//货币代号
	private String huobdhao;
	//会计类别
	private String kuaijilb;
	//开户日期
	private String kaihriqi;
	//贷款期限
	private String dkqixian;
	//起息日期
	private String qixiriqi;
	//到期日期
	private String daoqriqi;
	//贷款入账账号
	private String dkrzhzhh;
	//贷款账户状态
	private String dkzhhzht;
	//贷款形态
	private String daikxtai;
	//应计非应计状态
	private String yjfyjzht;
	//还款账号
	private String huankzhh;
	//贷款展期状态
	private String dkzhqizt;
	//多笔贷款扣款顺序
	private String dbdkkksx;
	//最后财务交易日
	private String zhcwjyrq;
	//合同金额
	private Double hetongje;
	//借据金额
	private Double jiejuuje;
	//已发放金额
	private Double fafangje;
	//可发放金额
	private Double kffangje;
	//正常本金
	private Double zhchbjin;
	//逾期本金
	private Double yuqibjin;
	//呆滞本金
	private Double dzhibjin;
	//呆账本金
	private Double daizbjin;
	//贷款基金
	private Double dkuanjij;
	//核销本金
	private Double hexiaobj;
	//准备金
	private Double zhunbeij;
	//本期期数
	private String benqqish;
	//利率期限靠挡方式
	private String  llqxkdfs;
	//执行利率
	private Double  zhchlilv;
	//本金合计
	private Double benjheji ;
	//利息合计
	private Double lixiheji ;
	//应收应计利息
	private Double  ysyjlixi;
	//催收应计利息
	private Double csyjlixi;
	//应收欠息
	private Double  ysqianxi;
	//催收欠息
	private Double csqianxi;
	//应收应计罚息
	private Double  ysyjfaxi;
	//催收应计罚息
	private Double  csyjfaxi;
	//应收罚息
	private Double  yshofaxi;
	//催收罚息
	private Double  cshofaxi;
	//应计复息
	private Double  yingjifx;
	//复息
	private Double fuxiiiii;
	//应计贴息
	private Double  yingjitx ;
	//应收贴息
	private Double yingshtx;
	//核销利息
	private Double hexiaolx ;
	//利息收入
	private Double lixishru ;
	//应收费用
	private Double yingshfy ;
	//费用收入
	private Double  feiyshru;
	//应收罚金
	private Double yingshfj ;
	//罚金收入
	private Double  fjinshru;
	//待摊利息
	private Double daitanlx ;
	//营业机构
	private String  yngyjigo;
	//账务机构
	private String  zhngjigo;
	//开户机构
	private String  kaihujig;
	//开户柜员
	private String  kaihguiy;
	//维护日期
	private String  weihriqi;
	//维护柜员
	private String weihguiy ;
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
	public String getDkjiejuh() {
		return dkjiejuh;
	}
	public void setDkjiejuh(String dkjiejuh) {
		this.dkjiejuh = dkjiejuh;
	}
	public String getHetongbh() {
		return hetongbh;
	}
	public void setHetongbh(String hetongbh) {
		this.hetongbh = hetongbh;
	}
	public String getDkzhangh() {
		return dkzhangh;
	}
	public void setDkzhangh(String dkzhangh) {
		this.dkzhangh = dkzhangh;
	}
	public String getKehuhaoo() {
		return kehuhaoo;
	}
	public void setKehuhaoo(String kehuhaoo) {
		this.kehuhaoo = kehuhaoo;
	}
	public String getKehuzwmc() {
		return kehuzwmc;
	}
	public void setKehuzwmc(String kehuzwmc) {
		this.kehuzwmc = kehuzwmc;
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
	public String getHuobdhao() {
		return huobdhao;
	}
	public void setHuobdhao(String huobdhao) {
		this.huobdhao = huobdhao;
	}
	public String getKuaijilb() {
		return kuaijilb;
	}
	public void setKuaijilb(String kuaijilb) {
		this.kuaijilb = kuaijilb;
	}
	public String getKaihriqi() {
		return kaihriqi;
	}
	public void setKaihriqi(String kaihriqi) {
		this.kaihriqi = kaihriqi;
	}
	public String getDkqixian() {
		return dkqixian;
	}
	public void setDkqixian(String dkqixian) {
		this.dkqixian = dkqixian;
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
	public String getDkrzhzhh() {
		return dkrzhzhh;
	}
	public void setDkrzhzhh(String dkrzhzhh) {
		this.dkrzhzhh = dkrzhzhh;
	}
	public String getDkzhhzht() {
		return dkzhhzht;
	}
	public void setDkzhhzht(String dkzhhzht) {
		this.dkzhhzht = dkzhhzht;
	}
	public String getDaikxtai() {
		return daikxtai;
	}
	public void setDaikxtai(String daikxtai) {
		this.daikxtai = daikxtai;
	}
	public String getYjfyjzht() {
		return yjfyjzht;
	}
	public void setYjfyjzht(String yjfyjzht) {
		this.yjfyjzht = yjfyjzht;
	}
	public String getHuankzhh() {
		return huankzhh;
	}
	public void setHuankzhh(String huankzhh) {
		this.huankzhh = huankzhh;
	}
	public String getDkzhqizt() {
		return dkzhqizt;
	}
	public void setDkzhqizt(String dkzhqizt) {
		this.dkzhqizt = dkzhqizt;
	}
	public String getDbdkkksx() {
		return dbdkkksx;
	}
	public void setDbdkkksx(String dbdkkksx) {
		this.dbdkkksx = dbdkkksx;
	}
	public String getZhcwjyrq() {
		return zhcwjyrq;
	}
	public void setZhcwjyrq(String zhcwjyrq) {
		this.zhcwjyrq = zhcwjyrq;
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
	public Double getFafangje() {
		return fafangje;
	}
	public void setFafangje(Double fafangje) {
		this.fafangje = fafangje;
	}
	public Double getKffangje() {
		return kffangje;
	}
	public void setKffangje(Double kffangje) {
		this.kffangje = kffangje;
	}
	public Double getZhchbjin() {
		return zhchbjin;
	}
	public void setZhchbjin(Double zhchbjin) {
		this.zhchbjin = zhchbjin;
	}
	public Double getYuqibjin() {
		return yuqibjin;
	}
	public void setYuqibjin(Double yuqibjin) {
		this.yuqibjin = yuqibjin;
	}
	public Double getDzhibjin() {
		return dzhibjin;
	}
	public void setDzhibjin(Double dzhibjin) {
		this.dzhibjin = dzhibjin;
	}
	public Double getDaizbjin() {
		return daizbjin;
	}
	public void setDaizbjin(Double daizbjin) {
		this.daizbjin = daizbjin;
	}
	public Double getDkuanjij() {
		return dkuanjij;
	}
	public void setDkuanjij(Double dkuanjij) {
		this.dkuanjij = dkuanjij;
	}
	public Double getHexiaobj() {
		return hexiaobj;
	}
	public void setHexiaobj(Double hexiaobj) {
		this.hexiaobj = hexiaobj;
	}
	public Double getZhunbeij() {
		return zhunbeij;
	}
	public void setZhunbeij(Double zhunbeij) {
		this.zhunbeij = zhunbeij;
	}
	public String getBenqqish() {
		return benqqish;
	}
	public void setBenqqish(String benqqish) {
		this.benqqish = benqqish;
	}
	public String getLlqxkdfs() {
		return llqxkdfs;
	}
	public void setLlqxkdfs(String llqxkdfs) {
		this.llqxkdfs = llqxkdfs;
	}
	public Double getZhchlilv() {
		return zhchlilv;
	}
	public void setZhchlilv(Double zhchlilv) {
		this.zhchlilv = zhchlilv;
	}
	public Double getBenjheji() {
		return benjheji;
	}
	public void setBenjheji(Double benjheji) {
		this.benjheji = benjheji;
	}
	public Double getLixiheji() {
		return lixiheji;
	}
	public void setLixiheji(Double lixiheji) {
		this.lixiheji = lixiheji;
	}
	public Double getYsyjlixi() {
		return ysyjlixi;
	}
	public void setYsyjlixi(Double ysyjlixi) {
		this.ysyjlixi = ysyjlixi;
	}
	public Double getCsyjlixi() {
		return csyjlixi;
	}
	public void setCsyjlixi(Double csyjlixi) {
		this.csyjlixi = csyjlixi;
	}
	public Double getYsqianxi() {
		return ysqianxi;
	}
	public void setYsqianxi(Double ysqianxi) {
		this.ysqianxi = ysqianxi;
	}
	public Double getCsqianxi() {
		return csqianxi;
	}
	public void setCsqianxi(Double csqianxi) {
		this.csqianxi = csqianxi;
	}
	public Double getYsyjfaxi() {
		return ysyjfaxi;
	}
	public void setYsyjfaxi(Double ysyjfaxi) {
		this.ysyjfaxi = ysyjfaxi;
	}
	public Double getCsyjfaxi() {
		return csyjfaxi;
	}
	public void setCsyjfaxi(Double csyjfaxi) {
		this.csyjfaxi = csyjfaxi;
	}
	public Double getYshofaxi() {
		return yshofaxi;
	}
	public void setYshofaxi(Double yshofaxi) {
		this.yshofaxi = yshofaxi;
	}
	public Double getCshofaxi() {
		return cshofaxi;
	}
	public void setCshofaxi(Double cshofaxi) {
		this.cshofaxi = cshofaxi;
	}
	public Double getYingjifx() {
		return yingjifx;
	}
	public void setYingjifx(Double yingjifx) {
		this.yingjifx = yingjifx;
	}
	public Double getFuxiiiii() {
		return fuxiiiii;
	}
	public void setFuxiiiii(Double fuxiiiii) {
		this.fuxiiiii = fuxiiiii;
	}
	public Double getYingjitx() {
		return yingjitx;
	}
	public void setYingjitx(Double yingjitx) {
		this.yingjitx = yingjitx;
	}
	public Double getYingshtx() {
		return yingshtx;
	}
	public void setYingshtx(Double yingshtx) {
		this.yingshtx = yingshtx;
	}
	public Double getHexiaolx() {
		return hexiaolx;
	}
	public void setHexiaolx(Double hexiaolx) {
		this.hexiaolx = hexiaolx;
	}
	public Double getLixishru() {
		return lixishru;
	}
	public void setLixishru(Double lixishru) {
		this.lixishru = lixishru;
	}
	public Double getYingshfy() {
		return yingshfy;
	}
	public void setYingshfy(Double yingshfy) {
		this.yingshfy = yingshfy;
	}
	public Double getFeiyshru() {
		return feiyshru;
	}
	public void setFeiyshru(Double feiyshru) {
		this.feiyshru = feiyshru;
	}
	public Double getYingshfj() {
		return yingshfj;
	}
	public void setYingshfj(Double yingshfj) {
		this.yingshfj = yingshfj;
	}
	public Double getFjinshru() {
		return fjinshru;
	}
	public void setFjinshru(Double fjinshru) {
		this.fjinshru = fjinshru;
	}
	public Double getDaitanlx() {
		return daitanlx;
	}
	public void setDaitanlx(Double daitanlx) {
		this.daitanlx = daitanlx;
	}
	public String getYngyjigo() {
		return yngyjigo;
	}
	public void setYngyjigo(String yngyjigo) {
		this.yngyjigo = yngyjigo;
	}
	public String getZhngjigo() {
		return zhngjigo;
	}
	public void setZhngjigo(String zhngjigo) {
		this.zhngjigo = zhngjigo;
	}
	public String getKaihujig() {
		return kaihujig;
	}
	public void setKaihujig(String kaihujig) {
		this.kaihujig = kaihujig;
	}
	public String getKaihguiy() {
		return kaihguiy;
	}
	public void setKaihguiy(String kaihguiy) {
		this.kaihguiy = kaihguiy;
	}
	public String getWeihriqi() {
		return weihriqi;
	}
	public void setWeihriqi(String weihriqi) {
		this.weihriqi = weihriqi;
	}
	public String getWeihguiy() {
		return weihguiy;
	}
	public void setWeihguiy(String weihguiy) {
		this.weihguiy = weihguiy;
	}
	@Override
	public String toString() {
		return "F642Response [busiNum=" + busiNum + ", memNum=" + memNum
				+ ", dkjiejuh=" + dkjiejuh + ", hetongbh=" + hetongbh
				+ ", dkzhangh=" + dkzhangh + ", kehuhaoo=" + kehuhaoo
				+ ", kehuzwmc=" + kehuzwmc + ", chanpdma=" + chanpdma
				+ ", chanpmch=" + chanpmch + ", huobdhao=" + huobdhao
				+ ", kuaijilb=" + kuaijilb + ", kaihriqi=" + kaihriqi
				+ ", dkqixian=" + dkqixian + ", qixiriqi=" + qixiriqi
				+ ", daoqriqi=" + daoqriqi + ", dkrzhzhh=" + dkrzhzhh
				+ ", dkzhhzht=" + dkzhhzht + ", daikxtai=" + daikxtai
				+ ", yjfyjzht=" + yjfyjzht + ", huankzhh=" + huankzhh
				+ ", dkzhqizt=" + dkzhqizt + ", dbdkkksx=" + dbdkkksx
				+ ", zhcwjyrq=" + zhcwjyrq + ", hetongje=" + hetongje
				+ ", jiejuuje=" + jiejuuje + ", fafangje=" + fafangje
				+ ", kffangje=" + kffangje + ", zhchbjin=" + zhchbjin
				+ ", yuqibjin=" + yuqibjin + ", dzhibjin=" + dzhibjin
				+ ", daizbjin=" + daizbjin + ", dkuanjij=" + dkuanjij
				+ ", hexiaobj=" + hexiaobj + ", zhunbeij=" + zhunbeij
				+ ", benqqish=" + benqqish + ", llqxkdfs=" + llqxkdfs
				+ ", zhchlilv=" + zhchlilv + ", benjheji=" + benjheji
				+ ", lixiheji=" + lixiheji + ", ysyjlixi=" + ysyjlixi
				+ ", csyjlixi=" + csyjlixi + ", ysqianxi=" + ysqianxi
				+ ", csqianxi=" + csqianxi + ", ysyjfaxi=" + ysyjfaxi
				+ ", csyjfaxi=" + csyjfaxi + ", yshofaxi=" + yshofaxi
				+ ", cshofaxi=" + cshofaxi + ", yingjifx=" + yingjifx
				+ ", fuxiiiii=" + fuxiiiii + ", yingjitx=" + yingjitx
				+ ", yingshtx=" + yingshtx + ", hexiaolx=" + hexiaolx
				+ ", lixishru=" + lixishru + ", yingshfy=" + yingshfy
				+ ", feiyshru=" + feiyshru + ", yingshfj=" + yingshfj
				+ ", fjinshru=" + fjinshru + ", daitanlx=" + daitanlx
				+ ", yngyjigo=" + yngyjigo + ", zhngjigo=" + zhngjigo
				+ ", kaihujig=" + kaihujig + ", kaihguiy=" + kaihguiy
				+ ", weihriqi=" + weihriqi + ", weihguiy=" + weihguiy + "]";
	}
	
	

	


}
