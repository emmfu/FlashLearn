package com.efu.FlashLearnCards.dto;

import lombok.Data;

@Data
public class AdministratorDTO {
    // create instance variables administratorId of type Integer, administratorFirstName of type String, administratorLastName of type String, administratorEmail of type String, administratorPassword of type String.
    private Integer administratorId;
    private String administratorFirstName;
    private String administratorLastName;
    private String administratorEmail;
    private String administratorPassword;
}
