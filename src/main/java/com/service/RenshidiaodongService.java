package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenshidiaodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenshidiaodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenshidiaodongView;


/**
 * 人事调动
 *
 * @author 
 * @email 
 * @date 2021-04-14 15:36:41
 */
public interface RenshidiaodongService extends IService<RenshidiaodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenshidiaodongVO> selectListVO(Wrapper<RenshidiaodongEntity> wrapper);
   	
   	RenshidiaodongVO selectVO(@Param("ew") Wrapper<RenshidiaodongEntity> wrapper);
   	
   	List<RenshidiaodongView> selectListView(Wrapper<RenshidiaodongEntity> wrapper);
   	
   	RenshidiaodongView selectView(@Param("ew") Wrapper<RenshidiaodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenshidiaodongEntity> wrapper);
   	
}

