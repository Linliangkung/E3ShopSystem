package com.jsako.e3mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	/*@RequestMapping("/")
	public String index(){
		System.out.println("PageController:index");
		return "index";
	}*/

	@RequestMapping("/{page}")
	public String page(@PathVariable("page")String page){
		return page;
	}
	
	
}
