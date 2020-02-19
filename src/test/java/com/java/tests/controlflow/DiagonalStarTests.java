package com.java.tests.controlflow;

import com.java.solutions.controlflow.DiagonalStar;
import com.java.solutions.controlflow.LargestPrime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DiagonalStarTests {
    @ParameterizedTest
    @MethodSource("getLargestPrimeTestDataProvider")
    public void getLargestPrimeTest(int number, String expectedResult) {
        String actualResult = DiagonalStar.printSquareStar(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> getLargestPrimeTestDataProvider() {
        return Stream.of(
                arguments(21, 7)
        );
    }
}
