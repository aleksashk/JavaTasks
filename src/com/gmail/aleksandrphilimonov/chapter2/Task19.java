package com.gmail.aleksandrphilimonov.chapter2;

import com.gmail.aleksandrphilimonov.chapter2.Utils.CalcXY;
import com.gmail.aleksandrphilimonov.chapter2.Utils.PrintValue;

import java.util.Scanner;

public class Task19 {

    private static final Scanner scanner = new Scanner(System.in);

    public void main(String[] args) {
        System.out.println("enter firstNumber and secondNumber: ");
        CalculationXY calculationXY = new CalculationXY(scanner.nextInt(), scanner.nextInt());
        calculationXY.calcX();
        calculationXY.calcY();
        calculationXY.printValueCalc();
    }

    static class CalculationXY implements CalcXY, PrintValue {

        private transient double X;
        private transient double Y;

        private transient final double a;
        private transient final double b;

        public CalculationXY(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public void calcX() {
            this.X = (2 / Math.pow(a, 2) + 25) / (Math.sqrt(b) + (a + b / 2));
        }

        @Override
        public void calcY() {
            this.Y = a + 2 * Math.sin(b) / 5.5 * a;
        }

        @Override
        public void printValueCalc() {
            System.out.println("x = " + X);
            System.out.println("y = " + Y);
        }
    }
}
