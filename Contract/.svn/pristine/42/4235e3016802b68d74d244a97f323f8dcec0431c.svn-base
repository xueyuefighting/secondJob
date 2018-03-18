package com.yonyou.scf.Gateway;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.imageio.ImageIO;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPageTree;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.tools.imageio.ImageIOUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.util.FileCopyUtils;

import com.yonyou.scf.contract.App;
import com.yonyou.scf.contract.ftp.FTPfixPool;
import com.yonyou.scf.contract.util.CommonUtil;
import com.yonyou.scf.contract.util.ConstractTools;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes= {App.class})
@WebAppConfiguration
public class FileTransferToFtp {
	@Autowired
	private RedisTemplate redisTemplate;
	@Autowired
	private FTPfixPool fTPfixPool;
	
	public static void main(String[] args) throws IOException {
		long time = System.currentTimeMillis();
		ByteArrayOutputStream baos = null;
		String[] ids = new String[] {"1","2"};
		String tempPath = new java.io.File("").getCanonicalPath()+"/"+CommonUtil.TEMPFILE+"/";
		try {
			baos = new ByteArrayOutputStream();
			baos = ConstractTools.mergeImgsToOs(ids, tempPath);
			long time1 = System.currentTimeMillis();
			System.out.println("合成图耗时："+(time1-time)+"ms");
			byte[] imgByte = baos.toByteArray();
			BufferedImage buf = ImageIO.read(new ByteArrayInputStream(imgByte));
			
			boolean bool = ImageIO.write(buf, "png", new File(new File("").getCanonicalPath()+"/constract/"+"zhang.png"));
			
			if(bool) {
				//".png" 图片 文件后缀 容易忘，但是必须写
				List<File> files = Stream.of(ids).map(x->tempPath+x+".png").map(y->new File(y)).collect(Collectors.toList());
				long result = CommonUtil.deleteFile(files);
				System.out.println("已经删除成功，操作文件个数："+result);
			}
			System.out.println("转为byte："+imgByte);
			long time2 = System.currentTimeMillis();
			
			System.out.println("所有耗时："+(time-time2)+"ms");
			
//			change("/Users/wyx/Documents/1234567890.pdf",new File("").getCanonicalPath()+"/constract/");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(baos!=null) {
				baos.close();
			}
		}
	}
	
    public static void change(String inputFile, String outputFolder) throws IOException {  
        //TODO 校验输入文件是否存在 以及是否为PDF  
        //TODO 对于PDF加密后的处理  
        PDDocument doc = null;  
        try {  
            doc = PDDocument.load(new File(inputFile));  
            PDFRenderer pdfRenderer = new PDFRenderer(doc);
            PDPageTree pageTree = doc.getPages();
            
            for (int i = 0; i < pageTree.getCount(); i++) {  
            	 float width = pageTree.get(i).getCropBox().getWidth();
                 float scale = 1.0f;
                 if(width >720){
                     scale = 720/width;
                 }
                 BufferedImage bim = pdfRenderer.renderImage(i,scale,ImageType.RGB);
                 ImageIOUtil.writeImage(bim, outputFolder+1 + ".png", 1360);
            }  
        } finally {  
            if (doc != null) {  
                doc.close();  
            }  
        }  
    } 
	
	/**
	 * 
	 * 与ftp交互 重点是 文件名的编码 要是8859-1的  而且在上传和下载的时候 要加上 查询文件是否存在
	 */
	@Test
	public void read() throws Exception{
		byte[] a = readFile();
//		System.out.println("获取文件二进制："+a);
		
//		FileRedisEntity fre = new FileRedisEntity();
//		fre.setFileId("fileid123456");
//		fre.setName("合同");
//		fre.setSubfix("pdf");
//		fre.setFile(readFile());
//		
//		
//		ObjectMapper om = new ObjectMapper();
//		String value = om.writeValueAsString(fre);
//		
//		
//		redisTemplate.opsForValue().set("wangwang", value);
		
//		System.out.println("插入结束");
//		System.out.println("查询结果："+redisTemplate.opsForValue().get("wangwang"));
//		byte[] aa = (byte[])redisTemplate.opsForValue().get("wangwang");
		
//		String val = (String) redisTemplate.opsForValue().get("wangwang");
//		
//		ObjectMapper om1 = new ObjectMapper();
//		FileRedisEntity fileRedisEntity = om1.readValue(val, FileRedisEntity.class);
//		
//		System.out.println(fileRedisEntity.getFileId());
//		System.out.println(fileRedisEntity.getName());
//		System.out.println(fileRedisEntity.getSubfix());
//		
//		byte[] by = fileRedisEntity.getFile();
//		System.out.println(by.length);
		
		FTPClient fTPClient = fTPfixPool.borrowFTP();
		
		upFile(fTPClient,a);
		
		fTPfixPool.returnFTP(fTPClient);
		
		fTPClient= fTPfixPool.borrowFTP();
		
		fTPClient.changeWorkingDirectory("usbkcontent");
		String str = new String("明哥222223.docx".getBytes("UTF-8"),"ISO8859-1");
		
		InputStream is = fTPClient.retrieveFileStream(str);
		
//		FileInputStream fis = new FileInputStream();
		
		fTPfixPool.returnFTP(fTPClient);
	}
	
	private void downFile(FTPClient fTPClient) throws IOException {
		File file = new File("/Users/wyx/Documents","周报张金亮de副本得得得.docx");
		if(!file.exists()) {
			file.createNewFile();
		}
		OutputStream os = new FileOutputStream(file);
		fTPClient.changeWorkingDirectory("usbkcontent");
		String str = new String("明哥222233333.docx".getBytes("UTF-8"),"ISO8859-1");
		long fileCount  = Stream.of(fTPClient.listFiles()).filter(x->x.getName().equals(str)).count();
		if(fileCount<=0) {
			System.out.println("要找的文件不存在");
			return;
		}
//		fTPClient.retrieveFile("明哥2222.docx", os);
		InputStream is = fTPClient.retrieveFileStream(str);
		FileCopyUtils.copy(is, os);
		os.close();
		is.close();
		System.out.println("下载完成");
	}
	
	public void upFile(FTPClient fTPClient,byte[] aa) throws IOException {
		fTPClient.changeWorkingDirectory("usbkcontent");
		
		InputStream is = new ByteArrayInputStream(aa); 
		
		String str = new String("明哥222223.docx".getBytes("UTF-8"),"ISO8859-1");
		
		long fileCount  = Stream.of(fTPClient.listFiles()).filter(x->x.getName().equals(str)).count();
		if(fileCount>0) {
			System.out.println("要找的文件已经存在");
			return;
		}
		
		fTPClient.storeFile(str, is);
		
		System.out.println("上传ftp结束");
	}
	
	public void createFile(byte[] aa) throws IOException {
		File file = new File("/Users/wyx/Documents","周报-张金亮2.docx");
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		OutputStream os = new FileOutputStream(file);
		os.write(aa, 0, aa.length);
		os.close();
		System.out.println("复制文件完成");
	}
	
	public static byte[]  readFile()  throws IOException {
		InputStream is = null;
		ByteArrayOutputStream bos = null;
		try {
			is = new FileInputStream(new File("/Users/wyx/Documents/周报-张金亮.docx"));
			try {
				 bos = new ByteArrayOutputStream();
				 byte[] buffer = new byte[1024 * 4];
				 int n = 0;
			    while ((n = is.read(buffer)) != -1) {
			    		bos.write(buffer, 0, n);
			    }
				return bos.toByteArray();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(is!=null) {
				is.close();
			}
			if(bos!=null) {
				bos.close();
			}
		}
		return null;
	}
	
}
