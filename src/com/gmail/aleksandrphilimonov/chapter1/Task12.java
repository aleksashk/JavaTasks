package com.gmail.aleksandrphilimonov.chapter1;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.print("Введите имя: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет, " + scanner.nextLine() + "!");
    }
}
