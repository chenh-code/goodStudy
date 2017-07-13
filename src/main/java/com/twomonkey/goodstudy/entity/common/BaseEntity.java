package com.twomonkey.goodstudy.entity.common;

import java.io.Serializable;

public class BaseEntity implements Serializable{
	private static final long serialVersionUID = -2285445201985585680L;

	private Long startIndex = 0l;//起始分页索引
	private Long endIndex = 0l;//结束分页索引
	private Integer total = 0;//数据总数
	private Integer page = 0; //当前页数
	private Integer rows = 0; //每页条数
	private String sidx="";//排序字段
	private String sord="ASC";//默认正序


	public String getSidx() {
		return sidx;
	}

	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	public String getSord() {
		return sord;
	}

	public void setSord(String sord) {
		this.sord = sord;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Long getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(Long startIndex) {
		this.startIndex = startIndex;
	}

	public Long getEndIndex() {
		return endIndex;
	}

	public void setEndIndex(Long endIndex) {
		this.endIndex = endIndex;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

}
