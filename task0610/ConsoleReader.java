package com.codegym.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
ConsoleReader class

*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String input = r.readLine();
        return input;

    }

    public static int readInt() throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(r.readLine());
        return i;

    }

    public static double readDouble() throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        double i = Double.parseDouble(r.readLine());
        return i;

    }

    public static boolean readBoolean() throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String input = r.readLine();
        if (input.equals("true")){
            return true;
        }
        else return false;


    }

    public static void main(String[] args) {

    }
}
