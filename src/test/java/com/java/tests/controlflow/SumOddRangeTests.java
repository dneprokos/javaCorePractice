package com.java.tests.controlflow;

import com.java.solutions.controlflow.SumOddRange;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SumOddRangeTests {

    @ParameterizedTest
    @MethodSource("isOddTestDataProvider")
    public void isOddTest(int number, boolean expectedRes){
        boolean actRes = SumOddRange.isOdd(number);
        Assertions.assertEquals(expectedRes, actRes);
    }

    @ParameterizedTest
    @MethodSource("sumOddTestDataProvider")
    public void sumOddTest(int start, int end, int expectedRes){
        int actRes = SumOddRange.sumOdd(start, end);
        Assertions.assertEquals(expectedRes, actRes);
    }

    static Stream<Arguments> sumOddTestDataProvider() {
        return Stream.of(
                arguments(1, 100, 2500),
                arguments(-1, 100, -1),
                arguments(100, 100, 0),
                arguments(13, 13, 13),
                arguments(100, -100, -1),
                arguments(100, 1000, 247500)
        );
    }

    static Stream<Arguments> isOddTestDataProvider() {
        return Stream.of(
                arguments(-1, false),
                arguments(0, false),
                arguments(1, true),
                arguments(2, false),
                arguments(11, true),
                arguments(Integer.MAX_VALUE, true)
        );
    }
}
