package com.jsako.e3mall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsako.e3mall.common.pojo.EasyUITreeNode;
import com.jsako.e3mall.service.TbItemCatService;

@Controller
@RequestMapping("/item/cat")
public class TbItemCatController {

	@Autowired
	private TbItemCatService tbItemCatService;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<EasyUITreeNode> list(@RequestParam(value="id",defaultValue="0")Long pid){
		return tbItemCatService.getTbItemCatByPid(pid);
	}
}
