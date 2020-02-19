package com.java.tests.statements;

import com.java.solutions.statements.LeapYear;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LeapYearTests {
    @ParameterizedTest
    @MethodSource("leapYearTestDataProvider")
    public void leapYearTest(int year, boolean expectedResult) {
        boolean actualResult = LeapYear.isLeapYear(year);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> leapYearTestDataProvider() {
        return Stream.of(
                arguments(-1600, false),
                arguments(1600, true),
                arguments(2017, false),
                arguments(2000, true)
        );
    }
}
