package com.gmail.aleksandrphilimonov.chapter2;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first triangle cathet: ");
        double firstCathet = scanner.nextDouble();
        System.out.print("Enter the second triangle cathet: ");
        double secondCathet = scanner.nextDouble();
        System.out.println("The triangle perimeter is " + (Math.pow(Math.pow(firstCathet, 2) + Math.pow(secondCathet, 2), 0.5) + firstCathet + secondCathet));
    }
}
