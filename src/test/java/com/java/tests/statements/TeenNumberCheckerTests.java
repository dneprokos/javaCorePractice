package com.java.tests.statements;

import com.java.solutions.statements.TeenNumberChecker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TeenNumberCheckerTests {

    @ParameterizedTest
    @MethodSource("hasTeenTestDataProvider")
    public void hasTeenTest(int age1, int age2, int age3, boolean expectedResult) {
        boolean actualResult = TeenNumberChecker.hasTeen(age1, age2, age3);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("isTeenTestDataProvider")
    public void hasTeenTest(int age, boolean expectedResult) {
        boolean actualResult = TeenNumberChecker.isTeen(age);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> hasTeenTestDataProvider() {
        return Stream.of(
                arguments(9, 99, 19, true),
                arguments(23, 15, 42, true),
                arguments(22, 23, 34, false)
        );
    }

    static Stream<Arguments> isTeenTestDataProvider() {
        return Stream.of(
                arguments(9, false),
                arguments(13, true)
        );
    }
}
