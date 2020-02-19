package com.java.solutions.controlflow;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        int divisor = 0;

        if (first < 10 || second < 10) return -1;

        for (int i = 1; i <= first && i <= second; i++) {
            if (first % i == 0 && second % i == 0) divisor = i;
        }
        return divisor;
    }
}
