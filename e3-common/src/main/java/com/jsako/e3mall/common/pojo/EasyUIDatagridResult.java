package com.jsako.e3mall.common.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author linliangkung
 * EasyUI数据表格响应结果数据
 */
public class EasyUIDatagridResult implements Serializable{
	//总记录数
	private long total;
	//分页数据
	private List rows;
	
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}
}
