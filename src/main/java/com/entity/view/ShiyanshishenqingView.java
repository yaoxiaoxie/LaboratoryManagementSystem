package com.entity.view;

import com.entity.ShiyanshishenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;


/**
 * 实验室申请
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author
 * @email
 * @date 11-25 08:55:47
 */
@TableName("shiyanshishenqing")
public class ShiyanshishenqingView  extends ShiyanshishenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShiyanshishenqingView(){
	}

 	public ShiyanshishenqingView(ShiyanshishenqingEntity shiyanshishenqingEntity){
 	try {
			BeanUtils.copyProperties(this, shiyanshishenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
