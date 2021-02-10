package com.example.demoswaggerapi.controller;

import com.example.demoswaggerapi.domain.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @PostMapping("/user")
    public User login(@RequestParam("username") String username, @RequestParam("password") String password) {
        String token = getJWTToken(username);
        User user = new User();
        user.setUsername(username);
        user.setToken(token);
        return user;
    }


    private String getJWTToken(String username) {

        return null;
    }



}
