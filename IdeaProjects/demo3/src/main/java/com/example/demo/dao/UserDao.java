package com.example.demo.dao;

import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @Author: yanshilong
 * @Date: 19-2-27 下午10:26
 * @Version 1.0
 *
 * 接口层
 */

@Repository
public interface UserDao {

    int deleteByPrimaryKey(Integer id);

    int insert(User user);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
