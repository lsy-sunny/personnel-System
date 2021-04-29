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


import com.dao.RenshidiaodongDao;
import com.entity.RenshidiaodongEntity;
import com.service.RenshidiaodongService;
import com.entity.vo.RenshidiaodongVO;
import com.entity.view.RenshidiaodongView;

@Service("renshidiaodongService")
public class RenshidiaodongServiceImpl extends ServiceImpl<RenshidiaodongDao, RenshidiaodongEntity> implements RenshidiaodongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenshidiaodongEntity> page = this.selectPage(
                new Query<RenshidiaodongEntity>(params).getPage(),
                new EntityWrapper<RenshidiaodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenshidiaodongEntity> wrapper) {
		  Page<RenshidiaodongView> page =new Query<RenshidiaodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RenshidiaodongVO> selectListVO(Wrapper<RenshidiaodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenshidiaodongVO selectVO(Wrapper<RenshidiaodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenshidiaodongView> selectListView(Wrapper<RenshidiaodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenshidiaodongView selectView(Wrapper<RenshidiaodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
