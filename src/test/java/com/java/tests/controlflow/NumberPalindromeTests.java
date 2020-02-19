package com.java.tests.controlflow;

import com.java.solutions.controlflow.NumberPalindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NumberPalindromeTests {

    @ParameterizedTest
    @MethodSource("isPalindromeTestDataProvider")
    public void isPalindromeTest(int number, boolean expectedRes){
        boolean actRes = NumberPalindrome.isPalindrome(number);
        Assertions.assertEquals(expectedRes, actRes);
    }

    static Stream<Arguments> isPalindromeTestDataProvider() {
        return Stream.of(
                arguments(-1221, true),
                arguments(707, true),
                arguments(11212, false)
        );
    }
}
