package com.ghj.dao;

import com.ghj.domain.User;

import java.util.List;

public interface IUserDao {
    /**
     * 查询所有操作
     * @return
     */
    List<User> findAll();
}
