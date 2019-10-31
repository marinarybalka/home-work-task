package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/26/19
 */
public class SortingChecker {

    public int[] fromMinToMax(int[] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length - 1; j++) {
                int a = values[j];
                int b = values[j + 1];
                if (b < a) {
                    values[j] = b;
                    values[j + 1] = a;
                }
            }
        }
        return values;
    }

    public int[] fromMaxToMin(int[] values) {

        for (int i = 0; i < values.length; i++) {

            for (int j = 0; j < values.length - 1; j++) {
                int a = values[j];
                int b = values[j + 1];
                if (b > a) {
                    values[j] = b;
                    values[j + 1] = a;
                }
            }
        }
        return values;
    }
}

