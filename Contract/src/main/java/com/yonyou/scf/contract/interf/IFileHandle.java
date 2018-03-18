package com.yonyou.scf.contract.interf;

import java.io.File;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.yonyou.scf.contract.utilEntity.FileResponseEntity;

public interface IFileHandle {
	public List<FileResponseEntity> upFile(MultipartHttpServletRequest multiReq);
	/*
	 * 
	 * @param ftpClient
	 * @param id
	 * @param response  因为要设置响应报文中的属性
	 * @return
	 * @throws Exception
	 */
	public void downFile(String fileId,HttpServletResponse response) throws Exception;
	public boolean openFile();
	public File getFile();
	void viewPdf(String id, OutputStream os) throws Exception;
}
