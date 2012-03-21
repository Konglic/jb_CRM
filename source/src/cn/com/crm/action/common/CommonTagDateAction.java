package cn.com.crm.action.common;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import cn.com.crm.entity.impl.TagDate;
import cn.com.crm.service.Iservice;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


/**
 * 通用的action
 * @author ping
 */
@Namespace("/common")
@ParentPackage("json-default")
@Result(type="json",name="success")
public class CommonTagDateAction extends ActionSupport implements ModelDriven<TagDate> {
	private static final long serialVersionUID = 1L;
	
	private Iservice<TagDate> iservice;  //CommonTagDateService类的对象
	private TagDate tagDate = new TagDate();  //上传参数
	private List<TagDate> list;   //返回的数据
	  
	public List<TagDate> getList() {
		return list;
	}
	public void setList(List<TagDate> list) {
		this.list = list;
	}
	public TagDate getModel() {
		return tagDate;
	}
	
	public Iservice<TagDate> getIservice() {
		return iservice;
	}
	@Resource(name="commonTagDateService")
	public void setIservice(Iservice<TagDate> iservice) {
		this.iservice = iservice;
	}
	/**
	 * 获取页面各标签的初始值
	 */
    @Override
	public String execute() throws Exception{
			list = iservice.queryList(tagDate);
			return SUCCESS;
	}
}
