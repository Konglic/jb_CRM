package cn.com.crm.entity.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import cn.com.crm.entity.IEntity;

/**
 * 历史订单明细类 entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ORDERDETAIL")
public class Orderdetail implements IEntity {

	// Fields

	private Integer detailid;                 //明细ID
	private Product product;                  //产品
	private Historicaorders historicaorders;  //历史订单
	private Integer ordernumber;              //数量

	// Constructors

	/** default constructor */
	public Orderdetail() {
	}

	/** full constructor */
	public Orderdetail(Integer detailid, Product product,
			Historicaorders historicaorders, Integer ordernumber) {
		this.detailid = detailid;
		this.product = product;
		this.historicaorders = historicaorders;
		this.ordernumber = ordernumber;
	}

	// Property accessors
	@Id
	@Column(name = "DETAILID", unique = true, nullable = false, precision = 5, scale = 0)
	public Integer getDetailid() {
		return this.detailid;
	}

	public void setDetailid(Integer detailid) {
		this.detailid = detailid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRODUCTID", nullable = false)
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ORDERID", nullable = false)
	public Historicaorders getHistoricaorders() {
		return this.historicaorders;
	}

	public void setHistoricaorders(Historicaorders historicaorders) {
		this.historicaorders = historicaorders;
	}

	@Column(name = "ORDERNUMBER", nullable = false, precision = 5, scale = 0)
	public Integer getOrdernumber() {
		return this.ordernumber;
	}

	public void setOrdernumber(Integer ordernumber) {
		this.ordernumber = ordernumber;
	}

}