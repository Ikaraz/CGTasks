package com.codegym.task.task09.task0902;

/* 
Stack trace revisited

*/

import javax.xml.bind.Element;

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        method2();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();

        //System.out.println("Method1"+ste[2].getMethodName());
        return ste[2].getMethodName();
    }

    public static String method2() {
        method3();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();

        //System.out.println("Method2"+ste[2].getMethodName());
        return ste[2].getMethodName();
    }

    public static String method3() {
        method4();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();

        //System.out.println("Method3"+ste[2].getMethodName());
        return ste[2].getMethodName();
    }

    public static String method4() {
        method5();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();

        //System.out.println("Method4"+ste[2].getMethodName());
        return ste[2].getMethodName();
    }

    public static String method5() {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();

        //System.out.println("Method5"+ste[2].getMethodName());
        return ste[2].getMethodName();
    }
}
