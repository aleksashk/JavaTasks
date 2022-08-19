package com.gmail.aleksandrphilimonov.noChapter.palindrome;

import java.util.Scanner;

public class MainAppPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine().toUpperCase();
        String back = "";
        boolean isPalindrome = true;
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome ? string + " is a palindrome" : string + " isn't a palindrome");
    }
}
