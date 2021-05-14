package com.demo.shopping.entity;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
@Table(name = "Profile")

public class Profile implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    private String name;

    @Column(columnDefinition = "text")
    private String address;

    @Column(columnDefinition = "text")
    private String email;

    @Column(name = "CREATED")
    private Date _CREATED;

    @Column(name = "_UPDATED")
    private Date _UPDATED;

    @Column(columnDefinition = "text")
    private String _avatar;


    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

}
