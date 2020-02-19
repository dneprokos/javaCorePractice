package com.java.tests.statements;

import com.java.solutions.statements.MegaBytesConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MegaBytesConverterTests {
    @ParameterizedTest
    @MethodSource("printMegaBytesAndKiloBytesTestDataProvider")
    public void printMegaBytesAndKiloBytesTest(int hourOfDay, String expectedResult) {
        ByteArrayOutputStream streamReader = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(streamReader);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        // Print some output: goes to your special stream
        MegaBytesConverter.printMegaBytesAndKiloBytes(hourOfDay);
        // Put things back
        System.out.flush();
        System.setOut(old);
        // Assert
        Assertions.assertEquals(expectedResult, streamReader.toString().trim());
    }

    static Stream<Arguments> printMegaBytesAndKiloBytesTestDataProvider() {
        return Stream.of(
                arguments(2500, "2500 KB = 2 MB and 452 KB"),
                arguments(-1024, "Invalid Value"),
                arguments(5000, "5000 KB = 4 MB and 904 KB")
        );
    }
}
