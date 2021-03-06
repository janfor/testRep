package com.jzict.test.git.model;

import java.io.Serializable;

/** 
* @author E-mail: shangchenbs@qq.com
* @version 创建时间：2017年10月27日 下午2:39:09 
* 类说明  Base Model
*/
public class BaseModel implements Serializable{

	/**唯一标识**/
	private String id;
	
	public BaseModel() {
	}

	public BaseModel(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
