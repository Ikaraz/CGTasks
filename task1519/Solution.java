package com.codegym.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.ParseException;

/* 
Different methods for different types

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while(true){
            input = r.readLine();
            if(input.equals("exit")) break;
            try {
                if (input.contains(".")) {
                    double i = Double.parseDouble(input);
                    print(i);
                }
                else if(!input.contains(".")) {
                    int a = Integer.parseInt(input);
                    if (0<a && a<128){
                        short as = (short) a;
                        print(as);
                    }
                    else print(a);
                }
            }
            catch (Exception e){
                print(input);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("This is a Double. Value: " + value);
    }

    public static void print(String value) {
        System.out.println("This is a String. Value: " + value);
    }

    public static void print(short value) {
        System.out.println("This is a short. Value: " + value);
    }

    public static void print(Integer value) {
        System.out.println("This is an Integer. Value: " + value);
    }
}
