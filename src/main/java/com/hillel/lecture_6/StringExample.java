package com.hillel.lecture_6;

public class StringExample {

    public static void main(String[] args) {
//        String lastName = new String("Ivanov");
//        System.out.println(lastName);

//        String name = "bob";
//        System.out.println(name);
//
//        boolean empty = name.isEmpty();
//        System.out.println("empty" + empty);
//
//        boolean isContains = name.contains("B");
//        System.out.println("isContains: " + isContains);
//
//        String concat = name.concat(" ivanov");
//        System.out.println("concat: ".concat(concat)); // "concat: " + name + " ivanov"
//
//        String lastName = "Henhd H ghjkl";
//
//        String toLowerCase = lastName.toLowerCase();
//        System.out.println(toLowerCase);
//
//        boolean isContains2 = name.toUpperCase().contains("B");
//        System.out.println("isContains: " + isContains2);
//
//        int length = lastName.length();
//        System.out.println("length: " + length);

//        char[] chars = name.toCharArray();
//        System.out.println("chars: " + chars.length);
//        for (int i = 0; i < chars.length; i++) ;
//            System.out.println(chars[i]);
//        }

//        char charAt1 = name.charAt(0);
//        char charAt2 = name.charAt(1);
//        char charAt3 = name.charAt(2);
//        char charAt4 = name.charAt(3);
//        System.out.println("charAt1: " + charAt1);
//        System.out.println("charAt2: " + charAt2);
//        System.out.println("charAt3: " + charAt3);
//        System.out.println("charAt4: " + charAt4);

//        String helloJava = "Hella Java!";
//        String substring = helloJava.substring(3);
//        System.out.println("substring: " + substring);
//        String substring2 = helloJava.substring(4, 7);
//        System.out.println("substring2: " + substring2);

//        int lengthBefore = helloJava.length();
//        System.out.println("lengthBefore: " + lengthBefore);
//        int lengthAfter = helloJava.trim().length();
//        System.out.println("lengthAfter: " + lengthAfter);

//        String replaceChar = helloJava.replace('a','o');
//        System.out.println("replaceChar: " + replaceChar);
//        String replaceChar1 = helloJava.replace('.',' ');
//        System.out.println("replaceChar1: " + replaceChar1);

//        String replaceChar3 = helloJava.replaceFirst("a","e");
//        System.out.println("replaceChar3: " + replaceChar3);
//
//        String replaceChar4 = helloJava.replaceAll("a","o");
//        System.out.println("replaceChar4: " + replaceChar4);

//        String adminUserLiteral = "admin";
//        String quesUserLiteral = "admin";
//        String adminUser = new String("admin");
//        String questUser = new String("Admin");
//
//
//        boolean equalsUserLiteral = adminUserLiteral == quesUserLiteral;
//        boolean equals = adminUser.equalsIgnoreCase(quesUser);
//        System.out.println("equals: " + equals);

        String hello = "Hello students!";
        String[] split = hello.split(" ");
        System.out.println("split: " + split.length);
        for (String s: split) {
            System.out.println(s);
        }

    }
}
