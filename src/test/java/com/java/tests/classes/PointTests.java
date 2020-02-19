package com.java.tests.classes;

import com.java.solutions.classes.Point;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PointTests {
    @Test
    public void pointWithoutParametersTest() {
        double expectedResult = 7.810249675906654;

        Point first = new Point(6, 5);
        double distance = first.distance();
        Assertions.assertEquals(expectedResult, distance);
    }

    @Test
    public void pointWithoutParametersAndEmptyConstructorTest() {
        double expectedResult = 0.0;

        Point first = new Point();
        double distance = first.distance();
        Assertions.assertEquals(expectedResult, distance);
    }

    @Test
    public void pointWithTwoIntParametersTest() {
        double expectedResult = 5.0;

        Point first = new Point(6, 5);
        double distance = first.distance(2, 2);
        Assertions.assertEquals(expectedResult, distance);
    }

    @Test
    public void pointWithPointParameterTest() {
        double expectedResult = 5.0;

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        double distance = first.distance(second);
        Assertions.assertEquals(expectedResult, distance);
    }
}
