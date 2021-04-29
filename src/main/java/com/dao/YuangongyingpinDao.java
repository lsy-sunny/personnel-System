package com.dao;

import com.entity.YuangongyingpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuangongyingpinVO;
import com.entity.view.YuangongyingpinView;


/**
 * 员工应聘
 * 
 * @author 
 * @email 
 * @date 2021-04-14 15:36:41
 */
public interface YuangongyingpinDao extends BaseMapper<YuangongyingpinEntity> {
	
	List<YuangongyingpinVO> selectListVO(@Param("ew") Wrapper<YuangongyingpinEntity> wrapper);
	
	YuangongyingpinVO selectVO(@Param("ew") Wrapper<YuangongyingpinEntity> wrapper);
	
	List<YuangongyingpinView> selectListView(@Param("ew") Wrapper<YuangongyingpinEntity> wrapper);

	List<YuangongyingpinView> selectListView(Pagination page,@Param("ew") Wrapper<YuangongyingpinEntity> wrapper);
	
	YuangongyingpinView selectView(@Param("ew") Wrapper<YuangongyingpinEntity> wrapper);
	
}
