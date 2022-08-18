package com.gmail.aleksandrphilimonov.chapter1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.print("Введите название футбольной команды: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine() + " – это чемпион!");
    }
}
