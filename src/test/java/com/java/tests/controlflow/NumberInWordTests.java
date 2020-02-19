package com.java.tests.controlflow;

import com.java.solutions.controlflow.NumberInWord;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NumberInWordTests {
    @ParameterizedTest
    @MethodSource("printNumberInWordTestDataProvider")
    public void printNumberInWordTest(int number, String expectedResult) {
        ByteArrayOutputStream streamReader = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(streamReader);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        // Print some output: goes to your special stream
        NumberInWord.printNumberInWord(number);
        // Put things back
        System.out.flush();
        System.setOut(old);
        // Assert
        Assertions.assertEquals(expectedResult, streamReader.toString().trim());
    }

    static Stream<Arguments> printNumberInWordTestDataProvider() {
        return Stream.of(
                arguments(0, "ZERO"),
                arguments(9, "NINE"),
                arguments(5, "FIVE"),
                arguments(10, "OTHER")
        );
    }
}
