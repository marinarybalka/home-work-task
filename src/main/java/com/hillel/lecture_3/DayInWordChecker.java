package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class DayInWordChecker {

    public String getDayIfElse(int number) {
        if (number == 1) {
            return "Monday";
        } else if (number == 2) {
            return "Tuesday";
        } else if (number == 3) {
            return "Wednesday";
        } else if (number == 4) {
            return "Thursday";
        }  else if (number == 5) {
            return "Friday";
        }  else if (number == 6) {
            return "Saturday";
        }  else if (number == 7) {
            return "Sunday";
        }
        return "Not a valid day";
    }

    public String getDaySwitchCase(int number) {
        switch (number) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
        }
        return "Not a valid day";
    }
}
