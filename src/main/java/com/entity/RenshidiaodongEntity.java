package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 人事调动
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-14 15:36:41
 */
@TableName("renshidiaodong")
public class RenshidiaodongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public RenshidiaodongEntity() {
		
	}
	
	public RenshidiaodongEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 员工工号
	 */
					
	private String yuangonggonghao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date diaodongshijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：员工工号
	 */
	public void setYuangonggonghao(String yuangonggonghao) {
		this.yuangonggonghao = yuangonggonghao;
	}
	/**
	 * 获取：员工工号
	 */
	public String getYuangonggonghao() {
		return yuangonggonghao;
	}
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
