package com.gmail.aleksandrphilimonov.chapter2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Enter the radius of circle: ");
        Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextDouble();
        System.out.println("Diameter of the circle is: " + 2 * radius
        );
    }
}
