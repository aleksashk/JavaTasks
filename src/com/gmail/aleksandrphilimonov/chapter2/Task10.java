package com.gmail.aleksandrphilimonov.chapter2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("arithmetic mean: " + arithmeticMean(a, b));
        System.out.println("geometric mean: " + geometricMean(a, b));
    }

    private static double arithmeticMean(int ... values) {
        double result = 0;
        int counter = 0;
        for (int item : values) {
            result += item;
            counter++;
        }
        return result / counter;
    }

    private static double geometricMean(int ... values) {
        double result = 1;
        for (int item : values) {
            result *= item;
        }
        return Math.sqrt(result);
    }
}
