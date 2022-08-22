package com.gmail.aleksandrphilimonov.chapter1;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.print("enter int number: ");
            array[i] = scanner.nextInt();
        }

        System.out.println(5 + "\t" + 10);
        System.out.println(7 + "\t" + "cm");

        System.out.println(100 + "\t" + array[0]);
        System.out.println(1949 + "\t" + array[1]);

        System.out.println(array[2] + "\t" + 25);
        System.out.println(array[3] + "\t" + array[4]);

    }
}
