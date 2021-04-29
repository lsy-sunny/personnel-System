package com.entity.vo;

import com.entity.RenshidiaodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 人事调动
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-14 15:36:41
 */
public class RenshidiaodongVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 调动前部门
	 */
	
	private String diaodongqianbumen;
		
	/**
	 * 调动前职务
	 */
	
	private String diaodongqianzhiwu;
		
	/**
	 * 调动后部门
	 */
	
	private String diaodonghoubumen;
		
	/**
	 * 调动后职务
	 */
	
	private String diaodonghouzhiwu;
		
	/**
	 * 调动时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date diaodongshijian;
				
	
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
	 * 设置：调动前部门
	 */
	 
	public void setDiaodongqianbumen(String diaodongqianbumen) {
		this.diaodongqianbumen = diaodongqianbumen;
	}
	
	/**
	 * 获取：调动前部门
	 */
	public String getDiaodongqianbumen() {
		return diaodongqianbumen;
	}
				
	
	/**
	 * 设置：调动前职务
	 */
	 
	public void setDiaodongqianzhiwu(String diaodongqianzhiwu) {
		this.diaodongqianzhiwu = diaodongqianzhiwu;
	}
	
	/**
	 * 获取：调动前职务
	 */
	public String getDiaodongqianzhiwu() {
		return diaodongqianzhiwu;
	}
				
	
	/**
	 * 设置：调动后部门
	 */
	 
	public void setDiaodonghoubumen(String diaodonghoubumen) {
		this.diaodonghoubumen = diaodonghoubumen;
	}
	
	/**
	 * 获取：调动后部门
	 */
	public String getDiaodonghoubumen() {
		return diaodonghoubumen;
	}
				
	
	/**
	 * 设置：调动后职务
	 */
	 
	public void setDiaodonghouzhiwu(String diaodonghouzhiwu) {
		this.diaodonghouzhiwu = diaodonghouzhiwu;
	}
	
	/**
	 * 获取：调动后职务
	 */
	public String getDiaodonghouzhiwu() {
		return diaodonghouzhiwu;
	}
				
	
	/**
	 * 设置：调动时间
	 */
	 
	public void setDiaodongshijian(Date diaodongshijian) {
		this.diaodongshijian = diaodongshijian;
	}
	
	/**
	 * 获取：调动时间
	 */
	public Date getDiaodongshijian() {
		return diaodongshijian;
	}
			
}
