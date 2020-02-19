package com.java.tests.controlflow;

import com.java.solutions.controlflow.FactorPrinter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FactorPrinterTests {
    @ParameterizedTest
    @MethodSource("printFactorsTestDataProvider")
    public void printFactorsTest(int number, String expectedResult) {
        ByteArrayOutputStream streamReader = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(streamReader);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        // Print some output: goes to your special stream
        FactorPrinter.printFactors(number);
        // Put things back
        System.out.flush();
        System.setOut(old);
        // Assert
        Assertions.assertEquals(expectedResult, streamReader.toString().trim());
    }

    static Stream<Arguments> printFactorsTestDataProvider() {
        return Stream.of(
                arguments(6, "1 2 3 6"),
                arguments(32, "1 2 4 8 16 32"),
                arguments(10, "1 2 5 10"),
                arguments(-1, "Invalid Value")
        );
    }
}
