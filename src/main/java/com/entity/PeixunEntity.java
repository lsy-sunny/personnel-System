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
 * 培训
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-14 15:36:41
 */
@TableName("peixun")
public class PeixunEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PeixunEntity() {
		
	}
	
	public PeixunEntity(T t) {
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
	 * 培训标题
	 */
					
	private String peixunbiaoti;
	
	/**
	 * 培训标准
	 */
					
	private String peixunbiaozhun;
	
	/**
	 * 培训人员选拔制度
	 */
					
	private String peixunrenyuanxuanbazhidu;
	
	
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
	 * 设置：培训标题
	 */
	public void setPeixunbiaoti(String peixunbiaoti) {
		this.peixunbiaoti = peixunbiaoti;
	}
	/**
	 * 获取：培训标题
	 */
	public String getPeixunbiaoti() {
		return peixunbiaoti;
	}
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
