package com.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Shortest or longest

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list = input();
        int min = 0;
        int max = 0;
        String minVal = list.get(0);
        String maxVal = list.get(0);

        for(int i=0;i<list.size();i++) {

            if (minVal.length() > list.get(i).length()){
                minVal = list.get(i);
                min = i;
            }
            if (maxVal.length() < list.get(i).length()){
                maxVal = list.get(i);
                max = i;
            }
        }

        if (max<min){
            System.out.println(list.get(max));
        }
        else System.out.println(list.get(min));
    }

    public static ArrayList<String> input() throws Exception{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> string = new ArrayList<>();
        for(int i=0;i<10;i++){
            String s = r.readLine();
            string.add(s);
        }
        return string;
    }
}
