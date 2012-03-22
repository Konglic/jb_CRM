package cn.com.crm.entity.impl;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import cn.com.crm.entity.IEntity;

/**
 * 历史订单类 entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "HISTORICAORDERS")
public class Historicaorders implements IEntity {

	// Fields

	private Integer orderid;           //订单ID
	private Customer customer;         //客户
	private Orderstatus orderstatus;   //订单状态
	private Date ordertime;            //下单时间
	private String orderaddress;       //送货地址
	private Double ordertotalprice;    //总金额
	private Set<Orderdetail> orderdetails = new HashSet<Orderdetail>(0);  //订单明细

	// Constructors

	/** default constructor */
	public Historicaorders() {
	}

	/** minimal constructor */
	public Historicaorders(Integer orderid, Customer customer,
			Orderstatus orderstatus, Date ordertime, Double ordertotalprice) {
		this.orderid = orderid;
		this.customer = customer;
		this.orderstatus = orderstatus;
		this.ordertime = ordertime;
		this.ordertotalprice = ordertotalprice;
	}

	/** full constructor */
	public Historicaorders(Integer orderid, Customer customer,
			Orderstatus orderstatus, Date ordertime, String orderaddress,
			Double ordertotalprice, Set<Orderdetail> orderdetails) {
		this.orderid = orderid;
		this.customer = customer;
		this.orderstatus = orderstatus;
		this.ordertime = ordertime;
		this.orderaddress = orderaddress;
		this.ordertotalprice = ordertotalprice;
		this.orderdetails = orderdetails;
	}

	// Property accessors
	@Id
	@Column(name = "ORDERID", unique = true, nullable = false, precision = 5, scale = 0)
	public Integer getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CUSTID", nullable = false)
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ORDERSTATUS", nullable = false)
	public Orderstatus getOrderstatus() {
		return this.orderstatus;
	}

	public void setOrderstatus(Orderstatus orderstatus) {
		this.orderstatus = orderstatus;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ORDERTIME", nullable = false, length = 7)
	public Date getOrdertime() {
		return this.ordertime;
	}

	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}

	@Column(name = "ORDERADDRESS", length = 50)
	public String getOrderaddress() {
		return this.orderaddress;
	}

	public void setOrderaddress(String orderaddress) {
		this.orderaddress = orderaddress;
	}

	@Column(name = "ORDERTOTALPRICE", nullable = false, precision = 8)
	public Double getOrdertotalprice() {
		return this.ordertotalprice;
	}

	public void setOrdertotalprice(Double ordertotalprice) {
		this.ordertotalprice = ordertotalprice;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "historicaorders")
	public Set<Orderdetail> getOrderdetails() {
		return this.orderdetails;
	}

	public void setOrderdetails(Set<Orderdetail> orderdetails) {
		this.orderdetails = orderdetails;
	}

}