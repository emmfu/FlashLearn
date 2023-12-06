package com.efu.FlashLearnCards.repository;

import com.efu.FlashLearnCards.entity.LearningCard;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface LearningCardRepository extends CrudRepository<LearningCard, Integer> {
    // create a method to find a learning card by its id.
    LearningCard findByLearningCardId(Integer learningCardId);

    // create a method to return an array list of cars by category.
    @Query("SELECT lc FROM LearningCard lc WHERE lc.learningCardCategory = :learningCardCategory")
    Iterable<LearningCard> findByLearningCardCategory(String learningCardCategory);

    // create a method to return an array list of cards by creator.
    @Query("SELECT lc FROM LearningCard lc WHERE lc.learningCardCreator = :learningCardCreator")
    Iterable<LearningCard> findByLearningCardCreator(String learningCardCreator);
}
