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
 * 客户等级类 entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "GRADE")
public class Grade implements IEntity {

	// Fields

	private Integer gradeid;    //等级id
	private String gradename;   //等级名称
	private Set<Customer> customers = new HashSet<Customer>(0);  //客户

	// Constructors

	/** default constructor */
	public Grade() {
	}

	/** minimal constructor */
	public Grade(Integer gradeid, String gradename) {
		this.gradeid = gradeid;
		this.gradename = gradename;
	}

	/** full constructor */
	public Grade(Integer gradeid, String gradename, Set<Customer> customers) {
		this.gradeid = gradeid;
		this.gradename = gradename;
		this.customers = customers;
	}

	// Property accessors
	@Id
	@Column(name = "GRADEID", unique = true, nullable = false, precision = 5, scale = 0)
	public Integer getGradeid() {
		return this.gradeid;
	}

	public void setGradeid(Integer gradeid) {
		this.gradeid = gradeid;
	}

	@Column(name = "GRADENAME", nullable = false, length = 50)
	public String getGradename() {
		return this.gradename;
	}

	public void setGradename(String gradename) {
		this.gradename = gradename;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "grade")
	public Set<Customer> getCustomers() {
		return this.customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

}