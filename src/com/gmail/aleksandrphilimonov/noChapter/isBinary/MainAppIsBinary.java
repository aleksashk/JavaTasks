package com.gmail.aleksandrphilimonov.noChapter.isBinary;

//Дано целое число от 0 до Long.MAX
//Вывести на экран, может ли оно быть двоичным
//Пример:
//Если дано 1001 - вывести в консоль "Binary"
//Если дано 1004 - вывести в консоль "Not a Binary"

import java.util.Scanner;

public class MainAppIsBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long value = scanner.nextLong();
        long number = value;

        boolean isBinary = true;
        //10101 % 10 = 1
        //10101 / 10 = 1010

        while (number > 0){
            long digit = number % 10;
            if(digit > 1){
                isBinary = false;
                break;
            }
            number /= 10L;
        }
        System.out.println(isBinary ? value + " is a Binary" : "isn't a Binary");
    }
}
