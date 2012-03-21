package cn.com.crm.entity.impl;

import cn.com.crm.entity.IEntity;

/**
 * 通用的获取页面初始值的ajax请求的实体 
 * @author ping
 */
public class TagDate implements IEntity{
	private String entityName; // 实体名
	private String fields; // 查询的属性
	private String where; // where条件
	private String id;    //id
	private String name;  //名称

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getFields() {
		return fields;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	}
}
