package com.allen.jarvis.dao;

import com.allen.jarvis.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Users,String>{

    List<Users> findAll();

    Users findByTelAndPassword(String tel,String password);
}
