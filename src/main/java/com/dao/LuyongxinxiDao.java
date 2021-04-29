package com.dao;

import com.entity.LuyongxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LuyongxinxiVO;
import com.entity.view.LuyongxinxiView;


/**
 * 录用信息
 * 
 * @author 
 * @email 
 * @date 2021-04-14 15:36:41
 */
public interface LuyongxinxiDao extends BaseMapper<LuyongxinxiEntity> {
	
	List<LuyongxinxiVO> selectListVO(@Param("ew") Wrapper<LuyongxinxiEntity> wrapper);
	
	LuyongxinxiVO selectVO(@Param("ew") Wrapper<LuyongxinxiEntity> wrapper);
	
	List<LuyongxinxiView> selectListView(@Param("ew") Wrapper<LuyongxinxiEntity> wrapper);

	List<LuyongxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<LuyongxinxiEntity> wrapper);
	
	LuyongxinxiView selectView(@Param("ew") Wrapper<LuyongxinxiEntity> wrapper);
	
}
