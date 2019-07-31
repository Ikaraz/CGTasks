package com.codegym.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Remove and insert

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            String s = r.readLine();
            list.add(i,s);
        }
        for(int i=0;i<13;i++){
            list.add(0,list.get(4));
            list.remove(5);
        }
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }
}
