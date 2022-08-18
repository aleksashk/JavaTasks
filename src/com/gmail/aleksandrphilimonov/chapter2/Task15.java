package com.gmail.aleksandrphilimonov.chapter2;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the outer radius: ");
        double outR = scanner.nextDouble();
        System.out.print("Enter the inner radius: ");
        double inR = scanner.nextDouble();
        System.out.println("The area of the ring is: " + Math.PI * (Math.pow(outR, 2) - Math.pow(inR, 2)));
    }
}
