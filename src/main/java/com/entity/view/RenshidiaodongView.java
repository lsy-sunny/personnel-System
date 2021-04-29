package com.entity.view;

import com.entity.RenshidiaodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 人事调动
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 15:36:41
 */
@TableName("renshidiaodong")
public class RenshidiaodongView  extends RenshidiaodongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RenshidiaodongView(){
	}
 
 	public RenshidiaodongView(RenshidiaodongEntity renshidiaodongEntity){
 	try {
			BeanUtils.copyProperties(this, renshidiaodongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
