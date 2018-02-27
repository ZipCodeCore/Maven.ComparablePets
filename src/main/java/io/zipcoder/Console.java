package io.zipcoder;

import java.util.Scanner;

public class Console {
    private static final Scanner scan = new Scanner(System.in);

    public static void println(String s, Object... args) {
        System.out.printf(s + "\n", args);
    }

    public static String getStringInput(String prompt, Object... args) {
        println(prompt, args);
        String userInput = scan.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt, Object... args) {
        String userInputStr = getStringInput(prompt, args);
        Integer userInputInt = Integer.parseInt(userInputStr);
        return userInputInt;
    }
}
