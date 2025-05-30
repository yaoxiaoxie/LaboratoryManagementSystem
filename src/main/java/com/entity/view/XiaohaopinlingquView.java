package com.entity.view;

import com.entity.XiaohaopinlingquEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;


/**
 * 消耗品领取
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author
 * @email
 * @date 11-25 08:55:47
 */
@TableName("xiaohaopinlingqu")
public class XiaohaopinlingquView  extends XiaohaopinlingquEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaohaopinlingquView(){
	}

 	public XiaohaopinlingquView(XiaohaopinlingquEntity xiaohaopinlingquEntity){
 	try {
			BeanUtils.copyProperties(this, xiaohaopinlingquEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
