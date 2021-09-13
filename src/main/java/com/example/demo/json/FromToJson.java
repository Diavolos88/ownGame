package com.example.demo.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FromToJson {

    public String objectToJson(Object obj) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(obj);
            return json;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
//public Object jsonToObject(String json) throws IOException {
//        Object obj = mapper.readValue(json, Sample.class);
//        return obj;
//        }
//}
