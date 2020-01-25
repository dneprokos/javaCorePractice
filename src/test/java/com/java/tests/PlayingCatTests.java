package com.java.tests;

import com.java.solutions.PlayingCat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PlayingCatTests {
    @ParameterizedTest
    @MethodSource("isCatPlayingTestDataProvider")
    public void isCatPlayingTest(boolean summer, int temperature, boolean expectedResult) {
        boolean actualResult = PlayingCat.isCatPlaying(summer, temperature);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> isCatPlayingTestDataProvider() {
        return Stream.of(
                arguments(true, 10, false),
                arguments(false, 36, false),
                arguments(false, 35, true)
        );
    }
}
