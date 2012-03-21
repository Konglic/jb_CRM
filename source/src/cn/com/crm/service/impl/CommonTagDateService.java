package cn.com.crm.service.impl;

import java.util.List;
import org.springframework.stereotype.Component;

import cn.com.crm.entity.impl.TagDate;
import cn.com.crm.service.ServiceSimpleImpl;

/**
 * 通用的获取页面初始化数据
 * @author ping
 *
 */
@Component(value="commonTagDateService")
public class CommonTagDateService extends ServiceSimpleImpl<TagDate> {

	@Override
	public List<TagDate> queryList(TagDate t) throws Exception {   
		StringBuffer hql = new StringBuffer();  //hql语句
		if(t.getFields() != null){
			hql.append("select "+t.getFields());
		}
		hql.append(" from "+ t.getEntityName());
		if(t.getWhere() != null){
			hql.append(" where "+t.getWhere());
		}
		return super.iDao.queryList(hql.toString(),"TagDate");
	}
   

}
