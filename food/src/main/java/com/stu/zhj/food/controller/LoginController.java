package com.stu.zhj.food.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/system")
public class LoginController {

    @RequestMapping("/login")
    public String loging(String username){
        return username;
    }

}
