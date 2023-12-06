package com.efu.FlashLearnCards.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "learning_card")
@Data
public class LearningCard {
    // create instance variables learningCardId of type Integer, learningCardQuestion of type String, learningCardAnswer of type String, learningCardCategory of type String, learningCardSubCategory of type String, learningCardDifficulty of type String, learningCardRating of type Integer, learningCardCreator of type String.
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Integer learningCardId;
    private String learningCardQuestion;
    private String learningCardAnswer;
    private String learningCardCategory;
    private String learningCardSubCategory;
    private String learningCardDifficulty;
    private Integer learningCardRating;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private String learningCardCreator;
    // create instance variables: creationDate of type LocalDate, lastModifiedDate of type LocalDate.
    private LocalDate creationDate;
    private LocalDate lastModifiedDate;

}
