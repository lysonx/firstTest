package com.lyson.web.serviceImpl;

import com.lyson.web.model.User;
import com.lyson.web.repository.UserRepository;
import com.lyson.web.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserService implements IUserService {

    @Resource
    private UserRepository userRepository;



    @Override
    public User findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

    @Override
    public User getUserById(Integer id) {
        return userRepository.findUserById(id);
    }


}
