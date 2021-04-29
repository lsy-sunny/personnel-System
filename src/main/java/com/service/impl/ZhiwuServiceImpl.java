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


import com.dao.ZhiwuDao;
import com.entity.ZhiwuEntity;
import com.service.ZhiwuService;
import com.entity.vo.ZhiwuVO;
import com.entity.view.ZhiwuView;

@Service("zhiwuService")
public class ZhiwuServiceImpl extends ServiceImpl<ZhiwuDao, ZhiwuEntity> implements ZhiwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhiwuEntity> page = this.selectPage(
                new Query<ZhiwuEntity>(params).getPage(),
                new EntityWrapper<ZhiwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhiwuEntity> wrapper) {
		  Page<ZhiwuView> page =new Query<ZhiwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhiwuVO> selectListVO(Wrapper<ZhiwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhiwuVO selectVO(Wrapper<ZhiwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhiwuView> selectListView(Wrapper<ZhiwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhiwuView selectView(Wrapper<ZhiwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
