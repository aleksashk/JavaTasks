package com.gmail.aleksandrphilimonov.chapter2;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of the population: ");
        int population = scanner.nextInt();
        System.out.print("Enter the area of the country: ");
        double areaOfCountry = scanner.nextDouble();
        System.out.println("The population density in the state is " + population / areaOfCountry);
    }
}
