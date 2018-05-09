package com.jsako.e3mall.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jsako.e3mall.mapper.TbItemMapper;
import com.jsako.e3mall.pojo.TbItem;
import com.jsako.e3mall.pojo.TbItemExample;
import com.jsako.e3mall.pojo.TbItemExample.Criteria;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/applicationContext-*.xml"})
public class TestPageHelper {

	@Autowired
	private TbItemMapper tbItemMapper;
	
	
	@Test
	public void testPageHelper(){
		
		PageHelper.startPage(1, 50);
		List<TbItem> selectByExample = tbItemMapper.selectByExample(null);
//		for (TbItem tbItem : selectByExample) {
//			System.out.println(tbItem.getId());
//		}
		System.out.println(selectByExample.getClass());
		PageInfo<TbItem> pageInfo=new PageInfo<>(selectByExample);
		long total = pageInfo.getTotal();
		int pageNum = pageInfo.getPageNum();
		int nextPage = pageInfo.getNextPage();
		
		System.out.println("total:"+total);
		System.out.println("pageNum:"+pageNum);
		System.out.println("nextPage:"+nextPage);
	}
}
