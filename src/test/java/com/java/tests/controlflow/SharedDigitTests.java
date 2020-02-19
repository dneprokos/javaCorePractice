package com.java.tests.controlflow;

import com.java.solutions.controlflow.SharedDigit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SharedDigitTests {
    @ParameterizedTest
    @MethodSource("hasSharedDigitTestDataProvider")
    public void hasSharedDigitTest(int number1, int number2, boolean expectedRes){
        boolean actRes = SharedDigit.hasSharedDigit(number1, number2);
        Assertions.assertEquals(expectedRes, actRes);
    }

    static Stream<Arguments> hasSharedDigitTestDataProvider() {
        return Stream.of(
                arguments(12, 23, true),
                arguments(9, 99, false),
                arguments(15, 55, true)
        );
    }
}
