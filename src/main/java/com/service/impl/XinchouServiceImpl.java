package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XinchouDao;
import com.entity.XinchouEntity;
import com.service.XinchouService;
import com.entity.vo.XinchouVO;
import com.entity.view.XinchouView;

@Service("xinchouService")
public class XinchouServiceImpl extends ServiceImpl<XinchouDao, XinchouEntity> implements XinchouService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinchouEntity> page = this.selectPage(
                new Query<XinchouEntity>(params).getPage(),
                new EntityWrapper<XinchouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinchouEntity> wrapper) {
		  Page<XinchouView> page =new Query<XinchouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinchouVO> selectListVO(Wrapper<XinchouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinchouVO selectVO(Wrapper<XinchouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinchouView> selectListView(Wrapper<XinchouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinchouView selectView(Wrapper<XinchouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
