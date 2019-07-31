package com.codegym.task.task06.task0606;

import java.io.*;

/* 
Even and odd digits

*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(r.readLine());

        s=abs(s);
            while (s > 0) {

                int a = s % 10;
                remainder(a);

                s = s / 10;
            }
            System.out.println("Even: " + even + " Odd: " + odd);
    }

    public static int abs(int abs){
        if(abs<0){
            abs = -abs;
        }
        return abs;
    }

    public static void remainder(int r){

        if (r % 2 == 0){
            even++;
        }
        else odd++;
    }
}
