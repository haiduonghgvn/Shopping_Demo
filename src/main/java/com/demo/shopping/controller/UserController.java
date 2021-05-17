package com.demo.shopping.controller;

import com.demo.shopping.model.dto.UserDTO;
import com.demo.shopping.service.UserService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/users")
@JsonIgnoreProperties
@RestController
public class UserController {
    @Autowired
    public UserService userService;

//    Get List All User
    @GetMapping("")
    public ResponseEntity<List<UserDTO>> getListUser() {
        List<UserDTO> result = userService.getListUser();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}