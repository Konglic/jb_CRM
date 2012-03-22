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
 * 订单状态 entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ORDERSTATUS")
public class Orderstatus implements IEntity {

	// Fields

	private Integer statusid;   //订单状态ID
	private String statusname;  //订单状态名称
	private Set<Historicaorders> historicaorderses = new HashSet<Historicaorders>(
			0);                 //历史订单

	// Constructors

	/** default constructor */
	public Orderstatus() {
	}

	/** minimal constructor */
	public Orderstatus(Integer statusid, String statusname) {
		this.statusid = statusid;
		this.statusname = statusname;
	}

	/** full constructor */
	public Orderstatus(Integer statusid, String statusname,
			Set<Historicaorders> historicaorderses) {
		this.statusid = statusid;
		this.statusname = statusname;
		this.historicaorderses = historicaorderses;
	}

	// Property accessors
	@Id
	@Column(name = "STATUSID", unique = true, nullable = false, precision = 5, scale = 0)
	public Integer getStatusid() {
		return this.statusid;
	}

	public void setStatusid(Integer statusid) {
		this.statusid = statusid;
	}

	@Column(name = "STATUSNAME", nullable = false, length = 50)
	public String getStatusname() {
		return this.statusname;
	}

	public void setStatusname(String statusname) {
		this.statusname = statusname;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "orderstatus")
	public Set<Historicaorders> getHistoricaorderses() {
		return this.historicaorderses;
	}

	public void setHistoricaorderses(Set<Historicaorders> historicaorderses) {
		this.historicaorderses = historicaorderses;
	}

}