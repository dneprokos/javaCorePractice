package com.java.solutions.controlflow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FactorPrinter {
    public static void printFactors(int number){
        if (number < 1) System.out.println("Invalid Value");
        List<Integer> factors = new ArrayList<>(Collections.emptyList());

        for (int i = 1; i <= number; i++) if (number % i == 0) factors.add(i);
        for (int factor: factors) System.out.print(factor + " ");
    }
}
