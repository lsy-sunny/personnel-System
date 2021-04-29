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


import com.dao.PeixunDao;
import com.entity.PeixunEntity;
import com.service.PeixunService;
import com.entity.vo.PeixunVO;
import com.entity.view.PeixunView;

@Service("peixunService")
public class PeixunServiceImpl extends ServiceImpl<PeixunDao, PeixunEntity> implements PeixunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PeixunEntity> page = this.selectPage(
                new Query<PeixunEntity>(params).getPage(),
                new EntityWrapper<PeixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PeixunEntity> wrapper) {
		  Page<PeixunView> page =new Query<PeixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PeixunVO> selectListVO(Wrapper<PeixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PeixunVO selectVO(Wrapper<PeixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PeixunView> selectListView(Wrapper<PeixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PeixunView selectView(Wrapper<PeixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
