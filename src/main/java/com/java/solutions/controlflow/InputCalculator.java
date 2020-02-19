package com.java.solutions.controlflow;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage (){
        Scanner keyboard = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        int counter = 0;

        while (true){
            boolean hasNext = keyboard.hasNextInt();
            if(hasNext){
                int input = keyboard.nextInt();
                sum += input;
                counter++;
                avg =  Math.round((double) (sum) / (double) (counter)) ;
            }else {
                System.out.println("SUM = " + sum + " " + "AVG = " + avg);
                break;
            }
            keyboard.nextLine();
        }
        keyboard.close();
    }
}
