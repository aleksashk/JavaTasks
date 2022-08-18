package com.gmail.aleksandrphilimonov.chapter1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextInt() + " – вот какое число Вы ввели");
    }
}