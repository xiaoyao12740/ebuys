package cn.ebuy.service;

import java.util.List;

public interface BaseService<T> {
    /**
     * 根据id查询数据
     *
     * @param id
     * @return
     */
    public T queryById(Long id);

    /**
     * 查询所有数据
     *
     * @return
     */
    public List<T> queryAll();

    /**
     * 根据条件查询数据条数
     *
     * @param t
     * @return
     */
    public int queryCountByWhere(T t);

    /**
     * 根据条件查询数据结果集
     *
     * @param t
     * @return
     */
    public List<T> queryListByWhere(T t);

    /**
     * 分页查询数据
     *
     * @param page
     *            当前页码数
     * @param rows
     *            每页数据条数
     * @return
     */
    public List<T> queryByPage(Integer page, Integer rows);

    /**
     * 根据条件查询一条数据
     *
     * @param t
     * @return
     */
    public T queryOne(T t);

    /**
     * 新增
     *
     * @param t
     */
    public void save(T t);

    /**
     * 根据id更新数据，不忽略空参数，如果实体的属性没有值，也会进行更新，只是更新为null
     *
     * @param t
     */
    public void updateById(T t);

    /**
     * 根据id更新数据，忽略空参数，如果实体的属性没有值，不会进行更新
     *
     * @param t
     */
    public void updateByIdSelective(T t);

    /**
     * 根据id删除数据
     *
     * @param id
     */
    public void deleteById(Long id);

    /**
     * 根据多个id批量删除
     *
     * @param ids
     */
    public void deleteByIds(List<Object> ids);

}
