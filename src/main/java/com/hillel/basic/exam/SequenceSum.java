package com.hillel.basic.exam;

import java.lang.reflect.Array;

/**
 * Description:
 * We want to generate a function that computes the series starting from 0 and ending until the given number following the sequence:
 * 0 1 3 6 10 15 21 28 36 45 55 ....
 * which is created by
 * 0, 0+1, 0+1+2, 0+1+2+3, 0+1+2+3+4, 0+1+2+3+4+5, 0+1+2+3+4+5+6, 0+1+2+3+4+5+6+7 etc..
 * <p>
 * Input: LastNumber
 * Output: series and result
 * <p>
 * Example:
 * <p>
 * Input: 6
 * Output: 0+1+2+3+4+5+6 = 21
 * <p>
 * Input: -15
 * Output: -15 < 0
 * <p>
 * Input: = 0
 * Output: 0 = 0
 */

public class SequenceSum {

    public static void main(String[] args) {
        SequenceSum.showSequence(5);
    }

    public static String showSequence(int value) {
        String result = "";

        for (int i = 0; i < value + 1; i++) {
            // i = 0, result = ""
            // i = 1, result = "0"
            // i = 2, result = "0+1"
            // i = 3, result = "0+1+2"
            if (result == "") {
                result = "" + i;
            } else {
                result = result +  "+" + i;
            }
            //  result = result == "" ? "" + i : result +  "+" + i;
        }
        // i = 5, result = "0+1+2+3+4+5"
        System.out.println(result);

        String array[]= result.split("\\+");

        int sum = 0;
        for (int i = 0; i < array.length; i ++) {
            sum = sum + Integer.parseInt(array[i]);
        }
        System.out.println(sum);

        return result + " = " + sum;
    }

}