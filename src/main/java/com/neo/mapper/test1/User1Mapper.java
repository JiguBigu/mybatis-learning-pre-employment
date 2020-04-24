package com.neo.mapper.test1;

import com.neo.model.User;

import java.util.List;
/**
 * @author Jigubigu
 * @version 1.0
 * @date 2019/9/25 17:33
 */
public interface User1Mapper {

	/**
	 * 获取所有学生
	 * @return 学生列表
	 */
	List<User> getAll();

	/**
	 * 查询单个学生
	 * @param id 学号
	 * @return 单个学生信息
	 */
	User getOne(Long id);

	/**
	 * 插入学生
	 * @param user 学生实体类
	 */
	void insert(User user);

	/**
	 * 更新学生信息
	 * @param user 学生实体类
	 */
	void update(User user);

	/**
	 * 删除帘
	 * @param id 学号
	 */
	void delete(Long id);

}