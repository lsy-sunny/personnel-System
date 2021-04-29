package com.entity.view;

import com.entity.ZhiwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 职务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 15:36:41
 */
@TableName("zhiwu")
public class ZhiwuView  extends ZhiwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhiwuView(){
	}
 
 	public ZhiwuView(ZhiwuEntity zhiwuEntity){
 	try {
			BeanUtils.copyProperties(this, zhiwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
