package com.gmail.aleksandrphilimonov.chapter2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Enter value a: ");
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();
        System.out.println("a = " + value);
        System.out.print("(a^2+10)/(sqrt(a^2+1)) = " + (Math.pow(value, 2) + 10) / (Math.sqrt((Math.pow(value, 2) + 1))));
    }
}
