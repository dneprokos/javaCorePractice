package com.java.tests.controlflow;

import com.java.solutions.controlflow.GreatestCommonDivisor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class GreatestCommonDivisorTests {
    @ParameterizedTest
    @MethodSource("getGreatestCommonDivisorTestDataProvider")
    public void getGreatestCommonDivisorTest(int first, int second, int expectedRes){
        int actRes = GreatestCommonDivisor.getGreatestCommonDivisor(first, second);
        Assertions.assertEquals(expectedRes, actRes);
    }

    static Stream<Arguments> getGreatestCommonDivisorTestDataProvider() {
        return Stream.of(
                arguments(25, 15, 5),
                arguments(12, 30, 6),
                arguments(9, 18, -1),
                arguments(81, 153, 9)
        );
    }
}
