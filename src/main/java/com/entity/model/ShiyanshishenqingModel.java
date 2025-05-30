package com.entity.model;

import com.entity.ShiyanshishenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;


/**
 * 实验室申请
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author
 * @email
 * @date 11-25 08:55:47
 */
public class ShiyanshishenqingModel  implements Serializable {
	private static final long serialVersionUID = 1L;


	/**
	 * 位置
	 */

	private String weizhi;

	/**
	 * 用户名
	 */

	private String yonghuming;

	/**
	 * 用户姓名
	 */

	private String yonghuxingming;

	/**
	 * 身份
	 */

	private String shenfen;

	/**
	 * 联系电话
	 */

	private String lianxidianhua;

	/**
	 * 备注
	 */

	private String beizhu;

	/**
	 * 申请时间
	 */

	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date shenqingshijian;

	/**
	 * 是否审核
	 */

	private String sfsh;

	/**
	 * 审核回复
	 */

	private String shhf;


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
	 * 设置：用户名
	 */

	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}

	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}


	/**
	 * 设置：用户姓名
	 */

	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}

	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}


	/**
	 * 设置：身份
	 */

	public void setShenfen(String shenfen) {
		this.shenfen = shenfen;
	}

	/**
	 * 获取：身份
	 */
	public String getShenfen() {
		return shenfen;
	}


	/**
	 * 设置：联系电话
	 */

	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}

	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}


	/**
	 * 设置：备注
	 */

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}


	/**
	 * 设置：申请时间
	 */

	public void setShenqingshijian(Date shenqingshijian) {
		this.shenqingshijian = shenqingshijian;
	}

	/**
	 * 获取：申请时间
	 */
	public Date getShenqingshijian() {
		return shenqingshijian;
	}


	/**
	 * 设置：是否审核
	 */

	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}

	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}


	/**
	 * 设置：审核回复
	 */

	public void setShhf(String shhf) {
		this.shhf = shhf;
	}

	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
