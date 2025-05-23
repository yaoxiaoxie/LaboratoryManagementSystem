package com.entity.vo;

import com.entity.ShiyanshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;


/**
 * 实验室
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author
 * @email
 * @date 11-25 08:55:47
 */
public class ShiyanshiVO  implements Serializable {
	private static final long serialVersionUID = 1L;


	/**
	 * 图片
	 */

	private String tupian;

	/**
	 * 容纳人数
	 */

	private String rongnarenshu;

	/**
	 * 位置
	 */

	private String weizhi;

	/**
	 * 详情
	 */

	private String xiangqing;


	/**
	 * 设置：图片
	 */

	public void setTupian(String tupian) {
		this.tupian = tupian;
	}

	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}


	/**
	 * 设置：容纳人数
	 */

	public void setRongnarenshu(String rongnarenshu) {
		this.rongnarenshu = rongnarenshu;
	}

	/**
	 * 获取：容纳人数
	 */
	public String getRongnarenshu() {
		return rongnarenshu;
	}


	/**
	 * 设置：位置
	 */

	public void setWeizhi(String weizhi) {
		this.weizhi = weizhi;
	}

	/**
	 * 获取：位置
	 */
	public String getWeizhi() {
		return weizhi;
	}


	/**
	 * 设置：详情
	 */

	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}

	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}

}
