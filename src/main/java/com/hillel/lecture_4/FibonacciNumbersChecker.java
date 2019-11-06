package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class FibonacciNumbersChecker {

    @Step
    public int[] getFibonacciNumbers(int number) {
        int[] result = new int[number];
        for(int i = 0; i < result.length; i++){
            if(i < 2){
                result[i] = i;
            }  else {
                result[i] = result [i-2] + result[i-1];
            }
        }
        return result;
    }

}

