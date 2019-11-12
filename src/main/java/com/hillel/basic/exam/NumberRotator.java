package com.hillel.basic.exam;


/**
 * Take a number: 56789. Rotate left, you get 67895.
 * Keep the first digit in place and rotate left the other digits: 68957.
 * Keep the first two digits in place and rotate the other ones: 68579.
 * Keep the first three digits and rotate left the rest: 68597. Now it is over since keeping the first four it remains
 * only one digit which rotated is itself.
 * <p>
 * You have the following sequence of numbers:
 * 56789 -> 67895 -> 68957 -> 68579 -> 68597
 * and you must return the greatest: 68957.
 * <p>
 * Calling this function max_rot (or maxRot or ... depending on the language)
 * max_rot(56789) should return 68957
 */

public class NumberRotator {

    public static void main(String[] args) {
        NumberRotator.rotate(38458215);
    }

    public static long rotate(long n) {
        String number = String.valueOf(n);
        number = number.substring(1, number.length()) + number.substring(0, 1);
        long maxNumber = Long.parseLong(number);

        for (int i = 1; i < number.length() - 1; i ++) {
           number = number.substring(0, i) + number.substring(i + 1, number.length()) + number.substring(i, i + 1);
            if (Long.parseLong(number) > maxNumber) {
                maxNumber = Long.parseLong(number);
            }
        }
        return maxNumber;
    }
}