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


import com.dao.LuyongxinxiDao;
import com.entity.LuyongxinxiEntity;
import com.service.LuyongxinxiService;
import com.entity.vo.LuyongxinxiVO;
import com.entity.view.LuyongxinxiView;

@Service("luyongxinxiService")
public class LuyongxinxiServiceImpl extends ServiceImpl<LuyongxinxiDao, LuyongxinxiEntity> implements LuyongxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LuyongxinxiEntity> page = this.selectPage(
                new Query<LuyongxinxiEntity>(params).getPage(),
                new EntityWrapper<LuyongxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LuyongxinxiEntity> wrapper) {
		  Page<LuyongxinxiView> page =new Query<LuyongxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LuyongxinxiVO> selectListVO(Wrapper<LuyongxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LuyongxinxiVO selectVO(Wrapper<LuyongxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LuyongxinxiView> selectListView(Wrapper<LuyongxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LuyongxinxiView selectView(Wrapper<LuyongxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
