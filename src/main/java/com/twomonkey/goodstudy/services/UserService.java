package com.twomonkey.goodstudy.services;

import com.twomonkey.goodstudy.entity.User;

import java.util.List;


/**
 * User Service Interface
 * Created by CoderMaker on 2017/03/06.
 */
public interface UserService {

	/**
	  * 根据实体类条件查询数据(分页)
	  * Querying data based on entity class conditions.(pagination)
	  * @param user
	  * @return Data mapping entity list
	  */
	List<User> queryUserListByCondition(User user);

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
	public void addUser(User user);

	/**
	  * 根据主键删除数据
	  * Delete data according to the primary key.
	  * @param id  PrimaryKey
	  */
	public void deleteUser(String id);

	/**
	  * 根据主键获取数据实体
	  * Querying Data entity based on primary key.
	  * @param id  PrimaryKey
	  * @return Data mapping entity
	  */
	public User getUser(String id);

	/**
	  * 根据实体类属性修改数据
	  * Modify data based on entity class attributes.
	  * @param user
	  */
	public void editUser(User user);

	/**
	  * 查询所有数据
	  * Querying all data.
	  * @return Data mapping entity list
	  */
	List<User> queryAllUser();

}
