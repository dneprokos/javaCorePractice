package com.java.tests.classes;

import com.java.solutions.classes.Calculator;
import com.java.solutions.classes.Carpet;
import com.java.solutions.classes.Floor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CalculatorTests {
    @ParameterizedTest
    @MethodSource("getTotalCostTestDataProvider")
    public void getTotalCostTest(double carpetCost, double floorWidth, double floorLength, double expectedRes) {
        Carpet carpet = new Carpet(carpetCost);
        Floor floor = new Floor(floorWidth, floorLength);
        Calculator calculator = new Calculator(floor, carpet);

        double actualRes = calculator.getTotalCost();

        Assertions.assertEquals(expectedRes, actualRes);
    }

    static Stream<Arguments> getTotalCostTestDataProvider() {
        return Stream.of(
                arguments(3.5, 2.75, 4.0, 38.5),
                arguments(1.5, 5.4, 4.5, 36.45)
        );
    }
}
