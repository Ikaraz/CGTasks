package com.codegym.task.task07.task0702;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
String array in reverse order

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] input = new String[10];
        for(int i=0;i<8;i++){
            input[i] = r.readLine();
        }

        for(int i=9;i>=0;i--){
            System.out.println(input[i]);
        }
    }


}