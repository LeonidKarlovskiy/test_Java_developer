package com.example.demo.servise;

import com.example.demo.model.Users;

import java.util.Map;

public interface UserService {

    Long save(Users user);

    Users findById(Long id);

    Map<String, String> updateUser(Long id);


}
