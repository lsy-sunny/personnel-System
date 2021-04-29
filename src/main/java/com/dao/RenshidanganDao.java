package com.dao;

import com.entity.RenshidanganEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenshidanganVO;
import com.entity.view.RenshidanganView;


/**
 * 人事档案
 * 
 * @author 
 * @email 
 * @date 2021-04-14 15:36:41
 */
public interface RenshidanganDao extends BaseMapper<RenshidanganEntity> {
	
	List<RenshidanganVO> selectListVO(@Param("ew") Wrapper<RenshidanganEntity> wrapper);
	
	RenshidanganVO selectVO(@Param("ew") Wrapper<RenshidanganEntity> wrapper);
	
	List<RenshidanganView> selectListView(@Param("ew") Wrapper<RenshidanganEntity> wrapper);

	List<RenshidanganView> selectListView(Pagination page,@Param("ew") Wrapper<RenshidanganEntity> wrapper);
	
	RenshidanganView selectView(@Param("ew") Wrapper<RenshidanganEntity> wrapper);
	
}
