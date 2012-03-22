package cn.com.crm.entity.impl;

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

import cn.com.crm.entity.IEntity;

/**
 * 客户类 entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "CUSTOMER")
public class Customer implements IEntity {

	// Fields

	private Integer cusid;    //客户ID
	private Satiscredibility credibilityid;   //客户信誉度
	private Satiscredibility satisfactionid;  //客户满意度
	private Area area;               //客户地区
	private Grade grade;             //客户等级
	private String cusname;          //客户名称
	private String cusnumber;        //客户编号
	private String cusaddress;       //地址
	private String cusmanager;       //负责人
	private String cuspostalcode;    //邮政编码
	private String custelephone;     //电话
	private String cusurl;           //网站
	private String cusfacsimile;     //传真
	private String cusregisternumber;//营业执照注册号
	private String cuslegalperson;   //法人
	private Double cusregistermoney; //注册基金（万元）
	private Double cusrmb;           //年营业额
	private String cusopeningbank;   //开户银行
	private String cusbankaccount;   //银行账户
	private String cuscrownrent;     //地税登记号
	private String cusstatetaxes;    //国税登记号
	private Integer custstatusid;    //客户状态
	private Set<Historicaorders> historicaorderses = new HashSet<Historicaorders>(
			0);                      //历史订单
	private Set<Linkman> linkmans = new HashSet<Linkman>(0);   //联系人
	private Set<Intercourse> intercourses = new HashSet<Intercourse>(0);  //交往记录
	private Set<Customerloss> customerlosses = new HashSet<Customerloss>(0);  //流失客户

	// Constructors

	/** default constructor */
	public Customer() {
	}

	/** minimal constructor */
	public Customer(Integer cusid, Area area, Grade grade, String cusname,
			String cusnumber) {
		this.cusid = cusid;
		this.area = area;
		this.grade = grade;
		this.cusname = cusname;
		this.cusnumber = cusnumber;
	}

	/** full constructor */
	public Customer(Integer cusid,
			Satiscredibility credibilityid,
			Satiscredibility satisfactionid, Area area,
			Grade grade, String cusname, String cusnumber, String cusaddress,
			String cusmanager, String cuspostalcode, String custelephone,
			String cusurl, String cusfacsimile, String cusregisternumber,
			String cuslegalperson, Double cusregistermoney, Double cusrmb,
			String cusopeningbank, String cusbankaccount, String cuscrownrent,
			String cusstatetaxes, Integer custstatusid,
			Set<Historicaorders> historicaorderses, Set<Linkman> linkmans,
			Set<Intercourse> intercourses, Set<Customerloss> customerlosses) {
		this.cusid = cusid;
		this.credibilityid = credibilityid;
		this.satisfactionid = satisfactionid;
		this.area = area;
		this.grade = grade;
		this.cusname = cusname;
		this.cusnumber = cusnumber;
		this.cusaddress = cusaddress;
		this.cusmanager = cusmanager;
		this.cuspostalcode = cuspostalcode;
		this.custelephone = custelephone;
		this.cusurl = cusurl;
		this.cusfacsimile = cusfacsimile;
		this.cusregisternumber = cusregisternumber;
		this.cuslegalperson = cuslegalperson;
		this.cusregistermoney = cusregistermoney;
		this.cusrmb = cusrmb;
		this.cusopeningbank = cusopeningbank;
		this.cusbankaccount = cusbankaccount;
		this.cuscrownrent = cuscrownrent;
		this.cusstatetaxes = cusstatetaxes;
		this.custstatusid = custstatusid;
		this.historicaorderses = historicaorderses;
		this.linkmans = linkmans;
		this.intercourses = intercourses;
		this.customerlosses = customerlosses;
	}

	// Property accessors
	@Id
	@Column(name = "CUSID", unique = true, nullable = false, precision = 5, scale = 0)
	public Integer getCusid() {
		return this.cusid;
	}

	public void setCusid(Integer cusid) {
		this.cusid = cusid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CREDIBILITYID")
	public Satiscredibility getCredibilityid() {
		return this.credibilityid;
	}

	public void setCredibilityid(
			Satiscredibility credibilityid) {
		this.credibilityid = credibilityid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SATISFACTIONID")
	public Satiscredibility getSatisfactionid() {
		return this.satisfactionid;
	}

	public void setSatisfactionid(
			Satiscredibility satisfactionid) {
		this.satisfactionid = satisfactionid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AREAID", nullable = false)
	public Area getArea() {
		return this.area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "GRADEID", nullable = false)
	public Grade getGrade() {
		return this.grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	@Column(name = "CUSNAME", nullable = false, length = 100)
	public String getCusname() {
		return this.cusname;
	}

	public void setCusname(String cusname) {
		this.cusname = cusname;
	}

	@Column(name = "CUSNUMBER", nullable = false, length = 50)
	public String getCusnumber() {
		return this.cusnumber;
	}

	public void setCusnumber(String cusnumber) {
		this.cusnumber = cusnumber;
	}

	@Column(name = "CUSADDRESS", length = 100)
	public String getCusaddress() {
		return this.cusaddress;
	}

	public void setCusaddress(String cusaddress) {
		this.cusaddress = cusaddress;
	}

	@Column(name = "CUSMANAGER", length = 50)
	public String getCusmanager() {
		return this.cusmanager;
	}

	public void setCusmanager(String cusmanager) {
		this.cusmanager = cusmanager;
	}

	@Column(name = "CUSPOSTALCODE", length = 50)
	public String getCuspostalcode() {
		return this.cuspostalcode;
	}

	public void setCuspostalcode(String cuspostalcode) {
		this.cuspostalcode = cuspostalcode;
	}

	@Column(name = "CUSTELEPHONE", length = 11)
	public String getCustelephone() {
		return this.custelephone;
	}

	public void setCustelephone(String custelephone) {
		this.custelephone = custelephone;
	}

	@Column(name = "CUSURL", length = 50)
	public String getCusurl() {
		return this.cusurl;
	}

	public void setCusurl(String cusurl) {
		this.cusurl = cusurl;
	}

	@Column(name = "CUSFACSIMILE", length = 50)
	public String getCusfacsimile() {
		return this.cusfacsimile;
	}

	public void setCusfacsimile(String cusfacsimile) {
		this.cusfacsimile = cusfacsimile;
	}

	@Column(name = "CUSREGISTERNUMBER", length = 50)
	public String getCusregisternumber() {
		return this.cusregisternumber;
	}

	public void setCusregisternumber(String cusregisternumber) {
		this.cusregisternumber = cusregisternumber;
	}

	@Column(name = "CUSLEGALPERSON", length = 50)
	public String getCuslegalperson() {
		return this.cuslegalperson;
	}

	public void setCuslegalperson(String cuslegalperson) {
		this.cuslegalperson = cuslegalperson;
	}

	@Column(name = "CUSREGISTERMONEY", precision = 8)
	public Double getCusregistermoney() {
		return this.cusregistermoney;
	}

	public void setCusregistermoney(Double cusregistermoney) {
		this.cusregistermoney = cusregistermoney;
	}

	@Column(name = "CUSRMB", precision = 8)
	public Double getCusrmb() {
		return this.cusrmb;
	}

	public void setCusrmb(Double cusrmb) {
		this.cusrmb = cusrmb;
	}

	@Column(name = "CUSOPENINGBANK", length = 50)
	public String getCusopeningbank() {
		return this.cusopeningbank;
	}

	public void setCusopeningbank(String cusopeningbank) {
		this.cusopeningbank = cusopeningbank;
	}

	@Column(name = "CUSBANKACCOUNT", length = 50)
	public String getCusbankaccount() {
		return this.cusbankaccount;
	}

	public void setCusbankaccount(String cusbankaccount) {
		this.cusbankaccount = cusbankaccount;
	}

	@Column(name = "CUSCROWNRENT", length = 50)
	public String getCuscrownrent() {
		return this.cuscrownrent;
	}

	public void setCuscrownrent(String cuscrownrent) {
		this.cuscrownrent = cuscrownrent;
	}

	@Column(name = "CUSSTATETAXES", length = 50)
	public String getCusstatetaxes() {
		return this.cusstatetaxes;
	}

	public void setCusstatetaxes(String cusstatetaxes) {
		this.cusstatetaxes = cusstatetaxes;
	}

	@Column(name = "CUSTSTATUSID", precision = 5, scale = 0)
	public Integer getCuststatusid() {
		return this.custstatusid;
	}

	public void setCuststatusid(Integer custstatusid) {
		this.custstatusid = custstatusid;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")
	public Set<Historicaorders> getHistoricaorderses() {
		return this.historicaorderses;
	}

	public void setHistoricaorderses(Set<Historicaorders> historicaorderses) {
		this.historicaorderses = historicaorderses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")
	public Set<Linkman> getLinkmans() {
		return this.linkmans;
	}

	public void setLinkmans(Set<Linkman> linkmans) {
		this.linkmans = linkmans;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")
	public Set<Intercourse> getIntercourses() {
		return this.intercourses;
	}

	public void setIntercourses(Set<Intercourse> intercourses) {
		this.intercourses = intercourses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")
	public Set<Customerloss> getCustomerlosses() {
		return this.customerlosses;
	}

	public void setCustomerlosses(Set<Customerloss> customerlosses) {
		this.customerlosses = customerlosses;
	}

}