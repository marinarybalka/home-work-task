package com.hillel.lecture_9;

public class BookMain {

    public static void main(String[] args) {
        Author andrzejSapkowski = new Author("Andrzej", "Sapkowski");
//        System.out.println(andrzejSapkowski);

        Book witcherThelastWish = new Book(1L, "The witcher: The last Wish", 1996, andrzejSapkowski);
//        System.out.println(witcherThelastWish);
        Book witherSwordOfDestiny = new Book(2L, "The Wither: Sword Of Destiny", 1993, andrzejSapkowski);
//        System.out.println(witherSwordOfDestiny);

        Author victorHugo = new Author("Victor", "Hugo");
        Book hunchbackofNotreDame = new Book(3L, "The Hunchback of Notre-Dame", 1831, victorHugo);
//        System.out.println(HunchbackofNotreDame);

        Author stephenKing = new Author("Stephen", "King");
//        Author stephenKing1 = new Author("Stephen", "King");
        Book theShining = new Book(4L, "The Shining", 1977, stephenKing);
//        System.out.println(theShining);

        Author author = theShining.getAuthor();
//        System.out.println(stephenKing.equals(stephenKing1));

//        System.out.println(witcherThelastWish.getYear() == witherSwordOfDestiny.getYear());

        Book [] books = {witcherThelastWish, witherSwordOfDestiny, hunchbackofNotreDame, theShining};
        for (Book book : books) {
            Author author1 = book.getAuthor();
            if (book.getAuthor().equals(andrzejSapkowski));
            System.out.println(books);
        }

        for (Book book : books) {
            if (book.getYear() < 1970);
            System.out.println(books);
        }

    }
}
