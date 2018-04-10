package com.jsako.e3mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
