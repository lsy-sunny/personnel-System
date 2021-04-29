package com.entity.vo;

import com.entity.PeixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 培训
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-14 15:36:41
 */
public class PeixunVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 培训标准
	 */
	
	private String peixunbiaozhun;
		
	/**
	 * 培训人员选拔制度
	 */
	
	private String peixunrenyuanxuanbazhidu;
				
	
	/**
	 * 设置：培训标准
	 */
	 
	public void setPeixunbiaozhun(String peixunbiaozhun) {
		this.peixunbiaozhun = peixunbiaozhun;
	}
	
	/**
	 * 获取：培训标准
	 */
	public String getPeixunbiaozhun() {
		return peixunbiaozhun;
	}
				
	
	/**
	 * 设置：培训人员选拔制度
	 */
	 
	public void setPeixunrenyuanxuanbazhidu(String peixunrenyuanxuanbazhidu) {
		this.peixunrenyuanxuanbazhidu = peixunrenyuanxuanbazhidu;
	}
	
	/**
	 * 获取：培训人员选拔制度
	 */
	public String getPeixunrenyuanxuanbazhidu() {
		return peixunrenyuanxuanbazhidu;
	}
			
}
