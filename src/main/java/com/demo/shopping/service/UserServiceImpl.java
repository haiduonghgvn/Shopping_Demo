package com.demo.shopping.service;

import com.demo.shopping.entity.User;
import com.demo.shopping.model.dto.UserDTO;
import com.demo.shopping.model.mapper.UserMapper;
import com.demo.shopping.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public List<UserDTO> getListUser() {
        List<UserDTO> result = new ArrayList<>();
        for (User user : userRepository.findAll()) {
            result.add(UserMapper.toUserDto(user));
        }
        return result;
    }
}
