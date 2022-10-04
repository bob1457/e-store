package com.skyware.estore.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false)
    private String Title;

    @Column(nullable = false, length = 500)
    private String Description;

    @Column(nullable = false, length = 100)
    private String Author;

    @Column(nullable = false)
    private Double Price;

    @Column(nullable = false)
    private LocalDateTime CreateDateTime;
}
