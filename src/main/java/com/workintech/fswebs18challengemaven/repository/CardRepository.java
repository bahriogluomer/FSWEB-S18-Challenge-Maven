package com.workintech.fswebs18challengemaven.repository;

import com.workintech.fswebs18challengemaven.entity.Card;

import java.util.List;
import java.util.Optional;


public interface CardRepository {

//    @Query(value= "SELECT * FROM casino.cards WHERE color=:color", nativeQuery = true)
//    List<Card> findByColor(String color);
//
//
//    @Query(value= "SELECT * FROM casino.cards WHERE value=:value", nativeQuery = true)
//    List<Card> findByValue(Integer value);
//
//    @Query(value= "SELECT * FROM casino.cards WHERE type=:type", nativeQuery = true)
//    List<Card> findByType(String type);

    Card save(Card card);

    List<Card> findAll();

    List<Card> findByColor(String color);

    List<Card> findByValue(Integer value);

    List<Card> findByType(String type);

    Card update(Card card);

    Card remove(Long id);

    Optional<Card> findById(Long id);
}

