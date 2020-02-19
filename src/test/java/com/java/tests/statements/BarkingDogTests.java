package com.java.tests.statements;

import com.java.solutions.statements.BarkingDog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;


public class BarkingDogTests {

    @ParameterizedTest
    @MethodSource("shouldWakeUpTestDataProvider")
    public void shouldWakeUpTest(boolean barking, int hourOfDay, boolean expectedResult) {
        boolean actualResult = BarkingDog.shouldWakeUp(barking, hourOfDay);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> shouldWakeUpTestDataProvider() {
        return Stream.of(
                arguments(true, 1, true),
                arguments(false, 2, false),
                arguments(true, 8, false),
                arguments(true, -1, false)
        );
    }
}
