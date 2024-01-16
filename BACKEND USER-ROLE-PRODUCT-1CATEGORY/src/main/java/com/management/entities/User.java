package com.management.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Long userId;

    @Column(unique=true)
    private String username;
    private String password;
    private Boolean enabled;

    @ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name="user_role",joinColumns = @JoinColumn(name="userId") ,
            inverseJoinColumns = @JoinColumn(name="roleId"))
    private List<Role> roles;
}