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


import com.dao.YuangongyingpinDao;
import com.entity.YuangongyingpinEntity;
import com.service.YuangongyingpinService;
import com.entity.vo.YuangongyingpinVO;
import com.entity.view.YuangongyingpinView;

@Service("yuangongyingpinService")
public class YuangongyingpinServiceImpl extends ServiceImpl<YuangongyingpinDao, YuangongyingpinEntity> implements YuangongyingpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuangongyingpinEntity> page = this.selectPage(
                new Query<YuangongyingpinEntity>(params).getPage(),
                new EntityWrapper<YuangongyingpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuangongyingpinEntity> wrapper) {
		  Page<YuangongyingpinView> page =new Query<YuangongyingpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuangongyingpinVO> selectListVO(Wrapper<YuangongyingpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuangongyingpinVO selectVO(Wrapper<YuangongyingpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuangongyingpinView> selectListView(Wrapper<YuangongyingpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuangongyingpinView selectView(Wrapper<YuangongyingpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
