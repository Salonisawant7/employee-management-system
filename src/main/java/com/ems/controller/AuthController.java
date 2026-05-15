package com.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication
        .UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.dto.AuthRequest;
import com.ems.dto.AuthResponse;
import com.ems.entity.User;
import com.ems.security.JwtService;
import com.ems.service.UserService;

@RestController
public class AuthController {

    @Autowired
    private UserService service;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtService;

    @PostMapping("/register")
    public User register(
            @RequestBody User user) {

        return service.register(user);
    }

    @PostMapping("/login")
    public AuthResponse login(
            @RequestBody AuthRequest request) {

        authenticationManager.authenticate(

                new UsernamePasswordAuthenticationToken(

                        request.getUsername(),

                        request.getPassword()
                )
        );

        String token = jwtService.generateToken(
                request.getUsername()
        );

        return new AuthResponse(token);
    }
}