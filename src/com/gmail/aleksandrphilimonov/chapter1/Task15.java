package com.gmail.aleksandrphilimonov.chapter1;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        System.out.print("Введите 4 числа: ");
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int tmpValue = scanner.nextInt();
            System.out.println("число = " + tmpValue);
            sb.append(tmpValue);
            if (i != 3) {
                sb.append(" ");
            }
        }
        System.out.print(sb);
    }
}
