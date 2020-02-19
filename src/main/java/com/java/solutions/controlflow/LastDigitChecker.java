package com.java.solutions.controlflow;

import com.java.solutions.commonHelpers.DataConverter;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int number1, int number2, int number3){
        if (!isValid(number1) || !isValid(number2) || !isValid(number3)) return false;

        int [] arr1 = DataConverter.convertToIntArray(number1);
        int [] arr2 = DataConverter.convertToIntArray(number2);
        int [] arr3 = DataConverter.convertToIntArray(number3);

        return  arr1[arr1.length - 1] == arr2[arr2.length - 1]
                || arr1[arr1.length - 1] == arr3[arr3.length - 1]
                || arr2[arr2.length - 1] == arr3[arr3.length - 1];

    }

    public static boolean isValid(int number){
        return number >= 10 && number <= 1000;
    }
}
