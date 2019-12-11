package com.hillel.lecture_15;

import java.util.*;

public class MapsMain {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Cinema");
        map.put(131, "Mall");
        map.put(29, "Car");
        map.put(29, "Ford");
        map.put(null, "Trololo");

//        Set<Map.Entry<Integer, String>> entries = map.entrySet();
//        for (Map.Entry<Integer, String> entry : entries) {
//            System.out.println("key: " + entry.getKey());
//            System.out.println("value: " + entry.getValue());
//        }

        String value0 = map.get(131);
        System.out.println("value: " + value0);

        String value1 = map.get(124);
        System.out.println("value1: " + value1);

        String value2 = map.get(null);
        System.out.println("value2: " + value2);

        String value3 = map.get(29);
        System.out.println("value3: " + value3);

        for (String value : map.values()) {
            System.out.println(value);
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            String value = entry.getValue();
            if (value.equalsIgnoreCase("Cinema")) {
                System.out.println("key: " + entry.getKey());

            }
        }
        String train = map.getOrDefault(1560, "Train");
        System.out.println(train);

        List<String> stringList = new ArrayList<>();
        stringList.add("list0");
        stringList.add("list1");
        stringList.add("list2");

        Map<String, List<String>> listMap = new HashMap<>();
        listMap.put("one", stringList);

        List<String> stringList1 = listMap.get("one");
        for (String s : stringList) {
            System.out.println(s);

        }
    }
}
