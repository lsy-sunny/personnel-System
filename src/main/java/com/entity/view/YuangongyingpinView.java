package com.entity.view;

import com.entity.YuangongyingpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 员工应聘
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 15:36:41
 */
@TableName("yuangongyingpin")
public class YuangongyingpinView  extends YuangongyingpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuangongyingpinView(){
	}
 
 	public YuangongyingpinView(YuangongyingpinEntity yuangongyingpinEntity){
 	try {
			BeanUtils.copyProperties(this, yuangongyingpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
