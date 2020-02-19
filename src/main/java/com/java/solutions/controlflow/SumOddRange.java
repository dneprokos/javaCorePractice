package com.java.solutions.controlflow;

public class SumOddRange {
    public static boolean isOdd(int number) {
        if (number < 0 || number % 2 == 0) return false;
        else return true;
    }

    public static int sumOdd(int start, int end) {
        if (start < 0 || end < start) return -1;

        int sum = 0;
        //The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.

        for (; start <= end; start++){
            if(isOdd(start)) sum += start;
        }
        return sum;
    }
}
