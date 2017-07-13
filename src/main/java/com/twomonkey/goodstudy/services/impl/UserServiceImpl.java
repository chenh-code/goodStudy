package com.twomonkey.goodstudy.services.impl;

import com.twomonkey.goodstudy.dao.UserMapper;
import com.twomonkey.goodstudy.entity.User;
import com.twomonkey.goodstudy.services.UserService;
import org.apache.ibatis.session.RowBounds;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
  * User
  * Created by CoderMaker on 2017/03/06.
  */
@Component
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {
	private final static Logger log= Logger.getLogger(UserService.class);
	
	@Autowired
	UserMapper userMapper;

	/**
	  * 根据实体类条件查询数据(分页)
	  * Querying data based on entity class conditions.(pagination)
	  * @param user
	  * @return Data mapping entity list
	  */
	public List<User> queryUserListByCondition(User user) {
		RowBounds rb = new RowBounds();
		List<User> userList = userMapper.queryUserListByCondition(user, rb);
		return userList;
	}

	/**
	  * 根据实体类条件查询数据(无分页)
	  * Querying data based on entity class conditions.(no pagination)
      * @param user
	  * @return Data mapping entity list
	  */
	public List<User> queryUserListByConditionNoPage(User user){
		return userMapper.queryUserListByConditionNoPage(user);
	}

	/**
	  * 根据实体类条件查询数据总条数
      * Querying data count based on entity class conditions.
	  * @param user
	  * @return Total Data
	  */
	public Integer queryUserNumByCondition(User user) {
		Integer count = userMapper.queryUserNumByCondition(user);
        return count;
	}

	/**
	  * 根据实体类属性进行数据添加
	  * Add data based on entity class attributes.
	  * @param user
	  */
	public void addUser(User user) {
		userMapper.addUser(user);
	}

	/**
	  * 根据主键删除数据
	  * Delete data according to the primary key.
	  * @param id  PrimaryKey
	  */
	public void deleteUser(String id) {
		// TODO Auto-generated method stub
		userMapper.deleteUser(id);
	}

	/**
	  * 根据主键获取数据实体
	  * Querying Data entity based on primary key.
	  * @param id  PrimaryKey
	  * @return Data mapping entity
	  */
	public User getUser(String id) {
		// TODO Auto-generated method stub
		return userMapper.getUser(id);
	}

	/**
	  * 根据实体类属性修改数据
	  * Modify data based on entity class attributes.
	  * @param user
	  */
	public void editUser(User user) {
		userMapper.editUser(user);
	}

	/**
	  * 查询所有数据
	  * Querying all data.
	  * @return Data mapping entity list
	  */
	public List<User> queryAllUser(){
		return userMapper.queryAllUser();
	}

}
