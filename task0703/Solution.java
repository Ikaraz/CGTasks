package com.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Lonely arrays interact

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        String[] stringInput = strings();
        int[] numbers = new int[10];

        for(int i=0;i<numbers.length;i++){
            numbers[i] = stringInput[i].length();
            System.out.println(numbers[i]);
        }


    }

    public static String[] strings() throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = new String[10];
        for (int i=0;i<inputs.length;i++){
            inputs[i] = r.readLine();
        }
        return inputs;
    }
}
