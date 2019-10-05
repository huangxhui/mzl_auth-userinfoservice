package com.mzl.userinfo.service;


import com.mzl.api.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService {

    @RequestMapping("/")
    public String index(){
        User user = new User();
        user.setName("hello");
        user.setPassword("1234");
        return user.toString();
    }

}
