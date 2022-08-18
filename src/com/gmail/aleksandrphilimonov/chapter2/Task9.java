package com.gmail.aleksandrphilimonov.chapter2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y: ");
        double y = scanner.nextDouble();

        System.out.println("z = " + (2 * Math.pow(x, 3) - (3.44 * x * y) + (2.3 * Math.pow(x, 2)) - 7.1 * y + 2));

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.println("x = " + (3.14 * Math.pow(a + b, 3) + 2.75 * Math.pow(b, 2) - 12.7 * a - 4.1 ));
    }
}