package com.codegym.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Flip the array

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] n = new int[10];
        for(int i=0;i<n.length;i++){
            n[i] = Integer.parseInt(r.readLine());
        }
        for(int i=9;i>=0;i--){
            System.out.println(n[i]);
        }
    }
}

