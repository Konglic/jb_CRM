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
 * 客户满意/信誉度类 entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SATISCREDIBILITY")
public class Satiscredibility implements IEntity {

	// Fields

	private Integer satisid;    //id
	private String satisname;   //客户信誉/满意度
	private Set<Customer> satisfactionid = new HashSet<Customer>(0);  //客户满意度
	private Set<Customer> credibilityid = new HashSet<Customer>(0);   //客户信誉度

	// Constructors

	/** default constructor */
	public Satiscredibility() {
	}

	/** minimal constructor */
	public Satiscredibility(Integer satisid, String satisname) {
		this.satisid = satisid;
		this.satisname = satisname;
	}

	/** full constructor */
	public Satiscredibility(Integer satisid, String satisname,
			Set<Customer> satisfactionid,
			Set<Customer> credibilityid) {
		this.satisid = satisid;
		this.satisname = satisname;
		this.satisfactionid = satisfactionid;
		this.credibilityid = credibilityid;
	}

	// Property accessors
	@Id
	@Column(name = "SATISID", unique = true, nullable = false, precision = 5, scale = 0)
	public Integer getSatisid() {
		return this.satisid;
	}

	public void setSatisid(Integer satisid) {
		this.satisid = satisid;
	}

	@Column(name = "SATISNAME", nullable = false, length = 50)
	public String getSatisname() {
		return this.satisname;
	}

	public void setSatisname(String satisname) {
		this.satisname = satisname;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "satisfactionid")
	public Set<Customer> getSatisfactionid() {
		return this.satisfactionid;
	}

	public void setSatisfactionid(
			Set<Customer> satisfactionid) {
		this.satisfactionid = satisfactionid;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "credibilityid")
	public Set<Customer> getCredibilityid() {
		return this.credibilityid;
	}

	public void setCredibilityid(
			Set<Customer> credibilityid) {
		this.credibilityid = credibilityid;
	}

}