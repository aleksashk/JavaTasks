package com.gmail.aleksandrphilimonov.chapter2;

import java.util.Scanner;

public class Task6 {
    static final int R = 6350;
    public static void main(String[] args) {
        System.out.print("Enter height: ");
        Scanner scanner = new Scanner(System.in);
        double height = scanner.nextDouble();
        System.out.println("The distance from the point to the horizon is " + Math.pow(Math.pow((R + height), 2) - Math.pow(R, 2),0.5));
    }
}
