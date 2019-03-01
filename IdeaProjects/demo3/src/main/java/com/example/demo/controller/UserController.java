package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yanshilong
 * @Date: 19-2-27 下午10:26
 * @Version 1.0
 */

@RestController
public class UserController {
   static Logger LOGGER=Logger.getLogger(UserController.class);
    @Autowired
    private UserService userService;





    @RequestMapping("/set/{id}/{username}/{password}")
    public String set(@PathVariable("id") String id,@PathVariable("username") String username,@PathVariable("password") String password){
        LOGGER.info("Contorller层进入insert 　　　id= "+id+" username: "+username+" password: "+password);
        User user=new User(id,username,password);
        return (userService.save(user)>0)? "sucess":"default";

    }




    @RequestMapping("get/{id}")
    public User get(@PathVariable("id") String id){
        LOGGER.info("Contorller层进入查询，查询id="+id);
        User user=userService.getUser(id);
        return user;
    }





    @RequestMapping("/updateUser/{id}/{username}/{password}")
    public boolean updateUser(@PathVariable("id") String id,@PathVariable("username") String username,@PathVariable("password") String password){
        User user=new User(id,username,password);
        LOGGER.info("Contorller层进入update 　　　id= "+id+" username: "+username+" password: "+password);
        return userService.updateByPrimaryKey(user);

    }


   ////删除----方式－：路径参数
    @RequestMapping("/delete/{id}")
        public boolean delete(@PathVariable("id") String i){
        System.out.println("Usercontroller层接收到的id= "+i);
        boolean e=userService.deleteByPrimaryKey(i);
        return e;
}









    //删除----方式二：键值对参数

//    @RequestMapping("/delete")
//    public boolean delete(@RequestParam("id") String i){
//
//        System.out.println("Usercontroller层接收到的id= "+i);
//       boolean e=userService.deleteByPrimaryKey(i);
//
//         return e;
//    }


}
