package io.zipcoder.pets;

import java.util.Scanner;

public class Console {

    static Scanner myScanner= new Scanner(System.in);

    public static String getString(){
        return myScanner.next();
    }

    public static int getInt(){
        return myScanner.nextInt();
    }

    public static void print(String whatever) {
        System.out.println(whatever);
    }

}
