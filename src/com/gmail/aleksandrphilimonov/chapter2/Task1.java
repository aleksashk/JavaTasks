package com.gmail.aleksandrphilimonov.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c;
        double d, x1, x2;

        System.out.print("а = ");
        a = Integer.parseInt(br.readLine());

        System.out.print("b = ");
        b = Integer.parseInt(br.readLine());

        System.out.print("c = ");
        c = Integer.parseInt(br.readLine());

        System.out.println(a + "x2 + " + b + "x + " + c + " = 0");
        d = b * b - 4 * a * c;
        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1 + " x2 = " + x2);
        } else if (d == 0) {
            x1 = -b / (2. * a);
            System.out.println("x =" + x1);
        } else {
            System.out.println("Нет корней");
        }
    }
}

