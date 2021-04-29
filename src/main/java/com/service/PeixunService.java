package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PeixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PeixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PeixunView;


/**
 * 培训
 *
 * @author 
 * @email 
 * @date 2021-04-14 15:36:41
 */
public interface PeixunService extends IService<PeixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeixunVO> selectListVO(Wrapper<PeixunEntity> wrapper);
   	
   	PeixunVO selectVO(@Param("ew") Wrapper<PeixunEntity> wrapper);
   	
   	List<PeixunView> selectListView(Wrapper<PeixunEntity> wrapper);
   	
   	PeixunView selectView(@Param("ew") Wrapper<PeixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeixunEntity> wrapper);
   	
}

