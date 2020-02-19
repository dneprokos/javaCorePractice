package com.java.solutions.controlflow;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        return number == reverseNumber(number); //I know, it can be done with Integer.reverse(number). That's just for practice.
    }

    private static int reverseNumber(int number){
        int reverse = 0;
        while (number != 0) {
            int reminder = number % 10;
            reverse = (reverse + reminder) * 10;
            number = number / 10;
        }
        return reverse / 10;
    }
}
