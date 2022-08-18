package com.gmail.aleksandrphilimonov.chapter2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the volume of the body: ");
        double volume = scanner.nextDouble();
        System.out.print("Enter the weight of the body: ");
        double weight = scanner.nextDouble();
        System.out.println("material density is: " + weight / volume);
    }
}
