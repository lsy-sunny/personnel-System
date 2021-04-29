package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhiwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhiwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiwuView;


/**
 * 职务
 *
 * @author 
 * @email 
 * @date 2021-04-14 15:36:41
 */
public interface ZhiwuService extends IService<ZhiwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiwuVO> selectListVO(Wrapper<ZhiwuEntity> wrapper);
   	
   	ZhiwuVO selectVO(@Param("ew") Wrapper<ZhiwuEntity> wrapper);
   	
   	List<ZhiwuView> selectListView(Wrapper<ZhiwuEntity> wrapper);
   	
   	ZhiwuView selectView(@Param("ew") Wrapper<ZhiwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiwuEntity> wrapper);
   	
}

