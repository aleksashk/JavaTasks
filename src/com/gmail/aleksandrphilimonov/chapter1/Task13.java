package com.gmail.aleksandrphilimonov.chapter1;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.println("Следующее за числом " + value + " число – " + (value + 1) + ".\n" +
                "Для числа " + value + " предыдущее число – " + (value - 1) + ".");
    }
}
