package com.java.tests;

import com.java.solutions.AreaCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class AreaCalculatorTests {
    @ParameterizedTest
    @MethodSource("areaCalculatorTestDataProvider")
    public void areaCalculatorTest(double area, double expectedResult) {
        double actualResult = AreaCalculator.area(area);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("areaCalculatorOverloadTestDataProvider")
    public void areaCalculatorOverloadTest(double x, double y, double expectedResult) {
        double actualResult = AreaCalculator.area(x, y);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> areaCalculatorTestDataProvider() {
        return Stream.of(
                arguments(5.0, 78.53982),
                arguments(-1.0, -1.0)
        );
    }

    static Stream<Arguments> areaCalculatorOverloadTestDataProvider() {
        return Stream.of(
                arguments(5.0, 4.0, 20.0),
                arguments(-1.0, 4.0, -1)
        );
    }

    /*
    Examples of input/output:

* area(5.0); should return 78.53975

* area(-1);  should return -1 since the parameter is negative

* area(5.0, 4.0); should return 20.0 (5 * 4 = 20)

* area(-1.0, 4.0);  should return -1 since first the parameter is negative
     */
}
