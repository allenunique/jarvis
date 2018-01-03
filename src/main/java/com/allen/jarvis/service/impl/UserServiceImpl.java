package com.allen.jarvis.service.impl;

import com.allen.jarvis.dao.UserRepository;
import com.allen.jarvis.entity.Users;
import com.allen.jarvis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<Users> getAll() {
        return userRepository.findAll();
    }

    @Override
    public Users getUserByTelAndPassword(String tel,String password) {
        return userRepository.findByTelAndPassword(tel,password);
    }
}
