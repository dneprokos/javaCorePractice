package com.java.solutions.controlflow;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        boolean result = false;
        int bigBagsSpace = bigCount * 5;
        int spaceAfterBigBags = goal - bigBagsSpace;

        if (spaceAfterBigBags > 0 && smallCount >= spaceAfterBigBags)
            result = true;
        if (spaceAfterBigBags < 0 && bigBagsSpace - 5 + smallCount >= goal)
            result = true;
        if (spaceAfterBigBags == 0)
            result = true;

        return result;
    }
}
