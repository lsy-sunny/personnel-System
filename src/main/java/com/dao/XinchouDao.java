package com.dao;

import com.entity.XinchouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinchouVO;
import com.entity.view.XinchouView;


/**
 * 薪酬
 * 
 * @author 
 * @email 
 * @date 2021-04-14 15:36:41
 */
public interface XinchouDao extends BaseMapper<XinchouEntity> {
	
	List<XinchouVO> selectListVO(@Param("ew") Wrapper<XinchouEntity> wrapper);
	
	XinchouVO selectVO(@Param("ew") Wrapper<XinchouEntity> wrapper);
	
	List<XinchouView> selectListView(@Param("ew") Wrapper<XinchouEntity> wrapper);

	List<XinchouView> selectListView(Pagination page,@Param("ew") Wrapper<XinchouEntity> wrapper);
	
	XinchouView selectView(@Param("ew") Wrapper<XinchouEntity> wrapper);
	
}
