package com.java.solutions;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AreaCalculator {
    public static double area(double radius) {
        if (radius < 0)
            return -1.0;
        return round(radius * radius * Math.PI, 5);
    }

    public static double area(double x, double y) {
        if ((x < 0) || (y < 0))
            return -1.0;
        return x * y;
    }

    private static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
