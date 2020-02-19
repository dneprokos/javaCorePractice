package com.java.solutions.statements;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        String response = "Invalid Value";
        int daysInYear = 365;
        if (minutes >= 0) {
            int days = (int) (minutes / 60) / 24;
            int year = (int) days / daysInYear;
            int remainDays = days % daysInYear;
            response = minutes + " min = " + year + " y and " + remainDays + " d";
        }
        System.out.println(response);
    }
}
