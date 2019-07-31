package com.codegym.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Maximum in an array

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int[] n = new int[20];
        for(int i=0;i<n.length;i++){

            n[i] = Integer.parseInt(r.readLine());
        }

        return n;
    }

    public static int max(int[] array) {

        int max = array[0];

        for(int i=0;i<array.length;i++){

            if (max < array[i]){
                max = array[i];
            }
        }

        return max;
    }
}
