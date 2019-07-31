package com.codegym.task.task09.task0904;

/* 
Stack trace with 10 calls

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int stackTraceLength = method1().length - method10().length + 1;
//        System.out.println(method1().length);
//        System.out.println(method2().length);
//        System.out.println(method3().length);
//        System.out.println(method4().length);
//        System.out.println(method5().length);
//        System.out.println(method6().length);
//        System.out.println(method7().length);
//        System.out.println(method8().length);
//        System.out.println(method9().length);
//        System.out.println(method10().length);

    }

    public static StackTraceElement[] method1() {
        return method2();
    }

    public static StackTraceElement[] method2() {
        return method3();
    }

    public static StackTraceElement[] method3() {
        return method4();
    }

    public static StackTraceElement[] method4() {
        return method5();
    }

    public static StackTraceElement[] method5() {
        return method6();
    }

    public static StackTraceElement[] method6() {
        return method7();
    }

    public static StackTraceElement[] method7() {
        return method8();
    }

    public static StackTraceElement[] method8() {
        return method9();
    }

    public static StackTraceElement[] method9() {
        return method10();
    }

    public static StackTraceElement[] method10() {
        return Thread.currentThread().getStackTrace();
    }
}
