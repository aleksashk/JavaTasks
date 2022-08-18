package com.gmail.aleksandrphilimonov.chapter1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.print("Введите имя: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вы ввели имя: " + scanner.nextLine());
    }
}
