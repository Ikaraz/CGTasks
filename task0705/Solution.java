package com.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
One large array and two small ones

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] n = new int[20];
        int[] first = new int[10];
        int[] second = new int[10];

        for(int i=0;i<n.length;i++){
            n[i] = Integer.parseInt(r.readLine());
        }
        for(int i=0;i<10;i++){
            first[i] = n[i];
            int s =i+10;
            second[i] = n[s];
            System.out.println(second[i]);
        }

    }
}
