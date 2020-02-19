package com.java.tests.controlflow;

import com.java.solutions.controlflow.NumberOfDaysInMonth;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NumberOfDaysInMonthTests {
    @ParameterizedTest
    @MethodSource("isLeapYearTestDataProvider")
    public void isLeapYearTest(int year, boolean expectedResult) {
        boolean actualResult = NumberOfDaysInMonth.isLeapYear(year);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("getDaysInMonthTestDataProvider")
    public void getDaysInMonthTest(int month, int year, int expectedRes){
        int actRes = NumberOfDaysInMonth.getDaysInMonth(month, year);
        Assertions.assertEquals(expectedRes, actRes);
    }

    static Stream<Arguments> isLeapYearTestDataProvider() {
        return Stream.of(
                arguments(-1600, false),
                arguments(1600, true),
                arguments(2017, false),
                arguments(2000, true)
        );
    }

    static Stream<Arguments> getDaysInMonthTestDataProvider() {
        return Stream.of(
                arguments(1, 2020, 31),
                arguments(2, 2020, 29),
                arguments(2, 2018, 28),
                arguments(-1, 2020, -1),
                arguments(1, -2020, -1)
        );
    }
}
