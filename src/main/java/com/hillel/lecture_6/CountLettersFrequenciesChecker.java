package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountLettersFrequenciesChecker {


    @Step
    public String countLettersFrequencies(String text, char letter) {
        char[] str = text.toCharArray();
        int letterCount = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == letter) {
                letterCount++;
            }
        }
        return "Character '" + letter + "' repeated " + letterCount + " times";
    }
}

