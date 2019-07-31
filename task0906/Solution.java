package com.codegym.task.task09.task0906;

/* 
Logging stack traces

*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        String method = ste[2].getMethodName();
        String classCall = ste[2].getClassName();
        System.out.println(classCall+": "+method+": "+s);
    }
}
