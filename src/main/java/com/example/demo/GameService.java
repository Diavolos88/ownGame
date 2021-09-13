package com.example.demo;

import com.example.demo.json.FromToJson;
import com.example.demo.model.Card;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GameService {

    private final GameRepository repository;

    public String getCardByID(long id) {
        Card card = repository.getCardByID(id);
        FromToJson toJson = new FromToJson();
        return toJson.objectToJson(card);
    }

    public void addNewCard(Card card) {
        repository.addNewCard(card);
    }
}
