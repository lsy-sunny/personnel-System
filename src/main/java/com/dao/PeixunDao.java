package com.dao;

import com.entity.PeixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PeixunVO;
import com.entity.view.PeixunView;


/**
 * 培训
 * 
 * @author 
 * @email 
 * @date 2021-04-14 15:36:41
 */
public interface PeixunDao extends BaseMapper<PeixunEntity> {
	
	List<PeixunVO> selectListVO(@Param("ew") Wrapper<PeixunEntity> wrapper);
	
	PeixunVO selectVO(@Param("ew") Wrapper<PeixunEntity> wrapper);
	
	List<PeixunView> selectListView(@Param("ew") Wrapper<PeixunEntity> wrapper);

	List<PeixunView> selectListView(Pagination page,@Param("ew") Wrapper<PeixunEntity> wrapper);
	
	PeixunView selectView(@Param("ew") Wrapper<PeixunEntity> wrapper);
	
}
