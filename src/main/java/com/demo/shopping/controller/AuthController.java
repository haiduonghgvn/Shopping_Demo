package com.demo.shopping.controller;

import com.demo.shopping.entity.User;
import com.demo.shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@RestController
public class AuthController {

    @Autowired
    private UserService userService;



    @PostMapping("/register")
    public User register (@RequestBody User user){
        user.set_passwords(new BCryptPasswordEncoder().encode(user.get_passwords()));
        return userService.createUser(user);
    }
}
