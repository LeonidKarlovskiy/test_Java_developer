package com.example.demo.controller;

import com.example.demo.model.Users;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {

    public Users getUser(){
        return new Users(1l, "name", "surName", "email", "url", "false");
    }
}
