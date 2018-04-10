package com.jsako.e3mall.service;

import com.jsako.e3mall.pojo.TbItem;

public interface TbItemService {
	/**
	 * 根据商品id查询商品
	 * @param id 
	 * @return
	 */
	TbItem getItemById(long id);
}
