package com.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Min and max in arrays

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for(int i=0;i<20;i++){
            int s = Integer.parseInt(reader.readLine());
            array[i] = s;
        }
        Arrays.sort(array);

        int maximum = array[19];
        int minimum = array[0];

        System.out.print(maximum + " " + minimum);
    }
}
