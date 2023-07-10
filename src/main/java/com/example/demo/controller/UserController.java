package com.example.demo.controller;

import com.example.demo.model.Users;
import com.example.demo.servise.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {

    private UserService userService;
    @GetMapping
    public Users getUser(){
        return new Users(1l, "name", "surName", "email", "url", "false");
    }

    @PostMapping
    public Long addUser(@RequestBody Users user){
        return userService.save(user);
    }
}
