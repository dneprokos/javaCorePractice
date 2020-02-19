package com.java.tests.statements;

import com.java.solutions.statements.SpeedConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SpeedConverterTests {
    @ParameterizedTest
    @MethodSource("toMilesPerHourTestDataProvider")
    public void toMilesPerHourTest(double kilometersPerHour, long expectedResult) {
        Long actualResult = SpeedConverter.toMilesPerHour(kilometersPerHour);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("printConversionTestDataProvider")
    public void printConversionTest(double kilometersPerHour, String expectedResult) {
        ByteArrayOutputStream streamReader = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(streamReader);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        // Print some output: goes to your special stream
        SpeedConverter.printConversion(kilometersPerHour);
        // Put things back
        System.out.flush();
        System.setOut(old);
        // Assert
        Assertions.assertEquals(expectedResult, streamReader.toString().trim());
    }

    static Stream<Arguments> toMilesPerHourTestDataProvider() {
        return Stream.of(
                arguments(1.5, 1),
                arguments(10.25, 6),
                arguments(-5.6, -1),
                arguments(25.42, 16),
                arguments(75.114, 47)
        );
    }

    static Stream<Arguments> printConversionTestDataProvider() {
        return Stream.of(
                arguments(1.5, "1.5 km/h = 1 mi/h"),
                arguments(10.25, "10.25 km/h = 6 mi/h"),
                arguments(-5.6, "Invalid Value"),
                arguments(25.42, "25.42 km/h = 16 mi/h"),
                arguments(75.114, "75.114 km/h = 47 mi/h")
        );
    }
}
