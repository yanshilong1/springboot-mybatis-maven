package com.example.demo.entity;

import java.io.Serializable;

/**
 * @Author: yanshilong
 * @Date: 19-3-1 上午6:02
 * @Version 1.0
 */
public class User implements Serializable {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String username;
    private String password;

    private static final long serialVersionUID = 934073895746700367L;
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


    public static long getSerialVersionUID(){
        return serialVersionUID;
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
    public User(){

    }
    public User(String id,String username,String password){
        super();
        this.id=id;
        this.password=password;
        this.username=username;
    }
}
