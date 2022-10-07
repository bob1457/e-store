package com.skyware.estore.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "users")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false)
    private  String username;

    @Column(nullable = false)
    private  String Password;

    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private LocalDateTime createdTime;

    @Enumerated(EnumType.STRING)
    private Role UserRole;

}
