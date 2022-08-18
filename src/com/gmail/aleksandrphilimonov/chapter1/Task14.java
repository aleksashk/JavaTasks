package com.gmail.aleksandrphilimonov.chapter1;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        System.out.print("Введите три числа: ");
        StringBuilder str = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int tmpValue = scanner.nextInt();
            System.out.println("число = " + tmpValue);
            str.append(tmpValue);
            if (i != 2) {
                str.append(" ");
            }
        }
        System.out.println(str);
    }
}
