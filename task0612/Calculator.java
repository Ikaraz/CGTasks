package com.codegym.task.task06.task0612;

/* 
Calculator

*/

public class Calculator {
    public static int plus(int a, int b) {
        int s=a+b;
        return s;
    }

    public static int minus(int a, int b) {
        int s=a-b;
        return s;
    }

    public static int multiply(int a, int b) {
        int s=a*b;
        return s;
    }

    public static double divide(int a, int b) {
        double i = a;
        double j = b;

        double s=i/j;
        return s;
    }

    public static double percent(int a, int b) {
        double i = a;
        double j = b;

        double s=i*j/100;
        return s;
    }

    public static void main(String[] args) {

    }
}