package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenshidanganEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenshidanganVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenshidanganView;


/**
 * 人事档案
 *
 * @author 
 * @email 
 * @date 2021-04-14 15:36:41
 */
public interface RenshidanganService extends IService<RenshidanganEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenshidanganVO> selectListVO(Wrapper<RenshidanganEntity> wrapper);
   	
   	RenshidanganVO selectVO(@Param("ew") Wrapper<RenshidanganEntity> wrapper);
   	
   	List<RenshidanganView> selectListView(Wrapper<RenshidanganEntity> wrapper);
   	
   	RenshidanganView selectView(@Param("ew") Wrapper<RenshidanganEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenshidanganEntity> wrapper);
   	
}

