package com.allen.jarvis.controller;

import com.allen.jarvis.dao.UserRepository;
import com.allen.jarvis.entity.Users;
import com.allen.jarvis.service.UserService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String home(){

        return "Hello";
    }

    @RequestMapping("/getAll")
//    @JsonView(Users.WithoutLocationInfo.class)
    public List<Users> getAll() {
        return userService.getAll();
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Users login(@RequestBody Users user){
        System.out.println(user);
//        System.out.println(password);
        return userService.getUserByTelAndPassword(user.getTel(), user.getPassword());
    }

    @RequestMapping(value = "/login2",method = RequestMethod.POST)
    public Users login2(@RequestBody Map<String,String> body){
        return userService.getUserByTelAndPassword(body.get("tel"),body.get("password"));
    }
}
