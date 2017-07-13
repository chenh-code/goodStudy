package com.twomonkey.goodstudy.entity;


import com.twomonkey.goodstudy.entity.common.BaseEntity;

import java.io.Serializable;

/**
 * User 实体类
 * Created by CoderMaker on 2017/03/06.
 */ 
public class User extends BaseEntity implements Serializable {
    private Integer id; //  编号
    private String username; //  用户名
    private String password; //  密码
    private String salt; //  密码盐
    private String roles; //  拥有角色
    private java.util.Date createdtime; //  创建时间
    private String createdtime_start; //  创建时间_开始时间
    private String createdtime_end; //  创建时间_结束时间
    private String status; //  状态

    /**
     * 获取凭据
     * @return
     */
    public String getCredentialsSalt() {
        return username + salt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public java.util.Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(java.util.Date createdtime) {
        this.createdtime = createdtime;
    }

    public String getCreatedtime_start() {
        return createdtime_start;
    }

    public void setCreatedtime_start(String createdtime_start) {
        this.createdtime_start = createdtime_start;
    }

    public String getCreatedtime_end() {
        return createdtime_end;
    }

    public void setCreatedtime_end(String createdtime_end) {
        this.createdtime_end = createdtime_end;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}

