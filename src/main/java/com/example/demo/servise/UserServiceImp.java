package com.example.demo.servise;

import com.example.demo.model.Users;
import com.example.demo.repo.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
@AllArgsConstructor
public class UserServiceImp implements UserService {

    private UserRepo userRepo;


    @Override
    public Long save(Users user) {

        return userRepo.save(user).getId();
    }

    @Override
    public Users findById(Long id) {
        return null;
    }

    @Override
    public Map<String, String> updateUser(Long id) {
        return null;
    }
}
