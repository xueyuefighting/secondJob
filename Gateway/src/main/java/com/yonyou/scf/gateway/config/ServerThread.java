package com.yonyou.scf.gateway.config;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

class ServerThread extends Thread {    
	  private Socket socket;    
	    
	  ServerThread(Socket socket) {    
	    this.socket = socket;    
	  }    
	    
	  @Override    
	  public void run() {    
	    try {    
	      //InputStreamReader is = new InputStreamReader(socket.getInputStream());    
	      //char[] bs = new char[2048];    
	      PrintStream out;    
	      out = new PrintStream(socket.getOutputStream());    
	      StringBuilder msg = new StringBuilder();   
	      socket.setSoTimeout(5);    
 
	      // 此处读入请求数据并做相应的处理    
//	      int len = -1;    
//	      try {    
//	        while ((len = is.read(bs)) != -1) {    
//	          msg.append(bs, 0, len);    
//	          msg.append("\n");    
//	        }    
//	      } catch (Exception ex) {
//	    	 //超过5秒自动断开socket，异常就不用再处理了
//	         //ex.printStackTrace();    
//	      }    
	      // 下面是由服务器直接生成的主页内容    
	      // 1、首先向浏览器输出响应头信息    
	      out.println("HTTP/1.1 200 OK");    
	      out.println("Content-Type:text/html;charset:UTF-8");    
	      out.println();    
	      // 2、输出主页信息    
	      out    
	          .println("<HTML><BODY>"    
	              + "<center>"    
	              + "<H1>服务可用，当前时间："    
	              + new java.util.Date()    
	              + "</h1>"    
	              + "</center></BODY></HTML>");    
	      out.flush();    
	      out.close();    
	      //is.close();        
	      // 关闭连接    
	      socket.close();
	    } catch (IOException e) {
	      e.printStackTrace();    
	    }    
	  }    
	} 
