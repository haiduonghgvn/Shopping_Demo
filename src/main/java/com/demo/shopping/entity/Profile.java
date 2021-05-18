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

public class Profile extends Auditable<String> implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    private String fullName;

    @Column(columnDefinition = "text")
    private String address;

    @Column(columnDefinition = "text")
    private String email;

    @Column(columnDefinition = "text")
    private String _avatar;


    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

}
