package com.demo.shopping.model.mapper;

import com.demo.shopping.entity.Auditable;
import com.demo.shopping.entity.User;
import com.demo.shopping.model.dto.UserDTO;

public class UserMapper {
    public static UserDTO toUserDto(User user) {
        UserDTO tmp = new UserDTO();
        tmp.setID(user.getID());
        tmp.set_username(user.get_username());
        tmp.set_passwords(user.get_passwords());
        tmp.set_role(user.get_role());
        tmp.setCreateDate(user.getCreateDate());
        tmp.setUpdateDate(user.getUpdateDate());
        tmp.setCreateBy(user.getCreateBy());
        tmp.setUpdateBy(user.getUpdateBy());
        return tmp;
    }
}
