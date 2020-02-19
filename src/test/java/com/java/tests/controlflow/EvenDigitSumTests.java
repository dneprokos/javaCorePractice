package com.java.tests.controlflow;

import com.java.solutions.controlflow.EvenDigitSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class EvenDigitSumTests {
    @ParameterizedTest
    @MethodSource("getEvenDigitSumTestDataProvider")
    public void getEvenDigitSumTest(int number, int expectedRes){
        int actRes = EvenDigitSum.getEvenDigitSum(number);
        Assertions.assertEquals(expectedRes, actRes);
    }

    static Stream<Arguments> getEvenDigitSumTestDataProvider() {
        return Stream.of(
                arguments(123456789, 20),
                arguments(252, 4),
                arguments(-22, -1),
                arguments(200, 2)
        );
    }
}
