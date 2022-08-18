package com.gmail.aleksandrphilimonov.chapter2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("enter the side of the square: ");
        Scanner scanner = new Scanner(System.in);
        double side = scanner.nextDouble();
        System.out.println("the area of the square with a side is " + getArea(side));
    }

    private static double getArea(double side) {
        return Math.pow(side, 2);
    }
}
