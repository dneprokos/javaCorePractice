package com.java.tests.controlflow;

import com.java.solutions.controlflow.NumberToWords;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NumberToWordsTests {
    @ParameterizedTest
    @MethodSource("getDigitCountTestDataProvider")
    public void getDigitCountTest(int number, int expectedResult) {
        int actualResult = NumberToWords.getDigitCount(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> getDigitCountTestDataProvider() {
        return Stream.of(
                arguments(0, 1),
                arguments(123, 3),
                arguments(-12, -1),
                arguments(5200, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("reverseTestDataProvider")
    public void reverseTest(int number, int expectedResult) {
        int actualResult = NumberToWords.reverse(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> reverseTestDataProvider() {
        return Stream.of(
                arguments(-121, -121),
                arguments(1212, 2121),
                arguments(1234, 4321),
                arguments(100, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("numberToWordsTestDataProvider")
    public void numberToWordsTest(int number, String expectedResult) {
        ByteArrayOutputStream streamReader = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(streamReader);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        // Print some output: goes to your special stream
        NumberToWords.numberToWords(number);
        // Put things back
        System.out.flush();
        System.setOut(old);
        // Assert
        Assertions.assertEquals(expectedResult, streamReader.toString().trim());
    }

    static Stream<Arguments> numberToWordsTestDataProvider() {
        return Stream.of(
                arguments(123, "One Two Three"),
                arguments(1010, "One Zero One Zero"),
                arguments(1000, "One Zero Zero Zero"),
                arguments(-12, "Invalid Value")
        );
    }


    /*

Example Input/Output - numberToWords method

* numberToWords(123); should print "One Two Three".

* numberToWords(1010); should print "One Zero One Zero".

* numberToWords(1000); should print "One Zero Zero Zero".

* numberToWords(-12); should print "Invalid Value" since the parameter is negative.
     */
}
