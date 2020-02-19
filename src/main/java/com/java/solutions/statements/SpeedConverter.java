package com.java.solutions.statements;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0)
            return -1;

        return Math.round(kilometersPerHour/1.609);
    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0)
            System.out.println("Invalid Value");
        else {
            String message = kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h";
            System.out.println(message);
        }
    }
}
