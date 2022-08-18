package com.gmail.aleksandrphilimonov.chapter2;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.println("ax + b = 0 (a!=0)\nx = " + (-b / a));
    }
}
