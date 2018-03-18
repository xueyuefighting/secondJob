package com.yonyou.scf.common.output;

/**
 * 廊坊银行企业
 * 
 * @author durui 2017-09-20
 * @version 1.0
 * */
public class SCF9110023Output {

	// 绑定状态(0- 未绑定 1-已绑定 2-审核中)
	private String bindStatus;

	// U盾操作手册
	private Long dcOpBook;

	// U盾使用授权书
	private Long dcApply;

	/**
	 * @return the bindStatus
	 */
	public String getBindStatus() {
		return bindStatus;
	}

	/**
	 * @param bindStatus
	 *            the bindStatus to set
	 */
	public void setBindStatus(String bindStatus) {
		this.bindStatus = bindStatus;
	}

	/**
	 * @return the dcOpBook
	 */
	public Long getDcOpBook() {
		return dcOpBook;
	}

	/**
	 * @param dcOpBook
	 *            the dcOpBook to set
	 */
	public void setDcOpBook(Long dcOpBook) {
		this.dcOpBook = dcOpBook;
	}

	/**
	 * @return the dcApply
	 */
	public Long getDcApply() {
		return dcApply;
	}

	/**
	 * @param dcApply
	 *            the dcApply to set
	 */
	public void setDcApply(Long dcApply) {
		this.dcApply = dcApply;
	}
}
