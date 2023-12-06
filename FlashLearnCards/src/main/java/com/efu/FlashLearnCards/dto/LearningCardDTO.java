package com.efu.FlashLearnCards.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class LearningCardDTO {
    // create instance variables learningCardId of type Integer, learningCardQuestion of type String, learningCardAnswer of type String, learningCardCategory of type String, learningCardSubCategory of type String, learningCardDifficulty of type String, learningCardRating of type Integer, learningCardCreator of type String.
    private Integer learningCardId;
    private String learningCardQuestion;
    private String learningCardAnswer;
    private String learningCardCategory;
    private String learningCardSubCategory;
    private String learningCardDifficulty;
    private Integer learningCardRating;
    private String learningCardCreator;
    // create instance variables: creationDate of type LocalDate, lastModifiedDate of type LocalDate.
    private LocalDate creationDate;
    private LocalDate lastModifiedDate;

}
