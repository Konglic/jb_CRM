package cn.com.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import cn.com.crm.dao.IDao;

/**
 * Iservice的简单实现
 * @author ping
 */
public  abstract class ServiceSimpleImpl<T> implements Iservice<T>{
	@Autowired
    protected IDao<T> iDao;  //dao类的对象

	public T queryById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
		

	public String add(T t) throws Exception {
		iDao.add(t);
		return null;
	}

	public void delete(T t) throws Exception {
		// TODO Auto-generated method stub
		iDao.delete(t);
	}

	public List<T> queryList(T t) throws Exception {
		// TODO Auto-generated method stub
		return iDao.queryByExample(t);
	}

	public T queryBy(T t) throws Exception {
		// TODO Auto-generated method stub
		return iDao.queryByExample(t).get(0);
	}

	public void update(T t) throws Exception {
		// TODO Auto-generated method stub
		iDao.update(t);
	}

}
