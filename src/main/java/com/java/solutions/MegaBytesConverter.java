package com.java.solutions;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0 ){
            System.out.println("Invalid Value");
        } else {
            int megaByte = (kiloBytes / 1024) ;
            int remainderKilobyte = kiloBytes % 1024;
            System.out.println( kiloBytes + " KB = " + megaByte  + " MB and " + remainderKilobyte  + " KB");
        }
    }
}
