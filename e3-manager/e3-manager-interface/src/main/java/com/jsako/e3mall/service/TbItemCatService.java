package com.jsako.e3mall.service;

import java.util.List;

import com.jsako.e3mall.common.pojo.EasyUITreeNode;

public interface TbItemCatService {

	
	/**
	 * 根据pid查询商品分类
	 * @param pid
	 */
	public List<EasyUITreeNode>  getTbItemCatByPid(Long pid);
	
}
