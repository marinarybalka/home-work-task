package com.hillel.lecture_14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JsonMain {

    public static void main(String[] args) {
        User user = new User();
        user.setAge(30);
        user.setName("Bob");
        System.out.println(user.toString());

//        public static String convert(User user) {
//            String jsonStart = "{";
//            String jsonEnd = "}";
//            Map<String, String> userMap = new HashMap<>();
//            userMap.put("name" + user.getName());
//            userMap.put("age" + String.valueOf(user.getAge()));
//
//            Set<Map.Entry<String, String>> entries = userMap.
//        }
    }
}
