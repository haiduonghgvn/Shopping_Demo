package com.demo.shopping.controller;

import com.demo.shopping.entity.User;
import com.demo.shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User register (@RequestBody User user){
        user.set_passwords(new BCryptPasswordEncoder().encode(user.get_passwords()));
        user.set_role("USER");
        return userService.createUser(user);
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/403")
    public String accessDenied() {
        return "403";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("home")
    public String loginSuccess(@ModelAttribute User user){
        return "index";
    }
}
