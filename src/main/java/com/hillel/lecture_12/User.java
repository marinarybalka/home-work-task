package com.hillel.lecture_12;

public class User {

    private String name;
    private Cat cat;
    private Dog dog;

    public User(String name) {
        this.name = name;
        Cat cat = new Cat();
        cat.setName("Barsik");
    }
    public User(String name, String catName, String dogName) {
        this.name = name;
        cat = new Cat();
        cat.setName(catName);
        dog = new Dog();
        dog.setName(dogName);
    }

    public Cat getCat() { return cat; }

    public Dog getDog() { return dog; }

    public void setDog(Dog dog) { this.dog = dog; }

    public class Cat {

        private String name;

        public String getName() { return name; }

        private void setName(String name) { this.name = name; }

        public void sayMeu() { System.out.println("Meu Meu " + User.this.name); }
    }

    static class Dog {
        private String name;

        public String getName() { return name; }

        public void setName(String name) { this.name = name; }

        public void sayGav() {
            System.out.println("Gav Gav said " + name); }

        }

}
