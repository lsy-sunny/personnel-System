package com.entity.view;

import com.entity.PeixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 培训
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 15:36:41
 */
@TableName("peixun")
public class PeixunView  extends PeixunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PeixunView(){
	}
 
 	public PeixunView(PeixunEntity peixunEntity){
 	try {
			BeanUtils.copyProperties(this, peixunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
