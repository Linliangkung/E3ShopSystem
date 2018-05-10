package com.jsako.e3mall.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsako.e3mall.common.pojo.EasyUITreeNode;
import com.jsako.e3mall.mapper.TbItemCatMapper;
import com.jsako.e3mall.pojo.TbItemCat;
import com.jsako.e3mall.pojo.TbItemCatExample;
import com.jsako.e3mall.pojo.TbItemCatExample.Criteria;
import com.jsako.e3mall.service.TbItemCatService;


@Service
public class TbItemCatServiceImpl implements TbItemCatService {

	@Autowired
	private TbItemCatMapper tbItemCatMapper;
	
	@Override
	public List<EasyUITreeNode> getTbItemCatByPid(Long pid) {
		
		TbItemCatExample example=new TbItemCatExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(pid).andStatusEqualTo(1);
		example.setOrderByClause("sort_order asc");
		List<TbItemCat> tbItemCats = tbItemCatMapper.selectByExample(example);
		List<EasyUITreeNode> nodes=new ArrayList<>();
		EasyUITreeNode e=null;
		for (TbItemCat tbItemCat : tbItemCats) {
			e=new EasyUITreeNode();
			e.setId(tbItemCat.getId());
			e.setText(tbItemCat.getName());
			e.setState(tbItemCat.getIsParent()?"closed":"open");
			nodes.add(e);
		}
		return nodes;
	}


}
