package com.java.tests.controlflow;

import com.java.solutions.controlflow.LargestPrime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LargestPrimeTests {
    @ParameterizedTest
    @MethodSource("getLargestPrimeTestDataProvider")
    public void getLargestPrimeTest(int number, int expectedResult) {
        int actualResult = LargestPrime.getLargestPrime(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> getLargestPrimeTestDataProvider() {
        return Stream.of(
                arguments(21, 7),
                arguments(217, 31),
                arguments(0, -1),
                arguments(45, 5),
                arguments(-1, -1)
        );
    }
}


/*
EXAMPLE INPUT/OUTPUT:

* getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)

* getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)

* getLargestPrime (0); should return -1 since 0 does not have any prime numbers

* getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)

* getLargestPrime (-1); should return -1 since the parameter is negative
 */
