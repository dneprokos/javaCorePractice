package com.java.solutions.controlflow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if (number < 1) return false;

        List<Integer> factors = new ArrayList<>(Collections.emptyList());
        for (int i = 1; i < number; i++) if (number % i == 0) factors.add(i);

        return factors.stream().mapToInt(v -> v).sum() == number;
    }
}
