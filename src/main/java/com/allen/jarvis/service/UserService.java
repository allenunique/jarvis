package com.allen.jarvis.service;

import com.allen.jarvis.entity.Users;

import java.util.List;

public interface UserService {

    List<Users> getAll();

    Users getUserByTelAndPassword(String tel,String password);
}
