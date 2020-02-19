package com.java.solutions.statements;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        while(hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        if(barking){
            return hourOfDay < 8 || hourOfDay > 22;
        }
        return false;
    }
}
