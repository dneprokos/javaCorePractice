package com.java.tests.controlflow;

import com.java.solutions.controlflow.PerfectNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PerfectNumberTests {
    @ParameterizedTest
    @MethodSource("isPerfectNumberTestDataProvider")
    public void isPerfectNumberTest(int number, Boolean expectedResult) {
        Boolean actualResult = PerfectNumber.isPerfectNumber(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> isPerfectNumberTestDataProvider() {
        return Stream.of(
                arguments(6, true),
                arguments(28, true),
                arguments(5, false),
                arguments(-1, false)
        );
    }
}
