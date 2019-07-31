package com.codegym.task.task05.task0532;

import java.io.*;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int maximum = Integer.MIN_VALUE;

        if (n>0){
            for(int i=1;i<=n;i++){

                int a = Integer.parseInt(reader.readLine());
                if (maximum<=a){
                    maximum=a;
                }
            }
            System.out.println(maximum);
        }
    }
}
