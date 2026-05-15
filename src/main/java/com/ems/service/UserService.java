package com.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ems.entity.User;
import com.ems.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User register(User user) {

        user.setPassword(

                passwordEncoder.encode(
                        user.getPassword()
                )
        );

        return repository.save(user);
    }
}