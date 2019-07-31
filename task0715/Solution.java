package com.codegym.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
More Sam-I-Am

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"Sam","I","Am");
        for(int i=1;i<=list.size();i+=2){
            list.add(i,"Ham");
        }
        for(String x : list){
            System.out.println(x);
        }
    }
}
