package com.example.demo;

import com.example.demo.model.Card;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController("/api")
@AllArgsConstructor

public class GameController {

    private final GameService service;

    @GetMapping("/get-card-by-id/{cardID}")
    public String getCardByID(@PathVariable long cardID) {
        String resolve = service.getCardByID(cardID);
        return resolve;
    }

    @PostMapping("/add-card")
    public void addCard(@RequestBody Card card) {
        service.addNewCard(card);
        return;
    }

}
