package com.twomonkey.goodstudy.dao;

import java.util.List;

import com.twomonkey.goodstudy.entity.User;
import org.apache.ibatis.session.RowBounds;

/**
* User Mapper
* Created by CoderMaker on 2017/03/06.
*/
public interface UserMapper {

	/**
	 * 根据实体类条件查询数据(分页)
     * Querying data based on entity class conditions.(pagination)
	 * @param user
     * @return Data mapping entity list
	 */
	List<User> queryUserListByCondition(User user, RowBounds rb);

	/**
	 * 根据实体类条件查询数据(无分页)
	 * Querying data based on entity class conditions.(no pagination)
     * @param user
     * @return Data mapping entity list
	 */
	List<User> queryUserListByConditionNoPage(User user);

	/**
	 * 根据实体类条件查询数据总条数
     * Querying data count based on entity class conditions.
     * @param user
     * @return Total Data
	 */
	Integer queryUserNumByCondition(User user);

	/**
	 * 根据实体类属性进行数据添加
	 * Add data based on entity class attributes.
	 * @param user
	 */
	void addUser(User user);

	/**
	 * 根据主键删除数据
	 * Delete data according to the primary key.
	 * @param id  PrimaryKey
	 */
	void deleteUser(String id);

	/**
	 * 根据主键获取数据实体
	 * Querying Data entity based on primary key.
	 * @param id  PrimaryKey
	 * @return Data mapping entity
	 */
	User getUser(String id);

	/**
	 * 根据实体类属性修改数据
	 * Modify data based on entity class attributes.
	 * @param user
	 */
	void editUser(User user);

	/**
	 * 查询所有数据
	 * Querying all data.
	 * @return Data mapping entity list
	 */
	List<User> queryAllUser();
	
}
