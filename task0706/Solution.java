package com.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Streets and houses

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] inputs = new int[15];
        int odd=0;
        int even=0;
        for (int i=0;i<inputs.length;i++){
            inputs[i] = Integer.parseInt(r.readLine());
            if(evenOdd(i) == 0){
                even+=inputs[i];
            }
            else if(evenOdd(i) != 0){
                odd+=inputs[i];
            }
        }
        if (odd < even){
            System.out.println("Even-numbered houses have more residents.");
        }
        else if (odd > even) {
            System.out.println("Odd-numbered houses have more residents.");
        }



    }

    public static int evenOdd(int i){
        int s = i%2;
        if(s==0){
            return 0;
        }
        return 1;
    }
}
