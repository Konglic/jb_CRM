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
 * 联系人类 entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "LINKMAN")
public class Linkman implements IEntity {

	// Fields

	private Integer linkid;        //联系人id
	private Customer customer;     //客户
	private String linkname;       //联系人姓名
	private Boolean linkgender;    //联系人性别
	private String linkpost;       //联系人职位
	private String linktelephone;  //联系人办公电话
	private String linkmobile;     //联系人手机
	private String linkremark;     //备注

	// Constructors

	/** default constructor */
	public Linkman() {
	}

	/** minimal constructor */
	public Linkman(Integer linkid, Customer customer, Boolean linkgender) {
		this.linkid = linkid;
		this.customer = customer;
		this.linkgender = linkgender;
	}

	/** full constructor */
	public Linkman(Integer linkid, Customer customer, String linkname,
			Boolean linkgender, String linkpost, String linktelephone,
			String linkmobile, String linkremark) {
		this.linkid = linkid;
		this.customer = customer;
		this.linkname = linkname;
		this.linkgender = linkgender;
		this.linkpost = linkpost;
		this.linktelephone = linktelephone;
		this.linkmobile = linkmobile;
		this.linkremark = linkremark;
	}

	// Property accessors
	@Id
	@Column(name = "LINKID", unique = true, nullable = false, precision = 5, scale = 0)
	public Integer getLinkid() {
		return this.linkid;
	}

	public void setLinkid(Integer linkid) {
		this.linkid = linkid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CUSTID", nullable = false)
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Column(name = "LINKNAME", length = 50)
	public String getLinkname() {
		return this.linkname;
	}

	public void setLinkname(String linkname) {
		this.linkname = linkname;
	}

	@Column(name = "LINKGENDER", nullable = false, precision = 1, scale = 0)
	public Boolean getLinkgender() {
		return this.linkgender;
	}

	public void setLinkgender(Boolean linkgender) {
		this.linkgender = linkgender;
	}

	@Column(name = "LINKPOST", length = 50)
	public String getLinkpost() {
		return this.linkpost;
	}

	public void setLinkpost(String linkpost) {
		this.linkpost = linkpost;
	}

	@Column(name = "LINKTELEPHONE", length = 11)
	public String getLinktelephone() {
		return this.linktelephone;
	}

	public void setLinktelephone(String linktelephone) {
		this.linktelephone = linktelephone;
	}

	@Column(name = "LINKMOBILE", length = 11)
	public String getLinkmobile() {
		return this.linkmobile;
	}

	public void setLinkmobile(String linkmobile) {
		this.linkmobile = linkmobile;
	}

	@Column(name = "LINKREMARK", length = 50)
	public String getLinkremark() {
		return this.linkremark;
	}

	public void setLinkremark(String linkremark) {
		this.linkremark = linkremark;
	}

}