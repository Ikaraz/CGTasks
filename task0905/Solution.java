package com.codegym.task.task09.task0905;

/* 
In the blue depths of the stack trace…

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDepth();

    }

    public static int getStackTraceDepth() {
        int stackTrace = Thread.currentThread().getStackTrace().length;
        System.out.println(stackTrace);
        return stackTrace;
    }
}

