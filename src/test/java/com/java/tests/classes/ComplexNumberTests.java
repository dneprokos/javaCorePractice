package com.java.tests.classes;

import com.java.solutions.classes.ComplexNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComplexNumberTests {
    ComplexNumber one;
    ComplexNumber number;

    @Test
    public void getRealAndImaginary_AfterAddMethod_Test() {
        prepareTestData();
        double realExpectedResult = 2.0;
        double imaginaryExpectedResult = 2.0;

        double realActualResult = one.getReal();
        double imagineActualResult = one.getImaginary();

        Assertions.assertEquals(realExpectedResult, realActualResult);
        Assertions.assertEquals(imaginaryExpectedResult, imagineActualResult);
    }

    @Test
    public void getRealAndImaginary_AfterSubtractMethod_Test() {
        prepareTestData();
        one.subtract(number);
        double realExpectedResult = -0.5;
        double imaginaryExpectedResult = 3.5;

        double realActualResult = one.getReal();
        double imagineActualResult = one.getImaginary();

        Assertions.assertEquals(realExpectedResult, realActualResult);
        Assertions.assertEquals(imaginaryExpectedResult, imagineActualResult);
    }

    @Test
    public void getRealAndImaginary_AfterSubtractMethodTwice_Test() {
        prepareTestData();
        one.subtract(number);
        number.subtract(one);
        double realExpectedResult = 3.0;
        double imaginaryExpectedResult = -5.0;

        double realActualResult = number.getReal();
        double imagineActualResult = number.getImaginary();

        Assertions.assertEquals(realExpectedResult, realActualResult);
        Assertions.assertEquals(imaginaryExpectedResult, imagineActualResult);
    }




    private void prepareTestData() {
        one = new ComplexNumber(1.0, 1.0);
        number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
    }

}
