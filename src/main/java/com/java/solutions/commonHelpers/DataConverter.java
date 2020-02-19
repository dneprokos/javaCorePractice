package com.java.solutions.commonHelpers;

public class DataConverter {

    public static int [] convertToIntArray(int number){
        String temp = Integer.toString(number);
        int[] array = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            array[i] = temp.charAt(i) - '0';
        }

        return array;
    }
}
