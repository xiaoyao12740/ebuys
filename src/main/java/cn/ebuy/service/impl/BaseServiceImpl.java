package cn.ebuy.service.impl;

import cn.ebuy.pojo.BasePojo;
import cn.ebuy.service.BaseService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;

//绝对不能加@Service注解，因为构造方法需要获取父，但是通用的Service没有父
public class BaseServiceImpl<T extends BasePojo> implements BaseService<T> {

	// Spring4的新特性：泛型注入
	@Autowired
	private Mapper<T> mapper;

	// 声明泛型的class
	private Class<T> clazz;

	// 声明无参的构造方法，在构造方法中获取泛型的class
	public BaseServiceImpl() {
		// 获取父的Type数据
		Type type = this.getClass().getGenericSuperclass();

		// 强转，才可以使用合适的方法
		ParameterizedType pType = (ParameterizedType) type;

		// 获取父类的泛型类型
		this.clazz = (Class<T>) pType.getActualTypeArguments()[0];
	}

	@Override
	public T queryById(Long id) {
		T t = this.mapper.selectByPrimaryKey(id);
		return t;
	}

	@Override
	public List<T> queryAll() {
		List<T> list = this.mapper.select(null);
		return list;
	}

	@Override
	public int queryCountByWhere(T t) {
		int count = this.mapper.selectCount(t);
		return count;
	}

	@Override
	public List<T> queryListByWhere(T t) {
		List<T> list = this.mapper.select(t);
		return list;
	}

	@Override
	public List<T> queryByPage(Integer page, Integer rows) {
		// 设置分页参数
		PageHelper.startPage(page, rows);

		// 执行查询
		List<T> list = this.mapper.select(null);

		return list;
	}

	@Override
	public T queryOne(T t) {
		T result = this.mapper.selectOne(t);
		return result;
	}

	@Override
	public void save(T t) {
		// 判断pojo是否设置了新增时间
		if (t.getCreated() == null) {
			// 如果没有设置新增时间，在这里设置新增时间，还有更新时间
			t.setCreated(new Date());
			t.setUpdated(t.getCreated());
		} else if (t.getUpdated() == null) {
			// 如果有新增时间，判断是否有更新时间，
			// 如果没有更新时间，设置更新时间
			t.setUpdated(t.getCreated());
		}

		this.mapper.insert(t);
	}

	@Override
	public void updateById(T t) {
		// 设置修改时间
		t.setUpdated(new Date());

		this.mapper.updateByPrimaryKey(t);
	}

	@Override
	public void updateByIdSelective(T t) {
		// 设置修改时间
		t.setUpdated(new Date());

		this.mapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public void deleteById(Long id) {
		this.mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void deleteByIds(List<Object> ids) {
		// 声明Example
		Example example = new Example(this.clazz);
		// 获取条件对象
		Example.Criteria criteria = example.createCriteria();

		// 设置条件，第一个参数是pojo的属性名，第二个参数是条件
		criteria.andIn("id", ids);

		// 执行批量删除
		this.mapper.deleteByExample(example);

	}

}
