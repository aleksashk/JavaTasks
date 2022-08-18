package com.gmail.aleksandrphilimonov.chapter2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.print("enter the length of the side of cube: ");
        Scanner scanner = new Scanner(System.in);
        double side = scanner.nextDouble();

        System.out.println("The cubes volume is " + getCubeVolume(side));

        System.out.println("The area of the cube of the side surface is " + getAreaOfCubeSide(side));

    }

    private static double getAreaOfCubeSide(double side) {
        return Math.pow(side, 2);
    }

    private static double getCubeVolume(double side) {
        return Math.pow(side, 3);
    }
}
