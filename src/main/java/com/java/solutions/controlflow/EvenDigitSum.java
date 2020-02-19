package com.java.solutions.controlflow;

import com.java.solutions.commonHelpers.DataConverter;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if (number < 0) return -1;

        int [] array = DataConverter.convertToIntArray(number);
        int evenDigitSum = 0;

        for (int num: array) {
            if (num !=0 && num % 2 == 0)
                evenDigitSum +=num;
        }
        return evenDigitSum;
    }
}
