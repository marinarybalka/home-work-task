package com.hillel.lecture_12;

public class Main {

    public static void main(String[] args) {
        User user = new User("Bob", "Barsik", "Tuzik");
        User.Cat cat = user.getCat();
        cat.sayMeu();

        User.Dog dog = new User.Dog();
        dog.sayGav();

        dog.setName("Barbos");
        dog.sayGav();
    }
}
