package com.demo.shopping.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private long ID;

    private String _username;

    private String _passwords;

    private String role;

    private Date _CREATED;

    private Date _UPDATED;
}
