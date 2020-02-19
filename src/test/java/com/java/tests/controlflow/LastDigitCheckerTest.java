package com.java.tests.controlflow;

import com.java.solutions.controlflow.LastDigitChecker;
import com.java.solutions.controlflow.SharedDigit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LastDigitCheckerTest {
    @ParameterizedTest
    @MethodSource("hasSameLastDigitTestDataProvider")
    public void hasSameLastDigitTest(int number1, int number2, int number3, boolean expectedRes){
        boolean actRes = LastDigitChecker.hasSameLastDigit(number1, number2, number3);
        Assertions.assertEquals(expectedRes, actRes);
    }

    static Stream<Arguments> hasSameLastDigitTestDataProvider() {
        return Stream.of(
                arguments(41, 22, 71, true),
                arguments(23, 32, 42, true),
                arguments(9, 99, 999, false)
        );
    }

    @ParameterizedTest
    @MethodSource("isValidTestDataProvider")
    public void isValidTest(int number, boolean expectedRes){
        boolean actRes = LastDigitChecker.isValid(number);
        Assertions.assertEquals(expectedRes, actRes);
    }

    static Stream<Arguments> isValidTestDataProvider() {
        return Stream.of(
                arguments(10, true),
                arguments(468, true),
                arguments(1000, true),
                arguments(1051, false),
                arguments(9, false)
        );
    }
}
