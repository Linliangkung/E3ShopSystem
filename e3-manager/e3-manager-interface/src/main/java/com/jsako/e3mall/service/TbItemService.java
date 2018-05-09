package com.jsako.e3mall.service;


import com.jsako.e3mall.common.pojo.EasyUIDatagridResult;
import com.jsako.e3mall.pojo.TbItem;

public interface TbItemService {
	/**
	 * 根据商品id查询商品
	 * @param id 
	 * @return
	 */
	TbItem getItemById(long id);
	
	/**
	 * 根据页码和每页显示条数分页查询商品
	 * @param page 页码
	 * @param rows 每页显示条数
	 * @return
	 */
	EasyUIDatagridResult getItemList(int page,int rows);
}
