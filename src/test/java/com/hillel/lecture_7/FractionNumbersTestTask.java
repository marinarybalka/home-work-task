package com.hillel.lecture_7;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FractionNumbersTestTask {
    private FractionNumbers numbers = new FractionNumbers(2, 2);

    @Test
    public void plusTest() {
        int expectedResult = 4;
        assertEquals(numbers.plus(), expectedResult);
    }

    @Test
    public void minusTest() {
        int expectedResult = 0;
        assertEquals(numbers.minus(), expectedResult);
    }

    @Test
    public void multiplyTest() {
        int expectedResult = 4;
        assertEquals(numbers.multiply(), expectedResult);
    }

    @Test
    public void divideTest() {
        int expectedResult = 1;
        assertEquals(numbers.divide(), expectedResult);
    }

}
