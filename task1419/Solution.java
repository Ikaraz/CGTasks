package com.codegym.task.task14.task1419;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.List;

/* 
Exception invasion

*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   // The first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        exceptions.add(new IllegalAccessException());
        exceptions.add(new IllegalArgumentException());
        exceptions.add(new IllegalStateException());
        exceptions.add(new IllegalThreadStateException());
        exceptions.add(new RuntimeException());
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new ClassNotFoundException());
        exceptions.add(new InstantiationException());
        exceptions.add(new NoSuchFieldException());



    }
}
