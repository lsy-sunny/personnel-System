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


import com.dao.RenshidanganDao;
import com.entity.RenshidanganEntity;
import com.service.RenshidanganService;
import com.entity.vo.RenshidanganVO;
import com.entity.view.RenshidanganView;

@Service("renshidanganService")
public class RenshidanganServiceImpl extends ServiceImpl<RenshidanganDao, RenshidanganEntity> implements RenshidanganService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenshidanganEntity> page = this.selectPage(
                new Query<RenshidanganEntity>(params).getPage(),
                new EntityWrapper<RenshidanganEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenshidanganEntity> wrapper) {
		  Page<RenshidanganView> page =new Query<RenshidanganView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RenshidanganVO> selectListVO(Wrapper<RenshidanganEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenshidanganVO selectVO(Wrapper<RenshidanganEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenshidanganView> selectListView(Wrapper<RenshidanganEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenshidanganView selectView(Wrapper<RenshidanganEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
