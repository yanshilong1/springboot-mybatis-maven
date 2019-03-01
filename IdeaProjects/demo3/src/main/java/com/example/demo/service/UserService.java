package com.example.demo.service;

import com.example.demo.entity.User;

/**
 * @Author: yanshilong
 * @Date: 19-2-27 下午10:28
 * @Version 1.0
 */
public interface UserService {
    int save(User user);

    User getUser(String id);

    boolean updateByPrimaryKey(User user);

    boolean deleteByPrimaryKey(String id);
}
