package com.entity.model;

import com.entity.XinchouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 薪酬
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-14 15:36:41
 */
public class XinchouModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 标准薪酬
	 */
	
	private String biaozhunxinchou;
		
	/**
	 * 其他薪酬
	 */
	
	private String qitaxinchou;
		
	/**
	 * 日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date riqi;
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
				
	
	/**
	 * 设置：标准薪酬
	 */
	 
	public void setBiaozhunxinchou(String biaozhunxinchou) {
		this.biaozhunxinchou = biaozhunxinchou;
	}
	
	/**
	 * 获取：标准薪酬
	 */
	public String getBiaozhunxinchou() {
		return biaozhunxinchou;
	}
				
	
	/**
	 * 设置：其他薪酬
	 */
	 
	public void setQitaxinchou(String qitaxinchou) {
		this.qitaxinchou = qitaxinchou;
	}
	
	/**
	 * 获取：其他薪酬
	 */
	public String getQitaxinchou() {
		return qitaxinchou;
	}
				
	
	/**
	 * 设置：日期
	 */
	 
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
			
}
