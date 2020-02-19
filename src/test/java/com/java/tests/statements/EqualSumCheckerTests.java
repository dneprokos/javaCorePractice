package com.java.tests.statements;

import com.java.solutions.statements.EqualSumChecker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class EqualSumCheckerTests {
    @ParameterizedTest
    @MethodSource("hasEqualSumTestDataProvider")
    public void hasEqualSumTest(int num1, int num2, int sum, boolean expectedResult) {
        boolean actualRes = EqualSumChecker.hasEqualSum(num1, num2, sum);
        Assertions.assertEquals(expectedResult, actualRes);
    }

    static Stream<Arguments> hasEqualSumTestDataProvider() {
        return Stream.of(
                arguments(1, 1, 1, false),
                arguments(1, 1, 2, true),
                arguments(1, -1, 0, true)
        );
    }
}
