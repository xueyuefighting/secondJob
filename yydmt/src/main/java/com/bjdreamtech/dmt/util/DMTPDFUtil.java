package com.bjdreamtech.dmt.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class DMTPDFUtil {
	
	//合同编号
	public static String num ="";
	//文档对象
	public static  Document document ;
	//编码转换
	public static BaseFont baseFont ; 
	//输出对象
	public static PdfWriter writer;
	public static Font font = new Font(baseFont); 
	
	/**
	 * 初始化参数
	 */
	public DMTPDFUtil(String path){
				 try {
					 document = new Document(PageSize.A4,50,50,50,50);
					 writer = PdfWriter.getInstance(document, new FileOutputStream(path+"finnacSgin.pdf"));
					//合同编号
					 num ="y-lccb-order"+DMTDateUtil.parseDate();
					 //创建docm对象
					
					baseFont = BaseFont.createFont("STSong-Light","UniGB-UCS2-H", true);
				} catch (DocumentException e) {
				e.getMessage();
				} catch (IOException e) {
				e.getMessage();
				} 
	}
	
	
	
	
	//合同生成日期
	public static String nowDate(){
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日 ");
		
		return df.format(new Date());
	}
	
	
	
	//生成购销单
	public static void createpurch(List<Map<String,Object>> ls,Map<String,Object> mtr){
		//合同编号
				//
				try {
					Font font = new Font(baseFont); 
					//标题
					Paragraph pb =	new Paragraph("销售合同\n",font);
					pb.setAlignment(Element.ALIGN_CENTER);
					 document.add(pb);
					 
					 // 第一行
					 Paragraph p1 =	new Paragraph("采购商："+mtr.get("rname")+"            订单编号："+num ,font);
						p1.setAlignment(Element.ALIGN_LEFT);
					   document.add(p1);
					 //第二行	 
					 Paragraph p2 =	new Paragraph("供货商："+mtr.get("cname")+"            签订日期："+nowDate(),font);
						p2.setAlignment(Element.ALIGN_LEFT);
						 document.add(p2);	 
					 //第三行	 
					 Paragraph p3 =	new Paragraph("双方在平等自愿的基础上，依据《中华人民共和国广告法》和《合同法》及相关法律、法规的规定，经友好协商，签订本合同，以便共同遵守。",font);
							p3.setAlignment(Element.ALIGN_LEFT);
							 document.add(p3);
					 //第四行		 
					 Paragraph p4 =	new Paragraph("购货明细              ",font);
							p4.setAlignment(Element.ALIGN_LEFT);
							 document.add(p4);
					 //创建表格
					 PdfPTable table = new PdfPTable(6); 
					 PdfPCell cel1 = new PdfPCell(new Paragraph("商品名称",font));
					 PdfPCell cel2 = new PdfPCell(new Paragraph("规格",font));
					 PdfPCell cel3 = new PdfPCell(new Paragraph("单位",font));
					 PdfPCell cel4 = new PdfPCell(new Paragraph("数量",font));
					 PdfPCell cel5 = new PdfPCell(new Paragraph("货值(万元)",font));
					 PdfPCell cel6 = new PdfPCell(new Paragraph("存货仓库",font));
					 table.addCell(cel1);
					 table.addCell(cel2);
					 table.addCell(cel3);
					 table.addCell(cel4);
					 table.addCell(cel5);
					 table.addCell(cel6);
					 BigDecimal bg = new BigDecimal("0.00");
					 
					 for(int i =0;i<ls.size();i++){
						 Map<String,Object> mp = ls.get(i);
						 bg=bg.add(new BigDecimal(String.valueOf(mp.get("goodsvalue"))));
						 PdfPCell cel11 = new PdfPCell(new Paragraph(String.valueOf(mp.get("goodsname")),font));
						 PdfPCell cel22 = new PdfPCell(new Paragraph(String.valueOf(mp.get("goodsspec")),font));
						 PdfPCell cel33 = new PdfPCell(new Paragraph(String.valueOf(mp.get("goodsunit")),font));
						 PdfPCell cel44 = new PdfPCell(new Paragraph(String.valueOf(mp.get("goodsnumber")),font));
						 PdfPCell cel55 = new PdfPCell(new Paragraph(DMTMoneyUtil.moneyFormat(String.valueOf(mp.get("goodsvalue"))),font));
						 PdfPCell cel66 = new PdfPCell(new Paragraph(String.valueOf(mp.get("goodsstore")),font));
						 table.addCell(cel11);
						 table.addCell(cel22);
						 table.addCell(cel33);
						 table.addCell(cel44);
						 table.addCell(cel55);
						 table.addCell(cel66);
					 }
					 PdfPCell celx = new PdfPCell(new Paragraph("                      小计",font));
					 celx.setColspan(4);
					 PdfPCell cely = new PdfPCell(new Paragraph( DMTMoneyUtil.moneyFormat(String.valueOf(bg.toString())) ,font));
					 PdfPCell celz = new PdfPCell(new Paragraph(" ",font));
					 table.addCell(celx);
					 table.addCell(cely);
					 table.addCell(celz);
					 document.add(table); 
					 //
					 Paragraph p5 =	new Paragraph("其他未尽事宜，均按合同签约地点《合同法》和有关条例的预定执行。本合同自双方签章签字或\n电子签名起生效",font);
						p5.setAlignment(Element.ALIGN_LEFT);
						 document.add(p5);
					//采购商签字	 
				    Paragraph p6 =	new Paragraph("采购商（签字）：___________________",font);
						p6.setAlignment(Element.ALIGN_RIGHT);
						 document.add(p6);	 
				   Paragraph p7 =	new Paragraph("     签署日期："+nowDate()+"     ",font);
						p7.setAlignment(Element.ALIGN_RIGHT);
						 document.add(p7);	
				  Paragraph p8 =	new Paragraph("供货商（签字）：___________________",font);
						p8.setAlignment(Element.ALIGN_RIGHT);
						 document.add(p8);	
				  Paragraph p9 =	new Paragraph("    签署日期："+nowDate()+"     ",font);
						p9.setAlignment(Element.ALIGN_RIGHT);
						 document.add(p9);		 
					 
					 
				}  catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			        //创建提款单据
		        public static void createslip(Map<String,Object> mtr){
		        	
		        	//提款单编号
		    		String num ="y-lccb-slip"+DMTDateUtil.parseDate();
		        	
		    		try {
		    			Font font = new Font(baseFont); 
						//打开文档
						//document.open();
						//标题
						Paragraph pbs =	new Paragraph("提款申请书\n",font);
						pbs.setAlignment(Element.ALIGN_CENTER);
						 document.add(pbs);
						//添加 
						Paragraph pbs1 =	new Paragraph("编号："+num,font);
						pbs1.setAlignment(Element.ALIGN_RIGHT);
						 document.add(pbs1);
						 Paragraph pbcw =	new Paragraph(" ",font);
						 pbcw.setAlignment(Element.ALIGN_RIGHT);
							 document.add(pbcw); 
						 
						//新建4列table 
						PdfPTable tablepbs = new PdfPTable(4); 
						 PdfPCell pbscel1 = new PdfPCell(new Paragraph("申请人名称",font));
						 PdfPCell pbscel2 = new PdfPCell(new Paragraph(String.valueOf(mtr.get("applyname")),font));
						 PdfPCell pbscel3 = new PdfPCell(new Paragraph("法定代表人",font));
						 PdfPCell pbscel4 = new PdfPCell(new Paragraph(String.valueOf(mtr.get("legal")),font));
						 //第二行
						 PdfPCell pbscel5 = new PdfPCell(new Paragraph("地址",font));
						 PdfPCell pbscel6 = new PdfPCell(new Paragraph(String.valueOf(mtr.get("address")),font));
						 PdfPCell pbscel7 = new PdfPCell(new Paragraph("联系电话",font));
						 PdfPCell pbscel8 = new PdfPCell(new Paragraph(String.valueOf(mtr.get("phone")),font));
						 //第三行
						 PdfPCell pbscel9 = new PdfPCell(new Paragraph("基本账户开户行及账号",font));
						 PdfPCell pbscel10 = new PdfPCell(new Paragraph(String.valueOf(mtr.get("account")),font));
						 pbscel10.setColspan(3);
						 //第四行
						 PdfPCell pbscel11 = new PdfPCell(new Paragraph("借款金额(元)",font));
						 PdfPCell pbscel12 = new PdfPCell(new Paragraph(DMTMoneyUtil.moneyFormat(String.valueOf(mtr.get("amt"))),font));
						 PdfPCell pbscel13 = new PdfPCell(new Paragraph("币种",font));
						 PdfPCell pbscel14 = new PdfPCell(new Paragraph("人民币",font));
						 //第五行
						 PdfPCell pbscel15 = new PdfPCell(new Paragraph("借款期限(月)",font));
						 PdfPCell pbscel16 = new PdfPCell(new Paragraph(String.valueOf(mtr.get("term")),font));
						 pbscel16.setColspan(3);
		                 //第六行
						 PdfPCell pbscel17 = new PdfPCell(new Paragraph("借款用途",font));
						 PdfPCell pbscel18 = new PdfPCell(new Paragraph(String.valueOf(mtr.get("use")),font));
						 pbscel18.setColspan(3);
						 //第七行
						 PdfPCell pbscel19 = new PdfPCell(new Paragraph("业务模式",font));
						 PdfPCell pbscel20 = new PdfPCell(new Paragraph(String.valueOf(mtr.get("mode")),font));
						 pbscel20.setColspan(3);
						 //第八行
						 PdfPCell pbscel21 = new PdfPCell(new Paragraph("担保方式",font));
						 PdfPCell pbscel22 = new PdfPCell(new Paragraph(String.valueOf(mtr.get("way")),font));
						 pbscel22.setColspan(3);
						 //第九行
						 PdfPCell pbscel23 = new PdfPCell(new Paragraph("申请人:   \n"+"签署日期："+nowDate(),font));
						 pbscel23.setColspan(4);
						 tablepbs.addCell(pbscel1);
						 tablepbs.addCell(pbscel2);
						 tablepbs.addCell(pbscel3);
						 tablepbs.addCell(pbscel4);
						 tablepbs.addCell(pbscel5);
						 tablepbs.addCell(pbscel6);
						 tablepbs.addCell(pbscel7);
						 tablepbs.addCell(pbscel8);
						 tablepbs.addCell(pbscel9);
						 tablepbs.addCell(pbscel10);
						 tablepbs.addCell(pbscel11);
						 tablepbs.addCell(pbscel12);
						 tablepbs.addCell(pbscel13);
						 tablepbs.addCell(pbscel14);
						 tablepbs.addCell(pbscel15);
						 tablepbs.addCell(pbscel16);
						 tablepbs.addCell(pbscel17);
						 tablepbs.addCell(pbscel18);
						 tablepbs.addCell(pbscel19);
						 tablepbs.addCell(pbscel20);
						 tablepbs.addCell(pbscel21);
						 tablepbs.addCell(pbscel22);
						 tablepbs.addCell(pbscel23);  					 
						 document.add(tablepbs);			 
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
	}
	      
	   //创建受托申请单
        public static void createentrusted(Map<String,Object> mtr){
    		try {
    			Font font = new Font(baseFont); 
				//标题
				Paragraph pbc =	new Paragraph("受托单\n",font);
				pbc.setAlignment(Element.ALIGN_CENTER);
				  document.add(pbc);
				//第一行	 
				 Paragraph pc1 =	new Paragraph("申请人（委托人、甲方）："+String.valueOf(mtr.get("rname")) ,font);//融资方名称
					pc1.setAlignment(Element.ALIGN_LEFT);
				  document.add(pc1);		 
			    
				  //第二行
				  
				  String text = "贷款人（受托人、乙方）：	廊坊银行股份有限公司营业部/廊坊银行股份有限公司北环路支行（目前先选择营业部，后期与资管系统连接放款时选择北环路支行，由廊坊银行确认）"+
				  "基于甲方与乙方签订的编号为: "+String.valueOf(mtr.get("creditnum"))   +"《廊坊银行在线供应链业务最高额借款合同》(以下简称“借款合同”)，"
				  		+ "甲方申请提取 人民币 （币种）"+String.valueOf(mtr.get("amt"))+"（大写金额）用于 采购"+mtr.get("goodname") +
				  ".甲方确认已满足借款合同中约定的所有提款条件，并将申请该笔提款所需的所有材料附于本申请书之后供乙方审核。待乙方审核同意后请将所提款项数额划至甲方开立于乙方的账户"+
				  "（账号为 "+mtr.get("memnum") +"）中。甲方并在此无条件且不可撤销的委托乙方将该笔信贷资金根据下述支付明细予以对外支付；"
				  + "甲方承诺本笔信贷资金到达甲方账户后，除用于上述委托乙方对外支付用途外，不以其他任何形式进行支取或自行转账支付，否则将构成甲方对借款合同的违约，"
				  + "乙方有权根据借款合同的约定要求甲方承担相应的违约责任.";
				 Paragraph pc2 =	new Paragraph(text,font);
					pc2.setAlignment(Element.ALIGN_LEFT);
				  document.add(pc2);	
				  Paragraph pc5 = new Paragraph("         ",font);
					pc5.setAlignment(Element.ALIGN_RIGHT);
				  document.add(pc5);
				//新建7列table 
			     PdfPTable pctable = new PdfPTable(7);  
			     PdfPCell pccel1 = new PdfPCell(new Paragraph("序号",font));
				 PdfPCell pccel2 = new PdfPCell(new Paragraph("户名(收款人全称)",font));
				 PdfPCell pccel3 = new PdfPCell(new Paragraph("账号",font));
				 PdfPCell pccel4 = new PdfPCell(new Paragraph("金额(元)",font));
				 PdfPCell pccel5 = new PdfPCell(new Paragraph("开户行",font));
				 PdfPCell pccel6 = new PdfPCell(new Paragraph("款项用途",font));
				 PdfPCell pccel7 = new PdfPCell(new Paragraph("备注",font));
				 PdfPCell pccel8 = new PdfPCell(new Paragraph("1",font));
				 PdfPCell pccel9 = new PdfPCell(new Paragraph(String.valueOf(mtr.get("rcevie_full")),font));
				 PdfPCell pccel10 = new PdfPCell(new Paragraph(String.valueOf(mtr.get("account")),font));
				 PdfPCell pccel11 = new PdfPCell(new Paragraph(String.valueOf(DMTMoneyUtil.moneyFormat(String.valueOf(mtr.get("amtchg")))),font));
				 PdfPCell pccel12 = new PdfPCell(new Paragraph(String.valueOf(mtr.get("bank_full_anme")),font));
				 PdfPCell pcpccel13 = new PdfPCell(new Paragraph(String.valueOf(mtr.get("goodname")),font));
				 PdfPCell pccel14 = new PdfPCell(new Paragraph(String.valueOf(mtr.get("des")),font));
				 pctable.addCell(pccel1);
				 pctable.addCell(pccel2);
				 pctable.addCell(pccel3);
				 pctable.addCell(pccel4);
				 pctable.addCell(pccel5);
				 pctable.addCell(pccel6);
				 pctable.addCell(pccel7);
				 pctable.addCell(pccel8);
				 pctable.addCell(pccel9);
				 pctable.addCell(pccel10);
				 pctable.addCell(pccel11);
				 pctable.addCell(pccel12);
				 pctable.addCell(pcpccel13);
				 pctable.addCell(pccel14);
				 document.add(pctable);	
				 
				 Paragraph pc3 =	new Paragraph("申请人（委托人）（签章/数字签名）:_______________",font);
				 pc3.setAlignment(Element.ALIGN_RIGHT);
				  document.add(pc3);	
				  Paragraph pc4 =	new Paragraph("签署日期："+nowDate(),font);
				  pc4.setAlignment(Element.ALIGN_CENTER);
				  document.add(pc4);	
			}  catch (Exception e) {
				e.printStackTrace();
			}
        }
        //采用变长参数设置
        public static  void  crteatfinancePact(List<Map<String,Object>> ls,Map<String,Object> m1 ,Map<String,Object> m2,Map<String,Object> m3){
        	try{
        		document.open();
        	if(null!=ls&&ls.size()!=0){//购销单据
        		createpurch(ls,m1);
        	   Paragraph x1 =	new Paragraph("                   \n         \n",font);
				x1.setAlignment(Element.ALIGN_RIGHT);
					document.add(x1);
				
        	} 
        	if(null!=m2&&m2.size()!=0){//提款单
        		createslip(m2);
        		Paragraph x2 =	new Paragraph("                   \n         \n",font);
				x2.setAlignment(Element.ALIGN_RIGHT);
					document.add(x2);
        	}
        	if(null!=m3&&m3.size()!=0){//受托单
        		createentrusted(m3);
        		Paragraph x3 =	new Paragraph("                   \n         \n",font);//空行
				x3.setAlignment(Element.ALIGN_RIGHT);
					document.add(x3);
        	}
             document.close();
        	}catch(Exception  e){
        		
        	}
             
        }
        
	
	public static void main(String [] args){
		
//		
//		
//		List<Map<String, Object>> ll = new ArrayList<Map<String, Object>>();
//		Map<String, Object>  mm = new HashMap<String, Object>();
//		Map<String, Object>  mm1 = new HashMap<String, Object>();
//		mm1.put("goodsname", "香飘飘");
//		mm1.put("goodsspec", "香飘飘");
//		mm1.put("goodsunit", "香飘飘");
//		mm1.put("goodsnumber", "122.03");
//		mm1.put("goodsvalue", "121227");
//		mm1.put("goodsstore", "香飘飘");
//		
//		mm.put("goodsname", "香飘飘");
//		mm.put("goodsspec", "香飘飘");
//		mm.put("goodsunit", "香飘飘");
//		mm.put("goodsnumber", "127.12");
//		mm.put("goodsvalue", "127.12");
//		mm.put("goodsstore", "香飘飘");
//		ll.add(mm);
//		ll.add(mm1);
//	   
//		Map<String, Object>  m2 = new HashMap<String, Object>();
//		m2.put("rname", "借款人1");
//		m2.put("cname", "核心1");
//	//	purch(ll,m2,"C:/data/3.pdf");
//		
////		createslip("C:/data/4.pdf");
//		
//		
//		DMTPDFUtil dm = new DMTPDFUtil("C:/1/");
////		List<Map<String,Object>> ls = new ArrayList<Map<String,Object>>();
//    	Map<String,Object> m1= new HashMap<String,Object>(); 
//	   m1.put("applyname", "融资1");
//		
//		dm.crteatfinancePact(ll, m2, m1, null);
		
		Document document = new Document();
        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("C:\\2\1.pdf"));
            document.open();
            // 创建Chunk对象，设置下划线的厚度为0.1
            Chunk underline = new Chunk("hello,AJava.org ");
            underline.setUnderline(0.1f, -1f);
            document.add(underline);
            // 创建Chunk对象，设置下划线的厚度为1
            Chunk strike = new Chunk("欢迎到outofmemory.cn交流学习");
            strike.setUnderline(1f, 3f);
            document.add(strike);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
		
		
	

}
