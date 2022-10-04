package com.skyware.estore.models;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table
public class PurchaseHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false)
    private Long UserId;

    @Column(nullable = false)
    private Long BookId;

    @Column(nullable = false)
    private Double Price;

    @Column(nullable = false)
    private LocalDateTime PurchaseDateTime;

}
