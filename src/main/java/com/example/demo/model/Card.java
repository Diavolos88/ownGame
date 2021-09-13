package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Card {

    public Card() {}

    @JsonProperty("id")
    Long id;

    @JsonProperty("theme")
    String theme;

    @JsonProperty("type")
    String type;

    @JsonProperty("body")
    String body;

    @JsonProperty("cost")
    Long cost;
}
