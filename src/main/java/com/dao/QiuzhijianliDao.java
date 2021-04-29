package com.dao;

import com.entity.QiuzhijianliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiuzhijianliVO;
import com.entity.view.QiuzhijianliView;


/**
 * 求职简历
 * 
 * @author 
 * @email 
 * @date 2021-04-14 15:36:41
 */
public interface QiuzhijianliDao extends BaseMapper<QiuzhijianliEntity> {
	
	List<QiuzhijianliVO> selectListVO(@Param("ew") Wrapper<QiuzhijianliEntity> wrapper);
	
	QiuzhijianliVO selectVO(@Param("ew") Wrapper<QiuzhijianliEntity> wrapper);
	
	List<QiuzhijianliView> selectListView(@Param("ew") Wrapper<QiuzhijianliEntity> wrapper);

	List<QiuzhijianliView> selectListView(Pagination page,@Param("ew") Wrapper<QiuzhijianliEntity> wrapper);
	
	QiuzhijianliView selectView(@Param("ew") Wrapper<QiuzhijianliEntity> wrapper);
	
}
