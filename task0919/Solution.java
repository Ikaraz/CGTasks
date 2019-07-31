package com.codegym.task.task09.task0919;

/* 
Dividing by zero

*/

import javax.xml.bind.Element;

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        }
        catch(ArithmeticException e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
    public static void divideByZero(){
        int a = 100/0;
        System.out.println(a);
    }
    public static void printStackTrace(Throwable throwable){
        for(StackTraceElement e : throwable.getStackTrace()){
            System.out.println(e);
        }
    }

}

