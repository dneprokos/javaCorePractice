package com.java.solutions.controlflow;

import com.java.solutions.commonHelpers.DataConverter;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;

        int[] array = DataConverter.convertToIntArray(number);
        int length = array.length;

        if (length == 1 && array[0] == 0) return 0;
        if (length == 1) return array[0] + array[0];

        int sum = 0;
        for (int x = 0; x < length; x++){
            if (x == 0 || x == array.length - 1)
                sum += array[x];
        }
        return sum;
    }

}
