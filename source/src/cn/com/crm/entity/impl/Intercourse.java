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
 * 交往记录类 entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "INTERCOURSE")
public class Intercourse implements IEntity {

	// Fields

	private Integer intercourseid;    //交往记录ID
	private Customer customer;        //客户
	private Date intercoursedate;     //记录时间
	private String intercourseplace;  //地点
	private String intercourseresume; //概要
	private String intercoursedetail; //详细信息
	private String intercourseremark; //备注

	// Constructors

	/** default constructor */
	public Intercourse() {
	}

	/** minimal constructor */
	public Intercourse(Integer intercourseid, Customer customer,
			Date intercoursedate) {
		this.intercourseid = intercourseid;
		this.customer = customer;
		this.intercoursedate = intercoursedate;
	}

	/** full constructor */
	public Intercourse(Integer intercourseid, Customer customer,
			Date intercoursedate, String intercourseplace,
			String intercourseresume, String intercoursedetail,
			String intercourseremark) {
		this.intercourseid = intercourseid;
		this.customer = customer;
		this.intercoursedate = intercoursedate;
		this.intercourseplace = intercourseplace;
		this.intercourseresume = intercourseresume;
		this.intercoursedetail = intercoursedetail;
		this.intercourseremark = intercourseremark;
	}

	// Property accessors
	@Id
	@Column(name = "INTERCOURSEID", unique = true, nullable = false, precision = 5, scale = 0)
	public Integer getIntercourseid() {
		return this.intercourseid;
	}

	public void setIntercourseid(Integer intercourseid) {
		this.intercourseid = intercourseid;
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
	@Column(name = "INTERCOURSEDATE", nullable = false, length = 7)
	public Date getIntercoursedate() {
		return this.intercoursedate;
	}

	public void setIntercoursedate(Date intercoursedate) {
		this.intercoursedate = intercoursedate;
	}

	@Column(name = "INTERCOURSEPLACE", length = 50)
	public String getIntercourseplace() {
		return this.intercourseplace;
	}

	public void setIntercourseplace(String intercourseplace) {
		this.intercourseplace = intercourseplace;
	}

	@Column(name = "INTERCOURSERESUME", length = 100)
	public String getIntercourseresume() {
		return this.intercourseresume;
	}

	public void setIntercourseresume(String intercourseresume) {
		this.intercourseresume = intercourseresume;
	}

	@Column(name = "INTERCOURSEDETAIL", length = 100)
	public String getIntercoursedetail() {
		return this.intercoursedetail;
	}

	public void setIntercoursedetail(String intercoursedetail) {
		this.intercoursedetail = intercoursedetail;
	}

	@Column(name = "INTERCOURSEREMARK", length = 100)
	public String getIntercourseremark() {
		return this.intercourseremark;
	}

	public void setIntercourseremark(String intercourseremark) {
		this.intercourseremark = intercourseremark;
	}

}