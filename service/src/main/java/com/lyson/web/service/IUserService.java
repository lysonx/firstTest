package com.lyson.web.service;


import com.lyson.web.model.User;



public interface IUserService {


    public User findByUserName(String userName);

    public User getUserById(Integer id);

}
