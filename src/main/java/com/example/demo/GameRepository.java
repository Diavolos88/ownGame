package com.example.demo;

import com.example.demo.model.Card;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class GameRepository {

    private final HashMap<Long, Card> cards = new HashMap();

    public Card getCardByID(Long id) {
        return cards.get(id);
    }

    public void addNewCard(Card card) {
        cards.put(card.getId(), card);
    }
}
