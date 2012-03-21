package cn.com.crm.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import cn.com.crm.dao.IDao;

/**
 * dao类的实现类
 * @author ping
 * @param <T>
 */
@Repository(value="iDao")
public class DaoImpl<T> implements IDao<T> {
    @Autowired
	private HibernateTemplate hibernateTemplate;
    /**
	 * 根据id查询
	 * @param entityName 查询的实体名
	 * @param id 
	 * @param ifLazy true用load,false用get,不传值默认为false
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public T queryById(String entityName,String id, boolean... ifLazy) throws Exception {
		// TODO Auto-generated method stub
		boolean iflazy = false;
		if(ifLazy.length > 0)
			iflazy = ifLazy[0];
		if(iflazy){
			return (T)hibernateTemplate.load(entityName.getClass(), id);
		}else{
			return (T)hibernateTemplate.get(entityName.getClass(), id);
		}
	}
	/**
	 * 示例查询
	 * @param t
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<T> queryByExample(T t) throws Exception {
		// TODO Auto-generated method stub
		return hibernateTemplate.findByExample(t);
	}
	/**
	 * hql查询
	 * @param hql 
	 * @param o  参数数组
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<T> queryByHql(String hql, Object... o) throws Exception {
		// TODO Auto-generated method stub
		return hibernateTemplate.find(hql, o);
	}
	/**
     * 添加方法
     * @param t 添加的对象
     * @throws Exception
     */
	public void add(T t) throws Exception {
		hibernateTemplate.save(t);
	}
	/**
     * 更新方法
     * @param t  更新的对象
     * @throws Exception
     */
	public void update(T t) throws Exception {
		// TODO Auto-generated method stub
		hibernateTemplate.update(t);
	}
	/**
     * 局部更新的方法
     * @param hql
     * @param o 参数数组,不传值也可以
     */
	public void update(final String hql,final Object... o) {
		// TODO Auto-generated method stub
		hibernateTemplate.execute(new HibernateCallback() {		
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				// TODO Auto-generated method stub
				Query query = session.createQuery(hql);
				for(int i = 0;i < o.length;i++){
				   query.setParameter(i, o[i]);
				}
				query.executeUpdate();
				return null;
			}
		});
	}
	/**
     * 删除对象
     * @param t 删除的对象
     * @throws Exception
     */
	public void delete(T t) throws Exception {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(t);
	}
	/**
	 * 返回list<T>
	 * @param t
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<T> queryList(final String hql,final String entityName) throws Exception {
		// TODO Auto-generated method stub
		return (List<T>) hibernateTemplate.execute(new HibernateCallback(){
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				return session.createQuery(hql).setResultTransformer(Transformers.aliasToBean(entityName.getClass())).list();
			}			
		});		
	}

}
