package com.efu.FlashLearnCards.dto;

import lombok.Data;

import javax.persistence.UniqueConstraint;

@Data
public class CustomerDTO {
    // create instance variables customerId of type Integer, customerFirstName of type String, customerLastName of type String, customerEmail of type String, customerPassword of type String.
    private Integer customerId;
    private String customerFirstName;
    private String customerLastName;
    private String customerEmail;
    private String customerPassword;
}
