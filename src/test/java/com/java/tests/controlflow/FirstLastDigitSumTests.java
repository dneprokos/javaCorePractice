package com.java.tests.controlflow;

import com.java.solutions.controlflow.FirstLastDigitSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FirstLastDigitSumTests {
    @ParameterizedTest
    @MethodSource("sumFirstAndLastDigitTestDataProvider")
    public void sumFirstAndLastDigitTest(int number, int expectedRes){
        int actRes = FirstLastDigitSum.sumFirstAndLastDigit(number);
        Assertions.assertEquals(expectedRes, actRes);
    }

    static Stream<Arguments> sumFirstAndLastDigitTestDataProvider() {
        return Stream.of(
                arguments(252, 4),
                arguments(257, 9),
                arguments(0, 0),
                arguments(5, 10),
                arguments(-10, -1)
        );
    }
}
