package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: yanshilong
 * @Date: 19-2-27 下午10:27
 * @Version 1.0
 *注解，将自动注册到Spring容器，不需要再在applicationContext.xml文件定义bean了，
*/


 @Service
public class UserServiceImpl implements UserService {
     static Logger LOGGER=Logger.getLogger(UserServiceImpl.class);
   @Autowired
   private UserDao userDao;

    @Override
    public int save(User user) {
        int i=userDao.insert(user);
       return i;
    }

    @Override
    public User getUser(String id) {
       LOGGER.info("service层进入getuser　查询id="+id);
       return userDao.selectByPrimaryKey(Integer.valueOf(id));
    }

    @Override
    public boolean updateByPrimaryKey(User user) {
        return userDao.updateByPrimaryKey(user)>0;
    }

    @Override
    public boolean deleteByPrimaryKey(String id) {
        System.out.println("service层　执行delete id="+id);
       return userDao.deleteByPrimaryKey(Integer.valueOf(id))>0;
    }
}
