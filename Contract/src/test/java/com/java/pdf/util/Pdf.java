//package com.java.pdf.util;
//
//import java.io.IOException;
//
//import com.yonyou.scf.contract.util.CommonUtil;
//
//public class Pdf {
//	public static void main(String[] args) {
//		try {
//			Long time = System.currentTimeMillis();
//			boolean bool = CommonUtil.pdfTransferToImg("/Users/wyx/Documents/1234567890.pdf");
//			Long time1 = System.currentTimeMillis();
//			if(bool) {
//				System.out.println("生成成功，耗时"+(time-time1)+"ms");
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//}
