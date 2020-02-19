package com.java.tests.controlflow;

import com.java.solutions.controlflow.FlourPacker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FlourPackerTests {
    @ParameterizedTest
    @MethodSource("canPackTestDataProvider")
    public void canPackTest(int bigCount, int smallCount, int goal, boolean expectedRes){
        boolean actRes = FlourPacker.canPack(bigCount, smallCount, goal);
        Assertions.assertEquals(expectedRes, actRes);
    }

    static Stream<Arguments> canPackTestDataProvider() {
        return Stream.of(
                arguments(1, 0, 4, false),
                arguments(1, 0, 5, true),
                arguments(1, 0, 6, false),
                arguments(0, 5, 4, true),
                arguments(4, 18, 19, true),
                arguments(5, 3, 24, false),
                arguments(2, 1, 5, true),
                arguments(2, 2, 11, true),
                arguments(-3, 2, 12, false)
        );
    }
}
