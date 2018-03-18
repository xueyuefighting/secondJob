package com.bjdreamtech.dmt.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import com.bjdreamtech.dmt.exception.DMTBusinessException;

/**
 * 文件操作工具，文件读取和保存
 * @author duanwu
 *
 */
public class DMTFileUtil {
	static Logger log = Logger.getLogger(DMTFileUtil.class); 
	/**
	 * 将文件流保存为文件
	 * @param inputStream 文件字节流
	 * @param FilePath 文件保存路径
	 * @param fileName 保存文件名称
	 */
	public static void saveFile(InputStream inputStream,String filePath,String fileName) throws Exception{
		//判断文件夹是否存在
		File path = new File(filePath);
		log.info("临时文件夹目录地址 "+filePath);
		if(!path.exists()){
			//不存在的情况下新建文件夹
			path.mkdir();
			log.info("创建临时文件夹  地址创建"+filePath);
		}
		//判断文件是否存在
		File oldFile = new File(filePath+fileName);
		log.info("临时文件夹  判断文件是否存在 "+filePath+fileName);
		
		if(oldFile.exists()){
			//如果原来存在文件则删除原文件
			oldFile.delete();
			log.info("临时文件夹  上传的文件存在 "+filePath+fileName);
		}
		log.info("临时文件夹  创建文件 开始"+filePath+fileName);
		File file = new File(filePath+fileName);
		log.info("临时文件夹  获取文件流"+filePath+fileName);
		FileOutputStream fos = new FileOutputStream(file);
		
		byte[] b = new byte[1024];
		int length;
		while((length=inputStream.read(b))!=-1){
			fos.write(b,0,length);
			log.info("写入文件。。。。。。");
		}
		log.info("临时文件夹  临时文件上传完毕");
		
		fos.close();
		inputStream.close();
	}
	/**
	 * 通过制定的文件路径将文件封装为ResponseEntity对象
	 * @param filePath
	 * @return
	 * @throws IOException 
	 */
	public static ResponseEntity<byte[]> downloadFile(String filePath) throws IOException {
		String fileName = filePath.substring(filePath.lastIndexOf("/")+1);
		File file=new File(filePath);  
        HttpHeaders headers = new HttpHeaders();    
        headers.setContentDispositionFormData("attachment", fileName);   
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);   
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),    
                                          headers, HttpStatus.CREATED); 
	}
	
	
	/**
	 * @param sourceFilePath 打包文件夹
	 * @param fileName 打包后的文件名    融资单号 .zip
	 * @return
	 */
	public static boolean fileToZip(String sourceFilePath,String fileName) throws Exception {  
        boolean flag = false;  
        File sourceFile = new File(sourceFilePath);  
        FileInputStream fis = null;  
        BufferedInputStream bis = null;  
        FileOutputStream fos = null;  
        ZipOutputStream zos = null;  
          //打包的位子
       String  zipFilePath = sourceFilePath;
        
        if(sourceFile.exists() == false){  
            System.out.println ("待压缩的文件目录："+sourceFilePath+"不存在.");  
        }else{  
            try {  
                File zipFile = new File(zipFilePath + "/" + fileName +".zip");  
                //检查是否已经打包
                if(zipFile.exists()){  
                    System.out.println(zipFilePath + "目录下存在名字为:" + fileName +".zip" +"打包文件.");  
                }else{  
                    File[] sourceFiles = sourceFile.listFiles();  
                    
                        fos = new FileOutputStream(zipFile);  
                        zos = new ZipOutputStream(new BufferedOutputStream(fos));  
                        byte[] bufs = new byte[1024*10];  
                        for(int i=0;i<sourceFiles.length;i++){  
                            //创建ZIP实体，并添加进压缩包  
                            ZipEntry zipEntry = new ZipEntry(sourceFiles[i].getName());  
                            zos.putNextEntry(zipEntry);  
                            //读取待压缩的文件并写进压缩包里  
                            fis = new FileInputStream(sourceFiles[i]);  
                            bis = new BufferedInputStream(fis, 1024*10);  
                            int read = 0;  
                            while((read=bis.read(bufs, 0, 1024*10)) != -1){  
                                zos.write(bufs,0,read);  
                            }  
                        }  
                        flag = true;  
                    }  
                 
            } catch (FileNotFoundException e) {  
                e.printStackTrace();  
                throw new RuntimeException(e);  
            } catch (IOException e) {  
                e.printStackTrace();  
                throw new RuntimeException(e);  
            } finally{  
                //关闭流  
                try {  
                    bis.close();  
                    zos.flush(); 
                    zos.close();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                    throw new RuntimeException(e);  
                }  
            }  
        }  
        return flag;  
    }    
	
	
	
	/**
	 * @param path
	 * 传入文件夹地址
	 */
	public static void delFile(String  path){
		//文件夹下
		File file = new File(path);
		
		//判断是否是文件夹
		if (!file.isDirectory()){
			throw new DMTBusinessException("文件夹不存在");
		}
		 //获取文件列表 
		File[] files = file.listFiles();
		//循环文件
		for(int i =0;i<files.length;i++){
			files[i].delete();
		}
		
	}
	
	 /**
	 * @param filePath
	 * 计算文件MD5值
	 * @return
	 */
	public static String fileMd5(String filePath){
		 String str="";
			try {
				str = org.apache.commons.codec.digest.DigestUtils.md5Hex(new FileInputStream(filePath));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		    return str;
	    }
	
	    //创建授信数据
      public static String creatSignData(List<List<Object>> str,String filePath,String fileName){
    	  
    		//判断文件夹是否存在
  		File path = new File(filePath);
  		log.info("临时文件夹目录地址 "+filePath);
  		if(!path.exists()){
  			//不存在的情况下新建文件夹
  			path.mkdir();
  			log.info("创建临时文件夹  地址创建"+filePath);
  		}
  		//判断文件是否存在
  		File oldFile = new File(filePath+fileName);
  		log.info("临时文件夹  判断文件是否存在 "+filePath+fileName);
  		
  		if(oldFile.exists()){
  			//如果原来存在文件则删除原文件
  			oldFile.delete();
  			log.info("临时文件夹  上传的文件存在 "+filePath+fileName);
  		}
  		File file = new File(filePath+fileName);
  		try {
			file.createNewFile();
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
		  	   BufferedWriter bw = new BufferedWriter(fw);
		  	   //循环录入数据
		  	   for(int i = 0;i<str.size();i++){
		  	   List<Object> ls = str.get(i);
		  	         bw.write("报文信息\r\n");
		  	         bw.write(ls.get(0).toString()+"\r\n"); //插入报文
		  	         bw.write("********************************************************************************");
		  	         bw.write("密文信息\r\n");
		  	         bw.write(ls.get(1).toString()+"\r\n");//插入密文
		  	         bw.write("===============================================================================");
		  	   }
		  	   bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//创建文件
    	  return null;
      }
	
      public static  void main(String [] args){
    	  List<Object> ls1= new ArrayList<Object>();
    	  ls1.add("123451gshghgasg融资一");
    	  ls1.add("hihcihdud989djx9w8e7982u39ch89dsdyc8ds9c329u9j9dhc9y7982e78378929cu9dsjc9ds8c7e89982398789d2hc9ds8hc89dsyc98e29hc9ds8cy98he2c");
    	  List<Object> ls2= new ArrayList<Object>();
    	  ls2.add("123451gshghgasg融资一");
    	  ls2.add("hihcihdud989djx9w8e7982u39ch89dsdyc8ds9c329u9j9dhc9y7982e78378929cu9dsjc9ds8c7e89982398789d2hc9ds8hc89dsyc98e29hc9ds8cy98he2c");
    	  List<List<Object>> mm = new ArrayList<List<Object>>();
    	  mm.add(ls1);
    	  mm.add(ls2);
    	  
    	  
    	  creatSignData(mm,"F:/zmkj/20170410war/","1.text");
      }
      
      
}
