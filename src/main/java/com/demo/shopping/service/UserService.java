package com.demo.shopping.service;

import com.demo.shopping.entity.User;
import com.demo.shopping.model.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    public List<UserDTO> getListUser();

    User createUser(User user);
}
