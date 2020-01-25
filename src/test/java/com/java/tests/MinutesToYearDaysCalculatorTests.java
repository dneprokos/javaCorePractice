package com.java.tests;

import com.java.solutions.MinutesToYearsDaysCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinutesToYearDaysCalculatorTests {
    @ParameterizedTest
    @MethodSource("printYearsAndDaysTestDataProvider")
    public void printYearsAndDaysTest(long minutes, String expectedResult) {
        ByteArrayOutputStream streamReader = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(streamReader);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        // Print some output: goes to your special stream
        MinutesToYearsDaysCalculator.printYearsAndDays(minutes);
        // Put things back
        System.out.flush();
        System.setOut(old);
        // Assert
        Assertions.assertEquals(expectedResult, streamReader.toString().trim());
    }

    static Stream<Arguments> printYearsAndDaysTestDataProvider() {
        return Stream.of(
                arguments(525600, "525600 min = 1 y and 0 d"),
                arguments(1051200, "1051200 min = 2 y and 0 d"),
                arguments(561600, "561600 min = 1 y and 25 d")
        );
    }
}
