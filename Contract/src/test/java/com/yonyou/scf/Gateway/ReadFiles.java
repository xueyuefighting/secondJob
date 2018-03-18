package com.yonyou.scf.Gateway;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.util.StringUtils;

public class ReadFiles {
	
	AtomicInteger sum = new AtomicInteger(0);
	
	
	public static void main(String[] args) throws Exception {
		ReadFiles readFiles = new ReadFiles();
		
		//设置核心线程数和总线程数
		int threadCount = 4;
		
		//关键字
		final String mainWord = "hi-ali";//"hi+ali";
		
		//文件夹路径
		String path = "/Users/wyx/Documents/files/";
		
		//将所有是文件的 放入列表中
		List<File> fileList = obtainsFileList(path);
		
		ThreadPoolExecutor exceutor = 
				new ThreadPoolExecutor(threadCount, threadCount, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
		
		for (File file : fileList) {
			exceutor.execute(readFiles.new Task(file, mainWord));
		}
		
		exceutor.shutdown();
		
		while(true) {
			if(exceutor.isTerminated()) {
				System.out.println(System.currentTimeMillis()+"_logger:包含关键字："+mainWord+"。 的行数是："+readFiles.sum);
				break;
			}
		}
	}

	class Task implements Runnable{
		
		private String mainWord;
		
		private File file;
		
		public Task(File file, String mainWord) {
			System.out.println(System.currentTimeMillis()+"_logger:传入的文件名字为:"+file.getName());
			this.mainWord = mainWord;
			this.file = file;
		}

		@Override
		public void run() {
			System.out.println(System.currentTimeMillis()+"_logger:当前线程名字为："+Thread.currentThread().getName());
			InputStream is = null;
			Scanner sc = null;
			try {
				is = new FileInputStream(file);
				sc = new Scanner(is);
				while(sc.hasNextLine()) {
					String lineStr = sc.nextLine();
					
					if(StringUtils.isEmpty(lineStr)) {
						continue;
					}
					System.out.println(System.currentTimeMillis()+"_logger:读取到的行内容为："+lineStr);
					
					if(lineStr.indexOf(mainWord)>-1) {
						System.out.println("ok:查到匹配字符串");
						sum.incrementAndGet();
					}
				}
			} catch (FileNotFoundException e) {
				System.out.println(System.currentTimeMillis()+"_logger:没有找到文件!");
				e.printStackTrace();
			}finally {
				
				if(is!=null) {
					try {
						is.close();
					} catch (IOException e) {
						System.out.println(System.currentTimeMillis()+"_logger:关闭文件流失败!");
						e.printStackTrace();
					}
				}
				
				if(sc!=null) {
					sc.close();
				}
			}
		}
		
	}
	
	/*
	 * 筛选文件
	 * @param path 文件夹路径
	 * @return
	 * @throws Exception 操作文件时抛出的异常
	 */
	public static List<File> obtainsFileList(String path) throws Exception {
		
		File file  = getFilesWithPath(path);
		
		List<File> fileList = Stream.of(file.list()).parallel().map(x->{
			return new File(path+"/"+x);
		}).filter(x->!x.isDirectory())
		.collect(Collectors.toCollection(LinkedList::new));  
		
		return fileList;
	}

	/*
	 * 通过路径取 文件夹对象
	 * @param path
	 * @return
	 * @throws Exception
	 */
	public static File getFilesWithPath(String path) throws Exception {
		File file = new File(path);

		if(!file.isDirectory()) {
			throw new Exception(System.currentTimeMillis()+"_logger:请输入正确的路径");
		}
		
		return file;
	}
	
//	public void readLine(File file, String mainWord){
//		System.out.println("logger::当前访问的文件名为："+file.getName());
//		BufferedReader br;
//		try {
//			br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
//			String str = null;
//			while((str=br.readLine())!=null){
//				System.out.println("logger:当前行的值为："+str);
//					if(str.indexOf("hi+ali")>-1) {
//						sum.incrementAndGet();
//					}
//				}
//		} catch (FileNotFoundException e) {
//			System.out.println("logger::file not found!!");
//			e.printStackTrace();
//		}catch(IOException ioe) {
//			System.out.println("logger::文件处理异常!");
//			ioe.printStackTrace();
//		}
//	}
}
