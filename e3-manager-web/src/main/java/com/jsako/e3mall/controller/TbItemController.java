package com.jsako.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsako.e3mall.common.pojo.EasyUIDatagridResult;
import com.jsako.e3mall.pojo.TbItem;
import com.jsako.e3mall.service.TbItemService;

@Controller
@RequestMapping("/item")
public class TbItemController {
	@Autowired
	private TbItemService tbItemService;

	@RequestMapping("/{itemId}")
	@ResponseBody
	public TbItem getItemById (@PathVariable("itemId") long itemId){
		return tbItemService.getItemById(itemId);
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public EasyUIDatagridResult getItemList (Integer page,Integer rows){
		return tbItemService.getItemList(page, rows);
	}
	
}
