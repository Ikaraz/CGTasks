package com.codegym.task.task07.task0720;

import sun.java2d.pipe.SolidTextRenderer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* 
Shuffled just in time

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        for(int i=0;i<n;i++){
            String s = reader.readLine();
            list.add(s);
        }

        for(int i=0;i<m;i++){
            list.add(n, list.get(0));
            list.remove(0);
        }

        for(String x: list){
            System.out.println(x);
        }


    }
}
