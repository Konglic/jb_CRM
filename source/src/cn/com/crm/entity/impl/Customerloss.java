package cn.com.crm.entity.impl;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import cn.com.crm.entity.IEntity;

/**
 * 客户流失类 entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "CUSTOMERLOSS")
public class Customerloss implements IEntity {

	// Fields

	private Integer lossid;        //流失ID
	private Customer customer;     //客户
	private Date lastordertime;    //上次下单时间
	private Date losstime;         //确认流失时间
	private String losscause;      //流失原因
	private String losssteps;      //暂缓措施
	private String lossnextsteps;  //追加暂缓措施
	private Integer lossstatus;    //流失状态

	// Constructors

	/** default constructor */
	public Customerloss() {
	}

	/** minimal constructor */
	public Customerloss(Integer lossid, Customer customer, Date lastordertime,
			Date losstime, String lossnextsteps, Integer lossstatus) {
		this.lossid = lossid;
		this.customer = customer;
		this.lastordertime = lastordertime;
		this.losstime = losstime;
		this.lossnextsteps = lossnextsteps;
		this.lossstatus = lossstatus;
	}

	/** full constructor */
	public Customerloss(Integer lossid, Customer customer, Date lastordertime,
			Date losstime, String losscause, String losssteps,
			String lossnextsteps, Integer lossstatus) {
		this.lossid = lossid;
		this.customer = customer;
		this.lastordertime = lastordertime;
		this.losstime = losstime;
		this.losscause = losscause;
		this.losssteps = losssteps;
		this.lossnextsteps = lossnextsteps;
		this.lossstatus = lossstatus;
	}

	// Property accessors
	@Id
	@Column(name = "LOSSID", unique = true, nullable = false, precision = 5, scale = 0)
	public Integer getLossid() {
		return this.lossid;
	}

	public void setLossid(Integer lossid) {
		this.lossid = lossid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CUSTID", nullable = false)
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LASTORDERTIME", nullable = false, length = 7)
	public Date getLastordertime() {
		return this.lastordertime;
	}

	public void setLastordertime(Date lastordertime) {
		this.lastordertime = lastordertime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LOSSTIME", nullable = false, length = 7)
	public Date getLosstime() {
		return this.losstime;
	}

	public void setLosstime(Date losstime) {
		this.losstime = losstime;
	}

	@Column(name = "LOSSCAUSE", length = 100)
	public String getLosscause() {
		return this.losscause;
	}

	public void setLosscause(String losscause) {
		this.losscause = losscause;
	}

	@Column(name = "LOSSSTEPS", length = 100)
	public String getLosssteps() {
		return this.losssteps;
	}

	public void setLosssteps(String losssteps) {
		this.losssteps = losssteps;
	}

	@Column(name = "LOSSNEXTSTEPS", nullable = false, length = 100)
	public String getLossnextsteps() {
		return this.lossnextsteps;
	}

	public void setLossnextsteps(String lossnextsteps) {
		this.lossnextsteps = lossnextsteps;
	}

	@Column(name = "LOSSSTATUS", nullable = false, precision = 1, scale = 0)
	public Integer getLossstatus() {
		return this.lossstatus;
	}

	public void setLossstatus(Integer lossstatus) {
		this.lossstatus = lossstatus;
	}

}