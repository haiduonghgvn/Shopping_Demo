package com.demo.shopping.controller;

import com.demo.shopping.model.dto.UserDTO;
import com.demo.shopping.service.UserService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/users")
@JsonIgnoreProperties
@RestController
public class UserController {
    @Autowired
    public UserService userService;

    @GetMapping("")
    public ResponseEntity<?> getListUser() {
        List<UserDTO> result = userService.getListUser();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}