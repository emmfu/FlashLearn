package com.efu.FlashLearnCards.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "administrator")
@Data
public class Administrator {
    // create instance variables administratorId of type Integer, administratorFirstName of type String, administratorLastName of type String, administratorEmail of type String, administratorPassword of type String.
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Integer administratorId;
    private String administratorFirstName;
    private String administratorLastName;
    private String administratorEmail;
    private String administratorPassword;
}
