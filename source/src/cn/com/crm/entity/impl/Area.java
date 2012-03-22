package cn.com.crm.entity.impl;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import cn.com.crm.entity.IEntity;

/**
 * 地区类 entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "AREA")
public class Area implements IEntity {

	// Fields

	private Integer areaid;   //地区id
	private String areaname;  //地区名称
	private Set<Customer> customers = new HashSet<Customer>(0);  //客户

	// Constructors

	/** default constructor */
	public Area() {
	}

	/** minimal constructor */
	public Area(Integer areaid, String areaname) {
		this.areaid = areaid;
		this.areaname = areaname;
	}

	/** full constructor */
	public Area(Integer areaid, String areaname, Set<Customer> customers) {
		this.areaid = areaid;
		this.areaname = areaname;
		this.customers = customers;
	}

	// Property accessors
	@Id
	@Column(name = "AREAID", unique = true, nullable = false, precision = 5, scale = 0)
	public Integer getAreaid() {
		return this.areaid;
	}

	public void setAreaid(Integer areaid) {
		this.areaid = areaid;
	}

	@Column(name = "AREANAME", nullable = false, length = 50)
	public String getAreaname() {
		return this.areaname;
	}

	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "area")
	public Set<Customer> getCustomers() {
		return this.customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

}