package com.gmail.aleksandrphilimonov.chapter2;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first trapezoid base: ");
        double firstBase = scanner.nextDouble();
        System.out.print("Enter the second trapezoid base: ");
        double secondBase = scanner.nextDouble();
        System.out.print("Enter the height trapezoid: ");
        double height = scanner.nextDouble();
        System.out.println("The perimeter of the trapezoid is: " + (firstBase + secondBase + 2 * Math.sqrt(Math.pow(height, 2) + Math.pow(firstBase - secondBase, 2) / 4)));
    }
}