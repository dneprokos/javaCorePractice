package com.java.tests;

import com.java.solutions.IntEqualityPrinter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class IntEqualityPrinterTests {
    @ParameterizedTest
    @MethodSource("printEqualTestDataProvider")
    public void printEqualTest(int num1, int num2, int num3, String expectedResult) {
        ByteArrayOutputStream streamReader = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(streamReader);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        // Print some output: goes to your special stream
        IntEqualityPrinter.printEqual(num1, num2, num3);
        // Put things back
        System.out.flush();
        System.setOut(old);
        // Assert
        Assertions.assertEquals(expectedResult, streamReader.toString().trim());
    }

    static Stream<Arguments> printEqualTestDataProvider() {
        return Stream.of(
                arguments(1, 1, 1, "All numbers are equal"),
                arguments(1, 1, 2, "Neither all are equal or different"),
                arguments(-1, -1, -1, "Invalid Value"),
                arguments(1, 2, 3, "All numbers are different")
        );
    }
}
