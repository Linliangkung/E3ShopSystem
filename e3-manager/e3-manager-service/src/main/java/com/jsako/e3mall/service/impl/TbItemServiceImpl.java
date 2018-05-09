package com.jsako.e3mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jsako.e3mall.common.pojo.EasyUIDatagridResult;
import com.jsako.e3mall.mapper.TbItemMapper;
import com.jsako.e3mall.pojo.TbItem;
import com.jsako.e3mall.service.TbItemService;

@Service
public class TbItemServiceImpl implements TbItemService {

	@Autowired
	private TbItemMapper tbItemMapper;
	
	@Override
	public TbItem getItemById(long id) {
		return tbItemMapper.selectByPrimaryKey(id);
	}

	@Override
	public EasyUIDatagridResult getItemList(int page, int rows) {
		PageHelper.startPage(page, rows);
		List<TbItem> tbItems = tbItemMapper.selectByExample(null);
		EasyUIDatagridResult easyUIDatagridResult=new EasyUIDatagridResult();
		easyUIDatagridResult.setTotal(new PageInfo<TbItem>(tbItems).getTotal());
		easyUIDatagridResult.setRows(tbItems);
		return easyUIDatagridResult;
	}
	
	
	
}
