package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuangongyingpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuangongyingpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuangongyingpinView;


/**
 * 员工应聘
 *
 * @author 
 * @email 
 * @date 2021-04-14 15:36:41
 */
public interface YuangongyingpinService extends IService<YuangongyingpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuangongyingpinVO> selectListVO(Wrapper<YuangongyingpinEntity> wrapper);
   	
   	YuangongyingpinVO selectVO(@Param("ew") Wrapper<YuangongyingpinEntity> wrapper);
   	
   	List<YuangongyingpinView> selectListView(Wrapper<YuangongyingpinEntity> wrapper);
   	
   	YuangongyingpinView selectView(@Param("ew") Wrapper<YuangongyingpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuangongyingpinEntity> wrapper);
   	
}

