package com.yonyou.scf.contract.service;

import java.util.stream.Stream;

import org.apache.commons.net.ftp.FTPClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yonyou.scf.contract.ftp.FTPfixPool;

@Service
public class TestService {
	
	@Autowired(required=true)
	private FTPfixPool fTPfixPool;
	
	public int readCount() {
		FTPClient ftp = null;
		try {
			ftp = fTPfixPool.borrowFTP();
			ftp.changeWorkingDirectory("usbkcontent");
			return (int) Stream.of(ftp.listFiles()).count();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			fTPfixPool.returnFTP(ftp);
		}
		return 0;
	}
}
