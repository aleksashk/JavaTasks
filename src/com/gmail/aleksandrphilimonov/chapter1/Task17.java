package com.gmail.aleksandrphilimonov.chapter1;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.print("enter int number: ");
            array[i] = scanner.nextInt();
        }
        PrintStream printStream = new PrintStream(System.out, true, StandardCharsets.UTF_8);
        String weightKg = "кг";

        printStream.println(2 + "\t" + weightKg);
        System.out.println(13 + "\t" + 17);

        System.out.println(array[0] + "\t" + 1);
        System.out.println(19 + "\t" + array[1]);

        System.out.println(array[2] + "\t" + array[3]);
        System.out.println(5 + "\t" + array[4]);
    }
}
