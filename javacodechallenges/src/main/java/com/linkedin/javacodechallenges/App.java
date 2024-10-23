package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {
    private static final int minimalCharacters = 6;

    /**
     * @param password
     * @return
     */
    public static boolean isPasswordComplex(String password) {
        if (password.length() < minimalCharacters) {
            return false;
        }

        char[] passwordCharacters = new char[password.length()];
        password.getChars(0, password.length(), passwordCharacters, 0);

        boolean anyUppterLetter = false;
        boolean anyLowerLetter = false;
        boolean anyDigit = false;

        for (char letter : passwordCharacters) {
            if (Character.isUpperCase(letter)) {
                anyUppterLetter = true;
            } else if (Character.isLowerCase(letter)) {
                anyLowerLetter = true;
            } else if (Character.isDigit(letter)) {
                anyDigit = true;
            }
        }

        return anyUppterLetter && anyLowerLetter && anyDigit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }
}
