package com.gmail.aleksandrphilimonov.chapter1;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {31, 18, 79};
        StringBuilder sb = new StringBuilder();
        for (int value : array) {
            sb.append(value)
                    .append(" ");
        }
        sb.delete(sb.length() - 1, sb.length());
        System.out.println(sb);
    }
}
