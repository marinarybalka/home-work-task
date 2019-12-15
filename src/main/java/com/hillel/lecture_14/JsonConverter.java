package com.hillel.lecture_14;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;


/**
 * Create json converter. User object should be present in key-value pair, all field should be like Map;
 * F.E:
 * public class User {
 *
 *     private String name;
 *
 * }
 *
 * Should be present as json {"name": "bob"}
 * @see <a href="https://www.w3schools.com/whatis/whatis_json.asp">JSON</a>
 */
public class JsonConverter {


    public String convertToJsonString(List<User> users) {
        ObjectMapper mapper = new ObjectMapper();
        String u = "";
        try {
           u = mapper.writeValueAsString(mapper.writeValueAsString(users));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return u.replace("\\", "");
    }

    public String convertToJsonString(User users) {
        ObjectMapper mapper = new ObjectMapper();
        String u = "";
        try {
            u = mapper.writeValueAsString(mapper.writeValueAsString(users));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return u.replace("\\", "");
    }


}
