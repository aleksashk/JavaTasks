package com.gmail.aleksandrphilimonov.chapter2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Enter value: ");
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();
        System.out.print("sqrt((2a+sin(3a))/(3.56)) = " + Math.sqrt((2 * value + Math.sin(3 * value)) / 3.56));

        System.out.print("\nEnter value: ");
        scanner = new Scanner(System.in);
        value = scanner.nextDouble();
        System.out.print("sin((3.2 + sqrt(1+x))/mod(5x)) = " + Math.sin((3.2 + Math.sqrt(1 + value)) / Math.abs(5 * value)));

    }
}
