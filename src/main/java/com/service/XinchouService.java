package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinchouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinchouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinchouView;


/**
 * 薪酬
 *
 * @author 
 * @email 
 * @date 2021-04-14 15:36:41
 */
public interface XinchouService extends IService<XinchouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinchouVO> selectListVO(Wrapper<XinchouEntity> wrapper);
   	
   	XinchouVO selectVO(@Param("ew") Wrapper<XinchouEntity> wrapper);
   	
   	List<XinchouView> selectListView(Wrapper<XinchouEntity> wrapper);
   	
   	XinchouView selectView(@Param("ew") Wrapper<XinchouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinchouEntity> wrapper);
   	
}

