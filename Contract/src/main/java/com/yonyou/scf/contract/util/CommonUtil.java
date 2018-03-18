package com.yonyou.scf.contract.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPageTree;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.tools.imageio.ImageIOUtil;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.yonyou.scf.common.input.RecieveCLPBean;
import com.yonyou.scf.common.util.CreateID;
import com.yonyou.scf.common.util.StringUtil;

import lombok.Cleanup;


public class CommonUtil {
	
	public static String SEED = "qwertyuiopasdfghjklzxcvbnm1234567890QWERTYUIOPASDFGHJKLZXCVBNM";
	public static String TEMPFILE = "contract";//临时文件的文件夹
	
	/*
	 * 提供种子和要取的数量 生成随机数
	 * @return 
	 */
	public static String randomSixStr(String seed,int length) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			sb.append(seed.charAt((int)(Math.random()*(seed.length()))));
		}
		return sb.toString();
	}
	
	/*
	 * 生成文件名（fileId）
	 * @return
	 */
	public static String createFileId() {
		return CreateID.createId()+randomSixStr(SEED,6);
	}
	
//	public static void main(String[] args) {
//		try {
//			System.out.println("生成文档开始:"+System.currentTimeMillis());
//			@Cleanup InputStream is = new FileInputStream(new File("/Users/wyx/Downloads/template/应收账款转让登记协议模版.pdf"));
//			System.out.println("已找到原文件/Users/wyx/Documents/应收账款转让登记协议模版.pdf");
//			RecieveCLPBean recieveCLPBean = new RecieveCLPBean();
//			recieveCLPBean.setbLContractNo("保理112");
//			recieveCLPBean.setCoreCompanyName("海外制药有限公司");
//			recieveCLPBean.setCurrentDay("1");
//			recieveCLPBean.setCurrentMonth("1");
//			recieveCLPBean.setCurrentYear("2017");
//			recieveCLPBean.setdJcontractNo("通知112");
//			recieveCLPBean.setRecieveBalance("20000");
//			recieveCLPBean.setSecondCompanyName("平价大药房");
//			recieveCLPBean.setSecondeLegalPersonName("刘德治");
//			
//			System.out.println("表单值："+recieveCLPBean.toString());
//			String beanString = JSON.toJSONString(recieveCLPBean);
//			Map<String,String> map = JSON.parseObject(beanString, HashMap.class);
//			System.out.println("已经转化为map+"+map);
//			byte[] bytes = ConstractTools.stuffPDF(map, is);
//			System.out.println("填写表单后，返回流长度"+bytes.length);
//			OutputStream os = new FileOutputStream(new File("/Users/wyx/Downloads/应收账款转让登记协议模版生成版.pdf"));
//			os.write(bytes, 0, bytes.length);
//			os.close();
//			System.out.println("生成目的文档成功:"+System.currentTimeMillis());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	public static void stuffPdf(InputStream is) {
		try {
			PdfReader pdfReader = new PdfReader(is);
			
			String newFileId = createFileId();
			
			CommonUtil.class.getResourceAsStream("classpath:");
			
			PdfStamper stamer = new PdfStamper(pdfReader,new FileOutputStream("/Users/wyx/Documents/004.pdf"));
			AcroFields af = stamer.getAcroFields();
			 BaseFont baseFontChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
			af.setField("姓名", "张金亮张金亮张金亮张金亮张金亮张金亮张金亮张金亮张金亮");
			af.setField("部门", "供应链金融");
			stamer.close();
			pdfReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 删除集合中的存在的File（对应的文件）返回成功操作个数 
	 * @param fileList
	 * @return
	 */
	public static long deleteFile(List<File> fileList) {
		
			//判断file是否存在，将存在的全部删除，将成功删除的个数返回
			List<File> list = fileList.stream().filter(x->x.exists()).collect(Collectors.toList());
			
			if(list==null || list.size()<=0) {
				return 0;
			}
			
			list.stream().forEach(x->x.delete());
			return Long.valueOf(list.size());
	}
	
	/*
	 * 将一个pdf文件转化为图片，存在本项目根路径contract下,并且返回文件名字（id[]）数组。在contract文件夹下的所有文件都是临时文件。
	 * @param filePath
	 * @return
	 * @throws IOException
	 */
	public static String[] obtaisPDD(String filePath, String tempPath) throws IOException {
		if(!filePath.endsWith(".pdf")) {
			return null;
		}
		PDDocument doc = PDDocument.load(new File(filePath));
		return pdfTransferToImg(doc, tempPath);
	}
	public static String[] obtaisPDD(byte[] bytes, String tempPath) throws IOException {
		PDDocument doc = PDDocument.load(bytes);
		return pdfTransferToImg(doc, tempPath);
	}
	public static String[] obtaisPDD(InputStream is, String tempPath) throws IOException {
		PDDocument doc = PDDocument.load(is, tempPath);
		return pdfTransferToImg(doc, tempPath);
	}
	
	private static String[] pdfTransferToImg(PDDocument doc, String tempPath) throws IOException {
		
        try {  
        		
            PDFRenderer pdfRenderer = new PDFRenderer(doc);
            PDPageTree pageTree = doc.getPages();
            
            int pageCounts = pageTree.getCount();
            
            String[] str = new String[pageCounts];
            
            for (int i = 0; i < pageCounts; i++) {  
            	
            		//生成文件名
            		String fileName = createFileId();
            		float width = pageTree.get(i).getCropBox().getWidth();
            	 
                 float scale = 1.0f;
                 if(width >720){
                     scale = 720/width;
                 }
                 BufferedImage bim = pdfRenderer.renderImage(i,scale,ImageType.RGB);
                 
                 //如果没有传入指定临时路径，那么用原默认的
                 tempPath = StringUtils.isEmpty(tempPath)?new File("").getCanonicalPath()+"/"+TEMPFILE+"/":tempPath;
                 
                 ImageIOUtil.writeImage(bim, tempPath+fileName + ".png", 300);
                 
                 str[i] = fileName;
            }
            return str;
        } finally {  
            if (doc != null) {  
                doc.close();  
            }  
        }
	}
	/*
	 * 格式化时间
	 * @param beforeLoginTime 必须17为数字时间 否则返回""
	 * @param formatString 格式化后的时间格式
	 * @return
	 */
	public static  String formatLastTime(String beforeLoginTime,String formatString) {
		
		
		if(beforeLoginTime.length()!=17 || !org.apache.commons.lang.StringUtils.isNumeric(beforeLoginTime)) {
			return "";
		}
		
		String formatTime = "";
		try {
			DateTimeFormatter formatter =  
					  new DateTimeFormatterBuilder()
			  .appendPattern("yyyyMMddHHmmss")
			  .appendValue(ChronoField.MILLI_OF_SECOND, 3)
			  .toFormatter();
			LocalDateTime local = LocalDateTime.parse(beforeLoginTime, formatter);
			formatTime  = local.format(DateTimeFormatter.ofPattern(formatString));
		} catch (Exception e) {
			e.printStackTrace();
			formatTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern(formatString));
		}
		
		return formatTime;
}
	
	/*
	 * 合同编号都是有规则的  比如 TPN-20171101  2017对应yyyy年  11对象MM月  01对应dd日
	 * @param formatStr （1）必须严格按照时间替换格式传入  yyyyMMddHHmmss （2）yyyy MM dd 这样的关键词必须连续 组合后可换位置（eg：MMyyyy）  如果不连续 请调用多次此方法 （3）可以少 比如 只有yyyyMM
	 * @return
	 */
	public static String formatRuleByTime(String formatStr) {
		LocalDateTime localDateTime = LocalDateTime.now();
		if(formatStr.indexOf("yyyy")>-1) {
			formatStr = formatStr.replaceAll("yyyy", StringUtil.toString(localDateTime.getYear()));
		}
		if(formatStr.indexOf("MM")>-1) {
			formatStr = formatStr.replaceAll("MM", StringUtil.toString(localDateTime.getMonthValue()));
		}
		if(formatStr.indexOf("dd")>-1) {
			formatStr = formatStr.replaceAll("dd", StringUtil.toString(localDateTime.getDayOfMonth()));
		}
		if(formatStr.indexOf("HH")>-1) {
			formatStr = formatStr.replaceAll("HH", StringUtil.toString(localDateTime.getHour()));
		}
		if(formatStr.indexOf("mm")>-1) {
			formatStr = formatStr.replaceAll("mm", StringUtil.toString(localDateTime.getMinute()));
		}
		if(formatStr.indexOf("ss")>-1) {
			formatStr = formatStr.replaceAll("ss", StringUtil.toString(localDateTime.getSecond()));
		}
		return formatStr;
	}
	
	
	/*
	 * 只能查询已经排序好的字符串数组  可用ContractConstant.insertionStr()排序
	 * 根据查询优化规则  当超过256个元素时 换其他查询方法   具体参考Colletions类中的
	 * 折半查询  不存在返回-1
	 * @param resouces
	 * @param key
	 * @return
	 */
	public static int searchStr(String[] resouces, String key) {
		
		int start = 0;
		int end = resouces.length-1;
		
		while(start<=end) {
			int mid = (start+end)>>>1;
			
			if(resouces[mid].compareTo(key)==0) {
				return mid;
			}else if(resouces[mid].compareTo(key)<0){
				start++;
			}if(resouces[mid].compareTo(key)>0) {
				end--;
			}
			
		}
		
		return -1;
	}
	
	public static Object getFromJSONObject(JSONObject obj,String key) throws NullPointerException {
		if(StringUtils.isEmpty(obj)) {
			throw new NullPointerException("JSONObject对象为null");
		}
		if(!obj.containsKey(key)) {
			throw new NullPointerException("JSONObject对象中不存在key="+key);
		}
		return obj.get(key);
	}
	
	
}
