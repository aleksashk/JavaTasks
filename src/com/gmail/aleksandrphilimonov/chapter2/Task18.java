package com.gmail.aleksandrphilimonov.chapter2;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter x: ");
        double x = scanner.nextDouble();
        System.out.print("enter y: ");
        double y = scanner.nextDouble();
        System.out.println("z = " + x + ((2 + y) / Math.pow(x, 2)) / (y + (1 / (Math.sqrt(Math.pow(x, 2) + 10)))));
        System.out.println("q = " + (7.25 * Math.sin(x) - Math.abs(y)));
    }
}
