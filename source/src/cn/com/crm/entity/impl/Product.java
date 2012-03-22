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
 * 产品类 entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "PRODUCT")
public class Product implements IEntity{

	// Fields

	private Integer productid;     //产品ID
	private String productname;    //产品名称
	private String type;           //产品型号
	private String levebatch;      //等级/批次
	private String unit;           //单位
	private Double singleprice;    //单价
	private String remark;         //备注
	private Set<Orderdetail> orderdetails = new HashSet<Orderdetail>(0);  //历史订单明细

	// Constructors

	/** default constructor */
	public Product() {
	}

	/** minimal constructor */
	public Product(Integer productid, String productname, String type,
			String levebatch, String unit, Double singleprice) {
		this.productid = productid;
		this.productname = productname;
		this.type = type;
		this.levebatch = levebatch;
		this.unit = unit;
		this.singleprice = singleprice;
	}

	/** full constructor */
	public Product(Integer productid, String productname, String type,
			String levebatch, String unit, Double singleprice, String remark,
			Set<Orderdetail> orderdetails) {
		this.productid = productid;
		this.productname = productname;
		this.type = type;
		this.levebatch = levebatch;
		this.unit = unit;
		this.singleprice = singleprice;
		this.remark = remark;
		this.orderdetails = orderdetails;
	}

	// Property accessors
	@Id
	@Column(name = "PRODUCTID", unique = true, nullable = false, precision = 5, scale = 0)
	public Integer getProductid() {
		return this.productid;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
	}

	@Column(name = "PRODUCTNAME", nullable = false, length = 50)
	public String getProductname() {
		return this.productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	@Column(name = "TYPE", nullable = false, length = 50)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "LEVEBATCH", nullable = false, length = 50)
	public String getLevebatch() {
		return this.levebatch;
	}

	public void setLevebatch(String levebatch) {
		this.levebatch = levebatch;
	}

	@Column(name = "UNIT", nullable = false, length = 50)
	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Column(name = "SINGLEPRICE", nullable = false, precision = 5)
	public Double getSingleprice() {
		return this.singleprice;
	}

	public void setSingleprice(Double singleprice) {
		this.singleprice = singleprice;
	}

	@Column(name = "REMARK", length = 100)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "product")
	public Set<Orderdetail> getOrderdetails() {
		return this.orderdetails;
	}

	public void setOrderdetails(Set<Orderdetail> orderdetails) {
		this.orderdetails = orderdetails;
	}

}