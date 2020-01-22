package com.java.tests;

import com.java.solutions.DecimalComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DecimalComparatorTests {

    @ParameterizedTest
    @MethodSource("areEqualByThreeDecimalPlacesDataProvider")
    public void areEqualByThreeDecimalPlacesTest(double num1, double num2, boolean expectedResult) {
        boolean actualResult = DecimalComparator.areEqualByThreeDecimalPlaces(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> areEqualByThreeDecimalPlacesDataProvider() {
        return Stream.of(
                arguments(-3.1756, -3.175, true),
                arguments(3.175, 3.176, false),
                arguments(3.0, 3.0, true),
                arguments(-3.123, 3.123, false)
        );
    }
}
