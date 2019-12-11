package com.hillel.lecture_14;
import java.util.ArrayList;
import java.util.List;

public class ArrayMain {

    public static void main(String[] args) {
        ArrayList<String> listOfString = new ArrayList<>();
        System.out.println(listOfString.size());
        System.out.println("isEmpty: " + listOfString.isEmpty());
        listOfString.add("yellow");
        listOfString.add("green");
        listOfString.add("red");
        listOfString.add("brown");
        System.out.println("size: " + listOfString.size());
        listOfString.remove("green");
        System.out.println("size: " + listOfString.size());

        boolean isContainsBlue = listOfString.contains("blue");
        System.out.println("isContainsBlue: " + isContainsBlue);

        boolean isContainsRed= listOfString.contains("red");
        System.out.println("isContainsRed: " + isContainsRed);
        System.out.println("toString: " + listOfString.toString());
        System.out.println("isEmpty: " + listOfString.isEmpty());

        String index2 = listOfString.get(2);
        System.out.println("index2: " + index2);

//        listOfString.removeIf(item -> item.equals("yellow"));

        ArrayList listOfString2 = new ArrayList();
        listOfString2.add("yellow");
        listOfString2.add("brown");

        listOfString.removeAll(listOfString);
        System.out.println("listOfString: " + listOfString.size());

        for (String string : listOfString) {
            System.out.println(string);
        }

//        listOfString.forEach(System.out::println);
        listOfString.set(0, "fghjjhg");


    }

}
