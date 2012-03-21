package cn.com.crm.service;

import java.util.List;



/**
 * 通用service接口
 * @author ping
 */
public interface Iservice<T>  {
	/**
	 * 根据对象查询单个对象
	 * @param t
	 * @return
	 * @throws Exception
	 */
	public T queryBy(T t) throws Exception;
	/**
	 * 根据ID查询单个对象
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public T queryById(String id) throws Exception;
	/**
	 * 查询多个对象
	 * @param t
	 * @return
	 * @throws Exception
	 */
    public List<T> queryList(T t) throws Exception;
    /**
     * 添加方法
     * @param t
     * @return 添加的对象ID
     * @throws Exception
     */
    public String add(T t) throws Exception;
    /**
     * 修改方法
     * @param t
     * @throws Exception
     */
    public void update(T t) throws Exception;
    /**
     * 删除方法
     * @param t
     * @throws Exception
     */
    public void delete(T t) throws Exception;   
}
