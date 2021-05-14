package com.demo.shopping.entity;


import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Table(name = "User_Account")

public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    @NotNull
    @Column(name = "username", unique = true)
    private String _username;

    @NotNull
    @Column(name = "passwords",columnDefinition = "text")
    private String _passwords;

    @NotNull
    @Column(name = "role", columnDefinition = "varchar(255) default 'USER'")
    private String role;

    @Column(name = "CREATED")
    private Date _CREATED;

    @Column(name = "UPDATED")
    private Date _UPDATED;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    private Collection<Cart> cart;

}
