package com.demo.shopping.model.mapper;

import com.demo.shopping.entity.User;
import com.demo.shopping.model.dto.UserDTO;

public class UserMapper {
    public static UserDTO toUserDto(User user) {
        UserDTO tmp = new UserDTO();
        tmp.setID(user.getID());
        tmp.set_username(user.get_username());
        tmp.set_passwords(user.get_passwords());
        tmp.set_CREATED(user.get_CREATED());
        tmp.set_UPDATED(user.get_UPDATED());
        tmp.setRole(user.getRole());
        return tmp;
    }
}
