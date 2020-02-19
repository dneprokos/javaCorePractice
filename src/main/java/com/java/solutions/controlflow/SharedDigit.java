package com.java.solutions.controlflow;

import com.java.solutions.commonHelpers.DataConverter;

public class SharedDigit {
    public static boolean hasSharedDigit(int number1, int number2){
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) return false;

        int [] arr1 = DataConverter.convertToIntArray(number1);
        int [] arr2 = DataConverter.convertToIntArray(number2);

        for (int numArr1: arr1) {
            for (int numArr2: arr2) {
                if (numArr1 == numArr2) return true;
            }
        }
        return false;
    }
}
