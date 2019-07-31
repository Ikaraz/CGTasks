package com.codegym.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Duplicating words

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            String s = r.readLine();
            list.add(s);
        }

        ArrayList<String> result = doubleValues(list);

        for(String x:result){
            System.out.println(x);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> list1 = new ArrayList<>();
        for(String x:list){
            list1.add(x);
            list1.add(x);
        }
        return list1;
    }
}
