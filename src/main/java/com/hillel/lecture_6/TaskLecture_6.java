package com.hillel.lecture_6;
import java.util.Random;

/*Quick Tasks
● Write a method that accepts two
parameters: mode of type String and length
of type int.
● This function should return a randomly
generated string of given length according to
the specified mode.
● Modes: alpha, numeric, alphanumeric
● Output —> String. */

public class TaskLecture_6 {

    public static void main(String[] args) {

        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int randomStringLength = 9;
        char[] randomCharArray = new char[randomStringLength];

        for(int i = 0; i < randomStringLength; i++) {
            Random random = new Random();
            int s = random.nextInt(alphabet.length);
            randomCharArray[i] = alphabet[s];
        }

        String text = String.valueOf(randomCharArray);
        System.out.println(text);
    }
}



