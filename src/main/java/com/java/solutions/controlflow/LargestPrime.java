package com.java.solutions.controlflow;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        int primefactor = 0;
        if (number <= 1)
            return -1;
        for (int i = 2; i <= number; i++) {
            while (number % i == 0 && number != i) {
                number = number / i;
            }
            primefactor = number;
        }
        return primefactor;
    }
}
