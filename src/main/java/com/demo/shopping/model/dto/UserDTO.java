package com.demo.shopping.model.dto;

import com.demo.shopping.entity.Auditable;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private long ID;

    private String _username;

    private String _passwords;

    private String _role;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;

    private String updateBy;

    private String createBy;


}
