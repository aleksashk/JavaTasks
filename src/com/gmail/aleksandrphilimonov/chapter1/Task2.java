package com.gmail.aleksandrphilimonov.chapter1;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {47, 52, 150};
        StringBuilder sb = new StringBuilder();
        for (int value : array) {
            sb.append(value)
                    .append("  ");
        }
        sb.delete(sb.length() - 2, sb.length());
        System.out.println(sb);
    }
}
