CREATE TABLE area
(
	areaid    NUMBER(5) NOT NULL,    --  地区id 
	areaname  VARCHAR2(50) NOT NULL    --  地区名称 
)
;

COMMENT ON TABLE area IS '地区表'
;
COMMENT ON COLUMN area.areaid    IS '地区id'
;
COMMENT ON COLUMN area.areaname  IS '地区名称'
;

CREATE TABLE customer
(
	cusid              NUMBER(5) NOT NULL,    --  客户ID 
	areaid             NUMBER(5) NOT NULL,    --  地区编号 
	gradeid            NUMBER(5) NOT NULL,    --  等级编号 
	cusname            VARCHAR2(100) NOT NULL,    --  客户名称 
	cusnumber          VARCHAR2(50) NOT NULL,    --  客户编号 
	cusaddress         VARCHAR2(100),    --  地址 
	cusmanager         VARCHAR2(50),    --  负责人 
	cuspostalcode      VARCHAR2(50),    --  邮政编码 
	custelephone       VARCHAR2(11),    --  电话 
	cusurl             VARCHAR2(50),    --  网站 
	cusfacsimile       VARCHAR2(50),    --  传真 
	cusregisternumber  VARCHAR2(50),    --  营业执照注册号 
	cuslegalperson     VARCHAR2(50),    --  法人 
	cusregistermoney   NUMBER(8,2),    --  注册基金（万元） 
	cusrmb             NUMBER(8,2),    --  年营业额 
	cusopeningbank     VARCHAR2(50),    --  开户银行 
	cusbankaccount     VARCHAR2(50),    --  银行账户 
	cuscrownrent       VARCHAR2(50),    --  地税登记号 
	cusstatetaxes      VARCHAR2(50),    --  国税登记号 
	credibilityid      NUMBER(5),    --  客户信誉度编号 
	satisfactionid     NUMBER(5),    --  客户满意度编号 
	custstatusid       NUMBER(5)    --  客户状态编号 
)
;

COMMENT ON TABLE customer IS '客户信息表'
;
COMMENT ON COLUMN customer.cusid              IS '客户ID'
;
COMMENT ON COLUMN customer.areaid             IS '地区编号'
;
COMMENT ON COLUMN customer.gradeid            IS '等级编号'
;
COMMENT ON COLUMN customer.cusname            IS '客户名称'
;
COMMENT ON COLUMN customer.cusnumber          IS '客户编号'
;
COMMENT ON COLUMN customer.cusaddress         IS '地址'
;
COMMENT ON COLUMN customer.cusmanager         IS '负责人'
;
COMMENT ON COLUMN customer.cuspostalcode      IS '邮政编码'
;
COMMENT ON COLUMN customer.custelephone       IS '电话'
;
COMMENT ON COLUMN customer.cusurl             IS '网站'
;
COMMENT ON COLUMN customer.cusfacsimile       IS '传真'
;
COMMENT ON COLUMN customer.cusregisternumber  IS '营业执照注册号'
;
COMMENT ON COLUMN customer.cuslegalperson     IS '法人'
;
COMMENT ON COLUMN customer.cusregistermoney   IS '注册基金（万元）'
;
COMMENT ON COLUMN customer.cusrmb             IS '年营业额'
;
COMMENT ON COLUMN customer.cusopeningbank     IS '开户银行'
;
COMMENT ON COLUMN customer.cusbankaccount     IS '银行账户'
;
COMMENT ON COLUMN customer.cuscrownrent       IS '地税登记号'
;
COMMENT ON COLUMN customer.cusstatetaxes      IS '国税登记号'
;
COMMENT ON COLUMN customer.credibilityid      IS '客户信誉度编号'
;
COMMENT ON COLUMN customer.satisfactionid     IS '客户满意度编号'
;
COMMENT ON COLUMN customer.custstatusid       IS '客户状态编号'
;

CREATE TABLE customerloss
(
	lossid         NUMBER(5) NOT NULL,    --  流失ID 
	custid         NUMBER(5) NOT NULL,    --  客户编号 
	lastordertime  DATE NOT NULL,    --  上次下单时间 
	losstime       DATE DEFAULT sysdate NOT NULL,    --  确认流失时间 
	losscause      VARCHAR2(100),    --  流失原因 
	losssteps      VARCHAR2(100),    --  暂缓措施 
	lossnextsteps  VARCHAR2(100) NOT NULL,    --  追加暂缓措施 
	lossstatus     NUMBER(1) DEFAULT 1 NOT NULL    --  流失状态 
)
;

COMMENT ON TABLE customerloss IS '客户流失表'
;
COMMENT ON COLUMN customerloss.lossid         IS '流失ID'
;
COMMENT ON COLUMN customerloss.custid         IS '客户编号'
;
COMMENT ON COLUMN customerloss.lastordertime  IS '上次下单时间'
;
COMMENT ON COLUMN customerloss.losstime       IS '确认流失时间'
;
COMMENT ON COLUMN customerloss.losscause      IS '流失原因'
;
COMMENT ON COLUMN customerloss.losssteps      IS '暂缓措施'
;
COMMENT ON COLUMN customerloss.lossnextsteps  IS '追加暂缓措施'
;
COMMENT ON COLUMN customerloss.lossstatus     IS '流失状态'
;

CREATE TABLE grade
(
	gradeid    NUMBER(5) NOT NULL,    --  等级id 
	gradename  VARCHAR2(50) NOT NULL    --  等级名称 
)
;

COMMENT ON TABLE grade IS '客户等级表'
;
COMMENT ON COLUMN grade.gradeid    IS '等级id'
;
COMMENT ON COLUMN grade.gradename  IS '等级名称'
;

CREATE TABLE historicaorders
(
	orderid          NUMBER(5) NOT NULL,    --  订单ID 
	ordertime        DATE DEFAULT sysdate NOT NULL,    --  下单时间 
	orderaddress     VARCHAR2(50),    --  送货地址 
	orderstatus      NUMBER(1) DEFAULT 0 NOT NULL,    --  订单状态 
	custid           NUMBER(5) NOT NULL,    --  客户编号 
	ordertotalPrice  NUMBER(8,2) NOT NULL    --  总金额 
)
;

COMMENT ON TABLE historicaorders IS '历史订单表'
;
COMMENT ON COLUMN historicaorders.orderid          IS '订单ID'
;
COMMENT ON COLUMN historicaorders.ordertime        IS '下单时间'
;
COMMENT ON COLUMN historicaorders.orderaddress     IS '送货地址'
;
COMMENT ON COLUMN historicaorders.orderstatus      IS '订单状态'
;
COMMENT ON COLUMN historicaorders.custid           IS '客户编号'
;
COMMENT ON COLUMN historicaorders.ordertotalPrice  IS '总金额'
;

CREATE TABLE intercourse
(
	intercourseid      NUMBER(5) NOT NULL,    --  交往记录ID 
	custid             NUMBER(5) NOT NULL,    --  客户ID 
	intercoursedate    DATE DEFAULT sysdate NOT NULL,    --  记录时间 
	intercourseplace   VARCHAR2(50),    --  地点 
	intercourseresume  VARCHAR2(100),    --  概要 
	intercoursedetail  VARCHAR2(100),    --  详细信息 
	intercourseremark  VARCHAR2(100)    --  备注 
)
;

COMMENT ON TABLE intercourse IS '交往记录表'
;
COMMENT ON COLUMN intercourse.intercourseid      IS '交往记录ID'
;
COMMENT ON COLUMN intercourse.custid             IS '客户ID'
;
COMMENT ON COLUMN intercourse.intercoursedate    IS '记录时间'
;
COMMENT ON COLUMN intercourse.intercourseplace   IS '地点'
;
COMMENT ON COLUMN intercourse.intercourseresume  IS '概要'
;
COMMENT ON COLUMN intercourse.intercoursedetail  IS '详细信息'
;
COMMENT ON COLUMN intercourse.intercourseremark  IS '备注'
;

CREATE TABLE linkman
(
	linkid         NUMBER(5) NOT NULL,    --  联系人id 
	custid         NUMBER(5) NOT NULL,    --  客户编号 
	linkname       VARCHAR2(50),    --  联系人姓名 
	linkgender     NUMBER(1) DEFAULT 1 NOT NULL,    --  联系人性别 
	linkpost       VARCHAR2(50),    --  联系人职位 
	linktelephone  VARCHAR2(11),    --  联系人办公电话 
	linkmobile     VARCHAR2(11),    --  联系人手机 
	linkremark     VARCHAR2(50)    --  备注 
)
;

COMMENT ON TABLE linkman IS '客户联系人表'
;
COMMENT ON COLUMN linkman.linkid         IS '联系人id'
;
COMMENT ON COLUMN linkman.custid         IS '客户编号'
;
COMMENT ON COLUMN linkman.linkname       IS '联系人姓名'
;
COMMENT ON COLUMN linkman.linkgender     IS '联系人性别'
;
COMMENT ON COLUMN linkman.linkpost       IS '联系人职位'
;
COMMENT ON COLUMN linkman.linktelephone  IS '联系人办公电话'
;
COMMENT ON COLUMN linkman.linkmobile     IS '联系人手机'
;
COMMENT ON COLUMN linkman.linkremark     IS '备注'
;

CREATE TABLE orderdetail
(
	detailid   NUMBER(5) NOT NULL,    --  明细ID 
	orderid    NUMBER(5) NOT NULL,    --  订单编号 
	productid  NUMBER(5) NOT NULL,    --  产品编号 
	number     NUMBER(5) NOT NULL    --  数量 
)
;

COMMENT ON TABLE orderdetail IS '历史订单明细表'
;
COMMENT ON COLUMN orderdetail.detailid   IS '明细ID'
;
COMMENT ON COLUMN orderdetail.orderid    IS '订单编号'
;
COMMENT ON COLUMN orderdetail.productid  IS '产品编号'
;
COMMENT ON COLUMN orderdetail.number     IS '数量'
;

CREATE TABLE orderstatus
(
	statusid    NUMBER(5) NOT NULL,    --  订单状态ID 
	statusname  VARCHAR2(50) NOT NULL    --  订单状态名称 
)
;

COMMENT ON TABLE orderstatus IS '订单状态表'
;
COMMENT ON COLUMN orderstatus.statusid    IS '订单状态ID'
;
COMMENT ON COLUMN orderstatus.statusname  IS '订单状态名称'
;

CREATE TABLE product
(
	productid    NUMBER(5) NOT NULL,    --  产品ID 
	productname  VARCHAR2(50) NOT NULL,    --  产品名称 
	type         VARCHAR2(50) NOT NULL,    --  产品型号 
	LeveBatch    VARCHAR2(50) NOT NULL,    --  等级/批次 
	unit         VARCHAR2(50) NOT NULL,    --  单位 
	singleprice  NUMBER(5,2) NOT NULL,    --  单价 
	Remark       VARCHAR2(100)    --  备注 
)
;

COMMENT ON COLUMN product.productid    IS '产品ID'
;
COMMENT ON COLUMN product.productname  IS '产品名称'
;
COMMENT ON COLUMN product.type         IS '产品型号'
;
COMMENT ON COLUMN product.LeveBatch    IS '等级/批次'
;
COMMENT ON COLUMN product.unit         IS '单位'
;
COMMENT ON COLUMN product.singleprice  IS '单价'
;
COMMENT ON COLUMN product.Remark       IS '备注'
;

CREATE TABLE satiscredibility
(
	satisid    NUMBER(5) NOT NULL,    --  客户信誉/满意度ID 
	satisname  VARCHAR2(50) NOT NULL    --  客户信誉/满意度 
)
;

COMMENT ON TABLE satiscredibility IS '客户满意/信誉度表'
;
COMMENT ON COLUMN satiscredibility.satisid    IS '客户信誉/满意度ID'
;
COMMENT ON COLUMN satiscredibility.satisname  IS '客户信誉/满意度'
;


ALTER TABLE area ADD CONSTRAINT PK_area 
	PRIMARY KEY (areaid) 
 USING INDEX 
;

ALTER TABLE customer ADD CONSTRAINT PK_customer 
	PRIMARY KEY (cusid) 
 USING INDEX 
;

ALTER TABLE customerloss ADD CONSTRAINT PK_customerloss 
	PRIMARY KEY (lossid) 
 USING INDEX 
;

ALTER TABLE grade ADD CONSTRAINT PK_grade 
	PRIMARY KEY (gradeid) 
 USING INDEX 
;

ALTER TABLE historicaorders ADD CONSTRAINT PK_historicaorders 
	PRIMARY KEY (orderid) 
 USING INDEX 
;

ALTER TABLE intercourse ADD CONSTRAINT PK_intercourse 
	PRIMARY KEY (intercourseid) 
 USING INDEX 
;

ALTER TABLE linkman ADD CONSTRAINT PK_linkman 
	PRIMARY KEY (linkid) 
 USING INDEX 
;

ALTER TABLE orderdetail ADD CONSTRAINT PK_orderdetail 
	PRIMARY KEY (detailid) 
 USING INDEX 
;

ALTER TABLE orderstatus ADD CONSTRAINT PK_ordersatrus 
	PRIMARY KEY (statusid) 
 USING INDEX 
;

ALTER TABLE product ADD CONSTRAINT PK_product 
	PRIMARY KEY (productid) 
 USING INDEX 
;

ALTER TABLE satiscredibility ADD CONSTRAINT PK_satiscredibility 
	PRIMARY KEY (satisid) 
 USING INDEX 
;



ALTER TABLE customer ADD CONSTRAINT FK_c_a 
	FOREIGN KEY (areaid) REFERENCES area (areaid)
;

ALTER TABLE customer ADD CONSTRAINT FK_c_g 
	FOREIGN KEY (gradeid) REFERENCES grade (gradeid)
;

ALTER TABLE customer ADD CONSTRAINT FK_c_s 
	FOREIGN KEY (credibilityid, satisfactionid) REFERENCES satiscredibility (satisid)
;

ALTER TABLE customerloss ADD CONSTRAINT FK_c_c 
	FOREIGN KEY (custid) REFERENCES customer (cusid)
;

ALTER TABLE historicaorders ADD CONSTRAINT FK_h_c 
	FOREIGN KEY (custid) REFERENCES customer (cusid)
;

ALTER TABLE historicaorders ADD CONSTRAINT FK_h_o 
	FOREIGN KEY (orderstatus) REFERENCES orderstatus (statusid)
;

ALTER TABLE intercourse ADD CONSTRAINT FK_i_c 
	FOREIGN KEY (custid) REFERENCES customer (cusid)
;

ALTER TABLE linkman ADD CONSTRAINT FK_l_c 
	FOREIGN KEY (custid) REFERENCES customer (cusid)
;

ALTER TABLE orderdetail ADD CONSTRAINT FK_o_h 
	FOREIGN KEY (orderid) REFERENCES historicaorders (orderid)
;

ALTER TABLE orderdetail ADD CONSTRAINT FK_o_p 
	FOREIGN KEY (productid) REFERENCES product (productid)
;
