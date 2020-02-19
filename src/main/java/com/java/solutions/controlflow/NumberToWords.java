package com.java.solutions.controlflow;

public class NumberToWords {
    public static void numberToWords(int number){
        int count = getDigitCount(number);
        number = reverse(number);

        if (number < 0) System.out.println("Invalid Value");

        String space = " ";

        for (int i = 0; i < count; i++) {
            int lastDigit = number % 10; // 989
            if (lastDigit == 0) System.out.print("Zero" + space);
            if (lastDigit == 1) System.out.print("One" + space);
            if (lastDigit == 2) System.out.print("Two" + space);
            if (lastDigit == 3) System.out.print("Three" + space);
            if (lastDigit == 4) System.out.print("Four" + space);
            if (lastDigit == 5) System.out.print("Five" + space);
            if (lastDigit == 6) System.out.print("Six" + space);
            if (lastDigit == 7) System.out.print("Seven" + space);
            if (lastDigit == 8) System.out.print("Eight" + space);
            if (lastDigit == 9) System.out.print("Nine" + space);
            number /= 10;
        }
    }

    public static int reverse(int number){
        int num = number;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    public static int getDigitCount(int number){
        if (number < 0) return -1;

        return String.valueOf(number).length();
    }
}
