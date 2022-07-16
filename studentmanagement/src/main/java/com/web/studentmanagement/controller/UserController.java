package com.web.studentmanagement.controller;

import com.alibaba.fastjson.JSON;
import com.web.studentmanagement.entity.User;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RequestMapping("/user")
@RestController
public class UserController {

    @PostMapping("/login")
    public String login(@RequestBody User user){
        String result=JSON.toJSONString(user);
        System.out.println(user);
        user.setAge(18);
        return result;
    }
}
