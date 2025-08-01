package com.cams;

import java.util.Scanner;

public class UserInput {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getInt(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    public static double getDouble(String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }

    public static String getString(String message) {
        System.out.print(message);
        return scanner.next();
    }
}
