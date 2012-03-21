package cn.com.crm.dao;

import java.util.List;


/**
 * Dao通用接口
 * @author ping
 */
public interface IDao<T> {
	/**
	 * 根据id查询
	 * @param entityName 查询的实体名
	 * @param id 
	 * @param ifLazy true用load,false用get,不传值默认为false
	 * @return
	 * @throws Exception
	 */
	public T queryById(String entityName,String id,boolean... ifLazy) throws Exception;
	/**
	 * 示例查询
	 * @param t
	 * @return
	 * @throws Exception
	 */
	public List<T> queryByExample(T t) throws Exception;
	/**
	 * hql查询
	 * @param hql 
	 * @param o  参数数组
	 * @return
	 * @throws Exception
	 */
    public List<T> queryByHql(String hql,Object... o) throws Exception;
    /**
	 * 返回list<T>
	 * @param t
	 * @return
	 * @throws Exception
	 */
	public List<T> queryList(final String hql,final String entityName) throws Exception;
    /**
     * 添加方法
     * @param t 添加的对象
     * @throws Exception
     */
    public void add(T t) throws Exception;
    /**
     * 更新方法
     * @param t  更新的对象
     * @throws Exception
     */
    public void update(T t) throws Exception;
    /**
     * 局部更新的方法
     * @param hql
     * @param o 参数数组
     */
    public void update(String hql,Object... o);
    /**
     * 删除对象
     * @param t 删除的对象
     * @throws Exception
     */
    public void delete(T t) throws Exception;  
}
