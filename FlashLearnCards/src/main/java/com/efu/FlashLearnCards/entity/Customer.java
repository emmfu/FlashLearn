package com.efu.FlashLearnCards.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "customer")
@Data
public class Customer {
    // create instance variables customerId of type Integer, customerFirstName of type String, customerLastName of type String, customerEmail of type String, customerPassword of type String.
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Integer customerId;
    private String customerFirstName;
    private String customerLastName;
    @Column(unique = true)
    private String customerEmail;
    private String customerPassword;

}
