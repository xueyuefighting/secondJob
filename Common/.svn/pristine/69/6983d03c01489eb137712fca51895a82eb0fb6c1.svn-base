package com.yonyou.scf.common.input;

public class PageVO {

	/**
	 * 总页数
	 */
	private int totalPages = 0;
	/**
	 * 当前页码
	 */
	private int currentPage = 1;
	/**
	 * 每页显示条数
	 */
	private int rows = 10;
	/**
	 * 总件数
	 */
	private int totalRows = 0;

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
		if (totalRows % this.rows == 0) {
			this.totalPages = totalRows / this.rows;
		} else {
			this.totalPages = totalRows / this.rows + 1;
		}
	}

	public int getStartRowNo() {
		if (this.currentPage == 1) {
			return 0;
		} else if (this.currentPage > 1) {
			return (this.currentPage - 1) * this.rows + 1;
		} else {
			return 0;
		}
	}

}
